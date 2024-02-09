import model.Staff;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import common.DateUtils;
import data.SaleData;
import model.Occupation;
import model.Sale;

public class StaffService {
    public StaffService(){}
    private static final Double TWENTY_PERCENT = 0.2;
    private static final Double THIRTY_PERCENT = 0.3;

    /**
    "Um método que receba uma lista de funcionários, mês e ano e retorne o valor total
    pago (salário e benefício) a esses funcionários no mês".
     * @param listOfStaffs
     * @param date
     */
    public Double monthlyTotalCompensation(List<Staff> listOfStaffs, LocalDate date){
        Double currentTotalCompensationPayed = 0.00;

        for(Staff currentStaff : listOfStaffs){
            currentTotalCompensationPayed += calculateSalaryWithBenefits(currentStaff, date);
        };

        return currentTotalCompensationPayed;
    };

    /**
    "Um método que receba uma lista de funcionários, mês e ano e retorne o total pago
    somente em salários no mês".
     * @param listOfStaffs
     * @param date
     */
    public Double totalSalaryPaidInMonth(List<Staff> listOfStaffs, LocalDate date){
        Double currentTotalSalaryPaid = 0.00;

        for(Staff staff : listOfStaffs){currentTotalSalaryPaid += calculateSalary(staff, date);};

        return currentTotalSalaryPaid;
    }

    /**
    "Um método que receba uma lista somente com os funcionários que recebem
    benefícios, mês e ano e retorne o total pago em benefícios no mês.".
    * @param listOfStaffs
    * @param date
    */
    public Double totalBenefitsPaidOnMonth(List<Staff> listOfStaffs, LocalDate date){
        Double currentTotalBenefistPaidOnMonth = 0.00;
        
        for(Staff staff : listOfStaffs){
            if (staff.getRecivesBenefit()) {
                try {
                    currentTotalBenefistPaidOnMonth += calculateBenefit(staff, date);
                } catch (Exception e) {
                    throw new IllegalArgumentException(e.getMessage());
                }
            }
        };

        return currentTotalBenefistPaidOnMonth;
    };

    /**
    "Um método que receba uma lista de funcionários, mês e ano e retorne o que
    recebeu o valor mais alto no mês."
    * @param listOfStaffs
    * @param date
    */
    public Staff highestPaidEmployeeInMonth(List<Staff> listOfStaffs, LocalDate date){
        Staff highestPaid = null;

        for(Staff currentStaff : listOfStaffs){

            currentStaff.setFinalSalary(
                calculateSalaryWithBenefits(currentStaff, date)
            );

            System.out.println(currentStaff.getName() + " recebeu: " + currentStaff.getFinalSalary());
            
            if (highestPaid != null) {
                if(currentStaff.getFinalSalary() > highestPaid.getFinalSalary()){
                    highestPaid = currentStaff;
                }
            }else{
                highestPaid = currentStaff;
            }
        };

        return highestPaid;
    };

    private Double calculateSalaryWithBenefits(Staff staff, LocalDate date){
        staff.setFinalSalary(
            calculateSalary(staff, date)
        );

        Double valueOfBenefit = calculateBenefit(staff, date);

        return valueOfBenefit + staff.getFinalSalary();
    };

    private Double calculateSalary(Staff staff, LocalDate dateSource){
        Double initialSalary = staff.getOccupation().getInitialSalary();

        int yearsOfService = DateUtils.calculateYearsPassed(
            staff.getContractDate()
        );


        return initialSalary + calculateAnnualServiceBonus(staff.getOccupation(),yearsOfService);
    };

    private Double calculateBenefit(Staff staff, LocalDate dateSource){
        if(staff.getRecivesBenefit()){
            Double calculatedBenefit = 0.00;
            
            switch (staff.getOccupation()) {
                case SECRETARY:
                    try {
                        calculatedBenefit += getBenefitOfSecretary(staff, dateSource);
                    } catch (Exception e) {
                        throw new IllegalArgumentException(e.getMessage());
                    };
                    break;
                
                case SELLER:
                    try {
                        calculatedBenefit += getBenefitOfSeller(staff, dateSource);
                    } catch (Exception e) {
                        throw new IllegalArgumentException(e.getMessage());
                    }
                    break;
                default:
                    break;
            }

            return calculatedBenefit;
        }
        return 0.00;
    };

    private Double getBenefitOfSeller(Staff staff, LocalDate dateSource) throws Exception{
        if (staff.getOccupation().equals(Occupation.SELLER)) {
            Double sumOfBenefit = 0.00;

            List<Sale> registersSaleOfStaff = SaleData.getAllSales().stream()
            .filter(sale -> sale.getStaff().equals(staff))
            .collect(Collectors.toList());
    
            for(Sale registerSale : registersSaleOfStaff){
                if (registerSale.getDateOfSale().equals(dateSource)) {
                    sumOfBenefit += registerSale.getValueOfSale()*THIRTY_PERCENT;
                }
            }
    
            return sumOfBenefit;
        }else{
            throw new IllegalArgumentException("Somente um vendedor pode realizar essa operação");
        }
    };
    
    private Double getBenefitOfSecretary(Staff staff, LocalDate dateSource) throws Exception{
        if (staff.getOccupation().equals(Occupation.SECRETARY)) {
            return staff.getFinalSalary()*TWENTY_PERCENT;   
        }else{
            throw new IllegalArgumentException("Somente um secretário pode realizar essa operação");
        }
    };

    private Double calculateAnnualServiceBonus(Occupation occupation, int yearsOfService){
        return occupation.getValueOfTheYearOfService()*yearsOfService;
    }
}



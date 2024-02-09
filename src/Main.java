import data.SaleData;
import data.StaffData;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;

import common.DateUtils;
import common.StringUtils;
import model.Occupation;
import model.Staff;

public class Main {
    public static void main(String[] args) throws Exception {
        StaffService staffService = new StaffService();
        List<Staff> dataStaff = StaffData.getAllStaffRegisters();

        LocalDate dateInput = LocalDate.of(2022, Month.JANUARY, 1);
        String formattedDate = DateUtils.formatBrazilianDate(dateInput.toString());

        List<Staff> staffsWithBenefit = dataStaff.stream()
                .filter(staff -> staff.getRecivesBenefit())
                .collect(Collectors.toList());

        List<Staff> sellers = staffsWithBenefit.stream()
        .filter(staff -> staff.getOccupation().equals(Occupation.SELLER))
        .collect(Collectors.toList());
        

        StringUtils.writeOutput(
            "Valor total pago:  R$", staffService.monthlyTotalCompensation(dataStaff, dateInput).toString(), 
            "Para a data -> ",formattedDate );

        StringUtils.writeOutput(
            "Valor total pago somente em salarios: R$", staffService.totalSalaryPaidInMonth(dataStaff, dateInput).toString(), 
            "Para a data -> ", formattedDate );

        StringUtils.writeOutput(
            "Valor total pago somente em benefícios: R$", staffService.totalBenefitsPaidOnMonth(staffsWithBenefit, dateInput).toString(), 
            "Para a data -> ", formattedDate );

        StringUtils.writeOutput(
            "Funcionario com valor mais alto de pagamento: ", staffService.findHighestPaidEmployee(dataStaff, dateInput).getName(), 
            "Para a data -> ", formattedDate );

        StringUtils.writeOutput(
            "Funcionario com maior ganho de beneficios no mes: ", staffService.findNameOfStaffWithHighestBenefits(staffsWithBenefit, dateInput), 
            "Para a data -> ", formattedDate );

        StringUtils.writeOutput(
            "Vendedor(a) com maior registro de vendas: ", staffService.findTopSellingVendor(sellers, dateInput).getName(), 
            "Para a data -> ", formattedDate );
        

    };
};

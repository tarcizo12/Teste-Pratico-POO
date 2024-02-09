import data.SaleData;
import data.StaffData;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;

import model.Occupation;
import model.Staff;

public class Main {
    public static void main(String[] args) throws Exception {
        StaffService staffService = new StaffService();

        List<Staff> dataStaff = StaffData.getAllStaffRegisters();
        LocalDate dataInput = LocalDate.of(2021, Month.JANUARY, 1);

        List<Staff> staffsWithBenefit = dataStaff.stream()
                .filter(staff -> staff.getRecivesBenefit())
                .collect(Collectors.toList());

        List<Staff> sellers = staffsWithBenefit.stream()
        .filter(staff -> staff.getOccupation().equals(Occupation.SELLER))
        .collect(Collectors.toList());
        
        // System.out.println(
        //     staffService.monthlyTotalCompensation(dataStaff, dataInput)
        // );

        // System.out.println(
        //     staffService.totalSalaryPaidInMonth(dataStaff,dataInput)
        // );

        // System.out.println(
        //     staffService.totalBenefitsPaidOnMonth(staffsWithBenefit,dataInput)
        // );

        // System.out.println(
        //     staffService.findHighestPaidEmployee(dataStaff, dataInput)
        // );

        // System.out.println(
        //     staffService.findNameOfStaffWithHighestBenefits(dataStaff, dataInput)
        // );

        
        System.out.println(
            staffService.findTopSellingVendor(sellers, dataInput)
        );
        
    };
};

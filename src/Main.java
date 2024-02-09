import data.SaleData;
import data.StaffData;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;

import model.Sale;
import model.Staff;

public class Main {
    public static void main(String[] args) throws Exception {
        StaffService staffService = new StaffService();

        List<Staff> dataStaff = StaffData.getAllStaffRegisters();
        List<Sale> dataSale = SaleData.getAllSales();
        LocalDate dataInput = LocalDate.of(2021, Month.JANUARY, 1);

        List<Staff> staffsWithBenefit = dataStaff.stream()
                .filter(staff -> staff.getRecivesBenefit())
                .collect(Collectors.toList());
        
        System.out.println(
            staffService.monthlyTotalPaymentValue(dataStaff, dataInput)
        );
    }
}

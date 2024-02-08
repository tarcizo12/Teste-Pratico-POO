import data.SaleData;
import data.StaffData;
import java.util.List;

import model.Sale;
import model.Staff;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Staff> dataStaff = StaffData.getAllStaffRegisters();
        List<Sale> saleStaff = SaleData.getAllSales();

        for(Sale sale : saleStaff){
            System.out.println(
                "vendedor: " + sale.getStaff().getName() + "\n" 
                +"valor da venda: "+ sale.getValueOfSale());
        }

        System.out.println("\n"+"\n");
        
        for(Staff staff : dataStaff){
            String reciveBenefit = staff.getRecivesBenefit() ? "Sim" : "Não";
            System.out.println(staff.getName() + "recebe beneficio?  " + reciveBenefit);
        }
    }
}

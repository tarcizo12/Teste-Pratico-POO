import data.StaffData;
import java.util.List;
import model.Staff;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Staff> data = StaffData.getAllStaffRegisters();

        for(Staff staff : data){
            System.out.println(staff.getOccupation().getname());
        }
    }
}

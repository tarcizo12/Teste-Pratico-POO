package data;

import model.Staff;
import model.Occupation;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum StaffData {
    JORGE_CARVALHO(
        new Staff("Jorge Carvalho", Occupation.SECRETARY, LocalDate.of(2018, Month.JANUARY, 1))
    ),
    MARIA_SOUZA(
        new Staff("Maria Souza", Occupation.SECRETARY, LocalDate.of(2015, Month.DECEMBER, 12))
    ),
    ANA_SILVA(
        new Staff("Ana Silva", Occupation.SELLER, LocalDate.of(2021, Month.DECEMBER, 12))
    ),
    JOAO_MENDES(
        new Staff("João Mendes", Occupation.SELLER, LocalDate.of(2021, Month.DECEMBER,12))
    ),
    JULIANA_ALVES(
        new Staff("Juliana Alves", Occupation.MANAGER, LocalDate.of(2017, Month.JULY,7))
    ),
    BENTO_ALBION(
        new Staff("Bento Albino", Occupation.MANAGER, LocalDate.of(2014, Month.MARCH,3))
    );

    private Staff staff;

    private StaffData(Staff staff) {
        this.staff = staff;
    }
    
    public Staff getStaffData(){
        return this.staff;
    }

    public static List<Staff> getAllStaffRegisters(){
        List<Staff> returnList = new ArrayList<>();
        List<StaffData> allRegisters = Arrays.asList((values()));

        for(StaffData staffData : allRegisters){
            returnList.add(staffData.getStaffData());
        };

        return returnList;
    }

}

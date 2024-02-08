package data;

import model.Occupation;
import model.Sale;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum SaleData {
    ANA_SILVA_DEZ_2021(
        new Sale(5200.0, StaffData.ANA_SILVA.getStaffData(), LocalDate.of(2021, Month.DECEMBER, 1))
    ),
    ANA_SILVA_JAN_2022(
        new Sale(4000.0, StaffData.ANA_SILVA.getStaffData(), LocalDate.of(2022, Month.JANUARY, 1))
    ),
    ANA_SILVA_FEV_2022(
        new Sale(4200.0, StaffData.ANA_SILVA.getStaffData(), LocalDate.of(2022, Month.FEBRUARY, 1))
    ),
    ANA_SILVA_MAR_2022(
        new Sale(5850.0, StaffData.ANA_SILVA.getStaffData(), LocalDate.of(2022, Month.MARCH, 1))
    ),
    ANA_SILVA_ABR_2022(
        new Sale(7000.0, StaffData.ANA_SILVA.getStaffData(), LocalDate.of(2022, Month.APRIL, 1))
    ),
    JOAO_MENDES_DEZ_2021(
        new Sale(3400.0, StaffData.JOAO_MENDES.getStaffData(), LocalDate.of(2021, Month.DECEMBER, 1))
    ),
    JOAO_MENDES_JAN_2022(
        new Sale(7700.0, StaffData.JOAO_MENDES.getStaffData(), LocalDate.of(2022, Month.JANUARY, 1))
    ),
    JOAO_MENDES_FEV_2022(
        new Sale(5000.0, StaffData.JOAO_MENDES.getStaffData(), LocalDate.of(2022, Month.FEBRUARY, 1))
    ),
    JOAO_MENDES_MAR_2022(
        new Sale(5900.0, StaffData.JOAO_MENDES.getStaffData(), LocalDate.of(2022, Month.MARCH, 1))
    ),
    JOAO_MENDES_ABR_2022(
        new Sale(6500.0, StaffData.JOAO_MENDES.getStaffData(), LocalDate.of(2022, Month.APRIL, 1))
    );

    private Sale sale;

    SaleData(Sale sale) {
        if (sale.getStaff().getOccupation().equals(Occupation.SELLER)) {
            this.sale = sale;
        };
    }

    public Sale getSaleData() {
        return this.sale;
    }

    public static List<Sale> getAllSales() {
        List<Sale> returnList = new ArrayList<>();
        List<SaleData> allSales = Arrays.asList(values());

        for (SaleData saleData : allSales) {
            returnList.add(saleData.getSaleData());
        }

        return returnList;
    }
}

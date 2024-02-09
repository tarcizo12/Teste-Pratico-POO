package data;

import model.Occupation;
import model.Sale;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import common.DateUtils;


public enum SaleData {
    ANA_SILVA_DEZ_2021(createSale(5200.0, StaffData.ANA_SILVA, 2021, Month.DECEMBER)),
    ANA_SILVA_JAN_2022(createSale(4000.0, StaffData.ANA_SILVA, 2022, Month.JANUARY)),
    ANA_SILVA_FEV_2022(createSale(4200.0, StaffData.ANA_SILVA, 2022, Month.FEBRUARY)),
    ANA_SILVA_MAR_2022(createSale(5850.0, StaffData.ANA_SILVA, 2022, Month.MARCH)),
    ANA_SILVA_ABR_2022(createSale(7000.0, StaffData.ANA_SILVA, 2022, Month.APRIL)),
    JOAO_MENDES_DEZ_2021(createSale(3400.0, StaffData.JOAO_MENDES, 2021, Month.DECEMBER)),
    JOAO_MENDES_JAN_2022(createSale(7700.0, StaffData.JOAO_MENDES, 2022, Month.JANUARY)),
    JOAO_MENDES_FEV_2022(createSale(5000.0, StaffData.JOAO_MENDES, 2022, Month.FEBRUARY)),
    JOAO_MENDES_MAR_2022(createSale(5900.0, StaffData.JOAO_MENDES, 2022, Month.MARCH)),
    JOAO_MENDES_ABR_2022(createSale(6500.0, StaffData.JOAO_MENDES, 2022, Month.APRIL));

    public Sale getSale() {
        return sale;
    }

    private static Sale createSale(double amount, StaffData staffData, int year, Month month) {
        return new Sale(amount, staffData.getStaffData(), DateUtils.lastDayOfMonth(year, month));
    }

    private Sale sale;

    private SaleData(Sale sale) {
        if (sale.getStaff().getOccupation().equals(Occupation.SELLER)) {
            this.sale = sale;
        }else{
            throw new IllegalArgumentException("Somente um vendedor pode realizar esse registro");
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

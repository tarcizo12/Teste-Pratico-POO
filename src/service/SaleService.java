import data.SaleData;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import model.Sale;
import model.Staff;
import common.DateUtils;

public class SaleService {
    public Map<Staff, Double> resumeOfSales(LocalDate dateSource){
        Map<Staff, Double> resumeMap = new HashMap<>();

        List<Sale> dataSale = SaleData.getAllSales();

        for(Sale sale : dataSale){
            Double saleValue = sale.getValueOfSale();
            
            if (resumeMap.containsKey(resumeMap)) {
                if (DateUtils.areMonthsAndYearsEqual(sale.getDateOfSale(), dateSource) ) {
                    resumeMap.put(sale.getStaff(), resumeMap.get(sale.getStaff()) + saleValue);
                };
            } else {
                resumeMap.put(sale.getStaff(), saleValue);
            }
        };

        return resumeMap;
    } 
}

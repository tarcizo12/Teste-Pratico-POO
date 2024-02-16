import data.SaleData;
import java.util.stream.Collectors;
import java.util.List;
import model.Sale;
import common.DateUtils;
import java.time.LocalDate;

public class SaleService {
    public List<Sale> resumeOfSales(LocalDate dateSource){

        List<Sale> dataSale = SaleData.getAllSales().stream()
        .filter(e->DateUtils.areMonthsAndYearsEqual(e.getDateOfSale(), dateSource)).collect(Collectors.toList());

        return dataSale;
    } 
}

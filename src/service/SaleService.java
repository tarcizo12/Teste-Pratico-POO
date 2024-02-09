import data.SaleData;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import model.Sale;
import model.Staff;

public class SaleService {
    public Map<Staff, Double> resumeOfSales(){
        Map<Staff, Double> resumeMap = new HashMap<>();

        List<Sale> dataSale = SaleData.getAllSales();

        for(Sale sale : dataSale){
            Double saleValue = sale.getValueOfSale();
            
            // Verificar se a chave já está presente no resumo
            if (resumeMap.containsKey(resumeMap)) {
                // Se sim, adicionar o valor da venda atual ao valor existente
                resumeMap.put(sale.getStaff(), resumeMap.get(sale.getStaff()) + saleValue);
            } else {
                // Se não, adicionar uma nova entrada ao resumo
                resumeMap.put(sale.getStaff(), saleValue);
            }
        };

        return resumeMap;
    } 
}

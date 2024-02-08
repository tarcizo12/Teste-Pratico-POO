package model;

import java.time.LocalDate;

public class Sale {
    private Double valueOfSale;
    private Staff  staff;
    private LocalDate dateOfSale;
    
    public Double getValueOfSale() {
        return valueOfSale;
    }
    public void setValueOfSale(Double valueOfSale) {
        this.valueOfSale = valueOfSale;
    }
    public Staff getStaff() {
        return staff;
    }
    public void setStaff(Staff staff) {
        this.staff = staff;
    }
    public LocalDate getDateOfSale() {
        return dateOfSale;
    }
    public void setDateOfSale(LocalDate dateOfSale) {
        this.dateOfSale = dateOfSale;
    }
    
    public Sale(Double valueOfSale, Staff staff, LocalDate dateOfSale) {
        this.valueOfSale = valueOfSale;
        this.staff = staff;
        this.dateOfSale = dateOfSale;
    }

    
}

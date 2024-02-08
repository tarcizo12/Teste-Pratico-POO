package model;

import java.time.LocalDate;

public class Staff {
    private String name;
    private Occupation occupation;
    private Double finalSalary;
    private LocalDate contractDate;

    public Staff(String name, Occupation occupation, LocalDate contractDate ) {
        this.name = name;
        this.occupation = occupation;
        this.contractDate = contractDate;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Occupation getOccupation() {
        return occupation;
    }
    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }
    public Double getFinalSalary() {
        return finalSalary;
    }
    public void setFinalSalary(Double finalSalary) {
        this.finalSalary = finalSalary;
    }
    public LocalDate getContractDate() {
        return contractDate;
    }
    public void setContractDate(LocalDate contractDate) {
        this.contractDate = contractDate;
    }

}



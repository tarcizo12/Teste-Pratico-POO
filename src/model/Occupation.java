package model;

import java.util.Arrays;
import java.util.List;

public enum Occupation {
    SECRETARY(1, "Secretary", 7000.00, 1000.00),
    SELLER(2, "Seller", 12000.00, 1800.00),
    MANAGER(3, "Manager", 20000.00, 3000.00);

    private int id;
    private String name;
    private Double initialSalary;
    private Double valueOfTheYearOfService;

    private Occupation() {}

    private Occupation(int id, String name, Double initialSalary, Double valueOfTheYearOfService) {
        this.id = id;
        this.name = name;
        this.initialSalary = initialSalary;
        this.valueOfTheYearOfService = valueOfTheYearOfService;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    };

    public static List<Occupation> getAllTypes() {
        return Arrays.asList((values()));
    }

    public static Occupation getById(Integer id) {
        if (id == null) {
            return null;
        }

        for (Occupation item : values()) {
            if (item.id == id.intValue()) {
                return item;
            }
        }

        return null;
    }

    public Double getInitialSalary() {
        return initialSalary;
    }

    public Double getValueOfTheYearOfService() {
        return valueOfTheYearOfService;
    }

    public void setValueOfTheYearOfService(Double valueOfTheYearOfService) {
        this.valueOfTheYearOfService = valueOfTheYearOfService;
    };

    
}

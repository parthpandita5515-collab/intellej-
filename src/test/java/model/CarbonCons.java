package model;

public class Carbon {

    private Long id;
    private double electricityKwh;
    private double petrolLiters;
    private double wasteKg;

    public Carbon(Long id, double electricityKwh, double petrolLiters, double wasteKg) {
        this.id = id;
        this.electricityKwh = electricityKwh;
        this.petrolLiters = petrolLiters;
        this.wasteKg = wasteKg;
    }
}

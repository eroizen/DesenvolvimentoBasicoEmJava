package Employees;

public class Manager extends Employee{
    public Double calcTaxes(){
        return getPayment() * 0.001; //0,1%
    }
}

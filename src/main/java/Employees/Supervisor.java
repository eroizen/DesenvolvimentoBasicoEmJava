package Employees;

public class Supervisor extends Employee{
    public Double calcTaxes(){
        return getPayment() * 0.0005; //0,05%
    }
}

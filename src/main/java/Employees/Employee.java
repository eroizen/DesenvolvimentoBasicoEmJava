package Employees;

public abstract class Employee {
    private Double Payment;


    public Double getPayment() {
        return Payment;
    }

    public void setPayment(Double payment) {
        Payment = payment;
    }


    public Double calcTaxes(){
        return Payment * 0.0001; //0,01%
    }
}

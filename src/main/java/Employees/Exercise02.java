package Employees;

public class Exercise02 {
    public static void main(String[] args) {
    Manager gerente = new Manager();
    gerente.setPayment(15000.00);

    Supervisor supervisor = new Supervisor();
    supervisor.setPayment(8000.00);

    Clerk atendente = new Clerk();
    atendente.setPayment(2000.00);

    System.out.println("O salário de GERENTE é de R$"+gerente.getPayment()+"  com impostos pagos de R$"+gerente.calcTaxes());
    System.out.println("O salário de SUPERVISOR é de R$"+supervisor.getPayment()+"  com impostos pagos de R$"+supervisor.calcTaxes());
    System.out.println("O salário de ATENDENTE é de R$"+atendente.getPayment()+"  com impostos pagos de R$"+atendente.calcTaxes());
    }
}

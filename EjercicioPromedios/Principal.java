public class Principal {
    public static void main (String []args) {
        Banco banc = new Banco();
        CuentaBancaria c1 = new CuentaBancaria(100);
        CuentaBancaria c2 = new CuentaBancaria(200);
        CuentaBancaria c3 = new CuentaBancaria(300);
        banc.agregaCuenta(c1);
        banc.agregaCuenta(c2);
        banc.agregaCuenta(c3);
        System.out.println(banc.calculaPromedioCuentas());
    }
}
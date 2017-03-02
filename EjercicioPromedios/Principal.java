public class Principal {
    public static void main (String []args) {
        
        Banco banc = new Banco();
        CuentaBancaria c1 = new CuentaBancaria(100);
        CuentaBancaria c2 = new CuentaBancaria(200);
        CuentaBancaria c3 = new CuentaBancaria(300);
        banc.agregaCuenta(c1);
        banc.agregaCuenta(c2);
        banc.agregaCuenta(c3);
        System.out.println("Saldo promedio = " + banc.calculaPromedioCuentas());
        
        Planeta planet = new Planeta();
        Pais p1 = new Pais(25000000);
        Pais p2 = new Pais(32000000);
        Pais p3 = new Pais(94000000);
        planet.agregaPais(p1);
        planet.agregaPais(p2);
        planet.agregaPais(p3);
        System.out.println("Promedio de habitantes = " + planet.promedio());
    }
}

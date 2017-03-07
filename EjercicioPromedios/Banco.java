import java.util.ArrayList;
public class Banco {
    private ArrayList<CuentaBancaria> cuentas;
    
    public Banco () {
        cuentas = new ArrayList<CuentaBancaria>();
    }
    
    public void agregaCuenta (CuentaBancaria account) {
        cuentas.add(account);
    }
    
    public float calculaPromedio () {
        Utileria.calculaPromedio(cuentas);
    }
}

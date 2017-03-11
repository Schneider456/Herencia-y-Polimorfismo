import java.util.ArrayList;
public class Banco {
    private ArrayList<CuentaBancaria> cuentas;
    
    public Banco () {
        cuentas = new ArrayList<CuentaBancaria>();
        CuentaBancaria []arrCuentas;
    }
    
    public void agregaCuenta (CuentaBancaria account) {
        cuentas.add(account);
    }
    
    public float calculaPromedio () {
        return Utileria.calculaPromedio(arrCuentas);
    }
    
}

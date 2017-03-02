import java.util.ArrayList;
public class Banco {
    private ArrayList<CuentaBancaria> cuentas;
    
    public Banco () {
        cuentas = new ArrayList<CuentaBancaria>();
    }
    
    public void agregaCuenta (CuentaBancaria account) {
        cuentas.add(account);
    }
    
    public float calculaPromedioCuentas () {
        float prom = 0;
        for (int i = 0; i < cuentas.size(); i++) {
            CuentaBancaria aux = cuentas.get(i);
            prom+=aux.dimeSaldo();
        }
        prom/=cuentas.size();
        return prom;
    }
}

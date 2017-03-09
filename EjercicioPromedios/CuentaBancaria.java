<<<<<<< HEAD
public class CuentaBancaria {
    private int saldo;
    
    public CuentaBancaria (int sald) {
        saldo = sald;
    }
    
    public int dimeSaldo () {
        return saldo;
    }
}
=======
public class CuentaBancaria implements Medible{
    private int saldo;
    
    public CuentaBancaria (int s) {
        saldo = s;
    }
    
    public int obtenerMedida () {
        return saldo;
    }
}
>>>>>>> origin/master

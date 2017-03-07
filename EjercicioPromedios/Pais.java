public class Pais implements Medible{
    private int habitantes;
    
    public Pais (int hab) {
        habitantes = hab;
    }
    
    public int obtenerMedida () {
        return habitantes;
    }
}

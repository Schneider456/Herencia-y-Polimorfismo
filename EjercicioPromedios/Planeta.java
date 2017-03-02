import java.util.ArrayList;
public class Planeta {
    private ArrayList<Pais> paises;
    
    public Planeta () {
        paises = new ArrayList<Pais>();
    }
    
    public void agregaPais (Pais pais) {
        paises.add(pais);
    }
    
    public int promedio () {
        int prom = 0;
        for (int i = 0; i < paises.size(); i++) {
            Pais aux = paises.get(i);
            prom+=aux.dimeHabitantes();
        }
        prom/=paises.size();
        return prom;
    }
}

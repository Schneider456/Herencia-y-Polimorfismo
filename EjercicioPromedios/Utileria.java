import java.util.ArrayList;

public class Utileria {
   public static float calculaPromedio (ArrayList<Medible> coleccion) {
       float suma = 0;
       
       for (Medible obj : coleccion) {
           suma += obj.obtenerMedida();
        }
        if (coleccion.size() > 0) {
            return suma / coleccion.size();
        } else {
            return 0;
        }
    }
}

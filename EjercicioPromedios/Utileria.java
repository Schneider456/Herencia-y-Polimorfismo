import java.util.ArrayList;

public class Utileria {
   public static float calculaPromedio (Medible []coleccion) {
       float suma = 0;
       
       for (Medible obj : coleccion) {
           suma += obj.obtenerMedida();
        }
        if (coleccion.length > 0) {
            return suma / coleccion.length;
        } else {
            return 0;
        }
    }
}

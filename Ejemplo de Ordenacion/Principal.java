import java.util.ArrayList;
import java.util.Arrays;

public class Principal {
    public static void main (String []args) {
        ArrayList<Alumno> alumnos;
        
        alumnos = new ArrayList<Alumno>();
        
        alumnos.add(new Alumno(150));
        alumnos.add(new Alumno(180));
        alumnos.add(new Alumno(125));
        alumnos.add(new Alumno(205));
        alumnos.add(new Alumno(190));
        
        Alumno []arrAlumnos;
        arrAlumnos = new Alumno[alumnos.size()];
        
        arrAlumnos = alumnos.toArray(arrAlumnos);
        Arrays.sort(arrAlumnos);
        
        System.out.println("Contenido del ArrayLIst");
        for (Alumno alu : alumnos) {
            System.out.println(alu);
        }
        
        System.out.println("Contenido del arreglo");
        for (Alumno alu : arrAlumnos) {
            System.out.println(alu);
        }
    }
}

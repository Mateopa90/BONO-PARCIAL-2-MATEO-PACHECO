package Main;

import Datos.Finca_Raiz;
import Datos.Persona;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Parcial_2 {

    public static void main(String[] args) {
        Finca_Raiz f = new Finca_Raiz();

        while (true) {
            System.out.println("*******Bienvenido a su empresa de Finca Raíz********");
            System.out.println("***** Elija la actividad que desea desarrollar *****");

            System.out.println(" -  1. Añadir local comercial");
            System.out.println(" -  2. Añadir oficina");
            System.out.println(" -  3. Añadir piso");
            System.out.println(" -  4. Añadir edificio");
            System.out.println(" -  5. Añadir persona");
            System.out.println(" -  6. Eliminar una oficina");
            System.out.println(" -  7. Eliminar un piso");
            System.out.println(" -  8. Eliminar un edificio");
            System.out.println(" -  9. Eliminar un local comercial");
            System.out.println(" - 10. Mostrar inventario completo de inmuebles");

            Scanner entrada = new Scanner(System.in);
            int opcion;
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del barrio: ");
                    String barrioLocal = entrada.next();
                    System.out.println("Ingrese el estrato: ");
                    int estratoLocal = entrada.nextInt();
                    System.out.println("Ingrese el valor del arriendo: ");
                    double valorArriendoLocal = entrada.nextDouble();
                    System.out.println("Ingrese el área construida: ");
                    double areaConsLocal = entrada.nextDouble();
                    System.out.println("Si el local se encuentra disponible para su alquiler, digite true, en caso contrario, digite false");
                    boolean dispLocal = entrada.nextBoolean();
                    System.out.println("Si el local se encuentra cerca a una via principal, digite true, en caso contrario, digite false");
                    boolean via = entrada.nextBoolean();
                    System.out.println("Ingrese una descripción breve del local: ");
                    String desc = entrada.next();
                    f.addLocalComercial(desc, via, barrioLocal, estratoLocal, valorArriendoLocal, areaConsLocal, dispLocal);
                    break;

                case 2:
                    System.out.println("Ingrese el nombre del barrio: ");
                    String nombreBarrioOfi = entrada.next();
                    System.out.println("Ingrese el estrato: ");
                    int estratoOfi = entrada.nextInt();
                    System.out.println("Ingrese el valor del arriendo: ");
                    double valorArriendoOfi = entrada.nextDouble();
                    System.out.println("Ingrese el área construida: ");
                    double areaConsOfi = entrada.nextDouble();
                    System.out.println("Si el local se encuentra disponible para su alquiler, digite true, en caso contrario, digite false");
                    boolean dispOfi = entrada.nextBoolean();
                    System.out.println("Ingrese el tipo de Oficina: ");
                    String tipoOficina = entrada.next();
                    f.addOficina(tipoOficina, nombreBarrioOfi, estratoOfi, valorArriendoOfi, areaConsOfi, dispOfi);
                    break;

                case 3:
                    System.out.println("Ingrese el nombre del barrio: ");
                    String nombreBarrioPiso = entrada.next();
                    System.out.println("Ingrese el estrato: ");
                    int estratoPiso = entrada.nextInt();
                    System.out.println("Ingrese el valor del arriendo: ");
                    double valorArriendoPiso = entrada.nextDouble();
                    System.out.println("Ingrese el área construida: ");
                    double areaConsPiso = entrada.nextDouble();
                    System.out.println("Si el local se encuentra disponible para su alquiler, digite true, en caso contrario, digite false");
                    boolean dispPiso = entrada.nextBoolean();
                    System.out.println("Ingrese el numero de Oficinas: ");
                    int numOficinas = entrada.nextInt();
                    System.out.println("Ingrese el área total del piso: ");
                    double aTotal = entrada.nextDouble();
                    f.addPiso(numOficinas, aTotal, nombreBarrioPiso, estratoPiso, valorArriendoPiso, areaConsPiso, dispPiso);
                    break;

                case 4:
                    System.out.println("Ingrese el nombre del barrio: ");
                    String nombreBarrioE = entrada.next();
                    System.out.println("Ingrese el estrato: ");
                    int estratoE = entrada.nextInt();
                    System.out.println("Ingrese el valor del arriendo: ");
                    double valorArriendoE = entrada.nextDouble();
                    System.out.println("Ingrese el área construida: ");
                    double areaConsE = entrada.nextDouble();
                    System.out.println("Si el local se encuentra disponible para su alquiler, digite true, en caso contrario, digite false");
                    boolean dispE = entrada.nextBoolean();
                    System.out.println("Ingrese información del Propietario: ");
                    String prop = entrada.next();
                    f.addEdificio(prop, nombreBarrioE, estratoE, valorArriendoE, areaConsE, dispE);
                    break;

                case 5:
                    System.out.println("Ingrese el nombre de la persona: ");
                    String nombre = entrada.next();
                    System.out.println("Ingrese el documento de identidad: ");
                    int documento = entrada.nextInt();
                    System.out.println("Ingrese la edad de la persona: ");
                    int edad = entrada.nextInt();
                    System.out.println("Ingrese el sexo de la persona: ");
                    String sexo = entrada.next();
                    System.out.println("Si la persona cuenta con una nómina, digite true, en caso contrario, dijite false");
                    boolean nomina = entrada.nextBoolean();
                    System.out.println("Si la persona cuenta con un aval bancario, digite true, en caso contrario, dijite false");
                    boolean avalBancario = entrada.nextBoolean();
                    System.out.println("Si la persona cuenta con un contrato de trabajo, digite true, en caso contrario, dijite false");
                    boolean contratoTrabajo = entrada.nextBoolean();
                    System.out.println("Si la persona cuenta con un aval de una persona que cumpla con los requisitos, digite true, en caso contrario, dijite false");
                    boolean avalPersona = entrada.nextBoolean();
                    Persona a = new Persona(nombre, documento, edad, sexo, nomina, avalBancario, contratoTrabajo, avalPersona);
                    f.addCliente(a);
                    break;
                    

                case 6:
                    System.out.println("Ingrese el número de registro de la oficina que desea eliminar. En caso de que no lo recuerde, consulte el inventario"
                            + "para evitar posibles inconvenientes");
                    int kOfi = entrada.nextInt();
                    f.eliminarOficina(kOfi);
                    break;

                case 7:
                    System.out.println("Ingrese el número de registro del piso que desea eliminar. En caso de que no lo recuerde, consulte el inventario"
                            + "para evitar posibles inconvenientes");
                    int kPiso = entrada.nextInt();
                    f.eliminarPiso(kPiso);
                    break;

                case 8:
                    System.out.println("Ingrese el número de registro del edificio que desea eliminar. En caso de que no lo recuerde, consulte el inventario"
                            + "para evitar posibles inconvenientes");
                    int kEdif = entrada.nextInt();
                    f.eliminarEdificio(kEdif);
                    break;

                case 9:
                   System.out.println("Ingrese el número de registro del local que desea eliminar. En caso de que no lo recuerde, consulte el inventario"
                            + "para evitar posibles inconvenientes");
                    int kLocal = entrada.nextInt();
                    f.eliminarLocal(kLocal);
                    break;

                case 10:
                    f.consultarInventarios();
                    break;
     
                default:
                    System.out.println("Error");
                    JOptionPane.showMessageDialog(null, "No Es Permitida Esa Opcion", "Error",JOptionPane.ERROR_MESSAGE);
                    break;

            }

        }
    }
}

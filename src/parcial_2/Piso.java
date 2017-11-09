package parcial_2;

import java.util.ArrayList;

public class Piso extends Inmueble {
    
    private int numeroOficinas;
    private double area;
    private ArrayList <Oficina> oficinas;

    public Piso(int numeroOficinas, double area, String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible) {
        super(nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        this.numeroOficinas = numeroOficinas;
        this.area = area;
        this.oficinas = new ArrayList<>();
    }
    
    public void agregarOficina (String tipoOficina, String nombreBarrio, int estrato, double valorArriendo, double areaConstruida, boolean disponible){
        Oficina o = new Oficina(tipoOficina, nombreBarrio, estrato, valorArriendo, areaConstruida, disponible);
        oficinas.add(o);
    } 
    
    @Override
    public String darInformacion(){
        String info = "Nombre del Barrio: " + this.nombreBarrio + "\n" + 
                "Estrato: " + this.estrato + "\n" + 
                "Valor Arriendo: " + this.valorArriendo + "\n" + 
                "Área construida: " + this.areaConstruida + "\n" + 
                "Disponible: " + this.disponible + "\n" + 
                "Número de Oficinas: " + this.numeroOficinas;
        return info;
    }     
    
    
    
}

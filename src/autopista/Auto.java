package autopista;

public class Auto {

    //Atributos == Características
    public String color;
    public String tamanio;
    public String modelo;
    public int anio;
    public String marca;

    /************
    //Métodos
    *************/


    //Constructores
    //Poner valor inicial sin retornar nada

    //Con atributos por defecto
    public void Auto(){
        this.color="";
        this.tamanio="";
        this.modelo="";
        this.anio=0;
        this.marca="";
    }

    //Con atributos de Entrada
    public Auto(String color, String tamanio, String modelo, int anio, String marca){
        this.color = color;
        this.tamanio = tamanio;
        this.modelo = modelo;
        this.anio = anio;
        this.marca = marca;

    }

    //Demás métodos únicamente con atributos públicos
    public String toStringPublic() {
        return "Auto{" +
                "color='" + color + '\'' +
                ", tamanio='" + tamanio + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + String.valueOf(anio) +
                ", marca='" + marca + '\'' +
                '}';
    }
}

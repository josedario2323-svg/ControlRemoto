package controlremoto.dispositivos;

public class Luz{

    private final String[] ubicaciones = {"Sala", "Cuarto","Bano","Cocina"};
    private final String ubicacion;

    public Luz(int i){
        this.ubicacion = ubicaciones[i];
    }
    
    public void encender(){
        System.out.println("Se encendieron las luces de "+ this.ubicacion);
    }

    public void apagar(){
        System.out.println("Se apagaron las luces "+ this.ubicacion);
    }
}
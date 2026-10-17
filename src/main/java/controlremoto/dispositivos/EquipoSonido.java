package controlremoto.dispositivos;

public class EquipoSonido{

    private int volumen;

    public EquipoSonido(){
        this.volumen = 20;
    }

    public void encender(){
        System.out.println("Se encendio el equipo de sonido");
    }

    public void apagar(){
        System.out.println("Se apago el equipo de sonido");
    }

    public void subirVolumen(){
        if(100>this.volumen){
            this.volumen+=1;
            System.out.println("Se subio el volumen del equipo a "+ this.volumen);
        }else{
            System.out.println("El equipo ya tiene el volumen maximo");
        }
        
    }

    public void bajarVolumen(){
        if(0<this.volumen){
            this.volumen-=1;
            System.out.println("Se bajo el volumen del equipo a "+ this.volumen);
        }else{
            System.out.println("El equipo ya tiene el volumen minimo");
        }
        
    }
}
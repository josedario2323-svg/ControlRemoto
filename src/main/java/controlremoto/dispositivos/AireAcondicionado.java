package controlremoto.dispositivos;

public class AireAcondicionado{

    private int temperatura;

    public AireAcondicionado(){
        this.temperatura = 20;
    }

    public void encender(){
        System.out.println("Se encendio el aire acondicionado");
    }

    public void apagar(){
        System.out.println("Se apago el aire acondicionado");
    }

    public void subirTemperatura(){
        if(25>this.temperatura){
            this.temperatura+=1;
            System.out.println("Se subio la temperatura del aire acondicionado "+ this.temperatura);
        }else{
            System.out.println("El aire acondicionado tiene la temperatura maxima");
        }
    }

    public void bajarTemperatura(){
        if(16<this.temperatura){
            this.temperatura-=1;
            System.out.println("Se bajo la temperatura del aire acondicionado "+ this.temperatura);
        }else{
            System.out.println("El aire acondicionado tiene la temperatura minima");
        }
    }
}
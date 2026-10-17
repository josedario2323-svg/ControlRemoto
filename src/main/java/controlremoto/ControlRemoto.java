package controlremoto;

import controlremoto.dispositivos.AireAcondicionado;
import controlremoto.dispositivos.EquipoSonido;
import controlremoto.dispositivos.Luz;
import java.util.Scanner;

public class ControlRemoto{
    public static void main(String[] arg){
        Luz luces0 = new Luz(0);
        Luz luces1 = new Luz(1);
        AireAcondicionado aire = new AireAcondicionado();
        EquipoSonido equipo = new EquipoSonido();
        Scanner teclado = new Scanner(System.in);

        while(true){            

            System.out.print("Ingresa un número del 0 al 9 (-1 para salir): ");
            int numero = teclado.nextInt();
            if(numero == -1){
                System.out.println("Saliendo del programa...");
                break;
            }

            switch (numero) {
                
                case 0 -> equipo.apagar();

                case 1 -> luces1.encender();

                case 2 -> luces0.apagar();

                case 3 -> luces1.apagar();            

                case 4 -> aire.encender();       

                case 5 -> aire.apagar();

                case 6 -> aire.subirTemperatura();

                case 7 -> aire.bajarTemperatura();

                case 8 -> equipo.encender();

                case 9 -> equipo.apagar();

            default -> System.out.println("Número fuera del rango de 0 a 9");
            }
            System.out.println();
        }
        teclado.close();
        
    }
}
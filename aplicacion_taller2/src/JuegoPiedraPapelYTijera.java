




import java.util.Scanner;
public class JuegoPiedraPapelYTijera {

    
    public static void main(String[] args) {
        
       Scanner lector =new Scanner(System.in);

       int piedra = 0;
       int papel = 1;
       int tijera =2;
        
       int computadora = (int) (Math.random()*3+0);
       int opcJugador;

         System.out.println("Ingresar Opcion");
         System.out.println("0 -->Piedra");
         System.out.println("1 -->Papel");
         System.out.println("2 -->Tijera");
        opcJugador = lector.nextInt();
        lector.nextLine();
        
        if(computadora == 0)
            {
                System.out.println("La Computadora escogio piedra");
            }else if(computadora ==1)
                {
                    System.out.println("La Computadora escogio papel");
                }else if(computadora == 2)
                    {
                        System.out.println("La Computadora escogio tijera");
                    }
            
         if(opcJugador == piedra)
            {
                System.out.println("Tu elegiste piedra");
                if(computadora == piedra)
                {
                    System.out.println("Empato");
                }else if(computadora == papel)
                        {
                        System.out.println("Perdio");
                        }else if(computadora == tijera)
                            {
                            System.out.println("Gano");
                            }
            
            }else if(opcJugador == papel)
                {   
                System.out.println("Tu elegiste papel");
                if(computadora == piedra)
                {
                    System.out.println("Gano");
                }else if(computadora == papel)
                        {
                        System.out.println("Empato");
                        }else if(computadora == tijera)
                            {
                            System.out.println("Perdio");
                            }
                }else if(opcJugador ==tijera)
                    {
                    System.out.println("Tu elegiste tijera");
                    if(computadora == piedra)
                {
                    System.out.println("Perdio");
                }else if(computadora == papel)
                        {
                        System.out.println("Gano");
                        }else if(computadora == tijera)
                            {
                            System.out.println("Empato");
                            }
                    }
    }
}


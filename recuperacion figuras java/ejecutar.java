
import java.util.Scanner;

public class ejecutar{
    
    public static void main(String[]args) {

        circulo c= new circulo(0, 0, 0, 0);
        pentagono p = new pentagono(0, 0, 0, 0);
        paralelogramo a = new paralelogramo(0, 0, 0, 0, 0, 0);
        
        int elección2 = 0, elección = 1;
        Scanner in = new Scanner(System.in);

        while(elección==1)
		{

        System.out.println("Que opción desea \n  1 si desea el circulo \n 2 si desea el paralelogramo\n 3 si desea el pentagono");
        elección2 = in.nextInt();
        System.out.println("");

     
        switch (elección2)
		{  
			case 1:
				System.out.println("CIRCULO");
                System.out.println("");
				switch (1)
				{
					case 1: System.out.println("Area");
					c.calculararea();
                    case 2: System.out.println("Perimetro");
					c.calcularperimetro();
                    break;
				}
				break;
			case 2:
				System.out.println("PARALELOGRAMO");
                System.out.println("");

			switch (1)
				{
					case 1: System.out.println("Area"); 
					p.calculararea();
                    case 2: System.out.println("Perimetro");
					p.calcularperimetro();
                    break;

				}
				break;
			case 3:
            System.out.println("PENTAGONO");
            System.out.println("");
            switch (1)
            {
                case 1: System.out.println("Area"); 
                a.calculararea();
                case 2: System.out.println("Perimetro");
				a.calcularperimetro();
                break;

            }
            break;

        }
			System.out.println("");
			System.out.println("¿Desea reguresar al menu?");
			System.out.println("Ingresar una opción \n 1 si quiere regresar para \n 2  si desea salir ");
			elección = in.nextInt();
			System.out.println("");
     }
        in.close();
   }
}





    
    


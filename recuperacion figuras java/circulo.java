
import java.util.Scanner;

    public class circulo extends FigurasGeometricas 
    {
        Scanner in = new Scanner(System.in);    
    
        double radio, diametro, area, perimetro;
        public double getRadio() 
        {
            return radio;
        }
        public void setRadio(double radio) 
        {
            this.radio = radio;
        }
        public double getDiametro()
         {
            return diametro;
         }
    
        public void setDiametro(double diametro)
        {
            this.diametro = diametro;
        }
        public double getArea()
        {
            return area;
        }
        public void setArea(double area)
        {
            this.area = area;
        }
        public double getPerimetro()
        {
            return perimetro;
        }

        public void setPerimetro(double perimetro) {
            this.perimetro = perimetro;
        }
    
    
        private final double pi = 3.1416;
        public circulo(double radio, double diametro, double area, double perimetro) {
            
            this.radio = radio;
            this.diametro = diametro;
            this.area = area;
            this.perimetro = perimetro;
        }
        
         public circulo()
         {}
    
        @Override
        public void calculararea() {
    
            System.out.println("Ingrese el radio del circulo");
            setRadio(in.nextDouble());
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Ingrese el diametro del circulo");
            setDiametro(in.nextInt());
            System.out.println("");
            setArea(getRadio()*getDiametro());
    
            System.out.println("El area del circulo: "+getArea());
            System.out.println("");
        }
    
        @Override
        public void calcularperimetro() {
            System.out.println("Ingrese el radio menor del elipse");
            setRadio(in.nextDouble());
            System.out.println("");
            System.out.println("Ingrese el radio mayor del elipse");
            setDiametro(in.nextDouble());
            System.out.println("");
            setPerimetro(getRadio()*(pi+getDiametro()));
            System.out.println("El perimetro del elipse: "+getPerimetro());
            System.out.println("");
    
        }
    
    }
    
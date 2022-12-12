
import java.util.Scanner;

public class pentagono extends FigurasGeometricas {
    Scanner in = new Scanner(System.in);

    private double lado, altura, area, perimetro;

    public double getLado()
    {
        return lado;
    }
    public void setLado(double lado)
    {
        this.lado = lado;
    }
    public double getAltura()
    {
        return altura;
    }
    public void setAltura(double altura)
    {
        this.altura = altura;
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
    public void setPerimetro(double perimetro)
    {
        this.perimetro = perimetro;
    }
    public pentagono(double lado, double altura, double area, double perimetro) {
        this.lado = lado;
        this.altura = altura;
        this.area = area;
        this.perimetro = perimetro;
    }

    @Override
    public void calculararea() {
        System.out.println("Ingrese la altura del pentagono");
        setAltura(in.nextDouble());
        System.out.println("");
        System.out.println("Ingrese el lado del pentagono");
        setLado(in.nextDouble());
        System.out.println("");
        setArea((getAltura()*getLado())/2);
        System.out.println("El area del pentagono es: " +getArea());
    }

    @Override
    public void calcularperimetro() {
        System.out.println("Ingrese el lado del hexagono");
        setLado(in.nextDouble());
        System.out.println("");
        setAltura(getLado()*6);
        System.out.println("El perimetro del hexagono es: " +getPerimetro());
    }
    
}



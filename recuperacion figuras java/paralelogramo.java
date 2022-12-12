
import java.util.Scanner;

public class paralelogramo extends FigurasGeometricas{
    Scanner in = new Scanner(System.in);

    private double base, altura, lado1, lado2, perimetro, area;

    
    public double getBase()
    {
        return base;
    }
    public void setBase(double base)
    {
        this.base = base;
    }
    public double getAltura()
    {
        return altura;
    }
    public void setAltura(double altura)
    {
        this.altura = altura;
    }
    public double getLado1()
    {
        return lado1;
    }
    public void setLado1(double lado1)
    {
        this.lado1 = lado1;
    }
    public double getLado2()
    {
        return lado2;
    }
    public void setLado2(double lado2)
    {
        this.lado2 = lado2;
    }
    public double getPerimetro()
    {
        return perimetro;
    }
    public void setPerimetro(double perimetro)
    {
        this.perimetro = perimetro;
    }
    public double getArea()
    {
        return area;
    }
    public void setArea(double area)
    {
        this.area = area;
    }
    public paralelogramo(){
    }

    public paralelogramo(double base, double altura, double lado1, double lado2, double perimetro, double area) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.perimetro = perimetro;
        this.area= area;
    }

    @Override
    public void calculararea()
     {
        System.out.println("Ingrese la altura del paralelogramo");
        setAltura(in.nextDouble());
        System.out.println("");
        System.out.println("Ingrese la base del paralelogramo");
        setBase(in.nextDouble());
        System.out.println("");
        setArea((getAltura()*getBase())/2);
        System.out.println("El area de la figura es: " +getArea());
    }

    @Override
    public void calcularperimetro() {
        System.out.println("Ingrese el lado1 del paralelogramo");
        setLado1(in.nextDouble());
        System.out.println("Ingrese el lado2 del paralelogramo");
        setLado2(in.nextDouble());
         System.out.println("");
        setPerimetro(getLado2()*8);
        System.out.println("El perimetro de la figura es: " +getPerimetro()); 
    }
}



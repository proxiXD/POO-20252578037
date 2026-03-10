class Rectangulo {
    private double base;
    private double altura;

    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular área
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Rectangulo(" + base + "x" + altura + ")";
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("=== ORIENTADO A OBJETOS ===");

        // Creamos objetos
        Rectangulo rect1 = new Rectangulo(5, 3);
        Rectangulo rect2 = new Rectangulo(4, 6);
        Rectangulo rect3 = new Rectangulo(7, 2);

        // Calculamos áreas
        double area1 = rect1.calcularArea();
        double area2 = rect2.calcularArea();
        double area3 = rect3.calcularArea();

        double areaMayor = Math.max(area1, Math.max(area2, area3));

        System.out.println("Áreas: " + area1 + ", " + area2 + ", " + area3);
        System.out.println("Mayor área: " + areaMayor);
    }
}
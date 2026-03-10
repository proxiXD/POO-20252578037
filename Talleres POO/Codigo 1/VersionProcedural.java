public class VersionProcedural{

    public static void main(String[] args) {

        System.out.println("=== PROCEDURAL ===");

        // Rectángulo 1
        double base1 = 5;
        double altura1 = 3;
        double area1 = base1 * altura1;

        // Rectángulo 2
        double base2 = 4;
        double altura2 = 6;
        double area2 = base2 * altura2;

        // Rectángulo 3
        double base3 = 7;
        double altura3 = 2;
        double area3 = base3 * altura3;

        // Encontrar el mayor
        double areaMayor = Math.max(area1, Math.max(area2, area3));

        System.out.println("Áreas: " + area1 + ", " + area2 + ", " + area3);
        System.out.println("Mayor área: " + areaMayor);
    }

}
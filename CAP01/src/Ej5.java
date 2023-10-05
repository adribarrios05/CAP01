public class Ej5 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s%-10s%s%n","Lunes","Martes","Mierc.", "Jueves", "Viernes");
        System.out.printf("%-9s%-10s%-10s%-10s%s%n","-------","--------","--------", "--------", "--------");
        System.out.printf("\033[34m%-10s\033[33m%-10s%-10s\033[34m%-10s\033[35m%s%n","Progr","LM","LM", "Progr", "FOL");
        System.out.printf("\033[34m%-10s\033[33m%-10s%-10s\033[34m%-10s\033[35m%s%n","Progr","LM","LM", "Progr", "FOL");
        System.out.printf("\033[34m%-10s\033[31m%-10s\033[34m%-10s\033[34m%-10s\033[35m%s%n","Progr","BD","Progr", "Progr", "FOL");
        System.out.printf("\033[32m%-10s\033[31m%-10s\033[34m%-10s\033[31m%-10s\033[32m%s%n","SI","BD","Progr.", "BD", "SI");
        System.out.printf("%-10s\033[36m%-10s\033[31m%-10s%-10s\033[32m%s%n","SI","ED","BD.", "BD", "SI");
        System.out.printf("%-10s\033[36m%-10s\033[31m%-10s\033[36m%-10s\033[32m%s%n\u001B[0m","SI","ED","BD.", "ED", "SI");
    }
    
}

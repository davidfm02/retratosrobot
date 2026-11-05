import java.util.Scanner;

public class RetratosRobot {
		
		  static String elegirRasgo(Scanner in, String nombre, String opcion1, String opcion2,
		            String opcion3, String opcion4) {
		        int opcion;
		        String elegida;
		 
		        System.out.println();
		        System.out.println(nombre);
		        System.out.println("1: " + opcion1);
		        System.out.println("2: " + opcion2);
		        System.out.println("3: " + opcion3);
		        System.out.println("4: " + opcion4);

		        do {
		            System.out.print("Elige una opcion (1-4): ");
		            opcion = in.nextInt();
		        } while (opcion < 1 || opcion > 4);
		        
		        switch (opcion) {
		        
		        case 1:
		        	elegida = opcion1;
		        	break;
		        case 2:
		        	elegida = opcion2;
		        	break;
		        case 3:
		        	elegida = opcion3;
		        	break;
		        default:
		        	elegida = opcion4; 	
		        }
		        return elegida;
	

}
	
	
	static void mostrarRetrato(String pelo, String ojos, String orejasNariz, String boca, String barbilla) {
		System.out.println();
		System.out.println(pelo);
		System.out.println(ojos);
		System.out.println(orejasNariz);
		System.out.println(boca);
		System.out.println(barbilla);
		System.out.println();
	}
	
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    String otraVez;
	
	do {
		String pelo = elegirRasgo(in, "PELO", "WWWWWWWWW", "\\\\\\//////", "\"|||||||\"", "|||||||||");
		String ojos = elegirRasgo(in, "OJOS", "| o o |", "|-(· ·)-|", "|-(o o)-|", "| \\ / |");
		String orejasNariz = elegirRasgo(in, "OREJASNARIZ","@ J @", "{ \" }", "[ j ]", "< - >");
		String boca = elegirRasgo(in, "BOCA", "| === |", "| - |", "| ___ |", "| --- |");
		String barbilla = elegirRasgo(in, "BARBILLA", "\\_______/", "\\,,,,,,,/", "\\......./", "\\mmmmmmm/");
	
		mostrarRetrato(pelo, ojos, orejasNariz, boca, barbilla);

        System.out.print("\u00bfQuieres crear otro retrato? (s/n): ");
        otraVez = in.next();
    } while (otraVez.equalsIgnoreCase("s"));
}
}
	
	 
	 

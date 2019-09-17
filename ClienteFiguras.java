


import Figuras.*;
import java.util.*;
public class ClienteFiguras{
	public static void main(String[] args){
	int n = 0;
	float read = 0.0f;
	int n2 = 0;
	Prisma p1 = new Prisma();
	Cono c1 = new Cono();
	Esfera e1 = new Esfera();
	Scanner obj = new Scanner(System.in);
	while(n != 4){
	System.out.println("Bienvenido este programa obtiene el area superficial y el volumen de diversas Figuras");
	System.out.println("El menu siguiente corresponde a dichas figuras: ");
	System.out.println("	1. Prisma\n	2. Cono\n	3. Esfera\n	4.Salir");
	System.out.print("Seleccione la opción que desee realizar: ");
	n = obj.nextInt();
		switch(n){
		case 1:
		System.out.print("Ingrese el ancho de su prisma: ");
		read = obj.nextFloat();
		p1.setancho(read);
		System.out.print("Ingrese el largo de su prisma: ");
		read = obj.nextFloat();
		p1.setlargo(read);
		System.out.print("Ingrese la altura de su prisma: ");
		read = obj.nextFloat();
		p1.setaltura(read);
		p1.getPrisma();
		System.out.print("Desea obtener: \n	1.Area Superficial\n	2.Volumen\n");
		System.out.print("¿Que opción desea realizar?: ");
		n2 = obj.nextInt();
		switch(n2){
			case 1:
			p1.setareaSl();
        		p1.getareaSl();
			break;
			case 2: 
			p1.setvol();
                        p1.getvol();
			break;
			default:
			System.out.println("Ingrese una opción valida");
			}
		break;
		case 2:
                System.out.print("Ingrese la altura lateral del cono: ");
                read = obj.nextFloat();
                c1.setlateral(read);
                System.out.print("Ingrese el radio del cono: ");
                read = obj.nextFloat();
                c1.setradio(read);
                System.out.print("Ingrese la altura del cono: ");
                read = obj.nextFloat();
                c1.setaltura(read);
                c1.getCono();
                System.out.print("Desea obtener: \n     1.Area Superficial\n    2.Volumen\n");
                System.out.print("¿Que opción desea realizar?: ");
		 n2 = obj.nextInt();
                switch(n2){
                        case 1:
                        c1.setareaSl();
                        c1.getareaSl();
                        break;
                        case 2: 
                        c1.setvol();
                        c1.getvol();
                        break;
                        default:
                        System.out.println("Ingrese una opción valida");
                        }
                break;
		case 3:
                System.out.print("Ingrese el radio de la esfera: ");
                read = obj.nextFloat();
                e1.setradio(read);
                e1.getEsfera();
                System.out.print("Desea obtener: \n     1.Area Superficial\n    2.Volumen\n");
                System.out.print("¿Que opción desea realizar?: ");
		 n2 = obj.nextInt();
                switch(n2){
                        case 1:
                        e1.setareaSl();
                        e1.getareaSl();
                        break;
                        case 2:
                        e1.setvol();
                        e1.getvol();
                        break;
                        default:
                        System.out.println("Ingrese una opción valida");
                        }
                break;
		case 4:
		break;
		default:
		System.out.println("Ingrese una opción valida");
		}	

}
}
}

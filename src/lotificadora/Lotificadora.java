package lotificadora;
import java.util.Scanner;
public class Lotificadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Proyecto_Lotificacion obj = new Proyecto_Lotificacion();
        int op,x,y;
        
        do{
            System.out.println("\n***** Menu Principal *****" + "\nIngrese el numero de su opcion" + "\n1.Venta De Lote" + "\n2.Reporte De Lote" + "\n3.Salir");
            op = sc.nextInt();
            switch(op){
                case 1:
                    obj.dibujo();
                    System.out.println("\nIngrese las coordenadas del lote que desea: ");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    obj.VenderTerreno(x,y);
                    break;
                case 2:
                    obj.Reporte();
                    break;
            }
        }while(op == 1 || op == 2);
    }
}

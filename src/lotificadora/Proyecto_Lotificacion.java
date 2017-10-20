package lotificadora;
import java.util.Scanner;
public class Proyecto_Lotificacion {
Scanner sc = new Scanner(System.in);
private Terreno Lote[][];
int terre = 0,terre2 = 0;
double precit = 0;
public Proyecto_Lotificacion(){
    Lote = new Terreno[5][5];
}
public void dibujo(){
    for (int i = 0; i < Lote.length; i++) {
        System.out.println("");
        for (int z = 0; z < Lote.length; z++){
            if(Lote[i][z] != null){
            System.out.print("  X  ");
            }
            else{
                System.out.print("  O  ");
            }
        }
    }
}

public void VenderTerreno(int x,int y){
    if(x > 5 || x > 5){
        System.out.println("El Lote no existe");
    }
    if(Lote[x][y] == null){
        System.out.println("Ingrese el largo del terreno: ");
        double a = sc.nextDouble();
        System.out.println("Ingrese el ancho del terreno: ");
        double b = sc.nextDouble();
        System.out.println("Ingrese el precio del terreno: ");
        double c = sc.nextDouble();
        Lote[x][y] = new Terreno(a,b,c);
    }
    else{
        System.out.println("El Lote esta ocupado");
    }
}
public void Reporte(){
    System.out.println("***** REPORTE *****");
    int cont = 0;
    int cont2 = 0;
    for (int i = 0; i < Lote.length; i++) {
        for (int z = 0; z < Lote.length; z++) {
            if(Lote[i][z] != null){
            cont ++; 
            cont2 += Lote[i][z].getPrecio();
            }
        }
    }
    System.out.println("Cantidad de Terrenos Ocupados: "+cont);
    System.out.println("Total en Lempiras de Terrenos Ocupados: "+cont2+" Lps");
    System.out.println("Cantidad de Terrenos Ocupados: ");
    System.out.println(25 - cont);
}


    
}

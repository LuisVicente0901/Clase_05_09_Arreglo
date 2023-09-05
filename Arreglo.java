
import java.util.Scanner;
public class Arreglo
{
    
    int[] vector;
    public Arreglo(){
        Scanner in=new Scanner(System.in);
        System.out.println("Ingresa la dimensión del arreglo");
        int longitud = in.nextInt();
        vector = new int[longitud];
        for(int i=0;i<longitud;i++){
            System.out.println("Ingresa el número de la posición "+(i+1));
            int numero = in.nextInt();
            vector[i]=numero;
        }
    
    }
    
    public int maximo(){
        
    }
    
    public int minimo(){
        
    }
    
    public double media(){
 
    }
}

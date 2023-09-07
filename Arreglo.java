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
        int max=0;
        for(int i=0;i<vector.length;i++){
            if(vector[i]>max){
                max=vector[i];
            }
        }
        return(max);
    }
    
    public double media(){
        double media=0.0;
        for(int i=0;i<vector.length;i++){
            media=media+vector[i];
        }
        media= media/vector.length;
        return(media);
    }
}

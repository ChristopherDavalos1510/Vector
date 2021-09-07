package clase.principal.m;

public class Vector {
    private int tam, suma=0;
    
    public Vector(int tam){
        this.tam = tam;
    }
    
    public void vector(){
        //tipodedato[] nombre = new tipodedato[tamaño]
        int[] vec = new int[tam];
        
        //Con este for se colocan los valores para cada posición de vector
        for(int n=0; n<tam; n++){
            int numero = 0;
            //el siguiente while se encarga de que los valores sean número
            //mas grandes que 100 y 
            //el siguiente math de que sean numeros menores o iguales a 20
            while(numero <100){
                numero = (int)(Math.random()*201);
            }
            vec[n]=numero;
            suma = suma + numero;
        }
        
        //Este for se encarga de mostrarnos los datos del vector
        for(int n=0; n<tam; n++){
            System.out.print(vec[n] + "      ");
        }
        System.out.println("\nLa suma de los datos del Vector es: "+suma);
    }
}

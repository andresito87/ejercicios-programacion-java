import javax.swing.JOptionPane;

public class numerosPrimos {

public static void main(String[] args) {

    int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero entero"));
    
    esPrimo(numero);

}
 public static boolean esPrimo(int numero){   
    if (numero<=1){
        System.out.println("El numero "+numero+" es negativo");
        return false;
    }
    for(int i=(int)Math.sqrt(numero);i>1;i--){  /*Se puede empezar 
        //desde la raiz cuadrada de ese numero(pequeño tip para
        // numeros primos)*/

        if(numero%i==0){
            System.out.println("El numero "+numero+" no es primo");
            return false;

        }
        
    }
    System.out.println("El numero "+numero+" es primo");
    return true;
 }

}
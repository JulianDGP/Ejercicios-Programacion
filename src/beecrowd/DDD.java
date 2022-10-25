package beecrowd;
import java.util.Scanner;
public class DDD {

    public static void main (String args[]){
        Scanner in = new Scanner(System.in);

        int entrada = in.nextInt();
        in.close();
        if(entrada==61){
            System.out.println("Brasilia");
        }else if(entrada==71){
            System.out.println("Salvador");
        }else if(entrada==11){
            System.out.println("Sao Paulo");
        }else if(entrada==21){
            System.out.println("Rio de Janeiro");
        }else if(entrada==32){
            System.out.println("Juiz de Fora");
        }else if(entrada==19){
            System.out.println("Campinas");
        }else if(entrada==27){
            System.out.println("Vitoria");
        }else if(entrada==31){
            System.out.println("Belo Horizonte");
        }else{
            System.out.println("DDD nao cadastrado");
        }

    }
}

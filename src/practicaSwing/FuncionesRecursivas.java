/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaSwing;

/**
 *
 * @author edgva
 */
public class FuncionesRecursivas {
     public static int sumaNUP(int num){
        if(num>=1){
            return sumaNUP(num-1)+num;
        }
        return 0;
    }
    
    private static int sumaDOWN(int num,int total){
        if(num>=1){
            return sumaDOWN(num-1,total+num);
        }
        return total;
    }
    
    public static int sumaDOWN(int num){
        return sumaDOWN(num,0);
    }
    
    private static boolean esPalindromo(String palabra,int posInicio,int posFin){
        if(posFin>=posInicio){
            if(palabra.charAt(posInicio)==palabra.charAt(posFin)){
                return esPalindromo(palabra,posInicio+1,posFin-1);
                
            }
            return false;
        }
        return true;
    }
    public static boolean esPalindromo(String palabra){
        return esPalindromo(palabra,0,palabra.length()-1);
    }
    public static void Piramide(int base){
        Piramide(base,1,1);
    }
    //                              4         1      1
    public static void Piramide(int base,int fila,int col){
           //1     4
        if(fila<=base){
            //  1      1
            if(col<=fila){
                //*
                System.out.print("*");
                        //4     1    1+1=2
                Piramide(base,fila,col+1);
            }else{
                System.out.println("");
                Piramide(base,fila+1,1);
            }
        }
    }
}


package g4s21p8mcr;

import java.util.StringTokenizer;

public class JRespuestas {

    String[] respuestas = {
      "16 de septiembre","aun vive en mi corazon","Rojo","Super mario bros word","Pambazos"
    };
    
    String[] radioR = {
        "18 de septiembre,6 de septiembre,11 de septiembre,16 de septiembre",
        "2000,2021,2023,aun vive en mi corazon",
        "Rojo,Blanco,Verde,Azul",
        "GTA V,Super mario bros word,Call of duty,FNAF",
        "Pambazos,Pambazos,Pambazos,Pambazos"
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[4];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); // obtenido el token
            i++;
        }
        
        return a;
    }
    
    public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
}

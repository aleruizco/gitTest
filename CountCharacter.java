public class CountCharacter    
{    
    public static void main(String[] args) {    
        System.out.println("Inicio de Programa");    
        String string = "Lo mejor de dos mundos";    
        int count = 0;    
            
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ')    
                count++;    
        }    
            
        System.out.println("Número Total de Caracteres en la Cadena: " + count);    
        System.out.println("Fin de Programa");    
    }    
}
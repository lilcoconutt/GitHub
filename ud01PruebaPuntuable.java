/*
Realizar un programa que simule la operativa de un usuario en un locutorio
telefónico antiguo.

Al llegar al locutorio, al cliente le era asignada una cabina donde efectuaba
la llamada.

Una vez terminada, el operador del locutorio calculaba el importe a aplicar.
Simularemos que las reglas de cálculo son las siguientes:

- El coste fijo de establecimiento de llamada es de 0,55 euros. Se cobra
siempre, independientemente de la duración de la llamada.
- Por cada minuto de duración de la llamada, se aplica una tarifa de 0,25
céntimos.

La aplicación tiene que mostrar el importe de la llamada que ha efectuado el
usuario, a partir de los minutos y segundos que ha durado ésta. Hay que tener
en cuenta que los segundos se tarifican por exceso (es decir, si la llamada ha
durado, por ejemplo, 3 minutos y 26 segundos, se cobrarán 4 minutos).

Una vez mostrado ese importe, la aplicación también debe solicitar al operador
que introduzca cuánto dinero aporta el cliente y mostrar cuánto es el cambio que
debe devolverle.

package ud01pruebapuntuable;
import java.util.*;


public class ud01PruebaPuntuable {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        // CONSTANTES DEL PROGRAMA
        final double costeEstablecimiento = 0.55;
        final double costeMinuto = 0.25;
        
        // VARIABLES
        int minutos, segundos;
        double costeLlamada, importeAportado;
        
        // CAPTURA DE DATOS DE LA LLAMADA:
        System.out.println("DURACIÓN DE LA LLAMADA");
        System.out.println("Minutos: ");
        minutos = sc.nextInt();
        System.out.println("Segundos: ");
        segundos = sc.nextInt();
        
        // CÁLCULO DEL COSTE DE LA LLAMADA:
        minutos = segundos > 0 ? (minutos + 1) : minutos;
        costeLlamada = costeEstablecimiento + (minutos * costeMinuto);
        
        // IMPRESIÓN DEL COSTE DE LA LLAMADA PARA EL USUARIO:
        System.out.println("\nLa llamada tiene un coste de " + costeLlamada +
                           " euros.");
        
        // CAPTURA DEL IMPORTE APORTADO POR EL USUARIO:
        System.out.println("\nIntroduzca el importe aportado por el usuario: ");
        importeAportado = sc.nextDouble();
        
        // CÁLCULO E IMPRESIÓN DEL CAMBIO:
        System.out.println("\nCambio: " + (importeAportado - costeLlamada));
    }
    
}

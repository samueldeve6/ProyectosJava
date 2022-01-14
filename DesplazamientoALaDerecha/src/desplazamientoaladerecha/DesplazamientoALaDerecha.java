/*
 * << IZQUIERDA
 * >> DERECHA
 */
package desplazamientoaladerecha;

/**
 *
 * @author Usuario
 */
public class DesplazamientoALaDerecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 21;
        int numeroRotadoDerecha = numero << 2;
        System.out.println("Número original en binario: " + Integer.toBinaryString(numero));
        System.out.println("Número rotado en binario    " + Integer.toBinaryString(numeroRotadoDerecha));
    }
    
}

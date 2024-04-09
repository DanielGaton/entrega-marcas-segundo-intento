package proyecto;

import java.util.ArrayList;
import java.util.List;

import utilidades2.Entrada;

/**
 * Esta clase Java permite registrar los puntos de una carrera por kilómetros.
 * @author danielgaton
 * @version 20 
 * @since 3/04/2024
 */
public class PuntosCarrera {

    private static final String FIN_INPUT = "fin";
    private static final String ERROR_NUMERO = "Te he pedido un número válido.";
    private static final String ERROR_ORDEN = "El punto kilométrico debe ser mayor que el anterior.";

    /**
     * El método principal que inicia el programa.
     * 
     * @param args Argumentos de línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        List<Tramo> tramos = capturarTramos();
        imprimirTramos(tramos);
    }

    /**
     * Captura los tramos de la carrera.
     * 
     * @return Una lista de tramos de la carrera.
     */
    private static List<Tramo> capturarTramos() {
        List<Tramo> tramos = new ArrayList<>();
        int pkAnterior = -1; // Inicializamos con un valor que no sea válido
        boolean finalizado = false;

        while (!finalizado) {
            System.out.print("Ingrese el punto kilométrico (o 'fin' para finalizar): ");
            String puntoKm = Entrada.cadena();

            if (puntoKm.equalsIgnoreCase(FIN_INPUT)) {
                finalizado = true;
            } else {
                try {
                    int pk = Integer.parseInt(puntoKm);
                    if (pk <= pkAnterior) {
                        System.out.println(ERROR_ORDEN);
                    } else {
                        tramos.add(new Tramo(pkAnterior, pk, pk - pkAnterior));
                        pkAnterior = pk;
                    }
                } catch (NumberFormatException e) {
                    System.out.println(ERROR_NUMERO);
                }
            }
        }

        return tramos;
    }

    /**
     * Imprime los tramos de la carrera.
     * 
     * @param tramos Lista de tramos de la carrera.
     */
    private static void imprimirTramos(List<Tramo> tramos) {
        System.out.println("\n------ Tramos contabilizados -----");
        for (Tramo tramo : tramos) {
            System.out.println(tramo);
        }
    }
}


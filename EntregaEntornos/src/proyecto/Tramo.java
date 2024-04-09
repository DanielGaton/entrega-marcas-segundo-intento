package proyecto;

/**
 * Esta clase representa un tramo en una carrera, definido por un principio, un fin y una distancia.
 * @author danielgaton
 * @version 20 
 * @since 3/04/2024
 */
public class Tramo implements Comparable<Tramo> {

    private int principio; // Punto kilométrico de inicio del tramo
    private int fin; // Punto kilométrico de fin del tramo
    private int distancia; // Distancia del tramo

    /**
     * Constructor de la clase Tramo.
     * 
     * @param principio Punto kilométrico de inicio del tramo.
     * @param fin       Punto kilométrico de fin del tramo.
     * @param distancia Distancia del tramo.
     */
    public Tramo(int principio, int fin, int distancia) {
        this.principio = principio;
        this.fin = fin;
        this.distancia = distancia;
    }

    /**
     * Devuelve una representación en forma de cadena del tramo.
     * 
     * @return Una cadena que representa el tramo.
     */
    @Override
    public String toString() {
        return "Tramo [principio=" + principio + ", fin=" + fin + ", distancia=" + distancia + "]";
    }

    /**
     * Compara este tramo con otro tramo basado en su distancia.
     * 
     * @param otro El otro tramo con el que se compara.
     * @return Un valor negativo, cero o un valor positivo si este tramo es menor, igual o mayor que el otro tramo.
     */
    @Override
    public int compareTo(Tramo otro) {
        return -(this.distancia - otro.distancia); // Orden descendente por distancia
    }

    // Getters y setters para los campos privados

    public int getPrincipio() {
        return principio;
    }

    public void setPrincipio(int principio) {
        this.principio = principio;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
}


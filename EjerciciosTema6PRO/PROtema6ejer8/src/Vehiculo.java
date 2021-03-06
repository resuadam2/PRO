import java.io.Serializable;

public class Vehiculo implements Serializable{
 
    private static final long serialVersionUID = 7695874286508524707L;

    private String matricula;
    private String marca;
    transient private double tamaņoDeposito;
    private String modelo;
 
    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public double getTamaņoDeposito() {
        return tamaņoDeposito;
    }

    public String getModelo() {
        return modelo;
    }

    public Vehiculo (String matricula, String marca, double tamaņoDeposito, String modelo){
        this.matricula=matricula;
        this.tamaņoDeposito=tamaņoDeposito;
        this.marca=marca;
        this.modelo=modelo;
    }
}
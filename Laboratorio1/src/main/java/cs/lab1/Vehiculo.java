package cs.lab1;

public class Vehiculo {
    protected double combustible; // Cantidad de combustible
    protected double consumo;
    protected double capacidadTanque;

    protected Vehiculo(double combustible, double capacidadTanque, double consumo) {
        this.combustible = combustible;
        this.capacidadTanque = capacidadTanque;
        this.consumo = consumo;
    }
    /*
    public void setCombustible(double combustible_){
        combustible = combustible_;
    }

    public void setConsumo(double consumo_){
        consumo = consumo_;
    }

    public void setcapacidadTanque(double capacidadTanque_){
        capacidadTanque = capacidadTanque_;
    }

    public double getCombustible(){ //cantidad de combustible
        return combustible;
    }

    public double getConsumo(){
        return consumo;
    }

    public double getcapacidadTanque(){
        return capacidadTanque;
    }
*/
    public String viaje(double km) {
        double combustibleConsumido = km * consumo;
        if(this.combustible - combustibleConsumido < 0) {
            // Impresion
            return " Vehiculo necesita reabastecimiento de combustible";
        } else {
            this.combustible -= combustibleConsumido;
            // Impresion
            return String.format(" Vehiculo viajo %.1f km y aun tiene %.2f de combustible.", km, this.combustible);
        }
    }

    public String recargar(double litros) {return " "; }
}
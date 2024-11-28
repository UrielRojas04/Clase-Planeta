public class Planeta {
    private String nombre = null;
    private int cantidadSatelites = 0;
    private double masa = 0.0;
    private double volumen = 0.0;
    private int diametro = 0;
    private int distanciaMediaAlSol = 0;
    private TipoPlaneta tipo = TipoPlaneta.TERRESTRE;
    private boolean observableASimpleVista = false;
    private double periodoOrbital = 0.0;
    private double periodoRotacion = 0.0;

    public enum TipoPlaneta {
        GASEOSO, TERRESTRE, ENANO
    }

    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaMediaAlSol, TipoPlaneta tipo, boolean observableASimpleVista, double periodoOrbital, double periodoRotacion) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaMediaAlSol = distanciaMediaAlSol;
        this.tipo = tipo;
        this.observableASimpleVista = observableASimpleVista;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
    }

    public void imprimirAtributos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de satélites: " + cantidadSatelites);
        System.out.println("Masa: " + masa + " kg");
        System.out.println("Volumen: " + volumen + " km³");
        System.out.println("Diámetro: " + diametro + " km");
        System.out.println("Distancia media al Sol: " + distanciaMediaAlSol + " millones de km");
        System.out.println("Tipo de planeta: " + tipo);
        System.out.println("Observable a simple vista: " + observableASimpleVista);
        System.out.println("Periodo orbital: " + periodoOrbital + " años");
        System.out.println("Periodo de rotación: " + periodoRotacion + " días");
    }

    public double calcularDensidad() {
        return masa / volumen;
    }

    public boolean esPlanetaExterior() {
        double distanciaMinimaCinturonAsteroides = 2.1 * 149597870;
        double distanciaMaximaCinturonAsteroides = 3.4 * 149597870;
        return distanciaMediaAlSol * 1000000 > distanciaMaximaCinturonAsteroides;
    }

    public static void main(String[] args) {
        Planeta tierra = new Planeta("Tierra", 1, 5.972e24, 1.08321e12, 12742, 149, TipoPlaneta.TERRESTRE, true, 1.0, 1.0);
        Planeta jupiter = new Planeta("Júpiter", 79, 1.898e27, 1.43128e15, 139820, 778, TipoPlaneta.GASEOSO, true, 11.86, 0.41);

        System.out.println("Atributos de la Tierra:");
        tierra.imprimirAtributos();
        System.out.println("Densidad de la Tierra: " + tierra.calcularDensidad() + " kg/km³");
        System.out.println("¿Es la Tierra un planeta exterior? " + tierra.esPlanetaExterior());

        System.out.println("\nAtributos de Júpiter:");
        jupiter.imprimirAtributos();
        System.out.println("Densidad de Júpiter: " + jupiter.calcularDensidad() + " kg/km³");
        System.out.println("¿Es Júpiter un planeta exterior? " + jupiter.esPlanetaExterior());
    }
}

public class Main {
    public static void main(String[] args) {
        SensorTemperatura[] sensores = new SensorTemperatura[4];
        sensores[0] = new SensorTemperatura("SENS-01", 24.5, "°C");
        sensores[1] = new SensorTemperatura("SENS-02", 75.2, "°F");
        sensores[2] = new SensorTemperatura("SENS-03", 19.8, "°C");
        sensores[3] = new SensorTemperatura("SENS-04", 88.0, "°F");

        System.out.println("=== LECTURA DE TODOS LOS SENSORES ===");
        for (int i = 0; i < sensores.length; i++) {
            sensores[i].mostrarLectura();
        }

        System.out.println("\n=== ACTUALIZACIÓN GLOBAL (Convertir °C a °F) ===");
        for (int i = 0; i < sensores.length; i++) {
            if (sensores[i].getUnidad().equals("°C")) {
                double fahrenheit = (sensores[i].getValorActual() * 9 / 5) + 32;
                sensores[i].setValorActual(fahrenheit);
                sensores[i].setUnidad("°F");
            }
        }

        System.out.println("\n=== LECTURAS ACTUALIZADAS ===");
        for (int i = 0; i < sensores.length; i++) {
            sensores[i].mostrarLectura();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", "Perez", 25, 12345678);
        mostrarPersona(p1);
    }

    public static void mostrarPersona(Persona p) {
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Apellido: " + p.getApellido());
        System.out.println("Edad: " + p.getEdad());
        System.out.println("Telefono: " + p.getTelefono());
    }
}
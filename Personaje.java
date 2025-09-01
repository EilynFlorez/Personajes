package Personajes;

public class Personaje {
    private String nombre;
    private String genero;
    private Integer edad;
    private String secreto;

    public Personaje(String nombre, String genero, Integer edad, String secreto) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.secreto = secreto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getSecreto() {
        return secreto;
    }

    public void setNombre(String nombreNuevo) {
        nombre = nombreNuevo;
        System.out.println("\nEl nombre del personaje cambio a " + nombre);
    }

    public void setGenero(String generoNuevo) {
        genero = generoNuevo;
        System.out.println("\nEl nombre del personaje cambio a " + genero);
    }

    public void setEdad(Integer edadNueva) {
        edad = edadNueva;
        System.out.println("\nEl nombre del personaje cambio a " + edad);
    }

    public void setSecreto(String setSecreto) {
        nombre = setSecreto;
        System.out.println("\nEl nombre del personaje cambio a " + secreto);
    }

    public void personajeActuar() {
        System.out.println("\nEl personaje " + getNombre() + " esta ingresando al mundo mágico.");
    }
}

package Personajes;

public class Vampiro extends Personaje{
    public Vampiro(String nombre, String genero, Integer edad, String secreto) {
        super(nombre, genero, edad, secreto);
    }

    @Override
    public void personajeActuar() {
        System.out.println("\nEl personaje " + getNombre() + " esta corriendo a 120knm/h.");
    }
}

package Personajes;

public class HombreLobo extends Personaje{
    public HombreLobo(String nombre, String genero, Integer edad, String secreto) {
        super(nombre, genero, edad, secreto);
    }

    @Override
    public void personajeActuar() {
        System.out.println("\nEl personaje " + getNombre() + " se esta transformando a su forma animal.");
    }
}

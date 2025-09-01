package Personajes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Personaje Elena = new Personaje("Elena", "Mujer", 20, "Asesino a su vecino.");
        Personaje Damon = new Vampiro("Damon", "Hombre", 150, "Se quiere tirar de un puente.");
        Personaje Klaus = new HombreLobo("Klaus", "Hombre", 500, "Quiere matar a Damon y Elena.");
        Personaje Bonnie = new HombreLobo("Bonnie", "Mujer", 20, "Quiere matar a Klaus.");

        ArrayList<Personaje> Personajes = new ArrayList<>();
        Personajes.add(Elena);
        Personajes.add(Damon);
        Personajes.add(Klaus);
        Personajes.add(Bonnie);


        System.out.println("Información de los Personajes:");

        for(Personaje x : Personajes) {
            System.out.println("\nNombre: " + x.getNombre() + "\nGenero: " + x.getGenero() + "\nEdad: " + x.getEdad() + "\nSecreto: " + x.getSecreto());
            x.personajeActuar();
        }
    }
}

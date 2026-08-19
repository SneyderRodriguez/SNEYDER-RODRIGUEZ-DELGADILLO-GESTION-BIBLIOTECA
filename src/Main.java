public class Main {
    public static void main(String[] args) {
        SistemaBiblioteca biblioteca = new SistemaBiblioteca();

        biblioteca.registrarMaterial(new Revista("R-050", "El papel dual de los insectos", 1999, true, 20, "Ciencia"));
        biblioteca.registrarMaterial(new Libro("L-028", "Los juegos del hambre", 2001,false, "Penelope Saw", "si"));

        Material resultado = biblioteca.buscarMaterial("L-028");
        resultado.mostrarInfo();

        Material resultado2 = biblioteca.buscarMaterial("L-100");
        if (resultado2 != null) {
            resultado2.mostrarInfo();
        }else {
            System.out.println("No existe el material");
        }

        biblioteca.mostrarCatalogo();
    }
}
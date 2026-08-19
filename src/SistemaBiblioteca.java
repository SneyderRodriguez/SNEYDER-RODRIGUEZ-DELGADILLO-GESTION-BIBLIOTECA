import java.util.HashMap;
import java.util.Map;

public class SistemaBiblioteca {
    /*public static void main(String[] args) {
        Material m1 = new Libro("L-100", "Pablito y el calvito", 1789, true, "pepe lepew", "yes");
        Material m2 = new Revista("R-005", "La vida de los famosos", 2005, false, 01, "Farandula");

        m1.mostrarInfo();
        m2.mostrarInfo();
    }*/

    Map <String, Material> catalogo = new HashMap<>();
    public void registrarMaterial(Material m){
        catalogo.put(m.getCodigo(), m);
    }
    public  Material buscarMaterial(String codigo){
        return catalogo.get(codigo);
    }
    public void mostrarCatalogo(){
        for (Map.Entry<String, Material> entrada : catalogo.entrySet()){
            System.out.println(entrada.getKey());
            entrada.getValue().mostrarInfo();
        }
    }
}
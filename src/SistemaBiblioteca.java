import java.util.ArrayList;
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

    Map<String, ArrayList<String>> listaEspera = new HashMap<>();
    public void agregarAListaEspera(String codigo, String nombre){
        ArrayList<String> lista = listaEspera.get(codigo);
        if (lista == null){
            lista = new ArrayList<>();
            listaEspera.put(codigo, lista);
        }
        lista.add(nombre);
    }

    public ArrayList<String> consultarListaEspera(String codigo){
        return listaEspera.get(codigo);
    }
    public void entregarMaterial(String codigo){
        ArrayList<String> lista = consultarListaEspera(codigo);
        if (lista == null || lista.isEmpty()){
            System.out.println("No existe una lista o la lista está vacia");
        }else {
            String usuario = lista.remove(0);
            Material material = buscarMaterial(codigo);
            if (material != null){
                material.setDisponible(false);
            }
            if (material.isDisponible()){}
            System.out.println( usuario + " recibe el material " + codigo);
        }
    }
}
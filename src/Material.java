public abstract class Material implements Catalogable {
    private String codigo;
    private String titulo;
    private int anio;
    private boolean disponible;
    public Material(String codigo, String titulo, int anio, boolean disponible) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anio = anio;
        this.disponible = disponible;
    }
    @Override
    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnio() {
        return anio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public abstract String getTipo();

    public void mostrarInfo() {
        if (disponible) {
            System.out.println("[" + getTipo() + "] " + getTitulo() + " (" + getAnio() + ")" + " - Disponible");
        }else {
            System.out.println("[" + getTipo() + "] " + getTitulo() + " (" + getAnio() + ")" + " - Prestado");
        }
    }
}
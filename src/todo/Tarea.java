package todo;

public class Tarea {

    private final int id;
    private String descripcion;
    private boolean completada;

    public Tarea(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.completada = false;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean estaCompletada() {
        return completada;
    }

    public void marcarComoCompletada() {
        this.completada = true;
    }

    @Override
    public String toString() {
        String estado = completada ? "[X]" : "[ ]";
        return String.format("%s #%d - %s", estado, id, descripcion);
    }
}

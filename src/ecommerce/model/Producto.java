package ecommerce.model;

public class Producto {

    private int id;
    private String nombre;
    private double precio;
    private int stock;
    private String categoria;

    /*
     * Constructor para producto sin id, se asigna en ProductoService asi el usuario
     * no elige el id
     */
    public Producto(String nombre, double precio, int stock, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    /* constructor vacío para usar más adelante en el curso con este proyecto */
    public Producto() {
    }

    /*
     * Getterss y setters para acceder a los atributos privados de Producto
     * por fuera de la clase
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /*Utiizo @Override para indicar que estoy reescribiendo el método toString()
    en caso de que falle al momento de compilar el programa
    */
    @Override
    public String toString() {
        return "ID: " + id +
                " | " + nombre +
                " | $" + precio +
                " | Stock: " + stock +
                " | Categoría: " + categoria;
    }
}
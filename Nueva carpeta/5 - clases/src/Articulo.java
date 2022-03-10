public class Articulo {
    private String descripcion;
    private double precioVenta;
    private int stock;

    //constructor
    public Articulo(String descripcion, int cantidad, double precio){
        this.descripcion=descripcion;
        stock= cantidad;
        precioVenta=precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public boolean hayStock(){
        return stock>0;
    }
    public double consultarPrecio(){
        return precioVenta;
    }

}

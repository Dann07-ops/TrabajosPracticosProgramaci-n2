
package trabajopractico6colecciones;


public class TrabajoPractico6Colecciones {

  
    public static void main(String[] args) {
          Inventario inventario = new Inventario();

        // 1. Crear al menos cinco productos con diferentes categorías y agregarlos al inventario
        Producto p1 = new Producto("P001", "Arroz", 1200, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Celular", 250000, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera", 3500, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Lámpara", 2800, 15, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Auriculares", 2900, 25, CategoriaProducto.ELECTRONICA);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // 2. Listar todos los productos mostrando su información y categoría
        System.out.println(" Listado de productos:");
        inventario.listarProductos();

        // 3. Buscar un producto por ID y mostrar su información
        System.out.println(" Buscar producto por ID 'P003':");
        Producto buscado = inventario.buscarProductoPorId("P003");
        if (buscado != null) {
            buscado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }

        // 4. Filtrar y mostrar productos que pertenezcan a una categoría específica
        System.out.println(" Productos de categoría ELECTRONICA:");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        // 5. Eliminar un producto por su ID y listar los productos restantes
        System.out.println("️ Eliminando producto con ID 'P002'...");
        inventario.eliminarProducto("P002");
        System.out.println("Productos restantes:");
        inventario.listarProductos();

        // 6. Actualizar el stock de un producto existente
        System.out.println(" Actualizando stock del producto 'P001' a 80 unidades...");
        inventario.actualizarStock("P001", 80);
        inventario.buscarProductoPorId("P001").mostrarInfo();

        // 7. Mostrar el total de stock disponible
        System.out.println("Total de stock disponible: " + inventario.obtenerTotalStock());

        // 8. Obtener y mostrar el producto con mayor stock
        System.out.println(" Producto con mayor stock:");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            mayorStock.mostrarInfo();
        }

        // 9. Filtrar productos con precios entre $1000 y $3000
        System.out.println(" Productos con precio entre $1000 y $3000:");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        // 10. Mostrar las categorías disponibles con sus descripciones
        System.out.println(" Categorías disponibles:");
        inventario.mostrarCategoriasDisponibles();
    }
    
}
    


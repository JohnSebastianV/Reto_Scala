class SistemaRecomendacion {
  
  def recomendarProductos(usuario: Usuario, productosDisponibles: List[Producto]): List[Producto] = {
    val productosComprados = usuario.productosComprados
    
    productosDisponibles
      .filter(p => !productosComprados.contains(p) && usuario.categoriasCompradas.contains(p.categoria))
      .distinct
  }
}

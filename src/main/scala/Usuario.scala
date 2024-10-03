case class Usuario(nombre: String, historialCompras: Map[String, Set[Producto]]) {
  
  def productosComprados: Set[Producto] = historialCompras.values.flatten.toSet
  
  def categoriasCompradas: Set[String] = historialCompras.keys.toSet
}
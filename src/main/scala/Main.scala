object Main {
  def main(args: Array[String]): Unit = {

    val productosDisponibles = List(
      Producto("Portatil", "Tecnologia"),
      Producto("Celular", "Tecnologia"),
      Producto("Cuchillo", "Cocina"),
      Producto("Zapatos", "Ropa"),
      Producto("Tablet", "Tecnologia"),
      Producto("Gorra", "Ropa"),
      Producto("Nevera", "Cocina")
    )


    val comprasJohnvi = Map(
      "Tecnologia" -> Set(Producto("Portatil", "Tecnologia")),
      "Ropa" -> Set(Producto("Gorra", "Ropa"))
    )
    val comprasAnita = Map(
      "Cocina" -> Set(Producto("Cuchillo", "Cocina")),
      "Ropa" -> Set(Producto("Zapatos", "Ropa"))
    )
    val comprasJuangui = Map(
      "Cocina" -> Set(Producto("Nevera", "Cocina"))
    )
    val comprasSantiago = Map(
      "Tecnologia" -> Set(Producto("Audifonos", "Tecnologia"))
    )


    val usuarioJohnvi = Usuario("Johnvi", comprasJohnvi)
    val usuarioAnita = Usuario("Anita la huerfanita", comprasAnita)
    val usuarioJuangui = Usuario("Juangui", comprasJuangui)
    val usuarioSantiago = Usuario("Santiago", comprasSantiago)


    val sistemaRecomendacion = new SistemaRecomendacion()


    val recomendacionesJohnvi = sistemaRecomendacion.recomendarProductos(usuarioJohnvi, productosDisponibles)
    println(s"Recomendaciones para ${usuarioJohnvi.nombre}: ${recomendacionesJohnvi.map(_.nombre).mkString(", ")}")

    val recomendacionesAnita = sistemaRecomendacion.recomendarProductos(usuarioAnita, productosDisponibles)
    println(s"Recomendaciones para ${usuarioAnita.nombre}: ${recomendacionesAnita.map(_.nombre).mkString(", ")}")

    val recomendacionesJuangui = sistemaRecomendacion.recomendarProductos(usuarioJuangui, productosDisponibles)
    println(s"Recomendaciones para ${usuarioJuangui.nombre}: ${recomendacionesJuangui.map(_.nombre).mkString(", ")}")

    val recomendacionesSantiago = sistemaRecomendacion.recomendarProductos(usuarioSantiago, productosDisponibles)
    println(s"Recomendaciones para ${usuarioSantiago.nombre}: ${recomendacionesSantiago.map(_.nombre).mkString(", ")}")
  }
}

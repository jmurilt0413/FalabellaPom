package co.com.banco.falabella.stepsdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class CompraCelularStepDefinition {

  @Dado("que René ingresa a la página {word} desde el buscador de Google")
  public void buscarPaginaDesdeBuscadorGoogle(String pagina) {


  }

  @Cuando("René busca por {word}")
  public void filtrarArticuloPaginaFalabella(String filtro) {
  }

  @Cuando("inicia una intención de compra para un {string} con seguro {string}")
  public void agregarArticuloBolsa(String articulo, String cobertura) {
  }

  @Entonces("el resumen de la orden es")
  public void validarResumenCompra(DataTable dataTable) {

  }


}

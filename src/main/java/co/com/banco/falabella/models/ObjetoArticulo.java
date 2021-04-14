package co.com.banco.falabella.models;

import io.cucumber.datatable.DataTable;

public class ObjetoArticulo {

  private String referenciaArticulo;
  private String marcaArticulo;
  private String valorTotal;
  private String valorArticulo;
  private String valorSeguro;
  private String cantidadProductos;
  private String codigo;

  public ObjetoArticulo(DataTable caracteristicasArticulo){
    referenciaArticulo = caracteristicasArticulo.asList().get(0) ;
    marcaArticulo= caracteristicasArticulo.asList().get(1);
    valorTotal= caracteristicasArticulo.asList().get(2);
    valorArticulo= caracteristicasArticulo.asList().get(3);
    valorSeguro= caracteristicasArticulo.asList().get(4);
    cantidadProductos= caracteristicasArticulo.asList().get(5);
    codigo= caracteristicasArticulo.asList().get(6);
  }

  public String getReferenciaArticulo() {
    return referenciaArticulo;
  }

  public void setReferenciaArticulo(String referenciaArticulo) {
    this.referenciaArticulo = referenciaArticulo;
  }

  public String getMarcaArticulo() {
    return marcaArticulo;
  }

  public void setMarcaArticulo(String marcaArticulo) {
    this.marcaArticulo = marcaArticulo;
  }

  public String getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(String valorTotal) {
    this.valorTotal = valorTotal;
  }

  public String getValorArticulo() {
    return valorArticulo;
  }

  public void setValorArticulo(String valorArticulo) {
    this.valorArticulo = valorArticulo;
  }

  public String getValorSeguro() {
    return valorSeguro;
  }

  public void setValorSeguro(String valorSeguro) {
    this.valorSeguro = valorSeguro;
  }

  public String getCantidadProductos() {
    return cantidadProductos;
  }

  public void setCantidadProductos(String cantidadProductos) {
    this.cantidadProductos = cantidadProductos;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }


}

package co.com.banco.falabella.models;

public class CellPhoneSummaryOrder {

  public CellPhoneSummaryOrder(){}

  public CellPhoneSummaryOrder(String cellPhoneReferency, String brandCellPhone,
      String quantityProducts, String productCode, String totalItemPrice) {
    this.cellPhoneReferency = cellPhoneReferency;
    this.brandCellPhone = brandCellPhone;
    this.quantityProducts = quantityProducts;
    this.productCode = productCode;
    this.totalItemPrice = totalItemPrice;
  }
  private String cellPhoneReferency;
  private String brandCellPhone;
  private String quantityProducts;
  private String productCode;
  private String totalItemPrice;

  public String getCellPhoneReferency() {
    return cellPhoneReferency;
  }

  public void setCellPhoneReferency(String cellPhoneReferency) {
    this.cellPhoneReferency = cellPhoneReferency;
  }

  public String getBrandCellPhone() {
    return brandCellPhone;
  }

  public void setBrandCellPhone(String brandCellPhone) {
    this.brandCellPhone = brandCellPhone;
  }

  public String getQuantityProducts() {
    return quantityProducts;
  }

  public void setQuantityProducts(String quantityProducts) {
    this.quantityProducts = quantityProducts;
  }

  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public String getTotalItemPrice() {
    return totalItemPrice;
  }

  public void setTotalItemPrice(String totalItemPrice) {
    this.totalItemPrice = totalItemPrice;
  }

  @Override
  public String toString() {
    return "CellPhoneSummaryOrder{" +
        "cellPhoneReferency='" + cellPhoneReferency + '\'' +
        ", brandCellPhone='" + brandCellPhone + '\'' +
        ", quantityProducts='" + quantityProducts + '\'' +
        ", productCode='" + productCode + '\'' +
        ", totalItemPrice='" + totalItemPrice + '\'' +
        '}';
  }

}

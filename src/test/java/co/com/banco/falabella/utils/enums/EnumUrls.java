package co.com.banco.falabella.utils.enums;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public enum EnumUrls {

  GOOGLE("Google", "https://google.com.co"),
  AMAZON("Amazon", "https://www.amazon.com/");

  EnumUrls(String namePage, String url) {
    this.namePage = namePage;
    this.url = url;
  }

  private final String namePage;
  private final String url;
  private static final Map<String, String> mapUrl = Collections
      .unmodifiableMap(initializeMapping());

  /**
   * Here goes JavaDoc
   *
   * @param namePage
   * @return
   */
  public static String getUrl(String namePage) {
    if (mapUrl.containsKey(namePage)) {
      return mapUrl.get(namePage);
    }
    return null;
  }

  /**
   * Here goes JavaDoc
   *
   * @return
   */
  private static Map<String, String> initializeMapping() {
    Map<String, String> mapUrl = new HashMap<>();
    for (EnumUrls pagina : EnumUrls.values()) {
      mapUrl.put(pagina.namePage, pagina.url);
    }
    return mapUrl;
  }
}
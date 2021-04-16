package co.com.banco.falabella.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFilePropierties {

  protected Properties propiedades = new Properties();

  public void loadFile(String directorio) throws IOException {
    propiedades.load(new FileInputStream(directorio));
  }

  public String getProperty(String propiedad){
    return propiedades.getProperty(propiedad);

  }

}

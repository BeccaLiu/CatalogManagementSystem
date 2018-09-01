package com.rekekkaxi;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class KafkaProperties {
  private Properties prop;

  public KafkaProperties(Properties prop) {
    this.prop = prop;
  }

  public KafkaProperties() {
    prop = new Properties();
  }

  public KafkaProperties(String configPath) {
    prop = new Properties();
    InputStream inputStream;
    try {
      inputStream = new FileInputStream(configPath);
      prop.load(inputStream);
    } catch (IOException ioe) {
      ioe.printStackTrace();
    }
  }

  public Properties getProperties() {
    return this.prop;

  }

  public void addConfig(String key, String value) {
    prop.put(key, value);
  }

}

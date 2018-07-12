package com.japzio.decbinconverter.dectobin;

import java.util.ArrayList;
import java.util.List;

public class DecimalToBinary {

  private String decimal;

  public DecimalToBinary(String decimal) {

    this.decimal = decimal;

  }

  public String getIntegral() {

    String[] decimalSplit = decimal.split("\\.");

    if ( decimalSplit.length == 0 ) {
      throw new IllegalArgumentException("Could be your input is empty or invalid!");
    }

    return decimalSplit[0];
  }

  public List<String> getIntegralBinary() {

    int integral = Integer.parseInt(this.getIntegral());

    List<String> moduloResults = new ArrayList<>();
    List<String> binaryDigits = new ArrayList<>();

    int bit = 0;

    while( integral > 0){

      bit = integral % 2;

      moduloResults.add(String.valueOf(bit));

      integral = integral / 2;

    }

    for (int x = moduloResults.size() - 1 ; x >=0 ; x-- ) {
      binaryDigits.add(String.valueOf(moduloResults.get(x)));
    }

    return binaryDigits;

  }

  public String getFractional() {

    String[] decimalSplit = decimal.split("\\.");

    if ( decimalSplit.length == 0 ) {
      throw new IllegalArgumentException("Could be your input is empty or invalid or just a whole number!");
    }

    return "." + decimalSplit[1];
  }

  public List<String> getFractionalBinary() {

    List<String> binaryDigits = new ArrayList<>();

    int limit = 23;

    double franctionalDouble = Double.parseDouble(this.getFractional());

    while ( limit != 0) {

      franctionalDouble *= 2;

      String[] franctionalDoubleSplit = String.valueOf(franctionalDouble).split("\\.");

      binaryDigits.add(franctionalDoubleSplit[0]);

      franctionalDouble = Double.parseDouble("." + franctionalDoubleSplit[1]);

      limit--;

    }

    return binaryDigits;

  }

  public String toStringBinary() {
    return new StringBuilder()
            .append(String.join("", this.getIntegralBinary()))
            .append(".")
            .append(String.join("", this.getFractionalBinary()))
            .toString();
  }

  public String toString() {
    return this.decimal;
  }

}

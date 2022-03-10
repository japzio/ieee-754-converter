package com.japzio.converter.dectobin;

import java.math.BigDecimal;
import java.util.List;

public class DecimalToBinary754 extends  DecimalToBinary {

  public DecimalToBinary754(String decimal) {
    super(decimal);
  }

  public int getExponent() {
    return super.getIntegralBinary().size() - 1;
  }

  public int getExponentBiased() {
    return (super.getIntegralBinary().size() - 1) + 127;
  }

  public List<String> getExponentBiasedBinary() {
    return super.decimalToBinary(String.valueOf(getExponentBiased()));
  }

  public String getScientificNotation() {


    return new BigDecimal(
                        String.join("", super.toStringBinary())
               )
               .movePointLeft(this.getExponent())
            .toString();
  }

  public String getMantissa() {

    return this.getScientificNotation().split("\\.")[1];

  }

  public String toString() {
    return new StringBuilder()
            .append(this.getSign())
            .append(String.join("", this.getExponentBiasedBinary()))
            .append(this.getMantissa())
            .toString();
  }

  public String toString32() {

    return toString();
  }

}

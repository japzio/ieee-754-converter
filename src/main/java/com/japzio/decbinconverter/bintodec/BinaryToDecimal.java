package com.japzio.decbinconverter.bintodec;

public class BinaryToDecimal {

  private String binaryDigits;

  public BinaryToDecimal(String binaryDigits) {
    this.binaryDigits = binaryDigits;
  }

  public String getBinaryDigits() {
    return this.binaryDigits.substring(0, 31);
  }

}

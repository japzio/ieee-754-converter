package com.japzio.decbinconverter.dectobin;

import com.japzio.decbinconverter.constants.SignEnum;

import java.util.regex.Pattern;

public class DecimalToBinary754 extends  DecimalToBinary {

  public DecimalToBinary754(String decimal) {
    super(decimal);
  }

  public boolean getSign() {

    Pattern pattern = Pattern.compile("\"^-.\"");

    return pattern.matcher(super.toString()).find();

  }

  public SignEnum getSignLiteral() {

    if ( this.getSign() )
      return SignEnum.POSITIVE;

    return SignEnum.NEGATIVE;

  }

  public int getExponent() {
    return super.getIntegralBinary().size() - 1;
  }

}

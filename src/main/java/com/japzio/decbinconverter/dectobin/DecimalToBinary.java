package com.japzio.decbinconverter.dectobin;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public  class DecimalToBinary {

  private static final Logger logger = Logger.getLogger(DecimalToBinary.class.getName());

  public static int getExponent(String integralBinary) {

    return integralBinary.length();

  }

  public static String getBinaryFromIntegral(int decimalInput) {

    List<String> moduloResults = new ArrayList<>();
    List<String> binaryDigits = new ArrayList<>();

    int bit = 0;

    logger.info("Starting repeated division convertion...");

    while( decimalInput > 0){

      bit = decimalInput % 2;

      moduloResults.add(String.valueOf(bit));

      decimalInput = decimalInput / 2;

    }

    for (int x = moduloResults.size() - 1 ; x >=0 ; x-- ) {
      binaryDigits.add(String.valueOf(moduloResults.get(x)));
    }

    return String.join("", binaryDigits);

  }

  public static String getBinaryFromFractional(int fractional, int limit) {

    List<String> binaryDigits = new ArrayList<>();

    double franctionalDouble = Double.valueOf("." + String.valueOf(fractional));


    logger.info("Computing fractional part as " + String.valueOf(franctionalDouble));

    while ( limit != 0) {

      franctionalDouble *= 2;

      String[] franctionalDoubleSplit = String.valueOf(franctionalDouble).split("\\.");

      binaryDigits.add(franctionalDoubleSplit[0]);

      franctionalDouble = Double.valueOf("." + franctionalDoubleSplit[1]);

      limit--;

    }

    return String.join("", binaryDigits);

  }

}


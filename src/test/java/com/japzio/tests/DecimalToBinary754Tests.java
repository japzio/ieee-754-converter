package com.japzio.tests;

import static org.junit.Assert.assertEquals;

import com.japzio.decbinconverter.dectobin.DecimalToBinary754;
import org.junit.Test;


public class DecimalToBinary754Tests {

  DecimalToBinary754 decimalToBinary = new DecimalToBinary754("23.054");

  @Test
  public void getExponentTest() {
    assertEquals(4, decimalToBinary.getExponent());
  }

}

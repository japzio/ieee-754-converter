package com.japzio.converter;

import com.japzio.converter.dectobin.DecimalToBinary754;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DecimalToBinaryTest {

  DecimalToBinary754 decimalToBinary = new DecimalToBinary754("23.054");

  @Test
  public void getExponentTest() {
    assertEquals(4, decimalToBinary.getExponent());
  }

  @Test
  public void getSign() {
    assertEquals(0, decimalToBinary.getSign());
  }

  @Test
  public void getIntegralBinaryTest() {
    assertEquals("10111", String.join("", decimalToBinary.getIntegralBinary()));
  }

  @Test
  public void getFractionalBinaryTest() {
    assertEquals("00001101110100101111000", String.join("", decimalToBinary.getFractionalBinary()));
  }

}

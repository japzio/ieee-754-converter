package com.japzio.tests;

import com.japzio.decbinconverter.dectobin.DecimalToBinary;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.regex.Pattern;

public class DecimalToBinaryTests {

  @Test
  public void getExponentTest() {
    assertEquals(7, DecimalToBinary.getExponent("10101001"));
  }

  @Test(expected = IllegalArgumentException.class)
  public void getExponentExceptionTest() {
    assertNotNull(DecimalToBinary.getExponent("01010100"));
  }

  @Test

  public void getBinaryFromIntegralTest() {
    assertEquals("11000010", DecimalToBinary.getBinaryFromIntegral(194));
  }


  @Test
  public void getBinaryFromFractionaTest() {

    Pattern pattern = Pattern.compile("^10100000");
    assertTrue(
            pattern.matcher(
                    DecimalToBinary.getBinaryFromFractional(625, 10)
            ).find());
  }

}

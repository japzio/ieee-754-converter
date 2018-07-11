package com.japzio.decbinconverter;

import com.japzio.decbinconverter.dectobin.DecimalToBinary;

import java.util.Scanner;
import java.util.logging.Logger;

public class ApplicationMain {

  private static final Logger logger = Logger.getLogger(ApplicationMain.class.getName());

  public static void main(String args[]) {


    Scanner scanner = new Scanner(System.in);

    System.out.print("Input Decimal : ");
    String input = scanner.next();

    logger.info("" + input);
    logger.info("Integral : " + DecimalToBinary.getBinaryFromIntegral(Integer.parseInt(input)));
    logger.info("Fractional : " + DecimalToBinary.getBinaryFromFractional(Integer.parseInt(input), 32));

  }

}

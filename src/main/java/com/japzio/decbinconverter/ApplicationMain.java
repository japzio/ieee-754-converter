package com.japzio.decbinconverter;

import com.japzio.decbinconverter.dectobin.DecimalToBinary;
import com.japzio.decbinconverter.dectobin.DecimalToBinary754;

import java.util.Scanner;
import java.util.logging.Logger;

public class ApplicationMain {

  private static final Logger logger = Logger.getLogger(ApplicationMain.class.getName());

  public static void main(String args[]) {


    Scanner scanner = new Scanner(System.in);

    System.out.print("Input Decimal : ");
    String input = scanner.next();

    //DecimalToBinary754 decToBin = new DecimalToBinary754("23.054");

    DecimalToBinary754 decToBin = new DecimalToBinary754(input);

    System.out.println("Integral          : " + decToBin.getIntegral());
    System.out.println("Integral Binary   : " + String.join("", decToBin.getIntegralBinary()));
    System.out.println("Fractional        : " + decToBin.getFractional());
    System.out.println("Fractional Binary : " + String.join("", decToBin.getFractionalBinary()));
    System.out.println("Final Binary      : " + decToBin.toStringBinary());

    System.out.println("Normalized form   : " + decToBin.getScientificNotation());

    System.out.println("Final Form Raw    : " + decToBin.toString());
    System.out.println("Final Form 32 bit : " + decToBin.toString32());

  }

}

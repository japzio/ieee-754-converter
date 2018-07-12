package com.japzio.decbinconverter;

import com.japzio.decbinconverter.dectobin.DecimalToBinary;

import java.util.logging.Logger;

public class ApplicationMain {

  private static final Logger logger = Logger.getLogger(ApplicationMain.class.getName());

  public static void main(String args[]) {


    //Scanner scanner = new Scanner(System.in);

    //System.out.print("Input Decimal : ");
    //String input = scanner.next();

    DecimalToBinary decToBin = new DecimalToBinary("23.054");

    System.out.println("Integral          : " + decToBin.getIntegral());
    System.out.println("Integral Binary   : " + String.join("", decToBin.getIntegralBinary()));
    System.out.println("Fractional        : " + decToBin.getFractional());
    System.out.println("Fractional Binary : " + String.join("", decToBin.getFractionalBinary()));
    System.out.println("Final Binary      : " + decToBin.toStringBinary());

  }

}

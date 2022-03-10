package com.japzio.converter;

import com.japzio.converter.dectobin.DecimalToBinary754;

import java.util.Scanner;
import java.util.logging.Logger;

public class IEEE754MainApp {

  private static final Logger logger = Logger.getLogger(IEEE754MainApp.class.getName());

  public static void main(String args[]) {

    int repeat = 0;

    Scanner scanner = new Scanner(System.in);

    while (repeat == 0) {

      System.out.print("Input Type [1] dec-bin, [2] bin-dec");
      int convertionType = scanner.nextInt();

      //DecimalToBinary754 decToBin = new DecimalToBinary754("23.054");
      switch( convertionType ) {
        case 1:
            System.out.print("Enter Decimal Number : ");
            String decimal = scanner.next();

            DecimalToBinary754 decToBin = new DecimalToBinary754(decimal);

            System.out.println("Integral          : " + decToBin.getIntegral());
            System.out.println("Integral Binary   : " + String.join("", decToBin.getIntegralBinary()));
            System.out.println("Fractional        : " + decToBin.getFractional());
            System.out.println("Fractional Binary : " + String.join("", decToBin.getFractionalBinary()));
            System.out.println("Final Binary      : " + decToBin.toStringBinary());

            System.out.println("Normalized form   : " + decToBin.getScientificNotation());

            System.out.println("Final Form Raw    : " + decToBin.toString());
            System.out.println("Final Form 32 bit : " + decToBin.toString32());

            decToBin = null;

            break;
        case 2:
            System.out.print("Enter Binary Representation : ");
            String binary = scanner.next();

            // about to do suff :-(


            break;
        default :
            System.out.println("Choice not yet implemented!");

      }

      System.out.print("Type 0 to continue, any char to exit : ");
      repeat = scanner.nextInt();

    }
  }

}

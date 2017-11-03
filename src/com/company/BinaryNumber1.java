package com.company;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.Arrays;

public class BinaryNumber1 {
    public static void main(String args[]) {
        int[] binary = {0, 1, 0, 1};
        StringBuffer sbfNumbers = new StringBuffer();
        String s = "";
        if ( binary. length > 0 ) {
            sbfNumbers. append ( binary [ 0 ] ) ;
            for ( int i = 1 ; i < binary. length ; i ++ ) {
                sbfNumbers. append ( s ) . append (binary[i]);
            }
            String strNumbers = Arrays.toString(binary);
            strNumbers = strNumbers.replaceAll(", ", s).replace("[", "").replace("]", "");
            //System.out.println("Final String: " + strNumbers);
            Integer number = Integer.parseInt(strNumbers, 2);
            System.out.print(Arrays.toString(binary) + "  >>>>>>>>>>>>   " + number);

        }

    }
}

package com.Byte;

import java.io.File;
import java.nio.ByteBuffer;

public class Main {



    public static void main(String [] args){

        int numbers [] = {4985302,98024342,2948234,99048923};

        int result;
        char characters;

        int tempA,tempB,tempC,tempD;

        byte [][] charBytes = new byte[4][4];
        byte [][] bytes = new byte[4][4];

        for(int i = 0 ; i < bytes.length; i++){


                bytes[i][0]= (byte) (numbers[i]);
                bytes[i][1]= (byte)  ((numbers[i] >> 8));
                bytes[i][2]= (byte) (numbers[i] >> 16);
                bytes[i][3]= (byte) ((numbers[i] >> 24));

        }

        for(int i = 0 ; i < bytes.length; i++){




            tempA = (bytes[i][0] >= 0 ? bytes[i][0] : 256 + bytes[i][0]);
            tempB = (bytes[i][1] >= 0 ? bytes[i][1] : 256 + bytes[i][1]);
            tempC =  (bytes[i][2] >= 0 ? bytes[i][2] : 256 + bytes[i][2]);
            tempD =  (bytes[i][3] >= 0 ? bytes[i][3] : 256 + bytes[i][3]);
             result = (tempA | (tempB << 8) | (tempC << 16) | (tempD << 24));

            System.out.println(result);

        }

        char chars [] = {'3','2','1','4'};




        for(int i = 0 ; i < bytes.length; i++){


            charBytes[i][0]= (byte) (chars[i]);
            charBytes[i][1]= (byte)  ((chars[i] >> 8));
            charBytes[i][2]= (byte) (chars[i] >> 16);
            charBytes[i][3]= (byte) (chars[i] >> 24);

        }

        for(int i = 0 ; i < bytes.length; i++){




            tempA =  (charBytes[i][0] >= 0 ? charBytes[i][0] : 256 + charBytes[i][0]);
            tempB =  (charBytes[i][1] >= 0 ? charBytes[i][1] : 256 + charBytes[i][1]);
            tempC =  (charBytes[i][2] >= 0 ? charBytes[i][2] : 256 + charBytes[i][2]);
            tempD =  (charBytes[i][3] >= 0 ? charBytes[i][3] : 256 + charBytes[i][3]);
            characters = (char)(tempA | (tempB << 8) | (tempC << 16) | (tempD << 24));
            System.out.println(characters);

        }






        }

}

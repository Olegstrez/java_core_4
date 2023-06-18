package ru.geekbrain.homework4;


public class Matrix {

    public static int MatrixSum (String [][] strArray)throws MyArrayDataException,MyArraySizeException {
        int sum =0;
        if (strArray.length !=4) throw new MyArraySizeException();
        for(int i =0; i<strArray.length;i++){
            if (strArray[i].length !=4) throw new MyArraySizeException();
            for(int j =0; j<strArray.length;j++){
                try {
                    sum += Integer.parseInt(strArray[i][j]);

                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j);
                }

            }
        }

        return sum;
    }
}

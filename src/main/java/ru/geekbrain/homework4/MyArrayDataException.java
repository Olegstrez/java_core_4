package ru.geekbrain.homework4;

import static java.lang.String.format;

public class MyArrayDataException extends MatrixExcepotion {

    public MyArrayDataException( int row,int col) {

        super(String.format("Элемент массивва [%d][%d] не int", row, col));
    }
}

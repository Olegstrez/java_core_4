package ru.geekbrain.homework4;

public class Program {
    public static void main(String[] args) {

        String[][] correctMatrix = {
                {"3", "2", "3", "3"},
                {"3", "6", "1", "4"},
                {"0", "2", "7", "2"},
                {"0", "2", "7", "2"}
        };
        String[][] wrongSizeMatrix = {
                {"3", "2", "3", "3"},
                {"6", "1"},
                {"0", "2", "7", "3"},
                {"0", "2", "7", "3"}
        };
        String[][] wrongChar = {
                {"3", "2", "3", "3"},
                {"6", "1", "", "3"},
                {"0", "2", "7", "3"},
                {"0", "2", "7", "3"}
        };
        try{
            System.out.println(Matrix.MatrixSum(correctMatrix));
        } catch (MyArraySizeException ex) {
            ex.getMessage();;
        } catch (MyArrayDataException ex) {
            ex.getMessage();;
        }
        try{
            System.out.println(Matrix.MatrixSum(wrongSizeMatrix));
        } catch (MyArraySizeException ex) {
            System.out.println(ex.getMessage());;
        } catch (MyArrayDataException ex) {
            System.out.println(ex.getMessage());;
        }
        try{
            System.out.println(Matrix.MatrixSum(wrongChar));
        } catch (MyArraySizeException ex) {
            System.out.println(ex.getMessage());;
        } catch (MyArrayDataException ex) {
            System.out.println(ex.getMessage());;
        }


    }

}

import java.io.*;

class Array2D {
    int array[][];
    int row;
    int column;

    void print2DArray(int arg[][], int row, int column) {
        System.out.println("The two dimensional array is");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arg[i][j] + " ");
            }
            System.out.println();
        }
    }

    Array2D retrieve2dArray() {
        try {
            Array2D refArray2D = new Array2D();
            BufferedReader refBr = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the number of rows in the array");
            refArray2D.row = Integer.parseInt(refBr.readLine());
            System.out.println("Enter the number of columns in the array");
            refArray2D.column = Integer.parseInt(refBr.readLine());
            refArray2D.array = new int[refArray2D.row][refArray2D.column];
            System.out.println("Enter the elements of the array");
            for (int i = 0; i < refArray2D.row; i++) {
                for (int j = 0; j < refArray2D.column; j++) {
                    refArray2D.array[i][j] = Integer.parseInt(refBr.readLine());
                }
            }
            return refArray2D;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception in retrieve2dArray method " + e);
        }
        return null;
    }
}

class TwoDimensionArrayCalculator {

    boolean isArraysSameSize(int arg1Row, int arg1Colum, int arg2Row, int arg2Colum) {
        if (arg1Row != arg2Row || arg1Colum != arg2Colum) {
            System.out.println("The two dimensional arrays are not of same size");
            return false;
        }
        return true;
    }

    int[][] addTwoDimensionArray(int arg1[][], int arg1Row, int arg1Colum, int arg2[][], int arg2Row, int arg2Colum) {
        if (isArraysSameSize(arg1Row, arg1Colum, arg2Row, arg2Colum) == false) {
            return null;
        }
        int result[][] = new int[arg1Row][arg1Colum];
        for (int i = 0; i < arg1Row; i++) {
            for (int j = 0; j < arg1Colum; j++) {
                result[i][j] = arg1[i][j] + arg2[i][j];
            }
        }
        return result;
    }

    int[][] subtractTwoDimensionArray(int arg1[][], int arg1Row, int arg1Colum, int arg2[][], int arg2Row,
            int arg2Colum) {
        if (isArraysSameSize(arg1Row, arg1Colum, arg2Row, arg2Colum) == false) {
            return null;
        }
        int result[][] = new int[arg1Row][arg1Colum];
        for (int i = 0; i < arg1Row; i++) {
            for (int j = 0; j < arg1Colum; j++) {
                result[i][j] = arg1[i][j] - arg2[i][j];
            }
        }
        return result;
    }

    int[][] multiplyTwoDimensionArray(int arg1[][], int arg1Row, int arg1Colum, int arg2[][], int arg2Row,
            int arg2Colum) {
        if (arg1Colum != arg2Row) {
            System.out.println("The two dimensional arrays are not of same size");
            return null;
        }
        int result[][] = new int[arg1Row][arg2Colum];
        for (int i = 0; i < arg1Row; i++) {
            for (int j = 0; j < arg2Colum; j++) {
                result[i][j] = 0;
                for (int k = 0; k < arg1Colum; k++) {
                    result[i][j] += arg1[i][k] * arg2[k][j];
                }
            }
        }
        return result;
    }
}

public class TwoDimensionArray {
    public static void main(String args[]) {
        try {
            Array2D refArrayObj1 = new Array2D();
            Array2D refArrayObj2 = new Array2D();
            TwoDimensionArrayCalculator refCalculatorObj = new TwoDimensionArrayCalculator();
            Array2D refArray1 = refArrayObj1.retrieve2dArray();
            Array2D refArray2 = refArrayObj2.retrieve2dArray();
            int addResult[][] = refCalculatorObj.addTwoDimensionArray(refArray1.array, refArray1.row, refArray1.column,
                    refArray2.array, refArray2.row, refArray2.column);
            if (addResult != null) {
                System.out.println("The sum of the two dimensional arrays is");
                refArrayObj1.print2DArray(addResult, refArray1.row, refArray1.column);
            }
            int subResult[][] = refCalculatorObj.subtractTwoDimensionArray(refArray1.array, refArray1.row, refArray1.column,
                    refArray2.array, refArray2.row, refArray2.column);
            if (subResult != null) {
                System.out.println("The difference of the two dimensional arrays is");
                refArrayObj1.print2DArray(subResult, refArray1.row, refArray1.column);
            }
            int mulResult[][] = refCalculatorObj.multiplyTwoDimensionArray(refArray1.array, refArray1.row, refArray1.column,
                    refArray2.array, refArray2.row, refArray2.column);
            if (mulResult != null) {
                System.out.println("The product of the two dimensional arrays is");
                refArrayObj1.print2DArray(mulResult, refArray1.row, refArray2.column);
            }
        } catch (Exception e) {
            System.out.println("Exception in main method " + e);
        }
    }
}

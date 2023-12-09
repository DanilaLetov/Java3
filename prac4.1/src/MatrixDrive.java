public class MatrixDrive {
    public static void matrixal() {
        ConcreteMatrix matrix1 = new ConcreteMatrix(2, 2);
        matrix1.matrix[0][0] = 1;
        matrix1.matrix[0][1] = 2;
        matrix1.matrix[1][0] = 3;
        matrix1.matrix[1][1] = 4;

        ConcreteMatrix matrix2 = new ConcreteMatrix(2, 2);
        matrix2.matrix[0][0] = 5;
        matrix2.matrix[0][1] = 6;
        matrix2.matrix[1][0] = 7;
        matrix2.matrix[1][1] = 8;

        ConcreteMatrix result1 = (ConcreteMatrix) matrix1.add(matrix2);
        System.out.println("Addition:");
        result1.print();

        ConcreteMatrix result2 = (ConcreteMatrix) matrix1.multiply(2);
        System.out.println("Scalar multiplication:");
        result2.print();
    }
}

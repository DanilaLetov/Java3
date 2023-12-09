abstract class Matrix {
    protected double[][] matrix;
    protected int rows;
    protected int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new double[rows][columns];
    }

    public abstract Matrix add(Matrix otherMatrix);

    public abstract Matrix multiply(double scalar);

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

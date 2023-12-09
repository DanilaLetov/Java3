class ConcreteMatrix extends Matrix {

    public ConcreteMatrix(int rows, int columns) {
        super(rows, columns);
    }

    @Override
    public Matrix add(Matrix otherMatrix) {
        if (otherMatrix instanceof ConcreteMatrix && otherMatrix.rows == rows && otherMatrix.columns == columns) {
            ConcreteMatrix result = new ConcreteMatrix(rows, columns);
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    result.matrix[i][j] = matrix[i][j] + ((ConcreteMatrix) otherMatrix).matrix[i][j];
                }
            }
            return result;
        } else {
            throw new IllegalArgumentException("Matrices must have the same dimensions");
        }
    }

    @Override
    public Matrix multiply(double scalar) {
        ConcreteMatrix result = new ConcreteMatrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.matrix[i][j] = matrix[i][j] * scalar;
            }
        }
        return result;
    }
}

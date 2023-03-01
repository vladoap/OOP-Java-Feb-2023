package Abstractions.E05JediGalaxy;

public class Field {

    private int[][] starsField;

    public Field(int[] dimensions) {
        int rows = dimensions[0];
        int cols = dimensions[1];
        this.starsField = new int[rows][cols];
        fillInMatrix(rows, cols, starsField);
    }

    private void fillInMatrix(int rows, int cols, int[][] starsField) {
        int value = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.starsField[i][j] = value++;
            }
        }
    }

    public int[][] getStarsField() {
        return starsField;
    }
}

package Abstractions.E05JediGalaxy;

public class Galaxy {

    private Field field;
    private long sum;

    Galaxy(Field field) {
        this.field = field;
    }

    public long getSum() {
        return sum;
    }

    public void moveEvil(int[] evilCoordinates) {
        int row = evilCoordinates[0];
        int col = evilCoordinates[1];

        while (row >= 0 && col >= 0) {
            if (isInBounds(row, col)) {
                field.getStarsField()[row][col] = 0;
            }
            row--;
            col--;
        }
    }

    private boolean isInBounds(int row, int col){
        return row >= 0 && row < field.getStarsField().length
                && col >= 0 && col < field.getStarsField()[row].length;
    }

    public void moveJedi(int[] jediCoordinates) {
        int row = jediCoordinates[0];
        int col = jediCoordinates[1];

        while (row >= 0 && col < field.getStarsField()[0].length) {
            if (isInBounds(row, col)) {
                sum += field.getStarsField()[row][col];
            }
            row--;
            col++;
        }

    }
}

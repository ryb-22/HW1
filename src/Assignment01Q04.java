import java.util.Arrays;

public class Assignment01Q04 {

    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        if (array.length == 0) {
            return array;
        }
        move = move % array.length;

        if (move < 0) {
            if (direction == 'R') {
                direction = 'L';
            } else if (direction == 'L') {
                direction = 'R';
            }
            move = Math.abs(move);
        }
        if (direction == 'R') {
            return move_right(array, move);
        } else if (direction == 'L') {
            return move_left(array, move);
        }
        return array;
    }

    public static int[] move_right(int[] array, int move) {
        int n = array.length;
        if (n == 0) {
            return array;
        }
        if (move == 0) {
            return array;
        }
        
        
        for (int i = 0; i<move; i++) {
            int last = array[n-1];
            for (int j = n - 1; j > 0; j--) {
            array[j] = array[j - 1];
            }
            array[0] = last;
        }
        return array;
    }

    public static int[] move_left(int[] array, int move) {
        int n = array.length;
        if (n == 0) {
            return array;
        }
        if (move == 0) {
            return array;
        }
        
        
        for (int i = 0; i<move; i++) {
            int first = array[0];
            for (int j = 0; j < n-1; j++) {
            array[j] = array[j + 1];
            }
            array[n-1] = first;
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}
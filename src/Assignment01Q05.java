public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        int n = m.length;

        int[] distance = new int[n];
        for (int v = 0; v < n; v++) {
            distance[v] = -1;
        }

        int[] queue = new int[n];
        int head = 0;
        int tail = 0;

        distance[i] = 0;
        queue[tail] = i;
        tail++;

        while (head < tail) {
            int current = queue[head];
            head++;

            if (current == j) {
                return distance[current];
            }
            for (int v = 0; v < n; v++) {
                if (m[current][v] == 1 && distance[v] == -1) {
                    distance[v] = distance[current] + 1;

                    queue[tail] = v;
                    tail++;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}
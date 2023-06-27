public class StickGameRobot {
    public static int makeMove(int sticks) {
        int move = (sticks - 1) % 4; // Calculate the optimal move
        if (move == 0) {
            move = 1; // If the calculated move is 0, choose 1 to ensure the opponent loses
        }
        return move;
    }

    public static void main(String[] args) {
        int sticks = 21;
        int move = makeMove(sticks);
        System.out.println("Robot takes " + move + " stick(s).");
    }
}

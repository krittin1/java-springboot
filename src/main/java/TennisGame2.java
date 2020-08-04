public class TennisGame2 {
    private int player1Point;
    private int player2Point;

    private final String player1Name;
    private final String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getplayerResult(int point) {
        String[] textScore = {"Love", "Fifteen", "Thirty", "Forty"};
        return textScore[point];
    }

    public String getScore() {
        boolean equalScoreButLessThan4 = player1Point == player2Point && player1Point < 3;
        if (equalScoreButLessThan4) {
            return getplayerResult(player1Point) + "-All";
        }

        else if (player1Point == player2Point) {
            return "Deuce";
        }
        else if (player1Point >= 4 && player2Point >= 0 && (player1Point - player2Point) >= 2) {
            return  "Win for "+ player1Name;
        }
        else if (player2Point >= 4 && player1Point >= 0 && (player2Point - player1Point) >= 2) {
            return  "Win for "+ player2Name;
        }
        else if (player1Point > player2Point && player2Point >= 3 && (player1Point - player2Point) == 1) {
            return  "Advantage "+ player1Name;
        }
        else if (player2Point > player1Point && player1Point >= 3 && (player2Point - player1Point) == 1) {
            return  "Advantage "+ player2Name;
        }
        return getplayerResult(player1Point) + "-" + getplayerResult(player2Point);
    }

    public void wonPoint(String player) {
        if ("player1".equals(player))
            player1Point++;
        else
            player2Point++;
    }
}
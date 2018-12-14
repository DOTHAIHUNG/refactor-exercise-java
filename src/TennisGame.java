public class TennisGame {

    public static String getScore(String firstPlayerName, String secondPlayerName, int scoreOfFirstPlayer, int scoreOfSecondPlayer) {
        String score = "";
        int defaultScore = 0;
        if (scoreOfFirstPlayer == scoreOfSecondPlayer) {
            score = getString(scoreOfFirstPlayer);

        } else if (scoreOfFirstPlayer >= 4 || scoreOfSecondPlayer >= 4) {
            score = getString(scoreOfFirstPlayer, scoreOfSecondPlayer);
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) defaultScore = scoreOfFirstPlayer;
                else {
                    score += "-";
                    defaultScore = scoreOfSecondPlayer;
                }
                score = getString(score, defaultScore);
            }
        }
        return score;
    }

    private static String getString(int scoreOfFirstPlayer) {
        String score;
        switch (scoreOfFirstPlayer) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }

    private static String getString(String score, int defaultScore) {
        switch (defaultScore) {
            case 0:
                score += "Love";
                break;
            case 1:
                score += "Fifteen";
                break;
            case 2:
                score += "Thirty";
                break;
            case 3:
                score += "Forty";
                break;
        }
        return score;
    }

    private static String getString(int scoreOfFirstPlayer, int scoreOfSecondPlayer) {
        String score;
        int differenceScore = scoreOfFirstPlayer - scoreOfSecondPlayer;
        if (differenceScore == 1) score = "Advantage player1";
        else if (differenceScore == -1) score = "Advantage player2";
        else if (differenceScore >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }
}

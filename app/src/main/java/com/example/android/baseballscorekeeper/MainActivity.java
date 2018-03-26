package com.example.android.baseballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int teamAScore = 0;
    int teamABalls = 0;
    int teamAOuts = 0;

    int teamBScore = 0;
    int teamBBalls = 0;
    int teamBOuts = 0;

    int gameInningCount = 1;

    /*
     this is all for team A

     */
    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBallsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_ball_count);
        scoreView.setText(String.valueOf(score));
    }

    public void displayOutsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_out_count);
        scoreView.setText(String.valueOf(score));
    }

    public void add_one_point_team_a(View v) {
        teamAScore = teamAScore + 1;
        displayScoreForTeamA(teamAScore);
    }

    public void add_one_ball_team_a(View v) {
        if (teamABalls == 4) {
            displayBallsForTeamA(teamABalls);
        } else {
            teamABalls = teamABalls + 1;
            displayBallsForTeamA(teamABalls);
        }
    }

    public void remove_one_ball_team_a(View v) {
        if (teamABalls == 0) {
            displayBallsForTeamA(teamABalls);
        } else {
            teamABalls = teamABalls - 1;
            displayBallsForTeamA(teamABalls);
        }
    }

    public void add_one_out_team_a(View v) {
        if (teamAOuts == 3) {
            displayOutsForTeamA(teamAOuts);
        } else {
            teamAOuts = teamAOuts + 1;
            displayOutsForTeamA(teamAOuts);
        }
    }

    public void remove_one_out_team_a(View v) {
        if (teamAOuts == 0) {
            displayOutsForTeamA(teamAOuts);
        } else {
            teamAOuts = teamAOuts - 1;
            displayOutsForTeamA(teamAOuts);
        }
    }

    public void reset_inning_team_a(View v) {
        teamABalls = 0;
        teamAOuts = 0;
        displayBallsForTeamA(teamABalls);
        displayOutsForTeamA(teamAOuts);
    }


    /*

    this is all for team B

    */

    public void displayScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBallsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_ball_count);
        scoreView.setText(String.valueOf(score));
    }

    public void displayOutsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_out_count);
        scoreView.setText(String.valueOf(score));
    }

    public void add_one_point_team_b(View v) {
        teamBScore = teamBScore + 1;
        displayScoreForTeamB(teamBScore);
    }

    public void add_one_ball_team_b(View v) {
        if (teamBBalls == 4) {
            displayBallsForTeamB(teamBBalls);
        } else {
            teamBBalls = teamBBalls + 1;
            displayBallsForTeamB(teamBBalls);
        }
    }

    public void remove_one_ball_team_b(View v) {
        if (teamBBalls == 0) {
            displayBallsForTeamB(teamBBalls);
        } else {
            teamBBalls = teamBBalls - 1;
            displayBallsForTeamB(teamBBalls);
        }
    }

    public void add_one_out_team_b(View v) {
        if (teamBOuts == 3) {
            displayOutsForTeamB(teamBOuts);
        } else {
            teamBOuts = teamBOuts + 1;
            displayOutsForTeamB(teamBOuts);
        }
    }

    public void remove_one_out_team_b(View v) {
        if (teamBOuts == 0) {
            displayOutsForTeamB(teamBOuts);
        } else {
            teamBOuts = teamBOuts - 1;
            displayOutsForTeamB(teamBOuts);
        }
    }

    public void reset_inning_team_b(View v) {
        teamBBalls = 0;
        teamBOuts = 0;
        displayBallsForTeamB(teamBBalls);
        displayOutsForTeamB(teamBOuts);
    }


    /*

    this is all for INNINGS

    */

    public void displayInnings(int inning) {
        TextView scoreView = (TextView) findViewById(R.id.inning_count);
        scoreView.setText(String.valueOf(inning));
    }

    public void add_one_inning(View v) {
        gameInningCount = gameInningCount + 1;
        displayInnings(gameInningCount);
    }

    public void remove_one_inning(View v) {
        if (gameInningCount == 1) {
            displayInnings(gameInningCount);
        } else {
            gameInningCount = gameInningCount - 1;
            displayInnings(gameInningCount);
        }
    }

    /*

    this is all for RESET

    */

    public void resetGame(View v) {
        teamAScore = 0;
        teamABalls = 0;
        teamAOuts = 0;

        teamBScore = 0;
        teamBBalls = 0;
        teamBOuts = 0;

        gameInningCount = 1;

        displayScoreForTeamA(teamAScore);
        displayBallsForTeamA(teamABalls);
        displayOutsForTeamA(teamAOuts);
        displayScoreForTeamB(teamBScore);
        displayBallsForTeamB(teamBBalls);
        displayOutsForTeamB(teamBOuts);
        displayInnings(gameInningCount);
    }

}

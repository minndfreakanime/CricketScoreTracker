package com.example.android.cricketscoretracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int wicketsTeamA = 0;
    int wicketsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*
        Display score function for Team A.
    */
    public void displayForTeamA(int scoreTeamA,int wicketsTeamA) {
        TextView scoreView1 = (TextView) findViewById(R.id.team_a_score);
        scoreView1.setText(scoreTeamA + "/" + wicketsTeamA);
    }
    public void add_one_Run_To_TeamA(View v){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA,wicketsTeamA);
    }
    public void add_two_Runs_To_TeamA(View v){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA,wicketsTeamA);
    }
    public void add_three_Runs_To_TeamA(View v){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA,wicketsTeamA);;
    }
    public void add_four_Runs_To_TeamA(View v){
        scoreTeamA = scoreTeamA + 4;
        displayForTeamA(scoreTeamA,wicketsTeamA);
    }
    public void add_six_Runs_To_TeamA(View v){
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA,wicketsTeamA);
    }
    public void add_one_Wicket_To_TeamA(View v){
        wicketsTeamA = wicketsTeamA + 1;
        displayForTeamA(scoreTeamA,wicketsTeamA);
    }
    /*
        Display score function for Team B.
     */
    public void displayForTeamB(int scoreTeamB,int wicketsTeamB) {
        TextView scoreView2 = (TextView) findViewById(R.id.team_b_score);
        scoreView2.setText(scoreTeamB + "/" + wicketsTeamB);
    }
    public void add_one_Run_To_TeamB(View v){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB,wicketsTeamB);
    }
    public void add_two_Runs_To_TeamB(View v){
        scoreTeamB = scoreTeamB+ 2;
        displayForTeamB(scoreTeamB,wicketsTeamB);
    }
    public void add_three_Runs_To_TeamB(View v){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB,wicketsTeamB);
    }
    public void add_four_Runs_To_TeamB(View v){
        scoreTeamB = scoreTeamB + 4;
        displayForTeamB(scoreTeamB,wicketsTeamB);
    }
    public void add_six_Runs_To_TeamB(View v){
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB,wicketsTeamB);
    }
    public void add_one_Wicket_To_TeamB(View v){
        wicketsTeamB = wicketsTeamB + 1;
        displayForTeamB(scoreTeamB,wicketsTeamB);
    }
    public void reset(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        wicketsTeamA = 0;
        wicketsTeamB = 0;
        displayForTeamA(scoreTeamA,wicketsTeamA);
        displayForTeamB(scoreTeamB,wicketsTeamB);
    }

}

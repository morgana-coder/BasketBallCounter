package com.example.android.basketballcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
      int scoreA=0;
      int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void displayScoreTeamA(int p) {
        TextView scoreTeamA=(TextView)findViewById(R.id.teamA);
        scoreTeamA.setText(String.valueOf(p));
    }
    public void addThree(View view) {
        scoreA=scoreA+3;
        displayScoreTeamA(scoreA);
    }
    public void addTwo(View view) {
        scoreA+=2;
        displayScoreTeamA(scoreA);
    }

    public void freehit(View view) {
        scoreA+=1;
        displayScoreTeamA(scoreA);
    }

    public void addThreeB(View view) {
        scoreB+=3;
        displayScoreTeamB(scoreB);
    }

    private void displayScoreTeamB(int scoreB) {
        TextView scoreTeamB=(TextView)findViewById(R.id.teamB);
        scoreTeamB.setText(String.valueOf(scoreB));
    }

    public void addTwob(View view) {
        scoreB+=2;
        displayScoreTeamB(scoreB);
    }

    public void freehitB(View view) {
        scoreB+=1;
        displayScoreTeamB(scoreB);
    }

    public void reset(View view) {
        scoreB=0;
        scoreA=0;
        displayScoreTeamB(scoreB);
        displayScoreTeamA(scoreA);
    }
}
package com.example.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private ImageView im1, im2, im3, im4, im5, im6, im7, im8, im9;
    private GridLayout grid;
    private Button start;
    private TextView message, head;
    private int active = 0;//O
    private int[] gameState = {-1, -1, -1,
            -1, -1, -1,
            -1, -1, -1};
    private int winner = -1;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im1.animate().alpha(0);
                if (active == 0) {
                    im1.setImageResource(R.drawable.ic_o);
                    active = 1;
                    gameState[0] = 0;
                } else {
                    im1.setImageResource(R.drawable.ic_x);
                    active = 0;
                    gameState[0] = 1;
                }
                im1.animate().alpha(1).setDuration(1000);
                im1.setEnabled(false);
                winner = judge();
                handle(winner);
            }
        });
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im2.animate().alpha(0);
                if (active == 0) {
                    im2.setImageResource(R.drawable.ic_o);
                    active = 1;
                    gameState[1] = 0;
                } else {
                    im2.setImageResource(R.drawable.ic_x);
                    active = 0;
                    gameState[1] = 1;
                }
                im2.animate().alpha(1).setDuration(1000);
                im2.setEnabled(false);
                winner = judge();
                handle(winner);
            }
        });
        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im3.animate().alpha(0);
                if (active == 0) {
                    im3.setImageResource(R.drawable.ic_o);
                    active = 1;
                    gameState[2] = 0;
                } else {
                    im3.setImageResource(R.drawable.ic_x);
                    active = 0;
                    gameState[2] = 1;
                }
                im3.animate().alpha(1).setDuration(1000);
                im3.setEnabled(false);
                winner = judge();
                handle(winner);
            }
        });
        im4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im4.animate().alpha(0);
                if (active == 0) {
                    im4.setImageResource(R.drawable.ic_o);
                    active = 1;
                    gameState[3] = 0;
                } else {
                    im4.setImageResource(R.drawable.ic_x);
                    active = 0;
                    gameState[3] = 1;
                }
                im4.animate().alpha(1).setDuration(1000);
                im4.setEnabled(false);
                winner = judge();
                handle(winner);
            }
        });
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im5.animate().alpha(0);
                if (active == 0) {
                    im5.setImageResource(R.drawable.ic_o);
                    active = 1;
                    gameState[4] = 0;
                } else {
                    im5.setImageResource(R.drawable.ic_x);
                    active = 0;
                    gameState[4] = 1;
                }
                im5.animate().alpha(1).setDuration(1000);
                im5.setEnabled(false);
                winner = judge();
                handle(winner);
            }
        });
        im6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im6.animate().alpha(0);
                if (active == 0) {
                    im6.setImageResource(R.drawable.ic_o);
                    active = 1;
                    gameState[5] = 0;
                } else {
                    im6.setImageResource(R.drawable.ic_x);
                    active = 0;
                    gameState[5] = 1;
                }
                im6.animate().alpha(1).setDuration(1000);
                im6.setEnabled(false);
                winner = judge();
                handle(winner);
            }
        });
        im7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im7.animate().alpha(0);
                if (active == 0) {
                    im7.setImageResource(R.drawable.ic_o);
                    active = 1;
                    gameState[6] = 0;
                } else {
                    im7.setImageResource(R.drawable.ic_x);
                    active = 0;
                    gameState[6] = 1;
                }
                im7.animate().alpha(1).setDuration(1000);
                im7.setEnabled(false);
                winner = judge();
                handle(winner);
            }
        });
        im8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im8.animate().alpha(0);
                if (active == 0) {
                    im8.setImageResource(R.drawable.ic_o);
                    active = 1;
                    gameState[7] = 0;
                } else {
                    im8.setImageResource(R.drawable.ic_x);
                    active = 0;
                    gameState[7] = 1;
                }
                im8.animate().alpha(1).setDuration(1000);
                im8.setEnabled(false);
                winner = judge();
                handle(winner);
            }
        });
        im9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                im9.animate().alpha(0);
                if (active == 0) {
                    im9.setImageResource(R.drawable.ic_o);
                    active = 1;
                    gameState[8] = 0;
                } else {
                    im9.setImageResource(R.drawable.ic_x);
                    active = 0;
                    gameState[8] = 1;
                }
                im9.animate().alpha(1).setDuration(1000);
                im9.setEnabled(false);
                winner = judge();
                handle(winner);
            }
        });
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start.setText("Play Again");
                playAgain();
            }
        });
    }

    private void playAgain() {
        grid.animate().alpha(1).setDuration(2000);
        head.setTranslationY(-1000);
        start.setTranslationY(-1000);
        message.setTranslationY(-1000);
        grid.bringToFront();
        Arrays.fill(gameState, -1);
        active = 0;
        winner = -1;
        for(int i =0;i<grid.getChildCount();i++){
            ImageView imageView = (ImageView) grid.getChildAt(i);
            imageView.setImageDrawable(null);
            imageView.setEnabled(true);
        }
    }

    private void handle(int winner) {
        if (winner == 1) {
            message.setText(R.string.xwins);
            repeat();
        } else if (winner == 0) {
            message.setText(R.string.owins);
            repeat();
        } else if (winner == 2) {
            message.setText(R.string.draw);
            repeat();
        }

    }

    private void repeat() {
        grid.animate().alpha(0).setDuration(1000);
        head.animate().translationYBy(1000).setDuration(200);
        head.bringToFront();
        start.animate().translationYBy(1000).setDuration(300);
        start.bringToFront();
        message.animate().translationYBy(1000).setDuration(500);
        message.bringToFront();
        for(int i =0;i<grid.getChildCount();i++){
            ImageView imageView = (ImageView) grid.getChildAt(i);
            imageView.setEnabled(false);
        }
    }

    private int judge() {
        if (gameState[0] == gameState[1] & gameState[1] == gameState[2]) {
            if (!(gameState[0] == -1)) {
                return gameState[0];
            }
        }
        if (gameState[5] == gameState[4] & gameState[4] == gameState[3]) {
            if (!(gameState[5] == -1)) {
                return gameState[5];
            }
        }
        if (gameState[6] == gameState[7] & gameState[7] == gameState[8]) {
            if (!(gameState[6] == -1)) {
                return gameState[6];
            }
        }
        if (gameState[0] == gameState[3] & gameState[3] == gameState[6]) {
            if (!(gameState[0] == -1)) {
                return gameState[0];
            }
        }
        if (gameState[1] == gameState[4] & gameState[4] == gameState[7]) {
            if (!(gameState[4] == -1)) {
                return gameState[4];
            }
        }
        if (gameState[2] == gameState[5] & gameState[5] == gameState[8]) {
            if (!(gameState[2] == -1)) {
                return gameState[2];
            }
        }
        if (gameState[0] == gameState[4] & gameState[4] == gameState[8]) {
            if (!(gameState[0] == -1)) {
                return gameState[0];
            }
        }
        if (gameState[2] == gameState[4] & gameState[4] == gameState[6]) {
            if (!(gameState[2] == -1)) {
                return gameState[2];
            }
        }
        int flag = 1;
        for (int i : gameState) {
            if (i == -1) {
                flag = 0;
                break;
            }
        }
        if (flag == 1) {
            return 2;
        }
        return -1;
    }

    private void init() {
        im1 = findViewById(R.id.imageX1);
        im2 = findViewById(R.id.imageX2);
        im3 = findViewById(R.id.imageX3);
        im4 = findViewById(R.id.imageX4);
        im5 = findViewById(R.id.imageX5);
        im6 = findViewById(R.id.imageX6);
        im7 = findViewById(R.id.imageX7);
        im8 = findViewById(R.id.imageX8);
        im9 = findViewById(R.id.imageX9);
        message = findViewById(R.id.message);
        start = findViewById(R.id.start);
        grid = findViewById(R.id.grid);
        head = findViewById(R.id.textView);
    }
}
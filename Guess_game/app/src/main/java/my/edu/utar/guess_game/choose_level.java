package my.edu.utar.guess_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class choose_level extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_level);


    }

    public void onSelectLevel(View view) {
        Intent intent = new Intent(this, compare_number.class);
//                Here is another alternative
//                Intent intent = new Intent(getApplicationContext(), choose_level.class);
        startActivity(intent);
        finish();
    }
}
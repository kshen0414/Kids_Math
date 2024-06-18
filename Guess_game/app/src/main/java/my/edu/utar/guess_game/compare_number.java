package my.edu.utar.guess_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class compare_number extends AppCompatActivity {
    TextView txt1;
    TextView txt2;

    TextView txt3;

    Button btn;

    TextView textLevel;
    int level = 0;

//    below is part of the activity lifecycle method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare_number);

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        btn = findViewById(R.id.btn);

//        incremental level logic
        textLevel = findViewById(R.id.textQuestionNumber);
        textLevel.setText("Q : "+level+" / 10");


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int val = random.nextInt(10);
                int val2 = random.nextInt(10);
                txt1.setText(Integer.toString(val));
                txt2.setText(Integer.toString(val2));

//                we would call our compare method, in the setText part
//                txt3.setText(String.valueOf(Integer.compare(val,val2)));
//                for Integer.compare method, if (x==y) return 0
//                for Integer.compare method, if (x<y) return -1
//                for Integer.compare method, if (x>y) return 1


                txt3.setText(equal_num(val,val2));

//                experimental code
//                the logic is to check if id/txt3 is "Not equal" or "Both numbers are equal"
//                the logic i want to test, is like onClick of a button then then we generate a new level?
                if(txt3.getText().equals("Both numbers are equal")){
                    level = level + 1;
                    textLevel.setText("Q : "+level+" / 10");
                } else if (txt3.getText().equals("Not equal")) {
                    level = level+1;
                    textLevel.setText("Q : "+level+" / 10");
                }

            }
        });

    }

    public String equal_num(int a, int b){
        if(a == b){
            return ("Both numbers are equal");
        }
        else {
            return ("Not equal");
        }
    }




}
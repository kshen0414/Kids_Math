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

//    below is part of the activity lifecycle method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare_number);

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int val = random.nextInt(10);
                int val2 = random.nextInt(10);
                txt1.setText(Integer.toString(val));
                txt2.setText(Integer.toString(val2));

//                txt3.setText("Hi");
//                txt3.setText(val.equals(val2));
                txt3.setText(Integer.compare(val,val2));
            }
        });

    }

//    public boolean equals(Integer num) {
//        if (obj instanceof Integer) {
//            return value == ((Integer)obj).intValue();
//        }
//        return false;
//    }

//    public boolean equals(Object obj) {
//        if (obj instanceof Integer) {
//            return value == ((Integer)obj).intValue();
//        }
//        return false;
//    }

}
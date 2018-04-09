package com.example.android.dorisdayquiz;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswers(View view) {
        ImageView doris_day_before = findViewById(R.id.doris_day_before);
        CheckBox actingCheckBox = findViewById(R.id.acting_checkbox);
        CheckBox singingCheckBox = findViewById(R.id.singing_checkbox);
        RadioButton filmRadioButton = findViewById(R.id.film_radiobutton);
        RadioButton nameRadioButton = findViewById(R.id.name_radiobutton);
        RadioButton songRadioButton = findViewById(R.id.song_radiobutton);
        EditText ageField = findViewById(R.id.age_field);

        boolean yesActing = actingCheckBox.isChecked();
        boolean yesSinging = singingCheckBox.isChecked();
        boolean yesFilm = filmRadioButton.isChecked();
        boolean yesName = filmRadioButton.isChecked();
        boolean yesSong = songRadioButton.isChecked();
        String age = ageField.getText().toString();

        if (yesActing)
            score += 1;

        if (yesSinging)
            score += 1;

        if (yesFilm)
            score += 1;

        if (yesName)
            score += 1;

        if (yesSong)
            score += 1;

        if (age.equals("96"))
            score += 1;

        doris_day_before.setImageResource(R.drawable.doris_day_after);
        actingCheckBox.setBackgroundColor(Color.MAGENTA);
        singingCheckBox.setBackgroundColor(Color.MAGENTA);
        filmRadioButton.setBackgroundColor(Color.MAGENTA);
        nameRadioButton.setBackgroundColor(Color.MAGENTA);
        songRadioButton.setBackgroundColor(Color.MAGENTA);
        ageField.setText("96");

        Toast.makeText(this, "You got " + score + "/6 correct!", Toast.LENGTH_SHORT).show();
    }
}

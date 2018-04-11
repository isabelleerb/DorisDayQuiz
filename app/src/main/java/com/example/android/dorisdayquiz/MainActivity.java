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

/**
 * This app displays questions that comprise a quiz.
 */
public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the submit button is clicked.
     */
    public void submitAnswers(View view) {

        //Initialize correct answers.
        ImageView doris_day_before = findViewById(R.id.doris_day_before);
        CheckBox actingCheckBox = findViewById(R.id.acting_checkbox);
        CheckBox singingCheckBox = findViewById(R.id.singing_checkbox);
        RadioButton filmRadioButton = findViewById(R.id.film_radiobutton);
        RadioButton nameRadioButton = findViewById(R.id.name_radiobutton);
        RadioButton songRadioButton = findViewById(R.id.song_radiobutton);
        EditText ageField = findViewById(R.id.age_field);

        /**
         * Check for correct answers.
         * @param yesActing is whether or not the user selected acting
         * @param yesSinging is whether or not the user selected singing
         * @param yesFilm is whether or not the user selected The Man Who Knew Too Much
         * @param yesName is whether or not the user selected Doris Mary Ann Kappelhoff
         * @param yesSong is whether or not the user selected Que Sera, Sera
         * @param age is whether or not the user selected types 96
         *
         */

        boolean yesActing = actingCheckBox.isChecked();
        boolean yesSinging = singingCheckBox.isChecked();
        boolean yesFilm = filmRadioButton.isChecked();
        boolean yesName = nameRadioButton.isChecked();
        boolean yesSong = songRadioButton.isChecked();
        String age = ageField.getText().toString();


        //Add one point to user score for every correct answer.
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

        //Add background highlight for every correct answer.
        doris_day_before.setImageResource(R.drawable.doris_day_after);
        actingCheckBox.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        singingCheckBox.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        filmRadioButton.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        nameRadioButton.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        songRadioButton.setBackgroundColor(getResources().getColor(R.color.colorAccent));

        //Show the user's score as a toast.
        Toast.makeText(this, "You got " + score + "/6 correct!", Toast.LENGTH_LONG).show();
    }
}

package com.example.wordcounter2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.String;
import java.util.ArrayList;

import static com.example.wordcounter2.util.Calculator.getCharsCount;
import static com.example.wordcounter2.util.Calculator.getWordsCount;
import static com.example.wordcounter2.util.ToastMessage.showToast;
public class MainActivity extends AppCompatActivity {

    Spinner dropdownSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.dropdownSelect = (Spinner) findViewById(R.id.dropdownSelect);
        ArrayList<String> selectionOptionsList = new ArrayList<>();
        selectionOptionsList.add(this.getString(R.string.words));
        selectionOptionsList.add(this.getString(R.string.chars));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, selectionOptionsList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.dropdownSelect.setAdapter(arrayAdapter);
    }

    public void btnCalculateOnClick(View view) {
        EditText editTextUserInput = findViewById(R.id.editTextUserInput);
        TextView textViewNumber = findViewById(R.id.textViewNumber);
        TextView textViewLabel = findViewById(R.id.textViewLabel);
        String userInputText = editTextUserInput.getText().toString();

        String selection = this.dropdownSelect.getSelectedItem().toString();
        if(selection.equalsIgnoreCase(this.getString(R.string.chars))){
            int count = getCharsCount(userInputText);
            if(count == 0 ) {
                showToast(this, this.getString(R.string.empty)
                );
            }
            textViewLabel.setText(this.getString(R.string.chars_count));
            textViewNumber.setText(String.valueOf(count));
        }
        else{
            int count = getWordsCount(userInputText);
            if(count == 0 ) {
                showToast(this,  this.getString(R.string.empty));
            }
            textViewLabel.setText(this.getString(R.string.words_count));
            textViewNumber.setText(String.valueOf(count));
        }
    }
}
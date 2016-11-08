package com.codeclan.example.wordcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 08/11/2016.
 */

public class WordCount extends AppCompatActivity {

    EditText mPhraseText;
    Button mResultButton;
    TextView mCountText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("WordCount", "...onCreate method - called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPhraseText = (EditText) findViewById(R.id.phrase_text);
        mResultButton = (Button) findViewById(R.id.result_button);
        mResultButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.d("WordCount", "Result button - clicked!");
                String phrase = mPhraseText.getText().toString();
                Log.d("WordCount", "The phrase entered: " + phrase);

                Counter count = new Counter();
                int word_count = count.getCount();
                mCountText.setText(word_count);
            }

        });

    }
}

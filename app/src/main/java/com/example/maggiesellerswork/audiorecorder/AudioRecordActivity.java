package com.example.maggiesellerswork.audiorecorder;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.maggiesellerswork.audiorecorder.dialogs.TextInputDialogFragment;

public class AudioRecordActivity extends AppCompatActivity {

    private String TAG = "tag";


    //final Context context = this;
    public String filename = null;

    //private Button confirmButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_record);

        //Intent intent = getIntent();
        //String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //TextView textView = findViewById(R.id.textView);
        //textView.setText(message);
    }

    public void recordAudio(View view) {
        AlertDialog.Builder filenameInput = new AlertDialog.Builder(AudioRecordActivity.this);
        filenameInput.setTitle("Save Audio File As");
        filenameInput.setMessage("Enter Filename");
        final EditText input = new EditText(AudioRecordActivity.this);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
        input.setLayoutParams(lp);
        filenameInput.setView(input);


        filenameInput.setPositiveButton("CONFIRM",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        filename = input.getText().toString();
                    }
                });
        filenameInput.setNegativeButton("CANCEL",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        filenameInput.show();

        //Log.i(TAG, filename);
        Toast.makeText(getApplicationContext(), input.getText().toString(), Toast.LENGTH_LONG).show();
//        if (filename != null) {
//            //Get text view
//            TextView textView = findViewById(R.id.recordStatus);
//            //Set text view to visible
//            textView.setVisibility(View.VISIBLE);
//        }

    }

    public void stopRecordAudio(View view) {
        //Get text view
        TextView textView = findViewById(R.id.recordStatus);
        //Set text view to invisible
        textView.setVisibility(View.INVISIBLE);


    }
}

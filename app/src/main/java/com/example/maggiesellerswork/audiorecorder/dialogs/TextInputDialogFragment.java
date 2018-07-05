package com.example.maggiesellerswork.audiorecorder.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import com.example.maggiesellerswork.audiorecorder.R;

public class TextInputDialogFragment extends DialogFragment {
    private final String TAG = "AUC_CUSTOM";

    private String output = null;
    private EditText outputEditText;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder= new AlertDialog.Builder(getActivity());

        //Create custom layout w/ LayoutInflater

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View v = inflater.inflate(R.layout.user_input_text_dialog, null);

        //Build the Dialog!
        builder.setTitle("Please enter the filename!")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.i(TAG, "OK clicked");


                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.i(TAG, "Cancel clicked");
                    }
                })
                .setView(v);
        outputEditText=(EditText) v.findViewById(R.id.edtFilename);
        return builder.create();

    }

    public EditText getOutputEditText() {
        return outputEditText;
    }
}

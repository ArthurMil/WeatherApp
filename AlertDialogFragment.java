package com.example.artm.stormy;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by artm on 14/11/16.
 */

public class AlertDialogFragment extends DialogFragment {
    Context context = getActivity();
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
        .setTitle(R.string.error_title).setMessage(R.string.error_message).setPositiveButton(R.string.error_ok_button_text, null);

        AlertDialog dialog = builder.create();
        return dialog;
    }
}

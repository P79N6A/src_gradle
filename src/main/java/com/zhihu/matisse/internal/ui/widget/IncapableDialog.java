package com.zhihu.matisse.internal.ui.widget;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.C0906R;

public class IncapableDialog extends DialogFragment {
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        String string = getArguments().getString("extra_title");
        String string2 = getArguments().getString("extra_message");
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        if (!TextUtils.isEmpty(string)) {
            builder.setTitle((CharSequence) string);
        }
        if (!TextUtils.isEmpty(string2)) {
            builder.setMessage((CharSequence) string2);
        }
        builder.setPositiveButton((int) C0906R.string.ba_, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        return builder.create();
    }

    public static IncapableDialog a(String str, String str2) {
        IncapableDialog incapableDialog = new IncapableDialog();
        Bundle bundle = new Bundle();
        bundle.putString("extra_title", str);
        bundle.putString("extra_message", str2);
        incapableDialog.setArguments(bundle);
        return incapableDialog;
    }
}

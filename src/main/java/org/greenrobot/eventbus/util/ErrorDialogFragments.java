package org.greenrobot.eventbus.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;

public final class ErrorDialogFragments {

    /* renamed from: a  reason: collision with root package name */
    public static int f84153a;

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f84154b;

    public static class Support extends DialogFragment implements DialogInterface.OnClickListener {
        public Dialog onCreateDialog(Bundle bundle) {
            FragmentActivity activity = getActivity();
            Bundle arguments = getArguments();
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setTitle(arguments.getString("de.greenrobot.eventbus.errordialog.title"));
            builder.setMessage(arguments.getString("de.greenrobot.eventbus.errordialog.message"));
            if (ErrorDialogFragments.f84153a != 0) {
                builder.setIcon(ErrorDialogFragments.f84153a);
            }
            builder.setPositiveButton(17039370, this);
            return builder.create();
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ErrorDialogFragments.a(getActivity(), getArguments());
        }
    }

    public static void a(Activity activity, Bundle bundle) {
        if (f84154b != null) {
            try {
                ErrorDialogManager.f84155a.f84167a.a().d(f84154b.newInstance());
            } catch (Exception e2) {
                throw new RuntimeException("Event cannot be constructed", e2);
            }
        }
        if (bundle.getBoolean("de.greenrobot.eventbus.errordialog.finish_after_dialog", false) && activity != null) {
            activity.finish();
        }
    }
}

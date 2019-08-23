package com.facebook.react.modules.timepicker;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import javax.annotation.Nullable;

public class SupportTimePickerDialogFragment extends DialogFragment {
    @Nullable
    private DialogInterface.OnDismissListener mOnDismissListener;
    @Nullable
    private TimePickerDialog.OnTimeSetListener mOnTimeSetListener;

    public void setOnDismissListener(@Nullable DialogInterface.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public void setOnTimeSetListener(@Nullable TimePickerDialog.OnTimeSetListener onTimeSetListener) {
        this.mOnTimeSetListener = onTimeSetListener;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        return TimePickerDialogFragment.createDialog(getArguments(), getActivity(), this.mOnTimeSetListener);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.mOnDismissListener != null) {
            this.mOnDismissListener.onDismiss(dialogInterface);
        }
    }
}

package com.facebook.react.modules.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import com.facebook.react.modules.dialog.DialogModule;
import javax.annotation.Nullable;

public class SupportAlertFragment extends DialogFragment implements DialogInterface.OnClickListener {
    @Nullable
    private final DialogModule.AlertFragmentListener mListener;

    public SupportAlertFragment() {
    }

    public Dialog onCreateDialog(Bundle bundle) {
        return AlertFragment.createDialog(getActivity(), getArguments(), this);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.mListener != null) {
            this.mListener.onDismiss(dialogInterface);
        }
    }

    public SupportAlertFragment(@Nullable DialogModule.AlertFragmentListener alertFragmentListener, Bundle bundle) {
        this.mListener = alertFragmentListener;
        setArguments(bundle);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.mListener != null) {
            this.mListener.onClick(dialogInterface, i);
        }
    }
}

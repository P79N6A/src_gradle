package com.facebook.react.views.switchview;

import android.content.Context;
import android.support.v7.widget.SwitchCompat;

public class ReactSwitch extends SwitchCompat {
    private boolean mAllowChange = true;

    public ReactSwitch(Context context) {
        super(context);
    }

    /* access modifiers changed from: package-private */
    public void setOn(boolean z) {
        if (isChecked() != z) {
            super.setChecked(z);
        }
        this.mAllowChange = true;
    }

    public void setChecked(boolean z) {
        if (this.mAllowChange && isChecked() != z) {
            this.mAllowChange = false;
            super.setChecked(z);
        }
    }
}

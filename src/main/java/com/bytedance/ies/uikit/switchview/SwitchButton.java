package com.bytedance.ies.uikit.switchview;

import android.content.Context;
import android.util.AttributeSet;

public class SwitchButton extends SwitchBase {
    private OnCheckStateChangeListener mOnCheckStateChangeListener;

    public interface OnCheckStateChangeListener {
        boolean beforeChange(SwitchButton switchButton, boolean z);
    }

    public void toggle() {
        setCheckedWithListener(!isChecked());
    }

    public SwitchButton(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void animateThumbToCheckedState(boolean z) {
        setCheckedWithListener(z);
    }

    public void setOnCheckStateChangeListener(OnCheckStateChangeListener onCheckStateChangeListener) {
        this.mOnCheckStateChangeListener = onCheckStateChangeListener;
    }

    public void setCheckedWithListener(boolean z) {
        if (z != isChecked()) {
            if (this.mOnCheckStateChangeListener != null && !this.mOnCheckStateChangeListener.beforeChange(this, z)) {
                if (!z) {
                    z = true;
                } else {
                    z = false;
                }
            }
            setChecked(z);
        }
    }

    public SwitchButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SwitchButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

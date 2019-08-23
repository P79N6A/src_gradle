package com.bytedance.android.live.core.widget;

import android.content.Context;
import android.support.v7.widget.AppCompatRadioButton;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class UnCheckRadioButton extends AppCompatRadioButton {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8354a;

    public void toggle() {
        if (PatchProxy.isSupport(new Object[0], this, f8354a, false, 1509, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8354a, false, 1509, new Class[0], Void.TYPE);
            return;
        }
        setChecked(!isChecked());
    }

    public UnCheckRadioButton(Context context) {
        super(context);
    }

    public UnCheckRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UnCheckRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

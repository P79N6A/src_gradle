package com.ss.android.ugc.aweme.login.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.ui.widget.DmtButton;
import com.ss.android.ugc.aweme.h.b;

public class CheckButton extends DmtButton {
    public CheckButton(Context context) {
        this(context, null);
    }

    public CheckButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CheckButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackgroundResource(2130838071);
        setOnTouchListener(new b(1.2f, 100, null));
    }
}

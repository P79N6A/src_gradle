package com.bytedance.ies.dmt.ui.widget;

import android.content.Context;
import android.support.v7.widget.AppCompatRadioButton;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.util.b;
import com.ss.android.ugc.aweme.C0906R;

public class DmtRadioButton extends AppCompatRadioButton {
    public DmtRadioButton(Context context) {
        this(context, null, C0906R.attr.yi);
    }

    public void setFontType(String str) {
        b.a().a((TextView) this, str);
    }

    public DmtRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0906R.attr.yi);
    }

    public DmtRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b.a().a((TextView) this, attributeSet);
    }
}

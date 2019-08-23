package com.bytedance.ies.dmt.ui.widget;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.util.b;

public class DmtEditText extends AppCompatEditText {
    public DmtEditText(Context context) {
        this(context, null);
    }

    private void a(AttributeSet attributeSet) {
        b.a().a((TextView) this, attributeSet);
    }

    public void setFontType(String str) {
        b.a().a((TextView) this, str);
    }

    public DmtEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public DmtEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet);
    }
}

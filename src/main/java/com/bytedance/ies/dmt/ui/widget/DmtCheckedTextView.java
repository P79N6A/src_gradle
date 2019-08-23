package com.bytedance.ies.dmt.ui.widget;

import android.support.v7.widget.AppCompatCheckedTextView;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.util.b;

public class DmtCheckedTextView extends AppCompatCheckedTextView {
    public void setFontType(String str) {
        b.a().a((TextView) this, str);
    }
}

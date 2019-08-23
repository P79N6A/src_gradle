package com.bytedance.ies.dmt.ui.widget;

import android.support.v7.widget.AppCompatRadioButton;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.util.b;

public class DmtMultiSelectRadioButton extends AppCompatRadioButton {
    public void setFontType(String str) {
        b.a().a((TextView) this, str);
    }
}

package com.bytedance.ies.dmt.ui.widget.util;

import android.support.v7.widget.AppCompatCheckBox;
import android.widget.TextView;

public class DmtCheckBox extends AppCompatCheckBox {
    public void setFontType(String str) {
        b.a().a((TextView) this, str);
    }
}

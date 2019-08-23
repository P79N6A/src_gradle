package com.bytedance.ies.dmt.ui.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.util.b;

public class DmtTextView extends AppCompatTextView {
    public AccessibilityNodeInfo createAccessibilityNodeInfo() {
        try {
            return super.createAccessibilityNodeInfo();
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean performLongClick() {
        try {
            return super.performLongClick();
        } catch (Exception unused) {
            getText();
            return false;
        }
    }

    public DmtTextView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void a(AttributeSet attributeSet) {
        b.a().a((TextView) this, attributeSet);
    }

    public void setFontType(String str) {
        b.a().a((TextView) this, str);
    }

    public DmtTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public DmtTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet);
    }
}

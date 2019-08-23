package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class AutoRTLTextView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76284a;

    public AutoRTLTextView(Context context) {
        this(context, null);
    }

    public AutoRTLTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AutoRTLTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (PatchProxy.isSupport(new Object[]{context}, this, f76284a, false, 89379, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f76284a, false, 89379, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            Drawable background = getBackground();
            Drawable[] compoundDrawables = getCompoundDrawables();
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            if (background != null) {
                background.setAutoMirrored(true);
            }
            for (Drawable drawable : compoundDrawables) {
                if (drawable != null) {
                    drawable.setAutoMirrored(true);
                }
            }
            for (Drawable drawable2 : compoundDrawablesRelative) {
                if (drawable2 != null) {
                    drawable2.setAutoMirrored(true);
                }
            }
        }
    }
}

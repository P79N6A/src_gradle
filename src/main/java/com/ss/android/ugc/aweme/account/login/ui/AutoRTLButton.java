package com.ss.android.ugc.aweme.account.login.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.ui.widget.DmtButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class AutoRTLButton extends DmtButton {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32342a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f32343b;

    public AutoRTLButton(Context context) {
        this(context, null);
    }

    public void setAutoMirrored(boolean z) {
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f32342a, false, 20405, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f32342a, false, 20405, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.f32343b = z2;
            Drawable background = getBackground();
            Drawable drawable = null;
            if (Build.VERSION.SDK_INT >= 23) {
                drawable = getForeground();
            }
            if (background != null) {
                background.setAutoMirrored(z2);
            }
            if (drawable != null) {
                drawable.setAutoMirrored(z2);
            }
        }
    }

    public void setBackground(Drawable drawable) {
        Drawable drawable2 = drawable;
        if (PatchProxy.isSupport(new Object[]{drawable2}, this, f32342a, false, 20406, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable2}, this, f32342a, false, 20406, new Class[]{Drawable.class}, Void.TYPE);
            return;
        }
        super.setBackground(drawable);
        if (drawable2 != null && Build.VERSION.SDK_INT >= 19) {
            drawable2.setAutoMirrored(this.f32343b);
        }
    }

    public AutoRTLButton(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AutoRTLButton(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32343b = true;
        if (PatchProxy.isSupport(new Object[0], this, f32342a, false, 20404, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32342a, false, 20404, new Class[0], Void.TYPE);
            return;
        }
        setAutoMirrored(true);
    }
}

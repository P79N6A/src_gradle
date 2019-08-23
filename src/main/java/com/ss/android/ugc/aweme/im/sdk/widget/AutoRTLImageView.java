package com.ss.android.ugc.aweme.im.sdk.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class AutoRTLImageView extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52715a;

    public AutoRTLImageView(Context context) {
        this(context, null);
    }

    public void setBackground(Drawable drawable) {
        Drawable drawable2 = drawable;
        if (PatchProxy.isSupport(new Object[]{drawable2}, this, f52715a, false, 54026, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable2}, this, f52715a, false, 54026, new Class[]{Drawable.class}, Void.TYPE);
            return;
        }
        super.setBackground(drawable);
        if (drawable2 != null && Build.VERSION.SDK_INT >= 19) {
            drawable2.setAutoMirrored(true);
        }
    }

    public void setImageDrawable(@Nullable Drawable drawable) {
        Drawable drawable2 = drawable;
        if (PatchProxy.isSupport(new Object[]{drawable2}, this, f52715a, false, 54027, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable2}, this, f52715a, false, 54027, new Class[]{Drawable.class}, Void.TYPE);
            return;
        }
        super.setImageDrawable(drawable);
        if (drawable2 != null && Build.VERSION.SDK_INT >= 19) {
            drawable2.setAutoMirrored(true);
        }
    }

    public AutoRTLImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AutoRTLImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (PatchProxy.isSupport(new Object[]{context}, this, f52715a, false, 54025, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f52715a, false, 54025, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            Drawable drawable2 = null;
            drawable2 = Build.VERSION.SDK_INT >= 23 ? getForeground() : drawable2;
            if (drawable != null) {
                drawable.setAutoMirrored(true);
            }
            if (background != null) {
                background.setAutoMirrored(true);
            }
            if (drawable2 != null) {
                drawable2.setAutoMirrored(true);
            }
        }
    }
}

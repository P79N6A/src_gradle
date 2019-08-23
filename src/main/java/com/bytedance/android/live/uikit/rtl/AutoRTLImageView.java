package com.bytedance.android.live.uikit.rtl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class AutoRTLImageView extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8649a;

    public AutoRTLImageView(Context context) {
        this(context, null);
    }

    public void setBackground(Drawable drawable) {
        Drawable drawable2 = drawable;
        if (PatchProxy.isSupport(new Object[]{drawable2}, this, f8649a, false, 2224, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable2}, this, f8649a, false, 2224, new Class[]{Drawable.class}, Void.TYPE);
            return;
        }
        super.setBackground(drawable);
        if (drawable2 != null && Build.VERSION.SDK_INT >= 19) {
            drawable2.setAutoMirrored(true);
        }
    }

    public void setImageDrawable(@Nullable Drawable drawable) {
        Drawable drawable2 = drawable;
        if (PatchProxy.isSupport(new Object[]{drawable2}, this, f8649a, false, 2225, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable2}, this, f8649a, false, 2225, new Class[]{Drawable.class}, Void.TYPE);
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
        if (PatchProxy.isSupport(new Object[]{context}, this, f8649a, false, 2223, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f8649a, false, 2223, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null) {
                drawable.setAutoMirrored(true);
            }
            if (background != null) {
                background.setAutoMirrored(true);
            }
        }
    }
}

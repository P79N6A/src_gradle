package com.ss.android.ugc.aweme.im.sdk.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class SessionStatusImageView extends AutoRTLImageView {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f52817b;

    public SessionStatusImageView(Context context) {
        super(context);
    }

    public void setImageDrawable(@Nullable Drawable drawable) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{drawable}, this, f52817b, false, 54191, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable}, this, f52817b, false, 54191, new Class[]{Drawable.class}, Void.TYPE);
            return;
        }
        if (drawable == null) {
            i = 8;
        }
        setVisibility(i);
        super.setImageDrawable(drawable);
    }

    public SessionStatusImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SessionStatusImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

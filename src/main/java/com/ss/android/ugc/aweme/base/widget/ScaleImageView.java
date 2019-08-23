package com.ss.android.ugc.aweme.base.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.h.b;

public final class ScaleImageView extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35112a;

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f35112a, false, 25439, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35112a, false, 25439, new Class[0], Void.TYPE);
            return;
        }
        setOnTouchListener(new b(1.2f, 100, null));
    }

    public ScaleImageView(Context context) {
        super(context);
        a();
    }

    public ScaleImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public ScaleImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}

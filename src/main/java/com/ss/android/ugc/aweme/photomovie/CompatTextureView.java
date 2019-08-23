package com.ss.android.ugc.aweme.photomovie;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;

public class CompatTextureView extends TextureView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58794a;

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f58794a, false, 63893, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58794a, false, 63893, new Class[0], Void.TYPE);
            return;
        }
        try {
            super.onDetachedFromWindow();
        } catch (Exception e2) {
            a.a((Throwable) e2);
        }
    }

    public CompatTextureView(Context context) {
        super(context);
    }

    public CompatTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CompatTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

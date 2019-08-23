package com.ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class d extends HorizontalScrollView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74364a;

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f74364a, false, 86334, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f74364a, false, 86334, new Class[]{View.class}, Void.TYPE);
        } else if (getWidth() == 0) {
            postDelayed(new e(this, view), 100);
        } else {
            smoothScrollTo(view.getLeft() - (getWidth() / 2), 0);
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, null);
        setOverScrollMode(2);
    }
}

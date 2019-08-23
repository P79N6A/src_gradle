package com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview.b;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46924a;

    private void a(Rect rect, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Rect rect2 = rect;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (PatchProxy.isSupport(new Object[]{rect2, marginLayoutParams2}, this, f46924a, false, 43571, new Class[]{Rect.class, ViewGroup.MarginLayoutParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, marginLayoutParams2}, this, f46924a, false, 43571, new Class[]{Rect.class, ViewGroup.MarginLayoutParams.class}, Void.TYPE);
            return;
        }
        rect2.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
    }

    public final void a(Rect rect, View view) {
        Rect rect2 = rect;
        if (PatchProxy.isSupport(new Object[]{rect2, view}, this, f46924a, false, 43570, new Class[]{Rect.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, view}, this, f46924a, false, 43570, new Class[]{Rect.class, View.class}, Void.TYPE);
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            a(rect2, (ViewGroup.MarginLayoutParams) layoutParams);
            return;
        }
        rect2.set(0, 0, 0, 0);
    }
}

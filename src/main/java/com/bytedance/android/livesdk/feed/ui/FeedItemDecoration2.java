package com.bytedance.android.livesdk.feed.ui;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.feed.l.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class FeedItemDecoration2 extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14444a;

    public static float a() {
        if (PatchProxy.isSupport(new Object[0], null, f14444a, true, 8953, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], null, f14444a, true, 8953, new Class[0], Float.TYPE)).floatValue();
        }
        if (c.b()) {
            return (float) ac.d(C0906R.dimen.os);
        }
        return 1.5f;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        boolean z;
        float f2;
        Rect rect2 = rect;
        if (PatchProxy.isSupport(new Object[]{rect2, view, recyclerView, state}, this, f14444a, false, 8954, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            Object[] objArr = {rect2, view, recyclerView, state};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f14444a, false, 8954, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        float f3 = 3.0f;
        if (view.getVisibility() == 0) {
            if (PatchProxy.isSupport(new Object[0], null, f14444a, true, 8951, new Class[0], Float.TYPE)) {
                f2 = ((Float) PatchProxy.accessDispatch(new Object[0], null, f14444a, true, 8951, new Class[0], Float.TYPE)).floatValue();
            } else if (c.c() || c.a()) {
                f2 = 3.0f;
            } else {
                f2 = 1.5f;
            }
            i = ac.a(f2);
        } else {
            i = 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            z = ((StaggeredGridLayoutManager.LayoutParams) layoutParams).isFullSpan();
        } else {
            z = false;
        }
        if (z) {
            if (PatchProxy.isSupport(new Object[0], null, f14444a, true, 8952, new Class[0], Float.TYPE)) {
                f3 = ((Float) PatchProxy.accessDispatch(new Object[0], null, f14444a, true, 8952, new Class[0], Float.TYPE)).floatValue();
            } else if (!c.c() && !c.a()) {
                f3 = 1.0f;
            }
            i = ac.a(f3);
        }
        int a2 = ac.a(a());
        rect2.set(a2, i, a2, 0);
    }
}

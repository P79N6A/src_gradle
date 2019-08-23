package com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview.a;

import android.support.v4.util.LongSparseArray;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview.c;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46920a;

    /* renamed from: b  reason: collision with root package name */
    private final c f46921b;

    /* renamed from: c  reason: collision with root package name */
    private final LongSparseArray<View> f46922c = new LongSparseArray<>();

    /* renamed from: d  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview.d.b f46923d;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f46920a, false, 43569, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46920a, false, 43569, new Class[0], Void.TYPE);
            return;
        }
        this.f46922c.clear();
    }

    public b(c cVar, com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview.d.b bVar) {
        this.f46921b = cVar;
        this.f46923d = bVar;
    }

    public final View a(RecyclerView recyclerView, int i) {
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f46920a, false, 43568, new Class[]{RecyclerView.class, Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f46920a, false, 43568, new Class[]{RecyclerView.class, Integer.TYPE}, View.class);
        }
        long a2 = this.f46921b.a(i);
        View view = (View) this.f46922c.get(a2);
        if (view == null) {
            RecyclerView.ViewHolder a3 = this.f46921b.a((ViewGroup) recyclerView);
            this.f46921b.a(a3, i);
            view = a3.itemView;
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            if (this.f46923d.a(recyclerView) == 1) {
                i3 = View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824);
                i2 = View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 0);
            } else {
                i3 = View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 0);
                i2 = View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824);
            }
            view.measure(ViewGroup.getChildMeasureSpec(i3, recyclerView.getPaddingLeft() + recyclerView.getPaddingRight(), view.getLayoutParams().width), ViewGroup.getChildMeasureSpec(i2, recyclerView.getPaddingTop() + recyclerView.getPaddingBottom(), view.getLayoutParams().height));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            this.f46922c.put(a2, view);
        }
        return view;
    }
}

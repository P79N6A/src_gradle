package com.ss.android.ugc.aweme.common.adapter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;

public class PullUpLoadMoreHelper implements RecyclerView.OnItemTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40180a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f40181b;

    /* renamed from: c  reason: collision with root package name */
    private RecyclerView f40182c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private LoadMoreRecyclerViewAdapter.a f40183d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f40184e;

    /* renamed from: f  reason: collision with root package name */
    private int f40185f = ViewConfiguration.get(this.f40182c.getContext()).getScaledTouchSlop();
    private float g;

    public void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    public void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
    }

    public PullUpLoadMoreHelper(RecyclerView recyclerView, @Nullable LoadMoreRecyclerViewAdapter.a aVar) {
        this.f40182c = recyclerView;
        this.f40183d = aVar;
        this.f40182c.addOnItemTouchListener(this);
    }

    public boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, motionEvent}, this, f40180a, false, 33404, new Class[]{RecyclerView.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{recyclerView, motionEvent}, this, f40180a, false, 33404, new Class[]{RecyclerView.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            this.g = motionEvent.getY();
            this.f40184e = true;
        }
        if (this.f40182c != null && this.f40181b && this.f40184e && !this.f40182c.canScrollVertically(1) && this.g - motionEvent.getY() > ((float) this.f40185f)) {
            if (this.f40183d != null) {
                this.f40183d.loadMore();
            }
            this.f40181b = false;
            this.f40184e = false;
        }
        return false;
    }
}

package com.ss.android.ugc.aweme.account.base.widget;

import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class RecyclerTouchListener implements RecyclerView.OnItemTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31738a;

    /* renamed from: b  reason: collision with root package name */
    private a f31739b;

    /* renamed from: c  reason: collision with root package name */
    private GestureDetector f31740c;

    public interface a {
    }

    public final void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    public final void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
    }

    public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, motionEvent}, this, f31738a, false, 19748, new Class[]{RecyclerView.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{recyclerView, motionEvent}, this, f31738a, false, 19748, new Class[]{RecyclerView.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        View findChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
        if (!(findChildViewUnder == null || this.f31739b == null || !this.f31740c.onTouchEvent(motionEvent))) {
            recyclerView.getChildAdapterPosition(findChildViewUnder);
        }
        return false;
    }
}

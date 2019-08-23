package com.ss.android.ugc.aweme.im.sdk.relations;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

class NewRelationView$2 implements RecyclerView.OnItemTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51989a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f51990b;

    public void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    public void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
    }

    NewRelationView$2(a aVar) {
        this.f51990b = aVar;
    }

    public boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, motionEvent}, this, f51989a, false, 52673, new Class[]{RecyclerView.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{recyclerView, motionEvent}, this, f51989a, false, 52673, new Class[]{RecyclerView.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (motionEvent.getY() < this.f51990b.h) {
            return true;
        } else {
            return false;
        }
    }
}

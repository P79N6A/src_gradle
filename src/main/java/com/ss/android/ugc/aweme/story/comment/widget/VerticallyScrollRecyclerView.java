package com.ss.android.ugc.aweme.story.comment.widget;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class VerticallyScrollRecyclerView extends RecyclerView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72340a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f72341b;

    /* renamed from: c  reason: collision with root package name */
    private int f72342c;

    /* renamed from: d  reason: collision with root package name */
    private int f72343d;

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f72340a, false, 83087, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f72340a, false, 83087, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2) {
            int i = x - this.f72342c;
            int i2 = y - this.f72343d;
            new StringBuilder("dispatchTouchEvent: !canScrollVertically(1)：").append(!canScrollVertically(1));
            new StringBuilder("dispatchTouchEvent: !canScrollVertically(-1)").append(!canScrollVertically(-1));
            if (!canScrollVertically(-1) && i2 > 0 && Math.abs(i2) > Math.abs(i)) {
                this.f72341b = true;
                getParent().requestDisallowInterceptTouchEvent(false);
                return false;
            } else if (Math.abs(i) > Math.abs(i2)) {
                getParent().requestDisallowInterceptTouchEvent(false);
            } else {
                this.f72341b = false;
            }
        }
        this.f72342c = x;
        this.f72343d = y;
        return super.dispatchTouchEvent(motionEvent);
    }
}

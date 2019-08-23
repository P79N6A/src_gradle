package com.ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;

public class FeedSwipeRefreshLayout extends SwipeRefreshLayout {
    public static ChangeQuickRedirect o;
    private VerticalViewPager p;
    private boolean q;
    private RecyclerView r;

    public void setCanTouch(boolean z) {
        this.q = z;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.r = recyclerView;
    }

    public void setViewPager(VerticalViewPager verticalViewPager) {
        this.p = verticalViewPager;
    }

    public FeedSwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!PatchProxy.isSupport(new Object[]{motionEvent}, this, o, false, 43640, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, o, false, 43640, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, o, false, 43642, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, o, false, 43642, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (!this.q || (!(this.p == null || this.p.getAdapter() == null || this.p.getAdapter().getCount() == 0 || this.p.getCurrentItem() == 0) || (!(this.r == null || ((GridLayoutManager) this.r.getLayoutManager()).findFirstCompletelyVisibleItemPosition() == 0) || !super.onInterceptTouchEvent(motionEvent)))) {
            z = false;
        }
        return z;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, o, false, 43641, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, o, false, 43641, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!this.q || !super.onTouchEvent(motionEvent)) {
            return false;
        } else {
            return true;
        }
    }

    public FeedSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q = true;
    }
}

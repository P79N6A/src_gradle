package com.ss.android.ugc.aweme.story.base.view;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.base.view.viewpager.StoryVerticalViewPager;

public class StoryFeedSwipeRefreshLayout extends StorySwipeRefreshLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71989a;
    private StoryVerticalViewPager p;
    private boolean q;
    private RecyclerView r;

    public void setCanTouch(boolean z) {
        this.q = z;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.r = recyclerView;
    }

    public void setViewPager(StoryVerticalViewPager storyVerticalViewPager) {
        this.p = storyVerticalViewPager;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!PatchProxy.isSupport(new Object[]{motionEvent}, this, f71989a, false, 82437, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f71989a, false, 82437, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f71989a, false, 82439, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f71989a, false, 82439, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!this.q || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f71989a, false, 82438, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f71989a, false, 82438, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!this.q || !super.onTouchEvent(motionEvent)) {
            return false;
        } else {
            return true;
        }
    }
}

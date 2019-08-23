package com.ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.widget.BaseRecyclerView;

public class NestedScrollingRecyclerView extends BaseRecyclerView {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f40435b;

    /* renamed from: c  reason: collision with root package name */
    private int f40436c;

    /* renamed from: d  reason: collision with root package name */
    private int f40437d;

    /* renamed from: e  reason: collision with root package name */
    private int f40438e;

    /* renamed from: f  reason: collision with root package name */
    private int f40439f;

    public NestedScrollingRecyclerView(Context context) {
        this(context, null);
    }

    public void setScrollingTouchSlop(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f40435b, false, 33708, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f40435b, false, 33708, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.setScrollingTouchSlop(i);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        switch (i) {
            case 0:
                this.f40439f = viewConfiguration.getScaledTouchSlop();
                return;
            case 1:
                this.f40439f = viewConfiguration.getScaledPagingTouchSlop();
                break;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f40435b, false, 33709, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f40435b, false, 33709, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            this.f40436c = motionEvent.getPointerId(0);
            this.f40437d = (int) (motionEvent.getX() + 0.5f);
            this.f40438e = (int) (motionEvent.getY() + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f40436c);
            if (findPointerIndex < 0) {
                return false;
            }
            int x = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (getScrollState() == 1) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            int i = x - this.f40437d;
            int i2 = y - this.f40438e;
            boolean canScrollHorizontally = getLayoutManager().canScrollHorizontally();
            boolean canScrollVertically = getLayoutManager().canScrollVertically();
            if (!canScrollHorizontally || Math.abs(i) <= this.f40439f || (Math.abs(i) < Math.abs(i2) && !canScrollVertically)) {
                z = false;
            } else {
                z = true;
            }
            if (canScrollVertically && Math.abs(i2) > this.f40439f && (Math.abs(i2) >= Math.abs(i) || canScrollHorizontally)) {
                z = true;
            }
            if (!z || !super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } else if (actionMasked != 5) {
            return super.onInterceptTouchEvent(motionEvent);
        } else {
            this.f40436c = motionEvent.getPointerId(actionIndex);
            this.f40437d = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f40438e = (int) (motionEvent.getY(actionIndex) + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public NestedScrollingRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollingRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40436c = -1;
        this.f40439f = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
}

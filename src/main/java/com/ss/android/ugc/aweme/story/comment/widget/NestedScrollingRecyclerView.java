package com.ss.android.ugc.aweme.story.comment.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class NestedScrollingRecyclerView extends BaseRecyclerView {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f72333b;

    /* renamed from: c  reason: collision with root package name */
    private int f72334c;

    /* renamed from: d  reason: collision with root package name */
    private int f72335d;

    public NestedScrollingRecyclerView(Context context) {
        this(context, null);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!PatchProxy.isSupport(new Object[]{motionEvent}, this, f72333b, false, 83085, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f72333b, false, 83085, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
    }

    public void setScrollingTouchSlop(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f72333b, false, 83084, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f72333b, false, 83084, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.setScrollingTouchSlop(i);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        switch (i) {
            case 0:
                this.f72335d = viewConfiguration.getScaledTouchSlop();
                return;
            case 1:
                this.f72335d = viewConfiguration.getScaledPagingTouchSlop();
                break;
        }
    }

    public NestedScrollingRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollingRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f72334c = -1;
        this.f72335d = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
}

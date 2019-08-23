package com.ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.views.FpsRecyclerView;

public class DiscoveryRecyclerView extends FpsRecyclerView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43285a;

    /* renamed from: b  reason: collision with root package name */
    double f43286b;

    /* renamed from: c  reason: collision with root package name */
    double f43287c;

    public DiscoveryRecyclerView(Context context) {
        super(context);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f43285a, false, 38219, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f43285a, false, 38219, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f43286b = (double) motionEvent.getX();
            this.f43287c = (double) motionEvent.getY();
        } else if (action == 2) {
            double x = (double) motionEvent.getX();
            double d2 = this.f43286b;
            Double.isNaN(x);
            double abs = Math.abs(x - d2);
            double y = (double) motionEvent.getY();
            double d3 = this.f43287c;
            Double.isNaN(y);
            double abs2 = Math.abs(y - d3);
            if (abs > ((double) ViewConfiguration.get(getContext()).getScaledTouchSlop()) && abs > abs2) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public DiscoveryRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DiscoveryRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

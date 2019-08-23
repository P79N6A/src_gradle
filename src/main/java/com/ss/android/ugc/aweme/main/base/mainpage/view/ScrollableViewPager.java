package com.ss.android.ugc.aweme.main.base.mainpage.view;

import android.content.Context;
import android.support.v4.view.DmtRtlViewPager;
import android.support.v4.view.PagerAdapter;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.feed.listener.j;
import com.ss.android.ugc.aweme.utils.ey;
import java.util.ArrayList;

public class ScrollableViewPager extends DmtRtlViewPager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54455a;

    /* renamed from: b  reason: collision with root package name */
    public int f54456b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f54457c = true;

    /* renamed from: d  reason: collision with root package name */
    float f54458d;

    /* renamed from: e  reason: collision with root package name */
    float f54459e;

    /* renamed from: f  reason: collision with root package name */
    a f54460f = new a() {
        public final boolean a(int i) {
            return true;
        }
    };
    private j g;
    private boolean h;

    public interface a {
        boolean a(int i);
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f54455a, false, 57852, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f54455a, false, 57852, new Class[0], Integer.TYPE)).intValue();
        }
        PagerAdapter adapter = getAdapter();
        if (adapter == null) {
            return 0;
        }
        return adapter.getCount();
    }

    public final ScrollableViewPager a(a aVar) {
        this.f54460f = aVar;
        return this;
    }

    public void setBlockCanScroll(boolean z) {
        this.h = z;
    }

    public void setOnFlingEndListener(j jVar) {
        this.g = jVar;
    }

    public ScrollableViewPager(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f54455a, false, 57847, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f54455a, false, 57847, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.f54456b = u.a(8.0d);
        setDefaultGutterSize(0);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f54455a, false, 57849, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f54455a, false, 57849, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.ugc.aweme.profile.a.a(motionEvent2, getContext())) {
            return false;
        } else {
            if (!((this.f54457c && a(motionEvent)) || motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
                z = false;
            }
            if (z) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f54455a, false, 57850, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f54455a, false, 57850, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (!((this.f54457c && a(motionEvent)) || motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            z = false;
        }
        if (z) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    private boolean a(MotionEvent motionEvent) {
        boolean z = true;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f54455a, false, 57851, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f54455a, false, 57851, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f54458d = motionEvent.getX();
            this.f54459e = motionEvent.getY();
            return true;
        }
        float x = motionEvent.getX() - this.f54458d;
        float y = motionEvent.getY() - this.f54459e;
        if (Math.abs(x) < 1.0E-6f) {
            return true;
        }
        if (ey.a(getContext())) {
            x = -x;
        }
        if (x <= 0.0f) {
            if (getCurrentItem() < getItemCount() - 1 && this.f54460f.a(-1)) {
                z2 = true;
            }
            if ((action == 1 || action == 3) && !z2 && this.g != null && Math.abs(x) > ((float) this.f54456b) && Math.abs(x) > Math.abs(y)) {
                this.g.a();
            }
            z = z2;
        } else if (getCurrentItem() <= 0 || !this.f54460f.a(1)) {
            z = false;
        }
        if (!z && x > 0.0f) {
            this.f54458d = motionEvent.getX();
        }
        return z;
    }

    public ScrollableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{arrayList, Integer.valueOf(i), Integer.valueOf(i2)}, this, f54455a, false, 57848, new Class[]{ArrayList.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arrayList, Integer.valueOf(i), Integer.valueOf(i2)}, this, f54455a, false, 57848, new Class[]{ArrayList.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            super.addFocusables(arrayList, i, i2);
        } catch (Exception e2) {
            Exception exc = e2;
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) exc);
            ExceptionMonitor.ensureNotReachHere((Throwable) exc);
        }
    }

    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{view, Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f54455a, false, 57853, new Class[]{View.class, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Byte.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f54455a, false, 57853, new Class[]{View.class, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.h || !v.a(view) || !super.canScroll(view, z, i, i2, i3)) {
            return false;
        } else {
            return true;
        }
    }
}

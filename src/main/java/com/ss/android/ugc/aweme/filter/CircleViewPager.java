package com.ss.android.ugc.aweme.filter;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.FloatRange;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.ies.uikit.viewpager.SSViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class CircleViewPager extends SSViewPager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47304a;

    /* renamed from: b  reason: collision with root package name */
    private int f47305b;

    /* renamed from: c  reason: collision with root package name */
    private a f47306c;

    /* renamed from: d  reason: collision with root package name */
    private int f47307d;

    /* renamed from: e  reason: collision with root package name */
    private b f47308e;

    public interface a {
        void a();

        void a(float f2);
    }

    public interface b {
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f47304a, false, 44010, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47304a, false, 44010, new Class[0], Void.TYPE);
            return;
        }
        setOnTouchListener(new com.ss.android.ugc.aweme.h.b(1.2f, 200, null));
    }

    public void setOnScrolledListener(a aVar) {
        this.f47306c = aVar;
    }

    public void setOnViewPagerTouchEventListener(b bVar) {
        this.f47308e = bVar;
    }

    public CircleViewPager(Context context) {
        super(context);
        a();
    }

    public void dispatchDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f47304a, false, 44011, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f47304a, false, 44011, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        this.f47305b = getWidth();
        super.dispatchDraw(canvas);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f47304a, false, 44015, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f47304a, false, 44015, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        motionEvent.getAction();
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setStartItem(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f47304a, false, 44013, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f47304a, false, 44013, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f47307d = i;
        setCurrentItem(i);
    }

    public final void a(@FloatRange(from = -1.0d, to = 1.0d) float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f47304a, false, 44012, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f47304a, false, 44012, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        float currentItem = ((((float) getCurrentItem()) + f2) - ((float) this.f47307d)) * ((float) this.f47305b);
        if (currentItem >= ((float) ((-this.f47307d) * this.f47305b))) {
            if (currentItem > ((float) (((getAdapter().getCount() - this.f47307d) - 1) * this.f47305b))) {
                if (this.f47306c != null) {
                    this.f47306c.a();
                }
                return;
            }
            if (this.f47306c != null) {
                this.f47306c.a(f2);
            }
            scrollTo((int) currentItem, 0);
        }
    }

    public CircleViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }
}

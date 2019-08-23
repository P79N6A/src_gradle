package com.bytedance.android.livesdk.overscroll;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.livesdk.overscroll.adapters.IOverScrollDecoratorAdapter;
import com.bytedance.android.livesdk.overscroll.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class g extends e {
    public static ChangeQuickRedirect m;

    protected static class a extends e.a {

        /* renamed from: d  reason: collision with root package name */
        public static ChangeQuickRedirect f16780d;

        public a() {
            this.f16755a = View.TRANSLATION_Y;
        }

        public final void a(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f16780d, false, 12574, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f16780d, false, 12574, new Class[]{View.class}, Void.TYPE);
                return;
            }
            this.f16756b = view.getTranslationY();
            this.f16757c = (float) view.getHeight();
        }
    }

    protected static class b extends e.C0114e {

        /* renamed from: d  reason: collision with root package name */
        public static ChangeQuickRedirect f16781d;

        public final boolean a(View view, MotionEvent motionEvent) {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f16781d, false, 12575, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f16781d, false, 12575, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
            } else if (motionEvent.getHistorySize() == 0) {
                return false;
            } else {
                float y = motionEvent.getY(0) - motionEvent.getHistoricalY(0, 0);
                if (Math.abs(motionEvent.getX(0) - motionEvent.getHistoricalX(0, 0)) > Math.abs(y)) {
                    return false;
                }
                this.f16767a = view.getTranslationY();
                this.f16768b = y;
                if (this.f16768b > 0.0f) {
                    z = true;
                }
                this.f16769c = z;
                return true;
            }
        }
    }

    public final e.C0114e b() {
        if (!PatchProxy.isSupport(new Object[0], this, m, false, 12569, new Class[0], e.C0114e.class)) {
            return new b();
        }
        return (e.C0114e) PatchProxy.accessDispatch(new Object[0], this, m, false, 12569, new Class[0], e.C0114e.class);
    }

    public final e.a c() {
        if (!PatchProxy.isSupport(new Object[0], this, m, false, 12570, new Class[0], e.a.class)) {
            return new a();
        }
        return (e.a) PatchProxy.accessDispatch(new Object[0], this, m, false, 12570, new Class[0], e.a.class);
    }

    public final void a(View view, float f2) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2)}, this, m, false, 12571, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2)}, this, m, false, 12571, new Class[]{View.class, Float.TYPE}, Void.TYPE);
            return;
        }
        view2.setTranslationY(b(view, f2));
    }

    private float b(View view, float f2) {
        float f3;
        if (PatchProxy.isSupport(new Object[]{view, Float.valueOf(f2)}, this, m, false, 12573, new Class[]{View.class, Float.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{view, Float.valueOf(f2)}, this, m, false, 12573, new Class[]{View.class, Float.TYPE}, Float.TYPE)).floatValue();
        }
        if (f2 < 0.0f) {
            if (this.l == null) {
                return 0.0f;
            }
            float height = (float) (this.l.getHeight() - 5);
            if (Math.abs(f2) > Math.abs(height)) {
                f3 = -height;
            } else {
                f3 = f2;
            }
            this.l.setTranslationY((((float) view.getBottom()) + f3) - 5.0f);
        } else if (f2 <= 0.0f) {
            f3 = f2;
        } else if (this.k == null) {
            return 0.0f;
        } else {
            float height2 = (float) (this.k.getHeight() - 5);
            if (Math.abs(f2) <= Math.abs(height2)) {
                height2 = f2;
            }
            this.k.setTranslationY((f3 - ((float) this.k.getHeight())) + 5.0f);
        }
        return f3;
    }

    public g(IOverScrollDecoratorAdapter iOverScrollDecoratorAdapter, View view, View view2) {
        this(iOverScrollDecoratorAdapter, null, view2, 3.0f, 1.0f, -2.0f);
    }

    public final void a(View view, float f2, MotionEvent motionEvent) {
        View view2 = view;
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2), motionEvent2}, this, m, false, 12572, new Class[]{View.class, Float.TYPE, MotionEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2), motionEvent2}, this, m, false, 12572, new Class[]{View.class, Float.TYPE, MotionEvent.class}, Void.TYPE);
            return;
        }
        float b2 = b(view, f2);
        view2.setTranslationY(b2);
        motionEvent2.offsetLocation(b2 - motionEvent2.getY(0), 0.0f);
    }

    private g(IOverScrollDecoratorAdapter iOverScrollDecoratorAdapter, View view, View view2, float f2, float f3, float f4) {
        super(iOverScrollDecoratorAdapter, view, view2, -2.0f, 3.0f, 1.0f);
    }
}

package com.bytedance.android.live.core.utils;

import android.app.Activity;
import android.support.annotation.CallSuper;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.ContentFrameLayout;
import android.view.MotionEvent;
import com.bytedance.android.live.core.setting.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.HashSet;
import java.util.Set;

public final class SlideFinishUtil {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8200a;

    /* renamed from: b  reason: collision with root package name */
    public static l<Boolean> f8201b = new l<>("enable_slide_finish", Boolean.FALSE, "右滑退出页面");

    /* renamed from: c  reason: collision with root package name */
    static Set<Class<? extends Activity>> f8202c = new HashSet();

    public static class MFrameLayout extends ContentFrameLayout {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8203a;

        /* renamed from: b  reason: collision with root package name */
        boolean f8204b;

        /* renamed from: c  reason: collision with root package name */
        boolean f8205c;

        /* renamed from: d  reason: collision with root package name */
        x f8206d;

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f8203a, false, 1273, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f8203a, false, 1273, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            } else if (this.f8204b) {
                return true;
            } else {
                return super.onInterceptTouchEvent(motionEvent);
            }
        }

        public void requestDisallowInterceptTouchEvent(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f8203a, false, 1274, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f8203a, false, 1274, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            super.requestDisallowInterceptTouchEvent(z);
            this.f8205c = z;
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            MotionEvent motionEvent2 = motionEvent;
            if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f8203a, false, 1272, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f8203a, false, 1272, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            if (motionEvent.getAction() == 0) {
                this.f8205c = false;
                this.f8204b = false;
            }
            if (this.f8206d == null) {
                this.f8206d = new x();
                this.f8206d.f8330c.subscribe((Consumer<? super T>) new ad<Object>(this));
            }
            super.dispatchTouchEvent(motionEvent);
            x xVar = this.f8206d;
            if (PatchProxy.isSupport(new Object[]{motionEvent2}, xVar, x.f8328a, false, 1202, new Class[]{MotionEvent.class}, Void.TYPE)) {
                x xVar2 = xVar;
                PatchProxy.accessDispatch(new Object[]{motionEvent2}, xVar2, x.f8328a, false, 1202, new Class[]{MotionEvent.class}, Void.TYPE);
            } else {
                xVar.f8331d.onTouchEvent(motionEvent2);
            }
            return true;
        }
    }

    public static class SlideFinishPageChangeListener extends ViewPager.SimpleOnPageChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8207a;

        /* renamed from: b  reason: collision with root package name */
        private final ViewPager f8208b;

        public SlideFinishPageChangeListener(ViewPager viewPager) {
            this.f8208b = viewPager;
        }

        @CallSuper
        public void onPageScrolled(int i, float f2, int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f8207a, false, 1276, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f8207a, false, 1276, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (i == 0 && f2 == 0.0f && this.f8208b != null && this.f8208b.getParent() != null) {
                this.f8208b.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
    }

    public static void a(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, null, f8200a, true, 1270, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, null, f8200a, true, 1270, new Class[]{Activity.class}, Void.TYPE);
        } else if (activity != null) {
            f8202c.add(activity.getClass());
        }
    }
}

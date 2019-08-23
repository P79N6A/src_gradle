package com.ss.android.ugc.aweme.commercialize.utils;

import android.graphics.Rect;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ForegroundActivityMonitor;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import java.util.concurrent.atomic.AtomicInteger;

public final class ao {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39740a;

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicInteger f39741b = new AtomicInteger(1);

    public static int a() {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[0], null, f39740a, true, 32684, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f39740a, true, 32684, new Class[0], Integer.TYPE)).intValue();
        }
        do {
            i = f39741b.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!f39741b.compareAndSet(i, i2));
        return i;
    }

    public static boolean b(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, null, f39740a, true, 32679, new Class[]{View.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2}, null, f39740a, true, 32679, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
        }
        Rect rect = new Rect();
        if (!a(view) || !view2.getGlobalVisibleRect(rect) || rect.isEmpty()) {
            return false;
        }
        return true;
    }

    private static boolean c(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, null, f39740a, true, 32677, new Class[]{View.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, null, f39740a, true, 32677, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
        } else if (view == null || !ViewCompat.isAttachedToWindow(view)) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, null, f39740a, true, 32678, new Class[]{View.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, null, f39740a, true, 32678, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
        } else if (!c(view)) {
            return false;
        } else {
            View view2 = view;
            while (view2.getVisibility() == 0 && view2.getAlpha() >= 1.0E-6f) {
                if (view2.getId() != 16908290) {
                    ViewParent parent = view2.getParent();
                    if (parent instanceof View) {
                        view2 = (View) parent;
                    }
                }
                return true;
            }
            return false;
        }
    }

    public static void a(View view, int i) {
        View view2 = view;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i)}, null, f39740a, true, 32682, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i)}, null, f39740a, true, 32682, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
        } else if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && layoutParams.height != i2) {
                layoutParams.height = i2;
                view2.setLayoutParams(layoutParams);
            }
        }
    }

    public static void a(View view, Runnable runnable) {
        View view2 = view;
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{view2, runnable2}, null, f39740a, true, 32681, new Class[]{View.class, Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, runnable2}, null, f39740a, true, 32681, new Class[]{View.class, Runnable.class}, Void.TYPE);
        } else if (runnable2 == null || !c(view)) {
        } else {
            if (!b(view) || !AwemeAppData.p().q() || ForegroundActivityMonitor.a(view.getContext()) == 2) {
                view2.postDelayed(new ap(view2, runnable2), 100);
            } else {
                runnable.run();
            }
        }
    }
}

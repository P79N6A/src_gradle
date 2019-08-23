package com.ss.android.ugc.aweme.im.sdk.chat.view;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class b extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51038a;

    /* renamed from: b  reason: collision with root package name */
    public int f51039b;

    /* renamed from: c  reason: collision with root package name */
    public int f51040c;

    /* renamed from: d  reason: collision with root package name */
    public int f51041d;

    /* renamed from: e  reason: collision with root package name */
    private View f51042e;

    /* renamed from: f  reason: collision with root package name */
    private Context f51043f;
    private int g;

    public final void a(View view, Activity activity) {
        if (PatchProxy.isSupport(new Object[]{view, activity}, this, f51038a, false, 51412, new Class[]{View.class, Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, activity}, this, f51038a, false, 51412, new Class[]{View.class, Activity.class}, Void.TYPE);
            return;
        }
        this.f51042e = view;
        this.f51043f = activity;
        setContentView(view);
        setWidth(-2);
        setHeight(-2);
        setOutsideTouchable(true);
        view.measure(0, 0);
        this.f51041d = view.getMeasuredWidth();
        this.g = view.getMeasuredHeight();
    }

    private void b(View view, int i, int i2) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f51038a, false, 51415, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f51038a, false, 51415, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        showAtLocation(view, this.f51039b, iArr[0] + i, (iArr[1] - this.g) + i2);
    }

    private void d(View view, int i, int i2) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f51038a, false, 51417, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f51038a, false, 51417, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        showAtLocation(view, this.f51039b, iArr[0] - view.getWidth(), iArr[1]);
    }

    private void e(View view, int i, int i2) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f51038a, false, 51418, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f51038a, false, 51418, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        showAtLocation(view, this.f51039b, iArr[0] + view.getWidth(), iArr[1]);
    }

    private void c(View view, int i, int i2) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f51038a, false, 51416, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f51038a, false, 51416, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i3 = this.f51039b;
        double width = (double) (iArr[0] + (view.getWidth() / 2));
        double d2 = (double) this.f51041d;
        Double.isNaN(d2);
        Double.isNaN(width);
        showAtLocation(view, i3, (int) (width - (d2 * 0.6666666666666666d)), iArr[1] + view.getHeight());
    }

    public final void a(View view, int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, f51038a, false, 51414, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2)}, this, f51038a, false, 51414, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        dismiss();
        if (view != null) {
            switch (this.f51040c) {
                case 0:
                    b(view, i, i2);
                    return;
                case 1:
                    c(view, i, i2);
                    return;
                case 2:
                    d(view, i, i2);
                    return;
                case 3:
                    e(view, i, i2);
                    break;
            }
        }
    }

    public final void a(View view, Activity activity, int i, int i2) {
        View view2 = view;
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{view2, activity2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f51038a, false, 51413, new Class[]{View.class, Activity.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, activity2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f51038a, false, 51413, new Class[]{View.class, Activity.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f51042e = view2;
        this.f51043f = activity2;
        setContentView(view);
        setWidth(-2);
        setHeight(-2);
        setOutsideTouchable(true);
        this.f51041d = i;
        this.g = i2;
    }
}

package com.bytedance.android.livesdk.browser.h;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9408a;

    /* renamed from: b  reason: collision with root package name */
    private int f9409b;

    /* renamed from: c  reason: collision with root package name */
    private int f9410c;

    /* renamed from: d  reason: collision with root package name */
    private int f9411d;

    /* renamed from: e  reason: collision with root package name */
    private int f9412e;

    /* renamed from: f  reason: collision with root package name */
    private long f9413f;
    private int g;

    public a(Context context) {
        this.g = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final void a(MotionEvent motionEvent) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f9408a, false, 3800, new Class[]{MotionEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f9408a, false, 3800, new Class[]{MotionEvent.class}, Void.TYPE);
            return;
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.f9409b = (int) motionEvent.getX();
                this.f9410c = (int) motionEvent.getY();
                return;
            case 1:
                this.f9411d = (int) motionEvent.getX();
                this.f9412e = (int) motionEvent.getY();
                int i = this.f9409b;
                int i2 = this.f9410c;
                int i3 = this.f9411d;
                int i4 = this.f9412e;
                int i5 = this.g;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f9408a, false, 3801, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f9408a, false, 3801, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
                } else if (Math.abs(i3 - i) >= i5 || Math.abs(i4 - i2) >= i5) {
                    z = false;
                }
                if (!z) {
                    this.f9413f = 0;
                    this.f9411d = 0;
                    this.f9412e = 0;
                    break;
                } else {
                    this.f9413f = System.currentTimeMillis();
                    return;
                }
        }
    }
}

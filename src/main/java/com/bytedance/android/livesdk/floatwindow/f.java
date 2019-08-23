package com.bytedance.android.livesdk.floatwindow;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class f extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14541a;

    /* renamed from: b  reason: collision with root package name */
    final WindowManager f14542b;

    /* renamed from: c  reason: collision with root package name */
    final WindowManager.LayoutParams f14543c = new WindowManager.LayoutParams();

    /* renamed from: d  reason: collision with root package name */
    View f14544d;

    /* renamed from: e  reason: collision with root package name */
    int f14545e;

    /* renamed from: f  reason: collision with root package name */
    int f14546f;
    private final Context g;
    private d h;
    private boolean i;

    public final int a() {
        return this.f14545e;
    }

    public final int b() {
        return this.f14546f;
    }

    /* access modifiers changed from: package-private */
    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f14541a, false, 9067, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14541a, false, 9067, new Class[0], Void.TYPE);
            return;
        }
        this.i = true;
        this.f14542b.removeView(this.f14544d);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f14541a, false, 9069, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f14541a, false, 9069, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (!this.i) {
            this.f14543c.x = i2;
            this.f14545e = i2;
            this.f14542b.updateViewLayout(this.f14544d, this.f14543c);
        }
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f14541a, false, 9071, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f14541a, false, 9071, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (!this.i) {
            this.f14543c.y = i2;
            this.f14546f = i2;
            this.f14542b.updateViewLayout(this.f14544d, this.f14543c);
        }
    }

    public f(Context context, d dVar) {
        this.g = context;
        this.h = dVar;
        this.f14542b = (WindowManager) context.getSystemService("window");
        this.f14543c.format = 1;
        this.f14543c.flags = 552;
        this.f14543c.windowAnimations = 0;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f14541a, false, 9068, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f14541a, false, 9068, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (!this.i) {
            this.f14543c.x = i2;
            this.f14545e = i2;
            this.f14543c.y = i3;
            this.f14546f = i3;
            this.f14542b.updateViewLayout(this.f14544d, this.f14543c);
        }
    }

    public final void b(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f14541a, false, 9070, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f14541a, false, 9070, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f14543c.width = i2;
        this.f14543c.height = i3;
        this.f14542b.updateViewLayout(this.f14544d, this.f14543c);
    }
}

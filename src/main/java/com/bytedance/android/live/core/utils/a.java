package com.bytedance.android.live.core.utils;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;

public final class a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8209a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<View> f8210b;

    /* renamed from: c  reason: collision with root package name */
    private ViewTreeObserver f8211c;

    /* renamed from: d  reason: collision with root package name */
    private int f8212d;

    /* renamed from: e  reason: collision with root package name */
    private ViewGroup.LayoutParams f8213e;

    public final void onGlobalLayout() {
        int i;
        Runnable runnable;
        if (PatchProxy.isSupport(new Object[0], this, f8209a, false, 954, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8209a, false, 954, new Class[0], Void.TYPE);
            return;
        }
        View view = (View) this.f8210b.get();
        if (view == null) {
            if (this.f8211c.isAlive()) {
                this.f8211c.removeGlobalOnLayoutListener(this);
            }
            return;
        }
        if (PatchProxy.isSupport(new Object[]{view}, this, f8209a, false, 953, new Class[]{View.class}, Integer.TYPE)) {
            i = ((Integer) PatchProxy.accessDispatch(new Object[]{view}, this, f8209a, false, 953, new Class[]{View.class}, Integer.TYPE)).intValue();
        } else {
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            if (Build.VERSION.SDK_INT >= 23) {
                WindowInsets rootWindowInsets = view.getRootWindowInsets();
                if (!(rootWindowInsets == null || rootWindowInsets.getStableInsetTop() == rect.top || rootWindowInsets.getStableInsetTop() >= rect.top)) {
                    i = rect.bottom - (rect.top - rootWindowInsets.getStableInsetTop());
                }
            }
            i = rect.bottom;
        }
        if (i != this.f8212d) {
            this.f8213e.height = i;
            view.setLayoutParams(this.f8213e);
            view.getClass();
            if (PatchProxy.isSupport(new Object[]{view}, null, b.f8242a, true, 955, new Class[]{View.class}, Runnable.class)) {
                runnable = (Runnable) PatchProxy.accessDispatch(new Object[]{view}, null, b.f8242a, true, 955, new Class[]{View.class}, Runnable.class);
            } else {
                runnable = new b(view);
            }
            view.post(runnable);
            this.f8212d = i;
        }
    }

    public a(View view) {
        if (view != null) {
            this.f8210b = new WeakReference<>(view);
            this.f8211c = view.getViewTreeObserver();
            this.f8211c.addOnGlobalLayoutListener(this);
            this.f8213e = view.getLayoutParams();
        }
    }
}

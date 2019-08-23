package com.ss.android.ugc.aweme.live;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView;
import com.ss.android.ugc.aweme.live.sdk.chatroom.ui.a;
import com.ss.android.ugc.aweme.port.internal.b;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.story.live.c;
import com.ss.android.ugc.aweme.views.LiveButtonView;

public final class f implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53370a;

    /* renamed from: b  reason: collision with root package name */
    public a f53371b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f53372c;

    public final void a(int i, int i2, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f53370a, false, 55404, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f53370a, false, 55404, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f53370a, false, 55405, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f53370a, false, 55405, new Class[]{Boolean.TYPE}, Void.TYPE);
        }
    }

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f53370a, false, 55394, new Class[0], Boolean.TYPE)) {
            return new c().c();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f53370a, false, 55394, new Class[0], Boolean.TYPE)).booleanValue();
    }

    @Nullable
    public final View b() {
        if (!PatchProxy.isSupport(new Object[0], this, f53370a, false, 55396, new Class[0], View.class)) {
            return this.f53371b.a();
        }
        return (View) PatchProxy.accessDispatch(new Object[0], this, f53370a, false, 55396, new Class[0], View.class);
    }

    @Nullable
    public final ImageView c() {
        if (PatchProxy.isSupport(new Object[0], this, f53370a, false, 55401, new Class[0], ImageView.class)) {
            return (ImageView) PatchProxy.accessDispatch(new Object[0], this, f53370a, false, 55401, new Class[0], ImageView.class);
        }
        a aVar = this.f53371b;
        return null;
    }

    @Nullable
    public final View d() {
        if (PatchProxy.isSupport(new Object[0], this, f53370a, false, 55402, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f53370a, false, 55402, new Class[0], View.class);
        }
        a aVar = this.f53371b;
        return null;
    }

    public final void a(LiveButtonView.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f53370a, false, 55398, new Class[]{LiveButtonView.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f53370a, false, 55398, new Class[]{LiveButtonView.a.class}, Void.TYPE);
            return;
        }
        if (this.f53371b != null) {
            this.f53371b.a(aVar);
        }
    }

    public final void b(final ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f53370a, false, 55400, new Class[]{ViewGroup.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f53370a, false, 55400, new Class[]{ViewGroup.class}, Void.TYPE);
            return;
        }
        if (this.f53371b != null && this.f53372c) {
            this.f53371b.c();
            this.f53372c = false;
            viewGroup.postDelayed(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f53373a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f53373a, false, 55406, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f53373a, false, 55406, new Class[0], Void.TYPE);
                        return;
                    }
                    if (viewGroup != null && !f.this.f53372c) {
                        viewGroup.removeView(f.this.f53371b.a());
                    }
                }
            }, 300);
        }
    }

    public final void a(ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f53370a, false, 55399, new Class[]{ViewGroup.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f53370a, false, 55399, new Class[]{ViewGroup.class}, Void.TYPE);
            return;
        }
        if (this.f53371b != null) {
            viewGroup.removeAllViews();
            this.f53372c = true;
            viewGroup.addView(this.f53371b.a());
            this.f53371b.b();
        }
    }

    public final void a(View... viewArr) {
        if (PatchProxy.isSupport(new Object[]{viewArr}, this, f53370a, false, 55397, new Class[]{View[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewArr}, this, f53370a, false, 55397, new Class[]{View[].class}, Void.TYPE);
            return;
        }
        if (this.f53371b != null) {
            this.f53371b.a(viewArr);
        }
    }

    public final void a(Context context, LifecycleOwner lifecycleOwner, Fragment fragment) {
        Context context2 = context;
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{context2, lifecycleOwner, fragment2}, this, f53370a, false, 55395, new Class[]{Context.class, LifecycleOwner.class, Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, lifecycleOwner, fragment2}, this, f53370a, false, 55395, new Class[]{Context.class, LifecycleOwner.class, Fragment.class}, Void.TYPE);
            return;
        }
        if (this.f53371b == null) {
            this.f53371b = new TTLiveBroadcastView(context, fragment2);
            if (((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().enableFullScreen()) {
                View b2 = b();
                ((ViewGroup.MarginLayoutParams) b2.getLayoutParams()).bottomMargin += (int) UIUtils.dip2Px(context, 20.0f);
                b2.requestLayout();
            }
        }
    }
}

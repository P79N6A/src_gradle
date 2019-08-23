package com.bytedance.android.livesdk;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdkapi.g.c;
import com.bytedance.android.livesdkapi.g.d;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.p;
import com.bytedance.android.livesdkapi.host.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class e implements IHostApp {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13682a;

    /* renamed from: b  reason: collision with root package name */
    private IHostApp f13683b;

    public final void a(FragmentActivity fragmentActivity, String str, String str2) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity2, str3, str4}, this, f13682a, false, 2509, new Class[]{FragmentActivity.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity2, str3, str4}, this, f13682a, false, 2509, new Class[]{FragmentActivity.class, String.class, String.class}, Void.TYPE);
            return;
        }
        this.f13683b.a(fragmentActivity2, str3, str4);
    }

    public final void a(FragmentActivity fragmentActivity, String str) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity2, str2}, this, f13682a, false, 2510, new Class[]{FragmentActivity.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity2, str2}, this, f13682a, false, 2510, new Class[]{FragmentActivity.class, String.class}, Void.TYPE);
            return;
        }
        this.f13683b.a(fragmentActivity2, str2);
    }

    public final boolean a(Activity activity, String str) {
        Activity activity2 = activity;
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{activity2, str2}, this, f13682a, false, 2511, new Class[]{Activity.class, String.class}, Boolean.TYPE)) {
            return this.f13683b.a(activity2, str2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, str2}, this, f13682a, false, 2511, new Class[]{Activity.class, String.class}, Boolean.TYPE)).booleanValue();
    }

    public final void a(@NonNull AppCompatActivity appCompatActivity, @NonNull FragmentManager fragmentManager, @NonNull String str, @NonNull FrameLayout frameLayout, @NonNull q qVar) {
        if (PatchProxy.isSupport(new Object[]{appCompatActivity, fragmentManager, str, frameLayout, qVar}, this, f13682a, false, 2516, new Class[]{AppCompatActivity.class, FragmentManager.class, String.class, FrameLayout.class, q.class}, Void.TYPE)) {
            Object[] objArr = {appCompatActivity, fragmentManager, str, frameLayout, qVar};
            PatchProxy.accessDispatch(objArr, this, f13682a, false, 2516, new Class[]{AppCompatActivity.class, FragmentManager.class, String.class, FrameLayout.class, q.class}, Void.TYPE);
            return;
        }
        this.f13683b.a(appCompatActivity, fragmentManager, str, frameLayout, qVar);
    }

    public final void a(View view, String str, Bitmap.Config config) {
        View view2 = view;
        String str2 = str;
        Bitmap.Config config2 = config;
        if (PatchProxy.isSupport(new Object[]{view2, str2, config2}, this, f13682a, false, 2522, new Class[]{View.class, String.class, Bitmap.Config.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, str2, config2}, this, f13682a, false, 2522, new Class[]{View.class, String.class, Bitmap.Config.class}, Void.TYPE);
            return;
        }
        this.f13683b.a(view2, str2, config2);
    }

    public final boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, f13682a, false, 2518, new Class[0], Boolean.TYPE)) {
            return this.f13683b.b();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f13682a, false, 2518, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f13682a, false, 2519, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13682a, false, 2519, new Class[0], Void.TYPE);
            return;
        }
        this.f13683b.c();
    }

    public final Class d() {
        if (!PatchProxy.isSupport(new Object[0], this, f13682a, false, 2521, new Class[0], Class.class)) {
            return this.f13683b.d();
        }
        return (Class) PatchProxy.accessDispatch(new Object[0], this, f13682a, false, 2521, new Class[0], Class.class);
    }

    public final c e() {
        if (!PatchProxy.isSupport(new Object[0], this, f13682a, false, 2528, new Class[0], c.class)) {
            return this.f13683b.e();
        }
        return (c) PatchProxy.accessDispatch(new Object[0], this, f13682a, false, 2528, new Class[0], c.class);
    }

    @NonNull
    public final String f() {
        if (!PatchProxy.isSupport(new Object[0], this, f13682a, false, 2529, new Class[0], String.class)) {
            return this.f13683b.f();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f13682a, false, 2529, new Class[0], String.class);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f13682a, false, 2517, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13682a, false, 2517, new Class[0], Void.TYPE);
            return;
        }
        this.f13683b.a();
    }

    public e(IHostApp iHostApp) {
        this.f13683b = iHostApp;
        b.a(IHostApp.class, this);
    }

    public final d a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, this, f13682a, false, 2527, new Class[]{Context.class}, d.class)) {
            return this.f13683b.a(context2);
        }
        return (d) PatchProxy.accessDispatch(new Object[]{context2}, this, f13682a, false, 2527, new Class[]{Context.class}, d.class);
    }

    public final Class a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f13682a, false, 2515, new Class[]{Integer.TYPE}, Class.class)) {
            return this.f13683b.a(i);
        }
        return (Class) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f13682a, false, 2515, new Class[]{Integer.TYPE}, Class.class);
    }

    public final Typeface b(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f13682a, false, 2523, new Class[]{Integer.TYPE}, Typeface.class)) {
            return this.f13683b.b(i);
        }
        return (Typeface) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f13682a, false, 2523, new Class[]{Integer.TYPE}, Typeface.class);
    }

    public final void a(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, f13682a, false, 2514, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, this, f13682a, false, 2514, new Class[]{Activity.class}, Void.TYPE);
        } else if (a.a() || a.d() || a.j()) {
            this.f13683b.a(activity2);
        } else {
            TTLiveSDKContext.getLiveService().a((Context) activity2, "");
        }
    }

    public final void b(Context context, String str, int i) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2, Integer.valueOf(i)}, this, f13682a, false, 2526, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2, Integer.valueOf(i)}, this, f13682a, false, 2526, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f13683b.b(context2, str2, i);
    }

    public final void a(Context context, String str, int i) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2, Integer.valueOf(i)}, this, f13682a, false, 2525, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2, Integer.valueOf(i)}, this, f13682a, false, 2525, new Class[]{Context.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f13683b.a(context2, str2, i);
    }

    public final void a(Activity activity, String str, String str2, p pVar) {
        Activity activity2 = activity;
        String str3 = str;
        String str4 = str2;
        p pVar2 = pVar;
        if (PatchProxy.isSupport(new Object[]{activity2, str3, str4, pVar2}, this, f13682a, false, 2512, new Class[]{Activity.class, String.class, String.class, p.class}, Void.TYPE)) {
            Object[] objArr = {activity2, str3, str4, pVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f13682a, false, 2512, new Class[]{Activity.class, String.class, String.class, p.class}, Void.TYPE);
            return;
        }
        this.f13683b.a(activity2, str3, str4, pVar2);
    }
}

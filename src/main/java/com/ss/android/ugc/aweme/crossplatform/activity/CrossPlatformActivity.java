package com.ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.NetworkUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.activity.b;
import com.ss.android.ugc.aweme.base.activity.d;
import com.ss.android.ugc.aweme.commercialize.utils.y;
import com.ss.android.ugc.aweme.crossplatform.base.e;
import com.ss.android.ugc.aweme.crossplatform.business.j;
import com.ss.android.ugc.aweme.crossplatform.business.k;
import com.ss.android.ugc.aweme.crossplatform.params.base.a;
import com.ss.android.ugc.aweme.crossplatform.view.g;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;

public class CrossPlatformActivity extends AmeActivity implements d, com.ss.android.ugc.aweme.crossplatform.base.d, k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40666a = null;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f40667b = true;

    /* renamed from: c  reason: collision with root package name */
    private AbsActivityContainer f40668c;

    /* renamed from: d  reason: collision with root package name */
    private a f40669d;

    /* renamed from: e  reason: collision with root package name */
    private b f40670e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f40671f = true;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f40666a, false, 34112, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40666a, false, 34112, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f40666a, false, 34113, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f40666a, false, 34113, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Nullable
    public final j a() {
        if (PatchProxy.isSupport(new Object[0], this, f40666a, false, 34110, new Class[0], j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[0], this, f40666a, false, 34110, new Class[0], j.class);
        } else if (this.f40668c == null) {
            return null;
        } else {
            return this.f40668c.getCrossPlatformBusiness();
        }
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f40666a, false, 34105, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40666a, false, 34105, new Class[0], Void.TYPE);
            return;
        }
        if (this.f40668c != null && this.f40671f) {
            this.f40668c.i();
        }
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f40666a, false, 34103, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40666a, false, 34103, new Class[0], Void.TYPE);
            return;
        }
        if (this.f40668c != null) {
            this.f40668c.f();
        }
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f40666a, false, 34106, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40666a, false, 34106, new Class[0], Void.TYPE);
        } else if (this.f40671f) {
            super.finish();
            if (this.f40669d != null && this.f40669d.f40808d.k) {
                super.overridePendingTransition(C0906R.anim.r, 0);
            }
            if (this.f40668c != null) {
                this.f40668c.j();
            }
            y.a(null);
            c.a().a(com.ss.android.ugc.aweme.ug.b.class);
        }
    }

    public final void a(@NotNull b bVar) {
        this.f40670e = bVar;
    }

    public void attachBaseContext(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f40666a, false, 34100, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f40666a, false, 34100, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        super.attachBaseContext(context);
        e.a().b();
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (PatchProxy.isSupport(new Object[]{configuration}, this, f40666a, false, 34107, new Class[]{Configuration.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{configuration}, this, f40666a, false, 34107, new Class[]{Configuration.class}, Void.TYPE);
            return;
        }
        super.onConfigurationChanged(configuration);
        if (this.f40668c != null) {
            this.f40668c.a(configuration);
        }
    }

    @Nullable
    public final <T extends g> T a(Class<T> cls) {
        if (PatchProxy.isSupport(new Object[]{cls}, this, f40666a, false, 34111, new Class[]{Class.class}, g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[]{cls}, this, f40666a, false, 34111, new Class[]{Class.class}, g.class);
        } else if (this.f40668c == null) {
            return null;
        } else {
            return this.f40668c.a(cls);
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f40666a, false, 34101, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f40666a, false, 34101, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onCreate", true);
        requestDisableOptimizeViewHierarchy();
        super.onCreate(bundle);
        this.f40669d = a.C0525a.a(getIntent());
        this.f40671f = getIntent().getBooleanExtra("key_support_back", true);
        a aVar = this.f40669d;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f40666a, false, 34102, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f40666a, false, 34102, new Class[]{a.class}, Void.TYPE);
        } else {
            this.f40668c = new MixActivityContainer(this, aVar);
            this.f40668c.a((e) new a(this));
            getLifecycle().addObserver(this.f40668c);
        }
        if (!this.f40668c.h()) {
            this.f40671f = true;
            finish();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onCreate", false);
        } else if (com.ss.android.g.a.a() || NetworkUtils.isNetworkAvailable(this)) {
            if (this.f40669d.f40808d.k) {
                super.overridePendingTransition(C0906R.anim.r, 0);
            }
            supportRequestWindowFeature(10);
            setContentView((int) C0906R.layout.aw);
            this.f40668c.k();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onCreate", false);
        } else {
            com.bytedance.ies.dmt.ui.d.a.b(com.ss.android.ugc.aweme.base.utils.d.a(), (int) C0906R.string.bgf, 0).a();
            this.f40671f = true;
            finish();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onCreate", false);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f40666a, false, 34108, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f40666a, false, 34108, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (this.f40670e != null) {
            this.f40670e.a(i3, i4, intent2);
        }
        if (this.f40668c != null) {
            this.f40668c.a(i3, i4, intent2);
        }
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), strArr, iArr}, this, f40666a, false, 34109, new Class[]{Integer.TYPE, String[].class, int[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), strArr, iArr}, this, f40666a, false, 34109, new Class[]{Integer.TYPE, String[].class, int[].class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.utils.permission.a.a((Activity) this, i, strArr, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }
}

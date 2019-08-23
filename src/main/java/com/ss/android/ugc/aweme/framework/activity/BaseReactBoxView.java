package com.ss.android.ugc.aweme.framework.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactRootView;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.ReactInstance;

public abstract class BaseReactBoxView extends AppCompatActivity implements DefaultHardwareBackBtnHandler, a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48455a;

    /* renamed from: b  reason: collision with root package name */
    public ReactRootView f48456b;

    /* renamed from: c  reason: collision with root package name */
    protected ImmersionBar f48457c;

    /* renamed from: d  reason: collision with root package name */
    public String f48458d = "";

    /* renamed from: e  reason: collision with root package name */
    public ReactInstanceManager f48459e;

    /* renamed from: f  reason: collision with root package name */
    private View f48460f;
    private ViewGroup g;
    private FrameLayout h;
    private long i;
    private boolean j;

    public abstract String a(Intent intent);

    public Bundle b(Intent intent) {
        return null;
    }

    public String getReactId() {
        return "";
    }

    BaseReactBoxView() {
    }

    public void invokeDefaultOnBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f48455a, false, 45847, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48455a, false, 45847, new Class[0], Void.TYPE);
            return;
        }
        super.onBackPressed();
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f48455a, false, 45852, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48455a, false, 45852, new Class[0], Void.TYPE);
        } else if (this.f48459e != null) {
            this.f48459e.onBackPressed();
        } else {
            super.onBackPressed();
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f48455a, false, 45848, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48455a, false, 45848, new Class[0], Void.TYPE);
            return;
        }
        this.f48459e.onHostPause(this);
        super.onPause();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f48455a, false, 45849, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48455a, false, 45849, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        this.f48459e.onHostResume(this, this);
    }

    public void e() {
        if (PatchProxy.isSupport(new Object[0], this, f48455a, false, 45851, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48455a, false, 45851, new Class[0], Void.TYPE);
            return;
        }
        this.g.setVisibility(8);
        this.h.setVisibility(0);
        if (!this.j) {
            ReactInstance.getProxy().a(SystemClock.elapsedRealtime() - this.i);
        }
        this.j = true;
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f48455a, false, 45850, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48455a, false, 45850, new Class[0], Void.TYPE);
            return;
        }
        this.f48459e.onHostDestroy(this);
        this.f48459e.detachRootView(this.f48456b);
        if (this.f48456b != null) {
            this.f48456b.unmountReactApplication();
        }
        ReactInstance.detachReactView(this, getReactId());
        if (this.f48457c != null) {
            this.f48457c.destroy();
        }
        super.onDestroy();
    }

    public void onCreate(Bundle bundle) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f48455a, false, 45844, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f48455a, false, 45844, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.i = SystemClock.elapsedRealtime();
        setContentView((int) C0906R.layout.a4x);
        this.f48458d = a(getIntent());
        ReactInstance.attachReactView(this);
        this.f48460f = findViewById(C0906R.id.chu);
        View view = this.f48460f;
        if (PatchProxy.isSupport(new Object[0], this, f48455a, false, 45845, new Class[0], Integer.TYPE)) {
            i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f48455a, false, 45845, new Class[0], Integer.TYPE)).intValue();
        } else {
            String stringExtra = getIntent().getStringExtra("bg_theme");
            if (TextUtils.isEmpty(stringExtra)) {
                i2 = -1;
            } else {
                i2 = Color.parseColor(Uri.decode(stringExtra));
            }
        }
        view.setBackgroundColor(i2);
        this.h = (FrameLayout) findViewById(C0906R.id.dxv);
        this.g = (ViewGroup) findViewById(C0906R.id.bj4);
        View a2 = ReactInstance.getConfig().a((Context) this);
        if (a2 != null) {
            findViewById(C0906R.id.bjf).setVisibility(8);
            findViewById(C0906R.id.bji).setVisibility(8);
            this.g.addView(a2, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f48456b = new ReactRootView(this);
        this.h.addView(this.f48456b, new FrameLayout.LayoutParams(-1, -1));
        this.f48459e = ReactInstance.getReactInstanceManager(getReactId());
        this.f48456b.post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48461a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f48461a, false, 45853, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f48461a, false, 45853, new Class[0], Void.TYPE);
                    return;
                }
                BaseReactBoxView.this.f48456b.startReactApplication(BaseReactBoxView.this.f48459e, BaseReactBoxView.this.f48458d, BaseReactBoxView.this.b(BaseReactBoxView.this.getIntent()));
            }
        });
        this.f48456b.postDelayed(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48463a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f48463a, false, 45854, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f48463a, false, 45854, new Class[0], Void.TYPE);
                    return;
                }
                BaseReactBoxView.this.e();
            }
        }, 3000);
    }
}

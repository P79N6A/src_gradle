package com.ss.android.ugc.aweme.base;

import android.app.Activity;
import android.app.ProgressDialog;
import android.arch.lifecycle.LifecycleObserver;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import butterknife.ButterKnife;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.analysis.c;
import com.ss.android.ugc.aweme.app.d.b;
import com.ss.android.ugc.aweme.base.component.e;
import com.ss.android.ugc.aweme.framework.services.IThemedService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

public class AmeActivity extends AbsActivity implements c {
    public static ChangeQuickRedirect changeQuickRedirect;
    static a sLoginComponentFactory;
    private e mLoginComponent;
    private ProgressDialog mProgressDialog;
    private IThemedService mThemeConfig;

    public interface a {
        e a();
    }

    public Analysis getAnalysis() {
        return null;
    }

    public boolean isRegisterEventBus() {
        return false;
    }

    public int subscriberPriority() {
        return 0;
    }

    @Deprecated
    public static a getLoginComponentFactory() {
        return sLoginComponentFactory;
    }

    @Deprecated
    public void showLoginDialog() {
        showLoginDialogWithShowPosition("");
    }

    @Deprecated
    public void showProtocolDialog() {
        if (getLoginComponent() != null) {
            com.ss.android.b.a.a.a.b(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f34467a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f34467a, false, 23948, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f34467a, false, 23948, new Class[0], Void.TYPE);
                        return;
                    }
                    AmeActivity.this.getLoginComponent().a();
                }
            });
        }
    }

    public void dismissProgressDialog() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 23946, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 23946, new Class[0], Void.TYPE);
            return;
        }
        if (this.mProgressDialog != null && this.mProgressDialog.isShowing()) {
            this.mProgressDialog.dismiss();
        }
    }

    @Deprecated
    @NonNull
    public e getLoginComponent() {
        if (this.mLoginComponent == null) {
            if (sLoginComponentFactory == null) {
                this.mLoginComponent = com.ss.android.ugc.aweme.login.e.f53762b;
            } else {
                this.mLoginComponent = sLoginComponentFactory.a();
            }
            if (this.mLoginComponent instanceof LifecycleObserver) {
                getLifecycle().addObserver((LifecycleObserver) this.mLoginComponent);
            }
        }
        return this.mLoginComponent;
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 23939, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 23939, new Class[0], Void.TYPE);
            return;
        }
        org.greenrobot.eventbus.c a2 = org.greenrobot.eventbus.c.a();
        if (isRegisterEventBus() && a2.b((Object) this)) {
            a2.c(this);
        }
        super.onDestroy();
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 23944, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 23944, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 23942, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 23942, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        com.ss.android.ugc.aweme.framework.core.a.b().a(null);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 23943, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 23943, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.framework.core.a.b().a(this);
        super.onResume();
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 23940, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 23940, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 23941, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 23941, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
    }

    public ProgressDialog showProgressDialog() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 23945, new Class[0], ProgressDialog.class)) {
            return showProgressDialog(getString(C0906R.string.b70));
        }
        return (ProgressDialog) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 23945, new Class[0], ProgressDialog.class);
    }

    @Deprecated
    public static void setLoginComponentFactory(a aVar) {
        sLoginComponentFactory = aVar;
    }

    @Deprecated
    public void showLoginDialogWithShowPosition(final String str) {
        if (getLoginComponent() != null) {
            com.ss.android.b.a.a.a.b(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f34469a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f34469a, false, 23949, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f34469a, false, 23949, new Class[0], Void.TYPE);
                        return;
                    }
                    AmeActivity.this.getLoginComponent().a(str);
                }
            });
        }
    }

    public void setContentView(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, changeQuickRedirect, false, 23938, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, changeQuickRedirect, false, 23938, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.setContentView(view);
        ButterKnife.bind((Activity) this);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, changeQuickRedirect, false, 23936, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, changeQuickRedirect, false, 23936, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        com.ss.android.ugc.aweme.framework.a.a.a("当前页面：" + getClass().getSimpleName());
        org.greenrobot.eventbus.c a2 = org.greenrobot.eventbus.c.a();
        if (!a2.b((Object) this) && isRegisterEventBus()) {
            a2.a((Object) this);
        }
        b.a().f34110b = true;
    }

    public void setContentView(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 23937, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 23937, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.setContentView(i);
        ButterKnife.bind((Activity) this);
    }

    public ProgressDialog showProgressDialog(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 23947, new Class[]{String.class}, ProgressDialog.class)) {
            return (ProgressDialog) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 23947, new Class[]{String.class}, ProgressDialog.class);
        }
        if (this.mThemeConfig == null) {
            this.mThemeConfig = (IThemedService) ServiceManager.get().getService(IThemedService.class);
        }
        if (this.mProgressDialog == null) {
            this.mProgressDialog = this.mThemeConfig.getThemedProgressDialog(this);
            this.mProgressDialog.setCanceledOnTouchOutside(false);
        }
        if (!this.mProgressDialog.isShowing()) {
            this.mProgressDialog.setMessage(str);
            this.mProgressDialog.show();
        }
        return this.mProgressDialog;
    }
}

package com.ss.android.ugc.aweme.qrcode;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.experiencekit.b;
import com.ss.android.experiencekit.c.d;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qrcode.d;
import com.ss.android.ugc.aweme.qrcode.f.a;
import com.ss.android.ugc.aweme.qrcode.v2.QRCodeActivityV2;
import com.ss.android.ugc.aweme.utils.ex;

public abstract class BaseScanQRCodeActivity extends AmeSSActivity implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3840a;

    /* renamed from: b  reason: collision with root package name */
    protected TextView f3841b;

    /* renamed from: c  reason: collision with root package name */
    protected TextTitleBar f3842c;

    /* renamed from: d  reason: collision with root package name */
    protected a f3843d;

    /* renamed from: e  reason: collision with root package name */
    protected View f3844e;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f3845f;

    public abstract void b();

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3840a, false, 70339, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3840a, false, 70339, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        b.b().a(com.ss.android.experiencekit.c.a.f29088b, d.END);
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3840a, false, 70340, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3840a, false, 70340, new Class[0], Void.TYPE);
            return;
        }
        this.f3841b = (TextView) findViewById(C0906R.id.df6);
        this.f3842c = (TextTitleBar) findViewById(C0906R.id.d3m);
        this.f3842c.getBackBtn().setImageResource(2130839369);
        this.f3844e = findViewById(C0906R.id.cv0);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f3840a, false, 70343, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3840a, false, 70343, new Class[0], Void.TYPE);
            return;
        }
        User curUser = com.ss.android.ugc.aweme.account.d.a().getCurUser();
        QRCodeActivityV2.a(this, new d.a().a(4, ex.h(curUser), "scan").a(ex.i(curUser), ex.j(curUser), ex.e(curUser)).f63387b);
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f3840a, false, 70342, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3840a, false, 70342, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view.getId() == C0906R.id.df6 && !com.ss.android.ugc.aweme.c.a.a.a(view)) {
            if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
                e.a((Activity) this, "scan", "click_my_qr", (Bundle) null, (f) new a(this));
            } else if (this.f3845f) {
                finish();
            } else {
                c();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3840a, false, 70338, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3840a, false, 70338, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        b.b().a(com.ss.android.experiencekit.c.a.f29088b, com.ss.android.experiencekit.c.d.BEGIN);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.dn);
        this.f3845f = getIntent().getBooleanExtra("enter_from", false);
        a();
        a(bundle);
    }

    public void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3840a, false, 70341, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3840a, false, 70341, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        this.f3841b.setOnClickListener(this);
        this.f3842c.setTitle((CharSequence) getString(C0906R.string.c1k));
        this.f3842c.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63309a;

            public final void a(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f63309a, false, 70346, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f63309a, false, 70346, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                BaseScanQRCodeActivity.this.finish();
            }

            public final void b(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f63309a, false, 70347, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f63309a, false, 70347, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                BaseScanQRCodeActivity.this.b();
            }
        });
    }
}

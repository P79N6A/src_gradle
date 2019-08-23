package com.ss.android.ugc.aweme.setting.ui;

import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.aj.b;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.ss.android.ugc.aweme.base.component.a;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.utils.ae;
import com.ss.android.ugc.aweme.utils.eb;

public class AboutActivity extends AmeBaseActivity implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64081a;

    /* renamed from: b  reason: collision with root package name */
    Dialog f64082b;

    /* renamed from: c  reason: collision with root package name */
    long[] f64083c = new long[5];

    /* renamed from: d  reason: collision with root package name */
    private AwemeAppData f64084d;
    @BindView(2131498544)
    CommonItemView mBusinessCertificate;
    @BindView(2131493779)
    CommonItemView mCopyEmail;
    @BindView(2131498545)
    CommonItemView mReportPhone;
    @BindView(2131498421)
    TextView mVersionView;
    @BindView(2131498546)
    CommonItemView mVisitWebsite;

    public final int a() {
        return C0906R.layout.a5;
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f64081a, false, 72372, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64081a, false, 72372, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AboutActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AboutActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f64081a, false, 72373, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f64081a, false, 72373, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AboutActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f64081a, false, 72364, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64081a, false, 72364, new Class[0], Void.TYPE);
            return;
        }
        eb.a(this, getResources().getColor(C0906R.color.yx));
    }

    @OnClick({2131496402})
    public void clickPre() {
        if (PatchProxy.isSupport(new Object[0], this, f64081a, false, 72370, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64081a, false, 72370, new Class[0], Void.TYPE);
            return;
        }
        System.arraycopy(this.f64083c, 1, this.f64083c, 0, this.f64083c.length - 1);
        this.f64083c[this.f64083c.length - 1] = SystemClock.uptimeMillis();
        if (SystemClock.uptimeMillis() - this.f64083c[0] <= 1000) {
            ((TextView) findViewById(C0906R.id.c4v)).setText(String.format("pre_install_channel: %s", new Object[]{b.b().a(k.a(), "pre_install_channel")}));
        }
    }

    @OnClick({2131493213})
    public void exit(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f64081a, false, 72366, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f64081a, false, 72366, new Class[]{View.class}, Void.TYPE);
            return;
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f64081a, false, 72360, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f64081a, false, 72360, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AboutActivity", "onCreate", true);
        super.onCreate(bundle);
        if (PatchProxy.isSupport(new Object[0], this, f64081a, false, 72361, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64081a, false, 72361, new Class[0], Void.TYPE);
        } else {
            this.f64084d = AwemeAppData.p();
            this.mVersionView.setText(this.f64084d.d());
        }
        if (PatchProxy.isSupport(new Object[0], this, f64081a, false, 72362, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64081a, false, 72362, new Class[0], Void.TYPE);
        } else {
            this.mVisitWebsite.setOnClickListener(this);
            this.mCopyEmail.setOnClickListener(this);
            this.mReportPhone.setOnClickListener(this);
            this.mBusinessCertificate.setOnClickListener(this);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AboutActivity", "onCreate", false);
    }

    public void onClick(View view) {
        a aVar;
        if (PatchProxy.isSupport(new Object[]{view}, this, f64081a, false, 72363, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f64081a, false, 72363, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.dv5) {
            if (PatchProxy.isSupport(new Object[0], this, f64081a, false, 72365, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64081a, false, 72365, new Class[0], Void.TYPE);
            } else {
                if (PatchProxy.isSupport(new Object[0], this, f64081a, false, 72367, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f64081a, false, 72367, new Class[0], Void.TYPE);
                } else {
                    if (this.f64082b == null) {
                        a.C0446a aVar2 = new a.C0446a();
                        aVar2.f34710b = "https://www.douyin.com/home/";
                        if (PatchProxy.isSupport(new Object[]{this}, aVar2, a.C0446a.f34709a, false, 24553, new Class[]{Context.class}, a.class)) {
                            a.C0446a aVar3 = aVar2;
                            aVar = (a) PatchProxy.accessDispatch(new Object[]{this}, aVar3, a.C0446a.f34709a, false, 24553, new Class[]{Context.class}, a.class);
                        } else {
                            a aVar4 = new a(this);
                            aVar4.f34703b = aVar2;
                            aVar = aVar4;
                        }
                        this.f64082b = aVar;
                    }
                    this.f64082b.show();
                }
            }
        } else if (id == C0906R.id.zt) {
            if (PatchProxy.isSupport(new Object[0], this, f64081a, false, 72368, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64081a, false, 72368, new Class[0], Void.TYPE);
            } else {
                ((ClipboardManager) getSystemService("clipboard")).setText(getString(C0906R.string.aad));
                com.bytedance.ies.dmt.ui.d.a.c((Context) this, (int) C0906R.string.jq).a();
            }
        } else if (id == C0906R.id.dv4) {
            if (PatchProxy.isSupport(new Object[0], this, f64081a, false, 72369, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64081a, false, 72369, new Class[0], Void.TYPE);
            } else {
                new ae(this, getString(C0906R.string.bzg), "").a();
            }
        } else if (id == C0906R.id.dv3) {
            if (PatchProxy.isSupport(new Object[0], this, f64081a, false, 72371, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64081a, false, 72371, new Class[0], Void.TYPE);
                return;
            }
            Intent intent = new Intent(this, CrossPlatformActivity.class);
            intent.setData(Uri.parse("http://aweme.snssdk.com/falcon/douyin/business_license"));
            intent.putExtra("hide_nav_bar", false);
            intent.putExtra("bundle_user_webview_title", true);
            startActivity(intent);
        }
    }
}

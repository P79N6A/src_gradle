package com.ss.android.ugc.aweme.account.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.b.a.a.a;
import com.ss.android.common.util.i;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.c;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.ss.android.ugc.aweme.net.e;
import com.ss.android.ugc.aweme.net.p;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.video.o;

public class RecoverAccountActivity extends AmeBaseActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32910a;

    /* renamed from: b  reason: collision with root package name */
    TextView f32911b;

    /* renamed from: c  reason: collision with root package name */
    TextView f32912c;

    /* renamed from: d  reason: collision with root package name */
    TextView f32913d;

    /* renamed from: e  reason: collision with root package name */
    public String f32914e;

    public final int a() {
        return C0906R.layout.dl;
    }

    public void onBackPressed() {
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f32910a, false, 21153, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32910a, false, 21153, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.RecoverAccountActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.RecoverAccountActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f32910a, false, 21154, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f32910a, false, 21154, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.RecoverAccountActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f32910a, false, 21151, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32910a, false, 21151, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        this.f32911b = (TextView) findViewById(C0906R.id.of);
        this.f32912c = (TextView) findViewById(C0906R.id.q6);
        this.f32913d = (TextView) findViewById(C0906R.id.b0i);
        if (d.a().getCurUser() != null) {
            this.f32913d.setText(C0906R.string.bxk);
        }
        this.f32911b.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32915a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f32915a, false, 21155, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f32915a, false, 21155, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                c.b().logout("recover_account");
            }
        });
        this.f32912c.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32917a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f32917a, false, 21156, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f32917a, false, 21156, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                final RecoverAccountActivity recoverAccountActivity = RecoverAccountActivity.this;
                AnonymousClass1 r1 = new e() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f32919a;

                    public final void a(Exception exc) {
                    }

                    public final void a(String str, Object obj) {
                        if (PatchProxy.isSupport(new Object[]{str, obj}, this, f32919a, false, 21157, new Class[]{String.class, Object.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str, obj}, this, f32919a, false, 21157, new Class[]{String.class, Object.class}, Void.TYPE);
                            return;
                        }
                        a.a(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f32922a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f32922a, false, 21158, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f32922a, false, 21158, new Class[0], Void.TYPE);
                                    return;
                                }
                                d.a().queryUser();
                            }
                        }, 5000);
                        User curUser = d.a().getCurUser();
                        curUser.setUserCancelled(false);
                        d.a().updateCurUser(curUser);
                        if (TextUtils.equals(RecoverAccountActivity.this.f32914e, "enter_from_login_ui_routine")) {
                            com.ss.android.ugc.aweme.app.accountsdk.a.a.a(null);
                        }
                        com.bytedance.ies.dmt.ui.d.a.b((Context) recoverAccountActivity, (int) C0906R.string.bxi).a();
                        RecoverAccountActivity.this.finish();
                    }
                };
                if (PatchProxy.isSupport(new Object[]{recoverAccountActivity, 0, r1}, null, com.ss.android.ugc.aweme.account.api.a.f31677a, true, 19593, new Class[]{Context.class, Integer.TYPE, e.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recoverAccountActivity, 0, r1}, null, com.ss.android.ugc.aweme.account.api.a.f31677a, true, 19593, new Class[]{Context.class, Integer.TYPE, e.class}, Void.TYPE);
                    return;
                }
                i iVar = new i("https://aweme.snssdk.com/passport/cancel/do/");
                iVar.a("type", PushConstants.PUSH_TYPE_NOTIFY);
                com.ss.android.ugc.aweme.net.c cVar = new com.ss.android.ugc.aweme.net.c(iVar.toString(), p.GET, String.class);
                cVar.a((e) r1);
                cVar.a();
            }
        });
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f32910a, false, 21149, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f32910a, false, 21149, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.RecoverAccountActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f32914e = getIntent().getStringExtra("enter_from");
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.RecoverAccountActivity", "onCreate", false);
    }

    public void onNewIntent(Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2}, this, f32910a, false, 21150, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent2}, this, f32910a, false, 21150, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        super.onNewIntent(intent);
        this.f32914e = intent2.getStringExtra("enter_from");
    }

    public static void a(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f32910a, true, 21152, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f32910a, true, 21152, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, RecoverAccountActivity.class);
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("enter_from", str2);
        }
        if (!o.v()) {
            o.b().h();
        } else {
            com.ss.android.ugc.playerkit.videoview.a.a().T();
        }
        context2.startActivity(intent);
    }
}

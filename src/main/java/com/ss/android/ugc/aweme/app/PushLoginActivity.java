package com.ss.android.ugc.aweme.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.sdk.activity.SSActivity;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.c;
import com.ss.android.ugc.aweme.app.accountsdk.d;
import com.ss.android.ugc.aweme.app.accountsdk.h;
import com.ss.android.ugc.aweme.base.component.f;
import java.util.ArrayList;

public class PushLoginActivity extends SSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33665a;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f33665a, false, 22579, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33665a, false, 22579, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.PushLoginActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.PushLoginActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f33665a, false, 22580, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f33665a, false, 22580, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.PushLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f33665a, false, 22578, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f33665a, false, 22578, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.PushLoginActivity", "onCreate", true);
        super.onCreate(bundle);
        final Intent intent = (Intent) getIntent().getParcelableExtra("next_step");
        final ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("next_steps");
        final String stringExtra = getIntent().getStringExtra("push_user_id");
        c.b().showLoginAndRegisterView(new IAccountService.d().a((Activity) this).a("push").b("push").a(true).a((IAccountService.g) new d()).a((IAccountService.h) new h(new f() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f33666a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f33666a, false, 22581, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f33666a, false, 22581, new Class[0], Void.TYPE);
                    return;
                }
                if (TextUtils.isEmpty(stringExtra) || stringExtra.equals(com.ss.android.ugc.aweme.account.d.a().getCurUserId())) {
                    if (intent != null) {
                        PushLoginActivity.this.startActivity(intent);
                    } else if (parcelableArrayListExtra != null && parcelableArrayListExtra.size() > 1) {
                        PushLoginActivity.this.startActivities((Intent[]) parcelableArrayListExtra.toArray(new Intent[parcelableArrayListExtra.size()]));
                    }
                }
                PushLoginActivity.this.finish();
            }

            public final void a(Bundle bundle) {
                if (PatchProxy.isSupport(new Object[]{null}, this, f33666a, false, 22582, new Class[]{Bundle.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{null}, this, f33666a, false, 22582, new Class[]{Bundle.class}, Void.TYPE);
                    return;
                }
                PushLoginActivity.this.finish();
            }
        })).a());
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.PushLoginActivity", "onCreate", false);
    }
}

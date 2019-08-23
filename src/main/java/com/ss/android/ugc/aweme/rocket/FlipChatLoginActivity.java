package com.ss.android.ugc.aweme.rocket;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.sdk.activity.SSActivity;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.c;
import com.ss.android.ugc.aweme.app.accountsdk.d;
import com.ss.android.ugc.aweme.app.accountsdk.h;
import com.ss.android.ugc.aweme.base.component.f;

public class FlipChatLoginActivity extends SSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63639a;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f63639a, false, 70886, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63639a, false, 70886, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.rocket.FlipChatLoginActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.rocket.FlipChatLoginActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f63639a, false, 70887, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f63639a, false, 70887, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.rocket.FlipChatLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f63639a, false, 70885, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f63639a, false, 70885, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.rocket.FlipChatLoginActivity", "onCreate", true);
        super.onCreate(bundle);
        final Uri uri = (Uri) getIntent().getParcelableExtra("flip_chat_uri");
        c.b().showLoginAndRegisterView(new IAccountService.d().a((Activity) this).a(true).a("flipchat").a((IAccountService.g) new d()).a((IAccountService.h) new h(new f() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63640a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f63640a, false, 70888, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f63640a, false, 70888, new Class[0], Void.TYPE);
                    return;
                }
                if (uri != null) {
                    f.b(FlipChatLoginActivity.this, uri);
                }
                FlipChatLoginActivity.this.finish();
            }

            public final void a(Bundle bundle) {
                if (PatchProxy.isSupport(new Object[]{null}, this, f63640a, false, 70889, new Class[]{Bundle.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{null}, this, f63640a, false, 70889, new Class[]{Bundle.class}, Void.TYPE);
                    return;
                }
                FlipChatLoginActivity.this.finish();
            }
        })).a());
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.rocket.FlipChatLoginActivity", "onCreate", false);
    }
}

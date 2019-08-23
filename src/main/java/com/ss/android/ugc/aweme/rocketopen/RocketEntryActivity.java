package com.ss.android.ugc.aweme.rocketopen;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.sdk.account.b.c.b;
import com.bytedance.sdk.account.b.c.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.sdk.activity.SSActivity;
import com.ss.android.ugc.aweme.w;

public class RocketEntryActivity extends SSActivity implements com.bytedance.sdk.account.b.a.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63668a;

    /* renamed from: b  reason: collision with root package name */
    public static a f63669b;

    public interface a {
        void a();

        void a(int i, String str);

        void a(String str);
    }

    public void onErrorIntent(@Nullable Intent intent) {
    }

    public void onReq(com.bytedance.sdk.account.b.c.a aVar) {
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f63668a, false, 70911, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63668a, false, 70911, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.rocketopen.RocketEntryActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.rocketopen.RocketEntryActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f63668a, false, 70912, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f63668a, false, 70912, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.rocketopen.RocketEntryActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f63668a, false, 70909, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f63668a, false, 70909, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.rocketopen.RocketEntryActivity", "onCreate", true);
        super.onCreate(bundle);
        com.feiliao.oauth.sdk.a.b.a.a(this).a(getIntent(), (com.bytedance.sdk.account.b.a.a) this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.rocketopen.RocketEntryActivity", "onCreate", false);
    }

    public void onResp(b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f63668a, false, 70910, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f63668a, false, 70910, new Class[]{b.class}, Void.TYPE);
            return;
        }
        if ((bVar2 instanceof c.b) && f63669b != null) {
            c.b bVar3 = (c.b) bVar2;
            if (bVar3.isSuccess() && !TextUtils.isEmpty(bVar3.f22265a)) {
                f63669b.a(bVar3.f22265a);
                w.g().a("flipchat", new Bundle());
            } else if (bVar3.isCancel()) {
                f63669b.a();
            } else {
                f63669b.a(bVar2.errorCode, bVar2.errorMsg);
            }
        }
        finish();
    }
}

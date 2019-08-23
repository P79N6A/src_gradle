package com.ss.android.ugc.aweme.ttopenapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.sdk.account.b.a.a;
import com.bytedance.sdk.account.b.c.b;
import com.bytedance.sdk.account.b.c.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class TtEntryActivity extends Activity implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74996a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f74997b = "TtEntryActivity";

    public void onReq(com.bytedance.sdk.account.b.c.a aVar) {
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f74996a, false, 87327, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74996a, false, 87327, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.ttopenapi.TtEntryActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.ttopenapi.TtEntryActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74996a, false, 87328, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74996a, false, 87328, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.ttopenapi.TtEntryActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onErrorIntent(@Nullable Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, this, f74996a, false, 87326, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent}, this, f74996a, false, 87326, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        a.a(null);
        finish();
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f74996a, false, 87324, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f74996a, false, 87324, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.ttopenapi.TtEntryActivity", "onCreate", true);
        super.onCreate(bundle);
        com.bytedance.sdk.account.open.tt.impl.a.a((Context) this).a(getIntent(), (a) this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.ttopenapi.TtEntryActivity", "onCreate", false);
    }

    public void onResp(b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f74996a, false, 87325, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f74996a, false, 87325, new Class[]{b.class}, Void.TYPE);
            return;
        }
        if (bVar2 instanceof c.b) {
            a.a((c.b) bVar2);
        }
        finish();
    }
}

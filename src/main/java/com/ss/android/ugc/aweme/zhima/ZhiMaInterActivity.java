package com.ss.android.ugc.aweme.zhima;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.c;
import com.ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;

public class ZhiMaInterActivity extends AmeBaseActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76949a;

    /* renamed from: b  reason: collision with root package name */
    private String f76950b;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f76949a, false, 90165, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76949a, false, 90165, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.zhima.ZhiMaInterActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.zhima.ZhiMaInterActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f76949a, false, 90166, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f76949a, false, 90166, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.zhima.ZhiMaInterActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        String str;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f76949a, false, 90164, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f76949a, false, 90164, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.zhima.ZhiMaInterActivity", "onCreate", true);
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("type");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = "other";
        }
        if (stringExtra.startsWith("live&")) {
            this.f76950b = "live";
        } else {
            this.f76950b = stringExtra;
        }
        if (!a.a() || this.f76950b.equals("live")) {
            if (a.a(this, this.f76950b)) {
                str = "https://aweme.snssdk.com/falcon/douyin_falcon/certification";
            } else {
                str = "https://aweme.snssdk.com/falcon/douyin_falcon/arti_certification";
            }
            String str2 = str + "/?type=" + stringExtra;
            Intent intent = new Intent(this, CrossPlatformActivity.class);
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("show_load_dialog", true);
            intent.putExtra("hide_nav_bar", true);
            intent.putExtra("hide_status_bar", !this.f76950b.equals("live"));
            intent.putExtras(bundle2);
            intent.setData(Uri.parse(str2));
            startActivity(intent);
            finish();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.zhima.ZhiMaInterActivity", "onCreate", false);
            return;
        }
        c.c().bindMobile(this, "", null, null);
        finish();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.zhima.ZhiMaInterActivity", "onCreate", false);
    }
}

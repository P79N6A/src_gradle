package com.ss.android.ugc.aweme.openauthorize;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.sdk.activity.SSActivity;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.utils.ad;
import java.util.ArrayList;

public class AwemeAuthorizeLoginActivity extends SSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58336a;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f58336a, false, 63347, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58336a, false, 63347, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f58336a, false, 63348, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f58336a, false, 63348, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f58336a, false, 63346, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f58336a, false, 63346, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity", "onCreate", true);
        super.onCreate(bundle);
        Bundle bundle2 = ad.a().a("only_login", true).f75487b;
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("authorize_hide_platforms");
        if (stringArrayListExtra != null) {
            bundle2.putStringArrayList("authorize_hide_platforms", stringArrayListExtra);
        }
        e.a((Activity) this, "authorize", "", bundle2, (f) new f() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58337a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f58337a, false, 63349, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f58337a, false, 63349, new Class[0], Void.TYPE);
                    return;
                }
                AwemeAuthorizeLoginActivity.this.setResult(-1);
                AwemeAuthorizeLoginActivity.this.finish();
            }

            public final void a(Bundle bundle) {
                if (PatchProxy.isSupport(new Object[]{null}, this, f58337a, false, 63350, new Class[]{Bundle.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{null}, this, f58337a, false, 63350, new Class[]{Bundle.class}, Void.TYPE);
                    return;
                }
                AwemeAuthorizeLoginActivity.this.setResult(0);
                AwemeAuthorizeLoginActivity.this.finish();
            }
        });
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity", "onCreate", false);
    }

    public static void a(Activity activity, int i, ArrayList<String> arrayList) {
        Activity activity2 = activity;
        ArrayList<String> arrayList2 = arrayList;
        if (PatchProxy.isSupport(new Object[]{activity2, 2001, arrayList2}, null, f58336a, true, 63345, new Class[]{Activity.class, Integer.TYPE, ArrayList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, 2001, arrayList2}, null, f58336a, true, 63345, new Class[]{Activity.class, Integer.TYPE, ArrayList.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(activity2, AwemeAuthorizeLoginActivity.class);
        if (arrayList2 != null) {
            intent.putStringArrayListExtra("authorize_hide_platforms", arrayList2);
        }
        activity2.startActivityForResult(intent, 2001);
    }
}

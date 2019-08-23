package com.ss.android.ugc.aweme.framework.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.f.a;
import java.util.UUID;

public class ReactBoxView extends BaseReactBoxView {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f48465f;
    public boolean g;
    private String h = UUID.randomUUID().toString();

    public Activity getActivity() {
        return this;
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f48465f, false, 45862, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f48465f, false, 45862, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.framework.activity.ReactBoxView", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.framework.activity.ReactBoxView", "onCreate", false);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f48465f, false, 45863, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48465f, false, 45863, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.framework.activity.ReactBoxView", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.framework.activity.ReactBoxView", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f48465f, false, 45864, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f48465f, false, 45864, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.framework.activity.ReactBoxView", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public String getReactId() {
        return this.h;
    }

    public /* bridge */ /* synthetic */ void invokeDefaultOnBackPressed() {
        super.invokeDefaultOnBackPressed();
    }

    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f48465f, false, 45860, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48465f, false, 45860, new Class[0], Void.TYPE);
            return;
        }
        finish();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f48465f, false, 45858, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48465f, false, 45858, new Class[0], Void.TYPE);
            return;
        }
        super.e();
    }

    public final String a(Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2}, this, f48465f, false, 45855, new Class[]{Intent.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{intent2}, this, f48465f, false, 45855, new Class[]{Intent.class}, String.class);
        } else if (!TextUtils.isEmpty(intent2.getStringExtra("component_name"))) {
            return intent2.getStringExtra("component_name");
        } else {
            if (intent.getExtras() == null) {
                return "Index";
            }
            return intent.getExtras().getString("FIELD_COMPONENT_NAME", "Index");
        }
    }

    public final Bundle b(Intent intent) {
        Bundle bundle;
        if (PatchProxy.isSupport(new Object[]{intent}, this, f48465f, false, 45856, new Class[]{Intent.class}, Bundle.class)) {
            return (Bundle) PatchProxy.accessDispatch(new Object[]{intent}, this, f48465f, false, 45856, new Class[]{Intent.class}, Bundle.class);
        }
        if (getIntent().getExtras() == null) {
            bundle = new Bundle();
            bundle.putString("reactId", this.h);
        } else {
            bundle = getIntent().getExtras();
            bundle.putString("reactId", this.h);
        }
        return bundle;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f48465f, false, 45857, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f48465f, false, 45857, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!this.g) {
            a.a(this, getWindow(), z);
        }
        this.g = true;
    }

    public final boolean a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f48465f, false, 45859, new Class[]{String.class}, Boolean.TYPE)) {
            return TextUtils.equals(str2, this.h);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f48465f, false, 45859, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }
}

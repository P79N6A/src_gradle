package com.ss.android.ugc.aweme.detail.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class LiveDetailActivity extends DetailActivity {
    public static ChangeQuickRedirect h;

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, h, false, 35170, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, h, false, 35170, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.detail.ui.LiveDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.detail.ui.LiveDetailActivity", "onCreate", false);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 35171, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 35171, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.detail.ui.LiveDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.detail.ui.LiveDetailActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, h, false, 35172, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, h, false, 35172, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.detail.ui.LiveDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static void b(Activity activity, Bundle bundle, View view) {
        Activity activity2 = activity;
        Bundle bundle2 = bundle;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{activity2, bundle2, view2}, null, h, true, 35168, new Class[]{Activity.class, Bundle.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, bundle2, view2}, null, h, true, 35168, new Class[]{Activity.class, Bundle.class, View.class}, Void.TYPE);
        } else if (activity2 != null) {
            Intent intent = new Intent(activity2, LiveDetailActivity.class);
            intent.putExtras(bundle2);
            ActivityCompat.startActivity(activity2, intent, ActivityOptionsCompat.makeScaleUpAnimation(view2, 0, 0, view.getWidth(), view.getHeight()).toBundle());
        }
    }

    public static void b(Context context, String str, String str2, String str3, int i, int i2, String str4, View view) {
        Context context2 = context;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{context2, str5, str6, str7, Integer.valueOf(i), Integer.valueOf(i2), str8, view2}, null, h, true, 35169, new Class[]{Context.class, String.class, String.class, String.class, Integer.TYPE, Integer.TYPE, String.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str5, str6, str7, Integer.valueOf(i), Integer.valueOf(i2), str8, view2}, null, h, true, 35169, new Class[]{Context.class, String.class, String.class, String.class, Integer.TYPE, Integer.TYPE, String.class, View.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, LiveDetailActivity.class);
        intent.putExtra("id", str5);
        intent.putExtra("refer", str6);
        intent.putExtra("video_from", str7);
        intent.putExtra("profile_enterprise_type", i);
        intent.putExtra("page_type", i2);
        if (str8 != null) {
            intent.putExtra("userid", str8);
        }
        ActivityCompat.startActivity(context2, intent, ActivityOptionsCompat.makeClipRevealAnimation(view2, 0, 0, view.getWidth(), view.getHeight()).toBundle());
    }
}

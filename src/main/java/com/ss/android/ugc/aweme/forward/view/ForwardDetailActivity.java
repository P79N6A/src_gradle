package com.ss.android.ugc.aweme.forward.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.setting.AbTestManager;

public class ForwardDetailActivity extends FeedDetailActivity {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f48443e;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f48443e, false, 45792, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48443e, false, 45792, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.ForwardDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.ForwardDetailActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f48443e, false, 45793, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f48443e, false, 45793, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.ForwardDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f48443e, false, 45791, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f48443e, false, 45791, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.ForwardDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        if (TextUtils.isEmpty(getIntent().getStringExtra("forward_id"))) {
            finish();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.ForwardDetailActivity", "onCreate", false);
            return;
        }
        this.f48440b = getIntent().getStringExtra("refer");
        if (bundle == null) {
            ForwardAwemeDetailFragment forwardAwemeDetailFragment = new ForwardAwemeDetailFragment();
            forwardAwemeDetailFragment.setArguments(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction().add(C0906R.id.afd, forwardAwemeDetailFragment, "OriginDetail").commit();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.ForwardDetailActivity", "onCreate", false);
    }

    public static void a(Context context, String str, String str2, String str3, int i) {
        Context context2 = context;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{context2, str4, str5, str6, Integer.valueOf(i)}, null, f48443e, true, 45790, new Class[]{Context.class, String.class, String.class, String.class, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {context2, str4, str5, str6, Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f48443e, true, 45790, new Class[]{Context.class, String.class, String.class, String.class, Integer.TYPE}, Void.TYPE);
        } else if (AbTestManager.a().aD()) {
            h.a().a((Activity) context2, j.a("aweme://aweme/detail/" + str4).a("profile_enterprise_type", i).a("cid", str6).a("refer", str5).a("video_from", "from_launch_forward").a());
        } else {
            Intent intent = new Intent(context2, ForwardDetailActivity.class);
            intent.putExtra("forward_id", str4);
            intent.putExtra("refer", str5);
            intent.putExtra("cid", str6);
            context2.startActivity(intent);
        }
    }
}

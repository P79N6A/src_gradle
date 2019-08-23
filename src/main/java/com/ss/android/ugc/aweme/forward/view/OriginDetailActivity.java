package com.ss.android.ugc.aweme.forward.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.newfollow.util.d;
import com.ss.android.ugc.aweme.newfollow.util.e;
import com.ss.android.ugc.aweme.u.ap;

public class OriginDetailActivity extends FeedDetailActivity {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f48444e;

    /* renamed from: f  reason: collision with root package name */
    protected long f48445f = -1;
    OriginAwemeDetailFragment g;

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f48444e, false, 45802, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f48444e, false, 45802, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.OriginDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f48444e, false, 45799, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48444e, false, 45799, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.OriginDetailActivity", "onResume", true);
        super.onResume();
        if (PatchProxy.isSupport(new Object[0], this, f48444e, false, 45800, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48444e, false, 45800, new Class[0], Void.TYPE);
        } else {
            this.f48445f = System.currentTimeMillis();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.OriginDetailActivity", "onResume", false);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f48444e, false, 45798, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48444e, false, 45798, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (isFinishing() && this.g != null) {
            d c2 = e.a().c(this.g.p);
            if (c2 != null) {
                c2.f57413d.b(256);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f48444e, false, 45801, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48444e, false, 45801, new Class[0], Void.TYPE);
            return;
        }
        if (this.f48445f > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f48445f;
            if (currentTimeMillis > 0) {
                ap apVar = (ap) new ap().b("personal_homepage").a(String.valueOf(currentTimeMillis)).j(this.f48441c);
                apVar.c("detail");
                apVar.e();
            }
            this.f48445f = -1;
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f48444e, false, 45797, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f48444e, false, 45797, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.OriginDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        Aweme aweme = (Aweme) getIntent().getSerializableExtra("forward_item");
        if (aweme == null || aweme.getForwardItem() == null) {
            finish();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.OriginDetailActivity", "onCreate", false);
            return;
        }
        this.f48440b = getIntent().getStringExtra("refer");
        this.f48441c = getIntent().getStringExtra("tab_name");
        this.f48442d = getIntent().getStringExtra("content_source");
        if (bundle == null) {
            this.g = new OriginAwemeDetailFragment();
            this.g.setArguments(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction().add(C0906R.id.afd, this.g, "OriginDetail").commit();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.forward.view.OriginDetailActivity", "onCreate", false);
    }

    public static void a(Context context, Aweme aweme, String str, String str2, String str3) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{context2, aweme2, str4, str5, str6}, null, f48444e, true, 45796, new Class[]{Context.class, Aweme.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context2, aweme2, str4, str5, str6};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f48444e, true, 45796, new Class[]{Context.class, Aweme.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, OriginDetailActivity.class);
        intent.putExtra("forward_item", aweme2);
        intent.putExtra("refer", str4);
        intent.putExtra("share_id", str5);
        intent.putExtra("tab_name", str6);
        intent.putExtra("content_source", "trends");
        context2.startActivity(intent);
    }
}

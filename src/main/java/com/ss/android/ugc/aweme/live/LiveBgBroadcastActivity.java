package com.ss.android.ugc.aweme.live;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import com.bytedance.android.livesdkapi.depend.model.a.a;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;

public class LiveBgBroadcastActivity extends BaseLiveSdkActivity {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f53163b;

    /* renamed from: c  reason: collision with root package name */
    private a f53164c;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f53163b, false, 55371, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53163b, false, 55371, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f53163b, false, 55372, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f53163b, false, 55372, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f53163b, false, 55369, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53163b, false, 55369, new Class[0], Void.TYPE);
            return;
        }
        this.f53164c.b();
        super.finish();
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f53163b, false, 55370, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53163b, false, 55370, new Class[0], Void.TYPE);
            return;
        }
        if (!this.f53164c.c()) {
            super.onBackPressed();
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f53163b, false, 55368, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53163b, false, 55368, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        a.d().f().b(hashCode());
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f53163b, false, 55367, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f53163b, false, 55367, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.ae);
        if (getWindow() != null) {
            getWindow().addFlags(SearchJediMixFeedAdapter.f42517f);
        }
        Bundle bundle2 = new Bundle();
        if (getIntent() != null) {
            bundle2 = getIntent().getExtras();
        }
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        a.d().f().a(hashCode(), this);
        this.f53164c = a.d().a(bundle2);
        beginTransaction.add((int) C0906R.id.aic, (Fragment) this.f53164c);
        beginTransaction.commit();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onCreate", false);
    }
}

package com.ss.android.ugc.aweme.live;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import com.bytedance.android.livesdkapi.depend.model.a.c;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;

public class LiveBroadcastActivity extends BaseLiveSdkActivity {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f53165b;

    /* renamed from: c  reason: collision with root package name */
    c f53166c = new c() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53167a;

        public final void a(@Nullable BroadcastReceiver broadcastReceiver) {
            BroadcastReceiver broadcastReceiver2 = broadcastReceiver;
            if (PatchProxy.isSupport(new Object[]{broadcastReceiver2}, this, f53167a, false, 55379, new Class[]{BroadcastReceiver.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{broadcastReceiver2}, this, f53167a, false, 55379, new Class[]{BroadcastReceiver.class}, Void.TYPE);
                return;
            }
            LiveBroadcastActivity.this.unregisterReceiver(broadcastReceiver2);
        }

        public final void a(@Nullable BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            BroadcastReceiver broadcastReceiver2 = broadcastReceiver;
            IntentFilter intentFilter2 = intentFilter;
            if (PatchProxy.isSupport(new Object[]{broadcastReceiver2, intentFilter2}, this, f53167a, false, 55378, new Class[]{BroadcastReceiver.class, IntentFilter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{broadcastReceiver2, intentFilter2}, this, f53167a, false, 55378, new Class[]{BroadcastReceiver.class, IntentFilter.class}, Void.TYPE);
                return;
            }
            LiveBroadcastActivity.this.registerReceiver(broadcastReceiver2, intentFilter2);
        }
    };

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f53165b, false, 55376, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53165b, false, 55376, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f53165b, false, 55377, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f53165b, false, 55377, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f53165b, false, 55375, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53165b, false, 55375, new Class[0], Void.TYPE);
            return;
        }
        this.f53166c = null;
        super.onDestroy();
        a.d().f().b(hashCode());
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f53165b, false, 55374, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f53165b, false, 55374, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onSaveInstanceState(bundle);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f53165b, false, 55373, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f53165b, false, 55373, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onCreate", true);
        if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.ae);
        if (getWindow() != null) {
            getWindow().addFlags(SearchJediMixFeedAdapter.f42517f);
        }
        Bundle bundle2 = new Bundle();
        if (getIntent() != null) {
            bundle2 = getIntent().getExtras();
        }
        a.d().f().a(hashCode(), this);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add((int) C0906R.id.aic, a.d().a(this.f53166c, bundle2));
        beginTransaction.commit();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onCreate", false);
    }
}

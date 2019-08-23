package com.ss.android.ugc.aweme.discover.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commercialize.utils.ak;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.detail.ui.DetailFragment;
import com.ss.android.ugc.aweme.discover.model.DiscoverListModel;
import com.ss.android.ugc.aweme.discover.model.DiscoveryV3DetailListModel;
import com.ss.android.ugc.aweme.discover.ui.DiscoverDetailFragment;
import com.ss.android.ugc.aweme.feed.param.b;

public class DiscoverDetailActivity extends DetailActivity {
    public static ChangeQuickRedirect h;

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, h, false, 35429, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, h, false, 35429, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.DiscoverDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.DiscoverDetailActivity", "onCreate", false);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 35430, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 35430, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.DiscoverDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.DiscoverDetailActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, h, false, 35431, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, h, false, 35431, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.DiscoverDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void a(Bundle bundle) {
        a aVar;
        DiscoverDetailFragment discoverDetailFragment;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, h, false, 35428, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, h, false, 35428, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        b a2 = com.ss.android.ugc.aweme.feed.param.a.a(this);
        if (TextUtils.isEmpty(a2.getCellId())) {
            finish();
            return;
        }
        com.ss.android.ugc.aweme.feed.a a3 = com.ss.android.ugc.aweme.feed.a.a();
        if (TextUtils.equals(a2.getFrom(), "from_discovery_v3")) {
            aVar = new DiscoveryV3DetailListModel();
        } else {
            aVar = new DiscoverListModel();
        }
        a3.f44610c = aVar;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        this.f41334c = (DetailFragment) supportFragmentManager.findFragmentByTag("detail_fragment");
        if (this.f41334c == null) {
            if (PatchProxy.isSupport(new Object[]{a2}, null, DiscoverDetailFragment.m, true, 37410, new Class[]{b.class}, DetailFragment.class)) {
                discoverDetailFragment = (DetailFragment) PatchProxy.accessDispatch(new Object[]{a2}, null, DiscoverDetailFragment.m, true, 37410, new Class[]{b.class}, DetailFragment.class);
            } else {
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("feed_param", a2);
                DiscoverDetailFragment discoverDetailFragment2 = new DiscoverDetailFragment();
                discoverDetailFragment2.setArguments(bundle2);
                discoverDetailFragment = discoverDetailFragment2;
            }
            this.f41334c = discoverDetailFragment;
        }
        this.f41334c.setUserVisibleHint(true);
        if (bundle == null) {
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            ak.a(getParent(), (Fragment) this.f41334c);
            beginTransaction.replace(C0906R.id.aic, this.f41334c, "detail_fragment");
            beginTransaction.commit();
        }
    }
}

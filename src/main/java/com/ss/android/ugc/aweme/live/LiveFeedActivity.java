package com.ss.android.ugc.aweme.live;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import com.bytedance.android.livesdk.feed.fragment.FeedLiveFragment;
import com.bytedance.android.livesdkapi.g.b;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

public class LiveFeedActivity extends BaseLiveSdkActivity implements b {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f53169b;

    /* renamed from: c  reason: collision with root package name */
    TextTitleBar f53170c;

    /* renamed from: d  reason: collision with root package name */
    DmtLoadingLayout f53171d;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f53169b, false, 55385, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53169b, false, 55385, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveFeedActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveFeedActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f53169b, false, 55386, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f53169b, false, 55386, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveFeedActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f53169b, false, 55382, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53169b, false, 55382, new Class[0], Void.TYPE);
            return;
        }
        this.f53171d.setVisibility(8);
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f53169b, false, 55384, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53169b, false, 55384, new Class[0], Void.TYPE);
        } else if (a.a()) {
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).setCustomStatusBarInLayout(this);
        } else {
            StatusBarUtils.setTranslucent(this);
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f53169b, false, 55383, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f53169b, false, 55383, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f53170c != null) {
            this.f53170c.setTitle((CharSequence) str);
        }
    }

    public void onCreate(Bundle bundle) {
        Fragment fragment;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f53169b, false, 55381, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f53169b, false, 55381, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveFeedActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.c5);
        this.f53171d = (DmtLoadingLayout) findViewById(C0906R.id.a65);
        this.f53171d.setUseScreenHeight(getResources().getDimensionPixelSize(C0906R.dimen.lj));
        this.f53171d.setVisibility(0);
        this.f53170c = (TextTitleBar) findViewById(C0906R.id.bem);
        this.f53170c.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f53172a;

            public final void b(View view) {
            }

            public final void a(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f53172a, false, 55387, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f53172a, false, 55387, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                LiveFeedActivity.this.finish();
            }
        });
        if (!a.a()) {
            getWindow().setSoftInputMode(48);
        }
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        if (PatchProxy.isSupport(new Object[0], null, d.f53357a, true, 55388, new Class[0], Fragment.class)) {
            fragment = (Fragment) PatchProxy.accessDispatch(new Object[0], null, d.f53357a, true, 55388, new Class[0], Fragment.class);
        } else {
            fragment = new FeedLiveFragment();
        }
        beginTransaction.add((int) C0906R.id.aic, fragment);
        beginTransaction.commit();
        a.d();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveFeedActivity", "onCreate", false);
    }
}

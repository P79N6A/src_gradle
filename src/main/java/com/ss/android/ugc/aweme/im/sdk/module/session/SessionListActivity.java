package com.ss.android.ugc.aweme.im.sdk.module.session;

import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.im.sdk.d.a;
import com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar;
import com.ss.android.ugc.aweme.im.service.IIMService;

public class SessionListActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51838a;

    /* renamed from: b  reason: collision with root package name */
    private ImTextTitleBar f51839b;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f51838a, false, 52394, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51838a, false, 52394, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.session.SessionListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.session.SessionListActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f51838a, false, 52395, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f51838a, false, 52395, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.session.SessionListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f51838a, false, 52390, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f51838a, false, 52390, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.session.SessionListActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.bm);
        a.b().setupStatusBar(this);
        if (PatchProxy.isSupport(new Object[0], this, f51838a, false, 52391, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51838a, false, 52391, new Class[0], Void.TYPE);
        } else {
            this.f51839b = (ImTextTitleBar) findViewById(C0906R.id.d3m);
            this.f51839b.setOnTitlebarClickListener(new ImTextTitleBar.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51840a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f51840a, false, 52396, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f51840a, false, 52396, new Class[0], Void.TYPE);
                        return;
                    }
                    SessionListActivity.this.finish();
                }

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f51840a, false, 52397, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f51840a, false, 52397, new Class[0], Void.TYPE);
                        return;
                    }
                    SessionListActivity sessionListActivity = SessionListActivity.this;
                    if (PatchProxy.isSupport(new Object[0], sessionListActivity, SessionListActivity.f51838a, false, 52393, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], sessionListActivity, SessionListActivity.f51838a, false, 52393, new Class[0], Void.TYPE);
                        return;
                    }
                    IIMService iIMService = (IIMService) com.ss.android.ugc.aweme.im.sdk.g.a.a(IIMService.class);
                    if (iIMService != null) {
                        iIMService.enterChooseContact(sessionListActivity, null, null);
                    }
                }
            });
        }
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f51838a, false, 52392, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f51838a, false, 52392, new Class[]{Bundle.class}, Void.TYPE);
        } else {
            IIMService iIMService = (IIMService) com.ss.android.ugc.aweme.im.sdk.g.a.a(IIMService.class);
            if (iIMService != null && bundle == null) {
                getSupportFragmentManager().beginTransaction().add(C0906R.id.afi, iIMService.getSessionListFragment().b(), "SessionListActivity").commit();
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.session.SessionListActivity", "onCreate", false);
    }
}

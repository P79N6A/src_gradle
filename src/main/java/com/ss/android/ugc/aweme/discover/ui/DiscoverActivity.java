package com.ss.android.ugc.aweme.discover.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.monitor.annotation.AddPageTrace;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.ss.android.ugc.aweme.base.activity.c;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.main.MainPageExperimentHelper;
import com.ss.android.ugc.aweme.main.g.a;

@AddPageTrace
public class DiscoverActivity extends AmeBaseActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42796a;

    /* renamed from: b  reason: collision with root package name */
    TextTitleBar f42797b;

    /* renamed from: c  reason: collision with root package name */
    HotSearchAndDiscoveryFragment2 f42798c;

    public final int a() {
        return C0906R.layout.b5;
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f42796a, false, 37407, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42796a, false, 37407, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.ui.DiscoverActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.ui.DiscoverActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f42796a, false, 37408, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f42796a, false, 37408, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.ui.DiscoverActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f42796a, false, 37404, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42796a, false, 37404, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        if (MainPageExperimentHelper.o() || a.b()) {
            i = 4;
        }
        c.b(this, i);
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f42796a, false, 37405, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42796a, false, 37405, new Class[0], Void.TYPE);
            return;
        }
        if (!this.f42798c.d()) {
            super.onBackPressed();
        }
    }

    public static void a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f42796a, true, 37406, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f42796a, true, 37406, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        context2.startActivity(new Intent(context2, DiscoverActivity.class));
    }

    public void onCreate(Bundle bundle) {
        int i;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f42796a, false, 37402, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f42796a, false, 37402, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.ui.DiscoverActivity", "onCreate", true);
        super.onCreate(bundle);
        if (MainPageExperimentHelper.o() || a.b()) {
            i = 4;
        } else {
            i = 0;
        }
        c.a(this, i);
        if (PatchProxy.isSupport(new Object[0], this, f42796a, false, 37403, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42796a, false, 37403, new Class[0], Void.TYPE);
        } else {
            this.f42797b = (TextTitleBar) findViewById(C0906R.id.d3m);
            this.f42797b.setVisibility(8);
            this.f42797b.showDividerLine(false);
            this.f42797b.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f42799a;

                public final void b(View view) {
                }

                public final void a(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f42799a, false, 37409, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f42799a, false, 37409, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    DiscoverActivity.this.finish();
                }
            });
        }
        this.f42798c = new HotSearchAndDiscoveryFragment2();
        getSupportFragmentManager().beginTransaction().add((int) C0906R.id.z1, (Fragment) this.f42798c).commitAllowingStateLoss();
        v.b((Activity) this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.ui.DiscoverActivity", "onCreate", false);
    }
}

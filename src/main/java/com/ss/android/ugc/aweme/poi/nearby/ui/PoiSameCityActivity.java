package com.ss.android.ugc.aweme.poi.nearby.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.titlebar.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.c;
import com.ss.android.ugc.aweme.feed.f.d;
import com.ss.android.ugc.aweme.feed.f.y;
import com.ss.android.ugc.aweme.feed.model.NearbyCities;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.cg;
import com.ss.android.ugc.aweme.utils.permission.a;
import org.greenrobot.eventbus.Subscribe;

public class PoiSameCityActivity extends FragmentActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3741a;

    /* renamed from: b  reason: collision with root package name */
    TextTitleBar f3742b;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3741a, false, 65308, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3741a, false, 65308, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.nearby.ui.PoiSameCityActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.nearby.ui.PoiSameCityActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3741a, false, 65309, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3741a, false, 65309, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.nearby.ui.PoiSameCityActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Subscribe
    public void onChangeCityEvent(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f3741a, false, 65307, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f3741a, false, 65307, new Class[]{d.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.equals(dVar.f45298a.code, c.d())) {
            c.a(dVar.f45298a);
        } else {
            c.a((NearbyCities.CityBean) null);
        }
        if (dVar.f45299b) {
            c.b(dVar.f45298a);
        }
        if (this.f3742b != null) {
            if (dVar.f45299b) {
                this.f3742b.setTitle((CharSequence) dVar.f45298a.showName);
            } else {
                this.f3742b.setTitle((CharSequence) dVar.f45298a.name);
            }
        }
        if (dVar.f45300c) {
            bg.a(new y());
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3741a, false, 65304, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3741a, false, 65304, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.nearby.ui.PoiSameCityActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(C0906R.layout.dm);
        if (PatchProxy.isSupport(new Object[0], this, f3741a, false, 65305, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3741a, false, 65305, new Class[0], Void.TYPE);
        } else {
            this.f3742b = (TextTitleBar) findViewById(C0906R.id.d3m);
            this.f3742b.setUseBackIcon(true);
            this.f3742b.showDividerLine(false);
            this.f3742b.setOnTitleBarClickListener(new a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f60061a;

                public final void b(View view) {
                }

                public final void a(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f60061a, false, 65310, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f60061a, false, 65310, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    PoiSameCityActivity.this.finish();
                }
            });
            this.f3742b.getTitleView().setTextColor(getResources().getColor(C0906R.color.zt));
            this.f3742b.setTitle((int) C0906R.string.chn);
            NearbyCities.CityBean c2 = c.c();
            if (c2 != null) {
                this.f3742b.setTitle((CharSequence) c2.name);
            }
        }
        getSupportFragmentManager().beginTransaction().add((int) C0906R.id.z1, ac.a(7, "nearby")).commitAllowingStateLoss();
        if (PatchProxy.isSupport(new Object[0], this, f3741a, false, 65306, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3741a, false, 65306, new Class[0], Void.TYPE);
        } else if (!cg.a()) {
            cg.a(this, new a.C0792a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f60063a;

                public final void b() {
                }

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f60063a, false, 65311, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f60063a, false, 65311, new Class[0], Void.TYPE);
                        return;
                    }
                    cg.b();
                    bg.a(new y());
                }
            });
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.nearby.ui.PoiSameCityActivity", "onCreate", false);
    }
}

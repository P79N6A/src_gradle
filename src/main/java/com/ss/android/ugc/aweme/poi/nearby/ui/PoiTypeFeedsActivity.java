package com.ss.android.ugc.aweme.poi.nearby.ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.titlebar.a.a;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.activity.AmeSlideBaseActivity;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.u.aa;
import java.util.Map;

public class PoiTypeFeedsActivity extends AmeSlideBaseActivity {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f60065b;

    /* renamed from: c  reason: collision with root package name */
    TextTitleBar f60066c;

    /* renamed from: d  reason: collision with root package name */
    View f60067d;

    /* renamed from: e  reason: collision with root package name */
    private String f60068e = "";

    /* renamed from: f  reason: collision with root package name */
    private long f60069f;

    public final int a() {
        return C0906R.layout.d5;
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f60065b, false, 65316, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f60065b, false, 65316, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.nearby.ui.PoiTypeFeedsActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.nearby.ui.PoiTypeFeedsActivity", "onCreate", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f60065b, false, 65317, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f60065b, false, 65317, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.nearby.ui.PoiTypeFeedsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f60065b, false, 65313, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60065b, false, 65313, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.nearby.ui.PoiTypeFeedsActivity", "onResume", true);
        super.onResume();
        this.f60069f = System.currentTimeMillis();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.nearby.ui.PoiTypeFeedsActivity", "onResume", false);
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f60065b, false, 65315, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60065b, false, 65315, new Class[0], Void.TYPE);
            return;
        }
        super.setStatusBarColor();
        StatusBarUtils.setTransparent(this);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f60065b, false, 65314, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60065b, false, 65314, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        r.a("stay_time", (Map) d.a().a("enter_from", "categorized_city_poi").a("city_info", aa.a()).a("poi_channel", aa.b()).a("duration", System.currentTimeMillis() - this.f60069f).f34114b);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f60065b, false, 65312, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60065b, false, 65312, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("poi_name")) {
            this.f60068e = getIntent().getStringExtra("poi_name");
        }
        this.f60066c = (TextTitleBar) findViewById(C0906R.id.d3m);
        this.f60066c.setTitle((CharSequence) this.f60068e);
        this.f60067d = findViewById(C0906R.id.cv0);
        if (Build.VERSION.SDK_INT >= 19) {
            this.f60067d.getLayoutParams().height = StatusBarUtils.getStatusBarHeight(this);
        }
        getSupportFragmentManager().beginTransaction().add((int) C0906R.id.y9, ac.a(11, "poi_type_feeds")).commit();
        this.f60066c.setOnTitleBarClickListener(new a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60070a;

            public final void b(View view) {
            }

            public final void a(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f60070a, false, 65318, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f60070a, false, 65318, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                PoiTypeFeedsActivity.this.finish();
            }
        });
    }
}

package com.ss.android.ugc.aweme.poi.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.poi.a.a;
import com.ss.android.ugc.aweme.poi.model.l;

public class PoiContentActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60437a;

    /* renamed from: b  reason: collision with root package name */
    private String f60438b;

    /* renamed from: c  reason: collision with root package name */
    private String f60439c;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f60437a, false, 66035, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60437a, false, 66035, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiContentActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiContentActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f60437a, false, 66036, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f60437a, false, 66036, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiContentActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f60437a, false, 66034, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60437a, false, 66034, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        if (isTaskRoot()) {
            h.a().a((Activity) this, "aweme://main");
        }
    }

    public Analysis getAnalysis() {
        if (PatchProxy.isSupport(new Object[0], this, f60437a, false, 66033, new Class[0], Analysis.class)) {
            return (Analysis) PatchProxy.accessDispatch(new Object[0], this, f60437a, false, 66033, new Class[0], Analysis.class);
        }
        long j = 0;
        try {
            j = Long.parseLong(this.f60438b);
        } catch (Exception unused) {
        }
        return new Analysis().setLabelName("poi_page").setExt_value(j);
    }

    public void onCreate(Bundle bundle) {
        PoiPureAwemeFeedFragment poiPureAwemeFeedFragment;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f60437a, false, 66031, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f60437a, false, 66031, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiContentActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.b1);
        findViewById(C0906R.id.y9).setBackgroundColor(getResources().getColor(C0906R.color.a25));
        if (PatchProxy.isSupport(new Object[0], this, f60437a, false, 66032, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60437a, false, 66032, new Class[0], Void.TYPE);
        } else {
            this.f60438b = getIntent().getStringExtra("id");
            this.f60439c = getIntent().getStringExtra("name");
            a aVar = (a) getIntent().getSerializableExtra("EXTRA_POI_AWEME_POSITION");
            String stringExtra = getIntent().getStringExtra("aweme_id");
            d.a().getCurUser();
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            String str = this.f60438b;
            String str2 = this.f60439c;
            if (PatchProxy.isSupport(new Object[]{str, str2, aVar, stringExtra}, null, PoiPureAwemeFeedFragment.t, true, 66108, new Class[]{String.class, String.class, a.class, String.class}, PoiPureAwemeFeedFragment.class)) {
                poiPureAwemeFeedFragment = (PoiPureAwemeFeedFragment) PatchProxy.accessDispatch(new Object[]{str, str2, aVar, stringExtra}, null, PoiPureAwemeFeedFragment.t, true, 66108, new Class[]{String.class, String.class, a.class, String.class}, PoiPureAwemeFeedFragment.class);
            } else {
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("poi_bundle", new l.a().c(str).g(str2).a());
                bundle2.putString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "poi_page");
                if (aVar != null) {
                    bundle2.putSerializable("EXTRA_POI_AWEME_POSITION", aVar);
                }
                bundle2.putString("aweme_id", stringExtra);
                poiPureAwemeFeedFragment = new PoiPureAwemeFeedFragment();
                poiPureAwemeFeedFragment.setArguments(bundle2);
            }
            poiPureAwemeFeedFragment.setUserVisibleHint(true);
            beginTransaction.replace(C0906R.id.y9, poiPureAwemeFeedFragment, "poi_detail_fragment_tag");
            beginTransaction.commit();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiContentActivity", "onCreate", false);
    }
}

package com.ss.android.ugc.aweme.poi.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.aweme.poi.model.ag;

public class PoiRouteActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60478a;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f60478a, false, 66133, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60478a, false, 66133, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiRouteActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiRouteActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f60478a, false, 66134, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f60478a, false, 66134, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiRouteActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f60478a, false, 66131, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60478a, false, 66131, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void onCreate(Bundle bundle) {
        PoiRouteFragment poiRouteFragment;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f60478a, false, 66130, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f60478a, false, 66130, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiRouteActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.b1);
        findViewById(C0906R.id.y9).setBackgroundColor(getResources().getColor(C0906R.color.a25));
        if (PatchProxy.isSupport(new Object[0], this, f60478a, false, 66132, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60478a, false, 66132, new Class[0], Void.TYPE);
        } else {
            PoiStruct poiStruct = (PoiStruct) getIntent().getSerializableExtra("poi_detail");
            ag agVar = (ag) getIntent().getSerializableExtra("poi_latlng");
            String stringExtra = getIntent().getStringExtra("enter_from");
            boolean booleanExtra = getIntent().getBooleanExtra("poi_route_from_poi", false);
            String stringExtra2 = getIntent().getStringExtra("aweme_id");
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("poi_detail_fragment_tag");
            if (findFragmentByTag == null) {
                if (poiStruct != null) {
                    if (PatchProxy.isSupport(new Object[]{poiStruct, stringExtra, stringExtra2, Byte.valueOf(booleanExtra)}, null, PoiRouteFragment.f60479a, true, 66135, new Class[]{PoiStruct.class, String.class, String.class, Boolean.TYPE}, PoiRouteFragment.class)) {
                        poiRouteFragment = (PoiRouteFragment) PatchProxy.accessDispatch(new Object[]{poiStruct, stringExtra, stringExtra2, Byte.valueOf(booleanExtra)}, null, PoiRouteFragment.f60479a, true, 66135, new Class[]{PoiStruct.class, String.class, String.class, Boolean.TYPE}, PoiRouteFragment.class);
                    } else {
                        Bundle bundle2 = new Bundle(1);
                        bundle2.putSerializable("poi_detail", poiStruct);
                        bundle2.putBoolean("poi_route_from_poi", booleanExtra);
                        bundle2.putString("enter_from", stringExtra);
                        bundle2.putString("aweme_id", stringExtra2);
                        poiRouteFragment = new PoiRouteFragment();
                        poiRouteFragment.setArguments(bundle2);
                    }
                } else if (agVar != null) {
                    if (PatchProxy.isSupport(new Object[]{agVar, Byte.valueOf(booleanExtra ? (byte) 1 : 0)}, null, PoiRouteFragment.f60479a, true, 66136, new Class[]{ag.class, Boolean.TYPE}, PoiRouteFragment.class)) {
                        poiRouteFragment = (PoiRouteFragment) PatchProxy.accessDispatch(new Object[]{agVar, Byte.valueOf(booleanExtra)}, null, PoiRouteFragment.f60479a, true, 66136, new Class[]{ag.class, Boolean.TYPE}, PoiRouteFragment.class);
                    } else {
                        Bundle bundle3 = new Bundle(1);
                        bundle3.putSerializable("poi_latlng", agVar);
                        bundle3.putBoolean("poi_route_from_poi", booleanExtra);
                        PoiRouteFragment poiRouteFragment2 = new PoiRouteFragment();
                        poiRouteFragment2.setArguments(bundle3);
                        findFragmentByTag = poiRouteFragment2;
                    }
                } else {
                    finish();
                }
                findFragmentByTag = poiRouteFragment;
            }
            findFragmentByTag.setUserVisibleHint(true);
            beginTransaction.replace(C0906R.id.y9, findFragmentByTag, "poi_detail_fragment_tag");
            beginTransaction.commitAllowingStateLoss();
        }
        ImmersionBar.with((Activity) this).fitsSystemWindows(true).statusBarDarkFont(a.b()).init();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiRouteActivity", "onCreate", false);
    }

    public static void a(Context context, PoiStruct poiStruct, String str, String str2, boolean z) {
        Context context2 = context;
        PoiStruct poiStruct2 = poiStruct;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, poiStruct2, str3, str4, (byte) 1}, null, f60478a, true, 66127, new Class[]{Context.class, PoiStruct.class, String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {context2, poiStruct2, str3, str4, (byte) 1};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f60478a, true, 66127, new Class[]{Context.class, PoiStruct.class, String.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, PoiRouteActivity.class);
        intent.putExtra("poi_detail", poiStruct2);
        intent.putExtra("poi_route_from_poi", true);
        intent.putExtra("enter_from", str3);
        intent.putExtra("aweme_id", str4);
        context2.startActivity(intent);
    }
}

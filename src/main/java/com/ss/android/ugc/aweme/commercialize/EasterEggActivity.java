package com.ss.android.ugc.aweme.commercialize;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.widget.FrameLayout;
import butterknife.BindView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.commercialize.model.i;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;

public class EasterEggActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38397a;

    /* renamed from: b  reason: collision with root package name */
    k f38398b;
    @BindView(2131494401)
    FrameLayout flContanier;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f38397a, false, 30279, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38397a, false, 30279, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.EasterEggActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.EasterEggActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f38397a, false, 30280, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f38397a, false, 30280, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.EasterEggActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f38397a, false, 30277, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38397a, false, 30277, new Class[0], Void.TYPE);
            return;
        }
        setResult(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR);
        super.finish();
        overridePendingTransition(0, 0);
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f38397a, false, 30278, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38397a, false, 30278, new Class[0], Void.TYPE);
            return;
        }
        super.onBackPressed();
        finish();
        r.onEvent(MobClick.obtain().setEventName("result_ad").setLabelName("close").setJsonObject(c.a().a("refer", "egg").b()));
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f38397a, false, 30274, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f38397a, false, 30274, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.EasterEggActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView((int) C0906R.layout.dp);
        this.f38398b = (k) getIntent().getSerializableExtra("pageParams");
        if (PatchProxy.isSupport(new Object[0], this, f38397a, false, 30275, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38397a, false, 30275, new Class[0], Void.TYPE);
        } else {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("EasterEggFragment");
            if (findFragmentByTag == null) {
                if (PatchProxy.isSupport(new Object[0], this, f38397a, false, 30276, new Class[0], Bundle.class)) {
                    bundle2 = (Bundle) PatchProxy.accessDispatch(new Object[0], this, f38397a, false, 30276, new Class[0], Bundle.class);
                } else {
                    bundle2 = new Bundle();
                    if (this.f38398b == null || this.f38398b.getEasterEggInfo() == null) {
                        finish();
                    } else {
                        bundle2.putSerializable("pageParams", this.f38398b);
                        i easterEggInfo = this.f38398b.getEasterEggInfo();
                        if (TextUtils.equals(com.ss.android.ugc.aweme.commercialize.utils.c.a(easterEggInfo), "web")) {
                            bundle2.putString(PushConstants.WEB_URL, com.ss.android.ugc.aweme.commercialize.utils.c.d(easterEggInfo));
                        }
                    }
                }
                if (PatchProxy.isSupport(new Object[]{bundle2}, null, EasterEggFragment.ah, true, 30311, new Class[]{Bundle.class}, EasterEggFragment.class)) {
                    findFragmentByTag = (EasterEggFragment) PatchProxy.accessDispatch(new Object[]{bundle2}, null, EasterEggFragment.ah, true, 30311, new Class[]{Bundle.class}, EasterEggFragment.class);
                } else {
                    EasterEggFragment easterEggFragment = new EasterEggFragment();
                    bundle2.putBoolean("bundle_can_touch_webview", false);
                    easterEggFragment.setArguments(bundle2);
                    findFragmentByTag = easterEggFragment;
                }
            }
            supportFragmentManager.beginTransaction().replace(C0906R.id.aic, findFragmentByTag, "EasterEggFragment").commitAllowingStateLoss();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.EasterEggActivity", "onCreate", false);
    }

    public static void a(Context context, k kVar) {
        Context context2 = context;
        k kVar2 = kVar;
        if (PatchProxy.isSupport(new Object[]{context2, kVar2}, null, f38397a, true, 30272, new Class[]{Context.class, k.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, kVar2}, null, f38397a, true, 30272, new Class[]{Context.class, k.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, EasterEggActivity.class);
        intent.putExtra("pageParams", kVar2);
        context2.startActivity(intent);
    }

    public static void a(Activity activity, k kVar, int i) {
        Activity activity2 = activity;
        k kVar2 = kVar;
        if (PatchProxy.isSupport(new Object[]{activity2, kVar2, Integer.valueOf(i)}, null, f38397a, true, 30273, new Class[]{Activity.class, k.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, kVar2, Integer.valueOf(i)}, null, f38397a, true, 30273, new Class[]{Activity.class, k.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(activity2, EasterEggActivity.class);
        intent.putExtra("pageParams", kVar2);
        activity2.startActivityForResult(intent, i);
    }
}

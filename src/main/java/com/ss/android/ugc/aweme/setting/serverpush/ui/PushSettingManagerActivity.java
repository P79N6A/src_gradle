package com.ss.android.ugc.aweme.setting.serverpush.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.utils.eb;

public class PushSettingManagerActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64053a;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f64053a, false, 72330, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64053a, false, 72330, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f64053a, false, 72331, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f64053a, false, 72331, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f64053a, false, 72328, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64053a, false, 72328, new Class[0], Void.TYPE);
            return;
        }
        if (!a.a()) {
            eb.a(this, getResources().getColor(C0906R.color.yx));
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f64053a, false, 72327, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f64053a, false, 72327, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.df);
        if (PatchProxy.isSupport(new Object[0], this, f64053a, false, 72329, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64053a, false, 72329, new Class[0], Void.TYPE);
        } else {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("FRAGMENT_PUSH_MANAGER_LIST");
            PushSettingManagerFragment pushSettingManagerFragment = findFragmentByTag;
            if (findFragmentByTag == null) {
                if (PatchProxy.isSupport(new Object[0], null, PushSettingManagerFragment.f64054a, true, 72332, new Class[0], PushSettingManagerFragment.class)) {
                    pushSettingManagerFragment = (PushSettingManagerFragment) PatchProxy.accessDispatch(new Object[0], null, PushSettingManagerFragment.f64054a, true, 72332, new Class[0], PushSettingManagerFragment.class);
                } else {
                    PushSettingManagerFragment pushSettingManagerFragment2 = new PushSettingManagerFragment();
                    pushSettingManagerFragment2.setArguments(new Bundle());
                    pushSettingManagerFragment = pushSettingManagerFragment2;
                }
            }
            supportFragmentManager.beginTransaction().replace(C0906R.id.aic, pushSettingManagerFragment, "FRAGMENT_PUSH_MANAGER_LIST").commitAllowingStateLoss();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerActivity", "onCreate", false);
    }
}

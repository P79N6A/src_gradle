package com.ss.android.ugc.aweme.account.logindevicemanager.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.base.activity.AmeSSActivity;

public class LoginDeviceManagerActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32674a;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f32674a, false, 20826, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32674a, false, 20826, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.logindevicemanager.ui.LoginDeviceManagerActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.logindevicemanager.ui.LoginDeviceManagerActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f32674a, false, 20827, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f32674a, false, 20827, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.logindevicemanager.ui.LoginDeviceManagerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f32674a, false, 20825, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32674a, false, 20825, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f32674a, false, 20824, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32674a, false, 20824, new Class[0], Void.TYPE);
            return;
        }
        ImmersionBar.with((Activity) this).statusBarColor((int) C0906R.color.yx).init();
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f32674a, false, 20822, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f32674a, false, 20822, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.logindevicemanager.ui.LoginDeviceManagerActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.cd);
        if (PatchProxy.isSupport(new Object[0], this, f32674a, false, 20823, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32674a, false, 20823, new Class[0], Void.TYPE);
        } else {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("tag_login_device_manager");
            if (findFragmentByTag == null) {
                if (PatchProxy.isSupport(new Object[0], null, LoginDeviceManagerFragment.f32675a, true, 20828, new Class[0], Fragment.class)) {
                    findFragmentByTag = (Fragment) PatchProxy.accessDispatch(new Object[0], null, LoginDeviceManagerFragment.f32675a, true, 20828, new Class[0], Fragment.class);
                } else {
                    findFragmentByTag = new LoginDeviceManagerFragment();
                }
            }
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            beginTransaction.replace(C0906R.id.aic, findFragmentByTag, "tag_login_device_manager");
            beginTransaction.commitAllowingStateLoss();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.logindevicemanager.ui.LoginDeviceManagerActivity", "onCreate", false);
    }
}

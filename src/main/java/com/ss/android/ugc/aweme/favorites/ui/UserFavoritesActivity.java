package com.ss.android.ugc.aweme.favorites.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.monitor.annotation.AddPageTrace;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;

@AddPageTrace
public class UserFavoritesActivity extends AmeSlideSSActivity {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f44345b;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f44345b, false, 39658, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44345b, false, 39658, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f44345b, false, 39659, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f44345b, false, 39659, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f44345b, false, 39657, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44345b, false, 39657, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f44345b, false, 39656, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44345b, false, 39656, new Class[0], Void.TYPE);
        } else if (a.b()) {
            ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) C0906R.color.w1).init();
        } else {
            ImmersionBar.with((Activity) this).statusBarColor((int) C0906R.color.yx).init();
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f44345b, false, 39654, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f44345b, false, 39654, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity", "onCreate", true);
        super.onCreate(bundle);
        requestDisableOptimizeViewHierarchy();
        setContentView((int) C0906R.layout.eg);
        if (PatchProxy.isSupport(new Object[0], this, f44345b, false, 39655, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44345b, false, 39655, new Class[0], Void.TYPE);
        } else {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("user_favorites_fragment_tag");
            if (findFragmentByTag == null) {
                findFragmentByTag = new UserFavoritesFragment();
            }
            findFragmentByTag.setUserVisibleHint(true);
            beginTransaction.replace(C0906R.id.y9, findFragmentByTag, "user_favorites_fragment_tag");
            beginTransaction.commit();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity", "onCreate", false);
    }
}

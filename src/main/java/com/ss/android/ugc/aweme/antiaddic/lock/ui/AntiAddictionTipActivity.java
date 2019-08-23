package com.ss.android.ugc.aweme.antiaddic.lock.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.b.a;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.AntiAddictionTipFragment;
import com.ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\f\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\bH\u0014J\b\u0010\u0010\u001a\u00020\bH\u0014¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/antiaddic/lock/ui/AntiAddictionTipActivity;", "Lcom/ss/android/ugc/aweme/base/activity/AmeBaseActivity;", "()V", "getLayout", "", "isRegisterEventBus", "", "onBackPressed", "", "onCloseAntiAddictionEvent", "event", "Lcom/ss/android/ugc/aweme/antiaddic/event/CloseAntiAddictionTipEvent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "setStatusBarColor", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AntiAddictionTipActivity extends AmeBaseActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2602a;

    public final int a() {
        return C0906R.layout.a_;
    }

    public final boolean isRegisterEventBus() {
        return true;
    }

    public final void onBackPressed() {
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f2602a, false, 21872, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2602a, false, 21872, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.AntiAddictionTipActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.AntiAddictionTipActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2602a, false, 21873, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2602a, false, 21873, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.AntiAddictionTipActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f2602a, false, 21868, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2602a, false, 21868, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public final void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f2602a, false, 21867, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2602a, false, 21867, new Class[0], Void.TYPE);
            return;
        }
        StatusBarUtils.setTransparent(this);
    }

    @Subscribe(a = ThreadMode.MAIN)
    public final void onCloseAntiAddictionEvent(@NotNull a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f2602a, false, 21869, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f2602a, false, 21869, new Class[]{a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "event");
        finish();
    }

    public final void onCreate(@Nullable Bundle bundle) {
        Fragment fragment;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f2602a, false, 21866, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f2602a, false, 21866, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.AntiAddictionTipActivity", "onCreate", true);
        super.onCreate(bundle);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (((AntiAddictionTipFragment) supportFragmentManager.findFragmentById(C0906R.id.aic)) == null) {
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            AntiAddictionTipFragment.a aVar = AntiAddictionTipFragment.f2611f;
            if (PatchProxy.isSupport(new Object[0], aVar, AntiAddictionTipFragment.a.f33493a, false, 21957, new Class[0], Fragment.class)) {
                fragment = (Fragment) PatchProxy.accessDispatch(new Object[0], aVar, AntiAddictionTipFragment.a.f33493a, false, 21957, new Class[0], Fragment.class);
            } else {
                fragment = new AntiAddictionTipFragment();
            }
            beginTransaction.add((int) C0906R.id.aic, fragment).commitAllowingStateLoss();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.AntiAddictionTipActivity", "onCreate", false);
    }
}

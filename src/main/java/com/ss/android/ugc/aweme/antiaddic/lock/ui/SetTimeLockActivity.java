package com.ss.android.ugc.aweme.antiaddic.lock.ui;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.ViewGroup;
import butterknife.BindView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.TimeLockAboutFragmentV2;
import com.ss.android.ugc.aweme.antiaddic.lock.viewmodel.SetLockParamViewModel;
import com.ss.android.ugc.aweme.antiaddic.lock.viewmodel.TimeLockOptionViewModel;
import com.ss.android.ugc.aweme.antiaddic.lock.viewmodel.a;
import com.ss.android.ugc.aweme.app.x;

public class SetTimeLockActivity extends BaseLockActivity {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f33461c;

    /* renamed from: d  reason: collision with root package name */
    private a f33462d;
    @BindView(2131496848)
    ViewGroup rootView;

    public final int a() {
        return C0906R.layout.c_;
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f33461c, false, 21900, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f33461c, false, 21900, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.SetTimeLockActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.SetTimeLockActivity", "onCreate", false);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f33461c, false, 21901, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33461c, false, 21901, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.SetTimeLockActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.SetTimeLockActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f33461c, false, 21902, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f33461c, false, 21902, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.antiaddic.lock.ui.SetTimeLockActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f33461c, false, 21899, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33461c, false, 21899, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f33461c, false, 21898, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33461c, false, 21898, new Class[0], Void.TYPE);
        } else if (com.ss.android.g.a.b()) {
            ImmersionBar.with((Activity) this).statusBarColor((int) C0906R.color.w1).statusBarDarkFont(true).init();
        } else {
            ImmersionBar.with((Activity) this).statusBarColor((int) C0906R.color.yx).init();
        }
    }

    public final void b() {
        Fragment fragment;
        Fragment fragment2;
        Fragment fragment3;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f33461c, false, 21896, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33461c, false, 21896, new Class[0], Void.TYPE);
            return;
        }
        this.f33462d = new a();
        this.f33462d.f33619a = getIntent().getIntExtra("SetTimeLockActivityKeyType", 0);
        if (getIntent().getBooleanExtra("SetTimeLockActivityKeyFromParent", false)) {
            a.C0429a aVar = new a.C0429a();
            aVar.f33621a = getIntent().getStringExtra("SetTimeLockActivityKeyUid");
            this.f33462d.f33620b = aVar;
        }
        ((SetLockParamViewModel) ViewModelProviders.of((FragmentActivity) this).get(SetLockParamViewModel.class)).f33617a.setValue(this.f33462d);
        if (getIntent().getBooleanExtra("SetTimeLockActivityKeyFromParent", false)) {
            int intExtra = getIntent().getIntExtra("SetTimeLockActivityKeyLockTimeInMin", 0);
            if (intExtra > 0) {
                ((TimeLockOptionViewModel) ViewModelProviders.of((FragmentActivity) this).get(TimeLockOptionViewModel.class)).f33618a.setValue(new TimeLockAboutFragmentV2.a(intExtra));
            }
            if (getIntent().getBooleanExtra("SetTimeLockActivityKeyParentState", false)) {
                fragment3 = TimeLockFragmentFactory.c(this.f33462d.f33619a);
            } else {
                fragment3 = TimeLockFragmentFactory.a(this.f33462d.f33619a);
            }
            a(fragment3);
        } else if (this.f33462d.f33619a == 0) {
            if (TimeLockRuler.isSelfTimeLockOn()) {
                fragment2 = TimeLockFragmentFactory.c(this.f33462d.f33619a);
            } else {
                fragment2 = TimeLockFragmentFactory.a(this.f33462d.f33619a);
            }
            a(fragment2);
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f33461c, false, 21897, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f33461c, false, 21897, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (TimeLockRuler.isSelfContentFilterOn() || ((Boolean) x.a().l().c()).booleanValue()) {
                z = true;
            }
            if (z) {
                fragment = TimeLockFragmentFactory.c(this.f33462d.f33619a);
            } else {
                fragment = TimeLockFragmentFactory.a(this.f33462d.f33619a);
            }
            a(fragment);
        }
        if (com.ss.android.g.a.b()) {
            this.rootView.setBackgroundColor(getResources().getColor(C0906R.color.a25));
        }
    }

    public static void a(Context context, int i) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i)}, null, f33461c, true, 21894, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i)}, null, f33461c, true, 21894, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, SetTimeLockActivity.class);
        intent.putExtra("SetTimeLockActivityKeyType", i);
        intent.putExtra("SetTimeLockActivityKeyFromParent", false);
        context2.startActivity(intent);
    }

    public static void a(Context context, int i, String str, boolean z, int i2) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), str2, Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2)}, null, f33461c, true, 21895, new Class[]{Context.class, Integer.TYPE, String.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i), str2, Byte.valueOf(z), Integer.valueOf(i2)}, null, f33461c, true, 21895, new Class[]{Context.class, Integer.TYPE, String.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, SetTimeLockActivity.class);
        intent.putExtra("SetTimeLockActivityKeyType", i);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("SetTimeLockActivityKeyFromParent", true);
            intent.putExtra("SetTimeLockActivityKeyUid", str2);
            intent.putExtra("SetTimeLockActivityKeyParentState", z);
            intent.putExtra("SetTimeLockActivityKeyLockTimeInMin", i2);
        }
        if (context2 instanceof Application) {
            intent.addFlags(268435456);
        }
        context2.startActivity(intent);
    }
}

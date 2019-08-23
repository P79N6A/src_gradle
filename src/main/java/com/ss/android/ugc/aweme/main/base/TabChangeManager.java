package com.ss.android.ugc.aweme.main.base;

import a.i;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.widget.Space;
import android.widget.TabHost;
import com.bytedance.ies.uikit.tabhost.FragmentTabHost;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.experiencekit.c.d;
import com.ss.android.ugc.aweme.aj.b;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.feed.ag;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.bl;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class TabChangeManager extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54415a;
    @SuppressLint({"StaticFieldLeak", "CI_StaticFieldLeak"})

    /* renamed from: b  reason: collision with root package name */
    public FragmentTabHost f54416b;

    /* renamed from: c  reason: collision with root package name */
    public String f54417c;

    /* renamed from: d  reason: collision with root package name */
    public List<a> f54418d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public String f54419e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f54420f;
    public FragmentManager g;

    @MeasureFunction
    public final void a(String str, boolean z) {
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f54415a, false, 57801, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f54415a, false, 57801, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!TextUtils.equals("HOME", str)) {
            ag.i().h();
        }
        if (!b()) {
            a.b(new f(this, str, z));
            return;
        }
        bl.a(d.BEGIN, "tag", this.f54416b.getCurrentTabTag());
        this.f54416b.setCurrentTabByTag(str);
        this.f54417c = this.f54419e;
        this.f54419e = str;
        for (a onTabChanged : this.f54418d) {
            onTabChanged.onTabChanged(this.f54419e, this.f54417c, z);
        }
        Activity f2 = AwemeAppData.p().f();
        if (!com.ss.android.g.a.a() ? !(f2 == null || TextUtils.equals("HOME", str) || (TextUtils.equals("FOLLOW", str) && a((Context) f2))) : !(TextUtils.equals("HOME", str) || f2 == null)) {
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).checkShowFiveStarDialog(f2);
        }
    }

    private boolean b() {
        if (this.f54416b == null) {
            return false;
        }
        return true;
    }

    public final Fragment a() {
        if (PatchProxy.isSupport(new Object[0], this, f54415a, false, 57805, new Class[0], Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[0], this, f54415a, false, 57805, new Class[0], Fragment.class);
        } else if (!b()) {
            return null;
        } else {
            return this.f54416b.getCurrentFragment();
        }
    }

    public void onCleared() {
        if (PatchProxy.isSupport(new Object[0], this, f54415a, false, 57798, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54415a, false, 57798, new Class[0], Void.TYPE);
            return;
        }
        this.f54416b = null;
        this.f54418d.clear();
    }

    public static TabChangeManager a(FragmentActivity fragmentActivity) {
        if (!PatchProxy.isSupport(new Object[]{fragmentActivity}, null, f54415a, true, 57796, new Class[]{FragmentActivity.class}, TabChangeManager.class)) {
            return (TabChangeManager) ViewModelProviders.of(fragmentActivity).get(TabChangeManager.class);
        }
        return (TabChangeManager) PatchProxy.accessDispatch(new Object[]{fragmentActivity}, null, f54415a, true, 57796, new Class[]{FragmentActivity.class}, TabChangeManager.class);
    }

    public final Fragment b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f54415a, false, 57807, new Class[]{String.class}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{str}, this, f54415a, false, 57807, new Class[]{String.class}, Fragment.class);
        } else if (this.g == null) {
            return null;
        } else {
            return this.g.findFragmentByTag(str);
        }
    }

    private static boolean a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f54415a, true, 57802, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f54415a, true, 57802, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (!b.b().b(context2, "is_friend_tab_guide_show", true) || TimeLockRuler.isInTeenagerModeNewVersion() || AbTestManager.a().bT() == 2) {
            return false;
        } else {
            return true;
        }
    }

    public final TabChangeManager a(final a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f54415a, false, 57797, new Class[]{a.class}, TabChangeManager.class)) {
            return (TabChangeManager) PatchProxy.accessDispatch(new Object[]{aVar}, this, f54415a, false, 57797, new Class[]{a.class}, TabChangeManager.class);
        }
        this.f54418d.add(aVar);
        if (aVar instanceof LifecycleOwner) {
            ((LifecycleOwner) aVar).getLifecycle().addObserver(new GenericLifecycleObserver() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54421a;

                public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (PatchProxy.isSupport(new Object[]{lifecycleOwner, event}, this, f54421a, false, 57810, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{lifecycleOwner, event}, this, f54421a, false, 57810, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE);
                        return;
                    }
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        TabChangeManager.this.f54418d.remove(aVar);
                    }
                }
            });
        }
        return this;
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f54415a, false, 57800, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f54415a, false, 57800, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a(str2, false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void b(Class cls, String str, Bundle bundle) throws Exception {
        a(cls, str, bundle);
        return null;
    }

    public final void a(Class cls, String str, Bundle bundle) {
        Class cls2 = cls;
        String str2 = str;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{cls2, str2, bundle2}, this, f54415a, false, 57799, new Class[]{Class.class, String.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cls2, str2, bundle2}, this, f54415a, false, 57799, new Class[]{Class.class, String.class, Bundle.class}, Void.TYPE);
        } else if (!b()) {
            i.a((Callable<TResult>) new e<TResult>(this, cls2, str2, bundle2), i.f1052b);
        } else {
            TabHost.TabSpec newTabSpec = this.f54416b.newTabSpec(str2);
            if (com.ss.android.g.a.a()) {
                Space space = new Space(this.f54416b.getContext());
                space.setMinimumHeight(0);
                space.setMinimumWidth(0);
                newTabSpec.setIndicator(space);
            } else {
                newTabSpec.setIndicator(str2);
            }
            try {
                this.f54416b.addTab(newTabSpec, cls2, bundle2);
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
        }
    }
}

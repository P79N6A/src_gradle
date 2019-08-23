package com.ss.android.ugc.aweme.main;

import a.i;
import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManagerHelper;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.listener.j;
import com.ss.android.ugc.aweme.feed.listener.k;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.main.base.mainpage.CommonPageFragment;
import com.ss.android.ugc.aweme.main.base.mainpage.MainPagerAdapter;
import com.ss.android.ugc.aweme.main.base.mainpage.view.ScrollableViewPager;
import com.ss.android.ugc.aweme.main.page.FeedEventTypeCallBack;
import com.ss.android.ugc.aweme.main.page.MainPageViewModel;
import com.ss.android.ugc.aweme.main.story.record.LeftPageOfMain;
import com.ss.android.ugc.aweme.profile.ProfilePageFragment;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragment;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.concurrent.Callable;

public final class bu implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54648a;

    /* renamed from: b  reason: collision with root package name */
    public String f54649b;

    /* renamed from: c  reason: collision with root package name */
    public LeftPageOfMain f54650c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f54651d;

    /* renamed from: e  reason: collision with root package name */
    public String f54652e;

    /* renamed from: f  reason: collision with root package name */
    public String f54653f;
    public Aweme g;
    public a h;
    public Context i;
    public ScrollableViewPager j;
    public MainPagerAdapter k;
    public String l = "";
    public k m;
    ScrollableViewPager.a n = new bv(this);
    public ViewPager.OnPageChangeListener o;
    private ScrollableViewPager.a p = new bw(this);

    public interface a {
        void a(int i);
    }

    public interface b {
        void a();

        void b();
    }

    public final void a(f fVar, b bVar, DetailFragmentPanel detailFragmentPanel) {
        if (PatchProxy.isSupport(new Object[]{fVar, bVar, detailFragmentPanel}, this, f54648a, false, 57674, new Class[]{f.class, b.class, DetailFragmentPanel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar, bVar, detailFragmentPanel}, this, f54648a, false, 57674, new Class[]{f.class, b.class, DetailFragmentPanel.class}, Void.TYPE);
        } else if (this.j != null && this.j.getContext() != null) {
            ScrollSwitchHelper$4 scrollSwitchHelper$4 = new ScrollSwitchHelper$4(this, detailFragmentPanel, (int) UIUtils.dip2Px(this.j.getContext(), 15.0f), bVar, fVar);
            this.o = scrollSwitchHelper$4;
            this.j.addOnPageChangeListener(this.o);
        }
    }

    public final void a(String str, boolean z) {
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f54648a, false, 57679, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f54648a, false, 57679, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.j.setCurrentItem(this.k.c(str), z);
        n();
    }

    public final void a(Boolean bool) {
        if (PatchProxy.isSupport(new Object[]{bool}, this, f54648a, false, 57684, new Class[]{Boolean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bool}, this, f54648a, false, 57684, new Class[]{Boolean.class}, Void.TYPE);
            return;
        }
        b(bool);
    }

    public final boolean a() {
        return this.j.f54457c;
    }

    private boolean m() {
        if (!PatchProxy.isSupport(new Object[0], this, f54648a, false, 57660, new Class[0], Boolean.TYPE)) {
            return TextUtils.equals("page_home", b());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f54648a, false, 57660, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final String b() {
        if (!PatchProxy.isSupport(new Object[0], this, f54648a, false, 57682, new Class[0], String.class)) {
            return a(this.j.getCurrentItem());
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f54648a, false, 57682, new Class[0], String.class);
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f54648a, false, 57697, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54648a, false, 57697, new Class[0], Void.TYPE);
            return;
        }
        e("page_setting");
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f54648a, false, 57696, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54648a, false, 57696, new Class[0], Void.TYPE);
            return;
        }
        e("page_profile");
    }

    public final boolean h() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f54648a, false, 57664, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f54648a, false, 57664, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.k != null && FragmentManagerHelper.isExecutingActions(this.k.f54445f)) {
            z = true;
        }
        return z;
    }

    public final boolean i() {
        if (!PatchProxy.isSupport(new Object[0], this, f54648a, false, 57658, new Class[0], Boolean.TYPE)) {
            return b((Boolean) null);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f54648a, false, 57658, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean k() {
        if (!PatchProxy.isSupport(new Object[0], this, f54648a, false, 57669, new Class[0], Boolean.TYPE)) {
            return TextUtils.equals("page_profile", b());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f54648a, false, 57669, new Class[0], Boolean.TYPE)).booleanValue();
    }

    private void n() {
        if (PatchProxy.isSupport(new Object[0], this, f54648a, false, 57680, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54648a, false, 57680, new Class[0], Void.TYPE);
            return;
        }
        if (!com.ss.android.g.a.b() && j()) {
            if (l() && !this.k.b("page_setting")) {
                e();
            } else if (!l() && this.k.b("page_setting")) {
                f();
            }
        }
    }

    @Nullable
    public final View c() {
        CommonPageFragment commonPageFragment;
        if (PatchProxy.isSupport(new Object[0], this, f54648a, false, 57683, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f54648a, false, 57683, new Class[0], View.class);
        }
        if (this.k == null) {
            commonPageFragment = null;
        } else {
            commonPageFragment = this.k.d("page_home");
        }
        if (commonPageFragment instanceof HomeFragment) {
            return ((HomeFragment) commonPageFragment).b().getSettingShadowView();
        }
        return null;
    }

    public final void d() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f54648a, false, 57686, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54648a, false, 57686, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null) {
            if (PatchProxy.isSupport(new Object[0], this, f54648a, false, 57666, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f54648a, false, 57666, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                z = TextUtils.equals("page_setting", b());
            }
            if (!z) {
                if (!this.k.b("page_setting")) {
                    e();
                }
                int c2 = this.k.c("page_setting");
                if (c2 >= 0) {
                    this.j.setCurrentItem(c2, true);
                }
            }
        }
    }

    @Nullable
    public final AwemeListFragment g() {
        if (PatchProxy.isSupport(new Object[0], this, f54648a, false, 57692, new Class[0], AwemeListFragment.class)) {
            return (AwemeListFragment) PatchProxy.accessDispatch(new Object[0], this, f54648a, false, 57692, new Class[0], AwemeListFragment.class);
        } else if (this.k == null) {
            return null;
        } else {
            CommonPageFragment d2 = this.k.d("page_home");
            if (d2 != null && (d2 instanceof HomeFragment)) {
                return ((HomeFragment) d2).b().getProfileAwemeFragment();
            }
            return null;
        }
    }

    public final boolean j() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f54648a, false, 57667, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f54648a, false, 57667, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (TextUtils.equals("page_home", b()) && bj.a(this.k)) {
            z = true;
        }
        return z;
    }

    public final boolean l() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f54648a, false, 57688, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f54648a, false, 57688, new Class[0], Boolean.TYPE)).booleanValue();
        }
        int currentItem = this.j.getCurrentItem();
        if (currentItem >= this.k.getCount()) {
            return false;
        }
        Fragment a2 = this.k.a(currentItem);
        if ((a2 instanceof HomeFragment) && ((HomeFragment) a2).c()) {
            z = true;
        }
        return z;
    }

    public final void a(a aVar) {
        this.h = aVar;
    }

    public final void a(boolean z) {
        if (this.j != null) {
            this.j.f54457c = z;
        }
    }

    public final void a(ViewPager.OnPageChangeListener onPageChangeListener) {
        if (PatchProxy.isSupport(new Object[]{onPageChangeListener}, this, f54648a, false, 57676, new Class[]{ViewPager.OnPageChangeListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onPageChangeListener}, this, f54648a, false, 57676, new Class[]{ViewPager.OnPageChangeListener.class}, Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.addOnPageChangeListener(onPageChangeListener);
        }
    }

    public final void d(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f54648a, false, 57681, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f54648a, false, 57681, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a(str2, false);
    }

    static boolean a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f54648a, true, 57690, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f54648a, true, 57690, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getAuthor() == null) {
            return true;
        } else {
            return false;
        }
    }

    private void e(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f54648a, false, 57698, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f54648a, false, 57698, new Class[]{String.class}, Void.TYPE);
        } else if (!FragmentManagerHelper.isExecutingActions(this.k.f54445f)) {
            this.k.a(str);
        } else {
            i.a((Callable<TResult>) new bx<TResult>(this, str), i.f1052b);
        }
    }

    public final void b(ViewPager.OnPageChangeListener onPageChangeListener) {
        if (PatchProxy.isSupport(new Object[]{onPageChangeListener}, this, f54648a, false, 57677, new Class[]{ViewPager.OnPageChangeListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onPageChangeListener}, this, f54648a, false, 57677, new Class[]{ViewPager.OnPageChangeListener.class}, Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.removeOnPageChangeListener(onPageChangeListener);
        }
    }

    private boolean b(Boolean bool) {
        if (PatchProxy.isSupport(new Object[]{bool}, this, f54648a, false, 57659, new Class[]{Boolean.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{bool}, this, f54648a, false, 57659, new Class[]{Boolean.class}, Boolean.TYPE)).booleanValue();
        }
        bg.a(new com.ss.android.ugc.aweme.profile.a.a());
        if (this.j != null) {
            if (!m()) {
                if (bool != null) {
                    this.j.setCurrentItem(this.k.c("page_home"), bool.booleanValue());
                } else {
                    this.j.setCurrentItem(this.k.c("page_home"));
                }
                n();
                return true;
            } else if (!j()) {
                CommonPageFragment d2 = this.k.d("page_home");
                if (d2 instanceof HomeFragment) {
                    ((HomeFragment) d2).d();
                    return true;
                }
            }
        }
        return false;
    }

    public final int a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f54648a, false, 57685, new Class[]{String.class}, Integer.TYPE)) {
            return this.k.c(str2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, this, f54648a, false, 57685, new Class[]{String.class}, Integer.TYPE)).intValue();
    }

    public final void c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f54648a, false, 57672, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f54648a, false, 57672, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f54652e = str;
        Activity c2 = v.c((View) this.j);
        if (c2 instanceof FragmentActivity) {
            FeedEventTypeCallBack.a((FragmentActivity) c2, this.f54652e);
        }
    }

    public final String a(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f54648a, false, 57687, new Class[]{Integer.TYPE}, String.class)) {
            return this.k.c(i2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f54648a, false, 57687, new Class[]{Integer.TYPE}, String.class);
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f54648a, false, 57699, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f54648a, false, 57699, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.j.setBlockCanScroll(z);
    }

    public final void c(boolean z) {
        ScrollableViewPager.a aVar;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f54648a, false, 57694, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f54648a, false, 57694, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ScrollableViewPager scrollableViewPager = this.j;
        if (z) {
            aVar = this.n;
        } else {
            aVar = this.p;
        }
        scrollableViewPager.a(aVar);
    }

    public final void a(j jVar) {
        j jVar2 = jVar;
        if (PatchProxy.isSupport(new Object[]{jVar2}, this, f54648a, false, 57695, new Class[]{j.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar2}, this, f54648a, false, 57695, new Class[]{j.class}, Void.TYPE);
            return;
        }
        this.j.setOnFlingEndListener(jVar2);
    }

    public final boolean b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f54648a, false, 57691, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f54648a, false, 57691, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (this.k == null) {
            return false;
        } else {
            return this.k.b(str);
        }
    }

    public final void a(Aweme aweme, String str) {
        if (PatchProxy.isSupport(new Object[]{aweme, str}, this, f54648a, false, 57662, new Class[]{Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, str}, this, f54648a, false, 57662, new Class[]{Aweme.class, String.class}, Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.f54651d = true;
            CommonPageFragment d2 = this.k.d("page_profile");
            if (d2 instanceof ProfilePageFragment) {
                ProfilePageFragment profilePageFragment = (ProfilePageFragment) d2;
                profilePageFragment.a(str);
                profilePageFragment.b(this.f54651d);
            }
            a("page_profile", true);
            if (aweme != null && aweme.withFakeUser()) {
                if (!com.ss.android.g.a.a()) {
                    aweme.isAd();
                } else if (aweme.getAwemeRawAd() == null) {
                }
            }
        }
    }

    public bu(Context context, ScrollableViewPager scrollableViewPager, MainPagerAdapter mainPagerAdapter) {
        this.i = context;
        this.j = scrollableViewPager;
        this.k = mainPagerAdapter;
        if (context instanceof FragmentActivity) {
            ((MainPageViewModel) ViewModelProviders.of((FragmentActivity) context).get(MainPageViewModel.class)).f54873b.observe((LifecycleOwner) context, new Observer<String>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54654a;

                public final /* synthetic */ void onChanged(@Nullable Object obj) {
                    String str = (String) obj;
                    if (PatchProxy.isSupport(new Object[]{str}, this, f54654a, false, 57703, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f54654a, false, 57703, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    bu.this.a(str, true);
                }
            });
        }
        this.j.addOnPageChangeListener(new ScrollSwitchHelper$2(this, context));
    }
}

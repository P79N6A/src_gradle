package com.ss.android.ugc.aweme.profile.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.d.g;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.common.utils.a;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.ss.android.ugc.aweme.i18n.b;
import com.ss.android.ugc.aweme.music.util.ProfileListFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.n;
import com.ss.android.ugc.aweme.profile.ui.header.a;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.translation.ui.TranslationStatusView;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;

public abstract class BaseProfileFragment extends AmeBaseFragment implements ViewPager.OnPageChangeListener, View.OnClickListener, ScrollableLayout.b, n {
    public static ChangeQuickRedirect t;
    protected static final String u = ("android:switcher:" + C0906R.id.ckc + ":");
    protected TextView A;
    protected TranslationStatusView B;
    protected View C;
    protected TextView D;
    public a E;
    protected String F;
    protected int G;
    protected int H;
    protected String I;
    protected User J;
    protected di K;
    protected int L;

    /* renamed from: a  reason: collision with root package name */
    private TextView f3792a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f3793b;

    /* renamed from: c  reason: collision with root package name */
    private ViewGroup f3794c;

    /* renamed from: d  reason: collision with root package name */
    private ViewGroup f3795d;

    /* renamed from: e  reason: collision with root package name */
    private ViewGroup f3796e;
    @BindView(2131496920)
    public DampScrollableLayout mScrollableLayout;
    @BindView(2131497328)
    public View mStatusView;
    @BindView(2131497590)
    public TextView mTitle;
    public List<ProfileListFragment> v;
    protected List<Integer> w;
    protected int x;
    protected int y;
    protected TextView z;

    public abstract void A();

    public abstract int B();

    public void b() {
    }

    public void b(boolean z2) {
    }

    public void b(boolean z2, boolean z3, boolean z4) {
    }

    public void c(User user) {
    }

    public void d(User user) {
    }

    public abstract void f();

    public boolean isRegisterEventBus() {
        return true;
    }

    public void l(int i) {
    }

    public abstract void m(int i);

    public void onPageScrollStateChanged(int i) {
    }

    public boolean w() {
        return true;
    }

    public abstract int x();

    public abstract void y();

    public abstract void z();

    public List<Integer> k() {
        return this.w;
    }

    public void a(User user) {
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{user2}, this, t, false, 67872, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2}, this, t, false, 67872, new Class[]{User.class}, Void.TYPE);
        } else if (isViewValid()) {
            k(user);
            this.J = user2;
        }
    }

    public final void a(ProfileListFragment profileListFragment, Integer num) {
        if (PatchProxy.isSupport(new Object[]{profileListFragment, num}, this, t, false, 67889, new Class[]{ProfileListFragment.class, Integer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{profileListFragment, num}, this, t, false, 67889, new Class[]{ProfileListFragment.class, Integer.class}, Void.TYPE);
            return;
        }
        if (this.w.contains(num)) {
            int indexOf = this.w.indexOf(num);
            this.v.remove(indexOf);
            this.w.remove(indexOf);
        }
        this.v.add(profileListFragment);
        this.w.add(num);
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 67875, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 67875, new Class[0], Void.TYPE);
            return;
        }
        this.mScrollableLayout.setMinY(0);
    }

    private boolean h() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 67892, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, t, false, 67892, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.g.a.a() || com.ss.android.g.a.c()) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean e() {
        if (!PatchProxy.isSupport(new Object[0], this, t, false, 67881, new Class[0], Boolean.TYPE)) {
            return isViewValid();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, t, false, 67881, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void v() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 67874, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 67874, new Class[0], Void.TYPE);
            return;
        }
        this.mScrollableLayout.setMinY((int) (-UIUtils.dip2Px(getContext(), 300.0f)));
    }

    public final void C() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 67893, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 67893, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3792a != null) {
            this.f3792a.setText("-");
        }
        if (this.f3793b != null) {
            this.f3793b.setText("-");
        }
        if (this.z != null) {
            this.z.setText("-");
        }
    }

    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 67868, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 67868, new Class[0], Void.TYPE);
            return;
        }
        this.mScrollableLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        f();
        C();
        d(0);
        e(0);
        b((String) null);
        c("");
    }

    public void setUser(User user) {
        this.J = user;
    }

    public void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, t, false, 67864, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, t, false, 67864, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.mScrollableLayout.setOnScrollListener(this);
    }

    @Subscribe
    public void onLogoutEvent(g gVar) {
        if (PatchProxy.isSupport(new Object[]{gVar}, this, t, false, 67860, new Class[]{g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar}, this, t, false, 67860, new Class[]{g.class}, Void.TYPE);
            return;
        }
        if (this.E != null) {
            this.E.h();
        }
    }

    private List<Integer> a(@NonNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, t, false, 67884, new Class[]{String.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{str2}, this, t, false, 67884, new Class[]{String.class}, List.class);
        } else if (TextUtils.equals(str2, d.a().getCurUserId())) {
            return new ArrayList(x.a().am().c());
        } else {
            return new ArrayList(x.a().an().c());
        }
    }

    public void b(int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, t, false, 67871, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, t, false, 67871, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!h() && isViewValid()) {
            if (i < 0) {
                i2 = 0;
            } else {
                i2 = i;
            }
            this.x = i2;
            this.f3792a.setText(b.a((long) i2));
        }
    }

    public void c(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, t, false, 67876, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, t, false, 67876, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!h() && isViewValid()) {
            this.I = b.a((long) i);
            this.z.setText(this.I);
        }
    }

    public void j(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, t, false, 67869, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, t, false, 67869, new Class[]{User.class}, Void.TYPE);
            return;
        }
        if (!h() && com.ss.android.g.a.a()) {
            if (this.K == null) {
                this.K = new di(getContext(), this.B, this.A);
            }
            this.K.a(user);
        }
    }

    public final void k(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, t, false, 67873, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, t, false, 67873, new Class[]{User.class}, Void.TYPE);
        } else if (ex.e(user) || com.ss.android.g.a.b()) {
            g();
        } else {
            v();
        }
    }

    public final int n(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, t, false, 67891, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, t, false, 67891, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        switch (i) {
            case 0:
                return 0;
            case 1:
                if (AbTestManager.a().aV()) {
                    if (ex.g(this.J)) {
                        return 8;
                    }
                }
                return 5;
            case 2:
                return 1;
            case 3:
                return 3;
            case 4:
                return 6;
            case 5:
                return 7;
            default:
                return -1;
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, t, false, 67857, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, t, false, 67857, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.F = arguments.getString("from");
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, t, false, 67862, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, t, false, 67862, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        bundle.putInt("profile_cur_pos", this.G);
        bundle.putInt("indicator_scroll_maxx", this.H);
        super.onSaveInstanceState(bundle);
    }

    public void setUserVisibleHint(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, t, false, 67894, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, t, false, 67894, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z2);
        if (this.v != null) {
            ProfileListFragment profileListFragment = this.v.get(this.G);
            if (profileListFragment != null) {
                profileListFragment.setUserVisibleHint(z2);
            }
        }
    }

    public void b(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, t, false, 67865, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, t, false, 67865, new Class[]{View.class}, Void.TYPE);
        } else if (!h()) {
            this.f3792a = (TextView) view.findViewById(C0906R.id.ahf);
            this.f3793b = (TextView) view.findViewById(C0906R.id.ahb);
            this.f3796e = (ViewGroup) view.findViewById(C0906R.id.a7x);
            this.z = (TextView) view.findViewById(C0906R.id.a4d);
            this.A = (TextView) view.findViewById(C0906R.id.dqe);
            this.B = (TranslationStatusView) view.findViewById(C0906R.id.d6m);
            this.f3795d = (ViewGroup) view.findViewById(C0906R.id.ahd);
            this.f3794c = (ViewGroup) view.findViewById(C0906R.id.ahh);
            this.C = view.findViewById(C0906R.id.c70);
            this.D = (TextView) view.findViewById(C0906R.id.dpp);
            if (PatchProxy.isSupport(new Object[0], this, t, false, 67866, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, t, false, 67866, new Class[0], Void.TYPE);
                return;
            }
            if (this.B != null) {
                this.B.a();
            }
        }
    }

    public void c(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, t, false, 67867, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, t, false, 67867, new Class[]{View.class}, Void.TYPE);
        } else if (!h()) {
            this.f3795d.setOnClickListener(this);
            this.f3794c.setOnClickListener(this);
            this.f3796e.setOnClickListener(this);
        }
    }

    public void e(@NonNull String str) {
        List<Integer> list;
        if (PatchProxy.isSupport(new Object[]{str}, this, t, false, 67882, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, t, false, 67882, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{str}, this, t, false, 67885, new Class[]{String.class}, List.class)) {
            list = (List) PatchProxy.accessDispatch(new Object[]{str}, this, t, false, 67885, new Class[]{String.class}, List.class);
        } else {
            list = a(str);
            Iterator<Integer> it2 = list.iterator();
            while (it2.hasNext()) {
                if (!a(str, it2.next().intValue())) {
                    it2.remove();
                }
            }
        }
        this.v = new ArrayList(list.size());
        this.w = new ArrayList(list.size());
        for (Integer intValue : list) {
            m(intValue.intValue());
        }
    }

    @NonNull
    public final ProfileListFragment a(Integer num) {
        if (PatchProxy.isSupport(new Object[]{num}, this, t, false, 67890, new Class[]{Integer.class}, ProfileListFragment.class)) {
            return (ProfileListFragment) PatchProxy.accessDispatch(new Object[]{num}, this, t, false, 67890, new Class[]{Integer.class}, ProfileListFragment.class);
        } else if (this.v == null || this.w == null) {
            return null;
        } else {
            int indexOf = this.w.indexOf(num);
            if (indexOf == -1) {
                return null;
            }
            return this.v.get(indexOf);
        }
    }

    public void b(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, t, false, 67879, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, t, false, 67879, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.g.a.a() && (exc2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a)) {
            com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) exc2;
            if (!TextUtils.isEmpty(aVar.getErrorMsg()) && getContext() != null) {
                com.bytedance.ies.dmt.ui.d.a.b(getContext(), aVar.getErrorMsg()).a();
            }
        }
    }

    public final void l(@NonNull User user) {
        List<Integer> list;
        if (PatchProxy.isSupport(new Object[]{user}, this, t, false, 67883, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, t, false, 67883, new Class[]{User.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{user}, this, t, false, 67886, new Class[]{User.class}, List.class)) {
            list = (List) PatchProxy.accessDispatch(new Object[]{user}, this, t, false, 67886, new Class[]{User.class}, List.class);
        } else {
            list = a(user.getUid());
            Iterator<Integer> it2 = list.iterator();
            while (it2.hasNext()) {
                if (!b(user, it2.next().intValue())) {
                    it2.remove();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        if (this.v == null) {
            this.v = new ArrayList(list.size());
        } else {
            arrayList.addAll(this.v);
            this.v.clear();
        }
        ArrayList arrayList2 = new ArrayList();
        if (this.w == null) {
            this.w = new ArrayList(list.size());
        } else {
            arrayList2.addAll(this.w);
            this.w.clear();
        }
        for (Integer next : list) {
            if (arrayList2.contains(Integer.valueOf(n(next.intValue())))) {
                int indexOf = arrayList2.indexOf(Integer.valueOf(n(next.intValue())));
                a((ProfileListFragment) arrayList.get(indexOf), (Integer) arrayList2.get(indexOf));
            } else {
                m(next.intValue());
            }
        }
    }

    public void a(int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, t, false, 67870, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, t, false, 67870, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!h() && isViewValid()) {
            if (i < 0) {
                i2 = 0;
            } else {
                i2 = i;
            }
            this.y = i2;
            this.f3793b.setText(b.a((long) i2));
        }
    }

    @Subscribe
    public void onNeedScrollToTop(dh dhVar) {
        boolean z2;
        dh dhVar2 = dhVar;
        if (PatchProxy.isSupport(new Object[]{dhVar2}, this, t, false, 67861, new Class[]{dh.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dhVar2}, this, t, false, 67861, new Class[]{dh.class}, Void.TYPE);
            return;
        }
        if (this.J == null || !d.a().isLogin() || !ex.g(this.J)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.mScrollableLayout != null && z2 == dhVar2.f62639a) {
            DampScrollableLayout dampScrollableLayout = this.mScrollableLayout;
            if (PatchProxy.isSupport(new Object[0], dampScrollableLayout, DampScrollableLayout.f40563a, false, 33938, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], dampScrollableLayout, DampScrollableLayout.f40563a, false, 33938, new Class[0], Void.TYPE);
                return;
            }
            Pair pair = new Pair(Float.valueOf(1.0f), Float.valueOf(1.0f));
            Pair pair2 = new Pair(Float.valueOf(1.0f), Float.valueOf(-3000.0f));
            if (PatchProxy.isSupport(new Object[]{dampScrollableLayout, pair, pair2, 0L}, null, com.ss.android.ugc.aweme.common.utils.a.f40301a, true, 33531, new Class[]{View.class, Pair.class, Pair.class, Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dampScrollableLayout, pair, pair2, 0L}, null, com.ss.android.ugc.aweme.common.utils.a.f40301a, true, 33531, new Class[]{View.class, Pair.class, Pair.class, Long.TYPE}, Void.TYPE);
                return;
            }
            a.C0522a aVar = com.ss.android.ugc.aweme.common.utils.a.f40302b;
            Object[] objArr = {dampScrollableLayout, pair, pair2, new Long(0)};
            if (PatchProxy.isSupport(objArr, aVar, a.C0522a.f40303a, false, 33532, new Class[]{View.class, Pair.class, Pair.class, Long.TYPE}, Void.TYPE)) {
                Object[] objArr2 = {dampScrollableLayout, pair, pair2, new Long(0)};
                Object[] objArr3 = objArr2;
                a.C0522a aVar2 = aVar;
                PatchProxy.accessDispatch(objArr3, aVar2, a.C0522a.f40303a, false, 33532, new Class[]{View.class, Pair.class, Pair.class, Long.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(dampScrollableLayout, "targetView");
            Intrinsics.checkParameterIsNotNull(pair, "fromPosition");
            Intrinsics.checkParameterIsNotNull(pair2, "toPosition");
            a.C0522a aVar3 = aVar;
            if (PatchProxy.isSupport(new Object[]{dampScrollableLayout, pair, pair2}, aVar3, a.C0522a.f40303a, false, 33534, new Class[]{View.class, Pair.class, Pair.class}, Void.TYPE)) {
                a.C0522a aVar4 = aVar3;
                PatchProxy.accessDispatch(new Object[]{dampScrollableLayout, pair, pair2}, aVar4, a.C0522a.f40303a, false, 33534, new Class[]{View.class, Pair.class, Pair.class}, Void.TYPE);
            } else {
                a.C0522a aVar5 = aVar3;
                dampScrollableLayout.dispatchTouchEvent(aVar5.a(0, ((Number) pair.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue()));
                dampScrollableLayout.dispatchTouchEvent(aVar5.a(2, ((Number) pair2.getFirst()).floatValue(), ((Number) pair2.getSecond()).floatValue()));
                dampScrollableLayout.dispatchTouchEvent(aVar5.a(1, ((Number) pair2.getFirst()).floatValue(), ((Number) pair2.getSecond()).floatValue()));
            }
        }
    }

    private boolean a(@NonNull String str, int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, t, false, 67887, new Class[]{String.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, t, false, 67887, new Class[]{String.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.g.a.b()) {
            if (i2 == 0 || i2 == 2) {
                return true;
            }
            return false;
        } else if (i2 == 0) {
            return true;
        } else {
            if (i2 == 1) {
                return SharePrefCache.inst().isOpenForward();
            }
            if (i2 != 2 || AbTestManager.a().aU()) {
                return false;
            }
            return true;
        }
    }

    @MeasureFunction
    public void onViewCreated(View view, Bundle bundle) {
        int i;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, t, false, 67859, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, t, false, 67859, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (getResources().getConfiguration() != null) {
            i = getResources().getConfiguration().screenWidthDp;
        } else {
            i = 0;
        }
        this.L = i;
        a(view);
        b(view);
        c(view);
        if (PatchProxy.isSupport(new Object[]{bundle}, this, t, false, 67863, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, t, false, 67863, new Class[]{Bundle.class}, Void.TYPE);
        } else if (bundle != null) {
            this.G = bundle.getInt("profile_cur_pos", 0);
            this.H = bundle.getInt("indicator_scroll_maxx", 0);
        }
        d();
    }

    public final boolean b(@NonNull User user, int i) {
        if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i)}, this, t, false, 67888, new Class[]{User.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i)}, this, t, false, 67888, new Class[]{User.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.g.a.b()) {
            if (i != 3) {
                return a(user.getUid(), i);
            }
            if (user.getVerificationType() == 2) {
                return true;
            }
            return false;
        } else if (i == 5) {
            if (com.bytedance.ies.dmt.ui.common.d.a().f20314a || user.getCommerceUserLevel() <= 0 || !user.isWithCommerceEnterpriseTabEntry()) {
                return false;
            }
            return true;
        } else if (i == 4) {
            if (user.getVerificationType() == 3 || user.isEffectArtist()) {
                return true;
            }
            return false;
        } else if (i != 3) {
            return a(user.getUid(), i);
        } else {
            if (user.getVerificationType() == 2) {
                return true;
            }
            return false;
        }
    }

    public void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, t, false, 67878, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, t, false, 67878, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        l(i);
    }

    public void a(int i, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, t, false, 67877, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, t, false, 67877, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
        } else if (h() || !isViewValid()) {
        } else {
            if (!com.ss.android.g.a.a()) {
                this.A.setVisibility(0);
                if (!TextUtils.isEmpty(str)) {
                    this.A.setText(str);
                } else if (i == 1 || i == 2) {
                    this.A.setText(C0906R.string.c8i);
                } else {
                    this.A.setVisibility(8);
                }
            } else if (TextUtils.isEmpty(str)) {
                this.A.setText(C0906R.string.c8g);
            } else {
                String str2 = str;
                while (str2.contains("\n\n")) {
                    str2 = str2.replaceAll("\n\n", "\n");
                }
                this.A.setText(str2);
            }
        }
    }

    @MeasureFunction
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, t, false, 67858, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(x(), viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, t, false, 67858, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }

    public void onPageScrolled(int i, float f2, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, t, false, 67880, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, t, false, 67880, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (f2 != 0.0f) {
            this.H = UIUtils.getScreenWidth(getContext()) / 3;
        }
    }
}

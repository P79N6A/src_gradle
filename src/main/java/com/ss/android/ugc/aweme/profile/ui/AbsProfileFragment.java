package com.ss.android.ugc.aweme.profile.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import butterknife.BindView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.c.a.a;
import com.ss.android.ugc.aweme.discover.ui.NoticeView;
import com.ss.android.ugc.aweme.music.util.ProfileListFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.f;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragment;
import com.ss.android.ugc.aweme.utils.ed;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator;
import com.ss.android.ugc.aweme.views.ProfileTabFactory;
import com.ss.android.ugc.aweme.views.l;
import java.util.List;

public abstract class AbsProfileFragment extends BaseDTProfileFragment implements AwemeViewPagerNavigator.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3778a;
    private int M = -1;

    /* renamed from: b  reason: collision with root package name */
    ViewStub f3779b;
    @BindView(2131498493)
    public NoticeView bindPhoneGuide;

    /* renamed from: c  reason: collision with root package name */
    View f3780c;
    @BindView(2131498497)
    public NoticeView completeProfileGuide;

    /* renamed from: d  reason: collision with root package name */
    public View f3781d;

    /* renamed from: e  reason: collision with root package name */
    public AnimationImageView f3782e;

    /* renamed from: f  reason: collision with root package name */
    protected ProfileFragmentAdapter<ProfileListFragment> f3783f;
    protected f g;
    protected AwemeListFragment.a h = new AwemeListFragment.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61718a;

        public final void a(boolean z, int i) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i)}, this, f61718a, false, 67720, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i)}, this, f61718a, false, 67720, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            } else if (AbsProfileFragment.this.isViewValid()) {
                if (i == 0 && AbsProfileFragment.this.G == AbsProfileFragment.this.p()) {
                    AbsProfileFragment.this.mScrollableLayout.setCanScrollUp(false);
                    if (z && "from_main".equals(AbsProfileFragment.this.F) && AbsProfileFragment.this.J.getAwemeCount() == 0 && !TimeLockRuler.isTeenModeON()) {
                        AbsProfileFragment.this.h();
                        AbsProfileFragment.this.k(0);
                    }
                } else if (i == 5 && AbsProfileFragment.this.G == AbsProfileFragment.this.s()) {
                    AbsProfileFragment.this.mScrollableLayout.setCanScrollUp(false);
                } else if (i == 1 && AbsProfileFragment.this.G == AbsProfileFragment.this.q()) {
                    AbsProfileFragment.this.mScrollableLayout.setCanScrollUp(false);
                }
            }
        }

        public final void b(boolean z, int i) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i)}, this, f61718a, false, 67721, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i)}, this, f61718a, false, 67721, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            } else if (AbsProfileFragment.this.isViewValid()) {
                if (i == 0 && AbsProfileFragment.this.G == AbsProfileFragment.this.p()) {
                    AbsProfileFragment.this.mScrollableLayout.setCanScrollUp(true);
                    if (z) {
                        AbsProfileFragment.this.k(8);
                        AbsProfileFragment.this.g();
                    }
                } else if (i == 5 && AbsProfileFragment.this.G == AbsProfileFragment.this.s()) {
                    AbsProfileFragment.this.mScrollableLayout.setCanScrollUp(true);
                } else if (i == 1 && AbsProfileFragment.this.G == AbsProfileFragment.this.q()) {
                    AbsProfileFragment.this.mScrollableLayout.setCanScrollUp(true);
                }
            }
        }
    };
    float i = 0.0f;
    float j = 0.0f;

    public void a(View view, int i2) {
    }

    public void a(View view, int i2, boolean z) {
    }

    public final void c(String str) {
    }

    public final void c(boolean z) {
    }

    public final void d(int i2) {
    }

    public final void d(String str) {
    }

    public final void d(boolean z) {
    }

    public final void e(int i2) {
    }

    public final void e(User user) {
    }

    public final void f(int i2) {
    }

    /* access modifiers changed from: package-private */
    public abstract void g();

    public final void g(int i2) {
    }

    /* access modifiers changed from: package-private */
    public abstract void h();

    public final void h(int i2) {
    }

    public final void i(int i2) {
    }

    public final List<Integer> k() {
        return this.w;
    }

    public final void j() {
        this.i = 0.0f;
        this.j = 0.0f;
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, f3778a, false, 67707, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3778a, false, 67707, new Class[0], Void.TYPE);
        } else if (this.f3779b != null && this.f3780c == null) {
            this.f3780c = this.f3779b.inflate();
            this.f3780c.setVisibility(0);
        }
    }

    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, f3778a, false, 67699, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3778a, false, 67699, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        d((String) null);
        d(null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void l() {
        if (!a.a(this.f3781d) && this.J != null && !CollectionUtils.isEmpty(this.J.getCoverUrls()) && this.g != null) {
            this.g.a();
        }
    }

    public boolean q_() {
        if (PatchProxy.isSupport(new Object[0], this, f3778a, false, 67712, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3778a, false, 67712, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.p == null || !this.s) {
            return false;
        } else {
            return this.p.a();
        }
    }

    private void D() {
        if (PatchProxy.isSupport(new Object[0], this, f3778a, false, 67708, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3778a, false, 67708, new Class[0], Void.TYPE);
            return;
        }
        Context context = getContext();
        if (context != null) {
            i();
            if (this.f3780c != null) {
                this.completeProfileGuide.setVisibility(8);
                this.bindPhoneGuide.setVisibility(8);
                this.f3780c.setLayerType(2, null);
                Animation loadAnimation = AnimationUtils.loadAnimation(context, C0906R.anim.f4405cn);
                loadAnimation.setRepeatMode(2);
                loadAnimation.setRepeatCount(-1);
                loadAnimation.setAnimationListener(new Animation.AnimationListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f61720a;

                    public final void onAnimationRepeat(Animation animation) {
                    }

                    public final void onAnimationStart(Animation animation) {
                    }

                    public final void onAnimationEnd(Animation animation) {
                        if (PatchProxy.isSupport(new Object[]{animation}, this, f61720a, false, 67722, new Class[]{Animation.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animation}, this, f61720a, false, 67722, new Class[]{Animation.class}, Void.TYPE);
                            return;
                        }
                        AbsProfileFragment.this.f3780c.setLayerType(0, null);
                    }
                });
                this.f3780c.startAnimation(loadAnimation);
            }
        }
    }

    public void f() {
        if (PatchProxy.isSupport(new Object[0], this, f3778a, false, 67700, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3778a, false, 67700, new Class[0], Void.TYPE);
            return;
        }
        if (this.J == null) {
            e(getUserId());
        } else {
            l(this.J);
        }
        this.f3783f = new ProfileFragmentAdapter<>(getChildFragmentManager(), this.v, k());
        this.l.setAdapter(this.f3783f);
        ProfileTabFactory profileTabFactory = new ProfileTabFactory();
        profileTabFactory.f76390b = 0;
        this.E.H.a(this.l, (l) profileTabFactory, (AwemeViewPagerNavigator.a) this);
        this.l.setCurrentItem(this.G);
        onPageSelected(this.G);
        this.l.addOnPageChangeListener(this);
    }

    private float E() {
        if (PatchProxy.isSupport(new Object[0], this, f3778a, false, 67718, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f3778a, false, 67718, new Class[0], Float.TYPE)).floatValue();
        }
        if (this.M == -1) {
            DmtTextView dmtTextView = new DmtTextView(getContext());
            dmtTextView.setTextSize(21.0f);
            Rect rect = new Rect();
            TextPaint paint = dmtTextView.getPaint();
            paint.getTextBounds(getContext().getString(C0906R.string.cjf), 0, getContext().getString(C0906R.string.cjf).length(), rect);
            int height = rect.height();
            dmtTextView.setTextSize(13.0f);
            paint.getTextBounds(getContext().getString(C0906R.string.br3), 0, getContext().getString(C0906R.string.br3).length(), rect);
            int height2 = rect.height();
            this.M = ((int) (((UIUtils.dip2Px(getContext(), 100.0f) * 2.0f) + ((float) height)) + ((float) height2))) - (((UIUtils.getScreenHeight(getContext()) - this.l.getTop()) - this.E.H.getHeight()) - this.mStatusView.getHeight());
        }
        if (this.M < 0) {
            return 0.0f;
        }
        return (float) this.M;
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3778a, false, 67697, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3778a, false, 67697, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onSaveInstanceState(bundle);
        if (this.g != null) {
            this.g.a(bundle);
        }
    }

    private void o(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3778a, false, 67705, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3778a, false, 67705, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!(this.f3783f == null || this.l == null)) {
            int count = this.f3783f.getCount();
            for (int i3 = 0; i3 < count; i3++) {
                ProfileListFragment profileListFragment = (ProfileListFragment) this.f3783f.getItem(i3);
                if (!(profileListFragment == null || profileListFragment.getFragmentManager() == null)) {
                    if (i3 == i2) {
                        profileListFragment.setUserVisibleHint(true);
                    } else {
                        profileListFragment.setUserVisibleHint(false);
                    }
                    profileListFragment.l();
                }
            }
        }
    }

    public void a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f3778a, false, 67713, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f3778a, false, 67713, new Class[]{User.class}, Void.TYPE);
            return;
        }
        super.a(user);
        if (ex.e(user)) {
            this.f3781d.setVisibility(8);
        }
    }

    public final void k(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3778a, false, 67717, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3778a, false, 67717, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 == 0) {
            if (!TimeLockRuler.isTeenModeON()) {
                if (this.f3780c == null || this.f3780c.getVisibility() != 0) {
                    i();
                    if (this.f3780c != null) {
                        this.f3780c.setVisibility(i2);
                        this.f3780c.setScaleX(0.8f);
                        this.f3780c.setScaleY(0.8f);
                        D();
                    }
                }
            }
        } else if (this.f3780c != null) {
            this.f3780c.setVisibility(i2);
            this.f3780c.clearAnimation();
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3778a, false, 67696, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3778a, false, 67696, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.g = new f(null, this, false);
        this.g.b(bundle);
    }

    public void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f3778a, false, 67695, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3778a, false, 67695, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.l = (ViewPager) view.findViewById(C0906R.id.ckc);
        this.l.setOffscreenPageLimit(4);
        this.f3779b = (ViewStub) view.findViewById(C0906R.id.bqy);
        this.f3781d = view.findViewById(C0906R.id.bht);
        this.f3782e = (AnimationImageView) view.findViewById(C0906R.id.co_);
        super.a(view);
        if (this.f3782e != null) {
            this.f3782e.loop(true);
            this.f3782e.setAnimation("icon_cover_tip.json");
            this.f3782e.playAnimation();
        }
        this.f3781d.setOnTouchListener(ed.a(0.5f, 1.0f));
        this.f3781d.setOnClickListener(new a(this));
    }

    public final Fragment j(int i2) {
        int i3;
        String str;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3778a, false, 67714, new Class[]{Integer.TYPE}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3778a, false, 67714, new Class[]{Integer.TYPE}, Fragment.class);
        } else if (this.f3783f == null || !isAdded()) {
            return null;
        } else {
            if (this.v == null) {
                i3 = 0;
            } else {
                i3 = this.v.size();
            }
            if (i4 >= i3 || i4 < 0) {
                return null;
            }
            long itemId = this.f3783f.getItemId(i4);
            if (PatchProxy.isSupport(new Object[]{new Long(itemId)}, this, f3778a, false, 67715, new Class[]{Long.TYPE}, Fragment.class)) {
                return (Fragment) PatchProxy.accessDispatch(new Object[]{new Long(itemId)}, this, f3778a, false, 67715, new Class[]{Long.TYPE}, Fragment.class);
            }
            FragmentManager childFragmentManager = getChildFragmentManager();
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.id.ckc), new Long(itemId)}, null, f3778a, true, 67716, new Class[]{Integer.TYPE, Long.TYPE}, String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.id.ckc), new Long(itemId)}, null, f3778a, true, 67716, new Class[]{Integer.TYPE, Long.TYPE}, String.class);
            } else {
                str = "android:switcher:" + C0906R.id.ckc + ":" + itemId;
            }
            return childFragmentManager.findFragmentByTag(str);
        }
    }

    /* JADX WARNING: type inference failed for: r0v39, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r0v41, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPageSelected(int r20) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            r10 = 0
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f3778a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 67701(0x10875, float:9.487E-41)
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0040
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f3778a
            r3 = 0
            r4 = 67701(0x10875, float:9.487E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0040:
            java.util.List r0 = r7.v
            if (r0 == 0) goto L_0x02bd
            if (r8 < 0) goto L_0x02bd
            java.util.List r0 = r7.v
            int r0 = r0.size()
            if (r8 < r0) goto L_0x0050
            goto L_0x02bd
        L_0x0050:
            r7.G = r8
            java.util.List r0 = r7.v
            java.lang.Object r0 = r0.get(r8)
            r11 = r0
            android.support.v4.app.Fragment r11 = (android.support.v4.app.Fragment) r11
            boolean r0 = r11 instanceof com.ss.android.ugc.aweme.common.widget.scrollablelayout.b.a
            if (r0 == 0) goto L_0x006a
            com.ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout r0 = r7.mScrollableLayout
            com.ss.android.ugc.aweme.common.widget.scrollablelayout.b r0 = r0.getHelper()
            r1 = r11
            com.ss.android.ugc.aweme.common.widget.scrollablelayout.b$a r1 = (com.ss.android.ugc.aweme.common.widget.scrollablelayout.b.a) r1
            r0.f40577c = r1
        L_0x006a:
            boolean r0 = r11 instanceof com.ss.android.ugc.aweme.profile.ui.AwemeListFragment
            r12 = 8
            if (r0 == 0) goto L_0x00e0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f3778a
            r3 = 0
            r4 = 67703(0x10877, float:9.4872E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.support.v4.app.Fragment> r1 = android.support.v4.app.Fragment.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00a2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f3778a
            r3 = 0
            r4 = 67703(0x10877, float:9.4872E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.support.v4.app.Fragment> r1 = android.support.v4.app.Fragment.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00ee
        L_0x00a2:
            r0 = r11
            com.ss.android.ugc.aweme.profile.ui.AwemeListFragment r0 = (com.ss.android.ugc.aweme.profile.ui.AwemeListFragment) r0
            boolean r1 = r0.k()
            com.ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout r2 = r7.mScrollableLayout
            r1 = r1 ^ r9
            r2.setCanScrollUp(r1)
            boolean r0 = r0.B()
            if (r0 == 0) goto L_0x00cf
            java.lang.String r0 = "from_main"
            java.lang.String r1 = r7.F
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00cf
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.J
            int r0 = r0.getAwemeCount()
            if (r0 != 0) goto L_0x00cf
            boolean r0 = com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isTeenModeON()
            if (r0 != 0) goto L_0x00cf
            r0 = 1
            goto L_0x00d0
        L_0x00cf:
            r0 = 0
        L_0x00d0:
            if (r0 == 0) goto L_0x00d9
            r7.k(r10)
            r19.h()
            goto L_0x00ee
        L_0x00d9:
            r7.k(r12)
            r19.g()
            goto L_0x00ee
        L_0x00e0:
            boolean r0 = r11 instanceof com.ss.android.ugc.aweme.newfollow.userstate.UserStateFragment
            if (r0 != 0) goto L_0x00e8
            boolean r0 = r11 instanceof com.ss.android.ugc.aweme.favorites.ui.ProfileCollectionFragmentForJedi
            if (r0 == 0) goto L_0x00ee
        L_0x00e8:
            r7.k(r12)
            r19.g()
        L_0x00ee:
            com.ss.android.ugc.aweme.profile.a.e r0 = new com.ss.android.ugc.aweme.profile.a.e
            java.util.List r1 = r7.v
            java.lang.Object r1 = r1.get(r8)
            com.ss.android.ugc.aweme.music.util.ProfileListFragment r1 = (com.ss.android.ugc.aweme.music.util.ProfileListFragment) r1
            int r1 = r1.hashCode()
            r0.<init>(r8, r10, r1)
            com.ss.android.ugc.aweme.utils.bg.a(r0)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f3778a
            r3 = 0
            r4 = 67704(0x10878, float:9.4874E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x013c
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f3778a
            r3 = 0
            r4 = 67704(0x10878, float:9.4874E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x018d
        L_0x013c:
            boolean r0 = r19.o()
            if (r0 == 0) goto L_0x015c
            int r0 = r19.r()
            if (r8 != r0) goto L_0x015c
            com.ss.android.ugc.aweme.common.MobClick r0 = com.ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r1 = "enter_my_music"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setEventName(r1)
            java.lang.String r1 = "personal_homepage"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setLabelName(r1)
            com.ss.android.ugc.aweme.common.r.onEvent(r0)
            goto L_0x018d
        L_0x015c:
            int r0 = r19.p()
            if (r8 != r0) goto L_0x0178
            boolean r0 = r19.w()
            if (r0 == 0) goto L_0x018d
            android.support.v4.app.FragmentActivity r12 = r19.getActivity()
            java.lang.String r13 = "slide_left"
            java.lang.String r14 = "personal_homepage"
            r15 = 0
            r17 = 0
            com.ss.android.ugc.aweme.common.r.a((android.content.Context) r12, (java.lang.String) r13, (java.lang.String) r14, (long) r15, (long) r17)
            goto L_0x018d
        L_0x0178:
            boolean r0 = r19.w()
            if (r0 == 0) goto L_0x018d
            android.support.v4.app.FragmentActivity r12 = r19.getActivity()
            java.lang.String r13 = "slide_right"
            java.lang.String r14 = "personal_homepage"
            r15 = 0
            r17 = 0
            com.ss.android.ugc.aweme.common.r.a((android.content.Context) r12, (java.lang.String) r13, (java.lang.String) r14, (long) r15, (long) r17)
        L_0x018d:
            r19.o(r20)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f3778a
            r3 = 0
            r4 = 67706(0x1087a, float:9.4876E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01b7
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f3778a
            r3 = 0
            r4 = 67706(0x1087a, float:9.4876E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0269
        L_0x01b7:
            java.util.List r0 = r7.v
            int r1 = r7.G
            java.lang.Object r0 = r0.get(r1)
            android.support.v4.app.Fragment r0 = (android.support.v4.app.Fragment) r0
            r1 = 0
            boolean r2 = r0 instanceof com.ss.android.ugc.aweme.music.OriginMusicListFragment
            if (r2 == 0) goto L_0x01d0
            com.ss.android.ugc.aweme.music.OriginMusicListFragment r0 = (com.ss.android.ugc.aweme.music.OriginMusicListFragment) r0
            android.view.View r0 = r0.f()
            r1 = r0
            android.support.v7.widget.RecyclerView r1 = (android.support.v7.widget.RecyclerView) r1
            goto L_0x01dd
        L_0x01d0:
            boolean r2 = r0 instanceof com.ss.android.ugc.aweme.profile.ui.AwemeListFragment
            if (r2 == 0) goto L_0x01dd
            com.ss.android.ugc.aweme.profile.ui.AwemeListFragment r0 = (com.ss.android.ugc.aweme.profile.ui.AwemeListFragment) r0
            android.view.View r0 = r0.f()
            r1 = r0
            android.support.v7.widget.RecyclerView r1 = (android.support.v7.widget.RecyclerView) r1
        L_0x01dd:
            if (r1 == 0) goto L_0x0269
            int r0 = r1.getChildCount()
            if (r0 != 0) goto L_0x0200
            com.ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout r0 = r7.mScrollableLayout
            r0.a()
            java.util.List r0 = r7.v
            int r1 = r7.G
            int r1 = r1 + r9
            java.util.List r2 = r7.v
            int r2 = r2.size()
            int r1 = r1 % r2
            java.lang.Object r0 = r0.get(r1)
            com.ss.android.ugc.aweme.music.util.ProfileListFragment r0 = (com.ss.android.ugc.aweme.music.util.ProfileListFragment) r0
            r0.J_()
            goto L_0x0269
        L_0x0200:
            android.support.v7.widget.RecyclerView$LayoutManager r0 = r1.getLayoutManager()
            int r1 = r1.getChildCount()
            int r1 = r1 - r9
            android.view.View r0 = r0.getChildAt(r1)
            if (r0 == 0) goto L_0x0269
            int r1 = r0.getBottom()
            android.support.v4.view.ViewPager r2 = r7.l
            int r2 = r2.getTop()
            int r1 = r1 + r2
            com.ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout r2 = r7.mScrollableLayout
            int r2 = r2.getCurScrollY()
            int r1 = r1 - r2
            android.content.Context r2 = r19.getContext()
            int r2 = com.bytedance.common.utility.UIUtils.getScreenHeight(r2)
            int r3 = r19.B()
            int r1 = r1 + r3
            android.content.Context r3 = r19.getContext()
            int r3 = com.bytedance.common.utility.UIUtils.getStatusBarHeight(r3)
            int r1 = r1 + r3
            if (r1 > r2) goto L_0x0253
            com.ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout r1 = r7.mScrollableLayout
            r1.a()
            java.util.List r1 = r7.v
            int r3 = r7.G
            int r3 = r3 + r9
            java.util.List r4 = r7.v
            int r4 = r4.size()
            int r3 = r3 % r4
            java.lang.Object r1 = r1.get(r3)
            com.ss.android.ugc.aweme.music.util.ProfileListFragment r1 = (com.ss.android.ugc.aweme.music.util.ProfileListFragment) r1
            r1.J_()
        L_0x0253:
            int r0 = r0.getBottom()
            android.support.v4.view.ViewPager r1 = r7.l
            int r1 = r1.getTop()
            int r0 = r0 + r1
            int r1 = r19.B()
            int r0 = r0 + r1
            int r0 = r0 - r2
            com.ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout r1 = r7.mScrollableLayout
            r1.setMaxScrollHeight(r0)
        L_0x0269:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f3778a
            r3 = 0
            r4 = 67702(0x10876, float:9.4871E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.support.v4.app.Fragment> r1 = android.support.v4.app.Fragment.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x029b
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f3778a
            r3 = 0
            r4 = 67702(0x10876, float:9.4871E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.support.v4.app.Fragment> r1 = android.support.v4.app.Fragment.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x029b:
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.J
            if (r0 == 0) goto L_0x02a8
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.J
            int r0 = r0.getTabType()
            if (r0 != r9) goto L_0x02a8
            goto L_0x02a9
        L_0x02a8:
            r9 = 0
        L_0x02a9:
            boolean r0 = r11 instanceof com.ss.android.ugc.aweme.newfollow.userstate.UserStateFragment
            if (r0 != 0) goto L_0x02af
            if (r9 == 0) goto L_0x02bc
        L_0x02af:
            com.ss.android.ugc.aweme.poi.widget.c r0 = r7.n
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x02bc
            com.ss.android.ugc.aweme.poi.widget.c r0 = r7.n
            r0.dismiss()
        L_0x02bc:
            return
        L_0x02bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.AbsProfileFragment.onPageSelected(int):void");
    }

    public final void a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f3778a, false, 67711, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f3778a, false, 67711, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
        } else if (isViewValid() && this.v != null && !this.v.isEmpty() && this.v.size() > this.G) {
            RecyclerView recyclerView = (RecyclerView) ((ProfileListFragment) this.v.get(this.G)).f();
            if (recyclerView != null) {
                if (recyclerView.getChildCount() != 0 || TimeLockRuler.isTeenModeON()) {
                    View childAt = recyclerView.getLayoutManager().getChildAt(recyclerView.getChildCount() - 1);
                    if (childAt != null) {
                        this.mScrollableLayout.setMaxScrollHeight(((childAt.getBottom() + this.l.getTop()) + B()) - UIUtils.getScreenHeight(getContext()));
                    } else if (TimeLockRuler.isTeenModeON()) {
                        this.mScrollableLayout.setMaxScrollHeight((int) E());
                    }
                } else if (this.E != null) {
                    this.mScrollableLayout.setMaxScrollHeight(((this.E.getBottom() + B()) - UIUtils.getScreenHeight(getContext())) + ((int) UIUtils.dip2Px(getContext(), 120.0f)));
                } else {
                    this.mScrollableLayout.setCanScrollUp(false);
                }
            }
        }
    }

    public void b(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3778a, false, 67710, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3778a, false, 67710, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.b(i2, i3);
        if (this.i == 0.0f) {
            int[] iArr = new int[2];
            this.E.m.getLocationOnScreen(iArr);
            this.i = ((float) (iArr[1] - this.mTitleColorCtrl.getHeight())) - UIUtils.dip2Px(getContext(), 32.0f);
        }
        if (this.j == 0.0f) {
            this.E.H.getLocationOnScreen(new int[2]);
            this.j = Math.max((float) (this.l.getTop() - this.mScrollableLayout.getTabsMarginTop()), this.i + 1.0f);
        }
        float f2 = (float) i2;
        float f3 = (f2 - this.i) / (this.j - this.i);
        if (f3 <= 0.0f) {
            f3 = 0.0f;
        }
        if (f3 >= 1.0f) {
            f3 = 1.0f;
        }
        this.mStatusView.setAlpha(f3);
        this.mTitle.setAlpha(f3);
        float f4 = 1.0f - f3;
        this.E.O.setAlpha(f4);
        this.f3781d.setAlpha(1.0f - Math.min(Math.max(0.0f, f2 / 64.0f), 1.0f));
        if (this.mMoreBtnBg != null) {
            this.mMoreBtnBg.setAlpha(f4);
        }
        a(f3);
        c(i2, i3);
        if (this.v != null && !this.v.isEmpty() && this.G < this.v.size()) {
            RecyclerView recyclerView = (RecyclerView) ((ProfileListFragment) this.v.get(this.G)).f();
            if (recyclerView != null) {
                if (recyclerView.getChildCount() != 0 || TimeLockRuler.isTeenModeON()) {
                    View childAt = recyclerView.getLayoutManager().getChildAt(recyclerView.getChildCount() - 1);
                    if (childAt != null) {
                        if (((childAt.getBottom() + this.l.getTop()) - i2) + B() <= UIUtils.getScreenHeight(getContext())) {
                            this.mScrollableLayout.setMaxScrollHeight(i2);
                        } else if (TimeLockRuler.isTeenModeON()) {
                            this.mScrollableLayout.setMaxScrollHeight((int) E());
                        }
                    }
                } else if (this.E != null) {
                    this.mScrollableLayout.setMaxScrollHeight((this.E.getBottom() + B()) - UIUtils.getScreenHeight(getContext()));
                } else {
                    this.mScrollableLayout.setCanScrollUp(false);
                }
            }
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f3778a, false, 67698, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f3778a, false, 67698, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i2, i3, intent);
        if (this.g != null) {
            int i4 = i2;
            int i5 = i3;
            this.g.a(i2, i3, intent2);
        }
    }
}

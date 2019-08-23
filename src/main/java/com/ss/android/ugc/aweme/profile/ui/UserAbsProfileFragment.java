package com.ss.android.ugc.aweme.profile.ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.profile.EnterpriseTabFragment;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.b;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.OriginMusicListFragment;
import com.ss.android.ugc.aweme.music.util.ProfileListFragment;
import com.ss.android.ugc.aweme.newfollow.userstate.UserStateFragment;
import com.ss.android.ugc.aweme.profile.a.e;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragment;
import com.ss.android.ugc.aweme.profile.ui.header.aq;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.ex;

public abstract class UserAbsProfileFragment extends BaseDTProfileFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3809a;

    /* renamed from: b  reason: collision with root package name */
    protected ProfileFragmentAdapter3<ProfileListFragment> f3810b;

    /* renamed from: c  reason: collision with root package name */
    protected IUserService f3811c;

    /* renamed from: d  reason: collision with root package name */
    protected int f3812d = -1;

    /* renamed from: e  reason: collision with root package name */
    protected aq f3813e;

    /* renamed from: f  reason: collision with root package name */
    protected AwemeListFragment.a f3814f = new AwemeListFragment.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f62383a;

        public final void a(boolean z, int i) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i)}, this, f62383a, false, 69112, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i)}, this, f62383a, false, 69112, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (i == 0 && UserAbsProfileFragment.this.G == UserAbsProfileFragment.this.p()) {
                UserAbsProfileFragment.this.mScrollableLayout.setCanScrollUp(false);
            } else if (i == 5 && UserAbsProfileFragment.this.G == UserAbsProfileFragment.this.s()) {
                UserAbsProfileFragment.this.mScrollableLayout.setCanScrollUp(false);
            } else if (i == 1 && UserAbsProfileFragment.this.G == UserAbsProfileFragment.this.q()) {
                UserAbsProfileFragment.this.mScrollableLayout.setCanScrollUp(false);
            }
            if (UserAbsProfileFragment.this.h()) {
                UserAbsProfileFragment.this.mScrollableLayout.setCanScrollUp(true);
            }
        }

        public final void b(boolean z, int i) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i)}, this, f62383a, false, 69113, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i)}, this, f62383a, false, 69113, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            } else if (i == 0 && UserAbsProfileFragment.this.G == UserAbsProfileFragment.this.p()) {
                UserAbsProfileFragment.this.mScrollableLayout.setCanScrollUp(true);
            } else if (i == 5 && UserAbsProfileFragment.this.G == UserAbsProfileFragment.this.s()) {
                UserAbsProfileFragment.this.mScrollableLayout.setCanScrollUp(true);
            } else {
                if (i == 1 && UserAbsProfileFragment.this.G == UserAbsProfileFragment.this.q()) {
                    UserAbsProfileFragment.this.mScrollableLayout.setCanScrollUp(true);
                }
            }
        }
    };
    protected float g = 0.0f;
    protected float h = 0.0f;

    public final void c(String str) {
    }

    public final void c(boolean z) {
    }

    public final void d(int i) {
    }

    public final void d(String str) {
    }

    public final void d(boolean z) {
    }

    public final void e(int i) {
    }

    public final void e(User user) {
    }

    public void f() {
    }

    public void f(int i) {
    }

    public final void g(int i) {
    }

    public final void h(int i) {
    }

    public final void i(int i) {
    }

    public final void i() {
        this.g = 0.0f;
        this.h = 0.0f;
    }

    public final boolean h() {
        if (!PatchProxy.isSupport(new Object[0], this, f3809a, false, 69103, new Class[0], Boolean.TYPE)) {
            return ex.a(this.J, j());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3809a, false, 69103, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f3809a, false, 69106, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3809a, false, 69106, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3809a, false, 69097, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3809a, false, 69097, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
    }

    private boolean j() {
        if (PatchProxy.isSupport(new Object[0], this, f3809a, false, 69107, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3809a, false, 69107, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.J == null) {
            return false;
        } else {
            return TextUtils.equals(this.f3811c.getCurrentUserID(), this.J.getUid());
        }
    }

    public void g() {
        if (PatchProxy.isSupport(new Object[0], this, f3809a, false, 69095, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3809a, false, 69095, new Class[0], Void.TYPE);
            return;
        }
        d(0);
        e(0);
        g(0);
        a(null, 0, null, null);
        a(0, "");
        b((User) null);
        b(null);
        c("");
        d(null);
        this.mScrollableLayout.a();
        this.l.setCurrentItem(0, false);
    }

    public void n() {
        if (PatchProxy.isSupport(new Object[0], this, f3809a, false, 69094, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3809a, false, 69094, new Class[0], Void.TYPE);
            return;
        }
        c(0);
        a(0);
        b(0);
        d(0);
        e(0);
        g(0);
        a(null, 0, null, null);
        a(0, "");
        b((User) null);
        b(null);
        c("");
        d(null);
        this.mScrollableLayout.a();
        this.l.setCurrentItem(0, false);
    }

    private float l() {
        if (PatchProxy.isSupport(new Object[0], this, f3809a, false, 69111, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f3809a, false, 69111, new Class[0], Float.TYPE)).floatValue();
        }
        if (this.f3812d == -1) {
            DmtTextView dmtTextView = new DmtTextView(getContext());
            dmtTextView.setTextSize(21.0f);
            Rect rect = new Rect();
            TextPaint paint = dmtTextView.getPaint();
            paint.getTextBounds(getContext().getString(C0906R.string.cjf), 0, getContext().getString(C0906R.string.cjf).length(), rect);
            int height = rect.height();
            dmtTextView.setTextSize(13.0f);
            paint.getTextBounds(getContext().getString(C0906R.string.br3), 0, getContext().getString(C0906R.string.br3).length(), rect);
            int height2 = rect.height();
            this.f3812d = ((int) (((UIUtils.dip2Px(getContext(), 100.0f) * 2.0f) + ((float) height)) + ((float) height2))) - (((UIUtils.getScreenHeight(getContext()) - this.l.getTop()) - this.E.H.getHeight()) - this.mStatusView.getHeight());
        }
        if (this.f3812d < 0) {
            return 0.0f;
        }
        return (float) this.f3812d;
    }

    private void o(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f3809a, false, 69101, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f3809a, false, 69101, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!(this.f3810b == null || this.l == null)) {
            int count = this.f3810b.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                ProfileListFragment profileListFragment = (ProfileListFragment) this.f3810b.getItem(i2);
                if (!(profileListFragment == null || profileListFragment.getFragmentManager() == null)) {
                    if (i2 == i) {
                        profileListFragment.setUserVisibleHint(true);
                    } else {
                        profileListFragment.setUserVisibleHint(false);
                    }
                    profileListFragment.l();
                }
            }
        }
    }

    public final Fragment k(int i) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f3809a, false, 69108, new Class[]{Integer.TYPE}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f3809a, false, 69108, new Class[]{Integer.TYPE}, Fragment.class);
        } else if (this.f3810b == null || !isAdded()) {
            return null;
        } else {
            if (this.v != null) {
                i2 = this.v.size();
            }
            if (i >= i2 || i < 0) {
                return null;
            }
            return a(this.f3810b.getItemId(i));
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3809a, false, 69092, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3809a, false, 69092, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.f3811c = (IUserService) ServiceManager.get().getService(IUserService.class);
        this.f3813e = new aq() {
            public final void a() {
                UserAbsProfileFragment.this.h = 0.0f;
                UserAbsProfileFragment.this.g = 0.0f;
            }
        };
    }

    public final Fragment a(long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f3809a, false, 69109, new Class[]{Long.TYPE}, Fragment.class)) {
            return getChildFragmentManager().findFragmentByTag(a((int) C0906R.id.ckc, j2));
        }
        return (Fragment) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f3809a, false, 69109, new Class[]{Long.TYPE}, Fragment.class);
    }

    public final void j(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f3809a, false, 69096, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f3809a, false, 69096, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        Fragment k = k(i);
        if (k instanceof OriginMusicListFragment) {
            this.mScrollableLayout.getHelper().f40577c = (OriginMusicListFragment) k;
        } else if (k instanceof AwemeListFragment) {
            AwemeListFragment awemeListFragment = (AwemeListFragment) k;
            this.mScrollableLayout.getHelper().f40577c = awemeListFragment;
            this.mScrollableLayout.setCanScrollUp(!awemeListFragment.k());
        } else if (k instanceof UserStateFragment) {
            this.mScrollableLayout.getHelper().f40577c = (UserStateFragment) k;
        } else {
            if (k instanceof EnterpriseTabFragment) {
                this.mScrollableLayout.getHelper().f40577c = (EnterpriseTabFragment) k;
            }
        }
    }

    public void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f3809a, false, 69093, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3809a, false, 69093, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.l = (ViewPager) view.findViewById(C0906R.id.ckc);
        this.l.setOffscreenPageLimit(3);
        super.a(view);
    }

    public void onPageSelected(int i) {
        int i2 = i;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f3809a, false, 69098, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f3809a, false, 69098, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.G = i2;
        Fragment k = k(i);
        if (k instanceof b.a) {
            this.mScrollableLayout.getHelper().f40577c = (b.a) k;
        }
        if (k != null) {
            bg.a(new e(i2, 0, k.hashCode()));
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f3809a, false, 69100, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f3809a, false, 69100, new Class[]{Integer.TYPE}, Void.TYPE);
        } else {
            if (o() && i2 == r()) {
                r.onEvent(MobClick.obtain().setEventName("enter_my_music").setLabelName("personal_homepage"));
            }
            if (i2 == 0) {
                if (w()) {
                    r.a((Context) getActivity(), "slide_left", "personal_homepage", 0, 0);
                }
            } else if (i2 < 4 && w()) {
                r.a((Context) getActivity(), "slide_right", "personal_homepage", 0, 0);
            }
        }
        o(i);
        if (PatchProxy.isSupport(new Object[0], this, f3809a, false, 69102, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3809a, false, 69102, new Class[0], Void.TYPE);
        } else {
            Fragment k2 = k(this.G);
            View view = null;
            if (k2 instanceof b.a) {
                view = ((b.a) k2).f();
            }
            if (!(view == null || !(view instanceof RecyclerView) || this.f3810b == null)) {
                RecyclerView recyclerView = (RecyclerView) view;
                if (recyclerView.getChildCount() != 0 || h()) {
                    View childAt = recyclerView.getLayoutManager().getChildAt(recyclerView.getChildCount() - 1);
                    if (childAt != null) {
                        int bottom = (childAt.getBottom() + this.l.getTop()) - this.mScrollableLayout.getCurScrollY();
                        int screenHeight = UIUtils.getScreenHeight(getContext());
                        if (bottom + B() + UIUtils.getStatusBarHeight(getContext()) <= screenHeight) {
                            this.mScrollableLayout.a();
                            ProfileListFragment profileListFragment = (ProfileListFragment) k((this.G + 1) % this.f3810b.getCount());
                            if (profileListFragment != null) {
                                profileListFragment.J_();
                            }
                        }
                        this.mScrollableLayout.setMaxScrollHeight(((childAt.getBottom() + this.l.getTop()) + B()) - screenHeight);
                    }
                } else {
                    this.mScrollableLayout.a();
                    ProfileListFragment profileListFragment2 = (ProfileListFragment) k((this.G + 1) % this.f3810b.getCount());
                    if (profileListFragment2 != null) {
                        profileListFragment2.J_();
                    }
                }
            }
        }
        if (PatchProxy.isSupport(new Object[]{k}, this, f3809a, false, 69099, new Class[]{Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{k}, this, f3809a, false, 69099, new Class[]{Fragment.class}, Void.TYPE);
            return;
        }
        if (this.J == null || this.J.getTabType() != 1) {
            z = false;
        }
        if (((k instanceof UserStateFragment) || z) && this.n.isShowing()) {
            this.n.dismiss();
        }
    }

    private static String a(int i, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.id.ckc), new Long(j2)}, null, f3809a, true, 69110, new Class[]{Integer.TYPE, Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.id.ckc), new Long(j2)}, null, f3809a, true, 69110, new Class[]{Integer.TYPE, Long.TYPE}, String.class);
        }
        return "android:switcher:" + C0906R.id.ckc + ":" + j2;
    }

    public void a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f3809a, false, 69105, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f3809a, false, 69105, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            ProfileListFragment profileListFragment = (ProfileListFragment) k(this.G);
            if (profileListFragment != null) {
                RecyclerView recyclerView = (RecyclerView) profileListFragment.f();
                if (recyclerView != null) {
                    if (recyclerView.getChildCount() != 0 || h()) {
                        View childAt = recyclerView.getLayoutManager().getChildAt(recyclerView.getChildCount() - 1);
                        if (childAt != null) {
                            this.mScrollableLayout.setMaxScrollHeight(((childAt.getBottom() + this.l.getTop()) + B()) - UIUtils.getScreenHeight(getContext()));
                        } else if (h()) {
                            this.mScrollableLayout.setMaxScrollHeight((int) l());
                        }
                    } else {
                        this.mScrollableLayout.setCanScrollUp(false);
                    }
                }
            }
        }
    }

    public void b(int i, int i2) {
        boolean z;
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f3809a, false, 69104, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f3809a, false, 69104, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.b(i, i2);
        if (this.g == 0.0f) {
            int[] iArr = new int[2];
            this.E.m.getLocationOnScreen(iArr);
            this.g = ((float) (iArr[1] - this.mTitleColorCtrl.getHeight())) - UIUtils.dip2Px(getContext(), 32.0f);
        }
        if (this.h == 0.0f) {
            this.E.H.getLocationOnScreen(new int[2]);
            this.h = Math.max((float) this.mScrollableLayout.getMaxY(), this.g + 1.0f);
        }
        float f2 = (((float) i) - this.g) / (this.h - this.g);
        if (f2 <= 0.0f) {
            f2 = 0.0f;
        }
        if (f2 >= 1.0f) {
            f2 = 1.0f;
        }
        this.mStatusView.setAlpha(f2);
        this.mTitle.setAlpha(f2);
        this.mFastChatBtn.setAlpha(f2);
        RemoteImageView remoteImageView = this.mFastChatBtn;
        if (f2 == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        remoteImageView.setEnabled(z);
        this.mFastFollowBtn.setAlpha(f2);
        DmtTextView dmtTextView = this.mFastFollowBtn;
        if (f2 == 1.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        dmtTextView.setEnabled(z2);
        float f3 = 1.0f - f2;
        this.E.O.setAlpha(f3);
        if (this.mBackBtnBg != null) {
            this.mBackBtnBg.setAlpha(f3);
        }
        if (this.mMoreBtnBg != null) {
            this.mMoreBtnBg.setAlpha(f3);
        }
        a(f2);
        c(i, i2);
        if (this.f3810b != null && this.f3810b.getCount() != 0) {
            ProfileListFragment profileListFragment = (ProfileListFragment) k(this.G);
            if (profileListFragment != null) {
                RecyclerView recyclerView = (RecyclerView) profileListFragment.f();
                if (recyclerView != null) {
                    if (recyclerView.getChildCount() != 0 || h()) {
                        View childAt = recyclerView.getLayoutManager().getChildAt(recyclerView.getChildCount() - 1);
                        if (childAt != null) {
                            if (((childAt.getBottom() + this.l.getTop()) - i) + B() <= UIUtils.getScreenHeight(getContext())) {
                                this.mScrollableLayout.setMaxScrollHeight(i);
                            }
                        } else if (h()) {
                            this.mScrollableLayout.setMaxScrollHeight((int) l());
                        }
                    } else {
                        this.mScrollableLayout.setCanScrollUp(false);
                    }
                }
            }
        }
    }
}

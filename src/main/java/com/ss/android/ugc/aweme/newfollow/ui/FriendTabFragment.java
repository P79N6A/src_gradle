package com.ss.android.ugc.aweme.newfollow.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.param.IFollowFeedFetchTrigger;
import com.ss.android.ugc.aweme.follow.b;
import com.ss.android.ugc.aweme.friends.ui.AddFriendsActivity;
import com.ss.android.ugc.aweme.main.base.FriendTabStrip;
import com.ss.android.ugc.aweme.main.bl;
import com.ss.android.ugc.aweme.message.c.c;
import com.ss.android.ugc.aweme.newfollow.vh.y;
import com.ss.android.ugc.aweme.profile.ui.header.as;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.y.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;

public class FriendTabFragment extends AmeBaseFragment implements b, as {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3654a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<Fragment> f3655b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public String f3656c;

    /* renamed from: d  reason: collision with root package name */
    int f3657d;

    /* renamed from: e  reason: collision with root package name */
    private int f3658e = -1;

    /* renamed from: f  reason: collision with root package name */
    private String f3659f;
    private boolean g = true;
    private int h = -1;
    private boolean i = false;
    @BindView(2131494363)
    View mFollowYellowDot;
    @BindView(2131497923)
    TextView mFriendList;
    @BindView(2131494418)
    FriendTabStrip mFriendTabStrip;
    @BindView(2131494415)
    View mFriendYellowDot;
    @BindView(2131497328)
    View mStatusBar;
    @BindView(2131495168)
    ImageView mStoryIconView;
    @BindView(2131498172)
    TextView mStoryTextView;
    @BindView(2131497613)
    RelativeLayout mTitleLayout;
    @BindView(2131498537)
    public ViewPager mViewPager;

    public final void d() {
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3654a, false, 61571, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3654a, false, 61571, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f3655b != null && isViewValid()) {
            Iterator<Fragment> it2 = this.f3655b.iterator();
            while (it2.hasNext()) {
                View view = ((FollowFeedFragment) it2.next()).f3652e;
                if (view != null) {
                    if (z) {
                        view.setBackgroundResource(2130838000);
                    } else {
                        view.setBackgroundColor(getResources().getColor(C0906R.color.bn));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3654a, false, 61589, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f3654a, false, 61589, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            r.a("homepage_follow_notice", (Map) d.a().a("enter_from", Q_() ? "homepage_follow" : "homepage_friends").a("notice_type", "yellow_dot").a("action_type", z2 ? "show" : "click").f34114b);
        } else {
            r.a("homepage_friends_notice", (Map) d.a().a("enter_from", Q_() ? "homepage_follow" : "homepage_friends").a("notice_type", "yellow_dot").a("action_type", z2 ? "show" : "click").f34114b);
        }
    }

    public final void a(String str, boolean z) {
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3654a, false, 61592, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f3654a, false, 61592, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
        } else if (AbTestManager.a().bT() != 2 || !z) {
            if (isViewValid()) {
                if (z) {
                    this.mViewPager.setCurrentItem(1);
                } else if (this.f3655b.size() >= 2) {
                    this.mViewPager.setCurrentItem(0);
                }
                Fragment fragment = this.f3655b.get(z);
                if (fragment instanceof FollowFeedFragment) {
                    ((FollowFeedFragment) fragment).a(str);
                }
            }
            this.f3659f = str;
            this.h = z ? 1 : 0;
            if (this.h == 1) {
                this.f3658e = 1;
            } else {
                this.f3658e = 0;
            }
        }
    }

    private void m() {
        if (PatchProxy.isSupport(new Object[0], this, f3654a, false, 61585, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3654a, false, 61585, new Class[0], Void.TYPE);
            return;
        }
        e(c.a().d(51));
        d(c.a().d(50));
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3654a, false, 61593, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3654a, false, 61593, new Class[0], Void.TYPE);
            return;
        }
        a(0);
        if (AbTestManager.a().bM()) {
            l();
            return;
        }
        this.i = true;
        g();
    }

    public Fragment j() {
        if (PatchProxy.isSupport(new Object[0], this, f3654a, false, 61579, new Class[0], Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[0], this, f3654a, false, 61579, new Class[0], Fragment.class);
        } else if (this.f3655b == null || this.f3655b.size() <= 1) {
            return null;
        } else {
            return this.f3655b.get(1);
        }
    }

    public Fragment k() {
        if (PatchProxy.isSupport(new Object[0], this, f3654a, false, 61580, new Class[0], Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[0], this, f3654a, false, 61580, new Class[0], Fragment.class);
        } else if (this.f3655b == null || this.f3655b.size() <= 0) {
            return null;
        } else {
            return this.f3655b.get(0);
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3654a, false, 61581, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3654a, false, 61581, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        f();
        if (this.g) {
            this.g = false;
            bl.a(com.ss.android.experiencekit.c.d.END, "tag", getTag());
        }
    }

    private void l() {
        if (PatchProxy.isSupport(new Object[0], this, f3654a, false, 61569, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3654a, false, 61569, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f3655b == null || this.mViewPager == null || this.f3655b.size() <= this.mViewPager.getCurrentItem())) {
            ((FollowFeedFragment) this.f3655b.get(this.mViewPager.getCurrentItem())).c();
        }
    }

    public final boolean Q_() {
        if (PatchProxy.isSupport(new Object[0], this, f3654a, false, 61577, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3654a, false, 61577, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mViewPager != null) {
            if (this.mViewPager.getCurrentItem() == 0) {
                return true;
            }
            return false;
        } else if (this.f3658e < 0) {
            return a.a().b();
        } else {
            if (this.f3658e == 0) {
                return true;
            }
            return false;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3654a, false, 61595, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3654a, false, 61595, new Class[0], Void.TYPE);
            return;
        }
        a(c.a().d(50) ^ true ? 1 : 0);
        if (AbTestManager.a().bM()) {
            l();
        } else {
            this.i = true;
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f3654a, false, 61596, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3654a, false, 61596, new Class[0], Void.TYPE);
            return;
        }
        a(c.a().d(50) ^ true ? 1 : 0);
        if (AbTestManager.a().bM()) {
            l();
        } else {
            this.i = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (PatchProxy.isSupport(new Object[0], this, f3654a, false, 61555, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3654a, false, 61555, new Class[0], Void.TYPE);
        } else if (this.mTitleLayout != null) {
            if (this.mTitleLayout.getVisibility() != 0) {
                this.mTitleLayout.setVisibility(0);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mTitleLayout.getLayoutParams();
            layoutParams.topMargin = 0;
            this.mTitleLayout.setLayoutParams(layoutParams);
            this.mTitleLayout.setAlpha(1.0f);
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f3654a, false, 61568, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3654a, false, 61568, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f3655b == null || this.mViewPager == null || this.f3655b.size() <= this.mViewPager.getCurrentItem())) {
            ((FollowFeedFragment) this.f3655b.get(this.mViewPager.getCurrentItem())).a();
        }
    }

    public final boolean h() {
        if (PatchProxy.isSupport(new Object[0], this, f3654a, false, 61576, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3654a, false, 61576, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mViewPager != null) {
            if (this.mViewPager.getCurrentItem() == 1) {
                return true;
            }
            return false;
        } else if (this.f3658e < 0) {
            if (!a.a().b()) {
                return true;
            }
            return false;
        } else if (this.f3658e == 1) {
            return true;
        } else {
            return false;
        }
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f3654a, false, 61578, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3654a, false, 61578, new Class[0], Void.TYPE);
            return;
        }
        if (!Q_()) {
            a(0);
        }
        Fragment k = k();
        if (k instanceof FollowFeedFragment) {
            ((FollowFeedFragment) k).d();
        }
        Fragment j = j();
        if (j instanceof FollowFeedFragment) {
            ((FollowFeedFragment) j).d();
        }
    }

    @OnClick({2131497923})
    public void onClickFriendList() {
        if (PatchProxy.isSupport(new Object[0], this, f3654a, false, 61567, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3654a, false, 61567, new Class[0], Void.TYPE);
        } else if (!y.a() && ((double) this.mFriendList.getAlpha()) >= 0.5d) {
            r.a("click_friends_list", (Map) d.a().a("enter_from", "homepage_friends").f34114b);
            if (getActivity() != null) {
                Intent intent = new Intent(getActivity(), AddFriendsActivity.class);
                intent.putExtra("bundle_recommend_user_type", 2);
                intent.putExtra("enter_from", "homepage_friends");
                getActivity().startActivity(intent);
            }
        }
    }

    private void d(boolean z) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3654a, false, 61561, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3654a, false, 61561, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (AbTestManager.a().bT() != 2) {
            View view = this.mFollowYellowDot;
            if (!z) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }

    private void e(boolean z) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3654a, false, 61562, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3654a, false, 61562, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (AbTestManager.a().bT() != 2) {
            View view = this.mFriendYellowDot;
            if (!z) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }

    public void onHiddenChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3654a, false, 61583, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3654a, false, 61583, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z);
        if (!(this.f3655b == null || this.mViewPager == null || this.f3655b.size() <= this.mViewPager.getCurrentItem())) {
            ((FollowFeedFragment) this.f3655b.get(this.mViewPager.getCurrentItem())).onHiddenChanged(z);
            if (!z) {
                a(this.mViewPager.getCurrentItem(), true, false);
            }
        }
        if (!z) {
            bl.a(com.ss.android.experiencekit.c.d.END, "tag", getTag());
        }
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3654a, false, 61582, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3654a, false, 61582, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        if (!(this.f3655b == null || this.mViewPager == null || this.f3655b.size() <= this.mViewPager.getCurrentItem())) {
            ((FollowFeedFragment) this.f3655b.get(this.mViewPager.getCurrentItem())).setUserVisibleHint(z);
        }
    }

    private void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3654a, false, 61557, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3654a, false, 61557, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "homepage_friends");
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 1);
        bundle.putString("extra_follow_type", "extra_follow_type_friend");
        if (this.h == 1) {
            bundle.putString("extra_story_insert_uid", this.f3659f);
        }
        bundle.putBoolean("extra_follow_lazy_refresh", z);
        Fragment findFragmentByTag = getChildFragmentManager().findFragmentByTag(a((int) C0906R.id.duu, (long) this.f3655b.size()));
        if (findFragmentByTag == null) {
            findFragmentByTag = new FollowFeedFragment();
        }
        findFragmentByTag.setArguments(bundle);
        this.f3655b.add(findFragmentByTag);
    }

    private void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3654a, false, 61558, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3654a, false, 61558, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "homepage_follow");
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 1);
        bundle.putString("extra_follow_type", "extra_follow_type_follow");
        if (this.h == 0) {
            bundle.putString("extra_story_insert_uid", this.f3659f);
        }
        bundle.putString("extra_insert_aweme_id", this.f3656c);
        bundle.putBoolean("extra_follow_lazy_refresh", z);
        Fragment findFragmentByTag = getChildFragmentManager().findFragmentByTag(a((int) C0906R.id.duu, (long) this.f3655b.size()));
        if (findFragmentByTag == null) {
            findFragmentByTag = new FollowFeedFragment();
        }
        findFragmentByTag.setArguments(bundle);
        this.f3655b.add(findFragmentByTag);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3654a, false, 61587, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3654a, false, 61587, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.mViewPager != null) {
            this.mViewPager.setCurrentItem(i2);
        } else {
            this.f3658e = i2;
        }
    }

    @Subscribe
    public void onNotificationIndicatorEvent(com.ss.android.ugc.aweme.message.b.c cVar) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f3654a, false, 61584, new Class[]{com.ss.android.ugc.aweme.message.b.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f3654a, false, 61584, new Class[]{com.ss.android.ugc.aweme.message.b.c.class}, Void.TYPE);
            return;
        }
        int i2 = cVar.f55358a;
        c.a();
        if (c.f(i2)) {
            if (cVar.f55359b == -1) {
                int i3 = cVar.f55358a;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3)}, this, f3654a, false, 61586, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3)}, this, f3654a, false, 61586, new Class[]{Integer.TYPE}, Void.TYPE);
                } else if (i3 == 51) {
                    e(c.a().d(51));
                } else {
                    if (i3 == 50) {
                        d(c.a().d(50));
                    }
                }
            } else if (!getUserVisibleHint() || AbTestManager.a().bU()) {
                m();
                if (c.a().d(i2)) {
                    if (i2 == 50) {
                        z = true;
                    }
                    a(z, true);
                }
            }
        }
    }

    public final void a(@IFollowFeedFetchTrigger.IRefreshType Integer num) {
        if (PatchProxy.isSupport(new Object[]{num}, this, f3654a, false, 61574, new Class[]{Integer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{num}, this, f3654a, false, 61574, new Class[]{Integer.class}, Void.TYPE);
            return;
        }
        if (AbTestManager.a().aB() == 8 || AbTestManager.a().aB() == 9) {
            f();
        }
        if (!(this.f3655b == null || this.mViewPager == null || this.f3655b.size() <= this.mViewPager.getCurrentItem())) {
            FollowFeedFragment followFeedFragment = (FollowFeedFragment) this.f3655b.get(this.mViewPager.getCurrentItem());
            if (followFeedFragment.isViewValid()) {
                followFeedFragment.a(num.intValue());
            }
        }
    }

    public final void a(@NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3654a, false, 61594, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3654a, false, 61594, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a(0);
        if (!TextUtils.isEmpty(this.f3656c)) {
            this.f3656c = this.f3656c;
        }
        l();
    }

    private static String a(int i2, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.id.duu), new Long(j2)}, null, f3654a, true, 61559, new Class[]{Integer.TYPE, Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.id.duu), new Long(j2)}, null, f3654a, true, 61559, new Class[]{Integer.TYPE, Long.TYPE}, String.class);
        }
        return "android:switcher:" + C0906R.id.duu + ":" + j2;
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f3654a, false, 61590, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z)}, this, f3654a, false, 61590, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (i2 == 1) {
            str4 = "enter_homepage_friends";
            if (z) {
                str3 = "click_friends_tab";
            } else {
                str3 = "slide";
            }
            str2 = "homepage_follow";
            if (this.mFriendYellowDot.getVisibility() == 0) {
                str = "yellow_dot";
            } else {
                str = "";
            }
        } else {
            str4 = "enter_homepage_follow";
            if (z) {
                str5 = "click_follow_tab";
            } else {
                str5 = "slide";
            }
            str2 = "homepage_friends";
            if (this.mFollowYellowDot.getVisibility() == 0) {
                str = "yellow_dot";
            } else {
                str = "";
            }
        }
        r.a(str4, (Map) d.a().a("previous_page", str2).a("enter_from", str3).a("head_notice_type", str).a("bottom_notice_type", "").f34114b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x016f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r21, android.os.Bundle r22) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            r12 = 1
            r0[r12] = r22
            com.meituan.robust.ChangeQuickRedirect r2 = f3654a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r11] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 61550(0xf06e, float:8.625E-41)
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0045
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r22
            com.meituan.robust.ChangeQuickRedirect r2 = f3654a
            r3 = 0
            r4 = 61550(0xf06e, float:8.625E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r11] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0045:
            super.onViewCreated(r21, r22)
            int r0 = r7.f3658e
            if (r0 >= 0) goto L_0x005a
            com.ss.android.ugc.aweme.y.a r0 = com.ss.android.ugc.aweme.y.a.a()
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0058
            r0 = 0
            goto L_0x005c
        L_0x0058:
            r0 = 1
            goto L_0x005c
        L_0x005a:
            int r0 = r7.f3658e
        L_0x005c:
            r7.f3658e = r0
            android.content.Context r0 = r20.getContext()
            r1 = 1112539136(0x42500000, float:52.0)
            float r0 = com.bytedance.common.utility.UIUtils.dip2Px(r0, r1)
            int r0 = (int) r0
            r7.f3657d = r0
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f3654a
            r3 = 0
            r4 = 61553(0xf071, float:8.6254E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x009e
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f3654a
            r3 = 0
            r4 = 61553(0xf071, float:8.6254E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0183
        L_0x009e:
            java.util.ArrayList<android.support.v4.app.Fragment> r0 = r7.f3655b
            if (r0 == 0) goto L_0x00a7
            java.util.ArrayList<android.support.v4.app.Fragment> r0 = r7.f3655b
            r0.clear()
        L_0x00a7:
            boolean r0 = com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isInTeenagerModeNewVersion()
            if (r0 == 0) goto L_0x00ae
            goto L_0x0104
        L_0x00ae:
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            int r0 = r0.bT()
            if (r0 != r10) goto L_0x00f4
            int r0 = r7.f3658e
            if (r0 == 0) goto L_0x00be
            r0 = 1
            goto L_0x00bf
        L_0x00be:
            r0 = 0
        L_0x00bf:
            r7.c(r0)
            com.ss.android.ugc.aweme.main.base.FriendTabStrip r0 = r7.mFriendTabStrip
            java.lang.Object[] r13 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.main.base.FriendTabStrip.f54372a
            r16 = 0
            r17 = 57738(0xe18a, float:8.0908E-41)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r0
            r18 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r1 == 0) goto L_0x00ee
            java.lang.Object[] r13 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.main.base.FriendTabStrip.f54372a
            r16 = 0
            r17 = 57738(0xe18a, float:8.0908E-41)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r0
            r18 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0108
        L_0x00ee:
            com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout r0 = r0.f54373b
            r0.setSelectedTabIndicatorHeight(r11)
            goto L_0x0108
        L_0x00f4:
            int r0 = r7.f3658e
            if (r0 == 0) goto L_0x00fa
            r0 = 1
            goto L_0x00fb
        L_0x00fa:
            r0 = 0
        L_0x00fb:
            r7.c(r0)
            int r0 = r7.f3658e
            if (r0 == r12) goto L_0x0104
            r0 = 1
            goto L_0x0105
        L_0x0104:
            r0 = 0
        L_0x0105:
            r7.b(r0)
        L_0x0108:
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f3654a
            r3 = 0
            r4 = 61566(0xf07e, float:8.6272E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x013a
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f3654a
            r3 = 0
            r4 = 61566(0xf07e, float:8.6272E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0149
        L_0x013a:
            r0 = 2131168254(0x7f070bfe, float:1.7950805E38)
            android.view.View r0 = r8.findViewById(r0)
            com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment$3 r1 = new com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment$3
            r1.<init>(r0)
            r0.setOnTouchListener(r1)
        L_0x0149:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f3654a
            r3 = 0
            r4 = 61588(0xf094, float:8.6303E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x016f
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f3654a
            r3 = 0
            r4 = 61588(0xf094, float:8.6303E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0183
        L_0x016f:
            com.ss.android.ugc.aweme.base.livedata.a r0 = com.ss.android.ugc.aweme.base.livedata.a.a()
            java.lang.String r1 = "change_tab_event"
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            com.ss.android.ugc.aweme.arch.widgets.base.b r0 = r0.a(r1, r2)
            com.ss.android.ugc.aweme.newfollow.ui.h r1 = new com.ss.android.ugc.aweme.newfollow.ui.h
            r1.<init>(r7)
            r0.observe(r7, r1)
        L_0x0183:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f3654a
            r3 = 0
            r4 = 61560(0xf078, float:8.6264E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01aa
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f3654a
            r3 = 0
            r4 = 61560(0xf078, float:8.6264E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x028f
        L_0x01aa:
            com.ss.android.ugc.aweme.newfollow.ui.FriendTabPagerAdapter r0 = new com.ss.android.ugc.aweme.newfollow.ui.FriendTabPagerAdapter
            android.support.v4.app.FragmentManager r1 = r20.getChildFragmentManager()
            java.util.ArrayList<android.support.v4.app.Fragment> r2 = r7.f3655b
            r0.<init>(r1, r2)
            com.ss.android.ugc.aweme.main.base.h r1 = new com.ss.android.ugc.aweme.main.base.h
            android.support.v4.app.FragmentActivity r2 = r20.getActivity()
            r1.<init>(r2)
            android.support.v4.view.ViewPager r2 = r7.mViewPager
            r1.a(r2)
            android.widget.RelativeLayout r1 = r7.mTitleLayout
            r1.setVisibility(r11)
            android.view.View r1 = r7.mStatusBar
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            android.support.v4.app.FragmentActivity r2 = r20.getActivity()
            int r2 = com.bytedance.common.utility.UIUtils.getStatusBarHeight(r2)
            r1.height = r2
            android.view.View r2 = r7.mStatusBar
            r2.setLayoutParams(r1)
            com.ss.android.ugc.aweme.main.base.FriendTabStrip r1 = r7.mFriendTabStrip
            android.support.v4.view.ViewPager r2 = r7.mViewPager
            r1.setViewPager(r2)
            android.support.v4.view.ViewPager r1 = r7.mViewPager
            r1.setAdapter(r0)
            android.support.v4.view.ViewPager r0 = r7.mViewPager
            r0.setOverScrollMode(r10)
            android.support.v4.view.ViewPager r0 = r7.mViewPager
            int r1 = r7.f3658e
            r0.setCurrentItem(r1)
            android.widget.TextView r0 = r7.mFriendList
            boolean r1 = com.ss.android.ugc.aweme.newfollow.vh.y.a()
            if (r1 != 0) goto L_0x0206
            int r1 = r7.f3658e
            if (r1 != r12) goto L_0x0206
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0207
        L_0x0206:
            r1 = 0
        L_0x0207:
            r0.setAlpha(r1)
            android.widget.TextView r0 = r7.mFriendList
            boolean r1 = com.ss.android.ugc.aweme.newfollow.vh.y.a()
            if (r1 != 0) goto L_0x0218
            int r1 = r7.f3658e
            if (r1 != r12) goto L_0x0218
            r1 = 1
            goto L_0x0219
        L_0x0218:
            r1 = 0
        L_0x0219:
            r0.setEnabled(r1)
            android.support.v4.view.ViewPager r0 = r7.mViewPager
            com.ss.android.ugc.aweme.main.base.transforms.ForegroundToBackgroundTransformer r1 = new com.ss.android.ugc.aweme.main.base.transforms.ForegroundToBackgroundTransformer
            r1.<init>()
            r0.setPageTransformer(r11, r1)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f3654a
            r3 = 0
            r4 = 61563(0xf07b, float:8.6268E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x024c
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f3654a
            r3 = 0
            r4 = 61563(0xf07b, float:8.6268E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0264
        L_0x024c:
            com.ss.android.ugc.aweme.main.base.FriendTabStrip r0 = r7.mFriendTabStrip
            com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout r0 = r0.getTabLayout()
            if (r0 == 0) goto L_0x0264
            com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment$2 r1 = new com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment$2
            r1.<init>()
            r0.a((com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout.b) r1)
            com.ss.android.ugc.aweme.newfollow.ui.g r1 = new com.ss.android.ugc.aweme.newfollow.ui.g
            r1.<init>(r7)
            r0.setOnTabClickListener(r1)
        L_0x0264:
            android.support.v4.view.ViewPager r0 = r7.mViewPager
            com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment$1 r1 = new com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment$1
            r1.<init>()
            r0.addOnPageChangeListener(r1)
            r20.m()
            com.ss.android.ugc.aweme.message.c.c r0 = com.ss.android.ugc.aweme.message.c.c.a()
            r1 = 50
            boolean r0 = r0.d(r1)
            if (r0 == 0) goto L_0x0280
            r7.a((boolean) r12, (boolean) r12)
        L_0x0280:
            com.ss.android.ugc.aweme.message.c.c r0 = com.ss.android.ugc.aweme.message.c.c.a()
            r1 = 51
            boolean r0 = r0.d(r1)
            if (r0 == 0) goto L_0x028f
            r7.a((boolean) r11, (boolean) r12)
        L_0x028f:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f3654a
            r3 = 0
            r4 = 61565(0xf07d, float:8.6271E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x02b5
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f3654a
            r3 = 0
            r4 = 61565(0xf07d, float:8.6271E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x02f3
        L_0x02b5:
            com.ss.android.ugc.aweme.aj.b r0 = com.ss.android.ugc.aweme.aj.b.b()
            android.support.v4.app.FragmentActivity r1 = r20.getActivity()
            java.lang.String r2 = "is_friend_tab_guide_show"
            boolean r0 = r0.b((android.content.Context) r1, (java.lang.String) r2, (boolean) r12)
            if (r0 == 0) goto L_0x02f3
            boolean r0 = com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isInTeenagerModeNewVersion()
            if (r0 != 0) goto L_0x02f3
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            int r0 = r0.bT()
            if (r0 == r10) goto L_0x02f3
            com.ss.android.ugc.aweme.main.by.b()
            com.ss.android.ugc.aweme.main.guide.FriendTabGuideDialogFragment r0 = new com.ss.android.ugc.aweme.main.guide.FriendTabGuideDialogFragment
            r0.<init>()
            android.support.v4.app.FragmentManager r1 = r20.getChildFragmentManager()
            java.lang.String r2 = ""
            r0.show((android.support.v4.app.FragmentManager) r1, (java.lang.String) r2)
            com.ss.android.ugc.aweme.aj.b r0 = com.ss.android.ugc.aweme.aj.b.b()
            android.support.v4.app.FragmentActivity r1 = r20.getActivity()
            java.lang.String r2 = "is_friend_tab_guide_show"
            r0.a((android.content.Context) r1, (java.lang.String) r2, (boolean) r11)
        L_0x02f3:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f3654a
            r3 = 0
            r4 = 61551(0xf06f, float:8.6251E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r8 = 9
            r9 = 8
            if (r0 == 0) goto L_0x031d
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f3654a
            r3 = 0
            r4 = 61551(0xf06f, float:8.6251E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0343
        L_0x031d:
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            int r0 = r0.aB()
            if (r0 == r9) goto L_0x0331
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            int r0 = r0.aB()
            if (r0 != r8) goto L_0x0343
        L_0x0331:
            android.support.v4.app.FragmentActivity r0 = r20.getActivity()
            com.ss.android.ugc.aweme.newfollow.ui.FriendTabViewModel r0 = com.ss.android.ugc.aweme.newfollow.ui.FriendTabViewModel.a(r0)
            android.arch.lifecycle.MutableLiveData<com.ss.android.ugc.aweme.newfollow.ui.m> r0 = r0.f57252b
            com.ss.android.ugc.aweme.newfollow.ui.e r1 = new com.ss.android.ugc.aweme.newfollow.ui.e
            r1.<init>(r7)
            r0.observe(r7, r1)
        L_0x0343:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f3654a
            r3 = 0
            r4 = 61552(0xf070, float:8.6253E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0369
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f3654a
            r3 = 0
            r4 = 61552(0xf070, float:8.6253E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x038f
        L_0x0369:
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            int r0 = r0.aB()
            if (r0 == r9) goto L_0x037d
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            int r0 = r0.aB()
            if (r0 != r8) goto L_0x038f
        L_0x037d:
            android.support.v4.app.FragmentActivity r0 = r20.getActivity()
            com.ss.android.ugc.aweme.newfollow.ui.FriendTabViewModel r0 = com.ss.android.ugc.aweme.newfollow.ui.FriendTabViewModel.a(r0)
            android.arch.lifecycle.MutableLiveData<com.ss.android.ugc.aweme.newfollow.ui.n> r0 = r0.f57253c
            com.ss.android.ugc.aweme.newfollow.ui.f r1 = new com.ss.android.ugc.aweme.newfollow.ui.f
            r1.<init>(r7)
            r0.observe(r7, r1)
        L_0x038f:
            r0 = -1
            r7.f3658e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup2, bundle}, this, f3654a, false, 61549, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return com.bytedance.ies.x2c.d.a(getContext(), C0906R.layout.fragment_friend_tab, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup2, bundle}, this, f3654a, false, 61549, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0296, code lost:
        if (r0 != false) goto L_0x029a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x029a, code lost:
        if (r11 == false) goto L_0x029c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r20, boolean r21, boolean r22) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = 3
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            r10 = 0
            r0[r10] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r21)
            r11 = 1
            r0[r11] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r22)
            r12 = 2
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f3654a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 61564(0xf07c, float:8.627E-41)
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x006a
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            r0[r10] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r21)
            r0[r11] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r22)
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f3654a
            r3 = 0
            r4 = 61564(0xf07c, float:8.627E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x006a:
            android.widget.TextView r0 = r7.mFriendList
            boolean r1 = com.ss.android.ugc.aweme.newfollow.vh.y.a()
            if (r1 != 0) goto L_0x0076
            if (r8 != r11) goto L_0x0076
            r1 = 1
            goto L_0x0077
        L_0x0076:
            r1 = 0
        L_0x0077:
            r0.setEnabled(r1)
            java.util.ArrayList<android.support.v4.app.Fragment> r0 = r7.f3655b
            int r0 = r0.size()
            if (r0 <= r8) goto L_0x029f
            java.util.ArrayList<android.support.v4.app.Fragment> r0 = r7.f3655b
            java.lang.Object r0 = r0.get(r8)
            android.support.v4.app.Fragment r0 = (android.support.v4.app.Fragment) r0
            boolean r1 = r0 instanceof com.ss.android.ugc.aweme.newfollow.ui.FollowFeedFragment
            if (r1 == 0) goto L_0x029f
            r9 = r0
            com.ss.android.ugc.aweme.newfollow.ui.FollowFeedFragment r9 = (com.ss.android.ugc.aweme.newfollow.ui.FollowFeedFragment) r9
            boolean r0 = r9.f3653f
            if (r0 == 0) goto L_0x0119
            java.lang.Object[] r12 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.newfollow.ui.FollowFeedFragment.f3648a
            r15 = 0
            r16 = 61510(0xf046, float:8.6194E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r9
            r17 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r0 == 0) goto L_0x00be
            java.lang.Object[] r12 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.newfollow.ui.FollowFeedFragment.f3648a
            r15 = 0
            r16 = 61510(0xf046, float:8.6194E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r9
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x029f
        L_0x00be:
            boolean r0 = r9.f3653f
            if (r0 == 0) goto L_0x029f
            com.ss.android.ugc.aweme.newfollow.vh.n r0 = r9.f3649b
            java.lang.String r1 = r9.g
            java.lang.String r2 = r9.h
            java.lang.String r3 = r9.i
            r0.a(r1, r2, r3)
            com.ss.android.ugc.aweme.newfollow.vh.n r0 = r9.f3649b
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.newfollow.vh.n.f57731a
            r14 = 0
            r15 = 62254(0xf32e, float:8.7236E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x00f7
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.newfollow.vh.n.f57731a
            r14 = 0
            r15 = 62254(0xf32e, float:8.7236E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0110
        L_0x00f7:
            com.ss.android.ugc.aweme.newfollow.adapter.FeedAdapter r1 = r0.j
            com.ss.android.ugc.aweme.newfollow.adapter.FollowFeedAdapter r1 = (com.ss.android.ugc.aweme.newfollow.adapter.FollowFeedAdapter) r1
            com.ss.android.ugc.aweme.story.api.b.c r1 = r1.h
            if (r1 == 0) goto L_0x0110
            java.lang.String r2 = r0.h
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x010d
            java.lang.String r0 = r0.h
            r1.a((java.lang.String) r0)
            goto L_0x0110
        L_0x010d:
            r1.ai_()
        L_0x0110:
            r9.f3653f = r10
            com.ss.android.ugc.aweme.newfollow.vh.n r0 = r9.f3649b
            r0.g(r10)
            goto L_0x029f
        L_0x0119:
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            boolean r0 = r0.bM()
            r1 = 51
            r2 = 50
            if (r0 == 0) goto L_0x013c
            if (r22 == 0) goto L_0x029f
            if (r8 != 0) goto L_0x012d
            r1 = 50
        L_0x012d:
            com.ss.android.ugc.aweme.message.c.c r0 = com.ss.android.ugc.aweme.message.c.c.a()
            boolean r0 = r0.d(r1)
            if (r0 == 0) goto L_0x029f
            r9.c()
            goto L_0x029f
        L_0x013c:
            if (r8 != 0) goto L_0x0140
            r1 = 50
        L_0x0140:
            boolean r0 = r7.i
            if (r0 != 0) goto L_0x014e
            com.ss.android.ugc.aweme.message.c.c r0 = com.ss.android.ugc.aweme.message.c.c.a()
            boolean r0 = r0.d(r1)
            if (r0 == 0) goto L_0x029f
        L_0x014e:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r10] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f3654a
            r3 = 0
            r4 = 61570(0xf082, float:8.6278E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.newfollow.ui.FollowFeedFragment> r1 = com.ss.android.ugc.aweme.newfollow.ui.FollowFeedFragment.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0181
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r10] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f3654a
            r3 = 0
            r4 = 61570(0xf082, float:8.6278E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.newfollow.ui.FollowFeedFragment> r1 = com.ss.android.ugc.aweme.newfollow.ui.FollowFeedFragment.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x029f
        L_0x0181:
            if (r9 == 0) goto L_0x029f
            long r0 = r9.j
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x029f
            long r0 = java.lang.System.currentTimeMillis()
            long r4 = r9.j
            long r0 = r0 - r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x029f
            r2 = 300000(0x493e0, double:1.482197E-318)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x029c
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.Object[] r12 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r15 = 0
            r16 = 71845(0x118a5, float:1.00676E-40)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r13 = r0
            r17 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L_0x01d0
            java.lang.Object[] r12 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r15 = 0
            r16 = 71845(0x118a5, float:1.00676E-40)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r13 = r0
            r17 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x01ee
        L_0x01d0:
            java.lang.Boolean r1 = r0.k
            if (r1 == 0) goto L_0x01d5
            goto L_0x01e8
        L_0x01d5:
            com.ss.android.ugc.aweme.setting.model.AbTestModel r1 = r0.d()
            if (r1 != 0) goto L_0x01e0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.k = r1
            goto L_0x01e8
        L_0x01e0:
            boolean r1 = r1.followTabAutoRefreshOnTop
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.k = r1
        L_0x01e8:
            java.lang.Boolean r0 = r0.k
            boolean r0 = r0.booleanValue()
        L_0x01ee:
            if (r0 == 0) goto L_0x029f
            java.lang.Object[] r12 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.newfollow.ui.FollowFeedFragment.f3648a
            r15 = 0
            r16 = 61504(0xf040, float:8.6185E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r13 = r9
            r17 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r0 == 0) goto L_0x0221
            java.lang.Object[] r12 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.newfollow.ui.FollowFeedFragment.f3648a
            r15 = 0
            r16 = 61504(0xf040, float:8.6185E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r13 = r9
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r11 = r0
            goto L_0x029a
        L_0x0221:
            com.ss.android.ugc.aweme.newfollow.vh.n r0 = r9.f3649b
            if (r0 == 0) goto L_0x0299
            com.ss.android.ugc.aweme.newfollow.vh.n r0 = r9.f3649b
            java.lang.Object[] r12 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.newfollow.vh.n.f57731a
            r15 = 0
            r16 = 62265(0xf339, float:8.7252E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r13 = r0
            r17 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L_0x0256
            java.lang.Object[] r12 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.newfollow.vh.n.f57731a
            r15 = 0
            r16 = 62265(0xf339, float:8.7252E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r13 = r0
            r17 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0296
        L_0x0256:
            java.lang.Object[] r12 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.newfollow.vh.n.f57731a
            r15 = 0
            r16 = 62264(0xf338, float:8.725E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Integer.TYPE
            r13 = r0
            r17 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L_0x0285
            java.lang.Object[] r12 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.newfollow.vh.n.f57731a
            r15 = 0
            r16 = 62264(0xf338, float:8.725E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Integer.TYPE
            r13 = r0
            r17 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L_0x0291
        L_0x0285:
            com.ss.android.ugc.aweme.common.widget.NestedScrollingRecyclerView r1 = r0.mRecyclerView
            if (r1 == 0) goto L_0x0290
            com.ss.android.ugc.aweme.common.widget.NestedScrollingRecyclerView r0 = r0.mRecyclerView
            int r0 = r0.computeVerticalScrollOffset()
            goto L_0x0291
        L_0x0290:
            r0 = 0
        L_0x0291:
            if (r0 <= 0) goto L_0x0295
            r0 = 1
            goto L_0x0296
        L_0x0295:
            r0 = 0
        L_0x0296:
            if (r0 == 0) goto L_0x0299
            goto L_0x029a
        L_0x0299:
            r11 = 0
        L_0x029a:
            if (r11 != 0) goto L_0x029f
        L_0x029c:
            r9.c()
        L_0x029f:
            if (r22 == 0) goto L_0x02a4
            r19.a((int) r20, (boolean) r21)
        L_0x02a4:
            r7.i = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment.a(int, boolean, boolean):void");
    }
}

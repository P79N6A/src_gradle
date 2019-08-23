package com.ss.android.ugc.aweme.main;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.AccessibilityUtil;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.a.b;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.lib.a;
import com.ss.android.experiencekit.c.d;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ae.a;
import com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.SetTimeLockActivity;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.constants.Constants;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.commercialize.splash.AwesomeSplashEvent;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.adapter.AntiPreloadFgmPagerAdapter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.widget.FlippableViewPager;
import com.ss.android.ugc.aweme.common.widget.MainTabStrip;
import com.ss.android.ugc.aweme.discover.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.discover.model.SearchEnterParam;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.discover.ui.DiscoverActivity;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.f.an;
import com.ss.android.ugc.aweme.feed.f.ao;
import com.ss.android.ugc.aweme.feed.f.j;
import com.ss.android.ugc.aweme.feed.f.k;
import com.ss.android.ugc.aweme.feed.f.l;
import com.ss.android.ugc.aweme.feed.f.o;
import com.ss.android.ugc.aweme.feed.f.y;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.HotSearchGuideWord;
import com.ss.android.ugc.aweme.feed.model.NearbyCities;
import com.ss.android.ugc.aweme.feed.param.IFollowFeedFetchTrigger;
import com.ss.android.ugc.aweme.feed.ui.BaseCellFeedFragment;
import com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment;
import com.ss.android.ugc.aweme.feed.ui.CustomInterceptTouchEventFrameLayout;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.feed.ui.StaggeredNearByFragment;
import com.ss.android.ugc.aweme.feed.ui.ag;
import com.ss.android.ugc.aweme.follow.FollowFeedTriggerViewModel;
import com.ss.android.ugc.aweme.follow.LiveTagViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.ss.android.ugc.aweme.main.c.g;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.main.page.FeedEventTypeCallBack;
import com.ss.android.ugc.aweme.main.story.e;
import com.ss.android.ugc.aweme.main.story.f;
import com.ss.android.ugc.aweme.main.story.feed.StoryFeedPanel;
import com.ss.android.ugc.aweme.poi.model.as;
import com.ss.android.ugc.aweme.poi.nearby.b.m;
import com.ss.android.ugc.aweme.poi.nearby.b.n;
import com.ss.android.ugc.aweme.requestcombine.b;
import com.ss.android.ugc.aweme.requestcombine.model.SameCityCombineModel;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.publish.IPublishService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.shortvideo.widget.h;
import com.ss.android.ugc.aweme.story.live.c;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.util.FollowPageFirstFrameViewModel;
import com.ss.android.ugc.aweme.utils.ax;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.views.HotRightSearchGuideView;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

public class MainFragment extends AmeBaseFragment implements e, n, b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3515a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f3516b = "com.ss.android.ugc.aweme.main.MainFragment";
    private ax A = new ax() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54186a;

        public final void a(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f54186a, false, 57340, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f54186a, false, 57340, new Class[]{View.class}, Void.TYPE);
                return;
            }
            MainFragment mainFragment = MainFragment.this;
            if (PatchProxy.isSupport(new Object[0], mainFragment, MainFragment.f3515a, false, 57244, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], mainFragment, MainFragment.f3515a, false, 57244, new Class[0], Void.TYPE);
                return;
            }
            if (!mainFragment.c()) {
                if (PatchProxy.isSupport(new Object[]{(byte) 1, (byte) 1}, mainFragment, MainFragment.f3515a, false, 57248, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
                    MainFragment mainFragment2 = mainFragment;
                    PatchProxy.accessDispatch(new Object[]{(byte) 1, (byte) 1}, mainFragment2, MainFragment.f3515a, false, 57248, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
                } else if (!TimeLockRuler.isInTeenagerModeNewVersion()) {
                    bg.a(new k());
                    Bundle bundle = new Bundle();
                    com.ss.android.ugc.aweme.story.live.b.b("homepage_hot");
                    c.a().a(mainFragment.getActivity(), bundle);
                }
            }
        }
    };
    private Aweme B;
    private boolean C = true;
    private boolean D = true;
    private boolean E = false;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.poi.widget.c f3517c;

    /* renamed from: d  reason: collision with root package name */
    MainPagerAdapter f3518d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3519e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3520f;
    long g;
    long h;
    public int i = 1;
    public int j = 1;
    HotSearchGuideWord k;
    public boolean l;
    public h m;
    @BindView(2131493720)
    View mCommonTitleBar;
    @BindView(2131494305)
    ViewGroup mFlContainerStoryPanel;
    @BindView(2131494307)
    CustomInterceptTouchEventFrameLayout mFlContentContainer;
    @BindView(2131494315)
    LinearLayout mFlSerach;
    @BindView(2131495547)
    LinearLayout mFollowPillNotice;
    @BindView(2131498562)
    HotRightSearchGuideView mHotRightSearchGuideView;
    @BindView(2131494972)
    ImageView mIvBtnSearch;
    @BindView(2131494975)
    AnimationImageView mIvBtnStorySwitch;
    @BindView(2131496094)
    MainTabStrip mPagerTabStrip;
    @BindView(2131498110)
    DmtTextView mSearchText;
    @BindView(2131497328)
    View mStatusBarView;
    @BindView(2131497247)
    SwipeRefreshLayout mSwipeRefreshLayoutWhenStoryOpen;
    @BindView(2131497479)
    ViewStub mTeenagerModeTitleBarStub;
    @BindView(2131497605)
    View mTitleBarContainer;
    @BindView(2131497615)
    ImageView mTitleShadow;
    @BindView(2131497979)
    DmtTextView mTvLive;
    @BindView(2131498412)
    View mVTabBg;
    @BindView(2131495621)
    ViewGroup mVgRightContainer;
    @BindView(2131498537)
    FlippableViewPager mViewPager;
    boolean n = false;
    private ImageView o;
    private boolean p;
    private boolean q = true;
    private AnimatorSet r;
    private bm s;
    private com.bytedance.ies.dmt.ui.a.b t;
    private boolean u;
    private m v;
    private LiveTagViewModel w;
    private boolean x;
    private boolean y = true;
    private DataCenter z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface MainTabEnterMethod {
    }

    class MainPagerAdapter extends AntiPreloadFgmPagerAdapter {

        /* renamed from: d  reason: collision with root package name */
        public static ChangeQuickRedirect f54211d;

        /* renamed from: e  reason: collision with root package name */
        public final int[] f54212e;
        private final String[] g;
        private final String[] h;
        private final SparseArray<Fragment> i = new SparseArray<>();

        public int getCount() {
            return this.g.length;
        }

        /* access modifiers changed from: package-private */
        @Nullable
        public final Fragment a() {
            if (!PatchProxy.isSupport(new Object[0], this, f54211d, false, 57364, new Class[0], Fragment.class)) {
                return b(MainFragment.this.i);
            }
            return (Fragment) PatchProxy.accessDispatch(new Object[0], this, f54211d, false, 57364, new Class[0], Fragment.class);
        }

        public CharSequence getPageTitle(int i2) {
            return this.g[i2];
        }

        public final int c(int i2) {
            if (i2 < 0 || i2 >= this.f54212e.length) {
                return -1;
            }
            return this.f54212e[i2];
        }

        public int getItemPosition(@NonNull Object obj) {
            if (!PatchProxy.isSupport(new Object[]{obj}, this, f54211d, false, 57360, new Class[]{Object.class}, Integer.TYPE)) {
                return super.getItemPosition(obj);
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{obj}, this, f54211d, false, 57360, new Class[]{Object.class}, Integer.TYPE)).intValue();
        }

        public final Fragment a(int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f54211d, false, 57361, new Class[]{Integer.TYPE}, Fragment.class)) {
                return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f54211d, false, 57361, new Class[]{Integer.TYPE}, Fragment.class);
            }
            AwemeAppData.p().ak = this.h[i2];
            return ac.a(this.f54212e[i2], this.h[i2]);
        }

        /* access modifiers changed from: package-private */
        @Nullable
        public final Fragment b(int i2) {
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f54211d, false, 57365, new Class[]{Integer.TYPE}, Fragment.class)) {
                return this.i.get(i2);
            }
            return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f54211d, false, 57365, new Class[]{Integer.TYPE}, Fragment.class);
        }

        @NonNull
        public Object instantiateItem(ViewGroup viewGroup, int i2) {
            if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f54211d, false, 57362, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f54211d, false, 57362, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class);
            }
            Object instantiateItem = super.instantiateItem(viewGroup, i2);
            this.i.put(i2, (Fragment) instantiateItem);
            return instantiateItem;
        }

        public void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
            Object obj2 = obj;
            if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i2), obj2}, this, f54211d, false, 57363, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i2), obj2}, this, f54211d, false, 57363, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
                return;
            }
            super.destroyItem(viewGroup, i2, obj);
            if (obj2 instanceof Fragment) {
                try {
                    Fragment fragment = (Fragment) obj2;
                    if (this.f40168c != null) {
                        this.f40168c.remove(fragment);
                    }
                    int i3 = i2;
                    this.i.remove(i2);
                } catch (Exception unused) {
                }
            }
        }

        MainPagerAdapter(FragmentManager fragmentManager, int i2) {
            super(fragmentManager);
            if (i2 == 1) {
                this.g = MainFragment.this.getResources().getStringArray(C0906R.array.a2);
                this.f54212e = new int[]{1, 0};
                this.h = new String[]{"homepage_follow", "homepage_hot"};
            } else if (i2 == 3) {
                this.g = MainFragment.this.getResources().getStringArray(C0906R.array.a4);
                this.f54212e = new int[]{7, 0};
                this.h = new String[]{"nearby", "homepage_hot"};
            } else {
                this.g = MainFragment.this.getResources().getStringArray(C0906R.array.a5);
                this.f54212e = new int[]{1, 0, 7};
                this.h = new String[]{"homepage_follow", "homepage_hot", "nearby"};
            }
        }
    }

    @Keep
    static class StoryPanelScrollHelper {
        public static ChangeQuickRedirect changeQuickRedirect;
        private WeakReference<MainFragment> mHostHolder;
        private int mStoryPanelHeight;

        public int getScrollY() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 57367, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 57367, new Class[0], Integer.TYPE)).intValue();
            }
            MainFragment mainFragment = (MainFragment) this.mHostHolder.get();
            if (mainFragment == null || mainFragment.mFlContentContainer == null) {
                return -1;
            }
            return mainFragment.mFlContentContainer.getScrollY();
        }

        public void setStoryPanelHeight(int i) {
            this.mStoryPanelHeight = i;
        }

        StoryPanelScrollHelper(MainFragment mainFragment) {
            this.mHostHolder = new WeakReference<>(mainFragment);
        }

        @RequiresApi(api = 14)
        public void setScrollY(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 57366, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 57366, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            MainFragment mainFragment = (MainFragment) this.mHostHolder.get();
            if (mainFragment != null && mainFragment.mStatusBarView != null) {
                mainFragment.mFlContentContainer.setScrollY((int) (((((float) i) * 1.0f) / ((float) this.mStoryPanelHeight)) * ((float) (this.mStoryPanelHeight - mainFragment.mStatusBarView.getHeight()))));
                mainFragment.mFlContainerStoryPanel.setScrollY(this.mStoryPanelHeight + i);
            }
        }
    }

    static String f() {
        return "homepage_fresh";
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    @Subscribe
    public void onEnterHotSearchPageEvent(o oVar) {
    }

    @Subscribe
    public void onMainSwipeRefreshABChangedEvent(com.ss.android.ugc.aweme.main.c.c cVar) {
    }

    public final void a(boolean z2, int i2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i2)}, this, f3515a, false, 57241, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Integer.valueOf(i2)}, this, f3515a, false, 57241, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            if ((!z2 || this.mFollowPillNotice.getVisibility() != 0) && !((!z2 && this.mFollowPillNotice.getVisibility() == 8) || this.mFollowPillNotice == null || this.f3520f == z2)) {
                this.f3520f = z2;
                float f2 = 0.0f;
                if (z2) {
                    if (this.mFollowPillNotice != null) {
                        this.mFollowPillNotice.setAlpha(0.0f);
                        this.mFollowPillNotice.setScaleX(0.0f);
                        this.mFollowPillNotice.setScaleY(0.0f);
                    }
                    v.b((View) this.mFollowPillNotice, 0);
                } else {
                    this.mFollowPillNotice.postDelayed(new aa(this), (long) i2);
                }
                if (z2) {
                    f2 = 1.0f;
                }
                this.mFollowPillNotice.animate().scaleX(f2).scaleY(f2).alpha(f2).setDuration((long) i2).start();
            }
        }
    }

    public final boolean a(@IFollowFeedFetchTrigger.IRefreshType int i2, String str) {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str}, this, f3515a, false, 57290, new Class[]{Integer.TYPE, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str}, this, f3515a, false, 57290, new Class[]{Integer.TYPE, String.class}, Boolean.TYPE)).booleanValue();
        }
        if (!(this.f3518d == null || this.mViewPager == null)) {
            FeedFragment feedFragment = (FeedFragment) this.f3518d.a();
            if (feedFragment != null) {
                if (!TextUtils.isEmpty(str)) {
                    switch (this.mViewPager.getCurrentItem()) {
                        case 0:
                            a.a(getContext(), str, "homepage_follow");
                            break;
                        case 1:
                            a.a(getContext(), str, "homepage_hot");
                            break;
                        case 2:
                            a.a(getContext(), str, f());
                            break;
                    }
                }
                FollowFeedTriggerViewModel.a(getActivity()).a(Integer.valueOf(i2));
                if (i2 == 1 || i2 == 2) {
                    z2 = true;
                }
                return feedFragment.d(z2);
            }
        }
        return false;
    }

    public final void a(@NotNull Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f3515a, false, 57323, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f3515a, false, 57323, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        q();
    }

    public final boolean c() {
        if (this.mHotRightSearchGuideView == null || !this.mHotRightSearchGuideView.f76341c) {
            return false;
        }
        return true;
    }

    public final FeedFragment a() {
        if (PatchProxy.isSupport(new Object[0], this, f3515a, false, 57243, new Class[0], FeedFragment.class)) {
            return (FeedFragment) PatchProxy.accessDispatch(new Object[0], this, f3515a, false, 57243, new Class[0], FeedFragment.class);
        } else if (this.f3518d == null) {
            return null;
        } else {
            return (FeedFragment) this.f3518d.a();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f3515a, false, 57257, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3515a, false, 57257, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f3518d != null && (this.f3518d.a() instanceof FeedFollowFragment)) {
            z2 = true;
        }
        return z2;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f3515a, false, 57270, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3515a, false, 57270, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mPagerTabStrip != null && this.mPagerTabStrip.a()) {
            z2 = true;
        }
        return z2;
    }

    public final void g() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f3515a, false, 57276, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3515a, false, 57276, new Class[0], Void.TYPE);
        } else if (this.mViewPager != null) {
            if (MainPageExperimentHelper.k() && !TimeLockRuler.isInTeenagerModeNewVersion()) {
                z2 = true;
            }
            this.mViewPager.f40388b = z2;
        }
    }

    public final boolean h() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f3515a, false, 57279, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3515a, false, 57279, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mPagerTabStrip != null && this.mPagerTabStrip.c()) {
            z2 = true;
        }
        return z2;
    }

    public final boolean i() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f3515a, false, 57280, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3515a, false, 57280, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mPagerTabStrip != null && this.mPagerTabStrip.d()) {
            z2 = true;
        }
        return z2;
    }

    public final boolean j() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f3515a, false, 57281, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3515a, false, 57281, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mPagerTabStrip != null && this.mPagerTabStrip.e()) {
            z2 = true;
        }
        return z2;
    }

    public final boolean l() {
        if (PatchProxy.isSupport(new Object[0], this, f3515a, false, 57317, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3515a, false, 57317, new Class[0], Boolean.TYPE)).booleanValue();
        }
        FlippableViewPager flippableViewPager = this.mViewPager;
        if (flippableViewPager == null || flippableViewPager.getCurrentItem() != 1) {
            return false;
        }
        return true;
    }

    public final boolean m() {
        if (PatchProxy.isSupport(new Object[0], this, f3515a, false, 57318, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3515a, false, 57318, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f3518d == null || this.f3518d.c(this.i) != 1) {
            return false;
        } else {
            return true;
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3515a, false, 57289, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3515a, false, 57289, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        bg.d(this);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f3515a, false, 57287, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3515a, false, 57287, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        b();
    }

    private void q() {
        if (PatchProxy.isSupport(new Object[0], this, f3515a, false, 57277, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3515a, false, 57277, new Class[0], Void.TYPE);
            return;
        }
        if (this.v == null) {
            this.v = new m();
            this.v.a(this);
            this.v.a(new as());
            com.ss.android.ugc.aweme.lego.a.i.d().a(new com.ss.android.ugc.aweme.legoImp.a.a.b(this.v)).a();
        }
    }

    public final bm n() {
        if (PatchProxy.isSupport(new Object[0], this, f3515a, false, 57321, new Class[0], bm.class)) {
            return (bm) PatchProxy.accessDispatch(new Object[0], this, f3515a, false, 57321, new Class[0], bm.class);
        }
        if (this.s == null) {
            this.s = (bm) com.ss.android.ugc.aweme.base.sharedpref.c.a(i.a().getContext(), bm.class);
        }
        return this.s;
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, f3515a, false, 57322, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3515a, false, 57322, new Class[0], Void.TYPE);
            return;
        }
        SameCityCombineModel sameCityCombineModel = (SameCityCombineModel) com.ss.android.ugc.aweme.requestcombine.a.f63567e.a("/aweme/v1/poi/samecity/active/");
        if (sameCityCombineModel != null) {
            a(sameCityCombineModel.getSameCityModel());
        } else {
            a(new Throwable());
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f3515a, false, 57288, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3515a, false, 57288, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.f3517c != null) {
            this.f3517c.d();
        }
        com.ss.android.ugc.aweme.requestcombine.a aVar = com.ss.android.ugc.aweme.requestcombine.a.f63567e;
        if (PatchProxy.isSupport(new Object[]{this}, aVar, com.ss.android.ugc.aweme.requestcombine.a.f63563a, false, 70715, new Class[]{b.class}, Void.TYPE)) {
            com.ss.android.ugc.aweme.requestcombine.a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{this}, aVar2, com.ss.android.ugc.aweme.requestcombine.a.f63563a, false, 70715, new Class[]{b.class}, Void.TYPE);
            return;
        }
        ArrayList<b> arrayList = com.ss.android.ugc.aweme.requestcombine.a.f63565c;
        if (arrayList != null) {
            arrayList.remove(this);
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3515a, false, 57275, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3515a, false, 57275, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (!com.ss.android.ugc.aweme.requestcombine.a.f63567e.a()) {
            q();
        }
        if (this.C) {
            this.C = false;
            bl.a(d.END, "tab", getTag());
        }
        if (this.mIvBtnStorySwitch != null && this.mIvBtnStorySwitch.getVisibility() == 0 && this.y) {
            com.ss.android.ugc.aweme.story.live.b.c("homepage_hot");
        }
        if (this.E) {
            a.a().a(true);
        }
        g();
        p();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a7, code lost:
        if (r0 != false) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void p() {
        /*
            r16 = this;
            r7 = r16
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3515a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 57235(0xdf93, float:8.0203E-41)
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0029
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3515a
            r3 = 0
            r4 = 57235(0xdf93, float:8.0203E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0029:
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r10 = 0
            com.meituan.robust.ChangeQuickRedirect r11 = f3515a
            r12 = 1
            r13 = 57234(0xdf92, float:8.0202E-41)
            java.lang.Class[] r14 = new java.lang.Class[r8]
            java.lang.Class r15 = java.lang.Boolean.TYPE
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            r1 = 1
            if (r0 == 0) goto L_0x0055
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r10 = 0
            com.meituan.robust.ChangeQuickRedirect r11 = f3515a
            r12 = 1
            r13 = 57234(0xdf92, float:8.0202E-41)
            java.lang.Class[] r14 = new java.lang.Class[r8]
            java.lang.Class r15 = java.lang.Boolean.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x00ac
        L_0x0055:
            boolean r0 = com.ss.android.g.a.a()
            if (r0 != 0) goto L_0x00ab
            boolean r0 = com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isInTeenagerModeNewVersion()
            if (r0 != 0) goto L_0x00ab
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.ss.android.ugc.aweme.account.d.a()
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L_0x00a9
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.Object[] r9 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r12 = 0
            r13 = 71753(0x11849, float:1.00547E-40)
            java.lang.Class[] r14 = new java.lang.Class[r8]
            java.lang.Class r15 = java.lang.Boolean.TYPE
            r10 = r0
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            if (r2 == 0) goto L_0x009a
            java.lang.Object[] r9 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r12 = 0
            r13 = 71753(0x11849, float:1.00547E-40)
            java.lang.Class[] r14 = new java.lang.Class[r8]
            java.lang.Class r15 = java.lang.Boolean.TYPE
            r10 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x00a7
        L_0x009a:
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = r0.d()
            if (r0 == 0) goto L_0x00a6
            boolean r0 = r0.showLiveNotLogin
            if (r0 == 0) goto L_0x00a6
            r0 = 1
            goto L_0x00a7
        L_0x00a6:
            r0 = 0
        L_0x00a7:
            if (r0 == 0) goto L_0x00ab
        L_0x00a9:
            r0 = 1
            goto L_0x00ac
        L_0x00ab:
            r0 = 0
        L_0x00ac:
            if (r0 == 0) goto L_0x00b0
            r0 = 0
            goto L_0x00b2
        L_0x00b0:
            r0 = 8
        L_0x00b2:
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r2 = r7.mIvBtnStorySwitch
            r2.setVisibility(r0)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r10 = 0
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.main.g.a.f54773a
            r12 = 1
            r13 = 58167(0xe337, float:8.151E-41)
            java.lang.Class[] r14 = new java.lang.Class[r8]
            java.lang.Class r15 = java.lang.Boolean.TYPE
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            if (r2 == 0) goto L_0x00e2
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r10 = 0
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.main.g.a.f54773a
            r12 = 1
            r13 = 58167(0xe337, float:8.151E-41)
            java.lang.Class[] r14 = new java.lang.Class[r8]
            java.lang.Class r15 = java.lang.Boolean.TYPE
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r8 = r1.booleanValue()
            goto L_0x00ef
        L_0x00e2:
            boolean r2 = com.ss.android.ugc.aweme.main.g.a.b()
            if (r2 == 0) goto L_0x00ef
            boolean r2 = com.ss.android.ugc.aweme.main.g.a.a()
            if (r2 == 0) goto L_0x00ef
            r8 = 1
        L_0x00ef:
            if (r8 == 0) goto L_0x00f6
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.mTvLive
            r1.setVisibility(r0)
        L_0x00f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.MainFragment.p():void");
    }

    private void r() {
        int i2;
        int i3;
        int i4;
        if (PatchProxy.isSupport(new Object[0], this, f3515a, false, 57320, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3515a, false, 57320, new Class[0], Void.TYPE);
            return;
        }
        View view = getView();
        if (view != null) {
            if (TimeLockRuler.isInTeenagerModeNewVersion()) {
                i2 = C0906R.id.cgn;
            } else {
                i2 = C0906R.id.cfe;
            }
            View findViewById = view.findViewById(i2);
            if (TimeLockRuler.isInTeenagerModeNewVersion()) {
                i3 = C0906R.id.b5z;
            } else {
                i3 = C0906R.id.aze;
            }
            ImageView imageView = (ImageView) view.findViewById(i3);
            imageView.setFocusable(false);
            imageView.setFocusableInTouchMode(false);
            if (TimeLockRuler.isInTeenagerModeNewVersion()) {
                i4 = C0906R.id.dkc;
            } else {
                i4 = C0906R.id.d9q;
            }
            TextView textView = (TextView) view.findViewById(i4);
            textView.setFocusable(false);
            textView.setFocusableInTouchMode(false);
            textView.setImportantForAccessibility(2);
            AccessibilityUtil.setAccessibilityDelegate(findViewById, new MainFragment$$Lambda$13(this));
            AccessibilityUtil.setAccessibilityDelegate(this.mIvBtnSearch, new MainFragment$$Lambda$14(this));
            AccessibilityUtil.setAccessibilityDelegate(this.mIvBtnStorySwitch, MainFragment$$Lambda$15.f54185b);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3515a, false, 57250, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3515a, false, 57250, new Class[0], Void.TYPE);
            return;
        }
        if (this.t != null && this.t.isShowing()) {
            this.t.f();
            this.t = null;
        }
        n().g(false);
    }

    @OnClick({2131494315})
    public void onSearchClick() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f3515a, false, 57245, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3515a, false, 57245, new Class[0], Void.TYPE);
        } else if (!c()) {
            ((bm) com.ss.android.ugc.aweme.base.sharedpref.c.a(getContext(), bm.class)).o(true);
            if (com.ss.android.ugc.aweme.discover.helper.b.i()) {
                SearchResultParam searchResultParam = new SearchResultParam();
                searchResultParam.setSearchFrom(17);
                Bundle bundle = ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(), this.mIvBtnSearch, getResources().getString(C0906R.string.c24)).toBundle();
                Aweme a2 = AwemeChangeCallBack.a(getActivity());
                if (a2 != null) {
                    str = a2.getAid();
                } else {
                    str = "";
                }
                SearchResultActivity.a(getContext(), searchResultParam, SearchEnterParam.newBuilder().enterSearchFrom("homepage_hot").groupId(str).build(), bundle);
                r.a("enter_search", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "homepage_hot").a("group_id", str).f34114b);
            } else {
                final ImageView imageView = this.mIvBtnSearch;
                if (PatchProxy.isSupport(new Object[]{imageView}, this, f3515a, false, 57246, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{imageView}, this, f3515a, false, 57246, new Class[]{View.class}, Void.TYPE);
                } else if (imageView != null) {
                    imageView.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80).withEndAction(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f54206a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f54206a, false, 57355, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f54206a, false, 57355, new Class[0], Void.TYPE);
                                return;
                            }
                            imageView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80).start();
                        }
                    }).start();
                }
                DiscoverActivity.a(getActivity());
                com.ss.android.ugc.aweme.discover.mob.b.a((String) FeedEventTypeCallBack.a(getActivity()).getValue(), "click_discovery_button");
            }
            r.a(com.ss.android.ugc.aweme.base.utils.d.a(), "click", "discovery", PushConstants.PUSH_TYPE_NOTIFY, PushConstants.PUSH_TYPE_NOTIFY, (JSONObject) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0133, code lost:
        if (com.ss.android.ugc.aweme.discover.b.b.f42109b.a() < ((java.lang.Integer) com.ss.android.ugc.aweme.app.SharePrefCache.inst().getNormalGuideDisplayTimes().c()).intValue()) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0137, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x016f, code lost:
        if (com.ss.android.ugc.aweme.discover.b.b.f42109b.c() < ((java.lang.Integer) com.ss.android.ugc.aweme.app.SharePrefCache.inst().getOperationGuideDisplayTimes().c()).intValue()) goto L_0x0135;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k() {
        /*
            r20 = this;
            r7 = r20
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3515a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 57309(0xdfdd, float:8.0307E-41)
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0029
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3515a
            r3 = 0
            r4 = 57309(0xdfdd, float:8.0307E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0029:
            com.ss.android.ugc.aweme.feed.model.HotSearchGuideWord r0 = r7.k
            if (r0 != 0) goto L_0x002e
            return
        L_0x002e:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.B
            if (r0 == 0) goto L_0x0443
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.B
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.c.t(r0)
            if (r0 == 0) goto L_0x003c
            goto L_0x0443
        L_0x003c:
            com.ss.android.ugc.aweme.feed.model.HotSearchGuideWord r0 = r7.k
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r10[r8] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.discover.b.b.f42108a
            r13 = 1
            r14 = 36282(0x8dba, float:5.0842E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.HotSearchGuideWord> r1 = com.ss.android.ugc.aweme.feed.model.HotSearchGuideWord.class
            r15[r8] = r1
            java.lang.Class r16 = java.lang.Boolean.TYPE
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x0077
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r10[r8] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.discover.b.b.f42108a
            r13 = 1
            r14 = 36282(0x8dba, float:5.0842E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.HotSearchGuideWord> r0 = com.ss.android.ugc.aweme.feed.model.HotSearchGuideWord.class
            r15[r8] = r0
            java.lang.Class r16 = java.lang.Boolean.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x01db
        L_0x0077:
            if (r0 == 0) goto L_0x01da
            java.lang.String r1 = r0.displayWord
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0083
            goto L_0x01da
        L_0x0083:
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.discover.b.b.f42108a
            r13 = 1
            r14 = 36277(0x8db5, float:5.0835E-41)
            java.lang.Class[] r15 = new java.lang.Class[r8]
            java.lang.Class r16 = java.lang.Boolean.TYPE
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            r2 = 0
            if (r1 == 0) goto L_0x00b0
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.discover.b.b.f42108a
            r13 = 1
            r14 = 36277(0x8db5, float:5.0835E-41)
            java.lang.Class[] r15 = new java.lang.Class[r8]
            java.lang.Class r16 = java.lang.Boolean.TYPE
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L_0x00dc
        L_0x00b0:
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
            boolean r1 = r1.isLogin()
            if (r1 == 0) goto L_0x00db
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getCurUser()
            long r4 = r1.getRegisterTime()
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x00db
            long r10 = java.lang.System.currentTimeMillis()
            r12 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 / r12
            long r10 = r10 - r4
            r4 = 604800(0x93a80, double:2.98811E-318)
            int r1 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x00db
            r1 = 1
            goto L_0x00dc
        L_0x00db:
            r1 = 0
        L_0x00dc:
            if (r1 == 0) goto L_0x01da
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r10[r8] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.discover.b.b.f42108a
            r13 = 1
            r14 = 36278(0x8db6, float:5.0836E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.HotSearchGuideWord> r1 = com.ss.android.ugc.aweme.feed.model.HotSearchGuideWord.class
            r15[r8] = r1
            java.lang.Class r16 = java.lang.Boolean.TYPE
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x0115
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r10[r8] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.discover.b.b.f42108a
            r13 = 1
            r14 = 36278(0x8db6, float:5.0836E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.HotSearchGuideWord> r1 = com.ss.android.ugc.aweme.feed.model.HotSearchGuideWord.class
            r15[r8] = r1
            java.lang.Class r16 = java.lang.Boolean.TYPE
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L_0x0172
        L_0x0115:
            boolean r1 = r0.isNormalWord()
            if (r1 == 0) goto L_0x0139
            com.ss.android.ugc.aweme.discover.b.a r1 = com.ss.android.ugc.aweme.discover.b.b.f42109b
            int r1 = r1.a()
            com.ss.android.ugc.aweme.app.SharePrefCache r2 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r2 = r2.getNormalGuideDisplayTimes()
            java.lang.Object r2 = r2.c()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r1 >= r2) goto L_0x0137
        L_0x0135:
            r1 = 1
            goto L_0x0172
        L_0x0137:
            r1 = 0
            goto L_0x0172
        L_0x0139:
            java.lang.String r1 = r0.displayWord
            com.ss.android.ugc.aweme.discover.b.a r4 = com.ss.android.ugc.aweme.discover.b.b.f42109b
            java.lang.String r4 = r4.d()
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L_0x0157
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0157
            com.ss.android.ugc.aweme.discover.b.a r1 = com.ss.android.ugc.aweme.discover.b.b.f42109b
            r1.b((int) r8)
            com.ss.android.ugc.aweme.discover.b.a r1 = com.ss.android.ugc.aweme.discover.b.b.f42109b
            r1.b((long) r2)
        L_0x0157:
            com.ss.android.ugc.aweme.discover.b.a r1 = com.ss.android.ugc.aweme.discover.b.b.f42109b
            int r1 = r1.c()
            com.ss.android.ugc.aweme.app.SharePrefCache r2 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r2 = r2.getOperationGuideDisplayTimes()
            java.lang.Object r2 = r2.c()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r1 >= r2) goto L_0x0137
            goto L_0x0135
        L_0x0172:
            if (r1 == 0) goto L_0x01da
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r10[r8] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.discover.b.b.f42108a
            r13 = 1
            r14 = 36279(0x8db7, float:5.0838E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.HotSearchGuideWord> r1 = com.ss.android.ugc.aweme.feed.model.HotSearchGuideWord.class
            r15[r8] = r1
            java.lang.Class r16 = java.lang.Boolean.TYPE
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x01ab
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r10[r8] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.discover.b.b.f42108a
            r13 = 1
            r14 = 36279(0x8db7, float:5.0838E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.HotSearchGuideWord> r0 = com.ss.android.ugc.aweme.feed.model.HotSearchGuideWord.class
            r15[r8] = r0
            java.lang.Class r16 = java.lang.Boolean.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x01d6
        L_0x01ab:
            boolean r0 = r0.isNormalWord()
            if (r0 == 0) goto L_0x01d5
            long r0 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.discover.b.a r2 = com.ss.android.ugc.aweme.discover.b.b.f42109b
            long r2 = r2.b()
            long r0 = r0 - r2
            com.ss.android.ugc.aweme.app.SharePrefCache r2 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r2 = r2.getNormalGuideDisplayTimeIntervals()
            java.lang.Object r2 = r2.c()
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x01d3
            goto L_0x01d5
        L_0x01d3:
            r0 = 0
            goto L_0x01d6
        L_0x01d5:
            r0 = 1
        L_0x01d6:
            if (r0 == 0) goto L_0x01da
            r0 = 1
            goto L_0x01db
        L_0x01da:
            r0 = 0
        L_0x01db:
            if (r0 == 0) goto L_0x043f
            com.ss.android.ugc.aweme.feed.model.HotSearchGuideWord r10 = r7.k
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f3515a
            r3 = 0
            r4 = 57310(0xdfde, float:8.0308E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.HotSearchGuideWord> r1 = com.ss.android.ugc.aweme.feed.model.HotSearchGuideWord.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0212
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f3515a
            r3 = 0
            r4 = 57310(0xdfde, float:8.0308E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.HotSearchGuideWord> r1 = com.ss.android.ugc.aweme.feed.model.HotSearchGuideWord.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x043f
        L_0x0212:
            if (r10 == 0) goto L_0x043f
            boolean r0 = r20.isViewValid()
            if (r0 == 0) goto L_0x043f
            com.ss.android.ugc.aweme.views.HotRightSearchGuideView r0 = r7.mHotRightSearchGuideView
            boolean r0 = r0.f76341c
            if (r0 != 0) goto L_0x043f
            com.ss.android.ugc.aweme.views.HotRightSearchGuideView r0 = r7.mHotRightSearchGuideView
            android.widget.LinearLayout r1 = r7.mFlSerach
            com.ss.android.ugc.aweme.common.widget.MainTabStrip r2 = r7.mPagerTabStrip
            android.view.ViewGroup r3 = r7.mVgRightContainer
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r4 = r7.mIvBtnStorySwitch
            r5 = 5
            java.lang.Object[] r11 = new java.lang.Object[r5]
            r11[r8] = r1
            r11[r9] = r2
            r6 = 2
            r11[r6] = r3
            r18 = 3
            r11[r18] = r4
            java.lang.Byte r12 = java.lang.Byte.valueOf(r8)
            r19 = 4
            r11[r19] = r12
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.views.HotRightSearchGuideView.f76339a
            r14 = 0
            r15 = 89512(0x15da8, float:1.25433E-40)
            java.lang.Class[] r12 = new java.lang.Class[r5]
            java.lang.Class<android.view.View> r16 = android.view.View.class
            r12[r8] = r16
            java.lang.Class<android.view.View> r16 = android.view.View.class
            r12[r9] = r16
            java.lang.Class<android.view.View> r16 = android.view.View.class
            r12[r6] = r16
            java.lang.Class<android.view.View> r16 = android.view.View.class
            r12[r18] = r16
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r12[r19] = r16
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r12
            r12 = r0
            boolean r11 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r11 == 0) goto L_0x029c
            java.lang.Object[] r11 = new java.lang.Object[r5]
            r11[r8] = r1
            r11[r9] = r2
            r11[r6] = r3
            r11[r18] = r4
            java.lang.Byte r1 = java.lang.Byte.valueOf(r8)
            r11[r19] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.views.HotRightSearchGuideView.f76339a
            r14 = 0
            r15 = 89512(0x15da8, float:1.25433E-40)
            java.lang.Class[] r1 = new java.lang.Class[r5]
            java.lang.Class<android.view.View> r2 = android.view.View.class
            r1[r8] = r2
            java.lang.Class<android.view.View> r2 = android.view.View.class
            r1[r9] = r2
            java.lang.Class<android.view.View> r2 = android.view.View.class
            r1[r6] = r2
            java.lang.Class<android.view.View> r2 = android.view.View.class
            r1[r18] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r1[r19] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x02ca
        L_0x029c:
            r0.f76343e = r1
            r0.m = r4
            r0.f76344f = r2
            int r1 = r3.getMeasuredWidth()
            r0.f76342d = r1
            int r1 = r0.f76342d
            if (r1 > 0) goto L_0x02ba
            android.content.Context r1 = r0.getContext()
            r2 = 1101004800(0x41a00000, float:20.0)
            float r1 = com.bytedance.common.utility.UIUtils.dip2Px(r1, r2)
            int r1 = (int) r1
            r0.f76342d = r1
            goto L_0x02ca
        L_0x02ba:
            int r1 = r0.f76342d
            android.content.Context r2 = r0.getContext()
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = com.bytedance.common.utility.UIUtils.dip2Px(r2, r3)
            int r2 = (int) r2
            int r1 = r1 + r2
            r0.f76342d = r1
        L_0x02ca:
            com.ss.android.ugc.aweme.views.HotRightSearchGuideView r0 = r7.mHotRightSearchGuideView
            java.lang.String r1 = r10.displayWord
            r0.setHotSearchKey(r1)
            com.ss.android.ugc.aweme.views.HotRightSearchGuideView r0 = r7.mHotRightSearchGuideView
            com.ss.android.ugc.aweme.main.MainFragment$4 r1 = new com.ss.android.ugc.aweme.main.MainFragment$4
            r1.<init>(r10)
            r0.setOnClickGuideLisenter(r1)
            com.ss.android.ugc.aweme.views.HotRightSearchGuideView r0 = r7.mHotRightSearchGuideView
            java.lang.Object[] r11 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.views.HotRightSearchGuideView.f76339a
            r14 = 0
            r15 = 89513(0x15da9, float:1.25434E-40)
            java.lang.Class[] r1 = new java.lang.Class[r8]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x0305
            java.lang.Object[] r11 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.views.HotRightSearchGuideView.f76339a
            r14 = 0
            r15 = 89513(0x15da9, float:1.25434E-40)
            java.lang.Class[] r1 = new java.lang.Class[r8]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x030e
        L_0x0305:
            boolean r1 = r0.f76341c
            if (r1 != 0) goto L_0x030e
            r0.f76341c = r9
            r0.a(r9)
        L_0x030e:
            com.ss.android.ugc.aweme.main.bj.f54592c = r9
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r8] = r10
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.discover.b.b.f42108a
            r14 = 1
            r15 = 36283(0x8dbb, float:5.0843E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.HotSearchGuideWord> r1 = com.ss.android.ugc.aweme.feed.model.HotSearchGuideWord.class
            r0[r8] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x0345
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r8] = r10
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.discover.b.b.f42108a
            r14 = 1
            r15 = 36283(0x8dbb, float:5.0843E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.HotSearchGuideWord> r1 = com.ss.android.ugc.aweme.feed.model.HotSearchGuideWord.class
            r0[r8] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0422
        L_0x0345:
            boolean r0 = r10.isNormalWord()
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r0)
            r11[r8] = r1
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.discover.b.b.f42108a
            r14 = 1
            r15 = 36280(0x8db8, float:5.0839E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r1[r8] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x0385
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r0)
            r11[r8] = r1
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.discover.b.b.f42108a
            r14 = 1
            r15 = 36280(0x8db8, float:5.0839E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r1[r8] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x03c8
        L_0x0385:
            if (r0 == 0) goto L_0x03a8
            com.ss.android.ugc.aweme.discover.b.a r1 = com.ss.android.ugc.aweme.discover.b.b.f42109b
            int r1 = r1.a()
            com.ss.android.ugc.aweme.app.SharePrefCache r2 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r2 = r2.getNormalGuideDisplayTimes()
            java.lang.Object r2 = r2.c()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r1 >= r2) goto L_0x03c8
            com.ss.android.ugc.aweme.discover.b.a r2 = com.ss.android.ugc.aweme.discover.b.b.f42109b
            int r1 = r1 + r9
            r2.a((int) r1)
            goto L_0x03c8
        L_0x03a8:
            com.ss.android.ugc.aweme.discover.b.a r1 = com.ss.android.ugc.aweme.discover.b.b.f42109b
            int r1 = r1.c()
            com.ss.android.ugc.aweme.app.SharePrefCache r2 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r2 = r2.getOperationGuideDisplayTimes()
            java.lang.Object r2 = r2.c()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r1 >= r2) goto L_0x03c8
            com.ss.android.ugc.aweme.discover.b.a r2 = com.ss.android.ugc.aweme.discover.b.b.f42109b
            int r1 = r1 + r9
            r2.b((int) r1)
        L_0x03c8:
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r0)
            r11[r8] = r1
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.discover.b.b.f42108a
            r14 = 1
            r15 = 36281(0x8db9, float:5.084E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r1[r8] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x0404
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r0)
            r11[r8] = r1
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.discover.b.b.f42108a
            r14 = 1
            r15 = 36281(0x8db9, float:5.084E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r1[r8] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0419
        L_0x0404:
            if (r0 == 0) goto L_0x0410
            com.ss.android.ugc.aweme.discover.b.a r1 = com.ss.android.ugc.aweme.discover.b.b.f42109b
            long r2 = java.lang.System.currentTimeMillis()
            r1.a((long) r2)
            goto L_0x0419
        L_0x0410:
            com.ss.android.ugc.aweme.discover.b.a r1 = com.ss.android.ugc.aweme.discover.b.b.f42109b
            long r2 = java.lang.System.currentTimeMillis()
            r1.b((long) r2)
        L_0x0419:
            if (r0 != 0) goto L_0x0422
            com.ss.android.ugc.aweme.discover.b.a r0 = com.ss.android.ugc.aweme.discover.b.b.f42109b
            java.lang.String r1 = r10.displayWord
            r0.a((java.lang.String) r1)
        L_0x0422:
            java.lang.String r0 = "hot_search_guide"
            com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r2 = "action_type"
            java.lang.String r3 = "show"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "search_keyword"
            java.lang.String r3 = r10.getSearchWord()
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
        L_0x043f:
            r0 = 0
            r7.k = r0
            return
        L_0x0443:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.MainFragment.k():void");
    }

    public final void b_(boolean z2) {
        this.y = z2;
    }

    @Subscribe
    public void onCommerceDialogEvent(an anVar) {
        this.E = anVar.f45289a;
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3515a, false, 57231, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3515a, false, 57231, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        bg.c(this);
    }

    @Subscribe
    public void onFeedsPageChangedEvent(com.ss.android.ugc.aweme.feed.f.r rVar) {
        if (PatchProxy.isSupport(new Object[]{rVar}, this, f3515a, false, 57316, new Class[]{com.ss.android.ugc.aweme.feed.f.r.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rVar}, this, f3515a, false, 57316, new Class[]{com.ss.android.ugc.aweme.feed.f.r.class}, Void.TYPE);
            return;
        }
        if (this.mPagerTabStrip != null) {
            this.mPagerTabStrip.f();
        }
    }

    @Subscribe
    public void onHideUploadRecoverEvent(com.ss.android.ugc.aweme.shortvideo.f.d dVar) {
        com.ss.android.ugc.aweme.shortvideo.f.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f3515a, false, 57283, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f3515a, false, 57283, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.d.class}, Void.TYPE);
            return;
        }
        g(dVar2.f67639a);
    }

    @Subscribe
    public void onShowHotSearchGuideEvent(ao aoVar) {
        if (PatchProxy.isSupport(new Object[]{aoVar}, this, f3515a, false, 57311, new Class[]{ao.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aoVar}, this, f3515a, false, 57311, new Class[]{ao.class}, Void.TYPE);
            return;
        }
        this.mViewPager.postDelayed(new z(this, aoVar), 2000);
    }

    @Subscribe
    public void onSwipeRefreshInMainFragmentEvent(g gVar) {
        if (PatchProxy.isSupport(new Object[]{gVar}, this, f3515a, false, 57299, new Class[]{g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar}, this, f3515a, false, 57299, new Class[]{g.class}, Void.TYPE);
            return;
        }
        if (this.mSwipeRefreshLayoutWhenStoryOpen != null) {
            gVar.accept(this.mSwipeRefreshLayoutWhenStoryOpen);
        }
    }

    @Subscribe
    public void onVideoPageChangeEvent(com.ss.android.ugc.aweme.feed.f.ac acVar) {
        com.ss.android.ugc.aweme.feed.f.ac acVar2 = acVar;
        if (PatchProxy.isSupport(new Object[]{acVar2}, this, f3515a, false, 57319, new Class[]{com.ss.android.ugc.aweme.feed.f.ac.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{acVar2}, this, f3515a, false, 57319, new Class[]{com.ss.android.ugc.aweme.feed.f.ac.class}, Void.TYPE);
            return;
        }
        this.B = acVar2.f45277a;
        k();
    }

    private void a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f3515a, false, 57240, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f3515a, false, 57240, new Class[]{View.class}, Void.TYPE);
        } else if (view2 != null) {
            if (TimeLockRuler.isInTeenagerModeNewVersion()) {
                ((TextView) view2.findViewById(C0906R.id.czw).findViewById(C0906R.id.d00)).setOnClickListener(new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f54204a;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f54204a, false, 57354, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f54204a, false, 57354, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        FragmentActivity activity = MainFragment.this.getActivity();
                        if (PatchProxy.isSupport(new Object[]{activity}, null, com.ss.android.ugc.aweme.antiaddic.lock.d.f33446a, true, 21806, new Class[]{Activity.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{activity}, null, com.ss.android.ugc.aweme.antiaddic.lock.d.f33446a, true, 21806, new Class[]{Activity.class}, Void.TYPE);
                            return;
                        }
                        String str = "";
                        if (TimeLockRuler.isParentalPlatformContentFilterOn()) {
                            str = "enter_kid_platform";
                            ParentalPlatformManager.a((Activity) activity);
                        } else if (TimeLockRuler.isSelfContentFilterOn() || ((Boolean) x.a().l().c()).booleanValue()) {
                            str = "enter_teen_mode";
                            SetTimeLockActivity.a(activity, 1);
                        }
                        if (!TextUtils.isEmpty(str)) {
                            r.a(str, (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "homepage_hot_top_bar").f34114b);
                        }
                    }
                });
            }
        }
    }

    private static View b(View view) {
        int i2;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, null, f3515a, true, 57265, new Class[]{View.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{view2}, null, f3515a, true, 57265, new Class[]{View.class}, View.class);
        }
        if (TimeLockRuler.isInTeenagerModeNewVersion()) {
            i2 = C0906R.id.cgn;
        } else {
            i2 = C0906R.id.cfe;
        }
        return view2.findViewById(i2);
    }

    private void c(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f3515a, false, 57266, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f3515a, false, 57266, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (TimeLockRuler.isInTeenagerModeNewVersion()) {
            view2 = view2.findViewById(C0906R.id.czw);
        }
        View b2 = b(view2);
        r();
        b2.setOnTouchListener(new ag(b2));
        b2.setOnClickListener(new x(this));
    }

    private void d(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3515a, false, 57272, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3515a, false, 57272, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a(1, i2);
        this.mViewPager.setCurrentItem(i2, false);
    }

    private void g(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3515a, false, 57286, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3515a, false, 57286, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (MainPageExperimentHelper.e() && isViewValid() && this.m != null && this.m.isShowing()) {
            if (z2) {
                com.bytedance.ies.dmt.ui.d.a.b(getContext(), (int) C0906R.string.j8).a();
            }
            this.m.dismiss();
        }
    }

    public final void e(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3515a, false, 57296, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3515a, false, 57296, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            if (!z2 && h()) {
                this.h = System.currentTimeMillis();
            }
            if (this.mPagerTabStrip != null) {
                this.mPagerTabStrip.setShowFollowDot(z2);
            }
        }
    }

    public final void f(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3515a, false, 57297, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3515a, false, 57297, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (isViewValid() && this.mPagerTabStrip != null) {
            this.mPagerTabStrip.setShowFollowDotLive(z2);
            if (z2) {
                this.w.f47732b = true;
            }
        }
    }

    @Subscribe
    public void onAfterLoginInEvent(com.ss.android.ugc.aweme.login.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3515a, false, 57312, new Class[]{com.ss.android.ugc.aweme.login.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3515a, false, 57312, new Class[]{com.ss.android.ugc.aweme.login.a.a.class}, Void.TYPE);
            return;
        }
        if (TimeLockRuler.isInTeenagerModeNewVersion()) {
            b(1);
            v.a(false, this.mCommonTitleBar);
            v.a(true, this.mTeenagerModeTitleBarStub);
            View view = getView();
            if (view != null) {
                a(view);
                c(view);
            }
        }
    }

    public void onAttach(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, f3515a, false, 57273, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, this, f3515a, false, 57273, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        super.onAttach(activity);
        if (MainPageExperimentHelper.e()) {
            a.i.a(3000).a((a.g<TResult, TContinuationResult>) new y<TResult,TContinuationResult>(this, activity2), a.i.f1052b);
        }
    }

    @Subscribe
    public void onCaptchaConsumerEvent(com.ss.android.ugc.aweme.captcha.a aVar) {
        com.ss.android.ugc.aweme.captcha.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f3515a, false, 57305, new Class[]{com.ss.android.ugc.aweme.captcha.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f3515a, false, 57305, new Class[]{com.ss.android.ugc.aweme.captcha.a.class}, Void.TYPE);
            return;
        }
        if (aVar2 != null) {
            Activity e2 = p.a().e();
            if (e2 != null && (e2 instanceof MainActivity)) {
                MainActivity mainActivity = (MainActivity) e2;
                Fragment curFragment = mainActivity.getCurFragment();
                if (curFragment != null && (curFragment instanceof MainFragment)) {
                    aVar2.accept(mainActivity);
                    return;
                }
            }
            this.n = true;
        }
    }

    @Subscribe
    public void onChangeCityEvent(com.ss.android.ugc.aweme.feed.f.d dVar) {
        com.ss.android.ugc.aweme.feed.f.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f3515a, false, 57308, new Class[]{com.ss.android.ugc.aweme.feed.f.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f3515a, false, 57308, new Class[]{com.ss.android.ugc.aweme.feed.f.d.class}, Void.TYPE);
            return;
        }
        if (e()) {
            if (!TextUtils.equals(dVar2.f45298a.code, com.ss.android.ugc.aweme.feed.c.d())) {
                com.ss.android.ugc.aweme.feed.c.a(dVar2.f45298a);
            } else {
                com.ss.android.ugc.aweme.feed.c.a((NearbyCities.CityBean) null);
            }
            if (dVar2.f45299b) {
                com.ss.android.ugc.aweme.feed.c.b(dVar2.f45298a);
            }
            this.mPagerTabStrip.a(dVar2.f45298a.name, dVar2.f45300c);
            if (dVar2.f45300c) {
                bg.a(new y());
            }
        }
    }

    @Subscribe
    public void onClickBottomTabEvent(com.ss.android.ugc.aweme.feed.f.e eVar) {
        com.ss.android.ugc.aweme.feed.f.e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f3515a, false, 57307, new Class[]{com.ss.android.ugc.aweme.feed.f.e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f3515a, false, 57307, new Class[]{com.ss.android.ugc.aweme.feed.f.e.class}, Void.TYPE);
            return;
        }
        if ("HOME".equals(eVar2.f45301a)) {
            this.mTitleBarContainer.setTranslationY(0.0f);
        }
    }

    @Subscribe
    public void onDismissSearchGuideEvent(l lVar) {
        if (PatchProxy.isSupport(new Object[]{lVar}, this, f3515a, false, 57302, new Class[]{l.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lVar}, this, f3515a, false, 57302, new Class[]{l.class}, Void.TYPE);
            return;
        }
        if (this.f3517c != null && this.f3517c.isShowing()) {
            this.f3517c.dismiss();
            this.f3517c = null;
        }
    }

    public void onHiddenChanged(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3515a, false, 57233, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3515a, false, 57233, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z2);
        b_(!z2);
        if (!z2) {
            this.p = true;
        }
        if (this.m != null) {
            this.m.a(!z2);
        }
        if (!z2) {
            bl.a(d.END, "tab", getTag());
        }
    }

    @Subscribe
    public void onLogoutEvent(com.ss.android.ugc.aweme.app.d.g gVar) {
        if (PatchProxy.isSupport(new Object[]{gVar}, this, f3515a, false, 57303, new Class[]{com.ss.android.ugc.aweme.app.d.g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar}, this, f3515a, false, 57303, new Class[]{com.ss.android.ugc.aweme.app.d.g.class}, Void.TYPE);
            return;
        }
        if (MainPageExperimentHelper.n()) {
            e(false);
            c(0);
            f(false);
        }
        g(false);
    }

    @Subscribe
    public void onPublishStatusUpdate(com.ss.android.ugc.aweme.shortvideo.f.e eVar) {
        com.ss.android.ugc.aweme.shortvideo.f.e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f3515a, false, 57284, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f3515a, false, 57284, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.e.class}, Void.TYPE);
        } else if (isViewValid()) {
            if (eVar2.f67642c == 9 && eVar2.g) {
                b(eVar2.h);
            }
        }
    }

    public final void a(int i2) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3515a, false, 57259, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3515a, false, 57259, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (getActivity() != null) {
            FollowPageFirstFrameViewModel a2 = FollowPageFirstFrameViewModel.a(getActivity());
            if (i2 == 2) {
                str = "slide";
            } else {
                str = "click";
            }
            a2.f75412b = str;
            a2.a();
        }
    }

    public final void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3515a, false, 57298, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3515a, false, 57298, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (isViewValid() && this.mPagerTabStrip != null) {
            this.mPagerTabStrip.setShowFollowDotCount(i2);
        }
    }

    public final void d(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f3515a, false, 57293, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f3515a, false, 57293, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f3518d != null) {
            FeedFragment feedFragment = (FeedFragment) this.f3518d.a();
            if (feedFragment != null) {
                feedFragment.c(true);
                if (feedFragment instanceof StaggeredNearByFragment) {
                    ((StaggeredNearByFragment) feedFragment).o();
                }
            }
        }
    }

    @Subscribe
    public void onAwesomeSplashEvent(AwesomeSplashEvent awesomeSplashEvent) {
        View view;
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{awesomeSplashEvent}, this, f3515a, false, 57301, new Class[]{AwesomeSplashEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{awesomeSplashEvent}, this, f3515a, false, 57301, new Class[]{AwesomeSplashEvent.class}, Void.TYPE);
            return;
        }
        View view2 = getView();
        if (view2 == null) {
            view = null;
        } else {
            view = b(view2);
        }
        r();
        if (awesomeSplashEvent.f39420b != 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.x = z2;
        com.ss.android.ugc.aweme.commercialize.splash.d.a(awesomeSplashEvent.f39420b, this.o, this.mVgRightContainer, view);
        if (!c()) {
            com.ss.android.ugc.aweme.commercialize.splash.d.a(awesomeSplashEvent.f39420b, this.mPagerTabStrip, this.mIvBtnSearch, this.mSearchText, this.mIvBtnStorySwitch);
        }
        if (!(awesomeSplashEvent.f39420b != 4 || this.mIvBtnSearch == null || this.mTvLive == null)) {
            this.mIvBtnSearch.setAlpha(0.6f);
            this.mSearchText.setAlpha(0.6f);
            this.mTvLive.setAlpha(0.6f);
        }
    }

    @Subscribe
    public void onDislikeAwemeEvent(com.ss.android.ugc.aweme.feed.f.i iVar) {
        float f2;
        View view;
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f3515a, false, 57300, new Class[]{com.ss.android.ugc.aweme.feed.f.i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar}, this, f3515a, false, 57300, new Class[]{com.ss.android.ugc.aweme.feed.f.i.class}, Void.TYPE);
            return;
        }
        if (iVar.f45308b == 1) {
            if (iVar.f45307a) {
                f2 = 0.0f;
            } else {
                f2 = 1.0f;
            }
            com.ss.android.ugc.aweme.shortvideo.util.an.a(this.mPagerTabStrip, this.mPagerTabStrip.getAlpha(), f2);
            com.ss.android.ugc.aweme.shortvideo.util.an.a(this.mIvBtnStorySwitch, this.mIvBtnStorySwitch.getAlpha(), f2);
            com.ss.android.ugc.aweme.shortvideo.util.an.a(this.mVgRightContainer, this.mVgRightContainer.getAlpha(), f2);
            com.ss.android.ugc.aweme.shortvideo.util.an.a(this.mFlSerach, this.mFlSerach.getAlpha(), f2);
            View view2 = getView();
            if (view2 == null) {
                view = null;
            } else {
                view = b(view2);
            }
            r();
            if (view != null) {
                com.ss.android.ugc.aweme.shortvideo.util.an.a(view, view.getAlpha(), f2);
            }
        }
    }

    @Subscribe
    public void onDismissTitleTabEvent(com.ss.android.ugc.aweme.feed.f.m mVar) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        if (PatchProxy.isSupport(new Object[]{mVar}, this, f3515a, false, 57306, new Class[]{com.ss.android.ugc.aweme.feed.f.m.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mVar}, this, f3515a, false, 57306, new Class[]{com.ss.android.ugc.aweme.feed.f.m.class}, Void.TYPE);
            return;
        }
        if (this.r != null && this.r.isRunning()) {
            if (this.D != mVar.f45313a) {
                this.r.cancel();
            } else {
                return;
            }
        }
        this.D = mVar.f45313a;
        if (this.r == null) {
            this.r = new AnimatorSet();
        }
        if (!mVar.f45313a) {
            objectAnimator2 = ObjectAnimator.ofFloat(this.mTitleBarContainer, "translationY", new float[]{this.mTitleBarContainer.getTranslationY(), (float) (-(this.mTitleBarContainer.getHeight() + this.mStatusBarView.getHeight()))});
            objectAnimator = ObjectAnimator.ofFloat(this.mTitleShadow, "translationY", new float[]{this.mTitleShadow.getTranslationY(), (float) (-(this.mTitleShadow.getHeight() + this.mStatusBarView.getHeight()))});
        } else {
            this.mTitleShadow.setVisibility(0);
            objectAnimator2 = ObjectAnimator.ofFloat(this.mTitleBarContainer, "translationY", new float[]{this.mTitleBarContainer.getTranslationY(), 0.0f});
            objectAnimator = ObjectAnimator.ofFloat(this.mTitleShadow, "translationY", new float[]{this.mTitleShadow.getTranslationY(), 0.0f});
        }
        this.r.setDuration(300);
        this.r.play(objectAnimator2).with(objectAnimator);
        this.r.start();
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3515a, false, 57294, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3515a, false, 57294, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!(this.mViewPager == null || this.mViewPager.getCurrentItem() == i2)) {
            d(true);
            d(i2);
        }
    }

    public final void c(boolean z2) {
        TextView textView;
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f3515a, false, 57291, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f3515a, false, 57291, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f3518d != null) {
            FeedFragment feedFragment = (FeedFragment) this.f3518d.a();
            if (feedFragment != null) {
                feedFragment.a(true);
                if (feedFragment instanceof StaggeredNearByFragment) {
                    ((StaggeredNearByFragment) feedFragment).m();
                    r.a("enter_homepage_fresh", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("group_id", aa.m(this.B)).a("author_id", aa.a(this.B)).a("enter_method", "click_bottom_icon").a("previous_page", "others").f34114b);
                    r.a("homepage_fresh_click", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("click_method", "click_bottom_icon").a("city_info", aa.a()).f34114b);
                } else if (feedFragment instanceof FeedFollowFragment) {
                    r.a("enter_homepage_follow", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("group_id", aa.m(this.B)).a("author_id", aa.a(this.B)).a("enter_method", "click_bottom_icon").a("previous_page", "others").f34114b);
                }
            }
            if (this.mPagerTabStrip != null) {
                MainTabStrip mainTabStrip = this.mPagerTabStrip;
                boolean isLogin = com.ss.android.ugc.aweme.account.d.a().isLogin();
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(isLogin ? (byte) 1 : 0)}, mainTabStrip, MainTabStrip.f40394a, false, 33689, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    MainTabStrip mainTabStrip2 = mainTabStrip;
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(isLogin)}, mainTabStrip2, MainTabStrip.f40394a, false, 33689, new Class[]{Boolean.TYPE}, Void.TYPE);
                    return;
                }
                if (MainPageExperimentHelper.c()) {
                    textView = mainTabStrip.mTvNearByLeft;
                } else {
                    textView = mainTabStrip.mTvFresh;
                }
                if (!mainTabStrip.h && textView.getVisibility() == 0) {
                    mainTabStrip.a(false, isLogin);
                }
            }
        }
    }

    @Subscribe
    public void onScrollToFeedFollowGuideEvent(com.ss.android.ugc.aweme.main.guide.d dVar) {
        com.ss.android.ugc.aweme.main.guide.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f3515a, false, 57267, new Class[]{com.ss.android.ugc.aweme.main.guide.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f3515a, false, 57267, new Class[]{com.ss.android.ugc.aweme.main.guide.d.class}, Void.TYPE);
            return;
        }
        if (dVar2.f54820a) {
            if (PatchProxy.isSupport(new Object[0], this, f3515a, false, 57253, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3515a, false, 57253, new Class[0], Void.TYPE);
            } else {
                if (this.mPagerTabStrip != null) {
                    MainTabStrip mainTabStrip = this.mPagerTabStrip;
                    if (PatchProxy.isSupport(new Object[0], mainTabStrip, MainTabStrip.f40394a, false, 33664, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], mainTabStrip, MainTabStrip.f40394a, false, 33664, new Class[0], Void.TYPE);
                    } else if (v.a(mainTabStrip.mIndicator)) {
                        mainTabStrip.f40396c = mainTabStrip.mIndicator.getTranslationX();
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mainTabStrip.mIndicator, "translationX", new float[]{mainTabStrip.f40396c, mainTabStrip.f40396c - ((float) u.a(58.0d))});
                        ofFloat.setDuration(400);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(mainTabStrip.mIndicator, "translationX", new float[]{mainTabStrip.f40396c - ((float) u.a(58.0d)), mainTabStrip.f40396c});
                        ofFloat2.setDuration(900);
                        mainTabStrip.f40395b.play(ofFloat).before(ofFloat2);
                        mainTabStrip.f40395b.start();
                        mainTabStrip.f40395b.addListener(new Animator.AnimatorListener() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f40406a;

                            public final void onAnimationCancel(Animator animator) {
                            }

                            public final void onAnimationRepeat(Animator animator) {
                            }

                            public final void onAnimationStart(Animator animator) {
                            }

                            public final void onAnimationEnd(Animator animator) {
                                if (PatchProxy.isSupport(new Object[]{animator}, this, f40406a, false, 33697, new Class[]{Animator.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{animator}, this, f40406a, false, 33697, new Class[]{Animator.class}, Void.TYPE);
                                    return;
                                }
                                if (MainTabStrip.this.f40397d) {
                                    MainTabStrip.this.f40395b.start();
                                }
                            }
                        });
                    }
                }
            }
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f3515a, false, 57254, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3515a, false, 57254, new Class[0], Void.TYPE);
            } else if (this.mPagerTabStrip != null) {
                MainTabStrip mainTabStrip2 = this.mPagerTabStrip;
                if (PatchProxy.isSupport(new Object[0], mainTabStrip2, MainTabStrip.f40394a, false, 33665, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], mainTabStrip2, MainTabStrip.f40394a, false, 33665, new Class[0], Void.TYPE);
                    return;
                }
                mainTabStrip2.f40397d = false;
                if (mainTabStrip2.mIndicator != null && mainTabStrip2.f40395b.isRunning()) {
                    mainTabStrip2.f40395b.cancel();
                    mainTabStrip2.mIndicator.setTranslationX(mainTabStrip2.f40396c);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3515a, false, 57285, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3515a, false, 57285, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (MainPageExperimentHelper.e()) {
            final boolean z3 = z2;
            ((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().getRecoverDraftIfHave(com.ss.android.ugc.aweme.app.k.a(), new IPublishService.OnGetRecoverDraftCallback() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54194a;

                public final void onFail() {
                }

                public final void onSuccess(com.ss.android.ugc.aweme.draft.a.c cVar) {
                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f54194a, false, 57346, new Class[]{com.ss.android.ugc.aweme.draft.a.c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f54194a, false, 57346, new Class[]{com.ss.android.ugc.aweme.draft.a.c.class}, Void.TYPE);
                    } else if (MainFragment.this.isViewValid()) {
                        MainFragment.this.m = new h(MainFragment.this.getActivity(), cVar, z3);
                        if (MainFragment.this.isHidden()) {
                            MainFragment.this.m.a(false);
                        }
                        MainFragment.this.m.b();
                    }
                }
            });
        }
    }

    @Subscribe
    public void onLiveSquareGuideEvent(com.ss.android.ugc.aweme.feed.f.u uVar) {
        com.ss.android.ugc.aweme.app.an<Boolean> anVar;
        int i2;
        com.ss.android.ugc.aweme.feed.f.u uVar2 = uVar;
        if (PatchProxy.isSupport(new Object[]{uVar2}, this, f3515a, false, 57313, new Class[]{com.ss.android.ugc.aweme.feed.f.u.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{uVar2}, this, f3515a, false, 57313, new Class[]{com.ss.android.ugc.aweme.feed.f.u.class}, Void.TYPE);
            return;
        }
        if (uVar2.f45318a) {
            if (PatchProxy.isSupport(new Object[0], this, f3515a, false, 57249, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3515a, false, 57249, new Class[0], Void.TYPE);
            } else {
                int c2 = n().c(0);
                if (c2 < com.ss.android.ugc.aweme.global.config.settings.g.b().aS().intValue()) {
                    x a2 = x.a();
                    if (PatchProxy.isSupport(new Object[0], a2, x.f2698a, false, 22384, new Class[0], com.ss.android.ugc.aweme.app.an.class)) {
                        anVar = (com.ss.android.ugc.aweme.app.an) PatchProxy.accessDispatch(new Object[0], a2, x.f2698a, false, 22384, new Class[0], com.ss.android.ugc.aweme.app.an.class);
                    } else {
                        if (a2.g == null) {
                            a2.g = new com.ss.android.ugc.aweme.app.an<>("had_shown_teens_mode_update_dialog", Boolean.FALSE);
                        }
                        anVar = a2.g;
                    }
                    if (((Boolean) anVar.c()).booleanValue() && n().i(false) && n().k(false) && !n().a(true) && ((Integer) SharePrefCache.inst().getScrollToProfileGuideState().c()).intValue() != 1 && !cb.a() && !cb.f54699d && getActivity() != null && this.mIvBtnStorySwitch.getVisibility() == 0 && !this.u) {
                        n().d(c2 + 1);
                        if (this.t == null) {
                            b.a aVar = new b.a(getActivity());
                            aVar.k = 500;
                            b.a b2 = aVar.a(5000).c(false).b(true);
                            if (MainPageExperimentHelper.o() || com.ss.android.ugc.aweme.discover.helper.b.i() || com.ss.android.ugc.aweme.main.g.a.b()) {
                                i2 = 0;
                            } else {
                                i2 = -u.a(3.0d);
                            }
                            b.a a3 = b2.d(i2).e(u.a(-16.0d)).b((int) C0906R.string.b6q).a(false);
                            AnonymousClass10 r1 = new b.c() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f54188a;

                                public final void a() {
                                    if (PatchProxy.isSupport(new Object[0], this, f54188a, false, 57359, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f54188a, false, 57359, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    MainFragment.this.n().g(false);
                                }
                            };
                            Intrinsics.checkParameterIsNotNull(r1, "listener");
                            a3.w = r1;
                            this.t = a3.a((b.d) new b.d() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f54209a;

                                public final void a() {
                                    if (PatchProxy.isSupport(new Object[0], this, f54209a, false, 57358, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f54209a, false, 57358, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    MainFragment.this.n().g(true);
                                }
                            }).a();
                        }
                        if (MainPageExperimentHelper.o() || com.ss.android.ugc.aweme.discover.helper.b.i() || com.ss.android.ugc.aweme.main.g.a.b()) {
                            this.t.a(this.mIvBtnStorySwitch, 80, (float) u.a(91.0d), -u.a(96.0d));
                        } else {
                            this.t.a(this.mIvBtnStorySwitch, 80, true);
                        }
                        if (PatchProxy.isSupport(new Object[]{"homepage_hot"}, null, com.ss.android.ugc.aweme.story.live.b.f73120a, true, 84703, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{"homepage_hot"}, null, com.ss.android.ugc.aweme.story.live.b.f73120a, true, 84703, new Class[]{String.class}, Void.TYPE);
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("enter_from_merge", "homepage_hot");
                            r.a("livesdk_live_tag_show", (Map) hashMap);
                        }
                    }
                }
                this.u = true;
            }
        } else {
            b();
        }
    }

    public final void a(com.ss.android.ugc.aweme.poi.a.k kVar) {
        TextView textView;
        com.ss.android.ugc.aweme.poi.a.k kVar2 = kVar;
        if (PatchProxy.isSupport(new Object[]{kVar2}, this, f3515a, false, 57314, new Class[]{com.ss.android.ugc.aweme.poi.a.k.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVar2}, this, f3515a, false, 57314, new Class[]{com.ss.android.ugc.aweme.poi.a.k.class}, Void.TYPE);
            return;
        }
        r.a("request_fresh_name_result", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("is_success", 1).f34114b);
        if (kVar2 != null) {
            if (kVar2.f59407a != null) {
                com.ss.android.ugc.aweme.feed.c.b(kVar2.f59407a);
                r.a("get_adcode", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("adcode", kVar2.f59407a.adCode).f34114b);
            }
            if (e()) {
                if (kVar2.f59407a != null) {
                    r.a("get_fresh_name", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("adcode", kVar2.f59407a.adCode).a("show_name", kVar2.f59407a.showName).a("is_default", 0).a("show_type", kVar2.f59407a.showType).f34114b);
                    if (!com.ss.android.ugc.aweme.feed.c.f() && !TextUtils.isEmpty(kVar2.f59407a.name) && this.mPagerTabStrip != null) {
                        this.mPagerTabStrip.a(kVar2.f59407a.showName, false);
                    }
                }
                if (!TextUtils.isEmpty(kVar2.f59408b) && !TextUtils.isEmpty(kVar2.f59409c)) {
                    String str = kVar2.f59408b;
                    if (!str.equals(SharePrefCache.inst().getSameCityActiveId().c())) {
                        SharePrefCache.inst().setSameCityActiveId(str);
                        if (!com.ss.android.ugc.aweme.feed.c.f() && this.mPagerTabStrip != null) {
                            MainTabStrip mainTabStrip = this.mPagerTabStrip;
                            String str2 = kVar2.f59409c;
                            boolean isLogin = com.ss.android.ugc.aweme.account.d.a().isLogin();
                            if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(isLogin ? (byte) 1 : 0)}, mainTabStrip, MainTabStrip.f40394a, false, 33686, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
                                MainTabStrip mainTabStrip2 = mainTabStrip;
                                PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(isLogin)}, mainTabStrip2, MainTabStrip.f40394a, false, 33686, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
                            } else if (!TextUtils.isEmpty(str2) && !mainTabStrip.h) {
                                if (MainPageExperimentHelper.c()) {
                                    textView = mainTabStrip.mTvNearByLeft;
                                } else {
                                    textView = mainTabStrip.mTvFresh;
                                }
                                textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                                if (str2.length() <= 6) {
                                    textView.setMaxEms(str2.length() + 1);
                                    if (str2.length() == 1) {
                                        mainTabStrip.g = str2 + "      ";
                                    } else {
                                        mainTabStrip.g = str2 + "    ";
                                    }
                                } else {
                                    mainTabStrip.g = str2;
                                }
                                mainTabStrip.a(true, isLogin);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3515a, false, 57315, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3515a, false, 57315, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        r.a("request_fresh_name_result", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("is_success", 0).f34114b);
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3515a, false, 57271, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3515a, false, 57271, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.j = i2;
        if (this.f3518d.f54212e[i3] == 1) {
            FollowFeedTriggerViewModel.a(getActivity()).f47720b = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, boolean z2) {
        String str;
        String str2;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3515a, false, 57269, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2)}, this, f3515a, false, 57269, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (i3 == 1) {
            a.a(getContext(), "homepage_hot", "click");
        } else if (i3 != 0) {
            if (i3 == 2) {
                a.a(getContext(), f(), "click");
                if (e()) {
                    if (z2) {
                        str = "refresh";
                    } else {
                        str = "enter";
                    }
                    aa.f75006c = str;
                    r.a("homepage_fresh_click", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("click_method", str).a("city_info", aa.a()).f34114b);
                }
            }
        } else if (!MainPageExperimentHelper.c() || z2) {
            a.a(getContext(), "homepage_follow", "click");
        } else {
            if (z2) {
                str2 = "refresh";
            } else {
                str2 = "click_top_icon";
            }
            r.a("homepage_fresh_click", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("click_method", str2).a("city_info", aa.a()).f34114b);
        }
    }

    @MeasureFunction
    public void onViewCreated(View view, Bundle bundle) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        String str;
        String str2;
        int i5;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f3515a, false, 57258, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f3515a, false, 57258, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        bg.c(this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.mStatusBarView.getLayoutParams().height = ((com.ss.android.ugc.aweme.legoImp.inflate.h) com.ss.android.ugc.aweme.lego.a.i.b(com.ss.android.ugc.aweme.legoImp.inflate.h.class)).a(getActivity());
        }
        if (PatchProxy.isSupport(new Object[0], this, f3515a, false, 57255, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3515a, false, 57255, new Class[0], Void.TYPE);
        } else {
            this.z = DataCenter.a(ViewModelProviders.of(getActivity()), (LifecycleOwner) this);
            this.z.a("FOLLOW_NOTICE_AT_MAIN_TAB_STRIP", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) new ab<com.ss.android.ugc.aweme.arch.widgets.base.a>(this)).a("SHOW_PILL_NOTICE", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) new ac<com.ss.android.ugc.aweme.arch.widgets.base.a>(this)).a("HIDE_PILL_NOTICE", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) new ad<com.ss.android.ugc.aweme.arch.widgets.base.a>(this)).a("CHANGE_FOLLOW_DOT", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) new ae<com.ss.android.ugc.aweme.arch.widgets.base.a>(this));
        }
        this.w = LiveTagViewModel.a(getActivity());
        ViewCompat.setTransitionName(this.mIvBtnSearch, getResources().getString(C0906R.string.c24));
        this.f3518d = new MainPagerAdapter(getChildFragmentManager(), MainPageExperimentHelper.g());
        this.mViewPager.setAdapter(this.f3518d);
        this.mViewPager.f40388b = false;
        this.mPagerTabStrip.setViewPager(this.mViewPager);
        this.mPagerTabStrip.setTabMode(MainPageExperimentHelper.g());
        NearbyCities.CityBean c2 = com.ss.android.ugc.aweme.feed.c.c();
        if (e()) {
            if (c2 != null) {
                this.mPagerTabStrip.a(c2.showName, false);
            }
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
            if (c2 != null) {
                str = c2.adCode;
            } else {
                str = "";
            }
            com.ss.android.ugc.aweme.app.d.d a3 = a2.a("adcode", str);
            if (c2 != null) {
                str2 = c2.showName;
            } else {
                str2 = this.mPagerTabStrip.getNearbyTitle();
            }
            com.ss.android.ugc.aweme.app.d.d a4 = a3.a("show_name", str2).a("is_default", 1);
            if (c2 != null) {
                i5 = c2.showType;
            } else {
                i5 = -1;
            }
            r.a("get_fresh_name", (Map) a4.a("show_type", i5).f34114b);
        }
        this.mPagerTabStrip.setTabOnClickListener(new af(this));
        this.mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54190a;

            public void onPageScrollStateChanged(int i) {
            }

            public void onPageSelected(int i) {
                boolean z;
                int i2 = i;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f54190a, false, 57344, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f54190a, false, 57344, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                int i3 = MainFragment.this.i;
                MainFragment.this.i = i2;
                int c2 = MainFragment.this.f3518d.c(i2);
                int c3 = MainFragment.this.f3518d.c(i3);
                MainFragment mainFragment = MainFragment.this;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(c2), Integer.valueOf(c3)}, mainFragment, MainFragment.f3515a, false, 57262, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    MainFragment mainFragment2 = mainFragment;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(c2), Integer.valueOf(c3)}, mainFragment2, MainFragment.f3515a, false, 57262, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else if (mainFragment.j == 1) {
                    com.ss.android.ugc.aweme.main.d.a.a(mainFragment.getActivity(), c2, c3, mainFragment.h(), mainFragment.j(), mainFragment.i());
                } else if (mainFragment.j == 2) {
                    FragmentActivity activity = mainFragment.getActivity();
                    boolean h = mainFragment.h();
                    boolean j = mainFragment.j();
                    boolean i4 = mainFragment.i();
                    if (PatchProxy.isSupport(new Object[]{activity, Integer.valueOf(c2), Integer.valueOf(c3), Byte.valueOf(h ? (byte) 1 : 0), Byte.valueOf(j ? (byte) 1 : 0), Byte.valueOf(i4 ? (byte) 1 : 0)}, null, com.ss.android.ugc.aweme.main.d.a.f54716a, true, 57982, new Class[]{FragmentActivity.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{activity, Integer.valueOf(c2), Integer.valueOf(c3), Byte.valueOf(h), Byte.valueOf(j), Byte.valueOf(i4)}, null, com.ss.android.ugc.aweme.main.d.a.f54716a, true, 57982, new Class[]{FragmentActivity.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
                    } else {
                        Aweme aweme = null;
                        if (activity != null) {
                            aweme = AwemeChangeCallBack.a(activity);
                        }
                        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.main.d.a.a(aweme);
                        a2.a("previous_page", com.ss.android.ugc.aweme.main.d.a.a(c3));
                        if (c2 != 7 || !MainPageExperimentHelper.c()) {
                            a2.a("enter_method", "slide");
                        } else {
                            a2.a("enter_method", "slide_right");
                        }
                        if (c2 == 1) {
                            if (h) {
                                a2.a("notice_type", "yellow_dot");
                            } else if (j) {
                                a2.a("notice_type", "number_dot");
                            } else if (i4) {
                                a2.a("notice_type", "live");
                            }
                        }
                        r.a(com.ss.android.ugc.aweme.main.d.a.b(c2), (Map) a2.f34114b);
                    }
                }
                if (MainFragment.this.j == 2) {
                    MainFragment mainFragment3 = MainFragment.this;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3), Integer.valueOf(i)}, mainFragment3, MainFragment.f3515a, false, 57263, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                        MainFragment mainFragment4 = mainFragment3;
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3), Integer.valueOf(i)}, mainFragment4, MainFragment.f3515a, false, 57263, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    } else {
                        Fragment b2 = mainFragment3.f3518d.b(i3);
                        if (b2 instanceof FeedFragment) {
                            ((FeedFragment) b2).c(false);
                            b2.setUserVisibleHint(false);
                        }
                        Fragment b3 = mainFragment3.f3518d.b(i2);
                        if (b3 != null) {
                            b3.setUserVisibleHint(true);
                        }
                    }
                }
                FeedFragment feedFragment = (FeedFragment) MainFragment.this.f3518d.a();
                if (feedFragment != null) {
                    if ((i2 <= 1 && (feedFragment instanceof BaseFeedListFragment)) || i2 == 2 || (feedFragment instanceof BaseCellFeedFragment)) {
                        feedFragment.a(false);
                    }
                    if (feedFragment instanceof BaseCellFeedFragment) {
                        MainFragment.this.mVTabBg.setVisibility(0);
                    } else {
                        MainFragment.this.mVTabBg.setVisibility(4);
                    }
                }
                ((CurChosenFeedListType) ViewModelProviders.of(MainFragment.this.getActivity()).get(CurChosenFeedListType.class)).f54127a = c2;
                MainFragment.this.g();
                if (c2 == 7) {
                    if (MainFragment.this.j == 2) {
                        r.a("homepage_fresh_click", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("click_method", "slide_right").a("city_info", aa.a()).f34114b);
                    }
                    v.a((View) MainFragment.this.mTitleShadow, 8);
                    bg.a(new j());
                } else if (c2 != 11) {
                    switch (c2) {
                        case 0:
                            v.a((View) MainFragment.this.mTitleShadow, 0);
                            if (MainPageExperimentHelper.n() && AbTestManager.a().bE() == 1 && MainFragment.this.f3520f) {
                                MainFragment.this.e(true);
                                MainFragment.this.a(false, 0);
                                break;
                            }
                        case 1:
                            if (MainFragment.this.j == 2) {
                                MainFragment.this.a(2);
                            }
                            if (MainFragment.this.j == 2 && MainFragment.this.n().d(true)) {
                                MainFragment.this.n().e(false);
                            }
                            if (MainFragment.this.h()) {
                                com.ss.android.ugc.aweme.main.d.a.a(false);
                                com.ss.android.ugc.aweme.main.d.a.a(false, "homepage_hot", "yellow_dot");
                            }
                            v.a((View) MainFragment.this.mTitleShadow, 0);
                            ag.b(MainFragment.this.i());
                            if (feedFragment != null) {
                                MainFragment mainFragment5 = MainFragment.this;
                                if (PatchProxy.isSupport(new Object[0], mainFragment5, MainFragment.f3515a, false, 57282, new Class[0], Boolean.TYPE)) {
                                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], mainFragment5, MainFragment.f3515a, false, 57282, new Class[0], Boolean.TYPE)).booleanValue();
                                } else if (mainFragment5.h() || mainFragment5.i() || mainFragment5.j()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    if (MainFragment.this.j == 2) {
                                        MainFragment.this.a(8, "");
                                    } else {
                                        MainFragment.this.a(2, "");
                                    }
                                } else if (ag.c() && (feedFragment instanceof FeedFollowFragment)) {
                                    ((FeedFollowFragment) feedFragment).a(1);
                                }
                            }
                            MainFragment.this.e(false);
                            MainFragment.this.c(0);
                            MainFragment.this.f(false);
                            if (feedFragment != null) {
                                feedFragment.a(System.currentTimeMillis());
                            }
                            if (MainFragment.this.h()) {
                                MainFragment mainFragment6 = MainFragment.this;
                                if (PatchProxy.isSupport(new Object[]{"follow_notice_dis", "yellow_dot"}, mainFragment6, MainFragment.f3515a, false, 57295, new Class[]{String.class, String.class}, Void.TYPE)) {
                                    MainFragment mainFragment7 = mainFragment6;
                                    PatchProxy.accessDispatch(new Object[]{"follow_notice_dis", "yellow_dot"}, mainFragment7, MainFragment.f3515a, false, 57295, new Class[]{String.class, String.class}, Void.TYPE);
                                } else {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("notice_type", "yellow_dot");
                                    } catch (JSONException unused) {
                                    }
                                    r.onEvent(MobClick.obtain().setEventName("follow_notice_dis").setLabelName("follow_bottom_tab").setJsonObject(jSONObject));
                                }
                            }
                            bg.a(new j());
                            break;
                    }
                } else {
                    v.a((View) MainFragment.this.mTitleShadow, 8);
                    bg.a(new j());
                }
                MainFragment.this.a(1, i2);
            }

            public void onPageScrolled(int i, float f2, int i2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f54190a, false, 57343, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f54190a, false, 57343, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (i2 != 0) {
                    MainFragment.this.a(2, i);
                }
            }
        });
        this.mViewPager.setTabStrip(this.mPagerTabStrip);
        Bundle arguments = getArguments();
        if (arguments != null) {
            i2 = arguments.getInt("tab", -1);
        } else {
            i2 = -1;
        }
        if (i2 < 0) {
            MainPagerAdapter mainPagerAdapter = this.f3518d;
            if (!PatchProxy.isSupport(new Object[]{mainPagerAdapter}, null, f3515a, true, 57264, new Class[]{MainPagerAdapter.class}, Integer.TYPE)) {
                int i6 = 0;
                while (true) {
                    if (i6 >= mainPagerAdapter.getCount()) {
                        i2 = 1;
                        break;
                    } else if (mainPagerAdapter.c(i6) == 0) {
                        i2 = i6;
                        break;
                    } else {
                        i6++;
                    }
                }
            } else {
                i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{mainPagerAdapter}, null, f3515a, true, 57264, new Class[]{MainPagerAdapter.class}, Integer.TYPE)).intValue();
            }
        }
        d(i2);
        this.i = this.mViewPager.getCurrentItem();
        if (PatchProxy.isSupport(new Object[0], this, f3515a, false, 57237, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3515a, false, 57237, new Class[0], Void.TYPE);
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f3515a, false, 57236, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3515a, false, 57236, new Class[0], Void.TYPE);
            } else {
                p();
                if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.main.g.a.f54773a, true, 58170, new Class[0], Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.main.g.a.f54773a, true, 58170, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    z2 = com.ss.android.ugc.aweme.main.g.a.b();
                }
                if (!z2) {
                    this.mIvBtnStorySwitch.loop(false);
                    try {
                        this.mIvBtnStorySwitch.setAnimation(f.a("story_open"));
                    } catch (Throwable unused) {
                    }
                    this.mIvBtnStorySwitch.addAnimatorListener(new AnimatorListenerAdapter() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f54200a;

                        public final void onAnimationCancel(Animator animator) {
                            if (PatchProxy.isSupport(new Object[]{animator}, this, f54200a, false, 57351, new Class[]{Animator.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{animator}, this, f54200a, false, 57351, new Class[]{Animator.class}, Void.TYPE);
                                return;
                            }
                            super.onAnimationCancel(animator);
                            MainFragment.this.f3519e = true;
                        }

                        public final void onAnimationEnd(Animator animator) {
                            if (PatchProxy.isSupport(new Object[]{animator}, this, f54200a, false, 57352, new Class[]{Animator.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{animator}, this, f54200a, false, 57352, new Class[]{Animator.class}, Void.TYPE);
                                return;
                            }
                            super.onAnimationEnd(animator);
                            if (MainFragment.this.f3519e && MainFragment.this.mIvBtnStorySwitch != null) {
                                MainFragment.this.mIvBtnStorySwitch.resumeAnimation();
                                MainFragment.this.f3519e = false;
                            }
                        }
                    });
                }
            }
            if (PatchProxy.isSupport(new Object[0], this, f3515a, false, 57238, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3515a, false, 57238, new Class[0], Void.TYPE);
            } else if (this.mIvBtnSearch != null) {
                AbTestManager a5 = AbTestManager.a();
                if (PatchProxy.isSupport(new Object[0], a5, AbTestManager.f63777a, false, 71699, new Class[0], Integer.TYPE)) {
                    i4 = ((Integer) PatchProxy.accessDispatch(new Object[0], a5, AbTestManager.f63777a, false, 71699, new Class[0], Integer.TYPE)).intValue();
                } else {
                    a5.s = 0;
                    AbTestModel d2 = a5.d();
                    if (d2 != null) {
                        a5.s = Integer.valueOf(d2.hotSearchIconType);
                    }
                    i4 = a5.s.intValue();
                }
                if (i4 == 1) {
                    this.mIvBtnSearch.setImageResource(2130838970);
                } else {
                    this.mIvBtnSearch.setImageResource(2130838971);
                }
            }
            if (PatchProxy.isSupport(new Object[0], this, f3515a, false, 57239, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3515a, false, 57239, new Class[0], Void.TYPE);
            } else if (this.mFollowPillNotice != null) {
                this.mFollowPillNotice.setOnClickListener(new w(this));
            }
            com.ss.android.ugc.aweme.profile.a a6 = com.ss.android.ugc.aweme.profile.a.a();
            View view2 = this.mVTabBg;
            if (PatchProxy.isSupport(new Object[]{view2}, a6, com.ss.android.ugc.aweme.profile.a.f61215a, false, 67227, new Class[]{View.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.profile.a aVar = a6;
                PatchProxy.accessDispatch(new Object[]{view2}, aVar, com.ss.android.ugc.aweme.profile.a.f61215a, false, 67227, new Class[]{View.class}, Void.TYPE);
            } else if (com.ss.android.ugc.aweme.profile.a.d() && view2 != null) {
                com.ss.android.b.a.a.a.b(new com.ss.android.ugc.aweme.profile.f(view2, u.a(58.0d)));
            }
            this.mSwipeRefreshLayoutWhenStoryOpen.setOnRefreshListener(new v(this));
            this.mSwipeRefreshLayoutWhenStoryOpen.setEnabled(false);
            a.a().a(false);
            SwipeRefreshLayout swipeRefreshLayout = this.mSwipeRefreshLayoutWhenStoryOpen;
            int i7 = StoryFeedPanel.HEIGHT;
            swipeRefreshLayout.a(false, i7, Constants.f34103b + i7);
            if (AbTestManager.a().G().intValue() == 2) {
                this.mFlSerach.setVisibility(0);
            } else {
                this.mFlSerach.setVisibility(8);
            }
            if (this.mViewPager != null) {
                this.mViewPager.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f54202a;

                    public final boolean onPreDraw() {
                        if (PatchProxy.isSupport(new Object[0], this, f54202a, false, 57353, new Class[0], Boolean.TYPE)) {
                            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f54202a, false, 57353, new Class[0], Boolean.TYPE)).booleanValue();
                        }
                        if (MainFragment.this.mViewPager != null) {
                            MainFragment.this.mViewPager.getViewTreeObserver().removeOnPreDrawListener(this);
                        }
                        if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.ae.a.f33203a, true, 70320, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.ae.a.f33203a, true, 70320, new Class[0], Void.TYPE);
                        } else {
                            a.C0417a aVar = com.ss.android.ugc.aweme.ae.a.f33205c;
                            if (PatchProxy.isSupport(new Object[0], aVar, a.C0417a.f33206a, false, 70322, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], aVar, a.C0417a.f33206a, false, 70322, new Class[0], Void.TYPE);
                            } else if (!com.ss.android.ugc.aweme.ae.a.f33204b) {
                                com.ss.android.ugc.aweme.ae.a.f33204b = true;
                                com.ss.android.b.a.a.a.a(a.C0417a.C0418a.f33208b, (int) TimeUnit.SECONDS.toMillis(10));
                            }
                        }
                        return false;
                    }
                });
            }
            this.mIvBtnStorySwitch.setOnClickListener(this.A);
            this.mTvLive.setOnClickListener(this.A);
        }
        if (PatchProxy.isSupport(new Object[0], this, f3515a, false, 57304, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3515a, false, 57304, new Class[0], Void.TYPE);
        } else {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mTitleShadow.getLayoutParams();
            layoutParams.height = (int) (((float) ((com.ss.android.ugc.aweme.legoImp.inflate.h) com.ss.android.ugc.aweme.lego.a.i.b(com.ss.android.ugc.aweme.legoImp.inflate.h.class)).a(getContext())) + UIUtils.dip2Px(getContext(), 99.0f));
            this.mTitleShadow.setLayoutParams(layoutParams);
            this.mTitleShadow.setVisibility(0);
        }
        if (TimeLockRuler.isInTeenagerModeNewVersion()) {
            this.mCommonTitleBar.setVisibility(8);
            this.mTeenagerModeTitleBarStub.setVisibility(0);
        } else {
            this.mCommonTitleBar.setVisibility(0);
        }
        c(view);
        a(view);
        if (MainPageExperimentHelper.o() || com.ss.android.ugc.aweme.discover.helper.b.i()) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f3515a, false, 57260, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f3515a, false, 57260, new Class[]{View.class}, Void.TYPE);
            } else {
                View view3 = this.mTitleBarContainer;
                Resources resources = getResources();
                if (PatchProxy.isSupport(new Object[]{view3, resources}, null, com.ss.android.ugc.aweme.main.d.b.f54717a, true, 57989, new Class[]{View.class, Resources.class}, Void.TYPE)) {
                    Object[] objArr = {view3, resources};
                    Object[] objArr2 = objArr;
                    PatchProxy.accessDispatch(objArr2, null, com.ss.android.ugc.aweme.main.d.b.f54717a, true, 57989, new Class[]{View.class, Resources.class}, Void.TYPE);
                } else {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                    layoutParams2.height = resources.getDimensionPixelSize(C0906R.dimen.hu);
                    view3.setLayoutParams(layoutParams2);
                }
                View b2 = b(view);
                if (PatchProxy.isSupport(new Object[]{b2}, null, com.ss.android.ugc.aweme.main.d.b.f54717a, true, 57988, new Class[]{View.class}, Void.TYPE)) {
                    Object[] objArr3 = {b2};
                    Object[] objArr4 = objArr3;
                    PatchProxy.accessDispatch(objArr4, null, com.ss.android.ugc.aweme.main.d.b.f54717a, true, 57988, new Class[]{View.class}, Void.TYPE);
                } else {
                    b2.setVisibility(8);
                }
                LinearLayout linearLayout = this.mFlSerach;
                Resources resources2 = getResources();
                if (PatchProxy.isSupport(new Object[]{linearLayout, resources2}, null, com.ss.android.ugc.aweme.main.d.b.f54717a, true, 57990, new Class[]{View.class, Resources.class}, Void.TYPE)) {
                    Object[] objArr5 = {linearLayout, resources2};
                    Object[] objArr6 = objArr5;
                    PatchProxy.accessDispatch(objArr6, null, com.ss.android.ugc.aweme.main.d.b.f54717a, true, 57990, new Class[]{View.class, Resources.class}, Void.TYPE);
                } else {
                    RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
                    layoutParams3.addRule(11, 0);
                    layoutParams3.addRule(9);
                    if (Build.VERSION.SDK_INT >= 17) {
                        layoutParams3.addRule(21, 0);
                        layoutParams3.addRule(20);
                    }
                    com.ss.android.ugc.aweme.main.d.b.a(resources2.getDimensionPixelSize(C0906R.dimen.hw), (ViewGroup.MarginLayoutParams) layoutParams3);
                    com.ss.android.ugc.aweme.main.d.b.b(0, (ViewGroup.MarginLayoutParams) layoutParams3);
                    linearLayout.setLayoutParams(layoutParams3);
                    ImageView imageView = (ImageView) linearLayout.findViewById(C0906R.id.azc);
                    if (imageView != null) {
                        imageView.setImageResource(2130838972);
                    }
                }
                ViewGroup viewGroup = this.mVgRightContainer;
                Resources resources3 = getResources();
                if (PatchProxy.isSupport(new Object[]{viewGroup, resources3}, null, com.ss.android.ugc.aweme.main.d.b.f54717a, true, 57992, new Class[]{View.class, Resources.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{viewGroup, resources3}, null, com.ss.android.ugc.aweme.main.d.b.f54717a, true, 57992, new Class[]{View.class, Resources.class}, Void.TYPE);
                } else {
                    RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams4.addRule(0, 0);
                    layoutParams4.addRule(11);
                    if (Build.VERSION.SDK_INT >= 17) {
                        layoutParams4.addRule(16, 0);
                        layoutParams4.addRule(21);
                    }
                    com.ss.android.ugc.aweme.main.d.b.b(resources3.getDimensionPixelSize(C0906R.dimen.hw), (ViewGroup.MarginLayoutParams) layoutParams4);
                    com.ss.android.ugc.aweme.main.d.b.a(0, (ViewGroup.MarginLayoutParams) layoutParams4);
                    viewGroup.setLayoutParams(layoutParams4);
                }
                HotRightSearchGuideView hotRightSearchGuideView = this.mHotRightSearchGuideView;
                if (PatchProxy.isSupport(new Object[]{hotRightSearchGuideView}, null, com.ss.android.ugc.aweme.main.d.b.f54717a, true, 57991, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{hotRightSearchGuideView}, null, com.ss.android.ugc.aweme.main.d.b.f54717a, true, 57991, new Class[]{View.class}, Void.TYPE);
                } else {
                    FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) hotRightSearchGuideView.getLayoutParams();
                    layoutParams5.gravity = 8388627;
                    com.ss.android.ugc.aweme.main.d.b.a(layoutParams5.rightMargin, (ViewGroup.MarginLayoutParams) layoutParams5);
                    com.ss.android.ugc.aweme.main.d.b.b(0, (ViewGroup.MarginLayoutParams) layoutParams5);
                    hotRightSearchGuideView.setLayoutParams(layoutParams5);
                }
            }
        } else if (com.ss.android.ugc.aweme.main.g.a.b()) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f3515a, false, 57261, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f3515a, false, 57261, new Class[]{View.class}, Void.TYPE);
                return;
            }
            View view4 = this.mTitleBarContainer;
            Resources resources4 = getResources();
            if (PatchProxy.isSupport(new Object[]{view4, resources4}, null, com.ss.android.ugc.aweme.main.g.a.f54773a, true, 58172, new Class[]{View.class, Resources.class}, Void.TYPE)) {
                Object[] objArr7 = {view4, resources4};
                Object[] objArr8 = objArr7;
                PatchProxy.accessDispatch(objArr8, null, com.ss.android.ugc.aweme.main.g.a.f54773a, true, 58172, new Class[]{View.class, Resources.class}, Void.TYPE);
            } else {
                LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) view4.getLayoutParams();
                layoutParams6.height = resources4.getDimensionPixelSize(C0906R.dimen.hu);
                view4.setLayoutParams(layoutParams6);
            }
            View b3 = b(view);
            if (PatchProxy.isSupport(new Object[]{b3}, null, com.ss.android.ugc.aweme.main.g.a.f54773a, true, 58171, new Class[]{View.class}, Void.TYPE)) {
                Object[] objArr9 = {b3};
                Object[] objArr10 = objArr9;
                PatchProxy.accessDispatch(objArr10, null, com.ss.android.ugc.aweme.main.g.a.f54773a, true, 58171, new Class[]{View.class}, Void.TYPE);
            } else {
                b3.setVisibility(8);
            }
            LinearLayout linearLayout2 = this.mFlSerach;
            Resources resources5 = getResources();
            if (PatchProxy.isSupport(new Object[]{linearLayout2, resources5}, null, com.ss.android.ugc.aweme.main.g.a.f54773a, true, 58173, new Class[]{View.class, Resources.class}, Void.TYPE)) {
                Object[] objArr11 = {linearLayout2, resources5};
                Object[] objArr12 = objArr11;
                PatchProxy.accessDispatch(objArr12, null, com.ss.android.ugc.aweme.main.g.a.f54773a, true, 58173, new Class[]{View.class, Resources.class}, Void.TYPE);
            } else {
                RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) linearLayout2.getLayoutParams();
                layoutParams7.addRule(11, 0);
                layoutParams7.addRule(9);
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams7.addRule(21, 0);
                    layoutParams7.addRule(20);
                }
                com.ss.android.ugc.aweme.main.g.a.a(resources5.getDimensionPixelSize(C0906R.dimen.hz), layoutParams7);
                com.ss.android.ugc.aweme.main.g.a.b(0, layoutParams7);
                linearLayout2.setLayoutParams(layoutParams7);
                ImageView imageView2 = (ImageView) linearLayout2.findViewById(C0906R.id.azc);
                if (imageView2 != null) {
                    imageView2.setImageResource(2130838973);
                }
                DmtTextView dmtTextView = (DmtTextView) linearLayout2.findViewById(C0906R.id.di0);
                if (dmtTextView != null) {
                    if (com.ss.android.ugc.aweme.main.g.a.a()) {
                        LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) dmtTextView.getLayoutParams();
                        com.ss.android.ugc.aweme.main.g.a.a(resources5.getDimensionPixelSize(C0906R.dimen.hy), layoutParams8);
                        dmtTextView.setLayoutParams(layoutParams8);
                        v.a((View) dmtTextView, 0);
                    } else {
                        v.a((View) dmtTextView, 8);
                    }
                }
            }
            ViewGroup viewGroup2 = this.mVgRightContainer;
            Resources resources6 = getResources();
            if (PatchProxy.isSupport(new Object[]{viewGroup2, resources6}, null, com.ss.android.ugc.aweme.main.g.a.f54773a, true, 58175, new Class[]{View.class, Resources.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewGroup2, resources6}, null, com.ss.android.ugc.aweme.main.g.a.f54773a, true, 58175, new Class[]{View.class, Resources.class}, Void.TYPE);
            } else {
                RelativeLayout.LayoutParams layoutParams9 = (RelativeLayout.LayoutParams) viewGroup2.getLayoutParams();
                layoutParams9.addRule(0, 0);
                layoutParams9.addRule(11);
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams9.addRule(16, 0);
                    layoutParams9.addRule(21);
                }
                com.ss.android.ugc.aweme.main.g.a.b(resources6.getDimensionPixelSize(C0906R.dimen.hz), layoutParams9);
                com.ss.android.ugc.aweme.main.g.a.a(0, layoutParams9);
                viewGroup2.setLayoutParams(layoutParams9);
                AnimationImageView animationImageView = (AnimationImageView) viewGroup2.findViewById(C0906R.id.azf);
                if (animationImageView != null) {
                    LinearLayout.LayoutParams layoutParams10 = (LinearLayout.LayoutParams) animationImageView.getLayoutParams();
                    layoutParams10.width = u.a(24.0d);
                    layoutParams10.height = u.a(24.0d);
                    animationImageView.setLayoutParams(layoutParams10);
                    animationImageView.setPadding(0, 0, 0, 0);
                    if (com.ss.android.ugc.aweme.main.g.a.a()) {
                        i3 = 2130838961;
                    } else {
                        i3 = 2130838960;
                    }
                    animationImageView.setImageResource(i3);
                }
            }
            HotRightSearchGuideView hotRightSearchGuideView2 = this.mHotRightSearchGuideView;
            if (PatchProxy.isSupport(new Object[]{hotRightSearchGuideView2}, null, com.ss.android.ugc.aweme.main.g.a.f54773a, true, 58174, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hotRightSearchGuideView2}, null, com.ss.android.ugc.aweme.main.g.a.f54773a, true, 58174, new Class[]{View.class}, Void.TYPE);
                return;
            }
            FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) hotRightSearchGuideView2.getLayoutParams();
            layoutParams11.gravity = 8388627;
            com.ss.android.ugc.aweme.main.g.a.a(layoutParams11.rightMargin, layoutParams11);
            com.ss.android.ugc.aweme.main.g.a.b(0, layoutParams11);
            hotRightSearchGuideView2.setLayoutParams(layoutParams11);
        }
    }

    @MeasureFunction
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup2, bundle}, this, f3515a, false, 57232, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup2, bundle}, this, f3515a, false, 57232, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        MainLooperOptService mainLooperOptService = (MainLooperOptService) com.ss.android.ugc.aweme.lego.a.i.a(MainLooperOptService.class);
        mainLooperOptService.updateRootView(viewGroup2);
        mainLooperOptService.updateState(MainLooperOptService.a.WATCH_WINDOW_FOCUS_CHANGE);
        com.ss.android.ugc.aweme.requestcombine.a.f63567e.a((com.ss.android.ugc.aweme.requestcombine.b) this);
        return ((com.ss.android.ugc.aweme.legoImp.inflate.o) com.ss.android.ugc.aweme.lego.a.i.b(com.ss.android.ugc.aweme.legoImp.inflate.o.class)).a(getContext(), (int) C0906R.layout.fragment_main_new);
    }
}

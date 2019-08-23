package com.ss.android.ugc.aweme.main;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImp.inflate.n;
import com.ss.android.ugc.aweme.main.base.HomeViewPager;
import com.ss.android.ugc.aweme.main.base.TabAlphaController;
import com.ss.android.ugc.aweme.main.base.TabChangeManager;
import com.ss.android.ugc.aweme.main.base.h;
import com.ss.android.ugc.aweme.main.base.mainpage.CommonPageFragment;
import com.ss.android.ugc.aweme.main.base.mainpage.MainPagerAdapter;
import com.ss.android.ugc.aweme.main.base.transforms.StackTransformer;
import com.ss.android.ugc.aweme.main.c.i;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.story.IStoryRecordService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordViewModel;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 B2\u00020\u0001:\u0001BB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0007J\b\u0010)\u001a\u00020&H\u0003J\u0006\u0010*\u001a\u00020\u0006J\b\u0010+\u001a\u00020\u0006H\u0016J&\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u000103H\u0017J\b\u00104\u001a\u00020&H\u0016J\u001a\u00105\u001a\u00020&2\u0006\u00106\u001a\u00020-2\b\u00102\u001a\u0004\u0018\u000103H\u0017J\b\u00107\u001a\u00020&H\u0002J\b\u00108\u001a\u00020&H\u0002J\u000e\u00109\u001a\u00020&2\u0006\u0010:\u001a\u00020\u0006J\u0010\u0010;\u001a\u00020&2\u0006\u0010<\u001a\u00020\u0006H\u0016J\b\u0010=\u001a\u00020\u0006H\u0002J\u0006\u0010>\u001a\u00020&J\u0010\u0010?\u001a\u00020&2\u0006\u0010'\u001a\u00020@H\u0007J\b\u0010A\u001a\u00020&H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006C"}, d2 = {"Lcom/ss/android/ugc/aweme/main/HomeFragment;", "Lcom/ss/android/ugc/aweme/main/base/mainpage/CommonPageFragment;", "()V", "currentFragmentTag", "", "isMainPage", "", "()Z", "mFragments", "Ljava/util/ArrayList;", "Landroid/support/v4/app/Fragment;", "mHandler", "Landroid/os/Handler;", "mHomeViewPager", "Lcom/ss/android/ugc/aweme/main/base/HomeViewPager;", "getMHomeViewPager$main_douyinCnRelease", "()Lcom/ss/android/ugc/aweme/main/base/HomeViewPager;", "setMHomeViewPager$main_douyinCnRelease", "(Lcom/ss/android/ugc/aweme/main/base/HomeViewPager;)V", "mainPageFragment", "Lcom/ss/android/ugc/aweme/main/MainPageFragment;", "getMainPageFragment", "()Lcom/ss/android/ugc/aweme/main/MainPageFragment;", "pageScrollSate", "", "panelStateViewModel", "Lcom/ss/android/ugc/aweme/share/viewmodel/FeedPanelStateViewModel;", "getPanelStateViewModel", "()Lcom/ss/android/ugc/aweme/share/viewmodel/FeedPanelStateViewModel;", "setPanelStateViewModel", "(Lcom/ss/android/ugc/aweme/share/viewmodel/FeedPanelStateViewModel;)V", "storyData", "Landroid/arch/lifecycle/MutableLiveData;", "getStoryData", "()Landroid/arch/lifecycle/MutableLiveData;", "setStoryData", "(Landroid/arch/lifecycle/MutableLiveData;)V", "closeStoryPublish", "", "event", "Lcom/ss/android/ugc/aweme/main/event/CloseStoryRecordEvent;", "initViewPager", "isMyProfileTabCurrent", "isRegisterEventBus", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "registerKeyDownListener", "registerScrollableStateChanged", "setCanScroll", "scroll", "setUserVisibleHint", "isVisibleToUser", "shouldShowStoryActivityDialog", "toMainPageFragment", "turnStoryPublish", "Lcom/ss/android/ugc/aweme/main/event/TurnStoryRecordEvent;", "updateHomeViewPagerScrollState", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class HomeFragment extends CommonPageFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3509a;
    public static final a h = new a((byte) 0);
    private static final String j = HomeFragment.class.getName();
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public HomeViewPager f3510b;

    /* renamed from: c  reason: collision with root package name */
    public String f3511c = "HOME";

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<Fragment> f3512d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public int f3513e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public FeedPanelStateViewModel f3514f;
    @Nullable
    public MutableLiveData<Boolean> g;
    private final Handler i = new Handler();
    private HashMap k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/main/HomeFragment$Companion;", "", "()V", "DELAY_50_MS", "", "TAG", "", "kotlin.jvm.PlatformType", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54128a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HomeFragment f54129b;

        b(HomeFragment homeFragment) {
            this.f54129b = homeFragment;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f54128a, false, 57078, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f54128a, false, 57078, new Class[0], Void.TYPE);
                return;
            }
            HomeViewPager homeViewPager = this.f54129b.f3510b;
            if (homeViewPager != null) {
                homeViewPager.setCurrentItem(0);
            }
            FragmentActivity activity = this.f54129b.getActivity();
            if (activity != null) {
                ((MainActivity) activity).hideNotificationCountView();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainActivity");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "toFragmentTag", "", "kotlin.jvm.PlatformType", "lastFragmentTag", "isForcedRefreshView", "", "onTabChanged"}, k = 3, mv = {1, 1, 15})
    static final class c implements com.ss.android.ugc.aweme.main.base.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54130a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HomeFragment f54131b;

        c(HomeFragment homeFragment) {
            this.f54131b = homeFragment;
        }

        public final void onTabChanged(String str, String str2, boolean z) {
            String str3;
            if (PatchProxy.isSupport(new Object[]{str, str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f54130a, false, 57080, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, str2, Byte.valueOf(z)}, this, f54130a, false, 57080, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            HomeFragment homeFragment = this.f54131b;
            if (str == null) {
                str3 = "";
            } else {
                str3 = str;
            }
            homeFragment.f3511c = str3;
            this.f54131b.e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "kotlin.jvm.PlatformType", "onKeyDown"}, k = 3, mv = {1, 1, 15})
    static final class d implements com.ss.android.ugc.aweme.base.activity.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54132a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HomeFragment f54133b;

        d(HomeFragment homeFragment) {
            this.f54133b = homeFragment;
        }

        public final boolean a(int i, KeyEvent keyEvent) {
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), keyEvent}, this, f54132a, false, 57081, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), keyEvent}, this, f54132a, false, 57081, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
            }
            HomeViewPager homeViewPager = this.f54133b.f3510b;
            if (homeViewPager != null) {
                if (this.f54133b.f3512d.size() <= 1) {
                    z = false;
                }
                if (!z) {
                    homeViewPager = null;
                }
                if (homeViewPager != null) {
                    IStoryRecordService.IStoryRecordFragment convertFragment = ((IAVService) ServiceManager.get().getService(IAVService.class)).storyRecordService().convertFragment(this.f54133b.f3512d.get(0));
                    if (keyEvent == null) {
                        Intrinsics.throwNpe();
                    }
                    return convertFragment.keyDown(i, keyEvent);
                }
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "scrollable", "", "onChanged", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
    static final class e<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54134a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HomeFragment f54135b;

        e(HomeFragment homeFragment) {
            this.f54135b = homeFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{bool}, this, f54134a, false, 57082, new Class[]{Boolean.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bool}, this, f54134a, false, 57082, new Class[]{Boolean.class}, Void.TYPE);
                return;
            }
            HomeViewPager homeViewPager = this.f54135b.f3510b;
            if (homeViewPager != null && this.f54135b.f3513e == 0) {
                if (!Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE) || (!TextUtils.equals("HOME", this.f54135b.f3511c) && !TextUtils.equals("FOLLOW", this.f54135b.f3511c) && homeViewPager.getCurrentItem() != 0)) {
                    z = false;
                }
                homeViewPager.setCanScroll(z);
            }
        }
    }

    public final boolean isRegisterEventBus() {
        return true;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f3509a, false, 57069, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3509a, false, 57069, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3510b != null) {
            HomeViewPager homeViewPager = this.f3510b;
            if (homeViewPager != null) {
                homeViewPager.setCurrentItem(1, true);
            }
        }
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3509a, false, 57075, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3509a, false, 57075, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.i.removeCallbacksAndMessages(null);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f3509a, false, 57077, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3509a, false, 57077, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null) {
            this.k.clear();
        }
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f3509a, false, 57060, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3509a, false, 57060, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f3510b != null) {
            HomeViewPager homeViewPager = this.f3510b;
            if (homeViewPager != null && homeViewPager.getChildCount() == 1) {
                return true;
            }
            HomeViewPager homeViewPager2 = this.f3510b;
            if (homeViewPager2 == null || homeViewPager2.getCurrentItem() != 1) {
                return false;
            }
            return true;
        }
        return false;
    }

    @NotNull
    public final MainPageFragment b() {
        if (PatchProxy.isSupport(new Object[0], this, f3509a, false, 57061, new Class[0], MainPageFragment.class)) {
            return (MainPageFragment) PatchProxy.accessDispatch(new Object[0], this, f3509a, false, 57061, new Class[0], MainPageFragment.class);
        } else if (this.f3512d.size() == 1) {
            Fragment fragment = this.f3512d.get(0);
            if (fragment != null) {
                return (MainPageFragment) fragment;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainPageFragment");
        } else {
            Fragment fragment2 = this.f3512d.get(1);
            if (fragment2 != null) {
                return (MainPageFragment) fragment2;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainPageFragment");
        }
    }

    public final boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f3509a, false, 57066, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3509a, false, 57066, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!(this.f3510b == null || this.f3512d == null)) {
            HomeViewPager homeViewPager = this.f3510b;
            if (homeViewPager == null) {
                Intrinsics.throwNpe();
            }
            if (homeViewPager.getCurrentItem() < this.f3512d.size()) {
                ArrayList<Fragment> arrayList = this.f3512d;
                HomeViewPager homeViewPager2 = this.f3510b;
                if (homeViewPager2 == null) {
                    Intrinsics.throwNpe();
                }
                Fragment fragment = arrayList.get(homeViewPager2.getCurrentItem());
                Intrinsics.checkExpressionValueIsNotNull(fragment, "mFragments[mHomeViewPager!!.getCurrentItem()]");
                Fragment fragment2 = fragment;
                if (!(fragment2 instanceof MainPageFragment)) {
                    fragment2 = null;
                }
                MainPageFragment mainPageFragment = (MainPageFragment) fragment2;
                if (mainPageFragment != null) {
                    z = mainPageFragment.isMyProfileTabCurrent();
                }
                return z;
            }
        }
        return false;
    }

    public final void e() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f3509a, false, 57071, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3509a, false, 57071, new Class[0], Void.TYPE);
        } else if (this.f3510b != null) {
            if (!MainPageExperimentHelper.l()) {
                HomeViewPager homeViewPager = this.f3510b;
                if (homeViewPager != null) {
                    homeViewPager.setCanScroll(false);
                }
            } else if (com.ss.android.ugc.aweme.main.g.a.c()) {
                HomeViewPager homeViewPager2 = this.f3510b;
                if (homeViewPager2 != null) {
                    homeViewPager2.setCanScroll(false);
                }
            } else {
                if (AbTestManager.a().bG() || com.ss.android.ugc.aweme.discover.helper.b.i()) {
                    HomeViewPager homeViewPager3 = this.f3510b;
                    if (homeViewPager3 != null) {
                        homeViewPager3.setCanScroll(TextUtils.equals("FOLLOW", this.f3511c));
                    }
                } else {
                    HomeViewPager homeViewPager4 = this.f3510b;
                    if (homeViewPager4 != null) {
                        if (TextUtils.equals("HOME", this.f3511c) || TextUtils.equals("FOLLOW", this.f3511c)) {
                            z = true;
                        }
                        homeViewPager4.setCanScroll(z);
                    }
                }
            }
        }
    }

    @Subscribe
    public final void closeStoryPublish(@NotNull com.ss.android.ugc.aweme.main.c.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3509a, false, 57068, new Class[]{com.ss.android.ugc.aweme.main.c.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3509a, false, 57068, new Class[]{com.ss.android.ugc.aweme.main.c.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar, "event");
        if (this.f3510b != null) {
            HomeViewPager homeViewPager = this.f3510b;
            if (homeViewPager != null && homeViewPager.getCurrentItem() == 0) {
                HomeViewPager homeViewPager2 = this.f3510b;
                if (homeViewPager2 != null) {
                    homeViewPager2.setCurrentItem(1, aVar.f54677a);
                }
            }
        }
    }

    public final void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3509a, false, 57064, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3509a, false, 57064, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        TabAlphaController.a().a(z);
    }

    @Subscribe
    public final void turnStoryPublish(@NotNull i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f3509a, false, 57067, new Class[]{i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar}, this, f3509a, false, 57067, new Class[]{i.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(iVar, "event");
        if (this.f3512d.size() > 1) {
            Fragment fragment = this.f3512d.get(0);
            Intrinsics.checkExpressionValueIsNotNull(fragment, "mFragments[0]");
            Bundle arguments = fragment.getArguments();
            if (arguments != null) {
                arguments.putString("enter_from", iVar.f54695a.getStringExtra("enter_from"));
                arguments.putString("enter_method", iVar.f54695a.getStringExtra("enter_method"));
                arguments.putString("creation_id", iVar.f54695a.getStringExtra("creation_id"));
            }
            HomeViewPager homeViewPager = this.f3510b;
            if (homeViewPager != null) {
                homeViewPager.setCurrentItem(0, true);
            }
        }
    }

    @MeasureFunction
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        HomeViewPager homeViewPager;
        int i2 = 1;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f3509a, false, 57063, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f3509a, false, 57063, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        IStoryRecordService storyRecordService = ((IAVService) ServiceManager.get().getService(IAVService.class)).storyRecordService();
        Fragment findFragmentByTag = getChildFragmentManager().findFragmentByTag(MainPagerAdapter.a((int) C0906R.id.duu, 1));
        if (findFragmentByTag == null) {
            findFragmentByTag = MainPageFragment.newInstance();
        }
        Fragment findFragmentByTag2 = getChildFragmentManager().findFragmentByTag(MainPagerAdapter.a((int) C0906R.id.duu, 0));
        if (findFragmentByTag2 == null) {
            findFragmentByTag2 = storyRecordService.create(new Bundle()).asFragment();
        }
        this.f3512d.add(findFragmentByTag2);
        this.f3512d.add(findFragmentByTag);
        MutableLiveData<Boolean> mutableLiveData = null;
        if (PatchProxy.isSupport(new Object[0], this, f3509a, false, 57065, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3509a, false, 57065, new Class[0], Void.TYPE);
        } else {
            View view2 = getView();
            if (view2 != null) {
                homeViewPager = (HomeViewPager) view2.findViewById(C0906R.id.duu);
            } else {
                homeViewPager = null;
            }
            this.f3510b = homeViewPager;
            HomePageAdapter homePageAdapter = new HomePageAdapter(getChildFragmentManager(), this.f3512d);
            new h(getActivity()).a(this.f3510b);
            HomeViewPager homeViewPager2 = this.f3510b;
            if (homeViewPager2 != null) {
                homeViewPager2.setPageTransformer(false, new StackTransformer(), 0);
            }
            HomeViewPager homeViewPager3 = this.f3510b;
            if (homeViewPager3 != null) {
                homeViewPager3.setAdapter(homePageAdapter);
            }
            HomeViewPager homeViewPager4 = this.f3510b;
            if (homeViewPager4 != null) {
                homeViewPager4.setOverScrollMode(2);
            }
            HomeViewPager homeViewPager5 = this.f3510b;
            if (homeViewPager5 != null) {
                homeViewPager5.setCanScroll(true);
            }
            HomeViewPager homeViewPager6 = this.f3510b;
            if (homeViewPager6 != null) {
                if (this.f3512d.size() == 1) {
                    i2 = 0;
                }
                homeViewPager6.setCurrentItem(i2);
            }
            if (getActivity() instanceof MainActivity) {
                FragmentActivity activity = getActivity();
                if (activity == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainActivity");
                } else if (((MainActivity) activity).isSplashToStoryCamera()) {
                    this.i.postDelayed(new b(this), 50);
                }
            }
            HomeViewPager homeViewPager7 = this.f3510b;
            if (homeViewPager7 != null) {
                homeViewPager7.addOnPageChangeListener(new HomeFragment$initViewPager$2(this));
            }
            TabChangeManager.a(getActivity()).a((com.ss.android.ugc.aweme.main.base.a) new c(this));
        }
        if (PatchProxy.isSupport(new Object[0], this, f3509a, false, 57072, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3509a, false, 57072, new Class[0], Void.TYPE);
        } else if (getActivity() != null) {
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                LiveData liveData = ((StoryRecordViewModel) ViewModelProviders.of((FragmentActivity) (AppCompatActivity) activity2).get(StoryRecordViewModel.class)).f73849b;
                FragmentActivity activity3 = getActivity();
                if (activity3 != null) {
                    liveData.observe((AppCompatActivity) activity3, new e(this));
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f3509a, false, 57073, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3509a, false, 57073, new Class[0], Void.TYPE);
        } else if (getActivity() != null) {
            FragmentActivity activity4 = getActivity();
            if (activity4 != null) {
                ((MainActivity) activity4).registerActivityOnKeyDownListener(new d(this));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainActivity");
            }
        }
        if (getActivity() != null && (getActivity() instanceof FragmentActivity)) {
            FragmentActivity activity5 = getActivity();
            if (activity5 != null) {
                this.f3514f = (FeedPanelStateViewModel) ViewModelProviders.of(activity5).get(FeedPanelStateViewModel.class);
                FeedPanelStateViewModel feedPanelStateViewModel = this.f3514f;
                if (feedPanelStateViewModel != null) {
                    mutableLiveData = feedPanelStateViewModel.f65313d;
                }
                this.g = mutableLiveData;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
        }
    }

    @Nullable
    @MeasureFunction
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup, bundle}, this, f3509a, false, 57062, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup, bundle}, this, f3509a, false, 57062, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        return ((n) com.ss.android.ugc.aweme.lego.a.i.b(n.class)).a(getContext(), (int) C0906R.layout.fragment_home_main);
    }
}

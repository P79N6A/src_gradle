package com.ss.android.ugc.aweme.discover.ui;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.a.g;
import com.ss.android.ugc.aweme.discover.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.discover.activity.a;
import com.ss.android.ugc.aweme.discover.base.c;
import com.ss.android.ugc.aweme.discover.helper.b;
import com.ss.android.ugc.aweme.discover.helper.f;
import com.ss.android.ugc.aweme.discover.model.AdDefaultSearchStruct;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.ui.DiscoverFragment;
import com.ss.android.ugc.aweme.discover.ui.HotSearchWordsFlipperView;
import com.ss.android.ugc.aweme.discover.ui.SearchScanView;
import com.ss.android.ugc.aweme.feed.f.ab;
import com.ss.android.ugc.aweme.feed.f.o;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainPageExperimentHelper;
import com.ss.android.ugc.aweme.newfollow.util.ScreenBroadcastReceiver;
import com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.u.ao;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.dq;
import com.ss.android.ugc.aweme.utils.ex;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;

public class HotSearchAndDiscoveryFragment2 extends BaseDiscoveryAndSearchFragment implements a, ScreenBroadcastReceiver.a {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f3052f;
    protected long g = -1;
    public boolean h;
    public LogPbBean i;
    public HotSearchWordsFlipperView.ItemUnion j;
    private c k;
    private com.ss.android.ugc.aweme.discover.helper.a l;
    @BindView(2131495675)
    LoftNestedRefreshLayout loftNestedRefreshLayout;
    private boolean m;
    @BindView(2131494651)
    HotSearchWordsFlipperView mHotSearchFlipperView;
    @BindView(2131493217)
    ImageView mRightBackBtn;
    @BindView(2131496742)
    View mRightSearchView;
    @BindView(2131496775)
    View mSearchContainer;
    @BindView(2131496974)
    SearchScanView mSearchScanView;
    @BindView(2131496975)
    SearchScanView mSearchScanViewRight;
    @BindView(2131497677)
    ViewGroup mTopStatus;
    private boolean n;
    private String o;
    private String p;
    private ScreenBroadcastReceiver q;
    private boolean r;
    private boolean s;
    private Context t;

    public final int f() {
        return 1;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void o() {
        KeyboardUtils.c(this.mIntermediateView);
        r();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3052f, false, 37635, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3052f, false, 37635, new Class[0], Void.TYPE);
            return;
        }
        if (this.mSearchInputView != null) {
            KeyboardUtils.c(this.mSearchInputView);
            this.mSearchInputView.setCursorVisible(false);
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f3052f, false, 37641, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3052f, false, 37641, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.b.a.a.a.a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f42915a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f42915a, false, 37663, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f42915a, false, 37663, new Class[0], Void.TYPE);
                    return;
                }
                if (HotSearchAndDiscoveryFragment2.this.mSearchInputView != null) {
                    HotSearchAndDiscoveryFragment2.this.mSearchInputView.setText("");
                    HotSearchAndDiscoveryFragment2.this.mSearchInputView.setCursorVisible(false);
                    HotSearchAndDiscoveryFragment2.this.mSearchInputView.clearFocus();
                }
            }
        }, 200);
    }

    public final int e() {
        if (PatchProxy.isSupport(new Object[0], this, f3052f, false, 37605, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3052f, false, 37605, new Class[0], Integer.TYPE)).intValue();
        } else if (com.ss.android.g.a.a()) {
            return C0906R.layout.o5;
        } else {
            return C0906R.layout.o6;
        }
    }

    @Nullable
    public Context getContext() {
        if (PatchProxy.isSupport(new Object[0], this, f3052f, false, 37625, new Class[0], Context.class)) {
            return (Context) PatchProxy.accessDispatch(new Object[0], this, f3052f, false, 37625, new Class[0], Context.class);
        } else if (this.t != null) {
            return this.t;
        } else {
            return super.getContext();
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f3052f, false, 37623, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3052f, false, 37623, new Class[0], Void.TYPE);
            return;
        }
        KeyboardUtils.c(this.mSearchInputView);
        r();
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f3052f, false, 37636, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3052f, false, 37636, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        this.q.a();
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f3052f, false, 37628, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3052f, false, 37628, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        this.mStatusActive = false;
        if (this.m) {
            s();
        }
        this.n = false;
    }

    private boolean p() {
        if (PatchProxy.isSupport(new Object[0], this, f3052f, false, 37613, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3052f, false, 37613, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (MainPageExperimentHelper.o() || com.ss.android.ugc.aweme.main.g.a.b()) {
            return false;
        } else {
            if (this.s || !com.ss.android.g.a.a()) {
                return true;
            }
            return false;
        }
    }

    private boolean q() {
        if (PatchProxy.isSupport(new Object[0], this, f3052f, false, 37614, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3052f, false, 37614, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (MainPageExperimentHelper.o() || com.ss.android.ugc.aweme.main.g.a.b()) {
            return true;
        } else {
            if (this.s || !com.ss.android.g.a.a()) {
                return false;
            }
            return true;
        }
    }

    private void r() {
        if (PatchProxy.isSupport(new Object[0], this, f3052f, false, 37630, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3052f, false, 37630, new Class[0], Void.TYPE);
        } else if (!d()) {
            if (getActivity() instanceof MainActivity) {
                ((MainActivity) getActivity()).onKeyBack();
            } else {
                getActivity().onBackPressed();
            }
        }
    }

    private void s() {
        if (PatchProxy.isSupport(new Object[0], this, f3052f, false, 37632, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3052f, false, 37632, new Class[0], Void.TYPE);
            return;
        }
        if (this.g > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.g;
            if (currentTimeMillis > 0) {
                new ao().b("discovery").a(String.valueOf(currentTimeMillis)).e();
            }
            this.g = -1;
        }
    }

    private void t() {
        if (PatchProxy.isSupport(new Object[0], this, f3052f, false, 37640, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3052f, false, 37640, new Class[0], Void.TYPE);
            return;
        }
        this.l.b();
        c(1);
        this.mSearchInputView.setText("");
        this.mSearchInputView.setCursorVisible(false);
        a(false);
        this.k.a(n());
    }

    public final boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f3052f, false, 37629, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3052f, false, 37629, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!isViewValid()) {
            return false;
        } else {
            if (this.mSearchInputView != null) {
                this.mSearchInputView.setText("");
                this.mSearchInputView.setCursorVisible(false);
                this.mSearchInputView.clearFocus();
            }
            if (n() == 1) {
                return false;
            }
            if (this.l != null) {
                this.l.b();
            }
            c(1);
            a(true);
            this.k.a(n());
            this.k.onHiddenChanged(false);
            if (b.k()) {
                this.f3048c.a();
            }
            return true;
        }
    }

    public final void g() {
        DiscoverFragment.a aVar;
        if (PatchProxy.isSupport(new Object[0], this, f3052f, false, 37620, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3052f, false, 37620, new Class[0], Void.TYPE);
            return;
        }
        c(1);
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        if (com.ss.android.g.a.a()) {
            aVar = DiscoverFragment.a.DISCOVER_LEFT;
        } else {
            aVar = DiscoverFragment.a.HOT_SEARCH_WITH_DISCOVER;
        }
        this.k = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getDiscoverFragment(aVar, false);
        this.loftNestedRefreshLayout.a((com.ss.android.ugc.aweme.commercialize.loft.b.b) new com.ss.android.ugc.aweme.commercialize.loft.b.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f42913a;

            public final void b() {
            }

            public final void d() {
            }

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f42913a, false, 37657, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f42913a, false, 37657, new Class[0], Void.TYPE);
                    return;
                }
                if (HotSearchAndDiscoveryFragment2.this.mTopStatus != null) {
                    HotSearchAndDiscoveryFragment2.this.mTopStatus.animate().alpha(0.0f).setDuration(200).setInterpolator(new LinearInterpolator()).withEndAction(new z(this)).start();
                }
                if (HotSearchAndDiscoveryFragment2.this.mGapStatusBar != null) {
                    HotSearchAndDiscoveryFragment2.this.mGapStatusBar.animate().alpha(0.0f).setDuration(200).setInterpolator(new LinearInterpolator()).withEndAction(new aa(this)).start();
                }
            }

            public final void c() {
                if (PatchProxy.isSupport(new Object[0], this, f42913a, false, 37658, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f42913a, false, 37658, new Class[0], Void.TYPE);
                    return;
                }
                if (!(HotSearchAndDiscoveryFragment2.this.mTopStatus == null || HotSearchAndDiscoveryFragment2.this.mTopStatus.getVisibility() == 0 || HotSearchAndDiscoveryFragment2.this.mTopStatus == null)) {
                    HotSearchAndDiscoveryFragment2.this.mTopStatus.animate().alpha(1.0f).setDuration(200).setInterpolator(new LinearInterpolator()).withStartAction(new ab(this)).start();
                }
                if (!(HotSearchAndDiscoveryFragment2.this.mGapStatusBar == null || HotSearchAndDiscoveryFragment2.this.mGapStatusBar.getVisibility() == 0)) {
                    HotSearchAndDiscoveryFragment2.this.mGapStatusBar.animate().alpha(1.0f).setDuration(200).setInterpolator(new LinearInterpolator()).withStartAction(new ac(this)).start();
                }
            }
        });
        this.k.a(this.loftNestedRefreshLayout);
        this.k.a(n());
        beginTransaction.replace(C0906R.id.aic, (Fragment) this.k);
        beginTransaction.commitAllowingStateLoss();
        this.k.a(false);
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f3052f, false, 37621, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3052f, false, 37621, new Class[0], Void.TYPE);
            return;
        }
        if (n() == 1) {
            this.l.a();
        }
        SearchIntermediateView searchIntermediateView = this.mIntermediateView;
        if (PatchProxy.isSupport(new Object[0], searchIntermediateView, SearchIntermediateView.f43001a, false, 37971, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], searchIntermediateView, SearchIntermediateView.f43001a, false, 37971, new Class[0], Void.TYPE);
        } else {
            searchIntermediateView.a(false);
        }
        c(3);
        this.k.a(n());
        this.k.onHiddenChanged(true);
    }

    public final void K_() {
        if (PatchProxy.isSupport(new Object[0], this, f3052f, false, 37634, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3052f, false, 37634, new Class[0], Void.TYPE);
            return;
        }
        if (getUserVisibleHint() && this.mStatusActive && !this.n && this.m) {
            String charSequence = this.mSearchInputView.getHint().toString();
            if (!TextUtils.isEmpty(charSequence) && !TextUtils.equals(charSequence, i()) && this.i != null) {
                r.a("search_default", (Map) d.a().a("action_type", "show").a("search_keyword", charSequence).a("log_pb", new Gson().toJson((Object) this.i)).f34114b);
            }
            this.n = true;
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3052f, false, 37627, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3052f, false, 37627, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.m) {
            this.g = System.currentTimeMillis();
        }
        if (this.r) {
            this.r = false;
            t();
        }
        if (getUserVisibleHint() && !dq.a() && this.m) {
            String charSequence = this.mSearchInputView.getHint().toString();
            if (!TextUtils.isEmpty(charSequence) && !TextUtils.equals(charSequence, i()) && this.i != null) {
                r.a("search_default", (Map) d.a().a("action_type", "show").a("search_keyword", charSequence).a("log_pb", new Gson().toJson((Object) this.i)).f34114b);
            }
            this.n = true;
        }
        if (n() == 1 && b.k()) {
            this.f3048c.a();
        }
    }

    public void onAttach(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f3052f, false, 37624, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f3052f, false, 37624, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        super.onAttach(context);
        this.t = context2;
    }

    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f3052f, false, 37604, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f3052f, false, 37604, new Class[]{Bundle.class}, Void.TYPE);
        } else if (bundle2 != null) {
            this.s = bundle2.getBoolean("i18n_tab_mode", false);
        }
    }

    public final void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3052f, false, 37611, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3052f, false, 37611, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.c(i2);
        if (SearchStateViewModel.isSearchIntermediate(i2)) {
            bg.a(new ab(8));
        } else {
            bg.a(new ab(0));
        }
    }

    @Subscribe
    public void onSearchResultOpenedEvent(g gVar) {
        if (PatchProxy.isSupport(new Object[]{gVar}, this, f3052f, false, 37639, new Class[]{g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar}, this, f3052f, false, 37639, new Class[]{g.class}, Void.TYPE);
        } else if (n() != 1) {
            if (this.n) {
                t();
            } else {
                this.r = true;
            }
        }
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f3052f, false, 37622, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3052f, false, 37622, new Class[]{View.class}, Void.TYPE);
        } else if (!ex.c() && this.mSearchInputView != null) {
            if (n() == 1) {
                r.a("enter_search", (Map) d.a().a("enter_from", "discovery").f34114b);
            }
            this.mSearchInputView.setCursorVisible(true);
            KeyboardUtils.b(this.mSearchInputView);
            if (TextUtils.isEmpty(this.mSearchInputView.getText().toString())) {
                l();
            } else {
                m();
            }
        }
    }

    public final void b(SearchResultParam searchResultParam) {
        int i2;
        SearchResultParam searchResultParam2 = searchResultParam;
        if (PatchProxy.isSupport(new Object[]{searchResultParam2}, this, f3052f, false, 37626, new Class[]{SearchResultParam.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchResultParam2}, this, f3052f, false, 37626, new Class[]{SearchResultParam.class}, Void.TYPE);
        } else if ((!com.ss.android.g.a.a() || !ay.a(searchResultParam.getKeyword())) && getContext() != null) {
            SearchIntermediateView searchIntermediateView = this.mIntermediateView;
            if (PatchProxy.isSupport(new Object[]{searchResultParam2}, searchIntermediateView, SearchIntermediateView.f43001a, false, 37977, new Class[]{SearchResultParam.class}, Void.TYPE)) {
                SearchIntermediateView searchIntermediateView2 = searchIntermediateView;
                PatchProxy.accessDispatch(new Object[]{searchResultParam2}, searchIntermediateView2, SearchIntermediateView.f43001a, false, 37977, new Class[]{SearchResultParam.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(searchResultParam2, "param");
                if (searchIntermediateView.getVisibility() == 0 && (searchIntermediateView.f43005e instanceof TabIntermediateFragment)) {
                    Fragment fragment = searchIntermediateView.f43005e;
                    if (fragment != null) {
                        TabIntermediateFragment tabIntermediateFragment = (TabIntermediateFragment) fragment;
                        if (PatchProxy.isSupport(new Object[0], tabIntermediateFragment, TabIntermediateFragment.f43052a, false, 38110, new Class[0], Integer.TYPE)) {
                            i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], tabIntermediateFragment, TabIntermediateFragment.f43052a, false, 38110, new Class[0], Integer.TYPE)).intValue();
                        } else {
                            ViewPager viewPager = tabIntermediateFragment.f43054b;
                            if (viewPager == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("mViewPager");
                            }
                            i2 = viewPager.getCurrentItem();
                        }
                        searchResultParam2.setIntermediatePageIndex(i2);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.ui.TabIntermediateFragment");
                    }
                }
            }
            SearchResultActivity.a(getContext(), searchResultParam2);
        }
    }

    public void setUserVisibleHint(boolean z) {
        boolean z2;
        boolean z3 = true;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3052f, false, 37637, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3052f, false, 37637, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        if (isViewValid()) {
            boolean z4 = !z;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z4 ? (byte) 1 : 0)}, this, f3052f, false, 37638, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z4)}, this, f3052f, false, 37638, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (!(getActivity() == null || this.k == null || n() != 1)) {
                this.k.a(z4);
            }
            MutableLiveData<Boolean> mutableLiveData = this.f3047b.isVisibleToUser;
            if (!z4) {
                z2 = true;
            } else {
                z2 = false;
            }
            mutableLiveData.setValue(Boolean.valueOf(z2));
            if (z4) {
                z3 = false;
            }
            this.m = z3;
            if (this.m) {
                if (PatchProxy.isSupport(new Object[0], this, f3052f, false, 37631, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3052f, false, 37631, new Class[0], Void.TYPE);
                } else {
                    this.g = System.currentTimeMillis();
                }
                bg.a(new o());
                return;
            }
            s();
        }
    }

    public final void b(String str) {
        String str2;
        HotSearchWordsFlipperView.ItemUnion itemUnion;
        String str3;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{str}, this, f3052f, false, 37619, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3052f, false, 37619, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (TextUtils.isEmpty(str) && (n() == 1 || SearchStateViewModel.isSearchIntermediate(n()))) {
            str2 = this.mSearchInputView.getHint().toString();
            if (!TextUtils.isEmpty(str2) && !a(str2)) {
                if (b.k()) {
                    if (this.f3050e == null) {
                        str3 = "";
                    } else {
                        str3 = this.f3050e.getId();
                    }
                    r.a("trending_words_click", (Map) d.a().a("words_position", 0).a("words_source", "recom_search").a("words_content", str2).a("group_id", str3).f34114b);
                } else {
                    r.a("hot_search_keyword", (Map) d.a().a("action_type", "click").a("key_word", str2).a("key_word_type", "general_word").a("enter_from", "default_search_keyword").f34114b);
                }
                z = true;
                itemUnion = this.j;
                if (itemUnion != null && itemUnion.a() == 2) {
                    com.ss.android.ugc.aweme.commercialize.log.g.a((g.a) new y(this, itemUnion), itemUnion.f42929c.getAdData().getClickTrackUrlList(), true);
                    com.ss.android.ugc.aweme.commercialize.log.d.a().a("result_ad").b("hot_search_keyword_click").d("default_search_keyword").g(itemUnion.f42929c.getAdData().getLogExtra()).a(itemUnion.f42929c.getAdData().getCreativeId()).a(getContext());
                }
                String str4 = null;
                if (z && !b.k()) {
                    str4 = this.f3049d;
                }
                super.a(str2, str4, z);
            }
        }
        str2 = str;
        itemUnion = this.j;
        com.ss.android.ugc.aweme.commercialize.log.g.a((g.a) new y(this, itemUnion), itemUnion.f42929c.getAdData().getClickTrackUrlList(), true);
        com.ss.android.ugc.aweme.commercialize.log.d.a().a("result_ad").b("hot_search_keyword_click").d("default_search_keyword").g(itemUnion.f42929c.getAdData().getLogExtra()).a(itemUnion.f42929c.getAdData().getCreativeId()).a(getContext());
        String str42 = null;
        str42 = this.f3049d;
        super.a(str2, str42, z);
    }

    private void b(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f3052f, false, 37608, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f3052f, false, 37608, new Class[]{String.class, String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            a(str3, str4, true);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f3052f, false, 37609, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f3052f, false, 37609, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.q = new ScreenBroadcastReceiver(getContext());
        this.q.a(this);
        b(this.p, this.o);
        this.f3048c.f43226c.a(this, this, true);
    }

    public final void a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f3052f, false, 37607, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f3052f, false, 37607, new Class[]{String.class, String.class}, Void.TYPE);
        } else if (this.mSearchInputView == null) {
            this.p = str;
            this.o = str2;
        } else {
            b(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(String str, String str2, LogPbBean logPbBean) {
        this.i = logPbBean;
        a(str, str2, logPbBean);
    }

    public final void a(String str, String str2, LogPbBean logPbBean) {
        String str3 = str;
        String str4 = str2;
        LogPbBean logPbBean2 = logPbBean;
        if (PatchProxy.isSupport(new Object[]{str3, str4, logPbBean2}, this, f3052f, false, 37633, new Class[]{String.class, String.class, LogPbBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, logPbBean2}, this, f3052f, false, 37633, new Class[]{String.class, String.class, LogPbBean.class}, Void.TYPE);
            return;
        }
        if (!b.k() && getActivity() != null && !getActivity().isFinishing() && n() == 1 && !TextUtils.isEmpty(str) && !TextUtils.equals(str3, i()) && !TextUtils.equals(this.mSearchInputView.getHint().toString(), str3)) {
            r.a("search_default", (Map) d.a().a("action_type", "show").a("search_keyword", str3).a("log_pb", new Gson().toJson((Object) logPbBean2)).f34114b);
            this.mSearchInputView.setHint(str3);
            this.f3049d = str4;
            this.j = null;
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        SearchScanView searchScanView;
        ImageView imageView;
        if (PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup, bundle}, this, f3052f, false, 37606, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup, bundle}, this, f3052f, false, 37606, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f3052f, false, 37615, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3052f, false, 37615, new Class[0], Void.TYPE);
        } else {
            if (p()) {
                this.mSearchScanView.setVisibility(8);
                this.mSearchScanViewRight.setVisibility(0);
                this.mSearchScanViewRight.a();
            } else {
                this.mSearchScanViewRight.setVisibility(8);
                this.mSearchScanView.setVisibility(0);
                this.mSearchScanView.a();
            }
            AnonymousClass1 r0 = new SearchScanView.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f42905a;

                public final void b(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f42905a, false, 37650, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f42905a, false, 37650, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    QRCodePermissionActivity.a(HotSearchAndDiscoveryFragment2.this.getContext(), false);
                }

                public final void a(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f42905a, false, 37649, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f42905a, false, 37649, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    HotSearchAndDiscoveryFragment2.this.b(new SearchResultParam().setEnterFrom("normal_search").setSearchFrom(0));
                }
            };
            this.mSearchScanView.setOnInternalClickListener(r0);
            this.mSearchScanViewRight.setOnInternalClickListener(r0);
        }
        if (PatchProxy.isSupport(new Object[0], this, f3052f, false, 37616, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3052f, false, 37616, new Class[0], Void.TYPE);
        } else {
            if (!AbTestManager.a().as()) {
                this.f3047b.hotSearchLiveData.observe(this, new SearchStateViewModel.HotSearchListObserver().setListener(new v(this)));
            } else {
                this.f3047b.hotSearchLiveData.observe(this, new SearchStateViewModel.HotSearchListObserver().setListener(new SearchStateViewModel.IHotSearchListListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f42907a;

                    public final void onShowOperatedSearchWord(String str, String str2, LogPbBean logPbBean) {
                        String str3 = str;
                        String str4 = str2;
                        LogPbBean logPbBean2 = logPbBean;
                        if (PatchProxy.isSupport(new Object[]{str3, str4, logPbBean2}, this, f42907a, false, 37651, new Class[]{String.class, String.class, LogPbBean.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str3, str4, logPbBean2}, this, f42907a, false, 37651, new Class[]{String.class, String.class, LogPbBean.class}, Void.TYPE);
                            return;
                        }
                        HotSearchAndDiscoveryFragment2.this.i = logPbBean2;
                        HotSearchAndDiscoveryFragment2.this.h = true;
                        HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.dismiss();
                        HotSearchAndDiscoveryFragment2.this.a(str3, str4, logPbBean2);
                    }

                    public final void onHotSearchWordsFlipper(List<HotSearchItem> list, LogPbBean logPbBean, List<AdDefaultSearchStruct> list2) {
                        TextView textView;
                        LogPbBean logPbBean2 = logPbBean;
                        if (PatchProxy.isSupport(new Object[]{list, logPbBean2, list2}, this, f42907a, false, 37652, new Class[]{List.class, LogPbBean.class, List.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{list, logPbBean2, list2}, this, f42907a, false, 37652, new Class[]{List.class, LogPbBean.class, List.class}, Void.TYPE);
                            return;
                        }
                        HotSearchAndDiscoveryFragment2.this.i = logPbBean2;
                        HotSearchAndDiscoveryFragment2.this.h = false;
                        HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.setVisibility(0);
                        HotSearchAndDiscoveryFragment2.this.mSearchInputView.setHint("");
                        HotSearchWordsFlipperView hotSearchWordsFlipperView = HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView;
                        if (PatchProxy.isSupport(new Object[]{list, list2}, hotSearchWordsFlipperView, HotSearchWordsFlipperView.f42922a, false, 37679, new Class[]{List.class, List.class}, Void.TYPE)) {
                            HotSearchWordsFlipperView hotSearchWordsFlipperView2 = hotSearchWordsFlipperView;
                            PatchProxy.accessDispatch(new Object[]{list, list2}, hotSearchWordsFlipperView2, HotSearchWordsFlipperView.f42922a, false, 37679, new Class[]{List.class, List.class}, Void.TYPE);
                        } else if (CollectionUtils.isEmpty(list)) {
                            hotSearchWordsFlipperView.setVisibility(8);
                        } else {
                            if (hotSearchWordsFlipperView.isFlipping()) {
                                hotSearchWordsFlipperView.stopFlipping();
                            }
                            hotSearchWordsFlipperView.f42923b.clear();
                            for (HotSearchItem itemUnion : list) {
                                hotSearchWordsFlipperView.f42923b.add(new HotSearchWordsFlipperView.ItemUnion(itemUnion));
                            }
                            Collections.shuffle(hotSearchWordsFlipperView.f42923b);
                            if (list2 != null) {
                                for (AdDefaultSearchStruct next : list2) {
                                    hotSearchWordsFlipperView.f42923b.add(Math.max(0, Math.min(next.getPosition() - 1, hotSearchWordsFlipperView.f42923b.size())), new HotSearchWordsFlipperView.ItemUnion(next));
                                }
                            }
                            hotSearchWordsFlipperView.removeAllViews();
                            for (int i = 0; i < hotSearchWordsFlipperView.f42923b.size(); i++) {
                                HotSearchWordsFlipperView.ItemUnion itemUnion2 = hotSearchWordsFlipperView.f42923b.get(i);
                                if (PatchProxy.isSupport(new Object[]{itemUnion2}, hotSearchWordsFlipperView, HotSearchWordsFlipperView.f42922a, false, 37680, new Class[]{HotSearchWordsFlipperView.ItemUnion.class}, TextView.class)) {
                                    HotSearchWordsFlipperView hotSearchWordsFlipperView3 = hotSearchWordsFlipperView;
                                    textView = (TextView) PatchProxy.accessDispatch(new Object[]{itemUnion2}, hotSearchWordsFlipperView3, HotSearchWordsFlipperView.f42922a, false, 37680, new Class[]{HotSearchWordsFlipperView.ItemUnion.class}, TextView.class);
                                } else {
                                    TextView textView2 = new TextView(hotSearchWordsFlipperView.getContext());
                                    textView2.setSingleLine();
                                    textView2.setText(itemUnion2.b());
                                    textView2.setTextSize(1, (float) hotSearchWordsFlipperView.f42924c);
                                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                                    textView2.setTextColor(hotSearchWordsFlipperView.f42925d);
                                    textView2.setGravity(8388627);
                                    textView = textView2;
                                }
                                hotSearchWordsFlipperView.addView(textView, new FrameLayout.LayoutParams(-1, -1));
                            }
                            hotSearchWordsFlipperView.c();
                            hotSearchWordsFlipperView.startFlipping();
                        }
                    }
                }));
                getLifecycle().addObserver(this.mHotSearchFlipperView);
                this.f3047b.searchState.observe(this, new SearchStateViewModel.SearchObserver().setListener(new SearchStateViewModel.SearchStateListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f42909a;

                    public final void onPageHidden() {
                        if (PatchProxy.isSupport(new Object[0], this, f42909a, false, 37654, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f42909a, false, 37654, new Class[0], Void.TYPE);
                            return;
                        }
                        HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.b();
                    }

                    public final void onPageResume() {
                        if (PatchProxy.isSupport(new Object[0], this, f42909a, false, 37655, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f42909a, false, 37655, new Class[0], Void.TYPE);
                            return;
                        }
                        HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.a();
                    }

                    public final void onContentVisible(boolean z) {
                        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f42909a, false, 37653, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f42909a, false, 37653, new Class[]{Boolean.TYPE}, Void.TYPE);
                        } else if (!HotSearchAndDiscoveryFragment2.this.h) {
                            if (z) {
                                HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.a();
                                HotSearchAndDiscoveryFragment2.this.mSearchInputView.setHint("");
                                return;
                            }
                            HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.dismiss();
                            if (TextUtils.isEmpty(HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.getCurrentDisplayedWord())) {
                                HotSearchAndDiscoveryFragment2.this.mSearchInputView.setHint(HotSearchAndDiscoveryFragment2.this.i());
                                return;
                            }
                            HotSearchAndDiscoveryFragment2.this.mSearchInputView.setHint(HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.getCurrentDisplayedWord());
                            HotSearchAndDiscoveryFragment2.this.f3049d = HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.getCurrentOperatedWord();
                            HotSearchAndDiscoveryFragment2.this.j = HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.getCurrentItem();
                        }
                    }
                }));
            }
            this.f3047b.isVisibleToUser.observe(this, new Observer<Boolean>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f42911a;

                public final /* synthetic */ void onChanged(@Nullable Object obj) {
                    Boolean bool = (Boolean) obj;
                    if (PatchProxy.isSupport(new Object[]{bool}, this, f42911a, false, 37656, new Class[]{Boolean.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bool}, this, f42911a, false, 37656, new Class[]{Boolean.class}, Void.TYPE);
                    } else if (bool.booleanValue()) {
                        HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.a();
                    } else {
                        HotSearchAndDiscoveryFragment2.this.mHotSearchFlipperView.b();
                    }
                }
            });
        }
        if (PatchProxy.isSupport(new Object[0], this, f3052f, false, 37617, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3052f, false, 37617, new Class[0], Void.TYPE);
        } else {
            this.mRightBackBtn.setOnClickListener(new w(this));
            if (this.s) {
                this.mRightBackBtn.setVisibility(8);
                this.mBackView.setVisibility(8);
            } else if (q()) {
                this.mRightBackBtn.setVisibility(0);
                this.mBackView.setVisibility(8);
            } else {
                this.mRightBackBtn.setVisibility(8);
                this.mBackView.setVisibility(0);
            }
            if (this.s) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mSearchContainer.getLayoutParams();
                marginLayoutParams.leftMargin = (int) UIUtils.dip2Px(getContext(), 16.0f);
                this.mSearchContainer.setLayoutParams(marginLayoutParams);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f3052f, false, 37612, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3052f, false, 37612, new Class[0], Void.TYPE);
        } else {
            Context context = getContext();
            ViewGroup viewGroup2 = this.mTopStatus;
            if (p()) {
                searchScanView = this.mSearchScanViewRight;
            } else {
                searchScanView = this.mSearchScanView;
            }
            SearchScanView searchScanView2 = searchScanView;
            ImageView imageView2 = this.mBackView;
            if (q()) {
                imageView = this.mRightBackBtn;
            } else {
                imageView = this.mBackView;
            }
            ImageView imageView3 = imageView;
            f fVar = new f(context, viewGroup2, searchScanView2, imageView2, imageView3, this.mTvSearch, this.mSearchContainer);
            this.l = fVar;
            f fVar2 = (f) this.l;
            fVar2.f42338f = !this.s;
            fVar2.g = q();
            fVar2.h = true;
            fVar2.i = p();
        }
        if (PatchProxy.isSupport(new Object[0], this, f3052f, false, 37618, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3052f, false, 37618, new Class[0], Void.TYPE);
        } else if (ex.b()) {
            v.a(this.mRightSearchView, 8);
            if (this.mSearchInputView != null) {
                this.mSearchInputView.setCursorVisible(false);
                this.mSearchInputView.setFocusable(false);
                this.mSearchInputView.setFocusableInTouchMode(false);
                this.mSearchInputView.setOnClickListener(x.f43204b);
            }
            if (!(this.mSearchContainer == null || getContext() == null)) {
                ViewGroup.LayoutParams layoutParams = this.mSearchContainer.getLayoutParams();
                if (layoutParams instanceof LinearLayout.LayoutParams) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.rightMargin = (int) UIUtils.dip2Px(getContext(), 16.0f);
                    layoutParams2.leftMargin = (int) UIUtils.dip2Px(getContext(), 16.0f);
                    if (Build.VERSION.SDK_INT >= 17) {
                        int dip2Px = (int) UIUtils.dip2Px(getContext(), 16.0f);
                        layoutParams2.setMarginEnd(dip2Px);
                        layoutParams2.setMarginStart(dip2Px);
                    }
                    this.mSearchContainer.setLayoutParams(layoutParams2);
                }
            }
        }
        return onCreateView;
    }
}

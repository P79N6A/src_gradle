package com.ss.android.ugc.aweme.discover.ui;

import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.transition.Fade;
import android.transition.TransitionSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageButton;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.discover.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.discover.helper.h;
import com.ss.android.ugc.aweme.discover.model.SearchEnterParam;
import com.ss.android.ugc.aweme.discover.model.SearchHistory;
import com.ss.android.ugc.aweme.discover.model.SearchHistoryManager;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel$IHotSearchListListener$$CC;
import com.ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.bg;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0014J\b\u0010\u0016\u001a\u00020\u0004H\u0014J\b\u0010\u0017\u001a\u00020\u0004H\u0014J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0014J\u0012\u0010\u001b\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0012\u0010\u001e\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010 \u001a\u00020\u0014H\u0014J\b\u0010!\u001a\u00020\u0014H\u0014J\b\u0010\"\u001a\u00020\u0014H\u0014J\b\u0010#\u001a\u00020\u0014H\u0002J\u0012\u0010$\u001a\u00020\u00142\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J&\u0010'\u001a\u00020\u00142\b\u0010(\u001a\u0004\u0018\u00010\u00112\b\u0010)\u001a\u0004\u0018\u00010\u00112\b\u0010*\u001a\u0004\u0018\u00010+H\u0002J\u0010\u0010,\u001a\u00020\u00142\u0006\u0010-\u001a\u00020.H\u0007J\u0010\u0010/\u001a\u00020\u00142\u0006\u00100\u001a\u000201H\u0007J\b\u00102\u001a\u00020\u0014H\u0016J\u0010\u00103\u001a\u00020\u00142\u0006\u00104\u001a\u000205H\u0007J\u001a\u00106\u001a\u00020\u00142\u0006\u00107\u001a\u00020\u001d2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u00108\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u000fH\u0014J\b\u00109\u001a\u00020\u0014H\u0014J\u0010\u0010:\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010;\u001a\u00020\u0014H\u0002J\u001c\u0010<\u001a\u00020\u00142\b\u0010=\u001a\u0004\u0018\u00010\u00112\b\u0010>\u001a\u0004\u0018\u00010\u0011H\u0002R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/SearchResultFragment;", "Lcom/ss/android/ugc/aweme/discover/ui/BaseDiscoveryAndSearchFragment;", "()V", "mCurrentTabIndex", "", "getMCurrentTabIndex", "()I", "mSearchBarRoot", "Landroid/view/ViewGroup;", "mSearchFragment", "Lcom/ss/android/ugc/aweme/discover/ui/SearchContainerFragment;", "getMSearchFragment", "()Lcom/ss/android/ugc/aweme/discover/ui/SearchContainerFragment;", "mSearchInputContainer", "mSearchParam", "Lcom/ss/android/ugc/aweme/discover/model/SearchResultParam;", "checkAndRecordSearchHistory", "", "param", "createContainerFragment", "", "getDefaultSearchHintId", "getInitState", "getLayout", "handleBackPressed", "", "handleLeftBackViewClick", "handleSearchBarClick", "v", "Landroid/view/View;", "handleSearchViewAction", "text", "initBottomFragment", "initKeyboard", "initSearchBar", "initWindowTransition", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onGetHotSearchWordShowInSearchBar", "keyword", "realSearchWord", "logPbBean", "Lcom/ss/android/ugc/aweme/feed/model/LogPbBean;", "onGuideSearchEvent", "guideSearchEvent", "Lcom/ss/android/ugc/aweme/discover/event/GuideSearchEvent;", "onInnerSearchEvent", "innerSearchEvent", "Lcom/ss/android/ugc/aweme/discover/event/InnerSearchEvent;", "onResume", "onSearchCorrectEvent", "searchCorrectEvent", "Lcom/ss/android/ugc/aweme/discover/event/SearchCorrectEvent;", "onViewCreated", "view", "openSearch", "openSearchSquare", "requestOpenSearch", "sendEnterSearchEvent", "sendGuessWordClickEvent", "wordContent", "groupId", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchResultFragment extends BaseDiscoveryAndSearchFragment {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f3073f;
    public static final int g = u.a(16.0d);
    public static final a h = new a((byte) 0);
    private ViewGroup i;
    private ViewGroup j;
    private SearchResultParam k;
    private HashMap l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/SearchResultFragment$Companion;", "", "()V", "DELAY_TIME", "", "DP_16", "getDP_16", "()I", "KEY_SEARCH_ENTER_PARAM", "", "OPEN_KEYBOARD_DELAY_TIME", "", "getInstance", "Lcom/ss/android/ugc/aweme/discover/ui/SearchResultFragment;", "param", "Lcom/ss/android/ugc/aweme/discover/model/SearchResultParam;", "enterParam", "Lcom/ss/android/ugc/aweme/discover/model/SearchEnterParam;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43026a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SearchResultFragment a(@NotNull SearchResultParam searchResultParam, @Nullable SearchEnterParam searchEnterParam) {
            SearchResultParam searchResultParam2 = searchResultParam;
            if (PatchProxy.isSupport(new Object[]{searchResultParam2, searchEnterParam}, this, f43026a, false, 38066, new Class[]{SearchResultParam.class, SearchEnterParam.class}, SearchResultFragment.class)) {
                return (SearchResultFragment) PatchProxy.accessDispatch(new Object[]{searchResultParam2, searchEnterParam}, this, f43026a, false, 38066, new Class[]{SearchResultParam.class, SearchEnterParam.class}, SearchResultFragment.class);
            }
            Intrinsics.checkParameterIsNotNull(searchResultParam2, "param");
            Bundle bundle = new Bundle();
            bundle.putSerializable("searchParam", searchResultParam2);
            bundle.putSerializable("search_enter_param", searchEnterParam);
            SearchResultFragment searchResultFragment = new SearchResultFragment();
            searchResultFragment.setArguments(bundle);
            return searchResultFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/discover/ui/SearchResultFragment$createContainerFragment$1", "Lcom/ss/android/ugc/aweme/common/widget/tablayout/CommonTabLayout$OnTabSelectedListener;", "onTabReselected", "", "tab", "Lcom/ss/android/ugc/aweme/common/widget/tablayout/CommonTabLayout$Tab;", "onTabSelected", "onTabUnselected", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements CommonTabLayout.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43027a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchResultFragment f43028b;

        public final void b(@Nullable CommonTabLayout.e eVar) {
        }

        public final void c(@Nullable CommonTabLayout.e eVar) {
        }

        b(SearchResultFragment searchResultFragment) {
            this.f43028b = searchResultFragment;
        }

        public final void a(@NotNull CommonTabLayout.e eVar) {
            if (PatchProxy.isSupport(new Object[]{eVar}, this, f43027a, false, 38067, new Class[]{CommonTabLayout.e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar}, this, f43027a, false, 38067, new Class[]{CommonTabLayout.e.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(eVar, "tab");
            SearchResultFragment searchResultFragment = this.f43028b;
            EditText editText = this.f43028b.mSearchInputView;
            Intrinsics.checkExpressionValueIsNotNull(editText, "mSearchInputView");
            if (searchResultFragment.a(editText.getHint().toString())) {
                EditText editText2 = this.f43028b.mSearchInputView;
                Intrinsics.checkExpressionValueIsNotNull(editText2, "mSearchInputView");
                editText2.setHint(this.f43028b.a(eVar.f40629f));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/discover/ui/SearchResultFragment$initSearchBar$1", "Lcom/ss/android/ugc/aweme/discover/ui/OnSearchItemTouchAnimListener;", "onAction", "", "view", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c extends ai {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43029a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchResultFragment f43030b;

        c(SearchResultFragment searchResultFragment) {
            this.f43030b = searchResultFragment;
        }

        public final void b(@Nullable View view, @Nullable MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f43029a, false, 38068, new Class[]{View.class, MotionEvent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f43029a, false, 38068, new Class[]{View.class, MotionEvent.class}, Void.TYPE);
                return;
            }
            if (this.f43030b.isViewValid()) {
                this.f43030b.h();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43031a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchResultFragment f43032b;

        d(SearchResultFragment searchResultFragment) {
            this.f43032b = searchResultFragment;
        }

        public final void onClick(View view) {
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{view}, this, f43031a, false, 38069, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f43031a, false, 38069, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f43032b.mSearchInputView.setText("");
            EditText editText = this.f43032b.mSearchInputView;
            Intrinsics.checkExpressionValueIsNotNull(editText, "mSearchInputView");
            editText.setCursorVisible(true);
            KeyboardUtils.b(this.f43032b.mSearchInputView);
            Activity[] activityStack = ActivityStack.getActivityStack();
            Intrinsics.checkExpressionValueIsNotNull(activityStack, "stack");
            int length = activityStack.length;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (activityStack[i] instanceof SearchResultActivity) {
                    break;
                } else {
                    i++;
                }
            }
            int length2 = activityStack.length - 1;
            while (true) {
                if (length2 < 0) {
                    length2 = -1;
                    break;
                } else if (activityStack[length2] instanceof SearchResultActivity) {
                    break;
                } else {
                    length2--;
                }
            }
            if (i != length2) {
                while (i < length2) {
                    activityStack[i].finish();
                    i++;
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43033a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchResultFragment f43034b;

        e(SearchResultFragment searchResultFragment) {
            this.f43034b = searchResultFragment;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f43033a, false, 38070, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f43033a, false, 38070, new Class[0], Void.TYPE);
                return;
            }
            if (this.f43034b.isViewValid()) {
                this.f43034b.mSearchInputView.requestFocus();
                KeyboardUtils.b(this.f43034b.mSearchInputView);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0006\u001a\n \u0004*\u0004\u0018\u00010\u00070\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "operatedSearchWord", "", "kotlin.jvm.PlatformType", "realSearchWord", "logPb", "Lcom/ss/android/ugc/aweme/feed/model/LogPbBean;", "onShowOperatedSearchWord"}, k = 3, mv = {1, 1, 15})
    static final class f implements SearchStateViewModel.IHotSearchListListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43035a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchResultFragment f43036b;

        f(SearchResultFragment searchResultFragment) {
            this.f43036b = searchResultFragment;
        }

        public final void onHotSearchWordsFlipper(List list, LogPbBean logPbBean, List list2) {
            if (PatchProxy.isSupport(new Object[]{list, logPbBean, list2}, this, f43035a, false, 38072, new Class[]{List.class, LogPbBean.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list, logPbBean, list2}, this, f43035a, false, 38072, new Class[]{List.class, LogPbBean.class, List.class}, Void.TYPE);
                return;
            }
            SearchStateViewModel$IHotSearchListListener$$CC.onHotSearchWordsFlipper(this, list, logPbBean, list2);
        }

        public final void onShowOperatedSearchWord(String str, String str2, LogPbBean logPbBean) {
            String str3 = str;
            String str4 = str2;
            LogPbBean logPbBean2 = logPbBean;
            if (PatchProxy.isSupport(new Object[]{str3, str4, logPbBean2}, this, f43035a, false, 38071, new Class[]{String.class, String.class, LogPbBean.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str3, str4, logPbBean2}, this, f43035a, false, 38071, new Class[]{String.class, String.class, LogPbBean.class}, Void.TYPE);
                return;
            }
            this.f43036b.a(str3, str4, logPbBean2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43037a;

        /* renamed from: b  reason: collision with root package name */
        public static final g f43038b = new g();

        g() {
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f43037a, false, 38073, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f43037a, false, 38073, new Class[0], Void.TYPE);
                return;
            }
            bg.a(new com.ss.android.ugc.aweme.discover.a.g());
        }
    }

    @JvmStatic
    @NotNull
    public static final SearchResultFragment a(@NotNull SearchResultParam searchResultParam, @Nullable SearchEnterParam searchEnterParam) {
        SearchResultParam searchResultParam2 = searchResultParam;
        SearchEnterParam searchEnterParam2 = searchEnterParam;
        if (!PatchProxy.isSupport(new Object[]{searchResultParam2, searchEnterParam2}, null, f3073f, true, 38065, new Class[]{SearchResultParam.class, SearchEnterParam.class}, SearchResultFragment.class)) {
            return h.a(searchResultParam2, searchEnterParam2);
        }
        return (SearchResultFragment) PatchProxy.accessDispatch(new Object[]{searchResultParam2, searchEnterParam2}, null, f3073f, true, 38065, new Class[]{SearchResultParam.class, SearchEnterParam.class}, SearchResultFragment.class);
    }

    public final int e() {
        return C0906R.layout.oc;
    }

    public final int f() {
        return 2;
    }

    private final SearchContainerFragment b() {
        if (PatchProxy.isSupport(new Object[0], this, f3073f, false, 38039, new Class[0], SearchContainerFragment.class)) {
            return (SearchContainerFragment) PatchProxy.accessDispatch(new Object[0], this, f3073f, false, 38039, new Class[0], SearchContainerFragment.class);
        }
        Fragment findFragmentByTag = getChildFragmentManager().findFragmentByTag("Container");
        if (findFragmentByTag instanceof SearchContainerFragment) {
            return (SearchContainerFragment) findFragmentByTag;
        }
        return null;
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f3073f, false, 38048, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3073f, false, 38048, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null) {
            SearchResultParam searchResultParam = this.k;
            if (searchResultParam == null) {
                Intrinsics.throwNpe();
            }
            b(searchResultParam);
        }
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f3073f, false, 38046, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3073f, false, 38046, new Class[0], Void.TYPE);
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            if (window != null) {
                window.setSoftInputMode(50);
            }
        }
    }

    public final void l() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f3073f, false, 38054, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3073f, false, 38054, new Class[0], Void.TYPE);
            return;
        }
        SearchIntermediateView searchIntermediateView = this.mIntermediateView;
        SearchResultParam searchResultParam = this.k;
        if (searchResultParam != null && searchResultParam.getSearchFrom() == 17) {
            z = true;
        }
        searchIntermediateView.a(z);
        c(3);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f3073f, false, 38064, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3073f, false, 38064, new Class[0], Void.TYPE);
            return;
        }
        if (this.l != null) {
            this.l.clear();
        }
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3073f, false, 38043, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3073f, false, 38043, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        com.ss.android.b.a.a.a.a(g.f43038b, 100);
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f3073f, false, 38052, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3073f, false, 38052, new Class[0], Void.TYPE);
        } else if (!a()) {
            KeyboardUtils.c(this.mSearchInputView);
            FragmentActivity activity = getActivity();
            if (activity == null) {
                Intrinsics.throwNpe();
            }
            ActivityCompat.finishAfterTransition(activity);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c5, code lost:
        if (r0.getSearchFrom() == 18) goto L_0x00c7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f3073f
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 38047(0x949f, float:5.3315E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f3073f
            r5 = 0
            r6 = 38047(0x949f, float:5.3315E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            super.j()
            android.view.View r1 = r9.getView()
            r2 = 0
            if (r1 == 0) goto L_0x0039
            r3 = 2131169726(0x7f0711be, float:1.795379E38)
            android.view.View r1 = r1.findViewById(r3)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L_0x003a
        L_0x0039:
            r1 = r2
        L_0x003a:
            r9.i = r1
            android.view.View r1 = r9.getView()
            if (r1 == 0) goto L_0x004c
            r3 = 2131166800(0x7f070650, float:1.7947856E38)
            android.view.View r1 = r1.findViewById(r3)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L_0x004d
        L_0x004c:
            r1 = r2
        L_0x004d:
            r9.j = r1
            android.view.View r1 = r9.getView()
            if (r1 == 0) goto L_0x005b
            r3 = 2131167722(0x7f0709ea, float:1.7949726E38)
            r1.findViewById(r3)
        L_0x005b:
            boolean r1 = com.ss.android.ugc.aweme.discover.helper.b.i()
            if (r1 == 0) goto L_0x00df
            android.view.ViewGroup r0 = r9.j
            if (r0 == 0) goto L_0x0069
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
        L_0x0069:
            if (r2 == 0) goto L_0x00d7
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 < r1) goto L_0x0079
            int r0 = g
            r2.setMarginStart(r0)
            goto L_0x007d
        L_0x0079:
            int r0 = g
            r2.leftMargin = r0
        L_0x007d:
            android.view.ViewGroup r0 = r9.j
            if (r0 == 0) goto L_0x0086
            android.view.ViewGroup$LayoutParams r2 = (android.view.ViewGroup.LayoutParams) r2
            r0.setLayoutParams(r2)
        L_0x0086:
            android.widget.TextView r0 = r9.mTvSearch
            r2 = 2131559036(0x7f0d027c, float:1.8743405E38)
            r0.setText(r2)
            android.widget.TextView r0 = r9.mTvSearch
            com.ss.android.ugc.aweme.discover.ui.SearchResultFragment$c r2 = new com.ss.android.ugc.aweme.discover.ui.SearchResultFragment$c
            r2.<init>(r9)
            android.view.View$OnTouchListener r2 = (android.view.View.OnTouchListener) r2
            r0.setOnTouchListener(r2)
            android.widget.EditText r0 = r9.mSearchInputView
            java.lang.String r2 = "mSearchInputView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            r2 = 1
            r0.setCursorVisible(r2)
            android.widget.ImageButton r0 = r9.mBtnClear
            com.ss.android.ugc.aweme.discover.ui.SearchResultFragment$d r2 = new com.ss.android.ugc.aweme.discover.ui.SearchResultFragment$d
            r2.<init>(r9)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r0.setOnClickListener(r2)
            com.ss.android.ugc.aweme.discover.model.SearchResultParam r0 = r9.k
            if (r0 == 0) goto L_0x00bb
            int r0 = r0.getSearchFrom()
            if (r0 == r1) goto L_0x00c7
        L_0x00bb:
            com.ss.android.ugc.aweme.discover.model.SearchResultParam r0 = r9.k
            if (r0 == 0) goto L_0x00d6
            int r0 = r0.getSearchFrom()
            r1 = 18
            if (r0 != r1) goto L_0x00e9
        L_0x00c7:
            android.widget.EditText r0 = r9.mSearchInputView
            com.ss.android.ugc.aweme.discover.ui.SearchResultFragment$e r1 = new com.ss.android.ugc.aweme.discover.ui.SearchResultFragment$e
            r1.<init>(r9)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r2 = 200(0xc8, double:9.9E-322)
            r0.postDelayed(r1, r2)
            return
        L_0x00d6:
            return
        L_0x00d7:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r0.<init>(r1)
            throw r0
        L_0x00df:
            android.widget.ImageView r1 = r9.mBackView
            java.lang.String r2 = "mBackView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.setVisibility(r0)
        L_0x00e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.SearchResultFragment.j():void");
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f3073f, false, 38051, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3073f, false, 38051, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.ugc.aweme.discover.helper.b.i()) {
            if (n() == 2) {
                Activity previousActivity = ActivityStack.getPreviousActivity();
                if (!(previousActivity instanceof MainActivity) && !(previousActivity instanceof DetailActivity)) {
                    return false;
                }
                this.mSearchInputView.setText("");
                return true;
            } else if (!this.mIntermediateView.a() || this.mIntermediateView.getOpenSugFromState() != 2) {
                return false;
            } else {
                c(2);
                EditText editText = this.mSearchInputView;
                Intrinsics.checkExpressionValueIsNotNull(editText, "mSearchInputView");
                editText.setCursorVisible(false);
                a(true);
                return true;
            }
        } else if (n() == 2 || b() == null) {
            return false;
        } else {
            c(2);
            EditText editText2 = this.mSearchInputView;
            Intrinsics.checkExpressionValueIsNotNull(editText2, "mSearchInputView");
            editText2.setCursorVisible(false);
            a(true);
            return true;
        }
    }

    private final void c(SearchResultParam searchResultParam) {
        if (PatchProxy.isSupport(new Object[]{searchResultParam}, this, f3073f, false, 38056, new Class[]{SearchResultParam.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchResultParam}, this, f3073f, false, 38056, new Class[]{SearchResultParam.class}, Void.TYPE);
            return;
        }
        SearchContainerFragment a2 = SearchContainerFragment.a(searchResultParam);
        a2.f3060e = new b(this);
        getChildFragmentManager().beginTransaction().replace(C0906R.id.aic, a2, "Container").commitAllowingStateLoss();
    }

    @Subscribe
    public final void onGuideSearchEvent(@NotNull com.ss.android.ugc.aweme.discover.a.a aVar) {
        String str;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3073f, false, 38059, new Class[]{com.ss.android.ugc.aweme.discover.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3073f, false, 38059, new Class[]{com.ss.android.ugc.aweme.discover.a.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar, "guideSearchEvent");
        EditText editText = this.mSearchInputView;
        Intrinsics.checkExpressionValueIsNotNull(editText, "mSearchInputView");
        if (TextUtils.isEmpty(editText.getText().toString())) {
            str = aVar.f41485a;
        } else {
            str = r0 + " " + aVar.f41485a;
        }
        SearchResultParam searchFrom = new SearchResultParam().setKeyword(str).setSearchFrom(9);
        Intrinsics.checkExpressionValueIsNotNull(searchFrom, "param");
        b(searchFrom);
    }

    @Subscribe
    public final void onInnerSearchEvent(@NotNull com.ss.android.ugc.aweme.discover.a.b bVar) {
        com.ss.android.ugc.aweme.discover.a.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f3073f, false, 38060, new Class[]{com.ss.android.ugc.aweme.discover.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f3073f, false, 38060, new Class[]{com.ss.android.ugc.aweme.discover.a.b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar2, "innerSearchEvent");
        b(bVar2.f41487b);
    }

    @Subscribe
    public final void onSearchCorrectEvent(@NotNull com.ss.android.ugc.aweme.discover.a.e eVar) {
        com.ss.android.ugc.aweme.discover.a.e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f3073f, false, 38058, new Class[]{com.ss.android.ugc.aweme.discover.a.e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f3073f, false, 38058, new Class[]{com.ss.android.ugc.aweme.discover.a.e.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(eVar2, "searchCorrectEvent");
        SearchResultParam searchFrom = new SearchResultParam().setKeyword(eVar2.f41492a).setSearchFrom(8);
        Intrinsics.checkExpressionValueIsNotNull(searchFrom, "param");
        b(searchFrom);
    }

    private final String d(SearchResultParam searchResultParam) {
        String str;
        if (PatchProxy.isSupport(new Object[]{searchResultParam}, this, f3073f, false, 38057, new Class[]{SearchResultParam.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{searchResultParam}, this, f3073f, false, 38057, new Class[]{SearchResultParam.class}, String.class);
        }
        String keyword = searchResultParam.getKeyword();
        if (!TextUtils.isEmpty(searchResultParam.getRealSearchWord())) {
            keyword = searchResultParam.getRealSearchWord();
        }
        if (ay.a(keyword)) {
            return null;
        }
        if (!TextUtils.isEmpty(searchResultParam.getKeyword())) {
            str = searchResultParam.getKeyword();
        } else {
            str = keyword;
        }
        if (!TextUtils.isEmpty(str) && !com.ss.android.ugc.aweme.discover.helper.b.c()) {
            SearchHistoryManager.inst().recordSearchHistory(new SearchHistory(str, 0));
        }
        return keyword;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0068, code lost:
        if (r17.mIntermediateView.getOpenSugFromState() != 2) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.discover.model.SearchResultParam r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f3073f
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchResultParam> r3 = com.ss.android.ugc.aweme.discover.model.SearchResultParam.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 38053(0x94a5, float:5.3324E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f3073f
            r13 = 0
            r14 = 38053(0x94a5, float:5.3324E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchResultParam> r0 = com.ss.android.ugc.aweme.discover.model.SearchResultParam.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0036:
            java.lang.String r2 = "param"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
            int r2 = r17.n()
            boolean r2 = com.ss.android.ugc.aweme.discover.model.SearchStateViewModel.isSearchIntermediate(r2)
            if (r2 != 0) goto L_0x0046
            return
        L_0x0046:
            java.lang.String r2 = r18.getKeyword()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0078
            int r2 = r18.getSearchFrom()
            r3 = 3
            if (r2 != r3) goto L_0x0072
            boolean r2 = com.ss.android.ugc.aweme.discover.helper.b.i()
            if (r2 == 0) goto L_0x006b
            r2 = r17
            com.ss.android.ugc.aweme.discover.ui.SearchIntermediateView r3 = r2.mIntermediateView
            int r3 = r3.getOpenSugFromState()
            r4 = 2
            if (r3 == r4) goto L_0x006d
            goto L_0x006e
        L_0x006b:
            r2 = r17
        L_0x006d:
            r1 = 0
        L_0x006e:
            r0.setOpenNewSearchContainer(r1)
            goto L_0x0074
        L_0x0072:
            r2 = r17
        L_0x0074:
            r17.b((com.ss.android.ugc.aweme.discover.model.SearchResultParam) r18)
            goto L_0x007a
        L_0x0078:
            r2 = r17
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.SearchResultFragment.a(com.ss.android.ugc.aweme.discover.model.SearchResultParam):void");
    }

    public final void b(@NotNull SearchResultParam searchResultParam) {
        if (PatchProxy.isSupport(new Object[]{searchResultParam}, this, f3073f, false, 38055, new Class[]{SearchResultParam.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchResultParam}, this, f3073f, false, 38055, new Class[]{SearchResultParam.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(searchResultParam, "param");
        this.k = searchResultParam;
        String d2 = d(searchResultParam);
        if (TextUtils.isEmpty(d2)) {
            this.mSearchInputView.setText("");
            return;
        }
        c(2);
        this.mSearchInputView.setText(searchResultParam.getKeyword());
        ImageButton imageButton = this.mBtnClear;
        Intrinsics.checkExpressionValueIsNotNull(imageButton, "mBtnClear");
        imageButton.setVisibility(0);
        EditText editText = this.mSearchInputView;
        Intrinsics.checkExpressionValueIsNotNull(editText, "mSearchInputView");
        editText.setCursorVisible(false);
        KeyboardUtils.c(this.mSearchInputView);
        searchResultParam.setKeyword(d2);
        if (b() == null || searchResultParam.isOpenNewSearchContainer()) {
            c(searchResultParam);
        } else {
            SearchContainerFragment b2 = b();
            if (b2 == null) {
                Intrinsics.throwNpe();
            }
            b2.b(searchResultParam);
        }
        a(false);
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).trackAppsFlyerEvent("search", searchResultParam.getKeyword());
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3073f, false, 38041, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3073f, false, 38041, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                Intrinsics.throwNpe();
            }
            Serializable serializable = arguments.getSerializable("searchParam");
            if (serializable != null) {
                this.k = (SearchResultParam) serializable;
                Bundle arguments2 = getArguments();
                if (arguments2 == null) {
                    Intrinsics.throwNpe();
                }
                Serializable serializable2 = arguments2.getSerializable("search_enter_param");
                if (!(serializable2 instanceof SearchEnterParam)) {
                    serializable2 = null;
                }
                SearchEnterParam searchEnterParam = (SearchEnterParam) serializable2;
                SearchEnterViewModel.a aVar = SearchEnterViewModel.f43247b;
                FragmentActivity activity = getActivity();
                if (activity == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(activity, "activity!!");
                aVar.a(activity).f43248a = searchEnterParam;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.SearchResultParam");
            }
        }
        LifecycleOwner lifecycleOwner = this;
        this.f3048c.f43225b.observe(lifecycleOwner, this);
        this.f3047b.hotSearchLiveData.observe(lifecycleOwner, new SearchStateViewModel.HotSearchListObserver().setListener(new f(this)));
    }

    public final void a(@Nullable View view) {
        String str;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{view}, this, f3073f, false, 38049, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3073f, false, 38049, new Class[]{View.class}, Void.TYPE);
        } else if (this.mSearchInputView != null) {
            if (n() == 2) {
                if (PatchProxy.isSupport(new Object[0], this, f3073f, false, 38062, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3073f, false, 38062, new Class[0], Void.TYPE);
                } else {
                    if (PatchProxy.isSupport(new Object[0], this, f3073f, false, 38040, new Class[0], Integer.TYPE)) {
                        i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3073f, false, 38040, new Class[0], Integer.TYPE)).intValue();
                    } else if (b() != null) {
                        SearchContainerFragment b2 = b();
                        if (b2 == null) {
                            Intrinsics.throwNpe();
                        }
                        i2 = b2.a();
                    }
                    if (i2 == aw.f43134b) {
                        str = "general_search";
                    } else if (i2 == aw.f43136d) {
                        str = "search_user";
                    } else if (i2 == aw.g) {
                        str = "search_tag";
                    } else if (i2 == aw.f43138f) {
                        str = "search_music";
                    } else if (i2 == aw.f43135c) {
                        str = "search_video";
                    } else if (i2 == aw.f43137e) {
                        str = "search_poi";
                    } else if (i2 == aw.h) {
                        str = "search_ecommerce";
                    }
                    r.a("enter_search", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", str).f34114b);
                }
            }
            EditText editText = this.mSearchInputView;
            Intrinsics.checkExpressionValueIsNotNull(editText, "mSearchInputView");
            editText.setCursorVisible(true);
            EditText editText2 = this.mSearchInputView;
            Intrinsics.checkExpressionValueIsNotNull(editText2, "mSearchInputView");
            if (!TextUtils.isEmpty(editText2.getText().toString())) {
                m();
            } else {
                l();
            }
        }
    }

    public final void b(@Nullable String str) {
        String str2;
        String id;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{str}, this, f3073f, false, 38050, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3073f, false, 38050, new Class[]{String.class}, Void.TYPE);
            return;
        }
        EditText editText = this.mSearchInputView;
        Intrinsics.checkExpressionValueIsNotNull(editText, "mSearchInputView");
        String obj = editText.getHint().toString();
        if (!TextUtils.isEmpty(str) || TextUtils.isEmpty(obj) || a(obj)) {
            str2 = str;
            z = false;
        } else {
            if (com.ss.android.ugc.aweme.discover.helper.b.k()) {
                if (this.f3050e == null) {
                    id = "";
                } else {
                    id = this.f3050e.getId();
                }
                String str3 = id;
                if (PatchProxy.isSupport(new Object[]{obj, str3}, this, f3073f, false, 38061, new Class[]{String.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{obj, str3}, this, f3073f, false, 38061, new Class[]{String.class, String.class}, Void.TYPE);
                } else {
                    r.a("trending_words_click", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("words_position", 0).a("words_source", "recom_search").a("words_content", obj).a("group_id", str3).f34114b);
                }
            } else {
                r.a("hot_search_keyword", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("action_type", "click").a("key_word", str).a("key_word_type", "general_word").a("enter_from", "default_search_keyword").f34114b);
            }
            str2 = obj;
        }
        String str4 = null;
        if (z && !com.ss.android.ugc.aweme.discover.helper.b.k()) {
            str4 = this.f3049d;
        }
        a(str2, str4, z);
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f3073f, false, 38044, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f3073f, false, 38044, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f3073f, false, 38045, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3073f, false, 38045, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            TransitionSet transitionSet = new TransitionSet();
            Fade fade = new Fade();
            SearchResultParam searchResultParam = this.k;
            if (searchResultParam != null && searchResultParam.getSearchFrom() == 17) {
                fade.excludeTarget(C0906R.id.b4s, true);
            }
            h hVar = new h();
            hVar.addTarget(C0906R.id.ccc);
            transitionSet.addTransition(hVar);
            transitionSet.addTransition(fade);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                Window window = activity.getWindow();
                if (window != null) {
                    window.setEnterTransition(transitionSet);
                }
            }
        }
    }

    public final void a(String str, String str2, LogPbBean logPbBean) {
        String str3 = str;
        String str4 = str2;
        LogPbBean logPbBean2 = logPbBean;
        if (PatchProxy.isSupport(new Object[]{str3, str4, logPbBean2}, this, f3073f, false, 38042, new Class[]{String.class, String.class, LogPbBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, logPbBean2}, this, f3073f, false, 38042, new Class[]{String.class, String.class, LogPbBean.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.discover.helper.b.i() && !com.ss.android.ugc.aweme.discover.helper.b.k()) {
            CharSequence charSequence = str3;
            if (!TextUtils.isEmpty(charSequence) && !TextUtils.equals(charSequence, i())) {
                EditText editText = this.mSearchInputView;
                Intrinsics.checkExpressionValueIsNotNull(editText, "mSearchInputView");
                if (!TextUtils.equals(editText.getHint().toString(), charSequence)) {
                    r.a("search_default", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("action_type", "show").a("search_keyword", str3).a("log_pb", new Gson().toJson((Object) logPbBean2)).f34114b);
                    EditText editText2 = this.mSearchInputView;
                    Intrinsics.checkExpressionValueIsNotNull(editText2, "mSearchInputView");
                    editText2.setHint(charSequence);
                    this.f3049d = str4;
                }
            }
        }
    }
}

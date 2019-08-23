package com.ss.android.ugc.aweme.friends.ui;

import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ac.b;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.arch.JediBaseFragment;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.discover.ui.NoticeView;
import com.ss.android.ugc.aweme.friends.AddFriendsState;
import com.ss.android.ugc.aweme.friends.AddFriendsViewModel;
import com.ss.android.ugc.aweme.friends.recommendlist.adapter.RecommendListWidgetAdapter;
import com.ss.android.ugc.aweme.friends.recommendlist.adapter.SearchUserAdapter;
import com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListState;
import com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListViewModel;
import com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.SearchUserListState;
import com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.SearchUserListViewModel;
import com.ss.android.ugc.aweme.main.bp;
import com.ss.android.ugc.aweme.utils.bi;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 S2\u00020\u0001:\u0001SB\u0005¢\u0006\u0002\u0010\u0002J\b\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u000203H\u0002J\b\u00105\u001a\u000203H\u0002J\b\u00106\u001a\u000203H\u0002J\b\u00107\u001a\u000203H\u0002J\b\u00108\u001a\u00020\u000eH\u0016J\b\u00109\u001a\u00020\u000eH\u0002J\u0012\u0010:\u001a\u0002032\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J&\u0010=\u001a\u0004\u0018\u00010 2\u0006\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\u0010\u0010D\u001a\u0002032\u0006\u0010E\u001a\u00020FH\u0007J\u0010\u0010G\u001a\u0002032\u0006\u0010H\u001a\u00020IH\u0007J\b\u0010J\u001a\u000203H\u0016J\u001a\u0010K\u001a\u0002032\u0006\u0010L\u001a\u00020 2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\b\u0010M\u001a\u000203H\u0002J\u0010\u0010N\u001a\u0002032\u0006\u0010O\u001a\u00020\u000eH\u0002J\u0010\u0010P\u001a\u0002032\u0006\u0010Q\u001a\u00020\u000eH\u0016J\b\u0010R\u001a\u000203H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001f\u001a\u00020 X.¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010%\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b)\u0010\n\u001a\u0004\b'\u0010(R\u0010\u0010*\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010+\u001a\u00020,8BX\u0002¢\u0006\f\n\u0004\b/\u0010\u001e\u001a\u0004\b-\u0010.R\u000e\u00100\u001a\u000201X.¢\u0006\u0002\n\u0000¨\u0006T"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/ui/FindFriendsJediFragment;", "Lcom/ss/android/ugc/aweme/base/arch/JediBaseFragment;", "()V", "mActivity", "Landroid/support/v4/app/FragmentActivity;", "mAddFriendsViewModel", "Lcom/ss/android/ugc/aweme/friends/AddFriendsViewModel;", "getMAddFriendsViewModel", "()Lcom/ss/android/ugc/aweme/friends/AddFriendsViewModel;", "mAddFriendsViewModel$delegate", "Lkotlin/Lazy;", "mBuilder", "Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView$Builder;", "mCheckedPermission", "", "mPerfectUserInfoGuide", "Lcom/ss/android/ugc/aweme/profile/ui/widget/PerfectUserInfoGuide;", "getMPerfectUserInfoGuide", "()Lcom/ss/android/ugc/aweme/profile/ui/widget/PerfectUserInfoGuide;", "mPerfectUserInfoGuide$delegate", "mRecommendListAdapter", "Lcom/ss/android/ugc/aweme/friends/recommendlist/adapter/RecommendListWidgetAdapter;", "getMRecommendListAdapter", "()Lcom/ss/android/ugc/aweme/friends/recommendlist/adapter/RecommendListWidgetAdapter;", "mRecommendListAdapter$delegate", "mRecommendListViewModel", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListViewModel;", "getMRecommendListViewModel", "()Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListViewModel;", "mRecommendListViewModel$delegate", "Lcom/bytedance/jedi/arch/lifecycleAwareLazy;", "mRootView", "Landroid/view/View;", "mSearchHitColorSpan", "Landroid/text/style/ForegroundColorSpan;", "mSearchHitString", "", "mSearchUserAdapter", "Lcom/ss/android/ugc/aweme/friends/recommendlist/adapter/SearchUserAdapter;", "getMSearchUserAdapter", "()Lcom/ss/android/ugc/aweme/friends/recommendlist/adapter/SearchUserAdapter;", "mSearchUserAdapter$delegate", "mSearchUserBuilder", "mSearchUserListViewModel", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/SearchUserListViewModel;", "getMSearchUserListViewModel", "()Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/SearchUserListViewModel;", "mSearchUserListViewModel$delegate", "noticeSp", "Lcom/ss/android/ugc/aweme/main/NotificationSharePreferences;", "addPageEnterTime", "", "checkReadContactPermission", "initRecommendList", "initSearchList", "initViewModel", "isRegisterEventBus", "needShowPermissionDialog", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onHidePerfectInfoGuideEvent", "event", "Lcom/ss/android/ugc/aweme/profile/event/HidePerfectInfoGuideEvent;", "onNotificationIndicatorEvent", "notification", "Lcom/ss/android/ugc/aweme/message/event/NotificationIndicator;", "onResume", "onViewCreated", "view", "searchUserLoadMore", "setSearchGroupScrollFlag", "needScroll", "setUserVisibleHint", "isVisibleToUser", "showApplyPermissionDialog", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FindFriendsJediFragment extends JediBaseFragment {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f3340c;

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f3341d = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FindFriendsJediFragment.class), "mAddFriendsViewModel", "getMAddFriendsViewModel()Lcom/ss/android/ugc/aweme/friends/AddFriendsViewModel;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FindFriendsJediFragment.class), "mSearchUserListViewModel", "getMSearchUserListViewModel()Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/SearchUserListViewModel;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FindFriendsJediFragment.class), "mRecommendListViewModel", "getMRecommendListViewModel()Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListViewModel;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FindFriendsJediFragment.class), "mRecommendListAdapter", "getMRecommendListAdapter()Lcom/ss/android/ugc/aweme/friends/recommendlist/adapter/RecommendListWidgetAdapter;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FindFriendsJediFragment.class), "mSearchUserAdapter", "getMSearchUserAdapter()Lcom/ss/android/ugc/aweme/friends/recommendlist/adapter/SearchUserAdapter;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FindFriendsJediFragment.class), "mPerfectUserInfoGuide", "getMPerfectUserInfoGuide()Lcom/ss/android/ugc/aweme/profile/ui/widget/PerfectUserInfoGuide;"))};
    public static final e l = new e((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public View f3342e;

    /* renamed from: f  reason: collision with root package name */
    public FragmentActivity f3343f;
    public bp g;
    public DmtStatusView.a h;
    public String i = "";
    public DmtStatusView.a j;
    public ForegroundColorSpan k;
    private final Lazy m;
    private final lifecycleAwareLazy n;
    private final lifecycleAwareLazy o;
    private final Lazy p = LazyKt.lazy(new am(this));
    private final Lazy q = LazyKt.lazy(new ao(this));
    private final Lazy r = LazyKt.lazy(new al(this));
    private boolean s;
    private HashMap t;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\f\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0002\u0010\u0006*\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"<anonymous>", "VM", "T", "Landroid/support/v4/app/Fragment;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "()Lcom/bytedance/jedi/arch/JediViewModel;", "com/bytedance/jedi/arch/ExtensionsKt$activityViewModel$2"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function0<AddFriendsViewModel> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Fragment $this_activityViewModel;
        final /* synthetic */ KClass $viewModelClass;
        final /* synthetic */ KClass $viewModelClass$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment, KClass kClass, KClass kClass2) {
            super(0);
            this.$this_activityViewModel = fragment;
            this.$viewModelClass = kClass;
            this.$viewModelClass$inlined = kClass2;
        }

        /* JADX WARNING: type inference failed for: r0v5, types: [com.ss.android.ugc.aweme.friends.AddFriendsViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r0v7, types: [com.ss.android.ugc.aweme.friends.AddFriendsViewModel, com.bytedance.jedi.arch.JediViewModel] */
        @NotNull
        public final AddFriendsViewModel invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47211, new Class[0], JediViewModel.class)) {
                return (JediViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47211, new Class[0], JediViewModel.class);
            }
            ViewModelProvider of = ViewModelProviders.of(this.$this_activityViewModel.requireActivity(), com.bytedance.jedi.arch.b.a());
            String name = kotlin.jvm.a.a(this.$viewModelClass$inlined).getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "viewModelClass.java.name");
            return (JediViewModel) of.get(name, kotlin.jvm.a.a(this.$viewModelClass));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class aa extends Lambda implements Function2<com.bytedance.jedi.arch.f, Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FindFriendsJediFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aa(FindFriendsJediFragment findFriendsJediFragment) {
            super(2);
            this.this$0 = findFriendsJediFragment;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, boolean z) {
            if (PatchProxy.isSupport(new Object[]{fVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 47246, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, Byte.valueOf(z)}, this, changeQuickRedirect, false, 47246, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            if (z) {
                DmtEditText dmtEditText = (DmtEditText) this.this$0.a((int) C0906R.id.aai);
                Intrinsics.checkExpressionValueIsNotNull(dmtEditText, "et_search_kw");
                dmtEditText.setCursorVisible(true);
                DmtTextView dmtTextView = (DmtTextView) this.this$0.a((int) C0906R.id.di3);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "tv_search_btn");
                dmtTextView.setVisibility(0);
                RecyclerView recyclerView = (RecyclerView) this.this$0.a((int) C0906R.id.acu);
                Intrinsics.checkExpressionValueIsNotNull(recyclerView, "feed_list");
                recyclerView.setAdapter(this.this$0.l());
                ((DmtStatusView) this.this$0.a((int) C0906R.id.cvd)).setBuilder(this.this$0.j);
                ((DmtStatusView) this.this$0.a((int) C0906R.id.cvd)).b();
                this.this$0.a(false);
                return;
            }
            DmtEditText dmtEditText2 = (DmtEditText) this.this$0.a((int) C0906R.id.aai);
            Intrinsics.checkExpressionValueIsNotNull(dmtEditText2, "et_search_kw");
            dmtEditText2.setCursorVisible(false);
            ((DmtEditText) this.this$0.a((int) C0906R.id.aai)).clearFocus();
            DmtTextView dmtTextView2 = (DmtTextView) this.this$0.a((int) C0906R.id.di3);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "tv_search_btn");
            dmtTextView2.setVisibility(8);
            com.ss.android.ugc.aweme.common.ui.b.a((Activity) this.this$0.getActivity(), (View) (DmtEditText) this.this$0.a((int) C0906R.id.aai));
            RecyclerView recyclerView2 = (RecyclerView) this.this$0.a((int) C0906R.id.acu);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "feed_list");
            recyclerView2.setAdapter(this.this$0.k());
            ((DmtStatusView) this.this$0.a((int) C0906R.id.cvd)).setBuilder(this.this$0.h);
            ((DmtStatusView) this.this$0.a((int) C0906R.id.cvd)).b();
            this.this$0.a(true);
            this.this$0.i().a("");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "data", "", "Lcom/ss/android/ugc/aweme/discover/model/SearchUser;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class ab extends Lambda implements Function2<com.bytedance.jedi.arch.f, List<? extends SearchUser>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FindFriendsJediFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ab(FindFriendsJediFragment findFriendsJediFragment) {
            super(2);
            this.this$0 = findFriendsJediFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (List) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull final List<? extends SearchUser> list) {
            if (PatchProxy.isSupport(new Object[]{fVar, list}, this, changeQuickRedirect, false, 47247, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, list}, this, changeQuickRedirect, false, 47247, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(list, "data");
            fVar.a(this.this$0.h(), new Function1<AddFriendsState, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ ab this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((AddFriendsState) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull AddFriendsState addFriendsState) {
                    if (PatchProxy.isSupport(new Object[]{addFriendsState}, this, changeQuickRedirect, false, 47248, new Class[]{AddFriendsState.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{addFriendsState}, this, changeQuickRedirect, false, 47248, new Class[]{AddFriendsState.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(addFriendsState, AdvanceSetting.NETWORK_TYPE);
                    if (this.this$0.this$0.isViewValid() && addFriendsState.isSearching()) {
                        if (list.isEmpty()) {
                            ((DmtStatusView) this.this$0.this$0.a((int) C0906R.id.cvd)).e();
                        } else {
                            ((DmtStatusView) this.this$0.this$0.a((int) C0906R.id.cvd)).b();
                        }
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class ac extends Lambda implements Function2<com.bytedance.jedi.arch.f, Throwable, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FindFriendsJediFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ac(FindFriendsJediFragment findFriendsJediFragment) {
            super(2);
            this.this$0 = findFriendsJediFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (Throwable) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull Throwable th) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{fVar2, th2}, this, changeQuickRedirect, false, 47249, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2, th2}, this, changeQuickRedirect, false, 47249, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            Intrinsics.checkParameterIsNotNull(th2, AdvanceSetting.NETWORK_TYPE);
            ((DmtStatusView) this.this$0.a((int) C0906R.id.cvd)).f();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class ad extends Lambda implements Function1<com.bytedance.jedi.arch.f, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FindFriendsJediFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ad(FindFriendsJediFragment findFriendsJediFragment) {
            super(1);
            this.this$0 = findFriendsJediFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.bytedance.jedi.arch.f) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            if (PatchProxy.isSupport(new Object[]{fVar2}, this, changeQuickRedirect, false, 47250, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2}, this, changeQuickRedirect, false, 47250, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            this.this$0.l().showLoadMoreLoading();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "Lcom/ss/android/ugc/aweme/discover/model/SearchUser;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class ae extends Lambda implements Function2<com.bytedance.jedi.arch.f, List<? extends SearchUser>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FindFriendsJediFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ae(FindFriendsJediFragment findFriendsJediFragment) {
            super(2);
            this.this$0 = findFriendsJediFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (List) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull List<? extends SearchUser> list) {
            if (PatchProxy.isSupport(new Object[]{fVar, list}, this, changeQuickRedirect, false, 47251, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, list}, this, changeQuickRedirect, false, 47251, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(list, AdvanceSetting.NETWORK_TYPE);
            fVar.a(this.this$0.h(), new Function1<AddFriendsState, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ ae this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((AddFriendsState) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull AddFriendsState addFriendsState) {
                    AddFriendsState addFriendsState2 = addFriendsState;
                    if (PatchProxy.isSupport(new Object[]{addFriendsState2}, this, changeQuickRedirect, false, 47252, new Class[]{AddFriendsState.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{addFriendsState2}, this, changeQuickRedirect, false, 47252, new Class[]{AddFriendsState.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(addFriendsState2, AdvanceSetting.NETWORK_TYPE);
                    if (this.this$0.this$0.isViewValid() && addFriendsState.isSearching()) {
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class af extends Lambda implements Function2<com.bytedance.jedi.arch.f, Throwable, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FindFriendsJediFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        af(FindFriendsJediFragment findFriendsJediFragment) {
            super(2);
            this.this$0 = findFriendsJediFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (Throwable) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull Throwable th) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{fVar2, th2}, this, changeQuickRedirect, false, 47253, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2, th2}, this, changeQuickRedirect, false, 47253, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            Intrinsics.checkParameterIsNotNull(th2, AdvanceSetting.NETWORK_TYPE);
            this.this$0.l().showPullUpLoadMore();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class ag extends Lambda implements Function2<com.bytedance.jedi.arch.f, Integer, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FindFriendsJediFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ag(FindFriendsJediFragment findFriendsJediFragment) {
            super(2);
            this.this$0 = findFriendsJediFragment;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, int i) {
            if (PatchProxy.isSupport(new Object[]{fVar, Integer.valueOf(i)}, this, changeQuickRedirect, false, 47256, new Class[]{com.bytedance.jedi.arch.f.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, Integer.valueOf(i)}, this, changeQuickRedirect, false, 47256, new Class[]{com.bytedance.jedi.arch.f.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            if (i != 1) {
                com.ss.android.ugc.aweme.common.ui.b.a((Activity) this.this$0.getActivity(), (View) (DmtEditText) this.this$0.a((int) C0906R.id.aai));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class ah extends Lambda implements Function2<com.bytedance.jedi.arch.f, Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FindFriendsJediFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ah(FindFriendsJediFragment findFriendsJediFragment) {
            super(2);
            this.this$0 = findFriendsJediFragment;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, boolean z) {
            if (PatchProxy.isSupport(new Object[]{fVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 47259, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, Byte.valueOf(z)}, this, changeQuickRedirect, false, 47259, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            if (z) {
                this.this$0.m().a("discovery_add_friends", true, 1000);
            } else {
                this.this$0.m().a(false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class ai extends Lambda implements Function2<com.bytedance.jedi.arch.f, Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FindFriendsJediFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ai(FindFriendsJediFragment findFriendsJediFragment) {
            super(2);
            this.this$0 = findFriendsJediFragment;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, boolean z) {
            if (PatchProxy.isSupport(new Object[]{fVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 47260, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, Byte.valueOf(z)}, this, changeQuickRedirect, false, 47260, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            if (z) {
                this.this$0.k().resetLoadMoreState();
            } else {
                this.this$0.k().showLoadMoreEmpty();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class aj extends Lambda implements Function1<com.bytedance.jedi.arch.f, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FindFriendsJediFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aj(FindFriendsJediFragment findFriendsJediFragment) {
            super(1);
            this.this$0 = findFriendsJediFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.bytedance.jedi.arch.f) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            if (PatchProxy.isSupport(new Object[]{fVar2}, this, changeQuickRedirect, false, 47261, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2}, this, changeQuickRedirect, false, 47261, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            ((DmtStatusView) this.this$0.a((int) C0906R.id.cvd)).d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "data", "", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class ak extends Lambda implements Function2<com.bytedance.jedi.arch.f, List<? extends Object>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FindFriendsJediFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ak(FindFriendsJediFragment findFriendsJediFragment) {
            super(2);
            this.this$0 = findFriendsJediFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (List) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull List<? extends Object> list) {
            if (PatchProxy.isSupport(new Object[]{fVar, list}, this, changeQuickRedirect, false, 47262, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, list}, this, changeQuickRedirect, false, 47262, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(list, "data");
            if (list.size() == 1) {
                ((DmtStatusView) this.this$0.a((int) C0906R.id.cvd)).e();
                return;
            }
            ((DmtStatusView) this.this$0.a((int) C0906R.id.cvd)).b();
            this.this$0.k().setShowFooter(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/profile/ui/widget/PerfectUserInfoGuide;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class al extends Lambda implements Function0<com.ss.android.ugc.aweme.profile.ui.widget.b> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FindFriendsJediFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        al(FindFriendsJediFragment findFriendsJediFragment) {
            super(0);
            this.this$0 = findFriendsJediFragment;
        }

        @NotNull
        public final com.ss.android.ugc.aweme.profile.ui.widget.b invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47263, new Class[0], com.ss.android.ugc.aweme.profile.ui.widget.b.class)) {
                return (com.ss.android.ugc.aweme.profile.ui.widget.b) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47263, new Class[0], com.ss.android.ugc.aweme.profile.ui.widget.b.class);
            }
            com.ss.android.ugc.aweme.profile.ui.widget.b bVar = new com.ss.android.ugc.aweme.profile.ui.widget.b((NoticeView) this.this$0.a((int) C0906R.id.bx8));
            bVar.a(this.this$0.getString(C0906R.string.blx));
            return bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/recommendlist/adapter/RecommendListWidgetAdapter;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class am extends Lambda implements Function0<RecommendListWidgetAdapter> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FindFriendsJediFragment this$0;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "loadMore", "com/ss/android/ugc/aweme/friends/ui/FindFriendsJediFragment$mRecommendListAdapter$2$1$1"}, k = 3, mv = {1, 1, 15})
        static final class a implements LoadMoreRecyclerViewAdapter.a {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49222a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ am f49223b;

            a(am amVar) {
                this.f49223b = amVar;
            }

            public final void loadMore() {
                if (PatchProxy.isSupport(new Object[0], this, f49222a, false, 47265, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f49222a, false, 47265, new Class[0], Void.TYPE);
                    return;
                }
                RecommendListViewModel j = this.f49223b.this$0.j();
                if (PatchProxy.isSupport(new Object[]{j}, null, com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.c.f49055a, true, 46860, new Class[]{RecommendListViewModel.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{j}, null, com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.c.f49055a, true, 46860, new Class[]{RecommendListViewModel.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(j, "$this$recommendListLoadMore");
                j.recommendListMiddleware.loadMore();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        am(FindFriendsJediFragment findFriendsJediFragment) {
            super(0);
            this.this$0 = findFriendsJediFragment;
        }

        @NotNull
        public final RecommendListWidgetAdapter invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47264, new Class[0], RecommendListWidgetAdapter.class)) {
                return (RecommendListWidgetAdapter) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47264, new Class[0], RecommendListWidgetAdapter.class);
            }
            RecommendListWidgetAdapter recommendListWidgetAdapter = new RecommendListWidgetAdapter(com.bytedance.widget.a.f22910e.a(this.this$0, FindFriendsJediFragment.a(this.this$0)), null, 2);
            recommendListWidgetAdapter.setShowFooter(false);
            recommendListWidgetAdapter.setLoadMoreListener(new a(this));
            recommendListWidgetAdapter.setLoadEmptyTextResId(C0906R.string.a3f);
            recommendListWidgetAdapter.mTextColor = this.this$0.getResources().getColor(C0906R.color.zx);
            return recommendListWidgetAdapter;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListState;", "it", "Landroid/os/Bundle;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class an extends Lambda implements Function2<RecommendListState, Bundle, RecommendListState> {
        public static final an INSTANCE = new an();
        public static ChangeQuickRedirect changeQuickRedirect;

        an() {
            super(2);
        }

        @NotNull
        public final RecommendListState invoke(@NotNull RecommendListState recommendListState, @Nullable Bundle bundle) {
            RecommendListState recommendListState2 = recommendListState;
            if (PatchProxy.isSupport(new Object[]{recommendListState2, bundle}, this, changeQuickRedirect, false, 47266, new Class[]{RecommendListState.class, Bundle.class}, RecommendListState.class)) {
                return (RecommendListState) PatchProxy.accessDispatch(new Object[]{recommendListState2, bundle}, this, changeQuickRedirect, false, 47266, new Class[]{RecommendListState.class, Bundle.class}, RecommendListState.class);
            }
            Intrinsics.checkParameterIsNotNull(recommendListState2, "$receiver");
            SharePrefCache inst = SharePrefCache.inst();
            Intrinsics.checkExpressionValueIsNotNull(inst, "SharePrefCache.inst()");
            com.ss.android.ugc.aweme.app.an<Boolean> enableFace2Face = inst.getEnableFace2Face();
            Intrinsics.checkExpressionValueIsNotNull(enableFace2Face, "SharePrefCache.inst().enableFace2Face");
            Object c2 = enableFace2Face.c();
            Intrinsics.checkExpressionValueIsNotNull(c2, "SharePrefCache.inst().enableFace2Face.cache");
            boolean booleanValue = ((Boolean) c2).booleanValue();
            int b2 = com.ss.android.ugc.aweme.message.c.c.a().b(4);
            boolean d2 = com.ss.android.ugc.aweme.message.c.c.a().d(102);
            com.ss.android.ugc.aweme.newfollow.util.k a2 = com.ss.android.ugc.aweme.newfollow.util.k.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "RecUserImpressionReporter.getInstance()");
            String b3 = a2.b();
            Intrinsics.checkExpressionValueIsNotNull(b3, "RecUserImpressionReporte…getInstance().toReportIds");
            return RecommendListState.copy$default(recommendListState, false, null, 0, 0, false, 0, 0, booleanValue, b2, d2, b3, null, null, 6271, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/recommendlist/adapter/SearchUserAdapter;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class ao extends Lambda implements Function0<SearchUserAdapter> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FindFriendsJediFragment this$0;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
        static final /* synthetic */ class a extends FunctionReference implements Function0<Unit> {
            public static ChangeQuickRedirect changeQuickRedirect;

            a(FindFriendsJediFragment findFriendsJediFragment) {
                super(0, findFriendsJediFragment);
            }

            public final String getName() {
                return "searchUserLoadMore";
            }

            public final KDeclarationContainer getOwner() {
                if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47269, new Class[0], KDeclarationContainer.class)) {
                    return Reflection.getOrCreateKotlinClass(FindFriendsJediFragment.class);
                }
                return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47269, new Class[0], KDeclarationContainer.class);
            }

            public final String getSignature() {
                return "searchUserLoadMore()V";
            }

            public final void invoke() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47268, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47268, new Class[0], Void.TYPE);
                    return;
                }
                FindFriendsJediFragment findFriendsJediFragment = (FindFriendsJediFragment) this.receiver;
                if (PatchProxy.isSupport(new Object[0], findFriendsJediFragment, FindFriendsJediFragment.f3340c, false, 47199, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], findFriendsJediFragment, FindFriendsJediFragment.f3340c, false, 47199, new Class[0], Void.TYPE);
                    return;
                }
                SearchUserListViewModel i = findFriendsJediFragment.i();
                if (PatchProxy.isSupport(new Object[]{i}, null, com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.g.f49063a, true, 46899, new Class[]{SearchUserListViewModel.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{i}, null, com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.g.f49063a, true, 46899, new Class[]{SearchUserListViewModel.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(i, "$this$searchUserListLoadMore");
                i.searchUserListMiddleware.loadMore();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ao(FindFriendsJediFragment findFriendsJediFragment) {
            super(0);
            this.this$0 = findFriendsJediFragment;
        }

        @NotNull
        public final SearchUserAdapter invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47267, new Class[0], SearchUserAdapter.class)) {
                return (SearchUserAdapter) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47267, new Class[0], SearchUserAdapter.class);
            }
            SearchUserAdapter searchUserAdapter = new SearchUserAdapter(com.bytedance.widget.a.f22910e.a(this.this$0, FindFriendsJediFragment.a(this.this$0)), null, 2);
            searchUserAdapter.setLoadMoreListener(new x(new a(this.this$0)));
            searchUserAdapter.setLoadEmptyTextResId(C0906R.string.a3f);
            return searchUserAdapter;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lbolts/Task;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class ap<TTaskResult, TContinuationResult> implements a.g<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49224a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FindFriendsJediFragment f49225b;

        ap(FindFriendsJediFragment findFriendsJediFragment) {
            this.f49225b = findFriendsJediFragment;
        }

        public final /* synthetic */ Object then(a.i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f49224a, false, 47270, new Class[]{a.i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f49224a, false, 47270, new Class[]{a.i.class}, Void.class);
            }
            FindFriendsJediFragment findFriendsJediFragment = this.f49225b;
            if (PatchProxy.isSupport(new Object[0], findFriendsJediFragment, FindFriendsJediFragment.f3340c, false, 47203, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], findFriendsJediFragment, FindFriendsJediFragment.f3340c, false, 47203, new Class[0], Void.TYPE);
            } else if (findFriendsJediFragment.isViewValid() && !com.ss.android.g.a.a() && findFriendsJediFragment.n()) {
                bp bpVar = findFriendsJediFragment.g;
                if (bpVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("noticeSp");
                }
                if (!bpVar.b(false)) {
                    FragmentActivity fragmentActivity = findFriendsJediFragment.f3343f;
                    if (fragmentActivity == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mActivity");
                    }
                    com.ss.android.ugc.aweme.ac.b.a(fragmentActivity, new String[]{"android.permission.READ_CONTACTS"}, new f(findFriendsJediFragment));
                } else {
                    if (PatchProxy.isSupport(new Object[0], findFriendsJediFragment, FindFriendsJediFragment.f3340c, false, 47206, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], findFriendsJediFragment, FindFriendsJediFragment.f3340c, false, 47206, new Class[0], Void.TYPE);
                    } else {
                        FragmentActivity fragmentActivity2 = findFriendsJediFragment.f3343f;
                        if (fragmentActivity2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mActivity");
                        }
                        new AlertDialog.Builder(fragmentActivity2, C0906R.style.kx).setTitle((int) C0906R.string.fq).setMessage((int) C0906R.string.fp).setNegativeButton((int) C0906R.string.fn, (DialogInterface.OnClickListener) aq.f49227b).setPositiveButton((int) C0906R.string.fo, (DialogInterface.OnClickListener) new ar(findFriendsJediFragment)).create().show();
                    }
                }
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class aq implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49226a;

        /* renamed from: b  reason: collision with root package name */
        public static final aq f49227b = new aq();

        aq() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f49226a, false, 47271, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f49226a, false, 47271, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            dialogInterface.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class ar implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49228a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FindFriendsJediFragment f49229b;

        ar(FindFriendsJediFragment findFriendsJediFragment) {
            this.f49229b = findFriendsJediFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f49228a, false, 47272, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f49228a, false, 47272, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            FragmentActivity fragmentActivity = this.f49229b.f3343f;
            if (fragmentActivity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mActivity");
            }
            bi.a(fragmentActivity);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0014\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0005\"\u0010\b\u0001\u0010\u0006\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0007\"\b\b\u0002\u0010\u0001*\u00020\b*\u0002H\u00012\b\u0010\t\u001a\u0004\u0018\u00010\nH\n¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"<anonymous>", "S", "T", "Landroid/support/v4/app/Fragment;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "VM", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/bytedance/jedi/arch/State;", "it", "Landroid/os/Bundle;", "invoke", "(Lcom/bytedance/jedi/arch/State;Landroid/os/Bundle;)Lcom/bytedance/jedi/arch/State;", "com/bytedance/jedi/arch/ExtensionsKt$viewModel$5"}, k = 3, mv = {1, 1, 15})
    public static final class b extends Lambda implements Function2<SearchUserListState, Bundle, SearchUserListState> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        public b() {
            super(2);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.SearchUserListState, com.bytedance.jedi.arch.x] */
        @NotNull
        public final SearchUserListState invoke(@NotNull SearchUserListState searchUserListState, @Nullable Bundle bundle) {
            SearchUserListState searchUserListState2 = searchUserListState;
            if (PatchProxy.isSupport(new Object[]{searchUserListState2, bundle}, this, changeQuickRedirect, false, 47212, new Class[]{com.bytedance.jedi.arch.x.class, Bundle.class}, com.bytedance.jedi.arch.x.class)) {
                return (com.bytedance.jedi.arch.x) PatchProxy.accessDispatch(new Object[]{searchUserListState2, bundle}, this, changeQuickRedirect, false, 47212, new Class[]{com.bytedance.jedi.arch.x.class, Bundle.class}, com.bytedance.jedi.arch.x.class);
            }
            Intrinsics.checkParameterIsNotNull(searchUserListState2, "$receiver");
            return searchUserListState2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0014\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0005\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0002\u0010\u0007*\u00020\bH\n¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"<anonymous>", "VM", "T", "Landroid/support/v4/app/Fragment;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "()Lcom/bytedance/jedi/arch/JediViewModel;", "com/bytedance/jedi/arch/ExtensionsKt$viewModel$6"}, k = 3, mv = {1, 1, 15})
    public static final class c extends Lambda implements Function0<SearchUserListViewModel> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Function2 $argumentsAcceptor;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ KClass $viewModelClass;
        final /* synthetic */ KClass $viewModelClass$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment, KClass kClass, Function2 function2, KClass kClass2) {
            super(0);
            this.$this_viewModel = fragment;
            this.$viewModelClass = kClass;
            this.$argumentsAcceptor = function2;
            this.$viewModelClass$inlined = kClass2;
        }

        /* JADX WARNING: type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.SearchUserListViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r0v6, types: [com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.SearchUserListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        @NotNull
        public final SearchUserListViewModel invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47213, new Class[0], JediViewModel.class)) {
                return (JediViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47213, new Class[0], JediViewModel.class);
            }
            ViewModelProvider of = ViewModelProviders.of(this.$this_viewModel, ((com.bytedance.jedi.arch.ae) this.$this_viewModel).r_());
            String name = kotlin.jvm.a.a(this.$viewModelClass$inlined).getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "viewModelClass.java.name");
            ? r0 = (JediViewModel) of.get(name, kotlin.jvm.a.a(this.$viewModelClass));
            com.bytedance.jedi.arch.n a2 = r0.f2282c.a(SearchUserListViewModel.class);
            if (a2 != null) {
                Intrinsics.checkExpressionValueIsNotNull(r0, "this");
                a2.binding(r0);
            }
            r0.a(new Function1<SearchUserListState, SearchUserListState>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ c this$0;

                {
                    this.this$0 = r1;
                }

                /* JADX WARNING: type inference failed for: r0v6, types: [com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.SearchUserListState, com.bytedance.jedi.arch.x] */
                /* JADX WARNING: type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.SearchUserListState, com.bytedance.jedi.arch.x] */
                @NotNull
                public final SearchUserListState invoke(@NotNull SearchUserListState searchUserListState) {
                    if (PatchProxy.isSupport(new Object[]{searchUserListState}, this, changeQuickRedirect, false, 47214, new Class[]{com.bytedance.jedi.arch.x.class}, com.bytedance.jedi.arch.x.class)) {
                        return (com.bytedance.jedi.arch.x) PatchProxy.accessDispatch(new Object[]{searchUserListState}, this, changeQuickRedirect, false, 47214, new Class[]{com.bytedance.jedi.arch.x.class}, com.bytedance.jedi.arch.x.class);
                    }
                    Intrinsics.checkParameterIsNotNull(searchUserListState, "$this$initialize");
                    return (com.bytedance.jedi.arch.x) this.this$0.$argumentsAcceptor.invoke(searchUserListState, this.this$0.$this_viewModel.getArguments());
                }
            });
            return r0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0014\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0005\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0002\u0010\u0007*\u00020\bH\n¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"<anonymous>", "VM", "T", "Landroid/support/v4/app/Fragment;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "()Lcom/bytedance/jedi/arch/JediViewModel;", "com/bytedance/jedi/arch/ExtensionsKt$viewModel$6"}, k = 3, mv = {1, 1, 15})
    public static final class d extends Lambda implements Function0<RecommendListViewModel> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Function2 $argumentsAcceptor;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ KClass $viewModelClass;
        final /* synthetic */ KClass $viewModelClass$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment, KClass kClass, Function2 function2, KClass kClass2) {
            super(0);
            this.$this_viewModel = fragment;
            this.$viewModelClass = kClass;
            this.$argumentsAcceptor = function2;
            this.$viewModelClass$inlined = kClass2;
        }

        /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListViewModel] */
        /* JADX WARNING: type inference failed for: r0v6, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListViewModel] */
        @NotNull
        public final RecommendListViewModel invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 47215, new Class[0], JediViewModel.class)) {
                return (JediViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 47215, new Class[0], JediViewModel.class);
            }
            ViewModelProvider of = ViewModelProviders.of(this.$this_viewModel, ((com.bytedance.jedi.arch.ae) this.$this_viewModel).r_());
            String name = kotlin.jvm.a.a(this.$viewModelClass$inlined).getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "viewModelClass.java.name");
            ? r0 = (JediViewModel) of.get(name, kotlin.jvm.a.a(this.$viewModelClass));
            com.bytedance.jedi.arch.n a2 = r0.f2282c.a(RecommendListViewModel.class);
            if (a2 != null) {
                Intrinsics.checkExpressionValueIsNotNull(r0, "this");
                a2.binding(r0);
            }
            r0.a(new Function1<RecommendListState, RecommendListState>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ d this$0;

                {
                    this.this$0 = r1;
                }

                /* JADX WARNING: type inference failed for: r0v6, types: [com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListState, com.bytedance.jedi.arch.x] */
                /* JADX WARNING: type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListState, com.bytedance.jedi.arch.x] */
                @NotNull
                public final RecommendListState invoke(@NotNull RecommendListState recommendListState) {
                    if (PatchProxy.isSupport(new Object[]{recommendListState}, this, changeQuickRedirect, false, 47216, new Class[]{com.bytedance.jedi.arch.x.class}, com.bytedance.jedi.arch.x.class)) {
                        return (com.bytedance.jedi.arch.x) PatchProxy.accessDispatch(new Object[]{recommendListState}, this, changeQuickRedirect, false, 47216, new Class[]{com.bytedance.jedi.arch.x.class}, com.bytedance.jedi.arch.x.class);
                    }
                    Intrinsics.checkParameterIsNotNull(recommendListState, "$this$initialize");
                    return (com.bytedance.jedi.arch.x) this.this$0.$argumentsAcceptor.invoke(recommendListState, this.this$0.$this_viewModel.getArguments());
                }
            });
            return r0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/ui/FindFriendsJediFragment$Companion;", "", "()V", "BUNDLE_PUID", "", "BUNDLE_RECOMMEND_COUNT", "BUNDLE_RECOMMEND_USER_TYPE", "CODE_GET_CONTACTS_PERMISSION", "", "HEADER_VIEW_COUNT", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "newRecommendCount", "recommendUserType", "enterFrom", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49230a;

        private e() {
        }

        public /* synthetic */ e(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Intent a(@NotNull Context context, int i, int i2, @NotNull String str) {
            Context context2 = context;
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f49230a, false, 47217, new Class[]{Context.class, Integer.TYPE, Integer.TYPE, String.class}, Intent.class)) {
                return (Intent) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f49230a, false, 47217, new Class[]{Context.class, Integer.TYPE, Integer.TYPE, String.class}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(context2, "context");
            Intrinsics.checkParameterIsNotNull(str2, "enterFrom");
            Intent intent = new Intent(context2, AddFriendsActivity.class);
            intent.putExtra("bundle_recommend_count", i);
            intent.putExtra("bundle_recommend_user_type", i2);
            intent.putExtra("enter_from", str2);
            intent.putExtra("index", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            return intent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012,\u0010\u0002\u001a(\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "permissions", "", "", "kotlin.jvm.PlatformType", "grantResults", "", "onRequestPermissionResult", "([Ljava/lang/String;[I)V"}, k = 3, mv = {1, 1, 15})
    static final class f implements b.C0400b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49231a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FindFriendsJediFragment f49232b;

        f(FindFriendsJediFragment findFriendsJediFragment) {
            this.f49232b = findFriendsJediFragment;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(java.lang.String[] r20, int[] r21) {
            /*
                r19 = this;
                r1 = r21
                r2 = 2
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r10 = 0
                r3[r10] = r20
                r11 = 1
                r3[r11] = r1
                com.meituan.robust.ChangeQuickRedirect r5 = f49231a
                java.lang.Class[] r8 = new java.lang.Class[r2]
                java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
                r8[r10] = r4
                java.lang.Class<int[]> r4 = int[].class
                r8[r11] = r4
                java.lang.Class r9 = java.lang.Void.TYPE
                r6 = 0
                r7 = 47218(0xb872, float:6.6167E-41)
                r4 = r19
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
                if (r3 == 0) goto L_0x0045
                java.lang.Object[] r12 = new java.lang.Object[r2]
                r12[r10] = r20
                r12[r11] = r1
                com.meituan.robust.ChangeQuickRedirect r14 = f49231a
                r15 = 0
                r16 = 47218(0xb872, float:6.6167E-41)
                java.lang.Class[] r0 = new java.lang.Class[r2]
                java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
                r0[r10] = r1
                java.lang.Class<int[]> r1 = int[].class
                r0[r11] = r1
                java.lang.Class r18 = java.lang.Void.TYPE
                r13 = r19
                r17 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                return
            L_0x0045:
                java.lang.String r0 = "grantResults"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r0)
                int r0 = r1.length
                if (r0 != 0) goto L_0x004f
                r0 = 1
                goto L_0x0050
            L_0x004f:
                r0 = 0
            L_0x0050:
                r0 = r0 ^ r11
                if (r0 == 0) goto L_0x0069
                r0 = r1[r10]
                r1 = -1
                if (r0 != r1) goto L_0x0069
                r0 = r19
                com.ss.android.ugc.aweme.friends.ui.FindFriendsJediFragment r1 = r0.f49232b
                com.ss.android.ugc.aweme.main.bp r1 = r1.g
                if (r1 != 0) goto L_0x0065
                java.lang.String r2 = "noticeSp"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            L_0x0065:
                r1.c((boolean) r11)
                goto L_0x006b
            L_0x0069:
                r0 = r19
            L_0x006b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.ui.FindFriendsJediFragment.f.a(java.lang.String[], int[]):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49233a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FindFriendsJediFragment f49234b;

        g(FindFriendsJediFragment findFriendsJediFragment) {
            this.f49234b = findFriendsJediFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f49233a, false, 47219, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f49233a, false, 47219, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            ((DmtStatusView) this.f49234b.a((int) C0906R.id.cvd)).d();
            com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.c.a(this.f49234b.j());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49235a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FindFriendsJediFragment f49236b;

        h(FindFriendsJediFragment findFriendsJediFragment) {
            this.f49236b = findFriendsJediFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f49235a, false, 47220, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f49235a, false, 47220, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f49236b.i().a(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49237a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FindFriendsJediFragment f49238b;

        i(FindFriendsJediFragment findFriendsJediFragment) {
            this.f49238b = findFriendsJediFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f49237a, false, 47221, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f49237a, false, 47221, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f49238b.i().a(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49239a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FindFriendsJediFragment f49240b;

        j(FindFriendsJediFragment findFriendsJediFragment) {
            this.f49240b = findFriendsJediFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f49239a, false, 47222, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f49239a, false, 47222, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f49240b.a(this.f49240b.h(), new Function1<AddFriendsState, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ j this$0;

                {
                    this.this$0 = r1;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((AddFriendsState) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull AddFriendsState addFriendsState) {
                    AddFriendsState addFriendsState2 = addFriendsState;
                    if (PatchProxy.isSupport(new Object[]{addFriendsState2}, this, changeQuickRedirect, false, 47223, new Class[]{AddFriendsState.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{addFriendsState2}, this, changeQuickRedirect, false, 47223, new Class[]{AddFriendsState.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(addFriendsState2, AdvanceSetting.NETWORK_TYPE);
                    if (addFriendsState.isSearching()) {
                        this.this$0.f49240b.i().a(true);
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49241a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FindFriendsJediFragment f49242b;

        k(FindFriendsJediFragment findFriendsJediFragment) {
            this.f49242b = findFriendsJediFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f49241a, false, 47224, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f49241a, false, 47224, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f49242b.i().a("");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, k = 3, mv = {1, 1, 15})
    static final class l implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49243a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FindFriendsJediFragment f49244b;

        l(FindFriendsJediFragment findFriendsJediFragment) {
            this.f49244b = findFriendsJediFragment;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f49243a, false, 47225, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f49243a, false, 47225, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
            if (motionEvent.getAction() == 1) {
                this.f49244b.a(this.f49244b.h(), new Function1<AddFriendsState, Unit>(this) {
                    public static ChangeQuickRedirect changeQuickRedirect;
                    final /* synthetic */ l this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((AddFriendsState) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull AddFriendsState addFriendsState) {
                        if (PatchProxy.isSupport(new Object[]{addFriendsState}, this, changeQuickRedirect, false, 47226, new Class[]{AddFriendsState.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{addFriendsState}, this, changeQuickRedirect, false, 47226, new Class[]{AddFriendsState.class}, Void.TYPE);
                            return;
                        }
                        Intrinsics.checkParameterIsNotNull(addFriendsState, AdvanceSetting.NETWORK_TYPE);
                        this.this$0.f49244b.i().a(false);
                        if (!addFriendsState.isSearching()) {
                            this.this$0.f49244b.h().a(true);
                        }
                    }
                });
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/ugc/aweme/friends/ui/FindFriendsJediFragment$initSearchList$6", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class m implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49245a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FindFriendsJediFragment f49246b;

        public final void afterTextChanged(@NotNull Editable editable) {
            Editable editable2 = editable;
            if (PatchProxy.isSupport(new Object[]{editable2}, this, f49245a, false, 47229, new Class[]{Editable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{editable2}, this, f49245a, false, 47229, new Class[]{Editable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(editable2, NotifyType.SOUND);
        }

        public final void beforeTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
            CharSequence charSequence2 = charSequence;
            if (PatchProxy.isSupport(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f49245a, false, 47227, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f49245a, false, 47227, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(charSequence2, NotifyType.SOUND);
        }

        m(FindFriendsJediFragment findFriendsJediFragment) {
            this.f49246b = findFriendsJediFragment;
        }

        public final void onTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
            CharSequence charSequence2 = charSequence;
            if (PatchProxy.isSupport(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f49245a, false, 47228, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f49245a, false, 47228, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(charSequence, NotifyType.SOUND);
            if (!TextUtils.isEmpty(charSequence)) {
                this.f49246b.i().a(charSequence.toString());
            } else {
                this.f49246b.i().a("");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "v", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "event", "Landroid/view/KeyEvent;", "onEditorAction"}, k = 3, mv = {1, 1, 15})
    static final class n implements TextView.OnEditorActionListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49247a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FindFriendsJediFragment f49248b;

        n(FindFriendsJediFragment findFriendsJediFragment) {
            this.f49248b = findFriendsJediFragment;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (PatchProxy.isSupport(new Object[]{textView, Integer.valueOf(i), keyEvent}, this, f49247a, false, 47230, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{textView, Integer.valueOf(i), keyEvent}, this, f49247a, false, 47230, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
            } else if (i == 3) {
                this.f49248b.i().a(true);
                return true;
            } else {
                return false;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001R+\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR1\u0010\r\u001a\u001f\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b¨\u0006\u0010¸\u0006\u0000"}, d2 = {"com/bytedance/jedi/arch/ext/list/ListListenerKt$ListListener$4", "Lcom/bytedance/jedi/arch/ext/list/ListListener;", "onError", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getOnError", "()Lkotlin/jvm/functions/Function2;", "onLoading", "Lkotlin/Function1;", "getOnLoading", "()Lkotlin/jvm/functions/Function1;", "onSuccess", "", "getOnSuccess", "ext_list_release"}, k = 1, mv = {1, 1, 15})
    public static final class o implements com.bytedance.jedi.arch.ext.list.c<Object, com.bytedance.jedi.arch.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function1 f49249a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f49250b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function2 f49251c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        private final Function1<com.bytedance.jedi.arch.f, Unit> f49252d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> f49253e;
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, List<? extends Object>, Unit> f49254f;

        @NotNull
        public final Function1<com.bytedance.jedi.arch.f, Unit> a() {
            return this.f49252d;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> b() {
            return this.f49253e;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, List<? extends Object>, Unit> c() {
            return this.f49254f;
        }

        public o(Function1 function1, Function2 function2, Function2 function22) {
            this.f49249a = function1;
            this.f49250b = function2;
            this.f49251c = function22;
            this.f49252d = function1;
            this.f49253e = function2;
            this.f49254f = function22;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001R+\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR1\u0010\r\u001a\u001f\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b¨\u0006\u0010¸\u0006\u0000"}, d2 = {"com/bytedance/jedi/arch/ext/list/ListListenerKt$ListListener$4", "Lcom/bytedance/jedi/arch/ext/list/ListListener;", "onError", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getOnError", "()Lkotlin/jvm/functions/Function2;", "onLoading", "Lkotlin/Function1;", "getOnLoading", "()Lkotlin/jvm/functions/Function1;", "onSuccess", "", "getOnSuccess", "ext_list_release"}, k = 1, mv = {1, 1, 15})
    public static final class p implements com.bytedance.jedi.arch.ext.list.c<Object, com.bytedance.jedi.arch.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function1 f49255a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f49256b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function2 f49257c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        private final Function1<com.bytedance.jedi.arch.f, Unit> f49258d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> f49259e;
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, List<? extends Object>, Unit> f49260f;

        @NotNull
        public final Function1<com.bytedance.jedi.arch.f, Unit> a() {
            return this.f49258d;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> b() {
            return this.f49259e;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, List<? extends Object>, Unit> c() {
            return this.f49260f;
        }

        public p(Function1 function1, Function2 function2, Function2 function22) {
            this.f49255a = function1;
            this.f49256b = function2;
            this.f49257c = function22;
            this.f49258d = function1;
            this.f49259e = function2;
            this.f49260f = function22;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001R+\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR1\u0010\r\u001a\u001f\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b¨\u0006\u0010¸\u0006\u0000"}, d2 = {"com/bytedance/jedi/arch/ext/list/ListListenerKt$ListListener$4", "Lcom/bytedance/jedi/arch/ext/list/ListListener;", "onError", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getOnError", "()Lkotlin/jvm/functions/Function2;", "onLoading", "Lkotlin/Function1;", "getOnLoading", "()Lkotlin/jvm/functions/Function1;", "onSuccess", "", "getOnSuccess", "ext_list_release"}, k = 1, mv = {1, 1, 15})
    public static final class q implements com.bytedance.jedi.arch.ext.list.c<SearchUser, com.bytedance.jedi.arch.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function1 f49261a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f49262b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function2 f49263c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        private final Function1<com.bytedance.jedi.arch.f, Unit> f49264d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> f49265e;
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, List<? extends SearchUser>, Unit> f49266f;

        @NotNull
        public final Function1<com.bytedance.jedi.arch.f, Unit> a() {
            return this.f49264d;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> b() {
            return this.f49265e;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, List<? extends SearchUser>, Unit> c() {
            return this.f49266f;
        }

        public q(Function1 function1, Function2 function2, Function2 function22) {
            this.f49261a = function1;
            this.f49262b = function2;
            this.f49263c = function22;
            this.f49264d = function1;
            this.f49265e = function2;
            this.f49266f = function22;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001R+\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR1\u0010\r\u001a\u001f\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b¨\u0006\u0010¸\u0006\u0000"}, d2 = {"com/bytedance/jedi/arch/ext/list/ListListenerKt$ListListener$4", "Lcom/bytedance/jedi/arch/ext/list/ListListener;", "onError", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getOnError", "()Lkotlin/jvm/functions/Function2;", "onLoading", "Lkotlin/Function1;", "getOnLoading", "()Lkotlin/jvm/functions/Function1;", "onSuccess", "", "getOnSuccess", "ext_list_release"}, k = 1, mv = {1, 1, 15})
    public static final class r implements com.bytedance.jedi.arch.ext.list.c<SearchUser, com.bytedance.jedi.arch.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function1 f49267a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f49268b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function2 f49269c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        private final Function1<com.bytedance.jedi.arch.f, Unit> f49270d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> f49271e;
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, List<? extends SearchUser>, Unit> f49272f;

        @NotNull
        public final Function1<com.bytedance.jedi.arch.f, Unit> a() {
            return this.f49270d;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> b() {
            return this.f49271e;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, List<? extends SearchUser>, Unit> c() {
            return this.f49272f;
        }

        public r(Function1 function1, Function2 function2, Function2 function22) {
            this.f49267a = function1;
            this.f49268b = function2;
            this.f49269c = function22;
            this.f49270d = function1;
            this.f49271e = function2;
            this.f49272f = function22;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class s extends Lambda implements Function2<com.bytedance.jedi.arch.f, Throwable, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FindFriendsJediFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(FindFriendsJediFragment findFriendsJediFragment) {
            super(2);
            this.this$0 = findFriendsJediFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (Throwable) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull Throwable th) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{fVar2, th2}, this, changeQuickRedirect, false, 47233, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2, th2}, this, changeQuickRedirect, false, 47233, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            Intrinsics.checkParameterIsNotNull(th2, AdvanceSetting.NETWORK_TYPE);
            ((DmtStatusView) this.this$0.a((int) C0906R.id.cvd)).f();
            RecommendListViewModel j = this.this$0.j();
            if (PatchProxy.isSupport(new Object[0], j, RecommendListViewModel.f49017d, false, 46821, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], j, RecommendListViewModel.f49017d, false, 46821, new Class[0], Void.TYPE);
                return;
            }
            j.b(new RecommendListViewModel.c(j));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class t extends Lambda implements Function1<com.bytedance.jedi.arch.f, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FindFriendsJediFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(FindFriendsJediFragment findFriendsJediFragment) {
            super(1);
            this.this$0 = findFriendsJediFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.bytedance.jedi.arch.f) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            if (PatchProxy.isSupport(new Object[]{fVar2}, this, changeQuickRedirect, false, 47234, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2}, this, changeQuickRedirect, false, 47234, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            this.this$0.k().showLoadMoreLoading();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class u extends Lambda implements Function2<com.bytedance.jedi.arch.f, List<? extends Object>, Unit> {
        public static final u INSTANCE = new u();
        public static ChangeQuickRedirect changeQuickRedirect;

        u() {
            super(2);
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull List<? extends Object> list) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            List<? extends Object> list2 = list;
            if (PatchProxy.isSupport(new Object[]{fVar2, list2}, this, changeQuickRedirect, false, 47235, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2, list2}, this, changeQuickRedirect, false, 47235, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            Intrinsics.checkParameterIsNotNull(list2, AdvanceSetting.NETWORK_TYPE);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (List) obj2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class v extends Lambda implements Function2<com.bytedance.jedi.arch.f, Throwable, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FindFriendsJediFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(FindFriendsJediFragment findFriendsJediFragment) {
            super(2);
            this.this$0 = findFriendsJediFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (Throwable) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull Throwable th) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{fVar2, th2}, this, changeQuickRedirect, false, 47236, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2, th2}, this, changeQuickRedirect, false, 47236, new Class[]{com.bytedance.jedi.arch.f.class, Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            Intrinsics.checkParameterIsNotNull(th2, AdvanceSetting.NETWORK_TYPE);
            this.this$0.k().showPullUpLoadMore();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class w extends Lambda implements Function2<com.bytedance.jedi.arch.f, Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FindFriendsJediFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(FindFriendsJediFragment findFriendsJediFragment) {
            super(2);
            this.this$0 = findFriendsJediFragment;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, boolean z) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            if (PatchProxy.isSupport(new Object[]{fVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 47239, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2, Byte.valueOf(z)}, this, changeQuickRedirect, false, 47239, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            if (z) {
                com.ss.android.ugc.aweme.common.ui.b.a((Activity) this.this$0.getActivity(), (View) (DmtEditText) this.this$0.a((int) C0906R.id.aai));
                DmtTextView dmtTextView = (DmtTextView) this.this$0.a((int) C0906R.id.di7);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "tv_search_hit");
                dmtTextView.setVisibility(8);
                this.this$0.l().resetLoadMoreState();
                SearchUserListViewModel i = this.this$0.i();
                if (PatchProxy.isSupport(new Object[0], i, SearchUserListViewModel.f49040d, false, 46876, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], i, SearchUserListViewModel.f49040d, false, 46876, new Class[0], Void.TYPE);
                } else {
                    i.b(new SearchUserListViewModel.f(i));
                }
            } else {
                DmtTextView dmtTextView2 = (DmtTextView) this.this$0.a((int) C0906R.id.di7);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "tv_search_hit");
                if (!TextUtils.isEmpty(dmtTextView2.getText())) {
                    ((DmtStatusView) this.this$0.a((int) C0906R.id.cvd)).b();
                    DmtTextView dmtTextView3 = (DmtTextView) this.this$0.a((int) C0906R.id.di7);
                    Intrinsics.checkExpressionValueIsNotNull(dmtTextView3, "tv_search_hit");
                    dmtTextView3.setVisibility(0);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class x extends Lambda implements Function2<com.bytedance.jedi.arch.f, String, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FindFriendsJediFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(FindFriendsJediFragment findFriendsJediFragment) {
            super(2);
            this.this$0 = findFriendsJediFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (String) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull String str) {
            if (PatchProxy.isSupport(new Object[]{fVar, str}, this, changeQuickRedirect, false, 47242, new Class[]{com.bytedance.jedi.arch.f.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, str}, this, changeQuickRedirect, false, 47242, new Class[]{com.bytedance.jedi.arch.f.class, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(str, AdvanceSetting.NETWORK_TYPE);
            if (!TextUtils.isEmpty(str)) {
                ImageButton imageButton = (ImageButton) this.this$0.a((int) C0906R.id.ns);
                Intrinsics.checkExpressionValueIsNotNull(imageButton, "btn_clear");
                imageButton.setVisibility(0);
                DmtTextView dmtTextView = (DmtTextView) this.this$0.a((int) C0906R.id.di7);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "tv_search_hit");
                dmtTextView.setVisibility(0);
                SpannableString spannableString = new SpannableString(this.this$0.i + 65306 + str);
                u.a(spannableString, this.this$0.k, 0, this.this$0.i.length() + 1, 17);
                DmtTextView dmtTextView2 = (DmtTextView) this.this$0.a((int) C0906R.id.di7);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "tv_search_hit");
                dmtTextView2.setText(spannableString);
                return;
            }
            DmtTextView dmtTextView3 = (DmtTextView) this.this$0.a((int) C0906R.id.di7);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView3, "tv_search_hit");
            dmtTextView3.setVisibility(8);
            ImageButton imageButton2 = (ImageButton) this.this$0.a((int) C0906R.id.ns);
            Intrinsics.checkExpressionValueIsNotNull(imageButton2, "btn_clear");
            imageButton2.setVisibility(8);
            DmtTextView dmtTextView4 = (DmtTextView) this.this$0.a((int) C0906R.id.di7);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView4, "tv_search_hit");
            dmtTextView4.setText("");
            DmtEditText dmtEditText = (DmtEditText) this.this$0.a((int) C0906R.id.aai);
            Intrinsics.checkExpressionValueIsNotNull(dmtEditText, "et_search_kw");
            Editable text = dmtEditText.getText();
            if (text == null) {
                Intrinsics.throwNpe();
            }
            text.clear();
            this.this$0.l().resetLoadMoreState();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class y extends Lambda implements Function2<com.bytedance.jedi.arch.f, Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FindFriendsJediFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(FindFriendsJediFragment findFriendsJediFragment) {
            super(2);
            this.this$0 = findFriendsJediFragment;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, boolean z) {
            if (PatchProxy.isSupport(new Object[]{fVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 47244, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, Byte.valueOf(z)}, this, changeQuickRedirect, false, 47244, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            if (z) {
                this.this$0.l().resetLoadMoreState();
            } else {
                this.this$0.l().showLoadMoreEmpty();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class z extends Lambda implements Function1<com.bytedance.jedi.arch.f, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FindFriendsJediFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(FindFriendsJediFragment findFriendsJediFragment) {
            super(1);
            this.this$0 = findFriendsJediFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.bytedance.jedi.arch.f) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            if (PatchProxy.isSupport(new Object[]{fVar2}, this, changeQuickRedirect, false, 47245, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2}, this, changeQuickRedirect, false, 47245, new Class[]{com.bytedance.jedi.arch.f.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            ((DmtStatusView) this.this$0.a((int) C0906R.id.cvd)).d();
        }
    }

    @JvmStatic
    @NotNull
    public static final Intent a(@NotNull Context context, int i2, int i3, @NotNull String str) {
        Context context2 = context;
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i2), Integer.valueOf(i3), str2}, null, f3340c, true, 47210, new Class[]{Context.class, Integer.TYPE, Integer.TYPE, String.class}, Intent.class)) {
            return l.a(context2, i2, i3, str2);
        }
        return (Intent) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i2), Integer.valueOf(i3), str2}, null, f3340c, true, 47210, new Class[]{Context.class, Integer.TYPE, Integer.TYPE, String.class}, Intent.class);
    }

    public final View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3340c, false, 47208, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3340c, false, 47208, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.t == null) {
            this.t = new HashMap();
        }
        View view = (View) this.t.get(Integer.valueOf(i2));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i2);
            this.t.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f3340c, false, 47209, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3340c, false, 47209, new Class[0], Void.TYPE);
            return;
        }
        if (this.t != null) {
            this.t.clear();
        }
    }

    public final AddFriendsViewModel h() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f3340c, false, 47186, new Class[0], AddFriendsViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f3340c, false, 47186, new Class[0], AddFriendsViewModel.class);
        } else {
            value = this.m.getValue();
        }
        return (AddFriendsViewModel) value;
    }

    public final SearchUserListViewModel i() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f3340c, false, 47187, new Class[0], SearchUserListViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f3340c, false, 47187, new Class[0], SearchUserListViewModel.class);
        } else {
            value = this.n.getValue();
        }
        return (SearchUserListViewModel) value;
    }

    public final boolean isRegisterEventBus() {
        return true;
    }

    public final RecommendListViewModel j() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f3340c, false, 47188, new Class[0], RecommendListViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f3340c, false, 47188, new Class[0], RecommendListViewModel.class);
        } else {
            value = this.o.getValue();
        }
        return (RecommendListViewModel) value;
    }

    public final RecommendListWidgetAdapter k() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f3340c, false, 47189, new Class[0], RecommendListWidgetAdapter.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f3340c, false, 47189, new Class[0], RecommendListWidgetAdapter.class);
        } else {
            value = this.p.getValue();
        }
        return (RecommendListWidgetAdapter) value;
    }

    public final SearchUserAdapter l() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f3340c, false, 47190, new Class[0], SearchUserAdapter.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f3340c, false, 47190, new Class[0], SearchUserAdapter.class);
        } else {
            value = this.q.getValue();
        }
        return (SearchUserAdapter) value;
    }

    public final com.ss.android.ugc.aweme.profile.ui.widget.b m() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f3340c, false, 47191, new Class[0], com.ss.android.ugc.aweme.profile.ui.widget.b.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f3340c, false, 47191, new Class[0], com.ss.android.ugc.aweme.profile.ui.widget.b.class);
        } else {
            value = this.r.getValue();
        }
        return (com.ss.android.ugc.aweme.profile.ui.widget.b) value;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        g();
    }

    public FindFriendsJediFragment() {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AddFriendsViewModel.class);
        this.m = LazyKt.lazy(new a(this, orCreateKotlinClass, orCreateKotlinClass));
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(SearchUserListViewModel.class);
        LifecycleOwner lifecycleOwner = this;
        this.n = new lifecycleAwareLazy(lifecycleOwner, new c(this, orCreateKotlinClass2, b.INSTANCE, orCreateKotlinClass2));
        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(RecommendListViewModel.class);
        this.o = new lifecycleAwareLazy(lifecycleOwner, new d(this, orCreateKotlinClass3, an.INSTANCE, orCreateKotlinClass3));
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3340c, false, 47195, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3340c, false, 47195, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        j().a(com.ss.android.ugc.aweme.message.c.c.a().b(4));
        j().b(com.ss.android.ugc.aweme.message.c.c.a().d(102));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004d, code lost:
        if (r1.intValue() != 0) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean n() {
        /*
            r13 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f3340c
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 47205(0xb865, float:6.6148E-41)
            r2 = r13
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002c
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f3340c
            r5 = 0
            r6 = 47205(0xb865, float:6.6148E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = r13
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x002c:
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r1 = com.ss.android.ugc.aweme.global.config.settings.g.b()     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r2 = "SettingsReader.get()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)     // Catch:{ Exception -> 0x00d6 }
            java.lang.Integer r1 = r1.aT()     // Catch:{ Exception -> 0x00d6 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r2 = com.ss.android.ugc.aweme.global.config.settings.g.b()     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r3 = "SettingsReader.get()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)     // Catch:{ Exception -> 0x00d6 }
            java.lang.Integer r2 = r2.aU()     // Catch:{ Exception -> 0x00d6 }
            if (r1 != 0) goto L_0x0049
            goto L_0x004f
        L_0x0049:
            int r3 = r1.intValue()     // Catch:{ Exception -> 0x00d6 }
            if (r3 == 0) goto L_0x00d5
        L_0x004f:
            if (r2 != 0) goto L_0x0052
            goto L_0x005a
        L_0x0052:
            int r3 = r2.intValue()     // Catch:{ Exception -> 0x00d6 }
            if (r3 != 0) goto L_0x005a
            goto L_0x00d5
        L_0x005a:
            com.ss.android.ugc.aweme.main.bp r3 = r13.g     // Catch:{ Exception -> 0x00d6 }
            if (r3 != 0) goto L_0x0063
            java.lang.String r4 = "noticeSp"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)     // Catch:{ Exception -> 0x00d6 }
        L_0x0063:
            r4 = 0
            long r6 = r3.a((long) r4)     // Catch:{ Exception -> 0x00d6 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00d6 }
            r3 = 0
            long r10 = r8 - r6
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x00d6 }
            int r2 = r2 * 1000
            long r2 = (long) r2     // Catch:{ Exception -> 0x00d6 }
            int r12 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r12 >= 0) goto L_0x007c
            return r0
        L_0x007c:
            com.ss.android.ugc.aweme.main.bp r2 = r13.g     // Catch:{ Exception -> 0x00d6 }
            if (r2 != 0) goto L_0x0085
            java.lang.String r3 = "noticeSp"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)     // Catch:{ Exception -> 0x00d6 }
        L_0x0085:
            int r2 = r2.c((int) r0)     // Catch:{ Exception -> 0x00d6 }
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x009d
            java.lang.String r3 = "countLimit"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)     // Catch:{ Exception -> 0x00d6 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x00d6 }
            int r1 = kotlin.jvm.internal.Intrinsics.compare((int) r2, (int) r1)     // Catch:{ Exception -> 0x00d6 }
            if (r1 >= 0) goto L_0x009d
            return r0
        L_0x009d:
            com.ss.android.ugc.aweme.main.bp r1 = r13.g     // Catch:{ Exception -> 0x00d6 }
            if (r1 != 0) goto L_0x00a6
            java.lang.String r2 = "noticeSp"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)     // Catch:{ Exception -> 0x00d6 }
        L_0x00a6:
            int r1 = r1.a((int) r0)     // Catch:{ Exception -> 0x00d6 }
            r2 = 4
            if (r1 < r2) goto L_0x00ae
            return r0
        L_0x00ae:
            com.ss.android.ugc.aweme.main.bp r2 = r13.g     // Catch:{ Exception -> 0x00d6 }
            if (r2 != 0) goto L_0x00b7
            java.lang.String r3 = "noticeSp"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)     // Catch:{ Exception -> 0x00d6 }
        L_0x00b7:
            r2.b((long) r8)     // Catch:{ Exception -> 0x00d6 }
            com.ss.android.ugc.aweme.main.bp r2 = r13.g     // Catch:{ Exception -> 0x00d6 }
            if (r2 != 0) goto L_0x00c3
            java.lang.String r3 = "noticeSp"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)     // Catch:{ Exception -> 0x00d6 }
        L_0x00c3:
            r3 = 1
            int r1 = r1 + r3
            r2.b((int) r1)     // Catch:{ Exception -> 0x00d6 }
            com.ss.android.ugc.aweme.main.bp r1 = r13.g     // Catch:{ Exception -> 0x00d6 }
            if (r1 != 0) goto L_0x00d1
            java.lang.String r2 = "noticeSp"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)     // Catch:{ Exception -> 0x00d6 }
        L_0x00d1:
            r1.d(r0)     // Catch:{ Exception -> 0x00d6 }
            return r3
        L_0x00d5:
            return r0
        L_0x00d6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.ui.FindFriendsJediFragment.n():boolean");
    }

    public static final /* synthetic */ View a(FindFriendsJediFragment findFriendsJediFragment) {
        View view = findFriendsJediFragment.f3342e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return view;
    }

    @Subscribe
    public final void onHidePerfectInfoGuideEvent(@NotNull com.ss.android.ugc.aweme.profile.a.c cVar) {
        com.ss.android.ugc.aweme.profile.a.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f3340c, false, 47202, new Class[]{com.ss.android.ugc.aweme.profile.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f3340c, false, 47202, new Class[]{com.ss.android.ugc.aweme.profile.a.c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cVar2, "event");
        switch (cVar2.f61228a) {
            case 0:
                j().a(false);
                return;
            case 1:
                if (!m().f63118d) {
                    j().a(false);
                    break;
                }
                break;
            case 2:
                if (m().f63118d) {
                    j().a(false);
                    return;
                }
                break;
        }
    }

    @Subscribe
    public final void onNotificationIndicatorEvent(@NotNull com.ss.android.ugc.aweme.message.b.c cVar) {
        com.ss.android.ugc.aweme.message.b.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f3340c, false, 47201, new Class[]{com.ss.android.ugc.aweme.message.b.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f3340c, false, 47201, new Class[]{com.ss.android.ugc.aweme.message.b.c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cVar2, "notification");
        int i2 = cVar2.f55358a;
        if (i2 != 4) {
            if (i2 == 102) {
                j().b(com.ss.android.ugc.aweme.message.c.c.a().d(cVar2.f55358a));
            }
            return;
        }
        j().a(com.ss.android.ugc.aweme.message.c.c.a().b(cVar2.f55358a));
    }

    public final void setUserVisibleHint(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3340c, false, 47207, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3340c, false, 47207, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z2);
        if (z2 && !this.s) {
            a.i.a(500).a((a.g<TResult, TContinuationResult>) new ap<TResult,TContinuationResult>(this), a.i.f1052b);
            this.s = true;
        }
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3340c, false, 47200, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3340c, false, 47200, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        LinearLayout linearLayout = (LinearLayout) a((int) C0906R.id.cld);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "search_group");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams != null) {
            AppBarLayout.LayoutParams layoutParams2 = (AppBarLayout.LayoutParams) layoutParams;
            if (z2) {
                layoutParams2.setScrollFlags(1);
            } else {
                layoutParams2.setScrollFlags(0);
                ((AppBarLayout) a((int) C0906R.id.fc)).setExpanded(true);
            }
            LinearLayout linearLayout2 = (LinearLayout) a((int) C0906R.id.cld);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "search_group");
            linearLayout2.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.design.widget.AppBarLayout.LayoutParams");
    }

    public final void onAttach(@Nullable Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f3340c, false, 47194, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f3340c, false, 47194, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        super.onAttach(context);
        if (context != null) {
            this.f3343f = (FragmentActivity) context;
            FragmentActivity fragmentActivity = this.f3343f;
            if (fragmentActivity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mActivity");
            }
            Intent intent = fragmentActivity.getIntent();
            if (intent != null) {
                int intExtra = intent.getIntExtra("bundle_recommend_count", 0);
                String stringExtra = intent.getStringExtra("bundle_puid");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                RecommendListViewModel j2 = j();
                int intExtra2 = intent.getIntExtra("bundle_recommend_user_type", 1);
                if (PatchProxy.isSupport(new Object[]{stringExtra, Integer.valueOf(intExtra), Integer.valueOf(intExtra2)}, j2, RecommendListViewModel.f49017d, false, 46812, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    RecommendListViewModel recommendListViewModel = j2;
                    PatchProxy.accessDispatch(new Object[]{stringExtra, Integer.valueOf(intExtra), Integer.valueOf(intExtra2)}, recommendListViewModel, RecommendListViewModel.f49017d, false, 46812, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(stringExtra, "puid");
                    j2.c(new RecommendListViewModel.q(stringExtra, intExtra2, intExtra));
                }
            }
            this.k = new ForegroundColorSpan(getResources().getColor(C0906R.color.zy));
            FragmentActivity fragmentActivity2 = this.f3343f;
            if (fragmentActivity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mActivity");
            }
            String string = fragmentActivity2.getString(C0906R.string.c2i);
            Intrinsics.checkExpressionValueIsNotNull(string, "mActivity.getString(R.string.search_nickname_hit)");
            this.i = string;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f3340c, false, 47193, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f3340c, false, 47193, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f3340c, false, 47196, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3340c, false, 47196, new Class[0], Void.TYPE);
        } else {
            DmtStatusView.a a2 = DmtStatusView.a.a(getContext()).a();
            FragmentActivity fragmentActivity = this.f3343f;
            if (fragmentActivity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mActivity");
            }
            this.h = a2.a(new c.a(fragmentActivity).a(2130840139).b((int) C0906R.string.aan).b("").f20493a).a(C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new g(this));
            ((DmtStatusView) a((int) C0906R.id.cvd)).setBuilder(this.h);
            RecyclerView recyclerView = (RecyclerView) a((int) C0906R.id.acu);
            recyclerView.setLayoutManager(new WrapLinearLayoutManager(recyclerView.getContext()));
            recyclerView.setItemAnimator(new CustomItemAnimator());
            recyclerView.setAdapter(k());
            recyclerView.bringToFront();
        }
        if (PatchProxy.isSupport(new Object[0], this, f3340c, false, 47197, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3340c, false, 47197, new Class[0], Void.TYPE);
        } else {
            DmtStatusView.a a3 = DmtStatusView.a.a(getContext());
            FragmentActivity fragmentActivity2 = this.f3343f;
            if (fragmentActivity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mActivity");
            }
            this.j = a3.a(new c.a(fragmentActivity2).a(2130840144).b((int) C0906R.string.f4486dmt).c(C0906R.string.dmu).f20493a).a(C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new h(this));
            ((DmtTextView) a((int) C0906R.id.di7)).setOnClickListener(new i(this));
            ((DmtTextView) a((int) C0906R.id.di3)).setOnClickListener(new j(this));
            ((ImageButton) a((int) C0906R.id.ns)).setOnClickListener(new k(this));
            ((DmtEditText) a((int) C0906R.id.aai)).setOnTouchListener(new l(this));
            ((DmtEditText) a((int) C0906R.id.aai)).addTextChangedListener(new m(this));
            ((DmtEditText) a((int) C0906R.id.aai)).setOnEditorActionListener(new n(this));
        }
        if (PatchProxy.isSupport(new Object[0], this, f3340c, false, 47198, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3340c, false, 47198, new Class[0], Void.TYPE);
        } else {
            Disposable unused = a(h(), r.INSTANCE, c(), false, new aa(this));
            Disposable unused2 = a(h(), v.INSTANCE, c(), false, new ag(this));
            Disposable unused3 = a(j(), w.INSTANCE, c(), false, new ah(this));
            RecommendListViewModel j2 = j();
            com.bytedance.jedi.arch.e eVar = this;
            com.bytedance.jedi.arch.ext.list.a k2 = k();
            Function2 aiVar = new ai(this);
            com.bytedance.jedi.arch.ext.list.c oVar = new o(new aj(this), new s(this), new ak(this));
            com.bytedance.jedi.arch.ext.list.c pVar = new p(new t(this), new v(this), u.INSTANCE);
            if (PatchProxy.isSupport(new Object[]{j2, eVar, k2, oVar, pVar, aiVar}, null, com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.c.f49055a, true, 46862, new Class[]{RecommendListViewModel.class, com.bytedance.jedi.arch.e.class, com.bytedance.jedi.arch.ext.list.a.class, com.bytedance.jedi.arch.ext.list.c.class, com.bytedance.jedi.arch.ext.list.c.class, Function2.class}, Void.TYPE)) {
                Object[] objArr = {j2, eVar, k2, oVar, pVar, aiVar};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, null, com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.c.f49055a, true, 46862, new Class[]{RecommendListViewModel.class, com.bytedance.jedi.arch.e.class, com.bytedance.jedi.arch.ext.list.a.class, com.bytedance.jedi.arch.ext.list.c.class, com.bytedance.jedi.arch.ext.list.c.class, Function2.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(j2, "$this$recommendListSubscribe");
                Intrinsics.checkParameterIsNotNull(eVar, "subscriber");
                Intrinsics.checkParameterIsNotNull(k2, "adapter");
                ListMiddleware.a(j2.recommendListMiddleware, eVar, k2, false, eVar.c(), oVar, pVar, aiVar, null, SearchJediMixFeedAdapter.f42517f);
            }
            com.bytedance.jedi.arch.e eVar2 = eVar;
            Disposable unused4 = a(i(), s.INSTANCE, c(), false, new w(this));
            Disposable unused5 = a(i(), t.INSTANCE, c(), false, new x(this));
            SearchUserListViewModel i2 = i();
            com.bytedance.jedi.arch.ext.list.a l2 = l();
            Function2 yVar = new y(this);
            com.bytedance.jedi.arch.ext.list.c qVar = new q(new z(this), new ac(this), new ab(this));
            com.bytedance.jedi.arch.ext.list.c rVar = new r(new ad(this), new af(this), new ae(this));
            if (PatchProxy.isSupport(new Object[]{i2, eVar2, l2, qVar, rVar, yVar}, null, com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.g.f49063a, true, 46901, new Class[]{SearchUserListViewModel.class, com.bytedance.jedi.arch.e.class, com.bytedance.jedi.arch.ext.list.a.class, com.bytedance.jedi.arch.ext.list.c.class, com.bytedance.jedi.arch.ext.list.c.class, Function2.class}, Void.TYPE)) {
                Object[] objArr3 = {i2, eVar2, l2, qVar, rVar, yVar};
                Object[] objArr4 = objArr3;
                PatchProxy.accessDispatch(objArr4, null, com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.g.f49063a, true, 46901, new Class[]{SearchUserListViewModel.class, com.bytedance.jedi.arch.e.class, com.bytedance.jedi.arch.ext.list.a.class, com.bytedance.jedi.arch.ext.list.c.class, com.bytedance.jedi.arch.ext.list.c.class, Function2.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(i2, "$this$searchUserListSubscribe");
                Intrinsics.checkParameterIsNotNull(eVar2, "subscriber");
                Intrinsics.checkParameterIsNotNull(l2, "adapter");
                com.bytedance.jedi.arch.e eVar3 = eVar2;
                ListMiddleware.a(i2.searchUserListMiddleware, eVar3, l2, false, eVar2.c(), qVar, rVar, yVar, null, SearchJediMixFeedAdapter.f42517f);
            }
            com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.c.a(j());
            ((DmtStatusView) a((int) C0906R.id.cvd)).d();
        }
        FragmentActivity fragmentActivity3 = this.f3343f;
        if (fragmentActivity3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivity");
        }
        Object a4 = com.ss.android.ugc.aweme.base.sharedpref.c.a(fragmentActivity3, bp.class);
        Intrinsics.checkExpressionValueIsNotNull(a4, "SharedPreferencesHelper.…ePreferences::class.java)");
        this.g = (bp) a4;
        if (PatchProxy.isSupport(new Object[0], this, f3340c, false, 47204, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3340c, false, 47204, new Class[0], Void.TYPE);
            return;
        }
        bp bpVar = this.g;
        if (bpVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("noticeSp");
        }
        int c2 = bpVar.c(0);
        bp bpVar2 = this.g;
        if (bpVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("noticeSp");
        }
        bpVar2.d(c2 + 1);
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3340c, false, 47192, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3340c, false, 47192, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0906R.layout.nt, viewGroup2, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…riends, container, false)");
        this.f3342e = inflate;
        View view = this.f3342e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return view;
    }
}

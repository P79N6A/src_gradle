package com.ss.android.ugc.aweme.story.feed.jedi;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.base.jedi.BaseJediFragment;
import com.ss.android.ugc.aweme.story.base.view.guide.StoryFeedClickGuideDialogFragment;
import com.ss.android.ugc.aweme.story.base.view.guide.StoryFeedScrollGuideDialogFragment;
import com.ss.android.ugc.aweme.story.comment.widget.CommentBottomSheetBehavior;
import com.ss.android.ugc.aweme.story.detail.view.StoryDetailActivity;
import com.ss.android.ugc.aweme.story.feed.c.g;
import com.ss.android.ugc.aweme.story.feed.jedi.ParentViewPager2;
import com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedViewModel;
import com.ss.android.ugc.aweme.story.feed.model.LifeFeedModel;
import com.ss.android.ugc.aweme.story.feed.viewmodel.ChangeUserModeViewModel;
import com.ss.android.ugc.aweme.story.feed.viewmodel.StoryChange;
import com.ss.android.ugc.aweme.story.feed.viewmodel.ViewPagerMotionEventViewModel;
import com.ss.android.ugc.aweme.story.viewpager2.widget.ViewPager2;
import io.reactivex.disposables.Disposable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0010\u0018\u0000 N2\u00020\u0001:\u0001NB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\"\u001a\u00020#H\u0002J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'J\b\u0010(\u001a\u00020\nH\u0002J\u0012\u0010)\u001a\u0004\u0018\u00010\u00042\u0006\u0010*\u001a\u00020\fH\u0002J\u000e\u0010+\u001a\u00020#2\u0006\u0010*\u001a\u00020\fJ\u0018\u0010,\u001a\u00020#2\u0006\u0010*\u001a\u00020\f2\u0006\u0010-\u001a\u00020'H\u0002J\u0010\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u00020#H\u0002J\b\u00102\u001a\u00020#H\u0002J\b\u00103\u001a\u00020#H\u0002J\b\u00104\u001a\u00020#H\u0002J\u0010\u00105\u001a\u00020#2\u0006\u0010/\u001a\u000200H\u0002J&\u00106\u001a\u0004\u0018\u0001002\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\b\u0010=\u001a\u00020#H\u0016J\u0010\u0010>\u001a\u00020#2\u0006\u0010?\u001a\u00020@H\u0007J\b\u0010A\u001a\u00020#H\u0002J\b\u0010B\u001a\u00020#H\u0016J\u0010\u0010C\u001a\u00020#2\u0006\u0010?\u001a\u00020DH\u0007J\u001a\u0010E\u001a\u00020#2\u0006\u0010/\u001a\u0002002\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\b\u0010F\u001a\u00020#H\u0002J\u0010\u0010G\u001a\u00020#2\u0006\u0010H\u001a\u00020%H\u0016J\u0016\u0010I\u001a\u00020#2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020L0KH\u0002J\b\u0010M\u001a\u00020#H\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138FX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006O"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryFeedJediFragment;", "Lcom/ss/android/ugc/aweme/story/base/jedi/BaseJediFragment;", "()V", "curViewHolder", "Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryMainHolder2;", "getCurViewHolder", "()Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryMainHolder2;", "mAdapter", "Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryMainRawPagerAdapter2;", "mStatusView", "Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;", "navigationBarHeight", "", "getNavigationBarHeight", "()I", "pageChangeCallback", "com/ss/android/ugc/aweme/story/feed/jedi/StoryFeedJediFragment$pageChangeCallback$1", "Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryFeedJediFragment$pageChangeCallback$1;", "params", "Lcom/ss/android/ugc/aweme/story/api/model/DetailParams;", "getParams", "()Lcom/ss/android/ugc/aweme/story/api/model/DetailParams;", "params$delegate", "Lkotlin/Lazy;", "transitionBgView", "Lcom/ss/android/ugc/aweme/story/detail/SharedElementsView;", "getTransitionBgView", "()Lcom/ss/android/ugc/aweme/story/detail/SharedElementsView;", "viewModel", "Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryFeedViewModel;", "getViewModel", "()Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryFeedViewModel;", "viewModel$delegate", "Lcom/bytedance/jedi/arch/lifecycleAwareLazy;", "addViewPagerLintener", "", "autoGoToNextStory", "", "curStoryId", "", "createDmtStatusView", "getViewHolderByPos", "pos", "goToUserByPos", "gotoUserStory", "storyId", "initBehavior", "view", "Landroid/view/View;", "initEventBus", "initModel", "initShadowView", "initStatusView", "initView", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onEnterViewBoardEvent", "event", "Lcom/ss/android/ugc/aweme/story/comment/event/EnterViewBoardEvent;", "onInvisibleToUser", "onPause", "onStoryEnterTransitionEvent", "Lcom/ss/android/ugc/aweme/story/detail/event/StoryEnterTransitionEvent;", "onViewCreated", "onVisibleToUser", "setUserVisibleHint", "isVisibleToUser", "showClickGuide", "storyList", "", "Lcom/ss/android/ugc/aweme/story/api/model/UserStory;", "showScrollGuide", "Companion", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StoryFeedJediFragment extends BaseJediFragment {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f4120c;

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f4121d = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(StoryFeedJediFragment.class), "params", "getParams()Lcom/ss/android/ugc/aweme/story/api/model/DetailParams;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(StoryFeedJediFragment.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryFeedViewModel;"))};

    /* renamed from: f  reason: collision with root package name */
    public static final c f4122f = new c((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public StoryMainRawPagerAdapter2 f4123e;
    private DmtStatusView g;
    @NotNull
    private final Lazy h = LazyKt.lazy(new o(this));
    private final lifecycleAwareLazy i;
    private final n j;
    private HashMap k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0014\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0005\"\u0010\b\u0001\u0010\u0006\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0007\"\b\b\u0002\u0010\u0001*\u00020\b*\u0002H\u00012\b\u0010\t\u001a\u0004\u0018\u00010\nH\n¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"<anonymous>", "S", "T", "Landroid/support/v4/app/Fragment;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "VM", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/bytedance/jedi/arch/State;", "it", "Landroid/os/Bundle;", "invoke", "(Lcom/bytedance/jedi/arch/State;Landroid/os/Bundle;)Lcom/bytedance/jedi/arch/State;", "com/bytedance/jedi/arch/ExtensionsKt$viewModel$5"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function2<StoryFeedState, Bundle, StoryFeedState> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        public a() {
            super(2);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedState, com.bytedance.jedi.arch.x] */
        @NotNull
        public final StoryFeedState invoke(@NotNull StoryFeedState storyFeedState, @Nullable Bundle bundle) {
            StoryFeedState storyFeedState2 = storyFeedState;
            if (PatchProxy.isSupport(new Object[]{storyFeedState2, bundle}, this, changeQuickRedirect, false, 83300, new Class[]{x.class, Bundle.class}, x.class)) {
                return (x) PatchProxy.accessDispatch(new Object[]{storyFeedState2, bundle}, this, changeQuickRedirect, false, 83300, new Class[]{x.class, Bundle.class}, x.class);
            }
            Intrinsics.checkParameterIsNotNull(storyFeedState2, "$receiver");
            return storyFeedState2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0014\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0005\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0002\u0010\u0007*\u00020\bH\n¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"<anonymous>", "VM", "T", "Landroid/support/v4/app/Fragment;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "()Lcom/bytedance/jedi/arch/JediViewModel;", "com/bytedance/jedi/arch/ExtensionsKt$viewModel$6"}, k = 3, mv = {1, 1, 15})
    public static final class b extends Lambda implements Function0<StoryFeedViewModel> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Function2 $argumentsAcceptor;
        final /* synthetic */ Fragment $this_viewModel;
        final /* synthetic */ KClass $viewModelClass;
        final /* synthetic */ KClass $viewModelClass$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment, KClass kClass, Function2 function2, KClass kClass2) {
            super(0);
            this.$this_viewModel = fragment;
            this.$viewModelClass = kClass;
            this.$argumentsAcceptor = function2;
            this.$viewModelClass$inlined = kClass2;
        }

        /* JADX WARNING: type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r0v6, types: [com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedViewModel, com.bytedance.jedi.arch.JediViewModel] */
        @NotNull
        public final StoryFeedViewModel invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 83301, new Class[0], JediViewModel.class)) {
                return (JediViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 83301, new Class[0], JediViewModel.class);
            }
            ViewModelProvider of = ViewModelProviders.of(this.$this_viewModel, ((ae) this.$this_viewModel).r_());
            String name = kotlin.jvm.a.a(this.$viewModelClass$inlined).getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "viewModelClass.java.name");
            ? r0 = (JediViewModel) of.get(name, kotlin.jvm.a.a(this.$viewModelClass));
            com.bytedance.jedi.arch.n a2 = r0.f2282c.a(StoryFeedViewModel.class);
            if (a2 != null) {
                Intrinsics.checkExpressionValueIsNotNull(r0, "this");
                a2.binding(r0);
            }
            r0.a(new Function1<StoryFeedState, StoryFeedState>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ b this$0;

                {
                    this.this$0 = r1;
                }

                /* JADX WARNING: type inference failed for: r0v6, types: [com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedState, com.bytedance.jedi.arch.x] */
                /* JADX WARNING: type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedState, com.bytedance.jedi.arch.x] */
                @NotNull
                public final StoryFeedState invoke(@NotNull StoryFeedState storyFeedState) {
                    if (PatchProxy.isSupport(new Object[]{storyFeedState}, this, changeQuickRedirect, false, 83302, new Class[]{x.class}, x.class)) {
                        return (x) PatchProxy.accessDispatch(new Object[]{storyFeedState}, this, changeQuickRedirect, false, 83302, new Class[]{x.class}, x.class);
                    }
                    Intrinsics.checkParameterIsNotNull(storyFeedState, "$this$initialize");
                    return (x) this.this$0.$argumentsAcceptor.invoke(storyFeedState, this.this$0.$this_viewModel.getArguments());
                }
            });
            return r0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryFeedJediFragment$Companion;", "", "()V", "newInstance", "Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryFeedJediFragment;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72544a;

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/aweme/story/feed/jedi/StoryFeedJediFragment$addViewPagerLintener$1", "Lcom/ss/android/ugc/aweme/story/feed/jedi/ParentViewPager2$OnMotionEventChangeListener;", "onCancel", "", "onCleanMode", "onMotionDown", "isNext", "", "onMotionUp", "onSwtichItem", "onWipeUp", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d implements ParentViewPager2.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72545a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryFeedJediFragment f72546b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MutableLiveData f72547c;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f72545a, false, 83307, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f72545a, false, 83307, new Class[0], Void.TYPE);
                return;
            }
            this.f72546b.k().a((p) new e(false, 1));
            MutableLiveData mutableLiveData = this.f72547c;
            Intrinsics.checkExpressionValueIsNotNull(mutableLiveData, "liveData");
            mutableLiveData.setValue(new com.ss.android.ugc.aweme.story.feed.a.c(4));
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f72545a, false, 83308, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f72545a, false, 83308, new Class[0], Void.TYPE);
                return;
            }
            this.f72546b.k().a((p) new j(false, 1));
            MutableLiveData mutableLiveData = this.f72547c;
            Intrinsics.checkExpressionValueIsNotNull(mutableLiveData, "liveData");
            mutableLiveData.setValue(new com.ss.android.ugc.aweme.story.feed.a.c(5));
        }

        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f72545a, false, 83309, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f72545a, false, 83309, new Class[0], Void.TYPE);
                return;
            }
            this.f72546b.k().a((p) new d(false, 1));
            MutableLiveData mutableLiveData = this.f72547c;
            Intrinsics.checkExpressionValueIsNotNull(mutableLiveData, "liveData");
            mutableLiveData.setValue(new com.ss.android.ugc.aweme.story.feed.a.c(6));
        }

        public final void a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f72545a, false, 83304, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f72545a, false, 83304, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            this.f72546b.k().a((p) new f(false, 1));
            MutableLiveData mutableLiveData = this.f72547c;
            Intrinsics.checkExpressionValueIsNotNull(mutableLiveData, "liveData");
            mutableLiveData.setValue(new com.ss.android.ugc.aweme.story.feed.a.c(1));
            if (!z) {
                View a2 = this.f72546b.a((int) C0906R.id.cp0);
                Intrinsics.checkExpressionValueIsNotNull(a2, "shadow_view");
                if (a2.getAlpha() == 0.0f) {
                    com.ss.android.ugc.aweme.story.base.view.a.a.a(this.f72546b.a((int) C0906R.id.cp0), 0.0f, 1.0f);
                }
            }
        }

        public final void b(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f72545a, false, 83305, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f72545a, false, 83305, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            this.f72546b.k().a((p) new i(false, 1));
            MutableLiveData mutableLiveData = this.f72547c;
            Intrinsics.checkExpressionValueIsNotNull(mutableLiveData, "liveData");
            mutableLiveData.setValue(new com.ss.android.ugc.aweme.story.feed.a.c(2));
            View a2 = this.f72546b.a((int) C0906R.id.cp0);
            Intrinsics.checkExpressionValueIsNotNull(a2, "shadow_view");
            if (a2.getAlpha() > 0.0f) {
                com.ss.android.ugc.aweme.story.base.view.a.a.a(this.f72546b.a((int) C0906R.id.cp0), 1.0f, 0.0f);
            }
        }

        public final void c(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f72545a, false, 83306, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f72545a, false, 83306, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            this.f72546b.k().a((p) new h(z));
            MutableLiveData mutableLiveData = this.f72547c;
            Intrinsics.checkExpressionValueIsNotNull(mutableLiveData, "liveData");
            mutableLiveData.setValue(new com.ss.android.ugc.aweme.story.feed.a.c(3, z));
        }

        d(StoryFeedJediFragment storyFeedJediFragment, MutableLiveData mutableLiveData) {
            this.f72546b = storyFeedJediFragment;
            this.f72547c = mutableLiveData;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72548a;

        /* renamed from: b  reason: collision with root package name */
        public static final e f72549b = new e();

        e() {
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f72548a, false, 83310, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f72548a, false, 83310, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72550a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryFeedJediFragment f72551b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f72552c;

        f(StoryFeedJediFragment storyFeedJediFragment, int i) {
            this.f72551b = storyFeedJediFragment;
            this.f72552c = i;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f72550a, false, 83311, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f72550a, false, 83311, new Class[0], Void.TYPE);
                return;
            }
            this.f72551b.c(this.f72552c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72553a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryFeedJediFragment f72554b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f72555c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f72556d;

        g(StoryFeedJediFragment storyFeedJediFragment, int i, String str) {
            this.f72554b = storyFeedJediFragment;
            this.f72555c = i;
            this.f72556d = str;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f72553a, false, 83312, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f72553a, false, 83312, new Class[0], Void.TYPE);
                return;
            }
            StoryMainHolder2 c2 = this.f72554b.c(this.f72555c);
            if (c2 != null) {
                String str = this.f72556d;
                if (PatchProxy.isSupport(new Object[]{str}, c2, StoryMainHolder2.f72581b, false, 83389, new Class[]{String.class}, Void.TYPE)) {
                    StoryMainHolder2 storyMainHolder2 = c2;
                    PatchProxy.accessDispatch(new Object[]{str}, storyMainHolder2, StoryMainHolder2.f72581b, false, 83389, new Class[]{String.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(str, "storyId");
                    c2.f72583d.setCurrentItem(Math.max(0, com.ss.android.ugc.aweme.story.feed.c.g.f72503b.a(c2.p(), str)));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/aweme/story/feed/jedi/StoryFeedJediFragment$initBehavior$1", "Lcom/ss/android/ugc/aweme/story/comment/widget/CommentBottomSheetBehavior$BottomSheetCallback;", "onSlide", "", "bottomSheet", "Landroid/view/View;", "slideOffset", "", "onStateChanged", "newState", "", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class h extends CommentBottomSheetBehavior.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72557a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryFeedJediFragment f72558b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MutableLiveData f72559c;

        h(StoryFeedJediFragment storyFeedJediFragment, MutableLiveData mutableLiveData) {
            this.f72558b = storyFeedJediFragment;
            this.f72559c = mutableLiveData;
        }

        public final void a(@NotNull View view, float f2) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2)}, this, f72557a, false, 83314, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2)}, this, f72557a, false, 83314, new Class[]{View.class, Float.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, "bottomSheet");
            com.ss.android.ugc.aweme.story.feed.a.c.f72456b = true;
            FragmentActivity activity = this.f72558b.getActivity();
            if (activity != null) {
                Intrinsics.checkExpressionValueIsNotNull(activity, AdvanceSetting.NETWORK_TYPE);
                if (activity.getWindow() != null) {
                    if (Float.isNaN(f2)) {
                        View view3 = ((StoryDetailActivity) activity).i;
                        Intrinsics.checkExpressionValueIsNotNull(view3, "(it as StoryDetailActivity).bgView");
                        view3.setAlpha(1.0f);
                    } else {
                        float abs = Math.abs(f2);
                        View view4 = ((StoryDetailActivity) activity).i;
                        Intrinsics.checkExpressionValueIsNotNull(view4, "(it as StoryDetailActivity).bgView");
                        view4.setAlpha(1.0f - abs);
                    }
                }
            }
        }

        public final void a(@NotNull View view, int i) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f72557a, false, 83313, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f72557a, false, 83313, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view, "bottomSheet");
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            com.ss.android.ugc.aweme.story.feed.a.c.f72456b = z;
            if (i == 5) {
                FragmentActivity activity = this.f72558b.getActivity();
                if (activity != null) {
                    Intrinsics.checkExpressionValueIsNotNull(activity, AdvanceSetting.NETWORK_TYPE);
                    if (activity.getWindow() != null) {
                        this.f72558b.k().a("slide_down");
                        com.ss.android.ugc.aweme.arch.widgets.base.b a2 = ChangeUserModeViewModel.a(activity);
                        Intrinsics.checkExpressionValueIsNotNull(a2, "ChangeUserModeViewModel.getModel(it)");
                        a2.setValue("slide_down");
                        activity.supportFinishAfterTransition();
                    }
                }
            } else if (i == 4 || i == 3) {
                this.f72558b.k().a((p) new i(false, 1));
                MutableLiveData mutableLiveData = this.f72559c;
                Intrinsics.checkExpressionValueIsNotNull(mutableLiveData, "liveData");
                mutableLiveData.setValue(new com.ss.android.ugc.aweme.story.feed.a.c(2));
                if (this.f72558b.a((int) C0906R.id.cp0) != null) {
                    View a3 = this.f72558b.a((int) C0906R.id.cp0);
                    Intrinsics.checkExpressionValueIsNotNull(a3, "shadow_view");
                    if (a3.getAlpha() > 0.0f) {
                        com.ss.android.ugc.aweme.story.base.view.a.a.a(this.f72558b.a((int) C0906R.id.cp0), 1.0f, 0.0f);
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/story/feed/model/LifeFeed;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class i<T> implements Observer<com.ss.android.ugc.aweme.story.feed.model.a> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72560a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryFeedJediFragment f72561b;

        i(StoryFeedJediFragment storyFeedJediFragment) {
            this.f72561b = storyFeedJediFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.story.feed.model.a aVar = (com.ss.android.ugc.aweme.story.feed.model.a) obj;
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f72560a, false, 83315, new Class[]{com.ss.android.ugc.aweme.story.feed.model.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f72560a, false, 83315, new Class[]{com.ss.android.ugc.aweme.story.feed.model.a.class}, Void.TYPE);
                return;
            }
            if (aVar != null) {
                StoryFeedViewModel k = this.f72561b.k();
                Intrinsics.checkExpressionValueIsNotNull(aVar, "this");
                if (PatchProxy.isSupport(new Object[]{aVar}, k, StoryFeedViewModel.f72580d, false, 83342, new Class[]{com.ss.android.ugc.aweme.story.feed.model.a.class}, Void.TYPE)) {
                    StoryFeedViewModel storyFeedViewModel = k;
                    PatchProxy.accessDispatch(new Object[]{aVar}, storyFeedViewModel, StoryFeedViewModel.f72580d, false, 83342, new Class[]{com.ss.android.ugc.aweme.story.feed.model.a.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(aVar, "feed");
                    k.c(new StoryFeedViewModel.b(aVar));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "o", "", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class j<T> implements Observer<Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72562a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryFeedJediFragment f72563b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ LifeFeedModel f72564c;

        j(StoryFeedJediFragment storyFeedJediFragment, LifeFeedModel lifeFeedModel) {
            this.f72563b = storyFeedJediFragment;
            this.f72564c = lifeFeedModel;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.ss.android.ugc.aweme.story.api.model.UserStory} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.ss.android.ugc.aweme.story.api.model.UserStory} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.ss.android.ugc.aweme.story.api.model.UserStory} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.ss.android.ugc.aweme.story.api.model.UserStory} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0081 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onChanged(@org.jetbrains.annotations.Nullable java.lang.Object r11) {
            /*
                r10 = this;
                r8 = 1
                java.lang.Object[] r0 = new java.lang.Object[r8]
                r9 = 0
                r0[r9] = r11
                com.meituan.robust.ChangeQuickRedirect r2 = f72562a
                java.lang.Class[] r5 = new java.lang.Class[r8]
                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                r5[r9] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 83316(0x14574, float:1.1675E-40)
                r1 = r10
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0032
                java.lang.Object[] r0 = new java.lang.Object[r8]
                r0[r9] = r11
                com.meituan.robust.ChangeQuickRedirect r2 = f72562a
                r3 = 0
                r4 = 83316(0x14574, float:1.1675E-40)
                java.lang.Class[] r5 = new java.lang.Class[r8]
                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                r5[r9] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r10
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0032:
                boolean r0 = r11 instanceof java.lang.String
                r1 = 0
                if (r0 != 0) goto L_0x0039
                r7 = r1
                goto L_0x003a
            L_0x0039:
                r7 = r11
            L_0x003a:
                java.lang.String r7 = (java.lang.String) r7
                if (r7 != 0) goto L_0x003f
                return
            L_0x003f:
                com.ss.android.ugc.aweme.story.feed.model.LifeFeedModel r0 = r10.f72564c
                java.lang.String r2 = "model"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
                java.lang.Object r0 = r0.d()
                com.ss.android.ugc.aweme.story.feed.model.a r0 = (com.ss.android.ugc.aweme.story.feed.model.a) r0
                if (r0 == 0) goto L_0x00a1
                java.util.List r2 = r0.getUserStoryList()
                if (r2 == 0) goto L_0x00a0
                r3 = r2
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                java.util.Iterator r3 = r3.iterator()
            L_0x005b:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x0082
                java.lang.Object r4 = r3.next()
                r5 = r4
                com.ss.android.ugc.aweme.story.api.model.UserStory r5 = (com.ss.android.ugc.aweme.story.api.model.UserStory) r5
                if (r5 == 0) goto L_0x0075
                com.ss.android.ugc.aweme.profile.model.User r5 = r5.getUser()
                if (r5 == 0) goto L_0x0075
                java.lang.String r5 = r5.getUid()
                goto L_0x0076
            L_0x0075:
                r5 = r1
            L_0x0076:
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                r6 = r7
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                boolean r5 = android.text.TextUtils.equals(r5, r6)
                if (r5 == 0) goto L_0x005b
                r1 = r4
            L_0x0082:
                com.ss.android.ugc.aweme.story.api.model.UserStory r1 = (com.ss.android.ugc.aweme.story.api.model.UserStory) r1
                if (r1 == 0) goto L_0x00a1
                r2.remove(r1)
                com.ss.android.ugc.aweme.story.feed.model.LifeFeedModel r1 = r10.f72564c
                r1.a((com.ss.android.ugc.aweme.story.feed.model.a) r0)
                boolean r0 = r2.isEmpty()
                if (r0 == 0) goto L_0x00a0
                com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment r0 = r10.f72563b
                android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                if (r0 == 0) goto L_0x00a0
                r0.supportFinishAfterTransition()
                goto L_0x00a1
            L_0x00a0:
                return
            L_0x00a1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment.j.onChanged(java.lang.Object):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "Lcom/ss/android/ugc/aweme/story/api/model/UserStory;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class k extends Lambda implements Function2<com.bytedance.jedi.arch.f, List<? extends UserStory>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ LifeFeedModel $model;
        final /* synthetic */ StoryFeedJediFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(StoryFeedJediFragment storyFeedJediFragment, LifeFeedModel lifeFeedModel) {
            super(2);
            this.this$0 = storyFeedJediFragment;
            this.$model = lifeFeedModel;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (List) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @Nullable List<? extends UserStory> list) {
            com.ss.android.ugc.aweme.story.api.model.b bVar;
            boolean z;
            com.bytedance.jedi.arch.f fVar2 = fVar;
            List<? extends UserStory> list2 = list;
            if (PatchProxy.isSupport(new Object[]{fVar2, list2}, this, changeQuickRedirect, false, 83319, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2, list2}, this, changeQuickRedirect, false, 83319, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            if (list2 != null) {
                if (list.isEmpty()) {
                    FragmentActivity activity = this.this$0.getActivity();
                    if (activity != null) {
                        activity.supportFinishAfterTransition();
                        return;
                    }
                    return;
                }
                LifeFeedModel lifeFeedModel = this.$model;
                Intrinsics.checkExpressionValueIsNotNull(lifeFeedModel, "model");
                int i = lifeFeedModel.f72663f;
                if (i >= 0) {
                    if (i == list.size()) {
                        FragmentActivity activity2 = this.this$0.getActivity();
                        if (activity2 instanceof StoryDetailActivity) {
                            ((StoryDetailActivity) activity2).d();
                            activity2.finish();
                        }
                    } else {
                        StoryFeedJediFragment.a(this.this$0).a(list2);
                        this.this$0.b(i);
                        StoryMainHolder2 c2 = this.this$0.c(i);
                        if (c2 != null) {
                            c2.a(true);
                        }
                    }
                    LifeFeedModel lifeFeedModel2 = this.$model;
                    Intrinsics.checkExpressionValueIsNotNull(lifeFeedModel2, "model");
                    lifeFeedModel2.f72663f = -1;
                    return;
                }
                StoryFeedJediFragment.a(this.this$0).a(list2);
                LifeFeedModel lifeFeedModel3 = this.$model;
                Intrinsics.checkExpressionValueIsNotNull(lifeFeedModel3, "model");
                com.ss.android.ugc.aweme.story.base.c.a.a f2 = lifeFeedModel3.f();
                if (f2 == null) {
                    if (this.this$0.h().detailType != 2 || TextUtils.isEmpty(this.this$0.h().storyId)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        StoryFeedJediFragment storyFeedJediFragment = this.this$0;
                        String str = this.this$0.h().storyId;
                        Intrinsics.checkExpressionValueIsNotNull(str, "params.storyId");
                        if (PatchProxy.isSupport(new Object[]{0, str}, storyFeedJediFragment, StoryFeedJediFragment.f4120c, false, 83282, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
                            StoryFeedJediFragment storyFeedJediFragment2 = storyFeedJediFragment;
                            PatchProxy.accessDispatch(new Object[]{0, str}, storyFeedJediFragment2, StoryFeedJediFragment.f4120c, false, 83282, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
                        } else {
                            ((ParentViewPager2) storyFeedJediFragment.a((int) C0906R.id.duu)).a(0, true);
                            ((ParentViewPager2) storyFeedJediFragment.a((int) C0906R.id.duu)).post(new g(storyFeedJediFragment, 0, str));
                        }
                    } else {
                        final int a2 = com.ss.android.ugc.aweme.story.feed.c.g.f72503b.a(this.this$0.h().uid, list2);
                        ((ParentViewPager2) this.this$0.a((int) C0906R.id.duu)).a(a2, false);
                        ((ParentViewPager2) this.this$0.a((int) C0906R.id.duu)).post(new Runnable(this) {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f72565a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ k f72566b;

                            {
                                this.f72566b = r1;
                            }

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f72565a, false, 83320, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f72565a, false, 83320, new Class[0], Void.TYPE);
                                    return;
                                }
                                this.f72566b.this$0.c(a2);
                            }
                        });
                    }
                    ((ParentViewPager2) this.this$0.a((int) C0906R.id.duu)).a();
                } else if (f2.f71934b == com.ss.android.ugc.aweme.story.base.c.a.b.REFRESHING_SUCCESS && (!list2.isEmpty())) {
                    g.a aVar = com.ss.android.ugc.aweme.story.feed.c.g.f72503b;
                    if (PatchProxy.isSupport(new Object[]{list2, 0}, aVar, g.a.f72504a, false, 83746, new Class[]{List.class, Integer.TYPE}, com.ss.android.ugc.aweme.story.api.model.b.class)) {
                        g.a aVar2 = aVar;
                        bVar = (com.ss.android.ugc.aweme.story.api.model.b) PatchProxy.accessDispatch(new Object[]{list2, 0}, aVar2, g.a.f72504a, false, 83746, new Class[]{List.class, Integer.TYPE}, com.ss.android.ugc.aweme.story.api.model.b.class);
                    } else {
                        Intrinsics.checkParameterIsNotNull(list2, "storyList");
                        UserStory userStory = (UserStory) list2.get(0);
                        if (userStory.getReadFlag() == 1) {
                            bVar = userStory.getAwemeList().get(0);
                        } else {
                            List<com.ss.android.ugc.aweme.story.api.model.b> awemeList = userStory.getAwemeList();
                            if (awemeList != null) {
                                bVar = ((UserStory) list2.get(0)).getAwemeList().get(Math.max(com.ss.android.ugc.aweme.story.feed.c.g.f72503b.a(awemeList), 0));
                            } else {
                                bVar = null;
                            }
                        }
                    }
                    if (bVar != null) {
                        StoryChange.a(this.this$0.requireActivity(), bVar);
                    }
                    this.this$0.b(0);
                    ((ParentViewPager2) this.this$0.a((int) C0906R.id.duu)).a();
                }
                StoryFeedJediFragment storyFeedJediFragment3 = this.this$0;
                if (PatchProxy.isSupport(new Object[0], storyFeedJediFragment3, StoryFeedJediFragment.f4120c, false, 83285, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], storyFeedJediFragment3, StoryFeedJediFragment.f4120c, false, 83285, new Class[0], Void.TYPE);
                } else {
                    storyFeedJediFragment3.a(storyFeedJediFragment3.k(), new r(storyFeedJediFragment3));
                }
                StoryFeedJediFragment storyFeedJediFragment4 = this.this$0;
                if (PatchProxy.isSupport(new Object[]{list2}, storyFeedJediFragment4, StoryFeedJediFragment.f4120c, false, 83284, new Class[]{List.class}, Void.TYPE)) {
                    StoryFeedJediFragment storyFeedJediFragment5 = storyFeedJediFragment4;
                    PatchProxy.accessDispatch(new Object[]{list2}, storyFeedJediFragment5, StoryFeedJediFragment.f4120c, false, 83284, new Class[]{List.class}, Void.TYPE);
                    return;
                }
                ParentViewPager2 parentViewPager2 = (ParentViewPager2) storyFeedJediFragment4.a((int) C0906R.id.duu);
                Intrinsics.checkExpressionValueIsNotNull(parentViewPager2, "viewpager");
                int currentItem = parentViewPager2.getCurrentItem();
                if (list.size() > currentItem && ((UserStory) list2.get(currentItem)).getTotalCount() > 1 && !com.ss.android.ugc.aweme.story.base.utils.h.a(com.ss.android.ugc.aweme.story.base.view.guide.a.a(), false)) {
                    ((ParentViewPager2) storyFeedJediFragment4.a((int) C0906R.id.duu)).postDelayed(p.f72573b, 1000);
                    StoryFeedClickGuideDialogFragment storyFeedClickGuideDialogFragment = new StoryFeedClickGuideDialogFragment();
                    storyFeedClickGuideDialogFragment.show(storyFeedJediFragment4.getChildFragmentManager(), "");
                    storyFeedClickGuideDialogFragment.a((StoryFeedClickGuideDialogFragment.a) new q(storyFeedJediFragment4));
                    com.ss.android.ugc.aweme.story.base.utils.h.b(com.ss.android.ugc.aweme.story.base.view.guide.a.a(), true);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class l extends Lambda implements Function2<com.bytedance.jedi.arch.f, Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ StoryFeedJediFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(StoryFeedJediFragment storyFeedJediFragment) {
            super(2);
            this.this$0 = storyFeedJediFragment;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, boolean z) {
            com.bytedance.jedi.arch.f fVar2 = fVar;
            if (PatchProxy.isSupport(new Object[]{fVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 83323, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2, Byte.valueOf(z)}, this, changeQuickRedirect, false, 83323, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            ((ParentViewPager2) this.this$0.a((int) C0906R.id.duu)).setShowingPopupWindow(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "show", "", "onChanged", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 15})
    static final class m<T> implements Observer<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72568a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryFeedJediFragment f72569b;

        m(StoryFeedJediFragment storyFeedJediFragment) {
            this.f72569b = storyFeedJediFragment;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (PatchProxy.isSupport(new Object[]{bool}, this, f72568a, false, 83324, new Class[]{Boolean.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bool}, this, f72568a, false, 83324, new Class[]{Boolean.class}, Void.TYPE);
                return;
            }
            if (bool != null) {
                StoryFeedViewModel k = this.f72569b.k();
                Intrinsics.checkExpressionValueIsNotNull(bool, AdvanceSetting.NETWORK_TYPE);
                boolean booleanValue = bool.booleanValue();
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : 0)}, k, StoryFeedViewModel.f72580d, false, 83338, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    StoryFeedViewModel storyFeedViewModel = k;
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(booleanValue)}, storyFeedViewModel, StoryFeedViewModel.f72580d, false, 83338, new Class[]{Boolean.TYPE}, Void.TYPE);
                } else {
                    k.c(new StoryFeedViewModel.d(booleanValue));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/story/feed/jedi/StoryFeedJediFragment$pageChangeCallback$1", "Lcom/ss/android/ugc/aweme/story/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "onPageSelected", "", "position", "", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class n extends ViewPager2.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72570a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryFeedJediFragment f72571b;

        n(StoryFeedJediFragment storyFeedJediFragment) {
            this.f72571b = storyFeedJediFragment;
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f72570a, false, 83325, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f72570a, false, 83325, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (!com.ss.android.ugc.aweme.story.base.utils.h.a(com.ss.android.ugc.aweme.story.base.view.guide.a.c(), false)) {
                com.ss.android.ugc.aweme.story.base.utils.h.b(com.ss.android.ugc.aweme.story.base.view.guide.a.c(), true);
            }
            com.ss.android.ugc.aweme.story.detail.f.a().a(com.ss.android.ugc.aweme.story.feed.c.g.f72503b.b(StoryChange.c(this.f72571b.requireActivity())), this.f72571b.h().tabType);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/story/api/model/DetailParams;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class o extends Lambda implements Function0<com.ss.android.ugc.aweme.story.api.model.f> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ StoryFeedJediFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(StoryFeedJediFragment storyFeedJediFragment) {
            super(0);
            this.this$0 = storyFeedJediFragment;
        }

        @NotNull
        public final com.ss.android.ugc.aweme.story.api.model.f invoke() {
            Serializable serializable;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 83326, new Class[0], com.ss.android.ugc.aweme.story.api.model.f.class)) {
                return (com.ss.android.ugc.aweme.story.api.model.f) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 83326, new Class[0], com.ss.android.ugc.aweme.story.api.model.f.class);
            }
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                serializable = arguments.getSerializable("extra_story_detail_params");
            } else {
                serializable = null;
            }
            if (serializable != null) {
                return (com.ss.android.ugc.aweme.story.api.model.f) serializable;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.story.api.model.DetailParams");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72572a;

        /* renamed from: b  reason: collision with root package name */
        public static final p f72573b = new p();

        p() {
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f72572a, false, 83327, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f72572a, false, 83327, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.story.player.c.d().e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/story/feed/jedi/StoryFeedJediFragment$showClickGuide$2", "Lcom/ss/android/ugc/aweme/story/base/view/guide/StoryFeedClickGuideDialogFragment$OnDismissCallBack;", "onDismiss", "", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class q implements StoryFeedClickGuideDialogFragment.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72574a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryFeedJediFragment f72575b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f72574a, false, 83328, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f72574a, false, 83328, new Class[0], Void.TYPE);
                return;
            }
            this.f72575b.l();
        }

        q(StoryFeedJediFragment storyFeedJediFragment) {
            this.f72575b = storyFeedJediFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryFeedState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class r extends Lambda implements Function1<StoryFeedState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ StoryFeedJediFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(StoryFeedJediFragment storyFeedJediFragment) {
            super(1);
            this.this$0 = storyFeedJediFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((StoryFeedState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull StoryFeedState storyFeedState) {
            if (PatchProxy.isSupport(new Object[]{storyFeedState}, this, changeQuickRedirect, false, 83329, new Class[]{StoryFeedState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{storyFeedState}, this, changeQuickRedirect, false, 83329, new Class[]{StoryFeedState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(storyFeedState, "state");
            com.ss.android.ugc.aweme.story.feed.model.a lifeFeed = storyFeedState.getLifeFeed();
            if (lifeFeed != null && !com.ss.android.ugc.aweme.story.feed.c.g.f72503b.b(lifeFeed) && !com.ss.android.ugc.aweme.story.base.utils.h.a(com.ss.android.ugc.aweme.story.base.view.guide.a.b(), false) && com.ss.android.ugc.aweme.story.base.utils.h.a(com.ss.android.ugc.aweme.story.base.view.guide.a.a(), false) && !com.ss.android.ugc.aweme.story.base.utils.h.a(com.ss.android.ugc.aweme.story.base.view.guide.a.c(), false)) {
                StoryFeedScrollGuideDialogFragment storyFeedScrollGuideDialogFragment = new StoryFeedScrollGuideDialogFragment();
                storyFeedScrollGuideDialogFragment.show(this.this$0.getChildFragmentManager(), "");
                ((ParentViewPager2) this.this$0.a((int) C0906R.id.duu)).postDelayed(AnonymousClass1.f72577b, 1000);
                storyFeedScrollGuideDialogFragment.a((StoryFeedScrollGuideDialogFragment.a) new StoryFeedScrollGuideDialogFragment.a(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f72578a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ r f72579b;

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f72578a, false, 83331, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f72578a, false, 83331, new Class[0], Void.TYPE);
                            return;
                        }
                        this.f72579b.this$0.l();
                    }

                    {
                        this.f72579b = r1;
                    }
                });
                com.ss.android.ugc.aweme.story.base.utils.h.b(com.ss.android.ugc.aweme.story.base.view.guide.a.b(), true);
            }
        }
    }

    public final View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f4120c, false, 83297, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f4120c, false, 83297, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.k == null) {
            this.k = new HashMap();
        }
        View view = (View) this.k.get(Integer.valueOf(i2));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i2);
            this.k.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f4120c, false, 83298, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4120c, false, 83298, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null) {
            this.k.clear();
        }
    }

    @NotNull
    public final com.ss.android.ugc.aweme.story.api.model.f h() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f4120c, false, 83269, new Class[0], com.ss.android.ugc.aweme.story.api.model.f.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f4120c, false, 83269, new Class[0], com.ss.android.ugc.aweme.story.api.model.f.class);
        } else {
            value = this.h.getValue();
        }
        return (com.ss.android.ugc.aweme.story.api.model.f) value;
    }

    public final StoryFeedViewModel k() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f4120c, false, 83273, new Class[0], StoryFeedViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f4120c, false, 83273, new Class[0], StoryFeedViewModel.class);
        } else {
            value = this.i.getValue();
        }
        return (StoryFeedViewModel) value;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        g();
    }

    @Subscribe
    public final void onEnterViewBoardEvent(@NotNull com.ss.android.ugc.aweme.story.comment.b.a aVar) {
        com.ss.android.ugc.aweme.story.comment.b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f4120c, false, 83295, new Class[]{com.ss.android.ugc.aweme.story.comment.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f4120c, false, 83295, new Class[]{com.ss.android.ugc.aweme.story.comment.b.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "event");
    }

    public StoryFeedJediFragment() {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StoryFeedViewModel.class);
        this.i = new lifecycleAwareLazy(this, new b(this, orCreateKotlinClass, a.INSTANCE, orCreateKotlinClass));
        this.j = new n(this);
    }

    @Nullable
    public final StoryMainHolder2 i() {
        if (PatchProxy.isSupport(new Object[0], this, f4120c, false, 83271, new Class[0], StoryMainHolder2.class)) {
            return (StoryMainHolder2) PatchProxy.accessDispatch(new Object[0], this, f4120c, false, 83271, new Class[0], StoryMainHolder2.class);
        }
        ParentViewPager2 parentViewPager2 = (ParentViewPager2) a((int) C0906R.id.duu);
        Intrinsics.checkExpressionValueIsNotNull(parentViewPager2, "viewpager");
        return c(parentViewPager2.getCurrentItem());
    }

    @Nullable
    public final com.ss.android.ugc.aweme.story.detail.d j() {
        if (PatchProxy.isSupport(new Object[0], this, f4120c, false, 83272, new Class[0], com.ss.android.ugc.aweme.story.detail.d.class)) {
            return (com.ss.android.ugc.aweme.story.detail.d) PatchProxy.accessDispatch(new Object[0], this, f4120c, false, 83272, new Class[0], com.ss.android.ugc.aweme.story.detail.d.class);
        }
        StoryMainHolder2 i2 = i();
        if (i2 != null) {
            return i2.j();
        }
        return null;
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f4120c, false, 83281, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4120c, false, 83281, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            StoryMainHolder2 i2 = i();
            if (i2 != null) {
                i2.q();
            }
        }
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f4120c, false, 83294, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4120c, false, 83294, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        org.greenrobot.eventbus.c.a().c(this);
    }

    public final void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f4120c, false, 83293, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4120c, false, 83293, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        com.ss.android.ugc.aweme.story.player.c.d().e();
    }

    private final int m() {
        if (PatchProxy.isSupport(new Object[0], this, f4120c, false, 83270, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f4120c, false, 83270, new Class[0], Integer.TYPE)).intValue();
        }
        Resources resources = getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "resources");
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    public static final /* synthetic */ StoryMainRawPagerAdapter2 a(StoryFeedJediFragment storyFeedJediFragment) {
        StoryMainRawPagerAdapter2 storyMainRawPagerAdapter2 = storyFeedJediFragment.f4123e;
        if (storyMainRawPagerAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        return storyMainRawPagerAdapter2;
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f4120c, false, 83291, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f4120c, false, 83291, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        ((ParentViewPager2) a((int) C0906R.id.duu)).a(i2, true);
        ((ParentViewPager2) a((int) C0906R.id.duu)).post(new f(this, i2));
    }

    @Subscribe
    public final void onStoryEnterTransitionEvent(@NotNull com.ss.android.ugc.aweme.story.detail.b.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f4120c, false, 83296, new Class[]{com.ss.android.ugc.aweme.story.detail.b.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f4120c, false, 83296, new Class[]{com.ss.android.ugc.aweme.story.detail.b.c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cVar, "event");
        if (isViewValid()) {
            ParentViewPager2 parentViewPager2 = (ParentViewPager2) a((int) C0906R.id.duu);
            Intrinsics.checkExpressionValueIsNotNull(parentViewPager2, "viewpager");
            parentViewPager2.setAlpha(0.4f);
            ((ParentViewPager2) a((int) C0906R.id.duu)).animate().alpha(1.0f).setDuration(200).start();
        }
    }

    public final void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f4120c, false, 83279, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f4120c, false, 83279, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        if (z) {
            l();
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f4120c, false, 83280, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4120c, false, 83280, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid()) {
            StoryMainHolder2 i2 = i();
            if (i2 != null) {
                i2.r();
            }
        }
    }

    public final StoryMainHolder2 c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f4120c, false, 83292, new Class[]{Integer.TYPE}, StoryMainHolder2.class)) {
            return (StoryMainHolder2) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f4120c, false, 83292, new Class[]{Integer.TYPE}, StoryMainHolder2.class);
        }
        if (i2 >= 0) {
            StoryMainRawPagerAdapter2 storyMainRawPagerAdapter2 = this.f4123e;
            if (storyMainRawPagerAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            if (i2 < storyMainRawPagerAdapter2.getItemCount()) {
                ParentViewPager2 parentViewPager2 = (ParentViewPager2) a((int) C0906R.id.duu);
                Intrinsics.checkExpressionValueIsNotNull(parentViewPager2, "viewpager");
                RecyclerView recyclerView = parentViewPager2.getRecyclerView();
                Intrinsics.checkExpressionValueIsNotNull(recyclerView, "viewpager.recyclerView");
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager == null) {
                    return null;
                }
                int childCount = layoutManager.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    ParentViewPager2 parentViewPager22 = (ParentViewPager2) a((int) C0906R.id.duu);
                    Intrinsics.checkExpressionValueIsNotNull(parentViewPager22, "viewpager");
                    RecyclerView.ViewHolder a2 = b.a(parentViewPager22, i3);
                    if (!(a2 instanceof StoryMainHolder2)) {
                        a2 = null;
                    }
                    StoryMainHolder2 storyMainHolder2 = (StoryMainHolder2) a2;
                    if (storyMainHolder2 != null) {
                        g.a aVar = com.ss.android.ugc.aweme.story.feed.c.g.f72503b;
                        UserStory p2 = storyMainHolder2.p();
                        StoryMainRawPagerAdapter2 storyMainRawPagerAdapter22 = this.f4123e;
                        if (storyMainRawPagerAdapter22 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                        }
                        if (aVar.a(p2, (UserStory) storyMainRawPagerAdapter22.b(i2))) {
                            return storyMainHolder2;
                        }
                    }
                }
                return null;
            }
        }
        return null;
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        DmtStatusView dmtStatusView;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f4120c, false, 83275, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f4120c, false, 83275, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[]{view2}, this, f4120c, false, 83286, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f4120c, false, 83286, new Class[]{View.class}, Void.TYPE);
        } else {
            if (!ToolUtils.isEmui("") || Build.VERSION.SDK_INT < 24) {
                ((ParentViewPager2) a((int) C0906R.id.duu)).setPageTransformer(new a());
            } else {
                ((ParentViewPager2) a((int) C0906R.id.duu)).setPageTransformer(new c());
            }
            ((ParentViewPager2) a((int) C0906R.id.duu)).a(this.j);
            ParentViewPager2 parentViewPager2 = (ParentViewPager2) a((int) C0906R.id.duu);
            Intrinsics.checkExpressionValueIsNotNull(parentViewPager2, "viewpager");
            this.f4123e = new StoryMainRawPagerAdapter2(this, parentViewPager2);
            ParentViewPager2 parentViewPager22 = (ParentViewPager2) a((int) C0906R.id.duu);
            Intrinsics.checkExpressionValueIsNotNull(parentViewPager22, "viewpager");
            StoryMainRawPagerAdapter2 storyMainRawPagerAdapter2 = this.f4123e;
            if (storyMainRawPagerAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            }
            parentViewPager22.setAdapter(storyMainRawPagerAdapter2);
            if (PatchProxy.isSupport(new Object[0], this, f4120c, false, 83287, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f4120c, false, 83287, new Class[0], Void.TYPE);
            } else {
                View a2 = a((int) C0906R.id.cp0);
                Intrinsics.checkExpressionValueIsNotNull(a2, "shadow_view");
                ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.width = UIUtils.getScreenWidth(getContext()) / 3;
                    View a3 = a((int) C0906R.id.cp0);
                    Intrinsics.checkExpressionValueIsNotNull(a3, "shadow_view");
                    a3.setLayoutParams(layoutParams2);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
            }
            if (PatchProxy.isSupport(new Object[]{view2}, this, f4120c, false, 83283, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f4120c, false, 83283, new Class[]{View.class}, Void.TYPE);
            } else {
                CommentBottomSheetBehavior b2 = CommentBottomSheetBehavior.b((ParentViewPager2) a((int) C0906R.id.duu));
                ViewModel viewModel = ViewModelProviders.of(requireActivity()).get(ViewPagerMotionEventViewModel.class);
                Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(re…entViewModel::class.java)");
                MutableLiveData a4 = ((ViewPagerMotionEventViewModel) viewModel).a();
                b2.p = false;
                Intrinsics.checkExpressionValueIsNotNull(b2, "behavior");
                b2.q = true;
                b2.l = new h(this, a4);
                b2.f72312e = true;
                if (com.ss.android.ugc.aweme.story.base.utils.c.a(getContext(), view2)) {
                    b2.a(com.bytedance.ies.dmt.ui.e.a.a(getActivity()) + m() + com.ss.android.ugc.aweme.story.base.utils.c.a(getContext()));
                } else {
                    b2.a(com.bytedance.ies.dmt.ui.e.a.a(getActivity()) + m());
                }
            }
        }
        Disposable unused = a(k(), l.INSTANCE, c(), false, new l(this));
        LifecycleOwner lifecycleOwner = this;
        com.ss.android.ugc.aweme.story.base.a.a.a().a("on_show_sticker_pop_up_window", Boolean.TYPE).observe(lifecycleOwner, new m(this));
        if (PatchProxy.isSupport(new Object[0], this, f4120c, false, 83289, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4120c, false, 83289, new Class[0], Void.TYPE);
        } else if (this.g == null && getContext() != null) {
            if (PatchProxy.isSupport(new Object[0], this, f4120c, false, 83288, new Class[0], DmtStatusView.class)) {
                dmtStatusView = (DmtStatusView) PatchProxy.accessDispatch(new Object[0], this, f4120c, false, 83288, new Class[0], DmtStatusView.class);
            } else {
                Context requireContext = requireContext();
                Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
                DmtStatusView dmtStatusView2 = new DmtStatusView(requireContext);
                DmtStatusView.a a5 = DmtStatusView.a.a((Context) getActivity());
                a5.a((int) C0906R.string.aar);
                a5.b(com.ss.android.ugc.aweme.story.base.view.b.a(requireContext, e.f72549b));
                a5.c(1);
                dmtStatusView2.setBuilder(a5);
                dmtStatusView2.setUseScreenHeight((int) UIUtils.dip2Px(requireContext, 52.0f));
                dmtStatusView2.setBackgroundColor(requireContext.getResources().getColor(C0906R.color.i0));
                dmtStatusView = dmtStatusView2;
            }
            this.g = dmtStatusView;
            new FrameLayout.LayoutParams(-1, -1);
        }
        if (PatchProxy.isSupport(new Object[0], this, f4120c, false, 83277, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4120c, false, 83277, new Class[0], Void.TYPE);
        } else {
            LifeFeedModel a6 = LifeFeedModel.a(requireActivity());
            Intrinsics.checkExpressionValueIsNotNull(a6, "model");
            a6.c().observe(lifecycleOwner, new i(this));
            com.ss.android.ugc.aweme.story.base.a.a.a().a("key_delete_user").observe(lifecycleOwner, new j(this, a6));
            Disposable unused2 = a(k(), k.INSTANCE, c(), false, new k(this, a6));
        }
        if (PatchProxy.isSupport(new Object[0], this, f4120c, false, 83278, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4120c, false, 83278, new Class[0], Void.TYPE);
        } else {
            ViewModel viewModel2 = ViewModelProviders.of(requireActivity()).get(ViewPagerMotionEventViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(viewModel2, "ViewModelProviders.of(re…entViewModel::class.java)");
            MutableLiveData a7 = ((ViewPagerMotionEventViewModel) viewModel2).a();
            ParentViewPager2 parentViewPager23 = (ParentViewPager2) a((int) C0906R.id.duu);
            ParentViewPager2.b dVar = new d(this, a7);
            if (PatchProxy.isSupport(new Object[]{dVar}, parentViewPager23, ParentViewPager2.f72505b, false, 83237, new Class[]{ParentViewPager2.b.class}, Void.TYPE)) {
                ParentViewPager2 parentViewPager24 = parentViewPager23;
                PatchProxy.accessDispatch(new Object[]{dVar}, parentViewPager24, ParentViewPager2.f72505b, false, 83237, new Class[]{ParentViewPager2.b.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(dVar, "onMotionEventChangeListener");
                if (parentViewPager23.g == null) {
                    parentViewPager23.g = new ArrayList<>();
                }
                ArrayList<ParentViewPager2.b> arrayList = parentViewPager23.g;
                if (arrayList == null) {
                    Intrinsics.throwNpe();
                }
                arrayList.add(dVar);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f4120c, false, 83276, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4120c, false, 83276, new Class[0], Void.TYPE);
            return;
        }
        org.greenrobot.eventbus.c.a().a((Object) this);
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f4120c, false, 83274, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f4120c, false, 83274, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        return layoutInflater2.inflate(C0906R.layout.ql, viewGroup2, false);
    }
}

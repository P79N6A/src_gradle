package com.ss.android.ugc.aweme.story.friends;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.h;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.jedi.arch.n;
import com.bytedance.jedi.arch.r;
import com.bytedance.jedi.arch.x;
import com.bytedance.widget.Widget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.story.api.IAVStoryService;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.feed.c.g;
import com.ss.android.ugc.aweme.story.feed.model.LifeFeedModel;
import com.ss.android.ugc.aweme.story.friends.UserStoryListView;
import com.ss.android.ugc.aweme.story.friends.UserStoryListViewModel;
import com.ss.android.ugc.aweme.story.friends.adapter.CurUserViewHolder;
import io.reactivex.disposables.Disposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u00052\b\u0012\u0004\u0012\u00020\u00070\u0006B\u001f\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u000207H\u0016J\u0010\u00108\u001a\u0002052\u0006\u00109\u001a\u00020:H\u0016J\u0012\u0010;\u001a\u0002052\b\u0010<\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010=\u001a\u000205H\u0016J\b\u0010>\u001a\u000205H\u0016J\b\u0010?\u001a\u000205H\u0016J\b\u0010@\u001a\u000205H\u0016J\b\u0010A\u001a\u000205H\u0016J\u0010\u0010B\u001a\u0002052\u0006\u0010C\u001a\u00020DH\u0016J\u0012\u0010E\u001a\u0002052\b\b\u0002\u0010F\u001a\u00020\u0017H\u0002J\b\u0010G\u001a\u000205H\u0016J\b\u0010H\u001a\u000205H\u0016R\u0016\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001b\u0010\u001d\u001a\u00020\u001e8FX\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020,X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u0006I"}, d2 = {"Lcom/ss/android/ugc/aweme/story/friends/UserStoryListWidget;", "Lcom/bytedance/widget/Widget;", "Landroid/arch/lifecycle/Observer;", "Lcom/ss/android/ugc/aweme/story/api/StoryPublishState;", "Lcom/ss/android/ugc/aweme/story/api/userstory/IUserStoryListView;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "Lcom/ss/android/ugc/aweme/story/friends/UserStoryListViewModelFactory;", "context", "Landroid/content/Context;", "mParams", "Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;", "mLifeCycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "(Landroid/content/Context;Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;Landroid/arch/lifecycle/LifecycleOwner;)V", "avStoryService", "Lcom/ss/android/ugc/aweme/story/api/IAVStoryService;", "kotlin.jvm.PlatformType", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "isPublishItemAdded", "", "()Z", "setPublishItemAdded", "(Z)V", "isPublishing", "setPublishing", "lifeFeedViewModel", "Lcom/ss/android/ugc/aweme/story/friends/UserStoryListViewModel;", "getLifeFeedViewModel", "()Lcom/ss/android/ugc/aweme/story/friends/UserStoryListViewModel;", "lifeFeedViewModel$delegate", "Lcom/bytedance/jedi/arch/lifecycleAwareLazy;", "getMLifeCycleOwner", "()Landroid/arch/lifecycle/LifecycleOwner;", "setMLifeCycleOwner", "(Landroid/arch/lifecycle/LifecycleOwner;)V", "getMParams", "()Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;", "setMParams", "(Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;)V", "userStoryListView", "Lcom/ss/android/ugc/aweme/story/friends/UserStoryListView;", "getUserStoryListView", "()Lcom/ss/android/ugc/aweme/story/friends/UserStoryListView;", "setUserStoryListView", "(Lcom/ss/android/ugc/aweme/story/friends/UserStoryListView;)V", "viewModelFactory", "getViewModelFactory", "()Lcom/ss/android/ugc/aweme/story/friends/UserStoryListViewModelFactory;", "addPublishItem", "", "getView", "Landroid/view/View;", "insertStory", "uid", "", "onChanged", "it", "onDestroy", "onStart", "onStoryPublish", "onStoryPublishAnimateEndEvent", "refresh", "scrollToLiveStory", "roomId", "", "showUploadStoryIfNeed", "isOnPublishCallback", "startAnimation", "stopAnimation", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class UserStoryListWidget extends Widget implements Observer<com.ss.android.ugc.aweme.story.api.j>, ae<a>, com.bytedance.jedi.arch.h, com.ss.android.ugc.aweme.story.api.b.c {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f73034f;
    static final /* synthetic */ KProperty[] g = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(UserStoryListWidget.class), "lifeFeedViewModel", "getLifeFeedViewModel()Lcom/ss/android/ugc/aweme/story/friends/UserStoryListViewModel;"))};
    @NotNull
    public UserStoryListView h = new UserStoryListView(this.k, this.l, this.m);
    public boolean i;
    public boolean j;
    @Nullable
    public Context k;
    @NotNull
    public com.ss.android.ugc.aweme.story.api.model.h l;
    @NotNull
    public LifecycleOwner m;
    @NotNull
    private final lifecycleAwareLazy n;
    private final IAVStoryService o = ((IAVStoryService) ServiceManager.get().getService(IAVStoryService.class));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0014\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0005\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0002\u0010\u0007*\u00020\bH\n¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"<anonymous>", "VM", "T", "Lcom/bytedance/widget/Widget;", "Lcom/bytedance/jedi/arch/JediView;", "Lcom/bytedance/jedi/arch/ViewModelFactoryOwner;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "()Lcom/bytedance/jedi/arch/JediViewModel;", "com/bytedance/jedi/arch/LegeciesKt$viewModel$3"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function0<UserStoryListViewModel> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Function1 $argumentsAcceptor;
        final /* synthetic */ Widget $this_viewModel;
        final /* synthetic */ Widget $this_viewModel$inlined;
        final /* synthetic */ KClass $viewModelClass;
        final /* synthetic */ KClass $viewModelClass$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Widget widget, KClass kClass, Function1 function1, Widget widget2, KClass kClass2) {
            super(0);
            this.$this_viewModel = widget;
            this.$viewModelClass = kClass;
            this.$argumentsAcceptor = function1;
            this.$this_viewModel$inlined = widget2;
            this.$viewModelClass$inlined = kClass2;
        }

        /* JADX WARNING: type inference failed for: r0v5, types: [com.ss.android.ugc.aweme.story.friends.UserStoryListViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r0v13, types: [com.ss.android.ugc.aweme.story.friends.UserStoryListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        @NotNull
        public final UserStoryListViewModel invoke() {
            ViewModelProvider viewModelProvider;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 84560, new Class[0], JediViewModel.class)) {
                return (JediViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 84560, new Class[0], JediViewModel.class);
            }
            Object j = this.$this_viewModel.j();
            if (j instanceof Fragment) {
                viewModelProvider = ViewModelProviders.of((Fragment) j, ((ae) this.$this_viewModel).r_());
            } else if (j instanceof FragmentActivity) {
                viewModelProvider = ViewModelProviders.of((FragmentActivity) j, ((ae) this.$this_viewModel).r_());
            } else {
                throw new IllegalStateException();
            }
            ? r0 = (JediViewModel) viewModelProvider.get(this.$this_viewModel$inlined.getClass().getName() + '_' + kotlin.jvm.a.a(this.$viewModelClass$inlined).getName(), kotlin.jvm.a.a(this.$viewModelClass));
            n a2 = r0.f2282c.a(UserStoryListViewModel.class);
            if (a2 != null) {
                Intrinsics.checkExpressionValueIsNotNull(r0, "this");
                a2.binding(r0);
            }
            r0.a(this.$argumentsAcceptor);
            return r0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/story/friends/UserStoryListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<UserStoryListState, UserStoryListState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ UserStoryListWidget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(UserStoryListWidget userStoryListWidget) {
            super(1);
            this.this$0 = userStoryListWidget;
        }

        @NotNull
        public final UserStoryListState invoke(@NotNull UserStoryListState userStoryListState) {
            UserStoryListState userStoryListState2 = userStoryListState;
            if (PatchProxy.isSupport(new Object[]{userStoryListState2}, this, changeQuickRedirect, false, 84561, new Class[]{UserStoryListState.class}, UserStoryListState.class)) {
                return (UserStoryListState) PatchProxy.accessDispatch(new Object[]{userStoryListState2}, this, changeQuickRedirect, false, 84561, new Class[]{UserStoryListState.class}, UserStoryListState.class);
            }
            Intrinsics.checkParameterIsNotNull(userStoryListState2, "$receiver");
            return UserStoryListState.copy$default(userStoryListState2, null, this.this$0.l, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0002H\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T", "RECEIVER", "invoke", "(Ljava/lang/Object;)V", "com/bytedance/jedi/arch/ext/list/ListListenerKt$ListListener$1"}, k = 3, mv = {1, 1, 15})
    public static final class c extends Lambda implements Function1<com.bytedance.jedi.arch.f, Unit> {
        public static final c INSTANCE = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        public c() {
            super(1);
        }

        public final void invoke(com.bytedance.jedi.arch.f fVar) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0002H\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "RECEIVER", "it", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "com/bytedance/jedi/arch/ext/list/ListListenerKt$ListListener$2"}, k = 3, mv = {1, 1, 15})
    public static final class d extends Lambda implements Function2<com.bytedance.jedi.arch.f, Throwable, Unit> {
        public static final d INSTANCE = new d();
        public static ChangeQuickRedirect changeQuickRedirect;

        public d() {
            super(2);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (Throwable) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(com.bytedance.jedi.arch.f fVar, @NotNull Throwable th) {
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{fVar, th2}, this, changeQuickRedirect, false, 84562, new Class[]{Object.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, th2}, this, changeQuickRedirect, false, 84562, new Class[]{Object.class, Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, AdvanceSetting.NETWORK_TYPE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001R+\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR1\u0010\r\u001a\u001f\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b¨\u0006\u0010¸\u0006\u0000"}, d2 = {"com/bytedance/jedi/arch/ext/list/ListListenerKt$ListListener$4", "Lcom/bytedance/jedi/arch/ext/list/ListListener;", "onError", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getOnError", "()Lkotlin/jvm/functions/Function2;", "onLoading", "Lkotlin/Function1;", "getOnLoading", "()Lkotlin/jvm/functions/Function1;", "onSuccess", "", "getOnSuccess", "ext_list_release"}, k = 1, mv = {1, 1, 15})
    public static final class e implements com.bytedance.jedi.arch.ext.list.c<com.ss.android.ugc.aweme.story.api.model.c, com.bytedance.jedi.arch.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function1 f73035a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f73036b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function2 f73037c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        private final Function1<com.bytedance.jedi.arch.f, Unit> f73038d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> f73039e;
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, List<? extends com.ss.android.ugc.aweme.story.api.model.c>, Unit> f73040f;

        @NotNull
        public final Function1<com.bytedance.jedi.arch.f, Unit> a() {
            return this.f73038d;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> b() {
            return this.f73039e;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, List<? extends com.ss.android.ugc.aweme.story.api.model.c>, Unit> c() {
            return this.f73040f;
        }

        public e(Function1 function1, Function2 function2, Function2 function22) {
            this.f73035a = function1;
            this.f73036b = function2;
            this.f73037c = function22;
            this.f73038d = function1;
            this.f73039e = function2;
            this.f73040f = function22;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0002H\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T", "RECEIVER", "invoke", "(Ljava/lang/Object;)V", "com/bytedance/jedi/arch/ext/list/ListListenerKt$ListListener$1"}, k = 3, mv = {1, 1, 15})
    public static final class f extends Lambda implements Function1<com.bytedance.jedi.arch.f, Unit> {
        public static final f INSTANCE = new f();
        public static ChangeQuickRedirect changeQuickRedirect;

        public f() {
            super(1);
        }

        public final void invoke(com.bytedance.jedi.arch.f fVar) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0002H\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "RECEIVER", "it", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "com/bytedance/jedi/arch/ext/list/ListListenerKt$ListListener$2"}, k = 3, mv = {1, 1, 15})
    public static final class g extends Lambda implements Function2<com.bytedance.jedi.arch.f, Throwable, Unit> {
        public static final g INSTANCE = new g();
        public static ChangeQuickRedirect changeQuickRedirect;

        public g() {
            super(2);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (Throwable) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(com.bytedance.jedi.arch.f fVar, @NotNull Throwable th) {
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{fVar, th2}, this, changeQuickRedirect, false, 84563, new Class[]{Object.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, th2}, this, changeQuickRedirect, false, 84563, new Class[]{Object.class, Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, AdvanceSetting.NETWORK_TYPE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001R+\u0010\u0002\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00050\n¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR1\u0010\r\u001a\u001f\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b¨\u0006\u0010¸\u0006\u0000"}, d2 = {"com/bytedance/jedi/arch/ext/list/ListListenerKt$ListListener$4", "Lcom/bytedance/jedi/arch/ext/list/ListListener;", "onError", "Lkotlin/Function2;", "", "", "Lkotlin/ExtensionFunctionType;", "getOnError", "()Lkotlin/jvm/functions/Function2;", "onLoading", "Lkotlin/Function1;", "getOnLoading", "()Lkotlin/jvm/functions/Function1;", "onSuccess", "", "getOnSuccess", "ext_list_release"}, k = 1, mv = {1, 1, 15})
    public static final class h implements com.bytedance.jedi.arch.ext.list.c<com.ss.android.ugc.aweme.story.api.model.c, com.bytedance.jedi.arch.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function1 f73041a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function2 f73042b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function2 f73043c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        private final Function1<com.bytedance.jedi.arch.f, Unit> f73044d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> f73045e;
        @NotNull

        /* renamed from: f  reason: collision with root package name */
        private final Function2<com.bytedance.jedi.arch.f, List<? extends com.ss.android.ugc.aweme.story.api.model.c>, Unit> f73046f;

        @NotNull
        public final Function1<com.bytedance.jedi.arch.f, Unit> a() {
            return this.f73044d;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, Throwable, Unit> b() {
            return this.f73045e;
        }

        @NotNull
        public final Function2<com.bytedance.jedi.arch.f, List<? extends com.ss.android.ugc.aweme.story.api.model.c>, Unit> c() {
            return this.f73046f;
        }

        public h(Function1 function1, Function2 function2, Function2 function22) {
            this.f73041a = function1;
            this.f73042b = function2;
            this.f73043c = function22;
            this.f73044d = function1;
            this.f73045e = function2;
            this.f73046f = function22;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ UserStoryListWidget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(UserStoryListWidget userStoryListWidget) {
            super(0);
            this.this$0 = userStoryListWidget;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 84564, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 84564, new Class[0], Void.TYPE);
                return;
            }
            UserStoryListViewModel o = this.this$0.o();
            if (PatchProxy.isSupport(new Object[]{o}, null, c.f73116a, true, 84517, new Class[]{UserStoryListViewModel.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{o}, null, c.f73116a, true, 84517, new Class[]{UserStoryListViewModel.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(o, "$this$listLoadMore");
            o.h.loadMore();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function2<com.bytedance.jedi.arch.f, Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ UserStoryListWidget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(UserStoryListWidget userStoryListWidget) {
            super(2);
            this.this$0 = userStoryListWidget;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, boolean z) {
            String str;
            com.bytedance.jedi.arch.f fVar2 = fVar;
            boolean z2 = z;
            if (PatchProxy.isSupport(new Object[]{fVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 84565, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2, Byte.valueOf(z)}, this, changeQuickRedirect, false, 84565, new Class[]{com.bytedance.jedi.arch.f.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            UserStoryListView userStoryListView = this.this$0.h;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, userStoryListView, UserStoryListView.f4155a, false, 84461, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                UserStoryListView userStoryListView2 = userStoryListView;
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, userStoryListView2, UserStoryListView.f4155a, false, 84461, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (userStoryListView.f4158d != z2 && userStoryListView.f4158d) {
                com.ss.android.ugc.aweme.story.metrics.f fVar3 = new com.ss.android.ugc.aweme.story.metrics.f();
                com.ss.android.ugc.aweme.story.api.model.h hVar = userStoryListView.h;
                if (hVar != null) {
                    str = hVar.f71857b;
                } else {
                    str = null;
                }
                fVar3.a(str).post();
            }
            userStoryListView.f4158d = z2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "list", "", "Lcom/ss/android/ugc/aweme/story/api/model/BaseStory;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class k extends Lambda implements Function2<com.bytedance.jedi.arch.f, List<? extends com.ss.android.ugc.aweme.story.api.model.c>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ UserStoryListWidget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(UserStoryListWidget userStoryListWidget) {
            super(2);
            this.this$0 = userStoryListWidget;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (List) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull List<? extends com.ss.android.ugc.aweme.story.api.model.c> list) {
            if (PatchProxy.isSupport(new Object[]{fVar, list}, this, changeQuickRedirect, false, 84566, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, list}, this, changeQuickRedirect, false, 84566, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(list, "list");
            LifeFeedModel a2 = com.ss.android.ugc.aweme.story.feed.c.c.a(this.this$0.k, this.this$0.l.f71856a);
            com.ss.android.ugc.aweme.story.feed.model.a aVar = new com.ss.android.ugc.aweme.story.feed.model.a();
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (((com.ss.android.ugc.aweme.story.api.model.c) next) instanceof UserStory) {
                    arrayList.add(next);
                }
            }
            Iterable<com.ss.android.ugc.aweme.story.api.model.c> iterable = (List) arrayList;
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (com.ss.android.ugc.aweme.story.api.model.c cVar : iterable) {
                if (cVar != null) {
                    arrayList2.add((UserStory) cVar);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.story.api.model.UserStory");
                }
            }
            aVar.setUserStoryList((List) arrayList2);
            if (a2 != null) {
                a2.a(aVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "list", "", "Lcom/ss/android/ugc/aweme/story/api/model/BaseStory;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class l extends Lambda implements Function2<com.bytedance.jedi.arch.f, List<? extends com.ss.android.ugc.aweme.story.api.model.c>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ UserStoryListWidget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(UserStoryListWidget userStoryListWidget) {
            super(2);
            this.this$0 = userStoryListWidget;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.bytedance.jedi.arch.f) obj, (List) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.bytedance.jedi.arch.f fVar, @NotNull List<? extends com.ss.android.ugc.aweme.story.api.model.c> list) {
            if (PatchProxy.isSupport(new Object[]{fVar, list}, this, changeQuickRedirect, false, 84567, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, list}, this, changeQuickRedirect, false, 84567, new Class[]{com.bytedance.jedi.arch.f.class, List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(list, "list");
            LifeFeedModel a2 = com.ss.android.ugc.aweme.story.feed.c.c.a(this.this$0.k, this.this$0.l.f71856a);
            com.ss.android.ugc.aweme.story.feed.model.a aVar = new com.ss.android.ugc.aweme.story.feed.model.a();
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (((com.ss.android.ugc.aweme.story.api.model.c) next) instanceof UserStory) {
                    arrayList.add(next);
                }
            }
            Iterable<com.ss.android.ugc.aweme.story.api.model.c> iterable = (List) arrayList;
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (com.ss.android.ugc.aweme.story.api.model.c cVar : iterable) {
                if (cVar != null) {
                    arrayList2.add((UserStory) cVar);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.story.api.model.UserStory");
                }
            }
            aVar.setUserStoryList((List) arrayList2);
            if (a2 != null) {
                a2.a(aVar);
            }
        }
    }

    @NotNull
    public final UserStoryListViewModel o() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f73034f, false, 84521, new Class[0], UserStoryListViewModel.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f73034f, false, 84521, new Class[0], UserStoryListViewModel.class);
        } else {
            value = this.n.getValue();
        }
        return (UserStoryListViewModel) value;
    }

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f73034f, false, 84525, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f73034f, false, 84525, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "uid");
        o().a(str2);
    }

    public final void a(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f73034f, false, 84535, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f73034f, false, 84535, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        this.h.a(j3);
    }

    @NotNull
    public final com.bytedance.jedi.arch.k a() {
        if (!PatchProxy.isSupport(new Object[0], this, f73034f, false, 84538, new Class[0], com.bytedance.jedi.arch.k.class)) {
            return h.a.a(this);
        }
        return (com.bytedance.jedi.arch.k) PatchProxy.accessDispatch(new Object[0], this, f73034f, false, 84538, new Class[0], com.bytedance.jedi.arch.k.class);
    }

    public final void ai_() {
        if (PatchProxy.isSupport(new Object[0], this, f73034f, false, 84529, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73034f, false, 84529, new Class[0], Void.TYPE);
            return;
        }
        c.a(o());
        this.h.a();
    }

    @NotNull
    public final r<com.bytedance.jedi.arch.f> b() {
        if (!PatchProxy.isSupport(new Object[0], this, f73034f, false, 84541, new Class[0], r.class)) {
            return h.a.b(this);
        }
        return (r) PatchProxy.accessDispatch(new Object[0], this, f73034f, false, 84541, new Class[0], r.class);
    }

    public final boolean c() {
        if (!PatchProxy.isSupport(new Object[0], this, f73034f, false, 84542, new Class[0], Boolean.TYPE)) {
            return h.a.e(this);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f73034f, false, 84542, new Class[0], Boolean.TYPE)).booleanValue();
    }

    @NotNull
    public final LifecycleOwner d() {
        if (!PatchProxy.isSupport(new Object[0], this, f73034f, false, 84539, new Class[0], LifecycleOwner.class)) {
            return h.a.c(this);
        }
        return (LifecycleOwner) PatchProxy.accessDispatch(new Object[0], this, f73034f, false, 84539, new Class[0], LifecycleOwner.class);
    }

    public final /* synthetic */ com.bytedance.jedi.arch.d e() {
        com.bytedance.jedi.arch.f fVar;
        if (PatchProxy.isSupport(new Object[0], this, f73034f, false, 84540, new Class[0], com.bytedance.jedi.arch.f.class)) {
            fVar = (com.bytedance.jedi.arch.f) PatchProxy.accessDispatch(new Object[0], this, f73034f, false, 84540, new Class[0], com.bytedance.jedi.arch.f.class);
        } else {
            fVar = h.a.d(this);
        }
        return fVar;
    }

    @NotNull
    public final View g() {
        if (PatchProxy.isSupport(new Object[0], this, f73034f, false, 84524, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f73034f, false, 84524, new Class[0], View.class);
        }
        View rootView = this.h.getRootView();
        Intrinsics.checkExpressionValueIsNotNull(rootView, "userStoryListView.rootView");
        return rootView;
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f73034f, false, 84532, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73034f, false, 84532, new Class[0], Void.TYPE);
            return;
        }
        super.i();
        IAVStoryService iAVStoryService = this.o;
        if (iAVStoryService != null) {
            MutableLiveData<com.ss.android.ugc.aweme.story.api.j> publishState = iAVStoryService.getPublishState();
            if (publishState != null) {
                publishState.removeObserver(this);
            }
        }
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f73034f, false, 84526, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73034f, false, 84526, new Class[0], Void.TYPE);
            return;
        }
        if (this.h.g) {
            a(true);
        }
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, f73034f, false, 84533, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73034f, false, 84533, new Class[0], Void.TYPE);
            return;
        }
        this.h.b();
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, f73034f, false, 84534, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73034f, false, 84534, new Class[0], Void.TYPE);
            return;
        }
        this.h.c();
    }

    public final /* synthetic */ ViewModelProvider.Factory r_() {
        a aVar;
        if (PatchProxy.isSupport(new Object[0], this, f73034f, false, 84522, new Class[0], a.class)) {
            aVar = (a) PatchProxy.accessDispatch(new Object[0], this, f73034f, false, 84522, new Class[0], a.class);
        } else {
            aVar = new a(this.l);
        }
        return aVar;
    }

    private final void p() {
        if (PatchProxy.isSupport(new Object[0], this, f73034f, false, 84531, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73034f, false, 84531, new Class[0], Void.TYPE);
        } else if (!this.i) {
            this.h.a();
            this.j = true;
            g.a aVar = com.ss.android.ugc.aweme.story.feed.c.g.f72503b;
            Object service = ServiceManager.get().getService(IUserService.class);
            Intrinsics.checkExpressionValueIsNotNull(service, "ServiceManager.get().get…IUserService::class.java)");
            o().a(aVar.b(((IUserService) service).getCurrentUser()));
            this.i = true;
        }
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f73034f, false, 84528, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73034f, false, 84528, new Class[0], Void.TYPE);
            return;
        }
        UserStoryListView userStoryListView = this.h;
        if (PatchProxy.isSupport(new Object[0], userStoryListView, UserStoryListView.f4155a, false, 84466, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], userStoryListView, UserStoryListView.f4155a, false, 84466, new Class[0], Void.TYPE);
            return;
        }
        RecyclerView recyclerView = userStoryListView.f4156b;
        if (recyclerView != null) {
            recyclerView.postDelayed(new UserStoryListView.c(userStoryListView), 500);
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f73034f, false, 84523, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73034f, false, 84523, new Class[0], Void.TYPE);
            return;
        }
        super.h();
        if (com.ss.android.ugc.aweme.g.a.a()) {
            RxJavaPlugins.setErrorHandler(null);
        }
        this.h.setToLoadMore(new i(this));
        UserStoryListViewModel o2 = o();
        com.bytedance.jedi.arch.e eVar = this;
        com.bytedance.jedi.arch.ext.list.a mAdapter = this.h.getMAdapter();
        Function2 jVar = new j(this);
        com.bytedance.jedi.arch.ext.list.c eVar2 = new e(c.INSTANCE, d.INSTANCE, new k(this));
        com.bytedance.jedi.arch.ext.list.c hVar = new h(f.INSTANCE, g.INSTANCE, new l(this));
        if (PatchProxy.isSupport(new Object[]{o2, eVar, mAdapter, eVar2, hVar, jVar}, null, c.f73116a, true, 84519, new Class[]{UserStoryListViewModel.class, com.bytedance.jedi.arch.e.class, com.bytedance.jedi.arch.ext.list.a.class, com.bytedance.jedi.arch.ext.list.c.class, com.bytedance.jedi.arch.ext.list.c.class, Function2.class}, Void.TYPE)) {
            Object[] objArr = {o2, eVar, mAdapter, eVar2, hVar, jVar};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, c.f73116a, true, 84519, new Class[]{UserStoryListViewModel.class, com.bytedance.jedi.arch.e.class, com.bytedance.jedi.arch.ext.list.a.class, com.bytedance.jedi.arch.ext.list.c.class, com.bytedance.jedi.arch.ext.list.c.class, Function2.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(o2, "$this$listSubscribe");
            Intrinsics.checkParameterIsNotNull(eVar, "subscriber");
            Intrinsics.checkParameterIsNotNull(mAdapter, "adapter");
            ListMiddleware.a(o2.h, eVar, mAdapter, false, eVar.c(), eVar2, hVar, jVar, null, SearchJediMixFeedAdapter.f42517f);
        }
        IAVStoryService iAVStoryService = this.o;
        if (iAVStoryService != null) {
            MutableLiveData<com.ss.android.ugc.aweme.story.api.j> publishState = iAVStoryService.getPublishState();
            if (publishState != null) {
                publishState.observe(this, this);
            }
        }
        a(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0042, code lost:
        if (r16.j != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(boolean r17) {
        /*
            r16 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r17)
            r8 = 0
            r1[r8] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f73034f
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r6[r8] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 84527(0x14a2f, float:1.18448E-40)
            r2 = r16
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x003c
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r17)
            r9[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r11 = f73034f
            r12 = 0
            r13 = 84527(0x14a2f, float:1.18448E-40)
            java.lang.Class[] r14 = new java.lang.Class[r0]
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r14[r8] = r0
            java.lang.Class r15 = java.lang.Void.TYPE
            r10 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x003c:
            if (r17 != 0) goto L_0x0045
            r0 = r16
            boolean r1 = r0.j
            if (r1 == 0) goto L_0x004a
            goto L_0x0047
        L_0x0045:
            r0 = r16
        L_0x0047:
            r16.p()
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.friends.UserStoryListWidget.a(boolean):void");
    }

    public final /* synthetic */ void onChanged(Object obj) {
        Integer num;
        com.ss.android.ugc.aweme.story.api.j jVar = (com.ss.android.ugc.aweme.story.api.j) obj;
        if (PatchProxy.isSupport(new Object[]{jVar}, this, f73034f, false, 84530, new Class[]{com.ss.android.ugc.aweme.story.api.j.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar}, this, f73034f, false, 84530, new Class[]{com.ss.android.ugc.aweme.story.api.j.class}, Void.TYPE);
            return;
        }
        RecyclerView.ViewHolder viewHolder = null;
        if (jVar != null) {
            num = Integer.valueOf(jVar.f71843e);
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 1) {
            p();
            return;
        }
        if (num == null || num.intValue() != 2) {
            if (num != null && num.intValue() == 4) {
                com.ss.android.ugc.aweme.story.api.model.b bVar = new com.ss.android.ugc.aweme.story.api.model.b();
                bVar.setLifeStory(jVar.g);
                UserStoryListViewModel o2 = o();
                if (PatchProxy.isSupport(new Object[]{bVar}, o2, UserStoryListViewModel.f73023d, false, 84495, new Class[]{com.ss.android.ugc.aweme.story.api.model.b.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bVar}, o2, UserStoryListViewModel.f73023d, false, 84495, new Class[]{com.ss.android.ugc.aweme.story.api.model.b.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(bVar, "publishedStory");
                    o2.b(new UserStoryListViewModel.k(o2, bVar));
                }
                this.j = false;
                this.i = false;
            } else if (num != null && num.intValue() == 3) {
                UserStoryListView userStoryListView = this.h;
                if (PatchProxy.isSupport(new Object[0], userStoryListView, UserStoryListView.f4155a, false, 84475, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], userStoryListView, UserStoryListView.f4155a, false, 84475, new Class[0], Void.TYPE);
                } else {
                    RecyclerView recyclerView = userStoryListView.f4156b;
                    if (recyclerView != null) {
                        viewHolder = recyclerView.findViewHolderForAdapterPosition(0);
                    }
                    if (viewHolder instanceof CurUserViewHolder) {
                        ((CurUserViewHolder) viewHolder).f();
                    }
                }
            } else if (num != null && num.intValue() == 5) {
                this.j = false;
                this.i = false;
            }
        }
    }

    public final <VM1 extends JediViewModel<S1>, S1 extends x, R> R a(@NotNull VM1 vm1, @NotNull Function1<? super S1, ? extends R> function1) {
        VM1 vm12 = vm1;
        Function1<? super S1, ? extends R> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{vm12, function12}, this, f73034f, false, 84543, new Class[]{JediViewModel.class, Function1.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{vm12, function12}, this, f73034f, false, 84543, new Class[]{JediViewModel.class, Function1.class}, Object.class);
        }
        Intrinsics.checkParameterIsNotNull(vm12, "viewModel1");
        Intrinsics.checkParameterIsNotNull(function12, "block");
        return h.a.a(this, vm1, function1);
    }

    public UserStoryListWidget(@Nullable Context context, @NotNull com.ss.android.ugc.aweme.story.api.model.h hVar, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(hVar, "mParams");
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "mLifeCycleOwner");
        this.k = context;
        this.l = hVar;
        this.m = lifecycleOwner;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UserStoryListViewModel.class);
        a aVar = new a(this, orCreateKotlinClass, new b(this), this, orCreateKotlinClass);
        this.n = new lifecycleAwareLazy(this, aVar);
    }

    @NotNull
    public final <S extends x> Disposable a(@NotNull JediViewModel<S> jediViewModel, boolean z, boolean z2, @NotNull Function2<? super com.bytedance.jedi.arch.f, ? super S, Unit> function2) {
        JediViewModel<S> jediViewModel2 = jediViewModel;
        Function2<? super com.bytedance.jedi.arch.f, ? super S, Unit> function22 = function2;
        if (PatchProxy.isSupport(new Object[]{jediViewModel2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), function22}, this, f73034f, false, 84559, new Class[]{JediViewModel.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class)) {
            return (Disposable) PatchProxy.accessDispatch(new Object[]{jediViewModel2, Byte.valueOf(z), Byte.valueOf(z2), function22}, this, f73034f, false, 84559, new Class[]{JediViewModel.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class);
        }
        Intrinsics.checkParameterIsNotNull(jediViewModel2, "$this$subscribe");
        Intrinsics.checkParameterIsNotNull(function22, "subscriber");
        return h.a.a(this, jediViewModel, z, z2, function2);
    }

    @NotNull
    public final <S extends x, A> Disposable a(@NotNull JediViewModel<S> jediViewModel, @NotNull KProperty1<S, ? extends A> kProperty1, boolean z, boolean z2, @NotNull Function2<? super com.bytedance.jedi.arch.f, ? super A, Unit> function2) {
        JediViewModel<S> jediViewModel2 = jediViewModel;
        KProperty1<S, ? extends A> kProperty12 = kProperty1;
        Function2<? super com.bytedance.jedi.arch.f, ? super A, Unit> function22 = function2;
        if (PatchProxy.isSupport(new Object[]{jediViewModel2, kProperty12, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), function22}, this, f73034f, false, 84554, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class)) {
            Object[] objArr = {jediViewModel2, kProperty12, Byte.valueOf(z), Byte.valueOf(z2), function22};
            return (Disposable) PatchProxy.accessDispatch(objArr, this, f73034f, false, 84554, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class);
        }
        Intrinsics.checkParameterIsNotNull(jediViewModel2, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(kProperty12, "prop1");
        Intrinsics.checkParameterIsNotNull(function22, "subscriber");
        return h.a.a(this, jediViewModel, kProperty1, z, z2, function2);
    }

    @NotNull
    public final <S extends x, T> Disposable a(@NotNull JediViewModel<S> jediViewModel, @NotNull KProperty1<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kProperty1, boolean z, boolean z2, @Nullable Function2<? super com.bytedance.jedi.arch.f, ? super Throwable, Unit> function2, @Nullable Function1<? super com.bytedance.jedi.arch.f, Unit> function1, @Nullable Function2<? super com.bytedance.jedi.arch.f, ? super T, Unit> function22) {
        JediViewModel<S> jediViewModel2 = jediViewModel;
        KProperty1<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kProperty12 = kProperty1;
        if (PatchProxy.isSupport(new Object[]{jediViewModel2, kProperty12, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), function2, function1, function22}, this, f73034f, false, 84553, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class, Function1.class, Function2.class}, Disposable.class)) {
            return (Disposable) PatchProxy.accessDispatch(new Object[]{jediViewModel2, kProperty12, Byte.valueOf(z), Byte.valueOf(z2), function2, function1, function22}, this, f73034f, false, 84553, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class, Function1.class, Function2.class}, Disposable.class);
        }
        Intrinsics.checkParameterIsNotNull(jediViewModel2, "$this$asyncSubscribe");
        Intrinsics.checkParameterIsNotNull(kProperty12, "prop");
        return h.a.a(this, jediViewModel, kProperty1, z, z2, function2, function1, function22);
    }
}

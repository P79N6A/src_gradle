package com.ss.android.ugc.aweme.story.feed.jedi;

import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.e;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.jedi.arch.n;
import com.bytedance.widget.Widget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.model.LifeStory;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.base.jedi.BaseJediViewHolder;
import com.ss.android.ugc.aweme.story.base.view.viewpager.RollViewPager;
import com.ss.android.ugc.aweme.story.feed.c.g;
import com.ss.android.ugc.aweme.story.feed.jedi.StoryAuthorJediWidget;
import com.ss.android.ugc.aweme.story.feed.jedi.ViewPager2ViewModel;
import com.ss.android.ugc.aweme.story.feed.jedi.adapter.StoryViewHolder;
import com.ss.android.ugc.aweme.story.feed.model.LifeFeedModel;
import com.ss.android.ugc.aweme.story.feed.view.adapter.StoryFeedPagerAdapter;
import com.ss.android.ugc.aweme.story.feed.view.ui.StoryProgressViewReal;
import com.ss.android.ugc.aweme.story.feed.viewmodel.ChangeUserModeViewModel;
import com.ss.android.ugc.aweme.story.feed.viewmodel.StoryChange;
import com.ss.android.ugc.aweme.story.feed.viewmodel.ViewPagerMotionEventViewModel;
import com.ss.android.ugc.aweme.story.metrics.m;
import com.ss.android.ugc.aweme.story.viewpager2.widget.ViewPager2;
import io.reactivex.disposables.Disposable;
import java.util.List;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000±\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\b\u000b*\u00010\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010<\u001a\u00020\u001e2\u0006\u0010=\u001a\u00020>J\u0010\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH\u0002J\u0010\u0010C\u001a\u00020@2\u0006\u0010D\u001a\u00020BH\u0002J\u0006\u0010E\u001a\u00020\u0002J\u0006\u0010F\u001a\u00020@J\b\u0010G\u001a\u00020@H\u0002J\b\u0010H\u001a\u00020@H\u0002J\u0012\u0010I\u001a\u0004\u0018\u00010\u00142\u0006\u0010J\u001a\u00020BH\u0002J\u0006\u0010K\u001a\u00020@J\u000e\u0010L\u001a\u00020@2\u0006\u0010M\u001a\u00020>J\b\u0010N\u001a\u00020\u001eH\u0016J\b\u0010O\u001a\u00020\u001eH\u0016J\u0010\u0010P\u001a\u00020@2\u0006\u0010Q\u001a\u000205H\u0002J\u0010\u0010R\u001a\u00020@2\u0006\u0010Q\u001a\u000205H\u0002J\b\u0010S\u001a\u00020@H\u0002J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010T\u001a\u0004\u0018\u00010UH\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010V\u001a\u00020>H\u0002J\u0012\u0010W\u001a\u00020\u001e2\b\u0010X\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010Y\u001a\u00020\u001e2\u0006\u0010X\u001a\u00020\u0002H\u0002J\b\u0010Z\u001a\u00020@H\u0016J\u0006\u0010[\u001a\u00020@J\u0012\u0010\\\u001a\u00020@2\b\u0010T\u001a\u0004\u0018\u00010UH\u0002J\u0018\u0010]\u001a\u00020@2\u0006\u0010^\u001a\u00020\u00022\u0006\u0010_\u001a\u00020BH\u0014J\b\u0010`\u001a\u00020@H\u0016J\b\u0010a\u001a\u00020@H\u0016J\u0006\u0010b\u001a\u00020@J\u000e\u0010c\u001a\u00020@2\u0006\u0010d\u001a\u00020\u001eJ\u000e\u0010e\u001a\u00020@2\u0006\u0010d\u001a\u00020\u001eJ\u0006\u0010f\u001a\u00020@J\b\u0010g\u001a\u00020@H\u0016J\"\u0010h\u001a\u00020@2\b\u0010X\u001a\u0004\u0018\u00010\u00022\u000e\u0010i\u001a\n\u0012\u0004\u0012\u00020U\u0018\u00010jH\u0002J\u0010\u0010k\u001a\u00020@2\u0006\u0010l\u001a\u00020\u001eH\u0002J \u0010m\u001a\u00020@2\u0006\u0010l\u001a\u00020\u001e2\u0006\u0010n\u001a\u00020B2\u0006\u0010o\u001a\u00020BH\u0002J \u0010p\u001a\u00020@2\u0006\u0010l\u001a\u00020\u001e2\u0006\u0010q\u001a\u00020B2\u0006\u0010r\u001a\u00020BH\u0002J\u0006\u0010s\u001a\u00020@J\b\u0010t\u001a\u00020@H\u0002R\u0014\u0010\u000b\u001a\u00020\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001fR\u0014\u0010 \u001a\u00020\u001e8BX\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001fR\u0014\u0010!\u001a\u00020\u001e8BX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0011\u0010\"\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001fR\u0011\u0010#\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b#\u0010\u001fR\u0014\u0010$\u001a\u00020\u001e8BX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001fR\u000e\u0010%\u001a\u00020&X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u000200X\u0004¢\u0006\u0004\n\u0002\u00101R\u000e\u00102\u001a\u000203X\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0004¢\u0006\u0002\n\u0000R\u0014\u00108\u001a\u0002098BX\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006u"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryMainHolder2;", "Lcom/ss/android/ugc/aweme/story/base/jedi/BaseJediViewHolder;", "Lcom/ss/android/ugc/aweme/story/api/model/UserStory;", "Lcom/ss/android/ugc/aweme/story/base/view/viewpager/RollViewPager$ILoadMore;", "parent", "Landroid/view/ViewGroup;", "mFragment", "Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryFeedJediFragment;", "mParentViewPager", "Lcom/ss/android/ugc/aweme/story/viewpager2/widget/ViewPager2;", "(Landroid/view/ViewGroup;Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryFeedJediFragment;Lcom/ss/android/ugc/aweme/story/viewpager2/widget/ViewPager2;)V", "curPlayPosition", "", "getCurPlayPosition", "()J", "curTransitionView", "Lcom/ss/android/ugc/aweme/story/detail/SharedElementsView;", "getCurTransitionView", "()Lcom/ss/android/ugc/aweme/story/detail/SharedElementsView;", "curViewHolder", "Lcom/ss/android/ugc/aweme/story/feed/view/adapter/IStoryFeedViewHolder;", "getCurViewHolder", "()Lcom/ss/android/ugc/aweme/story/feed/view/adapter/IStoryFeedViewHolder;", "hostViewModel", "Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryFeedViewModel;", "getHostViewModel", "()Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryFeedViewModel;", "hostViewModel$delegate", "Lcom/bytedance/jedi/arch/lifecycleAwareLazy;", "isCurrUserStoryPlaying", "", "()Z", "isCurrentItem", "isFragmentAttached", "isInFirstOne", "isInLastOne", "isOneDayStory", "mAdapter", "Lcom/ss/android/ugc/aweme/story/feed/view/adapter/StoryFeedPagerAdapter;", "mAnimHelper", "Lcom/ss/android/ugc/aweme/story/feed/view/ui/TouchAnimationHelper;", "mDetailParams", "Lcom/ss/android/ugc/aweme/story/api/model/DetailParams;", "mProgressView", "Lcom/ss/android/ugc/aweme/story/feed/view/ui/StoryProgressViewReal;", "mRollViewPager", "Lcom/ss/android/ugc/aweme/story/base/view/viewpager/RollViewPager;", "mSimpleOnUIPlayListener", "com/ss/android/ugc/aweme/story/feed/jedi/StoryMainHolder2$mSimpleOnUIPlayListener$1", "Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryMainHolder2$mSimpleOnUIPlayListener$1;", "mStoryAuthorWidget", "Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryAuthorJediWidget;", "mTopContainer", "Landroid/view/View;", "mWidgetManager", "Lcom/ss/android/ugc/aweme/arch/widgets/base/WidgetManager;", "viewModel", "Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryMainHolderViewModel;", "getViewModel", "()Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryMainHolderViewModel;", "autoGoToNextStory", "curStoryId", "", "changeProgress", "", "i", "", "checkLoadMore", "curPos", "currentStory", "dismissInteractPopupWindow", "doLoadMore", "doPreLoadMore", "getViewHolderByPos", "pos", "goToFirstUnreadStory", "gotoUserStoryByStoryId", "storyId", "hasMore", "hasPreMore", "initProgressView", "view", "initView", "initWidget", "awemeWithComment", "Lcom/ss/android/ugc/aweme/story/api/model/AwemeWithComment;", "sourceId", "isInEnd", "userStory", "isSelf", "loadMore", "notifyAfterPublish", "onAwemeChange", "onBindItem", "item", "position", "onCreate", "onDestroy", "onInvisibleToUser", "onPageSelect", "pageChangeDown", "onPageUnSelect", "onVisibleToUser", "preLoadMore", "removeDuplicateStory", "publishedItems", "", "switchItem", "isNext", "switchParentItem", "currentParentPosition", "parentCount", "swtichChildItem", "currentPosition", "count", "tryResumePlay", "updateData", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StoryMainHolder2 extends BaseJediViewHolder<UserStory, StoryMainHolder2> implements RollViewPager.a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f72581b;

    /* renamed from: c  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f72582c = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(StoryMainHolder2.class), "hostViewModel", "getHostViewModel()Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryFeedViewModel;"))};

    /* renamed from: d  reason: collision with root package name */
    public final RollViewPager f72583d;

    /* renamed from: e  reason: collision with root package name */
    public final StoryProgressViewReal f72584e;

    /* renamed from: f  reason: collision with root package name */
    public final StoryFeedPagerAdapter f72585f;
    public final View g;
    public final com.ss.android.ugc.aweme.story.feed.view.ui.a h = new com.ss.android.ugc.aweme.story.feed.view.ui.a();
    public final StoryAuthorJediWidget i;
    final lifecycleAwareLazy j;
    public final StoryFeedJediFragment k;
    final ViewPager2 l;
    private final WidgetManager t;
    private final com.ss.android.ugc.aweme.story.api.model.f u;
    private final c v;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0012\b\u0000\u0010\u0002*\f\u0012\u0004\u0012\u0002H\u0002\u0012\u0002\b\u00030\u0003\"\u0010\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\b\b\u0002\u0010\u0005*\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"<anonymous>", "VM", "T", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolder;", "Lcom/bytedance/jedi/arch/JediViewModel;", "S", "Lcom/bytedance/jedi/arch/State;", "invoke", "()Lcom/bytedance/jedi/arch/JediViewModel;", "com/ss/android/ugc/aweme/story/feed/jedi/adapter/ExtensionsKt$hostViewModel$2"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function0<StoryFeedViewModel> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ StoryViewHolder $this_hostViewModel;
        final /* synthetic */ KClass $viewModelClass;
        final /* synthetic */ KClass $viewModelClass$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(StoryViewHolder storyViewHolder, KClass kClass, KClass kClass2) {
            super(0);
            this.$this_hostViewModel = storyViewHolder;
            this.$viewModelClass = kClass;
            this.$viewModelClass$inlined = kClass2;
        }

        /* JADX WARNING: type inference failed for: r0v5, types: [com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedViewModel, com.bytedance.jedi.arch.JediViewModel] */
        @NotNull
        public final StoryFeedViewModel invoke() {
            Object obj;
            ViewModelProvider viewModelProvider;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 83392, new Class[0], JediViewModel.class)) {
                return (JediViewModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 83392, new Class[0], JediViewModel.class);
            }
            StoryViewHolder storyViewHolder = this.$this_hostViewModel;
            if (PatchProxy.isSupport(new Object[0], storyViewHolder, StoryViewHolder.m, false, 83492, new Class[0], LifecycleOwner.class)) {
                obj = (LifecycleOwner) PatchProxy.accessDispatch(new Object[0], storyViewHolder, StoryViewHolder.m, false, 83492, new Class[0], LifecycleOwner.class);
            } else {
                obj = storyViewHolder.o;
                if (obj == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("parent");
                }
            }
            if (obj instanceof Widget) {
                obj = ((Widget) obj).j();
            }
            ViewModelProvider.Factory r1 = new ViewModelProvider.Factory() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f72586a;

                public final <T extends ViewModel> T create(@NotNull Class<T> cls) {
                    Class<T> cls2 = cls;
                    if (PatchProxy.isSupport(new Object[]{cls2}, this, f72586a, false, 83393, new Class[]{Class.class}, ViewModel.class)) {
                        return (ViewModel) PatchProxy.accessDispatch(new Object[]{cls2}, this, f72586a, false, 83393, new Class[]{Class.class}, ViewModel.class);
                    }
                    Intrinsics.checkParameterIsNotNull(cls2, "modelClass");
                    throw new IllegalStateException(StoryFeedViewModel.class.getSimpleName() + " should be created in the host before being used.");
                }
            };
            if (obj instanceof Fragment) {
                viewModelProvider = ViewModelProviders.of((Fragment) obj, r1);
            } else if (obj instanceof FragmentActivity) {
                viewModelProvider = ViewModelProviders.of((FragmentActivity) obj, r1);
            } else {
                throw new IllegalStateException();
            }
            String name = kotlin.jvm.a.a(this.$viewModelClass$inlined).getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "viewModelClass.java.name");
            return (JediViewModel) viewModelProvider.get(name, kotlin.jvm.a.a(this.$viewModelClass));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/story/api/model/UserStory;", "it", "Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryMainHolderState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<StoryMainHolderState, UserStory> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(1);
        }

        @NotNull
        public final UserStory invoke(@NotNull StoryMainHolderState storyMainHolderState) {
            StoryMainHolderState storyMainHolderState2 = storyMainHolderState;
            if (PatchProxy.isSupport(new Object[]{storyMainHolderState2}, this, changeQuickRedirect, false, 83394, new Class[]{StoryMainHolderState.class}, UserStory.class)) {
                return (UserStory) PatchProxy.accessDispatch(new Object[]{storyMainHolderState2}, this, changeQuickRedirect, false, 83394, new Class[]{StoryMainHolderState.class}, UserStory.class);
            }
            Intrinsics.checkParameterIsNotNull(storyMainHolderState2, AdvanceSetting.NETWORK_TYPE);
            UserStory userStory = storyMainHolderState.getUserStory();
            if (userStory == null) {
                Intrinsics.throwNpe();
            }
            return userStory;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\u0014"}, d2 = {"com/ss/android/ugc/aweme/story/feed/jedi/StoryMainHolder2$mSimpleOnUIPlayListener$1", "Lcom/ss/android/ugc/aweme/story/player/SimpleOnUIPlayListener;", "onBuffering", "", "start", "", "onPausePlay", "sourceId", "", "onPlayFailed", "error", "Lcom/ss/android/ugc/aweme/video/MediaError;", "onPlayProgressChange", "progress", "", "onPreparePlay", "onRenderReady", "playerEvent", "Lcom/ss/android/ugc/aweme/video/event/PlayerEvent;", "onResumePlay", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c extends com.ss.android.ugc.aweme.story.player.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72587a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryMainHolder2 f72588b;

        c(StoryMainHolder2 storyMainHolder2) {
            this.f72588b = storyMainHolder2;
        }

        public final void a(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f72587a, false, 83396, new Class[]{Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f72587a, false, 83396, new Class[]{Float.TYPE}, Void.TYPE);
                return;
            }
            if (this.f72588b.e()) {
                this.f72588b.f72584e.e(this.f72588b.d());
            }
        }

        public final void b(@NotNull String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f72587a, false, 83398, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f72587a, false, 83398, new Class[]{String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str, "sourceId");
            super.b(str);
            if (this.f72588b.a(str)) {
                this.f72588b.f72584e.c(this.f72588b.d());
            }
        }

        public final void c(@NotNull String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f72587a, false, 83400, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f72587a, false, 83400, new Class[]{String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str, "sourceId");
            super.c(str);
            if (this.f72588b.a(str)) {
                this.f72588b.f72584e.a(this.f72588b.d());
            }
        }

        public final void a(@NotNull com.ss.android.ugc.aweme.video.b.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f72587a, false, 83402, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f72587a, false, 83402, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(aVar, "playerEvent");
            super.a(aVar);
            StoryMainHolder2 storyMainHolder2 = this.f72588b;
            String str = aVar.f76010a;
            Intrinsics.checkExpressionValueIsNotNull(str, "playerEvent.id");
            if (storyMainHolder2.a(str)) {
                this.f72588b.f72584e.setMCanUpdate(true);
                this.f72588b.f72584e.a(aVar.f76012c, this.f72588b.d());
                return;
            }
            this.f72588b.f72584e.setMCanUpdate(false);
        }

        public final void b(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f72587a, false, 83401, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f72587a, false, 83401, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            super.b(z);
            if (this.f72588b.e()) {
                this.f72588b.f72584e.b(this.f72588b.d());
            }
        }

        public final void a(@NotNull com.ss.android.ugc.aweme.video.e eVar) {
            com.ss.android.ugc.aweme.video.e eVar2 = eVar;
            if (PatchProxy.isSupport(new Object[]{eVar2}, this, f72587a, false, 83397, new Class[]{com.ss.android.ugc.aweme.video.e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar2}, this, f72587a, false, 83397, new Class[]{com.ss.android.ugc.aweme.video.e.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(eVar2, "error");
            super.a(eVar);
            this.f72588b.f72584e.a();
        }

        public final void a(@NotNull String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f72587a, false, 83399, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f72587a, false, 83399, new Class[]{String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str, "sourceId");
            super.a(str);
            if (this.f72588b.a(str)) {
                this.f72588b.f72584e.d(this.f72588b.d());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "onChanged", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 15})
    static final class d<T> implements Observer<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72589a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryMainHolder2 f72590b;

        d(StoryMainHolder2 storyMainHolder2) {
            this.f72590b = storyMainHolder2;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (PatchProxy.isSupport(new Object[]{num}, this, f72589a, false, 83403, new Class[]{Integer.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{num}, this, f72589a, false, 83403, new Class[]{Integer.class}, Void.TYPE);
                return;
            }
            if (this.f72590b.g()) {
                this.f72590b.f72583d.post(new Runnable(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f72591a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ d f72592b;

                    {
                        this.f72592b = r1;
                    }

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f72591a, false, 83404, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f72591a, false, 83404, new Class[0], Void.TYPE);
                            return;
                        }
                        this.f72592b.f72590b.a(true);
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72593a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryMainHolder2 f72594b;

        e(StoryMainHolder2 storyMainHolder2) {
            this.f72594b = storyMainHolder2;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f72593a, false, 83405, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f72593a, false, 83405, new Class[0], Void.TYPE);
                return;
            }
            FragmentActivity activity = this.f72594b.k.getActivity();
            if (activity != null) {
                activity.supportStartPostponedEnterTransition();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryMainHolder2;", "it", "Lcom/ss/android/ugc/aweme/story/api/model/UserStory;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function2<StoryMainHolder2, UserStory, Unit> {
        public static final f INSTANCE = new f();
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
            super(2);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((StoryMainHolder2) obj, (UserStory) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull StoryMainHolder2 storyMainHolder2, @Nullable UserStory userStory) {
            boolean z;
            String str;
            StoryMainHolder2 storyMainHolder22 = storyMainHolder2;
            if (PatchProxy.isSupport(new Object[]{storyMainHolder22, userStory}, this, changeQuickRedirect, false, 83408, new Class[]{StoryMainHolder2.class, UserStory.class}, Void.TYPE)) {
                Object[] objArr = {storyMainHolder22, userStory};
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, 83408, new Class[]{StoryMainHolder2.class, UserStory.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(storyMainHolder22, "$receiver");
            if (PatchProxy.isSupport(new Object[0], storyMainHolder2, StoryMainHolder2.f72581b, false, 83348, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], storyMainHolder2, StoryMainHolder2.f72581b, false, 83348, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                FragmentActivity activity = storyMainHolder22.k.getActivity();
                if (activity == null || activity.isFinishing()) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z && userStory != null) {
                List<com.ss.android.ugc.aweme.story.api.model.b> awemeList = userStory.getAwemeList();
                if (awemeList != null) {
                    StringBuilder sb = new StringBuilder("selectSubscribe() called with: list = [");
                    com.ss.android.ugc.aweme.story.api.model.b bVar = awemeList.get(awemeList.size() - 1);
                    if (bVar != null) {
                        LifeStory lifeStory = bVar.getLifeStory();
                        if (lifeStory != null) {
                            User author = lifeStory.getAuthor();
                            if (author != null) {
                                str = author.getNickname();
                                sb.append(str);
                                sb.append(']');
                                storyMainHolder22.f72585f.a(awemeList);
                            }
                        }
                    }
                    str = null;
                    sb.append(str);
                    sb.append(']');
                    storyMainHolder22.f72585f.a(awemeList);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryMainHolder2;", "it", "Lcom/ss/android/ugc/aweme/story/feed/model/LifeOneUserModel;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function2<StoryMainHolder2, com.ss.android.ugc.aweme.story.feed.model.b, Unit> {
        public static final g INSTANCE = new g();
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
            super(2);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((StoryMainHolder2) obj, (com.ss.android.ugc.aweme.story.feed.model.b) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull StoryMainHolder2 storyMainHolder2, @NotNull com.ss.android.ugc.aweme.story.feed.model.b bVar) {
            StoryMainHolder2 storyMainHolder22 = storyMainHolder2;
            com.ss.android.ugc.aweme.story.feed.model.b bVar2 = bVar;
            if (PatchProxy.isSupport(new Object[]{storyMainHolder22, bVar2}, this, changeQuickRedirect, false, 83411, new Class[]{StoryMainHolder2.class, com.ss.android.ugc.aweme.story.feed.model.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{storyMainHolder22, bVar2}, this, changeQuickRedirect, false, 83411, new Class[]{StoryMainHolder2.class, com.ss.android.ugc.aweme.story.feed.model.b.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(storyMainHolder22, "$receiver");
            Intrinsics.checkParameterIsNotNull(bVar2, AdvanceSetting.NETWORK_TYPE);
            storyMainHolder2.o();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryMainHolder2;", "it", "Lcom/ss/android/ugc/aweme/story/feed/model/LifeOneUserModel;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function2<StoryMainHolder2, com.ss.android.ugc.aweme.story.feed.model.b, Unit> {
        public static final h INSTANCE = new h();
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
            super(2);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((StoryMainHolder2) obj, (com.ss.android.ugc.aweme.story.feed.model.b) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull StoryMainHolder2 storyMainHolder2, @NotNull com.ss.android.ugc.aweme.story.feed.model.b bVar) {
            StoryMainHolder2 storyMainHolder22 = storyMainHolder2;
            com.ss.android.ugc.aweme.story.feed.model.b bVar2 = bVar;
            if (PatchProxy.isSupport(new Object[]{storyMainHolder22, bVar2}, this, changeQuickRedirect, false, 83414, new Class[]{StoryMainHolder2.class, com.ss.android.ugc.aweme.story.feed.model.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{storyMainHolder22, bVar2}, this, changeQuickRedirect, false, 83414, new Class[]{StoryMainHolder2.class, com.ss.android.ugc.aweme.story.feed.model.b.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(storyMainHolder22, "$receiver");
            Intrinsics.checkParameterIsNotNull(bVar2, AdvanceSetting.NETWORK_TYPE);
            storyMainHolder2.o();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "viewPagerMotionEvent", "Lcom/ss/android/ugc/aweme/story/feed/event/ViewPagerMotionEvent;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class i<T> implements Observer<com.ss.android.ugc.aweme.story.feed.a.c> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72595a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryMainHolder2 f72596b;

        i(StoryMainHolder2 storyMainHolder2) {
            this.f72596b = storyMainHolder2;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Object value;
            String str;
            String str2;
            com.ss.android.ugc.aweme.story.feed.a.c cVar = (com.ss.android.ugc.aweme.story.feed.a.c) obj;
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f72595a, false, 83415, new Class[]{com.ss.android.ugc.aweme.story.feed.a.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar}, this, f72595a, false, 83415, new Class[]{com.ss.android.ugc.aweme.story.feed.a.c.class}, Void.TYPE);
                return;
            }
            if (this.f72596b.g() && cVar != null) {
                int i = cVar.f72457c;
                if (i != 6) {
                    switch (i) {
                        case 1:
                            com.ss.android.ugc.aweme.story.feed.view.adapter.a i2 = this.f72596b.i();
                            if (i2 != null) {
                                i2.n();
                                new m().a("homepage_story").b("long_press").a(i2.j()).post();
                                break;
                            } else {
                                return;
                            }
                        case 2:
                            break;
                        case 3:
                            StoryMainHolder2 storyMainHolder2 = this.f72596b;
                            boolean z = cVar.f72458d;
                            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, storyMainHolder2, StoryMainHolder2.f72581b, false, 83369, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                                StoryMainHolder2 storyMainHolder22 = storyMainHolder2;
                                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, storyMainHolder22, StoryMainHolder2.f72581b, false, 83369, new Class[]{Boolean.TYPE}, Void.TYPE);
                                break;
                            } else {
                                if (System.currentTimeMillis() - com.ss.android.ugc.aweme.story.feed.a.c.f72455a >= 100) {
                                    com.ss.android.ugc.aweme.story.feed.a.c.f72455a = System.currentTimeMillis();
                                    RecyclerView.Adapter adapter = storyMainHolder2.l.getAdapter();
                                    if (adapter != null) {
                                        int itemCount = adapter.getItemCount();
                                        int count = storyMainHolder2.f72585f.getCount();
                                        int currentItem = storyMainHolder2.l.getCurrentItem();
                                        int currentItem2 = storyMainHolder2.f72583d.getCurrentItem();
                                        if (PatchProxy.isSupport(new Object[0], storyMainHolder2, StoryMainHolder2.f72581b, false, 83357, new Class[0], StoryFeedViewModel.class)) {
                                            value = PatchProxy.accessDispatch(new Object[0], storyMainHolder2, StoryMainHolder2.f72581b, false, 83357, new Class[0], StoryFeedViewModel.class);
                                        } else {
                                            value = storyMainHolder2.j.getValue();
                                        }
                                        StoryFeedViewModel storyFeedViewModel = (StoryFeedViewModel) value;
                                        if (z) {
                                            str = "click_next";
                                        } else {
                                            str = "click_previous";
                                        }
                                        storyFeedViewModel.a(str);
                                        com.ss.android.ugc.aweme.arch.widgets.base.b a2 = ChangeUserModeViewModel.a(storyMainHolder2.k.requireActivity());
                                        Intrinsics.checkExpressionValueIsNotNull(a2, "ChangeUserModeViewModel.…agment.requireActivity())");
                                        if (z) {
                                            str2 = "click_next";
                                        } else {
                                            str2 = "click_previous";
                                        }
                                        a2.setValue(str2);
                                        if (currentItem2 == 0) {
                                            if (z) {
                                                if (currentItem2 != count - 1) {
                                                    storyMainHolder2.b(z, currentItem2, count);
                                                    break;
                                                } else {
                                                    storyMainHolder2.a(z, currentItem, itemCount);
                                                    break;
                                                }
                                            } else {
                                                storyMainHolder2.a(z, currentItem, itemCount);
                                                break;
                                            }
                                        } else if (currentItem2 == count - 1) {
                                            if (!z) {
                                                storyMainHolder2.b(z, currentItem2, count);
                                                break;
                                            } else {
                                                storyMainHolder2.a(z, currentItem, itemCount);
                                                break;
                                            }
                                        } else {
                                            storyMainHolder2.b(z, currentItem2, count);
                                        }
                                    }
                                }
                                return;
                            }
                        case 4:
                            if (this.f72596b.e()) {
                                this.f72596b.h.a(this.f72596b.g, false, 200);
                                break;
                            }
                            break;
                    }
                }
                this.f72596b.h.a(this.f72596b.g, true, 200);
                com.ss.android.ugc.aweme.story.feed.view.adapter.a i3 = this.f72596b.i();
                if (i3 != null) {
                    i3.o();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72599a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StoryMainHolder2 f72600b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ LifeFeedModel f72601c;

        j(StoryMainHolder2 storyMainHolder2, LifeFeedModel lifeFeedModel) {
            this.f72600b = storyMainHolder2;
            this.f72601c = lifeFeedModel;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f72599a, false, 83416, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f72599a, false, 83416, new Class[0], Void.TYPE);
                return;
            }
            this.f72601c.a(this.f72600b.p());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryMainHolderState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class k extends Lambda implements Function1<StoryMainHolderState, StoryMainHolderState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ StoryMainHolder2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(StoryMainHolder2 storyMainHolder2) {
            super(1);
            this.this$0 = storyMainHolder2;
        }

        @NotNull
        public final StoryMainHolderState invoke(@NotNull StoryMainHolderState storyMainHolderState) {
            StoryMainHolderState storyMainHolderState2 = storyMainHolderState;
            if (PatchProxy.isSupport(new Object[]{storyMainHolderState2}, this, changeQuickRedirect, false, 83417, new Class[]{StoryMainHolderState.class}, StoryMainHolderState.class)) {
                return (StoryMainHolderState) PatchProxy.accessDispatch(new Object[]{storyMainHolderState2}, this, changeQuickRedirect, false, 83417, new Class[]{StoryMainHolderState.class}, StoryMainHolderState.class);
            }
            Intrinsics.checkParameterIsNotNull(storyMainHolderState2, "$receiver");
            if (this.this$0.h()) {
                return StoryMainHolderState.copy$default(storyMainHolderState, 1, (UserStory) this.this$0.s(), null, null, null, 28, null);
            }
            return StoryMainHolderState.copy$default(storyMainHolderState, 0, (UserStory) this.this$0.s(), null, null, null, 29, null);
        }
    }

    public final boolean h() {
        com.ss.android.ugc.aweme.story.api.model.f fVar = this.u;
        if (fVar.detailType == 2 || fVar.detailType == 6) {
            return true;
        }
        return false;
    }

    private void x() {
        if (PatchProxy.isSupport(new Object[0], this, f72581b, false, 83379, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72581b, false, 83379, new Class[0], Void.TYPE);
            return;
        }
        k().e();
    }

    private boolean y() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f72581b, false, 83380, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f72581b, false, 83380, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (p().getCurPos() > 0) {
            z = true;
        }
        return z;
    }

    @Nullable
    public final com.ss.android.ugc.aweme.story.feed.view.adapter.a i() {
        if (!PatchProxy.isSupport(new Object[0], this, f72581b, false, 83354, new Class[0], com.ss.android.ugc.aweme.story.feed.view.adapter.a.class)) {
            return b(this.f72583d.getCurrentItem());
        }
        return (com.ss.android.ugc.aweme.story.feed.view.adapter.a) PatchProxy.accessDispatch(new Object[0], this, f72581b, false, 83354, new Class[0], com.ss.android.ugc.aweme.story.feed.view.adapter.a.class);
    }

    @Nullable
    public final com.ss.android.ugc.aweme.story.detail.d j() {
        if (PatchProxy.isSupport(new Object[0], this, f72581b, false, 83355, new Class[0], com.ss.android.ugc.aweme.story.detail.d.class)) {
            return (com.ss.android.ugc.aweme.story.detail.d) PatchProxy.accessDispatch(new Object[0], this, f72581b, false, 83355, new Class[0], com.ss.android.ugc.aweme.story.detail.d.class);
        }
        com.ss.android.ugc.aweme.story.feed.view.adapter.a i2 = i();
        if (i2 != null) {
            return new com.ss.android.ugc.aweme.story.detail.d(i2.p(), this.i.g());
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, f72581b, false, 83363, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72581b, false, 83363, new Class[0], Void.TYPE);
            return;
        }
        if (w()) {
            k().e();
        }
    }

    /* access modifiers changed from: package-private */
    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, f72581b, false, 83364, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72581b, false, 83364, new Class[0], Void.TYPE);
            return;
        }
        if (y()) {
            k().f();
        }
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, f72581b, false, 83383, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72581b, false, 83383, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.b.a.a.a.a(new j(this, LifeFeedModel.a(this.k.requireActivity())));
    }

    @NotNull
    public final UserStory p() {
        if (!PatchProxy.isSupport(new Object[0], this, f72581b, false, 83384, new Class[0], UserStory.class)) {
            return (UserStory) a(k(), (Function1<? super S1, ? extends R>) b.INSTANCE);
        }
        return (UserStory) PatchProxy.accessDispatch(new Object[0], this, f72581b, false, 83384, new Class[0], UserStory.class);
    }

    public final void q() {
        if (PatchProxy.isSupport(new Object[0], this, f72581b, false, 83386, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72581b, false, 83386, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.story.feed.view.adapter.a i2 = i();
        if (i2 != null) {
            i2.k();
        }
    }

    public final void r() {
        if (PatchProxy.isSupport(new Object[0], this, f72581b, false, 83387, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72581b, false, 83387, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.story.feed.view.adapter.a i2 = i();
        if (i2 != null) {
            i2.l();
        }
    }

    private boolean w() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f72581b, false, 83376, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f72581b, false, 83376, new Class[0], Boolean.TYPE)).booleanValue();
        }
        UserStory p = p();
        if (p.getLastPos() < p.getTotalCount() - 1) {
            z = true;
        }
        return z;
    }

    public final long d() {
        if (PatchProxy.isSupport(new Object[0], this, f72581b, false, 83349, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f72581b, false, 83349, new Class[0], Long.TYPE)).longValue();
        } else if (this.k.getActivity() == null) {
            return 0;
        } else {
            com.ss.android.ugc.aweme.story.api.model.b b2 = StoryChange.b(this.k.getActivity());
            if (b2 == null) {
                return 0;
            }
            if (b2.getAwemeType() == 15) {
                com.ss.android.ugc.aweme.story.player.c d2 = com.ss.android.ugc.aweme.story.player.c.d();
                Intrinsics.checkExpressionValueIsNotNull(d2, "StoryPlayerManager.getInstance()");
                return d2.f73264d;
            }
            com.ss.android.ugc.aweme.story.player.c d3 = com.ss.android.ugc.aweme.story.player.c.d();
            Intrinsics.checkExpressionValueIsNotNull(d3, "StoryPlayerManager.getInstance()");
            Long b3 = d3.b();
            if (b3 == null) {
                Intrinsics.throwNpe();
            }
            return b3.longValue();
        }
    }

    public final void onDestroy() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f72581b, false, 83372, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72581b, false, 83372, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.f72585f.a();
        com.ss.android.ugc.aweme.story.player.c.d().b((com.ss.android.ugc.aweme.video.a.a) this.v);
        int childCount = this.f72583d.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f72583d.getChildAt(i2);
            if (childAt != null) {
                obj = childAt.getTag();
            } else {
                obj = null;
            }
            if (!(obj instanceof com.ss.android.ugc.aweme.story.feed.view.adapter.a)) {
                obj = null;
            }
            com.ss.android.ugc.aweme.story.feed.view.adapter.a aVar = (com.ss.android.ugc.aweme.story.feed.view.adapter.a) obj;
            if (aVar != null) {
                aVar.h();
            }
        }
    }

    public final boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f72581b, false, 83350, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f72581b, false, 83350, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.k.getActivity() == null) {
            return false;
        } else {
            com.ss.android.ugc.aweme.story.api.model.b b2 = StoryChange.b(this.k.getActivity());
            if (PatchProxy.isSupport(new Object[]{b2}, this, f72581b, false, 83367, new Class[]{com.ss.android.ugc.aweme.story.api.model.b.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{b2}, this, f72581b, false, 83367, new Class[]{com.ss.android.ugc.aweme.story.api.model.b.class}, Boolean.TYPE)).booleanValue();
            } else if (b2 == null || CollectionUtils.isEmpty(this.f72585f.f4152f) || !this.f72585f.f4152f.contains(b2)) {
                return false;
            } else {
                return true;
            }
        }
    }

    public final boolean g() {
        String str;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f72581b, false, 83351, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f72581b, false, 83351, new Class[0], Boolean.TYPE)).booleanValue();
        }
        RecyclerView.Adapter adapter = this.l.getAdapter();
        if (adapter != null) {
            UserStory userStory = (UserStory) ((StoryMainRawPagerAdapter2) adapter).b(this.l.getCurrentItem());
            UserStory p = p();
            if (!(userStory == null || userStory.getUser() == null || p.getUser() == null)) {
                User user = userStory.getUser();
                Intrinsics.checkExpressionValueIsNotNull(user, "userStory.user");
                CharSequence uid = user.getUid();
                User user2 = p.getUser();
                if (user2 != null) {
                    str = user2.getUid();
                } else {
                    str = null;
                }
                if (TextUtils.equals(uid, str)) {
                    z = true;
                }
            }
            return z;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.story.feed.jedi.StoryMainRawPagerAdapter2");
    }

    /* access modifiers changed from: package-private */
    public final StoryMainHolderViewModel k() {
        if (PatchProxy.isSupport(new Object[0], this, f72581b, false, 83356, new Class[0], StoryMainHolderViewModel.class)) {
            return (StoryMainHolderViewModel) PatchProxy.accessDispatch(new Object[0], this, f72581b, false, 83356, new Class[0], StoryMainHolderViewModel.class);
        }
        Function1 kVar = new k(this);
        Class<StoryMainHolderViewModel> cls = StoryMainHolderViewModel.class;
        com.ss.android.ugc.aweme.story.feed.jedi.adapter.a t2 = t();
        if (t2 != null) {
            com.ss.android.ugc.aweme.story.feed.jedi.adapter.j a2 = com.ss.android.ugc.aweme.story.feed.jedi.adapter.j.f72648b.a(r_(), t2.a());
            JediViewModel jediViewModel = (JediViewModel) a2.a(getClass().getName() + '_' + cls.getName(), cls);
            n a3 = jediViewModel.f2282c.a(StoryMainHolderViewModel.class);
            if (a3 != null) {
                a3.binding(jediViewModel);
            }
            jediViewModel.a(kVar);
            return (StoryMainHolderViewModel) jediViewModel;
        }
        throw new IllegalStateException("widget not bound to viewHolder yet");
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f72581b, false, 83359, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72581b, false, 83359, new Class[0], Void.TYPE);
            return;
        }
        super.l();
        Disposable unused = a(k(), m.INSTANCE, c(), false, f.INSTANCE);
        e.a.a(this, k(), n.INSTANCE, false, false, null, null, g.INSTANCE, 30, null);
        e.a.a(this, k(), o.INSTANCE, false, false, null, null, h.INSTANCE, 30, null);
        FragmentActivity activity = this.k.getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        ViewModel viewModel = ViewModelProviders.of(activity).get(ViewPagerMotionEventViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(mF…entViewModel::class.java)");
        ((ViewPagerMotionEventViewModel) viewModel).a().observe(this.k, new i(this));
    }

    public final void a(int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f72581b, false, 83365, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f72581b, false, 83365, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f72585f.g) {
            i3 = i2 - 1;
        } else {
            i3 = i2;
        }
        this.f72584e.setMCanUpdate(true);
        UserStory p = p();
        StoryProgressViewReal storyProgressViewReal = this.f72584e;
        int totalCount = (int) p.getTotalCount();
        com.ss.android.ugc.aweme.story.player.c d2 = com.ss.android.ugc.aweme.story.player.c.d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "StoryPlayerManager.getInstance()");
        storyProgressViewReal.a(totalCount, i3, d2.c());
        this.f72584e.setMCanUpdate(false);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f72581b, false, 83374, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f72581b, false, 83374, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        int currentItem = this.f72583d.getCurrentItem();
        a(currentItem);
        com.ss.android.ugc.aweme.story.feed.view.adapter.a b2 = b(currentItem);
        if (b2 != null) {
            b2.d();
        }
        if (g() && this.u.detailType != 1 && w()) {
            x();
        }
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.story.feed.view.adapter.a b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f72581b, false, 83375, new Class[]{Integer.TYPE}, com.ss.android.ugc.aweme.story.feed.view.adapter.a.class)) {
            return (com.ss.android.ugc.aweme.story.feed.view.adapter.a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f72581b, false, 83375, new Class[]{Integer.TYPE}, com.ss.android.ugc.aweme.story.feed.view.adapter.a.class);
        }
        int childCount = this.f72583d.getChildCount();
        if (i2 < 0 || i2 >= this.f72585f.getCount()) {
            return null;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.f72583d.getChildAt(i3);
            Intrinsics.checkExpressionValueIsNotNull(childAt, "mRollViewPager.getChildAt(i)");
            Object tag = childAt.getTag();
            if (!(tag instanceof com.ss.android.ugc.aweme.story.feed.view.adapter.a)) {
                tag = null;
            }
            com.ss.android.ugc.aweme.story.feed.view.adapter.a aVar = (com.ss.android.ugc.aweme.story.feed.view.adapter.a) tag;
            if (aVar != null && com.ss.android.ugc.aweme.story.feed.c.g.f72503b.a(aVar.j(), this.f72585f.b(i2))) {
                return aVar;
            }
        }
        return null;
    }

    public final boolean a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f72581b, false, 83366, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f72581b, false, 83366, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (this.k.getActivity() == null) {
            return false;
        } else {
            com.ss.android.ugc.aweme.story.api.model.b b2 = StoryChange.b(this.k.getActivity());
            if (b2 != null) {
                return TextUtils.equals(b2.getStoryId(), str);
            }
            return false;
        }
    }

    public final /* synthetic */ void a(Object obj, int i2) {
        LiveData liveData;
        int i3;
        UrlModel urlModel;
        UserStory userStory = (UserStory) obj;
        if (PatchProxy.isSupport(new Object[]{userStory, Integer.valueOf(i2)}, this, f72581b, false, 83360, new Class[]{UserStory.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{userStory, Integer.valueOf(i2)}, this, f72581b, false, 83360, new Class[]{UserStory.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(userStory, "item");
        ViewPager2ViewModel.a aVar = ViewPager2ViewModel.f72608b;
        Context context = this.k.getContext();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(context, "mFragment.context!!");
        if (PatchProxy.isSupport(new Object[]{context}, aVar, ViewPager2ViewModel.a.f72610a, false, 83441, new Class[]{Context.class}, LiveData.class)) {
            ViewPager2ViewModel.a aVar2 = aVar;
            liveData = (LiveData) PatchProxy.accessDispatch(new Object[]{context}, aVar2, ViewPager2ViewModel.a.f72610a, false, 83441, new Class[]{Context.class}, LiveData.class);
        } else {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Activity a2 = com.ss.android.ugc.aweme.story.base.utils.i.a(context);
            if (a2 != null) {
                liveData = ((ViewPager2ViewModel) ViewModelProviders.of((FragmentActivity) a2).get(ViewPager2ViewModel.class)).f72609a;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
        }
        liveData.observe(this, new d(this));
        this.f72585f.a(userStory.getAwemeList());
        if (userStory.getReadFlag() == 1) {
            i3 = 0;
        } else {
            g.a aVar3 = com.ss.android.ugc.aweme.story.feed.c.g.f72503b;
            List<com.ss.android.ugc.aweme.story.api.model.b> list = this.f72585f.f4152f;
            Intrinsics.checkExpressionValueIsNotNull(list, "mAdapter.items");
            i3 = aVar3.a(list);
        }
        this.f72583d.setCurrentItem(i3);
        StoryAuthorJediWidget storyAuthorJediWidget = this.i;
        if (PatchProxy.isSupport(new Object[]{userStory}, storyAuthorJediWidget, StoryAuthorJediWidget.f72526a, false, 83255, new Class[]{UserStory.class}, Void.TYPE)) {
            StoryAuthorJediWidget storyAuthorJediWidget2 = storyAuthorJediWidget;
            PatchProxy.accessDispatch(new Object[]{userStory}, storyAuthorJediWidget2, StoryAuthorJediWidget.f72526a, false, 83255, new Class[]{UserStory.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(userStory, "userStory");
            if (userStory.getUser() != null) {
                storyAuthorJediWidget.p = userStory;
                storyAuthorJediWidget.q = userStory.getUser();
                if (PatchProxy.isSupport(new Object[0], storyAuthorJediWidget, StoryAuthorJediWidget.f72526a, false, 83257, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], storyAuthorJediWidget, StoryAuthorJediWidget.f72526a, false, 83257, new Class[0], Void.TYPE);
                } else {
                    AvatarImageView avatarImageView = storyAuthorJediWidget.f72527b;
                    if (avatarImageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAvatarView");
                    }
                    RemoteImageView remoteImageView = avatarImageView;
                    User user = storyAuthorJediWidget.q;
                    if (user != null) {
                        urlModel = user.getAvatarMedium();
                    } else {
                        urlModel = null;
                    }
                    com.ss.android.ugc.aweme.base.c.b(remoteImageView, urlModel);
                    AvatarImageView avatarImageView2 = storyAuthorJediWidget.f72527b;
                    if (avatarImageView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAvatarView");
                    }
                    avatarImageView2.setOnClickListener(new StoryAuthorJediWidget.b(storyAuthorJediWidget));
                    DmtTextView dmtTextView = storyAuthorJediWidget.k;
                    if (dmtTextView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAuthorName");
                    }
                    dmtTextView.setText(com.ss.android.ugc.aweme.story.feed.c.g.f72503b.d(storyAuthorJediWidget.q));
                    DmtTextView dmtTextView2 = storyAuthorJediWidget.k;
                    if (dmtTextView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAuthorName");
                    }
                    dmtTextView2.setOnClickListener(new StoryAuthorJediWidget.c(storyAuthorJediWidget));
                    ImageView imageView = storyAuthorJediWidget.n;
                    if (imageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mIvClose");
                    }
                    imageView.setOnClickListener(new StoryAuthorJediWidget.d(storyAuthorJediWidget));
                }
                if (PatchProxy.isSupport(new Object[0], storyAuthorJediWidget, StoryAuthorJediWidget.f72526a, false, 83259, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], storyAuthorJediWidget, StoryAuthorJediWidget.f72526a, false, 83259, new Class[0], Void.TYPE);
                } else if (!storyAuthorJediWidget.e() || storyAuthorJediWidget.f()) {
                    DmtTextView dmtTextView3 = storyAuthorJediWidget.l;
                    if (dmtTextView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mFollowStatus");
                    }
                    dmtTextView3.setVisibility(8);
                } else {
                    DmtTextView dmtTextView4 = storyAuthorJediWidget.l;
                    if (dmtTextView4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mFollowStatus");
                    }
                    dmtTextView4.setVisibility(0);
                    User user2 = storyAuthorJediWidget.q;
                    if (user2 != null) {
                        storyAuthorJediWidget.a(user2.getFollowStatus());
                        DmtTextView dmtTextView5 = storyAuthorJediWidget.l;
                        if (dmtTextView5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mFollowStatus");
                        }
                        dmtTextView5.setOnClickListener(new StoryAuthorJediWidget.e(storyAuthorJediWidget, user2));
                    }
                }
                Activity c2 = storyAuthorJediWidget.c();
                if (c2 != null) {
                    storyAuthorJediWidget.o = StoryChange.b((FragmentActivity) c2);
                    storyAuthorJediWidget.h();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
            }
        }
        this.f72583d.post(new e(this));
    }

    /* access modifiers changed from: package-private */
    public final void b(boolean z, int i2, int i3) {
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f72581b, false, 83371, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f72581b, false, 83371, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (!z || i4 >= i3 - 1) {
            if (!z && i4 > 0) {
                this.f72583d.setCurrentItem(i4 - 1, false);
            }
        } else {
            this.f72583d.setCurrentItem(i4 + 1, false);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public StoryMainHolder2(@org.jetbrains.annotations.NotNull android.view.ViewGroup r10, @org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment r11, @org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.story.viewpager2.widget.ViewPager2 r12) {
        /*
            r9 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            java.lang.String r0 = "mFragment"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r11, r0)
            java.lang.String r0 = "mParentViewPager"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r12, r0)
            android.content.Context r0 = r10.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 0
            r2 = 2131690690(0x7f0f04c2, float:1.901043E38)
            android.view.View r10 = r0.inflate(r2, r10, r1)
            java.lang.String r0 = "LayoutInflater.from(pare…tory_feed, parent, false)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r10, r0)
            r9.<init>(r10)
            r9.k = r11
            r9.l = r12
            android.view.View r10 = r9.itemView
            r11 = 2131171459(0x7f071883, float:1.7957305E38)
            android.view.View r10 = r10.findViewById(r11)
            java.lang.String r11 = "itemView.findViewById(R.id.viewpager)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r10, r11)
            com.ss.android.ugc.aweme.story.base.view.viewpager.RollViewPager r10 = (com.ss.android.ugc.aweme.story.base.view.viewpager.RollViewPager) r10
            r9.f72583d = r10
            android.view.View r10 = r9.itemView
            r11 = 2131169211(0x7f070fbb, float:1.7952746E38)
            android.view.View r10 = r10.findViewById(r11)
            java.lang.String r11 = "itemView.findViewById(R.id.progress_view)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r10, r11)
            com.ss.android.ugc.aweme.story.feed.view.ui.StoryProgressViewReal r10 = (com.ss.android.ugc.aweme.story.feed.view.ui.StoryProgressViewReal) r10
            r9.f72584e = r10
            com.ss.android.ugc.aweme.story.feed.view.adapter.StoryFeedPagerAdapter r10 = new com.ss.android.ugc.aweme.story.feed.view.adapter.StoryFeedPagerAdapter
            android.view.View r11 = r9.itemView
            java.lang.String r12 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r11, r12)
            android.content.Context r11 = r11.getContext()
            android.view.View r12 = r9.itemView
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r12, r0)
            android.content.Context r12 = r12.getContext()
            android.view.LayoutInflater r12 = android.view.LayoutInflater.from(r12)
            com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment r0 = r9.k
            android.support.v4.app.Fragment r0 = (android.support.v4.app.Fragment) r0
            com.ss.android.ugc.aweme.story.base.view.viewpager.RollViewPager r2 = r9.f72583d
            r10.<init>(r11, r12, r0, r2)
            r9.f72585f = r10
            android.view.View r10 = r9.itemView
            r11 = 2131170476(0x7f0714ac, float:1.7955311E38)
            android.view.View r10 = r10.findViewById(r11)
            java.lang.String r11 = "itemView.findViewById(R.id.top_container)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r10, r11)
            r9.g = r10
            com.ss.android.ugc.aweme.story.feed.view.ui.a r10 = new com.ss.android.ugc.aweme.story.feed.view.ui.a
            r10.<init>()
            r9.h = r10
            com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment r10 = r9.k
            android.support.v4.app.Fragment r10 = (android.support.v4.app.Fragment) r10
            android.view.View r11 = r9.itemView
            com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager r10 = com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager.a((android.support.v4.app.Fragment) r10, (android.view.View) r11)
            java.lang.String r11 = "WidgetManager.of(mFragment, itemView)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r10, r11)
            r9.t = r10
            com.ss.android.ugc.aweme.story.feed.jedi.StoryAuthorJediWidget r10 = new com.ss.android.ugc.aweme.story.feed.jedi.StoryAuthorJediWidget
            com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment r11 = r9.k
            android.support.v4.app.Fragment r11 = (android.support.v4.app.Fragment) r11
            r10.<init>(r11)
            r9.i = r10
            com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment r10 = r9.k
            android.support.v4.app.FragmentActivity r10 = r10.getActivity()
            com.ss.android.ugc.aweme.story.api.model.f r10 = com.ss.android.ugc.aweme.story.feed.c.e.a(r10)
            java.lang.String r11 = "StoryParamsHelper.getDet…arams(mFragment.activity)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r10, r11)
            r9.u = r10
            com.ss.android.ugc.aweme.story.feed.jedi.StoryMainHolder2$c r10 = new com.ss.android.ugc.aweme.story.feed.jedi.StoryMainHolder2$c
            r10.<init>(r9)
            r9.v = r10
            java.lang.Class<com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedViewModel> r10 = com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedViewModel.class
            kotlin.reflect.KClass r10 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r10)
            com.bytedance.jedi.arch.lifecycleAwareLazy r11 = new com.bytedance.jedi.arch.lifecycleAwareLazy
            r12 = r9
            android.arch.lifecycle.LifecycleOwner r12 = (android.arch.lifecycle.LifecycleOwner) r12
            com.ss.android.ugc.aweme.story.feed.jedi.StoryMainHolder2$a r0 = new com.ss.android.ugc.aweme.story.feed.jedi.StoryMainHolder2$a
            r0.<init>(r9, r10, r10)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r11.<init>(r12, r0)
            r9.j = r11
            android.view.View r10 = r9.itemView
            java.lang.String r11 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r10, r11)
            r11 = 1
            java.lang.Object[] r2 = new java.lang.Object[r11]
            r2[r1] = r10
            com.meituan.robust.ChangeQuickRedirect r4 = f72581b
            java.lang.Class[] r7 = new java.lang.Class[r11]
            java.lang.Class<android.view.View> r12 = android.view.View.class
            r7[r1] = r12
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 83358(0x1459e, float:1.1681E-40)
            r3 = r9
            boolean r12 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r12 == 0) goto L_0x0110
            java.lang.Object[] r2 = new java.lang.Object[r11]
            r2[r1] = r10
            com.meituan.robust.ChangeQuickRedirect r4 = f72581b
            r5 = 0
            r6 = 83358(0x1459e, float:1.1681E-40)
            java.lang.Class[] r7 = new java.lang.Class[r11]
            java.lang.Class<android.view.View> r10 = android.view.View.class
            r7[r1] = r10
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x015e
        L_0x0110:
            android.view.View r10 = r9.g
            android.content.Context r10 = r10.getContext()
            android.view.View r11 = r9.itemView
            boolean r10 = com.ss.android.ugc.aweme.story.base.utils.c.a(r10, r11)
            if (r10 == 0) goto L_0x0147
            android.view.View r10 = r9.g
            android.content.Context r10 = r10.getContext()
            int r10 = com.bytedance.common.utility.UIUtils.getStatusBarHeight(r10)
            android.view.View r11 = r9.g
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            if (r11 == 0) goto L_0x013f
            android.widget.RelativeLayout$LayoutParams r11 = (android.widget.RelativeLayout.LayoutParams) r11
            int r12 = r11.topMargin
            int r12 = r12 + r10
            r11.topMargin = r12
            android.view.View r10 = r9.g
            android.view.ViewGroup$LayoutParams r11 = (android.view.ViewGroup.LayoutParams) r11
            r10.setLayoutParams(r11)
            goto L_0x0147
        L_0x013f:
            kotlin.TypeCastException r10 = new kotlin.TypeCastException
            java.lang.String r11 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams"
            r10.<init>(r11)
            throw r10
        L_0x0147:
            com.ss.android.ugc.aweme.story.base.view.viewpager.RollViewPager r10 = r9.f72583d
            com.ss.android.ugc.aweme.story.feed.jedi.StoryMainHolder2$initView$1 r11 = new com.ss.android.ugc.aweme.story.feed.jedi.StoryMainHolder2$initView$1
            r11.<init>(r9)
            android.support.v4.view.ViewPager$OnPageChangeListener r11 = (android.support.v4.view.ViewPager.OnPageChangeListener) r11
            r10.setFirstOnPageChangeListener(r11)
            com.ss.android.ugc.aweme.story.player.c r10 = com.ss.android.ugc.aweme.story.player.c.d()
            com.ss.android.ugc.aweme.story.feed.jedi.StoryMainHolder2$c r11 = r9.v
            com.ss.android.ugc.aweme.video.a.a r11 = (com.ss.android.ugc.aweme.video.a.a) r11
            r10.a((com.ss.android.ugc.aweme.video.a.a) r11)
        L_0x015e:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.meituan.robust.ChangeQuickRedirect r4 = f72581b
            r5 = 0
            r6 = 83361(0x145a1, float:1.16814E-40)
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            boolean r10 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r10 == 0) goto L_0x0182
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.meituan.robust.ChangeQuickRedirect r4 = f72581b
            r5 = 0
            r6 = 83361(0x145a1, float:1.16814E-40)
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x01a3
        L_0x0182:
            com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager r10 = r9.t
            com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment r11 = r9.k
            android.support.v4.app.Fragment r11 = (android.support.v4.app.Fragment) r11
            android.arch.lifecycle.ViewModelProvider r11 = com.ss.android.ugc.aweme.arch.widgets.base.c.a((android.support.v4.app.Fragment) r11)
            com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment r12 = r9.k
            android.arch.lifecycle.LifecycleOwner r12 = (android.arch.lifecycle.LifecycleOwner) r12
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r11 = com.ss.android.ugc.aweme.arch.widgets.base.DataCenter.a((android.arch.lifecycle.ViewModelProvider) r11, (android.arch.lifecycle.LifecycleOwner) r12)
            r10.a((com.ss.android.ugc.aweme.arch.widgets.base.DataCenter) r11)
            com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager r10 = r9.t
            r11 = 2131165472(0x7f070120, float:1.7945162E38)
            com.ss.android.ugc.aweme.story.feed.jedi.StoryAuthorJediWidget r12 = r9.i
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r12 = (com.ss.android.ugc.aweme.arch.widgets.base.Widget) r12
            r10.b(r11, r12)
        L_0x01a3:
            com.ss.android.ugc.aweme.story.base.view.viewpager.RollViewPager r10 = r9.f72583d
            com.ss.android.ugc.aweme.story.feed.view.adapter.StoryFeedPagerAdapter r11 = r9.f72585f
            android.support.v4.view.PagerAdapter r11 = (android.support.v4.view.PagerAdapter) r11
            r10.setAdapter(r11)
            com.ss.android.ugc.aweme.story.base.view.viewpager.RollViewPager r10 = r9.f72583d
            com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment r11 = r9.k
            android.support.v4.app.Fragment r11 = (android.support.v4.app.Fragment) r11
            r10.setFragment(r11)
            com.ss.android.ugc.aweme.story.base.view.viewpager.RollViewPager r10 = r9.f72583d
            r11 = r9
            com.ss.android.ugc.aweme.story.base.view.viewpager.RollViewPager$a r11 = (com.ss.android.ugc.aweme.story.base.view.viewpager.RollViewPager.a) r11
            r10.setLoadMore(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.jedi.StoryMainHolder2.<init>(android.view.ViewGroup, com.ss.android.ugc.aweme.story.feed.jedi.StoryFeedJediFragment, com.ss.android.ugc.aweme.story.viewpager2.widget.ViewPager2):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z, int i2, int i3) {
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f72581b, false, 83370, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f72581b, false, 83370, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        FragmentActivity activity = this.k.getActivity();
        if (activity != null) {
            if (!z) {
                if (i4 > 0) {
                    this.l.a(i4 - 1, true);
                }
            } else if (i4 < i3 - 1) {
                this.l.a(i4 + 1, true);
            } else {
                activity.supportFinishAfterTransition();
            }
        }
    }
}

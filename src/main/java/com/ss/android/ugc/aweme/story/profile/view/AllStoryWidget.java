package com.ss.android.ugc.aweme.story.profile.view;

import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.os.Build;
import android.support.annotation.StringRes;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.profile.j;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem;
import com.ss.android.ugc.aweme.story.profile.model.c;
import com.ss.android.ugc.aweme.story.profile.model.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\b\u0012\u0004\u0012\u00020\u00060\u0005B\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u001c\u001a\u00020\u001dH\u0002J \u0010\u001e\u001a\u00020\u00192\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00060 j\b\u0012\u0004\u0012\u00020\u0006`!H\u0002J\b\u0010\"\u001a\u00020\u001dH\u0014J\b\u0010#\u001a\u00020\u0019H\u0002J\u0012\u0010$\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\b\u0010'\u001a\u00020\u0019H\u0016J \u0010(\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010)2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010)H\u0002J\u0012\u0010+\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\u0012\u0010,\u001a\u00020\u00192\b\u0010-\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010.\u001a\u00020\u0019H\u0016J\b\u0010/\u001a\u00020\u0019H\u0016J\u0012\u00100\u001a\u00020\u00192\b\u00101\u001a\u0004\u0018\u000102H\u0002J \u00103\u001a\u00020\u00192\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010)2\u0006\u00104\u001a\u000205H\u0016J \u00106\u001a\u00020\u00192\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010)2\u0006\u00104\u001a\u000205H\u0016J \u00107\u001a\u00020\u00192\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010)2\u0006\u00104\u001a\u000205H\u0016J\b\u00108\u001a\u00020\u0019H\u0016J\b\u00109\u001a\u00020\u0019H\u0016J\u0012\u0010:\u001a\u00020\u00192\b\u0010;\u001a\u0004\u0018\u00010<H\u0002J\u0018\u0010=\u001a\u00020\u00192\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010)H\u0002J\b\u0010?\u001a\u00020\u0019H\u0016J\u0012\u0010@\u001a\u00020\u00192\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\u0012\u0010C\u001a\u00020\u00192\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\b\u0010D\u001a\u00020\u0019H\u0016J\u0012\u0010E\u001a\u00020\u00192\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\b\u0010F\u001a\u00020\u0019H\u0016J\b\u0010G\u001a\u00020\u0019H\u0016J\u0016\u0010H\u001a\u00020\u00192\u0006\u0010I\u001a\u0002052\u0006\u0010J\u001a\u000205J\u0006\u0010K\u001a\u00020\u0019J\b\u0010L\u001a\u00020\u0019H\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000¨\u0006M"}, d2 = {"Lcom/ss/android/ugc/aweme/story/profile/view/AllStoryWidget;", "Lcom/ss/android/ugc/aweme/arch/widgets/base/LifecycleOwnerWidget;", "Landroid/arch/lifecycle/Observer;", "Lcom/ss/android/ugc/aweme/arch/widgets/base/KVData;", "Lcom/ss/android/ugc/aweme/common/adapter/LoadMoreRecyclerViewAdapter$ILoadMore;", "Lcom/ss/android/ugc/aweme/common/presenter/IBaseListView;", "Lcom/ss/android/ugc/aweme/story/profile/model/LifeStoryItem;", "()V", "allStoryPresenter", "Lcom/ss/android/ugc/aweme/story/profile/model/AllStoryPresenter;", "gridLayoutManager", "Landroid/support/v7/widget/GridLayoutManager;", "onCoverPageChangeListener", "Lcom/ss/android/ugc/aweme/story/profile/view/OnCoverPageChangeListener;", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "statusView", "Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;", "storyAdapter", "Lcom/ss/android/ugc/aweme/story/profile/view/AllStoryAdapter;", "swipeRefreshLayout", "Landroid/support/v4/widget/SwipeRefreshLayout;", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "createAllStoryPresenter", "", "createStatusTextView", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "strRes", "", "deleteTempStories", "deleteItems", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getLayoutId", "initData", "initView", "view", "Landroid/view/View;", "loadMore", "mergeTempStories", "", "list", "onBindView", "onChanged", "kvData", "onCreate", "onDestroy", "onDetailReturn", "event", "Lcom/ss/android/ugc/aweme/story/detail/event/LifeFeedDetailEvent;", "onLoadLatestResult", "hasMore", "", "onLoadMoreResult", "onRefreshResult", "onResume", "onStop", "prepareTransitions", "storyId", "", "setCovers", "currentList", "showLoadEmpty", "showLoadError", "e", "Ljava/lang/Exception;", "showLoadLatestError", "showLoadLatestLoading", "showLoadMoreError", "showLoadMoreLoading", "showLoading", "startDynamicCoverAnimation", "force", "delay", "stopDynamicCoverAnimation", "tryToRefresh", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AllStoryWidget extends LifecycleOwnerWidget implements Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>, LoadMoreRecyclerViewAdapter.a, com.ss.android.ugc.aweme.common.f.c<LifeStoryItem> {
    public static ChangeQuickRedirect k;
    public AllStoryAdapter l;
    public GridLayoutManager m;
    private RecyclerView n;
    private DmtStatusView o;
    private SwipeRefreshLayout p;
    private User q;
    private a r;
    private com.ss.android.ugc.aweme.story.profile.model.b s;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/story/profile/view/AllStoryWidget$initData$1", "Landroid/arch/lifecycle/Observer;", "Lcom/ss/android/ugc/aweme/story/detail/event/LifeFeedDetailEvent;", "onChanged", "", "event", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements Observer<com.ss.android.ugc.aweme.story.detail.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73329a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AllStoryWidget f73330b;

        a(AllStoryWidget allStoryWidget) {
            this.f73330b = allStoryWidget;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            List<com.ss.android.ugc.aweme.story.api.model.b> list;
            String str;
            boolean z;
            String str2;
            boolean z2;
            com.ss.android.ugc.aweme.story.detail.b.a aVar = (com.ss.android.ugc.aweme.story.detail.b.a) obj;
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f73329a, false, 84956, new Class[]{com.ss.android.ugc.aweme.story.detail.b.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f73329a, false, 84956, new Class[]{com.ss.android.ugc.aweme.story.detail.b.a.class}, Void.TYPE);
                return;
            }
            AllStoryWidget allStoryWidget = this.f73330b;
            if (PatchProxy.isSupport(new Object[]{aVar}, allStoryWidget, AllStoryWidget.k, false, 84944, new Class[]{com.ss.android.ugc.aweme.story.detail.b.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, allStoryWidget, AllStoryWidget.k, false, 84944, new Class[]{com.ss.android.ugc.aweme.story.detail.b.a.class}, Void.TYPE);
                return;
            }
            if (aVar != null && 2 == aVar.f72378b) {
                AllStoryAdapter allStoryAdapter = allStoryWidget.l;
                if (allStoryAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("storyAdapter");
                }
                if (!(allStoryAdapter.getData() == null || aVar.f72377a == null)) {
                    com.ss.android.ugc.aweme.story.feed.model.a aVar2 = aVar.f72377a;
                    Intrinsics.checkExpressionValueIsNotNull(aVar2, "event.mLifeFeed");
                    List<UserStory> userStoryList = aVar2.getUserStoryList();
                    if (userStoryList.size() > 0) {
                        UserStory userStory = userStoryList.get(0);
                        Intrinsics.checkExpressionValueIsNotNull(userStory, "userStoryList[0]");
                        list = userStory.getAwemeList();
                    } else {
                        list = new ArrayList<>();
                    }
                    AllStoryAdapter allStoryAdapter2 = allStoryWidget.l;
                    if (allStoryAdapter2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("storyAdapter");
                    }
                    List data = allStoryAdapter2.getData();
                    if (data == null) {
                        Intrinsics.throwNpe();
                    }
                    ArrayList arrayList = new ArrayList(data);
                    Collection arrayList2 = new ArrayList();
                    for (Object next : arrayList) {
                        if (((LifeStoryItem) next).getDate() == aVar.f72380d.date) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            arrayList2.add(next);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList((List) arrayList2);
                    if (list.size() != arrayList3.size()) {
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            LifeStoryItem lifeStoryItem = (LifeStoryItem) it2.next();
                            Intrinsics.checkExpressionValueIsNotNull(list, "myStoryList");
                            Iterable iterable = list;
                            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                                Iterator it3 = iterable.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    com.ss.android.ugc.aweme.story.api.model.b bVar = (com.ss.android.ugc.aweme.story.api.model.b) it3.next();
                                    Intrinsics.checkExpressionValueIsNotNull(bVar, AdvanceSetting.NETWORK_TYPE);
                                    CharSequence storyId = bVar.getStoryId();
                                    com.ss.android.ugc.aweme.story.api.model.b awemeWithComment = lifeStoryItem.getAwemeWithComment();
                                    if (awemeWithComment != null) {
                                        str2 = awemeWithComment.getStoryId();
                                    } else {
                                        str2 = null;
                                    }
                                    if (TextUtils.equals(storyId, str2)) {
                                        z = true;
                                        break;
                                    }
                                }
                            }
                            z = false;
                            if (!z) {
                                arrayList4.add(lifeStoryItem);
                            }
                        }
                        arrayList.removeAll(arrayList4);
                        AllStoryAdapter allStoryAdapter3 = allStoryWidget.l;
                        if (allStoryAdapter3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("storyAdapter");
                        }
                        allStoryAdapter3.setData(arrayList);
                        com.ss.android.ugc.aweme.arch.widgets.base.b<e> a2 = com.ss.android.ugc.aweme.story.base.a.a.a().a("DELETE_STORY_COVERS", e.class);
                        Intrinsics.checkExpressionValueIsNotNull(a2, "StoryLiveDataBus.get().w…DeleteCovers::class.java)");
                        Iterable<LifeStoryItem> iterable2 = arrayList4;
                        Collection arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
                        for (LifeStoryItem awemeWithComment2 : iterable2) {
                            com.ss.android.ugc.aweme.story.api.model.b awemeWithComment3 = awemeWithComment2.getAwemeWithComment();
                            if (awemeWithComment3 != null) {
                                str = awemeWithComment3.getStoryId();
                            } else {
                                str = null;
                            }
                            arrayList5.add(str);
                        }
                        a2.setValue(new e((List) arrayList5));
                        allStoryWidget.a(arrayList4);
                        com.ss.android.ugc.aweme.arch.widgets.base.b<com.ss.android.ugc.aweme.story.profile.model.c> a3 = com.ss.android.ugc.aweme.story.base.a.a.a().a("STORY_ADD_DELETE_STATUS", com.ss.android.ugc.aweme.story.profile.model.c.class);
                        Intrinsics.checkExpressionValueIsNotNull(a3, "StoryLiveDataBus.get().w…DeleteStatus::class.java)");
                        a3.setValue(new com.ss.android.ugc.aweme.story.profile.model.c(c.a.b(), arrayList4.size()));
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/story/profile/view/AllStoryWidget$initData$2", "Landroid/arch/lifecycle/Observer;", "Lcom/ss/android/ugc/aweme/story/api/model/AwemeWithComment;", "onChanged", "", "awemeWithComment", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements Observer<com.ss.android.ugc.aweme.story.api.model.b> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73331a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AllStoryWidget f73332b;

        b(AllStoryWidget allStoryWidget) {
            this.f73332b = allStoryWidget;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            com.ss.android.ugc.aweme.story.api.model.b bVar = (com.ss.android.ugc.aweme.story.api.model.b) obj;
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f73331a, false, 84957, new Class[]{com.ss.android.ugc.aweme.story.api.model.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f73331a, false, 84957, new Class[]{com.ss.android.ugc.aweme.story.api.model.b.class}, Void.TYPE);
                return;
            }
            AllStoryWidget allStoryWidget = this.f73332b;
            if (bVar != null) {
                str = bVar.getStoryId();
            } else {
                str = null;
            }
            if (PatchProxy.isSupport(new Object[]{str}, allStoryWidget, AllStoryWidget.k, false, 84938, new Class[]{String.class}, Void.TYPE)) {
                AllStoryWidget allStoryWidget2 = allStoryWidget;
                PatchProxy.accessDispatch(new Object[]{str}, allStoryWidget2, AllStoryWidget.k, false, 84938, new Class[]{String.class}, Void.TYPE);
                return;
            }
            if (!TextUtils.isEmpty(str) && Build.VERSION.SDK_INT >= 21) {
                Activity c2 = allStoryWidget.c();
                if (c2 != null) {
                    ((FragmentActivity) c2).setExitSharedElementCallback(new AllStoryWidget$prepareTransitions$1(allStoryWidget, str));
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/ugc/aweme/story/profile/view/AllStoryWidget$initView$2$1"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73333a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AllStoryWidget f73334b;

        c(AllStoryWidget allStoryWidget) {
            this.f73334b = allStoryWidget;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f73333a, false, 84958, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f73333a, false, 84958, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f73334b.f();
        }
    }

    public final int b() {
        return C0906R.layout.aq_;
    }

    public final void c(@Nullable List<LifeStoryItem> list, boolean z) {
    }

    public final void d(@Nullable Exception exc) {
    }

    public final void z_() {
    }

    public final void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 84930, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 84930, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.g.a(j.f61548a, (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) this);
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 84942, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 84942, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
    }

    public final void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 84943, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 84943, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 84948, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 84948, new Class[0], Void.TYPE);
        } else if (this.i) {
            AllStoryAdapter allStoryAdapter = this.l;
            if (allStoryAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("storyAdapter");
            }
            allStoryAdapter.showLoadMoreLoading();
        }
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 84950, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 84950, new Class[0], Void.TYPE);
        } else if (this.i) {
            DmtStatusView dmtStatusView = this.o;
            if (dmtStatusView != null) {
                dmtStatusView.e();
            }
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 84934, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 84934, new Class[0], Void.TYPE);
        } else if (!NetworkUtils.isNetworkAvailable(this.f2709d)) {
            com.bytedance.ies.dmt.ui.d.a.b(this.f2709d, (int) C0906R.string.bgf).a();
        } else {
            com.ss.android.ugc.aweme.story.profile.model.b bVar = this.s;
            if (bVar != null) {
                bVar.a(this.q);
            }
        }
    }

    public final void n_() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, k, false, 84949, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 84949, new Class[0], Void.TYPE);
        } else if (this.i) {
            AllStoryAdapter allStoryAdapter = this.l;
            if (allStoryAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("storyAdapter");
            }
            List data = allStoryAdapter.getData();
            if (data != null) {
                i = data.size();
            }
            if (i == 0) {
                DmtStatusView dmtStatusView = this.o;
                if (dmtStatusView != null) {
                    dmtStatusView.d();
                }
            } else {
                SwipeRefreshLayout swipeRefreshLayout = this.p;
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(true);
                }
            }
        }
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 84936, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 84936, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        com.ss.android.ugc.aweme.story.profile.model.b bVar = this.s;
        if (bVar != null) {
            if (PatchProxy.isSupport(new Object[0], bVar, com.ss.android.ugc.aweme.story.profile.model.b.f73287a, false, 84894, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], bVar, com.ss.android.ugc.aweme.story.profile.model.b.f73287a, false, 84894, new Class[0], Void.TYPE);
            } else {
                bVar.f73289c.dispose();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0069, code lost:
        if (r1 == null) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void loadMore() {
        /*
            r21 = this;
            r7 = r21
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = k
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 84947(0x14bd3, float:1.19036E-40)
            r1 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0029
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = k
            r3 = 0
            r4 = 84947(0x14bd3, float:1.19036E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0029:
            com.ss.android.ugc.aweme.story.profile.model.b r0 = r7.s
            if (r0 == 0) goto L_0x00af
            com.ss.android.ugc.aweme.profile.model.User r1 = r7.q
            r2 = 1
            java.lang.Object[] r9 = new java.lang.Object[r2]
            r9[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.story.profile.model.b.f73287a
            r12 = 0
            r13 = 84892(0x14b9c, float:1.18959E-40)
            java.lang.Class[] r14 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r3 = com.ss.android.ugc.aweme.profile.model.User.class
            r14[r8] = r3
            java.lang.Class r15 = java.lang.Void.TYPE
            r10 = r0
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            if (r3 == 0) goto L_0x0061
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r10 = com.ss.android.ugc.aweme.story.profile.model.b.f73287a
            r11 = 0
            r12 = 84892(0x14b9c, float:1.18959E-40)
            java.lang.Class[] r13 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r13[r8] = r1
            java.lang.Class r14 = java.lang.Void.TYPE
            r8 = r3
            r9 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x00af
        L_0x0061:
            com.ss.android.ugc.aweme.story.profile.model.AllStoryApi r15 = r0.f73288b
            if (r1 == 0) goto L_0x006f
            java.lang.String r1 = r1.getUid()
            if (r1 != 0) goto L_0x006c
            goto L_0x006f
        L_0x006c:
            r16 = r1
            goto L_0x0072
        L_0x006f:
            java.lang.String r1 = ""
            goto L_0x006c
        L_0x0072:
            com.ss.android.ugc.aweme.story.profile.model.a r1 = r0.f73290d
            long r1 = r1.f73285b
            int r3 = r0.f73291e
            java.util.TimeZone r4 = java.util.TimeZone.getDefault()
            java.lang.String r5 = "TimeZone.getDefault()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            java.lang.String r4 = r4.getID()
            java.lang.String r5 = "TimeZone.getDefault().id"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            r17 = r1
            r19 = r3
            r20 = r4
            io.reactivex.Observable r1 = r15.getAllStory(r16, r17, r19, r20)
            io.reactivex.Scheduler r2 = io.reactivex.schedulers.Schedulers.io()
            io.reactivex.Observable r1 = r1.subscribeOn(r2)
            io.reactivex.Scheduler r2 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
            io.reactivex.Observable r1 = r1.observeOn(r2)
            com.ss.android.ugc.aweme.story.profile.model.b$a r2 = new com.ss.android.ugc.aweme.story.profile.model.b$a
            r2.<init>(r0)
            io.reactivex.Observer r2 = (io.reactivex.Observer) r2
            r1.subscribe((io.reactivex.Observer<? super T>) r2)
            return
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.profile.view.AllStoryWidget.loadMore():void");
    }

    public final void b(@Nullable Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, k, false, 84952, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, k, false, 84952, new Class[]{Exception.class}, Void.TYPE);
        } else if (this.i) {
            DmtStatusView dmtStatusView = this.o;
            if (dmtStatusView != null) {
                dmtStatusView.f();
            }
        }
    }

    private final DmtTextView a(@StringRes int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, k, false, 84935, new Class[]{Integer.TYPE}, DmtTextView.class)) {
            return (DmtTextView) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, k, false, 84935, new Class[]{Integer.TYPE}, DmtTextView.class);
        }
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(this.f2709d, C0906R.style.r5));
        Context context = this.f2709d;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        dmtTextView.setTextColor(context.getResources().getColor(C0906R.color.zv));
        dmtTextView.setText(i);
        return dmtTextView;
    }

    public final void c(@Nullable Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, k, false, 84953, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, k, false, 84953, new Class[]{Exception.class}, Void.TYPE);
        } else if (this.i) {
            AllStoryAdapter allStoryAdapter = this.l;
            if (allStoryAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("storyAdapter");
            }
            allStoryAdapter.showLoadMoreError();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.ss.android.ugc.aweme.profile.model.User} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onChanged(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r18
            com.ss.android.ugc.aweme.arch.widgets.base.a r0 = (com.ss.android.ugc.aweme.arch.widgets.base.a) r0
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = k
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.arch.widgets.base.a> r3 = com.ss.android.ugc.aweme.arch.widgets.base.a.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 84939(0x14bcb, float:1.19025E-40)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0038
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = k
            r13 = 0
            r14 = 84939(0x14bcb, float:1.19025E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.arch.widgets.base.a> r0 = com.ss.android.ugc.aweme.arch.widgets.base.a.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0038:
            r1 = 0
            if (r0 == 0) goto L_0x003e
            java.lang.String r2 = r0.f34376a
            goto L_0x003f
        L_0x003e:
            r2 = r1
        L_0x003f:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.String r3 = com.ss.android.ugc.aweme.profile.j.f61548a
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x0059
            if (r0 == 0) goto L_0x0054
            java.lang.Object r0 = r0.a()
            r1 = r0
            com.ss.android.ugc.aweme.profile.model.User r1 = (com.ss.android.ugc.aweme.profile.model.User) r1
        L_0x0054:
            r0 = r17
            r0.q = r1
            goto L_0x005b
        L_0x0059:
            r0 = r17
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.profile.view.AllStoryWidget.onChanged(java.lang.Object):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0054, code lost:
        if (r4 == null) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b4 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.ArrayList<com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem> r18) {
        /*
            r17 = this;
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r4 = k
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.util.ArrayList> r3 = java.util.ArrayList.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 84946(0x14bd2, float:1.19035E-40)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = k
            r13 = 0
            r14 = 84946(0x14bd2, float:1.19035E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.util.ArrayList> r0 = java.util.ArrayList.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            com.ss.android.ugc.aweme.story.base.a.a r2 = com.ss.android.ugc.aweme.story.base.a.a.a()
            java.lang.String r3 = "TEMP_STORY"
            java.lang.Class<com.ss.android.ugc.aweme.story.profile.model.f> r4 = com.ss.android.ugc.aweme.story.profile.model.f.class
            com.ss.android.ugc.aweme.arch.widgets.base.b r2 = r2.a(r3, r4)
            java.lang.String r3 = "StoryLiveDataBus.get().w…Y, TempStory::class.java)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.Object r2 = r2.getValue()
            com.ss.android.ugc.aweme.story.profile.model.f r2 = (com.ss.android.ugc.aweme.story.profile.model.f) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r2 == 0) goto L_0x0056
            java.util.List<com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem> r4 = r2.f73304a
            if (r4 != 0) goto L_0x005a
        L_0x0056:
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
        L_0x005a:
            java.util.Iterator r4 = r4.iterator()
        L_0x005e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00bd
            java.lang.Object r5 = r4.next()
            com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem r5 = (com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem) r5
            r6 = r18
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r7 = r6
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x00b6
            java.util.Iterator r6 = r6.iterator()
        L_0x007b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00b6
            java.lang.Object r7 = r6.next()
            com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem r7 = (com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem) r7
            com.ss.android.ugc.aweme.story.api.model.b r7 = r7.getAwemeWithComment()
            r8 = 0
            if (r7 == 0) goto L_0x0099
            com.ss.android.ugc.aweme.story.api.model.LifeStory r7 = r7.getLifeStory()
            if (r7 == 0) goto L_0x0099
            java.lang.String r7 = r7.getStoryId()
            goto L_0x009a
        L_0x0099:
            r7 = r8
        L_0x009a:
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            com.ss.android.ugc.aweme.story.api.model.b r10 = r5.getAwemeWithComment()
            if (r10 == 0) goto L_0x00ac
            com.ss.android.ugc.aweme.story.api.model.LifeStory r10 = r10.getLifeStory()
            if (r10 == 0) goto L_0x00ac
            java.lang.String r8 = r10.getStoryId()
        L_0x00ac:
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r7 = android.text.TextUtils.equals(r7, r8)
            if (r7 == 0) goto L_0x007b
            r6 = 1
            goto L_0x00b7
        L_0x00b6:
            r6 = 0
        L_0x00b7:
            if (r6 == 0) goto L_0x005e
            r3.add(r5)
            goto L_0x005e
        L_0x00bd:
            if (r2 == 0) goto L_0x00c9
            java.util.List<com.ss.android.ugc.aweme.story.profile.model.LifeStoryItem> r0 = r2.f73304a
            if (r0 == 0) goto L_0x00c9
            r1 = r3
            java.util.Collection r1 = (java.util.Collection) r1
            r0.removeAll(r1)
        L_0x00c9:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00e3
            com.ss.android.ugc.aweme.story.base.a.a r0 = com.ss.android.ugc.aweme.story.base.a.a.a()
            java.lang.String r1 = "TEMP_STORY"
            java.lang.Class<com.ss.android.ugc.aweme.story.profile.model.f> r3 = com.ss.android.ugc.aweme.story.profile.model.f.class
            com.ss.android.ugc.aweme.arch.widgets.base.b r0 = r0.a(r1, r3)
            java.lang.String r1 = "StoryLiveDataBus.get().w…Y, TempStory::class.java)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r0.setValue(r2)
        L_0x00e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.profile.view.AllStoryWidget.a(java.util.ArrayList):void");
    }

    public final void a(@Nullable View view) {
        RecyclerView recyclerView;
        DmtStatusView dmtStatusView;
        SwipeRefreshLayout swipeRefreshLayout;
        if (PatchProxy.isSupport(new Object[]{view}, this, k, false, 84931, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, k, false, 84931, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        if (PatchProxy.isSupport(new Object[0], this, k, false, 84937, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 84937, new Class[0], Void.TYPE);
        } else {
            this.q = (User) this.g.a(j.f61548a);
            LifecycleOwner lifecycleOwner = this;
            com.ss.android.ugc.aweme.story.base.a.a.a().a("KEY_LIFE_FEED", com.ss.android.ugc.aweme.story.detail.b.a.class).observe(lifecycleOwner, new a(this));
            com.ss.android.ugc.aweme.story.base.a.a.a().a("STORY_CHANGE", com.ss.android.ugc.aweme.story.api.model.b.class).observe(lifecycleOwner, new b(this));
        }
        if (PatchProxy.isSupport(new Object[0], this, k, false, 84932, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 84932, new Class[0], Void.TYPE);
        } else {
            this.s = new com.ss.android.ugc.aweme.story.profile.model.b(this);
        }
        if (PatchProxy.isSupport(new Object[]{view}, this, k, false, 84933, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, k, false, 84933, new Class[]{View.class}, Void.TYPE);
        } else {
            OnAnimatedScrollListener onAnimatedScrollListener = null;
            if (view != null) {
                recyclerView = (RecyclerView) view.findViewById(C0906R.id.ccc);
            } else {
                recyclerView = null;
            }
            this.n = recyclerView;
            if (view != null) {
                dmtStatusView = (DmtStatusView) view.findViewById(C0906R.id.cvd);
            } else {
                dmtStatusView = null;
            }
            this.o = dmtStatusView;
            if (view != null) {
                swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(C0906R.id.cy0);
            } else {
                swipeRefreshLayout = null;
            }
            this.p = swipeRefreshLayout;
            DataCenter dataCenter = this.g;
            Intrinsics.checkExpressionValueIsNotNull(dataCenter, "mDataCenter");
            this.l = new AllStoryAdapter(dataCenter);
            AllStoryAdapter allStoryAdapter = this.l;
            if (allStoryAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("storyAdapter");
            }
            allStoryAdapter.setShowFooter(true);
            RecyclerView recyclerView2 = this.n;
            if (recyclerView2 != null) {
                AllStoryAdapter allStoryAdapter2 = this.l;
                if (allStoryAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("storyAdapter");
                }
                allStoryAdapter2.setLoadMoreListener(this);
                AllStoryAdapter allStoryAdapter3 = this.l;
                if (allStoryAdapter3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("storyAdapter");
                }
                allStoryAdapter3.mTextColor = recyclerView2.getResources().getColor(C0906R.color.zx);
                AllStoryAdapter allStoryAdapter4 = this.l;
                if (allStoryAdapter4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("storyAdapter");
                }
                recyclerView2.setAdapter(allStoryAdapter4);
                this.m = new GridLayoutManager(this.f2709d, 3);
                GridLayoutManager gridLayoutManager = this.m;
                if (gridLayoutManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gridLayoutManager");
                }
                if (gridLayoutManager != null) {
                    AllStoryAdapter allStoryAdapter5 = this.l;
                    if (allStoryAdapter5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("storyAdapter");
                    }
                    gridLayoutManager.setSpanSizeLookup(new AllStorySpanSizeLookup(allStoryAdapter5));
                }
                GridLayoutManager gridLayoutManager2 = this.m;
                if (gridLayoutManager2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gridLayoutManager");
                }
                if (gridLayoutManager2 != null) {
                    gridLayoutManager2.setOrientation(1);
                }
                GridLayoutManager gridLayoutManager3 = this.m;
                if (gridLayoutManager3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gridLayoutManager");
                }
                recyclerView2.setLayoutManager(gridLayoutManager3);
                Context context = this.f2709d;
                Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
                AllStoryAdapter allStoryAdapter6 = this.l;
                if (allStoryAdapter6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("storyAdapter");
                }
                recyclerView2.addItemDecoration(new DateItemDecoration(context, allStoryAdapter6));
                if (!com.ss.android.ugc.aweme.common.h.c.a()) {
                    onAnimatedScrollListener = new OnAnimatedScrollListener(recyclerView2.getContext());
                    recyclerView2.addOnScrollListener(onAnimatedScrollListener);
                }
                this.r = new a(recyclerView2, onAnimatedScrollListener);
            }
            DmtStatusView dmtStatusView2 = this.o;
            if (dmtStatusView2 != null) {
                DmtStatusView.a a2 = DmtStatusView.a.a(this.f2709d);
                try {
                    DmtTextView a3 = a((int) C0906R.string.b6z);
                    DmtTextView a4 = a((int) C0906R.string.b6y);
                    a3.setOnClickListener(new c(this));
                    a2.b((View) a4).c((View) a3);
                } catch (Exception unused) {
                }
                dmtStatusView2.setBuilder(a2);
            }
            SwipeRefreshLayout swipeRefreshLayout2 = this.p;
            if (swipeRefreshLayout2 != null) {
                swipeRefreshLayout2.setOnRefreshListener(new AllStoryWidget$initView$$inlined$apply$lambda$2(this));
            }
        }
        f();
    }

    public final void a(@Nullable List<LifeStoryItem> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, k, false, 84954, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, k, false, 84954, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (this.i) {
            if (!z) {
                AllStoryAdapter allStoryAdapter = this.l;
                if (allStoryAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("storyAdapter");
                }
                allStoryAdapter.showLoadMoreEmpty();
            } else {
                AllStoryAdapter allStoryAdapter2 = this.l;
                if (allStoryAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("storyAdapter");
                }
                allStoryAdapter2.resetLoadMoreState();
            }
            SwipeRefreshLayout swipeRefreshLayout = this.p;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(false);
            }
            DmtStatusView dmtStatusView = this.o;
            if (dmtStatusView != null) {
                dmtStatusView.b();
            }
            AllStoryAdapter allStoryAdapter3 = this.l;
            if (allStoryAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("storyAdapter");
            }
            allStoryAdapter3.setData(list);
        }
    }

    public final void b(@Nullable List<LifeStoryItem> list, boolean z) {
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, k, false, 84951, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, k, false, 84951, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (this.i) {
            AllStoryAdapter allStoryAdapter = this.l;
            if (allStoryAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("storyAdapter");
            }
            allStoryAdapter.setShowFooter(false);
            if (list == null || list.isEmpty()) {
                z2 = false;
            } else {
                z2 = z;
            }
            if (!z2) {
                AllStoryAdapter allStoryAdapter2 = this.l;
                if (allStoryAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("storyAdapter");
                }
                allStoryAdapter2.showLoadMoreEmpty();
            } else {
                AllStoryAdapter allStoryAdapter3 = this.l;
                if (allStoryAdapter3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("storyAdapter");
                }
                allStoryAdapter3.resetLoadMoreState();
            }
            AllStoryAdapter allStoryAdapter4 = this.l;
            if (allStoryAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("storyAdapter");
            }
            List data = allStoryAdapter4.getData();
            Intrinsics.checkExpressionValueIsNotNull(data, "storyAdapter.data");
            if (list != null && !list.isEmpty()) {
                data.addAll(list);
                AllStoryAdapter allStoryAdapter5 = this.l;
                if (allStoryAdapter5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("storyAdapter");
                }
                if (allStoryAdapter5.getData() != null) {
                    AllStoryAdapter allStoryAdapter6 = this.l;
                    if (allStoryAdapter6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("storyAdapter");
                    }
                    if (allStoryAdapter6.getData().size() > 0) {
                        long date = list.get(0).getDate();
                        AllStoryAdapter allStoryAdapter7 = this.l;
                        if (allStoryAdapter7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("storyAdapter");
                        }
                        List data2 = allStoryAdapter7.getData();
                        AllStoryAdapter allStoryAdapter8 = this.l;
                        if (allStoryAdapter8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("storyAdapter");
                        }
                        LifeStoryItem lifeStoryItem = (LifeStoryItem) data2.get(allStoryAdapter8.getData().size() - 1);
                        if (lifeStoryItem != null && date == lifeStoryItem.getDate()) {
                            AllStoryAdapter allStoryAdapter9 = this.l;
                            if (allStoryAdapter9 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("storyAdapter");
                            }
                            allStoryAdapter9.notifyDataSetChanged();
                        }
                    }
                }
                AllStoryAdapter allStoryAdapter10 = this.l;
                if (allStoryAdapter10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("storyAdapter");
                }
                allStoryAdapter10.setDataAfterLoadMore(data);
            }
            AllStoryAdapter allStoryAdapter11 = this.l;
            if (allStoryAdapter11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("storyAdapter");
            }
            allStoryAdapter11.setShowFooter(true);
        }
    }
}

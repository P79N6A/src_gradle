package com.ss.android.ugc.aweme.story.friends;

import android.text.TextUtils;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.aa;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.l;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.story.a.a.c;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.feed.c.g;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\b\u0010!\u001a\u00020\u0002H\u0014J\b\u0010\"\u001a\u00020#H\u0004J\b\u0010$\u001a\u00020\u001eH\u0014J\u000e\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'J\u000e\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020 R-\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR5\u0010\u000e\u001a&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R3\u0010\u0013\u001a$\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\u0014j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n`\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ss/android/ugc/aweme/story/friends/UserStoryListViewModel;", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/ss/android/ugc/aweme/story/friends/UserStoryListState;", "param", "Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;", "(Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;)V", "listMapper", "Lkotlin/Function1;", "Lcom/ss/android/ugc/aweme/story/feed/model/LifeFeed;", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/story/api/model/BaseStory;", "Lkotlin/collections/ArrayList;", "getListMapper", "()Lkotlin/jvm/functions/Function1;", "listMerge", "Lkotlin/Function2;", "", "getListMerge", "()Lkotlin/jvm/functions/Function2;", "listMiddleware", "Lcom/bytedance/jedi/arch/ext/list/ListMiddleware;", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "Lcom/bytedance/jedi/arch/ext/list/CommonListMiddleware;", "getListMiddleware", "()Lcom/bytedance/jedi/arch/ext/list/ListMiddleware;", "getParam", "()Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;", "repo", "Lcom/ss/android/ugc/aweme/story/repo/lifefeed/LifeFeedRepository;", "addUploadStory", "", "uploadStory", "Lcom/ss/android/ugc/aweme/story/api/model/AwemeWithComment;", "defaultState", "getTabType", "", "onStart", "refreshWithUid", "uid", "", "updateAfterPublish", "publishedStory", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class UserStoryListViewModel extends JediViewModel<UserStoryListState> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f73023d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.story.a.a.c f73024e = com.ss.android.ugc.aweme.story.a.a.a(e());
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final Function1<com.ss.android.ugc.aweme.story.feed.model.a, ArrayList<com.ss.android.ugc.aweme.story.api.model.c>> f73025f = d.INSTANCE;
    @NotNull
    public final Function2<List<? extends com.ss.android.ugc.aweme.story.api.model.c>, List<? extends com.ss.android.ugc.aweme.story.api.model.c>, List<com.ss.android.ugc.aweme.story.api.model.c>> g = e.INSTANCE;
    @NotNull
    public final ListMiddleware<UserStoryListState, com.ss.android.ugc.aweme.story.api.model.c, com.bytedance.jedi.arch.ext.list.k> h = new ListMiddleware<>(new a(this), new b(new g(this)), com.bytedance.jedi.arch.ext.list.j.a(), com.bytedance.jedi.arch.ext.list.j.b());
    @NotNull
    public final com.ss.android.ugc.aweme.story.api.model.h i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001av\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002 \u0006*:\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0007*\u00020\b\"\u0004\b\u0001\u0010\u00042\u0006\u0010\t\u001a\u0002H\u0007H\n¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "T", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "kotlin.jvm.PlatformType", "S", "Lcom/bytedance/jedi/arch/State;", "it", "invoke", "(Lcom/bytedance/jedi/arch/State;)Lio/reactivex/Observable;", "com/bytedance/jedi/arch/ext/list/SimpleListMiddlewareKt$SingleListMiddleware$1"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function1<UserStoryListState, Observable<Pair<? extends List<? extends com.ss.android.ugc.aweme.story.api.model.c>, ? extends com.bytedance.jedi.arch.ext.list.k>>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ UserStoryListViewModel this$0;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/story/api/model/BaseStory;", "Lkotlin/collections/ArrayList;", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "it", "Lcom/ss/android/ugc/aweme/story/feed/model/LifeFeed;", "apply", "com/ss/android/ugc/aweme/story/friends/UserStoryListViewModel$listMiddleware$1$2"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.story.friends.UserStoryListViewModel$a$a  reason: collision with other inner class name */
        static final class C0758a<T, R> implements Function<T, R> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f73026a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f73027b;

            C0758a(a aVar) {
                this.f73027b = aVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                com.ss.android.ugc.aweme.story.feed.model.a aVar = (com.ss.android.ugc.aweme.story.feed.model.a) obj;
                if (PatchProxy.isSupport(new Object[]{aVar}, this, f73026a, false, 84497, new Class[]{com.ss.android.ugc.aweme.story.feed.model.a.class}, Pair.class)) {
                    return (Pair) PatchProxy.accessDispatch(new Object[]{aVar}, this, f73026a, false, 84497, new Class[]{com.ss.android.ugc.aweme.story.feed.model.a.class}, Pair.class);
                }
                Intrinsics.checkParameterIsNotNull(aVar, AdvanceSetting.NETWORK_TYPE);
                return TuplesKt.to(this.f73027b.this$0.f73025f.invoke(aVar), new com.bytedance.jedi.arch.ext.list.k(aVar.isHasMore(), (int) aVar.getCursor()));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(UserStoryListViewModel userStoryListViewModel) {
            super(1);
            this.this$0 = userStoryListViewModel;
        }

        public final Observable<Pair<List<com.ss.android.ugc.aweme.story.api.model.c>, com.bytedance.jedi.arch.ext.list.k>> invoke(@NotNull UserStoryListState userStoryListState) {
            if (PatchProxy.isSupport(new Object[]{userStoryListState}, this, changeQuickRedirect, false, 84496, new Class[]{x.class}, Observable.class)) {
                return (Observable) PatchProxy.accessDispatch(new Object[]{userStoryListState}, this, changeQuickRedirect, false, 84496, new Class[]{x.class}, Observable.class);
            }
            Intrinsics.checkParameterIsNotNull(userStoryListState, AdvanceSetting.NETWORK_TYPE);
            Single map = this.this$0.f73024e.a(0, 20, userStoryListState.getParam().f71856a, "").onErrorReturn(f.f73029b).observeOn(Schedulers.io()).map(new C0758a(this));
            Intrinsics.checkExpressionValueIsNotNull(map, "repo.fetchLifeFeed(0, ST…or = it.cursor.toInt()) }");
            Observable<Pair<List<com.ss.android.ugc.aweme.story.api.model.c>, com.bytedance.jedi.arch.ext.list.k>> observable = map.toObservable();
            Intrinsics.checkExpressionValueIsNotNull(observable, "actualRefresh(it).toObservable()");
            return observable;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001av\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002 \u0006*:\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0007*\u00020\b\"\u0004\b\u0001\u0010\u00042\u0006\u0010\t\u001a\u0002H\u0007H\n¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "T", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "kotlin.jvm.PlatformType", "S", "Lcom/bytedance/jedi/arch/State;", "state", "invoke", "(Lcom/bytedance/jedi/arch/State;)Lio/reactivex/Observable;", "com/bytedance/jedi/arch/ext/list/SimpleListMiddlewareKt$SingleListMiddleware$2$1"}, k = 3, mv = {1, 1, 15})
    public static final class b extends Lambda implements Function1<UserStoryListState, Observable<Pair<? extends List<? extends com.ss.android.ugc.aweme.story.api.model.c>, ? extends com.bytedance.jedi.arch.ext.list.k>>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Function1 $loadMore;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Function1 function1) {
            super(1);
            this.$loadMore = function1;
        }

        public final Observable<Pair<List<com.ss.android.ugc.aweme.story.api.model.c>, com.bytedance.jedi.arch.ext.list.k>> invoke(@NotNull UserStoryListState userStoryListState) {
            UserStoryListState userStoryListState2 = userStoryListState;
            if (PatchProxy.isSupport(new Object[]{userStoryListState2}, this, changeQuickRedirect, false, 84498, new Class[]{x.class}, Observable.class)) {
                return (Observable) PatchProxy.accessDispatch(new Object[]{userStoryListState2}, this, changeQuickRedirect, false, 84498, new Class[]{x.class}, Observable.class);
            }
            Intrinsics.checkParameterIsNotNull(userStoryListState2, "state");
            return ((Single) this.$loadMore.invoke(userStoryListState2)).toObservable();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/story/friends/UserStoryListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function1<UserStoryListState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.story.api.model.b $uploadStory;
        final /* synthetic */ UserStoryListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(UserStoryListViewModel userStoryListViewModel, com.ss.android.ugc.aweme.story.api.model.b bVar) {
            super(1);
            this.this$0 = userStoryListViewModel;
            this.$uploadStory = bVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((UserStoryListState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull UserStoryListState userStoryListState) {
            int i;
            UserStoryListState userStoryListState2 = userStoryListState;
            if (PatchProxy.isSupport(new Object[]{userStoryListState2}, this, changeQuickRedirect, false, 84499, new Class[]{UserStoryListState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{userStoryListState2}, this, changeQuickRedirect, false, 84499, new Class[]{UserStoryListState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(userStoryListState2, AdvanceSetting.NETWORK_TYPE);
            if (userStoryListState.getListState().getList().size() > 0) {
                com.ss.android.ugc.aweme.story.api.model.c cVar = (com.ss.android.ugc.aweme.story.api.model.c) userStoryListState.getListState().getList().get(0);
                if (cVar instanceof UserStory) {
                    com.ss.android.ugc.aweme.story.a.a.c cVar2 = this.this$0.f73024e;
                    com.ss.android.ugc.aweme.story.api.model.b bVar = this.$uploadStory;
                    UserStory userStory = (UserStory) cVar;
                    if (PatchProxy.isSupport(new Object[]{bVar, userStory}, cVar2, com.ss.android.ugc.aweme.story.a.a.c.f71778a, false, 85021, new Class[]{com.ss.android.ugc.aweme.story.api.model.b.class, UserStory.class}, Void.TYPE)) {
                        com.ss.android.ugc.aweme.story.a.a.c cVar3 = cVar2;
                        PatchProxy.accessDispatch(new Object[]{bVar, userStory}, cVar3, com.ss.android.ugc.aweme.story.a.a.c.f71778a, false, 85021, new Class[]{com.ss.android.ugc.aweme.story.api.model.b.class, UserStory.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(bVar, "uploadStory");
                    if (userStory != null) {
                        g.a aVar = com.ss.android.ugc.aweme.story.feed.c.g.f72503b;
                        if (PatchProxy.isSupport(new Object[]{userStory, bVar}, aVar, g.a.f72504a, false, 83807, new Class[]{UserStory.class, com.ss.android.ugc.aweme.story.api.model.b.class}, Void.TYPE)) {
                            g.a aVar2 = aVar;
                            PatchProxy.accessDispatch(new Object[]{userStory, bVar}, aVar2, g.a.f72504a, false, 83807, new Class[]{UserStory.class, com.ss.android.ugc.aweme.story.api.model.b.class}, Void.TYPE);
                        } else {
                            Intrinsics.checkParameterIsNotNull(userStory, "userStory");
                            Intrinsics.checkParameterIsNotNull(bVar, "uploadStory");
                            g.a aVar3 = aVar;
                            if (aVar3.a(userStory.getUser())) {
                                List<com.ss.android.ugc.aweme.story.api.model.b> awemeList = userStory.getAwemeList();
                                if (awemeList != null) {
                                    i = awemeList.size();
                                } else {
                                    i = 0;
                                }
                                if (i <= 0) {
                                    userStory.setAwemeList(CollectionsKt.mutableListOf(bVar));
                                    userStory.setTotalCount(userStory.getTotalCount() + 1);
                                    userStory.setReadFlag(0);
                                } else if (!aVar3.e(userStory)) {
                                    userStory.getAwemeList().add(bVar);
                                    userStory.setTotalCount(userStory.getTotalCount() + 1);
                                    userStory.setReadFlag(0);
                                }
                            }
                        }
                        cVar2.f71781d.a(com.ss.android.ugc.aweme.story.feed.c.g.f72503b.b(userStory), userStory);
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/story/api/model/BaseStory;", "Lkotlin/collections/ArrayList;", "lifeFeed", "Lcom/ss/android/ugc/aweme/story/feed/model/LifeFeed;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function1<com.ss.android.ugc.aweme.story.feed.model.a, ArrayList<com.ss.android.ugc.aweme.story.api.model.c>> {
        public static final d INSTANCE = new d();
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0073, code lost:
            if (r4.f(r3) != false) goto L_0x0077;
         */
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.ArrayList<com.ss.android.ugc.aweme.story.api.model.c> invoke(@org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.story.feed.model.a r18) {
            /*
                r17 = this;
                r0 = r18
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.aweme.story.feed.model.a> r3 = com.ss.android.ugc.aweme.story.feed.model.a.class
                r7[r9] = r3
                java.lang.Class<java.util.ArrayList> r8 = java.util.ArrayList.class
                r5 = 0
                r6 = 84500(0x14a14, float:1.1841E-40)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x0039
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
                r13 = 0
                r14 = 84500(0x14a14, float:1.1841E-40)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.aweme.story.feed.model.a> r0 = com.ss.android.ugc.aweme.story.feed.model.a.class
                r15[r9] = r0
                java.lang.Class<java.util.ArrayList> r16 = java.util.ArrayList.class
                r11 = r17
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                return r0
            L_0x0039:
                java.lang.String r2 = "lifeFeed"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.List r3 = r18.getUserStoryList()
                r4 = r3
                java.util.Collection r4 = (java.util.Collection) r4
                r2.addAll(r4)
                com.ss.android.ugc.aweme.story.feed.c.g$a r4 = com.ss.android.ugc.aweme.story.feed.c.g.f72503b
                r4.a((com.ss.android.ugc.aweme.story.feed.model.a) r0)
                java.util.List<com.ss.android.ugc.aweme.story.feed.model.c> r4 = r0.liveStories
                java.util.Collection r4 = (java.util.Collection) r4
                boolean r4 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r4)
                if (r4 != 0) goto L_0x009e
                boolean r4 = r3.isEmpty()
                if (r4 != 0) goto L_0x0076
                com.ss.android.ugc.aweme.story.feed.c.g$a r4 = com.ss.android.ugc.aweme.story.feed.c.g.f72503b
                java.lang.Object r3 = r3.get(r9)
                java.lang.String r5 = "storyList[0]"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r5)
                com.ss.android.ugc.aweme.story.api.model.UserStory r3 = (com.ss.android.ugc.aweme.story.api.model.UserStory) r3
                boolean r3 = r4.f((com.ss.android.ugc.aweme.story.api.model.UserStory) r3)
                if (r3 == 0) goto L_0x0076
                goto L_0x0077
            L_0x0076:
                r1 = 0
            L_0x0077:
                java.util.List<com.ss.android.ugc.aweme.story.feed.model.c> r3 = r0.liveStories
                java.lang.String r4 = "lifeFeed.liveStories"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                java.util.Iterator r3 = r3.iterator()
            L_0x0084:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x0097
                java.lang.Object r4 = r3.next()
                com.ss.android.ugc.aweme.story.feed.model.c r4 = (com.ss.android.ugc.aweme.story.feed.model.c) r4
                com.ss.android.ugc.aweme.story.api.model.LogPbBean r5 = r18.getLogPb()
                r4.f72670c = r5
                goto L_0x0084
            L_0x0097:
                java.util.List<com.ss.android.ugc.aweme.story.feed.model.c> r0 = r0.liveStories
                java.util.Collection r0 = (java.util.Collection) r0
                r2.addAll(r1, r0)
            L_0x009e:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.friends.UserStoryListViewModel.d.invoke(com.ss.android.ugc.aweme.story.feed.model.a):java.util.ArrayList");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/story/api/model/BaseStory;", "currentList", "newList", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function2<List<? extends com.ss.android.ugc.aweme.story.api.model.c>, List<? extends com.ss.android.ugc.aweme.story.api.model.c>, List<? extends com.ss.android.ugc.aweme.story.api.model.c>> {
        public static final e INSTANCE = new e();
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
            super(2);
        }

        @NotNull
        public final List<com.ss.android.ugc.aweme.story.api.model.c> invoke(@NotNull List<? extends com.ss.android.ugc.aweme.story.api.model.c> list, @NotNull List<? extends com.ss.android.ugc.aweme.story.api.model.c> list2) {
            List<? extends com.ss.android.ugc.aweme.story.api.model.c> list3 = list;
            List<? extends com.ss.android.ugc.aweme.story.api.model.c> list4 = list2;
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{list3, list4}, this, changeQuickRedirect, false, 84501, new Class[]{List.class, List.class}, List.class)) {
                return (List) PatchProxy.accessDispatch(new Object[]{list3, list4}, this, changeQuickRedirect, false, 84501, new Class[]{List.class, List.class}, List.class);
            }
            Intrinsics.checkParameterIsNotNull(list3, "currentList");
            Intrinsics.checkParameterIsNotNull(list4, "newList");
            Collection arrayList = new ArrayList();
            for (Object next : list3) {
                if (((com.ss.android.ugc.aweme.story.api.model.c) next) instanceof com.ss.android.ugc.aweme.story.feed.model.c) {
                    arrayList.add(next);
                }
            }
            List list5 = (List) arrayList;
            Iterator<? extends com.ss.android.ugc.aweme.story.api.model.c> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                } else if (((com.ss.android.ugc.aweme.story.api.model.c) it2.next()) instanceof com.ss.android.ugc.aweme.story.feed.model.c) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return list4;
            }
            ArrayList arrayList2 = new ArrayList(list4);
            arrayList2.addAll(i, list5);
            return arrayList2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/story/feed/model/LifeFeed;", "it", "", "apply"}, k = 3, mv = {1, 1, 15})
    static final class f<T, R> implements Function<Throwable, com.ss.android.ugc.aweme.story.feed.model.a> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73028a;

        /* renamed from: b  reason: collision with root package name */
        public static final f f73029b = new f();

        f() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            if (PatchProxy.isSupport(new Object[]{th}, this, f73028a, false, 84502, new Class[]{Throwable.class}, com.ss.android.ugc.aweme.story.feed.model.a.class)) {
                return (com.ss.android.ugc.aweme.story.feed.model.a) PatchProxy.accessDispatch(new Object[]{th}, this, f73028a, false, 84502, new Class[]{Throwable.class}, com.ss.android.ugc.aweme.story.feed.model.a.class);
            }
            Intrinsics.checkParameterIsNotNull(th, AdvanceSetting.NETWORK_TYPE);
            com.ss.android.ugc.aweme.story.feed.model.a aVar = new com.ss.android.ugc.aweme.story.feed.model.a();
            aVar.setUserStoryList(CollectionsKt.mutableListOf(com.ss.android.ugc.aweme.story.feed.c.g.f72503b.b()));
            return aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001av\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002 \u0006*:\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lkotlin/Pair;", "", "Lcom/ss/android/ugc/aweme/story/api/model/BaseStory;", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "kotlin.jvm.PlatformType", "state", "Lcom/ss/android/ugc/aweme/story/friends/UserStoryListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function1<UserStoryListState, Single<Pair<? extends List<? extends com.ss.android.ugc.aweme.story.api.model.c>, ? extends com.bytedance.jedi.arch.ext.list.k>>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ UserStoryListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(UserStoryListViewModel userStoryListViewModel) {
            super(1);
            this.this$0 = userStoryListViewModel;
        }

        public final Single<Pair<List<com.ss.android.ugc.aweme.story.api.model.c>, com.bytedance.jedi.arch.ext.list.k>> invoke(@NotNull UserStoryListState userStoryListState) {
            if (PatchProxy.isSupport(new Object[]{userStoryListState}, this, changeQuickRedirect, false, 84503, new Class[]{UserStoryListState.class}, Single.class)) {
                return (Single) PatchProxy.accessDispatch(new Object[]{userStoryListState}, this, changeQuickRedirect, false, 84503, new Class[]{UserStoryListState.class}, Single.class);
            }
            Intrinsics.checkParameterIsNotNull(userStoryListState, "state");
            Single<Pair<List<com.ss.android.ugc.aweme.story.api.model.c>, com.bytedance.jedi.arch.ext.list.k>> map = this.this$0.f73024e.a((long) userStoryListState.getListState().getPayload().f21388b, 20, userStoryListState.getParam().f71856a, "").observeOn(Schedulers.io()).map(new Function<T, R>(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f73030a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ g f73031b;

                {
                    this.f73031b = r1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    com.ss.android.ugc.aweme.story.feed.model.a aVar = (com.ss.android.ugc.aweme.story.feed.model.a) obj;
                    if (PatchProxy.isSupport(new Object[]{aVar}, this, f73030a, false, 84504, new Class[]{com.ss.android.ugc.aweme.story.feed.model.a.class}, Pair.class)) {
                        return (Pair) PatchProxy.accessDispatch(new Object[]{aVar}, this, f73030a, false, 84504, new Class[]{com.ss.android.ugc.aweme.story.feed.model.a.class}, Pair.class);
                    }
                    Intrinsics.checkParameterIsNotNull(aVar, AdvanceSetting.NETWORK_TYPE);
                    return TuplesKt.to(this.f73031b.this$0.f73025f.invoke(aVar), new com.bytedance.jedi.arch.ext.list.k(aVar.isHasMore(), (int) aVar.getCursor()));
                }
            });
            Intrinsics.checkExpressionValueIsNotNull(map, "repo.fetchLifeFeed(state…or = it.cursor.toInt()) }");
            return map;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/ugc/aweme/story/api/model/UserStory;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 15})
    static final class h<T> implements Consumer<List<? extends UserStory>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73032a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UserStoryListViewModel f73033b;

        h(UserStoryListViewModel userStoryListViewModel) {
            this.f73033b = userStoryListViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            final List list = (List) obj;
            if (PatchProxy.isSupport(new Object[]{list}, this, f73032a, false, 84505, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f73032a, false, 84505, new Class[]{List.class}, Void.TYPE);
                return;
            }
            this.f73033b.c(new Function1<UserStoryListState, UserStoryListState>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ h this$0;

                {
                    this.this$0 = r1;
                }

                @NotNull
                public final UserStoryListState invoke(@NotNull UserStoryListState userStoryListState) {
                    UserStoryListState userStoryListState2 = userStoryListState;
                    if (PatchProxy.isSupport(new Object[]{userStoryListState2}, this, changeQuickRedirect, false, 84506, new Class[]{UserStoryListState.class}, UserStoryListState.class)) {
                        return (UserStoryListState) PatchProxy.accessDispatch(new Object[]{userStoryListState2}, this, changeQuickRedirect, false, 84506, new Class[]{UserStoryListState.class}, UserStoryListState.class);
                    }
                    Intrinsics.checkParameterIsNotNull(userStoryListState2, "$receiver");
                    ListState<com.ss.android.ugc.aweme.story.api.model.c, com.bytedance.jedi.arch.ext.list.k> listState = userStoryListState.getListState();
                    Function2<List<? extends com.ss.android.ugc.aweme.story.api.model.c>, List<? extends com.ss.android.ugc.aweme.story.api.model.c>, List<com.ss.android.ugc.aweme.story.api.model.c>> function2 = this.this$0.f73033b.g;
                    List list = userStoryListState.getListState().getList();
                    List list2 = list;
                    Intrinsics.checkExpressionValueIsNotNull(list2, AdvanceSetting.NETWORK_TYPE);
                    return UserStoryListState.copy$default(userStoryListState2, ListState.copy$default(listState, null, (List) function2.invoke(list, list2), null, null, null, 29, null), null, 2, null);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/story/friends/UserStoryListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function1<UserStoryListState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ UserStoryListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(UserStoryListViewModel userStoryListViewModel) {
            super(1);
            this.this$0 = userStoryListViewModel;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((UserStoryListState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull UserStoryListState userStoryListState) {
            if (PatchProxy.isSupport(new Object[]{userStoryListState}, this, changeQuickRedirect, false, 84507, new Class[]{UserStoryListState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{userStoryListState}, this, changeQuickRedirect, false, 84507, new Class[]{UserStoryListState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(userStoryListState, AdvanceSetting.NETWORK_TYPE);
            if (!userStoryListState.getParam().f71859d) {
                if (TextUtils.isEmpty(userStoryListState.getParam().f71858c)) {
                    c.a(this.this$0);
                    return;
                }
                UserStoryListViewModel userStoryListViewModel = this.this$0;
                String str = userStoryListState.getParam().f71858c;
                Intrinsics.checkExpressionValueIsNotNull(str, "it.param.insertStoryUid");
                userStoryListViewModel.a(str);
                userStoryListState.getParam().f71858c = "";
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/ss/android/ugc/aweme/story/friends/UserStoryListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function1<UserStoryListState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ String $uid;
        final /* synthetic */ UserStoryListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(UserStoryListViewModel userStoryListViewModel, String str) {
            super(1);
            this.this$0 = userStoryListViewModel;
            this.$uid = str;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((UserStoryListState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull UserStoryListState userStoryListState) {
            if (PatchProxy.isSupport(new Object[]{userStoryListState}, this, changeQuickRedirect, false, 84508, new Class[]{UserStoryListState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{userStoryListState}, this, changeQuickRedirect, false, 84508, new Class[]{UserStoryListState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(userStoryListState, "state");
            if (!(userStoryListState.getListState().getRefresh() instanceof l)) {
                this.this$0.a(this.this$0.f73024e.a(0, 20, this.this$0.e(), this.$uid), new Function2<UserStoryListState, com.bytedance.jedi.arch.a<? extends com.ss.android.ugc.aweme.story.feed.model.a>, UserStoryListState>(this) {
                    public static ChangeQuickRedirect changeQuickRedirect;
                    final /* synthetic */ j this$0;

                    {
                        this.this$0 = r1;
                    }

                    @NotNull
                    public final UserStoryListState invoke(@NotNull UserStoryListState userStoryListState, @NotNull com.bytedance.jedi.arch.a<? extends com.ss.android.ugc.aweme.story.feed.model.a> aVar) {
                        UserStoryListState userStoryListState2 = userStoryListState;
                        com.bytedance.jedi.arch.a<? extends com.ss.android.ugc.aweme.story.feed.model.a> aVar2 = aVar;
                        if (PatchProxy.isSupport(new Object[]{userStoryListState2, aVar2}, this, changeQuickRedirect, false, 84509, new Class[]{UserStoryListState.class, com.bytedance.jedi.arch.a.class}, UserStoryListState.class)) {
                            return (UserStoryListState) PatchProxy.accessDispatch(new Object[]{userStoryListState2, aVar2}, this, changeQuickRedirect, false, 84509, new Class[]{UserStoryListState.class, com.bytedance.jedi.arch.a.class}, UserStoryListState.class);
                        }
                        Intrinsics.checkParameterIsNotNull(userStoryListState2, "$receiver");
                        Intrinsics.checkParameterIsNotNull(aVar2, "refresh");
                        if (aVar2 instanceof aa) {
                            com.ss.android.ugc.aweme.story.feed.model.a aVar3 = (com.ss.android.ugc.aweme.story.feed.model.a) ((aa) aVar2).a();
                            ArrayList arrayList = (ArrayList) this.this$0.this$0.f73025f.invoke(aVar3);
                            List list = arrayList;
                            return UserStoryListState.copy$default(userStoryListState2, ListState.copy$default(userStoryListState.getListState(), new com.bytedance.jedi.arch.ext.list.k(aVar3.isHasMore(), (int) aVar3.getCursor()), list, new aa(arrayList), null, null, 24, null), null, 2, null);
                        }
                        if (aVar2 instanceof com.bytedance.jedi.arch.c) {
                            return UserStoryListState.copy$default(userStoryListState2, ListState.copy$default(userStoryListState.getListState(), null, null, new com.bytedance.jedi.arch.c(((com.bytedance.jedi.arch.c) aVar2).f21347a), null, null, 27, null), null, 2, null);
                        }
                        if (aVar2 instanceof l) {
                            return UserStoryListState.copy$default(userStoryListState2, ListState.copy$default(userStoryListState.getListState(), null, null, new l(), null, null, 27, null), null, 2, null);
                        }
                        return UserStoryListState.copy$default(userStoryListState2, null, null, 3, null);
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/story/friends/UserStoryListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class k extends Lambda implements Function1<UserStoryListState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.story.api.model.b $publishedStory;
        final /* synthetic */ UserStoryListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(UserStoryListViewModel userStoryListViewModel, com.ss.android.ugc.aweme.story.api.model.b bVar) {
            super(1);
            this.this$0 = userStoryListViewModel;
            this.$publishedStory = bVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((UserStoryListState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull UserStoryListState userStoryListState) {
            int i;
            UserStoryListState userStoryListState2 = userStoryListState;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{userStoryListState2}, this, changeQuickRedirect, false, 84510, new Class[]{UserStoryListState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{userStoryListState2}, this, changeQuickRedirect, false, 84510, new Class[]{UserStoryListState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(userStoryListState2, AdvanceSetting.NETWORK_TYPE);
            if (userStoryListState.getListState().getList().size() > 0) {
                com.ss.android.ugc.aweme.story.api.model.c cVar = (com.ss.android.ugc.aweme.story.api.model.c) userStoryListState.getListState().getList().get(0);
                if (cVar instanceof UserStory) {
                    com.ss.android.ugc.aweme.story.a.a.c cVar2 = this.this$0.f73024e;
                    com.ss.android.ugc.aweme.story.api.model.b bVar = this.$publishedStory;
                    UserStory userStory = (UserStory) cVar;
                    if (PatchProxy.isSupport(new Object[]{bVar, userStory}, cVar2, com.ss.android.ugc.aweme.story.a.a.c.f71778a, false, 85022, new Class[]{com.ss.android.ugc.aweme.story.api.model.b.class, UserStory.class}, Void.TYPE)) {
                        com.ss.android.ugc.aweme.story.a.a.c cVar3 = cVar2;
                        PatchProxy.accessDispatch(new Object[]{bVar, userStory}, cVar3, com.ss.android.ugc.aweme.story.a.a.c.f71778a, false, 85022, new Class[]{com.ss.android.ugc.aweme.story.api.model.b.class, UserStory.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(bVar, "publishedStory");
                    if (userStory != null) {
                        g.a aVar = com.ss.android.ugc.aweme.story.feed.c.g.f72503b;
                        if (PatchProxy.isSupport(new Object[]{userStory, bVar}, aVar, g.a.f72504a, false, 83809, new Class[]{UserStory.class, com.ss.android.ugc.aweme.story.api.model.b.class}, Void.TYPE)) {
                            g.a aVar2 = aVar;
                            PatchProxy.accessDispatch(new Object[]{userStory, bVar}, aVar2, g.a.f72504a, false, 83809, new Class[]{UserStory.class, com.ss.android.ugc.aweme.story.api.model.b.class}, Void.TYPE);
                        } else {
                            Intrinsics.checkParameterIsNotNull(userStory, "userStory");
                            Intrinsics.checkParameterIsNotNull(bVar, "uploadStory");
                            if (aVar.a(userStory.getUser())) {
                                List<com.ss.android.ugc.aweme.story.api.model.b> awemeList = userStory.getAwemeList();
                                if (awemeList != null) {
                                    i = awemeList.size();
                                } else {
                                    i = 0;
                                }
                                if (i > 0) {
                                    List<com.ss.android.ugc.aweme.story.api.model.b> awemeList2 = userStory.getAwemeList();
                                    Intrinsics.checkExpressionValueIsNotNull(awemeList2, "userStory.awemeList");
                                    for (com.ss.android.ugc.aweme.story.api.model.b bVar2 : awemeList2) {
                                        if (bVar2 != null && bVar2.getAwemeType() == 10000) {
                                            userStory.getAwemeList().set(i2, bVar);
                                        }
                                        i2++;
                                    }
                                } else {
                                    userStory.setAwemeList(CollectionsKt.mutableListOf(bVar));
                                }
                            }
                        }
                        cVar2.f71781d.a(com.ss.android.ugc.aweme.story.feed.c.g.f72503b.b(userStory), userStory);
                    }
                }
            }
        }
    }

    public final int e() {
        return this.i.f71856a;
    }

    public final /* synthetic */ x c() {
        UserStoryListState userStoryListState;
        if (PatchProxy.isSupport(new Object[0], this, f73023d, false, 84491, new Class[0], UserStoryListState.class)) {
            userStoryListState = (UserStoryListState) PatchProxy.accessDispatch(new Object[0], this, f73023d, false, 84491, new Class[0], UserStoryListState.class);
        } else {
            userStoryListState = new UserStoryListState(null, null, 3, null);
        }
        return userStoryListState;
    }

    public final void d() {
        Observable observable;
        if (PatchProxy.isSupport(new Object[0], this, f73023d, false, 84493, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73023d, false, 84493, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        new UserStoryListViewModel_MiddlewareBinding().binding(this);
        com.ss.android.ugc.aweme.story.a.a.c cVar = this.f73024e;
        if (PatchProxy.isSupport(new Object[0], cVar, com.ss.android.ugc.aweme.story.a.a.c.f71778a, false, 85019, new Class[0], Observable.class)) {
            observable = (Observable) PatchProxy.accessDispatch(new Object[0], cVar, com.ss.android.ugc.aweme.story.a.a.c.f71778a, false, 85019, new Class[0], Observable.class);
        } else {
            observable = cVar.f71780c.a().a(Unit.INSTANCE, (com.bytedance.jedi.model.c.d<?, ?>[]) new com.bytedance.jedi.model.c.d[]{cVar.f71779b.a()}).filter(c.d.f71783b).map(c.e.f71785b);
            Intrinsics.checkExpressionValueIsNotNull(observable, "lifeFeedAllCache.asDataS…     .map { it.some()!! }");
        }
        Disposable subscribe = observable.subscribe((Consumer<? super T>) new h<Object>(this));
        Intrinsics.checkExpressionValueIsNotNull(subscribe, "repo.observeLifeFeedList…      }\n                }");
        a(subscribe);
        b(new i(this));
    }

    public UserStoryListViewModel(@NotNull com.ss.android.ugc.aweme.story.api.model.h hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "param");
        this.i = hVar;
    }

    public final void a(@NotNull com.ss.android.ugc.aweme.story.api.model.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f73023d, false, 84494, new Class[]{com.ss.android.ugc.aweme.story.api.model.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f73023d, false, 84494, new Class[]{com.ss.android.ugc.aweme.story.api.model.b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar, "uploadStory");
        b(new c(this, bVar));
    }

    public final void a(@NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f73023d, false, 84492, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f73023d, false, 84492, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, "uid");
        b(new j(this, str));
    }
}

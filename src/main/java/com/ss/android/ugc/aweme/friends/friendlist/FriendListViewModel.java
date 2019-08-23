package com.ss.android.ugc.aweme.friends.friendlist;

import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.k;
import com.bytedance.jedi.arch.x;
import com.bytedance.jedi.codegen.anno.Bind;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.base.arch.JediBaseViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ah;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u0002H\u0014J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u000fH\u0014J\b\u0010\u0014\u001a\u00020\u000fH\u0014J\f\u0010\u0015\u001a\u00020\u0006*\u00020\u0016H\u0002J\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018*\b\u0012\u0004\u0012\u00020\u00160\u0018H\u0002R8\u0010\u0004\u001a$\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006`\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListViewModel;", "Lcom/ss/android/ugc/aweme/base/arch/JediBaseViewModel;", "Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListState;", "()V", "friendListMiddleware", "Lcom/bytedance/jedi/arch/ext/list/ListMiddleware;", "Lcom/ss/android/ugc/aweme/friends/adapter/FriendList;", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "Lcom/bytedance/jedi/arch/ext/list/CommonListMiddleware;", "getFriendListMiddleware", "()Lcom/bytedance/jedi/arch/ext/list/ListMiddleware;", "repo", "Lcom/ss/android/ugc/aweme/friends/friendlist/repository/FriendListRepository;", "defaultState", "enableNickNameModify", "", "enable", "", "observeFriends", "onCleared", "onStart", "mapToFriend", "Lcom/ss/android/ugc/aweme/profile/model/User;", "mapToFriendList", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FriendListViewModel extends JediBaseViewModel<FriendListState> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f48925d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.friends.friendlist.repository.c f48926e = new com.ss.android.ugc.aweme.friends.friendlist.repository.c();
    @NotNull
    @Bind
    public final ListMiddleware<FriendListState, com.ss.android.ugc.aweme.friends.adapter.c, k> friendListMiddleware = new ListMiddleware<>(new a(this), new b(new d(this)), e.INSTANCE, f.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001av\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002 \u0006*:\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0007*\u00020\b\"\u0004\b\u0001\u0010\u00042\u0006\u0010\t\u001a\u0002H\u0007H\n¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "T", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "kotlin.jvm.PlatformType", "S", "Lcom/bytedance/jedi/arch/State;", "it", "invoke", "(Lcom/bytedance/jedi/arch/State;)Lio/reactivex/Observable;", "com/bytedance/jedi/arch/ext/list/SimpleListMiddlewareKt$SingleListMiddleware$1"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function1<FriendListState, Observable<Pair<? extends List<? extends com.ss.android.ugc.aweme.friends.adapter.c>, ? extends k>>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FriendListViewModel this$0;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lcom/ss/android/ugc/aweme/friends/adapter/FriendList;", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "it", "Lcom/ss/android/ugc/aweme/story/shootvideo/friends/model/KnowFriendList;", "apply", "com/ss/android/ugc/aweme/friends/friendlist/FriendListViewModel$friendListMiddleware$1$1"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.friends.friendlist.FriendListViewModel$a$a  reason: collision with other inner class name */
        static final class C0581a<T, R> implements Function<T, R> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48927a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f48928b;

            C0581a(a aVar) {
                this.f48928b = aVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                com.ss.android.ugc.aweme.story.shootvideo.friends.a.a aVar = (com.ss.android.ugc.aweme.story.shootvideo.friends.a.a) obj;
                if (PatchProxy.isSupport(new Object[]{aVar}, this, f48927a, false, 46480, new Class[]{com.ss.android.ugc.aweme.story.shootvideo.friends.a.a.class}, Pair.class)) {
                    return (Pair) PatchProxy.accessDispatch(new Object[]{aVar}, this, f48927a, false, 46480, new Class[]{com.ss.android.ugc.aweme.story.shootvideo.friends.a.a.class}, Pair.class);
                }
                Intrinsics.checkParameterIsNotNull(aVar, AdvanceSetting.NETWORK_TYPE);
                FriendListViewModel friendListViewModel = this.f48928b.this$0;
                List<User> a2 = aVar.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "it.userList");
                return TuplesKt.to(friendListViewModel.a(a2), new k(aVar.f73524e, aVar.f73523d));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(FriendListViewModel friendListViewModel) {
            super(1);
            this.this$0 = friendListViewModel;
        }

        public final Observable<Pair<List<com.ss.android.ugc.aweme.friends.adapter.c>, k>> invoke(@NotNull FriendListState friendListState) {
            if (PatchProxy.isSupport(new Object[]{friendListState}, this, changeQuickRedirect, false, 46479, new Class[]{x.class}, Observable.class)) {
                return (Observable) PatchProxy.accessDispatch(new Object[]{friendListState}, this, changeQuickRedirect, false, 46479, new Class[]{x.class}, Observable.class);
            }
            Intrinsics.checkParameterIsNotNull(friendListState, AdvanceSetting.NETWORK_TYPE);
            Single map = this.this$0.f48926e.a(100, 0).map(new C0581a(this));
            Intrinsics.checkExpressionValueIsNotNull(map, "repo.getFriendList(FRIEN…e(),cursor = it.cursor) }");
            Observable<Pair<List<com.ss.android.ugc.aweme.friends.adapter.c>, k>> observable = map.toObservable();
            Intrinsics.checkExpressionValueIsNotNull(observable, "actualRefresh(it).toObservable()");
            return observable;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001av\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002 \u0006*:\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0007*\u00020\b\"\u0004\b\u0001\u0010\u00042\u0006\u0010\t\u001a\u0002H\u0007H\n¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "T", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "kotlin.jvm.PlatformType", "S", "Lcom/bytedance/jedi/arch/State;", "state", "invoke", "(Lcom/bytedance/jedi/arch/State;)Lio/reactivex/Observable;", "com/bytedance/jedi/arch/ext/list/SimpleListMiddlewareKt$SingleListMiddleware$2$1"}, k = 3, mv = {1, 1, 15})
    public static final class b extends Lambda implements Function1<FriendListState, Observable<Pair<? extends List<? extends com.ss.android.ugc.aweme.friends.adapter.c>, ? extends k>>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Function1 $loadMore;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Function1 function1) {
            super(1);
            this.$loadMore = function1;
        }

        public final Observable<Pair<List<com.ss.android.ugc.aweme.friends.adapter.c>, k>> invoke(@NotNull FriendListState friendListState) {
            FriendListState friendListState2 = friendListState;
            if (PatchProxy.isSupport(new Object[]{friendListState2}, this, changeQuickRedirect, false, 46481, new Class[]{x.class}, Observable.class)) {
                return (Observable) PatchProxy.accessDispatch(new Object[]{friendListState2}, this, changeQuickRedirect, false, 46481, new Class[]{x.class}, Observable.class);
            }
            Intrinsics.checkParameterIsNotNull(friendListState2, "state");
            return ((Single) this.$loadMore.invoke(friendListState2)).toObservable();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function1<FriendListState, FriendListState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ boolean $enable;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(boolean z) {
            super(1);
            this.$enable = z;
        }

        @NotNull
        public final FriendListState invoke(@NotNull FriendListState friendListState) {
            FriendListState friendListState2 = friendListState;
            if (PatchProxy.isSupport(new Object[]{friendListState2}, this, changeQuickRedirect, false, 46482, new Class[]{FriendListState.class}, FriendListState.class)) {
                return (FriendListState) PatchProxy.accessDispatch(new Object[]{friendListState2}, this, changeQuickRedirect, false, 46482, new Class[]{FriendListState.class}, FriendListState.class);
            }
            Intrinsics.checkParameterIsNotNull(friendListState2, "$receiver");
            return FriendListState.copy$default(friendListState2, this.$enable, null, 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001av\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002 \u0006*:\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lkotlin/Pair;", "", "Lcom/ss/android/ugc/aweme/friends/adapter/FriendList;", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "kotlin.jvm.PlatformType", "state", "Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function1<FriendListState, Single<Pair<? extends List<? extends com.ss.android.ugc.aweme.friends.adapter.c>, ? extends k>>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FriendListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(FriendListViewModel friendListViewModel) {
            super(1);
            this.this$0 = friendListViewModel;
        }

        public final Single<Pair<List<com.ss.android.ugc.aweme.friends.adapter.c>, k>> invoke(@NotNull FriendListState friendListState) {
            if (PatchProxy.isSupport(new Object[]{friendListState}, this, changeQuickRedirect, false, 46483, new Class[]{FriendListState.class}, Single.class)) {
                return (Single) PatchProxy.accessDispatch(new Object[]{friendListState}, this, changeQuickRedirect, false, 46483, new Class[]{FriendListState.class}, Single.class);
            }
            Intrinsics.checkParameterIsNotNull(friendListState, "state");
            Single<Pair<List<com.ss.android.ugc.aweme.friends.adapter.c>, k>> map = this.this$0.f48926e.a(100, friendListState.getListState().getList().size()).map(new Function<T, R>(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f48929a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ d f48930b;

                {
                    this.f48930b = r1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    com.ss.android.ugc.aweme.story.shootvideo.friends.a.a aVar = (com.ss.android.ugc.aweme.story.shootvideo.friends.a.a) obj;
                    if (PatchProxy.isSupport(new Object[]{aVar}, this, f48929a, false, 46484, new Class[]{com.ss.android.ugc.aweme.story.shootvideo.friends.a.a.class}, Pair.class)) {
                        return (Pair) PatchProxy.accessDispatch(new Object[]{aVar}, this, f48929a, false, 46484, new Class[]{com.ss.android.ugc.aweme.story.shootvideo.friends.a.a.class}, Pair.class);
                    }
                    Intrinsics.checkParameterIsNotNull(aVar, AdvanceSetting.NETWORK_TYPE);
                    FriendListViewModel friendListViewModel = this.f48930b.this$0;
                    List<User> a2 = aVar.a();
                    Intrinsics.checkExpressionValueIsNotNull(a2, "it.userList");
                    return TuplesKt.to(friendListViewModel.a(a2), new k(aVar.f73524e, aVar.f73523d));
                }
            });
            Intrinsics.checkExpressionValueIsNotNull(map, "repo.getFriendList(FRIEN…e(),cursor = it.cursor) }");
            return map;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/friends/adapter/FriendList;", "<anonymous parameter 0>", "refresh", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function2<List<? extends com.ss.android.ugc.aweme.friends.adapter.c>, List<? extends com.ss.android.ugc.aweme.friends.adapter.c>, List<? extends com.ss.android.ugc.aweme.friends.adapter.c>> {
        public static final e INSTANCE = new e();
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
            super(2);
        }

        @NotNull
        public final List<com.ss.android.ugc.aweme.friends.adapter.c> invoke(@NotNull List<? extends com.ss.android.ugc.aweme.friends.adapter.c> list, @NotNull List<? extends com.ss.android.ugc.aweme.friends.adapter.c> list2) {
            List<? extends com.ss.android.ugc.aweme.friends.adapter.c> list3 = list;
            List<? extends com.ss.android.ugc.aweme.friends.adapter.c> list4 = list2;
            if (PatchProxy.isSupport(new Object[]{list3, list4}, this, changeQuickRedirect, false, 46485, new Class[]{List.class, List.class}, List.class)) {
                return (List) PatchProxy.accessDispatch(new Object[]{list3, list4}, this, changeQuickRedirect, false, 46485, new Class[]{List.class, List.class}, List.class);
            }
            Intrinsics.checkParameterIsNotNull(list3, "<anonymous parameter 0>");
            Intrinsics.checkParameterIsNotNull(list4, "refresh");
            return CollectionsKt.sorted(list4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/friends/adapter/FriendList;", "list", "loadMore", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function2<List<? extends com.ss.android.ugc.aweme.friends.adapter.c>, List<? extends com.ss.android.ugc.aweme.friends.adapter.c>, List<? extends com.ss.android.ugc.aweme.friends.adapter.c>> {
        public static final f INSTANCE = new f();
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
            super(2);
        }

        @NotNull
        public final List<com.ss.android.ugc.aweme.friends.adapter.c> invoke(@NotNull List<? extends com.ss.android.ugc.aweme.friends.adapter.c> list, @NotNull List<? extends com.ss.android.ugc.aweme.friends.adapter.c> list2) {
            List<? extends com.ss.android.ugc.aweme.friends.adapter.c> list3 = list;
            List<? extends com.ss.android.ugc.aweme.friends.adapter.c> list4 = list2;
            if (PatchProxy.isSupport(new Object[]{list3, list4}, this, changeQuickRedirect, false, 46486, new Class[]{List.class, List.class}, List.class)) {
                return (List) PatchProxy.accessDispatch(new Object[]{list3, list4}, this, changeQuickRedirect, false, 46486, new Class[]{List.class, List.class}, List.class);
            }
            Intrinsics.checkParameterIsNotNull(list3, "list");
            Intrinsics.checkParameterIsNotNull(list4, "loadMore");
            return CollectionsKt.plus((Collection<? extends T>) list3, (Iterable<? extends T>) CollectionsKt.sorted(list4));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00012 \u0010\u0005\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00010\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "Lcom/ss/android/ugc/aweme/profile/model/User;", "it", "apply"}, k = 3, mv = {1, 1, 15})
    static final class g<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48931a;

        /* renamed from: b  reason: collision with root package name */
        public static final g f48932b = new g();

        g() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            if (PatchProxy.isSupport(new Object[]{list}, this, f48931a, false, 46487, new Class[]{List.class}, Pair.class)) {
                return (Pair) PatchProxy.accessDispatch(new Object[]{list}, this, f48931a, false, 46487, new Class[]{List.class}, Pair.class);
            }
            Intrinsics.checkParameterIsNotNull(list, AdvanceSetting.NETWORK_TYPE);
            return (Pair) CollectionsKt.first(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004 \u0006*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "Lcom/ss/android/ugc/aweme/profile/model/User;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 15})
    static final class h<T> implements Consumer<Pair<? extends Unit, ? extends List<? extends User>>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48933a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FriendListViewModel f48934b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListState;", "invoke"}, k = 3, mv = {1, 1, 15})
        static final class a extends Lambda implements Function1<FriendListState, FriendListState> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ List $sortedList;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(List list) {
                super(1);
                this.$sortedList = list;
            }

            @NotNull
            public final FriendListState invoke(@NotNull FriendListState friendListState) {
                FriendListState friendListState2 = friendListState;
                if (PatchProxy.isSupport(new Object[]{friendListState2}, this, changeQuickRedirect, false, 46489, new Class[]{FriendListState.class}, FriendListState.class)) {
                    return (FriendListState) PatchProxy.accessDispatch(new Object[]{friendListState2}, this, changeQuickRedirect, false, 46489, new Class[]{FriendListState.class}, FriendListState.class);
                }
                Intrinsics.checkParameterIsNotNull(friendListState2, "$receiver");
                return FriendListState.copy$default(friendListState2, false, ListState.copy$default(friendListState.getListState(), null, this.$sortedList, null, null, null, 29, null), 1, null);
            }
        }

        h(FriendListViewModel friendListViewModel) {
            this.f48934b = friendListViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            Pair pair = (Pair) obj;
            if (PatchProxy.isSupport(new Object[]{pair}, this, f48933a, false, 46488, new Class[]{Pair.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{pair}, this, f48933a, false, 46488, new Class[]{Pair.class}, Void.TYPE);
                return;
            }
            List list = (List) pair.getSecond();
            if (list != null) {
                this.f48934b.c(new a(CollectionsKt.sorted(this.f48934b.a(list))));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 15})
    static final class i<T> implements Consumer<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f48935a = new i();

        i() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public final /* synthetic */ x c() {
        FriendListState friendListState;
        if (PatchProxy.isSupport(new Object[0], this, f48925d, false, 46472, new Class[0], FriendListState.class)) {
            friendListState = (FriendListState) PatchProxy.accessDispatch(new Object[0], this, f48925d, false, 46472, new Class[0], FriendListState.class);
        } else {
            friendListState = new FriendListState(false, null, 3, null);
        }
        return friendListState;
    }

    public final void onCleared() {
        if (PatchProxy.isSupport(new Object[0], this, f48925d, false, 46475, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48925d, false, 46475, new Class[0], Void.TYPE);
            return;
        }
        super.onCleared();
        this.f48926e.a();
    }

    public final void d() {
        Observable observable;
        if (PatchProxy.isSupport(new Object[0], this, f48925d, false, 46473, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48925d, false, 46473, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        new FriendListViewModelMiddlewareBinding().binding(this);
        if (PatchProxy.isSupport(new Object[0], this, f48925d, false, 46478, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48925d, false, 46478, new Class[0], Void.TYPE);
        } else {
            com.ss.android.ugc.aweme.friends.friendlist.repository.c cVar = this.f48926e;
            if (PatchProxy.isSupport(new Object[0], cVar, com.ss.android.ugc.aweme.friends.friendlist.repository.c.f48944a, false, 46551, new Class[0], Observable.class)) {
                observable = (Observable) PatchProxy.accessDispatch(new Object[0], cVar, com.ss.android.ugc.aweme.friends.friendlist.repository.c.f48944a, false, 46551, new Class[0], Observable.class);
            } else {
                observable = cVar.f48946c.a().a(true, (com.bytedance.jedi.model.c.d<?, ?>[]) new com.bytedance.jedi.model.c.d[]{cVar.f48945b.a()});
            }
            Disposable subscribe = observable.map(g.f48932b).subscribe(new h(this), i.f48935a);
            Intrinsics.checkExpressionValueIsNotNull(subscribe, "repo.observeFriendList()… }\n                }, {})");
            a(subscribe);
        }
        this.friendListMiddleware.refresh();
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f48925d, false, 46474, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f48925d, false, 46474, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        c(new c(z));
    }

    public final List<com.ss.android.ugc.aweme.friends.adapter.c> a(@NotNull List<? extends User> list) {
        com.ss.android.ugc.aweme.friends.adapter.c cVar;
        if (PatchProxy.isSupport(new Object[]{list}, this, f48925d, false, 46476, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list}, this, f48925d, false, 46476, new Class[]{List.class}, List.class);
        }
        Iterable<User> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (User user : iterable) {
            if (PatchProxy.isSupport(new Object[]{user}, this, f48925d, false, 46477, new Class[]{User.class}, com.ss.android.ugc.aweme.friends.adapter.c.class)) {
                cVar = (com.ss.android.ugc.aweme.friends.adapter.c) PatchProxy.accessDispatch(new Object[]{user}, this, f48925d, false, 46477, new Class[]{User.class}, com.ss.android.ugc.aweme.friends.adapter.c.class);
            } else {
                com.ss.android.ugc.aweme.friends.adapter.c cVar2 = new com.ss.android.ugc.aweme.friends.adapter.c();
                com.ss.android.ugc.aweme.friends.adapter.b a2 = com.ss.android.ugc.aweme.friends.adapter.b.a();
                String a3 = a2.a(user);
                String a4 = a2.a(a3);
                cVar2.setFinalName(a3);
                cVar2.setFinalNamePinyin(a4);
                cVar2.setSortLetters(ah.d(a4));
                cVar2.setUser(user);
                cVar = cVar2;
            }
            arrayList.add(cVar);
        }
        return (List) arrayList;
    }
}

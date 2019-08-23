package com.ss.android.ugc.aweme.friends.recommendlist.viewmodel;

import android.text.TextUtils;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ad;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.k;
import com.bytedance.jedi.arch.x;
import com.bytedance.jedi.codegen.anno.Bind;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.discover.model.SearchUserList;
import com.ss.android.ugc.aweme.u.aa;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0014J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0014J\b\u0010\u0012\u001a\u00020\u000eH\u0014J\u0006\u0010\u0013\u001a\u00020\u000eJ\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018R8\u0010\u0004\u001a$\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006`\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/SearchUserListViewModel;", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/SearchUserListState;", "()V", "searchUserListMiddleware", "Lcom/bytedance/jedi/arch/ext/list/ListMiddleware;", "Lcom/ss/android/ugc/aweme/discover/model/SearchUser;", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "Lcom/bytedance/jedi/arch/ext/list/CommonListMiddleware;", "getSearchUserListMiddleware", "()Lcom/bytedance/jedi/arch/ext/list/ListMiddleware;", "searchUserRepository", "Lcom/ss/android/ugc/aweme/friends/recommendlist/repository/SearchUserRepository;", "clearListState", "", "defaultState", "observerSearchUserList", "onCleared", "onStart", "refresh", "startSearch", "", "updateSearchKeyWord", "keyword", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchUserListViewModel extends JediViewModel<SearchUserListState> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f49040d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.friends.recommendlist.repository.h f49041e = new com.ss.android.ugc.aweme.friends.recommendlist.repository.h();
    @NotNull
    @Bind
    public final ListMiddleware<SearchUserListState, SearchUser, k> searchUserListMiddleware = new ListMiddleware<>(new a(this), new b(new h(this)), com.bytedance.jedi.arch.ext.list.j.a(), com.bytedance.jedi.arch.ext.list.j.b());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001av\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002 \u0006*:\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0007*\u00020\b\"\u0004\b\u0001\u0010\u00042\u0006\u0010\t\u001a\u0002H\u0007H\n¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "T", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "kotlin.jvm.PlatformType", "S", "Lcom/bytedance/jedi/arch/State;", "it", "invoke", "(Lcom/bytedance/jedi/arch/State;)Lio/reactivex/Observable;", "com/bytedance/jedi/arch/ext/list/SimpleListMiddlewareKt$SingleListMiddleware$1"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function1<SearchUserListState, Observable<Pair<? extends List<? extends SearchUser>, ? extends k>>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SearchUserListViewModel this$0;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/discover/model/SearchUserList;", "kotlin.jvm.PlatformType", "accept", "com/ss/android/ugc/aweme/friends/recommendlist/viewmodel/SearchUserListViewModel$searchUserListMiddleware$1$1"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.SearchUserListViewModel$a$a  reason: collision with other inner class name */
        static final class C0586a<T> implements Consumer<SearchUserList> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49042a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ SearchUserListState f49043b;

            C0586a(SearchUserListState searchUserListState) {
                this.f49043b = searchUserListState;
            }

            public final /* synthetic */ void accept(Object obj) {
                SearchUserList searchUserList = (SearchUserList) obj;
                if (PatchProxy.isSupport(new Object[]{searchUserList}, this, f49042a, false, 46882, new Class[]{SearchUserList.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{searchUserList}, this, f49042a, false, 46882, new Class[]{SearchUserList.class}, Void.TYPE);
                    return;
                }
                com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
                com.ss.android.ugc.aweme.app.d.d a3 = a2.a("enter_from", "find_friends").a("search_keyword", this.f49043b.getSearchKeyWord());
                Gson gson = new Gson();
                Intrinsics.checkExpressionValueIsNotNull(searchUserList, AdvanceSetting.NETWORK_TYPE);
                a3.a("log_pb", gson.toJson((Object) searchUserList.logPb));
                r.a("search_user", aa.a(a2.f34114b));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(SearchUserListViewModel searchUserListViewModel) {
            super(1);
            this.this$0 = searchUserListViewModel;
        }

        public final Observable<Pair<List<SearchUser>, k>> invoke(@NotNull SearchUserListState searchUserListState) {
            SearchUserListState searchUserListState2 = searchUserListState;
            if (PatchProxy.isSupport(new Object[]{searchUserListState2}, this, changeQuickRedirect, false, 46881, new Class[]{x.class}, Observable.class)) {
                return (Observable) PatchProxy.accessDispatch(new Object[]{searchUserListState2}, this, changeQuickRedirect, false, 46881, new Class[]{x.class}, Observable.class);
            }
            Intrinsics.checkParameterIsNotNull(searchUserListState2, AdvanceSetting.NETWORK_TYPE);
            SearchUserListState searchUserListState3 = searchUserListState2;
            Single map = this.this$0.f49041e.a(0, searchUserListState3.getSearchKeyWord(), 10, 1, 1, 0, "find_friends").doAfterSuccess(new C0586a(searchUserListState3)).map(g.f49049b);
            Intrinsics.checkExpressionValueIsNotNull(map, "searchUserRepository.sea…      )\n                }");
            Observable<Pair<List<SearchUser>, k>> observable = map.toObservable();
            Intrinsics.checkExpressionValueIsNotNull(observable, "actualRefresh(it).toObservable()");
            return observable;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001av\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002 \u0006*:\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0007*\u00020\b\"\u0004\b\u0001\u0010\u00042\u0006\u0010\t\u001a\u0002H\u0007H\n¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "T", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "kotlin.jvm.PlatformType", "S", "Lcom/bytedance/jedi/arch/State;", "state", "invoke", "(Lcom/bytedance/jedi/arch/State;)Lio/reactivex/Observable;", "com/bytedance/jedi/arch/ext/list/SimpleListMiddlewareKt$SingleListMiddleware$2$1"}, k = 3, mv = {1, 1, 15})
    public static final class b extends Lambda implements Function1<SearchUserListState, Observable<Pair<? extends List<? extends SearchUser>, ? extends k>>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Function1 $loadMore;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Function1 function1) {
            super(1);
            this.$loadMore = function1;
        }

        public final Observable<Pair<List<SearchUser>, k>> invoke(@NotNull SearchUserListState searchUserListState) {
            SearchUserListState searchUserListState2 = searchUserListState;
            if (PatchProxy.isSupport(new Object[]{searchUserListState2}, this, changeQuickRedirect, false, 46883, new Class[]{x.class}, Observable.class)) {
                return (Observable) PatchProxy.accessDispatch(new Object[]{searchUserListState2}, this, changeQuickRedirect, false, 46883, new Class[]{x.class}, Observable.class);
            }
            Intrinsics.checkParameterIsNotNull(searchUserListState2, "state");
            return ((Single) this.$loadMore.invoke(searchUserListState2)).toObservable();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/SearchUserListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function1<SearchUserListState, SearchUserListState> {
        public static final c INSTANCE = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
            super(1);
        }

        @NotNull
        public final SearchUserListState invoke(@NotNull SearchUserListState searchUserListState) {
            SearchUserListState searchUserListState2 = searchUserListState;
            if (PatchProxy.isSupport(new Object[]{searchUserListState2}, this, changeQuickRedirect, false, 46884, new Class[]{SearchUserListState.class}, SearchUserListState.class)) {
                return (SearchUserListState) PatchProxy.accessDispatch(new Object[]{searchUserListState2}, this, changeQuickRedirect, false, 46884, new Class[]{SearchUserListState.class}, SearchUserListState.class);
            }
            Intrinsics.checkParameterIsNotNull(searchUserListState2, "$receiver");
            return SearchUserListState.copy$default(searchUserListState, null, false, null, ListState.copy$default(searchUserListState.getSearchUserList(), new k(false, 0, 3), CollectionsKt.emptyList(), ad.f21345a, ad.f21345a, null, 16, null), 7, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001av\u00124\u00122\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004 \u0006*\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0018\u00010\u00020\u0002 \u0006*:\u00124\u00122\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004 \u0006*\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012 \u0010\u0007\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00020\u0004H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "", "Lcom/ss/android/ugc/aweme/discover/model/SearchUser;", "kotlin.jvm.PlatformType", "list", "apply"}, k = 3, mv = {1, 1, 15})
    static final class d<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49044a;

        /* renamed from: b  reason: collision with root package name */
        public static final d f49045b = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            if (PatchProxy.isSupport(new Object[]{list}, this, f49044a, false, 46885, new Class[]{List.class}, Observable.class)) {
                return (Observable) PatchProxy.accessDispatch(new Object[]{list}, this, f49044a, false, 46885, new Class[]{List.class}, Observable.class);
            }
            Intrinsics.checkParameterIsNotNull(list, "list");
            return Observable.fromIterable(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004 \u0006*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "pair", "Lkotlin/Pair;", "", "Lcom/ss/android/ugc/aweme/discover/model/SearchUser;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 15})
    static final class e<T> implements Consumer<Pair<? extends Unit, ? extends List<? extends SearchUser>>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49046a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchUserListViewModel f49047b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/SearchUserListState;", "invoke"}, k = 3, mv = {1, 1, 15})
        static final class a extends Lambda implements Function1<SearchUserListState, SearchUserListState> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ List $list;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(List list) {
                super(1);
                this.$list = list;
            }

            @NotNull
            public final SearchUserListState invoke(@NotNull SearchUserListState searchUserListState) {
                SearchUserListState searchUserListState2 = searchUserListState;
                if (PatchProxy.isSupport(new Object[]{searchUserListState2}, this, changeQuickRedirect, false, 46887, new Class[]{SearchUserListState.class}, SearchUserListState.class)) {
                    return (SearchUserListState) PatchProxy.accessDispatch(new Object[]{searchUserListState2}, this, changeQuickRedirect, false, 46887, new Class[]{SearchUserListState.class}, SearchUserListState.class);
                }
                Intrinsics.checkParameterIsNotNull(searchUserListState2, "$receiver");
                return SearchUserListState.copy$default(searchUserListState, null, false, null, ListState.copy$default(searchUserListState.getSearchUserList(), null, this.$list, null, null, null, 29, null), 7, null);
            }
        }

        e(SearchUserListViewModel searchUserListViewModel) {
            this.f49047b = searchUserListViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            Pair pair = (Pair) obj;
            if (PatchProxy.isSupport(new Object[]{pair}, this, f49046a, false, 46886, new Class[]{Pair.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{pair}, this, f49046a, false, 46886, new Class[]{Pair.class}, Void.TYPE);
                return;
            }
            List list = (List) pair.getSecond();
            if (list != null) {
                this.f49047b.c(new a(list));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/SearchUserListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class f extends Lambda implements Function1<SearchUserListState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SearchUserListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(SearchUserListViewModel searchUserListViewModel) {
            super(1);
            this.this$0 = searchUserListViewModel;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SearchUserListState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull SearchUserListState searchUserListState) {
            SearchUserListState searchUserListState2 = searchUserListState;
            if (PatchProxy.isSupport(new Object[]{searchUserListState2}, this, changeQuickRedirect, false, 46888, new Class[]{SearchUserListState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{searchUserListState2}, this, changeQuickRedirect, false, 46888, new Class[]{SearchUserListState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(searchUserListState2, AdvanceSetting.NETWORK_TYPE);
            if (!TextUtils.isEmpty(searchUserListState.getSearchKeyWord())) {
                this.this$0.searchUserListMiddleware.refresh();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u001c\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0002\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lcom/ss/android/ugc/aweme/discover/model/SearchUser;", "kotlin.jvm.PlatformType", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "it", "Lcom/ss/android/ugc/aweme/discover/model/SearchUserList;", "apply"}, k = 3, mv = {1, 1, 15})
    static final class g<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49048a;

        /* renamed from: b  reason: collision with root package name */
        public static final g f49049b = new g();

        g() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            SearchUserList searchUserList = (SearchUserList) obj;
            if (PatchProxy.isSupport(new Object[]{searchUserList}, this, f49048a, false, 46889, new Class[]{SearchUserList.class}, Pair.class)) {
                return (Pair) PatchProxy.accessDispatch(new Object[]{searchUserList}, this, f49048a, false, 46889, new Class[]{SearchUserList.class}, Pair.class);
            }
            Intrinsics.checkParameterIsNotNull(searchUserList, AdvanceSetting.NETWORK_TYPE);
            List<SearchUser> list = searchUserList.userList;
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            return TuplesKt.to(list, new k(searchUserList.hasMore, searchUserList.cursor));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001av\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002 \u0006*:\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lkotlin/Pair;", "", "Lcom/ss/android/ugc/aweme/discover/model/SearchUser;", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "kotlin.jvm.PlatformType", "state", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/SearchUserListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function1<SearchUserListState, Single<Pair<? extends List<? extends SearchUser>, ? extends k>>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SearchUserListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(SearchUserListViewModel searchUserListViewModel) {
            super(1);
            this.this$0 = searchUserListViewModel;
        }

        public final Single<Pair<List<SearchUser>, k>> invoke(@NotNull SearchUserListState searchUserListState) {
            SearchUserListState searchUserListState2 = searchUserListState;
            if (PatchProxy.isSupport(new Object[]{searchUserListState2}, this, changeQuickRedirect, false, 46890, new Class[]{SearchUserListState.class}, Single.class)) {
                return (Single) PatchProxy.accessDispatch(new Object[]{searchUserListState2}, this, changeQuickRedirect, false, 46890, new Class[]{SearchUserListState.class}, Single.class);
            }
            Intrinsics.checkParameterIsNotNull(searchUserListState2, "state");
            Single<Pair<List<SearchUser>, k>> map = this.this$0.f49041e.a((long) searchUserListState.getSearchUserList().getPayload().f21388b, searchUserListState.getSearchKeyWord(), 10, 1, 1, 0, "find_friends").map(AnonymousClass1.f49051b);
            Intrinsics.checkExpressionValueIsNotNull(map, "searchUserRepository.sea…      )\n                }");
            return map;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/SearchUserListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function1<SearchUserListState, SearchUserListState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ boolean $startSearch;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(boolean z) {
            super(1);
            this.$startSearch = z;
        }

        @NotNull
        public final SearchUserListState invoke(@NotNull SearchUserListState searchUserListState) {
            SearchUserListState searchUserListState2 = searchUserListState;
            if (PatchProxy.isSupport(new Object[]{searchUserListState2}, this, changeQuickRedirect, false, 46892, new Class[]{SearchUserListState.class}, SearchUserListState.class)) {
                return (SearchUserListState) PatchProxy.accessDispatch(new Object[]{searchUserListState2}, this, changeQuickRedirect, false, 46892, new Class[]{SearchUserListState.class}, SearchUserListState.class);
            }
            Intrinsics.checkParameterIsNotNull(searchUserListState2, "$receiver");
            return SearchUserListState.copy$default(searchUserListState, null, this.$startSearch, null, null, 13, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/SearchUserListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function1<SearchUserListState, SearchUserListState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ String $keyword;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(String str) {
            super(1);
            this.$keyword = str;
        }

        @NotNull
        public final SearchUserListState invoke(@NotNull SearchUserListState searchUserListState) {
            SearchUserListState searchUserListState2 = searchUserListState;
            if (PatchProxy.isSupport(new Object[]{searchUserListState2}, this, changeQuickRedirect, false, 46893, new Class[]{SearchUserListState.class}, SearchUserListState.class)) {
                return (SearchUserListState) PatchProxy.accessDispatch(new Object[]{searchUserListState2}, this, changeQuickRedirect, false, 46893, new Class[]{SearchUserListState.class}, SearchUserListState.class);
            }
            Intrinsics.checkParameterIsNotNull(searchUserListState2, "$receiver");
            return SearchUserListState.copy$default(searchUserListState, this.$keyword, false, null, null, 14, null);
        }
    }

    private final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f49040d, false, 46878, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49040d, false, 46878, new Class[0], Void.TYPE);
            return;
        }
        c(c.INSTANCE);
    }

    public final /* synthetic */ x c() {
        SearchUserListState searchUserListState;
        if (PatchProxy.isSupport(new Object[0], this, f49040d, false, 46873, new Class[0], SearchUserListState.class)) {
            searchUserListState = (SearchUserListState) PatchProxy.accessDispatch(new Object[0], this, f49040d, false, 46873, new Class[0], SearchUserListState.class);
        } else {
            searchUserListState = new SearchUserListState(null, false, null, null, 15, null);
        }
        return searchUserListState;
    }

    public final void onCleared() {
        if (PatchProxy.isSupport(new Object[0], this, f49040d, false, 46879, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49040d, false, 46879, new Class[0], Void.TYPE);
            return;
        }
        super.onCleared();
        this.f49041e.a();
    }

    public final void d() {
        Observable observable;
        if (PatchProxy.isSupport(new Object[0], this, f49040d, false, 46874, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49040d, false, 46874, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        new SearchUserListViewModelMiddlewareBinding().binding(this);
        if (PatchProxy.isSupport(new Object[0], this, f49040d, false, 46880, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49040d, false, 46880, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.friends.recommendlist.repository.h hVar = this.f49041e;
        if (PatchProxy.isSupport(new Object[0], hVar, com.ss.android.ugc.aweme.friends.recommendlist.repository.h.f49006a, false, 46781, new Class[0], Observable.class)) {
            observable = (Observable) PatchProxy.accessDispatch(new Object[0], hVar, com.ss.android.ugc.aweme.friends.recommendlist.repository.h.f49006a, false, 46781, new Class[0], Observable.class);
        } else {
            observable = hVar.f49008c.a().a(true, (com.bytedance.jedi.model.c.d<?, ?>[]) new com.bytedance.jedi.model.c.d[]{hVar.f49007b.a()});
        }
        Disposable subscribe = observable.flatMap(d.f49045b).subscribe((Consumer<? super T>) new e<Object>(this));
        Intrinsics.checkExpressionValueIsNotNull(subscribe, "searchUserRepository.obs…          }\n            }");
        a(subscribe);
    }

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f49040d, false, 46877, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f49040d, false, 46877, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "keyword");
        if (TextUtils.isEmpty(str2)) {
            e();
        }
        c(new j(str2));
    }

    public final void a(boolean z) {
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f49040d, false, 46875, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f49040d, false, 46875, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!z2) {
            e();
        }
        c(new i(z2));
    }
}

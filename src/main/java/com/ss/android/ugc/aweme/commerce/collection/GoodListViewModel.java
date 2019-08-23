package com.ss.android.ugc.aweme.commerce.collection;

import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.k;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0014J\u0006\u0010\u0017\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0005J\b\u0010\u0019\u001a\u00020\u0015H\u0014J\u0006\u0010\u001a\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R3\u0010\r\u001a$\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000ej\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f`\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/collection/GoodListViewModel;", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/ss/android/ugc/aweme/commerce/collection/GoodListState;", "()V", "dataInitialized", "", "firstResume", "isEmpty", "()Z", "setEmpty", "(Z)V", "mRepo", "Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGoodRepository;", "middleWare", "Lcom/bytedance/jedi/arch/ext/list/ListMiddleware;", "Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGood;", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "Lcom/bytedance/jedi/arch/ext/list/CommonListMiddleware;", "getMiddleWare", "()Lcom/bytedance/jedi/arch/ext/list/ListMiddleware;", "bind", "", "defaultState", "initData", "needRefresh", "onStart", "refresh", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GoodListViewModel extends JediViewModel<GoodListState> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f36851d;
    public static final c i = new c((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public final b f36852e = new b();

    /* renamed from: f  reason: collision with root package name */
    public boolean f36853f = true;
    boolean g = true;
    @NotNull
    public final ListMiddleware<GoodListState, CollectionGood, k> h = new ListMiddleware<>(new a(this), new b(new e(this)), new f(this), g.INSTANCE);
    private boolean j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001av\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002 \u0006*:\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0007*\u00020\b\"\u0004\b\u0001\u0010\u00042\u0006\u0010\t\u001a\u0002H\u0007H\n¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "T", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "kotlin.jvm.PlatformType", "S", "Lcom/bytedance/jedi/arch/State;", "it", "invoke", "(Lcom/bytedance/jedi/arch/State;)Lio/reactivex/Observable;", "com/bytedance/jedi/arch/ext/list/SimpleListMiddlewareKt$SingleListMiddleware$1"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function1<GoodListState, Observable<Pair<? extends List<? extends CollectionGood>, ? extends k>>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GoodListViewModel this$0;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGood;", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "resp", "Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGoodResponse;", "apply", "com/ss/android/ugc/aweme/commerce/collection/GoodListViewModel$middleWare$1$1"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.commerce.collection.GoodListViewModel$a$a  reason: collision with other inner class name */
        static final class C0464a<T, R> implements Function<T, R> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36854a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f36855b;

            C0464a(int i) {
                this.f36855b = i;
            }

            public final /* synthetic */ Object apply(Object obj) {
                k kVar;
                c cVar = (c) obj;
                if (PatchProxy.isSupport(new Object[]{cVar}, this, f36854a, false, 28087, new Class[]{c.class}, Pair.class)) {
                    return (Pair) PatchProxy.accessDispatch(new Object[]{cVar}, this, f36854a, false, 28087, new Class[]{c.class}, Pair.class);
                }
                Intrinsics.checkParameterIsNotNull(cVar, "resp");
                List<CollectionGood> list = cVar.f36886b;
                if (cVar.a()) {
                    kVar = new k(cVar.f36887c, this.f36855b + 20);
                } else {
                    kVar = new k(false, this.f36855b + 20);
                }
                return TuplesKt.to(list, kVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(GoodListViewModel goodListViewModel) {
            super(1);
            this.this$0 = goodListViewModel;
        }

        public final Observable<Pair<List<CollectionGood>, k>> invoke(@NotNull GoodListState goodListState) {
            if (PatchProxy.isSupport(new Object[]{goodListState}, this, changeQuickRedirect, false, 28086, new Class[]{x.class}, Observable.class)) {
                return (Observable) PatchProxy.accessDispatch(new Object[]{goodListState}, this, changeQuickRedirect, false, 28086, new Class[]{x.class}, Observable.class);
            }
            Intrinsics.checkParameterIsNotNull(goodListState, AdvanceSetting.NETWORK_TYPE);
            this.this$0.f36853f = true;
            Single map = this.this$0.f36852e.a(0, 20).map(new C0464a(goodListState.getListState().getPayload().f21388b));
            Intrinsics.checkExpressionValueIsNotNull(map, "mRepo.queryCollectionGoo…  }\n                    }");
            Observable<Pair<List<CollectionGood>, k>> observable = map.toObservable();
            Intrinsics.checkExpressionValueIsNotNull(observable, "actualRefresh(it).toObservable()");
            return observable;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001av\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002 \u0006*:\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0007*\u00020\b\"\u0004\b\u0001\u0010\u00042\u0006\u0010\t\u001a\u0002H\u0007H\n¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "T", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "kotlin.jvm.PlatformType", "S", "Lcom/bytedance/jedi/arch/State;", "state", "invoke", "(Lcom/bytedance/jedi/arch/State;)Lio/reactivex/Observable;", "com/bytedance/jedi/arch/ext/list/SimpleListMiddlewareKt$SingleListMiddleware$2$1"}, k = 3, mv = {1, 1, 15})
    public static final class b extends Lambda implements Function1<GoodListState, Observable<Pair<? extends List<? extends CollectionGood>, ? extends k>>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Function1 $loadMore;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Function1 function1) {
            super(1);
            this.$loadMore = function1;
        }

        public final Observable<Pair<List<CollectionGood>, k>> invoke(@NotNull GoodListState goodListState) {
            GoodListState goodListState2 = goodListState;
            if (PatchProxy.isSupport(new Object[]{goodListState2}, this, changeQuickRedirect, false, 28088, new Class[]{x.class}, Observable.class)) {
                return (Observable) PatchProxy.accessDispatch(new Object[]{goodListState2}, this, changeQuickRedirect, false, 28088, new Class[]{x.class}, Observable.class);
            }
            Intrinsics.checkParameterIsNotNull(goodListState2, "state");
            return ((Single) this.$loadMore.invoke(goodListState2)).toObservable();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/collection/GoodListViewModel$Companion;", "", "()V", "count", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/commerce/collection/GoodListState;", "it", "Lcom/bytedance/jedi/arch/ext/list/ListState;", "Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGood;", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function2<GoodListState, ListState<CollectionGood, k>, GoodListState> {
        public static final d INSTANCE = new d();
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
            super(2);
        }

        @NotNull
        public final GoodListState invoke(@NotNull GoodListState goodListState, @NotNull ListState<CollectionGood, k> listState) {
            GoodListState goodListState2 = goodListState;
            ListState<CollectionGood, k> listState2 = listState;
            if (PatchProxy.isSupport(new Object[]{goodListState2, listState2}, this, changeQuickRedirect, false, 28091, new Class[]{GoodListState.class, ListState.class}, GoodListState.class)) {
                return (GoodListState) PatchProxy.accessDispatch(new Object[]{goodListState2, listState2}, this, changeQuickRedirect, false, 28091, new Class[]{GoodListState.class, ListState.class}, GoodListState.class);
            }
            Intrinsics.checkParameterIsNotNull(goodListState2, "$receiver");
            Intrinsics.checkParameterIsNotNull(listState2, AdvanceSetting.NETWORK_TYPE);
            return goodListState.copy(listState);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001av\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002 \u0006*:\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lkotlin/Pair;", "", "Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGood;", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "kotlin.jvm.PlatformType", "state", "Lcom/ss/android/ugc/aweme/commerce/collection/GoodListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function1<GoodListState, Single<Pair<? extends List<? extends CollectionGood>, ? extends k>>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GoodListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(GoodListViewModel goodListViewModel) {
            super(1);
            this.this$0 = goodListViewModel;
        }

        public final Single<Pair<List<CollectionGood>, k>> invoke(@NotNull GoodListState goodListState) {
            GoodListState goodListState2 = goodListState;
            if (PatchProxy.isSupport(new Object[]{goodListState2}, this, changeQuickRedirect, false, 28092, new Class[]{GoodListState.class}, Single.class)) {
                return (Single) PatchProxy.accessDispatch(new Object[]{goodListState2}, this, changeQuickRedirect, false, 28092, new Class[]{GoodListState.class}, Single.class);
            }
            Intrinsics.checkParameterIsNotNull(goodListState2, "state");
            final int i = goodListState.getListState().getPayload().f21388b;
            Single<Pair<List<CollectionGood>, k>> map = this.this$0.f36852e.a(i, 20).map(new Function<T, R>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f36856a;

                public final /* synthetic */ Object apply(Object obj) {
                    k kVar;
                    c cVar = (c) obj;
                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f36856a, false, 28093, new Class[]{c.class}, Pair.class)) {
                        return (Pair) PatchProxy.accessDispatch(new Object[]{cVar}, this, f36856a, false, 28093, new Class[]{c.class}, Pair.class);
                    }
                    Intrinsics.checkParameterIsNotNull(cVar, "resp");
                    List<CollectionGood> list = cVar.f36886b;
                    if (cVar.a()) {
                        kVar = new k(cVar.f36887c, i + 20);
                    } else {
                        kVar = new k(false, i + 20);
                    }
                    return TuplesKt.to(list, kVar);
                }
            });
            Intrinsics.checkExpressionValueIsNotNull(map, "mRepo.queryCollectionGoo…  }\n                    }");
            return map;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGood;", "list", "refresh", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function2<List<? extends CollectionGood>, List<? extends CollectionGood>, List<? extends CollectionGood>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ GoodListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(GoodListViewModel goodListViewModel) {
            super(2);
            this.this$0 = goodListViewModel;
        }

        @NotNull
        public final List<CollectionGood> invoke(@NotNull List<CollectionGood> list, @NotNull List<CollectionGood> list2) {
            List<CollectionGood> list3 = list;
            List<CollectionGood> list4 = list2;
            if (PatchProxy.isSupport(new Object[]{list3, list4}, this, changeQuickRedirect, false, 28094, new Class[]{List.class, List.class}, List.class)) {
                return (List) PatchProxy.accessDispatch(new Object[]{list3, list4}, this, changeQuickRedirect, false, 28094, new Class[]{List.class, List.class}, List.class);
            }
            Intrinsics.checkParameterIsNotNull(list3, "list");
            Intrinsics.checkParameterIsNotNull(list4, "refresh");
            if (!list4.isEmpty()) {
                this.this$0.f36853f = false;
                return list4;
            }
            return list3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGood;", "list", "", "loadMore", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function2<List<? extends CollectionGood>, List<? extends CollectionGood>, List<CollectionGood>> {
        public static final g INSTANCE = new g();
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
            super(2);
        }

        @NotNull
        public final List<CollectionGood> invoke(@NotNull List<CollectionGood> list, @NotNull List<CollectionGood> list2) {
            List<CollectionGood> list3 = list;
            List<CollectionGood> list4 = list2;
            if (PatchProxy.isSupport(new Object[]{list3, list4}, this, changeQuickRedirect, false, 28095, new Class[]{List.class, List.class}, List.class)) {
                return (List) PatchProxy.accessDispatch(new Object[]{list3, list4}, this, changeQuickRedirect, false, 28095, new Class[]{List.class, List.class}, List.class);
            }
            Intrinsics.checkParameterIsNotNull(list3, "list");
            Intrinsics.checkParameterIsNotNull(list4, "loadMore");
            List<CollectionGood> arrayList = new ArrayList<>();
            arrayList.addAll(list3);
            arrayList.addAll(list4);
            return arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/commerce/collection/GoodListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function1<GoodListState, GoodListState> {
        public static final h INSTANCE = new h();
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
            super(1);
        }

        @NotNull
        public final GoodListState invoke(@NotNull GoodListState goodListState) {
            GoodListState goodListState2 = goodListState;
            if (PatchProxy.isSupport(new Object[]{goodListState2}, this, changeQuickRedirect, false, 28096, new Class[]{GoodListState.class}, GoodListState.class)) {
                return (GoodListState) PatchProxy.accessDispatch(new Object[]{goodListState2}, this, changeQuickRedirect, false, 28096, new Class[]{GoodListState.class}, GoodListState.class);
            }
            Intrinsics.checkParameterIsNotNull(goodListState2, "$receiver");
            ListState listState = new ListState(new k(false, 0, 3), null, null, null, null, 30, null);
            return new GoodListState(listState);
        }
    }

    public final /* synthetic */ x c() {
        GoodListState goodListState;
        if (PatchProxy.isSupport(new Object[0], this, f36851d, false, 28085, new Class[0], GoodListState.class)) {
            goodListState = (GoodListState) PatchProxy.accessDispatch(new Object[0], this, f36851d, false, 28085, new Class[0], GoodListState.class);
        } else {
            goodListState = new GoodListState(null, 1, null);
        }
        return goodListState;
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f36851d, false, 28083, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36851d, false, 28083, new Class[0], Void.TYPE);
            return;
        }
        if (!this.j) {
            this.j = true;
            this.h.refresh();
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f36851d, false, 28081, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36851d, false, 28081, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        if (PatchProxy.isSupport(new Object[0], this, f36851d, false, 28084, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36851d, false, 28084, new Class[0], Void.TYPE);
            return;
        }
        ListMiddleware<GoodListState, CollectionGood, k> listMiddleware = this.h;
        listMiddleware.a(d.INSTANCE, (Function2<? super S, ? super PROP, ? extends S>) d.INSTANCE);
        a(listMiddleware);
    }
}

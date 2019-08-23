package com.ss.android.ugc.aweme.following.ui.viewmodel;

import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.j;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.following.repository.i;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u001e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013J\b\u0010\u0015\u001a\u00020\u0002H\u0014J \u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0002J\b\u0010\u001a\u001a\u00020\u000fH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R#\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowingRelationViewModel;", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowingRelationState;", "()V", "mRefreshing", "", "mRepo", "Lcom/ss/android/ugc/aweme/following/repository/FollowingRelationRepository;", "middleWare", "Lcom/bytedance/jedi/arch/ext/list/ListMiddleware;", "Lcom/ss/android/ugc/aweme/profile/model/User;", "Lcom/ss/android/ugc/aweme/following/repository/RelationPayload;", "getMiddleWare", "()Lcom/bytedance/jedi/arch/ext/list/ListMiddleware;", "bind", "", "checkNeedAnotherFetch", "hasMore", "loadTime", "", "lastLoadSize", "defaultState", "getSourceType", "isRefresh", "isSelf", "recommendHasMore", "onStart", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FollowingRelationViewModel extends JediViewModel<FollowingRelationState> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f48201d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.following.repository.e f48202e = new com.ss.android.ugc.aweme.following.repository.e();

    /* renamed from: f  reason: collision with root package name */
    public boolean f48203f = true;
    @NotNull
    public final ListMiddleware<FollowingRelationState, User, i> g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001av\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u0005\u0018\u00010\u00020\u0002 \u0006*:\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u0005\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0007*\u00020\b\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\u0004\"\b\b\u0003\u0010\u0005*\u00020\n2\u0006\u0010\u000b\u001a\u0002H\u0007H\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "T", "P", "kotlin.jvm.PlatformType", "S", "Lcom/bytedance/jedi/arch/State;", "RESP", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "state", "invoke", "(Lcom/bytedance/jedi/arch/State;)Lio/reactivex/Observable;", "com/bytedance/jedi/arch/ext/list/ListMiddlewareLegeciesKt$ListMiddleware$2"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function1<FollowingRelationState, Observable<Pair<? extends List<? extends User>, ? extends i>>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Function1 $listMapper;
        final /* synthetic */ Function2 $payloadMapper;
        final /* synthetic */ FollowingRelationViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, Function2 function2, FollowingRelationViewModel followingRelationViewModel) {
            super(1);
            this.$listMapper = function1;
            this.$payloadMapper = function2;
            this.this$0 = followingRelationViewModel;
        }

        public final Observable<Pair<List<User>, i>> invoke(@NotNull FollowingRelationState followingRelationState) {
            final FollowingRelationState followingRelationState2 = followingRelationState;
            if (PatchProxy.isSupport(new Object[]{followingRelationState2}, this, changeQuickRedirect, false, 45260, new Class[]{x.class}, Observable.class)) {
                return (Observable) PatchProxy.accessDispatch(new Object[]{followingRelationState2}, this, changeQuickRedirect, false, 45260, new Class[]{x.class}, Observable.class);
            }
            Intrinsics.checkParameterIsNotNull(followingRelationState2, "state");
            FollowingRelationState followingRelationState3 = followingRelationState2;
            this.this$0.f48203f = true;
            Single subscribeOn = this.this$0.f48202e.a(followingRelationState3.getUserId(), 0, 20, 0, this.this$0.a(true, followingRelationState3.isSelf(), true), com.ss.android.ugc.aweme.utils.permission.e.a(), com.ss.android.ugc.aweme.utils.permission.e.b()).subscribeOn(Schedulers.io());
            Intrinsics.checkExpressionValueIsNotNull(subscribeOn, "mRepo.queryFollowingList…scribeOn(Schedulers.io())");
            Observable<Pair<List<User>, i>> map = subscribeOn.toObservable().map(new Function<T, R>(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f48204a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ a f48205b;

                {
                    this.f48205b = r1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    if (!PatchProxy.isSupport(new Object[]{obj}, this, f48204a, false, 45261, new Class[]{Object.class}, Pair.class)) {
                        return TuplesKt.to(this.f48205b.$listMapper.invoke(obj), this.f48205b.$payloadMapper.invoke(followingRelationState2, obj));
                    }
                    return (Pair) PatchProxy.accessDispatch(new Object[]{obj}, this, f48204a, false, 45261, new Class[]{Object.class}, Pair.class);
                }
            });
            Intrinsics.checkExpressionValueIsNotNull(map, "actualRefresh(state).toO…yloadMapper(state, it)) }");
            return map;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001av\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u0005\u0018\u00010\u00020\u0002 \u0006*:\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u0005\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0007*\u00020\b\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\u0004\"\b\b\u0003\u0010\u0005*\u00020\n2\u0006\u0010\u000b\u001a\u0002H\u0007H\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "T", "P", "kotlin.jvm.PlatformType", "S", "Lcom/bytedance/jedi/arch/State;", "RESP", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "state", "invoke", "(Lcom/bytedance/jedi/arch/State;)Lio/reactivex/Observable;", "com/bytedance/jedi/arch/ext/list/ListMiddlewareLegeciesKt$ListMiddleware$3$1", "com/bytedance/jedi/arch/ext/list/ListMiddlewareLegeciesKt$ListMiddleware$$inlined$let$lambda$6"}, k = 3, mv = {1, 1, 15})
    public static final class b extends Lambda implements Function1<FollowingRelationState, Observable<Pair<? extends List<? extends User>, ? extends i>>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Function1 $listMapper$inlined;
        final /* synthetic */ Function1 $loadMore;
        final /* synthetic */ Function2 $payloadMapper$inlined;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, Function1 function12, Function2 function2) {
            super(1);
            this.$loadMore = function1;
            this.$listMapper$inlined = function12;
            this.$payloadMapper$inlined = function2;
        }

        public final Observable<Pair<List<User>, i>> invoke(@NotNull final FollowingRelationState followingRelationState) {
            if (PatchProxy.isSupport(new Object[]{followingRelationState}, this, changeQuickRedirect, false, 45262, new Class[]{x.class}, Observable.class)) {
                return (Observable) PatchProxy.accessDispatch(new Object[]{followingRelationState}, this, changeQuickRedirect, false, 45262, new Class[]{x.class}, Observable.class);
            }
            Intrinsics.checkParameterIsNotNull(followingRelationState, "state");
            return ((Single) this.$loadMore.invoke(followingRelationState)).toObservable().map(new Function<T, R>(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f48207a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ b f48208b;

                {
                    this.f48208b = r1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    if (!PatchProxy.isSupport(new Object[]{obj}, this, f48207a, false, 45263, new Class[]{Object.class}, Pair.class)) {
                        return TuplesKt.to(this.f48208b.$listMapper$inlined.invoke(obj), this.f48208b.$payloadMapper$inlined.invoke(followingRelationState, obj));
                    }
                    return (Pair) PatchProxy.accessDispatch(new Object[]{obj}, this, f48207a, false, 45263, new Class[]{Object.class}, Pair.class);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowingRelationState;", "it", "Lcom/bytedance/jedi/arch/ext/list/ListState;", "Lcom/ss/android/ugc/aweme/profile/model/User;", "Lcom/ss/android/ugc/aweme/following/repository/RelationPayload;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function2<FollowingRelationState, ListState<User, i>, FollowingRelationState> {
        public static final c INSTANCE = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
            super(2);
        }

        @NotNull
        public final FollowingRelationState invoke(@NotNull FollowingRelationState followingRelationState, @NotNull ListState<User, i> listState) {
            FollowingRelationState followingRelationState2 = followingRelationState;
            ListState<User, i> listState2 = listState;
            if (PatchProxy.isSupport(new Object[]{followingRelationState2, listState2}, this, changeQuickRedirect, false, 45266, new Class[]{FollowingRelationState.class, ListState.class}, FollowingRelationState.class)) {
                return (FollowingRelationState) PatchProxy.accessDispatch(new Object[]{followingRelationState2, listState2}, this, changeQuickRedirect, false, 45266, new Class[]{FollowingRelationState.class, ListState.class}, FollowingRelationState.class);
            }
            Intrinsics.checkParameterIsNotNull(followingRelationState2, "$receiver");
            Intrinsics.checkParameterIsNotNull(listState2, AdvanceSetting.NETWORK_TYPE);
            return FollowingRelationState.copy$default(followingRelationState, null, false, listState, 3, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/ss/android/ugc/aweme/following/model/FollowingItemList;", "kotlin.jvm.PlatformType", "it", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowingRelationState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function1<FollowingRelationState, Single<com.ss.android.ugc.aweme.following.a.e>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FollowingRelationViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(FollowingRelationViewModel followingRelationViewModel) {
            super(1);
            this.this$0 = followingRelationViewModel;
        }

        public final Single<com.ss.android.ugc.aweme.following.a.e> invoke(@NotNull FollowingRelationState followingRelationState) {
            FollowingRelationState followingRelationState2 = followingRelationState;
            if (PatchProxy.isSupport(new Object[]{followingRelationState2}, this, changeQuickRedirect, false, 45267, new Class[]{FollowingRelationState.class}, Single.class)) {
                return (Single) PatchProxy.accessDispatch(new Object[]{followingRelationState2}, this, changeQuickRedirect, false, 45267, new Class[]{FollowingRelationState.class}, Single.class);
            }
            Intrinsics.checkParameterIsNotNull(followingRelationState2, AdvanceSetting.NETWORK_TYPE);
            this.this$0.f48203f = false;
            Single<com.ss.android.ugc.aweme.following.a.e> subscribeOn = this.this$0.f48202e.a(followingRelationState.getUserId(), ((i) followingRelationState.getListState().getPayload()).f47944c, 20, ((i) followingRelationState.getListState().getPayload()).f21388b, this.this$0.a(false, followingRelationState.isSelf(), ((i) followingRelationState.getListState().getPayload()).f47945d), com.ss.android.ugc.aweme.utils.permission.e.a(), com.ss.android.ugc.aweme.utils.permission.e.b()).subscribeOn(Schedulers.io());
            Intrinsics.checkExpressionValueIsNotNull(subscribeOn, "mRepo.queryFollowingList…scribeOn(Schedulers.io())");
            return subscribeOn;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/profile/model/User;", "kotlin.jvm.PlatformType", "", "it", "Lcom/ss/android/ugc/aweme/following/model/FollowingItemList;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function1<com.ss.android.ugc.aweme.following.a.e, List<User>> {
        public static final e INSTANCE = new e();
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
            super(1);
        }

        public final List<User> invoke(@NotNull com.ss.android.ugc.aweme.following.a.e eVar) {
            com.ss.android.ugc.aweme.following.a.e eVar2 = eVar;
            if (PatchProxy.isSupport(new Object[]{eVar2}, this, changeQuickRedirect, false, 45268, new Class[]{com.ss.android.ugc.aweme.following.a.e.class}, List.class)) {
                return (List) PatchProxy.accessDispatch(new Object[]{eVar2}, this, changeQuickRedirect, false, 45268, new Class[]{com.ss.android.ugc.aweme.following.a.e.class}, List.class);
            }
            Intrinsics.checkParameterIsNotNull(eVar2, AdvanceSetting.NETWORK_TYPE);
            List<User> list = eVar2.f47895a;
            Intrinsics.checkExpressionValueIsNotNull(list, "it.items");
            return list;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/following/repository/RelationPayload;", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowingRelationState;", "resp", "Lcom/ss/android/ugc/aweme/following/model/FollowingItemList;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function2<FollowingRelationState, com.ss.android.ugc.aweme.following.a.e, i> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FollowingRelationViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(FollowingRelationViewModel followingRelationViewModel) {
            super(2);
            this.this$0 = followingRelationViewModel;
        }

        @NotNull
        public final i invoke(@NotNull FollowingRelationState followingRelationState, @NotNull com.ss.android.ugc.aweme.following.a.e eVar) {
            int i;
            int i2;
            FollowingRelationState followingRelationState2 = followingRelationState;
            com.ss.android.ugc.aweme.following.a.e eVar2 = eVar;
            if (PatchProxy.isSupport(new Object[]{followingRelationState2, eVar2}, this, changeQuickRedirect, false, 45269, new Class[]{FollowingRelationState.class, com.ss.android.ugc.aweme.following.a.e.class}, i.class)) {
                return (i) PatchProxy.accessDispatch(new Object[]{followingRelationState2, eVar2}, this, changeQuickRedirect, false, 45269, new Class[]{FollowingRelationState.class, com.ss.android.ugc.aweme.following.a.e.class}, i.class);
            }
            Intrinsics.checkParameterIsNotNull(followingRelationState2, "$receiver");
            Intrinsics.checkParameterIsNotNull(eVar2, "resp");
            if (this.this$0.f48203f) {
                i = 1;
            } else {
                i = 1 + ((i) followingRelationState.getListState().getPayload()).f47946e;
            }
            new i(eVar2.f47896b, eVar2.f47899e, eVar2.f47898d, false, 0, 0, 56);
            boolean z = eVar2.f47896b;
            int i3 = eVar2.f47899e;
            long j = eVar2.f47898d;
            boolean z2 = eVar2.f47900f;
            List<User> list = eVar2.f47895a;
            if (list != null) {
                i2 = list.size();
            } else {
                i2 = 0;
            }
            i iVar = new i(z, i3, j, z2, i, i2);
            return iVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/profile/model/User;", "list", "", "loadMore", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function2<List<? extends User>, List<? extends User>, List<User>> {
        public static final g INSTANCE = new g();
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
            super(2);
        }

        @NotNull
        public final List<User> invoke(@NotNull List<? extends User> list, @NotNull List<? extends User> list2) {
            List<? extends User> list3 = list;
            List<? extends User> list4 = list2;
            if (PatchProxy.isSupport(new Object[]{list3, list4}, this, changeQuickRedirect, false, 45270, new Class[]{List.class, List.class}, List.class)) {
                return (List) PatchProxy.accessDispatch(new Object[]{list3, list4}, this, changeQuickRedirect, false, 45270, new Class[]{List.class, List.class}, List.class);
            }
            Intrinsics.checkParameterIsNotNull(list3, "list");
            Intrinsics.checkParameterIsNotNull(list4, "loadMore");
            List<User> arrayList = new ArrayList<>();
            arrayList.addAll(list3);
            com.ss.android.ugc.aweme.c.a.a(arrayList, list4);
            return arrayList;
        }
    }

    public FollowingRelationViewModel() {
        Function1 function1 = e.INSTANCE;
        Function2 fVar = new f(this);
        Function2 a2 = j.a();
        this.g = new ListMiddleware<>(new a(function1, fVar, this), new b(new d(this), function1, fVar), a2, g.INSTANCE);
    }

    public final /* synthetic */ x c() {
        FollowingRelationState followingRelationState;
        if (PatchProxy.isSupport(new Object[0], this, f48201d, false, 45257, new Class[0], FollowingRelationState.class)) {
            followingRelationState = (FollowingRelationState) PatchProxy.accessDispatch(new Object[0], this, f48201d, false, 45257, new Class[0], FollowingRelationState.class);
        } else {
            followingRelationState = new FollowingRelationState(null, false, null, 7, null);
        }
        return followingRelationState;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f48201d, false, 45255, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48201d, false, 45255, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        if (PatchProxy.isSupport(new Object[0], this, f48201d, false, 45256, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48201d, false, 45256, new Class[0], Void.TYPE);
        } else {
            ListMiddleware<FollowingRelationState, User, i> listMiddleware = this.g;
            listMiddleware.a(d.INSTANCE, (Function2<? super S, ? super PROP, ? extends S>) c.INSTANCE);
            a(listMiddleware);
        }
        this.g.refresh();
    }

    public final int a(boolean z, boolean z2, boolean z3) {
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f48201d, false, 45258, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2), Byte.valueOf(z3)}, this, f48201d, false, 45258, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
        } else if (z2) {
            AbTestManager a2 = AbTestManager.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
            return a2.aq();
        } else {
            if (!com.ss.android.g.a.a()) {
                AbTestManager a3 = AbTestManager.a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "AbTestManager.getInstance()");
                if (!a3.bk() || !z3) {
                    return i;
                }
                return 2;
            } else if (z) {
                AbTestManager a4 = AbTestManager.a();
                Intrinsics.checkExpressionValueIsNotNull(a4, "AbTestManager.getInstance()");
                if (a4.bk()) {
                    return 2;
                }
                return 1;
            } else if (!z3) {
                return 1;
            } else {
                i = 2;
            }
            return i;
        }
    }

    public final boolean a(boolean z, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), Integer.valueOf(i2)}, this, f48201d, false, 45259, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2)}, this, f48201d, false, 45259, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        AbTestManager a2 = AbTestManager.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
        if (!a2.bk() || com.ss.android.g.a.a()) {
            return false;
        }
        if (z && ((i3 == 1 && i4 < 15) || (i3 == 2 && i4 < 5))) {
            this.g.loadMore();
            z2 = true;
        }
        return z2;
    }
}

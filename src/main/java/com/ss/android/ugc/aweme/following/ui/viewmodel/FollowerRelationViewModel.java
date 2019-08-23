package com.ss.android.ugc.aweme.following.ui.viewmodel;

import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.following.repository.i;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.ArrayList;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u001e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013J\b\u0010\u0015\u001a\u00020\u0002H\u0014J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\b\u0010\u0019\u001a\u00020\u000fH\u0014J\u000e\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R#\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowerRelationViewModel;", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowerRelationState;", "()V", "mRefreshing", "", "mRepo", "Lcom/ss/android/ugc/aweme/following/repository/FollowerRelationRepository;", "middleWare", "Lcom/bytedance/jedi/arch/ext/list/ListMiddleware;", "Lcom/ss/android/ugc/aweme/profile/model/User;", "Lcom/ss/android/ugc/aweme/following/repository/RelationPayload;", "getMiddleWare", "()Lcom/bytedance/jedi/arch/ext/list/ListMiddleware;", "bind", "", "checkNeedAnotherFetch", "hasMore", "loadTime", "", "lastLoadSize", "defaultState", "getSourceType", "isRefresh", "recommendHasMore", "onStart", "remove", "uid", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FollowerRelationViewModel extends JediViewModel<FollowerRelationState> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f48192d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.following.repository.d f48193e = new com.ss.android.ugc.aweme.following.repository.d();

    /* renamed from: f  reason: collision with root package name */
    public boolean f48194f = true;
    @NotNull
    public final ListMiddleware<FollowerRelationState, User, i> g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowerRelationState;", "it", "Lcom/bytedance/jedi/arch/ext/list/ListState;", "Lcom/ss/android/ugc/aweme/profile/model/User;", "Lcom/ss/android/ugc/aweme/following/repository/RelationPayload;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function2<FollowerRelationState, ListState<User, i>, FollowerRelationState> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
            super(2);
        }

        @NotNull
        public final FollowerRelationState invoke(@NotNull FollowerRelationState followerRelationState, @NotNull ListState<User, i> listState) {
            FollowerRelationState followerRelationState2 = followerRelationState;
            ListState<User, i> listState2 = listState;
            if (PatchProxy.isSupport(new Object[]{followerRelationState2, listState2}, this, changeQuickRedirect, false, 45244, new Class[]{FollowerRelationState.class, ListState.class}, FollowerRelationState.class)) {
                return (FollowerRelationState) PatchProxy.accessDispatch(new Object[]{followerRelationState2, listState2}, this, changeQuickRedirect, false, 45244, new Class[]{FollowerRelationState.class, ListState.class}, FollowerRelationState.class);
            }
            Intrinsics.checkParameterIsNotNull(followerRelationState2, "$receiver");
            Intrinsics.checkParameterIsNotNull(listState2, AdvanceSetting.NETWORK_TYPE);
            return FollowerRelationState.copy$default(followerRelationState2, null, listState2, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001av\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002 \u0006*:\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "Lcom/ss/android/ugc/aweme/profile/model/User;", "Lcom/ss/android/ugc/aweme/following/repository/RelationPayload;", "kotlin.jvm.PlatformType", "it", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowerRelationState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<FollowerRelationState, Observable<Pair<? extends List<? extends User>, ? extends i>>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FollowerRelationViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(FollowerRelationViewModel followerRelationViewModel) {
            super(1);
            this.this$0 = followerRelationViewModel;
        }

        public final Observable<Pair<List<User>, i>> invoke(@NotNull FollowerRelationState followerRelationState) {
            final FollowerRelationState followerRelationState2 = followerRelationState;
            if (PatchProxy.isSupport(new Object[]{followerRelationState2}, this, changeQuickRedirect, false, 45245, new Class[]{FollowerRelationState.class}, Observable.class)) {
                return (Observable) PatchProxy.accessDispatch(new Object[]{followerRelationState2}, this, changeQuickRedirect, false, 45245, new Class[]{FollowerRelationState.class}, Observable.class);
            }
            Intrinsics.checkParameterIsNotNull(followerRelationState2, AdvanceSetting.NETWORK_TYPE);
            this.this$0.f48194f = true;
            Observable<Pair<List<User>, i>> map = this.this$0.f48193e.a(followerRelationState.getUserId(), 0, 20, 0, this.this$0.a(true, true), com.ss.android.ugc.aweme.utils.permission.e.a(), com.ss.android.ugc.aweme.utils.permission.e.b()).map(new Function<T, R>(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f48195a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ b f48196b;

                {
                    this.f48196b = r1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    int i;
                    int i2;
                    com.ss.android.ugc.aweme.following.a.c cVar = (com.ss.android.ugc.aweme.following.a.c) obj;
                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f48195a, false, 45246, new Class[]{com.ss.android.ugc.aweme.following.a.c.class}, Pair.class)) {
                        return (Pair) PatchProxy.accessDispatch(new Object[]{cVar}, this, f48195a, false, 45246, new Class[]{com.ss.android.ugc.aweme.following.a.c.class}, Pair.class);
                    }
                    Intrinsics.checkParameterIsNotNull(cVar, "resp");
                    List<User> list = cVar.f47880a;
                    boolean z = cVar.f47881b;
                    int i3 = cVar.f47884e;
                    long j = cVar.f47883d;
                    boolean z2 = cVar.f47885f;
                    if (this.f48196b.this$0.f48194f) {
                        i = 1;
                    } else {
                        i = 1 + ((i) followerRelationState2.getListState().getPayload()).f47946e;
                    }
                    List<User> list2 = cVar.f47880a;
                    if (list2 != null) {
                        i2 = list2.size();
                    } else {
                        i2 = 0;
                    }
                    i iVar = new i(z, i3, j, z2, i, i2);
                    return TuplesKt.to(list, iVar);
                }
            });
            Intrinsics.checkExpressionValueIsNotNull(map, "mRepo.queryFollowerList(…      )\n                }");
            return map;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001av\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002 \u0006*:\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "Lcom/ss/android/ugc/aweme/profile/model/User;", "Lcom/ss/android/ugc/aweme/following/repository/RelationPayload;", "kotlin.jvm.PlatformType", "it", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowerRelationState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function1<FollowerRelationState, Observable<Pair<? extends List<? extends User>, ? extends i>>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FollowerRelationViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(FollowerRelationViewModel followerRelationViewModel) {
            super(1);
            this.this$0 = followerRelationViewModel;
        }

        public final Observable<Pair<List<User>, i>> invoke(@NotNull FollowerRelationState followerRelationState) {
            final FollowerRelationState followerRelationState2 = followerRelationState;
            if (PatchProxy.isSupport(new Object[]{followerRelationState2}, this, changeQuickRedirect, false, 45247, new Class[]{FollowerRelationState.class}, Observable.class)) {
                return (Observable) PatchProxy.accessDispatch(new Object[]{followerRelationState2}, this, changeQuickRedirect, false, 45247, new Class[]{FollowerRelationState.class}, Observable.class);
            }
            Intrinsics.checkParameterIsNotNull(followerRelationState2, AdvanceSetting.NETWORK_TYPE);
            this.this$0.f48194f = false;
            Observable<Pair<List<User>, i>> map = this.this$0.f48193e.a(followerRelationState.getUserId(), ((i) followerRelationState.getListState().getPayload()).f47944c, 20, ((i) followerRelationState.getListState().getPayload()).f21388b, this.this$0.a(false, ((i) followerRelationState.getListState().getPayload()).f47945d), com.ss.android.ugc.aweme.utils.permission.e.a(), com.ss.android.ugc.aweme.utils.permission.e.b()).map(new Function<T, R>(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f48198a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ c f48199b;

                {
                    this.f48199b = r1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    int i;
                    int i2;
                    com.ss.android.ugc.aweme.following.a.c cVar = (com.ss.android.ugc.aweme.following.a.c) obj;
                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f48198a, false, 45248, new Class[]{com.ss.android.ugc.aweme.following.a.c.class}, Pair.class)) {
                        return (Pair) PatchProxy.accessDispatch(new Object[]{cVar}, this, f48198a, false, 45248, new Class[]{com.ss.android.ugc.aweme.following.a.c.class}, Pair.class);
                    }
                    Intrinsics.checkParameterIsNotNull(cVar, "resp");
                    List<User> list = cVar.f47880a;
                    boolean z = cVar.f47881b;
                    int i3 = cVar.f47884e;
                    long j = cVar.f47883d;
                    boolean z2 = cVar.f47885f;
                    if (this.f48199b.this$0.f48194f) {
                        i = 1;
                    } else {
                        i = 1 + ((i) followerRelationState2.getListState().getPayload()).f47946e;
                    }
                    List<User> list2 = cVar.f47880a;
                    if (list2 != null) {
                        i2 = list2.size();
                    } else {
                        i2 = 0;
                    }
                    i iVar = new i(z, i3, j, z2, i, i2);
                    return TuplesKt.to(list, iVar);
                }
            });
            Intrinsics.checkExpressionValueIsNotNull(map, "mRepo.queryFollowerList(…      )\n                }");
            return map;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/profile/model/User;", "list", "", "loadMore", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function2<List<? extends User>, List<? extends User>, List<User>> {
        public static final d INSTANCE = new d();
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
            super(2);
        }

        @NotNull
        public final List<User> invoke(@NotNull List<? extends User> list, @NotNull List<? extends User> list2) {
            List<? extends User> list3 = list;
            List<? extends User> list4 = list2;
            if (PatchProxy.isSupport(new Object[]{list3, list4}, this, changeQuickRedirect, false, 45249, new Class[]{List.class, List.class}, List.class)) {
                return (List) PatchProxy.accessDispatch(new Object[]{list3, list4}, this, changeQuickRedirect, false, 45249, new Class[]{List.class, List.class}, List.class);
            }
            Intrinsics.checkParameterIsNotNull(list3, "list");
            Intrinsics.checkParameterIsNotNull(list4, "loadMore");
            List<User> arrayList = new ArrayList<>();
            arrayList.addAll(list3);
            com.ss.android.ugc.aweme.c.a.a(arrayList, list4);
            return arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowerRelationState;", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class e extends Lambda implements Function1<FollowerRelationState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ String $uid;
        final /* synthetic */ FollowerRelationViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(FollowerRelationViewModel followerRelationViewModel, String str) {
            super(1);
            this.this$0 = followerRelationViewModel;
            this.$uid = str;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FollowerRelationState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull FollowerRelationState followerRelationState) {
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{followerRelationState}, this, changeQuickRedirect, false, 45250, new Class[]{FollowerRelationState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{followerRelationState}, this, changeQuickRedirect, false, 45250, new Class[]{FollowerRelationState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(followerRelationState, AdvanceSetting.NETWORK_TYPE);
            for (Object next : followerRelationState.getListState().getList()) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (Intrinsics.areEqual((Object) ((User) next).getUid(), (Object) this.$uid)) {
                    ListMiddleware<FollowerRelationState, User, i> listMiddleware = this.this$0.g;
                    listMiddleware.a((Function1<? super PROP, Unit>) new ListMiddleware.d<Object,Unit>(listMiddleware, i));
                }
                i = i2;
            }
        }
    }

    public FollowerRelationViewModel() {
        ListMiddleware listMiddleware = new ListMiddleware(new b(this), new c(this), null, d.INSTANCE, 4);
        this.g = listMiddleware;
    }

    public final /* synthetic */ x c() {
        FollowerRelationState followerRelationState;
        if (PatchProxy.isSupport(new Object[0], this, f48192d, false, 45238, new Class[0], FollowerRelationState.class)) {
            followerRelationState = (FollowerRelationState) PatchProxy.accessDispatch(new Object[0], this, f48192d, false, 45238, new Class[0], FollowerRelationState.class);
        } else {
            followerRelationState = new FollowerRelationState(null, null, 3, null);
        }
        return followerRelationState;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f48192d, false, 45236, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48192d, false, 45236, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        if (PatchProxy.isSupport(new Object[0], this, f48192d, false, 45237, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48192d, false, 45237, new Class[0], Void.TYPE);
        } else {
            ListMiddleware<FollowerRelationState, User, i> listMiddleware = this.g;
            listMiddleware.a(c.INSTANCE, (Function2<? super S, ? super PROP, ? extends S>) a.INSTANCE);
            a(listMiddleware);
        }
        this.g.refresh();
    }

    public final int a(boolean z, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f48192d, false, 45239, new Class[]{Boolean.TYPE, Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f48192d, false, 45239, new Class[]{Boolean.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
        } else if (!com.ss.android.g.a.a()) {
            AbTestManager a2 = AbTestManager.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
            if (!a2.bk() || !z2) {
                return 1;
            }
            return 2;
        } else {
            AbTestManager a3 = AbTestManager.a();
            Intrinsics.checkExpressionValueIsNotNull(a3, "AbTestManager.getInstance()");
            if ((!a3.bk() || !z) && (z || !z2)) {
                return 1;
            }
            return 2;
        }
    }

    public final boolean a(boolean z, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), Integer.valueOf(i2)}, this, f48192d, false, 45240, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2)}, this, f48192d, false, 45240, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
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

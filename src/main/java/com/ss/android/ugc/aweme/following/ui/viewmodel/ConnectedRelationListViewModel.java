package com.ss.android.ugc.aweme.following.ui.viewmodel;

import android.annotation.SuppressLint;
import android.content.Context;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.arch.JediBaseViewModel;
import com.ss.android.ugc.aweme.following.ui.adapter.ConnectedRelationAdapter;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.user.repository.l;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.B\u0005¢\u0006\u0002\u0010\u0003J6\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0002H\u0014J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0007J\u0006\u0010\u0019\u001a\u00020\u0017J\b\u0010\u001a\u001a\u00020\u0017H\u0003J\b\u0010\u001b\u001a\u00020\u0017H\u0014J\b\u0010\u001c\u001a\u00020\u0017H\u0014J\u0006\u0010\u001d\u001a\u00020\u0017J\u000e\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0014J\u0010 \u001a\u00020\u0017\"\b\b\u0000\u0010!*\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H!0$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060&2\u0016\b\u0002\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H!\u0018\u00010(2\u0016\b\u0002\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H!\u0018\u00010(2!\b\u0002\u0010*\u001a\u001b\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u0017\u0018\u00010+¢\u0006\u0002\b-R#\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/viewmodel/ConnectedRelationListViewModel;", "Lcom/ss/android/ugc/aweme/base/arch/JediBaseViewModel;", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/ConnectedRelationState;", "()V", "mConnectedRelationMiddleware", "Lcom/bytedance/jedi/arch/ext/list/ListMiddleware;", "", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/ConnectedRelationPayload;", "getMConnectedRelationMiddleware", "()Lcom/bytedance/jedi/arch/ext/list/ListMiddleware;", "mConnectedRelationRepository", "Lcom/ss/android/ugc/aweme/following/repository/ConnectedRelationRepository;", "mRecommendListRepository", "Lcom/ss/android/ugc/aweme/friends/recommendlist/repository/RecommendListRepository;", "constructStateList", "", "relationList", "Lcom/ss/android/ugc/aweme/profile/model/User;", "recommendList", "title", "", "defaultState", "dislike", "", "user", "loadMore", "observerList", "onCleared", "onStart", "refresh", "setReportId", "reportId", "subscribe", "RECEIVER", "Lcom/bytedance/jedi/arch/IReceiver;", "subscriber", "Lcom/bytedance/jedi/arch/ISubscriber;", "adapter", "Lcom/bytedance/jedi/arch/ext/list/DiffableAdapter;", "refreshListener", "Lcom/bytedance/jedi/arch/ext/list/ListListener;", "loadMoreListener", "onHasMore", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ConnectedRelationListViewModel extends JediBaseViewModel<ConnectedRelationState> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f48169d;
    public static final a h = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.following.repository.b f48170e = new com.ss.android.ugc.aweme.following.repository.b();

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.friends.recommendlist.repository.d f48171f = new com.ss.android.ugc.aweme.friends.recommendlist.repository.d();
    @NotNull
    public final ListMiddleware<ConnectedRelationState, Object, b> g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/viewmodel/ConnectedRelationListViewModel$Companion;", "", "()V", "LOAD_MORE", "", "RECOMMEND_COUNT", "REFRESH", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 15})
    static final class b<T> implements Consumer<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f48172a = new b();

        b() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 15})
    static final class c<T> implements Consumer<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48173a;

        /* renamed from: b  reason: collision with root package name */
        public static final c f48174b = new c();

        c() {
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (PatchProxy.isSupport(new Object[]{th}, this, f48173a, false, 45197, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th}, this, f48173a, false, 45197, new Class[]{Throwable.class}, Void.TYPE);
            } else if (th != null) {
                com.google.a.a.a.a.a.a.b(th);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001av\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002 \u0006*:\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/ConnectedRelationPayload;", "kotlin.jvm.PlatformType", "state", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/ConnectedRelationState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function1<ConnectedRelationState, Observable<Pair<? extends List<? extends Object>, ? extends b>>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ ConnectedRelationListViewModel this$0;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/model/RecommendList;", "it", "", "apply"}, k = 3, mv = {1, 1, 15})
        static final class a<T, R> implements Function<Throwable, RecommendList> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48179a;

            /* renamed from: b  reason: collision with root package name */
            public static final a f48180b = new a();

            a() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                if (PatchProxy.isSupport(new Object[]{th}, this, f48179a, false, 45201, new Class[]{Throwable.class}, RecommendList.class)) {
                    return (RecommendList) PatchProxy.accessDispatch(new Object[]{th}, this, f48179a, false, 45201, new Class[]{Throwable.class}, RecommendList.class);
                }
                Intrinsics.checkParameterIsNotNull(th, AdvanceSetting.NETWORK_TYPE);
                return new RecommendList();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ConnectedRelationListViewModel connectedRelationListViewModel) {
            super(1);
            this.this$0 = connectedRelationListViewModel;
        }

        public final Observable<Pair<List<Object>, b>> invoke(@NotNull ConnectedRelationState connectedRelationState) {
            Observable observable;
            ConnectedRelationState connectedRelationState2 = connectedRelationState;
            if (PatchProxy.isSupport(new Object[]{connectedRelationState2}, this, changeQuickRedirect, false, 45198, new Class[]{ConnectedRelationState.class}, Observable.class)) {
                return (Observable) PatchProxy.accessDispatch(new Object[]{connectedRelationState2}, this, changeQuickRedirect, false, 45198, new Class[]{ConnectedRelationState.class}, Observable.class);
            }
            Intrinsics.checkParameterIsNotNull(connectedRelationState2, "state");
            com.ss.android.ugc.aweme.following.repository.b bVar = this.this$0.f48170e;
            String userId = connectedRelationState.getUserId();
            if (PatchProxy.isSupport(new Object[]{userId, null, null}, bVar, com.ss.android.ugc.aweme.following.repository.b.f47920a, false, 44796, new Class[]{String.class, Integer.class, Integer.class}, Observable.class)) {
                com.ss.android.ugc.aweme.following.repository.b bVar2 = bVar;
                observable = (Observable) PatchProxy.accessDispatch(new Object[]{userId, null, null}, bVar2, com.ss.android.ugc.aweme.following.repository.b.f47920a, false, 44796, new Class[]{String.class, Integer.class, Integer.class}, Observable.class);
            } else {
                Intrinsics.checkParameterIsNotNull(userId, "uid");
                observable = bVar.f47921b.a(new com.ss.android.ugc.aweme.following.repository.a(userId, null, null));
            }
            Observable<Pair<List<Object>, b>> map = Observable.zip(observable, this.this$0.f48171f.a(30, 0, null, 3, 0, Integer.valueOf(com.ss.android.ugc.aweme.utils.permission.e.a()), connectedRelationState.getReportId(), null, Integer.valueOf(com.ss.android.ugc.aweme.utils.permission.e.b())).onErrorReturn(a.f48180b), AnonymousClass1.f48176b).map(new Function<T, R>(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f48177a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ d f48178b;

                {
                    this.f48178b = r1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    List<Object> list;
                    Triple triple = (Triple) obj;
                    boolean z = true;
                    int i = 0;
                    if (PatchProxy.isSupport(new Object[]{triple}, this, f48177a, false, 45200, new Class[]{Triple.class}, Pair.class)) {
                        return (Pair) PatchProxy.accessDispatch(new Object[]{triple}, this, f48177a, false, 45200, new Class[]{Triple.class}, Pair.class);
                    }
                    Intrinsics.checkParameterIsNotNull(triple, "resp");
                    Collection collection = ((com.ss.android.ugc.aweme.following.a.a) triple.getSecond()).f47870b;
                    if (collection != null && !collection.isEmpty()) {
                        z = false;
                    }
                    if (z) {
                        list = CollectionsKt.emptyList();
                    } else {
                        List<User> userList = ((RecommendList) triple.getThird()).getUserList();
                        Intrinsics.checkExpressionValueIsNotNull(userList, "resp.third.userList");
                        for (User user : userList) {
                            Intrinsics.checkExpressionValueIsNotNull(user, AdvanceSetting.NETWORK_TYPE);
                            user.setRequestId(((RecommendList) triple.getThird()).rid);
                        }
                        list = this.f48178b.this$0.a(((com.ss.android.ugc.aweme.following.a.a) triple.getSecond()).f47870b, ((RecommendList) triple.getThird()).getUserList(), ((com.ss.android.ugc.aweme.following.a.a) triple.getSecond()).f47869a);
                    }
                    List<? extends User> list2 = ((com.ss.android.ugc.aweme.following.a.a) triple.getSecond()).f47870b;
                    if (list2 != null) {
                        i = list2.size();
                    }
                    return TuplesKt.to(list, new b(((com.ss.android.ugc.aweme.following.a.a) triple.getSecond()).f47869a, i, ((RecommendList) triple.getThird()).hasMore, ((RecommendList) triple.getThird()).cursor));
                }
            });
            Intrinsics.checkExpressionValueIsNotNull(map, "Observable.zip(relationO…      }\n                }");
            return map;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001av\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002 \u0006*:\u00124\u00122\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/ConnectedRelationPayload;", "kotlin.jvm.PlatformType", "state", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/ConnectedRelationState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function1<ConnectedRelationState, Observable<Pair<? extends List<? extends Object>, ? extends b>>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ ConnectedRelationListViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ConnectedRelationListViewModel connectedRelationListViewModel) {
            super(1);
            this.this$0 = connectedRelationListViewModel;
        }

        public final Observable<Pair<List<Object>, b>> invoke(@NotNull ConnectedRelationState connectedRelationState) {
            final ConnectedRelationState connectedRelationState2 = connectedRelationState;
            if (PatchProxy.isSupport(new Object[]{connectedRelationState2}, this, changeQuickRedirect, false, 45202, new Class[]{ConnectedRelationState.class}, Observable.class)) {
                return (Observable) PatchProxy.accessDispatch(new Object[]{connectedRelationState2}, this, changeQuickRedirect, false, 45202, new Class[]{ConnectedRelationState.class}, Observable.class);
            }
            Intrinsics.checkParameterIsNotNull(connectedRelationState2, "state");
            Observable<Pair<List<Object>, b>> map = this.this$0.f48171f.a(30, Integer.valueOf(((b) connectedRelationState.getListState().getPayload()).f21388b), null, 3, 0, Integer.valueOf(com.ss.android.ugc.aweme.utils.permission.e.a()), connectedRelationState.getReportId(), null, Integer.valueOf(com.ss.android.ugc.aweme.utils.permission.e.b())).map(AnonymousClass1.f48182b).doAfterNext(AnonymousClass2.f48184b).map(new Function<T, R>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f48185a;

                public final /* synthetic */ Object apply(Object obj) {
                    Triple triple = (Triple) obj;
                    if (PatchProxy.isSupport(new Object[]{triple}, this, f48185a, false, 45205, new Class[]{Triple.class}, Pair.class)) {
                        return (Pair) PatchProxy.accessDispatch(new Object[]{triple}, this, f48185a, false, 45205, new Class[]{Triple.class}, Pair.class);
                    }
                    Intrinsics.checkParameterIsNotNull(triple, "resp");
                    List arrayList = new ArrayList();
                    Object third = triple.getThird();
                    Intrinsics.checkExpressionValueIsNotNull(third, "resp.third");
                    List<User> userList = ((RecommendList) third).getUserList();
                    Intrinsics.checkExpressionValueIsNotNull(userList, "resp.third.userList");
                    for (User user : userList) {
                        int a2 = ConnectedRelationAdapter.a.a();
                        Intrinsics.checkExpressionValueIsNotNull(user, AdvanceSetting.NETWORK_TYPE);
                        arrayList.add(new f(a2, user, 0, 4));
                    }
                    List list = CollectionsKt.toList(arrayList);
                    String str = ((b) connectedRelationState2.getListState().getPayload()).f48210c;
                    int i = ((b) connectedRelationState2.getListState().getPayload()).f48211d;
                    boolean z = ((RecommendList) triple.getThird()).hasMore;
                    Object third2 = triple.getThird();
                    Intrinsics.checkExpressionValueIsNotNull(third2, "resp.third");
                    return TuplesKt.to(list, new b(str, i, z, ((RecommendList) third2).cursor));
                }
            });
            Intrinsics.checkExpressionValueIsNotNull(map, "mRecommendListRepository…  )\n                    }");
            return map;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", "list", "", "loadMore", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function2<List<? extends Object>, List<? extends Object>, List<Object>> {
        public static final f INSTANCE = new f();
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
            super(2);
        }

        @NotNull
        public final List<Object> invoke(@NotNull List<? extends Object> list, @NotNull List<? extends Object> list2) {
            List<? extends Object> list3 = list;
            List<? extends Object> list4 = list2;
            if (PatchProxy.isSupport(new Object[]{list3, list4}, this, changeQuickRedirect, false, 45206, new Class[]{List.class, List.class}, List.class)) {
                return (List) PatchProxy.accessDispatch(new Object[]{list3, list4}, this, changeQuickRedirect, false, 45206, new Class[]{List.class, List.class}, List.class);
            }
            Intrinsics.checkParameterIsNotNull(list3, "list");
            Intrinsics.checkParameterIsNotNull(list4, "loadMore");
            HashSet hashSet = new HashSet();
            List<Object> arrayList = new ArrayList<>();
            int i = 0;
            for (Object next : list3) {
                if (next instanceof f) {
                    f fVar = (f) next;
                    if (hashSet.add(fVar.f48217c.getUid())) {
                        arrayList.add(fVar.a(fVar.f48216b, fVar.f48217c, i));
                        i++;
                    }
                }
                arrayList.add(next);
            }
            for (Object next2 : list4) {
                if (next2 != null) {
                    f fVar2 = (f) next2;
                    if (hashSet.add(fVar2.f48217c.getUid())) {
                        arrayList.add(fVar2.a(fVar2.f48216b, fVar2.f48217c, i));
                        i++;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.following.ui.viewmodel.RelationUser");
                }
            }
            return arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "result", "Lcom/bytedance/jedi/model/datasource/Optional;", "", "Lcom/ss/android/ugc/aweme/user/repository/UserWrapper;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 15})
    static final class g<T> implements Consumer<com.bytedance.jedi.model.c.f<? extends List<? extends l>>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48187a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ConnectedRelationListViewModel f48188b;

        g(ConnectedRelationListViewModel connectedRelationListViewModel) {
            this.f48188b = connectedRelationListViewModel;
        }

        public final /* synthetic */ void accept(Object obj) {
            final com.bytedance.jedi.model.c.f fVar = (com.bytedance.jedi.model.c.f) obj;
            if (PatchProxy.isSupport(new Object[]{fVar}, this, f48187a, false, 45207, new Class[]{com.bytedance.jedi.model.c.f.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar}, this, f48187a, false, 45207, new Class[]{com.bytedance.jedi.model.c.f.class}, Void.TYPE);
                return;
            }
            this.f48188b.c(new Function1<ConnectedRelationState, ConnectedRelationState>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ g this$0;

                {
                    this.this$0 = r1;
                }

                /* JADX WARNING: Removed duplicated region for block: B:30:0x00f8  */
                /* JADX WARNING: Removed duplicated region for block: B:51:0x00ce A[SYNTHETIC] */
                @org.jetbrains.annotations.NotNull
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState invoke(@org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState r18) {
                    /*
                        r17 = this;
                        r7 = r17
                        r8 = r18
                        r9 = 1
                        java.lang.Object[] r0 = new java.lang.Object[r9]
                        r10 = 0
                        r0[r10] = r8
                        com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
                        java.lang.Class[] r5 = new java.lang.Class[r9]
                        java.lang.Class<com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState> r1 = com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState.class
                        r5[r10] = r1
                        java.lang.Class<com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState> r6 = com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState.class
                        r3 = 0
                        r4 = 45208(0xb098, float:6.335E-41)
                        r1 = r17
                        boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                        if (r0 == 0) goto L_0x003b
                        java.lang.Object[] r0 = new java.lang.Object[r9]
                        r0[r10] = r8
                        com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
                        r3 = 0
                        r4 = 45208(0xb098, float:6.335E-41)
                        java.lang.Class[] r5 = new java.lang.Class[r9]
                        java.lang.Class<com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState> r1 = com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState.class
                        r5[r10] = r1
                        java.lang.Class<com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState> r6 = com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState.class
                        r1 = r17
                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                        com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState r0 = (com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState) r0
                        return r0
                    L_0x003b:
                        java.lang.String r0 = "$receiver"
                        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
                        java.util.ArrayList r0 = new java.util.ArrayList
                        r0.<init>()
                        java.util.List r0 = (java.util.List) r0
                        com.bytedance.jedi.arch.ext.list.ListState r1 = r18.getListState()
                        java.util.List r1 = r1.getList()
                        java.lang.Iterable r1 = (java.lang.Iterable) r1
                        java.util.Iterator r1 = r1.iterator()
                    L_0x0055:
                        boolean r2 = r1.hasNext()
                        if (r2 == 0) goto L_0x006f
                        java.lang.Object r2 = r1.next()
                        boolean r3 = r2 instanceof com.ss.android.ugc.aweme.following.ui.viewmodel.f
                        if (r3 == 0) goto L_0x0055
                        com.ss.android.ugc.aweme.following.ui.viewmodel.f r2 = (com.ss.android.ugc.aweme.following.ui.viewmodel.f) r2
                        int r3 = r2.f48216b
                        if (r3 != 0) goto L_0x0055
                        com.ss.android.ugc.aweme.profile.model.User r2 = r2.f48217c
                        r0.add(r2)
                        goto L_0x0055
                    L_0x006f:
                        java.util.ArrayList r1 = new java.util.ArrayList
                        r1.<init>()
                        java.util.List r1 = (java.util.List) r1
                        com.bytedance.jedi.model.c.f r2 = r7
                        java.lang.Object r2 = r2.a()
                        java.util.List r2 = (java.util.List) r2
                        if (r2 == 0) goto L_0x015a
                        java.util.HashMap r3 = new java.util.HashMap
                        java.util.Collection r2 = (java.util.Collection) r2
                        java.util.List r4 = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection<? extends T>) r2)
                        int r4 = r4.size()
                        r3.<init>(r4)
                        java.util.List r2 = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection<? extends T>) r2)
                        java.lang.Iterable r2 = (java.lang.Iterable) r2
                        java.util.Iterator r2 = r2.iterator()
                    L_0x0099:
                        boolean r4 = r2.hasNext()
                        if (r4 == 0) goto L_0x00b9
                        java.lang.Object r4 = r2.next()
                        com.ss.android.ugc.aweme.user.repository.l r4 = (com.ss.android.ugc.aweme.user.repository.l) r4
                        r5 = r3
                        java.util.Map r5 = (java.util.Map) r5
                        com.ss.android.ugc.aweme.profile.model.User r6 = r4.f75398b
                        java.lang.String r6 = r6.getUid()
                        java.lang.String r11 = "item.user.uid"
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r11)
                        com.ss.android.ugc.aweme.profile.model.User r4 = r4.f75398b
                        r5.put(r6, r4)
                        goto L_0x0099
                    L_0x00b9:
                        com.bytedance.jedi.arch.ext.list.ListState r2 = r18.getListState()
                        java.util.List r2 = r2.getList()
                        java.lang.Iterable r2 = (java.lang.Iterable) r2
                        java.util.ArrayList r4 = new java.util.ArrayList
                        r4.<init>()
                        java.util.Collection r4 = (java.util.Collection) r4
                        java.util.Iterator r2 = r2.iterator()
                    L_0x00ce:
                        boolean r5 = r2.hasNext()
                        if (r5 == 0) goto L_0x00fc
                        java.lang.Object r5 = r2.next()
                        boolean r6 = r5 instanceof com.ss.android.ugc.aweme.following.ui.viewmodel.f
                        if (r6 == 0) goto L_0x00f5
                        r6 = r5
                        com.ss.android.ugc.aweme.following.ui.viewmodel.f r6 = (com.ss.android.ugc.aweme.following.ui.viewmodel.f) r6
                        int r11 = r6.f48216b
                        int r12 = com.ss.android.ugc.aweme.following.ui.adapter.ConnectedRelationAdapter.a.a()
                        if (r11 != r12) goto L_0x00f5
                        com.ss.android.ugc.aweme.profile.model.User r6 = r6.f48217c
                        java.lang.String r6 = r6.getUid()
                        boolean r6 = r3.containsKey(r6)
                        if (r6 == 0) goto L_0x00f5
                        r6 = 1
                        goto L_0x00f6
                    L_0x00f5:
                        r6 = 0
                    L_0x00f6:
                        if (r6 == 0) goto L_0x00ce
                        r4.add(r5)
                        goto L_0x00ce
                    L_0x00fc:
                        java.util.List r4 = (java.util.List) r4
                        java.lang.Iterable r4 = (java.lang.Iterable) r4
                        java.util.Iterator r2 = r4.iterator()
                    L_0x0104:
                        boolean r4 = r2.hasNext()
                        if (r4 == 0) goto L_0x015a
                        java.lang.Object r4 = r2.next()
                        if (r4 == 0) goto L_0x0152
                        com.ss.android.ugc.aweme.following.ui.viewmodel.f r4 = (com.ss.android.ugc.aweme.following.ui.viewmodel.f) r4
                        com.ss.android.ugc.aweme.profile.model.User r5 = r4.f48217c
                        java.lang.String r5 = r5.getUid()
                        java.lang.Object r5 = r3.get(r5)
                        com.ss.android.ugc.aweme.profile.model.User r5 = (com.ss.android.ugc.aweme.profile.model.User) r5
                        if (r5 == 0) goto L_0x0104
                        com.ss.android.ugc.aweme.profile.model.User r6 = r4.f48217c
                        java.lang.String r6 = r6.getUid()
                        r5.setRequestId(r6)
                        java.lang.String r6 = "user"
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
                        com.ss.android.ugc.aweme.profile.model.User r6 = r4.f48217c
                        java.lang.String r6 = r6.getRecommendReason()
                        r5.setRecommendReason(r6)
                        com.ss.android.ugc.aweme.profile.model.User r6 = r4.f48217c
                        int r6 = r6.getAwemeCount()
                        r5.setAwemeCount(r6)
                        com.ss.android.ugc.aweme.profile.model.User r4 = r4.f48217c
                        int r4 = r4.getFollowerCount()
                        r5.setFollowerCount(r4)
                        java.lang.String r4 = "this.also { user ->\n    …                        }"
                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r4)
                        r1.add(r5)
                        goto L_0x0104
                    L_0x0152:
                        kotlin.TypeCastException r0 = new kotlin.TypeCastException
                        java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.following.ui.viewmodel.RelationUser"
                        r0.<init>(r1)
                        throw r0
                    L_0x015a:
                        com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel$g r2 = r7.this$0
                        com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel r2 = r2.f48188b
                        com.bytedance.jedi.arch.ext.list.ListState r3 = r18.getListState()
                        com.bytedance.jedi.arch.ext.list.k r3 = r3.getPayload()
                        com.ss.android.ugc.aweme.following.ui.viewmodel.b r3 = (com.ss.android.ugc.aweme.following.ui.viewmodel.b) r3
                        java.lang.String r3 = r3.f48210c
                        java.util.List r11 = r2.a(r0, r1, r3)
                        r1 = 0
                        r2 = 0
                        com.bytedance.jedi.arch.ext.list.ListState r9 = r18.getListState()
                        r10 = 0
                        r12 = 0
                        r13 = 0
                        r14 = 0
                        r15 = 29
                        r16 = 0
                        com.bytedance.jedi.arch.ext.list.ListState r3 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r9, r10, r11, r12, r13, r14, r15, r16)
                        r4 = 3
                        r5 = 0
                        r0 = r18
                        com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState r0 = com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState.copy$default(r0, r1, r2, r3, r4, r5)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationListViewModel.g.AnonymousClass1.invoke(com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState):com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState");
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/ConnectedRelationState;", "it", "Lcom/bytedance/jedi/arch/ext/list/ListState;", "", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/ConnectedRelationPayload;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function2<ConnectedRelationState, ListState<Object, b>, ConnectedRelationState> {
        public static final h INSTANCE = new h();
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
            super(2);
        }

        @NotNull
        public final ConnectedRelationState invoke(@NotNull ConnectedRelationState connectedRelationState, @NotNull ListState<Object, b> listState) {
            ConnectedRelationState connectedRelationState2 = connectedRelationState;
            ListState<Object, b> listState2 = listState;
            if (PatchProxy.isSupport(new Object[]{connectedRelationState2, listState2}, this, changeQuickRedirect, false, 45211, new Class[]{ConnectedRelationState.class, ListState.class}, ConnectedRelationState.class)) {
                return (ConnectedRelationState) PatchProxy.accessDispatch(new Object[]{connectedRelationState2, listState2}, this, changeQuickRedirect, false, 45211, new Class[]{ConnectedRelationState.class, ListState.class}, ConnectedRelationState.class);
            }
            Intrinsics.checkParameterIsNotNull(connectedRelationState2, "$receiver");
            Intrinsics.checkParameterIsNotNull(listState2, AdvanceSetting.NETWORK_TYPE);
            return ConnectedRelationState.copy$default(connectedRelationState, null, null, listState, 3, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/ConnectedRelationState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function1<ConnectedRelationState, ConnectedRelationState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ String $reportId;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(String str) {
            super(1);
            this.$reportId = str;
        }

        @NotNull
        public final ConnectedRelationState invoke(@NotNull ConnectedRelationState connectedRelationState) {
            ConnectedRelationState connectedRelationState2 = connectedRelationState;
            if (PatchProxy.isSupport(new Object[]{connectedRelationState2}, this, changeQuickRedirect, false, 45212, new Class[]{ConnectedRelationState.class}, ConnectedRelationState.class)) {
                return (ConnectedRelationState) PatchProxy.accessDispatch(new Object[]{connectedRelationState2}, this, changeQuickRedirect, false, 45212, new Class[]{ConnectedRelationState.class}, ConnectedRelationState.class);
            }
            Intrinsics.checkParameterIsNotNull(connectedRelationState2, "$receiver");
            return ConnectedRelationState.copy$default(connectedRelationState, null, this.$reportId, null, 5, null);
        }
    }

    public ConnectedRelationListViewModel() {
        ListMiddleware listMiddleware = new ListMiddleware(new d(this), new e(this), null, f.INSTANCE, 4);
        this.g = listMiddleware;
    }

    public final /* synthetic */ x c() {
        ConnectedRelationState connectedRelationState;
        if (PatchProxy.isSupport(new Object[0], this, f48169d, false, 45187, new Class[0], ConnectedRelationState.class)) {
            connectedRelationState = (ConnectedRelationState) PatchProxy.accessDispatch(new Object[0], this, f48169d, false, 45187, new Class[0], ConnectedRelationState.class);
        } else {
            connectedRelationState = new ConnectedRelationState(null, null, null, 7, null);
        }
        return connectedRelationState;
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f48169d, false, 45192, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48169d, false, 45192, new Class[0], Void.TYPE);
            return;
        }
        this.g.refresh();
    }

    public final void onCleared() {
        if (PatchProxy.isSupport(new Object[0], this, f48169d, false, 45196, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48169d, false, 45196, new Class[0], Void.TYPE);
            return;
        }
        super.onCleared();
        this.f48170e.a();
        this.f48171f.a();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f48169d, false, 45188, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48169d, false, 45188, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        ListMiddleware<ConnectedRelationState, Object, b> listMiddleware = this.g;
        listMiddleware.a(a.INSTANCE, (Function2<? super S, ? super PROP, ? extends S>) h.INSTANCE);
        a(listMiddleware);
        if (PatchProxy.isSupport(new Object[0], this, f48169d, false, 45189, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48169d, false, 45189, new Class[0], Void.TYPE);
            return;
        }
        this.f48171f.a(3).subscribe((Consumer<? super T>) new g<Object>(this));
    }

    @SuppressLint({"CheckResult"})
    public final void a(@NotNull User user) {
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{user2}, this, f48169d, false, 45191, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2}, this, f48169d, false, 45191, new Class[]{User.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(user2, AllStoryActivity.f73306b);
        com.ss.android.ugc.aweme.friends.recommendlist.repository.d dVar = this.f48171f;
        String uid = user.getUid();
        Intrinsics.checkExpressionValueIsNotNull(uid, "user.uid");
        dVar.a(uid).subscribe(b.f48172a, c.f48174b);
    }

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f48169d, false, 45194, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f48169d, false, 45194, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "reportId");
        c(new i(str2));
    }

    public final List<Object> a(List<? extends User> list, List<? extends User> list2, String str) {
        boolean z;
        String str2 = str;
        int i2 = 0;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{list, list2, str2}, this, f48169d, false, 45190, new Class[]{List.class, List.class, String.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list, list2, str2}, this, f48169d, false, 45190, new Class[]{List.class, List.class, String.class}, List.class);
        }
        List<Object> arrayList = new ArrayList<>();
        HashSet hashSet = new HashSet();
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            arrayList.add(new e(0, str2));
            for (User user : list) {
                arrayList.add(new f(0, user, 0, 4));
                hashSet.add(user.getUid());
            }
        }
        Collection collection2 = list2;
        if (collection2 != null && !collection2.isEmpty()) {
            z2 = false;
        }
        if (!z2) {
            int a2 = ConnectedRelationAdapter.a.a();
            Context context = GlobalContext.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "GlobalContext.getContext()");
            String string = context.getResources().getString(C0906R.string.a1j);
            Intrinsics.checkExpressionValueIsNotNull(string, "GlobalContext.getContext…relation_recommend_title)");
            arrayList.add(new e(a2, string));
            for (User user2 : list2) {
                if (hashSet.add(user2.getUid())) {
                    arrayList.add(new f(ConnectedRelationAdapter.a.a(), user2, i2));
                    i2++;
                }
            }
        }
        return arrayList;
    }
}

package com.ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.jedi.model.c.f;
import com.bytedance.jedi.model.e.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.repository.g;
import com.ss.android.ugc.aweme.user.repository.l;
import io.reactivex.Observable;
import io.reactivex.Single;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\rJ \u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u0015J \u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u0015J&\u0010\u0017\u001a\"\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0015\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\u00180\u00120\u0010Ji\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001e\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u00152\b\u0010 \u001a\u0004\u0018\u00010\u00152\b\u0010!\u001a\u0004\u0018\u00010\r2\b\u0010\"\u001a\u0004\u0018\u00010\r2\b\u0010#\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010$R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/repository/RecommendListRepository;", "Lcom/bytedance/jedi/model/repository/Repository;", "()V", "dislikeRecommendFetcher", "Lcom/ss/android/ugc/aweme/friends/recommendlist/repository/DislikeRecommendFetcher;", "recommendListCache", "Lcom/ss/android/ugc/aweme/friends/recommendlist/repository/RecommendListCache;", "recommendListFetcher", "Lcom/ss/android/ugc/aweme/friends/recommendlist/repository/RecommendListFetcher;", "userCache", "Lcom/ss/android/ugc/aweme/user/repository/UserCache;", "dislikeRecommend", "Lio/reactivex/Single;", "", "userId", "observerList", "Lio/reactivex/Observable;", "Lcom/bytedance/jedi/model/datasource/Optional;", "", "Lcom/ss/android/ugc/aweme/user/repository/UserWrapper;", "key", "", "observerListExcludeSource", "observerRecommendList", "Lkotlin/Pair;", "recommendList", "Lcom/ss/android/ugc/aweme/friends/model/RecommendList;", "count", "cursor", "targetUserId", "recommendType", "yellowPointCount", "addressBookAccess", "recImprUsers", "pushUserId", "gpsAccess", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lio/reactivex/Observable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d extends com.bytedance.jedi.model.f.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48993a;

    /* renamed from: b  reason: collision with root package name */
    private final c f48994b = new c();

    /* renamed from: c  reason: collision with root package name */
    private final b f48995c = new b();

    /* renamed from: d  reason: collision with root package name */
    private final a f48996d = new a();

    /* renamed from: e  reason: collision with root package name */
    private final g f48997e = com.ss.android.ugc.aweme.base.arch.b.a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\u0003\u0018\u0001\"\u0006\b\u0002\u0010\u0004\u0018\u0001\"\u0006\b\u0003\u0010\u0005\u0018\u0001*&\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00070\u0006H\n¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"<anonymous>", "", "K", "V", "K1", "V1", "Lcom/bytedance/jedi/model/merge/MergeStrategy$KeyMerge;", "", "invoke", "com/bytedance/jedi/model/repository/SyncExtensions$syncAppendedListTo$3"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function1<a.c<e, List<? extends l>, Integer, List<? extends l>>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public a() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a.c) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull a.c<e, List<l>, Integer, List<l>> cVar) {
            if (PatchProxy.isSupport(new Object[]{cVar}, this, changeQuickRedirect, false, 46758, new Class[]{a.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar}, this, changeQuickRedirect, false, 46758, new Class[]{a.c.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(cVar, "$this$keySyncTo");
            cVar.a((Function2<? super K, ? super V, ? extends K1>) new Function2<e, List<? extends l>, Integer>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ a this$0;

                {
                    this.this$0 = r1;
                }

                /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, java.lang.Integer] */
                public final Integer invoke(e eVar, @Nullable List<? extends l> list) {
                    if (!PatchProxy.isSupport(new Object[]{eVar, list}, this, changeQuickRedirect, false, 46759, new Class[]{Object.class, List.class}, Object.class)) {
                        return Integer.valueOf(eVar.f49002e);
                    }
                    return PatchProxy.accessDispatch(new Object[]{eVar, list}, this, changeQuickRedirect, false, 46759, new Class[]{Object.class, List.class}, Object.class);
                }
            });
            cVar.a((Function3<? super K, ? super V, ? super V1, ? extends V1>) new Function3<e, List<? extends l>, List<? extends l>, List<? extends l>>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ a this$0;

                {
                    this.this$0 = r1;
                }

                @Nullable
                public final List<l> invoke(e eVar, @Nullable List<? extends l> list, @Nullable List<? extends l> list2) {
                    int i;
                    List<? extends l> list3;
                    List<? extends l> list4;
                    List<? extends l> list5;
                    boolean z = true;
                    if (PatchProxy.isSupport(new Object[]{eVar, list, list2}, this, changeQuickRedirect, false, 46760, new Class[]{Object.class, List.class, List.class}, List.class)) {
                        return (List) PatchProxy.accessDispatch(new Object[]{eVar, list, list2}, this, changeQuickRedirect, false, 46760, new Class[]{Object.class, List.class, List.class}, List.class);
                    }
                    Integer num = eVar.f49000c;
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 0;
                    }
                    if (i != 0) {
                        z = false;
                    }
                    if (!z) {
                        if (list2 == null) {
                            list4 = CollectionsKt.emptyList();
                        } else {
                            list4 = list2;
                        }
                        Collection collection = list4;
                        if (list == null) {
                            list5 = CollectionsKt.emptyList();
                        } else {
                            list5 = list;
                        }
                        if (Intrinsics.areEqual((Object) l.class, (Object) l.class)) {
                            list3 = CollectionsKt.plus(collection, (Iterable<? extends T>) list5);
                        } else {
                            throw new RuntimeException();
                        }
                    } else if (list == null) {
                        return null;
                    } else {
                        if (Intrinsics.areEqual((Object) l.class, (Object) l.class)) {
                            list3 = list;
                        } else {
                            throw new RuntimeException();
                        }
                    }
                    return list3;
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\u0003\u0018\u0001*(\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u0002H\u0002\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00060\u0004H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "V", "V1", "Lcom/bytedance/jedi/model/merge/MergeStrategy$PredicatedMerge;", "", "", "invoke", "com/bytedance/jedi/model/repository/SyncExtensions$syncChangedItemTo$2"}, k = 3, mv = {1, 1, 15})
    public static final class b extends Lambda implements Function1<a.d<? extends Object, User, ? extends Object, List<? extends l>>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public b() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a.d) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull a.d<? extends Object, User, ? extends Object, List<l>> dVar) {
            a.d<? extends Object, User, ? extends Object, List<l>> dVar2 = dVar;
            if (PatchProxy.isSupport(new Object[]{dVar2}, this, changeQuickRedirect, false, 46761, new Class[]{a.d.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dVar2}, this, changeQuickRedirect, false, 46761, new Class[]{a.d.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(dVar2, "$this$predicatedSyncTo");
            dVar2.a(AnonymousClass1.INSTANCE);
            dVar2.b(new Function2<User, List<? extends l>, List<? extends l>>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ b this$0;

                {
                    this.this$0 = r1;
                }

                @NotNull
                public final List<l> invoke(User user, @NotNull List<? extends l> list) {
                    List<? extends l> list2 = list;
                    if (PatchProxy.isSupport(new Object[]{user, list2}, this, changeQuickRedirect, false, 46763, new Class[]{Object.class, List.class}, List.class)) {
                        return (List) PatchProxy.accessDispatch(new Object[]{user, list2}, this, changeQuickRedirect, false, 46763, new Class[]{Object.class, List.class}, List.class);
                    }
                    Intrinsics.checkParameterIsNotNull(list2, "curV");
                    Iterable iterable = list2;
                    Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    for (Object next : iterable) {
                        User user2 = user;
                        l lVar = (l) next;
                        if (Intrinsics.areEqual((Object) lVar.f75398b.getUid(), (Object) user2.getUid())) {
                            if (PatchProxy.isSupport(new Object[]{user2}, lVar, l.f75397a, false, 87729, new Class[]{User.class}, Void.TYPE)) {
                                l lVar2 = lVar;
                                PatchProxy.accessDispatch(new Object[]{user2}, lVar2, l.f75397a, false, 87729, new Class[]{User.class}, Void.TYPE);
                            } else {
                                Intrinsics.checkParameterIsNotNull(user2, "<set-?>");
                                lVar.f75398b = user2;
                            }
                        }
                        arrayList.add(next);
                    }
                    return (List) arrayList;
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*$\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0007\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0005H\n¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"<anonymous>", "", "V", "K1", "V1", "Lcom/bytedance/jedi/model/merge/MergeStrategy$BatchMerge;", "", "", "invoke", "com/bytedance/jedi/model/repository/SyncExtensions$syncChangedListTo$1"}, k = 3, mv = {1, 1, 15})
    public static final class c extends Lambda implements Function1<a.C0213a<? extends Object, List<? extends l>, String, User>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public c() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a.C0213a) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull a.C0213a<? extends Object, List<l>, String, User> aVar) {
            a.C0213a<? extends Object, List<l>, String, User> aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{aVar2}, this, changeQuickRedirect, false, 46764, new Class[]{a.C0213a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar2}, this, changeQuickRedirect, false, 46764, new Class[]{a.C0213a.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(aVar2, "$receiver");
            aVar2.a(new Function1<List<? extends l>, List<? extends Pair<? extends String, ? extends User>>>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ c this$0;

                {
                    this.this$0 = r1;
                }

                @NotNull
                public final List<Pair<String, User>> invoke(@NotNull List<? extends l> list) {
                    List<? extends l> list2 = list;
                    if (PatchProxy.isSupport(new Object[]{list2}, this, changeQuickRedirect, false, 46765, new Class[]{List.class}, List.class)) {
                        return (List) PatchProxy.accessDispatch(new Object[]{list2}, this, changeQuickRedirect, false, 46765, new Class[]{List.class}, List.class);
                    }
                    Intrinsics.checkParameterIsNotNull(list2, AdvanceSetting.NETWORK_TYPE);
                    Iterable<l> iterable = list2;
                    Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    for (l lVar : iterable) {
                        arrayList.add(TuplesKt.to(lVar.f75398b.getUid(), lVar.f75398b));
                    }
                    return (List) arrayList;
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005* \u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00070\u0006H\n¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"<anonymous>", "", "K", "V", "K1", "V1", "Lcom/bytedance/jedi/model/merge/MergeStrategy$PredicatedMerge;", "", "invoke", "com/bytedance/jedi/model/repository/SyncExtensions$syncRemovedItemTo$2"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.d$d  reason: collision with other inner class name */
    public static final class C0584d extends Lambda implements Function1<a.d<String, String, Integer, List<? extends l>>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public C0584d() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a.d) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull a.d<String, String, Integer, List<l>> dVar) {
            a.d<String, String, Integer, List<l>> dVar2 = dVar;
            if (PatchProxy.isSupport(new Object[]{dVar2}, this, changeQuickRedirect, false, 46766, new Class[]{a.d.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dVar2}, this, changeQuickRedirect, false, 46766, new Class[]{a.d.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(dVar2, "$this$predicatedSyncTo");
            dVar2.a(AnonymousClass1.INSTANCE);
            dVar2.b(new Function2<String, List<? extends l>, List<? extends l>>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ C0584d this$0;

                {
                    this.this$0 = r1;
                }

                @NotNull
                public final List<l> invoke(String str, @NotNull List<? extends l> list) {
                    List<? extends l> list2 = list;
                    if (PatchProxy.isSupport(new Object[]{str, list2}, this, changeQuickRedirect, false, 46768, new Class[]{Object.class, List.class}, List.class)) {
                        return (List) PatchProxy.accessDispatch(new Object[]{str, list2}, this, changeQuickRedirect, false, 46768, new Class[]{Object.class, List.class}, List.class);
                    }
                    Intrinsics.checkParameterIsNotNull(list2, "curV");
                    Collection arrayList = new ArrayList();
                    for (Object next : list2) {
                        if (!Intrinsics.areEqual((Object) ((l) next).f75398b.getUid(), (Object) str)) {
                            arrayList.add(next);
                        }
                    }
                    return (List) arrayList;
                }
            });
        }
    }

    public d() {
        a((com.bytedance.jedi.model.d.b<K, V, ?, ?>) this.f48994b, (com.bytedance.jedi.model.a.d<K1, V1>) this.f48995c, (Function1<? super a.c<K, V, K1, List<V1>>, Unit>) new a<Object,Unit>());
        a((com.bytedance.jedi.model.a.d<K, V>) this.f48995c, (com.bytedance.jedi.model.a.c<K1, V1>) this.f48997e, (Function1<? super a.C0213a<K, List<V>, K1, V1>, Unit>) new c<Object,Unit>());
        a((com.bytedance.jedi.model.a.c<K, V>) this.f48997e, (com.bytedance.jedi.model.a.d<K1, V1>) this.f48995c, (Function1<? super a.d<K, V, K1, List<V1>>, Unit>) new b<Object,Unit>());
        b(this.f48996d, this.f48995c, new C0584d());
    }

    @NotNull
    public final Observable<f<List<l>>> a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f48993a, false, 46755, new Class[]{Integer.TYPE}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f48993a, false, 46755, new Class[]{Integer.TYPE}, Observable.class);
        }
        return this.f48995c.a().a(Integer.valueOf(i), (com.bytedance.jedi.model.c.d<?, ?>[]) new com.bytedance.jedi.model.c.d[]{this.f48994b.a()});
    }

    @NotNull
    public final Observable<f<List<l>>> b(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f48993a, false, 46756, new Class[]{Integer.TYPE}, Observable.class)) {
            return this.f48995c.a().a(Integer.valueOf(i));
        }
        return (Observable) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f48993a, false, 46756, new Class[]{Integer.TYPE}, Observable.class);
    }

    @NotNull
    public final Single<String> a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f48993a, false, 46757, new Class[]{String.class}, Single.class)) {
            return (Single) PatchProxy.accessDispatch(new Object[]{str2}, this, f48993a, false, 46757, new Class[]{String.class}, Single.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "userId");
        Single<String> fromObservable = Single.fromObservable(this.f48996d.a(str2));
        Intrinsics.checkExpressionValueIsNotNull(fromObservable, "Single.fromObservable(di…dFetcher.request(userId))");
        return fromObservable;
    }

    @NotNull
    public final Observable<RecommendList> a(@Nullable Integer num, @Nullable Integer num2, @Nullable String str, int i, @Nullable Integer num3, @Nullable Integer num4, @Nullable String str2, @Nullable String str3, @Nullable Integer num5) {
        if (PatchProxy.isSupport(new Object[]{num, num2, null, Integer.valueOf(i), num3, num4, str2, str3, num5}, this, f48993a, false, 46753, new Class[]{Integer.class, Integer.class, String.class, Integer.TYPE, Integer.class, Integer.class, String.class, String.class, Integer.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{num, num2, null, Integer.valueOf(i), num3, num4, str2, str3, num5}, this, f48993a, false, 46753, new Class[]{Integer.class, Integer.class, String.class, Integer.TYPE, Integer.class, Integer.class, String.class, String.class, Integer.class}, Observable.class);
        }
        c cVar = this.f48994b;
        e eVar = new e(num, num2, null, i, num3, num4, str2, str3, num5);
        return cVar.a(eVar);
    }
}

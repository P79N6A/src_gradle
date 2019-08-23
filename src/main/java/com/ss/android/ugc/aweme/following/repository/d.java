package com.ss.android.ugc.aweme.following.repository;

import com.bytedance.jedi.model.e.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.repository.g;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JD\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/following/repository/FollowerRelationRepository;", "Lcom/bytedance/jedi/model/repository/Repository;", "()V", "mQueryFollowerListFetcher", "Lcom/ss/android/ugc/aweme/following/repository/QueryFollowerListFetcher;", "mRelationCache", "Lcom/ss/android/ugc/aweme/following/repository/RelationUserCache;", "userCache", "Lcom/ss/android/ugc/aweme/user/repository/UserCache;", "queryFollowerList", "Lio/reactivex/Observable;", "Lcom/ss/android/ugc/aweme/following/model/FollowerItemList;", "userId", "", "maxTime", "", "count", "", "offset", "sourceType", "addressBookAccess", "gpsAccess", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d extends com.bytedance.jedi.model.f.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47930a;

    /* renamed from: b  reason: collision with root package name */
    private final g f47931b = new g();

    /* renamed from: c  reason: collision with root package name */
    private final j f47932c = new j();

    /* renamed from: d  reason: collision with root package name */
    private final g f47933d = com.ss.android.ugc.aweme.base.arch.b.a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\u0003\u0018\u0001\"\u0006\b\u0002\u0010\u0004\u0018\u0001\"\u0006\b\u0003\u0010\u0005\u0018\u0001*&\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00070\u0006H\n¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"<anonymous>", "", "K", "V", "K1", "V1", "Lcom/bytedance/jedi/model/merge/MergeStrategy$KeyMerge;", "", "invoke", "com/bytedance/jedi/model/repository/SyncExtensions$syncAppendedListTo$3"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function1<a.c<c, List<? extends User>, Unit, List<? extends User>>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public a() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a.c) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull a.c<c, List<User>, Unit, List<User>> cVar) {
            if (PatchProxy.isSupport(new Object[]{cVar}, this, changeQuickRedirect, false, 44812, new Class[]{a.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar}, this, changeQuickRedirect, false, 44812, new Class[]{a.c.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(cVar, "$this$keySyncTo");
            cVar.a((Function2<? super K, ? super V, ? extends K1>) new Function2<c, List<? extends User>, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ a this$0;

                {
                    this.this$0 = r1;
                }

                /* JADX WARNING: type inference failed for: r0v10, types: [kotlin.Unit, java.lang.Object] */
                public final Unit invoke(c cVar, @Nullable List<? extends User> list) {
                    if (PatchProxy.isSupport(new Object[]{cVar, list}, this, changeQuickRedirect, false, 44813, new Class[]{Object.class, List.class}, Object.class)) {
                        return PatchProxy.accessDispatch(new Object[]{cVar, list}, this, changeQuickRedirect, false, 44813, new Class[]{Object.class, List.class}, Object.class);
                    } else if (Intrinsics.areEqual((Object) c.class, (Object) Unit.class)) {
                        if (cVar != null) {
                            return (Unit) cVar;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Unit");
                    } else if (Intrinsics.areEqual((Object) Unit.class, (Object) Unit.class)) {
                        return Unit.INSTANCE;
                    } else {
                        throw new RuntimeException();
                    }
                }
            });
            cVar.a((Function3<? super K, ? super V, ? super V1, ? extends V1>) new Function3<c, List<? extends User>, List<? extends User>, List<? extends User>>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ a this$0;

                {
                    this.this$0 = r1;
                }

                @Nullable
                public final List<User> invoke(c cVar, @Nullable List<? extends User> list, @Nullable List<? extends User> list2) {
                    List<? extends User> list3;
                    List<? extends User> list4;
                    List<? extends User> list5;
                    boolean z = true;
                    if (PatchProxy.isSupport(new Object[]{cVar, list, list2}, this, changeQuickRedirect, false, 44814, new Class[]{Object.class, List.class, List.class}, List.class)) {
                        return (List) PatchProxy.accessDispatch(new Object[]{cVar, list, list2}, this, changeQuickRedirect, false, 44814, new Class[]{Object.class, List.class, List.class}, List.class);
                    }
                    if (cVar.f47926c != 0) {
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
                        if (Intrinsics.areEqual((Object) User.class, (Object) User.class)) {
                            list3 = CollectionsKt.plus(collection, (Iterable<? extends T>) list5);
                        } else {
                            throw new RuntimeException();
                        }
                    } else if (list == null) {
                        return null;
                    } else {
                        if (Intrinsics.areEqual((Object) User.class, (Object) User.class)) {
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
    public static final class b extends Lambda implements Function1<a.d<? extends Object, User, ? extends Object, List<? extends User>>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public b() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a.d) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull a.d<? extends Object, User, ? extends Object, List<User>> dVar) {
            a.d<? extends Object, User, ? extends Object, List<User>> dVar2 = dVar;
            if (PatchProxy.isSupport(new Object[]{dVar2}, this, changeQuickRedirect, false, 44815, new Class[]{a.d.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dVar2}, this, changeQuickRedirect, false, 44815, new Class[]{a.d.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(dVar2, "$this$predicatedSyncTo");
            dVar2.a(AnonymousClass1.INSTANCE);
            dVar2.b(new Function2<User, List<? extends User>, List<? extends User>>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ b this$0;

                {
                    this.this$0 = r1;
                }

                @NotNull
                public final List<User> invoke(User user, @NotNull List<? extends User> list) {
                    List<? extends User> list2 = list;
                    if (PatchProxy.isSupport(new Object[]{user, list2}, this, changeQuickRedirect, false, 44817, new Class[]{Object.class, List.class}, List.class)) {
                        return (List) PatchProxy.accessDispatch(new Object[]{user, list2}, this, changeQuickRedirect, false, 44817, new Class[]{Object.class, List.class}, List.class);
                    }
                    Intrinsics.checkParameterIsNotNull(list2, "curV");
                    Iterable iterable = list2;
                    Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    for (Object next : iterable) {
                        if (!Intrinsics.areEqual((Object) ((User) next).getUid(), (Object) user.getUid()) || !Intrinsics.areEqual((Object) User.class, (Object) User.class) || user != null) {
                            arrayList.add(next);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                        }
                    }
                    return (List) arrayList;
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*$\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0007\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0005H\n¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"<anonymous>", "", "V", "K1", "V1", "Lcom/bytedance/jedi/model/merge/MergeStrategy$BatchMerge;", "", "", "invoke", "com/bytedance/jedi/model/repository/SyncExtensions$syncChangedListTo$1"}, k = 3, mv = {1, 1, 15})
    public static final class c extends Lambda implements Function1<a.C0213a<? extends Object, List<? extends User>, String, User>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public c() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a.C0213a) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull a.C0213a<? extends Object, List<User>, String, User> aVar) {
            a.C0213a<? extends Object, List<User>, String, User> aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{aVar2}, this, changeQuickRedirect, false, 44818, new Class[]{a.C0213a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar2}, this, changeQuickRedirect, false, 44818, new Class[]{a.C0213a.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(aVar2, "$receiver");
            aVar2.a(new Function1<List<? extends User>, List<? extends Pair<? extends String, ? extends User>>>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ c this$0;

                {
                    this.this$0 = r1;
                }

                @NotNull
                public final List<Pair<String, User>> invoke(@NotNull List<? extends User> list) {
                    List<? extends User> list2 = list;
                    if (PatchProxy.isSupport(new Object[]{list2}, this, changeQuickRedirect, false, 44819, new Class[]{List.class}, List.class)) {
                        return (List) PatchProxy.accessDispatch(new Object[]{list2}, this, changeQuickRedirect, false, 44819, new Class[]{List.class}, List.class);
                    }
                    Intrinsics.checkParameterIsNotNull(list2, AdvanceSetting.NETWORK_TYPE);
                    Iterable<User> iterable = list2;
                    Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    for (User user : iterable) {
                        arrayList.add(TuplesKt.to(user.getUid(), user));
                    }
                    return (List) arrayList;
                }
            });
        }
    }

    public d() {
        a((com.bytedance.jedi.model.d.b<K, V, ?, ?>) this.f47931b, (com.bytedance.jedi.model.a.d<K1, V1>) this.f47932c, (Function1<? super a.c<K, V, K1, List<V1>>, Unit>) new a<Object,Unit>());
        a((com.bytedance.jedi.model.a.d<K, V>) this.f47932c, (com.bytedance.jedi.model.a.c<K1, V1>) this.f47933d, (Function1<? super a.C0213a<K, List<V>, K1, V1>, Unit>) new c<Object,Unit>());
        a((com.bytedance.jedi.model.a.c<K, V>) this.f47933d, (com.bytedance.jedi.model.a.d<K1, V1>) this.f47932c, (Function1<? super a.d<K, V, K1, List<V1>>, Unit>) new b<Object,Unit>());
    }

    @NotNull
    public final Observable<com.ss.android.ugc.aweme.following.a.c> a(@NotNull String str, long j, int i, int i2, int i3, int i4, int i5) {
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j2), 20, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f47930a, false, 44811, new Class[]{String.class, Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{str2, new Long(j2), 20, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f47930a, false, 44811, new Class[]{String.class, Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Observable.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "userId");
        g gVar = this.f47931b;
        c cVar = new c(str, j, 20, i2, i3, i4, i5);
        return gVar.a(cVar);
    }
}

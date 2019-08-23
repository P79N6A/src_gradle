package com.ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.jedi.model.a.d;
import com.bytedance.jedi.model.e.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.discover.model.SearchUserList;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.repository.g;
import io.reactivex.Single;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\t\u001a\"\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b0\f0\u000b0\nJD\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/repository/SearchUserRepository;", "Lcom/bytedance/jedi/model/repository/Repository;", "()V", "searchUserCache", "Lcom/ss/android/ugc/aweme/friends/recommendlist/repository/SearchUserCache;", "searchUserFetcher", "Lcom/ss/android/ugc/aweme/friends/recommendlist/repository/SearchUserFetcher;", "userCache", "Lcom/ss/android/ugc/aweme/user/repository/UserCache;", "observeSearchUserList", "Lio/reactivex/Observable;", "", "Lkotlin/Pair;", "", "Lcom/ss/android/ugc/aweme/discover/model/SearchUser;", "searchUserList", "Lio/reactivex/Single;", "Lcom/ss/android/ugc/aweme/discover/model/SearchUserList;", "cursor", "", "keyword", "", "count", "", "type", "pullRefresh", "hotSearch", "source", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class h extends com.bytedance.jedi.model.f.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49006a;

    /* renamed from: b  reason: collision with root package name */
    public final g f49007b = new g();

    /* renamed from: c  reason: collision with root package name */
    public final f f49008c = new f();

    /* renamed from: d  reason: collision with root package name */
    private final g f49009d = com.ss.android.ugc.aweme.base.arch.b.a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\u0003\u0018\u0001\"\u0006\b\u0002\u0010\u0004\u0018\u0001\"\u0006\b\u0003\u0010\u0005\u0018\u0001*&\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00070\u0006H\n¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"<anonymous>", "", "K", "V", "K1", "V1", "Lcom/bytedance/jedi/model/merge/MergeStrategy$KeyMerge;", "", "invoke", "com/bytedance/jedi/model/repository/SyncExtensions$syncAppendedListTo$3"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function1<a.c<Long, List<? extends SearchUser>, Unit, List<? extends SearchUser>>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public a() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a.c) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull a.c<Long, List<SearchUser>, Unit, List<SearchUser>> cVar) {
            if (PatchProxy.isSupport(new Object[]{cVar}, this, changeQuickRedirect, false, 46782, new Class[]{a.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar}, this, changeQuickRedirect, false, 46782, new Class[]{a.c.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(cVar, "$this$keySyncTo");
            cVar.a((Function2<? super K, ? super V, ? extends K1>) new Function2<Long, List<? extends SearchUser>, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ a this$0;

                {
                    this.this$0 = r1;
                }

                /* JADX WARNING: type inference failed for: r0v10, types: [kotlin.Unit, java.lang.Object] */
                public final Unit invoke(Long l, @Nullable List<? extends SearchUser> list) {
                    if (PatchProxy.isSupport(new Object[]{l, list}, this, changeQuickRedirect, false, 46783, new Class[]{Object.class, List.class}, Object.class)) {
                        return PatchProxy.accessDispatch(new Object[]{l, list}, this, changeQuickRedirect, false, 46783, new Class[]{Object.class, List.class}, Object.class);
                    } else if (Intrinsics.areEqual((Object) Long.class, (Object) Unit.class)) {
                        if (l != null) {
                            return (Unit) l;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Unit");
                    } else if (Intrinsics.areEqual((Object) Unit.class, (Object) Unit.class)) {
                        return Unit.INSTANCE;
                    } else {
                        throw new RuntimeException();
                    }
                }
            });
            cVar.a((Function3<? super K, ? super V, ? super V1, ? extends V1>) new Function3<Long, List<? extends SearchUser>, List<? extends SearchUser>, List<? extends SearchUser>>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ a this$0;

                {
                    this.this$0 = r1;
                }

                @Nullable
                public final List<SearchUser> invoke(Long l, @Nullable List<? extends SearchUser> list, @Nullable List<? extends SearchUser> list2) {
                    List<? extends SearchUser> list3;
                    List<? extends SearchUser> list4;
                    List<? extends SearchUser> list5;
                    boolean z = true;
                    if (PatchProxy.isSupport(new Object[]{l, list, list2}, this, changeQuickRedirect, false, 46784, new Class[]{Object.class, List.class, List.class}, List.class)) {
                        return (List) PatchProxy.accessDispatch(new Object[]{l, list, list2}, this, changeQuickRedirect, false, 46784, new Class[]{Object.class, List.class, List.class}, List.class);
                    }
                    if (l.longValue() != 0) {
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
                        if (Intrinsics.areEqual((Object) SearchUser.class, (Object) SearchUser.class)) {
                            list3 = CollectionsKt.plus(collection, (Iterable<? extends T>) list5);
                        } else {
                            throw new RuntimeException();
                        }
                    } else if (list == null) {
                        return null;
                    } else {
                        if (Intrinsics.areEqual((Object) SearchUser.class, (Object) SearchUser.class)) {
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
    public static final class b extends Lambda implements Function1<a.d<? extends Object, User, ? extends Object, List<? extends SearchUser>>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public b() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a.d) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull a.d<? extends Object, User, ? extends Object, List<SearchUser>> dVar) {
            a.d<? extends Object, User, ? extends Object, List<SearchUser>> dVar2 = dVar;
            if (PatchProxy.isSupport(new Object[]{dVar2}, this, changeQuickRedirect, false, 46785, new Class[]{a.d.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dVar2}, this, changeQuickRedirect, false, 46785, new Class[]{a.d.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(dVar2, "$this$predicatedSyncTo");
            dVar2.a(AnonymousClass1.INSTANCE);
            dVar2.b(new Function2<User, List<? extends SearchUser>, List<? extends SearchUser>>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ b this$0;

                {
                    this.this$0 = r1;
                }

                @NotNull
                public final List<SearchUser> invoke(User user, @NotNull List<? extends SearchUser> list) {
                    List<? extends SearchUser> list2 = list;
                    if (PatchProxy.isSupport(new Object[]{user, list2}, this, changeQuickRedirect, false, 46787, new Class[]{Object.class, List.class}, List.class)) {
                        return (List) PatchProxy.accessDispatch(new Object[]{user, list2}, this, changeQuickRedirect, false, 46787, new Class[]{Object.class, List.class}, List.class);
                    }
                    Intrinsics.checkParameterIsNotNull(list2, "curV");
                    Iterable iterable = list2;
                    Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    for (Object next : iterable) {
                        User user2 = user;
                        SearchUser searchUser = (SearchUser) next;
                        User user3 = searchUser.user;
                        Intrinsics.checkExpressionValueIsNotNull(user3, "cur.user");
                        if (Intrinsics.areEqual((Object) user3.getUid(), (Object) user2.getUid())) {
                            searchUser.setUser(user2);
                        }
                        arrayList.add(next);
                    }
                    return (List) arrayList;
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*$\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0007\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0005H\n¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"<anonymous>", "", "V", "K1", "V1", "Lcom/bytedance/jedi/model/merge/MergeStrategy$BatchMerge;", "", "", "invoke", "com/bytedance/jedi/model/repository/SyncExtensions$syncChangedListTo$1"}, k = 3, mv = {1, 1, 15})
    public static final class c extends Lambda implements Function1<a.C0213a<? extends Object, List<? extends SearchUser>, String, User>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public c() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a.C0213a) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull a.C0213a<? extends Object, List<SearchUser>, String, User> aVar) {
            a.C0213a<? extends Object, List<SearchUser>, String, User> aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{aVar2}, this, changeQuickRedirect, false, 46788, new Class[]{a.C0213a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar2}, this, changeQuickRedirect, false, 46788, new Class[]{a.C0213a.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(aVar2, "$receiver");
            aVar2.a(new Function1<List<? extends SearchUser>, List<? extends Pair<? extends String, ? extends User>>>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ c this$0;

                {
                    this.this$0 = r1;
                }

                @NotNull
                public final List<Pair<String, User>> invoke(@NotNull List<? extends SearchUser> list) {
                    List<? extends SearchUser> list2 = list;
                    if (PatchProxy.isSupport(new Object[]{list2}, this, changeQuickRedirect, false, 46789, new Class[]{List.class}, List.class)) {
                        return (List) PatchProxy.accessDispatch(new Object[]{list2}, this, changeQuickRedirect, false, 46789, new Class[]{List.class}, List.class);
                    }
                    Intrinsics.checkParameterIsNotNull(list2, AdvanceSetting.NETWORK_TYPE);
                    Iterable<SearchUser> iterable = list2;
                    Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    for (SearchUser searchUser : iterable) {
                        User user = searchUser.user;
                        Intrinsics.checkExpressionValueIsNotNull(user, "it.user");
                        arrayList.add(TuplesKt.to(user.getUid(), searchUser.user));
                    }
                    return (List) arrayList;
                }
            });
        }
    }

    public h() {
        a((com.bytedance.jedi.model.d.b<K, V, ?, ?>) this.f49007b, (d<K1, V1>) this.f49008c, (Function1<? super a.c<K, V, K1, List<V1>>, Unit>) new a<Object,Unit>());
        a((d<K, V>) this.f49008c, (com.bytedance.jedi.model.a.c<K1, V1>) this.f49009d, (Function1<? super a.C0213a<K, List<V>, K1, V1>, Unit>) new c<Object,Unit>());
        a((com.bytedance.jedi.model.a.c<K, V>) this.f49009d, (d<K1, V1>) this.f49008c, (Function1<? super a.d<K, V, K1, List<V1>>, Unit>) new b<Object,Unit>());
    }

    @NotNull
    public final Single<SearchUserList> a(long j, @NotNull String str, int i, int i2, int i3, int i4, @NotNull String str2) {
        long j2 = j;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str3, 10, 1, 1, Integer.valueOf(i4), str4}, this, f49006a, false, 46780, new Class[]{Long.TYPE, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Single.class)) {
            return (Single) PatchProxy.accessDispatch(new Object[]{new Long(j2), str3, 10, 1, 1, Integer.valueOf(i4), str4}, this, f49006a, false, 46780, new Class[]{Long.TYPE, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Single.class);
        }
        Intrinsics.checkParameterIsNotNull(str3, "keyword");
        Intrinsics.checkParameterIsNotNull(str4, "source");
        g gVar = this.f49007b;
        i iVar = new i(j, str, 10, 1, 1, i4, str2);
        Single<SearchUserList> fromObservable = Single.fromObservable(gVar.a(iVar));
        Intrinsics.checkExpressionValueIsNotNull(fromObservable, "Single.fromObservable(se…esh, hotSearch, source)))");
        return fromObservable;
    }
}

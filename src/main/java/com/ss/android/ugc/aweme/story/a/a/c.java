package com.ss.android.ugc.aweme.story.a.a;

import com.bytedance.jedi.model.c.f;
import com.bytedance.jedi.model.e.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.a.b.l;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.feed.c.g;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ,\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001aJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u0018J\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001a0\u001eJ\u0018\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/story/repo/lifefeed/LifeFeedRepository;", "Lcom/bytedance/jedi/model/repository/Repository;", "lifeFeedAllCache", "Lcom/ss/android/ugc/aweme/story/repo/lifefeed/LifeFeedCache;", "userStoryCache", "Lcom/ss/android/ugc/aweme/story/repo/storydetail/UserStoryCache;", "(Lcom/ss/android/ugc/aweme/story/repo/lifefeed/LifeFeedCache;Lcom/ss/android/ugc/aweme/story/repo/storydetail/UserStoryCache;)V", "lifeFeedFetcher", "Lcom/ss/android/ugc/aweme/story/repo/lifefeed/LifeFeedFetcher;", "addUploadStory", "", "uploadStory", "Lcom/ss/android/ugc/aweme/story/api/model/AwemeWithComment;", "curUserStory", "Lcom/ss/android/ugc/aweme/story/api/model/UserStory;", "fetchLifeFeed", "Lio/reactivex/Single;", "Lcom/ss/android/ugc/aweme/story/feed/model/LifeFeed;", "cursor", "", "count", "", "tabType", "insertUserId", "", "getLatestStories", "", "getStoryByUid", "uid", "observeLifeFeedList", "Lio/reactivex/Observable;", "updateAfterPublish", "publishedStory", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c extends com.bytedance.jedi.model.f.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71778a;

    /* renamed from: b  reason: collision with root package name */
    public final b f71779b = new b();

    /* renamed from: c  reason: collision with root package name */
    public final a f71780c;

    /* renamed from: d  reason: collision with root package name */
    public final l f71781d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\u0003\u0018\u0001\"\u0006\b\u0002\u0010\u0004\u0018\u0001\"\u0006\b\u0003\u0010\u0005\u0018\u0001*&\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0007\u0012\u0004\u0012\u0002H\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00070\u0006H\n¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"<anonymous>", "", "K", "V", "K1", "V1", "Lcom/bytedance/jedi/model/merge/MergeStrategy$KeyMerge;", "", "invoke", "com/bytedance/jedi/model/repository/SyncExtensions$syncAppendedListTo$3"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function1<a.c<Long, List<? extends UserStory>, Unit, List<? extends UserStory>>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public a() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a.c) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull a.c<Long, List<UserStory>, Unit, List<UserStory>> cVar) {
            if (PatchProxy.isSupport(new Object[]{cVar}, this, changeQuickRedirect, false, 85025, new Class[]{a.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar}, this, changeQuickRedirect, false, 85025, new Class[]{a.c.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(cVar, "$this$keySyncTo");
            cVar.a((Function2<? super K, ? super V, ? extends K1>) new Function2<Long, List<? extends UserStory>, Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ a this$0;

                {
                    this.this$0 = r1;
                }

                /* JADX WARNING: type inference failed for: r0v5, types: [kotlin.Unit, java.lang.Object] */
                public final Unit invoke(Long l, @Nullable List<? extends UserStory> list) {
                    if (PatchProxy.isSupport(new Object[]{l, list}, this, changeQuickRedirect, false, 85026, new Class[]{Object.class, List.class}, Object.class)) {
                        return PatchProxy.accessDispatch(new Object[]{l, list}, this, changeQuickRedirect, false, 85026, new Class[]{Object.class, List.class}, Object.class);
                    }
                    l.longValue();
                    return Unit.INSTANCE;
                }
            });
            cVar.a((Function3<? super K, ? super V, ? super V1, ? extends V1>) new Function3<Long, List<? extends UserStory>, List<? extends UserStory>, List<? extends UserStory>>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ a this$0;

                {
                    this.this$0 = r1;
                }

                @Nullable
                public final List<UserStory> invoke(Long l, @Nullable List<? extends UserStory> list, @Nullable List<? extends UserStory> list2) {
                    List<? extends UserStory> list3;
                    List<? extends UserStory> list4;
                    boolean z = true;
                    if (PatchProxy.isSupport(new Object[]{l, list, list2}, this, changeQuickRedirect, false, 85027, new Class[]{Object.class, List.class, List.class}, List.class)) {
                        return (List) PatchProxy.accessDispatch(new Object[]{l, list, list2}, this, changeQuickRedirect, false, 85027, new Class[]{Object.class, List.class, List.class}, List.class);
                    }
                    if (l.longValue() != 0) {
                        z = false;
                    }
                    if (!z) {
                        if (list2 == null) {
                            list3 = CollectionsKt.emptyList();
                        } else {
                            list3 = list2;
                        }
                        Collection collection = list3;
                        if (list == null) {
                            list4 = CollectionsKt.emptyList();
                        } else {
                            list4 = list;
                        }
                        Iterable<UserStory> iterable = list4;
                        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                        for (UserStory userStory : iterable) {
                            g.f72503b.g(userStory);
                            arrayList.add(userStory);
                        }
                        return CollectionsKt.plus(collection, (Iterable<? extends T>) (List) arrayList);
                    } else if (list == null) {
                        return null;
                    } else {
                        Iterable<UserStory> iterable2 = list;
                        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
                        for (UserStory userStory2 : iterable2) {
                            g.f72503b.g(userStory2);
                            arrayList2.add(userStory2);
                        }
                        return (List) arrayList2;
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\u0003\u0018\u0001*(\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u0002H\u0002\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00060\u0004H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "V", "V1", "Lcom/bytedance/jedi/model/merge/MergeStrategy$PredicatedMerge;", "", "", "invoke", "com/bytedance/jedi/model/repository/SyncExtensions$syncChangedItemTo$2"}, k = 3, mv = {1, 1, 15})
    public static final class b extends Lambda implements Function1<a.d<? extends Object, UserStory, ? extends Object, List<? extends UserStory>>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public b() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a.d) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull a.d<? extends Object, UserStory, ? extends Object, List<UserStory>> dVar) {
            a.d<? extends Object, UserStory, ? extends Object, List<UserStory>> dVar2 = dVar;
            if (PatchProxy.isSupport(new Object[]{dVar2}, this, changeQuickRedirect, false, 85028, new Class[]{a.d.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dVar2}, this, changeQuickRedirect, false, 85028, new Class[]{a.d.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(dVar2, "$this$predicatedSyncTo");
            dVar2.a(AnonymousClass1.INSTANCE);
            dVar2.b(new Function2<UserStory, List<? extends UserStory>, List<? extends UserStory>>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ b this$0;

                {
                    this.this$0 = r1;
                }

                @NotNull
                public final List<UserStory> invoke(UserStory userStory, @NotNull List<? extends UserStory> list) {
                    List<? extends UserStory> list2 = list;
                    if (PatchProxy.isSupport(new Object[]{userStory, list2}, this, changeQuickRedirect, false, 85030, new Class[]{Object.class, List.class}, List.class)) {
                        return (List) PatchProxy.accessDispatch(new Object[]{userStory, list2}, this, changeQuickRedirect, false, 85030, new Class[]{Object.class, List.class}, List.class);
                    }
                    Intrinsics.checkParameterIsNotNull(list2, "curV");
                    Iterable iterable = list2;
                    Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    for (Object next : iterable) {
                        UserStory userStory2 = userStory;
                        UserStory userStory3 = (UserStory) next;
                        if (g.f72503b.a(userStory3, userStory2)) {
                            userStory3.setReadFlag(userStory2.getReadFlag());
                            userStory3.setAwemeList(userStory2.getAwemeList());
                            userStory3.setTotalCount(userStory2.getTotalCount());
                        }
                        arrayList.add(next);
                    }
                    return (List) arrayList;
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*$\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0007\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0005H\n¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"<anonymous>", "", "V", "K1", "V1", "Lcom/bytedance/jedi/model/merge/MergeStrategy$BatchMerge;", "", "", "invoke", "com/bytedance/jedi/model/repository/SyncExtensions$syncChangedListTo$1"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.story.a.a.c$c  reason: collision with other inner class name */
    public static final class C0746c extends Lambda implements Function1<a.C0213a<? extends Object, List<? extends UserStory>, String, UserStory>, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public C0746c() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((a.C0213a) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull a.C0213a<? extends Object, List<UserStory>, String, UserStory> aVar) {
            a.C0213a<? extends Object, List<UserStory>, String, UserStory> aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{aVar2}, this, changeQuickRedirect, false, 85031, new Class[]{a.C0213a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar2}, this, changeQuickRedirect, false, 85031, new Class[]{a.C0213a.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(aVar2, "$receiver");
            aVar2.a(new Function1<List<? extends UserStory>, List<? extends Pair<? extends String, ? extends UserStory>>>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ C0746c this$0;

                {
                    this.this$0 = r1;
                }

                @NotNull
                public final List<Pair<String, UserStory>> invoke(@NotNull List<? extends UserStory> list) {
                    String str;
                    List<? extends UserStory> list2 = list;
                    if (PatchProxy.isSupport(new Object[]{list2}, this, changeQuickRedirect, false, 85032, new Class[]{List.class}, List.class)) {
                        return (List) PatchProxy.accessDispatch(new Object[]{list2}, this, changeQuickRedirect, false, 85032, new Class[]{List.class}, List.class);
                    }
                    Intrinsics.checkParameterIsNotNull(list2, AdvanceSetting.NETWORK_TYPE);
                    Iterable<UserStory> iterable = list2;
                    Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    for (UserStory userStory : iterable) {
                        User user = userStory.getUser();
                        if (user != null) {
                            str = user.getUid();
                            if (str != null) {
                                arrayList.add(TuplesKt.to(str, userStory));
                            }
                        }
                        str = "";
                        arrayList.add(TuplesKt.to(str, userStory));
                    }
                    return (List) arrayList;
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/jedi/model/datasource/Optional;", "", "Lcom/ss/android/ugc/aweme/story/api/model/UserStory;", "test"}, k = 3, mv = {1, 1, 15})
    public static final class d<T> implements Predicate<f<? extends List<? extends UserStory>>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71782a;

        /* renamed from: b  reason: collision with root package name */
        public static final d f71783b = new d();

        d() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            f fVar = (f) obj;
            if (PatchProxy.isSupport(new Object[]{fVar}, this, f71782a, false, 85033, new Class[]{f.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{fVar}, this, f71782a, false, 85033, new Class[]{f.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(fVar, AdvanceSetting.NETWORK_TYPE);
            if (fVar.a() != null) {
                return true;
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/story/api/model/UserStory;", "it", "Lcom/bytedance/jedi/model/datasource/Optional;", "apply"}, k = 3, mv = {1, 1, 15})
    public static final class e<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71784a;

        /* renamed from: b  reason: collision with root package name */
        public static final e f71785b = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Object obj2;
            f fVar = (f) obj;
            if (PatchProxy.isSupport(new Object[]{fVar}, this, f71784a, false, 85034, new Class[]{f.class}, List.class)) {
                obj2 = PatchProxy.accessDispatch(new Object[]{fVar}, this, f71784a, false, 85034, new Class[]{f.class}, List.class);
            } else {
                Intrinsics.checkParameterIsNotNull(fVar, AdvanceSetting.NETWORK_TYPE);
                obj2 = fVar.a();
                if (obj2 == null) {
                    Intrinsics.throwNpe();
                }
            }
            return (List) obj2;
        }
    }

    public c(@NotNull a aVar, @NotNull l lVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "lifeFeedAllCache");
        Intrinsics.checkParameterIsNotNull(lVar, "userStoryCache");
        this.f71780c = aVar;
        this.f71781d = lVar;
        a((com.bytedance.jedi.model.d.b<K, V, ?, ?>) this.f71779b, (com.bytedance.jedi.model.a.d<K1, V1>) this.f71780c, (Function1<? super a.c<K, V, K1, List<V1>>, Unit>) new a<Object,Unit>());
        a((com.bytedance.jedi.model.a.d<K, V>) this.f71780c, (com.bytedance.jedi.model.a.c<K1, V1>) this.f71781d, (Function1<? super a.C0213a<K, List<V>, K1, V1>, Unit>) new C0746c<Object,Unit>());
        a((com.bytedance.jedi.model.a.c<K, V>) this.f71781d, (com.bytedance.jedi.model.a.d<K1, V1>) this.f71780c, (Function1<? super a.d<K, V, K1, List<V1>>, Unit>) new b<Object,Unit>());
    }

    @NotNull
    public final Single<com.ss.android.ugc.aweme.story.feed.model.a> a(long j, int i, int i2, @NotNull String str) {
        long j2 = j;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), 20, Integer.valueOf(i2), str2}, this, f71778a, false, 85020, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Single.class)) {
            Object[] objArr = {new Long(j2), 20, Integer.valueOf(i2), str2};
            return (Single) PatchProxy.accessDispatch(objArr, this, f71778a, false, 85020, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Single.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "insertUserId");
        b bVar = this.f71779b;
        d dVar = new d(j, 20, i2, str);
        Single<com.ss.android.ugc.aweme.story.feed.model.a> fromObservable = Single.fromObservable(bVar.a(dVar));
        Intrinsics.checkExpressionValueIsNotNull(fromObservable, "Single.fromObservable(\n …              )\n        )");
        return fromObservable;
    }
}

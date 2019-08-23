package com.ss.android.ugc.aweme.shortvideo.music.collect;

import a.g;
import a.i;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.music.IMusicService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.music.collect.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlinx.coroutines.af;
import kotlinx.coroutines.bd;
import kotlinx.coroutines.bk;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 +2\u00020\u0001:\u0003+,-B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\n\u0010$\u001a\u0004\u0018\u00010#H\u0002J\u0006\u0010%\u001a\u00020!J#\u0010&\u001a\u0004\u0018\u00010#2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0002\u0010(J\u0006\u0010)\u001a\u00020!J\u0006\u0010*\u001a\u00020!R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/music/collect/CollectMusicManager;", "", "()V", "cursor", "", "getCursor", "()I", "setCursor", "(I)V", "hasMore", "", "getHasMore", "()Z", "setHasMore", "(Z)V", "isInitialLoading", "setInitialLoading", "isMoreLoading", "setMoreLoading", "musicList", "", "Lcom/ss/android/ugc/aweme/shortvideo/model/MusicModel;", "getMusicList", "()Ljava/util/List;", "setMusicList", "(Ljava/util/List;)V", "onGetCollectMusicCallback", "Lcom/ss/android/ugc/aweme/shortvideo/music/collect/CollectMusicManager$OnGetCollectMusicCallback;", "getOnGetCollectMusicCallback", "()Lcom/ss/android/ugc/aweme/shortvideo/music/collect/CollectMusicManager$OnGetCollectMusicCallback;", "setOnGetCollectMusicCallback", "(Lcom/ss/android/ugc/aweme/shortvideo/music/collect/CollectMusicManager$OnGetCollectMusicCallback;)V", "cacheCollectMusic", "", "collectMusicList", "Lcom/ss/android/ugc/aweme/music/model/CollectedMusicList;", "getCollectMusicCache", "initCollectMusicList", "loadCollectedMusicList", "count", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadMoreCollectMusic", "refreshCollectMusic", "Companion", "OnGetCollectMusicCallback", "SingletonHolder", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68439a;
    @NotNull
    public static final a h = c.f68445a;
    public static final C0721a i = new C0721a((byte) 0);
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public b f68440b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public List<MusicModel> f68441c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f68442d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f68443e;

    /* renamed from: f  reason: collision with root package name */
    public int f68444f;
    public boolean g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/music/collect/CollectMusicManager$Companion;", "", "()V", "instance", "Lcom/ss/android/ugc/aweme/shortvideo/music/collect/CollectMusicManager;", "instance$annotations", "getInstance", "()Lcom/ss/android/ugc/aweme/shortvideo/music/collect/CollectMusicManager;", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.music.collect.a$a  reason: collision with other inner class name */
    public static final class C0721a {
        private C0721a() {
        }

        @NotNull
        public static a a() {
            return a.h;
        }

        public /* synthetic */ C0721a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u001e\u0010\u0005\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&J\u001e\u0010\f\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH&¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/music/collect/CollectMusicManager$OnGetCollectMusicCallback;", "", "onInitialLoadFail", "", "onInitialLoading", "onMoreResult", "musicList", "", "Lcom/ss/android/ugc/aweme/shortvideo/model/MusicModel;", "hasMore", "", "onRefreshEmpty", "onRefreshResult", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface b {
        void a();

        void a(@NotNull List<? extends MusicModel> list, boolean z);

        void b();

        void c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/music/collect/CollectMusicManager$SingletonHolder;", "", "()V", "holder", "Lcom/ss/android/ugc/aweme/shortvideo/music/collect/CollectMusicManager;", "getHolder", "()Lcom/ss/android/ugc/aweme/shortvideo/music/collect/CollectMusicManager;", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    static final class c {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        static final a f68445a = new a((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        public static final c f68446b = new c();

        private c() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 15})
    @DebugMetadata(b = "CollectMusicManager.kt", c = {}, d = "invokeSuspend", e = "com.ss.android.ugc.aweme.shortvideo.music.collect.CollectMusicManager$initCollectMusicList$1")
    static final class d extends k implements Function2<af, kotlin.coroutines.c<? super Unit>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        int label;
        private af p$;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.this$0 = aVar;
        }

        @NotNull
        public final kotlin.coroutines.c<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.c<?> cVar) {
            kotlin.coroutines.c<?> cVar2 = cVar;
            if (PatchProxy.isSupport(new Object[]{obj, cVar2}, this, changeQuickRedirect, false, 77815, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class)) {
                return (kotlin.coroutines.c) PatchProxy.accessDispatch(new Object[]{obj, cVar2}, this, changeQuickRedirect, false, 77815, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            }
            Intrinsics.checkParameterIsNotNull(cVar2, "completion");
            d dVar = new d(this.this$0, cVar2);
            dVar.p$ = (af) obj;
            return dVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            Object obj3 = obj;
            if (PatchProxy.isSupport(new Object[]{obj3, obj2}, this, changeQuickRedirect, false, 77816, new Class[]{Object.class, Object.class}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{obj3, obj2}, this, changeQuickRedirect, false, 77816, new Class[]{Object.class, Object.class}, Object.class);
            }
            return ((d) create(obj3, (kotlin.coroutines.c) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 77814, new Class[]{Object.class}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 77814, new Class[]{Object.class}, Object.class);
            } else if (this.label == 0) {
                IMainService iMainService = (IMainService) ServiceManager.get().getService(IMainService.class);
                if (iMainService != null) {
                    IMusicService musicService = iMainService.musicService();
                    if (musicService != null) {
                        i<CollectedMusicList> userCollectedMusicList = musicService.userCollectedMusicList(0, 12);
                        if (userCollectedMusicList != null) {
                            userCollectedMusicList.a((g<TResult, TContinuationResult>) new g<TResult, TContinuationResult>(this) {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f68447a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ d f68448b;

                                {
                                    this.f68448b = r1;
                                }

                                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.util.Collection} */
                                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.util.List} */
                                /* JADX WARNING: Multi-variable type inference failed */
                                /* JADX WARNING: Removed duplicated region for block: B:51:0x01a8  */
                                /* Code decompiled incorrectly, please refer to instructions dump. */
                                public final /* synthetic */ java.lang.Object then(a.i r10) {
                                    /*
                                        r9 = this;
                                        r7 = 1
                                        java.lang.Object[] r0 = new java.lang.Object[r7]
                                        r8 = 0
                                        r0[r8] = r10
                                        com.meituan.robust.ChangeQuickRedirect r2 = f68447a
                                        java.lang.Class[] r5 = new java.lang.Class[r7]
                                        java.lang.Class<a.i> r1 = a.i.class
                                        r5[r8] = r1
                                        java.lang.Class<kotlin.Unit> r6 = kotlin.Unit.class
                                        r3 = 0
                                        r4 = 77817(0x12ff9, float:1.09045E-40)
                                        r1 = r9
                                        boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                                        if (r0 == 0) goto L_0x0035
                                        java.lang.Object[] r0 = new java.lang.Object[r7]
                                        r0[r8] = r10
                                        com.meituan.robust.ChangeQuickRedirect r2 = f68447a
                                        r3 = 0
                                        r4 = 77817(0x12ff9, float:1.09045E-40)
                                        java.lang.Class[] r5 = new java.lang.Class[r7]
                                        java.lang.Class<a.i> r1 = a.i.class
                                        r5[r8] = r1
                                        java.lang.Class<kotlin.Unit> r6 = kotlin.Unit.class
                                        r1 = r9
                                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                                        kotlin.Unit r0 = (kotlin.Unit) r0
                                        return r0
                                    L_0x0035:
                                        java.lang.String r0 = "task"
                                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r10, r0)
                                        boolean r0 = r10.d()
                                        r1 = 10
                                        r2 = 0
                                        if (r0 != 0) goto L_0x013e
                                        boolean r0 = r10.b()
                                        if (r0 == 0) goto L_0x013e
                                        java.lang.Object r0 = r10.e()
                                        if (r0 == 0) goto L_0x0125
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a$d r0 = r9.f68448b
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a r0 = r0.this$0
                                        java.lang.Object r3 = r10.e()
                                        java.lang.String r4 = "task.result"
                                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                                        com.ss.android.ugc.aweme.music.model.CollectedMusicList r3 = (com.ss.android.ugc.aweme.music.model.CollectedMusicList) r3
                                        int r3 = r3.cursor
                                        r0.f68444f = r3
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a$d r0 = r9.f68448b
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a r0 = r0.this$0
                                        java.lang.Object r3 = r10.e()
                                        java.lang.String r4 = "task.result"
                                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                                        com.ss.android.ugc.aweme.music.model.CollectedMusicList r3 = (com.ss.android.ugc.aweme.music.model.CollectedMusicList) r3
                                        boolean r3 = r3.isHasMore()
                                        r0.g = r3
                                        java.lang.Object r0 = r10.e()
                                        java.lang.String r3 = "task.result"
                                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
                                        com.ss.android.ugc.aweme.music.model.CollectedMusicList r0 = (com.ss.android.ugc.aweme.music.model.CollectedMusicList) r0
                                        java.util.List<com.ss.android.ugc.aweme.music.model.Music> r0 = r0.items
                                        if (r0 == 0) goto L_0x010c
                                        java.lang.Object r0 = r10.e()
                                        java.lang.String r3 = "task.result"
                                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
                                        com.ss.android.ugc.aweme.music.model.CollectedMusicList r0 = (com.ss.android.ugc.aweme.music.model.CollectedMusicList) r0
                                        java.util.List<com.ss.android.ugc.aweme.music.model.Music> r0 = r0.items
                                        int r0 = r0.size()
                                        if (r0 <= 0) goto L_0x010c
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a$d r0 = r9.f68448b
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a r0 = r0.this$0
                                        java.lang.Object r3 = r10.e()
                                        java.lang.String r4 = "task.result"
                                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                                        com.ss.android.ugc.aweme.music.model.CollectedMusicList r3 = (com.ss.android.ugc.aweme.music.model.CollectedMusicList) r3
                                        r0.a((com.ss.android.ugc.aweme.music.model.CollectedMusicList) r3)
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a$d r0 = r9.f68448b
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a r0 = r0.this$0
                                        java.lang.Object r3 = r10.e()
                                        java.lang.String r4 = "task.result"
                                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                                        com.ss.android.ugc.aweme.music.model.CollectedMusicList r3 = (com.ss.android.ugc.aweme.music.model.CollectedMusicList) r3
                                        java.util.List<com.ss.android.ugc.aweme.music.model.Music> r3 = r3.items
                                        java.lang.String r4 = "task.result.items"
                                        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                                        java.lang.Iterable r3 = (java.lang.Iterable) r3
                                        java.util.ArrayList r4 = new java.util.ArrayList
                                        int r1 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r3, r1)
                                        r4.<init>(r1)
                                        java.util.Collection r4 = (java.util.Collection) r4
                                        java.util.Iterator r1 = r3.iterator()
                                    L_0x00d2:
                                        boolean r3 = r1.hasNext()
                                        if (r3 == 0) goto L_0x00e6
                                        java.lang.Object r3 = r1.next()
                                        com.ss.android.ugc.aweme.music.model.Music r3 = (com.ss.android.ugc.aweme.music.model.Music) r3
                                        com.ss.android.ugc.aweme.shortvideo.model.MusicModel r3 = r3.convertToMusicModel()
                                        r4.add(r3)
                                        goto L_0x00d2
                                    L_0x00e6:
                                        java.util.List r4 = (java.util.List) r4
                                        java.util.Collection r4 = (java.util.Collection) r4
                                        java.util.List r1 = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection<? extends T>) r4)
                                        r0.a((java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel>) r1)
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a$d r0 = r9.f68448b
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a r0 = r0.this$0
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a$b r0 = r0.f68440b
                                        if (r0 == 0) goto L_0x010b
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a$d r1 = r9.f68448b
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a r1 = r1.this$0
                                        java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r1 = r1.f68441c
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a$d r2 = r9.f68448b
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a r2 = r2.this$0
                                        boolean r2 = r2.g
                                        r0.a(r1, r2)
                                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                        return r0
                                    L_0x010b:
                                        return r2
                                    L_0x010c:
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a$d r0 = r9.f68448b
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a r0 = r0.this$0
                                        java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r0 = r0.f68441c
                                        r0.clear()
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a$d r0 = r9.f68448b
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a r0 = r0.this$0
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a$b r0 = r0.f68440b
                                        if (r0 == 0) goto L_0x0124
                                        r0.a()
                                        kotlin.Unit r2 = kotlin.Unit.INSTANCE
                                        goto L_0x01ae
                                    L_0x0124:
                                        return r2
                                    L_0x0125:
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a$d r0 = r9.f68448b
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a r0 = r0.this$0
                                        java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r0 = r0.f68441c
                                        r0.clear()
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a$d r0 = r9.f68448b
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a r0 = r0.this$0
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a$b r0 = r0.f68440b
                                        if (r0 == 0) goto L_0x013d
                                        r0.a()
                                        kotlin.Unit r2 = kotlin.Unit.INSTANCE
                                        goto L_0x01ae
                                    L_0x013d:
                                        return r2
                                    L_0x013e:
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a$d r0 = r9.f68448b
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a r0 = r0.this$0
                                        com.ss.android.ugc.aweme.music.model.CollectedMusicList r0 = r0.c()
                                        if (r0 == 0) goto L_0x0175
                                        java.util.List<com.ss.android.ugc.aweme.music.model.Music> r0 = r0.items
                                        if (r0 == 0) goto L_0x0175
                                        java.lang.Iterable r0 = (java.lang.Iterable) r0
                                        java.util.ArrayList r3 = new java.util.ArrayList
                                        int r1 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r1)
                                        r3.<init>(r1)
                                        java.util.Collection r3 = (java.util.Collection) r3
                                        java.util.Iterator r0 = r0.iterator()
                                    L_0x015d:
                                        boolean r1 = r0.hasNext()
                                        if (r1 == 0) goto L_0x0171
                                        java.lang.Object r1 = r0.next()
                                        com.ss.android.ugc.aweme.music.model.Music r1 = (com.ss.android.ugc.aweme.music.model.Music) r1
                                        com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = r1.convertToMusicModel()
                                        r3.add(r1)
                                        goto L_0x015d
                                    L_0x0171:
                                        r0 = r3
                                        java.util.List r0 = (java.util.List) r0
                                        goto L_0x0176
                                    L_0x0175:
                                        r0 = r2
                                    L_0x0176:
                                        if (r0 == 0) goto L_0x01a0
                                        boolean r1 = r0.isEmpty()
                                        if (r1 != 0) goto L_0x01a0
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a$d r1 = r9.f68448b
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a r1 = r1.this$0
                                        java.util.Collection r0 = (java.util.Collection) r0
                                        java.util.List r0 = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection<? extends T>) r0)
                                        r1.a((java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel>) r0)
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a$d r0 = r9.f68448b
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a r0 = r0.this$0
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a$b r0 = r0.f68440b
                                        if (r0 == 0) goto L_0x019f
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a$d r1 = r9.f68448b
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a r1 = r1.this$0
                                        java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r1 = r1.f68441c
                                        r0.a(r1, r8)
                                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                        return r0
                                    L_0x019f:
                                        return r2
                                    L_0x01a0:
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a$d r0 = r9.f68448b
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a r0 = r0.this$0
                                        com.ss.android.ugc.aweme.shortvideo.music.collect.a$b r0 = r0.f68440b
                                        if (r0 == 0) goto L_0x01ae
                                        r0.c()
                                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                        return r0
                                    L_0x01ae:
                                        return r2
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.music.collect.a.d.AnonymousClass1.then(a.i):java.lang.Object");
                                }
                            });
                        }
                    }
                }
                this.this$0.f68442d = false;
                return Unit.INSTANCE;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/music/model/CollectedMusicList;", "kotlin.jvm.PlatformType", "then", "com/ss/android/ugc/aweme/shortvideo/music/collect/CollectMusicManager$loadCollectedMusicList$2$1"}, k = 3, mv = {1, 1, 15})
    static final class e<TTaskResult, TContinuationResult> implements g<TResult, TContinuationResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68449a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.c f68450b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f68451c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f68452d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f68453e;

        e(kotlin.coroutines.c cVar, a aVar, int i, int i2) {
            this.f68450b = cVar;
            this.f68451c = aVar;
            this.f68452d = i;
            this.f68453e = i2;
        }

        public final /* synthetic */ Object then(i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f68449a, false, 77818, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f68449a, false, 77818, new Class[]{i.class}, Void.TYPE);
            } else {
                Intrinsics.checkExpressionValueIsNotNull(iVar, AdvanceSetting.NETWORK_TYPE);
                if (iVar.d() || !iVar.b()) {
                    if (this.f68451c.f68442d) {
                        CollectedMusicList c2 = this.f68451c.c();
                        if (c2 != null) {
                            c2.setHasMore(false);
                        }
                        this.f68450b.resumeWith(l.m673constructorimpl(c2));
                    } else {
                        this.f68450b.resumeWith(l.m673constructorimpl(null));
                    }
                } else if (iVar.e() != null) {
                    this.f68450b.resumeWith(l.m673constructorimpl(iVar.e()));
                    if (this.f68452d == 0) {
                        a aVar = this.f68451c;
                        Object e2 = iVar.e();
                        Intrinsics.checkExpressionValueIsNotNull(e2, "it.result");
                        aVar.a((CollectedMusicList) e2);
                    }
                } else {
                    this.f68450b.resumeWith(l.m673constructorimpl(null));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 15})
    @DebugMetadata(b = "CollectMusicManager.kt", c = {81}, d = "invokeSuspend", e = "com.ss.android.ugc.aweme.shortvideo.music.collect.CollectMusicManager$loadMoreCollectMusic$1")
    public static final class f extends k implements Function2<af, kotlin.coroutines.c<? super Unit>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        Object L$0;
        int label;
        private af p$;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(a aVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.this$0 = aVar;
        }

        @NotNull
        public final kotlin.coroutines.c<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.c<?> cVar) {
            kotlin.coroutines.c<?> cVar2 = cVar;
            if (PatchProxy.isSupport(new Object[]{obj, cVar2}, this, changeQuickRedirect, false, 77820, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class)) {
                return (kotlin.coroutines.c) PatchProxy.accessDispatch(new Object[]{obj, cVar2}, this, changeQuickRedirect, false, 77820, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            }
            Intrinsics.checkParameterIsNotNull(cVar2, "completion");
            f fVar = new f(this.this$0, cVar2);
            fVar.p$ = (af) obj;
            return fVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            Object obj3 = obj;
            if (PatchProxy.isSupport(new Object[]{obj3, obj2}, this, changeQuickRedirect, false, 77821, new Class[]{Object.class, Object.class}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{obj3, obj2}, this, changeQuickRedirect, false, 77821, new Class[]{Object.class, Object.class}, Object.class);
            }
            return ((f) create(obj3, (kotlin.coroutines.c) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object obj2;
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 77819, new Class[]{Object.class}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 77819, new Class[]{Object.class}, Object.class);
            }
            Object a2 = kotlin.coroutines.a.b.a();
            switch (this.label) {
                case 0:
                    af afVar = this.p$;
                    a aVar = this.this$0;
                    int i = this.this$0.f68444f;
                    this.L$0 = afVar;
                    this.label = 1;
                    kotlin.coroutines.g gVar = new kotlin.coroutines.g(kotlin.coroutines.a.b.a(this));
                    kotlin.coroutines.c cVar = gVar;
                    IMainService iMainService = (IMainService) ServiceManager.get().getService(IMainService.class);
                    if (iMainService != null) {
                        IMusicService musicService = iMainService.musicService();
                        if (musicService != null) {
                            i<CollectedMusicList> userCollectedMusicList = musicService.userCollectedMusicList(i, 12);
                            if (userCollectedMusicList != null) {
                                userCollectedMusicList.a((g<TResult, TContinuationResult>) new e<TResult,TContinuationResult>(cVar, aVar, i, 12));
                            }
                        }
                    }
                    obj2 = gVar.a();
                    if (obj2 == kotlin.coroutines.a.b.a()) {
                        kotlin.coroutines.jvm.internal.g.b(this);
                    }
                    if (obj2 == a2) {
                        return a2;
                    }
                    break;
                case 1:
                    obj2 = obj;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CollectedMusicList collectedMusicList = (CollectedMusicList) obj2;
            if (collectedMusicList != null) {
                this.this$0.f68444f = collectedMusicList.cursor;
                this.this$0.g = collectedMusicList.isHasMore();
                if (collectedMusicList.items != null && collectedMusicList.items.size() > 0) {
                    List<Music> list = collectedMusicList.items;
                    Intrinsics.checkExpressionValueIsNotNull(list, "collectedMusicList.items");
                    Iterable<Music> iterable = list;
                    Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    for (Music convertToMusicModel : iterable) {
                        arrayList.add(convertToMusicModel.convertToMusicModel());
                    }
                    this.this$0.f68441c.addAll((List) arrayList);
                }
                b bVar = this.this$0.f68440b;
                if (bVar != null) {
                    bVar.a(this.this$0.f68441c, this.this$0.g);
                }
            } else {
                b bVar2 = this.this$0.f68440b;
                if (bVar2 != null) {
                    bVar2.a(this.this$0.f68441c, false);
                }
            }
            this.this$0.f68443e = true;
            return Unit.INSTANCE;
        }
    }

    private a() {
        this.f68441c = new ArrayList();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f68439a, false, 77809, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68439a, false, 77809, new Class[0], Void.TYPE);
            return;
        }
        this.f68442d = true;
        this.f68444f = 0;
        bk unused = kotlinx.coroutines.g.a(bd.f83876a, null, null, new d(this, null), 3);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f68439a, false, 77810, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68439a, false, 77810, new Class[0], Void.TYPE);
        } else if (!this.f68442d) {
            a();
        } else {
            b bVar = this.f68440b;
            if (bVar != null) {
                bVar.b();
            }
        }
    }

    public final CollectedMusicList c() {
        String str;
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f68439a, false, 77812, new Class[0], CollectedMusicList.class)) {
            return (CollectedMusicList) PatchProxy.accessDispatch(new Object[0], this, f68439a, false, 77812, new Class[0], CollectedMusicList.class);
        }
        b a2 = b.a.a();
        if (PatchProxy.isSupport(new Object[0], a2, b.f68454a, false, 77822, new Class[0], String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[0], a2, b.f68454a, false, 77822, new Class[0], String.class);
        } else {
            str = a2.f68457b.getString("collect_music_list", "");
        }
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            try {
                return (CollectedMusicList) com.ss.android.ugc.aweme.tools.music.f.e.a().fromJson(str, CollectedMusicList.class);
            } catch (Exception unused) {
                b a3 = b.a.a();
                if (PatchProxy.isSupport(new Object[0], a3, b.f68454a, false, 77824, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], a3, b.f68454a, false, 77824, new Class[0], Void.TYPE);
                } else {
                    SharedPreferences.Editor edit = a3.f68457b.edit();
                    edit.remove("collect_music_list");
                    edit.commit();
                }
            }
        }
        return null;
    }

    public /* synthetic */ a(byte b2) {
        this();
    }

    public final void a(@NotNull List<MusicModel> list) {
        List<MusicModel> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f68439a, false, 77808, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f68439a, false, 77808, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list2, "<set-?>");
        this.f68441c = list2;
    }

    public final void a(CollectedMusicList collectedMusicList) {
        CollectedMusicList collectedMusicList2 = collectedMusicList;
        if (PatchProxy.isSupport(new Object[]{collectedMusicList2}, this, f68439a, false, 77813, new Class[]{CollectedMusicList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{collectedMusicList2}, this, f68439a, false, 77813, new Class[]{CollectedMusicList.class}, Void.TYPE);
            return;
        }
        b a2 = b.a.a();
        String json = com.ss.android.ugc.aweme.tools.music.f.e.a().toJson((Object) collectedMusicList2);
        Intrinsics.checkExpressionValueIsNotNull(json, "GSON.toJson(collectMusicList)");
        if (PatchProxy.isSupport(new Object[]{json}, a2, b.f68454a, false, 77823, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{json}, a2, b.f68454a, false, 77823, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(json, "musicListString");
        SharedPreferences.Editor edit = a2.f68457b.edit();
        edit.putString("collect_music_list", json);
        edit.commit();
    }
}

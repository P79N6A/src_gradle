package com.ss.android.ugc.aweme.video.local;

import a.i;
import android.os.SystemClock;
import android.support.annotation.MainThread;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.aweme.thread.h;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\rH\u0007J\u0010\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0005H\u0007J\u0016\u0010 \u001a\u00020\u001a2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050!H\u0007J\u0012\u0010\"\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\rH\u0007J\b\u0010#\u001a\u00020\u001aH\u0002J\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u0014H\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0004¢\u0006\u0002\n\u0000R-\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u000fj\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0005`\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/ss/android/ugc/aweme/video/local/LocalVideoCache;", "", "()V", "cacheList", "", "Lcom/ss/android/ugc/aweme/video/local/LocalVideoUrlModel;", "cacheMaxAge", "", "getCacheMaxAge", "()I", "cacheMaxLength", "getCacheMaxLength", "pendingExpiredTask", "", "publishVideos", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getPublishVideos", "()Ljava/util/HashMap;", "totalSize", "", "deleteCacheFile", "sourceId", "cachePath", "onFileDeleted", "Lkotlin/Function0;", "", "get", "isVideoCacheExpired", "", "model", "put", "putAll", "", "remove", "removeExpiredCacheIfNeed", "slimCache", "size", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76148a;

    /* renamed from: e  reason: collision with root package name */
    public static final a f76149e = new a((byte) 0);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<String, g> f76150b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f76151c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final List<g> f76152d = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private long f76153f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/video/local/LocalVideoCache$Companion;", "", "()V", "VALID_PERIOD", "", "VIDEO_CACHE_SIZE", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<Unit> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(0);
        }

        public final void invoke() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.video.local.c$c  reason: collision with other inner class name */
    static final class C0796c<V> implements Callable<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76154a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f76155b;

        C0796c(String str) {
            this.f76155b = str;
        }

        public final /* synthetic */ Object call() {
            boolean z;
            if (PatchProxy.isSupport(new Object[0], this, f76154a, false, 89135, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f76154a, false, 89135, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                z = com.ss.android.ugc.aweme.video.b.c(this.f76155b);
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lbolts/Task;", "", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class d<TTaskResult, TContinuationResult> implements a.g<Boolean, Unit> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76156a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f76157b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f76158c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Function0 f76159d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f76160e;

        d(c cVar, String str, Function0 function0, String str2) {
            this.f76157b = cVar;
            this.f76158c = str;
            this.f76159d = function0;
            this.f76160e = str2;
        }

        public final /* synthetic */ Object then(i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f76156a, false, 89136, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f76156a, false, 89136, new Class[]{i.class}, Void.TYPE);
            } else {
                this.f76157b.f76151c.remove(this.f76158c);
                this.f76159d.invoke();
                ai.a("LocalVideoCache=>delete video cache,filePath:" + this.f76160e);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/ss/android/ugc/aweme/video/local/LocalVideoUrlModel;", "kotlin.jvm.PlatformType", "o2", "compare"}, k = 3, mv = {1, 1, 15})
    static final class e<T> implements Comparator<g> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76161a;

        /* renamed from: b  reason: collision with root package name */
        public static final e f76162b = new e();

        e() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            g gVar = (g) obj;
            g gVar2 = (g) obj2;
            if (PatchProxy.isSupport(new Object[]{gVar, gVar2}, this, f76161a, false, 89137, new Class[]{g.class, g.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{gVar, gVar2}, this, f76161a, false, 89137, new Class[]{g.class, g.class}, Integer.TYPE)).intValue();
            }
            Intrinsics.checkExpressionValueIsNotNull(gVar, "o1");
            long createTime = gVar.getCreateTime();
            Intrinsics.checkExpressionValueIsNotNull(gVar2, "o2");
            if (createTime == gVar2.getCreateTime()) {
                return 0;
            }
            if (gVar.getCreateTime() > gVar2.getCreateTime()) {
                return 1;
            }
            return -1;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/ugc/aweme/video/local/LocalVideoCache$remove$1$cacheLength$1"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ g $model;
        final /* synthetic */ String $sourceId$inlined;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(g gVar, c cVar, String str) {
            super(0);
            this.$model = gVar;
            this.this$0 = cVar;
            this.$sourceId$inlined = str;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 89138, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 89138, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.f76150b.remove(this.$sourceId$inlined);
            this.this$0.f76152d.remove(this.$model);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/ugc/aweme/video/local/LocalVideoCache$slimCache$2$1"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ g $model;
        final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(g gVar, c cVar) {
            super(0);
            this.$model = gVar;
            this.this$0 = cVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 89139, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 89139, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.f76152d.remove(this.$model);
            this.this$0.f76150b.remove(this.$model.getSourceId());
        }
    }

    private final int a() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f76148a, false, 89125, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f76148a, false, 89125, new Class[0], Integer.TYPE)).intValue();
        }
        try {
            com.ss.android.ugc.aweme.global.config.settings.pojo.a b2 = com.ss.android.ugc.aweme.global.config.settings.g.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "SettingsReader.get()");
            i = b2.bk().intValue() * 60 * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        } catch (com.bytedance.ies.a unused) {
            i = 259200000;
        }
        return i;
    }

    private final int b() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f76148a, false, 89126, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f76148a, false, 89126, new Class[0], Integer.TYPE)).intValue();
        }
        try {
            com.ss.android.ugc.aweme.global.config.settings.pojo.a b2 = com.ss.android.ugc.aweme.global.config.settings.g.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "SettingsReader.get()");
            i = b2.bl().intValue() * 1024 * 1024;
        } catch (com.bytedance.ies.a unused) {
            i = 157286400;
        }
        return i;
    }

    private final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f76148a, false, 89133, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76148a, false, 89133, new Class[0], Void.TYPE);
            return;
        }
        if (b() != 0 && this.f76153f > ((long) b())) {
            a(this.f76153f - ((long) b()));
        }
    }

    @Nullable
    @MainThread
    public final g b(@NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f76148a, false, 89130, new Class[]{String.class}, g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[]{str}, this, f76148a, false, 89130, new Class[]{String.class}, g.class);
        }
        Intrinsics.checkParameterIsNotNull(str, "sourceId");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        g gVar = this.f76150b.get(str);
        if (gVar == null) {
            return null;
        }
        Intrinsics.checkExpressionValueIsNotNull(gVar, "model");
        String sourceId = gVar.getSourceId();
        Intrinsics.checkExpressionValueIsNotNull(sourceId, "model.sourceId");
        this.f76153f -= a(sourceId, gVar.localPath, new f(gVar, this, str));
        return gVar;
    }

    @Nullable
    @MainThread
    public final g a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f76148a, false, 89129, new Class[]{String.class}, g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[]{str2}, this, f76148a, false, 89129, new Class[]{String.class}, g.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "sourceId");
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return this.f76150b.get(str2);
    }

    public final boolean b(@Nullable g gVar) {
        g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{gVar2}, this, f76148a, false, 89131, new Class[]{g.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{gVar2}, this, f76148a, false, 89131, new Class[]{g.class}, Boolean.TYPE)).booleanValue();
        } else if (gVar2 == null || SystemClock.elapsedRealtime() - gVar.getCreateTime() > ((long) a()) || TextUtils.isEmpty(gVar2.localPath) || !new File(gVar2.localPath).exists()) {
            return true;
        } else {
            return false;
        }
    }

    @MainThread
    public final void a(@NotNull g gVar) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{gVar}, this, f76148a, false, 89127, new Class[]{g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar}, this, f76148a, false, 89127, new Class[]{g.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(gVar, "model");
        g gVar2 = null;
        if (b(gVar)) {
            String sourceId = gVar.getSourceId();
            Intrinsics.checkExpressionValueIsNotNull(sourceId, "model.sourceId");
            long unused = a(sourceId, gVar.localPath, b.INSTANCE);
            return;
        }
        if (TextUtils.isEmpty(gVar.localPath) || TextUtils.isEmpty(gVar.getSourceId())) {
            z = false;
        }
        if (z) {
            gVar2 = gVar;
        }
        if (gVar2 != null) {
            File file = new File(gVar.localPath);
            if (file.exists()) {
                String sourceId2 = gVar.getSourceId();
                Intrinsics.checkExpressionValueIsNotNull(sourceId2, "model.sourceId");
                this.f76150b.put(sourceId2, gVar);
                this.f76152d.add(gVar);
                this.f76153f += file.length();
                ai.a("LocalVideoCache=>add cache,fileSize:" + file.length() + ",totalSize:" + this.f76153f + ",filePath:" + file.getPath());
            }
        }
        c();
    }

    @MainThread
    public final void a(@NotNull Collection<? extends g> collection) {
        Collection<? extends g> collection2 = collection;
        if (PatchProxy.isSupport(new Object[]{collection2}, this, f76148a, false, 89128, new Class[]{Collection.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{collection2}, this, f76148a, false, 89128, new Class[]{Collection.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(collection2, "cacheList");
        for (g a2 : CollectionsKt.sortedWith(collection2, e.f76162b)) {
            a(a2);
        }
    }

    @MainThread
    public final boolean a(long j) {
        long j2;
        long j3 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f76148a, false, 89132, new Class[]{Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f76148a, false, 89132, new Class[]{Long.TYPE}, Boolean.TYPE)).booleanValue();
        }
        List<g> arrayList = new ArrayList<>();
        long j4 = 0;
        int i = 0;
        while (j4 < j3 && i < this.f76152d.size()) {
            int i2 = i + 1;
            g gVar = this.f76152d.get(i);
            File file = new File(gVar.localPath);
            if (file.exists()) {
                j2 = file.length();
            } else {
                j2 = 0;
            }
            arrayList.add(gVar);
            j4 += j2;
            this.f76153f -= j2;
            i = i2;
        }
        for (g gVar2 : arrayList) {
            String sourceId = gVar2.getSourceId();
            Intrinsics.checkExpressionValueIsNotNull(sourceId, "model.sourceId");
            a(sourceId, gVar2.localPath, new g(gVar2, this));
        }
        if (this.f76153f > j3) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final long a(String str, String str2, Function0<Unit> function0) {
        String str3 = str;
        String str4 = str2;
        Function0<Unit> function02 = function0;
        if (PatchProxy.isSupport(new Object[]{str3, str4, function02}, this, f76148a, false, 89134, new Class[]{String.class, String.class, Function0.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{str3, str4, function02}, this, f76148a, false, 89134, new Class[]{String.class, String.class, Function0.class}, Long.TYPE)).longValue();
        } else if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3) || this.f76151c.contains(str3)) {
            return 0;
        } else {
            File file = new File(str4);
            if (!file.exists()) {
                return 0;
            }
            long length = file.length();
            this.f76151c.add(str3);
            i.a((Callable<TResult>) new C0796c<TResult>(str4), (Executor) h.c()).a((a.g<TResult, TContinuationResult>) new d<TResult,TContinuationResult>(this, str3, function02, str4), i.f1052b);
            return length;
        }
    }
}

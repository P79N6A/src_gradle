package com.ss.android.ugc.aweme.shortvideo.cut;

import a.i;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.shortvideo.cut.model.g;
import com.ss.android.ugc.aweme.shortvideo.fg;
import com.ss.android.ugc.aweme.shortvideo.hm;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.vesdk.z;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001a\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011H\u0002J0\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0016J(\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110(2\u0006\u0010)\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010*\u001a\u00020!H\u0002J\u0018\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110(2\u0006\u0010,\u001a\u00020\u0018H\u0002J2\u0010-\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010*\u001a\u00020!2\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010.\u001a\u00020\nH\u0002J\u0010\u0010/\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0018H\u0016J\b\u00100\u001a\u00020\u001fH\u0007J\b\u00101\u001a\u00020\u001fH\u0016J\u0010\u00101\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u0018H\u0016R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0017X\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cut/VEMediaParserFrameProviderImpl;", "Lcom/ss/android/ugc/aweme/shortvideo/cut/model/VideoFrameProvider;", "Landroid/arch/lifecycle/LifecycleObserver;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "extractFrameExecutor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "extractFramesInRoughMode", "", "getExtractFramesInRoughMode", "()Z", "setExtractFramesInRoughMode", "(Z)V", "frameDiskCache", "Lcom/ss/android/ugc/aweme/shortvideo/cut/VEFrameDiskLruCache;", "Landroid/graphics/Bitmap;", "getFrameDiskCache", "()Lcom/ss/android/ugc/aweme/shortvideo/cut/VEFrameDiskLruCache;", "frameDiskCache$delegate", "Lkotlin/Lazy;", "mediaParserMap", "", "", "Lcom/ss/android/vesdk/VEMediaParser;", "buildCloseableBitmap", "Lcom/facebook/common/references/CloseableReference;", "Lcom/facebook/imagepipeline/image/CloseableImage;", "bitmap", "getBitmapByCache", "", "position", "", "path", "absoluteTime", "relativeTime", "onGetBitmap", "Lcom/ss/android/ugc/aweme/shortvideo/cut/model/ExtractFrameCallback;", "getBitmapByExtractFrame", "Lbolts/Task;", "key", "time", "getBitmapFromCache", "cacheKey", "getBitmapInner", "retryOnError", "isProviderInit", "releaseFrames", "releaseProvider", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VEMediaParserFrameProviderImpl implements LifecycleObserver, g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3921a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f3922b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(VEMediaParserFrameProviderImpl.class), "frameDiskCache", "getFrameDiskCache()Lcom/ss/android/ugc/aweme/shortvideo/cut/VEFrameDiskLruCache;"))};

    /* renamed from: c  reason: collision with root package name */
    public boolean f3923c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, z> f3924d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    private final ExecutorService f3925e = ao.a();

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f3926f = LazyKt.lazy(a.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/shortvideo/cut/VEFrameDiskLruCache;", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<an<Bitmap>> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
            super(0);
        }

        @NotNull
        public final an<Bitmap> invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 75682, new Class[0], an.class)) {
                return (an) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 75682, new Class[0], an.class);
            }
            return new an<>(fg.f67717f + "ve_frame_cache2/" + System.currentTimeMillis(), new a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"initMediaParser", "Lcom/ss/android/vesdk/VEMediaParser;", "path", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<String, z> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ VEMediaParserFrameProviderImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl) {
            super(1);
            this.this$0 = vEMediaParserFrameProviderImpl;
        }

        @NotNull
        public final z invoke(@NotNull String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 75683, new Class[]{String.class}, z.class)) {
                return (z) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 75683, new Class[]{String.class}, z.class);
            }
            Intrinsics.checkParameterIsNotNull(str2, "path");
            z zVar = new z();
            zVar.a(str2);
            this.this$0.f3924d.put(str2, zVar);
            return zVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 15})
    static final class c<V> implements Callable<Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66268a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VEMediaParserFrameProviderImpl f66269b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z f66270c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f66271d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f66272e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f66273f;

        c(VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl, z zVar, int i, int i2, String str) {
            this.f66269b = vEMediaParserFrameProviderImpl;
            this.f66270c = zVar;
            this.f66271d = i;
            this.f66272e = i2;
            this.f66273f = str;
        }

        public final /* synthetic */ Object call() {
            if (PatchProxy.isSupport(new Object[0], this, f66268a, false, 75684, new Class[0], Bitmap.class)) {
                return (Bitmap) PatchProxy.accessDispatch(new Object[0], this, f66268a, false, 75684, new Class[0], Bitmap.class);
            }
            final Bitmap a2 = this.f66270c.a(this.f66271d, -1, this.f66272e, this.f66269b.f3923c);
            if (a2 != null && !a2.isRecycled()) {
                i.a((Callable<TResult>) new Callable<Unit>(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f66274a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ c f66275b;

                    {
                        this.f66275b = r1;
                    }

                    public final /* synthetic */ Object call() {
                        if (PatchProxy.isSupport(new Object[0], this, f66274a, false, 75685, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f66274a, false, 75685, new Class[0], Void.TYPE);
                        } else {
                            this.f66275b.f66269b.a().a(this.f66275b.f66273f, new as(a2.getWidth(), a2.getHeight(), a2), AnonymousClass1.INSTANCE);
                        }
                        return Unit.INSTANCE;
                    }
                }, (Executor) h.c());
            }
            return a2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "call"}, k = 3, mv = {1, 1, 15})
    static final class d<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66277a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VEMediaParserFrameProviderImpl f66278b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f66279c;

        d(VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl, String str) {
            this.f66278b = vEMediaParserFrameProviderImpl;
            this.f66279c = str;
        }

        public final /* synthetic */ Object call() {
            if (PatchProxy.isSupport(new Object[0], this, f66277a, false, 75686, new Class[0], Bitmap.class)) {
                return (Bitmap) PatchProxy.accessDispatch(new Object[0], this, f66277a, false, 75686, new Class[0], Bitmap.class);
            }
            as a2 = this.f66278b.a().a(this.f66279c);
            if (a2 != null) {
                return (Bitmap) a2.f66391d;
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class e<TTaskResult, TContinuationResult> implements a.g<Bitmap, Unit> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66280a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VEMediaParserFrameProviderImpl f66281b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f66282c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f66283d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f66284e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f66285f;
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.cut.model.b g;

        e(VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl, boolean z, int i, String str, int i2, com.ss.android.ugc.aweme.shortvideo.cut.model.b bVar) {
            this.f66281b = vEMediaParserFrameProviderImpl;
            this.f66282c = z;
            this.f66283d = i;
            this.f66284e = str;
            this.f66285f = i2;
            this.g = bVar;
        }

        public final /* synthetic */ Object then(i iVar) {
            CloseableReference closeableReference;
            i iVar2 = iVar;
            if (PatchProxy.isSupport(new Object[]{iVar2}, this, f66280a, false, 75687, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar2}, this, f66280a, false, 75687, new Class[]{i.class}, Void.TYPE);
            } else {
                Intrinsics.checkExpressionValueIsNotNull(iVar2, "task");
                if (!iVar.d() || !this.f66282c) {
                    Bitmap bitmap = (Bitmap) iVar.e();
                    if (bitmap != null) {
                        if (!(!bitmap.isRecycled())) {
                            bitmap = null;
                        }
                        if (bitmap != null) {
                            VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl = this.f66281b;
                            if (PatchProxy.isSupport(new Object[]{bitmap}, vEMediaParserFrameProviderImpl, VEMediaParserFrameProviderImpl.f3921a, false, 75680, new Class[]{Bitmap.class}, CloseableReference.class)) {
                                closeableReference = (CloseableReference) PatchProxy.accessDispatch(new Object[]{bitmap}, vEMediaParserFrameProviderImpl, VEMediaParserFrameProviderImpl.f3921a, false, 75680, new Class[]{Bitmap.class}, CloseableReference.class);
                            } else {
                                closeableReference = CloseableReference.of(new CloseableStaticBitmap(bitmap, (com.facebook.common.references.b<Bitmap>) com.facebook.imagepipeline.bitmaps.f.getInstance(), com.facebook.imagepipeline.image.c.FULL_QUALITY, 0));
                            }
                            if (closeableReference != null) {
                                if (!closeableReference.isValid()) {
                                    closeableReference = null;
                                }
                                if (closeableReference != null) {
                                    com.ss.android.ugc.aweme.shortvideo.cut.model.b bVar = this.g;
                                    CloseableReference clone = closeableReference.clone();
                                    Intrinsics.checkExpressionValueIsNotNull(clone, "result.clone()");
                                    bVar.a(clone);
                                    CloseableReference.closeSafely(closeableReference);
                                }
                            }
                        }
                    }
                } else {
                    this.f66281b.a(this.f66283d, this.f66284e, this.f66285f, this.g, false);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
    static final class f<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66286a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VEMediaParserFrameProviderImpl f66287b;

        f(VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl) {
            this.f66287b = vEMediaParserFrameProviderImpl;
        }

        public final /* synthetic */ Object call() {
            if (PatchProxy.isSupport(new Object[0], this, f66286a, false, 75688, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f66286a, false, 75688, new Class[0], Void.TYPE);
            } else {
                this.f66287b.a().a();
                this.f66287b.b();
            }
            return Unit.INSTANCE;
        }
    }

    public final an<Bitmap> a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f3921a, false, 75671, new Class[0], an.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f3921a, false, 75671, new Class[0], an.class);
        } else {
            value = this.f3926f.getValue();
        }
        return (an) value;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void releaseFrames() {
        if (PatchProxy.isSupport(new Object[0], this, f3921a, false, 75676, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3921a, false, 75676, new Class[0], Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new f<TResult>(this));
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3921a, false, 75673, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3921a, false, 75673, new Class[0], Void.TYPE);
            return;
        }
        for (Map.Entry<String, z> key : this.f3924d.entrySet()) {
            a((String) key.getKey());
        }
    }

    public VEMediaParserFrameProviderImpl(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        com.ss.android.ugc.aweme.port.in.a.a(new hm().a());
        if (context instanceof AppCompatActivity) {
            ((AppCompatActivity) context).getLifecycle().addObserver(this);
        }
    }

    private final i<Bitmap> b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f3921a, false, 75679, new Class[]{String.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{str2}, this, f3921a, false, 75679, new Class[]{String.class}, i.class);
        }
        i<Bitmap> a2 = i.a((Callable<TResult>) new d<TResult>(this, str2));
        Intrinsics.checkExpressionValueIsNotNull(a2, "Task.callInBackground {\n…cacheKey)?.data\n        }");
        return a2;
    }

    public final void a(@NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3921a, false, 75674, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3921a, false, 75674, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, "path");
        z zVar = this.f3924d.get(str);
        if (zVar != null) {
            zVar.a();
            this.f3924d.put(str, null);
        }
    }

    private final i<Bitmap> a(String str, String str2, int i) {
        z zVar;
        String str3 = str2;
        if (PatchProxy.isSupport(new Object[]{str, str3, Integer.valueOf(i)}, this, f3921a, false, 75678, new Class[]{String.class, String.class, Integer.TYPE}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{str, str3, Integer.valueOf(i)}, this, f3921a, false, 75678, new Class[]{String.class, String.class, Integer.TYPE}, i.class);
        }
        b bVar = new b(this);
        int a2 = u.a(60.0d);
        z zVar2 = this.f3924d.get(str2);
        if (zVar2 == null) {
            zVar = bVar.invoke(str2);
        } else {
            zVar = zVar2;
        }
        c cVar = new c(this, zVar, i, a2, str);
        i<Bitmap> a3 = i.a((Callable<TResult>) cVar, (Executor) this.f3925e);
        Intrinsics.checkExpressionValueIsNotNull(a3, "Task.call(Callable {\n   … }, extractFrameExecutor)");
        return a3;
    }

    public final void a(int i, @NotNull String str, int i2, int i3, @NotNull com.ss.android.ugc.aweme.shortvideo.cut.model.b bVar) {
        String str2 = str;
        com.ss.android.ugc.aweme.shortvideo.cut.model.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2, Integer.valueOf(i2), Integer.valueOf(i3), bVar2}, this, f3921a, false, 75675, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, com.ss.android.ugc.aweme.shortvideo.cut.model.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2, Integer.valueOf(i2), Integer.valueOf(i3), bVar2}, this, f3921a, false, 75675, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, com.ss.android.ugc.aweme.shortvideo.cut.model.b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "path");
        Intrinsics.checkParameterIsNotNull(bVar2, "onGetBitmap");
        a(i, str, i3, bVar, true);
    }

    public final void a(int i, String str, int i2, com.ss.android.ugc.aweme.shortvideo.cut.model.b bVar, boolean z) {
        i<Bitmap> a2;
        String str2 = str;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2, Integer.valueOf(i2), bVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3921a, false, 75677, new Class[]{Integer.TYPE, String.class, Integer.TYPE, com.ss.android.ugc.aweme.shortvideo.cut.model.b.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2, Integer.valueOf(i2), bVar, Byte.valueOf(z)}, this, f3921a, false, 75677, new Class[]{Integer.TYPE, String.class, Integer.TYPE, com.ss.android.ugc.aweme.shortvideo.cut.model.b.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        String str3 = str2 + i3;
        if (a().b(str3)) {
            a2 = b(str3);
        } else {
            a2 = a(str3, str2, i3);
        }
        i<Bitmap> iVar = a2;
        e eVar = new e(this, z, i, str, i2, bVar);
        iVar.a((a.g<TResult, TContinuationResult>) eVar, i.f1052b);
    }
}

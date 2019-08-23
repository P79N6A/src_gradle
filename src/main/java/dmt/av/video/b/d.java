package dmt.av.video.b;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.FaceBeautyInvoker;
import com.ss.android.medialib.camera.g;
import com.ss.android.medialib.log.IMonitor;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ugc.aweme.property.a;
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
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\t\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0005H\u0016J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020%H\u0016J\u001c\u0010&\u001a\u00020\u001d2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u001d0(H\u0016J\b\u0010*\u001a\u00020\u001dH\u0016J\u0012\u0010+\u001a\u00020\u001d2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0010\u0010.\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010/\u001a\u00020\u001d2\b\u0010,\u001a\u0004\u0018\u000100H\u0016R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u0019\u0010\u001a¨\u00061"}, d2 = {"Ldmt/av/video/record/OldRecorderImpl;", "Ldmt/av/video/record/IRecorder;", "context", "Landroid/content/Context;", "mediaRecordPresenter", "Lcom/ss/android/medialib/presenter/MediaRecordPresenter;", "(Landroid/content/Context;Lcom/ss/android/medialib/presenter/MediaRecordPresenter;)V", "cameraService", "Ldmt/av/video/record/camera/OldCameraService;", "getCameraService", "()Ldmt/av/video/record/camera/OldCameraService;", "cameraService$delegate", "Lkotlin/Lazy;", "musicCapacityProvider", "Ldmt/av/video/record/OldMusicCapacityProviderImpl;", "getMusicCapacityProvider", "()Ldmt/av/video/record/OldMusicCapacityProviderImpl;", "musicCapacityProvider$delegate", "videoRecordCapacityProvider", "Ldmt/av/video/record/OldVideoRecordCapacityProviderImpl;", "getVideoRecordCapacityProvider", "()Ldmt/av/video/record/OldVideoRecordCapacityProviderImpl;", "videoRecordCapacityProvider$delegate", "voiceCapacityProvider", "Ldmt/av/video/record/OldVoiceCapacityProviderImpl;", "getVoiceCapacityProvider", "()Ldmt/av/video/record/OldVoiceCapacityProviderImpl;", "voiceCapacityProvider$delegate", "clearEnv", "", "Ldmt/av/video/record/camera/ICameraService;", "getMediaRecordPresenter", "provideMusicCapacity", "Ldmt/av/video/record/MusicCapacityProvider;", "provideVideoRecordCapacity", "Ldmt/av/video/record/VideoRecordCapacityProvider;", "provideVoiceCapacity", "Ldmt/av/video/record/VoiceCapacityProvider;", "registerRunningErrorCallback", "callback", "Lkotlin/Function1;", "", "release", "setNativeInitListener", "listener", "Lcom/ss/android/medialib/listener/NativeInitListener;", "setNativeLibraryDir", "setOnFrameAvailableListener", "Lcom/ss/android/medialib/presenter/MediaRecordPresenter$OnFrameAvailableListener;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82914a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f82915b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(d.class), "videoRecordCapacityProvider", "getVideoRecordCapacityProvider()Ldmt/av/video/record/OldVideoRecordCapacityProviderImpl;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(d.class), "voiceCapacityProvider", "getVoiceCapacityProvider()Ldmt/av/video/record/OldVoiceCapacityProviderImpl;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(d.class), "musicCapacityProvider", "getMusicCapacityProvider()Ldmt/av/video/record/OldMusicCapacityProviderImpl;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(d.class), "cameraService", "getCameraService()Ldmt/av/video/record/camera/OldCameraService;"))};

    /* renamed from: c  reason: collision with root package name */
    public final Context f82916c;

    /* renamed from: d  reason: collision with root package name */
    public final MediaRecordPresenter f82917d;

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f82918e;

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f82919f;
    private final Lazy g;
    private final Lazy h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ldmt/av/video/record/camera/OldCameraService;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<dmt.av.video.b.a.d> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @NotNull
        public final dmt.av.video.b.a.d invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 92191, new Class[0], dmt.av.video.b.a.d.class)) {
                return (dmt.av.video.b.a.d) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 92191, new Class[0], dmt.av.video.b.a.d.class);
            }
            Context context = this.this$0.f82916c;
            g b2 = g.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "IESCameraManager.getInstance()");
            return new dmt.av.video.b.a.d(context, b2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ldmt/av/video/record/OldMusicCapacityProviderImpl;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<c> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @NotNull
        public final c invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 92192, new Class[0], c.class)) {
                return new c(this.this$0.f82917d);
            }
            return (c) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 92192, new Class[0], c.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ldmt/av/video/record/OldVideoRecordCapacityProviderImpl;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<f> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @NotNull
        public final f invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 92193, new Class[0], f.class)) {
                return new f(this.this$0.f82917d);
            }
            return (f) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 92193, new Class[0], f.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ldmt/av/video/record/OldVoiceCapacityProviderImpl;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: dmt.av.video.b.d$d  reason: collision with other inner class name */
    static final class C0878d extends Lambda implements Function0<h> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0878d(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @NotNull
        public final h invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 92194, new Class[0], h.class)) {
                return new h(this.this$0.f82917d);
            }
            return (h) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 92194, new Class[0], h.class);
        }
    }

    public final void e() {
    }

    @NotNull
    public final MediaRecordPresenter f() {
        return this.f82917d;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f82914a, false, 92183, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f82914a, false, 92183, new Class[0], Void.TYPE);
            return;
        }
        this.f82917d.d();
    }

    @NotNull
    public final z a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f82914a, false, 92187, new Class[0], z.class)) {
            return (z) PatchProxy.accessDispatch(new Object[0], this, f82914a, false, 92187, new Class[0], z.class);
        }
        if (PatchProxy.isSupport(new Object[0], this, f82914a, false, 92180, new Class[0], h.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f82914a, false, 92180, new Class[0], h.class);
        } else {
            value = this.f82919f.getValue();
        }
        return (h) value;
    }

    @NotNull
    public final y b() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f82914a, false, 92188, new Class[0], y.class)) {
            return (y) PatchProxy.accessDispatch(new Object[0], this, f82914a, false, 92188, new Class[0], y.class);
        }
        if (PatchProxy.isSupport(new Object[0], this, f82914a, false, 92179, new Class[0], f.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f82914a, false, 92179, new Class[0], f.class);
        } else {
            value = this.f82918e.getValue();
        }
        return (f) value;
    }

    @NotNull
    public final b c() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f82914a, false, 92186, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], this, f82914a, false, 92186, new Class[0], b.class);
        }
        if (PatchProxy.isSupport(new Object[0], this, f82914a, false, 92181, new Class[0], c.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f82914a, false, 92181, new Class[0], c.class);
        } else {
            value = this.g.getValue();
        }
        return (c) value;
    }

    @NotNull
    public final dmt.av.video.b.a.c g() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f82914a, false, 92189, new Class[0], dmt.av.video.b.a.c.class)) {
            return (dmt.av.video.b.a.c) PatchProxy.accessDispatch(new Object[0], this, f82914a, false, 92189, new Class[0], dmt.av.video.b.a.c.class);
        }
        if (PatchProxy.isSupport(new Object[0], this, f82914a, false, 92182, new Class[0], dmt.av.video.b.a.d.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f82914a, false, 92182, new Class[0], dmt.av.video.b.a.d.class);
        } else {
            value = this.h.getValue();
        }
        return (dmt.av.video.b.a.d) value;
    }

    public final void a(@Nullable com.ss.android.medialib.c.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f82914a, false, 92178, new Class[]{com.ss.android.medialib.c.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f82914a, false, 92178, new Class[]{com.ss.android.medialib.c.b.class}, Void.TYPE);
            return;
        }
        FaceBeautyInvoker.setNativeInitListener(bVar);
    }

    public final void a(@NotNull Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f82914a, false, 92184, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f82914a, false, 92184, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        this.f82917d.a(context2);
    }

    public final void a(@Nullable MediaRecordPresenter.a aVar) {
        MediaRecordPresenter.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f82914a, false, 92177, new Class[]{MediaRecordPresenter.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f82914a, false, 92177, new Class[]{MediaRecordPresenter.a.class}, Void.TYPE);
            return;
        }
        this.f82917d.a(aVar2);
    }

    public final void a(@NotNull Function1<? super Integer, Unit> function1) {
        Function1<? super Integer, Unit> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{function12}, this, f82914a, false, 92185, new Class[]{Function1.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function12}, this, f82914a, false, 92185, new Class[]{Function1.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function12, "callback");
        this.f82917d.a((FaceBeautyInvoker.OnRunningErrorCallback) new e(function12));
    }

    public d(@NotNull Context context, @NotNull MediaRecordPresenter mediaRecordPresenter) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(mediaRecordPresenter, "mediaRecordPresenter");
        this.f82916c = context;
        this.f82917d = mediaRecordPresenter;
        this.f82917d.b(com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableEnhanceVolume));
        this.f82917d.a((IMonitor) AnonymousClass1.f82921b);
        this.f82918e = LazyKt.lazy(new c(this));
        this.f82919f = LazyKt.lazy(new C0878d(this));
        this.g = LazyKt.lazy(new b(this));
        this.h = LazyKt.lazy(new a(this));
    }

    public /* synthetic */ d(Context context, MediaRecordPresenter mediaRecordPresenter, int i) {
        this(context, new MediaRecordPresenter());
    }
}

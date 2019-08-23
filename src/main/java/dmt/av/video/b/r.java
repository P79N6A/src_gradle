package dmt.av.video.b;

import android.content.Context;
import android.opengl.EGLContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.property.f;
import com.ss.android.ugc.aweme.shortvideo.record.o;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.ab;
import com.ss.android.vesdk.af;
import com.ss.android.vesdk.am;
import com.ss.android.vesdk.j;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010!\u001a\u00020\u0016H\u0016J\b\u0010\"\u001a\u00020\nH\u0016J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020*H\u0016J\u001c\u0010+\u001a\u00020\u00162\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0016J\b\u0010-\u001a\u00020\u0016H\u0016J\u0012\u0010.\u001a\u00020\u00162\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010/\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u00100\u001a\u00020\u00162\b\u0010\u000b\u001a\u0004\u0018\u000101H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0002¢\u0006\f\n\u0004\b \u0010\u0012\u001a\u0004\b\u001e\u0010\u001f¨\u00062"}, d2 = {"Ldmt/av/video/record/VERecorderImpl;", "Ldmt/av/video/record/IRecorder;", "context", "Landroid/content/Context;", "recorderParameters", "Ldmt/av/video/record/RecorderParameters;", "recorder", "Lcom/ss/android/vesdk/VERecorder;", "(Landroid/content/Context;Ldmt/av/video/record/RecorderParameters;Lcom/ss/android/vesdk/VERecorder;)V", "cameraService", "Ldmt/av/video/record/camera/CameraService;", "listener", "Lcom/ss/android/medialib/listener/NativeInitListener;", "musicCapacityProvider", "Ldmt/av/video/record/VEMusicCapacityProviderImpl;", "getMusicCapacityProvider", "()Ldmt/av/video/record/VEMusicCapacityProviderImpl;", "musicCapacityProvider$delegate", "Lkotlin/Lazy;", "runningErrorCallback", "Lkotlin/Function1;", "", "", "videoRecordCapacityProvider", "Ldmt/av/video/record/VEVideoRecordCapacityProviderImpl;", "getVideoRecordCapacityProvider", "()Ldmt/av/video/record/VEVideoRecordCapacityProviderImpl;", "videoRecordCapacityProvider$delegate", "voiceCapacityProvider", "Ldmt/av/video/record/VEVoiceCapacityProviderImpl;", "getVoiceCapacityProvider", "()Ldmt/av/video/record/VEVoiceCapacityProviderImpl;", "voiceCapacityProvider$delegate", "clearEnv", "getCameraService", "getMediaRecordPresenter", "Lcom/ss/android/medialib/presenter/MediaRecordPresenter;", "provideMusicCapacity", "Ldmt/av/video/record/MusicCapacityProvider;", "provideVideoRecordCapacity", "Ldmt/av/video/record/VideoRecordCapacityProvider;", "provideVoiceCapacity", "Ldmt/av/video/record/VoiceCapacityProvider;", "registerRunningErrorCallback", "callback", "release", "setNativeInitListener", "setNativeLibraryDir", "setOnFrameAvailableListener", "Lcom/ss/android/medialib/presenter/MediaRecordPresenter$OnFrameAvailableListener;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class r implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82955a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f82956b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(r.class), "videoRecordCapacityProvider", "getVideoRecordCapacityProvider()Ldmt/av/video/record/VEVideoRecordCapacityProviderImpl;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(r.class), "voiceCapacityProvider", "getVoiceCapacityProvider()Ldmt/av/video/record/VEVoiceCapacityProviderImpl;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(r.class), "musicCapacityProvider", "getMusicCapacityProvider()Ldmt/av/video/record/VEMusicCapacityProviderImpl;"))};

    /* renamed from: c  reason: collision with root package name */
    public final dmt.av.video.b.a.b f82957c;

    /* renamed from: d  reason: collision with root package name */
    public Function1<? super Integer, Unit> f82958d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.medialib.c.b f82959e;

    /* renamed from: f  reason: collision with root package name */
    public final af f82960f;
    private final Lazy g;
    private final Lazy h;
    private final Lazy i;
    private final Context j;
    private final m k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ldmt/av/video/record/VEMusicCapacityProviderImpl;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<p> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ r this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(r rVar) {
            super(0);
            this.this$0 = rVar;
        }

        @NotNull
        public final p invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 92260, new Class[0], p.class)) {
                return new p(this.this$0.f82960f);
            }
            return (p) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 92260, new Class[0], p.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"dmt/av/video/record/VERecorderImpl$setOnFrameAvailableListener$1", "Lcom/ss/android/vesdk/VERecorder$OnFrameAvailableListener;", "OnFrameAvailable", "", "context", "Landroid/opengl/EGLContext;", "texID", "", "format", "width", "height", "timestamp", "", "shouldFrameRendered", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements af.c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f82963a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MediaRecordPresenter.a f82964b;

        public final boolean a() {
            if (!PatchProxy.isSupport(new Object[0], this, f82963a, false, 92262, new Class[0], Boolean.TYPE)) {
                return this.f82964b.as_();
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f82963a, false, 92262, new Class[0], Boolean.TYPE)).booleanValue();
        }

        b(MediaRecordPresenter.a aVar) {
            this.f82964b = aVar;
        }

        public final void a(@Nullable EGLContext eGLContext, int i, int i2, int i3, int i4, long j) {
            EGLContext eGLContext2 = eGLContext;
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{eGLContext2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), new Long(j2)}, this, f82963a, false, 92261, new Class[]{EGLContext.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eGLContext2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), new Long(j2)}, this, f82963a, false, 92261, new Class[]{EGLContext.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Long.TYPE}, Void.TYPE);
                return;
            }
            MediaRecordPresenter.a aVar = this.f82964b;
            com.ss.android.medialib.model.a aVar2 = new com.ss.android.medialib.model.a();
            aVar2.f29700a = eGLContext2;
            aVar2.f29701b = i;
            aVar2.f29702c = i2;
            aVar2.f29703d = i3;
            aVar2.f29704e = i4;
            aVar2.f29705f = j2;
            aVar.a(aVar2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ldmt/av/video/record/VEVideoRecordCapacityProviderImpl;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<u> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ r this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(r rVar) {
            super(0);
            this.this$0 = rVar;
        }

        @NotNull
        public final u invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 92263, new Class[0], u.class)) {
                return new u(this.this$0.f82960f);
            }
            return (u) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 92263, new Class[0], u.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ldmt/av/video/record/VEVoiceCapacityProviderImpl;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function0<x> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ r this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(r rVar) {
            super(0);
            this.this$0 = rVar;
        }

        @NotNull
        public final x invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 92264, new Class[0], x.class)) {
                return new x(this.this$0.f82960f);
            }
            return (x) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 92264, new Class[0], x.class);
        }
    }

    public final void a(@NotNull Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f82955a, false, 92250, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f82955a, false, 92250, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
    }

    public final void d() {
    }

    public final /* bridge */ /* synthetic */ dmt.av.video.b.a.c g() {
        return this.f82957c;
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f82955a, false, 92255, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f82955a, false, 92255, new Class[0], Void.TYPE);
            return;
        }
        this.f82960f.h();
    }

    @NotNull
    public final MediaRecordPresenter f() {
        if (PatchProxy.isSupport(new Object[0], this, f82955a, false, 92254, new Class[0], MediaRecordPresenter.class)) {
            return (MediaRecordPresenter) PatchProxy.accessDispatch(new Object[0], this, f82955a, false, 92254, new Class[0], MediaRecordPresenter.class);
        }
        MediaRecordPresenter a2 = this.f82960f.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "recorder.internalRecorder");
        return a2;
    }

    @NotNull
    public final z a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f82955a, false, 92252, new Class[0], z.class)) {
            return (z) PatchProxy.accessDispatch(new Object[0], this, f82955a, false, 92252, new Class[0], z.class);
        }
        if (PatchProxy.isSupport(new Object[0], this, f82955a, false, 92247, new Class[0], x.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f82955a, false, 92247, new Class[0], x.class);
        } else {
            value = this.h.getValue();
        }
        return (x) value;
    }

    @NotNull
    public final y b() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f82955a, false, 92253, new Class[0], y.class)) {
            return (y) PatchProxy.accessDispatch(new Object[0], this, f82955a, false, 92253, new Class[0], y.class);
        }
        if (PatchProxy.isSupport(new Object[0], this, f82955a, false, 92246, new Class[0], u.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f82955a, false, 92246, new Class[0], u.class);
        } else {
            value = this.g.getValue();
        }
        return (u) value;
    }

    @NotNull
    public final b c() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f82955a, false, 92251, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], this, f82955a, false, 92251, new Class[0], b.class);
        }
        if (PatchProxy.isSupport(new Object[0], this, f82955a, false, 92248, new Class[0], p.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f82955a, false, 92248, new Class[0], p.class);
        } else {
            value = this.i.getValue();
        }
        return (p) value;
    }

    public final void a(@Nullable com.ss.android.medialib.c.b bVar) {
        this.f82959e = bVar;
    }

    public final void a(@Nullable MediaRecordPresenter.a aVar) {
        MediaRecordPresenter.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f82955a, false, 92245, new Class[]{MediaRecordPresenter.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f82955a, false, 92245, new Class[]{MediaRecordPresenter.a.class}, Void.TYPE);
            return;
        }
        this.f82960f.a((af.c) new b(aVar2));
    }

    public final void a(@NotNull Function1<? super Integer, Unit> function1) {
        Function1<? super Integer, Unit> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{function12}, this, f82955a, false, 92249, new Class[]{Function1.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function12}, this, f82955a, false, 92249, new Class[]{Function1.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function12, "callback");
        this.f82958d = function12;
    }

    private r(@NotNull Context context, @NotNull m mVar, @NotNull af afVar) {
        VEVideoEncodeSettings vEVideoEncodeSettings;
        j jVar;
        ab abVar;
        Context context2 = context;
        m mVar2 = mVar;
        af afVar2 = afVar;
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(mVar2, "recorderParameters");
        Intrinsics.checkParameterIsNotNull(afVar2, "recorder");
        this.j = context2;
        this.k = mVar2;
        this.f82960f = afVar2;
        this.f82957c = new dmt.av.video.b.a.b(this.j, this.f82960f);
        this.g = LazyKt.lazy(new c(this));
        this.h = LazyKt.lazy(new d(this));
        this.i = LazyKt.lazy(new a(this));
        af afVar3 = this.f82960f;
        am amVar = new am();
        amVar.f77898a = 1.0f;
        amVar.f77899b = com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableEnhanceVolume);
        afVar3.a(amVar);
        af afVar4 = this.f82960f;
        m mVar3 = this.k;
        if (PatchProxy.isSupport(new Object[]{mVar3}, null, q.f82954a, true, 92241, new Class[]{m.class}, VEVideoEncodeSettings.class)) {
            vEVideoEncodeSettings = (VEVideoEncodeSettings) PatchProxy.accessDispatch(new Object[]{mVar3}, null, q.f82954a, true, 92241, new Class[]{m.class}, VEVideoEncodeSettings.class);
        } else {
            Intrinsics.checkParameterIsNotNull(mVar3, "recorderParameters");
            VEVideoEncodeSettings.a aVar = new VEVideoEncodeSettings.a(1);
            aVar.c(mVar3.f82944b);
            aVar.b((int) (f.e() * 4.0f * 1024.0f * 1024.0f));
            aVar.a(o.a());
            aVar.d(f.g());
            aVar.a(((Number) mVar3.f82945c.getFirst()).intValue(), ((Number) mVar3.f82945c.getSecond()).intValue());
            vEVideoEncodeSettings = aVar.a();
            Intrinsics.checkExpressionValueIsNotNull(vEVideoEncodeSettings, "VEVideoEncodeSettings\n  …second)\n        }.build()");
        }
        if (PatchProxy.isSupport(new Object[0], null, q.f82954a, true, 92243, new Class[0], j.class)) {
            jVar = (j) PatchProxy.accessDispatch(new Object[0], null, q.f82954a, true, 92243, new Class[0], j.class);
        } else {
            jVar = new j.a().a();
            Intrinsics.checkExpressionValueIsNotNull(jVar, "VEAudioEncodeSettings\n  …pply {\n\n        }.Build()");
        }
        if (PatchProxy.isSupport(new Object[0], null, q.f82954a, true, 92244, new Class[0], ab.class)) {
            abVar = (ab) PatchProxy.accessDispatch(new Object[0], null, q.f82954a, true, 92244, new Class[0], ab.class);
        } else {
            ab.a aVar2 = new ab.a();
            aVar2.a(true);
            aVar2.b(true);
            abVar = aVar2.f77869a;
            Intrinsics.checkExpressionValueIsNotNull(abVar, "VEPreviewSettings\n      …g(true)\n        }.build()");
        }
        afVar4.a((com.ss.android.vesdk.a.a) null, vEVideoEncodeSettings, jVar, abVar);
        this.f82960f.a((VEListener.q) new VEListener.p(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f82961a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ r f82962b;

            {
                this.f82962b = r1;
            }

            public final void a(boolean z) {
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f82961a, false, 92257, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f82961a, false, 92257, new Class[]{Boolean.TYPE}, Void.TYPE);
                    return;
                }
                com.ss.android.medialib.c.b bVar = this.f82962b.f82959e;
                if (bVar != null) {
                    bVar.a(z ? 1 : 0, 1);
                }
            }

            public final void a(int i, @NotNull String str) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, f82961a, false, 92259, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, f82961a, false, 92259, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(str2, "msg");
                Function1<? super Integer, Unit> function1 = this.f82962b.f82958d;
                if (function1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("runningErrorCallback");
                }
                function1.invoke(Integer.valueOf(i));
            }

            public final void b(int i, @Nullable String str) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, f82961a, false, 92258, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, f82961a, false, 92258, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
                    return;
                }
                com.ss.android.medialib.c.b bVar = this.f82962b.f82959e;
                if (bVar != null) {
                    bVar.a(i);
                }
            }

            public final void a(int i, int i2, @Nullable String str) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}, this, f82961a, false, 92256, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}, this, f82961a, false, 92256, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                } else if (i == 1000) {
                    dmt.av.video.b.a.b bVar = this.f82962b.f82957c;
                    if (PatchProxy.isSupport(new Object[0], bVar, dmt.av.video.b.a.b.f4358a, false, 92325, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], bVar, dmt.av.video.b.a.b.f4358a, false, 92325, new Class[0], Void.TYPE);
                        return;
                    }
                    synchronized (bVar.k) {
                        bVar.l = true;
                        if (bVar.n) {
                            bVar.p.a((com.ss.android.vesdk.a.b) bVar.o);
                            bVar.m = true;
                            bVar.n = false;
                        } else {
                            bVar.m = false;
                        }
                    }
                }
            }
        });
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ r(android.content.Context r10, dmt.av.video.b.m r11, com.ss.android.vesdk.af r12, int r13) {
        /*
            r9 = this;
            com.ss.android.vesdk.af r12 = new com.ss.android.vesdk.af
            dmt.av.video.b.t r13 = new dmt.av.video.b.t
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = dmt.av.video.b.s.f82965a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r2 = 0
            r4 = 1
            r5 = 92265(0x16869, float:1.29291E-40)
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002c
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = dmt.av.video.b.s.f82965a
            r5 = 1
            r6 = 92265(0x16869, float:1.29291E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x003f
        L_0x002c:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = com.ss.android.ugc.aweme.shortvideo.fg.n
            r0.<init>(r1)
            r0.mkdirs()
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.String r1 = "File(ShortVideoConfig2.s…{ mkdirs() }.absolutePath"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
        L_0x003f:
            com.ss.android.ugc.aweme.shortvideo.a.d r1 = r11.f82946d
            if (r1 != 0) goto L_0x004c
            com.ss.android.ugc.aweme.shortvideo.a.d r1 = com.ss.android.ugc.aweme.shortvideo.a.d.a()
            java.lang.String r2 = "Workspace.allocate()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
        L_0x004c:
            r13.<init>(r0, r1)
            com.ss.android.vesdk.runtime.d r13 = (com.ss.android.vesdk.runtime.d) r13
            android.content.Context r0 = r10.getApplicationContext()
            r12.<init>(r13, r0)
            r9.<init>(r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.av.video.b.r.<init>(android.content.Context, dmt.av.video.b.m, com.ss.android.vesdk.af, int):void");
    }
}

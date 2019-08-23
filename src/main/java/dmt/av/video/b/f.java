package dmt.av.video.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ugc.aweme.shortvideo.ft;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.libsdl.app.AudioRecorderInterface;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0016J<\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016JH\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!H\u0016J\"\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020!H\u0016J,\u0010)\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010*\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00060\u0012H\u0016J\"\u0010+\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0010\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0018H\u0016J<\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\f2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020!2\u0006\u00106\u001a\u0002072\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00060\u0012H\u0016J\u0018\u00108\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010*\u001a\u00020\fH\u0016J,\u00109\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010*\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00060\u0012H\u0016J8\u0010:\u001a\u00020\u00182\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020!2\u0006\u0010>\u001a\u00020.2\u0006\u0010?\u001a\u00020\u00182\u0006\u0010@\u001a\u00020\u00182\u0006\u0010A\u001a\u00020!H\u0016JL\u0010B\u001a\u00020\u00062\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020!2\u0006\u0010>\u001a\u00020.2\u0006\u0010?\u001a\u00020\u00182\u0006\u0010@\u001a\u00020\u00182\u0006\u0010A\u001a\u00020!2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00060\u0012H\u0016J\b\u0010C\u001a\u00020\u0006H\u0016J\u001c\u0010D\u001a\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00060\u0012H\u0016J\b\u0010E\u001a\u00020\u0006H\u0016J\u001c\u0010F\u001a\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00060\u0012H\u0016J*\u0010G\u001a\u00020\u00182\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\f2\b\u0010K\u001a\u0004\u0018\u00010\f2\u0006\u0010L\u001a\u00020\u0018H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006M"}, d2 = {"Ldmt/av/video/record/OldVideoRecordCapacityProviderImpl;", "Ldmt/av/video/record/VideoRecordCapacityProvider;", "mediaRecordPresenter", "Lcom/ss/android/medialib/presenter/MediaRecordPresenter;", "(Lcom/ss/android/medialib/presenter/MediaRecordPresenter;)V", "changeSurface", "", "surface", "Landroid/view/Surface;", "concat", "Ldmt/av/video/record/RecorderConcatResult;", "videoPath", "", "audioPath", "description", "coment", "concatAsync", "callback", "Lkotlin/Function1;", "deleteLastFrag", "finish", "getEndFrameTimeUS", "", "initFaceBeautyPlay", "", "width", "height", "path", "destWidth", "destHeight", "strDetectModelsDir", "useMusic", "enableEffectAmazing", "", "initRecord", "context", "Landroid/content/Context;", "audioType", "caller", "Lorg/libsdl/app/AudioRecorderInterface;", "isStopRecording", "preStartPreviewAsync", "deviceName", "reInitRecord", "setPreviewSizeRatio", "ratio", "", "setVideoQuality", "videoQuality", "shotScreen", "strImagePath", "resolution", "", "hasEffect", "format", "Landroid/graphics/Bitmap$CompressFormat;", "startPreview", "startPreviewAsync", "startRecord", "speed", "", "isCPUEncode", "rate", "bitrateMode", "hwEncoderProfile", "isVibe", "startRecordAsync", "stopPreview", "stopPreviewAsync", "stopRecord", "stopRecordAsync", "tryRestore", "shortVideoSegments", "Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoSegments;", "videoDir", "musicPath", "trimIn", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f implements y {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82923a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaRecordPresenter f82924b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f82925a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f82926b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f82927c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f82928d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Function1 f82929e;

        a(String str, String str2, String str3, Function1 function1) {
            this.f82926b = str;
            this.f82927c = str2;
            this.f82928d = str3;
            this.f82929e = function1;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f82925a, false, 92218, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f82925a, false, 92218, new Class[0], Void.TYPE);
                return;
            }
            this.f82929e.invoke(new l(com.ss.android.medialib.f.a().a(this.f82926b, this.f82927c, this.f82928d, ""), this.f82926b, this.f82927c));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f82930a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f82931b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function1 f82932c;

        b(f fVar, Function1 function1) {
            this.f82931b = fVar;
            this.f82932c = function1;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f82930a, false, 92219, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f82930a, false, 92219, new Class[0], Void.TYPE);
                return;
            }
            this.f82931b.c();
            this.f82932c.invoke(0);
        }
    }

    public final void a(@NotNull Surface surface, @NotNull String str, @NotNull Function1<? super Integer, Unit> function1) {
        Surface surface2 = surface;
        String str2 = str;
        Function1<? super Integer, Unit> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{surface2, str2, function12}, this, f82923a, false, 92208, new Class[]{Surface.class, String.class, Function1.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface2, str2, function12}, this, f82923a, false, 92208, new Class[]{Surface.class, String.class, Function1.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(surface2, "surface");
        Intrinsics.checkParameterIsNotNull(str2, "deviceName");
        Intrinsics.checkParameterIsNotNull(function12, "callback");
    }

    public final void a(@NotNull Function1<? super Integer, Unit> function1) {
        Function1<? super Integer, Unit> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{function12}, this, f82923a, false, 92195, new Class[]{Function1.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function12}, this, f82923a, false, 92195, new Class[]{Function1.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function12, "callback");
        ThreadPlus.submitRunnable(new b(this, function12));
    }

    public final void a(@NotNull String str, @NotNull int[] iArr, boolean z, @NotNull Bitmap.CompressFormat compressFormat, @NotNull Function1<? super Integer, Unit> function1) {
        Object obj = str;
        Object obj2 = iArr;
        Object obj3 = compressFormat;
        Function1<? super Integer, Unit> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{obj, obj2, Byte.valueOf(z ? (byte) 1 : 0), obj3, function12}, this, f82923a, false, 92199, new Class[]{String.class, int[].class, Boolean.TYPE, Bitmap.CompressFormat.class, Function1.class}, Void.TYPE)) {
            Object[] objArr = {obj, obj2, Byte.valueOf(z), obj3, function12};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f82923a, false, 92199, new Class[]{String.class, int[].class, Boolean.TYPE, Bitmap.CompressFormat.class, Function1.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(obj, "strImagePath");
        Intrinsics.checkParameterIsNotNull(obj2, "resolution");
        Intrinsics.checkParameterIsNotNull(obj3, "format");
        Intrinsics.checkParameterIsNotNull(function12, "callback");
        this.f82924b.a(str, iArr, z, compressFormat, new g(function12));
    }

    public final void a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull Function1<? super l, Unit> function1) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        Function1<? super l, Unit> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{str5, str6, str7, str8, function12}, this, f82923a, false, 92205, new Class[]{String.class, String.class, String.class, String.class, Function1.class}, Void.TYPE)) {
            Object[] objArr = {str5, str6, str7, str8, function12};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f82923a, false, 92205, new Class[]{String.class, String.class, String.class, String.class, Function1.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str5, "videoPath");
        Intrinsics.checkParameterIsNotNull(str6, "audioPath");
        Intrinsics.checkParameterIsNotNull(str7, "description");
        Intrinsics.checkParameterIsNotNull(str8, "coment");
        Intrinsics.checkParameterIsNotNull(function12, "callback");
        ThreadPlus.submitRunnable(new a(str5, str6, str7, function12));
    }

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f82923a, false, 92211, new Class[0], Boolean.TYPE)) {
            return this.f82924b.h();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f82923a, false, 92211, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final long b() {
        if (!PatchProxy.isSupport(new Object[0], this, f82923a, false, 92212, new Class[0], Long.TYPE)) {
            return this.f82924b.e();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f82923a, false, 92212, new Class[0], Long.TYPE)).longValue();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f82923a, false, 92213, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f82923a, false, 92213, new Class[0], Void.TYPE);
            return;
        }
        this.f82924b.g();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f82923a, false, 92214, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f82923a, false, 92214, new Class[0], Void.TYPE);
            return;
        }
        this.f82924b.f();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f82923a, false, 92216, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f82923a, false, 92216, new Class[0], Void.TYPE);
            return;
        }
        this.f82924b.j();
    }

    public f(@NotNull MediaRecordPresenter mediaRecordPresenter) {
        Intrinsics.checkParameterIsNotNull(mediaRecordPresenter, "mediaRecordPresenter");
        this.f82924b = mediaRecordPresenter;
    }

    public final void a(@Nullable Surface surface) {
        Surface surface2 = surface;
        if (PatchProxy.isSupport(new Object[]{surface2}, this, f82923a, false, 92196, new Class[]{Surface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface2}, this, f82923a, false, 92196, new Class[]{Surface.class}, Void.TYPE);
            return;
        }
        this.f82924b.b(surface2);
    }

    public final void b(@NotNull Function1<? super Integer, Unit> function1) {
        Function1<? super Integer, Unit> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{function12}, this, f82923a, false, 92207, new Class[]{Function1.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function12}, this, f82923a, false, 92207, new Class[]{Function1.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function12, "callback");
        if (PatchProxy.isSupport(new Object[0], this, f82923a, false, 92215, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f82923a, false, 92215, new Class[0], Void.TYPE);
        } else {
            this.f82924b.l();
        }
        function12.invoke(0);
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f82923a, false, 92210, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f82923a, false, 92210, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.f82924b.b(f2);
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f82923a, false, 92198, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f82923a, false, 92198, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f82924b.b(i);
    }

    public final int a(@NotNull Context context, int i, @Nullable AudioRecorderInterface audioRecorderInterface) {
        Context context2 = context;
        AudioRecorderInterface audioRecorderInterface2 = audioRecorderInterface;
        if (PatchProxy.isSupport(new Object[]{context2, 5, audioRecorderInterface2}, this, f82923a, false, 92202, new Class[]{Context.class, Integer.TYPE, AudioRecorderInterface.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context2, 5, audioRecorderInterface2}, this, f82923a, false, 92202, new Class[]{Context.class, Integer.TYPE, AudioRecorderInterface.class}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        return this.f82924b.a(context2, 5, audioRecorderInterface2);
    }

    public final int b(@NotNull Context context, int i, @Nullable AudioRecorderInterface audioRecorderInterface) {
        Context context2 = context;
        AudioRecorderInterface audioRecorderInterface2 = audioRecorderInterface;
        if (PatchProxy.isSupport(new Object[]{context2, 5, audioRecorderInterface2}, this, f82923a, false, 92203, new Class[]{Context.class, Integer.TYPE, AudioRecorderInterface.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context2, 5, audioRecorderInterface2}, this, f82923a, false, 92203, new Class[]{Context.class, Integer.TYPE, AudioRecorderInterface.class}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        return this.f82924b.c(context2, 5, audioRecorderInterface2);
    }

    public final void b(@NotNull Surface surface, @NotNull String str, @NotNull Function1<? super Integer, Unit> function1) {
        int i;
        Surface surface2 = surface;
        String str2 = str;
        Function1<? super Integer, Unit> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{surface2, str2, function12}, this, f82923a, false, 92209, new Class[]{Surface.class, String.class, Function1.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface2, str2, function12}, this, f82923a, false, 92209, new Class[]{Surface.class, String.class, Function1.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(surface2, "surface");
        Intrinsics.checkParameterIsNotNull(str2, "deviceName");
        Intrinsics.checkParameterIsNotNull(function12, "callback");
        if (PatchProxy.isSupport(new Object[]{surface2, str2}, this, f82923a, false, 92217, new Class[]{Surface.class, String.class}, Integer.TYPE)) {
            i = ((Integer) PatchProxy.accessDispatch(new Object[]{surface2, str2}, this, f82923a, false, 92217, new Class[]{Surface.class, String.class}, Integer.TYPE)).intValue();
        } else {
            Intrinsics.checkParameterIsNotNull(surface2, "surface");
            Intrinsics.checkParameterIsNotNull(str2, "deviceName");
            i = this.f82924b.a(surface2, str2);
        }
        function12.invoke(Integer.valueOf(i));
    }

    public final int a(@NotNull ft ftVar, @NotNull String str, @Nullable String str2, int i) {
        ft ftVar2 = ftVar;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{ftVar2, str3, str2, Integer.valueOf(i)}, this, f82923a, false, 92197, new Class[]{ft.class, String.class, String.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{ftVar2, str3, str2, Integer.valueOf(i)}, this, f82923a, false, 92197, new Class[]{ft.class, String.class, String.class, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(ftVar2, "shortVideoSegments");
        Intrinsics.checkParameterIsNotNull(str3, "videoDir");
        return this.f82924b.a(ftVar.size(), str3);
    }

    public final void a(double d2, boolean z, float f2, int i, int i2, boolean z2, @NotNull Function1<? super Integer, Unit> function1) {
        int i3;
        Function1<? super Integer, Unit> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Byte.valueOf(z ? (byte) 1 : 0), Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2), (byte) 0, function12}, this, f82923a, false, 92200, new Class[]{Double.TYPE, Boolean.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Function1.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Byte.valueOf(z), Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2), (byte) 0, function12}, this, f82923a, false, 92200, new Class[]{Double.TYPE, Boolean.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Function1.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function12, "callback");
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Byte.valueOf(z), Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2), (byte) 0}, this, f82923a, false, 92201, new Class[]{Double.TYPE, Boolean.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)) {
            i3 = ((Integer) PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Byte.valueOf(z), Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2), (byte) 0}, this, f82923a, false, 92201, new Class[]{Double.TYPE, Boolean.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
        } else {
            i3 = this.f82924b.a(d2, z, f2, i, i2, false);
        }
        function12.invoke(Integer.valueOf(i3));
    }

    public final int a(int i, int i2, @NotNull String str, int i3, int i4, @NotNull String str2, int i5, boolean z) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str3, Integer.valueOf(i3), Integer.valueOf(i4), str4, Integer.valueOf(i5), Byte.valueOf(z ? (byte) 1 : 0)}, this, f82923a, false, 92204, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str3, Integer.valueOf(i3), Integer.valueOf(i4), str4, Integer.valueOf(i5), Byte.valueOf(z)}, this, f82923a, false, 92204, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(str3, "path");
        Intrinsics.checkParameterIsNotNull(str4, "strDetectModelsDir");
        return this.f82924b.a(i, i2, str, i3, i4, str2, i5, z);
    }
}

package dmt.av.video.b.a;

import android.content.Context;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.camera.IESCameraInterface;
import com.ss.android.medialib.camera.f;
import com.ss.android.medialib.camera.g;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.medialib.presenter.b;
import com.ss.android.medialib.presenter.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u001a\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010#\u001a\u00020\u001bH\u0016J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u001bH\u0016J\u0010\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020%H\u0016J\u0010\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020%H\u0016J\u0018\u0010-\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u001dH\u0016J\u0010\u0010/\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u00020\bH\u0016J\u0012\u00102\u001a\u00020\u001b2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u0012\u00105\u001a\u00020\u001b2\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u0010\u00108\u001a\u00020\u001b2\u0006\u00109\u001a\u00020%H\u0016J(\u0010:\u001a\u00020%2\u0006\u0010;\u001a\u00020\b2\u0006\u0010<\u001a\u00020\b2\u0006\u0010=\u001a\u00020\u00172\u0006\u0010>\u001a\u00020?H\u0016J\u0012\u0010@\u001a\u00020\u001b2\b\u0010.\u001a\u0004\u0018\u00010AH\u0016J\u0010\u0010B\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u00020\u001b2\u0006\u0010F\u001a\u00020\bH\u0016J\u0012\u0010G\u001a\u00020\u001b2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\u0012\u0010J\u001a\u00020\u001b2\b\u0010K\u001a\u0004\u0018\u00010LH\u0016J\b\u0010M\u001a\u00020\u001bH\u0016J\u0010\u0010N\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010O\u001a\u00020\u001b2\u0006\u0010P\u001a\u00020\u0017H\u0016J\b\u0010Q\u001a\u00020\u001bH\u0016J\b\u0010R\u001a\u00020\u001bH\u0016J\b\u0010S\u001a\u00020%H\u0016J\u0010\u0010T\u001a\u00020\u001b2\u0006\u0010U\u001a\u00020\bH\u0016R\u0014\u0010\u0007\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u000e\u0010\u0013\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006V"}, d2 = {"Ldmt/av/video/record/camera/OldCameraService;", "Ldmt/av/video/record/camera/ICameraService;", "context", "Landroid/content/Context;", "iesCameraManager", "Lcom/ss/android/medialib/camera/IESCameraManager;", "(Landroid/content/Context;Lcom/ss/android/medialib/camera/IESCameraManager;)V", "cameraPosition", "", "getCameraPosition", "()I", "cameraPreviewHeight", "getCameraPreviewHeight", "cameraPreviewWH", "", "getCameraPreviewWH", "()[I", "cameraPreviewWidth", "getCameraPreviewWidth", "cameraRotation", "currentCameraType", "getCurrentCameraType", "maxZoom", "", "getMaxZoom", "()F", "addCameraStateChangeListener", "", "cameraOpenListener", "Lcom/ss/android/medialib/camera/CameraOpenListener;", "attach", "mediaRecordPresenter", "Lcom/ss/android/medialib/presenter/MediaRecordPresenter;", "changeCamera", "cameraIndex", "close", "currentValid", "", "detach", "enableBodyBeauty", "enable", "init", "params", "Lcom/ss/android/medialib/camera/CameraParams;", "isTorchSupported", "open", "listener", "removeCameraStateChangeListener", "setBodyBeautyLevel", "level", "setCameraPreviewListener", "cameraPreviewListener", "Lcom/ss/android/medialib/camera/IESCameraInterface$CameraPreviewListener;", "setCameraPreviewSizeInterface", "cameraPreviewSizeInterface", "Lcom/ss/android/medialib/presenter/CameraPreviewSizeInterface;", "setEnableAntiShake", "toState", "setFocusAreas", "width", "height", "density", "ponits", "", "setHwSlowMotionListener", "Lcom/ss/android/medialib/camera/HwSlowMotionListener;", "setHwSlowOutputPath", "filePath", "", "setNextCameraMode", "mode", "setOnFirstFrameRefreshListener", "onFrameRefreshListener", "Lcom/ss/android/medialib/camera/IESCameraManager$OnFrameRefreshListener;", "setZoomListener", "zoomListener", "Lcom/ss/android/medialib/camera/IESCameraInterface$ZoomListener;", "startHwSlowRecord", "startPreview", "startZoom", "zoom", "stopPreview", "stopZoom", "supportHwSuperSlowCamera", "switchFlashMode", "flashMode", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82906a;

    /* renamed from: b  reason: collision with root package name */
    public int f82907b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f82908c;

    /* renamed from: d  reason: collision with root package name */
    private final g f82909d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onCameraRotationChanged"}, k = 3, mv = {1, 1, 15})
    static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f82910a;

        a(d dVar) {
            this.f82910a = dVar;
        }

        public final void b(int i) {
            this.f82910a.f82907b = i;
        }
    }

    public final void a(@NotNull com.ss.android.medialib.camera.d dVar) {
        com.ss.android.medialib.camera.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f82906a, false, 92349, new Class[]{com.ss.android.medialib.camera.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f82906a, false, 92349, new Class[]{com.ss.android.medialib.camera.d.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(dVar2, "params");
        this.f82909d.a(dVar2);
    }

    public final void a(@NotNull MediaRecordPresenter mediaRecordPresenter) {
        if (PatchProxy.isSupport(new Object[]{mediaRecordPresenter}, this, f82906a, false, 92355, new Class[]{MediaRecordPresenter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mediaRecordPresenter}, this, f82906a, false, 92355, new Class[]{MediaRecordPresenter.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(mediaRecordPresenter, "mediaRecordPresenter");
        this.f82909d.a((c) mediaRecordPresenter);
        this.f82909d.f29528d = new a(this);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f82906a, false, 92356, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f82906a, false, 92356, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            this.f82909d.b(z);
        }
    }

    public final boolean a(int i, int i2, float f2, @NotNull float[] fArr) {
        Object obj = fArr;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), obj}, this, f82906a, false, 92362, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, float[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), obj}, this, f82906a, false, 92362, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, float[].class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(obj, "ponits");
        return this.f82909d.a(i, i2, f2, fArr, this.f82907b);
    }

    public final void a(@Nullable f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, f82906a, false, 92370, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2}, this, f82906a, false, 92370, new Class[]{f.class}, Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            g.b().a(fVar2);
        }
    }

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f82906a, false, 92371, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f82906a, false, 92371, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "filePath");
        if (Build.VERSION.SDK_INT >= 23) {
            g.b().a(str2);
        }
    }

    public final float a() {
        if (!PatchProxy.isSupport(new Object[0], this, f82906a, false, 92344, new Class[0], Float.TYPE)) {
            return this.f82909d.f();
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, f82906a, false, 92344, new Class[0], Float.TYPE)).floatValue();
    }

    @Nullable
    public final int[] b() {
        if (!PatchProxy.isSupport(new Object[0], this, f82906a, false, 92345, new Class[0], int[].class)) {
            return this.f82909d.i();
        }
        return (int[]) PatchProxy.accessDispatch(new Object[0], this, f82906a, false, 92345, new Class[0], int[].class);
    }

    public final int c() {
        if (!PatchProxy.isSupport(new Object[0], this, f82906a, false, 92346, new Class[0], Integer.TYPE)) {
            return this.f82909d.c();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f82906a, false, 92346, new Class[0], Integer.TYPE)).intValue();
    }

    public final int d() {
        if (!PatchProxy.isSupport(new Object[0], this, f82906a, false, 92347, new Class[0], Integer.TYPE)) {
            return this.f82909d.d();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f82906a, false, 92347, new Class[0], Integer.TYPE)).intValue();
    }

    public final int e() {
        if (!PatchProxy.isSupport(new Object[0], this, f82906a, false, 92342, new Class[0], Integer.TYPE)) {
            return this.f82909d.a();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f82906a, false, 92342, new Class[0], Integer.TYPE)).intValue();
    }

    public final int f() {
        if (!PatchProxy.isSupport(new Object[0], this, f82906a, false, 92343, new Class[0], Integer.TYPE)) {
            return this.f82909d.k();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f82906a, false, 92343, new Class[0], Integer.TYPE)).intValue();
    }

    public final boolean g() {
        if (!PatchProxy.isSupport(new Object[0], this, f82906a, false, 92358, new Class[0], Boolean.TYPE)) {
            return this.f82909d.h();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f82906a, false, 92358, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean h() {
        if (!PatchProxy.isSupport(new Object[0], this, f82906a, false, 92361, new Class[0], Boolean.TYPE)) {
            return this.f82909d.g();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f82906a, false, 92361, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean i() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f82906a, false, 92363, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f82906a, false, 92363, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (Build.VERSION.SDK_INT < 23) {
            return false;
        } else {
            if (this.f82909d.m() == 4) {
                z = true;
            }
            return z;
        }
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f82906a, false, 92352, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f82906a, false, 92352, new Class[0], Void.TYPE);
            return;
        }
        this.f82909d.e();
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f82906a, false, 92368, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f82906a, false, 92368, new Class[0], Void.TYPE);
            return;
        }
        g.b().f29528d = null;
        g.b().j();
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f82906a, false, 92372, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f82906a, false, 92372, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            g.b().l();
        }
    }

    public final void a(@Nullable g.a aVar) {
        this.f82909d.k = aVar;
    }

    public final void a(@Nullable com.ss.android.medialib.presenter.a aVar) {
        this.f82909d.f29529e = aVar;
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f82906a, false, 92366, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f82906a, false, 92366, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.f82909d.b(f2);
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f82906a, false, 92360, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f82906a, false, 92360, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f82909d.a(i);
    }

    public final void c(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f82906a, false, 92365, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f82906a, false, 92365, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (Build.VERSION.SDK_INT >= 23) {
            this.f82909d.b(i);
        } else {
            throw new k("An operation is not implemented: " + "VERSION.SDK_INT < M");
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f82906a, false, 92357, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f82906a, false, 92357, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            this.f82909d.c(i);
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f82906a, false, 92369, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f82906a, false, 92369, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            g.b().c(z);
        }
    }

    public final void a(@NotNull Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f82906a, false, 92364, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f82906a, false, 92364, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        this.f82909d.a(context2);
    }

    public final void a(@Nullable IESCameraInterface.a aVar) {
        IESCameraInterface.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f82906a, false, 92359, new Class[]{IESCameraInterface.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f82906a, false, 92359, new Class[]{IESCameraInterface.a.class}, Void.TYPE);
            return;
        }
        this.f82909d.a(aVar2);
    }

    public final void a(@Nullable IESCameraInterface.d dVar) {
        IESCameraInterface.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f82906a, false, 92348, new Class[]{IESCameraInterface.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f82906a, false, 92348, new Class[]{IESCameraInterface.d.class}, Void.TYPE);
            return;
        }
        this.f82909d.a(dVar2);
    }

    public d(@NotNull Context context, @NotNull g gVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(gVar, "iesCameraManager");
        this.f82908c = context;
        this.f82909d = gVar;
    }

    public final void b(int i, @NotNull com.ss.android.medialib.camera.c cVar) {
        com.ss.android.medialib.camera.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), cVar2}, this, f82906a, false, 92351, new Class[]{Integer.TYPE, com.ss.android.medialib.camera.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), cVar2}, this, f82906a, false, 92351, new Class[]{Integer.TYPE, com.ss.android.medialib.camera.c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cVar2, "listener");
        this.f82909d.a(i, cVar2);
    }

    public final void a(int i, @Nullable com.ss.android.medialib.camera.c cVar) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), cVar}, this, f82906a, false, 92350, new Class[]{Integer.TYPE, com.ss.android.medialib.camera.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), cVar}, this, f82906a, false, 92350, new Class[]{Integer.TYPE, com.ss.android.medialib.camera.c.class}, Void.TYPE);
            return;
        }
        this.f82909d.a(this.f82908c, i, cVar);
    }
}

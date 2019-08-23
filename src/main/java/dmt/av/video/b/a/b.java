package dmt.av.video.b.a;

import android.content.Context;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.camera.IESCameraInterface;
import com.ss.android.medialib.camera.f;
import com.ss.android.medialib.camera.g;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ugc.aweme.utils.ek;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.af;
import com.ss.android.vesdk.k;
import com.ss.android.vesdk.l;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u000eH\u0016J\u000e\u0010=\u001a\u00020;2\u0006\u0010>\u001a\u00020%J\u0010\u0010?\u001a\u00020;2\u0006\u0010@\u001a\u00020AH\u0017J\u001a\u0010B\u001a\u00020;2\u0006\u0010C\u001a\u00020\u00122\b\u0010D\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010E\u001a\u00020;H\u0016J\b\u0010F\u001a\u00020\u0010H\u0016J\b\u0010G\u001a\u00020;H\u0016J\u0010\u0010H\u001a\u00020;2\u0006\u0010I\u001a\u00020\u0010H\u0016J\u0010\u0010J\u001a\u00020;2\u0006\u0010K\u001a\u00020LH\u0016J\b\u0010M\u001a\u00020\u0010H\u0016J\b\u0010N\u001a\u00020;H\u0016J\b\u0010O\u001a\u00020;H\u0016J\u0018\u0010P\u001a\u00020;2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010>\u001a\u00020\u000eH\u0016J\u0010\u0010Q\u001a\u00020;2\u0006\u0010D\u001a\u00020\u000eH\u0016J\u000e\u0010R\u001a\u00020;2\u0006\u0010>\u001a\u00020%J\u0010\u0010S\u001a\u00020;2\u0006\u0010T\u001a\u00020\u0012H\u0016J\u0012\u0010U\u001a\u00020;2\b\u0010V\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010W\u001a\u00020;2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010X\u001a\u00020;2\u0006\u0010Y\u001a\u00020\u0010H\u0016J(\u0010Z\u001a\u00020\u00102\u0006\u0010[\u001a\u00020\u00122\u0006\u0010\\\u001a\u00020\u00122\u0006\u0010]\u001a\u00020/2\u0006\u0010^\u001a\u00020_H\u0016J\u0012\u0010`\u001a\u00020;2\b\u0010>\u001a\u0004\u0018\u00010,H\u0016J\u0010\u0010a\u001a\u00020;2\u0006\u0010b\u001a\u00020cH\u0016J\u0010\u0010d\u001a\u00020;2\u0006\u0010e\u001a\u00020\u0012H\u0016J\u0012\u0010f\u001a\u00020;2\b\u0010g\u001a\u0004\u0018\u00010*H\u0016J\u0012\u0010h\u001a\u00020;2\b\u00108\u001a\u0004\u0018\u000109H\u0016J\b\u0010i\u001a\u00020;H\u0016J\u0010\u0010j\u001a\u00020;2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010k\u001a\u00020;2\u0006\u0010l\u001a\u00020/H\u0016J\b\u0010m\u001a\u00020;H\u0016J\b\u0010n\u001a\u00020;H\u0016J\b\u0010o\u001a\u00020\u0010H\u0016J\u0010\u0010p\u001a\u00020;2\u0006\u0010q\u001a\u00020\u0012H\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0012XD¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u0012XD¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0016\u0010!\u001a\n #*\u0004\u0018\u00010\"0\"X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010'\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012@RX\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0014R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u0002\n\u0000R\u001e\u00100\u001a\u00020/2\u0006\u0010&\u001a\u00020/@RX\u000e¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u000e\u00103\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u000109X\u000e¢\u0006\u0002\n\u0000¨\u0006r"}, d2 = {"Ldmt/av/video/record/camera/CameraService;", "Ldmt/av/video/record/camera/ICameraService;", "Ldmt/av/video/record/camera/IRenderPipeline;", "context", "Landroid/content/Context;", "veRecorder", "Lcom/ss/android/vesdk/VERecorder;", "(Landroid/content/Context;Lcom/ss/android/vesdk/VERecorder;)V", "cameraCapture", "Lcom/ss/android/vesdk/VECameraCapture;", "getCameraCapture", "()Lcom/ss/android/vesdk/VECameraCapture;", "cameraOpenListenerList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/medialib/camera/CameraOpenListener;", "cameraOpened", "", "cameraPosition", "", "getCameraPosition", "()I", "cameraPreviewHeight", "getCameraPreviewHeight", "cameraPreviewListenerList", "Lcom/ss/android/medialib/camera/IESCameraInterface$CameraPreviewListener;", "cameraPreviewSizeInterface", "Lcom/ss/android/medialib/presenter/CameraPreviewSizeInterface;", "cameraPreviewWH", "", "getCameraPreviewWH", "()[I", "cameraPreviewWidth", "getCameraPreviewWidth", "cameraSettings", "Lcom/ss/android/vesdk/VECameraSettings;", "kotlin.jvm.PlatformType", "cameraZoomSupportListenerList", "Ldmt/av/video/record/camera/ZoomSupportListener;", "<set-?>", "currentCameraType", "getCurrentCameraType", "frameRefreshListenerList", "Lcom/ss/android/medialib/camera/IESCameraManager$OnFrameRefreshListener;", "hwSlowMotionListener", "Lcom/ss/android/medialib/camera/HwSlowMotionListener;", "lastCameraPreviewListener", "lastFrameRefreshListener", "", "maxZoom", "getMaxZoom", "()F", "needStartPreview", "pipelineAttached", "pipelinesReady", "previewLock", "", "zoomListener", "Lcom/ss/android/medialib/camera/IESCameraInterface$ZoomListener;", "addCameraStateChangeListener", "", "cameraOpenLisener", "addCameraZoomSupportListener", "listener", "attach", "mediaRecordPresenter", "Lcom/ss/android/medialib/presenter/MediaRecordPresenter;", "changeCamera", "cameraIndex", "cameraOpenListener", "close", "currentValid", "detach", "enableBodyBeauty", "enable", "init", "params", "Lcom/ss/android/medialib/camera/CameraParams;", "isTorchSupported", "onRenderPipelineCreated", "onRenderPipelineDestroyed", "open", "removeCameraStateChangeListener", "removeCameraZoomSupportListener", "setBodyBeautyLevel", "level", "setCameraPreviewListener", "cameraPreviewListener", "setCameraPreviewSizeInterface", "setEnableAntiShake", "toState", "setFocusAreas", "width", "height", "density", "points", "", "setHwSlowMotionListener", "setHwSlowOutputPath", "filePath", "", "setNextCameraMode", "mode", "setOnFirstFrameRefreshListener", "onFrameRefreshListener", "setZoomListener", "startHwSlowRecord", "startPreview", "startZoom", "zoom", "stopPreview", "stopZoom", "supportHwSuperSlowCamera", "switchFlashMode", "flashMode", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4358a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList<f> f4359b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public IESCameraInterface.d f4360c;

    /* renamed from: d  reason: collision with root package name */
    public final CopyOnWriteArrayList<IESCameraInterface.a> f4361d = new CopyOnWriteArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public final CopyOnWriteArrayList<g.a> f4362e = new CopyOnWriteArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public f f4363f;
    public final CopyOnWriteArrayList<com.ss.android.medialib.camera.c> g = new CopyOnWriteArrayList<>();
    public float h;
    public boolean i;
    public int j = -1;
    public final Object k = new Object();
    public boolean l;
    public boolean m;
    public boolean n;
    @NotNull
    public final k o = new k();
    public final af p;
    private IESCameraInterface.a q;
    private g.a r;
    private com.ss.android.medialib.presenter.a s;
    @NotNull
    private final int[] t = {720, 1280};
    private final int u = 720;
    private final int v = 1280;
    private l w = new l.a().f78029a;
    private final Context x;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"dmt/av/video/record/camera/CameraService$changeCamera$1", "Lcom/ss/android/medialib/camera/CameraOpenListener;", "onOpenFail", "", "cameraType", "", "errorCode", "info", "", "onOpenSuccess", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements com.ss.android.medialib.camera.c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f82892a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f82893b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.medialib.camera.c f82894c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
        /* renamed from: dmt.av.video.b.a.b$a$a  reason: collision with other inner class name */
        static final class C0873a extends Lambda implements Function0<Unit> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ int $cameraType;
            final /* synthetic */ int $errorCode;
            final /* synthetic */ String $info;
            final /* synthetic */ a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0873a(a aVar, int i, int i2, String str) {
                super(0);
                this.this$0 = aVar;
                this.$cameraType = i;
                this.$errorCode = i2;
                this.$info = str;
            }

            public final void invoke() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 92328, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 92328, new Class[0], Void.TYPE);
                    return;
                }
                com.ss.android.medialib.camera.c cVar = this.this$0.f82894c;
                if (cVar != null) {
                    cVar.a(this.$cameraType, this.$errorCode, this.$info);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
        /* renamed from: dmt.av.video.b.a.b$a$b  reason: collision with other inner class name */
        static final class C0874b extends Lambda implements Function0<Unit> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ int $cameraType;
            final /* synthetic */ a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0874b(a aVar, int i) {
                super(0);
                this.this$0 = aVar;
                this.$cameraType = i;
            }

            public final void invoke() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 92329, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 92329, new Class[0], Void.TYPE);
                    return;
                }
                com.ss.android.medialib.camera.c cVar = this.this$0.f82894c;
                if (cVar != null) {
                    cVar.a(this.$cameraType);
                }
            }
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f82892a, false, 92326, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f82892a, false, 92326, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f82893b.a((com.ss.android.medialib.camera.c) this);
            ek.a(new C0874b(this, i));
        }

        a(b bVar, com.ss.android.medialib.camera.c cVar) {
            this.f82893b = bVar;
            this.f82894c = cVar;
        }

        public final void a(int i, int i2, @Nullable String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f82892a, false, 92327, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f82892a, false, 92327, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                return;
            }
            this.f82893b.a((com.ss.android.medialib.camera.c) this);
            int i3 = i;
            int i4 = i2;
            ek.a(new C0873a(this, i, i2, str2));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"dmt/av/video/record/camera/CameraService$open$1", "Lcom/ss/android/medialib/camera/CameraOpenListener;", "onOpenFail", "", "cameraType", "", "errorCode", "info", "", "onOpenSuccess", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: dmt.av.video.b.a.b$b  reason: collision with other inner class name */
    public static final class C0875b implements com.ss.android.medialib.camera.c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f82895a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f82896b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.medialib.camera.c f82897c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010!\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fH\u0016¨\u0006\r"}, d2 = {"dmt/av/video/record/camera/CameraService$open$1$onOpenSuccess$1", "Ldmt/av/video/record/camera/ZoomSupportListener;", "onZoomSupport", "", "cameraType", "", "supportZoom", "", "supportSmooth", "maxZoom", "", "ratios", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        /* renamed from: dmt.av.video.b.a.b$b$a */
        public static final class a implements f {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f82898a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C0875b f82899b;

            a(C0875b bVar) {
                this.f82899b = bVar;
            }

            public final void a(int i, boolean z, boolean z2, float f2, @Nullable List<Integer> list) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Float.valueOf(f2), list}, this, f82898a, false, 92332, new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Float.TYPE, List.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z), Byte.valueOf(z2), Float.valueOf(f2), list}, this, f82898a, false, 92332, new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Float.TYPE, List.class}, Void.TYPE);
                    return;
                }
                this.f82899b.f82897c.a(i);
                b bVar = this.f82899b.f82896b;
                f fVar = this;
                if (PatchProxy.isSupport(new Object[]{fVar}, bVar, b.f4358a, false, 92318, new Class[]{f.class}, Void.TYPE)) {
                    b bVar2 = bVar;
                    PatchProxy.accessDispatch(new Object[]{fVar}, bVar2, b.f4358a, false, 92318, new Class[]{f.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(fVar, "listener");
                bVar.f4359b.remove(fVar);
            }
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f82895a, false, 92330, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f82895a, false, 92330, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f82896b.a((com.ss.android.medialib.camera.c) this);
            b bVar = this.f82896b;
            f aVar = new a(this);
            if (PatchProxy.isSupport(new Object[]{aVar}, bVar, b.f4358a, false, 92317, new Class[]{f.class}, Void.TYPE)) {
                b bVar2 = bVar;
                PatchProxy.accessDispatch(new Object[]{aVar}, bVar2, b.f4358a, false, 92317, new Class[]{f.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(aVar, "listener");
                bVar.f4359b.add(aVar);
            }
            this.f82896b.o.h();
        }

        C0875b(b bVar, com.ss.android.medialib.camera.c cVar) {
            this.f82896b = bVar;
            this.f82897c = cVar;
        }

        public final void a(int i, int i2, @Nullable String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f82895a, false, 92331, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f82895a, false, 92331, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                return;
            }
            this.f82896b.a((com.ss.android.medialib.camera.c) this);
            int i3 = i;
            int i4 = i2;
            this.f82897c.a(i, i2, str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\u001a\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0016J\"\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"dmt/av/video/record/camera/CameraService$open$2", "Lcom/ss/android/vesdk/VEListener$VECameraStateExtListener;", "errorCode", "", "errorMsg", "", "cameraOpenFailed", "", "cameraType", "cameraOpenSuccess", "onError", "ret", "msg", "onInfo", "infoType", "ext", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements VEListener.d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f82900a;

        /* renamed from: b  reason: collision with root package name */
        public int f82901b;

        /* renamed from: c  reason: collision with root package name */
        public String f82902c = "";

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f82903d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
        static final class a extends Lambda implements Function0<Unit> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ int $cameraType;
            final /* synthetic */ c this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c cVar, int i) {
                super(0);
                this.this$0 = cVar;
                this.$cameraType = i;
            }

            public final void invoke() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 92335, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 92335, new Class[0], Void.TYPE);
                    return;
                }
                this.this$0.f82903d.i = false;
                for (com.ss.android.medialib.camera.c a2 : this.this$0.f82903d.g) {
                    a2.a(this.$cameraType, this.this$0.f82901b, this.this$0.f82902c);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
        /* renamed from: dmt.av.video.b.a.b$c$b  reason: collision with other inner class name */
        static final class C0876b extends Lambda implements Function0<Unit> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ int $ext;
            final /* synthetic */ int $infoType;
            final /* synthetic */ c this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0876b(c cVar, int i, int i2) {
                super(0);
                this.this$0 = cVar;
                this.$infoType = i;
                this.$ext = i2;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:16:0x0080, code lost:
                return;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void invoke() {
                /*
                    r9 = this;
                    r0 = 0
                    java.lang.Object[] r1 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
                    java.lang.Class[] r6 = new java.lang.Class[r0]
                    java.lang.Class r7 = java.lang.Void.TYPE
                    r4 = 0
                    r5 = 92336(0x168b0, float:1.2939E-40)
                    r2 = r9
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                    if (r1 == 0) goto L_0x0025
                    java.lang.Object[] r2 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
                    r5 = 0
                    r6 = 92336(0x168b0, float:1.2939E-40)
                    java.lang.Class[] r7 = new java.lang.Class[r0]
                    java.lang.Class r8 = java.lang.Void.TYPE
                    r3 = r9
                    com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                    return
                L_0x0025:
                    int r0 = r9.$infoType
                    r1 = 100
                    if (r0 == r1) goto L_0x009e
                    switch(r0) {
                        case 0: goto L_0x0081;
                        case 1: goto L_0x0080;
                        case 2: goto L_0x004d;
                        case 3: goto L_0x0030;
                        default: goto L_0x002e;
                    }
                L_0x002e:
                    goto L_0x00d7
                L_0x0030:
                    dmt.av.video.b.a.b$c r0 = r9.this$0
                    dmt.av.video.b.a.b r0 = r0.f82903d
                    java.util.concurrent.CopyOnWriteArrayList<com.ss.android.medialib.camera.g$a> r0 = r0.f4362e
                    java.lang.Iterable r0 = (java.lang.Iterable) r0
                    java.util.Iterator r0 = r0.iterator()
                L_0x003c:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L_0x004c
                    java.lang.Object r1 = r0.next()
                    com.ss.android.medialib.camera.g$a r1 = (com.ss.android.medialib.camera.g.a) r1
                    r1.a()
                    goto L_0x003c
                L_0x004c:
                    return
                L_0x004d:
                    dmt.av.video.b.a.b$c r0 = r9.this$0
                    dmt.av.video.b.a.b r0 = r0.f82903d
                    r1 = 1
                    r0.i = r1
                    dmt.av.video.b.a.b$c r0 = r9.this$0
                    dmt.av.video.b.a.b r0 = r0.f82903d
                    int r1 = r9.$ext
                    r0.j = r1
                    dmt.av.video.b.a.b$c r0 = r9.this$0
                    dmt.av.video.b.a.b r0 = r0.f82903d
                    java.util.concurrent.CopyOnWriteArrayList<com.ss.android.medialib.camera.c> r0 = r0.g
                    java.lang.Iterable r0 = (java.lang.Iterable) r0
                    java.util.Iterator r0 = r0.iterator()
                L_0x0068:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L_0x0080
                    java.lang.Object r1 = r0.next()
                    com.ss.android.medialib.camera.c r1 = (com.ss.android.medialib.camera.c) r1
                    dmt.av.video.b.a.b$c r2 = r9.this$0
                    dmt.av.video.b.a.b r2 = r2.f82903d
                    int r2 = r2.e()
                    r1.a(r2)
                    goto L_0x0068
                L_0x0080:
                    return
                L_0x0081:
                    dmt.av.video.b.a.b$c r0 = r9.this$0
                    dmt.av.video.b.a.b r0 = r0.f82903d
                    java.util.concurrent.CopyOnWriteArrayList<com.ss.android.medialib.camera.IESCameraInterface$a> r0 = r0.f4361d
                    java.lang.Iterable r0 = (java.lang.Iterable) r0
                    java.util.Iterator r0 = r0.iterator()
                L_0x008d:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L_0x009d
                    java.lang.Object r1 = r0.next()
                    com.ss.android.medialib.camera.IESCameraInterface$a r1 = (com.ss.android.medialib.camera.IESCameraInterface.a) r1
                    r1.a()
                    goto L_0x008d
                L_0x009d:
                    return
                L_0x009e:
                    int r0 = r9.$ext
                    switch(r0) {
                        case 100: goto L_0x00ca;
                        case 101: goto L_0x00bd;
                        case 102: goto L_0x00b0;
                        case 103: goto L_0x00a4;
                        default: goto L_0x00a3;
                    }
                L_0x00a3:
                    goto L_0x00d7
                L_0x00a4:
                    dmt.av.video.b.a.b$c r0 = r9.this$0
                    dmt.av.video.b.a.b r0 = r0.f82903d
                    com.ss.android.medialib.camera.f r0 = r0.f4363f
                    if (r0 == 0) goto L_0x00d7
                    r0.d()
                    return
                L_0x00b0:
                    dmt.av.video.b.a.b$c r0 = r9.this$0
                    dmt.av.video.b.a.b r0 = r0.f82903d
                    com.ss.android.medialib.camera.f r0 = r0.f4363f
                    if (r0 == 0) goto L_0x00bc
                    r0.c()
                    goto L_0x00d7
                L_0x00bc:
                    return
                L_0x00bd:
                    dmt.av.video.b.a.b$c r0 = r9.this$0
                    dmt.av.video.b.a.b r0 = r0.f82903d
                    com.ss.android.medialib.camera.f r0 = r0.f4363f
                    if (r0 == 0) goto L_0x00c9
                    r0.b()
                    goto L_0x00d7
                L_0x00c9:
                    return
                L_0x00ca:
                    dmt.av.video.b.a.b$c r0 = r9.this$0
                    dmt.av.video.b.a.b r0 = r0.f82903d
                    com.ss.android.medialib.camera.f r0 = r0.f4363f
                    if (r0 == 0) goto L_0x00d6
                    r0.a()
                    goto L_0x00d7
                L_0x00d6:
                    return
                L_0x00d7:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: dmt.av.video.b.a.b.c.C0876b.invoke():void");
            }
        }

        c(b bVar) {
            this.f82903d = bVar;
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f82900a, false, 92333, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f82900a, false, 92333, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f82903d.j = -1;
            ek.a(new a(this, i));
        }

        public final void a(int i, @Nullable String str) {
            this.f82901b = i;
            if (str != null) {
                this.f82902c = str;
            }
        }

        public final void a(int i, int i2, @Nullable String str) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}, this, f82900a, false, 92334, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}, this, f82900a, false, 92334, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                return;
            }
            ek.a(new C0876b(this, i, i2));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010!\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0016J8\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\t2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010H\u0016¨\u0006\u0011"}, d2 = {"dmt/av/video/record/camera/CameraService$open$3", "Lcom/ss/android/vesdk/VERecorder$VECameraZoomListener;", "enableSmooth", "", "onChange", "", "cameraType", "", "zoomValue", "", "stopped", "onZoomSupport", "supportZoom", "supportSmooth", "maxZoom", "ratios", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d implements af.d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f82904a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f82905b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
        static final class a extends Lambda implements Function0<Unit> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ int $cameraType;
            final /* synthetic */ boolean $stopped;
            final /* synthetic */ float $zoomValue;
            final /* synthetic */ d this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar, int i, float f2, boolean z) {
                super(0);
                this.this$0 = dVar;
                this.$cameraType = i;
                this.$zoomValue = f2;
                this.$stopped = z;
            }

            public final void invoke() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 92340, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 92340, new Class[0], Void.TYPE);
                    return;
                }
                IESCameraInterface.d dVar = this.this$0.f82905b.f4360c;
                if (dVar != null) {
                    dVar.a(this.$cameraType, this.$zoomValue, this.$stopped);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
        /* renamed from: dmt.av.video.b.a.b$d$b  reason: collision with other inner class name */
        static final class C0877b extends Lambda implements Function0<Unit> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ int $cameraType;
            final /* synthetic */ float $maxZoom;
            final /* synthetic */ List $ratios;
            final /* synthetic */ boolean $supportSmooth;
            final /* synthetic */ boolean $supportZoom;
            final /* synthetic */ d this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0877b(d dVar, int i, boolean z, boolean z2, float f2, List list) {
                super(0);
                this.this$0 = dVar;
                this.$cameraType = i;
                this.$supportZoom = z;
                this.$supportSmooth = z2;
                this.$maxZoom = f2;
                this.$ratios = list;
            }

            public final void invoke() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 92341, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 92341, new Class[0], Void.TYPE);
                    return;
                }
                for (f a2 : this.this$0.f82905b.f4359b) {
                    a2.a(this.$cameraType, this.$supportZoom, this.$supportSmooth, this.$maxZoom, this.$ratios);
                }
                IESCameraInterface.d dVar = this.this$0.f82905b.f4360c;
                if (dVar != null) {
                    dVar.a(this.$cameraType, this.$supportZoom, this.$supportSmooth, this.$maxZoom, this.$ratios);
                }
            }
        }

        public final boolean a() {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, f82904a, false, 92337, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f82904a, false, 92337, new Class[0], Boolean.TYPE)).booleanValue();
            }
            IESCameraInterface.d dVar = this.f82905b.f4360c;
            if (dVar != null) {
                z = dVar.a();
            }
            return z;
        }

        d(b bVar) {
            this.f82905b = bVar;
        }

        public final void a(int i, float f2, boolean z) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f82904a, false, 92338, new Class[]{Integer.TYPE, Float.TYPE, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Byte.valueOf(z)}, this, f82904a, false, 92338, new Class[]{Integer.TYPE, Float.TYPE, Boolean.TYPE}, Void.TYPE);
                return;
            }
            ek.a(new a(this, i, f2, z));
        }

        public final void a(int i, boolean z, boolean z2, float f2, @Nullable List<Integer> list) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Float.valueOf(f2), list}, this, f82904a, false, 92339, new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Float.TYPE, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z), Byte.valueOf(z2), Float.valueOf(f2), list}, this, f82904a, false, 92339, new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Float.TYPE, List.class}, Void.TYPE);
                return;
            }
            float f3 = f2;
            this.f82905b.h = f3;
            C0877b bVar = new C0877b(this, i, z, z2, f3, list);
            ek.a(bVar);
        }
    }

    @Deprecated(message = "兼容IESCameraManager", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public final void a(@NotNull MediaRecordPresenter mediaRecordPresenter) {
        Intrinsics.checkParameterIsNotNull(mediaRecordPresenter, "mediaRecordPresenter");
    }

    public final float a() {
        return this.h;
    }

    @NotNull
    public final int[] b() {
        return this.t;
    }

    public final int c() {
        return this.u;
    }

    public final int d() {
        return this.v;
    }

    public final int e() {
        return this.j;
    }

    public final boolean g() {
        return this.i;
    }

    public final void a(@NotNull com.ss.android.medialib.camera.d dVar) {
        l.d dVar2;
        com.ss.android.medialib.camera.d dVar3 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar3}, this, f4358a, false, 92300, new Class[]{com.ss.android.medialib.camera.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar3}, this, f4358a, false, 92300, new Class[]{com.ss.android.medialib.camera.d.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(dVar3, "params");
        l lVar = this.w;
        Intrinsics.checkExpressionValueIsNotNull(lVar, "cameraSettings");
        if (PatchProxy.isSupport(new Object[]{lVar, dVar3}, null, e.f82911a, true, 92374, new Class[]{l.class, com.ss.android.medialib.camera.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lVar, dVar3}, null, e.f82911a, true, 92374, new Class[]{l.class, com.ss.android.medialib.camera.d.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(lVar, "$this$copySettingsFrom");
        Intrinsics.checkParameterIsNotNull(dVar3, "params");
        lVar.i = e.b(dVar3.f29518c);
        int i2 = dVar3.p;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, null, e.f82911a, true, 92375, new Class[]{Integer.TYPE}, l.d.class)) {
            dVar2 = (l.d) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, null, e.f82911a, true, 92375, new Class[]{Integer.TYPE}, l.d.class);
        } else {
            switch (i2) {
                case 0:
                    dVar2 = l.d.CAMERA_HW_LEVEL_LEGACY;
                    break;
                case 1:
                    dVar2 = l.d.CAMERA_HW_LEVEL_LIMITED;
                    break;
                case 2:
                    dVar2 = l.d.CAMERA_HW_LEVEL_FULL;
                    break;
                case 3:
                    dVar2 = l.d.CAMERA_HW_LEVEL_LEVEL_3;
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
        lVar.h = dVar2;
        lVar.m = dVar3.q;
        lVar.p = dVar3.s;
    }

    public final void a(@Nullable g.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f4358a, false, 92302, new Class[]{g.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f4358a, false, 92302, new Class[]{g.a.class}, Void.TYPE);
            return;
        }
        synchronized (this.f4362e) {
            g.a aVar2 = this.r;
            if (aVar2 != null) {
                this.f4362e.remove(aVar2);
            }
            if (aVar != null) {
                this.f4362e.add(aVar);
            }
            this.r = aVar;
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f4358a, false, 92303, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f4358a, false, 92303, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("enable_body_beauty", z);
        this.o.a(bundle);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r21, int r22, float r23, @org.jetbrains.annotations.NotNull float[] r24) {
        /*
            r20 = this;
            r0 = r24
            r1 = 4
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
            r9 = 0
            r2[r9] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r22)
            r10 = 1
            r2[r10] = r3
            java.lang.Float r3 = java.lang.Float.valueOf(r23)
            r11 = 2
            r2[r11] = r3
            r12 = 3
            r2[r12] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f4358a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r9] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r10] = r3
            java.lang.Class r3 = java.lang.Float.TYPE
            r7[r11] = r3
            java.lang.Class<float[]> r3 = float[].class
            r7[r12] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r5 = 0
            r6 = 92308(0x16894, float:1.29351E-40)
            r3 = r20
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x007f
            java.lang.Object[] r13 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r21)
            r13[r9] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r22)
            r13[r10] = r2
            java.lang.Float r2 = java.lang.Float.valueOf(r23)
            r13[r11] = r2
            r13[r12] = r0
            com.meituan.robust.ChangeQuickRedirect r15 = f4358a
            r16 = 0
            r17 = 92308(0x16894, float:1.29351E-40)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            r0[r11] = r1
            java.lang.Class<float[]> r1 = float[].class
            r0[r12] = r1
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r14 = r20
            r18 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x007f:
            java.lang.String r1 = "points"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r1)
            r1 = r20
            com.ss.android.vesdk.k r2 = r1.o
            r3 = r0[r9]
            int r6 = (int) r3
            r0 = r0[r10]
            int r7 = (int) r0
            r3 = r21
            r4 = r22
            r5 = r23
            int r0 = r2.a((int) r3, (int) r4, (float) r5, (int) r6, (int) r7)
            if (r0 != 0) goto L_0x009b
            return r10
        L_0x009b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.av.video.b.a.b.a(int, int, float, float[]):boolean");
    }

    public final void a(@NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f4358a, false, 92323, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f4358a, false, 92323, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, "filePath");
        k kVar = this.o;
        Bundle bundle = new Bundle();
        bundle.putString("video_path", str);
        kVar.a(bundle);
        l.a aVar = new l.a(this.w);
        Bundle bundle2 = new Bundle();
        bundle2.putString("video_path", str);
        aVar.a(bundle2);
        this.w = aVar.f78029a;
    }

    public final int f() {
        if (PatchProxy.isSupport(new Object[0], this, f4358a, false, 92299, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f4358a, false, 92299, new Class[0], Integer.TYPE)).intValue();
        }
        l lVar = this.w;
        Intrinsics.checkExpressionValueIsNotNull(lVar, "cameraSettings");
        return lVar.j.ordinal();
    }

    public final boolean h() {
        if (!PatchProxy.isSupport(new Object[0], this, f4358a, false, 92307, new Class[0], Boolean.TYPE)) {
            return this.o.g();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f4358a, false, 92307, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean i() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f4358a, false, 92309, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f4358a, false, 92309, new Class[0], Boolean.TYPE)).booleanValue();
        }
        l lVar = this.w;
        Intrinsics.checkExpressionValueIsNotNull(lVar, "cameraSettings");
        if (lVar.f78027e == 480) {
            z = true;
        }
        return z;
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f4358a, false, 92321, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4358a, false, 92321, new Class[0], Void.TYPE);
            return;
        }
        j();
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f4358a, false, 92324, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4358a, false, 92324, new Class[0], Void.TYPE);
            return;
        }
        this.o.a(new l.g(1));
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f4358a, false, 92314, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4358a, false, 92314, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f4358a, false, 92312, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4358a, false, 92312, new Class[0], Void.TYPE);
        } else {
            synchronized (this.k) {
                this.n = false;
                this.l = false;
                this.m = false;
                this.o.d();
            }
        }
        this.o.e();
        this.o.a((VEListener.d) null);
        this.o.a((af.d) null);
        this.i = false;
        this.j = -1;
    }

    public final void a(@Nullable IESCameraInterface.d dVar) {
        this.f4360c = dVar;
    }

    public final void a(@Nullable f fVar) {
        this.f4363f = fVar;
    }

    public final void a(@Nullable com.ss.android.medialib.presenter.a aVar) {
        this.s = aVar;
    }

    private void b(@NotNull com.ss.android.medialib.camera.c cVar) {
        com.ss.android.medialib.camera.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f4358a, false, 92315, new Class[]{com.ss.android.medialib.camera.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f4358a, false, 92315, new Class[]{com.ss.android.medialib.camera.c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cVar2, "cameraOpenLisener");
        this.g.add(cVar2);
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f4358a, false, 92319, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f4358a, false, 92319, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.o.a(f2);
    }

    public final void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f4358a, false, 92310, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f4358a, false, 92310, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 == 0) {
            l.a aVar = new l.a(this.w);
            aVar.a(0);
            this.w = aVar.f78029a;
        } else if (i2 == 4) {
            l.a aVar2 = new l.a(this.w);
            aVar2.a(480);
            this.w = aVar2.f78029a;
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f4358a, false, 92304, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f4358a, false, 92304, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("body_beauty_level", i2);
        this.o.a(bundle);
    }

    public final void b(int i2) {
        l.c cVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f4358a, false, 92306, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f4358a, false, 92306, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        k kVar = this.o;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, null, e.f82911a, true, 92378, new Class[]{Integer.TYPE}, l.c.class)) {
            cVar = (l.c) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, null, e.f82911a, true, 92378, new Class[]{Integer.TYPE}, l.c.class);
        } else {
            switch (i2) {
                case 0:
                    cVar = l.c.CAMERA_FLASH_OFF;
                    break;
                case 1:
                    cVar = l.c.CAMERA_FLASH_ON;
                    break;
                case 2:
                    cVar = l.c.CAMERA_FLASH_TORCH;
                    break;
                case 3:
                    cVar = l.c.CAMERA_FLASH_AUTO;
                    break;
                case 4:
                    cVar = l.c.CAMERA_FLASH_RED_EYE;
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
        kVar.a(cVar);
    }

    public final void a(@NotNull Context context) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{context}, this, f4358a, false, 92311, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f4358a, false, 92311, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context, "context");
        com.ss.android.medialib.presenter.a aVar = this.s;
        if (aVar != null) {
            aVar.b(c(), d());
        }
        synchronized (this.k) {
            if (this.l) {
                if (this.m) {
                    this.o.c();
                } else {
                    this.m = true;
                    this.p.a((com.ss.android.vesdk.a.b) this.o);
                }
                z = false;
            }
            this.n = z;
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f4358a, false, 92322, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f4358a, false, 92322, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        l.a aVar = new l.a(this.w);
        aVar.a(z);
        this.w = aVar.f78029a;
    }

    public final void a(@Nullable IESCameraInterface.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f4358a, false, 92305, new Class[]{IESCameraInterface.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f4358a, false, 92305, new Class[]{IESCameraInterface.a.class}, Void.TYPE);
            return;
        }
        synchronized (this.f4361d) {
            IESCameraInterface.a aVar2 = this.q;
            if (aVar2 != null) {
                this.f4361d.remove(aVar2);
            }
            if (aVar != null) {
                this.f4361d.add(aVar);
            }
            this.q = aVar;
        }
    }

    public final void a(@NotNull com.ss.android.medialib.camera.c cVar) {
        com.ss.android.medialib.camera.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f4358a, false, 92316, new Class[]{com.ss.android.medialib.camera.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f4358a, false, 92316, new Class[]{com.ss.android.medialib.camera.c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cVar2, "cameraOpenListener");
        this.g.remove(cVar2);
    }

    public b(@NotNull Context context, @NotNull af afVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(afVar, "veRecorder");
        this.x = context;
        this.p = afVar;
    }

    public final void a(int i2, @Nullable com.ss.android.medialib.camera.c cVar) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), cVar}, this, f4358a, false, 92301, new Class[]{Integer.TYPE, com.ss.android.medialib.camera.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), cVar}, this, f4358a, false, 92301, new Class[]{Integer.TYPE, com.ss.android.medialib.camera.c.class}, Void.TYPE);
            return;
        }
        b((com.ss.android.medialib.camera.c) new a(this, cVar));
        l.a aVar = new l.a(this.w);
        aVar.a(e.a(i2));
        this.w = aVar.f78029a;
        this.o.a(this.w);
    }

    public final void b(int i2, @NotNull com.ss.android.medialib.camera.c cVar) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), cVar}, this, f4358a, false, 92313, new Class[]{Integer.TYPE, com.ss.android.medialib.camera.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), cVar}, this, f4358a, false, 92313, new Class[]{Integer.TYPE, com.ss.android.medialib.camera.c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        b((com.ss.android.medialib.camera.c) new C0875b(this, cVar));
        l lVar = this.w;
        Intrinsics.checkExpressionValueIsNotNull(lVar, "cameraSettings");
        lVar.j = e.a(i2);
        this.o.a(this.x.getApplicationContext(), this.w);
        this.o.a((VEListener.d) new c(this));
        this.o.a((af.d) new d(this));
        this.o.b();
    }
}

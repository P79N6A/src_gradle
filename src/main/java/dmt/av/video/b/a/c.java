package dmt.av.video.b.a;

import android.content.Context;
import com.ss.android.medialib.camera.IESCameraInterface;
import com.ss.android.medialib.camera.d;
import com.ss.android.medialib.camera.f;
import com.ss.android.medialib.camera.g;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.medialib.presenter.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH&J\u001a\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017H&J\b\u0010\u001e\u001a\u00020\u0015H&J\b\u0010\u001f\u001a\u00020 H&J\b\u0010!\u001a\u00020\u0015H&J\u0010\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020 H&J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&H&J\b\u0010'\u001a\u00020 H&J\u0018\u0010(\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0017H&J\u0010\u0010*\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0017H&J\u0010\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u0003H&J\u0012\u0010-\u001a\u00020\u00152\b\u0010.\u001a\u0004\u0018\u00010/H&J\u0012\u00100\u001a\u00020\u00152\b\u00101\u001a\u0004\u0018\u000102H&J\u0010\u00103\u001a\u00020\u00152\u0006\u00104\u001a\u00020 H&J(\u00105\u001a\u00020 2\u0006\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u00020:H&J\u0012\u0010;\u001a\u00020\u00152\b\u0010)\u001a\u0004\u0018\u00010<H&J\u0010\u0010=\u001a\u00020\u00152\u0006\u0010>\u001a\u00020?H&J\u0010\u0010@\u001a\u00020\u00152\u0006\u0010A\u001a\u00020\u0003H&J\u0012\u0010B\u001a\u00020\u00152\b\u0010C\u001a\u0004\u0018\u00010DH&J\u0012\u0010E\u001a\u00020\u00152\b\u0010F\u001a\u0004\u0018\u00010GH&J\b\u0010H\u001a\u00020\u0015H&J\u0010\u0010I\u001a\u00020\u00152\u0006\u0010J\u001a\u00020KH&J\u0010\u0010L\u001a\u00020\u00152\u0006\u0010M\u001a\u00020\u0011H&J\b\u0010N\u001a\u00020\u0015H&J\b\u0010O\u001a\u00020\u0015H&J\b\u0010P\u001a\u00020 H&J\u0010\u0010Q\u001a\u00020\u00152\u0006\u0010R\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006S"}, d2 = {"Ldmt/av/video/record/camera/ICameraService;", "", "cameraPosition", "", "getCameraPosition", "()I", "cameraPreviewHeight", "getCameraPreviewHeight", "cameraPreviewWH", "", "getCameraPreviewWH", "()[I", "cameraPreviewWidth", "getCameraPreviewWidth", "currentCameraType", "getCurrentCameraType", "maxZoom", "", "getMaxZoom", "()F", "addCameraStateChangeListener", "", "cameraOpenLisener", "Lcom/ss/android/medialib/camera/CameraOpenListener;", "attach", "mediaRecordPresenter", "Lcom/ss/android/medialib/presenter/MediaRecordPresenter;", "changeCamera", "cameraIndex", "cameraOpenListener", "close", "currentValid", "", "detach", "enableBodyBeauty", "enable", "init", "params", "Lcom/ss/android/medialib/camera/CameraParams;", "isTorchSupported", "open", "listener", "removeCameraStateChangeListener", "setBodyBeautyLevel", "level", "setCameraPreviewListener", "cameraPreviewListener", "Lcom/ss/android/medialib/camera/IESCameraInterface$CameraPreviewListener;", "setCameraPreviewSizeInterface", "cameraPreviewSizeInterface", "Lcom/ss/android/medialib/presenter/CameraPreviewSizeInterface;", "setEnableAntiShake", "toState", "setFocusAreas", "width", "height", "density", "points", "", "setHwSlowMotionListener", "Lcom/ss/android/medialib/camera/HwSlowMotionListener;", "setHwSlowOutputPath", "filePath", "", "setNextCameraMode", "mode", "setOnFirstFrameRefreshListener", "onFrameRefreshListener", "Lcom/ss/android/medialib/camera/IESCameraManager$OnFrameRefreshListener;", "setZoomListener", "zoomListener", "Lcom/ss/android/medialib/camera/IESCameraInterface$ZoomListener;", "startHwSlowRecord", "startPreview", "context", "Landroid/content/Context;", "startZoom", "zoom", "stopPreview", "stopZoom", "supportHwSuperSlowCamera", "switchFlashMode", "flashMode", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface c {
    float a();

    void a(float f2);

    void a(int i);

    void a(int i, @Nullable com.ss.android.medialib.camera.c cVar);

    void a(@NotNull Context context);

    void a(@Nullable IESCameraInterface.a aVar);

    void a(@Nullable IESCameraInterface.d dVar);

    void a(@NotNull d dVar);

    void a(@Nullable f fVar);

    void a(@Nullable g.a aVar);

    void a(@NotNull MediaRecordPresenter mediaRecordPresenter);

    void a(@Nullable a aVar);

    void a(@NotNull String str);

    void a(boolean z);

    boolean a(int i, int i2, float f2, @NotNull float[] fArr);

    void b(int i);

    void b(int i, @NotNull com.ss.android.medialib.camera.c cVar);

    void b(boolean z);

    @Nullable
    int[] b();

    int c();

    void c(int i);

    int d();

    int e();

    int f();

    boolean g();

    boolean h();

    boolean i();

    void j();

    void k();

    void l();
}

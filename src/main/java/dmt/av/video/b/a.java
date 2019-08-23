package dmt.av.video.b;

import android.content.Context;
import com.ss.android.medialib.c.b;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import dmt.av.video.b.a.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\u001c\u0010\u000e\u001a\u00020\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010H&J\b\u0010\u0012\u001a\u00020\u0003H&J\u0012\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0012\u0010\u0019\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u001aH&¨\u0006\u001b"}, d2 = {"Ldmt/av/video/record/IRecorder;", "", "clearEnv", "", "getCameraService", "Ldmt/av/video/record/camera/ICameraService;", "getMediaRecordPresenter", "Lcom/ss/android/medialib/presenter/MediaRecordPresenter;", "provideMusicCapacity", "Ldmt/av/video/record/MusicCapacityProvider;", "provideVideoRecordCapacity", "Ldmt/av/video/record/VideoRecordCapacityProvider;", "provideVoiceCapacity", "Ldmt/av/video/record/VoiceCapacityProvider;", "registerRunningErrorCallback", "callback", "Lkotlin/Function1;", "", "release", "setNativeInitListener", "listener", "Lcom/ss/android/medialib/listener/NativeInitListener;", "setNativeLibraryDir", "context", "Landroid/content/Context;", "setOnFrameAvailableListener", "Lcom/ss/android/medialib/presenter/MediaRecordPresenter$OnFrameAvailableListener;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface a {
    @NotNull
    z a();

    void a(@NotNull Context context);

    void a(@Nullable b bVar);

    void a(@Nullable MediaRecordPresenter.a aVar);

    void a(@NotNull Function1<? super Integer, Unit> function1);

    @NotNull
    y b();

    @NotNull
    b c();

    void d();

    void e();

    @NotNull
    MediaRecordPresenter f();

    @NotNull
    c g();
}

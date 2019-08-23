package dmt.av.video.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import com.ss.android.ugc.aweme.shortvideo.ft;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.libsdl.app.AudioRecorderInterface;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH&J<\u0010\r\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u000fH&J\b\u0010\u0010\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0013H&JH\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eH&J\"\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00152\b\u0010#\u001a\u0004\u0018\u00010$H&J\b\u0010%\u001a\u00020\u001eH&J,\u0010&\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u000fH&J\"\u0010(\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00152\b\u0010#\u001a\u0004\u0018\u00010$H&J\u0010\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020+H&J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0015H&J>\u0010.\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u0002012\b\b\u0002\u00102\u001a\u00020\u001e2\u0006\u00103\u001a\u0002042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u000fH&J\u0018\u00105\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\tH&J,\u00106\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u000fH&J8\u00107\u001a\u00020\u00152\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020+2\u0006\u0010<\u001a\u00020\u00152\u0006\u0010=\u001a\u00020\u00152\u0006\u0010>\u001a\u00020\u001eH&JL\u0010?\u001a\u00020\u00032\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020+2\u0006\u0010<\u001a\u00020\u00152\u0006\u0010=\u001a\u00020\u00152\u0006\u0010>\u001a\u00020\u001e2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u000fH&J\b\u0010@\u001a\u00020\u0003H&J\u001c\u0010A\u001a\u00020\u00032\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u000fH&J\b\u0010B\u001a\u00020\u0003H&J\u001c\u0010C\u001a\u00020\u00032\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u000fH&J*\u0010D\u001a\u00020\u00152\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\t2\b\u0010H\u001a\u0004\u0018\u00010\t2\u0006\u0010I\u001a\u00020\u0015H&¨\u0006J"}, d2 = {"Ldmt/av/video/record/VideoRecordCapacityProvider;", "", "changeSurface", "", "surface", "Landroid/view/Surface;", "concat", "Ldmt/av/video/record/RecorderConcatResult;", "videoPath", "", "audioPath", "description", "coment", "concatAsync", "callback", "Lkotlin/Function1;", "deleteLastFrag", "finish", "getEndFrameTimeUS", "", "initFaceBeautyPlay", "", "width", "height", "path", "destWidth", "destHeight", "strDetectModelsDir", "useMusic", "enableEffectAmazing", "", "initRecord", "context", "Landroid/content/Context;", "audioType", "caller", "Lorg/libsdl/app/AudioRecorderInterface;", "isStopRecording", "preStartPreviewAsync", "deviceName", "reInitRecord", "setPreviewSizeRatio", "ratio", "", "setVideoQuality", "videoQuality", "shotScreen", "strImagePath", "resolution", "", "hasEffect", "format", "Landroid/graphics/Bitmap$CompressFormat;", "startPreview", "startPreviewAsync", "startRecord", "speed", "", "isCPUEncode", "rate", "bitrateMode", "hwEncoderProfile", "isVibe", "startRecordAsync", "stopPreview", "stopPreviewAsync", "stopRecord", "stopRecordAsync", "tryRestore", "shortVideoSegments", "Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoSegments;", "videoDir", "musicPath", "trimIn", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface y {
    int a(int i, int i2, @NotNull String str, int i3, int i4, @NotNull String str2, int i5, boolean z);

    int a(@NotNull Context context, int i, @Nullable AudioRecorderInterface audioRecorderInterface);

    int a(@NotNull ft ftVar, @NotNull String str, @Nullable String str2, int i);

    void a(double d2, boolean z, float f2, int i, int i2, boolean z2, @NotNull Function1<? super Integer, Unit> function1);

    void a(float f2);

    void a(int i);

    void a(@Nullable Surface surface);

    void a(@NotNull Surface surface, @NotNull String str, @NotNull Function1<? super Integer, Unit> function1);

    void a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull Function1<? super l, Unit> function1);

    void a(@NotNull String str, @NotNull int[] iArr, boolean z, @NotNull Bitmap.CompressFormat compressFormat, @NotNull Function1<? super Integer, Unit> function1);

    void a(@NotNull Function1<? super Integer, Unit> function1);

    boolean a();

    int b(@NotNull Context context, int i, @Nullable AudioRecorderInterface audioRecorderInterface);

    long b();

    void b(@NotNull Surface surface, @NotNull String str, @NotNull Function1<? super Integer, Unit> function1);

    void b(@NotNull Function1<? super Integer, Unit> function1);

    void c();

    void d();

    void e();
}

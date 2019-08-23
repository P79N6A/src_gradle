package dmt.av.video.b;

import android.content.Context;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.shortvideo.ft;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.af;
import com.ss.android.vesdk.ak;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.libsdl.app.AudioRecorderInterface;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J(\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J<\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u0014H\u0016J\b\u0010\u0015\u001a\u00020\bH\u0016J\b\u0010\u0016\u001a\u00020\bH\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016JH\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#H\u0016J\"\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001a2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020#H\u0016J,\u0010+\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b0\u0014H\u0016J\"\u0010-\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001a2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0010\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\u001aH\u0016J<\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020\u000e2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020#2\u0006\u00108\u001a\u0002092\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b0\u0014H\u0016J\u0018\u0010:\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u000eH\u0016J,\u0010;\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b0\u0014H\u0016J8\u0010<\u001a\u00020\u001a2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020#2\u0006\u0010@\u001a\u0002002\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020\u001a2\u0006\u0010C\u001a\u00020#H\u0016JL\u0010D\u001a\u00020\b2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020#2\u0006\u0010@\u001a\u0002002\u0006\u0010A\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020\u001a2\u0006\u0010C\u001a\u00020#2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b0\u0014H\u0016J\b\u0010E\u001a\u00020\bH\u0016J\u001c\u0010F\u001a\u00020\b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b0\u0014H\u0016J\b\u0010G\u001a\u00020\bH\u0016J\u001c\u0010H\u001a\u00020\b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b0\u0014H\u0016J*\u0010I\u001a\u00020\u001a2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u000e2\b\u0010M\u001a\u0004\u0018\u00010\u000e2\u0006\u0010N\u001a\u00020\u001aH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006O"}, d2 = {"Ldmt/av/video/record/VEVideoRecordCapacityProviderImpl;", "Ldmt/av/video/record/VideoRecordCapacityProvider;", "recorder", "Lcom/ss/android/vesdk/VERecorder;", "(Lcom/ss/android/vesdk/VERecorder;)V", "getRecorder", "()Lcom/ss/android/vesdk/VERecorder;", "changeSurface", "", "surface", "Landroid/view/Surface;", "concat", "Ldmt/av/video/record/RecorderConcatResult;", "videoPath", "", "audioPath", "description", "coment", "concatAsync", "callback", "Lkotlin/Function1;", "deleteLastFrag", "finish", "getEndFrameTimeUS", "", "initFaceBeautyPlay", "", "width", "height", "path", "destWidth", "destHeight", "strDetectModelsDir", "useMusic", "enableEffectAmazing", "", "initRecord", "context", "Landroid/content/Context;", "audioType", "caller", "Lorg/libsdl/app/AudioRecorderInterface;", "isStopRecording", "preStartPreviewAsync", "deviceName", "reInitRecord", "setPreviewSizeRatio", "ratio", "", "setVideoQuality", "videoQuality", "shotScreen", "strImagePath", "resolution", "", "hasEffect", "format", "Landroid/graphics/Bitmap$CompressFormat;", "startPreview", "startPreviewAsync", "startRecord", "speed", "", "isCPUEncode", "rate", "bitrateMode", "hwEncoderProfile", "isVibe", "startRecordAsync", "stopPreview", "stopPreviewAsync", "stopRecord", "stopRecordAsync", "tryRestore", "shortVideoSegments", "Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoSegments;", "videoDir", "musicPath", "trimIn", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class u implements y {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82967a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final af f82968b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00052\u000e\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "ret", "", "reallyVideoPath", "", "kotlin.jvm.PlatformType", "reallyAudioPath", "onDone"}, k = 3, mv = {1, 1, 15})
    static final class a implements VEListener.f {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f82969a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function1 f82970b;

        a(Function1 function1) {
            this.f82970b = function1;
        }

        public final void a(int i, String str, String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3, str4}, this, f82969a, false, 92291, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str3, str4}, this, f82969a, false, 92291, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE);
                return;
            }
            Function1 function1 = this.f82970b;
            Intrinsics.checkExpressionValueIsNotNull(str3, "reallyVideoPath");
            Intrinsics.checkExpressionValueIsNotNull(str4, "reallyAudioPath");
            function1.invoke(new l(i, str3, str4));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onDone"}, k = 3, mv = {1, 1, 15})
    static final class b implements VEListener.c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f82971a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function1 f82972b;

        b(Function1 function1) {
            this.f82972b = function1;
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f82971a, false, 92292, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f82971a, false, 92292, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f82972b.invoke(Integer.valueOf(i));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onDone"}, k = 3, mv = {1, 1, 15})
    static final class c implements VEListener.c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f82973a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function1 f82974b;

        c(Function1 function1) {
            this.f82974b = function1;
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f82973a, false, 92293, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f82973a, false, 92293, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f82974b.invoke(Integer.valueOf(i));
        }
    }

    public final int a(int i, int i2, @NotNull String str, int i3, int i4, @NotNull String str2, int i5, boolean z) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str3, Integer.valueOf(i3), Integer.valueOf(i4), str4, Integer.valueOf(i5), Byte.valueOf(z ? (byte) 1 : 0)}, this, f82967a, false, 92281, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str3, Integer.valueOf(i3), Integer.valueOf(i4), str4, Integer.valueOf(i5), Byte.valueOf(z)}, this, f82967a, false, 92281, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(str3, "path");
        Intrinsics.checkParameterIsNotNull(str4, "strDetectModelsDir");
        return 0;
    }

    public final int a(@NotNull Context context, int i, @Nullable AudioRecorderInterface audioRecorderInterface) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, 5, audioRecorderInterface}, this, f82967a, false, 92286, new Class[]{Context.class, Integer.TYPE, AudioRecorderInterface.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context2, 5, audioRecorderInterface}, this, f82967a, false, 92286, new Class[]{Context.class, Integer.TYPE, AudioRecorderInterface.class}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        return 0;
    }

    public final void a(float f2) {
    }

    public final void a(int i) {
    }

    public final int b(@NotNull Context context, int i, @Nullable AudioRecorderInterface audioRecorderInterface) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, 5, audioRecorderInterface}, this, f82967a, false, 92287, new Class[]{Context.class, Integer.TYPE, AudioRecorderInterface.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context2, 5, audioRecorderInterface}, this, f82967a, false, 92287, new Class[]{Context.class, Integer.TYPE, AudioRecorderInterface.class}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        return 0;
    }

    public final void e() {
    }

    public final void a(@NotNull Function1<? super Integer, Unit> function1) {
        Function1<? super Integer, Unit> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{function12}, this, f82967a, false, 92271, new Class[]{Function1.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function12}, this, f82967a, false, 92271, new Class[]{Function1.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function12, "callback");
        this.f82968b.a((VEListener.c) new v(function12));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.NotNull java.lang.String r25, @org.jetbrains.annotations.NotNull int[] r26, boolean r27, @org.jetbrains.annotations.NotNull android.graphics.Bitmap.CompressFormat r28, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r29) {
        /*
            r24 = this;
            r1 = r25
            r0 = r26
            r6 = r28
            r2 = r29
            r3 = 5
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r4 = 0
            r7[r4] = r1
            r5 = 1
            r7[r5] = r0
            java.lang.Byte r8 = java.lang.Byte.valueOf(r27)
            r14 = 2
            r7[r14] = r8
            r15 = 3
            r7[r15] = r6
            r16 = 4
            r7[r16] = r2
            com.meituan.robust.ChangeQuickRedirect r9 = f82967a
            java.lang.Class[] r12 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r12[r4] = r8
            java.lang.Class<int[]> r8 = int[].class
            r12[r5] = r8
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r12[r14] = r8
            java.lang.Class<android.graphics.Bitmap$CompressFormat> r8 = android.graphics.Bitmap.CompressFormat.class
            r12[r15] = r8
            java.lang.Class<kotlin.jvm.functions.Function1> r8 = kotlin.jvm.functions.Function1.class
            r12[r16] = r8
            java.lang.Class r13 = java.lang.Void.TYPE
            r10 = 0
            r11 = 92275(0x16873, float:1.29305E-40)
            r8 = r24
            boolean r7 = com.meituan.robust.PatchProxy.isSupport(r7, r8, r9, r10, r11, r12, r13)
            if (r7 == 0) goto L_0x007e
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r4] = r1
            r7[r5] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r27)
            r7[r14] = r0
            r7[r15] = r6
            r7[r16] = r2
            com.meituan.robust.ChangeQuickRedirect r19 = f82967a
            r20 = 0
            r21 = 92275(0x16873, float:1.29305E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r4] = r1
            java.lang.Class<int[]> r1 = int[].class
            r0[r5] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r14] = r1
            java.lang.Class<android.graphics.Bitmap$CompressFormat> r1 = android.graphics.Bitmap.CompressFormat.class
            r0[r15] = r1
            java.lang.Class<kotlin.jvm.functions.Function1> r1 = kotlin.jvm.functions.Function1.class
            r0[r16] = r1
            java.lang.Class r23 = java.lang.Void.TYPE
            r17 = r7
            r18 = r24
            r22 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r17, r18, r19, r20, r21, r22, r23)
            return
        L_0x007e:
            java.lang.String r3 = "strImagePath"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r3)
            java.lang.String r3 = "resolution"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r3)
            java.lang.String r3 = "format"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r3)
            java.lang.String r3 = "callback"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r3)
            r8 = r24
            com.ss.android.vesdk.af r3 = r8.f82968b
            r4 = r0[r4]
            r5 = r0[r5]
            r7 = 0
            dmt.av.video.b.w r0 = new dmt.av.video.b.w
            r0.<init>(r2)
            r9 = r0
            com.ss.android.vesdk.af$b r9 = (com.ss.android.vesdk.af.b) r9
            r0 = r3
            r1 = r25
            r2 = r4
            r3 = r5
            r4 = r7
            r5 = r27
            r6 = r28
            r7 = r9
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.av.video.b.u.a(java.lang.String, int[], boolean, android.graphics.Bitmap$CompressFormat, kotlin.jvm.functions.Function1):void");
    }

    public final boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f82967a, false, 92284, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f82967a, false, 92284, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f82968b.b() == 3) {
            z = true;
        }
        return z;
    }

    public final long b() {
        if (!PatchProxy.isSupport(new Object[0], this, f82967a, false, 92289, new Class[0], Long.TYPE)) {
            return this.f82968b.d();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f82967a, false, 92289, new Class[0], Long.TYPE)).longValue();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f82967a, false, 92276, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f82967a, false, 92276, new Class[0], Void.TYPE);
            return;
        }
        this.f82968b.c();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f82967a, false, 92288, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f82967a, false, 92288, new Class[0], Void.TYPE);
            return;
        }
        if (this.f82968b.b() == 3) {
            c();
        }
        this.f82968b.e();
    }

    public u(@NotNull af afVar) {
        Intrinsics.checkParameterIsNotNull(afVar, "recorder");
        this.f82968b = afVar;
    }

    public final void a(@Nullable Surface surface) {
        Surface surface2 = surface;
        if (PatchProxy.isSupport(new Object[]{surface2}, this, f82967a, false, 92285, new Class[]{Surface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface2}, this, f82967a, false, 92285, new Class[]{Surface.class}, Void.TYPE);
            return;
        }
        this.f82968b.a(surface2);
    }

    public final void b(@NotNull Function1<? super Integer, Unit> function1) {
        Function1<? super Integer, Unit> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{function12}, this, f82967a, false, 92278, new Class[]{Function1.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function12}, this, f82967a, false, 92278, new Class[]{Function1.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function12, "callback");
        this.f82968b.b(new v(function12));
    }

    public final void b(@NotNull Surface surface, @NotNull String str, @NotNull Function1<? super Integer, Unit> function1) {
        Surface surface2 = surface;
        String str2 = str;
        Function1<? super Integer, Unit> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{surface2, str2, function12}, this, f82967a, false, 92279, new Class[]{Surface.class, String.class, Function1.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface2, str2, function12}, this, f82967a, false, 92279, new Class[]{Surface.class, String.class, Function1.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(surface2, "surface");
        Intrinsics.checkParameterIsNotNull(str2, "deviceName");
        Intrinsics.checkParameterIsNotNull(function12, "callback");
        this.f82968b.a(surface2, (VEListener.c) new b(function12));
    }

    public final void a(@NotNull Surface surface, @NotNull String str, @NotNull Function1<? super Integer, Unit> function1) {
        Surface surface2 = surface;
        String str2 = str;
        Function1<? super Integer, Unit> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{surface2, str2, function12}, this, f82967a, false, 92280, new Class[]{Surface.class, String.class, Function1.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface2, str2, function12}, this, f82967a, false, 92280, new Class[]{Surface.class, String.class, Function1.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(surface2, "surface");
        Intrinsics.checkParameterIsNotNull(str2, "deviceName");
        Intrinsics.checkParameterIsNotNull(function12, "callback");
        b(surface, str, function1);
    }

    public final int a(@NotNull ft ftVar, @NotNull String str, @Nullable String str2, int i) {
        ft ftVar2 = ftVar;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{ftVar2, str3, str4, Integer.valueOf(i)}, this, f82967a, false, 92274, new Class[]{ft.class, String.class, String.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{ftVar2, str3, str4, Integer.valueOf(i)}, this, f82967a, false, 92274, new Class[]{ft.class, String.class, String.class, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(ftVar2, "shortVideoSegments");
        Intrinsics.checkParameterIsNotNull(str3, "videoDir");
        af afVar = this.f82968b;
        Iterable<TimeSpeedModelExtension> iterable = ftVar2;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (TimeSpeedModelExtension timeSpeedModelExtension : iterable) {
            Intrinsics.checkExpressionValueIsNotNull(timeSpeedModelExtension, AdvanceSetting.NETWORK_TYPE);
            arrayList.add(new ak((long) timeSpeedModelExtension.getDuration(), timeSpeedModelExtension.getSpeed()));
        }
        return afVar.a((List) arrayList, str4, i, 2);
    }

    public final void a(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull Function1<? super l, Unit> function1) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        Function1<? super l, Unit> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{str5, str6, str7, str8, function12}, this, f82967a, false, 92273, new Class[]{String.class, String.class, String.class, String.class, Function1.class}, Void.TYPE)) {
            Object[] objArr = {str5, str6, str7, str8, function12};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f82967a, false, 92273, new Class[]{String.class, String.class, String.class, String.class, Function1.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str5, "videoPath");
        Intrinsics.checkParameterIsNotNull(str6, "audioPath");
        Intrinsics.checkParameterIsNotNull(str7, "description");
        Intrinsics.checkParameterIsNotNull(str8, "coment");
        Intrinsics.checkParameterIsNotNull(function12, "callback");
        this.f82968b.a(0, str7, str8, (VEListener.f) new a(function12));
    }

    public final void a(double d2, boolean z, float f2, int i, int i2, boolean z2, @NotNull Function1<? super Integer, Unit> function1) {
        Function1<? super Integer, Unit> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Byte.valueOf(z ? (byte) 1 : 0), Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2), (byte) 0, function12}, this, f82967a, false, 92283, new Class[]{Double.TYPE, Boolean.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Function1.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Byte.valueOf(z), Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2), (byte) 0, function12}, this, f82967a, false, 92283, new Class[]{Double.TYPE, Boolean.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Function1.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function12, "callback");
        this.f82968b.a((float) d2, (VEListener.c) new c(function12));
    }
}

package com.ss.android.ugc.aweme.shortvideo.b;

import android.view.SurfaceView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.utils.co;
import com.ss.android.ugc.aweme.utils.g;
import com.ss.android.vesdk.p;
import com.ss.android.vesdk.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ(\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J8\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J@\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0016JH\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000fH\u0016JI\u0010\u001a\u001a\u00020\u000f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c2\u0010\u0010\u001d\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u001c2\u0010\u0010\u001e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0002\u0010!Jq\u0010\"\u001a\u00020\u000f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010$2\u0010\u0010\u001d\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u001c2\u0010\u0010\u001e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u001c2\b\u0010&\u001a\u0004\u0018\u00010$2\b\u0010'\u001a\u0004\u0018\u00010$2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0002\u0010(J\u0001\u0010\"\u001a\u00020\u000f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010$2\u0010\u0010\u001d\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u001c2\u0010\u0010\u001e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u001c2\b\u0010&\u001a\u0004\u0018\u00010$2\b\u0010'\u001a\u0004\u0018\u00010$2\b\u0010)\u001a\u0004\u0018\u00010*2\u0010\u0010+\u001a\f\u0012\u0006\b\u0001\u0012\u00020,\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0002\u0010-J1\u0010.\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u00032\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00030\u001cH\u0016¢\u0006\u0002\u00102J \u00103\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016¨\u00065"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/androidq/QVEEditor;", "Lcom/ss/android/vesdk/VEEditor;", "workSpace", "", "(Ljava/lang/String;)V", "surfaceView", "Landroid/view/SurfaceView;", "(Ljava/lang/String;Landroid/view/SurfaceView;)V", "textureView", "Landroid/view/TextureView;", "(Ljava/lang/String;Landroid/view/TextureView;)V", "handler", "", "(Ljava/lang/String;Landroid/view/SurfaceView;J)V", "addAudioTrack", "", "file", "trimIn", "trimOut", "isCycle", "", "sequenceIn", "sequenceOut", "needPrepare", "cycleIn", "cycleOut", "init", "videoFilePaths", "", "transitions", "audioFilePaths", "videoOutRes", "Lcom/ss/android/vesdk/VEEditor$VIDEO_RATIO;", "([Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Lcom/ss/android/vesdk/VEEditor$VIDEO_RATIO;)I", "init2", "vTrimIn", "", "vTrimOut", "aTrimIn", "aTrimOut", "([Ljava/lang/String;[I[I[Ljava/lang/String;[Ljava/lang/String;[I[ILcom/ss/android/vesdk/VEEditor$VIDEO_RATIO;)I", "speed", "", "rotate", "Lcom/ss/android/vesdk/ROTATE_DEGREE;", "([Ljava/lang/String;[I[I[Ljava/lang/String;[Ljava/lang/String;[I[I[F[Lcom/ss/android/vesdk/ROTATE_DEGREE;Lcom/ss/android/vesdk/VEEditor$VIDEO_RATIO;)I", "initMV", "mvPath", "resourcesFilePaths", "resourcesTypes", "(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)I", "updateMVBackgroundAudioTrack", "path", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65770a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(@org.jetbrains.annotations.NotNull java.lang.String[] r30, @org.jetbrains.annotations.Nullable int[] r31, @org.jetbrains.annotations.Nullable int[] r32, @org.jetbrains.annotations.Nullable java.lang.String[] r33, @org.jetbrains.annotations.Nullable java.lang.String[] r34, @org.jetbrains.annotations.Nullable int[] r35, @org.jetbrains.annotations.Nullable int[] r36, @org.jetbrains.annotations.Nullable float[] r37, @org.jetbrains.annotations.Nullable com.ss.android.vesdk.c[] r38, @org.jetbrains.annotations.Nullable com.ss.android.vesdk.p.i r39) {
        /*
            r29 = this;
            r0 = r30
            r1 = 10
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r18 = 0
            r11[r18] = r0
            r19 = 1
            r11[r19] = r31
            r20 = 2
            r11[r20] = r32
            r21 = 3
            r11[r21] = r33
            r22 = 4
            r11[r22] = r34
            r23 = 5
            r11[r23] = r35
            r24 = 6
            r11[r24] = r36
            r25 = 7
            r11[r25] = r37
            r26 = 8
            r11[r26] = r38
            r27 = 9
            r11[r27] = r39
            com.meituan.robust.ChangeQuickRedirect r13 = f65770a
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String[]> r12 = java.lang.String[].class
            r15[r18] = r12
            java.lang.Class<int[]> r12 = int[].class
            r15[r19] = r12
            java.lang.Class<int[]> r12 = int[].class
            r15[r20] = r12
            java.lang.Class<java.lang.String[]> r12 = java.lang.String[].class
            r15[r21] = r12
            java.lang.Class<java.lang.String[]> r12 = java.lang.String[].class
            r15[r22] = r12
            java.lang.Class<int[]> r12 = int[].class
            r15[r23] = r12
            java.lang.Class<int[]> r12 = int[].class
            r15[r24] = r12
            java.lang.Class<float[]> r12 = float[].class
            r15[r25] = r12
            java.lang.Class<com.ss.android.vesdk.c[]> r12 = com.ss.android.vesdk.c[].class
            r15[r26] = r12
            java.lang.Class<com.ss.android.vesdk.p$i> r12 = com.ss.android.vesdk.p.i.class
            r15[r27] = r12
            java.lang.Class r17 = java.lang.Integer.TYPE
            r14 = 0
            r16 = 75087(0x1254f, float:1.05219E-40)
            r12 = r29
            r28 = r15
            r15 = r16
            r16 = r28
            boolean r11 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r11 == 0) goto L_0x00cf
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r18] = r0
            r11[r19] = r31
            r11[r20] = r32
            r11[r21] = r33
            r11[r22] = r34
            r11[r23] = r35
            r11[r24] = r36
            r11[r25] = r37
            r11[r26] = r38
            r11[r27] = r39
            com.meituan.robust.ChangeQuickRedirect r0 = f65770a
            r2 = 0
            r3 = 75087(0x1254f, float:1.05219E-40)
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r1[r18] = r4
            java.lang.Class<int[]> r4 = int[].class
            r1[r19] = r4
            java.lang.Class<int[]> r4 = int[].class
            r1[r20] = r4
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r1[r21] = r4
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r1[r22] = r4
            java.lang.Class<int[]> r4 = int[].class
            r1[r23] = r4
            java.lang.Class<int[]> r4 = int[].class
            r1[r24] = r4
            java.lang.Class<float[]> r4 = float[].class
            r1[r25] = r4
            java.lang.Class<com.ss.android.vesdk.c[]> r4 = com.ss.android.vesdk.c[].class
            r1[r26] = r4
            java.lang.Class<com.ss.android.vesdk.p$i> r4 = com.ss.android.vesdk.p.i.class
            r1[r27] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r30 = r11
            r31 = r29
            r32 = r0
            r33 = r2
            r34 = r3
            r35 = r1
            r36 = r4
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r30, r31, r32, r33, r34, r35, r36)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x00cf:
            java.lang.String r1 = "videoFilePaths"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.utils.co r1 = com.ss.android.ugc.aweme.utils.co.VIDEO
            java.lang.String[] r1 = com.ss.android.ugc.aweme.utils.g.a((java.lang.String[]) r0, (com.ss.android.ugc.aweme.utils.co) r1)
            r0 = r29
            r2 = r31
            r3 = r32
            r4 = r33
            r5 = r34
            r6 = r35
            r7 = r36
            r8 = r37
            r9 = r38
            r10 = r39
            int r0 = super.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.b.b.a(java.lang.String[], int[], int[], java.lang.String[], java.lang.String[], int[], int[], float[], com.ss.android.vesdk.c[], com.ss.android.vesdk.p$i):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(@org.jetbrains.annotations.NotNull java.lang.String[] r24, @org.jetbrains.annotations.Nullable java.lang.String[] r25, @org.jetbrains.annotations.Nullable java.lang.String[] r26, @org.jetbrains.annotations.Nullable com.ss.android.vesdk.p.i r27) {
        /*
            r23 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = 4
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r12 = 0
            r5[r12] = r0
            r13 = 1
            r5[r13] = r1
            r14 = 2
            r5[r14] = r2
            r15 = 3
            r5[r15] = r3
            com.meituan.robust.ChangeQuickRedirect r7 = f65770a
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class<java.lang.String[]> r6 = java.lang.String[].class
            r10[r12] = r6
            java.lang.Class<java.lang.String[]> r6 = java.lang.String[].class
            r10[r13] = r6
            java.lang.Class<java.lang.String[]> r6 = java.lang.String[].class
            r10[r14] = r6
            java.lang.Class<com.ss.android.vesdk.p$i> r6 = com.ss.android.vesdk.p.i.class
            r10[r15] = r6
            java.lang.Class r11 = java.lang.Integer.TYPE
            r8 = 0
            r9 = 75088(0x12550, float:1.0522E-40)
            r6 = r23
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x006f
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r12] = r0
            r5[r13] = r1
            r5[r14] = r2
            r5[r15] = r3
            com.meituan.robust.ChangeQuickRedirect r18 = f65770a
            r19 = 0
            r20 = 75088(0x12550, float:1.0522E-40)
            java.lang.Class[] r0 = new java.lang.Class[r4]
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r12] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r13] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r14] = r1
            java.lang.Class<com.ss.android.vesdk.p$i> r1 = com.ss.android.vesdk.p.i.class
            r0[r15] = r1
            java.lang.Class r22 = java.lang.Integer.TYPE
            r16 = r5
            r17 = r23
            r21 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x006f:
            java.lang.String r4 = "videoFilePaths"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r4)
            com.ss.android.ugc.aweme.utils.co r4 = com.ss.android.ugc.aweme.utils.co.VIDEO
            java.lang.String[] r0 = com.ss.android.ugc.aweme.utils.g.a((java.lang.String[]) r0, (com.ss.android.ugc.aweme.utils.co) r4)
            r4 = r23
            int r0 = super.a((java.lang.String[]) r0, (java.lang.String[]) r1, (java.lang.String[]) r2, (com.ss.android.vesdk.p.i) r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.b.b.a(java.lang.String[], java.lang.String[], java.lang.String[], com.ss.android.vesdk.p$i):int");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(@NotNull String str) throws r {
        super(str);
        Intrinsics.checkParameterIsNotNull(str, "workSpace");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(@NotNull String str, @NotNull SurfaceView surfaceView) {
        super(str, surfaceView);
        Intrinsics.checkParameterIsNotNull(str, "workSpace");
        Intrinsics.checkParameterIsNotNull(surfaceView, "surfaceView");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(@NotNull String str, @NotNull SurfaceView surfaceView, long j) {
        super(str, surfaceView, j);
        Intrinsics.checkParameterIsNotNull(str, "workSpace");
        Intrinsics.checkParameterIsNotNull(surfaceView, "surfaceView");
    }

    public final int a(@NotNull String str, int i, int i2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f65770a, false, 75094, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f65770a, false, 75094, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(str2, "path");
        return super.a(g.a(str2, co.AUDIO), i, i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(@org.jetbrains.annotations.NotNull java.lang.String r22, @org.jetbrains.annotations.NotNull java.lang.String[] r23, @org.jetbrains.annotations.NotNull java.lang.String[] r24) {
        /*
            r21 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f65770a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r11] = r5
            java.lang.Class<java.lang.String[]> r5 = java.lang.String[].class
            r9[r12] = r5
            java.lang.Class<java.lang.String[]> r5 = java.lang.String[].class
            r9[r13] = r5
            java.lang.Class r10 = java.lang.Integer.TYPE
            r7 = 0
            r8 = 75089(0x12551, float:1.05222E-40)
            r5 = r21
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x005e
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            r14[r12] = r1
            r14[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r16 = f65770a
            r17 = 0
            r18 = 75089(0x12551, float:1.05222E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r12] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r13] = r1
            java.lang.Class r20 = java.lang.Integer.TYPE
            r15 = r21
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x005e:
            java.lang.String r3 = "mvPath"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r3)
            java.lang.String r3 = "resourcesFilePaths"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r3)
            java.lang.String r3 = "resourcesTypes"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r3)
            com.ss.android.ugc.aweme.utils.co r3 = com.ss.android.ugc.aweme.utils.co.IMAGE
            java.lang.String[] r1 = com.ss.android.ugc.aweme.utils.g.a((java.lang.String[]) r1, (com.ss.android.ugc.aweme.utils.co) r3)
            r3 = r21
            int r0 = super.a((java.lang.String) r0, (java.lang.String[]) r1, (java.lang.String[]) r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.b.b.a(java.lang.String, java.lang.String[], java.lang.String[]):int");
    }

    public final int a(@NotNull String str, int i, int i2, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f65770a, false, 75090, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z)}, this, f65770a, false, 75090, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(str2, "file");
        return super.a(g.a(str2, co.AUDIO), i, i2, z);
    }

    public final int a(@NotNull String str, int i, int i2, int i3, int i4, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z ? (byte) 1 : 0)}, this, f65770a, false, 75091, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z)}, this, f65770a, false, 75091, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(str2, "file");
        return super.a(g.a(str2, co.AUDIO), i, i2, i3, i4, z);
    }

    public final int a(@NotNull String str, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f65770a, false, 75092, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z), Byte.valueOf(z2)}, this, f65770a, false, 75092, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(str2, "file");
        return super.a(g.a(str2, co.AUDIO), i, i2, i3, i4, z, z2);
    }
}

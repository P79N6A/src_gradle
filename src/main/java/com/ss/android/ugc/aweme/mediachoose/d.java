package com.ss.android.ugc.aweme.mediachoose;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.global.config.settings.pojo.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u000eH\u0002J¥\u0001\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001926\u0010\u001b\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00150\u001c2K\u0010 \u001aG\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\"¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00150!H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\b\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/ugc/aweme/mediachoose/LocalVideoLegalChecker;", "Lcom/ss/android/ugc/aweme/mediachoose/VideoLegalChecker;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "checkerType", "", "getCheckerType", "()Ljava/lang/String;", "enterFrom", "getEnterFrom", "setEnterFrom", "(Ljava/lang/String;)V", "isLoadingDialogEnable", "", "()Z", "setLoadingDialogEnable", "(Z)V", "videoMimeType", "is4kImportEnable", "isCanImport", "", "mediaModel", "Lcom/ss/android/ugc/aweme/music/mediachoose/helper/MediaModel;", "minDuration", "", "maxDuration", "onSuccess", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "costTime", "onError", "Lkotlin/Function3;", "", "errorCode", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d implements w {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55280a;

    /* renamed from: b  reason: collision with root package name */
    private final String f55281b = "video/mp4";

    /* renamed from: c  reason: collision with root package name */
    private boolean f55282c = true;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private String f55283d = "";

    /* renamed from: e  reason: collision with root package name */
    private final Context f55284e;

    @NotNull
    private static String a() {
        return "LocalVideoLegalChecker";
    }

    private boolean b() {
        return this.f55282c;
    }

    @NotNull
    private String c() {
        return this.f55283d;
    }

    private final boolean d() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f55280a, false, 58484, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f55280a, false, 58484, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            a b2 = g.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "SettingsReader.get()");
            Integer ax = b2.ax();
            if (ax != null) {
                if (ax.intValue() == 1) {
                    z = true;
                }
            }
        } catch (com.bytedance.ies.a unused) {
        }
        return z;
    }

    public final void a(boolean z) {
        this.f55282c = z;
    }

    public d(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f55284e = context;
    }

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f55280a, false, 58482, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f55280a, false, 58482, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.f55283d = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x018d, code lost:
        if (android.text.TextUtils.equals(r4, r5) != false) goto L_0x019a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.music.b.a.a r22, long r23, long r25, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Long, kotlin.Unit> r27, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.Long, ? super java.lang.Integer, kotlin.Unit> r28) {
        /*
            r21 = this;
            r7 = r21
            r9 = r22
            r10 = r23
            r12 = r25
            r14 = r27
            r15 = r28
            r8 = 5
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r16 = 0
            r0[r16] = r9
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r10)
            r17 = 1
            r0[r17] = r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r12)
            r18 = 2
            r0[r18] = r1
            r19 = 3
            r0[r19] = r14
            r20 = 4
            r0[r20] = r15
            com.meituan.robust.ChangeQuickRedirect r2 = f55280a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.music.b.a.a> r1 = com.ss.android.ugc.aweme.music.b.a.a.class
            r5[r16] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r5[r17] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r5[r18] = r1
            java.lang.Class<kotlin.jvm.functions.Function2> r1 = kotlin.jvm.functions.Function2.class
            r5[r19] = r1
            java.lang.Class<kotlin.jvm.functions.Function3> r1 = kotlin.jvm.functions.Function3.class
            r5[r20] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 58483(0xe473, float:8.1952E-41)
            r1 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0099
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r16] = r9
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r10)
            r0[r17] = r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r12)
            r0[r18] = r1
            r0[r19] = r14
            r0[r20] = r15
            com.meituan.robust.ChangeQuickRedirect r1 = f55280a
            r2 = 0
            r3 = 58483(0xe473, float:8.1952E-41)
            java.lang.Class[] r4 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.music.b.a.a> r5 = com.ss.android.ugc.aweme.music.b.a.a.class
            r4[r16] = r5
            java.lang.Class r5 = java.lang.Long.TYPE
            r4[r17] = r5
            java.lang.Class r5 = java.lang.Long.TYPE
            r4[r18] = r5
            java.lang.Class<kotlin.jvm.functions.Function2> r5 = kotlin.jvm.functions.Function2.class
            r4[r19] = r5
            java.lang.Class<kotlin.jvm.functions.Function3> r5 = kotlin.jvm.functions.Function3.class
            r4[r20] = r5
            java.lang.Class r5 = java.lang.Void.TYPE
            r22 = r0
            r23 = r21
            r24 = r1
            r25 = r2
            r26 = r3
            r27 = r4
            r28 = r5
            com.meituan.robust.PatchProxy.accessDispatch(r22, r23, r24, r25, r26, r27, r28)
            return
        L_0x0099:
            java.lang.String r0 = "mediaModel"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r0)
            java.lang.String r0 = "onSuccess"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r14, r0)
            java.lang.String r0 = "onError"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r15, r0)
            com.ss.android.ugc.aweme.utils.e r0 = com.ss.android.ugc.aweme.utils.e.a.a()
            java.lang.String r1 = r9.f56315e
            java.lang.String r2 = "mediaModel.filePath"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.ss.android.ugc.aweme.utils.co r2 = com.ss.android.ugc.aweme.utils.co.VIDEO
            r0.a((java.lang.String) r1, (com.ss.android.ugc.aweme.utils.co) r2)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = r9.f56315e
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0297
            java.io.File r2 = new java.io.File
            java.lang.String r3 = r9.f56315e
            r2.<init>(r3)
            boolean r2 = r2.exists()
            if (r2 != 0) goto L_0x00d5
            goto L_0x0297
        L_0x00d5:
            int r2 = r9.l
            r3 = 8
            r4 = 10
            r5 = -1
            if (r2 <= 0) goto L_0x00e5
            int r2 = r9.m
            if (r2 > 0) goto L_0x00e3
            goto L_0x00e5
        L_0x00e3:
            r2 = -1
            goto L_0x0136
        L_0x00e5:
            int[] r2 = new int[r4]
            java.lang.String r6 = r9.f56315e
            java.lang.String r8 = "mediaModel.filePath"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r8)
            int r6 = com.ss.android.ugc.aweme.tools.b.c.a(r6, r2)
            if (r6 != 0) goto L_0x00ff
            r6 = r2[r16]
            r9.l = r6
            r6 = r2[r17]
            r9.m = r6
            r2 = r2[r3]
            goto L_0x012c
        L_0x00ff:
            android.media.MediaMetadataRetriever r2 = new android.media.MediaMetadataRetriever     // Catch:{ Exception -> 0x012b }
            r2.<init>()     // Catch:{ Exception -> 0x012b }
            java.lang.String r6 = r9.f56315e     // Catch:{ Exception -> 0x012b }
            r2.setDataSource(r6)     // Catch:{ Exception -> 0x012b }
            r6 = 18
            java.lang.String r6 = r2.extractMetadata(r6)     // Catch:{ Exception -> 0x012b }
            java.lang.String r8 = "mediaMetadataRetriever.e…METADATA_KEY_VIDEO_WIDTH)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r8)     // Catch:{ Exception -> 0x012b }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ Exception -> 0x012b }
            r9.l = r6     // Catch:{ Exception -> 0x012b }
            r6 = 19
            java.lang.String r2 = r2.extractMetadata(r6)     // Catch:{ Exception -> 0x012b }
            java.lang.String r6 = "mediaMetadataRetriever.e…ETADATA_KEY_VIDEO_HEIGHT)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r6)     // Catch:{ Exception -> 0x012b }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ Exception -> 0x012b }
            r9.m = r2     // Catch:{ Exception -> 0x012b }
        L_0x012b:
            r2 = -1
        L_0x012c:
            int r6 = r9.l
            if (r6 <= 0) goto L_0x027b
            int r6 = r9.m
            if (r6 > 0) goto L_0x0136
            goto L_0x027b
        L_0x0136:
            int r6 = r9.l
            int r8 = r9.m
            int r6 = java.lang.Math.max(r6, r8)
            int r8 = r9.l
            int r3 = r9.m
            int r3 = java.lang.Math.min(r8, r3)
            r8 = 1100(0x44c, float:1.541E-42)
            if (r3 <= r8) goto L_0x0167
            if (r2 != r5) goto L_0x0167
            int[] r4 = new int[r4]
            java.lang.String r8 = r9.f56315e
            java.lang.String r5 = "mediaModel.filePath"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r8, r5)
            int r5 = com.ss.android.ugc.aweme.tools.b.c.a(r8, r4)
            if (r5 != 0) goto L_0x0167
            r2 = r4[r16]
            r9.l = r2
            r2 = r4[r17]
            r9.m = r2
            r2 = 8
            r2 = r4[r2]
        L_0x0167:
            java.lang.String r4 = r9.j
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0198
            java.lang.String r4 = r7.f55281b
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.String r5 = r9.j
            java.lang.String r8 = "mediaModel.mimeType"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r8)
            if (r5 == 0) goto L_0x0190
            java.lang.String r5 = r5.toLowerCase()
            java.lang.String r8 = "(this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r8)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 == 0) goto L_0x0198
            goto L_0x019a
        L_0x0190:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        L_0x0198:
            r17 = 0
        L_0x019a:
            if (r17 != 0) goto L_0x01b2
            java.lang.String r2 = a()
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r1 = -2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r15.invoke(r2, r0, r1)
            return
        L_0x01b2:
            long r4 = r9.h
            int r8 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r8 >= 0) goto L_0x01ce
            java.lang.String r2 = a()
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r15.invoke(r2, r0, r1)
            return
        L_0x01ce:
            r4 = -1
            int r8 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x01f0
            long r4 = r9.h
            int r8 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r8 <= 0) goto L_0x01f0
            java.lang.String r2 = a()
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r1 = -6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r15.invoke(r2, r0, r1)
            return
        L_0x01f0:
            boolean r4 = r21.d()
            r5 = -5
            if (r4 != 0) goto L_0x0210
            r4 = 1100(0x44c, float:1.541E-42)
            if (r3 <= r4) goto L_0x026a
            java.lang.String r2 = a()
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r15.invoke(r2, r0, r1)
            return
        L_0x0210:
            r4 = 1100(0x44c, float:1.541E-42)
            if (r3 <= r4) goto L_0x026a
            java.lang.String r4 = r21.c()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.String r8 = "enter_from_multi"
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r4 = android.text.TextUtils.equals(r4, r8)
            if (r4 == 0) goto L_0x0227
            r16 = -8
            goto L_0x023c
        L_0x0227:
            com.ss.android.vesdk.n$a r4 = com.ss.android.vesdk.n.a.AV_CODEC_ID_H264
            int r4 = r4.ordinal()
            if (r2 == r4) goto L_0x0232
            r16 = -7
            goto L_0x023c
        L_0x0232:
            r2 = 2160(0x870, float:3.027E-42)
            if (r3 > r2) goto L_0x023a
            r2 = 4096(0x1000, float:5.74E-42)
            if (r6 <= r2) goto L_0x023c
        L_0x023a:
            r16 = -5
        L_0x023c:
            if (r16 != 0) goto L_0x0253
            java.lang.String r2 = r9.f56315e
            java.lang.String r3 = "mediaModel.filePath"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            com.ss.android.ugc.aweme.utils.co r3 = com.ss.android.ugc.aweme.utils.co.VIDEO
            java.lang.String r2 = com.ss.android.ugc.aweme.utils.g.a((java.lang.String) r2, (com.ss.android.ugc.aweme.utils.co) r3)
            int r2 = com.ss.android.vesdk.VEUtils.isCanImport(r2)
            if (r2 == 0) goto L_0x0253
            r16 = r2
        L_0x0253:
            if (r16 == 0) goto L_0x026a
            java.lang.String r2 = a()
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            r15.invoke(r2, r0, r1)
            return
        L_0x026a:
            java.lang.String r2 = a()
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r14.invoke(r2, r0)
            return
        L_0x027b:
            com.ss.android.ugc.aweme.mediachoose.a r8 = new com.ss.android.ugc.aweme.mediachoose.a
            android.content.Context r0 = r7.f55284e
            r8.<init>(r0)
            boolean r0 = r21.b()
            r8.a((boolean) r0)
            r9 = r22
            r10 = r23
            r12 = r25
            r14 = r27
            r15 = r28
            r8.a(r9, r10, r12, r14, r15)
            return
        L_0x0297:
            java.lang.String r2 = a()
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r1 = -4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r15.invoke(r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mediachoose.d.a(com.ss.android.ugc.aweme.music.b.a.a, long, long, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3):void");
    }
}

package com.ss.android.ugc.aweme.shortvideo.edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0006H\u0004J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u000eH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/BaseVideoSizeProvider;", "Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoSizeProvider;", "editModel", "Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", "(Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;)V", "code", "", "getCode", "()I", "setCode", "(I)V", "environmentInitCode", "getEnvironmentInitCode", "needExpandCompiledSize", "", "getNeedExpandCompiledSize", "()Z", "setNeedExpandCompiledSize", "(Z)V", "ato16", "value", "getSourceVideoHeight", "getSourceVideoWidth", "logGetVideoFileInfoError", "", "path", "", "outInfo", "", "ret", "updateCompiledSize", "expand", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class a implements ce {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66928a;

    /* renamed from: b  reason: collision with root package name */
    public int f66929b = -1;

    /* renamed from: c  reason: collision with root package name */
    public boolean f66930c;

    /* renamed from: d  reason: collision with root package name */
    private final cb f66931d;

    public static int a(int i) {
        return ((i + 16) - 1) & -16;
    }

    public final int a() {
        return this.f66929b;
    }

    public final int b() {
        return this.f66931d.mVideoWidth;
    }

    public final int c() {
        return this.f66931d.mVideoHeight;
    }

    public a(@NotNull cb cbVar) {
        Intrinsics.checkParameterIsNotNull(cbVar, "editModel");
        this.f66931d = cbVar;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f66928a, false, 76179, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f66928a, false, 76179, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f66930c = z;
        this.f66931d.mVideoCanvasWidth = d();
        this.f66931d.mVideoCanvasHeight = e();
        this.f66931d.mOutVideoWidth = f();
        this.f66931d.mOutVideoHeight = g();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.NotNull java.lang.String r21, @org.jetbrains.annotations.NotNull int[] r22, int r23) {
        /*
            r20 = this;
            r0 = r21
            r1 = r22
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r23)
            r12 = 2
            r3[r12] = r4
            com.meituan.robust.ChangeQuickRedirect r5 = f66928a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class<int[]> r4 = int[].class
            r8[r11] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r12] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 76180(0x12994, float:1.06751E-40)
            r4 = r20
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x005d
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r13[r10] = r0
            r13[r11] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r23)
            r13[r12] = r0
            com.meituan.robust.ChangeQuickRedirect r15 = f66928a
            r16 = 0
            r17 = 76180(0x12994, float:1.06751E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<int[]> r1 = int[].class
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r12] = r1
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r20
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x005d:
            java.lang.String r2 = "path"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
            java.lang.String r2 = "outInfo"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r2)
            java.lang.String r2 = "type_process_init_video_to_graph"
            java.lang.String r3 = "service_process_init_video_to_graph"
            com.ss.android.ugc.aweme.app.d.c r4 = new com.ss.android.ugc.aweme.app.d.c
            r4.<init>()
            java.lang.String r5 = "path"
            com.ss.android.ugc.aweme.app.d.c r0 = r4.a((java.lang.String) r5, (java.lang.String) r0)
            java.lang.String r4 = "errorCode"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r23)
            com.ss.android.ugc.aweme.app.d.c r0 = r0.a((java.lang.String) r4, (java.lang.Integer) r5)
            java.lang.String r4 = "errorDesc"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "width = "
            r5.<init>(r6)
            r6 = r1[r10]
            r5.append(r6)
            java.lang.String r6 = " height = "
            r5.append(r6)
            r1 = r1[r11]
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            com.ss.android.ugc.aweme.app.d.c r0 = r0.a((java.lang.String) r4, (java.lang.String) r1)
            org.json.JSONObject r0 = r0.b()
            com.ss.android.ugc.aweme.base.n.b((java.lang.String) r2, (java.lang.String) r3, (org.json.JSONObject) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.a.a(java.lang.String, int[], int):void");
    }
}

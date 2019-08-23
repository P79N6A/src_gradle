package com.ss.android.ugc.aweme.shortvideo.q.b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.DigestUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.aq.a;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.property.f;
import com.ss.android.ugc.aweme.shortvideo.ff;
import com.ss.android.ugc.aweme.shortvideo.fg;
import com.ss.android.ugc.aweme.utils.bm;
import com.ss.android.ugc.aweme.utils.en;
import com.ss.android.ugc.aweme.utils.ey;
import com.ss.android.ugc.aweme.video.b;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEWatermarkParam;
import com.ss.android.vesdk.p;
import dmt.av.video.ah;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import org.json.JSONObject;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68981a;

    /* renamed from: b  reason: collision with root package name */
    public static p f68982b = null;

    /* renamed from: d  reason: collision with root package name */
    private static final String f68983d = (ff.f67717f + "share/");

    /* renamed from: e  reason: collision with root package name */
    private static final String f68984e = (f68983d + "pic/");

    /* renamed from: f  reason: collision with root package name */
    private static boolean f68985f = false;

    /* renamed from: c  reason: collision with root package name */
    public a f68986c;
    private Context g = com.ss.android.ugc.aweme.port.in.a.f61119b.getApplicationContext();
    private en h = new en();
    private String[] i;
    private String[] j;
    private String k;
    private String l;
    private String m;
    private long n;
    private final boolean o = true;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v34, resolved type: com.ss.android.ugc.aweme.shortvideo.q.b.l} */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Void, java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v10, types: [com.ss.android.vesdk.p$i, java.lang.Void] */
    /* JADX WARNING: type inference failed for: r1v41 */
    /* JADX WARNING: type inference failed for: r1v58 */
    /* JADX WARNING: type inference failed for: r1v59 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Void a(boolean r32, boolean r33) throws java.lang.Exception {
        /*
            r31 = this;
            r8 = r31
            long r1 = java.lang.System.currentTimeMillis()
            r8.n = r1
            com.ss.android.ugc.aweme.utils.en r1 = r8.h
            java.lang.String r2 = "download_time"
            java.lang.String r3 = "add_watermark"
            r1.a(r2, r3)
            com.ss.android.ugc.aweme.port.in.a.f()
            com.ss.android.ugc.aweme.shortvideo.b.b r1 = new com.ss.android.ugc.aweme.shortvideo.b.b
            com.ss.android.ugc.aweme.aq.a r2 = r8.f68986c
            java.lang.String r2 = r2.f34329a
            java.lang.String r2 = a((java.lang.String) r2)
            r1.<init>(r2)
            f68982b = r1
            r9 = 2
            r1.c((int) r9)
            com.ss.android.ugc.aweme.aq.a r1 = r8.f68986c
            com.ss.android.ugc.aweme.feed.model.Video r1 = r1.f34332d
            int r10 = r1.getWidth()
            int r11 = r1.getHeight()
            com.ss.android.vesdk.VEVideoEncodeSettings r12 = b(r10, r11)
            com.ss.android.ugc.aweme.shortvideo.q.b.j$1 r13 = new com.ss.android.ugc.aweme.shortvideo.q.b.j$1
            r13.<init>()
            com.ss.android.vesdk.VEWatermarkParam r14 = new com.ss.android.vesdk.VEWatermarkParam
            r14.<init>()
            r15 = 1
            r7 = 0
            r6 = 0
            if (r32 == 0) goto L_0x0129
            java.lang.Object[] r1 = new java.lang.Object[r6]
            com.meituan.robust.ChangeQuickRedirect r3 = f68981a
            r4 = 0
            r5 = 81149(0x13cfd, float:1.13714E-40)
            java.lang.Class[] r2 = new java.lang.Class[r6]
            java.lang.Class r16 = java.lang.Void.TYPE
            r17 = r2
            r2 = r31
            r9 = 0
            r6 = r17
            r7 = r16
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0074
            java.lang.Object[] r1 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r3 = f68981a
            r4 = 0
            r5 = 81149(0x13cfd, float:1.13714E-40)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r31
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x00f0
        L_0x0074:
            com.ss.android.ugc.aweme.aq.a r1 = r8.f68986c
            com.ss.android.ugc.aweme.feed.model.Video r1 = r1.f34332d
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r1 = r1.getPlayAddrH264()
            java.lang.String r1 = r1.getUri()
            java.lang.String r1 = com.bytedance.common.utility.DigestUtils.md5Hex((java.lang.String) r1)
            com.ss.android.ugc.aweme.aq.a r2 = r8.f68986c
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.f34331c
            if (r2 != 0) goto L_0x008d
            java.lang.String r2 = ""
            goto L_0x00ac
        L_0x008d:
            com.ss.android.ugc.aweme.aq.a r2 = r8.f68986c
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.f34331c
            java.lang.String r2 = r2.getUniqueId()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x00a4
            com.ss.android.ugc.aweme.aq.a r2 = r8.f68986c
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.f34331c
            java.lang.String r2 = r2.getShortId()
            goto L_0x00ac
        L_0x00a4:
            com.ss.android.ugc.aweme.aq.a r2 = r8.f68986c
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.f34331c
            java.lang.String r2 = r2.getUniqueId()
        L_0x00ac:
            r8.m = r2
            java.lang.String r2 = r31.c()
            java.lang.String r3 = f68984e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r5 = "_leftalign"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.ss.android.ugc.aweme.aq.a r5 = r8.f68986c
            java.lang.String r5 = r5.i
            java.lang.String[] r2 = com.ss.android.ugc.aweme.shortvideo.q.b.m.a(r2, r3, r4, r5, r15)
            r8.i = r2
            java.lang.String r2 = r31.c()
            java.lang.String r3 = f68984e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = "_rightalign"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.ss.android.ugc.aweme.aq.a r4 = r8.f68986c
            java.lang.String r4 = r4.i
            java.lang.String[] r1 = com.ss.android.ugc.aweme.shortvideo.q.b.m.a(r2, r3, r1, r4, r9)
            r8.j = r1
        L_0x00f0:
            boolean r1 = r31.d()
            if (r1 == 0) goto L_0x0127
            java.lang.String[] r1 = r8.i
            java.lang.String[] r2 = r8.j
            com.ss.android.vesdk.VEWatermarkParam r14 = r8.a((java.lang.String[]) r1, (java.lang.String[]) r2, (int) r11, (int) r10)
            if (r33 != 0) goto L_0x0127
            com.ss.android.vesdk.p r1 = f68982b
            if (r1 != 0) goto L_0x0106
            r10 = 0
            return r10
        L_0x0106:
            r10 = 0
            com.ss.android.vesdk.p r1 = f68982b
            java.lang.String[] r2 = new java.lang.String[r15]
            com.ss.android.ugc.aweme.aq.a r3 = r8.f68986c
            java.lang.String r3 = r3.f34329a
            r2[r9] = r3
            com.ss.android.vesdk.p$i r3 = com.ss.android.vesdk.p.i.VIDEO_OUT_RATIO_ORIGINAL
            int r1 = r1.a((java.lang.String[]) r2, (java.lang.String[]) r10, (java.lang.String[]) r10, (com.ss.android.vesdk.p.i) r3)
            if (r1 == 0) goto L_0x012b
            com.ss.android.vesdk.p r0 = f68982b
            if (r0 != 0) goto L_0x011e
            return r10
        L_0x011e:
            com.ss.android.vesdk.p r0 = f68982b
            r0.k()
            r8.a((int) r1)
            return r10
        L_0x0127:
            r10 = 0
            goto L_0x012b
        L_0x0129:
            r10 = r7
            r9 = 0
        L_0x012b:
            if (r33 == 0) goto L_0x03fa
            java.lang.Object[] r1 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r3 = f68981a
            r4 = 0
            r5 = 81151(0x13cff, float:1.13717E-40)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r31
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x015c
            java.lang.Object[] r1 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r3 = f68981a
            r4 = 0
            r5 = 81151(0x13cff, float:1.13717E-40)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r31
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            r2 = r8
            r1 = r10
            r28 = r12
            r26 = r13
            r29 = r14
            goto L_0x03e3
        L_0x015c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "@"
            r0.<init>(r1)
            com.ss.android.ugc.aweme.aq.a r1 = r8.f68986c
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.f34331c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x0173
            java.lang.String r0 = ""
            goto L_0x017b
        L_0x0173:
            com.ss.android.ugc.aweme.aq.a r0 = r8.f68986c
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.f34331c
            java.lang.String r0 = r0.getNickname()
        L_0x017b:
            com.ss.android.ugc.aweme.aq.a r1 = r8.f68986c
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.f34331c
            java.lang.String r1 = r1.getUniqueId()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0192
            com.ss.android.ugc.aweme.aq.a r1 = r8.f68986c
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.f34331c
            java.lang.String r1 = r1.getShortId()
            goto L_0x019a
        L_0x0192:
            com.ss.android.ugc.aweme.aq.a r1 = r8.f68986c
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.f34331c
            java.lang.String r1 = r1.getUniqueId()
        L_0x019a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = f68984e
            r2.append(r3)
            java.lang.String r3 = java.io.File.separator
            r2.append(r3)
            java.lang.String r3 = "end.png"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r8.k = r2
            com.ss.android.ugc.aweme.aq.a r2 = r8.f68986c
            com.ss.android.ugc.aweme.feed.model.Video r2 = r2.f34332d
            int r2 = r2.getWidth()
            com.ss.android.ugc.aweme.aq.a r3 = r8.f68986c
            com.ss.android.ugc.aweme.feed.model.Video r3 = r3.f34332d
            int r3 = r3.getHeight()
            com.ss.android.medialib.FFMpegManager r4 = com.ss.android.medialib.FFMpegManager.a()
            com.ss.android.ugc.aweme.aq.a r5 = r8.f68986c
            java.lang.String r5 = r5.f34329a
            int[] r4 = r4.a((java.lang.String) r5)
            r5 = r4[r9]
            r6 = 3
            if (r5 != 0) goto L_0x01da
            r5 = 2
            r2 = r4[r5]
            r3 = r4[r6]
        L_0x01da:
            com.ss.android.medialib.FFMpegManager r4 = com.ss.android.medialib.FFMpegManager.a()
            r4.b()
            com.ss.android.ugc.aweme.shortvideo.q.b.l r4 = new com.ss.android.ugc.aweme.shortvideo.q.b.l
            r4.<init>()
            android.content.Context r5 = r8.g
            android.content.Context r7 = r8.g
            r11 = 2131558820(0x7f0d01a4, float:1.8742967E38)
            java.lang.Object[] r10 = new java.lang.Object[r15]
            r10[r9] = r1
            java.lang.String r1 = r7.getString(r11, r10)
            r7 = 5
            java.lang.Object[] r10 = new java.lang.Object[r7]
            r10[r9] = r5
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            r10[r15] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            r16 = 2
            r10[r16] = r11
            r10[r6] = r0
            r11 = 4
            r10[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r21 = com.ss.android.ugc.aweme.shortvideo.q.b.l.f68995a
            r22 = 0
            r23 = 81180(0x13d1c, float:1.13757E-40)
            java.lang.Class[] r11 = new java.lang.Class[r7]
            java.lang.Class<android.content.Context> r16 = android.content.Context.class
            r11[r9] = r16
            java.lang.Class r16 = java.lang.Integer.TYPE
            r11[r15] = r16
            java.lang.Class r16 = java.lang.Integer.TYPE
            r17 = 2
            r11[r17] = r16
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r11[r6] = r16
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r17 = 4
            r11[r17] = r16
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.q.b.l> r25 = com.ss.android.ugc.aweme.shortvideo.q.b.l.class
            r19 = r10
            r20 = r4
            r24 = r11
            boolean r10 = com.meituan.robust.PatchProxy.isSupport(r19, r20, r21, r22, r23, r24, r25)
            if (r10 == 0) goto L_0x028a
            java.lang.Object[] r10 = new java.lang.Object[r7]
            r10[r9] = r5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r10[r15] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r3 = 2
            r10[r3] = r2
            r10[r6] = r0
            r0 = 4
            r10[r0] = r1
            com.meituan.robust.ChangeQuickRedirect r21 = com.ss.android.ugc.aweme.shortvideo.q.b.l.f68995a
            r22 = 0
            r23 = 81180(0x13d1c, float:1.13757E-40)
            java.lang.Class[] r0 = new java.lang.Class[r7]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r15] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r2 = 2
            r0[r2] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r6] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r2 = 4
            r0[r2] = r1
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.q.b.l> r25 = com.ss.android.ugc.aweme.shortvideo.q.b.l.class
            r19 = r10
            r20 = r4
            r24 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r19, r20, r21, r22, r23, r24, r25)
            r4 = r0
            com.ss.android.ugc.aweme.shortvideo.q.b.l r4 = (com.ss.android.ugc.aweme.shortvideo.q.b.l) r4
            r2 = r8
            r28 = r12
            r26 = r13
            r29 = r14
            r1 = 0
            goto L_0x03de
        L_0x028a:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r2, r3, r7)
            r4.f68996b = r7
            float r7 = (float) r2
            r10 = 1065353216(0x3f800000, float:1.0)
            float r11 = r7 * r10
            float r6 = (float) r3
            float r11 = r11 / r6
            r16 = 1148190720(0x44700000, float:960.0)
            r17 = 1141309440(0x44070000, float:540.0)
            int r18 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r18 >= 0) goto L_0x02aa
            float r10 = r7 / r17
            float r15 = r6 / r16
            float r10 = java.lang.Math.min(r10, r15)
            goto L_0x02b2
        L_0x02aa:
            float r10 = r7 / r16
            float r15 = r6 / r17
            float r10 = java.lang.Math.min(r10, r15)
        L_0x02b2:
            android.graphics.Canvas r15 = new android.graphics.Canvas
            r26 = r13
            android.graphics.Bitmap r13 = r4.f68996b
            r15.<init>(r13)
            r15.drawColor(r9)
            android.text.TextPaint r13 = new android.text.TextPaint
            r9 = 1
            r13.<init>(r9)
            r13.setFakeBoldText(r9)
            double r8 = (double) r11
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r18 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r18 >= 0) goto L_0x02d7
            r18 = 1108606976(0x42140000, float:37.0)
        L_0x02d0:
            float r18 = r18 * r10
            r27 = r4
            r4 = r18
            goto L_0x02da
        L_0x02d7:
            r18 = 1112014848(0x42480000, float:50.0)
            goto L_0x02d0
        L_0x02da:
            r13.setTextSize(r4)
            android.content.res.Resources r4 = r5.getResources()
            r28 = r12
            r12 = 2131624929(0x7f0e03e1, float:1.8877052E38)
            int r4 = r4.getColor(r12)
            r13.setColor(r4)
            r4 = 1061494456(0x3f451eb8, float:0.77)
            float r7 = r7 * r4
            float r4 = r13.measureText(r0)
            int r12 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r12 <= 0) goto L_0x0322
            float r7 = r4 - r7
            int r12 = r0.length()
            float r12 = (float) r12
            float r4 = r4 / r12
            float r7 = r7 / r4
            int r4 = (int) r7
            r7 = 3
            int r4 = r4 + r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            int r12 = r0.length()
            int r12 = r12 - r4
            r4 = 0
            java.lang.String r0 = r0.substring(r4, r12)
            r7.append(r0)
            java.lang.String r0 = "..."
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            goto L_0x0323
        L_0x0322:
            r4 = 0
        L_0x0323:
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            int r12 = r0.length()
            r13.getTextBounds(r0, r4, r12, r7)
            int r12 = r7.width()
            int r12 = r2 - r12
            float r12 = (float) r12
            r18 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 / r18
            int r7 = r7.height()
            r29 = r14
            android.text.TextPaint r14 = new android.text.TextPaint
            r30 = r3
            r3 = 1
            r14.<init>(r3)
            r14.setFakeBoldText(r4)
            int r3 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r3 >= 0) goto L_0x0354
            r3 = 1104150528(0x41d00000, float:26.0)
        L_0x0351:
            float r3 = r3 * r10
            goto L_0x0357
        L_0x0354:
            r3 = 1103101952(0x41c00000, float:24.0)
            goto L_0x0351
        L_0x0357:
            r14.setTextSize(r3)
            android.content.res.Resources r3 = r5.getResources()
            r4 = 2131624969(0x7f0e0409, float:1.8877133E38)
            int r3 = r3.getColor(r4)
            r14.setColor(r3)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            int r4 = r1.length()
            r8 = 0
            r14.getTextBounds(r1, r8, r4, r3)
            r4 = 1083179008(0x40900000, float:4.5)
            float r4 = r4 * r6
            r8 = 1092616192(0x41200000, float:10.0)
            float r4 = r4 / r8
            r15.drawText(r0, r12, r4, r13)
            int r0 = r3.width()
            int r0 = r2 - r0
            float r0 = (float) r0
            float r0 = r0 / r18
            float r3 = (float) r7
            float r4 = r4 + r3
            r3 = 1077936128(0x40400000, float:3.0)
            float r10 = r10 * r3
            float r4 = r4 + r10
            r15.drawText(r1, r0, r4, r14)
            android.content.res.Resources r0 = r5.getResources()
            r1 = 2130841699(0x7f021063, float:1.7288472E38)
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r1)
            int r1 = r0.getWidth()
            int r3 = r0.getHeight()
            r4 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x03b0
            int r4 = r2 * 21
        L_0x03ad:
            int r4 = r4 / 100
            goto L_0x03b3
        L_0x03b0:
            int r4 = r2 * 13
            goto L_0x03ad
        L_0x03b3:
            r5 = 1031127695(0x3d75c28f, float:0.06)
            float r6 = r6 * r5
            int r5 = (int) r6
            int r2 = r2 - r4
            float r2 = (float) r2
            float r2 = r2 / r18
            int r2 = (int) r2
            float r3 = (float) r3
            r6 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 * r6
            float r1 = (float) r1
            float r3 = r3 / r1
            float r1 = (float) r4
            float r3 = r3 * r1
            int r1 = (int) r3
            android.graphics.Rect r3 = new android.graphics.Rect
            int r5 = r30 - r5
            int r1 = r5 - r1
            int r4 = r4 + r2
            r3.<init>(r2, r1, r4, r5)
            r1 = 0
            r15.drawBitmap(r0, r1, r3, r1)
            com.ss.android.ugc.aweme.utils.w.a((android.graphics.Bitmap) r0)
            r4 = r27
            r2 = r31
        L_0x03de:
            java.lang.String r0 = r2.k
            r4.a(r0)
        L_0x03e3:
            java.lang.String r0 = r2.k
            boolean r0 = com.ss.android.ugc.aweme.utils.bm.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x03f5
            r14 = r29
            r0 = 1
            boolean r0 = r2.a((boolean) r0, (com.ss.android.vesdk.p.i) r1, (com.ss.android.vesdk.VEWatermarkParam) r14)
            if (r0 != 0) goto L_0x03f7
            return r1
        L_0x03f5:
            r14 = r29
        L_0x03f7:
            r0 = r28
            goto L_0x03ff
        L_0x03fa:
            r2 = r8
            r1 = r10
            r26 = r13
            r0 = r12
        L_0x03ff:
            r0.setWatermark(r14)
            com.ss.android.vesdk.p r3 = f68982b
            if (r3 != 0) goto L_0x0407
            return r1
        L_0x0407:
            com.ss.android.vesdk.p r3 = f68982b     // Catch:{ r -> 0x0415 }
            com.ss.android.ugc.aweme.aq.a r4 = r2.f68986c     // Catch:{ r -> 0x0415 }
            java.lang.String r4 = r4.f34330b     // Catch:{ r -> 0x0415 }
            r5 = r26
            r3.a((java.lang.String) r4, (java.lang.String) r1, (com.ss.android.vesdk.VEVideoEncodeSettings) r0, (com.ss.android.vesdk.VEListener.g) r5)     // Catch:{ r -> 0x0413 }
            goto L_0x0425
        L_0x0413:
            r0 = move-exception
            goto L_0x0418
        L_0x0415:
            r0 = move-exception
            r5 = r26
        L_0x0418:
            int r1 = r0.getRetCd()
            r3 = 0
            java.lang.String r0 = r0.getMsgDes()
            r4 = 0
            r5.a(r1, r4, r3, r0)
        L_0x0425:
            com.ss.android.ugc.aweme.utils.en r0 = r2.h
            r0.a()
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.q.b.j.a(boolean, boolean):java.lang.Void");
    }

    public final void a(int i2, int i3, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str}, this, f68981a, false, 81156, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str}, this, f68981a, false, 81156, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (this.f68986c.g != null) {
            this.f68986c.g.a();
        }
        e();
        b(i2, i3, str);
    }

    public final void a(boolean z, int i2, int i3, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3), str2}, this, f68981a, false, 81162, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), str2}, this, f68981a, false, 81162, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.n;
        File file = new File(this.f68986c.f34329a);
        long length = file.length();
        boolean equals = TextUtils.equals(ey.a(file.getPath()), "20");
        if (z) {
            n.a("save_video_success_rate", 0, new c().a("watermark_duration", Long.valueOf(currentTimeMillis)).a("download_rate", Long.valueOf(this.f68986c.m)).a("download_duration", Long.valueOf(this.f68986c.n)).a("isInstagram", Boolean.valueOf(this.f68986c.h)).a("file_size", Long.valueOf(length)).a(PushConstants.WEB_URL, this.f68986c.l).a("needWaterMark", Boolean.TRUE).a("ret", "null").a("ext", "null").a("msg", "null").a("isMp4", Boolean.valueOf(equals)).b());
        } else {
            n.a("save_video_success_rate", 2, new c().a("watermark_duration", Long.valueOf(currentTimeMillis)).a("download_rate", Long.valueOf(this.f68986c.m)).a("download_duration", Long.valueOf(this.f68986c.n)).a("isInstagram", Boolean.valueOf(this.f68986c.h)).a("file_size", Long.valueOf(length)).a(PushConstants.WEB_URL, this.f68986c.l).a("needWaterMark", Boolean.TRUE).a("ret", Integer.valueOf(i2)).a("ext", Integer.valueOf(i3)).a("msg", str2).a("isMp4", Boolean.valueOf(equals)).b());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v59, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v34, resolved type: com.ss.android.ugc.aweme.shortvideo.q.b.b} */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x07c1, code lost:
        if (r8.a(false, r34, r0) != false) goto L_0x07c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0267, code lost:
        if (d() != false) goto L_0x0269;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.aq.a r40) {
        /*
            r39 = this;
            r8 = r39
            r0 = r40
            r9 = 1
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r10 = 0
            r1[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f68981a
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.aq.a> r2 = com.ss.android.ugc.aweme.aq.a.class
            r6[r10] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 81167(0x13d0f, float:1.13739E-40)
            r2 = r39
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0038
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f68981a
            r4 = 0
            r5 = 81167(0x13d0f, float:1.13739E-40)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.aq.a> r0 = com.ss.android.ugc.aweme.aq.a.class
            r6[r10] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r39
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0038:
            r8.f68986c = r0
            com.ss.android.ugc.aweme.aq.a r0 = r8.f68986c
            java.lang.String r0 = r0.f34329a
            java.lang.String r1 = "inputPath can't be null"
            java.lang.Object[] r2 = new java.lang.Object[r10]
            com.ss.android.ugc.aweme.framework.e.f.a(r0, (java.lang.String) r1, (java.lang.Object[]) r2)
            com.ss.android.ugc.aweme.aq.a r0 = r8.f68986c
            java.lang.String r0 = r0.f34330b
            java.lang.String r1 = "outPath can't be null"
            java.lang.Object[] r2 = new java.lang.Object[r10]
            com.ss.android.ugc.aweme.framework.e.f.a(r0, (java.lang.String) r1, (java.lang.Object[]) r2)
            com.ss.android.ugc.aweme.aq.a r0 = r8.f68986c
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.f34331c
            java.lang.String r1 = "author can't be null"
            java.lang.Object[] r2 = new java.lang.Object[r10]
            com.ss.android.ugc.aweme.framework.e.f.a(r0, (java.lang.String) r1, (java.lang.Object[]) r2)
            com.ss.android.ugc.aweme.aq.a r0 = r8.f68986c
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.f34332d
            java.lang.String r1 = "video can't be null"
            java.lang.Object[] r2 = new java.lang.Object[r10]
            com.ss.android.ugc.aweme.framework.e.f.a(r0, (java.lang.String) r1, (java.lang.Object[]) r2)
            com.ss.android.ugc.aweme.aq.a r0 = r8.f68986c
            boolean r0 = r0.f34333e
            if (r0 != 0) goto L_0x0075
            com.ss.android.ugc.aweme.aq.a r0 = r8.f68986c
            boolean r0 = r0.f34334f
            if (r0 == 0) goto L_0x0073
            goto L_0x0075
        L_0x0073:
            r0 = 0
            goto L_0x0076
        L_0x0075:
            r0 = 1
        L_0x0076:
            java.lang.String r1 = "不需要添加水印为什么要调用该功能？？？"
            java.lang.Object[] r2 = new java.lang.Object[r10]
            com.ss.android.ugc.aweme.framework.e.f.a((boolean) r0, (java.lang.String) r1, (java.lang.Object[]) r2)
            java.io.File r0 = new java.io.File
            com.ss.android.ugc.aweme.aq.a r1 = r8.f68986c
            java.lang.String r1 = r1.f34330b
            r0.<init>(r1)
            java.io.File r1 = r0.getParentFile()
            boolean r2 = r1.isDirectory()
            if (r2 != 0) goto L_0x0093
            r1.mkdirs()
        L_0x0093:
            boolean r2 = r1.isDirectory()
            if (r2 != 0) goto L_0x00a2
            boolean r2 = r1.mkdirs()
            if (r2 == 0) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            r2 = 0
            goto L_0x00a3
        L_0x00a2:
            r2 = 1
        L_0x00a3:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "输出文件夹创建失败 \noutPath = "
            r3.<init>(r4)
            com.ss.android.ugc.aweme.aq.a r4 = r8.f68986c
            java.lang.String r4 = r4.f34330b
            r3.append(r4)
            java.lang.String r4 = "\noutPath isExist = "
            r3.append(r4)
            boolean r4 = r0.exists()
            r3.append(r4)
            java.lang.String r4 = "\noutPath isfile =  "
            r3.append(r4)
            boolean r0 = r0.isFile()
            r3.append(r0)
            java.lang.String r0 = "\noutDir  = "
            r3.append(r0)
            java.lang.String r0 = r1.getPath()
            r3.append(r0)
            java.lang.String r0 = "\noutDir.isDirectory() = "
            r3.append(r0)
            boolean r0 = r1.isDirectory()
            r3.append(r0)
            java.lang.String r0 = "\noutDir.mkdirs() = "
            r3.append(r0)
            boolean r0 = r1.mkdirs()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.ss.android.ugc.aweme.framework.e.f.a((boolean) r2, (java.lang.String) r0, (java.lang.Object[]) r1)
            com.ss.android.ugc.aweme.aq.a r0 = r8.f68986c
            boolean r0 = r0.k
            r11 = 2
            if (r0 == 0) goto L_0x07f3
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r3 = f68981a
            r4 = 0
            r5 = 81148(0x13cfc, float:1.13713E-40)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r39
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x0124
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r3 = f68981a
            r4 = 0
            r5 = 81148(0x13cfc, float:1.13713E-40)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r39
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0889
        L_0x0124:
            long r0 = java.lang.System.currentTimeMillis()
            r8.n = r0
            com.ss.android.ugc.aweme.aq.a r0 = r8.f68986c
            boolean r0 = r0.f34333e
            r12 = 10
            if (r0 == 0) goto L_0x0269
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r3 = f68981a
            r4 = 0
            r5 = 81150(0x13cfe, float:1.13715E-40)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r39
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x0159
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r3 = f68981a
            r4 = 0
            r5 = 81150(0x13cfe, float:1.13715E-40)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r39
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0263
        L_0x0159:
            com.ss.android.ugc.aweme.aq.a r0 = r8.f68986c
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.f34331c
            if (r0 != 0) goto L_0x0162
            java.lang.String r0 = ""
            goto L_0x0181
        L_0x0162:
            com.ss.android.ugc.aweme.aq.a r0 = r8.f68986c
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.f34331c
            java.lang.String r0 = r0.getUniqueId()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0179
            com.ss.android.ugc.aweme.aq.a r0 = r8.f68986c
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.f34331c
            java.lang.String r0 = r0.getShortId()
            goto L_0x0181
        L_0x0179:
            com.ss.android.ugc.aweme.aq.a r0 = r8.f68986c
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.f34331c
            java.lang.String r0 = r0.getUniqueId()
        L_0x0181:
            r8.m = r0
            com.ss.android.ugc.aweme.aq.a r0 = r8.f68986c
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.f34332d
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r0 = r0.getPlayAddrH264()
            java.lang.String r0 = r0.getBitRatedRatioUri()
            java.lang.String r0 = com.bytedance.common.utility.DigestUtils.md5Hex((java.lang.String) r0)
            com.ss.android.ugc.aweme.aq.a r1 = r8.f68986c
            com.ss.android.ugc.aweme.feed.model.Video r1 = r1.f34332d
            int r1 = r1.getWidth()
            com.ss.android.ugc.aweme.aq.a r2 = r8.f68986c
            com.ss.android.ugc.aweme.feed.model.Video r2 = r2.f34332d
            int r2 = r2.getHeight()
            int[] r3 = new int[r12]
            com.ss.android.ugc.aweme.aq.a r4 = r8.f68986c
            java.lang.String r4 = r4.f34329a
            int r4 = com.ss.android.ugc.aweme.tools.b.c.a(r4, r3)
            if (r4 != 0) goto L_0x01b3
            r1 = r3[r10]
            r2 = r3[r9]
        L_0x01b3:
            java.lang.String r15 = r8.m
            java.lang.String r16 = f68984e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r4 = "_leftalign"
            r3.append(r4)
            java.lang.String r17 = r3.toString()
            com.ss.android.ugc.aweme.aq.a r3 = r8.f68986c
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.f34331c
            if (r3 == 0) goto L_0x01db
            com.ss.android.ugc.aweme.aq.a r3 = r8.f68986c
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.f34331c
            boolean r3 = com.ss.android.ugc.aweme.shortvideo.q.b.i.a((com.ss.android.ugc.aweme.profile.model.User) r3)
            if (r3 == 0) goto L_0x01db
            r18 = 1
            goto L_0x01dd
        L_0x01db:
            r18 = 0
        L_0x01dd:
            com.ss.android.ugc.aweme.port.in.i r3 = com.ss.android.ugc.aweme.port.in.a.j
            int r3 = r3.c()
            if (r3 != 0) goto L_0x01ee
            com.ss.android.ugc.aweme.aq.a r3 = r8.f68986c
            boolean r3 = r3.h
            if (r3 == 0) goto L_0x01ee
            r19 = 1
            goto L_0x01f0
        L_0x01ee:
            r19 = 0
        L_0x01f0:
            r20 = 1
            com.ss.android.ugc.aweme.shortvideo.q.b.c$a r3 = new com.ss.android.ugc.aweme.shortvideo.q.b.c$a
            r3.<init>()
            com.ss.android.ugc.aweme.aq.a r4 = r8.f68986c
            java.lang.String r4 = r4.i
            com.ss.android.ugc.aweme.shortvideo.q.b.c$a r3 = r3.a(r4)
            com.ss.android.ugc.aweme.shortvideo.q.b.c r21 = r3.a()
            r13 = r1
            r14 = r2
            java.lang.String[] r3 = com.ss.android.ugc.aweme.shortvideo.q.b.d.a(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r8.i = r3
            java.lang.String r15 = r8.m
            java.lang.String r16 = f68984e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "_rightalign"
            r3.append(r0)
            java.lang.String r17 = r3.toString()
            com.ss.android.ugc.aweme.aq.a r0 = r8.f68986c
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.f34331c
            if (r0 == 0) goto L_0x0233
            com.ss.android.ugc.aweme.aq.a r0 = r8.f68986c
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.f34331c
            boolean r0 = com.ss.android.ugc.aweme.shortvideo.q.b.i.a((com.ss.android.ugc.aweme.profile.model.User) r0)
            if (r0 == 0) goto L_0x0233
            r18 = 1
            goto L_0x0235
        L_0x0233:
            r18 = 0
        L_0x0235:
            com.ss.android.ugc.aweme.port.in.i r0 = com.ss.android.ugc.aweme.port.in.a.j
            int r0 = r0.c()
            if (r0 != 0) goto L_0x0246
            com.ss.android.ugc.aweme.aq.a r0 = r8.f68986c
            boolean r0 = r0.h
            if (r0 == 0) goto L_0x0246
            r19 = 1
            goto L_0x0248
        L_0x0246:
            r19 = 0
        L_0x0248:
            r20 = 0
            com.ss.android.ugc.aweme.shortvideo.q.b.c$a r0 = new com.ss.android.ugc.aweme.shortvideo.q.b.c$a
            r0.<init>()
            com.ss.android.ugc.aweme.aq.a r3 = r8.f68986c
            java.lang.String r3 = r3.i
            com.ss.android.ugc.aweme.shortvideo.q.b.c$a r0 = r0.a(r3)
            com.ss.android.ugc.aweme.shortvideo.q.b.c r21 = r0.a()
            r13 = r1
            r14 = r2
            java.lang.String[] r0 = com.ss.android.ugc.aweme.shortvideo.q.b.d.a(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r8.j = r0
        L_0x0263:
            boolean r0 = r39.d()
            if (r0 == 0) goto L_0x07f2
        L_0x0269:
            com.ss.android.ugc.aweme.aq.a r0 = r8.f68986c
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.f34332d
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            com.ss.android.ugc.aweme.port.in.a.f()
            com.ss.android.ugc.aweme.shortvideo.b.b r2 = new com.ss.android.ugc.aweme.shortvideo.b.b
            com.ss.android.ugc.aweme.aq.a r3 = r8.f68986c
            java.lang.String r3 = r3.f34329a
            java.lang.String r3 = a((java.lang.String) r3)
            r2.<init>(r3)
            f68982b = r2
            r2.c((int) r11)
            java.lang.String[] r2 = r8.i
            java.lang.String[] r3 = r8.j
            com.ss.android.vesdk.VEWatermarkParam r13 = r8.a((java.lang.String[]) r2, (java.lang.String[]) r3, (int) r0, (int) r1)
            if (r13 == 0) goto L_0x07f2
            com.ss.android.ugc.aweme.port.in.i r2 = com.ss.android.ugc.aweme.port.in.a.j
            int r2 = r2.c()
            if (r2 != 0) goto L_0x02be
            com.ss.android.ugc.aweme.aq.a r2 = r8.f68986c
            boolean r2 = r2.h
            if (r2 == 0) goto L_0x02be
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever     // Catch:{ Exception -> 0x02b9 }
            r1.<init>()     // Catch:{ Exception -> 0x02b9 }
            com.ss.android.ugc.aweme.aq.a r2 = r8.f68986c     // Catch:{ Exception -> 0x02b9 }
            java.lang.String r2 = r2.f34329a     // Catch:{ Exception -> 0x02b9 }
            r1.setDataSource(r2)     // Catch:{ Exception -> 0x02b9 }
            r2 = 18
            java.lang.String r1 = r1.extractMetadata(r2)     // Catch:{ Exception -> 0x02b9 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x02b9 }
            goto L_0x02bb
        L_0x02b9:
            r1 = 560(0x230, float:7.85E-43)
        L_0x02bb:
            com.ss.android.vesdk.p$i r2 = com.ss.android.vesdk.p.i.VIDEO_OUT_RATIO_1_1
            goto L_0x02d1
        L_0x02be:
            com.ss.android.ugc.aweme.port.in.i r2 = com.ss.android.ugc.aweme.port.in.a.j
            int r2 = r2.c()
            if (r2 != r9) goto L_0x02cf
            com.ss.android.ugc.aweme.aq.a r2 = r8.f68986c
            boolean r2 = r2.h
            if (r2 == 0) goto L_0x02cf
            com.ss.android.vesdk.p$i r2 = com.ss.android.vesdk.p.i.VIDEO_OUT_RATIO_16_9
            goto L_0x02d1
        L_0x02cf:
            com.ss.android.vesdk.p$i r2 = com.ss.android.vesdk.p.i.VIDEO_OUT_RATIO_ORIGINAL
        L_0x02d1:
            com.ss.android.ugc.aweme.aq.a r3 = r8.f68986c
            boolean r3 = r3.j
            if (r3 == 0) goto L_0x02d9
            com.ss.android.vesdk.p$i r2 = com.ss.android.vesdk.p.i.VIDEO_OUT_RATIO_16_9
        L_0x02d9:
            r14 = r2
            com.ss.android.vesdk.p$i r2 = com.ss.android.vesdk.p.i.VIDEO_OUT_RATIO_16_9
            if (r14 != r2) goto L_0x030b
            boolean r2 = a((int) r0, (int) r1)
            if (r2 == 0) goto L_0x02f5
            com.ss.android.ugc.aweme.aq.a r2 = r8.f68986c
            boolean r2 = r2.h
            if (r2 == 0) goto L_0x02f5
            int r2 = r0 - r1
            if (r2 <= 0) goto L_0x031b
            int r3 = r13.yOffset
            int r2 = r2 / r11
            int r3 = r3 + r2
            r13.yOffset = r3
            goto L_0x031b
        L_0x02f5:
            double r2 = (double) r1
            r4 = 4610685218510194460(0x3ffc71c71c71c71c, double:1.7777777777777777)
            java.lang.Double.isNaN(r2)
            double r2 = r2 * r4
            int r2 = (int) r2
            int r0 = r2 - r0
            int r3 = r13.yOffset
            int r0 = r0 / r11
            int r3 = r3 + r0
            r13.yOffset = r3
            r0 = r2
            goto L_0x031b
        L_0x030b:
            com.ss.android.ugc.aweme.aq.a r2 = r8.f68986c
            boolean r2 = r2.h
            if (r2 == 0) goto L_0x031b
            int r2 = r0 - r1
            if (r2 <= 0) goto L_0x031b
            int r3 = r13.yOffset
            int r2 = r2 / r11
            int r3 = r3 + r2
            r13.yOffset = r3
        L_0x031b:
            com.ss.android.vesdk.VEVideoEncodeSettings r0 = b(r1, r0)
            com.ss.android.ugc.aweme.shortvideo.q.b.j$2 r15 = new com.ss.android.ugc.aweme.shortvideo.q.b.j$2
            r15.<init>()
            com.ss.android.vesdk.p r1 = f68982b
            if (r1 == 0) goto L_0x07f2
            com.ss.android.vesdk.p r1 = f68982b
            java.lang.String[] r2 = new java.lang.String[r9]
            com.ss.android.ugc.aweme.aq.a r3 = r8.f68986c
            java.lang.String r3 = r3.f34329a
            r2[r10] = r3
            r7 = 0
            int r1 = r1.a((java.lang.String[]) r2, (java.lang.String[]) r7, (java.lang.String[]) r7, (com.ss.android.vesdk.p.i) r14)
            if (r1 == 0) goto L_0x0347
            com.ss.android.vesdk.p r0 = f68982b
            if (r0 == 0) goto L_0x07f2
            com.ss.android.vesdk.p r0 = f68982b
            r0.k()
            r8.a((int) r1)
            goto L_0x0889
        L_0x0347:
            com.ss.android.vesdk.p r1 = f68982b
            if (r1 == 0) goto L_0x07f2
            com.ss.android.vesdk.p r1 = f68982b
            r6 = -1
            r1.b((int) r6)
            com.ss.android.ugc.aweme.aq.a r1 = r8.f68986c
            boolean r1 = r1.h
            if (r1 == 0) goto L_0x07a7
            com.ss.android.ugc.aweme.port.in.i r1 = com.ss.android.ugc.aweme.port.in.a.j
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x07a7
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r3 = f68981a
            r4 = 0
            r5 = 81152(0x13d00, float:1.13718E-40)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class r16 = java.lang.Void.TYPE
            r17 = r2
            r2 = r39
            r6 = r17
            r7 = r16
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0395
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r3 = f68981a
            r4 = 0
            r5 = 81152(0x13d00, float:1.13718E-40)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r39
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
        L_0x038a:
            r31 = r0
            r32 = r13
            r34 = r14
            r29 = r15
            r3 = 0
            goto L_0x07b0
        L_0x0395:
            com.ss.android.ugc.aweme.aq.a r1 = r8.f68986c
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.f34331c
            java.lang.String r1 = r1.getNickname()
            com.ss.android.ugc.aweme.aq.a r2 = r8.f68986c
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.f34331c
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r2.getAvatarMedium()
            java.net.URL r3 = new java.net.URL     // Catch:{ Exception -> 0x038a }
            java.util.List r2 = r2.getUrlList()     // Catch:{ Exception -> 0x038a }
            java.lang.Object r2 = r2.get(r10)     // Catch:{ Exception -> 0x038a }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x038a }
            r3.<init>(r2)     // Catch:{ Exception -> 0x038a }
            java.io.InputStream r2 = r3.openStream()     // Catch:{ Exception -> 0x038a }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch:{ Exception -> 0x038a }
            if (r2 == 0) goto L_0x038a
            com.ss.android.ugc.aweme.aq.a r3 = r8.f68986c
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.f34331c
            java.lang.String r3 = r3.getUniqueId()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x03d5
            com.ss.android.ugc.aweme.aq.a r3 = r8.f68986c
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.f34331c
            java.lang.String r3 = r3.getShortId()
            goto L_0x03dd
        L_0x03d5:
            com.ss.android.ugc.aweme.aq.a r3 = r8.f68986c
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.f34331c
            java.lang.String r3 = r3.getUniqueId()
        L_0x03dd:
            boolean r4 = com.ss.android.g.a.b()
            if (r4 == 0) goto L_0x03f2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "@"
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            goto L_0x0406
        L_0x03f2:
            boolean r4 = com.ss.android.g.a.c()
            if (r4 == 0) goto L_0x0406
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "TikTok ID: "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        L_0x0406:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = f68984e
            r4.append(r5)
            java.lang.String r5 = java.io.File.separator
            r4.append(r5)
            java.lang.String r5 = "end.png"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r8.k = r4
            com.ss.android.ugc.aweme.aq.a r4 = r8.f68986c
            com.ss.android.ugc.aweme.feed.model.Video r4 = r4.f34332d
            int r4 = r4.getWidth()
            com.ss.android.ugc.aweme.aq.a r5 = r8.f68986c
            com.ss.android.ugc.aweme.feed.model.Video r5 = r5.f34332d
            int r5 = r5.getHeight()
            int[] r6 = new int[r12]
            com.ss.android.ugc.aweme.aq.a r7 = r8.f68986c
            java.lang.String r7 = r7.f34329a
            int r7 = com.ss.android.ugc.aweme.tools.b.c.a(r7, r6)
            if (r7 != 0) goto L_0x0440
            r4 = r6[r10]
            r5 = r6[r9]
        L_0x0440:
            com.ss.android.ugc.aweme.shortvideo.q.b.b r6 = new com.ss.android.ugc.aweme.shortvideo.q.b.b
            r6.<init>()
            android.content.Context r7 = r8.g
            com.ss.android.ugc.aweme.aq.a r12 = r8.f68986c
            boolean r12 = r12.h
            r11 = 7
            java.lang.Object[] r9 = new java.lang.Object[r11]
            r9[r10] = r7
            java.lang.Integer r16 = java.lang.Integer.valueOf(r4)
            r17 = 1
            r9[r17] = r16
            java.lang.Integer r16 = java.lang.Integer.valueOf(r5)
            r17 = 2
            r9[r17] = r16
            r16 = 3
            r9[r16] = r1
            r17 = 4
            r9[r17] = r3
            r18 = 5
            r9[r18] = r2
            java.lang.Byte r19 = java.lang.Byte.valueOf(r12)
            r20 = 6
            r9[r20] = r19
            com.meituan.robust.ChangeQuickRedirect r24 = com.ss.android.ugc.aweme.shortvideo.q.b.b.f68958a
            r25 = 0
            r26 = 81122(0x13ce2, float:1.13676E-40)
            r29 = r15
            java.lang.Class[] r15 = new java.lang.Class[r11]
            java.lang.Class<android.content.Context> r19 = android.content.Context.class
            r15[r10] = r19
            java.lang.Class r19 = java.lang.Integer.TYPE
            r21 = 1
            r15[r21] = r19
            java.lang.Class r19 = java.lang.Integer.TYPE
            r21 = 2
            r15[r21] = r19
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r15[r16] = r19
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r15[r17] = r19
            java.lang.Class<android.graphics.Bitmap> r19 = android.graphics.Bitmap.class
            r15[r18] = r19
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r15[r20] = r19
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.q.b.b> r28 = com.ss.android.ugc.aweme.shortvideo.q.b.b.class
            r22 = r9
            r23 = r6
            r27 = r15
            boolean r9 = com.meituan.robust.PatchProxy.isSupport(r22, r23, r24, r25, r26, r27, r28)
            if (r9 == 0) goto L_0x050a
            java.lang.Object[] r9 = new java.lang.Object[r11]
            r9[r10] = r7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7 = 1
            r9[r7] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r5 = 2
            r9[r5] = r4
            r9[r16] = r1
            r9[r17] = r3
            r9[r18] = r2
            java.lang.Byte r1 = java.lang.Byte.valueOf(r12)
            r9[r20] = r1
            com.meituan.robust.ChangeQuickRedirect r24 = com.ss.android.ugc.aweme.shortvideo.q.b.b.f68958a
            r25 = 0
            r26 = 81122(0x13ce2, float:1.13676E-40)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r10] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r3 = 1
            r1[r3] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r3 = 2
            r1[r3] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r16] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r17] = r2
            java.lang.Class<android.graphics.Bitmap> r2 = android.graphics.Bitmap.class
            r1[r18] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r1[r20] = r2
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.q.b.b> r28 = com.ss.android.ugc.aweme.shortvideo.q.b.b.class
            r22 = r9
            r23 = r6
            r27 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r22, r23, r24, r25, r26, r27, r28)
            r6 = r1
            com.ss.android.ugc.aweme.shortvideo.q.b.b r6 = (com.ss.android.ugc.aweme.shortvideo.q.b.b) r6
            r31 = r0
            r32 = r13
            r34 = r14
            r3 = 0
            goto L_0x07a1
        L_0x050a:
            float r9 = (float) r4
            r11 = 1065353216(0x3f800000, float:1.0)
            float r15 = r9 * r11
            float r10 = (float) r5
            float r15 = r15 / r10
            if (r12 == 0) goto L_0x051e
            if (r5 <= r4) goto L_0x051e
            int r17 = r5 - r4
            r18 = 2
            int r17 = r17 / 2
            r30 = r17
            goto L_0x0520
        L_0x051e:
            r30 = 0
        L_0x0520:
            android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r11 = android.graphics.Bitmap.createBitmap(r4, r5, r11)
            r6.f68959b = r11
            r11 = 1136361472(0x43bb8000, float:375.0)
            float r11 = r9 / r11
            r31 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r17 = java.lang.Float.compare(r15, r0)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r32 = r13
            android.graphics.Bitmap r13 = r6.f68959b
            r0.<init>(r13)
            r13 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.drawColor(r13)
            r13 = 1047904911(0x3e75c28f, float:0.24)
            if (r17 >= 0) goto L_0x055d
            if (r12 == 0) goto L_0x0553
            r33 = r6
            r6 = r30
            float r10 = (float) r6
            float r13 = r13 * r9
            float r10 = r10 + r13
            goto L_0x056b
        L_0x0553:
            r33 = r6
            r6 = r30
            r13 = 1050924810(0x3ea3d70a, float:0.32)
            float r10 = r10 * r13
            goto L_0x056b
        L_0x055d:
            r33 = r6
            r6 = r30
            if (r17 != 0) goto L_0x0566
            float r10 = r10 * r13
            goto L_0x056b
        L_0x0566:
            r13 = 1043878380(0x3e3851ec, float:0.18)
            float r10 = r10 * r13
        L_0x056b:
            r13 = 1113587712(0x42600000, float:56.0)
            float r13 = r13 * r11
            if (r12 == 0) goto L_0x0579
            r18 = 1065353216(0x3f800000, float:1.0)
            int r15 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r15 <= 0) goto L_0x0579
            r13 = 1121976320(0x42e00000, float:112.0)
        L_0x0579:
            android.graphics.RectF r15 = new android.graphics.RectF
            float r18 = r9 - r13
            r19 = 1073741824(0x40000000, float:2.0)
            r34 = r14
            float r14 = r18 / r19
            float r18 = r9 + r13
            float r8 = r18 / r19
            r35 = r6
            float r6 = r10 + r13
            r15.<init>(r14, r10, r8, r6)
            android.graphics.Paint r8 = new android.graphics.Paint
            r14 = 1
            r8.<init>(r14)
            r36 = r5
            r5 = 0
            r8.setColor(r5)
            r8.setAntiAlias(r14)
            r8.setFilterBitmap(r14)
            r8.setDither(r14)
            r5 = -1
            r8.setColor(r5)
            int r5 = r4 / 2
            float r5 = (float) r5
            float r13 = r13 / r19
            float r10 = r10 + r13
            r18 = 1077936128(0x40400000, float:3.0)
            float r13 = r13 + r18
            r0.drawCircle(r5, r10, r13, r8)
            java.lang.Object[] r5 = new java.lang.Object[r14]
            r8 = 0
            r5[r8] = r2
            r23 = 0
            com.meituan.robust.ChangeQuickRedirect r24 = com.ss.android.ugc.aweme.shortvideo.q.b.b.f68958a
            r25 = 1
            r26 = 81123(0x13ce3, float:1.13678E-40)
            java.lang.Class[] r10 = new java.lang.Class[r14]
            java.lang.Class<android.graphics.Bitmap> r13 = android.graphics.Bitmap.class
            r10[r8] = r13
            java.lang.Class<android.graphics.Bitmap> r28 = android.graphics.Bitmap.class
            r22 = r5
            r27 = r10
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r22, r23, r24, r25, r26, r27, r28)
            if (r5 == 0) goto L_0x05fa
            r5 = 1
            java.lang.Object[] r8 = new java.lang.Object[r5]
            r10 = 0
            r8[r10] = r2
            r23 = 0
            com.meituan.robust.ChangeQuickRedirect r24 = com.ss.android.ugc.aweme.shortvideo.q.b.b.f68958a
            r25 = 1
            r26 = 81123(0x13ce3, float:1.13678E-40)
            java.lang.Class[] r2 = new java.lang.Class[r5]
            java.lang.Class<android.graphics.Bitmap> r5 = android.graphics.Bitmap.class
            r2[r10] = r5
            java.lang.Class<android.graphics.Bitmap> r28 = android.graphics.Bitmap.class
            r22 = r8
            r27 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r22, r23, r24, r25, r26, r27, r28)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            r38 = r3
        L_0x05f7:
            r3 = 0
            goto L_0x0679
        L_0x05fa:
            int r5 = r2.getWidth()
            int r8 = r2.getHeight()
            if (r5 <= r8) goto L_0x0613
            int r5 = r2.getHeight()
            int r8 = r2.getHeight()
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r5, r8, r10)
            goto L_0x0621
        L_0x0613:
            int r5 = r2.getWidth()
            int r8 = r2.getWidth()
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r5, r8, r10)
        L_0x0621:
            android.graphics.Canvas r8 = new android.graphics.Canvas
            r8.<init>(r5)
            android.graphics.Paint r10 = new android.graphics.Paint
            r10.<init>()
            android.graphics.Rect r13 = new android.graphics.Rect
            int r14 = r2.getWidth()
            r37 = r5
            int r5 = r2.getHeight()
            r38 = r3
            r3 = 0
            r13.<init>(r3, r3, r14, r5)
            int r3 = r2.getWidth()
            int r5 = r2.getHeight()
            if (r3 <= r5) goto L_0x0650
            int r3 = r2.getHeight()
            r5 = 2
            int r3 = r3 / r5
            float r3 = (float) r3
        L_0x064e:
            r5 = 1
            goto L_0x0658
        L_0x0650:
            r5 = 2
            int r3 = r2.getWidth()
            int r3 = r3 / r5
            float r3 = (float) r3
            goto L_0x064e
        L_0x0658:
            r10.setAntiAlias(r5)
            r5 = 0
            r8.drawARGB(r5, r5, r5, r5)
            r5 = -12434878(0xffffffffff424242, float:-2.5821426E38)
            r10.setColor(r5)
            r8.drawCircle(r3, r3, r3, r10)
            android.graphics.PorterDuffXfermode r3 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.SRC_IN
            r3.<init>(r5)
            r10.setXfermode(r3)
            r8.drawBitmap(r2, r13, r13, r10)
            r2 = r37
            goto L_0x05f7
        L_0x0679:
            r0.drawBitmap(r2, r3, r15, r3)
            r2 = 1101004800(0x41a00000, float:20.0)
            float r2 = r2 * r11
            float r6 = r6 + r2
            android.text.TextPaint r2 = new android.text.TextPaint
            r5 = 1
            r2.<init>(r5)
            r2.setFakeBoldText(r5)
            r5 = 1099956224(0x41900000, float:18.0)
            float r5 = r5 * r11
            r2.setTextSize(r5)
            android.content.res.Resources r5 = r7.getResources()
            r8 = 2131625849(0x7f0e0779, float:1.8878918E38)
            int r5 = r5.getColor(r8)
            r2.setColor(r5)
            r5 = 1061494456(0x3f451eb8, float:0.77)
            float r9 = r9 * r5
            float r5 = r2.measureText(r1)
            int r8 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x06d4
            float r8 = r5 - r9
            int r9 = r1.length()
            float r9 = (float) r9
            float r5 = r5 / r9
            float r8 = r8 / r5
            int r5 = (int) r8
            int r5 = r5 + 3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            int r9 = r1.length()
            int r9 = r9 - r5
            r5 = 0
            java.lang.String r1 = r1.substring(r5, r9)
            r8.append(r1)
            java.lang.String r1 = "..."
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            goto L_0x06d5
        L_0x06d4:
            r5 = 0
        L_0x06d5:
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            int r9 = r1.length()
            r2.getTextBounds(r1, r5, r9, r8)
            int r5 = r8.width()
            int r5 = r4 - r5
            float r5 = (float) r5
            float r5 = r5 / r19
            int r8 = r8.height()
            r0.drawText(r1, r5, r6, r2)
            float r1 = (float) r8
            float r6 = r6 + r1
            if (r17 >= 0) goto L_0x0701
            if (r12 == 0) goto L_0x06fb
            r1 = 1094713344(0x41400000, float:12.0)
            float r6 = r6 + r1
            goto L_0x070d
        L_0x06fb:
            r1 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 * r11
            float r6 = r6 + r1
            goto L_0x070d
        L_0x0701:
            if (r17 != 0) goto L_0x0709
            r1 = 1086324736(0x40c00000, float:6.0)
            float r1 = r1 * r11
            float r6 = r6 + r1
            goto L_0x070d
        L_0x0709:
            float r18 = r18 * r11
            float r6 = r6 + r18
        L_0x070d:
            android.text.TextPaint r1 = new android.text.TextPaint
            r2 = 1
            r1.<init>(r2)
            r2 = 0
            r1.setFakeBoldText(r2)
            r5 = 1095761920(0x41500000, float:13.0)
            float r11 = r11 * r5
            r1.setTextSize(r11)
            android.content.res.Resources r5 = r7.getResources()
            r8 = 2131624969(0x7f0e0409, float:1.8877133E38)
            int r5 = r5.getColor(r8)
            r1.setColor(r5)
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            int r8 = r38.length()
            r9 = r38
            r1.getTextBounds(r9, r2, r8, r5)
            int r2 = r5.width()
            int r2 = r4 - r2
            float r2 = (float) r2
            float r2 = r2 / r19
            r0.drawText(r9, r2, r6, r1)
            android.content.res.Resources r1 = r7.getResources()
            r2 = 2130839107(0x7f020643, float:1.7283215E38)
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeResource(r1, r2)
            int r2 = r1.getWidth()
            int r5 = r1.getHeight()
            if (r17 >= 0) goto L_0x0764
            int r6 = r4 * 94
            int r6 = r6 / 375
            int r7 = r36 * 40
            int r7 = r7 / 667
            goto L_0x0777
        L_0x0764:
            if (r17 != 0) goto L_0x076f
            int r6 = r4 * 72
            int r6 = r6 / 374
            int r7 = r36 * 16
            int r7 = r7 / 677
            goto L_0x0777
        L_0x076f:
            int r6 = r4 * 75
            int r6 = r6 / 375
            int r7 = r36 * 12
            int r7 = r7 / 667
        L_0x0777:
            if (r12 == 0) goto L_0x077b
            int r7 = r7 + r35
        L_0x077b:
            int r7 = r7 + 16
            int r4 = r4 - r6
            float r4 = (float) r4
            float r4 = r4 / r19
            int r4 = (int) r4
            float r5 = (float) r5
            r8 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 * r8
            float r2 = (float) r2
            float r5 = r5 / r2
            float r2 = (float) r6
            float r5 = r5 * r2
            int r2 = (int) r5
            android.graphics.Rect r5 = new android.graphics.Rect
            int r7 = r36 - r7
            int r2 = r7 - r2
            int r6 = r6 + r4
            r5.<init>(r4, r2, r6, r7)
            r0.drawBitmap(r1, r3, r5, r3)
            com.ss.android.ugc.aweme.utils.w.a((android.graphics.Bitmap) r1)
            r6 = r33
            r8 = r39
        L_0x07a1:
            java.lang.String r0 = r8.k
            r6.a(r0)
            goto L_0x07b0
        L_0x07a7:
            r31 = r0
            r3 = r7
            r32 = r13
            r34 = r14
            r29 = r15
        L_0x07b0:
            java.lang.String r0 = r8.k
            boolean r0 = com.ss.android.ugc.aweme.utils.bm.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x07c4
            r0 = r32
            r2 = r34
            r1 = 0
            boolean r2 = r8.a((boolean) r1, (com.ss.android.vesdk.p.i) r2, (com.ss.android.vesdk.VEWatermarkParam) r0)
            if (r2 == 0) goto L_0x07f2
            goto L_0x07c6
        L_0x07c4:
            r0 = r32
        L_0x07c6:
            r1 = r31
            r1.setWatermark(r0)
            com.ss.android.vesdk.p r0 = f68982b
            if (r0 == 0) goto L_0x07f2
            com.ss.android.vesdk.p r0 = f68982b     // Catch:{ r -> 0x07dd }
            com.ss.android.ugc.aweme.aq.a r2 = r8.f68986c     // Catch:{ r -> 0x07dd }
            java.lang.String r2 = r2.f34330b     // Catch:{ r -> 0x07dd }
            r4 = r29
            r0.a((java.lang.String) r2, (java.lang.String) r3, (com.ss.android.vesdk.VEVideoEncodeSettings) r1, (com.ss.android.vesdk.VEListener.g) r4)     // Catch:{ r -> 0x07db }
            goto L_0x07ed
        L_0x07db:
            r0 = move-exception
            goto L_0x07e0
        L_0x07dd:
            r0 = move-exception
            r4 = r29
        L_0x07e0:
            int r1 = r0.getRetCd()
            r2 = 0
            java.lang.String r0 = r0.getMsgDes()
            r9 = 0
            r4.a(r1, r9, r2, r0)
        L_0x07ed:
            com.ss.android.ugc.aweme.utils.en r0 = r8.h
            r0.a()
        L_0x07f2:
            return
        L_0x07f3:
            r9 = 0
            java.lang.Object[] r1 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r3 = f68981a
            r4 = 0
            r5 = 81145(0x13cf9, float:1.13708E-40)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r39
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x081a
            java.lang.Object[] r1 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r3 = f68981a
            r4 = 0
            r5 = 81145(0x13cf9, float:1.13708E-40)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r39
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x081a:
            com.ss.android.ugc.aweme.aq.a r0 = r8.f68986c
            boolean r0 = r0.f34333e
            com.ss.android.ugc.aweme.aq.a r1 = r8.f68986c
            boolean r9 = r1.f34334f
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r0)
            r4 = 0
            r2[r4] = r3
            java.lang.Byte r3 = java.lang.Byte.valueOf(r9)
            r5 = 1
            r2[r5] = r3
            com.meituan.robust.ChangeQuickRedirect r3 = f68981a
            r6 = 0
            r7 = 81146(0x13cfa, float:1.1371E-40)
            java.lang.Class[] r10 = new java.lang.Class[r1]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r10[r4] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r10[r5] = r1
            java.lang.Class r11 = java.lang.Void.TYPE
            r1 = r2
            r2 = r39
            r4 = r6
            r5 = r7
            r6 = r10
            r7 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0881
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r3 = 0
            r2[r3] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r9)
            r4 = 1
            r2[r4] = r0
            com.meituan.robust.ChangeQuickRedirect r0 = f68981a
            r5 = 0
            r6 = 81146(0x13cfa, float:1.1371E-40)
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r7[r3] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r7[r4] = r1
            java.lang.Class r9 = java.lang.Void.TYPE
            r1 = r2
            r2 = r39
            r3 = r0
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0881:
            com.ss.android.ugc.aweme.shortvideo.q.b.k r1 = new com.ss.android.ugc.aweme.shortvideo.q.b.k
            r1.<init>(r8, r0, r9)
            a.i.a((java.util.concurrent.Callable<TResult>) r1)
        L_0x0889:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.q.b.j.a(com.ss.android.ugc.aweme.aq.a):void");
    }

    public j() {
        b.a(f68984e, false);
    }

    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f68981a, true, 81144, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f68981a, true, 81144, new Class[0], Void.TYPE);
        } else if (f68982b != null) {
            synchronized (f68982b) {
                f68982b.k();
                f68982b = null;
            }
        }
    }

    private String c() {
        if (PatchProxy.isSupport(new Object[0], this, f68981a, false, 81154, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f68981a, false, 81154, new Class[0], String.class);
        } else if (this.f68986c.f34331c == null || !i.a(this.f68986c.f34331c)) {
            return this.g.getString(C0906R.string.anx) + this.m;
        } else {
            return this.g.getString(C0906R.string.c3y, new Object[]{this.m});
        }
    }

    private boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f68981a, false, 81155, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f68981a, false, 81155, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.i == null || this.i.length == 0) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new Exception("water png fail"));
            a(-1);
            return false;
        } else if (this.j != null && this.j.length != 0) {
            return true;
        } else {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new Exception("water png fail"));
            a(-1);
            return false;
        }
    }

    private void e() {
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[0], this, f68981a, false, 81163, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68981a, false, 81163, new Class[0], Void.TYPE);
            return;
        }
        if (this.i == null) {
            i2 = 0;
        } else {
            i2 = this.i.length;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            b.c(this.i[i4]);
        }
        if (this.j == null) {
            i3 = 0;
        } else {
            i3 = this.j.length;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            b.c(this.j[i5]);
        }
        b.c(this.k);
        b.c(this.l);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f68981a, false, 81158, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68981a, false, 81158, new Class[0], Void.TYPE);
            return;
        }
        if (this.f68986c.g != null) {
            this.f68986c.g.a(this.f68986c.f34330b);
        }
        e();
        if (PatchProxy.isSupport(new Object[0], this, f68981a, false, 81159, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68981a, false, 81159, new Class[0], Void.TYPE);
            return;
        }
        if (NetworkUtils.isNetworkAvailable(com.ss.android.ugc.aweme.port.in.a.f61119b)) {
            n.a("aweme_download_synthesis_error_rate", 0, (JSONObject) null);
            r.a("add_watermark", (Map) d.a().a("enter_from", "download_video").f34114b);
        }
    }

    private static String a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f68981a, true, 81168, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, null, f68981a, true, 81168, new Class[]{String.class}, String.class);
        }
        String md5Hex = DigestUtils.md5Hex(str);
        return fg.g + md5Hex;
    }

    private void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f68981a, false, 81157, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f68981a, false, 81157, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f68986c.g != null) {
            this.f68986c.g.a();
        }
        e();
        b(i2);
    }

    private void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f68981a, false, 81161, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f68981a, false, 81161, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.util.c.a("mTmpPath", this.f68986c.f34329a);
        if (this.i == null || this.i.length == 0) {
            com.ss.android.ugc.aweme.framework.a.a.a("mImagePaths is null");
        } else {
            for (String a2 : this.i) {
                com.ss.android.ugc.aweme.util.c.a("mImagePath", a2);
            }
        }
        com.ss.android.ugc.aweme.util.c.a("mOutPath", this.f68986c.f34330b);
        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new Exception("WaterMarkComposer ret: " + i2));
        if (NetworkUtils.isNetworkAvailable(com.ss.android.ugc.aweme.port.in.a.f61119b)) {
            n.a("aweme_download_synthesis_error_rate", 1, (JSONObject) null);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("netWorkQuality", com.facebook.d.a.b.a().b().toString());
            jSONObject.put("netWorkSpeed", (int) com.facebook.d.a.b.a().c());
            jSONObject.put("ret", i2);
            n.b("aweme_movie_synthesis_log", "video_download_compose", jSONObject);
        } catch (Exception unused) {
        }
    }

    private static VEVideoEncodeSettings b(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, null, f68981a, true, 81164, new Class[]{Integer.TYPE, Integer.TYPE}, VEVideoEncodeSettings.class)) {
            return (VEVideoEncodeSettings) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, null, f68981a, true, 81164, new Class[]{Integer.TYPE, Integer.TYPE}, VEVideoEncodeSettings.class);
        }
        VEVideoEncodeSettings.a aVar = new VEVideoEncodeSettings.a(3);
        aVar.f(dmt.av.video.a.a(f.o())).a(i2, i3);
        if (f.b()) {
            aVar.b(true).a(VEVideoEncodeSettings.c.ENCODE_BITRATE_ABR, dmt.av.video.a.a(f.f()));
        } else {
            aVar.b(false).a(VEVideoEncodeSettings.c.ENCODE_BITRATE_CRF, dmt.av.video.a.b(f.l()));
        }
        VEVideoEncodeSettings.d c2 = dmt.av.video.a.c(f.n());
        if (c2 != null) {
            aVar.a(c2);
        }
        aVar.a(dmt.av.video.a.a(f.m()));
        aVar.a(false);
        aVar.e(1);
        return aVar.a();
    }

    public static boolean a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, null, f68981a, true, 81166, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, null, f68981a, true, 81166, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        double d2 = (double) i2;
        double d3 = (double) i3;
        Double.isNaN(d3);
        Double.isNaN(d2);
        if (Math.abs((d2 / (d3 * 1.0d)) - 1.7777777777777777d) < 0.001d) {
            return true;
        }
        return false;
    }

    private void b(int i2, int i3, String str) {
        int i4 = i2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str2}, this, f68981a, false, 81160, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str2}, this, f68981a, false, 81160, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
        } else if (!f68985f) {
            f68985f = true;
            com.ss.android.ugc.aweme.util.c.a("mTmpPath", this.f68986c.f34329a);
            if (this.i == null || this.i.length == 0) {
                com.ss.android.ugc.aweme.framework.a.a.a("mImagePaths is null");
            } else {
                for (String a2 : this.i) {
                    com.ss.android.ugc.aweme.util.c.a("mImagePath", a2);
                }
            }
            com.ss.android.ugc.aweme.util.c.a("mOutPath", this.f68986c.f34330b);
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new Exception("WaterMarkComposer ret: " + i2));
            if (NetworkUtils.isNetworkAvailable(com.ss.android.ugc.aweme.port.in.a.f61119b)) {
                n.a("aweme_download_synthesis_error_rate", 1, (JSONObject) null);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("netWorkQuality", com.facebook.d.a.b.a().b().toString());
                jSONObject.put("netWorkSpeed", (int) com.facebook.d.a.b.a().c());
                jSONObject.put("ret", i2);
                jSONObject.put("ext", i3);
                jSONObject.put("msg", str2);
                n.b("aweme_movie_synthesis_log", "video_download_compose", jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    private boolean a(boolean z, p.i iVar, VEWatermarkParam vEWatermarkParam) {
        p.i iVar2;
        VEWatermarkParam vEWatermarkParam2 = vEWatermarkParam;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), iVar, vEWatermarkParam2}, this, f68981a, false, 81147, new Class[]{Boolean.TYPE, p.i.class, VEWatermarkParam.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), iVar, vEWatermarkParam2}, this, f68981a, false, 81147, new Class[]{Boolean.TYPE, p.i.class, VEWatermarkParam.class}, Boolean.TYPE)).booleanValue();
        }
        if (iVar == null) {
            iVar2 = p.i.VIDEO_OUT_RATIO_ORIGINAL;
        } else {
            iVar2 = iVar;
        }
        try {
            int[] a2 = ah.a(this.f68986c.f34329a);
            if (a2 != null) {
                if (f68982b != null) {
                    int a3 = f68982b.a(new String[]{this.f68986c.f34329a, this.k}, new int[]{0, a2[3]}, new int[]{a2[3], a2[3] + PushConstants.WORK_RECEIVER_EVENTCORE_ERROR}, new String[]{"black"}, null, null, null, null, null, iVar2);
                    if (a3 == 0) {
                        if (z) {
                            if (PatchProxy.isSupport(new Object[0], this, f68981a, false, 81153, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f68981a, false, 81153, new Class[0], Void.TYPE);
                            } else {
                                this.l = this.g.getCacheDir() + File.separator + "watermark.mp3";
                                b.a(this.l, true);
                                try {
                                    bm.a(this.g.getAssets().open("watermark_audio.mp3"), (OutputStream) new FileOutputStream(this.l));
                                } catch (IOException unused) {
                                }
                            }
                            if (bm.a(this.l) && f68982b != null) {
                                f68982b.a(this.l, 0, (int) PushConstants.WORK_RECEIVER_EVENTCORE_ERROR, a2[3], a2[3] + PushConstants.WORK_RECEIVER_EVENTCORE_ERROR, false);
                            }
                        }
                        vEWatermarkParam2.duration = (long) a2[3];
                        if (f68982b == null) {
                            return false;
                        }
                        f68982b.a(false);
                        return true;
                    } else if (f68982b == null) {
                        return false;
                    } else {
                        f68982b.k();
                        a(a3);
                        return false;
                    }
                }
            }
            return false;
        } catch (com.ss.android.vesdk.r unused2) {
            if (f68982b == null) {
                return false;
            }
            f68982b.k();
            a(0);
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.ss.android.vesdk.VEWatermarkParam a(java.lang.String[] r24, java.lang.String[] r25, int r26, int r27) {
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
            java.lang.Integer r6 = java.lang.Integer.valueOf(r26)
            r14 = 2
            r5[r14] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r27)
            r15 = 3
            r5[r15] = r6
            com.meituan.robust.ChangeQuickRedirect r7 = f68981a
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class<java.lang.String[]> r6 = java.lang.String[].class
            r10[r12] = r6
            java.lang.Class<java.lang.String[]> r6 = java.lang.String[].class
            r10[r13] = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            r10[r14] = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            r10[r15] = r6
            java.lang.Class<com.ss.android.vesdk.VEWatermarkParam> r11 = com.ss.android.vesdk.VEWatermarkParam.class
            r8 = 0
            r9 = 81165(0x13d0d, float:1.13736E-40)
            r6 = r23
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x007b
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r12] = r0
            r5[r13] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r26)
            r5[r14] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r27)
            r5[r15] = r0
            com.meituan.robust.ChangeQuickRedirect r18 = f68981a
            r19 = 0
            r20 = 81165(0x13d0d, float:1.13736E-40)
            java.lang.Class[] r0 = new java.lang.Class[r4]
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r12] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r14] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r15] = r1
            java.lang.Class<com.ss.android.vesdk.VEWatermarkParam> r22 = com.ss.android.vesdk.VEWatermarkParam.class
            r16 = r5
            r17 = r23
            r21 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            com.ss.android.vesdk.VEWatermarkParam r0 = (com.ss.android.vesdk.VEWatermarkParam) r0
            return r0
        L_0x007b:
            if (r0 == 0) goto L_0x0115
            int r4 = r0.length
            if (r4 != 0) goto L_0x0082
            goto L_0x0115
        L_0x0082:
            com.ss.android.vesdk.VEWatermarkParam r4 = new com.ss.android.vesdk.VEWatermarkParam
            r4.<init>()
            r4.needExtFile = r12
            r4.images = r0
            r4.secondHalfImages = r1
            r4.interval = r14
            r0 = r0[r12]
            int[] r0 = com.ss.android.ugc.aweme.photo.o.a(r0)
            r1 = r0[r12]
            r0 = r0[r13]
            if (r3 >= r2) goto L_0x009f
            r5 = 1035081283(0x3db21643, float:0.08695652)
            goto L_0x00a2
        L_0x009f:
            r5 = 1040604925(0x3e065efd, float:0.13122173)
        L_0x00a2:
            float r6 = (float) r2
            float r6 = r6 * r5
            r5 = 1114112000(0x42680000, float:58.0)
            float r5 = java.lang.Math.max(r6, r5)
            float r1 = (float) r1
            float r1 = r1 * r5
            float r0 = (float) r0
            float r1 = r1 / r0
            int r0 = (int) r1
            r4.width = r0
            int r0 = (int) r5
            r4.height = r0
            float r0 = (float) r3
            r1 = 1144258560(0x44340000, float:720.0)
            float r0 = r0 / r1
            r1 = 1098907648(0x41800000, float:16.0)
            float r1 = r1 * r0
            int r1 = (int) r1
            r5 = 1101004800(0x41a00000, float:20.0)
            float r0 = r0 * r5
            int r0 = (int) r0
            r4.xOffset = r1
            r4.yOffset = r0
            com.ss.android.vesdk.an r0 = com.ss.android.vesdk.an.TL_BR
            r4.position = r0
            com.ss.android.ugc.aweme.property.e r0 = com.ss.android.ugc.aweme.port.in.a.L
            com.ss.android.ugc.aweme.property.e$a r1 = com.ss.android.ugc.aweme.property.e.a.EnableWaterBgMask
            boolean r0 = r0.a((com.ss.android.ugc.aweme.property.e.a) r1)
            if (r0 == 0) goto L_0x0112
            r0 = r23
            com.ss.android.ugc.aweme.aq.a r1 = r0.f68986c
            boolean r1 = r1.h
            if (r1 != 0) goto L_0x0114
            com.ss.android.vesdk.VEWatermarkParam$VEWatermarkMask r1 = new com.ss.android.vesdk.VEWatermarkParam$VEWatermarkMask
            r1.<init>()
            boolean r5 = a((int) r26, (int) r27)
            r5 = r5 ^ r13
            java.lang.String r5 = com.ss.android.ugc.aweme.shortvideo.r.a.a(r5)
            r1.maskImage = r5
            r1.xOffset = r12
            r1.yOffset = r12
            r1.width = r3
            r1.height = r2
            boolean r5 = a((int) r26, (int) r27)
            if (r5 == 0) goto L_0x010f
            double r5 = (double) r3
            r7 = 4610685218510194460(0x3ffc71c71c71c71c, double:1.7777777777777777)
            java.lang.Double.isNaN(r5)
            double r5 = r5 * r7
            int r3 = (int) r5
            int r3 = r3 - r2
            int r2 = r1.yOffset
            int r3 = r3 / r14
            int r2 = r2 + r3
            r1.yOffset = r2
        L_0x010f:
            r4.mask = r1
            goto L_0x0114
        L_0x0112:
            r0 = r23
        L_0x0114:
            return r4
        L_0x0115:
            r0 = r23
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.q.b.j.a(java.lang.String[], java.lang.String[], int, int):com.ss.android.vesdk.VEWatermarkParam");
    }
}

package com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74335a;
    public int A = 10;
    public int B;
    public TextPaint C = new TextPaint();
    public Paint D = new Paint();
    public Path E;
    public o F;
    public float G;
    public float H;
    public boolean I = false;
    public float J;
    public Paint K;
    public List<PointF> L = new ArrayList();
    private Paint M = new Paint();

    /* renamed from: b  reason: collision with root package name */
    public RectF f74336b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    public RectF f74337c = new RectF();

    /* renamed from: d  reason: collision with root package name */
    public Rect f74338d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public RectF f74339e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    public RectF f74340f = new RectF();
    public RectF g = new RectF();
    public RectF h = new RectF();
    public RectF i = new RectF();
    public RectF j = new RectF();
    public RectF k = new RectF();
    public RectF l = new RectF();
    public Bitmap m;
    public Bitmap n;
    public Bitmap o;
    public Bitmap p;
    public Paint q;
    public int r = 0;
    public String[] s;
    public float t = 60.0f;
    public int u = 20;
    public int v = 20;
    public int w;
    public int x;
    public int y = 20;
    public int z = 30;

    public a() {
        this.M.setColor(com.ss.android.ugc.aweme.base.utils.o.a(C0906R.color.yq));
        this.M.setAlpha(76);
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(float r27, float r28, float r29, int r30) {
        /*
            r26 = this;
            r7 = r26
            r9 = r30
            r10 = 4
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Float r1 = java.lang.Float.valueOf(r27)
            r11 = 0
            r0[r11] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r28)
            r12 = 1
            r0[r12] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r29)
            r13 = 2
            r0[r13] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r30)
            r14 = 3
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f74335a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 86481(0x151d1, float:1.21186E-40)
            r1 = r26
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x007f
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Float r1 = java.lang.Float.valueOf(r27)
            r0[r11] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r28)
            r0[r12] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r29)
            r0[r13] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r30)
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f74335a
            r3 = 0
            r4 = 86481(0x151d1, float:1.21186E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r26
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x007f:
            java.lang.String[] r0 = r7.s
            if (r0 == 0) goto L_0x03e9
            java.lang.String[] r0 = r7.s
            int r0 = r0.length
            if (r0 != 0) goto L_0x008a
            goto L_0x03e9
        L_0x008a:
            android.text.TextPaint r0 = r7.C
            android.graphics.Paint$FontMetrics r0 = r0.getFontMetrics()
            float r1 = r0.ascent
            float r2 = r0.descent
            java.lang.String[] r3 = r7.s
            int r3 = r3.length
            int r4 = r3 + -1
            float r5 = (float) r4
            float r6 = r0.descent
            float r0 = r0.ascent
            float r6 = r6 - r0
            float r5 = r5 * r6
            android.graphics.PointF[][] r0 = new android.graphics.PointF[r3][]
            float r2 = r2 - r1
            int r1 = (int) r2
            int r2 = r7.w
            float r2 = (float) r2
            float r2 = r2 * r29
            int r2 = (int) r2
            r7.u = r2
            int r2 = r7.x
            float r2 = (float) r2
            float r2 = r2 * r29
            int r2 = (int) r2
            r7.v = r2
            int r2 = r7.v
            int r6 = r7.x
            if (r2 < r6) goto L_0x00bf
            int r2 = r7.x
            r7.v = r2
        L_0x00bf:
            int r2 = r7.u
            int r6 = r7.w
            if (r2 < r6) goto L_0x00c9
            int r2 = r7.w
            r7.u = r2
        L_0x00c9:
            r2 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r2
            float r2 = r28 - r5
            int r2 = (int) r2
            float r5 = r7.t
            float r5 = r5 * r29
            r6 = 1082130432(0x40800000, float:4.0)
            float r5 = r5 / r6
            r6 = -1
            r8 = 0
            r6 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = -1
            r21 = -1
        L_0x00e6:
            if (r6 >= r3) goto L_0x020b
            android.text.TextPaint r11 = r7.C
            java.lang.String[] r10 = r7.s
            r10 = r10[r6]
            float r10 = r11.measureText(r10)
            int r10 = (int) r10
            int r11 = r10 / 2
            float r11 = (float) r11
            float r22 = r27 - r11
            int r13 = r7.u
            float r13 = (float) r13
            float r22 = r22 - r13
            float r11 = r27 + r11
            int r13 = r7.u
            float r13 = (float) r13
            float r11 = r11 + r13
            if (r9 != r12) goto L_0x0111
            int r11 = r7.u
            float r11 = (float) r11
            float r22 = r27 - r11
            float r11 = (float) r10
            float r11 = r27 + r11
            int r13 = r7.u
            float r13 = (float) r13
            float r11 = r11 + r13
        L_0x0111:
            if (r9 != r14) goto L_0x0120
            float r11 = (float) r10
            float r11 = r27 - r11
            int r13 = r7.u
            float r13 = (float) r13
            float r22 = r11 - r13
            int r11 = r7.u
            float r11 = (float) r11
            float r11 = r27 + r11
        L_0x0120:
            java.lang.String[] r13 = r7.s
            r13 = r13[r6]
            java.lang.String r13 = r13.trim()
            int r13 = r13.length()
            if (r13 != 0) goto L_0x0143
            if (r9 != r12) goto L_0x0138
            int r11 = r7.u
            float r11 = (float) r11
            float r11 = r27 + r11
            r22 = r11
            goto L_0x013a
        L_0x0138:
            r22 = r27
        L_0x013a:
            if (r9 != r14) goto L_0x0141
            int r11 = r7.u
            float r11 = (float) r11
            float r22 = r27 - r11
        L_0x0141:
            r11 = r22
        L_0x0143:
            int r13 = r10 - r15
            int r13 = java.lang.Math.abs(r13)
            float r13 = (float) r13
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 >= 0) goto L_0x0168
            if (r9 != r12) goto L_0x0155
            int r13 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r13 <= 0) goto L_0x0168
            goto L_0x0163
        L_0x0155:
            if (r9 != r14) goto L_0x015c
            int r13 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            if (r13 <= 0) goto L_0x0168
            goto L_0x0163
        L_0x015c:
            r13 = 2
            if (r9 != r13) goto L_0x0168
            int r13 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            if (r13 <= 0) goto L_0x0168
        L_0x0163:
            r13 = r16
            r11 = r17
            goto L_0x016b
        L_0x0168:
            r13 = r11
            r11 = r22
        L_0x016b:
            if (r6 != 0) goto L_0x016f
            int r19 = r2 - r1
        L_0x016f:
            int r15 = r19 + r1
            if (r3 <= r12) goto L_0x0197
            if (r6 <= 0) goto L_0x0184
            android.text.TextPaint r8 = r7.C
            java.lang.String[] r14 = r7.s
            int r16 = r6 + -1
            r14 = r14[r16]
            float r8 = r8.measureText(r14)
            int r8 = (int) r8
            r20 = r8
        L_0x0184:
            if (r6 >= r4) goto L_0x0197
            android.text.TextPaint r8 = r7.C
            java.lang.String[] r14 = r7.s
            int r16 = r6 + 1
            r14 = r14[r16]
            float r8 = r8.measureText(r14)
            int r8 = (int) r8
            r14 = r8
            r8 = r20
            goto L_0x019b
        L_0x0197:
            r8 = r20
            r14 = r21
        L_0x019b:
            if (r8 <= 0) goto L_0x01a2
            if (r10 < r8) goto L_0x01a2
            int r12 = r7.v
            int r15 = r15 + r12
        L_0x01a2:
            if (r14 <= 0) goto L_0x01a9
            if (r10 <= r14) goto L_0x01a9
            int r12 = r7.v
            int r15 = r15 + r12
        L_0x01a9:
            if (r6 != 0) goto L_0x01af
            int r12 = r7.v
            int r19 = r19 - r12
        L_0x01af:
            r12 = r19
            if (r6 != r4) goto L_0x01b9
            r23 = r1
            int r1 = r7.v
            int r15 = r15 + r1
            goto L_0x01bb
        L_0x01b9:
            r23 = r1
        L_0x01bb:
            r24 = r2
            r25 = r5
            r1 = r15
            r2 = 4
            android.graphics.PointF[] r5 = new android.graphics.PointF[r2]
            android.graphics.PointF r2 = new android.graphics.PointF
            float r12 = (float) r12
            r2.<init>(r11, r12)
            r15 = 0
            r5[r15] = r2
            android.graphics.PointF r2 = new android.graphics.PointF
            r2.<init>(r13, r12)
            r12 = 1
            r5[r12] = r2
            android.graphics.PointF r2 = new android.graphics.PointF
            float r12 = (float) r1
            r2.<init>(r13, r12)
            r15 = 2
            r5[r15] = r2
            android.graphics.PointF r2 = new android.graphics.PointF
            r2.<init>(r11, r12)
            r12 = 3
            r5[r12] = r2
            r0[r6] = r5
            r2 = r18
            if (r10 <= r2) goto L_0x01ee
            r18 = r10
            goto L_0x01f0
        L_0x01ee:
            r18 = r2
        L_0x01f0:
            int r6 = r6 + 1
            r19 = r1
            r20 = r8
            r15 = r10
            r17 = r11
            r16 = r13
            r21 = r14
            r1 = r23
            r2 = r24
            r5 = r25
            r8 = 0
            r10 = 4
            r11 = 0
            r12 = 1
            r13 = 2
            r14 = 3
            goto L_0x00e6
        L_0x020b:
            r2 = r18
            android.graphics.Path r1 = r7.E
            r1.reset()
            java.util.List<android.graphics.PointF> r1 = r7.L
            r1.clear()
            r1 = 0
        L_0x0218:
            if (r1 >= r3) goto L_0x02b3
            if (r1 != 0) goto L_0x022e
            android.graphics.Path r5 = r7.E
            r6 = r0[r1]
            r8 = 0
            r6 = r6[r8]
            float r6 = r6.x
            r10 = r0[r1]
            r10 = r10[r8]
            float r8 = r10.y
            r5.moveTo(r6, r8)
        L_0x022e:
            android.graphics.Path r5 = r7.E
            r6 = r0[r1]
            r8 = 1
            r6 = r6[r8]
            float r6 = r6.x
            r10 = r0[r1]
            r10 = r10[r8]
            float r10 = r10.y
            r5.lineTo(r6, r10)
            r5 = r0[r1]
            r6 = 0
            r5 = r5[r6]
            float r5 = r5.x
            r6 = r0[r1]
            r6 = r6[r8]
            float r6 = r6.x
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x0275
            android.graphics.Path r5 = r7.E
            r6 = r0[r1]
            r6 = r6[r8]
            float r6 = r6.x
            r10 = r0[r1]
            r10 = r10[r8]
            float r8 = r10.y
            r5.lineTo(r6, r8)
            android.graphics.Path r5 = r7.E
            r6 = r0[r1]
            r8 = 2
            r6 = r6[r8]
            float r6 = r6.x
            r10 = r0[r1]
            r10 = r10[r8]
            float r10 = r10.y
            r5.lineTo(r6, r10)
            goto L_0x0276
        L_0x0275:
            r8 = 2
        L_0x0276:
            android.graphics.Path r5 = r7.E
            r6 = r0[r1]
            r6 = r6[r8]
            float r6 = r6.x
            r10 = r0[r1]
            r10 = r10[r8]
            float r8 = r10.y
            r5.lineTo(r6, r8)
            java.util.List<android.graphics.PointF> r5 = r7.L
            r6 = r0[r1]
            r8 = 0
            r6 = r6[r8]
            r5.add(r6)
            java.util.List<android.graphics.PointF> r5 = r7.L
            r6 = r0[r1]
            r8 = 1
            r6 = r6[r8]
            r5.add(r6)
            java.util.List<android.graphics.PointF> r5 = r7.L
            r6 = r0[r1]
            r8 = 2
            r6 = r6[r8]
            r5.add(r6)
            java.util.List<android.graphics.PointF> r5 = r7.L
            r6 = r0[r1]
            r8 = 3
            r6 = r6[r8]
            r5.add(r6)
            int r1 = r1 + 1
            goto L_0x0218
        L_0x02b3:
            r1 = r4
        L_0x02b4:
            if (r1 < 0) goto L_0x0324
            r3 = r0[r1]
            r5 = 0
            r3 = r3[r5]
            float r3 = r3.x
            r5 = r0[r1]
            r6 = 1
            r5 = r5[r6]
            float r5 = r5.x
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x02db
            android.graphics.Path r3 = r7.E
            r5 = r0[r1]
            r6 = 3
            r5 = r5[r6]
            float r5 = r5.x
            r8 = r0[r1]
            r8 = r8[r6]
            float r8 = r8.y
            r3.lineTo(r5, r8)
            goto L_0x02dc
        L_0x02db:
            r6 = 3
        L_0x02dc:
            android.graphics.Path r3 = r7.E
            r5 = r0[r1]
            r5 = r5[r6]
            float r5 = r5.x
            r8 = r0[r1]
            r8 = r8[r6]
            float r6 = r8.y
            r3.lineTo(r5, r6)
            r3 = r0[r1]
            r5 = 0
            r3 = r3[r5]
            float r3 = r3.x
            r6 = r0[r1]
            r8 = 1
            r6 = r6[r8]
            float r6 = r6.x
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0310
            android.graphics.Path r3 = r7.E
            r6 = r0[r1]
            r6 = r6[r5]
            float r6 = r6.x
            r8 = r0[r1]
            r8 = r8[r5]
            float r8 = r8.y
            r3.lineTo(r6, r8)
        L_0x0310:
            android.graphics.Path r3 = r7.E
            r6 = r0[r1]
            r6 = r6[r5]
            float r6 = r6.x
            r8 = r0[r1]
            r8 = r8[r5]
            float r8 = r8.y
            r3.lineTo(r6, r8)
            int r1 = r1 + -1
            goto L_0x02b4
        L_0x0324:
            r5 = 0
            android.graphics.Path r1 = r7.E
            r3 = r0[r5]
            r6 = 1
            r3 = r3[r6]
            float r3 = r3.x
            r8 = r0[r5]
            r8 = r8[r6]
            float r6 = r8.y
            r1.lineTo(r3, r6)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.text.TextPaint r3 = r7.C
            java.lang.String[] r6 = r7.s
            r6 = r6[r5]
            java.lang.String[] r8 = r7.s
            r8 = r8[r5]
            int r8 = r8.length()
            r3.getTextBounds(r6, r5, r8, r1)
            int r1 = r2 >> 1
            r3 = 1
            if (r9 != r3) goto L_0x0372
            android.graphics.RectF r3 = new android.graphics.RectF
            int r6 = r7.u
            float r6 = (float) r6
            float r6 = r27 - r6
            r8 = r0[r5]
            r8 = r8[r5]
            float r5 = r8.y
            float r8 = (float) r2
            float r8 = r27 + r8
            int r10 = r7.u
            float r10 = (float) r10
            float r8 = r8 + r10
            r10 = r0[r4]
            r11 = 2
            r10 = r10[r11]
            float r10 = r10.y
            r3.<init>(r6, r5, r8, r10)
            r7.f74336b = r3
        L_0x0372:
            r3 = 3
            if (r9 != r3) goto L_0x0397
            android.graphics.RectF r3 = new android.graphics.RectF
            float r2 = (float) r2
            float r2 = r27 - r2
            int r5 = r7.u
            float r5 = (float) r5
            float r2 = r2 - r5
            r5 = 0
            r6 = r0[r5]
            r6 = r6[r5]
            float r5 = r6.y
            int r6 = r7.u
            float r6 = (float) r6
            float r6 = r27 + r6
            r8 = r0[r4]
            r10 = 2
            r8 = r8[r10]
            float r8 = r8.y
            r3.<init>(r2, r5, r6, r8)
            r7.f74336b = r3
            goto L_0x0398
        L_0x0397:
            r10 = 2
        L_0x0398:
            if (r9 != r10) goto L_0x03bc
            android.graphics.RectF r2 = new android.graphics.RectF
            float r1 = (float) r1
            float r3 = r27 - r1
            int r5 = r7.u
            float r5 = (float) r5
            float r3 = r3 - r5
            r5 = 0
            r6 = r0[r5]
            r5 = r6[r5]
            float r5 = r5.y
            float r1 = r27 + r1
            int r6 = r7.u
            float r6 = (float) r6
            float r1 = r1 + r6
            r0 = r0[r4]
            r4 = 2
            r0 = r0[r4]
            float r0 = r0.y
            r2.<init>(r3, r5, r1, r0)
            r7.f74336b = r2
        L_0x03bc:
            android.graphics.RectF r0 = r7.f74337c
            android.graphics.RectF r1 = r7.f74336b
            r0.set(r1)
            android.graphics.RectF r0 = r7.f74337c
            android.graphics.RectF r1 = r7.f74337c
            float r1 = r1.left
            int r2 = r7.y
            float r2 = (float) r2
            float r1 = r1 - r2
            android.graphics.RectF r2 = r7.f74337c
            float r2 = r2.top
            int r3 = r7.y
            float r3 = (float) r3
            float r2 = r2 - r3
            android.graphics.RectF r3 = r7.f74337c
            float r3 = r3.right
            int r4 = r7.y
            float r4 = (float) r4
            float r3 = r3 + r4
            android.graphics.RectF r4 = r7.f74337c
            float r4 = r4.bottom
            int r5 = r7.y
            float r5 = (float) r5
            float r4 = r4 + r5
            r0.set(r1, r2, r3, r4)
            return
        L_0x03e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a.a.a(float, float, float, int):void");
    }

    public void a(Canvas canvas, float f2, float f3, float f4, int i2) {
        Canvas canvas2 = canvas;
        float f5 = f2;
        int i3 = i2;
        int i4 = 0;
        int i5 = 1;
        if (PatchProxy.isSupport(new Object[]{canvas2, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Integer.valueOf(i2)}, this, f74335a, false, 86482, new Class[]{Canvas.class, Float.TYPE, Float.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Integer.valueOf(i2)}, this, f74335a, false, 86482, new Class[]{Canvas.class, Float.TYPE, Float.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Paint.FontMetrics fontMetrics = this.C.getFontMetrics();
        float f6 = fontMetrics.ascent;
        float f7 = fontMetrics.descent;
        int length = this.s.length;
        float f8 = ((((float) (length - 1)) * (fontMetrics.descent - fontMetrics.ascent)) / 2.0f) - f7;
        canvas.save();
        canvas2.rotate(f4, this.f74337c.centerX(), this.f74337c.centerY());
        int i6 = 0;
        while (i6 < length) {
            float f9 = (((float) (-((length - i6) - i5))) * (f7 - f6)) + f8;
            Rect rect = new Rect();
            this.C.getTextBounds(this.s[i6], i4, this.s[i6].length(), rect);
            if (i3 == 2) {
                canvas2.drawText(this.s[i6], f5 - ((float) (rect.width() / 2)), f3 + f9 + ((float) (this.v * i6)), this.C);
                i5 = 1;
            } else {
                i5 = 1;
                if (i3 == 1) {
                    canvas2.drawText(this.s[i6], f5, f3 + f9 + ((float) (this.v * i6)), this.C);
                } else {
                    if (i3 == 3) {
                        canvas2.drawText(this.s[i6], f5 - ((float) rect.width()), f3 + f9 + ((float) (this.v * i6)), this.C);
                    }
                    i6++;
                    i4 = 0;
                }
            }
            i6++;
            i4 = 0;
        }
        canvas.restore();
    }
}

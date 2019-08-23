package com.ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatEditText;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.shootvideo.textfont.d;

public class TextStickerEditText extends AppCompatEditText {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74312a;

    /* renamed from: b  reason: collision with root package name */
    private int f74313b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f74314c;

    /* renamed from: d  reason: collision with root package name */
    private Path f74315d;

    /* renamed from: e  reason: collision with root package name */
    private int f74316e;

    /* renamed from: f  reason: collision with root package name */
    private int f74317f;
    private int g;
    private int h;
    private int i;
    private int j;
    private boolean k;

    private String[] getTextStr() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f74312a, false, 86364, new Class[0], String[].class)) {
            return (String[]) PatchProxy.accessDispatch(new Object[0], this, f74312a, false, 86364, new Class[0], String[].class);
        } else if (TextUtils.isEmpty(getText())) {
            return null;
        } else {
            Layout layout = getLayout();
            String obj = getText().toString();
            String[] strArr = new String[getLineCount()];
            int i3 = 0;
            while (i2 < getLineCount()) {
                int lineEnd = layout.getLineEnd(i2);
                strArr[i2] = obj.substring(i3, lineEnd);
                layout.getLineBounds(i2, new Rect());
                i2++;
                i3 = lineEnd;
            }
            return strArr;
        }
    }

    public void setMode(int i2) {
        this.f74317f = i2;
    }

    public TextStickerEditText(Context context) {
        this(context, null);
    }

    public static int a(int i2) {
        int i3 = i2;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, null, f74312a, true, 86361, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return Color.argb(153, (16711680 & i3) >> 16, (65280 & i3) >> 8, i3 & 255);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, null, f74312a, true, 86361, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    private void setMaskBlurColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74312a, false, 86358, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74312a, false, 86358, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        setTextColor(-1);
        setShadowLayer(12.0f, 0.0f, 0.0f, i2);
    }

    public void setAligin(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74312a, false, 86360, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74312a, false, 86360, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g = i2;
        if (this.g == 1) {
            setGravity(3);
        } else if (this.g == 2) {
            setGravity(17);
        } else {
            if (this.g == 3) {
                setGravity(5);
            }
        }
    }

    public void setFontType(Typeface typeface) {
        if (PatchProxy.isSupport(new Object[]{typeface}, this, f74312a, false, 86357, new Class[]{Typeface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{typeface}, this, f74312a, false, 86357, new Class[]{Typeface.class}, Void.TYPE);
            return;
        }
        if (getTypeface() != typeface) {
            setTypeface(typeface);
        }
        this.k = d.a().e();
        if (this.k) {
            setMaskBlurColor(getCurrentTextColor());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x021b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0218  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r29) {
        /*
            r28 = this;
            r7 = r28
            r8 = r29
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f74312a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 86362(0x1515a, float:1.21019E-40)
            r1 = r28
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f74312a
            r3 = 0
            r4 = 86362(0x1515a, float:1.21019E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r28
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            int r0 = r7.f74317f
            if (r0 == r9) goto L_0x0367
            android.text.Editable r0 = r28.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0367
            android.graphics.Paint r0 = r7.f74314c
            int r1 = r7.f74316e
            r0.setColor(r1)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f74312a
            r3 = 0
            r4 = 86363(0x1515b, float:1.2102E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r28
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0084
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f74312a
            r3 = 0
            r4 = 86363(0x1515b, float:1.2102E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.graphics.Canvas> r1 = android.graphics.Canvas.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r28
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0367
        L_0x0084:
            java.lang.String[] r0 = r28.getTextStr()
            if (r0 == 0) goto L_0x0367
            int r1 = r0.length
            if (r1 != 0) goto L_0x008f
            goto L_0x0367
        L_0x008f:
            int r1 = r0.length
            android.graphics.Point[][] r2 = new android.graphics.Point[r1][]
            android.text.TextPaint r3 = r28.getPaint()
            android.graphics.Paint$FontMetrics r3 = r3.getFontMetrics()
            float r4 = r3.descent
            float r3 = r3.ascent
            float r4 = r4 - r3
            double r3 = (double) r4
            double r3 = java.lang.Math.ceil(r3)
            int r3 = (int) r3
            float r4 = r28.getTextSize()
            int r4 = (int) r4
            r5 = 4
            int r4 = r4 / r5
            int r6 = r7.g
            if (r6 != r9) goto L_0x00b2
            r7.h = r10
        L_0x00b2:
            int r6 = r7.g
            r11 = 3
            if (r6 != r11) goto L_0x00bd
            int r6 = r28.getMeasuredWidth()
            r7.h = r6
        L_0x00bd:
            int r6 = r7.g
            r12 = 2
            if (r6 != r12) goto L_0x00c9
            int r6 = r28.getMeasuredWidth()
            int r6 = r6 / r12
            r7.h = r6
        L_0x00c9:
            r6 = -1
            r6 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = -1
            r18 = -1
        L_0x00d4:
            if (r6 >= r1) goto L_0x0255
            android.text.TextPaint r10 = r28.getPaint()
            r11 = r0[r6]
            float r10 = r10.measureText(r11)
            int r10 = (int) r10
            int r11 = r7.h
            int r19 = r10 / 2
            int r11 = r11 - r19
            int r5 = r7.f74313b
            int r5 = r5 * 2
            int r11 = r11 - r5
            int r5 = r7.h
            int r5 = r5 + r19
            int r9 = r7.f74313b
            int r9 = r9 * 2
            int r5 = r5 + r9
            int r9 = r7.g
            r12 = 1
            if (r9 != r12) goto L_0x0106
            int r11 = r7.h
            int r5 = r7.h
            int r5 = r5 + r10
            int r9 = r7.f74313b
            r12 = 4
            int r9 = r9 * 4
            int r5 = r5 + r9
            goto L_0x0107
        L_0x0106:
            r12 = 4
        L_0x0107:
            int r9 = r7.g
            r12 = 3
            if (r9 != r12) goto L_0x0118
            int r5 = r7.h
            int r5 = r5 - r10
            int r9 = r7.f74313b
            r11 = 4
            int r9 = r9 * 4
            int r11 = r5 - r9
            int r5 = r7.h
        L_0x0118:
            r9 = r0[r6]
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x012c
            r9 = r0[r6]
            java.lang.String r9 = r9.trim()
            int r9 = r9.length()
            if (r9 != 0) goto L_0x0148
        L_0x012c:
            int r5 = r28.getMeasuredWidth()
            r9 = 2
            int r5 = r5 / r9
            int r9 = r7.g
            r11 = 1
            if (r9 != r11) goto L_0x0139
            int r5 = r7.f74313b
        L_0x0139:
            r11 = r5
            int r5 = r7.g
            r9 = 3
            if (r5 != r9) goto L_0x0147
            int r5 = r28.getMeasuredWidth()
            int r9 = r7.f74313b
            int r11 = r5 - r9
        L_0x0147:
            r5 = r11
        L_0x0148:
            int r9 = r10 - r13
            int r9 = java.lang.Math.abs(r9)
            if (r9 >= r4) goto L_0x0168
            int r9 = r7.g
            r12 = 1
            if (r9 != r12) goto L_0x0158
            if (r14 <= 0) goto L_0x0168
            goto L_0x016a
        L_0x0158:
            int r9 = r7.g
            r12 = 3
            if (r9 != r12) goto L_0x0160
            if (r15 <= 0) goto L_0x0168
            goto L_0x016a
        L_0x0160:
            int r9 = r7.g
            r12 = 2
            if (r9 != r12) goto L_0x0168
            if (r15 <= 0) goto L_0x0168
            goto L_0x016a
        L_0x0168:
            r14 = r5
            r15 = r11
        L_0x016a:
            if (r6 != 0) goto L_0x01cf
            com.ss.android.ugc.aweme.story.shootvideo.textfont.d r5 = com.ss.android.ugc.aweme.story.shootvideo.textfont.d.a()
            r9 = 0
            java.lang.Object[] r11 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r22 = com.ss.android.ugc.aweme.story.shootvideo.textfont.d.f74170a
            r23 = 0
            r24 = 86096(0x15050, float:1.20646E-40)
            java.lang.Class[] r12 = new java.lang.Class[r9]
            java.lang.Class r26 = java.lang.Boolean.TYPE
            r20 = r11
            r21 = r5
            r25 = r12
            boolean r11 = com.meituan.robust.PatchProxy.isSupport(r20, r21, r22, r23, r24, r25, r26)
            if (r11 == 0) goto L_0x01a8
            java.lang.Object[] r11 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r22 = com.ss.android.ugc.aweme.story.shootvideo.textfont.d.f74170a
            r23 = 0
            r24 = 86096(0x15050, float:1.20646E-40)
            java.lang.Class[] r12 = new java.lang.Class[r9]
            java.lang.Class r26 = java.lang.Boolean.TYPE
            r20 = r11
            r21 = r5
            r25 = r12
            java.lang.Object r5 = com.meituan.robust.PatchProxy.accessDispatch(r20, r21, r22, r23, r24, r25, r26)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r9 = r5.booleanValue()
            goto L_0x01c2
        L_0x01a8:
            java.lang.String[] r5 = com.ss.android.ugc.aweme.story.shootvideo.textfont.d.f74171b
            int r9 = r5.length
            r11 = 0
        L_0x01ac:
            if (r11 >= r9) goto L_0x01c1
            r12 = r5[r11]
            com.ss.android.ugc.aweme.story.shootvideo.textfont.d r13 = com.ss.android.ugc.aweme.story.shootvideo.textfont.d.a()
            java.lang.String r13 = r13.f74173c
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x01be
            r9 = 1
            goto L_0x01c2
        L_0x01be:
            int r11 = r11 + 1
            goto L_0x01ac
        L_0x01c1:
            r9 = 0
        L_0x01c2:
            if (r9 != 0) goto L_0x01cb
            int r5 = r7.i
            int r9 = r7.f74313b
            int r16 = r5 - r9
            goto L_0x01cf
        L_0x01cb:
            int r5 = r7.i
            r16 = r5
        L_0x01cf:
            int r5 = r16 + r3
            r9 = 1
            if (r1 <= r9) goto L_0x01fa
            if (r6 <= 0) goto L_0x01e5
            android.text.TextPaint r9 = r28.getPaint()
            int r11 = r6 + -1
            r11 = r0[r11]
            float r9 = r9.measureText(r11)
            int r9 = (int) r9
            r17 = r9
        L_0x01e5:
            int r9 = r1 + -1
            if (r6 >= r9) goto L_0x01fa
            android.text.TextPaint r9 = r28.getPaint()
            int r11 = r6 + 1
            r11 = r0[r11]
            float r9 = r9.measureText(r11)
            int r9 = (int) r9
            r11 = r9
            r9 = r17
            goto L_0x01fe
        L_0x01fa:
            r9 = r17
            r11 = r18
        L_0x01fe:
            if (r9 <= 0) goto L_0x0205
            if (r10 < r9) goto L_0x0205
            int r12 = r7.f74313b
            int r5 = r5 + r12
        L_0x0205:
            if (r11 <= 0) goto L_0x020c
            if (r10 <= r11) goto L_0x020c
            int r12 = r7.f74313b
            int r5 = r5 + r12
        L_0x020c:
            if (r6 != 0) goto L_0x0212
            int r12 = r7.f74313b
            int r16 = r16 - r12
        L_0x0212:
            r12 = r16
            int r13 = r1 + -1
            if (r6 != r13) goto L_0x021b
            int r13 = r7.f74313b
            int r5 = r5 + r13
        L_0x021b:
            r27 = r0
            r13 = 4
            android.graphics.Point[] r0 = new android.graphics.Point[r13]
            android.graphics.Point r13 = new android.graphics.Point
            r13.<init>(r15, r12)
            r16 = 0
            r0[r16] = r13
            android.graphics.Point r13 = new android.graphics.Point
            r13.<init>(r14, r12)
            r12 = 1
            r0[r12] = r13
            android.graphics.Point r12 = new android.graphics.Point
            r12.<init>(r14, r5)
            r13 = 2
            r0[r13] = r12
            android.graphics.Point r12 = new android.graphics.Point
            r12.<init>(r15, r5)
            r13 = 3
            r0[r13] = r12
            r2[r6] = r0
            int r6 = r6 + 1
            r16 = r5
            r17 = r9
            r13 = r10
            r18 = r11
            r0 = r27
            r5 = 4
            r9 = 1
            r10 = 0
            r11 = 3
            r12 = 2
            goto L_0x00d4
        L_0x0255:
            android.graphics.Path r0 = r7.f74315d
            r0.reset()
            r0 = 0
        L_0x025b:
            if (r0 >= r1) goto L_0x02d5
            if (r0 != 0) goto L_0x0273
            android.graphics.Path r3 = r7.f74315d
            r4 = r2[r0]
            r5 = 0
            r4 = r4[r5]
            int r4 = r4.x
            float r4 = (float) r4
            r6 = r2[r0]
            r6 = r6[r5]
            int r5 = r6.y
            float r5 = (float) r5
            r3.moveTo(r4, r5)
        L_0x0273:
            android.graphics.Path r3 = r7.f74315d
            r4 = r2[r0]
            r5 = 1
            r4 = r4[r5]
            int r4 = r4.x
            float r4 = (float) r4
            r6 = r2[r0]
            r6 = r6[r5]
            int r6 = r6.y
            float r6 = (float) r6
            r3.lineTo(r4, r6)
            r3 = r2[r0]
            r4 = 0
            r3 = r3[r4]
            int r3 = r3.x
            r4 = r2[r0]
            r4 = r4[r5]
            int r4 = r4.x
            if (r3 != r4) goto L_0x02be
            android.graphics.Path r3 = r7.f74315d
            r4 = r2[r0]
            r4 = r4[r5]
            int r4 = r4.x
            float r4 = (float) r4
            r6 = r2[r0]
            r6 = r6[r5]
            int r5 = r6.y
            float r5 = (float) r5
            r3.lineTo(r4, r5)
            android.graphics.Path r3 = r7.f74315d
            r4 = r2[r0]
            r5 = 2
            r4 = r4[r5]
            int r4 = r4.x
            float r4 = (float) r4
            r6 = r2[r0]
            r6 = r6[r5]
            int r6 = r6.y
            float r6 = (float) r6
            r3.lineTo(r4, r6)
            goto L_0x02bf
        L_0x02be:
            r5 = 2
        L_0x02bf:
            android.graphics.Path r3 = r7.f74315d
            r4 = r2[r0]
            r4 = r4[r5]
            int r4 = r4.x
            float r4 = (float) r4
            r6 = r2[r0]
            r6 = r6[r5]
            int r6 = r6.y
            float r6 = (float) r6
            r3.lineTo(r4, r6)
            int r0 = r0 + 1
            goto L_0x025b
        L_0x02d5:
            r0 = 1
            int r1 = r1 - r0
        L_0x02d7:
            if (r1 < 0) goto L_0x034b
            r3 = r2[r1]
            r4 = 0
            r3 = r3[r4]
            int r3 = r3.x
            r4 = r2[r1]
            r4 = r4[r0]
            int r0 = r4.x
            if (r3 != r0) goto L_0x02fd
            android.graphics.Path r0 = r7.f74315d
            r3 = r2[r1]
            r4 = 3
            r3 = r3[r4]
            int r3 = r3.x
            float r3 = (float) r3
            r5 = r2[r1]
            r5 = r5[r4]
            int r5 = r5.y
            float r5 = (float) r5
            r0.lineTo(r3, r5)
            goto L_0x02fe
        L_0x02fd:
            r4 = 3
        L_0x02fe:
            android.graphics.Path r0 = r7.f74315d
            r3 = r2[r1]
            r3 = r3[r4]
            int r3 = r3.x
            float r3 = (float) r3
            r5 = r2[r1]
            r5 = r5[r4]
            int r5 = r5.y
            float r5 = (float) r5
            r0.lineTo(r3, r5)
            r0 = r2[r1]
            r3 = 0
            r0 = r0[r3]
            int r0 = r0.x
            r5 = r2[r1]
            r6 = 1
            r5 = r5[r6]
            int r5 = r5.x
            if (r0 != r5) goto L_0x0334
            android.graphics.Path r0 = r7.f74315d
            r5 = r2[r1]
            r5 = r5[r3]
            int r5 = r5.x
            float r5 = (float) r5
            r6 = r2[r1]
            r6 = r6[r3]
            int r6 = r6.y
            float r6 = (float) r6
            r0.lineTo(r5, r6)
        L_0x0334:
            android.graphics.Path r0 = r7.f74315d
            r5 = r2[r1]
            r5 = r5[r3]
            int r5 = r5.x
            float r5 = (float) r5
            r6 = r2[r1]
            r6 = r6[r3]
            int r6 = r6.y
            float r6 = (float) r6
            r0.lineTo(r5, r6)
            int r1 = r1 + -1
            r0 = 1
            goto L_0x02d7
        L_0x034b:
            r3 = 0
            android.graphics.Path r0 = r7.f74315d
            r1 = r2[r3]
            r4 = 1
            r1 = r1[r4]
            int r1 = r1.x
            float r1 = (float) r1
            r2 = r2[r3]
            r2 = r2[r4]
            int r2 = r2.y
            float r2 = (float) r2
            r0.lineTo(r1, r2)
            android.graphics.Path r0 = r7.f74315d
            android.graphics.Paint r1 = r7.f74314c
            r8.drawPath(r0, r1)
        L_0x0367:
            super.onDraw(r29)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerEditText.onDraw(android.graphics.Canvas):void");
    }

    public TextStickerEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f74316e = -1;
        this.f74317f = 1;
        this.g = 2;
        this.f74313b = (int) UIUtils.dip2Px(context, 6.0f);
        this.j = (int) UIUtils.dip2Px(context, 5.0f);
        this.f74314c = new Paint();
        this.f74314c.setColor(this.f74316e);
        this.f74314c.setStyle(Paint.Style.FILL);
        this.f74314c.setAntiAlias(true);
        this.f74314c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.f74314c.setPathEffect(new CornerPathEffect((float) this.j));
        this.f74315d = new Path();
        setLayerType(1, null);
        setLineSpacing((float) this.f74313b, getLineSpacingMultiplier());
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f74312a, false, 86365, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f74312a, false, 86365, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        this.h = getMeasuredWidth() / 2;
        if (this.i == 0) {
            this.i = (getLineHeight() - this.f74313b) / 2;
        }
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f74312a, false, 86359, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f74312a, false, 86359, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.k) {
            setMaskBlurColor(i3);
            this.f74317f = 1;
        } else {
            setShadowLayer(0.0f, 0.0f, 0.0f, i3);
            if (i2 == 1) {
                this.f74317f = 1;
                this.f74316e = i3;
                setBackground(null);
                setTextColor(i3);
            } else if (i2 == 2) {
                this.f74317f = 2;
                this.f74316e = i3;
                if (i3 == -1) {
                    setTextColor(-16777216);
                } else {
                    setTextColor(-1);
                }
            } else {
                if (i2 == 3) {
                    this.f74317f = 3;
                    this.f74316e = a(i3);
                    setTextColor(-1);
                }
            }
        }
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f74312a, false, 86366, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f74312a, false, 86366, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        float lineSpacingExtra = getLineSpacingExtra();
        float lineSpacingMultiplier = getLineSpacingMultiplier();
        setLineSpacing(0.0f, 1.0f);
        setLineSpacing(lineSpacingExtra, lineSpacingMultiplier);
        if (getLineCount() > 20) {
            if (PatchProxy.isSupport(new Object[0], this, f74312a, false, 86367, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f74312a, false, 86367, new Class[0], Void.TYPE);
                return;
            }
            String obj = getText().toString();
            setText(obj.substring(0, obj.length() - 1));
            setSelection(getText().length());
        }
    }
}

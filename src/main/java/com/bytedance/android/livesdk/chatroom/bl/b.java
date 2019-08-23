package com.bytedance.android.livesdk.chatroom.bl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.h;
import com.bytedance.android.livesdk.gift.model.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9786a;

    public static String a(g gVar) {
        Typeface typeface;
        g gVar2 = gVar;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{gVar2}, null, f9786a, true, 3953, new Class[]{g.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{gVar2}, null, f9786a, true, 3953, new Class[]{g.class}, String.class);
        }
        String str = gVar2.j;
        Bitmap createBitmap = Bitmap.createBitmap(gVar2.f15124c, gVar2.f15125d, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setDither(true);
        if (h.a(gVar2.k)) {
            typeface = Typeface.createFromFile(gVar2.k);
        } else {
            typeface = Typeface.DEFAULT;
        }
        textPaint.setTypeface(typeface);
        textPaint.setTextSize((float) gVar2.f15127f);
        textPaint.setColor(Color.parseColor(gVar2.g));
        if (gVar2.h != 1) {
            z = false;
        }
        float f2 = 0.0f;
        if (z) {
            int b2 = ac.b((int) C0906R.color.ao4);
            textPaint.setShadowLayer(2.0f, 0.0f, 5.0f, Color.argb(153, Color.red(b2), Color.green(b2), Color.blue(b2)));
        }
        String str2 = gVar2.i;
        if (TextUtils.equals(str2, "center")) {
            f2 = (((float) gVar2.f15124c) - textPaint.measureText(gVar2.f15126e)) / 2.0f;
        } else if (!TextUtils.equals(str2, "left") && TextUtils.equals(str2, "right")) {
            f2 = ((float) gVar2.f15124c) - textPaint.measureText(gVar2.f15126e);
        }
        textPaint.getTextBounds(gVar2.f15126e, 0, gVar2.f15126e.length(), new Rect());
        Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        canvas.drawText(gVar2.f15126e, f2, (float) ((((gVar2.f15125d - fontMetricsInt.bottom) + fontMetricsInt.top) / 2) - fontMetricsInt.top), textPaint);
        a(str, createBitmap);
        createBitmap.recycle();
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063 A[SYNTHETIC, Splitter:B:19:0x0063] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0069 A[SYNTHETIC, Splitter:B:25:0x0069] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(java.lang.String r19, android.graphics.Bitmap r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f9786a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class<android.graphics.Bitmap> r4 = android.graphics.Bitmap.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r4 = 0
            r6 = 1
            r7 = 3954(0xf72, float:5.541E-42)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x004a
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f9786a
            r15 = 1
            r16 = 3954(0xf72, float:5.541E-42)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x004a:
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0067, all -> 0x0060 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0067, all -> 0x0060 }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x005e, all -> 0x005b }
            r2 = 100
            r1.compress(r0, r2, r3)     // Catch:{ Exception -> 0x005e, all -> 0x005b }
            r3.close()     // Catch:{ IOException -> 0x005a }
        L_0x005a:
            return r11
        L_0x005b:
            r0 = move-exception
            r2 = r3
            goto L_0x0061
        L_0x005e:
            r2 = r3
            goto L_0x0067
        L_0x0060:
            r0 = move-exception
        L_0x0061:
            if (r2 == 0) goto L_0x0066
            r2.close()     // Catch:{ IOException -> 0x0066 }
        L_0x0066:
            throw r0
        L_0x0067:
            if (r2 == 0) goto L_0x006c
            r2.close()     // Catch:{ IOException -> 0x006c }
        L_0x006c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.bl.b.a(java.lang.String, android.graphics.Bitmap):boolean");
    }
}

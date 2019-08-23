package com.ss.android.ugc.aweme.shortvideo.q.b;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ttve.utils.c;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.port.in.a;

public class l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68995a;

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f68996b;

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0059 A[SYNTHETIC, Splitter:B:20:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0064 A[SYNTHETIC, Splitter:B:27:0x0064] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r9 = 0
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f68995a
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r9] = r2
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 81181(0x13d1d, float:1.13759E-40)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0039
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f68995a
            r4 = 0
            r5 = 81181(0x13d1d, float:1.13759E-40)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r9] = r0
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0039:
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0062, all -> 0x0055 }
            r2.<init>(r11)     // Catch:{ FileNotFoundException -> 0x0062, all -> 0x0055 }
            android.graphics.Bitmap r0 = r10.f68996b     // Catch:{ FileNotFoundException -> 0x0053, all -> 0x0051 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ FileNotFoundException -> 0x0053, all -> 0x0051 }
            r3 = 100
            r0.compress(r1, r3, r2)     // Catch:{ FileNotFoundException -> 0x0053, all -> 0x0051 }
            r2.close()     // Catch:{ IOException -> 0x004b }
        L_0x004b:
            android.graphics.Bitmap r0 = r10.f68996b
            com.ss.android.ugc.aweme.utils.w.a((android.graphics.Bitmap) r0)
            return r8
        L_0x0051:
            r0 = move-exception
            goto L_0x0057
        L_0x0053:
            r1 = r2
            goto L_0x0062
        L_0x0055:
            r0 = move-exception
            r2 = r1
        L_0x0057:
            if (r2 == 0) goto L_0x005c
            r2.close()     // Catch:{ IOException -> 0x005c }
        L_0x005c:
            android.graphics.Bitmap r1 = r10.f68996b
            com.ss.android.ugc.aweme.utils.w.a((android.graphics.Bitmap) r1)
            throw r0
        L_0x0062:
            if (r1 == 0) goto L_0x0067
            r1.close()     // Catch:{ IOException -> 0x0067 }
        L_0x0067:
            android.graphics.Bitmap r0 = r10.f68996b
            com.ss.android.ugc.aweme.utils.w.a((android.graphics.Bitmap) r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.q.b.l.a(java.lang.String):boolean");
    }

    /* access modifiers changed from: package-private */
    public l a(String str, Bitmap bitmap, boolean z) {
        float f2;
        String str2 = str;
        Bitmap bitmap2 = bitmap;
        if (PatchProxy.isSupport(new Object[]{str2, bitmap2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f68995a, false, 81179, new Class[]{String.class, Bitmap.class, Boolean.TYPE}, l.class)) {
            return (l) PatchProxy.accessDispatch(new Object[]{str2, bitmap2, Byte.valueOf(z)}, this, f68995a, false, 81179, new Class[]{String.class, Bitmap.class, Boolean.TYPE}, l.class);
        }
        Resources resources = a.f61119b.getResources();
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, 168, 67, true);
        if (TextUtils.isEmpty(str)) {
            this.f68996b = createScaledBitmap;
        } else {
            TextPaint textPaint = new TextPaint();
            textPaint.setAntiAlias(true);
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
            textPaint.setColor(resources.getColor(C0906R.color.a10));
            textPaint.setTextSize(30.0f);
            float a2 = c.a(a.f61119b, 1.0f);
            textPaint.setShadowLayer(2.0f * a2, 0.0f, a2, resources.getColor(C0906R.color.im));
            int measureText = (int) (textPaint.measureText(str) + 5.0f);
            int max = Math.max(createScaledBitmap.getWidth(), measureText) + 15;
            Bitmap createBitmap = Bitmap.createBitmap(max, createScaledBitmap.getHeight() + 44 + 2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            if (z) {
                f2 = 4.0f;
            } else {
                f2 = (float) (max - createScaledBitmap.getWidth());
            }
            canvas.drawBitmap(createScaledBitmap, f2, 0.0f, paint);
            canvas.drawText(str, (float) ((max - measureText) - 4), ((float) (createScaledBitmap.getHeight() + 2)) - textPaint.ascent(), textPaint);
            this.f68996b = createBitmap;
        }
        return this;
    }

    public final l a(int i, int i2, String str, int i3, boolean z) {
        Bitmap bitmap;
        float f2;
        float f3;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2, 2130840589, Byte.valueOf(z ? (byte) 1 : 0)}, this, f68995a, false, 81176, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, Boolean.TYPE}, l.class)) {
            return (l) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2, 2130840589, Byte.valueOf(z)}, this, f68995a, false, 81176, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, Boolean.TYPE}, l.class);
        }
        Resources resources = a.f61119b.getResources();
        float f4 = ((float) i) / 720.0f;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(resources, 2130840589, null), (int) (208.0f * f4), (int) (56.0f * f4), true);
        if (TextUtils.isEmpty(str)) {
            this.f68996b = createScaledBitmap;
        } else {
            TextPaint textPaint = new TextPaint();
            textPaint.setAntiAlias(true);
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
            textPaint.setColor(resources.getColor(C0906R.color.a6k));
            textPaint.setTextSize(22.0f * f4);
            float f5 = 4.0f * f4;
            textPaint.setShadowLayer(f5, 0.0f, 0.0f, resources.getColor(C0906R.color.im));
            int measureText = (int) textPaint.measureText(str2);
            float f6 = 6.0f * f4;
            int i4 = ((int) f6) + measureText;
            if (i4 >= createScaledBitmap.getWidth()) {
                bitmap = Bitmap.createBitmap(i4, (int) (((float) createScaledBitmap.getHeight()) + (f4 * 32.0f)), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                if (z) {
                    f3 = 0.0f;
                } else {
                    f3 = (float) (i4 - createScaledBitmap.getWidth());
                }
                canvas.drawBitmap(createScaledBitmap, f3, 0.0f, paint);
                canvas.drawText(str2, 0.0f, (((float) createScaledBitmap.getHeight()) + f5) - textPaint.ascent(), textPaint);
            } else {
                int width = createScaledBitmap.getWidth();
                Bitmap createBitmap = Bitmap.createBitmap(width, (int) (((float) createScaledBitmap.getHeight()) + (f4 * 32.0f)), Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                Paint paint2 = new Paint();
                paint2.setAntiAlias(true);
                if (z) {
                    f2 = 0.0f;
                } else {
                    f2 = (float) (width - createScaledBitmap.getWidth());
                }
                canvas2.drawBitmap(createScaledBitmap, f2, 0.0f, paint2);
                canvas2.drawText(str2, ((float) (width - measureText)) - f6, (((float) createScaledBitmap.getHeight()) + f5) - textPaint.ascent(), textPaint);
                bitmap = createBitmap;
            }
            this.f68996b = bitmap;
        }
        return this;
    }
}

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

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68958a;

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f68959b;

    public final b a() {
        if (PatchProxy.isSupport(new Object[0], this, f68958a, false, 81120, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], this, f68958a, false, 81120, new Class[0], b.class);
        }
        this.f68959b = BitmapFactory.decodeResource(a.f61119b.getResources(), 2130838691);
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005e A[SYNTHETIC, Splitter:B:23:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0064 A[SYNTHETIC, Splitter:B:29:0x0064] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r9 = 0
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f68958a
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r9] = r2
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 81115(0x13cdb, float:1.13666E-40)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0039
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f68958a
            r4 = 0
            r5 = 81115(0x13cdb, float:1.13666E-40)
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
            android.graphics.Bitmap r1 = r10.f68959b
            if (r1 != 0) goto L_0x0043
            java.lang.String r0 = "mBitmap is null"
            com.ss.android.ugc.aweme.shortvideo.util.ai.b(r0)
            return r9
        L_0x0043:
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0062, all -> 0x005a }
            r2.<init>(r11)     // Catch:{ FileNotFoundException -> 0x0062, all -> 0x005a }
            android.graphics.Bitmap r0 = r10.f68959b     // Catch:{ FileNotFoundException -> 0x0058, all -> 0x0056 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ FileNotFoundException -> 0x0058, all -> 0x0056 }
            r3 = 100
            r0.compress(r1, r3, r2)     // Catch:{ FileNotFoundException -> 0x0058, all -> 0x0056 }
            r2.close()     // Catch:{ IOException -> 0x0055 }
        L_0x0055:
            return r8
        L_0x0056:
            r0 = move-exception
            goto L_0x005c
        L_0x0058:
            r1 = r2
            goto L_0x0062
        L_0x005a:
            r0 = move-exception
            r2 = r1
        L_0x005c:
            if (r2 == 0) goto L_0x0061
            r2.close()     // Catch:{ IOException -> 0x0061 }
        L_0x0061:
            throw r0
        L_0x0062:
            if (r1 == 0) goto L_0x0067
            r1.close()     // Catch:{ IOException -> 0x0067 }
        L_0x0067:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.q.b.b.a(java.lang.String):boolean");
    }

    public final b a(int i, int i2, String str, Bitmap bitmap, boolean z, boolean z2) {
        float f2;
        float width;
        float f3;
        float f4;
        float width2;
        float f5;
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        Bitmap bitmap2 = bitmap;
        int i5 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2, bitmap2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f68958a, false, 81119, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Bitmap.class, Boolean.TYPE, Boolean.TYPE}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2, bitmap2, Byte.valueOf(z), Byte.valueOf(z2)}, this, f68958a, false, 81119, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Bitmap.class, Boolean.TYPE, Boolean.TYPE}, b.class);
        }
        if (i3 == 0 || i4 == 0) {
            f2 = 1.0f;
        } else {
            f2 = Math.min(((float) i3) / 540.0f, ((float) i4) / 960.0f);
        }
        Resources resources = a.f61119b.getResources();
        int i6 = (int) (145.0f * f2);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, i6, (bitmap.getHeight() * i6) / bitmap.getWidth(), true);
        if (TextUtils.isEmpty(str)) {
            this.f68959b = createScaledBitmap;
        } else {
            TextPaint textPaint = new TextPaint();
            textPaint.setAntiAlias(true);
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
            textPaint.setColor(resources.getColor(C0906R.color.a10));
            textPaint.setTextSize(14.0f * f2);
            float a2 = c.a(a.f61119b, 1.0f);
            textPaint.setShadowLayer(1.0f * a2, 0.0f, a2, resources.getColor(C0906R.color.gi));
            int i7 = (int) (17.0f * f2);
            int measureText = (int) (textPaint.measureText(str2) + (5.0f * f2));
            int width3 = createScaledBitmap.getWidth();
            if (z) {
                i5 = i7 + ((int) Math.ceil((double) (f2 * 4.0f)));
            }
            int max = Math.max(width3, i5 + measureText);
            Bitmap createBitmap = Bitmap.createBitmap(max, (int) (((float) createScaledBitmap.getHeight()) + (26.0f * f2)), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            if (z) {
                Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(resources, 2130839887, null), i7, i7, true);
                if (z2) {
                    f4 = 0.0f;
                } else {
                    f4 = ((float) (max - measureText)) - (((float) i7) + (f2 * 4.0f));
                }
                canvas.drawBitmap(createScaledBitmap2, f4, (((float) createScaledBitmap.getHeight()) - textPaint.ascent()) - (15.0f * f2), paint);
                if (z2) {
                    width2 = 0.0f;
                } else {
                    width2 = (float) ((max - createScaledBitmap.getWidth()) + 3);
                }
                canvas.drawBitmap(createScaledBitmap, width2, 0.0f, paint);
                if (z2) {
                    f5 = ((float) i7) + (f2 * 4.0f);
                } else {
                    f5 = (float) (max - measureText);
                }
                canvas.drawText(str2, f5, (((float) createScaledBitmap.getHeight()) - textPaint.ascent()) - (f2 * 2.0f), textPaint);
            } else {
                if (z2) {
                    width = 0.0f;
                } else {
                    width = (float) ((max - createScaledBitmap.getWidth()) + 3);
                }
                canvas.drawBitmap(createScaledBitmap, width, 0.0f, paint);
                if (z2) {
                    f3 = 0.0f;
                } else {
                    f3 = (float) (max - measureText);
                }
                canvas.drawText(str2, f3, (((float) createScaledBitmap.getHeight()) - textPaint.ascent()) - (f2 * 2.0f), textPaint);
            }
            this.f68959b = createBitmap;
        }
        return this;
    }

    public final b a(int i, int i2, String str, Bitmap bitmap, boolean z, boolean z2, c cVar) {
        float f2;
        Resources resources;
        Bitmap bitmap2;
        float width;
        float f3;
        float width2;
        float f4;
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        Bitmap bitmap3 = bitmap;
        c cVar2 = cVar;
        int i5 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2, bitmap3, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), cVar2}, this, f68958a, false, 81118, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Bitmap.class, Boolean.TYPE, Boolean.TYPE, c.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str2, bitmap3, Byte.valueOf(z), Byte.valueOf(z2), cVar2}, this, f68958a, false, 81118, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Bitmap.class, Boolean.TYPE, Boolean.TYPE, c.class}, b.class);
        }
        if (i3 == 0 || i4 == 0) {
            f2 = 1.0f;
        } else {
            f2 = Math.min(((float) i3) / 540.0f, ((float) i4) / 960.0f);
        }
        Resources resources2 = a.f61119b.getResources();
        int i6 = (int) (145.0f * f2);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap3, i6, (bitmap.getHeight() * i6) / bitmap.getWidth(), true);
        if (TextUtils.isEmpty(str)) {
            this.f68959b = createScaledBitmap;
        } else {
            TextPaint textPaint = new TextPaint();
            textPaint.setAntiAlias(true);
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
            textPaint.setColor(resources2.getColor(C0906R.color.a10));
            textPaint.setTextSize(26.0f * f2);
            float a2 = c.a(a.f61119b, 1.0f);
            textPaint.setShadowLayer(1.0f * a2, 0.0f, a2, resources2.getColor(C0906R.color.gi));
            int i7 = (int) (28.0f * f2);
            float f5 = 5.0f * f2;
            int measureText = (int) (textPaint.measureText(str2) + f5);
            int width3 = createScaledBitmap.getWidth();
            if (z) {
                resources = resources2;
                i5 = i7 + ((int) Math.ceil((double) (f2 * 4.0f)));
            } else {
                resources = resources2;
            }
            int max = Math.max(width3, measureText + i5);
            Bitmap createBitmap = Bitmap.createBitmap(max, (int) (((float) createScaledBitmap.getHeight()) + (46.0f * f2)), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            if (z) {
                bitmap2 = createBitmap;
                Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(resources, cVar2.f68960a, null), i7, i7, true);
                if (z2) {
                    f3 = 0.0f;
                } else {
                    f3 = ((float) (max - measureText)) - (((float) i7) + (f2 * 4.0f));
                }
                canvas.drawBitmap(createScaledBitmap2, f3, (((float) createScaledBitmap.getHeight()) - textPaint.ascent()) - (29.0f * f2), paint);
                if (z2) {
                    width2 = 0.0f;
                } else {
                    width2 = (float) ((max - createScaledBitmap.getWidth()) + 3);
                }
                canvas.drawBitmap(createScaledBitmap, width2, 0.0f, paint);
                if (z2) {
                    f4 = ((float) i7) + (f2 * 4.0f);
                } else {
                    f4 = (float) (max - measureText);
                }
                canvas.drawText(str2, f4, (((float) createScaledBitmap.getHeight()) - textPaint.ascent()) - f5, textPaint);
            } else {
                bitmap2 = createBitmap;
                if (z2) {
                    width = 0.0f;
                } else {
                    width = (float) ((max - createScaledBitmap.getWidth()) + 3);
                }
                float f6 = 0.0f;
                canvas.drawBitmap(createScaledBitmap, width, 0.0f, paint);
                if (!z2) {
                    f6 = (float) (max - measureText);
                }
                canvas.drawText(str2, f6, (((float) createScaledBitmap.getHeight()) - textPaint.ascent()) - f5, textPaint);
            }
            this.f68959b = bitmap2;
        }
        return this;
    }
}

package com.bytedance.android.livesdk.utils;

import android.graphics.Bitmap;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.common.SimpleCacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.request.Postprocessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Array;

public final class u implements Postprocessor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17637a;

    /* renamed from: b  reason: collision with root package name */
    private int f17638b;

    /* renamed from: c  reason: collision with root package name */
    private float f17639c;

    /* renamed from: d  reason: collision with root package name */
    private a f17640d;

    public interface a {
    }

    public final String getName() {
        return "blurProcessor";
    }

    public final CacheKey getPostprocessorCacheKey() {
        if (!PatchProxy.isSupport(new Object[0], this, f17637a, false, 13689, new Class[0], CacheKey.class)) {
            return new SimpleCacheKey("blur_bitmap_processor");
        }
        return (CacheKey) PatchProxy.accessDispatch(new Object[0], this, f17637a, false, 13689, new Class[0], CacheKey.class);
    }

    public u(int i) {
        this.f17638b = 8;
    }

    public final CloseableReference<Bitmap> process(Bitmap bitmap, PlatformBitmapFactory platformBitmapFactory) {
        Bitmap bitmap2;
        CloseableReference<Bitmap> closeableReference;
        int i;
        int[] iArr;
        int i2;
        int i3;
        Bitmap bitmap3 = bitmap;
        PlatformBitmapFactory platformBitmapFactory2 = platformBitmapFactory;
        if (PatchProxy.isSupport(new Object[]{bitmap3, platformBitmapFactory2}, this, f17637a, false, 13688, new Class[]{Bitmap.class, PlatformBitmapFactory.class}, CloseableReference.class)) {
            return (CloseableReference) PatchProxy.accessDispatch(new Object[]{bitmap3, platformBitmapFactory2}, this, f17637a, false, 13688, new Class[]{Bitmap.class, PlatformBitmapFactory.class}, CloseableReference.class);
        }
        float f2 = 0.1f;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width < 100 || height < 100) {
            f2 = 0.6f;
        } else if (width < 200 || height < 200) {
            f2 = 0.3f;
        }
        int round = Math.round(((float) width) * f2);
        int round2 = Math.round(((float) height) * f2);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap3, round, round2, false);
        if (this.f17639c != 0.0f) {
            float f3 = (float) round;
            float f4 = (float) round2;
            if (Math.abs((f3 / f4) - ((float) this.f17638b)) > 0.2f) {
                int i4 = (int) (f3 / this.f17639c);
                if (i4 > round2) {
                    i3 = (int) (f4 * this.f17639c);
                    i2 = round2;
                } else {
                    i2 = i4;
                    i3 = round;
                }
                Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap, (round - i3) >> 1, (round2 - i2) >> 1, i3, i2);
                createScaledBitmap.recycle();
                createScaledBitmap = createBitmap;
                round = i3;
                round2 = i2;
            }
        }
        CloseableReference<Bitmap> createBitmap2 = platformBitmapFactory2.createBitmap(round, round2);
        Bitmap bitmap4 = (Bitmap) createBitmap2.get();
        int i5 = this.f17638b;
        if (PatchProxy.isSupport(new Object[]{createScaledBitmap, bitmap4, Integer.valueOf(i5)}, null, i.f17612a, true, 13637, new Class[]{Bitmap.class, Bitmap.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{createScaledBitmap, bitmap4, Integer.valueOf(i5)}, null, i.f17612a, true, 13637, new Class[]{Bitmap.class, Bitmap.class, Integer.TYPE}, Void.TYPE);
        } else if (i5 > 0) {
            int width2 = bitmap4.getWidth();
            int height2 = bitmap4.getHeight();
            int i6 = width2 * height2;
            int[] iArr2 = new int[i6];
            createScaledBitmap.getPixels(iArr2, 0, width2, 0, 0, width2, height2);
            int i7 = width2 - 1;
            int i8 = height2 - 1;
            int i9 = i5 + i5 + 1;
            int[] iArr3 = new int[i6];
            int[] iArr4 = new int[i6];
            int[] iArr5 = new int[i6];
            int[] iArr6 = new int[Math.max(width2, height2)];
            int i10 = (i9 + 1) >> 1;
            int i11 = i10 * i10;
            int i12 = i11 * 256;
            closeableReference = createBitmap2;
            int[] iArr7 = new int[i12];
            bitmap2 = createScaledBitmap;
            for (int i13 = 0; i13 < i12; i13++) {
                iArr7[i13] = i13 / i11;
            }
            int[][] iArr8 = (int[][]) Array.newInstance(int.class, new int[]{i9, 3});
            int i14 = i5 + 1;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            while (i15 < height2) {
                Bitmap bitmap5 = bitmap4;
                int i18 = -i5;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                while (i18 <= i5) {
                    int i28 = height2;
                    int i29 = i8;
                    int i30 = iArr2[i16 + Math.min(i7, Math.max(i18, 0))];
                    int[] iArr9 = iArr8[i18 + i5];
                    iArr9[0] = (i30 & 16711680) >> 16;
                    iArr9[1] = (i30 & 65280) >> 8;
                    iArr9[2] = i30 & 255;
                    int abs = i14 - Math.abs(i18);
                    i19 += iArr9[0] * abs;
                    i20 += iArr9[1] * abs;
                    i21 += iArr9[2] * abs;
                    if (i18 > 0) {
                        i22 += iArr9[0];
                        i23 += iArr9[1];
                        i24 += iArr9[2];
                    } else {
                        i25 += iArr9[0];
                        i26 += iArr9[1];
                        i27 += iArr9[2];
                    }
                    i18++;
                    height2 = i28;
                    i8 = i29;
                }
                int i31 = height2;
                int i32 = i8;
                int i33 = i5;
                int i34 = 0;
                while (i34 < width2) {
                    iArr3[i16] = iArr7[i19];
                    iArr4[i16] = iArr7[i20];
                    iArr5[i16] = iArr7[i21];
                    int i35 = i19 - i25;
                    int i36 = i20 - i26;
                    int i37 = i21 - i27;
                    int[] iArr10 = iArr8[((i33 - i5) + i9) % i9];
                    int i38 = i25 - iArr10[0];
                    int i39 = i26 - iArr10[1];
                    int i40 = i27 - iArr10[2];
                    if (i15 == 0) {
                        iArr = iArr7;
                        iArr6[i34] = Math.min(i34 + i5 + 1, i7);
                    } else {
                        iArr = iArr7;
                    }
                    int i41 = iArr2[i17 + iArr6[i34]];
                    iArr10[0] = (i41 & 16711680) >> 16;
                    iArr10[1] = (i41 & 65280) >> 8;
                    iArr10[2] = i41 & 255;
                    int i42 = i22 + iArr10[0];
                    int i43 = i23 + iArr10[1];
                    int i44 = i24 + iArr10[2];
                    i19 = i35 + i42;
                    i20 = i36 + i43;
                    i21 = i37 + i44;
                    i33 = (i33 + 1) % i9;
                    int[] iArr11 = iArr8[i33 % i9];
                    i25 = i38 + iArr11[0];
                    i26 = i39 + iArr11[1];
                    i27 = i40 + iArr11[2];
                    i22 = i42 - iArr11[0];
                    i23 = i43 - iArr11[1];
                    i24 = i44 - iArr11[2];
                    i16++;
                    i34++;
                    iArr7 = iArr;
                }
                int[] iArr12 = iArr7;
                i17 += width2;
                i15++;
                bitmap4 = bitmap5;
                height2 = i31;
                i8 = i32;
            }
            int[] iArr13 = iArr7;
            Bitmap bitmap6 = bitmap4;
            int i45 = height2;
            int i46 = i8;
            int i47 = 0;
            while (i47 < width2) {
                int i48 = -i5;
                int i49 = i48 * width2;
                int i50 = 0;
                int i51 = 0;
                int i52 = 0;
                int i53 = 0;
                int i54 = 0;
                int i55 = 0;
                int i56 = 0;
                int i57 = 0;
                int i58 = 0;
                while (i48 <= i5) {
                    int[] iArr14 = iArr6;
                    int max = Math.max(0, i49) + i47;
                    int[] iArr15 = iArr8[i48 + i5];
                    iArr15[0] = iArr3[max];
                    iArr15[1] = iArr4[max];
                    iArr15[2] = iArr5[max];
                    int abs2 = i14 - Math.abs(i48);
                    i50 += iArr3[max] * abs2;
                    i51 += iArr4[max] * abs2;
                    i52 += iArr5[max] * abs2;
                    if (i48 > 0) {
                        i53 += iArr15[0];
                        i54 += iArr15[1];
                        i55 += iArr15[2];
                    } else {
                        i56 += iArr15[0];
                        i57 += iArr15[1];
                        i58 += iArr15[2];
                    }
                    int i59 = i46;
                    if (i48 < i59) {
                        i49 += width2;
                    }
                    i48++;
                    i46 = i59;
                    iArr6 = iArr14;
                }
                int[] iArr16 = iArr6;
                int i60 = i46;
                int i61 = i54;
                int i62 = i55;
                int i63 = i45;
                int i64 = 0;
                int i65 = i5;
                int i66 = i53;
                int i67 = i52;
                int i68 = i51;
                int i69 = i50;
                int i70 = i47;
                while (i64 < i63) {
                    iArr2[i70] = (iArr2[i70] & -16777216) | (iArr13[i69] << 16) | (iArr13[i68] << 8) | iArr13[i67];
                    int i71 = i69 - i56;
                    int i72 = i68 - i57;
                    int i73 = i67 - i58;
                    int[] iArr17 = iArr8[((i65 - i5) + i9) % i9];
                    int i74 = i56 - iArr17[0];
                    int i75 = i57 - iArr17[1];
                    int i76 = i58 - iArr17[2];
                    if (i47 == 0) {
                        i = i5;
                        iArr16[i64] = Math.min(i64 + i14, i60) * width2;
                    } else {
                        i = i5;
                    }
                    int i77 = iArr16[i64] + i47;
                    iArr17[0] = iArr3[i77];
                    iArr17[1] = iArr4[i77];
                    iArr17[2] = iArr5[i77];
                    int i78 = i66 + iArr17[0];
                    int i79 = i61 + iArr17[1];
                    int i80 = i62 + iArr17[2];
                    i69 = i71 + i78;
                    i68 = i72 + i79;
                    i67 = i73 + i80;
                    i65 = (i65 + 1) % i9;
                    int[] iArr18 = iArr8[i65];
                    i56 = i74 + iArr18[0];
                    i57 = i75 + iArr18[1];
                    i58 = i76 + iArr18[2];
                    i66 = i78 - iArr18[0];
                    i61 = i79 - iArr18[1];
                    i62 = i80 - iArr18[2];
                    i70 += width2;
                    i64++;
                    i5 = i;
                }
                int i81 = i5;
                i47++;
                i45 = i63;
                i46 = i60;
                iArr6 = iArr16;
            }
            bitmap6.setPixels(iArr2, 0, width2, 0, 0, width2, i45);
            bitmap2.recycle();
            return closeableReference;
        }
        closeableReference = createBitmap2;
        bitmap2 = createScaledBitmap;
        bitmap2.recycle();
        return closeableReference;
    }

    public u(int i, float f2, a aVar) {
        this.f17639c = f2;
        this.f17638b = i;
        this.f17640d = null;
    }
}

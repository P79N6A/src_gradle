package com.ss.android.ugc.aweme.shortvideo.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71133a;

    public static int a(String str) {
        String str2 = str;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f71133a, true, 80857, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, null, f71133a, true, 80857, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        try {
            int attributeInt = new ExifInterface(str2).getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                i = 180;
            } else if (attributeInt == 6) {
                i = 90;
            } else if (attributeInt == 8) {
                i = 270;
            }
        } catch (IOException unused) {
        }
        return i;
    }

    public static Bitmap a(String str, int i, int i2) {
        int i3;
        int i4;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f71133a, true, 80856, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f71133a, true, 80856, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Bitmap.class);
        }
        int i5 = 100;
        if (i <= 0) {
            i3 = 100;
        } else {
            i3 = i;
        }
        if (i2 > 0) {
            i5 = i2;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str2, options);
        options.inJustDecodeBounds = false;
        int i6 = options.outWidth;
        int i7 = options.outHeight;
        if (i6 > i7 && i6 > i3) {
            i4 = options.outWidth / i3;
        } else if (i6 >= i7 || i7 <= i5) {
            i4 = 1;
        } else {
            i4 = options.outHeight / i5;
        }
        if (i4 <= 0) {
            i4 = 1;
        }
        options.inSampleSize = i4;
        return BitmapFactory.decodeFile(str2, options);
    }
}

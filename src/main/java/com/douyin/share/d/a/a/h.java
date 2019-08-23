package com.douyin.share.d.a.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.bytedance.common.utility.BitmapUtils;
import com.douyin.share.R$drawable;
import com.douyin.share.i;
import com.ss.android.ugc.bytex.a.a.a;
import java.io.ByteArrayOutputStream;

public final class h extends i {
    public final byte[] a(String str) {
        Bitmap bitmap;
        Bitmap bitmap2 = null;
        if (!TextUtils.isEmpty(str)) {
            bitmap = BitmapUtils.getBitmapFromSD(str, 720, 720, Bitmap.Config.ARGB_8888);
        } else {
            bitmap = null;
        }
        if (bitmap == null) {
            Drawable a2 = a.a(this.f23232a.getResources(), R$drawable.icon);
            if (!(a2 instanceof BitmapDrawable)) {
                return new byte[0];
            }
            bitmap = Bitmap.createScaledBitmap(((BitmapDrawable) a2).getBitmap(), 100, 100, false);
            if (bitmap == null) {
                return new byte[0];
            }
        }
        if (bitmap != null) {
            Bitmap.Config config = Bitmap.Config.RGB_565;
            int ceil = (int) Math.ceil(Math.sqrt(Math.ceil((double) ((((float) a.a(bitmap)) * 1.0f) / 2097152.0f))));
            if (ceil == 0) {
                ceil = 1;
            }
            if (ceil == 1) {
                bitmap2 = bitmap;
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = ceil;
                options.inPurgeable = true;
                options.inPreferredConfig = config;
                bitmap2 = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
            }
        }
        if (bitmap2 == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        bitmap2.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream2);
        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
        try {
            byteArrayOutputStream2.close();
        } catch (Exception unused) {
        }
        bitmap2.recycle();
        return byteArray2;
    }

    public h(Context context, String str) {
        super(context, str);
    }
}

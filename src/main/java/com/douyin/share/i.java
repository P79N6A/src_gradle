package com.douyin.share;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.StringUtils;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.common.c.b;
import com.ss.android.ugc.bytex.a.a.a;
import java.io.ByteArrayOutputStream;

public class i {

    /* renamed from: a  reason: collision with root package name */
    protected final Context f23232a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f23233b;

    /* renamed from: c  reason: collision with root package name */
    public String f23234c;

    /* renamed from: d  reason: collision with root package name */
    public String f23235d;

    private String c() {
        b bVar = new b(this.f23232a);
        bVar.e();
        return bVar.f();
    }

    public final byte[] a() {
        if (this.f23233b == null || this.f23233b.length <= 0) {
            this.f23233b = a(b());
        }
        return this.f23233b;
    }

    public final String b() {
        if (StringUtils.isEmpty(this.f23235d)) {
            this.f23235d = c.a(this.f23232a, this.f23234c);
        }
        if (StringUtils.isEmpty(this.f23235d)) {
            this.f23235d = c();
        }
        return this.f23235d;
    }

    private byte[] a(String str) {
        Bitmap bitmapFromSD = BitmapUtils.getBitmapFromSD(str, 200, 200, Bitmap.Config.ARGB_8888);
        if (bitmapFromSD == null) {
            Drawable a2 = a.a(this.f23232a.getResources(), R$drawable.icon);
            if (!(a2 instanceof BitmapDrawable)) {
                return new byte[0];
            }
            bitmapFromSD = Bitmap.createScaledBitmap(((BitmapDrawable) a2).getBitmap(), 100, 100, false);
            if (bitmapFromSD == null) {
                return new byte[0];
            }
        }
        Bitmap compressBitmap = BitmapUtils.compressBitmap(bitmapFromSD, 26214);
        if (compressBitmap == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        compressBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (Exception unused) {
        }
        compressBitmap.recycle();
        return byteArray;
    }

    public i(Context context, String str) {
        this.f23232a = context.getApplicationContext();
        this.f23234c = str;
    }
}

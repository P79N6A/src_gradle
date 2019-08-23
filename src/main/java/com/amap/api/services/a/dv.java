package com.amap.api.services.a;

import android.content.Context;
import android.os.Build;
import com.taobao.android.dexposed.ClassUtils;
import java.io.ByteArrayOutputStream;

public class dv extends dx {

    /* renamed from: a  reason: collision with root package name */
    public static int f6852a = 13;

    /* renamed from: b  reason: collision with root package name */
    public static int f6853b = 6;

    /* renamed from: e  reason: collision with root package name */
    private Context f6854e;

    /* access modifiers changed from: protected */
    public byte[] a(byte[] bArr) {
        byte[] a2 = a(this.f6854e);
        byte[] bArr2 = new byte[(a2.length + bArr.length)];
        System.arraycopy(a2, 0, bArr2, 0, a2.length);
        System.arraycopy(bArr, 0, bArr2, a2.length, bArr.length);
        return bArr2;
    }

    private byte[] a(Context context) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[0];
        try {
            bo.a(byteArrayOutputStream, "1.2." + f6852a + ClassUtils.PACKAGE_SEPARATOR + f6853b);
            bo.a(byteArrayOutputStream, "Android");
            bo.a(byteArrayOutputStream, bj.t(context));
            bo.a(byteArrayOutputStream, bj.l(context));
            bo.a(byteArrayOutputStream, bj.h(context));
            bo.a(byteArrayOutputStream, Build.MANUFACTURER);
            bo.a(byteArrayOutputStream, Build.MODEL);
            bo.a(byteArrayOutputStream, Build.DEVICE);
            bo.a(byteArrayOutputStream, bj.u(context));
            bo.a(byteArrayOutputStream, bf.c(context));
            bo.a(byteArrayOutputStream, bf.d(context));
            bo.a(byteArrayOutputStream, bf.f(context));
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable unused) {
                return byteArray;
            }
        } catch (Throwable unused2) {
        }
        return bArr;
        throw th;
    }

    public dv(Context context, dx dxVar) {
        super(dxVar);
        this.f6854e = context;
    }
}

package com.loc;

import android.content.Context;
import android.os.Build;
import com.google.a.a.a.a.a.a;
import com.taobao.android.dexposed.ClassUtils;
import java.io.ByteArrayOutputStream;

public final class bb extends bd {

    /* renamed from: a  reason: collision with root package name */
    public static int f25514a = 13;

    /* renamed from: b  reason: collision with root package name */
    public static int f25515b = 6;

    /* renamed from: e  reason: collision with root package name */
    private Context f25516e;

    public bb(Context context, bd bdVar) {
        super(bdVar);
        this.f25516e = context;
    }

    private static byte[] a(Context context) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[0];
        try {
            di.a(byteArrayOutputStream, "1.2." + f25514a + ClassUtils.PACKAGE_SEPARATOR + f25515b);
            di.a(byteArrayOutputStream, "Android");
            di.a(byteArrayOutputStream, dc.u(context));
            di.a(byteArrayOutputStream, dc.l(context));
            di.a(byteArrayOutputStream, dc.h(context));
            di.a(byteArrayOutputStream, Build.MANUFACTURER);
            di.a(byteArrayOutputStream, Build.MODEL);
            di.a(byteArrayOutputStream, Build.DEVICE);
            di.a(byteArrayOutputStream, dc.v(context));
            di.a(byteArrayOutputStream, cy.c(context));
            di.a(byteArrayOutputStream, cy.d(context));
            di.a(byteArrayOutputStream, cy.f(context));
            byteArrayOutputStream.write(new byte[]{0});
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                a.b(th);
                return byteArray;
            }
        } catch (Throwable th2) {
            a.b(th2);
        }
        return bArr;
        throw th;
    }

    /* access modifiers changed from: protected */
    public final byte[] a(byte[] bArr) {
        byte[] a2 = a(this.f25516e);
        byte[] bArr2 = new byte[(a2.length + bArr.length)];
        System.arraycopy(a2, 0, bArr2, 0, a2.length);
        System.arraycopy(bArr, 0, bArr2, a2.length, bArr.length);
        return bArr2;
    }
}

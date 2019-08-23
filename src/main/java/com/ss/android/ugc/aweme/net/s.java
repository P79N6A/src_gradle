package com.ss.android.ugc.aweme.net;

import android.text.TextUtils;
import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.utils.cv;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57010a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f57011b = new ConcurrentHashMap();

    s() {
    }

    private byte[] a(InputStream inputStream) throws IOException {
        InputStream inputStream2 = inputStream;
        if (PatchProxy.isSupport(new Object[]{inputStream2}, this, f57010a, false, 60748, new Class[]{InputStream.class}, byte[].class)) {
            return (byte[]) PatchProxy.accessDispatch(new Object[]{inputStream2}, this, f57010a, false, 60748, new Class[]{InputStream.class}, byte[].class);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream2.read(bArr);
            if (read >= 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f57010a, false, 60746, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f57010a, false, 60746, new Class[]{String.class}, String.class);
        }
        if (str2.contains("%%secretKey=")) {
            String substring = str2.substring(0, str2.indexOf("%%secretKey="));
            String substring2 = str2.substring(str2.lastIndexOf("=") + 1, str.length());
            if (!TextUtils.isEmpty(substring2)) {
                this.f57011b.put(substring, substring2);
            }
            str2 = substring;
        }
        return str2;
    }

    /* access modifiers changed from: package-private */
    public final Pair<InputStream, Long> a(InputStream inputStream, String str, long j) throws Exception {
        long j2;
        ByteArrayInputStream byteArrayInputStream;
        Pair pair;
        byte[] bArr;
        String str2 = str;
        long j3 = j;
        if (PatchProxy.isSupport(new Object[]{inputStream, str2, new Long(j3)}, this, f57010a, false, 60747, new Class[]{InputStream.class, String.class, Long.TYPE}, Pair.class)) {
            return (Pair) PatchProxy.accessDispatch(new Object[]{inputStream, str2, new Long(j3)}, this, f57010a, false, 60747, new Class[]{InputStream.class, String.class, Long.TYPE}, Pair.class);
        }
        if (this.f57011b.containsKey(str2)) {
            String str3 = this.f57011b.get(str2);
            try {
                byte[] a2 = a(inputStream);
                this.f57011b.remove(str2);
                if (a2 != null) {
                    if (PatchProxy.isSupport(new Object[]{a2, str3}, null, cv.f75700a, true, 88431, new Class[]{byte[].class, String.class}, Pair.class)) {
                        Object[] objArr = {a2, str3};
                        Object[] objArr2 = objArr;
                        pair = (Pair) PatchProxy.accessDispatch(objArr2, null, cv.f75700a, true, 88431, new Class[]{byte[].class, String.class}, Pair.class);
                    } else {
                        byte[] a3 = cv.a(str3);
                        byte[] copyOfRange = Arrays.copyOfRange(a2, 12, a2.length);
                        byte[] copyOfRange2 = Arrays.copyOfRange(a2, 0, 12);
                        if (PatchProxy.isSupport(new Object[]{copyOfRange2, a3, copyOfRange}, null, cv.f75700a, true, 88432, new Class[]{byte[].class, byte[].class, byte[].class}, byte[].class)) {
                            Object[] objArr3 = {copyOfRange2, a3, copyOfRange};
                            Object[] objArr4 = objArr3;
                            bArr = (byte[]) PatchProxy.accessDispatch(objArr4, null, cv.f75700a, true, 88432, new Class[]{byte[].class, byte[].class, byte[].class}, byte[].class);
                        } else {
                            IvParameterSpec ivParameterSpec = new IvParameterSpec(copyOfRange2);
                            SecretKeySpec secretKeySpec = new SecretKeySpec(a3, "AES");
                            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
                            instance.init(2, secretKeySpec, ivParameterSpec);
                            bArr = instance.doFinal(copyOfRange);
                        }
                        pair = new Pair(bArr, Integer.valueOf(bArr.length));
                    }
                    ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream((byte[]) pair.first);
                    j2 = (long) ((Integer) pair.second).intValue();
                    byteArrayInputStream = byteArrayInputStream2;
                    return new Pair<>(byteArrayInputStream, Long.valueOf(j2));
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                this.f57011b.remove(str2);
                throw th2;
            }
        }
        byteArrayInputStream = inputStream;
        j2 = j3;
        return new Pair<>(byteArrayInputStream, Long.valueOf(j2));
    }
}

package com.bytedance.frameworks.plugin.f;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.bytedance.frameworks.plugin.e;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.security.cert.Certificate;
import java.util.HashSet;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private static final String f2261a = "i";

    /* renamed from: b  reason: collision with root package name */
    private static final Object f2262b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static WeakReference<byte[]> f2263c;

    /* renamed from: d  reason: collision with root package name */
    private static WeakReference<Signature[]> f2264d;

    public static boolean a(String str) {
        Signature[] signatureArr;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Signature[] a2 = a(str, true);
        if (a2 == null || a2.length == 0) {
            PackageInfo packageArchiveInfo = e.a().getPackageManager().getPackageArchiveInfo(str, 64);
            if (packageArchiveInfo != null) {
                a2 = packageArchiveInfo.signatures;
            }
        }
        if (a2 == null || a2.length == 0) {
            throw new RuntimeException("获取插件签名失败 apkPath=" + str + " exists=" + new File(str).exists());
        }
        if (f2264d != null) {
            signatureArr = (Signature[]) f2264d.get();
        } else {
            signatureArr = null;
        }
        if (signatureArr == null || signatureArr.length == 0) {
            try {
                PackageInfo packageInfo = e.a().getPackageManager().getPackageInfo(e.a().getPackageName(), 64);
                Signature[] signatureArr2 = packageInfo.signatures;
                f2264d = new WeakReference<>(packageInfo.signatures);
                signatureArr = signatureArr2;
            } catch (PackageManager.NameNotFoundException unused) {
                throw new RuntimeException("获取宿主签名失败");
            }
        }
        if (a(signatureArr, a2)) {
            return true;
        }
        return false;
    }

    private static boolean a(Signature[] signatureArr, Signature[] signatureArr2) {
        if (signatureArr == null || signatureArr2 == null) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (Signature add : signatureArr) {
            hashSet.add(add);
        }
        HashSet hashSet2 = new HashSet();
        for (Signature add2 : signatureArr2) {
            hashSet2.add(add2);
        }
        if (hashSet.equals(hashSet2)) {
            return true;
        }
        return false;
    }

    private static Signature[] a(String str, boolean z) {
        WeakReference<byte[]> weakReference;
        byte[] bArr;
        synchronized (f2262b) {
            weakReference = f2263c;
            if (weakReference != null) {
                f2263c = null;
                bArr = (byte[]) weakReference.get();
            } else {
                bArr = null;
            }
            if (bArr == null) {
                bArr = new byte[8192];
                weakReference = new WeakReference<>(bArr);
            }
        }
        try {
            JarFile jarFile = new JarFile(str);
            Certificate[] a2 = a(jarFile, jarFile.getJarEntry("AndroidManifest.xml"), bArr);
            if (a2 == null) {
                jarFile.close();
                return null;
            }
            jarFile.close();
            synchronized (f2262b) {
                f2263c = weakReference;
            }
            if (a2 != null) {
                if (a2.length > 0) {
                    int length = a2.length;
                    Signature[] signatureArr = new Signature[a2.length];
                    for (int i = 0; i < length; i++) {
                        signatureArr[i] = new Signature(a2[i].getEncoded());
                    }
                    return signatureArr;
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Certificate[] a(JarFile jarFile, JarEntry jarEntry, byte[] bArr) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(jarFile.getInputStream(jarEntry));
            do {
            } while (bufferedInputStream.read(bArr, 0, bArr.length) != -1);
            bufferedInputStream.close();
            if (jarEntry != null) {
                return jarEntry.getCertificates();
            }
            return null;
        } catch (IOException | RuntimeException unused) {
            return null;
        }
    }
}

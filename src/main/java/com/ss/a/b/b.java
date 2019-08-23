package com.ss.a.b;

import com.ss.a.b.c;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.zip.ZipFile;

public final class b {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void a(String str, int i) {
        Class[] clsArr;
        Object[] objArr;
        Object[] objArr2 = {493, -1, -1};
        try {
            Class<?> cls = Class.forName("android.os.FileUtils");
            if (objArr2.length > 0) {
                clsArr = new Class[objArr2.length];
                for (int i2 = 0; i2 < objArr2.length; i2++) {
                    Object obj = objArr2[i2];
                    clsArr[i2] = (obj == null || !(obj instanceof c.a)) ? obj == null ? null : obj.getClass() : ((c.a) obj).f2379a;
                }
            } else {
                clsArr = null;
            }
            Method a2 = c.a(cls, str, clsArr);
            if (objArr2.length > 0) {
                objArr = new Object[objArr2.length];
                for (int i3 = 0; i3 < objArr2.length; i3++) {
                    Object obj2 = objArr2[i3];
                    if (obj2 == null || !(obj2 instanceof c.a)) {
                        objArr[i3] = obj2;
                    } else {
                        objArr[i3] = ((c.a) obj2).f2380b;
                    }
                }
            } else {
                objArr = null;
            }
            a2.invoke(null, objArr);
        } catch (Exception unused) {
        }
    }
}

package com.loc;

import android.content.Context;
import android.text.TextUtils;
import com.google.a.a.a.a.a.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;

public final class db extends dg {

    /* renamed from: a  reason: collision with root package name */
    public boolean f25779a;

    public db(Context context, String str, String str2, String str3) {
        super(context, str, str2, str3);
    }

    private static void a(File file, File file2) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(new byte[32]);
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
            byte[] bArr = new byte[1024];
            int i = 0;
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    if (read == 1024) {
                        randomAccessFile.seek((long) i);
                        randomAccessFile.write(bArr);
                    } else {
                        byte[] bArr2 = new byte[read];
                        System.arraycopy(bArr, 0, bArr2, 0, read);
                        randomAccessFile.seek((long) i);
                        randomAccessFile.write(bArr2);
                    }
                    i += read;
                } else {
                    fileInputStream.close();
                    randomAccessFile.close();
                    file.delete();
                    return;
                }
            }
        } catch (Throwable th) {
            a.b(th);
        }
    }

    public final void a() {
        if (this.f25791b != null && !TextUtils.isEmpty(this.f25791b.c()) && this.f25791b.c().endsWith("png") && this.f25791b.c().contains(di.a(this.g)) && ((this.f25779a || !di.b(this.g)) && !new File(this.f25794e).exists())) {
            start();
        }
    }

    public final void d() {
        try {
            if (this.f25792c != null) {
                this.f25792c.close();
            }
            String a2 = de.a(this.f25793d);
            if (a2 == null || !a2.equalsIgnoreCase(this.f25795f)) {
                b();
                return;
            }
            File file = new File(this.f25794e);
            if (file.exists()) {
                b();
                return;
            }
            File file2 = new File(this.f25793d);
            if (file2.exists()) {
                a(file2, file);
                b();
            }
        } catch (Throwable th) {
            b();
            File file3 = new File(this.f25794e);
            if (file3.exists()) {
                file3.delete();
            }
            f.a(th, "sdl", "ofs");
        }
    }
}

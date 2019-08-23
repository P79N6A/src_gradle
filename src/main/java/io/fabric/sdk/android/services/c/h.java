package io.fabric.sdk.android.services.c;

import android.content.Context;
import io.fabric.sdk.android.services.b.i;
import io.fabric.sdk.android.services.b.u;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class h implements c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f83225a;

    /* renamed from: b  reason: collision with root package name */
    private final File f83226b;

    /* renamed from: c  reason: collision with root package name */
    private final String f83227c;

    /* renamed from: d  reason: collision with root package name */
    private final File f83228d;

    /* renamed from: e  reason: collision with root package name */
    private u f83229e = new u(this.f83228d);

    /* renamed from: f  reason: collision with root package name */
    private File f83230f = new File(this.f83226b, this.f83227c);

    public final int a() {
        return this.f83229e.a();
    }

    public final boolean b() {
        return this.f83229e.b();
    }

    public final List<File> c() {
        return Arrays.asList(this.f83230f.listFiles());
    }

    public final void d() {
        try {
            this.f83229e.close();
        } catch (IOException unused) {
        }
        this.f83228d.delete();
    }

    public OutputStream a(File file) throws IOException {
        return new FileOutputStream(file);
    }

    public final List<File> a(int i) {
        ArrayList arrayList = new ArrayList();
        for (File add : this.f83230f.listFiles()) {
            arrayList.add(add);
            if (arrayList.size() > 0) {
                break;
            }
        }
        return arrayList;
    }

    public final void a(List<File> list) {
        for (File next : list) {
            i.a(this.f83225a, String.format("deleting sent analytics file %s", new Object[]{next.getName()}));
            next.delete();
        }
    }

    public final void a(String str) throws IOException {
        FileInputStream fileInputStream;
        this.f83229e.close();
        File file = this.f83228d;
        File file2 = new File(this.f83230f, str);
        OutputStream outputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                OutputStream a2 = a(file2);
                try {
                    i.a((InputStream) fileInputStream, a2, new byte[1024]);
                    i.a((Closeable) fileInputStream, "Failed to close file input stream");
                    i.a((Closeable) a2, "Failed to close output stream");
                    file.delete();
                    this.f83229e = new u(this.f83228d);
                } catch (Throwable th) {
                    OutputStream outputStream2 = a2;
                    th = th;
                    outputStream = outputStream2;
                    i.a((Closeable) fileInputStream, "Failed to close file input stream");
                    i.a((Closeable) outputStream, "Failed to close output stream");
                    file.delete();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                i.a((Closeable) fileInputStream, "Failed to close file input stream");
                i.a((Closeable) outputStream, "Failed to close output stream");
                file.delete();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            i.a((Closeable) fileInputStream, "Failed to close file input stream");
            i.a((Closeable) outputStream, "Failed to close output stream");
            file.delete();
            throw th;
        }
    }

    public final void a(byte[] bArr) throws IOException {
        this.f83229e.a(bArr);
    }

    public final boolean a(int i, int i2) {
        if (this.f83229e.a() + 4 + i <= i2) {
            return true;
        }
        return false;
    }

    public h(Context context, File file, String str, String str2) throws IOException {
        this.f83225a = context;
        this.f83226b = file;
        this.f83227c = str2;
        this.f83228d = new File(this.f83226b, str);
        if (!this.f83230f.exists()) {
            this.f83230f.mkdirs();
        }
    }
}

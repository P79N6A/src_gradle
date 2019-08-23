package com.ss.android.ugc.aweme.im.sdk.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.RequestBody;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import okio.BufferedSink;

public final class av extends RequestBody {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52511a;

    /* renamed from: b  reason: collision with root package name */
    public a f52512b;

    /* renamed from: c  reason: collision with root package name */
    private File f52513c;

    public interface a {
        void a();

        void a(double d2);

        void a(String str);

        void a(Throwable th);
    }

    public final long contentLength() throws IOException {
        if (!PatchProxy.isSupport(new Object[0], this, f52511a, false, 53715, new Class[0], Long.TYPE)) {
            return this.f52513c.length();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f52511a, false, 53715, new Class[0], Long.TYPE)).longValue();
    }

    public final MediaType contentType() {
        if (!PatchProxy.isSupport(new Object[0], this, f52511a, false, 53714, new Class[0], MediaType.class)) {
            return MediaType.parse("multipart/form-data");
        }
        return (MediaType) PatchProxy.accessDispatch(new Object[0], this, f52511a, false, 53714, new Class[0], MediaType.class);
    }

    public final void writeTo(BufferedSink bufferedSink) throws IOException {
        if (PatchProxy.isSupport(new Object[]{bufferedSink}, this, f52511a, false, 53716, new Class[]{BufferedSink.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bufferedSink}, this, f52511a, false, 53716, new Class[]{BufferedSink.class}, Void.TYPE);
            return;
        }
        double length = (double) this.f52513c.length();
        byte[] bArr = new byte[4096];
        FileInputStream fileInputStream = new FileInputStream(this.f52513c);
        long j = 0;
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                if (this.f52512b != null) {
                    a aVar = this.f52512b;
                    double d2 = (double) j;
                    Double.isNaN(d2);
                    Double.isNaN(length);
                    aVar.a(d2 / length);
                }
                j += (long) read;
                bufferedSink.write(bArr, 0, read);
            } catch (Exception e2) {
                if (this.f52512b != null) {
                    this.f52512b.a((Throwable) e2);
                }
                return;
            } finally {
                fileInputStream.close();
            }
        }
        if (this.f52512b != null) {
            this.f52512b.a();
        }
    }

    public av(File file, a aVar) {
        this.f52513c = file;
        this.f52512b = aVar;
    }
}

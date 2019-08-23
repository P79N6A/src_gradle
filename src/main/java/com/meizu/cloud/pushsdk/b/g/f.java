package com.meizu.cloud.pushsdk.b.g;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f27006a = Logger.getLogger(f.class.getName());

    private f() {
    }

    public static b a(k kVar) {
        if (kVar != null) {
            return new g(kVar);
        }
        throw new IllegalArgumentException("sink == null");
    }

    public static c a(l lVar) {
        if (lVar != null) {
            return new h(lVar);
        }
        throw new IllegalArgumentException("source == null");
    }

    public static k a(OutputStream outputStream) {
        return a(outputStream, new m());
    }

    private static k a(final OutputStream outputStream, final m mVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        } else if (mVar != null) {
            return new k() {
                public final void a(a aVar, long j) throws IOException {
                    n.a(aVar.f26998b, 0, j);
                    while (j > 0) {
                        mVar.a();
                        i iVar = aVar.f26997a;
                        int min = (int) Math.min(j, (long) (iVar.f27020c - iVar.f27019b));
                        outputStream.write(iVar.f27018a, iVar.f27019b, min);
                        iVar.f27019b += min;
                        long j2 = (long) min;
                        j -= j2;
                        aVar.f26998b -= j2;
                        if (iVar.f27019b == iVar.f27020c) {
                            aVar.f26997a = iVar.a();
                            j.a(iVar);
                        }
                    }
                }

                public final void close() throws IOException {
                    outputStream.close();
                }

                public final void flush() throws IOException {
                    outputStream.flush();
                }

                public final String toString() {
                    return "sink(" + outputStream + ")";
                }
            };
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    public static l a(File file) throws FileNotFoundException {
        if (file != null) {
            return a((InputStream) new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static l a(InputStream inputStream) {
        return a(inputStream, new m());
    }

    private static l a(final InputStream inputStream, final m mVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (mVar != null) {
            return new l() {
                public final long b(a aVar, long j) throws IOException {
                    if (j < 0) {
                        throw new IllegalArgumentException("byteCount < 0: " + j);
                    } else if (j == 0) {
                        return 0;
                    } else {
                        mVar.a();
                        i c2 = aVar.c(1);
                        int read = inputStream.read(c2.f27018a, c2.f27020c, (int) Math.min(j, (long) (2048 - c2.f27020c)));
                        if (read == -1) {
                            return -1;
                        }
                        c2.f27020c += read;
                        long j2 = (long) read;
                        aVar.f26998b += j2;
                        return j2;
                    }
                }

                public final void close() throws IOException {
                    inputStream.close();
                }

                public final String toString() {
                    return "source(" + inputStream + ")";
                }
            };
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }
}

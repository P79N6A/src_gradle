package com.squareup.okhttp.internal;

import com.squareup.okhttp.HttpUrl;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import okio.Buffer;
import okio.ByteString;
import okio.Source;

public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    public static final String[] EMPTY_STRING_ARRAY = new String[0];
    public static final Charset UTF_8 = Charset.forName("UTF-8");

    private Util() {
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static <T> List<T> immutableList(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <K, V> Map<K, V> immutableMap(Map<K, V> map) {
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static void closeQuietly(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static <T> List<T> immutableList(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static boolean isAndroidGetsocknameError(AssertionError assertionError) {
        if (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) {
            return false;
        }
        return true;
    }

    public static String md5Hex(String str) {
        try {
            return ByteString.of(MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"))).hex();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static ByteString sha1(ByteString byteString) {
        try {
            return ByteString.of(MessageDigest.getInstance("SHA-1").digest(byteString.toByteArray()));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static String shaBase64(String str) {
        try {
            return ByteString.of(MessageDigest.getInstance("SHA-1").digest(str.getBytes("UTF-8"))).base64();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static void closeQuietly(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e2) {
                if (!isAndroidGetsocknameError(e2)) {
                    throw e2;
                }
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused) {
            }
        }
    }

    public static String hostHeader(HttpUrl httpUrl) {
        if (httpUrl.port() == HttpUrl.defaultPort(httpUrl.scheme())) {
            return httpUrl.host();
        }
        return httpUrl.host() + ":" + httpUrl.port();
    }

    public static String toHumanReadableAscii(String str) {
        int i;
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int codePointAt = str.codePointAt(i2);
            if (codePointAt <= 31 || codePointAt >= 127) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, 0, i2);
                while (i2 < length) {
                    int codePointAt2 = str.codePointAt(i2);
                    if (codePointAt2 <= 31 || codePointAt2 >= 127) {
                        i = 63;
                    } else {
                        i = codePointAt2;
                    }
                    buffer.writeUtf8CodePoint(i);
                    i2 += Character.charCount(codePointAt2);
                }
                return buffer.readUtf8();
            }
            i2 += Character.charCount(codePointAt);
        }
        return str;
    }

    public static ThreadFactory threadFactory(final String str, final boolean z) {
        return new ThreadFactory() {
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    public static String[] concat(String[] strArr, String str) {
        String[] strArr2 = new String[(strArr.length + 1)];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[strArr2.length - 1] = str;
        return strArr2;
    }

    public static boolean contains(String[] strArr, String str) {
        return Arrays.asList(strArr).contains(str);
    }

    public static boolean equal(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    public static void closeAll(Closeable closeable, Closeable closeable2) throws IOException {
        try {
            closeable.close();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            closeable2.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            } else if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            } else if (th instanceof Error) {
                throw ((Error) th);
            } else {
                throw new AssertionError(th);
            }
        }
    }

    private static <T> List<T> intersect(T[] tArr, T[] tArr2) {
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            int length = tArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                T t2 = tArr2[i];
                if (t.equals(t2)) {
                    arrayList.add(t2);
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }

    public static boolean discard(Source source, int i, TimeUnit timeUnit) {
        try {
            return skipAll(source, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static <T> T[] intersect(Class<T> cls, T[] tArr, T[] tArr2) {
        List intersect = intersect(tArr, tArr2);
        return intersect.toArray((Object[]) Array.newInstance(cls, intersect.size()));
    }

    public static boolean skipAll(Source source, int i, TimeUnit timeUnit) throws IOException {
        long j;
        long nanoTime = System.nanoTime();
        if (source.timeout().hasDeadline()) {
            j = source.timeout().deadlineNanoTime() - nanoTime;
        } else {
            j = Long.MAX_VALUE;
        }
        source.timeout().deadlineNanoTime(Math.min(j, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            Buffer buffer = new Buffer();
            while (source.read(buffer, 2048) != -1) {
                buffer.clear();
            }
            if (j == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
            } else {
                source.timeout().deadlineNanoTime(nanoTime + j);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (j == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
            } else {
                source.timeout().deadlineNanoTime(nanoTime + j);
            }
            return false;
        } catch (Throwable th) {
            if (j == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
            } else {
                source.timeout().deadlineNanoTime(nanoTime + j);
            }
            throw th;
        }
    }
}

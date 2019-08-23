package com.xiaomi.push;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class at {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f81838a = Pattern.compile("([^\\s;]+)(.*)");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f81839b = Pattern.compile("(.*?charset\\s*=[^a-zA-Z0-9]*)([-a-zA-Z0-9]+)(.*)", 2);

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f81840c = Pattern.compile("(\\<\\?xml\\s+.*?encoding\\s*=[^a-zA-Z0-9]*)([-a-zA-Z0-9]+)(.*)", 2);

    public static final class a extends FilterInputStream {

        /* renamed from: a  reason: collision with root package name */
        private boolean f81841a;

        public a(InputStream inputStream) {
            super(inputStream);
        }

        public final int read(byte[] bArr, int i, int i2) {
            if (!this.f81841a) {
                int read = super.read(bArr, i, i2);
                if (read != -1) {
                    return read;
                }
            }
            this.f81841a = true;
            return -1;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f81842a;

        /* renamed from: a  reason: collision with other field name */
        public Map<String, String> f160a;

        public String toString() {
            return String.format("resCode = %1$d, headers = %2$s", new Object[]{Integer.valueOf(this.f81842a), this.f160a.toString()});
        }
    }

    public static int a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return -1;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return -1;
            }
            return activeNetworkInfo.getType();
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static NetworkInfo m84a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return null;
            }
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.io.OutputStream} */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r4 = new java.io.BufferedReader(new java.io.InputStreamReader(new com.xiaomi.push.at.a(r4.getErrorStream())));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e7, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e8, code lost:
        r5 = r4;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00eb, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ec, code lost:
        r5 = r4;
        r4 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0096 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e7 A[ExcHandler: all (r4v12 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:5:0x001c] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00eb A[ExcHandler: Throwable (r4v10 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0006] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.xiaomi.push.ar a(android.content.Context r4, java.lang.String r5, java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7, java.lang.String r8) {
        /*
            com.xiaomi.push.ar r0 = new com.xiaomi.push.ar
            r0.<init>()
            r1 = 0
            java.net.URL r2 = a((java.lang.String) r5)     // Catch:{ IOException -> 0x00f8, Throwable -> 0x00eb, all -> 0x00e7 }
            java.net.HttpURLConnection r4 = a((android.content.Context) r4, (java.net.URL) r2)     // Catch:{ IOException -> 0x00f8, Throwable -> 0x00eb, all -> 0x00e7 }
            r2 = 10000(0x2710, float:1.4013E-41)
            r4.setConnectTimeout(r2)     // Catch:{ IOException -> 0x00f8, Throwable -> 0x00eb, all -> 0x00e7 }
            r2 = 15000(0x3a98, float:2.102E-41)
            r4.setReadTimeout(r2)     // Catch:{ IOException -> 0x00f8, Throwable -> 0x00eb, all -> 0x00e7 }
            if (r6 != 0) goto L_0x001c
            java.lang.String r6 = "GET"
        L_0x001c:
            r4.setRequestMethod(r6)     // Catch:{ IOException -> 0x00f8, Throwable -> 0x00eb, all -> 0x00e7 }
            if (r7 == 0) goto L_0x003f
            java.util.Set r6 = r7.keySet()     // Catch:{ IOException -> 0x00f8, Throwable -> 0x00eb, all -> 0x00e7 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ IOException -> 0x00f8, Throwable -> 0x00eb, all -> 0x00e7 }
        L_0x0029:
            boolean r2 = r6.hasNext()     // Catch:{ IOException -> 0x00f8, Throwable -> 0x00eb, all -> 0x00e7 }
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r6.next()     // Catch:{ IOException -> 0x00f8, Throwable -> 0x00eb, all -> 0x00e7 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException -> 0x00f8, Throwable -> 0x00eb, all -> 0x00e7 }
            java.lang.Object r3 = r7.get(r2)     // Catch:{ IOException -> 0x00f8, Throwable -> 0x00eb, all -> 0x00e7 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x00f8, Throwable -> 0x00eb, all -> 0x00e7 }
            r4.setRequestProperty(r2, r3)     // Catch:{ IOException -> 0x00f8, Throwable -> 0x00eb, all -> 0x00e7 }
            goto L_0x0029
        L_0x003f:
            boolean r6 = android.text.TextUtils.isEmpty(r8)     // Catch:{ IOException -> 0x00f8, Throwable -> 0x00eb, all -> 0x00e7 }
            r7 = 0
            r2 = 1
            if (r6 != 0) goto L_0x006a
            r4.setDoOutput(r2)     // Catch:{ IOException -> 0x00f8, Throwable -> 0x00eb, all -> 0x00e7 }
            byte[] r6 = r8.getBytes()     // Catch:{ IOException -> 0x00f8, Throwable -> 0x00eb, all -> 0x00e7 }
            java.io.OutputStream r8 = r4.getOutputStream()     // Catch:{ IOException -> 0x00f8, Throwable -> 0x00eb, all -> 0x00e7 }
            int r3 = r6.length     // Catch:{ IOException -> 0x0067, Throwable -> 0x0061 }
            r8.write(r6, r7, r3)     // Catch:{ IOException -> 0x0067, Throwable -> 0x0061 }
            r8.flush()     // Catch:{ IOException -> 0x0067, Throwable -> 0x0061 }
            r8.close()     // Catch:{ IOException -> 0x0067, Throwable -> 0x0061 }
            goto L_0x006a
        L_0x005d:
            r4 = move-exception
            r5 = r4
            goto L_0x0121
        L_0x0061:
            r4 = move-exception
            r5 = r4
            r4 = r1
            r1 = r8
            goto L_0x00ee
        L_0x0067:
            r4 = move-exception
            goto L_0x00fa
        L_0x006a:
            int r6 = r4.getResponseCode()     // Catch:{ IOException -> 0x00f8, Throwable -> 0x00eb, all -> 0x00e7 }
            r0.f81837a = r6     // Catch:{ IOException -> 0x00f8, Throwable -> 0x00eb, all -> 0x00e7 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00f8, Throwable -> 0x00eb, all -> 0x00e7 }
            r6.<init>()     // Catch:{ IOException -> 0x00f8, Throwable -> 0x00eb, all -> 0x00e7 }
        L_0x0075:
            java.lang.String r6 = r4.getHeaderFieldKey(r7)     // Catch:{ IOException -> 0x00f8, Throwable -> 0x00eb, all -> 0x00e7 }
            java.lang.String r8 = r4.getHeaderField(r7)     // Catch:{ IOException -> 0x00f8, Throwable -> 0x00eb, all -> 0x00e7 }
            if (r6 != 0) goto L_0x00de
            if (r8 != 0) goto L_0x00de
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0096, Throwable -> 0x00eb, all -> 0x00e7 }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0096, Throwable -> 0x00eb, all -> 0x00e7 }
            com.xiaomi.push.at$a r8 = new com.xiaomi.push.at$a     // Catch:{ IOException -> 0x0096, Throwable -> 0x00eb, all -> 0x00e7 }
            java.io.InputStream r2 = r4.getInputStream()     // Catch:{ IOException -> 0x0096, Throwable -> 0x00eb, all -> 0x00e7 }
            r8.<init>(r2)     // Catch:{ IOException -> 0x0096, Throwable -> 0x00eb, all -> 0x00e7 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0096, Throwable -> 0x00eb, all -> 0x00e7 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x0096, Throwable -> 0x00eb, all -> 0x00e7 }
            r4 = r6
            goto L_0x00a9
        L_0x0096:
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x00f8, Throwable -> 0x00eb, all -> 0x00e7 }
            com.xiaomi.push.at$a r7 = new com.xiaomi.push.at$a     // Catch:{ IOException -> 0x00f8, Throwable -> 0x00eb, all -> 0x00e7 }
            java.io.InputStream r4 = r4.getErrorStream()     // Catch:{ IOException -> 0x00f8, Throwable -> 0x00eb, all -> 0x00e7 }
            r7.<init>(r4)     // Catch:{ IOException -> 0x00f8, Throwable -> 0x00eb, all -> 0x00e7 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x00f8, Throwable -> 0x00eb, all -> 0x00e7 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x00f8, Throwable -> 0x00eb, all -> 0x00e7 }
            r4.<init>(r6)     // Catch:{ IOException -> 0x00f8, Throwable -> 0x00eb, all -> 0x00e7 }
        L_0x00a9:
            java.lang.String r6 = r4.readLine()     // Catch:{ IOException -> 0x00d9, Throwable -> 0x00d7 }
            java.lang.StringBuffer r7 = new java.lang.StringBuffer     // Catch:{ IOException -> 0x00d9, Throwable -> 0x00d7 }
            r7.<init>()     // Catch:{ IOException -> 0x00d9, Throwable -> 0x00d7 }
            java.lang.String r8 = "line.separator"
            java.lang.String r8 = java.lang.System.getProperty(r8)     // Catch:{ IOException -> 0x00d9, Throwable -> 0x00d7 }
        L_0x00b8:
            if (r6 == 0) goto L_0x00c5
            r7.append(r6)     // Catch:{ IOException -> 0x00d9, Throwable -> 0x00d7 }
            r7.append(r8)     // Catch:{ IOException -> 0x00d9, Throwable -> 0x00d7 }
            java.lang.String r6 = r4.readLine()     // Catch:{ IOException -> 0x00d9, Throwable -> 0x00d7 }
            goto L_0x00b8
        L_0x00c5:
            java.lang.String r6 = r7.toString()     // Catch:{ IOException -> 0x00d9, Throwable -> 0x00d7 }
            r0.f158a = r6     // Catch:{ IOException -> 0x00d9, Throwable -> 0x00d7 }
            r4.close()     // Catch:{ IOException -> 0x00d9, Throwable -> 0x00d7 }
            com.xiaomi.push.z.a((java.io.Closeable) r1)
            com.xiaomi.push.z.a((java.io.Closeable) r1)
            return r0
        L_0x00d5:
            r5 = move-exception
            goto L_0x0123
        L_0x00d7:
            r5 = move-exception
            goto L_0x00ee
        L_0x00d9:
            r6 = move-exception
            r8 = r1
            r1 = r4
            r4 = r6
            goto L_0x00fa
        L_0x00de:
            java.util.Map<java.lang.String, java.lang.String> r3 = r0.f159a     // Catch:{ IOException -> 0x00f8, Throwable -> 0x00eb, all -> 0x00e7 }
            r3.put(r6, r8)     // Catch:{ IOException -> 0x00f8, Throwable -> 0x00eb, all -> 0x00e7 }
            int r7 = r7 + 1
            int r7 = r7 + r2
            goto L_0x0075
        L_0x00e7:
            r4 = move-exception
            r5 = r4
            r4 = r1
            goto L_0x0123
        L_0x00eb:
            r4 = move-exception
            r5 = r4
            r4 = r1
        L_0x00ee:
            java.io.IOException r6 = new java.io.IOException     // Catch:{ all -> 0x00d5 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x00d5 }
            r6.<init>(r5)     // Catch:{ all -> 0x00d5 }
            throw r6     // Catch:{ all -> 0x00d5 }
        L_0x00f8:
            r4 = move-exception
            r8 = r1
        L_0x00fa:
            java.io.IOException r6 = new java.io.IOException     // Catch:{ all -> 0x005d }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
            r7.<init>()     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "err while request "
            r7.append(r0)     // Catch:{ all -> 0x005d }
            r7.append(r5)     // Catch:{ all -> 0x005d }
            java.lang.String r5 = ":"
            r7.append(r5)     // Catch:{ all -> 0x005d }
            java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x005d }
            java.lang.String r4 = r4.getSimpleName()     // Catch:{ all -> 0x005d }
            r7.append(r4)     // Catch:{ all -> 0x005d }
            java.lang.String r4 = r7.toString()     // Catch:{ all -> 0x005d }
            r6.<init>(r4)     // Catch:{ all -> 0x005d }
            throw r6     // Catch:{ all -> 0x005d }
        L_0x0121:
            r4 = r1
            r1 = r8
        L_0x0123:
            com.xiaomi.push.z.a((java.io.Closeable) r1)
            com.xiaomi.push.z.a((java.io.Closeable) r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.at.a(android.content.Context, java.lang.String, java.lang.String, java.util.Map, java.lang.String):com.xiaomi.push.ar");
    }

    public static ar a(Context context, String str, Map<String, String> map) {
        return a(context, str, "POST", (Map) null, a(map));
    }

    public static InputStream a(Context context, URL url, boolean z, String str, String str2) {
        return a(context, url, z, str, str2, null, null);
    }

    public static InputStream a(Context context, URL url, boolean z, String str, String str2, Map<String, String> map, b bVar) {
        if (context == null) {
            throw new IllegalArgumentException("context");
        } else if (url != null) {
            URL url2 = !z ? new URL(a(url.toString())) : url;
            try {
                HttpURLConnection.setFollowRedirects(true);
                HttpURLConnection a2 = a(context, url2);
                a2.setConnectTimeout(10000);
                a2.setReadTimeout(15000);
                if (!TextUtils.isEmpty(str)) {
                    a2.setRequestProperty("User-Agent", str);
                }
                if (str2 != null) {
                    a2.setRequestProperty("Cookie", str2);
                }
                if (map != null) {
                    for (String next : map.keySet()) {
                        a2.setRequestProperty(next, map.get(next));
                    }
                }
                if (bVar != null && (url.getProtocol().equals("http") || url.getProtocol().equals("https"))) {
                    bVar.f81842a = a2.getResponseCode();
                    if (bVar.f160a == null) {
                        bVar.f160a = new HashMap();
                    }
                    int i = 0;
                    while (true) {
                        String headerFieldKey = a2.getHeaderFieldKey(i);
                        String headerField = a2.getHeaderField(i);
                        if (headerFieldKey == null && headerField == null) {
                            break;
                        }
                        if (!TextUtils.isEmpty(headerFieldKey)) {
                            if (!TextUtils.isEmpty(headerField)) {
                                bVar.f160a.put(headerFieldKey, headerField);
                            }
                        }
                        i++;
                    }
                }
                return new a(a2.getInputStream());
            } catch (IOException e2) {
                throw new IOException("IOException:" + e2.getClass().getSimpleName());
            } catch (Throwable th) {
                throw new IOException(th.getMessage());
            }
        } else {
            throw new IllegalArgumentException(PushConstants.WEB_URL);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static String m85a(Context context) {
        if (d(context)) {
            return "wifi";
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    return (activeNetworkInfo.getTypeName() + "-" + activeNetworkInfo.getSubtypeName() + "-" + activeNetworkInfo.getExtraInfo()).toLowerCase();
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public static String a(Context context, URL url) {
        return a(context, url, false, null, "UTF-8", null);
    }

    public static String a(Context context, URL url, boolean z, String str, String str2, String str3) {
        InputStream inputStream;
        try {
            inputStream = a(context, url, z, str, str3);
            try {
                StringBuilder sb = new StringBuilder(1024);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str2));
                char[] cArr = new char[4096];
                while (true) {
                    int read = bufferedReader.read(cArr);
                    if (-1 != read) {
                        sb.append(cArr, 0, read);
                    } else {
                        z.a((Closeable) inputStream);
                        return sb.toString();
                    }
                }
            } catch (Throwable th) {
                th = th;
                z.a((Closeable) inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            z.a((Closeable) inputStream);
            throw th;
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new String();
        return String.format("%s&key=%s", new Object[]{str, ay.a(String.format("%sbe988a6134bc8254465424e5a70ef037", new Object[]{str}))});
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r5, java.util.Map<java.lang.String, java.lang.String> r6, java.io.File r7, java.lang.String r8) {
        /*
            boolean r0 = r7.exists()
            r1 = 0
            if (r0 != 0) goto L_0x0009
            goto L_0x0111
        L_0x0009:
            java.lang.String r0 = r7.getName()
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            r2.<init>(r5)     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            java.net.URLConnection r5 = r2.openConnection()     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            r2 = 15000(0x3a98, float:2.102E-41)
            r5.setReadTimeout(r2)     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            r2 = 10000(0x2710, float:1.4013E-41)
            r5.setConnectTimeout(r2)     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            r2 = 1
            r5.setDoInput(r2)     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            r5.setDoOutput(r2)     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            r2 = 0
            r5.setUseCaches(r2)     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            java.lang.String r3 = "POST"
            r5.setRequestMethod(r3)     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            java.lang.String r3 = "Connection"
            java.lang.String r4 = "Keep-Alive"
            r5.setRequestProperty(r3, r4)     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "multipart/form-data;boundary=*****"
            r5.setRequestProperty(r3, r4)     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            if (r6 == 0) goto L_0x0066
            java.util.Set r6 = r6.entrySet()     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
        L_0x004a:
            boolean r3 = r6.hasNext()     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            if (r3 == 0) goto L_0x0066
            java.lang.Object r3 = r6.next()     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            java.lang.Object r4 = r3.getKey()     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            r5.setRequestProperty(r4, r3)     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            goto L_0x004a
        L_0x0066:
            int r6 = r0.length()     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            int r6 = r6 + 77
            long r3 = r7.length()     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            int r0 = (int) r3     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            int r6 = r6 + r0
            int r0 = r8.length()     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            int r6 = r6 + r0
            r5.setFixedLengthStreamingMode(r6)     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            java.io.DataOutputStream r6 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            java.io.OutputStream r0 = r5.getOutputStream()     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            r6.<init>(r0)     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            java.lang.String r0 = "--*****\r\n"
            r6.writeBytes(r0)     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            r0.<init>()     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            java.lang.String r3 = "Content-Disposition: form-data; name=\""
            r0.append(r3)     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            r0.append(r8)     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            java.lang.String r8 = "\";filename=\""
            r0.append(r8)     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            java.lang.String r8 = r7.getName()     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            r0.append(r8)     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            java.lang.String r8 = "\"\r\n"
            r0.append(r8)     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            java.lang.String r8 = r0.toString()     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            r6.writeBytes(r8)     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            java.lang.String r8 = "\r\n"
            r6.writeBytes(r8)     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            r8.<init>(r7)     // Catch:{ IOException -> 0x0137, Throwable -> 0x0126, all -> 0x0122 }
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch:{ IOException -> 0x011d, Throwable -> 0x011a }
        L_0x00bb:
            int r0 = r8.read(r7)     // Catch:{ IOException -> 0x011d, Throwable -> 0x011a }
            r3 = -1
            if (r0 == r3) goto L_0x00c9
            r6.write(r7, r2, r0)     // Catch:{ IOException -> 0x011d, Throwable -> 0x011a }
            r6.flush()     // Catch:{ IOException -> 0x011d, Throwable -> 0x011a }
            goto L_0x00bb
        L_0x00c9:
            java.lang.String r7 = "\r\n"
            r6.writeBytes(r7)     // Catch:{ IOException -> 0x011d, Throwable -> 0x011a }
            java.lang.String r7 = "--"
            r6.writeBytes(r7)     // Catch:{ IOException -> 0x011d, Throwable -> 0x011a }
            java.lang.String r7 = "*****"
            r6.writeBytes(r7)     // Catch:{ IOException -> 0x011d, Throwable -> 0x011a }
            java.lang.String r7 = "--"
            r6.writeBytes(r7)     // Catch:{ IOException -> 0x011d, Throwable -> 0x011a }
            java.lang.String r7 = "\r\n"
            r6.writeBytes(r7)     // Catch:{ IOException -> 0x011d, Throwable -> 0x011a }
            r6.flush()     // Catch:{ IOException -> 0x011d, Throwable -> 0x011a }
            java.lang.StringBuffer r6 = new java.lang.StringBuffer     // Catch:{ IOException -> 0x011d, Throwable -> 0x011a }
            r6.<init>()     // Catch:{ IOException -> 0x011d, Throwable -> 0x011a }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x011d, Throwable -> 0x011a }
            com.xiaomi.push.at$a r0 = new com.xiaomi.push.at$a     // Catch:{ IOException -> 0x011d, Throwable -> 0x011a }
            java.io.InputStream r5 = r5.getInputStream()     // Catch:{ IOException -> 0x011d, Throwable -> 0x011a }
            r0.<init>(r5)     // Catch:{ IOException -> 0x011d, Throwable -> 0x011a }
            r7.<init>(r0)     // Catch:{ IOException -> 0x011d, Throwable -> 0x011a }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ IOException -> 0x011d, Throwable -> 0x011a }
            r5.<init>(r7)     // Catch:{ IOException -> 0x011d, Throwable -> 0x011a }
        L_0x00fd:
            java.lang.String r7 = r5.readLine()     // Catch:{ IOException -> 0x0118, Throwable -> 0x0115, all -> 0x0112 }
            if (r7 == 0) goto L_0x0107
            r6.append(r7)     // Catch:{ IOException -> 0x0118, Throwable -> 0x0115, all -> 0x0112 }
            goto L_0x00fd
        L_0x0107:
            java.lang.String r1 = r6.toString()     // Catch:{ IOException -> 0x0118, Throwable -> 0x0115, all -> 0x0112 }
            com.xiaomi.push.z.a((java.io.Closeable) r8)
            com.xiaomi.push.z.a((java.io.Closeable) r5)
        L_0x0111:
            return r1
        L_0x0112:
            r6 = move-exception
        L_0x0113:
            r1 = r8
            goto L_0x015a
        L_0x0115:
            r6 = move-exception
            r1 = r5
            goto L_0x0129
        L_0x0118:
            r6 = move-exception
            goto L_0x0120
        L_0x011a:
            r5 = move-exception
            r6 = r5
            goto L_0x0129
        L_0x011d:
            r5 = move-exception
            r6 = r5
            r5 = r1
        L_0x0120:
            r1 = r8
            goto L_0x013a
        L_0x0122:
            r5 = move-exception
            r6 = r5
            r5 = r1
            goto L_0x015a
        L_0x0126:
            r5 = move-exception
            r6 = r5
            r8 = r1
        L_0x0129:
            java.io.IOException r5 = new java.io.IOException     // Catch:{ all -> 0x0133 }
            java.lang.String r6 = r6.getMessage()     // Catch:{ all -> 0x0133 }
            r5.<init>(r6)     // Catch:{ all -> 0x0133 }
            throw r5     // Catch:{ all -> 0x0133 }
        L_0x0133:
            r5 = move-exception
            r6 = r5
            r5 = r1
            goto L_0x0113
        L_0x0137:
            r5 = move-exception
            r6 = r5
            r5 = r1
        L_0x013a:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ all -> 0x0159 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0159 }
            r8.<init>()     // Catch:{ all -> 0x0159 }
            java.lang.String r0 = "IOException:"
            r8.append(r0)     // Catch:{ all -> 0x0159 }
            java.lang.Class r6 = r6.getClass()     // Catch:{ all -> 0x0159 }
            java.lang.String r6 = r6.getSimpleName()     // Catch:{ all -> 0x0159 }
            r8.append(r6)     // Catch:{ all -> 0x0159 }
            java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x0159 }
            r7.<init>(r6)     // Catch:{ all -> 0x0159 }
            throw r7     // Catch:{ all -> 0x0159 }
        L_0x0159:
            r6 = move-exception
        L_0x015a:
            com.xiaomi.push.z.a((java.io.Closeable) r1)
            com.xiaomi.push.z.a((java.io.Closeable) r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.at.a(java.lang.String, java.util.Map, java.io.File, java.lang.String):java.lang.String");
    }

    public static String a(Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry next : map.entrySet()) {
            if (!(next.getKey() == null || next.getValue() == null)) {
                try {
                    stringBuffer.append(URLEncoder.encode((String) next.getKey(), "UTF-8"));
                    stringBuffer.append("=");
                    stringBuffer.append(URLEncoder.encode((String) next.getValue(), "UTF-8"));
                    stringBuffer.append("&");
                } catch (UnsupportedEncodingException unused) {
                    return null;
                }
            }
        }
        if (stringBuffer.length() > 0) {
            stringBuffer = stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        return stringBuffer.toString();
    }

    /* renamed from: a  reason: collision with other method in class */
    public static HttpURLConnection m86a(Context context, URL url) {
        return (HttpURLConnection) (("http".equals(url.getProtocol()) && a(context)) ? url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.0.0.200", 80))) : url.openConnection());
    }

    /* renamed from: a  reason: collision with other method in class */
    private static URL m87a(String str) {
        return new URL(str);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m88a(Context context) {
        if (!"CN".equalsIgnoreCase(((TelephonyManager) context.getSystemService("phone")).getSimCountryIso())) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            String extraInfo = activeNetworkInfo.getExtraInfo();
            return !TextUtils.isEmpty(extraInfo) && extraInfo.length() >= 3 && extraInfo.contains("ctwap");
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean b(Context context) {
        return a(context) >= 0;
    }

    public static boolean c(Context context) {
        NetworkInfo networkInfo;
        try {
            networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception unused) {
            networkInfo = null;
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    public static boolean d(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && 1 == activeNetworkInfo.getType();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean e(Context context) {
        return f(context) || g(context) || h(context);
    }

    public static boolean f(Context context) {
        NetworkInfo a2 = a(context);
        return a2 != null && a2.getType() == 0 && 13 == a2.getSubtype();
    }

    public static boolean g(Context context) {
        NetworkInfo a2 = a(context);
        if (a2 == null || a2.getType() != 0) {
            return false;
        }
        String subtypeName = a2.getSubtypeName();
        if (!"TD-SCDMA".equalsIgnoreCase(subtypeName) && !"CDMA2000".equalsIgnoreCase(subtypeName) && !"WCDMA".equalsIgnoreCase(subtypeName)) {
            switch (a2.getSubtype()) {
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case SearchNilInfo.HIT_TYPE_SENSITIVE:
                case 14:
                case 15:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public static boolean h(Context context) {
        NetworkInfo a2 = a(context);
        if (a2 == null || a2.getType() != 0) {
            return false;
        }
        int subtype = a2.getSubtype();
        if (!(subtype == 4 || subtype == 7 || subtype == 11)) {
            switch (subtype) {
                case 1:
                case 2:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}

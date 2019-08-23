package com.bytedance.ttnet.utils;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.frameworks.baselib.network.http.d.a;
import com.bytedance.frameworks.baselib.network.http.d.b;
import com.bytedance.frameworks.baselib.network.http.retrofit.RequestVertifyInterceptor;
import com.bytedance.frameworks.baselib.network.http.retrofit.converter.gson.GsonConverterFactory;
import com.bytedance.retrofit2.CallAdapter;
import com.bytedance.retrofit2.Converter;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.client.Client;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.bytedance.ttnet.b.d;
import com.bytedance.ttnet.retrofit.SsInterceptor;
import com.bytedance.ttnet.retrofit.SsRetrofitClient;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.zip.Deflater;
import java.util.zip.GZIPOutputStream;

public class RetrofitUtils {
    private static volatile List<Interceptor> sInterceptors = new LinkedList();
    private static c<String, Retrofit> sOKRetrofitCache = new c<>(10);
    private static c<String, Retrofit> sRetrofitCache = new c<>(10);

    public enum a {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        
        final int nativeInt;

        private a(int i) {
            this.nativeInt = i;
        }
    }

    public static void setTimeout(URLConnection uRLConnection) {
        if (uRLConnection != null) {
            uRLConnection.setConnectTimeout(15000);
            uRLConnection.setReadTimeout(15000);
        }
    }

    public static synchronized void addInterceptor(Interceptor interceptor) {
        synchronized (RetrofitUtils.class) {
            if (interceptor != null) {
                sInterceptors.add(interceptor);
            }
        }
    }

    public static String getEtag(List<Header> list) {
        if (list == null) {
            return null;
        }
        Header firstHeader = getFirstHeader(list, "ETag");
        if (firstHeader != null) {
            return firstHeader.getValue();
        }
        return null;
    }

    public static String getHostAddress(Exception exc) {
        if (exc == null) {
            return "";
        }
        try {
            String[] split = exc.getMessage().split("\\|");
            if (split != null && split.length >= 2) {
                Logger.debug();
                return split[0];
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static String getLastModified(List<Header> list) {
        if (list == null) {
            return null;
        }
        Header firstHeader = getFirstHeader(list, "Last-Modified");
        if (firstHeader != null) {
            return firstHeader.getValue();
        }
        return null;
    }

    public static Pair<String, String> parseContentType(String str) {
        String str2;
        String str3 = null;
        if (str == null) {
            return null;
        }
        try {
            b bVar = new b(str);
            str2 = bVar.getBaseType();
            try {
                str3 = bVar.getParameter("charset");
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str2 = null;
        }
        return new Pair<>(str2, str3);
    }

    public static synchronized void removeInterceptor(Interceptor interceptor) {
        synchronized (RetrofitUtils.class) {
            if (interceptor != null) {
                sInterceptors.remove(interceptor);
            }
        }
    }

    public static long extractMaxAge(List<Header> list) {
        if (list == null) {
            return -1;
        }
        Header firstHeader = getFirstHeader(list, "Cache-Control");
        if (firstHeader == null) {
            return -1;
        }
        try {
            com.bytedance.frameworks.baselib.network.http.d.a aVar = new com.bytedance.frameworks.baselib.network.http.d.a(firstHeader.getValue());
            String str = aVar.f19850a.get(a.C0161a.MAXAGE);
            if (str != null) {
                return Long.parseLong(str);
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @Deprecated
    public static synchronized Retrofit getOkRetrofit(String str) {
        synchronized (RetrofitUtils.class) {
            if (StringUtils.isEmpty(str)) {
                return null;
            }
            Retrofit retrofit = (Retrofit) sOKRetrofitCache.a(str);
            if (retrofit != null) {
                return retrofit;
            }
            Retrofit createOkRetrofit = createOkRetrofit(str, null, null, null);
            sOKRetrofitCache.a(str, createOkRetrofit);
            return createOkRetrofit;
        }
    }

    public static synchronized Retrofit getSsRetrofit(String str) {
        synchronized (RetrofitUtils.class) {
            if (StringUtils.isEmpty(str)) {
                return null;
            }
            Retrofit retrofit = (Retrofit) sRetrofitCache.a(str);
            if (retrofit != null) {
                return retrofit;
            }
            Retrofit createSsRetrofit = createSsRetrofit(str, null, null, null);
            sRetrofitCache.a(str, createSsRetrofit);
            return createSsRetrofit;
        }
    }

    public static synchronized <S> S createOkService(String str, Class<S> cls) {
        S createService;
        synchronized (RetrofitUtils.class) {
            createService = createService(getOkRetrofit(str), cls);
        }
        return createService;
    }

    public static synchronized <S> S createSsService(String str, Class<S> cls) {
        S createService;
        synchronized (RetrofitUtils.class) {
            createService = createService(getSsRetrofit(str), cls);
        }
        return createService;
    }

    public static synchronized <S> S createService(Retrofit retrofit, Class<S> cls) {
        synchronized (RetrofitUtils.class) {
            if (retrofit == null) {
                return null;
            }
            S create = retrofit.create(cls);
            return create;
        }
    }

    public static Header getFirstHeader(List<Header> list, String str) {
        if (list == null || StringUtils.isEmpty(str)) {
            return null;
        }
        for (Header next : list) {
            if (str.equalsIgnoreCase(next.getName())) {
                return next;
            }
        }
        return null;
    }

    public static String getHeaderValueIgnoreCase(List<Header> list, String str) {
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        for (Header next : list) {
            if (str.equalsIgnoreCase(next.getName())) {
                return next.getValue();
            }
        }
        return "";
    }

    public static Pair<byte[], String> tryCompressData(byte[] bArr, a aVar) throws IOException {
        String str;
        byte[] bArr2 = null;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        if (a.GZIP == aVar && length > 128) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                bArr2 = byteArrayOutputStream.toByteArray();
                str = "gzip";
            } catch (Throwable th) {
                gZIPOutputStream.close();
                throw th;
            }
        } else if (a.DEFLATER != aVar || length <= 128) {
            str = null;
        } else {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(8192);
            Deflater deflater = new Deflater();
            deflater.setInput(bArr);
            deflater.finish();
            byte[] bArr3 = new byte[8192];
            while (!deflater.finished()) {
                byteArrayOutputStream2.write(bArr3, 0, deflater.deflate(bArr3));
            }
            deflater.end();
            bArr2 = byteArrayOutputStream2.toByteArray();
            str = "deflate";
        }
        return new Pair<>(bArr2, str);
    }

    public static synchronized Retrofit createSsRetrofit(String str, List<Interceptor> list, Converter.Factory factory) {
        Retrofit createSsRetrofit;
        synchronized (RetrofitUtils.class) {
            createSsRetrofit = createSsRetrofit(str, list, factory, null);
        }
        return createSsRetrofit;
    }

    public static void addCacheValidationHeaders(List<Header> list, String str, String str2) {
        if (list != null) {
            if (!StringUtils.isEmpty(str)) {
                list.add(new Header("If-None-Match", str));
            }
            if (!StringUtils.isEmpty(str2)) {
                list.add(new Header("If-Modified-Since", str2));
            }
        }
    }

    @Deprecated
    public static synchronized Retrofit createOkRetrofit(String str, List<Interceptor> list, Converter.Factory factory, CallAdapter.Factory factory2) {
        Retrofit createRetrofit;
        synchronized (RetrofitUtils.class) {
            createRetrofit = createRetrofit(str, list, factory, factory2, new Client.Provider() {
                public final Client get() {
                    return new SsRetrofitClient();
                }
            });
        }
        return createRetrofit;
    }

    public static synchronized Retrofit createSsRetrofit(String str, List<Interceptor> list, Converter.Factory factory, CallAdapter.Factory factory2) {
        Retrofit createRetrofit;
        synchronized (RetrofitUtils.class) {
            createRetrofit = createRetrofit(str, list, factory, factory2, new Client.Provider() {
                public final Client get() {
                    return new SsRetrofitClient();
                }
            });
        }
        return createRetrofit;
    }

    private static void getOutIp(com.bytedance.frameworks.baselib.network.http.a aVar, String[] strArr, List<Header> list, d dVar, Exception exc) {
        String str = null;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (Header next : list) {
                        if ("x-net-info.remoteaddr".equalsIgnoreCase(next.getName())) {
                            str = next.getValue();
                        }
                    }
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (StringUtils.isEmpty(str) && dVar != null) {
            str = dVar.f19736a;
        }
        if (StringUtils.isEmpty(str)) {
            str = getHostAddress(exc);
        }
        if (!StringUtils.isEmpty(str)) {
            if (strArr != null && strArr.length > 0) {
                strArr[0] = str;
            }
            if (aVar != null) {
                aVar.f19730a = str;
                if (aVar.f19731b != null) {
                    aVar.f19731b.f19736a = str;
                }
            }
        }
    }

    public static synchronized Retrofit createRetrofit(String str, List<Interceptor> list, Converter.Factory factory, CallAdapter.Factory factory2, Client.Provider provider) {
        boolean z;
        Retrofit a2;
        synchronized (RetrofitUtils.class) {
            if (factory == null) {
                try {
                    factory = GsonConverterFactory.create();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (provider == null) {
                provider = new Client.Provider() {
                    public final Client get() {
                        return new SsRetrofitClient();
                    }
                };
            }
            Retrofit.a a3 = new Retrofit.a().a(str).a(provider).a((Executor) new com.bytedance.frameworks.baselib.network.http.retrofit.a()).a(factory);
            if (factory2 != null) {
                a3.a(factory2);
            }
            LinkedList<Interceptor> linkedList = new LinkedList<>();
            if (list == null || list.size() <= 0) {
                z = false;
            } else {
                z = false;
                for (Interceptor next : list) {
                    if (next instanceof SsInterceptor) {
                        if (!z) {
                            linkedList.add(next);
                            z = true;
                        }
                    } else if (next instanceof RequestVertifyInterceptor) {
                    }
                    linkedList.add(next);
                }
            }
            if (!z) {
                linkedList.add(0, new SsInterceptor());
            }
            if (sInterceptors != null && sInterceptors.size() > 0) {
                linkedList.addAll(sInterceptors);
            }
            linkedList.add(new RequestVertifyInterceptor());
            for (Interceptor a4 : linkedList) {
                a3.a(a4);
            }
            a2 = a3.a();
        }
        return a2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.util.List<com.bytedance.retrofit2.client.Header>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.util.List<com.bytedance.retrofit2.client.Header>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: com.bytedance.retrofit2.Call} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: java.util.List<com.bytedance.retrofit2.client.Header>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.util.List<com.bytedance.retrofit2.client.Header>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.util.List<com.bytedance.retrofit2.client.Header>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v8, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: java.util.List<com.bytedance.retrofit2.client.Header>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.util.List<com.bytedance.retrofit2.client.Header>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: java.util.List<com.bytedance.retrofit2.client.Header>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v9, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v10, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v11, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: java.util.List<com.bytedance.retrofit2.client.Header>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.util.List<com.bytedance.retrofit2.client.Header>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: com.bytedance.retrofit2.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: java.util.List<com.bytedance.retrofit2.client.Header>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v12, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v13, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v14, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v15, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v16, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: java.util.List<com.bytedance.retrofit2.client.Header>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.util.List<com.bytedance.retrofit2.client.Header>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.util.List<com.bytedance.retrofit2.client.Header>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v21, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.util.List<com.bytedance.retrofit2.client.Header>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v17, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v18, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v19, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v20, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: java.util.List<com.bytedance.retrofit2.client.Header>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v21, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v22, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v23, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v24, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v25, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v26, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v27, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v28, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v27, resolved type: java.util.List<com.bytedance.retrofit2.client.Header>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v29, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v30, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v31, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v32, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v9, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r13v1, types: [com.bytedance.retrofit2.Call] */
    /* JADX WARNING: type inference failed for: r13v2 */
    /* JADX WARNING: type inference failed for: r13v9 */
    /* JADX WARNING: type inference failed for: r13v22, types: [com.bytedance.retrofit2.Call] */
    /* JADX WARNING: type inference failed for: r20v7 */
    /* JADX WARNING: type inference failed for: r13v24 */
    /* JADX WARNING: type inference failed for: r13v26 */
    /* JADX WARNING: type inference failed for: r13v28 */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x011a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x011c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x011d, code lost:
        r3 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01ae, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01af, code lost:
        r21 = r9;
        r22 = r10;
        r13 = r12;
        r20 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01b9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x01bc, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x01bd, code lost:
        r13 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x01c0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x01c1, code lost:
        r22 = r10;
        r13 = r12;
        r20 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x01e7, code lost:
        r2 = getHeaderValueIgnoreCase(r3, "X-TT-LOGID");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x01ee, code lost:
        r2 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0201, code lost:
        r15 = (com.bytedance.frameworks.baselib.network.http.a) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0208, code lost:
        r13.doCollect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x021f, code lost:
        if (r15.g <= 0) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0221, code lost:
        r15.g = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0223, code lost:
        r15.h = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0227, code lost:
        if (r15.w != null) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0229, code lost:
        r15.w.put("ex", r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0271, code lost:
        r0 = (java.lang.Exception) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0274, code lost:
        r0 = new java.lang.Exception(r0.getMessage(), r0.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0289, code lost:
        com.bytedance.frameworks.baselib.network.a.b.a().d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0295, code lost:
        r13.cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00bd, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00be, code lost:
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00c0, code lost:
        r13 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00c3, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00c4, code lost:
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00c6, code lost:
        r3 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00d8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00d9, code lost:
        r16 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01b9 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:85:0x00ed] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01bc A[ExcHandler: Throwable (th java.lang.Throwable), Splitter:B:85:0x00ed] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x01e7 A[Catch:{ Throwable -> 0x0249, all -> 0x0247 }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01ee A[Catch:{ Throwable -> 0x0249, all -> 0x0247 }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0201 A[Catch:{ Throwable -> 0x0249, all -> 0x0247 }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0208 A[Catch:{ Throwable -> 0x0249, all -> 0x0247 }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0219 A[Catch:{ Throwable -> 0x0249, all -> 0x0247 }] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0271 A[Catch:{ all -> 0x0283 }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0274 A[Catch:{ all -> 0x0283 }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0295 A[Catch:{ Throwable -> 0x0298 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a9 A[SYNTHETIC, Splitter:B:54:0x00a9] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00bd A[ExcHandler: all (th java.lang.Throwable), Splitter:B:59:0x00b9] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c3 A[ExcHandler: Throwable (th java.lang.Throwable), Splitter:B:59:0x00b9] */
    /* JADX WARNING: Unknown variable types count: 2 */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean downloadFile(int r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, com.bytedance.frameworks.baselib.network.http.util.d<java.lang.String> r29, java.lang.String r30, com.bytedance.frameworks.baselib.network.http.util.h r31, java.util.List<com.bytedance.retrofit2.client.Header> r32, java.lang.String[] r33, int[] r34) throws java.lang.Exception {
        /*
            r1 = r25
            r0 = r31
            r13 = r33
            r2 = r34
            boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r25)
            r4 = 0
            if (r3 == 0) goto L_0x0010
            return r4
        L_0x0010:
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            android.util.Pair r3 = com.bytedance.frameworks.baselib.network.http.util.UrlUtils.parseUrl(r1, r9)
            if (r3 != 0) goto L_0x001c
            return r4
        L_0x001c:
            java.lang.Object r5 = r3.first
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r3.second
            r8 = r3
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Class<com.bytedance.ttnet.INetworkApi> r3 = com.bytedance.ttnet.INetworkApi.class
            java.lang.Object r3 = createSsService(r5, r3)
            r5 = r3
            com.bytedance.ttnet.INetworkApi r5 = (com.bytedance.ttnet.INetworkApi) r5
            com.bytedance.ttnet.b.d r14 = new com.bytedance.ttnet.b.d
            r14.<init>()
            r15 = -1
            if (r5 == 0) goto L_0x0299
            r6 = 0
            r3 = 0
            r7 = r24
            r10 = r32
            r11 = r14
            com.bytedance.retrofit2.Call r12 = r5.downloadFile(r6, r7, r8, r9, r10, r11)     // Catch:{ Throwable -> 0x026a, all -> 0x0263 }
            if (r0 == 0) goto L_0x005d
            boolean r5 = r0.f19878a     // Catch:{ Throwable -> 0x0057, all -> 0x0051 }
            if (r5 == 0) goto L_0x005d
            com.bytedance.frameworks.baselib.network.http.d.e.a((java.io.Closeable) r3)     // Catch:{ Throwable -> 0x0050 }
            if (r12 == 0) goto L_0x0050
            r12.cancel()     // Catch:{ Throwable -> 0x0050 }
        L_0x0050:
            return r4
        L_0x0051:
            r0 = move-exception
            r16 = r3
            r13 = r12
            goto L_0x0267
        L_0x0057:
            r0 = move-exception
            r16 = r3
            r3 = r12
            goto L_0x026d
        L_0x005d:
            com.bytedance.ttnet.c r5 = com.bytedance.ttnet.TTNetInit.getTTNetDepend()     // Catch:{ Throwable -> 0x025d, all -> 0x0258 }
            android.content.Context r5 = r5.a()     // Catch:{ Throwable -> 0x025d, all -> 0x0258 }
            boolean r5 = com.bytedance.common.utility.NetworkUtils.isNetworkAvailable(r5)     // Catch:{ Throwable -> 0x025d, all -> 0x0258 }
            if (r5 != 0) goto L_0x0074
            com.bytedance.frameworks.baselib.network.http.d.e.a((java.io.Closeable) r3)     // Catch:{ Throwable -> 0x0073 }
            if (r12 == 0) goto L_0x0073
            r12.cancel()     // Catch:{ Throwable -> 0x0073 }
        L_0x0073:
            return r4
        L_0x0074:
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x025d, all -> 0x0258 }
            com.bytedance.frameworks.baselib.network.http.e$e r5 = com.bytedance.frameworks.baselib.network.http.e.c()     // Catch:{ Throwable -> 0x025d, all -> 0x0258 }
            if (r5 == 0) goto L_0x008f
            boolean r5 = r5.b(r1)     // Catch:{ Throwable -> 0x0057, all -> 0x0051 }
            if (r5 == 0) goto L_0x008f
            com.bytedance.frameworks.baselib.network.a.b r5 = com.bytedance.frameworks.baselib.network.a.b.a()     // Catch:{ Throwable -> 0x0057, all -> 0x0051 }
            r5.c()     // Catch:{ Throwable -> 0x0057, all -> 0x0051 }
            r5 = 1
            r19 = 1
            goto L_0x0091
        L_0x008f:
            r19 = 0
        L_0x0091:
            com.bytedance.retrofit2.SsResponse r5 = r12.execute()     // Catch:{ Throwable -> 0x0250, all -> 0x024b }
            if (r5 != 0) goto L_0x00a9
            if (r19 == 0) goto L_0x00a0
            com.bytedance.frameworks.baselib.network.a.b r0 = com.bytedance.frameworks.baselib.network.a.b.a()
            r0.d()
        L_0x00a0:
            com.bytedance.frameworks.baselib.network.http.d.e.a((java.io.Closeable) r3)     // Catch:{ Throwable -> 0x00a8 }
            if (r12 == 0) goto L_0x00a8
            r12.cancel()     // Catch:{ Throwable -> 0x00a8 }
        L_0x00a8:
            return r4
        L_0x00a9:
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01d8 }
            com.bytedance.retrofit2.client.Response r6 = r5.raw()     // Catch:{ Exception -> 0x01ce }
            java.lang.Object r6 = r6.getExtraInfo()     // Catch:{ Exception -> 0x01ce }
            boolean r7 = r6 instanceof com.bytedance.frameworks.baselib.network.http.a     // Catch:{ Exception -> 0x01ce }
            if (r7 == 0) goto L_0x00d2
            com.bytedance.frameworks.baselib.network.http.a r6 = (com.bytedance.frameworks.baselib.network.http.a) r6     // Catch:{ Exception -> 0x00c9, Throwable -> 0x00c3, all -> 0x00bd }
            r15 = r6
            goto L_0x00d3
        L_0x00bd:
            r0 = move-exception
            r16 = r3
        L_0x00c0:
            r13 = r12
            goto L_0x0287
        L_0x00c3:
            r0 = move-exception
            r16 = r3
        L_0x00c6:
            r3 = r12
            goto L_0x0255
        L_0x00c9:
            r0 = move-exception
            r15 = r3
            r16 = r15
        L_0x00cd:
            r20 = r16
        L_0x00cf:
            r13 = r12
            goto L_0x01e1
        L_0x00d2:
            r15 = r3
        L_0x00d3:
            if (r15 == 0) goto L_0x00dc
            r15.g = r10     // Catch:{ Exception -> 0x00d8, Throwable -> 0x00c3, all -> 0x00bd }
            goto L_0x00dc
        L_0x00d8:
            r0 = move-exception
            r16 = r3
            goto L_0x00cd
        L_0x00dc:
            java.lang.Object r6 = r5.body()     // Catch:{ Exception -> 0x01c7 }
            com.bytedance.retrofit2.mime.TypedInput r6 = (com.bytedance.retrofit2.mime.TypedInput) r6     // Catch:{ Exception -> 0x01c7 }
            if (r6 == 0) goto L_0x00eb
            java.io.InputStream r7 = r6.in()     // Catch:{ Exception -> 0x00d8, Throwable -> 0x00c3, all -> 0x00bd }
            r16 = r7
            goto L_0x00ed
        L_0x00eb:
            r16 = r3
        L_0x00ed:
            java.util.List r9 = r5.headers()     // Catch:{ Exception -> 0x01c0, Throwable -> 0x01bc, all -> 0x01b9 }
            java.lang.String r7 = "X-TT-LOGID"
            java.lang.String r20 = getHeaderValueIgnoreCase(r9, r7)     // Catch:{ Exception -> 0x01ae, Throwable -> 0x01bc, all -> 0x01b9 }
            getOutIp(r15, r13, r9, r14, r3)     // Catch:{ Exception -> 0x01a7, Throwable -> 0x01bc, all -> 0x01b9 }
            int r3 = r5.code()     // Catch:{ Exception -> 0x01a7, Throwable -> 0x01bc, all -> 0x01b9 }
            r5 = 200(0xc8, float:2.8E-43)
            if (r3 != r5) goto L_0x0177
            if (r6 == 0) goto L_0x0177
            long r7 = r6.length()     // Catch:{ Exception -> 0x01a7, Throwable -> 0x01bc, all -> 0x01b9 }
            if (r2 == 0) goto L_0x011f
            int r3 = r2.length     // Catch:{ Exception -> 0x011c, Throwable -> 0x011a, all -> 0x01b9 }
            if (r3 <= 0) goto L_0x011f
            r2[r4] = r4     // Catch:{ Exception -> 0x011c, Throwable -> 0x011a, all -> 0x01b9 }
            r21 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r3 > 0) goto L_0x011f
            int r3 = (int) r7     // Catch:{ Exception -> 0x011c, Throwable -> 0x011a, all -> 0x01b9 }
            r2[r4] = r3     // Catch:{ Exception -> 0x011c, Throwable -> 0x011a, all -> 0x01b9 }
            goto L_0x011f
        L_0x011a:
            r0 = move-exception
            goto L_0x00c6
        L_0x011c:
            r0 = move-exception
            r3 = r9
            goto L_0x00cf
        L_0x011f:
            long r3 = r6.length()     // Catch:{ Exception -> 0x01a7, Throwable -> 0x01bc, all -> 0x01b9 }
            com.bytedance.ttnet.utils.RetrofitUtils$1 r5 = new com.bytedance.ttnet.utils.RetrofitUtils$1     // Catch:{ Exception -> 0x01a7, Throwable -> 0x01bc, all -> 0x01b9 }
            r5.<init>(r1, r12)     // Catch:{ Exception -> 0x01a7, Throwable -> 0x01bc, all -> 0x01b9 }
            r2 = r16
            r6 = r24
            r7 = r26
            r8 = r27
            r21 = r9
            r9 = r28
            r22 = r10
            r10 = r29
            r11 = r30
            r13 = r12
            r12 = r31
            boolean r0 = com.bytedance.frameworks.baselib.network.http.d.e.a(r2, r3, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x01a1 }
            if (r0 == 0) goto L_0x0165
            boolean r2 = r13 instanceof com.bytedance.retrofit2.i     // Catch:{ Exception -> 0x01a1 }
            if (r2 == 0) goto L_0x014d
            r12 = r13
            com.bytedance.retrofit2.i r12 = (com.bytedance.retrofit2.i) r12     // Catch:{ Exception -> 0x01a1 }
            r12.doCollect()     // Catch:{ Exception -> 0x01a1 }
        L_0x014d:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01a1 }
            if (r15 == 0) goto L_0x0155
            r15.h = r2     // Catch:{ Exception -> 0x01a1 }
        L_0x0155:
            r4 = 0
            long r2 = r2 - r17
            r26 = r2
            r28 = r17
            r30 = r25
            r31 = r20
            r32 = r15
            com.bytedance.frameworks.baselib.network.http.e.a(r26, r28, r30, r31, r32)     // Catch:{ Exception -> 0x01a1 }
        L_0x0165:
            if (r19 == 0) goto L_0x016e
            com.bytedance.frameworks.baselib.network.a.b r1 = com.bytedance.frameworks.baselib.network.a.b.a()
            r1.d()
        L_0x016e:
            com.bytedance.frameworks.baselib.network.http.d.e.a((java.io.Closeable) r16)     // Catch:{ Throwable -> 0x0176 }
            if (r13 == 0) goto L_0x0176
            r13.cancel()     // Catch:{ Throwable -> 0x0176 }
        L_0x0176:
            return r0
        L_0x0177:
            r21 = r9
            r22 = r10
            r13 = r12
            if (r3 != r5) goto L_0x0188
            if (r6 != 0) goto L_0x0188
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x01a1 }
            java.lang.String r2 = "HTTP TypedInput may not be null"
            r0.<init>(r2)     // Catch:{ Exception -> 0x01a1 }
            throw r0     // Catch:{ Exception -> 0x01a1 }
        L_0x0188:
            com.bytedance.frameworks.baselib.network.http.a.b r0 = new com.bytedance.frameworks.baselib.network.http.a.b     // Catch:{ Exception -> 0x01a1 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a1 }
            java.lang.String r4 = "get url = "
            r2.<init>(r4)     // Catch:{ Exception -> 0x01a1 }
            r2.append(r1)     // Catch:{ Exception -> 0x01a1 }
            java.lang.String r4 = " exception"
            r2.append(r4)     // Catch:{ Exception -> 0x01a1 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x01a1 }
            r0.<init>(r3, r2)     // Catch:{ Exception -> 0x01a1 }
            throw r0     // Catch:{ Exception -> 0x01a1 }
        L_0x01a1:
            r0 = move-exception
            r3 = r21
            r10 = r22
            goto L_0x01e1
        L_0x01a7:
            r0 = move-exception
            r21 = r9
            r22 = r10
            r13 = r12
            goto L_0x01b6
        L_0x01ae:
            r0 = move-exception
            r21 = r9
            r22 = r10
            r13 = r12
            r20 = r3
        L_0x01b6:
            r3 = r21
            goto L_0x01e1
        L_0x01b9:
            r0 = move-exception
            goto L_0x00c0
        L_0x01bc:
            r0 = move-exception
            r13 = r12
            goto L_0x0254
        L_0x01c0:
            r0 = move-exception
            r22 = r10
            r13 = r12
            r20 = r3
            goto L_0x01e1
        L_0x01c7:
            r0 = move-exception
            r22 = r10
            r13 = r12
            r16 = r3
            goto L_0x01d5
        L_0x01ce:
            r0 = move-exception
            r22 = r10
            r13 = r12
            r15 = r3
            r16 = r15
        L_0x01d5:
            r20 = r16
            goto L_0x01e1
        L_0x01d8:
            r0 = move-exception
            r13 = r12
            r20 = r3
            r10 = r15
            r15 = r20
            r16 = r15
        L_0x01e1:
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r20)     // Catch:{ Throwable -> 0x0249, all -> 0x0247 }
            if (r2 == 0) goto L_0x01ee
            java.lang.String r2 = "X-TT-LOGID"
            java.lang.String r2 = getHeaderValueIgnoreCase(r3, r2)     // Catch:{ Throwable -> 0x0249, all -> 0x0247 }
            goto L_0x01f0
        L_0x01ee:
            r2 = r20
        L_0x01f0:
            if (r15 != 0) goto L_0x0204
            boolean r4 = r13 instanceof com.bytedance.retrofit2.j     // Catch:{ Throwable -> 0x0249, all -> 0x0247 }
            if (r4 == 0) goto L_0x0204
            r12 = r13
            com.bytedance.retrofit2.j r12 = (com.bytedance.retrofit2.j) r12     // Catch:{ Throwable -> 0x0249, all -> 0x0247 }
            java.lang.Object r4 = r12.getRequestInfo()     // Catch:{ Throwable -> 0x0249, all -> 0x0247 }
            boolean r5 = r4 instanceof com.bytedance.frameworks.baselib.network.http.a     // Catch:{ Throwable -> 0x0249, all -> 0x0247 }
            if (r5 == 0) goto L_0x0204
            com.bytedance.frameworks.baselib.network.http.a r4 = (com.bytedance.frameworks.baselib.network.http.a) r4     // Catch:{ Throwable -> 0x0249, all -> 0x0247 }
            r15 = r4
        L_0x0204:
            boolean r4 = r13 instanceof com.bytedance.retrofit2.i     // Catch:{ Throwable -> 0x0249, all -> 0x0247 }
            if (r4 == 0) goto L_0x020e
            r12 = r13
            com.bytedance.retrofit2.i r12 = (com.bytedance.retrofit2.i) r12     // Catch:{ Throwable -> 0x0249, all -> 0x0247 }
            r12.doCollect()     // Catch:{ Throwable -> 0x0249, all -> 0x0247 }
        L_0x020e:
            r4 = r33
            getOutIp(r15, r4, r3, r14, r0)     // Catch:{ Throwable -> 0x0249, all -> 0x0247 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0249, all -> 0x0247 }
            if (r15 == 0) goto L_0x0234
            long r5 = r15.g     // Catch:{ Throwable -> 0x0249, all -> 0x0247 }
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x0223
            r15.g = r10     // Catch:{ Throwable -> 0x0249, all -> 0x0247 }
        L_0x0223:
            r15.h = r3     // Catch:{ Throwable -> 0x0249, all -> 0x0247 }
            org.json.JSONObject r5 = r15.w     // Catch:{ Throwable -> 0x0249, all -> 0x0247 }
            if (r5 == 0) goto L_0x0234
            org.json.JSONObject r5 = r15.w     // Catch:{ Throwable -> 0x0249, all -> 0x0247 }
            java.lang.String r6 = "ex"
            java.lang.String r7 = r0.getMessage()     // Catch:{ Throwable -> 0x0249, all -> 0x0247 }
            r5.put(r6, r7)     // Catch:{ Throwable -> 0x0249, all -> 0x0247 }
        L_0x0234:
            r5 = 0
            long r3 = r3 - r17
            r26 = r3
            r28 = r17
            r30 = r25
            r31 = r2
            r32 = r15
            r33 = r0
            com.bytedance.frameworks.baselib.network.http.e.a(r26, r28, r30, r31, r32, r33)     // Catch:{ Throwable -> 0x0249, all -> 0x0247 }
            throw r0     // Catch:{ Throwable -> 0x0249, all -> 0x0247 }
        L_0x0247:
            r0 = move-exception
            goto L_0x0287
        L_0x0249:
            r0 = move-exception
            goto L_0x0254
        L_0x024b:
            r0 = move-exception
            r13 = r12
            r16 = r3
            goto L_0x0287
        L_0x0250:
            r0 = move-exception
            r13 = r12
            r16 = r3
        L_0x0254:
            r3 = r13
        L_0x0255:
            r4 = r19
            goto L_0x026d
        L_0x0258:
            r0 = move-exception
            r13 = r12
            r16 = r3
            goto L_0x0267
        L_0x025d:
            r0 = move-exception
            r13 = r12
            r16 = r3
            r3 = r13
            goto L_0x026d
        L_0x0263:
            r0 = move-exception
            r13 = r3
            r16 = r13
        L_0x0267:
            r19 = 0
            goto L_0x0287
        L_0x026a:
            r0 = move-exception
            r16 = r3
        L_0x026d:
            boolean r1 = r0 instanceof java.lang.Exception     // Catch:{ all -> 0x0283 }
            if (r1 == 0) goto L_0x0274
            java.lang.Exception r0 = (java.lang.Exception) r0     // Catch:{ all -> 0x0283 }
            goto L_0x0282
        L_0x0274:
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x0283 }
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x0283 }
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ all -> 0x0283 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0283 }
            r0 = r1
        L_0x0282:
            throw r0     // Catch:{ all -> 0x0283 }
        L_0x0283:
            r0 = move-exception
            r13 = r3
            r19 = r4
        L_0x0287:
            if (r19 == 0) goto L_0x0290
            com.bytedance.frameworks.baselib.network.a.b r1 = com.bytedance.frameworks.baselib.network.a.b.a()
            r1.d()
        L_0x0290:
            com.bytedance.frameworks.baselib.network.http.d.e.a((java.io.Closeable) r16)     // Catch:{ Throwable -> 0x0298 }
            if (r13 == 0) goto L_0x0298
            r13.cancel()     // Catch:{ Throwable -> 0x0298 }
        L_0x0298:
            throw r0
        L_0x0299:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.utils.RetrofitUtils.downloadFile(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.bytedance.frameworks.baselib.network.http.util.d, java.lang.String, com.bytedance.frameworks.baselib.network.http.util.h, java.util.List, java.lang.String[], int[]):boolean");
    }
}

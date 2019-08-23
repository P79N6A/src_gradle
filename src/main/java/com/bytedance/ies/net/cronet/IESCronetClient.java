package com.bytedance.ies.net.cronet;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.frameworks.baselib.network.http.util.UrlUtils;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.mime.f;
import com.bytedance.ttnet.b.d;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.ss.android.common.http.a.a;
import com.ss.android.common.http.b;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.common.util.c;
import com.ss.android.common.util.h;
import com.ss.android.http.a.b.e;
import java.io.File;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import org.apache.http.client.RedirectHandler;

public class IESCronetClient implements b {

    /* renamed from: e  reason: collision with root package name */
    private static Map<String, Retrofit> f20859e = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public d f20860a;

    /* renamed from: b  reason: collision with root package name */
    public b f20861b;

    /* renamed from: c  reason: collision with root package name */
    private final String f20862c = " cronet/1.0.3.2";

    /* renamed from: d  reason: collision with root package name */
    private List<Interceptor> f20863d = new ArrayList();

    @Retention(RetentionPolicy.SOURCE)
    public @interface Method {
    }

    public static class a implements com.ss.android.common.http.d {

        /* renamed from: a  reason: collision with root package name */
        Call f20867a;

        public final void a() {
            if (this.f20867a != null) {
                this.f20867a.cancel();
            }
        }

        public a(Call call) {
            this.f20867a = call;
        }
    }

    public final byte[] a(int i, String str) throws Exception {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> parseUrl = UrlUtils.parseUrl(str, linkedHashMap);
        String str2 = (String) parseUrl.second;
        IIESNetworkApi a2 = a((String) parseUrl.first);
        if (a2 != null) {
            SsResponse execute = a2.downloadFile(true, i, str2, linkedHashMap).execute();
            if (execute.isSuccessful()) {
                TypedInput typedInput = (TypedInput) execute.body();
                if (typedInput != null) {
                    InputStream in = typedInput.in();
                    String a3 = a(execute.headers(), "Content-Length");
                    long j = -1;
                    if (a3 != null) {
                        j = Long.parseLong(a3);
                    }
                    return NetworkUtils.stream2ByteArray(i, in, j);
                }
            }
        }
        return null;
    }

    public final boolean a(int i, String str, String str2, String str3, String str4, c<String> cVar, String str5, h hVar, List<e> list, String[] strArr, int[] iArr) throws Exception {
        final String str6 = str;
        h hVar2 = hVar;
        String[] strArr2 = strArr;
        int[] iArr2 = iArr;
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        String str7 = null;
        try {
            String userAgent = NetworkUtils.getUserAgent();
            if (TextUtils.isEmpty(userAgent)) {
                userAgent = userAgent + " cronet/1.0.3.2";
            }
            arrayList.add(new Header("User-Agent", userAgent));
            if (list != null) {
                for (e next : list) {
                    arrayList.add(new Header(next.a(), next.b()));
                }
            }
            if (hVar2 == null || !hVar2.f28335a) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Pair<String, String> parseUrl = UrlUtils.parseUrl(str6, linkedHashMap);
                String str8 = (String) parseUrl.second;
                IIESNetworkApi a2 = a((String) parseUrl.first);
                if (a2 != null) {
                    final Call downloadFile = a2.downloadFile(true, i, str8, linkedHashMap, arrayList, this.f20860a);
                    SsResponse execute = downloadFile.execute();
                    if (execute.isSuccessful()) {
                        TypedInput typedInput = (TypedInput) execute.body();
                        if (typedInput != null) {
                            InputStream in = typedInput.in();
                            List<Header> headers = execute.headers();
                            long j = -1;
                            if (headers != null && !headers.isEmpty()) {
                                for (Header next2 : headers) {
                                    if ("Content-Length".equals(next2.getName())) {
                                        String value = next2.getValue();
                                        if (!TextUtils.isEmpty(value)) {
                                            j = Long.parseLong(value);
                                        }
                                    } else if ("Content-Encoding".equals(next2.getName())) {
                                        String value2 = next2.getValue();
                                        if (!TextUtils.isEmpty(value2) && "gzip".equalsIgnoreCase(value2)) {
                                            in = new GZIPInputStream(in);
                                        }
                                    } else if ("x-snssdk.remoteaddr".equals(next2.getName())) {
                                        str7 = next2.getValue();
                                    }
                                }
                            }
                            String str9 = str7;
                            if (iArr2 != null) {
                                try {
                                    if (iArr2.length > 0) {
                                        iArr2[0] = 0;
                                        if (j <= 2147483647L) {
                                            iArr2[0] = (int) j;
                                        }
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    str7 = str9;
                                    a(strArr2, str7);
                                    throw th;
                                }
                            }
                            boolean stream2File = NetworkUtils.stream2File(in, j, new NetworkUtils.j() {
                                public final URI a() {
                                    try {
                                        return new URI(str6);
                                    } catch (Exception unused) {
                                        return null;
                                    }
                                }

                                public final void b() {
                                    if (downloadFile != null) {
                                        downloadFile.cancel();
                                    }
                                }
                            }, i, str2, str3, str4, cVar, str5, hVar);
                            a(strArr2, str9);
                            return stream2File;
                        }
                    } else {
                        throw new com.ss.android.http.a.a.b(execute.code(), a(execute.headers(), "Reason-Phrase"));
                    }
                }
                a(strArr2, (String) null);
                return false;
            }
            a(strArr2, (String) null);
            return false;
        } catch (Throwable th2) {
            th = th2;
            a(strArr2, str7);
            throw th;
        }
    }

    public final boolean a(int i, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3, c<String> cVar, String str2, h hVar, List<e> list, String[] strArr, int[] iArr, RedirectHandler redirectHandler) throws Exception {
        return a(i, str, stringBuffer.toString(), stringBuffer2.toString(), stringBuffer3.toString(), cVar, str2, hVar, list, strArr, iArr);
    }

    public final String a(int i, String str, com.ss.android.common.http.a.a aVar, com.ss.android.common.util.d<Long> dVar, long j, com.ss.android.common.http.d[] dVarArr) throws Exception {
        com.bytedance.retrofit2.mime.d dVar2 = new com.bytedance.retrofit2.mime.d();
        for (a.c next : aVar.f28293b) {
            if (next instanceof a.d) {
                dVar2.a(next.a(), new f((String) next.b()));
            } else if (next instanceof a.C0332a) {
                a.C0332a aVar2 = (a.C0332a) next;
                dVar2.a(aVar2.a(), new TypedByteArray(null, (byte[]) aVar2.b(), aVar2.f28296c));
            } else if (next instanceof a.b) {
                dVar2.a(next.a(), new com.bytedance.retrofit2.mime.e(null, (File) next.b()));
            }
        }
        return a(0, i, str, (Map<String, String>) null, (TypedOutput) dVar2, (List<Header>) null, (Object) this.f20860a, dVarArr);
    }

    public final String a(int i, int i2, String str, List<com.ss.android.http.a.a> list, boolean z, boolean z2, com.ss.android.http.a.b.f fVar, boolean z3) throws Exception {
        long j;
        String str2 = str;
        com.ss.android.http.a.b.f fVar2 = fVar;
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                for (com.ss.android.http.a.a next : list) {
                    String a2 = next.a();
                    String b2 = next.b();
                    if (a2 != null && a2.length() > 0) {
                        arrayList.add(new Header(a2, b2));
                    }
                }
            } catch (Exception e2) {
                e = e2;
                j = currentTimeMillis;
                NetworkUtils.handleApiError(str2, e, System.currentTimeMillis() - j, null);
                throw e;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> parseUrl = UrlUtils.parseUrl(str2, linkedHashMap);
        String str3 = (String) parseUrl.second;
        IIESNetworkApi a3 = a((String) parseUrl.first);
        if (a3 == null) {
            return null;
        }
        if (this.f20861b != null) {
            this.f20861b.a(str2);
        }
        Call doGet = a3.doGet(true, i2, str3, linkedHashMap, arrayList, this.f20860a);
        j = System.currentTimeMillis();
        try {
            SsResponse execute = doGet.execute();
            if (this.f20861b != null) {
                this.f20861b.a(str2, execute);
            }
            long currentTimeMillis2 = System.currentTimeMillis() - j;
            a(execute.headers(), "X-TT-LOGID");
            if (NetworkUtils.getCommandListener() != null) {
                String a4 = NetworkUtils.getCommandListener().a();
                if (!StringUtils.isEmpty(a4)) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Header next2 : execute.headers()) {
                        if (a4.equalsIgnoreCase(next2.getName())) {
                            arrayList2.add(next2.getValue());
                        }
                    }
                    NetworkUtils.getCommandListener().a(arrayList2);
                }
            }
            if (fVar2 != null) {
                for (Header next3 : execute.headers()) {
                    String name = next3.getName();
                    if ("ETag".equalsIgnoreCase(name) || "Last-Modified".equalsIgnoreCase(name) || "Cache-Control".equalsIgnoreCase(name) || "X-SS-SIGN".equalsIgnoreCase(name) || "X-TT-LOGID".equalsIgnoreCase(name)) {
                        fVar2.a((com.ss.android.http.a.a) new com.ss.android.http.a.b.a(name, next3.getValue()));
                    }
                }
            }
            if (execute.isSuccessful()) {
                String str4 = (String) execute.body();
                NetworkUtils.handleTimeStampFromResponse(str4);
                NetworkUtils.handleApiOk(str2, currentTimeMillis2, null);
                return str4;
            }
            throw new com.ss.android.http.a.a.b(execute.code(), a(execute.headers(), "Reason-Phrase"));
        } catch (Exception e3) {
            e = e3;
            NetworkUtils.handleApiError(str2, e, System.currentTimeMillis() - j, null);
            throw e;
        }
    }

    public final String a(int i, int i2, String str, List<e> list, boolean z, com.ss.android.common.http.d[] dVarArr, List<com.ss.android.http.a.a> list2) throws Exception {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (e next : list) {
            hashMap.put(next.a(), next.b());
        }
        if (list2 != null) {
            for (com.ss.android.http.a.a next2 : list2) {
                arrayList.add(new Header(next2.a(), next2.b()));
            }
        }
        return a(i, i2, str, (Map<String, String>) hashMap, (TypedOutput) null, (List<Header>) arrayList, (Object) this.f20860a, dVarArr);
    }

    public final String a(int i, int i2, String str, byte[] bArr, String str2, String str3, List<com.ss.android.http.a.a> list) throws Exception {
        String str4 = str2;
        String str5 = str3;
        ArrayList arrayList = new ArrayList();
        if (str4 != null) {
            arrayList.add(new Header("Content-Encoding", str2));
        }
        if (str5 != null && str3.length() > 0) {
            arrayList.add(new Header("Content-Type", str5));
        }
        if (list != null) {
            for (com.ss.android.http.a.a next : list) {
                arrayList.add(new Header(next.a(), next.b()));
            }
        }
        byte[] bArr2 = bArr;
        return a(i, i2, str, (Map<String, String>) null, (TypedOutput) new TypedByteArray(str5, bArr, new String[0]), (List<Header>) arrayList, (Object) this.f20860a, (com.ss.android.common.http.d[]) null);
    }

    public final IESCronetClient a(Interceptor interceptor) {
        if (interceptor != null) {
            this.f20863d.add(interceptor);
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public final IIESNetworkApi a(String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        Retrofit retrofit = f20859e.get(str);
        if (retrofit == null) {
            retrofit = RetrofitUtils.createSsRetrofit(str, this.f20863d, null);
            f20859e.put(str, retrofit);
        }
        return (IIESNetworkApi) RetrofitUtils.createService(retrofit, IIESNetworkApi.class);
    }

    public static String a(List<Header> list, String str) {
        if (list != null && !TextUtils.isEmpty(str)) {
            for (Header next : list) {
                if (str.equalsIgnoreCase(next.getName())) {
                    return next.getValue();
                }
            }
        }
        return null;
    }

    private static void a(String[] strArr, String str) {
        if (strArr != null && strArr.length != 0 && !TextUtils.isEmpty(str)) {
            try {
                strArr[0] = str;
            } catch (Throwable unused) {
            }
        }
    }

    public final String a(int i, int i2, String str, List<com.ss.android.http.a.a> list) throws Exception {
        long j;
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                for (com.ss.android.http.a.a next : list) {
                    String a2 = next.a();
                    String b2 = next.b();
                    if (a2 != null && a2.length() > 0) {
                        arrayList.add(new Header(a2, b2));
                    }
                }
            } catch (Exception e2) {
                e = e2;
                j = currentTimeMillis;
                NetworkUtils.handleApiError(str, e, System.currentTimeMillis() - j, null);
                throw e;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> parseUrl = UrlUtils.parseUrl(str, linkedHashMap);
        String str2 = (String) parseUrl.second;
        IIESNetworkApi a3 = a((String) parseUrl.first);
        if (a3 == null) {
            return null;
        }
        if (this.f20861b != null) {
            this.f20861b.a(str);
        }
        Call doDetete = a3.doDetete(i2, str2, linkedHashMap, arrayList, this.f20860a);
        j = System.currentTimeMillis();
        try {
            SsResponse execute = doDetete.execute();
            if (this.f20861b != null) {
                this.f20861b.a(str, execute);
            }
            long currentTimeMillis2 = System.currentTimeMillis() - j;
            if (NetworkUtils.getCommandListener() != null) {
                String a4 = NetworkUtils.getCommandListener().a();
                if (!StringUtils.isEmpty(a4)) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Header next2 : execute.headers()) {
                        if (a4.equalsIgnoreCase(next2.getName())) {
                            arrayList2.add(next2.getValue());
                        }
                    }
                    NetworkUtils.getCommandListener().a(arrayList2);
                }
            }
            if (execute.isSuccessful()) {
                String str3 = (String) execute.body();
                NetworkUtils.handleTimeStampFromResponse(str3);
                NetworkUtils.handleApiOk(str, currentTimeMillis2, null);
                return str3;
            }
            throw new com.ss.android.http.a.a.b(execute.code(), a(execute.headers(), "Reason-Phrase"));
        } catch (Exception e3) {
            e = e3;
            NetworkUtils.handleApiError(str, e, System.currentTimeMillis() - j, null);
            throw e;
        }
    }

    public final String a(int i, int i2, String str, byte[] bArr, String str2, String str3) throws Exception {
        return a(i, i2, str, bArr, str2, str3, (List<com.ss.android.http.a.a>) null);
    }

    public final String a(int i, int i2, String str, List<e> list, com.ss.android.common.http.a.a aVar, com.ss.android.common.http.d[] dVarArr) throws Exception {
        ArrayList arrayList = new ArrayList();
        com.bytedance.retrofit2.mime.d dVar = new com.bytedance.retrofit2.mime.d();
        for (e next : list) {
            dVar.a(next.a(), new f(next.b()));
        }
        for (a.c next2 : aVar.f28293b) {
            if (next2 instanceof a.d) {
                dVar.a(next2.a(), new f((String) next2.b()));
            } else if (next2 instanceof a.C0332a) {
                a.C0332a aVar2 = (a.C0332a) next2;
                dVar.a(aVar2.a(), new TypedByteArray(null, (byte[]) aVar2.b(), aVar2.f28296c));
            } else if (next2 instanceof a.b) {
                dVar.a(next2.a(), new com.bytedance.retrofit2.mime.e(null, (File) next2.b()));
            }
        }
        return a(i, i2, str, (Map<String, String>) null, (TypedOutput) dVar, (List<Header>) arrayList, (Object) this.f20860a, dVarArr);
    }

    public final String b(int i, int i2, String str, List<e> list, boolean z, com.ss.android.common.http.d[] dVarArr, List<com.ss.android.http.a.a> list2) throws Exception {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (e next : list) {
            hashMap.put(next.a(), next.b());
        }
        if (list2 != null) {
            for (com.ss.android.http.a.a next2 : list2) {
                arrayList.add(new Header(next2.a(), next2.b()));
            }
        }
        return b(i, i2, str, hashMap, null, arrayList, this.f20860a, dVarArr);
    }

    public final String b(int i, int i2, String str, byte[] bArr, String str2, String str3, List<com.ss.android.http.a.a> list) throws Exception {
        String str4 = str2;
        String str5 = str3;
        ArrayList arrayList = new ArrayList();
        if (str4 != null) {
            arrayList.add(new Header("Content-Encoding", str2));
        }
        if (str5 != null && str3.length() > 0) {
            arrayList.add(new Header("Content-Type", str5));
        }
        if (list != null) {
            for (com.ss.android.http.a.a next : list) {
                arrayList.add(new Header(next.a(), next.b()));
            }
        }
        byte[] bArr2 = bArr;
        return b(i, i2, str, null, new TypedByteArray(str5, bArr, new String[0]), arrayList, this.f20860a, null);
    }

    private String a(int i, int i2, String str, Map<String, String> map, TypedOutput typedOutput, List<Header> list, Object obj, com.ss.android.common.http.d[] dVarArr) throws Exception {
        return a("post", i2, str, map, typedOutput, list, obj, dVarArr);
    }

    private String b(int i, int i2, String str, Map<String, String> map, TypedOutput typedOutput, List<Header> list, Object obj, com.ss.android.common.http.d[] dVarArr) throws Exception {
        return a("put", i2, str, map, typedOutput, list, obj, dVarArr);
    }

    private String a(String str, int i, String str2, Map<String, String> map, TypedOutput typedOutput, List<Header> list, Object obj, com.ss.android.common.http.d[] dVarArr) throws Exception {
        long j;
        Call call;
        HashMap hashMap;
        String str3 = str;
        String str4 = str2;
        com.ss.android.common.http.d[] dVarArr2 = dVarArr;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return null;
        }
        if ("get".equals(str3)) {
            throw new RuntimeException("doInternal不支持get");
        } else if (!"delete".equals(str3)) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Pair<String, String> parseUrl = UrlUtils.parseUrl(str4, linkedHashMap);
                String str5 = (String) parseUrl.second;
                IIESNetworkApi a2 = a((String) parseUrl.first);
                if (a2 == null) {
                    return null;
                }
                if (typedOutput == null) {
                    if (map == null) {
                        hashMap = new HashMap();
                    } else {
                        hashMap = map;
                    }
                    if ("put".equals(str3)) {
                        call = a2.doPut(i, str5, linkedHashMap, hashMap, list, obj);
                    } else {
                        call = a2.doPost(i, str5, linkedHashMap, hashMap, list, obj);
                    }
                } else if ("put".equals(str3)) {
                    call = a2.putBody(i, str5, linkedHashMap, typedOutput, list, obj);
                } else {
                    call = a2.postBody(i, str5, linkedHashMap, typedOutput, list, obj);
                }
                if (dVarArr2 != null && dVarArr2.length > 0) {
                    dVarArr2[0] = new a(call);
                }
                j = System.currentTimeMillis();
                try {
                    if (this.f20861b != null) {
                        this.f20861b.a(str4);
                    }
                    SsResponse execute = call.execute();
                    if (this.f20861b != null) {
                        this.f20861b.a(str4, execute);
                    }
                    long currentTimeMillis = System.currentTimeMillis() - j;
                    a(execute.headers(), "X-TT-LOGID");
                    if (NetworkUtils.getCommandListener() != null) {
                        String a3 = NetworkUtils.getCommandListener().a();
                        if (!StringUtils.isEmpty(a3)) {
                            ArrayList arrayList = new ArrayList();
                            for (Header next : execute.headers()) {
                                if (a3.equalsIgnoreCase(next.getName())) {
                                    arrayList.add(next.getValue());
                                }
                            }
                            NetworkUtils.getCommandListener().a(arrayList);
                        }
                    }
                    if (execute.isSuccessful()) {
                        String str6 = (String) execute.body();
                        NetworkUtils.handleTimeStampFromResponse(str6);
                        NetworkUtils.handleApiOk(str4, currentTimeMillis, null);
                        return str6;
                    }
                    throw new com.ss.android.http.a.a.b(execute.code(), a(execute.headers(), "Reason-Phrase"));
                } catch (Exception e2) {
                    e = e2;
                    NetworkUtils.handleApiError(str4, e, System.currentTimeMillis() - j, null);
                    throw e;
                }
            } catch (Exception e3) {
                e = e3;
                j = System.currentTimeMillis();
                NetworkUtils.handleApiError(str4, e, System.currentTimeMillis() - j, null);
                throw e;
            }
        } else {
            throw new RuntimeException("doInternal暂时不支持delete");
        }
    }
}

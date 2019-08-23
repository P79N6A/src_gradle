package com.bytedance.ttnet.b;

import android.util.Pair;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.frameworks.baselib.network.http.f;
import com.bytedance.frameworks.baselib.network.http.util.i;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.utils.RetrofitUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

public final class c {
    public static String a(String str, Map<String, String> map, Map<String, List<String>> map2, a aVar) throws Throwable {
        String str2;
        String str3;
        HttpURLConnection httpURLConnection = null;
        if (StringUtils.isEmpty(str) || !NetworkUtils.isNetworkAvailable(TTNetInit.getTTNetDepend().a())) {
            return null;
        }
        try {
            final String a2 = e.a(str, true);
            final HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(a2).openConnection();
            try {
                httpURLConnection2.setRequestMethod("GET");
                httpURLConnection2.setConnectTimeout(e.d());
                httpURLConnection2.setReadTimeout(e.e());
                httpURLConnection2.setInstanceFollowRedirects(true);
                httpURLConnection2.setRequestProperty("Accept-Encoding", "gzip");
                if (aVar.h) {
                    str2 = " HttpsURLConnection";
                } else {
                    str2 = " HttpURLConnection";
                }
                httpURLConnection2.setRequestProperty("User-Agent", e.f() + str2);
                int responseCode = httpURLConnection2.getResponseCode();
                aVar.f22549a = responseCode;
                if (!aVar.h) {
                    aVar.f22553e = httpURLConnection2.getHeaderField("X-SS-SIGN");
                }
                if (responseCode == 200) {
                    InputStream inputStream = httpURLConnection2.getInputStream();
                    boolean equals = "gzip".equals(httpURLConnection2.getHeaderField("Content-Encoding"));
                    String headerField = httpURLConnection2.getHeaderField("Content-Type");
                    boolean a3 = com.bytedance.frameworks.baselib.network.http.d.e.a(headerField);
                    Pair<String, String> parseContentType = RetrofitUtils.parseContentType(headerField);
                    if (parseContentType == null || parseContentType.second == null || !Charset.isSupported((String) parseContentType.second)) {
                        str3 = null;
                    } else {
                        str3 = (String) parseContentType.second;
                    }
                    if (str3 == null) {
                        str3 = "UTF-8";
                    }
                    int[] iArr = {0};
                    byte[] a4 = com.bytedance.frameworks.baselib.network.http.d.e.a(equals, -1, inputStream, iArr, new f() {
                        public final URI a() {
                            try {
                                return i.a(a2);
                            } catch (RuntimeException unused) {
                                return null;
                            }
                        }

                        public final void b() {
                            try {
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    if (a4 != null && iArr[0] > 0) {
                        if (iArr[0] <= a4.length) {
                            if (a3) {
                                com.bytedance.frameworks.baselib.network.http.d.e.a(a4, iArr[0]);
                            }
                            String str4 = new String(a4, 0, iArr[0], str3);
                            if (httpURLConnection2 != null) {
                                try {
                                    httpURLConnection2.disconnect();
                                } catch (Exception unused) {
                                }
                            }
                            return str4;
                        }
                    }
                    if (httpURLConnection2 != null) {
                        try {
                            httpURLConnection2.disconnect();
                        } catch (Exception unused2) {
                        }
                    }
                    return null;
                }
                throw new IOException("err status = " + responseCode);
            } catch (Throwable th) {
                th = th;
                if (httpURLConnection2 != null) {
                    try {
                        httpURLConnection2.disconnect();
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }
}

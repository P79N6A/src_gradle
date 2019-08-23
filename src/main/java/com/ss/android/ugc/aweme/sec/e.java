package com.ss.android.ugc.aweme.sec;

import com.bytedance.common.utility.Logger;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.client.Response;
import com.bytedance.retrofit2.mime.TypedInput;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.BufferedSource;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63765a;

    public static String a(Response response) throws IOException {
        String str;
        Response response2 = response;
        if (PatchProxy.isSupport(new Object[]{response2}, null, f63765a, true, 71091, new Class[]{Response.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{response2}, null, f63765a, true, 71091, new Class[]{Response.class}, String.class);
        }
        TypedInput body = response.getBody();
        if (body != null) {
            InputStream in = response.getBody().in();
            Header firstHeader = response2.getFirstHeader("Content-Type");
            try {
                MediaType parse = MediaType.parse(body.mimeType());
                String str2 = null;
                if (parse != null) {
                    str = parse.toString();
                } else if (firstHeader == null) {
                    str = null;
                } else {
                    str = firstHeader.getValue();
                }
                if (str == null) {
                    str = "";
                }
                boolean testIsSSBinary = NetworkUtils.testIsSSBinary(str);
                if (body.length() > 2147483647L) {
                    return null;
                }
                if (parse != null) {
                    if (parse.charset() != null) {
                        str2 = parse.charset().name();
                    }
                }
                if (str2 == null) {
                    str2 = "UTF-8";
                }
                String response2String = NetworkUtils.response2String(false, testIsSSBinary, 0, in, str2);
                in.reset();
                return response2String;
            } finally {
                in.reset();
            }
        } else {
            throw new IllegalArgumentException("HTTP body may not be null");
        }
    }

    public static String a(okhttp3.Response response) throws IOException {
        String str;
        okhttp3.Response response2 = response;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{response2}, null, f63765a, true, 71090, new Class[]{okhttp3.Response.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{response2}, null, f63765a, true, 71090, new Class[]{okhttp3.Response.class}, String.class);
        }
        ResponseBody body = response.body();
        if (body != null) {
            BufferedSource source = response.body().source();
            source.request(Long.MAX_VALUE);
            InputStream inputStream = source.buffer().clone().inputStream();
            String header = response2.header("Content-Encoding");
            if (header == null || !"gzip".equalsIgnoreCase(header)) {
                Logger.debug();
                z = false;
            }
            try {
                MediaType contentType = body.contentType();
                if (contentType != null) {
                    str = contentType.toString();
                } else {
                    str = response2.header("Content-Type");
                }
                if (str == null) {
                    str = "";
                }
                boolean testIsSSBinary = NetworkUtils.testIsSSBinary(str);
                long contentLength = body.contentLength();
                String str2 = null;
                if (contentLength > 2147483647L) {
                    return null;
                }
                if (contentType != null) {
                    if (contentType.charset() != null) {
                        str2 = contentType.charset().name();
                    }
                }
                if (str2 == null) {
                    str2 = "UTF-8";
                }
                String response2String = NetworkUtils.response2String(z, testIsSSBinary, 0, inputStream, str2);
                NetworkUtils.safeClose(inputStream);
                return response2String;
            } finally {
                NetworkUtils.safeClose(inputStream);
            }
        } else {
            throw new IllegalArgumentException("HTTP body may not be null");
        }
    }
}

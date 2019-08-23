package com.bytedance.android.livesdk.gift.a;

import android.text.TextUtils;
import com.bytedance.android.livesdkapi.host.h;
import com.bytedance.android.livesdkapi.i.d;
import com.bytedance.android.livesdkapi.i.e;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.client.Response;
import com.bytedance.retrofit2.mime.TypedInput;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.network.IDownloadHttpConnection;
import com.ss.android.socialbase.downloader.network.IDownloadHttpService;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public final class b implements IDownloadHttpService {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14695a;

    /* renamed from: b  reason: collision with root package name */
    e<d> f14696b;

    /* renamed from: c  reason: collision with root package name */
    d f14697c;

    public final IDownloadHttpConnection downloadWithConnection(int i, String str, List<HttpHeader> list) throws IOException {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str, list}, this, f14695a, false, 9380, new Class[]{Integer.TYPE, String.class, List.class}, IDownloadHttpConnection.class)) {
            return (IDownloadHttpConnection) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str, list}, this, f14695a, false, 9380, new Class[]{Integer.TYPE, String.class, List.class}, IDownloadHttpConnection.class);
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (HttpHeader next : list) {
                arrayList.add(new com.bytedance.android.live.base.model.e(next.getName(), next.getValue()));
            }
        }
        arrayList.add(new com.bytedance.android.live.base.model.e("Accept-Encoding", "identity"));
        this.f14696b = ((h) com.bytedance.android.live.utility.b.a(h.class)).a(false, i, str, arrayList, null);
        this.f14697c = (d) this.f14696b.a();
        if (this.f14697c == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (this.f14697c.f18819c != null) {
            for (com.bytedance.android.live.base.model.e next2 : this.f14697c.f18819c) {
                arrayList2.add(new Header(next2.getName(), next2.getValue()));
            }
        }
        final Response response = new Response(str, this.f14697c.f18818b, this.f14697c.f18822f, arrayList2, new TypedInput() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f14698a;

            public final String mimeType() {
                return b.this.f14697c.f18820d;
            }

            public final long length() throws IOException {
                return (long) b.this.f14697c.f18821e.length;
            }

            public final InputStream in() throws IOException {
                if (!PatchProxy.isSupport(new Object[0], this, f14698a, false, 9383, new Class[0], InputStream.class)) {
                    return new ByteArrayInputStream(b.this.f14697c.f18821e);
                }
                return (InputStream) PatchProxy.accessDispatch(new Object[0], this, f14698a, false, 9383, new Class[0], InputStream.class);
            }
        });
        final InputStream in = new TypedInput() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f14700a;

            public final String mimeType() {
                return b.this.f14697c.f18820d;
            }

            public final long length() throws IOException {
                return (long) b.this.f14697c.f18821e.length;
            }

            public final InputStream in() throws IOException {
                if (!PatchProxy.isSupport(new Object[0], this, f14700a, false, 9384, new Class[0], InputStream.class)) {
                    return new ByteArrayInputStream(b.this.f14697c.f18821e);
                }
                return (InputStream) PatchProxy.accessDispatch(new Object[0], this, f14700a, false, 9384, new Class[0], InputStream.class);
            }
        }.in();
        return new IDownloadHttpConnection() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f14702a;

            public final void end() {
            }

            public final InputStream getInputStream() throws IOException {
                return in;
            }

            public final int a() throws IOException {
                if (!PatchProxy.isSupport(new Object[0], this, f14702a, false, 9386, new Class[0], Integer.TYPE)) {
                    return response.getStatus();
                }
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f14702a, false, 9386, new Class[0], Integer.TYPE)).intValue();
            }

            public final void b() {
                if (PatchProxy.isSupport(new Object[0], this, f14702a, false, 9387, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f14702a, false, 9387, new Class[0], Void.TYPE);
                    return;
                }
                if (b.this.f14696b != null) {
                    try {
                        b.this.f14696b.b();
                    } catch (IOException unused) {
                    }
                }
            }

            public final String a(String str) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{str2}, this, f14702a, false, 9385, new Class[]{String.class}, String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f14702a, false, 9385, new Class[]{String.class}, String.class);
                }
                b bVar = b.this;
                List<Header> headers = response.getHeaders();
                if (PatchProxy.isSupport(new Object[]{headers, str2}, bVar, b.f14695a, false, 9382, new Class[]{List.class, String.class}, String.class)) {
                    Object[] objArr = {headers, str2};
                    Class[] clsArr = {List.class, String.class};
                    return (String) PatchProxy.accessDispatch(objArr, bVar, b.f14695a, false, 9382, clsArr, String.class);
                }
                if (headers != null && !TextUtils.isEmpty(str)) {
                    for (Header header : headers) {
                        if (str2.equalsIgnoreCase(header.getName())) {
                            return header.getValue();
                        }
                    }
                }
                return null;
            }
        };
    }
}

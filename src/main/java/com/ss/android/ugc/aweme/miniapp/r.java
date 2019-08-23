package com.ss.android.ugc.aweme.miniapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Pair;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.frameworks.baselib.network.http.a.b;
import com.bytedance.frameworks.baselib.network.http.util.UrlUtils;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.e;
import com.bytedance.retrofit2.mime.f;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.b.d;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.option.net.AbstractHostOptionNetDepend;
import com.tt.option.net.HostOptionNetDepend;
import com.tt.option.net.TmaFileRequest;
import com.tt.option.net.TmaFileResponse;
import com.tt.option.net.TmaRequest;
import com.tt.option.net.TmaResponse;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public final class r extends AbstractHostOptionNetDepend {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55901a;

    /* renamed from: b  reason: collision with root package name */
    private Context f55902b;

    public enum a {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        final int nativeInt;

        private a(int i) {
            this.nativeInt = i;
        }
    }

    r(Context context) {
        this.f55902b = context.getApplicationContext();
    }

    @Nullable
    private d a(TmaRequest tmaRequest) {
        if (PatchProxy.isSupport(new Object[]{tmaRequest}, this, f55901a, false, 59065, new Class[]{TmaRequest.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{tmaRequest}, this, f55901a, false, 59065, new Class[]{TmaRequest.class}, d.class);
        }
        d dVar = null;
        if (tmaRequest != null) {
            dVar = new d();
            dVar.f19738c = tmaRequest.getConnectTimeOut();
            dVar.f19739d = tmaRequest.getReadTimeOut();
            dVar.f19740e = tmaRequest.getWriteTimeOut();
        }
        return dVar;
    }

    public final TmaResponse doGet(@NonNull TmaRequest tmaRequest) throws Exception {
        if (PatchProxy.isSupport(new Object[]{tmaRequest}, this, f55901a, false, 59064, new Class[]{TmaRequest.class}, TmaResponse.class)) {
            return (TmaResponse) PatchProxy.accessDispatch(new Object[]{tmaRequest}, this, f55901a, false, 59064, new Class[]{TmaRequest.class}, TmaResponse.class);
        }
        d a2 = a(tmaRequest);
        TmaResponse tmaResponse = new TmaResponse();
        if (StringUtils.isEmpty(tmaRequest.getUrl())) {
            tmaResponse.setMessage("url is null");
            return tmaResponse;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> parseUrl = UrlUtils.parseUrl(tmaRequest.getUrl(), linkedHashMap);
        String str = (String) parseUrl.second;
        INetworkApi iNetworkApi = (INetworkApi) RetrofitUtils.createSsService((String) parseUrl.first, INetworkApi.class);
        LinkedList linkedList = new LinkedList();
        if (tmaRequest.getHeaders() != null && !tmaRequest.getHeaders().isEmpty()) {
            for (Map.Entry next : tmaRequest.getHeaders().entrySet()) {
                linkedList.add(new Header((String) next.getKey(), (String) next.getValue()));
            }
        }
        if (iNetworkApi != null) {
            try {
                SsResponse execute = iNetworkApi.doGet(true, -1, str, linkedHashMap, linkedList, a2).execute();
                tmaResponse.setCode(execute.code());
                tmaResponse.setMessage(execute.raw().getReason());
                tmaResponse.setData((String) execute.body());
            } catch (b e2) {
                tmaResponse.setMessage(e2.getClass() + ":" + e2.getMessage());
                tmaResponse.setCode(e2.getStatusCode());
                tmaResponse.setThrowable(e2);
            } catch (com.bytedance.frameworks.baselib.network.http.cronet.a.a e3) {
                tmaResponse.setMessage(e3.getClass() + ":" + e3.getMessage());
                tmaResponse.setThrowable(e3);
            }
        }
        return tmaResponse;
    }

    public final TmaResponse doPostBody(@NonNull TmaRequest tmaRequest) throws Exception {
        byte[] bArr;
        String str;
        if (PatchProxy.isSupport(new Object[]{tmaRequest}, this, f55901a, false, 59066, new Class[]{TmaRequest.class}, TmaResponse.class)) {
            return (TmaResponse) PatchProxy.accessDispatch(new Object[]{tmaRequest}, this, f55901a, false, 59066, new Class[]{TmaRequest.class}, TmaResponse.class);
        }
        TmaResponse tmaResponse = new TmaResponse();
        if (StringUtils.isEmpty(tmaRequest.getUrl())) {
            tmaResponse.setMessage("url is null");
            return tmaResponse;
        }
        d a2 = a(tmaRequest);
        if (tmaRequest.isNeedCompressParams()) {
            Pair<byte[], String> a3 = a(tmaRequest.getPostParamsJsonStr().getBytes(), a.GZIP);
            bArr = (byte[]) a3.first;
            str = (String) a3.second;
        } else {
            bArr = tmaRequest.getPostParamsJsonStr().getBytes();
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(new Header("Content-Encoding", str));
        }
        arrayList.add(new Header("Content-Type", "application/json; charset=utf-8"));
        if (tmaRequest.getHeaders() != null && !tmaRequest.getHeaders().isEmpty()) {
            for (Map.Entry next : tmaRequest.getHeaders().entrySet()) {
                arrayList.add(new Header((String) next.getKey(), (String) next.getValue()));
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> parseUrl = UrlUtils.parseUrl(tmaRequest.getUrl(), linkedHashMap);
        String str2 = (String) parseUrl.second;
        IAppbrandNetworkApi iAppbrandNetworkApi = (IAppbrandNetworkApi) RetrofitUtils.createSsService((String) parseUrl.first, IAppbrandNetworkApi.class);
        if (iAppbrandNetworkApi != null) {
            try {
                SsResponse execute = iAppbrandNetworkApi.postBody(-1, str2, linkedHashMap, new TypedByteArray(null, bArr, new String[0]), arrayList, a2).execute();
                tmaResponse.setCode(execute.code());
                tmaResponse.setMessage(execute.raw().getReason());
                tmaResponse.setData((String) execute.body());
            } catch (b e2) {
                tmaResponse.setMessage(e2.getClass() + ":" + e2.getMessage());
                tmaResponse.setCode(e2.getStatusCode());
                tmaResponse.setThrowable(e2);
            } catch (com.bytedance.frameworks.baselib.network.http.cronet.a.a e3) {
                tmaResponse.setMessage(e3.getClass() + ":" + e3.getMessage());
                tmaResponse.setThrowable(e3);
            }
        }
        return tmaResponse;
    }

    public final TmaResponse postMultiPart(@NonNull TmaRequest tmaRequest) throws Exception {
        if (PatchProxy.isSupport(new Object[]{tmaRequest}, this, f55901a, false, 59067, new Class[]{TmaRequest.class}, TmaResponse.class)) {
            return (TmaResponse) PatchProxy.accessDispatch(new Object[]{tmaRequest}, this, f55901a, false, 59067, new Class[]{TmaRequest.class}, TmaResponse.class);
        }
        TmaResponse tmaResponse = new TmaResponse();
        if (StringUtils.isEmpty(tmaRequest.getUrl())) {
            tmaResponse.setMessage("url is null");
            return tmaResponse;
        }
        ArrayList arrayList = new ArrayList();
        if (tmaRequest.getHeaders() != null && !tmaRequest.getHeaders().isEmpty()) {
            for (Map.Entry next : tmaRequest.getHeaders().entrySet()) {
                arrayList.add(new Header((String) next.getKey(), (String) next.getValue()));
            }
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry next2 : tmaRequest.getPostParams().entrySet()) {
            hashMap.put(next2.getKey(), new f(next2.getValue().toString()));
        }
        for (Map.Entry next3 : tmaRequest.getMultiPartMap().entrySet()) {
            TmaRequest.MultiPart multiPart = (TmaRequest.MultiPart) next3.getValue();
            hashMap.put((String) next3.getKey(), new e(multiPart.getMimeType(), multiPart.getFile()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> parseUrl = UrlUtils.parseUrl(tmaRequest.getUrl(), linkedHashMap);
        String str = (String) parseUrl.second;
        INetworkApi iNetworkApi = (INetworkApi) RetrofitUtils.createSsService((String) parseUrl.first, INetworkApi.class);
        if (iNetworkApi != null) {
            SsResponse execute = iNetworkApi.postMultiPart(-1, str, linkedHashMap, hashMap, arrayList).execute();
            tmaResponse.setCode(execute.code());
            tmaResponse.setMessage(execute.raw().getReason());
            tmaResponse.setData((String) execute.body());
        }
        return tmaResponse;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:19|20|21|22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r0 = new android.util.Pair<>(r1, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007d, code lost:
        return r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0075 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair<byte[], java.lang.String> a(byte[] r19, com.ss.android.ugc.aweme.miniapp.r.a r20) throws java.io.IOException {
        /*
            r1 = r19
            r0 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r1
            r11 = 1
            r3[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r5 = f55901a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<byte[]> r4 = byte[].class
            r8[r10] = r4
            java.lang.Class<com.ss.android.ugc.aweme.miniapp.r$a> r4 = com.ss.android.ugc.aweme.miniapp.r.a.class
            r8[r11] = r4
            java.lang.Class<android.util.Pair> r9 = android.util.Pair.class
            r4 = 0
            r6 = 1
            r7 = 59071(0xe6bf, float:8.2776E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0048
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r1
            r12[r11] = r0
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f55901a
            r15 = 1
            r16 = 59071(0xe6bf, float:8.2776E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<byte[]> r1 = byte[].class
            r0[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.miniapp.r$a> r1 = com.ss.android.ugc.aweme.miniapp.r.a.class
            r0[r11] = r1
            java.lang.Class<android.util.Pair> r18 = android.util.Pair.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            android.util.Pair r0 = (android.util.Pair) r0
            return r0
        L_0x0048:
            r2 = 0
            if (r1 != 0) goto L_0x0050
            android.util.Pair r3 = new android.util.Pair
            r3.<init>(r1, r2)
        L_0x0050:
            int r3 = r1.length     // Catch:{ Throwable -> 0x00b2 }
            com.ss.android.ugc.aweme.miniapp.r$a r4 = com.ss.android.ugc.aweme.miniapp.r.a.GZIP     // Catch:{ Throwable -> 0x00b2 }
            r5 = 128(0x80, float:1.794E-43)
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r4 != r0) goto L_0x0082
            if (r3 <= r5) goto L_0x0082
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x00b2 }
            r0.<init>(r6)     // Catch:{ Throwable -> 0x00b2 }
            java.util.zip.GZIPOutputStream r3 = new java.util.zip.GZIPOutputStream     // Catch:{ Throwable -> 0x00b2 }
            r3.<init>(r0)     // Catch:{ Throwable -> 0x00b2 }
            r3.write(r1)     // Catch:{ Throwable -> 0x0075 }
            r3.close()     // Catch:{ Throwable -> 0x00b2 }
            byte[] r0 = r0.toByteArray()     // Catch:{ Throwable -> 0x00b2 }
            java.lang.String r1 = "gzip"
        L_0x0071:
            r2 = r1
            goto L_0x00b3
        L_0x0073:
            r0 = move-exception
            goto L_0x007e
        L_0x0075:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x0073 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0073 }
            r3.close()     // Catch:{ Throwable -> 0x00b2 }
            return r0
        L_0x007e:
            r3.close()     // Catch:{ Throwable -> 0x00b2 }
            throw r0     // Catch:{ Throwable -> 0x00b2 }
        L_0x0082:
            com.ss.android.ugc.aweme.miniapp.r$a r4 = com.ss.android.ugc.aweme.miniapp.r.a.DEFLATER     // Catch:{ Throwable -> 0x00b2 }
            if (r4 != r0) goto L_0x00b2
            if (r3 <= r5) goto L_0x00b2
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x00b2 }
            r0.<init>(r6)     // Catch:{ Throwable -> 0x00b2 }
            java.util.zip.Deflater r3 = new java.util.zip.Deflater     // Catch:{ Throwable -> 0x00b2 }
            r3.<init>()     // Catch:{ Throwable -> 0x00b2 }
            r3.setInput(r1)     // Catch:{ Throwable -> 0x00b2 }
            r3.finish()     // Catch:{ Throwable -> 0x00b2 }
            byte[] r4 = new byte[r6]     // Catch:{ Throwable -> 0x00b2 }
        L_0x009a:
            boolean r5 = r3.finished()     // Catch:{ Throwable -> 0x00b2 }
            if (r5 != 0) goto L_0x00a8
            int r5 = r3.deflate(r4)     // Catch:{ Throwable -> 0x00b2 }
            r0.write(r4, r10, r5)     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x009a
        L_0x00a8:
            r3.end()     // Catch:{ Throwable -> 0x00b2 }
            byte[] r0 = r0.toByteArray()     // Catch:{ Throwable -> 0x00b2 }
            java.lang.String r1 = "deflate"
            goto L_0x0071
        L_0x00b2:
            r0 = r1
        L_0x00b3:
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.miniapp.r.a(byte[], com.ss.android.ugc.aweme.miniapp.r$a):android.util.Pair");
    }

    public final TmaFileResponse downloadFile(TmaFileRequest tmaFileRequest, HostOptionNetDepend.IDownloadListener iDownloadListener) {
        final HostOptionNetDepend.IDownloadListener iDownloadListener2 = iDownloadListener;
        if (PatchProxy.isSupport(new Object[]{tmaFileRequest, iDownloadListener2}, this, f55901a, false, 59068, new Class[]{TmaFileRequest.class, HostOptionNetDepend.IDownloadListener.class}, TmaFileResponse.class)) {
            return (TmaFileResponse) PatchProxy.accessDispatch(new Object[]{tmaFileRequest, iDownloadListener2}, this, f55901a, false, 59068, new Class[]{TmaFileRequest.class, HostOptionNetDepend.IDownloadListener.class}, TmaFileResponse.class);
        }
        File file = new File(tmaFileRequest.getTargetFileDir(), tmaFileRequest.getTargetFileName());
        if (file.exists()) {
            file.delete();
        }
        TmaFileResponse tmaFileResponse = new TmaFileResponse();
        try {
            try {
                AnonymousClass1 r5 = new com.bytedance.frameworks.baselib.network.http.util.d<String>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f55903a;

                    public final /* synthetic */ void a(int i, Object obj) {
                        String str = (String) obj;
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, f55903a, false, 59072, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, f55903a, false, 59072, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
                            return;
                        }
                        if (iDownloadListener2 != null) {
                            iDownloadListener2.updateProgress(i, -1, -1);
                        }
                    }
                };
                ArrayList arrayList = null;
                if (tmaFileRequest.getHeaders() != null && !tmaFileRequest.getHeaders().isEmpty()) {
                    arrayList = new ArrayList();
                    for (Map.Entry next : tmaFileRequest.getHeaders().entrySet()) {
                        arrayList.add(new Header((String) next.getKey(), (String) next.getValue()));
                    }
                }
                boolean a2 = a(-1, tmaFileRequest.getUrl(), tmaFileRequest.getTargetFileDir(), null, tmaFileRequest.getTargetFileName(), r5, "download", null, arrayList, null, null, tmaFileResponse);
                if (file.exists() && a2) {
                    tmaFileResponse.setDownloadedFile(file);
                }
            } catch (Exception e2) {
                e = e2;
                tmaFileResponse.setMessage(e.getMessage());
                tmaFileResponse.setThrowable(e);
                AppBrandLogger.e("NetworkWrapperImpl", "", e);
                return tmaFileResponse;
            }
        } catch (Exception e3) {
            e = e3;
            tmaFileResponse.setMessage(e.getMessage());
            tmaFileResponse.setThrowable(e);
            AppBrandLogger.e("NetworkWrapperImpl", "", e);
            return tmaFileResponse;
        }
        return tmaFileResponse;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.bytedance.frameworks.baselib.network.http.a r24, java.lang.String[] r25, java.util.List<com.bytedance.retrofit2.client.Header> r26, com.bytedance.ttnet.b.d r27, java.lang.Exception r28) {
        /*
            r0 = r24
            r1 = r25
            r3 = r27
            r4 = 5
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r12 = 0
            r5[r12] = r0
            r13 = 1
            r5[r13] = r1
            r14 = 2
            r5[r14] = r26
            r15 = 3
            r5[r15] = r3
            r16 = 4
            r5[r16] = r28
            com.meituan.robust.ChangeQuickRedirect r7 = f55901a
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class<com.bytedance.frameworks.baselib.network.http.a> r6 = com.bytedance.frameworks.baselib.network.http.a.class
            r10[r12] = r6
            java.lang.Class<java.lang.String[]> r6 = java.lang.String[].class
            r10[r13] = r6
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r10[r14] = r6
            java.lang.Class<com.bytedance.ttnet.b.d> r6 = com.bytedance.ttnet.b.d.class
            r10[r15] = r6
            java.lang.Class<java.lang.Exception> r6 = java.lang.Exception.class
            r10[r16] = r6
            java.lang.Class r11 = java.lang.Void.TYPE
            r6 = 0
            r8 = 1
            r9 = 59070(0xe6be, float:8.2775E-41)
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x0073
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r12] = r0
            r5[r13] = r1
            r5[r14] = r26
            r5[r15] = r3
            r5[r16] = r28
            r18 = 0
            com.meituan.robust.ChangeQuickRedirect r19 = f55901a
            r20 = 1
            r21 = 59070(0xe6be, float:8.2775E-41)
            java.lang.Class[] r0 = new java.lang.Class[r4]
            java.lang.Class<com.bytedance.frameworks.baselib.network.http.a> r1 = com.bytedance.frameworks.baselib.network.http.a.class
            r0[r12] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r13] = r1
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r0[r14] = r1
            java.lang.Class<com.bytedance.ttnet.b.d> r1 = com.bytedance.ttnet.b.d.class
            r0[r15] = r1
            java.lang.Class<java.lang.Exception> r1 = java.lang.Exception.class
            r0[r16] = r1
            java.lang.Class r23 = java.lang.Void.TYPE
            r17 = r5
            r22 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r17, r18, r19, r20, r21, r22, r23)
            return
        L_0x0073:
            r4 = 0
            if (r26 == 0) goto L_0x009d
            int r5 = r26.size()     // Catch:{ Throwable -> 0x00ca }
            if (r5 <= 0) goto L_0x009d
            java.util.Iterator r2 = r26.iterator()     // Catch:{ Throwable -> 0x00ca }
        L_0x0080:
            boolean r5 = r2.hasNext()     // Catch:{ Throwable -> 0x00ca }
            if (r5 == 0) goto L_0x009d
            java.lang.Object r5 = r2.next()     // Catch:{ Throwable -> 0x00ca }
            com.bytedance.retrofit2.client.Header r5 = (com.bytedance.retrofit2.client.Header) r5     // Catch:{ Throwable -> 0x00ca }
            java.lang.String r6 = "x-net-info.remoteaddr"
            java.lang.String r7 = r5.getName()     // Catch:{ Throwable -> 0x00ca }
            boolean r6 = r6.equalsIgnoreCase(r7)     // Catch:{ Throwable -> 0x00ca }
            if (r6 == 0) goto L_0x0080
            java.lang.String r4 = r5.getValue()     // Catch:{ Throwable -> 0x00ca }
            goto L_0x0080
        L_0x009d:
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x00ca }
            if (r2 == 0) goto L_0x00a5
            java.lang.String r4 = r3.f19736a     // Catch:{ Throwable -> 0x00ca }
        L_0x00a5:
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x00ca }
            if (r2 == 0) goto L_0x00af
            java.lang.String r4 = com.bytedance.ttnet.utils.RetrofitUtils.getHostAddress(r28)     // Catch:{ Throwable -> 0x00ca }
        L_0x00af:
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x00ca }
            if (r2 == 0) goto L_0x00b6
            return
        L_0x00b6:
            if (r1 == 0) goto L_0x00bd
            int r2 = r1.length     // Catch:{ Throwable -> 0x00ca }
            if (r2 <= 0) goto L_0x00bd
            r1[r12] = r4     // Catch:{ Throwable -> 0x00ca }
        L_0x00bd:
            if (r0 == 0) goto L_0x00c9
            r0.f19730a = r4     // Catch:{ Throwable -> 0x00ca }
            T r1 = r0.f19731b     // Catch:{ Throwable -> 0x00ca }
            if (r1 == 0) goto L_0x00c9
            T r0 = r0.f19731b     // Catch:{ Throwable -> 0x00ca }
            r0.f19736a = r4     // Catch:{ Throwable -> 0x00ca }
        L_0x00c9:
            return
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.miniapp.r.a(com.bytedance.frameworks.baselib.network.http.a, java.lang.String[], java.util.List, com.bytedance.ttnet.b.d, java.lang.Exception):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02c5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02c6, code lost:
        r24 = r6;
        r2 = r8;
        r8 = r16;
        r3 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02d0, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02d1, code lost:
        r2 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02d4, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02d5, code lost:
        r2 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02d8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02d9, code lost:
        r24 = r6;
        r2 = r8;
        r8 = r16;
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02e7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02e8, code lost:
        r24 = r6;
        r2 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02ec, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02ed, code lost:
        r2 = r8;
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02f2, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02f3, code lost:
        r2 = r8;
        r12 = r21;
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02fa, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02fb, code lost:
        r2 = r8;
        r6 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02fd, code lost:
        r3 = null;
        r8 = null;
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0306, code lost:
        r13.setCode(((com.bytedance.frameworks.baselib.network.http.a.b) r0).getStatusCode());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0338, code lost:
        r4 = com.bytedance.ttnet.utils.RetrofitUtils.getHeaderValueIgnoreCase(r3, "X-TT-LOGID");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x033f, code lost:
        r4 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0352, code lost:
        r5 = (com.bytedance.frameworks.baselib.network.http.a) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x035a, code lost:
        ((com.bytedance.retrofit2.i) r2).doCollect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0370, code lost:
        if (r5.g <= 0) goto L_0x0372;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0372, code lost:
        r5.g = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0374, code lost:
        r5.h = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0378, code lost:
        if (r5.w != null) goto L_0x037a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x037a, code lost:
        r5.w.put("ex", r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x03d5, code lost:
        r0 = (java.lang.Exception) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03d8, code lost:
        r0 = new java.lang.Exception(r0.getMessage(), r0.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x03ed, code lost:
        com.bytedance.frameworks.baselib.network.a.b.a().d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x03f9, code lost:
        r2.cancel();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02d0 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:80:0x01e0] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02d4 A[ExcHandler: Throwable (th java.lang.Throwable), Splitter:B:80:0x01e0] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02ec A[ExcHandler: all (th java.lang.Throwable), Splitter:B:57:0x01a1] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02f2 A[ExcHandler: Throwable (th java.lang.Throwable), Splitter:B:57:0x01a1] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0306 A[Catch:{ Throwable -> 0x039d, all -> 0x0398 }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0338 A[Catch:{ Throwable -> 0x039d, all -> 0x0398 }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x033f A[Catch:{ Throwable -> 0x039d, all -> 0x0398 }] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0352 A[Catch:{ Throwable -> 0x039d, all -> 0x0398 }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x035a A[Catch:{ Throwable -> 0x039d, all -> 0x0398 }] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x036a A[Catch:{ Throwable -> 0x039d, all -> 0x0398 }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x03d5 A[Catch:{ all -> 0x03e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03d8 A[Catch:{ all -> 0x03e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x03f9 A[Catch:{ Throwable -> 0x03fc }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01a1 A[SYNTHETIC, Splitter:B:57:0x01a1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(int r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, com.bytedance.frameworks.baselib.network.http.util.d<java.lang.String> r37, java.lang.String r38, com.bytedance.frameworks.baselib.network.http.util.h r39, java.util.List<com.bytedance.retrofit2.client.Header> r40, java.lang.String[] r41, int[] r42, @android.support.annotation.NonNull com.tt.option.net.TmaResponse r43) throws java.lang.Exception {
        /*
            r1 = r33
            r13 = r43
            r2 = 12
            java.lang.Object[] r14 = new java.lang.Object[r2]
            r3 = -1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r12 = 0
            r14[r12] = r4
            r21 = 1
            r14[r21] = r1
            r4 = 2
            r14[r4] = r34
            r5 = 3
            r8 = 0
            r14[r5] = r8
            r6 = 4
            r14[r6] = r36
            r22 = 5
            r14[r22] = r37
            r23 = 6
            r14[r23] = r38
            r24 = 7
            r14[r24] = r8
            r25 = 8
            r14[r25] = r40
            r26 = 9
            r14[r26] = r8
            r27 = 10
            r14[r27] = r8
            r28 = 11
            r14[r28] = r13
            com.meituan.robust.ChangeQuickRedirect r16 = f55901a
            java.lang.Class[] r15 = new java.lang.Class[r2]
            java.lang.Class r17 = java.lang.Integer.TYPE
            r15[r12] = r17
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            r15[r21] = r17
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            r15[r4] = r17
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            r15[r5] = r17
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            r15[r6] = r17
            java.lang.Class<com.bytedance.frameworks.baselib.network.http.util.d> r17 = com.bytedance.frameworks.baselib.network.http.util.d.class
            r15[r22] = r17
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            r15[r23] = r17
            java.lang.Class<com.bytedance.frameworks.baselib.network.http.util.h> r17 = com.bytedance.frameworks.baselib.network.http.util.h.class
            r15[r24] = r17
            java.lang.Class<java.util.List> r17 = java.util.List.class
            r15[r25] = r17
            java.lang.Class<java.lang.String[]> r17 = java.lang.String[].class
            r15[r26] = r17
            java.lang.Class<int[]> r17 = int[].class
            r15[r27] = r17
            java.lang.Class<com.tt.option.net.TmaResponse> r17 = com.tt.option.net.TmaResponse.class
            r15[r28] = r17
            java.lang.Class r20 = java.lang.Boolean.TYPE
            r17 = 0
            r18 = 1
            r19 = 59069(0xe6bd, float:8.2773E-41)
            r29 = r15
            r15 = r17
            r17 = r18
            r18 = r19
            r19 = r29
            boolean r14 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
            if (r14 == 0) goto L_0x00f9
            java.lang.Object[] r14 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r14[r12] = r3
            r14[r21] = r1
            r14[r4] = r34
            r14[r5] = r8
            r14[r6] = r36
            r14[r22] = r37
            r14[r23] = r38
            r14[r24] = r8
            r14[r25] = r40
            r14[r26] = r8
            r14[r27] = r8
            r14[r28] = r13
            r0 = 0
            com.meituan.robust.ChangeQuickRedirect r1 = f55901a
            r3 = 1
            r7 = 59069(0xe6bd, float:8.2773E-41)
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.Class r8 = java.lang.Integer.TYPE
            r2[r12] = r8
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r2[r21] = r8
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r2[r4] = r8
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r2[r5] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r2[r6] = r4
            java.lang.Class<com.bytedance.frameworks.baselib.network.http.util.d> r4 = com.bytedance.frameworks.baselib.network.http.util.d.class
            r2[r22] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r2[r23] = r4
            java.lang.Class<com.bytedance.frameworks.baselib.network.http.util.h> r4 = com.bytedance.frameworks.baselib.network.http.util.h.class
            r2[r24] = r4
            java.lang.Class<java.util.List> r4 = java.util.List.class
            r2[r25] = r4
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r2[r26] = r4
            java.lang.Class<int[]> r4 = int[].class
            r2[r27] = r4
            java.lang.Class<com.tt.option.net.TmaResponse> r4 = com.tt.option.net.TmaResponse.class
            r2[r28] = r4
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r32 = r14
            r33 = r0
            r34 = r1
            r35 = r3
            r36 = r7
            r37 = r2
            r38 = r4
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r32, r33, r34, r35, r36, r37, r38)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x00f9:
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r33)
            if (r2 == 0) goto L_0x0105
            java.lang.String r0 = "url is empty"
            r13.setMessage(r0)
            return r12
        L_0x0105:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            android.util.Pair r2 = com.bytedance.frameworks.baselib.network.http.util.UrlUtils.parseUrl(r1, r6)
            java.lang.Object r3 = r2.first
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.second
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Class<com.bytedance.ttnet.INetworkApi> r2 = com.bytedance.ttnet.INetworkApi.class
            java.lang.Object r2 = com.bytedance.ttnet.utils.RetrofitUtils.createSsService(r3, r2)
            com.bytedance.ttnet.INetworkApi r2 = (com.bytedance.ttnet.INetworkApi) r2
            com.bytedance.ttnet.b.d r14 = new com.bytedance.ttnet.b.d
            r14.<init>()
            r15 = -1
            if (r2 != 0) goto L_0x012e
            java.lang.String r0 = "createSsService fail"
            r13.setMessage(r0)
            return r12
        L_0x012e:
            r3 = 0
            r4 = -1
            r7 = r40
            r30 = r8
            r8 = r14
            com.bytedance.retrofit2.Call r8 = r2.downloadFile(r3, r4, r5, r6, r7, r8)     // Catch:{ Throwable -> 0x03cb, all -> 0x03c2 }
            com.bytedance.ttnet.c r2 = com.bytedance.ttnet.TTNetInit.getTTNetDepend()     // Catch:{ Throwable -> 0x03bb, all -> 0x03b4 }
            android.content.Context r2 = r2.a()     // Catch:{ Throwable -> 0x03bb, all -> 0x03b4 }
            boolean r2 = com.bytedance.common.utility.NetworkUtils.isNetworkAvailable(r2)     // Catch:{ Throwable -> 0x03bb, all -> 0x03b4 }
            if (r2 != 0) goto L_0x0160
            java.lang.String r0 = "network is not available"
            r13.setMessage(r0)     // Catch:{ Throwable -> 0x015b, all -> 0x0155 }
            com.bytedance.frameworks.baselib.network.http.d.e.a((java.io.Closeable) r30)     // Catch:{ Throwable -> 0x0154 }
            if (r8 == 0) goto L_0x0154
            r8.cancel()     // Catch:{ Throwable -> 0x0154 }
        L_0x0154:
            return r12
        L_0x0155:
            r0 = move-exception
            r2 = r8
            r16 = r30
            goto L_0x03c8
        L_0x015b:
            r0 = move-exception
        L_0x015c:
            r16 = r30
            goto L_0x03d1
        L_0x0160:
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x03bb, all -> 0x03b4 }
            com.bytedance.frameworks.baselib.network.http.e$e r2 = com.bytedance.frameworks.baselib.network.http.e.c()     // Catch:{ Throwable -> 0x03bb, all -> 0x03b4 }
            if (r2 == 0) goto L_0x0178
            boolean r2 = r2.b(r1)     // Catch:{ Throwable -> 0x015b, all -> 0x0155 }
            if (r2 == 0) goto L_0x0178
            com.bytedance.frameworks.baselib.network.a.b r2 = com.bytedance.frameworks.baselib.network.a.b.a()     // Catch:{ Throwable -> 0x015b, all -> 0x0155 }
            r2.c()     // Catch:{ Throwable -> 0x015b, all -> 0x0155 }
            goto L_0x017a
        L_0x0178:
            r21 = 0
        L_0x017a:
            com.bytedance.retrofit2.SsResponse r2 = r8.execute()     // Catch:{ Throwable -> 0x03ab, all -> 0x03a4 }
            if (r2 != 0) goto L_0x01a1
            java.lang.String r0 = "ssResponse is null"
            r13.setMessage(r0)     // Catch:{ Throwable -> 0x019d, all -> 0x0197 }
            if (r21 == 0) goto L_0x018e
            com.bytedance.frameworks.baselib.network.a.b r0 = com.bytedance.frameworks.baselib.network.a.b.a()
            r0.d()
        L_0x018e:
            com.bytedance.frameworks.baselib.network.http.d.e.a((java.io.Closeable) r30)     // Catch:{ Throwable -> 0x0196 }
            if (r8 == 0) goto L_0x0196
            r8.cancel()     // Catch:{ Throwable -> 0x0196 }
        L_0x0196:
            return r12
        L_0x0197:
            r0 = move-exception
            r2 = r8
            r16 = r30
            goto L_0x03eb
        L_0x019d:
            r0 = move-exception
            r12 = r21
            goto L_0x015c
        L_0x01a1:
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x02fa, Throwable -> 0x02f2, all -> 0x02ec }
            com.bytedance.retrofit2.client.Response r3 = r2.raw()     // Catch:{ Exception -> 0x02e7, Throwable -> 0x02f2, all -> 0x02ec }
            java.lang.Object r3 = r3.getExtraInfo()     // Catch:{ Exception -> 0x02e7, Throwable -> 0x02f2, all -> 0x02ec }
            boolean r4 = r3 instanceof com.bytedance.frameworks.baselib.network.http.a     // Catch:{ Exception -> 0x02e7, Throwable -> 0x02f2, all -> 0x02ec }
            if (r4 == 0) goto L_0x01bf
            com.bytedance.frameworks.baselib.network.http.a r3 = (com.bytedance.frameworks.baselib.network.http.a) r3     // Catch:{ Exception -> 0x01b5 }
            r15 = r3
            goto L_0x01c1
        L_0x01b5:
            r0 = move-exception
            r2 = r8
            r3 = r30
            r8 = r3
            r15 = r8
            r19 = r15
            goto L_0x0302
        L_0x01bf:
            r15 = r30
        L_0x01c1:
            if (r15 == 0) goto L_0x01cf
            r15.g = r6     // Catch:{ Exception -> 0x01c6 }
            goto L_0x01cf
        L_0x01c6:
            r0 = move-exception
            r2 = r8
            r3 = r30
            r8 = r3
            r19 = r8
            goto L_0x0302
        L_0x01cf:
            java.lang.Object r3 = r2.body()     // Catch:{ Exception -> 0x02e0, Throwable -> 0x02f2, all -> 0x02ec }
            com.bytedance.retrofit2.mime.TypedInput r3 = (com.bytedance.retrofit2.mime.TypedInput) r3     // Catch:{ Exception -> 0x02e0, Throwable -> 0x02f2, all -> 0x02ec }
            if (r3 == 0) goto L_0x01de
            java.io.InputStream r4 = r3.in()     // Catch:{ Exception -> 0x01c6 }
            r16 = r4
            goto L_0x01e0
        L_0x01de:
            r16 = r30
        L_0x01e0:
            java.util.List r12 = r2.headers()     // Catch:{ Exception -> 0x02d8, Throwable -> 0x02d4, all -> 0x02d0 }
            java.lang.String r4 = "X-TT-LOGID"
            java.lang.String r19 = com.bytedance.ttnet.utils.RetrofitUtils.getHeaderValueIgnoreCase(r12, r4)     // Catch:{ Exception -> 0x02c5, Throwable -> 0x02d4, all -> 0x02d0 }
            r5 = r30
            a(r15, r5, r12, r14, r5)     // Catch:{ Exception -> 0x02ba, Throwable -> 0x02d4, all -> 0x02d0 }
            int r4 = r2.code()     // Catch:{ Exception -> 0x02ba, Throwable -> 0x02d4, all -> 0x02d0 }
            r13.setCode(r4)     // Catch:{ Exception -> 0x02ba, Throwable -> 0x02d4, all -> 0x02d0 }
            com.bytedance.retrofit2.client.Response r2 = r2.raw()     // Catch:{ Exception -> 0x02ba, Throwable -> 0x02d4, all -> 0x02d0 }
            java.lang.String r2 = r2.getReason()     // Catch:{ Exception -> 0x02ba, Throwable -> 0x02d4, all -> 0x02d0 }
            r13.setMessage(r2)     // Catch:{ Exception -> 0x02ba, Throwable -> 0x02d4, all -> 0x02d0 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r4 != r2) goto L_0x027f
            if (r3 == 0) goto L_0x027f
            r3.length()     // Catch:{ Exception -> 0x02ba, Throwable -> 0x02d4, all -> 0x02d0 }
            long r3 = r3.length()     // Catch:{ Exception -> 0x02ba, Throwable -> 0x02d4, all -> 0x02d0 }
            com.ss.android.ugc.aweme.miniapp.r$2 r2 = new com.ss.android.ugc.aweme.miniapp.r$2     // Catch:{ Exception -> 0x02ba, Throwable -> 0x02d4, all -> 0x02d0 }
            r2.<init>(r1, r8)     // Catch:{ Exception -> 0x02ba, Throwable -> 0x02d4, all -> 0x02d0 }
            r20 = -1
            r22 = 0
            r23 = 0
            r24 = r2
            r2 = r16
            r5 = r24
            r24 = r6
            r6 = r20
            r7 = r34
            r31 = r8
            r8 = r22
            r9 = r36
            r10 = r37
            r11 = r38
            r20 = r12
            r12 = r23
            boolean r0 = com.bytedance.frameworks.baselib.network.http.d.e.a(r2, r3, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x027b, Throwable -> 0x0277, all -> 0x0272 }
            if (r0 == 0) goto L_0x025e
            r2 = r31
            boolean r3 = r2 instanceof com.bytedance.retrofit2.i     // Catch:{ Exception -> 0x02b2, Throwable -> 0x02ae, all -> 0x02ab }
            if (r3 == 0) goto L_0x0245
            r8 = r2
            com.bytedance.retrofit2.i r8 = (com.bytedance.retrofit2.i) r8     // Catch:{ Exception -> 0x02b2, Throwable -> 0x02ae, all -> 0x02ab }
            r8.doCollect()     // Catch:{ Exception -> 0x02b2, Throwable -> 0x02ae, all -> 0x02ab }
        L_0x0245:
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x02b2, Throwable -> 0x02ae, all -> 0x02ab }
            if (r15 == 0) goto L_0x024d
            r15.h = r3     // Catch:{ Exception -> 0x02b2, Throwable -> 0x02ae, all -> 0x02ab }
        L_0x024d:
            r5 = 0
            long r3 = r3 - r17
            r34 = r3
            r36 = r17
            r38 = r33
            r39 = r19
            r40 = r15
            com.bytedance.frameworks.baselib.network.http.e.a(r34, r36, r38, r39, r40)     // Catch:{ Exception -> 0x02b2, Throwable -> 0x02ae, all -> 0x02ab }
            goto L_0x0260
        L_0x025e:
            r2 = r31
        L_0x0260:
            if (r21 == 0) goto L_0x0269
            com.bytedance.frameworks.baselib.network.a.b r1 = com.bytedance.frameworks.baselib.network.a.b.a()
            r1.d()
        L_0x0269:
            com.bytedance.frameworks.baselib.network.http.d.e.a((java.io.Closeable) r16)     // Catch:{ Throwable -> 0x0271 }
            if (r2 == 0) goto L_0x0271
            r2.cancel()     // Catch:{ Throwable -> 0x0271 }
        L_0x0271:
            return r0
        L_0x0272:
            r0 = move-exception
            r2 = r31
            goto L_0x03eb
        L_0x0277:
            r0 = move-exception
            r2 = r31
            goto L_0x02af
        L_0x027b:
            r0 = move-exception
            r2 = r31
            goto L_0x02b3
        L_0x027f:
            r24 = r6
            r2 = r8
            r20 = r12
            r0 = 200(0xc8, float:2.8E-43)
            if (r4 != r0) goto L_0x0292
            if (r3 != 0) goto L_0x0292
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x02b2, Throwable -> 0x02ae, all -> 0x02ab }
            java.lang.String r3 = "HTTP TypedInput may not be null"
            r0.<init>(r3)     // Catch:{ Exception -> 0x02b2, Throwable -> 0x02ae, all -> 0x02ab }
            throw r0     // Catch:{ Exception -> 0x02b2, Throwable -> 0x02ae, all -> 0x02ab }
        L_0x0292:
            com.bytedance.frameworks.baselib.network.http.a.b r0 = new com.bytedance.frameworks.baselib.network.http.a.b     // Catch:{ Exception -> 0x02b2, Throwable -> 0x02ae, all -> 0x02ab }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02b2, Throwable -> 0x02ae, all -> 0x02ab }
            java.lang.String r5 = "get url = "
            r3.<init>(r5)     // Catch:{ Exception -> 0x02b2, Throwable -> 0x02ae, all -> 0x02ab }
            r3.append(r1)     // Catch:{ Exception -> 0x02b2, Throwable -> 0x02ae, all -> 0x02ab }
            java.lang.String r5 = " exception"
            r3.append(r5)     // Catch:{ Exception -> 0x02b2, Throwable -> 0x02ae, all -> 0x02ab }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x02b2, Throwable -> 0x02ae, all -> 0x02ab }
            r0.<init>(r4, r3)     // Catch:{ Exception -> 0x02b2, Throwable -> 0x02ae, all -> 0x02ab }
            throw r0     // Catch:{ Exception -> 0x02b2, Throwable -> 0x02ae, all -> 0x02ab }
        L_0x02ab:
            r0 = move-exception
            goto L_0x03eb
        L_0x02ae:
            r0 = move-exception
        L_0x02af:
            r8 = r2
            goto L_0x03b1
        L_0x02b2:
            r0 = move-exception
        L_0x02b3:
            r8 = r16
            r3 = r20
            r6 = r24
            goto L_0x0302
        L_0x02ba:
            r0 = move-exception
            r24 = r6
            r2 = r8
            r20 = r12
            r8 = r16
            r3 = r20
            goto L_0x0302
        L_0x02c5:
            r0 = move-exception
            r24 = r6
            r2 = r8
            r20 = r12
            r8 = r16
            r3 = r20
            goto L_0x0300
        L_0x02d0:
            r0 = move-exception
            r2 = r8
            goto L_0x03eb
        L_0x02d4:
            r0 = move-exception
            r2 = r8
            goto L_0x03b1
        L_0x02d8:
            r0 = move-exception
            r24 = r6
            r2 = r8
            r8 = r16
            r3 = 0
            goto L_0x0300
        L_0x02e0:
            r0 = move-exception
            r24 = r6
            r2 = r8
            r3 = 0
            r8 = 0
            goto L_0x0300
        L_0x02e7:
            r0 = move-exception
            r24 = r6
            r2 = r8
            goto L_0x02fd
        L_0x02ec:
            r0 = move-exception
            r2 = r8
            r16 = 0
            goto L_0x03eb
        L_0x02f2:
            r0 = move-exception
            r2 = r8
            r12 = r21
            r16 = 0
            goto L_0x03d1
        L_0x02fa:
            r0 = move-exception
            r2 = r8
            r6 = r15
        L_0x02fd:
            r3 = 0
            r8 = 0
            r15 = 0
        L_0x0300:
            r19 = 0
        L_0x0302:
            boolean r4 = r0 instanceof com.bytedance.frameworks.baselib.network.http.a.b     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
            if (r4 == 0) goto L_0x0310
            r4 = r0
            com.bytedance.frameworks.baselib.network.http.a.b r4 = (com.bytedance.frameworks.baselib.network.http.a.b) r4     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
            int r4 = r4.getStatusCode()     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
            r13.setCode(r4)     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
        L_0x0310:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
            r4.<init>()     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
            java.lang.Class r5 = r0.getClass()     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
            r4.append(r5)     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
            java.lang.String r5 = ":"
            r4.append(r5)     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
            java.lang.String r5 = r0.getMessage()     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
            r4.append(r5)     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
            r13.setMessage(r4)     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
            r13.setThrowable(r0)     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r19)     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
            if (r4 == 0) goto L_0x033f
            java.lang.String r4 = "X-TT-LOGID"
            java.lang.String r4 = com.bytedance.ttnet.utils.RetrofitUtils.getHeaderValueIgnoreCase(r3, r4)     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
            goto L_0x0341
        L_0x033f:
            r4 = r19
        L_0x0341:
            if (r15 != 0) goto L_0x0355
            boolean r5 = r2 instanceof com.bytedance.retrofit2.j     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
            if (r5 == 0) goto L_0x0355
            r5 = r2
            com.bytedance.retrofit2.j r5 = (com.bytedance.retrofit2.j) r5     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
            java.lang.Object r5 = r5.getRequestInfo()     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
            boolean r9 = r5 instanceof com.bytedance.frameworks.baselib.network.http.a     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
            if (r9 == 0) goto L_0x0355
            com.bytedance.frameworks.baselib.network.http.a r5 = (com.bytedance.frameworks.baselib.network.http.a) r5     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
            goto L_0x0356
        L_0x0355:
            r5 = r15
        L_0x0356:
            boolean r9 = r2 instanceof com.bytedance.retrofit2.i     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
            if (r9 == 0) goto L_0x0360
            r9 = r2
            com.bytedance.retrofit2.i r9 = (com.bytedance.retrofit2.i) r9     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
            r9.doCollect()     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
        L_0x0360:
            r9 = 0
            a(r5, r9, r3, r14, r0)     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
            if (r5 == 0) goto L_0x0385
            long r11 = r5.g     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
            r13 = 0
            int r3 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r3 > 0) goto L_0x0374
            r5.g = r6     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
        L_0x0374:
            r5.h = r9     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
            org.json.JSONObject r3 = r5.w     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
            if (r3 == 0) goto L_0x0385
            org.json.JSONObject r3 = r5.w     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
            java.lang.String r6 = "ex"
            java.lang.String r7 = r0.getMessage()     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
            r3.put(r6, r7)     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
        L_0x0385:
            r3 = 0
            long r6 = r9 - r17
            r34 = r6
            r36 = r17
            r38 = r33
            r39 = r4
            r40 = r5
            r41 = r0
            com.bytedance.frameworks.baselib.network.http.e.a(r34, r36, r38, r39, r40, r41)     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
            throw r0     // Catch:{ Throwable -> 0x039d, all -> 0x0398 }
        L_0x0398:
            r0 = move-exception
            r16 = r8
            goto L_0x03eb
        L_0x039d:
            r0 = move-exception
            r16 = r8
            r12 = r21
            r8 = r2
            goto L_0x03d1
        L_0x03a4:
            r0 = move-exception
            r2 = r8
            r9 = r30
            r16 = r9
            goto L_0x03eb
        L_0x03ab:
            r0 = move-exception
            r2 = r8
            r9 = r30
            r16 = r9
        L_0x03b1:
            r12 = r21
            goto L_0x03d1
        L_0x03b4:
            r0 = move-exception
            r2 = r8
            r9 = r30
            r16 = r9
            goto L_0x03c8
        L_0x03bb:
            r0 = move-exception
            r2 = r8
            r9 = r30
            r16 = r9
            goto L_0x03d1
        L_0x03c2:
            r0 = move-exception
            r9 = r30
            r2 = r9
            r16 = r2
        L_0x03c8:
            r21 = 0
            goto L_0x03eb
        L_0x03cb:
            r0 = move-exception
            r9 = r30
            r8 = r9
            r16 = r8
        L_0x03d1:
            boolean r1 = r0 instanceof java.lang.Exception     // Catch:{ all -> 0x03e7 }
            if (r1 == 0) goto L_0x03d8
            java.lang.Exception r0 = (java.lang.Exception) r0     // Catch:{ all -> 0x03e7 }
            goto L_0x03e6
        L_0x03d8:
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x03e7 }
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x03e7 }
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ all -> 0x03e7 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x03e7 }
            r0 = r1
        L_0x03e6:
            throw r0     // Catch:{ all -> 0x03e7 }
        L_0x03e7:
            r0 = move-exception
            r2 = r8
            r21 = r12
        L_0x03eb:
            if (r21 == 0) goto L_0x03f4
            com.bytedance.frameworks.baselib.network.a.b r1 = com.bytedance.frameworks.baselib.network.a.b.a()
            r1.d()
        L_0x03f4:
            com.bytedance.frameworks.baselib.network.http.d.e.a((java.io.Closeable) r16)     // Catch:{ Throwable -> 0x03fc }
            if (r2 == 0) goto L_0x03fc
            r2.cancel()     // Catch:{ Throwable -> 0x03fc }
        L_0x03fc:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.miniapp.r.a(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.bytedance.frameworks.baselib.network.http.util.d, java.lang.String, com.bytedance.frameworks.baselib.network.http.util.h, java.util.List, java.lang.String[], int[], com.tt.option.net.TmaResponse):boolean");
    }
}

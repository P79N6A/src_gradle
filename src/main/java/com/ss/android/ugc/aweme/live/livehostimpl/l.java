package com.ss.android.ugc.aweme.live.livehostimpl;

import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdkapi.host.h;
import com.bytedance.android.livesdkapi.i.d;
import com.bytedance.android.livesdkapi.i.e;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.NetUtil;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ttlive.ILiveApi;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class l implements h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53446a;

    /* renamed from: b  reason: collision with root package name */
    private ILiveApi f53447b = ((ILiveApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(ILiveApi.class));

    static class a implements e<d> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53454a;

        /* renamed from: b  reason: collision with root package name */
        private Call<TypedInput> f53455b;

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f53454a, false, 55812, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53454a, false, 55812, new Class[0], Void.TYPE);
                return;
            }
            this.f53455b.cancel();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public d a() throws IOException {
            TypedInput typedInput;
            String str;
            byte[] byteArray;
            if (PatchProxy.isSupport(new Object[0], this, f53454a, false, 55811, new Class[0], d.class)) {
                return (d) PatchProxy.accessDispatch(new Object[0], this, f53454a, false, 55811, new Class[0], d.class);
            }
            try {
                SsResponse execute = this.f53455b.execute();
                byte[] bArr = null;
                if (execute.body() != null) {
                    typedInput = (TypedInput) execute.body();
                } else if (execute.errorBody() != null) {
                    typedInput = (TypedInput) execute.body();
                } else {
                    typedInput = null;
                }
                if (typedInput != null) {
                    if (typedInput instanceof TypedByteArray) {
                        byteArray = ((TypedByteArray) typedInput).getBytes();
                    } else {
                        InputStream in = typedInput.in();
                        if (PatchProxy.isSupport(new Object[]{in}, null, l.f53446a, true, 55808, new Class[]{InputStream.class}, byte[].class)) {
                            byteArray = (byte[]) PatchProxy.accessDispatch(new Object[]{in}, null, l.f53446a, true, 55808, new Class[]{InputStream.class}, byte[].class);
                        } else {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            if (in != null) {
                                byte[] bArr2 = new byte[4096];
                                while (true) {
                                    int read = in.read(bArr2);
                                    if (read == -1) {
                                        break;
                                    }
                                    byteArrayOutputStream.write(bArr2, 0, read);
                                }
                            }
                            byteArray = byteArrayOutputStream.toByteArray();
                        }
                    }
                    bArr = byteArray;
                }
                String str2 = "";
                if (execute.raw() != null) {
                    str = execute.raw().getReason();
                    str2 = execute.raw().getUrl();
                } else {
                    str = "no reason";
                }
                List<Header> headers = execute.headers();
                ArrayList arrayList = new ArrayList();
                for (Header next : headers) {
                    arrayList.add(new com.bytedance.android.live.base.model.e(next.getName(), next.getValue()));
                }
                d dVar = new d();
                dVar.f18817a = str2;
                dVar.f18818b = execute.code();
                dVar.f18822f = str;
                dVar.f18819c = arrayList;
                dVar.f18821e = bArr;
                if (typedInput != null) {
                    dVar.f18820d = typedInput.mimeType();
                }
                return dVar;
            } catch (Exception e2) {
                if (e2 instanceof com.bytedance.frameworks.baselib.network.http.cronet.a.a) {
                    com.bytedance.frameworks.baselib.network.http.cronet.a.a aVar = (com.bytedance.frameworks.baselib.network.http.cronet.a.a) e2;
                    throw new com.bytedance.android.live.base.model.d.a(aVar.getStatusCode(), aVar.getMessage());
                } else if (e2 instanceof IOException) {
                    throw ((IOException) e2);
                } else {
                    throw new IOException(e2);
                }
            }
        }

        a(Call<TypedInput> call) {
            this.f53455b = call;
        }
    }

    public final Retrofit c() {
        return null;
    }

    public l() {
        b.a(h.class, this);
    }

    public final Map<String, String> a() {
        if (PatchProxy.isSupport(new Object[0], this, f53446a, false, 55806, new Class[0], Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[0], this, f53446a, false, 55806, new Class[0], Map.class);
        }
        HashMap hashMap = new HashMap();
        NetUtil.putCommonParams(hashMap, false);
        return hashMap;
    }

    public final String b() {
        if (!PatchProxy.isSupport(new Object[0], this, f53446a, false, 55809, new Class[0], String.class)) {
            return com.ss.android.ugc.aweme.live.a.a();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f53446a, false, 55809, new Class[0], String.class);
    }

    private static Map<String, String> a(List<com.bytedance.android.live.base.model.e> list) {
        if (PatchProxy.isSupport(new Object[]{list}, null, f53446a, true, 55807, new Class[]{List.class}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{list}, null, f53446a, true, 55807, new Class[]{List.class}, Map.class);
        }
        HashMap hashMap = new HashMap();
        if (list != null) {
            for (com.bytedance.android.live.base.model.e next : list) {
                hashMap.put(next.getName(), next.getValue());
            }
        }
        return hashMap;
    }

    public final e<d> a(String str, List<com.bytedance.android.live.base.model.e> list) throws IOException {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, list}, this, f53446a, false, 55802, new Class[]{String.class, List.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{str2, list}, this, f53446a, false, 55802, new Class[]{String.class, List.class}, e.class);
        }
        return new a(this.f53447b.get(str2, a(list)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.android.livesdkapi.i.e<com.bytedance.android.livesdkapi.i.d> a(java.lang.String r24, java.util.List<com.bytedance.android.live.base.model.e> r25, java.lang.String r26, byte[] r27) throws java.io.IOException {
        /*
            r23 = this;
            r0 = r24
            r2 = r26
            r3 = r27
            r4 = 4
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r12 = 0
            r5[r12] = r0
            r13 = 1
            r5[r13] = r25
            r14 = 2
            r5[r14] = r2
            r15 = 3
            r5[r15] = r3
            com.meituan.robust.ChangeQuickRedirect r7 = f53446a
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r10[r12] = r6
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r10[r13] = r6
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r10[r14] = r6
            java.lang.Class<byte[]> r6 = byte[].class
            r10[r15] = r6
            java.lang.Class<com.bytedance.android.livesdkapi.i.e> r11 = com.bytedance.android.livesdkapi.i.e.class
            r8 = 0
            r9 = 55803(0xd9fb, float:7.8197E-41)
            r6 = r23
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x0069
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r12] = r0
            r5[r13] = r25
            r5[r14] = r2
            r5[r15] = r3
            com.meituan.robust.ChangeQuickRedirect r18 = f53446a
            r19 = 0
            r20 = 55803(0xd9fb, float:7.8197E-41)
            java.lang.Class[] r0 = new java.lang.Class[r4]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r0[r13] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r14] = r1
            java.lang.Class<byte[]> r1 = byte[].class
            r0[r15] = r1
            java.lang.Class<com.bytedance.android.livesdkapi.i.e> r22 = com.bytedance.android.livesdkapi.i.e.class
            r16 = r5
            r17 = r23
            r21 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            com.bytedance.android.livesdkapi.i.e r0 = (com.bytedance.android.livesdkapi.i.e) r0
            return r0
        L_0x0069:
            java.util.Map r1 = a(r25)
            r4 = r23
            com.ss.android.ugc.aweme.ttlive.ILiveApi r5 = r4.f53447b
            com.bytedance.retrofit2.mime.TypedByteArray r6 = new com.bytedance.retrofit2.mime.TypedByteArray
            java.lang.String[] r7 = new java.lang.String[r12]
            r6.<init>(r2, r3, r7)
            com.bytedance.retrofit2.Call r0 = r5.post(r0, r6, r1)
            com.ss.android.ugc.aweme.live.livehostimpl.l$a r1 = new com.ss.android.ugc.aweme.live.livehostimpl.l$a
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.l.a(java.lang.String, java.util.List, java.lang.String, byte[]):com.bytedance.android.livesdkapi.i.e");
    }

    public final e<d> a(boolean z, int i, String str, List<com.bytedance.android.live.base.model.e> list, Object obj) throws IOException {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), str, list, obj}, this, f53446a, false, 55804, new Class[]{Boolean.TYPE, Integer.TYPE, String.class, List.class, Object.class}, e.class)) {
            Object[] objArr = {Byte.valueOf(z), Integer.valueOf(i), str, list, obj};
            return (e) PatchProxy.accessDispatch(objArr, this, f53446a, false, 55804, new Class[]{Boolean.TYPE, Integer.TYPE, String.class, List.class, Object.class}, e.class);
        }
        return new a(this.f53447b.downloadFile(z, i, str, a(list), obj));
    }

    public final e<d> a(int i, String str, List<com.bytedance.android.live.base.model.e> list, String str2, byte[] bArr, long j, String str3) throws IOException {
        String str4 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str4, list, str2, bArr, new Long(j2), str3}, this, f53446a, false, 55805, new Class[]{Integer.TYPE, String.class, List.class, String.class, byte[].class, Long.TYPE, String.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str4, list, str2, bArr, new Long(j2), str3}, this, f53446a, false, 55805, new Class[]{Integer.TYPE, String.class, List.class, String.class, byte[].class, Long.TYPE, String.class}, e.class);
        }
        Map<String, String> a2 = a(list);
        ILiveApi iLiveApi = this.f53447b;
        final String str5 = str2;
        final long j3 = j;
        final byte[] bArr2 = bArr;
        final String str6 = str3;
        AnonymousClass1 r1 = new TypedOutput() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f53448a;

            public final String fileName() {
                return null;
            }

            public final long length() {
                return j3;
            }

            public final String md5Stub() {
                return str6;
            }

            public final String mimeType() {
                return str5;
            }

            public final void writeTo(OutputStream outputStream) throws IOException {
                OutputStream outputStream2 = outputStream;
                if (PatchProxy.isSupport(new Object[]{outputStream2}, this, f53448a, false, 55810, new Class[]{OutputStream.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{outputStream2}, this, f53448a, false, 55810, new Class[]{OutputStream.class}, Void.TYPE);
                    return;
                }
                outputStream2.write(bArr2);
            }
        };
        return new a(iLiveApi.postMultiPart(i, str4, a2, r1));
    }
}

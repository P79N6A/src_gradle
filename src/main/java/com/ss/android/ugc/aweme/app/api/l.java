package com.ss.android.ugc.aweme.app.api;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.CallAdapter;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Header;
import com.google.common.util.concurrent.b;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.utils.cj;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class l extends CallAdapter.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33856a;

    /* renamed from: b  reason: collision with root package name */
    s f33857b;

    static class a implements CallAdapter<q> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33858a;

        /* renamed from: b  reason: collision with root package name */
        private final CallAdapter<q<SsResponse>> f33859b;

        public final Type a() {
            if (!PatchProxy.isSupport(new Object[0], this, f33858a, false, 23102, new Class[0], Type.class)) {
                return this.f33859b.a();
            }
            return (Type) PatchProxy.accessDispatch(new Object[0], this, f33858a, false, 23102, new Class[0], Type.class);
        }

        a(CallAdapter<q<SsResponse>> callAdapter) {
            this.f33859b = callAdapter;
        }

        public final /* synthetic */ Object a(Call call) {
            if (PatchProxy.isSupport(new Object[]{call}, this, f33858a, false, 23103, new Class[]{Call.class}, q.class)) {
                return (q) PatchProxy.accessDispatch(new Object[]{call}, this, f33858a, false, 23103, new Class[]{Call.class}, q.class);
            }
            final q qVar = (q) this.f33859b.a(call);
            return new b<R>() {
                {
                    com.google.common.util.concurrent.l.a(qVar, new k<SsResponse>() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f33862a;

                        public final void onFailure(Throwable th) {
                            Throwable th2 = th;
                            if (PatchProxy.isSupport(new Object[]{th2}, this, f33862a, false, 23106, new Class[]{Throwable.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{th2}, this, f33862a, false, 23106, new Class[]{Throwable.class}, Void.TYPE);
                                return;
                            }
                            AnonymousClass1.this.a(th2);
                        }

                        public final /* synthetic */ void onSuccess(@Nullable Object obj) {
                            String str;
                            SsResponse ssResponse = (SsResponse) obj;
                            if (PatchProxy.isSupport(new Object[]{ssResponse}, this, f33862a, false, 23105, new Class[]{SsResponse.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{ssResponse}, this, f33862a, false, 23105, new Class[]{SsResponse.class}, Void.TYPE);
                            } else if (ssResponse.isSuccessful()) {
                                Object body = ssResponse.body();
                                if (body instanceof h) {
                                    h hVar = (h) body;
                                    a aVar = a.this;
                                    List<Header> headers = ssResponse.headers();
                                    if (PatchProxy.isSupport(new Object[]{headers}, aVar, a.f33858a, false, 23104, new Class[]{List.class}, String.class)) {
                                        a aVar2 = aVar;
                                        str = (String) PatchProxy.accessDispatch(new Object[]{headers}, aVar2, a.f33858a, false, 23104, new Class[]{List.class}, String.class);
                                    } else {
                                        if (headers != null) {
                                            Iterator<Header> it2 = headers.iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    break;
                                                }
                                                Header next = it2.next();
                                                if ("X-TT-LOGID".equalsIgnoreCase(next.getName())) {
                                                    str = next.getValue();
                                                    break;
                                                }
                                            }
                                        }
                                        str = null;
                                    }
                                    hVar.setRequestId(str);
                                }
                                if (body instanceof BaseResponse) {
                                    BaseResponse baseResponse = (BaseResponse) body;
                                    if (ssResponse.raw() != null) {
                                        cj.a(baseResponse.status_code, ssResponse.raw().getUrl(), baseResponse.toString());
                                    }
                                }
                                AnonymousClass1.this.b(body);
                            } else {
                                AnonymousClass1.this.a((Throwable) new RuntimeException("HttpException"));
                            }
                        }
                    });
                }
            };
        }
    }

    public l() {
        s sVar;
        if (PatchProxy.isSupport(new Object[0], null, s.f33892a, true, 23145, new Class[0], s.class)) {
            sVar = (s) PatchProxy.accessDispatch(new Object[0], null, s.f33892a, true, 23145, new Class[0], s.class);
        } else {
            sVar = new s();
        }
        this.f33857b = sVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.retrofit2.CallAdapter<?> get(java.lang.reflect.Type r16, java.lang.annotation.Annotation[] r17, com.bytedance.retrofit2.Retrofit r18) {
        /*
            r15 = this;
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r11 = 3
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r12 = 0
            r0[r12] = r8
            r13 = 1
            r0[r13] = r9
            r14 = 2
            r0[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f33856a
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.lang.reflect.Type> r1 = java.lang.reflect.Type.class
            r5[r12] = r1
            java.lang.Class<java.lang.annotation.Annotation[]> r1 = java.lang.annotation.Annotation[].class
            r5[r13] = r1
            java.lang.Class<com.bytedance.retrofit2.Retrofit> r1 = com.bytedance.retrofit2.Retrofit.class
            r5[r14] = r1
            java.lang.Class<com.bytedance.retrofit2.CallAdapter> r6 = com.bytedance.retrofit2.CallAdapter.class
            r3 = 0
            r4 = 23101(0x5a3d, float:3.2371E-41)
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0054
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r8
            r0[r13] = r9
            r0[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f33856a
            r3 = 0
            r4 = 23101(0x5a3d, float:3.2371E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.lang.reflect.Type> r1 = java.lang.reflect.Type.class
            r5[r12] = r1
            java.lang.Class<java.lang.annotation.Annotation[]> r1 = java.lang.annotation.Annotation[].class
            r5[r13] = r1
            java.lang.Class<com.bytedance.retrofit2.Retrofit> r1 = com.bytedance.retrofit2.Retrofit.class
            r5[r14] = r1
            java.lang.Class<com.bytedance.retrofit2.CallAdapter> r6 = com.bytedance.retrofit2.CallAdapter.class
            r1 = r15
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.bytedance.retrofit2.CallAdapter r0 = (com.bytedance.retrofit2.CallAdapter) r0
            return r0
        L_0x0054:
            java.lang.Class r0 = getRawType(r16)
            java.lang.Class<com.google.common.util.concurrent.q> r1 = com.google.common.util.concurrent.q.class
            r2 = 0
            if (r0 == r1) goto L_0x005e
            return r2
        L_0x005e:
            boolean r0 = r8 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L_0x00aa
            r0 = r8
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type r0 = getParameterUpperBound(r12, r0)
            java.lang.Class r1 = getRawType(r0)
            java.lang.Class<com.ss.android.ugc.aweme.app.api.h> r3 = com.ss.android.ugc.aweme.app.api.h.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 == 0) goto L_0x0097
            com.ss.android.ugc.aweme.app.api.s r3 = r7.f33857b
            java.lang.Class<com.google.common.util.concurrent.q> r4 = com.google.common.util.concurrent.q.class
            java.lang.reflect.Type[] r5 = new java.lang.reflect.Type[r13]
            java.lang.Class<com.bytedance.retrofit2.SsResponse> r6 = com.bytedance.retrofit2.SsResponse.class
            java.lang.reflect.Type[] r11 = new java.lang.reflect.Type[r13]
            r11[r12] = r0
            java.lang.reflect.ParameterizedType r0 = com.google.gson.internal.C$Gson$Types.newParameterizedTypeWithOwner(r2, r6, r11)
            r5[r12] = r0
            java.lang.reflect.ParameterizedType r0 = com.google.gson.internal.C$Gson$Types.newParameterizedTypeWithOwner(r2, r4, r5)
            com.bytedance.retrofit2.CallAdapter r0 = r3.get(r0, r9, r10)
            if (r0 == 0) goto L_0x0097
            com.ss.android.ugc.aweme.app.api.l$a r1 = new com.ss.android.ugc.aweme.app.api.l$a
            r1.<init>(r0)
            return r1
        L_0x0097:
            java.lang.Class<com.bytedance.retrofit2.SsResponse> r0 = com.bytedance.retrofit2.SsResponse.class
            if (r1 == r0) goto L_0x00a2
            com.ss.android.ugc.aweme.app.api.s r0 = r7.f33857b
            com.bytedance.retrofit2.CallAdapter r0 = r0.get(r8, r9, r10)
            return r0
        L_0x00a2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Response return type is not supported because TikTok can not resolve Response type."
            r0.<init>(r1)
            throw r0
        L_0x00aa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "ListenableFuture return type must be parameterized as ListenableFuture<Foo> or ListenableFuture<? extends Foo>"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.api.l.get(java.lang.reflect.Type, java.lang.annotation.Annotation[], com.bytedance.retrofit2.Retrofit):com.bytedance.retrofit2.CallAdapter");
    }
}

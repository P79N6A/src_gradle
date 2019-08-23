package com.ss.android.ugc.aweme.app.api;

import a.g;
import a.i;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.CallAdapter;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Header;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.utils.cj;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.CancellationException;

public class k extends CallAdapter.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33850a;

    /* renamed from: b  reason: collision with root package name */
    r f33851b;

    static class a implements CallAdapter<i> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33852a;

        /* renamed from: b  reason: collision with root package name */
        private final CallAdapter<i<SsResponse>> f33853b;

        public final Type a() {
            if (!PatchProxy.isSupport(new Object[0], this, f33852a, false, 23096, new Class[0], Type.class)) {
                return this.f33853b.a();
            }
            return (Type) PatchProxy.accessDispatch(new Object[0], this, f33852a, false, 23096, new Class[0], Type.class);
        }

        a(CallAdapter<i<SsResponse>> callAdapter) {
            this.f33853b = callAdapter;
        }

        public final /* synthetic */ Object a(Call call) {
            if (!PatchProxy.isSupport(new Object[]{call}, this, f33852a, false, 23097, new Class[]{Call.class}, i.class)) {
                return ((i) this.f33853b.a(call)).a((g<TResult, TContinuationResult>) new g<SsResponse, R>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f33854a;

                    public final R then(i<SsResponse> iVar) throws Exception {
                        if (PatchProxy.isSupport(new Object[]{iVar}, this, f33854a, false, 23099, new Class[]{i.class}, Object.class)) {
                            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f33854a, false, 23099, new Class[]{i.class}, Object.class);
                        } else if (iVar.c()) {
                            throw new CancellationException();
                        } else if (!iVar.d()) {
                            SsResponse ssResponse = (SsResponse) iVar.e();
                            R body = ((SsResponse) iVar.e()).body();
                            if (body instanceof BaseResponse) {
                                BaseResponse baseResponse = (BaseResponse) body;
                                if (ssResponse.raw() != null) {
                                    cj.a(baseResponse.status_code, ssResponse.raw().getUrl(), baseResponse.toString());
                                }
                            }
                            if (body instanceof h) {
                                ((h) body).setRequestId(a.this.a(ssResponse.headers()));
                            }
                            return body;
                        } else {
                            throw iVar.f();
                        }
                    }
                });
            }
            return (i) PatchProxy.accessDispatch(new Object[]{call}, this, f33852a, false, 23097, new Class[]{Call.class}, i.class);
        }

        /* access modifiers changed from: package-private */
        public final String a(List<Header> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, f33852a, false, 23098, new Class[]{List.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{list}, this, f33852a, false, 23098, new Class[]{List.class}, String.class);
            } else if (list == null) {
                return null;
            } else {
                for (Header next : list) {
                    if ("X-TT-LOGID".equalsIgnoreCase(next.getName())) {
                        return next.getValue();
                    }
                }
                return null;
            }
        }
    }

    public k() {
        r rVar;
        if (PatchProxy.isSupport(new Object[0], null, r.f33881a, true, 23137, new Class[0], r.class)) {
            rVar = (r) PatchProxy.accessDispatch(new Object[0], null, r.f33881a, true, 23137, new Class[0], r.class);
        } else {
            rVar = new r();
        }
        this.f33851b = rVar;
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
            com.meituan.robust.ChangeQuickRedirect r2 = f33850a
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.lang.reflect.Type> r1 = java.lang.reflect.Type.class
            r5[r12] = r1
            java.lang.Class<java.lang.annotation.Annotation[]> r1 = java.lang.annotation.Annotation[].class
            r5[r13] = r1
            java.lang.Class<com.bytedance.retrofit2.Retrofit> r1 = com.bytedance.retrofit2.Retrofit.class
            r5[r14] = r1
            java.lang.Class<com.bytedance.retrofit2.CallAdapter> r6 = com.bytedance.retrofit2.CallAdapter.class
            r3 = 0
            r4 = 23095(0x5a37, float:3.2363E-41)
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0054
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r8
            r0[r13] = r9
            r0[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f33850a
            r3 = 0
            r4 = 23095(0x5a37, float:3.2363E-41)
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
            java.lang.Class<a.i> r1 = a.i.class
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
            com.ss.android.ugc.aweme.app.api.r r3 = r7.f33851b
            java.lang.Class<a.i> r4 = a.i.class
            java.lang.reflect.Type[] r5 = new java.lang.reflect.Type[r13]
            java.lang.Class<com.bytedance.retrofit2.SsResponse> r6 = com.bytedance.retrofit2.SsResponse.class
            java.lang.reflect.Type[] r11 = new java.lang.reflect.Type[r13]
            r11[r12] = r0
            java.lang.reflect.ParameterizedType r0 = com.google.gson.internal.C$Gson$Types.newParameterizedTypeWithOwner(r2, r6, r11)
            r5[r12] = r0
            java.lang.reflect.ParameterizedType r0 = com.google.gson.internal.C$Gson$Types.newParameterizedTypeWithOwner(r2, r4, r5)
            com.bytedance.retrofit2.CallAdapter r0 = r3.get(r0, r9, r10)
            if (r0 == 0) goto L_0x0097
            com.ss.android.ugc.aweme.app.api.k$a r1 = new com.ss.android.ugc.aweme.app.api.k$a
            r1.<init>(r0)
            return r1
        L_0x0097:
            java.lang.Class<com.bytedance.retrofit2.SsResponse> r0 = com.bytedance.retrofit2.SsResponse.class
            if (r1 == r0) goto L_0x00a2
            com.ss.android.ugc.aweme.app.api.r r0 = r7.f33851b
            com.bytedance.retrofit2.CallAdapter r0 = r0.get(r8, r9, r10)
            return r0
        L_0x00a2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Response return type is not supported because TikTok can not resolve Response type."
            r0.<init>(r1)
            throw r0
        L_0x00aa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Task return type must be parameterized as Task<Foo> or Task<? extends Foo> but returnType is "
            r1.<init>(r2)
            java.lang.String r2 = r16.getTypeName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.api.k.get(java.lang.reflect.Type, java.lang.annotation.Annotation[], com.bytedance.retrofit2.Retrofit):com.bytedance.retrofit2.CallAdapter");
    }
}

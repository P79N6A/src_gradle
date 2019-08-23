package com.ss.android.ugc.aweme.app.api;

import a.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.utils.cj;
import java.lang.reflect.Type;
import java.util.concurrent.CancellationException;
import retrofit2.b;
import retrofit2.c;
import retrofit2.m;

public final class i extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33834a;

    /* renamed from: b  reason: collision with root package name */
    final q f33835b;

    static class a<R> implements c<R, a.i<R>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33836a;

        /* renamed from: b  reason: collision with root package name */
        private final c<R, a.i<m<R>>> f33837b;

        public final Type a() {
            if (!PatchProxy.isSupport(new Object[0], this, f33836a, false, 23084, new Class[0], Type.class)) {
                return this.f33837b.a();
            }
            return (Type) PatchProxy.accessDispatch(new Object[0], this, f33836a, false, 23084, new Class[0], Type.class);
        }

        a(c<R, a.i<m<R>>> cVar) {
            this.f33837b = cVar;
        }

        public final /* synthetic */ Object a(final b bVar) {
            if (!PatchProxy.isSupport(new Object[]{bVar}, this, f33836a, false, 23085, new Class[]{b.class}, a.i.class)) {
                return ((a.i) this.f33837b.a(bVar)).a((g<TResult, TContinuationResult>) new g<m<R>, R>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f33838a;

                    public final R then(a.i<m<R>> iVar) throws Exception {
                        if (PatchProxy.isSupport(new Object[]{iVar}, this, f33838a, false, 23086, new Class[]{a.i.class}, Object.class)) {
                            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f33838a, false, 23086, new Class[]{a.i.class}, Object.class);
                        } else if (iVar.c()) {
                            throw new CancellationException();
                        } else if (!iVar.d()) {
                            m mVar = (m) iVar.e();
                            BaseResponse baseResponse = ((m) iVar.e()).f84319b;
                            if (baseResponse instanceof BaseResponse) {
                                BaseResponse baseResponse2 = baseResponse;
                                if (bVar.e() != null) {
                                    cj.a(baseResponse2.status_code, bVar.e().url().toString(), baseResponse2.toString());
                                }
                            }
                            if (baseResponse instanceof h) {
                                baseResponse.setRequestId(mVar.c().get("X-TT-LOGID"));
                            }
                            return baseResponse;
                        } else {
                            throw iVar.f();
                        }
                    }
                });
            }
            return (a.i) PatchProxy.accessDispatch(new Object[]{bVar}, this, f33836a, false, 23085, new Class[]{b.class}, a.i.class);
        }
    }

    public i() {
        q qVar;
        if (PatchProxy.isSupport(new Object[0], null, q.f33870a, true, 23129, new Class[0], q.class)) {
            qVar = (q) PatchProxy.accessDispatch(new Object[0], null, q.f33870a, true, 23129, new Class[0], q.class);
        } else {
            qVar = new q();
        }
        this.f33835b = qVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final retrofit2.c<?, ?> a(java.lang.reflect.Type r16, java.lang.annotation.Annotation[] r17, retrofit2.n r18) {
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
            com.meituan.robust.ChangeQuickRedirect r2 = f33834a
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.lang.reflect.Type> r1 = java.lang.reflect.Type.class
            r5[r12] = r1
            java.lang.Class<java.lang.annotation.Annotation[]> r1 = java.lang.annotation.Annotation[].class
            r5[r13] = r1
            java.lang.Class<retrofit2.n> r1 = retrofit2.n.class
            r5[r14] = r1
            java.lang.Class<retrofit2.c> r6 = retrofit2.c.class
            r3 = 0
            r4 = 23083(0x5a2b, float:3.2346E-41)
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0054
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r8
            r0[r13] = r9
            r0[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f33834a
            r3 = 0
            r4 = 23083(0x5a2b, float:3.2346E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.lang.reflect.Type> r1 = java.lang.reflect.Type.class
            r5[r12] = r1
            java.lang.Class<java.lang.annotation.Annotation[]> r1 = java.lang.annotation.Annotation[].class
            r5[r13] = r1
            java.lang.Class<retrofit2.n> r1 = retrofit2.n.class
            r5[r14] = r1
            java.lang.Class<retrofit2.c> r6 = retrofit2.c.class
            r1 = r15
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            retrofit2.c r0 = (retrofit2.c) r0
            return r0
        L_0x0054:
            java.lang.Class r0 = a(r16)
            java.lang.Class<a.i> r1 = a.i.class
            r2 = 0
            if (r0 == r1) goto L_0x005e
            return r2
        L_0x005e:
            boolean r0 = r8 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L_0x00aa
            r0 = r8
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type r0 = a(r12, r0)
            java.lang.Class r1 = a(r0)
            java.lang.Class<com.ss.android.ugc.aweme.app.api.h> r3 = com.ss.android.ugc.aweme.app.api.h.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 == 0) goto L_0x0097
            com.ss.android.ugc.aweme.app.api.q r3 = r7.f33835b
            java.lang.Class<a.i> r4 = a.i.class
            java.lang.reflect.Type[] r5 = new java.lang.reflect.Type[r13]
            java.lang.Class<retrofit2.m> r6 = retrofit2.m.class
            java.lang.reflect.Type[] r11 = new java.lang.reflect.Type[r13]
            r11[r12] = r0
            java.lang.reflect.ParameterizedType r0 = com.google.gson.internal.C$Gson$Types.newParameterizedTypeWithOwner(r2, r6, r11)
            r5[r12] = r0
            java.lang.reflect.ParameterizedType r0 = com.google.gson.internal.C$Gson$Types.newParameterizedTypeWithOwner(r2, r4, r5)
            retrofit2.c r0 = r3.a(r0, r9, r10)
            if (r0 == 0) goto L_0x0097
            com.ss.android.ugc.aweme.app.api.i$a r1 = new com.ss.android.ugc.aweme.app.api.i$a
            r1.<init>(r0)
            return r1
        L_0x0097:
            java.lang.Class<retrofit2.m> r0 = retrofit2.m.class
            if (r1 == r0) goto L_0x00a2
            com.ss.android.ugc.aweme.app.api.q r0 = r7.f33835b
            retrofit2.c r0 = r0.a(r8, r9, r10)
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.api.i.a(java.lang.reflect.Type, java.lang.annotation.Annotation[], retrofit2.n):retrofit2.c");
    }
}

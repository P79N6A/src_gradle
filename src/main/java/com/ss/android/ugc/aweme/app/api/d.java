package com.ss.android.ugc.aweme.app.api;

import a.g;
import a.i;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.CallAdapter;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.l;
import com.google.common.util.concurrent.q;
import com.google.common.util.concurrent.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.utils.ce;
import com.ss.android.ugc.aweme.utils.cj;
import java.lang.reflect.Type;
import java.util.concurrent.CancellationException;

public class d extends CallAdapter.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33816a;

    static class a implements CallAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33817a;

        /* renamed from: b  reason: collision with root package name */
        CallAdapter<?> f33818b;

        public final Type a() {
            if (!PatchProxy.isSupport(new Object[0], this, f33817a, false, 23055, new Class[0], Type.class)) {
                return this.f33818b.a();
            }
            return (Type) PatchProxy.accessDispatch(new Object[0], this, f33817a, false, 23055, new Class[0], Type.class);
        }

        a(CallAdapter<?> callAdapter) {
            this.f33818b = callAdapter;
        }

        public final Object a(final Call call) {
            if (!PatchProxy.isSupport(new Object[]{call}, this, f33817a, false, 23056, new Class[]{Call.class}, Object.class)) {
                return ((i) this.f33818b.a(call)).a((g<TResult, TContinuationResult>) new g() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f33819a;

                    public final Object then(i iVar) throws Exception {
                        if (PatchProxy.isSupport(new Object[]{iVar}, this, f33819a, false, 23057, new Class[]{i.class}, Object.class)) {
                            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f33819a, false, 23057, new Class[]{i.class}, Object.class);
                        } else if (iVar.d()) {
                            Exception f2 = iVar.f();
                            ce.a((Throwable) f2, call.request().getUrl(), "");
                            if (f2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                                cj.a(call.request().getUrl(), (com.ss.android.ugc.aweme.base.api.a.b.a) f2);
                            }
                            throw f2;
                        } else if (!iVar.c()) {
                            return iVar.e();
                        } else {
                            throw new CancellationException();
                        }
                    }
                });
            }
            return PatchProxy.accessDispatch(new Object[]{call}, this, f33817a, false, 23056, new Class[]{Call.class}, Object.class);
        }
    }

    static class b implements CallAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33822a;

        /* renamed from: b  reason: collision with root package name */
        CallAdapter<?> f33823b;

        public final Type a() {
            if (!PatchProxy.isSupport(new Object[0], this, f33822a, false, 23058, new Class[0], Type.class)) {
                return this.f33823b.a();
            }
            return (Type) PatchProxy.accessDispatch(new Object[0], this, f33822a, false, 23058, new Class[0], Type.class);
        }

        b(CallAdapter<?> callAdapter) {
            this.f33823b = callAdapter;
        }

        public final Object a(final Call call) {
            if (PatchProxy.isSupport(new Object[]{call}, this, f33822a, false, 23059, new Class[]{Call.class}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{call}, this, f33822a, false, 23059, new Class[]{Call.class}, Object.class);
            }
            q qVar = (q) this.f33823b.a(call);
            l.a(qVar, new k() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f33824a;

                public final void onSuccess(Object obj) {
                }

                public final void onFailure(Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{th}, this, f33824a, false, 23060, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th}, this, f33824a, false, 23060, new Class[]{Throwable.class}, Void.TYPE);
                        return;
                    }
                    ce.a(th, call.request().getUrl(), "");
                    if (th instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                        cj.a(call.request().getUrl(), (com.ss.android.ugc.aweme.base.api.a.b.a) th);
                    }
                }
            }, v.a());
            return qVar;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.retrofit2.CallAdapter<?> get(java.lang.reflect.Type r22, java.lang.annotation.Annotation[] r23, com.bytedance.retrofit2.Retrofit r24) {
        /*
            r21 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f33816a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<java.lang.reflect.Type> r5 = java.lang.reflect.Type.class
            r9[r11] = r5
            java.lang.Class<java.lang.annotation.Annotation[]> r5 = java.lang.annotation.Annotation[].class
            r9[r12] = r5
            java.lang.Class<com.bytedance.retrofit2.Retrofit> r5 = com.bytedance.retrofit2.Retrofit.class
            r9[r13] = r5
            java.lang.Class<com.bytedance.retrofit2.CallAdapter> r10 = com.bytedance.retrofit2.CallAdapter.class
            r7 = 0
            r8 = 23054(0x5a0e, float:3.2306E-41)
            r5 = r21
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0058
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            r14[r12] = r1
            r14[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r16 = f33816a
            r17 = 0
            r18 = 23054(0x5a0e, float:3.2306E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<java.lang.reflect.Type> r1 = java.lang.reflect.Type.class
            r0[r11] = r1
            java.lang.Class<java.lang.annotation.Annotation[]> r1 = java.lang.annotation.Annotation[].class
            r0[r12] = r1
            java.lang.Class<com.bytedance.retrofit2.Retrofit> r1 = com.bytedance.retrofit2.Retrofit.class
            r0[r13] = r1
            java.lang.Class<com.bytedance.retrofit2.CallAdapter> r20 = com.bytedance.retrofit2.CallAdapter.class
            r15 = r21
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            com.bytedance.retrofit2.CallAdapter r0 = (com.bytedance.retrofit2.CallAdapter) r0
            return r0
        L_0x0058:
            java.lang.Class r3 = getRawType(r22)
            java.lang.Class<com.google.common.util.concurrent.q> r4 = com.google.common.util.concurrent.q.class
            if (r3 == r4) goto L_0x0066
            java.lang.Class<a.i> r4 = a.i.class
            if (r3 == r4) goto L_0x0066
            r0 = 0
            return r0
        L_0x0066:
            r4 = r21
            com.bytedance.retrofit2.CallAdapter r0 = r2.nextCallAdapter(r4, r0, r1)
            java.lang.Class<com.google.common.util.concurrent.q> r1 = com.google.common.util.concurrent.q.class
            if (r3 != r1) goto L_0x0076
            com.ss.android.ugc.aweme.app.api.d$b r1 = new com.ss.android.ugc.aweme.app.api.d$b
            r1.<init>(r0)
            return r1
        L_0x0076:
            java.lang.Class<a.i> r1 = a.i.class
            if (r3 != r1) goto L_0x0080
            com.ss.android.ugc.aweme.app.api.d$a r1 = new com.ss.android.ugc.aweme.app.api.d$a
            r1.<init>(r0)
            return r1
        L_0x0080:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.api.d.get(java.lang.reflect.Type, java.lang.annotation.Annotation[], com.bytedance.retrofit2.Retrofit):com.bytedance.retrofit2.CallAdapter");
    }
}

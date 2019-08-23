package com.ss.android.ugc.aweme.app.api;

import a.g;
import a.i;
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
import retrofit2.c;

public class c extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33805a;

    static class a implements retrofit2.c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33806a;

        /* renamed from: b  reason: collision with root package name */
        retrofit2.c<?, ?> f33807b;

        public final Type a() {
            if (!PatchProxy.isSupport(new Object[0], this, f33806a, false, 23047, new Class[0], Type.class)) {
                return this.f33807b.a();
            }
            return (Type) PatchProxy.accessDispatch(new Object[0], this, f33806a, false, 23047, new Class[0], Type.class);
        }

        a(retrofit2.c<?, ?> cVar) {
            this.f33807b = cVar;
        }

        public final Object a(final retrofit2.b bVar) {
            if (!PatchProxy.isSupport(new Object[]{bVar}, this, f33806a, false, 23048, new Class[]{retrofit2.b.class}, Object.class)) {
                return ((i) this.f33807b.a(bVar)).a((g<TResult, TContinuationResult>) new g() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f33808a;

                    public final Object then(i iVar) throws Exception {
                        if (PatchProxy.isSupport(new Object[]{iVar}, this, f33808a, false, 23049, new Class[]{i.class}, Object.class)) {
                            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f33808a, false, 23049, new Class[]{i.class}, Object.class);
                        } else if (iVar.d()) {
                            Exception f2 = iVar.f();
                            ce.a((Throwable) f2, bVar.e().url().toString(), "");
                            if (f2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                                cj.a(bVar.e().url().toString(), (com.ss.android.ugc.aweme.base.api.a.b.a) f2);
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
            return PatchProxy.accessDispatch(new Object[]{bVar}, this, f33806a, false, 23048, new Class[]{retrofit2.b.class}, Object.class);
        }
    }

    static class b implements retrofit2.c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33811a;

        /* renamed from: b  reason: collision with root package name */
        retrofit2.c<?, ?> f33812b;

        public final Type a() {
            if (!PatchProxy.isSupport(new Object[0], this, f33811a, false, 23050, new Class[0], Type.class)) {
                return this.f33812b.a();
            }
            return (Type) PatchProxy.accessDispatch(new Object[0], this, f33811a, false, 23050, new Class[0], Type.class);
        }

        b(retrofit2.c<?, ?> cVar) {
            this.f33812b = cVar;
        }

        public final Object a(final retrofit2.b bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f33811a, false, 23051, new Class[]{retrofit2.b.class}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{bVar}, this, f33811a, false, 23051, new Class[]{retrofit2.b.class}, Object.class);
            }
            q qVar = (q) this.f33812b.a(bVar);
            l.a(qVar, new k() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f33813a;

                public final void onSuccess(Object obj) {
                }

                public final void onFailure(Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{th}, this, f33813a, false, 23052, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th}, this, f33813a, false, 23052, new Class[]{Throwable.class}, Void.TYPE);
                        return;
                    }
                    ce.a(th, bVar.e().url().toString(), "");
                    if (th instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                        cj.a(bVar.e().url().toString(), (com.ss.android.ugc.aweme.base.api.a.b.a) th);
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
    public final retrofit2.c<?, ?> a(java.lang.reflect.Type r22, java.lang.annotation.Annotation[] r23, retrofit2.n r24) {
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
            com.meituan.robust.ChangeQuickRedirect r6 = f33805a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<java.lang.reflect.Type> r5 = java.lang.reflect.Type.class
            r9[r11] = r5
            java.lang.Class<java.lang.annotation.Annotation[]> r5 = java.lang.annotation.Annotation[].class
            r9[r12] = r5
            java.lang.Class<retrofit2.n> r5 = retrofit2.n.class
            r9[r13] = r5
            java.lang.Class<retrofit2.c> r10 = retrofit2.c.class
            r7 = 0
            r8 = 23046(0x5a06, float:3.2294E-41)
            r5 = r21
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0058
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            r14[r12] = r1
            r14[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r16 = f33805a
            r17 = 0
            r18 = 23046(0x5a06, float:3.2294E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<java.lang.reflect.Type> r1 = java.lang.reflect.Type.class
            r0[r11] = r1
            java.lang.Class<java.lang.annotation.Annotation[]> r1 = java.lang.annotation.Annotation[].class
            r0[r12] = r1
            java.lang.Class<retrofit2.n> r1 = retrofit2.n.class
            r0[r13] = r1
            java.lang.Class<retrofit2.c> r20 = retrofit2.c.class
            r15 = r21
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            retrofit2.c r0 = (retrofit2.c) r0
            return r0
        L_0x0058:
            java.lang.Class r3 = a(r22)
            java.lang.Class<com.google.common.util.concurrent.q> r4 = com.google.common.util.concurrent.q.class
            if (r3 == r4) goto L_0x0066
            java.lang.Class<a.i> r4 = a.i.class
            if (r3 == r4) goto L_0x0066
            r0 = 0
            return r0
        L_0x0066:
            r4 = r21
            retrofit2.c r0 = r2.a((retrofit2.c.a) r4, (java.lang.reflect.Type) r0, (java.lang.annotation.Annotation[]) r1)
            java.lang.Class<com.google.common.util.concurrent.q> r1 = com.google.common.util.concurrent.q.class
            if (r3 != r1) goto L_0x0076
            com.ss.android.ugc.aweme.app.api.c$b r1 = new com.ss.android.ugc.aweme.app.api.c$b
            r1.<init>(r0)
            return r1
        L_0x0076:
            java.lang.Class<a.i> r1 = a.i.class
            if (r3 != r1) goto L_0x0080
            com.ss.android.ugc.aweme.app.api.c$a r1 = new com.ss.android.ugc.aweme.app.api.c$a
            r1.<init>(r0)
            return r1
        L_0x0080:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.api.c.a(java.lang.reflect.Type, java.lang.annotation.Annotation[], retrofit2.n):retrofit2.c");
    }
}

package com.ss.android.ugc.aweme.app.api;

import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.l;
import com.google.common.util.concurrent.q;
import com.google.common.util.concurrent.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import retrofit2.b;
import retrofit2.c;
import retrofit2.h;
import retrofit2.m;

public final class j extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33841a;

    /* renamed from: b  reason: collision with root package name */
    final retrofit2.a.a.a f33842b = new retrofit2.a.a.a();

    static class a<R> implements c<R, q<R>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33843a;

        /* renamed from: b  reason: collision with root package name */
        private final c<R, q<m<R>>> f33844b;

        public final Type a() {
            if (!PatchProxy.isSupport(new Object[0], this, f33843a, false, 23089, new Class[0], Type.class)) {
                return this.f33844b.a();
            }
            return (Type) PatchProxy.accessDispatch(new Object[0], this, f33843a, false, 23089, new Class[0], Type.class);
        }

        a(c<R, q<m<R>>> cVar) {
            this.f33844b = cVar;
        }

        public final /* synthetic */ Object a(b bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f33843a, false, 23090, new Class[]{b.class}, q.class)) {
                return (q) PatchProxy.accessDispatch(new Object[]{bVar}, this, f33843a, false, 23090, new Class[]{b.class}, q.class);
            }
            final q qVar = (q) this.f33844b.a(bVar);
            return new com.google.common.util.concurrent.b<R>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f33845a;

                public final void c() {
                    if (PatchProxy.isSupport(new Object[0], this, f33845a, false, 23091, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f33845a, false, 23091, new Class[0], Void.TYPE);
                        return;
                    }
                    qVar.cancel(true);
                }

                {
                    l.a(qVar, new k<m<R>>() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f33848a;

                        public final void onFailure(Throwable th) {
                            Throwable th2 = th;
                            if (PatchProxy.isSupport(new Object[]{th2}, this, f33848a, false, 23093, new Class[]{Throwable.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{th2}, this, f33848a, false, 23093, new Class[]{Throwable.class}, Void.TYPE);
                                return;
                            }
                            AnonymousClass1.this.a(th2);
                        }

                        public final /* synthetic */ void onSuccess(@Nullable Object obj) {
                            m mVar = (m) obj;
                            if (PatchProxy.isSupport(new Object[]{mVar}, this, f33848a, false, 23092, new Class[]{m.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{mVar}, this, f33848a, false, 23092, new Class[]{m.class}, Void.TYPE);
                            } else if (mVar.d()) {
                                T t = mVar.f84319b;
                                if (t instanceof h) {
                                    ((h) t).setRequestId(mVar.c().get("X-TT-LOGID"));
                                }
                                AnonymousClass1.this.b(t);
                            } else {
                                AnonymousClass1.this.a((Throwable) new h(mVar));
                            }
                        }
                    }, v.a());
                }
            };
        }
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
            com.meituan.robust.ChangeQuickRedirect r2 = f33841a
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.lang.reflect.Type> r1 = java.lang.reflect.Type.class
            r5[r12] = r1
            java.lang.Class<java.lang.annotation.Annotation[]> r1 = java.lang.annotation.Annotation[].class
            r5[r13] = r1
            java.lang.Class<retrofit2.n> r1 = retrofit2.n.class
            r5[r14] = r1
            java.lang.Class<retrofit2.c> r6 = retrofit2.c.class
            r3 = 0
            r4 = 23088(0x5a30, float:3.2353E-41)
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0054
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r8
            r0[r13] = r9
            r0[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f33841a
            r3 = 0
            r4 = 23088(0x5a30, float:3.2353E-41)
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
            java.lang.Class<com.google.common.util.concurrent.q> r1 = com.google.common.util.concurrent.q.class
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
            retrofit2.a.a.a r3 = r7.f33842b
            java.lang.Class<com.google.common.util.concurrent.q> r4 = com.google.common.util.concurrent.q.class
            java.lang.reflect.Type[] r5 = new java.lang.reflect.Type[r13]
            java.lang.Class<retrofit2.m> r6 = retrofit2.m.class
            java.lang.reflect.Type[] r11 = new java.lang.reflect.Type[r13]
            r11[r12] = r0
            java.lang.reflect.ParameterizedType r0 = com.google.gson.internal.C$Gson$Types.newParameterizedTypeWithOwner(r2, r6, r11)
            r5[r12] = r0
            java.lang.reflect.ParameterizedType r0 = com.google.gson.internal.C$Gson$Types.newParameterizedTypeWithOwner(r2, r4, r5)
            retrofit2.c r0 = r3.a(r0, r9, r10)
            if (r0 == 0) goto L_0x0097
            com.ss.android.ugc.aweme.app.api.j$a r1 = new com.ss.android.ugc.aweme.app.api.j$a
            r1.<init>(r0)
            return r1
        L_0x0097:
            java.lang.Class<retrofit2.m> r0 = retrofit2.m.class
            if (r1 == r0) goto L_0x00a2
            retrofit2.a.a.a r0 = r7.f33842b
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.api.j.a(java.lang.reflect.Type, java.lang.annotation.Annotation[], retrofit2.n):retrofit2.c");
    }
}

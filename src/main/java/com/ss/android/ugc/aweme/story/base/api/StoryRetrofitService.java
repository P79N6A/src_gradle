package com.ss.android.ugc.aweme.story.base.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;

public class StoryRetrofitService implements IRetrofitService {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Deprecated
    public Object createCompatibleRetrofit(String str) {
        return a.a(str);
    }

    public IRetrofit createNewRetrofit(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 82213, new Class[]{String.class}, IRetrofit.class)) {
            return new c(str2);
        }
        return (IRetrofit) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 82213, new Class[]{String.class}, IRetrofit.class);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.RuntimeException propagateCompatibleException(java.util.concurrent.ExecutionException r18) throws java.lang.Exception {
        /*
            r17 = this;
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.util.concurrent.ExecutionException> r3 = java.util.concurrent.ExecutionException.class
            r7[r9] = r3
            java.lang.Class<java.lang.RuntimeException> r8 = java.lang.RuntimeException.class
            r5 = 0
            r6 = 82214(0x14126, float:1.15206E-40)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
            r13 = 0
            r14 = 82214(0x14126, float:1.15206E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.util.concurrent.ExecutionException> r0 = java.util.concurrent.ExecutionException.class
            r15[r9] = r0
            java.lang.Class<java.lang.RuntimeException> r16 = java.lang.RuntimeException.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            return r0
        L_0x0037:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r9] = r18
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.story.base.api.a.f71918a
            r5 = 1
            r6 = 82212(0x14124, float:1.15204E-40)
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.util.concurrent.ExecutionException> r8 = java.util.concurrent.ExecutionException.class
            r7[r9] = r8
            java.lang.Class<java.lang.RuntimeException> r8 = java.lang.RuntimeException.class
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 != 0) goto L_0x0069
            java.lang.Throwable r0 = r18.getCause()
            boolean r1 = r0 instanceof com.ss.android.ugc.aweme.base.api.a.b.a
            if (r1 != 0) goto L_0x0065
            boolean r1 = r0 instanceof com.google.gson.JsonParseException
            if (r1 == 0) goto L_0x0062
            com.ss.android.ugc.aweme.base.api.a.a.c r1 = new com.ss.android.ugc.aweme.base.api.a.a.c
            r1.<init>(r0)
            goto L_0x0083
        L_0x0062:
            java.lang.Exception r0 = (java.lang.Exception) r0
            throw r0
        L_0x0065:
            r1 = r0
            com.ss.android.ugc.aweme.base.api.a.b.a r1 = (com.ss.android.ugc.aweme.base.api.a.b.a) r1
            goto L_0x0083
        L_0x0069:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r9] = r18
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.story.base.api.a.f71918a
            r5 = 1
            r6 = 82212(0x14124, float:1.15204E-40)
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.util.concurrent.ExecutionException> r0 = java.util.concurrent.ExecutionException.class
            r7[r9] = r0
            java.lang.Class<java.lang.RuntimeException> r8 = java.lang.RuntimeException.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            r1 = r0
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1
        L_0x0083:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.base.api.StoryRetrofitService.propagateCompatibleException(java.util.concurrent.ExecutionException):java.lang.RuntimeException");
    }
}

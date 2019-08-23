package com.ss.android.ugc.aweme.im.sdk.chat.net;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
import java.util.concurrent.Callable;

public final /* synthetic */ class u implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50988a;

    /* renamed from: b  reason: collision with root package name */
    private final s f50989b;

    /* renamed from: c  reason: collision with root package name */
    private final List f50990c;

    /* renamed from: d  reason: collision with root package name */
    private final String f50991d;

    u(s sVar, List list, String str) {
        this.f50989b = sVar;
        this.f50990c = list;
        this.f50991d = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r20 = this;
            r7 = r20
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f50988a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            r3 = 0
            r4 = 51305(0xc869, float:7.1894E-41)
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x002c
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f50988a
            r3 = 0
            r4 = 51305(0xc869, float:7.1894E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            r1 = r20
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Object r0 = (java.lang.Object) r0
            return r0
        L_0x002c:
            com.ss.android.ugc.aweme.im.sdk.chat.net.s r0 = r7.f50989b
            java.util.List r1 = r7.f50990c
            java.lang.String r2 = r7.f50991d
            com.ss.android.ugc.aweme.im.sdk.chat.input.photo.m r3 = com.ss.android.ugc.aweme.im.sdk.chat.input.photo.m.a()
            boolean r3 = r3.f50861c
            java.util.Iterator r4 = r1.iterator()
            r5 = 1
            r6 = 0
        L_0x003e:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x011c
            java.lang.Object r9 = r4.next()
            com.ss.android.ugc.aweme.im.sdk.chat.input.photo.j r9 = (com.ss.android.ugc.aweme.im.sdk.chat.input.photo.j) r9
            java.lang.String r10 = ""
            r11 = 2
            if (r3 != 0) goto L_0x0067
            java.lang.String r10 = r9.getPath()
            java.lang.String r10 = com.ss.android.ugc.aweme.im.sdk.utils.w.a(r10)
            java.lang.String r12 = r9.getPath()
            int r12 = com.ss.android.ugc.aweme.im.sdk.utils.w.a((java.lang.String) r12, (java.lang.String) r10)
            if (r12 != r11) goto L_0x0063
        L_0x0061:
            r6 = 1
            goto L_0x003e
        L_0x0063:
            if (r12 != r5) goto L_0x0067
            java.lang.String r10 = ""
        L_0x0067:
            java.lang.String r12 = r9.getPath()
            java.lang.Object[] r13 = new java.lang.Object[r5]
            r13[r8] = r12
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.im.sdk.utils.w.f52667a
            r16 = 1
            r17 = 53513(0xd109, float:7.4988E-41)
            java.lang.Class[] r11 = new java.lang.Class[r5]
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r11[r8] = r18
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r18 = r11
            boolean r11 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r11 == 0) goto L_0x00a5
            java.lang.Object[] r13 = new java.lang.Object[r5]
            r13[r8] = r12
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.im.sdk.utils.w.f52667a
            r16 = 1
            r17 = 53513(0xd109, float:7.4988E-41)
            java.lang.Class[] r11 = new java.lang.Class[r5]
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            r11[r8] = r12
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r18 = r11
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
            goto L_0x00e0
        L_0x00a5:
            boolean r11 = android.text.TextUtils.isEmpty(r12)
            if (r11 != 0) goto L_0x00e0
            boolean r11 = com.bytedance.common.utility.io.FileUtils.exists(r12)
            if (r11 == 0) goto L_0x00e0
            java.lang.String r11 = com.ss.android.ugc.aweme.im.sdk.utils.w.c(r12)
            boolean r13 = android.text.TextUtils.isEmpty(r11)
            if (r13 != 0) goto L_0x00e0
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            android.content.Context r13 = com.ss.android.common.applog.GlobalContext.getContext()
            java.io.File r13 = r13.getFilesDir()
            java.lang.String r13 = r13.getPath()
            r12.append(r13)
            java.lang.String r13 = "/check/"
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = ".jpg"
            r12.append(r11)
            java.lang.String r12 = r12.toString()
        L_0x00e0:
            java.lang.String r11 = r9.getPath()
            r13 = 240(0xf0, float:3.36E-43)
            int r11 = com.ss.android.ugc.aweme.im.sdk.utils.w.a((java.lang.String) r11, (java.lang.String) r12, (int) r13, (int) r13)
            r13 = 2
            if (r11 != r13) goto L_0x00ef
            goto L_0x0061
        L_0x00ef:
            if (r11 != r5) goto L_0x00f3
            java.lang.String r12 = ""
        L_0x00f3:
            com.ss.android.ugc.aweme.im.sdk.chat.model.StoryPictureContent r9 = com.ss.android.ugc.aweme.im.sdk.chat.model.StoryPictureContent.obtain(r9)
            r9.setSendRaw(r3)
            r9.setCompressPath(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            boolean r11 = android.text.TextUtils.isEmpty(r12)
            if (r11 != 0) goto L_0x010b
            r10.add(r12)
        L_0x010b:
            r9.setCheckPics(r10)
            com.ss.android.ugc.aweme.im.sdk.utils.ba r10 = com.ss.android.ugc.aweme.im.sdk.utils.ba.a()
            com.ss.android.ugc.aweme.im.sdk.chat.net.s$3 r11 = new com.ss.android.ugc.aweme.im.sdk.chat.net.s$3
            r11.<init>()
            r10.c(r2, r9, r11)
            goto L_0x003e
        L_0x011c:
            r0 = 0
            if (r6 == 0) goto L_0x013c
            int r0 = r1.size()
            if (r0 <= r5) goto L_0x0131
            android.content.Context r0 = com.ss.android.common.applog.GlobalContext.getContext()
            r1 = 2131560427(0x7f0d07eb, float:1.8746226E38)
            java.lang.String r0 = r0.getString(r1)
            goto L_0x013c
        L_0x0131:
            android.content.Context r0 = com.ss.android.common.applog.GlobalContext.getContext()
            r1 = 2131560426(0x7f0d07ea, float:1.8746224E38)
            java.lang.String r0 = r0.getString(r1)
        L_0x013c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.net.u.call():java.lang.Object");
    }
}

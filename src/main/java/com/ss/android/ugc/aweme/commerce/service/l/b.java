package com.ss.android.ugc.aweme.commerce.service.l;

import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/utils/ClipBoardUtils;", "", "()V", "Companion", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f37987a = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/utils/ClipBoardUtils$Companion;", "", "()V", "getClipBoardAsString", "", "context", "Landroid/content/Context;", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37988a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x005e, code lost:
            if (r0 == null) goto L_0x0060;
         */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x005a A[Catch:{ Exception -> 0x0063 }] */
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String a(@org.jetbrains.annotations.NotNull android.content.Context r18) {
            /*
                r17 = this;
                r0 = r18
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r4 = f37988a
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<android.content.Context> r3 = android.content.Context.class
                r7[r9] = r3
                java.lang.Class<java.lang.String> r8 = java.lang.String.class
                r5 = 0
                r6 = 29959(0x7507, float:4.1982E-41)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x0037
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r12 = f37988a
                r13 = 0
                r14 = 29959(0x7507, float:4.1982E-41)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<android.content.Context> r0 = android.content.Context.class
                r15[r9] = r0
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                r11 = r17
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                java.lang.String r0 = (java.lang.String) r0
                return r0
            L_0x0037:
                java.lang.String r1 = "context"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r1)
                java.lang.String r1 = "clipboard"
                java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ Exception -> 0x0063 }
                android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0     // Catch:{ Exception -> 0x0063 }
                if (r0 == 0) goto L_0x0057
                android.content.ClipData r0 = r0.getPrimaryClip()     // Catch:{ Exception -> 0x0063 }
                if (r0 == 0) goto L_0x0057
                android.content.ClipData$Item r0 = r0.getItemAt(r9)     // Catch:{ Exception -> 0x0063 }
                if (r0 == 0) goto L_0x0057
                java.lang.CharSequence r0 = r0.getText()     // Catch:{ Exception -> 0x0063 }
                goto L_0x0058
            L_0x0057:
                r0 = 0
            L_0x0058:
                if (r0 == 0) goto L_0x0060
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0063 }
                if (r0 != 0) goto L_0x0062
            L_0x0060:
                java.lang.String r0 = ""
            L_0x0062:
                return r0
            L_0x0063:
                java.lang.String r0 = ""
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.service.l.b.a.a(android.content.Context):java.lang.String");
        }
    }
}

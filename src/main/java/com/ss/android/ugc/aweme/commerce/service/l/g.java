package com.ss.android.ugc.aweme.commerce.service.l;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/utils/ResourceHelper;", "", "()V", "Companion", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38015a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f38016b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J5\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000b\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/utils/ResourceHelper$Companion;", "", "()V", "getColor", "", "context", "Landroid/content/Context;", "resId", "getString", "", "formattedArgs", "", "(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38017a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        public final int a(@NotNull Context context, int i) {
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i)}, this, f38017a, false, 30000, new Class[]{Context.class, Integer.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i)}, this, f38017a, false, 30000, new Class[]{Context.class, Integer.TYPE}, Integer.TYPE)).intValue();
            }
            Intrinsics.checkParameterIsNotNull(context2, "context");
            return ContextCompat.getColor(context, i);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.Object[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String a(@org.jetbrains.annotations.NotNull android.content.Context r21, int r22, @org.jetbrains.annotations.NotNull java.lang.Object... r23) {
            /*
                r20 = this;
                r0 = r21
                r1 = r23
                r2 = 3
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r10 = 0
                r3[r10] = r0
                java.lang.Integer r4 = java.lang.Integer.valueOf(r22)
                r11 = 1
                r3[r11] = r4
                r12 = 2
                r3[r12] = r1
                com.meituan.robust.ChangeQuickRedirect r5 = f38017a
                java.lang.Class[] r8 = new java.lang.Class[r2]
                java.lang.Class<android.content.Context> r4 = android.content.Context.class
                r8[r10] = r4
                java.lang.Class r4 = java.lang.Integer.TYPE
                r8[r11] = r4
                java.lang.Class<java.lang.Object[]> r4 = java.lang.Object[].class
                r8[r12] = r4
                java.lang.Class<java.lang.String> r9 = java.lang.String.class
                r6 = 0
                r7 = 30001(0x7531, float:4.204E-41)
                r4 = r20
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
                if (r3 == 0) goto L_0x005e
                java.lang.Object[] r13 = new java.lang.Object[r2]
                r13[r10] = r0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
                r13[r11] = r0
                r13[r12] = r1
                com.meituan.robust.ChangeQuickRedirect r15 = f38017a
                r16 = 0
                r17 = 30001(0x7531, float:4.204E-41)
                java.lang.Class[] r0 = new java.lang.Class[r2]
                java.lang.Class<android.content.Context> r1 = android.content.Context.class
                r0[r10] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r0[r11] = r1
                java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
                r0[r12] = r1
                java.lang.Class<java.lang.String> r19 = java.lang.String.class
                r14 = r20
                r18 = r0
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
                java.lang.String r0 = (java.lang.String) r0
                return r0
            L_0x005e:
                java.lang.String r2 = "context"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
                java.lang.String r2 = "formattedArgs"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r2)
                int r2 = r1.length
                java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
                r2 = r22
                java.lang.String r0 = r0.getString(r2, r1)
                java.lang.String r1 = "context.getString(resId, *formattedArgs)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.service.l.g.a.a(android.content.Context, int, java.lang.Object[]):java.lang.String");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String a(@org.jetbrains.annotations.NotNull android.content.Context r20, int r21, @org.jetbrains.annotations.NotNull java.lang.Object... r22) {
        /*
            r0 = r20
            r1 = r22
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r21)
            r11 = 1
            r3[r11] = r4
            r12 = 2
            r3[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f38015a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r11] = r4
            java.lang.Class<java.lang.Object[]> r4 = java.lang.Object[].class
            r8[r12] = r4
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r4 = 0
            r6 = 1
            r7 = 29999(0x752f, float:4.2038E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x005c
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r13[r10] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            r13[r11] = r0
            r13[r12] = r1
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f38015a
            r16 = 1
            r17 = 29999(0x752f, float:4.2038E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r11] = r1
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            r0[r12] = r1
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r18 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x005c:
            com.ss.android.ugc.aweme.commerce.service.l.g$a r2 = f38016b
            r3 = r21
            java.lang.String r0 = r2.a(r0, r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.service.l.g.a(android.content.Context, int, java.lang.Object[]):java.lang.String");
    }
}

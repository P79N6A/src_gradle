package com.ss.android.ugc.aweme.commerce.preview.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.commerce.service.l.k;
import com.ss.android.ugc.aweme.commerce.service.models.z;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B-\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0007J\u001b\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\f¢\u0006\u0002\u0010\rJ\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\f¢\u0006\u0002\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\f¢\u0006\u0002\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00042\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\fH\u0002¢\u0006\u0002\u0010\u000fJ\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\f¢\u0006\u0002\u0010\u000fJ\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\f¢\u0006\u0002\u0010\u0015J\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\f¢\u0006\u0002\u0010\u0015R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/view/SkuStock;", "", "skuInfoMap", "", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/SkuItem;", "skuImageMap", "(Ljava/util/Map;Ljava/util/Map;)V", "stockInfoMap", "canSelect", "", "idArray", "", "([Ljava/lang/String;)Z", "getCheckedId", "([Ljava/lang/String;)Ljava/lang/String;", "getSkuActivity", "getSkuId", "getSkuImageUrl", "getSkuPrice", "", "([Ljava/lang/String;)Ljava/lang/Integer;", "getStockCount", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37652a;

    /* renamed from: c  reason: collision with root package name */
    public static final C0483a f37653c = new C0483a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    final Map<String, z> f37654b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/view/SkuStock$Companion;", "", "()V", "NONE_ID", "", "SERVER_LINK_SYMBOL", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commerce.preview.view.a$a  reason: collision with other inner class name */
    public static final class C0483a {
        private C0483a() {
        }

        public /* synthetic */ C0483a(byte b2) {
            this();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String[] r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f37652a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r5 = 0
            r6 = 29191(0x7207, float:4.0905E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f37652a
            r13 = 0
            r14 = 29191(0x7207, float:4.0905E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0037:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = r0.length
            r4 = 0
        L_0x003e:
            if (r4 >= r3) goto L_0x0055
            r5 = r0[r4]
            if (r5 != 0) goto L_0x004a
            java.lang.String r5 = "0"
            r2.append(r5)
            goto L_0x004d
        L_0x004a:
            r2.append(r5)
        L_0x004d:
            java.lang.String r5 = "_"
            r2.append(r5)
            int r4 = r4 + 1
            goto L_0x003e
        L_0x0055:
            r0 = r2
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto L_0x005f
            r9 = 1
        L_0x005f:
            if (r9 != 0) goto L_0x0069
            int r0 = r2.length()
            int r0 = r0 - r1
            r2.deleteCharAt(r0)
        L_0x0069:
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "keySb.toString()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.view.a.a(java.lang.String[]):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005d  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer b(@org.jetbrains.annotations.NotNull java.lang.String[] r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f37652a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r8] = r1
            java.lang.Class<java.lang.Integer> r6 = java.lang.Integer.class
            r3 = 0
            r4 = 29192(0x7208, float:4.0907E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0033
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f37652a
            r3 = 0
            r4 = 29192(0x7208, float:4.0907E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r8] = r1
            java.lang.Class<java.lang.Integer> r6 = java.lang.Integer.class
            r1 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            return r0
        L_0x0033:
            java.lang.String r0 = "idArray"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            java.lang.String r0 = r9.a(r10)
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.commerce.service.models.z> r1 = r9.f37654b
            java.lang.Object r1 = r1.get(r0)
            com.ss.android.ugc.aweme.commerce.service.models.z r1 = (com.ss.android.ugc.aweme.commerce.service.models.z) r1
            if (r1 == 0) goto L_0x0051
            java.lang.Integer r1 = r1.getUserLimit()
            if (r1 == 0) goto L_0x0051
            int r1 = r1.intValue()
            goto L_0x0053
        L_0x0051:
            r1 = 30
        L_0x0053:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.commerce.service.models.z> r2 = r9.f37654b
            java.lang.Object r0 = r2.get(r0)
            com.ss.android.ugc.aweme.commerce.service.models.z r0 = (com.ss.android.ugc.aweme.commerce.service.models.z) r0
            if (r0 == 0) goto L_0x0061
            int r8 = r0.getStockNum()
        L_0x0061:
            int r0 = java.lang.Math.min(r8, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.view.a.b(java.lang.String[]):java.lang.Integer");
    }

    public final boolean c(@NotNull String[] strArr) {
        Object obj = strArr;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f37652a, false, 29193, new Class[]{String[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f37652a, false, 29193, new Class[]{String[].class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(obj, "idArray");
        z zVar = this.f37654b.get(a(strArr));
        if (zVar != null) {
            return zVar.getCanSelect();
        }
        return false;
    }

    public a(@NotNull Map<String, z> map, @NotNull Map<String, String> map2) {
        Intrinsics.checkParameterIsNotNull(map, "skuInfoMap");
        Intrinsics.checkParameterIsNotNull(map2, "skuImageMap");
        this.f37654b = k.f38038b.a(map, map2, PushConstants.PUSH_TYPE_NOTIFY, "_");
    }
}

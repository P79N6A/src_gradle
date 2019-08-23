package com.ss.android.ugc.aweme.commerce.preview.view;

import android.content.Context;
import android.support.v7.widget.LinearLayoutCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.preview.view.b;
import com.ss.android.ugc.aweme.commerce.service.models.ak;
import com.ss.android.ugc.aweme.commerce.service.models.y;
import com.ss.android.ugc.aweme.commerce.service.models.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 .2\u00020\u0001:\u0003./0B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0018\u001a\u0004\u0018\u00010\rJ\u0006\u0010\u0019\u001a\u00020\u001aJ\r\u0010\u001b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u001cJ\r\u0010\u001d\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u001cJ\b\u0010\u001e\u001a\u0004\u0018\u00010\rJ\u0015\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f¢\u0006\u0002\u0010 J\u0006\u0010!\u001a\u00020\u001aJ\u0010\u0010\"\u001a\u00020#2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u000e\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020&J\u000e\u0010'\u001a\u00020#2\u0006\u0010(\u001a\u00020\u0010J/\u0010)\u001a\u00020#2\u0006\u0010%\u001a\u00020*2\u0010\u0010+\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f2\b\u0010,\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010-R\u001a\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\fX\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017X\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/view/SpecItemGroupLayout;", "Landroid/support/v7/widget/LinearLayoutCompat;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "checkIdArray", "", "", "[Ljava/lang/String;", "checkedChangeListener", "Lcom/ss/android/ugc/aweme/commerce/preview/view/SpecItemGroupLayout$ICheckedChangeListener;", "mContext", "skuStock", "Lcom/ss/android/ugc/aweme/commerce/preview/view/SkuStock;", "specItemLayoutList", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/commerce/preview/view/SpecItemLayout;", "Lkotlin/collections/ArrayList;", "getCheckSkuImageUrl", "getCheckSkuIsActivity", "", "getCheckSkuPrice", "()Ljava/lang/Integer;", "getCheckSkuStockCount", "getCheckedId", "getCheckedIdArray", "()[Ljava/lang/String;", "hasValidSku", "initView", "", "refreshSpecItemState", "skuInfo", "Lcom/ss/android/ugc/aweme/commerce/service/models/SkuInfo;", "setCheckedChangeListener", "checkChangeListener", "setSpecItemGroupList", "Lcom/ss/android/ugc/aweme/commerce/service/models/UISkuInfo;", "initCheckIdArray", "hostType", "(Lcom/ss/android/ugc/aweme/commerce/service/models/UISkuInfo;[Ljava/lang/String;Ljava/lang/Integer;)V", "Companion", "ICheckedChangeListener", "ISpecItemGroup", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SpecItemGroupLayout extends LinearLayoutCompat {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37641a;
    public static final a g = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public Context f37642b;

    /* renamed from: c  reason: collision with root package name */
    public a f37643c;

    /* renamed from: d  reason: collision with root package name */
    public String[] f37644d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<b> f37645e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public b f37646f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/view/SpecItemGroupLayout$Companion;", "", "()V", "VALUE_12_F", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/view/SpecItemGroupLayout$ICheckedChangeListener;", "", "onCheckedChange", "", "checkIdArray", "", "", "([Ljava/lang/String;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface b {
        void a(@NotNull String[] strArr);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/commerce/preview/view/SpecItemGroupLayout$setSpecItemGroupList$1$1", "Lcom/ss/android/ugc/aweme/commerce/preview/view/SpecItemLayout$IOnItemCheckedListener;", "onItemChecked", "", "groupIndex", "", "itemViewInfo", "Lcom/ss/android/ugc/aweme/commerce/preview/view/SpecItemLayout$ItemViewInfo;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements b.C0484b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37647a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SpecItemGroupLayout f37648b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f37649c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Integer f37650d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ak f37651e;

        public final void a(int i, @Nullable b.c cVar) {
            String str;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), cVar}, this, f37647a, false, 29210, new Class[]{Integer.TYPE, b.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), cVar}, this, f37647a, false, 29210, new Class[]{Integer.TYPE, b.c.class}, Void.TYPE);
                return;
            }
            String[] strArr = this.f37648b.f37644d;
            if (strArr != null) {
                if (cVar != null) {
                    str = cVar.f37662b;
                } else {
                    str = null;
                }
                strArr[i] = str;
                for (Object next : this.f37648b.f37645e) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    b bVar = (b) next;
                    if (i2 != i) {
                        bVar.a(strArr, this.f37648b.f37643c);
                    }
                    i2 = i3;
                }
                b bVar2 = this.f37648b.f37646f;
                if (bVar2 != null) {
                    bVar2.a(strArr);
                }
            }
        }

        public c(SpecItemGroupLayout specItemGroupLayout, int i, Integer num, ak akVar) {
            this.f37648b = specItemGroupLayout;
            this.f37649c = i;
            this.f37650d = num;
            this.f37651e = akVar;
        }
    }

    @Nullable
    public final String[] getCheckedIdArray() {
        return this.f37644d;
    }

    @Nullable
    public final Integer getCheckSkuStockCount() {
        if (PatchProxy.isSupport(new Object[0], this, f37641a, false, 29204, new Class[0], Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[0], this, f37641a, false, 29204, new Class[0], Integer.class);
        } else if (this.f37644d == null) {
            return 0;
        } else {
            a aVar = this.f37643c;
            if (aVar == null) {
                return null;
            }
            String[] strArr = this.f37644d;
            if (strArr == null) {
                Intrinsics.throwNpe();
            }
            return aVar.b(strArr);
        }
    }

    public final boolean a() {
        Integer num;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f37641a, false, 29207, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f37641a, false, 29207, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f37644d == null) {
            return false;
        } else {
            String[] strArr = this.f37644d;
            if (strArr == null) {
                Intrinsics.throwNpe();
            }
            Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
            Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
            String[] strArr2 = (String[]) copyOf;
            int length = strArr2.length;
            int i = 0;
            while (true) {
                num = null;
                if (i >= length) {
                    break;
                }
                strArr2[i] = null;
                i++;
            }
            a aVar = this.f37643c;
            if (aVar != null) {
                num = aVar.b(strArr2);
            }
            if (num != null && num.intValue() > 0) {
                z = true;
            }
            return z;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getCheckSkuImageUrl() {
        /*
            r12 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f37641a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r4 = 0
            r5 = 29203(0x7213, float:4.0922E-41)
            r2 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0026
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f37641a
            r5 = 0
            r6 = 29203(0x7213, float:4.0922E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = r12
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0026:
            java.lang.String[] r1 = r12.f37644d
            r2 = 0
            if (r1 == 0) goto L_0x0082
            com.ss.android.ugc.aweme.commerce.preview.view.a r1 = r12.f37643c
            if (r1 == 0) goto L_0x0082
            java.lang.String[] r10 = r12.f37644d
            if (r10 != 0) goto L_0x0036
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0036:
            r11 = 1
            java.lang.Object[] r3 = new java.lang.Object[r11]
            r3[r0] = r10
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.commerce.preview.view.a.f37652a
            r6 = 0
            r7 = 29194(0x720a, float:4.091E-41)
            java.lang.Class[] r8 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r8[r0] = r4
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r4 = r1
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0069
            java.lang.Object[] r3 = new java.lang.Object[r11]
            r3[r0] = r10
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.commerce.preview.view.a.f37652a
            r6 = 0
            r7 = 29194(0x720a, float:4.091E-41)
            java.lang.Class[] r8 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            r8[r0] = r2
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r4 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0082
        L_0x0069:
            java.lang.String r0 = "idArray"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            java.lang.String r0 = r1.a(r10)
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.commerce.service.models.z> r1 = r1.f37654b
            java.lang.Object r0 = r1.get(r0)
            com.ss.android.ugc.aweme.commerce.service.models.z r0 = (com.ss.android.ugc.aweme.commerce.service.models.z) r0
            if (r0 == 0) goto L_0x0081
            java.lang.String r2 = r0.getImageUrl()
            goto L_0x0082
        L_0x0081:
            return r2
        L_0x0082:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.view.SpecItemGroupLayout.getCheckSkuImageUrl():java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean getCheckSkuIsActivity() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f37641a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 29206(0x7216, float:4.0926E-41)
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002a
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f37641a
            r5 = 0
            r6 = 29206(0x7216, float:4.0926E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = r11
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x002a:
            java.lang.String[] r1 = r11.f37644d
            if (r1 == 0) goto L_0x0088
            com.ss.android.ugc.aweme.commerce.preview.view.a r1 = r11.f37643c
            if (r1 == 0) goto L_0x0088
            java.lang.String[] r9 = r11.f37644d
            if (r9 != 0) goto L_0x0039
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0039:
            r10 = 1
            java.lang.Object[] r2 = new java.lang.Object[r10]
            r2[r0] = r9
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.commerce.preview.view.a.f37652a
            r5 = 0
            r6 = 29196(0x720c, float:4.0912E-41)
            java.lang.Class[] r7 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
            r7[r0] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = r1
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x006f
            java.lang.Object[] r2 = new java.lang.Object[r10]
            r2[r0] = r9
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.commerce.preview.view.a.f37652a
            r5 = 0
            r6 = 29196(0x720c, float:4.0912E-41)
            java.lang.Class[] r7 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
            r7[r0] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0088
        L_0x006f:
            java.lang.String r2 = "idArray"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r2)
            java.lang.String r2 = r1.a(r9)
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.commerce.service.models.z> r1 = r1.f37654b
            java.lang.Object r1 = r1.get(r2)
            com.ss.android.ugc.aweme.commerce.service.models.z r1 = (com.ss.android.ugc.aweme.commerce.service.models.z) r1
            if (r1 == 0) goto L_0x0087
            boolean r0 = r1.isActivity()
            goto L_0x0088
        L_0x0087:
            return r0
        L_0x0088:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.view.SpecItemGroupLayout.getCheckSkuIsActivity():boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer getCheckSkuPrice() {
        /*
            r12 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f37641a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.Integer> r7 = java.lang.Integer.class
            r4 = 0
            r5 = 29205(0x7215, float:4.0925E-41)
            r2 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0026
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f37641a
            r5 = 0
            r6 = 29205(0x7215, float:4.0925E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.lang.Integer> r8 = java.lang.Integer.class
            r3 = r12
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Integer r0 = (java.lang.Integer) r0
            return r0
        L_0x0026:
            java.lang.String[] r1 = r12.f37644d
            if (r1 == 0) goto L_0x0085
            com.ss.android.ugc.aweme.commerce.preview.view.a r1 = r12.f37643c
            r9 = 0
            if (r1 == 0) goto L_0x0084
            java.lang.String[] r10 = r12.f37644d
            if (r10 != 0) goto L_0x0036
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0036:
            r11 = 1
            java.lang.Object[] r2 = new java.lang.Object[r11]
            r2[r0] = r10
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.commerce.preview.view.a.f37652a
            r5 = 0
            r6 = 29195(0x720b, float:4.0911E-41)
            java.lang.Class[] r7 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
            r7[r0] = r3
            java.lang.Class<java.lang.Integer> r8 = java.lang.Integer.class
            r3 = r1
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0068
            java.lang.Object[] r2 = new java.lang.Object[r11]
            r2[r0] = r10
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.commerce.preview.view.a.f37652a
            r5 = 0
            r6 = 29195(0x720b, float:4.0911E-41)
            java.lang.Class[] r7 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
            r7[r0] = r3
            java.lang.Class<java.lang.Integer> r8 = java.lang.Integer.class
            r3 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x0089
        L_0x0068:
            java.lang.String r0 = "idArray"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            java.lang.String r0 = r1.a(r10)
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.commerce.service.models.z> r1 = r1.f37654b
            java.lang.Object r0 = r1.get(r0)
            com.ss.android.ugc.aweme.commerce.service.models.z r0 = (com.ss.android.ugc.aweme.commerce.service.models.z) r0
            if (r0 == 0) goto L_0x0084
            int r0 = r0.getPrice()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0089
        L_0x0084:
            return r9
        L_0x0085:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0089:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.view.SpecItemGroupLayout.getCheckSkuPrice():java.lang.Integer");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getCheckedId() {
        /*
            r12 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f37641a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r4 = 0
            r5 = 29202(0x7212, float:4.0921E-41)
            r2 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0026
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f37641a
            r5 = 0
            r6 = 29202(0x7212, float:4.0921E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = r12
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0026:
            java.lang.String[] r1 = r12.f37644d
            r2 = 0
            if (r1 == 0) goto L_0x00a0
            com.ss.android.ugc.aweme.commerce.preview.view.a r1 = r12.f37643c
            if (r1 == 0) goto L_0x00a0
            java.lang.String[] r10 = r12.f37644d
            if (r10 != 0) goto L_0x0036
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0036:
            r11 = 1
            java.lang.Object[] r3 = new java.lang.Object[r11]
            r3[r0] = r10
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.commerce.preview.view.a.f37652a
            r6 = 0
            r7 = 29197(0x720d, float:4.0914E-41)
            java.lang.Class[] r8 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r8[r0] = r4
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r4 = r1
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0069
            java.lang.Object[] r3 = new java.lang.Object[r11]
            r3[r0] = r10
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.commerce.preview.view.a.f37652a
            r6 = 0
            r7 = 29197(0x720d, float:4.0914E-41)
            java.lang.Class[] r8 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            r8[r0] = r2
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r4 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x00a0
        L_0x0069:
            java.lang.String r1 = "idArray"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r3 = r10.length
            r4 = 0
        L_0x0075:
            if (r4 >= r3) goto L_0x0087
            r5 = r10[r4]
            if (r5 != 0) goto L_0x007c
            goto L_0x00a0
        L_0x007c:
            r1.append(r5)
            java.lang.String r5 = "_"
            r1.append(r5)
            int r4 = r4 + 1
            goto L_0x0075
        L_0x0087:
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0091
            r0 = 1
        L_0x0091:
            if (r0 != 0) goto L_0x009b
            int r0 = r1.length()
            int r0 = r0 - r11
            r1.deleteCharAt(r0)
        L_0x009b:
            java.lang.String r0 = r1.toString()
            return r0
        L_0x00a0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.view.SpecItemGroupLayout.getCheckedId():java.lang.String");
    }

    public final void setCheckedChangeListener(@NotNull b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f37641a, false, 29201, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f37641a, false, 29201, new Class[]{b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar2, "checkChangeListener");
        this.f37646f = bVar2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpecItemGroupLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (PatchProxy.isSupport(new Object[]{context}, this, f37641a, false, 29198, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f37641a, false, 29198, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.f37642b = context;
        setOrientation(1);
    }

    public final void a(@NotNull y yVar) {
        if (PatchProxy.isSupport(new Object[]{yVar}, this, f37641a, false, 29200, new Class[]{y.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{yVar}, this, f37641a, false, 29200, new Class[]{y.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(yVar, "skuInfo");
        if (!(yVar.getSkuList() == null || yVar.getPictureMap() == null)) {
            Map<String, z> skuList = yVar.getSkuList();
            if (skuList == null) {
                Intrinsics.throwNpe();
            }
            Map<String, String> pictureMap = yVar.getPictureMap();
            if (pictureMap == null) {
                Intrinsics.throwNpe();
            }
            this.f37643c = new a(skuList, pictureMap);
            Iterator<b> it2 = this.f37645e.iterator();
            while (it2.hasNext()) {
                b next = it2.next();
                String[] strArr = this.f37644d;
                if (strArr != null) {
                    next.a(strArr, this.f37643c);
                }
            }
        }
    }
}

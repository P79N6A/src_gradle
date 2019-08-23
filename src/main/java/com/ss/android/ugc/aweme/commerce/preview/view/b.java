package com.ss.android.ugc.aweme.commerce.preview.view;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0003RSTB#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\"\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000b2\b\u00100\u001a\u0004\u0018\u00010\u001bH\u0002J\u0010\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0011H\u0002J\n\u00103\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u00104\u001a\u00020,H\u0016J\u0012\u00105\u001a\u00020,2\b\u00106\u001a\u0004\u0018\u00010\u001bH\u0002J0\u00107\u001a\u00020,2\u0006\u00108\u001a\u00020\b2\u0006\u00109\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u0006H\u0014J\u0018\u0010=\u001a\u00020,2\u0006\u0010>\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u0006H\u0014J'\u0010@\u001a\u00020,2\u000e\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0B2\b\u0010C\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0002\u0010EJ\b\u0010F\u001a\u00020,H\u0016J\u0010\u0010G\u001a\u00020,2\u0006\u0010H\u001a\u00020\u001bH\u0016J\u0018\u0010I\u001a\u00020,2\u0006\u0010J\u001a\u00020\u00062\b\u00100\u001a\u0004\u0018\u00010\u001bJ\u000e\u0010K\u001a\u00020,2\u0006\u0010L\u001a\u00020%J&\u0010M\u001a\u00020,2\u0006\u0010N\u001a\u00020\u001b2\u000e\u0010O\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001f2\u0006\u0010J\u001a\u00020\u0006J\u000e\u0010P\u001a\u00020,2\u0006\u0010Q\u001a\u00020\bR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0017\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001fX.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006U"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/view/SpecItemLayout;", "Landroid/widget/FrameLayout;", "Lcom/ss/android/ugc/aweme/commerce/preview/view/SpecItemGroupLayout$ISpecItemGroup;", "context", "Landroid/content/Context;", "hostType", "", "onSale", "", "(Landroid/content/Context;Ljava/lang/Integer;Z)V", "checkedItemViewInfo", "Lcom/ss/android/ugc/aweme/commerce/preview/view/SpecItemLayout$ItemViewInfo;", "childViewArrayList", "Landroid/util/SparseArray;", "", "Landroid/view/View;", "groupTitleTextSize", "", "getHostType", "()Ljava/lang/Integer;", "setHostType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "mChildHorizonalSpace", "mChildVerticalSpace", "mGroupIndex", "mGroupTitle", "", "mItemPaddingHorizontal", "mItemStartIndex", "mItemViewInfoList", "", "getMItemViewInfoList$main_douyinCnRelease", "()Ljava/util/List;", "setMItemViewInfoList$main_douyinCnRelease", "(Ljava/util/List;)V", "mOnItemCheckedListener", "Lcom/ss/android/ugc/aweme/commerce/preview/view/SpecItemLayout$IOnItemCheckedListener;", "mSupportCancel", "mTitleTextMarginBottom", "getOnSale", "()Z", "specItemViewPadding", "changeSpecItemViewState", "", "childView", "Landroid/widget/TextView;", "viewInfo", "checkedId", "dip2Px", "dpValue", "getCheckedItemViewInfo", "invalidate", "notifyChangeSpecItemViewState", "checkedItemId", "onLayout", "changed", "left", "top", "right", "bottom", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "refreshSpeckItemView", "checkIdArray", "", "skuStock", "Lcom/ss/android/ugc/aweme/commerce/preview/view/SkuStock;", "([Ljava/lang/String;Lcom/ss/android/ugc/aweme/commerce/preview/view/SkuStock;)V", "requestLayout", "setCheckedId", "itemId", "setInitCheckSpecItemInfo", "specGroupIndex", "setOnItemCheckedListener", "onItemCheckedListener", "setSpecItemInfo", "specTitle", "dataList", "setSupportCancel", "supportCancel", "Companion", "IOnItemCheckedListener", "ItemViewInfo", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37655a = null;
    public static final a g = new a((byte) 0);
    private static final String s = s;

    /* renamed from: b  reason: collision with root package name */
    public boolean f37656b = true;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public List<c> f37657c;

    /* renamed from: d  reason: collision with root package name */
    public c f37658d;

    /* renamed from: e  reason: collision with root package name */
    public int f37659e = -1;

    /* renamed from: f  reason: collision with root package name */
    public C0484b f37660f;
    private final int h = a(11.0f);
    private final int i = a(10.0f);
    private final int j = a(12.0f);
    private final int k;
    private final int l = a(12.0f);
    private final float m;
    private int n;
    private String o;
    private final SparseArray<List<View>> p = new SparseArray<>();
    @Nullable
    private Integer q;
    private final boolean r;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/view/SpecItemLayout$Companion;", "", "()V", "TAG", "", "VALUE_10_F", "", "VALUE_11_F", "VALUE_12_F", "VALUE_13_F", "VALUE_5_F", "VALUE_7_F", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/view/SpecItemLayout$IOnItemCheckedListener;", "", "onItemChecked", "", "groupIndex", "", "itemViewInfo", "Lcom/ss/android/ugc/aweme/commerce/preview/view/SpecItemLayout$ItemViewInfo;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commerce.preview.view.b$b  reason: collision with other inner class name */
    public interface C0484b {
        void a(int i, @Nullable c cVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\u000f\u001a\u00020\u0007R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/view/SpecItemLayout$ItemViewInfo;", "", "itemId", "", "text", "(Ljava/lang/String;Ljava/lang/String;)V", "hasStock", "", "getHasStock", "()Z", "setHasStock", "(Z)V", "getItemId", "()Ljava/lang/String;", "getText", "tryChecked", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f37661a = true;
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public final String f37662b;
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        public final String f37663c;

        public c(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkParameterIsNotNull(str, "itemId");
            Intrinsics.checkParameterIsNotNull(str2, "text");
            this.f37662b = str;
            this.f37663c = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37664a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f37665b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f37666c;

        d(b bVar, c cVar) {
            this.f37665b = bVar;
            this.f37666c = cVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x008c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r10) {
            /*
                r9 = this;
                r7 = 1
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r8 = 0
                r0[r8] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f37664a
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<android.view.View> r1 = android.view.View.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 29227(0x722b, float:4.0956E-41)
                r1 = r9
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0030
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r8] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f37664a
                r3 = 0
                r4 = 29227(0x722b, float:4.0956E-41)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<android.view.View> r1 = android.view.View.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0030:
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r10)
                com.ss.android.ugc.aweme.commerce.preview.view.b$c r0 = r9.f37666c
                boolean r0 = r0.f37661a
                if (r0 != 0) goto L_0x003a
                return
            L_0x003a:
                com.ss.android.ugc.aweme.commerce.preview.view.b r0 = r9.f37665b
                com.ss.android.ugc.aweme.commerce.preview.view.b$c r0 = r0.f37658d
                if (r0 == 0) goto L_0x006a
                com.ss.android.ugc.aweme.commerce.preview.view.b r0 = r9.f37665b
                com.ss.android.ugc.aweme.commerce.preview.view.b$c r0 = r0.f37658d
                if (r0 != 0) goto L_0x0049
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x0049:
                java.lang.String r0 = r0.f37662b
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                com.ss.android.ugc.aweme.commerce.preview.view.b$c r1 = r9.f37666c
                java.lang.String r1 = r1.f37662b
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r0 = android.text.TextUtils.equals(r0, r1)
                if (r0 == 0) goto L_0x006a
                com.ss.android.ugc.aweme.commerce.preview.view.b r0 = r9.f37665b
                boolean r0 = r0.f37656b
                if (r0 == 0) goto L_0x0086
                com.ss.android.ugc.aweme.commerce.preview.view.b r0 = r9.f37665b
                r1 = 0
                r0.f37658d = r1
                com.ss.android.ugc.aweme.commerce.preview.view.b r0 = r9.f37665b
                r0.a((java.lang.String) r1)
                goto L_0x0086
            L_0x006a:
                com.ss.android.ugc.aweme.commerce.preview.view.b$c r0 = r9.f37666c
                boolean r0 = r0.f37661a
                if (r0 == 0) goto L_0x0086
                com.ss.android.ugc.aweme.commerce.preview.view.b r0 = r9.f37665b
                com.ss.android.ugc.aweme.commerce.preview.view.b$c r1 = r9.f37666c
                r0.f37658d = r1
                com.ss.android.ugc.aweme.commerce.preview.view.b r0 = r9.f37665b
                com.ss.android.ugc.aweme.commerce.preview.view.b r1 = r9.f37665b
                com.ss.android.ugc.aweme.commerce.preview.view.b$c r1 = r1.f37658d
                if (r1 != 0) goto L_0x0081
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x0081:
                java.lang.String r1 = r1.f37662b
                r0.a((java.lang.String) r1)
            L_0x0086:
                com.ss.android.ugc.aweme.commerce.preview.view.b r0 = r9.f37665b
                com.ss.android.ugc.aweme.commerce.preview.view.b$b r0 = r0.f37660f
                if (r0 == 0) goto L_0x00a0
                com.ss.android.ugc.aweme.commerce.preview.view.b r0 = r9.f37665b
                com.ss.android.ugc.aweme.commerce.preview.view.b$b r0 = r0.f37660f
                if (r0 != 0) goto L_0x0095
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x0095:
                com.ss.android.ugc.aweme.commerce.preview.view.b r1 = r9.f37665b
                int r1 = r1.f37659e
                com.ss.android.ugc.aweme.commerce.preview.view.b r2 = r9.f37665b
                com.ss.android.ugc.aweme.commerce.preview.view.b$c r2 = r2.f37658d
                r0.a(r1, r2)
            L_0x00a0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.view.b.d.onClick(android.view.View):void");
        }
    }

    @Nullable
    public final c getCheckedItemViewInfo() {
        return this.f37658d;
    }

    @Nullable
    public final Integer getHostType() {
        return this.q;
    }

    public final boolean getOnSale() {
        return this.r;
    }

    public final void a(@NotNull String[] strArr, @Nullable a aVar) {
        if (PatchProxy.isSupport(new Object[]{strArr, aVar}, this, f37655a, false, 29223, new Class[]{String[].class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{strArr, aVar}, this, f37655a, false, 29223, new Class[]{String[].class, a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(strArr, "checkIdArray");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
        String[] strArr2 = (String[]) copyOf;
        int childCount = getChildCount();
        for (int i2 = this.n; i2 < childCount; i2++) {
            int i3 = i2 - this.n;
            if (aVar != null) {
                List<c> list = this.f37657c;
                if (list == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mItemViewInfoList");
                }
                if (i3 < list.size()) {
                    List<c> list2 = this.f37657c;
                    if (list2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mItemViewInfoList");
                    }
                    c cVar = list2.get(i3);
                    strArr2[this.f37659e] = cVar.f37662b;
                    cVar.f37661a = aVar.c(strArr2);
                    String str = null;
                    if (TextUtils.equals(strArr[this.f37659e], cVar.f37662b) && !cVar.f37661a) {
                        this.f37658d = null;
                    }
                    View childAt = getChildAt(i2);
                    if (childAt != null) {
                        TextView textView = (TextView) childAt;
                        c cVar2 = this.f37658d;
                        if (cVar2 != null) {
                            str = cVar2.f37662b;
                        }
                        a(textView, cVar, str);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @NotNull
    public final List<c> getMItemViewInfoList$main_douyinCnRelease() {
        if (PatchProxy.isSupport(new Object[0], this, f37655a, false, 29211, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f37655a, false, 29211, new Class[0], List.class);
        }
        List<c> list = this.f37657c;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mItemViewInfoList");
        }
        return list;
    }

    public final void invalidate() {
        if (PatchProxy.isSupport(new Object[0], this, f37655a, false, 29221, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37655a, false, 29221, new Class[0], Void.TYPE);
            return;
        }
        super.invalidate();
    }

    public final void requestLayout() {
        if (PatchProxy.isSupport(new Object[0], this, f37655a, false, 29220, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37655a, false, 29220, new Class[0], Void.TYPE);
            return;
        }
        super.requestLayout();
    }

    public final void setHostType(@Nullable Integer num) {
        this.q = num;
    }

    public final void setSupportCancel(boolean z) {
        this.f37656b = z;
    }

    public final void setMItemViewInfoList$main_douyinCnRelease(@NotNull List<c> list) {
        List<c> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f37655a, false, 29212, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f37655a, false, 29212, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list2, "<set-?>");
        this.f37657c = list2;
    }

    public final void setOnItemCheckedListener(@NotNull C0484b bVar) {
        C0484b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f37655a, false, 29222, new Class[]{C0484b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f37655a, false, 29222, new Class[]{C0484b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar2, "onItemCheckedListener");
        this.f37660f = bVar2;
    }

    private final int a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f37655a, false, 29213, new Class[]{Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f37655a, false, 29213, new Class[]{Float.TYPE}, Integer.TYPE)).intValue();
        }
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "getContext()");
        return (int) UIUtils.dip2Px(context.getApplicationContext(), f2);
    }

    public final void setCheckedId(@NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f37655a, false, 29224, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f37655a, false, 29224, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, "itemId");
        List<c> list = this.f37657c;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mItemViewInfoList");
        }
        for (c next : list) {
            if (TextUtils.equals(next.f37662b, str)) {
                this.f37658d = next;
                a(str);
                return;
            }
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f37655a, false, 29215, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f37655a, false, 29215, new Class[]{String.class}, Void.TYPE);
            return;
        }
        int childCount = getChildCount();
        int i2 = this.n;
        while (i2 < childCount) {
            View childAt = getChildAt(i2);
            if (childAt != null) {
                TextView textView = (TextView) childAt;
                int i3 = i2 - this.n;
                List<c> list = this.f37657c;
                if (list == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mItemViewInfoList");
                }
                if (i3 < list.size()) {
                    List<c> list2 = this.f37657c;
                    if (list2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mItemViewInfoList");
                    }
                    a(textView, list2.get(i3), str);
                }
                i2++;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
            }
        }
    }

    public final void onMeasure(int i2, int i3) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f37655a, false, 29218, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f37655a, false, 29218, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        int childCount = getChildCount();
        if (childCount != 0) {
            this.p.clear();
            View childAt = getChildAt(0);
            Intrinsics.checkExpressionValueIsNotNull(childAt, "getChildAt(0)");
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredWidth = getMeasuredWidth();
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = this.n; i8 < childCount; i8++) {
                View childAt2 = getChildAt(i8);
                Intrinsics.checkExpressionValueIsNotNull(childAt2, "childAt");
                int measuredWidth2 = childAt2.getMeasuredWidth();
                if (i4 == 0) {
                    i4 = childAt2.getMeasuredHeight();
                }
                i5 += measuredWidth2;
                if (i6 > 0) {
                    i5 += this.i;
                }
                if (i5 > measuredWidth) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i7++;
                    i5 = measuredWidth2;
                    i6 = 0;
                }
                List list = this.p.get(i7);
                if (list == null) {
                    list = new ArrayList();
                    this.p.put(i7, list);
                }
                list.add(childAt2);
                i6++;
            }
            int size = this.p.size();
            setMeasuredDimension(measuredWidth, measuredHeight + this.l + (i4 * size) + ((size - 1) * this.h));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0092, code lost:
        if (android.text.TextUtils.equals(r2.f37662b, r1.f37662b) == false) goto L_0x0094;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r11, @org.jetbrains.annotations.Nullable java.lang.String r12) {
        /*
            r10 = this;
            r7 = 2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r8 = 0
            r0[r8] = r1
            r9 = 1
            r0[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f37655a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 29217(0x7221, float:4.0942E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0045
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r0[r8] = r1
            r0[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f37655a
            r3 = 0
            r4 = 29217(0x7221, float:4.0942E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0045:
            java.util.List<com.ss.android.ugc.aweme.commerce.preview.view.b$c> r0 = r10.f37657c
            if (r0 != 0) goto L_0x004e
            java.lang.String r1 = "mItemViewInfoList"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x004e:
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
        L_0x0054:
            if (r8 >= r0) goto L_0x00b9
            java.util.List<com.ss.android.ugc.aweme.commerce.preview.view.b$c> r1 = r10.f37657c
            if (r1 != 0) goto L_0x005f
            java.lang.String r2 = "mItemViewInfoList"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x005f:
            java.lang.Object r1 = r1.get(r8)
            com.ss.android.ugc.aweme.commerce.preview.view.b$c r1 = (com.ss.android.ugc.aweme.commerce.preview.view.b.c) r1
            r2 = r12
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.String r3 = r1.f37662b
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x00b6
            boolean r2 = r1.f37661a
            if (r2 == 0) goto L_0x00b6
            boolean r2 = r1.f37661a
            if (r2 != 0) goto L_0x007b
            return
        L_0x007b:
            com.ss.android.ugc.aweme.commerce.preview.view.b$c r2 = r10.f37658d
            if (r2 == 0) goto L_0x0094
            com.ss.android.ugc.aweme.commerce.preview.view.b$c r2 = r10.f37658d
            if (r2 != 0) goto L_0x0086
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0086:
            java.lang.String r2 = r2.f37662b
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.String r3 = r1.f37662b
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 != 0) goto L_0x00a6
        L_0x0094:
            boolean r2 = r1.f37661a
            if (r2 == 0) goto L_0x00a6
            r10.f37658d = r1
            com.ss.android.ugc.aweme.commerce.preview.view.b$c r1 = r10.f37658d
            if (r1 != 0) goto L_0x00a1
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00a1:
            java.lang.String r1 = r1.f37662b
            r10.a((java.lang.String) r1)
        L_0x00a6:
            com.ss.android.ugc.aweme.commerce.preview.view.b$b r1 = r10.f37660f
            if (r1 == 0) goto L_0x00b6
            com.ss.android.ugc.aweme.commerce.preview.view.b$b r1 = r10.f37660f
            if (r1 != 0) goto L_0x00b1
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00b1:
            com.ss.android.ugc.aweme.commerce.preview.view.b$c r2 = r10.f37658d
            r1.a(r11, r2)
        L_0x00b6:
            int r8 = r8 + 1
            goto L_0x0054
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.view.b.a(int, java.lang.String):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context, @Nullable Integer num, boolean z) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.q = num;
        this.r = z;
        Integer num2 = this.q;
        if (num2 != null && num2.intValue() == 2) {
            this.k = (int) UIUtils.dip2Px(context, 5.0f);
            this.m = 11.0f;
            return;
        }
        this.k = (int) UIUtils.dip2Px(context, 7.0f);
        this.m = 13.0f;
    }

    private final void a(TextView textView, c cVar, String str) {
        TextView textView2 = textView;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{textView2, cVar2, str}, this, f37655a, false, 29214, new Class[]{TextView.class, c.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, cVar2, str}, this, f37655a, false, 29214, new Class[]{TextView.class, c.class, String.class}, Void.TYPE);
        } else if (!this.r || !cVar2.f37661a) {
            textView.setBackgroundResource(2130838516);
            textView.setTextColor(ContextCompat.getColor(getContext(), C0906R.color.a1m));
        } else if (this.f37658d == null || !TextUtils.equals(str, cVar2.f37662b)) {
            textView.setBackgroundResource(2130838516);
            textView.setTextColor(ContextCompat.getColor(getContext(), C0906R.color.a17));
        } else {
            textView.setBackgroundResource(2130838511);
            textView.setTextColor(ContextCompat.getColor(getContext(), C0906R.color.a1z));
        }
    }

    public final void a(@NotNull String str, @Nullable List<c> list, int i2) {
        String str2 = str;
        List<c> list2 = list;
        if (PatchProxy.isSupport(new Object[]{str2, list2, Integer.valueOf(i2)}, this, f37655a, false, 29216, new Class[]{String.class, List.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, list2, Integer.valueOf(i2)}, this, f37655a, false, 29216, new Class[]{String.class, List.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "specTitle");
        if (getContext() != null && !list.isEmpty()) {
            this.f37657c = list2;
            this.f37659e = i2;
            this.o = str2;
            this.n = 1;
            DmtTextView dmtTextView = new DmtTextView(getContext());
            dmtTextView.setTextColor(ContextCompat.getColor(getContext(), C0906R.color.a1m));
            dmtTextView.setTextSize(1, this.m);
            dmtTextView.setIncludeFontPadding(false);
            dmtTextView.setText(str2);
            addView(dmtTextView);
            int size = list2.size();
            String str3 = null;
            c cVar = null;
            TextView textView = null;
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                c cVar2 = list2.get(i4);
                DmtTextView dmtTextView2 = new DmtTextView(getContext());
                dmtTextView2.setGravity(17);
                dmtTextView2.setIncludeFontPadding(false);
                dmtTextView2.setTextSize(1, 12.0f);
                dmtTextView2.setGravity(17);
                dmtTextView2.setPadding(this.j, this.k, this.j, this.k);
                dmtTextView2.setText(cVar2.f37663c);
                dmtTextView2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                addView(dmtTextView2);
                TextView textView2 = dmtTextView2;
                a(textView2, cVar2, (String) null);
                dmtTextView2.setOnClickListener(new d(this, cVar2));
                if (cVar2.f37661a) {
                    i3++;
                    if (cVar == null) {
                        cVar = cVar2;
                        textView = textView2;
                    }
                }
            }
            if (this.f37658d == null && i3 == 1 && cVar != null && textView != null) {
                this.f37658d = cVar;
                c cVar3 = this.f37658d;
                if (cVar3 != null) {
                    str3 = cVar3.f37662b;
                }
                a(textView, cVar, str3);
                C0484b bVar = this.f37660f;
                if (bVar != null) {
                    bVar.a(this.f37659e, this.f37658d);
                }
            }
            requestLayout();
        }
    }

    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f37655a, false, 29219, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f37655a, false, 29219, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            Intrinsics.checkExpressionValueIsNotNull(childAt, "titleTextView");
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            childAt.layout(0, 0, measuredWidth, measuredHeight);
            int size = this.p.size();
            for (int i8 = 0; i8 < size; i8++) {
                List list = this.p.get(i8);
                int size2 = list.size();
                int i9 = 0;
                for (int i10 = 0; i10 < size2; i10++) {
                    View view = (View) list.get(i10);
                    int measuredWidth2 = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    if (i10 > 0) {
                        i6 = (this.i * i10) + i9;
                    } else {
                        i6 = 0;
                    }
                    if (i8 > 0) {
                        i7 = (this.h + measuredHeight2) * i8;
                    } else {
                        i7 = 0;
                    }
                    int i11 = i7 + this.l + measuredHeight;
                    view.layout(i6, i11, measuredWidth2 + i6, measuredHeight2 + i11);
                    i9 += measuredWidth2;
                }
            }
        }
    }
}

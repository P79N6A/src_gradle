package com.ss.android.ugc.aweme.commerce.service.l;

import android.app.Application;
import android.content.Context;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commerce.service.l.g;
import com.ss.android.ugc.aweme.commerce.service.models.ad;
import com.ss.android.ugc.aweme.commerce.service.models.ae;
import com.ss.android.ugc.aweme.commerce.service.models.c;
import com.ss.android.ugc.aweme.commerce.service.models.r;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/utils/DataHelper;", "", "()V", "Companion", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38010a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f38011b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nH\u0007¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/utils/DataHelper$Companion;", "", "()V", "bindCouponInfo", "", "textView", "Landroid/widget/TextView;", "good", "Lcom/ss/android/ugc/aweme/commerce/service/models/BaseDetailPromotion;", "extractCoupon", "", "realPrice", "coupon", "", "formatCouponPrice", "priceValue", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38012a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a(int i) {
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f38012a, false, 29994, new Class[]{Integer.TYPE}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f38012a, false, 29994, new Class[]{Integer.TYPE}, String.class);
            } else if (i2 % 100 == 0) {
                g.a aVar = g.f38016b;
                com.ss.android.ugc.aweme.framework.core.a b2 = com.ss.android.ugc.aweme.framework.core.a.b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "AppTracker.get()");
                Application application = b2.f3307e;
                Intrinsics.checkExpressionValueIsNotNull(application, "AppTracker.get().application");
                return aVar.a(application, C0906R.string.bqp, Float.valueOf(((float) i2) / 100.0f));
            } else if (i2 % 10 == 0) {
                g.a aVar2 = g.f38016b;
                com.ss.android.ugc.aweme.framework.core.a b3 = com.ss.android.ugc.aweme.framework.core.a.b();
                Intrinsics.checkExpressionValueIsNotNull(b3, "AppTracker.get()");
                Application application2 = b3.f3307e;
                Intrinsics.checkExpressionValueIsNotNull(application2, "AppTracker.get().application");
                return aVar2.a(application2, C0906R.string.bqj, Float.valueOf(((float) i2) / 100.0f));
            } else {
                g.a aVar3 = g.f38016b;
                com.ss.android.ugc.aweme.framework.core.a b4 = com.ss.android.ugc.aweme.framework.core.a.b();
                Intrinsics.checkExpressionValueIsNotNull(b4, "AppTracker.get()");
                Application application3 = b4.f3307e;
                Intrinsics.checkExpressionValueIsNotNull(application3, "AppTracker.get().application");
                return aVar3.a(application3, C0906R.string.bqn, Float.valueOf(((float) i2) / 100.0f));
            }
        }

        @JvmStatic
        public final int a(int i, @Nullable String str) {
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, f38012a, false, 29993, new Class[]{Integer.TYPE, String.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, f38012a, false, 29993, new Class[]{Integer.TYPE, String.class}, Integer.TYPE)).intValue();
            }
            if (str != null) {
                try {
                    i2 = (int) Float.parseFloat(str);
                } catch (Exception unused) {
                }
            }
            return i - (i2 * 100);
        }

        public final void a(@NotNull TextView textView, @NotNull c cVar) {
            ae aeVar;
            String str;
            TextView textView2 = textView;
            c cVar2 = cVar;
            if (PatchProxy.isSupport(new Object[]{textView2, cVar2}, this, f38012a, false, 29995, new Class[]{TextView.class, c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textView2, cVar2}, this, f38012a, false, 29995, new Class[]{TextView.class, c.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(textView2, "textView");
            Intrinsics.checkParameterIsNotNull(cVar2, "good");
            if (cVar.isTaobaoGood()) {
                ad taobao = cVar.getTaobao();
                if (taobao != null) {
                    aeVar = taobao.getCoupon();
                } else {
                    aeVar = null;
                }
                if (aeVar != null && aeVar.isValid()) {
                    try {
                        str = new BigDecimal(aeVar.getCouponAmount()).stripTrailingZeros().toPlainString();
                    } catch (Exception unused) {
                        str = aeVar.getCouponAmount();
                    }
                    g.a aVar = g.f38016b;
                    Context context = textView.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "textView.context");
                    Object[] objArr = new Object[1];
                    if (str == null) {
                        str = "";
                    }
                    objArr[0] = str;
                    textView2.setText(aVar.a(context, C0906R.string.a2i, objArr));
                }
            } else if (cVar.isMiniProgramGood() || cVar.isOtherTypeGood()) {
                textView2.setVisibility(8);
            } else {
                r toutiao = cVar.getToutiao();
                if (toutiao != null) {
                    List couponRule = toutiao.getCouponRule();
                    if (couponRule != null && (!couponRule.isEmpty())) {
                        textView2.setText((CharSequence) couponRule.get(0));
                    }
                }
            }
        }
    }

    @JvmStatic
    @NotNull
    public static final String a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f38010a, true, 29992, new Class[]{Integer.TYPE}, String.class)) {
            return f38011b.a(i);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f38010a, true, 29992, new Class[]{Integer.TYPE}, String.class);
    }
}

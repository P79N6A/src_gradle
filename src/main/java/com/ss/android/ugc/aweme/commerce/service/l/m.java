package com.ss.android.ugc.aweme.commerce.service.l;

import com.bytedance.ies.uikit.util.IESUIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.i18n.c;
import com.ss.android.ugc.aweme.miniapp.k;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/utils/UiKit;", "", "()V", "Companion", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38041a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f38042b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007J\"\u0010\n\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007J\"\u0010\u000b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007J\"\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\bH\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\bH\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\bH\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\bH\u0007J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001dH\u0007¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/utils/UiKit$Companion;", "", "()V", "createCouponExpireDateSpan", "", "context", "Landroid/content/Context;", "fromDate", "", "toDate", "createCouponExpireDateSpan12", "createCouponExpireDateSpan24", "createExpireDateSpan", "createIndentedText1", "text", "formatDateString", "date", "formatDateString12", "formatDateString24", "getDisplayCount", "count", "getMarginTop", "", "box", "Landroid/view/View;", "rootView", "Landroid/widget/FrameLayout;", "translateIntoDiscountNumber", "num", "", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38043a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* access modifiers changed from: package-private */
        public final String b(long j) {
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f38043a, false, 30028, new Class[]{Long.TYPE}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f38043a, false, 30028, new Class[]{Long.TYPE}, String.class);
            }
            String format = new SimpleDateFormat("yyyy.MM.dd", Locale.getDefault()).format(new Date(j2 * 1000));
            Intrinsics.checkExpressionValueIsNotNull(format, "SimpleDateFormat(\"yyyy.M…format(Date(date * 1000))");
            return format;
        }

        /* access modifiers changed from: package-private */
        public final String c(long j) {
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f38043a, false, 30030, new Class[]{Long.TYPE}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f38043a, false, 30030, new Class[]{Long.TYPE}, String.class);
            }
            String format = new SimpleDateFormat("yyyy.MM.dd HH:mm", Locale.getDefault()).format(new Date(j2 * 1000));
            Intrinsics.checkExpressionValueIsNotNull(format, "SimpleDateFormat(\"yyyy.M…format(Date(date * 1000))");
            return format;
        }

        @JvmStatic
        @NotNull
        public final String a(long j) {
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f38043a, false, 30024, new Class[]{Long.TYPE}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f38043a, false, 30024, new Class[]{Long.TYPE}, String.class);
            } else if (!c.a()) {
                String displayCount = IESUIUtils.getDisplayCount(j2, "w");
                Intrinsics.checkExpressionValueIsNotNull(displayCount, "IESUIUtils.getDisplayCount(count, \"w\")");
                return displayCount;
            } else if (j2 <= 1000) {
                return String.valueOf(j);
            } else {
                Locale locale = Locale.getDefault();
                Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
                double d2 = (double) j2;
                Double.isNaN(d2);
                String format = String.format(locale, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf((d2 * 1.0d) / 1000.0d)}, 1));
                Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(locale, format, *args)");
                if ('0' == format.charAt(format.length() - 1)) {
                    StringBuilder sb = new StringBuilder();
                    int length = format.length() - 2;
                    if (format != null) {
                        String substring = format.substring(0, length);
                        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        sb.append(substring);
                        sb.append(k.f55809b);
                        return sb.toString();
                    }
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                return format + k.f55809b;
            }
        }
    }

    @JvmStatic
    @NotNull
    public static final String a(long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f38041a, true, 30018, new Class[]{Long.TYPE}, String.class)) {
            return f38042b.a(j2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f38041a, true, 30018, new Class[]{Long.TYPE}, String.class);
    }
}

package com.ss.android.ugc.aweme.commerce.service.l;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/utils/CommerceMonitor;", "", "()V", "Companion", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f37989a = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JC\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0018JC\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0018J\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u001eJO\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\"J\u000e\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%J\u000e\u0010'\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0004J3\u0010(\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010)J3\u0010*\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010+J\u000e\u0010,\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/utils/CommerceMonitor$Companion;", "", "()V", "AWEME_COMMERCE_SEEDING_ADD_CART_TIME", "", "AWEME_COMMERCE_SEEDING_DISPLAY_TIME", "AWEME_COMMERCE_SEEDING_FAIL", "AWEME_COMMERCE_SEEDING_FOOTER_DISPLAY_TIME", "AWEME_COMMERCE_SEEDING_PURCHASE_TIME", "AWEME_COMMERCE_SEEDING_SKU_DIALOG_DISPLAY_TIME", "AWEME_SHOP_LIVE_PROMOTION_LIST_ERROR_RATE", "AWEME_SHOP_PROMOTION_DYNAMIC_INFO_ERROR_RATE", "AWEME_SHOP_PROMOTION_ERROR_RATE", "AWEME_SHOP_PROMOTION_SKU_V2_ERROR_RATE", "AWEME_USER_PROMOTION_LIST_ERROR_RATE", "monitorApiDynamicInfo", "", "success", "", "errorCode", "", "errorDesc", "promotionId", "productId", "(ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "monitorApiLivePromotionList", "userId", "roomId", "monitorApiShopPromotion", "logExtra", "Lorg/json/JSONObject;", "monitorApiUserPromotionList", "count", "cursor", "(ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "monitorCommerceSeedingAddCartDuration", "duration", "", "monitorCommerceSeedingDuration", "monitorCommerceSeedingFail", "monitorCommerceSeedingFooterDisplayDuration", "(ZJLjava/lang/Integer;Ljava/lang/String;)V", "monitorCommerceSeedingPurchaseTime", "(JZLjava/lang/Integer;Ljava/lang/String;)V", "monitorCommerceSeedingSkuDialogDuration", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37990a;

        private a() {
        }

        public final void a(boolean z, @NotNull JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), jSONObject2}, this, f37990a, false, 29960, new Class[]{Boolean.TYPE, JSONObject.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), jSONObject2}, this, f37990a, false, 29960, new Class[]{Boolean.TYPE, JSONObject.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(jSONObject2, "logExtra");
            n.a("aweme_shop_promotion_error_rate", z ^ true ? 1 : 0, jSONObject2);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final void a(long j) {
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f37990a, false, 29967, new Class[]{Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f37990a, false, 29967, new Class[]{Long.TYPE}, Void.TYPE);
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", j2);
            n.a("aweme_commerce_seeding_add_cart_time", jSONObject, new JSONObject());
        }

        public final void a(@NotNull String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f37990a, false, 29964, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2}, this, f37990a, false, 29964, new Class[]{String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str2, "errorDesc");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorDesc", str2);
            n.a("aweme_commerce_seeding_fail", jSONObject);
        }

        public final void a(long j, boolean z, @Nullable Integer num, @Nullable String str) {
            long j2 = j;
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{new Long(j2), Byte.valueOf(z ? (byte) 1 : 0), num, str2}, this, f37990a, false, 29966, new Class[]{Long.TYPE, Boolean.TYPE, Integer.class, String.class}, Void.TYPE)) {
                Object[] objArr = {new Long(j2), Byte.valueOf(z), num, str2};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, f37990a, false, 29966, new Class[]{Long.TYPE, Boolean.TYPE, Integer.class, String.class}, Void.TYPE);
                return;
            }
            JSONObject jSONObject = new JSONObject();
            if (!z) {
                jSONObject.put("errorDesc", str2);
                if (num != null) {
                    num.intValue();
                    jSONObject.put("errorCode", num.intValue());
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("duration", j2);
            n.a("aweme_commerce_seeding_purchase_time", z ^ true ? 1 : 0, jSONObject2, jSONObject);
        }

        public final void a(boolean z, @Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            String str4;
            String str5;
            String str6 = str;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), num, str6, str2, str3}, this, f37990a, false, 29961, new Class[]{Boolean.TYPE, Integer.class, String.class, String.class, String.class}, Void.TYPE)) {
                Object[] objArr = {Byte.valueOf(z), num, str6, str2, str3};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, f37990a, false, 29961, new Class[]{Boolean.TYPE, Integer.class, String.class, String.class, String.class}, Void.TYPE);
                return;
            }
            JSONObject jSONObject = new JSONObject();
            if (!z) {
                jSONObject.put("errorDesc", str6);
                if (str2 == null) {
                    str4 = "null";
                } else {
                    str4 = str2;
                }
                jSONObject.put("promotionId", str4);
                if (str3 == null) {
                    str5 = "null";
                } else {
                    str5 = str3;
                }
                jSONObject.put("productId", str5);
                if (num != null) {
                    num.intValue();
                    jSONObject.put("errorCode", num.intValue());
                }
            }
            n.a("aweme_shop_promotion_dynamic_info_error_rate", z ^ true ? 1 : 0, jSONObject);
        }

        public static /* synthetic */ void a(a aVar, long j, boolean z, Integer num, String str, int i) {
            if ((i & 8) != 0) {
                str = null;
            }
            aVar.a(j, z, (Integer) null, str);
        }

        public final void a(boolean z, @Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str2) {
            Object obj;
            Object obj2;
            String str3;
            String str4 = str;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), num, str4, num2, num3, str2}, this, f37990a, false, 29962, new Class[]{Boolean.TYPE, Integer.class, String.class, Integer.class, Integer.class, String.class}, Void.TYPE)) {
                Object[] objArr = {Byte.valueOf(z), num, str4, num2, num3, str2};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, f37990a, false, 29962, new Class[]{Boolean.TYPE, Integer.class, String.class, Integer.class, Integer.class, String.class}, Void.TYPE);
                return;
            }
            JSONObject jSONObject = new JSONObject();
            if (!z) {
                jSONObject.put("errorDesc", str4);
                if (num2 == null) {
                    obj = "";
                } else {
                    obj = num2;
                }
                jSONObject.put("count", obj);
                if (num3 == null) {
                    obj2 = "null";
                } else {
                    obj2 = num3;
                }
                jSONObject.put("cursor", obj2);
                if (str2 == null) {
                    str3 = "null";
                } else {
                    str3 = str2;
                }
                jSONObject.put("userId", str3);
                if (num != null) {
                    num.intValue();
                    jSONObject.put("errorCode", num.intValue());
                }
            }
            n.a("aweme_user_promotion_list_error_rate", z ^ true ? 1 : 0, jSONObject);
        }

        public static /* synthetic */ void a(a aVar, boolean z, Integer num, String str, String str2, String str3, int i) {
            String str4;
            String str5;
            String str6;
            if ((i & 4) != 0) {
                str4 = null;
            } else {
                str4 = str;
            }
            if ((i & 8) != 0) {
                str5 = null;
            } else {
                str5 = str2;
            }
            if ((i & 16) != 0) {
                str6 = null;
            } else {
                str6 = str3;
            }
            aVar.a(z, null, str4, str5, str6);
        }
    }
}

package com.ss.android.ugc.aweme.commerce.c;

import android.text.TextUtils;
import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/pay/FangXinGouPayImpl;", "Lcom/ss/android/ugc/aweme/commerce/pay/IPaymentDepend;", "iReturn", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod$IReturn;", "(Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod$IReturn;)V", "getOrderInfo", "Landroid/util/Pair;", "", "Lcom/ss/android/ugc/aweme/commerce/pay/OrderInfo;", "params", "Lorg/json/JSONObject;", "sendPayResult", "", "code", "channel", "status", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36765a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseCommonJavaMethod.a f36766b;

    public a(@Nullable BaseCommonJavaMethod.a aVar) {
        this.f36766b = aVar;
    }

    @Nullable
    public final Pair<Integer, d> a(@NotNull JSONObject jSONObject) throws NullPointerException {
        String str;
        JSONObject jSONObject2 = jSONObject;
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, f36765a, false, 28287, new Class[]{JSONObject.class}, Pair.class)) {
            return (Pair) PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, f36765a, false, 28287, new Class[]{JSONObject.class}, Pair.class);
        }
        Intrinsics.checkParameterIsNotNull(jSONObject2, "params");
        JSONObject optJSONObject = jSONObject2.optJSONObject("data").optJSONObject("data");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("sdk_info");
        JSONObject optJSONObject3 = optJSONObject.optJSONObject("trade_info");
        if (optJSONObject2 == null || optJSONObject3 == null) {
            return null;
        }
        d dVar = new d();
        CharSequence optString = optJSONObject3.optString("way");
        if (TextUtils.equals(optString, PushConstants.PUSH_TYPE_UPLOAD_LOG)) {
            if (optJSONObject2.has(PushConstants.WEB_URL)) {
                str = optJSONObject2.optString(PushConstants.WEB_URL);
                Intrinsics.checkExpressionValueIsNotNull(str, "sdkInfo.optString(PayTransaction.FIELD_URL)");
            } else {
                str = optJSONObject2.optString("order_info");
                Intrinsics.checkExpressionValueIsNotNull(str, "sdkInfo.optString(PayTransaction.FIELD_ORDER_INFO)");
                String optString2 = optJSONObject2.optString("sign");
                String optString3 = optJSONObject2.optString("sign_type");
                if (!TextUtils.isEmpty(optString2)) {
                    str = str + "&sign=\"" + optString2 + '\"';
                }
                if (!TextUtils.isEmpty(optString3)) {
                    str = str + "&sign_type=\"" + optString3 + '\"';
                }
            }
            dVar.f36770b = str;
            i = 0;
        } else if (!TextUtils.equals(optString, PushConstants.PUSH_TYPE_THROUGH_MESSAGE)) {
            return null;
        } else {
            dVar.f36771c = optJSONObject2.optString("appid");
            dVar.f36772d = optJSONObject2.optString("partnerid");
            dVar.f36774f = optJSONObject2.optString("noncestr");
            dVar.f36773e = optJSONObject2.optString("prepayid");
            dVar.g = optJSONObject2.optString("timestamp");
            dVar.h = optJSONObject2.optString("sign");
        }
        dVar.f36769a = i;
        return new Pair<>(Integer.valueOf(i), dVar);
    }

    public final void a(int i, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f36765a, false, 28288, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f36765a, false, 28288, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        BaseCommonJavaMethod.a aVar = this.f36766b;
        if (aVar != null) {
            aVar.a(null, i3, "");
        }
    }
}

package com.ss.android.ugc.aweme.commerce.c;

import android.util.Pair;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H&¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/pay/IPaymentDepend;", "", "getOrderInfo", "Landroid/util/Pair;", "", "Lcom/ss/android/ugc/aweme/commerce/pay/OrderInfo;", "params", "Lorg/json/JSONObject;", "sendPayResult", "", "code", "channel", "status", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface b {
    @Nullable
    Pair<Integer, d> a(@NotNull JSONObject jSONObject) throws NullPointerException;

    void a(int i, int i2, int i3);
}

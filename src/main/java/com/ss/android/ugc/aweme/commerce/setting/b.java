package com.ss.android.ugc.aweme.commerce.setting;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.commerce.service.j.a;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"SHOPPING_DESC", "", "getCommerceSetting", "Lcom/ss/android/ugc/aweme/commerce/service/setting/ShoppingDesc;", "parseCommerceSetting", "", "data", "Lorg/json/JSONObject;", "main_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38320a;

    @Nullable
    public static final a a() {
        String str;
        if (PatchProxy.isSupport(new Object[0], null, f38320a, true, 30125, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f38320a, true, 30125, new Class[0], a.class);
        }
        a aVar = null;
        try {
            com.ss.android.ugc.aweme.commerce.service.h.a a2 = com.ss.android.ugc.aweme.commerce.service.h.b.f37971b.a(k.g());
            if (a2 != null) {
                str = a2.g("");
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                aVar = (a) new Gson().fromJson(str, a.class);
            }
        } catch (Throwable unused) {
        }
        return aVar;
    }
}

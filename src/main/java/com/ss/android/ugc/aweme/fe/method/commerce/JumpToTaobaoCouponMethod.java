package com.ss.android.ugc.aweme.fe.method.commerce;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/fe/method/commerce/JumpToTaobaoCouponMethod;", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod;", "()V", "handle", "", "params", "Lorg/json/JSONObject;", "iReturn", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod$IReturn;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class JumpToTaobaoCouponMethod extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44547a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f44548b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/fe/method/commerce/JumpToTaobaoCouponMethod$Companion;", "", "()V", "Jump_TAOBAO_FOR_COUPON", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a(@Nullable JSONObject jSONObject, @Nullable BaseCommonJavaMethod.a aVar) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, aVar}, this, f44547a, false, 39860, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2, aVar}, this, f44547a, false, 39860, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
            return;
        }
        Context context = (Context) this.f3123e.get();
        if (context != null) {
            Intrinsics.checkExpressionValueIsNotNull(context, "mContextRef.get() ?: return");
            if ((jSONObject2 != null && jSONObject2.has("openUrl")) || (jSONObject2 != null && jSONObject2.has("webUrl"))) {
                com.ss.android.ugc.aweme.commerce.a.f36661b.a(context, jSONObject2.optString("webUrl"), jSONObject2.optString("openUrl"), jSONObject2.optString(PushConstants.TITLE));
            }
        }
    }
}

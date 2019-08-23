package com.ss.android.ugc.aweme.fe.method;

import com.bytedance.ies.f.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/fe/method/GetMicroAppInfoMethod;", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod;", "bridge", "Lcom/bytedance/ies/web/jsbridge/IESJsBridge;", "(Lcom/bytedance/ies/web/jsbridge/IESJsBridge;)V", "handle", "", "params", "Lorg/json/JSONObject;", "iReturn", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod$IReturn;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GetMicroAppInfoMethod extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44450a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetMicroAppInfoMethod(@NotNull a aVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "bridge");
    }

    public final void a(@Nullable JSONObject jSONObject, @Nullable BaseCommonJavaMethod.a aVar) {
        String str;
        BaseCommonJavaMethod.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{jSONObject, aVar2}, this, f44450a, false, 39754, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, aVar2}, this, f44450a, false, 39754, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
            return;
        }
        try {
            IMiniAppService iMiniAppService = (IMiniAppService) ServiceManager.get().getService(IMiniAppService.class);
            JSONObject jSONObject2 = new JSONObject();
            if (iMiniAppService != null) {
                str = iMiniAppService.getJsSdkVersion();
            } else {
                str = null;
            }
            jSONObject2.put("js_sdk_version", str);
            aVar2.a(jSONObject2);
        } catch (Exception unused) {
            aVar2.a(-1, "");
        }
    }
}

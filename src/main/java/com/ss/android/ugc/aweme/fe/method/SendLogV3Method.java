package com.ss.android.ugc.aweme.fe.method;

import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.q;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010\u000b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/fe/method/SendLogV3Method;", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod;", "iesJsBridge", "Lcom/bytedance/ies/web/jsbridge/IESJsBridge;", "(Lcom/bytedance/ies/web/jsbridge/IESJsBridge;)V", "handle", "", "params", "Lorg/json/JSONObject;", "iReturn", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod$IReturn;", "sendLogV3", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SendLogV3Method extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44492a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f44493b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/fe/method/SendLogV3Method$Companion;", "", "()V", "BRIDGE_NAME_SEND_LOG_V3", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public SendLogV3Method() {
        this(null, 1);
    }

    public SendLogV3Method(@Nullable com.bytedance.ies.f.a.a aVar) {
        super(aVar);
    }

    private /* synthetic */ SendLogV3Method(com.bytedance.ies.f.a.a aVar, int i) {
        this(null);
    }

    public final void a(@Nullable JSONObject jSONObject, @Nullable BaseCommonJavaMethod.a aVar) {
        JSONObject jSONObject2 = jSONObject;
        BaseCommonJavaMethod.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, aVar2}, this, f44492a, false, 39817, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2, aVar2}, this, f44492a, false, 39817, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{jSONObject2, aVar2}, this, f44492a, false, 39818, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2, aVar2}, this, f44492a, false, 39818, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
            return;
        }
        if (jSONObject2 != null) {
            String optString = jSONObject2.optString("eventName");
            JSONObject optJSONObject = jSONObject2.optJSONObject("params");
            if (!TextUtils.isEmpty(optString) && optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                HashMap hashMap = new HashMap();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString2 = optJSONObject.optString(next);
                    keys.remove();
                    Intrinsics.checkExpressionValueIsNotNull(next, "key");
                    Intrinsics.checkExpressionValueIsNotNull(optString2, "value");
                    hashMap.put(next, optString2);
                }
                q.a(optString, hashMap);
                if (aVar2 != null) {
                    aVar2.a((Object) new JsonObject());
                }
            } else if (aVar2 != null) {
                aVar2.a(0, "");
            }
        } else if (aVar2 != null) {
            aVar2.a(0, "");
        }
    }
}

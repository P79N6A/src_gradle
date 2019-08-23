package com.ss.android.ugc.aweme.fe.method;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.common.q;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010\u000b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/fe/method/SendLogMethod;", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod;", "iesJsBridge", "Lcom/bytedance/ies/web/jsbridge/IESJsBridge;", "(Lcom/bytedance/ies/web/jsbridge/IESJsBridge;)V", "handle", "", "params", "Lorg/json/JSONObject;", "iReturn", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod$IReturn;", "sendLog", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SendLogMethod extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44490a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f44491b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/fe/method/SendLogMethod$Companion;", "", "()V", "BRIDGE_NAME_SEND_LOG", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public SendLogMethod() {
        this(null, 1);
    }

    public SendLogMethod(@Nullable com.bytedance.ies.f.a.a aVar) {
        super(aVar);
    }

    private /* synthetic */ SendLogMethod(com.bytedance.ies.f.a.a aVar, int i) {
        this(null);
    }

    public final void a(@Nullable JSONObject jSONObject, @Nullable BaseCommonJavaMethod.a aVar) {
        long j;
        long j2;
        JSONObject jSONObject2 = jSONObject;
        BaseCommonJavaMethod.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, aVar2}, this, f44490a, false, 39815, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2, aVar2}, this, f44490a, false, 39815, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{jSONObject2, aVar2}, this, f44490a, false, 39816, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2, aVar2}, this, f44490a, false, 39816, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
            return;
        }
        if (jSONObject2 != null) {
            String optString = jSONObject2.optString("eventName");
            String optString2 = jSONObject2.optString("labelName");
            String optString3 = jSONObject2.optString("value");
            String optString4 = jSONObject2.optString("extValue");
            JSONObject optJSONObject = jSONObject2.optJSONObject("extJson");
            if (!TextUtils.isEmpty(optString3)) {
                j = Long.parseLong(optString3);
            } else {
                j = 0;
            }
            if (!TextUtils.isEmpty(optString4)) {
                j2 = Long.parseLong(optString4);
            } else {
                j2 = 0;
            }
            if (this.f3123e != null) {
                if (TextUtils.equals("click", optString2)) {
                    g.a(optString, optString3, j2, optJSONObject);
                    optJSONObject.put("has_v3", 1);
                }
                q.a((Context) this.f3123e.get(), optString, optString2, j, j2, optJSONObject);
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

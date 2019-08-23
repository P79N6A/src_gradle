package com.ss.android.ugc.aweme.fe.method;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import com.bytedance.ies.f.a.a;
import com.facebook.react.bridge.ReactContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001d\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/fe/method/OpenHalfDialogBridge;", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod;", "contextRef", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Ljava/lang/ref/WeakReference;Lcom/facebook/react/bridge/ReactContext;)V", "bridge", "Lcom/bytedance/ies/web/jsbridge/IESJsBridge;", "(Ljava/lang/ref/WeakReference;Lcom/bytedance/ies/web/jsbridge/IESJsBridge;)V", "uiContext", "handle", "", "params", "Lorg/json/JSONObject;", "iReturn", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod$IReturn;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class OpenHalfDialogBridge extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44466a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<Context> f44467b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenHalfDialogBridge(@NotNull WeakReference<Context> weakReference, @NotNull a aVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(weakReference, "contextRef");
        Intrinsics.checkParameterIsNotNull(aVar, "bridge");
        this.f44467b = weakReference;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenHalfDialogBridge(@NotNull WeakReference<Context> weakReference, @NotNull ReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkParameterIsNotNull(weakReference, "contextRef");
        Intrinsics.checkParameterIsNotNull(reactContext, "reactContext");
        this.f44467b = weakReference;
    }

    public final void a(@NotNull JSONObject jSONObject, @NotNull BaseCommonJavaMethod.a aVar) {
        Context context;
        float f2;
        int i;
        Object obj = jSONObject;
        Object obj2 = aVar;
        if (PatchProxy.isSupport(new Object[]{obj, obj2}, this, f44466a, false, 39791, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj, obj2}, this, f44466a, false, 39791, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(obj, "params");
        Intrinsics.checkParameterIsNotNull(obj2, "iReturn");
        WeakReference<Context> weakReference = this.f44467b;
        if (weakReference != null) {
            context = (Context) weakReference.get();
        } else {
            context = null;
        }
        if (context != null) {
            Activity activity = (Activity) context;
            JsonElement parse = new JsonParser().parse(jSONObject.toString());
            Intrinsics.checkExpressionValueIsNotNull(parse, "JsonParser().parse(params.toString())");
            JsonObject asJsonObject = parse.getAsJsonObject();
            Context context2 = activity;
            JsonElement jsonElement = asJsonObject.get("height");
            Intrinsics.checkExpressionValueIsNotNull(jsonElement, "jsonObject.get(\"height\")");
            int a2 = u.a(context2, jsonElement.getAsInt());
            JsonElement jsonElement2 = asJsonObject.get("schema");
            Intrinsics.checkExpressionValueIsNotNull(jsonElement2, "jsonObject.get(\"schema\")");
            String asString = jsonElement2.getAsString();
            Intrinsics.checkExpressionValueIsNotNull(asString, "jsonObject.get(\"schema\").asString");
            JsonElement jsonElement3 = asJsonObject.get("borderRadius");
            if (jsonElement3 == null || jsonElement3.isJsonNull()) {
                f2 = (float) u.a(8.0d);
            } else {
                f2 = (float) u.a(context2, jsonElement3.getAsInt());
            }
            float f3 = f2;
            JsonElement jsonElement4 = asJsonObject.get("bgColor");
            if (jsonElement4 == null || jsonElement4.isJsonNull()) {
                i = -1;
            } else {
                i = Color.parseColor(jsonElement4.getAsString());
            }
            com.ss.android.ugc.aweme.commerce.d.a aVar2 = new com.ss.android.ugc.aweme.commerce.d.a(activity, a2, asString, f3, true, i);
            aVar2.show();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }
}

package com.ss.android.ugc.aweme.hybrid.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0004"}, d2 = {"wrap", "", "Lorg/json/JSONObject;", "json", "aweme-hybrid-monitor_release"}, k = 2, mv = {1, 1, 15})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49977a;

    public static final void a(@NotNull JSONObject jSONObject, @NotNull JSONObject jSONObject2) {
        JSONObject jSONObject3 = jSONObject;
        JSONObject jSONObject4 = jSONObject2;
        if (PatchProxy.isSupport(new Object[]{jSONObject3, jSONObject4}, null, f49977a, true, 49911, new Class[]{JSONObject.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject3, jSONObject4}, null, f49977a, true, 49911, new Class[]{JSONObject.class, JSONObject.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(jSONObject3, "$this$wrap");
        Intrinsics.checkParameterIsNotNull(jSONObject4, "json");
        Iterator<String> keys = jSONObject2.keys();
        Intrinsics.checkExpressionValueIsNotNull(keys, "json.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject3.put(next, jSONObject4.opt(next));
        }
    }
}

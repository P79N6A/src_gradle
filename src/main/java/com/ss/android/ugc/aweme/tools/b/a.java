package com.ss.android.ugc.aweme.tools.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.bi;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"toAndroidJSONObject", "Lorg/json/JSONObject;", "", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74646a;

    @NotNull
    public static final JSONObject a(@NotNull Map<String, String> map) {
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{map2}, null, f74646a, true, 87040, new Class[]{Map.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{map2}, null, f74646a, true, 87040, new Class[]{Map.class}, JSONObject.class);
        }
        Intrinsics.checkParameterIsNotNull(map2, "$this$toAndroidJSONObject");
        bi a2 = bi.a();
        for (Map.Entry next : map.entrySet()) {
            a2.a((String) next.getKey(), (String) next.getValue());
        }
        JSONObject b2 = a2.b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "builder.build()");
        return b2;
    }
}

package com.ss.android.ugc.aweme.t;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\nJ\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J$\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\nH\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\nH\u0007J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J$\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\nH\u0007J\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J$\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\nH\u0007J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J$\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\nH\u0007J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/log/VideoPlayerALog;", "", "()V", "DATA_NAME", "", "EVENT_NAME", "VIDEO_PLAYER_TAG", "createPlayerMessage", "eventName", "msgMap", "", "msg", "Lorg/json/JSONObject;", "d", "", "e", "i", "v", "w", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74533a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f74534b = f74534b;

    /* renamed from: c  reason: collision with root package name */
    public static final b f74535c = new b();

    /* renamed from: d  reason: collision with root package name */
    private static final String f74536d = f74536d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f74537e = f74537e;

    private b() {
    }

    @JvmStatic
    private static void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f74533a, true, 56312, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f74533a, true, 56312, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "msg");
        if (AbTestManager.a().bY()) {
            a.a(3, f74534b, str2);
        }
    }

    @JvmStatic
    public static final void b(@NotNull String str, @NotNull JSONObject jSONObject) {
        String str2 = str;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{str2, jSONObject2}, null, f74533a, true, 56311, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, jSONObject2}, null, f74533a, true, 56311, new Class[]{String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "eventName");
        Intrinsics.checkParameterIsNotNull(jSONObject2, "msg");
        if (AbTestManager.a().bY()) {
            String a2 = f74535c.a(str2, jSONObject2);
            if (!TextUtils.isEmpty(a2)) {
                a(a2);
            }
        }
    }

    @JvmStatic
    public static final void a(@NotNull String str, @NotNull Map<String, String> map) {
        String str2 = str;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{str2, map2}, null, f74533a, true, 56310, new Class[]{String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, map2}, null, f74533a, true, 56310, new Class[]{String.class, Map.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "eventName");
        Intrinsics.checkParameterIsNotNull(map2, "msg");
        if (AbTestManager.a().bY()) {
            String b2 = f74535c.b(str2, map2);
            if (!TextUtils.isEmpty(b2)) {
                a(b2);
            }
        }
    }

    @NotNull
    private String b(@NotNull String str, @NotNull Map<String, String> map) {
        String str2 = str;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{str2, map2}, this, f74533a, false, 56309, new Class[]{String.class, Map.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, map2}, this, f74533a, false, 56309, new Class[]{String.class, Map.class}, String.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "eventName");
        Intrinsics.checkParameterIsNotNull(map2, "msgMap");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : map.entrySet()) {
            jSONObject.put((String) next.getKey(), next.getValue());
        }
        return a(str2, jSONObject);
    }

    @NotNull
    public final String a(@NotNull String str, @NotNull JSONObject jSONObject) {
        String str2 = str;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{str2, jSONObject2}, this, f74533a, false, 56308, new Class[]{String.class, JSONObject.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, jSONObject2}, this, f74533a, false, 56308, new Class[]{String.class, JSONObject.class}, String.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "eventName");
        Intrinsics.checkParameterIsNotNull(jSONObject2, "msg");
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(f74536d, str2);
        jSONObject3.put(f74537e, jSONObject2);
        String jSONObject4 = jSONObject3.toString();
        Intrinsics.checkExpressionValueIsNotNull(jSONObject4, "messageObj.toString()");
        return jSONObject4;
    }
}

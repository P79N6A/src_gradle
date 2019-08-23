package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.q;
import com.ss.android.ugc.aweme.common.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0005J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rH\u0002J8\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019J$\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rJ\u001e\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/utils/AVMobClickHelper;", "", "()V", "interceptors", "", "Lcom/ss/android/ugc/aweme/utils/MobClickerInterceptor;", "addInterceptor", "interceptor", "isAllInterceptorAllow", "", "eventName", "", "extras", "", "onEvent", "", "context", "Landroid/content/Context;", "labelName", "value", "", "extValue", "extJson", "Lorg/json/JSONObject;", "mobClick", "Lcom/ss/android/ugc/aweme/common/MobClick;", "onEventV3", "transformJsonObject2Map", "data", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75467a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f75468b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final List<cp> f75469c;

    private a() {
    }

    static {
        List<cp> arrayList = new ArrayList<>();
        f75469c = arrayList;
        arrayList.add(new cp() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f75470a;

            public final boolean a(@NotNull String str, @Nullable Map<String, String> map) {
                String str2;
                String str3 = str;
                Map<String, String> map2 = map;
                if (PatchProxy.isSupport(new Object[]{str3, map2}, this, f75470a, false, 87838, new Class[]{String.class, Map.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, map2}, this, f75470a, false, 87838, new Class[]{String.class, Map.class}, Boolean.TYPE)).booleanValue();
                }
                Intrinsics.checkParameterIsNotNull(str3, "eventName");
                String str4 = null;
                if (map2 != null) {
                    str2 = map2.get("shoot_way");
                } else {
                    str2 = null;
                }
                if (map2 != null) {
                    str4 = map2.get("enter_from");
                }
                CharSequence charSequence = str2;
                if (TextUtils.equals(charSequence, "im_story") || (TextUtils.equals(charSequence, "story") && TextUtils.equals(str4, "from_chat"))) {
                    return true;
                }
                return false;
            }
        });
    }

    private final Map<String, String> a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, f75467a, false, 87837, new Class[]{JSONObject.class}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, f75467a, false, 87837, new Class[]{JSONObject.class}, Map.class);
        }
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        if (jSONObject2 != null) {
            String optString = jSONObject2.optString("shoot_way", "");
            Intrinsics.checkExpressionValueIsNotNull(optString, "data.optString(IntentCon…ants.EXTRA_SHOOT_WAY, \"\")");
            linkedHashMap.put("shoot_way", optString);
            String optString2 = jSONObject2.optString("enter_from", "");
            Intrinsics.checkExpressionValueIsNotNull(optString2, "data.optString(IntentCon…nts.EXTRA_ENTER_FROM, \"\")");
            linkedHashMap.put("enter_from", optString2);
            String optString3 = jSONObject2.optString("enter_method", "");
            Intrinsics.checkExpressionValueIsNotNull(optString3, "data.optString(IntentCon…s.EXTRA_ENTER_METHOD, \"\")");
            linkedHashMap.put("enter_method", optString3);
        }
        return linkedHashMap;
    }

    public final void onEvent(@NotNull MobClick mobClick) {
        if (PatchProxy.isSupport(new Object[]{mobClick}, this, f75467a, false, 87833, new Class[]{MobClick.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mobClick}, this, f75467a, false, 87833, new Class[]{MobClick.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(mobClick, "mobClick");
        Map<String, String> a2 = a(mobClick.getExtJson());
        String eventName = mobClick.getEventName();
        Intrinsics.checkExpressionValueIsNotNull(eventName, "mobClick.eventName");
        if (b(eventName, a2)) {
            r.onEvent(mobClick);
        }
    }

    private final boolean b(String str, Map<String, String> map) {
        String str2 = str;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{str2, map2}, this, f75467a, false, 87836, new Class[]{String.class, Map.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, map2}, this, f75467a, false, 87836, new Class[]{String.class, Map.class}, Boolean.TYPE)).booleanValue();
        }
        Iterable<cp> iterable = f75469c;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (cp a2 : iterable) {
                if (a2.a(str2, map2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void a(@NotNull String str, @Nullable Map<String, String> map) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, map}, this, f75467a, false, 87835, new Class[]{String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, map}, this, f75467a, false, 87835, new Class[]{String.class, Map.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "eventName");
        if (b(str, map)) {
            try {
                q.a(str, map);
            } catch (Exception unused) {
            }
        }
    }

    public final void a(@NotNull Context context, @NotNull String str, @NotNull String str2, long j, long j2, @Nullable JSONObject jSONObject) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        long j3 = j;
        long j4 = j2;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str4, new Long(j3), new Long(j4), jSONObject2}, this, f75467a, false, 87834, new Class[]{Context.class, String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str3, str4, new Long(j3), new Long(j4), jSONObject2}, this, f75467a, false, 87834, new Class[]{Context.class, String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(str3, "eventName");
        Intrinsics.checkParameterIsNotNull(str4, "labelName");
        if (b(str3, a(jSONObject2))) {
            q.a(context, "umeng", str, str2, j, j2, jSONObject);
        }
    }
}

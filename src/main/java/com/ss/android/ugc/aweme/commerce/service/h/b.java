package com.ss.android.ugc.aweme.commerce.service.h;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0004J\u001e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\rJ\u001e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\r¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/persist/CommercePreferencesHelper;", "", "()V", "getLastOrderTime", "", "commercePreferences", "Lcom/ss/android/ugc/aweme/commerce/service/persist/CommercePreferences;", "userId", "", "getSP", "context", "Landroid/content/Context;", "isOrderInfoUpdateInProfile", "", "isOrderInfoUpdateInSlideSetting", "setLastOrderTime", "", "timesTamp", "setOrderInfoUpdateInProfile", "needUpdate", "setOrderInfoUpdateInSlideSetting", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37970a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f37971b = new b();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/commerce/service/persist/CommercePreferencesHelper$getLastOrderTime$map$1", "Lcom/google/gson/reflect/TypeToken;", "Ljava/util/HashMap;", "", "", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a extends TypeToken<HashMap<String, Long>> {
        a() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/commerce/service/persist/CommercePreferencesHelper$isOrderInfoUpdateInProfile$map$1", "Lcom/google/gson/reflect/TypeToken;", "Ljava/util/HashMap;", "", "", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commerce.service.h.b$b  reason: collision with other inner class name */
    public static final class C0496b extends TypeToken<HashMap<String, Boolean>> {
        C0496b() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/commerce/service/persist/CommercePreferencesHelper$isOrderInfoUpdateInSlideSetting$map$1", "Lcom/google/gson/reflect/TypeToken;", "Ljava/util/HashMap;", "", "", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class c extends TypeToken<HashMap<String, Boolean>> {
        c() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/commerce/service/persist/CommercePreferencesHelper$setLastOrderTime$map$1", "Lcom/google/gson/reflect/TypeToken;", "Ljava/util/HashMap;", "", "", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class d extends TypeToken<HashMap<String, Long>> {
        d() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/commerce/service/persist/CommercePreferencesHelper$setOrderInfoUpdateInProfile$map$1", "Lcom/google/gson/reflect/TypeToken;", "Ljava/util/HashMap;", "", "", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class e extends TypeToken<HashMap<String, Boolean>> {
        e() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/commerce/service/persist/CommercePreferencesHelper$setOrderInfoUpdateInSlideSetting$map$1", "Lcom/google/gson/reflect/TypeToken;", "Ljava/util/HashMap;", "", "", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class f extends TypeToken<HashMap<String, Boolean>> {
        f() {
        }
    }

    private b() {
    }

    @Nullable
    public final a a(@Nullable Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f37970a, false, 29912, new Class[]{Context.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{context2}, this, f37970a, false, 29912, new Class[]{Context.class}, a.class);
        } else if (context2 == null) {
            return null;
        } else {
            return (a) com.ss.android.ugc.aweme.base.apt.sharedpref.c.a(context2, a.class);
        }
    }

    public final long a(@NotNull a aVar, @NotNull String str) {
        a aVar2 = aVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{aVar2, str2}, this, f37970a, false, 29913, new Class[]{a.class, String.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{aVar2, str2}, this, f37970a, false, 29913, new Class[]{a.class, String.class}, Long.TYPE)).longValue();
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "commercePreferences");
        Intrinsics.checkParameterIsNotNull(str2, "userId");
        try {
            HashMap hashMap = (HashMap) new Gson().fromJson(aVar2.a(""), new a().getType());
            if (hashMap == null) {
                return 0;
            }
            Long l = (Long) hashMap.get(str2);
            if (l != null) {
                return l.longValue();
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public final boolean c(@NotNull a aVar, @NotNull String str) {
        a aVar2 = aVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{aVar2, str2}, this, f37970a, false, 29917, new Class[]{a.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar2, str2}, this, f37970a, false, 29917, new Class[]{a.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "commercePreferences");
        Intrinsics.checkParameterIsNotNull(str2, "userId");
        try {
            HashMap hashMap = (HashMap) new Gson().fromJson(aVar2.e(""), new c().getType());
            if (hashMap == null) {
                return false;
            }
            Boolean bool = (Boolean) hashMap.get(str2);
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean b(@NotNull a aVar, @NotNull String str) {
        a aVar2 = aVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{aVar2, str2}, this, f37970a, false, 29915, new Class[]{a.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar2, str2}, this, f37970a, false, 29915, new Class[]{a.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "commercePreferences");
        Intrinsics.checkParameterIsNotNull(str2, "userId");
        try {
            HashMap hashMap = (HashMap) new Gson().fromJson(aVar2.c(""), new C0496b().getType());
            if (hashMap == null) {
                return false;
            }
            Boolean bool = (Boolean) hashMap.get(str2);
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void b(@NotNull a aVar, @NotNull String str, boolean z) {
        a aVar2 = aVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{aVar2, str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f37970a, false, 29918, new Class[]{a.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, str2, Byte.valueOf(z)}, this, f37970a, false, 29918, new Class[]{a.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "commercePreferences");
        Intrinsics.checkParameterIsNotNull(str2, "userId");
        try {
            String e2 = aVar2.e("");
            Gson gson = new Gson();
            HashMap hashMap = (HashMap) gson.fromJson(e2, new f().getType());
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            hashMap.put(str2, Boolean.valueOf(z));
            String json = gson.toJson((Object) hashMap);
            Intrinsics.checkExpressionValueIsNotNull(json, "gson.toJson(map)");
            aVar2.f(json);
        } catch (Exception unused) {
        }
    }

    public final void a(@NotNull a aVar, @NotNull String str, long j) {
        a aVar2 = aVar;
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{aVar2, str2, new Long(j2)}, this, f37970a, false, 29914, new Class[]{a.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, str2, new Long(j2)}, this, f37970a, false, 29914, new Class[]{a.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "commercePreferences");
        Intrinsics.checkParameterIsNotNull(str2, "userId");
        try {
            String a2 = aVar2.a("");
            Gson gson = new Gson();
            HashMap hashMap = (HashMap) gson.fromJson(a2, new d().getType());
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            hashMap.put(str2, Long.valueOf(j));
            String json = gson.toJson((Object) hashMap);
            Intrinsics.checkExpressionValueIsNotNull(json, "gson.toJson(map)");
            aVar2.b(json);
        } catch (Exception unused) {
        }
    }

    public final void a(@NotNull a aVar, @NotNull String str, boolean z) {
        a aVar2 = aVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{aVar2, str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f37970a, false, 29916, new Class[]{a.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, str2, Byte.valueOf(z)}, this, f37970a, false, 29916, new Class[]{a.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "commercePreferences");
        Intrinsics.checkParameterIsNotNull(str2, "userId");
        try {
            String c2 = aVar2.c("");
            Gson gson = new Gson();
            HashMap hashMap = (HashMap) gson.fromJson(c2, new e().getType());
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            hashMap.put(str2, Boolean.valueOf(z));
            String json = gson.toJson((Object) hashMap);
            Intrinsics.checkExpressionValueIsNotNull(json, "gson.toJson(map)");
            aVar2.d(json);
        } catch (Exception unused) {
        }
    }
}

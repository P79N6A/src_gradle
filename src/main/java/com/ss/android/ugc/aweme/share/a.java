package com.ss.android.ugc.aweme.share;

import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.global.config.settings.g;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/share/AVShareABStore;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64578a;

    /* renamed from: b  reason: collision with root package name */
    public static int f64579b;

    /* renamed from: c  reason: collision with root package name */
    public static final C0696a f64580c = new C0696a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0007J \u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u00020\u00068FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/share/AVShareABStore$Companion;", "", "()V", "ttPublishEnhancement", "", "ttPublishEnhancementEnabled", "", "getTtPublishEnhancementEnabled", "()Z", "setTtPublishEnhancementEnabled", "(Z)V", "enableSilentShareEnhancement", "getAsInt", "jsonObject", "Lcom/google/gson/JsonObject;", "memberName", "", "defaultValue", "onAbtestModelLoaded", "", "json", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.share.a$a  reason: collision with other inner class name */
    public static final class C0696a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64581a;

        private C0696a() {
        }

        @JvmStatic
        public final boolean a() {
            Boolean bool;
            boolean z;
            if (PatchProxy.isSupport(new Object[0], this, f64581a, false, 72899, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f64581a, false, 72899, new Class[0], Boolean.TYPE)).booleanValue();
            }
            try {
                com.ss.android.ugc.aweme.global.config.settings.pojo.a b2 = g.b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "SettingsReader.get()");
                bool = b2.bb();
            } catch (com.bytedance.ies.a unused) {
                bool = Boolean.TRUE;
            }
            Intrinsics.checkExpressionValueIsNotNull(bool, "abValue");
            if (bool.booleanValue()) {
                if (a.f64579b != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ C0696a(byte b2) {
            this();
        }

        @JvmStatic
        public final void a(@NotNull JsonObject jsonObject) {
            JsonObject jsonObject2 = jsonObject;
            if (PatchProxy.isSupport(new Object[]{jsonObject2}, this, f64581a, false, 72897, new Class[]{JsonObject.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{jsonObject2}, this, f64581a, false, 72897, new Class[]{JsonObject.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(jsonObject2, "json");
            JsonObject asJsonObject = jsonObject2.getAsJsonObject("data");
            if (asJsonObject != null) {
                a.f64579b = a(asJsonObject, "tt_publish_enhancement", 0);
            }
        }

        private final int a(JsonObject jsonObject, String str, int i) {
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{jsonObject, str, 0}, this, f64581a, false, 72898, new Class[]{JsonObject.class, String.class, Integer.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{jsonObject, str, 0}, this, f64581a, false, 72898, new Class[]{JsonObject.class, String.class, Integer.TYPE}, Integer.TYPE)).intValue();
            }
            try {
                JsonPrimitive asJsonPrimitive = jsonObject.getAsJsonPrimitive(str);
                if (asJsonPrimitive != null) {
                    if (!asJsonPrimitive.isBoolean()) {
                        i2 = asJsonPrimitive.getAsInt();
                    } else if (asJsonPrimitive.getAsBoolean()) {
                        i2 = 1;
                    }
                }
            } catch (Exception unused) {
            }
            return i2;
        }
    }

    @JvmStatic
    public static final void a(@NotNull JsonObject jsonObject) {
        JsonObject jsonObject2 = jsonObject;
        if (PatchProxy.isSupport(new Object[]{jsonObject2}, null, f64578a, true, 72895, new Class[]{JsonObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jsonObject2}, null, f64578a, true, 72895, new Class[]{JsonObject.class}, Void.TYPE);
            return;
        }
        f64580c.a(jsonObject2);
    }
}

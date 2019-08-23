package com.ss.android.ugc.aweme.setting.model;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/setting/model/VerifyActionManager;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VerifyActionManager {
    public static final Lazy CACHE$delegate = LazyKt.lazy(VerifyActionManager$Companion$CACHE$2.INSTANCE);
    public static final Companion Companion = new Companion(null);
    public static final Gson G = new Gson();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0002J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\rJ\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014R\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/setting/model/VerifyActionManager$Companion;", "", "()V", "CACHE", "Lcom/ss/android/ugc/aweme/setting/model/IVerifyActionCache;", "getCACHE", "()Lcom/ss/android/ugc/aweme/setting/model/IVerifyActionCache;", "CACHE$delegate", "Lkotlin/Lazy;", "G", "Lcom/google/gson/Gson;", "getVerifyAction", "", "", "Lcom/ss/android/ugc/aweme/setting/model/VerifyTypeAction;", "getVerifyActionByType", "type", "saveVerifyAction", "", "setting", "Lorg/json/JSONObject;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "CACHE", "getCACHE()Lcom/ss/android/ugc/aweme/setting/model/IVerifyActionCache;"))};
        public static ChangeQuickRedirect changeQuickRedirect;

        private final IVerifyActionCache getCACHE() {
            Object value;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 72251, new Class[0], IVerifyActionCache.class)) {
                value = PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 72251, new Class[0], IVerifyActionCache.class);
            } else {
                value = VerifyActionManager.CACHE$delegate.getValue();
            }
            return (IVerifyActionCache) value;
        }

        private Companion() {
        }

        private final Map<String, VerifyTypeAction> getVerifyAction() {
            String str;
            VerifyTypeSetting verifyTypeSetting;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 72253, new Class[0], Map.class)) {
                return (Map) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 72253, new Class[0], Map.class);
            }
            IVerifyActionCache cache = getCACHE();
            if (cache != null) {
                str = cache.getVerifyAction();
            } else {
                str = null;
            }
            try {
                verifyTypeSetting = (VerifyTypeSetting) VerifyActionManager.G.fromJson(str, VerifyTypeSetting.class);
            } catch (Exception unused) {
                verifyTypeSetting = null;
            }
            if (verifyTypeSetting != null) {
                return verifyTypeSetting.action;
            }
            return null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final VerifyTypeAction getVerifyActionByType(@NotNull String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 72254, new Class[]{String.class}, VerifyTypeAction.class)) {
                return (VerifyTypeAction) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 72254, new Class[]{String.class}, VerifyTypeAction.class);
            }
            Intrinsics.checkParameterIsNotNull(str2, "type");
            Map<String, VerifyTypeAction> verifyAction = getVerifyAction();
            if (verifyAction != null) {
                return verifyAction.get(str2);
            }
            return null;
        }

        public final void saveVerifyAction(@Nullable JSONObject jSONObject) {
            if (PatchProxy.isSupport(new Object[]{jSONObject}, this, changeQuickRedirect, false, 72252, new Class[]{JSONObject.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{jSONObject}, this, changeQuickRedirect, false, 72252, new Class[]{JSONObject.class}, Void.TYPE);
            } else if (jSONObject != null && !TextUtils.isEmpty(jSONObject.toString())) {
                IVerifyActionCache cache = getCACHE();
                if (cache != null) {
                    cache.setVerifyAction(jSONObject.toString());
                }
            }
        }
    }
}

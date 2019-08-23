package com.ss.android.ugc.aweme.setting.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0017\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J!\u0010\n\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R$\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/setting/model/VerifyTypeSetting;", "", "action", "", "", "Lcom/ss/android/ugc/aweme/setting/model/VerifyTypeAction;", "(Ljava/util/Map;)V", "getAction", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VerifyTypeSetting {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("action")
    @Nullable
    public final Map<String, VerifyTypeAction> action;

    public static /* synthetic */ VerifyTypeSetting copy$default(VerifyTypeSetting verifyTypeSetting, Map<String, VerifyTypeAction> map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = verifyTypeSetting.action;
        }
        return verifyTypeSetting.copy(map);
    }

    @NotNull
    public final VerifyTypeSetting copy(@Nullable Map<String, VerifyTypeAction> map) {
        Map<String, VerifyTypeAction> map2 = map;
        if (!PatchProxy.isSupport(new Object[]{map2}, this, changeQuickRedirect, false, 72260, new Class[]{Map.class}, VerifyTypeSetting.class)) {
            return new VerifyTypeSetting(map2);
        }
        return (VerifyTypeSetting) PatchProxy.accessDispatch(new Object[]{map2}, this, changeQuickRedirect, false, 72260, new Class[]{Map.class}, VerifyTypeSetting.class);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 72263, new Class[]{Object.class}, Boolean.TYPE)) {
            return this == obj || ((obj instanceof VerifyTypeSetting) && Intrinsics.areEqual((Object) this.action, (Object) ((VerifyTypeSetting) obj).action));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 72263, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 72262, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 72262, new Class[0], Integer.TYPE)).intValue();
        }
        Map<String, VerifyTypeAction> map = this.action;
        if (map != null) {
            i = map.hashCode();
        }
        return i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 72261, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 72261, new Class[0], String.class);
        }
        return "VerifyTypeSetting(action=" + this.action + ")";
    }

    public VerifyTypeSetting(@Nullable Map<String, VerifyTypeAction> map) {
        this.action = map;
    }
}

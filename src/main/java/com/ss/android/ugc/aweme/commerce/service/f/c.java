package com.ss.android.ugc.aweme.commerce.service.f;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/events/EditRefreshEventEvent;", "", "params", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "getParams", "()Lorg/json/JSONObject;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37962a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f37963b;

    public final boolean equals(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f37962a, false, 29690, new Class[]{Object.class}, Boolean.TYPE)) {
            return this == obj || ((obj instanceof c) && Intrinsics.areEqual((Object) this.f37963b, (Object) ((c) obj).f37963b));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f37962a, false, 29690, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f37962a, false, 29689, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f37962a, false, 29689, new Class[0], Integer.TYPE)).intValue();
        }
        JSONObject jSONObject = this.f37963b;
        if (jSONObject != null) {
            i = jSONObject.hashCode();
        }
        return i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f37962a, false, 29688, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f37962a, false, 29688, new Class[0], String.class);
        }
        return "EditRefreshEventEvent(params=" + this.f37963b + ")";
    }

    public c(@Nullable JSONObject jSONObject) {
        this.f37963b = jSONObject;
    }
}

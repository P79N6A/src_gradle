package com.ss.android.ugc.aweme.rocket;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/rocket/FlipChatSettingEvent;", "", "setting", "Lcom/ss/android/ugc/aweme/global/config/settings/pojo/IESSettingsProxy;", "(Lcom/ss/android/ugc/aweme/global/config/settings/pojo/IESSettingsProxy;)V", "getSetting", "()Lcom/ss/android/ugc/aweme/global/config/settings/pojo/IESSettingsProxy;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63660a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final a f63661b;

    public final boolean equals(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f63660a, false, 70901, new Class[]{Object.class}, Boolean.TYPE)) {
            return this == obj || ((obj instanceof h) && Intrinsics.areEqual((Object) this.f63661b, (Object) ((h) obj).f63661b));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f63660a, false, 70901, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f63660a, false, 70900, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63660a, false, 70900, new Class[0], Integer.TYPE)).intValue();
        }
        a aVar = this.f63661b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f63660a, false, 70899, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f63660a, false, 70899, new Class[0], String.class);
        }
        return "FlipChatSettingEvent(setting=" + this.f63661b + ")";
    }

    public h(@Nullable a aVar) {
        this.f63661b = aVar;
    }
}

package com.ss.android.ugc.aweme.ao.a;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/toolsport/model/AVLogPbBean;", "Ljava/io/Serializable;", "imprId", "", "(Ljava/lang/String;)V", "getImprId", "()Ljava/lang/String;", "setImprId", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public final class b implements Serializable {
    public static final a Companion = new a((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1;
    @SerializedName("impr_id")
    @Nullable
    private String imprId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/toolsport/model/AVLogPbBean$Companion;", "", "()V", "serialVersionUID", "", "tools.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public b() {
        this(null, 1, null);
    }

    public static /* synthetic */ b copy$default(b bVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bVar.imprId;
        }
        return bVar.copy(str);
    }

    @Nullable
    public final String component1() {
        return this.imprId;
    }

    @NotNull
    public final b copy(@Nullable String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 87265, new Class[]{String.class}, b.class)) {
            return new b(str2);
        }
        return (b) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 87265, new Class[]{String.class}, b.class);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 87268, new Class[]{Object.class}, Boolean.TYPE)) {
            return this == obj || ((obj instanceof b) && Intrinsics.areEqual((Object) this.imprId, (Object) ((b) obj).imprId));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 87268, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 87267, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 87267, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.imprId;
        if (str != null) {
            i = str.hashCode();
        }
        return i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 87266, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 87266, new Class[0], String.class);
        }
        return "AVLogPbBean(imprId=" + this.imprId + ")";
    }

    @Nullable
    public final String getImprId() {
        return this.imprId;
    }

    public final void setImprId(@Nullable String str) {
        this.imprId = str;
    }

    public b(@Nullable String str) {
        this.imprId = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}

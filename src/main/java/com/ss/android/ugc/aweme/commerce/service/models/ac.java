package com.ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J5\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/SpecInfoItem;", "Ljava/io/Serializable;", "id", "", "name", "enabled", "", "selected", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "getEnabled", "()Z", "setEnabled", "(Z)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getName", "setName", "getSelected", "setSelected", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class ac implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean enabled;
    @SerializedName("id")
    @Nullable
    private String id;
    @SerializedName("name")
    @Nullable
    private String name;
    private boolean selected;

    public ac() {
        this(null, null, false, false, 15, null);
    }

    public static /* synthetic */ ac copy$default(ac acVar, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = acVar.id;
        }
        if ((i & 2) != 0) {
            str2 = acVar.name;
        }
        if ((i & 4) != 0) {
            z = acVar.enabled;
        }
        if ((i & 8) != 0) {
            z2 = acVar.selected;
        }
        return acVar.copy(str, str2, z, z2);
    }

    @Nullable
    public final String component1() {
        return this.id;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    public final boolean component3() {
        return this.enabled;
    }

    public final boolean component4() {
        return this.selected;
    }

    @NotNull
    public final ac copy(@Nullable String str, @Nullable String str2, boolean z, boolean z2) {
        String str3 = str;
        String str4 = str2;
        if (!PatchProxy.isSupport(new Object[]{str3, str4, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 29896, new Class[]{String.class, String.class, Boolean.TYPE, Boolean.TYPE}, ac.class)) {
            return new ac(str3, str4, z, z2);
        }
        return (ac) PatchProxy.accessDispatch(new Object[]{str3, str4, Byte.valueOf(z), Byte.valueOf(z2)}, this, changeQuickRedirect, false, 29896, new Class[]{String.class, String.class, Boolean.TYPE, Boolean.TYPE}, ac.class);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 29899, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 29899, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof ac) {
                ac acVar = (ac) obj;
                if (Intrinsics.areEqual((Object) this.id, (Object) acVar.id) && Intrinsics.areEqual((Object) this.name, (Object) acVar.name)) {
                    if (this.enabled == acVar.enabled) {
                        if (this.selected == acVar.selected) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29898, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29898, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.id;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.enabled;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z2 = this.selected;
        if (z2) {
            z2 = true;
        }
        return i3 + (z2 ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29897, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29897, new Class[0], String.class);
        }
        return "SpecInfoItem(id=" + this.id + ", name=" + this.name + ", enabled=" + this.enabled + ", selected=" + this.selected + ")";
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public ac(@Nullable String str, @Nullable String str2, boolean z, boolean z2) {
        this.id = str;
        this.name = str2;
        this.enabled = z;
        this.selected = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ac(String str, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? false : z2);
    }
}

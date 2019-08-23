package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/model/ShowItemsStruct;", "Ljava/io/Serializable;", "desc", "", "schema", "type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDesc", "()Ljava/lang/String;", "getSchema", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "mainservice_release"}, k = 1, mv = {1, 1, 15})
public final class ShowItemsStruct implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("desc")
    @NotNull
    private final String desc;
    @SerializedName("schema")
    @NotNull
    private final String schema;
    @SerializedName("type")
    @NotNull
    private final String type;

    public static /* synthetic */ ShowItemsStruct copy$default(ShowItemsStruct showItemsStruct, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = showItemsStruct.desc;
        }
        if ((i & 2) != 0) {
            str2 = showItemsStruct.schema;
        }
        if ((i & 4) != 0) {
            str3 = showItemsStruct.type;
        }
        return showItemsStruct.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.desc;
    }

    @NotNull
    public final String component2() {
        return this.schema;
    }

    @NotNull
    public final String component3() {
        return this.type;
    }

    @NotNull
    public final ShowItemsStruct copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, this, changeQuickRedirect, false, 37129, new Class[]{String.class, String.class, String.class}, ShowItemsStruct.class)) {
            return (ShowItemsStruct) PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, this, changeQuickRedirect, false, 37129, new Class[]{String.class, String.class, String.class}, ShowItemsStruct.class);
        }
        Intrinsics.checkParameterIsNotNull(str4, "desc");
        Intrinsics.checkParameterIsNotNull(str5, "schema");
        Intrinsics.checkParameterIsNotNull(str6, "type");
        return new ShowItemsStruct(str4, str5, str6);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 37132, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 37132, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof ShowItemsStruct) {
                ShowItemsStruct showItemsStruct = (ShowItemsStruct) obj;
                if (!Intrinsics.areEqual((Object) this.desc, (Object) showItemsStruct.desc) || !Intrinsics.areEqual((Object) this.schema, (Object) showItemsStruct.schema) || !Intrinsics.areEqual((Object) this.type, (Object) showItemsStruct.type)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37131, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37131, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.desc;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.schema;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.type;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37130, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37130, new Class[0], String.class);
        }
        return "ShowItemsStruct(desc=" + this.desc + ", schema=" + this.schema + ", type=" + this.type + ")";
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final String getSchema() {
        return this.schema;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public ShowItemsStruct(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkParameterIsNotNull(str, "desc");
        Intrinsics.checkParameterIsNotNull(str2, "schema");
        Intrinsics.checkParameterIsNotNull(str3, "type");
        this.desc = str;
        this.schema = str2;
        this.type = str3;
    }
}

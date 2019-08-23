package com.ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceProfileHintStruct;", "Ljava/io/Serializable;", "id", "", "text", "", "url", "(JLjava/lang/String;Ljava/lang/String;)V", "getId", "()J", "setId", "(J)V", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "getUrl", "setUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class g implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("id")
    private long id;
    @SerializedName("text")
    @NotNull
    private String text;
    @SerializedName("url")
    @NotNull
    private String url;

    public g() {
        this(0, null, null, 7, null);
    }

    public static /* synthetic */ g copy$default(g gVar, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = gVar.id;
        }
        if ((i & 2) != 0) {
            str = gVar.text;
        }
        if ((i & 4) != 0) {
            str2 = gVar.url;
        }
        return gVar.copy(j, str, str2);
    }

    public final long component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.text;
    }

    @NotNull
    public final String component3() {
        return this.url;
    }

    @NotNull
    public final g copy(long j, @NotNull String str, @NotNull String str2) {
        long j2 = j;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), str3, str4}, this, changeQuickRedirect, false, 29821, new Class[]{Long.TYPE, String.class, String.class}, g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[]{new Long(j2), str3, str4}, this, changeQuickRedirect, false, 29821, new Class[]{Long.TYPE, String.class, String.class}, g.class);
        }
        Intrinsics.checkParameterIsNotNull(str3, "text");
        Intrinsics.checkParameterIsNotNull(str4, PushConstants.WEB_URL);
        return new g(j2, str3, str4);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 29824, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 29824, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (!(this.id == gVar.id) || !Intrinsics.areEqual((Object) this.text, (Object) gVar.text) || !Intrinsics.areEqual((Object) this.url, (Object) gVar.url)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29823, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29823, new Class[0], Integer.TYPE)).intValue();
        }
        long j = this.id;
        int i2 = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.text;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.url;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29822, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29822, new Class[0], String.class);
        }
        return "CommerceProfileHintStruct(id=" + this.id + ", text=" + this.text + ", url=" + this.url + ")";
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setText(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 29819, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 29819, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.text = str2;
    }

    public final void setUrl(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 29820, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 29820, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.url = str2;
    }

    public g(long j, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        Intrinsics.checkParameterIsNotNull(str2, PushConstants.WEB_URL);
        this.id = j;
        this.text = str;
        this.url = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(long j, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}

package com.ss.android.ugc.aweme.notification.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/notification/bean/Search;", "", "keyword", "", "displayKeyword", "(Ljava/lang/String;Ljava/lang/String;)V", "getDisplayKeyword", "()Ljava/lang/String;", "setDisplayKeyword", "(Ljava/lang/String;)V", "getKeyword", "setKeyword", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class Search {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("display_keyword")
    @NotNull
    public String displayKeyword;
    @SerializedName("keyword")
    @NotNull
    public String keyword;

    public Search() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ Search copy$default(Search search, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = search.keyword;
        }
        if ((i & 2) != 0) {
            str2 = search.displayKeyword;
        }
        return search.copy(str, str2);
    }

    @NotNull
    public final Search copy(@NotNull String str, @NotNull String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, changeQuickRedirect, false, 63096, new Class[]{String.class, String.class}, Search.class)) {
            return (Search) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, changeQuickRedirect, false, 63096, new Class[]{String.class, String.class}, Search.class);
        }
        Intrinsics.checkParameterIsNotNull(str3, "keyword");
        Intrinsics.checkParameterIsNotNull(str4, "displayKeyword");
        return new Search(str3, str4);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 63099, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 63099, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof Search) {
                Search search = (Search) obj;
                if (!Intrinsics.areEqual((Object) this.keyword, (Object) search.keyword) || !Intrinsics.areEqual((Object) this.displayKeyword, (Object) search.displayKeyword)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63098, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63098, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.keyword;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.displayKeyword;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63097, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63097, new Class[0], String.class);
        }
        return "Search(keyword=" + this.keyword + ", displayKeyword=" + this.displayKeyword + ")";
    }

    public final void setDisplayKeyword(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 63095, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 63095, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.displayKeyword = str2;
    }

    public final void setKeyword(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 63094, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 63094, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.keyword = str2;
    }

    public Search(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkParameterIsNotNull(str, "keyword");
        Intrinsics.checkParameterIsNotNull(str2, "displayKeyword");
        this.keyword = str;
        this.displayKeyword = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Search(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}

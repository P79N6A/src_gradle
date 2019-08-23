package com.ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.commerce.service.d.a;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u0005¢\u0006\u0002\u0010\bR\u001e\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/ShopColumn;", "Lcom/ss/android/ugc/aweme/commerce/service/dto/CommerceBaseResponse;", "Ljava/io/Serializable;", "id", "", "selected", "", "(Ljava/lang/String;Z)V", "()V", "canReverse", "getCanReverse", "()Z", "setCanReverse", "(Z)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "name", "getName", "setName", "getSelected", "setSelected", "sort", "", "getSort", "()I", "setSort", "(I)V", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class t extends a implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("can_reverse")
    private boolean canReverse;
    @SerializedName("id")
    @Nullable
    private String id;
    @SerializedName("name")
    @Nullable
    private String name;
    private boolean selected;
    @SerializedName("default_sort")
    private int sort;

    public final boolean getCanReverse() {
        return this.canReverse;
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

    public final int getSort() {
        return this.sort;
    }

    public t() {
        this.id = "";
        this.name = "";
    }

    public final void setCanReverse(boolean z) {
        this.canReverse = z;
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

    public final void setSort(int i) {
        this.sort = i;
    }

    public t(@Nullable String str, boolean z) {
        this();
        this.id = str;
        this.selected = z;
    }
}

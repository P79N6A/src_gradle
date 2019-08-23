package com.ss.android.ugc.aweme.commerce.service.models;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/UserShopCategory;", "Ljava/io/Serializable;", "()V", "count", "", "getCount", "()Ljava/lang/Long;", "setCount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "id", "getId", "setId", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class al implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private Long count = 0L;
    @Nullable
    private Long id = 0L;
    @Nullable
    private String name = "";

    @Nullable
    public final Long getCount() {
        return this.count;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final void setCount(@Nullable Long l) {
        this.count = l;
    }

    public final void setId(@Nullable Long l) {
        this.id = l;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }
}

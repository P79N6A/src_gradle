package com.ss.android.ugc.aweme.commerce.collection;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGoodQueryParam;", "", "cursor", "", "count", "(II)V", "getCount", "()I", "getCursor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36880a;

    /* renamed from: b  reason: collision with root package name */
    public final int f36881b;

    /* renamed from: c  reason: collision with root package name */
    public final int f36882c;

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f36881b == aVar.f36881b) {
                    if (this.f36882c == aVar.f36882c) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f36881b * 31) + this.f36882c;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f36880a, false, 28068, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f36880a, false, 28068, new Class[0], String.class);
        }
        return "CollectionGoodQueryParam(cursor=" + this.f36881b + ", count=" + this.f36882c + ")";
    }

    public a(int i, int i2) {
        this.f36881b = i;
        this.f36882c = i2;
    }
}

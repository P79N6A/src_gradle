package com.ss.android.ugc.aweme.feed.ui.masklayer2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/OptionDescVO;", "", "imageResId", "", "textResId", "(II)V", "getImageResId", "()I", "getTextResId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46789a;

    /* renamed from: b  reason: collision with root package name */
    public final int f46790b;

    /* renamed from: c  reason: collision with root package name */
    public final int f46791c;

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof p) {
                p pVar = (p) obj;
                if (this.f46790b == pVar.f46790b) {
                    if (this.f46791c == pVar.f46791c) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f46790b * 31) + this.f46791c;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f46789a, false, 43474, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f46789a, false, 43474, new Class[0], String.class);
        }
        return "OptionDescVO(imageResId=" + this.f46790b + ", textResId=" + this.f46791c + ")";
    }

    public p(int i, int i2) {
        this.f46790b = i;
        this.f46791c = i2;
    }
}

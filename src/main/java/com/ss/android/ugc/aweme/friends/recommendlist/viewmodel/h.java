package com.ss.android.ugc.aweme.friends.recommendlist.viewmodel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/Title;", "", "type", "", "recommendUserType", "newRecommend", "", "newRecommendCount", "followBackRecommend", "(IIZIZ)V", "getFollowBackRecommend", "()Z", "getNewRecommend", "getNewRecommendCount", "()I", "getRecommendUserType", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49064a;

    /* renamed from: b  reason: collision with root package name */
    public final int f49065b;

    /* renamed from: c  reason: collision with root package name */
    public final int f49066c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f49067d;

    /* renamed from: e  reason: collision with root package name */
    public final int f49068e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f49069f;

    public h() {
        this(0, 0, false, 0, false, 31);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if (this.f49065b == hVar.f49065b) {
                    if (this.f49066c == hVar.f49066c) {
                        if (this.f49067d == hVar.f49067d) {
                            if (this.f49068e == hVar.f49068e) {
                                if (this.f49069f == hVar.f49069f) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((this.f49065b * 31) + this.f49066c) * 31;
        boolean z = this.f49067d;
        if (z) {
            z = true;
        }
        int i2 = (((i + (z ? 1 : 0)) * 31) + this.f49068e) * 31;
        boolean z2 = this.f49069f;
        if (z2) {
            z2 = true;
        }
        return i2 + (z2 ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f49064a, false, 46903, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f49064a, false, 46903, new Class[0], String.class);
        }
        return "Title(type=" + this.f49065b + ", recommendUserType=" + this.f49066c + ", newRecommend=" + this.f49067d + ", newRecommendCount=" + this.f49068e + ", followBackRecommend=" + this.f49069f + ")";
    }

    public h(int i, int i2, boolean z, int i3, boolean z2) {
        this.f49065b = i;
        this.f49066c = i2;
        this.f49067d = z;
        this.f49068e = i3;
        this.f49069f = z2;
    }

    private /* synthetic */ h(int i, int i2, boolean z, int i3, boolean z2, int i4) {
        this(0, 0, false, 0, false);
    }
}

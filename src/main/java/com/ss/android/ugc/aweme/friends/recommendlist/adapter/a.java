package com.ss.android.ugc.aweme.friends.recommendlist.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/adapter/HeaderIconState;", "", "type", "", "title", "", "unReadCount", "position", "(ILjava/lang/String;II)V", "getPosition", "()I", "getTitle", "()Ljava/lang/String;", "getType", "getUnReadCount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48976a;

    /* renamed from: b  reason: collision with root package name */
    public final int f48977b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final String f48978c;

    /* renamed from: d  reason: collision with root package name */
    public final int f48979d;

    /* renamed from: e  reason: collision with root package name */
    public final int f48980e;

    public a() {
        this(0, null, 0, 0, 15);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f48976a, false, 46726, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f48976a, false, 46726, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if ((this.f48977b == aVar.f48977b) && Intrinsics.areEqual((Object) this.f48978c, (Object) aVar.f48978c)) {
                    if (this.f48979d == aVar.f48979d) {
                        if (this.f48980e == aVar.f48980e) {
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
        if (PatchProxy.isSupport(new Object[0], this, f48976a, false, 46725, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f48976a, false, 46725, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.f48977b * 31;
        String str = this.f48978c;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((i2 + i) * 31) + this.f48979d) * 31) + this.f48980e;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f48976a, false, 46724, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f48976a, false, 46724, new Class[0], String.class);
        }
        return "HeaderIconState(type=" + this.f48977b + ", title=" + this.f48978c + ", unReadCount=" + this.f48979d + ", position=" + this.f48980e + ")";
    }

    public a(int i, @NotNull String str, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(str, PushConstants.TITLE);
        this.f48977b = i;
        this.f48978c = str;
        this.f48979d = i2;
        this.f48980e = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, String str, int i2, int i3, int i4) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? "" : str, 0, (i4 & 8) != 0 ? 0 : i3);
    }
}

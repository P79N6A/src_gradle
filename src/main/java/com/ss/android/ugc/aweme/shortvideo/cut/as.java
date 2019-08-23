package com.ss.android.ugc.aweme.shortvideo.cut;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\u000e\u0010\u0010\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0006\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cut/VideoFrameData;", "DATA", "", "width", "", "height", "data", "(IILjava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getHeight", "()I", "getWidth", "component1", "component2", "component3", "copy", "(IILjava/lang/Object;)Lcom/ss/android/ugc/aweme/shortvideo/cut/VideoFrameData;", "equals", "", "other", "hashCode", "toString", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class as<DATA> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66388a;

    /* renamed from: b  reason: collision with root package name */
    public final int f66389b;

    /* renamed from: c  reason: collision with root package name */
    public final int f66390c;

    /* renamed from: d  reason: collision with root package name */
    public final DATA f66391d;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66388a, false, 75777, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f66388a, false, 75777, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof as) {
                as asVar = (as) obj;
                if (this.f66389b == asVar.f66389b) {
                    if (!(this.f66390c == asVar.f66390c) || !Intrinsics.areEqual((Object) this.f66391d, (Object) asVar.f66391d)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f66388a, false, 75776, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f66388a, false, 75776, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = ((this.f66389b * 31) + this.f66390c) * 31;
        DATA data = this.f66391d;
        if (data != null) {
            i = data.hashCode();
        }
        return i2 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f66388a, false, 75775, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f66388a, false, 75775, new Class[0], String.class);
        }
        return "VideoFrameData(width=" + this.f66389b + ", height=" + this.f66390c + ", data=" + this.f66391d + ")";
    }

    public as(int i, int i2, DATA data) {
        this.f66389b = i;
        this.f66390c = i2;
        this.f66391d = data;
    }
}

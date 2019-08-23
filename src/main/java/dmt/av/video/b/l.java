package dmt.av.video.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Ldmt/av/video/record/RecorderConcatResult;", "", "ret", "", "videoPath", "", "audioPath", "(ILjava/lang/String;Ljava/lang/String;)V", "getAudioPath", "()Ljava/lang/String;", "getRet", "()I", "getVideoPath", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82939a;

    /* renamed from: b  reason: collision with root package name */
    public final int f82940b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final String f82941c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final String f82942d;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f82939a, false, 92230, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f82939a, false, 92230, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof l) {
                l lVar = (l) obj;
                if (!(this.f82940b == lVar.f82940b) || !Intrinsics.areEqual((Object) this.f82941c, (Object) lVar.f82941c) || !Intrinsics.areEqual((Object) this.f82942d, (Object) lVar.f82942d)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f82939a, false, 92229, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f82939a, false, 92229, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.f82940b * 31;
        String str = this.f82941c;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f82942d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f82939a, false, 92228, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f82939a, false, 92228, new Class[0], String.class);
        }
        return "RecorderConcatResult(ret=" + this.f82940b + ", videoPath=" + this.f82941c + ", audioPath=" + this.f82942d + ")";
    }

    public l(int i, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkParameterIsNotNull(str, "videoPath");
        Intrinsics.checkParameterIsNotNull(str2, "audioPath");
        this.f82940b = i;
        this.f82941c = str;
        this.f82942d = str2;
    }
}

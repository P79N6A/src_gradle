package dmt.av.video.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.a.d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Ldmt/av/video/record/RecorderParameters;", "", "isCPUEncode", "", "outputSize", "Lkotlin/Pair;", "", "workspace", "Lcom/ss/android/ugc/aweme/shortvideo/WorkSpace/Workspace;", "(ZLkotlin/Pair;Lcom/ss/android/ugc/aweme/shortvideo/WorkSpace/Workspace;)V", "()Z", "getOutputSize", "()Lkotlin/Pair;", "getWorkspace", "()Lcom/ss/android/ugc/aweme/shortvideo/WorkSpace/Workspace;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82943a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f82944b = true;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final Pair<Integer, Integer> f82945c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final d f82946d;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f82943a, false, 92234, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f82943a, false, 92234, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof m) {
                m mVar = (m) obj;
                if (!(this.f82944b == mVar.f82944b) || !Intrinsics.areEqual((Object) this.f82945c, (Object) mVar.f82945c) || !Intrinsics.areEqual((Object) this.f82946d, (Object) mVar.f82946d)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f82943a, false, 92233, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f82943a, false, 92233, new Class[0], Integer.TYPE)).intValue();
        }
        boolean z = this.f82944b;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        Pair<Integer, Integer> pair = this.f82945c;
        int hashCode = (i2 + (pair != null ? pair.hashCode() : 0)) * 31;
        d dVar = this.f82946d;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f82943a, false, 92232, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f82943a, false, 92232, new Class[0], String.class);
        }
        return "RecorderParameters(isCPUEncode=" + this.f82944b + ", outputSize=" + this.f82945c + ", workspace=" + this.f82946d + ")";
    }

    public m(boolean z, @NotNull Pair<Integer, Integer> pair, @Nullable d dVar) {
        Intrinsics.checkParameterIsNotNull(pair, "outputSize");
        this.f82945c = pair;
        this.f82946d = dVar;
    }
}

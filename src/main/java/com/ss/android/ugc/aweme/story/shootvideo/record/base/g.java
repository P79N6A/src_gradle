package com.ss.android.ugc.aweme.story.shootvideo.record.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/RecordStateWrapper;", "", "recordState", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/RecordState;", "result", "", "(Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/RecordState;Z)V", "getRecordState", "()Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/RecordState;", "getResult", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73899a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final f f73900b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f73901c;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f73899a, false, 85852, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f73899a, false, 85852, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (Intrinsics.areEqual((Object) this.f73900b, (Object) gVar.f73900b)) {
                    if (this.f73901c == gVar.f73901c) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f73899a, false, 85851, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f73899a, false, 85851, new Class[0], Integer.TYPE)).intValue();
        }
        f fVar = this.f73900b;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        int i2 = i * 31;
        boolean z = this.f73901c;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f73899a, false, 85850, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f73899a, false, 85850, new Class[0], String.class);
        }
        return "RecordStateWrapper(recordState=" + this.f73900b + ", result=" + this.f73901c + ")";
    }

    public g(@NotNull f fVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(fVar, "recordState");
        this.f73900b = fVar;
        this.f73901c = z;
    }
}

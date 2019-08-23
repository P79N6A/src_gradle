package com.ss.android.ugc.aweme.challenge.viewmodel;

import com.bytedance.jedi.arch.a;
import com.bytedance.jedi.arch.ad;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/challenge/viewmodel/ChallengeDetailState;", "Lcom/bytedance/jedi/arch/State;", "challengeDetail", "Lcom/bytedance/jedi/arch/Async;", "Lcom/ss/android/ugc/aweme/challenge/model/ChallengeDetail;", "(Lcom/bytedance/jedi/arch/Async;)V", "getChallengeDetail", "()Lcom/bytedance/jedi/arch/Async;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ChallengeDetailState implements x {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final a<ChallengeDetail> challengeDetail;

    public ChallengeDetailState() {
        this(null, 1, null);
    }

    public static /* synthetic */ ChallengeDetailState copy$default(ChallengeDetailState challengeDetailState, a<ChallengeDetail> aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = challengeDetailState.challengeDetail;
        }
        return challengeDetailState.copy(aVar);
    }

    @NotNull
    public final a<ChallengeDetail> component1() {
        return this.challengeDetail;
    }

    @NotNull
    public final ChallengeDetailState copy(@NotNull a<? extends ChallengeDetail> aVar) {
        a<? extends ChallengeDetail> aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, changeQuickRedirect, false, 26431, new Class[]{a.class}, ChallengeDetailState.class)) {
            return (ChallengeDetailState) PatchProxy.accessDispatch(new Object[]{aVar2}, this, changeQuickRedirect, false, 26431, new Class[]{a.class}, ChallengeDetailState.class);
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "challengeDetail");
        return new ChallengeDetailState(aVar2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 26434, new Class[]{Object.class}, Boolean.TYPE)) {
            return this == obj || ((obj instanceof ChallengeDetailState) && Intrinsics.areEqual((Object) this.challengeDetail, (Object) ((ChallengeDetailState) obj).challengeDetail));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 26434, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 26433, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 26433, new Class[0], Integer.TYPE)).intValue();
        }
        a<ChallengeDetail> aVar = this.challengeDetail;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 26432, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 26432, new Class[0], String.class);
        }
        return "ChallengeDetailState(challengeDetail=" + this.challengeDetail + ")";
    }

    @NotNull
    public final a<ChallengeDetail> getChallengeDetail() {
        return this.challengeDetail;
    }

    public ChallengeDetailState(@NotNull a<? extends ChallengeDetail> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "challengeDetail");
        this.challengeDetail = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChallengeDetailState(a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ad.f21345a : aVar);
    }
}

package com.ss.android.ugc.aweme.commerce.collection;

import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGoodState;", "Lcom/bytedance/jedi/arch/State;", "collectionGood", "Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGood;", "(Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGood;)V", "getCollectionGood", "()Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGood;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class CollectionGoodState implements x {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final CollectionGood collectionGood;

    public CollectionGoodState() {
        this(null, 1, null);
    }

    public static /* synthetic */ CollectionGoodState copy$default(CollectionGoodState collectionGoodState, CollectionGood collectionGood2, int i, Object obj) {
        if ((i & 1) != 0) {
            collectionGood2 = collectionGoodState.collectionGood;
        }
        return collectionGoodState.copy(collectionGood2);
    }

    @NotNull
    public final CollectionGood component1() {
        return this.collectionGood;
    }

    @NotNull
    public final CollectionGoodState copy(@NotNull CollectionGood collectionGood2) {
        CollectionGood collectionGood3 = collectionGood2;
        if (PatchProxy.isSupport(new Object[]{collectionGood3}, this, changeQuickRedirect, false, 28072, new Class[]{CollectionGood.class}, CollectionGoodState.class)) {
            return (CollectionGoodState) PatchProxy.accessDispatch(new Object[]{collectionGood3}, this, changeQuickRedirect, false, 28072, new Class[]{CollectionGood.class}, CollectionGoodState.class);
        }
        Intrinsics.checkParameterIsNotNull(collectionGood3, "collectionGood");
        return new CollectionGoodState(collectionGood3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 28075, new Class[]{Object.class}, Boolean.TYPE)) {
            return this == obj || ((obj instanceof CollectionGoodState) && Intrinsics.areEqual((Object) this.collectionGood, (Object) ((CollectionGoodState) obj).collectionGood));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 28075, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28074, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28074, new Class[0], Integer.TYPE)).intValue();
        }
        CollectionGood collectionGood2 = this.collectionGood;
        if (collectionGood2 != null) {
            i = collectionGood2.hashCode();
        }
        return i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28073, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28073, new Class[0], String.class);
        }
        return "CollectionGoodState(collectionGood=" + this.collectionGood + ")";
    }

    @NotNull
    public final CollectionGood getCollectionGood() {
        return this.collectionGood;
    }

    public CollectionGoodState(@NotNull CollectionGood collectionGood2) {
        Intrinsics.checkParameterIsNotNull(collectionGood2, "collectionGood");
        this.collectionGood = collectionGood2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CollectionGoodState(com.ss.android.ugc.aweme.commerce.collection.CollectionGood r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r15 = this;
            r0 = r17 & 1
            if (r0 == 0) goto L_0x001a
            com.ss.android.ugc.aweme.commerce.collection.CollectionGood r0 = new com.ss.android.ugc.aweme.commerce.collection.CollectionGood
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 2047(0x7ff, float:2.868E-42)
            r14 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r15
            goto L_0x001d
        L_0x001a:
            r0 = r15
            r1 = r16
        L_0x001d:
            r15.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.collection.CollectionGoodState.<init>(com.ss.android.ugc.aweme.commerce.collection.CollectionGood, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

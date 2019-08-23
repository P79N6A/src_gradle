package com.ss.android.ugc.aweme.discover.viewmodel;

import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.jedi.viewmodel.e;
import com.ss.android.ugc.aweme.discover.jedi.viewmodel.f;
import com.ss.android.ugc.aweme.discover.model.SearchMusic;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0007HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/viewmodel/SearchMusicListState;", "Lcom/bytedance/jedi/arch/State;", "listState", "Lcom/bytedance/jedi/arch/ext/list/ListState;", "Lcom/ss/android/ugc/aweme/discover/model/SearchMusic;", "Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchPayLoad;", "searchParam", "Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchRequestParam;", "(Lcom/bytedance/jedi/arch/ext/list/ListState;Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchRequestParam;)V", "getListState", "()Lcom/bytedance/jedi/arch/ext/list/ListState;", "getSearchParam", "()Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchRequestParam;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchMusicListState implements x {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final ListState<SearchMusic, e> listState;
    @NotNull
    private final f searchParam;

    public SearchMusicListState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ SearchMusicListState copy$default(SearchMusicListState searchMusicListState, ListState<SearchMusic, e> listState2, f fVar, int i, Object obj) {
        if ((i & 1) != 0) {
            listState2 = searchMusicListState.listState;
        }
        if ((i & 2) != 0) {
            fVar = searchMusicListState.searchParam;
        }
        return searchMusicListState.copy(listState2, fVar);
    }

    @NotNull
    public final ListState<SearchMusic, e> component1() {
        return this.listState;
    }

    @NotNull
    public final f component2() {
        return this.searchParam;
    }

    @NotNull
    public final SearchMusicListState copy(@NotNull ListState<SearchMusic, e> listState2, @NotNull f fVar) {
        ListState<SearchMusic, e> listState3 = listState2;
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{listState3, fVar2}, this, changeQuickRedirect, false, 38185, new Class[]{ListState.class, f.class}, SearchMusicListState.class)) {
            return (SearchMusicListState) PatchProxy.accessDispatch(new Object[]{listState3, fVar2}, this, changeQuickRedirect, false, 38185, new Class[]{ListState.class, f.class}, SearchMusicListState.class);
        }
        Intrinsics.checkParameterIsNotNull(listState3, "listState");
        Intrinsics.checkParameterIsNotNull(fVar2, "searchParam");
        return new SearchMusicListState(listState3, fVar2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 38188, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 38188, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof SearchMusicListState) {
                SearchMusicListState searchMusicListState = (SearchMusicListState) obj;
                if (!Intrinsics.areEqual((Object) this.listState, (Object) searchMusicListState.listState) || !Intrinsics.areEqual((Object) this.searchParam, (Object) searchMusicListState.searchParam)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 38187, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 38187, new Class[0], Integer.TYPE)).intValue();
        }
        ListState<SearchMusic, e> listState2 = this.listState;
        int hashCode = (listState2 != null ? listState2.hashCode() : 0) * 31;
        f fVar = this.searchParam;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 38186, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 38186, new Class[0], String.class);
        }
        return "SearchMusicListState(listState=" + this.listState + ", searchParam=" + this.searchParam + ")";
    }

    @NotNull
    public final ListState<SearchMusic, e> getListState() {
        return this.listState;
    }

    @NotNull
    public final f getSearchParam() {
        return this.searchParam;
    }

    public SearchMusicListState(@NotNull ListState<SearchMusic, e> listState2, @NotNull f fVar) {
        Intrinsics.checkParameterIsNotNull(listState2, "listState");
        Intrinsics.checkParameterIsNotNull(fVar, "searchParam");
        this.listState = listState2;
        this.searchParam = fVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SearchMusicListState(com.bytedance.jedi.arch.ext.list.ListState r9, com.ss.android.ugc.aweme.discover.jedi.viewmodel.f r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r8 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x001f
            com.bytedance.jedi.arch.ext.list.ListState r9 = new com.bytedance.jedi.arch.ext.list.ListState
            com.ss.android.ugc.aweme.discover.jedi.viewmodel.e r12 = new com.ss.android.ugc.aweme.discover.jedi.viewmodel.e
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 15
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = r12
            com.bytedance.jedi.arch.ext.list.k r1 = (com.bytedance.jedi.arch.ext.list.k) r1
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 30
            r7 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L_0x001f:
            r11 = r11 & 2
            if (r11 == 0) goto L_0x0032
            com.ss.android.ugc.aweme.discover.jedi.viewmodel.f r10 = new com.ss.android.ugc.aweme.discover.jedi.viewmodel.f
            java.lang.String r1 = ""
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 62
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L_0x0032:
            r8.<init>(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.viewmodel.SearchMusicListState.<init>(com.bytedance.jedi.arch.ext.list.ListState, com.ss.android.ugc.aweme.discover.jedi.viewmodel.f, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

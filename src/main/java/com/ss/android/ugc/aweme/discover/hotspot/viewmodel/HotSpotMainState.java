package com.ss.android.ugc.aweme.discover.hotspot.viewmodel;

import com.bytedance.jedi.arch.a;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.hotspot.a.f;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.ss.android.ugc.aweme.discover.model.HotSearchListResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001BÁ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012$\b\u0002\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b`\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012<\b\u0002\u0010\u0014\u001a6\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00110\nj\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011`\f¢\u0006\u0002\u0010\u0015J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J%\u0010&\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b`\fHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u000fHÆ\u0003J\u0015\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011HÆ\u0003J=\u0010*\u001a6\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00110\nj\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011`\fHÆ\u0003JÅ\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072$\b\u0002\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b`\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112<\b\u0002\u0010\u0014\u001a6\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00110\nj\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011`\fHÆ\u0001J\u0013\u0010,\u001a\u00020\u000f2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\u000bHÖ\u0001J\t\u00100\u001a\u00020\u0005HÖ\u0001R\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001fR-\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b`\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!RE\u0010\u0014\u001a6\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00110\nj\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011`\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!¨\u00061"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hotspot/viewmodel/HotSpotMainState;", "Lcom/bytedance/jedi/arch/State;", "curSpot", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "curSpotWord", "", "curMarqueeList", "Lcom/bytedance/jedi/arch/Async;", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchListResponse;", "lastIndexMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "hotSpotsList", "isDialogShowing", "", "curAwemeList", "Lcom/bytedance/jedi/arch/ext/list/ListState;", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "Lcom/ss/android/ugc/aweme/discover/hotspot/data/SpotAwemesPayLoad;", "stateMap", "(Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;Ljava/lang/String;Lcom/bytedance/jedi/arch/Async;Ljava/util/HashMap;Lcom/bytedance/jedi/arch/Async;ZLcom/bytedance/jedi/arch/ext/list/ListState;Ljava/util/HashMap;)V", "getCurAwemeList", "()Lcom/bytedance/jedi/arch/ext/list/ListState;", "getCurMarqueeList", "()Lcom/bytedance/jedi/arch/Async;", "getCurSpot", "()Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "getCurSpotWord", "()Ljava/lang/String;", "getHotSpotsList", "()Z", "getLastIndexMap", "()Ljava/util/HashMap;", "getStateMap", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class HotSpotMainState implements x {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final ListState<Aweme, f> curAwemeList;
    @NotNull
    private final a<HotSearchListResponse> curMarqueeList;
    @Nullable
    private final HotSearchItem curSpot;
    @Nullable
    private final String curSpotWord;
    @NotNull
    private final a<HotSearchListResponse> hotSpotsList;
    private final boolean isDialogShowing;
    @NotNull
    private final HashMap<String, Integer> lastIndexMap;
    @NotNull
    private final HashMap<String, ListState<Aweme, f>> stateMap;

    public HotSpotMainState() {
        this(null, null, null, null, null, false, null, null, 255, null);
    }

    public static /* synthetic */ HotSpotMainState copy$default(HotSpotMainState hotSpotMainState, HotSearchItem hotSearchItem, String str, a aVar, HashMap hashMap, a aVar2, boolean z, ListState listState, HashMap hashMap2, int i, Object obj) {
        HotSpotMainState hotSpotMainState2 = hotSpotMainState;
        int i2 = i;
        return hotSpotMainState.copy((i2 & 1) != 0 ? hotSpotMainState2.curSpot : hotSearchItem, (i2 & 2) != 0 ? hotSpotMainState2.curSpotWord : str, (i2 & 4) != 0 ? hotSpotMainState2.curMarqueeList : aVar, (i2 & 8) != 0 ? hotSpotMainState2.lastIndexMap : hashMap, (i2 & 16) != 0 ? hotSpotMainState2.hotSpotsList : aVar2, (i2 & 32) != 0 ? hotSpotMainState2.isDialogShowing : z, (i2 & 64) != 0 ? hotSpotMainState2.curAwemeList : listState, (i2 & SearchJediMixFeedAdapter.f42517f) != 0 ? hotSpotMainState2.stateMap : hashMap2);
    }

    @Nullable
    public final HotSearchItem component1() {
        return this.curSpot;
    }

    @Nullable
    public final String component2() {
        return this.curSpotWord;
    }

    @NotNull
    public final a<HotSearchListResponse> component3() {
        return this.curMarqueeList;
    }

    @NotNull
    public final HashMap<String, Integer> component4() {
        return this.lastIndexMap;
    }

    @NotNull
    public final a<HotSearchListResponse> component5() {
        return this.hotSpotsList;
    }

    public final boolean component6() {
        return this.isDialogShowing;
    }

    @NotNull
    public final ListState<Aweme, f> component7() {
        return this.curAwemeList;
    }

    @NotNull
    public final HashMap<String, ListState<Aweme, f>> component8() {
        return this.stateMap;
    }

    @NotNull
    public final HotSpotMainState copy(@Nullable HotSearchItem hotSearchItem, @Nullable String str, @NotNull a<? extends HotSearchListResponse> aVar, @NotNull HashMap<String, Integer> hashMap, @NotNull a<? extends HotSearchListResponse> aVar2, boolean z, @NotNull ListState<Aweme, f> listState, @NotNull HashMap<String, ListState<Aweme, f>> hashMap2) {
        a<? extends HotSearchListResponse> aVar3 = aVar;
        HashMap<String, Integer> hashMap3 = hashMap;
        a<? extends HotSearchListResponse> aVar4 = aVar2;
        ListState<Aweme, f> listState2 = listState;
        HashMap<String, ListState<Aweme, f>> hashMap4 = hashMap2;
        if (PatchProxy.isSupport(new Object[]{hotSearchItem, str, aVar3, hashMap3, aVar4, Byte.valueOf(z ? (byte) 1 : 0), listState2, hashMap4}, this, changeQuickRedirect, false, 36629, new Class[]{HotSearchItem.class, String.class, a.class, HashMap.class, a.class, Boolean.TYPE, ListState.class, HashMap.class}, HotSpotMainState.class)) {
            return (HotSpotMainState) PatchProxy.accessDispatch(new Object[]{hotSearchItem, str, aVar3, hashMap3, aVar4, Byte.valueOf(z), listState2, hashMap4}, this, changeQuickRedirect, false, 36629, new Class[]{HotSearchItem.class, String.class, a.class, HashMap.class, a.class, Boolean.TYPE, ListState.class, HashMap.class}, HotSpotMainState.class);
        }
        Intrinsics.checkParameterIsNotNull(aVar3, "curMarqueeList");
        Intrinsics.checkParameterIsNotNull(hashMap3, "lastIndexMap");
        Intrinsics.checkParameterIsNotNull(aVar4, "hotSpotsList");
        Intrinsics.checkParameterIsNotNull(listState2, "curAwemeList");
        Intrinsics.checkParameterIsNotNull(hashMap4, "stateMap");
        HotSpotMainState hotSpotMainState = new HotSpotMainState(hotSearchItem, str, aVar, hashMap, aVar2, z, listState, hashMap2);
        return hotSpotMainState;
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 36632, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 36632, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof HotSpotMainState) {
                HotSpotMainState hotSpotMainState = (HotSpotMainState) obj;
                if (Intrinsics.areEqual((Object) this.curSpot, (Object) hotSpotMainState.curSpot) && Intrinsics.areEqual((Object) this.curSpotWord, (Object) hotSpotMainState.curSpotWord) && Intrinsics.areEqual((Object) this.curMarqueeList, (Object) hotSpotMainState.curMarqueeList) && Intrinsics.areEqual((Object) this.lastIndexMap, (Object) hotSpotMainState.lastIndexMap) && Intrinsics.areEqual((Object) this.hotSpotsList, (Object) hotSpotMainState.hotSpotsList)) {
                    if (!(this.isDialogShowing == hotSpotMainState.isDialogShowing) || !Intrinsics.areEqual((Object) this.curAwemeList, (Object) hotSpotMainState.curAwemeList) || !Intrinsics.areEqual((Object) this.stateMap, (Object) hotSpotMainState.stateMap)) {
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 36631, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 36631, new Class[0], Integer.TYPE)).intValue();
        }
        HotSearchItem hotSearchItem = this.curSpot;
        int hashCode = (hotSearchItem != null ? hotSearchItem.hashCode() : 0) * 31;
        String str = this.curSpotWord;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        a<HotSearchListResponse> aVar = this.curMarqueeList;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        HashMap<String, Integer> hashMap = this.lastIndexMap;
        int hashCode4 = (hashCode3 + (hashMap != null ? hashMap.hashCode() : 0)) * 31;
        a<HotSearchListResponse> aVar2 = this.hotSpotsList;
        int hashCode5 = (hashCode4 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        boolean z = this.isDialogShowing;
        if (z) {
            z = true;
        }
        int i2 = (hashCode5 + (z ? 1 : 0)) * 31;
        ListState<Aweme, f> listState = this.curAwemeList;
        int hashCode6 = (i2 + (listState != null ? listState.hashCode() : 0)) * 31;
        HashMap<String, ListState<Aweme, f>> hashMap2 = this.stateMap;
        if (hashMap2 != null) {
            i = hashMap2.hashCode();
        }
        return hashCode6 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 36630, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 36630, new Class[0], String.class);
        }
        return "HotSpotMainState(curSpot=" + this.curSpot + ", curSpotWord=" + this.curSpotWord + ", curMarqueeList=" + this.curMarqueeList + ", lastIndexMap=" + this.lastIndexMap + ", hotSpotsList=" + this.hotSpotsList + ", isDialogShowing=" + this.isDialogShowing + ", curAwemeList=" + this.curAwemeList + ", stateMap=" + this.stateMap + ")";
    }

    @NotNull
    public final ListState<Aweme, f> getCurAwemeList() {
        return this.curAwemeList;
    }

    @NotNull
    public final a<HotSearchListResponse> getCurMarqueeList() {
        return this.curMarqueeList;
    }

    @Nullable
    public final HotSearchItem getCurSpot() {
        return this.curSpot;
    }

    @Nullable
    public final String getCurSpotWord() {
        return this.curSpotWord;
    }

    @NotNull
    public final a<HotSearchListResponse> getHotSpotsList() {
        return this.hotSpotsList;
    }

    @NotNull
    public final HashMap<String, Integer> getLastIndexMap() {
        return this.lastIndexMap;
    }

    @NotNull
    public final HashMap<String, ListState<Aweme, f>> getStateMap() {
        return this.stateMap;
    }

    public final boolean isDialogShowing() {
        return this.isDialogShowing;
    }

    public HotSpotMainState(@Nullable HotSearchItem hotSearchItem, @Nullable String str, @NotNull a<? extends HotSearchListResponse> aVar, @NotNull HashMap<String, Integer> hashMap, @NotNull a<? extends HotSearchListResponse> aVar2, boolean z, @NotNull ListState<Aweme, f> listState, @NotNull HashMap<String, ListState<Aweme, f>> hashMap2) {
        Intrinsics.checkParameterIsNotNull(aVar, "curMarqueeList");
        Intrinsics.checkParameterIsNotNull(hashMap, "lastIndexMap");
        Intrinsics.checkParameterIsNotNull(aVar2, "hotSpotsList");
        Intrinsics.checkParameterIsNotNull(listState, "curAwemeList");
        Intrinsics.checkParameterIsNotNull(hashMap2, "stateMap");
        this.curSpot = hotSearchItem;
        this.curSpotWord = str;
        this.curMarqueeList = aVar;
        this.lastIndexMap = hashMap;
        this.hotSpotsList = aVar2;
        this.isDialogShowing = z;
        this.curAwemeList = listState;
        this.stateMap = hashMap2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ HotSpotMainState(com.ss.android.ugc.aweme.discover.model.HotSearchItem r17, java.lang.String r18, com.bytedance.jedi.arch.a r19, java.util.HashMap r20, com.bytedance.jedi.arch.a r21, boolean r22, com.bytedance.jedi.arch.ext.list.ListState r23, java.util.HashMap r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r16 = this;
            r0 = r25
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000b
        L_0x0009:
            r1 = r17
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r2 = r18
        L_0x0012:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x001b
            com.bytedance.jedi.arch.ad r3 = com.bytedance.jedi.arch.ad.f21345a
            com.bytedance.jedi.arch.a r3 = (com.bytedance.jedi.arch.a) r3
            goto L_0x001d
        L_0x001b:
            r3 = r19
        L_0x001d:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0027
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            goto L_0x0029
        L_0x0027:
            r4 = r20
        L_0x0029:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x0032
            com.bytedance.jedi.arch.ad r5 = com.bytedance.jedi.arch.ad.f21345a
            com.bytedance.jedi.arch.a r5 = (com.bytedance.jedi.arch.a) r5
            goto L_0x0034
        L_0x0032:
            r5 = r21
        L_0x0034:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x003a
            r6 = 0
            goto L_0x003c
        L_0x003a:
            r6 = r22
        L_0x003c:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x006a
            com.bytedance.jedi.arch.ext.list.ListState r7 = new com.bytedance.jedi.arch.ext.list.ListState
            com.ss.android.ugc.aweme.discover.hotspot.a.f r8 = new com.ss.android.ugc.aweme.discover.hotspot.a.f
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 31
            r17 = r8
            r18 = r9
            r19 = r10
            r20 = r11
            r21 = r12
            r22 = r13
            r23 = r14
            r17.<init>(r18, r19, r20, r21, r22, r23)
            r9 = r8
            com.bytedance.jedi.arch.ext.list.k r9 = (com.bytedance.jedi.arch.ext.list.k) r9
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 30
            r15 = 0
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x006c
        L_0x006a:
            r7 = r23
        L_0x006c:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0076
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            goto L_0x0078
        L_0x0076:
            r0 = r24
        L_0x0078:
            r17 = r16
            r18 = r1
            r19 = r2
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.hotspot.viewmodel.HotSpotMainState.<init>(com.ss.android.ugc.aweme.discover.model.HotSearchItem, java.lang.String, com.bytedance.jedi.arch.a, java.util.HashMap, com.bytedance.jedi.arch.a, boolean, com.bytedance.jedi.arch.ext.list.ListState, java.util.HashMap, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

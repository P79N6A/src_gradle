package com.ss.android.ugc.aweme.friends.recommendlist.viewmodel;

import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b&\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u0011\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\u0010\u0016J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\u0015\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u0011HÆ\u0003J\u0015\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J£\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00052\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u00112\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013HÆ\u0001J\u0013\u00107\u001a\u00020\u00032\b\u00108\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u00109\u001a\u00020\u0007HÖ\u0001J\t\u0010:\u001a\u00020\u0005HÖ\u0001R\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001a¨\u0006;"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListState;", "Lcom/bytedance/jedi/arch/State;", "showGuide", "", "puid", "", "yellowPointCount", "", "recommendUserType", "hideRecommendMask", "newRecommendCount", "followBackRecommend", "enableFace2Face", "contactNoticeCount", "showContactDot", "reportId", "adapterPositionMap", "", "recommendListState", "Lcom/bytedance/jedi/arch/ext/list/ListState;", "", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendPayload;", "(ZLjava/lang/String;IIZIIZIZLjava/lang/String;Ljava/util/Map;Lcom/bytedance/jedi/arch/ext/list/ListState;)V", "getAdapterPositionMap", "()Ljava/util/Map;", "getContactNoticeCount", "()I", "getEnableFace2Face", "()Z", "getFollowBackRecommend", "getHideRecommendMask", "getNewRecommendCount", "getPuid", "()Ljava/lang/String;", "getRecommendListState", "()Lcom/bytedance/jedi/arch/ext/list/ListState;", "getRecommendUserType", "getReportId", "getShowContactDot", "getShowGuide", "getYellowPointCount", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RecommendListState implements x {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final Map<String, Integer> adapterPositionMap;
    private final int contactNoticeCount;
    private final boolean enableFace2Face;
    private final int followBackRecommend;
    private final boolean hideRecommendMask;
    private final int newRecommendCount;
    @NotNull
    private final String puid;
    @NotNull
    private final ListState<Object, d> recommendListState;
    private final int recommendUserType;
    @NotNull
    private final String reportId;
    private final boolean showContactDot;
    private final boolean showGuide;
    private final int yellowPointCount;

    public RecommendListState() {
        this(false, null, 0, 0, false, 0, 0, false, 0, false, null, null, null, 8191, null);
    }

    public static /* synthetic */ RecommendListState copy$default(RecommendListState recommendListState2, boolean z, String str, int i, int i2, boolean z2, int i3, int i4, boolean z3, int i5, boolean z4, String str2, Map map, ListState listState, int i6, Object obj) {
        RecommendListState recommendListState3 = recommendListState2;
        int i7 = i6;
        return recommendListState2.copy((i7 & 1) != 0 ? recommendListState3.showGuide : z, (i7 & 2) != 0 ? recommendListState3.puid : str, (i7 & 4) != 0 ? recommendListState3.yellowPointCount : i, (i7 & 8) != 0 ? recommendListState3.recommendUserType : i2, (i7 & 16) != 0 ? recommendListState3.hideRecommendMask : z2, (i7 & 32) != 0 ? recommendListState3.newRecommendCount : i3, (i7 & 64) != 0 ? recommendListState3.followBackRecommend : i4, (i7 & SearchJediMixFeedAdapter.f42517f) != 0 ? recommendListState3.enableFace2Face : z3, (i7 & 256) != 0 ? recommendListState3.contactNoticeCount : i5, (i7 & 512) != 0 ? recommendListState3.showContactDot : z4, (i7 & 1024) != 0 ? recommendListState3.reportId : str2, (i7 & 2048) != 0 ? recommendListState3.adapterPositionMap : map, (i7 & 4096) != 0 ? recommendListState3.recommendListState : listState);
    }

    public final boolean component1() {
        return this.showGuide;
    }

    public final boolean component10() {
        return this.showContactDot;
    }

    @NotNull
    public final String component11() {
        return this.reportId;
    }

    @NotNull
    public final Map<String, Integer> component12() {
        return this.adapterPositionMap;
    }

    @NotNull
    public final ListState<Object, d> component13() {
        return this.recommendListState;
    }

    @NotNull
    public final String component2() {
        return this.puid;
    }

    public final int component3() {
        return this.yellowPointCount;
    }

    public final int component4() {
        return this.recommendUserType;
    }

    public final boolean component5() {
        return this.hideRecommendMask;
    }

    public final int component6() {
        return this.newRecommendCount;
    }

    public final int component7() {
        return this.followBackRecommend;
    }

    public final boolean component8() {
        return this.enableFace2Face;
    }

    public final int component9() {
        return this.contactNoticeCount;
    }

    @NotNull
    public final RecommendListState copy(boolean z, @NotNull String str, int i, int i2, boolean z2, int i3, int i4, boolean z3, int i5, boolean z4, @NotNull String str2, @NotNull Map<String, Integer> map, @NotNull ListState<Object, d> listState) {
        String str3 = str;
        String str4 = str2;
        Map<String, Integer> map2 = map;
        ListState<Object, d> listState2 = listState;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str3, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z3 ? (byte) 1 : 0), Integer.valueOf(i5), Byte.valueOf(z4 ? (byte) 1 : 0), str4, map2, listState2}, this, changeQuickRedirect, false, 46805, new Class[]{Boolean.TYPE, String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Boolean.TYPE, String.class, Map.class, ListState.class}, RecommendListState.class)) {
            return (RecommendListState) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str3, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z2), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z3), Integer.valueOf(i5), Byte.valueOf(z4), str4, map2, listState2}, this, changeQuickRedirect, false, 46805, new Class[]{Boolean.TYPE, String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Boolean.TYPE, String.class, Map.class, ListState.class}, RecommendListState.class);
        }
        Intrinsics.checkParameterIsNotNull(str3, "puid");
        Intrinsics.checkParameterIsNotNull(str4, "reportId");
        Intrinsics.checkParameterIsNotNull(map2, "adapterPositionMap");
        Intrinsics.checkParameterIsNotNull(listState2, "recommendListState");
        RecommendListState recommendListState2 = new RecommendListState(z, str, i, i2, z2, i3, i4, z3, i5, z4, str2, map, listState);
        return recommendListState2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 46808, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 46808, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof RecommendListState) {
                RecommendListState recommendListState2 = (RecommendListState) obj;
                if ((this.showGuide == recommendListState2.showGuide) && Intrinsics.areEqual((Object) this.puid, (Object) recommendListState2.puid)) {
                    if (this.yellowPointCount == recommendListState2.yellowPointCount) {
                        if (this.recommendUserType == recommendListState2.recommendUserType) {
                            if (this.hideRecommendMask == recommendListState2.hideRecommendMask) {
                                if (this.newRecommendCount == recommendListState2.newRecommendCount) {
                                    if (this.followBackRecommend == recommendListState2.followBackRecommend) {
                                        if (this.enableFace2Face == recommendListState2.enableFace2Face) {
                                            if (this.contactNoticeCount == recommendListState2.contactNoticeCount) {
                                                if (!(this.showContactDot == recommendListState2.showContactDot) || !Intrinsics.areEqual((Object) this.reportId, (Object) recommendListState2.reportId) || !Intrinsics.areEqual((Object) this.adapterPositionMap, (Object) recommendListState2.adapterPositionMap) || !Intrinsics.areEqual((Object) this.recommendListState, (Object) recommendListState2.recommendListState)) {
                                                    return false;
                                                }
                                            }
                                        }
                                    }
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
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46807, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46807, new Class[0], Integer.TYPE)).intValue();
        }
        boolean z = this.showGuide;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        String str = this.puid;
        int hashCode = (((((i2 + (str != null ? str.hashCode() : 0)) * 31) + this.yellowPointCount) * 31) + this.recommendUserType) * 31;
        boolean z3 = this.hideRecommendMask;
        if (z3) {
            z3 = true;
        }
        int i3 = (((((hashCode + (z3 ? 1 : 0)) * 31) + this.newRecommendCount) * 31) + this.followBackRecommend) * 31;
        boolean z4 = this.enableFace2Face;
        if (z4) {
            z4 = true;
        }
        int i4 = (((i3 + (z4 ? 1 : 0)) * 31) + this.contactNoticeCount) * 31;
        boolean z5 = this.showContactDot;
        if (!z5) {
            z2 = z5;
        }
        int i5 = (i4 + (z2 ? 1 : 0)) * 31;
        String str2 = this.reportId;
        int hashCode2 = (i5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map<String, Integer> map = this.adapterPositionMap;
        int hashCode3 = (hashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        ListState<Object, d> listState = this.recommendListState;
        if (listState != null) {
            i = listState.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46806, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46806, new Class[0], String.class);
        }
        return "RecommendListState(showGuide=" + this.showGuide + ", puid=" + this.puid + ", yellowPointCount=" + this.yellowPointCount + ", recommendUserType=" + this.recommendUserType + ", hideRecommendMask=" + this.hideRecommendMask + ", newRecommendCount=" + this.newRecommendCount + ", followBackRecommend=" + this.followBackRecommend + ", enableFace2Face=" + this.enableFace2Face + ", contactNoticeCount=" + this.contactNoticeCount + ", showContactDot=" + this.showContactDot + ", reportId=" + this.reportId + ", adapterPositionMap=" + this.adapterPositionMap + ", recommendListState=" + this.recommendListState + ")";
    }

    @NotNull
    public final Map<String, Integer> getAdapterPositionMap() {
        return this.adapterPositionMap;
    }

    public final int getContactNoticeCount() {
        return this.contactNoticeCount;
    }

    public final boolean getEnableFace2Face() {
        return this.enableFace2Face;
    }

    public final int getFollowBackRecommend() {
        return this.followBackRecommend;
    }

    public final boolean getHideRecommendMask() {
        return this.hideRecommendMask;
    }

    public final int getNewRecommendCount() {
        return this.newRecommendCount;
    }

    @NotNull
    public final String getPuid() {
        return this.puid;
    }

    @NotNull
    public final ListState<Object, d> getRecommendListState() {
        return this.recommendListState;
    }

    public final int getRecommendUserType() {
        return this.recommendUserType;
    }

    @NotNull
    public final String getReportId() {
        return this.reportId;
    }

    public final boolean getShowContactDot() {
        return this.showContactDot;
    }

    public final boolean getShowGuide() {
        return this.showGuide;
    }

    public final int getYellowPointCount() {
        return this.yellowPointCount;
    }

    public RecommendListState(boolean z, @NotNull String str, int i, int i2, boolean z2, int i3, int i4, boolean z3, int i5, boolean z4, @NotNull String str2, @NotNull Map<String, Integer> map, @NotNull ListState<Object, d> listState) {
        Intrinsics.checkParameterIsNotNull(str, "puid");
        Intrinsics.checkParameterIsNotNull(str2, "reportId");
        Intrinsics.checkParameterIsNotNull(map, "adapterPositionMap");
        Intrinsics.checkParameterIsNotNull(listState, "recommendListState");
        this.showGuide = z;
        this.puid = str;
        this.yellowPointCount = i;
        this.recommendUserType = i2;
        this.hideRecommendMask = z2;
        this.newRecommendCount = i3;
        this.followBackRecommend = i4;
        this.enableFace2Face = z3;
        this.contactNoticeCount = i5;
        this.showContactDot = z4;
        this.reportId = str2;
        this.adapterPositionMap = map;
        this.recommendListState = listState;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RecommendListState(boolean r21, java.lang.String r22, int r23, int r24, boolean r25, int r26, int r27, boolean r28, int r29, boolean r30, java.lang.String r31, java.util.Map r32, com.bytedance.jedi.arch.ext.list.ListState r33, int r34, kotlin.jvm.internal.DefaultConstructorMarker r35) {
        /*
            r20 = this;
            r0 = r34
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = 0
            goto L_0x000b
        L_0x0009:
            r1 = r21
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = ""
            goto L_0x0014
        L_0x0012:
            r3 = r22
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001a
            r4 = 0
            goto L_0x001c
        L_0x001a:
            r4 = r23
        L_0x001c:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0022
            r5 = 0
            goto L_0x0024
        L_0x0022:
            r5 = r24
        L_0x0024:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002a
            r6 = 0
            goto L_0x002c
        L_0x002a:
            r6 = r25
        L_0x002c:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0032
            r7 = 0
            goto L_0x0034
        L_0x0032:
            r7 = r26
        L_0x0034:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x003a
            r8 = 0
            goto L_0x003c
        L_0x003a:
            r8 = r27
        L_0x003c:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0042
            r9 = 0
            goto L_0x0044
        L_0x0042:
            r9 = r28
        L_0x0044:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x004a
            r10 = 0
            goto L_0x004c
        L_0x004a:
            r10 = r29
        L_0x004c:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0052
            r11 = 0
            goto L_0x0054
        L_0x0052:
            r11 = r30
        L_0x0054:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x005b
            java.lang.String r12 = ""
            goto L_0x005d
        L_0x005b:
            r12 = r31
        L_0x005d:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0069
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            java.util.Map r13 = (java.util.Map) r13
            goto L_0x006b
        L_0x0069:
            r13 = r32
        L_0x006b:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0099
            com.bytedance.jedi.arch.ext.list.ListState r0 = new com.bytedance.jedi.arch.ext.list.ListState
            com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.d r14 = new com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.d
            r15 = 0
            r16 = r13
            r13 = 7
            r14.<init>(r15, r2, r2, r13)
            r2 = r14
            com.bytedance.jedi.arch.ext.list.k r2 = (com.bytedance.jedi.arch.ext.list.k) r2
            r13 = 0
            r14 = 0
            r17 = 0
            r18 = 30
            r19 = 0
            r21 = r0
            r22 = r2
            r23 = r13
            r24 = r14
            r25 = r15
            r26 = r17
            r27 = r18
            r28 = r19
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x009d
        L_0x0099:
            r16 = r13
            r0 = r33
        L_0x009d:
            r21 = r20
            r22 = r1
            r23 = r3
            r24 = r4
            r25 = r5
            r26 = r6
            r27 = r7
            r28 = r8
            r29 = r9
            r30 = r10
            r31 = r11
            r32 = r12
            r33 = r16
            r34 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListState.<init>(boolean, java.lang.String, int, int, boolean, int, int, boolean, int, boolean, java.lang.String, java.util.Map, com.bytedance.jedi.arch.ext.list.ListState, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

package com.ss.android.ugc.aweme.discover.model;

import android.annotation.SuppressLint;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u0000 82\u00020\u0001:\u00018B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fHÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jo\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u0007HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000f\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001a\u0010\r\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018¨\u00069"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/model/DiscoveryCellStructV3;", "", "cellID", "", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "idx", "", "(Ljava/lang/String;Lcom/ss/android/ugc/aweme/feed/model/Aweme;I)V", "title", "type", "awemes", "", "displayWidth", "displayHeight", "columnIdx", "logPb", "Lcom/ss/android/ugc/aweme/feed/model/LogPbBean;", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;IIIILcom/ss/android/ugc/aweme/feed/model/LogPbBean;)V", "getAwemes", "()Ljava/util/List;", "getCellID", "()Ljava/lang/String;", "getColumnIdx", "()I", "setColumnIdx", "(I)V", "getDisplayHeight", "setDisplayHeight", "getDisplayWidth", "setDisplayWidth", "getIdx", "setIdx", "getLogPb", "()Lcom/ss/android/ugc/aweme/feed/model/LogPbBean;", "setLogPb", "(Lcom/ss/android/ugc/aweme/feed/model/LogPbBean;)V", "playListType", "getPlayListType", "getTitle", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"TooManyMethodParam"})
public final class DiscoveryCellStructV3 {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("aweme_list")
    @Nullable
    public final List<Aweme> awemes;
    @SerializedName("cell_id")
    @NotNull
    public final String cellID;
    public int columnIdx;
    public int displayHeight;
    public int displayWidth;
    public int idx;
    @Nullable
    public LogPbBean logPb;
    @SerializedName("title")
    @Nullable
    public final String title;
    @SerializedName("type")
    public final int type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/model/DiscoveryCellStructV3$Companion;", "", "()V", "CELL_TYPE_CHALLENGE", "", "CELL_TYPE_MUSIC", "CELL_TYPE_THEME", "CELL_TYPE_VIDEO", "getPlayListType", "", "type", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        @NotNull
        public final String getPlayListType(int i) {
            switch (i) {
                case 0:
                    return "tag";
                case 1:
                    return "music";
                case 2:
                    return "theme";
                default:
                    return "video";
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ DiscoveryCellStructV3 copy$default(DiscoveryCellStructV3 discoveryCellStructV3, String str, String str2, int i, List list, int i2, int i3, int i4, int i5, LogPbBean logPbBean, int i6, Object obj) {
        DiscoveryCellStructV3 discoveryCellStructV32 = discoveryCellStructV3;
        int i7 = i6;
        return discoveryCellStructV3.copy((i7 & 1) != 0 ? discoveryCellStructV32.cellID : str, (i7 & 2) != 0 ? discoveryCellStructV32.title : str2, (i7 & 4) != 0 ? discoveryCellStructV32.type : i, (i7 & 8) != 0 ? discoveryCellStructV32.awemes : list, (i7 & 16) != 0 ? discoveryCellStructV32.displayWidth : i2, (i7 & 32) != 0 ? discoveryCellStructV32.displayHeight : i3, (i7 & 64) != 0 ? discoveryCellStructV32.columnIdx : i4, (i7 & SearchJediMixFeedAdapter.f42517f) != 0 ? discoveryCellStructV32.idx : i5, (i7 & 256) != 0 ? discoveryCellStructV32.logPb : logPbBean);
    }

    @NotNull
    public final DiscoveryCellStructV3 copy(@NotNull String str, @Nullable String str2, int i, @Nullable List<? extends Aweme> list, int i2, int i3, int i4, int i5, @Nullable LogPbBean logPbBean) {
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3, str2, Integer.valueOf(i), list, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), logPbBean}, this, changeQuickRedirect, false, 37032, new Class[]{String.class, String.class, Integer.TYPE, List.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, LogPbBean.class}, DiscoveryCellStructV3.class)) {
            return (DiscoveryCellStructV3) PatchProxy.accessDispatch(new Object[]{str3, str2, Integer.valueOf(i), list, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), logPbBean}, this, changeQuickRedirect, false, 37032, new Class[]{String.class, String.class, Integer.TYPE, List.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, LogPbBean.class}, DiscoveryCellStructV3.class);
        }
        Intrinsics.checkParameterIsNotNull(str3, "cellID");
        DiscoveryCellStructV3 discoveryCellStructV3 = new DiscoveryCellStructV3(str, str2, i, list, i2, i3, i4, i5, logPbBean);
        return discoveryCellStructV3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 37035, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 37035, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof DiscoveryCellStructV3) {
                DiscoveryCellStructV3 discoveryCellStructV3 = (DiscoveryCellStructV3) obj;
                if (Intrinsics.areEqual((Object) this.cellID, (Object) discoveryCellStructV3.cellID) && Intrinsics.areEqual((Object) this.title, (Object) discoveryCellStructV3.title)) {
                    if ((this.type == discoveryCellStructV3.type) && Intrinsics.areEqual((Object) this.awemes, (Object) discoveryCellStructV3.awemes)) {
                        if (this.displayWidth == discoveryCellStructV3.displayWidth) {
                            if (this.displayHeight == discoveryCellStructV3.displayHeight) {
                                if (this.columnIdx == discoveryCellStructV3.columnIdx) {
                                    if (!(this.idx == discoveryCellStructV3.idx) || !Intrinsics.areEqual((Object) this.logPb, (Object) discoveryCellStructV3.logPb)) {
                                        return false;
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37034, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37034, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.cellID;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.type) * 31;
        List<Aweme> list = this.awemes;
        int hashCode3 = (((((((((hashCode2 + (list != null ? list.hashCode() : 0)) * 31) + this.displayWidth) * 31) + this.displayHeight) * 31) + this.columnIdx) * 31) + this.idx) * 31;
        LogPbBean logPbBean = this.logPb;
        if (logPbBean != null) {
            i = logPbBean.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37033, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37033, new Class[0], String.class);
        }
        return "DiscoveryCellStructV3(cellID=" + this.cellID + ", title=" + this.title + ", type=" + this.type + ", awemes=" + this.awemes + ", displayWidth=" + this.displayWidth + ", displayHeight=" + this.displayHeight + ", columnIdx=" + this.columnIdx + ", idx=" + this.idx + ", logPb=" + this.logPb + ")";
    }

    @NotNull
    public final String getPlayListType() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37031, new Class[0], String.class)) {
            return Companion.getPlayListType(this.type);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37031, new Class[0], String.class);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DiscoveryCellStructV3(@NotNull String str, @NotNull Aweme aweme, int i) {
        this(str, "", 0, CollectionsKt.listOf(aweme), 0, 0, 0, i, null, 256, null);
        Intrinsics.checkParameterIsNotNull(str, "cellID");
        Aweme aweme2 = aweme;
        Intrinsics.checkParameterIsNotNull(aweme, "aweme");
    }

    public DiscoveryCellStructV3(@NotNull String str, @Nullable String str2, int i, @Nullable List<? extends Aweme> list, int i2, int i3, int i4, int i5, @Nullable LogPbBean logPbBean) {
        Intrinsics.checkParameterIsNotNull(str, "cellID");
        this.cellID = str;
        this.title = str2;
        this.type = i;
        this.awemes = list;
        this.displayWidth = i2;
        this.displayHeight = i3;
        this.columnIdx = i4;
        this.idx = i5;
        this.logPb = logPbBean;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DiscoveryCellStructV3(java.lang.String r13, java.lang.String r14, int r15, java.util.List r16, int r17, int r18, int r19, int r20, com.ss.android.ugc.aweme.feed.model.LogPbBean r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0009
            r1 = -1
            r10 = -1
            goto L_0x000b
        L_0x0009:
            r10 = r20
        L_0x000b:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0012
            r0 = 0
            r11 = r0
            goto L_0x0014
        L_0x0012:
            r11 = r21
        L_0x0014:
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3.<init>(java.lang.String, java.lang.String, int, java.util.List, int, int, int, int, com.ss.android.ugc.aweme.feed.model.LogPbBean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

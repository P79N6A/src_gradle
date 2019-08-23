package com.ss.android.ugc.aweme.feed.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003J;\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R&\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006("}, d2 = {"Lcom/ss/android/ugc/aweme/feed/model/NewStickerItemList;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "cursor", "", "hasMore", "", "stickers", "", "Lcom/ss/android/ugc/aweme/feed/model/NewFaceSticker;", "logPb", "Lcom/ss/android/ugc/aweme/feed/model/LogPbBean;", "(JILjava/util/List;Lcom/ss/android/ugc/aweme/feed/model/LogPbBean;)V", "getCursor", "()J", "setCursor", "(J)V", "getHasMore", "()I", "setHasMore", "(I)V", "getLogPb", "()Lcom/ss/android/ugc/aweme/feed/model/LogPbBean;", "setLogPb", "(Lcom/ss/android/ugc/aweme/feed/model/LogPbBean;)V", "getStickers", "()Ljava/util/List;", "setStickers", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class NewStickerItemList extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("cursor")
    public long cursor;
    @SerializedName("has_more")
    public int hasMore;
    @SerializedName("log_pb")
    @Nullable
    public LogPbBean logPb;
    @SerializedName("effect")
    @Nullable
    public List<NewFaceSticker> stickers;

    public NewStickerItemList() {
        this(0, 0, null, null, 15, null);
    }

    public static /* synthetic */ NewStickerItemList copy$default(NewStickerItemList newStickerItemList, long j, int i, List<NewFaceSticker> list, LogPbBean logPbBean, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = newStickerItemList.cursor;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            i = newStickerItemList.hasMore;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            list = newStickerItemList.stickers;
        }
        List<NewFaceSticker> list2 = list;
        if ((i2 & 8) != 0) {
            logPbBean = newStickerItemList.logPb;
        }
        return newStickerItemList.copy(j2, i3, list2, logPbBean);
    }

    @NotNull
    public final NewStickerItemList copy(long j, int i, @Nullable List<NewFaceSticker> list, @Nullable LogPbBean logPbBean) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), list, logPbBean}, this, changeQuickRedirect, false, 41468, new Class[]{Long.TYPE, Integer.TYPE, List.class, LogPbBean.class}, NewStickerItemList.class)) {
            Object[] objArr = {new Long(j2), Integer.valueOf(i), list, logPbBean};
            return (NewStickerItemList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, 41468, new Class[]{Long.TYPE, Integer.TYPE, List.class, LogPbBean.class}, NewStickerItemList.class);
        }
        NewStickerItemList newStickerItemList = new NewStickerItemList(j, i, list, logPbBean);
        return newStickerItemList;
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 41471, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 41471, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof NewStickerItemList) {
                NewStickerItemList newStickerItemList = (NewStickerItemList) obj;
                if (this.cursor == newStickerItemList.cursor) {
                    if (!(this.hasMore == newStickerItemList.hasMore) || !Intrinsics.areEqual((Object) this.stickers, (Object) newStickerItemList.stickers) || !Intrinsics.areEqual((Object) this.logPb, (Object) newStickerItemList.logPb)) {
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41470, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41470, new Class[0], Integer.TYPE)).intValue();
        }
        long j = this.cursor;
        int i2 = ((((int) (j ^ (j >>> 32))) * 31) + this.hasMore) * 31;
        List<NewFaceSticker> list = this.stickers;
        int hashCode = (i2 + (list != null ? list.hashCode() : 0)) * 31;
        LogPbBean logPbBean = this.logPb;
        if (logPbBean != null) {
            i = logPbBean.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41469, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41469, new Class[0], String.class);
        }
        return "NewStickerItemList(cursor=" + this.cursor + ", hasMore=" + this.hasMore + ", stickers=" + this.stickers + ", logPb=" + this.logPb + ")";
    }

    public NewStickerItemList(long j, int i, @Nullable List<NewFaceSticker> list, @Nullable LogPbBean logPbBean) {
        this.cursor = j;
        this.hasMore = i;
        this.stickers = list;
        this.logPb = logPbBean;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ NewStickerItemList(long r7, int r9, java.util.List r10, com.ss.android.ugc.aweme.feed.model.LogPbBean r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r13 = r12 & 1
            if (r13 == 0) goto L_0x0006
            r7 = 0
        L_0x0006:
            r1 = r7
            r7 = r12 & 2
            if (r7 == 0) goto L_0x000e
            r9 = 0
            r3 = 0
            goto L_0x000f
        L_0x000e:
            r3 = r9
        L_0x000f:
            r7 = r12 & 4
            r8 = 0
            if (r7 == 0) goto L_0x0016
            r4 = r8
            goto L_0x0017
        L_0x0016:
            r4 = r10
        L_0x0017:
            r7 = r12 & 8
            if (r7 == 0) goto L_0x001d
            r5 = r8
            goto L_0x001e
        L_0x001d:
            r5 = r11
        L_0x001e:
            r0 = r6
            r0.<init>(r1, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.NewStickerItemList.<init>(long, int, java.util.List, com.ss.android.ugc.aweme.feed.model.LogPbBean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

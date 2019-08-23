package com.ss.android.ugc.aweme.commerce.service.models;

import android.annotation.SuppressLint;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0015J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\u000bHÆ\u0003J\t\u00106\u001a\u00020\u000bHÆ\u0003J\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u00020\u0003HÖ\u0001J\t\u0010?\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001d¨\u0006@"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceActivityStruct;", "Ljava/io/Serializable;", "actType", "", "image", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "jumpWebUrl", "", "jumpOpenUrl", "title", "startTime", "", "endTime", "timeRange", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/ActivityTimeRange;", "trackUrlList", "clickTrackUrlList", "groupId", "authorId", "enterFrom", "(ILcom/ss/android/ugc/aweme/base/model/UrlModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/util/List;Lcom/ss/android/ugc/aweme/base/model/UrlModel;Lcom/ss/android/ugc/aweme/base/model/UrlModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActType", "()I", "getAuthorId", "()Ljava/lang/String;", "setAuthorId", "(Ljava/lang/String;)V", "getClickTrackUrlList", "()Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "getEndTime", "()J", "getEnterFrom", "setEnterFrom", "getGroupId", "setGroupId", "getImage", "getJumpOpenUrl", "getJumpWebUrl", "getStartTime", "getTimeRange", "()Ljava/util/List;", "getTitle", "getTrackUrlList", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"TooManyMethodParam"})
public final class e implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("act_type")
    public int actType;
    @Nullable
    public String authorId;
    @SerializedName("click_track_url_list")
    @Nullable
    public UrlModel clickTrackUrlList;
    @SerializedName("end_time")
    public long endTime;
    @Nullable
    public String enterFrom;
    @Nullable
    public String groupId;
    @SerializedName("image")
    @Nullable
    public UrlModel image;
    @SerializedName("jump_open_url")
    @NotNull
    public String jumpOpenUrl;
    @SerializedName("jump_web_url")
    @NotNull
    public String jumpWebUrl;
    @SerializedName("start_time")
    public long startTime;
    @SerializedName("time_range")
    @Nullable
    public List<a> timeRange;
    @SerializedName("title")
    @NotNull
    public String title;
    @SerializedName("track_url_list")
    @Nullable
    public UrlModel trackUrlList;

    public static /* synthetic */ e copy$default(e eVar, int i, UrlModel urlModel, String str, String str2, String str3, long j, long j2, List list, UrlModel urlModel2, UrlModel urlModel3, String str4, String str5, String str6, int i2, Object obj) {
        e eVar2 = eVar;
        int i3 = i2;
        return eVar.copy((i3 & 1) != 0 ? eVar2.actType : i, (i3 & 2) != 0 ? eVar2.image : urlModel, (i3 & 4) != 0 ? eVar2.jumpWebUrl : str, (i3 & 8) != 0 ? eVar2.jumpOpenUrl : str2, (i3 & 16) != 0 ? eVar2.title : str3, (i3 & 32) != 0 ? eVar2.startTime : j, (i3 & 64) != 0 ? eVar2.endTime : j2, (i3 & SearchJediMixFeedAdapter.f42517f) != 0 ? eVar2.timeRange : list, (i3 & 256) != 0 ? eVar2.trackUrlList : urlModel2, (i3 & 512) != 0 ? eVar2.clickTrackUrlList : urlModel3, (i3 & 1024) != 0 ? eVar2.groupId : str4, (i3 & 2048) != 0 ? eVar2.authorId : str5, (i3 & 4096) != 0 ? eVar2.enterFrom : str6);
    }

    public final int component1() {
        return this.actType;
    }

    @Nullable
    public final UrlModel component10() {
        return this.clickTrackUrlList;
    }

    @Nullable
    public final String component11() {
        return this.groupId;
    }

    @Nullable
    public final String component12() {
        return this.authorId;
    }

    @Nullable
    public final String component13() {
        return this.enterFrom;
    }

    @Nullable
    public final UrlModel component2() {
        return this.image;
    }

    @NotNull
    public final String component3() {
        return this.jumpWebUrl;
    }

    @NotNull
    public final String component4() {
        return this.jumpOpenUrl;
    }

    @NotNull
    public final String component5() {
        return this.title;
    }

    public final long component6() {
        return this.startTime;
    }

    public final long component7() {
        return this.endTime;
    }

    @Nullable
    public final List<a> component8() {
        return this.timeRange;
    }

    @Nullable
    public final UrlModel component9() {
        return this.trackUrlList;
    }

    @NotNull
    public final e copy(int i, @Nullable UrlModel urlModel, @NotNull String str, @NotNull String str2, @NotNull String str3, long j, long j2, @Nullable List<a> list, @Nullable UrlModel urlModel2, @Nullable UrlModel urlModel3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        long j3 = j;
        long j4 = j2;
        Object[] objArr = {Integer.valueOf(i), urlModel, str7, str8, str9, new Long(j3), new Long(j4), list, urlModel2, urlModel3, str4, str5, str6};
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, 29811, new Class[]{Integer.TYPE, UrlModel.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, List.class, UrlModel.class, UrlModel.class, String.class, String.class, String.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), urlModel, str7, str8, str9, new Long(j3), new Long(j4), list, urlModel2, urlModel3, str4, str5, str6}, this, changeQuickRedirect, false, 29811, new Class[]{Integer.TYPE, UrlModel.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, List.class, UrlModel.class, UrlModel.class, String.class, String.class, String.class}, e.class);
        }
        Intrinsics.checkParameterIsNotNull(str7, "jumpWebUrl");
        Intrinsics.checkParameterIsNotNull(str8, "jumpOpenUrl");
        Intrinsics.checkParameterIsNotNull(str9, PushConstants.TITLE);
        e eVar = new e(i, urlModel, str, str2, str3, j, j2, list, urlModel2, urlModel3, str4, str5, str6);
        return eVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 29814, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 29814, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if ((this.actType == eVar.actType) && Intrinsics.areEqual((Object) this.image, (Object) eVar.image) && Intrinsics.areEqual((Object) this.jumpWebUrl, (Object) eVar.jumpWebUrl) && Intrinsics.areEqual((Object) this.jumpOpenUrl, (Object) eVar.jumpOpenUrl) && Intrinsics.areEqual((Object) this.title, (Object) eVar.title)) {
                    if (this.startTime == eVar.startTime) {
                        if (!(this.endTime == eVar.endTime) || !Intrinsics.areEqual((Object) this.timeRange, (Object) eVar.timeRange) || !Intrinsics.areEqual((Object) this.trackUrlList, (Object) eVar.trackUrlList) || !Intrinsics.areEqual((Object) this.clickTrackUrlList, (Object) eVar.clickTrackUrlList) || !Intrinsics.areEqual((Object) this.groupId, (Object) eVar.groupId) || !Intrinsics.areEqual((Object) this.authorId, (Object) eVar.authorId) || !Intrinsics.areEqual((Object) this.enterFrom, (Object) eVar.enterFrom)) {
                            return false;
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29813, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29813, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.actType * 31;
        UrlModel urlModel = this.image;
        int hashCode = (i2 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str = this.jumpWebUrl;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.jumpOpenUrl;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.title;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        long j = this.startTime;
        long j2 = this.endTime;
        int i3 = (((((hashCode3 + hashCode4) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        List<a> list = this.timeRange;
        int hashCode5 = (i3 + (list != null ? list.hashCode() : 0)) * 31;
        UrlModel urlModel2 = this.trackUrlList;
        int hashCode6 = (hashCode5 + (urlModel2 != null ? urlModel2.hashCode() : 0)) * 31;
        UrlModel urlModel3 = this.clickTrackUrlList;
        int hashCode7 = (hashCode6 + (urlModel3 != null ? urlModel3.hashCode() : 0)) * 31;
        String str4 = this.groupId;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.authorId;
        int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.enterFrom;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode9 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29812, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29812, new Class[0], String.class);
        }
        return "CommerceActivityStruct(actType=" + this.actType + ", image=" + this.image + ", jumpWebUrl=" + this.jumpWebUrl + ", jumpOpenUrl=" + this.jumpOpenUrl + ", title=" + this.title + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", timeRange=" + this.timeRange + ", trackUrlList=" + this.trackUrlList + ", clickTrackUrlList=" + this.clickTrackUrlList + ", groupId=" + this.groupId + ", authorId=" + this.authorId + ", enterFrom=" + this.enterFrom + ")";
    }

    public final int getActType() {
        return this.actType;
    }

    @Nullable
    public final String getAuthorId() {
        return this.authorId;
    }

    @Nullable
    public final UrlModel getClickTrackUrlList() {
        return this.clickTrackUrlList;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final String getEnterFrom() {
        return this.enterFrom;
    }

    @Nullable
    public final String getGroupId() {
        return this.groupId;
    }

    @Nullable
    public final UrlModel getImage() {
        return this.image;
    }

    @NotNull
    public final String getJumpOpenUrl() {
        return this.jumpOpenUrl;
    }

    @NotNull
    public final String getJumpWebUrl() {
        return this.jumpWebUrl;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final List<a> getTimeRange() {
        return this.timeRange;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final UrlModel getTrackUrlList() {
        return this.trackUrlList;
    }

    public final void setAuthorId(@Nullable String str) {
        this.authorId = str;
    }

    public final void setEnterFrom(@Nullable String str) {
        this.enterFrom = str;
    }

    public final void setGroupId(@Nullable String str) {
        this.groupId = str;
    }

    public e(int i, @Nullable UrlModel urlModel, @NotNull String str, @NotNull String str2, @NotNull String str3, long j, long j2, @Nullable List<a> list, @Nullable UrlModel urlModel2, @Nullable UrlModel urlModel3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        Intrinsics.checkParameterIsNotNull(str, "jumpWebUrl");
        Intrinsics.checkParameterIsNotNull(str2, "jumpOpenUrl");
        Intrinsics.checkParameterIsNotNull(str3, PushConstants.TITLE);
        this.actType = i;
        this.image = urlModel;
        this.jumpWebUrl = str;
        this.jumpOpenUrl = str2;
        this.title = str3;
        this.startTime = j;
        this.endTime = j2;
        this.timeRange = list;
        this.trackUrlList = urlModel2;
        this.clickTrackUrlList = urlModel3;
        this.groupId = str4;
        this.authorId = str5;
        this.enterFrom = str6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ e(int r19, com.ss.android.ugc.aweme.base.model.UrlModel r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, long r24, long r26, java.util.List r28, com.ss.android.ugc.aweme.base.model.UrlModel r29, com.ss.android.ugc.aweme.base.model.UrlModel r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, int r34, kotlin.jvm.internal.DefaultConstructorMarker r35) {
        /*
            r18 = this;
            r1 = r34 & 4
            if (r1 == 0) goto L_0x0008
            java.lang.String r1 = ""
            r5 = r1
            goto L_0x000a
        L_0x0008:
            r5 = r21
        L_0x000a:
            r1 = r34 & 8
            if (r1 == 0) goto L_0x0012
            java.lang.String r1 = ""
            r6 = r1
            goto L_0x0014
        L_0x0012:
            r6 = r22
        L_0x0014:
            r0 = r34 & 16
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = ""
            r7 = r0
            goto L_0x001e
        L_0x001c:
            r7 = r23
        L_0x001e:
            r2 = r18
            r3 = r19
            r4 = r20
            r8 = r24
            r10 = r26
            r12 = r28
            r13 = r29
            r14 = r30
            r15 = r31
            r16 = r32
            r17 = r33
            r2.<init>(r3, r4, r5, r6, r7, r8, r10, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.service.models.e.<init>(int, com.ss.android.ugc.aweme.base.model.UrlModel, java.lang.String, java.lang.String, java.lang.String, long, long, java.util.List, com.ss.android.ugc.aweme.base.model.UrlModel, com.ss.android.ugc.aweme.base.model.UrlModel, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

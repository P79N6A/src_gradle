package com.ss.android.ugc.aweme.challenge.model;

import android.annotation.SuppressLint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b'\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001Bi\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\n¢\u0006\u0002\u0010\u000eJ\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003Jm\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\nHÆ\u0001J\u0013\u00100\u001a\u00020\b2\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020\nHÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0012R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010!\"\u0004\b\"\u0010#R\u001a\u0010\r\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016¨\u00065"}, d2 = {"Lcom/ss/android/ugc/aweme/challenge/model/ChallengeDetailParam;", "Ljava/io/Serializable;", "cid", "", "awemeId", "enterFrom", "fromToken", "isHashTag", "", "challengeType", "", "clickReason", "enterpriseUid", "showTabIndex", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIILjava/lang/String;I)V", "getAwemeId", "()Ljava/lang/String;", "setAwemeId", "(Ljava/lang/String;)V", "getChallengeType", "()I", "setChallengeType", "(I)V", "getCid", "setCid", "getClickReason", "setClickReason", "getEnterFrom", "setEnterFrom", "getEnterpriseUid", "setEnterpriseUid", "getFromToken", "setFromToken", "()Z", "setHashTag", "(Z)V", "getShowTabIndex", "setShowTabIndex", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"TooManyMethodParam"})
public final class ChallengeDetailParam implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private String awemeId;
    private int challengeType;
    @Nullable
    private String cid;
    private int clickReason;
    @Nullable
    private String enterFrom;
    @Nullable
    private String enterpriseUid;
    @Nullable
    private String fromToken;
    private boolean isHashTag;
    private int showTabIndex;

    public ChallengeDetailParam() {
        this(null, null, null, null, false, 0, 0, null, 0, 511, null);
    }

    public static /* synthetic */ ChallengeDetailParam copy$default(ChallengeDetailParam challengeDetailParam, String str, String str2, String str3, String str4, boolean z, int i, int i2, String str5, int i3, int i4, Object obj) {
        ChallengeDetailParam challengeDetailParam2 = challengeDetailParam;
        int i5 = i4;
        return challengeDetailParam.copy((i5 & 1) != 0 ? challengeDetailParam2.cid : str, (i5 & 2) != 0 ? challengeDetailParam2.awemeId : str2, (i5 & 4) != 0 ? challengeDetailParam2.enterFrom : str3, (i5 & 8) != 0 ? challengeDetailParam2.fromToken : str4, (i5 & 16) != 0 ? challengeDetailParam2.isHashTag : z, (i5 & 32) != 0 ? challengeDetailParam2.challengeType : i, (i5 & 64) != 0 ? challengeDetailParam2.clickReason : i2, (i5 & SearchJediMixFeedAdapter.f42517f) != 0 ? challengeDetailParam2.enterpriseUid : str5, (i5 & 256) != 0 ? challengeDetailParam2.showTabIndex : i3);
    }

    @Nullable
    public final String component1() {
        return this.cid;
    }

    @Nullable
    public final String component2() {
        return this.awemeId;
    }

    @Nullable
    public final String component3() {
        return this.enterFrom;
    }

    @Nullable
    public final String component4() {
        return this.fromToken;
    }

    public final boolean component5() {
        return this.isHashTag;
    }

    public final int component6() {
        return this.challengeType;
    }

    public final int component7() {
        return this.clickReason;
    }

    @Nullable
    public final String component8() {
        return this.enterpriseUid;
    }

    public final int component9() {
        return this.showTabIndex;
    }

    @NotNull
    public final ChallengeDetailParam copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z, int i, int i2, @Nullable String str5, int i3) {
        if (PatchProxy.isSupport(new Object[]{str, str2, str3, str4, Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), Integer.valueOf(i2), str5, Integer.valueOf(i3)}, this, changeQuickRedirect, false, 25834, new Class[]{String.class, String.class, String.class, String.class, Boolean.TYPE, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE}, ChallengeDetailParam.class)) {
            return (ChallengeDetailParam) PatchProxy.accessDispatch(new Object[]{str, str2, str3, str4, Byte.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), str5, Integer.valueOf(i3)}, this, changeQuickRedirect, false, 25834, new Class[]{String.class, String.class, String.class, String.class, Boolean.TYPE, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE}, ChallengeDetailParam.class);
        }
        ChallengeDetailParam challengeDetailParam = new ChallengeDetailParam(str, str2, str3, str4, z, i, i2, str5, i3);
        return challengeDetailParam;
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 25837, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 25837, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof ChallengeDetailParam) {
                ChallengeDetailParam challengeDetailParam = (ChallengeDetailParam) obj;
                if (Intrinsics.areEqual((Object) this.cid, (Object) challengeDetailParam.cid) && Intrinsics.areEqual((Object) this.awemeId, (Object) challengeDetailParam.awemeId) && Intrinsics.areEqual((Object) this.enterFrom, (Object) challengeDetailParam.enterFrom) && Intrinsics.areEqual((Object) this.fromToken, (Object) challengeDetailParam.fromToken)) {
                    if (this.isHashTag == challengeDetailParam.isHashTag) {
                        if (this.challengeType == challengeDetailParam.challengeType) {
                            if ((this.clickReason == challengeDetailParam.clickReason) && Intrinsics.areEqual((Object) this.enterpriseUid, (Object) challengeDetailParam.enterpriseUid)) {
                                if (this.showTabIndex == challengeDetailParam.showTabIndex) {
                                    return true;
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 25836, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 25836, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.cid;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.awemeId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.enterFrom;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.fromToken;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.isHashTag;
        if (z) {
            z = true;
        }
        int i2 = (((((hashCode4 + (z ? 1 : 0)) * 31) + this.challengeType) * 31) + this.clickReason) * 31;
        String str5 = this.enterpriseUid;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return ((i2 + i) * 31) + this.showTabIndex;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 25835, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 25835, new Class[0], String.class);
        }
        return "ChallengeDetailParam(cid=" + this.cid + ", awemeId=" + this.awemeId + ", enterFrom=" + this.enterFrom + ", fromToken=" + this.fromToken + ", isHashTag=" + this.isHashTag + ", challengeType=" + this.challengeType + ", clickReason=" + this.clickReason + ", enterpriseUid=" + this.enterpriseUid + ", showTabIndex=" + this.showTabIndex + ")";
    }

    @Nullable
    public final String getAwemeId() {
        return this.awemeId;
    }

    public final int getChallengeType() {
        return this.challengeType;
    }

    @Nullable
    public final String getCid() {
        return this.cid;
    }

    public final int getClickReason() {
        return this.clickReason;
    }

    @Nullable
    public final String getEnterFrom() {
        return this.enterFrom;
    }

    @Nullable
    public final String getEnterpriseUid() {
        return this.enterpriseUid;
    }

    @Nullable
    public final String getFromToken() {
        return this.fromToken;
    }

    public final int getShowTabIndex() {
        return this.showTabIndex;
    }

    public final boolean isHashTag() {
        return this.isHashTag;
    }

    public final void setAwemeId(@Nullable String str) {
        this.awemeId = str;
    }

    public final void setChallengeType(int i) {
        this.challengeType = i;
    }

    public final void setCid(@Nullable String str) {
        this.cid = str;
    }

    public final void setClickReason(int i) {
        this.clickReason = i;
    }

    public final void setEnterFrom(@Nullable String str) {
        this.enterFrom = str;
    }

    public final void setEnterpriseUid(@Nullable String str) {
        this.enterpriseUid = str;
    }

    public final void setFromToken(@Nullable String str) {
        this.fromToken = str;
    }

    public final void setHashTag(boolean z) {
        this.isHashTag = z;
    }

    public final void setShowTabIndex(int i) {
        this.showTabIndex = i;
    }

    public ChallengeDetailParam(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z, int i, int i2, @Nullable String str5, int i3) {
        this.cid = str;
        this.awemeId = str2;
        this.enterFrom = str3;
        this.fromToken = str4;
        this.isHashTag = z;
        this.challengeType = i;
        this.clickReason = i2;
        this.enterpriseUid = str5;
        this.showTabIndex = i3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ChallengeDetailParam(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15, int r16, int r17, java.lang.String r18, int r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            java.lang.String r1 = ""
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0011
            java.lang.String r2 = ""
            goto L_0x0012
        L_0x0011:
            r2 = r12
        L_0x0012:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = ""
            goto L_0x001a
        L_0x0019:
            r3 = r13
        L_0x001a:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0021
            java.lang.String r4 = ""
            goto L_0x0022
        L_0x0021:
            r4 = r14
        L_0x0022:
            r5 = r0 & 16
            r6 = 0
            if (r5 == 0) goto L_0x0029
            r5 = 0
            goto L_0x002a
        L_0x0029:
            r5 = r15
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r16
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r17
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0041
            java.lang.String r9 = ""
            goto L_0x0043
        L_0x0041:
            r9 = r18
        L_0x0043:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r6 = r19
        L_0x004a:
            r11 = r10
            r12 = r1
            r13 = r2
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.model.ChallengeDetailParam.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, int, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

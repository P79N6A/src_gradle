package com.ss.android.ugc.aweme.discover.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001?B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B'\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\u0013\u0010:\u001a\u00020\u00152\b\u0010;\u001a\u0004\u0018\u00010<H\u0002J\b\u0010=\u001a\u00020\bH\u0016J\b\u0010>\u001a\u00020\u0005H\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u0011\u0010\u001c\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u001d\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001e\u0010(\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0011\"\u0004\b,\u0010\u0013R\u0011\u0010-\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010\u001fR \u0010/\u001a\u0004\u0018\u0001008\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001e\u00105\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001f\"\u0004\b7\u0010!R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0011\"\u0004\b9\u0010\u0013¨\u0006@"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "Lcom/ss/android/ugc/aweme/discover/model/BaseHotSearchItem;", "Ljava/io/Serializable;", "()V", "word", "", "realSearchWord", "label", "", "hotValue", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "adData", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchAdData;", "getAdData", "()Lcom/ss/android/ugc/aweme/discover/model/HotSearchAdData;", "challengeId", "getChallengeId", "()Ljava/lang/String;", "setChallengeId", "(Ljava/lang/String;)V", "hasSentMob", "", "getHasSentMob", "()Z", "setHasSentMob", "(Z)V", "getHotValue", "setHotValue", "isAd", "isPlaceholder", "getLabel", "()I", "setLabel", "(I)V", "logPb", "Lcom/ss/android/ugc/aweme/feed/model/LogPbBean;", "getLogPb", "()Lcom/ss/android/ugc/aweme/feed/model/LogPbBean;", "setLogPb", "(Lcom/ss/android/ugc/aweme/feed/model/LogPbBean;)V", "position", "getPosition", "setPosition", "getRealSearchWord", "setRealSearchWord", "type", "getType", "urlModel", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "getUrlModel", "()Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "setUrlModel", "(Lcom/ss/android/ugc/aweme/base/model/UrlModel;)V", "videoCount", "getVideoCount", "setVideoCount", "getWord", "setWord", "equals", "o", "", "hashCode", "toString", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class HotSearchItem extends BaseHotSearchItem implements Serializable {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("ad_data")
    @JsonAdapter(StringJsonAdapterFactory.class)
    @Nullable
    private final HotSearchAdData adData;
    @SerializedName("challenge_id")
    @Nullable
    private String challengeId;
    private boolean hasSentMob;
    @SerializedName("hot_value")
    @Nullable
    private String hotValue;
    private int label;
    @Nullable
    private LogPbBean logPb;
    @SerializedName("position")
    private int position;
    @SerializedName("search_word")
    @Nullable
    private String realSearchWord;
    @SerializedName("word_cover")
    @Nullable
    private UrlModel urlModel;
    @SerializedName("video_count")
    private int videoCount;
    @Nullable
    private String word;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem$Companion;", "Ljava/io/Serializable;", "()V", "createPlaceHolder", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class Companion implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;

        private Companion() {
        }

        @NotNull
        public final HotSearchItem createPlaceHolder() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37058, new Class[0], HotSearchItem.class)) {
                return new HotSearchItem();
            }
            return (HotSearchItem) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37058, new Class[0], HotSearchItem.class);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public HotSearchItem() {
    }

    @Nullable
    public final HotSearchAdData getAdData() {
        return this.adData;
    }

    @Nullable
    public final String getChallengeId() {
        return this.challengeId;
    }

    public final boolean getHasSentMob() {
        return this.hasSentMob;
    }

    @Nullable
    public final String getHotValue() {
        return this.hotValue;
    }

    public final int getLabel() {
        return this.label;
    }

    @Nullable
    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final int getPosition() {
        return this.position;
    }

    @Nullable
    public final String getRealSearchWord() {
        return this.realSearchWord;
    }

    @Nullable
    public final UrlModel getUrlModel() {
        return this.urlModel;
    }

    public final int getVideoCount() {
        return this.videoCount;
    }

    @Nullable
    public final String getWord() {
        return this.word;
    }

    public final boolean isAd() {
        if (this.adData != null) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String toString() {
        String str = this.word;
        if (str == null) {
            return "PLACE_HOLDER";
        }
        return str;
    }

    public final int getType() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37055, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37055, new Class[0], Integer.TYPE)).intValue();
        } else if (TextUtils.isEmpty(this.challengeId)) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean isPlaceholder() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37054, new Class[0], Boolean.TYPE)) {
            return TextUtils.isEmpty(this.word);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37054, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37057, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37057, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.word != null) {
            String str = this.word;
            if (str == null) {
                Intrinsics.throwNpe();
            }
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        if (this.realSearchWord != null) {
            String str2 = this.realSearchWord;
            if (str2 == null) {
                Intrinsics.throwNpe();
            }
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (((i6 + i2) * 31) + this.label) * 31;
        if (this.hotValue != null) {
            String str3 = this.hotValue;
            if (str3 == null) {
                Intrinsics.throwNpe();
            }
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        if (this.challengeId != null) {
            String str4 = this.challengeId;
            if (str4 == null) {
                Intrinsics.throwNpe();
            }
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        if (this.urlModel != null) {
            UrlModel urlModel2 = this.urlModel;
            if (urlModel2 == null) {
                Intrinsics.throwNpe();
            }
            i5 = urlModel2.hashCode();
        }
        return ((i9 + i5) * 31) + this.position;
    }

    public final void setChallengeId(@Nullable String str) {
        this.challengeId = str;
    }

    public final void setHasSentMob(boolean z) {
        this.hasSentMob = z;
    }

    public final void setHotValue(@Nullable String str) {
        this.hotValue = str;
    }

    public final void setLabel(int i) {
        this.label = i;
    }

    public final void setLogPb(@Nullable LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setPosition(int i) {
        this.position = i;
    }

    public final void setRealSearchWord(@Nullable String str) {
        this.realSearchWord = str;
    }

    public final void setUrlModel(@Nullable UrlModel urlModel2) {
        this.urlModel = urlModel2;
    }

    public final void setVideoCount(int i) {
        this.videoCount = i;
    }

    public final void setWord(@Nullable String str) {
        this.word = str;
    }

    public final boolean equals(@Nullable Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 37056, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 37056, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || (!Intrinsics.areEqual((Object) getClass(), (Object) obj.getClass()))) {
                return false;
            }
            HotSearchItem hotSearchItem = (HotSearchItem) obj;
            if (this.label != hotSearchItem.label) {
                return false;
            }
            if (this.word != null) {
                z = !Intrinsics.areEqual((Object) this.word, (Object) hotSearchItem.word);
            } else if (hotSearchItem.word != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return false;
            }
            if (this.realSearchWord != null) {
                z2 = !Intrinsics.areEqual((Object) this.realSearchWord, (Object) hotSearchItem.realSearchWord);
            } else if (hotSearchItem.realSearchWord != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return false;
            }
            if (this.hotValue != null) {
                z3 = !Intrinsics.areEqual((Object) this.hotValue, (Object) hotSearchItem.hotValue);
            } else if (hotSearchItem.hotValue != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                return false;
            }
            if (this.challengeId != null) {
                z4 = !Intrinsics.areEqual((Object) this.challengeId, (Object) hotSearchItem.challengeId);
            } else if (hotSearchItem.challengeId != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 || this.position != hotSearchItem.position) {
                return false;
            }
            return true;
        }
    }

    public HotSearchItem(@NotNull String str, @NotNull String str2, int i, @NotNull String str3) {
        Intrinsics.checkParameterIsNotNull(str, "word");
        Intrinsics.checkParameterIsNotNull(str2, "realSearchWord");
        Intrinsics.checkParameterIsNotNull(str3, "hotValue");
        this.word = str;
        this.realSearchWord = str2;
        this.label = i;
        this.hotValue = str3;
    }
}

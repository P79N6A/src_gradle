package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commerce.service.models.i;
import com.ss.android.ugc.aweme.music.model.BrandBillboard;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\b\u0010 \u001a\u00020!H\u0016R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Lcom/ss/android/ugc/aweme/discover/model/RankingListCover;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "Ljava/io/Serializable;", "()V", "topBrand", "Lcom/ss/android/ugc/aweme/music/model/BrandBillboard;", "getTopBrand", "()Lcom/ss/android/ugc/aweme/music/model/BrandBillboard;", "setTopBrand", "(Lcom/ss/android/ugc/aweme/music/model/BrandBillboard;)V", "topGoods", "Lcom/ss/android/ugc/aweme/commerce/service/models/DiscoveryTopGoods;", "getTopGoods", "()Lcom/ss/android/ugc/aweme/commerce/service/models/DiscoveryTopGoods;", "setTopGoods", "(Lcom/ss/android/ugc/aweme/commerce/service/models/DiscoveryTopGoods;)V", "topMusic", "Lcom/ss/android/ugc/aweme/music/model/Music;", "getTopMusic", "()Lcom/ss/android/ugc/aweme/music/model/Music;", "setTopMusic", "(Lcom/ss/android/ugc/aweme/music/model/Music;)V", "topStar", "Lcom/ss/android/ugc/aweme/profile/model/User;", "getTopStar", "()Lcom/ss/android/ugc/aweme/profile/model/User;", "setTopStar", "(Lcom/ss/android/ugc/aweme/profile/model/User;)V", "equals", "", "other", "", "hashCode", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RankingListCover extends BaseResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("top_brand")
    @Nullable
    private BrandBillboard topBrand;
    @SerializedName("top_promotion")
    @Nullable
    private i topGoods;
    @SerializedName("top_music")
    @Nullable
    private Music topMusic;
    @SerializedName("top_star")
    @Nullable
    private User topStar;

    @Nullable
    public final BrandBillboard getTopBrand() {
        return this.topBrand;
    }

    @Nullable
    public final i getTopGoods() {
        return this.topGoods;
    }

    @Nullable
    public final Music getTopMusic() {
        return this.topMusic;
    }

    @Nullable
    public final User getTopStar() {
        return this.topStar;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37072, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37072, new Class[0], Integer.TYPE)).intValue();
        }
        Music music = this.topMusic;
        if (music != null) {
            i = music.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        User user = this.topStar;
        if (user != null) {
            i2 = user.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        i iVar = this.topGoods;
        if (iVar != null) {
            i3 = iVar.hashCode();
        }
        return i5 + i3;
    }

    public final void setTopBrand(@Nullable BrandBillboard brandBillboard) {
        this.topBrand = brandBillboard;
    }

    public final void setTopGoods(@Nullable i iVar) {
        this.topGoods = iVar;
    }

    public final void setTopMusic(@Nullable Music music) {
        this.topMusic = music;
    }

    public final void setTopStar(@Nullable User user) {
        this.topStar = user;
    }

    public final boolean equals(@Nullable Object obj) {
        Class<?> cls;
        Long l;
        Long l2;
        String str;
        String str2;
        String str3;
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 37071, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 37071, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            Class<?> cls2 = getClass();
            String str4 = null;
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!Intrinsics.areEqual((Object) cls2, (Object) cls)) {
                return false;
            }
            if (obj != null) {
                Music music = this.topMusic;
                if (music != null) {
                    l = Long.valueOf(music.getId());
                } else {
                    l = null;
                }
                RankingListCover rankingListCover = (RankingListCover) obj;
                Music music2 = rankingListCover.topMusic;
                if (music2 != null) {
                    l2 = Long.valueOf(music2.getId());
                } else {
                    l2 = null;
                }
                if (!Intrinsics.areEqual((Object) l, (Object) l2)) {
                    return false;
                }
                User user = this.topStar;
                if (user != null) {
                    str = user.getUid();
                } else {
                    str = null;
                }
                User user2 = rankingListCover.topStar;
                if (user2 != null) {
                    str2 = user2.getUid();
                } else {
                    str2 = null;
                }
                if (!Intrinsics.areEqual((Object) str, (Object) str2)) {
                    return false;
                }
                i iVar = this.topGoods;
                if (iVar != null) {
                    str3 = iVar.getTitle();
                } else {
                    str3 = null;
                }
                i iVar2 = rankingListCover.topGoods;
                if (iVar2 != null) {
                    str4 = iVar2.getTitle();
                }
                if (!Intrinsics.areEqual((Object) str3, (Object) str4)) {
                    return false;
                }
                return true;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.RankingListCover");
        }
    }
}

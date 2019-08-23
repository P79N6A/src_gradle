package com.ss.android.ugc.aweme.favorites.a;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0002\u0010\u0013J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003Jm\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u000204HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00065"}, d2 = {"Lcom/ss/android/ugc/aweme/favorites/bean/UserCollectionResponse;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "poiCollectionStruct", "Lcom/ss/android/ugc/aweme/favorites/bean/PoiCollectionStruct;", "awemeCollectionStruct", "Lcom/ss/android/ugc/aweme/favorites/bean/AwemeCollectionStruct;", "musicCollectionStruct", "Lcom/ss/android/ugc/aweme/favorites/bean/MusicCollectionStruct;", "challengeCollectionStruct", "Lcom/ss/android/ugc/aweme/favorites/bean/ChallengeCollectionStruct;", "stickerCollectionStruct", "Lcom/ss/android/ugc/aweme/favorites/bean/StickerCollectionStruct;", "willingCollectionStruct", "Lcom/ss/android/ugc/aweme/favorites/bean/UserWillingCollectionStruct;", "count", "", "collectionTabs", "", "Lcom/ss/android/ugc/aweme/favorites/bean/CollectionTabStruct;", "(Lcom/ss/android/ugc/aweme/favorites/bean/PoiCollectionStruct;Lcom/ss/android/ugc/aweme/favorites/bean/AwemeCollectionStruct;Lcom/ss/android/ugc/aweme/favorites/bean/MusicCollectionStruct;Lcom/ss/android/ugc/aweme/favorites/bean/ChallengeCollectionStruct;Lcom/ss/android/ugc/aweme/favorites/bean/StickerCollectionStruct;Lcom/ss/android/ugc/aweme/favorites/bean/UserWillingCollectionStruct;JLjava/util/List;)V", "getAwemeCollectionStruct", "()Lcom/ss/android/ugc/aweme/favorites/bean/AwemeCollectionStruct;", "getChallengeCollectionStruct", "()Lcom/ss/android/ugc/aweme/favorites/bean/ChallengeCollectionStruct;", "getCollectionTabs", "()Ljava/util/List;", "getCount", "()J", "getMusicCollectionStruct", "()Lcom/ss/android/ugc/aweme/favorites/bean/MusicCollectionStruct;", "getPoiCollectionStruct", "()Lcom/ss/android/ugc/aweme/favorites/bean/PoiCollectionStruct;", "getStickerCollectionStruct", "()Lcom/ss/android/ugc/aweme/favorites/bean/StickerCollectionStruct;", "getWillingCollectionStruct", "()Lcom/ss/android/ugc/aweme/favorites/bean/UserWillingCollectionStruct;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class i extends BaseResponse {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44220a;
    @SerializedName("poi_collection")
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final e f44221b;
    @SerializedName("aweme_collection")
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final a f44222c;
    @SerializedName("music_collection")
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final d f44223d;
    @SerializedName("challenge_collection")
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public final b f44224e;
    @SerializedName("sticker_collection")
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public final g f44225f;
    @SerializedName("willing_collection")
    @Nullable
    public final j g;
    @SerializedName("count")
    public final long h;
    @SerializedName("collection_tabs")
    @Nullable
    public final List<c> i;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f44220a, false, 39458, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f44220a, false, 39458, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof i) {
                i iVar = (i) obj;
                if (Intrinsics.areEqual((Object) this.f44221b, (Object) iVar.f44221b) && Intrinsics.areEqual((Object) this.f44222c, (Object) iVar.f44222c) && Intrinsics.areEqual((Object) this.f44223d, (Object) iVar.f44223d) && Intrinsics.areEqual((Object) this.f44224e, (Object) iVar.f44224e) && Intrinsics.areEqual((Object) this.f44225f, (Object) iVar.f44225f) && Intrinsics.areEqual((Object) this.g, (Object) iVar.g)) {
                    if (!(this.h == iVar.h) || !Intrinsics.areEqual((Object) this.i, (Object) iVar.i)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f44220a, false, 39457, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f44220a, false, 39457, new Class[0], Integer.TYPE)).intValue();
        }
        e eVar = this.f44221b;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        a aVar = this.f44222c;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        d dVar = this.f44223d;
        int hashCode3 = (hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        b bVar = this.f44224e;
        int hashCode4 = (hashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        g gVar = this.f44225f;
        int hashCode5 = (hashCode4 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        j jVar = this.g;
        int hashCode6 = jVar != null ? jVar.hashCode() : 0;
        long j = this.h;
        int i3 = (((hashCode5 + hashCode6) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        List<c> list = this.i;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i3 + i2;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f44220a, false, 39456, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f44220a, false, 39456, new Class[0], String.class);
        }
        return "UserCollectionResponse(poiCollectionStruct=" + this.f44221b + ", awemeCollectionStruct=" + this.f44222c + ", musicCollectionStruct=" + this.f44223d + ", challengeCollectionStruct=" + this.f44224e + ", stickerCollectionStruct=" + this.f44225f + ", willingCollectionStruct=" + this.g + ", count=" + this.h + ", collectionTabs=" + this.i + ")";
    }
}

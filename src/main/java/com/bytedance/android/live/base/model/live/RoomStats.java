package com.bytedance.android.live.base.model.live;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.android.live.base.model.c;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@Keep
public class RoomStats implements c {
    public static ChangeQuickRedirect changeQuickRedirect;
    final int INT_31 = 31;
    final int INT_32 = 32;
    @SerializedName("dou_plus_promotion")
    private String douPlusPromotion;
    @SerializedName("enter_count")
    private int enterCount;
    @SerializedName("follow_count")
    private int followCount;
    @SerializedName("gift_uv_count")
    private int giftUVCount;
    @SerializedName("id")
    private long id;
    @SerializedName("id_str")
    private String idStr;
    @SerializedName("money")
    private long money;
    @SerializedName("fan_ticket")
    private long ticket;
    @SerializedName("total_user")
    private int totalUser;
    @SerializedName("user_count_composition")
    public a userComposition;
    @SerializedName("watermelon")
    private int watermelon;

    public class a {
        @SerializedName("city")

        /* renamed from: a  reason: collision with root package name */
        public float f7716a;
        @SerializedName("video_detail")

        /* renamed from: b  reason: collision with root package name */
        public float f7717b;
        @SerializedName("my_follow")

        /* renamed from: c  reason: collision with root package name */
        public float f7718c;
    }

    public String getDouPlusPromotion() {
        return this.douPlusPromotion;
    }

    public int getEnterCount() {
        return this.enterCount;
    }

    public int getFollowCount() {
        return this.followCount;
    }

    public int getGiftUVCount() {
        return this.giftUVCount;
    }

    public long getId() {
        return this.id;
    }

    public String getIdStr() {
        return this.idStr;
    }

    public long getMoney() {
        return this.money;
    }

    public long getTicket() {
        return this.ticket;
    }

    public int getTotalUser() {
        return this.totalUser;
    }

    public int getWatermelon() {
        return this.watermelon;
    }

    public int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 58, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 58, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = ((((((((((((int) (this.id ^ (this.id >>> 32))) * 31) + ((int) (this.ticket ^ (this.ticket >>> 32)))) * 31) + ((int) (this.money ^ (this.money >>> 32)))) * 31) + this.totalUser) * 31) + this.followCount) * 31) + this.giftUVCount) * 31;
        if (this.idStr != null) {
            i = this.idStr.hashCode();
        }
        return i2 + i;
    }

    public void setDouPlusPromotion(String str) {
        this.douPlusPromotion = str;
    }

    public void setEnterCount(int i) {
        this.enterCount = i;
    }

    public void setFollowCount(int i) {
        this.followCount = i;
    }

    public void setGiftUVCount(int i) {
        this.giftUVCount = i;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setIdStr(String str) {
        this.idStr = str;
    }

    public void setMoney(long j) {
        this.money = j;
    }

    public void setTicket(long j) {
        this.ticket = j;
    }

    public void setTotalUser(int i) {
        this.totalUser = i;
    }

    public void setWatermelon(int i) {
        this.watermelon = i;
    }

    public static RoomStats from(@Nullable c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, null, changeQuickRedirect, true, 56, new Class[]{c.class}, RoomStats.class)) {
            return (RoomStats) PatchProxy.accessDispatch(new Object[]{cVar2}, null, changeQuickRedirect, true, 56, new Class[]{c.class}, RoomStats.class);
        } else if (cVar2 == null) {
            return null;
        } else {
            if (cVar2 instanceof RoomStats) {
                Gson a2 = com.bytedance.android.live.a.a();
                return (RoomStats) a2.fromJson(a2.toJson((Object) cVar2), RoomStats.class);
            }
            RoomStats roomStats = new RoomStats();
            roomStats.initWith(cVar2);
            return roomStats;
        }
    }

    private void initWith(@NonNull c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, changeQuickRedirect, false, 55, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, changeQuickRedirect, false, 55, new Class[]{c.class}, Void.TYPE);
            return;
        }
        this.id = cVar.getId();
        this.ticket = cVar.getTicket();
        this.money = cVar.getMoney();
        this.totalUser = cVar.getTotalUser();
        this.followCount = cVar.getFollowCount();
        this.giftUVCount = cVar.getGiftUVCount();
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 57, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 57, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            RoomStats roomStats = (RoomStats) obj;
            if (this.id != roomStats.id || this.ticket != roomStats.ticket || this.money != roomStats.money || this.followCount != roomStats.followCount || this.giftUVCount != roomStats.giftUVCount) {
                return false;
            }
            if (this.idStr == null ? roomStats.idStr != null : !this.idStr.equals(roomStats.idStr)) {
                return false;
            }
            if (this.totalUser == roomStats.totalUser) {
                return true;
            }
            return false;
        }
    }
}

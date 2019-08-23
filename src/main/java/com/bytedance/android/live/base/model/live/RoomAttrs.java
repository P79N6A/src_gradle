package com.bytedance.android.live.base.model.live;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.android.live.a;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@Keep
public class RoomAttrs implements a {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("admin_flag")
    private int adminFlag;
    @SerializedName("fanticket_this_room")
    public long currentRoomContribution;
    @SerializedName("rank_this_room")
    public int currentRoomRank;
    @SerializedName("rank")
    public int rank;
    @SerializedName("silence_flag")
    private int silenceFlag;

    public int getAdminFlag() {
        return this.adminFlag;
    }

    public int getRank() {
        return this.rank;
    }

    public int getSilenceFlag() {
        return this.silenceFlag;
    }

    public int hashCode() {
        return (((this.silenceFlag * 31) + this.adminFlag) * 31) + this.rank;
    }

    public void setAdminFlag(int i) {
        this.adminFlag = i;
    }

    public void setRank(int i) {
        this.rank = i;
    }

    public void setSilenceFlag(int i) {
        this.silenceFlag = i;
    }

    public static RoomAttrs from(@Nullable a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, changeQuickRedirect, true, 53, new Class[]{a.class}, RoomAttrs.class)) {
            return (RoomAttrs) PatchProxy.accessDispatch(new Object[]{aVar2}, null, changeQuickRedirect, true, 53, new Class[]{a.class}, RoomAttrs.class);
        } else if (aVar2 == null) {
            return null;
        } else {
            if (aVar2 instanceof RoomAttrs) {
                Gson a2 = a.a();
                return (RoomAttrs) a2.fromJson(a2.toJson((Object) aVar2), RoomAttrs.class);
            }
            RoomAttrs roomAttrs = new RoomAttrs();
            roomAttrs.initWith(aVar2);
            return roomAttrs;
        }
    }

    private void initWith(@NonNull a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, changeQuickRedirect, false, 52, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, changeQuickRedirect, false, 52, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.silenceFlag = aVar.getSilenceFlag();
        this.adminFlag = aVar.getAdminFlag();
        this.rank = aVar.getRank();
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 54, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 54, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            RoomAttrs roomAttrs = (RoomAttrs) obj;
            if (this.silenceFlag == roomAttrs.silenceFlag && this.adminFlag == roomAttrs.adminFlag && this.rank == roomAttrs.rank) {
                return true;
            }
            return false;
        }
    }
}

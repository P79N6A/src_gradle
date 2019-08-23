package com.bytedance.android.livesdkapi.ping;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class PingResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("mosaic_status")
    private int mosaicStatus;
    @SerializedName("next_ping")
    private long nextPingInterval;
    @SerializedName("room_id")
    private long roomId;
    @SerializedName("room_status")
    private int roomStatus;

    public int getMosaicStatus() {
        return this.mosaicStatus;
    }

    public long getNextPingInterval() {
        return this.nextPingInterval;
    }

    public long getRoomId() {
        return this.roomId;
    }

    public int getRoomStatus() {
        return this.roomStatus;
    }

    public void setMosaicStatus(int i) {
        this.mosaicStatus = i;
    }

    public void setRoomId(long j) {
        this.roomId = j;
    }

    public void setRoomStatus(int i) {
        this.roomStatus = i;
    }
}

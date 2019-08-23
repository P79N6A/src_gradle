package com.rocket.android.model;

public final class UnReadCountData {
    public final long conLastTime;
    public final long muteConLastTime;
    public final int muteUnReadConCount;
    public final long muteUunReadMgsCount;
    public final int unReadConCount;
    public final long unReadMgsCount;

    public final long getConLastTime() {
        return this.conLastTime;
    }

    public final long getMuteConLastTime() {
        return this.muteConLastTime;
    }

    public final int getMuteUnReadConCount() {
        return this.muteUnReadConCount;
    }

    public final long getMuteUunReadMgsCount() {
        return this.muteUunReadMgsCount;
    }

    public final int getUnReadConCount() {
        return this.unReadConCount;
    }

    public final long getUnReadMgsCount() {
        return this.unReadMgsCount;
    }

    public final String toString() {
        return "UnReadCountData{unReadConCount=" + this.unReadConCount + ", unReadMgsCount=" + this.unReadMgsCount + ", muteUnReadConCount=" + this.muteUnReadConCount + ", muteUunReadMgsCount=" + this.muteUunReadMgsCount + '}';
    }

    public UnReadCountData(int i, long j, int i2, long j2) {
        this(i, j, 0, i2, j2, 0);
    }

    public UnReadCountData(int i, long j, long j2, int i2, long j3, long j4) {
        this.unReadConCount = i;
        this.unReadMgsCount = j;
        this.conLastTime = j2;
        this.muteUnReadConCount = i2;
        this.muteUunReadMgsCount = j3;
        this.muteConLastTime = j4;
    }
}

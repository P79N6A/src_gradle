package com.ss.android.ugc.aweme.freeflowcard.data.b;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import java.io.Serializable;

@Entity(tableName = "tb_auto_play_setting")
public class b implements Serializable {
    @ColumnInfo(name = "change_type")
    public int changeType;
    @ColumnInfo(name = "day_open_reset_time")
    public long dayOpenResetTime;
    @PrimaryKey(autoGenerate = true)
    public int id;
    @ColumnInfo(name = "day_open")
    public boolean isDayOpen;
    @ColumnInfo(name = "is_open")
    public boolean isOpen;
    @ColumnInfo(name = "monthly_state")
    public int monthlyState;
    @ColumnInfo(name = "reset_time")
    public long resetTime;

    public b(boolean z, int i, long j, int i2, boolean z2, long j2) {
        this.isOpen = z;
        this.changeType = i;
        this.resetTime = j;
        this.monthlyState = i2;
        this.isDayOpen = z2;
        this.dayOpenResetTime = j2;
    }
}

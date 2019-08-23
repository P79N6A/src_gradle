package com.ss.android.ugc.aweme.freeflowcard.data.b;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import java.io.Serializable;

@Entity(tableName = "tb_user_click_event")
public class c implements Serializable {
    @ColumnInfo(name = "click_type")
    public int clickType;
    @PrimaryKey(autoGenerate = true)
    public int id;
    @ColumnInfo(name = "is_auto_play")
    public boolean isAutoPlay;
    @ColumnInfo(name = "time")
    public long time;

    public c(long j, int i, boolean z) {
        this.time = j;
        this.clickType = i;
        this.isAutoPlay = z;
    }
}

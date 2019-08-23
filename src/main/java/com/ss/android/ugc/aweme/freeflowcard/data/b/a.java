package com.ss.android.ugc.aweme.freeflowcard.data.b;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;

@Entity(tableName = "tb_app_start_mode")
public class a implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @PrimaryKey(autoGenerate = true)
    public int id;
    @ColumnInfo(name = "start_mode")
    public int mode;
    @ColumnInfo(name = "time")
    public long time;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46095, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46095, new Class[0], String.class);
        }
        return "AppStartMode{id=" + this.id + ", time=" + this.time + ", mode=" + this.mode + '}';
    }
}

package android.arch.persistence.room;

import android.support.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class RoomMasterTable {
    public static String createInsertQuery(String str) {
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"" + str + "\")";
    }
}

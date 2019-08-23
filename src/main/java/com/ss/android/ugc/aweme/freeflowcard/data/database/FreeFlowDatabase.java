package com.ss.android.ugc.aweme.freeflowcard.data.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import com.ss.android.ugc.aweme.freeflowcard.data.a.e;
import com.ss.android.ugc.aweme.freeflowcard.data.b.a;
import com.ss.android.ugc.aweme.freeflowcard.data.b.b;
import com.ss.android.ugc.aweme.freeflowcard.data.b.c;

@Database(entities = {b.class, c.class, a.class}, exportSchema = false, version = 1)
public abstract class FreeFlowDatabase extends RoomDatabase {
    public abstract com.ss.android.ugc.aweme.freeflowcard.data.a.c a();

    public abstract e b();

    public abstract com.ss.android.ugc.aweme.freeflowcard.data.a.a c();
}

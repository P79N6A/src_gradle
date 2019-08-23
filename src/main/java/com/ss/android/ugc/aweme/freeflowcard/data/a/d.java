package com.ss.android.ugc.aweme.freeflowcard.data.a;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.freeflowcard.data.b.b;
import java.util.ArrayList;
import java.util.List;

public final class d extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48620a;

    /* renamed from: b  reason: collision with root package name */
    private final RoomDatabase f48621b;

    /* renamed from: c  reason: collision with root package name */
    private final EntityInsertionAdapter f48622c;

    /* renamed from: d  reason: collision with root package name */
    private final SharedSQLiteStatement f48623d;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f48620a, false, 46076, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48620a, false, 46076, new Class[0], Void.TYPE);
            return;
        }
        SupportSQLiteStatement acquire = this.f48623d.acquire();
        this.f48621b.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f48621b.setTransactionSuccessful();
        } finally {
            this.f48621b.endTransaction();
            this.f48623d.release(acquire);
        }
    }

    public final List<b> a() {
        boolean z;
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, f48620a, false, 46077, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f48620a, false, 46077, new Class[0], List.class);
        }
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("select * from tb_auto_play_setting", 0);
        Cursor query = this.f48621b.query(acquire);
        try {
            int columnIndexOrThrow = query.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = query.getColumnIndexOrThrow("is_open");
            int columnIndexOrThrow3 = query.getColumnIndexOrThrow("change_type");
            int columnIndexOrThrow4 = query.getColumnIndexOrThrow("reset_time");
            int columnIndexOrThrow5 = query.getColumnIndexOrThrow("monthly_state");
            int columnIndexOrThrow6 = query.getColumnIndexOrThrow("day_open");
            int columnIndexOrThrow7 = query.getColumnIndexOrThrow("day_open_reset_time");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                if (query.getInt(columnIndexOrThrow2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i = query.getInt(columnIndexOrThrow3);
                long j = query.getLong(columnIndexOrThrow4);
                int i2 = query.getInt(columnIndexOrThrow5);
                if (query.getInt(columnIndexOrThrow6) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                b bVar = new b(z, i, j, i2, z2, query.getLong(columnIndexOrThrow7));
                bVar.id = query.getInt(columnIndexOrThrow);
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public d(RoomDatabase roomDatabase) {
        this.f48621b = roomDatabase;
        this.f48622c = new EntityInsertionAdapter<b>(roomDatabase) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48624a;

            public final String createQuery() {
                return "INSERT OR ABORT INTO `tb_auto_play_setting`(`id`,`is_open`,`change_type`,`reset_time`,`monthly_state`,`day_open`,`day_open_reset_time`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
            }

            public final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                SupportSQLiteStatement supportSQLiteStatement2 = supportSQLiteStatement;
                b bVar = (b) obj;
                if (PatchProxy.isSupport(new Object[]{supportSQLiteStatement2, bVar}, this, f48624a, false, 46078, new Class[]{SupportSQLiteStatement.class, b.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{supportSQLiteStatement2, bVar}, this, f48624a, false, 46078, new Class[]{SupportSQLiteStatement.class, b.class}, Void.TYPE);
                    return;
                }
                supportSQLiteStatement2.bindLong(1, (long) bVar.id);
                supportSQLiteStatement2.bindLong(2, bVar.isOpen ? 1 : 0);
                supportSQLiteStatement2.bindLong(3, (long) bVar.changeType);
                supportSQLiteStatement2.bindLong(4, bVar.resetTime);
                supportSQLiteStatement2.bindLong(5, (long) bVar.monthlyState);
                supportSQLiteStatement2.bindLong(6, bVar.isDayOpen ? 1 : 0);
                supportSQLiteStatement2.bindLong(7, bVar.dayOpenResetTime);
            }
        };
        this.f48623d = new SharedSQLiteStatement(roomDatabase) {
            public final String createQuery() {
                return "delete from tb_auto_play_setting";
            }
        };
    }

    public final void a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f48620a, false, 46075, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f48620a, false, 46075, new Class[]{b.class}, Void.TYPE);
            return;
        }
        this.f48621b.beginTransaction();
        try {
            this.f48622c.insert(bVar);
            this.f48621b.setTransactionSuccessful();
        } finally {
            this.f48621b.endTransaction();
        }
    }
}

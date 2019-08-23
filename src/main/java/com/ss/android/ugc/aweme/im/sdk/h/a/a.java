package com.ss.android.ugc.aweme.im.sdk.h.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.h.c.b;

public final class a extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51677a;

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        if (PatchProxy.isSupport(new Object[]{sQLiteDatabase2}, this, f51677a, false, 53234, new Class[]{SQLiteDatabase.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sQLiteDatabase2}, this, f51677a, false, 53234, new Class[]{SQLiteDatabase.class}, Void.TYPE);
            return;
        }
        sQLiteDatabase2.execSQL(com.ss.android.ugc.aweme.im.sdk.h.c.a.b());
        sQLiteDatabase2.execSQL(b.b());
    }

    public a(Context context, String str) {
        super(context, str, null, 14);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        int i3 = i;
        if (PatchProxy.isSupport(new Object[]{sQLiteDatabase2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f51677a, false, 53235, new Class[]{SQLiteDatabase.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sQLiteDatabase2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f51677a, false, 53235, new Class[]{SQLiteDatabase.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (i3 < 9) {
            sQLiteDatabase2.execSQL("drop table if exists SIMPLE_USER");
            sQLiteDatabase2.execSQL(com.ss.android.ugc.aweme.im.sdk.h.c.a.b());
            sQLiteDatabase2.execSQL("drop table if exists USER_EXTRA");
            sQLiteDatabase2.execSQL(b.b());
        } else {
            if (i3 == 9) {
                sQLiteDatabase2.execSQL("alter table " + com.ss.android.ugc.aweme.im.sdk.h.c.a.c() + " add column " + com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_SORT_WEIGHT.key + " " + com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_SORT_WEIGHT.type);
                sQLiteDatabase2.execSQL("alter table " + com.ss.android.ugc.aweme.im.sdk.h.c.a.c() + " add column " + com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_INITIAL_LETTER.key + " " + com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_INITIAL_LETTER.type);
            }
            if (i3 <= 10) {
                sQLiteDatabase2.execSQL("alter table " + com.ss.android.ugc.aweme.im.sdk.h.c.a.c() + " add column " + com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_SHORT_ID.key + " " + com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_SHORT_ID.type);
                sQLiteDatabase2.execSQL("alter table " + com.ss.android.ugc.aweme.im.sdk.h.c.a.c() + " add column " + com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_REMARK_PINYIN.key + " " + com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_REMARK_PINYIN.type);
                sQLiteDatabase2.execSQL("alter table " + com.ss.android.ugc.aweme.im.sdk.h.c.a.c() + " add column " + com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_REMARK_INITIAL.key + " " + com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_REMARK_INITIAL.type);
                sQLiteDatabase2.execSQL("alter table " + com.ss.android.ugc.aweme.im.sdk.h.c.a.c() + " add column " + com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_NICK_NAME_PINYIN.key + " " + com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_NICK_NAME_PINYIN.type);
                sQLiteDatabase2.execSQL("alter table " + com.ss.android.ugc.aweme.im.sdk.h.c.a.c() + " add column " + com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_NICK_NAME_INITIAL.key + " " + com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_NICK_NAME_INITIAL.type);
            }
            if (i3 <= 11) {
                sQLiteDatabase2.execSQL("alter table " + com.ss.android.ugc.aweme.im.sdk.h.c.a.c() + " add column " + com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_COMMERCE_USER_LEVEL.key + " " + com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_COMMERCE_USER_LEVEL.type);
            }
            if (i3 <= 12) {
                sQLiteDatabase2.execSQL("alter table " + com.ss.android.ugc.aweme.im.sdk.h.c.a.c() + " add column " + com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_SEC_UID.key + " " + com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_SEC_UID.type);
            }
            if (i3 <= 13) {
                sQLiteDatabase2.execSQL("alter table " + com.ss.android.ugc.aweme.im.sdk.h.c.a.c() + " add column " + com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_CONTACT_NAME.key + " " + com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_CONTACT_NAME.type);
                sQLiteDatabase2.execSQL("alter table " + com.ss.android.ugc.aweme.im.sdk.h.c.a.c() + " add column " + com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_CONTACT_NAME_PINYIN.key + " " + com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_CONTACT_NAME_PINYIN.type);
                sQLiteDatabase2.execSQL("alter table " + com.ss.android.ugc.aweme.im.sdk.h.c.a.c() + " add column " + com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_CONTACT_NAME_INITIAL.key + " " + com.ss.android.ugc.aweme.im.sdk.h.b.a.COLUMN_CONTACT_NAME_INITIAL.type);
            }
        }
    }
}

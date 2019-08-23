package com.ss.android.ugc.aweme.share.score;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;

public class a extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65262a;

    /* renamed from: d  reason: collision with root package name */
    private static a f65263d;

    /* renamed from: b  reason: collision with root package name */
    public SQLiteDatabase f65264b = getWritableDatabase();

    /* renamed from: c  reason: collision with root package name */
    public SQLiteDatabase f65265c = getReadableDatabase();

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private a() {
        super(k.h().getApplicationContext(), "DOUYIN_SCORE.db", null, 1);
    }

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f65262a, true, 73645, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f65262a, true, 73645, new Class[0], a.class);
        }
        if (f65263d == null) {
            synchronized (a.class) {
                if (f65263d == null) {
                    f65263d = new a();
                }
            }
        }
        return f65263d;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        if (PatchProxy.isSupport(new Object[]{sQLiteDatabase2}, this, f65262a, false, 73646, new Class[]{SQLiteDatabase.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sQLiteDatabase2}, this, f65262a, false, 73646, new Class[]{SQLiteDatabase.class}, Void.TYPE);
            return;
        }
        sQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS `app_open` (\n\t`open_time`\tINTEGER UNIQUE);");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{sQLiteDatabase, Integer.valueOf(i), Integer.valueOf(i2)}, this, f65262a, false, 73647, new Class[]{SQLiteDatabase.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sQLiteDatabase, Integer.valueOf(i), Integer.valueOf(i2)}, this, f65262a, false, 73647, new Class[]{SQLiteDatabase.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            super.onDowngrade(sQLiteDatabase, i, i2);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            com.bytedance.ies.dmt.ui.d.a.b((Context) k.a(), (int) C0906R.string.doi).a();
            if (PatchProxy.isSupport(new Object[]{0}, null, b.f65266a, true, 73648, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{0}, null, b.f65266a, true, 73648, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            String str = com.ss.android.ugc.aweme.framework.core.a.b().f3304b;
            if (TextUtils.isEmpty(str) || !str.startsWith("gray_") || !ToolUtils.isMainProcess(GlobalContext.getContext())) {
                System.exit(0);
                return;
            }
            throw new RuntimeException("Process killed, status is " + 0);
        }
    }
}

package com.ss.android.newmedia;

import android.content.Context;
import android.content.ContextWrapper;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;
import java.io.File;

public final class b extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2506a;

    public final File getCacheDir() {
        if (!PatchProxy.isSupport(new Object[0], this, f2506a, false, 18222, new Class[0], File.class)) {
            return super.getCacheDir();
        }
        return (File) PatchProxy.accessDispatch(new Object[0], this, f2506a, false, 18222, new Class[0], File.class);
    }

    public b(Context context) {
        super(context);
    }

    public final File getDir(String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, f2506a, false, 18223, new Class[]{String.class, Integer.TYPE}, File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, f2506a, false, 18223, new Class[]{String.class, Integer.TYPE}, File.class);
        }
        Logger.debug();
        String curProcessName = ToolUtils.getCurProcessName(this);
        if (!StringUtils.isEmpty(curProcessName) && !StringUtils.isEmpty(str) && curProcessName.endsWith(":ad")) {
            str2 = "ad_" + str2;
            Logger.debug();
        }
        return super.getDir(str2, i);
    }

    public final SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
        String str2 = str;
        SQLiteDatabase.CursorFactory cursorFactory2 = cursorFactory;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), cursorFactory2}, this, f2506a, false, 18224, new Class[]{String.class, Integer.TYPE, SQLiteDatabase.CursorFactory.class}, SQLiteDatabase.class)) {
            return (SQLiteDatabase) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), cursorFactory2}, this, f2506a, false, 18224, new Class[]{String.class, Integer.TYPE, SQLiteDatabase.CursorFactory.class}, SQLiteDatabase.class);
        }
        Logger.debug();
        String curProcessName = ToolUtils.getCurProcessName(this);
        if (!StringUtils.isEmpty(curProcessName) && !StringUtils.isEmpty(str) && curProcessName.endsWith(":ad")) {
            str2 = "ad_" + str2;
            Logger.debug();
        }
        return super.openOrCreateDatabase(str2, i, cursorFactory2);
    }
}

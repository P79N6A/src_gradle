package com.ss.android.ad.splash.core.e;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.support.annotation.VisibleForTesting;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ad.splash.core.a.a;
import java.util.LinkedList;
import java.util.List;

public final class e implements d {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    a f27690a;

    public final List<c> a() {
        boolean z;
        LinkedList linkedList = new LinkedList();
        Cursor a2 = this.f27690a.a().a("trackurl", null, null, null, null, null, null);
        while (a2.moveToNext()) {
            try {
                String string = a2.getString(a2.getColumnIndex("id"));
                String string2 = a2.getString(a2.getColumnIndex(PushConstants.WEB_URL));
                if (a2.getInt(a2.getColumnIndex("replaceholder")) > 0) {
                    z = true;
                } else {
                    z = false;
                }
                c cVar = new c(a2.getLong(a2.getColumnIndex("cid")), a2.getString(a2.getColumnIndex("log_extra")), string, string2, z, a2.getInt(a2.getColumnIndex("retry")), a2.getInt(a2.getColumnIndex("type")));
                linkedList.add(cVar);
            } catch (Exception unused) {
            } catch (Throwable th) {
                a2.close();
                throw th;
            }
        }
        a2.close();
        return linkedList;
    }

    public e(Context context) {
        this.f27690a = a.a(context.getApplicationContext());
    }

    public final void c(c cVar) {
        this.f27690a.a().a("trackurl", "id=?", new String[]{cVar.f27684a});
    }

    public final void b(c cVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", cVar.f27684a);
        contentValues.put(PushConstants.WEB_URL, cVar.f27685b);
        contentValues.put("replaceholder", Integer.valueOf(cVar.f27686c ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(cVar.f27687d));
        contentValues.put("type", Integer.valueOf(cVar.f27688e));
        contentValues.put("cid", Long.valueOf(cVar.f27689f));
        contentValues.put("log_extra", cVar.g);
        this.f27690a.a().a("trackurl", contentValues, "id=?", new String[]{cVar.f27684a});
    }

    public final void a(c cVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", cVar.f27684a);
        contentValues.put(PushConstants.WEB_URL, cVar.f27685b);
        contentValues.put("replaceholder", Integer.valueOf(cVar.f27686c ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(cVar.f27687d));
        contentValues.put("type", Integer.valueOf(cVar.f27688e));
        contentValues.put("cid", Long.valueOf(cVar.f27689f));
        contentValues.put("log_extra", cVar.g);
        this.f27690a.a().a("trackurl", (String) null, contentValues);
    }
}

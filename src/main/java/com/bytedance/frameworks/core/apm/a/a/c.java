package com.bytedance.frameworks.core.apm.a.a;

import android.content.ContentValues;
import com.bytedance.apm.f.e;
import com.bytedance.frameworks.core.apm.a.a;

public final class c extends a<e> {
    public final String d() {
        return "local_monitor_log";
    }

    public final String[] e() {
        return new String[]{"_id", "type", "version_id", "data", "delete_flag"};
    }

    public final /* synthetic */ Object a(a.b bVar) {
        e eVar = new e(bVar.a("_id"), bVar.c("type"), bVar.a("version_id"), bVar.c("data"));
        return eVar;
    }

    public final /* synthetic */ ContentValues a(Object obj) {
        e eVar = (e) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", eVar.g);
        contentValues.put("type2", eVar.h);
        contentValues.put("timestamp", Long.valueOf(eVar.k));
        contentValues.put("version_id", Long.valueOf(eVar.j));
        contentValues.put("data", eVar.i.toString());
        contentValues.put("is_sampled", Integer.valueOf(eVar.l ? 1 : 0));
        return contentValues;
    }
}

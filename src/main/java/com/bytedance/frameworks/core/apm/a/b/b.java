package com.bytedance.frameworks.core.apm.a.b;

import android.content.ContentValues;
import com.bytedance.apm.f.f;
import com.bytedance.apm.k.i;
import com.bytedance.frameworks.core.apm.a.a;
import java.util.List;

public final class b extends a<f> implements a.C0010a<f> {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f2129a = {"_id", "version_code", "version_name", "manifest_version_code", "update_version_code", "app_version"};

    public final boolean c() {
        return false;
    }

    public final String d() {
        return "local_monitor_version";
    }

    public final String[] e() {
        return f2129a;
    }

    public final synchronized f f() {
        List a2 = a(null, null, "_id DESC LIMIT 1", this);
        if (i.a(a2)) {
            return null;
        }
        return (f) a2.get(0);
    }

    public final /* synthetic */ ContentValues a(Object obj) {
        return b((f) obj);
    }

    public final synchronized long a(f fVar) {
        if (fVar == null) {
            return -1;
        }
        return a(b(fVar));
    }

    private static ContentValues b(f fVar) {
        if (fVar == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("version_code", fVar.f1990b);
        contentValues.put("version_name", fVar.f1991c);
        contentValues.put("manifest_version_code", fVar.f1992d);
        contentValues.put("update_version_code", fVar.f1993e);
        contentValues.put("app_version", fVar.f1994f);
        return contentValues;
    }

    public final /* synthetic */ Object a(a.b bVar) {
        f fVar = new f(bVar.a("_id"), bVar.c("version_code"), bVar.c("version_name"), bVar.c("manifest_version_code"), bVar.c("update_version_code"), bVar.c("app_version"));
        return fVar;
    }

    public final synchronized f b(long j) {
        String[] strArr = {String.valueOf(j)};
        List a2 = a(" _id = ?", strArr, "_id DESC" + " LIMIT 1", this);
        if (i.a(a2)) {
            return null;
        }
        return (f) a2.get(0);
    }
}

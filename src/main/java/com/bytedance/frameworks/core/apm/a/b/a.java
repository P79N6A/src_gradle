package com.bytedance.frameworks.core.apm.a.b;

import android.content.ContentValues;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.apm.d;
import com.bytedance.apm.f.b;
import com.bytedance.frameworks.core.apm.a.a;
import java.util.List;

public final class a extends com.bytedance.frameworks.core.apm.a.a<b> implements a.C0010a<b> {

    /* renamed from: a  reason: collision with root package name */
    private static String f19967a = "_id <= ? ";

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f19968b = {"_id", "front", "type", "timestamp", "accumulation", "version_id", "source", "status", "scene", "process", "main_process", "sid"};

    /* renamed from: c  reason: collision with root package name */
    private static String f19969c = "main_process = 1 AND delete_flag = 0 ";

    /* renamed from: d  reason: collision with root package name */
    private static String f19970d = "main_process = 0 AND delete_flag = 0 AND timestamp <= ? ";

    public final String d() {
        return "t_battery";
    }

    public final String[] e() {
        return f19968b;
    }

    public final synchronized void b(long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("delete_flag", 1);
        a(contentValues, f19967a, new String[]{String.valueOf(j)});
    }

    @Nullable
    public final /* synthetic */ ContentValues a(Object obj) {
        b bVar = (b) obj;
        if (bVar == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("front", Integer.valueOf(bVar.f18982b ? 1 : 0));
        contentValues.put("source", bVar.h);
        contentValues.put("type", bVar.f18984d);
        contentValues.put("timestamp", Long.valueOf(bVar.f18983c));
        contentValues.put("accumulation", Long.valueOf(bVar.g));
        contentValues.put("version_id", Long.valueOf(bVar.i));
        contentValues.put("status", Integer.valueOf(bVar.f18985e ? 1 : 0));
        contentValues.put("scene", bVar.f18986f);
        contentValues.put("main_process", Integer.valueOf(bVar.k ? 1 : 0));
        contentValues.put("process", bVar.j);
        contentValues.put("sid", bVar.l);
        return contentValues;
    }

    public final synchronized long a(b bVar) {
        if (bVar == null) {
            return -1;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("front", Integer.valueOf(bVar.f18982b ? 1 : 0));
            contentValues.put("source", bVar.h);
            contentValues.put("type", bVar.f18984d);
            contentValues.put("timestamp", Long.valueOf(bVar.f18983c));
            contentValues.put("accumulation", Long.valueOf(bVar.g));
            contentValues.put("version_id", Long.valueOf(bVar.i));
            contentValues.put("status", Integer.valueOf(bVar.f18985e ? 1 : 0));
            contentValues.put("scene", bVar.f18986f);
            contentValues.put("main_process", Integer.valueOf(bVar.k ? 1 : 0));
            contentValues.put("process", bVar.j);
            contentValues.put("sid", bVar.l);
            return a(contentValues);
        } catch (Exception e2) {
            d.a().a(e2, "BatteryTmpLogDao: saveLog");
            return -1;
        }
    }

    @NonNull
    public final /* synthetic */ Object a(a.b bVar) {
        boolean z;
        boolean z2;
        a.b bVar2 = bVar;
        long a2 = bVar2.a("_id");
        long a3 = bVar2.a("front");
        String c2 = bVar2.c("type");
        long a4 = bVar2.a("timestamp");
        long a5 = bVar2.a("accumulation");
        long a6 = bVar2.a("version_id");
        String c3 = bVar2.c("source");
        long a7 = bVar2.a("status");
        String c4 = bVar2.c("scene");
        int b2 = bVar2.b("main_process");
        String c5 = bVar2.c("process");
        long j = a2;
        if (a3 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (a7 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i = b2;
        b bVar3 = new b(z, a4, c2, z2, c4, a5, c3);
        bVar3.j = c5;
        bVar3.f18981a = j;
        bVar3.i = a6;
        boolean z3 = true;
        if (i != 1) {
            z3 = false;
        }
        bVar3.k = z3;
        b bVar4 = bVar3;
        bVar4.l = bVar.c("sid");
        return bVar4;
    }

    public final synchronized List<b> a(boolean z, long j) {
        List<b> list;
        if (z) {
            try {
                list = a(f19969c, null, "_id", this);
            } catch (Throwable th) {
                throw th;
            }
        } else {
            list = a(f19970d, new String[]{String.valueOf(j)}, "_id", this);
        }
        return list;
    }
}

package com.bytedance.im.core.b.a;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.im.core.b.a.a.d;
import com.bytedance.im.core.b.a.c.b;
import com.bytedance.im.core.d.a;
import java.util.ArrayList;
import java.util.List;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private static i f20938a;

    private i() {
    }

    public static i a() {
        if (f20938a == null) {
            synchronized (i.class) {
                if (f20938a == null) {
                    f20938a = new i();
                }
            }
        }
        return f20938a;
    }

    public static String b() {
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists attchment (");
        for (a aVar : a.values()) {
            sb.append(aVar.key);
            sb.append(" ");
            sb.append(aVar.type);
            sb.append(",");
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1) + ");";
    }

    public static List<a> a(String str) {
        b bVar;
        Exception e2;
        a aVar;
        ArrayList arrayList = new ArrayList();
        try {
            d.a();
            bVar = d.a("select * from attchment where " + a.COLUMN_UUID.key + "=?", new String[]{str});
            while (bVar.d()) {
                try {
                    if (bVar == null) {
                        aVar = null;
                    } else {
                        aVar = new a();
                        aVar.setMsgUuid(bVar.c(bVar.a(a.COLUMN_UUID.key)));
                        aVar.setLocalPath(bVar.c(bVar.a(a.COLUMN_LOCAL_URI.key)));
                        aVar.setRemoteUrl(bVar.c(bVar.a(a.COLUMN_REMOTE_URI.key)));
                        aVar.setIndex(bVar.a(bVar.a(a.COLUMN_INDEX.key)));
                        aVar.setLength(bVar.b(bVar.a(a.COLUMN_SIZE.key)));
                        aVar.setType(bVar.c(bVar.a(a.COLUMN_TYPE.key)));
                        aVar.setExtStr(bVar.c(bVar.a(a.COLUMN_EXT.key)));
                        aVar.setStatus(bVar.a(bVar.a(a.COLUMN_STATUS.key)));
                        aVar.setHash(bVar.c(bVar.a(a.COLUMN_HASH.key)));
                        aVar.setDisplayType(bVar.c(bVar.a(a.COLUMN_DISPLAY_TYPE.key)));
                        aVar.setMimeType(bVar.c(bVar.a(a.COLUMN_MIME_TYPE.key)));
                    }
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                } catch (Exception e3) {
                    e2 = e3;
                    try {
                        com.bytedance.im.core.b.e.d.a("get attachment ", (Throwable) e2);
                        com.bytedance.im.core.c.d.a(e2);
                        r.a(bVar);
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        r.a(bVar);
                        throw th;
                    }
                }
            }
        } catch (Exception e4) {
            e2 = e4;
            bVar = null;
            com.bytedance.im.core.b.e.d.a("get attachment ", (Throwable) e2);
            com.bytedance.im.core.c.d.a(e2);
            r.a(bVar);
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            bVar = null;
            r.a(bVar);
            throw th;
        }
        r.a(bVar);
        return arrayList;
    }

    public final boolean b(List<a> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for (a next : list) {
            if (next != null && !TextUtils.isEmpty(next.getMsgUuid())) {
                sb.append(",\"");
                sb.append(next.getMsgUuid());
                sb.append('\"');
            }
        }
        if (sb.toString().length() > 0) {
            String str = "(" + r1.substring(1) + ")";
            d.a();
            if (d.c("delete from attchment where " + a.COLUMN_UUID.key + " in " + str)) {
                return a(list);
            }
        }
        return false;
    }

    public static boolean a(List<a> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        int i = 0;
        for (a next : list) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(a.COLUMN_UUID.key, next.getMsgUuid());
            contentValues.put(a.COLUMN_LOCAL_URI.key, next.getLocalPath());
            contentValues.put(a.COLUMN_REMOTE_URI.key, next.getRemoteUrl());
            contentValues.put(a.COLUMN_HASH.key, next.getHash());
            contentValues.put(a.COLUMN_INDEX.key, Integer.valueOf(next.getIndex()));
            contentValues.put(a.COLUMN_EXT.key, next.getExtStr());
            contentValues.put(a.COLUMN_STATUS.key, Integer.valueOf(next.getStatus()));
            contentValues.put(a.COLUMN_TYPE.key, next.getType());
            contentValues.put(a.COLUMN_SIZE.key, Long.valueOf(next.getLength()));
            contentValues.put(a.COLUMN_DISPLAY_TYPE.key, next.getDisplayType());
            contentValues.put(a.COLUMN_MIME_TYPE.key, next.getMimeType());
            d.a();
            if (d.a("attchment", (String) null, contentValues) >= 0) {
                i++;
            }
        }
        if (i == list.size()) {
            return true;
        }
        return false;
    }
}

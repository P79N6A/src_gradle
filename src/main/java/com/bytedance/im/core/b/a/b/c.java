package com.bytedance.im.core.b.a.b;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.im.core.b.a.a.d;
import com.bytedance.im.core.d.a.a;
import java.util.List;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static c f20911a;

    private c() {
    }

    public static c a() {
        if (f20911a == null) {
            synchronized (c.class) {
                if (f20911a == null) {
                    f20911a = new c();
                }
            }
        }
        return f20911a;
    }

    public final boolean a(List<a> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        int i = 0;
        for (a a2 : list) {
            ContentValues a3 = a(a2);
            d.a();
            if (d.a("fts_entity", (String) null, a3) >= 0) {
                i++;
            }
        }
        if (i == list.size()) {
            return true;
        }
        return false;
    }

    private static ContentValues a(a aVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(a.COLUMN_ID.key, aVar.a());
        contentValues.put(a.COLUMN_TYPE.key, Integer.valueOf(aVar.f21252b));
        contentValues.put(a.COLUMN_CONVERSATION_ID.key, aVar.f21253c);
        contentValues.put(a.COLUMN_MESSAGE_UUID.key, aVar.f21254d);
        contentValues.put(a.COLUMN_USER_ID.key, aVar.f21255e);
        contentValues.put(a.COLUMN_ENTITY_ID.key, aVar.f21256f);
        contentValues.put(a.COLUMN_SEARCH_CONTENT.key, aVar.g);
        contentValues.put(a.COLUMN_EXTRA.key, aVar.h);
        return contentValues;
    }

    public static String a(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("create virtual table if not exists fts_entity using fts4 (");
        for (a aVar : a.values()) {
            sb.append(aVar.key);
            sb.append(" ");
            sb.append(aVar.type);
            sb.append(",");
        }
        sb.append(" notindexed=");
        sb.append(a.COLUMN_EXTRA.key);
        sb.append(",");
        if (z) {
            sb.append(" tokenize=mmicu,");
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1) + ");";
    }

    public static boolean b(List<a> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for (a next : list) {
            if (next != null && !TextUtils.isEmpty(next.a())) {
                sb.append(",\"");
                sb.append(next.a());
                sb.append('\"');
            }
        }
        if (sb.toString().length() <= 0) {
            return true;
        }
        String str = "(" + r4.substring(1) + ")";
        d.a();
        return d.c("delete from fts_entity where " + a.COLUMN_ID.key + " in " + str);
    }

    public static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return true;
        }
        d.a();
        return d.a("fts_entity", a.COLUMN_CONVERSATION_ID.key + "=? AND " + a.COLUMN_USER_ID.key + "=?", new String[]{str, str2});
    }

    public static boolean a(List<String> list, String str) {
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for (String next : list) {
            if (!TextUtils.isEmpty(next)) {
                sb.append(",\"");
                sb.append(next);
                sb.append('\"');
            }
        }
        if (sb.toString().length() <= 0) {
            return true;
        }
        String str2 = "(" + r4.substring(1) + ")";
        d.a();
        return d.c("delete from fts_entity where " + str + " in " + str2);
    }

    public static boolean a(List<String> list, String str, int i) {
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for (String next : list) {
            if (!TextUtils.isEmpty(next)) {
                sb.append(",\"");
                sb.append(next);
                sb.append('\"');
            }
        }
        if (sb.toString().length() <= 0) {
            return true;
        }
        String str2 = "(" + r4.substring(1) + ")";
        d.a();
        return d.c("delete from fts_entity where " + str + " in " + str2 + " and " + a.COLUMN_TYPE.key + " =" + i);
    }
}

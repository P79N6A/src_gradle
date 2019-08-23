package com.bytedance.im.core.b.a;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.im.core.b.a.a.d;
import com.bytedance.im.core.b.a.b.a;
import com.bytedance.im.core.b.a.b.b;
import com.bytedance.im.core.b.a.b.c;
import com.bytedance.im.core.b.e.g;
import com.bytedance.im.core.d.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private static l f20941a;

    private l() {
    }

    public static boolean a(String str, int i, List<m> list) {
        if (TextUtils.isEmpty(str) || list == null) {
            return false;
        }
        ArrayList<m> arrayList = new ArrayList<>();
        d.a();
        d.a("IMConversationMemberDao.insertOrUpdateMember(String,List)");
        for (m next : list) {
            if (next != null) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(g.COLUMN_SORT_ORDER.key, Long.valueOf(next.getSortOrder()));
                contentValues.put(g.COLUMN_ROLE.key, Integer.valueOf(next.getRole()));
                contentValues.put(g.COLUMN_ALIAS.key, next.getAlias());
                contentValues.put(g.COLUMN_SEC_UID.key, next.getSecUid());
                d.a();
                if (d.a("participant", contentValues, g.COLUMN_USER_ID.key + "=? AND " + g.COLUMN_CONVERSATION_ID.key + "=?", new String[]{String.valueOf(next.getUid()), str}) <= 0) {
                    next.setConversationType(i);
                    arrayList.add(next);
                } else {
                    b.a().a(false, (Object) next);
                }
            }
        }
        for (m mVar : arrayList) {
            ContentValues a2 = a(mVar);
            d.a();
            if (d.a("participant", (String) null, a2) > 0) {
                b.a().a(true, (Object) mVar);
            }
        }
        d.a();
        d.b("IMConversationMemberDao.insertOrUpdateMember(String,List)");
        g.a().h(list);
        return true;
    }

    public static l a() {
        if (f20941a == null) {
            synchronized (l.class) {
                if (f20941a == null) {
                    f20941a = new l();
                }
            }
        }
        return f20941a;
    }

    public static String b() {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS participant(");
        for (g gVar : g.values()) {
            sb.append(gVar.key);
            sb.append(" ");
            sb.append(gVar.type);
            sb.append(",");
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1) + ");";
    }

    public static boolean d(String str) {
        d.a();
        boolean a2 = d.a("participant", g.COLUMN_CONVERSATION_ID.key + "=?", new String[]{str});
        if (a2) {
            b.a().a(str, a.COLUMN_CONVERSATION_ID.key, 3);
        }
        return a2;
    }

    private static ContentValues a(m mVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(g.COLUMN_USER_ID.key, Long.valueOf(mVar.getUid()));
        contentValues.put(g.COLUMN_ALIAS.key, mVar.getAlias());
        contentValues.put(g.COLUMN_CONVERSATION_ID.key, mVar.getConversationId());
        contentValues.put(g.COLUMN_ROLE.key, Integer.valueOf(mVar.getRole()));
        contentValues.put(g.COLUMN_SORT_ORDER.key, Long.valueOf(mVar.getSortOrder()));
        contentValues.put(g.COLUMN_SEC_UID.key, mVar.getSecUid());
        return contentValues;
    }

    private static m a(com.bytedance.im.core.b.a.c.b bVar) {
        m mVar = new m();
        mVar.setAlias(bVar.c(bVar.a(g.COLUMN_ALIAS.key)));
        mVar.setConversationId(bVar.c(bVar.a(g.COLUMN_CONVERSATION_ID.key)));
        mVar.setRole(bVar.a(bVar.a(g.COLUMN_ROLE.key)));
        mVar.setSortOrder((long) bVar.a(bVar.a(g.COLUMN_SORT_ORDER.key)));
        mVar.setUid(bVar.b(bVar.a(g.COLUMN_USER_ID.key)));
        mVar.setSecUid(bVar.c(bVar.a(g.COLUMN_SEC_UID.key)));
        return mVar;
    }

    public static long c(String str) {
        String str2 = "select * from participant where " + g.COLUMN_CONVERSATION_ID.key + "=? order by " + g.COLUMN_SORT_ORDER.key + " desc limit 1";
        com.bytedance.im.core.b.a.c.b bVar = null;
        try {
            d.a();
            com.bytedance.im.core.b.a.c.b a2 = d.a(str2, new String[]{str});
            if (a2 != null) {
                try {
                    if (a2.c()) {
                        long b2 = a2.b(a2.a(g.COLUMN_SORT_ORDER.key));
                        r.a(a2);
                        return b2;
                    }
                } catch (Exception e2) {
                    e = e2;
                    bVar = a2;
                    try {
                        com.bytedance.im.core.b.e.d.a("removeMemberOverOrder", (Throwable) e);
                        com.bytedance.im.core.c.d.a(e);
                        r.a(bVar);
                        return 0;
                    } catch (Throwable th) {
                        th = th;
                        r.a(bVar);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bVar = a2;
                    r.a(bVar);
                    throw th;
                }
            }
            r.a(a2);
        } catch (Exception e3) {
            e = e3;
            com.bytedance.im.core.b.e.d.a("removeMemberOverOrder", (Throwable) e);
            com.bytedance.im.core.c.d.a(e);
            r.a(bVar);
            return 0;
        }
        return 0;
    }

    public static List<m> b(String str) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        com.bytedance.im.core.b.a.c.b bVar = null;
        try {
            d.a();
            com.bytedance.im.core.b.a.c.b a2 = d.a("select * from participant where " + g.COLUMN_CONVERSATION_ID.key + "=? order by " + g.COLUMN_SORT_ORDER.key, new String[]{str});
            while (a2.d()) {
                try {
                    arrayList.add(a(a2));
                } catch (Exception e2) {
                    Exception exc = e2;
                    bVar = a2;
                    e = exc;
                    try {
                        com.bytedance.im.core.b.e.d.a("getMemberList", (Throwable) e);
                        com.bytedance.im.core.c.d.a(e);
                        r.a(bVar);
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        r.a(bVar);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bVar = a2;
                    r.a(bVar);
                    throw th;
                }
            }
            r.a(a2);
        } catch (Exception e3) {
            e = e3;
            com.bytedance.im.core.b.e.d.a("getMemberList", (Throwable) e);
            com.bytedance.im.core.c.d.a(e);
            r.a(bVar);
            return arrayList;
        }
        return arrayList;
    }

    public static List<Long> a(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        com.bytedance.im.core.b.a.c.b bVar = null;
        try {
            d.a();
            com.bytedance.im.core.b.a.c.b a2 = d.a("select * from participant where " + g.COLUMN_CONVERSATION_ID.key + "=? order by " + g.COLUMN_SORT_ORDER.key, new String[]{str});
            int i = -1;
            while (a2.d()) {
                try {
                    if (i < 0) {
                        i = a2.a(g.COLUMN_USER_ID.key);
                    }
                    arrayList.add(Long.valueOf(a2.b(i)));
                } catch (Exception e2) {
                    Exception exc = e2;
                    bVar = a2;
                    e = exc;
                    try {
                        com.bytedance.im.core.b.e.d.a("getMemberId", (Throwable) e);
                        com.bytedance.im.core.c.d.a(e);
                        r.a(bVar);
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        r.a(bVar);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bVar = a2;
                    r.a(bVar);
                    throw th;
                }
            }
            r.a(a2);
        } catch (Exception e3) {
            e = e3;
            com.bytedance.im.core.b.e.d.a("getMemberId", (Throwable) e);
            com.bytedance.im.core.c.d.a(e);
            r.a(bVar);
            return arrayList;
        }
        return arrayList;
    }

    public static int b(String str, List<Long> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return 0;
        }
        d.a();
        d.a("IMConversationMemberDao.removeMember(String,List)");
        int i = 0;
        for (Long next : list) {
            d.a();
            if (d.a("participant", g.COLUMN_CONVERSATION_ID.key + "=? AND " + g.COLUMN_USER_ID.key + "=?", new String[]{str, String.valueOf(next)})) {
                i++;
                c.a();
                c.a(str, String.valueOf(next));
            }
        }
        d.a();
        d.b("IMConversationMemberDao.removeMember(String,List)");
        return i;
    }

    public static int c(String str, List<Long> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return 0;
        }
        int i = 0;
        for (Long next : list) {
            d.a();
            if (d.a("participant", g.COLUMN_CONVERSATION_ID.key + "=? AND " + g.COLUMN_USER_ID.key + "=?", new String[]{str, String.valueOf(next)})) {
                i++;
                c.a();
                c.a(str, String.valueOf(next));
            }
        }
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.bytedance.im.core.b.a.c.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.bytedance.im.core.b.a.c.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.bytedance.im.core.d.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.bytedance.im.core.b.a.c.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.bytedance.im.core.b.a.c.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.bytedance.im.core.b.a.c.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.bytedance.im.core.b.a.c.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.bytedance.im.core.b.a.c.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: com.bytedance.im.core.b.a.c.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: com.bytedance.im.core.b.a.c.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: com.bytedance.im.core.d.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.bytedance.im.core.b.a.c.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: com.bytedance.im.core.d.m} */
    /* JADX WARNING: type inference failed for: r6v8, types: [com.bytedance.im.core.d.m] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.im.core.d.m a(java.lang.String r5, java.lang.String r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 != 0) goto L_0x0097
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x000f
            goto L_0x0097
        L_0x000f:
            com.bytedance.im.core.b.a.a.d.a()     // Catch:{ Exception -> 0x0085 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0085 }
            java.lang.String r2 = "select * from participant where "
            r0.<init>(r2)     // Catch:{ Exception -> 0x0085 }
            com.bytedance.im.core.b.a.g r2 = com.bytedance.im.core.b.a.g.COLUMN_CONVERSATION_ID     // Catch:{ Exception -> 0x0085 }
            java.lang.String r2 = r2.key     // Catch:{ Exception -> 0x0085 }
            r0.append(r2)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r2 = "=?  and "
            r0.append(r2)     // Catch:{ Exception -> 0x0085 }
            com.bytedance.im.core.b.a.g r2 = com.bytedance.im.core.b.a.g.COLUMN_USER_ID     // Catch:{ Exception -> 0x0085 }
            java.lang.String r2 = r2.key     // Catch:{ Exception -> 0x0085 }
            r0.append(r2)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r2 = "=? and "
            r0.append(r2)     // Catch:{ Exception -> 0x0085 }
            com.bytedance.im.core.b.a.g r2 = com.bytedance.im.core.b.a.g.COLUMN_ROLE     // Catch:{ Exception -> 0x0085 }
            java.lang.String r2 = r2.key     // Catch:{ Exception -> 0x0085 }
            r0.append(r2)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r2 = " in ("
            r0.append(r2)     // Catch:{ Exception -> 0x0085 }
            com.bytedance.im.core.proto.GroupRole r2 = com.bytedance.im.core.proto.GroupRole.OWNER     // Catch:{ Exception -> 0x0085 }
            int r2 = r2.getValue()     // Catch:{ Exception -> 0x0085 }
            r0.append(r2)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r2 = ","
            r0.append(r2)     // Catch:{ Exception -> 0x0085 }
            com.bytedance.im.core.proto.GroupRole r2 = com.bytedance.im.core.proto.GroupRole.MANAGER     // Catch:{ Exception -> 0x0085 }
            int r2 = r2.getValue()     // Catch:{ Exception -> 0x0085 }
            r0.append(r2)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r2 = ") "
            r0.append(r2)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0085 }
            r2 = 2
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ Exception -> 0x0085 }
            r3 = 0
            r2[r3] = r5     // Catch:{ Exception -> 0x0085 }
            r5 = 1
            r2[r5] = r6     // Catch:{ Exception -> 0x0085 }
            com.bytedance.im.core.b.a.c.b r5 = com.bytedance.im.core.b.a.a.d.a(r0, r2)     // Catch:{ Exception -> 0x0085 }
        L_0x006a:
            boolean r6 = r5.d()     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            if (r6 == 0) goto L_0x0076
            com.bytedance.im.core.d.m r6 = a((com.bytedance.im.core.b.a.c.b) r5)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            r1 = r6
            goto L_0x006a
        L_0x0076:
            com.bytedance.im.core.b.a.r.a((com.bytedance.im.core.b.a.c.b) r5)
            r5 = r1
            goto L_0x0092
        L_0x007b:
            r6 = move-exception
            r1 = r5
            goto L_0x0093
        L_0x007e:
            r6 = move-exception
            r4 = r1
            r1 = r5
            r5 = r4
            goto L_0x0087
        L_0x0083:
            r6 = move-exception
            goto L_0x0093
        L_0x0085:
            r6 = move-exception
            r5 = r1
        L_0x0087:
            java.lang.String r0 = "queryMember"
            com.bytedance.im.core.b.e.d.a((java.lang.String) r0, (java.lang.Throwable) r6)     // Catch:{ all -> 0x0083 }
            com.bytedance.im.core.c.d.a(r6)     // Catch:{ all -> 0x0083 }
            com.bytedance.im.core.b.a.r.a((com.bytedance.im.core.b.a.c.b) r1)
        L_0x0092:
            return r5
        L_0x0093:
            com.bytedance.im.core.b.a.r.a((com.bytedance.im.core.b.a.c.b) r1)
            throw r6
        L_0x0097:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.b.a.l.a(java.lang.String, java.lang.String):com.bytedance.im.core.d.m");
    }

    public static List<m> a(String str, List<Long> list) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        com.bytedance.im.core.b.a.c.b bVar = null;
        try {
            d.a();
            com.bytedance.im.core.b.a.c.b a2 = d.a("select * from participant where " + g.COLUMN_CONVERSATION_ID.key + "=? and " + g.COLUMN_USER_ID.key + " in (" + q.a(list, ",") + ") order by " + g.COLUMN_SORT_ORDER.key, new String[]{str});
            while (a2.d()) {
                try {
                    arrayList.add(a(a2));
                } catch (Exception e2) {
                    e = e2;
                    bVar = a2;
                    try {
                        com.bytedance.im.core.b.e.d.a("getMemberList", (Throwable) e);
                        com.bytedance.im.core.c.d.a(e);
                        r.a(bVar);
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        r.a(bVar);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bVar = a2;
                    r.a(bVar);
                    throw th;
                }
            }
            r.a(a2);
        } catch (Exception e3) {
            e = e3;
            com.bytedance.im.core.b.e.d.a("getMemberList", (Throwable) e);
            com.bytedance.im.core.c.d.a(e);
            r.a(bVar);
            return arrayList;
        }
        return arrayList;
    }

    public static boolean b(String str, int i, List<m> list) {
        if (TextUtils.isEmpty(str) || list == null) {
            return false;
        }
        ArrayList<m> arrayList = new ArrayList<>();
        for (m next : list) {
            if (next != null) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(g.COLUMN_SORT_ORDER.key, Long.valueOf(next.getSortOrder()));
                contentValues.put(g.COLUMN_ROLE.key, Integer.valueOf(next.getRole()));
                contentValues.put(g.COLUMN_ALIAS.key, next.getAlias());
                contentValues.put(g.COLUMN_SEC_UID.key, next.getSecUid());
                d.a();
                if (d.a("participant", contentValues, g.COLUMN_USER_ID.key + "=? AND " + g.COLUMN_CONVERSATION_ID.key + "=?", new String[]{String.valueOf(next.getUid()), str}) <= 0) {
                    next.setConversationType(i);
                    arrayList.add(next);
                } else {
                    b.a().a(false, (Object) next);
                }
            }
        }
        for (m mVar : arrayList) {
            ContentValues a2 = a(mVar);
            d.a();
            if (d.a("participant", (String) null, a2) > 0) {
                b.a().a(true, (Object) mVar);
            }
        }
        g.a().h(list);
        return true;
    }
}

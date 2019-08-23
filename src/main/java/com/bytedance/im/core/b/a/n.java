package com.bytedance.im.core.b.a;

import android.text.TextUtils;
import com.bytedance.im.core.a.c;
import com.bytedance.im.core.b.a.a.d;
import java.util.List;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static n f20943a;

    private n() {
    }

    public static n a() {
        if (f20943a == null) {
            synchronized (n.class) {
                if (f20943a == null) {
                    f20943a = new n();
                }
            }
        }
        return f20943a;
    }

    public static String b() {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS mention(");
        for (e eVar : e.values()) {
            sb.append(eVar.key);
            sb.append(" ");
            sb.append(eVar.type);
            sb.append(",");
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1) + ");";
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        d.a();
        return d.a("mention", e.COLUMN_UUID.key + "=?", new String[]{str});
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        d.a();
        return d.a("mention", e.COLUMN_CONVERSATION_ID.key + "=?", new String[]{str});
    }

    public final boolean a(com.bytedance.im.core.d.n nVar) {
        Boolean bool;
        boolean z = true;
        if (nVar.isSelf()) {
            return true;
        }
        List<Long> mentionIds = nVar.getMentionIds();
        if (mentionIds == null || mentionIds.isEmpty() || (!mentionIds.contains(Long.valueOf(c.a().f20879c.a())) && !mentionIds.contains(0L))) {
            return true;
        }
        Boolean bool2 = Boolean.FALSE;
        com.bytedance.im.core.b.a.c.d dVar = null;
        try {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            sb.append(" replace into mention(");
            for (e eVar : e.values()) {
                sb.append(eVar.key);
                sb.append(",");
                sb2.append("?,");
            }
            String sb3 = sb.toString();
            String sb4 = sb2.toString();
            d.a();
            com.bytedance.im.core.b.a.c.d d2 = d.d(sb3.substring(0, sb3.length() - 1) + ") values (" + sb4.substring(0, sb4.length() - 1) + ");");
            if (!(d2 == null || nVar == null)) {
                try {
                    d2.a(e.COLUMN_UUID.ordinal() + 1, r.a(nVar.getUuid()));
                    d2.a(e.COLUMN_CONVERSATION_ID.ordinal() + 1, r.a(nVar.getConversationId()));
                    d2.a(e.COLUMN_IDS_STR.ordinal() + 1, q.a(mentionIds, ","));
                    d2.a(e.COLUMN_SENDER_ID.ordinal() + 1, nVar.getSender());
                    d2.a(e.COLUMN_CREATED_TIME.ordinal() + 1, nVar.getCreatedAt());
                } catch (Exception e2) {
                    e = e2;
                    dVar = d2;
                    try {
                        com.bytedance.im.core.b.e.d.a("IMMentionDao.upsert", (Throwable) e);
                        com.bytedance.im.core.c.d.a(e);
                        r.a(dVar);
                        bool = bool2;
                        return bool.booleanValue();
                    } catch (Throwable th) {
                        th = th;
                        r.a(dVar);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    dVar = d2;
                    r.a(dVar);
                    throw th;
                }
            }
            if (d2.a() <= 0) {
                z = false;
            }
            bool = Boolean.valueOf(z);
            r.a(d2);
        } catch (Exception e3) {
            e = e3;
            com.bytedance.im.core.b.e.d.a("IMMentionDao.upsert", (Throwable) e);
            com.bytedance.im.core.c.d.a(e);
            r.a(dVar);
            bool = bool2;
            return bool.booleanValue();
        }
        return bool.booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.bytedance.im.core.d.n> a(java.lang.String r5, long r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "select * from mention where "
            r2.<init>(r3)
            com.bytedance.im.core.b.a.e r3 = com.bytedance.im.core.b.a.e.COLUMN_CONVERSATION_ID
            java.lang.String r3 = r3.key
            r2.append(r3)
            java.lang.String r3 = "=? order by "
            r2.append(r3)
            com.bytedance.im.core.b.a.e r3 = com.bytedance.im.core.b.a.e.COLUMN_CREATED_TIME
            java.lang.String r3 = r3.key
            r2.append(r3)
            java.lang.String r3 = " desc"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.bytedance.im.core.b.a.a.d.a()     // Catch:{ Exception -> 0x0058, all -> 0x0055 }
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ Exception -> 0x0058, all -> 0x0055 }
            r4 = 0
            r3[r4] = r5     // Catch:{ Exception -> 0x0058, all -> 0x0055 }
            com.bytedance.im.core.b.a.c.b r5 = com.bytedance.im.core.b.a.a.d.a(r2, r3)     // Catch:{ Exception -> 0x0058, all -> 0x0055 }
        L_0x003d:
            boolean r2 = r5.d()     // Catch:{ Exception -> 0x0053 }
            if (r2 == 0) goto L_0x0062
            com.bytedance.im.core.b.a.e r2 = com.bytedance.im.core.b.a.e.COLUMN_UUID     // Catch:{ Exception -> 0x0053 }
            java.lang.String r2 = r2.key     // Catch:{ Exception -> 0x0053 }
            int r2 = r5.a((java.lang.String) r2)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r2 = r5.c(r2)     // Catch:{ Exception -> 0x0053 }
            r0.add(r2)     // Catch:{ Exception -> 0x0053 }
            goto L_0x003d
        L_0x0053:
            r2 = move-exception
            goto L_0x005a
        L_0x0055:
            r6 = move-exception
            r5 = r1
            goto L_0x0075
        L_0x0058:
            r2 = move-exception
            r5 = r1
        L_0x005a:
            java.lang.String r3 = "getMentionSender"
            com.bytedance.im.core.b.e.d.a((java.lang.String) r3, (java.lang.Throwable) r2)     // Catch:{ all -> 0x0074 }
            com.bytedance.im.core.c.d.a(r2)     // Catch:{ all -> 0x0074 }
        L_0x0062:
            com.bytedance.im.core.b.a.r.a((com.bytedance.im.core.b.a.c.b) r5)
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L_0x006c
            return r1
        L_0x006c:
            com.bytedance.im.core.b.a.o.a()
            java.util.List r5 = com.bytedance.im.core.b.a.o.a((java.util.List<java.lang.String>) r0, (long) r6)
            return r5
        L_0x0074:
            r6 = move-exception
        L_0x0075:
            com.bytedance.im.core.b.a.r.a((com.bytedance.im.core.b.a.c.b) r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.b.a.n.a(java.lang.String, long):java.util.List");
    }
}

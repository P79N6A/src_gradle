package com.bytedance.im.core.b.a;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.im.core.b.a.a.d;
import com.bytedance.im.core.b.a.b.a;
import com.bytedance.im.core.d.b;
import java.util.ArrayList;
import java.util.List;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private static k f20940a;

    private k() {
    }

    public static k a() {
        if (f20940a == null) {
            synchronized (k.class) {
                if (f20940a == null) {
                    f20940a = new k();
                }
            }
        }
        return f20940a;
    }

    public static List<b> b() {
        ArrayList arrayList = new ArrayList();
        com.bytedance.im.core.b.a.c.b bVar = null;
        try {
            d.a();
            com.bytedance.im.core.b.a.c.b a2 = d.a("select * from conversation_list order by " + b.COLUMN_UPDATE_TIME.key + " desc;", null);
            if (a2 != null) {
                while (a2.d()) {
                    try {
                        arrayList.add(a(a2));
                    } catch (Exception e2) {
                        com.bytedance.im.core.b.a.c.b bVar2 = a2;
                        e = e2;
                        bVar = bVar2;
                        try {
                            com.bytedance.im.core.b.e.d.d("getAllConversation " + e);
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
            }
            r.a(a2);
        } catch (Exception e3) {
            e = e3;
            com.bytedance.im.core.b.e.d.d("getAllConversation " + e);
            com.bytedance.im.core.c.d.a(e);
            r.a(bVar);
            return arrayList;
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.bytedance.im.core.d.b} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.bytedance.im.core.b.a.c.b] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.im.core.d.b a(java.lang.String r4) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            com.bytedance.im.core.b.a.a.d.a()     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.lang.String r2 = "select * from conversation_list where "
            r0.<init>(r2)     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            com.bytedance.im.core.b.a.b r2 = com.bytedance.im.core.b.a.b.COLUMN_ID     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.lang.String r2 = r2.key     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            r0.append(r2)     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.lang.String r2 = "=?"
            r0.append(r2)     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            r3 = 0
            r2[r3] = r4     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            com.bytedance.im.core.b.a.c.b r4 = com.bytedance.im.core.b.a.a.d.a(r0, r2)     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            boolean r0 = r4.c()     // Catch:{ Exception -> 0x0038 }
            if (r0 == 0) goto L_0x0046
            com.bytedance.im.core.d.b r0 = a((com.bytedance.im.core.b.a.c.b) r4)     // Catch:{ Exception -> 0x0038 }
            r1 = r0
            goto L_0x0046
        L_0x0038:
            r0 = move-exception
            goto L_0x003e
        L_0x003a:
            r0 = move-exception
            goto L_0x004c
        L_0x003c:
            r0 = move-exception
            r4 = r1
        L_0x003e:
            java.lang.String r2 = "getConversation "
            com.bytedance.im.core.b.e.d.a((java.lang.String) r2, (java.lang.Throwable) r0)     // Catch:{ all -> 0x004a }
            com.bytedance.im.core.c.d.a(r0)     // Catch:{ all -> 0x004a }
        L_0x0046:
            com.bytedance.im.core.b.a.r.a((com.bytedance.im.core.b.a.c.b) r4)
            return r1
        L_0x004a:
            r0 = move-exception
            r1 = r4
        L_0x004c:
            com.bytedance.im.core.b.a.r.a((com.bytedance.im.core.b.a.c.b) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.b.a.k.a(java.lang.String):com.bytedance.im.core.d.b");
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        d.a();
        boolean a2 = d.a("conversation_list", b.COLUMN_ID.key + "=?", new String[]{str});
        if (a2) {
            o.a();
            o.b(str);
            m.a();
            m.b(str);
            j.a();
            j.b(str);
            l.a();
            l.d(str);
            p.a();
            if (!TextUtils.isEmpty(str)) {
                d.a();
                d.a("msg_property", h.COLUMN_CONVERSATION_ID.key + "=?", new String[]{str});
            }
            com.bytedance.im.core.b.a.b.b.a().a(str, a.COLUMN_CONVERSATION_ID.key);
        }
        return a2;
    }

    public static List<b> a(int i) {
        ArrayList arrayList = new ArrayList();
        com.bytedance.im.core.b.a.c.b bVar = null;
        try {
            d.a();
            com.bytedance.im.core.b.a.c.b a2 = d.a("select * from conversation_list order by " + b.COLUMN_UPDATE_TIME.key + " desc limit " + i + ";", null);
            if (a2 != null) {
                while (a2.d()) {
                    try {
                        arrayList.add(a(a2));
                    } catch (Exception e2) {
                        Exception exc = e2;
                        bVar = a2;
                        e = exc;
                        try {
                            com.bytedance.im.core.b.e.d.d("getConversationLimit " + e);
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
            }
            r.a(a2);
        } catch (Exception e3) {
            e = e3;
            com.bytedance.im.core.b.e.d.d("getConversationLimit " + e);
            com.bytedance.im.core.c.d.a(e);
            r.a(bVar);
            return arrayList;
        }
        return arrayList;
    }

    public static boolean b(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        com.bytedance.im.core.b.a.c.b bVar = null;
        try {
            d.a();
            com.bytedance.im.core.b.a.c.b a2 = d.a("select * from conversation_list where " + b.COLUMN_ID.key + "=?", new String[]{str});
            try {
                if (a2.b() > 0) {
                    z = true;
                }
                r.a(a2);
                return z;
            } catch (Exception e2) {
                Exception exc = e2;
                bVar = a2;
                e = exc;
                try {
                    com.bytedance.im.core.b.e.d.a("getConversation ", (Throwable) e);
                    com.bytedance.im.core.c.d.a(e);
                    r.a(bVar);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    r.a(bVar);
                    throw th;
                }
            } catch (Throwable th2) {
                Throwable th3 = th2;
                bVar = a2;
                th = th3;
                r.a(bVar);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            com.bytedance.im.core.b.e.d.a("getConversation ", (Throwable) e);
            com.bytedance.im.core.c.d.a(e);
            r.a(bVar);
            return false;
        }
    }

    public static boolean c(b bVar) {
        boolean z;
        if (bVar == null || TextUtils.isEmpty(bVar.getConversationId())) {
            return false;
        }
        try {
            d.a();
            z = d.a("conversation_list", b.COLUMN_ID.key + "=?", new String[]{bVar.getConversationId()});
            if (z) {
                try {
                    d.a();
                    d.a("msg", f.COLUMN_CONVERSATION_ID.key + "=?", new String[]{bVar.getConversationId()});
                    m.a();
                    m.b(bVar.getConversationId());
                    j.a();
                    j.b(bVar.getConversationId());
                    l.a();
                    l.d(bVar.getConversationId());
                    com.bytedance.im.core.b.a.b.b.a().a(bVar.getConversationId(), a.COLUMN_CONVERSATION_ID.key);
                } catch (Exception e2) {
                    e = e2;
                }
            }
        } catch (Exception e3) {
            e = e3;
            z = false;
            com.bytedance.im.core.b.e.d.a("deleteConversation", (Throwable) e);
            com.bytedance.im.core.c.d.a(e);
            return z;
        }
        return z;
    }

    private static b a(com.bytedance.im.core.b.a.c.b bVar) {
        boolean z;
        if (bVar == null) {
            return null;
        }
        b bVar2 = new b();
        bVar2.setConversationId(bVar.c(bVar.a(b.COLUMN_ID.key)));
        bVar2.setConversationShortId(bVar.b(bVar.a(b.COLUMN_SHORT_ID.key)));
        bVar2.setUpdatedTime(bVar.b(bVar.a(b.COLUMN_UPDATE_TIME.key)));
        bVar2.setUnreadCount((long) bVar.a(bVar.a(b.COLUMN_UNREAD_COUNT.key)));
        bVar2.setTicket(bVar.c(bVar.a(b.COLUMN_COLUMN_TICKET.key)));
        bVar2.setConversationType(bVar.a(bVar.a(b.COLUMN_CONVERSATION_TYPE.key)));
        bVar2.setDraftTime(bVar.b(bVar.a(b.COLUMN_DRAFT_TIME.key)));
        bVar2.setDraftContent(bVar.c(bVar.a(b.COLUMN_DRAFT_CONTENT.key)));
        bVar2.setMinIndex(bVar.b(bVar.a(b.COLUMN_MIN_INDEX.key)));
        bVar2.setLocalExtStr(bVar.c(bVar.a(b.COLUMN_LOCAL_INFO.key)));
        bVar2.setReadIndex(bVar.b(bVar.a(b.COLUMN_READ_INDEX.key)));
        bVar2.setLastMessageIndex(bVar.b(bVar.a(b.COLUMN_LAST_MSG_INDEX.key)));
        bVar2.setInboxType(bVar.a(bVar.a(b.COLUMN_INBOX.key)));
        boolean z2 = false;
        if (bVar.a(bVar.a(b.COLUMN_IS_MEMBER.key)) == 1) {
            z = true;
        } else {
            z = false;
        }
        bVar2.setIsMember(z);
        if (bVar.a(bVar.a(b.COLUMN_HAS_MORE.key)) == 1) {
            z2 = true;
        }
        bVar2.setHasMore(z2);
        bVar2.setMemberCount(bVar.a(bVar.a(b.COLUMN_MEMBER_COUNT.key)));
        bVar2.setStatus(bVar.a(bVar.a(b.COLUMN_STATUS.key)));
        bVar2.setMemberStr(bVar.c(bVar.a(b.COLUMN_PARTICIPANT.key)));
        l.a();
        bVar2.setMemberIds(l.a(bVar2.getConversationId()));
        o.a();
        bVar2.setLastMessage(o.g(bVar2.getConversationId()));
        j.a();
        bVar2.setCoreInfo(j.a(bVar2.getConversationId()));
        m.a();
        bVar2.setSettingInfo(m.a(bVar2.getConversationId()));
        n.a();
        bVar2.setMentionMessages(n.a(bVar2.getConversationId(), bVar2.getReadIndex()));
        return bVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x019e, code lost:
        r12 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x01a0, code lost:
        r12 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x019e A[Catch:{ Exception -> 0x01a0, all -> 0x019e }, ExcHandler: all (th java.lang.Throwable), Splitter:B:12:0x007e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(com.bytedance.im.core.d.b r12) {
        /*
            r0 = 0
            if (r12 == 0) goto L_0x01f6
            java.lang.String r1 = r12.getConversationId()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x000f
            goto L_0x01f6
        L_0x000f:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e1 }
            r3.<init>()     // Catch:{ Exception -> 0x01e1 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e1 }
            r4.<init>()     // Catch:{ Exception -> 0x01e1 }
            java.lang.String r5 = " replace into conversation_list("
            r3.append(r5)     // Catch:{ Exception -> 0x01e1 }
            com.bytedance.im.core.b.a.b[] r5 = com.bytedance.im.core.b.a.b.values()     // Catch:{ Exception -> 0x01e1 }
            int r6 = r5.length     // Catch:{ Exception -> 0x01e1 }
            r7 = 0
        L_0x0027:
            if (r7 >= r6) goto L_0x003d
            r8 = r5[r7]     // Catch:{ Exception -> 0x01e1 }
            java.lang.String r8 = r8.key     // Catch:{ Exception -> 0x01e1 }
            r3.append(r8)     // Catch:{ Exception -> 0x01e1 }
            java.lang.String r8 = ","
            r3.append(r8)     // Catch:{ Exception -> 0x01e1 }
            java.lang.String r8 = "?,"
            r4.append(r8)     // Catch:{ Exception -> 0x01e1 }
            int r7 = r7 + 1
            goto L_0x0027
        L_0x003d:
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01e1 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x01e1 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e1 }
            r5.<init>()     // Catch:{ Exception -> 0x01e1 }
            int r6 = r3.length()     // Catch:{ Exception -> 0x01e1 }
            r7 = 1
            int r6 = r6 - r7
            java.lang.String r3 = r3.substring(r0, r6)     // Catch:{ Exception -> 0x01e1 }
            r5.append(r3)     // Catch:{ Exception -> 0x01e1 }
            java.lang.String r3 = ") values ("
            r5.append(r3)     // Catch:{ Exception -> 0x01e1 }
            int r3 = r4.length()     // Catch:{ Exception -> 0x01e1 }
            int r3 = r3 - r7
            java.lang.String r3 = r4.substring(r0, r3)     // Catch:{ Exception -> 0x01e1 }
            r5.append(r3)     // Catch:{ Exception -> 0x01e1 }
            java.lang.String r3 = ");"
            r5.append(r3)     // Catch:{ Exception -> 0x01e1 }
            java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x01e1 }
            com.bytedance.im.core.b.a.a.d.a()     // Catch:{ Exception -> 0x01e1 }
            com.bytedance.im.core.b.a.c.d r3 = com.bytedance.im.core.b.a.a.d.d(r3)     // Catch:{ Exception -> 0x01e1 }
            if (r3 == 0) goto L_0x01a3
            if (r12 != 0) goto L_0x007e
            goto L_0x01a3
        L_0x007e:
            r3.d()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            com.bytedance.im.core.b.a.b r2 = com.bytedance.im.core.b.a.b.COLUMN_ID     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2 + r7
            java.lang.String r4 = r12.getConversationId()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            java.lang.String r4 = com.bytedance.im.core.b.a.r.a((java.lang.String) r4)     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            r3.a((int) r2, (java.lang.String) r4)     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            com.bytedance.im.core.b.a.b r2 = com.bytedance.im.core.b.a.b.COLUMN_SHORT_ID     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2 + r7
            long r4 = r12.getConversationShortId()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            r3.a((int) r2, (long) r4)     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            com.bytedance.im.core.b.a.b r2 = com.bytedance.im.core.b.a.b.COLUMN_CONVERSATION_TYPE     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2 + r7
            int r4 = r12.getConversationType()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            long r4 = (long) r4     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            r3.a((int) r2, (long) r4)     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            com.bytedance.im.core.b.a.b r2 = com.bytedance.im.core.b.a.b.COLUMN_LAST_MSG_INDEX     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2 + r7
            long r4 = r12.getLastMessageIndex()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            r3.a((int) r2, (long) r4)     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            com.bytedance.im.core.b.a.b r2 = com.bytedance.im.core.b.a.b.COLUMN_UPDATE_TIME     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2 + r7
            long r4 = r12.getUpdatedTime()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            r3.a((int) r2, (long) r4)     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            com.bytedance.im.core.b.a.b r2 = com.bytedance.im.core.b.a.b.COLUMN_UNREAD_COUNT     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2 + r7
            long r4 = r12.getUnreadCount()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            r3.a((int) r2, (long) r4)     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            com.bytedance.im.core.b.a.b r2 = com.bytedance.im.core.b.a.b.COLUMN_READ_INDEX     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2 + r7
            long r4 = r12.getReadIndex()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            r3.a((int) r2, (long) r4)     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            com.bytedance.im.core.b.a.b r2 = com.bytedance.im.core.b.a.b.COLUMN_MIN_INDEX     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2 + r7
            long r4 = r12.getMinIndex()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            r3.a((int) r2, (long) r4)     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            com.bytedance.im.core.b.a.b r2 = com.bytedance.im.core.b.a.b.COLUMN_DRAFT_TIME     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2 + r7
            long r4 = r12.getDraftTime()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            r3.a((int) r2, (long) r4)     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            com.bytedance.im.core.b.a.b r2 = com.bytedance.im.core.b.a.b.COLUMN_COLUMN_TICKET     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2 + r7
            java.lang.String r4 = r12.getTicket()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            java.lang.String r4 = com.bytedance.im.core.b.a.r.a((java.lang.String) r4)     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            r3.a((int) r2, (java.lang.String) r4)     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            com.bytedance.im.core.b.a.b r2 = com.bytedance.im.core.b.a.b.COLUMN_DRAFT_CONTENT     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2 + r7
            java.lang.String r4 = r12.getDraftContent()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            java.lang.String r4 = com.bytedance.im.core.b.a.r.a((java.lang.String) r4)     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            r3.a((int) r2, (java.lang.String) r4)     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            com.bytedance.im.core.b.a.b r2 = com.bytedance.im.core.b.a.b.COLUMN_LOCAL_INFO     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2 + r7
            java.lang.String r4 = r12.getLocalExtStr()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            java.lang.String r4 = com.bytedance.im.core.b.a.r.a((java.lang.String) r4)     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            r3.a((int) r2, (java.lang.String) r4)     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            com.bytedance.im.core.b.a.b r2 = com.bytedance.im.core.b.a.b.COLUMN_INBOX     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2 + r7
            int r4 = r12.getInboxType()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            long r4 = (long) r4     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            r3.a((int) r2, (long) r4)     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            com.bytedance.im.core.b.a.b r2 = com.bytedance.im.core.b.a.b.COLUMN_IS_MEMBER     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2 + r7
            boolean r4 = r12.isMember()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            r5 = 0
            r8 = 1
            if (r4 == 0) goto L_0x015c
            r10 = r8
            goto L_0x015d
        L_0x015c:
            r10 = r5
        L_0x015d:
            r3.a((int) r2, (long) r10)     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            com.bytedance.im.core.b.a.b r2 = com.bytedance.im.core.b.a.b.COLUMN_HAS_MORE     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2 + r7
            boolean r4 = r12.hasMore()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            if (r4 == 0) goto L_0x016e
            r5 = r8
        L_0x016e:
            r3.a((int) r2, (long) r5)     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            com.bytedance.im.core.b.a.b r2 = com.bytedance.im.core.b.a.b.COLUMN_MEMBER_COUNT     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2 + r7
            int r4 = r12.getMemberCount()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            long r4 = (long) r4     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            r3.a((int) r2, (long) r4)     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            com.bytedance.im.core.b.a.b r2 = com.bytedance.im.core.b.a.b.COLUMN_STATUS     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2 + r7
            int r4 = r12.getStatus()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            long r4 = (long) r4     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            r3.a((int) r2, (long) r4)     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            com.bytedance.im.core.b.a.b r2 = com.bytedance.im.core.b.a.b.COLUMN_PARTICIPANT     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            int r2 = r2 + r7
            java.lang.String r4 = r12.getMemberStr()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            r3.a((int) r2, (java.lang.String) r4)     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            goto L_0x01a3
        L_0x019e:
            r12 = move-exception
            goto L_0x01f2
        L_0x01a0:
            r12 = move-exception
        L_0x01a1:
            r2 = r3
            goto L_0x01e2
        L_0x01a3:
            int r2 = r3.a()     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            if (r2 <= 0) goto L_0x01aa
            goto L_0x01ab
        L_0x01aa:
            r7 = 0
        L_0x01ab:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x01a0, all -> 0x019e }
            com.bytedance.im.core.d.c r1 = r12.getCoreInfo()     // Catch:{ Exception -> 0x01db, all -> 0x019e }
            if (r1 == 0) goto L_0x01bf
            com.bytedance.im.core.b.a.j.a()     // Catch:{ Exception -> 0x01db, all -> 0x019e }
            com.bytedance.im.core.d.c r1 = r12.getCoreInfo()     // Catch:{ Exception -> 0x01db, all -> 0x019e }
            com.bytedance.im.core.b.a.j.a((com.bytedance.im.core.d.c) r1)     // Catch:{ Exception -> 0x01db, all -> 0x019e }
        L_0x01bf:
            com.bytedance.im.core.d.f r1 = r12.getSettingInfo()     // Catch:{ Exception -> 0x01db, all -> 0x019e }
            if (r1 == 0) goto L_0x01cf
            com.bytedance.im.core.b.a.m.a()     // Catch:{ Exception -> 0x01db, all -> 0x019e }
            com.bytedance.im.core.d.f r1 = r12.getSettingInfo()     // Catch:{ Exception -> 0x01db, all -> 0x019e }
            com.bytedance.im.core.b.a.m.a((com.bytedance.im.core.d.f) r1)     // Catch:{ Exception -> 0x01db, all -> 0x019e }
        L_0x01cf:
            com.bytedance.im.core.b.a.b.b r1 = com.bytedance.im.core.b.a.b.b.a()     // Catch:{ Exception -> 0x01db, all -> 0x019e }
            r1.a((boolean) r0, (java.lang.Object) r12)     // Catch:{ Exception -> 0x01db, all -> 0x019e }
            com.bytedance.im.core.b.a.r.a((com.bytedance.im.core.b.a.c.d) r3)
            r1 = r2
            goto L_0x01ed
        L_0x01db:
            r12 = move-exception
            r1 = r2
            goto L_0x01a1
        L_0x01de:
            r12 = move-exception
            r3 = r2
            goto L_0x01f2
        L_0x01e1:
            r12 = move-exception
        L_0x01e2:
            java.lang.String r0 = "updateConversation "
            com.bytedance.im.core.b.e.d.a((java.lang.String) r0, (java.lang.Throwable) r12)     // Catch:{ all -> 0x01de }
            com.bytedance.im.core.c.d.a(r12)     // Catch:{ all -> 0x01de }
            com.bytedance.im.core.b.a.r.a((com.bytedance.im.core.b.a.c.d) r2)
        L_0x01ed:
            boolean r12 = r1.booleanValue()
            return r12
        L_0x01f2:
            com.bytedance.im.core.b.a.r.a((com.bytedance.im.core.b.a.c.d) r3)
            throw r12
        L_0x01f6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.b.a.k.b(com.bytedance.im.core.d.b):boolean");
    }

    public static boolean a(b bVar) {
        boolean z = false;
        if (bVar == null || TextUtils.isEmpty(bVar.getConversationId())) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(b.COLUMN_ID.key, bVar.getConversationId());
        contentValues.put(b.COLUMN_SHORT_ID.key, Long.valueOf(bVar.getConversationShortId()));
        contentValues.put(b.COLUMN_LAST_MSG_INDEX.key, Long.valueOf(bVar.getLastMessageIndex()));
        contentValues.put(b.COLUMN_UPDATE_TIME.key, Long.valueOf(bVar.getUpdatedTime()));
        contentValues.put(b.COLUMN_UNREAD_COUNT.key, Long.valueOf(bVar.getUnreadCount()));
        contentValues.put(b.COLUMN_COLUMN_TICKET.key, bVar.getTicket());
        contentValues.put(b.COLUMN_CONVERSATION_TYPE.key, Integer.valueOf(bVar.getConversationType()));
        contentValues.put(b.COLUMN_DRAFT_TIME.key, Long.valueOf(bVar.getDraftTime()));
        contentValues.put(b.COLUMN_DRAFT_CONTENT.key, bVar.getDraftContent());
        contentValues.put(b.COLUMN_MIN_INDEX.key, Long.valueOf(bVar.getMinIndex()));
        contentValues.put(b.COLUMN_LOCAL_INFO.key, bVar.getLocalExtStr());
        contentValues.put(b.COLUMN_READ_INDEX.key, Long.valueOf(bVar.getReadIndex()));
        contentValues.put(b.COLUMN_INBOX.key, Integer.valueOf(bVar.getInboxType()));
        contentValues.put(b.COLUMN_IS_MEMBER.key, Integer.valueOf(bVar.isMember() ? 1 : 0));
        contentValues.put(b.COLUMN_HAS_MORE.key, Integer.valueOf(bVar.hasMore() ? 1 : 0));
        contentValues.put(b.COLUMN_MEMBER_COUNT.key, Integer.valueOf(bVar.getMemberCount()));
        contentValues.put(b.COLUMN_STATUS.key, Integer.valueOf(bVar.getStatus()));
        contentValues.put(b.COLUMN_PARTICIPANT.key, bVar.getMemberStr());
        if (bVar.getCoreInfo() != null) {
            j.a();
            j.a(bVar.getCoreInfo());
        }
        if (bVar.getSettingInfo() != null) {
            m.a();
            m.a(bVar.getSettingInfo());
        }
        d.a();
        if (d.a("conversation_list", (String) null, contentValues) >= 0) {
            z = true;
        }
        if (z) {
            com.bytedance.im.core.b.a.b.b.a().a(true, (Object) bVar);
        }
        return z;
    }

    public static boolean a(List<String> list) {
        if (list.isEmpty()) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        for (String append : list) {
            sb.append('\"');
            sb.append(append);
            sb.append('\"');
            sb.append(",");
        }
        String sb2 = sb.toString();
        d.a();
        boolean c2 = d.c("delete from conversation_list where " + b.COLUMN_ID.key + " in (" + sb2.substring(0, sb2.length() - 1) + ")");
        if (c2) {
            com.bytedance.im.core.b.a.b.b.a().a(list, a.COLUMN_CONVERSATION_ID.key);
        }
        return c2;
    }
}

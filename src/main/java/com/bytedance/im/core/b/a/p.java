package com.bytedance.im.core.b.a;

import android.text.TextUtils;
import com.bytedance.im.core.b.a.a.d;
import com.bytedance.im.core.b.a.c.b;

public class p {

    /* renamed from: a  reason: collision with root package name */
    private static p f20945a;

    private p() {
    }

    public static p a() {
        if (f20945a == null) {
            synchronized (p.class) {
                if (f20945a == null) {
                    f20945a = new p();
                }
            }
        }
        return f20945a;
    }

    public static String b() {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS msg_property(");
        for (h hVar : h.values()) {
            sb.append(hVar.key);
            sb.append(" ");
            sb.append(hVar.type);
            sb.append(",");
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1) + ");";
    }

    private static long a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        b bVar = null;
        try {
            d.a();
            b a2 = d.a("select rowid from msg_property where " + h.COLUMN_MSG_ID.key + "=?", new String[]{str});
            if (a2 != null) {
                try {
                    if (a2.c()) {
                        long b2 = a2.b(a2.a("rowid"));
                        r.a(a2);
                        return b2;
                    }
                } catch (Exception e2) {
                    Exception exc = e2;
                    bVar = a2;
                    e = exc;
                    try {
                        com.bytedance.im.core.b.e.d.a("getRowid", (Throwable) e);
                        com.bytedance.im.core.c.d.a(e);
                        r.a(bVar);
                        return -1;
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
            }
            r.a(a2);
        } catch (Exception e3) {
            e = e3;
            com.bytedance.im.core.b.e.d.a("getRowid", (Throwable) e);
            com.bytedance.im.core.c.d.a(e);
            r.a(bVar);
            return -1;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0222, code lost:
        if (r5.a() > 0) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x036e, code lost:
        if (r5.b() > 0) goto L_0x0224;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.bytedance.im.core.d.p r17) {
        /*
            r16 = this;
            r1 = 0
            if (r17 == 0) goto L_0x038a
            boolean r2 = r17.invalid()
            if (r2 == 0) goto L_0x000b
            goto L_0x038a
        L_0x000b:
            r2 = 0
            java.lang.String r3 = r17.getUuid()     // Catch:{ Exception -> 0x0379 }
            long r3 = a((java.lang.String) r3)     // Catch:{ Exception -> 0x0379 }
            java.lang.String r5 = r17.getUuid()     // Catch:{ Exception -> 0x0379 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0379 }
            r6.<init>()     // Catch:{ Exception -> 0x0379 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0379 }
            r7.<init>()     // Catch:{ Exception -> 0x0379 }
            r8 = 0
            r10 = 1
            int r11 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x0088
            java.lang.String r7 = " update msg_property set "
            r6.append(r7)     // Catch:{ Exception -> 0x0379 }
            com.bytedance.im.core.b.a.h[] r7 = com.bytedance.im.core.b.a.h.values()     // Catch:{ Exception -> 0x0379 }
            int r11 = r7.length     // Catch:{ Exception -> 0x0379 }
            r12 = 0
        L_0x0034:
            if (r12 >= r11) goto L_0x0051
            r13 = r7[r12]     // Catch:{ Exception -> 0x0379 }
            com.bytedance.im.core.b.a.h r14 = com.bytedance.im.core.b.a.h.COLUMN_MSG_ID     // Catch:{ Exception -> 0x0379 }
            java.lang.String r14 = r14.key     // Catch:{ Exception -> 0x0379 }
            java.lang.String r15 = r13.key     // Catch:{ Exception -> 0x0379 }
            boolean r14 = r14.equals(r15)     // Catch:{ Exception -> 0x0379 }
            if (r14 != 0) goto L_0x004e
            java.lang.String r13 = r13.key     // Catch:{ Exception -> 0x0379 }
            r6.append(r13)     // Catch:{ Exception -> 0x0379 }
            java.lang.String r13 = "=?,"
            r6.append(r13)     // Catch:{ Exception -> 0x0379 }
        L_0x004e:
            int r12 = r12 + 1
            goto L_0x0034
        L_0x0051:
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0379 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0379 }
            r7.<init>()     // Catch:{ Exception -> 0x0379 }
            int r11 = r6.length()     // Catch:{ Exception -> 0x0379 }
            int r11 = r11 - r10
            java.lang.String r6 = r6.substring(r1, r11)     // Catch:{ Exception -> 0x0379 }
            r7.append(r6)     // Catch:{ Exception -> 0x0379 }
            java.lang.String r6 = " where "
            r7.append(r6)     // Catch:{ Exception -> 0x0379 }
            com.bytedance.im.core.b.a.h r6 = com.bytedance.im.core.b.a.h.COLUMN_MSG_ID     // Catch:{ Exception -> 0x0379 }
            java.lang.String r6 = r6.key     // Catch:{ Exception -> 0x0379 }
            r7.append(r6)     // Catch:{ Exception -> 0x0379 }
            java.lang.String r6 = "='"
            r7.append(r6)     // Catch:{ Exception -> 0x0379 }
            java.lang.String r5 = com.bytedance.im.core.b.a.r.a((java.lang.String) r5)     // Catch:{ Exception -> 0x0379 }
            r7.append(r5)     // Catch:{ Exception -> 0x0379 }
            java.lang.String r5 = "'"
            r7.append(r5)     // Catch:{ Exception -> 0x0379 }
            java.lang.String r5 = r7.toString()     // Catch:{ Exception -> 0x0379 }
            goto L_0x00dc
        L_0x0088:
            java.lang.String r5 = " insert into msg_property("
            r6.append(r5)     // Catch:{ Exception -> 0x0379 }
            com.bytedance.im.core.b.a.h[] r5 = com.bytedance.im.core.b.a.h.values()     // Catch:{ Exception -> 0x0379 }
            int r11 = r5.length     // Catch:{ Exception -> 0x0379 }
            r12 = 0
        L_0x0093:
            if (r12 >= r11) goto L_0x00a9
            r13 = r5[r12]     // Catch:{ Exception -> 0x0379 }
            java.lang.String r13 = r13.key     // Catch:{ Exception -> 0x0379 }
            r6.append(r13)     // Catch:{ Exception -> 0x0379 }
            java.lang.String r13 = ","
            r6.append(r13)     // Catch:{ Exception -> 0x0379 }
            java.lang.String r13 = "?,"
            r7.append(r13)     // Catch:{ Exception -> 0x0379 }
            int r12 = r12 + 1
            goto L_0x0093
        L_0x00a9:
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x0379 }
            java.lang.String r6 = r7.toString()     // Catch:{ Exception -> 0x0379 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0379 }
            r7.<init>()     // Catch:{ Exception -> 0x0379 }
            int r11 = r5.length()     // Catch:{ Exception -> 0x0379 }
            int r11 = r11 - r10
            java.lang.String r5 = r5.substring(r1, r11)     // Catch:{ Exception -> 0x0379 }
            r7.append(r5)     // Catch:{ Exception -> 0x0379 }
            java.lang.String r5 = ") values ("
            r7.append(r5)     // Catch:{ Exception -> 0x0379 }
            int r5 = r6.length()     // Catch:{ Exception -> 0x0379 }
            int r5 = r5 - r10
            java.lang.String r5 = r6.substring(r1, r5)     // Catch:{ Exception -> 0x0379 }
            r7.append(r5)     // Catch:{ Exception -> 0x0379 }
            java.lang.String r5 = ");"
            r7.append(r5)     // Catch:{ Exception -> 0x0379 }
            java.lang.String r5 = r7.toString()     // Catch:{ Exception -> 0x0379 }
        L_0x00dc:
            com.bytedance.im.core.b.a.a.d.a()     // Catch:{ Exception -> 0x0379 }
            com.bytedance.im.core.b.a.c.d r5 = com.bytedance.im.core.b.a.a.d.d(r5)     // Catch:{ Exception -> 0x0379 }
            int r2 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x0227
            if (r5 == 0) goto L_0x021e
            if (r17 != 0) goto L_0x00ed
            goto L_0x021e
        L_0x00ed:
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_SERVER_ID     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            long r3 = r17.getServerId()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (long) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_CONVERSATION_ID     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            java.lang.String r3 = r17.getConversationId()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            java.lang.String r3 = com.bytedance.im.core.b.a.r.a((java.lang.String) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_TARGET_MSG_ID     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            java.lang.String r3 = r17.getTargetUuid()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            java.lang.String r3 = com.bytedance.im.core.b.a.r.a((java.lang.String) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_PROPERTY_TYPE     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            int r3 = r17.getPropertyType()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (long) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_MSG_TYPE     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            int r3 = r17.getMsgType()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (long) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_INNER_INDEX     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            long r3 = r17.getIndex()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (long) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_ORDER_INDEX     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            long r3 = r17.getOrderIndex()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (long) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_STATUS     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            int r3 = r17.getStatus()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (long) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_NET_STATUS     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            int r3 = r17.getNetStatus()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (long) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_VERSION     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            long r3 = r17.getVersion()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (long) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_DELETED     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            int r3 = r17.getDeleted()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (long) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_CREATE_TIME     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            long r3 = r17.getCreatedTime()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (long) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_SENDER     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            long r3 = r17.getSender()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (long) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_CONTENT     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            java.lang.String r3 = r17.getContent()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            java.lang.String r3 = com.bytedance.im.core.b.a.r.a((java.lang.String) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_EXT     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            java.lang.String r3 = r17.getExtStr()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            java.lang.String r3 = com.bytedance.im.core.b.a.r.a((java.lang.String) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_LOCAL_INFO     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            java.lang.String r3 = r17.getLocalExtStr()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            java.lang.String r3 = com.bytedance.im.core.b.a.r.a((java.lang.String) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_PRORERTY_ID     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            int r3 = r17.getPropertyId()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (long) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_PRORERTY_NAME     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            java.lang.String r3 = r17.getPropertyName()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            java.lang.String r3 = com.bytedance.im.core.b.a.r.a((java.lang.String) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_REACTION_STATUS     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r1
            int r0 = r17.getReactionStatus()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            long r3 = (long) r0     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (long) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            goto L_0x021e
        L_0x0217:
            r0 = move-exception
            goto L_0x0386
        L_0x021a:
            r0 = move-exception
            r2 = r5
            goto L_0x037a
        L_0x021e:
            int r0 = r5.a()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            if (r0 <= 0) goto L_0x0372
        L_0x0224:
            r1 = 1
            goto L_0x0372
        L_0x0227:
            if (r5 == 0) goto L_0x0368
            if (r17 != 0) goto L_0x022d
            goto L_0x0368
        L_0x022d:
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_MSG_ID     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            java.lang.String r3 = r17.getUuid()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            java.lang.String r3 = com.bytedance.im.core.b.a.r.a((java.lang.String) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_SERVER_ID     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            long r3 = r17.getServerId()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (long) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_CONVERSATION_ID     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            java.lang.String r3 = r17.getConversationId()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            java.lang.String r3 = com.bytedance.im.core.b.a.r.a((java.lang.String) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_TARGET_MSG_ID     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            java.lang.String r3 = r17.getTargetUuid()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            java.lang.String r3 = com.bytedance.im.core.b.a.r.a((java.lang.String) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_PROPERTY_TYPE     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            int r3 = r17.getPropertyType()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (long) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_MSG_TYPE     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            int r3 = r17.getMsgType()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (long) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_INNER_INDEX     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            long r3 = r17.getIndex()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (long) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_ORDER_INDEX     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            long r3 = r17.getOrderIndex()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (long) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_STATUS     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            int r3 = r17.getStatus()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (long) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_NET_STATUS     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            int r3 = r17.getNetStatus()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (long) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_VERSION     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            long r3 = r17.getVersion()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (long) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_DELETED     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            int r3 = r17.getDeleted()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (long) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_CREATE_TIME     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            long r3 = r17.getCreatedTime()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (long) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_SENDER     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            long r3 = r17.getSender()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (long) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_CONTENT     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            java.lang.String r3 = r17.getContent()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            java.lang.String r3 = com.bytedance.im.core.b.a.r.a((java.lang.String) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_EXT     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            java.lang.String r3 = r17.getExtStr()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            java.lang.String r3 = com.bytedance.im.core.b.a.r.a((java.lang.String) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_LOCAL_INFO     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            java.lang.String r3 = r17.getLocalExtStr()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            java.lang.String r3 = com.bytedance.im.core.b.a.r.a((java.lang.String) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_PRORERTY_ID     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            int r3 = r17.getPropertyId()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            long r3 = (long) r3     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (long) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_PRORERTY_NAME     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            java.lang.String r3 = r17.getPropertyName()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            java.lang.String r3 = com.bytedance.im.core.b.a.r.a((java.lang.String) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            com.bytedance.im.core.b.a.h r2 = com.bytedance.im.core.b.a.h.COLUMN_REACTION_STATUS     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2.ordinal()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r2 = r2 + r10
            int r0 = r17.getReactionStatus()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            long r3 = (long) r0     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            r5.a((int) r2, (long) r3)     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
        L_0x0368:
            long r2 = r5.b()     // Catch:{ Exception -> 0x021a, all -> 0x0217 }
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0372
            goto L_0x0224
        L_0x0372:
            com.bytedance.im.core.b.a.r.a((com.bytedance.im.core.b.a.c.d) r5)
            goto L_0x0385
        L_0x0376:
            r0 = move-exception
            r5 = r2
            goto L_0x0386
        L_0x0379:
            r0 = move-exception
        L_0x037a:
            java.lang.String r3 = "insertOrUpdatePropertyMsg"
            com.bytedance.im.core.b.e.d.a((java.lang.String) r3, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0376 }
            com.bytedance.im.core.c.d.a(r0)     // Catch:{ all -> 0x0376 }
            com.bytedance.im.core.b.a.r.a((com.bytedance.im.core.b.a.c.d) r2)
        L_0x0385:
            return r1
        L_0x0386:
            com.bytedance.im.core.b.a.r.a((com.bytedance.im.core.b.a.c.d) r5)
            throw r0
        L_0x038a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.b.a.p.a(com.bytedance.im.core.d.p):boolean");
    }
}

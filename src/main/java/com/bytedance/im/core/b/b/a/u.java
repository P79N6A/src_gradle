package com.bytedance.im.core.b.b.a;

import android.util.Pair;
import com.bytedance.im.core.a.c;
import com.bytedance.im.core.b.a.k;
import com.bytedance.im.core.b.b.a;
import com.bytedance.im.core.b.d.e;
import com.bytedance.im.core.b.e.g;
import com.bytedance.im.core.d.b;
import com.bytedance.im.core.d.d;
import com.bytedance.im.core.d.n;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.NewMessageNotify;
import com.bytedance.im.core.proto.NewMessageNotifyType;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class u extends b {
    u() {
        super(IMCMD.NEW_MSG_NOTIFY.getValue());
    }

    static void a(String str) {
        k.a();
        b a2 = k.a(str);
        if (a2 != null && a2.hasMore()) {
            a2.setHasMore(false);
            k.a();
            if (k.b(a2)) {
                d.a().f(a2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(final int i, ResponseBody responseBody) {
        final NewMessageNotify newMessageNotify = responseBody.has_new_message_notify;
        if (newMessageNotify.notify_type == NewMessageNotifyType.PER_USER) {
            int[] iArr = c.a().b().p;
            if (iArr == null) {
                iArr = c.a().b().o;
            }
            if (iArr != null) {
                for (int i2 : iArr) {
                    if (i == i2) {
                        e.a(new com.bytedance.im.core.b.d.d<Pair<Pair<n, Boolean>, Pair<Boolean, Boolean>>>() {
                            /* access modifiers changed from: private */
                            /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d1, code lost:
                                r0 = move-exception;
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d2, code lost:
                                com.bytedance.im.core.b.e.i.a().a(r7, r8.next_cursor.longValue());
                             */
                            /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e3, code lost:
                                throw r0;
                             */
                            /* JADX WARNING: Failed to process nested try/catch */
                            /* JADX WARNING: Removed duplicated region for block: B:23:0x00d1 A[ExcHandler: all (r0v5 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:5:0x0024] */
                            /* renamed from: b */
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public android.util.Pair<android.util.Pair<com.bytedance.im.core.d.n, java.lang.Boolean>, android.util.Pair<java.lang.Boolean, java.lang.Boolean>> a() {
                                /*
                                    r13 = this;
                                    com.bytedance.im.core.b.e.i r0 = com.bytedance.im.core.b.e.i.a()
                                    int r1 = r7
                                    long r0 = r0.a((int) r1)
                                    com.bytedance.im.core.proto.NewMessageNotify r2 = r8
                                    java.lang.Long r2 = r2.next_cursor
                                    long r2 = r2.longValue()
                                    r4 = 0
                                    int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                                    if (r5 > 0) goto L_0x0018
                                    return r4
                                L_0x0018:
                                    com.bytedance.im.core.proto.NewMessageNotify r2 = r8
                                    java.lang.Long r2 = r2.previous_cursor
                                    long r2 = r2.longValue()
                                    int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                                    if (r5 != 0) goto L_0x0104
                                    long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x00e4, all -> 0x00d1 }
                                    com.bytedance.im.core.proto.NewMessageNotify r2 = r8     // Catch:{ Exception -> 0x00e4, all -> 0x00d1 }
                                    com.bytedance.im.core.proto.MessageBody r2 = r2.message     // Catch:{ Exception -> 0x00e4, all -> 0x00d1 }
                                    r3 = 0
                                    android.util.Pair r2 = com.bytedance.im.core.b.b.a.u.a(r2, r3, r3)     // Catch:{ Exception -> 0x00e4, all -> 0x00d1 }
                                    org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x0051, all -> 0x00d1 }
                                    r5.<init>()     // Catch:{ Exception -> 0x0051, all -> 0x00d1 }
                                    java.lang.String r6 = "duration"
                                    long r7 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0051, all -> 0x00d1 }
                                    r9 = 0
                                    long r7 = r7 - r0
                                    r5.put(r6, r7)     // Catch:{ Exception -> 0x0051, all -> 0x00d1 }
                                    java.lang.String r0 = "msg_count"
                                    r1 = 1
                                    r5.put(r0, r1)     // Catch:{ Exception -> 0x0051, all -> 0x00d1 }
                                    java.lang.String r0 = "msg_source"
                                    r5.put(r0, r3)     // Catch:{ Exception -> 0x0051, all -> 0x00d1 }
                                    java.lang.String r0 = "im_save_msg_list_duration"
                                    com.bytedance.im.core.c.d.a((java.lang.String) r0, (org.json.JSONObject) r5, (org.json.JSONObject) r4)     // Catch:{ Exception -> 0x0051, all -> 0x00d1 }
                                L_0x0051:
                                    if (r2 == 0) goto L_0x00e4
                                    java.lang.Object r0 = r2.first     // Catch:{ Exception -> 0x00e4, all -> 0x00d1 }
                                    if (r0 == 0) goto L_0x00e4
                                    java.lang.Object r0 = r2.first     // Catch:{ Exception -> 0x00e4, all -> 0x00d1 }
                                    com.bytedance.im.core.d.n r0 = (com.bytedance.im.core.d.n) r0     // Catch:{ Exception -> 0x00e4, all -> 0x00d1 }
                                    com.bytedance.im.core.b.a.k.a()     // Catch:{ Exception -> 0x00e4, all -> 0x00d1 }
                                    java.lang.String r1 = r0.getConversationId()     // Catch:{ Exception -> 0x00e4, all -> 0x00d1 }
                                    com.bytedance.im.core.d.b r5 = com.bytedance.im.core.b.a.k.a((java.lang.String) r1)     // Catch:{ Exception -> 0x00e4, all -> 0x00d1 }
                                    if (r5 != 0) goto L_0x0088
                                    android.util.Pair r0 = new android.util.Pair     // Catch:{ Exception -> 0x00e4, all -> 0x00d1 }
                                    android.util.Pair r1 = new android.util.Pair     // Catch:{ Exception -> 0x00e4, all -> 0x00d1 }
                                    java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x00e4, all -> 0x00d1 }
                                    java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x00e4, all -> 0x00d1 }
                                    r1.<init>(r3, r5)     // Catch:{ Exception -> 0x00e4, all -> 0x00d1 }
                                    r0.<init>(r2, r1)     // Catch:{ Exception -> 0x00e4, all -> 0x00d1 }
                                    com.bytedance.im.core.b.e.i r1 = com.bytedance.im.core.b.e.i.a()
                                    int r2 = r7
                                    com.bytedance.im.core.proto.NewMessageNotify r3 = r8
                                    java.lang.Long r3 = r3.next_cursor
                                    long r3 = r3.longValue()
                                    r1.a((int) r2, (long) r3)
                                    return r0
                                L_0x0088:
                                    com.bytedance.im.core.b.a.o.a()     // Catch:{ Exception -> 0x00e4, all -> 0x00d1 }
                                    java.lang.String r6 = r0.getConversationId()     // Catch:{ Exception -> 0x00e4, all -> 0x00d1 }
                                    long r7 = r5.getReadIndex()     // Catch:{ Exception -> 0x00e4, all -> 0x00d1 }
                                    r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                                    com.bytedance.im.core.a.c r1 = com.bytedance.im.core.a.c.a()     // Catch:{ Exception -> 0x00e4, all -> 0x00d1 }
                                    com.bytedance.im.core.a.a r1 = r1.f20879c     // Catch:{ Exception -> 0x00e4, all -> 0x00d1 }
                                    long r11 = r1.a()     // Catch:{ Exception -> 0x00e4, all -> 0x00d1 }
                                    long r8 = com.bytedance.im.core.b.a.o.a((java.lang.String) r6, (long) r7, (long) r9, (long) r11)     // Catch:{ Exception -> 0x00e4, all -> 0x00d1 }
                                    long r6 = r0.getIndex()     // Catch:{ Exception -> 0x00e4, all -> 0x00d1 }
                                    long r10 = com.bytedance.im.core.b.e.f.b((com.bytedance.im.core.d.n) r0)     // Catch:{ Exception -> 0x00e4, all -> 0x00d1 }
                                    com.bytedance.im.core.b.b.a.u.a((com.bytedance.im.core.d.b) r5, (long) r6, (long) r8, (long) r10)     // Catch:{ Exception -> 0x00e4, all -> 0x00d1 }
                                    android.util.Pair r0 = new android.util.Pair     // Catch:{ Exception -> 0x00e4, all -> 0x00d1 }
                                    android.util.Pair r1 = new android.util.Pair     // Catch:{ Exception -> 0x00e4, all -> 0x00d1 }
                                    java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x00e4, all -> 0x00d1 }
                                    java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x00e4, all -> 0x00d1 }
                                    r1.<init>(r3, r5)     // Catch:{ Exception -> 0x00e4, all -> 0x00d1 }
                                    r0.<init>(r2, r1)     // Catch:{ Exception -> 0x00e4, all -> 0x00d1 }
                                    com.bytedance.im.core.b.e.i r1 = com.bytedance.im.core.b.e.i.a()
                                    int r2 = r7
                                    com.bytedance.im.core.proto.NewMessageNotify r3 = r8
                                    java.lang.Long r3 = r3.next_cursor
                                    long r3 = r3.longValue()
                                    r1.a((int) r2, (long) r3)
                                    return r0
                                L_0x00d1:
                                    r0 = move-exception
                                    com.bytedance.im.core.b.e.i r1 = com.bytedance.im.core.b.e.i.a()
                                    int r2 = r7
                                    com.bytedance.im.core.proto.NewMessageNotify r3 = r8
                                    java.lang.Long r3 = r3.next_cursor
                                    long r3 = r3.longValue()
                                    r1.a((int) r2, (long) r3)
                                    throw r0
                                L_0x00e4:
                                    com.bytedance.im.core.b.e.i r0 = com.bytedance.im.core.b.e.i.a()
                                    int r1 = r7
                                    com.bytedance.im.core.proto.NewMessageNotify r2 = r8
                                    java.lang.Long r2 = r2.next_cursor
                                    long r2 = r2.longValue()
                                    r0.a((int) r1, (long) r2)
                                    android.util.Pair r0 = new android.util.Pair
                                    android.util.Pair r1 = new android.util.Pair
                                    java.lang.Boolean r2 = java.lang.Boolean.FALSE
                                    java.lang.Boolean r3 = java.lang.Boolean.FALSE
                                    r1.<init>(r2, r3)
                                    r0.<init>(r4, r1)
                                    return r0
                                L_0x0104:
                                    android.util.Pair r0 = new android.util.Pair
                                    android.util.Pair r1 = new android.util.Pair
                                    java.lang.Boolean r2 = java.lang.Boolean.TRUE
                                    java.lang.Boolean r3 = java.lang.Boolean.FALSE
                                    r1.<init>(r2, r3)
                                    r0.<init>(r4, r1)
                                    return r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.b.b.a.u.AnonymousClass1.a():android.util.Pair");
                            }
                        }, new com.bytedance.im.core.b.d.c<Pair<Pair<n, Boolean>, Pair<Boolean, Boolean>>>() {
                            public final /* synthetic */ void a(Object obj) {
                                Pair pair = (Pair) obj;
                                if (pair != null) {
                                    if (((Boolean) ((Pair) pair.second).first).booleanValue()) {
                                        if (!(c.a().f20879c.e() == null || newMessageNotify == null || newMessageNotify.message == null)) {
                                            c.a();
                                        }
                                        m.a();
                                        m.a(i, 2);
                                    } else if (pair.first != null) {
                                        Pair pair2 = (Pair) pair.first;
                                        n nVar = (n) pair2.first;
                                        boolean booleanValue = ((Boolean) pair2.second).booleanValue();
                                        b a2 = d.a().a(nVar.getConversationId());
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(nVar);
                                        if (booleanValue) {
                                            g.a().c((List<n>) arrayList);
                                        } else {
                                            g.a().f(arrayList);
                                        }
                                        d.a().b(a2);
                                        if (booleanValue) {
                                            if (nVar == null || d.a().e(nVar.getConversationId()) || nVar.isSelf()) {
                                                nVar = null;
                                            }
                                            if (nVar != null) {
                                                c.a().f20879c.a(Collections.singletonList(nVar));
                                            }
                                        }
                                        if (((Boolean) ((Pair) pair.second).second).booleanValue()) {
                                            new h().a(i, ((n) pair2.first).getConversationId(), ((n) pair2.first).getConversationShortId(), ((n) pair2.first).getConversationType(), ((n) pair2.first).getCreatedAt());
                                        }
                                        a.a();
                                    } else {
                                        a.a();
                                    }
                                }
                            }
                        }, com.bytedance.im.core.b.d.a.c());
                    }
                }
            }
        }
    }

    static Pair<n, Boolean> a(MessageBody messageBody, boolean z, int i) {
        return a(messageBody, z, (Pair<String, String>) null, i);
    }

    static void a(b bVar, long j, long j2, long j3) {
        if (j3 > bVar.getUpdatedTime()) {
            bVar.setUpdatedTime(j3);
        }
        bVar.setLastMessageIndex(j);
        bVar.setUnreadCount(j2);
        k.a();
        if (k.b(bVar)) {
            d.a().f(bVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009a, code lost:
        if (r6.version.longValue() > r7.getVersion()) goto L_0x009e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.util.Pair<com.bytedance.im.core.d.n, java.lang.Boolean> a(com.bytedance.im.core.proto.MessageBody r6, boolean r7, android.util.Pair<java.lang.String, java.lang.String> r8, int r9) {
        /*
            com.bytedance.im.core.a.c r0 = com.bytedance.im.core.a.c.a()
            com.bytedance.im.core.a.a r0 = r0.f20879c
            if (r0 == 0) goto L_0x0022
            com.bytedance.im.core.a.c r0 = com.bytedance.im.core.a.c.a()
            com.bytedance.im.core.a.a r0 = r0.f20879c
            com.bytedance.im.core.a.b r0 = r0.e()
            if (r0 == 0) goto L_0x0022
            com.bytedance.im.core.a.c r0 = com.bytedance.im.core.a.c.a()
            com.bytedance.im.core.a.a r0 = r0.f20879c
            com.bytedance.im.core.a.b r0 = r0.e()
            com.bytedance.im.core.proto.MessageBody r6 = r0.a(r6, r9)
        L_0x0022:
            boolean r9 = com.bytedance.im.core.b.e.f.a((com.bytedance.im.core.proto.MessageBody) r6)
            r0 = 0
            if (r9 == 0) goto L_0x00f0
            boolean r9 = com.bytedance.im.core.b.b.a.d.a(r6)
            if (r9 == 0) goto L_0x0030
            return r0
        L_0x0030:
            boolean r9 = com.bytedance.im.core.b.e.f.b((com.bytedance.im.core.proto.MessageBody) r6)
            if (r9 == 0) goto L_0x003a
            com.bytedance.im.core.b.b.a.ac.a((com.bytedance.im.core.proto.MessageBody) r6)
            return r0
        L_0x003a:
            java.util.Map<java.lang.String, java.lang.String> r9 = r6.ext
            java.lang.String r1 = ""
            if (r9 == 0) goto L_0x005e
            java.lang.String r2 = "s:client_message_id"
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto L_0x005e
            java.lang.String r2 = "s:client_message_id"
            java.lang.Object r2 = r9.get(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x005e
            java.lang.String r1 = "s:client_message_id"
            java.lang.Object r1 = r9.get(r1)
            java.lang.String r1 = (java.lang.String) r1
        L_0x005e:
            if (r9 == 0) goto L_0x009d
            java.lang.String r2 = "s:server_message_id"
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto L_0x009d
            java.lang.String r2 = "s:server_message_id"
            java.lang.Object r2 = r9.get(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x009d
            if (r7 == 0) goto L_0x0079
            return r0
        L_0x0079:
            java.lang.String r7 = "s:server_message_id"
            java.lang.Object r7 = r9.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            long r2 = java.lang.Long.parseLong(r7)
            com.bytedance.im.core.b.a.o.a()
            com.bytedance.im.core.d.n r7 = com.bytedance.im.core.b.a.o.a((long) r2)
            if (r7 == 0) goto L_0x009d
            java.lang.Long r9 = r6.version
            long r2 = r9.longValue()
            long r4 = r7.getVersion()
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 <= 0) goto L_0x009d
            goto L_0x009e
        L_0x009d:
            r7 = r0
        L_0x009e:
            if (r7 != 0) goto L_0x00bb
            boolean r7 = android.text.TextUtils.isEmpty(r1)
            if (r7 == 0) goto L_0x00b4
            com.bytedance.im.core.b.a.o.a()
            java.lang.Long r7 = r6.server_message_id
            long r2 = r7.longValue()
            com.bytedance.im.core.d.n r7 = com.bytedance.im.core.b.a.o.a((long) r2)
            goto L_0x00bb
        L_0x00b4:
            com.bytedance.im.core.b.a.o.a()
            com.bytedance.im.core.d.n r7 = com.bytedance.im.core.b.a.o.c(r1)
        L_0x00bb:
            if (r7 != 0) goto L_0x00bf
            r9 = 1
            goto L_0x00c0
        L_0x00bf:
            r9 = 0
        L_0x00c0:
            com.bytedance.im.core.d.n r6 = com.bytedance.im.core.b.e.b.a((java.lang.String) r1, (com.bytedance.im.core.d.n) r7, (com.bytedance.im.core.proto.MessageBody) r6)
            if (r8 == 0) goto L_0x00d1
            java.util.Map r7 = r6.getLocalExt()
            java.lang.Object r1 = r8.first
            java.lang.Object r8 = r8.second
            r7.put(r1, r8)
        L_0x00d1:
            if (r9 == 0) goto L_0x00db
            com.bytedance.im.core.b.a.o.a()
            boolean r7 = com.bytedance.im.core.b.a.o.b((com.bytedance.im.core.d.n) r6)
            goto L_0x00e3
        L_0x00db:
            com.bytedance.im.core.b.a.o r7 = com.bytedance.im.core.b.a.o.a()
            boolean r7 = r7.a((com.bytedance.im.core.d.n) r6)
        L_0x00e3:
            if (r7 == 0) goto L_0x00ef
            android.util.Pair r7 = new android.util.Pair
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r9)
            r7.<init>(r6, r8)
            return r7
        L_0x00ef:
            return r0
        L_0x00f0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.b.b.a.u.a(com.bytedance.im.core.proto.MessageBody, boolean, android.util.Pair, int):android.util.Pair");
    }
}

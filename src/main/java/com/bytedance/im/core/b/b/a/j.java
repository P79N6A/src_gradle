package com.bytedance.im.core.b.b.a;

import com.bytedance.im.core.a.c;
import com.bytedance.im.core.b.b.a;
import com.bytedance.im.core.b.c.f;
import com.bytedance.im.core.b.d.d;
import com.bytedance.im.core.b.d.e;
import com.bytedance.im.core.b.e.g;
import com.bytedance.im.core.b.e.i;
import com.bytedance.im.core.d.n;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessagesPerUserRequestBody;
import com.bytedance.im.core.proto.MessagesPerUserResponseBody;
import com.bytedance.im.core.proto.RequestBody;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class j extends l {

    /* renamed from: a  reason: collision with root package name */
    public int f21053a;

    /* renamed from: b  reason: collision with root package name */
    public int f21054b;

    /* access modifiers changed from: protected */
    public final boolean a() {
        return true;
    }

    j(int i) {
        super(IMCMD.GET_MESSAGES_BY_USER.getValue());
        this.f21053a = i;
    }

    /* access modifiers changed from: protected */
    public final boolean a(f fVar) {
        if (fVar.g.body == null || fVar.g.body.messages_per_user_body == null) {
            return false;
        }
        return true;
    }

    public final void a(int i) {
        if (!a.b(this.f21053a) && !a.e(this.f21053a)) {
            this.f21054b = i;
            if (i != 1) {
                c.a();
            }
            a.c(this.f21053a);
            a(this.f21053a, new RequestBody.Builder().messages_per_user_body(new MessagesPerUserRequestBody.Builder().cursor(Long.valueOf(i.a().a(this.f21053a))).build()).build(), null, new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(f fVar, Runnable runnable) {
        boolean z;
        boolean z2 = false;
        if (!fVar.g() || !a(fVar)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            MessagesPerUserResponseBody messagesPerUserResponseBody = fVar.g.body.messages_per_user_body;
            i.a().a(this.f21053a, messagesPerUserResponseBody.next_cursor.longValue());
            if (messagesPerUserResponseBody.messages != null && messagesPerUserResponseBody.messages.size() > 0) {
                z2 = true;
            }
            if (z2) {
                final List<MessageBody> list = messagesPerUserResponseBody.messages;
                final boolean booleanValue = messagesPerUserResponseBody.has_more.booleanValue();
                e.a(new d<Map<String, List<n>>>() {
                    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.lang.Object} */
                    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: com.bytedance.im.core.d.n} */
                    /* access modifiers changed from: private */
                    /* JADX WARNING: Multi-variable type inference failed */
                    /* renamed from: b */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public java.util.Map<java.lang.String, java.util.List<com.bytedance.im.core.d.n>> a() {
                        /*
                            r12 = this;
                            com.bytedance.im.core.b.a.a.d.a()
                            java.lang.String r0 = "GetMsgByUserHandler.saveMsg(List)"
                            com.bytedance.im.core.b.a.a.d.a(r0)
                            java.util.HashMap r0 = new java.util.HashMap
                            r0.<init>()
                            long r1 = android.os.SystemClock.uptimeMillis()
                            java.util.List r3 = r3
                            java.util.Iterator r3 = r3.iterator()
                        L_0x0017:
                            boolean r4 = r3.hasNext()
                            r5 = 0
                            r6 = 3
                            if (r4 == 0) goto L_0x005a
                            java.lang.Object r4 = r3.next()
                            com.bytedance.im.core.proto.MessageBody r4 = (com.bytedance.im.core.proto.MessageBody) r4
                            java.lang.String r7 = r4.conversation_id
                            r8 = 0
                            android.util.Pair r9 = new android.util.Pair
                            java.lang.String r10 = "s:msg_get_by_pull"
                            java.lang.String r11 = "1"
                            r9.<init>(r10, r11)
                            android.util.Pair r4 = com.bytedance.im.core.b.b.a.u.a((com.bytedance.im.core.proto.MessageBody) r4, (boolean) r8, (android.util.Pair<java.lang.String, java.lang.String>) r9, (int) r6)
                            if (r4 == 0) goto L_0x003c
                            java.lang.Object r4 = r4.first
                            r5 = r4
                            com.bytedance.im.core.d.n r5 = (com.bytedance.im.core.d.n) r5
                        L_0x003c:
                            if (r5 == 0) goto L_0x0017
                            boolean r4 = r0.containsKey(r7)
                            if (r4 == 0) goto L_0x004e
                            java.lang.Object r4 = r0.get(r7)
                            java.util.List r4 = (java.util.List) r4
                            r4.add(r5)
                            goto L_0x0017
                        L_0x004e:
                            java.util.ArrayList r4 = new java.util.ArrayList
                            r4.<init>()
                            r4.add(r5)
                            r0.put(r7, r4)
                            goto L_0x0017
                        L_0x005a:
                            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x007f }
                            r3.<init>()     // Catch:{ Exception -> 0x007f }
                            java.lang.String r4 = "duration"
                            long r7 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x007f }
                            r9 = 0
                            long r7 = r7 - r1
                            r3.put(r4, r7)     // Catch:{ Exception -> 0x007f }
                            java.lang.String r1 = "msg_count"
                            java.util.List r2 = r3     // Catch:{ Exception -> 0x007f }
                            int r2 = r2.size()     // Catch:{ Exception -> 0x007f }
                            r3.put(r1, r2)     // Catch:{ Exception -> 0x007f }
                            java.lang.String r1 = "msg_source"
                            r3.put(r1, r6)     // Catch:{ Exception -> 0x007f }
                            java.lang.String r1 = "im_save_msg_list_duration"
                            com.bytedance.im.core.c.d.a((java.lang.String) r1, (org.json.JSONObject) r3, (org.json.JSONObject) r5)     // Catch:{ Exception -> 0x007f }
                        L_0x007f:
                            java.util.Set r1 = r0.keySet()
                            java.util.Iterator r1 = r1.iterator()
                        L_0x0087:
                            boolean r2 = r1.hasNext()
                            if (r2 == 0) goto L_0x011f
                            java.lang.Object r2 = r1.next()
                            r3 = r2
                            java.lang.String r3 = (java.lang.String) r3
                            java.lang.Object r2 = r0.get(r3)
                            java.util.List r2 = (java.util.List) r2
                            if (r2 == 0) goto L_0x0087
                            boolean r4 = r2.isEmpty()
                            if (r4 != 0) goto L_0x0087
                            int r4 = r2.size()
                            int r4 = r4 + -1
                            java.lang.Object r2 = r2.get(r4)
                            com.bytedance.im.core.d.n r2 = (com.bytedance.im.core.d.n) r2
                            com.bytedance.im.core.b.a.k.a()
                            com.bytedance.im.core.d.b r10 = com.bytedance.im.core.b.a.k.a((java.lang.String) r3)
                            if (r10 != 0) goto L_0x00f6
                            com.bytedance.im.core.b.b.a.j r3 = com.bytedance.im.core.b.b.a.j.this
                            int r3 = r3.f21053a
                            if (r2 == 0) goto L_0x0087
                            com.bytedance.im.core.proto.MessageBody$Builder r4 = new com.bytedance.im.core.proto.MessageBody$Builder
                            r4.<init>()
                            java.lang.String r5 = r2.getConversationId()
                            com.bytedance.im.core.proto.MessageBody$Builder r4 = r4.conversation_id(r5)
                            long r5 = r2.getConversationShortId()
                            java.lang.Long r5 = java.lang.Long.valueOf(r5)
                            com.bytedance.im.core.proto.MessageBody$Builder r4 = r4.conversation_short_id(r5)
                            int r5 = r2.getConversationType()
                            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                            com.bytedance.im.core.proto.MessageBody$Builder r4 = r4.conversation_type(r5)
                            long r5 = r2.getCreatedAt()
                            java.lang.Long r2 = java.lang.Long.valueOf(r5)
                            com.bytedance.im.core.proto.MessageBody$Builder r2 = r4.create_time(r2)
                            com.bytedance.im.core.proto.MessageBody r2 = r2.build()
                            com.bytedance.im.core.b.b.a.a((int) r3, (com.bytedance.im.core.proto.MessageBody) r2)
                            goto L_0x0087
                        L_0x00f6:
                            com.bytedance.im.core.b.a.o.a()
                            long r4 = r10.getReadIndex()
                            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                            com.bytedance.im.core.a.c r8 = com.bytedance.im.core.a.c.a()
                            com.bytedance.im.core.a.a r8 = r8.f20879c
                            long r8 = r8.a()
                            long r7 = com.bytedance.im.core.b.a.o.a((java.lang.String) r3, (long) r4, (long) r6, (long) r8)
                            long r5 = r2.getIndex()
                            long r2 = com.bytedance.im.core.b.e.f.b((com.bytedance.im.core.d.n) r2)
                            r4 = r10
                            r9 = r2
                            com.bytedance.im.core.b.b.a.u.a((com.bytedance.im.core.d.b) r4, (long) r5, (long) r7, (long) r9)
                            goto L_0x0087
                        L_0x011f:
                            com.bytedance.im.core.b.a.a.d.a()
                            java.lang.String r1 = "GetMsgByUserHandler.saveMsg(List)"
                            com.bytedance.im.core.b.a.a.d.b(r1)
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.b.b.a.j.AnonymousClass1.a():java.util.Map");
                    }
                }, new com.bytedance.im.core.b.d.c<Map<String, List<n>>>() {
                    public final /* synthetic */ void a(Object obj) {
                        boolean z;
                        Map map = (Map) obj;
                        if (map != null && !map.isEmpty()) {
                            ArrayList arrayList = new ArrayList();
                            for (String str : map.keySet()) {
                                g.a().c((List) map.get(str));
                                List a2 = com.bytedance.im.core.b.e.f.a(str, (List) map.get(str));
                                if (a2 != null) {
                                    arrayList.addAll(a2);
                                }
                                int i = j.this.f21053a;
                                if (!a.f20951f.containsKey(Integer.valueOf(i)) || !a.f20951f.get(Integer.valueOf(i)).containsKey(str)) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (!z) {
                                    com.bytedance.im.core.d.d.a().b(com.bytedance.im.core.d.d.a().a(str));
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                c.a().f20879c.a((List<n>) arrayList);
                            }
                        }
                        if (c.a().b().t == 1 || !(j.this.f21054b == 0 || j.this.f21054b == 1)) {
                            a.a();
                            return;
                        }
                        if (!booleanValue && c.a().b().t == 2) {
                            if (a.a(j.this.f21053a)) {
                                a.a();
                                return;
                            }
                            a.a(j.this.f21053a, 1);
                        }
                    }
                }, com.bytedance.im.core.b.d.a.c());
            }
            a.d(this.f21053a);
            if (messagesPerUserResponseBody.has_more.booleanValue()) {
                a(1);
            } else {
                m.a();
                m.a(this.f21053a);
                if (!z2 && c.a().b().t == 2) {
                    if (a.a(this.f21053a)) {
                        a.a();
                    } else {
                        a.a(this.f21053a, 1);
                    }
                }
                c.a();
                com.bytedance.im.core.d.d.a().g();
                com.bytedance.im.core.c.d.a(fVar, true).b();
            }
        } else {
            a.d(this.f21053a);
            a.a(this.f21053a, 2);
            c.a();
            com.bytedance.im.core.c.d.a(fVar, false).b();
        }
    }
}

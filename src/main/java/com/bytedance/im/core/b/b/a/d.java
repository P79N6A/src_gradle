package com.bytedance.im.core.b.b.a;

import com.bytedance.im.core.b.a.o;
import com.bytedance.im.core.b.b.a;
import com.bytedance.im.core.b.e.g;
import com.bytedance.im.core.d.b;
import com.bytedance.im.core.d.k;
import com.bytedance.im.core.proto.MessageBody;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class d {
    @SerializedName("command_type")

    /* renamed from: a  reason: collision with root package name */
    private int f20992a;
    @SerializedName("inbox_type")

    /* renamed from: b  reason: collision with root package name */
    private int f20993b;
    @SerializedName("conversation_id")

    /* renamed from: c  reason: collision with root package name */
    private String f20994c;
    @SerializedName("message_id")

    /* renamed from: d  reason: collision with root package name */
    private long f20995d;
    @SerializedName("read_index")

    /* renamed from: e  reason: collision with root package name */
    private long f20996e;
    @SerializedName("conversation_version")

    /* renamed from: f  reason: collision with root package name */
    private long f20997f;
    @SerializedName("group_version")
    private long g;
    @SerializedName("removed_participant")
    private List<Long> h;

    d() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0167, code lost:
        if (r14.removeMentionMessage(r1.getUuid()) != false) goto L_0x0169;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0275 A[Catch:{ Exception -> 0x0336 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0292 A[Catch:{ Exception -> 0x0336 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02cc A[Catch:{ Exception -> 0x0336 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x016c A[Catch:{ Exception -> 0x01fd }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(com.bytedance.im.core.proto.MessageBody r14) {
        /*
            java.lang.Integer r0 = r14.message_type
            int r0 = r0.intValue()
            com.bytedance.im.core.proto.MessageType r1 = com.bytedance.im.core.proto.MessageType.MESSAGE_TYPE_COMMAND
            int r1 = r1.getValue()
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L_0x0204
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x01fd }
            java.lang.String r1 = r14.content     // Catch:{ Exception -> 0x01fd }
            r0.<init>(r1)     // Catch:{ Exception -> 0x01fd }
            com.google.gson.Gson r1 = com.bytedance.im.core.b.e.c.f21187a     // Catch:{ Exception -> 0x01fd }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01fd }
            java.lang.Class<com.bytedance.im.core.b.b.a.d> r5 = com.bytedance.im.core.b.b.a.d.class
            java.lang.Object r0 = r1.fromJson((java.lang.String) r0, (java.lang.Class<T>) r5)     // Catch:{ Exception -> 0x01fd }
            com.bytedance.im.core.b.b.a.d r0 = (com.bytedance.im.core.b.b.a.d) r0     // Catch:{ Exception -> 0x01fd }
            int r1 = r0.f20992a     // Catch:{ Exception -> 0x01fd }
            switch(r1) {
                case 1: goto L_0x017a;
                case 2: goto L_0x010f;
                case 3: goto L_0x00e6;
                case 4: goto L_0x00e1;
                case 5: goto L_0x002b;
                case 6: goto L_0x00bb;
                case 7: goto L_0x003b;
                case 8: goto L_0x0034;
                case 9: goto L_0x002d;
                default: goto L_0x002b;
            }     // Catch:{ Exception -> 0x01fd }
        L_0x002b:
            goto L_0x0203
        L_0x002d:
            java.lang.String r14 = r0.f20994c     // Catch:{ Exception -> 0x01fd }
            a(r14, r4)     // Catch:{ Exception -> 0x01fd }
            goto L_0x0203
        L_0x0034:
            java.lang.String r14 = r0.f20994c     // Catch:{ Exception -> 0x01fd }
            com.bytedance.im.core.b.b.a.u.a(r14)     // Catch:{ Exception -> 0x01fd }
            goto L_0x0203
        L_0x003b:
            if (r0 == 0) goto L_0x0059
            java.util.List<java.lang.Long> r1 = r0.h     // Catch:{ Exception -> 0x01fd }
            if (r1 == 0) goto L_0x0059
            java.util.List<java.lang.Long> r1 = r0.h     // Catch:{ Exception -> 0x01fd }
            com.bytedance.im.core.a.c r5 = com.bytedance.im.core.a.c.a()     // Catch:{ Exception -> 0x01fd }
            com.bytedance.im.core.a.a r5 = r5.f20879c     // Catch:{ Exception -> 0x01fd }
            long r5 = r5.a()     // Catch:{ Exception -> 0x01fd }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x01fd }
            boolean r1 = r1.contains(r5)     // Catch:{ Exception -> 0x01fd }
            if (r1 == 0) goto L_0x0059
            r1 = 1
            goto L_0x005a
        L_0x0059:
            r1 = 0
        L_0x005a:
            java.util.List<java.lang.Long> r5 = r0.h     // Catch:{ Exception -> 0x01fd }
            if (r5 == 0) goto L_0x0096
            java.util.List<java.lang.Long> r5 = r0.h     // Catch:{ Exception -> 0x01fd }
            int r5 = r5.size()     // Catch:{ Exception -> 0x01fd }
            if (r5 <= 0) goto L_0x0096
            com.bytedance.im.core.b.a.l.a()     // Catch:{ Exception -> 0x01fd }
            java.lang.String r2 = r0.f20994c     // Catch:{ Exception -> 0x01fd }
            java.util.List<java.lang.Long> r5 = r0.h     // Catch:{ Exception -> 0x01fd }
            int r2 = com.bytedance.im.core.b.a.l.c(r2, r5)     // Catch:{ Exception -> 0x01fd }
            com.bytedance.im.core.b.a.k.a()     // Catch:{ Exception -> 0x01fd }
            java.lang.String r5 = r0.f20994c     // Catch:{ Exception -> 0x01fd }
            com.bytedance.im.core.d.b r5 = com.bytedance.im.core.b.a.k.a((java.lang.String) r5)     // Catch:{ Exception -> 0x01fd }
            if (r5 == 0) goto L_0x0095
            if (r2 <= 0) goto L_0x0095
            int r6 = r5.getMemberCount()     // Catch:{ Exception -> 0x01fd }
            int r6 = r6 - r2
            int r2 = java.lang.Math.max(r3, r6)     // Catch:{ Exception -> 0x01fd }
            r5.setMemberCount(r2)     // Catch:{ Exception -> 0x01fd }
            if (r1 == 0) goto L_0x008f
            r5.setIsMember(r3)     // Catch:{ Exception -> 0x01fd }
        L_0x008f:
            com.bytedance.im.core.b.a.k.a()     // Catch:{ Exception -> 0x01fd }
            com.bytedance.im.core.b.a.k.b((com.bytedance.im.core.d.b) r5)     // Catch:{ Exception -> 0x01fd }
        L_0x0095:
            r2 = r5
        L_0x0096:
            if (r1 == 0) goto L_0x00b6
            if (r2 == 0) goto L_0x00a6
            com.bytedance.im.core.b.b.a.m r14 = com.bytedance.im.core.b.b.a.m.a()     // Catch:{ Exception -> 0x01fd }
            com.bytedance.im.core.b.b.a.d$7 r0 = new com.bytedance.im.core.b.b.a.d$7     // Catch:{ Exception -> 0x01fd }
            r0.<init>(r2)     // Catch:{ Exception -> 0x01fd }
            r14.a((java.lang.Runnable) r0)     // Catch:{ Exception -> 0x01fd }
        L_0x00a6:
            if (r2 == 0) goto L_0x0203
            com.bytedance.im.core.b.b.a.m r14 = com.bytedance.im.core.b.b.a.m.a()     // Catch:{ Exception -> 0x01fd }
            com.bytedance.im.core.b.b.a.d$8 r0 = new com.bytedance.im.core.b.b.a.d$8     // Catch:{ Exception -> 0x01fd }
            r0.<init>(r2)     // Catch:{ Exception -> 0x01fd }
            r14.a((java.lang.Runnable) r0)     // Catch:{ Exception -> 0x01fd }
            goto L_0x0203
        L_0x00b6:
            a(r0, r14, r4)     // Catch:{ Exception -> 0x01fd }
            goto L_0x0203
        L_0x00bb:
            com.bytedance.im.core.b.a.k.a()     // Catch:{ Exception -> 0x01fd }
            java.lang.String r1 = r0.f20994c     // Catch:{ Exception -> 0x01fd }
            com.bytedance.im.core.d.b r1 = com.bytedance.im.core.b.a.k.a((java.lang.String) r1)     // Catch:{ Exception -> 0x01fd }
            if (r1 == 0) goto L_0x0203
            com.bytedance.im.core.d.c r2 = r1.getCoreInfo()     // Catch:{ Exception -> 0x01fd }
            if (r2 == 0) goto L_0x0203
            com.bytedance.im.core.d.c r1 = r1.getCoreInfo()     // Catch:{ Exception -> 0x01fd }
            long r1 = r1.getVersion()     // Catch:{ Exception -> 0x01fd }
            long r5 = r0.g     // Catch:{ Exception -> 0x01fd }
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0203
            int r0 = r0.f20993b     // Catch:{ Exception -> 0x01fd }
            com.bytedance.im.core.b.b.a.a((int) r0, (com.bytedance.im.core.proto.MessageBody) r14)     // Catch:{ Exception -> 0x01fd }
            goto L_0x0203
        L_0x00e1:
            a(r0, r14, r3)     // Catch:{ Exception -> 0x01fd }
            goto L_0x0203
        L_0x00e6:
            com.bytedance.im.core.b.a.k.a()     // Catch:{ Exception -> 0x01fd }
            java.lang.String r14 = r0.f20994c     // Catch:{ Exception -> 0x01fd }
            com.bytedance.im.core.d.b r14 = com.bytedance.im.core.b.a.k.a((java.lang.String) r14)     // Catch:{ Exception -> 0x01fd }
            if (r14 == 0) goto L_0x0106
            com.bytedance.im.core.b.a.k.a()     // Catch:{ Exception -> 0x01fd }
            boolean r1 = com.bytedance.im.core.b.a.k.c((com.bytedance.im.core.d.b) r14)     // Catch:{ Exception -> 0x01fd }
            if (r1 == 0) goto L_0x0106
            com.bytedance.im.core.b.b.a.m r1 = com.bytedance.im.core.b.b.a.m.a()     // Catch:{ Exception -> 0x01fd }
            com.bytedance.im.core.b.b.a.d$5 r2 = new com.bytedance.im.core.b.b.a.d$5     // Catch:{ Exception -> 0x01fd }
            r2.<init>(r14)     // Catch:{ Exception -> 0x01fd }
            r1.a((java.lang.Runnable) r2)     // Catch:{ Exception -> 0x01fd }
        L_0x0106:
            int r14 = r0.f20993b     // Catch:{ Exception -> 0x01fd }
            java.lang.String r0 = r0.f20994c     // Catch:{ Exception -> 0x01fd }
            com.bytedance.im.core.b.b.a.a((int) r14, (java.lang.String) r0)     // Catch:{ Exception -> 0x01fd }
            goto L_0x0203
        L_0x010f:
            com.bytedance.im.core.d.d r14 = com.bytedance.im.core.d.d.a()     // Catch:{ Exception -> 0x01fd }
            java.lang.String r1 = r0.f20994c     // Catch:{ Exception -> 0x01fd }
            com.bytedance.im.core.d.b r14 = r14.a((java.lang.String) r1)     // Catch:{ Exception -> 0x01fd }
            if (r14 == 0) goto L_0x0203
            com.bytedance.im.core.d.n r1 = r14.getLastMessage()     // Catch:{ Exception -> 0x01fd }
            if (r1 != 0) goto L_0x0123
            goto L_0x0203
        L_0x0123:
            com.bytedance.im.core.b.a.o.a()     // Catch:{ Exception -> 0x01fd }
            long r1 = r0.f20995d     // Catch:{ Exception -> 0x01fd }
            com.bytedance.im.core.d.n r1 = com.bytedance.im.core.b.a.o.a((long) r1)     // Catch:{ Exception -> 0x01fd }
            if (r1 == 0) goto L_0x0203
            r1.setDeleted(r4)     // Catch:{ Exception -> 0x01fd }
            com.bytedance.im.core.d.n r2 = r14.getLastMessage()     // Catch:{ Exception -> 0x01fd }
            com.bytedance.im.core.b.a.o.a()     // Catch:{ Exception -> 0x01fd }
            java.lang.String r5 = r1.getUuid()     // Catch:{ Exception -> 0x01fd }
            boolean r5 = com.bytedance.im.core.b.a.o.a((java.lang.String) r5)     // Catch:{ Exception -> 0x01fd }
            if (r5 == 0) goto L_0x015d
            java.lang.String r2 = r2.getUuid()     // Catch:{ Exception -> 0x01fd }
            java.lang.String r6 = r1.getUuid()     // Catch:{ Exception -> 0x01fd }
            boolean r2 = r2.equals(r6)     // Catch:{ Exception -> 0x01fd }
            if (r2 == 0) goto L_0x015d
            com.bytedance.im.core.b.a.o.a()     // Catch:{ Exception -> 0x01fd }
            java.lang.String r0 = r0.f20994c     // Catch:{ Exception -> 0x01fd }
            com.bytedance.im.core.d.n r0 = com.bytedance.im.core.b.a.o.g(r0)     // Catch:{ Exception -> 0x01fd }
            r14.setLastMessage(r0)     // Catch:{ Exception -> 0x01fd }
            goto L_0x0169
        L_0x015d:
            if (r5 == 0) goto L_0x016a
            java.lang.String r0 = r1.getUuid()     // Catch:{ Exception -> 0x01fd }
            boolean r0 = r14.removeMentionMessage(r0)     // Catch:{ Exception -> 0x01fd }
            if (r0 == 0) goto L_0x016a
        L_0x0169:
            r3 = 1
        L_0x016a:
            if (r5 == 0) goto L_0x0203
            com.bytedance.im.core.b.b.a.m r0 = com.bytedance.im.core.b.b.a.m.a()     // Catch:{ Exception -> 0x01fd }
            com.bytedance.im.core.b.b.a.d$4 r2 = new com.bytedance.im.core.b.b.a.d$4     // Catch:{ Exception -> 0x01fd }
            r2.<init>(r1, r3, r14)     // Catch:{ Exception -> 0x01fd }
            r0.a((java.lang.Runnable) r2)     // Catch:{ Exception -> 0x01fd }
            goto L_0x0203
        L_0x017a:
            com.bytedance.im.core.b.a.k.a()     // Catch:{ Exception -> 0x01fd }
            java.lang.String r14 = r0.f20994c     // Catch:{ Exception -> 0x01fd }
            com.bytedance.im.core.d.b r14 = com.bytedance.im.core.b.a.k.a((java.lang.String) r14)     // Catch:{ Exception -> 0x01fd }
            if (r14 == 0) goto L_0x0203
            long r5 = r0.f20996e     // Catch:{ Exception -> 0x01fd }
            long r7 = r14.getReadIndex()     // Catch:{ Exception -> 0x01fd }
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x0203
            long r5 = r14.getUnreadCount()     // Catch:{ Exception -> 0x01fd }
            com.bytedance.im.core.b.a.o.a()     // Catch:{ Exception -> 0x01fd }
            java.lang.String r7 = r14.getConversationId()     // Catch:{ Exception -> 0x01fd }
            long r8 = r14.getReadIndex()     // Catch:{ Exception -> 0x01fd }
            long r10 = r0.f20996e     // Catch:{ Exception -> 0x01fd }
            com.bytedance.im.core.a.c r1 = com.bytedance.im.core.a.c.a()     // Catch:{ Exception -> 0x01fd }
            com.bytedance.im.core.a.a r1 = r1.f20879c     // Catch:{ Exception -> 0x01fd }
            long r12 = r1.a()     // Catch:{ Exception -> 0x01fd }
            long r7 = com.bytedance.im.core.b.a.o.a((java.lang.String) r7, (long) r8, (long) r10, (long) r12)     // Catch:{ Exception -> 0x01fd }
            r1 = 0
            long r5 = r5 - r7
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 < 0) goto L_0x01b8
            r9 = r5
            goto L_0x01b9
        L_0x01b8:
            r9 = r7
        L_0x01b9:
            r14.setUnreadCount(r9)     // Catch:{ Exception -> 0x01fd }
            long r9 = r0.f20996e     // Catch:{ Exception -> 0x01fd }
            r14.setReadIndex(r9)     // Catch:{ Exception -> 0x01fd }
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x01d1
            com.bytedance.im.core.b.a.n.a()     // Catch:{ Exception -> 0x01fd }
            java.lang.String r1 = r0.f20994c     // Catch:{ Exception -> 0x01fd }
            com.bytedance.im.core.b.a.n.b(r1)     // Catch:{ Exception -> 0x01fd }
            r14.setMentionMessages(r2)     // Catch:{ Exception -> 0x01fd }
            goto L_0x01df
        L_0x01d1:
            com.bytedance.im.core.b.a.n.a()     // Catch:{ Exception -> 0x01fd }
            java.lang.String r1 = r0.f20994c     // Catch:{ Exception -> 0x01fd }
            long r2 = r0.f20996e     // Catch:{ Exception -> 0x01fd }
            java.util.List r1 = com.bytedance.im.core.b.a.n.a(r1, r2)     // Catch:{ Exception -> 0x01fd }
            r14.setMentionMessages(r1)     // Catch:{ Exception -> 0x01fd }
        L_0x01df:
            com.bytedance.im.core.b.a.k.a()     // Catch:{ Exception -> 0x01fd }
            boolean r1 = com.bytedance.im.core.b.a.k.b((com.bytedance.im.core.d.b) r14)     // Catch:{ Exception -> 0x01fd }
            if (r1 == 0) goto L_0x0203
            com.bytedance.im.core.b.a.o.a()     // Catch:{ Exception -> 0x01fd }
            java.lang.String r0 = r0.f20994c     // Catch:{ Exception -> 0x01fd }
            com.bytedance.im.core.b.a.o.h(r0)     // Catch:{ Exception -> 0x01fd }
            com.bytedance.im.core.b.b.a.m r0 = com.bytedance.im.core.b.b.a.m.a()     // Catch:{ Exception -> 0x01fd }
            com.bytedance.im.core.b.b.a.d$3 r1 = new com.bytedance.im.core.b.b.a.d$3     // Catch:{ Exception -> 0x01fd }
            r1.<init>(r14)     // Catch:{ Exception -> 0x01fd }
            r0.a((java.lang.Runnable) r1)     // Catch:{ Exception -> 0x01fd }
            goto L_0x0203
        L_0x01fd:
            r14 = move-exception
            java.lang.String r0 = "handle command"
            com.bytedance.im.core.b.e.d.a((java.lang.String) r0, (java.lang.Throwable) r14)
        L_0x0203:
            return r4
        L_0x0204:
            java.lang.Integer r0 = r14.message_type
            int r0 = r0.intValue()
            com.bytedance.im.core.proto.MessageType r1 = com.bytedance.im.core.proto.MessageType.MESSAGE_TYPE_UPDATE_MESSAGE
            int r1 = r1.getValue()
            if (r0 != r1) goto L_0x033d
            java.util.Map<java.lang.String, java.lang.String> r0 = r14.ext     // Catch:{ Exception -> 0x0336 }
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0236
            java.lang.String r5 = "s:client_message_id"
            boolean r5 = r0.containsKey(r5)     // Catch:{ Exception -> 0x0336 }
            if (r5 == 0) goto L_0x0236
            java.lang.String r5 = "s:client_message_id"
            java.lang.Object r5 = r0.get(r5)     // Catch:{ Exception -> 0x0336 }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ Exception -> 0x0336 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0336 }
            if (r5 != 0) goto L_0x0236
            java.lang.String r1 = "s:client_message_id"
            java.lang.Object r1 = r0.get(r1)     // Catch:{ Exception -> 0x0336 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0336 }
        L_0x0236:
            if (r0 == 0) goto L_0x0272
            java.lang.String r5 = "s:server_message_id"
            boolean r5 = r0.containsKey(r5)     // Catch:{ Exception -> 0x0336 }
            if (r5 == 0) goto L_0x0272
            java.lang.String r5 = "s:server_message_id"
            java.lang.Object r5 = r0.get(r5)     // Catch:{ Exception -> 0x0336 }
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ Exception -> 0x0336 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0336 }
            if (r5 != 0) goto L_0x0272
            java.lang.String r5 = "s:server_message_id"
            java.lang.Object r0 = r0.get(r5)     // Catch:{ Exception -> 0x0336 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0336 }
            long r5 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x0336 }
            com.bytedance.im.core.b.a.o.a()     // Catch:{ Exception -> 0x0336 }
            com.bytedance.im.core.d.n r0 = com.bytedance.im.core.b.a.o.a((long) r5)     // Catch:{ Exception -> 0x0336 }
            if (r0 == 0) goto L_0x0272
            java.lang.Long r5 = r14.version     // Catch:{ Exception -> 0x0336 }
            long r5 = r5.longValue()     // Catch:{ Exception -> 0x0336 }
            long r7 = r0.getVersion()     // Catch:{ Exception -> 0x0336 }
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0272
            goto L_0x0273
        L_0x0272:
            r0 = r2
        L_0x0273:
            if (r0 != 0) goto L_0x0290
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0336 }
            if (r0 == 0) goto L_0x0289
            com.bytedance.im.core.b.a.o.a()     // Catch:{ Exception -> 0x0336 }
            java.lang.Long r0 = r14.server_message_id     // Catch:{ Exception -> 0x0336 }
            long r5 = r0.longValue()     // Catch:{ Exception -> 0x0336 }
            com.bytedance.im.core.d.n r0 = com.bytedance.im.core.b.a.o.a((long) r5)     // Catch:{ Exception -> 0x0336 }
            goto L_0x0290
        L_0x0289:
            com.bytedance.im.core.b.a.o.a()     // Catch:{ Exception -> 0x0336 }
            com.bytedance.im.core.d.n r0 = com.bytedance.im.core.b.a.o.c(r1)     // Catch:{ Exception -> 0x0336 }
        L_0x0290:
            if (r0 == 0) goto L_0x033c
            com.bytedance.im.core.d.n r14 = com.bytedance.im.core.b.e.b.a((java.lang.String) r1, (com.bytedance.im.core.d.n) r0, (com.bytedance.im.core.proto.MessageBody) r14, (boolean) r4)     // Catch:{ Exception -> 0x0336 }
            com.bytedance.im.core.b.a.o r0 = com.bytedance.im.core.b.a.o.a()     // Catch:{ Exception -> 0x0336 }
            boolean r0 = r0.a((com.bytedance.im.core.d.n) r14)     // Catch:{ Exception -> 0x0336 }
            if (r0 == 0) goto L_0x033c
            boolean r0 = r14.isRecalled()     // Catch:{ Exception -> 0x0336 }
            if (r0 == 0) goto L_0x02be
            java.util.List r0 = r14.getMentionIds()     // Catch:{ Exception -> 0x0336 }
            if (r0 == 0) goto L_0x02be
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x0336 }
            if (r0 != 0) goto L_0x02be
            com.bytedance.im.core.b.a.n.a()     // Catch:{ Exception -> 0x0336 }
            java.lang.String r0 = r14.getUuid()     // Catch:{ Exception -> 0x0336 }
            boolean r0 = com.bytedance.im.core.b.a.n.a((java.lang.String) r0)     // Catch:{ Exception -> 0x0336 }
            goto L_0x02bf
        L_0x02be:
            r0 = 0
        L_0x02bf:
            com.bytedance.im.core.b.a.k.a()     // Catch:{ Exception -> 0x0336 }
            java.lang.String r1 = r14.getConversationId()     // Catch:{ Exception -> 0x0336 }
            com.bytedance.im.core.d.b r1 = com.bytedance.im.core.b.a.k.a((java.lang.String) r1)     // Catch:{ Exception -> 0x0336 }
            if (r1 == 0) goto L_0x033c
            com.bytedance.im.core.d.n r2 = r1.getLastMessage()     // Catch:{ Exception -> 0x0336 }
            if (r2 != 0) goto L_0x02d3
            goto L_0x033c
        L_0x02d3:
            com.bytedance.im.core.b.a.o.a()     // Catch:{ Exception -> 0x0336 }
            java.lang.String r5 = r14.getConversationId()     // Catch:{ Exception -> 0x0336 }
            long r6 = r1.getReadIndex()     // Catch:{ Exception -> 0x0336 }
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            com.bytedance.im.core.a.c r2 = com.bytedance.im.core.a.c.a()     // Catch:{ Exception -> 0x0336 }
            com.bytedance.im.core.a.a r2 = r2.f20879c     // Catch:{ Exception -> 0x0336 }
            long r10 = r2.a()     // Catch:{ Exception -> 0x0336 }
            long r5 = com.bytedance.im.core.b.a.o.a((java.lang.String) r5, (long) r6, (long) r8, (long) r10)     // Catch:{ Exception -> 0x0336 }
            long r7 = r1.getUnreadCount()     // Catch:{ Exception -> 0x0336 }
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x02fa
            r3 = 1
        L_0x02fa:
            r1.setUnreadCount(r5)     // Catch:{ Exception -> 0x0336 }
            java.lang.String r2 = r14.getUuid()     // Catch:{ Exception -> 0x0336 }
            com.bytedance.im.core.d.n r5 = r1.getLastMessage()     // Catch:{ Exception -> 0x0336 }
            java.lang.String r5 = r5.getUuid()     // Catch:{ Exception -> 0x0336 }
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x0336 }
            if (r2 == 0) goto L_0x0313
            r1.setLastMessage(r14)     // Catch:{ Exception -> 0x0336 }
            r3 = 1
        L_0x0313:
            com.bytedance.im.core.b.a.k.a()     // Catch:{ Exception -> 0x0336 }
            com.bytedance.im.core.b.a.k.b((com.bytedance.im.core.d.b) r1)     // Catch:{ Exception -> 0x0336 }
            com.bytedance.im.core.b.b.a.m r2 = com.bytedance.im.core.b.b.a.m.a()     // Catch:{ Exception -> 0x0336 }
            com.bytedance.im.core.b.b.a.d$1 r5 = new com.bytedance.im.core.b.b.a.d$1     // Catch:{ Exception -> 0x0336 }
            r5.<init>(r14)     // Catch:{ Exception -> 0x0336 }
            r2.a((java.lang.Runnable) r5)     // Catch:{ Exception -> 0x0336 }
            if (r3 != 0) goto L_0x0329
            if (r0 == 0) goto L_0x033c
        L_0x0329:
            com.bytedance.im.core.b.b.a.m r14 = com.bytedance.im.core.b.b.a.m.a()     // Catch:{ Exception -> 0x0336 }
            com.bytedance.im.core.b.b.a.d$2 r0 = new com.bytedance.im.core.b.b.a.d$2     // Catch:{ Exception -> 0x0336 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0336 }
            r14.a((java.lang.Runnable) r0)     // Catch:{ Exception -> 0x0336 }
            goto L_0x033c
        L_0x0336:
            r14 = move-exception
            java.lang.String r0 = "handle update"
            com.bytedance.im.core.b.e.d.a((java.lang.String) r0, (java.lang.Throwable) r14)
        L_0x033c:
            return r4
        L_0x033d:
            java.lang.Integer r0 = r14.message_type
            int r0 = r0.intValue()
            com.bytedance.im.core.proto.MessageType r1 = com.bytedance.im.core.proto.MessageType.MESSAGE_TYPE_MODE_CHANGE
            int r1 = r1.getValue()
            if (r0 != r1) goto L_0x0351
            java.lang.String r14 = r14.conversation_id
            a(r14, r3)
            return r4
        L_0x0351:
            java.lang.Integer r0 = r14.message_type
            int r0 = r0.intValue()
            com.bytedance.im.core.proto.MessageType r1 = com.bytedance.im.core.proto.MessageType.MESSAGE_TYPE_CONVERSATION_DESTROY
            int r1 = r1.getValue()
            if (r0 != r1) goto L_0x03c7
            com.bytedance.im.core.b.a.k.a()
            java.lang.String r0 = r14.conversation_id
            com.bytedance.im.core.d.b r0 = com.bytedance.im.core.b.a.k.a((java.lang.String) r0)
            if (r0 == 0) goto L_0x03c6
            com.bytedance.im.core.b.a.k.a()
            java.lang.String r1 = r0.getConversationId()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0378
            goto L_0x03ae
        L_0x0378:
            com.bytedance.im.core.b.a.a.d.a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "update conversation_list set "
            r2.<init>(r3)
            com.bytedance.im.core.b.a.b r3 = com.bytedance.im.core.b.a.b.COLUMN_STATUS
            java.lang.String r3 = r3.key
            r2.append(r3)
            java.lang.String r3 = "=1"
            r2.append(r3)
            java.lang.String r3 = " where "
            r2.append(r3)
            com.bytedance.im.core.b.a.b r3 = com.bytedance.im.core.b.a.b.COLUMN_ID
            java.lang.String r3 = r3.key
            r2.append(r3)
            java.lang.String r3 = "=\""
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "\""
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.bytedance.im.core.b.a.a.d.c(r1)
        L_0x03ae:
            r0.setStatus(r4)
            com.bytedance.im.core.b.b.a.m r1 = com.bytedance.im.core.b.b.a.m.a()
            com.bytedance.im.core.b.b.a.d$9 r2 = new com.bytedance.im.core.b.b.a.d$9
            r2.<init>(r0)
            r1.a((java.lang.Runnable) r2)
            int r0 = r0.getInboxType()
            java.lang.String r14 = r14.conversation_id
            com.bytedance.im.core.b.b.a.a((int) r0, (java.lang.String) r14)
        L_0x03c6:
            return r4
        L_0x03c7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.b.b.a.d.a(com.bytedance.im.core.proto.MessageBody):boolean");
    }

    private static void a(final String str, final boolean z) {
        o.a();
        o.b(str);
        m.a().a((Runnable) new Runnable() {
            public final void run() {
                g a2 = g.a();
                a2.a(str, (g.a<k>) new g.a<k>(z) {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ boolean f21236a;

                    public final /* bridge */ /* synthetic */ void a(Object obj) {
                        ((k) obj).a(this.f21236a);
                    }

                    {
                        this.f21236a = r2;
                    }
                });
            }
        });
    }

    private static void a(d dVar, MessageBody messageBody, boolean z) {
        com.bytedance.im.core.b.a.k.a();
        b a2 = com.bytedance.im.core.b.a.k.a(dVar.f20994c);
        if (a2 == null) {
            return;
        }
        if ((a2.getSettingInfo() != null && a2.getSettingInfo().getVersion() < dVar.f20997f) || z) {
            a.a(dVar.f20993b, messageBody);
        }
    }
}

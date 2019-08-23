package com.bytedance.im.core.d;

import android.text.TextUtils;
import com.bytedance.im.core.b.b.a.m;
import com.bytedance.im.core.b.b.a.y;
import com.bytedance.im.core.b.c.f;
import com.bytedance.im.core.b.e.c;
import com.bytedance.im.core.proto.MessageType;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.im.core.proto.SendMessageRequestBody;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Deprecated
public final class r {
    @SerializedName("inbox_type")

    /* renamed from: a  reason: collision with root package name */
    public int f21315a;
    @SerializedName("conversation_id")

    /* renamed from: b  reason: collision with root package name */
    public String f21316b;
    @SerializedName("conversation_type")

    /* renamed from: c  reason: collision with root package name */
    public int f21317c;
    @SerializedName("action_type")

    /* renamed from: d  reason: collision with root package name */
    public int f21318d;
    @SerializedName("extra")

    /* renamed from: e  reason: collision with root package name */
    public Serializable f21319e;
    @SerializedName("command_type")

    /* renamed from: f  reason: collision with root package name */
    private int f21320f;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final r f21321a = new r((byte) 0);

        @Deprecated
        public final void a() {
            m.a();
            r rVar = this.f21321a;
            y yVar = new y(null);
            if (rVar == null || !(!TextUtils.isEmpty(rVar.f21316b))) {
                yVar.b(f.a(-1015));
                return;
            }
            b a2 = d.a().a(rVar.f21316b);
            if (a2 == null) {
                yVar.b(f.a(-1017));
                return;
            }
            try {
                yVar.a(a2.getInboxType(), new RequestBody.Builder().send_message_body(new SendMessageRequestBody.Builder().conversation_id(a2.getConversationId()).conversation_short_id(Long.valueOf(a2.getConversationShortId())).conversation_type(Integer.valueOf(a2.getConversationType())).content(c.f21187a.toJson((Object) rVar)).message_type(Integer.valueOf(MessageType.MESSAGE_TYPE_USER_ACTION.getValue())).ticket(a2.getTicket()).build()).build(), null, new Object[0]);
            } catch (Exception unused) {
                yVar.b(f.a(-1015));
            }
        }

        public final a a(int i) {
            this.f21321a.f21318d = i;
            return this;
        }

        public final a a(Serializable serializable) {
            this.f21321a.f21319e = serializable;
            return this;
        }

        public final a a(b bVar) {
            this.f21321a.f21316b = bVar.getConversationId();
            this.f21321a.f21317c = bVar.getConversationType();
            this.f21321a.f21315a = bVar.getInboxType();
            return this;
        }
    }

    private r() {
        this.f21320f = 12;
    }

    /* synthetic */ r(byte b2) {
        this();
    }
}

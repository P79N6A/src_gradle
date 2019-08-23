package com.bytedance.im.core.b.c;

import android.os.SystemClock;
import com.bytedance.im.core.a.c;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.b.b.a.l;
import com.bytedance.im.core.b.b.a.m;
import com.bytedance.im.core.b.e.i;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.MessagesPerUserRequestBody;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.Response;

public class f implements Comparable<f> {

    /* renamed from: a  reason: collision with root package name */
    public long f21162a;

    /* renamed from: b  reason: collision with root package name */
    public long f21163b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f21164c;

    /* renamed from: d  reason: collision with root package name */
    public e f21165d;

    /* renamed from: e  reason: collision with root package name */
    public Object[] f21166e;

    /* renamed from: f  reason: collision with root package name */
    public Request f21167f;
    public Response g;
    public l h;
    public int i;
    public long j;
    public long k;
    public int l;
    private int m = c.a().b().l;

    private static f m() {
        return a((e) null);
    }

    public final String h() {
        if (this.g != null) {
            return this.g.error_desc;
        }
        return "";
    }

    public final int d() {
        if (this.f21167f != null) {
            return this.f21167f.cmd.intValue();
        }
        return IMCMD.IMCMD_NOT_USED.getValue();
    }

    public final void a() {
        this.l++;
    }

    public final void c() {
        if (this.f21167f != null && this.l > 0) {
            this.f21163b = l.a.a().b();
            this.f21167f = this.f21167f.newBuilder().sequence_id(Long.valueOf(this.f21163b)).build();
        }
    }

    public final boolean e() {
        int i2 = c.a().b().j;
        if (this.f21164c || i2 == 2 || (i2 == 0 && (this.l >= this.m || !c.a().f20879c.d()))) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if ((SystemClock.uptimeMillis() - this.k < ((long) (this.m * c.a().b().m)) || e()) && SystemClock.uptimeMillis() - this.k < ((long) c.a().b().n)) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        if (this.g == null || this.g.status_code == null || (this.g.status_code.intValue() != d.b.f20889a && this.g.status_code.intValue() != 200)) {
            return false;
        }
        return true;
    }

    public final void b() {
        if (this.f21167f != null && this.f21167f.body != null && this.f21167f.body.messages_per_user_body != null && this.f21167f.cmd.intValue() == IMCMD.GET_MESSAGES_BY_USER.getValue()) {
            this.f21167f = this.f21167f.newBuilder().body(this.f21167f.body.newBuilder().messages_per_user_body(new MessagesPerUserRequestBody.Builder().cursor(Long.valueOf(i.a().a(this.f21167f.inbox_type.intValue()))).build()).build()).build();
        }
    }

    public final int i() {
        try {
            IMCMD fromValue = IMCMD.fromValue(this.f21167f.cmd.intValue());
            if (fromValue == null) {
                return d.b.f20889a;
            }
            if (fromValue == IMCMD.SEND_MESSAGE) {
                return this.g.body.send_message_body.status.intValue();
            }
            if (fromValue == IMCMD.CREATE_CONVERSATION_V2) {
                return this.g.body.create_conversation_v2_body.status.intValue();
            }
            if (fromValue == IMCMD.ADD_CONVERSATION_PARTICIPANTS) {
                return this.g.body.conversation_add_participants_body.status.intValue();
            }
            if (fromValue == IMCMD.REMOVE_CONVERSATION_PARTICIPANTS) {
                return this.g.body.conversation_remove_participants_body.status.intValue();
            }
            if (fromValue == IMCMD.UPDATE_CONVERSATION_PARTICIPANT) {
                return this.g.body.update_conversation_participant_body.status.intValue();
            }
            if (fromValue == IMCMD.SET_CONVERSATION_CORE_INFO) {
                return this.g.body.set_conversation_core_info_body.status.intValue();
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_CORE_EXT_INFO) {
                return this.g.body.upsert_conversation_core_ext_info_body.status.intValue();
            }
            if (fromValue == IMCMD.SET_CONVERSATION_SETTING_INFO) {
                return this.g.body.set_conversation_setting_info_body.status.intValue();
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO) {
                return this.g.body.upsert_conversation_setting_ext_info_body.status.intValue();
            }
            return d.b.f20889a;
        } catch (Exception unused) {
        }
    }

    public final String j() {
        try {
            IMCMD fromValue = IMCMD.fromValue(this.f21167f.cmd.intValue());
            if (fromValue == null) {
                return "";
            }
            if (fromValue == IMCMD.SEND_MESSAGE) {
                return this.g.body.send_message_body.extra_info;
            }
            if (fromValue == IMCMD.CREATE_CONVERSATION_V2) {
                return this.g.body.create_conversation_v2_body.extra_info;
            }
            if (fromValue == IMCMD.ADD_CONVERSATION_PARTICIPANTS) {
                return this.g.body.conversation_add_participants_body.extra_info;
            }
            if (fromValue == IMCMD.REMOVE_CONVERSATION_PARTICIPANTS) {
                return this.g.body.conversation_remove_participants_body.extra_info;
            }
            if (fromValue == IMCMD.UPDATE_CONVERSATION_PARTICIPANT) {
                return this.g.body.update_conversation_participant_body.extra_info;
            }
            if (fromValue == IMCMD.SET_CONVERSATION_CORE_INFO) {
                return this.g.body.set_conversation_core_info_body.extra_info;
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_CORE_EXT_INFO) {
                return this.g.body.upsert_conversation_core_ext_info_body.extra_info;
            }
            if (fromValue == IMCMD.SET_CONVERSATION_SETTING_INFO) {
                return this.g.body.set_conversation_setting_info_body.extra_info;
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO) {
                return this.g.body.upsert_conversation_setting_ext_info_body.extra_info;
            }
            return "";
        } catch (Exception unused) {
        }
    }

    public final long k() {
        try {
            IMCMD fromValue = IMCMD.fromValue(this.f21167f.cmd.intValue());
            if (fromValue == null) {
                return -1000;
            }
            if (fromValue == IMCMD.SEND_MESSAGE) {
                return this.g.body.send_message_body.check_code.longValue();
            }
            if (fromValue == IMCMD.CREATE_CONVERSATION_V2) {
                return this.g.body.create_conversation_v2_body.check_code.longValue();
            }
            if (fromValue == IMCMD.ADD_CONVERSATION_PARTICIPANTS) {
                return this.g.body.conversation_add_participants_body.check_code.longValue();
            }
            if (fromValue == IMCMD.REMOVE_CONVERSATION_PARTICIPANTS) {
                return this.g.body.conversation_remove_participants_body.check_code.longValue();
            }
            if (fromValue == IMCMD.UPDATE_CONVERSATION_PARTICIPANT) {
                return this.g.body.update_conversation_participant_body.check_code.longValue();
            }
            if (fromValue == IMCMD.SET_CONVERSATION_CORE_INFO) {
                return this.g.body.set_conversation_core_info_body.check_code.longValue();
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_CORE_EXT_INFO) {
                return this.g.body.upsert_conversation_core_ext_info_body.check_code.longValue();
            }
            if (fromValue == IMCMD.SET_CONVERSATION_SETTING_INFO) {
                return this.g.body.set_conversation_setting_info_body.check_code.longValue();
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO) {
                return this.g.body.upsert_conversation_setting_ext_info_body.check_code.longValue();
            }
            return -1000;
        } catch (Exception unused) {
        }
    }

    public final String l() {
        try {
            IMCMD fromValue = IMCMD.fromValue(this.f21167f.cmd.intValue());
            if (fromValue == null) {
                return "";
            }
            if (fromValue == IMCMD.SEND_MESSAGE) {
                return this.g.body.send_message_body.check_message;
            }
            if (fromValue == IMCMD.CREATE_CONVERSATION_V2) {
                return this.g.body.create_conversation_v2_body.check_message;
            }
            if (fromValue == IMCMD.ADD_CONVERSATION_PARTICIPANTS) {
                return this.g.body.conversation_add_participants_body.check_message;
            }
            if (fromValue == IMCMD.REMOVE_CONVERSATION_PARTICIPANTS) {
                return this.g.body.conversation_remove_participants_body.check_message;
            }
            if (fromValue == IMCMD.UPDATE_CONVERSATION_PARTICIPANT) {
                return this.g.body.update_conversation_participant_body.check_message;
            }
            if (fromValue == IMCMD.SET_CONVERSATION_CORE_INFO) {
                return this.g.body.set_conversation_core_info_body.check_message;
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_CORE_EXT_INFO) {
                return this.g.body.upsert_conversation_core_ext_info_body.check_message;
            }
            if (fromValue == IMCMD.SET_CONVERSATION_SETTING_INFO) {
                return this.g.body.set_conversation_setting_info_body.check_message;
            }
            if (fromValue == IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO) {
                return this.g.body.upsert_conversation_setting_ext_info_body.check_message;
            }
            return "";
        } catch (Exception unused) {
        }
    }

    public static f a(int i2) {
        return a(i2, (e) null);
    }

    private static f a(e eVar) {
        return b(d.b.f20889a, null);
    }

    public static f b(Response response) {
        int i2;
        if (response == null || response.cmd == null) {
            return null;
        }
        IMCMD fromValue = IMCMD.fromValue(response.cmd.intValue());
        if (fromValue == null) {
            return null;
        }
        f m2 = m();
        m2.a(response);
        if (response.status_code != null) {
            i2 = response.status_code.intValue();
        } else {
            i2 = d.b.g;
        }
        m2.i = i2;
        return m.a(fromValue, m2);
    }

    public /* synthetic */ int compareTo(Object obj) {
        f fVar = (f) obj;
        if (!equals(fVar)) {
            int d2 = d();
            if (d2 != fVar.d()) {
                if (d2 == IMCMD.SEND_MESSAGE.getValue()) {
                    return -1;
                }
                if (fVar.d() == IMCMD.SEND_MESSAGE.getValue()) {
                    return 1;
                }
            }
            if (this.f21162a - fVar.f21162a > 0) {
                return 1;
            }
            if (this.f21162a - fVar.f21162a < 0) {
                return -1;
            }
        }
        return 0;
    }

    public final void a(com.bytedance.im.core.b.c.a.c cVar) {
        int i2;
        if (this.f21167f != null) {
            if (cVar.a()) {
                try {
                    if (cVar.f21148d != null) {
                        this.g = cVar.f21148d;
                    } else if (c.a().b().k == 0) {
                        this.g = (Response) Response.ADAPTER.decode(cVar.f21147c);
                    } else {
                        this.g = (Response) com.bytedance.im.core.b.e.c.f21187a.fromJson(new String(cVar.f21147c), Response.class);
                    }
                } catch (Exception unused) {
                }
            }
            if (this.g == null) {
                Response.Builder sequence_id = new Response.Builder().cmd(this.f21167f.cmd).inbox_type(this.f21167f.inbox_type).error_desc(cVar.f21146b).sequence_id(Long.valueOf(this.f21162a));
                if (cVar.a()) {
                    i2 = 200;
                } else {
                    i2 = cVar.f21145a;
                }
                this.g = sequence_id.status_code(Integer.valueOf(i2)).build();
            }
            this.i = cVar.f21145a;
        }
    }

    public final void a(Response response) {
        int i2;
        this.g = response;
        if (response != null) {
            if (response.status_code != null) {
                i2 = response.status_code.intValue();
            } else {
                i2 = d.b.g;
            }
            this.i = i2;
        }
    }

    private static f a(int i2, e eVar) {
        return b(i2, null);
    }

    public f(long j2, l lVar) {
        this.f21163b = j2;
        this.f21162a = j2;
        this.h = lVar;
    }

    private static f b(int i2, e eVar) {
        f fVar = new f(-1, null);
        fVar.i = i2;
        fVar.f21165d = eVar;
        fVar.j = SystemClock.uptimeMillis();
        return fVar;
    }

    public final void a(int i2, String str) {
        if (this.f21167f != null) {
            this.g = new Response.Builder().cmd(this.f21167f.cmd).inbox_type(this.f21167f.inbox_type).error_desc(str).sequence_id(Long.valueOf(this.f21162a)).status_code(-1000).build();
            this.i = -1000;
        }
    }
}

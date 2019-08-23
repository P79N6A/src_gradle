package com.bytedance.im.core.d;

import android.text.TextUtils;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.b.a.k;
import com.bytedance.im.core.b.a.l;
import com.bytedance.im.core.b.b.a.ad;
import com.bytedance.im.core.b.b.a.ae;
import com.bytedance.im.core.b.b.a.ag;
import com.bytedance.im.core.b.b.a.m;
import com.bytedance.im.core.b.b.a.o;
import com.bytedance.im.core.b.b.a.w;
import com.bytedance.im.core.b.d.c;
import com.bytedance.im.core.b.d.d;
import com.bytedance.im.core.b.e.g;
import com.bytedance.im.core.proto.ConversationLeaveRequestBody;
import com.bytedance.im.core.proto.ConversationRemoveParticipantsRequestBody;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.im.core.proto.SetConversationCoreInfoRequestBody;
import com.bytedance.im.core.proto.SetConversationSettingInfoRequestBody;
import com.bytedance.im.core.proto.UpsertConversationSettingExtInfoRequestBody;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class e extends l implements h {

    /* renamed from: a  reason: collision with root package name */
    public String f21270a;

    /* renamed from: b  reason: collision with root package name */
    private h f21271b;

    public final void a(final Map<String, String> map, Runnable runnable) {
        final String str = this.f21270a;
        com.bytedance.im.core.b.d.e.a(new d<b>() {
            public final /* synthetic */ Object a() {
                b a2 = d.a().a(str);
                a2.setLocalExt(map);
                k.a();
                k.b(a2);
                return a2;
            }
        }, new c<b>(null) {
            public final /* synthetic */ void a(Object obj) {
                b bVar = (b) obj;
                if (bVar != null) {
                    d.a().b(bVar);
                    if (null != null) {
                        null.run();
                    }
                }
            }
        });
    }

    public final void a(boolean z, b<b> bVar) {
        if (d.a().a(this.f21270a) != null) {
            m.a();
            String str = this.f21270a;
            ae aeVar = new ae(bVar);
            b a2 = d.a().a(str);
            RequestBody build = new RequestBody.Builder().set_conversation_setting_info_body(new SetConversationSettingInfoRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a2.getConversationShortId())).conversation_type(Integer.valueOf(a2.getConversationType())).set_stick_on_top(Boolean.valueOf(z)).build()).build();
            int inboxType = a2.getInboxType();
            Object[] objArr = new Object[3];
            boolean z2 = false;
            objArr[0] = str;
            if (com.bytedance.im.core.a.c.a().b().z && z) {
                z2 = true;
            }
            objArr[1] = Boolean.valueOf(z2);
            objArr[2] = "s:stick_on_top";
            aeVar.a(inboxType, build, null, objArr);
        }
    }

    public final void a(Map<String, String> map, b bVar) {
        if (d.a().a(this.f21270a) != null) {
            m.a();
            String str = this.f21270a;
            ag agVar = new ag(bVar);
            if (map != null) {
                b a2 = d.a().a(str);
                RequestBody build = new RequestBody.Builder().upsert_conversation_setting_ext_info_body(new UpsertConversationSettingExtInfoRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a2.getConversationShortId())).conversation_type(Integer.valueOf(a2.getConversationType())).ext(map).build()).build();
                agVar.a(a2.getInboxType(), build, null, str);
            }
        }
    }

    public final void a(final String str, final String str2, final b<m> bVar) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            com.bytedance.im.core.b.d.e.a(new d<m>() {
                public final /* bridge */ /* synthetic */ Object a() {
                    l.a();
                    return l.a(str, str2);
                }
            }, new c<m>() {
                public final /* bridge */ /* synthetic */ void a(Object obj) {
                    bVar.a((m) obj);
                }
            });
        }
    }

    public final void a(List<Long> list, Map<String, String> map, b<List<m>> bVar) {
        m.a();
        m.a(this.f21270a, list, map, bVar);
    }

    public final void a(String str, List<m> list) {
        if (this.f21271b != null) {
            this.f21271b.a(str, list);
        }
    }

    public final void a(List<m> list) {
        if (this.f21271b != null) {
            this.f21271b.a(list);
        }
    }

    public final void c() {
        a((b<List<m>>) null);
    }

    public final b a() {
        return d.a().a(this.f21270a);
    }

    public final void b() {
        this.f21271b = null;
        g a2 = g.a();
        String str = this.f21270a;
        List list = a2.f21194d.get(str);
        list.remove(this);
        a2.f21194d.put(str, list);
        super.b();
    }

    public e(String str) {
        this.f21270a = str;
    }

    public static String a(long j) {
        return a(0, j);
    }

    public final void b(b bVar) {
        if (this.f21271b != null) {
            this.f21271b.b(bVar);
        }
    }

    public final void c(b bVar) {
        if (this.f21271b != null) {
            this.f21271b.c(bVar);
        }
    }

    public final void d(b bVar) {
        if (this.f21271b != null) {
            this.f21271b.d(bVar);
        }
    }

    public final void e(b bVar) {
        if (this.f21271b != null) {
            this.f21271b.e(bVar);
        }
    }

    public static long a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        String[] split = str.split(":");
        if (split.length != 4) {
            return -1;
        }
        long longValue = Long.valueOf(split[2]).longValue();
        long longValue2 = Long.valueOf(split[3]).longValue();
        long a2 = com.bytedance.im.core.a.c.a().f20879c.a();
        if (a2 == longValue) {
            return longValue2;
        }
        if (a2 == longValue2) {
            return longValue;
        }
        return -1;
    }

    public final void b(List<m> list) {
        if (this.f21271b != null) {
            this.f21271b.b(list);
        }
    }

    public final void b(b<String> bVar) {
        m.a();
        String str = this.f21270a;
        o oVar = new o(bVar);
        b a2 = d.a().a(str);
        RequestBody build = new RequestBody.Builder().leave_conversation_body(new ConversationLeaveRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a2.getConversationShortId())).conversation_type(Integer.valueOf(a2.getConversationType())).build()).build();
        oVar.a(a2.getInboxType(), build, null, str, Boolean.TRUE);
    }

    public final void a(final b<List<m>> bVar) {
        com.bytedance.im.core.b.d.e.a(new d<List<m>>() {
            public final /* synthetic */ Object a() {
                l.a();
                return l.b(e.this.f21270a);
            }
        }, new c<List<m>>() {
            public final /* bridge */ /* synthetic */ void a(Object obj) {
                List list = (List) obj;
                e.this.a(e.this.f21270a, list);
                if (bVar != null) {
                    bVar.a(list);
                }
            }
        });
    }

    public final void a(b bVar) {
        if (this.f21271b != null) {
            this.f21271b.a(bVar);
        }
    }

    public final void a(h hVar) {
        this.f21271b = hVar;
        g a2 = g.a();
        String str = this.f21270a;
        List list = a2.f21194d.get(str);
        if (list == null) {
            list = new ArrayList();
        }
        if (!list.contains(this)) {
            list.add(this);
        }
        a2.f21194d.put(str, list);
    }

    public static String a(int i, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(Math.max(0, i));
        sb.append(":");
        sb.append(d.a.f20886a);
        sb.append(":");
        long a2 = com.bytedance.im.core.a.c.a().f20879c.a();
        if (a2 < j) {
            sb.append(a2);
            sb.append(":");
            sb.append(j);
        } else {
            sb.append(j);
            sb.append(":");
            sb.append(a2);
        }
        return sb.toString();
    }

    public final void b(boolean z, b<b> bVar) {
        if (d.a().a(this.f21270a) != null) {
            m.a();
            String str = this.f21270a;
            ae aeVar = new ae(bVar);
            b a2 = d.a().a(str);
            RequestBody build = new RequestBody.Builder().set_conversation_setting_info_body(new SetConversationSettingInfoRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a2.getConversationShortId())).conversation_type(Integer.valueOf(a2.getConversationType())).set_mute(Boolean.valueOf(z)).build()).build();
            aeVar.a(a2.getInboxType(), build, null, str, Boolean.FALSE, "s:mute");
        }
    }

    public final void a(String str, b<b> bVar) {
        if (d.a().a(this.f21270a) != null) {
            m.a();
            String str2 = this.f21270a;
            ad adVar = new ad(bVar);
            b a2 = d.a().a(str2);
            RequestBody build = new RequestBody.Builder().set_conversation_core_info_body(new SetConversationCoreInfoRequestBody.Builder().conversation_id(str2).conversation_short_id(Long.valueOf(a2.getConversationShortId())).conversation_type(Integer.valueOf(a2.getConversationType())).name(str).is_name_set(Boolean.TRUE).build()).build();
            adVar.a(a2.getInboxType(), build, null, str2, "s:name");
        }
    }

    public final void b(List<Long> list, Map<String, String> map, b<List<m>> bVar) {
        m.a();
        String str = this.f21270a;
        w wVar = new w(bVar);
        if (list != null && !list.isEmpty()) {
            b a2 = d.a().a(str);
            RequestBody build = new RequestBody.Builder().conversation_remove_participants_body(new ConversationRemoveParticipantsRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a2.getConversationShortId())).conversation_type(Integer.valueOf(a2.getConversationType())).participants(list).build()).build();
            wVar.a(a2.getInboxType(), build, null, str, list);
        }
    }

    public final void a(long j, List<Long> list, Map<String, String> map, b<List<m>> bVar) {
        m.a();
        m.a(this.f21270a, j, list, map, bVar);
    }
}

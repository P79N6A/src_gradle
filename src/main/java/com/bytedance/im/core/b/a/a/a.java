package com.bytedance.im.core.b.a.a;

import android.content.Context;
import com.bytedance.im.core.b.a.b;
import com.bytedance.im.core.b.a.c.c;
import com.bytedance.im.core.b.a.f;
import com.bytedance.im.core.b.a.i;
import com.bytedance.im.core.b.a.j;
import com.bytedance.im.core.b.a.l;
import com.bytedance.im.core.b.a.m;
import com.bytedance.im.core.b.a.n;
import com.bytedance.im.core.b.a.o;
import com.bytedance.im.core.b.a.p;
import com.bytedance.im.core.b.e.d;

public class a extends com.bytedance.im.core.b.a.c.a {
    public com.bytedance.im.core.b.a.c.a.a a() {
        return this;
    }

    public void a(c cVar) {
        d.a("IMDBHelper onCreate");
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists conversation_list (");
        for (b bVar : b.values()) {
            sb.append(bVar.key);
            sb.append(" ");
            sb.append(bVar.type);
            sb.append(",");
        }
        String sb2 = sb.toString();
        cVar.a(sb2.substring(0, sb2.length() - 1) + ");");
        cVar.a(o.b());
        cVar.a(i.b());
        cVar.a(l.b());
        cVar.a(j.b());
        cVar.a(m.b());
        cVar.a(com.bytedance.im.core.b.a.b.c.a(com.bytedance.im.core.b.a.b.b.b()));
        cVar.a(n.b());
        cVar.a(p.b());
        String[] strArr = {"CREATE INDEX UID_INDEX ON msg(" + f.COLUMN_SERVER_ID.key + ")", "CREATE INDEX SENDER_INDEX ON msg(" + f.COLUMN_SENDER.key + ")", "CREATE INDEX CONVERSATION_INDEX ON msg(" + f.COLUMN_CONVERSATION_ID.key + "," + f.COLUMN_INNER_INDEX.key + ")"};
        for (int i = 0; i < 3; i++) {
            cVar.a(strArr[i]);
        }
    }

    public a(Context context, String str) {
        super(context, str, null, 12);
    }

    public a(Context context, String str, String str2) {
        super(context, str, str2, null, 12);
    }

    public void a(c cVar, int i, int i2) {
        d.a("IMDBHelper onUpgrade");
        d.b("db onUpgrade...oldVersion=" + i + ",newVersion=" + i2);
        if (i == 1) {
            cVar.a("alter table conversation_list add column member_count integer");
        }
        if (i <= 2) {
            cVar.a("alter table msg add column read_status integer");
        }
        if (i <= 3) {
            cVar.a("alter table conversation_list add column min_index bigint");
        }
        if (i <= 4) {
            cVar.a(j.b());
            cVar.a(m.b());
        } else if (i == 5) {
            cVar.a("alter table conversation_setting add column favor integer");
        }
        if (i <= 6) {
            cVar.a("alter table attchment add column display_type text");
            cVar.a("alter table attchment add column mime_type text");
        }
        if (i <= 7) {
            cVar.a(com.bytedance.im.core.b.a.b.c.a(com.bytedance.im.core.b.a.b.b.b()));
        }
        if (i < 9) {
            cVar.a(n.b());
        }
        if (i < 10) {
            cVar.a("alter table participant add column sec_uid text");
        }
        if (i < 11) {
            cVar.a("alter table conversation_list add column status integer");
            cVar.a("alter table conversation_list add column participant text");
            if (i > 4) {
                cVar.a("alter table conversation_core add column owner_id integer default -1");
                cVar.a("alter table conversation_core add column sec_owner text");
            }
        }
        if (i < 12) {
            cVar.a(p.b());
        }
    }
}

package com.bytedance.im.core.b.b.a;

import android.util.Pair;
import com.bytedance.im.core.b.a.k;
import com.bytedance.im.core.b.a.l;
import com.bytedance.im.core.b.b.a;
import com.bytedance.im.core.b.c.e;
import com.bytedance.im.core.b.c.f;
import com.bytedance.im.core.b.d.c;
import com.bytedance.im.core.b.e.b;
import com.bytedance.im.core.b.e.g;
import com.bytedance.im.core.c.d;
import com.bytedance.im.core.d.m;
import com.bytedance.im.core.proto.ConversationParticipantsListRequestBody;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.ParticipantsPage;
import com.bytedance.im.core.proto.RequestBody;
import java.util.ArrayList;
import java.util.List;

public final class q extends l<List<m>> {

    /* renamed from: a  reason: collision with root package name */
    public List<m> f21097a = new ArrayList();

    /* access modifiers changed from: protected */
    public final boolean a() {
        return true;
    }

    public q() {
        super(IMCMD.CONVERSATION_PARTICIPANTS_LIST.getValue());
    }

    /* access modifiers changed from: protected */
    public final boolean a(f fVar) {
        if (fVar.g.body == null || fVar.g.body.conversation_participants_body == null || fVar.g.body.conversation_participants_body.participants_page == null) {
            return false;
        }
        return true;
    }

    public final long a(String str, e eVar) {
        return a(str, 0, null);
    }

    /* access modifiers changed from: protected */
    public final void a(final f fVar, final Runnable runnable) {
        if (!fVar.g() || !a(fVar)) {
            b(fVar);
            runnable.run();
            d.a(fVar, false).b();
        } else {
            ParticipantsPage participantsPage = fVar.g.body.conversation_participants_body.participants_page;
            final String str = (String) fVar.f21166e[0];
            this.f21097a.addAll(b.a(str, participantsPage.participants));
            if (participantsPage.has_more.booleanValue()) {
                a(str, participantsPage.cursor.longValue(), fVar.f21165d);
            } else {
                com.bytedance.im.core.b.d.e.a(new com.bytedance.im.core.b.d.d<Pair<com.bytedance.im.core.d.b, List<m>>>() {
                    public final /* synthetic */ Object a() {
                        int i;
                        com.bytedance.im.core.d.b a2 = com.bytedance.im.core.d.d.a().a(str);
                        l.a();
                        l.d(str);
                        l.a();
                        String str = str;
                        if (a2 == null) {
                            i = -1;
                        } else {
                            i = a2.getConversationType();
                        }
                        l.a(str, i, q.this.f21097a);
                        k.a();
                        return new Pair(k.a(str), q.this.f21097a);
                    }
                }, new c<Pair<com.bytedance.im.core.d.b, List<m>>>() {
                    public final /* synthetic */ void a(Object obj) {
                        Pair pair = (Pair) obj;
                        if (pair.second != null && !((List) pair.second).isEmpty()) {
                            g.a().a(str, (List) pair.second);
                        }
                        if (pair.first != null) {
                            com.bytedance.im.core.d.d.a().b((com.bytedance.im.core.d.b) pair.first);
                        }
                        a.f20950e.remove(str);
                        q.this.a(pair.second);
                        runnable.run();
                        d.a(fVar, true).b();
                    }
                });
            }
        }
    }

    private long a(String str, long j, e eVar) {
        if (a.c(str)) {
            return -1;
        }
        a.d(str);
        com.bytedance.im.core.d.b a2 = com.bytedance.im.core.d.d.a().a(str);
        RequestBody build = new RequestBody.Builder().conversation_participants_body(new ConversationParticipantsListRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a2.getConversationShortId())).conversation_type(Integer.valueOf(a2.getConversationType())).cursor(Long.valueOf(j)).build()).build();
        return a(a2.getInboxType(), build, eVar, str, Long.valueOf(j));
    }
}

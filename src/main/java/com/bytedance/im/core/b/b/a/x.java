package com.bytedance.im.core.b.b.a;

import com.bytedance.im.core.b.c.f;
import com.bytedance.im.core.b.e.i;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.ReportGetMessagesCursorRequestBody;
import com.bytedance.im.core.proto.RequestBody;

public final class x extends l {

    /* renamed from: a  reason: collision with root package name */
    private int f21127a;

    /* access modifiers changed from: protected */
    public final boolean a(f fVar) {
        return true;
    }

    public final void b() {
        long a2 = i.a().a(this.f21127a);
        if (a2 != i.a().b(this.f21127a)) {
            RequestBody build = new RequestBody.Builder().report_conversation_cursor_body(new ReportGetMessagesCursorRequestBody.Builder().cursor(Long.valueOf(a2)).build()).build();
            a(this.f21127a, build, null, Long.valueOf(a2));
        }
    }

    x(int i) {
        super(IMCMD.REPORT_GET_MESSAGES_CURSOR.getValue());
        this.f21127a = i;
    }

    /* access modifiers changed from: protected */
    public final void a(f fVar, Runnable runnable) {
        i.a().f21240a.edit().putLong(i.a(this.f21127a, "msg_by_user_report_cursor"), ((Long) fVar.f21166e[0]).longValue()).commit();
    }
}

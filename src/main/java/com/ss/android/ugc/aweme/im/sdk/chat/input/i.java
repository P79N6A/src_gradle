package com.ss.android.ugc.aweme.im.sdk.chat.input;

import android.text.TextUtils;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.im.sdk.chat.input.d;
import com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.c;
import com.ss.android.ugc.aweme.im.sdk.utils.o;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import java.util.HashMap;
import java.util.Map;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50633a;

    /* renamed from: b  reason: collision with root package name */
    private final d.AnonymousClass2 f50634b;

    /* renamed from: c  reason: collision with root package name */
    private final c f50635c;

    i(d.AnonymousClass2 r1, c cVar) {
        this.f50634b = r1;
        this.f50635c = cVar;
    }

    public final void run() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f50633a, false, 50606, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50633a, false, 50606, new Class[0], Void.TYPE);
            return;
        }
        d.AnonymousClass2 r0 = this.f50634b;
        c cVar = this.f50635c;
        d dVar = d.this;
        if (PatchProxy.isSupport(new Object[0], dVar, d.f3364a, false, 50586, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], dVar, d.f3364a, false, 50586, new Class[0], Void.TYPE);
        } else {
            String sourceMessage = g.b().bJ().getSourceMessage();
            if (!TextUtils.isEmpty(sourceMessage)) {
                o a2 = o.a();
                if (PatchProxy.isSupport(new Object[0], a2, o.f52605a, false, 53432, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, o.f52605a, false, 53432, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    z = a2.f52608b.getBoolean("hint_weshine_search", true);
                }
                if (z) {
                    a.a(dVar.h(), sourceMessage).a();
                    o a3 = o.a();
                    if (PatchProxy.isSupport(new Object[]{(byte) 0}, a3, o.f52605a, false, 53431, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        o oVar = a3;
                        PatchProxy.accessDispatch(new Object[]{(byte) 0}, oVar, o.f52605a, false, 53431, new Class[]{Boolean.TYPE}, Void.TYPE);
                    } else {
                        a3.f52608b.edit().putBoolean("hint_weshine_search", false).commit();
                    }
                }
            }
        }
        d.this.a(cVar);
        d.this.n();
        d.this.o();
        d.this.b(false);
        String conversationId = d.this.t.getConversationId();
        if (PatchProxy.isSupport(new Object[]{conversationId}, null, z.f52670a, true, 53644, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{conversationId}, null, z.f52670a, true, 53644, new Class[]{String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("conversation_id", conversationId);
        r.a("auto_emoji_show", (Map) hashMap);
    }
}

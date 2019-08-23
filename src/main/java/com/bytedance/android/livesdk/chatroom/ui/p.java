package com.bytedance.android.livesdk.chatroom.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.android.livesdk.d.a;
import com.bytedance.android.livesdk.j.b.g;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.live.model.b;
import com.bytedance.android.livesdk.widget.m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;

public final /* synthetic */ class p implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12289a;

    /* renamed from: b  reason: collision with root package name */
    private final AbsInteractionFragment f12290b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f12291c;

    /* renamed from: d  reason: collision with root package name */
    private final b f12292d;

    p(AbsInteractionFragment absInteractionFragment, Bundle bundle, b bVar) {
        this.f12290b = absInteractionFragment;
        this.f12291c = bundle;
        this.f12292d = bVar;
    }

    public final boolean a(Runnable runnable, boolean z) {
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{runnable2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f12289a, false, 5570, new Class[]{Runnable.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{runnable2, Byte.valueOf(z)}, this, f12289a, false, 5570, new Class[]{Runnable.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        AbsInteractionFragment absInteractionFragment = this.f12290b;
        Bundle bundle = this.f12291c;
        b bVar = this.f12292d;
        if (!z) {
            int elapsedRealtime = (int) ((SystemClock.elapsedRealtime() - absInteractionFragment.M) / 1000);
            if (bundle.getInt("current_room_position", 0) >= bVar.f15859b || (absInteractionFragment.M > 0 && elapsedRealtime >= bVar.f15858a)) {
                g a2 = com.bytedance.android.livesdk.j.a.a().a(j.class);
                String str = "";
                String str2 = "";
                if (a2.a().containsKey("enter_from_merge")) {
                    str = a2.a().get("enter_from_merge");
                }
                if (a2.a().containsKey("enter_method")) {
                    str2 = a2.a().get("enter_method");
                }
                HashMap hashMap = new HashMap();
                hashMap.put("enter_from_merge", str);
                hashMap.put("enter_method", str2);
                new m.a(absInteractionFragment.getContext()).a(true).d((int) C0906R.string.d42).c((int) C0906R.string.cyr).b(0, (int) C0906R.string.cyq, (DialogInterface.OnClickListener) new h(bVar, runnable, hashMap)).b(1, (int) C0906R.string.cyk, (DialogInterface.OnClickListener) new i(runnable, hashMap)).a().show();
                com.bytedance.android.livesdk.j.a.a().a("livesdk_popup_show", hashMap, Room.class);
                return true;
            }
        }
        return false;
    }
}

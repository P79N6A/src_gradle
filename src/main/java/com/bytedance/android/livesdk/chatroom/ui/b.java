package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.livesdk.browser.jsbridge.a.d;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.event.aa;
import com.bytedance.android.livesdk.chatroom.event.ae;
import com.bytedance.android.livesdk.chatroom.event.e;
import com.bytedance.android.livesdk.chatroom.event.s;
import com.bytedance.android.livesdk.chatroom.event.u;
import com.bytedance.android.livesdk.chatroom.event.v;
import com.bytedance.android.livesdk.chatroom.event.x;
import com.bytedance.android.livesdk.chatroom.event.z;
import com.bytedance.android.livesdkapi.depend.b.c;
import com.bytedance.android.livesdkapi.f.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class b implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11904a;

    /* renamed from: b  reason: collision with root package name */
    private final AbsInteractionFragment f11905b;

    b(AbsInteractionFragment absInteractionFragment) {
        this.f11905b = absInteractionFragment;
    }

    public final void accept(Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, this, f11904a, false, 5556, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj2}, this, f11904a, false, 5556, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        AbsInteractionFragment absInteractionFragment = this.f11905b;
        if (obj2 instanceof e) {
            absInteractionFragment.onEvent((e) obj2);
        } else if (obj2 instanceof a) {
            absInteractionFragment.onEvent((a) obj2);
        } else if (obj2 instanceof s) {
            absInteractionFragment.onEvent((s) obj2);
        } else if (obj2 instanceof u) {
            absInteractionFragment.onEvent((u) obj2);
        } else if (obj2 instanceof v) {
            absInteractionFragment.onEvent((v) obj2);
        } else if (obj2 instanceof c) {
            absInteractionFragment.onEvent((c) obj2);
        } else if (obj2 instanceof z) {
            absInteractionFragment.onEvent((z) obj2);
        } else if (obj2 instanceof aa) {
            absInteractionFragment.onEvent((aa) obj2);
        } else if (obj2 instanceof com.bytedance.android.livesdk.g.c) {
            absInteractionFragment.onEvent((com.bytedance.android.livesdk.g.c) obj2);
        } else if (obj2 instanceof ae) {
            absInteractionFragment.onEvent((ae) obj2);
        } else if (obj2 instanceof com.bytedance.android.livesdk.kickout.a.b) {
            absInteractionFragment.onEvent((com.bytedance.android.livesdk.kickout.a.b) obj2);
        } else if (obj2 instanceof UserProfileEvent) {
            absInteractionFragment.onEvent((UserProfileEvent) obj2);
        } else if (obj2 instanceof com.bytedance.android.livesdk.browser.jsbridge.a.c) {
            absInteractionFragment.onEvent((com.bytedance.android.livesdk.browser.jsbridge.a.c) obj2);
        } else if (obj2 instanceof x) {
            absInteractionFragment.onEvent((x) obj2);
        } else {
            if (obj2 instanceof d) {
                absInteractionFragment.onEvent((d) obj2);
            }
        }
    }
}

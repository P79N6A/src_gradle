package com.bytedance.android.livesdk.chatroom.ui;

import android.view.View;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.j.a;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.j.c.k;
import com.bytedance.android.livesdk.user.g;
import com.bytedance.android.livesdk.user.h;
import com.bytedance.android.livesdk.user.i;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observer;
import java.util.HashMap;

public final /* synthetic */ class ch implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12009a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveInputDialogFragment f12010b;

    ch(LiveInputDialogFragment liveInputDialogFragment) {
        this.f12010b = liveInputDialogFragment;
    }

    public final void onClick(View view) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{view}, this, f12009a, false, 5974, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f12009a, false, 5974, new Class[]{View.class}, Void.TYPE);
            return;
        }
        LiveInputDialogFragment liveInputDialogFragment = this.f12010b;
        int id = view.getId();
        if (id == C0906R.id.jq) {
            if (PatchProxy.isSupport(new Object[0], liveInputDialogFragment, LiveInputDialogFragment.f11578a, false, 5970, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], liveInputDialogFragment, LiveInputDialogFragment.f11578a, false, 5970, new Class[0], Void.TYPE);
            } else {
                if (!liveInputDialogFragment.j) {
                    if (liveInputDialogFragment.i) {
                        liveInputDialogFragment.i = false;
                        liveInputDialogFragment.f11579b.b(true);
                    } else {
                        liveInputDialogFragment.i = true;
                        liveInputDialogFragment.f11579b.a(true);
                    }
                    liveInputDialogFragment.b();
                }
            }
        } else if (id == C0906R.id.cnw) {
            if (PatchProxy.isSupport(new Object[0], liveInputDialogFragment, LiveInputDialogFragment.f11578a, false, 5971, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], liveInputDialogFragment, LiveInputDialogFragment.f11578a, false, 5971, new Class[0], Void.TYPE);
            } else if (TTLiveSDKContext.getHostService().k().c()) {
                if (!TTLiveSDKContext.getHostService().k().a(h.COMMENT)) {
                    if (liveInputDialogFragment.i && TTLiveSDKContext.getHostService().a().k()) {
                        ai.a((int) C0906R.string.d_b);
                    } else if (!(liveInputDialogFragment.l == null || liveInputDialogFragment.f11583f.getText() == null)) {
                        String obj = liveInputDialogFragment.f11583f.getText().toString();
                        if (PatchProxy.isSupport(new Object[]{obj}, null, LiveInputDialogFragment.f11578a, true, 5973, new Class[]{String.class}, Boolean.TYPE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, null, LiveInputDialogFragment.f11578a, true, 5973, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
                        } else {
                            boolean z2 = false;
                            for (int i = 0; i < obj.length(); i++) {
                                z2 = !Character.isWhitespace(obj.charAt(i));
                                if (z2) {
                                    break;
                                }
                            }
                            if (!z2 || obj.length() <= 0) {
                                z = false;
                            }
                        }
                        if (z) {
                            liveInputDialogFragment.l.a(obj, liveInputDialogFragment.i);
                        }
                    }
                }
            } else if (liveInputDialogFragment.getActivity() == null) {
                ai.a((int) C0906R.string.csb);
            } else {
                TTLiveSDKContext.getHostService().k().a(liveInputDialogFragment.getActivity(), i.a().a(ac.a((int) C0906R.string.deq)).c("comment_live").a((int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE).a()).subscribe((Observer<? super T>) new g<Object>());
            }
        } else if (id == C0906R.id.al1) {
            HashMap hashMap = new HashMap();
            hashMap.put("discount_type", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            a.a().a("discount_recharge_click", hashMap, Room.class, new j().a("live_detail").c("comment").b("live_function"), new k());
            if (PatchProxy.isSupport(new Object[0], liveInputDialogFragment, LiveInputDialogFragment.f11578a, false, 5972, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], liveInputDialogFragment, LiveInputDialogFragment.f11578a, false, 5972, new Class[0], Void.TYPE);
            } else if (!TTLiveSDKContext.getHostService().k().c()) {
                TTLiveSDKContext.getHostService().k().a(liveInputDialogFragment.getContext(), i.a().c("comment_recharge_guide").a((int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE).a()).subscribe((Observer<? super T>) new g<Object>());
            } else if (!TTLiveSDKContext.getHostService().k().a(h.COMMENT)) {
                liveInputDialogFragment.a();
                liveInputDialogFragment.m.a();
            }
        }
    }
}

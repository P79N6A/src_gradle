package com.ss.android.ugc.aweme.im.sdk.chat.input;

import android.content.Intent;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.im.core.d.c;
import com.bytedance.im.core.d.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sdk.d.a;
import com.ss.android.ugc.aweme.im.sdk.utils.af;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.story.api.IAVStoryService;
import java.util.ArrayList;

public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50631a;

    /* renamed from: b  reason: collision with root package name */
    private final d f50632b;

    h(d dVar) {
        this.f50632b = dVar;
    }

    public final void onClick(View view) {
        View view2 = view;
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f50631a, false, 50601, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f50631a, false, 50601, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        d dVar = this.f50632b;
        if (!af.f52472c.a(view2, 500)) {
            if (view2.equals(dVar.f3367d)) {
                dVar.c(-2);
            } else if (view2.equals(dVar.h)) {
                dVar.k();
                dVar.f3366c.b();
            } else if (view2.equals(dVar.f3369f)) {
                dVar.f3369f.setSelected(!dVar.f3369f.isSelected());
                if (dVar.f3369f.isSelected()) {
                    dVar.f3369f.setImageResource(2130838746);
                    dVar.f3369f.setContentDescription(dVar.h().getResources().getString(C0906R.string.aoq));
                    if (PatchProxy.isSupport(new Object[0], dVar, d.f3364a, false, 50570, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], dVar, d.f3364a, false, 50570, new Class[0], Void.TYPE);
                    } else if (a.b().enableExpressionTab()) {
                        dVar.n.setVisibility(0);
                        boolean z = dVar.n.getCheckedRadioButtonId() == C0906R.id.ca1;
                        if (z) {
                            i = -2;
                        }
                        dVar.c(i);
                        dVar.a(z);
                    } else {
                        dVar.c(1);
                    }
                    z a2 = z.a();
                    if (PatchProxy.isSupport(new Object[0], a2, z.f52670a, false, 53597, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], a2, z.f52670a, false, 53597, new Class[0], Void.TYPE);
                    } else {
                        r.onEvent(MobClick.obtain().setEventName("click_emoji").setLabelName("chat"));
                    }
                } else {
                    dVar.f3369f.setImageResource(2130840480);
                    dVar.f3369f.setContentDescription(dVar.h().getResources().getString(C0906R.string.aoj));
                    dVar.c(-2);
                    dVar.l();
                }
            } else if (view2.equals(dVar.g)) {
                dVar.c(2);
                dVar.f3367d.setText("");
            } else if (view2.equals(dVar.i)) {
                if (dVar.u == 4) {
                    dVar.d(5);
                } else {
                    dVar.d(4);
                }
            } else if (view2.equals(dVar.f3368e)) {
                if (PatchProxy.isSupport(new Object[0], dVar, d.f3364a, false, 50567, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], dVar, d.f3364a, false, 50567, new Class[0], Void.TYPE);
                } else if (dVar.j()) {
                    dVar.b("sendMedia");
                    z.a().b(0);
                    com.bytedance.ies.dmt.ui.d.a.b(dVar.h(), (int) C0906R.string.avz).a();
                } else {
                    z.a().b(1);
                    Intent intent = new Intent();
                    intent.putExtra("shoot_way", "im_story");
                    intent.putExtra("enter_from", "from_chat");
                    if (dVar.t.isGroupChat()) {
                        c coreInfo = d.a().a(dVar.t.getConversationId()).getCoreInfo();
                        if (coreInfo != null) {
                            UrlModel urlModel = new UrlModel();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(coreInfo.getIcon());
                            urlModel.setUrlList(arrayList);
                            intent.putExtra("send_to_user_head", urlModel);
                        }
                    } else if (dVar.t.getSingleChatFromUser() != null) {
                        intent.putExtra("send_to_user_head", dVar.t.getSingleChatFromUser().getDisplayAvatar());
                    }
                    intent.putExtra("extra_launch_type", 1);
                    ((IAVStoryService) ServiceManager.get().getService(IAVStoryService.class)).launchRecord(dVar.h(), intent);
                    dVar.e();
                }
            }
        }
    }
}

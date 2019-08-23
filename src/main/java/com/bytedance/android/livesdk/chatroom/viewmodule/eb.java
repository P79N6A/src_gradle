package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.Observer;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.chatroom.event.r;
import com.bytedance.ies.sdk.widgets.KVData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class eb implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13203a;

    /* renamed from: b  reason: collision with root package name */
    private final RadioWidget f13204b;

    eb(RadioWidget radioWidget) {
        this.f13204b = radioWidget;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13203a, false, 7436, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13203a, false, 7436, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        RadioWidget radioWidget = this.f13204b;
        KVData kVData = (KVData) obj;
        if (radioWidget.isViewValid() && kVData != null) {
            r rVar = (r) kVData.getData();
            if (radioWidget.m == null) {
                radioWidget.m = (FrameLayout.LayoutParams) radioWidget.h.getLayoutParams();
                radioWidget.n = (FrameLayout.LayoutParams) radioWidget.g.getLayoutParams();
            }
            if (rVar.f10194a) {
                radioWidget.f12777c = true;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(radioWidget.m.width, radioWidget.m.height, radioWidget.m.gravity);
                layoutParams.topMargin = ac.d(C0906R.dimen.po);
                layoutParams.height = (int) radioWidget.context.getResources().getDimension(C0906R.dimen.pp);
                layoutParams.width = (int) radioWidget.context.getResources().getDimension(C0906R.dimen.pp);
                radioWidget.h.setLayoutParams(layoutParams);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(radioWidget.n.width, radioWidget.n.height, radioWidget.n.gravity);
                layoutParams2.topMargin = ac.d(C0906R.dimen.pm);
                layoutParams2.height = (int) radioWidget.context.getResources().getDimension(C0906R.dimen.pn);
                layoutParams2.width = (int) radioWidget.context.getResources().getDimension(C0906R.dimen.pn);
                radioWidget.g.setLayoutParams(layoutParams2);
                radioWidget.g.setVisibility(4);
                radioWidget.g.cancelAnimation();
                radioWidget.k.setVisibility(0);
                radioWidget.l.setVisibility(8);
                return;
            }
            radioWidget.f12777c = false;
            radioWidget.h.setLayoutParams(radioWidget.m);
            radioWidget.g.setLayoutParams(radioWidget.n);
            radioWidget.g.setVisibility(0);
            radioWidget.g.playAnimation();
            radioWidget.k.setVisibility(8);
            if (radioWidget.i.getVisibility() == 0) {
                radioWidget.i.setVisibility(8);
                radioWidget.j.setVisibility(8);
            }
            if (TextUtils.isEmpty(radioWidget.f12776b.getOwner().getBackgroundImgUrl())) {
                radioWidget.l.setVisibility(4);
            } else {
                radioWidget.l.setVisibility(0);
            }
        }
    }
}

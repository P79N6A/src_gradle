package com.bytedance.android.livesdk.gift.panel.widget;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.event.q;
import com.bytedance.android.livesdk.chatroom.widget.AvatarIconView;
import com.bytedance.android.livesdk.gift.model.a.a;
import com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class GiftPanelGuestInfoWidget extends LiveWidget implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15306a;

    /* renamed from: b  reason: collision with root package name */
    private AvatarIconView f15307b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f15308c;

    /* renamed from: d  reason: collision with root package name */
    private View f15309d;

    /* renamed from: e  reason: collision with root package name */
    private View f15310e;

    /* renamed from: f  reason: collision with root package name */
    private GiftDialogViewModel f15311f;
    private GiftDialogViewModel.d g;

    public int getLayoutId() {
        return C0906R.layout.ag8;
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f15306a, false, 10021, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15306a, false, 10021, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.f15311f.a(this);
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f15306a, false, 10017, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15306a, false, 10017, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.f15311f = (GiftDialogViewModel) this.dataCenter.get("data_gift_dialog_view_model");
        this.g = this.f15311f.f15265d;
        if (PatchProxy.isSupport(new Object[0], this, f15306a, false, 10018, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15306a, false, 10018, new Class[0], Void.TYPE);
        } else {
            this.containerView.setVisibility(0);
            this.f15307b = (AvatarIconView) this.contentView.findViewById(C0906R.id.hk);
            this.f15308c = (TextView) this.contentView.findViewById(C0906R.id.d46);
            this.f15309d = this.contentView.findViewById(C0906R.id.dq_);
            this.f15310e = this.contentView.findViewById(C0906R.id.dqc);
            User user = this.f15311f.g;
            if (user != null) {
                this.f15307b.setAvatar(user.getAvatarThumb());
                this.f15308c.setText(ac.a((int) C0906R.string.cyi, user.getNickName()));
            }
            this.f15307b.setOnClickListener(this);
            this.f15309d.setOnClickListener(this);
            this.f15310e.setOnClickListener(this);
        }
        this.f15311f.s.observe(this, new p(this));
        this.f15311f.t.observe(this, new q(this));
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        View view;
        int i;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f15306a, false, 10019, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f15306a, false, 10019, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.g == GiftDialogViewModel.d.GUEST) {
            a aVar = (a) this.f15311f.s.getValue();
            int i2 = 8;
            if (aVar == null || !aVar.d()) {
                View view2 = this.f15309d;
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                view2.setVisibility(i);
                view = this.f15310e;
                if (z) {
                    i2 = 0;
                }
            } else {
                this.f15309d.setVisibility(8);
                view = this.f15310e;
            }
            view.setVisibility(i2);
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f15306a, false, 10020, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f15306a, false, 10020, new Class[]{View.class}, Void.TYPE);
        } else if (view.getId() == C0906R.id.hk || view.getId() == C0906R.id.dq_) {
            this.f15311f.r.postValue(Boolean.TRUE);
            com.bytedance.android.livesdk.u.a.a().a((Object) new UserProfileEvent(this.f15311f.g, "guest_connection"));
        } else {
            if (view.getId() == C0906R.id.dqc) {
                q qVar = new q(6);
                qVar.f10193b = Long.valueOf(this.f15311f.g.getId());
                this.dataCenter.lambda$put$1$DataCenter("cmd_interact_state_change", qVar);
            }
        }
    }
}

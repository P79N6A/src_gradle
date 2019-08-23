package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.uikit.d.c;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.event.y;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.effect.entry.d.a;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftAnimationView;
import com.bytedance.android.livesdk.gift.model.b;
import com.bytedance.android.livesdk.message.model.ab;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class NormalGiftAnimWidget extends LiveRecyclableWidget implements Observer<KVData>, a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12690a;

    /* renamed from: b  reason: collision with root package name */
    private NormalGiftAnimationView f12691b;

    /* renamed from: c  reason: collision with root package name */
    private com.bytedance.android.livesdk.gift.effect.normal.a.a f12692c = new com.bytedance.android.livesdk.gift.effect.normal.a.a();

    /* renamed from: d  reason: collision with root package name */
    private Room f12693d;

    public int getLayoutId() {
        return C0906R.layout.aou;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f12690a, false, 7302, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12690a, false, 7302, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid() && this.f12691b != null) {
            this.f12691b.b();
        }
    }

    public void onUnload() {
        if (PatchProxy.isSupport(new Object[0], this, f12690a, false, 7300, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12690a, false, 7300, new Class[0], Void.TYPE);
            return;
        }
        if (this.dataCenter != null) {
            this.dataCenter.removeObserver(this);
        }
    }

    public void onInit(Object... objArr) {
        this.f12691b = (NormalGiftAnimationView) this.contentView;
    }

    public final void b(ab abVar) {
        if (PatchProxy.isSupport(new Object[]{abVar}, this, f12690a, false, 7304, new Class[]{ab.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{abVar}, this, f12690a, false, 7304, new Class[]{ab.class}, Void.TYPE);
        } else if (this.dataCenter != null) {
            this.dataCenter.lambda$put$1$DataCenter("cmd_show_special_group_gift", abVar);
        }
    }

    public final void a(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f12690a, false, 7303, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f12690a, false, 7303, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (j != 0 && this.dataCenter != null) {
            this.dataCenter.lambda$put$1$DataCenter("cmd_show_user_profile", new UserProfileEvent(j));
        }
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        KVData kVData = (KVData) obj;
        if (PatchProxy.isSupport(new Object[]{kVData}, this, f12690a, false, 7297, new Class[]{KVData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVData}, this, f12690a, false, 7297, new Class[]{KVData.class}, Void.TYPE);
        } else if (kVData != null && !TextUtils.isEmpty(kVData.getKey())) {
            String key = kVData.getKey();
            char c2 = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -2104158356) {
                if (hashCode == -763908145 && key.equals("cmd_clear_gift_message")) {
                    c2 = 0;
                }
            } else if (key.equals("data_xt_landscape_tab_change")) {
                c2 = 1;
            }
            switch (c2) {
                case 0:
                    if (isViewValid() && this.f12691b != null) {
                        this.f12691b.b();
                        return;
                    }
                case 1:
                    if (((Integer) kVData.getData()).intValue() == 0) {
                        UIUtils.setViewVisibility(this.contentView, 0);
                        break;
                    } else {
                        UIUtils.setViewVisibility(this.contentView, 8);
                        return;
                    }
            }
        }
    }

    public void onLoad(Object... objArr) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12690a, false, 7298, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12690a, false, 7298, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f12691b.setNormalGiftEventListener(this);
        NormalGiftAnimationView normalGiftAnimationView = this.f12691b;
        if (PatchProxy.isSupport(new Object[0], normalGiftAnimationView, NormalGiftAnimationView.f14935a, false, 9571, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], normalGiftAnimationView, NormalGiftAnimationView.f14935a, false, 9571, new Class[0], Void.TYPE);
        } else {
            boolean a2 = c.a(normalGiftAnimationView.getContext());
            for (com.bytedance.android.livesdk.gift.effect.normal.b.a aVar : normalGiftAnimationView.f14936b) {
                aVar.f14903e = a2;
            }
        }
        this.f12693d = (Room) this.dataCenter.get("data_room");
        if (this.f12693d != null) {
            this.f12691b.setOrientation(this.f12693d.getOrientation());
        }
        this.dataCenter.observe("data_xt_landscape_tab_change", this);
        if (com.bytedance.android.live.uikit.a.a.f()) {
            if (PatchProxy.isSupport(new Object[0], this, f12690a, false, 7299, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f12690a, false, 7299, new Class[0], Void.TYPE);
            } else if (getContext().getResources().getConfiguration().orientation == 1) {
                int intValue = ((Integer) this.dataCenter.get("data_xt_landscape_tab_change", 0)).intValue();
                View view = this.contentView;
                if (intValue != 0) {
                    i = 8;
                }
                UIUtils.setViewVisibility(view, i);
            } else {
                UIUtils.setViewVisibility(this.contentView, 0);
            }
        }
    }

    public final void a(ab abVar) {
        int i;
        if (PatchProxy.isSupport(new Object[]{abVar}, this, f12690a, false, 7301, new Class[]{ab.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{abVar}, this, f12690a, false, 7301, new Class[]{ab.class}, Void.TYPE);
            return;
        }
        if (com.bytedance.android.live.uikit.a.a.f() && this.dataCenter != null) {
            boolean booleanValue = ((Boolean) this.dataCenter.get("data_is_anchor", Boolean.FALSE)).booleanValue();
            Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
            if (defaultDisplay != null) {
                i = defaultDisplay.getRotation();
            } else {
                i = 0;
            }
            if (this.f12693d.getOrientation() == 2 && !booleanValue && (i == 1 || i == 3)) {
                return;
            }
        }
        b findGiftById = GiftManager.inst().findGiftById(abVar.f16432d);
        if (!(findGiftById == null || this.f12693d == null)) {
            this.f12691b.a(this.f12692c, abVar, findGiftById, this.f12693d.getOwner());
        }
    }

    public final void a(User user, String str, long j, ab abVar) {
        User user2 = user;
        String str2 = str;
        long j2 = j;
        ab abVar2 = abVar;
        if (PatchProxy.isSupport(new Object[]{user2, str2, new Long(j2), abVar2}, this, f12690a, false, 7305, new Class[]{User.class, String.class, Long.TYPE, ab.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2, str2, new Long(j2), abVar2}, this, f12690a, false, 7305, new Class[]{User.class, String.class, Long.TYPE, ab.class}, Void.TYPE);
            return;
        }
        y yVar = new y(user2, str2, j2);
        if (abVar2 != null) {
            yVar.f10210d = abVar2.baseMessage;
        }
        b findGiftById = GiftManager.inst().findGiftById(j2);
        if ((findGiftById == null || findGiftById.f15106e != 8) && this.dataCenter != null) {
            this.dataCenter.lambda$put$1$DataCenter("data_normal_gift_end_event", yVar);
        }
    }
}

package com.bytedance.android.livesdk.fansclub;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.uikit.d.a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.viewmodule.am;
import com.bytedance.android.livesdk.fansclub.c;
import com.bytedance.android.livesdk.fansclub.l;
import com.bytedance.android.livesdk.message.model.FansclubStatisticMessage;
import com.bytedance.android.livesdk.message.model.v;
import com.bytedance.android.livesdk.message.model.w;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

public class LiveFansClubEntryWidget extends LiveRecyclableWidget implements c.a, com.bytedance.android.livesdkapi.b.c<KVData> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13864a;

    /* renamed from: b  reason: collision with root package name */
    TextView f13865b;

    /* renamed from: c  reason: collision with root package name */
    BaseDialogFragment f13866c;

    /* renamed from: d  reason: collision with root package name */
    Room f13867d;

    /* renamed from: e  reason: collision with root package name */
    User f13868e;

    /* renamed from: f  reason: collision with root package name */
    String f13869f = "";
    long g;
    int h;
    boolean i;
    boolean j;
    private ImageView k;
    private Disposable l;
    private c m;
    private l n;
    private JoinFansPortraitNotifyView o;
    private FansClubEntryAnchorView p;
    private Disposable q;

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f13864a, false, 8342, new Class[0], String.class)) {
            return am.a(this);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f13864a, false, 8342, new Class[0], String.class);
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f13864a, false, 8343, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f13864a, false, 8343, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        am.a(this, th);
    }

    public int getLayoutId() {
        return C0906R.layout.ahk;
    }

    public void onUnload() {
        if (PatchProxy.isSupport(new Object[0], this, f13864a, false, 8336, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13864a, false, 8336, new Class[0], Void.TYPE);
            return;
        }
        this.m.d();
        if (this.l != null && !this.l.isDisposed()) {
            this.l.dispose();
        }
        if (this.q != null && !this.q.isDisposed()) {
            this.q.dispose();
        }
        this.f13868e = null;
        this.dataCenter.removeObserver(new r(this));
    }

    public final void a(w wVar) {
        if (PatchProxy.isSupport(new Object[]{wVar}, this, f13864a, false, 8340, new Class[]{w.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{wVar}, this, f13864a, false, 8340, new Class[]{w.class}, Void.TYPE);
            return;
        }
        if (wVar.f16700b == 1) {
            this.f13869f = wVar.f16701c;
            this.f13865b.setText(getContext().getResources().getString(C0906R.string.cwg, new Object[]{this.f13869f, a.a(this.g, "w")}));
            this.h = 3;
        }
    }

    public void onInit(@Nullable Object[] objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f13864a, false, 8333, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f13864a, false, 8333, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f13865b = (TextView) this.contentView.findViewById(C0906R.id.dbo);
        this.k = (ImageView) this.contentView.findViewById(C0906R.id.dbp);
        if (((com.bytedance.android.livesdk.n.a) j.q().k().a(com.bytedance.android.livesdk.n.a.class)) != null) {
            this.k.setImageResource(2130841150);
        }
        this.m = new c();
    }

    public final void a(FansclubStatisticMessage fansclubStatisticMessage) {
        if (PatchProxy.isSupport(new Object[]{fansclubStatisticMessage}, this, f13864a, false, 8338, new Class[]{FansclubStatisticMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fansclubStatisticMessage}, this, f13864a, false, 8338, new Class[]{FansclubStatisticMessage.class}, Void.TYPE);
        } else if (fansclubStatisticMessage != null) {
            if (!TextUtils.isEmpty(fansclubStatisticMessage.name)) {
                this.f13869f = fansclubStatisticMessage.name;
            }
            if (fansclubStatisticMessage.fansCount >= 0) {
                this.g = fansclubStatisticMessage.fansCount;
            }
            if (!TextUtils.isEmpty(this.f13869f) && this.g >= 0) {
                UIUtils.setViewVisibility(this.contentView, 0);
                this.f13865b.setText(getContext().getResources().getString(C0906R.string.cwg, new Object[]{this.f13869f, a.a(this.g, "w")}));
            }
        }
    }

    public final void a(v vVar) {
        v vVar2 = vVar;
        if (PatchProxy.isSupport(new Object[]{vVar2}, this, f13864a, false, 8339, new Class[]{v.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{vVar2}, this, f13864a, false, 8339, new Class[]{v.class}, Void.TYPE);
            return;
        }
        if (this.n != null && com.bytedance.android.live.uikit.a.a.f()) {
            l lVar = this.n;
            if (PatchProxy.isSupport(new Object[]{vVar2}, lVar, l.f13891a, false, 8330, new Class[]{v.class}, Void.TYPE)) {
                l lVar2 = lVar;
                PatchProxy.accessDispatch(new Object[]{vVar2}, lVar2, l.f13891a, false, 8330, new Class[]{v.class}, Void.TYPE);
            } else if (vVar2 != null && vVar2.f16691b == 2) {
                if (TTLiveSDKContext.getHostService().k().c()) {
                    long b2 = TTLiveSDKContext.getHostService().k().b();
                    User user = vVar2.f16693d;
                    if (user != null) {
                        if (b2 != user.getId()) {
                            lVar.f13892b.offer(vVar2);
                        } else if (!lVar.f13894d) {
                            lVar.f13892b.offerFirst(vVar2);
                        }
                    }
                } else {
                    lVar.f13892b.offer(vVar2);
                }
                lVar.a();
            }
        }
        User user2 = vVar2.f16693d;
        if (TTLiveSDKContext.getHostService().k().c()) {
            i a2 = TTLiveSDKContext.getHostService().k().a();
            if (!(user2 == null || a2 == null || a2.getId() != user2.getId())) {
                if (this.f13866c != null) {
                    this.f13866c.dismissAllowingStateLoss();
                    this.f13866c = null;
                }
                this.i = true;
            }
        }
    }

    public void onLoad(@Nullable Object[] objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f13864a, false, 8334, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f13864a, false, 8334, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f13867d = (Room) this.dataCenter.get("data_room");
        if (this.f13867d != null && this.f13867d.getOwner() != null) {
            if (PatchProxy.isSupport(new Object[0], this, f13864a, false, 8341, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f13864a, false, 8341, new Class[0], Void.TYPE);
            } else if (com.bytedance.android.live.uikit.a.a.f()) {
                this.n = new l(!((Boolean) this.dataCenter.get("data_is_portrait", Boolean.TRUE)).booleanValue());
                this.o = (JoinFansPortraitNotifyView) this.dataCenter.get("data_fans_club_anim_view", null);
                this.p = (FansClubEntryAnchorView) this.contentView.findViewById(C0906R.id.b6u);
                if (this.o != null) {
                    this.o.setAnchorView(this.p);
                    l lVar = this.n;
                    JoinFansPortraitNotifyView joinFansPortraitNotifyView = this.o;
                    if (PatchProxy.isSupport(new Object[]{joinFansPortraitNotifyView}, lVar, l.f13891a, false, 8331, new Class[]{l.a.class}, Void.TYPE)) {
                        l lVar2 = lVar;
                        PatchProxy.accessDispatch(new Object[]{joinFansPortraitNotifyView}, lVar2, l.f13891a, false, 8331, new Class[]{l.a.class}, Void.TYPE);
                    } else if (joinFansPortraitNotifyView != null) {
                        lVar.f13893c.add(joinFansPortraitNotifyView);
                    }
                }
            }
            this.q = com.bytedance.android.livesdk.u.a.a().a(b.class).subscribe((Consumer<? super T>) new n<Object>(this));
            String str = (String) this.dataCenter.get("log_enter_live_source");
            this.dataCenter.observeForever("data_user_in_room", new o(this));
            com.bytedance.android.livesdk.n.a aVar = (com.bytedance.android.livesdk.n.a) j.q().k().a(com.bytedance.android.livesdk.n.a.class);
            if (aVar != null) {
                this.l = ((LiveFansClubApi) j.q().d().a(LiveFansClubApi.class)).queryFansClubInfo(aVar.a(), this.f13867d.getOwner().getId()).compose(com.bytedance.android.live.core.rxutils.i.a()).subscribe((Consumer<? super T>) new p<Object>(this));
                this.m.a((c.a) this);
                this.containerView.setOnClickListener(new q(this, str));
            }
        }
    }

    public final void a(@Nullable KVData kVData) {
        if (PatchProxy.isSupport(new Object[]{kVData}, this, f13864a, false, 8337, new Class[]{KVData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVData}, this, f13864a, false, 8337, new Class[]{KVData.class}, Void.TYPE);
        } else if (kVData != null) {
            String key = kVData.getKey();
            char c2 = 65535;
            if (key.hashCode() == -1741164106 && key.equals("data_user_in_room")) {
                c2 = 0;
            }
            if (c2 == 0) {
                Object data = kVData.getData();
                if (data instanceof User) {
                    this.f13868e = (User) data;
                }
            }
        }
    }
}

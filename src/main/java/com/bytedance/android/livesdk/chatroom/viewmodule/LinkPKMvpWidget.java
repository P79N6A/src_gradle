package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.Observer;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.t;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.c.c;
import com.bytedance.android.livesdk.chatroom.c.d;
import com.bytedance.android.livesdk.chatroom.f.b;
import com.bytedance.android.livesdk.chatroom.interact.c.fk;
import com.bytedance.android.livesdk.chatroom.model.a.n;
import com.bytedance.android.livesdk.chatroom.viewmodule.LinkCrossRoomWidget;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.common.utility.Lists;
import com.bytedance.ies.sdk.widgets.KVData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;

public class LinkPKMvpWidget extends LinkCrossRoomWidget.SubWidget implements Observer<KVData>, fk.a {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f12622e;

    /* renamed from: f  reason: collision with root package name */
    List<a> f12623f = new ArrayList();
    List<a> g = new ArrayList();
    private c<LinearLayout> h;
    private c<LinearLayout> i;
    private fk j;
    private d k;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f12624a;

        /* renamed from: b  reason: collision with root package name */
        public View f12625b;

        /* renamed from: c  reason: collision with root package name */
        public VHeadView f12626c;

        /* renamed from: d  reason: collision with root package name */
        View f12627d;

        /* renamed from: e  reason: collision with root package name */
        TextView f12628e;

        /* renamed from: f  reason: collision with root package name */
        View f12629f;

        private a(View view) {
            this.f12625b = view.findViewById(C0906R.id.b4l);
            this.f12626c = (VHeadView) view.findViewById(C0906R.id.ayr);
            this.f12627d = view.findViewById(C0906R.id.b0c);
            this.f12628e = (TextView) view.findViewById(C0906R.id.dgy);
            this.f12629f = view.findViewById(C0906R.id.b3l);
        }

        /* synthetic */ a(View view, byte b2) {
            this(view);
        }
    }

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f12622e, false, 7097, new Class[0], String.class)) {
            return am.a(this);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f12622e, false, 7097, new Class[0], String.class);
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f12622e, false, 7098, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f12622e, false, 7098, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        am.a(this, th);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f12622e, false, 7092, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12622e, false, 7092, new Class[0], Void.TYPE);
            return;
        }
        this.j.d();
        this.f12607b.removeObserver(this);
        this.k.a();
        super.onDestroy();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f12622e, false, 7095, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12622e, false, 7095, new Class[0], Void.TYPE);
            return;
        }
        ((LinearLayout) this.h.f9861c).removeAllViews();
        this.f12623f.clear();
        a aVar = new a(LayoutInflater.from(this.context).inflate(C0906R.layout.anj, (ViewGroup) this.h.f9861c, true), (byte) 0);
        aVar.f12625b.setBackgroundResource(2130841299);
        aVar.f12626c.setImageResource(2130841298);
        this.f12623f.add(aVar);
        ((LinearLayout) this.i.f9861c).removeAllViews();
        this.g.clear();
        a aVar2 = new a(LayoutInflater.from(this.context).inflate(C0906R.layout.anj, (ViewGroup) this.i.f9861c, true), (byte) 0);
        aVar2.f12625b.setBackgroundResource(2130841303);
        aVar2.f12626c.setImageResource(2130841302);
        this.g.add(aVar2);
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f12622e, false, 7091, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12622e, false, 7091, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.k = new d(this.f12607b, this.contentView);
        this.h = this.k.a(C0906R.id.bb1).a(new bp(this)).a("data_pk_mvp_list_anchor", new bq(this)).a("data_pk_state", new br(this)).a();
        this.i = this.k.a(C0906R.id.cer).a(new bs(this)).a("data_pk_mvp_list_guest", new bt(this)).a("data_pk_state", new bu(this)).a();
        b();
        this.f12607b.observe("cmd_pk_mvp_show_list", this).observe("cmd_pk_show_interface", this);
        this.j = new fk(this.dataCenter);
        this.j.a((fk.a) this);
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        KVData kVData = (KVData) obj;
        if (PatchProxy.isSupport(new Object[]{kVData}, this, f12622e, false, 7090, new Class[]{KVData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVData}, this, f12622e, false, 7090, new Class[]{KVData.class}, Void.TYPE);
        } else if (kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c2 = 65535;
            int hashCode = key.hashCode();
            if (hashCode != 1608385910) {
                if (hashCode == 1619041129 && key.equals("cmd_pk_mvp_show_list")) {
                    c2 = 0;
                }
            } else if (key.equals("cmd_pk_show_interface")) {
                c2 = 1;
            }
            switch (c2) {
                case 0:
                    a(true);
                    return;
                case 1:
                    if (!PatchProxy.isSupport(new Object[0], this, f12622e, false, 7094, new Class[0], Void.TYPE)) {
                        ((LinearLayout) this.h.f9861c).setVisibility(0);
                        ((LinearLayout) this.i.f9861c).setVisibility(0);
                        break;
                    } else {
                        PatchProxy.accessDispatch(new Object[0], this, f12622e, false, 7094, new Class[0], Void.TYPE);
                        return;
                    }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        long j2;
        long j3;
        String str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f12622e, false, 7096, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f12622e, false, 7096, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            j2 = this.f12608c.getOwner().getId();
        } else {
            j2 = this.f12607b.f9032f;
        }
        List list = null;
        LinkCrossRoomDataHolder.c cVar = (LinkCrossRoomDataHolder.c) this.f12607b.get("data_pk_result");
        if (z && cVar == LinkCrossRoomDataHolder.c.LEFT_WON) {
            list = (List) this.f12607b.get("data_pk_mvp_list_anchor");
        } else if (!z && cVar == LinkCrossRoomDataHolder.c.RIGHT_WON) {
            list = (List) this.f12607b.get("data_pk_mvp_list_guest");
        }
        if (!t.a(list)) {
            j3 = ((n.a) list.get(0)).f11063a;
        } else {
            j3 = -1;
        }
        if (com.bytedance.android.livesdkapi.a.a.f18616d) {
            str = "https://api.hypstar.com/hotsoon/in_app/pk_mvp_rank/";
        } else {
            str = "https://hotsoon.snssdk.com/hotsoon/in_app/common_live/mvp_rank/";
        }
        Uri.Builder appendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("channel_id", String.valueOf(this.f12607b.f9030d)).appendQueryParameter("anchor_id", String.valueOf(j2)).appendQueryParameter("room_id", String.valueOf(this.f12608c.getId()));
        if (j3 != -1) {
            appendQueryParameter.appendQueryParameter("mvp_id", String.valueOf(j3));
        }
        int e2 = (int) ac.e(ac.c());
        BaseDialogFragment.a((FragmentActivity) this.context, (DialogFragment) j.q().f().a(com.bytedance.android.livesdk.browser.c.c.a(appendQueryParameter.build().toString()).a(e2).b((e2 / 16) * 15).a(8, 8, 0, 0).e(80)));
    }

    LinkPKMvpWidget(View view, ViewGroup viewGroup) {
        super(view, viewGroup);
    }

    /* access modifiers changed from: package-private */
    public void a(List<n.a> list, List<a> list2, LinearLayout linearLayout, boolean z) {
        List<n.a> list3 = list;
        List<a> list4 = list2;
        LinearLayout linearLayout2 = linearLayout;
        if (PatchProxy.isSupport(new Object[]{list3, list4, linearLayout2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f12622e, false, 7093, new Class[]{List.class, List.class, LinearLayout.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list3, list4, linearLayout2, Byte.valueOf(z)}, this, f12622e, false, 7093, new Class[]{List.class, List.class, LinearLayout.class, Boolean.TYPE}, Void.TYPE);
        } else if (!Lists.isEmpty(list)) {
            while (linearLayout.getChildCount() < list.size()) {
                View inflate = LayoutInflater.from(this.context).inflate(C0906R.layout.anj, linearLayout2, false);
                if (z) {
                    linearLayout2.addView(inflate, 0);
                } else {
                    linearLayout2.addView(inflate);
                }
                list4.add(new a(inflate, (byte) 0));
            }
            LinkCrossRoomDataHolder.c cVar = (LinkCrossRoomDataHolder.c) this.f12607b.get("data_pk_result");
            for (int i2 = 0; i2 < list.size(); i2++) {
                n.a aVar = list3.get(i2);
                a aVar2 = list4.get(i2);
                Object[] objArr = {aVar, Byte.valueOf(z), Integer.valueOf(i2), cVar};
                if (PatchProxy.isSupport(objArr, aVar2, a.f12624a, false, 7107, new Class[]{n.a.class, Boolean.TYPE, Integer.TYPE, LinkCrossRoomDataHolder.c.class}, Void.TYPE)) {
                    Object[] objArr2 = {aVar, Byte.valueOf(z), Integer.valueOf(i2), cVar};
                    Object[] objArr3 = objArr2;
                    a aVar3 = aVar2;
                    PatchProxy.accessDispatch(objArr3, aVar3, a.f12624a, false, 7107, new Class[]{n.a.class, Boolean.TYPE, Integer.TYPE, LinkCrossRoomDataHolder.c.class}, Void.TYPE);
                } else {
                    aVar2.f12628e.setText(String.valueOf(i2 + 1));
                    aVar2.f12628e.setVisibility(0);
                    b.a((ImageView) aVar2.f12626c, aVar.f11066d, 2130841298);
                    if (z && cVar != LinkCrossRoomDataHolder.c.RIGHT_WON) {
                        aVar2.f12625b.setBackgroundResource(2130841299);
                        aVar2.f12628e.setBackgroundResource(2130840891);
                        if (i2 == 0) {
                            aVar2.f12627d.setVisibility(0);
                            aVar2.f12627d.setBackgroundResource(2130841297);
                        }
                    } else if (z || cVar == LinkCrossRoomDataHolder.c.LEFT_WON) {
                        aVar2.f12625b.setBackgroundResource(2130841300);
                        aVar2.f12628e.setBackgroundResource(2130840892);
                        aVar2.f12627d.setVisibility(8);
                    } else {
                        aVar2.f12625b.setBackgroundResource(2130841303);
                        aVar2.f12628e.setBackgroundResource(2130840893);
                        if (i2 == 0) {
                            aVar2.f12627d.setVisibility(0);
                            aVar2.f12627d.setBackgroundResource(2130841301);
                        }
                    }
                    if (i2 != 0 || ((!z || cVar != LinkCrossRoomDataHolder.c.LEFT_WON) && (z || cVar != LinkCrossRoomDataHolder.c.RIGHT_WON))) {
                        aVar2.f12629f.setVisibility(8);
                    } else {
                        aVar2.f12629f.setVisibility(0);
                    }
                }
            }
        }
    }
}

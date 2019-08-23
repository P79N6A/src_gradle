package com.bytedance.android.livesdk.chatroom.viewmodule.toolbar;

import android.arch.lifecycle.Observer;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.livesdk.chatroom.viewmodule.a.a.b;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.utils.ak;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LiveToolbarWidget extends LiveRecyclableWidget implements Observer<KVData> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13302a = null;

    /* renamed from: b  reason: collision with root package name */
    static final int f13303b = 2131691413;

    /* renamed from: c  reason: collision with root package name */
    private List<f> f13304c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private Map<f, View> f13305d;

    /* renamed from: e  reason: collision with root package name */
    private i f13306e;

    /* renamed from: f  reason: collision with root package name */
    private Map<f, View> f13307f = new HashMap();
    private ViewGroup g;
    private boolean h;

    public int getLayoutId() {
        return C0906R.layout.an9;
    }

    public void onClear() {
        if (PatchProxy.isSupport(new Object[0], this, f13302a, false, 7703, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13302a, false, 7703, new Class[0], Void.TYPE);
            return;
        }
        super.onClear();
        j.e();
    }

    public void onUnload() {
        if (PatchProxy.isSupport(new Object[0], this, f13302a, false, 7702, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13302a, false, 7702, new Class[0], Void.TYPE);
            return;
        }
        j.c().a(f.GOODS, (a) new b(8));
        this.dataCenter.removeObserver(this);
        if (PatchProxy.isSupport(new Object[0], this, f13302a, false, 7706, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13302a, false, 7706, new Class[0], Void.TYPE);
        } else {
            for (f next : this.f13304c) {
                View view = this.f13305d.get(next);
                if (view != null) {
                    this.g.removeView(view);
                    this.f13306e.b(next, view);
                }
            }
        }
        this.f13304c.clear();
        j.d();
    }

    private void a() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f13302a, false, 7704, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13302a, false, 7704, new Class[0], Void.TYPE);
            return;
        }
        LayoutInflater from = LayoutInflater.from(this.context);
        for (f next : this.f13304c) {
            View view = this.f13307f.get(next);
            if (view == null) {
                view = from.inflate(next.getLayoutId(), this.g, false);
                if (next.getLayoutId() == f13303b) {
                    this.f13307f.put(next, view);
                }
            }
            if (a.d() && next.getTitleId() != 0) {
                if (next.getTitleId() == C0906R.string.ddd) {
                    i = C0906R.string.czx;
                } else {
                    i = next.getTitleId();
                }
                view.setContentDescription(ac.a(i));
            }
            if (next.getLayoutId() == f13303b) {
                view.setBackgroundResource(next.getDrawableUnfolded());
            }
            if (next == f.TURNTABLE) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f13302a, false, 7705, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f13302a, false, 7705, new Class[]{View.class}, Void.TYPE);
                } else {
                    HSImageView hSImageView = (HSImageView) view.findViewById(C0906R.id.d8_);
                    String str = (String) LiveSettingKeys.TURNTABLE_ICON_URL.a();
                    if (str == null || str.isEmpty()) {
                        com.bytedance.android.livesdk.chatroom.f.b.a(hSImageView, 2130841234);
                    } else {
                        com.bytedance.android.livesdk.chatroom.f.b.a(hSImageView, str);
                    }
                }
            }
            view.setTag(next);
            view.setVisibility(8);
            this.f13305d.put(next, view);
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            this.g.addView(view);
            this.f13306e.a(next, view);
        }
    }

    public void onInit(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f13302a, false, 7700, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f13302a, false, 7700, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.g = (ViewGroup) this.contentView.findViewById(C0906R.id.aa);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        if (r0.equals("data_keyboard_status") != false) goto L_0x007a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onChanged(@android.support.annotation.Nullable java.lang.Object r11) {
        /*
            r10 = this;
            r7 = r11
            com.bytedance.ies.sdk.widgets.KVData r7 = (com.bytedance.ies.sdk.widgets.KVData) r7
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f13302a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.ies.sdk.widgets.KVData> r1 = com.bytedance.ies.sdk.widgets.KVData.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 7699(0x1e13, float:1.0789E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0033
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f13302a
            r3 = 0
            r4 = 7699(0x1e13, float:1.0789E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.ies.sdk.widgets.KVData> r1 = com.bytedance.ies.sdk.widgets.KVData.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0033:
            if (r7 == 0) goto L_0x00ca
            java.lang.String r0 = r7.getKey()
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r0 = r7.getData()
            if (r0 != 0) goto L_0x0043
            goto L_0x00ca
        L_0x0043:
            java.lang.String r0 = r7.getKey()
            r1 = -1
            int r2 = r0.hashCode()
            r3 = -1548871708(0xffffffffa3ae17e4, float:-1.8875236E-17)
            if (r2 == r3) goto L_0x006f
            r3 = 1060055221(0x3f2f28b5, float:0.6842149)
            if (r2 == r3) goto L_0x0066
            r3 = 1939188655(0x7395abaf, float:2.371626E31)
            if (r2 == r3) goto L_0x005c
            goto L_0x0079
        L_0x005c:
            java.lang.String r2 = "data_screen_record_is_open"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0079
            r8 = 0
            goto L_0x007a
        L_0x0066:
            java.lang.String r2 = "data_keyboard_status"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0079
            goto L_0x007a
        L_0x006f:
            java.lang.String r2 = "cmd_hide_in_douyin_commerce"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0079
            r8 = 2
            goto L_0x007a
        L_0x0079:
            r8 = -1
        L_0x007a:
            r0 = 4
            switch(r8) {
                case 0: goto L_0x00b1;
                case 1: goto L_0x0097;
                case 2: goto L_0x007f;
                default: goto L_0x007e;
            }
        L_0x007e:
            goto L_0x00c9
        L_0x007f:
            java.lang.Object r1 = r7.getData()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0091
            android.view.View r1 = r10.contentView
            r1.setVisibility(r0)
            return
        L_0x0091:
            android.view.View r0 = r10.contentView
            r0.setVisibility(r9)
            goto L_0x00c9
        L_0x0097:
            java.lang.Object r1 = r7.getData()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x00a9
            android.view.View r1 = r10.contentView
            r1.setVisibility(r0)
            return
        L_0x00a9:
            android.view.View r0 = r10.contentView
            r0.setVisibility(r9)
            r10.h = r9
            return
        L_0x00b1:
            java.lang.Object r1 = r7.getData()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x00c3
            boolean r1 = r10.h
            if (r1 == 0) goto L_0x00c2
            goto L_0x00c3
        L_0x00c2:
            r0 = 0
        L_0x00c3:
            android.view.View r1 = r10.contentView
            r1.setVisibility(r0)
            return
        L_0x00c9:
            return
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.LiveToolbarWidget.onChanged(java.lang.Object):void");
    }

    public void onLoad(Object... objArr) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f13302a, false, 7701, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f13302a, false, 7701, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f13306e = (i) j.a();
        this.f13305d = this.f13306e.f13327c;
        this.f13306e.f13326b = this.dataCenter;
        ((i) j.b()).f13326b = this.dataCenter;
        this.dataCenter.observe("data_screen_record_is_open", this).observe("data_keyboard_status", this).observeForever("cmd_hide_in_douyin_commerce", this);
        if (TextUtils.isEmpty((CharSequence) LiveConfigSettingKeys.LIVE_TURNTABLE_URL.a())) {
            ((IGiftService) com.bytedance.android.live.utility.b.a(IGiftService.class)).onTurnTableUrlEmpty("LiveConfigSettingKeys取出为空");
        }
        j.q().j().a(this.dataCenter, this.f13304c);
        List<f> list = this.f13304c;
        if (PatchProxy.isSupport(new Object[]{list}, this, f13302a, false, 7707, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f13302a, false, 7707, new Class[]{List.class}, Void.TYPE);
        } else {
            if (Lists.isEmpty(list) || !list.contains(f.TURNTABLE)) {
                z = false;
            } else {
                z = true;
            }
            com.bytedance.android.live.core.c.a.b("LiveToolbarWidget", "toolbarButton list contain TurnTable : " + z);
        }
        a();
        j.q().j().a(this.dataCenter, this.context);
        Room room = (Room) this.dataCenter.get("data_room");
        boolean booleanValue = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        if (a.f() && room != null && room.getOrientation() != 0 && !booleanValue) {
            this.contentView.setPadding(this.contentView.getPaddingLeft(), this.contentView.getPaddingTop(), (int) ak.a(getContext(), 16.0f), this.contentView.getPaddingBottom());
        }
        if (PatchProxy.isSupport(new Object[0], this, f13302a, false, 7708, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13302a, false, 7708, new Class[0], Void.TYPE);
            return;
        }
        if (a.f() && this.dataCenter != null) {
            Room room2 = (Room) this.dataCenter.get("data_room");
            if (room2 != null && room2.getOrientation() == 1) {
                this.contentView.setPadding(this.contentView.getPaddingLeft(), this.contentView.getPaddingTop(), (int) ak.a(getContext(), 12.0f), this.contentView.getPaddingBottom());
                if (this.g != null) {
                    UIUtils.updateLayoutMargin(this.g.findViewById(C0906R.id.d4h), (int) ak.a(getContext(), 12.0f), -3, (int) ak.a(getContext(), 4.0f), -3);
                }
            }
        }
    }
}

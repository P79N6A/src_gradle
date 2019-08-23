package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.presenter.bt;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class RoomPushWidget extends LiveRecyclableWidget implements Observer<KVData>, bt.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12792a;

    /* renamed from: b  reason: collision with root package name */
    bt f12793b;

    /* renamed from: c  reason: collision with root package name */
    boolean f12794c;

    /* renamed from: d  reason: collision with root package name */
    TextView f12795d;

    /* renamed from: e  reason: collision with root package name */
    Room f12796e;

    /* renamed from: f  reason: collision with root package name */
    private HSImageView f12797f;
    private ImageView g;
    private boolean h;
    private User i;

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f12792a, false, 7467, new Class[0], String.class)) {
            return am.a(this);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f12792a, false, 7467, new Class[0], String.class);
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f12792a, false, 7468, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f12792a, false, 7468, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        am.a(this, th);
    }

    public int getLayoutId() {
        return C0906R.layout.anu;
    }

    public final boolean b() {
        return this.f12794c;
    }

    public void onUnload() {
        if (PatchProxy.isSupport(new Object[0], this, f12792a, false, 7459, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12792a, false, 7459, new Class[0], Void.TYPE);
            return;
        }
        this.f12793b.d();
        this.dataCenter.removeObserver(this);
        this.contentView.setVisibility(8);
        this.f12794c = false;
        this.i = null;
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        KVData kVData = (KVData) obj;
        if (PatchProxy.isSupport(new Object[]{kVData}, this, f12792a, false, 7466, new Class[]{KVData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVData}, this, f12792a, false, 7466, new Class[]{KVData.class}, Void.TYPE);
            return;
        }
        if (kVData != null) {
            String key = kVData.getKey();
            char c2 = 65535;
            if (key.hashCode() == -1741164106 && key.equals("data_user_in_room")) {
                c2 = 0;
            }
            if (c2 == 0) {
                Object data = kVData.getData();
                if (data instanceof User) {
                    this.i = (User) data;
                }
            }
        }
    }

    public void onInit(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12792a, false, 7457, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12792a, false, 7457, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f12793b = new bt();
        this.f12797f = (HSImageView) this.contentView.findViewById(C0906R.id.c9e);
        this.f12795d = (TextView) this.contentView.findViewById(C0906R.id.c9d);
        this.g = (ImageView) this.contentView.findViewById(C0906R.id.cel);
    }

    public void onLoad(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f12792a, false, 7458, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f12792a, false, 7458, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f12796e = (Room) this.dataCenter.get("data_room");
        this.h = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.dataCenter.observeForever("data_user_in_room", this);
        this.f12793b.a((bt.a) this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x036e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.android.livesdk.message.model.be r32) {
        /*
            r31 = this;
            r7 = r31
            r8 = r32
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f12792a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.message.model.be> r1 = com.bytedance.android.livesdk.message.model.be.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 7460(0x1d24, float:1.0454E-41)
            r1 = r31
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f12792a
            r3 = 0
            r4 = 7460(0x1d24, float:1.0454E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.message.model.be> r1 = com.bytedance.android.livesdk.message.model.be.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r31
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0036:
            boolean r0 = r31.isViewValid()
            if (r0 == 0) goto L_0x03a8
            boolean r0 = r7.f12794c
            if (r0 == 0) goto L_0x0042
            goto L_0x03a8
        L_0x0042:
            android.widget.ImageView r0 = r7.g
            r0.setVisibility(r10)
            com.bytedance.android.live.core.widget.HSImageView r0 = r7.f12797f
            r0.setVisibility(r10)
            if (r8 == 0) goto L_0x03a7
            com.bytedance.android.livesdk.message.model.bf r0 = r8.f16553b
            if (r0 == 0) goto L_0x03a7
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f12792a
            r3 = 0
            r4 = 7461(0x1d25, float:1.0455E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r31
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0076
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f12792a
            r3 = 0
            r4 = 7461(0x1d25, float:1.0455E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r31
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00a4
        L_0x0076:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "anchor_id"
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r7.f12796e
            long r2 = r2.getOwnerUserId()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.put(r1, r2)
            java.lang.String r1 = "room_id"
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r7.f12796e
            long r2 = r2.getId()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.put(r1, r2)
            com.bytedance.android.livesdk.j.a r1 = com.bytedance.android.livesdk.j.a.a()
            java.lang.String r2 = "livesdk_bottom_message_show"
            java.lang.Object[] r3 = new java.lang.Object[r10]
            r1.a(r2, r0, r3)
        L_0x00a4:
            com.bytedance.android.livesdk.message.model.bf r0 = r8.f16553b
            com.bytedance.android.live.base.model.ImageModel r0 = r0.f16557d
            r11 = 2
            if (r0 == 0) goto L_0x01a3
            com.bytedance.android.live.core.widget.HSImageView r12 = r7.f12797f
            com.bytedance.android.livesdk.message.model.bf r0 = r8.f16553b
            com.bytedance.android.live.base.model.ImageModel r13 = r0.f16557d
            com.bytedance.android.live.core.widget.HSImageView r0 = r7.f12797f
            int r15 = r0.getWidth()
            com.bytedance.android.live.core.widget.HSImageView r0 = r7.f12797f
            int r16 = r0.getHeight()
            r0 = 5
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r10] = r12
            r1[r9] = r13
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r1[r11] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r3 = 3
            r1[r3] = r2
            r2 = 2130841194(0x7f020e6a, float:1.7287448E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r5 = 4
            r1[r5] = r4
            r18 = 0
            com.meituan.robust.ChangeQuickRedirect r19 = com.bytedance.android.livesdk.chatroom.f.b.f10213a
            r20 = 1
            r21 = 6487(0x1957, float:9.09E-42)
            java.lang.Class[] r4 = new java.lang.Class[r0]
            java.lang.Class<com.bytedance.android.live.core.widget.HSImageView> r6 = com.bytedance.android.live.core.widget.HSImageView.class
            r4[r10] = r6
            java.lang.Class<com.bytedance.android.live.base.model.ImageModel> r6 = com.bytedance.android.live.base.model.ImageModel.class
            r4[r9] = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            r4[r11] = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            r4[r3] = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            r4[r5] = r6
            java.lang.Class r23 = java.lang.Void.TYPE
            r17 = r1
            r22 = r4
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r17, r18, r19, r20, r21, r22, r23)
            if (r1 == 0) goto L_0x0146
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r10] = r12
            r1[r9] = r13
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            r1[r11] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)
            r1[r3] = r4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r5] = r2
            r18 = 0
            com.meituan.robust.ChangeQuickRedirect r19 = com.bytedance.android.livesdk.chatroom.f.b.f10213a
            r20 = 1
            r21 = 6487(0x1957, float:9.09E-42)
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<com.bytedance.android.live.core.widget.HSImageView> r2 = com.bytedance.android.live.core.widget.HSImageView.class
            r0[r10] = r2
            java.lang.Class<com.bytedance.android.live.base.model.ImageModel> r2 = com.bytedance.android.live.base.model.ImageModel.class
            r0[r9] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r0[r11] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r0[r3] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r0[r5] = r2
            java.lang.Class r23 = java.lang.Void.TYPE
            r17 = r1
            r22 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x01bb
        L_0x0146:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0[r10] = r1
            r25 = 0
            com.meituan.robust.ChangeQuickRedirect r26 = com.bytedance.android.live.core.utils.k.f8293a
            r27 = 1
            r28 = 1121(0x461, float:1.571E-42)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r1[r10] = r3
            java.lang.Class<android.graphics.drawable.Drawable> r30 = android.graphics.drawable.Drawable.class
            r24 = r0
            r29 = r1
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r24, r25, r26, r27, r28, r29, r30)
            if (r0 == 0) goto L_0x018c
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0[r10] = r1
            r18 = 0
            com.meituan.robust.ChangeQuickRedirect r19 = com.bytedance.android.live.core.utils.k.f8293a
            r20 = 1
            r21 = 1121(0x461, float:1.571E-42)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r10] = r2
            java.lang.Class<android.graphics.drawable.Drawable> r23 = android.graphics.drawable.Drawable.class
            r17 = r0
            r22 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r17, r18, r19, r20, r21, r22, r23)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
        L_0x018a:
            r14 = r0
            goto L_0x0199
        L_0x018c:
            android.content.Context r0 = com.bytedance.android.live.core.utils.ac.e()
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.drawable.Drawable r0 = com.ss.android.ugc.bytex.a.a.a.a((android.content.res.Resources) r0, (int) r2)
            goto L_0x018a
        L_0x0199:
            r17 = 0
            r18 = 0
            r19 = 0
            com.bytedance.android.live.core.utils.k.a(r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x01bb
        L_0x01a3:
            com.bytedance.android.livesdk.message.model.bf r0 = r8.f16553b
            int r0 = r0.k
            if (r0 == 0) goto L_0x01b3
            com.bytedance.android.live.core.widget.HSImageView r0 = r7.f12797f
            com.bytedance.android.livesdk.message.model.bf r1 = r8.f16553b
            int r1 = r1.k
            com.bytedance.android.livesdk.chatroom.f.b.a((com.bytedance.android.live.core.widget.HSImageView) r0, (int) r1)
            goto L_0x01bb
        L_0x01b3:
            com.bytedance.android.live.core.widget.HSImageView r0 = r7.f12797f
            r1 = 2130841309(0x7f020edd, float:1.7287681E38)
            r0.setBackgroundResource(r1)
        L_0x01bb:
            com.bytedance.android.livesdk.message.model.bf r0 = r8.f16553b
            com.bytedance.android.live.base.model.ImageModel r0 = r0.i
            r12 = 0
            if (r0 == 0) goto L_0x0212
            android.view.View r13 = r7.contentView
            com.bytedance.android.livesdk.message.model.bf r0 = r8.f16553b
            com.bytedance.android.live.base.model.ImageModel r14 = r0.i
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r10] = r13
            r0[r9] = r14
            com.meituan.robust.ChangeQuickRedirect r2 = f12792a
            r3 = 0
            r4 = 7465(0x1d29, float:1.046E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r10] = r1
            java.lang.Class<com.bytedance.android.live.base.model.ImageModel> r1 = com.bytedance.android.live.base.model.ImageModel.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r31
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0204
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r10] = r13
            r0[r9] = r14
            com.meituan.robust.ChangeQuickRedirect r2 = f12792a
            r3 = 0
            r4 = 7465(0x1d29, float:1.046E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r10] = r1
            java.lang.Class<com.bytedance.android.live.base.model.ImageModel> r1 = com.bytedance.android.live.base.model.ImageModel.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r31
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0231
        L_0x0204:
            com.bytedance.android.livesdk.chatroom.f.d r0 = com.bytedance.android.livesdk.chatroom.f.d.f10220b
            android.content.Context r1 = com.bytedance.android.live.core.utils.ac.e()
            boolean r1 = com.bytedance.android.live.uikit.d.c.a(r1)
            r0.a(r14, r13, r1, r12)
            goto L_0x0231
        L_0x0212:
            com.bytedance.android.livesdk.message.model.bf r0 = r8.f16553b
            java.lang.String r0 = r0.f16555b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0231
            android.view.View r0 = r7.contentView
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
            com.bytedance.android.livesdk.message.model.bf r1 = r8.f16553b     // Catch:{ Exception -> 0x0230 }
            java.lang.String r1 = r1.f16555b     // Catch:{ Exception -> 0x0230 }
            int r1 = android.graphics.Color.parseColor(r1)     // Catch:{ Exception -> 0x0230 }
            r0.setColor(r1)     // Catch:{ Exception -> 0x0230 }
            goto L_0x0231
        L_0x0230:
        L_0x0231:
            com.bytedance.android.livesdk.message.model.bf r0 = r8.f16553b
            com.bytedance.android.live.base.model.ImageModel r0 = r0.j
            if (r0 == 0) goto L_0x0240
            android.widget.ImageView r0 = r7.g
            com.bytedance.android.livesdk.message.model.bf r1 = r8.f16553b
            com.bytedance.android.live.base.model.ImageModel r1 = r1.j
            com.bytedance.android.livesdk.chatroom.f.b.a((android.widget.ImageView) r0, (com.bytedance.android.live.base.model.ImageModel) r1)
        L_0x0240:
            com.bytedance.android.livesdk.message.model.bf r0 = r8.f16553b
            java.lang.String r0 = r0.f16559f
            java.lang.String r1 = "0"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0258
            android.widget.ImageView r1 = r7.g
            r2 = 8
            r1.setVisibility(r2)
            com.bytedance.android.live.core.widget.HSImageView r1 = r7.f12797f
            r1.setVisibility(r2)
        L_0x0258:
            java.lang.String r1 = "7"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02ce
            com.bytedance.android.livesdk.message.model.bf r1 = r8.f16553b
            java.lang.String r1 = r1.f16558e
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x02ce
            com.bytedance.android.livesdk.message.model.bf r1 = r8.f16553b     // Catch:{ Exception -> 0x031b }
            java.lang.String r1 = r1.f16558e     // Catch:{ Exception -> 0x031b }
            com.google.gson.JsonParser r2 = new com.google.gson.JsonParser     // Catch:{ Exception -> 0x031b }
            r2.<init>()     // Catch:{ Exception -> 0x031b }
            com.google.gson.JsonElement r1 = r2.parse((java.lang.String) r1)     // Catch:{ Exception -> 0x031b }
            com.google.gson.JsonObject r1 = r1.getAsJsonObject()     // Catch:{ Exception -> 0x031b }
            if (r1 == 0) goto L_0x02bc
            java.util.Set r2 = r1.entrySet()     // Catch:{ Exception -> 0x031b }
            int r2 = r2.size()     // Catch:{ Exception -> 0x031b }
            if (r2 <= 0) goto L_0x02bc
            java.lang.String r2 = "gift_id"
            com.google.gson.JsonElement r2 = r1.get(r2)     // Catch:{ Exception -> 0x031b }
            long r2 = r2.getAsLong()     // Catch:{ Exception -> 0x031b }
            java.lang.String r4 = "count"
            com.google.gson.JsonElement r1 = r1.get(r4)     // Catch:{ Exception -> 0x031b }
            int r1 = r1.getAsInt()     // Catch:{ Exception -> 0x031b }
            java.lang.Class<com.bytedance.android.live.gift.IGiftService> r4 = com.bytedance.android.live.gift.IGiftService.class
            com.bytedance.android.live.base.b r4 = com.bytedance.android.live.utility.b.a(r4)     // Catch:{ Exception -> 0x031b }
            com.bytedance.android.live.gift.IGiftService r4 = (com.bytedance.android.live.gift.IGiftService) r4     // Catch:{ Exception -> 0x031b }
            com.bytedance.android.livesdk.gift.model.b r2 = r4.findGiftById(r2)     // Catch:{ Exception -> 0x031b }
            if (r2 == 0) goto L_0x02bc
            r3 = 2131563610(0x7f0d145a, float:1.8752682E38)
            java.lang.Object[] r4 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x031b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x031b }
            r4[r10] = r1     // Catch:{ Exception -> 0x031b }
            java.lang.String r1 = r2.f15102a     // Catch:{ Exception -> 0x031b }
            r4[r9] = r1     // Catch:{ Exception -> 0x031b }
            java.lang.String r12 = com.bytedance.android.live.core.utils.ac.a((int) r3, (java.lang.Object[]) r4)     // Catch:{ Exception -> 0x031b }
        L_0x02bc:
            if (r12 == 0) goto L_0x02c4
            android.widget.TextView r1 = r7.f12795d     // Catch:{ Exception -> 0x031b }
            r1.setText(r12)     // Catch:{ Exception -> 0x031b }
            goto L_0x0324
        L_0x02c4:
            android.widget.TextView r1 = r7.f12795d     // Catch:{ Exception -> 0x031b }
            com.bytedance.android.livesdk.message.model.bf r2 = r8.f16553b     // Catch:{ Exception -> 0x031b }
            java.lang.String r2 = r2.f16554a     // Catch:{ Exception -> 0x031b }
            r1.setText(r2)     // Catch:{ Exception -> 0x031b }
            goto L_0x0324
        L_0x02ce:
            boolean r1 = r32.supportDisplayText()
            if (r1 == 0) goto L_0x031b
            com.bytedance.android.livesdkapi.h.b r1 = r8.baseMessage
            com.bytedance.android.livesdkapi.h.e r1 = r1.j
            java.lang.String r2 = r1.f18782a
            if (r2 == 0) goto L_0x02f7
            com.bytedance.android.livesdk.i18n.b r2 = com.bytedance.android.livesdk.i18n.b.a()
            java.lang.String r3 = r1.f18782a
            java.lang.String r2 = r2.a(r3)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x02f7
            com.bytedance.android.livesdk.i18n.b r2 = com.bytedance.android.livesdk.i18n.b.a()
            java.lang.String r3 = r1.f18782a
            java.lang.String r2 = r2.a(r3)
            goto L_0x02f9
        L_0x02f7:
            java.lang.String r2 = r1.f18783b
        L_0x02f9:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0311
            android.text.Spannable r3 = com.bytedance.android.livesdk.chatroom.e.y.a((java.lang.String) r2, (com.bytedance.android.livesdkapi.h.e) r1)
            android.text.Spannable r4 = com.bytedance.android.livesdk.chatroom.e.x.f10027b
            if (r3 == r4) goto L_0x0311
            android.widget.TextView r3 = r7.f12795d
            android.text.Spannable r1 = com.bytedance.android.livesdk.chatroom.e.y.a((java.lang.String) r2, (com.bytedance.android.livesdkapi.h.e) r1)
            r3.setText(r1)
            goto L_0x0324
        L_0x0311:
            android.widget.TextView r1 = r7.f12795d
            com.bytedance.android.livesdk.message.model.bf r2 = r8.f16553b
            java.lang.String r2 = r2.f16554a
            r1.setText(r2)
            goto L_0x0324
        L_0x031b:
            android.widget.TextView r1 = r7.f12795d
            com.bytedance.android.livesdk.message.model.bf r2 = r8.f16553b
            java.lang.String r2 = r2.f16554a
            r1.setText(r2)
        L_0x0324:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0334
            android.view.View r1 = r7.contentView
            com.bytedance.android.livesdk.chatroom.viewmodule.eh r2 = new com.bytedance.android.livesdk.chatroom.viewmodule.eh
            r2.<init>(r7, r8, r0)
            r1.setOnClickListener(r2)
        L_0x0334:
            android.view.View r0 = r7.contentView
            r0.setVisibility(r10)
            com.bytedance.android.livesdk.message.model.bf r0 = r8.f16553b
            long r0 = r0.a()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            io.reactivex.Observable r0 = io.reactivex.Observable.timer(r0, r2)
            com.bytedance.android.live.core.rxutils.a r1 = r31.getAutoUnbindTransformer()
            io.reactivex.Observable r0 = r0.compose(r1)
            io.reactivex.Scheduler r1 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
            io.reactivex.Observable r0 = r0.observeOn(r1)
            com.bytedance.android.livesdk.chatroom.viewmodule.ei r1 = new com.bytedance.android.livesdk.chatroom.viewmodule.ei
            r1.<init>(r7, r8)
            com.bytedance.android.livesdk.chatroom.viewmodule.ej r2 = new com.bytedance.android.livesdk.chatroom.viewmodule.ej
            r2.<init>(r7)
            r0.subscribe(r1, r2)
            r7.f12794c = r9
            com.bytedance.android.livesdk.message.model.bf r0 = r8.f16553b
            java.lang.String r0 = r0.f16556c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x03a7
            org.json.JSONObject r15 = new org.json.JSONObject
            r15.<init>()
            java.lang.String r0 = "trace_id"
            com.bytedance.android.livesdk.message.model.bf r1 = r8.f16553b     // Catch:{ JSONException -> 0x03a7 }
            java.lang.String r1 = r1.f16556c     // Catch:{ JSONException -> 0x03a7 }
            r15.put(r0, r1)     // Catch:{ JSONException -> 0x03a7 }
            com.bytedance.android.livesdk.v.e r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()     // Catch:{ JSONException -> 0x03a7 }
            com.bytedance.android.livesdk.user.e r0 = r0.k()     // Catch:{ JSONException -> 0x03a7 }
            com.bytedance.android.live.base.model.user.i r0 = r0.a()     // Catch:{ JSONException -> 0x03a7 }
            android.content.Context r1 = r7.context     // Catch:{ JSONException -> 0x03a7 }
            com.bytedance.android.livesdk.j.f r8 = com.bytedance.android.livesdk.j.f.a((android.content.Context) r1)     // Catch:{ JSONException -> 0x03a7 }
            java.lang.String r9 = "show_roompush"
            java.lang.String r10 = ""
            if (r0 != 0) goto L_0x0398
            r0 = 0
        L_0x0396:
            r11 = r0
            goto L_0x039d
        L_0x0398:
            long r0 = r0.getId()     // Catch:{ JSONException -> 0x03a7 }
            goto L_0x0396
        L_0x039d:
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r7.f12796e     // Catch:{ JSONException -> 0x03a7 }
            long r13 = r0.getId()     // Catch:{ JSONException -> 0x03a7 }
            r8.a((java.lang.String) r9, (java.lang.String) r10, (long) r11, (long) r13, (org.json.JSONObject) r15)     // Catch:{ JSONException -> 0x03a7 }
            return
        L_0x03a7:
            return
        L_0x03a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.RoomPushWidget.a(com.bytedance.android.livesdk.message.model.be):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0494  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x04a2  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x04e5  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x04f9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0347  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r23, java.lang.String r24) {
        /*
            r22 = this;
            r8 = r22
            r0 = r23
            r9 = r24
            r10 = 2
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r11 = 0
            r1[r11] = r0
            r12 = 1
            r1[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r3 = f12792a
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r11] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r12] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 7463(0x1d27, float:1.0458E-41)
            r2 = r22
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0045
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r1[r11] = r0
            r1[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r3 = f12792a
            r4 = 0
            r5 = 7463(0x1d27, float:1.0458E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r11] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r12] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0045:
            r1 = -1
            int r2 = r23.hashCode()
            r3 = -2082923311(0xffffffff83d91cd1, float:-1.276073E-36)
            r4 = 7
            r5 = 6
            r6 = 5
            r7 = 4
            r13 = 3
            r14 = 8
            if (r2 == r3) goto L_0x00eb
            r3 = 1567(0x61f, float:2.196E-42)
            if (r2 == r3) goto L_0x00e0
            r3 = 855900630(0x330401d6, float:3.0735315E-8)
            if (r2 == r3) goto L_0x00d5
            r3 = 1619041129(0x60809b69, float:7.413693E19)
            if (r2 == r3) goto L_0x00cb
            switch(r2) {
                case 48: goto L_0x00c1;
                case 49: goto L_0x00b7;
                case 50: goto L_0x00ad;
                case 51: goto L_0x00a3;
                case 52: goto L_0x0099;
                case 53: goto L_0x008f;
                default: goto L_0x0067;
            }
        L_0x0067:
            switch(r2) {
                case 55: goto L_0x0084;
                case 56: goto L_0x0078;
                case 57: goto L_0x006c;
                default: goto L_0x006a;
            }
        L_0x006a:
            goto L_0x00f6
        L_0x006c:
            java.lang.String r2 = "9"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f6
            r0 = 11
            goto L_0x00f7
        L_0x0078:
            java.lang.String r2 = "8"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f6
            r0 = 8
            goto L_0x00f7
        L_0x0084:
            java.lang.String r2 = "7"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f6
            r0 = 6
            goto L_0x00f7
        L_0x008f:
            java.lang.String r2 = "5"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f6
            r0 = 5
            goto L_0x00f7
        L_0x0099:
            java.lang.String r2 = "4"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f6
            r0 = 4
            goto L_0x00f7
        L_0x00a3:
            java.lang.String r2 = "3"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f6
            r0 = 3
            goto L_0x00f7
        L_0x00ad:
            java.lang.String r2 = "2"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f6
            r0 = 2
            goto L_0x00f7
        L_0x00b7:
            java.lang.String r2 = "1"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f6
            r0 = 1
            goto L_0x00f7
        L_0x00c1:
            java.lang.String r2 = "0"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f6
            r0 = 0
            goto L_0x00f7
        L_0x00cb:
            java.lang.String r2 = "cmd_pk_mvp_show_list"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f6
            r0 = 7
            goto L_0x00f7
        L_0x00d5:
            java.lang.String r2 = "cmd_show_gift_task_info"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f6
            r0 = 9
            goto L_0x00f7
        L_0x00e0:
            java.lang.String r2 = "10"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f6
            r0 = 12
            goto L_0x00f7
        L_0x00eb:
            java.lang.String r2 = "cmd_show_steal_tower_info"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00f6
            r0 = 10
            goto L_0x00f7
        L_0x00f6:
            r0 = -1
        L_0x00f7:
            r1 = 4607722850755301868(0x3ff1eb851eb851ec, double:1.12)
            r3 = 2131564104(0x7f0d1648, float:1.8753684E38)
            switch(r0) {
                case 0: goto L_0x04f9;
                case 1: goto L_0x04e5;
                case 2: goto L_0x04cc;
                case 3: goto L_0x04bf;
                case 4: goto L_0x04a2;
                case 5: goto L_0x0494;
                case 6: goto L_0x0347;
                case 7: goto L_0x0338;
                case 8: goto L_0x0240;
                case 9: goto L_0x0231;
                case 10: goto L_0x0222;
                case 11: goto L_0x0208;
                case 12: goto L_0x0104;
                default: goto L_0x0102;
            }
        L_0x0102:
            goto L_0x04fa
        L_0x0104:
            com.bytedance.android.livesdk.v.e r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r0 = r0.k()
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x01ce
            com.bytedance.android.livesdk.v.e r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r0 = r0.k()
            com.bytedance.android.livesdk.user.h r3 = com.bytedance.android.livesdk.user.h.TURNTABLE
            boolean r0 = r0.a((com.bytedance.android.livesdk.user.h) r3)
            if (r0 == 0) goto L_0x0123
            return
        L_0x0123:
            android.content.Context r0 = r8.context
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            boolean r3 = com.bytedance.android.livesdkapi.a.a.f18614b
            if (r3 == 0) goto L_0x016a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            com.bytedance.android.live.core.setting.l<java.lang.String> r4 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_TURNTABLE_URL
            r3.append(r4)
            java.lang.String r4 = "&room_id="
            r3.append(r4)
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r8.f12796e
            long r4 = r4.getId()
            r3.append(r4)
            java.lang.String r4 = "&language="
            r3.append(r4)
            android.content.Context r4 = r8.context
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            java.util.Locale r4 = r4.locale
            java.lang.String r4 = r4.getLanguage()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x0167:
            r16 = r3
            goto L_0x018d
        L_0x016a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            com.bytedance.android.live.core.setting.l<java.lang.String> r4 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_TURNTABLE_URL
            java.lang.Object r4 = r4.a()
            java.lang.String r4 = (java.lang.String) r4
            r3.append(r4)
            java.lang.String r4 = "&room_id="
            r3.append(r4)
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r8.f12796e
            long r4 = r4.getId()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            goto L_0x0167
        L_0x018d:
            com.bytedance.android.livesdk.u.a r3 = com.bytedance.android.livesdk.u.a.a()
            com.bytedance.android.livesdk.chatroom.event.aa r4 = new com.bytedance.android.livesdk.chatroom.event.aa
            java.lang.String r17 = "banner"
            r18 = 80
            android.content.Context r5 = r8.context
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r5 = r5.widthPixels
            float r5 = (float) r5
            float r5 = r5 / r0
            int r5 = (int) r5
            android.content.Context r6 = r8.context
            android.content.res.Resources r6 = r6.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            int r6 = r6.widthPixels
            float r6 = (float) r6
            float r6 = r6 / r0
            double r6 = (double) r6
            java.lang.Double.isNaN(r6)
            double r6 = r6 * r1
            int r0 = (int) r6
            r21 = 0
            r15 = r4
            r19 = r5
            r20 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r3.a((java.lang.Object) r4)
            android.view.View r0 = r8.contentView
            r0.setVisibility(r14)
            return
        L_0x01ce:
            com.bytedance.android.livesdk.v.e r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r0 = r0.k()
            android.content.Context r1 = r8.context
            com.bytedance.android.livesdk.user.i$a r2 = com.bytedance.android.livesdk.user.i.a()
            java.lang.String r3 = com.bytedance.android.live.core.utils.ac.a((int) r3)
            com.bytedance.android.livesdk.user.i$a r2 = r2.a((java.lang.String) r3)
            java.lang.String r3 = "turntable"
            com.bytedance.android.livesdk.user.i$a r2 = r2.c(r3)
            com.bytedance.android.livesdk.user.i$a r2 = r2.a((int) r11)
            com.bytedance.android.livesdk.user.i r2 = r2.a()
            io.reactivex.Observable r0 = r0.a(r1, r2)
            com.bytedance.android.live.core.rxutils.a r1 = r22.getAutoUnbindTransformer()
            io.reactivex.Observable r0 = r0.compose(r1)
            com.bytedance.android.livesdk.user.g r1 = new com.bytedance.android.livesdk.user.g
            r1.<init>()
            r0.subscribe((io.reactivex.Observer<? super T>) r1)
            goto L_0x04fa
        L_0x0208:
            com.bytedance.android.livesdk.u.a r0 = com.bytedance.android.livesdk.u.a.a()
            com.bytedance.android.livesdk.chatroom.event.aa r9 = new com.bytedance.android.livesdk.chatroom.event.aa
            java.lang.String r2 = "https://hotsoon.snssdk.com/falcon/live_inroom/page/fans_intro/index.html?show_rule=true"
            java.lang.String r3 = ""
            r4 = 17
            r5 = 300(0x12c, float:4.2E-43)
            r6 = 360(0x168, float:5.04E-43)
            r7 = 12
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.a((java.lang.Object) r9)
            return
        L_0x0222:
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r0 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.a()
            java.lang.String r1 = "cmd_show_steal_tower_info"
            com.bytedance.android.livesdk.chatroom.model.g r2 = new com.bytedance.android.livesdk.chatroom.model.g
            r2.<init>()
            r0.lambda$put$1$DataCenter(r1, r2)
            return
        L_0x0231:
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r0 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.a()
            java.lang.String r1 = "cmd_show_gift_task_info"
            com.bytedance.android.livesdk.chatroom.model.g r2 = new com.bytedance.android.livesdk.chatroom.model.g
            r2.<init>()
            r0.lambda$put$1$DataCenter(r1, r2)
            return
        L_0x0240:
            com.bytedance.android.livesdk.v.e r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r0 = r0.k()
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x02ff
            com.bytedance.android.livesdk.v.e r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r0 = r0.k()
            com.bytedance.android.livesdk.user.h r3 = com.bytedance.android.livesdk.user.h.TURNTABLE
            boolean r0 = r0.a((com.bytedance.android.livesdk.user.h) r3)
            if (r0 == 0) goto L_0x025f
            return
        L_0x025f:
            android.content.Context r0 = r8.context
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            boolean r3 = com.bytedance.android.livesdkapi.a.a.f18614b
            if (r3 == 0) goto L_0x02a5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            com.bytedance.android.live.core.setting.l<java.lang.String> r4 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_TURNTABLE_URL
            r3.append(r4)
            java.lang.String r4 = "&room_id="
            r3.append(r4)
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r8.f12796e
            long r4 = r4.getId()
            r3.append(r4)
            java.lang.String r4 = "&language="
            r3.append(r4)
            android.content.Context r4 = r8.context
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            java.util.Locale r4 = r4.locale
            java.lang.String r4 = r4.getLanguage()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x02a3:
            r10 = r3
            goto L_0x02c8
        L_0x02a5:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            com.bytedance.android.live.core.setting.l<java.lang.String> r4 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_TURNTABLE_URL
            java.lang.Object r4 = r4.a()
            java.lang.String r4 = (java.lang.String) r4
            r3.append(r4)
            java.lang.String r4 = "&room_id="
            r3.append(r4)
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r8.f12796e
            long r4 = r4.getId()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            goto L_0x02a3
        L_0x02c8:
            com.bytedance.android.livesdk.u.a r3 = com.bytedance.android.livesdk.u.a.a()
            com.bytedance.android.livesdk.chatroom.event.aa r4 = new com.bytedance.android.livesdk.chatroom.event.aa
            java.lang.String r11 = "banner"
            r12 = 80
            android.content.Context r5 = r8.context
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r5 = r5.widthPixels
            float r5 = (float) r5
            float r5 = r5 / r0
            int r13 = (int) r5
            android.content.Context r5 = r8.context
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r5 = r5.widthPixels
            float r5 = (float) r5
            float r5 = r5 / r0
            double r5 = (double) r5
            java.lang.Double.isNaN(r5)
            double r5 = r5 * r1
            int r14 = (int) r5
            r15 = 0
            r9 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r3.a((java.lang.Object) r4)
            return
        L_0x02ff:
            com.bytedance.android.livesdk.v.e r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r0 = r0.k()
            android.content.Context r1 = r8.context
            com.bytedance.android.livesdk.user.i$a r2 = com.bytedance.android.livesdk.user.i.a()
            java.lang.String r3 = com.bytedance.android.live.core.utils.ac.a((int) r3)
            com.bytedance.android.livesdk.user.i$a r2 = r2.a((java.lang.String) r3)
            java.lang.String r3 = "turntable"
            com.bytedance.android.livesdk.user.i$a r2 = r2.c(r3)
            com.bytedance.android.livesdk.user.i$a r2 = r2.a((int) r11)
            com.bytedance.android.livesdk.user.i r2 = r2.a()
            io.reactivex.Observable r0 = r0.a(r1, r2)
            com.bytedance.android.live.core.rxutils.a r1 = r22.getAutoUnbindTransformer()
            io.reactivex.Observable r0 = r0.compose(r1)
            com.bytedance.android.livesdk.user.g r1 = new com.bytedance.android.livesdk.user.g
            r1.<init>()
            r0.subscribe((io.reactivex.Observer<? super T>) r1)
            return
        L_0x0338:
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r0 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.a()
            java.lang.String r1 = "cmd_pk_mvp_show_list"
            com.bytedance.android.livesdk.chatroom.model.g r2 = new com.bytedance.android.livesdk.chatroom.model.g
            r2.<init>()
            r0.lambda$put$1$DataCenter(r1, r2)
            return
        L_0x0347:
            boolean r0 = r8.h
            if (r0 != 0) goto L_0x03a5
            boolean r0 = android.text.TextUtils.isEmpty(r24)
            if (r0 != 0) goto L_0x03a5
            java.lang.String r0 = "gift_id"
            boolean r0 = r9.contains(r0)
            if (r0 == 0) goto L_0x03a5
            java.lang.String r0 = "count"
            boolean r0 = r9.contains(r0)
            if (r0 == 0) goto L_0x03a5
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x038c }
            r0.<init>(r9)     // Catch:{ JSONException -> 0x038c }
            java.lang.String r1 = "gift_id"
            long r1 = r0.getLong(r1)     // Catch:{ JSONException -> 0x038c }
            java.lang.String r3 = "count"
            int r0 = r0.getInt(r3)     // Catch:{ JSONException -> 0x038c }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x038b
            if (r0 <= 0) goto L_0x038b
            com.bytedance.android.livesdk.chatroom.event.f r3 = new com.bytedance.android.livesdk.chatroom.event.f     // Catch:{ JSONException -> 0x038c }
            r3.<init>(r1, r0)     // Catch:{ JSONException -> 0x038c }
            java.lang.String r0 = "fans_club_msg"
            r3.a(r0)     // Catch:{ JSONException -> 0x038c }
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r8.dataCenter     // Catch:{ JSONException -> 0x038c }
            java.lang.String r1 = "cmd_do_send_gift"
            r0.lambda$put$1$DataCenter(r1, r3)     // Catch:{ JSONException -> 0x038c }
        L_0x038b:
            return
        L_0x038c:
            r0 = move-exception
            java.lang.String r1 = "RoomPushWidget"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "fans club send enableGift error:"
            r2.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.bytedance.android.live.core.c.a.c(r1, r0)
            return
        L_0x03a5:
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r8.dataCenter
            java.lang.String r1 = "log_enter_live_source"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            com.bytedance.ies.sdk.widgets.DataCenter r1 = r8.dataCenter
            java.lang.String r2 = "data_is_portrait"
            java.lang.Object r1 = r1.get(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            com.bytedance.android.live.base.model.user.User r2 = r8.i
            if (r2 == 0) goto L_0x03ee
            com.bytedance.android.live.base.model.user.User r2 = r8.i
            com.bytedance.android.live.base.model.FansClubMember r2 = r2.getFansClub()
            if (r2 == 0) goto L_0x03ee
            com.bytedance.android.live.base.model.user.User r2 = r8.i
            com.bytedance.android.live.base.model.FansClubMember r2 = r2.getFansClub()
            com.bytedance.android.live.base.model.user.FansClubData r2 = r2.getData()
            if (r2 == 0) goto L_0x03ee
            com.bytedance.android.live.base.model.user.User r2 = r8.i
            com.bytedance.android.live.base.model.FansClubMember r2 = r2.getFansClub()
            com.bytedance.android.live.base.model.user.FansClubData r2 = r2.getData()
            long r2 = r2.anchorId
            com.bytedance.android.livesdkapi.depend.model.live.Room r9 = r8.f12796e
            long r15 = r9.getOwnerUserId()
            int r9 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r9 != 0) goto L_0x03ee
            java.lang.String r2 = "1"
            goto L_0x03f0
        L_0x03ee:
            java.lang.String r2 = "0"
        L_0x03f0:
            java.lang.String r3 = com.bytedance.android.livesdk.chatroom.widget.LiveRoomUserInfoWidget.f13404c
            java.util.Locale r9 = java.util.Locale.US
            java.lang.Object[] r14 = new java.lang.Object[r14]
            com.bytedance.android.livesdkapi.depend.model.live.Room r15 = r8.f12796e
            long r15 = r15.getId()
            java.lang.Long r15 = java.lang.Long.valueOf(r15)
            r14[r11] = r15
            com.bytedance.android.livesdkapi.depend.model.live.Room r11 = r8.f12796e
            com.bytedance.android.live.base.model.user.User r11 = r11.getOwner()
            long r15 = r11.getId()
            java.lang.Long r11 = java.lang.Long.valueOf(r15)
            r14[r12] = r11
            com.bytedance.android.livesdk.v.e r11 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r11 = r11.k()
            long r11 = r11.b()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r14[r10] = r11
            r14[r13] = r0
            java.lang.String r0 = ""
            r14[r7] = r0
            java.lang.String r0 = "bottom"
            r14[r6] = r0
            r14[r5] = r2
            com.bytedance.android.livesdk.v.e r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r0 = r0.k()
            com.bytedance.android.live.base.model.user.i r0 = r0.a()
            int r0 = com.bytedance.android.livesdk.wallet.b.b.a((com.bytedance.android.live.base.model.user.i) r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14[r4] = r0
            java.lang.String r16 = java.lang.String.format(r9, r3, r14)
            android.content.Context r0 = r8.context
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r2 = r0.widthPixels
            float r2 = (float) r2
            float r3 = r0.density
            float r2 = r2 / r3
            int r2 = (int) r2
            int r3 = r0.heightPixels
            float r3 = (float) r3
            float r0 = r0.density
            float r3 = r3 / r0
            int r0 = (int) r3
            if (r1 == 0) goto L_0x046b
            r0 = 440(0x1b8, float:6.17E-43)
            r19 = r2
            r20 = 440(0x1b8, float:6.17E-43)
            goto L_0x046f
        L_0x046b:
            r19 = r0
            r20 = r19
        L_0x046f:
            boolean r0 = android.text.TextUtils.isEmpty(r16)
            if (r0 != 0) goto L_0x0493
            com.bytedance.android.livesdk.chatroom.event.aa r0 = new com.bytedance.android.livesdk.chatroom.event.aa
            java.lang.String r17 = ""
            if (r1 == 0) goto L_0x0480
            r1 = 80
            r18 = 80
            goto L_0x0486
        L_0x0480:
            r1 = 8388613(0x800005, float:1.175495E-38)
            r18 = 8388613(0x800005, float:1.175495E-38)
        L_0x0486:
            r21 = 0
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21)
            com.bytedance.android.livesdk.u.a r1 = com.bytedance.android.livesdk.u.a.a()
            r1.a((java.lang.Object) r0)
        L_0x0493:
            return
        L_0x0494:
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r8.dataCenter
            java.lang.String r1 = "cmd_send_gift"
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r8.f12796e
            com.bytedance.android.live.base.model.user.User r2 = r2.getOwner()
            r0.lambda$put$1$DataCenter(r1, r2)
            return
        L_0x04a2:
            boolean r0 = r8.h
            if (r0 != 0) goto L_0x04fa
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r8.f12796e
            com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
            boolean r0 = r0.isFollowing()
            if (r0 != 0) goto L_0x04fa
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r8.dataCenter
            java.lang.String r1 = "cmd_wanna_follow_anchor"
            com.bytedance.android.livesdk.chatroom.event.ak r2 = new com.bytedance.android.livesdk.chatroom.event.ak
            r2.<init>()
            r0.lambda$put$1$DataCenter(r1, r2)
            return
        L_0x04bf:
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r8.dataCenter
            java.lang.String r1 = "cmd_wanna_share_live"
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r0.lambda$put$1$DataCenter(r1, r2)
            return
        L_0x04cc:
            com.bytedance.android.livesdk.u.a r0 = com.bytedance.android.livesdk.u.a.a()
            com.bytedance.android.livesdk.chatroom.event.am r1 = new com.bytedance.android.livesdk.chatroom.event.am
            r1.<init>()
            r0.a((java.lang.Object) r1)
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r8.dataCenter
            java.lang.String r1 = "cmd_wanna_send_message"
            com.bytedance.android.livesdk.chatroom.event.am r2 = new com.bytedance.android.livesdk.chatroom.event.am
            r2.<init>()
            r0.lambda$put$1$DataCenter(r1, r2)
            return
        L_0x04e5:
            boolean r0 = android.text.TextUtils.isEmpty(r24)
            if (r0 != 0) goto L_0x04fa
            com.bytedance.android.livesdk.v.f r0 = com.bytedance.android.livesdk.v.j.q()
            com.bytedance.android.livesdk.schema.a.a r0 = r0.m()
            android.content.Context r1 = r8.context
            r0.a((android.content.Context) r1, (java.lang.String) r9)
            return
        L_0x04f9:
            return
        L_0x04fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.RoomPushWidget.a(java.lang.String, java.lang.String):void");
    }
}

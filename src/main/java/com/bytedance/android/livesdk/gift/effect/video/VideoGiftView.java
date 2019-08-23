package com.bytedance.android.livesdk.gift.effect.video;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.e;
import com.bytedance.android.livesdk.gift.effect.b.a;
import com.bytedance.android.livesdk.j.c;
import com.bytedance.android.livesdk.message.model.bk;
import com.bytedance.android.livesdk.widget.GiftUserInfoView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;
import java.util.Map;

public class VideoGiftView extends FrameLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14964a;

    /* renamed from: b  reason: collision with root package name */
    public GiftUserInfoView f14965b;

    /* renamed from: c  reason: collision with root package name */
    public RelativeLayout f14966c;

    /* renamed from: d  reason: collision with root package name */
    public View f14967d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f14968e;

    /* renamed from: f  reason: collision with root package name */
    public ImageView f14969f;
    public a g;
    public bk.a h;
    public com.bytedance.android.livesdkapi.depend.d.a.a i;
    private e j;
    private float k;
    private float l;
    private boolean m;
    private Map<String, Object> n = new HashMap();

    private int getResourceLayout() {
        return C0906R.layout.aoi;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f14964a, false, 9623, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14964a, false, 9623, new Class[0], Void.TYPE);
            return;
        }
        this.f14965b.setVisibility(4);
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f14964a, false, 9625, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14964a, false, 9625, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        if (PatchProxy.isSupport(new Object[0], this, f14964a, false, 9626, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14964a, false, 9626, new Class[0], Void.TYPE);
            return;
        }
        if (this.i != null) {
            this.i.b();
            this.i.d();
            this.i.e();
            this.i.b(this.f14966c);
        }
    }

    public void setPortrait(boolean z) {
        this.m = z;
    }

    public void setUserEventListener(e eVar) {
        this.j = eVar;
    }

    public VideoGiftView(@NonNull Context context) {
        super(context);
        a(context);
    }

    private void setTextEffect(bk bkVar) {
        bk.a aVar;
        if (bkVar != null) {
            if (this.m) {
                aVar = bkVar.f16579a;
            } else {
                aVar = bkVar.f16580b;
            }
            this.h = aVar;
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f14964a, false, 9627, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f14964a, false, 9627, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.a(this.f14965b.getUserId());
        }
    }

    private void a(a aVar) {
        String str;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f14964a, false, 9616, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f14964a, false, 9616, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.n.put("effect_id", Long.valueOf(aVar.f14780b));
        this.n.put("gift_id", Long.valueOf(aVar.j));
        this.n.put("msg_id", Long.valueOf(aVar.f14779a));
        Map<String, Object> map = this.n;
        if (aVar.g != null) {
            str = String.valueOf(aVar.g.getId());
        } else {
            str = "";
        }
        map.put("from_user_id", str);
        c.b().a("ttlive_gift", this.n);
    }

    private void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f14964a, false, 9613, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f14964a, false, 9613, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.k = getResources().getDimension(C0906R.dimen.r6);
        this.l = getResources().getDimension(C0906R.dimen.r5);
        LayoutInflater.from(context).inflate(getResourceLayout(), this);
        this.f14965b = (GiftUserInfoView) findViewById(C0906R.id.dqk);
        this.f14966c = (RelativeLayout) findViewById(C0906R.id.dt9);
        this.f14967d = findViewById(C0906R.id.d0r);
        this.f14969f = (ImageView) findViewById(C0906R.id.d0s);
        this.f14968e = (TextView) findViewById(C0906R.id.d0t);
        this.f14967d.setVisibility(8);
        this.f14965b.setOnClickListener(this);
        this.n.put("desc", "播放大礼物动画");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setUserInfo(com.bytedance.android.livesdk.gift.effect.b.a r13) {
        /*
            r12 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f14964a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.bytedance.android.livesdk.gift.effect.b.a> r1 = com.bytedance.android.livesdk.gift.effect.b.a.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 9618(0x2592, float:1.3478E-41)
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f14964a
            r3 = 0
            r4 = 9618(0x2592, float:1.3478E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.bytedance.android.livesdk.gift.effect.b.a> r1 = com.bytedance.android.livesdk.gift.effect.b.a.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            if (r13 == 0) goto L_0x00de
            com.bytedance.android.live.base.model.user.User r0 = r13.g
            if (r0 != 0) goto L_0x0038
            goto L_0x00de
        L_0x0038:
            com.bytedance.android.live.base.model.user.User r9 = r13.g
            com.bytedance.android.livesdk.widget.GiftUserInfoView r0 = r12.f14965b
            long r1 = r9.getId()
            r0.setUserId(r1)
            com.bytedance.android.live.base.model.ImageModel r0 = r9.getAvatarThumb()
            if (r0 == 0) goto L_0x0052
            com.bytedance.android.livesdk.widget.GiftUserInfoView r0 = r12.f14965b
            com.bytedance.android.live.base.model.ImageModel r1 = r9.getAvatarThumb()
            r0.setAvatarImage(r1)
        L_0x0052:
            com.bytedance.android.livesdk.widget.GiftUserInfoView r0 = r12.f14965b
            com.bytedance.android.live.base.model.user.d r1 = r9.getBorder()
            r10 = 0
            if (r1 == 0) goto L_0x0062
            com.bytedance.android.live.base.model.user.d r1 = r9.getBorder()
            com.bytedance.android.live.base.model.ImageModel r1 = r1.f7750b
            goto L_0x0063
        L_0x0062:
            r1 = r10
        L_0x0063:
            r0.setAvatarBorder(r1)
            com.bytedance.android.live.base.model.user.m r0 = r9.getUserHonor()
            if (r0 == 0) goto L_0x0083
            com.bytedance.android.live.base.model.user.m r0 = r9.getUserHonor()
            com.bytedance.android.live.base.model.ImageModel r0 = r0.k()
            if (r0 == 0) goto L_0x0083
            com.bytedance.android.livesdk.widget.GiftUserInfoView r0 = r12.f14965b
            com.bytedance.android.live.base.model.user.m r1 = r9.getUserHonor()
            com.bytedance.android.live.base.model.ImageModel r1 = r1.k()
            r0.setHonorImage(r1)
        L_0x0083:
            com.bytedance.android.livesdk.widget.GiftUserInfoView r11 = r12.f14965b
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f14964a
            r3 = 0
            r4 = 9628(0x259c, float:1.3492E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.bytedance.android.live.base.model.user.User> r1 = com.bytedance.android.live.base.model.user.User.class
            r5[r8] = r1
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00b7
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f14964a
            r3 = 0
            r4 = 9628(0x259c, float:1.3492E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.bytedance.android.live.base.model.user.User> r1 = com.bytedance.android.live.base.model.user.User.class
            r5[r8] = r1
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r1 = r12
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x00c7
        L_0x00b7:
            if (r9 != 0) goto L_0x00ba
            goto L_0x00c7
        L_0x00ba:
            boolean r0 = com.bytedance.android.live.uikit.a.a.h()
            if (r0 == 0) goto L_0x00c3
            java.lang.String r10 = r9.displayId
            goto L_0x00c7
        L_0x00c3:
            java.lang.String r10 = r9.getNickName()
        L_0x00c7:
            r11.setUserNameText(r10)
            android.text.Spannable r0 = r13.n
            if (r0 == 0) goto L_0x00d6
            com.bytedance.android.livesdk.widget.GiftUserInfoView r0 = r12.f14965b
            android.text.Spannable r1 = r13.n
            r0.setSpannable(r1)
            return
        L_0x00d6:
            com.bytedance.android.livesdk.widget.GiftUserInfoView r0 = r12.f14965b
            java.lang.String r1 = r13.h
            r0.setDescriptionText(r1)
            return
        L_0x00de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.effect.video.VideoGiftView.setUserInfo(com.bytedance.android.livesdk.gift.effect.b.a):void");
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f14964a, false, 9617, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f14964a, false, 9617, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f14965b.getLayoutParams();
            layoutParams.topMargin = (int) this.l;
            this.f14965b.setLayoutParams(layoutParams);
        } else {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f14965b.getLayoutParams();
            layoutParams2.topMargin = (int) this.k;
            this.f14965b.setLayoutParams(layoutParams2);
        }
    }

    public VideoGiftView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public final void a(a aVar, User user) {
        if (PatchProxy.isSupport(new Object[]{aVar, user}, this, f14964a, false, 9615, new Class[]{a.class, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, user}, this, f14964a, false, 9615, new Class[]{a.class, User.class}, Void.TYPE);
        } else if (this.i != null && aVar != null) {
            this.g = aVar;
            setUserInfo(aVar);
            setTextEffect(aVar.i);
            a(aVar);
            this.i.a(aVar.f14782d);
        }
    }

    public VideoGiftView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context);
    }
}

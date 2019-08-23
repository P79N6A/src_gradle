package com.bytedance.android.livesdk.rank.viewbinder;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.rank.model.b;
import com.bytedance.android.livesdk.user.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import me.drakeet.multitype.c;

public class RankItemViewBinder extends c<b, RankItemViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17052a;

    /* renamed from: b  reason: collision with root package name */
    public e f17053b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f17054c;

    /* renamed from: d  reason: collision with root package name */
    public int f17055d;

    /* renamed from: e  reason: collision with root package name */
    public Fragment f17056e;
    private int g;

    class RankItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17057a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f17058b;

        /* renamed from: c  reason: collision with root package name */
        TextView f17059c;

        /* renamed from: d  reason: collision with root package name */
        ImageView f17060d;

        /* renamed from: e  reason: collision with root package name */
        HSImageView f17061e;

        /* renamed from: f  reason: collision with root package name */
        View f17062f;
        ImageView g;
        TextView h;
        TextView i;

        public RankItemViewHolder(View view) {
            super(view);
            this.f17058b = (ImageView) view.findViewById(C0906R.id.c_h);
            this.f17059c = (TextView) view.findViewById(C0906R.id.c_l);
            this.f17060d = (ImageView) view.findViewById(C0906R.id.dp2);
            this.f17061e = (HSImageView) view.findViewById(C0906R.id.ays);
            this.f17062f = view.findViewById(C0906R.id.agq);
            this.g = (ImageView) view.findViewById(C0906R.id.aog);
            this.h = (TextView) view.findViewById(C0906R.id.dq2);
            this.i = (TextView) view.findViewById(C0906R.id.d2q);
        }
    }

    @NonNull
    public final /* synthetic */ RecyclerView.ViewHolder a(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2}, this, f17052a, false, 13095, new Class[]{LayoutInflater.class, ViewGroup.class}, RankItemViewHolder.class)) {
            return (RankItemViewHolder) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2}, this, f17052a, false, 13095, new Class[]{LayoutInflater.class, ViewGroup.class}, RankItemViewHolder.class);
        }
        return new RankItemViewHolder(layoutInflater2.inflate(C0906R.layout.ak6, viewGroup2, false));
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x03c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(@android.support.annotation.NonNull android.support.v7.widget.RecyclerView.ViewHolder r24, @android.support.annotation.NonNull java.lang.Object r25) {
        /*
            r23 = this;
            r7 = r24
            com.bytedance.android.livesdk.rank.viewbinder.RankItemViewBinder$RankItemViewHolder r7 = (com.bytedance.android.livesdk.rank.viewbinder.RankItemViewBinder.RankItemViewHolder) r7
            r8 = r25
            com.bytedance.android.livesdk.rank.model.b r8 = (com.bytedance.android.livesdk.rank.model.b) r8
            r9 = 2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r7
            r11 = 1
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f17052a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.rank.viewbinder.RankItemViewBinder$RankItemViewHolder> r1 = com.bytedance.android.livesdk.rank.viewbinder.RankItemViewBinder.RankItemViewHolder.class
            r5[r10] = r1
            java.lang.Class<com.bytedance.android.livesdk.rank.model.b> r1 = com.bytedance.android.livesdk.rank.model.b.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 13096(0x3328, float:1.8351E-41)
            r1 = r23
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0049
            java.lang.Object[] r12 = new java.lang.Object[r9]
            r12[r10] = r7
            r12[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r14 = f17052a
            r15 = 0
            r16 = 13096(0x3328, float:1.8351E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.rank.viewbinder.RankItemViewBinder$RankItemViewHolder> r1 = com.bytedance.android.livesdk.rank.viewbinder.RankItemViewBinder.RankItemViewHolder.class
            r0[r10] = r1
            java.lang.Class<com.bytedance.android.livesdk.rank.model.b> r1 = com.bytedance.android.livesdk.rank.model.b.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r23
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0049:
            int r0 = r8.f17027d
            r12 = r23
            int r1 = r12.g
            if (r0 > r1) goto L_0x0053
            r13 = 1
            goto L_0x0054
        L_0x0053:
            r13 = 0
        L_0x0054:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            java.lang.Byte r1 = java.lang.Byte.valueOf(r13)
            r0[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = com.bytedance.android.livesdk.rank.viewbinder.RankItemViewBinder.RankItemViewHolder.f17057a
            r3 = 0
            r4 = 13097(0x3329, float:1.8353E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.rank.model.b> r1 = com.bytedance.android.livesdk.rank.model.b.class
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r7
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0096
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            java.lang.Byte r1 = java.lang.Byte.valueOf(r13)
            r0[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = com.bytedance.android.livesdk.rank.viewbinder.RankItemViewBinder.RankItemViewHolder.f17057a
            r3 = 0
            r4 = 13097(0x3329, float:1.8353E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.bytedance.android.livesdk.rank.model.b> r1 = com.bytedance.android.livesdk.rank.model.b.class
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r7
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0096:
            if (r8 == 0) goto L_0x0445
            int r0 = r8.f17027d
            com.bytedance.android.livesdk.rank.viewbinder.RankItemViewBinder r1 = com.bytedance.android.livesdk.rank.viewbinder.RankItemViewBinder.this
            android.support.v4.app.Fragment r1 = r1.f17056e
            android.view.View r2 = r7.itemView
            r3 = 3
            java.lang.Object[] r14 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r14[r10] = r4
            r14[r11] = r1
            r14[r9] = r2
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = com.bytedance.android.livesdk.rank.i.f17004a
            r17 = 1
            r18 = 12973(0x32ad, float:1.8179E-41)
            java.lang.Class[] r4 = new java.lang.Class[r3]
            java.lang.Class r5 = java.lang.Integer.TYPE
            r4[r10] = r5
            java.lang.Class<android.support.v4.app.Fragment> r5 = android.support.v4.app.Fragment.class
            r4[r11] = r5
            java.lang.Class<android.view.View> r5 = android.view.View.class
            r4[r9] = r5
            java.lang.Class r20 = java.lang.Void.TYPE
            r19 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
            r14 = 0
            if (r4 == 0) goto L_0x00fb
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4[r10] = r0
            r4[r11] = r1
            r4[r9] = r2
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = com.bytedance.android.livesdk.rank.i.f17004a
            r19 = 1
            r20 = 12973(0x32ad, float:1.8179E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class<android.support.v4.app.Fragment> r1 = android.support.v4.app.Fragment.class
            r0[r11] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r0[r9] = r1
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r4
            r21 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0227
        L_0x00fb:
            if (r0 != r11) goto L_0x0227
            boolean r0 = com.bytedance.android.live.uikit.a.a.c()
            if (r0 == 0) goto L_0x0227
            if (r1 == 0) goto L_0x0227
            if (r2 == 0) goto L_0x0227
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r1
            r0[r11] = r2
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = com.bytedance.android.livesdk.rank.i.f17004a
            r19 = 1
            r20 = 12975(0x32af, float:1.8182E-41)
            java.lang.Class[] r4 = new java.lang.Class[r9]
            java.lang.Class<android.support.v4.app.Fragment> r5 = android.support.v4.app.Fragment.class
            r4[r10] = r5
            java.lang.Class<android.view.View> r5 = android.view.View.class
            r4[r11] = r5
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r0
            r21 = r4
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
            if (r0 == 0) goto L_0x014d
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r1
            r0[r11] = r2
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = com.bytedance.android.livesdk.rank.i.f17004a
            r19 = 1
            r20 = 12975(0x32af, float:1.8182E-41)
            java.lang.Class[] r4 = new java.lang.Class[r9]
            java.lang.Class<android.support.v4.app.Fragment> r5 = android.support.v4.app.Fragment.class
            r4[r10] = r5
            java.lang.Class<android.view.View> r5 = android.view.View.class
            r4[r11] = r5
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r0
            r21 = r4
            com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0167
        L_0x014d:
            long r4 = com.bytedance.android.livesdk.rank.i.f17006c
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0167
            int r0 = com.bytedance.android.livesdk.rank.i.f17005b
            int r4 = r1.hashCode()
            if (r0 != r4) goto L_0x0167
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            com.bytedance.android.livesdk.rank.i$1 r4 = new com.bytedance.android.livesdk.rank.i$1
            r4.<init>(r2)
            r0.addOnPreDrawListener(r4)
        L_0x0167:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r1
            r0[r11] = r2
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = com.bytedance.android.livesdk.rank.i.f17004a
            r19 = 1
            r20 = 12979(0x32b3, float:1.8187E-41)
            java.lang.Class[] r4 = new java.lang.Class[r9]
            java.lang.Class<android.support.v4.app.Fragment> r5 = android.support.v4.app.Fragment.class
            r4[r10] = r5
            java.lang.Class<android.view.View> r5 = android.view.View.class
            r4[r11] = r5
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r0
            r21 = r4
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
            if (r0 == 0) goto L_0x01ad
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r1
            r0[r11] = r2
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = com.bytedance.android.livesdk.rank.i.f17004a
            r19 = 1
            r20 = 12979(0x32b3, float:1.8187E-41)
            java.lang.Class[] r4 = new java.lang.Class[r9]
            java.lang.Class<android.support.v4.app.Fragment> r5 = android.support.v4.app.Fragment.class
            r4[r10] = r5
            java.lang.Class<android.view.View> r5 = android.view.View.class
            r4[r11] = r5
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r0
            r21 = r4
            com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x01c7
        L_0x01ad:
            long r4 = com.bytedance.android.livesdk.rank.i.f17008e
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x01c7
            int r0 = com.bytedance.android.livesdk.rank.i.f17007d
            int r4 = r1.hashCode()
            if (r0 != r4) goto L_0x01c7
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            com.bytedance.android.livesdk.rank.i$3 r4 = new com.bytedance.android.livesdk.rank.i$3
            r4.<init>(r2)
            r0.addOnPreDrawListener(r4)
        L_0x01c7:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r1
            r0[r11] = r2
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = com.bytedance.android.livesdk.rank.i.f17004a
            r19 = 1
            r20 = 12977(0x32b1, float:1.8185E-41)
            java.lang.Class[] r4 = new java.lang.Class[r9]
            java.lang.Class<android.support.v4.app.Fragment> r5 = android.support.v4.app.Fragment.class
            r4[r10] = r5
            java.lang.Class<android.view.View> r5 = android.view.View.class
            r4[r11] = r5
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r0
            r21 = r4
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
            if (r0 == 0) goto L_0x020d
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r1
            r0[r11] = r2
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = com.bytedance.android.livesdk.rank.i.f17004a
            r19 = 1
            r20 = 12977(0x32b1, float:1.8185E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<android.support.v4.app.Fragment> r2 = android.support.v4.app.Fragment.class
            r1[r10] = r2
            java.lang.Class<android.view.View> r2 = android.view.View.class
            r1[r11] = r2
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r0
            r21 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0227
        L_0x020d:
            long r4 = com.bytedance.android.livesdk.rank.i.g
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0227
            int r0 = com.bytedance.android.livesdk.rank.i.f17009f
            int r1 = r1.hashCode()
            if (r0 != r1) goto L_0x0227
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            com.bytedance.android.livesdk.rank.i$2 r1 = new com.bytedance.android.livesdk.rank.i$2
            r1.<init>(r2)
            r0.addOnPreDrawListener(r1)
        L_0x0227:
            int r0 = r8.f17027d
            r6 = 8
            if (r0 > 0) goto L_0x0240
            android.widget.ImageView r0 = r7.f17058b
            r0.setVisibility(r10)
            android.widget.ImageView r0 = r7.f17058b
            int r1 = r8.f17027d
            int r1 = r1 + r3
            r0.setImageLevel(r1)
            android.widget.TextView r0 = r7.f17059c
            r0.setVisibility(r6)
            goto L_0x0284
        L_0x0240:
            long r0 = r8.f17026c
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 > 0) goto L_0x0258
            android.widget.ImageView r0 = r7.f17058b
            r0.setVisibility(r6)
            android.widget.TextView r0 = r7.f17059c
            r0.setVisibility(r10)
            android.widget.TextView r0 = r7.f17059c
            java.lang.String r1 = "-"
            r0.setText(r1)
            goto L_0x0284
        L_0x0258:
            int r0 = r8.f17027d
            if (r0 > r3) goto L_0x026f
            android.widget.ImageView r0 = r7.f17058b
            r0.setVisibility(r10)
            android.widget.ImageView r0 = r7.f17058b
            int r1 = r8.f17027d
            int r1 = r1 + r3
            r0.setImageLevel(r1)
            android.widget.TextView r0 = r7.f17059c
            r0.setVisibility(r6)
            goto L_0x0284
        L_0x026f:
            android.widget.ImageView r0 = r7.f17058b
            r0.setVisibility(r6)
            android.widget.TextView r0 = r7.f17059c
            r0.setVisibility(r10)
            android.widget.TextView r0 = r7.f17059c
            int r1 = r8.f17027d
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.setText(r1)
        L_0x0284:
            int r0 = r8.f17027d
            if (r0 >= 0) goto L_0x028c
            r0 = 2131624646(0x7f0e02c6, float:1.8876478E38)
            goto L_0x028f
        L_0x028c:
            r0 = 2131625201(0x7f0e04f1, float:1.8877603E38)
        L_0x028f:
            android.view.View r1 = r7.itemView
            android.view.View r2 = r7.itemView
            android.content.res.Resources r2 = r2.getResources()
            int r0 = r2.getColor(r0)
            r1.setBackgroundColor(r0)
            android.widget.ImageView r0 = r7.f17060d
            com.bytedance.android.live.base.model.user.User r1 = r8.f17025b
            com.bytedance.android.live.base.model.ImageModel r1 = r1.getAvatarThumb()
            android.widget.ImageView r2 = r7.f17060d
            int r2 = r2.getWidth()
            android.widget.ImageView r3 = r7.f17060d
            int r3 = r3.getHeight()
            r4 = 2130841141(0x7f020e35, float:1.728734E38)
            com.bytedance.android.livesdk.chatroom.f.b.b(r0, r1, r2, r3, r4)
            com.bytedance.android.live.base.model.user.User r0 = r8.f17025b
            com.bytedance.android.live.base.model.user.d r0 = r0.getBorder()
            if (r0 == 0) goto L_0x02d3
            com.bytedance.android.live.core.widget.HSImageView r0 = r7.f17061e
            r0.setVisibility(r10)
            com.bytedance.android.live.core.widget.HSImageView r0 = r7.f17061e
            com.bytedance.android.live.base.model.user.User r1 = r8.f17025b
            com.bytedance.android.live.base.model.user.d r1 = r1.getBorder()
            com.bytedance.android.live.base.model.ImageModel r1 = r1.f7750b
            com.bytedance.android.livesdk.chatroom.f.b.a((com.bytedance.android.live.core.widget.HSImageView) r0, (com.bytedance.android.live.base.model.ImageModel) r1)
            goto L_0x02d8
        L_0x02d3:
            com.bytedance.android.live.core.widget.HSImageView r0 = r7.f17061e
            r0.setVisibility(r6)
        L_0x02d8:
            com.bytedance.android.live.base.model.user.User r5 = r8.f17025b
            if (r5 == 0) goto L_0x0380
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r13)
            r0[r10] = r1
            r0[r11] = r5
            com.meituan.robust.ChangeQuickRedirect r2 = com.bytedance.android.livesdk.rank.viewbinder.RankItemViewBinder.RankItemViewHolder.f17057a
            r3 = 0
            r4 = 13100(0x332c, float:1.8357E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r1[r10] = r16
            java.lang.Class<com.bytedance.android.live.base.model.user.User> r16 = com.bytedance.android.live.base.model.user.User.class
            r1[r11] = r16
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r17 = r1
            r1 = r7
            r14 = r5
            r5 = r17
            r15 = 8
            r6 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x032e
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r13)
            r0[r10] = r1
            r0[r11] = r14
            com.meituan.robust.ChangeQuickRedirect r2 = com.bytedance.android.livesdk.rank.viewbinder.RankItemViewBinder.RankItemViewHolder.f17057a
            r3 = 0
            r4 = 13100(0x332c, float:1.8357E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r10] = r1
            java.lang.Class<com.bytedance.android.live.base.model.user.User> r1 = com.bytedance.android.live.base.model.user.User.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r7
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x036e
        L_0x032e:
            boolean r0 = com.bytedance.android.live.uikit.a.a.d()
            if (r0 != 0) goto L_0x033a
            boolean r0 = com.bytedance.android.live.uikit.a.a.g()
            if (r0 == 0) goto L_0x036d
        L_0x033a:
            if (r13 == 0) goto L_0x036d
            com.bytedance.android.livesdk.v.e r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r0 = r0.k()
            boolean r0 = r0.c()
            if (r0 != 0) goto L_0x034c
        L_0x034a:
            r0 = 1
            goto L_0x036e
        L_0x034c:
            com.bytedance.android.livesdk.v.e r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r0 = r0.k()
            long r0 = r0.b()
            long r2 = r14.getId()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x036d
            com.bytedance.android.live.base.model.user.g r0 = r14.getFollowInfo()
            long r0 = r0.f7764d
            r2 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x036d
            goto L_0x034a
        L_0x036d:
            r0 = 0
        L_0x036e:
            if (r0 == 0) goto L_0x0383
            android.view.View r0 = r7.f17062f
            r0.setVisibility(r10)
            android.view.View r0 = r7.f17062f
            com.bytedance.android.livesdk.rank.viewbinder.c r1 = new com.bytedance.android.livesdk.rank.viewbinder.c
            r1.<init>(r14)
            r0.setOnClickListener(r1)
            goto L_0x0388
        L_0x0380:
            r14 = r5
            r15 = 8
        L_0x0383:
            android.view.View r0 = r7.f17062f
            r0.setVisibility(r15)
        L_0x0388:
            r0 = 0
            if (r14 == 0) goto L_0x0399
            com.bytedance.android.live.base.model.user.m r1 = r14.getUserHonor()
            if (r1 == 0) goto L_0x0399
            com.bytedance.android.live.base.model.user.m r0 = r14.getUserHonor()
            com.bytedance.android.live.base.model.ImageModel r0 = r0.j()
        L_0x0399:
            if (r0 == 0) goto L_0x03b5
            java.util.List r1 = r0.getUrls()
            boolean r1 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x03b5
            android.widget.ImageView r1 = r7.g
            com.bytedance.android.livesdk.rank.viewbinder.RankItemViewBinder$RankItemViewHolder$1 r2 = new com.bytedance.android.livesdk.rank.viewbinder.RankItemViewBinder$RankItemViewHolder$1
            r2.<init>()
            com.bytedance.android.livesdk.chatroom.f.b.a((android.widget.ImageView) r1, (com.bytedance.android.live.base.model.ImageModel) r0, (com.bytedance.android.live.core.utils.q.a) r2)
            android.widget.ImageView r0 = r7.g
            r0.setVisibility(r10)
            goto L_0x03ba
        L_0x03b5:
            android.widget.ImageView r0 = r7.g
            r0.setVisibility(r15)
        L_0x03ba:
            android.widget.TextView r0 = r7.h
            if (r14 == 0) goto L_0x03c3
            java.lang.String r1 = r14.getNickName()
            goto L_0x03c5
        L_0x03c3:
            java.lang.String r1 = ""
        L_0x03c5:
            r0.setText(r1)
            android.widget.TextView r0 = r7.h
            android.view.View r1 = r7.itemView
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131625467(0x7f0e05fb, float:1.8878143E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            android.widget.TextView r0 = r7.i
            java.lang.String r1 = r8.f17028e
            r0.setText(r1)
            android.view.View r0 = r7.itemView
            com.bytedance.android.livesdk.rank.viewbinder.d r1 = new com.bytedance.android.livesdk.rank.viewbinder.d
            r1.<init>(r7, r8)
            r0.setOnClickListener(r1)
            com.bytedance.android.live.base.model.user.User r8 = r8.f17025b
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = com.bytedance.android.livesdk.rank.viewbinder.RankItemViewBinder.RankItemViewHolder.f17057a
            r3 = 0
            r4 = 13098(0x332a, float:1.8354E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<com.bytedance.android.live.base.model.user.User> r1 = com.bytedance.android.live.base.model.user.User.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r7
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x041b
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = com.bytedance.android.livesdk.rank.viewbinder.RankItemViewBinder.RankItemViewHolder.f17057a
            r3 = 0
            r4 = 13098(0x332a, float:1.8354E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<com.bytedance.android.live.base.model.user.User> r1 = com.bytedance.android.live.base.model.user.User.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r7
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x041b:
            com.bytedance.android.livesdk.rank.viewbinder.RankItemViewBinder r0 = com.bytedance.android.livesdk.rank.viewbinder.RankItemViewBinder.this
            com.bytedance.android.livesdk.user.e r0 = r0.f17053b
            long r1 = r8.getId()
            io.reactivex.Observable r0 = r0.d(r1)
            com.bytedance.android.livesdk.rank.viewbinder.RankItemViewBinder r1 = com.bytedance.android.livesdk.rank.viewbinder.RankItemViewBinder.this
            android.support.v4.app.Fragment r1 = r1.f17056e
            io.reactivex.ObservableTransformer r1 = com.bytedance.android.live.core.rxutils.i.a(r1)
            io.reactivex.Observable r0 = r0.compose(r1)
            io.reactivex.Scheduler r1 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
            io.reactivex.Observable r0 = r0.observeOn(r1)
            com.bytedance.android.livesdk.rank.viewbinder.e r1 = new com.bytedance.android.livesdk.rank.viewbinder.e
            r1.<init>(r7, r8)
            io.reactivex.functions.Consumer r2 = com.bytedance.android.livesdk.rank.viewbinder.f.f17082b
            r0.subscribe(r1, r2)
        L_0x0445:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.rank.viewbinder.RankItemViewBinder.a(android.support.v7.widget.RecyclerView$ViewHolder, java.lang.Object):void");
    }

    public RankItemViewBinder(e eVar, boolean z, int i, Fragment fragment, int i2) {
        this.f17053b = eVar;
        this.f17054c = z;
        this.g = i;
        this.f17056e = fragment;
        this.f17055d = i2;
    }
}

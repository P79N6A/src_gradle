package com.ss.android.ugc.aweme.im.sdk.relations.adapter;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.im.sdk.relations.adapter.AbsRelationListAdapter;
import com.ss.android.ugc.aweme.im.service.model.IMContact;

public class RelationIndexSelectListAdapter extends IndexerListAdapter {
    public static ChangeQuickRedirect q;

    public class RelationSelectViewHolder extends AbsRelationListAdapter.ViewHolder {
        public static ChangeQuickRedirect h;
        public AvatarImageView i;
        private TextView k;
        private TextView l;
        private TextView m;
        private TextView n;
        private ImageView o;
        private ImageView p;
        private ImageView q;
        private View r;
        private LinearLayout s;

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, h, false, 52853, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, h, false, 52853, new Class[0], Void.TYPE);
                return;
            }
            super.b();
            this.r = this.itemView.findViewById(C0906R.id.bbl);
            this.s = (LinearLayout) this.itemView.findViewById(C0906R.id.d3v);
            this.l = (TextView) this.itemView.findViewById(C0906R.id.d41);
            this.q = (ImageView) this.itemView.findViewById(C0906R.id.au2);
            this.n = (TextView) this.itemView.findViewById(C0906R.id.au4);
            this.f52057d = (ImageView) this.itemView.findViewById(C0906R.id.sc);
            this.i = (AvatarImageView) this.itemView.findViewById(C0906R.id.i4);
            this.p = (ImageView) this.itemView.findViewById(C0906R.id.dr5);
            this.k = (TextView) this.itemView.findViewById(C0906R.id.bps);
            this.m = (TextView) this.itemView.findViewById(C0906R.id.a49);
            this.o = (ImageView) this.itemView.findViewById(C0906R.id.agx);
        }

        public RelationSelectViewHolder(View view) {
            super(view);
        }

        /* JADX WARNING: Removed duplicated region for block: B:90:0x0292  */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x02b7  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x02ce  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(com.ss.android.ugc.aweme.im.service.model.IMContact r15, int r16) {
            /*
                r14 = this;
                r7 = r14
                r8 = r15
                r9 = r16
                r10 = 2
                java.lang.Object[] r0 = new java.lang.Object[r10]
                r11 = 0
                r0[r11] = r8
                java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
                r12 = 1
                r0[r12] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = h
                java.lang.Class[] r5 = new java.lang.Class[r10]
                java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMContact> r1 = com.ss.android.ugc.aweme.im.service.model.IMContact.class
                r5[r11] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r12] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 52854(0xce76, float:7.4064E-41)
                r1 = r14
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x004b
                java.lang.Object[] r0 = new java.lang.Object[r10]
                r0[r11] = r8
                java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
                r0[r12] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = h
                r3 = 0
                r4 = 52854(0xce76, float:7.4064E-41)
                java.lang.Class[] r5 = new java.lang.Class[r10]
                java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMContact> r1 = com.ss.android.ugc.aweme.im.service.model.IMContact.class
                r5[r11] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r12] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r14
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x004b:
                int r0 = r15.getType()
                r1 = -1
                if (r0 != r1) goto L_0x0053
                return
            L_0x0053:
                java.lang.Object[] r0 = new java.lang.Object[r12]
                r0[r11] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = h
                r3 = 0
                r4 = 52855(0xce77, float:7.4066E-41)
                java.lang.Class[] r5 = new java.lang.Class[r12]
                java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMContact> r1 = com.ss.android.ugc.aweme.im.service.model.IMContact.class
                r5[r11] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r14
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0084
                java.lang.Object[] r0 = new java.lang.Object[r12]
                r0[r11] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = h
                r3 = 0
                r4 = 52855(0xce77, float:7.4066E-41)
                java.lang.Class[] r5 = new java.lang.Class[r12]
                java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMContact> r1 = com.ss.android.ugc.aweme.im.service.model.IMContact.class
                r5[r11] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r14
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                goto L_0x011f
            L_0x0084:
                android.widget.ImageView r0 = r7.f52057d
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter r1 = com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter.this
                boolean r1 = r1.f52051f
                r2 = 16
                if (r1 == 0) goto L_0x00e2
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter r1 = com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter.this
                java.util.LinkedHashSet r1 = r1.h
                boolean r1 = r1.contains(r15)
                if (r1 == 0) goto L_0x00a4
                android.widget.ImageView r1 = r7.f52057d
                r1.setSelected(r12)
                goto L_0x00a9
            L_0x00a4:
                android.widget.ImageView r1 = r7.f52057d
                r1.setSelected(r11)
            L_0x00a9:
                int r1 = android.os.Build.VERSION.SDK_INT
                if (r1 <= r2) goto L_0x00cb
                int r1 = r0.getMarginStart()
                int r2 = r7.f52058e
                if (r1 == r2) goto L_0x011f
                int r1 = r7.f52058e
                r0.setMarginStart(r1)
                int r1 = r7.f52058e
                int r2 = r0.topMargin
                int r3 = r0.rightMargin
                int r4 = r0.bottomMargin
                r0.setMargins(r1, r2, r3, r4)
                android.widget.ImageView r1 = r7.f52057d
                r1.setLayoutParams(r0)
                goto L_0x011f
            L_0x00cb:
                int r1 = r0.leftMargin
                int r2 = r7.f52058e
                if (r1 == r2) goto L_0x011f
                int r1 = r7.f52058e
                int r2 = r0.topMargin
                int r3 = r0.rightMargin
                int r4 = r0.bottomMargin
                r0.setMargins(r1, r2, r3, r4)
                android.widget.ImageView r1 = r7.f52057d
                r1.setLayoutParams(r0)
                goto L_0x011f
            L_0x00e2:
                android.widget.ImageView r1 = r7.f52057d
                r1.setSelected(r11)
                int r1 = android.os.Build.VERSION.SDK_INT
                if (r1 <= r2) goto L_0x0109
                int r1 = r0.getMarginStart()
                int r2 = r7.f52059f
                if (r1 == r2) goto L_0x011f
                int r1 = r7.f52059f
                r0.setMarginStart(r1)
                int r1 = r7.f52059f
                int r2 = r0.topMargin
                int r3 = r0.rightMargin
                int r4 = r0.bottomMargin
                r0.setMargins(r1, r2, r3, r4)
                android.widget.ImageView r1 = r7.f52057d
                r1.setLayoutParams(r0)
                goto L_0x011f
            L_0x0109:
                int r1 = r0.leftMargin
                int r2 = r7.f52059f
                if (r1 == r2) goto L_0x011f
                int r1 = r7.f52059f
                int r2 = r0.topMargin
                int r3 = r0.rightMargin
                int r4 = r0.bottomMargin
                r0.setMargins(r1, r2, r3, r4)
                android.widget.ImageView r1 = r7.f52057d
                r1.setLayoutParams(r0)
            L_0x011f:
                java.lang.Object[] r0 = new java.lang.Object[r10]
                r0[r11] = r8
                java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
                r0[r12] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = h
                r3 = 0
                r4 = 52856(0xce78, float:7.4067E-41)
                java.lang.Class[] r5 = new java.lang.Class[r10]
                java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMContact> r1 = com.ss.android.ugc.aweme.im.service.model.IMContact.class
                r5[r11] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r12] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r14
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0164
                java.lang.Object[] r0 = new java.lang.Object[r10]
                r0[r11] = r8
                java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
                r0[r12] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = h
                r3 = 0
                r4 = 52856(0xce78, float:7.4067E-41)
                java.lang.Class[] r5 = new java.lang.Class[r10]
                java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMContact> r1 = com.ss.android.ugc.aweme.im.service.model.IMContact.class
                r5[r11] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r12] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r14
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                goto L_0x0340
            L_0x0164:
                com.ss.android.ugc.aweme.base.model.UrlModel r0 = r15.getDisplayAvatar()
                if (r0 == 0) goto L_0x0181
                java.util.List r1 = r0.getUrlList()
                if (r1 == 0) goto L_0x0181
                java.util.List r1 = r0.getUrlList()
                int r1 = r1.size()
                if (r1 != 0) goto L_0x017b
                goto L_0x0181
            L_0x017b:
                com.ss.android.ugc.aweme.base.ui.AvatarImageView r1 = r7.i
                com.ss.android.ugc.aweme.base.c.b(r1, r0)
                goto L_0x0189
            L_0x0181:
                com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r7.i
                r1 = 2130839027(0x7f0205f3, float:1.7283053E38)
                com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (int) r1)
            L_0x0189:
                android.widget.ImageView r0 = r7.q
                r13 = 8
                r0.setVisibility(r13)
                int r0 = r15.getType()
                if (r0 == r12) goto L_0x026d
                int r0 = r15.getType()
                if (r0 != r10) goto L_0x019e
                goto L_0x026d
            L_0x019e:
                int r0 = r15.getType()
                r1 = 6
                r2 = 5
                if (r0 == r1) goto L_0x0218
                int r0 = r15.getType()
                if (r0 != r2) goto L_0x01ad
                goto L_0x0218
            L_0x01ad:
                int r0 = r15.getType()
                r1 = 3
                if (r0 == 0) goto L_0x01ba
                int r0 = r15.getType()
                if (r0 != r1) goto L_0x0290
            L_0x01ba:
                int r0 = r15.getType()
                if (r0 != r1) goto L_0x01e5
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter r0 = com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter.this
                java.lang.String r0 = r0.g
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x01e5
                android.widget.LinearLayout r0 = r7.s
                r0.setVisibility(r11)
                android.widget.TextView r0 = r7.l
                r1 = 2131560619(0x7f0d08ab, float:1.8746615E38)
                r0.setText(r1)
                if (r9 != 0) goto L_0x01df
                android.view.View r0 = r7.r
                r0.setVisibility(r13)
                goto L_0x01ef
            L_0x01df:
                android.view.View r0 = r7.r
                r0.setVisibility(r11)
                goto L_0x01ef
            L_0x01e5:
                android.widget.LinearLayout r0 = r7.s
                r0.setVisibility(r13)
                android.view.View r0 = r7.r
                r0.setVisibility(r13)
            L_0x01ef:
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter r0 = com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter.this
                int r0 = r0.f52048c
                if (r0 == r12) goto L_0x028b
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter r0 = com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter.this
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.IndexerListAdapter$a r0 = r0.c(r9)
                java.lang.String r1 = r0.f52074d
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L_0x0211
                android.widget.TextView r1 = r7.n
                r1.setVisibility(r11)
                android.widget.TextView r1 = r7.n
                java.lang.String r0 = r0.f52074d
                r1.setText(r0)
                goto L_0x0290
            L_0x0211:
                android.widget.TextView r0 = r7.n
                r0.setVisibility(r13)
                goto L_0x0290
            L_0x0218:
                int r0 = r15.getType()
                if (r0 != r2) goto L_0x023e
                android.widget.LinearLayout r0 = r7.s
                r0.setVisibility(r11)
                android.widget.TextView r0 = r7.l
                r1 = 2131560620(0x7f0d08ac, float:1.8746617E38)
                r0.setText(r1)
                android.widget.ImageView r0 = r7.q
                r0.setVisibility(r11)
                if (r9 != 0) goto L_0x0238
                android.view.View r0 = r7.r
                r0.setVisibility(r13)
                goto L_0x0248
            L_0x0238:
                android.view.View r0 = r7.r
                r0.setVisibility(r11)
                goto L_0x0248
            L_0x023e:
                android.widget.LinearLayout r0 = r7.s
                r0.setVisibility(r13)
                android.view.View r0 = r7.r
                r0.setVisibility(r13)
            L_0x0248:
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter r0 = com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter.this
                boolean r0 = r0.f52049d
                if (r0 == 0) goto L_0x0267
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter r0 = com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter.this
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.IndexerListAdapter$a r0 = r0.c(r9)
                java.lang.String r0 = r0.f52074d
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 != 0) goto L_0x0267
                android.widget.TextView r1 = r7.n
                r1.setVisibility(r11)
                android.widget.TextView r1 = r7.n
                r1.setText(r0)
                goto L_0x0290
            L_0x0267:
                android.widget.TextView r0 = r7.n
                r0.setVisibility(r13)
                goto L_0x0290
            L_0x026d:
                int r0 = r15.getType()
                if (r0 != r10) goto L_0x0281
                android.widget.TextView r0 = r7.l
                r1 = 2131560660(0x7f0d08d4, float:1.8746699E38)
                r0.setText(r1)
                android.widget.LinearLayout r0 = r7.s
                r0.setVisibility(r11)
                goto L_0x0286
            L_0x0281:
                android.widget.LinearLayout r0 = r7.s
                r0.setVisibility(r13)
            L_0x0286:
                android.view.View r0 = r7.r
                r0.setVisibility(r13)
            L_0x028b:
                android.widget.TextView r0 = r7.n
                r0.setVisibility(r13)
            L_0x0290:
                if (r9 != 0) goto L_0x029e
                android.widget.TextView r0 = r7.l
                java.lang.String r1 = ""
                r0.setText(r1)
                android.widget.ImageView r0 = r7.q
                r0.setVisibility(r13)
            L_0x029e:
                java.lang.Object[] r0 = new java.lang.Object[r12]
                r0[r11] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = h
                r3 = 0
                r4 = 52857(0xce79, float:7.4068E-41)
                java.lang.Class[] r5 = new java.lang.Class[r12]
                java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMContact> r1 = com.ss.android.ugc.aweme.im.service.model.IMContact.class
                r5[r11] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r14
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x02ce
                java.lang.Object[] r0 = new java.lang.Object[r12]
                r0[r11] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = h
                r3 = 0
                r4 = 52857(0xce79, float:7.4068E-41)
                java.lang.Class[] r5 = new java.lang.Class[r12]
                java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMContact> r1 = com.ss.android.ugc.aweme.im.service.model.IMContact.class
                r5[r11] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r14
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                goto L_0x0340
            L_0x02ce:
                com.ss.android.ugc.aweme.im.service.model.IMUser r0 = com.ss.android.ugc.aweme.im.sdk.d.e.a((com.ss.android.ugc.aweme.im.service.model.IMContact) r15)
                android.widget.ImageView r1 = r7.p
                com.ss.android.ugc.aweme.im.sdk.utils.ax.a((android.widget.ImageView) r1, (com.ss.android.ugc.aweme.im.service.model.IMUser) r0)
                if (r0 == 0) goto L_0x0313
                com.ss.android.ugc.aweme.base.ui.AvatarImageView r1 = r7.i
                com.ss.android.ugc.aweme.im.sdk.utils.a.a((android.widget.ImageView) r1, (com.ss.android.ugc.aweme.im.service.model.IMUser) r0)
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter r1 = com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter.this
                android.widget.TextView r2 = r7.k
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter r3 = com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter.this
                java.lang.String r3 = r3.g
                r1.a(r2, r0, r3)
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter r1 = com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter.this
                android.widget.TextView r2 = r7.m
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter r3 = com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter.this
                java.lang.String r3 = r3.g
                r1.b(r2, r0, r3)
                int r1 = r0.getFollowStatus()
                if (r1 != r10) goto L_0x0300
                android.widget.ImageView r1 = r7.o
                r1.setVisibility(r11)
                goto L_0x0305
            L_0x0300:
                android.widget.ImageView r1 = r7.o
                r1.setVisibility(r13)
            L_0x0305:
                com.ss.android.ugc.aweme.im.sdk.utils.z r1 = com.ss.android.ugc.aweme.im.sdk.utils.z.a()
                java.lang.String r0 = r0.getUid()
                java.lang.String r2 = "contact"
                r1.g(r0, r2)
                goto L_0x0340
            L_0x0313:
                android.widget.TextView r0 = r7.m
                r0.setVisibility(r13)
                android.widget.ImageView r0 = r7.o
                r0.setVisibility(r13)
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter r0 = com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter.this
                java.lang.String r0 = r0.g
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x0331
                android.widget.TextView r0 = r7.k
                java.lang.String r1 = r15.getDisplayName()
                r0.setText(r1)
                goto L_0x0340
            L_0x0331:
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter r0 = com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter.this
                android.widget.TextView r1 = r7.k
                java.lang.String r2 = r15.getDisplayName()
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter r3 = com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter.this
                java.lang.String r3 = r3.g
                r0.a(r1, r2, r3, r11)
            L_0x0340:
                java.lang.Object[] r0 = new java.lang.Object[r11]
                com.meituan.robust.ChangeQuickRedirect r2 = h
                r3 = 0
                r4 = 52858(0xce7a, float:7.407E-41)
                java.lang.Class[] r5 = new java.lang.Class[r11]
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r14
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0364
                java.lang.Object[] r0 = new java.lang.Object[r11]
                com.meituan.robust.ChangeQuickRedirect r2 = h
                r3 = 0
                r4 = 52858(0xce7a, float:7.407E-41)
                java.lang.Class[] r5 = new java.lang.Class[r11]
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r14
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                goto L_0x037e
            L_0x0364:
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter r0 = com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter.this
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.AbsRelationListAdapter$a r0 = r0.m
                if (r0 == 0) goto L_0x037e
                android.view.View r0 = r7.itemView
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter$RelationSelectViewHolder$1 r1 = new com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter$RelationSelectViewHolder$1
                r1.<init>()
                r0.setOnClickListener(r1)
                com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r7.i
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter$RelationSelectViewHolder$2 r1 = new com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter$RelationSelectViewHolder$2
                r1.<init>()
                r0.setOnClickListener(r1)
            L_0x037e:
                android.view.View r0 = r7.itemView
                r1 = 50331648(0x3000000, float:3.761582E-37)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
                r0.setTag(r1, r2)
                android.view.View r0 = r7.itemView
                r2 = 83886080(0x5000000, float:6.018531E-36)
                r0.setTag(r2, r15)
                com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r7.i
                r3 = 50331649(0x3000001, float:3.7615824E-37)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.setTag(r1, r3)
                com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r7.i
                r0.setTag(r2, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter.RelationSelectViewHolder.a(com.ss.android.ugc.aweme.im.service.model.IMContact, int):void");
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, q, false, 52852, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, q, false, 52852, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        int c2 = i - c();
        if (c2 >= 0 && c2 < this.f52050e.size()) {
            IMContact iMContact = (IMContact) this.f52050e.get(c2);
            for (int i2 = 0; i2 < this.f52050e.size(); i2++) {
                if (iMContact.equals(this.f52050e.get(i2))) {
                    notifyItemChanged(c() + i2);
                }
            }
        }
    }

    @NonNull
    /* renamed from: a */
    public final AbsRelationListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, q, false, 52851, new Class[]{ViewGroup.class, Integer.TYPE}, AbsRelationListAdapter.ViewHolder.class)) {
            return (AbsRelationListAdapter.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, q, false, 52851, new Class[]{ViewGroup.class, Integer.TYPE}, AbsRelationListAdapter.ViewHolder.class);
        } else if (i == 1 && this.i != null) {
            return super.onCreateViewHolder(viewGroup, i);
        } else {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            if (i == 0) {
                i2 = C0906R.layout.y4;
            } else {
                i2 = C0906R.layout.y5;
            }
            return new RelationSelectViewHolder(from.inflate(i2, viewGroup, false));
        }
    }
}

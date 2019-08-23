package com.ss.android.ugc.aweme.main.story.feed;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.Keep;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.mvvm.a;
import com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.main.story.feed.b;

@Keep
public class StoryFeedItemView implements a<b> {
    private static final int FOLLOWING_BORDER_NEW_COLOR = 2131624987;
    private static final int FOLLOWING_BORDER_READ_COLOR = 2131625034;
    private static final int INVALID_COLORS = 2131624102;
    private static final int LIVE_BORDER_COLOR = 2131624993;
    private static final int VALID_COLORS = 2131624104;
    public static ChangeQuickRedirect changeQuickRedirect;
    private com.ss.android.ugc.aweme.base.d.a mAvatarDrawable;
    private View mFlBorderContainer;
    private ImageView mImgFollowingPlay;
    private boolean mIsBig;
    protected AvatarWithBorderView mIvAvatar;
    protected DmtTextView mIvLive;
    private View mLayout;
    private b.a mStatusInView;
    private TextView mTvName;
    private View mView;
    private b mViewModel;

    private void initListeners() {
    }

    public int getItemLayout() {
        return C0906R.layout.asx;
    }

    public View getAndroidView() {
        return this.mView;
    }

    public b getViewModel() {
        return this.mViewModel;
    }

    public Context getContext() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 58204, new Class[0], Context.class)) {
            return getAndroidView().getContext();
        }
        return (Context) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 58204, new Class[0], Context.class);
    }

    public Rect getIvAvatarRect() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 58205, new Class[0], Rect.class)) {
            return v.b((View) this.mIvAvatar);
        }
        return (Rect) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 58205, new Class[0], Rect.class);
    }

    public void refresh() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 58200, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 58200, new Class[0], Void.TYPE);
            return;
        }
        if (this.mViewModel != null) {
            bind(this.mViewModel);
        }
    }

    private void initReferences() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 58203, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 58203, new Class[0], Void.TYPE);
            return;
        }
        this.mLayout = this.mView.findViewById(C0906R.id.axx);
        this.mFlBorderContainer = this.mView.findViewById(C0906R.id.af8);
        this.mIvAvatar = (AvatarWithBorderView) this.mView.findViewById(C0906R.id.ayr);
        this.mTvName = (TextView) this.mView.findViewById(C0906R.id.df7);
        this.mIvLive = (DmtTextView) this.mView.findViewById(C0906R.id.b2p);
        this.mImgFollowingPlay = (ImageView) this.mView.findViewById(C0906R.id.ask);
    }

    public void initViews() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 58202, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 58202, new Class[0], Void.TYPE);
            return;
        }
        this.mAvatarDrawable = new com.ss.android.ugc.aweme.base.d.a();
        com.ss.android.ugc.aweme.base.d.a aVar = this.mAvatarDrawable;
        int a2 = u.a(1.5d);
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(a2)}, aVar, com.ss.android.ugc.aweme.base.d.a.f34725a, false, 24651, new Class[]{Integer.TYPE}, Void.TYPE)) {
            com.ss.android.ugc.aweme.base.d.a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(a2)}, aVar2, com.ss.android.ugc.aweme.base.d.a.f34725a, false, 24651, new Class[]{Integer.TYPE}, Void.TYPE);
        } else {
            aVar.f34727c = a2;
            aVar.f34726b.setStrokeWidth((float) aVar.f34727c);
        }
        View view = this.mFlBorderContainer;
        if (PatchProxy.isSupport(new Object[]{view}, null, com.ss.android.ugc.aweme.base.d.a.f34725a, true, 24653, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, null, com.ss.android.ugc.aweme.base.d.a.f34725a, true, 24653, new Class[]{View.class}, Void.TYPE);
            return;
        }
        view.setLayerType(1, null);
        view.setDrawingCacheEnabled(false);
    }

    public StoryFeedItemView(Context context) {
    }

    public void setIsBig(boolean z) {
        this.mIsBig = z;
    }

    private boolean isFollowingVideo(b.a aVar) {
        if (aVar == b.a.FOLLOWING_NEW || aVar == b.a.FOLLOWING_READ) {
            return true;
        }
        return false;
    }

    private boolean isRead(b.a aVar) {
        if (aVar == b.a.READ || aVar == b.a.FOLLOWING_READ) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bind(com.ss.android.ugc.aweme.main.story.feed.b r26) {
        /*
            r25 = this;
            r7 = r25
            r8 = r26
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.main.story.feed.b> r1 = com.ss.android.ugc.aweme.main.story.feed.b.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 58199(0xe357, float:8.1554E-41)
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            r3 = 0
            r4 = 58199(0xe357, float:8.1554E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.main.story.feed.b> r1 = com.ss.android.ugc.aweme.main.story.feed.b.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            com.ss.android.ugc.aweme.main.story.feed.b r0 = r7.mViewModel
            r1 = 3
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r10] = r7
            r11[r9] = r0
            r2 = 2
            r11[r2] = r8
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.base.utils.g.f35021a
            r14 = 1
            r15 = 25200(0x6270, float:3.5313E-41)
            java.lang.Class[] r3 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.base.mvvm.a> r4 = com.ss.android.ugc.aweme.base.mvvm.a.class
            r3[r10] = r4
            java.lang.Class<com.ss.android.ugc.aweme.base.mvvm.e> r4 = com.ss.android.ugc.aweme.base.mvvm.e.class
            r3[r9] = r4
            java.lang.Class<com.ss.android.ugc.aweme.base.mvvm.e> r4 = com.ss.android.ugc.aweme.base.mvvm.e.class
            r3[r2] = r4
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            r4 = 0
            if (r3 == 0) goto L_0x0087
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r10] = r7
            r11[r9] = r0
            r11[r2] = r8
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.base.utils.g.f35021a
            r14 = 1
            r15 = 25200(0x6270, float:3.5313E-41)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.base.mvvm.a> r1 = com.ss.android.ugc.aweme.base.mvvm.a.class
            r0[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.base.mvvm.e> r1 = com.ss.android.ugc.aweme.base.mvvm.e.class
            r0[r9] = r1
            java.lang.Class<com.ss.android.ugc.aweme.base.mvvm.e> r1 = com.ss.android.ugc.aweme.base.mvvm.e.class
            r0[r2] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x00d6
        L_0x0087:
            if (r0 == 0) goto L_0x00d6
            if (r0 == r8) goto L_0x00d6
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r10] = r0
            r1[r9] = r7
            r19 = 0
            com.meituan.robust.ChangeQuickRedirect r20 = com.ss.android.ugc.aweme.base.utils.g.f35021a
            r21 = 1
            r22 = 25201(0x6271, float:3.5314E-41)
            java.lang.Class[] r3 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.base.mvvm.e> r5 = com.ss.android.ugc.aweme.base.mvvm.e.class
            r3[r10] = r5
            java.lang.Class<com.ss.android.ugc.aweme.base.mvvm.a> r5 = com.ss.android.ugc.aweme.base.mvvm.a.class
            r3[r9] = r5
            java.lang.Class r24 = java.lang.Void.TYPE
            r18 = r1
            r23 = r3
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r18, r19, r20, r21, r22, r23, r24)
            if (r1 == 0) goto L_0x00cd
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r11[r10] = r0
            r11[r9] = r7
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.base.utils.g.f35021a
            r14 = 1
            r15 = 25201(0x6271, float:3.5314E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.base.mvvm.e> r1 = com.ss.android.ugc.aweme.base.mvvm.e.class
            r0[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.base.mvvm.a> r1 = com.ss.android.ugc.aweme.base.mvvm.a.class
            r0[r9] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x00d6
        L_0x00cd:
            com.ss.android.ugc.aweme.base.mvvm.c r1 = r0.a()
            if (r1 != r7) goto L_0x00d6
            r0.a(r4)
        L_0x00d6:
            r7.mViewModel = r8
            com.ss.android.ugc.aweme.main.story.feed.b r0 = r7.mViewModel
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x00f7
            com.ss.android.ugc.aweme.story.b r0 = com.ss.android.ugc.aweme.story.b.a()
            com.ss.android.ugc.aweme.main.story.feed.b r1 = r7.mViewModel
            java.lang.String r1 = r1.f()
            boolean r0 = r0.b(r1)
            if (r0 == 0) goto L_0x00f7
            com.ss.android.ugc.aweme.main.story.feed.b r0 = r7.mViewModel
            com.ss.android.ugc.aweme.main.story.feed.b$a r1 = com.ss.android.ugc.aweme.main.story.feed.b.a.FOLLOWING_READ
            r0.a((com.ss.android.ugc.aweme.main.story.feed.b.a) r1)
        L_0x00f7:
            com.ss.android.ugc.aweme.main.story.feed.b r0 = r7.mViewModel
            boolean r1 = r7.mIsBig
            r0.f54935f = r1
            r8.a(r7)
            com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView r0 = r7.mIvAvatar
            r0.setBackgroundDrawable(r4)
            com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView r0 = r7.mIvAvatar
            com.ss.android.ugc.aweme.base.model.a r1 = r8.h
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (com.ss.android.ugc.aweme.base.model.a) r1)
            android.widget.TextView r0 = r7.mTvName
            java.lang.CharSequence r1 = r8.i
            com.ss.android.ugc.aweme.base.utils.v.a((android.widget.TextView) r0, (java.lang.CharSequence) r1)
            boolean r0 = com.ss.android.g.a.a()
            if (r0 != 0) goto L_0x0127
            android.view.View r0 = r7.mLayout
            java.lang.CharSequence r1 = r8.i
            r0.setContentDescription(r1)
            com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView r0 = r7.mIvAvatar
            java.lang.CharSequence r1 = r8.i
            r0.setContentDescription(r1)
        L_0x0127:
            com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView r0 = r7.mIvAvatar
            android.view.View$OnClickListener r1 = r8.j
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r11[r10] = r0
            r11[r9] = r1
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.base.utils.v.f35054a
            r14 = 1
            r15 = 25318(0x62e6, float:3.5478E-41)
            java.lang.Class[] r3 = new java.lang.Class[r2]
            java.lang.Class<android.view.View> r4 = android.view.View.class
            r3[r10] = r4
            java.lang.Class<android.view.View$OnClickListener> r4 = android.view.View.OnClickListener.class
            r3[r9] = r4
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r3 == 0) goto L_0x0169
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r11[r10] = r0
            r11[r9] = r1
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.base.utils.v.f35054a
            r14 = 1
            r15 = 25318(0x62e6, float:3.5478E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r0[r10] = r1
            java.lang.Class<android.view.View$OnClickListener> r1 = android.view.View.OnClickListener.class
            r0[r9] = r1
            java.lang.Class r17 = java.lang.Void.TYPE
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x016e
        L_0x0169:
            if (r0 == 0) goto L_0x016e
            r0.setOnClickListener(r1)
        L_0x016e:
            com.ss.android.ugc.aweme.main.story.feed.b$a r0 = r8.l
            com.ss.android.ugc.aweme.main.story.feed.b$a r1 = com.ss.android.ugc.aweme.main.story.feed.b.a.LIVE
            if (r0 != r1) goto L_0x01ae
            com.ss.android.ugc.aweme.main.story.a.a r1 = r8.k
            com.ss.android.ugc.aweme.story.model.a r1 = r1.a()
            com.ss.android.ugc.aweme.story.model.Story r1 = r1.f73233b
            com.ss.android.ugc.aweme.profile.model.User r3 = r1.getUserInfo()
            int r3 = r3.getFollowStatus()
            if (r3 != 0) goto L_0x01a6
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r7.mIvLive
            java.lang.String r4 = r1.skyLightDisplayTag
            boolean r4 = com.ss.android.ugc.aweme.base.utils.q.a(r4)
            if (r4 == 0) goto L_0x01a0
            android.content.Context r1 = r25.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r4 = 2131562024(0x7f0d0e28, float:1.8749465E38)
            java.lang.String r1 = r1.getString(r4)
            goto L_0x01a2
        L_0x01a0:
            java.lang.String r1 = r1.skyLightDisplayTag
        L_0x01a2:
            r3.setText(r1)
            goto L_0x01ae
        L_0x01a6:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.mIvLive
            r3 = 2131561001(0x7f0d0a29, float:1.874739E38)
            r1.setText(r3)
        L_0x01ae:
            com.ss.android.ugc.aweme.main.story.feed.b$a r1 = r7.mStatusInView
            if (r1 == r0) goto L_0x02ef
            com.ss.android.ugc.aweme.main.story.feed.b$a r1 = r7.mStatusInView
            r7.mStatusInView = r0
            android.widget.ImageView r3 = r7.mImgFollowingPlay
            boolean r4 = r7.isFollowingVideo(r0)
            r5 = 8
            if (r4 == 0) goto L_0x01c2
            r4 = 0
            goto L_0x01c4
        L_0x01c2:
            r4 = 8
        L_0x01c4:
            com.ss.android.ugc.aweme.base.utils.v.a((android.view.View) r3, (int) r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r7.mIvLive
            com.ss.android.ugc.aweme.main.story.feed.b$a r4 = com.ss.android.ugc.aweme.main.story.feed.b.a.LIVE
            if (r0 != r4) goto L_0x01ce
            r5 = 0
        L_0x01ce:
            com.ss.android.ugc.aweme.base.utils.v.a((android.view.View) r3, (int) r5)
            int[] r3 = com.ss.android.ugc.aweme.main.story.feed.StoryFeedItemView.AnonymousClass1.f54920a
            int r4 = r0.ordinal()
            r3 = r3[r4]
            switch(r3) {
                case 1: goto L_0x02c4;
                case 2: goto L_0x02bc;
                case 3: goto L_0x02b4;
                case 4: goto L_0x02ac;
                case 5: goto L_0x01e7;
                case 6: goto L_0x01de;
                default: goto L_0x01dc;
            }
        L_0x01dc:
            goto L_0x02cb
        L_0x01de:
            com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView r2 = r7.mIvAvatar
            int r3 = VALID_COLORS
            r2.setBorderColor(r3)
            goto L_0x02cb
        L_0x01e7:
            com.ss.android.ugc.aweme.base.d.a r3 = r7.mAvatarDrawable
            boolean r4 = r7.isFollowingVideo(r1)
            if (r4 == 0) goto L_0x01f2
            int r4 = FOLLOWING_BORDER_NEW_COLOR
            goto L_0x01f4
        L_0x01f2:
            int r4 = VALID_COLORS
        L_0x01f4:
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r11[r10] = r5
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.base.d.a.f34725a
            r14 = 0
            r15 = 24649(0x6049, float:3.454E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Integer.TYPE
            r5[r10] = r6
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r3
            r16 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r5 == 0) goto L_0x022e
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r11[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.base.d.a.f34725a
            r14 = 0
            r15 = 24649(0x6049, float:3.454E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r2[r10] = r4
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r3
            r16 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0273
        L_0x022e:
            int[] r2 = new int[r2]
            r2[r10] = r4
            r2[r9] = r4
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.base.d.a.f34725a
            r14 = 0
            r15 = 24650(0x604a, float:3.4542E-41)
            java.lang.Class[] r4 = new java.lang.Class[r9]
            java.lang.Class<int[]> r5 = int[].class
            r4[r10] = r5
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r3
            r16 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r4 == 0) goto L_0x0266
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.base.d.a.f34725a
            r14 = 0
            r15 = 24650(0x604a, float:3.4542E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<int[]> r4 = int[].class
            r2[r10] = r4
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r3
            r16 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0273
        L_0x0266:
            int[] r4 = r3.f34729e
            boolean r4 = java.util.Arrays.equals(r2, r4)
            if (r4 != 0) goto L_0x0273
            r3.f34729e = r2
            r3.a()
        L_0x0273:
            com.ss.android.ugc.aweme.base.d.a r2 = r7.mAvatarDrawable
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.base.d.a.f34725a
            r14 = 0
            r15 = 24646(0x6046, float:3.4536E-41)
            java.lang.Class[] r3 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r2
            r16 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r3 == 0) goto L_0x029b
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.base.d.a.f34725a
            r14 = 0
            r15 = 24646(0x6046, float:3.4536E-41)
            java.lang.Class[] r3 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r2
            r16 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x02a4
        L_0x029b:
            r2.g = r10
            r2.f34730f = r9
            r2.h = r10
            r2.invalidateSelf()
        L_0x02a4:
            com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView r2 = r7.mIvAvatar
            com.ss.android.ugc.aweme.base.d.a r3 = r7.mAvatarDrawable
            r2.setBackgroundDrawable(r3)
            goto L_0x02cb
        L_0x02ac:
            com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView r2 = r7.mIvAvatar
            int r3 = LIVE_BORDER_COLOR
            r2.setBorderColor(r3)
            goto L_0x02cb
        L_0x02b4:
            com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView r2 = r7.mIvAvatar
            int r3 = FOLLOWING_BORDER_READ_COLOR
            r2.setBorderColor(r3)
            goto L_0x02cb
        L_0x02bc:
            com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView r2 = r7.mIvAvatar
            int r3 = FOLLOWING_BORDER_NEW_COLOR
            r2.setBorderColor(r3)
            goto L_0x02cb
        L_0x02c4:
            com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView r2 = r7.mIvAvatar
            int r3 = VALID_COLORS
            r2.setBorderColor(r3)
        L_0x02cb:
            boolean r1 = r7.isRead(r1)
            boolean r0 = r7.isRead(r0)
            if (r1 == r0) goto L_0x02ef
            com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView r1 = r7.mIvAvatar
            if (r0 == 0) goto L_0x02dc
            r2 = 1056964608(0x3f000000, float:0.5)
            goto L_0x02de
        L_0x02dc:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x02de:
            r1.setAlpha(r2)
            android.widget.ImageView r1 = r7.mImgFollowingPlay
            if (r0 == 0) goto L_0x02e9
            r0 = 2130839881(0x7f020949, float:1.7284785E38)
            goto L_0x02ec
        L_0x02e9:
            r0 = 2130839880(0x7f020948, float:1.7284783E38)
        L_0x02ec:
            r1.setImageResource(r0)
        L_0x02ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.story.feed.StoryFeedItemView.bind(com.ss.android.ugc.aweme.main.story.feed.b):void");
    }

    public StoryFeedItemView create(Context context, ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{context, viewGroup}, this, changeQuickRedirect, false, 58201, new Class[]{Context.class, ViewGroup.class}, StoryFeedItemView.class)) {
            return (StoryFeedItemView) PatchProxy.accessDispatch(new Object[]{context, viewGroup}, this, changeQuickRedirect, false, 58201, new Class[]{Context.class, ViewGroup.class}, StoryFeedItemView.class);
        }
        this.mView = LayoutInflater.from(context).inflate(getItemLayout(), viewGroup, false);
        initReferences();
        initListeners();
        initViews();
        this.mView.setTag(C0906R.id.aqv, this);
        return this;
    }
}

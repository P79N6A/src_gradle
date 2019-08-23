package com.ss.android.ugc.aweme.feed.ui;

import android.arch.lifecycle.Observer;
import android.support.v4.app.AccessibilityUtil;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.ui.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.widget.PeriscopeLayout;
import com.ss.android.ugc.aweme.legoImp.inflate.q;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ed;

public final class bt extends f implements Observer<a> {
    public static ChangeQuickRedirect o;
    public static boolean t;
    CircleImageView p;
    CircleImageView q;
    PeriscopeLayout r;
    FrameLayout s;
    public b u;
    public Runnable v;

    private void j() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 43273, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 43273, new Class[0], Void.TYPE);
            return;
        }
        if (this.r != null) {
            this.r.b();
        }
    }

    private void k() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 43275, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 43275, new Class[0], Void.TYPE);
            return;
        }
        if (this.r != null) {
            this.r.a();
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 43271, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 43271, new Class[0], Void.TYPE);
            return;
        }
        k();
        if (this.s != null) {
            this.s.clearAnimation();
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 43272, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 43272, new Class[0], Void.TYPE);
            return;
        }
        if (this.s != null) {
            this.s.clearAnimation();
            this.s.setRotation(0.0f);
        }
        j();
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 43279, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 43279, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.a((Observer<a>) this);
        }
    }

    public bt(View view) {
        super(view);
    }

    public final void a(DataCenter dataCenter) {
        if (PatchProxy.isSupport(new Object[]{dataCenter}, this, o, false, 43262, new Class[]{DataCenter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dataCenter}, this, o, false, 43262, new Class[]{DataCenter.class}, Void.TYPE);
            return;
        }
        dataCenter.a("stopPlayAnimation", (Observer<a>) this).a("startPlayAnimation", (Observer<a>) this).a("pausePlayAnimation", (Observer<a>) this).a("tryDestroyEnterMusicGuide", (Observer<a>) this).a("tryDismissEnterMusicGuide", (Observer<a>) this).a("tryShowEnterMusicGuide", (Observer<a>) this);
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, o, false, 43261, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, o, false, 43261, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        View a2 = ((q) com.ss.android.ugc.aweme.lego.a.i.b(q.class)).a(this.h, (int) C0906R.layout.layout_video_cover_music);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(a2);
        }
        this.s = (FrameLayout) a2.findViewById(C0906R.id.bob);
        this.q = (CircleImageView) a2.findViewById(C0906R.id.boa);
        this.p = (CircleImageView) a2.findViewById(C0906R.id.bvc);
        this.r = (PeriscopeLayout) a2.findViewById(C0906R.id.brf);
        if (com.ss.android.g.a.b()) {
            this.q.a(true, false);
            this.p.a(true, false);
        }
        this.q.setOnTouchListener(ed.a(0.5f, 1.0f));
    }

    public final void a(VideoItemParams videoItemParams) {
        if (PatchProxy.isSupport(new Object[]{videoItemParams}, this, o, false, 43263, new Class[]{VideoItemParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoItemParams}, this, o, false, 43263, new Class[]{VideoItemParams.class}, Void.TYPE);
            return;
        }
        super.a(videoItemParams);
        if (com.ss.android.g.a.a()) {
            Music music = this.f3210b.getMusic();
            User author = this.f3210b.getAuthor();
            if (PatchProxy.isSupport(new Object[]{music, author}, this, o, false, 43265, new Class[]{Music.class, User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{music, author}, this, o, false, 43265, new Class[]{Music.class, User.class}, Void.TYPE);
            } else if (music == null || music.getCoverThumb() == null) {
                c.a((RemoteImageView) this.q, 2130839026);
                this.p.setVisibility(8);
            } else if (TextUtils.isEmpty(music.getOwnerId())) {
                this.q.a(music.getCoverThumb(), u.a(49.0d), u.a(49.0d), null);
                this.p.setVisibility(8);
            } else {
                this.p.setVisibility(0);
                this.p.a(music.getCoverThumb(), 27, 27, null);
                this.q.a(false, false);
                c.a((RemoteImageView) this.q, 2130839026);
            }
        } else {
            Music music2 = this.f3210b.getMusic();
            User author2 = this.f3210b.getAuthor();
            if (PatchProxy.isSupport(new Object[]{music2, author2}, this, o, false, 43266, new Class[]{Music.class, User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{music2, author2}, this, o, false, 43266, new Class[]{Music.class, User.class}, Void.TYPE);
            } else if (music2 == null) {
                c.a((RemoteImageView) this.q, 2130839026);
                this.p.setVisibility(8);
            } else if (TextUtils.isEmpty(music2.getOwnerId())) {
                c.a((RemoteImageView) this.q, music2.getCoverThumb(), u.a(49.0d), u.a(49.0d));
                this.p.setVisibility(8);
            } else {
                this.p.setVisibility(0);
                c.a((RemoteImageView) this.p, music2.getCoverThumb(), 27, 27);
                c.a((RemoteImageView) this.q, 2130839026);
            }
        }
        this.s.setRotation(0.0f);
        if (PatchProxy.isSupport(new Object[0], this, o, false, 43264, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 43264, new Class[0], Void.TYPE);
        } else {
            this.q.setOnClickListener(this.n);
        }
        if (PatchProxy.isSupport(new Object[0], this, o, false, 43280, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 43280, new Class[0], Void.TYPE);
            return;
        }
        if (!com.ss.android.g.a.a()) {
            AccessibilityUtil.setAccessibilityDelegate(this.q, new VideoMusicCoverView$2(this));
            if (this.f3210b == null || this.f3210b.getMusic() == null || TextUtils.isEmpty(this.f3210b.getMusic().getMusicName())) {
                this.s.setContentDescription(this.h.getString(C0906R.string.bed, new Object[]{this.h.getResources().getString(C0906R.string.bdm)}));
                return;
            }
            this.s.setContentDescription(this.h.getString(C0906R.string.bed, new Object[]{this.f3210b.getMusic().getMusicName()}));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01a0, code lost:
        if (r0 != false) goto L_0x01a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onChanged(@android.support.annotation.Nullable java.lang.Object r22) {
        /*
            r21 = this;
            r7 = r21
            r8 = r22
            com.ss.android.ugc.aweme.arch.widgets.base.a r8 = (com.ss.android.ugc.aweme.arch.widgets.base.a) r8
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = o
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.arch.widgets.base.a> r1 = com.ss.android.ugc.aweme.arch.widgets.base.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 43278(0xa90e, float:6.0645E-41)
            r1 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003a
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 43278(0xa90e, float:6.0645E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.arch.widgets.base.a> r1 = com.ss.android.ugc.aweme.arch.widgets.base.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003a:
            if (r8 == 0) goto L_0x032a
            java.lang.String r0 = r8.f34376a
            int r1 = r0.hashCode()
            r8 = 4
            r11 = -1
            r12 = 2
            switch(r1) {
                case -2058685350: goto L_0x007b;
                case -1661876786: goto L_0x0071;
                case -588144512: goto L_0x0067;
                case 307897710: goto L_0x005d;
                case 974857488: goto L_0x0053;
                case 1625981527: goto L_0x0049;
                default: goto L_0x0048;
            }
        L_0x0048:
            goto L_0x0085
        L_0x0049:
            java.lang.String r1 = "tryShowEnterMusicGuide"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0085
            r0 = 3
            goto L_0x0086
        L_0x0053:
            java.lang.String r1 = "tryDestroyEnterMusicGuide"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0085
            r0 = 5
            goto L_0x0086
        L_0x005d:
            java.lang.String r1 = "startPlayAnimation"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0085
            r0 = 0
            goto L_0x0086
        L_0x0067:
            java.lang.String r1 = "tryDismissEnterMusicGuide"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0085
            r0 = 4
            goto L_0x0086
        L_0x0071:
            java.lang.String r1 = "stopPlayAnimation"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0085
            r0 = 2
            goto L_0x0086
        L_0x007b:
            java.lang.String r1 = "pausePlayAnimation"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0085
            r0 = 1
            goto L_0x0086
        L_0x0085:
            r0 = -1
        L_0x0086:
            r13 = 0
            switch(r0) {
                case 0: goto L_0x01cd;
                case 1: goto L_0x01c9;
                case 2: goto L_0x01c5;
                case 3: goto L_0x0124;
                case 4: goto L_0x00d3;
                case 5: goto L_0x008c;
                default: goto L_0x008a;
            }
        L_0x008a:
            goto L_0x032a
        L_0x008c:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 43277(0xa90d, float:6.0644E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00b2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 43277(0xa90d, float:6.0644E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x00b2:
            java.lang.Runnable r0 = r7.v
            if (r0 == 0) goto L_0x00bd
            java.lang.Runnable r0 = r7.v
            com.ss.android.b.a.a.a.c(r0)
            r7.v = r13
        L_0x00bd:
            com.bytedance.ies.dmt.ui.a.b r0 = r7.u
            if (r0 == 0) goto L_0x032a
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.g
            java.lang.String r1 = "is_show_music_guide"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.a((java.lang.String) r1, (java.lang.Object) r2)
            com.bytedance.ies.dmt.ui.a.b r0 = r7.u
            r0.b()
            r7.u = r13
            goto L_0x032a
        L_0x00d3:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 43276(0xa90c, float:6.0643E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00ff
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 43276(0xa90c, float:6.0643E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r21
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.booleanValue()
            goto L_0x0123
        L_0x00ff:
            java.lang.Runnable r0 = r7.v
            if (r0 == 0) goto L_0x010b
            java.lang.Runnable r0 = r7.v
            com.ss.android.b.a.a.a.c(r0)
            r7.v = r13
            goto L_0x0123
        L_0x010b:
            com.bytedance.ies.dmt.ui.a.b r0 = r7.u
            if (r0 == 0) goto L_0x0123
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.g
            if (r0 == 0) goto L_0x011c
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.g
            java.lang.String r1 = "is_show_music_guide"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.a((java.lang.String) r1, (java.lang.Object) r2)
        L_0x011c:
            com.bytedance.ies.dmt.ui.a.b r0 = r7.u
            r0.dismiss()
            r7.u = r13
        L_0x0123:
            return
        L_0x0124:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 43268(0xa904, float:6.0631E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x014b
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 43268(0xa904, float:6.0631E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x032a
        L_0x014b:
            boolean r0 = com.ss.android.ugc.aweme.utils.ex.b()
            if (r0 != 0) goto L_0x032a
            boolean r0 = com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isTeenModeON()
            if (r0 == 0) goto L_0x0159
            goto L_0x032a
        L_0x0159:
            boolean r0 = com.ss.android.g.a.a()
            if (r0 == 0) goto L_0x01a2
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r14 = 0
            r15 = 71985(0x11931, float:1.00872E-40)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r0
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x0192
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r14 = 0
            r15 = 71985(0x11931, float:1.00872E-40)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r0
            r16 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x01a0
        L_0x0192:
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = r0.d()
            if (r0 != 0) goto L_0x019a
        L_0x0198:
            r0 = 1
            goto L_0x01a0
        L_0x019a:
            int r0 = r0.enableMusicDetailGuid
            if (r0 != r9) goto L_0x019f
            goto L_0x0198
        L_0x019f:
            r0 = 0
        L_0x01a0:
            if (r0 == 0) goto L_0x01c4
        L_0x01a2:
            boolean r0 = t
            if (r0 != 0) goto L_0x01c4
            java.lang.String r0 = r7.f3211c
            java.lang.String r1 = "homepage_hot"
            boolean r0 = com.bytedance.common.utility.StringUtils.equal(r0, r1)
            if (r0 == 0) goto L_0x01c4
            boolean r0 = com.ss.android.ugc.aweme.feed.y.a()
            if (r0 == 0) goto L_0x01c4
            t = r9
            com.ss.android.ugc.aweme.feed.ui.bt$1 r0 = new com.ss.android.ugc.aweme.feed.ui.bt$1
            r0.<init>()
            r7.v = r0
            java.lang.Runnable r0 = r7.v
            com.ss.android.b.a.a.a.b(r0)
        L_0x01c4:
            return
        L_0x01c5:
            r21.h()
            return
        L_0x01c9:
            r21.g()
            return
        L_0x01cd:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 43270(0xa906, float:6.0634E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01f4
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 43270(0xa906, float:6.0634E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x032a
        L_0x01f4:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 43269(0xa905, float:6.0633E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x021a
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 43269(0xa905, float:6.0633E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x024f
        L_0x021a:
            android.widget.FrameLayout r0 = r7.s
            if (r0 == 0) goto L_0x024f
            android.widget.FrameLayout r0 = r7.s
            r0.clearAnimation()
            android.view.animation.RotateAnimation r0 = new android.view.animation.RotateAnimation
            r15 = 0
            r16 = 1135869952(0x43b40000, float:360.0)
            r17 = 1
            r18 = 1056964608(0x3f000000, float:0.5)
            r19 = 1
            r20 = 1056964608(0x3f000000, float:0.5)
            r14 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r1 = 8000(0x1f40, double:3.9525E-320)
            r0.setDuration(r1)
            android.view.animation.LinearInterpolator r1 = new android.view.animation.LinearInterpolator
            r1.<init>()
            r0.setInterpolator(r1)
            r0.setRepeatMode(r9)
            r0.setRepeatCount(r11)
            r0.setFillAfter(r9)
            android.widget.FrameLayout r1 = r7.s
            r1.startAnimation(r0)
        L_0x024f:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 43274(0xa90a, float:6.064E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0276
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 43274(0xa90a, float:6.064E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x032a
        L_0x0276:
            com.ss.android.ugc.aweme.feed.widget.PeriscopeLayout r0 = r7.r
            if (r0 == 0) goto L_0x0329
            com.ss.android.ugc.aweme.feed.widget.PeriscopeLayout r0 = r7.r
            java.lang.Object[] r14 = new java.lang.Object[r12]
            r1 = 800(0x320, float:1.121E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r14[r10] = r2
            r2 = 3000(0xbb8, float:4.204E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r14[r9] = r3
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.feed.widget.PeriscopeLayout.f47018a
            r17 = 0
            r18 = 43731(0xaad3, float:6.128E-41)
            java.lang.Class[] r3 = new java.lang.Class[r12]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r10] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r9] = r4
            java.lang.Class r20 = java.lang.Void.TYPE
            r15 = r0
            r19 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
            if (r3 == 0) goto L_0x02d2
            java.lang.Object[] r14 = new java.lang.Object[r12]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r14[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r14[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.feed.widget.PeriscopeLayout.f47018a
            r17 = 0
            r18 = 43731(0xaad3, float:6.128E-41)
            java.lang.Class[] r1 = new java.lang.Class[r12]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r10] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r9] = r2
            java.lang.Class r20 = java.lang.Void.TYPE
            r15 = r0
            r19 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x032a
        L_0x02d2:
            r0.k = r2
            java.lang.Object[] r14 = new java.lang.Object[r9]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r14[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.feed.widget.PeriscopeLayout.f47018a
            r17 = 0
            r18 = 43734(0xaad6, float:6.1284E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r2[r10] = r3
            java.lang.Class r20 = java.lang.Void.TYPE
            r15 = r0
            r19 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
            if (r2 == 0) goto L_0x0312
            java.lang.Object[] r14 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r14[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.feed.widget.PeriscopeLayout.f47018a
            r17 = 0
            r18 = 43734(0xaad6, float:6.1284E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r10] = r2
            java.lang.Class r20 = java.lang.Void.TYPE
            r15 = r0
            r19 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x032a
        L_0x0312:
            r0.j = r1
            android.os.Handler r1 = r0.l
            r1.removeCallbacksAndMessages(r13)
            android.os.Handler r1 = r0.l
            java.lang.Runnable r2 = r0.m
            java.util.Random r0 = r0.f47023f
            int r0 = r0.nextInt(r8)
            int r0 = r0 * 100
            long r3 = (long) r0
            r1.postDelayed(r2, r3)
        L_0x0329:
            return
        L_0x032a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.bt.onChanged(java.lang.Object):void");
    }
}

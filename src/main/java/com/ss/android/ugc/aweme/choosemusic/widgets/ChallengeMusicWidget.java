package com.ss.android.ugc.aweme.choosemusic.widgets;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.ItemWidgetViewHolder;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.choosemusic.b.b;
import com.ss.android.ugc.aweme.choosemusic.b.e;
import com.ss.android.ugc.aweme.choosemusic.f.c;
import com.ss.android.ugc.aweme.choosemusic.f.d;
import com.ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView;
import com.ss.android.ugc.aweme.music.adapter.f;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

public class ChallengeMusicWidget extends ListItemWidget<ChallengeMusicView> implements Observer<a> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f36167b;
    ChallengeDetail k;
    public b l;
    int m = -1;
    public int n;
    public int o;
    com.ss.android.ugc.aweme.choosemusic.a p;
    public f<com.ss.android.ugc.aweme.choosemusic.a.b> q;
    public e r;
    private int s;

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f36167b, false, 26980, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36167b, false, 26980, new Class[0], Void.TYPE);
            return;
        }
        this.l.a((MusicModel) null);
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f36167b, false, 26979, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36167b, false, 26979, new Class[0], Void.TYPE);
        } else if (this.k == null) {
            ((ChallengeMusicView) this.f34346a).itemView.setVisibility(8);
        } else {
            ((ChallengeMusicView) this.f34346a).itemView.setVisibility(0);
            ((ChallengeMusicView) this.f34346a).a(this.k.challenge, d.b(this.k.challenge.getConnectMusics()), ((Integer) this.g.b("music_position", -1)).intValue(), this.m, (String) this.g.b("challenge_id", null), new a(this), this.q);
        }
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f36167b, false, 26975, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36167b, false, 26975, new Class[0], Void.TYPE);
            return;
        }
        this.g.a("data_challenge", (Observer<a>) this).a("music_index", (Observer<a>) this).a("music_collect_status", (Observer<a>) this).a("music_loading", (Observer<a>) this);
        this.s = ((Integer) this.g.a("key_choose_music_type")).intValue();
        super.onCreate();
        this.p = new com.ss.android.ugc.aweme.choosemusic.a("change_music_page", "attached_song", "", c.a());
        this.p.g = (String) this.g.b("challenge_id", null);
    }

    public final void a(ItemWidgetViewHolder itemWidgetViewHolder) {
        if (PatchProxy.isSupport(new Object[]{itemWidgetViewHolder}, this, f36167b, false, 26974, new Class[]{ItemWidgetViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{itemWidgetViewHolder}, this, f36167b, false, 26974, new Class[]{ItemWidgetViewHolder.class}, Void.TYPE);
            return;
        }
        super.a(itemWidgetViewHolder);
        this.k = (ChallengeDetail) this.g.a("data_challenge");
        f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0221  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onChanged(@android.support.annotation.Nullable java.lang.Object r22) {
        /*
            r21 = this;
            r7 = r21
            r8 = r22
            com.ss.android.ugc.aweme.arch.widgets.base.a r8 = (com.ss.android.ugc.aweme.arch.widgets.base.a) r8
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f36167b
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.arch.widgets.base.a> r1 = com.ss.android.ugc.aweme.arch.widgets.base.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 26977(0x6961, float:3.7803E-41)
            r1 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f36167b
            r3 = 0
            r4 = 26977(0x6961, float:3.7803E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.arch.widgets.base.a> r1 = com.ss.android.ugc.aweme.arch.widgets.base.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            java.lang.String r0 = r8.f34376a
            int r1 = r0.hashCode()
            r2 = -1635157503(0xffffffff9e897a01, float:-1.4555899E-20)
            r11 = -1
            r12 = 2
            if (r1 == r2) goto L_0x0073
            r2 = 502104354(0x1ded8122, float:6.2866898E-21)
            if (r1 == r2) goto L_0x0069
            r2 = 1579846200(0x5e2a8a38, float:3.07217403E18)
            if (r1 == r2) goto L_0x005f
            r2 = 2085247502(0x7c4a5a0e, float:4.202682E36)
            if (r1 == r2) goto L_0x0055
            goto L_0x007d
        L_0x0055:
            java.lang.String r1 = "data_challenge"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007d
            r0 = 0
            goto L_0x007e
        L_0x005f:
            java.lang.String r1 = "music_index"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007d
            r0 = 2
            goto L_0x007e
        L_0x0069:
            java.lang.String r1 = "music_loading"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007d
            r0 = 3
            goto L_0x007e
        L_0x0073:
            java.lang.String r1 = "music_collect_status"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007d
            r0 = 1
            goto L_0x007e
        L_0x007d:
            r0 = -1
        L_0x007e:
            switch(r0) {
                case 0: goto L_0x033f;
                case 1: goto L_0x0221;
                case 2: goto L_0x0125;
                case 3: goto L_0x0083;
                default: goto L_0x0081;
            }
        L_0x0081:
            goto L_0x034b
        L_0x0083:
            com.ss.android.ugc.aweme.arch.widgets.ItemWidgetViewHolder r0 = r7.f34346a
            if (r0 == 0) goto L_0x034b
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.g
            java.lang.String r1 = "music_position"
            java.lang.Object r0 = r0.a((java.lang.String) r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L_0x0094
            goto L_0x0098
        L_0x0094:
            int r11 = r0.intValue()
        L_0x0098:
            int r0 = r7.n
            if (r0 != r11) goto L_0x034b
            com.ss.android.ugc.aweme.arch.widgets.ItemWidgetViewHolder r0 = r7.f34346a
            com.ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView r0 = (com.ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView) r0
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r7.g
            java.lang.String r2 = "music_index"
            java.lang.Object r1 = r1.a((java.lang.String) r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r2 = r7.g
            java.lang.String r3 = "music_loading"
            java.lang.Object r2 = r2.a((java.lang.String) r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r13[r10] = r3
            java.lang.Byte r3 = java.lang.Byte.valueOf(r2)
            r13[r9] = r3
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView.f36012c
            r16 = 0
            r17 = 26823(0x68c7, float:3.7587E-41)
            java.lang.Class[] r3 = new java.lang.Class[r12]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r3[r10] = r4
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r3[r9] = r4
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r0
            r18 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r3 == 0) goto L_0x010c
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13[r10] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r2)
            r13[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView.f36012c
            r16 = 0
            r17 = 26823(0x68c7, float:3.7587E-41)
            java.lang.Class[] r1 = new java.lang.Class[r12]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r10] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r1[r9] = r2
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r0
            r18 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x010c:
            if (r1 < 0) goto L_0x0124
            java.util.List<com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder> r3 = r0.f36013d
            int r3 = r3.size()
            if (r1 < r3) goto L_0x0117
            goto L_0x0124
        L_0x0117:
            java.util.List<com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder> r0 = r0.f36013d
            java.lang.Object r0 = r0.get(r1)
            com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder r0 = (com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder) r0
            r0.a((boolean) r2, (boolean) r9)
            goto L_0x034b
        L_0x0124:
            return
        L_0x0125:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.g
            java.lang.String r1 = "music_position"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            java.lang.Object r0 = r0.b((java.lang.String) r1, r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r8 = r0.intValue()
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.g
            java.lang.String r1 = "music_index"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            java.lang.Object r0 = r0.b((java.lang.String) r1, r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r13 = r0.intValue()
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r0[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f36167b
            r3 = 0
            r4 = 26978(0x6962, float:3.7804E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0196
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r0[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f36167b
            r3 = 0
            r4 = 26978(0x6962, float:3.7804E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x034b
        L_0x0196:
            boolean r0 = r7.i
            if (r0 == 0) goto L_0x0220
            com.ss.android.ugc.aweme.arch.widgets.ItemWidgetViewHolder r0 = r7.f34346a
            com.ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView r0 = (com.ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView) r0
            int r1 = r7.m
            r2 = -2
            if (r8 != r2) goto L_0x01a5
            r3 = r13
            goto L_0x01a6
        L_0x01a5:
            r3 = -1
        L_0x01a6:
            java.lang.Object[] r14 = new java.lang.Object[r12]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r14[r10] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r14[r9] = r4
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView.f36012c
            r17 = 0
            r18 = 26822(0x68c6, float:3.7586E-41)
            java.lang.Class[] r4 = new java.lang.Class[r12]
            java.lang.Class r5 = java.lang.Integer.TYPE
            r4[r10] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r4[r9] = r5
            java.lang.Class r20 = java.lang.Void.TYPE
            r15 = r0
            r19 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
            if (r4 == 0) goto L_0x01f6
            java.lang.Object[] r14 = new java.lang.Object[r12]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r14[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r14[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView.f36012c
            r17 = 0
            r18 = 26822(0x68c6, float:3.7586E-41)
            java.lang.Class[] r1 = new java.lang.Class[r12]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r1[r10] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r1[r9] = r3
            java.lang.Class r20 = java.lang.Void.TYPE
            r15 = r0
            r19 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x020c
        L_0x01f6:
            if (r1 < 0) goto L_0x020c
            java.util.List<com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder> r3 = r0.f36013d
            int r3 = r3.size()
            if (r1 < r3) goto L_0x0201
            goto L_0x020c
        L_0x0201:
            java.util.List<com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder> r0 = r0.f36013d
            java.lang.Object r0 = r0.get(r1)
            com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder r0 = (com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder) r0
            r0.a((boolean) r10)
        L_0x020c:
            if (r8 == r2) goto L_0x0212
            r7.m = r11
            goto L_0x034b
        L_0x0212:
            int r0 = r7.m
            if (r0 != r13) goto L_0x021e
            com.ss.android.ugc.aweme.choosemusic.b.b r0 = r7.l
            r1 = 0
            r0.a((com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r1)
            goto L_0x034b
        L_0x021e:
            r7.m = r13
        L_0x0220:
            return
        L_0x0221:
            java.lang.Object r0 = r8.a()
            r8 = r0
            com.ss.android.ugc.aweme.choosemusic.a.a r8 = (com.ss.android.ugc.aweme.choosemusic.a.a) r8
            int r0 = r8.f35737a
            if (r0 != r9) goto L_0x0232
            int r0 = r7.n
            int r1 = r8.f35738b
            if (r0 == r1) goto L_0x0236
        L_0x0232:
            int r0 = r8.f35737a
            if (r0 != 0) goto L_0x034b
        L_0x0236:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f36167b
            r3 = 0
            r4 = 26976(0x6960, float:3.7801E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.choosemusic.a.a> r1 = com.ss.android.ugc.aweme.choosemusic.a.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0267
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f36167b
            r3 = 0
            r4 = 26976(0x6960, float:3.7801E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.choosemusic.a.a> r1 = com.ss.android.ugc.aweme.choosemusic.a.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x034b
        L_0x0267:
            com.ss.android.ugc.aweme.arch.widgets.ItemWidgetViewHolder r0 = r7.f34346a
            if (r0 == 0) goto L_0x033e
            com.ss.android.ugc.aweme.arch.widgets.ItemWidgetViewHolder r0 = r7.f34346a
            com.ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView r0 = (com.ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView) r0
            java.lang.Object[] r13 = new java.lang.Object[r9]
            r13[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView.f36012c
            r16 = 0
            r17 = 26820(0x68c4, float:3.7583E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.choosemusic.a.a> r2 = com.ss.android.ugc.aweme.choosemusic.a.a.class
            r1[r10] = r2
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r0
            r18 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r1 == 0) goto L_0x02a4
            java.lang.Object[] r13 = new java.lang.Object[r9]
            r13[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView.f36012c
            r16 = 0
            r17 = 26820(0x68c4, float:3.7583E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.choosemusic.a.a> r2 = com.ss.android.ugc.aweme.choosemusic.a.a.class
            r1[r10] = r2
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r0
            r18 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x034b
        L_0x02a4:
            java.util.List<com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder> r1 = r0.f36013d
            boolean r1 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x033e
            java.util.List<com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder> r1 = r0.f36013d
            java.util.Iterator r1 = r1.iterator()
        L_0x02b2:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x033e
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder r2 = (com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder) r2
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r3 = r8.f35741e
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r10] = r2
            r13[r9] = r3
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView.f36012c
            r16 = 0
            r17 = 26821(0x68c5, float:3.7584E-41)
            java.lang.Class[] r4 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder> r5 = com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder.class
            r4[r10] = r5
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r5 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.class
            r4[r9] = r5
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r14 = r0
            r18 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r4 == 0) goto L_0x0307
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r10] = r2
            r13[r9] = r3
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView.f36012c
            r16 = 0
            r17 = 26821(0x68c5, float:3.7584E-41)
            java.lang.Class[] r3 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder> r4 = com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder.class
            r3[r10] = r4
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r4 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.class
            r3[r9] = r4
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r14 = r0
            r18 = r3
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            goto L_0x032a
        L_0x0307:
            if (r3 == 0) goto L_0x0329
            java.lang.String r4 = r3.getMusicId()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0329
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r4 = r2.f36102d
            if (r4 == 0) goto L_0x0329
            java.lang.String r3 = r3.getMusicId()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r4 = r2.f36102d
            java.lang.String r4 = r4.getMusicId()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0329
            r3 = 1
            goto L_0x032a
        L_0x0329:
            r3 = 0
        L_0x032a:
            if (r3 == 0) goto L_0x02b2
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r2.f36102d
            int r1 = r8.f35740d
            if (r1 != r9) goto L_0x0335
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$CollectionType r1 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType.COLLECTED
            goto L_0x0337
        L_0x0335:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$CollectionType r1 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType.NOT_COLLECTED
        L_0x0337:
            r0.setCollectionType(r1)
            r2.c()
            goto L_0x034b
        L_0x033e:
            return
        L_0x033f:
            java.lang.Object r0 = r8.a()
            com.ss.android.ugc.aweme.challenge.model.ChallengeDetail r0 = (com.ss.android.ugc.aweme.challenge.model.ChallengeDetail) r0
            r7.k = r0
            r21.f()
            return
        L_0x034b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.widgets.ChallengeMusicWidget.onChanged(java.lang.Object):void");
    }
}

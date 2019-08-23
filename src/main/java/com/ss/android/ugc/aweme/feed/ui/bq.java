package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.discover.helper.b;
import com.ss.android.ugc.aweme.discover.hotspot.HotSpotDetailActivity;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.feed.model.HotSearchInfo;
import com.ss.android.ugc.aweme.hotsearch.RankingListVideoActivity;
import com.ss.android.ugc.aweme.legoImp.inflate.q;
import java.util.Map;

public final class bq extends e implements Observer<a> {
    public static ChangeQuickRedirect l;
    private View m;
    private DmtTextView n;
    private DmtTextView o;
    private DmtTextView p;
    private ImageView q;
    private ImageView r;
    private int s;

    public final void a(DataCenter dataCenter) {
    }

    public final void b() {
    }

    public final /* bridge */ /* synthetic */ void onChanged(@Nullable Object obj) {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f() {
        String str;
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, l, false, 43254, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, l, false, 43254, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else {
            d a2 = d.a();
            if (TextUtils.equals(this.f3211c, "discovery_hot_search_video")) {
                str = "hot_search_video";
            } else {
                str = this.f3211c;
            }
            r.a("enter_hot_search_video_board", (Map) a2.a("enter_from", str).f34114b);
        }
        RankingListVideoActivity.a(this.h);
    }

    public bq(View view) {
        super(view);
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, l, false, 43251, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, l, false, 43251, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view instanceof FrameLayout) {
            this.m = ((q) com.ss.android.ugc.aweme.lego.a.i.b(q.class)).a(this.h, (int) C0906R.layout.view_video_hot_search_bar);
            this.n = (DmtTextView) this.m.findViewById(C0906R.id.da0);
            this.o = (DmtTextView) this.m.findViewById(C0906R.id.dd0);
            this.p = (DmtTextView) this.m.findViewById(C0906R.id.dd4);
            this.r = (ImageView) this.m.findViewById(C0906R.id.aq8);
            this.q = (ImageView) this.m.findViewById(C0906R.id.b0z);
            ((FrameLayout) view).addView(this.m, new FrameLayout.LayoutParams(-1, u.a(32.0d)));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0187  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.feed.model.VideoItemParams r14) {
        /*
            r13 = this;
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r14
            com.meituan.robust.ChangeQuickRedirect r2 = l
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.VideoItemParams> r1 = com.ss.android.ugc.aweme.feed.model.VideoItemParams.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 43252(0xa8f4, float:6.0609E-41)
            r1 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r14
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43252(0xa8f4, float:6.0609E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.VideoItemParams> r1 = com.ss.android.ugc.aweme.feed.model.VideoItemParams.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r13
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            super.a((com.ss.android.ugc.aweme.feed.model.VideoItemParams) r14)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.f3210b
            r7 = 8
            if (r0 != 0) goto L_0x0041
            android.view.View r0 = r13.m
            com.ss.android.ugc.aweme.base.utils.v.a((android.view.View) r0, (int) r7)
            return
        L_0x0041:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.f3210b
            boolean r0 = com.ss.android.ugc.aweme.report.b.a(r0)
            if (r0 == 0) goto L_0x004f
            android.view.View r0 = r13.m
            com.ss.android.ugc.aweme.base.utils.v.a((android.view.View) r0, (int) r7)
            return
        L_0x004f:
            android.content.Context r0 = r13.h
            com.ss.android.ugc.aweme.feed.param.b r0 = com.ss.android.ugc.aweme.feed.param.FeedParamProvider.a(r0)
            boolean r0 = r0.isHotSpot()
            if (r0 == 0) goto L_0x0061
            android.view.View r0 = r13.m
            com.ss.android.ugc.aweme.base.utils.v.a((android.view.View) r0, (int) r7)
            return
        L_0x0061:
            java.lang.String r0 = r13.f3211c
            java.lang.String r1 = "discovery_hot_search_video"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L_0x0078
            java.lang.String r0 = r13.f3211c
            java.lang.String r1 = "hot_search_video_board"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x0076
            goto L_0x0078
        L_0x0076:
            r0 = 0
            goto L_0x0079
        L_0x0078:
            r0 = 1
        L_0x0079:
            boolean r1 = com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isTeenModeON()
            r10 = 2
            r11 = 3
            if (r1 != 0) goto L_0x017c
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r13.f3210b
            boolean r1 = r1.isHotSearchAweme()
            if (r1 == 0) goto L_0x0112
            if (r0 != 0) goto L_0x0112
            r13.s = r10
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.f3210b
            com.ss.android.ugc.aweme.feed.model.HotSearchInfo r0 = r0.getHotSearchInfo()
            android.view.View r1 = r13.m
            r1.setVisibility(r9)
            java.lang.String r1 = r0.getChallengeId()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r1 = r1 ^ r8
            java.lang.String r2 = r0.getSentence()
            java.lang.String r3 = r0.getChallengeId()
            r13.a(r2, r3, r1, r8)
            if (r1 == 0) goto L_0x00b1
            java.lang.String r2 = "#"
            goto L_0x00b3
        L_0x00b1:
            java.lang.String r2 = ""
        L_0x00b3:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r13.n
            android.content.Context r4 = r13.h
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131564603(0x7f0d183b, float:1.8754696E38)
            java.lang.Object[] r6 = new java.lang.Object[r8]
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r2)
            java.lang.String r2 = r0.getSentence()
            r12.append(r2)
            java.lang.String r2 = r12.toString()
            r6[r9] = r2
            java.lang.String r2 = r4.getString(r5, r6)
            r3.setText(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = " | "
            r2.<init>(r3)
            android.content.Context r3 = r13.h
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131560296(0x7f0d0768, float:1.874596E38)
            java.lang.String r3 = r3.getString(r4)
            r2.append(r3)
            long r3 = r0.getValue()
            java.lang.String r3 = com.ss.android.ugc.aweme.i18n.b.a(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r13.o
            r3.setText(r2)
            android.view.View r2 = r13.m
            com.ss.android.ugc.aweme.feed.ui.br r3 = new com.ss.android.ugc.aweme.feed.ui.br
            r3.<init>(r13, r0, r1)
            r2.setOnClickListener(r3)
            goto L_0x0183
        L_0x0112:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.f3210b
            boolean r0 = r0.isHotVideoAweme()
            if (r0 == 0) goto L_0x017c
            r13.s = r11
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.f3210b
            com.ss.android.ugc.aweme.feed.model.HotSearchInfo r0 = r0.getHotSearchInfo()
            android.view.View r1 = r13.m
            r1.setVisibility(r9)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r13.n
            android.content.Context r2 = r13.h
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131563058(0x7f0d1232, float:1.8751562E38)
            java.lang.Object[] r4 = new java.lang.Object[r8]
            int r5 = r0.getVideoRank()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r9] = r5
            java.lang.String r2 = r2.getString(r3, r4)
            r1.setText(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " | "
            r1.<init>(r2)
            android.content.Context r2 = r13.h
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131563059(0x7f0d1233, float:1.8751564E38)
            java.lang.Object[] r4 = new java.lang.Object[r8]
            long r5 = r0.getVideoRankVV()
            java.lang.String r0 = com.ss.android.ugc.aweme.i18n.b.a(r5)
            r4[r9] = r0
            java.lang.String r0 = r2.getString(r3, r4)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r13.o
            r1.setText(r0)
            android.view.View r0 = r13.m
            com.ss.android.ugc.aweme.feed.ui.bs r1 = new com.ss.android.ugc.aweme.feed.ui.bs
            r1.<init>(r13)
            r0.setOnClickListener(r1)
            goto L_0x0183
        L_0x017c:
            r13.s = r8
            android.view.View r0 = r13.m
            r0.setVisibility(r7)
        L_0x0183:
            int r0 = r13.s
            if (r0 == r8) goto L_0x02f5
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43255(0xa8f7, float:6.0613E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01ac
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43255(0xa8f7, float:6.0613E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r13
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x02f0
        L_0x01ac:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43256(0xa8f8, float:6.0615E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01d1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43256(0xa8f8, float:6.0615E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r13
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0240
        L_0x01d1:
            int r0 = r13.s
            if (r10 != r0) goto L_0x01e3
            android.widget.ImageView r0 = r13.r
            com.ss.android.ugc.aweme.base.utils.v.a((android.view.View) r0, (int) r9)
            android.widget.ImageView r0 = r13.r
            r1 = 2130839426(0x7f020782, float:1.7283862E38)
            r0.setImageResource(r1)
            goto L_0x0240
        L_0x01e3:
            java.lang.String r0 = r13.f3211c
            java.lang.String r1 = "homepage_hot"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L_0x0233
            java.lang.String r0 = r13.f3211c
            java.lang.String r1 = "others_homepage"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L_0x0233
            java.lang.String r0 = r13.f3211c
            java.lang.String r1 = "personal_homepage"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x0202
            goto L_0x0233
        L_0x0202:
            java.lang.String r0 = r13.f3211c
            java.lang.String r1 = "discovery_hot_search_video"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L_0x021d
            java.lang.String r0 = r13.f3211c
            java.lang.String r1 = "hot_search_video_board"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x0217
            goto L_0x021d
        L_0x0217:
            android.widget.ImageView r0 = r13.r
            com.ss.android.ugc.aweme.base.utils.v.a((android.view.View) r0, (int) r9)
            goto L_0x0240
        L_0x021d:
            android.widget.ImageView r0 = r13.r
            com.ss.android.ugc.aweme.base.utils.v.a((android.view.View) r0, (int) r7)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r13.p
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r13.f3210b
            com.ss.android.ugc.aweme.feed.model.HotSearchInfo r1 = r1.getHotSearchInfo()
            int r1 = r1.getVideoRank()
            r2 = 4
            com.ss.android.ugc.aweme.hotsearch.d.h.a(r0, r1, r2)
            goto L_0x0240
        L_0x0233:
            android.widget.ImageView r0 = r13.r
            com.ss.android.ugc.aweme.base.utils.v.a((android.view.View) r0, (int) r9)
            android.widget.ImageView r0 = r13.r
            r1 = 2130839656(0x7f020868, float:1.7284329E38)
            r0.setImageResource(r1)
        L_0x0240:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43257(0xa8f9, float:6.0616E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0264
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43257(0xa8f9, float:6.0616E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r13
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0288
        L_0x0264:
            int r0 = r13.s
            if (r11 != r0) goto L_0x0280
            java.lang.String r0 = r13.f3211c
            java.lang.String r1 = "discovery_hot_search_video"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L_0x027c
            java.lang.String r0 = r13.f3211c
            java.lang.String r1 = "hot_search_video_board"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x0280
        L_0x027c:
            r0 = 2130838779(0x7f0204fb, float:1.728255E38)
            goto L_0x0283
        L_0x0280:
            r0 = 2130838782(0x7f0204fe, float:1.7282556E38)
        L_0x0283:
            android.widget.ImageView r1 = r13.q
            r1.setImageResource(r0)
        L_0x0288:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43258(0xa8fa, float:6.0617E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x02ac
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43258(0xa8fa, float:6.0617E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r13
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x02f0
        L_0x02ac:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r13.n
            if (r0 == 0) goto L_0x02f0
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r13.o
            if (r0 != 0) goto L_0x02b5
            goto L_0x02f0
        L_0x02b5:
            int r0 = r13.s
            if (r11 != r0) goto L_0x02d1
            java.lang.String r0 = r13.f3211c
            java.lang.String r1 = "discovery_hot_search_video"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L_0x02cd
            java.lang.String r0 = r13.f3211c
            java.lang.String r1 = "hot_search_video_board"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x02d1
        L_0x02cd:
            r0 = 2131624936(0x7f0e03e8, float:1.8877066E38)
            goto L_0x02d4
        L_0x02d1:
            r0 = 2131624637(0x7f0e02bd, float:1.887646E38)
        L_0x02d4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L_0x02f0
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r13.n
            android.content.Context r2 = r13.h
            int r2 = r2.getColor(r0)
            r1.setTextColor(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r13.o
            android.content.Context r2 = r13.h
            int r0 = r2.getColor(r0)
            r1.setTextColor(r0)
        L_0x02f0:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r13.n
            r0.requestLayout()
        L_0x02f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.bq.a(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(HotSearchInfo hotSearchInfo, boolean z) {
        a(hotSearchInfo.getSentence(), hotSearchInfo.getChallengeId(), z, false);
        if (z) {
            h a2 = h.a();
            a2.a(j.a("aweme://challenge/detail/" + hotSearchInfo.getChallengeId()).a("enter_from", this.f3211c).a());
            r.a("enter_tag_detail", (Map) new d().a("enter_from", this.f3211c).a("enter_method", "hot_search_video_guide").a("tag_id", hotSearchInfo.getChallengeId()).f34114b);
            return;
        }
        SearchResultParam enterFrom = new SearchResultParam().setKeyword(hotSearchInfo.getSentence()).setRealSearchWord(hotSearchInfo.getSearchWord()).setSearchFrom(2).setEnterFrom("hot_search_video_guide");
        if (b.e()) {
            HotSpotDetailActivity.a(this.h, enterFrom);
        } else if (TextUtils.equals(this.f3211c, "general_search")) {
            ((Activity) this.h).finish();
        } else {
            SearchResultActivity.a(this.h, enterFrom);
        }
    }

    private void a(String str, String str2, boolean z, boolean z2) {
        String str3;
        String str4 = str;
        String str5 = str2;
        if (PatchProxy.isSupport(new Object[]{str4, str5, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, l, false, 43253, new Class[]{String.class, String.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, Byte.valueOf(z), Byte.valueOf(z2)}, this, l, false, 43253, new Class[]{String.class, String.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        d a2 = d.a().a("enter_from", this.f3211c);
        if (z2) {
            str3 = "show";
        } else {
            str3 = "click";
        }
        d a3 = a2.a("action_type", str3).a("group_id", this.f3210b.getAid());
        if (z) {
            a3.a("tag_id", str5);
        } else {
            a3.a("search_keyword", str4);
        }
        r.a("hot_search_video_guide", (Map) a3.f34114b);
    }
}

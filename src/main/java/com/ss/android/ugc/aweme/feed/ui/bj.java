package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity;
import com.ss.android.ugc.aweme.commercialize.c.b;
import com.ss.android.ugc.aweme.commercialize.feed.e;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.commercialize.utils.r;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.z;
import com.ss.android.ugc.aweme.legoImp.inflate.l;
import com.ss.android.ugc.aweme.legoImp.inflate.q;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.services.publish.PulishTitle;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.shortvideo.view.f;
import com.ss.android.ugc.aweme.translation.ui.TranslationStatusView;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.u.p;
import com.ss.android.ugc.aweme.views.MentionTextView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class bj extends e implements Observer<a> {
    public static ChangeQuickRedirect l;
    public MentionTextView m;
    LinearLayout n;
    e o;
    b p;
    private TranslationStatusView q;
    private bh r;
    private boolean s;
    private boolean t;

    public static String i() {
        return " [t]";
    }

    public final void b() {
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, l, false, 43162, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, l, false, 43162, new Class[]{View.class}, Void.TYPE);
            return;
        }
        View a2 = ((q) com.ss.android.ugc.aweme.lego.a.i.b(q.class)).a(this.h, (int) C0906R.layout.layout_video_desc);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(a2);
        }
        this.m = (MentionTextView) a2.findViewById(C0906R.id.a3m);
        if (this.m == null) {
            a2 = l.a(getClass().getName(), a2, this.h, C0906R.layout.layout_video_desc);
        }
        this.q = (TranslationStatusView) a2.findViewById(C0906R.id.d6m);
        this.n = (LinearLayout) a2.findViewById(C0906R.id.a3w);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.feed.model.VideoItemParams r19) {
        /*
            r18 = this;
            r8 = r18
            r9 = 1
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r10 = 0
            r1[r10] = r19
            com.meituan.robust.ChangeQuickRedirect r3 = l
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.VideoItemParams> r2 = com.ss.android.ugc.aweme.feed.model.VideoItemParams.class
            r6[r10] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 43165(0xa89d, float:6.0487E-41)
            r2 = r18
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0036
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r19
            com.meituan.robust.ChangeQuickRedirect r3 = l
            r4 = 0
            r5 = 43165(0xa89d, float:6.0487E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.VideoItemParams> r0 = com.ss.android.ugc.aweme.feed.model.VideoItemParams.class
            r6[r10] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0036:
            super.a((com.ss.android.ugc.aweme.feed.model.VideoItemParams) r19)
            boolean r0 = com.ss.android.g.a.a()
            if (r0 != 0) goto L_0x004c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f3210b
            boolean r0 = r0.isHashTag()
            if (r0 != 0) goto L_0x004c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f3210b
            r0.convertChallengeToHashTag()
        L_0x004c:
            r8.s = r10
            java.lang.String r0 = ""
            r8.a((java.lang.CharSequence) r0)
            boolean r0 = com.ss.android.g.a.a()
            if (r0 != 0) goto L_0x005f
            com.ss.android.ugc.aweme.views.MentionTextView r0 = r8.m
            r1 = 4
            r0.setMaxLines(r1)
        L_0x005f:
            com.ss.android.ugc.aweme.views.MentionTextView r0 = r8.m
            if (r0 == 0) goto L_0x00db
            com.ss.android.ugc.aweme.views.MentionTextView r0 = r8.m
            com.ss.android.ugc.aweme.views.MentionTextView r1 = r8.m
            android.text.InputFilter[] r1 = r1.getFilters()
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r1
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.feed.k.j.f45597a
            r14 = 1
            r15 = 43620(0xaa64, float:6.1125E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<android.text.InputFilter[]> r3 = android.text.InputFilter[].class
            r2[r10] = r3
            java.lang.Class<android.text.InputFilter[]> r17 = android.text.InputFilter[].class
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x00a0
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r1
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.feed.k.j.f45597a
            r14 = 1
            r15 = 43620(0xaa64, float:6.1125E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<android.text.InputFilter[]> r2 = android.text.InputFilter[].class
            r1[r10] = r2
            java.lang.Class<android.text.InputFilter[]> r17 = android.text.InputFilter[].class
            r16 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x00c5
        L_0x00a0:
            java.lang.String r2 = "filters"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r2)
            kotlin.sequences.Sequence r1 = kotlin.collections.ArraysKt.asSequence((T[]) r1)
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.filterNotNull(r1)
            com.ss.android.ugc.aweme.feed.k.j$a r2 = com.ss.android.ugc.aweme.feed.k.j.a.INSTANCE
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.filterNot(r1, r2)
            java.util.List r1 = kotlin.sequences.SequencesKt.toList(r1)
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x00d3
            android.text.InputFilter[] r2 = new android.text.InputFilter[r10]
            java.lang.Object[] r1 = r1.toArray(r2)
            if (r1 == 0) goto L_0x00cb
        L_0x00c5:
            android.text.InputFilter[] r1 = (android.text.InputFilter[]) r1
            r0.setFilters(r1)
            goto L_0x00db
        L_0x00cb:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
            r0.<init>(r1)
            throw r0
        L_0x00d3:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type java.util.Collection<T>"
            r0.<init>(r1)
            throw r0
        L_0x00db:
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r3 = l
            r4 = 0
            r5 = 43172(0xa8a4, float:6.0497E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x0108
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r3 = l
            r4 = 0
            r5 = 43172(0xa8a4, float:6.0497E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0143
        L_0x0108:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f3210b
            boolean r0 = r0.isAd()
            if (r0 == 0) goto L_0x0142
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f3210b
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            boolean r0 = r0.isDisableAdLink()
            if (r0 != 0) goto L_0x0142
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f3210b
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            java.lang.String r0 = r0.getWebUrl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0138
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f3210b
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            boolean r0 = r0.isRightStyle()
            if (r0 == 0) goto L_0x0142
        L_0x0138:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f3210b
            boolean r0 = r0.isCanPlay()
            if (r0 == 0) goto L_0x0142
            r0 = 1
            goto L_0x0143
        L_0x0142:
            r0 = 0
        L_0x0143:
            if (r0 == 0) goto L_0x0264
            android.view.View r0 = r8.i
            r0.setVisibility(r10)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f3210b
            java.lang.String r0 = r0.getDesc()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x015d
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f3210b
            java.lang.String r1 = ""
            r0.setDesc(r1)
        L_0x015d:
            android.text.SpannableString r0 = new android.text.SpannableString
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r8.f3210b
            java.lang.String r2 = r2.getDesc()
            r1.append(r2)
            java.lang.String r2 = i()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.f3210b
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
            com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel r1 = r1.getLabel()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r8.f3210b
            boolean r2 = r2.isAd()
            r3 = 17
            if (r2 == 0) goto L_0x01d8
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r8.f3210b
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            boolean r2 = r2.isRightStyle()
            if (r2 == 0) goto L_0x01d8
            if (r1 == 0) goto L_0x01d8
            com.ss.android.ugc.aweme.feed.widget.a r2 = new com.ss.android.ugc.aweme.feed.widget.a
            android.content.Context r4 = r8.h
            java.lang.String r5 = r1.getBgColor()
            java.lang.String r6 = r1.getLabelName()
            java.lang.String r7 = r1.getTextColor()
            r2.<init>(r4, r5, r6, r7)
            boolean r1 = r1.isAdHollowText()
            r2.f47033b = r1
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.f3210b
            java.lang.String r1 = r1.getDesc()
            int r1 = r1.length()
            int r1 = r1 + r9
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r8.f3210b
            java.lang.String r4 = r4.getDesc()
            int r4 = r4.length()
            java.lang.String r5 = i()
            int r5 = r5.length()
            int r4 = r4 + r5
            com.ss.android.ugc.aweme.feed.ui.bn.a(r0, r2, r1, r4, r3)
            goto L_0x024c
        L_0x01d8:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.f3210b
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
            java.lang.String r1 = r1.getAdMoreTextual()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0214
            com.ss.android.ugc.aweme.commercialize.ad.b r1 = new com.ss.android.ugc.aweme.commercialize.ad.b
            android.content.Context r2 = r8.h
            r4 = 2130838948(0x7f0205a4, float:1.7282893E38)
            r1.<init>(r2, r4)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r8.f3210b
            java.lang.String r2 = r2.getDesc()
            int r2 = r2.length()
            int r2 = r2 + r9
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r8.f3210b
            java.lang.String r4 = r4.getDesc()
            int r4 = r4.length()
            java.lang.String r5 = i()
            int r5 = r5.length()
            int r4 = r4 + r5
            com.ss.android.ugc.aweme.feed.ui.bn.a(r0, r1, r2, r4, r3)
            goto L_0x024c
        L_0x0214:
            com.ss.android.ugc.aweme.feed.widget.f r1 = new com.ss.android.ugc.aweme.feed.widget.f
            android.content.Context r2 = r8.h
            r4 = 2131624049(0x7f0e0071, float:1.8875267E38)
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r8.f3210b
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5 = r5.getAwemeRawAd()
            java.lang.String r5 = r5.getAdMoreTextual()
            r6 = 2130839479(0x7f0207b7, float:1.728397E38)
            r1.<init>(r2, r4, r5, r6)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r8.f3210b
            java.lang.String r2 = r2.getDesc()
            int r2 = r2.length()
            int r2 = r2 + r9
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r8.f3210b
            java.lang.String r4 = r4.getDesc()
            int r4 = r4.length()
            java.lang.String r5 = i()
            int r5 = r5.length()
            int r4 = r4 + r5
            com.ss.android.ugc.aweme.feed.ui.bn.a(r0, r1, r2, r4, r3)
        L_0x024c:
            r8.a((java.lang.CharSequence) r0)
            com.ss.android.ugc.aweme.views.MentionTextView r0 = r8.m
            com.ss.android.ugc.aweme.views.MentionTextView r1 = r8.m
            int r1 = r1.getCurrentTextColor()
            r0.setSpanColor(r1)
            android.widget.LinearLayout r0 = r8.n
            com.ss.android.ugc.aweme.utils.c.a(r0)
            r18.k()
            goto L_0x0381
        L_0x0264:
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r3 = l
            r4 = 0
            r5 = 43166(0xa89e, float:6.0488E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x0291
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r3 = l
            r4 = 0
            r5 = 43166(0xa89e, float:6.0488E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x02ae
        L_0x0291:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f3210b
            java.lang.String r0 = r0.getDesc()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02ad
            boolean r0 = com.ss.android.ugc.aweme.utils.ex.b()
            if (r0 != 0) goto L_0x02ad
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f3210b
            boolean r0 = com.ss.android.ugc.aweme.login.utils.a.a(r0)
            if (r0 != 0) goto L_0x02ad
            r0 = 1
            goto L_0x02ae
        L_0x02ad:
            r0 = 0
        L_0x02ae:
            if (r0 == 0) goto L_0x037a
            android.view.View r0 = r8.i
            r0.setVisibility(r10)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f3210b
            java.lang.String r11 = r0.getDesc()
            boolean r0 = r18.j()     // Catch:{ Exception -> 0x0362 }
            if (r0 == 0) goto L_0x0368
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f3210b     // Catch:{ Exception -> 0x0362 }
            java.lang.String r0 = r0.getDesc()     // Catch:{ Exception -> 0x0362 }
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0362 }
            r1[r10] = r0     // Catch:{ Exception -> 0x0362 }
            com.meituan.robust.ChangeQuickRedirect r3 = l     // Catch:{ Exception -> 0x0362 }
            r4 = 0
            r5 = 43183(0xa8af, float:6.0512E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x0362 }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r10] = r2     // Catch:{ Exception -> 0x0362 }
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r2 = r18
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0362 }
            if (r1 == 0) goto L_0x02fc
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0362 }
            r1[r10] = r0     // Catch:{ Exception -> 0x0362 }
            com.meituan.robust.ChangeQuickRedirect r3 = l     // Catch:{ Exception -> 0x0362 }
            r4 = 0
            r5 = 43183(0xa8af, float:6.0512E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x0362 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r10] = r0     // Catch:{ Exception -> 0x0362 }
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r2 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0362 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0362 }
            goto L_0x0345
        L_0x02fc:
            if (r0 == 0) goto L_0x0345
            int r1 = r0.length()     // Catch:{ Exception -> 0x0362 }
            int r2 = r18.l()     // Catch:{ Exception -> 0x0362 }
            java.lang.String r3 = i()     // Catch:{ Exception -> 0x0362 }
            int r3 = r3.length()     // Catch:{ Exception -> 0x0362 }
            int r2 = r2 - r3
            if (r1 > r2) goto L_0x0312
            goto L_0x0345
        L_0x0312:
            int r0 = r18.l()     // Catch:{ Exception -> 0x0362 }
            java.lang.String r1 = i()     // Catch:{ Exception -> 0x0362 }
            int r1 = r1.length()     // Catch:{ Exception -> 0x0362 }
            int r0 = r0 - r1
            java.lang.String r1 = r18.f()     // Catch:{ Exception -> 0x0362 }
            int r1 = r1.length()     // Catch:{ Exception -> 0x0362 }
            int r0 = r0 - r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0362 }
            r1.<init>()     // Catch:{ Exception -> 0x0362 }
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r8.f3210b     // Catch:{ Exception -> 0x0362 }
            java.lang.String r2 = r2.getDesc()     // Catch:{ Exception -> 0x0362 }
            java.lang.String r0 = r2.substring(r10, r0)     // Catch:{ Exception -> 0x0362 }
            r1.append(r0)     // Catch:{ Exception -> 0x0362 }
            java.lang.String r0 = r18.f()     // Catch:{ Exception -> 0x0362 }
            r1.append(r0)     // Catch:{ Exception -> 0x0362 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0362 }
        L_0x0345:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0362 }
            r1.<init>()     // Catch:{ Exception -> 0x0362 }
            r1.append(r0)     // Catch:{ Exception -> 0x0362 }
            java.lang.String r2 = i()     // Catch:{ Exception -> 0x0362 }
            r1.append(r2)     // Catch:{ Exception -> 0x0362 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0362 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x0362 }
            java.lang.CharSequence r0 = r8.a((java.lang.CharSequence) r1, (int) r0)     // Catch:{ Exception -> 0x0362 }
            r11 = r0
            goto L_0x0368
        L_0x0362:
            r0 = move-exception
            java.lang.String r1 = "init ad label"
            com.ss.android.ugc.aweme.framework.a.a.a((java.lang.String) r1, (java.lang.Exception) r0)
        L_0x0368:
            r8.a((java.lang.CharSequence) r11)
            com.ss.android.ugc.aweme.views.MentionTextView r0 = r8.m
            com.ss.android.ugc.aweme.views.MentionTextView r1 = r8.m
            int r1 = r1.getCurrentTextColor()
            r0.setSpanColor(r1)
            r18.k()
            goto L_0x0381
        L_0x037a:
            android.view.View r0 = r8.i
            r1 = 8
            r0.setVisibility(r1)
        L_0x0381:
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r3 = l
            r4 = 0
            r5 = 43167(0xa89f, float:6.049E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x03ae
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r3 = l
            r4 = 0
            r5 = 43167(0xa89f, float:6.049E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x03b4
        L_0x03ae:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f3210b
            boolean r0 = com.ss.android.ugc.aweme.longvideo.b.b.a(r0)
        L_0x03b4:
            if (r0 == 0) goto L_0x042e
            android.view.View r0 = r8.i
            r0.setVisibility(r10)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f3210b
            java.lang.String r0 = r0.getDesc()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x03ce
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f3210b
            java.lang.String r1 = ""
            r0.setDesc(r1)
        L_0x03ce:
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            com.ss.android.ugc.aweme.views.MentionTextView r1 = r8.m
            java.lang.CharSequence r1 = r1.getText()
            if (r1 == 0) goto L_0x0408
            com.ss.android.ugc.aweme.views.MentionTextView r1 = r8.m
            java.lang.CharSequence r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.trim()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x03f0
            goto L_0x0408
        L_0x03f0:
            com.ss.android.ugc.aweme.views.MentionTextView r1 = r8.m
            java.lang.CharSequence r1 = r1.getText()
            r0.append(r1)
            android.content.Context r1 = r8.h
            java.lang.String r2 = ""
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r8.f3210b
            java.lang.String r4 = r8.f3211c
            int r5 = r8.f3214f
            android.text.SpannableString r1 = com.ss.android.ugc.aweme.longvideo.b.b.a((android.content.Context) r1, (java.lang.String) r2, (com.ss.android.ugc.aweme.feed.model.Aweme) r3, (java.lang.String) r4, (int) r5)
            goto L_0x041a
        L_0x0408:
            android.content.Context r1 = r8.h
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r8.f3210b
            java.lang.String r2 = r2.getDesc()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r8.f3210b
            java.lang.String r4 = r8.f3211c
            int r5 = r8.f3214f
            android.text.SpannableString r1 = com.ss.android.ugc.aweme.longvideo.b.b.a((android.content.Context) r1, (java.lang.String) r2, (com.ss.android.ugc.aweme.feed.model.Aweme) r3, (java.lang.String) r4, (int) r5)
        L_0x041a:
            r0.append(r1)
            r8.a((java.lang.CharSequence) r0)
            com.ss.android.ugc.aweme.views.MentionTextView r0 = r8.m
            com.ss.android.ugc.aweme.views.MentionTextView r1 = r8.m
            int r1 = r1.getCurrentTextColor()
            r0.setSpanColor(r1)
            r18.k()
        L_0x042e:
            boolean r0 = com.ss.android.g.a.a()
            if (r0 == 0) goto L_0x045a
            com.ss.android.ugc.aweme.feed.ui.bh r0 = r8.r
            if (r0 != 0) goto L_0x044f
            com.ss.android.ugc.aweme.feed.ui.bh r0 = new com.ss.android.ugc.aweme.feed.ui.bh
            android.content.Context r1 = r8.h
            com.ss.android.ugc.aweme.translation.ui.TranslationStatusView r2 = r8.q
            com.ss.android.ugc.aweme.views.MentionTextView r3 = r8.m
            r0.<init>(r1, r2, r3)
            r8.r = r0
            com.ss.android.ugc.aweme.feed.ui.bh r0 = r8.r
            java.lang.String r1 = r8.f3211c
            int r2 = r8.f3214f
            r0.g = r1
            r0.h = r2
        L_0x044f:
            com.ss.android.ugc.aweme.feed.ui.bh r0 = r8.r
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.f3210b
            r0.a((com.ss.android.ugc.aweme.feed.model.Aweme) r1)
            com.ss.android.ugc.aweme.feed.ui.bh r0 = r8.r
            r0.j = r10
        L_0x045a:
            android.widget.LinearLayout r0 = r8.n
            com.ss.android.ugc.aweme.feed.ui.bk r1 = new com.ss.android.ugc.aweme.feed.ui.bk
            r1.<init>(r8)
            r0.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.bj.a(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(TextExtraStruct textExtraStruct) {
        if (!com.ss.android.g.a.a()) {
            b(textExtraStruct);
        } else if (textExtraStruct.isClickable()) {
            if (PatchProxy.isSupport(new Object[]{textExtraStruct}, this, l, false, 43171, new Class[]{TextExtraStruct.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textExtraStruct}, this, l, false, 43171, new Class[]{TextExtraStruct.class}, Void.TYPE);
            } else {
                if (textExtraStruct != null) {
                    if (textExtraStruct.getType() == 1) {
                        r.a(textExtraStruct);
                        Context context = this.h;
                        String aid = this.f3210b.getAid();
                        String hashTagName = textExtraStruct.getHashTagName();
                        String str = this.f3211c;
                        if (PatchProxy.isSupport(new Object[]{context, aid, hashTagName, (byte) 1, str}, null, ChallengeDetailActivity.f35486b, true, 26039, new Class[]{Context.class, String.class, String.class, Boolean.TYPE, String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{context, aid, hashTagName, (byte) 1, str}, null, ChallengeDetailActivity.f35486b, true, 26039, new Class[]{Context.class, String.class, String.class, Boolean.TYPE, String.class}, Void.TYPE);
                        } else {
                            ChallengeDetailActivity.a aVar = ChallengeDetailActivity.f35487c;
                            if (PatchProxy.isSupport(new Object[]{context, aid, hashTagName, (byte) 1, str}, aVar, ChallengeDetailActivity.a.f35489a, false, 26046, new Class[]{Context.class, String.class, String.class, Boolean.TYPE, String.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{context, aid, hashTagName, (byte) 1, str}, aVar, ChallengeDetailActivity.a.f35489a, false, 26046, new Class[]{Context.class, String.class, String.class, Boolean.TYPE, String.class}, Void.TYPE);
                            } else {
                                Intrinsics.checkParameterIsNotNull(context, "context");
                                Intrinsics.checkParameterIsNotNull(aid, "awemeId");
                                Intrinsics.checkParameterIsNotNull(hashTagName, "challengeId");
                                Intrinsics.checkParameterIsNotNull(str, "from");
                                Intent intent = new Intent(context, ChallengeDetailActivity.class);
                                intent.putExtra("aweme_id", aid);
                                intent.putExtra("id", hashTagName);
                                intent.putExtra("extra_challenge_is_hashtag", true);
                                intent.putExtra("extra_challenge_from", str);
                                context.startActivity(intent);
                            }
                        }
                        com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName(this.f3211c).setValue(this.f3210b.getAid()).setExtValueString(textExtraStruct.getCid()));
                        g.w(this.h, this.f3210b);
                        com.ss.android.ugc.aweme.u.r rVar = (com.ss.android.ugc.aweme.u.r) new com.ss.android.ugc.aweme.u.r().b(this.f3211c).a(this.h);
                        rVar.u = this.f3210b.getAuthor() != null ? this.f3210b.getAuthor().getUid() : "";
                        rVar.t = this.f3210b.getAid();
                        com.ss.android.ugc.aweme.u.r e2 = rVar.f(this.f3210b);
                        e2.v = (String) this.g.b("playlist_type", "");
                        e2.x = (String) this.g.b("playlist_id", "");
                        e2.w = (String) this.g.b("playlist_id_key", "");
                        ((com.ss.android.ugc.aweme.u.r) e2.e(textExtraStruct.getCid()).a("click_in_video_name")).f(aa.a(this.f3210b, this.f3214f)).e();
                        z.a(z.c.CHALLENGE);
                    } else if (!AbTestManager.a().ck() || textExtraStruct.getType() != 0 || TextUtils.isEmpty(textExtraStruct.getAwemeId()) || ((this.f3210b.getDesc().length() <= textExtraStruct.getStart() || this.f3210b.getDesc().charAt(textExtraStruct.getStart()) != '@') && (com.ss.android.ugc.aweme.translation.a.a().a(this.f3210b.getAid()).f74966a == null || com.ss.android.ugc.aweme.translation.a.a().a(this.f3210b.getAid()).f74966a.length() <= textExtraStruct.getStart() || com.ss.android.ugc.aweme.translation.a.a().a(this.f3210b.getAid()).f74966a.charAt(textExtraStruct.getStart()) != '@'))) {
                        com.ss.android.ugc.aweme.common.r.a(this.h, "name", "video_at", this.f3210b.getAid(), textExtraStruct.getUserId());
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("group_id", "");
                            jSONObject.put("request_id", this.f3212d.get("request_id"));
                            jSONObject.put("enter_from", this.f3211c);
                            jSONObject.put("enter_method", "click_head");
                        } catch (Exception unused) {
                        }
                        if (this.f3210b.getAuthor() != null) {
                            com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(this.f3210b.getAuthor().getUid()).setJsonObject(jSONObject));
                            com.ss.android.ugc.aweme.common.r.a("enter_personal_detail", (Map) d.a().a("enter_from", this.f3211c).a("to_user_id", textExtraStruct.getUserId()).a("group_id", this.f3210b.getAid()).a("author_id", this.f3210b.getAuthorUid()).a("enter_method", "video_at").f34114b);
                        }
                        h.a().a((Activity) this.h, j.a("aweme://user/profile/" + textExtraStruct.getUserId()).a("sec_user_id", textExtraStruct.getSecUid()).a("profile_from", "video_at").a("enter_from", this.f3211c).a("video_id", this.f3210b.getAid()).a());
                    } else {
                        com.ss.android.ugc.aweme.common.r.a("click_duet_icon", (Map) d.a().a("enter_from", this.f3211c).a("group_id", this.f3210b.getAid()).a("author_id", this.f3210b.getAuthorUid()).a("to_group_id", textExtraStruct.getAwemeId()).f34114b);
                        if (!NetworkUtils.isNetworkAvailable(this.h)) {
                            com.bytedance.ies.dmt.ui.d.a.b(this.h, (int) C0906R.string.bgf).a();
                        } else {
                            DetailActivity.a(this.h, textExtraStruct.getAwemeId(), this.f3211c);
                        }
                    }
                }
            }
        }
    }

    public final void a(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (PatchProxy.isSupport(new Object[]{charSequence2}, this, l, false, 43181, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence2}, this, l, false, 43181, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        try {
            this.m.setText(charSequence2);
        } catch (Exception unused) {
        }
    }

    public final String f() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43174, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, l, false, 43174, new Class[0], String.class);
        } else if (g()) {
            return this.h.getString(C0906R.string.drq);
        } else {
            return "...";
        }
    }

    public final int h() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43180, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, l, false, 43180, new Class[0], Integer.TYPE)).intValue();
        } else if (c.t(this.f3210b)) {
            return 4;
        } else {
            return PulishTitle.MAX_LINES;
        }
    }

    private int l() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43179, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, l, false, 43179, new Class[0], Integer.TYPE)).intValue();
        } else if (!g() && !c.t(this.f3210b)) {
            return PulishTitle.MAX_WORDS;
        } else {
            return 100;
        }
    }

    public final boolean g() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43175, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, l, false, 43175, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.g.a.a() || !AbTestManager.a().cf() || c.t(this.f3210b)) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean j() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43184, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, l, false, 43184, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f3210b.isAd() && this.f3210b.getAwemeRawAd().getLabel() != null && this.f3210b.getAwemeRawAd().isRightStyle()) {
            z = true;
        }
        return z;
    }

    private void k() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43168, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 43168, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT < 21) {
            this.n.post(new bl(this));
        }
        if (this.f3210b.getTextExtra() != null && this.f3210b.getTextExtra().size() > 0) {
            for (TextExtraStruct next : this.f3210b.getTextExtra()) {
                if (next != null) {
                    if (next.getStart() < 0) {
                        next.setStart(0);
                    }
                    if (next.getEnd() > this.f3210b.getDesc().length()) {
                        next.setEnd(this.f3210b.getDesc().length());
                    }
                }
            }
        }
        if (this.h != null) {
            this.m.setMaxSize(l());
            this.m.setSpanSize((float) u.c(15.0d));
            this.m.setSpanColor(this.m.getCurrentTextColor());
            this.m.setSpanStyle(1);
            this.m.setOnSpanClickListener(new bm(this));
            MentionTextView mentionTextView = this.m;
            List<TextExtraStruct> textExtra = this.f3210b.getTextExtra();
            AbTestManager.a();
            mentionTextView.a(textExtra, (MentionTextView.d) new f(true));
            if (AbTestManager.a().ck() && this.f3210b.getTextExtra() != null) {
                Iterator<TextExtraStruct> it2 = this.f3210b.getTextExtra().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        TextExtraStruct next2 = it2.next();
                        if (next2.getType() == 0 && !TextUtils.isEmpty(next2.getAwemeId()) && this.f3210b.getDesc().charAt(next2.getStart()) == '@') {
                            com.ss.android.ugc.aweme.commercialize.ad.e eVar = new com.ss.android.ugc.aweme.commercialize.ad.e(this.h, (float) Math.round(((float) UIUtils.getScreenWidth(this.h)) - (UIUtils.dip2Px(this.h, 100.0f) + this.h.getResources().getDimension(C0906R.dimen.rd))), this.h.getResources().getColor(C0906R.color.hj), -1, next2);
                            eVar.f38475c = UIUtils.dip2Px(this.h, 12.0f);
                            eVar.f38476d = UIUtils.dip2Px(this.h, 2.0f);
                            eVar.f38474b = UIUtils.dip2Px(this.h, 13.0f);
                            this.m.a(next2.getStart(), next2.getEnd(), eVar);
                            break;
                        }
                    }
                }
            }
            try {
                if (com.ss.android.g.a.a()) {
                    this.m.setMovementMethod(LinkMovementMethod.getInstance());
                } else {
                    this.m.setMovementMethod(com.ss.android.ugc.aweme.feed.widget.c.a());
                }
            } catch (IndexOutOfBoundsException e2) {
                com.ss.android.ugc.aweme.framework.a.a.a((Exception) e2);
            }
            this.m.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f46611a;

                /* JADX WARNING: Removed duplicated region for block: B:58:0x024e  */
                /* JADX WARNING: Removed duplicated region for block: B:61:0x026e  */
                /* JADX WARNING: Removed duplicated region for block: B:64:0x027d  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onGlobalLayout() {
                    /*
                        r10 = this;
                        r0 = 0
                        java.lang.Object[] r1 = new java.lang.Object[r0]
                        com.meituan.robust.ChangeQuickRedirect r3 = f46611a
                        java.lang.Class[] r6 = new java.lang.Class[r0]
                        java.lang.Class r7 = java.lang.Void.TYPE
                        r4 = 0
                        r5 = 43188(0xa8b4, float:6.0519E-41)
                        r2 = r10
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                        if (r1 == 0) goto L_0x0025
                        java.lang.Object[] r2 = new java.lang.Object[r0]
                        com.meituan.robust.ChangeQuickRedirect r4 = f46611a
                        r5 = 0
                        r6 = 43188(0xa8b4, float:6.0519E-41)
                        java.lang.Class[] r7 = new java.lang.Class[r0]
                        java.lang.Class r8 = java.lang.Void.TYPE
                        r3 = r10
                        com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                        return
                    L_0x0025:
                        com.ss.android.ugc.aweme.feed.ui.bj r1 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        int r1 = r1.h()
                        com.ss.android.ugc.aweme.feed.ui.bj r2 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        com.ss.android.ugc.aweme.views.MentionTextView r2 = r2.m
                        android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
                        r2.removeOnGlobalLayoutListener(r10)
                        com.ss.android.ugc.aweme.feed.ui.bj r2 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        java.lang.String r2 = r2.f()
                        com.ss.android.ugc.aweme.feed.ui.bj r3 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        boolean r3 = r3.j()
                        if (r3 == 0) goto L_0x0057
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder
                        r3.<init>()
                        r3.append(r2)
                        java.lang.String r2 = com.ss.android.ugc.aweme.feed.ui.bj.i()
                        r3.append(r2)
                        java.lang.String r2 = r3.toString()
                    L_0x0057:
                        int r3 = r2.length()
                        int r4 = r3 + 1
                        com.ss.android.ugc.aweme.feed.ui.bj r5 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        com.ss.android.ugc.aweme.feed.model.Aweme r5 = r5.f3210b
                        boolean r5 = com.ss.android.ugc.aweme.longvideo.b.b.a(r5)
                        r6 = 3
                        if (r5 == 0) goto L_0x01d9
                        com.ss.android.ugc.aweme.feed.ui.bj r5 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        com.ss.android.ugc.aweme.views.MentionTextView r5 = r5.m
                        int r5 = r5.getLineCount()
                        r7 = 4
                        if (r5 <= r1) goto L_0x018b
                        com.ss.android.ugc.aweme.feed.ui.bj r5 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        android.content.Context r5 = r5.h
                        r6 = 2131564586(0x7f0d182a, float:1.8754661E38)
                        java.lang.String r5 = r5.getString(r6)
                        com.ss.android.ugc.aweme.feed.ui.bj r6 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        com.ss.android.ugc.aweme.views.MentionTextView r6 = r6.m
                        java.lang.CharSequence r6 = r6.getText()
                        boolean r8 = r6 instanceof android.text.SpannableString
                        if (r8 == 0) goto L_0x018a
                        com.ss.android.ugc.aweme.feed.ui.bj r8 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        boolean r8 = r8.g()
                        if (r8 == 0) goto L_0x00a5
                        com.ss.android.ugc.aweme.feed.ui.bj r3 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        com.ss.android.ugc.aweme.views.MentionTextView r3 = r3.m
                        android.text.Layout r3 = r3.getLayout()
                        int r1 = r1 + -2
                        int r1 = r3.getLineEnd(r1)
                        java.lang.CharSequence r0 = r6.subSequence(r0, r1)
                        goto L_0x00e0
                    L_0x00a5:
                        com.ss.android.ugc.aweme.feed.ui.bj r8 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        com.ss.android.ugc.aweme.views.MentionTextView r8 = r8.m
                        android.text.Layout r8 = r8.getLayout()
                        int r1 = r1 + -1
                        int r1 = r8.getLineEnd(r1)
                        if (r1 < r4) goto L_0x00d6
                        int r8 = r1 - r4
                        int r9 = r8 + 2
                        java.lang.CharSequence r8 = r6.subSequence(r8, r9)
                        java.lang.String r8 = r8.toString()
                        boolean r9 = com.ss.android.g.a.a()
                        boolean r8 = com.ss.android.ugc.aweme.video.hashtag.d.b((java.lang.String) r8, (boolean) r9)
                        if (r8 == 0) goto L_0x00d6
                        int r4 = r4 + r7
                        int r1 = r1 - r4
                        int r1 = java.lang.Math.max(r0, r1)
                        java.lang.CharSequence r0 = r6.subSequence(r0, r1)
                        goto L_0x00e0
                    L_0x00d6:
                        int r3 = r3 + r7
                        int r1 = r1 - r3
                        int r1 = java.lang.Math.max(r0, r1)
                        java.lang.CharSequence r0 = r6.subSequence(r0, r1)
                    L_0x00e0:
                        android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
                        r1.<init>(r0)
                        java.lang.String r3 = r0.toString()
                        java.lang.String r4 = " [r]"
                        boolean r3 = r3.contains(r4)
                        if (r3 != 0) goto L_0x0156
                        com.ss.android.ugc.aweme.feed.ui.bj r3 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        boolean r3 = r3.g()
                        if (r3 == 0) goto L_0x0138
                        java.lang.String r3 = " [r]"
                        r1.append(r3)
                        com.ss.android.ugc.aweme.feed.ui.bj r3 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        android.content.Context r3 = r3.h
                        com.ss.android.ugc.aweme.feed.ui.bj r4 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        com.ss.android.ugc.aweme.feed.model.Aweme r4 = r4.f3210b
                        com.ss.android.ugc.aweme.feed.ui.bj r7 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        java.lang.String r7 = r7.f3211c
                        com.ss.android.ugc.aweme.feed.ui.bj r8 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        int r8 = r8.f3214f
                        android.text.SpannableStringBuilder r1 = com.ss.android.ugc.aweme.longvideo.b.b.a((android.content.Context) r3, (com.ss.android.ugc.aweme.feed.model.Aweme) r4, (java.lang.String) r7, (int) r8, (android.text.SpannableStringBuilder) r1)
                        android.text.SpannableStringBuilder r1 = r1.append(r2)
                        com.ss.android.ugc.aweme.feed.ui.bj r2 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        android.content.Context r2 = r2.h
                        com.ss.android.ugc.aweme.feed.ui.bj r3 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.f3210b
                        com.ss.android.ugc.aweme.feed.ui.bj r4 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        java.lang.String r4 = r4.f3211c
                        com.ss.android.ugc.aweme.feed.ui.bj r7 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        int r7 = r7.f3214f
                        android.text.SpannableStringBuilder r6 = android.text.SpannableStringBuilder.valueOf(r6)
                        android.text.SpannableStringBuilder r2 = com.ss.android.ugc.aweme.longvideo.b.b.a((android.content.Context) r2, (com.ss.android.ugc.aweme.feed.model.Aweme) r3, (java.lang.String) r4, (int) r7, (android.text.SpannableStringBuilder) r6)
                        android.text.SpannableStringBuilder r2 = r2.append(r5)
                        com.ss.android.ugc.aweme.feed.ui.bj r3 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        r3.a((android.text.SpannableStringBuilder) r1, (android.text.SpannableStringBuilder) r2)
                        goto L_0x0159
                    L_0x0138:
                        android.text.SpannableStringBuilder r2 = r1.append(r2)
                        java.lang.String r3 = " [r]"
                        r2.append(r3)
                        com.ss.android.ugc.aweme.feed.ui.bj r2 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        android.content.Context r2 = r2.h
                        com.ss.android.ugc.aweme.feed.ui.bj r3 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.f3210b
                        com.ss.android.ugc.aweme.feed.ui.bj r4 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        java.lang.String r4 = r4.f3211c
                        com.ss.android.ugc.aweme.feed.ui.bj r5 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        int r5 = r5.f3214f
                        android.text.SpannableStringBuilder r1 = com.ss.android.ugc.aweme.longvideo.b.b.a((android.content.Context) r2, (com.ss.android.ugc.aweme.feed.model.Aweme) r3, (java.lang.String) r4, (int) r5, (android.text.SpannableStringBuilder) r1)
                        goto L_0x0159
                    L_0x0156:
                        r1.append(r2)
                    L_0x0159:
                        com.ss.android.ugc.aweme.feed.ui.bj r2 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        boolean r2 = r2.j()
                        if (r2 == 0) goto L_0x0176
                        com.ss.android.ugc.aweme.feed.ui.bj r2 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        int r0 = r0.length()
                        com.ss.android.ugc.aweme.feed.ui.bj r3 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        java.lang.String r3 = r3.f()
                        int r3 = r3.length()
                        int r0 = r0 + r3
                        java.lang.CharSequence r1 = r2.a((java.lang.CharSequence) r1, (int) r0)
                    L_0x0176:
                        com.ss.android.ugc.aweme.feed.ui.bj r0 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        r0.a((java.lang.CharSequence) r1)
                        com.ss.android.ugc.aweme.feed.ui.bj r0 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        com.ss.android.ugc.aweme.views.MentionTextView r0 = r0.m
                        com.ss.android.ugc.aweme.feed.ui.bj r1 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        com.ss.android.ugc.aweme.views.MentionTextView r1 = r1.m
                        int r1 = r1.getCurrentTextColor()
                        r0.setSpanColor(r1)
                    L_0x018a:
                        return
                    L_0x018b:
                        boolean r0 = com.ss.android.g.a.a()
                        if (r0 != 0) goto L_0x01d8
                        com.ss.android.ugc.aweme.feed.ui.bj r0 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        com.ss.android.ugc.aweme.views.MentionTextView r0 = r0.m
                        int r0 = r0.getLineCount()
                        if (r0 != r7) goto L_0x01d8
                        com.ss.android.ugc.aweme.feed.ui.bj r1 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        com.ss.android.ugc.aweme.views.MentionTextView r1 = r1.m
                        java.lang.CharSequence r1 = r1.getText()
                        com.ss.android.ugc.aweme.feed.ui.bj r2 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        com.ss.android.ugc.aweme.views.MentionTextView r2 = r2.m
                        android.text.Layout r2 = r2.getLayout()
                        int r0 = r0 + -1
                        int r0 = r2.getLineStart(r0)
                        com.ss.android.ugc.aweme.feed.ui.bj r2 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        com.ss.android.ugc.aweme.views.MentionTextView r2 = r2.m
                        java.lang.CharSequence r2 = r2.getText()
                        int r2 = r2.length()
                        java.lang.CharSequence r0 = r1.subSequence(r0, r2)
                        java.lang.String r1 = "[r]"
                        boolean r1 = android.text.TextUtils.equals(r1, r0)
                        if (r1 != 0) goto L_0x01d8
                        java.lang.String r1 = "[r]"
                        boolean r0 = r1.contains(r0)
                        if (r0 == 0) goto L_0x01d8
                        com.ss.android.ugc.aweme.feed.ui.bj r0 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        com.ss.android.ugc.aweme.views.MentionTextView r0 = r0.m
                        r0.setMaxLines(r6)
                    L_0x01d8:
                        return
                    L_0x01d9:
                        com.ss.android.ugc.aweme.feed.ui.bj r5 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        com.ss.android.ugc.aweme.views.MentionTextView r5 = r5.m
                        int r5 = r5.getLineCount()
                        if (r5 <= r1) goto L_0x02a4
                        com.ss.android.ugc.aweme.feed.ui.bj r1 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        android.content.Context r1 = r1.h
                        r5 = 2131564585(0x7f0d1829, float:1.875466E38)
                        java.lang.String r1 = r1.getString(r5)
                        com.ss.android.ugc.aweme.feed.ui.bj r5 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        com.ss.android.ugc.aweme.views.MentionTextView r5 = r5.m
                        android.text.Layout r5 = r5.getLayout()
                        int r5 = r5.getLineEnd(r6)
                        com.ss.android.ugc.aweme.feed.ui.bj r6 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        com.ss.android.ugc.aweme.views.MentionTextView r6 = r6.m
                        java.lang.CharSequence r6 = r6.getText()
                        boolean r7 = r6 instanceof android.text.SpannableString
                        if (r7 == 0) goto L_0x02a4
                        if (r5 < r4) goto L_0x0227
                        int r4 = r5 - r4
                        int r7 = r4 + 2
                        java.lang.CharSequence r7 = r6.subSequence(r4, r7)
                        java.lang.String r7 = r7.toString()
                        boolean r8 = com.ss.android.g.a.a()
                        boolean r7 = com.ss.android.ugc.aweme.video.hashtag.d.b((java.lang.String) r7, (boolean) r8)
                        if (r7 == 0) goto L_0x0227
                        int r3 = java.lang.Math.max(r0, r4)
                        java.lang.CharSequence r0 = r6.subSequence(r0, r3)
                        goto L_0x023e
                    L_0x0227:
                        com.ss.android.ugc.aweme.feed.ui.bj r4 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        boolean r4 = r4.g()
                        if (r4 == 0) goto L_0x0235
                        com.ss.android.ugc.aweme.feed.ui.bj r4 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        int r3 = r4.a(r6, r2, r3, r5)
                    L_0x0235:
                        int r5 = r5 - r3
                        int r3 = java.lang.Math.max(r0, r5)
                        java.lang.CharSequence r0 = r6.subSequence(r0, r3)
                    L_0x023e:
                        android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
                        r3.<init>(r0)
                        r3.append(r2)
                        com.ss.android.ugc.aweme.feed.ui.bj r0 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        boolean r0 = r0.g()
                        if (r0 == 0) goto L_0x0260
                        android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
                        android.text.SpannableString r2 = android.text.SpannableString.valueOf(r6)
                        r0.<init>(r2)
                        android.text.SpannableStringBuilder r0 = r0.append(r1)
                        com.ss.android.ugc.aweme.feed.ui.bj r1 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        r1.a((android.text.SpannableStringBuilder) r3, (android.text.SpannableStringBuilder) r0)
                    L_0x0260:
                        com.ss.android.ugc.aweme.feed.ui.bj r0 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.f3210b
                        java.lang.String r0 = r0.getDesc()
                        boolean r0 = android.text.TextUtils.equals(r6, r0)
                        if (r0 == 0) goto L_0x0275
                        com.ss.android.ugc.aweme.feed.ui.bj r0 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.f3210b
                        r0.setEllipsizeDesc(r3)
                    L_0x0275:
                        com.ss.android.ugc.aweme.feed.ui.bj r0 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        boolean r0 = r0.j()
                        if (r0 == 0) goto L_0x0290
                        com.ss.android.ugc.aweme.feed.ui.bj r0 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        int r1 = r3.length()
                        java.lang.String r2 = com.ss.android.ugc.aweme.feed.ui.bj.i()
                        int r2 = r2.length()
                        int r1 = r1 - r2
                        java.lang.CharSequence r3 = r0.a((java.lang.CharSequence) r3, (int) r1)
                    L_0x0290:
                        com.ss.android.ugc.aweme.feed.ui.bj r0 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        r0.a((java.lang.CharSequence) r3)
                        com.ss.android.ugc.aweme.feed.ui.bj r0 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        com.ss.android.ugc.aweme.views.MentionTextView r0 = r0.m
                        com.ss.android.ugc.aweme.feed.ui.bj r1 = com.ss.android.ugc.aweme.feed.ui.bj.this
                        com.ss.android.ugc.aweme.views.MentionTextView r1 = r1.m
                        int r1 = r1.getCurrentTextColor()
                        r0.setSpanColor(r1)
                    L_0x02a4:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.bj.AnonymousClass1.onGlobalLayout():void");
                }
            });
        }
    }

    public bj(View view) {
        super(view);
    }

    public final void a(DataCenter dataCenter) {
        if (PatchProxy.isSupport(new Object[]{dataCenter}, this, l, false, 43164, new Class[]{DataCenter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dataCenter}, this, l, false, 43164, new Class[]{DataCenter.class}, Void.TYPE);
            return;
        }
        if (dataCenter != null) {
            dataCenter.a("on_page_selected", (Observer<a>) this);
            dataCenter.a("on_page_unselected", (Observer<a>) this);
        }
    }

    public final void b(VideoItemParams videoItemParams) {
        if (PatchProxy.isSupport(new Object[]{videoItemParams}, this, l, false, 43163, new Class[]{VideoItemParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoItemParams}, this, l, false, 43163, new Class[]{VideoItemParams.class}, Void.TYPE);
            return;
        }
        super.b(videoItemParams);
        if (videoItemParams != null) {
            this.p = videoItemParams.mAdOpenCallBack;
            this.o = videoItemParams.mAdViewController;
        }
    }

    public final /* synthetic */ void onChanged(@Nullable Object obj) {
        a aVar = (a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, l, false, 43173, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, l, false, 43173, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (aVar != null) {
            String str = aVar.f34376a;
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 350216171) {
                if (hashCode == 1628582276 && str.equals("on_page_unselected")) {
                    c2 = 1;
                }
            } else if (str.equals("on_page_selected")) {
                c2 = 0;
            }
            switch (c2) {
                case 0:
                    if (this.r != null) {
                        this.r.j = true;
                        if (this.f3210b != null && this.r.i == 2) {
                            com.ss.android.ugc.aweme.common.r.a("see_original_show", (Map) d.a().a("enter_from", this.f3211c).a("group_id", this.f3210b.getAid()).f34114b);
                        } else if (this.f3210b != null && this.r.i == 0) {
                            com.ss.android.ugc.aweme.common.r.a("see_translation_show", (Map) d.a().a("enter_from", this.f3211c).a("group_id", this.f3210b.getAid()).f34114b);
                        }
                    }
                    this.t = true;
                    if (this.s) {
                        com.ss.android.ugc.aweme.common.r.a("video_title", (Map) a("show"));
                        return;
                    }
                    break;
                case 1:
                    if (this.r != null) {
                        this.r.j = false;
                    }
                    this.t = false;
                    break;
            }
        }
    }

    private void b(TextExtraStruct textExtraStruct) {
        if (PatchProxy.isSupport(new Object[]{textExtraStruct}, this, l, false, 43170, new Class[]{TextExtraStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textExtraStruct}, this, l, false, 43170, new Class[]{TextExtraStruct.class}, Void.TYPE);
            return;
        }
        if (textExtraStruct != null) {
            if (textExtraStruct.getType() == 1) {
                r.a(textExtraStruct);
                ChallengeDetailActivity.a(this.h, this.f3210b.getAid(), textExtraStruct.getHashTagName(), this.f3211c, 0, true);
                if (this.g != null) {
                    this.g.a("feed_internal_event", (Object) new ar(34, this.f3210b));
                }
                com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName(this.f3211c).setValue(this.f3210b.getAid()).setExtValueString(textExtraStruct.getCid()));
                g.w(this.h, this.f3210b);
                AbTestManager.a();
                ((com.ss.android.ugc.aweme.u.r) new com.ss.android.ugc.aweme.u.r().b(this.f3211c).f(this.f3210b).e(textExtraStruct.getCid()).a("click_in_video_name")).f(aa.a(this.f3210b, this.f3214f)).e();
                return;
            }
            com.ss.android.ugc.aweme.common.r.a(this.h, "name", "video_at", this.f3210b.getAid(), textExtraStruct.getUserId());
            com.ss.android.ugc.aweme.common.r.a("enter_personal_detail", (Map) d.a().a("enter_from", this.f3211c).a("to_user_id", textExtraStruct.getUserId()).a("group_id", this.f3210b.getAid()).a("author_id", this.f3210b.getAuthorUid()).a("enter_method", "video_at").f34114b);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("group_id", "");
                jSONObject.put("request_id", this.f3212d.get("request_id"));
                jSONObject.put("enter_from", this.f3211c);
                jSONObject.put("enter_method", "click_head");
                jSONObject.put("enter_type", "normal_way");
            } catch (Exception unused) {
            }
            if (this.f3210b.getAuthor() != null) {
                com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(this.f3210b.getAuthor().getUid()).setJsonObject(jSONObject));
                new p().e(this.f3210b).c("personal_homepage").b(this.f3210b.getAuthorUid()).e(this.f3211c).e();
            }
            h.a().a((Activity) this.h, j.a("aweme://user/profile/" + textExtraStruct.getUserId()).a("sec_user_id", textExtraStruct.getSecUid()).a("profile_from", "video_at").a("video_id", this.f3210b.getAid()).a("enter_from", this.f3211c).a("profile_enterprise_type", this.f3210b.getEnterpriseType()).a());
        }
    }

    public final Map<String, String> a(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, this, l, false, 43176, new Class[]{String.class}, Map.class)) {
            return d.a().a("enter_from", this.f3211c).a("group_id", this.f3210b.getAid()).a("author_id", this.f3210b.getAuthorUid()).a("action_type", str).f34114b;
        }
        return (Map) PatchProxy.accessDispatch(new Object[]{str}, this, l, false, 43176, new Class[]{String.class}, Map.class);
    }

    public final CharSequence a(CharSequence charSequence, int i) {
        SpannableStringBuilder spannableStringBuilder;
        if (PatchProxy.isSupport(new Object[]{charSequence, Integer.valueOf(i)}, this, l, false, 43182, new Class[]{CharSequence.class, Integer.TYPE}, CharSequence.class)) {
            return (CharSequence) PatchProxy.accessDispatch(new Object[]{charSequence, Integer.valueOf(i)}, this, l, false, 43182, new Class[]{CharSequence.class, Integer.TYPE}, CharSequence.class);
        }
        int length = i().length() + i;
        if (charSequence == null || charSequence.length() < length || !charSequence.subSequence(i, length).toString().equals(i())) {
            return charSequence;
        }
        AwemeTextLabelModel label = this.f3210b.getAwemeRawAd().getLabel();
        if (label == null) {
            return charSequence;
        }
        if (charSequence instanceof SpannableStringBuilder) {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        com.ss.android.ugc.aweme.feed.widget.a aVar = new com.ss.android.ugc.aweme.feed.widget.a(this.h, label.getBgColor(), label.getLabelName(), label.getTextColor());
        aVar.f47033b = label.isAdHollowText();
        spannableStringBuilder.setSpan(aVar, i + 1, i().length() + i, 17);
        return spannableStringBuilder;
    }

    public final void a(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        if (PatchProxy.isSupport(new Object[]{spannableStringBuilder, spannableStringBuilder2}, this, l, false, 43177, new Class[]{SpannableStringBuilder.class, SpannableStringBuilder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{spannableStringBuilder, spannableStringBuilder2}, this, l, false, 43177, new Class[]{SpannableStringBuilder.class, SpannableStringBuilder.class}, Void.TYPE);
            return;
        }
        this.s = true;
        if (this.t) {
            com.ss.android.ugc.aweme.common.r.a("video_title", (Map) a("show"));
        }
        a(spannableStringBuilder, spannableStringBuilder2, true);
        a(spannableStringBuilder2, spannableStringBuilder, false);
    }

    private void a(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, boolean z) {
        SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
        final SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
        if (PatchProxy.isSupport(new Object[]{spannableStringBuilder3, spannableStringBuilder4, Byte.valueOf(z ? (byte) 1 : 0)}, this, l, false, 43178, new Class[]{SpannableStringBuilder.class, SpannableStringBuilder.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{spannableStringBuilder3, spannableStringBuilder4, Byte.valueOf(z)}, this, l, false, 43178, new Class[]{SpannableStringBuilder.class, SpannableStringBuilder.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        final boolean z2 = z;
        spannableStringBuilder3.setSpan(new ClickableSpan() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46613a;

            public final void onClick(@NonNull View view) {
                String str;
                int i;
                if (PatchProxy.isSupport(new Object[]{view}, this, f46613a, false, 43190, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f46613a, false, 43190, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                if (z2) {
                    str = "spread";
                } else {
                    str = "fold";
                }
                com.ss.android.ugc.aweme.common.r.a("video_title", (Map) bj.this.a(str));
                if (z2) {
                    i = 10;
                } else {
                    i = bj.this.h();
                }
                bj.this.m.setMaxLines(i);
                bj.this.a((CharSequence) spannableStringBuilder4);
            }

            public final void updateDrawState(@NonNull TextPaint textPaint) {
                TextPaint textPaint2 = textPaint;
                if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f46613a, false, 43189, new Class[]{TextPaint.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f46613a, false, 43189, new Class[]{TextPaint.class}, Void.TYPE);
                    return;
                }
                textPaint2.setColor(-1);
                textPaint2.setUnderlineText(false);
                textPaint2.setTypeface(Typeface.DEFAULT_BOLD);
            }
        }, spannableStringBuilder.length() - 2, spannableStringBuilder.length(), 33);
    }

    public final int a(CharSequence charSequence, String str, int i, int i2) {
        CharSequence charSequence2 = charSequence;
        String str2 = str;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{charSequence2, str2, Integer.valueOf(i), Integer.valueOf(i2)}, this, l, false, 43169, new Class[]{CharSequence.class, String.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{charSequence2, str2, Integer.valueOf(i), Integer.valueOf(i2)}, this, l, false, 43169, new Class[]{CharSequence.class, String.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        try {
            float measureText = this.m.getPaint().measureText(str2);
            int i4 = i;
            while (i4 >= 3) {
                if (this.m.getPaint().measureText(charSequence2, i3 - i4, i3) < measureText) {
                    return i4 + 1;
                }
                i4--;
            }
            return i4 + 1;
        } catch (Exception unused) {
            return i;
        }
    }
}

package com.ss.android.ugc.aweme.feed.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.longvideo.b.b;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.shortvideo.view.f;
import com.ss.android.ugc.aweme.translation.model.VideoTranslationCache;
import com.ss.android.ugc.aweme.translation.model.c;
import com.ss.android.ugc.aweme.translation.model.d;
import com.ss.android.ugc.aweme.translation.ui.TranslationStatusView;
import com.ss.android.ugc.aweme.translation.ui.a;
import com.ss.android.ugc.aweme.views.MentionTextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class bh implements TranslationStatusView.a, a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46593a;

    /* renamed from: b  reason: collision with root package name */
    public TranslationStatusView f46594b;

    /* renamed from: c  reason: collision with root package name */
    public MentionTextView f46595c;

    /* renamed from: d  reason: collision with root package name */
    public Aweme f46596d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.translation.a.a f46597e;

    /* renamed from: f  reason: collision with root package name */
    public Context f46598f;
    public String g;
    public int h;
    public int i = -1;
    public boolean j = false;
    private List<String> k = new ArrayList();

    public final void a(int i2) {
        this.i = i2;
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f46593a, false, 43157, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f46593a, false, 43157, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.api.a.a.a(this.f46598f, (Throwable) exc);
        this.f46594b.setStatus(0);
    }

    public final void a(d dVar) {
        String str;
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f46593a, false, 43156, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f46593a, false, 43156, new Class[]{d.class}, Void.TYPE);
            return;
        }
        this.f46594b.setStatus(2);
        if (this.j) {
            r.a("see_original_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", this.g).a("group_id", this.f46596d.getAid()).f34114b);
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        if (dVar.f74981a == null) {
            str = "";
        } else {
            str = dVar.f74981a;
        }
        sb.append(str);
        sb.append(" ");
        if (this.f46596d.getTextExtra() != null) {
            for (int i2 = 0; i2 < this.f46596d.getTextExtra().size(); i2++) {
                TextExtraStruct textExtraStruct = this.f46596d.getTextExtra().get(i2);
                String substring = this.f46596d.getDesc().substring(Math.min(Math.max(textExtraStruct.getStart(), 0), this.f46596d.getDesc().length()), Math.min(textExtraStruct.getEnd(), this.f46596d.getDesc().length()));
                TextExtraStruct clone = textExtraStruct.clone();
                clone.setStart(sb.length());
                clone.setEnd(clone.getStart() + substring.length());
                arrayList.add(clone);
                sb.append(substring);
                sb.append(" ");
            }
        }
        VideoTranslationCache videoTranslationCache = new VideoTranslationCache();
        videoTranslationCache.f74967b = 2;
        videoTranslationCache.f74966a = sb.toString();
        videoTranslationCache.f74968c = arrayList;
        com.ss.android.ugc.aweme.translation.a.a().a(this.f46596d.getAid(), videoTranslationCache);
        a(this.f46595c, videoTranslationCache.f74966a, videoTranslationCache.f74968c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.feed.model.Aweme r20) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f46593a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 43153(0xa891, float:6.047E-41)
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f46593a
            r3 = 0
            r4 = 43153(0xa891, float:6.047E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            r7.f46596d = r8
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            boolean r0 = r0.aN()
            r8 = 8
            if (r0 == 0) goto L_0x02eb
            boolean r0 = com.ss.android.ugc.aweme.utils.ex.b()
            if (r0 != 0) goto L_0x02eb
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f46596d
            boolean r0 = r0.isAd()
            if (r0 != 0) goto L_0x02eb
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f46596d
            java.lang.String r0 = r0.getAid()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0062
            goto L_0x02eb
        L_0x0062:
            com.ss.android.ugc.aweme.translation.ui.TranslationStatusView r0 = r7.f46594b
            r0.b()
            com.ss.android.ugc.aweme.translation.a r0 = com.ss.android.ugc.aweme.translation.a.a()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f46596d
            java.lang.String r1 = r1.getAid()
            com.ss.android.ugc.aweme.translation.model.VideoTranslationCache r11 = r0.a(r1)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.language.I18nManagerService> r1 = com.ss.android.ugc.aweme.language.I18nManagerService.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.language.I18nManagerService r0 = (com.ss.android.ugc.aweme.language.I18nManagerService) r0
            java.lang.String r12 = r0.getAppLanguage()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f46596d
            java.lang.String r0 = r0.getDescLanguage()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00a8
            java.lang.String r0 = "un"
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f46596d
            java.lang.String r1 = r1.getDescLanguage()
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x00a0
            goto L_0x00a8
        L_0x00a0:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f46596d
            java.lang.String r0 = r0.getDescLanguage()
        L_0x00a6:
            r13 = r0
            goto L_0x00be
        L_0x00a8:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f46596d
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = ""
            goto L_0x00a6
        L_0x00b3:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f46596d
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            java.lang.String r0 = r0.getLanguage()
            goto L_0x00a6
        L_0x00be:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f46596d
            java.lang.String r14 = r0.getDesc()
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r14
            com.meituan.robust.ChangeQuickRedirect r2 = f46593a
            r3 = 0
            r4 = 43154(0xa892, float:6.0472E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r10] = r1
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00fa
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r14
            com.meituan.robust.ChangeQuickRedirect r2 = f46593a
            r3 = 0
            r4 = 43154(0xa892, float:6.0472E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r10] = r1
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r1 = r19
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = (java.lang.String) r0
        L_0x00f8:
            r14 = r0
            goto L_0x015d
        L_0x00fa:
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 == 0) goto L_0x0103
            java.lang.String r0 = ""
            goto L_0x00f8
        L_0x0103:
            int r0 = r14.length()
            boolean[] r0 = new boolean[r0]
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f46596d
            java.util.List r1 = r1.getTextExtra()
            java.util.Iterator r1 = r1.iterator()
        L_0x0113:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x013a
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.aweme.model.TextExtraStruct r2 = (com.ss.android.ugc.aweme.model.TextExtraStruct) r2
            int r3 = r2.getStart()
            int r3 = java.lang.Math.max(r10, r3)
        L_0x0127:
            int r4 = r14.length()
            int r5 = r2.getEnd()
            int r4 = java.lang.Math.min(r4, r5)
            if (r3 >= r4) goto L_0x0113
            r0[r3] = r9
            int r3 = r3 + 1
            goto L_0x0127
        L_0x013a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
        L_0x0140:
            int r3 = r14.length()
            if (r2 >= r3) goto L_0x0154
            boolean r3 = r0[r2]
            if (r3 != 0) goto L_0x0151
            char r3 = r14.charAt(r2)
            r1.append(r3)
        L_0x0151:
            int r2 = r2 + 1
            goto L_0x0140
        L_0x0154:
            java.lang.String r0 = r1.toString()
            java.lang.String r0 = r0.trim()
            goto L_0x00f8
        L_0x015d:
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r0 = r0.getUserAddLanguages()
            java.lang.Object r0 = r0.c()
            java.lang.String r0 = (java.lang.String) r0
            java.util.List<java.lang.String> r1 = r7.k
            r1.clear()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0185
            java.util.List<java.lang.String> r1 = r7.k
            java.lang.String r2 = ","
            java.lang.String[] r0 = r0.split(r2)
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.addAll(r0)
        L_0x0185:
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            boolean r0 = r0.ck()
            if (r0 == 0) goto L_0x01bf
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f46596d
            java.util.List r0 = r0.getTextExtra()
            if (r0 == 0) goto L_0x01bf
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f46596d
            java.util.List r0 = r0.getTextExtra()
            java.util.Iterator r0 = r0.iterator()
        L_0x01a1:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01bf
            java.lang.Object r1 = r0.next()
            com.ss.android.ugc.aweme.model.TextExtraStruct r1 = (com.ss.android.ugc.aweme.model.TextExtraStruct) r1
            int r2 = r1.getType()
            if (r2 != 0) goto L_0x01a1
            java.lang.String r1 = r1.getAwemeId()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x01a1
            r0 = 1
            goto L_0x01c0
        L_0x01bf:
            r0 = 0
        L_0x01c0:
            r15 = -1
            if (r0 == 0) goto L_0x01cb
            r7.i = r15
            com.ss.android.ugc.aweme.translation.ui.TranslationStatusView r0 = r7.f46594b
            r0.setVisibility(r8)
            return
        L_0x01cb:
            r6 = 2
            if (r11 != 0) goto L_0x0267
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x025c
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x025c
            boolean r0 = android.text.TextUtils.equals(r12, r13)
            if (r0 != 0) goto L_0x025c
            java.util.List<java.lang.String> r5 = r7.k
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r10] = r13
            r0[r9] = r5
            com.meituan.robust.ChangeQuickRedirect r2 = f46593a
            r3 = 0
            r4 = 43152(0xa890, float:6.0469E-41)
            java.lang.Class[] r1 = new java.lang.Class[r6]
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r1[r10] = r16
            java.lang.Class<java.util.List> r16 = java.util.List.class
            r1[r9] = r16
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r17 = r1
            r1 = r19
            r8 = r5
            r5 = r17
            r15 = 2
            r6 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x022f
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r10] = r13
            r0[r9] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f46593a
            r3 = 0
            r4 = 43152(0xa890, float:6.0469E-41)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r10] = r1
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r19
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0233
        L_0x022f:
            boolean r0 = r8.contains(r13)
        L_0x0233:
            if (r0 != 0) goto L_0x025c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f46596d
            java.lang.String r0 = r0.getAuthorUid()
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
            java.lang.String r1 = r1.getCurUserId()
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x024a
            goto L_0x025c
        L_0x024a:
            com.ss.android.ugc.aweme.translation.ui.TranslationStatusView r0 = r7.f46594b
            r0.setVisibility(r10)
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            boolean r0 = r0.J()
            if (r0 != 0) goto L_0x0292
            r7.i = r10
            goto L_0x0292
        L_0x025c:
            r0 = -1
            r7.i = r0
            com.ss.android.ugc.aweme.translation.ui.TranslationStatusView r0 = r7.f46594b
            r1 = 8
            r0.setVisibility(r1)
            return
        L_0x0267:
            r15 = 2
            com.ss.android.ugc.aweme.translation.ui.TranslationStatusView r0 = r7.f46594b
            r0.setVisibility(r10)
            com.ss.android.ugc.aweme.translation.ui.TranslationStatusView r0 = r7.f46594b
            int r1 = r11.f74967b
            r0.setStatus(r1)
            int r0 = r11.f74967b
            r7.i = r0
            int r0 = r11.f74967b
            if (r0 != r15) goto L_0x0292
            com.ss.android.ugc.aweme.views.MentionTextView r0 = r7.f46595c
            java.lang.String r1 = r11.f74966a
            r0.setText(r1)
            com.ss.android.ugc.aweme.views.MentionTextView r0 = r7.f46595c
            java.util.List<com.ss.android.ugc.aweme.model.TextExtraStruct> r1 = r11.f74968c
            com.ss.android.ugc.aweme.shortvideo.view.f r2 = new com.ss.android.ugc.aweme.shortvideo.view.f
            com.ss.android.ugc.aweme.setting.AbTestManager.a()
            r2.<init>(r9)
            r0.a((java.util.List<com.ss.android.ugc.aweme.model.TextExtraStruct>) r1, (com.ss.android.ugc.aweme.views.MentionTextView.d) r2)
        L_0x0292:
            com.ss.android.ugc.aweme.translation.ui.TranslationStatusView r0 = r7.f46594b
            com.ss.android.ugc.aweme.feed.ui.bi r1 = new com.ss.android.ugc.aweme.feed.ui.bi
            r1.<init>(r7)
            r0.setmUploadMobListener(r1)
            com.ss.android.ugc.aweme.translation.ui.TranslationStatusView r0 = r7.f46594b
            com.ss.android.ugc.aweme.feed.ui.bh$1 r1 = new com.ss.android.ugc.aweme.feed.ui.bh$1
            r1.<init>(r14, r13, r12)
            r0.setOnTranslationViewClickListener(r1)
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            boolean r0 = r0.J()
            if (r0 == 0) goto L_0x02ea
            if (r11 != 0) goto L_0x02ea
            com.ss.android.ugc.aweme.translation.ui.TranslationStatusView r0 = r7.f46594b
            java.lang.Object[] r12 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.translation.ui.TranslationStatusView.f74982a
            r15 = 0
            r16 = 87299(0x15503, float:1.22332E-40)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L_0x02dc
            java.lang.Object[] r12 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.translation.ui.TranslationStatusView.f74982a
            r15 = 0
            r16 = 87299(0x15503, float:1.22332E-40)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x02dc:
            r0.setStatus(r9)
            com.ss.android.ugc.aweme.translation.ui.TranslationStatusView$b r1 = r0.f74985d
            if (r1 == 0) goto L_0x02ea
            com.ss.android.ugc.aweme.translation.ui.TranslationStatusView$b r1 = r0.f74985d
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r0.f74983b
            r1.a(r0, r9)
        L_0x02ea:
            return
        L_0x02eb:
            com.ss.android.ugc.aweme.translation.ui.TranslationStatusView r0 = r7.f46594b
            r1 = 8
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.bh.a(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public bh(Context context, TranslationStatusView translationStatusView, MentionTextView mentionTextView) {
        this.f46598f = context;
        this.f46597e = new com.ss.android.ugc.aweme.translation.a.a(new c(), this);
        this.f46594b = translationStatusView;
        this.f46595c = mentionTextView;
    }

    public final void a(MentionTextView mentionTextView, String str, List<TextExtraStruct> list) {
        final MentionTextView mentionTextView2 = mentionTextView;
        final String str2 = str;
        final List<TextExtraStruct> list2 = list;
        if (PatchProxy.isSupport(new Object[]{mentionTextView2, str2, list2}, this, f46593a, false, 43155, new Class[]{MentionTextView.class, String.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mentionTextView2, str2, list2}, this, f46593a, false, 43155, new Class[]{MentionTextView.class, String.class, List.class}, Void.TYPE);
            return;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(mentionTextView2, "alpha", new float[]{0.0f}).setDuration(150);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(mentionTextView2, "alpha", new float[]{0.0f, 1.0f}).setDuration(150);
        duration.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46604a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f46604a, false, 43161, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f46604a, false, 43161, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                if (b.a(bh.this.f46596d)) {
                    mentionTextView2.setText(b.a(bh.this.f46598f, str2, bh.this.f46596d, bh.this.g, bh.this.h));
                } else {
                    mentionTextView2.setText(str2);
                }
                MentionTextView mentionTextView = mentionTextView2;
                List list = list2;
                AbTestManager.a();
                mentionTextView.a(list, (MentionTextView.d) new f(true));
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{duration, duration2});
        animatorSet.start();
    }
}

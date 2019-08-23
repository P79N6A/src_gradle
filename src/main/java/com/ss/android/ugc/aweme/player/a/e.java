package com.ss.android.ugc.aweme.player.a;

import android.app.Activity;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder;
import com.ss.android.ugc.aweme.feed.c.j;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59086a;

    /* renamed from: b  reason: collision with root package name */
    public VideoUrlModel f59087b;

    /* renamed from: c  reason: collision with root package name */
    public IFeedViewHolder f59088c;

    /* renamed from: d  reason: collision with root package name */
    public String f59089d;

    /* renamed from: e  reason: collision with root package name */
    public j f59090e;

    /* renamed from: f  reason: collision with root package name */
    public BaseListFragmentPanel f59091f;
    public com.ss.android.ugc.aweme.video.b.b g;
    public int h;
    public Activity i;
    public Context j;
    public com.ss.android.ugc.aweme.video.f.a k;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public e f59092a = new e();
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f59093a;

        /* renamed from: b  reason: collision with root package name */
        public Long f59094b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: com.ss.android.ugc.aweme.player.a.e$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: com.ss.android.ugc.aweme.player.a.e$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: com.ss.android.ugc.aweme.player.a.e$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v200, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v86, resolved type: com.ss.android.ugc.aweme.player.a.e$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v90, resolved type: com.ss.android.ugc.aweme.player.a.e$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v205, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v209, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v96, resolved type: com.ss.android.ugc.aweme.player.a.e$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v98, resolved type: com.ss.android.ugc.aweme.player.a.e$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v99, resolved type: com.ss.android.ugc.aweme.player.a.e$b} */
    /* JADX WARNING: type inference failed for: r3v93, types: [java.lang.Long] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:229:0x0841 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r22 = this;
            r8 = r22
            r9 = 0
            java.lang.Object[] r1 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r3 = f59086a
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 64212(0xfad4, float:8.998E-41)
            r2 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x0029
            java.lang.Object[] r1 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r3 = f59086a
            r4 = 0
            r5 = 64212(0xfad4, float:8.998E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0029:
            android.content.Context r0 = r8.j
            if (r0 == 0) goto L_0x0860
            com.ss.android.ugc.aweme.video.b.b r0 = r8.g
            if (r0 == 0) goto L_0x0860
            com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder r0 = r8.f59088c
            if (r0 == 0) goto L_0x0860
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r0 = r8.f59087b
            if (r0 != 0) goto L_0x003b
            goto L_0x0860
        L_0x003b:
            com.ss.android.ugc.aweme.feed.a r0 = com.ss.android.ugc.aweme.feed.a.a()
            com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder r1 = r8.f59088c
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r1.d()
            int r2 = r8.h
            org.json.JSONObject r0 = r0.b((com.ss.android.ugc.aweme.feed.model.Aweme) r1, (int) r2)
            r10 = 3
            r11 = 2
            r12 = 1
            com.ss.android.ugc.aweme.feed.cache.a r1 = com.ss.android.ugc.aweme.feed.cache.a.f45154c     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder r2 = r8.f59088c     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.d()     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r2 = r2.getAid()     // Catch:{ Exception -> 0x05e9 }
            boolean r1 = r1.a(r2)     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder r3 = r8.f59088c     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.d()     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r3 = com.ss.android.ugc.aweme.u.aa.m(r3)     // Catch:{ Exception -> 0x05e9 }
            r0.put(r2, r3)     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.aweme.feed.c.j r2 = r8.f59090e     // Catch:{ Exception -> 0x05e9 }
            r3 = 0
            if (r2 == 0) goto L_0x0167
            java.lang.String r2 = "enter_from"
            com.ss.android.ugc.aweme.feed.c.j r4 = r8.f59090e     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r4 = r4.a(r9)     // Catch:{ Exception -> 0x05e9 }
            r0.put(r2, r4)     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.aweme.feed.c.j r2 = r8.f59090e     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r2 = r2.T()     // Catch:{ Exception -> 0x05e9 }
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x05e9 }
            r13[r9] = r2     // Catch:{ Exception -> 0x05e9 }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.player.a.b.f59060a     // Catch:{ Exception -> 0x05e9 }
            r16 = 1
            r17 = 64201(0xfac9, float:8.9965E-41)
            java.lang.Class[] r4 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x05e9 }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r9] = r5     // Catch:{ Exception -> 0x05e9 }
            java.lang.Class<com.ss.android.ugc.aweme.player.a.e$b> r19 = com.ss.android.ugc.aweme.player.a.e.b.class
            r18 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x05e9 }
            if (r4 == 0) goto L_0x00be
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x05e9 }
            r13[r9] = r2     // Catch:{ Exception -> 0x05e9 }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.player.a.b.f59060a     // Catch:{ Exception -> 0x05e9 }
            r16 = 1
            r17 = 64201(0xfac9, float:8.9965E-41)
            java.lang.Class[] r2 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x05e9 }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r9] = r3     // Catch:{ Exception -> 0x05e9 }
            java.lang.Class<com.ss.android.ugc.aweme.player.a.e$b> r19 = com.ss.android.ugc.aweme.player.a.e.b.class
            r18 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.aweme.player.a.e$b r2 = (com.ss.android.ugc.aweme.player.a.e.b) r2     // Catch:{ Exception -> 0x05e9 }
            r3 = r2
            goto L_0x0167
        L_0x00be:
            com.ss.android.ugc.aweme.player.a.e$b r4 = new com.ss.android.ugc.aweme.player.a.e$b     // Catch:{ Exception -> 0x05e9 }
            r4.<init>()     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.aweme.player.a.a r5 = com.ss.android.ugc.aweme.player.a.a.a()     // Catch:{ Exception -> 0x05e9 }
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x05e9 }
            r13[r9] = r2     // Catch:{ Exception -> 0x05e9 }
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.player.a.a.f59057a     // Catch:{ Exception -> 0x05e9 }
            r16 = 0
            r17 = 64199(0xfac7, float:8.9962E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x05e9 }
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r9] = r7     // Catch:{ Exception -> 0x05e9 }
            java.lang.Class<java.lang.Long> r19 = java.lang.Long.class
            r14 = r5
            r18 = r6
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x05e9 }
            if (r6 == 0) goto L_0x0100
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x05e9 }
            r13[r9] = r2     // Catch:{ Exception -> 0x05e9 }
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.player.a.a.f59057a     // Catch:{ Exception -> 0x05e9 }
            r16 = 0
            r17 = 64199(0xfac7, float:8.9962E-41)
            java.lang.Class[] r2 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x05e9 }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r9] = r3     // Catch:{ Exception -> 0x05e9 }
            java.lang.Class<java.lang.Long> r19 = java.lang.Long.class
            r14 = r5
            r18 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x05e9 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ Exception -> 0x05e9 }
            goto L_0x010c
        L_0x0100:
            if (r2 == 0) goto L_0x010b
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r3 = r5.f59058b     // Catch:{ Exception -> 0x05e9 }
            java.lang.Object r2 = r3.get(r2)     // Catch:{ Exception -> 0x05e9 }
            r3 = r2
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ Exception -> 0x05e9 }
        L_0x010b:
            r2 = r3
        L_0x010c:
            com.ss.android.ugc.aweme.utils.db r3 = com.ss.android.ugc.aweme.utils.db.a()     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.aweme.utils.da r5 = com.ss.android.ugc.aweme.utils.da.FROM_SEND_TO_FIRST     // Catch:{ Exception -> 0x05e9 }
            boolean r3 = r3.a(r5)     // Catch:{ Exception -> 0x05e9 }
            if (r3 == 0) goto L_0x011c
            if (r2 == 0) goto L_0x011c
            r3 = 1
            goto L_0x011d
        L_0x011c:
            r3 = 0
        L_0x011d:
            r4.f59093a = r3     // Catch:{ Exception -> 0x05e9 }
            boolean r3 = r4.f59093a     // Catch:{ Exception -> 0x05e9 }
            if (r3 == 0) goto L_0x0133
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x05e9 }
            long r2 = r2.longValue()     // Catch:{ Exception -> 0x05e9 }
            r7 = 0
            long r5 = r5 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x05e9 }
            r4.f59094b = r2     // Catch:{ Exception -> 0x05e9 }
        L_0x0133:
            com.ss.android.ugc.aweme.player.a.a r2 = com.ss.android.ugc.aweme.player.a.a.a()     // Catch:{ Exception -> 0x05e9 }
            java.lang.Object[] r13 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x05e9 }
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.player.a.a.f59057a     // Catch:{ Exception -> 0x05e9 }
            r16 = 0
            r17 = 64200(0xfac8, float:8.9963E-41)
            java.lang.Class[] r3 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x05e9 }
            java.lang.Class r19 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x05e9 }
            r14 = r2
            r18 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x05e9 }
            if (r3 == 0) goto L_0x0161
            java.lang.Object[] r13 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x05e9 }
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.player.a.a.f59057a     // Catch:{ Exception -> 0x05e9 }
            r16 = 0
            r17 = 64200(0xfac8, float:8.9963E-41)
            java.lang.Class[] r3 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x05e9 }
            java.lang.Class r19 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x05e9 }
            r14 = r2
            r18 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x05e9 }
            goto L_0x0166
        L_0x0161:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r2 = r2.f59058b     // Catch:{ Exception -> 0x05e9 }
            r2.clear()     // Catch:{ Exception -> 0x05e9 }
        L_0x0166:
            r3 = r4
        L_0x0167:
            if (r3 != 0) goto L_0x017a
            com.ss.android.ugc.aweme.player.a.e$b r3 = new com.ss.android.ugc.aweme.player.a.e$b     // Catch:{ Exception -> 0x05e9 }
            r3.<init>()     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.aweme.utils.db r2 = com.ss.android.ugc.aweme.utils.db.a()     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.aweme.utils.da r4 = com.ss.android.ugc.aweme.utils.da.FIRST_FRAME     // Catch:{ Exception -> 0x05e9 }
            boolean r2 = r2.a(r4)     // Catch:{ Exception -> 0x05e9 }
            r3.f59093a = r2     // Catch:{ Exception -> 0x05e9 }
        L_0x017a:
            java.lang.String r2 = "is_first"
            r13 = -1
            if (r1 == 0) goto L_0x0181
            r4 = -1
            goto L_0x018a
        L_0x0181:
            if (r3 == 0) goto L_0x0189
            boolean r4 = r3.f59093a     // Catch:{ Exception -> 0x05e9 }
            if (r4 == 0) goto L_0x0189
            r4 = 1
            goto L_0x018a
        L_0x0189:
            r4 = 0
        L_0x018a:
            r0.put(r2, r4)     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r2 = "is_from_feed_cache"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x05e9 }
            r0.put(r2, r1)     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r1 = "duration"
            if (r3 == 0) goto L_0x01a5
            boolean r2 = r3.f59093a     // Catch:{ Exception -> 0x05e9 }
            if (r2 == 0) goto L_0x01a5
            java.lang.Long r2 = r3.f59094b     // Catch:{ Exception -> 0x05e9 }
            if (r2 == 0) goto L_0x01a5
            java.lang.Long r2 = r3.f59094b     // Catch:{ Exception -> 0x05e9 }
            goto L_0x01a7
        L_0x01a5:
            java.lang.String r2 = r8.f59089d     // Catch:{ Exception -> 0x05e9 }
        L_0x01a7:
            r0.put(r1, r2)     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r1 = "is_surfaceview"
            com.ss.android.ugc.playerkit.c.a r2 = com.ss.android.ugc.playerkit.c.a.r()     // Catch:{ Exception -> 0x05e9 }
            boolean r2 = r2.f()     // Catch:{ Exception -> 0x05e9 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r1 = "player_type"
            com.ss.android.ugc.aweme.video.o r2 = com.ss.android.ugc.aweme.video.o.b()     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.playerkit.c.c$a r2 = r2.m()     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x05e9 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r1 = "player_version"
            com.ss.android.ugc.aweme.video.o r2 = com.ss.android.ugc.aweme.video.o.b()     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r2 = r2.s()     // Catch:{ Exception -> 0x05e9 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x05e9 }
            if (r2 == 0) goto L_0x01db
            java.lang.String r2 = ""
            goto L_0x01e3
        L_0x01db:
            com.ss.android.ugc.aweme.video.o r2 = com.ss.android.ugc.aweme.video.o.b()     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r2 = r2.s()     // Catch:{ Exception -> 0x05e9 }
        L_0x01e3:
            r0.put(r1, r2)     // Catch:{ Exception -> 0x05e9 }
            int r1 = com.ss.android.ugc.c.b.e()     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r2 = "internet_speed"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r1 = "multi_player"
            boolean r2 = com.ss.android.ugc.aweme.video.o.f76179d     // Catch:{ Exception -> 0x05e9 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r1 = "codec_name"
            com.ss.android.ugc.aweme.video.o r2 = com.ss.android.ugc.aweme.video.o.b()     // Catch:{ Exception -> 0x05e9 }
            java.lang.Object[] r14 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x05e9 }
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.video.o.f76178a     // Catch:{ Exception -> 0x05e9 }
            r17 = 0
            r18 = 89012(0x15bb4, float:1.24732E-40)
            java.lang.Class[] r3 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x05e9 }
            java.lang.Class r20 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x05e9 }
            r15 = r2
            r19 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x05e9 }
            if (r3 == 0) goto L_0x022d
            java.lang.Object[] r14 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x05e9 }
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.video.o.f76178a     // Catch:{ Exception -> 0x05e9 }
            r17 = 0
            r18 = 89012(0x15bb4, float:1.24732E-40)
            java.lang.Class[] r3 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x05e9 }
            java.lang.Class r20 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x05e9 }
            r15 = r2
            r19 = r3
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x05e9 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x05e9 }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x05e9 }
            goto L_0x0239
        L_0x022d:
            com.ss.android.ugc.aweme.player.sdk.api.c r2 = r2.f76182e     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.aweme.player.sdk.api.IPlayer$d r2 = r2.t()     // Catch:{ Exception -> 0x05e9 }
            if (r2 == 0) goto L_0x0238
            int r2 = r2.f59113a     // Catch:{ Exception -> 0x05e9 }
            goto L_0x0239
        L_0x0238:
            r2 = 0
        L_0x0239:
            r0.put(r1, r2)     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r1 = "codec_id"
            com.ss.android.ugc.aweme.video.o r2 = com.ss.android.ugc.aweme.video.o.b()     // Catch:{ Exception -> 0x05e9 }
            java.lang.Object[] r14 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x05e9 }
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.video.o.f76178a     // Catch:{ Exception -> 0x05e9 }
            r17 = 0
            r18 = 89013(0x15bb5, float:1.24734E-40)
            java.lang.Class[] r3 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x05e9 }
            java.lang.Class r20 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x05e9 }
            r15 = r2
            r19 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x05e9 }
            if (r3 == 0) goto L_0x0273
            java.lang.Object[] r14 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x05e9 }
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.video.o.f76178a     // Catch:{ Exception -> 0x05e9 }
            r17 = 0
            r18 = 89013(0x15bb5, float:1.24734E-40)
            java.lang.Class[] r3 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x05e9 }
            java.lang.Class r20 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x05e9 }
            r15 = r2
            r19 = r3
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x05e9 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x05e9 }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x05e9 }
            goto L_0x027f
        L_0x0273:
            com.ss.android.ugc.aweme.player.sdk.api.c r2 = r2.f76182e     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.aweme.player.sdk.api.IPlayer$d r2 = r2.t()     // Catch:{ Exception -> 0x05e9 }
            if (r2 == 0) goto L_0x027e
            int r2 = r2.f59114b     // Catch:{ Exception -> 0x05e9 }
            goto L_0x027f
        L_0x027e:
            r2 = -1
        L_0x027f:
            r0.put(r1, r2)     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r14 = "io_rate"
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x05e9 }
            com.meituan.robust.ChangeQuickRedirect r3 = f59086a     // Catch:{ Exception -> 0x05e9 }
            r4 = 0
            r5 = 64213(0xfad5, float:8.9982E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x05e9 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x05e9 }
            r2 = r22
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x05e9 }
            if (r1 == 0) goto L_0x02b1
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x05e9 }
            com.meituan.robust.ChangeQuickRedirect r3 = f59086a     // Catch:{ Exception -> 0x05e9 }
            r4 = 0
            r5 = 64213(0xfad5, float:8.9982E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x05e9 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x05e9 }
            r2 = r22
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x05e9 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x05e9 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x05e9 }
            goto L_0x02d5
        L_0x02b1:
            com.ss.android.ugc.aweme.video.preload.g r1 = com.ss.android.ugc.aweme.video.preload.g.f()     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.aweme.video.preload.c r1 = r1.d()     // Catch:{ Exception -> 0x05e9 }
            if (r1 == 0) goto L_0x02d4
            long r2 = r1.f76203a     // Catch:{ Exception -> 0x05e9 }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x02d4
            long r2 = r1.f76204b     // Catch:{ Exception -> 0x05e9 }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x02d4
            long r2 = r1.f76204b     // Catch:{ Exception -> 0x05e9 }
            long r4 = r1.f76203a     // Catch:{ Exception -> 0x05e9 }
            long r2 = r2 / r4
            int r1 = (int) r2     // Catch:{ Exception -> 0x05e9 }
            int r1 = r1 * 1000
            int r1 = r1 / 1024
            goto L_0x02d5
        L_0x02d4:
            r1 = 0
        L_0x02d5:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x05e9 }
            r0.put(r14, r1)     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r1 = "cpu_rate"
            java.lang.Integer r2 = com.ss.android.ugc.aweme.utils.at.a()     // Catch:{ Exception -> 0x05e9 }
            if (r2 == 0) goto L_0x02ed
            java.lang.Integer r2 = com.ss.android.ugc.aweme.utils.at.a()     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x05e9 }
            goto L_0x02ef
        L_0x02ed:
            java.lang.String r2 = "-1"
        L_0x02ef:
            r0.put(r1, r2)     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r1 = "current_url"
            com.ss.android.ugc.aweme.video.o r2 = com.ss.android.ugc.aweme.video.o.b()     // Catch:{ Exception -> 0x05e9 }
            java.lang.Object[] r14 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x05e9 }
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.video.o.f76178a     // Catch:{ Exception -> 0x05e9 }
            r17 = 0
            r18 = 89000(0x15ba8, float:1.24716E-40)
            java.lang.Class[] r3 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x05e9 }
            java.lang.Class<java.lang.String> r20 = java.lang.String.class
            r15 = r2
            r19 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x05e9 }
            if (r3 == 0) goto L_0x0325
            java.lang.Object[] r14 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x05e9 }
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.video.o.f76178a     // Catch:{ Exception -> 0x05e9 }
            r17 = 0
            r18 = 89000(0x15ba8, float:1.24716E-40)
            java.lang.Class[] r3 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x05e9 }
            java.lang.Class<java.lang.String> r20 = java.lang.String.class
            r15 = r2
            r19 = r3
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x05e9 }
            goto L_0x032b
        L_0x0325:
            com.ss.android.ugc.aweme.player.sdk.api.c r2 = r2.f76182e     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r2 = r2.k()     // Catch:{ Exception -> 0x05e9 }
        L_0x032b:
            java.lang.Object[] r14 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x05e9 }
            r14[r9] = r2     // Catch:{ Exception -> 0x05e9 }
            r3 = 50
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x05e9 }
            r14[r12] = r4     // Catch:{ Exception -> 0x05e9 }
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.base.utils.c.f35016a     // Catch:{ Exception -> 0x05e9 }
            r17 = 1
            r18 = 25196(0x626c, float:3.5307E-41)
            java.lang.Class[] r4 = new java.lang.Class[r11]     // Catch:{ Exception -> 0x05e9 }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r9] = r5     // Catch:{ Exception -> 0x05e9 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x05e9 }
            r4[r12] = r5     // Catch:{ Exception -> 0x05e9 }
            java.lang.Class<java.lang.String> r20 = java.lang.String.class
            r19 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x05e9 }
            if (r4 == 0) goto L_0x0378
            java.lang.Object[] r14 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x05e9 }
            r14[r9] = r2     // Catch:{ Exception -> 0x05e9 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x05e9 }
            r14[r12] = r2     // Catch:{ Exception -> 0x05e9 }
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.base.utils.c.f35016a     // Catch:{ Exception -> 0x05e9 }
            r17 = 1
            r18 = 25196(0x626c, float:3.5307E-41)
            java.lang.Class[] r2 = new java.lang.Class[r11]     // Catch:{ Exception -> 0x05e9 }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r9] = r3     // Catch:{ Exception -> 0x05e9 }
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x05e9 }
            r2[r12] = r3     // Catch:{ Exception -> 0x05e9 }
            java.lang.Class<java.lang.String> r20 = java.lang.String.class
            r19 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x05e9 }
            goto L_0x038c
        L_0x0378:
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x05e9 }
            if (r4 == 0) goto L_0x037f
            goto L_0x038c
        L_0x037f:
            int r4 = r2.length()     // Catch:{ Exception -> 0x05e9 }
            if (r4 > r3) goto L_0x0386
            goto L_0x038c
        L_0x0386:
            r3 = 49
            java.lang.String r2 = r2.substring(r9, r3)     // Catch:{ Exception -> 0x05e9 }
        L_0x038c:
            r0.put(r1, r2)     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r1 = "video_fps"
            com.ss.android.ugc.aweme.video.o r2 = com.ss.android.ugc.aweme.video.o.b()     // Catch:{ Exception -> 0x05e9 }
            java.lang.Object[] r14 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x05e9 }
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.video.o.f76178a     // Catch:{ Exception -> 0x05e9 }
            r17 = 0
            r18 = 89004(0x15bac, float:1.24721E-40)
            java.lang.Class[] r3 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x05e9 }
            java.lang.Class r20 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x05e9 }
            r15 = r2
            r19 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x05e9 }
            if (r3 == 0) goto L_0x03c6
            java.lang.Object[] r14 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x05e9 }
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.video.o.f76178a     // Catch:{ Exception -> 0x05e9 }
            r17 = 0
            r18 = 89004(0x15bac, float:1.24721E-40)
            java.lang.Class[] r3 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x05e9 }
            java.lang.Class r20 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x05e9 }
            r15 = r2
            r19 = r3
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x05e9 }
            java.lang.Float r2 = (java.lang.Float) r2     // Catch:{ Exception -> 0x05e9 }
            float r2 = r2.floatValue()     // Catch:{ Exception -> 0x05e9 }
            goto L_0x03ce
        L_0x03c6:
            com.ss.android.ugc.aweme.player.sdk.api.c r2 = r2.f76182e     // Catch:{ Exception -> 0x05e9 }
            r3 = 10
            float r2 = r2.a((int) r3)     // Catch:{ Exception -> 0x05e9 }
        L_0x03ce:
            double r2 = (double) r2     // Catch:{ Exception -> 0x05e9 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r1 = "is_h265"
            com.ss.android.ugc.aweme.video.b.b r2 = r8.g     // Catch:{ Exception -> 0x05e9 }
            boolean r2 = r2.f76014b     // Catch:{ Exception -> 0x05e9 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r1 = "is_ad"
            com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder r2 = r8.f59088c     // Catch:{ Exception -> 0x05e9 }
            boolean r2 = com.ss.android.ugc.aweme.feed.k.b.d((com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder) r2)     // Catch:{ Exception -> 0x05e9 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r1 = "preloader_type"
            com.ss.android.ugc.aweme.setting.AbTestManager r2 = com.ss.android.ugc.aweme.setting.AbTestManager.a()     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.aweme.setting.model.AbTestModel r2 = r2.d()     // Catch:{ Exception -> 0x05e9 }
            int r2 = r2.preloaderType     // Catch:{ Exception -> 0x05e9 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r1 = "video_bitrate"
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r2 = r8.f59087b     // Catch:{ Exception -> 0x05e9 }
            java.lang.Integer r2 = com.ss.android.ugc.aweme.feed.k.b.a((com.ss.android.ugc.aweme.feed.model.VideoUrlModel) r2)     // Catch:{ Exception -> 0x05e9 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r1 = r8.f59087b     // Catch:{ Exception -> 0x05e9 }
            java.util.List r1 = r1.getBitRate()     // Catch:{ Exception -> 0x05e9 }
            if (r1 == 0) goto L_0x0432
            boolean r2 = r1.isEmpty()     // Catch:{ Exception -> 0x05e9 }
            if (r2 != 0) goto L_0x0432
            java.lang.String r2 = "bitrate_set"
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ Exception -> 0x05e9 }
            com.google.gson.GsonBuilder r4 = new com.google.gson.GsonBuilder     // Catch:{ Exception -> 0x05e9 }
            r4.<init>()     // Catch:{ Exception -> 0x05e9 }
            com.google.gson.ExclusionStrategy[] r5 = new com.google.gson.ExclusionStrategy[r12]     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.aweme.feed.model.BitRate$ExcludeStrategy r6 = new com.ss.android.ugc.aweme.feed.model.BitRate$ExcludeStrategy     // Catch:{ Exception -> 0x05e9 }
            r6.<init>()     // Catch:{ Exception -> 0x05e9 }
            r5[r9] = r6     // Catch:{ Exception -> 0x05e9 }
            com.google.gson.GsonBuilder r4 = r4.setExclusionStrategies(r5)     // Catch:{ Exception -> 0x05e9 }
            com.google.gson.Gson r4 = r4.create()     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r4 = r4.toJson((java.lang.Object) r1)     // Catch:{ Exception -> 0x05e9 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x05e9 }
            r0.put(r2, r3)     // Catch:{ Exception -> 0x05e9 }
        L_0x0432:
            com.ss.android.ugc.aweme.video.o r2 = com.ss.android.ugc.aweme.video.o.b()     // Catch:{ Exception -> 0x05e9 }
            float r2 = r2.p()     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r3 = "play_bitrate"
            double r4 = (double) r2     // Catch:{ Exception -> 0x05e9 }
            r0.put(r3, r4)     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.aweme.video.preload.g r3 = com.ss.android.ugc.aweme.video.preload.g.f()     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r4 = r8.f59087b     // Catch:{ Exception -> 0x05e9 }
            boolean r3 = r3.a((com.ss.android.ugc.aweme.feed.model.VideoUrlModel) r4)     // Catch:{ Exception -> 0x05e9 }
            if (r3 == 0) goto L_0x045e
            java.lang.String r3 = "cache_size"
            com.ss.android.ugc.aweme.video.preload.g r4 = com.ss.android.ugc.aweme.video.preload.g.f()     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r5 = r8.f59087b     // Catch:{ Exception -> 0x05e9 }
            int r4 = r4.i(r5)     // Catch:{ Exception -> 0x05e9 }
            int r4 = r4 / 1024
            r0.put(r3, r4)     // Catch:{ Exception -> 0x05e9 }
            goto L_0x0463
        L_0x045e:
            java.lang.String r3 = "cache_size"
            r0.put(r3, r13)     // Catch:{ Exception -> 0x05e9 }
        L_0x0463:
            java.lang.String r3 = "video_size"
            com.ss.android.ugc.aweme.video.preload.g r4 = com.ss.android.ugc.aweme.video.preload.g.f()     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r5 = r8.f59087b     // Catch:{ Exception -> 0x05e9 }
            long r4 = r4.h(r5)     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x05e9 }
            r0.put(r3, r4)     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.aweme.video.o r3 = com.ss.android.ugc.aweme.video.o.b()     // Catch:{ Exception -> 0x05e9 }
            long r3 = r3.d()     // Catch:{ Exception -> 0x05e9 }
            float r3 = (float) r3     // Catch:{ Exception -> 0x05e9 }
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x048b
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r3 = r8.f59087b     // Catch:{ Exception -> 0x05e9 }
            double r3 = r3.getDuration()     // Catch:{ Exception -> 0x05e9 }
            float r3 = (float) r3
        L_0x048b:
            com.bytedance.frameworks.baselib.network.http.cronet.a.b r4 = com.bytedance.ttnet.TTNetInit.getNetworkQuality()     // Catch:{ Exception -> 0x04b5 }
            java.lang.String r5 = "tcp_rtt"
            int r6 = r4.f19794a     // Catch:{ Exception -> 0x04b5 }
            r0.put(r5, r6)     // Catch:{ Exception -> 0x04b5 }
            java.lang.String r5 = "tcp_bandwith"
            int r6 = r4.f19796c     // Catch:{ Exception -> 0x04b5 }
            r0.put(r5, r6)     // Catch:{ Exception -> 0x04b5 }
            java.lang.String r5 = "http_rtt"
            int r4 = r4.f19795b     // Catch:{ Exception -> 0x04b5 }
            r0.put(r5, r4)     // Catch:{ Exception -> 0x04b5 }
            java.lang.String r4 = "signal"
            android.app.Activity r5 = r8.i     // Catch:{ Exception -> 0x04b5 }
            com.ss.android.ugc.aweme.video.f r5 = com.ss.android.ugc.aweme.video.f.a(r5)     // Catch:{ Exception -> 0x04b5 }
            android.content.Context r6 = r8.j     // Catch:{ Exception -> 0x04b5 }
            int r5 = r5.b(r6)     // Catch:{ Exception -> 0x04b5 }
            r0.put(r4, r5)     // Catch:{ Exception -> 0x04b5 }
        L_0x04b5:
            java.lang.String r4 = "video_duration"
            r5 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 / r5
            int r3 = (int) r3     // Catch:{ Exception -> 0x05e9 }
            r0.put(r4, r3)     // Catch:{ Exception -> 0x05e9 }
            boolean r3 = com.ss.android.g.a.a()     // Catch:{ Exception -> 0x05e9 }
            if (r3 == 0) goto L_0x05dd
            java.lang.String r3 = "video_quality"
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r4 = r8.f59087b     // Catch:{ Exception -> 0x05e9 }
            int r4 = com.ss.android.ugc.aweme.feed.k.b.b((com.ss.android.ugc.aweme.feed.model.VideoUrlModel) r4)     // Catch:{ Exception -> 0x05e9 }
            r0.put(r3, r4)     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r3 = "access"
            android.content.Context r4 = r8.j     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.common.util.NetworkUtils$h r4 = com.ss.android.common.util.NetworkUtils.getNetworkType(r4)     // Catch:{ Exception -> 0x05e9 }
            r0.put(r3, r4)     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.aweme.setting.AbTestManager r3 = com.ss.android.ugc.aweme.setting.AbTestManager.a()     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.aweme.setting.model.AbTestModel r3 = r3.d()     // Catch:{ Exception -> 0x05e9 }
            double r3 = r3.bitrateModelThreshold     // Catch:{ Exception -> 0x05e9 }
            r5 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0518
            com.ss.android.ugc.aweme.setting.AbTestManager r3 = com.ss.android.ugc.aweme.setting.AbTestManager.a()     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r4 = "auto_bitrate"
            com.ss.android.ugc.aweme.setting.model.MLModel r3 = r3.a((java.lang.String) r4)     // Catch:{ Exception -> 0x05e9 }
            if (r3 == 0) goto L_0x0518
            com.ss.android.ugc.aweme.setting.AbTestManager r3 = com.ss.android.ugc.aweme.setting.AbTestManager.a()     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r4 = "auto_bitrate"
            com.ss.android.ugc.aweme.setting.model.MLModel r3 = r3.a((java.lang.String) r4)     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r3 = r3.packageUrl     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r4 = "model_path"
            int r5 = r3.length()     // Catch:{ Exception -> 0x05e9 }
            r6 = 30
            if (r5 < r6) goto L_0x0515
            int r5 = r3.length()     // Catch:{ Exception -> 0x05e9 }
            int r5 = r5 - r6
            java.lang.String r3 = r3.substring(r5)     // Catch:{ Exception -> 0x05e9 }
        L_0x0515:
            r0.put(r4, r3)     // Catch:{ Exception -> 0x05e9 }
        L_0x0518:
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r3 = r8.f59087b     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.lib.video.bitrate.regulator.a.c r3 = r3.getHitBitrate()     // Catch:{ Exception -> 0x05e9 }
            boolean r4 = r3 instanceof com.ss.android.ugc.lib.video.bitrate.regulator.a.f     // Catch:{ Exception -> 0x05e9 }
            if (r4 == 0) goto L_0x052b
            com.ss.android.ugc.lib.video.bitrate.regulator.a.f r3 = (com.ss.android.ugc.lib.video.bitrate.regulator.a.f) r3     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r4 = "use_model"
            int r3 = r3.f77680d     // Catch:{ Exception -> 0x05e9 }
            r0.put(r4, r3)     // Catch:{ Exception -> 0x05e9 }
        L_0x052b:
            com.ss.android.ugc.playerkit.session.a r3 = com.ss.android.ugc.playerkit.session.a.a()     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r4 = r8.f59087b     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r4 = r4.getUri()     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.playerkit.session.Session r3 = r3.b(r4)     // Catch:{ Exception -> 0x05e9 }
            if (r3 == 0) goto L_0x058b
            java.lang.String r4 = r3.sourceId     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r5 = r8.f59087b     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r5 = r5.getSourceId()     // Catch:{ Exception -> 0x05e9 }
            boolean r4 = android.text.TextUtils.equals(r4, r5)     // Catch:{ Exception -> 0x05e9 }
            if (r4 == 0) goto L_0x058b
            r3.playBitrate = r2     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r2 = "cache_size"
            int r2 = r0.getInt(r2)     // Catch:{ Exception -> 0x05e9 }
            r3.cacheSize = r2     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r2 = "video_bitrate"
            int r4 = r3.bitrate     // Catch:{ Exception -> 0x05e9 }
            r0.put(r2, r4)     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r2 = "calc_bitrate"
            double r4 = r3.calcBitrate     // Catch:{ Exception -> 0x05e9 }
            r0.put(r2, r4)     // Catch:{ Exception -> 0x05e9 }
            if (r1 == 0) goto L_0x058b
            r2 = 0
        L_0x0564:
            int r4 = r1.size()     // Catch:{ Exception -> 0x05e9 }
            if (r2 >= r4) goto L_0x058b
            java.lang.Object r4 = r1.get(r2)     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.aweme.feed.model.BitRate r4 = (com.ss.android.ugc.aweme.feed.model.BitRate) r4     // Catch:{ Exception -> 0x05e9 }
            int r4 = r4.getBitRate()     // Catch:{ Exception -> 0x05e9 }
            int r5 = r3.bitrate     // Catch:{ Exception -> 0x05e9 }
            if (r4 != r5) goto L_0x0588
            java.lang.String r3 = "video_quality"
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.aweme.feed.model.BitRate r1 = (com.ss.android.ugc.aweme.feed.model.BitRate) r1     // Catch:{ Exception -> 0x05e9 }
            int r1 = r1.getQualityType()     // Catch:{ Exception -> 0x05e9 }
            r0.put(r3, r1)     // Catch:{ Exception -> 0x05e9 }
            goto L_0x058b
        L_0x0588:
            int r2 = r2 + 1
            goto L_0x0564
        L_0x058b:
            com.ss.android.ugc.playerkit.session.a r1 = com.ss.android.ugc.playerkit.session.a.a()     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r2 = r8.f59087b     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r2 = r2.getUri()     // Catch:{ Exception -> 0x05e9 }
            java.util.List r1 = r1.a(r10, r2)     // Catch:{ Exception -> 0x05e9 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x05e9 }
            r2.<init>(r10)     // Catch:{ Exception -> 0x05e9 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x05e9 }
        L_0x05a2:
            boolean r3 = r1.hasNext()     // Catch:{ Exception -> 0x05e9 }
            if (r3 == 0) goto L_0x05b8
            java.lang.Object r3 = r1.next()     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.playerkit.session.Session r3 = (com.ss.android.ugc.playerkit.session.Session) r3     // Catch:{ Exception -> 0x05e9 }
            if (r3 == 0) goto L_0x05a2
            com.ss.android.ugc.aweme.video.VideoPlayInfoHists r3 = com.ss.android.ugc.aweme.video.VideoPlayInfoHists.convert(r3)     // Catch:{ Exception -> 0x05e9 }
            r2.add(r3)     // Catch:{ Exception -> 0x05e9 }
            goto L_0x05a2
        L_0x05b8:
            java.lang.String r1 = "video_hists"
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ Exception -> 0x05e9 }
            com.google.gson.GsonBuilder r4 = new com.google.gson.GsonBuilder     // Catch:{ Exception -> 0x05e9 }
            r4.<init>()     // Catch:{ Exception -> 0x05e9 }
            com.google.gson.ExclusionStrategy[] r5 = new com.google.gson.ExclusionStrategy[r12]     // Catch:{ Exception -> 0x05e9 }
            com.ss.android.ugc.aweme.video.VideoPlayInfoHists$a r6 = new com.ss.android.ugc.aweme.video.VideoPlayInfoHists$a     // Catch:{ Exception -> 0x05e9 }
            r6.<init>()     // Catch:{ Exception -> 0x05e9 }
            r5[r9] = r6     // Catch:{ Exception -> 0x05e9 }
            com.google.gson.GsonBuilder r4 = r4.setExclusionStrategies(r5)     // Catch:{ Exception -> 0x05e9 }
            com.google.gson.Gson r4 = r4.create()     // Catch:{ Exception -> 0x05e9 }
            java.lang.String r2 = r4.toJson((java.lang.Object) r2)     // Catch:{ Exception -> 0x05e9 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x05e9 }
            r0.put(r1, r3)     // Catch:{ Exception -> 0x05e9 }
            goto L_0x05f2
        L_0x05dd:
            java.lang.String r1 = "quality_type"
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r2 = r8.f59087b     // Catch:{ Exception -> 0x05e9 }
            int r2 = com.ss.android.ugc.aweme.feed.k.b.b((com.ss.android.ugc.aweme.feed.model.VideoUrlModel) r2)     // Catch:{ Exception -> 0x05e9 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x05e9 }
            goto L_0x05f2
        L_0x05e9:
            r0 = move-exception
            com.ss.android.ugc.aweme.framework.a.a.a((java.lang.Exception) r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
        L_0x05f2:
            com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder r13 = r8.f59088c
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r14 = r8.f59087b
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r1[r9] = r13
            r1[r12] = r0
            r1[r11] = r14
            com.meituan.robust.ChangeQuickRedirect r3 = f59086a
            r4 = 0
            r5 = 64214(0xfad6, float:8.9983E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder> r2 = com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder.class
            r6[r9] = r2
            java.lang.Class<org.json.JSONObject> r2 = org.json.JSONObject.class
            r6[r12] = r2
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.VideoUrlModel> r2 = com.ss.android.ugc.aweme.feed.model.VideoUrlModel.class
            r6[r11] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r22
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0641
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r1[r9] = r13
            r1[r12] = r0
            r1[r11] = r14
            com.meituan.robust.ChangeQuickRedirect r3 = f59086a
            r4 = 0
            r5 = 64214(0xfad6, float:8.9983E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder> r2 = com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder.class
            r6[r9] = r2
            java.lang.Class<org.json.JSONObject> r2 = org.json.JSONObject.class
            r6[r12] = r2
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.VideoUrlModel> r2 = com.ss.android.ugc.aweme.feed.model.VideoUrlModel.class
            r6[r11] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x07a2
        L_0x0641:
            com.ss.android.ugc.aweme.video.f.a r1 = r8.k
            if (r1 == 0) goto L_0x07a2
            java.lang.String r2 = "is_h265"
            boolean r2 = r0.has(r2)     // Catch:{ Exception -> 0x07a1 }
            if (r2 == 0) goto L_0x065a
            java.lang.String r2 = "is_h265"
            int r2 = r0.getInt(r2)     // Catch:{ Exception -> 0x07a1 }
            if (r2 != r12) goto L_0x0657
            r2 = 1
            goto L_0x0658
        L_0x0657:
            r2 = 0
        L_0x0658:
            r1.g = r2     // Catch:{ Exception -> 0x07a1 }
        L_0x065a:
            java.lang.String r2 = "group_id"
            boolean r2 = r0.has(r2)     // Catch:{ Exception -> 0x07a1 }
            if (r2 == 0) goto L_0x066a
            java.lang.String r2 = "group_id"
            java.lang.String r2 = r0.getString(r2)     // Catch:{ Exception -> 0x07a1 }
            r1.p = r2     // Catch:{ Exception -> 0x07a1 }
        L_0x066a:
            java.lang.String r2 = r14.getBitRatedRatioUri()     // Catch:{ Exception -> 0x07a1 }
            r1.o = r2     // Catch:{ Exception -> 0x07a1 }
            java.lang.String r2 = "is_h265"
            boolean r2 = r0.has(r2)     // Catch:{ Exception -> 0x07a1 }
            if (r2 == 0) goto L_0x0685
            java.lang.String r2 = "is_h265"
            int r2 = r0.getInt(r2)     // Catch:{ Exception -> 0x07a1 }
            if (r2 != r12) goto L_0x0682
            r2 = 1
            goto L_0x0683
        L_0x0682:
            r2 = 0
        L_0x0683:
            r1.g = r2     // Catch:{ Exception -> 0x07a1 }
        L_0x0685:
            java.lang.String r2 = "speed_model_path"
            boolean r2 = r0.has(r2)     // Catch:{ Exception -> 0x07a1 }
            if (r2 == 0) goto L_0x0695
            java.lang.String r2 = "speed_model_path"
            java.lang.String r2 = r0.getString(r2)     // Catch:{ Exception -> 0x07a1 }
            r1.t = r2     // Catch:{ Exception -> 0x07a1 }
        L_0x0695:
            java.lang.String r2 = "duration"
            int r2 = r0.getInt(r2)     // Catch:{ Exception -> 0x07a1 }
            long r2 = (long) r2     // Catch:{ Exception -> 0x07a1 }
            r1.f76074f = r2     // Catch:{ Exception -> 0x07a1 }
            java.lang.String r2 = "internet_speed"
            int r2 = r0.getInt(r2)     // Catch:{ Exception -> 0x07a1 }
            r1.h = r2     // Catch:{ Exception -> 0x07a1 }
            java.lang.String r2 = "video_bitrate"
            boolean r2 = r0.has(r2)     // Catch:{ Exception -> 0x07a1 }
            if (r2 == 0) goto L_0x06b6
            java.lang.String r2 = "video_bitrate"
            int r2 = r0.getInt(r2)     // Catch:{ Exception -> 0x07a1 }
            r1.k = r2     // Catch:{ Exception -> 0x07a1 }
        L_0x06b6:
            java.lang.String r2 = "play_bitrate"
            boolean r2 = r0.has(r2)     // Catch:{ Exception -> 0x07a1 }
            if (r2 == 0) goto L_0x06c7
            java.lang.String r2 = "play_bitrate"
            double r2 = r0.getDouble(r2)     // Catch:{ Exception -> 0x07a1 }
            float r2 = (float) r2     // Catch:{ Exception -> 0x07a1 }
            r1.l = r2     // Catch:{ Exception -> 0x07a1 }
        L_0x06c7:
            java.lang.String r2 = "bitrate_set"
            java.lang.Object r2 = r0.opt(r2)     // Catch:{ Exception -> 0x07a1 }
            if (r2 == 0) goto L_0x0715
            java.lang.String r2 = "bitrate_set"
            java.lang.Object r2 = r0.get(r2)     // Catch:{ Exception -> 0x07a1 }
            java.lang.Object[] r15 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x07a1 }
            r15[r9] = r2     // Catch:{ Exception -> 0x07a1 }
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.video.f.a.f76069a     // Catch:{ Exception -> 0x07a1 }
            r18 = 0
            r19 = 89344(0x15d00, float:1.25198E-40)
            java.lang.Class[] r3 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x07a1 }
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            r3[r9] = r4     // Catch:{ Exception -> 0x07a1 }
            java.lang.Class r21 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x07a1 }
            r16 = r1
            r20 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x07a1 }
            if (r3 == 0) goto L_0x070d
            java.lang.Object[] r15 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x07a1 }
            r15[r9] = r2     // Catch:{ Exception -> 0x07a1 }
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.video.f.a.f76069a     // Catch:{ Exception -> 0x07a1 }
            r18 = 0
            r19 = 89344(0x15d00, float:1.25198E-40)
            java.lang.Class[] r2 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x07a1 }
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r2[r9] = r3     // Catch:{ Exception -> 0x07a1 }
            java.lang.Class r21 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x07a1 }
            r16 = r1
            r20 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x07a1 }
            goto L_0x0715
        L_0x070d:
            if (r2 == 0) goto L_0x0715
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x07a1 }
            r1.m = r2     // Catch:{ Exception -> 0x07a1 }
        L_0x0715:
            java.lang.String r2 = "current_url"
            java.lang.Object r2 = r0.opt(r2)     // Catch:{ Exception -> 0x07a1 }
            if (r2 == 0) goto L_0x0725
            java.lang.String r2 = "current_url"
            java.lang.String r2 = r0.getString(r2)     // Catch:{ Exception -> 0x07a1 }
            r1.r = r2     // Catch:{ Exception -> 0x07a1 }
        L_0x0725:
            java.lang.String r2 = "is_surfaceview"
            java.lang.Object r2 = r0.opt(r2)     // Catch:{ Exception -> 0x07a1 }
            if (r2 == 0) goto L_0x073a
            java.lang.String r2 = "is_surfaceview"
            int r2 = r0.getInt(r2)     // Catch:{ Exception -> 0x07a1 }
            if (r2 != r12) goto L_0x0737
            r2 = 1
            goto L_0x0738
        L_0x0737:
            r2 = 0
        L_0x0738:
            r1.s = r2     // Catch:{ Exception -> 0x07a1 }
        L_0x073a:
            com.ss.android.ugc.aweme.video.preload.g r2 = com.ss.android.ugc.aweme.video.preload.g.f()     // Catch:{ Exception -> 0x07a1 }
            int r2 = r2.i(r14)     // Catch:{ Exception -> 0x07a1 }
            r1.i = r2     // Catch:{ Exception -> 0x07a1 }
            com.ss.android.ugc.aweme.video.preload.g r2 = com.ss.android.ugc.aweme.video.preload.g.f()     // Catch:{ Exception -> 0x07a1 }
            long r2 = r2.h(r14)     // Catch:{ Exception -> 0x07a1 }
            r1.j = r2     // Catch:{ Exception -> 0x07a1 }
            com.ss.android.ugc.aweme.video.o r2 = com.ss.android.ugc.aweme.video.o.b()     // Catch:{ Exception -> 0x07a1 }
            java.lang.Object[] r13 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x07a1 }
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.video.o.f76178a     // Catch:{ Exception -> 0x07a1 }
            r16 = 0
            r17 = 89018(0x15bba, float:1.24741E-40)
            java.lang.Class[] r3 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x07a1 }
            java.lang.Class r19 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x07a1 }
            r14 = r2
            r18 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x07a1 }
            if (r3 == 0) goto L_0x0783
            java.lang.Object[] r13 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x07a1 }
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.video.o.f76178a     // Catch:{ Exception -> 0x07a1 }
            r16 = 0
            r17 = 89018(0x15bba, float:1.24741E-40)
            java.lang.Class[] r3 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x07a1 }
            java.lang.Class r19 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x07a1 }
            r14 = r2
            r18 = r3
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x07a1 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x07a1 }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x07a1 }
            goto L_0x0789
        L_0x0783:
            com.ss.android.ugc.aweme.player.sdk.api.c r2 = r2.f76182e     // Catch:{ Exception -> 0x07a1 }
            boolean r2 = r2.r()     // Catch:{ Exception -> 0x07a1 }
        L_0x0789:
            r1.q = r2     // Catch:{ Exception -> 0x07a1 }
            com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel r1 = r8.f59091f     // Catch:{ Exception -> 0x07a1 }
            if (r1 == 0) goto L_0x07a2
            com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel r1 = r8.f59091f     // Catch:{ Exception -> 0x07a1 }
            com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter r1 = r1.be()     // Catch:{ Exception -> 0x07a1 }
            if (r1 == 0) goto L_0x07a2
            com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel r1 = r8.f59091f     // Catch:{ Exception -> 0x07a1 }
            com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter r1 = r1.be()     // Catch:{ Exception -> 0x07a1 }
            r1.notifyDataSetChanged()     // Catch:{ Exception -> 0x07a1 }
            goto L_0x07a2
        L_0x07a1:
        L_0x07a2:
            boolean r1 = com.ss.android.g.a.a()
            if (r1 != 0) goto L_0x07d7
            com.ss.android.ugc.aweme.common.MobClick r1 = com.ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r2 = "video_play_quality"
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setEventName(r2)
            java.lang.String r2 = "perf_monitor"
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setLabelName(r2)
            com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder r2 = r8.f59088c
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.d()
            java.lang.String r2 = r2.getAid()
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setValue(r2)
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setJsonObject(r0)
            com.ss.android.ugc.aweme.common.r.onEvent(r1)
            java.lang.String r1 = "video_play_quality"
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r1, (org.json.JSONObject) r0)
            java.lang.String r1 = "video_play_quality"
            com.ss.android.ugc.aweme.t.b.b((java.lang.String) r1, (org.json.JSONObject) r0)
        L_0x07d7:
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r10 = r8.f59087b
            java.lang.Object[] r1 = new java.lang.Object[r11]
            r1[r9] = r0
            r1[r12] = r10
            com.meituan.robust.ChangeQuickRedirect r3 = f59086a
            r4 = 0
            r5 = 64215(0xfad7, float:8.9984E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]
            java.lang.Class<org.json.JSONObject> r2 = org.json.JSONObject.class
            r6[r9] = r2
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.VideoUrlModel> r2 = com.ss.android.ugc.aweme.feed.model.VideoUrlModel.class
            r6[r12] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r22
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0817
            java.lang.Object[] r1 = new java.lang.Object[r11]
            r1[r9] = r0
            r1[r12] = r10
            com.meituan.robust.ChangeQuickRedirect r3 = f59086a
            r4 = 0
            r5 = 64215(0xfad7, float:8.9984E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]
            java.lang.Class<org.json.JSONObject> r2 = org.json.JSONObject.class
            r6[r9] = r2
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.VideoUrlModel> r2 = com.ss.android.ugc.aweme.feed.model.VideoUrlModel.class
            r6[r12] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0841
        L_0x0817:
            com.ss.android.ugc.aweme.video.preload.g r1 = com.ss.android.ugc.aweme.video.preload.g.f()     // Catch:{ Exception -> 0x0841 }
            int r1 = r1.i(r10)     // Catch:{ Exception -> 0x0841 }
            float r1 = (float) r1     // Catch:{ Exception -> 0x0841 }
            r2 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r2
            com.ss.android.ugc.aweme.video.preload.g r2 = com.ss.android.ugc.aweme.video.preload.g.f()     // Catch:{ Exception -> 0x0841 }
            long r2 = r2.h(r10)     // Catch:{ Exception -> 0x0841 }
            float r2 = (float) r2     // Catch:{ Exception -> 0x0841 }
            float r1 = r1 / r2
            int r1 = (int) r1     // Catch:{ Exception -> 0x0841 }
            java.lang.String r2 = "video_size"
            com.ss.android.ugc.aweme.video.preload.g r3 = com.ss.android.ugc.aweme.video.preload.g.f()     // Catch:{ Exception -> 0x0841 }
            long r3 = r3.h(r10)     // Catch:{ Exception -> 0x0841 }
            r0.put(r2, r3)     // Catch:{ Exception -> 0x0841 }
            java.lang.String r2 = "preload_percent"
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0841 }
        L_0x0841:
            com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel r1 = r8.f59091f     // Catch:{ JSONException -> 0x085a }
            if (r1 == 0) goto L_0x0853
            com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel r1 = r8.f59091f     // Catch:{ JSONException -> 0x085a }
            boolean r1 = r1.F     // Catch:{ JSONException -> 0x085a }
            if (r1 != 0) goto L_0x0853
            java.lang.String r1 = "enter_method"
            java.lang.String r2 = "click"
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x085a }
            goto L_0x085a
        L_0x0853:
            java.lang.String r1 = "enter_method"
            java.lang.String r2 = "slide"
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x085a }
        L_0x085a:
            java.lang.String r1 = "aweme_video_bitrate_first_frame_log"
            com.ss.android.ugc.aweme.app.n.a((java.lang.String) r1, (org.json.JSONObject) r0)
            return
        L_0x0860:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.player.a.e.a():void");
    }
}

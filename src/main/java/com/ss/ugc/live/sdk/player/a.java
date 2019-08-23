package com.ss.ugc.live.sdk.player;

import com.ss.ugc.live.sdk.player.ILivePlayer;
import com.ss.ugc.live.sdk.player.c;
import java.io.IOException;
import java.util.Map;

public abstract class a implements ILivePlayer {

    /* renamed from: a  reason: collision with root package name */
    private final c f78740a;

    /* renamed from: b  reason: collision with root package name */
    private final C0844a f78741b;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.ugc.live.sdk.a.a f78742c;

    /* renamed from: com.ss.ugc.live.sdk.player.a$a  reason: collision with other inner class name */
    static class C0844a implements ILivePlayer.a {

        /* renamed from: a  reason: collision with root package name */
        public ILivePlayer.a f78744a;

        /* renamed from: b  reason: collision with root package name */
        private final c f78745b;

        private C0844a(c cVar) {
            this.f78745b = cVar;
        }

        /* synthetic */ C0844a(c cVar, byte b2) {
            this(cVar);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(com.ss.ugc.live.sdk.player.ILivePlayer.b r8, int r9, java.lang.String r10) {
            /*
                r7 = this;
                int[] r0 = com.ss.ugc.live.sdk.player.a.AnonymousClass1.f78743a
                int r1 = r8.ordinal()
                r0 = r0[r1]
                switch(r0) {
                    case 1: goto L_0x00be;
                    case 2: goto L_0x00b8;
                    case 3: goto L_0x00a9;
                    case 4: goto L_0x006f;
                    case 5: goto L_0x000d;
                    default: goto L_0x000b;
                }
            L_0x000b:
                goto L_0x00c3
            L_0x000d:
                com.ss.ugc.live.sdk.player.c r0 = r7.f78745b
                boolean r1 = android.text.TextUtils.isEmpty(r10)
                if (r1 != 0) goto L_0x00c3
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x006d }
                r1.<init>(r10)     // Catch:{ JSONException -> 0x006d }
                java.lang.String r2 = "ts"
                boolean r2 = r1.has(r2)     // Catch:{ JSONException -> 0x006d }
                if (r2 != 0) goto L_0x0024
                goto L_0x00c3
            L_0x0024:
                java.lang.String r2 = "ts"
                long r2 = r1.getLong(r2)     // Catch:{ JSONException -> 0x006d }
                long r4 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x006d }
                r6 = 0
                long r4 = r4 - r2
                r2 = 0
                int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r6 <= 0) goto L_0x0038
                r0.g = r4     // Catch:{ JSONException -> 0x006d }
            L_0x0038:
                java.lang.String r2 = "source"
                boolean r2 = r1.has(r2)     // Catch:{ JSONException -> 0x006d }
                if (r2 == 0) goto L_0x0064
                java.lang.String r2 = "source"
                java.lang.String r2 = r1.getString(r2)     // Catch:{ JSONException -> 0x006d }
                java.lang.String r3 = "zego"
                boolean r2 = android.text.TextUtils.equals(r2, r3)     // Catch:{ JSONException -> 0x006d }
                if (r2 == 0) goto L_0x0057
                java.lang.String r1 = ""
                r0.h = r1     // Catch:{ JSONException -> 0x006d }
                java.lang.String r1 = "zego"
                r0.i = r1     // Catch:{ JSONException -> 0x006d }
                goto L_0x00c3
            L_0x0057:
                java.lang.String r2 = "source"
                java.lang.String r1 = r1.getString(r2)     // Catch:{ JSONException -> 0x006d }
                r0.h = r1     // Catch:{ JSONException -> 0x006d }
                java.lang.String r1 = "livesdk"
                r0.i = r1     // Catch:{ JSONException -> 0x006d }
                goto L_0x00c3
            L_0x0064:
                java.lang.String r1 = "agora"
                r0.i = r1     // Catch:{ JSONException -> 0x006d }
                java.lang.String r1 = ""
                r0.h = r1     // Catch:{ JSONException -> 0x006d }
                goto L_0x00c3
            L_0x006d:
                goto L_0x00c3
            L_0x006f:
                com.ss.ugc.live.sdk.player.c r0 = r7.f78745b
                long r1 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x006d }
                long r3 = r0.f78762e     // Catch:{ JSONException -> 0x006d }
                r5 = 0
                long r1 = r1 - r3
                long r3 = r0.f78763f     // Catch:{ JSONException -> 0x006d }
                r5 = 0
                long r3 = r3 + r1
                r0.f78763f = r3     // Catch:{ JSONException -> 0x006d }
                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x006d }
                r0.f78762e = r3     // Catch:{ JSONException -> 0x006d }
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x006d }
                r3.<init>()     // Catch:{ JSONException -> 0x006d }
                java.lang.String r4 = "body_type"
                java.lang.String r5 = "onBlock"
                org.json.JSONObject r3 = r3.put(r4, r5)     // Catch:{ JSONException -> 0x006d }
                java.lang.String r4 = "block_index"
                int r5 = r0.f78761d     // Catch:{ JSONException -> 0x006d }
                org.json.JSONObject r3 = r3.put(r4, r5)     // Catch:{ JSONException -> 0x006d }
                java.lang.String r4 = "buffer_time"
                org.json.JSONObject r1 = r3.put(r4, r1)     // Catch:{ JSONException -> 0x006d }
                r0.a((org.json.JSONObject) r1)     // Catch:{ JSONException -> 0x006d }
                com.ss.ugc.live.sdk.player.b r0 = r0.f78758a     // Catch:{ JSONException -> 0x006d }
                r0.a(r1)     // Catch:{ JSONException -> 0x006d }
                goto L_0x00c3
            L_0x00a9:
                com.ss.ugc.live.sdk.player.c r0 = r7.f78745b
                int r1 = r0.f78761d
                int r1 = r1 + 1
                r0.f78761d = r1
                long r1 = java.lang.System.currentTimeMillis()
                r0.f78762e = r1
                goto L_0x00c3
            L_0x00b8:
                com.ss.ugc.live.sdk.player.c r0 = r7.f78745b
                r0.a((int) r9)
                goto L_0x00c3
            L_0x00be:
                com.ss.ugc.live.sdk.player.c r0 = r7.f78745b
                r0.d()
            L_0x00c3:
                com.ss.ugc.live.sdk.player.ILivePlayer$a r0 = r7.f78744a
                if (r0 == 0) goto L_0x00cc
                com.ss.ugc.live.sdk.player.ILivePlayer$a r0 = r7.f78744a
                r0.a(r8, r9, r10)
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.live.sdk.player.a.C0844a.a(com.ss.ugc.live.sdk.player.ILivePlayer$b, int, java.lang.String):void");
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(String str, Map<String, String> map) throws IOException;

    /* access modifiers changed from: protected */
    public abstract void b(ILivePlayer.a aVar);

    /* access modifiers changed from: protected */
    public abstract void j();

    /* access modifiers changed from: protected */
    public abstract void k();

    /* access modifiers changed from: protected */
    public abstract void l();

    /* access modifiers changed from: protected */
    public abstract void m();

    /* access modifiers changed from: protected */
    public abstract void n();

    public final void a() {
        j();
        c cVar = this.f78740a;
        cVar.f78759b = c.a.IDLE;
        cVar.f();
    }

    public final void b() {
        this.f78740a.a();
        k();
    }

    public final void c() {
        l();
        this.f78740a.e();
    }

    public final void d() {
        m();
        this.f78740a.b();
    }

    public final void e() {
        n();
        this.f78740a.c();
    }

    public final void a(ILivePlayer.a aVar) {
        this.f78741b.f78744a = aVar;
    }

    public a(c cVar) {
        this.f78740a = cVar;
        this.f78741b = new C0844a(cVar, (byte) 0);
        b(this.f78741b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r10, java.util.Map<java.lang.String, java.lang.String> r11, com.ss.ugc.live.sdk.player.ILivePlayer.c r12) throws java.io.IOException {
        /*
            r9 = this;
            com.ss.ugc.live.sdk.a.a r11 = r9.f78742c
            r0 = 0
            if (r11 == 0) goto L_0x00a2
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r1 = r10.toLowerCase(r1)
            java.lang.String r2 = "http"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x00a2
            java.lang.String r2 = "://"
            r3 = 4
            int r2 = r1.indexOf(r2, r3)
            int r2 = r2 + 3
            r3 = 7
            if (r2 == r3) goto L_0x0023
            r3 = 8
            if (r2 != r3) goto L_0x00a2
        L_0x0023:
            int r3 = r1.length()
            r4 = -1
            r6 = r2
            r5 = -1
        L_0x002a:
            if (r2 >= r3) goto L_0x0047
            char r7 = r1.charAt(r2)
            r8 = 35
            if (r7 == r8) goto L_0x0047
            r8 = 47
            if (r7 == r8) goto L_0x0047
            r8 = 58
            if (r7 == r8) goto L_0x0043
            switch(r7) {
                case 63: goto L_0x0047;
                case 64: goto L_0x0040;
                default: goto L_0x003f;
            }
        L_0x003f:
            goto L_0x0044
        L_0x0040:
            int r6 = r2 + 1
            goto L_0x0044
        L_0x0043:
            r5 = r2
        L_0x0044:
            int r2 = r2 + 1
            goto L_0x002a
        L_0x0047:
            if (r5 != r4) goto L_0x004a
            r5 = r2
        L_0x004a:
            java.lang.String r1 = r10.substring(r6, r5)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x00a2
            java.lang.String r11 = r11.a()
            boolean r3 = android.text.TextUtils.isEmpty(r11)
            if (r3 != 0) goto L_0x00a2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r10.substring(r0, r6)
            r3.append(r4)
            r3.append(r11)
            java.lang.String r11 = r3.toString()
            if (r5 >= r2) goto L_0x0086
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            java.lang.String r11 = r10.substring(r5, r2)
            r3.append(r11)
            java.lang.String r11 = r3.toString()
        L_0x0086:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            java.lang.String r11 = "/"
            r3.append(r11)
            r3.append(r1)
            java.lang.String r11 = r10.substring(r2)
            r3.append(r11)
            java.lang.String r11 = r3.toString()
            goto L_0x00a3
        L_0x00a2:
            r11 = r10
        L_0x00a3:
            com.ss.ugc.live.sdk.player.c r1 = r9.f78740a
            java.lang.String r2 = r1.j
            boolean r2 = android.text.TextUtils.equals(r2, r10)
            if (r2 != 0) goto L_0x00af
            r1.m = r0
        L_0x00af:
            r1.j = r10
            r1.k = r11
            r1.l = r12
            r10 = 0
            r9.a(r11, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.live.sdk.player.a.a(java.lang.String, java.util.Map, com.ss.ugc.live.sdk.player.ILivePlayer$c):void");
    }
}

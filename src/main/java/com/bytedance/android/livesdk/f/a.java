package com.bytedance.android.livesdk.f;

import android.content.IntentFilter;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.v.h;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.i.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.optimizer.live.sdk.a.b;
import com.ss.optimizer.live.sdk.a.c;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13837a;

    /* renamed from: b  reason: collision with root package name */
    private com.ss.optimizer.live.sdk.dns.a f13838b;

    /* renamed from: com.bytedance.android.livesdk.f.a$a  reason: collision with other inner class name */
    public static final class C0098a implements h.b<b> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f13841a;

        @NonNull
        public final h.b.a<b> a(h.b.a<b> aVar) {
            h.b.a<b> aVar2 = aVar;
            if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f13841a, false, 8098, new Class[]{h.b.a.class}, h.b.a.class)) {
                return aVar2.a(new a((byte) 0)).a();
            }
            return (h.b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f13841a, false, 8098, new Class[]{h.b.a.class}, h.b.a.class);
        }
    }

    private a() {
    }

    @Nullable
    public final com.ss.optimizer.live.sdk.dns.a a() {
        return this.f13838b;
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public final void a(com.ss.optimizer.live.sdk.dns.a aVar) {
        this.f13838b = aVar;
    }

    public final void a(boolean z) {
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f13837a, false, 8095, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f13837a, false, 8095, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (((Integer) LiveSettingKeys.DNS_OPT_METHOD.a()).intValue() == 1 && j.q().e().a() == null) {
            String str = "http://i.snssdk.com";
            if (!com.bytedance.android.live.uikit.a.a.g()) {
                if (PatchProxy.isSupport(new Object[0], null, com.bytedance.android.live.uikit.a.a.f8462a, true, 1757, new Class[0], Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, com.bytedance.android.live.uikit.a.a.f8462a, true, 1757, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    z2 = "cnDouyin".equals("i18nBuzz");
                }
                if (!z2) {
                    if (com.bytedance.android.live.uikit.a.a.j()) {
                        str = "http://hotapi-va.isnssdk.com";
                    }
                    c.a aVar = new c.a();
                    aVar.f78399b = str;
                    aVar.f78401d = TTLiveSDKContext.getHostService().a().g();
                    aVar.f78402e = new b() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f13839a;

                        public final String a(String str) throws Exception {
                            String str2 = str;
                            if (!PatchProxy.isSupport(new Object[]{str2}, this, f13839a, false, 8096, new Class[]{String.class}, String.class)) {
                                return new String(((d) TTLiveSDKContext.getHostService().h().a(str2, null).a()).f18821e);
                            }
                            return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f13839a, false, 8096, new Class[]{String.class}, String.class);
                        }

                        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object[]} */
                        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object[]} */
                        /* JADX WARNING: Multi-variable type inference failed */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final java.lang.String a(java.lang.String r24, byte[] r25, java.lang.String r26, java.lang.String r27) throws java.lang.Exception {
                            /*
                                r23 = this;
                                r0 = r24
                                r1 = r25
                                r3 = r27
                                r4 = 4
                                java.lang.Object[] r5 = new java.lang.Object[r4]
                                r12 = 0
                                r5[r12] = r0
                                r13 = 1
                                r5[r13] = r1
                                r14 = 2
                                r5[r14] = r26
                                r15 = 3
                                r5[r15] = r3
                                com.meituan.robust.ChangeQuickRedirect r7 = f13839a
                                java.lang.Class[] r10 = new java.lang.Class[r4]
                                java.lang.Class<java.lang.String> r6 = java.lang.String.class
                                r10[r12] = r6
                                java.lang.Class<byte[]> r6 = byte[].class
                                r10[r13] = r6
                                java.lang.Class<java.lang.String> r6 = java.lang.String.class
                                r10[r14] = r6
                                java.lang.Class<java.lang.String> r6 = java.lang.String.class
                                r10[r15] = r6
                                java.lang.Class<java.lang.String> r11 = java.lang.String.class
                                r8 = 0
                                r9 = 8097(0x1fa1, float:1.1346E-41)
                                r6 = r23
                                boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
                                if (r5 == 0) goto L_0x0067
                                java.lang.Object[] r5 = new java.lang.Object[r4]
                                r5[r12] = r0
                                r5[r13] = r1
                                r5[r14] = r26
                                r5[r15] = r3
                                com.meituan.robust.ChangeQuickRedirect r18 = f13839a
                                r19 = 0
                                r20 = 8097(0x1fa1, float:1.1346E-41)
                                java.lang.Class[] r0 = new java.lang.Class[r4]
                                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                                r0[r12] = r1
                                java.lang.Class<byte[]> r1 = byte[].class
                                r0[r13] = r1
                                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                                r0[r14] = r1
                                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                                r0[r15] = r1
                                java.lang.Class<java.lang.String> r22 = java.lang.String.class
                                r16 = r5
                                r17 = r23
                                r21 = r0
                                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
                                java.lang.String r0 = (java.lang.String) r0
                                return r0
                            L_0x0067:
                                java.lang.String r2 = new java.lang.String
                                com.bytedance.android.livesdk.v.e r4 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
                                com.bytedance.android.livesdkapi.host.h r4 = r4.h()
                                r5 = 0
                                com.bytedance.android.livesdkapi.i.e r0 = r4.a(r0, r5, r3, r1)
                                java.lang.Object r0 = r0.a()
                                com.bytedance.android.livesdkapi.i.d r0 = (com.bytedance.android.livesdkapi.i.d) r0
                                byte[] r0 = r0.f18821e
                                r2.<init>(r0)
                                return r2
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.f.a.AnonymousClass1.a(java.lang.String, byte[], java.lang.String, java.lang.String):java.lang.String");
                        }
                    };
                    com.ss.optimizer.live.sdk.a.d.a().a(aVar.a());
                    com.ss.optimizer.live.sdk.dns.a aVar2 = new com.ss.optimizer.live.sdk.dns.a(TTLiveSDKContext.getHostService().a().a().getApplicationContext());
                    j.q().e().a(aVar2);
                    aVar2.f78427e = true;
                    aVar2.f78424b.registerReceiver(aVar2.f78425c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    com.ss.optimizer.live.sdk.a.d.a().f78406c.a();
                }
            }
            str = "http://hotapi.sgsnssdk.com";
            c.a aVar3 = new c.a();
            aVar3.f78399b = str;
            aVar3.f78401d = TTLiveSDKContext.getHostService().a().g();
            aVar3.f78402e = new b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f13839a;

                public final String a(String str) throws Exception {
                    String str2 = str;
                    if (!PatchProxy.isSupport(new Object[]{str2}, this, f13839a, false, 8096, new Class[]{String.class}, String.class)) {
                        return new String(((d) TTLiveSDKContext.getHostService().h().a(str2, null).a()).f18821e);
                    }
                    return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f13839a, false, 8096, new Class[]{String.class}, String.class);
                }

                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.String a(java.lang.String r24, byte[] r25, java.lang.String r26, java.lang.String r27) {
                    /*
                        r23 = this;
                        r0 = r24
                        r1 = r25
                        r3 = r27
                        r4 = 4
                        java.lang.Object[] r5 = new java.lang.Object[r4]
                        r12 = 0
                        r5[r12] = r0
                        r13 = 1
                        r5[r13] = r1
                        r14 = 2
                        r5[r14] = r26
                        r15 = 3
                        r5[r15] = r3
                        com.meituan.robust.ChangeQuickRedirect r7 = f13839a
                        java.lang.Class[] r10 = new java.lang.Class[r4]
                        java.lang.Class<java.lang.String> r6 = java.lang.String.class
                        r10[r12] = r6
                        java.lang.Class<byte[]> r6 = byte[].class
                        r10[r13] = r6
                        java.lang.Class<java.lang.String> r6 = java.lang.String.class
                        r10[r14] = r6
                        java.lang.Class<java.lang.String> r6 = java.lang.String.class
                        r10[r15] = r6
                        java.lang.Class<java.lang.String> r11 = java.lang.String.class
                        r8 = 0
                        r9 = 8097(0x1fa1, float:1.1346E-41)
                        r6 = r23
                        boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
                        if (r5 == 0) goto L_0x0067
                        java.lang.Object[] r5 = new java.lang.Object[r4]
                        r5[r12] = r0
                        r5[r13] = r1
                        r5[r14] = r26
                        r5[r15] = r3
                        com.meituan.robust.ChangeQuickRedirect r18 = f13839a
                        r19 = 0
                        r20 = 8097(0x1fa1, float:1.1346E-41)
                        java.lang.Class[] r0 = new java.lang.Class[r4]
                        java.lang.Class<java.lang.String> r1 = java.lang.String.class
                        r0[r12] = r1
                        java.lang.Class<byte[]> r1 = byte[].class
                        r0[r13] = r1
                        java.lang.Class<java.lang.String> r1 = java.lang.String.class
                        r0[r14] = r1
                        java.lang.Class<java.lang.String> r1 = java.lang.String.class
                        r0[r15] = r1
                        java.lang.Class<java.lang.String> r22 = java.lang.String.class
                        r16 = r5
                        r17 = r23
                        r21 = r0
                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
                        java.lang.String r0 = (java.lang.String) r0
                        return r0
                    L_0x0067:
                        java.lang.String r2 = new java.lang.String
                        com.bytedance.android.livesdk.v.e r4 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
                        com.bytedance.android.livesdkapi.host.h r4 = r4.h()
                        r5 = 0
                        com.bytedance.android.livesdkapi.i.e r0 = r4.a(r0, r5, r3, r1)
                        java.lang.Object r0 = r0.a()
                        com.bytedance.android.livesdkapi.i.d r0 = (com.bytedance.android.livesdkapi.i.d) r0
                        byte[] r0 = r0.f18821e
                        r2.<init>(r0)
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.f.a.AnonymousClass1.a(java.lang.String, byte[], java.lang.String, java.lang.String):java.lang.String");
                }
            };
            com.ss.optimizer.live.sdk.a.d.a().a(aVar3.a());
            com.ss.optimizer.live.sdk.dns.a aVar22 = new com.ss.optimizer.live.sdk.dns.a(TTLiveSDKContext.getHostService().a().a().getApplicationContext());
            j.q().e().a(aVar22);
            aVar22.f78427e = true;
            aVar22.f78424b.registerReceiver(aVar22.f78425c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            com.ss.optimizer.live.sdk.a.d.a().f78406c.a();
        }
    }
}

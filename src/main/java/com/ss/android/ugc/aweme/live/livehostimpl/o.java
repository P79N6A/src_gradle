package com.ss.android.ugc.aweme.live.livehostimpl;

import android.app.Activity;
import com.bytedance.android.livesdkapi.depend.h.b;
import com.bytedance.android.livesdkapi.host.j;
import com.douyin.share.d.a.a.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.share.command.LiveShareCommandDialog;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.report.a;
import com.ss.android.ugc.aweme.share.ShareOrderService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class o implements j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53466a;

    /* renamed from: b  reason: collision with root package name */
    private static Map<String, String> f53467b;

    static {
        HashMap hashMap = new HashMap();
        f53467b = hashMap;
        hashMap.put("facebook", "facebook");
        f53467b.put("facebook_lite", "facebook_lite");
        f53467b.put("instagram", "instagram");
        f53467b.put("kakao_talk", "kakaotalk");
        f53467b.put("line", "line");
        f53467b.put("messenger", "messenger");
        f53467b.put("qq", "qq");
        f53467b.put("qzone", "qzone");
        f53467b.put("twitter", "twitter");
        f53467b.put("weibo", "weibo");
        f53467b.put("weixin", "weixin");
        f53467b.put("weixin_moment", "weixin_moments");
        f53467b.put("whatsapp", "whatsapp");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: com.douyin.baseshare.a} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f7, code lost:
        if (r0.equals("instagram") != false) goto L_0x013a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r20, android.app.Activity r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f53466a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class<android.app.Activity> r4 = android.app.Activity.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r6 = 0
            r7 = 55821(0xda0d, float:7.8222E-41)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x004e
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f53466a
            r15 = 0
            r16 = 55821(0xda0d, float:7.8222E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r13 = r19
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x004e:
            java.util.Map<java.lang.String, java.lang.String> r3 = f53467b
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r10] = r0
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f53466a
            r6 = 0
            r7 = 55820(0xda0c, float:7.822E-41)
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class<android.app.Activity> r4 = android.app.Activity.class
            r8[r11] = r4
            java.lang.Class<com.douyin.baseshare.a> r9 = com.douyin.baseshare.a.class
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            r4 = 0
            if (r3 == 0) goto L_0x009c
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f53466a
            r15 = 0
            r16 = 55820(0xda0c, float:7.822E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r0[r11] = r1
            java.lang.Class<com.douyin.baseshare.a> r18 = com.douyin.baseshare.a.class
            r13 = r19
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            r4 = r0
            com.douyin.baseshare.a r4 = (com.douyin.baseshare.a) r4
            goto L_0x015c
        L_0x009c:
            boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x015c
            if (r1 != 0) goto L_0x00a6
            goto L_0x015c
        L_0x00a6:
            r3 = -1
            int r5 = r0.hashCode()
            switch(r5) {
                case -1436108013: goto L_0x012f;
                case -929929834: goto L_0x0124;
                case -916346253: goto L_0x0119;
                case -791575966: goto L_0x010e;
                case 3616: goto L_0x0104;
                case 3321844: goto L_0x00fa;
                case 28903346: goto L_0x00f1;
                case 108102557: goto L_0x00e7;
                case 113011944: goto L_0x00dc;
                case 486515695: goto L_0x00d2;
                case 497130182: goto L_0x00c7;
                case 1620810375: goto L_0x00bc;
                case 1934780818: goto L_0x00b0;
                default: goto L_0x00ae;
            }
        L_0x00ae:
            goto L_0x0139
        L_0x00b0:
            java.lang.String r2 = "whatsapp"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0139
            r2 = 12
            goto L_0x013a
        L_0x00bc:
            java.lang.String r2 = "facebook_lite"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0139
            r2 = 1
            goto L_0x013a
        L_0x00c7:
            java.lang.String r2 = "facebook"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0139
            r2 = 0
            goto L_0x013a
        L_0x00d2:
            java.lang.String r2 = "kakaotalk"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0139
            r2 = 3
            goto L_0x013a
        L_0x00dc:
            java.lang.String r2 = "weibo"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0139
            r2 = 9
            goto L_0x013a
        L_0x00e7:
            java.lang.String r2 = "qzone"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0139
            r2 = 7
            goto L_0x013a
        L_0x00f1:
            java.lang.String r5 = "instagram"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0139
            goto L_0x013a
        L_0x00fa:
            java.lang.String r2 = "line"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0139
            r2 = 4
            goto L_0x013a
        L_0x0104:
            java.lang.String r2 = "qq"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0139
            r2 = 6
            goto L_0x013a
        L_0x010e:
            java.lang.String r2 = "weixin"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0139
            r2 = 10
            goto L_0x013a
        L_0x0119:
            java.lang.String r2 = "twitter"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0139
            r2 = 8
            goto L_0x013a
        L_0x0124:
            java.lang.String r2 = "weixin_moments"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0139
            r2 = 11
            goto L_0x013a
        L_0x012f:
            java.lang.String r2 = "messenger"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0139
            r2 = 5
            goto L_0x013a
        L_0x0139:
            r2 = -1
        L_0x013a:
            switch(r2) {
                case 0: goto L_0x015c;
                case 1: goto L_0x015c;
                case 2: goto L_0x015c;
                case 3: goto L_0x015c;
                case 4: goto L_0x015c;
                case 5: goto L_0x015c;
                case 6: goto L_0x0156;
                case 7: goto L_0x0150;
                case 8: goto L_0x015c;
                case 9: goto L_0x014a;
                case 10: goto L_0x0144;
                case 11: goto L_0x013e;
                default: goto L_0x013d;
            }
        L_0x013d:
            goto L_0x015c
        L_0x013e:
            com.douyin.share.l r0 = new com.douyin.share.l
            r0.<init>(r1)
            goto L_0x015b
        L_0x0144:
            com.douyin.share.m r0 = new com.douyin.share.m
            r0.<init>(r1)
            goto L_0x015b
        L_0x014a:
            com.douyin.share.n r0 = new com.douyin.share.n
            r0.<init>(r1)
            goto L_0x015b
        L_0x0150:
            com.douyin.share.c r0 = new com.douyin.share.c
            r0.<init>(r1)
            goto L_0x015b
        L_0x0156:
            com.douyin.share.b r0 = new com.douyin.share.b
            r0.<init>(r1)
        L_0x015b:
            r4 = r0
        L_0x015c:
            if (r4 == 0) goto L_0x0165
            boolean r0 = r4.a()
            if (r0 == 0) goto L_0x0165
            return r11
        L_0x0165:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.o.a(java.lang.String, android.app.Activity):boolean");
    }

    public final void a(Activity activity, b bVar, String str) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{activity, bVar2, str}, this, f53466a, false, 55823, new Class[]{Activity.class, b.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, bVar2, str}, this, f53466a, false, 55823, new Class[]{Activity.class, b.class, String.class}, Void.TYPE);
            return;
        }
        if (bVar2 != null) {
            String valueOf = String.valueOf(bVar2.y);
            String valueOf2 = String.valueOf(bVar2.z);
            HashMap hashMap = new HashMap(1);
            hashMap.put("room_id", String.valueOf(bVar2.f18669d));
            a.a(activity, str, valueOf, valueOf2, "", false, hashMap);
        }
    }

    public final void a(Activity activity, b bVar, com.bytedance.android.livesdkapi.depend.h.a aVar) {
        com.bytedance.android.live.base.model.c.a aVar2;
        Activity activity2 = activity;
        b bVar2 = bVar;
        final com.bytedance.android.livesdkapi.depend.h.a aVar3 = aVar;
        if (PatchProxy.isSupport(new Object[]{activity2, bVar2, aVar3}, this, f53466a, false, 55822, new Class[]{Activity.class, b.class, com.bytedance.android.livesdkapi.depend.h.a.class}, Void.TYPE)) {
            Object[] objArr = {activity2, bVar2, aVar3};
            PatchProxy.accessDispatch(objArr, this, f53466a, false, 55822, new Class[]{Activity.class, b.class, com.bytedance.android.livesdkapi.depend.h.a.class}, Void.TYPE);
            return;
        }
        IShareService.ShareStruct a2 = com.ss.android.ugc.aweme.live.b.a.a(activity, bVar);
        LiveShareCommandDialog liveShareCommandDialog = new LiveShareCommandDialog(activity2, a2, new ArrayList(Arrays.asList(((ShareOrderService) ServiceManager.get().getService(ShareOrderService.class)).getUrlShareList(true))), new LiveShareCommandDialog.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f53468a;

            public final void a(String str, String str2) {
                String str3 = str;
                String str4 = str2;
                if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f53468a, false, 55825, new Class[]{String.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f53468a, false, 55825, new Class[]{String.class, String.class}, Void.TYPE);
                    return;
                }
                aVar3.a(str3, str4);
            }
        });
        boolean z = true;
        if (PatchProxy.isSupport(new Object[0], bVar, b.f18666a, false, 15051, new Class[0], com.bytedance.android.live.base.model.c.a.class)) {
            aVar2 = (com.bytedance.android.live.base.model.c.a) PatchProxy.accessDispatch(new Object[0], bVar, b.f18666a, false, 15051, new Class[0], com.bytedance.android.live.base.model.c.a.class);
        } else if (bVar2.w == null) {
            aVar2 = com.bytedance.android.live.base.model.c.a.defaultOne();
        } else {
            aVar2 = bVar2.w;
        }
        if (!aVar2.hasDouPlusEntry || bVar2.t) {
            z = false;
        }
        aVar2.hasDouPlusEntry = z;
        liveShareCommandDialog.g = aVar2;
        liveShareCommandDialog.updateShareStruct(a2);
        liveShareCommandDialog.show();
    }

    public final void b(Activity activity, b bVar, com.bytedance.android.livesdkapi.depend.h.a aVar) {
        Activity activity2 = activity;
        b bVar2 = bVar;
        com.bytedance.android.livesdkapi.depend.h.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{activity2, bVar2, aVar2}, this, f53466a, false, 55824, new Class[]{Activity.class, b.class, com.bytedance.android.livesdkapi.depend.h.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, bVar2, aVar2}, this, f53466a, false, 55824, new Class[]{Activity.class, b.class, com.bytedance.android.livesdkapi.depend.h.a.class}, Void.TYPE);
            return;
        }
        if (f53467b.containsKey(bVar2.f18667b)) {
            IShareService.ShareResult a2 = d.a(activity2, com.ss.android.ugc.aweme.live.b.a.a(activity, bVar), f53467b.get(bVar2.f18667b));
            if (aVar2 != null) {
                if (a2.success) {
                    aVar2.a(bVar2.f18667b, "link");
                    return;
                }
                aVar2.a(new Throwable());
            }
        }
    }
}

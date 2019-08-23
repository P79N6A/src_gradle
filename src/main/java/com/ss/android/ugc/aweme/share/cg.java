package com.ss.android.ugc.aweme.share;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.frameworks.plugin.pm.c;
import com.douyin.share.a.c.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.common.util.i;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.feed.share.e;
import com.ss.android.ugc.aweme.feed.share.f;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.profile.q;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.share.seconditem.j;
import com.ss.android.ugc.aweme.u;
import java.util.ArrayList;
import java.util.List;

public final class cg {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64940a;

    public interface a {
        void a(com.douyin.baseshare.a aVar);
    }

    public static List<cl> a() {
        if (PatchProxy.isSupport(new Object[0], null, f64940a, true, 73314, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], null, f64940a, true, 73314, new Class[0], List.class);
        }
        List<cl> list = f.a().f46049b;
        if (list == null) {
            return new ArrayList();
        }
        boolean z = (!c.b("com.ss.android.ugc.aweme.fusionfuelplugin")) & (!q.a(GlobalContext.getContext()));
        for (int size = list.size() - 1; size >= 0; size--) {
            cl clVar = list.get(size);
            if (clVar.f64988c == 4) {
                list.remove(size);
            }
            if (TextUtils.equals("chat_merge", clVar.f64986a) && !b.b()) {
                list.remove(size);
            }
            if (TextUtils.equals("instagram", clVar.f64986a)) {
                list.remove(size);
            }
            if (!cn.a(clVar.f64986a)) {
                list.remove(size);
            }
            if (z && (TextUtils.equals("rocket", clVar.f64986a) || TextUtils.equals("rocket_space", clVar.f64986a))) {
                list.remove(size);
            }
        }
        return list;
    }

    public static boolean a(String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, null, f64940a, true, 73318, new Class[]{String.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, null, f64940a, true, 73318, new Class[]{String.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        cl a2 = a(str2, a());
        return a2 != null && a2.f64988c == i;
    }

    public static void a(e eVar, Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{eVar, context2}, null, f64940a, true, 73319, new Class[]{e.class, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar, context2}, null, f64940a, true, 73319, new Class[]{e.class, Context.class}, Void.TYPE);
            return;
        }
        if (eVar != null) {
            if (ToolUtils.isInstalledApp(context2, eVar.a())) {
                ToolUtils.openInstalledApp(context2, eVar.a());
                return;
            }
            com.bytedance.ies.dmt.ui.d.a.c(context2, eVar.a(context)).a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x010f, code lost:
        if (r1.equals("weixin") != false) goto L_0x011d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0131  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r25, java.lang.String r26, java.util.ArrayList<android.net.Uri> r27, java.lang.String r28, java.lang.String r29) {
        /*
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = 5
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r13 = 0
            r6[r13] = r0
            r14 = 1
            r6[r14] = r1
            r15 = 2
            r6[r15] = r2
            r16 = 3
            r6[r16] = r3
            r17 = 4
            r6[r17] = r4
            com.meituan.robust.ChangeQuickRedirect r8 = f64940a
            java.lang.Class[] r11 = new java.lang.Class[r5]
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r11[r13] = r7
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r11[r14] = r7
            java.lang.Class<java.util.ArrayList> r7 = java.util.ArrayList.class
            r11[r15] = r7
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r11[r16] = r7
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r11[r17] = r7
            java.lang.Class r12 = java.lang.Void.TYPE
            r7 = 0
            r9 = 1
            r10 = 73320(0x11e68, float:1.02743E-40)
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r6, r7, r8, r9, r10, r11, r12)
            if (r6 == 0) goto L_0x0078
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r13] = r0
            r6[r14] = r1
            r6[r15] = r2
            r6[r16] = r3
            r6[r17] = r4
            r19 = 0
            com.meituan.robust.ChangeQuickRedirect r20 = f64940a
            r21 = 1
            r22 = 73320(0x11e68, float:1.02743E-40)
            java.lang.Class[] r0 = new java.lang.Class[r5]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r13] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r14] = r1
            java.lang.Class<java.util.ArrayList> r1 = java.util.ArrayList.class
            r0[r15] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r16] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r17] = r1
            java.lang.Class r24 = java.lang.Void.TYPE
            r18 = r6
            r23 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r18, r19, r20, r21, r22, r23, r24)
            return
        L_0x0078:
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            if (r2 == 0) goto L_0x00cc
            int r6 = r27.size()
            if (r6 > 0) goto L_0x0086
            goto L_0x00cc
        L_0x0086:
            int r6 = r27.size()
            if (r6 != r14) goto L_0x00bc
            java.lang.String r6 = "android.intent.action.SEND"
            r5.setAction(r6)
            java.net.FileNameMap r6 = java.net.URLConnection.getFileNameMap()
            java.lang.Object r7 = r2.get(r13)
            android.net.Uri r7 = (android.net.Uri) r7
            java.lang.String r7 = r7.toString()
            java.lang.String r6 = r6.getContentTypeFor(r7)
            if (r6 == 0) goto L_0x00ab
            int r7 = r6.length()
            if (r7 > 0) goto L_0x00ad
        L_0x00ab:
            java.lang.String r6 = "image/*"
        L_0x00ad:
            r5.setType(r6)
            java.lang.String r6 = "android.intent.extra.STREAM"
            java.lang.Object r2 = r2.get(r13)
            android.os.Parcelable r2 = (android.os.Parcelable) r2
            r5.putExtra(r6, r2)
            goto L_0x00d6
        L_0x00bc:
            java.lang.String r6 = "android.intent.action.SEND_MULTIPLE"
            r5.setAction(r6)
            java.lang.String r6 = "android.intent.extra.STREAM"
            r5.putParcelableArrayListExtra(r6, r2)
            java.lang.String r2 = "image/*"
            r5.setType(r2)
            goto L_0x00d6
        L_0x00cc:
            java.lang.String r2 = "android.intent.action.SEND"
            r5.setAction(r2)
            java.lang.String r2 = "text/plain"
            r5.setType(r2)
        L_0x00d6:
            boolean r2 = android.text.TextUtils.isEmpty(r28)
            if (r2 != 0) goto L_0x00e1
            java.lang.String r2 = "android.intent.extra.SUBJECT"
            r5.putExtra(r2, r3)
        L_0x00e1:
            java.lang.String r2 = "android.intent.extra.TEXT"
            r5.putExtra(r2, r4)
            java.lang.String r2 = "Kdescription"
            r5.putExtra(r2, r4)
            r2 = -1
            int r3 = r26.hashCode()
            r4 = -929929834(0xffffffffc8926596, float:-299820.7)
            if (r3 == r4) goto L_0x0112
            r4 = -791575966(0xffffffffd0d18262, float:-2.81198633E10)
            if (r3 == r4) goto L_0x0109
            r4 = 3616(0xe20, float:5.067E-42)
            if (r3 == r4) goto L_0x00ff
            goto L_0x011c
        L_0x00ff:
            java.lang.String r3 = "qq"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x011c
            r13 = 2
            goto L_0x011d
        L_0x0109:
            java.lang.String r3 = "weixin"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x011c
            goto L_0x011d
        L_0x0112:
            java.lang.String r3 = "weixin_moments"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x011c
            r13 = 1
            goto L_0x011d
        L_0x011c:
            r13 = -1
        L_0x011d:
            switch(r13) {
                case 0: goto L_0x0131;
                case 1: goto L_0x0129;
                case 2: goto L_0x0121;
                default: goto L_0x0120;
            }
        L_0x0120:
            goto L_0x0138
        L_0x0121:
            java.lang.String r1 = "com.tencent.mobileqq"
            java.lang.String r2 = "com.tencent.mobileqq.activity.JumpActivity"
            r5.setClassName(r1, r2)
            goto L_0x0143
        L_0x0129:
            java.lang.String r1 = "com.tencent.mm"
            java.lang.String r2 = "com.tencent.mm.ui.tools.ShareToTimeLineUI"
            r5.setClassName(r1, r2)
            goto L_0x0138
        L_0x0131:
            java.lang.String r1 = "com.tencent.mm"
            java.lang.String r2 = "com.tencent.mm.ui.tools.ShareImgUI"
            r5.setClassName(r1, r2)
        L_0x0138:
            r1 = 2131558496(0x7f0d0060, float:1.874231E38)
            java.lang.String r1 = r0.getString(r1)
            android.content.Intent r5 = android.content.Intent.createChooser(r5, r1)
        L_0x0143:
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r5.setFlags(r1)
            r0.startActivity(r5)     // Catch:{ Exception -> 0x014c }
            return
        L_0x014c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.cg.a(android.content.Context, java.lang.String, java.util.ArrayList, java.lang.String, java.lang.String):void");
    }

    public static boolean a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f64940a, true, 73321, new Class[]{String.class}, Boolean.TYPE)) {
            return TextUtils.equals(d.a().getCurUserId(), str2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f64940a, true, 73321, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public static String a(IShareService.ShareStruct shareStruct, String str) {
        IShareService.ShareStruct shareStruct2 = shareStruct;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{shareStruct2, str2}, null, f64940a, true, 73327, new Class[]{IShareService.ShareStruct.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{shareStruct2, str2}, null, f64940a, true, 73327, new Class[]{IShareService.ShareStruct.class, String.class}, String.class);
        } else if (shareStruct2 == null) {
            return null;
        } else {
            return a(shareStruct2.url, str2, shareStruct2.boolPersist);
        }
    }

    private static String a(String str, String str2, boolean z) {
        String str3;
        String str4 = str;
        String str5 = str2;
        if (PatchProxy.isSupport(new Object[]{str4, str5, Byte.valueOf(z ? (byte) 1 : 0)}, null, f64940a, true, 73328, new Class[]{String.class, String.class, Boolean.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str4, str5, Byte.valueOf(z)}, null, f64940a, true, 73328, new Class[]{String.class, String.class, Boolean.TYPE}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            if (!str4.contains("utm_source")) {
                i iVar = new i(str4);
                iVar.a("utm_source", str5);
                iVar.a("utm_campaign", "client_share");
                iVar.a("utm_medium", "android");
                iVar.a("share_app_name", com.ss.android.ugc.aweme.framework.core.a.b().f3305c);
                if (!cc.a()) {
                    iVar.a("iid", AppLog.getInstallId());
                }
                str3 = iVar.a();
            } else {
                str3 = str4.replaceAll("utm_source=\\w*_?\\w?", "utm_source=" + str5);
            }
            return u.a().a(str3, z);
        }
    }

    @SuppressLint({"LogNotTimber"})
    public static boolean a(Context context, String str, String str2, IShareService.ShareStruct shareStruct) {
        Context context2 = context;
        String str3 = str2;
        IShareService.ShareStruct shareStruct2 = shareStruct;
        if (PatchProxy.isSupport(new Object[]{context2, str, str3, shareStruct2}, null, f64940a, true, 73329, new Class[]{Context.class, String.class, String.class, IShareService.ShareStruct.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, str, str3, shareStruct2}, null, f64940a, true, 73329, new Class[]{Context.class, String.class, String.class, IShareService.ShareStruct.class}, Boolean.TYPE)).booleanValue();
        } else if (context2 == null) {
            return false;
        } else {
            com.douyin.share.d.a.a.e eVar = new com.douyin.share.d.a.a.e(context2, shareStruct2);
            eVar.f23213e = str3;
            if (TextUtils.isEmpty(eVar.d())) {
                eVar.f23212d = context2.getString(C0906R.string.c6e);
            }
            try {
                return new r(context2, TextUtils.isEmpty(str) ? "wxf6916efac92cfe2b" : str).a(eVar, null);
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.douyin.baseshare.a[] a(com.douyin.baseshare.a[] r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f64940a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.douyin.baseshare.a[]> r3 = com.douyin.baseshare.a[].class
            r7[r9] = r3
            java.lang.Class<com.douyin.baseshare.a[]> r8 = com.douyin.baseshare.a[].class
            r3 = 0
            r5 = 1
            r6 = 73330(0x11e72, float:1.02757E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f64940a
            r13 = 1
            r14 = 73330(0x11e72, float:1.02757E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.douyin.baseshare.a[]> r0 = com.douyin.baseshare.a[].class
            r15[r9] = r0
            java.lang.Class<com.douyin.baseshare.a[]> r16 = com.douyin.baseshare.a[].class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.douyin.baseshare.a[] r0 = (com.douyin.baseshare.a[]) r0
            return r0
        L_0x0037:
            java.lang.String r1 = "rocket_space"
            com.douyin.baseshare.a[] r0 = a((com.douyin.baseshare.a[]) r0, (java.lang.String) r1)
            boolean r1 = com.ss.android.ugc.aweme.profile.q.a()
            if (r1 != 0) goto L_0x0049
            java.lang.String r1 = "rocket"
            com.douyin.baseshare.a[] r0 = a((com.douyin.baseshare.a[]) r0, (java.lang.String) r1)
        L_0x0049:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.cg.a(com.douyin.baseshare.a[]):com.douyin.baseshare.a[]");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.douyin.baseshare.a[] a(com.douyin.baseshare.a[] r19, java.lang.String r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f64940a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<com.douyin.baseshare.a[]> r4 = com.douyin.baseshare.a[].class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class<com.douyin.baseshare.a[]> r9 = com.douyin.baseshare.a[].class
            r4 = 0
            r6 = 1
            r7 = 73332(0x11e74, float:1.0276E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0048
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f64940a
            r15 = 1
            r16 = 73332(0x11e74, float:1.0276E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<com.douyin.baseshare.a[]> r1 = com.douyin.baseshare.a[].class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<com.douyin.baseshare.a[]> r18 = com.douyin.baseshare.a[].class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            com.douyin.baseshare.a[] r0 = (com.douyin.baseshare.a[]) r0
            return r0
        L_0x0048:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r0.length
        L_0x004e:
            if (r10 >= r3) goto L_0x0064
            r4 = r0[r10]
            if (r4 == 0) goto L_0x0061
            java.lang.String r5 = r4.d()
            boolean r5 = android.text.TextUtils.equals(r1, r5)
            if (r5 != 0) goto L_0x0061
            r2.add(r4)
        L_0x0061:
            int r10 = r10 + 1
            goto L_0x004e
        L_0x0064:
            int r0 = r2.size()
            com.douyin.baseshare.a[] r0 = new com.douyin.baseshare.a[r0]
            java.lang.Object[] r0 = r2.toArray(r0)
            com.douyin.baseshare.a[] r0 = (com.douyin.baseshare.a[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.cg.a(com.douyin.baseshare.a[], java.lang.String):com.douyin.baseshare.a[]");
    }

    public static boolean a(com.douyin.baseshare.a aVar) {
        if (!PatchProxy.isSupport(new Object[]{aVar}, null, f64940a, true, 73337, new Class[]{com.douyin.baseshare.a.class}, Boolean.TYPE)) {
            return TextUtils.equals(aVar.d(), "weixin") || TextUtils.equals(aVar.d(), "weixin_moments") || TextUtils.equals(aVar.d(), "qq") || TextUtils.equals(aVar.d(), "qzone");
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar}, null, f64940a, true, 73337, new Class[]{com.douyin.baseshare.a.class}, Boolean.TYPE)).booleanValue();
    }

    public static boolean c() {
        if (PatchProxy.isSupport(new Object[0], null, f64940a, true, 73335, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f64940a, true, 73335, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return com.ss.android.ugc.aweme.aj.b.b().c(k.a(), "tencent_sdk_disabled");
    }

    public static List<String> b() {
        if (PatchProxy.isSupport(new Object[0], null, f64940a, true, 73315, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], null, f64940a, true, 73315, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (a() == null || a().size() == 0) {
            arrayList.add("chat_merge");
            arrayList.add("qq");
            arrayList.add("qzone");
            arrayList.add("weixin");
            arrayList.add("weixin_moments");
            arrayList.add("toutiao");
            arrayList.add("weibo");
            arrayList.add("more");
        } else {
            for (cl clVar : a()) {
                arrayList.add(clVar.f64986a);
            }
            if (PatchProxy.isSupport(new Object[]{arrayList}, null, f64940a, true, 73316, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{arrayList}, null, f64940a, true, 73316, new Class[]{List.class}, Void.TYPE);
            } else {
                try {
                    if (g.b().aL() != null && g.b().aL().booleanValue() && !arrayList.contains("rocket") && q.a(GlobalContext.getContext())) {
                        int indexOf = arrayList.indexOf("weixin");
                        int indexOf2 = arrayList.indexOf("weixin_moments");
                        int size = arrayList.size();
                        if (indexOf2 > indexOf) {
                            size = indexOf2 + 1;
                        } else if (indexOf != -1) {
                            size = indexOf + 1;
                        }
                        arrayList.add(size, "rocket");
                    }
                } catch (com.bytedance.ies.a | Exception unused) {
                }
            }
        }
        return arrayList;
    }

    public static boolean b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f64940a, true, 73334, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f64940a, true, 73334, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if ((TextUtils.equals(str2, "weixin") || TextUtils.equals(str2, "qq") || TextUtils.equals(str2, "qzone") || TextUtils.equals(str2, "weixin_moments")) && c()) {
            return true;
        } else {
            return false;
        }
    }

    public static cl a(String str, List<cl> list) {
        String str2 = str;
        List<cl> list2 = list;
        if (PatchProxy.isSupport(new Object[]{str2, list2}, null, f64940a, true, 73317, new Class[]{String.class, List.class}, cl.class)) {
            return (cl) PatchProxy.accessDispatch(new Object[]{str2, list2}, null, f64940a, true, 73317, new Class[]{String.class, List.class}, cl.class);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cl clVar = list2.get(i);
            if (TextUtils.equals(str2, clVar.f64986a)) {
                return clVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0070, code lost:
        if (r1.equals("weibo") == false) goto L_0x009b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.douyin.baseshare.a a(android.app.Activity r19, java.lang.String r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f64940a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.app.Activity> r4 = android.app.Activity.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class<com.douyin.baseshare.a> r9 = com.douyin.baseshare.a.class
            r4 = 0
            r6 = 1
            r7 = 73336(0x11e78, float:1.02766E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0048
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f64940a
            r15 = 1
            r16 = 73336(0x11e78, float:1.02766E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<com.douyin.baseshare.a> r18 = com.douyin.baseshare.a.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            com.douyin.baseshare.a r0 = (com.douyin.baseshare.a) r0
            return r0
        L_0x0048:
            r3 = 0
            if (r0 != 0) goto L_0x004c
            return r3
        L_0x004c:
            r4 = -1
            int r5 = r20.hashCode()
            r6 = -929929834(0xffffffffc8926596, float:-299820.7)
            if (r5 == r6) goto L_0x0091
            r6 = -791575966(0xffffffffd0d18262, float:-2.81198633E10)
            if (r5 == r6) goto L_0x0087
            r6 = 3616(0xe20, float:5.067E-42)
            if (r5 == r6) goto L_0x007d
            r6 = 108102557(0x671839d, float:4.5423756E-35)
            if (r5 == r6) goto L_0x0073
            r6 = 113011944(0x6bc6ce8, float:7.0877763E-35)
            if (r5 == r6) goto L_0x006a
            goto L_0x009b
        L_0x006a:
            java.lang.String r5 = "weibo"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x009b
            goto L_0x009c
        L_0x0073:
            java.lang.String r2 = "qzone"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x009b
            r2 = 4
            goto L_0x009c
        L_0x007d:
            java.lang.String r2 = "qq"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x009b
            r2 = 3
            goto L_0x009c
        L_0x0087:
            java.lang.String r2 = "weixin"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x009b
            r2 = 0
            goto L_0x009c
        L_0x0091:
            java.lang.String r2 = "weixin_moments"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x009b
            r2 = 1
            goto L_0x009c
        L_0x009b:
            r2 = -1
        L_0x009c:
            switch(r2) {
                case 0: goto L_0x00b8;
                case 1: goto L_0x00b2;
                case 2: goto L_0x00ac;
                case 3: goto L_0x00a6;
                case 4: goto L_0x00a0;
                default: goto L_0x009f;
            }
        L_0x009f:
            return r3
        L_0x00a0:
            com.douyin.share.c r1 = new com.douyin.share.c
            r1.<init>(r0)
            return r1
        L_0x00a6:
            com.douyin.share.b r1 = new com.douyin.share.b
            r1.<init>(r0)
            return r1
        L_0x00ac:
            com.douyin.share.n r1 = new com.douyin.share.n
            r1.<init>(r0)
            return r1
        L_0x00b2:
            com.douyin.share.l r1 = new com.douyin.share.l
            r1.<init>(r0)
            return r1
        L_0x00b8:
            com.douyin.share.m r1 = new com.douyin.share.m
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.cg.a(android.app.Activity, java.lang.String):com.douyin.baseshare.a");
    }

    public static cu a(Activity activity, int i, View.OnClickListener onClickListener) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{activity, Integer.valueOf(i), onClickListener}, null, f64940a, true, 73324, new Class[]{Activity.class, Integer.TYPE, View.OnClickListener.class}, cu.class)) {
            return (cu) PatchProxy.accessDispatch(new Object[]{activity, Integer.valueOf(i), onClickListener}, null, f64940a, true, 73324, new Class[]{Activity.class, Integer.TYPE, View.OnClickListener.class}, cu.class);
        } else if (i2 == 2) {
            return ct.a(activity, i, onClickListener);
        } else {
            if (i2 == 3) {
                return ct.b(activity, i, onClickListener);
            }
            return cu.c(activity, i, onClickListener);
        }
    }

    public static j a(Activity activity, com.douyin.baseshare.a aVar, View.OnClickListener onClickListener) {
        Activity activity2 = activity;
        View.OnClickListener onClickListener2 = onClickListener;
        if (PatchProxy.isSupport(new Object[]{activity2, aVar, onClickListener2}, null, f64940a, true, 73322, new Class[]{Activity.class, com.douyin.baseshare.a.class, View.OnClickListener.class}, j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[]{activity2, aVar, onClickListener2}, null, f64940a, true, 73322, new Class[]{Activity.class, com.douyin.baseshare.a.class, View.OnClickListener.class}, j.class);
        } else if (!TextUtils.equals(aVar.d(), "chat_merge") || !b.c()) {
            return j.a((Context) activity2, aVar.f(), aVar.e(), onClickListener2);
        } else {
            return a(activity2, 0, onClickListener2);
        }
    }

    public static j a(Activity activity, com.douyin.baseshare.a aVar, int i, View.OnClickListener onClickListener) {
        Activity activity2 = activity;
        int i2 = i;
        View.OnClickListener onClickListener2 = onClickListener;
        if (PatchProxy.isSupport(new Object[]{activity2, aVar, Integer.valueOf(i), onClickListener2}, null, f64940a, true, 73323, new Class[]{Activity.class, com.douyin.baseshare.a.class, Integer.TYPE, View.OnClickListener.class}, j.class)) {
            Object[] objArr = {activity2, aVar, Integer.valueOf(i), onClickListener2};
            return (j) PatchProxy.accessDispatch(objArr, null, f64940a, true, 73323, new Class[]{Activity.class, com.douyin.baseshare.a.class, Integer.TYPE, View.OnClickListener.class}, j.class);
        }
        if (TextUtils.equals(aVar.d(), "chat_merge") && i2 == 5) {
            int i3 = AbTestManager.a().d().mXPlanStyle;
            if (i3 > 0 && i3 < 1001) {
                return a(activity2, 0, onClickListener2);
            }
        }
        if (!TextUtils.equals(aVar.d(), "chat_merge") || !b.c()) {
            return j.a((Context) activity2, aVar.f(), aVar.e(), onClickListener2);
        }
        return a(activity2, i2, onClickListener2);
    }
}

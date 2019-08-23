package com.ss.android.ugc.aweme.im;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.feed.j;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.share.i;
import com.ss.android.ugc.aweme.feed.widget.g;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.a.e;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50051a;

    /* renamed from: com.ss.android.ugc.aweme.im.b$b  reason: collision with other inner class name */
    public interface C0026b {
        h a();
    }

    public interface a {
        void a();

        void a(IShareService.ShareStruct shareStruct);

        void a(IShareService.ShareStruct shareStruct, g gVar);

        boolean b();
    }

    public static IMUser a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f50051a, true, 50033, new Class[]{User.class}, IMUser.class)) {
            return (IMUser) PatchProxy.accessDispatch(new Object[]{user}, null, f50051a, true, 50033, new Class[]{User.class}, IMUser.class);
        } else if (user == null) {
            return null;
        } else {
            return IMUser.fromUser(user);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(25:4|5|6|7|8|9|10|11|12|13|14|(1:16)(1:17)|20|21|22|23|24|25|26|27|(2:28|29)|30|(1:33)(2:34|(1:36)(1:37))|38|39) */
    /* JADX WARNING: Can't wrap try/catch for region: R(26:4|5|6|7|8|9|10|11|12|13|14|(1:16)(1:17)|20|21|22|23|24|25|26|27|28|29|30|(1:33)(2:34|(1:36)(1:37))|38|39) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a8, code lost:
        r8.f52881d = com.ss.android.ugc.aweme.app.SharePrefCache.inst().getMultiSelectLimit();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0073 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0079 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x00b8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00c3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00cd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00d7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x005a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0069 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0083 A[Catch:{ a -> 0x00a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009d A[Catch:{ a -> 0x00a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.ugc.aweme.im.service.model.d a(android.content.SharedPreferences.Editor r16, com.ss.android.ugc.aweme.global.config.settings.pojo.a r17) {
        /*
            r0 = r16
            r7 = r17
            r1 = 2
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r15 = 0
            r8[r15] = r0
            r2 = 1
            r8[r2] = r7
            com.meituan.robust.ChangeQuickRedirect r10 = f50051a
            java.lang.Class[] r13 = new java.lang.Class[r1]
            java.lang.Class<android.content.SharedPreferences$Editor> r3 = android.content.SharedPreferences.Editor.class
            r13[r15] = r3
            java.lang.Class<com.ss.android.ugc.aweme.global.config.settings.pojo.a> r3 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.class
            r13[r2] = r3
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.d> r14 = com.ss.android.ugc.aweme.im.service.model.d.class
            r9 = 0
            r11 = 1
            r12 = 50034(0xc372, float:7.0113E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r8, r9, r10, r11, r12, r13, r14)
            if (r3 == 0) goto L_0x0046
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r4[r15] = r0
            r4[r2] = r7
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = f50051a
            r7 = 1
            r8 = 50034(0xc372, float:7.0113E-41)
            java.lang.Class[] r9 = new java.lang.Class[r1]
            java.lang.Class<android.content.SharedPreferences$Editor> r0 = android.content.SharedPreferences.Editor.class
            r9[r15] = r0
            java.lang.Class<com.ss.android.ugc.aweme.global.config.settings.pojo.a> r0 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.class
            r9[r2] = r0
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.d> r10 = com.ss.android.ugc.aweme.im.service.model.d.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.im.service.model.d r0 = (com.ss.android.ugc.aweme.im.service.model.d) r0
            return r0
        L_0x0046:
            com.ss.android.ugc.aweme.im.service.model.d r8 = new com.ss.android.ugc.aweme.im.service.model.d
            r8.<init>()
            com.ss.android.ugc.aweme.app.SharePrefCache r1 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()     // Catch:{ a -> 0x005a }
            com.ss.android.ugc.aweme.app.an r1 = r1.getOpenImLinkItem()     // Catch:{ a -> 0x005a }
            java.lang.Integer r2 = r17.R()     // Catch:{ a -> 0x005a }
            r1.b((android.content.SharedPreferences.Editor) r0, r2)     // Catch:{ a -> 0x005a }
        L_0x005a:
            com.ss.android.ugc.aweme.app.SharePrefCache r1 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()     // Catch:{ a -> 0x0069 }
            com.ss.android.ugc.aweme.app.an r1 = r1.getImUrlTemplateItem()     // Catch:{ a -> 0x0069 }
            java.lang.String r2 = r17.S()     // Catch:{ a -> 0x0069 }
            r1.b((android.content.SharedPreferences.Editor) r0, r2)     // Catch:{ a -> 0x0069 }
        L_0x0069:
            java.lang.Integer r1 = r17.R()     // Catch:{ a -> 0x0073 }
            int r1 = r1.intValue()     // Catch:{ a -> 0x0073 }
            r8.f52879b = r1     // Catch:{ a -> 0x0073 }
        L_0x0073:
            java.lang.String r1 = r17.S()     // Catch:{ a -> 0x0079 }
            r8.f52880c = r1     // Catch:{ a -> 0x0079 }
        L_0x0079:
            java.lang.Integer r1 = r17.T()     // Catch:{ a -> 0x00a8 }
            int r1 = r1.intValue()     // Catch:{ a -> 0x00a8 }
            if (r1 <= 0) goto L_0x009d
            com.ss.android.ugc.aweme.app.SharePrefCache r1 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()     // Catch:{ a -> 0x00a8 }
            com.ss.android.ugc.aweme.app.an r1 = r1.getMultiSelectLimitItem()     // Catch:{ a -> 0x00a8 }
            java.lang.Integer r2 = r17.T()     // Catch:{ a -> 0x00a8 }
            r1.b((android.content.SharedPreferences.Editor) r0, r2)     // Catch:{ a -> 0x00a8 }
            java.lang.Integer r0 = r17.T()     // Catch:{ a -> 0x00a8 }
            int r0 = r0.intValue()     // Catch:{ a -> 0x00a8 }
            r8.f52881d = r0     // Catch:{ a -> 0x00a8 }
            goto L_0x00b2
        L_0x009d:
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()     // Catch:{ a -> 0x00a8 }
            int r0 = r0.getMultiSelectLimit()     // Catch:{ a -> 0x00a8 }
            r8.f52881d = r0     // Catch:{ a -> 0x00a8 }
            goto L_0x00b2
        L_0x00a8:
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            int r0 = r0.getMultiSelectLimit()
            r8.f52881d = r0
        L_0x00b2:
            com.ss.android.ugc.aweme.global.config.settings.pojo.FlipChatSettings r0 = r17.av()     // Catch:{ a -> 0x00b8 }
            r8.f52882e = r0     // Catch:{ a -> 0x00b8 }
        L_0x00b8:
            com.ss.android.ugc.aweme.im.service.model.e r0 = new com.ss.android.ugc.aweme.im.service.model.e     // Catch:{ a -> 0x00c3 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.IMXPlanSetting r1 = r17.ad()     // Catch:{ a -> 0x00c3 }
            r0.<init>(r1)     // Catch:{ a -> 0x00c3 }
            r8.f52883f = r0     // Catch:{ a -> 0x00c3 }
        L_0x00c3:
            java.lang.Integer r0 = r17.ae()     // Catch:{ a -> 0x00cd }
            int r0 = r0.intValue()     // Catch:{ a -> 0x00cd }
            r8.g = r0     // Catch:{ a -> 0x00cd }
        L_0x00cd:
            java.lang.Integer r0 = r17.af()     // Catch:{ a -> 0x00d7 }
            int r0 = r0.intValue()     // Catch:{ a -> 0x00d7 }
            r8.h = r0     // Catch:{ a -> 0x00d7 }
        L_0x00d7:
            com.ss.android.ugc.aweme.global.config.settings.pojo.ImCreateChatBubble r0 = r17.bz()     // Catch:{ a -> 0x00f3 }
            java.lang.Integer r0 = r0.getShowFlag()     // Catch:{ a -> 0x00f3 }
            int r0 = r0.intValue()     // Catch:{ a -> 0x00f3 }
            r8.j = r0     // Catch:{ a -> 0x00f3 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.ImCreateChatBubble r0 = r17.bz()     // Catch:{ a -> 0x00f3 }
            java.lang.Integer r0 = r0.getTimeInterval()     // Catch:{ a -> 0x00f3 }
            int r0 = r0.intValue()     // Catch:{ a -> 0x00f3 }
            r8.k = r0     // Catch:{ a -> 0x00f3 }
        L_0x00f3:
            java.lang.Object[] r0 = new java.lang.Object[r15]
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a
            r3 = 0
            r4 = 48641(0xbe01, float:6.816E-41)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x011c
            java.lang.Object[] r0 = new java.lang.Object[r15]
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a
            r3 = 0
            r4 = 48641(0xbe01, float:6.816E-41)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r1 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.util.List r0 = (java.util.List) r0
            goto L_0x0137
        L_0x011c:
            com.bytedance.ies.c r0 = r7.f49569c
            if (r0 != 0) goto L_0x0127
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings r0 = r7.f49568b
            java.util.List r0 = r0.getImImageDomains()
            goto L_0x0137
        L_0x0127:
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings r0 = r7.f49568b
            java.util.List r0 = r0.getImImageDomains()
            com.bytedance.ies.c r1 = r7.f49569c
            java.lang.String r2 = "im_image_domains"
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.util.List r0 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.a((com.bytedance.ies.c) r1, (java.lang.String) r2, (java.lang.Class<T>) r3, (java.util.List<T>) r0)
        L_0x0137:
            r8.i = r0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.b.a(android.content.SharedPreferences$Editor, com.ss.android.ugc.aweme.global.config.settings.pojo.a):com.ss.android.ugc.aweme.im.service.model.d");
    }

    public static void a(Context context, IShareService.ShareStruct shareStruct, List<Aweme> list) {
        Context context2 = context;
        IShareService.ShareStruct shareStruct2 = shareStruct;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{context2, shareStruct2, list}, null, f50051a, true, 50039, new Class[]{Context.class, IShareService.ShareStruct.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, shareStruct2, list}, null, f50051a, true, 50039, new Class[]{Context.class, IShareService.ShareStruct.class, List.class}, Void.TYPE);
            return;
        }
        if (shareStruct2 != null) {
            if (list != null && list.size() >= 3) {
                ArrayList arrayList = new ArrayList();
                for (Aweme next : list) {
                    if (next.getAwemeType() == 2) {
                        arrayList.add(i.a(next));
                    } else {
                        arrayList.add(next.getVideo().getCover());
                    }
                    i++;
                    if (i >= 3) {
                        break;
                    }
                }
                if (arrayList.size() >= 3) {
                    shareStruct2.extraParams.put("cover_thumb", JSON.toJSONString(arrayList));
                }
            }
            Bundle bundle = new Bundle();
            bundle.putSerializable("share_struct", shareStruct2);
            a().enterChooseContact(context2, bundle, null);
        }
    }

    public static void a(Context context, RemoteImageView remoteImageView, int i) {
        int i2;
        Context context2 = context;
        RemoteImageView remoteImageView2 = remoteImageView;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{context2, remoteImageView2, Integer.valueOf(i)}, null, f50051a, true, 50040, new Class[]{Context.class, RemoteImageView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, remoteImageView2, Integer.valueOf(i)}, null, f50051a, true, 50040, new Class[]{Context.class, RemoteImageView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        IIMService a2 = a();
        if (f() == 1) {
            i2 = i;
            z = true;
        } else {
            i2 = i;
        }
        a2.wrapperIMShareIcon(context2, remoteImageView2, i2, z);
    }

    private static boolean a(IShareService.ShareStruct shareStruct) {
        IShareService.ShareStruct shareStruct2 = shareStruct;
        if (!PatchProxy.isSupport(new Object[]{shareStruct2}, null, f50051a, true, 50044, new Class[]{IShareService.ShareStruct.class}, Boolean.TYPE)) {
            return (shareStruct2 == null || shareStruct2.extraParams == null || !TextUtils.equals(shareStruct2.extraParams.get("IS_FRIEND_PRIVATE"), "true")) ? false : true;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{shareStruct2}, null, f50051a, true, 50044, new Class[]{IShareService.ShareStruct.class}, Boolean.TYPE)).booleanValue();
    }

    public static IIMService a() {
        if (PatchProxy.isSupport(new Object[0], null, f50051a, true, 50022, new Class[0], IIMService.class)) {
            return (IIMService) PatchProxy.accessDispatch(new Object[0], null, f50051a, true, 50022, new Class[0], IIMService.class);
        }
        return a(false, true);
    }

    public static boolean c() {
        if (PatchProxy.isSupport(new Object[0], null, f50051a, true, 50026, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f50051a, true, 50026, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return d();
    }

    public static boolean d() {
        if (PatchProxy.isSupport(new Object[0], null, f50051a, true, 50027, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f50051a, true, 50027, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return a().isXPlanB();
    }

    private static int g() {
        if (PatchProxy.isSupport(new Object[0], null, f50051a, true, 50037, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f50051a, true, 50037, new Class[0], Integer.TYPE)).intValue();
        }
        return AbTestManager.a().ao() * 5;
    }

    public static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f50051a, true, 50025, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f50051a, true, 50025, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (((Integer) SharePrefCache.inst().getCanIm().c()).intValue() == 1) {
            return true;
        }
        return false;
    }

    public static boolean e() {
        boolean z;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], null, f50051a, true, 50032, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f50051a, true, 50032, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AbTestManager a2 = AbTestManager.a();
        if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71880, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71880, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            AbTestModel d2 = a2.d();
            if (d2 == null) {
                z = false;
            } else {
                z = d2.isShowMultiShareDialog;
            }
        }
        if (z) {
            z2 = true;
        }
        return z2;
    }

    public static int f() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], null, f50051a, true, 50036, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f50051a, true, 50036, new Class[0], Integer.TYPE)).intValue();
        }
        if (!d.a().isLogin() || g() == 0) {
            return 0;
        }
        if (g() <= d.a().getCurUser().getFollowingCount()) {
            i = 1;
        }
        return i;
    }

    public static IIMService a(boolean z) {
        if (!PatchProxy.isSupport(new Object[]{(byte) 0}, null, f50051a, true, 50023, new Class[]{Boolean.TYPE}, IIMService.class)) {
            return a(false, false);
        }
        return (IIMService) PatchProxy.accessDispatch(new Object[]{(byte) 0}, null, f50051a, true, 50023, new Class[]{Boolean.TYPE}, IIMService.class);
    }

    private static IIMService a(boolean z, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0, Byte.valueOf(z2 ? (byte) 1 : 0)}, null, f50051a, true, 50024, new Class[]{Boolean.TYPE, Boolean.TYPE}, IIMService.class)) {
            return (IIMService) PatchProxy.accessDispatch(new Object[]{(byte) 0, Byte.valueOf(z2)}, null, f50051a, true, 50024, new Class[]{Boolean.TYPE, Boolean.TYPE}, IIMService.class);
        }
        IIMService iIMService = (IIMService) ServiceManager.get().getService(IIMService.class, false);
        if ((iIMService instanceof DefaultIMService) && !z2) {
            return null;
        }
        if (iIMService != null || !z2) {
            return iIMService;
        }
        return DefaultIMService.inst();
    }

    public static a a(IShareService.SharePage sharePage, Activity activity, IShareService.ShareStruct shareStruct, boolean z, boolean z2, C0026b bVar) {
        if (!PatchProxy.isSupport(new Object[]{sharePage, activity, shareStruct, (byte) 1, (byte) 0, bVar}, null, f50051a, true, 50041, new Class[]{IShareService.SharePage.class, Activity.class, IShareService.ShareStruct.class, Boolean.TYPE, Boolean.TYPE, C0026b.class}, a.class)) {
            return a("", sharePage, activity, shareStruct, true, false, bVar);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{sharePage, activity, shareStruct, (byte) 1, (byte) 0, bVar}, null, f50051a, true, 50041, new Class[]{IShareService.SharePage.class, Activity.class, IShareService.ShareStruct.class, Boolean.TYPE, Boolean.TYPE, C0026b.class}, a.class);
    }

    public static a a(String str, IShareService.SharePage sharePage, Activity activity, IShareService.ShareStruct shareStruct, boolean z, boolean z2, C0026b bVar) {
        if (!PatchProxy.isSupport(new Object[]{str, sharePage, activity, shareStruct, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), bVar}, null, f50051a, true, 50042, new Class[]{String.class, IShareService.SharePage.class, Activity.class, IShareService.ShareStruct.class, Boolean.TYPE, Boolean.TYPE, C0026b.class}, a.class)) {
            return a(str, sharePage, activity, shareStruct, z, z2, null, bVar);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{str, sharePage, activity, shareStruct, Byte.valueOf(z), Byte.valueOf(z2), bVar}, null, f50051a, true, 50042, new Class[]{String.class, IShareService.SharePage.class, Activity.class, IShareService.ShareStruct.class, Boolean.TYPE, Boolean.TYPE, C0026b.class}, a.class);
    }

    public static a a(String str, IShareService.SharePage sharePage, Activity activity, IShareService.ShareStruct shareStruct, boolean z, boolean z2, e eVar, C0026b bVar) {
        int i;
        String str2 = str;
        Activity activity2 = activity;
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{str2, sharePage, activity2, shareStruct, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), eVar2, bVar}, null, f50051a, true, 50043, new Class[]{String.class, IShareService.SharePage.class, Activity.class, IShareService.ShareStruct.class, Boolean.TYPE, Boolean.TYPE, e.class, C0026b.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{str2, sharePage, activity2, shareStruct, Byte.valueOf(z), Byte.valueOf(z2), eVar2, bVar}, null, f50051a, true, 50043, new Class[]{String.class, IShareService.SharePage.class, Activity.class, IShareService.ShareStruct.class, Boolean.TYPE, Boolean.TYPE, e.class, C0026b.class}, a.class);
        } else if (!b()) {
            return null;
        } else {
            IIMService a2 = a(false);
            if (a2 == null || !z) {
                return null;
            }
            final Aweme a3 = j.a().a(str2);
            a aVar = new a(activity2, eVar2, a3);
            if (z2 && activity.getIntent() == null) {
                activity2.setIntent(new Intent());
            }
            if (a(shareStruct)) {
                i = 1;
            } else {
                i = f();
            }
            if (!e()) {
                a2.addShareHeadList(activity, sharePage, i, aVar, null);
                return null;
            }
            final Activity activity3 = activity;
            AnonymousClass2 r0 = new g(str, shareStruct, bVar, sharePage) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50053a;

                public final void a(IMContact iMContact, boolean z) {
                    if (PatchProxy.isSupport(new Object[]{iMContact, Byte.valueOf(z ? (byte) 1 : 0)}, this, f50053a, false, 50052, new Class[]{IMContact.class, Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{iMContact, Byte.valueOf(z)}, this, f50053a, false, 50052, new Class[]{IMContact.class, Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    super.a(iMContact, z);
                    if (c.t(a3)) {
                        com.ss.android.ugc.aweme.commercialize.log.g.x(activity3, a3);
                    }
                }
            };
            a2.addShareHeadList(activity, sharePage, i, aVar, r0);
            return r0;
        }
    }
}

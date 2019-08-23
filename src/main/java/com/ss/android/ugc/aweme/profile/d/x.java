package com.ss.android.ugc.aweme.profile.d;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.feed.ao;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.share.i;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ProfileShareDialog;
import com.ss.android.ugc.aweme.share.ShareOrderService;
import com.ss.android.ugc.aweme.share.SimpleShareDialog;
import com.ss.android.ugc.aweme.share.bh;
import com.ss.android.ugc.aweme.share.ck;
import com.ss.android.ugc.aweme.u;
import com.ss.android.ugc.aweme.u.z;
import com.ss.android.ugc.aweme.utils.ex;
import java.util.List;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61505a;

    public static void a(Handler handler, Activity activity, User user, List<Aweme> list, String[] strArr) {
        if (PatchProxy.isSupport(new Object[]{handler, activity, user, list, strArr}, null, f61505a, true, 70019, new Class[]{Handler.class, Activity.class, User.class, List.class, String[].class}, Void.TYPE)) {
            Object[] objArr = {handler, activity, user, list, strArr};
            PatchProxy.accessDispatch(objArr, null, f61505a, true, 70019, new Class[]{Handler.class, Activity.class, User.class, List.class, String[].class}, Void.TYPE);
            return;
        }
        a(handler, activity, user, null, list, strArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(android.os.Handler r27, android.app.Activity r28, com.ss.android.ugc.aweme.profile.model.User r29, java.lang.String r30, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r31, java.lang.String[] r32) {
        /*
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r31
            r4 = r32
            r5 = 6
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r13 = 0
            r6[r13] = r0
            r14 = 1
            r6[r14] = r1
            r15 = 2
            r6[r15] = r2
            r16 = 0
            r17 = 3
            r6[r17] = r16
            r18 = 4
            r6[r18] = r3
            r19 = 5
            r6[r19] = r4
            com.meituan.robust.ChangeQuickRedirect r8 = f61505a
            java.lang.Class[] r11 = new java.lang.Class[r5]
            java.lang.Class<android.os.Handler> r7 = android.os.Handler.class
            r11[r13] = r7
            java.lang.Class<android.app.Activity> r7 = android.app.Activity.class
            r11[r14] = r7
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r7 = com.ss.android.ugc.aweme.profile.model.User.class
            r11[r15] = r7
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r11[r17] = r7
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r11[r18] = r7
            java.lang.Class<java.lang.String[]> r7 = java.lang.String[].class
            r11[r19] = r7
            java.lang.Class r12 = java.lang.Void.TYPE
            r7 = 0
            r9 = 1
            r10 = 70021(0x11185, float:9.812E-41)
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r6, r7, r8, r9, r10, r11, r12)
            if (r6 == 0) goto L_0x0088
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r13] = r0
            r6[r14] = r1
            r6[r15] = r2
            r6[r17] = r16
            r6[r18] = r3
            r6[r19] = r4
            r21 = 0
            com.meituan.robust.ChangeQuickRedirect r22 = f61505a
            r23 = 1
            r24 = 70021(0x11185, float:9.812E-41)
            java.lang.Class[] r0 = new java.lang.Class[r5]
            java.lang.Class<android.os.Handler> r1 = android.os.Handler.class
            r0[r13] = r1
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r0[r14] = r1
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
            r0[r15] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r17] = r1
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r0[r18] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r19] = r1
            java.lang.Class r26 = java.lang.Void.TYPE
            r20 = r6
            r25 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r20, r21, r22, r23, r24, r25, r26)
            return
        L_0x0088:
            boolean r5 = com.ss.android.g.a.a()
            if (r5 == 0) goto L_0x00e3
            if (r2 == 0) goto L_0x00e2
            com.ss.android.ugc.aweme.base.share.ShareInfo r5 = r29.getShareInfo()
            if (r5 != 0) goto L_0x0097
            goto L_0x00e2
        L_0x0097:
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r3 = com.ss.android.ugc.aweme.feed.share.i.a((android.content.Context) r1, (com.ss.android.ugc.aweme.profile.model.User) r2, (java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>) r3)
            if (r3 != 0) goto L_0x009e
            return
        L_0x009e:
            com.ss.android.ugc.aweme.share.ck r5 = new com.ss.android.ugc.aweme.share.ck
            r5.<init>()
            com.ss.android.ugc.aweme.framework.services.ServiceManager r6 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.share.ShareOrderService> r7 = com.ss.android.ugc.aweme.share.ShareOrderService.class
            java.lang.Object r6 = r6.getService(r7)
            com.ss.android.ugc.aweme.share.ShareOrderService r6 = (com.ss.android.ugc.aweme.share.ShareOrderService) r6
            java.lang.String[] r6 = r6.getUrlShareList(r14)
            r5.f64976e = r6
            r5.f64977f = r4
            r5.m = r2
            boolean r4 = r29.isSecret()
            if (r4 == 0) goto L_0x00c1
            r5.g = r14
        L_0x00c1:
            com.ss.android.ugc.aweme.share.SimpleShareDialog r4 = new com.ss.android.ugc.aweme.share.SimpleShareDialog
            r4.<init>(r1, r5)
            r4.updateShareStruct(r3)
            com.ss.android.ugc.aweme.profile.d.x$1 r5 = new com.ss.android.ugc.aweme.profile.d.x$1
            r5.<init>(r2, r1, r0, r3)
            r4.setActionHandler(r5)
            com.ss.android.ugc.aweme.profile.d.x$2 r0 = new com.ss.android.ugc.aweme.profile.d.x$2
            r0.<init>(r2)
            r4.setShareCallback(r0)
            r4.show()
            com.ss.android.ugc.aweme.share.SimpleShareDialog r4 = (com.ss.android.ugc.aweme.share.SimpleShareDialog) r4
            r4.d()
            return
        L_0x00e2:
            return
        L_0x00e3:
            b(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.d.x.a(android.os.Handler, android.app.Activity, com.ss.android.ugc.aweme.profile.model.User, java.lang.String, java.util.List, java.lang.String[]):void");
    }

    public static void a(Activity activity, IShareService.ShareStruct shareStruct) {
        Activity activity2 = activity;
        IShareService.ShareStruct shareStruct2 = shareStruct;
        if (PatchProxy.isSupport(new Object[]{activity2, shareStruct2}, null, f61505a, true, 70024, new Class[]{Activity.class, IShareService.ShareStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, shareStruct2}, null, f61505a, true, 70024, new Class[]{Activity.class, IShareService.ShareStruct.class}, Void.TYPE);
        } else if (!d.a().isLogin()) {
            e.a(activity2, "", "click_shareim_button");
        } else {
            Bundle bundle = new Bundle();
            bundle.putSerializable("share_struct", shareStruct2);
            b.a().enterChooseContact(activity2, bundle, null);
            ao.a("chat_merge");
        }
    }

    private static void b(Activity activity, User user, List<Aweme> list) {
        Activity activity2 = activity;
        User user2 = user;
        List<Aweme> list2 = list;
        if (PatchProxy.isSupport(new Object[]{activity2, user2, list2}, null, f61505a, true, 70025, new Class[]{Activity.class, User.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, user2, list2}, null, f61505a, true, 70025, new Class[]{Activity.class, User.class, List.class}, Void.TYPE);
            return;
        }
        a(activity2, user2, list2, false);
    }

    public static void a(Activity activity, User user, List<Aweme> list) {
        Activity activity2 = activity;
        User user2 = user;
        List<Aweme> list2 = list;
        if (PatchProxy.isSupport(new Object[]{activity2, user2, list2}, null, f61505a, true, 70020, new Class[]{Activity.class, User.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, user2, list2}, null, f61505a, true, 70020, new Class[]{Activity.class, User.class, List.class}, Void.TYPE);
            return;
        }
        a(activity2, user2, (String) null, list2);
    }

    public static void a(Activity activity, User user, String str, List<Aweme> list) {
        Activity activity2 = activity;
        User user2 = user;
        String str2 = str;
        List<Aweme> list2 = list;
        if (PatchProxy.isSupport(new Object[]{activity2, user2, str2, list2}, null, f61505a, true, 70022, new Class[]{Activity.class, User.class, String.class, List.class}, Void.TYPE)) {
            Object[] objArr = {activity2, user2, str2, list2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f61505a, true, 70022, new Class[]{Activity.class, User.class, String.class, List.class}, Void.TYPE);
            return;
        }
        a(activity2, user2, str2, list2, false);
    }

    private static void a(Activity activity, User user, List<Aweme> list, boolean z) {
        final Activity activity2 = activity;
        final User user2 = user;
        if (PatchProxy.isSupport(new Object[]{activity2, user2, list, Byte.valueOf(z ? (byte) 1 : 0)}, null, f61505a, true, 70026, new Class[]{Activity.class, User.class, List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, user2, list, Byte.valueOf(z)}, null, f61505a, true, 70026, new Class[]{Activity.class, User.class, List.class, Boolean.TYPE}, Void.TYPE);
        } else if (user2 != null && user.getShareInfo() != null) {
            final IShareService.ShareStruct a2 = i.a((Context) activity, user, list);
            if (a2 != null) {
                ck ckVar = new ck();
                ckVar.h = z;
                ckVar.f64976e = ((ShareOrderService) ServiceManager.get().getService(ShareOrderService.class)).getUrlShareList(true);
                ProfileShareDialog profileShareDialog = new ProfileShareDialog(activity2, ckVar);
                profileShareDialog.updateShareStruct(a2);
                profileShareDialog.setActionHandler(new IShareService.IActionHandler() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f61525a;

                    public final boolean checkStatus(String str) {
                        return true;
                    }

                    public final boolean onAction(IShareService.ShareStruct shareStruct, String str) {
                        IShareService.ShareStruct shareStruct2 = shareStruct;
                        String str2 = str;
                        if (PatchProxy.isSupport(new Object[]{shareStruct2, str2}, this, f61525a, false, 70035, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)) {
                            return ((Boolean) PatchProxy.accessDispatch(new Object[]{shareStruct2, str2}, this, f61525a, false, 70035, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)).booleanValue();
                        } else if (TextUtils.equals("copy", str2)) {
                            if (shareStruct2 == null) {
                                return false;
                            }
                            String a2 = u.a().a(shareStruct2.url, shareStruct2.boolPersist);
                            ((ClipboardManager) activity2.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(a2, a2));
                            a.a((Context) activity2, (int) C0906R.string.a2a).a();
                            return true;
                        } else if (TextUtils.equals("qr_code", str2)) {
                            Activity activity = activity2;
                            User user = user2;
                            if (PatchProxy.isSupport(new Object[]{activity, shareStruct2, user}, null, x.f61505a, true, 70027, new Class[]{Activity.class, IShareService.ShareStruct.class, User.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{activity, shareStruct2, user}, null, x.f61505a, true, 70027, new Class[]{Activity.class, IShareService.ShareStruct.class, User.class}, Void.TYPE);
                            } else if (!(shareStruct2 == null || user == null || activity == null || activity.isFinishing())) {
                                try {
                                    new bh(activity, user).show();
                                } catch (Throwable th) {
                                    ExceptionMonitor.ensureNotReachHere(th);
                                }
                            }
                            return true;
                        } else if (TextUtils.equals("chat_merge", str2)) {
                            x.a(activity2, a2);
                            return true;
                        } else if (!StringUtils.equal(str2, "weixin") && !StringUtils.equal(str2, "weixin_moments") && !StringUtils.equal(str2, "qq") && !StringUtils.equal(str2, "qzone")) {
                            return false;
                        } else {
                            Activity activity2 = activity2;
                            User user2 = user2;
                            if (PatchProxy.isSupport(new Object[]{activity2, shareStruct2, user2, str2}, null, x.f61505a, true, 70028, new Class[]{Activity.class, IShareService.ShareStruct.class, User.class, String.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{activity2, shareStruct2, user2, str2}, null, x.f61505a, true, 70028, new Class[]{Activity.class, IShareService.ShareStruct.class, User.class, String.class}, Void.TYPE);
                            } else if (!(shareStruct2 == null || user2 == null || activity2 == null || activity2.isFinishing())) {
                                try {
                                    new bh(activity2, user2, 7, str2).show();
                                } catch (Throwable th2) {
                                    ExceptionMonitor.ensureNotReachHere(th2);
                                }
                            }
                            return true;
                        }
                    }
                });
                profileShareDialog.setShareCallback(new y(user2));
                try {
                    profileShareDialog.show();
                } catch (Throwable th) {
                    ExceptionMonitor.ensureNotReachHere(th);
                }
            }
        }
    }

    public static void a(Activity activity, User user, String str, List<Aweme> list, boolean z) {
        final Activity activity2 = activity;
        final User user2 = user;
        List<Aweme> list2 = list;
        if (PatchProxy.isSupport(new Object[]{activity2, user2, str, list2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f61505a, true, 70023, new Class[]{Activity.class, User.class, String.class, List.class, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {activity2, user2, str, list2, Byte.valueOf(z)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f61505a, true, 70023, new Class[]{Activity.class, User.class, String.class, List.class, Boolean.TYPE}, Void.TYPE);
        } else if (!com.ss.android.g.a.a()) {
            a(activity2, user2, list2, z);
        } else if (user2 != null && user.getShareInfo() != null) {
            final IShareService.ShareStruct a2 = i.a((Context) activity2, user2, list2);
            if (a2 != null) {
                ck ckVar = new ck();
                ckVar.f64976e = ((ShareOrderService) ServiceManager.get().getService(ShareOrderService.class)).getUrlShareList(true);
                SimpleShareDialog simpleShareDialog = new SimpleShareDialog(activity2, ckVar);
                simpleShareDialog.updateShareStruct(a2);
                simpleShareDialog.setActionHandler(new IShareService.IActionHandler() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f61519a;

                    public final boolean checkStatus(String str) {
                        return true;
                    }

                    public final boolean onAction(IShareService.ShareStruct shareStruct, String str) {
                        String str2;
                        if (PatchProxy.isSupport(new Object[]{shareStruct, str}, this, f61519a, false, 70033, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)) {
                            return ((Boolean) PatchProxy.accessDispatch(new Object[]{shareStruct, str}, this, f61519a, false, 70033, new Class[]{IShareService.ShareStruct.class, String.class}, Boolean.TYPE)).booleanValue();
                        } else if (TextUtils.equals("copy", str)) {
                            if (shareStruct == null) {
                                return false;
                            }
                            String a2 = u.a().a(shareStruct.url, shareStruct.boolPersist);
                            ((ClipboardManager) activity2.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(a2, a2));
                            a.a((Context) activity2, (int) C0906R.string.a2a).a();
                            z.a a3 = z.a("share_person").a("platform", "copy").a("target_id", user2.getUid());
                            if (ex.g(user2)) {
                                str2 = "personal_homepage";
                            } else {
                                str2 = "others_homepage";
                            }
                            a3.a("enter_from", str2).e();
                            return true;
                        } else if (!TextUtils.equals("chat_merge", str)) {
                            return false;
                        } else {
                            x.a(activity2, a2);
                            return true;
                        }
                    }
                });
                simpleShareDialog.setShareCallback(new IShareService.OnShareCallback() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f61523a;

                    public final void onShareComplete(IShareService.ShareResult shareResult) {
                        String str;
                        if (PatchProxy.isSupport(new Object[]{shareResult}, this, f61523a, false, 70034, new Class[]{IShareService.ShareResult.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{shareResult}, this, f61523a, false, 70034, new Class[]{IShareService.ShareResult.class}, Void.TYPE);
                            return;
                        }
                        z.a a2 = z.a("share_person").a("platform", shareResult.type).a("target_id", user2.getUid());
                        if (ex.g(user2)) {
                            str = "personal_homepage";
                        } else {
                            str = "others_homepage";
                        }
                        a2.a("enter_from", str).e();
                    }
                });
                simpleShareDialog.show();
                simpleShareDialog.d();
            }
        }
    }
}

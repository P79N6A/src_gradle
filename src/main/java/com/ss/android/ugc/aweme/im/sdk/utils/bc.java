package com.ss.android.ugc.aweme.im.sdk.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.im.core.d.b;
import com.bytedance.im.core.d.n;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.common.util.i;
import com.ss.android.socialbase.appdownloader.AppDownloader;
import com.ss.android.socialbase.downloader.e.d;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.service.a.a;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.e;
import com.ss.android.ugc.aweme.im.service.model.h;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Map;

public final class bc {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52548a;

    public static boolean a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f52548a, true, 53809, new Class[]{Context.class}, Boolean.TYPE)) {
            return ToolUtils.isInstalledApp(context2, "my.maya.android");
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f52548a, true, 53809, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
    }

    private static void a(Activity activity, int i, Object obj, a aVar) {
        Activity activity2 = activity;
        int i2 = i;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{activity2, Integer.valueOf(i), obj, aVar2}, null, f52548a, true, 53813, new Class[]{Activity.class, Integer.TYPE, Object.class, a.class}, Void.TYPE)) {
            Object[] objArr = {activity2, Integer.valueOf(i), obj, aVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f52548a, true, 53813, new Class[]{Activity.class, Integer.TYPE, Object.class, a.class}, Void.TYPE);
        } else if (activity2 != null) {
            if (i2 == 6) {
                b(activity, i, obj);
            } else if (a((Context) activity)) {
                z.a(i2, "open");
                a((Context) activity, i, obj);
            } else {
                z.a(i2, "install");
                a(activity2, i2, aVar2);
            }
        }
    }

    private static void a(Dialog dialog, a aVar) {
        Dialog dialog2 = dialog;
        if (PatchProxy.isSupport(new Object[]{dialog2, aVar}, null, f52548a, true, 53816, new Class[]{Dialog.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialog2, aVar}, null, f52548a, true, 53816, new Class[]{Dialog.class, a.class}, Void.TYPE);
            return;
        }
        if (!(dialog2 == null || aVar == null)) {
            aVar.getClass();
            dialog2.setOnCancelListener(bd.a(aVar));
            aVar.getClass();
            dialog2.setOnDismissListener(be.a(aVar));
            aVar.getClass();
            dialog2.setOnShowListener(bf.a(aVar));
        }
        if (dialog2 != null) {
            dialog.show();
        }
    }

    public static void a(Context context, int i, Object obj) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), obj}, null, f52548a, true, 53818, new Class[]{Context.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i), obj}, null, f52548a, true, 53818, new Class[]{Context.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        i a2 = a(i, obj);
        User c2 = d.c();
        if (c2 != null) {
            a2.a("uid", c2.getUid());
            a2.a("nick_name", c2.getNickname());
            if (c2.getAvatarMedium() != null && !CollectionUtils.isEmpty(c2.getAvatarMedium().getUrlList())) {
                a2.a("image_url", c2.getAvatarMedium().getUrlList().get(0));
            }
        }
        intent.setData(Uri.parse(a2.a()));
        try {
            context2.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public static void a(Context context, boolean z, DialogInterface.OnClickListener onClickListener) {
        Context context2 = context;
        final DialogInterface.OnClickListener onClickListener2 = onClickListener;
        if (PatchProxy.isSupport(new Object[]{context2, Byte.valueOf(z ? (byte) 1 : 0), onClickListener2}, null, f52548a, true, 53820, new Class[]{Context.class, Boolean.TYPE, DialogInterface.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Byte.valueOf(z), onClickListener2}, null, f52548a, true, 53820, new Class[]{Context.class, Boolean.TYPE, DialogInterface.OnClickListener.class}, Void.TYPE);
            return;
        }
        String string = context2.getString(C0906R.string.aph);
        if (!a() || !z || !o.a().d() || !o.a().c(3)) {
            new AlertDialog.Builder(context2, C0906R.style.kx).setMessage((CharSequence) string).setPositiveButton((int) C0906R.string.aqb, onClickListener2).setNegativeButton((int) C0906R.string.apk, onClickListener2).show();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context2, C0906R.style.kx);
        builder.setMessage((CharSequence) context2.getString(C0906R.string.ayt) + "，" + string).setPositiveButton((int) C0906R.string.aqb, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52565a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f52565a, false, 53850, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f52565a, false, 53850, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                o.a().b(3);
                if (onClickListener2 != null) {
                    onClickListener2.onClick(dialogInterface, i);
                }
            }
        }).setNegativeButton((int) C0906R.string.apk, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52563a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f52563a, false, 53849, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f52563a, false, 53849, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                o.a().b(3);
                if (onClickListener2 != null) {
                    onClickListener2.onClick(dialogInterface, i);
                }
            }
        }).show();
    }

    public static void a(Context context, int i, boolean z, Runnable runnable) {
        Context context2 = context;
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), runnable2}, null, f52548a, true, 53821, new Class[]{Context.class, Integer.TYPE, Boolean.TYPE, Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i), Byte.valueOf(z), runnable2}, null, f52548a, true, 53821, new Class[]{Context.class, Integer.TYPE, Boolean.TYPE, Runnable.class}, Void.TYPE);
            return;
        }
        a(context2, i, z, runnable2, null);
    }

    public static void a(Context context, int i, boolean z, Runnable runnable, a aVar) {
        Context context2 = context;
        int i2 = i;
        Runnable runnable2 = runnable;
        a aVar2 = aVar;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), runnable2, aVar2}, null, f52548a, true, 53822, new Class[]{Context.class, Integer.TYPE, Boolean.TYPE, Runnable.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i), Byte.valueOf(z), runnable2, aVar2}, null, f52548a, true, 53822, new Class[]{Context.class, Integer.TYPE, Boolean.TYPE, Runnable.class, a.class}, Void.TYPE);
        } else if (i2 == 1 || z) {
            if (a() && o.a().d() && o.a().c(i2)) {
                z2 = true;
            }
            if (z2) {
                String string = context2.getString(C0906R.string.ayw);
                switch (i2) {
                    case 1:
                        string = string + context2.getString(C0906R.string.ayu);
                        break;
                    case 2:
                        string = string + context2.getString(C0906R.string.ayv);
                        break;
                    case 3:
                        string = string + context2.getString(C0906R.string.ayt);
                        break;
                }
                bg bgVar = new bg(i2, aVar2, runnable2);
                a((Dialog) new AlertDialog.Builder(context2, C0906R.style.kx).setMessage((CharSequence) string).setPositiveButton((int) C0906R.string.aqb, (DialogInterface.OnClickListener) bgVar).setNegativeButton((int) C0906R.string.apk, (DialogInterface.OnClickListener) bgVar).create(), aVar2);
                return;
            }
            if (runnable2 != null) {
                runnable.run();
            }
        } else {
            if (runnable2 != null) {
                runnable.run();
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.ss.android.ugc.aweme.base.ui.RemoteImageView r19, int r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r20)
            r11 = 1
            r3[r11] = r4
            com.meituan.robust.ChangeQuickRedirect r5 = f52548a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.base.ui.RemoteImageView> r4 = com.ss.android.ugc.aweme.base.ui.RemoteImageView.class
            r8[r10] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = 0
            r6 = 1
            r7 = 53825(0xd241, float:7.5425E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x004d
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            r12[r11] = r0
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f52548a
            r15 = 1
            r16 = 53825(0xd241, float:7.5425E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.base.ui.RemoteImageView> r1 = com.ss.android.ugc.aweme.base.ui.RemoteImageView.class
            r0[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x004d:
            com.ss.android.ugc.aweme.im.sdk.d.a r2 = com.ss.android.ugc.aweme.im.sdk.d.a.a()
            com.ss.android.ugc.aweme.im.service.c r2 = r2.e()
            boolean r2 = r2.enableIM()
            r3 = 8
            if (r2 != 0) goto L_0x0061
            r0.setVisibility(r3)
            return
        L_0x0061:
            boolean r2 = a()
            r4 = 13
            if (r2 == 0) goto L_0x00d0
            r0.setVisibility(r10)
            com.ss.android.ugc.aweme.im.sdk.d.a r2 = com.ss.android.ugc.aweme.im.sdk.d.a.a()
            com.ss.android.ugc.aweme.im.service.c r2 = r2.e()
            com.ss.android.ugc.aweme.im.service.model.d r2 = r2.getIMSetting()
            com.ss.android.ugc.aweme.im.service.model.e r2 = r2.f52883f
            r5 = 2130840066(0x7f020a02, float:1.728516E38)
            r6 = 0
            if (r1 == r4) goto L_0x00b3
            switch(r1) {
                case 2: goto L_0x00a6;
                case 3: goto L_0x0099;
                case 4: goto L_0x0085;
                default: goto L_0x0083;
            }
        L_0x0083:
            r1 = r6
            goto L_0x00c7
        L_0x0085:
            boolean r1 = b()
            if (r1 == 0) goto L_0x0095
            if (r2 == 0) goto L_0x0090
            com.ss.android.ugc.aweme.im.service.model.f r1 = r2.o
            goto L_0x0091
        L_0x0090:
            r1 = r6
        L_0x0091:
            c(r0, r5)
            goto L_0x00c7
        L_0x0095:
            r0.setVisibility(r3)
            goto L_0x0083
        L_0x0099:
            if (r2 == 0) goto L_0x009e
            com.ss.android.ugc.aweme.im.service.model.f r1 = r2.g
            goto L_0x009f
        L_0x009e:
            r1 = r6
        L_0x009f:
            r2 = 2130840075(0x7f020a0b, float:1.7285179E38)
            c(r0, r2)
            goto L_0x00c7
        L_0x00a6:
            if (r2 == 0) goto L_0x00ab
            com.ss.android.ugc.aweme.im.service.model.f r1 = r2.f52889f
            goto L_0x00ac
        L_0x00ab:
            r1 = r6
        L_0x00ac:
            r2 = 2130840076(0x7f020a0c, float:1.728518E38)
            c(r0, r2)
            goto L_0x00c7
        L_0x00b3:
            boolean r1 = b()
            if (r1 == 0) goto L_0x00c3
            if (r2 == 0) goto L_0x00be
            com.ss.android.ugc.aweme.im.service.model.f r1 = r2.y
            goto L_0x00bf
        L_0x00be:
            r1 = r6
        L_0x00bf:
            c(r0, r5)
            goto L_0x00c7
        L_0x00c3:
            r0.setVisibility(r3)
            goto L_0x0083
        L_0x00c7:
            if (r1 != 0) goto L_0x00ca
            goto L_0x00cc
        L_0x00ca:
            com.ss.android.ugc.aweme.base.model.UrlModel r6 = r1.f52891b
        L_0x00cc:
            com.ss.android.ugc.aweme.base.c.b(r0, r6)
            return
        L_0x00d0:
            r2 = 4
            if (r1 == r2) goto L_0x00d6
            if (r1 == r4) goto L_0x00d6
            goto L_0x00df
        L_0x00d6:
            r0.setVisibility(r10)
            r1 = 2130840113(0x7f020a31, float:1.7285256E38)
            c(r0, r1)
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.utils.bc.a(com.ss.android.ugc.aweme.base.ui.RemoteImageView, int):void");
    }

    public static void a(Activity activity, IMUser iMUser, int i, Runnable runnable) {
        Activity activity2 = activity;
        IMUser iMUser2 = iMUser;
        int i2 = i;
        final Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{activity2, iMUser2, Integer.valueOf(i), runnable2}, null, f52548a, true, 53828, new Class[]{Activity.class, IMUser.class, Integer.TYPE, Runnable.class}, Void.TYPE)) {
            Object[] objArr = {activity2, iMUser2, Integer.valueOf(i), runnable2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f52548a, true, 53828, new Class[]{Activity.class, IMUser.class, Integer.TYPE, Runnable.class}, Void.TYPE);
        } else if (activity2 != null && iMUser2 != null) {
            if (!a() || iMUser.getCommerceUserLevel() != 0) {
                runnable.run();
            } else if (!b()) {
                a(activity2, i2, (Object) iMUser2);
            } else if (!o.a().e(i2) || a((Context) activity)) {
                runnable.run();
            } else {
                o.a().d(i2);
                a(activity2, i2, (Object) iMUser2, (a) new a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f52567a;

                    public final void a(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f52567a, false, 53851, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f52567a, false, 53851, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        if (i == -2 && runnable2 != null) {
                            runnable2.run();
                        }
                    }
                });
            }
        }
    }

    public static void a(Activity activity, Object obj, int i) {
        Activity activity2 = activity;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{activity2, obj2, Integer.valueOf(i)}, null, f52548a, true, 53829, new Class[]{Activity.class, Object.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, obj2, Integer.valueOf(i)}, null, f52548a, true, 53829, new Class[]{Activity.class, Object.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(activity2, obj2, i, (a) null);
    }

    public static void a(Activity activity, Object obj, int i, a aVar) {
        Activity activity2 = activity;
        Object obj2 = obj;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{activity2, obj2, Integer.valueOf(i), aVar2}, null, f52548a, true, 53830, new Class[]{Activity.class, Object.class, Integer.TYPE, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, obj2, Integer.valueOf(i), aVar2}, null, f52548a, true, 53830, new Class[]{Activity.class, Object.class, Integer.TYPE, a.class}, Void.TYPE);
        } else if (activity2 != null && obj2 != null) {
            a(activity2, i, obj2, aVar2);
        }
    }

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f52548a, true, 53807, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f52548a, true, 53807, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return com.ss.android.ugc.aweme.im.sdk.g.a.a().isXPlanOpen();
    }

    public static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f52548a, true, 53808, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f52548a, true, 53808, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return com.ss.android.ugc.aweme.im.sdk.g.a.a().isXPlanB();
    }

    public static boolean c() {
        if (PatchProxy.isSupport(new Object[0], null, f52548a, true, 53810, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f52548a, true, 53810, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (com.ss.android.ugc.aweme.im.sdk.d.a.a().e().getIMSetting().h == 1) {
            return true;
        }
        return false;
    }

    public static boolean d() {
        if (PatchProxy.isSupport(new Object[0], null, f52548a, true, 53832, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f52548a, true, 53832, new Class[0], Boolean.TYPE)).booleanValue();
        }
        e eVar = com.ss.android.ugc.aweme.im.sdk.d.a.a().e().getIMSetting().f52883f;
        ArrayList arrayList = new ArrayList();
        arrayList.add("http://d.ppkankan01.com/PcVn/");
        if (eVar != null) {
            arrayList.add(eVar.z);
            arrayList.add(eVar.B);
            arrayList.add(eVar.A);
            arrayList.add(eVar.C);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            String str = (String) arrayList.get(i);
            if (!TextUtils.isEmpty(str)) {
                DownloadInfo appDownloadInfo = AppDownloader.getInstance().getAppDownloadInfo(GlobalContext.getContext(), str);
                if (appDownloadInfo != null && d.a(appDownloadInfo.getSavePath(), appDownloadInfo.getName(), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int e() {
        if (PatchProxy.isSupport(new Object[0], null, f52548a, true, 53837, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f52548a, true, 53837, new Class[0], Integer.TYPE)).intValue();
        }
        e eVar = com.ss.android.ugc.aweme.im.sdk.d.a.a().e().getIMSetting().f52883f;
        ArrayList arrayList = new ArrayList();
        arrayList.add("http://d.ppkankan01.com/PcVn/");
        if (eVar != null) {
            arrayList.add(eVar.z);
            arrayList.add(eVar.A);
            arrayList.add(eVar.B);
            arrayList.add(eVar.C);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            String str = (String) arrayList.get(i);
            if (!TextUtils.isEmpty(str)) {
                DownloadInfo appDownloadInfo = AppDownloader.getInstance().getAppDownloadInfo(GlobalContext.getContext(), str);
                if (appDownloadInfo != null && d.a(appDownloadInfo.getSavePath(), appDownloadInfo.getName(), false)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static String a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f52548a, true, 53836, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f52548a, true, 53836, new Class[]{Integer.TYPE}, String.class);
        }
        e eVar = com.ss.android.ugc.aweme.im.sdk.d.a.a().e().getIMSetting().f52883f;
        if (eVar == null) {
            return "http://d.ppkankan01.com/PcVn/";
        }
        int e2 = e();
        String str = null;
        if (e2 < 0) {
            switch (i) {
                case 1:
                    if (!TextUtils.isEmpty(eVar.z)) {
                        str = eVar.z;
                        break;
                    }
                    break;
                case 2:
                case 3:
                    if (!TextUtils.isEmpty(eVar.B)) {
                        str = eVar.B;
                        break;
                    }
                    break;
                case 4:
                case 5:
                case 6:
                case com.ss.android.ugc.aweme.commercialize.loft.model.e.l:
                case 10:
                case SearchNilInfo.HIT_TYPE_SENSITIVE:
                case 13:
                    if (!TextUtils.isEmpty(eVar.C)) {
                        str = eVar.C;
                        break;
                    }
                    break;
                case 8:
                case 9:
                    if (!TextUtils.isEmpty(eVar.A)) {
                        str = eVar.A;
                        break;
                    }
                    break;
            }
        } else {
            switch (e2) {
                case 0:
                    str = "http://d.ppkankan01.com/PcVn/";
                    break;
                case 1:
                    if (!TextUtils.isEmpty(eVar.z)) {
                        str = eVar.z;
                        break;
                    }
                    break;
                case 2:
                    if (!TextUtils.isEmpty(eVar.A)) {
                        str = eVar.A;
                        break;
                    }
                    break;
                case 3:
                    if (!TextUtils.isEmpty(eVar.B)) {
                        str = eVar.B;
                        break;
                    }
                    break;
                case 4:
                    if (!TextUtils.isEmpty(eVar.C)) {
                        str = eVar.C;
                        break;
                    }
                    break;
            }
        }
        if (str == null) {
            return "http://d.ppkankan01.com/PcVn/";
        }
        return str;
    }

    public static void a(Activity activity, int i) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2, 1}, null, f52548a, true, 53811, new Class[]{Activity.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, 1}, null, f52548a, true, 53811, new Class[]{Activity.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(activity2, 1, (Object) null);
    }

    public static void b(RemoteImageView remoteImageView, int i) {
        RemoteImageView remoteImageView2 = remoteImageView;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, Integer.valueOf(i)}, null, f52548a, true, 53827, new Class[]{RemoteImageView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, Integer.valueOf(i)}, null, f52548a, true, 53827, new Class[]{RemoteImageView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        GenericDraweeHierarchy genericDraweeHierarchy = (GenericDraweeHierarchy) remoteImageView.getHierarchy();
        if (genericDraweeHierarchy != null) {
            genericDraweeHierarchy.setFailureImage(i2);
        } else {
            remoteImageView2.setHierarchy(GenericDraweeHierarchyBuilder.newInstance(remoteImageView.getResources()).setFailureImage(i2).build());
        }
    }

    private static void c(RemoteImageView remoteImageView, int i) {
        RemoteImageView remoteImageView2 = remoteImageView;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, Integer.valueOf(i)}, null, f52548a, true, 53826, new Class[]{RemoteImageView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, Integer.valueOf(i)}, null, f52548a, true, 53826, new Class[]{RemoteImageView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        GenericDraweeHierarchy genericDraweeHierarchy = (GenericDraweeHierarchy) remoteImageView.getHierarchy();
        if (genericDraweeHierarchy != null) {
            genericDraweeHierarchy.setPlaceholderImage(i2);
            genericDraweeHierarchy.setFailureImage(i2);
            return;
        }
        remoteImageView2.setHierarchy(GenericDraweeHierarchyBuilder.newInstance(remoteImageView.getResources()).setFailureImage(i2).setPlaceholderImage(i2).build());
    }

    private static i a(int i, Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), obj2}, null, f52548a, true, 53819, new Class[]{Integer.TYPE, Object.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), obj2}, null, f52548a, true, 53819, new Class[]{Integer.TYPE, Object.class}, i.class);
        }
        i iVar = new i("maya1349://home?tab=im&enter_from=aweme");
        switch (i) {
            case 1:
                if (obj2 instanceof String) {
                    iVar = new i((String) obj2);
                    iVar.a("enter_from", "aweme");
                    break;
                }
                break;
            case 2:
            case 3:
            case 4:
            case SearchNilInfo.HIT_TYPE_SENSITIVE:
                if (obj2 instanceof IMUser) {
                    String uid = ((IMUser) obj2).getUid();
                    String a2 = com.bytedance.im.core.d.e.a(Long.parseLong(uid));
                    i iVar2 = new i("maya1349://message?enter_from=aweme");
                    iVar2.a("conversation_id", a2);
                    iVar2.a("talk_to", uid);
                    iVar = iVar2;
                    break;
                }
                break;
            case 5:
            case com.ss.android.ugc.aweme.commercialize.loft.model.e.l:
                if (obj2 instanceof n) {
                    n nVar = (n) obj2;
                    iVar = new i("maya1349://message?enter_from=aweme");
                    iVar.a("conversation_id", nVar.getConversationId());
                    iVar.a("short_conversation_id", nVar.getConversationShortId());
                    break;
                }
                break;
            case 6:
                if (obj2 instanceof b) {
                    b bVar = (b) obj2;
                    iVar = new i("maya1349://message?enter_from=aweme");
                    iVar.a("conversation_id", bVar.getConversationId());
                    iVar.a("short_conversation_id", bVar.getConversationShortId());
                    break;
                }
                break;
            case 8:
            case 9:
                if (obj2 instanceof IShareService.ShareStruct) {
                    iVar = new i("maya1349://message_forward?enter_from=aweme");
                    BaseContent b2 = com.ss.android.ugc.aweme.im.sdk.share.b.b((IShareService.ShareStruct) obj2);
                    iVar.a("external_msg_type", ad.a(b2));
                    iVar.a("external_msg_content", l.a(b2));
                    break;
                }
                break;
            case 10:
                if (obj2 instanceof h) {
                    h hVar = (h) obj2;
                    if (hVar.f52893a != null) {
                        iVar = new i(hVar.f52893a);
                        iVar.a("enter_from", "aweme");
                        if (hVar.f52894b != null && !hVar.f52894b.isEmpty()) {
                            for (Map.Entry next : hVar.f52894b.entrySet()) {
                                iVar.a((String) next.getKey(), (String) next.getValue());
                            }
                            break;
                        }
                    }
                }
                break;
        }
        return iVar;
    }

    private static void b(Activity activity, int i, Object obj) {
        final Activity activity2 = activity;
        final Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{activity2, Integer.valueOf(i), obj2}, null, f52548a, true, 53814, new Class[]{Activity.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, Integer.valueOf(i), obj2}, null, f52548a, true, 53814, new Class[]{Activity.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        final boolean a2 = a((Context) activity);
        if (a2) {
            z.a(6, "open");
        } else {
            z.a(6, "install");
            z.b(6, "show");
        }
        final int i2 = i;
        new AlertDialog.Builder(activity2, C0906R.style.kx).setMessage((CharSequence) activity2.getString(C0906R.string.azy)).setPositiveButton((int) C0906R.string.b02, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52551a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f52551a, false, 53846, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f52551a, false, 53846, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (a2) {
                    bc.a((Context) activity2, i2, obj2);
                } else {
                    com.ss.android.ugc.aweme.im.sdk.d.a.a().e().handleXDownload(activity2, bc.a(6));
                }
                if (!a2) {
                    z.b(6, "confirm");
                }
            }
        }).setNegativeButton((int) C0906R.string.apk, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52549a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f52549a, false, 53845, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f52549a, false, 53845, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (!a2) {
                    z.b(6, "cancel");
                }
            }
        }).show();
    }

    private static void a(Activity activity, int i, a aVar) {
        final Activity activity2 = activity;
        final int i2 = i;
        final a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{activity2, Integer.valueOf(i), aVar2}, null, f52548a, true, 53815, new Class[]{Activity.class, Integer.TYPE, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, Integer.valueOf(i), aVar2}, null, f52548a, true, 53815, new Class[]{Activity.class, Integer.TYPE, a.class}, Void.TYPE);
            return;
        }
        e eVar = com.ss.android.ugc.aweme.im.sdk.d.a.a().e().getIMSetting().f52883f;
        String string = activity2.getString(C0906R.string.b01);
        switch (i2) {
            case 1:
            case 8:
            case 9:
                if (eVar != null && !TextUtils.isEmpty(eVar.f52884a)) {
                    string = eVar.f52884a;
                    break;
                } else {
                    string = activity2.getString(C0906R.string.b01);
                    break;
                }
            case 2:
            case 3:
                if (eVar != null && !TextUtils.isEmpty(eVar.f52885b)) {
                    string = eVar.f52885b;
                    break;
                } else {
                    string = activity2.getString(C0906R.string.b01);
                    break;
                }
            case 4:
                if (b()) {
                    if (eVar != null && !TextUtils.isEmpty(eVar.f52884a)) {
                        string = eVar.f52884a;
                        break;
                    } else {
                        string = activity2.getString(C0906R.string.b01);
                        break;
                    }
                }
                break;
            case 5:
                string = activity2.getString(C0906R.string.b01);
                break;
            case 6:
                string = activity2.getString(C0906R.string.azy);
                break;
            case 10:
                if (eVar != null && !TextUtils.isEmpty(eVar.x)) {
                    string = eVar.x;
                    break;
                } else {
                    string = activity2.getString(C0906R.string.b0h);
                    break;
                }
            case SearchNilInfo.HIT_TYPE_SENSITIVE:
                string = activity2.getString(C0906R.string.b07);
                break;
        }
        a((Dialog) new AlertDialog.Builder(activity2, C0906R.style.kx).setMessage((CharSequence) string).setCancelable(false).setPositiveButton((int) C0906R.string.aqb, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52559a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f52559a, false, 53848, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f52559a, false, 53848, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                com.ss.android.ugc.aweme.im.sdk.d.a.a().e().handleXDownload(activity2, bc.a(i2));
                if (aVar2 != null) {
                    aVar2.a(dialogInterface, i);
                }
                z.b(i2, "confirm");
            }
        }).setNegativeButton((int) C0906R.string.apk, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52556a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f52556a, false, 53847, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f52556a, false, 53847, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (aVar2 != null) {
                    aVar2.a(dialogInterface, i);
                }
                z.b(i2, "cancel");
            }
        }).create(), aVar2);
        z.b(i2, "show");
    }

    public static void a(Activity activity, int i, Object obj) {
        Activity activity2 = activity;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{activity2, Integer.valueOf(i), obj2}, null, f52548a, true, 53812, new Class[]{Activity.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, Integer.valueOf(i), obj2}, null, f52548a, true, 53812, new Class[]{Activity.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        a(activity2, i, obj2, (a) null);
    }
}

package com.ss.android.ugc.aweme.profile.d;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Environment;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.newmedia.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ac.b;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.DmtStatusViewDialog;
import com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.utils.bi;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.aweme.utils.fe;
import com.ss.android.ugc.aweme.utils.permission.f;
import com.zhihu.matisse.internal.entity.IncapableCause;
import com.zhihu.matisse.internal.entity.c;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61424a;

    /* renamed from: b  reason: collision with root package name */
    protected final Activity f61425b;

    /* renamed from: c  reason: collision with root package name */
    protected final Resources f61426c;

    /* renamed from: d  reason: collision with root package name */
    protected final Fragment f61427d;

    /* renamed from: e  reason: collision with root package name */
    public final String f61428e;

    /* renamed from: f  reason: collision with root package name */
    protected final String f61429f;
    protected final WeakHandler g;
    protected final a h;
    public int i = 1;
    private DmtStatusViewDialog j;

    public interface a {
        void a();

        void a(String str);
    }

    public static class b extends com.zhihu.matisse.b.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61454a;

        public final IncapableCause a(Context context, c cVar) {
            Context context2 = context;
            c cVar2 = cVar;
            if (PatchProxy.isSupport(new Object[]{context2, cVar2}, this, f61454a, false, 69967, new Class[]{Context.class, c.class}, IncapableCause.class)) {
                return (IncapableCause) PatchProxy.accessDispatch(new Object[]{context2, cVar2}, this, f61454a, false, 69967, new Class[]{Context.class, c.class}, IncapableCause.class);
            }
            String a2 = e.a(context2, cVar2.f82643c);
            if (StringUtils.isEmpty(a2)) {
                return new IncapableCause(1, context2.getString(C0906R.string.bmo));
            }
            File file = new File(a2);
            if (!file.exists()) {
                return new IncapableCause(1, context2.getString(C0906R.string.bmo));
            }
            if (l.a(file.getAbsolutePath(), 250, 250)) {
                return new IncapableCause(1, context2.getString(C0906R.string.bmr));
            }
            return null;
        }
    }

    public static int c(int i2) {
        if (i2 == 0) {
            return 10004;
        }
        if (i2 != 3) {
            return i2 != 5 ? 10004 : 10011;
        }
        return 10009;
    }

    public final void a(int i2, Activity activity, View view, @NonNull User user, @Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), activity, view, user, str}, this, f61424a, false, 69932, new Class[]{Integer.TYPE, Activity.class, View.class, User.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), activity, view, user, str}, this, f61424a, false, 69932, new Class[]{Integer.TYPE, Activity.class, View.class, User.class, String.class}, Void.TYPE);
            return;
        }
        String[] a2 = a(this.f61426c, 0, 1, 3, 4);
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f61425b);
        final int i3 = i2;
        final Activity activity2 = activity;
        final View view2 = view;
        final String str2 = str;
        final User user2 = user;
        AnonymousClass2 r0 = new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61433a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f61433a, false, 69958, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f61433a, false, 69958, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                } else if (TextUtils.isEmpty(j.this.f61428e)) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) j.this.f61425b, (int) C0906R.string.c1x).a();
                    com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new Exception("SD card 不可用"));
                } else {
                    switch (i) {
                        case 0:
                            j.this.e(i3);
                            return;
                        case 1:
                            j.this.b(i3);
                            return;
                        case 2:
                            HeaderDetailActivity.a(activity2, ad.a().a("extra_zoom_info", (Parcelable) fe.a(view2)).a("enable_edit_img", false).a("uri", TextUtils.isEmpty(str2) ? ex.a(ex.d(user2)) : new String[]{str2}).a("enable_download_img", !com.ss.android.g.a.b()).a("share_info", (Serializable) user2).f75487b);
                            return;
                        default:
                            com.ss.android.common.lib.a.a(j.this.f61425b, "live_image_popup", "cancel");
                            return;
                    }
                }
            }
        };
        builder.setItems((CharSequence[]) a2, (DialogInterface.OnClickListener) r0).create().show();
    }

    public final boolean a(int i2, int i3, Intent intent) {
        Uri uri;
        Uri uri2;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent}, this, f61424a, false, 69939, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent}, this, f61424a, false, 69939, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Boolean.TYPE)).booleanValue();
        } else if (i3 != -1) {
            return false;
        } else {
            if (i4 != 10003 && i4 != 10008 && i4 != 10006 && i4 != 10010) {
                if (i4 == 10007) {
                    if (intent == null) {
                        return false;
                    }
                    List a2 = com.zhihu.matisse.a.a(intent);
                    if (a2 == null || a2.isEmpty()) {
                        uri2 = intent.getData();
                    } else {
                        uri2 = (Uri) a2.get(0);
                    }
                    String a3 = e.a((Context) this.f61425b, uri2);
                    if (StringUtils.isEmpty(a3)) {
                        UIUtils.displayToastWithIcon((Context) this.f61425b, 2130838336, (int) C0906R.string.bmk);
                        return false;
                    } else if (!new File(a3).exists()) {
                        UIUtils.displayToastWithIcon((Context) this.f61425b, 2130838336, (int) C0906R.string.bmk);
                        return false;
                    } else if (this.h != null) {
                        this.h.a(a3);
                    }
                } else if (i4 == 10004 || i4 == 10009 || i4 == 10011) {
                    try {
                        a(b(d()), true, i2);
                        return true;
                    } catch (Exception unused) {
                    }
                } else if (i4 != 10002 || intent == null) {
                    return false;
                } else {
                    Uri data = intent.getData();
                    if (data == null) {
                        return false;
                    }
                    String a4 = e.a((Context) this.f61425b, data);
                    if (a4 == null) {
                        return false;
                    }
                    File file = new File(a4);
                    if (!file.exists()) {
                        return false;
                    }
                    if (l.a(file.getAbsolutePath(), 250, 250)) {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) this.f61425b, (int) C0906R.string.bmr).a();
                        return true;
                    }
                    if (this.h != null) {
                        this.h.a(file.getAbsolutePath());
                    }
                    return true;
                }
                return false;
            } else if (intent == null) {
                return false;
            } else {
                List a5 = com.zhihu.matisse.a.a(intent);
                if (a5 == null || a5.isEmpty()) {
                    uri = intent.getData();
                } else {
                    uri = (Uri) a5.get(0);
                }
                String a6 = e.a((Context) this.f61425b, uri);
                if (StringUtils.isEmpty(a6)) {
                    UIUtils.displayToastWithIcon((Context) this.f61425b, 2130838336, (int) C0906R.string.bmk);
                    return false;
                } else if (!new File(a6).exists()) {
                    UIUtils.displayToastWithIcon((Context) this.f61425b, 2130838336, (int) C0906R.string.bmk);
                    return false;
                } else {
                    if ("file".equals(uri.getScheme())) {
                        uri = e.a((Context) this.f61425b, a6);
                    }
                    a(uri, false, i2);
                    return true;
                }
            }
        }
    }

    public final void a(String str, List<com.ss.android.http.a.b.e> list) {
        if (PatchProxy.isSupport(new Object[]{str, list}, this, f61424a, false, 69941, new Class[]{String.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, list}, this, f61424a, false, 69941, new Class[]{String.class, List.class}, Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.a();
        }
        b();
        a(0, str, list);
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f61424a, false, 69943, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f61424a, false, 69943, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.a();
        }
        b();
        a(0, str);
    }

    public final void a(int i2, String str, List<com.ss.android.http.a.b.e> list) {
        final String str2 = str;
        final List<com.ss.android.http.a.b.e> list2 = list;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str2, list2}, this, f61424a, false, 69946, new Class[]{Integer.TYPE, String.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str2, list2}, this, f61424a, false, 69946, new Class[]{Integer.TYPE, String.class, List.class}, Void.TYPE);
            return;
        }
        com.ss.android.b.a.a.a.a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61447a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f61447a, false, 69963, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f61447a, false, 69963, new Class[0], Void.TYPE);
                    return;
                }
                d.a().uploadAvatar(j.this.g, "https://aweme.snssdk.com/aweme/v1/upload/image/?uid=" + d.a().getCurUserId(), 4194304, str2, list2);
            }
        }, i2);
    }

    public final void a(int i2, String str) {
        final String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str2}, this, f61424a, false, 69950, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str2}, this, f61424a, false, 69950, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.b.a.a.a.a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61451a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f61451a, false, 69965, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f61451a, false, 69965, new Class[0], Void.TYPE);
                    return;
                }
                d.a().uploadCommerceHeadImage(j.this.g, "https://aweme.snssdk.com/aweme/v1/upload/image/?uid=" + d.a().getCurUserId(), 4194304, str2, PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            }
        }, i2);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f61424a, false, 69944, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61424a, false, 69944, new Class[0], Void.TYPE);
            return;
        }
        if (this.j == null) {
            this.j = new DmtStatusViewDialog(this.f61425b);
            this.j.setCancelable(false);
        }
        this.j.show();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f61424a, false, 69945, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61424a, false, 69945, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null && this.j.isShowing()) {
            this.j.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e() {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + this.f61425b.getPackageName()));
            intent.addFlags(268435456);
            this.f61425b.startActivity(intent);
        } catch (Exception unused) {
            bi.a(this.f61425b);
        }
    }

    public final String d() {
        if (PatchProxy.isSupport(new Object[0], this, f61424a, false, 69952, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f61424a, false, 69952, new Class[0], String.class);
        }
        return this.f61428e + "/" + this.f61429f;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f61424a, false, 69935, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61424a, false, 69935, new Class[0], Void.TYPE);
            return;
        }
        new AlertDialog.Builder(this.f61425b).setItems((CharSequence[]) this.f61426c.getStringArray(C0906R.array.l), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61439a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f61439a, false, 69960, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f61439a, false, 69960, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                } else if (TextUtils.isEmpty(j.this.f61428e)) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) j.this.f61425b, (int) C0906R.string.c1x).a();
                } else if (i != 0) {
                    com.ss.android.common.lib.a.a(j.this.f61425b, "live_image_popup", "cancel");
                } else {
                    j.this.b(1);
                }
            }
        }).create().show();
    }

    private Uri b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f61424a, false, 69951, new Class[]{String.class}, Uri.class)) {
            return (Uri) PatchProxy.accessDispatch(new Object[]{str2}, this, f61424a, false, 69951, new Class[]{String.class}, Uri.class);
        }
        File file = new File(str2);
        if (!file.exists()) {
            try {
                try {
                    File file2 = new File(this.f61428e);
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    file.createNewFile();
                } catch (IOException unused) {
                    return null;
                }
            } catch (IOException unused2) {
                return null;
            }
        }
        return Uri.fromFile(file);
    }

    public final void b(final int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f61424a, false, 69936, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f61424a, false, 69936, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            com.ss.android.ugc.aweme.ac.b.a(this.f61425b, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, new b.C0400b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f61441a;

                public final void a(String[] strArr, int[] iArr) {
                    if (PatchProxy.isSupport(new Object[]{strArr, iArr}, this, f61441a, false, 69961, new Class[]{String[].class, int[].class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{strArr, iArr}, this, f61441a, false, 69961, new Class[]{String[].class, int[].class}, Void.TYPE);
                    } else if (iArr != null && iArr.length > 0 && iArr[0] == 0) {
                        com.ss.android.common.lib.a.a(j.this.f61425b, "live_image_popup", "album");
                        j jVar = j.this;
                        int i = 10003;
                        switch (i2) {
                            case 1:
                                i = 10006;
                                break;
                            case 2:
                                i = 10007;
                                break;
                            case 3:
                                i = 10008;
                                break;
                            case 5:
                                i = 10010;
                                break;
                            case 6:
                                i = 10013;
                                break;
                        }
                        jVar.d(i);
                    } else if (!com.ss.android.g.a.a() || ActivityCompat.shouldShowRequestPermissionRationale(j.this.f61425b, "android.permission.READ_EXTERNAL_STORAGE")) {
                        com.bytedance.ies.dmt.ui.d.a.c((Context) j.this.f61425b, j.this.f61425b.getString(C0906R.string.bm4)).a();
                    } else {
                        j.this.a((int) C0906R.string.clg, (int) C0906R.string.pw);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public final void d(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f61424a, false, 69937, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f61424a, false, 69937, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.common.lib.a.a(this.f61425b, "live_image_popup", "album");
        try {
            if (this.f61427d != null) {
                com.zhihu.matisse.a.a(this.f61427d).a(com.zhihu.matisse.b.ofImage()).a(true).b(false).b(this.i).c(-1).a((int) C0906R.style.g6).a(0.85f).a((com.zhihu.matisse.a.a) new com.zhihu.matisse.a.a.a()).a((com.zhihu.matisse.b.a) new b()).d(i2);
            } else {
                com.zhihu.matisse.a.a(this.f61425b).a(com.zhihu.matisse.b.ofImage()).a(true).b(false).b(this.i).c(-1).a((int) C0906R.style.g6).a(0.85f).a((com.zhihu.matisse.a.a) new com.zhihu.matisse.a.a.a()).a((com.zhihu.matisse.b.a) new b()).d(i2);
            }
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
            e.a(this.f61425b, this.f61427d, i2);
        }
    }

    public final void e(final int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f61424a, false, 69938, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f61424a, false, 69938, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (f.a()) {
            com.ss.android.ugc.aweme.ac.b.a(this.f61425b, new String[]{"android.permission.CAMERA"}, new b.C0400b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f61444a;

                public final void a(String[] strArr, int[] iArr) {
                    if (PatchProxy.isSupport(new Object[]{strArr, iArr}, this, f61444a, false, 69962, new Class[]{String[].class, int[].class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{strArr, iArr}, this, f61444a, false, 69962, new Class[]{String[].class, int[].class}, Void.TYPE);
                    } else if (iArr != null && iArr.length > 0 && iArr[0] == 0) {
                        com.ss.android.common.lib.a.a(j.this.f61425b, "live_image_popup", "take_photo");
                        e.a(j.this.f61425b, j.this.f61427d, j.c(i2), j.this.f61428e, j.this.f61429f);
                    } else if (!com.ss.android.g.a.a() || ActivityCompat.shouldShowRequestPermissionRationale(j.this.f61425b, "android.permission.CAMERA")) {
                        com.bytedance.ies.dmt.ui.d.a.c((Context) j.this.f61425b, j.this.f61425b.getString(C0906R.string.bm2)).a();
                    } else {
                        j.this.a((int) C0906R.string.clf, (int) C0906R.string.pv);
                    }
                }
            });
        } else if (f.a(this.f61425b) != -1) {
            com.ss.android.common.lib.a.a(this.f61425b, "live_image_popup", "take_photo");
            e.a(this.f61425b, this.f61427d, c(i2), this.f61428e, this.f61429f);
        } else if (!com.ss.android.g.a.a() || ActivityCompat.shouldShowRequestPermissionRationale(this.f61425b, "android.permission.CAMERA")) {
            com.bytedance.ies.dmt.ui.d.a.c((Context) this.f61425b, this.f61425b.getString(C0906R.string.bm2)).a();
        } else {
            a((int) C0906R.string.clf, (int) C0906R.string.pv);
        }
    }

    public final void a(final int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f61424a, false, 69931, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f61424a, false, 69931, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        new AlertDialog.Builder(this.f61425b).setItems((CharSequence[]) a(this.f61426c, 0, 1, 4), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61430a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f61430a, false, 69957, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f61430a, false, 69957, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                } else if (TextUtils.isEmpty(j.this.f61428e)) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) j.this.f61425b, (int) C0906R.string.c1x).a();
                    com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new Exception("SD card 不可用"));
                } else {
                    switch (i) {
                        case 0:
                            j.this.e(i2);
                            return;
                        case 1:
                            j.this.b(i2);
                            return;
                        default:
                            com.ss.android.common.lib.a.a(j.this.f61425b, "live_image_popup", "cancel");
                            return;
                    }
                }
            }
        }).create().show();
    }

    public static String[] a(Resources resources, short... sArr) {
        Resources resources2 = resources;
        short[] sArr2 = sArr;
        if (PatchProxy.isSupport(new Object[]{resources2, sArr2}, null, f61424a, true, 69930, new Class[]{Resources.class, short[].class}, String[].class)) {
            return (String[]) PatchProxy.accessDispatch(new Object[]{resources2, sArr2}, null, f61424a, true, 69930, new Class[]{Resources.class, short[].class}, String[].class);
        }
        String[] stringArray = resources2.getStringArray(C0906R.array.f4411f);
        String[] strArr = new String[sArr2.length];
        for (int i2 = 0; i2 < sArr2.length; i2++) {
            strArr[i2] = stringArray[sArr2[i2]];
        }
        return strArr;
    }

    public final void a(@StringRes int i2, @StringRes int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f61424a, false, 69955, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f61424a, false, 69955, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        new a.C0185a(this.f61425b).a(i2).b(i3).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) null).a((int) C0906R.string.ajx, (DialogInterface.OnClickListener) new k(this)).a().a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.net.Uri r20, boolean r21, int r22) {
        /*
            r19 = this;
            r7 = r19
            r8 = r22
            r9 = 3
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r20
            java.lang.Byte r1 = java.lang.Byte.valueOf(r21)
            r11 = 1
            r0[r11] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r12 = 2
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f61424a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 69940(0x11134, float:9.8007E-41)
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0062
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r20
            java.lang.Byte r1 = java.lang.Byte.valueOf(r21)
            r0[r11] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f61424a
            r3 = 0
            r4 = 69940(0x11134, float:9.8007E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0062:
            if (r20 != 0) goto L_0x0065
            return
        L_0x0065:
            if (r21 == 0) goto L_0x0068
            goto L_0x0093
        L_0x0068:
            java.lang.String r0 = r20.getLastPathSegment()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 19
            if (r1 < r2) goto L_0x0088
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0088
            java.lang.String r1 = ":"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L_0x0088
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)
            r0 = r0[r11]
        L_0x0088:
            android.net.Uri r1 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ NumberFormatException -> 0x0093 }
            long r2 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0093 }
            android.net.Uri r0 = android.content.ContentUris.withAppendedId(r1, r2)     // Catch:{ NumberFormatException -> 0x0093 }
            goto L_0x0095
        L_0x0093:
            r0 = r20
        L_0x0095:
            android.support.v4.app.Fragment r1 = r7.f61427d
            if (r1 == 0) goto L_0x00a0
            android.support.v4.app.Fragment r1 = r7.f61427d
            android.content.Context r1 = r1.getContext()
            goto L_0x00a2
        L_0x00a0:
            android.app.Activity r1 = r7.f61425b
        L_0x00a2:
            if (r1 != 0) goto L_0x00a5
            return
        L_0x00a5:
            android.app.Activity r2 = r7.f61425b
            java.lang.String r14 = com.ss.android.newmedia.e.a((android.content.Context) r2, (android.net.Uri) r0)
            r0 = 10003(0x2713, float:1.4017E-41)
            if (r8 == r0) goto L_0x00b6
            r0 = 10004(0x2714, float:1.4019E-41)
            if (r8 != r0) goto L_0x00b4
            goto L_0x00b6
        L_0x00b4:
            r15 = 0
            goto L_0x00b7
        L_0x00b6:
            r15 = 1
        L_0x00b7:
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r15 != 0) goto L_0x00d1
            r2 = 10009(0x2719, float:1.4026E-41)
            if (r8 == r2) goto L_0x00d1
            r2 = 10008(0x2718, float:1.4024E-41)
            if (r8 == r2) goto L_0x00d1
            r2 = 10010(0x271a, float:1.4027E-41)
            if (r8 == r2) goto L_0x00d1
            r2 = 10011(0x271b, float:1.4028E-41)
            if (r8 != r2) goto L_0x00cc
            goto L_0x00d1
        L_0x00cc:
            r2 = 1058013184(0x3f100000, float:0.5625)
            r16 = 1058013184(0x3f100000, float:0.5625)
            goto L_0x00d3
        L_0x00d1:
            r16 = 1065353216(0x3f800000, float:1.0)
        L_0x00d3:
            float r0 = r16 - r0
            float r0 = java.lang.Math.abs(r0)
            r2 = 8388608(0x800000, float:1.17549435E-38)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e9
            r0 = 1106247680(0x41f00000, float:30.0)
        L_0x00e1:
            float r0 = com.bytedance.common.utility.UIUtils.dip2Px(r1, r0)
            int r0 = (int) r0
            r17 = r0
            goto L_0x00ec
        L_0x00e9:
            r0 = 1098907648(0x41800000, float:16.0)
            goto L_0x00e1
        L_0x00ec:
            android.support.v4.app.Fragment r0 = r7.f61427d
            if (r0 != 0) goto L_0x00fa
            com.ss.android.ugc.aweme.profile.ui.CropActivity$a r12 = com.ss.android.ugc.aweme.profile.ui.CropActivity.g
            android.app.Activity r13 = r7.f61425b
            r18 = 10002(0x2712, float:1.4016E-41)
            r12.a((android.app.Activity) r13, (java.lang.String) r14, (boolean) r15, (float) r16, (int) r17, (int) r18)
            return
        L_0x00fa:
            com.ss.android.ugc.aweme.profile.ui.CropActivity$a r12 = com.ss.android.ugc.aweme.profile.ui.CropActivity.g
            android.support.v4.app.Fragment r13 = r7.f61427d
            r18 = 10002(0x2712, float:1.4016E-41)
            r12.a((android.support.v4.app.Fragment) r13, (java.lang.String) r14, (boolean) r15, (float) r16, (int) r17, (int) r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.d.j.a(android.net.Uri, boolean, int):void");
    }

    public j(Activity activity, Fragment fragment, WeakHandler weakHandler, a aVar) {
        File file;
        File file2;
        this.f61425b = activity;
        this.f61427d = fragment;
        this.g = weakHandler;
        this.h = aVar;
        if (PatchProxy.isSupport(new Object[]{"head"}, this, f61424a, false, 69928, new Class[]{String.class}, File.class)) {
            file = (File) PatchProxy.accessDispatch(new Object[]{"head"}, this, f61424a, false, 69928, new Class[]{String.class}, File.class);
        } else if (!com.ss.android.ugc.aweme.video.b.g() || !com.ss.android.ugc.aweme.video.b.h() || TextUtils.isEmpty("head")) {
            file = null;
        } else {
            Activity activity2 = this.f61425b;
            if (PatchProxy.isSupport(new Object[]{activity2}, this, f61424a, false, 69929, new Class[]{Context.class}, File.class)) {
                file2 = (File) PatchProxy.accessDispatch(new Object[]{activity2}, this, f61424a, false, 69929, new Class[]{Context.class}, File.class);
            } else {
                file2 = activity2.getExternalCacheDir();
                if (file2 == null) {
                    file2 = Environment.getExternalStorageDirectory();
                }
            }
            File file3 = new File(file2, "head");
            com.ss.android.ugc.aweme.video.b.a(file3);
            file = file3;
        }
        if (file != null) {
            this.f61428e = file.getPath();
        } else {
            this.f61428e = "";
        }
        this.f61429f = "head.data";
        this.f61426c = this.f61425b.getResources();
    }
}

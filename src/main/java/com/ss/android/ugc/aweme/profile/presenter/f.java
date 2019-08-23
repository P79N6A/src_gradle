package com.ss.android.ugc.aweme.profile.presenter;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ac.b;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.d.j;
import com.ss.android.ugc.aweme.profile.d.l;
import com.ss.android.ugc.aweme.profile.ui.ProfileCoverCropActivity;
import com.ss.android.ugc.aweme.profile.ui.ProfileCoverLibActivity;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 #2\u00020\u0001:\u0001#B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0012\u001a\u00020\u0013J \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0010\u0010\u001a\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0010\u0010\u001d\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u001cJ\b\u0010\u001f\u001a\u00020\u0013H\u0002J\b\u0010 \u001a\u00020\u0013H\u0002J\b\u0010!\u001a\u00020\u0013H\u0002J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/presenter/ChangeCoverPresenter;", "", "activity", "Landroid/app/Activity;", "mFragment", "Landroid/support/v4/app/Fragment;", "mFinishSelf", "", "(Landroid/app/Activity;Landroid/support/v4/app/Fragment;Z)V", "mActivity", "mChooseDialog", "Landroid/support/v7/app/AlertDialog;", "mChooseType", "", "", "[Ljava/lang/String;", "mProfileCoverFile", "Ljava/io/File;", "changeCover", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onRestoreInstanceState", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "outState", "openCameraActivity", "openCoverLibActivity", "openGalleryActivity", "startGalleryActivityReal", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61612a = null;
    public static final int g = 1;
    public static final int h = 2;
    public static final a i = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public Activity f61613b;

    /* renamed from: c  reason: collision with root package name */
    public AlertDialog f61614c;

    /* renamed from: d  reason: collision with root package name */
    public File f61615d;

    /* renamed from: e  reason: collision with root package name */
    public final Fragment f61616e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f61617f;
    private final String[] j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/presenter/ChangeCoverPresenter$Companion;", "", "()V", "REQUEST_FROM_CAMERA", "", "REQUEST_FROM_GALLERY", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61618a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f61619b;

        b(f fVar) {
            this.f61619b = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String str;
            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f61618a, false, 67569, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f61618a, false, 67569, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            switch (i) {
                case 0:
                    str = "camera";
                    f fVar = this.f61619b;
                    if (PatchProxy.isSupport(new Object[0], fVar, f.f61612a, false, 67567, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], fVar, f.f61612a, false, 67567, new Class[0], Void.TYPE);
                    } else {
                        com.ss.android.ugc.aweme.ac.b.a(fVar.f61613b, new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}, new c(fVar));
                    }
                    x a2 = x.a();
                    Intrinsics.checkExpressionValueIsNotNull(a2, "CommonSharePrefCache.inst()");
                    a2.w().a(Integer.MAX_VALUE);
                    break;
                case 1:
                    str = "sys_album";
                    f fVar2 = this.f61619b;
                    if (PatchProxy.isSupport(new Object[0], fVar2, f.f61612a, false, 67564, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], fVar2, f.f61612a, false, 67564, new Class[0], Void.TYPE);
                    } else {
                        com.ss.android.ugc.aweme.ac.b.a(fVar2.f61613b, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, new d(fVar2));
                    }
                    x a3 = x.a();
                    Intrinsics.checkExpressionValueIsNotNull(a3, "CommonSharePrefCache.inst()");
                    a3.w().a(Integer.MAX_VALUE);
                    break;
                case 2:
                    str = "app_album";
                    f fVar3 = this.f61619b;
                    if (PatchProxy.isSupport(new Object[0], fVar3, f.f61612a, false, 67563, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], fVar3, f.f61612a, false, 67563, new Class[0], Void.TYPE);
                    } else {
                        Intent intent = new Intent(fVar3.f61613b, ProfileCoverLibActivity.class);
                        Activity activity = fVar3.f61613b;
                        if (activity == null) {
                            Intrinsics.throwNpe();
                        }
                        activity.startActivity(intent);
                    }
                    x a4 = x.a();
                    Intrinsics.checkExpressionValueIsNotNull(a4, "CommonSharePrefCache.inst()");
                    an<Integer> w = a4.w();
                    Intrinsics.checkExpressionValueIsNotNull(w, "CommonSharePrefCache.inst().editCoverTipShowTime");
                    w.a(Integer.MAX_VALUE);
                    if (this.f61619b.f61617f) {
                        Activity activity2 = this.f61619b.f61613b;
                        if (activity2 == null) {
                            Intrinsics.throwNpe();
                        }
                        activity2.finish();
                        break;
                    }
                    break;
                default:
                    str = "cancel";
                    AlertDialog alertDialog = this.f61619b.f61614c;
                    if (alertDialog == null) {
                        Intrinsics.throwNpe();
                    }
                    alertDialog.dismiss();
                    break;
            }
            r.a("replace_profile_cover", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_method", str).f34114b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012,\u0010\u0002\u001a(\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "permissions", "", "", "kotlin.jvm.PlatformType", "grantResults", "", "onRequestPermissionResult", "([Ljava/lang/String;[I)V"}, k = 3, mv = {1, 1, 15})
    static final class c implements b.C0400b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61620a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f61621b;

        c(f fVar) {
            this.f61621b = fVar;
        }

        public final void a(String[] strArr, int[] iArr) {
            if (PatchProxy.isSupport(new Object[]{strArr, iArr}, this, f61620a, false, 67570, new Class[]{String[].class, int[].class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{strArr, iArr}, this, f61620a, false, 67570, new Class[]{String[].class, int[].class}, Void.TYPE);
            } else if (strArr.length > 1 && iArr[0] == 0 && iArr[1] == 0) {
                this.f61621b.f61615d = l.a();
                Activity activity = this.f61621b.f61613b;
                if (activity == null) {
                    Intrinsics.throwNpe();
                }
                Fragment fragment = this.f61621b.f61616e;
                int i = f.h;
                File file = this.f61621b.f61615d;
                if (file == null) {
                    Intrinsics.throwNpe();
                }
                String parent = file.getParent();
                File file2 = this.f61621b.f61615d;
                if (file2 == null) {
                    Intrinsics.throwNpe();
                }
                e.a(activity, fragment, i, parent, file2.getName());
            } else {
                Activity activity2 = this.f61621b.f61613b;
                if (activity2 == null) {
                    Intrinsics.throwNpe();
                }
                com.bytedance.ies.dmt.ui.d.a.b((Context) activity2, (int) C0906R.string.bm2, 0).a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012,\u0010\u0002\u001a(\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "permissions", "", "", "kotlin.jvm.PlatformType", "grantResults", "", "onRequestPermissionResult", "([Ljava/lang/String;[I)V"}, k = 3, mv = {1, 1, 15})
    static final class d implements b.C0400b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61622a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f61623b;

        d(f fVar) {
            this.f61623b = fVar;
        }

        public final void a(String[] strArr, int[] iArr) {
            boolean z;
            com.zhihu.matisse.a aVar;
            if (PatchProxy.isSupport(new Object[]{strArr, iArr}, this, f61622a, false, 67571, new Class[]{String[].class, int[].class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{strArr, iArr}, this, f61622a, false, 67571, new Class[]{String[].class, int[].class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(strArr, "permissions");
            if (strArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!(!z) || iArr[0] != 0) {
                Activity activity = this.f61623b.f61613b;
                if (activity == null) {
                    Intrinsics.throwNpe();
                }
                com.bytedance.ies.dmt.ui.d.a.b((Context) activity, (int) C0906R.string.bm4, 0).a();
            } else {
                f fVar = this.f61623b;
                int i = f.g;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, fVar, f.f61612a, false, 67561, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    f fVar2 = fVar;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, fVar2, f.f61612a, false, 67561, new Class[]{Integer.TYPE}, Void.TYPE);
                } else {
                    try {
                        if (fVar.f61616e == null) {
                            aVar = com.zhihu.matisse.a.a(fVar.f61613b);
                        } else {
                            aVar = com.zhihu.matisse.a.a(fVar.f61616e);
                        }
                        aVar.a(com.zhihu.matisse.b.ofImage()).a(true).b(false).b(1).c(-1).a((int) C0906R.style.g6).a(0.85f).a((com.zhihu.matisse.a.a) new com.zhihu.matisse.a.a.a()).a((com.zhihu.matisse.b.a) new j.b()).d(i);
                    } catch (Exception e2) {
                        com.ss.android.ugc.aweme.framework.a.a.a(e2);
                        Activity activity2 = fVar.f61613b;
                        if (activity2 == null) {
                            Intrinsics.throwNpe();
                        }
                        e.a(activity2, fVar.f61616e, i);
                    }
                }
            }
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f61612a, false, 67562, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61612a, false, 67562, new Class[0], Void.TYPE);
            return;
        }
        if (this.f61614c == null) {
            Activity activity = this.f61613b;
            if (activity == null) {
                Intrinsics.throwNpe();
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setItems((CharSequence[]) this.j, (DialogInterface.OnClickListener) new b(this));
            this.f61614c = builder.create();
        }
        r.a("replace_profile_info", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_method", "click_cover").f34114b);
        AlertDialog alertDialog = this.f61614c;
        if (alertDialog == null) {
            Intrinsics.throwNpe();
        }
        alertDialog.show();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003e, code lost:
        if (r0 == null) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(@org.jetbrains.annotations.Nullable android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f61612a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 67566(0x107ee, float:9.468E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f61612a
            r13 = 0
            r14 = 67566(0x107ee, float:9.468E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0036:
            if (r0 == 0) goto L_0x0040
            java.lang.String r2 = "profile_cover_file"
            java.lang.String r0 = r0.getString(r2)
            if (r0 != 0) goto L_0x0042
        L_0x0040:
            java.lang.String r0 = ""
        L_0x0042:
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L_0x004f
            int r2 = r2.length()
            if (r2 != 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r1 = 0
        L_0x004f:
            if (r1 == 0) goto L_0x0052
            return
        L_0x0052:
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            r0 = r17
            r0.f61615d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.presenter.f.b(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0044, code lost:
        if (r3 == null) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.Nullable android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f61612a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 67565(0x107ed, float:9.4679E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f61612a
            r13 = 0
            r14 = 67565(0x107ed, float:9.4679E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0036:
            if (r0 == 0) goto L_0x004c
            java.lang.String r1 = "profile_cover_file"
            r2 = r17
            java.io.File r3 = r2.f61615d
            if (r3 == 0) goto L_0x0046
            java.lang.String r3 = r3.getAbsolutePath()
            if (r3 != 0) goto L_0x0048
        L_0x0046:
            java.lang.String r3 = ""
        L_0x0048:
            r0.putString(r1, r3)
            return
        L_0x004c:
            r2 = r17
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.presenter.f.a(android.os.Bundle):void");
    }

    public f(@Nullable Activity activity, @Nullable Fragment fragment, boolean z) {
        this.f61616e = fragment;
        this.f61617f = z;
        if (activity == null && this.f61616e == null) {
            throw new IllegalArgumentException("Must have a activity or a fragment");
        }
        this.f61613b = activity;
        if (this.f61613b == null) {
            Fragment fragment2 = this.f61616e;
            if (fragment2 == null) {
                Intrinsics.throwNpe();
            }
            this.f61613b = fragment2.getActivity();
        }
        Activity activity2 = this.f61613b;
        if (activity2 == null) {
            Intrinsics.throwNpe();
        }
        String[] a2 = j.a(activity2.getResources(), 0, 1, 2, 4);
        Intrinsics.checkExpressionValueIsNotNull(a2, "HeadUploadHelper.resStri…_STRING_ARRAY_IDX_CANCEL)");
        this.j = a2;
    }

    public final void a(int i2, int i3, @Nullable Intent intent) {
        Uri uri;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent}, this, f61612a, false, 67568, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent}, this, f61612a, false, 67568, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
        } else if (this.f61613b != null && i3 != 0) {
            if (i4 == g) {
                if (intent != null) {
                    List a2 = com.zhihu.matisse.a.a(intent);
                    if (a2 == null || a2.isEmpty()) {
                        uri = intent.getData();
                    } else {
                        uri = (Uri) a2.get(0);
                    }
                    String a3 = e.a((Context) this.f61613b, uri);
                    if (StringUtils.isEmpty(a3)) {
                        Activity activity = this.f61613b;
                        if (activity == null) {
                            Intrinsics.throwNpe();
                        }
                        UIUtils.displayToastWithIcon((Context) activity, 2130838336, (int) C0906R.string.bmo);
                        return;
                    }
                    this.f61615d = new File(a3);
                    File file = this.f61615d;
                    if (file == null) {
                        Intrinsics.throwNpe();
                    }
                    if (!file.exists()) {
                        Activity activity2 = this.f61613b;
                        if (activity2 == null) {
                            Intrinsics.throwNpe();
                        }
                        UIUtils.displayToastWithIcon((Context) activity2, 2130838336, (int) C0906R.string.bmo);
                        return;
                    }
                    Context context = this.f61613b;
                    File file2 = this.f61615d;
                    if (file2 == null) {
                        Intrinsics.throwNpe();
                    }
                    ProfileCoverCropActivity.a(context, file2.getAbsolutePath(), 2);
                    if (this.f61617f) {
                        Activity activity3 = this.f61613b;
                        if (activity3 == null) {
                            Intrinsics.throwNpe();
                        }
                        activity3.finish();
                    }
                }
            } else if (i4 == h) {
                if (this.f61615d == null) {
                    if (intent != null) {
                        String a4 = e.a((Context) this.f61613b, intent.getData());
                        if (StringUtils.isEmpty(a4)) {
                            Activity activity4 = this.f61613b;
                            if (activity4 == null) {
                                Intrinsics.throwNpe();
                            }
                            UIUtils.displayToastWithIcon((Context) activity4, 2130838336, (int) C0906R.string.bmo);
                            return;
                        }
                        this.f61615d = new File(a4);
                    } else {
                        return;
                    }
                }
                File file3 = this.f61615d;
                if (file3 == null) {
                    Intrinsics.throwNpe();
                }
                if (!file3.exists()) {
                    Activity activity5 = this.f61613b;
                    if (activity5 == null) {
                        Intrinsics.throwNpe();
                    }
                    UIUtils.displayToastWithIcon((Context) activity5, 2130838336, (int) C0906R.string.bmo);
                    return;
                }
                Activity activity6 = this.f61613b;
                if (activity6 == null) {
                    Intrinsics.throwNpe();
                }
                Context context2 = activity6;
                File file4 = this.f61615d;
                if (file4 == null) {
                    Intrinsics.throwNpe();
                }
                ProfileCoverCropActivity.a(context2, file4.getAbsolutePath(), 1);
                if (this.f61617f) {
                    Activity activity7 = this.f61613b;
                    if (activity7 == null) {
                        Intrinsics.throwNpe();
                    }
                    activity7.finish();
                }
            }
        }
    }
}

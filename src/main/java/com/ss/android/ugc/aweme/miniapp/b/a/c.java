package com.ss.android.ugc.aweme.miniapp.b.a;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.AppbrandApplication;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.permission.AppbrandPermissionType;
import com.tt.miniapphost.permission.IPermissionsResultAction;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55493a = null;

    /* renamed from: b  reason: collision with root package name */
    static String f55494b = "BrandPermissionUtils";

    /* renamed from: c  reason: collision with root package name */
    static String f55495c = "permission";

    /* renamed from: d  reason: collision with root package name */
    static int f55496d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static SparseArray<List<IPermissionsResultAction>> f55497e = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    public static final Object f55498f = new Object();
    private static String g = AppbrandApplication.getInst().getAppInfo().appId;

    public enum a {
        USER_INFO(AppbrandPermissionType.PERMISSION_USER_INFO, AppbrandContext.getInst().getApplicationContext().getString(C0906R.string.cmn), HostDependManager.getInst().getPermissionCustomDialogMsgEntity().getUserInfoDialogMsg()),
        LOCATION(AppbrandPermissionType.PERMISSION_LOCATION, AppbrandContext.getInst().getApplicationContext().getString(C0906R.string.cm8), HostDependManager.getInst().getPermissionCustomDialogMsgEntity().getLocationDialogMsg()),
        RECORD_AUDIO(AppbrandPermissionType.PERMISSION_RECORD_AUDIO, AppbrandContext.getInst().getApplicationContext().getString(C0906R.string.cm9), HostDependManager.getInst().getPermissionCustomDialogMsgEntity().getRecordAudioDialogMsg()),
        CAMERA(AppbrandPermissionType.PERMISSION_CAMERA, AppbrandContext.getInst().getApplicationContext().getString(C0906R.string.cm1), HostDependManager.getInst().getPermissionCustomDialogMsgEntity().getCameraDialogMsg()),
        ADDRESS(AppbrandPermissionType.PERMISSION_ADDRESS, AppbrandContext.getInst().getApplicationContext().getString(C0906R.string.clz), HostDependManager.getInst().getPermissionCustomDialogMsgEntity().getAddressDialogMsg()),
        PHONE_NUMBER(AppbrandPermissionType.PERMISSION_PHONE_NUMBER, AppbrandContext.getInst().getApplicationContext().getString(C0906R.string.cmm), HostDependManager.getInst().getPermissionCustomDialogMsgEntity().getPhoneNumberDialogMsg());
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public static List<a> sStrictPermissionList;
        public static List<a> sUserDefinablePermissionList;
        public String msg;
        public String name;
        public AppbrandPermissionType permissionType;

        public static List<a> getUserDefinablePermissionList() {
            return sUserDefinablePermissionList;
        }

        public final String getName() {
            return this.name;
        }

        public final AppbrandPermissionType getPermissionType() {
            return this.permissionType;
        }

        static {
            sUserDefinablePermissionList = new ArrayList();
            sStrictPermissionList = new ArrayList();
            sUserDefinablePermissionList.add(USER_INFO);
            sUserDefinablePermissionList.add(LOCATION);
            sUserDefinablePermissionList.add(CAMERA);
            sUserDefinablePermissionList.add(RECORD_AUDIO);
            sUserDefinablePermissionList.add(ADDRESS);
            sStrictPermissionList.add(PHONE_NUMBER);
        }

        public static boolean isStrictPermission(a aVar) {
            a aVar2 = aVar;
            if (!PatchProxy.isSupport(new Object[]{aVar2}, null, changeQuickRedirect, true, 59288, new Class[]{a.class}, Boolean.TYPE)) {
                return sStrictPermissionList.contains(aVar2);
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar2}, null, changeQuickRedirect, true, 59288, new Class[]{a.class}, Boolean.TYPE)).booleanValue();
        }

        private a(AppbrandPermissionType appbrandPermissionType, String str, String str2) {
            this.permissionType = appbrandPermissionType;
            this.name = str;
            this.msg = str2;
            Application applicationContext = AppbrandContext.getInst().getApplicationContext();
            if (TextUtils.isEmpty(str2)) {
                switch (appbrandPermissionType) {
                    case PERMISSION_USER_INFO:
                        this.msg = applicationContext.getString(C0906R.string.clw);
                        return;
                    case PERMISSION_LOCATION:
                        this.msg = applicationContext.getString(C0906R.string.clu);
                        return;
                    case PERMISSION_RECORD_AUDIO:
                        this.msg = applicationContext.getString(C0906R.string.clv);
                        return;
                    case PERMISSION_CAMERA:
                        this.msg = applicationContext.getString(C0906R.string.clt);
                        return;
                    case PERMISSION_ADDRESS:
                        this.msg = applicationContext.getString(C0906R.string.cly);
                        return;
                    case PERMISSION_PHONE_NUMBER:
                        this.msg = applicationContext.getString(C0906R.string.clx);
                        break;
                }
            }
        }
    }

    private static boolean a(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f55493a, true, 59276, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f55493a, true, 59276, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (b(i) || !b()) {
            SharedPreferences a2 = a();
            return a2.getBoolean(f55495c + i2, false);
        } else {
            a(i2, true);
            return true;
        }
    }

    private static SharedPreferences a() {
        String str;
        if (PatchProxy.isSupport(new Object[0], null, f55493a, true, 59272, new Class[0], SharedPreferences.class)) {
            return (SharedPreferences) PatchProxy.accessDispatch(new Object[0], null, f55493a, true, 59272, new Class[0], SharedPreferences.class);
        }
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        if (PatchProxy.isSupport(new Object[0], null, f55493a, true, 59273, new Class[0], String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[0], null, f55493a, true, 59273, new Class[0], String.class);
        } else {
            str = "permission_" + g;
        }
        return com.ss.android.ugc.aweme.q.c.a(applicationContext, str, 0);
    }

    private static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f55493a, true, 59275, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f55493a, true, 59275, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AppInfoEntity appInfo = AppbrandApplication.getInst().getAppInfo();
        if (appInfo == null) {
            return false;
        }
        AppBrandLogger.d(f55494b, "canignorePermission  getinnertype = ", Integer.valueOf(appInfo.innertype));
        if (appInfo.innertype == f55496d) {
            return true;
        }
        return false;
    }

    public static String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f55493a, true, 59270, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f55493a, true, 59270, new Class[]{String.class}, String.class);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errMsg", str2 + ":fail auth deny");
            return jSONObject.toString();
        } catch (Exception e2) {
            AppBrandLogger.stacktrace(6, f55494b, e2.getStackTrace());
            return "";
        }
    }

    private static boolean b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f55493a, true, 59277, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f55493a, true, 59277, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        SharedPreferences a2 = a();
        return a2.contains(f55495c + i);
    }

    public static void a(int i, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, null, f55493a, true, 59274, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z)}, null, f55493a, true, 59274, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor edit = a().edit();
        edit.putBoolean(f55495c + i, z).apply();
    }

    public static void a(Activity activity, @NonNull a aVar, @NonNull IPermissionsResultAction iPermissionsResultAction) {
        Activity activity2 = activity;
        a aVar2 = aVar;
        IPermissionsResultAction iPermissionsResultAction2 = iPermissionsResultAction;
        if (PatchProxy.isSupport(new Object[]{activity2, aVar2, iPermissionsResultAction2}, null, f55493a, true, 59268, new Class[]{Activity.class, a.class, IPermissionsResultAction.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, aVar2, iPermissionsResultAction2}, null, f55493a, true, 59268, new Class[]{Activity.class, a.class, IPermissionsResultAction.class}, Void.TYPE);
            return;
        }
        a(activity2, aVar2, null, iPermissionsResultAction2);
    }

    private static void a(Activity activity, @NonNull a aVar, @Nullable String str, @NonNull IPermissionsResultAction iPermissionsResultAction) {
        final Activity activity2 = activity;
        final a aVar2 = aVar;
        final IPermissionsResultAction iPermissionsResultAction2 = iPermissionsResultAction;
        if (PatchProxy.isSupport(new Object[]{activity2, aVar2, null, iPermissionsResultAction2}, null, f55493a, true, 59269, new Class[]{Activity.class, a.class, String.class, IPermissionsResultAction.class}, Void.TYPE)) {
            Object[] objArr = {activity2, aVar2, null, iPermissionsResultAction2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f55493a, true, 59269, new Class[]{Activity.class, a.class, String.class, IPermissionsResultAction.class}, Void.TYPE);
            return;
        }
        boolean isStrictPermission = a.isStrictPermission(aVar);
        if (!isStrictPermission && a(aVar2.permissionType.getmData())) {
            iPermissionsResultAction.onGranted();
            if (AppbrandPermissionType.PERMISSION_USER_INFO == aVar2.permissionType && g.a()) {
                HostDependManager.getInst().savePermissionGrant(AppbrandPermissionType.PERMISSION_USER_INFO, g.b());
            }
        } else if (activity2 != null) {
            if (isStrictPermission || !b(aVar2.permissionType.getmData())) {
                synchronized (f55498f) {
                    List list = f55497e.get(aVar2.permissionType.getmData());
                    if (list == null || list.size() <= 0) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(iPermissionsResultAction2);
                        f55497e.put(aVar2.permissionType.getmData(), arrayList);
                        new Handler(Looper.getMainLooper()).post(new Runnable(null) {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f55499a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f55499a, false, 59278, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f55499a, false, 59278, new Class[0], Void.TYPE);
                                    return;
                                }
                                String str = aVar2.msg;
                                if (!TextUtils.isEmpty(null)) {
                                    str = str + null;
                                }
                                final Dialog showPermissionDialog = HostDependManager.getInst().showPermissionDialog(activity2, aVar2.permissionType, str, new IPermissionsResultAction() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f55504a;

                                    public final void onGranted() {
                                        if (PatchProxy.isSupport(new Object[0], this, f55504a, false, 59279, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], this, f55504a, false, 59279, new Class[0], Void.TYPE);
                                            return;
                                        }
                                        c.a(aVar2.permissionType.getmData(), true);
                                        a(aVar2, true);
                                        if (AppbrandContext.getInst().isGame()) {
                                            b.a(activity2);
                                        }
                                    }

                                    public final void onDenied(String str) {
                                        if (PatchProxy.isSupport(new Object[]{str}, this, f55504a, false, 59280, new Class[]{String.class}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{str}, this, f55504a, false, 59280, new Class[]{String.class}, Void.TYPE);
                                            return;
                                        }
                                        c.a(aVar2.permissionType.getmData(), false);
                                        a(aVar2, false);
                                        if (AppbrandContext.getInst().isGame()) {
                                            b.a(activity2);
                                        }
                                    }

                                    private void a(a aVar, boolean z) {
                                        a aVar2 = aVar;
                                        if (PatchProxy.isSupport(new Object[]{aVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f55504a, false, 59281, new Class[]{a.class, Boolean.TYPE}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{aVar2, Byte.valueOf(z)}, this, f55504a, false, 59281, new Class[]{a.class, Boolean.TYPE}, Void.TYPE);
                                            return;
                                        }
                                        synchronized (c.f55498f) {
                                            List<IPermissionsResultAction> list = c.f55497e.get(aVar2.permissionType.getmData());
                                            if (z) {
                                                for (IPermissionsResultAction onGranted : list) {
                                                    onGranted.onGranted();
                                                }
                                            } else {
                                                for (IPermissionsResultAction onDenied : list) {
                                                    onDenied.onDenied(aVar2.name);
                                                }
                                            }
                                            list.clear();
                                        }
                                    }
                                });
                                if (showPermissionDialog == null) {
                                    showPermissionDialog = new Dialog(activity2);
                                    showPermissionDialog.requestWindowFeature(1);
                                    showPermissionDialog.setCancelable(false);
                                    showPermissionDialog.setContentView(C0906R.layout.f1);
                                    Window window = showPermissionDialog.getWindow();
                                    if (window != null) {
                                        window.setBackgroundDrawableResource(C0906R.color.a7l);
                                        ((TextView) window.findViewById(C0906R.id.bxf)).setVisibility(8);
                                        ((TextView) window.findViewById(C0906R.id.title)).setText("“" + AppbrandApplication.getInst().getAppInfo().appName + "”申请获得以下权限");
                                        ((TextView) window.findViewById(C0906R.id.bnt)).setText(str);
                                        window.findViewById(C0906R.id.pi).setOnClickListener(new View.OnClickListener() {

                                            /* renamed from: a  reason: collision with root package name */
                                            public static ChangeQuickRedirect f55506a;

                                            public final void onClick(View view) {
                                                if (PatchProxy.isSupport(new Object[]{view}, this, f55506a, false, 59282, new Class[]{View.class}, Void.TYPE)) {
                                                    PatchProxy.accessDispatch(new Object[]{view}, this, f55506a, false, 59282, new Class[]{View.class}, Void.TYPE);
                                                    return;
                                                }
                                                ClickInstrumentation.onClick(view);
                                                c.a(aVar2.permissionType.getmData(), true);
                                                iPermissionsResultAction2.onGranted();
                                                Dialog dialog = showPermissionDialog;
                                                if (PatchProxy.isSupport(new Object[]{dialog}, null, d.f55513a, true, 59283, new Class[]{Dialog.class}, Void.TYPE)) {
                                                    PatchProxy.accessDispatch(new Object[]{dialog}, null, d.f55513a, true, 59283, new Class[]{Dialog.class}, Void.TYPE);
                                                } else if (!com.ss.android.ugc.aweme.g.a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
                                                    dialog.dismiss();
                                                } else {
                                                    throw new IllegalStateException("debug check! this method should be called from main thread!");
                                                }
                                                if (AppbrandContext.getInst().isGame()) {
                                                    b.a(activity2);
                                                }
                                            }
                                        });
                                        window.findViewById(C0906R.id.pj).setOnClickListener(new View.OnClickListener() {

                                            /* renamed from: a  reason: collision with root package name */
                                            public static ChangeQuickRedirect f55509a;

                                            public final void onClick(View view) {
                                                if (PatchProxy.isSupport(new Object[]{view}, this, f55509a, false, 59284, new Class[]{View.class}, Void.TYPE)) {
                                                    PatchProxy.accessDispatch(new Object[]{view}, this, f55509a, false, 59284, new Class[]{View.class}, Void.TYPE);
                                                    return;
                                                }
                                                ClickInstrumentation.onClick(view);
                                                c.a(aVar2.permissionType.getmData(), false);
                                                iPermissionsResultAction2.onDenied(aVar2.name);
                                                Dialog dialog = showPermissionDialog;
                                                if (PatchProxy.isSupport(new Object[]{dialog}, null, e.f55514a, true, 59285, new Class[]{Dialog.class}, Void.TYPE)) {
                                                    PatchProxy.accessDispatch(new Object[]{dialog}, null, e.f55514a, true, 59285, new Class[]{Dialog.class}, Void.TYPE);
                                                } else if (!com.ss.android.ugc.aweme.g.a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
                                                    dialog.dismiss();
                                                } else {
                                                    throw new IllegalStateException("debug check! this method should be called from main thread!");
                                                }
                                                if (AppbrandContext.getInst().isGame()) {
                                                    b.a(activity2);
                                                }
                                            }
                                        });
                                        if (TextUtils.equals(Build.BRAND.toLowerCase(), "huawei") && Build.VERSION.SDK_INT >= 19) {
                                            window.setFlags(67108864, 67108864);
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                if (!activity2.isFinishing()) {
                                    showPermissionDialog.show();
                                }
                            }
                        });
                        return;
                    }
                    list.add(iPermissionsResultAction2);
                    return;
                }
            }
            iPermissionsResultAction2.onDenied(aVar2.name);
        }
    }
}

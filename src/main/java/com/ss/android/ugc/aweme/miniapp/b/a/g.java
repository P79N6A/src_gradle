package com.ss.android.ugc.aweme.miniapp.b.a;

import android.app.Application;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.q.c;
import com.tt.miniapphost.AppbrandApplication;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.permission.AppbrandPermissionType;
import com.tt.option.permission.HostOptionPermissionDepend;
import com.tt.option.permission.PermissionCustomDialogMsgEntity;

public final class g implements HostOptionPermissionDepend {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55515a;

    public final void savePermissionGrant(AppbrandPermissionType appbrandPermissionType, boolean z) {
    }

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f55515a, true, 59290, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f55515a, true, 59290, new Class[0], Boolean.TYPE)).booleanValue();
        }
        SharedPreferences a2 = c.a(AppbrandContext.getInst().getApplicationContext(), "HostOptionPermissionDependImpl", 0);
        return a2.contains(AppbrandApplication.getInst().getAppInfo().appId + "UserInfoGrantState");
    }

    public static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f55515a, true, 59291, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f55515a, true, 59291, new Class[0], Boolean.TYPE)).booleanValue();
        }
        SharedPreferences a2 = c.a(AppbrandContext.getInst().getApplicationContext(), "HostOptionPermissionDependImpl", 0);
        return a2.getBoolean(AppbrandApplication.getInst().getAppInfo().appId + "UserInfoGrantState", false);
    }

    public final PermissionCustomDialogMsgEntity getPermissionCustomDialogMsgEntity() {
        if (PatchProxy.isSupport(new Object[0], this, f55515a, false, 59289, new Class[0], PermissionCustomDialogMsgEntity.class)) {
            return (PermissionCustomDialogMsgEntity) PatchProxy.accessDispatch(new Object[0], this, f55515a, false, 59289, new Class[0], PermissionCustomDialogMsgEntity.class);
        }
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        return new PermissionCustomDialogMsgEntity.Builder().userInfoDialogMsg(applicationContext.getString(C0906R.string.clw)).locationDialogMsg(applicationContext.getString(C0906R.string.clu)).recordAudioDialogMsg(applicationContext.getString(C0906R.string.clv)).cameraDialogMsg(applicationContext.getString(C0906R.string.clt)).addressDialogMsg(applicationContext.getString(C0906R.string.cly)).phoneNumberDialogMsg(applicationContext.getString(C0906R.string.clx)).build();
    }
}

package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.AppLog;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.framework.services.IReportService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.profile.model.User;

public class ReportService implements IReportService {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void showReportDialog(Activity activity, String str, Uri.Builder builder, IReportService.IReportCallback iReportCallback) {
        boolean z;
        String str2;
        Activity activity2 = activity;
        String str3 = str;
        Uri.Builder builder2 = builder;
        if (PatchProxy.isSupport(new Object[]{activity2, str3, builder2, iReportCallback}, this, changeQuickRedirect, false, 71480, new Class[]{Activity.class, String.class, Uri.Builder.class, IReportService.IReportCallback.class}, Void.TYPE)) {
            Object[] objArr = {activity2, str3, builder2, iReportCallback};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, 71480, new Class[]{Activity.class, String.class, Uri.Builder.class, IReportService.IReportCallback.class}, Void.TYPE);
            return;
        }
        if (activity2 != null) {
            boolean a2 = a.a();
            if (a2 || d.a().isLogin()) {
                User curUser = d.a().getCurUser();
                if (curUser == null || !curUser.isDisciplineMember()) {
                    z = false;
                } else {
                    z = true;
                }
                if (a2) {
                    str2 = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getReportUrl();
                } else {
                    str2 = "https://aweme.snssdk.com/falcon/douyin_falcon/report/index.html";
                }
                Uri parse = Uri.parse(str2);
                builder2.scheme(parse.getScheme());
                builder2.authority(parse.getAuthority());
                builder2.path(parse.getPath());
                if (TextUtils.equals("ad", str3)) {
                    i a3 = i.a();
                    builder2.appendQueryParameter("app_name", a3.getAppName()).appendQueryParameter("device_id", AppLog.getServerDeviceId()).appendQueryParameter("platform", "android").appendQueryParameter("version", a3.getVersion()).appendQueryParameter("install_id", AppLog.getInstallId());
                }
                if (((Boolean) SharePrefCache.inst().getIsFirstReportVideo().c()).booleanValue() && !z) {
                    builder2.appendQueryParameter("isFirst", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                }
                Intent intent = new Intent(activity2, CrossPlatformActivity.class);
                Bundle bundle = new Bundle();
                bundle.putBoolean("show_load_dialog", false);
                bundle.putBoolean("hide_nav_bar", true);
                bundle.putString("status_bar_color", activity.getResources().getString(C0906R.color.yx).replace("#", ""));
                intent.putExtras(bundle);
                intent.setData(builder.build());
                activity2.startActivity(intent);
            } else {
                e.a(activity2, builder.build().getQueryParameter("report_from"), "report");
            }
        }
    }

    public void showReportDialog(Activity activity, String str, String str2, String str3, IReportService.IReportCallback iReportCallback) {
        if (PatchProxy.isSupport(new Object[]{activity, str, str2, str3, iReportCallback}, this, changeQuickRedirect, false, 71478, new Class[]{Activity.class, String.class, String.class, String.class, IReportService.IReportCallback.class}, Void.TYPE)) {
            Object[] objArr = {activity, str, str2, str3, iReportCallback};
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, 71478, new Class[]{Activity.class, String.class, String.class, String.class, IReportService.IReportCallback.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.report.a.a(activity, str, str2, str3);
    }

    public void showReportDialog(Activity activity, String str, String str2, String str3, String str4, IReportService.IReportCallback iReportCallback) {
        if (PatchProxy.isSupport(new Object[]{activity, str, str2, str3, str4, iReportCallback}, this, changeQuickRedirect, false, 71479, new Class[]{Activity.class, String.class, String.class, String.class, String.class, IReportService.IReportCallback.class}, Void.TYPE)) {
            Object[] objArr = {activity, str, str2, str3, str4, iReportCallback};
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, 71479, new Class[]{Activity.class, String.class, String.class, String.class, String.class, IReportService.IReportCallback.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.report.a.a(activity, str, str2, str3, str4, false, null);
    }
}

package com.taobao.applink.d;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.applink.TBAppLinkSDK;
import com.taobao.applink.a.b;
import com.taobao.applink.a.d;
import com.taobao.applink.a.e;
import com.taobao.applink.exception.TBAppLinkException;
import com.taobao.applink.h.c;
import com.taobao.applink.param.TBBaseParam;
import com.taobao.applink.util.TBAppLinkUtil;
import java.util.Map;

public class a {
    private static d a(TBBaseParam tBBaseParam) {
        if (tBBaseParam == null) {
            return null;
        }
        if (tBBaseParam.mTBAPIType == com.taobao.applink.a.a.AUTH) {
            return new b(tBBaseParam.mListener, tBBaseParam.linkKey);
        }
        if (tBBaseParam.mTBAPIType == com.taobao.applink.a.a.JUMP) {
            return new e();
        }
        return null;
    }

    private static void a(int i, Map map) {
        c.a(i, map);
    }

    private static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent();
        intent.setAction("com.tmall.wireless.intent.action.APPLINK");
        intent.setData(Uri.parse("tmall://page.tm/appLink?"));
        try {
            if (packageManager.getPackageInfo("com.tmall.wireless", 0) != null && packageManager.queryIntentActivities(intent, 65536).size() > 0) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static boolean a(Context context, Intent intent, d dVar) {
        return b(context, intent, dVar);
    }

    private static boolean a(Context context, TBBaseParam tBBaseParam, d dVar, TBAppLinkSDK.JumpFailedMode jumpFailedMode) throws TBAppLinkException {
        String str;
        com.taobao.applink.c.b bVar;
        String str2;
        Intent intent = new Intent("android.intent.action.VIEW");
        switch (jumpFailedMode) {
            case DOWNLOAD_TAOBAO:
                intent.setData(Uri.parse("http://huodong.m.taobao.com/go/2085.html"));
                if (com.taobao.applink.g.a.a() != null) {
                    com.taobao.applink.g.a.a().b(PushConstants.PUSH_TYPE_NOTIFY);
                }
                bVar = com.taobao.applink.c.b.a();
                str = TBAppLinkUtil.getNoneClientUrl();
                str2 = "jumpfailedmode=download";
                break;
            case OPEN_H5:
                if (com.taobao.applink.g.a.a() != null) {
                    com.taobao.applink.g.a.a().b(PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                }
                if (!com.taobao.applink.util.e.a(tBBaseParam.getH5URL())) {
                    intent.setData(Uri.parse(tBBaseParam.getH5URL()));
                    a(1, tBBaseParam.getParams());
                    bVar = com.taobao.applink.c.b.a();
                    str = TBAppLinkUtil.getNoneClientUrl();
                    str2 = "jumpfailedmode=open_h5";
                    break;
                } else {
                    return false;
                }
            case NONE:
                if (com.taobao.applink.g.a.a() != null) {
                    com.taobao.applink.g.a.a().b(PushConstants.PUSH_TYPE_UPLOAD_LOG);
                }
                com.taobao.applink.c.b.a().a(TBAppLinkUtil.getNoneClientUrl(), null, "jumpfailedmode=none");
                return false;
            default:
                return b(context, intent, dVar);
        }
        bVar.a(str, null, str2);
        return b(context, intent, dVar);
    }

    public static boolean a(Context context, TBBaseParam tBBaseParam, com.taobao.applink.f.a.b bVar) throws TBAppLinkException {
        if (context == null || tBBaseParam == null) {
            return false;
        }
        d a2 = a(tBBaseParam);
        if (a2 == null) {
            return false;
        }
        a2.b(context, bVar);
        Intent intent = new Intent("android.intent.action.VIEW");
        TBAppLinkSDK.JumpFailedMode jumpFailedMode = TBAppLinkSDK.getInstance().mJumpFailedMode;
        if (TextUtils.isEmpty(com.taobao.applink.c.b.a().b().f79160c) || !a(context) || !"tmall_scheme".equals(tBBaseParam.linkKey)) {
            intent.setData(Uri.parse(tBBaseParam.getJumpUrl(context)));
            intent.setAction("com.taobao.open.intent.action.GETWAY");
            intent.setFlags(805339136);
            if (!TBAppLinkUtil.isSupportAppLinkSDK(context, tBBaseParam.linkKey)) {
                return a(context, tBBaseParam, a2, jumpFailedMode);
            }
            a(2, tBBaseParam.getParams());
        } else {
            intent.setData(Uri.parse(tBBaseParam.getJumpUrl(context).replace("tbopen://m.taobao.com/tbopen/index.html?", "tmall://page.tm/appLink?")));
            intent.setAction("com.tmall.wireless.intent.action.APPLINK");
            intent.setFlags(805339136);
        }
        com.taobao.applink.c.b.a().a(TBAppLinkUtil.getClientUrl(), null, tBBaseParam.getExtraAplus());
        return a(context, intent, a2);
    }

    private static boolean b(Context context, Intent intent, d dVar) {
        if (!(context == null || intent == null || dVar == null)) {
            try {
                if (context instanceof Application) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                dVar.a();
                return true;
            } catch (Exception e2) {
                dVar.a(e2);
            }
        }
        return false;
    }
}

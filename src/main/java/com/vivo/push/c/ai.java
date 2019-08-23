package com.vivo.push.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.tencent.bugly.CrashModule;
import com.vivo.push.b.c;
import com.vivo.push.b.e;
import com.vivo.push.b.x;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.model.b;
import com.vivo.push.p;
import com.vivo.push.util.a;
import com.vivo.push.util.o;
import com.vivo.push.util.q;
import com.vivo.push.util.r;
import com.vivo.push.v;
import com.vivo.push.y;
import java.util.List;

public final class ai extends v {
    ai(y yVar) {
        super(yVar);
    }

    public final void a(y yVar) {
        if (this.f81705a == null) {
            o.d("SendCommandTask", "SendCommandTask " + yVar + " ; mContext is Null");
        } else if (yVar == null) {
            o.d("SendCommandTask", "SendCommandTask pushCommand is Null");
        } else {
            b a2 = r.a(this.f81705a);
            int b2 = yVar.b();
            if (b2 != 0) {
                if (b2 == 2009) {
                    o.a(ClientConfigManagerImpl.getInstance(this.f81705a).isDebug());
                    if (o.a()) {
                        p.a().k();
                        a aVar = new a();
                        aVar.a(this.f81705a, "com.vivo.push_preferences.hybridapptoken_v1");
                        aVar.a();
                        a aVar2 = new a();
                        aVar2.a(this.f81705a, "com.vivo.push_preferences.appconfig_v1");
                        aVar2.a();
                        if (!p.a().e()) {
                            ClientConfigManagerImpl.getInstance(this.f81705a).clearPush();
                        }
                    }
                } else if (b2 != 2011) {
                    switch (b2) {
                        case 2002:
                        case PushConstants.NOTIFICATIONSERVICE_SEND_MESSAGE:
                        case PushConstants.NOTIFICATIONSERVICE_SEND_MESSAGE_ERROR:
                        case PushConstants.NOTIFICATIONSERVICE_SEND_MESSAGE_BROADCAST:
                            if (a2 == null || a2.c()) {
                                p.a().a(((c) yVar).h(), 1005);
                                break;
                            } else {
                                c cVar = (c) yVar;
                                int a3 = q.a(cVar);
                                if (a3 != 0) {
                                    p.a().a(cVar.h(), a3);
                                    return;
                                }
                            }
                            break;
                    }
                } else {
                    o.a(ClientConfigManagerImpl.getInstance(this.f81705a).isDebug(((x) yVar).d()));
                }
            } else if (p.a().e()) {
                Context context = this.f81705a;
                Intent intent = new Intent();
                intent.setPackage(context.getPackageName());
                intent.setClassName(context.getPackageName(), "com.vivo.push.sdk.service.CommandService");
                List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, SearchJediMixFeedAdapter.f42517f);
                if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                    o.d("ModuleUtil", "disableDeprecatedService is null");
                } else {
                    PackageManager packageManager = context.getPackageManager();
                    ComponentName componentName = new ComponentName(context, queryIntentServices.get(0).serviceInfo.name);
                    if (packageManager.getComponentEnabledSetting(componentName) != 2) {
                        packageManager.setComponentEnabledSetting(componentName, 2, 1);
                    }
                }
                Context context2 = this.f81705a;
                Intent intent2 = new Intent();
                intent2.setPackage(context2.getPackageName());
                intent2.setClassName(context2.getPackageName(), "com.vivo.push.sdk.service.LinkProxyActivity");
                List<ResolveInfo> queryIntentActivities = context2.getPackageManager().queryIntentActivities(intent2, SearchJediMixFeedAdapter.f42517f);
                if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
                    o.d("ModuleUtil", "disableDeprecatedActivity is null");
                } else {
                    PackageManager packageManager2 = context2.getPackageManager();
                    ComponentName componentName2 = new ComponentName(context2, queryIntentActivities.get(0).activityInfo.name);
                    if (packageManager2.getComponentEnabledSetting(componentName2) != 2) {
                        packageManager2.setComponentEnabledSetting(componentName2, 2, 1);
                    }
                }
            }
            if (a2 == null) {
                o.d("SendCommandTask", "SendCommandTask " + yVar + " ; pushPkgInfo is Null");
                return;
            }
            String a4 = a2.a();
            if (a2.c()) {
                p.a().a(((c) yVar).h(), (int) CrashModule.MODULE_ID);
                yVar = new e();
                o.d("SendCommandTask", "SendCommandTask " + yVar + " ; pkgName is InBlackList ");
            }
            com.vivo.push.a.a.a(this.f81705a, a4, yVar);
        }
    }
}

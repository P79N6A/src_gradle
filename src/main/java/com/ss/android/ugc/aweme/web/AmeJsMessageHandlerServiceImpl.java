package com.ss.android.ugc.aweme.web;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.f.a.a;
import com.bytedance.ies.f.a.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.sdk.c.b;
import com.ss.android.ugc.aweme.fe.method.CloseHalfDialogBridge;
import com.ss.android.ugc.aweme.fe.method.OpenHalfDialogBridge;
import com.ss.android.ugc.aweme.net.o;
import com.ss.android.ugc.aweme.web.jsbridge.ab;
import com.ss.android.ugc.aweme.web.jsbridge.ac;
import com.ss.android.ugc.aweme.web.jsbridge.af;
import com.ss.android.ugc.aweme.web.jsbridge.ak;
import com.ss.android.ugc.aweme.web.jsbridge.al;
import com.ss.android.ugc.aweme.web.jsbridge.am;
import com.ss.android.ugc.aweme.web.jsbridge.i;
import com.ss.android.ugc.aweme.web.jsbridge.j;
import com.ss.android.ugc.aweme.web.jsbridge.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class AmeJsMessageHandlerServiceImpl implements IAmeJsMessageHandlerService {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<String> safeHostList = new ArrayList<String>() {
        {
            add("iesdouyin.com");
            add("douyincdn.com");
            add("douyinact.com");
            add("douyin.com");
            add("chengzijianzhan.com");
            add("ad.toutiao.com");
            add("jinritemai.com");
            add("s-b-l-f.com");
            add("s-b-l-f.cn");
            add("sb-lf.cn");
            add("reflow.huoshan.com");
            add("bytecdn.cn");
        }
    };

    public List<String> getSafeHosts() {
        return this.safeHostList;
    }

    public boolean isSafeDomain(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 89844, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 89844, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (o.a(str2, "tiktokv.com") || o.a(str2, "amemv.com") || o.a(str2, "snssdk.com") || o.a(str2, "toutiao.com") || o.a(str2, "neihanshequ.com") || o.a(str2, "youdianyisi.com") || o.a(str2, "jinritemai.com") || o.a(str2, "admin.bytedance.com")) {
            return true;
        } else {
            return false;
        }
    }

    public void registerJavaMethod(b bVar, WeakReference<Context> weakReference, Activity activity) {
        b bVar2 = bVar;
        WeakReference<Context> weakReference2 = weakReference;
        if (PatchProxy.isSupport(new Object[]{bVar2, weakReference2, activity}, this, changeQuickRedirect, false, 89845, new Class[]{b.class, WeakReference.class, Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2, weakReference2, activity}, this, changeQuickRedirect, false, 89845, new Class[]{b.class, WeakReference.class, Activity.class}, Void.TYPE);
            return;
        }
        a aVar = bVar2.f30719b;
        bVar2.a("zmCert", (d) new am(weakReference2, aVar)).a("syncCertificationStatus", (d) new i(weakReference2, aVar)).a("communityDisciplineInvite", (d) new c()).a("showLocationSelect", (d) new af(aVar, weakReference2)).a("finishLiveAgreement", (d) new ab()).a("finishLiveAnswer", (d) new v()).a("openHalfDialog", (d) new OpenHalfDialogBridge(weakReference2, aVar)).a("closeHalfDialog", (d) new CloseHalfDialogBridge(aVar)).a("appSetting", (d) new al(weakReference2, aVar)).a("rebindPhoneSucceed", (d) new ac(weakReference2)).a("checkInstalledApps", (d) new j(weakReference2)).a("thirdPartyAuth", (d) new ak(weakReference2, aVar));
    }
}

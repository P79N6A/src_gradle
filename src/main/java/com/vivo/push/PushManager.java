package com.vivo.push;

import android.content.Context;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.util.VivoPushException;
import com.vivo.push.util.o;
import com.vivo.push.util.x;
import com.vivo.push.util.y;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PushManager {
    private static final Object SLOCK = new Object();
    private static volatile PushManager sPushClient;

    public String getVersion() {
        return "2.3.1";
    }

    private void stopWork() {
        p.a().j();
    }

    public void checkManifest() throws VivoPushException {
        p.a().b();
    }

    public void disableNet() {
        p.a().o();
    }

    public void enableNet() {
        p.a().n();
    }

    public void initialize() {
        p.a().i();
    }

    /* access modifiers changed from: package-private */
    public void killPush() {
        p.a().r();
    }

    public void showDebugInfo() {
        p.a().p();
    }

    public void turnOffPush() {
        turnOffPush(null);
    }

    public void turnOnPush() {
        turnOnPush(null);
    }

    public Map<String, String> getDebugInfo() {
        return p.a().t();
    }

    public String getRegId() {
        return p.a().f();
    }

    public boolean isEnableNet() {
        return p.a().q();
    }

    public boolean isPushProcess() {
        return y.a(p.a().h());
    }

    public void reset() {
        if (o.a()) {
            p.a().m();
        }
    }

    public String getClientId() {
        return x.b(p.a().h()).a("com.vivo.pushservice.client_id", null);
    }

    public boolean isEnablePush() {
        return ClientConfigManagerImpl.getInstance(p.a().h()).isEnablePush();
    }

    public void delLocalAlias() {
        String localAlias = LocalAliasTagsManager.getInstance(p.a().h()).getLocalAlias();
        if (localAlias != null) {
            LocalAliasTagsManager.getInstance(p.a().h()).delLocalAlias(localAlias);
        }
    }

    public void setDebugMode(boolean z) {
        p.a().b(z);
    }

    public void setMode(int i) {
        p.a().a(i);
    }

    public void setNotifyStyle(int i) {
        p.a().b(i);
    }

    public void setSystemModel(boolean z) {
        p.a().a(z);
    }

    private void delLocalTag(String str) {
        checkParam(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        delLocalTags(arrayList);
    }

    private void setLocalTag(String str) {
        checkParam(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        setLocalTags(arrayList);
    }

    public void turnOffPush(IPushActionListener iPushActionListener) {
        p.a().b(iPushActionListener);
    }

    public void turnOnPush(IPushActionListener iPushActionListener) {
        p.a().a(iPushActionListener);
    }

    private PushManager(Context context) {
        p.a().a(context);
        LocalAliasTagsManager.getInstance(context).init();
    }

    public static PushManager getInstance(Context context) {
        if (sPushClient == null) {
            synchronized (SLOCK) {
                if (sPushClient == null) {
                    sPushClient = new PushManager(context.getApplicationContext());
                }
            }
        }
        return sPushClient;
    }

    public void checkParam(String str) {
        if (str == null) {
            throw new RuntimeException("PushManager String param should not be ".concat(String.valueOf(str)));
        }
    }

    public void delLocalTags(ArrayList<String> arrayList) {
        checkParam((List<String>) arrayList);
        LocalAliasTagsManager.getInstance(p.a().h()).delLocalTags(arrayList);
    }

    public void setLocalAlias(String str) {
        checkParam(str);
        LocalAliasTagsManager.getInstance(p.a().h()).setLocalAlias(str);
    }

    public void setLocalTags(ArrayList<String> arrayList) {
        checkParam((List<String>) arrayList);
        LocalAliasTagsManager.getInstance(p.a().h()).setLocalTags(arrayList);
    }

    public void checkParam(List<String> list) {
        boolean z;
        if (list == null || list.size() <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            for (String str : list) {
                if (str == null) {
                    z = false;
                }
            }
        }
        if (!z) {
            throw new IllegalArgumentException("PushManager param should not be ".concat(String.valueOf(list)));
        }
    }

    public void delTopic(ArrayList<String> arrayList) {
        checkParam((List<String>) arrayList);
        p.a().b(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, arrayList);
    }

    public void setTopic(ArrayList<String> arrayList) {
        checkParam((List<String>) arrayList);
        p.a().a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, arrayList);
    }

    public void bindAlias(String str, IPushActionListener iPushActionListener) {
        checkParam(str);
        p.a().a(str, iPushActionListener);
    }

    public void delTopic(String str, ArrayList<String> arrayList) {
        checkParam((List<String>) arrayList);
        p.a().b(str, arrayList);
    }

    public void setTopic(String str, ArrayList<String> arrayList) {
        checkParam((List<String>) arrayList);
        p.a().a(str, arrayList);
    }

    public void unBindAlias(String str, IPushActionListener iPushActionListener) {
        checkParam(str);
        p.a().b(str, iPushActionListener);
    }

    public void delTopic(String str, String str2) {
        checkParam(str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        p.a().b(str, arrayList);
    }

    public void setTopic(String str, String str2) {
        checkParam(str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        p.a().a(str, arrayList);
    }
}

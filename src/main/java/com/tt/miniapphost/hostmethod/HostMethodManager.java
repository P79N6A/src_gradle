package com.tt.miniapphost.hostmethod;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.process.annotation.MiniAppProcess;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@MiniAppProcess
public class HostMethodManager {
    private Map<String, IHostMethod> mRegisterMethod;

    public interface ResponseCallBack {
        @MiniAppProcess
        void callResponse(String str);
    }

    static class SingletonHolder {
        public static final HostMethodManager INSTANCE = new HostMethodManager();

        private SingletonHolder() {
        }
    }

    public static HostMethodManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private HostMethodManager() {
        this.mRegisterMethod = new HashMap();
    }

    @MiniAppProcess
    public void unregisterAllHostMethod() {
        if (this.mRegisterMethod != null) {
            this.mRegisterMethod.clear();
        }
    }

    @MiniAppProcess
    public void registerHostMethod(String str, IHostMethod iHostMethod) {
        if (!TextUtils.isEmpty(str) && iHostMethod != null) {
            this.mRegisterMethod.put(str, iHostMethod);
        }
    }

    @MiniAppProcess
    public boolean shouldHandleActivityResult(String str, JSONObject jSONObject) {
        try {
            IHostMethod iHostMethod = this.mRegisterMethod.get(str);
            if (iHostMethod != null) {
                return iHostMethod.shouldHandleActivityResult(jSONObject);
            }
        } catch (Exception e2) {
            AppBrandLogger.stacktrace(5, "HostMethodManager", e2.getStackTrace());
        }
        return false;
    }

    @MiniAppProcess
    public void unregisterHostMethod(String str, IHostMethod iHostMethod) {
        if (!TextUtils.isEmpty(str) && iHostMethod != null && this.mRegisterMethod.containsKey(str)) {
            this.mRegisterMethod.remove(str);
        }
    }

    @MiniAppProcess
    public String invokeJavaMethodSync(Activity activity, String str, JSONObject jSONObject) {
        try {
            IHostMethod iHostMethod = this.mRegisterMethod.get(str);
            if (iHostMethod != null) {
                return iHostMethod.callSync(activity, jSONObject);
            }
        } catch (Exception e2) {
            AppBrandLogger.stacktrace(5, "HostMethodManager", e2.getStackTrace());
        }
        return null;
    }

    @MiniAppProcess
    public void invokeJavaMethod(Activity activity, String str, JSONObject jSONObject, ResponseCallBack responseCallBack) {
        try {
            IHostMethod iHostMethod = this.mRegisterMethod.get(str);
            if (iHostMethod != null) {
                iHostMethod.call(activity, jSONObject, responseCallBack);
            }
        } catch (Exception e2) {
            AppBrandLogger.stacktrace(5, "HostMethodManager", e2.getStackTrace());
        }
    }

    @MiniAppProcess
    public boolean invokeOnActivityResult(String str, int i, int i2, Intent intent) {
        try {
            IHostMethod iHostMethod = this.mRegisterMethod.get(str);
            if (iHostMethod != null) {
                return iHostMethod.onActivityResult(i, i2, intent);
            }
        } catch (Exception e2) {
            AppBrandLogger.stacktrace(5, "HostMethodManager", e2.getStackTrace());
        }
        return false;
    }
}

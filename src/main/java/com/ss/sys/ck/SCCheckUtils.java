package com.ss.sys.ck;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import com.ss.a.a.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.sys.ck.a;
import com.ss.sys.ck.b;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public class SCCheckUtils {
    private static volatile SCCheckUtils sCkInstance;
    public Activity activity;
    protected int appID;
    protected String appName = "";
    protected int challenge_code;
    protected String channel = "";
    public Context ctx;
    protected String deviceID = "";
    private e dlg;
    protected String iid = "";
    protected String language = "";
    private SCCheckListener listener;
    private HashMap<String, String> maps;
    private float percent;
    protected String session = "";
    private String url;
    protected int versionCode;

    private SCCheckUtils(Context context, String str, int i, String str2, String str3, String str4, String str5) {
        this.ctx = context.getApplicationContext();
        this.maps = new HashMap<>();
        RegisterJSBridge();
        try {
            updateHttpParams(str, i, str2, str3, str4, str5);
            this.versionCode = this.ctx.getPackageManager().getPackageInfo(this.ctx.getPackageName(), 0).versionCode;
        } catch (Exception unused) {
        }
    }

    public static void closeDialog(WebView webView, final JSONObject jSONObject, d dVar) {
        try {
            getInstance().activity.runOnUiThread(new Runnable() {
                /* JADX WARNING: Removed duplicated region for block: B:12:0x001f A[Catch:{ Throwable -> 0x0027 }] */
                /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r3 = this;
                        com.ss.sys.ck.SCCheckUtils r0 = com.ss.sys.ck.SCCheckUtils.getInstance()     // Catch:{ Throwable -> 0x0027 }
                        r0.dlgDismiss()     // Catch:{ Throwable -> 0x0027 }
                        r0 = 0
                        org.json.JSONObject r1 = r1     // Catch:{ Exception -> 0x0014 }
                        java.lang.String r2 = "result"
                        int r1 = r1.getInt(r2)     // Catch:{ Exception -> 0x0014 }
                        if (r1 != 0) goto L_0x0014
                        r1 = 1
                        goto L_0x0015
                    L_0x0014:
                        r1 = 0
                    L_0x0015:
                        com.ss.sys.ck.SCCheckUtils r2 = com.ss.sys.ck.SCCheckUtils.getInstance()     // Catch:{ Throwable -> 0x0027 }
                        com.ss.sys.ck.SCCheckListener r2 = r2.getListener()     // Catch:{ Throwable -> 0x0027 }
                        if (r2 == 0) goto L_0x0027
                        r2.dialogOnClose(r0)     // Catch:{ Throwable -> 0x0027 }
                        java.lang.String r0 = ""
                        r2.dialogOnResult(r1, r0)     // Catch:{ Throwable -> 0x0027 }
                    L_0x0027:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.sys.ck.SCCheckUtils.AnonymousClass4.run():void");
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static SCCheckUtils getInstance() {
        return sCkInstance;
    }

    public static SCCheckUtils getInstance(Context context, String str, int i, String str2, String str3, String str4, String str5) {
        synchronized (SCCheckUtils.class) {
            if (sCkInstance == null) {
                a.b(i);
                SCCheckUtils sCCheckUtils = new SCCheckUtils(context, str, i, str2, str3, str4, str5);
                sCkInstance = sCCheckUtils;
                b.a();
                b.c();
            }
        }
        return sCkInstance;
    }

    public static SCCheckUtils getInstance(Context context, String str, int i, String str2, String str3, String str4, String str5, int i2) {
        synchronized (SCCheckUtils.class) {
            if (sCkInstance == null) {
                a.a(i2);
                a.b(i);
                SCCheckUtils sCCheckUtils = new SCCheckUtils(context, str, i, str2, str3, str4, str5);
                sCkInstance = sCCheckUtils;
                b.a();
                b.c();
            }
        }
        return sCkInstance;
    }

    /* access modifiers changed from: protected */
    public void dlgDismiss() {
        if (this.dlg != null) {
            this.dlg.dismiss();
            this.dlg = null;
        }
    }

    public String getAid() {
        try {
            return getInstance().appID;
        } catch (Throwable unused) {
            return "";
        }
    }

    public String getChannel() {
        try {
            return getInstance().channel;
        } catch (Throwable unused) {
            return "";
        }
    }

    public String getDid() {
        try {
            return getInstance().deviceID;
        } catch (Throwable unused) {
            return "";
        }
    }

    public String getIid() {
        try {
            return getInstance().iid;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* access modifiers changed from: protected */
    public SCCheckListener getListener() {
        return this.listener;
    }

    public String getSession() {
        try {
            return getInstance().session;
        } catch (Throwable unused) {
            return "";
        }
    }

    public String getUid() {
        return "";
    }

    /* access modifiers changed from: protected */
    public void netWorkError() {
        try {
            if (this.activity != null) {
                this.activity.runOnUiThread(new Runnable() {
                    public final void run() {
                        String str;
                        String str2;
                        String str3;
                        try {
                            if (!SCCheckUtils.this.activity.isFinishing()) {
                                try {
                                    str = SCCheckUtils.this.ctx.getResources().getString(C0906R.string.op);
                                } catch (Throwable unused) {
                                    str = "NETWORK ERROR, TRY LATTER";
                                }
                                try {
                                    str2 = SCCheckUtils.this.ctx.getResources().getString(C0906R.string.oo);
                                } catch (Throwable unused2) {
                                    str2 = "CONTINUE";
                                }
                                try {
                                    str3 = SCCheckUtils.this.ctx.getResources().getString(C0906R.string.on);
                                } catch (Throwable unused3) {
                                    str3 = "CONTINUE";
                                }
                                final a aVar = new a(SCCheckUtils.getInstance().activity, str, str2, str3);
                                aVar.f78532a = new a.C0838a() {
                                    public final void a() {
                                        SCCheckUtils.getInstance().dlgDismiss();
                                    }

                                    public final void b() {
                                        SCCheckUtils.getInstance().reloadUrl();
                                    }
                                };
                                aVar.setOnKeyListener(new DialogInterface.OnKeyListener() {
                                    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                                        if (i != 4 || keyEvent.getRepeatCount() != 0) {
                                            return false;
                                        }
                                        aVar.dismiss();
                                        SCCheckUtils.this.dlgDismiss();
                                        return true;
                                    }
                                });
                                aVar.show();
                            }
                        } catch (Throwable unused4) {
                        }
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void reloadUrl() {
        String str = this.url + "&challenge_code=" + this.challenge_code;
        if (this.dlg != null && this.dlg.f78578a != null) {
            this.dlg.f78578a.loadUrl(str);
        }
    }

    public void setDialogTouch(boolean z) {
        if (this.dlg != null) {
            this.dlg.setCanceledOnTouchOutside(z);
        }
    }

    public boolean updateHttpParams(String str, int i, String str2, String str3, String str4, String str5) {
        this.language = str;
        if (str == null || TextUtils.isEmpty(str)) {
            this.language = Locale.getDefault().getLanguage();
            this.language = this.language == null ? "zh-cn" : this.language;
            if (this.language.equalsIgnoreCase("zh")) {
                try {
                    this.language = Locale.getDefault().getCountry().equalsIgnoreCase("tw") ? "zh-tw" : "zh-cn";
                } catch (Throwable unused) {
                    this.language = "zh-cn";
                }
            }
        }
        this.appID = i;
        this.iid = str3;
        if (str2 != null && !TextUtils.isEmpty(str2)) {
            this.appName = str2;
        }
        if (str4 != null && !TextUtils.isEmpty(str4)) {
            this.deviceID = str4;
        }
        if (str5 != null && !TextUtils.isEmpty(str5)) {
            this.channel = str5;
        }
        this.url = b.f78566b + "?aid=" + this.appID + "&lang=" + this.language + "&app_name=" + this.appName + "&iid=" + this.iid + "&vc=" + this.versionCode + "&did=" + this.deviceID + "&ch=" + this.channel + "&os=0";
        return true;
    }

    public void popupCheckCode(Activity activity2, String str, int i, SCCheckListener sCCheckListener) {
        this.activity = activity2;
        this.listener = sCCheckListener;
        this.challenge_code = i;
        if ((this.dlg == null || !this.dlg.isShowing()) && !activity2.isFinishing()) {
            dlgDismiss();
            View inflate = activity2.getLayoutInflater().inflate(C0906R.layout.acx, null);
            this.dlg = new e(activity2, inflate, this.url + "&challenge_code=" + i, str);
            this.dlg.f78579b = b.f78568d.containsKey(Integer.valueOf(i)) ? b.f78568d.get(Integer.valueOf(i)) : new b.a(1005, 1.1533333f, 200);
            this.dlg.show();
            this.dlg.setOnCancelListener(new DialogInterface.OnCancelListener() {
                public final void onCancel(DialogInterface dialogInterface) {
                    SCCheckUtils.this.dlgDismiss();
                    SCCheckListener listener = SCCheckUtils.this.getListener();
                    if (listener != null) {
                        listener.dialogOnClose(1);
                        listener.dialogOnResult(false, "");
                    }
                }
            });
            this.dlg.setOnKeyListener(new DialogInterface.OnKeyListener() {
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    if (i != 4 || keyEvent.getRepeatCount() != 0) {
                        return false;
                    }
                    SCCheckUtils.this.dlgDismiss();
                    SCCheckListener listener = SCCheckUtils.this.getListener();
                    if (listener != null) {
                        listener.dialogOnClose(2);
                        listener.dialogOnResult(false, "");
                    }
                    return true;
                }
            });
        }
    }

    private void RegisterJSBridge() {
        Class<SCCheckUtils> cls = SCCheckUtils.class;
        if (!c.f78574a.containsKey("TTCK")) {
            try {
                Map<String, HashMap<String, Method>> map = c.f78574a;
                HashMap hashMap = new HashMap();
                for (Method method : cls.getDeclaredMethods()) {
                    if (method.getModifiers() == 9) {
                        String name = method.getName();
                        if (name != null) {
                            Class<d>[] parameterTypes = method.getParameterTypes();
                            if (parameterTypes != null && parameterTypes.length == 3 && parameterTypes[0] == WebView.class && parameterTypes[1] == JSONObject.class && parameterTypes[2] == d.class) {
                                hashMap.put(name, method);
                            }
                        }
                    }
                }
                map.put("TTCK", hashMap);
            } catch (Exception unused) {
            }
        }
    }
}

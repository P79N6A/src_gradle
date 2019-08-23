package com.ss.android.ugc.aweme.miniapp.pay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.a.c;
import com.ss.android.ugc.aweme.miniapp.q;
import com.ss.android.ugc.aweme.miniapp_api.a.e;
import com.ss.android.ugc.aweme.miniapp_api.b.b;
import com.ss.android.ugc.aweme.miniapp_api.model.l;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.IDCreator;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.helper.AsyncIpcHandler;
import com.tt.miniapphost.util.ProcessUtil;
import org.greenrobot.eventbus.Subscribe;
import org.json.JSONException;
import org.json.JSONObject;

public class OnePixelPayActivity extends Activity implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3594a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f3595b = true;

    /* renamed from: c  reason: collision with root package name */
    private AsyncIpcHandler f3596c;

    /* renamed from: d  reason: collision with root package name */
    private String f3597d;

    /* renamed from: e  reason: collision with root package name */
    private String f3598e;

    /* renamed from: f  reason: collision with root package name */
    private String f3599f;
    private int g;
    private boolean h;
    private int i;

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3594a, false, 59503, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3594a, false, 59503, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.pay.OnePixelPayActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f3594a, false, 59502, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3594a, false, 59502, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        overridePendingTransition(0, 0);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f3594a, false, 59500, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3594a, false, 59500, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (AppBrandLogger.debug()) {
            AppBrandLogger.d("OnePixelPayActivity", "onPause");
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3594a, false, 59501, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3594a, false, 59501, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (AppBrandLogger.debug()) {
            AppBrandLogger.d("OnePixelPayActivity", "onDestroy");
        }
        org.greenrobot.eventbus.c.a().c(this);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3594a, false, 59496, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3594a, false, 59496, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.pay.OnePixelPayActivity", "onResume", true);
        super.onResume();
        if (AppBrandLogger.debug()) {
            AppBrandLogger.d("OnePixelPayActivity", "onResume ");
        }
        if (this.f3595b) {
            this.f3595b = false;
        } else {
            if (this.i > 0 && this.h) {
                AppBrandLogger.d("OnePixelPayActivity", "mWxMiniProgramCallbackId " + this.i);
                ProcessUtil.jumpLittleApp(this, this.f3599f);
                a(this.f3596c, a("fail", "cancel"));
                this.i = 0;
            }
            if (!isFinishing()) {
                finish();
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.pay.OnePixelPayActivity", "onResume", false);
    }

    @Subscribe
    public void onWXMiniProgramResp(l lVar) {
        String str;
        if (PatchProxy.isSupport(new Object[]{lVar}, this, f3594a, false, 59497, new Class[]{l.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lVar}, this, f3594a, false, 59497, new Class[]{l.class}, Void.TYPE);
            return;
        }
        if (this.i > 0 && lVar != null && this.h) {
            AppBrandLogger.d("OnePixelPayActivity", "mWxMiniProgramCallbackId " + this.i);
            ProcessUtil.jumpLittleApp(this, this.f3599f);
            String str2 = null;
            if (lVar.f56039b != null) {
                try {
                    str = new JSONObject(lVar.f56039b).optString("errMsg");
                } catch (JSONException e2) {
                    AppBrandLogger.e("OnePixelPayActivity", "onWXMiniProgramResp", e2);
                    str = "";
                }
                boolean z = !TextUtils.isEmpty(str);
                if (!z || !str.startsWith("requestPayment:ok")) {
                    if (z) {
                        str2 = str.replace("requestPayment:fail", "").trim();
                    }
                    a(this.f3596c, a("fail", str2));
                } else {
                    a(this.f3596c, a("ok", (String) null));
                }
            } else {
                a(this.f3596c, a("fail", (String) null));
            }
            this.i = 0;
            if (!isFinishing()) {
                finish();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        b bVar;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3594a, false, 59495, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3594a, false, 59495, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.pay.OnePixelPayActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        Window window = getWindow();
        window.setGravity(8388659);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.x = 0;
        attributes.y = 0;
        attributes.height = 1;
        attributes.width = 1;
        window.setAttributes(attributes);
        this.i = IDCreator.create();
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("pay_str");
        this.f3596c = ProcessUtil.generateAsyncIpcHandlerFromIntent(intent);
        this.h = intent.getBooleanExtra("is_wx_mini_pay", false);
        this.f3597d = intent.getStringExtra("user_name");
        this.g = intent.getIntExtra("mini_program_type", 0);
        this.f3599f = intent.getStringExtra("app_id");
        this.f3598e = intent.getStringExtra("path");
        org.greenrobot.eventbus.c.a().a((Object) this);
        e eVar = q.a().j;
        if (this.h) {
            b.a aVar = new b.a();
            aVar.f56000c = this.f3598e;
            aVar.f55999b = this.f3597d;
            aVar.f56002e = this.g;
            aVar.f56003f = true;
            if (PatchProxy.isSupport(new Object[0], aVar, b.a.f55998a, false, 59647, new Class[0], b.class)) {
                bVar = (b) PatchProxy.accessDispatch(new Object[0], aVar, b.a.f55998a, false, 59647, new Class[0], b.class);
            } else {
                b bVar2 = new b();
                bVar2.f55995c = aVar.f56001d;
                bVar2.f55994b = aVar.f56000c;
                bVar2.f55997e = aVar.f56003f;
                bVar2.f55996d = aVar.f56002e;
                bVar2.f55993a = aVar.f55999b;
                bVar = bVar2;
            }
            eVar.a(this, bVar);
        } else if (!TextUtils.isEmpty(stringExtra)) {
            try {
                eVar.a(this, new JSONObject(stringExtra), this);
            } catch (Throwable th) {
                AppBrandLogger.e("OnePixelPayActivity", "pay exception", th);
                a(this.f3596c, d.a("fail"));
                if (!isFinishing()) {
                    finish();
                }
            }
        } else if (!isFinishing()) {
            finish();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.pay.OnePixelPayActivity", "onCreate", false);
    }

    private static void a(AsyncIpcHandler asyncIpcHandler, String str) {
        AsyncIpcHandler asyncIpcHandler2 = asyncIpcHandler;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{asyncIpcHandler2, str2}, null, f3594a, true, 59498, new Class[]{AsyncIpcHandler.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{asyncIpcHandler2, str2}, null, f3594a, true, 59498, new Class[]{AsyncIpcHandler.class, String.class}, Void.TYPE);
            return;
        }
        asyncIpcHandler2.callback(CrossProcessDataEntity.Builder.create().put("payResult", str2).build());
    }

    private String a(@NonNull String str, @Nullable String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f3594a, false, 59499, new Class[]{String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f3594a, false, 59499, new Class[]{String.class, String.class}, String.class);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            String str5 = "requestWXPayment:" + str3;
            if (!TextUtils.isEmpty(str2)) {
                str5 = str5 + " " + str4;
            }
            jSONObject.put("errMsg", str5);
            return jSONObject.toString();
        } catch (Exception e2) {
            AppBrandLogger.e("OnePixelPayActivity", "makeWXPayMsg", e2);
            return "";
        }
    }

    public final void a(int i2, int i3, int i4) {
        int i5 = i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f3594a, false, 59494, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f3594a, false, 59494, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (AppBrandLogger.debug()) {
            StringBuilder sb = new StringBuilder("onPayResult code = ");
            int i6 = i2;
            sb.append(i2);
            sb.append(" status = ");
            sb.append(i5);
            AppBrandLogger.d("OnePixelPayActivity", sb.toString());
        }
        if (i3 == 0) {
            if (i5 == -1) {
                AsyncIpcHandler asyncIpcHandler = this.f3596c;
                a(asyncIpcHandler, d.a("fail " + i5));
            } else if (i5 == 9000) {
                a(this.f3596c, d.a("ok"));
            } else if (i5 == 6001) {
                a(this.f3596c, d.a("cancel"));
            } else {
                AsyncIpcHandler asyncIpcHandler2 = this.f3596c;
                a(asyncIpcHandler2, d.a("fail " + i5));
            }
        }
        if (!isFinishing()) {
            finish();
        }
    }
}

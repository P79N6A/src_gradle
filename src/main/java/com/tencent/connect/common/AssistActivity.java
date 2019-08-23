package com.tencent.connect.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tencent.open.a.f;
import com.tencent.open.d.h;
import com.tencent.tauth.b;
import com.tencent.tauth.d;
import org.json.JSONObject;

public class AssistActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    protected boolean f79625a;

    /* renamed from: b  reason: collision with root package name */
    protected Handler f79626b = new Handler() {
        public final void handleMessage(Message message) {
            if (message.what == 0 && !AssistActivity.this.isFinishing()) {
                f.d("openSDK_LOG.AssistActivity", "-->finish by timeout");
                AssistActivity.this.finish();
            }
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private boolean f79627c;

    /* renamed from: d  reason: collision with root package name */
    private String f79628d;

    /* access modifiers changed from: protected */
    public void onDestroy() {
        f.b("openSDK_LOG.AssistActivity", "-->onDestroy");
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        f.b("openSDK_LOG.AssistActivity", "-->onStart");
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        f.b("openSDK_LOG.AssistActivity", "-->onStop");
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        f.b("openSDK_LOG.AssistActivity", "-->onPause");
        this.f79626b.removeMessages(0);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        f.b("openSDK_LOG.AssistActivity", "-->onResume");
        super.onResume();
        Intent intent = getIntent();
        if (!intent.getBooleanExtra("is_login", false)) {
            if (!intent.getBooleanExtra("is_qq_mobile_share", false) && this.f79627c && !isFinishing()) {
                finish();
            }
            if (this.f79625a) {
                this.f79626b.sendMessage(this.f79626b.obtainMessage(0));
                return;
            }
            this.f79625a = true;
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        f.b("openSDK_LOG.AssistActivity", "--onSaveInstanceState--");
        bundle.putBoolean("RESTART_FLAG", true);
        bundle.putBoolean("RESUME_FLAG", this.f79625a);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        f.c("openSDK_LOG.AssistActivity", "--onNewIntent");
        super.onNewIntent(intent);
        intent.putExtra("key_action", "action_share");
        setResult(-1, intent);
        if (!isFinishing()) {
            f.c("openSDK_LOG.AssistActivity", "--onNewIntent--activity not finished, finish now");
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int i;
        String str;
        requestWindowFeature(1);
        super.onCreate(bundle);
        setRequestedOrientation(3);
        f.b("openSDK_LOG.AssistActivity", "--onCreate--");
        if (getIntent() == null) {
            f.e("openSDK_LOG.AssistActivity", "-->onCreate--getIntent() returns null");
            finish();
        }
        Intent intent = (Intent) getIntent().getParcelableExtra("openSDK_LOG.AssistActivity.ExtraIntent");
        if (intent == null) {
            i = 0;
        } else {
            i = intent.getIntExtra("key_request_code", 0);
        }
        if (intent == null) {
            str = "";
        } else {
            str = intent.getStringExtra("appid");
        }
        this.f79628d = str;
        Bundle bundleExtra = getIntent().getBundleExtra("h5_share_data");
        if (bundle != null) {
            this.f79627c = bundle.getBoolean("RESTART_FLAG");
            this.f79625a = bundle.getBoolean("RESUME_FLAG", false);
        }
        if (this.f79627c) {
            f.b("openSDK_LOG.AssistActivity", "is restart");
        } else if (bundleExtra != null) {
            f.d("openSDK_LOG.AssistActivity", "--onCreate--h5 bundle not null, will open browser");
            String string = bundleExtra.getString("viaShareType");
            String string2 = bundleExtra.getString("callbackAction");
            String string3 = bundleExtra.getString(PushConstants.WEB_URL);
            String string4 = bundleExtra.getString("openId");
            String string5 = bundleExtra.getString("appId");
            String str2 = "";
            String str3 = "";
            if ("shareToQQ".equals(string2)) {
                str2 = "ANDROIDQQ.SHARETOQQ.XX";
                str3 = "10";
            } else if ("shareToQzone".equals(string2)) {
                str2 = "ANDROIDQQ.SHARETOQZ.XX";
                str3 = "11";
            }
            String str4 = str2;
            String str5 = str3;
            if (!h.a((Context) this, string3)) {
                b a2 = b.a().a(string2);
                if (a2 != null) {
                    a2.a(new d(-6, "打开浏览器失败!", null));
                }
                com.tencent.open.b.d.a();
                com.tencent.open.b.d.a(string4, string5, str4, str5, "3", PushConstants.PUSH_TYPE_THROUGH_MESSAGE, string, PushConstants.PUSH_TYPE_NOTIFY, PushConstants.PUSH_TYPE_UPLOAD_LOG, PushConstants.PUSH_TYPE_NOTIFY);
                finish();
            } else {
                com.tencent.open.b.d.a();
                com.tencent.open.b.d.a(string4, string5, str4, str5, "3", PushConstants.PUSH_TYPE_NOTIFY, string, PushConstants.PUSH_TYPE_NOTIFY, PushConstants.PUSH_TYPE_UPLOAD_LOG, PushConstants.PUSH_TYPE_NOTIFY);
            }
            getIntent().removeExtra("shareH5");
        } else if (intent != null) {
            f.c("openSDK_LOG.AssistActivity", "--onCreate--activityIntent not null, will start activity, reqcode = " + i);
            startActivityForResult(intent, i);
        } else {
            f.e("openSDK_LOG.AssistActivity", "--onCreate--activityIntent is null");
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        StringBuilder sb = new StringBuilder("--onActivityResult--requestCode: ");
        sb.append(i);
        sb.append(" | resultCode: ");
        sb.append(i2);
        sb.append("data = null ? ");
        if (intent == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        f.c("openSDK_LOG.AssistActivity", sb.toString());
        super.onActivityResult(i, i2, intent);
        if (i != 0) {
            if (intent != null) {
                intent.putExtra("key_action", "action_login");
            }
            if (intent == null) {
                f.d("openSDK_LOG.AssistActivity", "--setResultData--intent is null, setResult ACTIVITY_CANCEL");
                setResult(0);
                if (i == 11101) {
                    com.tencent.open.b.d.a();
                    com.tencent.open.b.d.a("", this.f79628d, PushConstants.PUSH_TYPE_UPLOAD_LOG, PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "7", PushConstants.PUSH_TYPE_UPLOAD_LOG);
                }
            } else {
                try {
                    String stringExtra = intent.getStringExtra("key_response");
                    f.b("openSDK_LOG.AssistActivity", "--setResultDataForLogin-- " + stringExtra);
                    if (!TextUtils.isEmpty(stringExtra)) {
                        JSONObject jSONObject = new JSONObject(stringExtra);
                        String optString = jSONObject.optString("openid");
                        String optString2 = jSONObject.optString("access_token");
                        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
                            f.d("openSDK_LOG.AssistActivity", "--setResultData--openid or token is empty, setResult ACTIVITY_CANCEL");
                            setResult(0, intent);
                            com.tencent.open.b.d.a();
                            com.tencent.open.b.d.a("", this.f79628d, PushConstants.PUSH_TYPE_UPLOAD_LOG, PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "7", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                        } else {
                            f.c("openSDK_LOG.AssistActivity", "--setResultData--openid and token not empty, setResult ACTIVITY_OK");
                            setResult(-1, intent);
                            com.tencent.open.b.d.a();
                            com.tencent.open.b.d.a(optString, this.f79628d, PushConstants.PUSH_TYPE_UPLOAD_LOG, PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "7", PushConstants.PUSH_TYPE_NOTIFY);
                        }
                    } else {
                        f.d("openSDK_LOG.AssistActivity", "--setResultData--response is empty, setResult ACTIVITY_OK");
                        setResult(-1, intent);
                    }
                } catch (Exception unused) {
                    f.e("openSDK_LOG.AssistActivity", "--setResultData--parse response failed");
                }
            }
            finish();
        }
    }
}

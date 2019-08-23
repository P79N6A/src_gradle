package com.tencent.mm.opensdk.diffdev.a;

import android.os.AsyncTask;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import com.tencent.mm.opensdk.utils.Log;
import org.json.JSONObject;

public final class f extends AsyncTask<Void, Void, a> {
    private OAuthListener ah;
    private String ak;
    private int aq;
    private String url;

    static class a {
        public OAuthErrCode aj;
        public String ar;
        public int as;

        a() {
        }

        public static a d(byte[] bArr) {
            OAuthErrCode oAuthErrCode;
            String str;
            String str2;
            Object[] objArr;
            OAuthErrCode oAuthErrCode2;
            a aVar = new a();
            if (bArr == null || bArr.length == 0) {
                Log.e("MicroMsg.SDK.NoopingResult", "parse fail, buf is null");
                oAuthErrCode = OAuthErrCode.WechatAuth_Err_NetworkErr;
            } else {
                try {
                } catch (Exception e2) {
                    str = "MicroMsg.SDK.NoopingResult";
                    str2 = "parse fail, build String fail, ex = %s";
                    objArr = new Object[]{e2.getMessage()};
                    Log.e(str, String.format(str2, objArr));
                    oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                    aVar.aj = oAuthErrCode;
                    return aVar;
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr, "utf-8"));
                    aVar.as = jSONObject.getInt("wx_errcode");
                    Log.d("MicroMsg.SDK.NoopingResult", String.format("nooping uuidStatusCode = %d", new Object[]{Integer.valueOf(aVar.as)}));
                    int i = aVar.as;
                    if (i == 408) {
                        oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_OK;
                    } else if (i != 500) {
                        switch (i) {
                            case 402:
                                oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_Timeout;
                                break;
                            case 403:
                                oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_Cancel;
                                break;
                            case 404:
                                oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_OK;
                                break;
                            case 405:
                                aVar.aj = OAuthErrCode.WechatAuth_Err_OK;
                                aVar.ar = jSONObject.getString("wx_code");
                                break;
                            default:
                                oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_NormalErr;
                                break;
                        }
                    } else {
                        oAuthErrCode2 = OAuthErrCode.WechatAuth_Err_NormalErr;
                    }
                    aVar.aj = oAuthErrCode2;
                    return aVar;
                } catch (Exception e3) {
                    str = "MicroMsg.SDK.NoopingResult";
                    str2 = "parse json fail, ex = %s";
                    objArr = new Object[]{e3.getMessage()};
                    Log.e(str, String.format(str2, objArr));
                    oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
                    aVar.aj = oAuthErrCode;
                    return aVar;
                }
            }
            aVar.aj = oAuthErrCode;
            return aVar;
        }
    }

    public f(String str, OAuthListener oAuthListener) {
        this.ak = str;
        this.ah = oAuthListener;
        this.url = String.format("https://long.open.weixin.qq.com/connect/l/qrconnect?f=json&uuid=%s", new Object[]{str});
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        a aVar;
        OAuthErrCode oAuthErrCode;
        String str;
        if (this.ak == null || this.ak.length() == 0) {
            Log.e("MicroMsg.SDK.NoopingTask", "run fail, uuid is null");
            aVar = new a();
            oAuthErrCode = OAuthErrCode.WechatAuth_Err_NormalErr;
        } else {
            while (!isCancelled()) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.url);
                if (this.aq == 0) {
                    str = "";
                } else {
                    str = "&last=" + this.aq;
                }
                sb.append(str);
                String sb2 = sb.toString();
                long currentTimeMillis = System.currentTimeMillis();
                byte[] b2 = e.b(sb2, 60000);
                long currentTimeMillis2 = System.currentTimeMillis();
                a d2 = a.d(b2);
                Log.d("MicroMsg.SDK.NoopingTask", String.format("nooping, url = %s, errCode = %s, uuidStatusCode = %d, time consumed = %d(ms)", new Object[]{sb2, d2.aj.toString(), Integer.valueOf(d2.as), Long.valueOf(currentTimeMillis2 - currentTimeMillis)}));
                if (d2.aj == OAuthErrCode.WechatAuth_Err_OK) {
                    this.aq = d2.as;
                    if (d2.as == g.UUID_SCANED.getCode()) {
                        this.ah.onQrcodeScanned();
                    } else if (d2.as != g.UUID_KEEP_CONNECT.getCode() && d2.as == g.UUID_CONFIRM.getCode()) {
                        if (d2.ar == null || d2.ar.length() == 0) {
                            Log.e("MicroMsg.SDK.NoopingTask", "nooping fail, confirm with an empty code!!!");
                            d2.aj = OAuthErrCode.WechatAuth_Err_NormalErr;
                        }
                        return d2;
                    }
                } else {
                    Log.e("MicroMsg.SDK.NoopingTask", String.format("nooping fail, errCode = %s, uuidStatusCode = %d", new Object[]{d2.aj.toString(), Integer.valueOf(d2.as)}));
                    return d2;
                }
            }
            Log.i("MicroMsg.SDK.NoopingTask", "IDiffDevOAuth.stopAuth / detach invoked");
            aVar = new a();
            oAuthErrCode = OAuthErrCode.WechatAuth_Err_Auth_Stopped;
        }
        aVar.aj = oAuthErrCode;
        return aVar;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        a aVar = (a) obj;
        this.ah.onAuthFinish(aVar.aj, aVar.ar);
    }
}

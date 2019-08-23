package com.alimama.tunion.trade.abtest;

import android.text.TextUtils;
import com.alimama.tunion.a.a;
import com.alimama.tunion.trade.TUnionTradeSDK;
import com.alimama.tunion.trade.base.ITUnionCookie;
import com.alimama.tunion.trade.base.ITUnionNetwork;
import com.alimama.tunion.trade.base.ITUnionNetworkMtop;
import com.alimama.tunion.trade.convert.TUnionJumpType;
import com.alimama.tunion.trade.net.ITUnionNetReqCallback;
import com.alimama.tunion.trade.net.TUnionNetworkRequest;
import com.alimama.tunion.utils.TULog;
import com.alimama.tunion.utils.TUnionPhoneInfoUtils;
import com.alimama.tunion.utils.TUnionUTUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import org.json.JSONObject;

public class TUnionABTestService {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public long f5196a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f5197b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5198c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5199d = true;

    public boolean isEnabled() {
        return this.f5198c;
    }

    public void startInitialFetch() {
        if (this.f5199d) {
            this.f5199d = false;
            b();
        }
    }

    private void b() {
        if (!this.f5197b && System.currentTimeMillis() - this.f5196a >= 600000) {
            a();
        }
    }

    private void a() {
        this.f5197b = true;
        ITUnionNetwork tUnionNetwork = TUnionTradeSDK.getInstance().getTUnionNetwork();
        TUnionNetworkRequest createABTestRequest = TUnionNetworkRequest.createABTestRequest(tUnionNetwork instanceof ITUnionNetworkMtop);
        if (tUnionNetwork != null) {
            TUnionUTUtils.Config.start();
            TULog.d("config is calling...", new Object[0]);
            tUnionNetwork.sendRequest(createABTestRequest, new ITUnionNetReqCallback() {
                public void onSuccess(int i, JSONObject jSONObject) {
                    boolean unused = TUnionABTestService.this.f5197b = false;
                    long unused2 = TUnionABTestService.this.f5196a = System.currentTimeMillis();
                    TULog.d("ABtest response: " + jSONObject.toString(), new Object[0]);
                    JSONObject optJSONObject = jSONObject.optJSONObject("abtest");
                    if (optJSONObject == null) {
                        optJSONObject = jSONObject.optJSONObject("config");
                    }
                    ITUnionCookie tUnionCookie = TUnionTradeSDK.getInstance().getTUnionCookie();
                    String aBTestCookies = TUnionABTestService.this.getABTestCookies(optJSONObject);
                    TULog.d("taobaodo cookies值 " + aBTestCookies, new Object[0]);
                    if (tUnionCookie != null && !TextUtils.isEmpty(aBTestCookies)) {
                        tUnionCookie.setCookie(".taobao.com", aBTestCookies);
                    }
                    if (optJSONObject != null) {
                        a.a().a("abtest", optJSONObject.toString());
                        a.a().a("jumpService", optJSONObject.optString("jumpService"));
                        a.a().a("loginService", optJSONObject.optString("loginService"));
                    }
                    a.a().a("config", jSONObject.toString());
                }

                public void onError(int i, String str, JSONObject jSONObject) {
                    TUnionUTUtils.Config.failed("ABTest request failed:" + str);
                    boolean unused = TUnionABTestService.this.f5197b = false;
                }
            });
        }
    }

    private String c() {
        StringBuilder sb = new StringBuilder();
        sb.append("abtest:nouse");
        sb.append(",mcid:");
        String mcid = TUnionPhoneInfoUtils.getInstance().getMcid();
        String cid = TUnionPhoneInfoUtils.getInstance().getCid();
        if (mcid == null) {
            mcid = "";
        }
        if (cid == null) {
            cid = "";
        }
        sb.append(mcid);
        sb.append(",cid:");
        sb.append(cid);
        return sb.toString();
    }

    public TUnionABTestValue isJumpServiceOn() {
        if (!this.f5198c) {
            return TUnionABTestValue.INVALID;
        }
        TUnionABTestService aBTestService = TUnionTradeSDK.getInstance().getABTestService();
        if (aBTestService != null) {
            return a(aBTestService.getABTestValue("jumpService"), TUnionABTestValue.INVALID);
        }
        return TUnionABTestValue.INVALID;
    }

    public TUnionABTestValue isSsoLoginServiceOn() {
        if (!this.f5198c) {
            return TUnionABTestValue.INVALID;
        }
        TUnionABTestService aBTestService = TUnionTradeSDK.getInstance().getABTestService();
        if (aBTestService != null) {
            return a(aBTestService.getABTestValue("loginService"), TUnionABTestValue.INVALID);
        }
        return TUnionABTestValue.INVALID;
    }

    public String getABTestValue(String str) {
        if (!this.f5198c) {
            return null;
        }
        String a2 = a.a().a(str);
        b();
        return a2;
    }

    public String getABTestCookies(JSONObject jSONObject) {
        String str = a(jSONObject).toString();
        try {
            str = URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
        return String.format("%s=%s", new Object[]{"sdk_param", str});
    }

    public TUnionJumpType getJumpType(TUnionJumpType tUnionJumpType) {
        TUnionABTestValue tUnionABTestValue = TUnionABTestValue.INVALID;
        String a2 = a.a().a("jumpService");
        if (!TextUtils.isEmpty(a2)) {
            tUnionABTestValue = a(a2, TUnionABTestValue.INVALID);
        }
        switch (tUnionABTestValue) {
            case YES:
                return TUnionJumpType.NATIVE;
            case NO:
                return TUnionJumpType.H5;
            default:
                return tUnionJumpType;
        }
    }

    private String a(JSONObject jSONObject) {
        StringBuilder sb = new StringBuilder();
        if (jSONObject == null) {
            return c();
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!TextUtils.isEmpty(next)) {
                String optString = jSONObject.optString(next);
                if (!TextUtils.isEmpty(optString)) {
                    sb.append(String.format("%s:%s,", new Object[]{next, optString}));
                }
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public void enable(boolean z) {
        this.f5198c = z;
        if (!this.f5198c) {
            ITUnionCookie tUnionCookie = TUnionTradeSDK.getInstance().getTUnionCookie();
            if (tUnionCookie != null) {
                tUnionCookie.setCookie(".taobao.com", c());
            }
            a.a().a("abtest", c());
            a.a().a("jumpService", "");
            a.a().a("loginService", "");
            return;
        }
        b();
    }

    private TUnionABTestValue a(String str, TUnionABTestValue tUnionABTestValue) {
        if (TextUtils.isEmpty(str)) {
            return tUnionABTestValue;
        }
        if (a(str, false)) {
            return TUnionABTestValue.YES;
        }
        return TUnionABTestValue.NO;
    }

    private boolean a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return z;
        }
        if ("true".equalsIgnoreCase(str) || "yes".equalsIgnoreCase(str)) {
            return true;
        }
        if (!"no".equalsIgnoreCase(str) && !"false".equalsIgnoreCase(str)) {
            return z;
        }
        return false;
    }
}

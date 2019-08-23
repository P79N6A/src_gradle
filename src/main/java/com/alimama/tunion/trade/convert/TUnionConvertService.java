package com.alimama.tunion.trade.convert;

import android.net.Uri;
import android.text.TextUtils;
import com.alimama.tunion.trade.TUnionTradeSDK;
import com.alimama.tunion.trade.abtest.TUnionABTestService;
import com.alimama.tunion.trade.base.ITUnionCookie;
import com.alimama.tunion.trade.base.ITUnionNetwork;
import com.alimama.tunion.trade.base.ITUnionNetworkMtop;
import com.alimama.tunion.trade.base.ITUnionWebView;
import com.alimama.tunion.trade.net.ITUnionNetReqCallback;
import com.alimama.tunion.trade.net.TUnionNetworkRequest;
import com.alimama.tunion.utils.TULog;
import com.alimama.tunion.utils.TUnionPhoneInfoUtils;
import com.alimama.tunion.utils.TUnionUTUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class TUnionConvertService {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f5206a = {"taobao.com", "tmall.com", "alitrip.com", "tmall.hk", "tmall.tw", "aliexpress.com", "1688.com", "alibaba.com"};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f5207b = {"^http[s]{0,1}:\\/\\/detail\\.tmall\\.com\\/item\\.htm", "^http[s]{0,1}:\\/\\/item\\.tmall\\.com\\/item\\.htm", "^http[s]{0,1}:\\/\\/item\\.taobao\\.com\\/item\\.htm", "^http[s]{0,1}:\\/\\/detail\\.taobao\\.com\\/item\\.htm", "^http[s]{0,1}:\\/\\/chaoshi\\.detail\\.tmall\\.com\\/item\\.htm", "^http[s]{0,1}:\\/\\/detail\\.tmall\\.hk\\/hk\\/item\\.htm", "^http[s]{0,1}:\\/\\/a\\.m\\.tmall\\.com\\/i\\d+\\.htm", "^http[s]{0,1}:\\/\\/detail\\.m\\.tmall\\.com\\/item\\.htm", "^http[s]{0,1}:\\/\\/a\\.m\\.taobao\\.com\\/i\\d+\\.htm", "^http[s]{0,1}:\\/\\/h5\\.(m|wapa)\\.taobao\\.com\\/awp\\/core\\/detail\\.htm", "^http[s]{0,1}:\\/\\/detail\\.m\\.tmall\\.hk\\/item\\.htm", "^http[s]{0,1}:\\/\\/store\\.tmall\\.com\\/shop\\/view_shop\\.htm", "^http[s]{0,1}:\\/\\/store\\.taobao\\.com\\/shop\\/view_shop\\.htm", "^http[s]{0,1}:\\/\\/shop\\.(m|wapa)\\.taobao\\.com\\/shop\\/shop_index", "^http[s]{0,1}:\\/\\/shop\\.(m|wapa)\\.tmall\\.com\\/shop\\/shop_index", "^http[s]{0,1}:\\/\\/miao\\.item\\.taobao\\.com", "^http[s]{0,1}:\\/\\/kezhan\\.taobao\\.com", "^http[s]{0,1}:\\/\\/trip\\.taobao\\.com", "^http[s]{0,1}:\\/\\/alitrip\\.com", "^http[s]{0,1}:\\/\\/ju\\.taobao\\.com", "^http[s]{0,1}:\\/\\/juhuasuan\\.com", "^http[s]{0,1}:\\/\\/aliyun\\.com", "^http[s]{0,1}:\\/\\/triph5\\.m\\.taobao\\.com", "^http[s]{0,1}:\\/\\/jp\\.m\\.taobao\\.com", "^http[s]{0,1}:\\/\\/jipiao\\.m\\.taobao\\.com", "^http[s]{0,1}:\\/\\/h5\\.m\\.taobao\\.com\\/trip", "^http[s]{0,1}:\\/\\/jhs\\.m\\.taobao\\.com"};

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0071 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a() {
        /*
            r9 = this;
            com.alimama.tunion.trade.TUnionTradeSDK r0 = com.alimama.tunion.trade.TUnionTradeSDK.getInstance()
            com.alimama.tunion.trade.abtest.TUnionABTestService r0 = r0.getABTestService()
            r1 = 0
            if (r0 == 0) goto L_0x0072
            java.lang.String r2 = "abtest"
            java.lang.String r2 = r0.getABTestValue(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            r4 = 1
            r5 = 2
            r6 = 0
            if (r3 != 0) goto L_0x004c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r7 = "abtest str(append abtest params) is "
            r3.<init>(r7)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r7 = new java.lang.Object[r6]
            com.alimama.tunion.utils.TULog.d(r3, r7)
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x004c }
            r3.<init>(r2)     // Catch:{ Exception -> 0x004c }
            java.lang.String r2 = ",%s:%s"
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x004a }
            java.lang.String r8 = "cid"
            r7[r6] = r8     // Catch:{ Exception -> 0x004a }
            com.alimama.tunion.utils.TUnionPhoneInfoUtils r8 = com.alimama.tunion.utils.TUnionPhoneInfoUtils.getInstance()     // Catch:{ Exception -> 0x004a }
            java.lang.String r8 = r8.getCid()     // Catch:{ Exception -> 0x004a }
            r7[r4] = r8     // Catch:{ Exception -> 0x004a }
            java.lang.String r2 = java.lang.String.format(r2, r7)     // Catch:{ Exception -> 0x004a }
            r1 = r2
            goto L_0x004d
        L_0x004a:
            goto L_0x004d
        L_0x004c:
            r3 = r1
        L_0x004d:
            java.lang.String r0 = r0.getABTestCookies(r3)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x005e
            java.lang.String r2 = "UTF-8"
            java.lang.String r2 = java.net.URLEncoder.encode(r1, r2)     // Catch:{ UnsupportedEncodingException -> 0x005e }
            r1 = r2
        L_0x005e:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0071
            java.lang.String r2 = "%s%s"
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r3[r6] = r0
            r3[r4] = r1
            java.lang.String r0 = java.lang.String.format(r2, r3)
            return r0
        L_0x0071:
            return r0
        L_0x0072:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alimama.tunion.trade.convert.TUnionConvertService.a():java.lang.String");
    }

    private boolean b(String str) {
        return a(str, f5206a);
    }

    private boolean c(String str) {
        return a(str, f5207b);
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("s.click.taobao.com");
    }

    private boolean a(String str, ITUnionWebView iTUnionWebView) {
        String str2;
        if (iTUnionWebView != null) {
            str2 = iTUnionWebView.getUrl();
        } else {
            str2 = null;
        }
        return a(str, str2);
    }

    private boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str) || a(str) || !c(str) || b(str2)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public String a(String str, TUnionJumpType tUnionJumpType) {
        if (!a(str) || tUnionJumpType != TUnionJumpType.NATIVE) {
            return str;
        }
        String a2 = a();
        String query = Uri.parse(str).getQuery();
        if (TextUtils.isEmpty(a2)) {
            return str;
        }
        String replace = a2.replace("sdk_param=", "");
        if (!TextUtils.isEmpty(query)) {
            return String.format("%s&%s=%s", new Object[]{str, "clk1", replace});
        }
        return String.format("%s?%s=%s", new Object[]{str, "clk1", replace});
    }

    private static boolean a(String str, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            try {
                boolean find = Pattern.compile(strArr[i]).matcher(str).find();
                if (find) {
                    return find;
                }
                i++;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void convert(final TUnionJumpType tUnionJumpType, ITUnionWebView iTUnionWebView, final String str, TUnionMediaParams tUnionMediaParams, final TUnionConvertCallback tUnionConvertCallback) {
        TUnionUTUtils.Convert.convert();
        TUnionPhoneInfoUtils.getInstance().initCid();
        ITUnionCookie tUnionCookie = TUnionTradeSDK.getInstance().getTUnionCookie();
        String a2 = a();
        if (tUnionCookie != null && !TextUtils.isEmpty(a2)) {
            tUnionCookie.setCookie(".taobao.com", a2);
        }
        if (TextUtils.isEmpty(str)) {
            TUnionUTUtils.Convert.failed("URL Empty");
            if (tUnionConvertCallback != null) {
                tUnionConvertCallback.onResult(new TUnionConvertResult(tUnionJumpType, str));
            }
            return;
        }
        if (tUnionMediaParams == null) {
            tUnionMediaParams = new TUnionMediaParams();
        }
        if (TextUtils.isEmpty(tUnionMediaParams.getAdzoneId())) {
            tUnionMediaParams.setAdzoneId(TUnionTradeSDK.getInstance().getAdzoneId());
        }
        TUnionABTestService aBTestService = TUnionTradeSDK.getInstance().getABTestService();
        if (aBTestService != null) {
            tUnionJumpType = aBTestService.getJumpType(tUnionJumpType);
        }
        if (a(str, iTUnionWebView)) {
            if (tUnionMediaParams.getExtra() != null) {
                tUnionMediaParams.getExtra().put(PushConstants.WEB_URL, str);
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put(PushConstants.WEB_URL, str);
                tUnionMediaParams.setExtra(hashMap);
            }
            ITUnionNetwork tUnionNetwork = TUnionTradeSDK.getInstance().getTUnionNetwork();
            TUnionNetworkRequest createConvertRequest = TUnionNetworkRequest.createConvertRequest(tUnionMediaParams, tUnionNetwork instanceof ITUnionNetworkMtop);
            if (tUnionNetwork != null) {
                TUnionUTUtils.Convert.request();
                TULog.d("convert is calling...", new Object[0]);
                tUnionNetwork.sendRequest(createConvertRequest, new ITUnionNetReqCallback() {
                    public void onSuccess(int i, JSONObject jSONObject) {
                        String str;
                        if (jSONObject != null) {
                            str = jSONObject.optString(PushConstants.WEB_URL);
                        } else {
                            TUnionUTUtils.Config.failed("Server Response is empty");
                            str = null;
                        }
                        if (TextUtils.isEmpty(str) || str.equals("null")) {
                            str = str;
                            TUnionUTUtils.Config.failed("Server Response is non-empty, but no url");
                        }
                        String a2 = TUnionConvertService.this.a(str, tUnionJumpType);
                        if (tUnionConvertCallback != null) {
                            tUnionConvertCallback.onResult(new TUnionConvertResult(tUnionJumpType, a2));
                        }
                    }

                    public void onError(int i, String str, JSONObject jSONObject) {
                        TUnionUTUtils.Convert.failed(str);
                        if (tUnionConvertCallback != null) {
                            tUnionConvertCallback.onResult(new TUnionConvertResult(tUnionJumpType, str));
                        }
                    }
                });
                return;
            }
        }
        if (tUnionConvertCallback != null) {
            tUnionConvertCallback.onResult(new TUnionConvertResult(tUnionJumpType, str));
        }
    }
}

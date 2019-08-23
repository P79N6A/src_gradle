package com.alimama.tunion.sdk.a;

import com.alimama.tunion.trade.base.ITUnionNetworkURL;
import com.alimama.tunion.trade.net.ITUnionNetReqCallback;
import com.alimama.tunion.trade.net.TUnionNetworkRequest;
import com.alimama.tunion.utils.TULog;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import org.json.JSONObject;

public class d implements ITUnionNetworkURL {
    public String a(InputStream inputStream) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.close();
                    inputStream.close();
                    return new String(byteArrayOutputStream.toByteArray());
                }
            }
        } catch (Exception e2) {
            TULog.e(e2.toString(), new Object[0]);
            return null;
        }
    }

    public void sendRequest(final TUnionNetworkRequest tUnionNetworkRequest, final ITUnionNetReqCallback iTUnionNetReqCallback) {
        if (tUnionNetworkRequest != null) {
            if (tUnionNetworkRequest.isPost()) {
                new Thread(new Runnable() {
                    public void run() {
                        d.this.a(tUnionNetworkRequest, iTUnionNetReqCallback);
                    }
                }).start();
                return;
            }
            new Thread(new Runnable() {
                public void run() {
                    d.this.b(tUnionNetworkRequest, iTUnionNetReqCallback);
                }
            }).start();
        }
    }

    /* access modifiers changed from: private */
    public void a(TUnionNetworkRequest tUnionNetworkRequest, ITUnionNetReqCallback iTUnionNetReqCallback) {
        try {
            String urlName = tUnionNetworkRequest.getUrlName();
            byte[] bytes = new JSONObject(tUnionNetworkRequest.getParamMap()).toString().getBytes("utf-8");
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(urlName).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(5000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.connect();
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(bytes);
            dataOutputStream.flush();
            dataOutputStream.close();
            if (httpURLConnection.getResponseCode() == 200) {
                String a2 = a(httpURLConnection.getInputStream());
                if (iTUnionNetReqCallback != null) {
                    iTUnionNetReqCallback.onSuccess(httpURLConnection.getResponseCode(), new JSONObject(a2));
                }
                TULog.e("URL： " + urlName + " " + httpURLConnection.getResponseCode() + " Post方式请求成功，result--->" + a2, new Object[0]);
            } else {
                if (iTUnionNetReqCallback != null) {
                    int responseCode = httpURLConnection.getResponseCode();
                    iTUnionNetReqCallback.onError(responseCode, "URL： " + urlName + " Post方式请求失败", null);
                }
                TULog.e("URL： " + urlName + " " + httpURLConnection.getResponseCode() + " Post方式请求失败", new Object[0]);
            }
            httpURLConnection.disconnect();
        } catch (Exception e2) {
            if (iTUnionNetReqCallback != null) {
                iTUnionNetReqCallback.onError(-1, "-1 Post方式请求失败", null);
            }
            TULog.e(e2.toString(), new Object[0]);
        }
    }

    /* access modifiers changed from: private */
    public void b(TUnionNetworkRequest tUnionNetworkRequest, ITUnionNetReqCallback iTUnionNetReqCallback) {
        try {
            String urlName = tUnionNetworkRequest.getUrlName();
            Map paramMap = tUnionNetworkRequest.getParamMap();
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (String str : paramMap.keySet()) {
                if (i > 0) {
                    sb.append("&");
                }
                sb.append(String.format("%s=%s", new Object[]{str, URLEncoder.encode((String) paramMap.get(str), "utf-8")}));
                i++;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(urlName + "?" + sb.toString()).openConnection();
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(5000);
            httpURLConnection.setUseCaches(true);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Connection", "Keep-Alive");
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                String a2 = a(httpURLConnection.getInputStream());
                if (iTUnionNetReqCallback != null) {
                    iTUnionNetReqCallback.onSuccess(200, new JSONObject(a2));
                }
                TULog.e("URL： " + urlName + " " + httpURLConnection.getResponseCode() + " Get方式请求成功，result--->" + a2, new Object[0]);
            } else {
                if (iTUnionNetReqCallback != null) {
                    int responseCode = httpURLConnection.getResponseCode();
                    iTUnionNetReqCallback.onError(responseCode, "URL： " + urlName + " Get方式请求失败", null);
                }
                TULog.e("URL： " + urlName + " " + httpURLConnection.getResponseCode() + " Get方式请求失败", new Object[0]);
            }
            httpURLConnection.disconnect();
        } catch (Exception e2) {
            if (iTUnionNetReqCallback != null) {
                iTUnionNetReqCallback.onError(-1, "-1 Get方式请求异常", null);
            }
            TULog.e(e2.toString(), new Object[0]);
        }
    }
}

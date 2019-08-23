package org.chromium;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient;
import com.ttnet.org.chromium.net.CronetEngine;
import com.ttnet.org.chromium.net.ExperimentalCronetEngine;
import com.ttnet.org.chromium.net.RequestFinishedInfo;
import com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public class CronetClient implements ICronetClient {
    private static volatile CronetEngine sCronetEngine = null;
    private static volatile RequestFinishedInfo.Listener sRequestFinishedInfoListener = null;
    private static volatile String sTokenStr = "";

    public long getCostTime(long j, long j2) {
        if (j2 == -1 || j == -1 || j2 > j) {
            return -1;
        }
        return j - j2;
    }

    public String getCronetVersion() {
        return "TTNetVersion:eb090b3e 2019-05-16";
    }

    public static CronetEngine getCronetEngine() {
        if (sCronetEngine != null) {
            return sCronetEngine;
        }
        throw new NullPointerException("Cronet engine is null.");
    }

    public static Map<String, int[]> getGroupRTTEstimates() throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            return ((ExperimentalCronetEngine) sCronetEngine).getGroupRttEstimates();
        }
        throw new UnsupportedOperationException("CronetEngine is not initialized.");
    }

    public static int[] getNetworkQuality() throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            ExperimentalCronetEngine experimentalCronetEngine = (ExperimentalCronetEngine) sCronetEngine;
            return new int[]{experimentalCronetEngine.getTransportRttMs(), experimentalCronetEngine.getHttpRttMs(), experimentalCronetEngine.getDownstreamThroughputKbps()};
        }
        throw new UnsupportedOperationException("CronetEngine is not initialized.");
    }

    public boolean isCronetHttpURLConnection(HttpURLConnection httpURLConnection) {
        return httpURLConnection instanceof CronetHttpURLConnection;
    }

    private long getTime(Date date) {
        if (date == null) {
            return -1;
        }
        return date.getTime();
    }

    private long getValue(Long l) {
        if (l == null) {
            return -1;
        }
        return l.longValue();
    }

    public static List<InetAddress> dnsLookup(String str) throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            return ((ExperimentalCronetEngine) sCronetEngine).dnsLookup(str);
        }
        throw new UnsupportedOperationException("CronetEngine is not initialized.");
    }

    public static void setEnableURLDispatcher(boolean z) throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            ((ExperimentalCronetEngine) sCronetEngine).setEnableURLDispatcher(z);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine is not initialized.");
    }

    public static void setHostResolverRules(String str) throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            ((ExperimentalCronetEngine) sCronetEngine).setHostResolverRules(str);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine is not initialized.");
    }

    public static void setProxy(String str) throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            ((ExperimentalCronetEngine) sCronetEngine).setProxy(str);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine is not initialized.");
    }

    private void tryCreateRequestFinishedInfoListener(Executor executor) {
        if (sRequestFinishedInfoListener == null) {
            synchronized (CronetClient.class) {
                if (sRequestFinishedInfoListener == null) {
                    sRequestFinishedInfoListener = new RequestFinishedInfo.Listener(executor) {
                        private long getTime(Date date) {
                            if (date == null) {
                                return -1;
                            }
                            return date.getTime();
                        }

                        public void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
                            String str;
                            if (requestFinishedInfo != null) {
                                if (requestFinishedInfo.getMetrics() != null) {
                                    String str2 = "";
                                    try {
                                        if (d.a().loggerDebug()) {
                                            try {
                                                if (requestFinishedInfo.getResponseInfo() != null) {
                                                    str2 = str2 + " http status = " + requestFinishedInfo.getResponseInfo().getHttpStatusText();
                                                }
                                                str = str2 + " finishedReason = " + requestFinishedInfo.getFinishedReason();
                                            } catch (Exception unused) {
                                                str = str2;
                                            }
                                            d.a().loggerD("CronetClient", str + " url = " + requestFinishedInfo.getUrl());
                                            String str3 = " dns_cost = " + CronetClient.this.getCostTime(getTime(r0.getDnsEnd()), getTime(r0.getDnsStart())) + " ms ";
                                            String str4 = str3 + " connect_cost = " + CronetClient.this.getCostTime(getTime(r0.getConnectEnd()), getTime(r0.getConnectStart())) + " ms ";
                                            String str5 = str4 + " ssl_cost = " + CronetClient.this.getCostTime(getTime(r0.getSslEnd()), getTime(r0.getSslStart())) + " ms ";
                                            String str6 = str5 + " sending_cost = " + CronetClient.this.getCostTime(getTime(r0.getSendingEnd()), getTime(r0.getSendingStart())) + " ms ";
                                            String str7 = str6 + " push_cost = " + CronetClient.this.getCostTime(getTime(r0.getPushEnd()), getTime(r0.getPushStart())) + " ms ";
                                            String str8 = str7 + " response_cost = " + CronetClient.this.getCostTime(getTime(r0.getRequestEnd()), getTime(r0.getResponseStart())) + " ms ";
                                            String str9 = str8 + " total_cost = " + r0.getTotalTimeMs() + " ms ";
                                            d.a().loggerD("CronetClient", str9 + " remote_ip = " + r0.getPeerAddr() + " : " + r0.getPeerPort());
                                            try {
                                                if (requestFinishedInfo.getException() != null) {
                                                    d.a().loggerD("CronetClient", " exception = " + requestFinishedInfo.getException().getMessage());
                                                }
                                            } catch (Exception unused2) {
                                            }
                                        }
                                    } catch (Throwable unused3) {
                                    }
                                }
                            }
                        }
                    };
                }
            }
        }
    }

    public static void triggerGetDomain(Context context) {
        try {
            if (f.a(context)) {
                if (d.a().loggerDebug()) {
                    d.a().loggerD("CronetClient", "triggerGetDomain start");
                }
                if (sCronetEngine instanceof ExperimentalCronetEngine) {
                    ((ExperimentalCronetEngine) sCronetEngine).triggerGetDomain();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void syncHttpEncryptConfig(Map<String, Object> map) {
        String str;
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    if (d.a().loggerDebug()) {
                        d a2 = d.a();
                        a2.loggerD("CronetClient", "syncHttpEncryptConfig start config = " + map.toString());
                    }
                    JSONObject jSONObject = new JSONObject();
                    byte[] bArr = (byte[]) map.get("key");
                    byte[] bArr2 = (byte[]) map.get("hmac_key");
                    String str2 = (String) map.get("token");
                    long longValue = ((Long) map.get("expire")).longValue();
                    long longValue2 = ((Long) map.get("request_time")).longValue();
                    int intValue = ((Integer) map.get("version")).intValue();
                    if (bArr != null) {
                        if (bArr.length > 0) {
                            if (bArr2 != null) {
                                if (bArr2.length > 0) {
                                    if (TextUtils.isEmpty(str2)) {
                                        if (d.a().loggerDebug()) {
                                            d.a().loggerD("CronetClient", "syncHttpEncryptConfig token is null");
                                        }
                                        return;
                                    } else if (longValue <= 0) {
                                        if (d.a().loggerDebug()) {
                                            d.a().loggerD("CronetClient", "syncHttpEncryptConfig expire <= 0");
                                        }
                                        return;
                                    } else {
                                        jSONObject.put("key", Base64.encodeToString(bArr, 2));
                                        jSONObject.put("hmac_key", Base64.encodeToString(bArr2, 2));
                                        jSONObject.put("token", str2);
                                        jSONObject.put("expire", Long.valueOf(longValue / 3600000).intValue());
                                        jSONObject.put("request_time", longValue2);
                                        jSONObject.put("version", intValue);
                                        String jSONObject2 = jSONObject.toString();
                                        if (sCronetEngine instanceof ExperimentalCronetEngine) {
                                            if (d.a().loggerDebug()) {
                                                d a3 = d.a();
                                                a3.loggerD("CronetClient", "syncHttpEncryptConfig send token = " + jSONObject2);
                                            }
                                            ((ExperimentalCronetEngine) sCronetEngine).setToken(jSONObject2);
                                            return;
                                        }
                                        synchronized (CronetClient.class) {
                                            sTokenStr = jSONObject2;
                                        }
                                        if (d.a().loggerDebug()) {
                                            d a4 = d.a();
                                            StringBuilder sb = new StringBuilder("sCronetEngine = ");
                                            if (sCronetEngine == null) {
                                                str = "null";
                                            } else {
                                                str = sCronetEngine.toString();
                                            }
                                            sb.append(str);
                                            a4.loggerD("CronetClient", sb.toString());
                                        }
                                        return;
                                    }
                                }
                            }
                            if (d.a().loggerDebug()) {
                                d.a().loggerD("CronetClient", "syncHttpEncryptConfig hmac_key is null");
                            }
                            return;
                        }
                    }
                    if (d.a().loggerDebug()) {
                        d.a().loggerD("CronetClient", "syncHttpEncryptConfig key is null");
                    }
                    return;
                }
            } catch (Throwable unused) {
            }
        }
        if (d.a().loggerDebug()) {
            d.a().loggerD("CronetClient", "syncHttpEncryptConfig json is null");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028 A[SYNTHETIC, Splitter:B:14:0x0028] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002f A[SYNTHETIC, Splitter:B:22:0x002f] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getConfigFromAssets(android.content.Context r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            r1 = 0
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch:{ Throwable -> 0x002c, all -> 0x0024 }
            java.io.InputStream r4 = r4.open(r5)     // Catch:{ Throwable -> 0x002c, all -> 0x0024 }
            int r5 = r4.available()     // Catch:{ Throwable -> 0x002d, all -> 0x0022 }
            byte[] r5 = new byte[r5]     // Catch:{ Throwable -> 0x002d, all -> 0x0022 }
            r4.read(r5)     // Catch:{ Throwable -> 0x002d, all -> 0x0022 }
            java.lang.String r1 = new java.lang.String     // Catch:{ Throwable -> 0x002d, all -> 0x0022 }
            java.lang.String r2 = "UTF-8"
            r1.<init>(r5, r2)     // Catch:{ Throwable -> 0x002d, all -> 0x0022 }
            if (r4 == 0) goto L_0x0020
            r4.close()     // Catch:{ IOException -> 0x0020 }
        L_0x0020:
            r0 = r1
            goto L_0x0032
        L_0x0022:
            r5 = move-exception
            goto L_0x0026
        L_0x0024:
            r5 = move-exception
            r4 = r1
        L_0x0026:
            if (r4 == 0) goto L_0x002b
            r4.close()     // Catch:{ IOException -> 0x002b }
        L_0x002b:
            throw r5
        L_0x002c:
            r4 = r1
        L_0x002d:
            if (r4 == 0) goto L_0x0032
            r4.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.CronetClient.getConfigFromAssets(android.content.Context, java.lang.String):java.lang.String");
    }

    public static void doCommand(Context context, String str) {
        try {
            if (f.a(context)) {
                if (TextUtils.isEmpty(str)) {
                    if (d.a().loggerDebug()) {
                        d.a().loggerD("CronetClient", "doCommand json is null");
                    }
                    return;
                }
                if (d.a().loggerDebug()) {
                    d a2 = d.a();
                    a2.loggerD("CronetClient", "doCommand start json = " + str);
                }
                if (sCronetEngine instanceof ExperimentalCronetEngine) {
                    ((ExperimentalCronetEngine) sCronetEngine).doCommand(str);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void getRequestMetrics(HttpURLConnection httpURLConnection, Map<String, Object> map) {
        if (httpURLConnection != null && map != null && (httpURLConnection instanceof CronetHttpURLConnection)) {
            try {
                CronetHttpURLConnection cronetHttpURLConnection = (CronetHttpURLConnection) httpURLConnection;
                RequestFinishedInfo requestFinishedInfo = cronetHttpURLConnection.getRequestFinishedInfo();
                if (!(requestFinishedInfo == null || requestFinishedInfo.getMetrics() == null)) {
                    RequestFinishedInfo.Metrics metrics = requestFinishedInfo.getMetrics();
                    map.put("remote_ip", metrics.getPeerAddr() + ":" + metrics.getPeerPort());
                    map.put("dns_time", Long.valueOf(getCostTime(getTime(metrics.getDnsEnd()), getTime(metrics.getDnsStart()))));
                    map.put("connect_time", Long.valueOf(getCostTime(getTime(metrics.getConnectEnd()), getTime(metrics.getConnectStart()))));
                    map.put("ssl_time", Long.valueOf(getCostTime(getTime(metrics.getSslEnd()), getTime(metrics.getSslStart()))));
                    map.put("send_time", Long.valueOf(getCostTime(getTime(metrics.getSendingEnd()), getTime(metrics.getSendingStart()))));
                    map.put("push_time", Long.valueOf(getCostTime(getTime(metrics.getPushEnd()), getTime(metrics.getPushStart()))));
                    map.put("receive_time", Long.valueOf(getCostTime(getTime(metrics.getRequestEnd()), getTime(metrics.getResponseStart()))));
                    map.put("socket_reused", Boolean.valueOf(metrics.getSocketReused()));
                    map.put("ttfb", Long.valueOf(getValue(metrics.getTtfbMs())));
                    map.put("total_time", Long.valueOf(getValue(metrics.getTotalTimeMs())));
                    map.put("send_byte_count", Long.valueOf(getValue(metrics.getSentByteCount())));
                    map.put("received_byte_count", Long.valueOf(getValue(metrics.getReceivedByteCount())));
                }
                map.put("request_log", cronetHttpURLConnection.getRequestLog());
            } catch (Throwable unused) {
            }
        }
    }

    public static void tryStartNetDetect(String[] strArr, int i, int i2) throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            ((ExperimentalCronetEngine) sCronetEngine).tryStartNetDetect(strArr, i, i2);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine is not initialized.");
    }

    public HttpURLConnection openConnection(Context context, String str, boolean z, String str2, Executor executor) throws IOException {
        try {
            tryCreateCronetEngine(context, false, false, false, z, str2, executor);
            return (HttpURLConnection) sCronetEngine.openConnection(new URL(str));
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    public void setCronetEngine(Context context, boolean z, boolean z2, boolean z3, boolean z4, String str, Executor executor) {
        tryCreateCronetEngine(context, z, z2, z3, z4, str, executor);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00da */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0114 */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e6 A[SYNTHETIC, Splitter:B:41:0x00e6] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x012d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void tryCreateCronetEngine(android.content.Context r4, boolean r5, boolean r6, boolean r7, boolean r8, java.lang.String r9, java.util.concurrent.Executor r10) {
        /*
            r3 = this;
            com.ttnet.org.chromium.net.CronetEngine r0 = sCronetEngine
            if (r0 != 0) goto L_0x0178
            java.lang.Class<org.chromium.CronetClient> r0 = org.chromium.CronetClient.class
            monitor-enter(r0)
            com.ttnet.org.chromium.net.CronetEngine r1 = sCronetEngine     // Catch:{ all -> 0x0175 }
            if (r1 != 0) goto L_0x0161
            com.ttnet.org.chromium.net.ExperimentalCronetEngine$Builder r1 = new com.ttnet.org.chromium.net.ExperimentalCronetEngine$Builder     // Catch:{ all -> 0x0175 }
            r1.<init>(r4)     // Catch:{ all -> 0x0175 }
            com.ttnet.org.chromium.net.ExperimentalCronetEngine$Builder r5 = r1.enableQuic((boolean) r5)     // Catch:{ all -> 0x0175 }
            com.ttnet.org.chromium.net.ExperimentalCronetEngine$Builder r5 = r5.enableHttp2((boolean) r6)     // Catch:{ all -> 0x0175 }
            com.ttnet.org.chromium.net.ExperimentalCronetEngine$Builder r5 = r5.enableSdch((boolean) r7)     // Catch:{ all -> 0x0175 }
            com.ttnet.org.chromium.net.ExperimentalCronetEngine$Builder r5 = r5.enableHttpDns((boolean) r8)     // Catch:{ all -> 0x0175 }
            r6 = 0
            r8 = 0
            com.ttnet.org.chromium.net.ExperimentalCronetEngine$Builder r5 = r5.enableHttpCache((int) r8, (long) r6)     // Catch:{ all -> 0x0175 }
            r6 = 1
            com.ttnet.org.chromium.net.ExperimentalCronetEngine$Builder r5 = r5.enableNetworkQualityEstimator(r6)     // Catch:{ all -> 0x0175 }
            org.chromium.d r7 = org.chromium.d.a()     // Catch:{ all -> 0x0175 }
            boolean r7 = r7.loggerDebug()     // Catch:{ all -> 0x0175 }
            if (r7 == 0) goto L_0x0039
            r5.enableVerboseLog()     // Catch:{ all -> 0x0175 }
        L_0x0039:
            org.chromium.a r7 = org.chromium.a.a(r4)     // Catch:{ all -> 0x0175 }
            r5.setAppInfoProvider((com.ttnet.org.chromium.net.TTAppInfoProvider) r7)     // Catch:{ all -> 0x0175 }
            org.chromium.e r7 = org.chromium.e.a()     // Catch:{ all -> 0x0175 }
            r5.setEventListener((com.ttnet.org.chromium.net.TTEventListener) r7)     // Catch:{ all -> 0x0175 }
            boolean r7 = org.chromium.f.a((android.content.Context) r4)     // Catch:{ all -> 0x0175 }
            if (r7 == 0) goto L_0x005a
            org.chromium.b r7 = org.chromium.b.a()     // Catch:{ all -> 0x0175 }
            r5.setAppMonitorProvider((com.ttnet.org.chromium.net.TTMonitorProvider) r7)     // Catch:{ all -> 0x0175 }
            org.chromium.e r7 = org.chromium.e.a()     // Catch:{ all -> 0x0175 }
            r7.f84077a = r6     // Catch:{ all -> 0x0175 }
        L_0x005a:
            boolean r7 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0175 }
            if (r7 != 0) goto L_0x0074
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0175 }
            r7.<init>()     // Catch:{ all -> 0x0175 }
            r7.append(r9)     // Catch:{ all -> 0x0175 }
            java.lang.String r9 = " cronet/TTNetVersion:eb090b3e 2019-05-16"
            r7.append(r9)     // Catch:{ all -> 0x0175 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0175 }
            r5.setUserAgent((java.lang.String) r7)     // Catch:{ all -> 0x0175 }
        L_0x0074:
            org.chromium.c r7 = org.chromium.c.a()     // Catch:{ all -> 0x0175 }
            java.lang.String r7 = r7.c()     // Catch:{ all -> 0x0175 }
            if (r7 == 0) goto L_0x0081
            r5.setGetDomainDefaultJSON((java.lang.String) r7)     // Catch:{ all -> 0x0175 }
        L_0x0081:
            java.lang.String r7 = ""
            java.lang.String r9 = r4.getPackageName()     // Catch:{ Throwable -> 0x00ac }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00ac }
            r1.<init>()     // Catch:{ Throwable -> 0x00ac }
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Throwable -> 0x00ac }
            java.lang.String r2 = r2.getPath()     // Catch:{ Throwable -> 0x00ac }
            r1.append(r2)     // Catch:{ Throwable -> 0x00ac }
            java.lang.String r2 = "/Android/data/"
            r1.append(r2)     // Catch:{ Throwable -> 0x00ac }
            r1.append(r9)     // Catch:{ Throwable -> 0x00ac }
            java.lang.String r9 = "/cache/"
            r1.append(r9)     // Catch:{ Throwable -> 0x00ac }
            java.lang.String r9 = r1.toString()     // Catch:{ Throwable -> 0x00ac }
            r5.setStoragePath((java.lang.String) r9)     // Catch:{ Throwable -> 0x00ad }
            goto L_0x00ad
        L_0x00ac:
            r9 = r7
        L_0x00ad:
            java.lang.String r7 = "ttnet_config.json"
            java.lang.String r7 = r3.getConfigFromAssets(r4, r7)     // Catch:{ all -> 0x0175 }
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0175 }
            if (r1 != 0) goto L_0x00da
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00da }
            r1.<init>(r7)     // Catch:{ Throwable -> 0x00da }
            java.lang.String r7 = "ttnet_proxy"
            java.lang.String r2 = ""
            java.lang.String r7 = r1.optString(r7, r2)     // Catch:{ Throwable -> 0x00da }
            boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x00da }
            if (r2 != 0) goto L_0x00cf
            r5.setProxyConfig((java.lang.String) r7)     // Catch:{ Throwable -> 0x00da }
        L_0x00cf:
            java.lang.String r7 = "boe_proxy_enabled"
            boolean r7 = r1.optBoolean(r7, r8)     // Catch:{ Throwable -> 0x00da }
            if (r7 == 0) goto L_0x00da
            r5.enableBoeProxy((boolean) r7)     // Catch:{ Throwable -> 0x00da }
        L_0x00da:
            com.ttnet.org.chromium.net.ExperimentalCronetEngine r5 = r5.build()     // Catch:{ all -> 0x0175 }
            sCronetEngine = r5     // Catch:{ all -> 0x0175 }
            boolean r5 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0175 }
            if (r5 != 0) goto L_0x0114
            java.io.File r5 = new java.io.File     // Catch:{ Throwable -> 0x0114 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0114 }
            r7.<init>()     // Catch:{ Throwable -> 0x0114 }
            r7.append(r9)     // Catch:{ Throwable -> 0x0114 }
            java.lang.String r4 = org.chromium.f.b(r4)     // Catch:{ Throwable -> 0x0114 }
            r7.append(r4)     // Catch:{ Throwable -> 0x0114 }
            java.lang.String r4 = "_netlog.json"
            r7.append(r4)     // Catch:{ Throwable -> 0x0114 }
            java.lang.String r4 = r7.toString()     // Catch:{ Throwable -> 0x0114 }
            r5.<init>(r4)     // Catch:{ Throwable -> 0x0114 }
            boolean r4 = r5.exists()     // Catch:{ Throwable -> 0x0114 }
            if (r4 == 0) goto L_0x0114
            com.ttnet.org.chromium.net.CronetEngine r4 = sCronetEngine     // Catch:{ Throwable -> 0x0114 }
            com.ttnet.org.chromium.net.ExperimentalCronetEngine r4 = (com.ttnet.org.chromium.net.ExperimentalCronetEngine) r4     // Catch:{ Throwable -> 0x0114 }
            java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ Throwable -> 0x0114 }
            r4.startNetLogToFile(r5, r6)     // Catch:{ Throwable -> 0x0114 }
        L_0x0114:
            org.chromium.d r4 = org.chromium.d.a()     // Catch:{ all -> 0x0175 }
            boolean r4 = r4.loggerDebug()     // Catch:{ all -> 0x0175 }
            if (r4 == 0) goto L_0x0123
            r4 = 2
            com.ttnet.org.chromium.base.Logger.setLogLevel(r4)     // Catch:{ all -> 0x0175 }
            goto L_0x0127
        L_0x0123:
            r4 = 4
            com.ttnet.org.chromium.base.Logger.setLogLevel(r4)     // Catch:{ all -> 0x0175 }
        L_0x0127:
            com.ttnet.org.chromium.net.CronetEngine r4 = sCronetEngine     // Catch:{ all -> 0x0175 }
            boolean r4 = r4 instanceof com.ttnet.org.chromium.net.ExperimentalCronetEngine     // Catch:{ all -> 0x0175 }
            if (r4 == 0) goto L_0x0161
            com.ttnet.org.chromium.net.CronetEngine r4 = sCronetEngine     // Catch:{ all -> 0x0175 }
            com.ttnet.org.chromium.net.ExperimentalCronetEngine r4 = (com.ttnet.org.chromium.net.ExperimentalCronetEngine) r4     // Catch:{ all -> 0x0175 }
            java.lang.String r5 = sTokenStr     // Catch:{ all -> 0x0175 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0175 }
            if (r5 != 0) goto L_0x0161
            org.chromium.d r5 = org.chromium.d.a()     // Catch:{ all -> 0x0175 }
            boolean r5 = r5.loggerDebug()     // Catch:{ all -> 0x0175 }
            if (r5 == 0) goto L_0x015c
            org.chromium.d r5 = org.chromium.d.a()     // Catch:{ all -> 0x0175 }
            java.lang.String r6 = "CronetClient"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0175 }
            java.lang.String r8 = "createCronetEngine send token = "
            r7.<init>(r8)     // Catch:{ all -> 0x0175 }
            java.lang.String r8 = sTokenStr     // Catch:{ all -> 0x0175 }
            r7.append(r8)     // Catch:{ all -> 0x0175 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0175 }
            r5.loggerD(r6, r7)     // Catch:{ all -> 0x0175 }
        L_0x015c:
            java.lang.String r5 = sTokenStr     // Catch:{ all -> 0x0175 }
            r4.setToken(r5)     // Catch:{ all -> 0x0175 }
        L_0x0161:
            com.ttnet.org.chromium.net.CronetEngine r4 = sCronetEngine     // Catch:{ all -> 0x0175 }
            boolean r4 = r4 instanceof com.ttnet.org.chromium.net.ExperimentalCronetEngine     // Catch:{ all -> 0x0175 }
            if (r4 == 0) goto L_0x0173
            com.ttnet.org.chromium.net.CronetEngine r4 = sCronetEngine     // Catch:{ all -> 0x0175 }
            com.ttnet.org.chromium.net.ExperimentalCronetEngine r4 = (com.ttnet.org.chromium.net.ExperimentalCronetEngine) r4     // Catch:{ all -> 0x0175 }
            r3.tryCreateRequestFinishedInfoListener(r10)     // Catch:{ all -> 0x0175 }
            com.ttnet.org.chromium.net.RequestFinishedInfo$Listener r5 = sRequestFinishedInfoListener     // Catch:{ all -> 0x0175 }
            r4.addRequestFinishedListener(r5)     // Catch:{ all -> 0x0175 }
        L_0x0173:
            monitor-exit(r0)     // Catch:{ all -> 0x0175 }
            return
        L_0x0175:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0175 }
            throw r4
        L_0x0178:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.CronetClient.tryCreateCronetEngine(android.content.Context, boolean, boolean, boolean, boolean, java.lang.String, java.util.concurrent.Executor):void");
    }
}

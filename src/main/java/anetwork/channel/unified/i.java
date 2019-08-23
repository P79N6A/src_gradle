package anetwork.channel.unified;

import anet.channel.RequestCb;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.bytes.ByteArray;
import anet.channel.flow.FlowStat;
import anet.channel.flow.NetworkAnalysis;
import anet.channel.monitor.b;
import anet.channel.request.Request;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.statist.RequestStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpHelper;
import anet.channel.util.HttpUrl;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.cache.Cache;
import anetwork.channel.cache.a;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.cookie.CookieManager;
import anetwork.channel.unified.e;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class i implements RequestCb {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Request f1588a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ RequestStatistic f1589b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ e f1590c;

    public void onDataReceive(ByteArray byteArray, boolean z) {
        boolean z2;
        if (!this.f1590c.h.get()) {
            if (this.f1590c.j == 0) {
                ALog.i("anet.NetworkTask", "[onDataReceive] receive first data chunk!", this.f1590c.f1566a.f1593c, new Object[0]);
            }
            if (z) {
                ALog.i("anet.NetworkTask", "[onDataReceive] receive last data chunk!", this.f1590c.f1566a.f1593c, new Object[0]);
            }
            this.f1590c.j++;
            try {
                if (this.f1590c.m != null) {
                    this.f1590c.m.f1574c.add(byteArray);
                    if (this.f1589b.recDataSize > 131072 || z) {
                        this.f1590c.j = this.f1590c.m.a(this.f1590c.f1566a.f1592b, this.f1590c.i);
                        this.f1590c.k = true;
                        e eVar = this.f1590c;
                        if (this.f1590c.j > 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        eVar.l = z2;
                        this.f1590c.m = null;
                    }
                } else {
                    this.f1590c.f1566a.f1592b.onDataReceiveSize(this.f1590c.j, this.f1590c.i, byteArray);
                    this.f1590c.l = true;
                }
                if (this.f1590c.f1569d != null) {
                    this.f1590c.f1569d.write(byteArray.getBuffer(), 0, byteArray.getDataLength());
                    if (z) {
                        String g = this.f1590c.f1566a.f1591a.g();
                        this.f1590c.f1568c.data = this.f1590c.f1569d.toByteArray();
                        long currentTimeMillis = System.currentTimeMillis();
                        this.f1590c.f1567b.put(g, this.f1590c.f1568c);
                        ALog.i("anet.NetworkTask", "write cache", this.f1590c.f1566a.f1593c, "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "size", Integer.valueOf(this.f1590c.f1568c.data.length), "key", g);
                    }
                }
            } catch (Exception e2) {
                ALog.w("anet.NetworkTask", "[onDataReceive] error.", this.f1590c.f1566a.f1593c, e2, new Object[0]);
            }
        }
    }

    public void onResponseCode(int i, Map<String, List<String>> map) {
        int i2;
        if (!this.f1590c.h.get()) {
            if (ALog.isPrintLog(2)) {
                ALog.i("anet.NetworkTask", "onResponseCode", this.f1588a.getSeq(), "code", Integer.valueOf(i));
                ALog.i("anet.NetworkTask", "onResponseCode", this.f1588a.getSeq(), "headers", map);
            }
            if (HttpHelper.checkRedirect(this.f1588a, i)) {
                String singleHeaderFieldByKey = HttpHelper.getSingleHeaderFieldByKey(map, "Location");
                if (singleHeaderFieldByKey != null) {
                    HttpUrl parse = HttpUrl.parse(singleHeaderFieldByKey);
                    if (parse != null) {
                        if (this.f1590c.h.compareAndSet(false, true)) {
                            parse.lockScheme();
                            this.f1590c.f1566a.f1591a.a(parse);
                            this.f1590c.f1566a.f1594d = new AtomicBoolean();
                            this.f1590c.f1566a.f1595e = new e(this.f1590c.f1566a, null, null);
                            this.f1589b.recordRedirect(i, parse.simpleUrlString());
                            ThreadPoolExecutorFactory.submitPriorityTask(this.f1590c.f1566a.f1595e, ThreadPoolExecutorFactory.Priority.HIGH);
                        }
                        return;
                    }
                    ALog.e("anet.NetworkTask", "redirect url is invalid!", this.f1588a.getSeq(), "redirect url", singleHeaderFieldByKey);
                }
            }
            try {
                this.f1590c.f1566a.a();
                CookieManager.setCookie(this.f1590c.f1566a.f1591a.g(), map);
                this.f1590c.i = HttpHelper.parseContentLength(map);
                String g = this.f1590c.f1566a.f1591a.g();
                if (this.f1590c.f1568c == null || i != 304) {
                    if (this.f1590c.f1567b != null) {
                        if ("no-store".equals(HttpHelper.getSingleHeaderFieldByKey(map, "Cache-Control"))) {
                            this.f1590c.f1567b.remove(g);
                        } else {
                            e eVar = this.f1590c;
                            Cache.Entry a2 = a.a(map);
                            eVar.f1568c = a2;
                            if (a2 != null) {
                                HttpHelper.removeHeaderFiledByKey(map, "Cache-Control");
                                map.put("Cache-Control", Arrays.asList(new String[]{"no-store"}));
                                e eVar2 = this.f1590c;
                                if (this.f1590c.i != 0) {
                                    i2 = this.f1590c.i;
                                } else {
                                    i2 = 5120;
                                }
                                eVar2.f1569d = new ByteArrayOutputStream(i2);
                            }
                        }
                    }
                    map.put("x-protocol", Arrays.asList(new String[]{this.f1589b.protocolType}));
                    if (!NetworkConfigCenter.isResponseBufferEnable() || this.f1590c.i > 131072) {
                        this.f1590c.f1566a.f1592b.onResponseCode(i, map);
                        this.f1590c.k = true;
                        return;
                    }
                    this.f1590c.m = new e.a(i, map);
                    return;
                }
                this.f1590c.f1568c.responseHeaders.putAll(map);
                Cache.Entry a3 = a.a(map);
                if (a3 != null && a3.ttl > this.f1590c.f1568c.ttl) {
                    this.f1590c.f1568c.ttl = a3.ttl;
                }
                this.f1590c.f1566a.f1592b.onResponseCode(200, this.f1590c.f1568c.responseHeaders);
                this.f1590c.f1566a.f1592b.onDataReceiveSize(1, this.f1590c.f1568c.data.length, ByteArray.wrap(this.f1590c.f1568c.data));
                long currentTimeMillis = System.currentTimeMillis();
                this.f1590c.f1567b.put(g, this.f1590c.f1568c);
                ALog.i("anet.NetworkTask", "update cache", this.f1590c.f1566a.f1593c, "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "key", g);
            } catch (Exception e2) {
                ALog.w("anet.NetworkTask", "[onResponseCode] error.", this.f1590c.f1566a.f1593c, e2, new Object[0]);
            }
        }
    }

    i(e eVar, Request request, RequestStatistic requestStatistic) {
        this.f1590c = eVar;
        this.f1588a = request;
        this.f1589b = requestStatistic;
    }

    public void onFinish(int i, String str, RequestStatistic requestStatistic) {
        DefaultFinishEvent defaultFinishEvent;
        String str2;
        if (!this.f1590c.h.getAndSet(true)) {
            int i2 = 3;
            if (ALog.isPrintLog(2)) {
                ALog.i("anet.NetworkTask", "[onFinish]", this.f1590c.f1566a.f1593c, "code", Integer.valueOf(i), "msg", str);
            }
            if (i < 0) {
                try {
                    if (this.f1590c.f1566a.f1591a.d()) {
                        if (this.f1590c.k || this.f1590c.l) {
                            requestStatistic.msg += ":回调后触发重试";
                            if (this.f1590c.l) {
                                requestStatistic.roaming = 2;
                            } else if (this.f1590c.k) {
                                requestStatistic.roaming = 1;
                            }
                            ALog.e("anet.NetworkTask", "Cannot retry request after onHeader/onDataReceived callback!", this.f1590c.f1566a.f1593c, new Object[0]);
                        } else {
                            ALog.e("anet.NetworkTask", "clear response buffer and retry", this.f1590c.f1566a.f1593c, new Object[0]);
                            if (this.f1590c.m != null) {
                                if (!this.f1590c.m.f1574c.isEmpty()) {
                                    i2 = 4;
                                }
                                requestStatistic.roaming = i2;
                                this.f1590c.m.a();
                                this.f1590c.m = null;
                            }
                            this.f1590c.f1566a.f1591a.k();
                            this.f1590c.f1566a.f1594d = new AtomicBoolean();
                            this.f1590c.f1566a.f1595e = new e(this.f1590c.f1566a, this.f1590c.f1567b, this.f1590c.f1568c);
                            if (requestStatistic.tnetErrorCode != 0) {
                                str2 = i + "|" + requestStatistic.tnetErrorCode;
                                requestStatistic.tnetErrorCode = 0;
                            } else {
                                str2 = String.valueOf(i);
                            }
                            requestStatistic.appendErrorTrace(str2);
                            long currentTimeMillis = System.currentTimeMillis();
                            requestStatistic.retryCostTime += currentTimeMillis - requestStatistic.start;
                            requestStatistic.start = currentTimeMillis;
                            ThreadPoolExecutorFactory.submitPriorityTask(this.f1590c.f1566a.f1595e, ThreadPoolExecutorFactory.Priority.HIGH);
                            return;
                        }
                    }
                } catch (Exception unused) {
                    return;
                }
            }
            if (this.f1590c.m != null) {
                this.f1590c.m.a(this.f1590c.f1566a.f1592b, this.f1590c.i);
            }
            this.f1590c.f1566a.a();
            requestStatistic.isDone.set(true);
            if ("wv_h5".equals(this.f1590c.f1570e)) {
                ALog.e("anet.NetworkTask", null, this.f1590c.f1566a.f1593c, PushConstants.WEB_URL, this.f1588a.getHttpUrl().simpleUrlString(), "content-length", Integer.valueOf(this.f1590c.i), "recDataLength", Long.valueOf(requestStatistic.rspBodyDeflateSize));
            }
            if (!(!this.f1590c.f1566a.f1591a.j() || requestStatistic.contentLength == 0 || requestStatistic.contentLength == requestStatistic.rspBodyDeflateSize)) {
                requestStatistic.ret = 0;
                requestStatistic.statusCode = -206;
                str = ErrorConstant.getErrMsg(-206);
                requestStatistic.msg = str;
                ALog.e("anet.NetworkTask", "received data length not match with content-length", this.f1590c.f1566a.f1593c, "content-length", Integer.valueOf(this.f1590c.i), "recDataLength", Long.valueOf(requestStatistic.rspBodyDeflateSize));
                ExceptionStatistic exceptionStatistic = new ExceptionStatistic(-206, str, "rt");
                exceptionStatistic.url = this.f1590c.f1566a.f1591a.g();
                AppMonitor.getInstance().commitStat(exceptionStatistic);
                i = -206;
            }
            if (i != 304 || this.f1590c.f1568c == null) {
                defaultFinishEvent = new DefaultFinishEvent(i, str, requestStatistic);
            } else {
                requestStatistic.protocolType = "cache";
                defaultFinishEvent = new DefaultFinishEvent(200, str, requestStatistic);
            }
            this.f1590c.f1566a.f1592b.onFinish(defaultFinishEvent);
            if (i >= 0) {
                b.a().a(requestStatistic.sendStart, requestStatistic.rspEnd, requestStatistic.rspHeadDeflateSize + requestStatistic.rspBodyDeflateSize);
            } else {
                requestStatistic.netType = NetworkStatusHelper.getNetworkSubType();
            }
            NetworkAnalysis.getInstance().commitFlow(new FlowStat(this.f1590c.f1570e, requestStatistic));
        }
    }
}

package com.bytedance.android.monitor.webview;

import android.os.Build;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.Map;

public class h {
    private static volatile h o = null;
    private static int p = 269488144;
    private static int q = 538976288;

    /* renamed from: a  reason: collision with root package name */
    public a f18859a;

    /* renamed from: b  reason: collision with root package name */
    public long f18860b = -1;

    /* renamed from: c  reason: collision with root package name */
    public String[] f18861c;

    /* renamed from: d  reason: collision with root package name */
    public String[] f18862d;

    /* renamed from: e  reason: collision with root package name */
    public String f18863e;

    /* renamed from: f  reason: collision with root package name */
    public Map<String, String> f18864f;
    public Map<String, String> g;
    public c h;
    public boolean i = true;
    public boolean j;
    public boolean k;
    public boolean l = true;
    public b m;
    public int n = 10;
    private final String r = "2.0";

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public a f18865a;

        /* renamed from: b  reason: collision with root package name */
        public long f18866b;

        /* renamed from: c  reason: collision with root package name */
        public String[] f18867c;

        /* renamed from: d  reason: collision with root package name */
        public String[] f18868d;

        /* renamed from: e  reason: collision with root package name */
        public Map<String, String> f18869e;

        /* renamed from: f  reason: collision with root package name */
        public Map<String, String> f18870f;
        public String g;
        public c h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l;
        public int m;
        public b n;

        private a() {
            this.i = true;
            this.l = true;
            this.m = 10;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static Map<String, String> a(String[] strArr) {
            if (strArr == null) {
                return new HashMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : strArr) {
                hashMap.put(str, str);
            }
            return hashMap;
        }
    }

    private h() {
    }

    public static h a() {
        if (o == null) {
            synchronized (h.class) {
                if (o == null) {
                    o = new h();
                }
            }
        }
        return o;
    }

    public final void b(WebView webView) {
        d(webView);
    }

    static void c(WebView webView) {
        try {
            if (Build.VERSION.SDK_INT >= 19) {
                webView.evaluateJavascript("javascript:(function(){var url=location.href;var hostName=location.hostname;var pathName=location.pathname;var commonMonitor={};var errorMonitor={};var monitorConfig={};var monitorUtils={};if(typeof ttliveWebViewJsBridge==\"undefined\"){return;}if(typeof window.ttliveWebViewInjected!=\"undefined\"&&window.ttliveWebViewInjected&&typeof window.ttliveWebViewLastUrl!=\"undefined\"&&window.ttliveWebViewLastUrl===url){return;}window.ttliveWebViewInjected=true;window.ttliveWebViewLastUrl=url;monitorUtils.checkUsedFull=function(value){return typeof value!==\"undefined\"&&value!==null&&value!==\"\";};monitorUtils.format=function(value){return value>0?parseInt(value):0;};monitorUtils.isFunction=function(what){return typeof what==='function';};monitorUtils.checkInreportBlackList=function(){if(!monitorUtils.checkUsedFull(url)||!monitorUtils.checkUsedFull(monitorConfig.reportBlackList)||monitorConfig.reportBlackList.length===0){return false;}var tempUrl=url.toLowerCase();for(var index=0;index<monitorConfig.reportBlackList.length;index++){var tempBlackUrl=monitorConfig.reportBlackList[index].toLowerCase();if(tempUrl.indexOf(tempBlackUrl)!==-1||monitorUtils.checkUsedFull(monitorUtils.reportBlackListReg[tempBlackUrl])?monitorUtils.reportBlackListReg[tempBlackUrl].test(tempUrl):RegExp(tempBlackUrl).test(tempUrl)){return true;}}return false;};monitorUtils.checkInWhiteList=function(url){if(!monitorUtils.checkUsedFull(monitorConfig.reportResourceWhiteList)||monitorConfig.reportResourceWhiteList.length===0||!monitorUtils.checkUsedFull(url)){return false;}for(var index in monitorConfig.reportResourceWhiteList){if(url.toLowerCase().indexOf(monitorConfig.reportResourceWhiteList[index].toLowerCase())!==-1){return true;}}return false;};monitorUtils.checkThreshold=function(time){if(!monitorUtils.checkUsedFull(monitorConfig.reportResourceThreshold)){return true;}else{return time>monitorConfig.reportResourceThreshold;}};monitorUtils.mergeDefaultConfig=function(){if(!monitorUtils.checkUsedFull(monitorConfig.jsError)){monitorConfig.jsError=false;}if(!monitorUtils.checkUsedFull(monitorConfig.resourceError)){monitorConfig.resourceError=true;}if(!monitorUtils.checkUsedFull(monitorConfig.httpError)){monitorConfig.httpError=false;}};errorMonitor.sendErrorInfo=function(info){if(monitorUtils.checkUsedFull(info)&&typeof monitorUtils.checkUsedFull(ttliveWebViewJsBridge)){if(monitorUtils.isFunction(ttliveWebViewJsBridge.sendErrorInfo)){ttliveWebViewJsBridge.sendErrorInfo(url,JSON.stringify(info));}}};errorMonitor.handleRejectPromise=function(){window.addEventListener('unhandledrejection',function(event){if(event){var reason=event.reason;errorMonitor.sendErrorInfo({title:'unhandledrejection',msg:'unhandledrejection'+reason,category:'jsError',level:'error'});}},true);};errorMonitor.handleJsAndResourceError=function(){window.addEventListener('error',function(event){if(event){var target=event.target||event.srcElement;var isElementTarget=target instanceof HTMLElement;var errorUrl=target.src||target.href;if(!isElementTarget&&monitorConfig.jsError){errorMonitor.sendErrorInfo({title:target.nodeName,msg:errorUrl,category:'jsError',level:'error'})}else if(isElementTarget&&monitorConfig.resourceError){errorMonitor.sendErrorInfo({title:target.nodeName,requestUrl:errorUrl,msg:\"resource\",category:'resourceError',level:'error'});}}},true);};errorMonitor.handleFetchError=function(){if(!window.fetch)return;var oldFetch=window.fetch;window.fetch=function(){return oldFetch.apply(this,arguments).then(function(res){if(!res.ok){errorMonitor.sendErrorInfo({title:'Fetch Error Info',requestUrl:arguments[0],msg:'fetch',category:'httpError',level:'error'});}return res;}).catch(function(error){errorMonitor.sendErrorInfo({title:'Fetch Error Info',requestUrl:arguments[0],msg:'fetch',category:'httpError',level:'error'});throw error;})}};errorMonitor.handleAjaxError=function(){var protocol=window.location.protocol;if(protocol==='file:')return;errorMonitor.handleFetchError();if(!window.XMLHttpRequest){return;}var xmlHttp=window.XMLHttpRequest;var _oldOpen=xmlHttp.prototype.open;xmlHttp.prototype.open=function(){this.ieslive_requesturl=arguments[1];return _oldOpen.apply(this,arguments);};var handleEvent=function(event){if(event&&event.currentTarget&&event.currentTarget.status!==200){errorMonitor.sendErrorInfo({title:event.target.responseURL,requestUrl:event.target&&event.target.ieslive_requesturl,msg:'ajax type:'+event.type,category:'httpError',level:'error'});}};var oldSend=xmlHttp.prototype.send;xmlHttp.prototype.send=function(){if(this['addEventListener']){this['addEventListener']('error',handleEvent);this['addEventListener']('load',handleEvent);this['addEventListener']('timeout',handleEvent);this['addEventListener']('abort',handleEvent);}else{var oldStateChange=this['onreadystatechange'];this['onreadystatechange']=function(event){if(this.readyState===4){handleEvent(event);}oldStateChange&&oldStateChange.apply(this,arguments);};}return oldSend.apply(this,arguments);}};errorMonitor.handleError=function(){if(monitorConfig.resourceError||monitorConfig.jsError){errorMonitor.handleJsAndResourceError();}if(monitorConfig.httpError){errorMonitor.handleAjaxError();errorMonitor.handleFetchError();}if(monitorConfig.jsError){errorMonitor.handleRejectPromise();}};commonMonitor.sendNavigationInfo=function(info){if(monitorUtils.checkUsedFull(info)&&typeof monitorUtils.checkUsedFull(ttliveWebViewJsBridge)){if(monitorUtils.isFunction(ttliveWebViewJsBridge.sendNavigationInfo)){ttliveWebViewJsBridge.sendNavigationInfo(url,JSON.stringify(info));}}};commonMonitor.asyncGetAndSendNavigationTiming=function(step){if(!monitorUtils.checkUsedFull(performance)||!monitorUtils.checkUsedFull(performance.timing)){return undefined;}var navigationTiming=performance.timing;var navigationTimingInfo={url:url,host:hostName,path:pathName,step:step,loadPage:monitorUtils.format((navigationTiming.loadEventEnd>0?navigationTiming.loadEventEnd:navigationTiming.domComplete)-navigationTiming.navigationStart),domReady:monitorUtils.format(navigationTiming.domContentLoadedEventEnd-navigationTiming.navigationStart),domProcessing:monitorUtils.format(navigationTiming.domComplete-navigationTiming.responseEnd),redirect:monitorUtils.format(navigationTiming.redirectEnd-navigationTiming.redirectStart),lookupDomain:monitorUtils.format(navigationTiming.domainLookupEnd-navigationTiming.domainLookupStart),ttfb:monitorUtils.format(navigationTiming.responseStart-navigationTiming.navigationStart),request:monitorUtils.format(navigationTiming.responseStart-navigationTiming.requestStart),response:monitorUtils.format(navigationTiming.responseEnd-navigationTiming.responseStart),loadEvent:monitorUtils.format(navigationTiming.loadEventEnd-navigationTiming.loadEventStart),appCache:monitorUtils.format(navigationTiming.domainLookupStart-navigationTiming.fetchStart),unloadEvent:monitorUtils.format(navigationTiming.unloadEventEnd-navigationTiming.unloadEventStart),connect:monitorUtils.format(navigationTiming.connectEnd-navigationTiming.connectStart),navigationStart:monitorUtils.format(navigationTiming.navigationStart)};if(monitorUtils.checkInreportBlackList()){return undefined;}commonMonitor.sendNavigationInfo(navigationTimingInfo)};commonMonitor.sendResourceInfo=function(info){if(monitorUtils.checkUsedFull(info)&&monitorUtils.checkUsedFull(ttliveWebViewJsBridge)){if(monitorUtils.isFunction(ttliveWebViewJsBridge.sendResourceInfo)){ttliveWebViewJsBridge.sendResourceInfo(url,JSON.stringify(info));}}};commonMonitor.sendInitTimeInfo=function(){if(monitorUtils.checkUsedFull(ttliveWebViewJsBridge)&&monitorUtils.checkUsedFull(performance)){var time=new Date().getTime()-performance.timing.navigationStart;if(monitorUtils.isFunction(ttliveWebViewJsBridge.sendInitTimeInfo)){ttliveWebViewJsBridge.sendInitTimeInfo(url,(monitorUtils.format(time)+\"\"));}}};commonMonitor.asyncGetAndSendResourceTiming=function(){var resourceTiming=performance.getEntriesByType(\"resource\");if(!monitorUtils.checkUsedFull(resourceTiming)){return undefined;}var length=resourceTiming.length;if(length<=0){return undefined;}var resourceData={};for(var i=0;i<length;i++){var resourceTimingInfo={url:resourceTiming[i].name,host:hostName,path:pathName,redirect:monitorUtils.format(resourceTiming[i].redirectEnd-resourceTiming[i].redirectStart),lookupDomain:monitorUtils.format(resourceTiming[i].domainLookupEnd-resourceTiming[i].domainLookupStart),connect:monitorUtils.format(resourceTiming[i].connectEnd-resourceTiming[i].connectStart),secureTime:monitorUtils.format((resourceTiming[i].secureConnectionStart>0)?(resourceTiming.connectEnd-resourceTiming.secureConnectionStart):\"0\"),response:monitorUtils.format(resourceTiming[i].responseEnd-resourceTiming[i].responseStart),request:monitorUtils.format((resourceTiming[i].requestStart>0)?(resourceTiming[i].responseEnd-resourceTiming[i].requestStart):\"0\"),ttfb:monitorUtils.format(resourceTiming[i].responseStart-resourceTiming[i].requestStart),loadPage:monitorUtils.format((resourceTiming[i].startTime>0)?(resourceTiming[i].responseEnd-resourceTiming[i].startTime):\"0\"),startTime:monitorUtils.format(resourceTiming[i].startTime)};if(monitorUtils.checkThreshold(resourceTimingInfo.loadPage)||monitorUtils.checkInWhiteList(resourceTimingInfo.url)){resourceData[resourceTiming[i].name]=resourceTimingInfo;}}if(monitorUtils.checkInreportBlackList()){return undefined;}commonMonitor.sendResourceInfo(resourceData);};commonMonitor.asyncGetAndSendInfo=function(step){setTimeout(function(){commonMonitor.asyncGetAndSendNavigationTiming(step);commonMonitor.asyncGetAndSendResourceTiming();},0);};commonMonitor.initConfig=function(){if(!monitorUtils.checkUsedFull(ttliveWebViewJsBridge)||!monitorUtils.isFunction(ttliveWebViewJsBridge.getConfiguration)){monitorUtils.mergeDefaultConfig();return;}monitorConfig=JSON.parse(ttliveWebViewJsBridge.getConfiguration());if(monitorUtils.checkUsedFull(monitorConfig.reportBlackList)){monitorUtils.reportBlackListReg={};for(var index=0;index<monitorConfig.reportBlackList.length;index++){var blackUrl=monitorConfig.reportBlackList[index].toLowerCase();monitorUtils.reportBlackListReg[blackUrl]=RegExp(blackUrl);}}monitorUtils.mergeDefaultConfig();};commonMonitor.asyncLoad=function(){window.addEventListener(\"DOMContentLoaded\",function(){commonMonitor.load(\"DOMContentLoaded\");});window.addEventListener(\"load\",function(){commonMonitor.load(\"load\");});};commonMonitor.load=function(step){commonMonitor.sendInitTimeInfo();commonMonitor.asyncGetAndSendInfo(step);};commonMonitor.initConfig();errorMonitor.handleError();if(document.readyState===\"complete\"){commonMonitor.load(\"load\");}else{commonMonitor.asyncLoad();}})()", null);
            }
        } catch (Exception unused) {
        }
    }

    private void d(WebView webView) {
        if (this.f18859a != null) {
            this.f18859a.a(webView);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(WebView webView) {
        boolean z;
        if (webView == null) {
            return false;
        }
        String name = webView.getClass().getName();
        String str = webView.hashCode();
        if (this.m == null || this.m.a()) {
            z = true;
        } else {
            z = false;
        }
        if ((this.f18864f.get(name) != null || this.g.get(str) != null) && z) {
            return true;
        }
        return false;
    }

    public final void a(WebView webView, String str) {
        b(webView, str);
    }

    private void b(WebView webView, String str) {
        if (this.f18859a != null) {
            this.f18859a.a(webView, str);
        }
    }
}

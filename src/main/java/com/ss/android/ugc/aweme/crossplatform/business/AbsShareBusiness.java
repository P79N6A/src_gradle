package com.ss.android.ugc.aweme.crossplatform.business;

import a.i;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.f;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.lancet.c;
import com.ss.android.ugc.aweme.share.SimpleShareDialog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class AbsShareBusiness extends BusinessService.Business {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40719a;

    /* renamed from: b  reason: collision with root package name */
    protected SimpleShareDialog f40720b;

    /* renamed from: c  reason: collision with root package name */
    protected IShareService.ShareStruct f40721c;

    /* renamed from: d  reason: collision with root package name */
    List<String> f40722d = new ArrayList(Arrays.asList(new String[]{"copylink", "qrcode", "browser", "refresh"}));

    /* renamed from: e  reason: collision with root package name */
    public String f40723e = this.i.f40805a.f40796d;

    /* renamed from: f  reason: collision with root package name */
    public String f40724f;
    private a k;

    final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40728a;

        private a() {
        }

        /* synthetic */ a(AbsShareBusiness absShareBusiness, byte b2) {
            this();
        }

        @JavascriptInterface
        public final void showSource(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f40728a, false, 34230, new Class[]{String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f40728a, false, 34230, new Class[]{String.class, String.class}, Void.TYPE);
                return;
            }
            JSONObject jSONObject = null;
            try {
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject = new JSONObject(str4);
                }
            } catch (JSONException unused) {
            }
            AbsShareBusiness.this.a(str3, jSONObject);
        }
    }

    public void b() {
    }

    public boolean b(String str) {
        return true;
    }

    private String e() {
        if (PatchProxy.isSupport(new Object[0], this, f40719a, false, 34215, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f40719a, false, 34215, new Class[0], String.class);
        } else if (this.g instanceof f) {
            return ((f) this.g).g();
        } else {
            return "";
        }
    }

    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f40719a, false, 34224, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40719a, false, 34224, new Class[0], Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new b<TResult>(this), i.f1052b);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x01a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object d() throws java.lang.Exception {
        /*
            r13 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f40719a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 34221(0x85ad, float:4.7954E-41)
            r2 = r13
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0026
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f40719a
            r5 = 0
            r6 = 34221(0x85ad, float:4.7954E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r13
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x01cd
        L_0x0026:
            android.content.Context r1 = r13.j
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 == 0) goto L_0x01cd
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r1 = r13.f40721c
            if (r1 == 0) goto L_0x01cd
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "h5_page"
            r1.put(r2, r3)
            java.lang.String r2 = "previous_page"
            com.ss.android.ugc.aweme.crossplatform.params.base.a r3 = r13.i
            com.ss.android.ugc.aweme.crossplatform.params.a r3 = r3.f40805a
            java.lang.String r3 = r3.g
            r1.put(r2, r3)
            java.lang.String r2 = "scene_id"
            java.lang.String r3 = "1004"
            r1.put(r2, r3)
            java.lang.String r2 = "h5_click_more_button"
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r2, (java.util.Map) r1)
            com.ss.android.ugc.aweme.share.ck r1 = new com.ss.android.ugc.aweme.share.ck
            r1.<init>()
            java.util.List<java.lang.String> r2 = r13.f40722d
            java.lang.String r3 = "qrcode"
            boolean r2 = r2.contains(r3)
            r3 = 1
            r2 = r2 ^ r3
            r1.h = r2
            com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.share.ShareOrderService> r4 = com.ss.android.ugc.aweme.share.ShareOrderService.class
            java.lang.Object r2 = r2.getService(r4)
            com.ss.android.ugc.aweme.share.ShareOrderService r2 = (com.ss.android.ugc.aweme.share.ShareOrderService) r2
            java.lang.String[] r2 = r2.getUrlShareList(r3)
            r1.f64976e = r2
            java.lang.String r2 = r13.f40723e
            android.net.Uri r2 = android.net.Uri.parse(r2)
            java.lang.String r2 = r2.getHost()
            java.util.ArrayList r4 = new java.util.ArrayList
            java.lang.Object[] r5 = new java.lang.Object[r0]
            r6 = 0
            com.meituan.robust.ChangeQuickRedirect r7 = com.ss.android.ugc.aweme.crossplatform.base.a.f40714a
            r8 = 1
            r9 = 34202(0x859a, float:4.7927E-41)
            java.lang.Class[] r10 = new java.lang.Class[r0]
            java.lang.Class<java.util.List> r11 = java.util.List.class
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x00a9
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r7 = 0
            com.meituan.robust.ChangeQuickRedirect r8 = com.ss.android.ugc.aweme.crossplatform.base.a.f40714a
            r9 = 1
            r10 = 34202(0x859a, float:4.7927E-41)
            java.lang.Class[] r11 = new java.lang.Class[r0]
            java.lang.Class<java.util.List> r12 = java.util.List.class
            java.lang.Object r5 = com.meituan.robust.PatchProxy.accessDispatch(r6, r7, r8, r9, r10, r11, r12)
            java.util.List r5 = (java.util.List) r5
            goto L_0x00c7
        L_0x00a9:
            r5 = 5
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.String r6 = "iesdouyin.com"
            r5[r0] = r6
            java.lang.String r6 = "douyincdn.com"
            r5[r3] = r6
            r6 = 2
            java.lang.String r7 = "douyin.com"
            r5[r6] = r7
            r6 = 3
            java.lang.String r7 = "snssdk.com"
            r5[r6] = r7
            r6 = 4
            java.lang.String r7 = "amemv.com"
            r5[r6] = r7
            java.util.List r5 = java.util.Arrays.asList(r5)
        L_0x00c7:
            r4.<init>(r5)
            com.ss.android.ugc.aweme.app.x r5 = com.ss.android.ugc.aweme.app.x.a()
            com.ss.android.ugc.aweme.app.an r5 = r5.v()
            java.lang.Object r5 = r5.c()
            java.util.Set r5 = (java.util.Set) r5
            r4.addAll(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x00df:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00f3
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = com.ss.android.ugc.aweme.net.o.a(r2, r5)
            if (r5 == 0) goto L_0x00df
            r2 = 1
            goto L_0x00f4
        L_0x00f3:
            r2 = 0
        L_0x00f4:
            if (r2 == 0) goto L_0x012b
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r6 = f40719a
            r7 = 0
            r8 = 34216(0x85a8, float:4.7947E-41)
            java.lang.Class[] r9 = new java.lang.Class[r0]
            java.lang.Class r10 = java.lang.Boolean.TYPE
            r5 = r13
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r2 == 0) goto L_0x0121
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r6 = f40719a
            r7 = 0
            r8 = 34216(0x85a8, float:4.7947E-41)
            java.lang.Class[] r9 = new java.lang.Class[r0]
            java.lang.Class r10 = java.lang.Boolean.TYPE
            r5 = r13
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            goto L_0x0127
        L_0x0121:
            com.ss.android.ugc.aweme.crossplatform.base.c r2 = r13.g
            boolean r2 = r2.a()
        L_0x0127:
            if (r2 == 0) goto L_0x012b
            r2 = 1
            goto L_0x012c
        L_0x012b:
            r2 = 0
        L_0x012c:
            r1.o = r2
            java.util.List<java.lang.String> r2 = r13.f40722d
            java.lang.String r4 = "browser"
            boolean r2 = r2.contains(r4)
            r1.j = r2
            java.util.List<java.lang.String> r2 = r13.f40722d
            java.lang.String r4 = "refresh"
            boolean r2 = r2.contains(r4)
            r1.k = r2
            java.util.List<java.lang.String> r2 = r13.f40722d
            java.lang.String r4 = "copylink"
            boolean r2 = r2.contains(r4)
            r1.t = r2
            r1.l = r3
            com.ss.android.ugc.aweme.share.ck$b r2 = new com.ss.android.ugc.aweme.share.ck$b
            r2.<init>()
            com.ss.android.ugc.aweme.crossplatform.params.base.a r4 = r13.i
            com.ss.android.ugc.aweme.crossplatform.params.a r4 = r4.f40805a
            java.lang.String r4 = r4.k
            r2.f64984a = r4
            com.ss.android.ugc.aweme.crossplatform.params.base.a r4 = r13.i
            com.ss.android.ugc.aweme.crossplatform.params.d r4 = r4.f40808d
            boolean r4 = r4.f40824c
            if (r4 == 0) goto L_0x0174
            com.ss.android.ugc.aweme.commercialize.feed.j r4 = com.ss.android.ugc.aweme.commercialize.feed.j.a()
            com.ss.android.ugc.aweme.crossplatform.params.base.a r5 = r13.i
            com.ss.android.ugc.aweme.crossplatform.params.a r5 = r5.f40805a
            java.lang.String r5 = r5.k
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r4.a((java.lang.String) r5)
            if (r4 == 0) goto L_0x0174
            r0 = 1
        L_0x0174:
            r2.f64985b = r0
            r1.w = r2
            com.ss.android.ugc.aweme.share.SimpleShareDialog r0 = new com.ss.android.ugc.aweme.share.SimpleShareDialog
            android.content.Context r2 = r13.j
            android.app.Activity r2 = (android.app.Activity) r2
            r0.<init>(r2, r1)
            r13.f40720b = r0
            com.ss.android.ugc.aweme.share.SimpleShareDialog r0 = r13.f40720b
            com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness$2 r1 = new com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness$2
            r1.<init>()
            r0.setActionHandler(r1)
            com.ss.android.ugc.aweme.share.SimpleShareDialog r0 = r13.f40720b
            com.ss.android.ugc.aweme.crossplatform.business.a r1 = new com.ss.android.ugc.aweme.crossplatform.business.a
            r1.<init>(r13)
            r0.setShareCallback(r1)
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r0 = r13.f40721c
            if (r0 == 0) goto L_0x01a3
            com.ss.android.ugc.aweme.share.SimpleShareDialog r0 = r13.f40720b
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r1 = r13.f40721c
            r0.updateShareStruct(r1)
            goto L_0x01c8
        L_0x01a3:
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r0 = new com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct
            r0.<init>()
            android.content.Context r1 = r13.j
            r2 = 2131558447(0x7f0d002f, float:1.874221E38)
            java.lang.String r1 = r1.getString(r2)
            r0.appName = r1
            java.lang.String r1 = r13.f40723e
            r0.url = r1
            java.lang.String r1 = r13.e()
            r0.title = r1
            r0.isShareOrignalUrl = r3
            java.lang.String r1 = "web"
            r0.itemType = r1
            com.ss.android.ugc.aweme.share.SimpleShareDialog r1 = r13.f40720b
            r1.updateShareStruct(r0)
        L_0x01c8:
            com.ss.android.ugc.aweme.share.SimpleShareDialog r0 = r13.f40720b
            r0.show()
        L_0x01cd:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness.d():java.lang.Object");
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f40719a, false, 34220, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f40719a, false, 34220, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(this.f40721c.url) || TextUtils.isEmpty(this.f40721c.thumbUrl) || TextUtils.isEmpty(this.f40721c.description)) {
            return false;
        } else {
            return true;
        }
    }

    @Keep
    AbsShareBusiness(@NonNull d dVar) {
        super(dVar);
    }

    public void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f40719a, false, 34217, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f40719a, false, 34217, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.f40721c = null;
            this.f40723e = str;
        }
    }

    public void b(WebView webView) {
        WebView webView2 = webView;
        if (PatchProxy.isSupport(new Object[]{webView2}, this, f40719a, false, 34223, new Class[]{WebView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView2}, this, f40719a, false, 34223, new Class[]{WebView.class}, Void.TYPE);
        } else if (webView2 != null) {
            if (PatchProxy.isSupport(new Object[]{webView2, "javascript: function getMetaContent(name) {            var item = document.getElementsByTagName('meta')[name];            if (item != null) {            return item.getAttribute('content');}            else {return null}        }        function getAwemeMetaDatas() {        var aweme = new Object();        aweme.title = getMetaContent('aweme:title');        aweme.desc = getMetaContent('aweme:description');        aweme.image = getMetaContent('aweme:image');        aweme.url = getMetaContent('aweme:url');        aweme.qrcode = getMetaContent('aweme:qrcode');        aweme.shareitems = getMetaContent('aweme:shareitems');        aweme.sharetips = getMetaContent('aweme:share:tips');        return JSON.stringify(aweme);        }        window.local_obj.showSource(window.__title__, getAwemeMetaDatas());"}, null, c.f40767a, true, 34232, new Class[]{WebView.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView2, "javascript: function getMetaContent(name) {            var item = document.getElementsByTagName('meta')[name];            if (item != null) {            return item.getAttribute('content');}            else {return null}        }        function getAwemeMetaDatas() {        var aweme = new Object();        aweme.title = getMetaContent('aweme:title');        aweme.desc = getMetaContent('aweme:description');        aweme.image = getMetaContent('aweme:image');        aweme.url = getMetaContent('aweme:url');        aweme.qrcode = getMetaContent('aweme:qrcode');        aweme.shareitems = getMetaContent('aweme:shareitems');        aweme.sharetips = getMetaContent('aweme:share:tips');        return JSON.stringify(aweme);        }        window.local_obj.showSource(window.__title__, getAwemeMetaDatas());"}, null, c.f40767a, true, 34232, new Class[]{WebView.class, String.class}, Void.TYPE);
                return;
            }
            c.a("javascript: function getMetaContent(name) {            var item = document.getElementsByTagName('meta')[name];            if (item != null) {            return item.getAttribute('content');}            else {return null}        }        function getAwemeMetaDatas() {        var aweme = new Object();        aweme.title = getMetaContent('aweme:title');        aweme.desc = getMetaContent('aweme:description');        aweme.image = getMetaContent('aweme:image');        aweme.url = getMetaContent('aweme:url');        aweme.qrcode = getMetaContent('aweme:qrcode');        aweme.shareitems = getMetaContent('aweme:shareitems');        aweme.sharetips = getMetaContent('aweme:share:tips');        return JSON.stringify(aweme);        }        window.local_obj.showSource(window.__title__, getAwemeMetaDatas());");
            webView2.loadUrl("javascript: function getMetaContent(name) {            var item = document.getElementsByTagName('meta')[name];            if (item != null) {            return item.getAttribute('content');}            else {return null}        }        function getAwemeMetaDatas() {        var aweme = new Object();        aweme.title = getMetaContent('aweme:title');        aweme.desc = getMetaContent('aweme:description');        aweme.image = getMetaContent('aweme:image');        aweme.url = getMetaContent('aweme:url');        aweme.qrcode = getMetaContent('aweme:qrcode');        aweme.shareitems = getMetaContent('aweme:shareitems');        aweme.sharetips = getMetaContent('aweme:share:tips');        return JSON.stringify(aweme);        }        window.local_obj.showSource(window.__title__, getAwemeMetaDatas());");
        }
    }

    public void a(WebView webView) {
        if (PatchProxy.isSupport(new Object[]{webView}, this, f40719a, false, 34222, new Class[]{WebView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView}, this, f40719a, false, 34222, new Class[]{WebView.class}, Void.TYPE);
        } else if (webView != null) {
            if (this.k == null) {
                this.k = new a(this, (byte) 0);
            }
            webView.getSettings().setJavaScriptEnabled(true);
            webView.addJavascriptInterface(this.k, "local_obj");
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(IShareService.ShareResult shareResult) {
        String str;
        String str2;
        String str3;
        if (shareResult != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", "h5_page");
            hashMap.put("platform", shareResult.type);
            hashMap.put("previous_page", this.i.f40805a.g);
            if (TextUtils.isEmpty(this.i.f40805a.f40798f)) {
                str = "";
            } else {
                str = this.i.f40805a.f40798f;
            }
            hashMap.put("group_id", str);
            if (TextUtils.isEmpty(this.i.f40805a.f40798f)) {
                str2 = "";
            } else {
                str2 = "article";
            }
            hashMap.put("webview_type", str2);
            if (this.f40721c == null || TextUtils.isEmpty(this.f40721c.url)) {
                str3 = this.f40723e;
            } else {
                str3 = this.f40721c.url;
            }
            hashMap.put(PushConstants.WEB_URL, str3);
            r.a("h5_share", (Map) hashMap);
        }
    }

    private String a(JSONObject jSONObject, String str) {
        if (PatchProxy.isSupport(new Object[]{jSONObject, str}, this, f40719a, false, 34214, new Class[]{JSONObject.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{jSONObject, str}, this, f40719a, false, 34214, new Class[]{JSONObject.class, String.class}, String.class);
        }
        String optString = jSONObject.optString(str);
        if (optString == null || optString.equals("null")) {
            return null;
        }
        return optString;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0212  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r21, org.json.JSONObject r22) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            r12 = 1
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f40719a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r11] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 34218(0x85aa, float:4.795E-41)
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0047
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f40719a
            r3 = 0
            r4 = 34218(0x85aa, float:4.795E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r11] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0047:
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r0 = r7.f40721c
            if (r0 != 0) goto L_0x0052
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r0 = new com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct
            r0.<init>()
            r7.f40721c = r0
        L_0x0052:
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r0 = r7.f40721c
            r0.isShareOrignalUrl = r12
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r0 = r7.f40721c
            android.content.Context r1 = r7.j
            r2 = 2131558447(0x7f0d002f, float:1.874221E38)
            java.lang.String r1 = r1.getString(r2)
            r0.appName = r1
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r0 = r7.f40721c
            java.lang.String r1 = "title"
            java.lang.String r1 = r7.a((org.json.JSONObject) r9, (java.lang.String) r1)
            r0.title = r1
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r0 = r7.f40721c
            java.lang.String r1 = "description"
            java.lang.String r1 = r7.a((org.json.JSONObject) r9, (java.lang.String) r1)
            r0.description = r1
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r0 = r7.f40721c
            java.lang.String r1 = "url"
            java.lang.String r1 = r7.a((org.json.JSONObject) r9, (java.lang.String) r1)
            r0.url = r1
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r0 = r7.f40721c
            java.lang.String r1 = "image"
            java.lang.String r1 = r7.a((org.json.JSONObject) r9, (java.lang.String) r1)
            r0.thumbUrl = r1
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r0 = r7.f40721c
            java.lang.String r1 = "web"
            r0.itemType = r1
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r0 = r7.f40721c
            java.lang.String r0 = r0.title
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00b6
            boolean r0 = android.text.TextUtils.isEmpty(r21)
            if (r0 != 0) goto L_0x00ae
            java.lang.String r0 = "undefined"
            boolean r0 = android.text.TextUtils.equals(r0, r8)
            if (r0 != 0) goto L_0x00ae
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r0 = r7.f40721c
            r0.title = r8
            goto L_0x00b6
        L_0x00ae:
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r0 = r7.f40721c
            java.lang.String r1 = r20.e()
            r0.title = r1
        L_0x00b6:
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r0 = r7.f40721c
            java.lang.String r0 = r0.description
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00c6
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r0 = r7.f40721c
            java.lang.String r1 = " "
            r0.description = r1
        L_0x00c6:
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r0 = r7.f40721c
            java.lang.String r0 = r0.url
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0224
            com.bytedance.frameworks.baselib.network.http.util.j r0 = new com.bytedance.frameworks.baselib.network.http.util.j
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r1 = r7.f40721c
            java.lang.String r1 = r1.url
            r0.<init>(r1)
            java.lang.Object[] r13 = new java.lang.Object[r11]
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.share.cc.f64922a
            r16 = 1
            r17 = 73289(0x11e49, float:1.027E-40)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r18 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r1 == 0) goto L_0x010a
            java.lang.Object[] r13 = new java.lang.Object[r11]
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.share.cc.f64922a
            r16 = 1
            r17 = 73289(0x11e49, float:1.027E-40)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r18 = r1
        L_0x00ff:
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L_0x014a
        L_0x010a:
            com.ss.android.ugc.aweme.share.cc$a r1 = com.ss.android.ugc.aweme.share.cc.f64923b
            java.lang.Object[] r13 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.share.cc.a.f64924a
            r16 = 0
            r17 = 73291(0x11e4b, float:1.02703E-40)
            java.lang.Class[] r2 = new java.lang.Class[r11]
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r14 = r1
            r18 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r2 == 0) goto L_0x0133
            java.lang.Object[] r13 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.share.cc.a.f64924a
            r16 = 0
            r17 = 73291(0x11e4b, float:1.02703E-40)
            java.lang.Class[] r2 = new java.lang.Class[r11]
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r14 = r1
            r18 = r2
            goto L_0x00ff
        L_0x0133:
            com.ss.android.ugc.aweme.aj.b r1 = com.ss.android.ugc.aweme.aj.b.b()
            com.ss.android.ugc.aweme.app.i r2 = com.ss.android.ugc.aweme.app.i.a()
            java.lang.String r3 = "AppContextInfoManager.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            android.content.Context r2 = r2.getContext()
            java.lang.String r3 = "disable_ucode_in_share_url"
            boolean r1 = r1.c(r2, r3)
        L_0x014a:
            if (r1 != 0) goto L_0x020c
            java.lang.String r1 = "u_code"
            com.ss.android.ugc.aweme.IAccountUserService r2 = com.ss.android.ugc.aweme.account.d.a()
            java.lang.String r2 = r2.getCurUserId()
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r2
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.newmedia.e.f2507a
            r16 = 1
            r17 = 18294(0x4776, float:2.5635E-41)
            java.lang.Class[] r3 = new java.lang.Class[r12]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r3[r11] = r4
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r18 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r3 == 0) goto L_0x018e
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r2
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.newmedia.e.f2507a
            r16 = 1
            r17 = 18294(0x4776, float:2.5635E-41)
            java.lang.Class[] r2 = new java.lang.Class[r12]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r11] = r3
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r18 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0209
        L_0x018e:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L_0x0197
            java.lang.String r2 = ""
            goto L_0x0209
        L_0x0197:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r2 = r2.longValue()
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r2)
            r13[r11] = r4
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.newmedia.e.f2507a
            r16 = 1
            r17 = 18295(0x4777, float:2.5637E-41)
            java.lang.Class[] r4 = new java.lang.Class[r12]
            java.lang.Class r5 = java.lang.Long.TYPE
            r4[r11] = r5
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r18 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r4 == 0) goto L_0x01e0
            java.lang.Object[] r13 = new java.lang.Object[r12]
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r2)
            r13[r11] = r4
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.newmedia.e.f2507a
            r16 = 1
            r17 = 18295(0x4777, float:2.5637E-41)
            java.lang.Class[] r2 = new java.lang.Class[r12]
            java.lang.Class r3 = java.lang.Long.TYPE
            r2[r11] = r3
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r18 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0209
        L_0x01e0:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L_0x01e5:
            r5 = 23
            long r13 = r2 % r5
            long r2 = r2 / r5
            r5 = 9
            int r8 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x01fc
            r5 = 97
            long r13 = r13 + r5
            r5 = 10
            long r13 = r13 - r5
            int r5 = (int) r13
            char r5 = (char) r5
            r4.insert(r11, r5)
            goto L_0x01ff
        L_0x01fc:
            r4.insert(r11, r13)
        L_0x01ff:
            r5 = 0
            int r8 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x01e5
            java.lang.String r2 = r4.toString()
        L_0x0209:
            r0.a((java.lang.String) r1, (java.lang.String) r2)
        L_0x020c:
            boolean r1 = com.ss.android.ugc.aweme.share.cc.a()
            if (r1 != 0) goto L_0x021b
            java.lang.String r1 = "iid"
            java.lang.String r2 = com.ss.android.d.d.a()
            r0.a((java.lang.String) r1, (java.lang.String) r2)
        L_0x021b:
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r1 = r7.f40721c
            java.lang.String r0 = r0.a()
            r1.url = r0
            goto L_0x022a
        L_0x0224:
            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r0 = r7.f40721c
            java.lang.String r1 = r7.f40723e
            r0.url = r1
        L_0x022a:
            java.lang.String r0 = "qrcode"
            java.lang.String r0 = r7.a((org.json.JSONObject) r9, (java.lang.String) r0)
            java.lang.String r1 = "sharetips"
            java.lang.String r1 = r7.a((org.json.JSONObject) r9, (java.lang.String) r1)
            r7.f40724f = r1
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0246
            java.lang.String r1 = "1"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x024d
        L_0x0246:
            java.util.List<java.lang.String> r0 = r7.f40722d
            java.lang.String r1 = "qrcode"
            r0.remove(r1)
        L_0x024d:
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f40719a
            r3 = 0
            r4 = 34219(0x85ab, float:4.7951E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x027f
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f40719a
            r3 = 0
            r4 = 34219(0x85ab, float:4.7951E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x02a7
        L_0x027f:
            java.lang.String r0 = "shareitems"
            java.lang.String r0 = r7.a((org.json.JSONObject) r9, (java.lang.String) r0)
            if (r0 == 0) goto L_0x02a7
            com.google.gson.Gson r1 = new com.google.gson.Gson
            r1.<init>()
            com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness$1 r2 = new com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness$1
            r2.<init>()
            java.lang.reflect.Type r2 = r2.getType()
            java.lang.Object r0 = r1.fromJson((java.lang.String) r0, (java.lang.reflect.Type) r2)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x02a7
            java.util.List<java.lang.String> r1 = r7.f40722d
            r1.clear()
            java.util.List<java.lang.String> r1 = r7.f40722d
            r1.addAll(r0)
        L_0x02a7:
            r20.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness.a(java.lang.String, org.json.JSONObject):void");
    }
}

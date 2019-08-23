package com.ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.f.a.a;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.feed.ao;
import com.ss.android.ugc.aweme.feed.share.i;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.share.ShareOrderService;
import com.ss.android.ugc.aweme.share.SimpleShareDialog;
import com.ss.android.ugc.aweme.share.ck;
import com.ss.android.ugc.aweme.utils.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.json.JSONObject;

public final class ai implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76692a;

    /* renamed from: b  reason: collision with root package name */
    final WeakReference<Context> f76693b;

    /* renamed from: c  reason: collision with root package name */
    public a f76694c;

    /* renamed from: d  reason: collision with root package name */
    private List<String> f76695d = new ArrayList(Arrays.asList(new String[]{"copylink", "qrcode", "browser", "refresh"}));

    private void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f76692a, false, 90030, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f76692a, false, 90030, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            List list = (List) new Gson().fromJson(str, new TypeToken<List<String>>() {
            }.getType());
            if (list != null) {
                this.f76695d.clear();
                this.f76695d.addAll(list);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005a, code lost:
        if (r0.equals("qq") != false) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String b(java.lang.String r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f76692a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = 0
            r5 = 1
            r6 = 90034(0x15fb2, float:1.26165E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f76692a
            r13 = 1
            r14 = 90034(0x15fb2, float:1.26165E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0037:
            r2 = -1
            int r3 = r17.hashCode()
            switch(r3) {
                case -929929834: goto L_0x0071;
                case -791575966: goto L_0x0067;
                case -427019145: goto L_0x005d;
                case 3616: goto L_0x0054;
                case 108102557: goto L_0x004a;
                case 113011944: goto L_0x0040;
                default: goto L_0x003f;
            }
        L_0x003f:
            goto L_0x007b
        L_0x0040:
            java.lang.String r1 = "weibo"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007b
            r1 = 4
            goto L_0x007c
        L_0x004a:
            java.lang.String r1 = "qzone"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007b
            r1 = 0
            goto L_0x007c
        L_0x0054:
            java.lang.String r3 = "qq"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x007b
            goto L_0x007c
        L_0x005d:
            java.lang.String r1 = "share_native"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007b
            r1 = 5
            goto L_0x007c
        L_0x0067:
            java.lang.String r1 = "weixin"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007b
            r1 = 2
            goto L_0x007c
        L_0x0071:
            java.lang.String r1 = "weixin_moments"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007b
            r1 = 3
            goto L_0x007c
        L_0x007b:
            r1 = -1
        L_0x007c:
            switch(r1) {
                case 0: goto L_0x0090;
                case 1: goto L_0x008d;
                case 2: goto L_0x008a;
                case 3: goto L_0x0087;
                case 4: goto L_0x0084;
                case 5: goto L_0x0081;
                default: goto L_0x007f;
            }
        L_0x007f:
            r0 = 0
            return r0
        L_0x0081:
            java.lang.String r0 = "share_native"
            return r0
        L_0x0084:
            java.lang.String r0 = "weibo"
            return r0
        L_0x0087:
            java.lang.String r0 = "weixin_moments"
            return r0
        L_0x008a:
            java.lang.String r0 = "weixin"
            return r0
        L_0x008d:
            java.lang.String r0 = "qq"
            return r0
        L_0x0090:
            java.lang.String r0 = "qzone"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.web.jsbridge.ai.b(java.lang.String):java.lang.String");
    }

    public ai(WeakReference<Context> weakReference, a aVar) {
        this.f76693b = weakReference;
        this.f76694c = null;
    }

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{hVar, jSONObject}, this, f76692a, false, 90027, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, jSONObject}, this, f76692a, false, 90027, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        boolean a2 = a(this.f76693b, hVar.f20623d, this.f76694c.f20612d.getUrl());
        if (jSONObject != null) {
            if (!a2) {
                i = -1;
            }
            jSONObject.put("code", i);
        }
    }

    public boolean a(WeakReference<Context> weakReference, JSONObject jSONObject, @Nullable String str) {
        IShareService.ShareStruct a2;
        JSONObject jSONObject2 = jSONObject;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{weakReference, jSONObject2, str}, this, f76692a, false, 90029, new Class[]{WeakReference.class, JSONObject.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{weakReference, jSONObject2, str}, this, f76692a, false, 90029, new Class[]{WeakReference.class, JSONObject.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (jSONObject2 == null) {
            return false;
        } else {
            String optString = jSONObject2.optString(PushConstants.TITLE);
            String optString2 = jSONObject2.optString("desc");
            String optString3 = jSONObject2.optString("image");
            String optString4 = jSONObject2.optString(PushConstants.WEB_URL);
            String optString5 = jSONObject2.optString("imagePath");
            String optString6 = jSONObject2.optString("type");
            String optString7 = jSONObject2.optString("innerUrl");
            jSONObject2.optString("tips");
            a(jSONObject2.optString("shareitems"));
            if (jSONObject2.optInt("qrcode") == 0) {
                this.f76695d.remove("qrcode");
            }
            List a3 = r.f75958b.a(jSONObject2.optJSONArray("shareEntriesForbidList"));
            JSONObject jSONObject3 = null;
            if (jSONObject2.has("logArgs")) {
                jSONObject3 = jSONObject2.optJSONObject("logArgs");
            }
            final JSONObject jSONObject4 = jSONObject3;
            com.ss.android.ugc.aweme.web.b.a.a aVar = r1;
            com.ss.android.ugc.aweme.web.b.a.a aVar2 = new com.ss.android.ugc.aweme.web.b.a.a(optString, optString2, optString3, optString4, optString5);
            String optString8 = jSONObject2.optString("platform");
            Context context = (Context) weakReference.get();
            String b2 = b(optString8);
            if (TextUtils.isEmpty(b2) || context == null) {
                return false;
            }
            final Activity a4 = v.a(context);
            if (a4 == null) {
                return false;
            }
            com.ss.android.ugc.aweme.web.b.a.a aVar3 = aVar;
            c.b(aVar3.f76621c);
            IShareService iShareService = (IShareService) ServiceManager.get().getService(IShareService.class);
            ck ckVar = new ck();
            if (TextUtils.equals(optString6, "local_img")) {
                a2 = i.b(context, aVar3);
                LinkedList linkedList = new LinkedList(Arrays.asList(((ShareOrderService) ServiceManager.get().getService(ShareOrderService.class)).getVideoShareList()));
                linkedList.remove("chat_merge");
                String[] strArr = new String[linkedList.size()];
                linkedList.toArray(strArr);
                ckVar.f64976e = strArr;
                ckVar.h = true;
                ckVar.j = true;
                ckVar.u = true;
            } else {
                a2 = i.a(context, aVar3);
                a2.itemType = "web";
                ckVar.h = true;
                ckVar.f64976e = ((ShareOrderService) ServiceManager.get().getService(ShareOrderService.class)).getUrlShareList(true);
            }
            IShareService.ShareStruct shareStruct = a2;
            ckVar.j = this.f76695d.contains("browser");
            ckVar.k = this.f76695d.contains("refresh");
            ckVar.h = !this.f76695d.contains("qrcode");
            ckVar.t = this.f76695d.contains("copylink");
            ckVar.a(a3);
            ckVar.y = optString7;
            ckVar.l = true;
            if (!TextUtils.equals(b2, "share_native")) {
                IShareService.ShareResult share = iShareService.share(a4, shareStruct, b2);
                if (share == null || !share.success) {
                    z = false;
                }
            } else {
                SimpleShareDialog simpleShareDialog = new SimpleShareDialog(a4, ckVar);
                simpleShareDialog.updateShareStruct(shareStruct);
                final IShareService.ShareStruct shareStruct2 = shareStruct;
                final Context context2 = context;
                final String str2 = str;
                final String str3 = optString7;
                AnonymousClass1 r0 = new IShareService.IActionHandler() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f76696a;

                    public final boolean checkStatus(String str) {
                        return true;
                    }

                    /* JADX WARNING: type inference failed for: r0v14, types: [android.content.Context] */
                    /* JADX WARNING: type inference failed for: r0v18, types: [android.content.Context] */
                    /* JADX WARNING: Multi-variable type inference failed */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final boolean onAction(com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct r21, java.lang.String r22) {
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
                            com.meituan.robust.ChangeQuickRedirect r2 = f76696a
                            java.lang.Class[] r5 = new java.lang.Class[r10]
                            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
                            r5[r11] = r1
                            java.lang.Class<java.lang.String> r1 = java.lang.String.class
                            r5[r12] = r1
                            java.lang.Class r6 = java.lang.Boolean.TYPE
                            r3 = 0
                            r4 = 90035(0x15fb3, float:1.26166E-40)
                            r1 = r20
                            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                            if (r0 == 0) goto L_0x004e
                            java.lang.Object[] r0 = new java.lang.Object[r10]
                            r0[r11] = r8
                            r0[r12] = r9
                            com.meituan.robust.ChangeQuickRedirect r2 = f76696a
                            r3 = 0
                            r4 = 90035(0x15fb3, float:1.26166E-40)
                            java.lang.Class[] r5 = new java.lang.Class[r10]
                            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
                            r5[r11] = r1
                            java.lang.Class<java.lang.String> r1 = java.lang.String.class
                            r5[r12] = r1
                            java.lang.Class r6 = java.lang.Boolean.TYPE
                            r1 = r20
                            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                            java.lang.Boolean r0 = (java.lang.Boolean) r0
                            boolean r0 = r0.booleanValue()
                            return r0
                        L_0x004e:
                            java.lang.String r0 = "copy"
                            boolean r0 = android.text.TextUtils.equals(r0, r9)
                            if (r0 == 0) goto L_0x0080
                            android.app.Activity r0 = r2
                            java.lang.String r1 = "clipboard"
                            java.lang.Object r0 = r0.getSystemService(r1)
                            android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0
                            com.ss.android.ugc.aweme.n r1 = com.ss.android.ugc.aweme.u.a()
                            java.lang.String r2 = r8.url
                            boolean r3 = r8.boolPersist
                            java.lang.String r1 = r1.a((java.lang.String) r2, (boolean) r3)
                            android.content.ClipData r1 = android.content.ClipData.newPlainText(r1, r1)
                            r0.setPrimaryClip(r1)
                            android.app.Activity r0 = r2
                            r1 = 2131559505(0x7f0d0451, float:1.8744356E38)
                            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.a((android.content.Context) r0, (int) r1)
                            r0.a()
                            return r12
                        L_0x0080:
                            boolean r0 = com.ss.android.g.a.a()
                            r1 = 0
                            if (r0 != 0) goto L_0x018d
                            java.lang.String r0 = "qr_code"
                            boolean r0 = android.text.TextUtils.equals(r9, r0)
                            if (r0 == 0) goto L_0x018d
                            com.ss.android.ugc.aweme.web.jsbridge.ai r0 = com.ss.android.ugc.aweme.web.jsbridge.ai.this
                            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r2 = r3
                            java.lang.Object[] r13 = new java.lang.Object[r12]
                            r13[r11] = r2
                            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.web.jsbridge.ai.f76692a
                            r16 = 0
                            r17 = 90031(0x15faf, float:1.2616E-40)
                            java.lang.Class[] r3 = new java.lang.Class[r12]
                            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r4 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
                            r3[r11] = r4
                            java.lang.Class r19 = java.lang.Boolean.TYPE
                            r14 = r0
                            r18 = r3
                            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
                            if (r3 == 0) goto L_0x00d0
                            java.lang.Object[] r13 = new java.lang.Object[r12]
                            r13[r11] = r2
                            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.web.jsbridge.ai.f76692a
                            r16 = 0
                            r17 = 90031(0x15faf, float:1.2616E-40)
                            java.lang.Class[] r2 = new java.lang.Class[r12]
                            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r3 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
                            r2[r11] = r3
                            java.lang.Class r19 = java.lang.Boolean.TYPE
                            r14 = r0
                            r18 = r2
                            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
                            java.lang.Boolean r0 = (java.lang.Boolean) r0
                            boolean r0 = r0.booleanValue()
                            goto L_0x00eb
                        L_0x00d0:
                            java.lang.String r0 = r2.url
                            boolean r0 = android.text.TextUtils.isEmpty(r0)
                            if (r0 != 0) goto L_0x00ea
                            java.lang.String r0 = r2.thumbUrl
                            boolean r0 = android.text.TextUtils.isEmpty(r0)
                            if (r0 != 0) goto L_0x00ea
                            java.lang.String r0 = r2.description
                            boolean r0 = android.text.TextUtils.isEmpty(r0)
                            if (r0 != 0) goto L_0x00ea
                            r0 = 1
                            goto L_0x00eb
                        L_0x00ea:
                            r0 = 0
                        L_0x00eb:
                            if (r0 != 0) goto L_0x00ee
                            return r12
                        L_0x00ee:
                            com.ss.android.ugc.aweme.web.jsbridge.ai r0 = com.ss.android.ugc.aweme.web.jsbridge.ai.this
                            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r2 = r3
                            r3 = 3
                            java.lang.Object[] r13 = new java.lang.Object[r3]
                            r13[r11] = r2
                            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
                            r13[r12] = r4
                            r13[r10] = r1
                            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.web.jsbridge.ai.f76692a
                            r16 = 0
                            r17 = 90032(0x15fb0, float:1.26162E-40)
                            java.lang.Class[] r4 = new java.lang.Class[r3]
                            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r5 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
                            r4[r11] = r5
                            java.lang.Class r5 = java.lang.Integer.TYPE
                            r4[r12] = r5
                            java.lang.Class<java.lang.String> r5 = java.lang.String.class
                            r4[r10] = r5
                            java.lang.Class r19 = java.lang.Void.TYPE
                            r14 = r0
                            r18 = r4
                            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
                            if (r4 == 0) goto L_0x0149
                            java.lang.Object[] r13 = new java.lang.Object[r3]
                            r13[r11] = r2
                            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
                            r13[r12] = r2
                            r13[r10] = r1
                            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.web.jsbridge.ai.f76692a
                            r16 = 0
                            r17 = 90032(0x15fb0, float:1.26162E-40)
                            java.lang.Class[] r1 = new java.lang.Class[r3]
                            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r2 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
                            r1[r11] = r2
                            java.lang.Class r2 = java.lang.Integer.TYPE
                            r1[r12] = r2
                            java.lang.Class<java.lang.String> r2 = java.lang.String.class
                            r1[r10] = r2
                            java.lang.Class r19 = java.lang.Void.TYPE
                            r14 = r0
                            r18 = r1
                            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
                            goto L_0x018c
                        L_0x0149:
                            java.lang.String r1 = r2.description
                            boolean r1 = android.text.TextUtils.isEmpty(r1)
                            if (r1 != 0) goto L_0x015f
                            java.lang.String r1 = r2.description
                            java.lang.String r3 = " "
                            boolean r1 = android.text.TextUtils.equals(r1, r3)
                            if (r1 == 0) goto L_0x015c
                            goto L_0x015f
                        L_0x015c:
                            java.lang.String r1 = r2.description
                            goto L_0x0161
                        L_0x015f:
                            java.lang.String r1 = r2.title
                        L_0x0161:
                            r2.description = r1
                            java.lang.ref.WeakReference<android.content.Context> r0 = r0.f76693b
                            java.lang.Object r0 = r0.get()
                            android.content.Context r0 = (android.content.Context) r0
                            if (r0 == 0) goto L_0x018c
                            boolean r1 = r0 instanceof android.app.Activity
                            if (r1 == 0) goto L_0x018c
                            com.ss.android.ugc.aweme.web.QRCodeWebViewDialog r1 = new com.ss.android.ugc.aweme.web.QRCodeWebViewDialog
                            r14 = r0
                            android.app.Activity r14 = (android.app.Activity) r14
                            r15 = 0
                            java.lang.String r0 = r2.url
                            java.lang.String r3 = r2.thumbUrl
                            java.lang.String r2 = r2.description
                            r19 = 0
                            r13 = r1
                            r16 = r0
                            r17 = r3
                            r18 = r2
                            r13.<init>(r14, r15, r16, r17, r18, r19)
                            r1.show()
                        L_0x018c:
                            return r12
                        L_0x018d:
                            java.lang.String r0 = "REFRESH"
                            boolean r0 = android.text.TextUtils.equals(r9, r0)
                            if (r0 == 0) goto L_0x01a5
                            com.ss.android.ugc.aweme.web.jsbridge.ai r0 = com.ss.android.ugc.aweme.web.jsbridge.ai.this
                            com.bytedance.ies.f.a.a r0 = r0.f76694c
                            if (r0 == 0) goto L_0x01a4
                            com.ss.android.ugc.aweme.web.jsbridge.ai r0 = com.ss.android.ugc.aweme.web.jsbridge.ai.this
                            com.bytedance.ies.f.a.a r0 = r0.f76694c
                            android.webkit.WebView r0 = r0.f20612d
                            r0.reload()
                        L_0x01a4:
                            return r12
                        L_0x01a5:
                            java.lang.String r0 = "OPEN_IN_BROWSER"
                            boolean r0 = android.text.TextUtils.equals(r9, r0)
                            if (r0 == 0) goto L_0x01df
                            android.content.Context r0 = r4
                            boolean r0 = r0 instanceof com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity
                            if (r0 == 0) goto L_0x01b8
                            android.content.Context r0 = r4
                            r1 = r0
                            android.app.Activity r1 = (android.app.Activity) r1
                        L_0x01b8:
                            if (r1 == 0) goto L_0x01de
                            android.content.Intent r0 = new android.content.Intent
                            r0.<init>()
                            java.lang.String r2 = "android.intent.action.VIEW"
                            r0.setAction(r2)
                            com.ss.android.ugc.aweme.n r2 = com.ss.android.ugc.aweme.u.a()
                            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r3 = r3
                            java.lang.String r3 = r3.url
                            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r4 = r3
                            boolean r4 = r4.boolPersist
                            java.lang.String r2 = r2.a((java.lang.String) r3, (boolean) r4)
                            android.net.Uri r2 = android.net.Uri.parse(r2)
                            r0.setData(r2)
                            r1.startActivity(r0)
                        L_0x01de:
                            return r12
                        L_0x01df:
                            java.lang.String r0 = "chat_merge"
                            boolean r0 = android.text.TextUtils.equals(r9, r0)
                            if (r0 == 0) goto L_0x01fe
                            android.content.Context r0 = r4
                            boolean r0 = r0 instanceof com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity
                            if (r0 == 0) goto L_0x01f2
                            android.content.Context r0 = r4
                            r1 = r0
                            android.app.Activity r1 = (android.app.Activity) r1
                        L_0x01f2:
                            if (r1 == 0) goto L_0x01fd
                            com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct r0 = r3
                            java.lang.String r2 = r5
                            java.lang.String r3 = r6
                            com.ss.android.ugc.aweme.web.jsbridge.ai.a(r1, r0, r2, r3)
                        L_0x01fd:
                            return r12
                        L_0x01fe:
                            return r11
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.web.jsbridge.ai.AnonymousClass1.onAction(com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct, java.lang.String):boolean");
                    }
                };
                simpleShareDialog.setActionHandler(r0);
                simpleShareDialog.setShareCallback(new IShareService.OnShareCallback() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f76702a;

                    public final void onShareComplete(IShareService.ShareResult shareResult) {
                        if (PatchProxy.isSupport(new Object[]{shareResult}, this, f76702a, false, 90036, new Class[]{IShareService.ShareResult.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{shareResult}, this, f76702a, false, 90036, new Class[]{IShareService.ShareResult.class}, Void.TYPE);
                            return;
                        }
                        if (jSONObject4 != null) {
                            com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName(jSONObject4.optString("tag")).setLabelName(shareResult.type).setValue(jSONObject4.optString("value")).setJsonObject(jSONObject4.optJSONObject("extras")));
                        }
                        if (shareResult != null) {
                            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
                            a2.a("enter_from", "h5_page");
                            a2.a("platform", shareResult.type);
                            com.ss.android.ugc.aweme.common.r.a("h5_share", (Map) a2.f34114b);
                        }
                    }
                });
                simpleShareDialog.show();
            }
            if (!z) {
                if (TextUtils.equals(b2, "weixin") || TextUtils.equals(b2, "weixin_moments")) {
                    com.bytedance.ies.dmt.ui.d.a.b(context, (int) C0906R.string.dtl).a();
                } else if (TextUtils.equals(b2, "qq") || TextUtils.equals(b2, "qzone")) {
                    com.bytedance.ies.dmt.ui.d.a.b(context, (int) C0906R.string.bu8).a();
                } else if (TextUtils.equals(b2, "weibo")) {
                    com.bytedance.ies.dmt.ui.d.a.b(context, (int) C0906R.string.dt_).a();
                }
            }
            return z;
        }
    }

    public static boolean a(Activity activity, IShareService.ShareStruct shareStruct, String str, String str2) {
        Activity activity2 = activity;
        IShareService.ShareStruct shareStruct2 = shareStruct;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{activity2, shareStruct2, str3, str4}, null, f76692a, true, 90033, new Class[]{Activity.class, IShareService.ShareStruct.class, String.class, String.class}, Boolean.TYPE)) {
            Object[] objArr = {activity2, shareStruct2, str3, str4};
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, f76692a, true, 90033, new Class[]{Activity.class, IShareService.ShareStruct.class, String.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
            e.a(activity2, "", "click_shareim_button");
            return true;
        } else {
            if (!TextUtils.isEmpty(str2)) {
                shareStruct2.url = str4;
            } else if (!TextUtils.isEmpty(str)) {
                shareStruct2.url = str3;
            }
            Bundle bundle = new Bundle();
            bundle.putSerializable("share_struct", shareStruct2);
            b.a().enterChooseContact(activity2, bundle, null);
            ao.a("chat_merge");
            return true;
        }
    }
}

package com.alimama.tunion.sdk.jump;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import com.alimama.tunion.sdk.TUnionSDK;
import com.alimama.tunion.sdk.b.b;
import com.alimama.tunion.sdk.jump.page.ITUnionJumpPage;
import com.alimama.tunion.sdk.service.ITUnionJumpService;
import com.alimama.tunion.trade.TUnionTradeSDK;
import com.alimama.tunion.trade.base.ITUnionAppLink;
import com.alimama.tunion.trade.base.ITUnionWebView;
import com.alimama.tunion.trade.convert.TUnionConvertCallback;
import com.alimama.tunion.trade.convert.TUnionJumpType;
import com.alimama.tunion.trade.convert.TUnionMediaParams;
import com.alimama.tunion.utils.TULog;

public class a implements ITUnionJumpService {

    /* renamed from: com.alimama.tunion.sdk.jump.a$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5168a = new int[TUnionJumpType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.alimama.tunion.trade.convert.TUnionJumpType[] r0 = com.alimama.tunion.trade.convert.TUnionJumpType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5168a = r0
                int[] r0 = f5168a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.alimama.tunion.trade.convert.TUnionJumpType r1 = com.alimama.tunion.trade.convert.TUnionJumpType.NATIVE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f5168a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.alimama.tunion.trade.convert.TUnionJumpType r1 = com.alimama.tunion.trade.convert.TUnionJumpType.H5     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f5168a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.alimama.tunion.trade.convert.TUnionJumpType r1 = com.alimama.tunion.trade.convert.TUnionJumpType.BROWSER     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alimama.tunion.sdk.jump.a.AnonymousClass2.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public boolean a(Context context, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public boolean a(ITUnionWebView iTUnionWebView, String str) {
        if (iTUnionWebView == null) {
            return false;
        }
        iTUnionWebView.loadUrl(str);
        return true;
    }

    /* access modifiers changed from: private */
    public boolean a(Context context, String str, String str2) {
        ITUnionAppLink iTUnionAppLink = TUnionTradeSDK.getInstance().getITUnionAppLink();
        if (iTUnionAppLink != null) {
            if (!iTUnionAppLink.jumpTBURI(context, str, str2)) {
                TULog.d("TUnionUtils.jumpTaobao error", new Object[0]);
            } else {
                TULog.d("TUnionUtils.jumpTaobao success", new Object[0]);
                return true;
            }
        }
        return false;
    }

    public boolean onJsPrompt(String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (str3 == null) {
            return false;
        }
        if (str3.equals("wv_hybrid:")) {
            jsPromptResult.confirm("");
            return true;
        } else if (!TextUtils.equals(str3, "hv_hybrid:")) {
            return false;
        } else {
            jsPromptResult.confirm("");
            return true;
        }
    }

    public void show(Context context, TUnionJumpType tUnionJumpType, ITUnionWebView iTUnionWebView, ITUnionJumpPage iTUnionJumpPage, String str, TUnionMediaParams tUnionMediaParams, TUnionJumpCallback tUnionJumpCallback) {
        String str2;
        ITUnionWebView iTUnionWebView2 = iTUnionWebView;
        if (iTUnionJumpPage != null) {
            str2 = iTUnionJumpPage.a();
        } else {
            str2 = null;
        }
        String str3 = str2;
        if (iTUnionWebView2 != null) {
            String userAgent = iTUnionWebView.getUserAgent();
            if (TextUtils.isEmpty(userAgent)) {
                iTUnionWebView.setUserAgent(TUnionSDK.getInstance().getUA());
            } else if (!userAgent.contains(TUnionSDK.getInstance().getUA())) {
                iTUnionWebView.setUserAgent(userAgent + " " + TUnionSDK.getInstance().getUA());
            }
        }
        b.a.a();
        TUnionTradeSDK instance = TUnionTradeSDK.getInstance();
        final Context context2 = context;
        final String str4 = str;
        final ITUnionWebView iTUnionWebView3 = iTUnionWebView;
        final TUnionJumpCallback tUnionJumpCallback2 = tUnionJumpCallback;
        AnonymousClass1 r0 = new TUnionConvertCallback() {
            /* JADX WARNING: Can't fix incorrect switch cases order */
            /* JADX WARNING: Code restructure failed: missing block: B:25:0x007d, code lost:
                r6 = r1;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onResult(com.alimama.tunion.trade.convert.TUnionConvertResult r6) {
                /*
                    r5 = this;
                    if (r6 == 0) goto L_0x009d
                    com.alimama.tunion.trade.convert.TUnionJumpType r0 = r6.getJumpType()
                    java.lang.String r6 = r6.getResultUrl()
                    int[] r1 = com.alimama.tunion.sdk.jump.a.AnonymousClass2.f5168a
                    int r2 = r0.ordinal()
                    r1 = r1[r2]
                    r2 = 0
                    switch(r1) {
                        case 1: goto L_0x004d;
                        case 2: goto L_0x002d;
                        case 3: goto L_0x0019;
                        default: goto L_0x0016;
                    }
                L_0x0016:
                    r6 = 0
                    goto L_0x007e
                L_0x0019:
                    com.alimama.tunion.sdk.jump.a r1 = com.alimama.tunion.sdk.jump.a.this
                    android.content.Context r3 = r2
                    boolean r6 = r1.a((android.content.Context) r3, (java.lang.String) r6)
                    if (r6 == 0) goto L_0x0027
                    com.alimama.tunion.sdk.b.b.a.a((com.alimama.tunion.trade.convert.TUnionJumpType) r0)
                    goto L_0x007e
                L_0x0027:
                    java.lang.String r1 = "jump browser failed"
                    com.alimama.tunion.sdk.b.b.a.a((java.lang.String) r1)
                    goto L_0x007e
                L_0x002d:
                    com.alimama.tunion.sdk.jump.a r1 = com.alimama.tunion.sdk.jump.a.this
                    com.alimama.tunion.trade.base.ITUnionWebView r3 = r4
                    boolean r1 = r1.a((com.alimama.tunion.trade.base.ITUnionWebView) r3, (java.lang.String) r6)
                    if (r1 != 0) goto L_0x0049
                    com.alimama.tunion.sdk.jump.a r1 = com.alimama.tunion.sdk.jump.a.this
                    android.content.Context r3 = r2
                    boolean r6 = r1.a((android.content.Context) r3, (java.lang.String) r6)
                    if (r6 == 0) goto L_0x0043
                    com.alimama.tunion.trade.convert.TUnionJumpType r0 = com.alimama.tunion.trade.convert.TUnionJumpType.BROWSER
                L_0x0043:
                    java.lang.String r1 = "jump webview failed"
                    com.alimama.tunion.sdk.b.b.a.a((java.lang.String) r1)
                    goto L_0x007e
                L_0x0049:
                    com.alimama.tunion.sdk.b.b.a.a((com.alimama.tunion.trade.convert.TUnionJumpType) r0)
                    goto L_0x007d
                L_0x004d:
                    com.alimama.tunion.sdk.jump.a r1 = com.alimama.tunion.sdk.jump.a.this
                    android.content.Context r3 = r2
                    java.lang.String r4 = r3
                    boolean r1 = r1.a((android.content.Context) r3, (java.lang.String) r6, (java.lang.String) r4)
                    if (r1 != 0) goto L_0x007a
                    com.alimama.tunion.sdk.jump.a r1 = com.alimama.tunion.sdk.jump.a.this
                    com.alimama.tunion.trade.base.ITUnionWebView r3 = r4
                    boolean r1 = r1.a((com.alimama.tunion.trade.base.ITUnionWebView) r3, (java.lang.String) r6)
                    if (r1 != 0) goto L_0x0070
                    com.alimama.tunion.sdk.jump.a r1 = com.alimama.tunion.sdk.jump.a.this
                    android.content.Context r3 = r2
                    boolean r6 = r1.a((android.content.Context) r3, (java.lang.String) r6)
                    if (r6 == 0) goto L_0x0074
                    com.alimama.tunion.trade.convert.TUnionJumpType r0 = com.alimama.tunion.trade.convert.TUnionJumpType.BROWSER
                    goto L_0x0074
                L_0x0070:
                    com.alimama.tunion.trade.convert.TUnionJumpType r6 = com.alimama.tunion.trade.convert.TUnionJumpType.H5
                    r0 = r6
                    r6 = r1
                L_0x0074:
                    java.lang.String r1 = "jump Native failed"
                    com.alimama.tunion.sdk.b.b.a.a((java.lang.String) r1)
                    goto L_0x007e
                L_0x007a:
                    com.alimama.tunion.sdk.b.b.a.a((com.alimama.tunion.trade.convert.TUnionJumpType) r0)
                L_0x007d:
                    r6 = r1
                L_0x007e:
                    com.alimama.tunion.sdk.jump.TUnionJumpCallback r1 = r5
                    if (r1 == 0) goto L_0x009d
                    if (r6 == 0) goto L_0x008a
                    com.alimama.tunion.sdk.jump.TUnionJumpCallback r6 = r5
                    r6.onSuccess(r0)
                    return
                L_0x008a:
                    com.alimama.tunion.sdk.jump.TUnionJumpCallback r6 = r5
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r3 = "fail jumpType is "
                    r1.<init>(r3)
                    r1.append(r0)
                    java.lang.String r0 = r1.toString()
                    r6.onFailure(r2, r0)
                L_0x009d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.alimama.tunion.sdk.jump.a.AnonymousClass1.onResult(com.alimama.tunion.trade.convert.TUnionConvertResult):void");
            }
        };
        instance.convertURL(tUnionJumpType, iTUnionWebView, str3, tUnionMediaParams, r0);
    }
}

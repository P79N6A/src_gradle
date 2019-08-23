package com.ss.android.ugc.aweme.wxapi;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.w;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import org.json.JSONObject;

public class WXEntryActivity extends Activity implements IWXAPIEventHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76935a;

    /* renamed from: b  reason: collision with root package name */
    private static a f76936b;

    public interface a {
        void a(String str);

        void c(int i, String str);

        void h();
    }

    public void onReq(BaseReq baseReq) {
    }

    public static void a(a aVar) {
        f76936b = aVar;
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f76935a, false, 90151, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f76935a, false, 90151, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        w.d().handleIntent(getIntent(), this);
    }

    public void onResp(BaseResp baseResp) {
        BaseResp baseResp2 = baseResp;
        if (PatchProxy.isSupport(new Object[]{baseResp2}, this, f76935a, false, 90152, new Class[]{BaseResp.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseResp2}, this, f76935a, false, 90152, new Class[]{BaseResp.class}, Void.TYPE);
            return;
        }
        int type = baseResp.getType();
        String str = "";
        int i = baseResp2.errCode;
        if (i != -4) {
            if (i != -2) {
                if (i == 0) {
                    if (type == 1) {
                        String str2 = ((SendAuth.Resp) baseResp2).code;
                        if (f76936b != null) {
                            f76936b.a(str2);
                        }
                    } else if (type == 19 && (baseResp2 instanceof WXLaunchMiniProgram.Resp)) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("errorCode", baseResp2.errCode);
                        bundle.putString("miniProgramExtMsg", ((WXLaunchMiniProgram.Resp) baseResp2).extMsg);
                        w.g().a("weixin", bundle);
                    }
                }
            } else if (type == 1) {
                if (f76936b != null) {
                    f76936b.h();
                }
            } else if (type == 2) {
                str = getString(C0906R.string.dpw);
            }
            if (type != 1) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("platform", "weixin");
                    jSONObject.put("platform", "");
                    if (baseResp2.errCode == -1) {
                        com.ss.android.ugc.aweme.account.login.loginlog.a a2 = com.ss.android.ugc.aweme.account.login.loginlog.a.a();
                        a2.a("authorize denied " + baseResp2.errCode, "", false, "weixin", w.h());
                        n.a("authorize denied " + baseResp2.errCode, 2, jSONObject);
                    } else {
                        com.ss.android.ugc.aweme.account.login.loginlog.a a3 = com.ss.android.ugc.aweme.account.login.loginlog.a.a();
                        a3.a("authorized failed " + baseResp2.errCode, "", false, "weixin", w.h());
                        n.a("authorized failed", 1, jSONObject);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) this, str, 0).a();
                    }
                } catch (Exception unused) {
                }
            }
            if (f76936b != null) {
                f76936b.c(baseResp2.errCode, str);
            }
        } else if (f76936b != null) {
            f76936b.c(baseResp2.errCode, "user refused");
        }
        if (type == 19 && com.ss.android.ugc.aweme.commerce.service.m.a.f38169a != null) {
            com.ss.android.ugc.aweme.commerce.service.m.a.f38169a.a(baseResp2);
        }
        finish();
    }
}

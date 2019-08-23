package com.ss.android.ugc.aweme.miniapp_api;

import android.app.Activity;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.miniapp_api.model.c;
import com.ss.android.ugc.aweme.miniapp_api.model.k;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55976a;
    private static volatile a i;

    /* renamed from: b  reason: collision with root package name */
    public k f55977b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, Boolean> f55978c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public String f55979d;

    /* renamed from: e  reason: collision with root package name */
    public String f55980e;

    /* renamed from: f  reason: collision with root package name */
    public JSONObject f55981f;
    public C0642a g;
    public c h;

    /* renamed from: com.ss.android.ugc.aweme.miniapp_api.a$a  reason: collision with other inner class name */
    public interface C0642a {
        void a();
    }

    private a() {
    }

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f55976a, true, 59632, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f55976a, true, 59632, new Class[0], a.class);
        }
        if (i == null) {
            synchronized (a.class) {
                if (i == null) {
                    i = new a();
                }
            }
        }
        return i;
    }

    public final void a(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f55976a, false, 59633, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f55976a, false, 59633, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        if (this.h != null) {
            Intent intent = new Intent();
            intent.putExtra("pay_key_result_params", this.h);
            activity.setResult(-1, intent);
        }
    }
}

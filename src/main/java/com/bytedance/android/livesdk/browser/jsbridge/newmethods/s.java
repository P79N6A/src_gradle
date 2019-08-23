package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.ProgressDialog;
import android.support.annotation.NonNull;
import com.bytedance.android.livesdk.utils.af;
import com.bytedance.ies.f.b.c;
import com.bytedance.ies.f.b.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class s extends c<JSONObject, Object> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9614a;

    /* renamed from: b  reason: collision with root package name */
    ProgressDialog f9615b;

    /* renamed from: c  reason: collision with root package name */
    private Disposable f9616c;

    public final void d_() {
        if (PatchProxy.isSupport(new Object[0], this, f9614a, false, 3695, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9614a, false, 3695, new Class[0], Void.TYPE);
            return;
        }
        if (this.f9616c != null) {
            this.f9616c.dispose();
        }
        if (this.f9615b != null) {
            this.f9615b.dismiss();
        }
    }

    public final /* synthetic */ void a(@NonNull Object obj, @NonNull f fVar) throws Exception {
        JSONObject jSONObject = (JSONObject) obj;
        if (PatchProxy.isSupport(new Object[]{jSONObject, fVar}, this, f9614a, false, 3694, new Class[]{JSONObject.class, f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, fVar}, this, f9614a, false, 3694, new Class[]{JSONObject.class, f.class}, Void.TYPE);
            return;
        }
        String string = jSONObject.getString("type");
        JSONObject jSONObject2 = jSONObject.getJSONObject("args");
        char c2 = 65535;
        int hashCode = string.hashCode();
        if (hashCode != 3529469) {
            if (hashCode == 1671672458 && string.equals("dismiss")) {
                c2 = 1;
            }
        } else if (string.equals("show")) {
            c2 = 0;
        }
        switch (c2) {
            case 0:
                if (this.f9615b != null) {
                    this.f9615b.dismiss();
                }
                this.f9615b = af.b(fVar.f20640a, jSONObject2.getString("message"));
                this.f9615b.setCancelable(false);
                this.f9615b.show();
                this.f9616c = Single.timer(8, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new t(this), u.f9620b);
                break;
            case 1:
                if (this.f9616c != null) {
                    this.f9616c.dispose();
                }
                if (this.f9615b != null) {
                    this.f9615b.dismiss();
                }
                this.f9616c = null;
                this.f9615b = null;
                break;
        }
        c();
    }
}

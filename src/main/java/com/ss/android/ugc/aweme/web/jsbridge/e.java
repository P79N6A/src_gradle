package com.ss.android.ugc.aweme.web.jsbridge;

import a.g;
import a.i;
import android.content.Context;
import com.bytedance.ies.f.a.a;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76773a;

    /* renamed from: b  reason: collision with root package name */
    public a f76774b;

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<Context> f76775c;

    public e(WeakReference<Context> weakReference, a aVar) {
        this.f76775c = weakReference;
        this.f76774b = aVar;
    }

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2, jSONObject}, this, f76773a, false, 89936, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2, jSONObject}, this, f76773a, false, 89936, new Class[]{h.class, JSONObject.class}, Void.TYPE);
        } else if (hVar2 != null && hVar2.f20623d != null) {
            hVar2.f20625f = false;
            float scale = this.f76774b.f20612d.getScale();
            int i = (int) (((float) hVar2.f20623d.getInt("width")) * scale);
            int i2 = (int) (((float) hVar2.f20623d.getInt("height")) * scale);
            int i3 = (int) (((float) hVar2.f20623d.getInt("left")) * scale);
            int i4 = (int) (((float) hVar2.f20623d.getInt("top")) * scale);
            int optInt = hVar2.f20623d.optInt("format", 0);
            final String str = hVar2.f20621b;
            int i5 = optInt;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(optInt), str}, this, f76773a, false, 89937, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), str}, this, f76773a, false, 89937, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            } else if (this.f76774b != null && this.f76774b.f20612d != null) {
                f fVar = new f(this, i, i2, i3, i4);
                i.a((Callable<TResult>) fVar, i.f1052b).a((g<TResult, TContinuationResult>) new g<TResult,TContinuationResult>(i5), (Executor) i.f1051a).a((g<TResult, TContinuationResult>) new g<JSONObject, Void>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f76776a;

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Void then(i<JSONObject> iVar) throws Exception {
                        if (PatchProxy.isSupport(new Object[]{iVar}, this, f76776a, false, 89940, new Class[]{i.class}, Void.class)) {
                            return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f76776a, false, 89940, new Class[]{i.class}, Void.class);
                        }
                        if (iVar.e() != null) {
                            e.this.f76774b.a(str, (JSONObject) iVar.e());
                        }
                        return null;
                    }
                }, i.f1052b);
            }
        }
    }
}

package com.ss.android.ugc.aweme.fe.method;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.f.a.a;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.downloadad.api.a.a;
import com.ss.android.downloadad.api.a.b;
import com.ss.android.ugc.aweme.app.c.b.d;
import com.ss.android.ugc.aweme.app.c.b.e;
import com.ss.android.ugc.aweme.app.c.b.f;
import com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction;
import com.ss.android.ugc.aweme.fe.b.c;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.utils.bg;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

public class JsAppDownloadMethod extends BaseCommonJavaMethod implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3127a;

    /* renamed from: b  reason: collision with root package name */
    private e f3128b;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3127a, false, 39778, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3127a, false, 39778, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f3128b == null || this.f3123e == null || this.f3123e.get() == null)) {
            e eVar = this.f3128b;
            if (PatchProxy.isSupport(new Object[0], eVar, e.f34042a, false, 23430, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], eVar, e.f34042a, false, 23430, new Class[0], Void.TYPE);
            } else {
                eVar.f34044c.b();
            }
            this.f3128b = null;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f3127a, false, 39777, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3127a, false, 39777, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3128b != null) {
            e eVar = this.f3128b;
            if (PatchProxy.isSupport(new Object[0], eVar, e.f34042a, false, 23429, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], eVar, e.f34042a, false, 23429, new Class[0], Void.TYPE);
                return;
            }
            eVar.f34044c.a();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3127a, false, 39776, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3127a, false, 39776, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f3128b == null || this.f3123e == null || this.f3123e.get() == null)) {
            e eVar = this.f3128b;
            Context context = (Context) this.f3123e.get();
            if (PatchProxy.isSupport(new Object[]{context}, eVar, e.f34042a, false, 23428, new Class[]{Context.class}, Void.TYPE)) {
                e eVar2 = eVar;
                PatchProxy.accessDispatch(new Object[]{context}, eVar2, e.f34042a, false, 23428, new Class[]{Context.class}, Void.TYPE);
                return;
            }
            eVar.f34044c.a(context);
        }
    }

    public JsAppDownloadMethod(a aVar) {
        super(aVar);
    }

    public JsAppDownloadMethod(ReactContext reactContext) {
        super(reactContext);
    }

    public final BaseCommonJavaMethod a(WeakReference<Context> weakReference) {
        if (PatchProxy.isSupport(new Object[]{weakReference}, this, f3127a, false, 39774, new Class[]{WeakReference.class}, BaseCommonJavaMethod.class)) {
            return (BaseCommonJavaMethod) PatchProxy.accessDispatch(new Object[]{weakReference}, this, f3127a, false, 39774, new Class[]{WeakReference.class}, BaseCommonJavaMethod.class);
        }
        Context context = (Context) weakReference.get();
        if (context instanceof LifecycleOwner) {
            ((LifecycleOwner) context).getLifecycle().addObserver(this);
        }
        return super.a(weakReference);
    }

    public final void a(String str, JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{str, jSONObject}, this, f3127a, false, 39779, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, jSONObject}, this, f3127a, false, 39779, new Class[]{String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        if (this.f3124f != null) {
            this.f3124f.b(str, jSONObject);
        }
        if (this.f3122d != null) {
            try {
                com.ss.android.ugc.aweme.framework.e.a((ReactContext) this.f3122d.get(), str, c.a(jSONObject));
            } catch (JSONException unused) {
            }
        }
    }

    public final void a(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        com.ss.android.downloadad.api.a.a a2;
        b a3;
        e eVar;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, aVar}, this, f3127a, false, 39775, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2, aVar}, this, f3127a, false, 39775, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
        } else if (this.f3123e != null && this.f3123e.get() != null) {
            if (PatchProxy.isSupport(new Object[0], this, f3127a, false, 39780, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3127a, false, 39780, new Class[0], Void.TYPE);
            } else if (this.f3128b == null) {
                Context context = (Context) this.f3123e.get();
                if (PatchProxy.isSupport(new Object[]{context, this}, null, e.f34042a, true, 23427, new Class[]{Context.class, f.class}, e.class)) {
                    eVar = (e) PatchProxy.accessDispatch(new Object[]{context, this}, null, e.f34042a, true, 23427, new Class[]{Context.class, f.class}, e.class);
                } else {
                    eVar = new e(context, this);
                }
                this.f3128b = eVar;
            }
            String optString = jSONObject2.optString("func");
            if (TextUtils.equals("subscribe_app_ad", optString)) {
                e eVar2 = this.f3128b;
                Context context2 = (Context) this.f3123e.get();
                if (PatchProxy.isSupport(new Object[]{context2, jSONObject2}, eVar2, e.f34042a, false, 23431, new Class[]{Context.class, JSONObject.class}, Void.TYPE)) {
                    e eVar3 = eVar2;
                    PatchProxy.accessDispatch(new Object[]{context2, jSONObject2}, eVar3, e.f34042a, false, 23431, new Class[]{Context.class, JSONObject.class}, Void.TYPE);
                } else if (!(context2 == null || jSONObject2 == null)) {
                    JSONObject optJSONObject = jSONObject2.optJSONObject("data");
                    d dVar = new d();
                    dVar.a(optJSONObject);
                    eVar2.f34044c.a(context2, d.a(dVar), optJSONObject);
                }
            } else if (TextUtils.equals("unsubscribe_app_ad", optString)) {
                if (this.f3128b != null) {
                    e eVar4 = this.f3128b;
                    if (PatchProxy.isSupport(new Object[]{jSONObject2}, eVar4, e.f34042a, false, 23433, new Class[]{JSONObject.class}, Void.TYPE)) {
                        e eVar5 = eVar4;
                        PatchProxy.accessDispatch(new Object[]{jSONObject2}, eVar5, e.f34042a, false, 23433, new Class[]{JSONObject.class}, Void.TYPE);
                    } else {
                        if (jSONObject2 != null) {
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            d dVar2 = new d();
                            dVar2.a(optJSONObject2);
                            eVar4.f34044c.a(d.a(dVar2), optJSONObject2);
                        }
                    }
                }
            } else if (TextUtils.equals("download_app_ad", optString)) {
                if (this.f3128b != null) {
                    e eVar6 = this.f3128b;
                    Context context3 = (Context) this.f3123e.get();
                    if (PatchProxy.isSupport(new Object[]{context3, jSONObject2}, eVar6, e.f34042a, false, 23432, new Class[]{Context.class, JSONObject.class}, Void.TYPE)) {
                        e eVar7 = eVar6;
                        PatchProxy.accessDispatch(new Object[]{context3, jSONObject2}, eVar7, e.f34042a, false, 23432, new Class[]{Context.class, JSONObject.class}, Void.TYPE);
                    } else if (!(context3 == null || jSONObject2 == null)) {
                        JSONObject optJSONObject3 = jSONObject2.optJSONObject("data");
                        d dVar3 = new d();
                        dVar3.a(optJSONObject3);
                        com.ss.android.downloadad.api.a.c a4 = d.a(dVar3);
                        boolean z = dVar3.k;
                        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : 0)};
                        if (PatchProxy.isSupport(objArr, null, d.f34036a, true, 23425, new Class[]{Boolean.TYPE}, com.ss.android.downloadad.api.a.a.class)) {
                            Object[] objArr2 = {Byte.valueOf(z)};
                            Object[] objArr3 = objArr2;
                            a2 = (com.ss.android.downloadad.api.a.a) PatchProxy.accessDispatch(objArr3, null, d.f34036a, true, 23425, new Class[]{Boolean.TYPE}, com.ss.android.downloadad.api.a.a.class);
                        } else {
                            a2 = new a.C0339a().a(0).b(0).a(true).c(z).a();
                        }
                        com.ss.android.downloadad.api.a.a aVar2 = a2;
                        if (dVar3.i) {
                            String str = dVar3.j;
                            if (PatchProxy.isSupport(new Object[]{str, (byte) 1}, null, d.f34036a, true, 23423, new Class[]{String.class, Boolean.TYPE}, b.class)) {
                                Object[] objArr4 = {str, (byte) 1};
                                Object[] objArr5 = objArr4;
                                a3 = (b) PatchProxy.accessDispatch(objArr5, null, d.f34036a, true, 23423, new Class[]{String.class, Boolean.TYPE}, b.class);
                            } else {
                                a3 = com.ss.android.ugc.aweme.app.c.d.f.a().a(new b.a().a(str).b(str).h("click_start").i("click_pause").j("click_continue").k("click_install").l("click_open").m("storage_deny").a(1).b(true).c(false), str);
                            }
                        } else {
                            String str2 = dVar3.j;
                            if (PatchProxy.isSupport(new Object[]{str2}, null, d.f34036a, true, 23424, new Class[]{String.class}, b.class)) {
                                Object[] objArr6 = {str2};
                                Object[] objArr7 = objArr6;
                                a3 = (b) PatchProxy.accessDispatch(objArr7, null, d.f34036a, true, 23424, new Class[]{String.class}, b.class);
                            } else {
                                a3 = new b.a().b(str2).a(str2).a(0).a(true).c(false).a();
                            }
                        }
                        eVar6.f34044c.a(context3, a4, a3, aVar2, optJSONObject3);
                        bg.a(new AbsAdCardAction.b(-1));
                    }
                }
            } else if (TextUtils.equals("cancel_download_app_ad", optString)) {
                if (this.f3128b != null) {
                    e eVar8 = this.f3128b;
                    if (PatchProxy.isSupport(new Object[]{jSONObject2}, eVar8, e.f34042a, false, 23434, new Class[]{JSONObject.class}, Void.TYPE)) {
                        e eVar9 = eVar8;
                        PatchProxy.accessDispatch(new Object[]{jSONObject2}, eVar9, e.f34042a, false, 23434, new Class[]{JSONObject.class}, Void.TYPE);
                    } else if (!(jSONObject2 == null || eVar8.f34045d == null)) {
                        JSONObject optJSONObject4 = jSONObject2.optJSONObject("data");
                        d dVar4 = new d();
                        dVar4.a(optJSONObject4);
                        eVar8.f34044c.b(d.a(dVar4), optJSONObject4);
                    }
                }
            } else if (TextUtils.equals("get_download_pause_task", optString)) {
                if (this.f3128b != null) {
                    e eVar10 = this.f3128b;
                    if (PatchProxy.isSupport(new Object[0], eVar10, e.f34042a, false, 23435, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], eVar10, e.f34042a, false, 23435, new Class[0], Void.TYPE);
                    } else {
                        eVar10.f34044c.d();
                    }
                }
            } else if (TextUtils.equals("get_downloading_task", optString)) {
                if (this.f3128b != null) {
                    e eVar11 = this.f3128b;
                    if (PatchProxy.isSupport(new Object[0], eVar11, e.f34042a, false, 23436, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], eVar11, e.f34042a, false, 23436, new Class[0], Void.TYPE);
                    } else {
                        eVar11.f34044c.c();
                    }
                }
            } else if (TextUtils.equals("get_install_status", optString) && this.f3128b != null) {
                e eVar12 = this.f3128b;
                if (PatchProxy.isSupport(new Object[]{jSONObject2}, eVar12, e.f34042a, false, 23437, new Class[]{JSONObject.class}, Void.TYPE)) {
                    e eVar13 = eVar12;
                    PatchProxy.accessDispatch(new Object[]{jSONObject2}, eVar13, e.f34042a, false, 23437, new Class[]{JSONObject.class}, Void.TYPE);
                } else if (jSONObject2 != null && jSONObject.length() != 0) {
                    eVar12.f34044c.a(jSONObject2.optJSONArray("task_list"));
                }
            }
        }
    }
}

package com.bytedance.android.livesdk.livecommerce.broadcast.ui;

import a.g;
import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livecommerce.base.ECBaseViewModel;
import com.bytedance.android.livesdk.livecommerce.broadcast.adapter.ChoosePromotionViewHolder;
import com.bytedance.android.livesdk.livecommerce.broadcast.c;
import com.bytedance.android.livesdk.livecommerce.c.d;
import com.bytedance.android.livesdk.livecommerce.c.e;
import com.bytedance.android.livesdk.livecommerce.d.f;
import com.bytedance.android.livesdk.livecommerce.d.i;
import com.bytedance.android.livesdk.livecommerce.f.a;
import com.bytedance.android.livesdk.livecommerce.f.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class ChoosePromotionViewModel extends ECBaseViewModel implements ChoosePromotionViewHolder.a {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f16054f;
    public c g = new c();
    public String h;
    String i;
    String j;
    public boolean k = false;
    private MutableLiveData<i> l;
    private MutableLiveData<Boolean> m;
    private MutableLiveData<Void> n;
    private MutableLiveData<Void> o;
    private final String p = PushConstants.PUSH_TYPE_NOTIFY;

    public final MutableLiveData<i> f() {
        if (PatchProxy.isSupport(new Object[0], this, f16054f, false, 10555, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f16054f, false, 10555, new Class[0], MutableLiveData.class);
        }
        if (this.l == null) {
            this.l = new MutableLiveData<>();
        }
        return this.l;
    }

    public final MutableLiveData<Boolean> g() {
        if (PatchProxy.isSupport(new Object[0], this, f16054f, false, 10556, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f16054f, false, 10556, new Class[0], MutableLiveData.class);
        }
        if (this.m == null) {
            this.m = new MutableLiveData<>();
        }
        return this.m;
    }

    public final MutableLiveData<Void> h() {
        if (PatchProxy.isSupport(new Object[0], this, f16054f, false, 10557, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f16054f, false, 10557, new Class[0], MutableLiveData.class);
        }
        if (this.n == null) {
            this.n = new MutableLiveData<>();
        }
        return this.n;
    }

    public final MutableLiveData<Void> i() {
        if (PatchProxy.isSupport(new Object[0], this, f16054f, false, 10558, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f16054f, false, 10558, new Class[0], MutableLiveData.class);
        }
        if (this.o == null) {
            this.o = new MutableLiveData<>();
        }
        return this.o;
    }

    public void onCleared() {
        if (PatchProxy.isSupport(new Object[0], this, f16054f, false, 10568, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f16054f, false, 10568, new Class[0], Void.TYPE);
            return;
        }
        super.onCleared();
    }

    /* access modifiers changed from: package-private */
    public String a(List<e> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f16054f, false, 10559, new Class[]{List.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{list}, this, f16054f, false, 10559, new Class[]{List.class}, String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (list != null) {
            for (e eVar : list) {
                sb.append(eVar.m);
                sb.append(",");
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public void a(final String str, @Nullable final String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f16054f, false, 10561, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f16054f, false, 10561, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        this.k = true;
        if (TextUtils.equals(str, PushConstants.PUSH_TYPE_NOTIFY)) {
            c().postValue(null);
        }
        f.a(str, str2).a((g<TResult, TContinuationResult>) new g<i, Object>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f16055a;

            public final Object then(a.i<i> iVar) throws Exception {
                a.i<i> iVar2 = iVar;
                if (PatchProxy.isSupport(new Object[]{iVar2}, this, f16055a, false, 10572, new Class[]{a.i.class}, Object.class)) {
                    return PatchProxy.accessDispatch(new Object[]{iVar2}, this, f16055a, false, 10572, new Class[]{a.i.class}, Object.class);
                }
                if (TextUtils.equals(str, PushConstants.PUSH_TYPE_NOTIFY)) {
                    if (iVar2 == null || !iVar.b() || iVar.e() == null || ((i) iVar.e()).f16132a != 0) {
                        ChoosePromotionViewModel.this.e().postValue(null);
                    } else {
                        i iVar3 = (i) iVar.e();
                        ChoosePromotionViewModel.this.h = iVar3.f16169d;
                        c cVar = ChoosePromotionViewModel.this.g;
                        if (PatchProxy.isSupport(new Object[]{iVar3}, cVar, c.f16030a, false, 10491, new Class[]{i.class}, Void.TYPE)) {
                            c cVar2 = cVar;
                            PatchProxy.accessDispatch(new Object[]{iVar3}, cVar2, c.f16030a, false, 10491, new Class[]{i.class}, Void.TYPE);
                        } else {
                            cVar.f16031b.clear();
                            if (iVar3 != null) {
                                cVar.f16035f = iVar3.f16171f;
                                cVar.g = iVar3.f16170e;
                                cVar.h = iVar3.g;
                                List<com.bytedance.android.livesdk.livecommerce.d.g> list = iVar3.f16168c;
                                if (list != null) {
                                    for (int i = 0; i < list.size(); i++) {
                                        e a2 = a.a(list.get(i));
                                        if (!PatchProxy.isSupport(new Object[]{a2}, cVar, c.f16030a, false, 10490, new Class[]{e.class}, Void.TYPE)) {
                                            int i2 = 0;
                                            while (true) {
                                                if (i2 >= cVar.f16032c.size()) {
                                                    break;
                                                }
                                                e eVar = cVar.f16032c.get(i2);
                                                if (TextUtils.equals(eVar.m, a2.m)) {
                                                    a2.h = eVar.h;
                                                    cVar.f16032c.set(i2, a2);
                                                    break;
                                                }
                                                i2++;
                                            }
                                        } else {
                                            c cVar3 = cVar;
                                            PatchProxy.accessDispatch(new Object[]{a2}, cVar3, c.f16030a, false, 10490, new Class[]{e.class}, Void.TYPE);
                                        }
                                        cVar.f16031b.add(a2);
                                    }
                                    if (cVar.f16031b.size() > 0) {
                                        d dVar = new d();
                                        dVar.f16125a = cVar.f16035f;
                                        cVar.f16031b.add(dVar);
                                    }
                                }
                            }
                        }
                        ChoosePromotionViewModel.this.f().postValue(iVar3);
                        ChoosePromotionViewModel.this.d().postValue(null);
                    }
                } else if (iVar2 != null && iVar.b() && iVar.e() != null && ((i) iVar.e()).f16132a == 0) {
                    i iVar4 = (i) iVar.e();
                    ChoosePromotionViewModel.this.h = iVar4.f16169d;
                    c cVar4 = ChoosePromotionViewModel.this.g;
                    if (PatchProxy.isSupport(new Object[]{iVar4}, cVar4, c.f16030a, false, 10492, new Class[]{i.class}, Void.TYPE)) {
                        c cVar5 = cVar4;
                        PatchProxy.accessDispatch(new Object[]{iVar4}, cVar5, c.f16030a, false, 10492, new Class[]{i.class}, Void.TYPE);
                    } else if (!(iVar4 == null || iVar4.f16168c == null)) {
                        List<com.bytedance.android.livesdk.livecommerce.d.g> list2 = iVar4.f16168c;
                        com.bytedance.android.livesdk.livecommerce.c.f remove = cVar4.f16031b.remove(cVar4.f16031b.size() - 1);
                        for (int i3 = 0; i3 < list2.size(); i3++) {
                            cVar4.f16031b.add(a.a(list2.get(i3)));
                        }
                        cVar4.f16031b.add(remove);
                        cVar4.f16035f = iVar4.f16171f;
                        if (remove instanceof d) {
                            ((d) remove).f16125a = cVar4.f16035f;
                        }
                    }
                    ChoosePromotionViewModel.this.g().postValue(Boolean.valueOf(ChoosePromotionViewModel.this.g.f16035f));
                }
                ChoosePromotionViewModel.this.k = false;
                String str = str2;
                if (PatchProxy.isSupport(new Object[]{iVar2, str}, null, com.bytedance.android.livesdk.livecommerce.f.d.f16200a, true, 10739, new Class[]{a.i.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{iVar2, str}, null, com.bytedance.android.livesdk.livecommerce.f.d.f16200a, true, 10739, new Class[]{a.i.class, String.class}, Void.TYPE);
                } else {
                    com.bytedance.android.livesdk.livecommerce.f.d.a("ttlive_get_shop_list_status", iVar2, new d.a(str) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f16201a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ String f16202b;

                        {
                            this.f16202b = r1;
                        }

                        public final void a(@NonNull JSONObject jSONObject) throws JSONException {
                            JSONObject jSONObject2 = jSONObject;
                            if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, f16201a, false, 10745, new Class[]{JSONObject.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, f16201a, false, 10745, new Class[]{JSONObject.class}, Void.TYPE);
                                return;
                            }
                            jSONObject2.put("chosen_ids", this.f16202b);
                        }
                    });
                }
                return null;
            }
        }, a.i.f1052b);
    }

    public final void a(Context context, e eVar, int i2, boolean z) {
        boolean z2;
        e eVar2 = eVar;
        boolean z3 = z;
        if (PatchProxy.isSupport(new Object[]{context, eVar2, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f16054f, false, 10565, new Class[]{Context.class, e.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, eVar2, Integer.valueOf(i2), Byte.valueOf(z)}, this, f16054f, false, 10565, new Class[]{Context.class, e.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (!TextUtils.isEmpty(eVar2.g)) {
            k_().postValue(eVar2.g);
        } else {
            if (z3) {
                c cVar = this.g;
                if (PatchProxy.isSupport(new Object[0], cVar, c.f16030a, false, 10494, new Class[0], Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], cVar, c.f16030a, false, 10494, new Class[0], Boolean.TYPE)).booleanValue();
                } else if (cVar.c() >= cVar.g) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    k_().postValue(context.getResources().getString(C0906R.string.a9p, new Object[]{Integer.valueOf(this.g.g)}));
                    return;
                }
            }
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z)}, this, f16054f, false, 10564, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z)}, this, f16054f, false, 10564, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            } else {
                this.g.a(i2, z3);
            }
            h().postValue(null);
            i().postValue(null);
        }
    }
}

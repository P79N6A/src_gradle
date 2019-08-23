package com.bytedance.android.livesdk.livecommerce;

import android.app.Activity;
import android.arch.core.util.Function;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.a;
import com.bytedance.android.livesdk.livecommerce.broadcast.ui.ChoosePromotionFragment;
import com.bytedance.android.livesdk.livecommerce.broadcast.ui.LiveRoomPromotionListFragment;
import com.bytedance.android.livesdk.livecommerce.d.c;
import com.bytedance.android.livesdk.livecommerce.d.k;
import com.bytedance.android.livesdk.livecommerce.dialog.ECAlertDialog;
import com.bytedance.android.livesdk.livecommerce.f.d;
import com.bytedance.android.livesdkapi.d.d;
import com.bytedance.android.livesdkapi.d.e;
import com.bytedance.android.livesdkapi.d.f;
import com.bytedance.android.livesdkapi.d.g;
import com.bytedance.android.livesdkapi.d.h;
import com.bytedance.android.livesdkapi.d.i;
import com.bytedance.common.utility.collection.WeakContainer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15902a;
    private static final b o = new b();

    /* renamed from: b  reason: collision with root package name */
    public String f15903b;

    /* renamed from: c  reason: collision with root package name */
    public String f15904c;

    /* renamed from: d  reason: collision with root package name */
    public long f15905d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f15906e;

    /* renamed from: f  reason: collision with root package name */
    public d f15907f;
    public WeakReference<g> g;
    WeakReference<FragmentActivity> h;
    WeakReference<LiveRoomPromotionListFragment> i;
    WeakReference<com.bytedance.android.livesdk.livecommerce.view.a> j;
    WeakReference<com.bytedance.android.livesdk.livecommerce.view.a.d> k;
    WeakReference<View> l;
    public WeakContainer<a> m = new WeakContainer<>();
    public com.bytedance.android.livesdk.livecommerce.c.b n = new com.bytedance.android.livesdk.livecommerce.c.b();
    private e p;
    private long q;

    public interface a {
        void a(h hVar);
    }

    public final boolean a(@NonNull Activity activity, boolean z) {
        return true;
    }

    public static b a() {
        return o;
    }

    public final void a(i iVar, String str) {
        if (PatchProxy.isSupport(new Object[]{iVar, str}, this, f15902a, false, 10388, new Class[]{i.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar, str}, this, f15902a, false, 10388, new Class[]{i.class, String.class}, Void.TYPE);
            return;
        }
        this.n.a(str);
        iVar.a(this.n.f16122c);
    }

    public final void a(String str, String str2, k<com.bytedance.android.livesdk.livecommerce.d.h> kVar) {
        a.i iVar;
        final String str3 = str;
        final String str4 = str2;
        final k<com.bytedance.android.livesdk.livecommerce.d.h> kVar2 = kVar;
        if (PatchProxy.isSupport(new Object[]{str3, str4, kVar2}, this, f15902a, false, 10390, new Class[]{String.class, String.class, k.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, kVar2}, this, f15902a, false, 10390, new Class[]{String.class, String.class, k.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, com.bytedance.android.livesdk.livecommerce.d.f.f16136a, true, 10701, new Class[]{String.class, String.class}, a.i.class)) {
            iVar = (a.i) PatchProxy.accessDispatch(new Object[]{str3, str4}, null, com.bytedance.android.livesdk.livecommerce.d.f.f16136a, true, 10701, new Class[]{String.class, String.class}, a.i.class);
        } else {
            iVar = a.i.a((Callable<TResult>) new Callable<com.bytedance.android.livesdk.livecommerce.d.h>(str3, str4) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f16144a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f16145b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ String f16146c;

                public final /* synthetic */ Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f16144a, false, 10707, new Class[0], h.class)) {
                        return (h) PatchProxy.accessDispatch(new Object[0], this, f16144a, false, 10707, new Class[0], h.class);
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new e("author_id", this.f16145b));
                    arrayList.add(new e("room_id", this.f16146c));
                    return (h) a.a().fromJson(f.b("https://lianmengapi.snssdk.com/live/promotions/", arrayList), h.class);
                }

                {
                    this.f16145b = r1;
                    this.f16146c = r2;
                }
            });
        }
        iVar.a((a.g<TResult, TContinuationResult>) new a.g<com.bytedance.android.livesdk.livecommerce.d.h, Object>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f15941a;

            public final Object then(a.i<com.bytedance.android.livesdk.livecommerce.d.h> iVar) throws Exception {
                Exception exc;
                a.i<com.bytedance.android.livesdk.livecommerce.d.h> iVar2 = iVar;
                if (PatchProxy.isSupport(new Object[]{iVar2}, this, f15941a, false, 10423, new Class[]{a.i.class}, Object.class)) {
                    return PatchProxy.accessDispatch(new Object[]{iVar2}, this, f15941a, false, 10423, new Class[]{a.i.class}, Object.class);
                }
                if (iVar2 == null || !iVar.b() || iVar.e() == null || ((com.bytedance.android.livesdk.livecommerce.d.h) iVar.e()).f16132a != 0) {
                    if (kVar2 != null) {
                        k kVar = kVar2;
                        if (iVar2 == null) {
                            exc = null;
                        } else {
                            exc = iVar.f();
                        }
                        kVar.a((Throwable) exc);
                    }
                } else if (kVar2 != null) {
                    kVar2.a(iVar.e());
                }
                String str = str3;
                String str2 = str4;
                if (PatchProxy.isSupport(new Object[]{iVar2, str, str2}, null, com.bytedance.android.livesdk.livecommerce.f.d.f16200a, true, 10741, new Class[]{a.i.class, String.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{iVar2, str, str2}, null, com.bytedance.android.livesdk.livecommerce.f.d.f16200a, true, 10741, new Class[]{a.i.class, String.class, String.class}, Void.TYPE);
                } else {
                    com.bytedance.android.livesdk.livecommerce.f.d.a("ttlive_get_live_promotions_status", iVar2, new d.a(str, str2) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f16207a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ String f16208b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ String f16209c;

                        public final void a(JSONObject jSONObject) throws JSONException {
                            if (PatchProxy.isSupport(new Object[]{jSONObject}, this, f16207a, false, 10747, new Class[]{JSONObject.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{jSONObject}, this, f16207a, false, 10747, new Class[]{JSONObject.class}, Void.TYPE);
                                return;
                            }
                            jSONObject.put("author_id", this.f16208b);
                            jSONObject.put("room_id", this.f16209c);
                        }

                        {
                            this.f16208b = r1;
                            this.f16209c = r2;
                        }
                    });
                }
                return null;
            }
        }, a.i.f1052b);
    }

    public final void a(String str, k<Void> kVar) {
        if (PatchProxy.isSupport(new Object[]{str, kVar}, this, f15902a, false, 10392, new Class[]{String.class, k.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, kVar}, this, f15902a, false, 10392, new Class[]{String.class, k.class}, Void.TYPE);
            return;
        }
        a(this.f15903b, this.f15904c, str, kVar);
    }

    public final void a(@NonNull h hVar) {
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f15902a, false, 10394, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f15902a, false, 10394, new Class[]{h.class}, Void.TYPE);
        } else if (hVar.a() == 0) {
            if (!b()) {
                new com.bytedance.android.livesdk.livecommerce.a.f(this.f15903b, this.f15904c, "live_cart_tag", com.bytedance.android.livesdk.livecommerce.f.a.b()).a();
            }
            a(this.f15907f, true);
        } else if (hVar.a() == 1) {
            a(this.f15907f, false);
        } else {
            b(hVar);
        }
    }

    public final void a(@NonNull Fragment fragment, @NonNull String str, @NonNull String str2, e eVar) {
        final String str3 = str;
        final String str4 = str2;
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{fragment, str3, str4, eVar2}, this, f15902a, false, 10395, new Class[]{Fragment.class, String.class, String.class, e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment, str3, str4, eVar2}, this, f15902a, false, 10395, new Class[]{Fragment.class, String.class, String.class, e.class}, Void.TYPE);
            return;
        }
        j();
        if (!TextUtils.isEmpty(str2)) {
            this.f15903b = str3;
            this.f15904c = str4;
            this.p = eVar2;
            this.f15907f = eVar.a();
            g e2 = eVar.e();
            if (e2 != null) {
                this.g = new WeakReference<>(e2);
            }
            boolean b2 = eVar.b();
            if (!b()) {
                this.l = new WeakReference<>(fragment.getView());
                if (b2) {
                    a(str3, str4, (k<com.bytedance.android.livesdk.livecommerce.d.h>) new k<com.bytedance.android.livesdk.livecommerce.d.h>() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f15955a;

                        public final /* synthetic */ void a(Object obj) {
                            com.bytedance.android.livesdk.livecommerce.d.h hVar = (com.bytedance.android.livesdk.livecommerce.d.h) obj;
                            boolean z = false;
                            if (PatchProxy.isSupport(new Object[]{hVar}, this, f15955a, false, 10426, new Class[]{com.bytedance.android.livesdk.livecommerce.d.h.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{hVar}, this, f15955a, false, 10426, new Class[]{com.bytedance.android.livesdk.livecommerce.d.h.class}, Void.TYPE);
                                return;
                            }
                            if (!(hVar == null || hVar.f16166c == null || hVar.f16166c.size() <= 0)) {
                                z = true;
                            }
                            b.this.f15907f.a(new com.bytedance.android.livesdk.livecommerce.c.a(true, z));
                            if (z) {
                                new com.bytedance.android.livesdk.livecommerce.a.f(str3, str4, "live_cart_tag", com.bytedance.android.livesdk.livecommerce.f.a.b()).a();
                            }
                        }

                        public final void a(Throwable th) {
                            if (PatchProxy.isSupport(new Object[]{th}, this, f15955a, false, 10427, new Class[]{Throwable.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{th}, this, f15955a, false, 10427, new Class[]{Throwable.class}, Void.TYPE);
                                return;
                            }
                            b.this.f15907f.a(new com.bytedance.android.livesdk.livecommerce.c.a(true, false));
                        }
                    });
                    return;
                }
                this.f15907f.a(new com.bytedance.android.livesdk.livecommerce.c.a(true, false));
            } else if (c.b()) {
                if (com.bytedance.android.livesdk.livecommerce.f.a.a()) {
                    this.f15907f.a(new com.bytedance.android.livesdk.livecommerce.c.a(true, false));
                } else {
                    this.f15907f.a(new com.bytedance.android.livesdk.livecommerce.c.a(true, true));
                }
                if (fragment != null) {
                    if (this.h != null) {
                        this.h.clear();
                        this.h = null;
                    }
                    this.h = new WeakReference<>(fragment.getActivity());
                }
                a(str3, str4);
            }
        }
    }

    public final void a(final String str, final String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f15902a, false, 10396, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f15902a, false, 10396, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        a(str, str2, com.bytedance.android.livesdk.livecommerce.f.a.a(this.n.f16122c, (Function<T, String>) new Function<com.bytedance.android.livesdk.livecommerce.c.e, String>() {
            public final /* bridge */ /* synthetic */ Object apply(Object obj) {
                return ((com.bytedance.android.livesdk.livecommerce.c.e) obj).m;
            }
        }), (k<Void>) new k<Void>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f15913a;

            public final /* synthetic */ void a(Object obj) {
                Void voidR = (Void) obj;
                if (PatchProxy.isSupport(new Object[]{voidR}, this, f15913a, false, 10428, new Class[]{Void.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{voidR}, this, f15913a, false, 10428, new Class[]{Void.class}, Void.TYPE);
                    return;
                }
                b.this.n.a();
            }

            public final void a(Throwable th) {
                Activity activity;
                if (PatchProxy.isSupport(new Object[]{th}, this, f15913a, false, 10429, new Class[]{Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{th}, this, f15913a, false, 10429, new Class[]{Throwable.class}, Void.TYPE);
                    return;
                }
                b bVar = b.this;
                if (PatchProxy.isSupport(new Object[0], bVar, b.f15902a, false, 10381, new Class[0], Activity.class)) {
                    activity = (Activity) PatchProxy.accessDispatch(new Object[0], bVar, b.f15902a, false, 10381, new Class[0], Activity.class);
                } else if (bVar.h != null) {
                    activity = (Activity) bVar.h.get();
                } else {
                    activity = null;
                }
                if (activity != null) {
                    ECAlertDialog eCAlertDialog = new ECAlertDialog(activity);
                    eCAlertDialog.setTitle((int) C0906R.string.a9a);
                    eCAlertDialog.a(C0906R.string.a9t, new DialogInterface.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f15917a;

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f15917a, false, 10430, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f15917a, false, 10430, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            b.this.a(str, str2);
                            if (dialogInterface != null) {
                                dialogInterface.dismiss();
                            }
                        }
                    });
                    eCAlertDialog.b(C0906R.string.a8p, new DialogInterface.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f15919a;

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f15919a, false, 10431, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f15919a, false, 10431, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            if (dialogInterface != null) {
                                dialogInterface.dismiss();
                            }
                        }
                    });
                    eCAlertDialog.show();
                }
            }
        });
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f15902a, false, 10401, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f15902a, false, 10401, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        e();
        k();
    }

    public void a(String str, boolean z, k<Void> kVar) {
        a.i iVar;
        final String str2 = str;
        final boolean z2 = z;
        final k<Void> kVar2 = kVar;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0), kVar2}, this, f15902a, false, 10406, new Class[]{String.class, Boolean.TYPE, k.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z), kVar2}, this, f15902a, false, 10406, new Class[]{String.class, Boolean.TYPE, k.class}, Void.TYPE);
            return;
        }
        String str3 = this.f15904c;
        if (PatchProxy.isSupport(new Object[]{str3, str2, Byte.valueOf(z)}, null, com.bytedance.android.livesdk.livecommerce.d.f.f16136a, true, 10703, new Class[]{String.class, String.class, Boolean.TYPE}, a.i.class)) {
            iVar = (a.i) PatchProxy.accessDispatch(new Object[]{str3, str2, Byte.valueOf(z)}, null, com.bytedance.android.livesdk.livecommerce.d.f.f16136a, true, 10703, new Class[]{String.class, String.class, Boolean.TYPE}, a.i.class);
        } else {
            iVar = a.i.a((Callable<TResult>) new Callable<com.bytedance.android.livesdk.livecommerce.d.d>(str3, str2, z2) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f16150a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f16151b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ String f16152c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ boolean f16153d;

                public final /* synthetic */ Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f16150a, false, 10709, new Class[0], d.class)) {
                        return (d) PatchProxy.accessDispatch(new Object[0], this, f16150a, false, 10709, new Class[0], d.class);
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new e("room_id", this.f16151b));
                    arrayList.add(new e("promotion_id", this.f16152c));
                    arrayList.add(new e("cancel", String.valueOf(this.f16153d)));
                    return (d) a.a().fromJson(f.a("https://lianmengapi.snssdk.com/live/author/setcurrent/", (List<e>) arrayList), d.class);
                }

                {
                    this.f16151b = r1;
                    this.f16152c = r2;
                    this.f16153d = r3;
                }
            });
        }
        iVar.a((a.g<TResult, TContinuationResult>) new a.g<com.bytedance.android.livesdk.livecommerce.d.d, Object>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f15926a;

            public final Object then(a.i<com.bytedance.android.livesdk.livecommerce.d.d> iVar) throws Exception {
                String str;
                a.i<com.bytedance.android.livesdk.livecommerce.d.d> iVar2 = iVar;
                if (PatchProxy.isSupport(new Object[]{iVar2}, this, f15926a, false, 10419, new Class[]{a.i.class}, Object.class)) {
                    return PatchProxy.accessDispatch(new Object[]{iVar2}, this, f15926a, false, 10419, new Class[]{a.i.class}, Object.class);
                }
                if (iVar2 == null || !iVar.b() || iVar.e() == null || ((com.bytedance.android.livesdk.livecommerce.d.d) iVar.e()).f16132a != 0) {
                    if (kVar2 != null) {
                        if (iVar2 == null || iVar.e() == null) {
                            str = null;
                        } else {
                            str = ((com.bytedance.android.livesdk.livecommerce.d.d) iVar.e()).f16133b;
                        }
                        kVar2.a((Throwable) new Exception(str));
                    }
                } else if (kVar2 != null) {
                    kVar2.a(null);
                }
                String str2 = b.this.f15904c;
                String str3 = str2;
                boolean z = z2;
                if (PatchProxy.isSupport(new Object[]{iVar2, str2, str3, Byte.valueOf(z ? (byte) 1 : 0)}, null, com.bytedance.android.livesdk.livecommerce.f.d.f16200a, true, 10743, new Class[]{a.i.class, String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{iVar2, str2, str3, Byte.valueOf(z)}, null, com.bytedance.android.livesdk.livecommerce.f.d.f16200a, true, 10743, new Class[]{a.i.class, String.class, String.class, Boolean.TYPE}, Void.TYPE);
                } else {
                    com.bytedance.android.livesdk.livecommerce.f.d.a("ttlive_set_current_promotion_status", iVar2, new d.a(str2, str3, z) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f16213a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ String f16214b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ String f16215c;

                        /* renamed from: d  reason: collision with root package name */
                        final /* synthetic */ boolean f16216d;

                        public final void a(@NonNull JSONObject jSONObject) throws JSONException {
                            if (PatchProxy.isSupport(new Object[]{jSONObject}, this, f16213a, false, 10749, new Class[]{JSONObject.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{jSONObject}, this, f16213a, false, 10749, new Class[]{JSONObject.class}, Void.TYPE);
                                return;
                            }
                            jSONObject.put("room_id", this.f16214b);
                            jSONObject.put("promotion_id", this.f16215c);
                            jSONObject.put("cancel", this.f16216d);
                        }

                        {
                            this.f16214b = r1;
                            this.f16215c = r2;
                            this.f16216d = r3;
                        }
                    });
                }
                return null;
            }
        }, a.i.f1052b);
    }

    public final void a(String str, String str2, String str3) {
        a.i iVar;
        final String str4 = str;
        final String str5 = str2;
        final String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, this, f15902a, false, 10415, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, this, f15902a, false, 10415, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{str4, 1, str5, str6}, null, com.bytedance.android.livesdk.livecommerce.d.f.f16136a, true, 10704, new Class[]{String.class, Integer.TYPE, String.class, String.class}, a.i.class)) {
            iVar = (a.i) PatchProxy.accessDispatch(new Object[]{str4, 1, str5, str6}, null, com.bytedance.android.livesdk.livecommerce.d.f.f16136a, true, 10704, new Class[]{String.class, Integer.TYPE, String.class, String.class}, a.i.class);
        } else {
            iVar = a.i.a((Callable<TResult>) new Callable<com.bytedance.android.livesdk.livecommerce.d.d>(str4, 1, str5, str6) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f16154a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f16155b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ int f16156c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ String f16157d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ String f16158e;

                public final /* synthetic */ Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f16154a, false, 10710, new Class[0], d.class)) {
                        return (d) PatchProxy.accessDispatch(new Object[0], this, f16154a, false, 10710, new Class[0], d.class);
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new e("room_id", this.f16155b));
                    arrayList.add(new e("event_type", String.valueOf(this.f16156c)));
                    arrayList.add(new e("author_id", this.f16157d));
                    arrayList.add(new e("promotion_ids", this.f16158e));
                    return (d) a.a().fromJson(f.b("https://lianmengapi.snssdk.com/live/event/", arrayList), d.class);
                }

                {
                    this.f16155b = r1;
                    this.f16156c = r2;
                    this.f16157d = r3;
                    this.f16158e = r4;
                }
            });
        }
        iVar.a((a.g<TResult, TContinuationResult>) new a.g<com.bytedance.android.livesdk.livecommerce.d.d, Object>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f15936a;

            public final Object then(a.i<com.bytedance.android.livesdk.livecommerce.d.d> iVar) throws Exception {
                a.i<com.bytedance.android.livesdk.livecommerce.d.d> iVar2 = iVar;
                if (PatchProxy.isSupport(new Object[]{iVar2}, this, f15936a, false, 10422, new Class[]{a.i.class}, Object.class)) {
                    return PatchProxy.accessDispatch(new Object[]{iVar2}, this, f15936a, false, 10422, new Class[]{a.i.class}, Object.class);
                }
                String str = str4;
                String str2 = str5;
                String str3 = str6;
                if (PatchProxy.isSupport(new Object[]{iVar2, str, str2, str3, 1}, null, com.bytedance.android.livesdk.livecommerce.f.d.f16200a, true, 10744, new Class[]{a.i.class, String.class, String.class, String.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{iVar2, str, str2, str3, 1}, null, com.bytedance.android.livesdk.livecommerce.f.d.f16200a, true, 10744, new Class[]{a.i.class, String.class, String.class, String.class, Integer.TYPE}, Void.TYPE);
                } else {
                    com.bytedance.android.livesdk.livecommerce.f.d.a("ttlive_live_event_status", iVar2, new d.a(str, str2, str3, 1) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f16217a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ String f16218b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ String f16219c;

                        /* renamed from: d  reason: collision with root package name */
                        final /* synthetic */ String f16220d;

                        /* renamed from: e  reason: collision with root package name */
                        final /* synthetic */ int f16221e;

                        public final void a(@NonNull JSONObject jSONObject) throws JSONException {
                            if (PatchProxy.isSupport(new Object[]{jSONObject}, this, f16217a, false, 10750, new Class[]{JSONObject.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{jSONObject}, this, f16217a, false, 10750, new Class[]{JSONObject.class}, Void.TYPE);
                                return;
                            }
                            jSONObject.put("room_id", this.f16218b);
                            jSONObject.put("author_id", this.f16219c);
                            jSONObject.put("promotion_ids", this.f16220d);
                            jSONObject.put("event_type", this.f16221e);
                        }

                        {
                            this.f16218b = r1;
                            this.f16219c = r2;
                            this.f16220d = r3;
                            this.f16221e = r4;
                        }
                    });
                }
                return null;
            }
        }, a.i.f1052b);
    }

    private b() {
    }

    private LiveRoomPromotionListFragment h() {
        if (PatchProxy.isSupport(new Object[0], this, f15902a, false, 10382, new Class[0], LiveRoomPromotionListFragment.class)) {
            return (LiveRoomPromotionListFragment) PatchProxy.accessDispatch(new Object[0], this, f15902a, false, 10382, new Class[0], LiveRoomPromotionListFragment.class);
        } else if (this.i != null) {
            return (LiveRoomPromotionListFragment) this.i.get();
        } else {
            return null;
        }
    }

    private com.bytedance.android.livesdk.livecommerce.view.a.d i() {
        if (PatchProxy.isSupport(new Object[0], this, f15902a, false, 10384, new Class[0], com.bytedance.android.livesdk.livecommerce.view.a.d.class)) {
            return (com.bytedance.android.livesdk.livecommerce.view.a.d) PatchProxy.accessDispatch(new Object[0], this, f15902a, false, 10384, new Class[0], com.bytedance.android.livesdk.livecommerce.view.a.d.class);
        } else if (this.k != null) {
            return (com.bytedance.android.livesdk.livecommerce.view.a.d) this.k.get();
        } else {
            return null;
        }
    }

    private void j() {
        if (PatchProxy.isSupport(new Object[0], this, f15902a, false, 10403, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15902a, false, 10403, new Class[0], Void.TYPE);
            return;
        }
        this.f15903b = null;
        this.f15904c = null;
        this.p = null;
        this.f15907f = null;
        e();
        if (this.m != null) {
            this.m.clear();
        }
    }

    private void k() {
        if (PatchProxy.isSupport(new Object[0], this, f15902a, false, 10405, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15902a, false, 10405, new Class[0], Void.TYPE);
            return;
        }
        LiveRoomPromotionListFragment h2 = h();
        if (!(h2 == null || h2.getDialog() == null || !h2.getDialog().isShowing())) {
            h2.dismissAllowingStateLoss();
        }
    }

    public final boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, f15902a, false, 10387, new Class[0], Boolean.TYPE)) {
            return TextUtils.equals(this.f15903b, c.a());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f15902a, false, 10387, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f15902a, false, 10397, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f15902a, false, 10397, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.p != null && this.p.c()) {
            z = true;
        }
        return z;
    }

    public final String d() {
        if (PatchProxy.isSupport(new Object[0], this, f15902a, false, 10398, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f15902a, false, 10398, new Class[0], String.class);
        } else if (this.p != null) {
            return this.p.d();
        } else {
            return null;
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f15902a, false, 10404, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15902a, false, 10404, new Class[0], Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.livecommerce.view.a.d i2 = i();
        if (i2 != null) {
            i2.a();
        }
    }

    public final String g() {
        if (PatchProxy.isSupport(new Object[0], this, f15902a, false, 10416, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f15902a, false, 10416, new Class[0], String.class);
        } else if (this.q > 0) {
            return String.valueOf(System.currentTimeMillis() - this.q);
        } else {
            return PushConstants.PUSH_TYPE_NOTIFY;
        }
    }

    public final boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, f15902a, false, 10413, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f15902a, false, 10413, new Class[0], Boolean.TYPE)).booleanValue();
        }
        LiveRoomPromotionListFragment h2 = h();
        if ((h2 != null && h2.i()) || System.currentTimeMillis() - this.f15905d <= 30000) {
            return false;
        }
        a((k<com.bytedance.android.livesdk.livecommerce.c.e>) new k<com.bytedance.android.livesdk.livecommerce.c.e>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f15931a;

            public final void a(Throwable th) {
            }

            /* JADX WARNING: type inference failed for: r3v14, types: [android.view.View] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ void a(java.lang.Object r26) {
                /*
                    r25 = this;
                    r7 = r25
                    r8 = r26
                    com.bytedance.android.livesdk.livecommerce.c.e r8 = (com.bytedance.android.livesdk.livecommerce.c.e) r8
                    r9 = 1
                    java.lang.Object[] r0 = new java.lang.Object[r9]
                    r10 = 0
                    r0[r10] = r8
                    com.meituan.robust.ChangeQuickRedirect r2 = f15931a
                    java.lang.Class[] r5 = new java.lang.Class[r9]
                    java.lang.Class<com.bytedance.android.livesdk.livecommerce.c.e> r1 = com.bytedance.android.livesdk.livecommerce.c.e.class
                    r5[r10] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r3 = 0
                    r4 = 10420(0x28b4, float:1.4602E-41)
                    r1 = r25
                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                    if (r0 == 0) goto L_0x0038
                    java.lang.Object[] r0 = new java.lang.Object[r9]
                    r0[r10] = r8
                    com.meituan.robust.ChangeQuickRedirect r2 = f15931a
                    r3 = 0
                    r4 = 10420(0x28b4, float:1.4602E-41)
                    java.lang.Class[] r5 = new java.lang.Class[r9]
                    java.lang.Class<com.bytedance.android.livesdk.livecommerce.c.e> r1 = com.bytedance.android.livesdk.livecommerce.c.e.class
                    r5[r10] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r1 = r25
                    com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                    return
                L_0x0038:
                    com.bytedance.android.livesdk.livecommerce.b r0 = com.bytedance.android.livesdk.livecommerce.b.this
                    java.lang.Object[] r11 = new java.lang.Object[r10]
                    com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.livesdk.livecommerce.b.f15902a
                    r14 = 0
                    r15 = 10383(0x288f, float:1.455E-41)
                    java.lang.Class[] r1 = new java.lang.Class[r10]
                    java.lang.Class<android.view.View> r17 = android.view.View.class
                    r12 = r0
                    r16 = r1
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                    r2 = 0
                    if (r1 == 0) goto L_0x0064
                    java.lang.Object[] r11 = new java.lang.Object[r10]
                    com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.livesdk.livecommerce.b.f15902a
                    r14 = 0
                    r15 = 10383(0x288f, float:1.455E-41)
                    java.lang.Class[] r1 = new java.lang.Class[r10]
                    java.lang.Class<android.view.View> r17 = android.view.View.class
                    r12 = r0
                    r16 = r1
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                    android.view.View r0 = (android.view.View) r0
                    goto L_0x0072
                L_0x0064:
                    java.lang.ref.WeakReference<com.bytedance.android.livesdk.livecommerce.view.a> r1 = r0.j
                    if (r1 == 0) goto L_0x0071
                    java.lang.ref.WeakReference<com.bytedance.android.livesdk.livecommerce.view.a> r0 = r0.j
                    java.lang.Object r0 = r0.get()
                    android.view.View r0 = (android.view.View) r0
                    goto L_0x0072
                L_0x0071:
                    r0 = r2
                L_0x0072:
                    if (r0 == 0) goto L_0x01e4
                    com.bytedance.android.livesdk.livecommerce.b r1 = com.bytedance.android.livesdk.livecommerce.b.this
                    com.bytedance.android.livesdk.livecommerce.b r3 = com.bytedance.android.livesdk.livecommerce.b.this
                    java.lang.Object[] r11 = new java.lang.Object[r10]
                    com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.livesdk.livecommerce.b.f15902a
                    r14 = 0
                    r15 = 10385(0x2891, float:1.4552E-41)
                    java.lang.Class[] r4 = new java.lang.Class[r10]
                    java.lang.Class<android.view.ViewGroup> r17 = android.view.ViewGroup.class
                    r12 = r3
                    r16 = r4
                    boolean r4 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                    if (r4 == 0) goto L_0x00a1
                    java.lang.Object[] r11 = new java.lang.Object[r10]
                    com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.livesdk.livecommerce.b.f15902a
                    r14 = 0
                    r15 = 10385(0x2891, float:1.4552E-41)
                    java.lang.Class[] r2 = new java.lang.Class[r10]
                    java.lang.Class<android.view.ViewGroup> r17 = android.view.ViewGroup.class
                    r12 = r3
                    r16 = r2
                    java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                    android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                    goto L_0x00b4
                L_0x00a1:
                    java.lang.ref.WeakReference<android.view.View> r4 = r3.l
                    if (r4 == 0) goto L_0x00b4
                    java.lang.ref.WeakReference<android.view.View> r3 = r3.l
                    java.lang.Object r3 = r3.get()
                    android.view.View r3 = (android.view.View) r3
                    boolean r4 = r3 instanceof android.view.ViewGroup
                    if (r4 == 0) goto L_0x00b4
                    r2 = r3
                    android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                L_0x00b4:
                    r3 = 3
                    java.lang.Object[] r11 = new java.lang.Object[r3]
                    r11[r10] = r2
                    r11[r9] = r0
                    r4 = 2
                    r11[r4] = r8
                    com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.livesdk.livecommerce.b.f15902a
                    r14 = 0
                    r15 = 10414(0x28ae, float:1.4593E-41)
                    java.lang.Class[] r5 = new java.lang.Class[r3]
                    java.lang.Class<android.view.ViewGroup> r6 = android.view.ViewGroup.class
                    r5[r10] = r6
                    java.lang.Class<android.view.View> r6 = android.view.View.class
                    r5[r9] = r6
                    java.lang.Class<com.bytedance.android.livesdk.livecommerce.c.e> r6 = com.bytedance.android.livesdk.livecommerce.c.e.class
                    r5[r4] = r6
                    java.lang.Class r17 = java.lang.Void.TYPE
                    r12 = r1
                    r16 = r5
                    boolean r5 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                    if (r5 == 0) goto L_0x0101
                    java.lang.Object[] r11 = new java.lang.Object[r3]
                    r11[r10] = r2
                    r11[r9] = r0
                    r11[r4] = r8
                    com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.livesdk.livecommerce.b.f15902a
                    r14 = 0
                    r15 = 10414(0x28ae, float:1.4593E-41)
                    java.lang.Class[] r0 = new java.lang.Class[r3]
                    java.lang.Class<android.view.ViewGroup> r2 = android.view.ViewGroup.class
                    r0[r10] = r2
                    java.lang.Class<android.view.View> r2 = android.view.View.class
                    r0[r9] = r2
                    java.lang.Class<com.bytedance.android.livesdk.livecommerce.c.e> r2 = com.bytedance.android.livesdk.livecommerce.c.e.class
                    r0[r4] = r2
                    java.lang.Class r17 = java.lang.Void.TYPE
                    r12 = r1
                    r16 = r0
                    com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                    goto L_0x01dc
                L_0x0101:
                    if (r2 == 0) goto L_0x01dc
                    if (r0 == 0) goto L_0x01dc
                    if (r8 == 0) goto L_0x01dc
                    com.bytedance.android.livesdk.livecommerce.a.f r3 = new com.bytedance.android.livesdk.livecommerce.a.f
                    java.lang.String r5 = r1.f15903b
                    java.lang.String r6 = r1.f15904c
                    java.lang.String r11 = "live_bubble"
                    int r12 = com.bytedance.android.livesdk.livecommerce.f.a.b()
                    r3.<init>(r5, r6, r11, r12)
                    java.lang.String r5 = r8.m
                    java.lang.String r6 = r8.k
                    java.lang.Object[] r11 = new java.lang.Object[r4]
                    r11[r10] = r5
                    r11[r9] = r6
                    com.meituan.robust.ChangeQuickRedirect r20 = com.bytedance.android.livesdk.livecommerce.a.f.f15901c
                    r21 = 0
                    r22 = 10685(0x29bd, float:1.4973E-41)
                    java.lang.Class[] r12 = new java.lang.Class[r4]
                    java.lang.Class<java.lang.String> r13 = java.lang.String.class
                    r12[r10] = r13
                    java.lang.Class<java.lang.String> r13 = java.lang.String.class
                    r12[r9] = r13
                    java.lang.Class<com.bytedance.android.livesdk.livecommerce.a.f> r24 = com.bytedance.android.livesdk.livecommerce.a.f.class
                    r18 = r11
                    r19 = r3
                    r23 = r12
                    boolean r11 = com.meituan.robust.PatchProxy.isSupport(r18, r19, r20, r21, r22, r23, r24)
                    if (r11 == 0) goto L_0x0163
                    java.lang.Object[] r11 = new java.lang.Object[r4]
                    r11[r10] = r5
                    r11[r9] = r6
                    com.meituan.robust.ChangeQuickRedirect r20 = com.bytedance.android.livesdk.livecommerce.a.f.f15901c
                    r21 = 0
                    r22 = 10685(0x29bd, float:1.4973E-41)
                    java.lang.Class[] r4 = new java.lang.Class[r4]
                    java.lang.Class<java.lang.String> r5 = java.lang.String.class
                    r4[r10] = r5
                    java.lang.Class<java.lang.String> r5 = java.lang.String.class
                    r4[r9] = r5
                    java.lang.Class<com.bytedance.android.livesdk.livecommerce.a.f> r24 = com.bytedance.android.livesdk.livecommerce.a.f.class
                    r18 = r11
                    r19 = r3
                    r23 = r4
                    java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r18, r19, r20, r21, r22, r23, r24)
                    com.bytedance.android.livesdk.livecommerce.a.f r3 = (com.bytedance.android.livesdk.livecommerce.a.f) r3
                    goto L_0x016d
                L_0x0163:
                    java.lang.String r4 = "commodity_id"
                    r3.a((java.lang.String) r4, (java.lang.String) r5)
                    java.lang.String r4 = "commodity_type"
                    r3.a((java.lang.String) r4, (java.lang.String) r6)
                L_0x016d:
                    r3.a()
                    com.bytedance.android.livesdk.livecommerce.a.i r3 = new com.bytedance.android.livesdk.livecommerce.a.i
                    java.lang.String r10 = r1.f15903b
                    java.lang.String r11 = r1.f15904c
                    java.lang.String r12 = r8.m
                    java.lang.String r13 = r8.k
                    java.lang.String r14 = "live_bubble"
                    java.lang.String r15 = r8.l
                    java.lang.String r16 = r1.g()
                    int r17 = com.bytedance.android.livesdk.livecommerce.f.a.b()
                    r9 = r3
                    r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
                    r3.a()
                    android.content.Context r3 = r0.getContext()
                    android.app.Activity r3 = (android.app.Activity) r3
                    com.bytedance.android.livesdk.livecommerce.view.a.a r4 = new com.bytedance.android.livesdk.livecommerce.view.a.a
                    r4.<init>()
                    boolean r5 = com.bytedance.android.livesdk.livecommerce.f.a.a()
                    if (r5 == 0) goto L_0x01a4
                    com.bytedance.android.livesdk.livecommerce.view.a.c r5 = new com.bytedance.android.livesdk.livecommerce.view.a.c
                    r5.<init>(r3)
                    goto L_0x01a9
                L_0x01a4:
                    com.bytedance.android.livesdk.livecommerce.view.a.b r5 = new com.bytedance.android.livesdk.livecommerce.view.a.b
                    r5.<init>(r3)
                L_0x01a9:
                    r5.setPromotion(r8)
                    android.view.View r5 = r5.getBubbleView()
                    r4.a((android.view.View) r5)
                    r5 = 5000(0x1388, double:2.4703E-320)
                    r4.a((long) r5)
                    r5 = -1056964608(0xffffffffc1000000, float:-8.0)
                    float r3 = com.bytedance.common.utility.UIUtils.dip2Px(r3, r5)
                    int r3 = (int) r3
                    r5 = 48
                    r4.a(r2, r0, r5, r3)
                    com.bytedance.android.livesdk.livecommerce.b$4 r0 = new com.bytedance.android.livesdk.livecommerce.b$4
                    r0.<init>(r8)
                    r4.a((com.bytedance.android.livesdk.livecommerce.view.a.d.a) r0)
                    java.lang.ref.WeakReference<com.bytedance.android.livesdk.livecommerce.view.a.d> r0 = r1.k
                    if (r0 == 0) goto L_0x01d5
                    java.lang.ref.WeakReference<com.bytedance.android.livesdk.livecommerce.view.a.d> r0 = r1.k
                    r0.clear()
                L_0x01d5:
                    java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                    r0.<init>(r4)
                    r1.k = r0
                L_0x01dc:
                    com.bytedance.android.livesdk.livecommerce.b r0 = com.bytedance.android.livesdk.livecommerce.b.this
                    long r1 = java.lang.System.currentTimeMillis()
                    r0.f15905d = r1
                L_0x01e4:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livecommerce.b.AnonymousClass3.a(java.lang.Object):void");
            }
        });
        return true;
    }

    private void b(h hVar) {
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f15902a, false, 10412, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f15902a, false, 10412, new Class[]{h.class}, Void.TYPE);
            return;
        }
        if ((hVar.a() != 2 || b() || !f()) && this.m != null) {
            Iterator it2 = this.m.iterator();
            while (it2.hasNext()) {
                a aVar = (a) it2.next();
                if (aVar != null) {
                    aVar.a(hVar);
                }
            }
        }
    }

    private void a(k<com.bytedance.android.livesdk.livecommerce.c.e> kVar) {
        a.i iVar;
        final k<com.bytedance.android.livesdk.livecommerce.c.e> kVar2 = kVar;
        if (PatchProxy.isSupport(new Object[]{kVar2}, this, f15902a, false, 10391, new Class[]{k.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVar2}, this, f15902a, false, 10391, new Class[]{k.class}, Void.TYPE);
            return;
        }
        String str = this.f15903b;
        String str2 = this.f15904c;
        if (PatchProxy.isSupport(new Object[]{str, str2}, null, com.bytedance.android.livesdk.livecommerce.d.f.f16136a, true, 10702, new Class[]{String.class, String.class}, a.i.class)) {
            iVar = (a.i) PatchProxy.accessDispatch(new Object[]{str, str2}, null, com.bytedance.android.livesdk.livecommerce.d.f.f16136a, true, 10702, new Class[]{String.class, String.class}, a.i.class);
        } else {
            iVar = a.i.a((Callable<TResult>) new Callable<c>(str, str2) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f16147a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f16148b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ String f16149c;

                public final /* synthetic */ Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f16147a, false, 10708, new Class[0], c.class)) {
                        return (c) PatchProxy.accessDispatch(new Object[0], this, f16147a, false, 10708, new Class[0], c.class);
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new e("author_id", this.f16148b));
                    arrayList.add(new e("room_id", this.f16149c));
                    return (c) a.a().fromJson(f.b("https://lianmengapi.snssdk.com/live/promotions/pop/", arrayList), c.class);
                }

                {
                    this.f16148b = r1;
                    this.f16149c = r2;
                }
            });
        }
        iVar.a((a.g<TResult, TContinuationResult>) new a.g<c, Object>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f15946a;

            public final Object then(a.i<c> iVar) throws Exception {
                a.i<c> iVar2 = iVar;
                if (PatchProxy.isSupport(new Object[]{iVar2}, this, f15946a, false, 10424, new Class[]{a.i.class}, Object.class)) {
                    return PatchProxy.accessDispatch(new Object[]{iVar2}, this, f15946a, false, 10424, new Class[]{a.i.class}, Object.class);
                }
                if (iVar2 == null || !iVar.b() || iVar.e() == null || ((c) iVar.e()).f16132a != 0 || ((c) iVar.e()).f16135c == null || ((c) iVar.e()).f16135c.size() <= 0) {
                    if (kVar2 != null) {
                        kVar2.a((Throwable) null);
                    }
                } else if (kVar2 != null) {
                    kVar2.a(com.bytedance.android.livesdk.livecommerce.f.a.a(((c) iVar.e()).f16135c.get(0)));
                }
                String str = b.this.f15903b;
                String str2 = b.this.f15904c;
                if (PatchProxy.isSupport(new Object[]{iVar2, str, str2}, null, com.bytedance.android.livesdk.livecommerce.f.d.f16200a, true, 10742, new Class[]{a.i.class, String.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{iVar2, str, str2}, null, com.bytedance.android.livesdk.livecommerce.f.d.f16200a, true, 10742, new Class[]{a.i.class, String.class, String.class}, Void.TYPE);
                } else {
                    com.bytedance.android.livesdk.livecommerce.f.d.a("ttlive_get_pop_promotion_status", iVar2, new d.a(str, str2) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f16210a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ String f16211b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ String f16212c;

                        public final void a(JSONObject jSONObject) throws JSONException {
                            if (PatchProxy.isSupport(new Object[]{jSONObject}, this, f16210a, false, 10748, new Class[]{JSONObject.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{jSONObject}, this, f16210a, false, 10748, new Class[]{JSONObject.class}, Void.TYPE);
                                return;
                            }
                            jSONObject.put("author_id", this.f16211b);
                            jSONObject.put("room_id", this.f16212c);
                        }

                        {
                            this.f16211b = r1;
                            this.f16212c = r2;
                        }
                    });
                }
                return null;
            }
        }, a.i.f1052b);
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f15902a, false, 10402, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f15902a, false, 10402, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.q = 0;
        this.f15905d = 0;
        this.f15906e = false;
        j();
        this.n.a();
    }

    @Nullable
    public final com.bytedance.android.livesdkapi.d.b a(@NonNull final Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f15902a, false, 10399, new Class[]{Context.class}, com.bytedance.android.livesdkapi.d.b.class)) {
            return (com.bytedance.android.livesdkapi.d.b) PatchProxy.accessDispatch(new Object[]{context}, this, f15902a, false, 10399, new Class[]{Context.class}, com.bytedance.android.livesdkapi.d.b.class);
        }
        com.bytedance.android.livesdk.livecommerce.view.a aVar = new com.bytedance.android.livesdk.livecommerce.view.a(context);
        aVar.a(b());
        aVar.a((View.OnClickListener) new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f15921a;

            public final void onClick(View view) {
                LiveRoomPromotionListFragment liveRoomPromotionListFragment;
                if (PatchProxy.isSupport(new Object[]{view}, this, f15921a, false, 10432, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f15921a, false, 10432, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                b bVar = b.this;
                Context context = context;
                if (PatchProxy.isSupport(new Object[]{context}, bVar, b.f15902a, false, 10400, new Class[]{Context.class}, DialogFragment.class)) {
                    Object[] objArr = {context};
                    b bVar2 = bVar;
                    ChangeQuickRedirect changeQuickRedirect = b.f15902a;
                    DialogFragment dialogFragment = (DialogFragment) PatchProxy.accessDispatch(objArr, bVar2, changeQuickRedirect, false, 10400, new Class[]{Context.class}, DialogFragment.class);
                } else {
                    if (bVar.b()) {
                        new com.bytedance.android.livesdk.livecommerce.a.a(bVar.f15904c).a();
                    }
                    String str = bVar.f15903b;
                    String str2 = bVar.f15904c;
                    if (context instanceof FragmentActivity) {
                        if (PatchProxy.isSupport(new Object[]{str, str2}, null, LiveRoomPromotionListFragment.i, true, 10574, new Class[]{String.class, String.class}, LiveRoomPromotionListFragment.class)) {
                            liveRoomPromotionListFragment = (LiveRoomPromotionListFragment) PatchProxy.accessDispatch(new Object[]{str, str2}, null, LiveRoomPromotionListFragment.i, true, 10574, new Class[]{String.class, String.class}, LiveRoomPromotionListFragment.class);
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putString("broadcast_id", str);
                            bundle.putString("room_id", str2);
                            liveRoomPromotionListFragment = new LiveRoomPromotionListFragment();
                            liveRoomPromotionListFragment.setArguments(bundle);
                        }
                        liveRoomPromotionListFragment.show(((FragmentActivity) context).getSupportFragmentManager(), "live_promotion_fragment");
                        if (bVar.i != null) {
                            bVar.i.clear();
                        }
                        bVar.i = new WeakReference<>(liveRoomPromotionListFragment);
                    }
                }
                b.this.e();
                if (!b.this.b()) {
                    com.bytedance.android.livesdk.livecommerce.a.e eVar = new com.bytedance.android.livesdk.livecommerce.a.e(b.this.f15903b, b.this.f15904c, "live_cart_tag", "live_list_card", com.bytedance.android.livesdk.livecommerce.f.a.b());
                    eVar.a();
                }
            }
        });
        if (this.j != null) {
            this.j.clear();
        }
        this.j = new WeakReference<>(aVar);
        if (!b() && !this.f15906e) {
            a.i.a(10000).a((a.g<TResult, TContinuationResult>) new a.g<Void, Void>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f15924a;

                public final /* synthetic */ Object then(a.i iVar) throws Exception {
                    if (PatchProxy.isSupport(new Object[]{iVar}, this, f15924a, false, 10433, new Class[]{a.i.class}, Void.class)) {
                        return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f15924a, false, 10433, new Class[]{a.i.class}, Void.class);
                    }
                    b.this.f();
                    b.this.f15906e = true;
                    return null;
                }
            }, a.i.f1052b);
        }
        return aVar;
    }

    private void a(com.bytedance.android.livesdkapi.d.d dVar, boolean z) {
        com.bytedance.android.livesdkapi.d.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f15902a, false, 10411, new Class[]{com.bytedance.android.livesdkapi.d.d.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2, Byte.valueOf(z)}, this, f15902a, false, 10411, new Class[]{com.bytedance.android.livesdkapi.d.d.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!b()) {
            if (dVar2 != null) {
                dVar2.a(new com.bytedance.android.livesdk.livecommerce.c.a(false, z));
            }
            e();
        }
    }

    public final DialogFragment a(Context context, String str, i iVar) {
        Context context2 = context;
        final String str2 = str;
        final i iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{context2, str2, iVar2}, this, f15902a, false, 10389, new Class[]{Context.class, String.class, i.class}, DialogFragment.class)) {
            return (DialogFragment) PatchProxy.accessDispatch(new Object[]{context2, str2, iVar2}, this, f15902a, false, 10389, new Class[]{Context.class, String.class, i.class}, DialogFragment.class);
        } else if (!(context2 instanceof FragmentActivity) || TextUtils.isEmpty(str)) {
            return null;
        } else {
            this.n.a(str2);
            FragmentManager supportFragmentManager = ((FragmentActivity) context2).getSupportFragmentManager();
            ChoosePromotionFragment a2 = ChoosePromotionFragment.a(str2, this.n.f16122c, (com.bytedance.android.livesdk.livecommerce.broadcast.a) new com.bytedance.android.livesdk.livecommerce.broadcast.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f15908a;

                public final void a(List<com.bytedance.android.livesdk.livecommerce.c.e> list) {
                    if (PatchProxy.isSupport(new Object[]{list}, this, f15908a, false, 10418, new Class[]{List.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{list}, this, f15908a, false, 10418, new Class[]{List.class}, Void.TYPE);
                        return;
                    }
                    if (list != null) {
                        com.bytedance.android.livesdk.livecommerce.c.b bVar = b.this.n;
                        bVar.f16121b = str2;
                        bVar.f16122c = list;
                    }
                    if (iVar2 != null) {
                        iVar2.a(list);
                    }
                }
            });
            a2.h();
            a2.show(supportFragmentManager, "SelectedFragment");
            return a2;
        }
    }

    private void a(String str, String str2, String str3, k<Void> kVar) {
        String str4;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        if (PatchProxy.isSupport(new Object[]{str5, str6, str7, kVar}, this, f15902a, false, 10393, new Class[]{String.class, String.class, String.class, k.class}, Void.TYPE)) {
            Object[] objArr = {str5, str6, str7, kVar};
            PatchProxy.accessDispatch(objArr, this, f15902a, false, 10393, new Class[]{String.class, String.class, String.class, k.class}, Void.TYPE);
            return;
        }
        if (str7 == null) {
            str4 = "";
        } else {
            str4 = str7;
        }
        a.i a2 = com.bytedance.android.livesdk.livecommerce.d.f.a(str5, str6, str4);
        final k<Void> kVar2 = kVar;
        final String str8 = str;
        final String str9 = str2;
        final String str10 = str3;
        AnonymousClass8 r0 = new a.g<com.bytedance.android.livesdk.livecommerce.d.d, Object>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f15949a;

            public final Object then(a.i<com.bytedance.android.livesdk.livecommerce.d.d> iVar) throws Exception {
                a.i<com.bytedance.android.livesdk.livecommerce.d.d> iVar2 = iVar;
                if (PatchProxy.isSupport(new Object[]{iVar2}, this, f15949a, false, 10425, new Class[]{a.i.class}, Object.class)) {
                    return PatchProxy.accessDispatch(new Object[]{iVar2}, this, f15949a, false, 10425, new Class[]{a.i.class}, Object.class);
                }
                if (iVar2 == null || !iVar.b() || iVar.e() == null || ((com.bytedance.android.livesdk.livecommerce.d.d) iVar.e()).f16132a != 0) {
                    if (kVar2 != null) {
                        kVar2.a((Throwable) null);
                    }
                } else if (kVar2 != null) {
                    kVar2.a(null);
                }
                String str = str8;
                String str2 = str9;
                String str3 = str10;
                if (PatchProxy.isSupport(new Object[]{iVar2, str, str2, str3}, null, com.bytedance.android.livesdk.livecommerce.f.d.f16200a, true, 10740, new Class[]{a.i.class, String.class, String.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{iVar2, str, str2, str3}, null, com.bytedance.android.livesdk.livecommerce.f.d.f16200a, true, 10740, new Class[]{a.i.class, String.class, String.class, String.class}, Void.TYPE);
                } else {
                    com.bytedance.android.livesdk.livecommerce.f.d.a("ttlive_bind_live_promotions_status", iVar2, new d.a(str, str2, str3) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f16203a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ String f16204b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ String f16205c;

                        /* renamed from: d  reason: collision with root package name */
                        final /* synthetic */ String f16206d;

                        public final void a(JSONObject jSONObject) throws JSONException {
                            if (PatchProxy.isSupport(new Object[]{jSONObject}, this, f16203a, false, 10746, new Class[]{JSONObject.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{jSONObject}, this, f16203a, false, 10746, new Class[]{JSONObject.class}, Void.TYPE);
                                return;
                            }
                            jSONObject.put("author_id", this.f16204b);
                            jSONObject.put("room_id", this.f16205c);
                            jSONObject.put("promotion_ids", this.f16206d);
                        }

                        {
                            this.f16204b = r1;
                            this.f16205c = r2;
                            this.f16206d = r3;
                        }
                    });
                }
                return null;
            }
        };
        a2.a((a.g<TResult, TContinuationResult>) r0, a.i.f1052b);
        new com.bytedance.android.livesdk.livecommerce.a.h(this.f15904c, str7, g()).a();
    }
}

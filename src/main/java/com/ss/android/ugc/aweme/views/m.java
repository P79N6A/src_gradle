package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.lighten.core.b.g;
import com.bytedance.lighten.core.e;
import com.bytedance.lighten.core.i;
import com.bytedance.lighten.core.k;
import com.bytedance.lighten.core.l;
import com.bytedance.lighten.loader.SmartImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.b.a.a.a;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.i18n.c;
import java.util.List;
import org.json.JSONObject;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76469a;

    public static String a(UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{urlModel}, null, f76469a, true, 89560, new Class[]{UrlModel.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{urlModel}, null, f76469a, true, 89560, new Class[]{UrlModel.class}, String.class);
        }
        if (urlModel != null) {
            try {
                if (Environment.getExternalStorageState().equals("mounted")) {
                    List<String> urlList = urlModel.getUrlList();
                    if (urlList == null || urlList.isEmpty()) {
                        return "";
                    }
                    int size = urlList.size();
                    for (int i = 0; i < size; i++) {
                        if (l.f21796a.a(Uri.parse(urlList.get(i)))) {
                            return urlList.get(i);
                        }
                    }
                    return "";
                }
            } catch (Exception unused) {
                return "";
            }
        }
        return "";
    }

    private static e a(UrlModel urlModel, List<String> list, g gVar, String str) {
        UrlModel urlModel2 = urlModel;
        List<String> list2 = list;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{urlModel2, list2, null, str2}, null, f76469a, true, 89553, new Class[]{UrlModel.class, List.class, g.class, String.class}, e.class)) {
            Object[] objArr = {urlModel2, list2, null, str2};
            return (e) PatchProxy.accessDispatch(objArr, null, f76469a, true, 89553, new Class[]{UrlModel.class, List.class, g.class, String.class}, e.class);
        } else if (list2 == null || list.size() == 0) {
            return null;
        } else {
            e a2 = l.a(list);
            a2.a(Bitmap.Config.RGB_565).a(false).a(1).a(k.MEDIUM).a(a((g) null, Uri.parse(list2.get(0)), GlobalContext.getContext(), urlModel2, str2));
            return a2;
        }
    }

    public static g a(g gVar, Uri uri, Context context, UrlModel urlModel, String str) {
        final g gVar2 = gVar;
        final Context context2 = context;
        final UrlModel urlModel2 = urlModel;
        final String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{gVar2, uri, context2, urlModel2, str2}, null, f76469a, true, 89556, new Class[]{g.class, Uri.class, Context.class, UrlModel.class, String.class}, g.class)) {
            return new g() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f76479a;

                /* renamed from: b  reason: collision with root package name */
                UrlModel f76480b;

                /* renamed from: c  reason: collision with root package name */
                long f76481c = System.currentTimeMillis();

                public final void a(Uri uri, @Nullable View view) {
                    if (PatchProxy.isSupport(new Object[]{uri, view}, this, f76479a, false, 89565, new Class[]{Uri.class, View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{uri, view}, this, f76479a, false, 89565, new Class[]{Uri.class, View.class}, Void.TYPE);
                        return;
                    }
                    this.f76481c = System.currentTimeMillis();
                    this.f76480b = urlModel2;
                    if (gVar2 != null) {
                        gVar2.a(uri, view);
                    }
                }

                public final void a(Uri uri, @Nullable View view, @Nullable Throwable th) {
                    Uri uri2 = uri;
                    View view2 = view;
                    Throwable th2 = th;
                    if (PatchProxy.isSupport(new Object[]{uri2, view2, th2}, this, f76479a, false, 89567, new Class[]{Uri.class, View.class, Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{uri2, view2, th2}, this, f76479a, false, 89567, new Class[]{Uri.class, View.class, Throwable.class}, Void.TYPE);
                        return;
                    }
                    if (gVar2 != null) {
                        gVar2.a(uri2, view2, th2);
                    }
                    if (NetworkUtils.isNetworkAvailable(context2)) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            String th3 = th.toString();
                            jSONObject.put("errorDesc", th.toString());
                            jSONObject.put(PushConstants.WEB_URL, uri.toString());
                            jSONObject.put("userId", ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
                            if (context2 != null) {
                                jSONObject.put("networkType", NetworkUtils.getNetworkAccessType(context2));
                            }
                            n.b("aweme_image_load_log", "image_error", jSONObject);
                            n.a("aweme_image_load_error_rate", com.ss.android.ugc.aweme.base.e.a(th3), jSONObject);
                            String str = str2;
                            if (PatchProxy.isSupport(new Object[]{str, jSONObject}, null, m.f76469a, true, 89558, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{str, jSONObject}, null, m.f76469a, true, 89558, new Class[]{String.class, JSONObject.class}, Void.TYPE);
                                return;
                            }
                            if (!c.a() && TextUtils.equals(str, "poi")) {
                                try {
                                    jSONObject.put("business", str);
                                    jSONObject.put("status", 1);
                                } catch (Exception unused) {
                                }
                                n.b("aweme_log_image_error_rate", "aweme_service_image_error_rate", jSONObject);
                            }
                        } catch (Exception unused2) {
                        }
                    }
                }

                public final void a(Uri uri, @Nullable View view, @Nullable i iVar, @Nullable Animatable animatable) {
                    Uri uri2 = uri;
                    View view2 = view;
                    i iVar2 = iVar;
                    Animatable animatable2 = animatable;
                    if (PatchProxy.isSupport(new Object[]{uri2, view2, iVar2, animatable2}, this, f76479a, false, 89566, new Class[]{Uri.class, View.class, i.class, Animatable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{uri2, view2, iVar2, animatable2}, this, f76479a, false, 89566, new Class[]{Uri.class, View.class, i.class, Animatable.class}, Void.TYPE);
                        return;
                    }
                    if (gVar2 != null) {
                        gVar2.a(uri2, view2, iVar2, animatable2);
                    }
                    com.ss.android.ugc.aweme.base.e.a(m.a(this.f76480b), System.currentTimeMillis() - this.f76481c, true);
                    a.a(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f76485a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f76485a, false, 89568, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f76485a, false, 89568, new Class[0], Void.TYPE);
                                return;
                            }
                            if (!TextUtils.isEmpty(m.a(AnonymousClass2.this.f76480b))) {
                                String str = str2;
                                if (PatchProxy.isSupport(new Object[]{str}, null, m.f76469a, true, 89557, new Class[]{String.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{str}, null, m.f76469a, true, 89557, new Class[]{String.class}, Void.TYPE);
                                } else if (!c.a() && TextUtils.equals(str, "poi")) {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("business", str);
                                        jSONObject.put("status", 0);
                                    } catch (Exception unused) {
                                    }
                                    n.b("aweme_log_image_error_rate", "aweme_service_image_error_rate", jSONObject);
                                }
                            }
                        }
                    });
                }
            };
        }
        Object[] objArr = {gVar2, uri, context2, urlModel2, str2};
        return (g) PatchProxy.accessDispatch(objArr, null, f76469a, true, 89556, new Class[]{g.class, Uri.class, Context.class, UrlModel.class, String.class}, g.class);
    }

    public static void a(SmartImageView smartImageView, UrlModel urlModel, int i, int i2, String str) {
        SmartImageView smartImageView2 = smartImageView;
        UrlModel urlModel2 = urlModel;
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{smartImageView2, urlModel2, Integer.valueOf(i), Integer.valueOf(i2), str2}, null, f76469a, true, 89549, new Class[]{SmartImageView.class, UrlModel.class, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {smartImageView2, urlModel2, Integer.valueOf(i), Integer.valueOf(i2), str2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f76469a, true, 89549, new Class[]{SmartImageView.class, UrlModel.class, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
        } else if (smartImageView2 != null && urlModel2 != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            e a2 = a(urlModel2, urlModel.getUrlList(), null, str2);
            if (a2 != null) {
                if (i3 > 0 && i4 > 0) {
                    a2.a(i3, i4);
                }
                l.a(smartImageView2, a2.a());
            }
        }
    }
}

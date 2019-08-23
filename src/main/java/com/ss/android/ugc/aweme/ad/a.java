package com.ss.android.ugc.aweme.ad;

import a.i;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.Postprocessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.app.f;
import com.ss.android.ugc.aweme.detail.api.DetailApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.awemepushapi.c;
import com.ss.android.ugc.awemepushapi.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2582a;

    /* renamed from: b  reason: collision with root package name */
    public Context f2583b;

    /* renamed from: c  reason: collision with root package name */
    private List<String> f2584c = Arrays.asList(new String[]{"aweme/detail_list", "aweme/detail"});

    public a(Context context) {
        this.f2583b = context;
    }

    public final void a(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f2582a, false, 67208, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f2582a, false, 67208, new Class[]{c.class}, Void.TYPE);
        } else if (AbTestManager.a().d().enableNotificationPrefetchVideo != 0) {
            JSONObject originData = cVar.getOriginData();
            if (originData != null && !TextUtils.isEmpty(originData.optString(f.f34168b))) {
                final List<String> a2 = a(originData.optString(f.f34168b));
                if (a2 != null && a2.size() != 0) {
                    i.a((Callable<TResult>) new Callable<Aweme>() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f33197a;

                        public final /* synthetic */ Object call() throws Exception {
                            boolean z = false;
                            if (PatchProxy.isSupport(new Object[0], this, f33197a, false, 67214, new Class[0], Aweme.class)) {
                                return (Aweme) PatchProxy.accessDispatch(new Object[0], this, f33197a, false, 67214, new Class[0], Aweme.class);
                            }
                            Aweme b2 = com.ss.android.ugc.aweme.feed.a.a().b((String) a2.get(0));
                            if (b2 == null) {
                                b2 = DetailApi.a((String) a2.get(0), "push");
                            }
                            if (b2 != null && !TextUtils.isEmpty(b2.getAid()) && NetworkUtils.isWifi(a.this.f2583b)) {
                                a aVar = a.this;
                                if (PatchProxy.isSupport(new Object[]{b2}, aVar, a.f2582a, false, 67211, new Class[]{Aweme.class}, Boolean.TYPE)) {
                                    a aVar2 = aVar;
                                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{b2}, aVar2, a.f2582a, false, 67211, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
                                } else if (!(b2 == null || b2.getStatus() == null)) {
                                    z = b2.getStatus().isDelete();
                                }
                                if (!z) {
                                    return b2;
                                }
                            }
                            return null;
                        }
                    }).a((a.g<TResult, TContinuationResult>) new a.g<Aweme, Void>() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f33195a;

                        public final /* synthetic */ Object then(i iVar) throws Exception {
                            if (PatchProxy.isSupport(new Object[]{iVar}, this, f33195a, false, 67213, new Class[]{i.class}, Void.class)) {
                                return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f33195a, false, 67213, new Class[]{i.class}, Void.class);
                            }
                            if (iVar.b()) {
                                a aVar = a.this;
                                Aweme aweme = (Aweme) iVar.e();
                                if (PatchProxy.isSupport(new Object[]{aweme}, aVar, a.f2582a, false, 67209, new Class[]{Aweme.class}, Void.TYPE)) {
                                    a aVar2 = aVar;
                                    PatchProxy.accessDispatch(new Object[]{aweme}, aVar2, a.f2582a, false, 67209, new Class[]{Aweme.class}, Void.TYPE);
                                } else if (aweme != null) {
                                    if (PatchProxy.isSupport(new Object[]{aweme}, aVar, a.f2582a, false, 67212, new Class[]{Aweme.class}, Void.TYPE)) {
                                        a aVar3 = aVar;
                                        PatchProxy.accessDispatch(new Object[]{aweme}, aVar3, a.f2582a, false, 67212, new Class[]{Aweme.class}, Void.TYPE);
                                    } else if (!(aweme == null || aweme.getVideo() == null || aweme.getVideo().getOriginCover() == null || !Fresco.hasBeenInitialized())) {
                                        ImageRequest[] a2 = com.ss.android.ugc.aweme.base.c.a(aweme.getVideo().getOriginCover(), (ResizeOptions) null, Priority.HIGH, (Postprocessor) null);
                                        if (!(a2 == null || a2.length == 0)) {
                                            Fresco.getImagePipeline().prefetchToDiskCache(a2[0], aVar.f2583b, Priority.LOW);
                                        }
                                    }
                                    com.ss.android.ugc.aweme.video.preload.g.f().a(aweme, 10485759);
                                }
                            }
                            return null;
                        }
                    }, i.f1052b);
                }
            }
        }
    }

    private List<String> a(String str) {
        boolean z;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f2582a, false, 67210, new Class[]{String.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{str2}, this, f2582a, false, 67210, new Class[]{String.class}, List.class);
        }
        String str3 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator<String> it2 = this.f2584c.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (str2.contains(it2.next())) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            return null;
        }
        Uri parse = Uri.parse(str);
        List<String> pathSegments = parse.getPathSegments();
        if (pathSegments == null || pathSegments.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String str4 = pathSegments.get(0);
        char c2 = 65535;
        int hashCode = str4.hashCode();
        if (hashCode != -2050303028) {
            if (hashCode == -1335224239 && str4.equals("detail")) {
                c2 = 0;
            }
        } else if (str4.equals("detail_list")) {
            c2 = 1;
        }
        switch (c2) {
            case 0:
                arrayList.add(pathSegments.get(pathSegments.size() - 1));
                break;
            case 1:
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames.contains("gids")) {
                    str3 = parse.getQueryParameter("gids");
                } else if (queryParameterNames.contains("push_params")) {
                    try {
                        str3 = new JSONObject(parse.getQueryParameter("push_params")).getString("gids");
                    } catch (JSONException unused) {
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    arrayList.addAll(Arrays.asList(str3.split(",")));
                    break;
                }
                break;
        }
        return arrayList;
    }
}

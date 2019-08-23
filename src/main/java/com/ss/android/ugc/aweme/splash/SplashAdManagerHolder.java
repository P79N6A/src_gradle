package com.ss.android.ugc.aweme.splash;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.view.DraweeHolder;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.facebook.fresco.animation.drawable.AnimationListener;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ad.splash.d;
import com.ss.android.ad.splash.g;
import com.ss.android.ad.splash.j;
import com.ss.android.ad.splash.l;
import com.ss.android.ad.splash.n;
import com.ss.android.ad.splash.o;
import com.ss.android.ad.splash.p;
import com.ss.android.ad.splash.q;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.newmedia.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commercialize.log.c;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.log.z;
import com.ss.android.ugc.aweme.commercialize.splash.SplashAdApi;
import com.ss.android.ugc.aweme.commercialize.utils.aj;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.a;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import java.io.File;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

public class SplashAdManagerHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71578a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f71579b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile l f71580c;

    static class SplashAdEventListenerImpl implements d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71581a;

        /* renamed from: b  reason: collision with root package name */
        private final Context f71582b;

        class MobJobTask implements LegoTask {
            public static ChangeQuickRedirect changeQuickRedirect;
            JSONObject extJson;
            long extValue;
            String label;
            String tag;
            long value;

            @NotNull
            public f type() {
                return f.BOOT_FINISH;
            }

            public void run(@NotNull Context context) {
                if (PatchProxy.isSupport(new Object[]{context}, this, changeQuickRedirect, false, 81902, new Class[]{Context.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context}, this, changeQuickRedirect, false, 81902, new Class[]{Context.class}, Void.TYPE);
                    return;
                }
                com.ss.android.ugc.aweme.framework.a.a.a("MobJobTask");
                r.a(context, this.tag, this.label, String.valueOf(this.value), this.extValue, this.extJson);
            }

            MobJobTask(String str, String str2, long j, long j2, JSONObject jSONObject) {
                this.tag = str;
                this.label = str2;
                this.value = j;
                this.extValue = j2;
                this.extJson = jSONObject;
            }
        }

        SplashAdEventListenerImpl(Context context) {
            this.f71582b = context;
        }

        public final void a(com.ss.android.ad.splash.a.a aVar) {
            com.ss.android.ad.splash.a.a aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{aVar2}, this, f71581a, false, 81901, new Class[]{com.ss.android.ad.splash.a.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar2}, this, f71581a, false, 81901, new Class[]{com.ss.android.ad.splash.a.a.class}, Void.TYPE);
                return;
            }
            c.a a2 = new c.a().a(aVar2.f22781b);
            a2.f39300b = aVar2.f22780a;
            a2.b(aVar2.f22782c).a(aVar2.f22783d).c(aVar2.f22784e).b(aVar2.f22785f).a(aVar2.g).a().a();
        }

        @MeasureFunction
        public final void a(String str, String str2, long j, long j2, JSONObject jSONObject) {
            String str3;
            String str4 = str;
            String str5 = str2;
            long j3 = j;
            if (PatchProxy.isSupport(new Object[]{str4, str5, new Long(j3), 0L, jSONObject}, this, f71581a, false, 81900, new Class[]{String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str4, str5, new Long(j3), 0L, jSONObject}, this, f71581a, false, 81900, new Class[]{String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE);
                return;
            }
            StringBuilder sb = new StringBuilder("onEvent :  tag = ");
            sb.append(str4);
            sb.append(" label = ");
            sb.append(str5);
            sb.append(" value = ");
            sb.append(j3);
            sb.append(" ext_value = 0");
            sb.append(" extJson = ");
            if (jSONObject == null) {
                str3 = "";
            } else {
                str3 = jSONObject.toString();
            }
            sb.append(str3);
            a.f a2 = com.ss.android.ugc.aweme.lego.a.i.a();
            MobJobTask mobJobTask = new MobJobTask(str, str2, j, 0, jSONObject);
            a2.a(mobJobTask).a();
        }
    }

    static class a implements n {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71583a;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final void a(@NonNull ImageView imageView, String str, int i, @NonNull g gVar) {
            Drawable drawable;
            ImageView imageView2 = imageView;
            String str2 = str;
            g gVar2 = gVar;
            if (PatchProxy.isSupport(new Object[]{imageView2, str2, Integer.valueOf(i), gVar2}, this, f71583a, false, 81903, new Class[]{ImageView.class, String.class, Integer.TYPE, g.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{imageView2, str2, Integer.valueOf(i), gVar2}, this, f71583a, false, 81903, new Class[]{ImageView.class, String.class, Integer.TYPE, g.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.commercialize.splash.a.a().i = false;
            if (!com.ss.android.ad.splash.utils.g.a(str)) {
                if (((long) i) == 1) {
                    Context context = GlobalContext.getContext();
                    if (PatchProxy.isSupport(new Object[]{context, str2, gVar2}, null, n.f71610a, true, 81883, new Class[]{Context.class, String.class, g.class}, Drawable.class)) {
                        drawable = (Drawable) PatchProxy.accessDispatch(new Object[]{context, str2, gVar2}, null, n.f71610a, true, 81883, new Class[]{Context.class, String.class, g.class}, Drawable.class);
                    } else {
                        AbstractDraweeController build = ((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setImageRequest(ImageRequestBuilder.newBuilderWithSource(Uri.parse("file://" + str2)).build())).setControllerListener(new BaseControllerListener<ImageInfo>(gVar2) {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f71611a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ g f71612b;

                            {
                                this.f71612b = r1;
                            }

                            public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                                ImageInfo imageInfo = (ImageInfo) obj;
                                if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f71611a, false, 81884, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f71611a, false, 81884, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                                    return;
                                }
                                if (animatable != null) {
                                    try {
                                        AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable;
                                        animatedDrawable2.setAnimationBackend(new a(animatedDrawable2.getAnimationBackend(), 1));
                                        try {
                                            animatedDrawable2.setAnimationListener(new AnimationListener() {

                                                /* renamed from: a  reason: collision with root package name */
                                                public static ChangeQuickRedirect f71613a;

                                                public final void onAnimationFrame(AnimatedDrawable2 animatedDrawable2, int i) {
                                                }

                                                public final void onAnimationRepeat(AnimatedDrawable2 animatedDrawable2) {
                                                }

                                                public final void onAnimationReset(AnimatedDrawable2 animatedDrawable2) {
                                                }

                                                public final void onAnimationStart(AnimatedDrawable2 animatedDrawable2) {
                                                }

                                                public final void onAnimationStop(AnimatedDrawable2 animatedDrawable2) {
                                                    if (PatchProxy.isSupport(new Object[]{animatedDrawable2}, this, f71613a, false, 81885, new Class[]{AnimatedDrawable2.class}, Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[]{animatedDrawable2}, this, f71613a, false, 81885, new Class[]{AnimatedDrawable2.class}, Void.TYPE);
                                                        return;
                                                    }
                                                    AnonymousClass1.this.f71612b.a();
                                                }
                                            });
                                            animatable.start();
                                        } catch (Throwable th) {
                                            th = th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        com.ss.android.ugc.aweme.util.c.a("frescoOpenGifSplashError: e = " + th.toString());
                                        com.ss.android.ugc.aweme.framework.a.a.a(th);
                                    }
                                }
                            }
                        })).setAutoPlayAnimations(false)).build();
                        DraweeHolder create = DraweeHolder.create(new GenericDraweeHierarchyBuilder(context.getResources()).build(), context);
                        create.setController(build);
                        drawable = create.getTopLevelDrawable();
                    }
                    imageView2.setImageDrawable(drawable);
                    return;
                }
                Context context2 = GlobalContext.getContext();
                Bitmap a2 = SplashAdManagerHolder.a(str2, UIUtils.getScreenWidth(context2), UIUtils.getScreenHeight(context2));
                if (a2 != null) {
                    imageView2.setImageBitmap(a2);
                }
            }
        }
    }

    static class b implements q {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71584a;

        /* renamed from: b  reason: collision with root package name */
        SplashAdApi f71585b;

        private b() {
            this.f71585b = (SplashAdApi) m.a("https://aweme.snssdk.com", null).create(SplashAdApi.class);
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        public final o b(@NonNull String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f71584a, false, 81908, new Class[]{String.class}, o.class)) {
                return (o) PatchProxy.accessDispatch(new Object[]{str2}, this, f71584a, false, 81908, new Class[]{String.class}, o.class);
            }
            try {
                try {
                    return new o(new o.a().a(true).a(new JSONObject((String) this.f71585b.executeGet(0, str2).execute().body())));
                } catch (JSONException unused) {
                    return null;
                }
            } catch (Exception unused2) {
                return null;
            }
        }

        @WorkerThread
        public final com.ss.android.ad.splash.core.e.f a(@NonNull String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f71584a, false, 81906, new Class[]{String.class}, com.ss.android.ad.splash.core.e.f.class)) {
                return (com.ss.android.ad.splash.core.e.f) PatchProxy.accessDispatch(new Object[]{str2}, this, f71584a, false, 81906, new Class[]{String.class}, com.ss.android.ad.splash.core.e.f.class);
            }
            if (PatchProxy.isSupport(new Object[]{str2, (byte) 1}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31727, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, (byte) 1}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31727, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            } else if (!TextUtils.isEmpty(str)) {
                LinkedList linkedList = new LinkedList();
                linkedList.add(str2);
                com.ss.android.ugc.aweme.commercialize.log.g.a((g.a) null, (Collection<String>) linkedList, true);
            }
            return null;
        }

        @WorkerThread
        public final o a(@NonNull String str, @Nullable String str2) {
            String str3;
            String str4;
            String str5 = str;
            if (PatchProxy.isSupport(new Object[]{str5, str2}, this, f71584a, false, 81904, new Class[]{String.class, String.class}, o.class)) {
                return (o) PatchProxy.accessDispatch(new Object[]{str5, str2}, this, f71584a, false, 81904, new Class[]{String.class, String.class}, o.class);
            } else if (com.ss.android.ad.splash.utils.g.a(str)) {
                return null;
            } else {
                try {
                    SplashAdApi splashAdApi = this.f71585b;
                    if (PatchProxy.isSupport(new Object[]{str5}, null, SplashAdManagerHolder.f71578a, true, 81898, new Class[]{String.class}, String.class)) {
                        str4 = (String) PatchProxy.accessDispatch(new Object[]{str5}, null, SplashAdManagerHolder.f71578a, true, 81898, new Class[]{String.class}, String.class);
                    } else {
                        if (!TextUtils.isEmpty(com.ss.android.ugc.aweme.account.d.a().getCurUserId())) {
                            str5 = str5 + "&user_id=" + r4;
                        }
                        if (com.ss.android.g.a.a()) {
                            String str6 = str5 + "&gaid=" + URLEncoder.encode(SplashAdManagerHolder.a());
                            str5 = str6 + "&android_id=" + URLEncoder.encode(SplashAdManagerHolder.b());
                            if (!TextUtils.isEmpty(z.a())) {
                                str5 = str5 + "&ad_user_agent=" + URLEncoder.encode(r4);
                            }
                        }
                        if (!com.ss.android.g.a.a()) {
                            String str7 = PushConstants.PUSH_TYPE_NOTIFY;
                            String str8 = PushConstants.PUSH_TYPE_NOTIFY;
                            com.ss.android.ugc.aweme.poi.a f2 = af.a(com.ss.android.ugc.aweme.base.utils.d.a()).f();
                            if (f2 != null) {
                                str7 = String.valueOf(f2.latitude);
                                str8 = String.valueOf(f2.longitude);
                            }
                            String str9 = str5 + "&longitude=" + str8;
                            str5 = str9 + "&latitude=" + str7;
                        }
                        str4 = "https://aweme.snssdk.com" + str5;
                    }
                    str3 = (String) splashAdApi.executeGet(0, str4).execute().body();
                } catch (Exception unused) {
                    str3 = null;
                }
                if (str3 == null) {
                    str3 = "";
                }
                try {
                    return new o(new o.a().a(!TextUtils.isEmpty(str3)).a(new JSONObject(str3)));
                } catch (JSONException unused2) {
                    return null;
                }
            }
        }

        public final boolean a(@NonNull String str, @NonNull String str2, @NonNull com.ss.android.ad.splash.b bVar) {
            boolean z;
            String str3 = str2;
            if (PatchProxy.isSupport(new Object[]{str, str3, bVar}, this, f71584a, false, 81905, new Class[]{String.class, String.class, com.ss.android.ad.splash.b.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, str3, bVar}, this, f71584a, false, 81905, new Class[]{String.class, String.class, com.ss.android.ad.splash.b.class}, Boolean.TYPE)).booleanValue();
            } else if (com.ss.android.ad.splash.utils.g.a(str) || com.ss.android.ad.splash.utils.g.a(str2)) {
                return false;
            } else {
                File file = new File(str3);
                if (file.exists()) {
                    return true;
                }
                String str4 = str3 + ".tmp";
                try {
                    if (PatchProxy.isSupport(new Object[]{-1, str, str4}, null, SplashAdManagerHolder.f71578a, true, 81894, new Class[]{Integer.TYPE, String.class, String.class}, Boolean.TYPE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[]{-1, str, str4}, null, SplashAdManagerHolder.f71578a, true, 81894, new Class[]{Integer.TYPE, String.class, String.class}, Boolean.TYPE)).booleanValue();
                    } else if (TextUtils.isEmpty(str4)) {
                        z = false;
                    } else {
                        int lastIndexOf = str4.lastIndexOf("/") + 1;
                        z = e.a(GlobalContext.getContext(), -1, str, null, str4.substring(0, lastIndexOf), "", str4.substring(lastIndexOf), null, null);
                    }
                    if (z) {
                        File file2 = new File(str4);
                        if (file2.renameTo(file)) {
                            return true;
                        }
                        if (file2.exists()) {
                            file2.delete();
                        }
                        return false;
                    }
                } catch (Throwable unused) {
                }
                return false;
            }
        }

        public final o a(@NonNull String str, int i, HashMap<String, String> hashMap, JSONObject jSONObject) {
            String str2;
            String str3 = str;
            if (PatchProxy.isSupport(new Object[]{str3, 3, null, jSONObject}, this, f71584a, false, 81907, new Class[]{String.class, Integer.TYPE, HashMap.class, JSONObject.class}, o.class)) {
                return (o) PatchProxy.accessDispatch(new Object[]{str3, 3, null, jSONObject}, this, f71584a, false, 81907, new Class[]{String.class, Integer.TYPE, HashMap.class, JSONObject.class}, o.class);
            }
            try {
                if (PatchProxy.isSupport(new Object[]{str3, 3, null, jSONObject}, this, f71584a, false, 81909, new Class[]{String.class, Integer.TYPE, HashMap.class, JSONObject.class}, o.class)) {
                    return (o) PatchProxy.accessDispatch(new Object[]{str3, 3, null, jSONObject}, this, f71584a, false, 81909, new Class[]{String.class, Integer.TYPE, HashMap.class, JSONObject.class}, o.class);
                }
                String str4 = "https://aweme.snssdk.com" + str3;
                switch (3) {
                    case 1:
                        str2 = (String) this.f71585b.executeGet(0, str4).execute().body();
                        break;
                    case 2:
                        str2 = (String) this.f71585b.executePost(0, str4, (Map<String, String>) null).execute().body();
                        break;
                    case 3:
                        str2 = (String) this.f71585b.executePost(0, str4, (TypedOutput) new TypedByteArray("application/json", jSONObject.toString().getBytes("UTF-8"), new String[0])).execute().body();
                        break;
                    default:
                        return null;
                }
                return new o(new o.a().a(true).a(new JSONObject(str2)));
            } catch (Exception unused) {
                return null;
            }
        }
    }

    private static long c() {
        if (PatchProxy.isSupport(new Object[0], null, f71578a, true, 81899, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], null, f71578a, true, 81899, new Class[0], Long.TYPE)).longValue();
        }
        try {
            return com.ss.android.ugc.aweme.global.config.settings.g.b().ba().longValue();
        } catch (com.bytedance.ies.a unused) {
            return 0;
        }
    }

    static String a() {
        if (PatchProxy.isSupport(new Object[0], null, f71578a, true, 81895, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f71578a, true, 81895, new Class[0], String.class);
        }
        String str = null;
        try {
            str = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getAdvertisingIdOb();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
        }
        if (str == null) {
            str = "";
        }
        return str;
    }

    static String b() {
        if (PatchProxy.isSupport(new Object[0], null, f71578a, true, 81896, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f71578a, true, 81896, new Class[0], String.class);
        }
        String str = null;
        try {
            str = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getAndroidId();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
        }
        if (str == null) {
            str = "";
        }
        return str;
    }

    public static l a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f71578a, true, 81886, new Class[]{Context.class}, l.class)) {
            return (l) PatchProxy.accessDispatch(new Object[]{context}, null, f71578a, true, 81886, new Class[]{Context.class}, l.class);
        }
        c(context);
        return f71580c;
    }

    public static j b(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f71578a, true, 81887, new Class[]{Context.class}, j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[]{context}, null, f71578a, true, 81887, new Class[]{Context.class}, j.class);
        }
        c(context);
        return com.ss.android.ad.splash.f.b(context);
    }

    private static void c(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f71578a, true, 81888, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, null, f71578a, true, 81888, new Class[]{Context.class}, Void.TYPE);
        } else if (!f71579b) {
            synchronized (SplashAdManagerHolder.class) {
                if (!f71579b) {
                    d(context);
                    f71580c = com.ss.android.ad.splash.f.a(context);
                    a(context.getApplicationContext(), f71580c);
                    f71579b = true;
                }
            }
        }
    }

    private static void d(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f71578a, true, 81889, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f71578a, true, 81889, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        User curUser = com.ss.android.ugc.aweme.account.d.a().getCurUser();
        if (curUser != null) {
            hashMap.put("user_mode", a(curUser));
            hashMap.put("user_period", Integer.toString(curUser.getUserPeriod()));
        }
        aj.a(context2, hashMap);
    }

    private static String e(@NonNull Context context) throws Exception {
        if (PatchProxy.isSupport(new Object[]{context}, null, f71578a, true, 81892, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context}, null, f71578a, true, 81892, new Class[]{Context.class}, String.class);
        }
        System.currentTimeMillis();
        return Environment.getExternalStorageDirectory().getPath() + "/Android/data/" + context.getPackageName() + "/splashCache/";
    }

    private static String a(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, null, f71578a, true, 81890, new Class[]{User.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{user}, null, f71578a, true, 81890, new Class[]{User.class}, String.class);
        }
        int intValue = ((Integer) SharePrefCache.inst().getPersonalizationMode().c()).intValue();
        if (!com.ss.android.g.a.b() || (intValue != 2 && intValue != 0)) {
            return Integer.toString(user.getUserMode());
        }
        return Integer.toString(user.getUserMode() | 4);
    }

    private static void a(Context context, l lVar) {
        boolean z;
        Context context2 = context;
        l lVar2 = lVar;
        if (PatchProxy.isSupport(new Object[]{context2, lVar2}, null, f71578a, true, 81891, new Class[]{Context.class, l.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, lVar2}, null, f71578a, true, 81891, new Class[]{Context.class, l.class}, Void.TYPE);
            return;
        }
        if (((Boolean) x.a().B().c()).booleanValue() || com.ss.android.ugc.aweme.g.a.a()) {
            z = true;
        } else {
            z = false;
        }
        lVar2.c(z).a((n) new a((byte) 0)).a((q) new b((byte) 0)).a(AbTestManager.a().bX()).a(TimeUnit.DAYS.toMillis(10)).a(2).e(true).a((d) new SplashAdEventListenerImpl(context2)).b(c()).b(false).d(com.ss.android.ugc.aweme.global.config.settings.g.b().aR().booleanValue());
        aj.a(lVar);
        try {
            lVar2.a(e(context), true);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
        }
        boolean a2 = com.ss.android.g.a.a();
        boolean a3 = com.ss.android.g.a.a();
        if (((Boolean) x.a().z().c()).booleanValue()) {
            a2 = true;
        }
        if (((Boolean) x.a().A().c()).booleanValue()) {
            a3 = true;
        }
        p h = com.ss.android.ad.splash.f.c(context).d(2130840560).c(C0906R.style.l3).f(2130840561).e(C0906R.string.c_c).g(C0906R.string.c_b).i(a2 ? 1 : 0).h(a3 ? 1 : 0);
        if (com.ss.android.g.a.a()) {
            h.a(false, 0);
        } else {
            h.a(true, 0);
        }
    }

    private static int a(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outWidth / 2;
        int i4 = options.outHeight / 2;
        int i5 = 1;
        while (i3 / i5 >= i && i4 / i5 >= i2) {
            i5 *= 2;
        }
        return i5;
    }

    public static Bitmap a(String str, int i, int i2) {
        Bitmap bitmap;
        String str2 = str;
        int i3 = i;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f71578a, true, 81893, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f71578a, true, 81893, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Bitmap.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            if (i3 <= 0 || i4 <= 0) {
                return BitmapFactory.decodeFile(str);
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            Bitmap decodeFile = BitmapFactory.decodeFile(str2, options);
            options.inSampleSize = a(options, i3, i4);
            options.inJustDecodeBounds = false;
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            options.inPurgeable = true;
            options.inInputShareable = true;
            try {
                bitmap = BitmapFactory.decodeFile(str2, options);
            } catch (Exception unused) {
                bitmap = decodeFile;
            }
            return bitmap;
        }
    }
}

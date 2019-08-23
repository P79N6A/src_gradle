package com.ss.android.ugc.aweme.miniapp_api.services;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.krypton.annotation.OutService;
import com.ss.android.ugc.aweme.miniapp_api.a.b;
import com.ss.android.ugc.aweme.miniapp_api.a.c;
import com.ss.android.ugc.aweme.miniapp_api.a.d;
import com.ss.android.ugc.aweme.miniapp_api.a.e;
import com.ss.android.ugc.aweme.miniapp_api.a.f;
import com.ss.android.ugc.aweme.miniapp_api.a.g;

@Keep
@OutService
public interface IMiniAppService {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f3606a;

        /* renamed from: b  reason: collision with root package name */
        public String f3607b;

        /* renamed from: c  reason: collision with root package name */
        public String f3608c;

        /* renamed from: d  reason: collision with root package name */
        public String f3609d;

        /* renamed from: e  reason: collision with root package name */
        public String f3610e;

        /* renamed from: f  reason: collision with root package name */
        public f f3611f;
        public c g;
        public e h;
        public d i;
        public com.ss.android.ugc.aweme.miniapp_api.a.a j;
        public b k;
        public g l;
    }

    String buildSchema(com.ss.android.ugc.aweme.miniapp_api.model.f fVar);

    String buildSchema(String str, String str2, boolean z);

    boolean checkMiniAppEnable(Context context);

    void deferredInstallDynamicModule();

    String getAppId(String str);

    com.bytedance.morpheus.core.a getDynamicFeatureStateListener();

    com.ss.android.ugc.aweme.miniapp_api.model.e getFollowRelation(String str, long j) throws Exception;

    String getJsSdkVersion();

    com.ss.android.ugc.aweme.miniapp_api.model.g getMicroAppList(int i, int i2, int i3) throws Exception;

    void initialize(Application application, a aVar);

    boolean isAppBrandSchema(String str);

    boolean isMicroAppSchema(String str);

    boolean isMicroGameSchema(String str);

    boolean isMinAppAvailable(Context context, String str);

    void jumpToMiniApp(Context context, String str, String str2, boolean z, String str3, String str4);

    void logExcitingVideoAd(Context context, String str, long j, String str2);

    void onRequestPermissionsResult(Activity activity, @NonNull String[] strArr, @NonNull int[] iArr);

    boolean openMiniApp(Context context, String str, com.ss.android.ugc.aweme.miniapp_api.model.b bVar);

    void openMircoAppList(Activity activity);

    void preloadMiniApp(String str);

    void preloadMiniApp(String str, int i);

    void testOpenMiNi(Context context);

    void tryLoadMiniAppPlugin();
}

package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.aweme.storage.c;
import com.aweme.storage.g;
import com.aweme.storage.h;
import com.aweme.storage.i;
import com.aweme.storage.n;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.shortvideo.util.p;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/legoImp/task/StorageTask;", "Lcom/ss/android/ugc/aweme/lego/LegoTask;", "()V", "run", "", "context", "Landroid/content/Context;", "type", "Lcom/ss/android/ugc/aweme/lego/WorkType;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StorageTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J0\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\r"}, d2 = {"com/ss/android/ugc/aweme/legoImp/task/StorageTask$run$1", "Lcom/aweme/storage/IMonitor;", "monitorCommonLog", "", "event", "", "obj", "Lorg/json/JSONObject;", "monitorEvent", "serviceName", "category", "metric", "extraLog", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53135a;

        a() {
        }

        public final void a(@Nullable String str, @Nullable JSONObject jSONObject) {
            if (PatchProxy.isSupport(new Object[]{str, jSONObject}, this, f53135a, false, 55312, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, jSONObject}, this, f53135a, false, 55312, new Class[]{String.class, JSONObject.class}, Void.TYPE);
                return;
            }
            MonitorUtils.monitorCommonLog(str, jSONObject);
        }

        public final void a(@Nullable String str, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3) {
            String str2 = str;
            JSONObject jSONObject4 = jSONObject2;
            if (PatchProxy.isSupport(new Object[]{str2, null, jSONObject4, null}, this, f53135a, false, 55313, new Class[]{String.class, JSONObject.class, JSONObject.class, JSONObject.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, null, jSONObject4, null}, this, f53135a, false, 55313, new Class[]{String.class, JSONObject.class, JSONObject.class, JSONObject.class}, Void.TYPE);
                return;
            }
            MonitorUtils.monitorEvent(str2, null, jSONObject4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/legoImp/task/StorageTask$run$2", "Lcom/aweme/storage/IOnCleanStart;", "getNonDeleteList", "", "", "isHome", "", "onClean", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements h {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53136a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f53137b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f53136a, false, 55314, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53136a, false, 55314, new Class[0], Void.TYPE);
            } else if (this.f53137b != null) {
                p.a(this.f53137b.getApplicationContext());
            }
        }

        @NotNull
        public final Set<String> b() {
            if (PatchProxy.isSupport(new Object[0], this, f53136a, false, 55315, new Class[0], Set.class)) {
                return (Set) PatchProxy.accessDispatch(new Object[0], this, f53136a, false, 55315, new Class[0], Set.class);
            }
            Set<String> a2 = p.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "FileCacheCleaner.getNoneDeleteWhiteList()");
            return a2;
        }

        public final boolean c() {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, f53136a, false, 55316, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f53136a, false, 55316, new Class[0], Boolean.TYPE)).booleanValue();
            }
            com.ss.android.ugc.aweme.framework.core.a b2 = com.ss.android.ugc.aweme.framework.core.a.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "AppTracker.get()");
            if (b2.a() == null) {
                z = true;
            }
            return z;
        }

        b(Context context) {
            this.f53137b = context;
        }
    }

    @NotNull
    public final f type() {
        return f.BOOT_FINISH;
    }

    public final void run(@NotNull Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 55311, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 55311, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        com.ss.android.ugc.aweme.framework.a.a.a("StorageTask");
        i iVar = new i();
        iVar.f7398c = CollectionsKt.arrayListOf("lib", "CrashLogNative", "code_cache", "aweme-lib-main", "ALOG", ".um", ".umeng", ".Fabric", "__macosx", "lib-main");
        iVar.f7401f = CollectionsKt.arrayListOf("cache/cache/", "lib/", "shared_prefs/", "code_cache/", "aweme-lib-main/", "databases/");
        ArrayList arrayList = new ArrayList();
        if (context.getCacheDir() != null) {
            File cacheDir = context.getCacheDir();
            Intrinsics.checkExpressionValueIsNotNull(cacheDir, "context.cacheDir");
            if (cacheDir.getParent() != null) {
                File cacheDir2 = context.getCacheDir();
                Intrinsics.checkExpressionValueIsNotNull(cacheDir2, "context.cacheDir");
                arrayList.add(new n(PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE, cacheDir2.getParent(), CollectionsKt.arrayListOf(new n.a("databases", "p_databases"), new n.a("no_backup", "p_no_backup"), new n.a("app_webview", "p_app_webview"), new n.a("app_textures", "p_app_textures"), new n.a("shared_prefs", "p_shared_prefs"), new n.a("app_indicators", "p_app_indicators"), new n.a("app_accs", "p_app_accs"), new n.a("app_assets", "p_app_assets"))));
            }
        }
        if (context.getCacheDir() != null) {
            File cacheDir3 = context.getCacheDir();
            Intrinsics.checkExpressionValueIsNotNull(cacheDir3, "context.cacheDir");
            if (cacheDir3.getAbsolutePath() != null) {
                File cacheDir4 = context.getCacheDir();
                Intrinsics.checkExpressionValueIsNotNull(cacheDir4, "context.cacheDir");
                arrayList.add(new n("p_cache", cacheDir4.getAbsolutePath(), CollectionsKt.arrayListOf(new n.a("cache", "p_c_cache"), new n.a("WebView", "p_c_WebView"), new n.a("hashedimages", "p_c_hashedimages"), new n.a("patch_dir", "p_c_patch_dir"), new n.a("org.chromium.android_webview", "p_c_webview"), new n.a("feedCache", "p_c_feedCache"))));
            }
        }
        if (context.getFilesDir() != null) {
            File filesDir = context.getFilesDir();
            Intrinsics.checkExpressionValueIsNotNull(filesDir, "context.filesDir");
            if (filesDir.getAbsolutePath() != null) {
                File filesDir2 = context.getFilesDir();
                Intrinsics.checkExpressionValueIsNotNull(filesDir2, "context.filesDir");
                arrayList.add(new n("p_file", filesDir2.getAbsolutePath(), CollectionsKt.arrayListOf(new n.a("cache", "p_f_cache"), new n.a("draft", "p_f_draft"), new n.a("effect", "p_f_effect"), new n.a("extract_shot", "p_f_extract_shot"), new n.a("filter", "p_f_filter"), new n.a("filters", "p_f_filters"), new n.a("im_resources", "p_f_im_resources"), new n.a("music", "p_f_music"), new n.a("noCopyDraft", "p_f_nocopydraft"), new n.a("offline", "p_f_offline"), new n.a("share", "p_f_share"), new n.a("sticker", "p_f_sticker"), new n.a("tmp", "p_f_tmp"), new n.a("tmp_video", "p_f_tmp_video"), new n.a("beauty-face", "p_f_beauty-face"), new n.a("tt_file_st", "p_f_tt_file_st"), new n.a("netlog", "p_f_netlog"), new n.a("photo", "p_f_photo"), new n.a("font", "p_f_font"), new n.a("benchmark", "p_f_benchmark"), new n.a("AFRequestCache", "p_f_AFRequestCache"), new n.a("keva", "p_f_keva"), new n.a("plugins", "p_f_plugins"), new n.a(".patchs", "p_f_patchs"), new n.a("apks", "p_f_apks"), new n.a(".envelope", "p_f_envelope"), new n.a("awcn_strategy", "p_f_awcn_strategy"), new n.a("stateless", "p_f_stateless"), new n.a("appbrand", "p_f_appbrand"), new n.a("a", "p_f_a"), new n.a("libso", "p_f_libso"), new n.a("pngex", "p_f_pngex"), new n.a("loc_cozip", "p_f_loc_cozip"), new n.a("tdReadTemp", "p_f_tdReadTemp"), new n.a("parallel_upload", "p_f_parallel_upload"), new n.a("effectmodel", "p_f_effectmodel"), new n.a("splitcompat", "p_f_splitcompat"), new n.a("speed_ml", "p_c_speed_ml"))));
            }
        }
        if (context.getExternalCacheDir() != null) {
            File externalCacheDir = context.getExternalCacheDir();
            Intrinsics.checkExpressionValueIsNotNull(externalCacheDir, "context.externalCacheDir");
            if (externalCacheDir.getParent() != null) {
                File externalCacheDir2 = context.getExternalCacheDir();
                Intrinsics.checkExpressionValueIsNotNull(externalCacheDir2, "context.externalCacheDir");
                arrayList.add(new n("external", externalCacheDir2.getParent(), CollectionsKt.arrayListOf(new n.a("bytedance", "e_bytedance"), new n.a("splashCache", "e_splashCache"), new n.a("awemeSplashCache", "e_awemeSplashCache"))));
            }
        }
        if (context2.getExternalFilesDir(null) != null) {
            File externalFilesDir = context2.getExternalFilesDir(null);
            Intrinsics.checkExpressionValueIsNotNull(externalFilesDir, "context.getExternalFilesDir(null)");
            if (externalFilesDir.getAbsolutePath() != null) {
                File externalFilesDir2 = context2.getExternalFilesDir(null);
                Intrinsics.checkExpressionValueIsNotNull(externalFilesDir2, "context.getExternalFilesDir(null)");
                arrayList.add(new n("e_file", externalFilesDir2.getAbsolutePath(), CollectionsKt.arrayListOf(new n.a("cache", "e_f_cache"), new n.a("draft", "e_f_draft"), new n.a("effect", "e_f_effect"), new n.a("extract_shot", "e_f_extract_shot"), new n.a("filter", "e_f_filter"), new n.a("filters", "e_f_filters"), new n.a("im_resources", "e_f_im_resources"), new n.a("music", "e_f_music"), new n.a("noCopyDraft", "e_f_nocopydraft"), new n.a("offline", "e_f_offline"), new n.a("share", "e_f_share"), new n.a("sticker", "e_f_sticker"), new n.a("tmp", "e_f_tmp"), new n.a("tmp_video", "e_f_tmp_video"), new n.a("vesdk", "e_f_vesdk"), new n.a("doctorx", "e_f_doctorx"), new n.a("logs", "e_f_logs"), new n.a(".patchs", "e_f_patchs"), new n.a(".download", "e_f_download"), new n.a("MiPushLog", "e_f_MiPushLog"))));
            }
        }
        if (context.getExternalCacheDir() != null) {
            File externalCacheDir3 = context.getExternalCacheDir();
            Intrinsics.checkExpressionValueIsNotNull(externalCacheDir3, "context.externalCacheDir");
            if (externalCacheDir3.getAbsolutePath() != null) {
                File externalCacheDir4 = context.getExternalCacheDir();
                Intrinsics.checkExpressionValueIsNotNull(externalCacheDir4, "context.externalCacheDir");
                arrayList.add(new n("e_cache", externalCacheDir4.getAbsolutePath(), CollectionsKt.arrayListOf(new n.a("cache", "e_c_cache"), new n.a("picture", "e_c_picture"), new n.a("prefs", "e_c_prefs"), new n.a("netlog", "e_c_netlog"), new n.a("video", "e_c_video"), new n.a("hashedimages", "e_c_hashedimages"), new n.a("tmpimages", "e_c_tmpimages"), new n.a("fonts", "e_c_fonts"), new n.a("awemeCache", "e_c_awemeCache"))));
            }
        }
        iVar.f7399d = arrayList;
        iVar.f7397b = new a();
        iVar.f7396a = new b(context2);
        AbTestManager a2 = AbTestManager.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
        iVar.f7400e = a2.bq();
        c.a(context2, iVar);
    }
}

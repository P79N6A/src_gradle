package com.ss.android.ugc.aweme.shortvideo.mvtemplate.a;

import android.text.TextUtils;
import com.facebook.common.internal.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u0002J\u0012\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u0002J$\u0010\u0014\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0011H\u0002J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/download/MvTemplateDownload;", "Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/download/MvTemplateDownloadListenerAdapter;", "mvThemeData", "Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/MvThemeData;", "(Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/MvThemeData;)V", "downloadData", "Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/download/MvThemeDownloadData;", "downloadListener", "Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/download/MvThemplateDownloadListener;", "downloadEffect", "", "context", "Landroid/content/Context;", "listener", "downloadPosition", "", "isValidMvThemeData", "", "data", "monitorDownloadErrorData", "monitorDownloadMvRes", "e", "Lcom/ss/android/socialbase/downloader/exception/BaseException;", "isSuccess", "onFailed", "entity", "Lcom/ss/android/socialbase/downloader/model/DownloadInfo;", "onProgress", "onStart", "onSuccessed", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68486a;

    /* renamed from: b  reason: collision with root package name */
    public final d f68487b = new d();

    /* renamed from: c  reason: collision with root package name */
    public e f68488c;

    /* renamed from: d  reason: collision with root package name */
    public final j f68489d;

    public a(@NotNull j jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "mvThemeData");
        this.f68489d = jVar;
    }

    public final void a(j jVar) {
        if (PatchProxy.isSupport(new Object[]{jVar}, this, f68486a, false, 78075, new Class[]{j.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar}, this, f68486a, false, 78075, new Class[]{j.class}, Void.TYPE);
        } else if (jVar != null) {
            n.a("mv_resource_download_error_state", 11, c.a().a(PushConstants.WEB_URL, jVar.c()).a("mv_res_id", jVar.a()).a("mv_res_name", jVar.h()).b());
        }
    }

    public final boolean b(j jVar) {
        if (PatchProxy.isSupport(new Object[]{jVar}, this, f68486a, false, 78076, new Class[]{j.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{jVar}, this, f68486a, false, 78076, new Class[]{j.class}, Boolean.TYPE)).booleanValue();
        } else if (jVar != null && !TextUtils.isEmpty(jVar.c()) && !TextUtils.isEmpty(jVar.a())) {
            return true;
        } else {
            return false;
        }
    }

    public final void onProgress(@NotNull DownloadInfo downloadInfo) {
        if (PatchProxy.isSupport(new Object[]{downloadInfo}, this, f68486a, false, 78071, new Class[]{DownloadInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{downloadInfo}, this, f68486a, false, 78071, new Class[]{DownloadInfo.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(downloadInfo, "entity");
        this.f68487b.f68498c = downloadInfo.getDownloadProcess();
        e eVar = this.f68488c;
        if (eVar != null) {
            eVar.a(3, this.f68487b.f68496a, this.f68487b.f68498c, null);
        }
    }

    public final void onStart(@NotNull DownloadInfo downloadInfo) {
        if (PatchProxy.isSupport(new Object[]{downloadInfo}, this, f68486a, false, 78070, new Class[]{DownloadInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{downloadInfo}, this, f68486a, false, 78070, new Class[]{DownloadInfo.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(downloadInfo, "entity");
        e eVar = this.f68488c;
        if (eVar != null) {
            eVar.a(2, this.f68487b.f68496a, 0, null);
        }
    }

    public final void onSuccessed(@NotNull DownloadInfo downloadInfo) {
        if (PatchProxy.isSupport(new Object[]{downloadInfo}, this, f68486a, false, 78072, new Class[]{DownloadInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{downloadInfo}, this, f68486a, false, 78072, new Class[]{DownloadInfo.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(downloadInfo, "entity");
        this.f68487b.f68497b = 3;
        if (c.a().a(this.f68489d)) {
            a(this.f68489d, null, true);
            e eVar = this.f68488c;
            if (eVar != null) {
                eVar.a(1, this.f68487b.f68496a, 100, this.f68489d.d());
            }
        } else {
            e eVar2 = this.f68488c;
            if (eVar2 != null) {
                eVar2.a(-1, this.f68487b.f68496a, 0, null);
            }
        }
    }

    public final void onFailed(@NotNull DownloadInfo downloadInfo, @NotNull BaseException baseException) {
        if (PatchProxy.isSupport(new Object[]{downloadInfo, baseException}, this, f68486a, false, 78073, new Class[]{DownloadInfo.class, BaseException.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{downloadInfo, baseException}, this, f68486a, false, 78073, new Class[]{DownloadInfo.class, BaseException.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(downloadInfo, "entity");
        Intrinsics.checkParameterIsNotNull(baseException, "e");
        a(this.f68489d, baseException, false);
        this.f68487b.f68497b = 3;
        this.f68487b.f68498c = 0;
        e eVar = this.f68488c;
        if (eVar != null) {
            eVar.a(-1, this.f68487b.f68496a, 0, null);
        }
    }

    private final void a(j jVar, BaseException baseException, boolean z) {
        String str;
        if (PatchProxy.isSupport(new Object[]{jVar, baseException, Byte.valueOf(z ? (byte) 1 : 0)}, this, f68486a, false, 78074, new Class[]{j.class, BaseException.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar, baseException, Byte.valueOf(z)}, this, f68486a, false, 78074, new Class[]{j.class, BaseException.class, Boolean.TYPE}, Void.TYPE);
        } else if (jVar != null) {
            if (!b(jVar)) {
                a(jVar);
            }
            if (z) {
                n.a("mv_resource_download_error_state", 0, (JSONObject) null);
                return;
            }
            c a2 = c.a().a(PushConstants.WEB_URL, jVar.c()).a("mv_res_id", jVar.a()).a("mv_res_name", jVar.h());
            if (baseException == null) {
                str = "";
            } else {
                str = k.c(baseException);
            }
            n.a("mv_resource_download_error_state", 1, a2.a("exception", str).b());
        }
    }
}

package com.ss.android.ugc.aweme.shortvideo.festival;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.a.b.d;
import com.ss.android.ugc.a.c;
import com.ss.android.ugc.a.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.festival.common.a;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.model.ActivityStruct;
import com.ss.android.ugc.aweme.utils.bm;
import com.ss.android.ugc.aweme.utils.fd;
import java.io.File;

public enum k implements d {
    INSTANCE;
    
    private static final String SHARE_DIR = null;
    private static final String SHARE_WATER_DIR = null;
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mDestFilePath;
    private boolean mHasStartDownload;
    private String mWaterFilePrefix;

    public final void onCancel() {
    }

    public final void onDownloadPause() {
    }

    public final void onDownloadProgress(int i, long j, long j2) {
    }

    public final void onDownloadRestart() {
    }

    public final void onDownloadStart(int i) {
    }

    public final void onError(c cVar) {
    }

    @Nullable
    public final String getWaterPicDir() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77246, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77246, new Class[0], String.class);
        } else if (g.a()) {
            return this.mDestFilePath;
        } else {
            return "";
        }
    }

    static {
        SHARE_DIR = ((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig().shortVideoRootDir() + "share" + File.separator;
        SHARE_WATER_DIR = SHARE_DIR + "water" + File.separator;
    }

    private boolean checkHasDownload() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77240, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77240, new Class[0], Boolean.TYPE)).booleanValue();
        }
        String downloadUrl = getDownloadUrl();
        if (TextUtils.isEmpty(downloadUrl)) {
            return false;
        }
        File file = new File(getUnZipFilePath(downloadUrl));
        if (!file.exists() || file.listFiles().length <= 0) {
            return false;
        }
        this.mDestFilePath = file.getPath();
        return true;
    }

    @Nullable
    private String getDownloadUrl() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77242, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77242, new Class[0], String.class);
        }
        ActivityStruct.WatermarkStruct watermarkStruct = getWatermarkStruct();
        if (watermarkStruct == null || watermarkStruct.waterResource == null) {
            return null;
        }
        UrlModel urlModel = watermarkStruct.waterResource;
        if (urlModel == null || Lists.isEmpty(urlModel.getUrlList())) {
            return null;
        }
        return urlModel.getUrlList().get(0);
    }

    @Nullable
    private ActivityStruct.WatermarkStruct getWatermarkStruct() {
        a aVar;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77245, new Class[0], ActivityStruct.WatermarkStruct.class)) {
            return (ActivityStruct.WatermarkStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77245, new Class[0], ActivityStruct.WatermarkStruct.class);
        }
        if (PatchProxy.isSupport(new Object[0], null, g.f67700a, true, 77218, new Class[0], a.class)) {
            aVar = (a) PatchProxy.accessDispatch(new Object[0], null, g.f67700a, true, 77218, new Class[0], a.class);
        } else {
            aVar = f.a().f67697c;
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f47292f;
    }

    public final void init() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77239, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77239, new Class[0], Void.TYPE);
        } else if (!g.a()) {
            bm.c(SHARE_WATER_DIR);
        } else if (!checkHasDownload() && !this.mHasStartDownload) {
            this.mHasStartDownload = true;
            this.mDestFilePath = "";
            bm.c(SHARE_WATER_DIR);
            bm.a(SHARE_WATER_DIR, false);
            startDownload(getDownloadUrl());
        }
    }

    private String getUnZipFilePath(@NonNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 77241, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 77241, new Class[]{String.class}, String.class);
        }
        return SHARE_WATER_DIR + DigestUtils.md5Hex(str);
    }

    private void startDownload(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 77243, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 77243, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            this.mWaterFilePrefix = getUnZipFilePath(str);
            String str2 = this.mWaterFilePrefix + ".zip";
            bm.a(str2, true);
            com.ss.android.ugc.aweme.app.application.initialization.a.a(new e.a().a(str).b(str2).a(), (d) this);
        }
    }

    public final void onDownloadSuccess(String str) {
        boolean z;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 77244, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 77244, new Class[]{String.class}, Void.TYPE);
            return;
        }
        File file = new File(str2);
        if (getWatermarkStruct() != null) {
            String str3 = getWatermarkStruct().md5;
            if (PatchProxy.isSupport(new Object[]{file, str3}, null, h.f67701a, true, 77222, new Class[]{File.class, String.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{file, str3}, null, h.f67701a, true, 77222, new Class[]{File.class, String.class}, Boolean.TYPE)).booleanValue();
            } else if (!file.exists()) {
                z = false;
            } else {
                z = TextUtils.equals(DigestUtils.md5Hex(file), str3);
            }
            if (z) {
                bm.a(this.mWaterFilePrefix, false);
                File file2 = new File(this.mWaterFilePrefix);
                if (!file2.exists() || file2.listFiles().length <= 0) {
                    try {
                        fd.a(file, file2);
                        this.mDestFilePath = file2.getPath();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                } else {
                    this.mDestFilePath = file2.getPath();
                    return;
                }
            }
        }
        bm.c(SHARE_WATER_DIR);
    }
}

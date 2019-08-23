package com.ss.android.ugc.effectmanager;

import android.support.annotation.Keep;
import android.text.TextUtils;
import android.util.Log;
import com.bef.effectsdk.AssetResourceFinder;
import com.bef.effectsdk.b;
import com.ss.android.ugc.effectmanager.c;
import com.ss.android.ugc.effectmanager.common.f.e;
import com.ss.android.ugc.effectmanager.model.LocalModelInfo;
import java.io.File;

@Keep
public class DownloadableModelSupportResourceFinder implements b {
    private static volatile boolean sLibraryLoaded;
    private final l mArbiter;
    private a mAssetManagerWrapper;
    private AssetResourceFinder mAssetResourceFinder;
    f mDownloadedModelStorage;
    private final c.a mEventListener;

    private native long nativeCreateResourceFinder(long j);

    public void release(long j) {
        this.mAssetResourceFinder.release(j);
    }

    public boolean isResourceAvailable(String str) {
        if (findResourceUri(str) != null) {
            return true;
        }
        return false;
    }

    private boolean isExactBuiltInResource(String str) {
        a aVar = this.mAssetManagerWrapper;
        return aVar.a("model/" + str);
    }

    private void onModelNotFound(String str) {
        RuntimeException runtimeException = new RuntimeException("model not found neither in asset nor disk " + str);
        if (this.mEventListener != null) {
            this.mEventListener.a(null, runtimeException);
        }
    }

    public long createNativeResourceFinder(long j) {
        if (!sLibraryLoaded) {
            c.f77252b.a("downloadable_model_support");
            sLibraryLoaded = true;
        }
        this.mAssetResourceFinder.createNativeResourceFinder(j);
        return nativeCreateResourceFinder(j);
    }

    public String findResourceUri(String str) {
        boolean z;
        LocalModelInfo a2 = this.mDownloadedModelStorage.a(com.ss.android.ugc.effectmanager.common.c.a(str));
        if (a2 != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return a2.getUri().toString();
        }
        if (!isExactBuiltInResource(str)) {
            return null;
        }
        return "asset://model/" + str;
    }

    public static String findResourceUri(String str, String str2) {
        DownloadableModelSupportResourceFinder d2 = c.b().d();
        String findResourceUri = d2.findResourceUri(str2);
        try {
            String a2 = com.ss.android.ugc.effectmanager.common.c.a(str2);
            LocalModelInfo a3 = d2.mDownloadedModelStorage.a(a2);
            if (!d2.isExactBuiltInResource(str2)) {
                String a4 = e.a(new File(a3.getUri().getPath()));
                String str3 = d2.mArbiter.f77516b.a(a2).uri;
                if (!TextUtils.equals(a4, str3)) {
                    d2.onModelNotFound(str2 + " md5 = " + a4 + " expectedMd5 = " + str3);
                    return "asset://md5_error";
                }
            }
        } catch (RuntimeException e2) {
            d2.onModelNotFound(str2 + " " + Log.getStackTraceString(e2));
        }
        if (findResourceUri != null) {
            return findResourceUri;
        }
        d2.onModelNotFound(str2);
        return "asset://not_found";
    }

    public DownloadableModelSupportResourceFinder(l lVar, f fVar, a aVar, c.a aVar2) {
        this.mArbiter = lVar;
        this.mDownloadedModelStorage = fVar;
        this.mAssetResourceFinder = new AssetResourceFinder(aVar.f77202a, fVar.f77472a);
        this.mAssetManagerWrapper = aVar;
        this.mEventListener = aVar2;
    }
}

package com.ss.android.ugc.aweme.photo;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.google.common.util.concurrent.q;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.w;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.TTUploaderService;
import com.ss.android.ugc.aweme.shortvideo.at;
import com.ss.android.ugc.aweme.shortvideo.ei;
import com.ss.android.ugc.aweme.shortvideo.hf;
import com.ss.android.ugc.aweme.shortvideo.hh;
import com.ss.android.ugc.aweme.shortvideo.k;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.ss.android.ugc.aweme.shortvideo.publish.b;
import com.ss.android.ugc.aweme.utils.fb;
import com.ss.android.ugc.aweme.utils.x;
import com.ss.ttuploader.TTImageUploader;
import java.io.File;
import java.util.LinkedHashMap;

public final class l extends k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58552a;

    /* renamed from: c  reason: collision with root package name */
    private final TTUploaderService f58553c;

    public l(TTUploaderService tTUploaderService) {
        this.f58553c = tTUploaderService;
    }

    public final ei<SynthetiseResult> a(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f58552a, false, 63580, new Class[]{Object.class}, ei.class)) {
            return new ei<SynthetiseResult>() {
                {
                    b(new SynthetiseResult());
                }
            };
        }
        return (ei) PatchProxy.accessDispatch(new Object[]{obj}, this, f58552a, false, 63580, new Class[]{Object.class}, ei.class);
    }

    public final long b(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f58552a, false, 63586, new Class[]{Object.class}, Long.TYPE)) {
            return new File(((PhotoContext) obj).mPhotoLocalPath).length();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{obj}, this, f58552a, false, 63586, new Class[]{Object.class}, Long.TYPE)).longValue();
    }

    public final Bitmap c(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f58552a, false, 63587, new Class[]{Object.class}, Bitmap.class)) {
            return fb.a().a(((PhotoContext) obj).mPhotoLocalPath, 90, 110, 1);
        }
        return (Bitmap) PatchProxy.accessDispatch(new Object[]{obj}, this, f58552a, false, 63587, new Class[]{Object.class}, Bitmap.class);
    }

    public final q<VideoCreation> a(Object obj, SynthetiseResult synthetiseResult) {
        if (PatchProxy.isSupport(new Object[]{obj, synthetiseResult}, this, f58552a, false, 63583, new Class[]{Object.class, SynthetiseResult.class}, q.class)) {
            return (q) PatchProxy.accessDispatch(new Object[]{obj, synthetiseResult}, this, f58552a, false, 63583, new Class[]{Object.class, SynthetiseResult.class}, q.class);
        }
        q<VideoCreation> a2 = this.f58553c.a((LinkedHashMap<String, String>) null);
        com.google.common.util.concurrent.l.a(a2, new d(), com.ss.android.ugc.aweme.base.k.f34752b);
        return a2;
    }

    public final ei<VideoCreation> a(Object obj, VideoCreation videoCreation) {
        VideoCreation videoCreation2 = videoCreation;
        if (PatchProxy.isSupport(new Object[]{obj, videoCreation2}, this, f58552a, false, 63581, new Class[]{Object.class, VideoCreation.class}, ei.class)) {
            return (ei) PatchProxy.accessDispatch(new Object[]{obj, videoCreation2}, this, f58552a, false, 63581, new Class[]{Object.class, VideoCreation.class}, ei.class);
        }
        ei<VideoCreation> a2 = a(((PhotoContext) obj).mPhotoLocalPath, videoCreation2);
        com.google.common.util.concurrent.l.a(a2, new u(), com.ss.android.ugc.aweme.base.k.f34752b);
        return a2;
    }

    private q<? extends at> a(PhotoContext photoContext, VideoCreation videoCreation) {
        String str;
        String str2;
        String str3;
        int i;
        PhotoContext photoContext2 = photoContext;
        VideoCreation videoCreation2 = videoCreation;
        if (PatchProxy.isSupport(new Object[]{photoContext2, videoCreation2}, this, f58552a, false, 63585, new Class[]{PhotoContext.class, VideoCreation.class}, q.class)) {
            return (q) PatchProxy.accessDispatch(new Object[]{photoContext2, videoCreation2}, this, f58552a, false, 63585, new Class[]{PhotoContext.class, VideoCreation.class}, q.class);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!TextUtils.isEmpty(photoContext2.mText)) {
            linkedHashMap.put("text", photoContext2.mText);
        }
        com.ss.android.ugc.aweme.shortvideo.edit.q qVar = null;
        if (photoContext2.mExtras == null) {
            str = null;
        } else {
            str = a.f61120c.toJson((Object) photoContext2.mExtras);
        }
        if (!TextUtils.isEmpty(str)) {
            linkedHashMap.put("text_extra", str);
        }
        linkedHashMap.put("original", photoContext2.mPhotoFrom);
        linkedHashMap.put("image_type", photoContext2.mImageType);
        TextUtils.isEmpty(photoContext2.mStickers);
        if (!TextUtils.isEmpty(photoContext2.mStickers)) {
            str2 = photoContext2.mStickers;
        } else {
            str2 = "";
        }
        linkedHashMap.put("stickers", str2);
        if (!TextUtils.isEmpty(photoContext2.mFilterName)) {
            str3 = photoContext2.mFilterName;
        } else {
            str3 = "";
        }
        linkedHashMap.put("filter_name", str3);
        linkedHashMap.put("camera", photoContext2.mCamera);
        linkedHashMap.put("prettify", photoContext2.mPrettify);
        linkedHashMap.put("longitude", photoContext2.mLongitude);
        linkedHashMap.put("latitude", photoContext2.mLatitude);
        linkedHashMap.put("is_private", photoContext2.mIsPrivate);
        if (!TextUtils.isEmpty(photoContext2.shopDraftId)) {
            linkedHashMap.put("shop_draft_id", photoContext2.shopDraftId);
        }
        if (!TextUtils.isEmpty(photoContext2.mShootWay)) {
            linkedHashMap.put("shoot_way", photoContext2.mShootWay);
        }
        if (!TextUtils.isEmpty(photoContext2.mSyncPlatforms)) {
            i = 0;
            for (int i2 : com.ss.android.ugc.aweme.shortvideo.api.a.a(photoContext2.mSyncPlatforms)) {
                if (i2 == 1) {
                    i = 1;
                }
            }
        } else {
            i = 0;
        }
        linkedHashMap.put("sync_to_toutiao", i);
        w a2 = ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getBridgeService().a((Object) photoContext2);
        if (a2 != null) {
            try {
                if (a2.mMicroAppInfo != null) {
                    qVar = (com.ss.android.ugc.aweme.shortvideo.edit.q) new Gson().fromJson(a2.mMicroAppInfo, com.ss.android.ugc.aweme.shortvideo.edit.q.class);
                }
            } catch (JsonSyntaxException unused) {
            }
        }
        if (qVar == null) {
            qVar = photoContext2.microAppModel;
        }
        String str4 = "";
        String str5 = "";
        String str6 = "";
        String str7 = "";
        if (qVar != null) {
            str4 = qVar.getAppId();
            str5 = qVar.getAppTitle();
            str6 = qVar.getDescription();
            str7 = qVar.getAppUrl();
        }
        if (TextUtils.isEmpty(str4)) {
            str4 = "";
        }
        linkedHashMap.put("micro_app_id", str4);
        if (TextUtils.isEmpty(str5)) {
            str5 = "";
        }
        linkedHashMap.put("micro_app_title", str5);
        if (TextUtils.isEmpty(str6)) {
            str6 = "";
        }
        linkedHashMap.put("micro_app_description", str6);
        if (TextUtils.isEmpty(str7)) {
            str7 = "";
        }
        linkedHashMap.put("micro_app_url", str7);
        for (b a3 : a.t.b()) {
            a3.a(photoContext2, linkedHashMap);
        }
        q<? extends at> b2 = a.t.b(videoCreation2.materialId, linkedHashMap);
        com.google.common.util.concurrent.l.a(b2, new b(), com.ss.android.ugc.aweme.base.k.f34752b);
        return b2;
    }

    public final ei<VideoCreation> a(final String str, VideoCreation videoCreation) {
        if (PatchProxy.isSupport(new Object[]{str, videoCreation}, this, f58552a, false, 63582, new Class[]{String.class, VideoCreation.class}, ei.class)) {
            return (ei) PatchProxy.accessDispatch(new Object[]{str, videoCreation}, this, f58552a, false, 63582, new Class[]{String.class, VideoCreation.class}, ei.class);
        } else if (str == null || !new File(str).exists()) {
            return new ei<VideoCreation>() {
                {
                    a((Throwable) new RuntimeException("Photo file does not exist. file name: " + str));
                }
            };
        } else {
            final hh hhVar = ((hf) videoCreation).f68132b;
            return new ei<VideoCreation>() {
                {
                    TTImageUploader tTImageUploader;
                    try {
                        tTImageUploader = new TTImageUploader();
                        tTImageUploader.setListener(new n(this, tTImageUploader));
                        tTImageUploader.setSliceSize(hhVar.f68139e);
                        tTImageUploader.setFileUploadDomain(hhVar.f68136b);
                        tTImageUploader.setImageUploadDomain(hhVar.f68137c);
                        tTImageUploader.setSliceTimeout(hhVar.f68140f);
                        tTImageUploader.setSliceReTryCount(hhVar.g);
                        tTImageUploader.setFilePath(1, new String[]{str});
                        tTImageUploader.setFileRetryCount(1);
                        tTImageUploader.setUserKey(hhVar.f68135a);
                        tTImageUploader.setAuthorization(hhVar.h);
                        tTImageUploader.setOpenBoe(x.a().f4300b);
                        tTImageUploader.start();
                    } catch (Exception e2) {
                        tTImageUploader.close();
                        throw e2;
                    } catch (Throwable th) {
                        a(th);
                    }
                }
            };
        }
    }

    public final q<at> a(Object obj, VideoCreation videoCreation, SynthetiseResult synthetiseResult) {
        Object obj2 = obj;
        VideoCreation videoCreation2 = videoCreation;
        SynthetiseResult synthetiseResult2 = synthetiseResult;
        if (!PatchProxy.isSupport(new Object[]{obj2, videoCreation2, synthetiseResult2}, this, f58552a, false, 63584, new Class[]{Object.class, VideoCreation.class, SynthetiseResult.class}, q.class)) {
            return com.google.common.util.concurrent.l.a(a((PhotoContext) obj2, videoCreation2), com.ss.android.ugc.aweme.base.api.a.b.a.class, com.ss.android.ugc.aweme.shortvideo.w.a(new m(this, obj2, videoCreation2, synthetiseResult2)), com.ss.android.ugc.aweme.base.k.f34752b);
        }
        return (q) PatchProxy.accessDispatch(new Object[]{obj2, videoCreation2, synthetiseResult2}, this, f58552a, false, 63584, new Class[]{Object.class, VideoCreation.class, SynthetiseResult.class}, q.class);
    }
}

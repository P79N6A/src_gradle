package com.ss.android.ugc.aweme.tools.extract.upload;

import a.g;
import a.i;
import a.j;
import android.content.Intent;
import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.v4.app.SafeJobIntentService;
import android.text.TextUtils;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.hf;
import com.ss.android.ugc.aweme.shortvideo.hh;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.tools.AVApi;
import com.ss.android.ugc.aweme.utils.fd;
import com.ss.android.ugc.aweme.video.b;
import com.ss.ttuploader.TTImageInfo;
import com.ss.ttuploader.TTImageUploader;
import com.ss.ttuploader.TTImageUploaderListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public class VideoFramesUploadService extends SafeJobIntentService {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74728a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f74729b = "VideoFramesUploadService";

    interface FramesUploadApi {
        @FormUrlEncoded
        @POST(a = "/aweme/v2/aweme/vframe/update/")
        i<BaseResponse> uploadFrame(@Field(a = "aweme_id") String str, @Field(a = "video_id") String str2, @Field(a = "vframe_uri") String str3);

        @FormUrlEncoded
        @POST(a = "/aweme/v2/aweme/vframe/update/")
        i<BaseResponse> uploadFrame(@Field(a = "aweme_id") String str, @Field(a = "video_id") String str2, @Field(a = "vframe_uri") String str3, @Field(a = "stickers") String str4);
    }

    public void onHandleWork(@NonNull Intent intent) {
        String str;
        List list;
        i iVar;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2}, this, f74728a, false, 87083, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent2}, this, f74728a, false, 87083, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        final FramesUploadApi framesUploadApi = (FramesUploadApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(((AVApi) ServiceManager.get().getService(AVApi.class)).getAPI_URL_PREFIX_SI()).create(FramesUploadApi.class);
        a a2 = a.a(getApplicationContext());
        if (intent2 != null) {
            str = intent2.getStringExtra("authkey");
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            final hf hfVar = (hf) new GsonBuilder().create().fromJson(str, hf.class);
            if (hfVar != null && hfVar.f68133c != null) {
                if (PatchProxy.isSupport(new Object[0], a2, a.f74749a, false, 87080, new Class[0], List.class)) {
                    list = (List) PatchProxy.accessDispatch(new Object[0], a2, a.f74749a, false, 87080, new Class[0], List.class);
                } else {
                    list = new ArrayList();
                    Cursor query = a2.getReadableDatabase().query("frames_table", new String[]{"aweme_id", "video_id", "zip_uri", "zip_path", "extract_model", "update_time"}, null, null, null, null, null);
                    while (query.moveToNext()) {
                        b bVar = new b(query.getString(query.getColumnIndex("aweme_id")), query.getString(query.getColumnIndex("video_id")), query.getString(query.getColumnIndex("zip_uri")), query.getString(query.getColumnIndex("zip_path")), ExtractFramesModel.string2Model(query.getString(query.getColumnIndex("extract_model"))), query.getLong(query.getColumnIndex("update_time")));
                        list.add(bVar);
                    }
                    query.close();
                }
                if (list != null && !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        final b bVar2 = (b) it2.next();
                        if (System.currentTimeMillis() - bVar2.f74756f > TimeUnit.DAYS.toMillis(1)) {
                            it2.remove();
                            a2.a(bVar2.f74751a);
                            if (bVar2.f74755e != null) {
                                b.e(bVar2.f74755e.extractFramesDir);
                                b.c(bVar2.f74755e.extractFramesDir);
                            }
                        } else {
                            final a aVar = a2;
                            if (PatchProxy.isSupport(new Object[]{bVar2}, this, f74728a, false, 87084, new Class[]{b.class}, i.class)) {
                                iVar = (i) PatchProxy.accessDispatch(new Object[]{bVar2}, this, f74728a, false, 87084, new Class[]{b.class}, i.class);
                            } else if (bVar2 == null) {
                                iVar = i.a((Exception) new IllegalStateException("the upload model is null"));
                            } else {
                                if (TextUtils.isEmpty(bVar2.f74754d) || !new File(bVar2.f74754d).exists()) {
                                    List<String> allFrames = bVar2.f74755e.getAllFrames();
                                    if (bVar2.f74755e == null || allFrames.isEmpty()) {
                                        iVar = i.a((Exception) new IllegalStateException("the upload frames is empty"));
                                    } else {
                                        bVar2.f74754d = fd.a(bVar2.f74755e.extractFramesDir, (List<String>) new ArrayList<String>(allFrames));
                                        if (bVar2.f74754d == null || !b.b(bVar2.f74754d)) {
                                            iVar = i.a((Exception) new IllegalStateException("the upload zipPath is empty"));
                                        }
                                    }
                                }
                                iVar = i.a(bVar2);
                            }
                            try {
                                iVar.b((g<TResult, i<TContinuationResult>>) new g<b, i<b>>() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f74740a;

                                    public final /* synthetic */ Object then(i iVar) throws Exception {
                                        if (PatchProxy.isSupport(new Object[]{iVar}, this, f74740a, false, 87089, new Class[]{i.class}, i.class)) {
                                            return (i) PatchProxy.accessDispatch(new Object[]{iVar}, this, f74740a, false, 87089, new Class[]{i.class}, i.class);
                                        } else if (iVar.d()) {
                                            return i.a(iVar.f());
                                        } else {
                                            aVar.a((b) iVar.e());
                                            return VideoFramesUploadService.this.a(bVar2, hfVar.f68133c);
                                        }
                                    }
                                }).b((g<TResult, i<TContinuationResult>>) new g<b, i<BaseResponse>>() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f74736a;

                                    public final /* synthetic */ Object then(i iVar) throws Exception {
                                        if (PatchProxy.isSupport(new Object[]{iVar}, this, f74736a, false, 87088, new Class[]{i.class}, i.class)) {
                                            return (i) PatchProxy.accessDispatch(new Object[]{iVar}, this, f74736a, false, 87088, new Class[]{i.class}, i.class);
                                        } else if (iVar.d()) {
                                            return i.a(iVar.f());
                                        } else {
                                            b bVar = (b) iVar.e();
                                            aVar.a(bVar);
                                            if (bVar == null || bVar.f74755e == null || bVar.f74755e.getStickerIds() == null) {
                                                return framesUploadApi.uploadFrame(bVar.f74751a, bVar.f74752b, bVar.f74753c);
                                            }
                                            return framesUploadApi.uploadFrame(bVar.f74751a, bVar.f74752b, bVar.f74753c, bVar.f74755e.getStickerIds());
                                        }
                                    }
                                }).a((g<TResult, TContinuationResult>) new g<BaseResponse, Object>() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f74732a;

                                    public final Object then(i<BaseResponse> iVar) {
                                        if (PatchProxy.isSupport(new Object[]{iVar}, this, f74732a, false, 87087, new Class[]{i.class}, Object.class)) {
                                            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f74732a, false, 87087, new Class[]{i.class}, Object.class);
                                        } else if (iVar.d()) {
                                            return null;
                                        } else {
                                            aVar.a(bVar2.f74751a);
                                            b.e(bVar2.f74755e.extractFramesDir);
                                            b.c(bVar2.f74755e.extractFramesDir);
                                            return null;
                                        }
                                    }
                                }).a((g<TResult, TContinuationResult>) new g<Object, Object>() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f74730a;

                                    public final Object then(i<Object> iVar) {
                                        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f74730a, false, 87086, new Class[]{i.class}, Object.class)) {
                                            return iVar.d() ? null : null;
                                        }
                                        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f74730a, false, 87086, new Class[]{i.class}, Object.class);
                                    }
                                }).g();
                            } catch (InterruptedException unused) {
                            }
                            a2 = aVar;
                        }
                    }
                }
            }
        }
    }

    public final i<b> a(b bVar, hh hhVar) {
        final b bVar2 = bVar;
        hh hhVar2 = hhVar;
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{bVar2, hhVar2}, this, f74728a, false, 87085, new Class[]{b.class, hh.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{bVar2, hhVar2}, this, f74728a, false, 87085, new Class[]{b.class, hh.class}, i.class);
        } else if (!TextUtils.isEmpty(bVar2.f74753c)) {
            return i.a(bVar);
        } else {
            final j jVar = new j();
            try {
                TTImageUploader tTImageUploader = new TTImageUploader();
                try {
                    tTImageUploader.setListener(new TTImageUploaderListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f74745a;

                        public final void onNotify(int i, long j, TTImageInfo tTImageInfo) {
                            int i2 = i;
                            long j2 = j;
                            TTImageInfo tTImageInfo2 = tTImageInfo;
                            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2), tTImageInfo2}, this, f74745a, false, 87090, new Class[]{Integer.TYPE, Long.TYPE, TTImageInfo.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2), tTImageInfo2}, this, f74745a, false, 87090, new Class[]{Integer.TYPE, Long.TYPE, TTImageInfo.class}, Void.TYPE);
                            } else if (i2 == 3) {
                                bVar2.f74753c = tTImageInfo2.mImageUri;
                                jVar.b(bVar2);
                            } else {
                                if (i2 == 4) {
                                    jVar.b((Exception) new IllegalStateException("upload zip file failed"));
                                }
                            }
                        }
                    });
                    tTImageUploader.setSliceSize(hhVar2.f68139e);
                    tTImageUploader.setFileUploadDomain(hhVar2.f68136b);
                    tTImageUploader.setImageUploadDomain(hhVar2.f68137c);
                    tTImageUploader.setSliceTimeout(hhVar2.f68140f);
                    tTImageUploader.setSliceReTryCount(hhVar2.g);
                    tTImageUploader.setFilePath(1, new String[]{bVar2.f74754d});
                    if (hhVar2.f68138d > 0) {
                        i = hhVar2.f68138d;
                    }
                    tTImageUploader.setFileRetryCount(i);
                    tTImageUploader.setUserKey(hhVar2.f68135a);
                    tTImageUploader.setAuthorization(hhVar2.h);
                    tTImageUploader.start();
                } catch (Throwable th) {
                    th = th;
                    jVar.b(new Exception(th));
                    return jVar.f1091a;
                }
            } catch (Throwable th2) {
                th = th2;
                jVar.b(new Exception(th));
                return jVar.f1091a;
            }
            return jVar.f1091a;
        }
    }
}

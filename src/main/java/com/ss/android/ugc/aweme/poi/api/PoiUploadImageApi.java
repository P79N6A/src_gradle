package com.ss.android.ugc.aweme.poi.api;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.model.ax;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/api/PoiUploadImageApi;", "", "()V", "POI_UPLOAD_IMG_URL", "", "sApi", "Lcom/ss/android/ugc/aweme/poi/api/PoiUploadImageApi$PoiUploadImageApi;", "kotlin.jvm.PlatformType", "uploadPoiImgRequest", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/poi/model/PoiUploadImageResponse;", "poiId", "uriList", "waterMark", "PoiUploadImageApi", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PoiUploadImageApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59729a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0669PoiUploadImageApi f59730b = ((C0669PoiUploadImageApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(C0669PoiUploadImageApi.class));

    /* renamed from: c  reason: collision with root package name */
    public static final PoiUploadImageApi f59731c = new PoiUploadImageApi();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H'¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/api/PoiUploadImageApi$PoiUploadImageApi;", "", "uploadPoiImgRequest", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/poi/model/PoiUploadImageResponse;", "poiId", "", "uriList", "waterMark", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.poi.api.PoiUploadImageApi$PoiUploadImageApi  reason: collision with other inner class name */
    public interface C0669PoiUploadImageApi {
        @FormUrlEncoded
        @NotNull
        @POST(a = "/aweme/v1/poi/upload/head/image/")
        i<ax> uploadPoiImgRequest(@NotNull @Field(a = "poi_id") String str, @NotNull @Field(a = "urilist") String str2, @NotNull @Field(a = "watermark") String str3);
    }

    private PoiUploadImageApi() {
    }
}

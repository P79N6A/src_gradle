package com.ss.android.ugc.aweme.tools.policysecurity;

import a.g;
import a.i;
import a.j;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.SafeJobIntentService;
import android.text.TextUtils;
import com.google.common.a.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.hf;
import com.ss.android.ugc.aweme.shortvideo.hl;
import com.ss.android.ugc.aweme.tools.AVApi;
import com.ss.android.ugc.aweme.tools.policysecurity.b;
import com.ss.ttuploader.TTVideoInfo;
import com.ss.ttuploader.TTVideoUploader;
import com.ss.ttuploader.TTVideoUploaderListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0002\u0013\u0014B\u0005¢\u0006\u0002\u0010\u0002J#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nJ#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/tools/policysecurity/OriginalSoundUploadService;", "Landroid/support/v4/app/SafeJobIntentService;", "()V", "createAudioUploadApi", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "api", "Lcom/ss/android/ugc/aweme/tools/policysecurity/OriginalSoundUploadService$AudioUploadApi;", "task", "Lcom/ss/android/ugc/aweme/tools/policysecurity/OriginalSoundUploadTask;", "createAudioUploadApi$tools_dmt_av_impl_douyinCnRelease", "createUploadBoltsTask", "config", "Lcom/ss/android/ugc/aweme/shortvideo/UploadVideoConfig;", "createUploadBoltsTask$tools_dmt_av_impl_douyinCnRelease", "onHandleWork", "", "intent", "Landroid/content/Intent;", "AudioUploadApi", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class OriginalSoundUploadService extends SafeJobIntentService {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74902a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f74903b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/tools/policysecurity/OriginalSoundUploadService$AudioUploadApi;", "", "uploadAudio", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "awemeId", "", "vid", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface AudioUploadApi {
        @FormUrlEncoded
        @NotNull
        @POST(a = "/aweme/v2/aweme/audiotrack/update/")
        i<BaseResponse> uploadAudio(@NotNull @Field(a = "aweme_id") String str, @NotNull @Field(a = "audiotrack_uri") String str2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/tools/policysecurity/OriginalSoundUploadService$Companion;", "", "()V", "MONITOR_SERVICE_TYPE", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\"\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\r"}, d2 = {"com/ss/android/ugc/aweme/tools/policysecurity/OriginalSoundUploadService$createUploadBoltsTask$1", "Lcom/ss/ttuploader/TTVideoUploaderListener;", "onLog", "", "what", "", "code", "info", "", "onNotify", "parameter", "", "Lcom/ss/ttuploader/TTVideoInfo;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements TTVideoUploaderListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74904a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f74905b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TTVideoUploader f74906c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f74907d;

        public final void onLog(int i, int i2, @Nullable String str) {
        }

        b(c cVar, TTVideoUploader tTVideoUploader, j jVar) {
            this.f74905b = cVar;
            this.f74906c = tTVideoUploader;
            this.f74907d = jVar;
        }

        public final void onNotify(int i, long j, @Nullable TTVideoInfo tTVideoInfo) {
            int i2 = i;
            long j2 = j;
            TTVideoInfo tTVideoInfo2 = tTVideoInfo;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2), tTVideoInfo2}, this, f74904a, false, 87255, new Class[]{Integer.TYPE, Long.TYPE, TTVideoInfo.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2), tTVideoInfo2}, this, f74904a, false, 87255, new Class[]{Integer.TYPE, Long.TYPE, TTVideoInfo.class}, Void.TYPE);
            } else if (i2 != 0) {
                if (i2 == 2) {
                    this.f74906c.close();
                    j jVar = this.f74907d;
                    jVar.b((Exception) new IllegalArgumentException("upload failed " + j2 + '.'));
                }
            } else {
                c cVar = this.f74905b;
                if (tTVideoInfo2 == null) {
                    Intrinsics.throwNpe();
                }
                cVar.f74929b = tTVideoInfo2.mVideoId;
                this.f74906c.close();
                this.f74907d.b(this.f74905b);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012*\u0010\u0003\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "it", "Lcom/ss/android/ugc/aweme/tools/policysecurity/OriginalSoundUploadTask;", "kotlin.jvm.PlatformType", "then", "com/ss/android/ugc/aweme/tools/policysecurity/OriginalSoundUploadService$onHandleWork$3$uploadTask$1"}, k = 3, mv = {1, 1, 15})
    static final class c<TTaskResult, TContinuationResult> implements g<c, i<BaseResponse>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74908a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OriginalSoundUploadService f74909b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ hf f74910c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f74911d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f74912e;

        c(OriginalSoundUploadService originalSoundUploadService, hf hfVar, b bVar, Ref.ObjectRef objectRef) {
            this.f74909b = originalSoundUploadService;
            this.f74910c = hfVar;
            this.f74911d = bVar;
            this.f74912e = objectRef;
        }

        public final /* synthetic */ Object then(i iVar) {
            i iVar2 = iVar;
            if (PatchProxy.isSupport(new Object[]{iVar2}, this, f74908a, false, 87256, new Class[]{i.class}, i.class)) {
                return (i) PatchProxy.accessDispatch(new Object[]{iVar2}, this, f74908a, false, 87256, new Class[]{i.class}, i.class);
            }
            Intrinsics.checkExpressionValueIsNotNull(iVar2, AdvanceSetting.NETWORK_TYPE);
            if (iVar.d() || iVar.c()) {
                Exception f2 = iVar.f();
                Intrinsics.checkExpressionValueIsNotNull(f2, "it.error");
                throw f2;
            }
            b bVar = this.f74911d;
            Object e2 = iVar.e();
            Intrinsics.checkExpressionValueIsNotNull(e2, "it.result");
            c cVar = (c) e2;
            if (PatchProxy.isSupport(new Object[]{cVar}, bVar, b.f74924a, false, 87249, new Class[]{c.class}, Void.TYPE)) {
                b bVar2 = bVar;
                PatchProxy.accessDispatch(new Object[]{cVar}, bVar2, b.f74924a, false, 87249, new Class[]{c.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(cVar, "task");
                bVar.a(cVar);
            }
            OriginalSoundUploadService originalSoundUploadService = this.f74909b;
            AudioUploadApi audioUploadApi = (AudioUploadApi) this.f74912e.element;
            Intrinsics.checkExpressionValueIsNotNull(audioUploadApi, "api");
            Object e3 = iVar.e();
            Intrinsics.checkExpressionValueIsNotNull(e3, "it.result");
            c cVar2 = (c) e3;
            if (PatchProxy.isSupport(new Object[]{audioUploadApi, cVar2}, originalSoundUploadService, OriginalSoundUploadService.f74902a, false, 87254, new Class[]{AudioUploadApi.class, c.class}, i.class)) {
                return (i) PatchProxy.accessDispatch(new Object[]{audioUploadApi, cVar2}, originalSoundUploadService, OriginalSoundUploadService.f74902a, false, 87254, new Class[]{AudioUploadApi.class, c.class}, i.class);
            }
            Intrinsics.checkParameterIsNotNull(audioUploadApi, "api");
            Intrinsics.checkParameterIsNotNull(cVar2, "task");
            String str = cVar2.f74930c;
            String str2 = cVar2.f74929b;
            if (str2 == null) {
                Intrinsics.throwNpe();
            }
            return audioUploadApi.uploadAudio(str, str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "kotlin.jvm.PlatformType", "then", "com/ss/android/ugc/aweme/tools/policysecurity/OriginalSoundUploadService$onHandleWork$3$uploadTask$2"}, k = 3, mv = {1, 1, 15})
    static final class d<TTaskResult, TContinuationResult> implements g<TResult, TContinuationResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74913a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f74914b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ OriginalSoundUploadService f74915c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ hf f74916d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f74917e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f74918f;

        d(c cVar, OriginalSoundUploadService originalSoundUploadService, hf hfVar, b bVar, Ref.ObjectRef objectRef) {
            this.f74914b = cVar;
            this.f74915c = originalSoundUploadService;
            this.f74916d = hfVar;
            this.f74917e = bVar;
            this.f74918f = objectRef;
        }

        public final /* synthetic */ Object then(i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f74913a, false, 87257, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f74913a, false, 87257, new Class[]{i.class}, Void.TYPE);
            } else {
                Intrinsics.checkExpressionValueIsNotNull(iVar, AdvanceSetting.NETWORK_TYPE);
                if (!iVar.d() && !iVar.c()) {
                    this.f74917e.a(this.f74914b.f74930c);
                    new File(this.f74914b.f74932e).delete();
                } else if (iVar.d()) {
                    if ((iVar.f() instanceof IllegalStateException) && iVar.f().getMessage() != null) {
                        String message = iVar.f().getMessage();
                        if (message == null) {
                            Intrinsics.throwNpe();
                        }
                        if (StringsKt.startsWith$default(message, "file error", false, 2, null)) {
                            this.f74917e.a(this.f74914b.f74930c);
                            new File(this.f74914b.f74932e).delete();
                        }
                    }
                    Exception f2 = iVar.f();
                    Intrinsics.checkExpressionValueIsNotNull(f2, "it.error");
                    throw f2;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lbolts/Task;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class e<TTaskResult, TContinuationResult> implements g<TResult, TContinuationResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74919a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f74920b;

        e(c cVar) {
            this.f74920b = cVar;
        }

        public final /* synthetic */ Object then(i iVar) {
            String str;
            i iVar2 = iVar;
            if (PatchProxy.isSupport(new Object[]{iVar2}, this, f74919a, false, 87258, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar2}, this, f74919a, false, 87258, new Class[]{i.class}, Void.TYPE);
            } else {
                Intrinsics.checkExpressionValueIsNotNull(iVar2, AdvanceSetting.NETWORK_TYPE);
                if (iVar.d()) {
                    Pair[] pairArr = new Pair[4];
                    pairArr[0] = TuplesKt.to("success", PushConstants.PUSH_TYPE_NOTIFY);
                    pairArr[1] = TuplesKt.to("success_mid", this.f74920b.f74931d);
                    pairArr[2] = TuplesKt.to("aweme_id", this.f74920b.f74930c);
                    Exception f2 = iVar.f();
                    Intrinsics.checkExpressionValueIsNotNull(f2, "it.error");
                    Throwable th = f2;
                    if (PatchProxy.isSupport(new Object[]{th}, null, com.ss.android.ugc.aweme.tools.b.b.f74647a, true, 87041, new Class[]{Throwable.class}, String.class)) {
                        str = (String) PatchProxy.accessDispatch(new Object[]{th}, null, com.ss.android.ugc.aweme.tools.b.b.f74647a, true, 87041, new Class[]{Throwable.class}, String.class);
                    } else {
                        Intrinsics.checkParameterIsNotNull(th, "$this$getStackTraceAsString");
                        str = u.b(th);
                        Intrinsics.checkExpressionValueIsNotNull(str, "Throwables.getStackTraceAsString(this)");
                    }
                    pairArr[3] = TuplesKt.to("errorDesc", str);
                    n.b("aweme_movie_publish_log", "upload_audio", com.ss.android.ugc.aweme.tools.b.a.a(MapsKt.mapOf(pairArr)));
                } else {
                    n.b("aweme_movie_publish_log", "upload_audio", com.ss.android.ugc.aweme.tools.b.a.a(MapsKt.mapOf(TuplesKt.to("success", PushConstants.PUSH_TYPE_THROUGH_MESSAGE), TuplesKt.to("success_mid", this.f74920b.f74931d), TuplesKt.to("aweme_id", this.f74920b.f74930c))));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void onHandleWork(@NotNull Intent intent) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{intent}, this, f74902a, false, 87252, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent}, this, f74902a, false, 87252, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        Object service = ServiceManager.get().getService(AVApi.class);
        Intrinsics.checkExpressionValueIsNotNull(service, "ServiceManager.get().getService(AVApi::class.java)");
        IRetrofit createNewRetrofit = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(((AVApi) service).getAPI_URL_PREFIX_SI());
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (AudioUploadApi) createNewRetrofit.create(AudioUploadApi.class);
        b.a aVar = b.f74926c;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkExpressionValueIsNotNull(applicationContext, "applicationContext");
        b a2 = aVar.a(applicationContext);
        String e2 = com.ss.android.ugc.aweme.port.in.a.L.e(e.a.SdkV4AuthKey);
        if (!TextUtils.isEmpty(e2)) {
            hf hfVar = (hf) com.ss.android.ugc.aweme.port.in.a.f61120c.fromJson(e2, hf.class);
            Collection arrayList = new ArrayList();
            for (Object next : a2.a()) {
                if (System.currentTimeMillis() - ((c) next).f74933f > TimeUnit.DAYS.toMillis(1)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            for (c cVar : (List) arrayList) {
                a2.a(cVar.f74930c);
                new File(cVar.f74932e).delete();
            }
            for (c cVar2 : a2.a()) {
                Intrinsics.checkExpressionValueIsNotNull(hfVar, "config");
                hl hlVar = hfVar.f68131a;
                Intrinsics.checkExpressionValueIsNotNull(hlVar, "config.uploadVideoConfig");
                i b2 = a(cVar2, hlVar).b((g<TResult, i<TContinuationResult>>) new c<TResult,i<TContinuationResult>>(this, hfVar, a2, objectRef));
                d dVar = new d(cVar2, this, hfVar, a2, objectRef);
                b2.a((g<TResult, TContinuationResult>) dVar).a((g<TResult, TContinuationResult>) new e<TResult,TContinuationResult>(cVar2)).g();
            }
        }
    }

    @NotNull
    private i<c> a(@NotNull c cVar, @NotNull hl hlVar) {
        c cVar2 = cVar;
        hl hlVar2 = hlVar;
        if (PatchProxy.isSupport(new Object[]{cVar2, hlVar2}, this, f74902a, false, 87253, new Class[]{c.class, hl.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{cVar2, hlVar2}, this, f74902a, false, 87253, new Class[]{c.class, hl.class}, i.class);
        }
        Intrinsics.checkParameterIsNotNull(cVar2, "task");
        Intrinsics.checkParameterIsNotNull(hlVar2, "config");
        if (cVar2.f74929b != null) {
            i<c> a2 = i.a(cVar);
            Intrinsics.checkExpressionValueIsNotNull(a2, "Task.forResult(task)");
            return a2;
        }
        int b2 = com.ss.android.ugc.aweme.shortvideo.q.c.b(cVar2.f74932e);
        if (b2 != 0) {
            i<c> a3 = i.a((Exception) new IllegalStateException("file error, " + cVar2.f74932e + " checkResult = " + b2));
            Intrinsics.checkExpressionValueIsNotNull(a3, "Task.forError(IllegalSta…kResult = $checkResult\"))");
            return a3;
        }
        j jVar = new j();
        TTVideoUploader tTVideoUploader = new TTVideoUploader();
        try {
            tTVideoUploader.setListener(new b(cVar2, tTVideoUploader, jVar));
            tTVideoUploader.setMaxFailTime(hlVar2.h);
            tTVideoUploader.setSliceSize(hlVar2.f68159f);
            tTVideoUploader.setFileUploadDomain(hlVar2.f68155b);
            tTVideoUploader.setVideoUploadDomain(hlVar2.f68156c);
            tTVideoUploader.setSliceTimeout(hlVar2.f68157d);
            tTVideoUploader.setPathName(cVar2.f74932e);
            tTVideoUploader.setFileRetryCount(1);
            tTVideoUploader.setUserKey(hlVar2.f68154a);
            tTVideoUploader.setAuthorization(hlVar2.i);
            tTVideoUploader.setSocketNum(1);
            tTVideoUploader.start();
        } catch (Exception unused) {
            tTVideoUploader.close();
        }
        i<TResult> iVar = jVar.f1091a;
        Intrinsics.checkExpressionValueIsNotNull(iVar, "taskCompletionSource.task");
        return iVar;
    }
}

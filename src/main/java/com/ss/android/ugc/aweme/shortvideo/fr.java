package com.ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.draft.a.c;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ss.android.ugc.aweme.port.in.o;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.video.b;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0012\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoPublishCallback;", "Lcom/ss/android/ugc/aweme/shortvideo/Callbacks;", "Lcom/ss/android/ugc/aweme/shortvideo/CreateBaseAwemeResponse;", "videoType", "", "args", "", "(ILjava/lang/Object;)V", "checkSaveLocal", "", "response", "onError", "e", "Lcom/ss/android/ugc/aweme/shortvideo/VideoPublishException;", "onProgressUpdate", "progress", "onSuccess", "onSynthetiseSuccess", "path", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class fr implements s<at> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67777a;

    /* renamed from: b  reason: collision with root package name */
    private final int f67778b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f67779c;

    public final void a(int i) {
    }

    public final void a(@Nullable String str) {
    }

    public final void a(@NotNull hn hnVar) {
        String str;
        if (PatchProxy.isSupport(new Object[]{hnVar}, this, f67777a, false, 74658, new Class[]{hn.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hnVar}, this, f67777a, false, 74658, new Class[]{hn.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(hnVar, "e");
        if (hnVar.isRecover()) {
            int i = this.f67778b;
            if (i == 0) {
                Object obj = this.f67779c;
                if (obj != null) {
                    str = ((cb) obj).getDraftPrimaryKey();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
                }
            } else if (i != 6) {
                str = "";
            } else {
                Object obj2 = this.f67779c;
                if (obj2 != null) {
                    str = ((PhotoMovieContext) obj2).getDraftPrimaryKey();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.photomovie.PhotoMovieContext");
                }
            }
            if (!TextUtils.isEmpty(str)) {
                Object service = ServiceManager.get().getService(IAVService.class);
                Intrinsics.checkExpressionValueIsNotNull(service, "ServiceManager.get().get…e(IAVService::class.java)");
                ((IAVService) service).getPublishService().setUploadRecoverPath(str);
            }
        }
    }

    public final void a(@NotNull at atVar) {
        String str;
        AVUploadSaveModel aVUploadSaveModel;
        if (PatchProxy.isSupport(new Object[]{atVar}, this, f67777a, false, 74657, new Class[]{at.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{atVar}, this, f67777a, false, 74657, new Class[]{at.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(atVar, "response");
        if (PatchProxy.isSupport(new Object[]{atVar}, this, f67777a, false, 74659, new Class[]{at.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{atVar}, this, f67777a, false, 74659, new Class[]{at.class}, Void.TYPE);
        } else {
            a.a("args is " + this.f67779c);
            if (this.f67778b == 0) {
                Object obj = this.f67779c;
                if (obj != null) {
                    cb cbVar = (cb) obj;
                    str = cbVar.getLocalFinalPath();
                    aVUploadSaveModel = cbVar.mSaveModel;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
                }
            } else if (this.f67778b == 6) {
                Object obj2 = this.f67779c;
                if (obj2 != null) {
                    PhotoMovieContext photoMovieContext = (PhotoMovieContext) obj2;
                    str = photoMovieContext.getLocalTempPath();
                    aVUploadSaveModel = photoMovieContext.mSaveModel;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.photomovie.PhotoMovieContext");
                }
            } else {
                aVUploadSaveModel = null;
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                atVar.mSaveModel = aVUploadSaveModel;
                b.e(fg.k);
            }
        }
        int i = this.f67778b;
        if (i == 0) {
            Object obj3 = this.f67779c;
            if (!(obj3 instanceof cb)) {
                obj3 = null;
            }
            cb cbVar2 = (cb) obj3;
            if (cbVar2 != null) {
                IDraftService draftService = ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService();
                c queryDraft = draftService.queryDraft(cbVar2.getDraftPrimaryKey());
                if (queryDraft != null) {
                    o oVar = com.ss.android.ugc.aweme.port.in.a.F;
                    String f2 = queryDraft.f();
                    Intrinsics.checkExpressionValueIsNotNull(f2, "draft.videoPath");
                    oVar.a(f2);
                    draftService.delete(queryDraft);
                    draftService.notifyDraftDelete(queryDraft);
                    a a2 = com.ss.android.ugc.aweme.port.in.a.E.a(atVar);
                    if (a2 != null) {
                        new eb().a(com.ss.android.ugc.aweme.port.in.a.f61119b, a2.aid, atVar.materialId, this.f67779c);
                        new OriginFramesUploader().a(com.ss.android.ugc.aweme.port.in.a.f61119b, this.f67779c, queryDraft, a2.aid, atVar.materialId);
                    }
                }
            }
        } else if (i != 6) {
            ALog.e("ShortVideoPublishCallback", "unknown video type");
        } else {
            Object obj4 = this.f67779c;
            if (!(obj4 instanceof PhotoMovieContext)) {
                obj4 = null;
            }
            PhotoMovieContext photoMovieContext2 = (PhotoMovieContext) obj4;
            if (photoMovieContext2 != null) {
                IDraftService draftService2 = ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService();
                c queryDraft2 = draftService2.queryDraft(photoMovieContext2.getDraftPrimaryKey());
                if (queryDraft2 != null) {
                    o oVar2 = com.ss.android.ugc.aweme.port.in.a.F;
                    String f3 = queryDraft2.f();
                    Intrinsics.checkExpressionValueIsNotNull(f3, "draft.videoPath");
                    oVar2.a(f3);
                    draftService2.delete(queryDraft2);
                    draftService2.notifyDraftDelete(queryDraft2);
                    a a3 = com.ss.android.ugc.aweme.port.in.a.E.a(atVar);
                    if (a3 != null) {
                        new OriginFramesUploader().a(com.ss.android.ugc.aweme.port.in.a.f61119b, this.f67779c, queryDraft2, a3.aid, atVar.materialId);
                    }
                }
            }
        }
    }

    public fr(int i, @NotNull Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, "args");
        this.f67778b = i;
        this.f67779c = obj;
    }
}

package com.ss.android.ugc.aweme.shortvideo.record;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.bz;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.tools.aj;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import dmt.av.video.b.a.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/record/HuaweiCameraModule;", "", "activity", "Lcom/ss/android/ugc/aweme/shortvideo/ui/VideoRecordNewActivity;", "cameraService", "Ldmt/av/video/record/camera/ICameraService;", "(Lcom/ss/android/ugc/aweme/shortvideo/ui/VideoRecordNewActivity;Ldmt/av/video/record/camera/ICameraService;)V", "getActivity", "()Lcom/ss/android/ugc/aweme/shortvideo/ui/VideoRecordNewActivity;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class h {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final VideoRecordNewActivity f69102a;

    /* renamed from: b  reason: collision with root package name */
    public final c f69103b;

    public h(@NotNull VideoRecordNewActivity videoRecordNewActivity, @NotNull c cVar) {
        Intrinsics.checkParameterIsNotNull(videoRecordNewActivity, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(cVar, "cameraService");
        this.f69102a = videoRecordNewActivity;
        this.f69103b = cVar;
        ViewModel viewModel = ViewModelProviders.of((FragmentActivity) this.f69102a).get(ShortVideoContextViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…extViewModel::class.java)");
        ((ShortVideoContextViewModel) viewModel).j().observe(this.f69102a, new Observer<Boolean>(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69104a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h f69105b;

            {
                this.f69105b = r1;
            }

            public final /* synthetic */ void onChanged(Object obj) {
                Boolean bool = (Boolean) obj;
                boolean z = true;
                if (PatchProxy.isSupport(new Object[]{bool}, this, f69104a, false, 78379, new Class[]{Boolean.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bool}, this, f69104a, false, 78379, new Class[]{Boolean.class}, Void.TYPE);
                    return;
                }
                if (bool != null) {
                    Boolean bool2 = null;
                    if (!bool.booleanValue()) {
                        bool = null;
                    }
                    if (bool != null) {
                        if (new bz(this.f69105b.f69102a).a() && this.f69105b.f69103b.i()) {
                            z = false;
                        }
                        if (z) {
                            bool2 = bool;
                        }
                        if (bool2 != null) {
                            bd bdVar = this.f69105b.f69102a.z;
                            if (bdVar != null) {
                                bdVar.a((Object) this.f69105b.f69102a, (bc) new aj());
                            }
                        }
                    }
                }
            }
        });
    }
}

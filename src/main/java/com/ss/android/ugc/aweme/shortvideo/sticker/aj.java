package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.FaceStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.g;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.h;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import dmt.av.video.b.z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0011\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/VoiceRecognitionStickerHelper;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/helper/IStickerHelper;", "context", "Landroid/support/v7/app/AppCompatActivity;", "provider", "Ldmt/av/video/record/VoiceCapacityProvider;", "(Landroid/support/v7/app/AppCompatActivity;Ldmt/av/video/record/VoiceCapacityProvider;)V", "currentSticker", "Lcom/ss/android/ugc/aweme/sticker/model/FaceStickerBean;", "faceStickerViewModel", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/viewmodel/FaceStickerViewModel;", "stickerSelectedObserver", "Landroid/arch/lifecycle/Observer;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/viewmodel/FaceStickerWrapper;", "register", "", "reopenAudioRecorder", "unregister", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class aj {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69304a;

    /* renamed from: b  reason: collision with root package name */
    public FaceStickerBean f69305b;

    /* renamed from: c  reason: collision with root package name */
    public final z f69306c;

    /* renamed from: d  reason: collision with root package name */
    private final FaceStickerViewModel f69307d;

    /* renamed from: e  reason: collision with root package name */
    private final Observer<g> f69308e = new a(this);

    /* renamed from: f  reason: collision with root package name */
    private final AppCompatActivity f69309f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/viewmodel/FaceStickerWrapper;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class a<T> implements Observer<g> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69310a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ aj f69311b;

        a(aj ajVar) {
            this.f69311b = ajVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            g gVar = (g) obj;
            if (PatchProxy.isSupport(new Object[]{gVar}, this, f69310a, false, 78825, new Class[]{g.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{gVar}, this, f69310a, false, 78825, new Class[]{g.class}, Void.TYPE);
            } else if (!(gVar instanceof h)) {
                this.f69311b.f69305b = null;
                this.f69311b.f69306c.b();
            } else if (ae.a("voice_recognization", gVar.f70327a)) {
                this.f69311b.f69305b = gVar.f70327a;
                this.f69311b.f69306c.a();
            } else {
                this.f69311b.f69306c.b();
                this.f69311b.f69305b = null;
            }
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f69304a, false, 78822, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69304a, false, 78822, new Class[0], Void.TYPE);
            return;
        }
        if (this.f69305b != null) {
            this.f69306c.a();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f69304a, false, 78823, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69304a, false, 78823, new Class[0], Void.TYPE);
            return;
        }
        this.f69307d.a().observe(this.f69309f, this.f69308e);
    }

    public aj(@NotNull AppCompatActivity appCompatActivity, @NotNull z zVar) {
        Intrinsics.checkParameterIsNotNull(appCompatActivity, "context");
        Intrinsics.checkParameterIsNotNull(zVar, "provider");
        this.f69309f = appCompatActivity;
        this.f69306c = zVar;
        ViewModel viewModel = ViewModelProviders.of((FragmentActivity) this.f69309f).get(FaceStickerViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(co…kerViewModel::class.java]");
        this.f69307d = (FaceStickerViewModel) viewModel;
    }
}

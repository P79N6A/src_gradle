package com.ss.android.ugc.aweme.shortvideo.sticker.b;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.model.StoryFestivalModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.ae;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.FaceStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.g;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.h;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.i;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J*\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0013H\u0016J\b\u0010\u001b\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/helper/RecognizeStickerHelper;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/helper/IStickerHelper;", "context", "Landroid/support/v7/app/AppCompatActivity;", "(Landroid/support/v7/app/AppCompatActivity;)V", "faceStickerBean", "Lcom/ss/android/ugc/aweme/sticker/model/FaceStickerBean;", "faceStickerViewModel", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/viewmodel/FaceStickerViewModel;", "shortVideoContextViewModel", "Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContextViewModel;", "stickerMessageObserver", "Landroid/arch/lifecycle/Observer;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/viewmodel/StickerMessage;", "stickerSelectedObserver", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/viewmodel/FaceStickerWrapper;", "buildStoryFestivalModel", "Lcom/ss/android/ugc/aweme/shortvideo/model/StoryFestivalModel;", "onStickerMessageReceived", "", "messageType", "", "arg1", "arg2", "arg3", "", "register", "unregister", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69476a;
    public static final a h = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final FaceStickerViewModel f69477b;

    /* renamed from: c  reason: collision with root package name */
    public final ShortVideoContextViewModel f69478c;

    /* renamed from: d  reason: collision with root package name */
    public FaceStickerBean f69479d;

    /* renamed from: e  reason: collision with root package name */
    public final Observer<g> f69480e = new C0732c(this);

    /* renamed from: f  reason: collision with root package name */
    public final Observer<i> f69481f = new b(this);
    public final AppCompatActivity g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/helper/RecognizeStickerHelper$Companion;", "", "()V", "RENDER_MSG_EVENT_TRIGGER", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "message", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/viewmodel/StickerMessage;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class b<T> implements Observer<i> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69482a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f69483b;

        b(c cVar) {
            this.f69483b = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            i iVar = (i) obj;
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f69482a, false, 79077, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f69482a, false, 79077, new Class[]{i.class}, Void.TYPE);
                return;
            }
            if (iVar != null) {
                c cVar = this.f69483b;
                int i = iVar.f70329b;
                int i2 = iVar.f70330c;
                int i3 = iVar.f70331d;
                String str = iVar.f70332e;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, cVar, c.f69476a, false, 79075, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                    c cVar2 = cVar;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, cVar2, c.f69476a, false, 79075, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                } else {
                    if (i == 20 && i2 == 8) {
                        StoryFestivalModel storyFestivalModel = cVar.f69478c.f65401b.ap;
                        if (storyFestivalModel != null) {
                            storyFestivalModel.setTransResult(1);
                        }
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "faceStickerWrapper", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/viewmodel/FaceStickerWrapper;", "onChanged"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.c$c  reason: collision with other inner class name */
    static final class C0732c<T> implements Observer<g> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69484a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f69485b;

        C0732c(c cVar) {
            this.f69485b = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            StoryFestivalModel storyFestivalModel;
            g gVar = (g) obj;
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{gVar}, this, f69484a, false, 79078, new Class[]{g.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{gVar}, this, f69484a, false, 79078, new Class[]{g.class}, Void.TYPE);
                return;
            }
            this.f69485b.f69478c.f65401b.ap = null;
            if (gVar instanceof h) {
                this.f69485b.f69479d = gVar.f70327a;
                fh fhVar = this.f69485b.f69478c.f65401b;
                c cVar = this.f69485b;
                FaceStickerBean faceStickerBean = gVar.f70327a;
                if (PatchProxy.isSupport(new Object[]{faceStickerBean}, cVar, c.f69476a, false, 79076, new Class[]{FaceStickerBean.class}, StoryFestivalModel.class)) {
                    c cVar2 = cVar;
                    storyFestivalModel = (StoryFestivalModel) PatchProxy.accessDispatch(new Object[]{faceStickerBean}, cVar2, c.f69476a, false, 79076, new Class[]{FaceStickerBean.class}, StoryFestivalModel.class);
                } else {
                    storyFestivalModel = new StoryFestivalModel();
                    storyFestivalModel.setUseActivityEffect(ae.a("new_year", faceStickerBean));
                    if (ae.a("recognition", faceStickerBean)) {
                        i = 2;
                    }
                    storyFestivalModel.setTransResult(i);
                }
                fhVar.ap = storyFestivalModel;
                return;
            }
            if (gVar instanceof com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.a) {
                this.f69485b.f69479d = null;
            }
        }
    }

    public c(@NotNull AppCompatActivity appCompatActivity) {
        Intrinsics.checkParameterIsNotNull(appCompatActivity, "context");
        this.g = appCompatActivity;
        ViewModel viewModel = ViewModelProviders.of((FragmentActivity) this.g).get(FaceStickerViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(co…kerViewModel::class.java]");
        this.f69477b = (FaceStickerViewModel) viewModel;
        ViewModel viewModel2 = ViewModelProviders.of((FragmentActivity) this.g).get(ShortVideoContextViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel2, "ViewModelProviders.of(co…extViewModel::class.java]");
        this.f69478c = (ShortVideoContextViewModel) viewModel2;
    }
}

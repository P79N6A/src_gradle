package com.ss.android.ugc.aweme.story.shootvideo.record.scene;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.sticker.ae;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.FaceStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.g;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.h;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.i;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J*\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0014H\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/scene/StoryZoomInStickerHelper;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/helper/IStickerHelper;", "context", "Landroid/support/v7/app/AppCompatActivity;", "(Landroid/support/v7/app/AppCompatActivity;)V", "faceStickerBean", "Lcom/ss/android/ugc/aweme/sticker/model/FaceStickerBean;", "faceStickerViewModel", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/viewmodel/FaceStickerViewModel;", "isMessageHandled", "", "stickerMessageObserver", "Landroid/arch/lifecycle/Observer;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/viewmodel/StickerMessage;", "stickerSelectedObserver", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/viewmodel/FaceStickerWrapper;", "storySceneViewModel", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/scene/StorySceneViewModel;", "isZoomInSticker", "onStickerMessageReceived", "", "messageType", "", "arg1", "arg2", "arg3", "", "register", "unregister", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74078a;

    /* renamed from: b  reason: collision with root package name */
    public final StorySceneViewModel f74079b;

    /* renamed from: c  reason: collision with root package name */
    final FaceStickerViewModel f74080c;

    /* renamed from: d  reason: collision with root package name */
    public FaceStickerBean f74081d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f74082e;

    /* renamed from: f  reason: collision with root package name */
    final Observer<g> f74083f = new b(this);
    final Observer<i> g = new a(this);
    final AppCompatActivity h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "message", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/viewmodel/StickerMessage;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class a<T> implements Observer<i> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74084a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f74085b;

        a(d dVar) {
            this.f74085b = dVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            i iVar = (i) obj;
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f74084a, false, 85978, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f74084a, false, 85978, new Class[]{i.class}, Void.TYPE);
                return;
            }
            if (iVar != null) {
                d dVar = this.f74085b;
                int i = iVar.f70329b;
                int i2 = iVar.f70330c;
                int i3 = iVar.f70331d;
                String str = iVar.f70332e;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, dVar, d.f74078a, false, 85976, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                    d dVar2 = dVar;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, dVar2, d.f74078a, false, 85976, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                } else {
                    if (!dVar.f74082e && dVar.a(dVar.f74081d) && i == 20 && (i2 == 6 || i2 == 7)) {
                        dVar.f74079b.a(true);
                        dVar.f74082e = true;
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "faceStickerWrapper", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/viewmodel/FaceStickerWrapper;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class b<T> implements Observer<g> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74086a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f74087b;

        b(d dVar) {
            this.f74087b = dVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            FaceStickerBean faceStickerBean;
            g gVar = (g) obj;
            if (PatchProxy.isSupport(new Object[]{gVar}, this, f74086a, false, 85979, new Class[]{g.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{gVar}, this, f74086a, false, 85979, new Class[]{g.class}, Void.TYPE);
                return;
            }
            this.f74087b.f74082e = false;
            d dVar = this.f74087b;
            if (gVar instanceof h) {
                if (this.f74087b.a(gVar.f70327a)) {
                    this.f74087b.f74079b.a(false);
                }
                faceStickerBean = gVar.f70327a;
            } else {
                faceStickerBean = null;
            }
            dVar.f74081d = faceStickerBean;
        }
    }

    public d(@NotNull AppCompatActivity appCompatActivity) {
        Intrinsics.checkParameterIsNotNull(appCompatActivity, "context");
        this.h = appCompatActivity;
        ViewModel viewModel = ViewModelProviders.of((FragmentActivity) this.h).get(StorySceneViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(co…eneViewModel::class.java]");
        this.f74079b = (StorySceneViewModel) viewModel;
        ViewModel viewModel2 = ViewModelProviders.of((FragmentActivity) this.h).get(FaceStickerViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel2, "ViewModelProviders.of(co…kerViewModel::class.java]");
        this.f74080c = (FaceStickerViewModel) viewModel2;
    }

    public final boolean a(FaceStickerBean faceStickerBean) {
        FaceStickerBean faceStickerBean2 = faceStickerBean;
        if (!PatchProxy.isSupport(new Object[]{faceStickerBean2}, this, f74078a, false, 85977, new Class[]{FaceStickerBean.class}, Boolean.TYPE)) {
            return ae.a("zoomin", faceStickerBean2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{faceStickerBean2}, this, f74078a, false, 85977, new Class[]{FaceStickerBean.class}, Boolean.TYPE)).booleanValue();
    }
}

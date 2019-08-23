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
import com.ss.android.ugc.aweme.shortvideo.sticker.ae;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.FaceStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.g;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.h;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.i;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.story.shootvideo.record.base.f;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 *2\u00020\u0001:\u0001*B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0018H\u0002J*\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010$\u001a\u00020\u001cH\u0016J\u0012\u0010%\u001a\u00020\u001c2\b\u0010&\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010'\u001a\u00020\u001cH\u0016J\u0012\u0010(\u001a\u00020\u001c2\b\u0010&\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010)\u001a\u00020\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000fX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0016X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/helper/MuteStickerHelper;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/helper/IStickerHelper;", "context", "Landroid/support/v7/app/AppCompatActivity;", "recordController", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/IRecorderController;", "(Landroid/support/v7/app/AppCompatActivity;Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/IRecorderController;)V", "faceStickerBean", "Lcom/ss/android/ugc/aweme/sticker/model/FaceStickerBean;", "faceStickerViewModel", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/viewmodel/FaceStickerViewModel;", "hadLoadedMusic", "", "isMuted", "recordStateObserver", "Landroid/arch/lifecycle/Observer;", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/RecordStateWrapper;", "shortVideoContextViewModel", "Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContextViewModel;", "stickerMessageObserver", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/viewmodel/StickerMessage;", "stickerMusicPathMap", "", "", "", "stickerSelectedObserver", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/viewmodel/FaceStickerWrapper;", "applyMusic", "", "path", "onStickerMessageReceived", "messageType", "", "arg1", "arg2", "arg3", "register", "setMusicNodes", "musicPath", "unregister", "updateMusicData", "useMusicCachePathIfNeeded", "Companion", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69463a;
    public static final C0731a m = new C0731a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    final Map<Long, String> f69464b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final FaceStickerViewModel f69465c;

    /* renamed from: d  reason: collision with root package name */
    public final ShortVideoContextViewModel f69466d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f69467e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f69468f;
    public FaceStickerBean g;
    public final Observer<g> h;
    public final Observer<i> i;
    public final Observer<com.ss.android.ugc.aweme.story.shootvideo.record.base.g> j;
    public final AppCompatActivity k;
    public final com.ss.android.ugc.aweme.story.shootvideo.record.base.d l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/helper/MuteStickerHelper$Companion;", "", "()V", "RENDER_MSG_EVENT_MUSIC_PATH", "", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.a$a  reason: collision with other inner class name */
    public static final class C0731a {
        private C0731a() {
        }

        public /* synthetic */ C0731a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "stateWrapper", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/base/RecordStateWrapper;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class b<T> implements Observer<com.ss.android.ugc.aweme.story.shootvideo.record.base.g> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69469a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f69470b;

        b(a aVar) {
            this.f69470b = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            f fVar;
            com.ss.android.ugc.aweme.story.shootvideo.record.base.g gVar = (com.ss.android.ugc.aweme.story.shootvideo.record.base.g) obj;
            if (PatchProxy.isSupport(new Object[]{gVar}, this, f69469a, false, 79070, new Class[]{com.ss.android.ugc.aweme.story.shootvideo.record.base.g.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{gVar}, this, f69469a, false, 79070, new Class[]{com.ss.android.ugc.aweme.story.shootvideo.record.base.g.class}, Void.TYPE);
                return;
            }
            if (gVar != null) {
                fVar = gVar.f73900b;
            } else {
                fVar = null;
            }
            if (fVar != null && b.f69475a[fVar.ordinal()] == 1) {
                a aVar = this.f69470b;
                if (PatchProxy.isSupport(new Object[0], aVar, a.f69463a, false, 79066, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar, a.f69463a, false, 79066, new Class[0], Void.TYPE);
                } else if (!aVar.f69468f && ae.a("mute", aVar.g)) {
                    FaceStickerBean faceStickerBean = aVar.g;
                    if (faceStickerBean != null) {
                        String str = aVar.f69464b.get(Long.valueOf(faceStickerBean.getStickerId()));
                        if (str != null) {
                            aVar.a(str);
                        }
                    }
                }
                if (this.f69470b.f69467e && this.f69470b.f69466d.f65401b.f67723f != null && !this.f69470b.f69466d.l()) {
                    this.f69470b.l.a(this.f69470b.f69466d.f65401b.f67723f);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "message", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/viewmodel/StickerMessage;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class c<T> implements Observer<i> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69471a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f69472b;

        c(a aVar) {
            this.f69472b = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            i iVar = (i) obj;
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f69471a, false, 79071, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f69471a, false, 79071, new Class[]{i.class}, Void.TYPE);
                return;
            }
            if (iVar != null) {
                a aVar = this.f69472b;
                int i = iVar.f70329b;
                int i2 = iVar.f70330c;
                int i3 = iVar.f70331d;
                String str = iVar.f70332e;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, aVar, a.f69463a, false, 79065, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                    a aVar2 = aVar;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, aVar2, a.f69463a, false, 79065, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                } else {
                    if (i == 20 && i2 == 7 && ae.a("mute", aVar.g) && !aVar.f69468f) {
                        FaceStickerBean faceStickerBean = aVar.g;
                        if (faceStickerBean != null) {
                            aVar.f69464b.put(Long.valueOf(faceStickerBean.getStickerId()), str);
                        }
                        aVar.a(str);
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "faceStickerWrapper", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/viewmodel/FaceStickerWrapper;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class d<T> implements Observer<g> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69473a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f69474b;

        d(a aVar) {
            this.f69474b = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            g gVar = (g) obj;
            if (PatchProxy.isSupport(new Object[]{gVar}, this, f69473a, false, 79072, new Class[]{g.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{gVar}, this, f69473a, false, 79072, new Class[]{g.class}, Void.TYPE);
                return;
            }
            this.f69474b.f69468f = false;
            this.f69474b.f69467e = false;
            FaceStickerBean faceStickerBean = null;
            this.f69474b.l.a((String) null);
            this.f69474b.b(null);
            a aVar = this.f69474b;
            if (gVar instanceof h) {
                faceStickerBean = gVar.f70327a;
            }
            aVar.g = faceStickerBean;
        }
    }

    private final void c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f69463a, false, 79069, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f69463a, false, 79069, new Class[]{String.class}, Void.TYPE);
            return;
        }
        String str3 = "";
        if (str2 != null) {
            String a2 = com.ss.android.ugc.aweme.port.in.a.i.a(str2);
            if (new File(a2).exists()) {
                str3 = a2;
            }
        }
        this.l.g().e(str3);
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f69463a, false, 79067, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f69463a, false, 79067, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f69467e = true;
        this.f69468f = true;
        b(str);
        if (ae.a("zoomin", this.g)) {
            c(str);
        }
    }

    public final void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f69463a, false, 79068, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f69463a, false, 79068, new Class[]{String.class}, Void.TYPE);
            return;
        }
        fh fhVar = this.f69466d.f65401b;
        if (str2 != null) {
            int b2 = com.ss.android.ugc.aweme.port.in.a.i.b(str2);
            if (b2 > 0) {
                fhVar.h = b2;
            }
            fhVar.f67723f = str2;
            return;
        }
        fhVar.l.f();
        fhVar.f67723f = null;
        fhVar.h = 0;
    }

    public a(@NotNull AppCompatActivity appCompatActivity, @NotNull com.ss.android.ugc.aweme.story.shootvideo.record.base.d dVar) {
        Intrinsics.checkParameterIsNotNull(appCompatActivity, "context");
        Intrinsics.checkParameterIsNotNull(dVar, "recordController");
        this.k = appCompatActivity;
        this.l = dVar;
        ViewModel viewModel = ViewModelProviders.of((FragmentActivity) this.k).get(FaceStickerViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(co…kerViewModel::class.java]");
        this.f69465c = (FaceStickerViewModel) viewModel;
        ViewModel viewModel2 = ViewModelProviders.of((FragmentActivity) this.k).get(ShortVideoContextViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(viewModel2, "ViewModelProviders.of(co…extViewModel::class.java]");
        this.f69466d = (ShortVideoContextViewModel) viewModel2;
        this.h = new d(this);
        this.i = new c(this);
        this.j = new b(this);
    }
}

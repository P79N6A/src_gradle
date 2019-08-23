package com.ss.android.ugc.aweme.shortvideo.music;

import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ao.a;
import com.ss.android.ugc.aweme.ao.a.i;
import com.ss.android.ugc.aweme.ao.a.k;
import com.ss.android.ugc.aweme.ao.a.l;
import com.ss.android.ugc.aweme.ao.a.m;
import com.ss.android.ugc.aweme.photomovie.transition.f;
import com.ss.android.vesdk.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0014\u0018\u0000 p2\u00020\u0001:\u0002pqB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010X\u001a\u00020\u0019J\u0006\u0010Y\u001a\u00020\u0019J\u0010\u0010Z\u001a\u0004\u0018\u00010?2\u0006\u0010[\u001a\u00020\u0019J\b\u0010\\\u001a\u0004\u0018\u00010=J\u0006\u0010]\u001a\u00020^J\u0018\u0010_\u001a\u00020^2\u0006\u0010`\u001a\u00020\u00032\u0006\u0010a\u001a\u00020\u0005H\u0002J\b\u0010b\u001a\u00020^H\u0002J\u0010\u0010c\u001a\u00020^2\u0006\u0010d\u001a\u00020;H\u0016J\u0006\u0010e\u001a\u00020^J\u000e\u0010f\u001a\u00020^2\u0006\u0010g\u001a\u00020\u0019J\u0006\u0010h\u001a\u00020^J\u0006\u0010i\u001a\u00020^J\u0018\u0010j\u001a\u00020^2\u0006\u0010k\u001a\u00020\u00192\u0006\u0010l\u001a\u00020\fH\u0002J\u000e\u0010m\u001a\u00020^2\u0006\u0010n\u001a\u000200J\u0006\u0010o\u001a\u00020^R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u000e¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u000102X\u000e¢\u0006\u0002\n\u0000R\u001c\u00104\u001a\u0004\u0018\u000105X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010>\u001a\u0004\u0018\u00010?X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR4\u0010G\u001a\n\u0012\u0004\u0012\u00020F\u0018\u00010E2\u000e\u0010D\u001a\n\u0012\u0004\u0012\u00020F\u0018\u00010E@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001c\u0010L\u001a\u0004\u0018\u00010MX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001c\u0010R\u001a\u0004\u0018\u00010SX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006r"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/music/MusicView;", "Landroid/view/View$OnClickListener;", "mActivity", "Landroid/support/v7/app/AppCompatActivity;", "mParentView", "Landroid/widget/FrameLayout;", "mListenableActivityRegistry", "Lcom/ss/android/ugc/aweme/base/activity/ListenableActivityRegistry;", "(Landroid/support/v7/app/AppCompatActivity;Landroid/widget/FrameLayout;Lcom/ss/android/ugc/aweme/base/activity/ListenableActivityRegistry;)V", "aiMusicView", "Lcom/ss/android/ugc/aweme/toolsport/IAVMusicService$IAIMusicView;", "isEnableCutMusic", "", "()Z", "setEnableCutMusic", "(Z)V", "isFromDraft", "setFromDraft", "isShowing", "setShowing", "mBottomSheetLayout", "Landroid/widget/RelativeLayout;", "mChooseFilterTransition", "Lcom/ss/android/ugc/aweme/filter/ChooseFilterTransition;", "mCurrentTab", "", "mKeyDownListener", "Lcom/ss/android/ugc/aweme/base/activity/ActivityOnKeyDownListener;", "mMusicContainer", "mOnAIMusicAnimLoadingListener", "Lcom/ss/android/ugc/aweme/toolsport/model/OnAIMusicAnimLoadingListener;", "getMOnAIMusicAnimLoadingListener", "()Lcom/ss/android/ugc/aweme/toolsport/model/OnAIMusicAnimLoadingListener;", "setMOnAIMusicAnimLoadingListener", "(Lcom/ss/android/ugc/aweme/toolsport/model/OnAIMusicAnimLoadingListener;)V", "mOnMusicTabClickListener", "Lcom/ss/android/ugc/aweme/toolsport/model/OnMusicTabClickListener;", "getMOnMusicTabClickListener", "()Lcom/ss/android/ugc/aweme/toolsport/model/OnMusicTabClickListener;", "setMOnMusicTabClickListener", "(Lcom/ss/android/ugc/aweme/toolsport/model/OnMusicTabClickListener;)V", "mOnMusicViewClickListener", "Lcom/ss/android/ugc/aweme/shortvideo/music/MusicView$OnMusicViewClickListener;", "getMOnMusicViewClickListener", "()Lcom/ss/android/ugc/aweme/shortvideo/music/MusicView$OnMusicViewClickListener;", "setMOnMusicViewClickListener", "(Lcom/ss/android/ugc/aweme/shortvideo/music/MusicView$OnMusicViewClickListener;)V", "mTransitionListener", "Lcom/ss/android/ugc/aweme/photomovie/transition/TransitionListener;", "mTvwTabMusic", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "mTvwTabVolume", "mVEEditer", "Lcom/ss/android/vesdk/VEEditor;", "getMVEEditer", "()Lcom/ss/android/vesdk/VEEditor;", "setMVEEditer", "(Lcom/ss/android/vesdk/VEEditor;)V", "mView", "Landroid/view/View;", "mVolumeContainer", "Landroid/view/ViewGroup;", "mvMusicModel", "Lcom/ss/android/ugc/aweme/shortvideo/AVMusic;", "getMvMusicModel", "()Lcom/ss/android/ugc/aweme/shortvideo/AVMusic;", "setMvMusicModel", "(Lcom/ss/android/ugc/aweme/shortvideo/AVMusic;)V", "value", "", "", "mvThemeMusicIds", "getMvThemeMusicIds", "()Ljava/util/List;", "setMvThemeMusicIds", "(Ljava/util/List;)V", "onItemClickListener", "Lcom/ss/android/ugc/aweme/toolsport/model/OnItemClickListener;", "getOnItemClickListener", "()Lcom/ss/android/ugc/aweme/toolsport/model/OnItemClickListener;", "setOnItemClickListener", "(Lcom/ss/android/ugc/aweme/toolsport/model/OnItemClickListener;)V", "onItemShowListener", "Lcom/ss/android/ugc/aweme/toolsport/model/OnItemShowListener;", "getOnItemShowListener", "()Lcom/ss/android/ugc/aweme/toolsport/model/OnItemShowListener;", "setOnItemShowListener", "(Lcom/ss/android/ugc/aweme/toolsport/model/OnItemShowListener;)V", "getCurrentAiMusicTab", "getCurrentMusicRecType", "getSelectMusic", "position", "getVolumeView", "hide", "", "initView", "activity", "root", "initViews", "onClick", "v", "onDestory", "onMusicCut", "startTime", "onPause", "onResume", "setTab", "tab", "callBack", "setTransitionListener", "transitionListener", "show", "Companion", "OnMusicViewClickListener", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a implements View.OnClickListener {
    public static final C0720a A = new C0720a((byte) 0);
    private static final int C = 2;

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68410a = null;
    public static final int z = 1;
    private int B;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public List<String> f68411b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.ao.a.h f68412c;

    /* renamed from: d  reason: collision with root package name */
    public a.c f68413d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.base.activity.a f68414e = new g(this);
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public m f68415f;
    public boolean g;
    @Nullable
    public b h;
    public boolean i;
    public boolean j;
    public DmtTextView k;
    public DmtTextView l;
    public RelativeLayout m;
    public View n;
    public com.ss.android.ugc.aweme.filter.b o;
    public com.ss.android.ugc.aweme.photomovie.transition.f p;
    public ViewGroup q;
    public FrameLayout r;
    @Nullable
    public l s;
    @Nullable
    public k t;
    @Nullable
    public p u;
    @Nullable
    public com.ss.android.ugc.aweme.shortvideo.e v;
    public final AppCompatActivity w;
    public final FrameLayout x;
    public final com.ss.android.ugc.aweme.base.activity.e y;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/music/MusicView$Companion;", "", "()V", "TAB_MUSIC", "", "TAB_VOLUME", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.music.a$a  reason: collision with other inner class name */
    public static final class C0720a {
        private C0720a() {
        }

        public /* synthetic */ C0720a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J$\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/music/MusicView$OnMusicViewClickListener;", "", "onClickCutMusic", "", "onClickMusicLib", "onClickMusicTab", "onClickVolumeTab", "onMusicChoose", "musicFilePath", "", "musicModel", "Lcom/ss/android/ugc/aweme/shortvideo/AVMusic;", "isFromRecommend", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface b {
        void a();

        void a(@Nullable String str, @Nullable com.ss.android.ugc.aweme.shortvideo.e eVar, boolean z);

        void b();

        void c();

        void d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J \u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J \u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/music/MusicView$initView$1", "Lcom/ss/android/ugc/aweme/photomovie/transition/TransitionListener$DefaultTransitionListener;", "onHideEnd", "", "onHidePre", "onHiding", "franc", "", "start", "", "end", "onShowEnd", "onShowPre", "onShowing", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c extends f.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68416a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f68417b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f68416a, false, 77765, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f68416a, false, 77765, new Class[0], Void.TYPE);
                return;
            }
            this.f68417b.i = true;
            com.ss.android.ugc.aweme.photomovie.transition.f fVar = this.f68417b.p;
            if (fVar != null) {
                fVar.a();
            }
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f68416a, false, 77767, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f68416a, false, 77767, new Class[0], Void.TYPE);
                return;
            }
            a.c cVar = this.f68417b.f68413d;
            if (cVar != null) {
                cVar.a(true);
            }
            com.ss.android.ugc.aweme.photomovie.transition.f fVar = this.f68417b.p;
            if (fVar != null) {
                fVar.b();
            }
        }

        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f68416a, false, 77768, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f68416a, false, 77768, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.photomovie.transition.f fVar = this.f68417b.p;
            if (fVar != null) {
                fVar.c();
            }
            a.c cVar = this.f68417b.f68413d;
            if (cVar != null) {
                cVar.f();
            }
        }

        public final void d() {
            if (PatchProxy.isSupport(new Object[0], this, f68416a, false, 77770, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f68416a, false, 77770, new Class[0], Void.TYPE);
                return;
            }
            this.f68417b.i = false;
            com.ss.android.ugc.aweme.photomovie.transition.f fVar = this.f68417b.p;
            if (fVar != null) {
                fVar.d();
            }
        }

        public c(a aVar) {
            this.f68417b = aVar;
        }

        public final void a(float f2, int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2)}, this, f68416a, false, 77766, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2)}, this, f68416a, false, 77766, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.photomovie.transition.f fVar = this.f68417b.p;
            if (fVar != null) {
                fVar.a(f2, i, i2);
            }
        }

        public final void b(float f2, int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2)}, this, f68416a, false, 77769, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2)}, this, f68416a, false, 77769, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.photomovie.transition.f fVar = this.f68417b.p;
            if (fVar != null) {
                fVar.b(f2, i, i2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68418a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f68419b;

        public d(a aVar) {
            this.f68419b = aVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f68418a, false, 77771, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f68418a, false, 77771, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f68419b.b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/music/MusicView$initViews$2", "Lcom/ss/android/ugc/aweme/toolsport/model/AIMusicConfig;", "enableCutMusic", "", "hide", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e implements com.ss.android.ugc.aweme.ao.a.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68420a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f68421b;

        public final boolean b() {
            return this.f68421b.g;
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f68420a, false, 77772, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f68420a, false, 77772, new Class[0], Void.TYPE);
                return;
            }
            this.f68421b.b();
        }

        public e(a aVar) {
            this.f68421b = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J$\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/music/MusicView$initViews$3", "Lcom/ss/android/ugc/aweme/toolsport/model/OnAiMusicClickListener;", "onClickCutMusic", "", "onClickMusicLib", "onMusicChoose", "musicFilePath", "", "musicModel", "Lcom/ss/android/ugc/aweme/shortvideo/AVMusic;", "isFromRecommend", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class f implements i {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68422a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f68423b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f68422a, false, 77773, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f68422a, false, 77773, new Class[0], Void.TYPE);
                return;
            }
            b bVar = this.f68423b.h;
            if (bVar != null) {
                bVar.a();
            }
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f68422a, false, 77774, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f68422a, false, 77774, new Class[0], Void.TYPE);
                return;
            }
            b bVar = this.f68423b.h;
            if (bVar != null) {
                bVar.d();
            }
        }

        public f(a aVar) {
            this.f68423b = aVar;
        }

        public final void a(@Nullable String str, @Nullable com.ss.android.ugc.aweme.shortvideo.e eVar, boolean z) {
            String str2 = str;
            com.ss.android.ugc.aweme.shortvideo.e eVar2 = eVar;
            if (PatchProxy.isSupport(new Object[]{str2, eVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f68422a, false, 77775, new Class[]{String.class, com.ss.android.ugc.aweme.shortvideo.e.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, eVar2, Byte.valueOf(z)}, this, f68422a, false, 77775, new Class[]{String.class, com.ss.android.ugc.aweme.shortvideo.e.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            b bVar = this.f68423b.h;
            if (bVar != null) {
                bVar.a(str2, eVar2, z);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "kotlin.jvm.PlatformType", "onKeyDown"}, k = 3, mv = {1, 1, 15})
    static final class g implements com.ss.android.ugc.aweme.base.activity.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68424a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f68425b;

        g(a aVar) {
            this.f68425b = aVar;
        }

        public final boolean a(int i, KeyEvent keyEvent) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), keyEvent}, this, f68424a, false, 77776, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), keyEvent}, this, f68424a, false, 77776, new Class[]{Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
            } else if (i == 4) {
                this.f68425b.b();
                return true;
            } else {
                return false;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/music/MusicView$show$1", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/transition/EmptyTransition;", "onShowPre", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class h extends com.ss.android.ugc.aweme.shortvideo.sticker.c.c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68426a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f68427b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f68426a, false, 77777, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f68426a, false, 77777, new Class[0], Void.TYPE);
                return;
            }
            View view = this.f68427b.n;
            if (view != null) {
                view.setVisibility(0);
            }
            super.a();
        }

        public h(a aVar) {
            this.f68427b = aVar;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f68410a, false, 77756, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68410a, false, 77756, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.filter.b bVar = this.o;
        if (bVar != null) {
            bVar.b(new com.ss.android.ugc.aweme.shortvideo.sticker.c.c());
        }
        this.y.b(this.f68414e);
    }

    public final int c() {
        if (PatchProxy.isSupport(new Object[0], this, f68410a, false, 77763, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f68410a, false, 77763, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f68413d == null) {
            return 0;
        } else {
            a.c cVar = this.f68413d;
            if (cVar == null) {
                Intrinsics.throwNpe();
            }
            return cVar.c();
        }
    }

    public final int a() {
        if (PatchProxy.isSupport(new Object[0], this, f68410a, false, 77753, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f68410a, false, 77753, new Class[0], Integer.TYPE)).intValue();
        }
        Integer b2 = com.ss.android.ugc.aweme.port.in.a.i.f().d().b();
        if (b2 != null) {
            return b2.intValue();
        }
        return 0;
    }

    public final void onClick(@NotNull View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f68410a, false, 77762, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f68410a, false, 77762, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        Intrinsics.checkParameterIsNotNull(view, NotifyType.VIBRATE);
        int id = view.getId();
        if (id == C0906R.id.dlz) {
            a(z, true);
            return;
        }
        if (id == C0906R.id.dm4) {
            a(C, true);
        }
    }

    @Nullable
    public final com.ss.android.ugc.aweme.shortvideo.e a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f68410a, false, 77764, new Class[]{Integer.TYPE}, com.ss.android.ugc.aweme.shortvideo.e.class)) {
            return (com.ss.android.ugc.aweme.shortvideo.e) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f68410a, false, 77764, new Class[]{Integer.TYPE}, com.ss.android.ugc.aweme.shortvideo.e.class);
        } else if (b.a() == 2 && c() == 1) {
            a.c cVar = this.f68413d;
            if (cVar != null) {
                return cVar.a(i2);
            }
            return null;
        } else {
            a.c cVar2 = this.f68413d;
            if (cVar2 != null) {
                return cVar2.b(i2);
            }
            return null;
        }
    }

    public final void a(int i2, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f68410a, false, 77761, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2)}, this, f68410a, false, 77761, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (i2 != this.B) {
            this.B = i2;
            if (this.B == z) {
                DmtTextView dmtTextView = this.l;
                if (dmtTextView != null) {
                    dmtTextView.setSelected(true);
                }
                DmtTextView dmtTextView2 = this.k;
                if (dmtTextView2 != null) {
                    dmtTextView2.setSelected(false);
                }
                ViewGroup viewGroup = this.q;
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
                FrameLayout frameLayout = this.r;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
            } else {
                DmtTextView dmtTextView3 = this.l;
                if (dmtTextView3 != null) {
                    dmtTextView3.setSelected(false);
                }
                DmtTextView dmtTextView4 = this.k;
                if (dmtTextView4 != null) {
                    dmtTextView4.setSelected(true);
                }
                ViewGroup viewGroup2 = this.q;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
                FrameLayout frameLayout2 = this.r;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(8);
                }
            }
            if (z2) {
                if (this.B == C) {
                    b bVar = this.h;
                    if (bVar != null) {
                        bVar.b();
                    }
                } else {
                    b bVar2 = this.h;
                    if (bVar2 != null) {
                        bVar2.c();
                    }
                }
            }
        }
    }

    public a(@NotNull AppCompatActivity appCompatActivity, @NotNull FrameLayout frameLayout, @NotNull com.ss.android.ugc.aweme.base.activity.e eVar) {
        Intrinsics.checkParameterIsNotNull(appCompatActivity, "mActivity");
        Intrinsics.checkParameterIsNotNull(frameLayout, "mParentView");
        Intrinsics.checkParameterIsNotNull(eVar, "mListenableActivityRegistry");
        this.w = appCompatActivity;
        this.x = frameLayout;
        this.y = eVar;
    }
}

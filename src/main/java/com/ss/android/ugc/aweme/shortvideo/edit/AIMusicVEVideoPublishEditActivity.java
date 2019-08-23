package com.ss.android.ugc.aweme.shortvideo.edit;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.MutableLiveData;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ao.a;
import com.ss.android.ugc.aweme.ao.a.k;
import com.ss.android.ugc.aweme.ao.a.l;
import com.ss.android.ugc.aweme.ao.a.m;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.photomovie.transition.ITransition;
import com.ss.android.ugc.aweme.photomovie.transition.f;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.f;
import com.ss.android.ugc.aweme.shortvideo.ej;
import com.ss.android.ugc.aweme.shortvideo.helper.VolumeHelper;
import com.ss.android.ugc.aweme.shortvideo.music.a;
import com.ss.android.vesdk.VEMVAudioInfo;
import com.ss.android.vesdk.p;
import dmt.av.video.VEVideoPublishEditViewModel;
import dmt.av.video.s;
import dmt.av.video.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0014J\b\u0010\u001d\u001a\u00020\u001bH\u0014J\b\u0010\u001e\u001a\u00020\u001bH\u0014J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\nH\u0014J\b\u0010!\u001a\u00020\"H\u0014J\b\u0010#\u001a\u00020\u001bH\u0014J\b\u0010$\u001a\u00020\u001bH\u0014J\u0012\u0010%\u001a\u00020\u001b2\b\u0010&\u001a\u0004\u0018\u00010'H\u0014J\b\u0010(\u001a\u00020\u001bH\u0014J\"\u0010)\u001a\u00020\u001b2\b\u0010*\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010\u000fJ\u001c\u0010)\u001a\u00020\u001b2\b\u0010*\u001a\u0004\u0018\u00010\u00042\b\u0010-\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010.\u001a\u00020\u001bH\u0014J\b\u0010/\u001a\u00020\u001bH\u0014J\u0006\u00100\u001a\u00020\u001bJ\b\u00101\u001a\u00020\u001bH\u0014J\u0018\u00102\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\nH\u0014J\b\u00105\u001a\u00020\u001bH\u0002J\b\u00106\u001a\u00020\u001bH\u0016R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/AIMusicVEVideoPublishEditActivity;", "Lcom/ss/android/ugc/aweme/shortvideo/edit/VEVideoPublishEditActivity;", "()V", "contentSource", "", "getContentSource", "()Ljava/lang/String;", "contentType", "getContentType", "getRecommendMusic", "", "isPropGuideShow", "mGuideShow", "mIsCutMusic", "mLastMusicModel", "Lcom/ss/android/ugc/aweme/shortvideo/AVMusic;", "mMusicFromAI", "mMusicIdFromLib", "mMusicView", "Lcom/ss/android/ugc/aweme/shortvideo/music/MusicView;", "mNeedShowGuide", "mOriginFromLib", "mShouldShowMusicGuide", "musicBubble", "Lcom/bytedance/ies/dmt/ui/bubbleview/DmtBubbleView;", "musicBubbleInited", "checkNeedShowMusicGuide", "", "clearMusic", "clickChangeVolume", "clickChooseMusic", "enableCutMusic", "enable", "getMusicRecType", "", "initCutMusicAndVolumeHolder", "initVolumeHelper", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onMusicChoose", "path", "isFromRecommend", "musicModel", "musicOrigin", "onMusicCut", "onPause", "onPreviewMusicRemove", "onResume", "setMvMusicDetailModel", "model", "shouldSetToMvMusic", "showAIMusicGuide", "tryShowMusicGuide", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AIMusicVEVideoPublishEditActivity extends VEVideoPublishEditActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66849a;
    private boolean V;
    private boolean W;
    private String X = "";
    private String Y = "";
    private boolean Z;
    private boolean aa;
    private boolean ab;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.e f66850b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.music.a f66851c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f66852d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f66853e;

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.ies.dmt.ui.a.b f66854f;
    public boolean g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "voiceRatio", "", "musicRatio", "onAudioMusicVolume"}, k = 3, mv = {1, 1, 15})
    static final class a implements VolumeHelper.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66855a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AIMusicVEVideoPublishEditActivity f66856b;

        a(AIMusicVEVideoPublishEditActivity aIMusicVEVideoPublishEditActivity) {
            this.f66856b = aIMusicVEVideoPublishEditActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0064, code lost:
            if (r0.getWavFile() != null) goto L_0x0066;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(float r11, float r12) {
            /*
                r10 = this;
                r7 = 2
                java.lang.Object[] r0 = new java.lang.Object[r7]
                java.lang.Float r1 = java.lang.Float.valueOf(r11)
                r8 = 0
                r0[r8] = r1
                java.lang.Float r1 = java.lang.Float.valueOf(r12)
                r9 = 1
                r0[r9] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f66855a
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class r1 = java.lang.Float.TYPE
                r5[r8] = r1
                java.lang.Class r1 = java.lang.Float.TYPE
                r5[r9] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 76161(0x12981, float:1.06724E-40)
                r1 = r10
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x004f
                java.lang.Object[] r0 = new java.lang.Object[r7]
                java.lang.Float r1 = java.lang.Float.valueOf(r11)
                r0[r8] = r1
                java.lang.Float r1 = java.lang.Float.valueOf(r12)
                r0[r9] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f66855a
                r3 = 0
                r4 = 76161(0x12981, float:1.06724E-40)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class r1 = java.lang.Float.TYPE
                r5[r8] = r1
                java.lang.Class r1 = java.lang.Float.TYPE
                r5[r9] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r10
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x004f:
                com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity r0 = r10.f66856b
                com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r0.z
                boolean r0 = r0.isFastImport
                if (r0 != 0) goto L_0x0066
                com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity r0 = r10.f66856b
                com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r0.z
                java.lang.String r1 = "mModel"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                java.lang.String r0 = r0.getWavFile()
                if (r0 == 0) goto L_0x006e
            L_0x0066:
                com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity r0 = r10.f66856b
                com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r0.z
                boolean r0 = r0.isMuted
                if (r0 == 0) goto L_0x0083
            L_0x006e:
                com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity r0 = r10.f66856b
                dmt.av.video.VEVideoPublishEditViewModel r0 = r0.v
                java.lang.String r1 = "mViewModel"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                android.arch.lifecycle.MutableLiveData r0 = r0.o()
                com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp r1 = com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp.ofMusic(r12)
                r0.setValue(r1)
                goto L_0x00bd
            L_0x0083:
                com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity r0 = r10.f66856b
                dmt.av.video.VEVideoPublishEditViewModel r0 = r0.v
                java.lang.String r1 = "mViewModel"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                android.arch.lifecycle.MutableLiveData r0 = r0.o()
                java.lang.String r1 = "mViewModel.volumeChangeOpLiveData"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp r1 = com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp.ofVoice(r11)
                r0.setValue(r1)
                com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity r0 = r10.f66856b
                com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r0.z
                java.lang.String r0 = r0.mMusicPath
                if (r0 == 0) goto L_0x00bd
                com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity r0 = r10.f66856b
                dmt.av.video.VEVideoPublishEditViewModel r0 = r0.v
                java.lang.String r1 = "mViewModel"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                android.arch.lifecycle.MutableLiveData r0 = r0.o()
                java.lang.String r1 = "mViewModel.volumeChangeOpLiveData"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp r1 = com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp.ofMusic(r12)
                r0.setValue(r1)
            L_0x00bd:
                com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity r0 = r10.f66856b
                com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r0.z
                r0.voiceVolume = r11
                com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity r0 = r10.f66856b
                com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r0.z
                r0.musicVolume = r12
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity.a.a(float, float):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/edit/AIMusicVEVideoPublishEditActivity$initCutMusicAndVolumeHolder$1", "Lcom/ss/android/ugc/aweme/toolsport/model/OnItemClickListener;", "onItemClick", "", "view", "Landroid/view/View;", "position", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements k {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66857a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AIMusicVEVideoPublishEditActivity f66858b;

        b(AIMusicVEVideoPublishEditActivity aIMusicVEVideoPublishEditActivity) {
            this.f66858b = aIMusicVEVideoPublishEditActivity;
        }

        public final void a(@NotNull View view, int i) {
            com.ss.android.ugc.aweme.shortvideo.e eVar;
            int i2;
            String str;
            int i3 = 0;
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f66857a, false, 76162, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f66857a, false, 76162, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view, "view");
            com.ss.android.ugc.aweme.shortvideo.music.a aVar = this.f66858b.f66851c;
            String str2 = null;
            if (aVar != null) {
                eVar = aVar.a(i);
            } else {
                eVar = null;
            }
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.f66858b.z.creationId).a("content_source", this.f66858b.l()).a("content_type", this.f66858b.k()).a("shoot_way", this.f66858b.z.mShootWay).a("enter_from", "video_edit_page");
            if (eVar != null) {
                str2 = eVar.getMusicId();
            }
            com.ss.android.ugc.aweme.app.d.d a3 = a2.a("music_id", str2);
            int i4 = i + 1;
            com.ss.android.ugc.aweme.app.d.d a4 = a3.a("music_show_rank", i4);
            com.ss.android.ugc.aweme.shortvideo.music.a aVar2 = this.f66858b.f66851c;
            if (aVar2 != null) {
                i2 = aVar2.a();
            } else {
                i2 = 0;
            }
            com.ss.android.ugc.aweme.app.d.d a5 = a4.a("music_rec_type", i2);
            com.ss.android.ugc.aweme.shortvideo.music.a aVar3 = this.f66858b.f66851c;
            if (aVar3 == null || aVar3.c() != 0) {
                str = "favorite";
            } else {
                str = "recommend";
            }
            r.a("select_music", (Map) a5.a("tab_name", str).f34114b);
            this.f66858b.z.mMusicShowRank = i4;
            cb cbVar = this.f66858b.z;
            com.ss.android.ugc.aweme.shortvideo.music.a aVar4 = this.f66858b.f66851c;
            if (aVar4 != null) {
                i3 = aVar4.a();
            }
            cbVar.mMusicRecType = i3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/edit/AIMusicVEVideoPublishEditActivity$initCutMusicAndVolumeHolder$2", "Lcom/ss/android/ugc/aweme/toolsport/model/OnItemShowListener;", "onItemShow", "", "position", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements l {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66859a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AIMusicVEVideoPublishEditActivity f66860b;

        c(AIMusicVEVideoPublishEditActivity aIMusicVEVideoPublishEditActivity) {
            this.f66860b = aIMusicVEVideoPublishEditActivity;
        }

        public final void a(int i) {
            com.ss.android.ugc.aweme.shortvideo.e eVar;
            String str;
            String str2;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f66859a, false, 76163, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f66859a, false, 76163, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.shortvideo.music.a aVar = this.f66860b.f66851c;
            String str3 = null;
            if (aVar != null) {
                eVar = aVar.a(i);
            } else {
                eVar = null;
            }
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.f66860b.z.creationId);
            if (this.f66860b.z.mFromCut || this.f66860b.z.mFromMultiCut) {
                str = "upload";
            } else {
                str = "shoot";
            }
            com.ss.android.ugc.aweme.app.d.d a3 = a2.a("content_source", str).a("content_source", this.f66860b.l()).a("content_type", this.f66860b.k()).a("shoot_way", this.f66860b.z.mShootWay).a("enter_from", "video_edit_page");
            if (eVar != null) {
                str3 = eVar.getMusicId();
            }
            com.ss.android.ugc.aweme.app.d.d a4 = a3.a("music_id", str3);
            com.ss.android.ugc.aweme.shortvideo.music.a aVar2 = this.f66860b.f66851c;
            if (aVar2 != null) {
                i2 = aVar2.a();
            }
            com.ss.android.ugc.aweme.app.d.d a5 = a4.a("music_rec_type", i2);
            com.ss.android.ugc.aweme.shortvideo.music.a aVar3 = this.f66860b.f66851c;
            if (aVar3 == null || aVar3.c() != 0) {
                str2 = "favorite";
            } else {
                str2 = "recommend";
            }
            r.a("music_show", (Map) a5.a("tab_name", str2).f34114b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/edit/AIMusicVEVideoPublishEditActivity$initCutMusicAndVolumeHolder$3", "Lcom/ss/android/ugc/aweme/photomovie/transition/TransitionListener$DefaultTransitionListener;", "onHideEnd", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d extends f.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66861a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AIMusicVEVideoPublishEditActivity f66862b;

        public final void d() {
            if (PatchProxy.isSupport(new Object[0], this, f66861a, false, 76164, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f66861a, false, 76164, new Class[0], Void.TYPE);
            } else if (this.f66862b.f66852d) {
                this.f66862b.f66852d = false;
                this.f66862b.E();
            } else {
                this.f66862b.a(true, false);
                if (!this.f66862b.M && this.f66862b.f66853e) {
                    this.f66862b.g();
                }
            }
        }

        d(AIMusicVEVideoPublishEditActivity aIMusicVEVideoPublishEditActivity) {
            this.f66862b = aIMusicVEVideoPublishEditActivity;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J$\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/edit/AIMusicVEVideoPublishEditActivity$initCutMusicAndVolumeHolder$4", "Lcom/ss/android/ugc/aweme/shortvideo/music/MusicView$OnMusicViewClickListener;", "onClickCutMusic", "", "onClickMusicLib", "onClickMusicTab", "onClickVolumeTab", "onMusicChoose", "musicPath", "", "musicModel", "Lcom/ss/android/ugc/aweme/shortvideo/AVMusic;", "isFromRecommend", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66863a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AIMusicVEVideoPublishEditActivity f66864b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "Lcom/ss/android/ugc/aweme/toolsport/model/ChooseMusicResultBean;", "invoke"}, k = 3, mv = {1, 1, 15})
        static final class a extends Lambda implements Function1<com.ss.android.ugc.aweme.ao.a.e, Unit> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ e this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(e eVar) {
                super(1);
                this.this$0 = eVar;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((com.ss.android.ugc.aweme.ao.a.e) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull com.ss.android.ugc.aweme.ao.a.e eVar) {
                com.ss.android.ugc.aweme.ao.a.e eVar2 = eVar;
                if (PatchProxy.isSupport(new Object[]{eVar2}, this, changeQuickRedirect, false, 76170, new Class[]{com.ss.android.ugc.aweme.ao.a.e.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{eVar2}, this, changeQuickRedirect, false, 76170, new Class[]{com.ss.android.ugc.aweme.ao.a.e.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(eVar2, "result");
                this.this$0.f66864b.a(eVar2);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
        static final class b extends Lambda implements Function0<Unit> {
            public static ChangeQuickRedirect changeQuickRedirect;
            final /* synthetic */ e this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(e eVar) {
                super(0);
                this.this$0 = eVar;
            }

            public final void invoke() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 76171, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 76171, new Class[0], Void.TYPE);
                    return;
                }
                this.this$0.f66864b.F();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/edit/AIMusicVEVideoPublishEditActivity$initCutMusicAndVolumeHolder$4$onMusicChoose$1", "Lcom/ss/android/ugc/aweme/shortvideo/cutmusic/MusicWaveHelper$AudioWaveDataListener;", "onFinish", "", "bean", "Lcom/ss/android/ugc/aweme/shortvideo/AVMusicWaveBean;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        public static final class c implements f.a {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f66865a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e f66866b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.e f66867c;

            public final void a(@Nullable com.ss.android.ugc.aweme.shortvideo.f fVar) {
                if (PatchProxy.isSupport(new Object[]{fVar}, this, f66865a, false, 76172, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{fVar}, this, f66865a, false, 76172, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.class}, Void.TYPE);
                    return;
                }
                this.f66866b.f66864b.D.a(fVar, this.f66867c.duration);
            }

            c(e eVar, com.ss.android.ugc.aweme.shortvideo.e eVar2) {
                this.f66866b = eVar;
                this.f66867c = eVar2;
            }
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f66863a, false, 76166, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f66863a, false, 76166, new Class[0], Void.TYPE);
                return;
            }
            this.f66864b.p();
            r.a("click_music_tab", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.f66864b.z.creationId).a("content_source", this.f66864b.l()).a("content_type", this.f66864b.k()).a("shoot_way", this.f66864b.z.mShootWay).a("enter_from", "video_edit_page").a("tab_name", this.f66864b.getString(C0906R.string.jg)).f34114b);
        }

        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f66863a, false, 76167, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f66863a, false, 76167, new Class[0], Void.TYPE);
                return;
            }
            r.a("click_music_tab", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.f66864b.z.creationId).a("content_source", this.f66864b.l()).a("content_type", this.f66864b.k()).a("shoot_way", this.f66864b.z.mShootWay).a("enter_from", "video_edit_page").a("tab_name", this.f66864b.getString(C0906R.string.ip)).f34114b);
        }

        public final void d() {
            int i = 0;
            if (PatchProxy.isSupport(new Object[0], this, f66863a, false, 76169, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f66863a, false, 76169, new Class[0], Void.TYPE);
                return;
            }
            this.f66864b.f66852d = true;
            com.ss.android.ugc.aweme.shortvideo.music.a aVar = this.f66864b.f66851c;
            if (aVar != null) {
                aVar.b();
            }
            this.f66864b.d(false);
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.f66864b.z.creationId).a("content_source", this.f66864b.l()).a("content_type", this.f66864b.k()).a("shoot_way", this.f66864b.z.mShootWay).a("music_id", this.f66864b.z.musicId);
            com.ss.android.ugc.aweme.shortvideo.music.a aVar2 = this.f66864b.f66851c;
            if (aVar2 != null) {
                i = aVar2.a();
            }
            r.a("edit_music", (Map) a2.a("music_rec_type", i).a("enter_from", "video_edit_page").f34114b);
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x00a7  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r14 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f66863a
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 76165(0x12985, float:1.0673E-40)
                r2 = r14
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0025
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = f66863a
                r5 = 0
                r6 = 76165(0x12985, float:1.0673E-40)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r14
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x0025:
                com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity r1 = r14.f66864b
                dmt.av.video.VEVideoPublishEditViewModel r1 = r1.v
                java.lang.String r2 = "mViewModel"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                android.arch.lifecycle.MutableLiveData r1 = r1.m()
                java.lang.String r2 = "mViewModel.previewControlLiveData"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                dmt.av.video.s r2 = dmt.av.video.s.b()
                r1.setValue(r2)
                com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity r1 = r14.f66864b
                com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r1.z
                r2 = 0
                if (r1 == 0) goto L_0x0048
                java.lang.String r1 = r1.mStickerID
                goto L_0x0049
            L_0x0048:
                r1 = r2
            L_0x0049:
                if (r1 == 0) goto L_0x0067
                r3 = r1
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r1 = 1
                java.lang.String[] r4 = new java.lang.String[r1]
                java.lang.String r1 = ","
                r4[r0] = r1
                r5 = 0
                r6 = 0
                r7 = 6
                r8 = 0
                java.util.List r1 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) r3, (java.lang.String[]) r4, (boolean) r5, (int) r6, (int) r7, (java.lang.Object) r8)
                if (r1 == 0) goto L_0x0067
                java.lang.Object r1 = kotlin.collections.CollectionsKt.getOrNull(r1, r0)
                java.lang.String r1 = (java.lang.String) r1
                r7 = r1
                goto L_0x0068
            L_0x0067:
                r7 = r2
            L_0x0068:
                com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity r1 = r14.f66864b
                com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r1.z
                if (r1 == 0) goto L_0x008c
                com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity r1 = r14.f66864b
                com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r1.z
                java.util.List r1 = r1.challenges
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r1)
                if (r1 != 0) goto L_0x008c
                com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity r1 = r14.f66864b
                com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r1.z
                java.util.List r1 = r1.challenges
                java.lang.Object r0 = r1.get(r0)
                com.ss.android.ugc.aweme.shortvideo.c r0 = (com.ss.android.ugc.aweme.shortvideo.c) r0
                java.lang.String r0 = r0.cid
                r8 = r0
                goto L_0x008d
            L_0x008c:
                r8 = r2
            L_0x008d:
                com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity r0 = r14.f66864b
                dmt.av.video.y r3 = r0.u
                com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity r0 = r14.f66864b
                com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity r0 = r0.I()
                java.lang.String r1 = "activityThis"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                r4 = r0
                android.app.Activity r4 = (android.app.Activity) r4
                r5 = 110(0x6e, float:1.54E-43)
                com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity r0 = r14.f66864b
                com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r0.z
                if (r0 == 0) goto L_0x00a9
                java.lang.String r2 = r0.mFirstStickerMusicIdsJson
            L_0x00a9:
                r6 = r2
                com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity r0 = r14.f66864b
                com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r0.z
                java.lang.String r1 = "mModel"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                boolean r9 = r0.isAllowClearMusic()
                com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity r0 = r14.f66864b
                com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r0.z
                java.lang.String r10 = r0.mShootWay
                com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity r0 = r14.f66864b
                com.ss.android.ugc.aweme.shortvideo.edit.cb r0 = r0.z
                java.lang.String r11 = r0.creationId
                com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity$e$a r0 = new com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity$e$a
                r0.<init>(r14)
                r12 = r0
                kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
                com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity$e$b r0 = new com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity$e$b
                r0.<init>(r14)
                r13 = r0
                kotlin.jvm.functions.Function0 r13 = (kotlin.jvm.functions.Function0) r13
                r3.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                java.lang.String r0 = "change_music"
                com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
                java.lang.String r2 = "creation_id"
                com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity r3 = r14.f66864b
                com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r3.z
                java.lang.String r3 = r3.creationId
                com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                java.lang.String r2 = "content_source"
                com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity r3 = r14.f66864b
                java.lang.String r3 = r3.l()
                com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                java.lang.String r2 = "content_type"
                com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity r3 = r14.f66864b
                java.lang.String r3 = r3.k()
                com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                java.lang.String r2 = "shoot_way"
                com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity r3 = r14.f66864b
                com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r3.z
                java.lang.String r3 = r3.mShootWay
                com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                java.lang.String r2 = "enter_from"
                java.lang.String r3 = "video_edit_page"
                com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
                com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity.e.a():void");
        }

        e(AIMusicVEVideoPublishEditActivity aIMusicVEVideoPublishEditActivity) {
            this.f66864b = aIMusicVEVideoPublishEditActivity;
        }

        public final void a(@Nullable String str, @Nullable com.ss.android.ugc.aweme.shortvideo.e eVar, boolean z) {
            Long l;
            Long l2;
            String str2 = str;
            com.ss.android.ugc.aweme.shortvideo.e eVar2 = eVar;
            if (PatchProxy.isSupport(new Object[]{str2, eVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f66863a, false, 76168, new Class[]{String.class, com.ss.android.ugc.aweme.shortvideo.e.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, eVar2, Byte.valueOf(z)}, this, f66863a, false, 76168, new Class[]{String.class, com.ss.android.ugc.aweme.shortvideo.e.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (eVar2 != null) {
                l = Long.valueOf(eVar2.id);
            } else {
                l = null;
            }
            com.ss.android.ugc.aweme.shortvideo.e eVar3 = this.f66864b.f66850b;
            if (eVar3 != null) {
                l2 = Long.valueOf(eVar3.id);
            } else {
                l2 = null;
            }
            if (!Intrinsics.areEqual((Object) l, (Object) l2)) {
                if (eVar2 == null) {
                    ej.a().a((com.ss.android.ugc.aweme.shortvideo.e) null);
                    this.f66864b.n();
                    this.f66864b.g = false;
                    return;
                }
                ej.a().a(eVar2);
                this.f66864b.a(str, z, eVar2);
                this.f66864b.g = true;
                if (eVar.getMusicWaveData() != null) {
                    this.f66864b.D.a(f.b.a().a(eVar2), eVar2.duration);
                    return;
                }
                if (str2 != null) {
                    f.b.a().a(str, (f.a) new c(this, eVar2));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/edit/AIMusicVEVideoPublishEditActivity$initCutMusicAndVolumeHolder$5", "Lcom/ss/android/ugc/aweme/toolsport/model/OnAIMusicAnimLoadingListener;", "onAnimLoading", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class f implements com.ss.android.ugc.aweme.ao.a.h {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66868a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AIMusicVEVideoPublishEditActivity f66869b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f66868a, false, 76173, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f66868a, false, 76173, new Class[0], Void.TYPE);
                return;
            }
            r.a("music_loading", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "video_edit_page").a("shoot_way", this.f66869b.z.mShootWay).a("content_source", this.f66869b.l()).a("content_type", this.f66869b.k()).a("content_type", "video").f34114b);
        }

        f(AIMusicVEVideoPublishEditActivity aIMusicVEVideoPublishEditActivity) {
            this.f66869b = aIMusicVEVideoPublishEditActivity;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/edit/AIMusicVEVideoPublishEditActivity$initCutMusicAndVolumeHolder$6", "Lcom/ss/android/ugc/aweme/toolsport/model/OnMusicTabClickListener;", "onTabClick", "", "isRecommend", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class g implements m {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66870a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AIMusicVEVideoPublishEditActivity f66871b;

        g(AIMusicVEVideoPublishEditActivity aIMusicVEVideoPublishEditActivity) {
            this.f66871b = aIMusicVEVideoPublishEditActivity;
        }

        public final void a(boolean z) {
            String str;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f66870a, false, 76174, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f66870a, false, 76174, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "video_edit_page").a("shoot_way", this.f66871b.z.mShootWay).a("content_source", this.f66871b.l()).a("content_type", this.f66871b.k()).a("creation_id", this.f66871b.z.creationId);
            if (z) {
                str = "recommend";
            } else {
                str = "favorite";
            }
            r.a("enter_music_tab", (Map) a2.a("tab_name", str).f34114b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/shortvideo/edit/AIMusicVEVideoPublishEditActivity$onCreate$1", "Lcom/ss/android/ugc/aweme/toolsport/model/OnGetAIRecommendMusicListener;", "onGetAIRecommendMusic", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class h implements com.ss.android.ugc.aweme.ao.a.j {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66872a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AIMusicVEVideoPublishEditActivity f66873b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f66874a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h f66875b;

            a(h hVar) {
                this.f66875b = hVar;
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f66874a, false, 76176, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f66874a, false, 76176, new Class[0], Void.TYPE);
                    return;
                }
                this.f66875b.f66873b.e();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:44:0x00fd  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0103 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r9 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f66872a
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 76175(0x1298f, float:1.06744E-40)
                r2 = r9
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0025
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = f66872a
                r5 = 0
                r6 = 76175(0x1298f, float:1.06744E-40)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x0025:
                com.ss.android.ugc.aweme.ao.a r1 = com.ss.android.ugc.aweme.port.in.a.i
                com.ss.android.ugc.aweme.ao.a$b r1 = r1.f()
                com.ss.android.ugc.aweme.ao.a.f r1 = r1.d()
                com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity r2 = r9.f66873b
                com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity$h$a r3 = new com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity$h$a
                r3.<init>(r9)
                java.lang.Runnable r3 = (java.lang.Runnable) r3
                r2.runOnUiThread(r3)
                boolean r2 = r1.a()
                if (r2 != 0) goto L_0x0104
                java.lang.Integer r2 = r1.b()
                if (r2 != 0) goto L_0x0048
                goto L_0x0051
            L_0x0048:
                int r2 = r2.intValue()
                r3 = 3
                if (r2 != r3) goto L_0x0051
                goto L_0x0104
            L_0x0051:
                long r2 = r1.c()
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 >= 0) goto L_0x005c
                return
            L_0x005c:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                boolean r3 = r1.a()
                if (r3 != 0) goto L_0x0096
                if (r1 != 0) goto L_0x006c
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x006c:
                java.util.List r3 = r1.d()
                if (r3 != 0) goto L_0x0075
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x0075:
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                java.util.Iterator r3 = r3.iterator()
                r4 = 0
            L_0x007c:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L_0x0096
                java.lang.Object r5 = r3.next()
                com.ss.android.ugc.aweme.shortvideo.e r5 = (com.ss.android.ugc.aweme.shortvideo.e) r5
                if (r4 == 0) goto L_0x008f
                java.lang.String r4 = ","
                r2.append(r4)
            L_0x008f:
                java.lang.String r4 = r5.mid
                r2.append(r4)
                r4 = 1
                goto L_0x007c
            L_0x0096:
                java.lang.String r3 = "music_upload_done"
                com.ss.android.ugc.aweme.app.d.d r4 = com.ss.android.ugc.aweme.app.d.d.a()
                java.lang.String r5 = "creation_id"
                com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity r6 = r9.f66873b
                com.ss.android.ugc.aweme.shortvideo.edit.cb r6 = r6.z
                java.lang.String r6 = r6.creationId
                com.ss.android.ugc.aweme.app.d.d r4 = r4.a((java.lang.String) r5, (java.lang.String) r6)
                java.lang.String r5 = "enter_from"
                java.lang.String r6 = "video_edit_page"
                com.ss.android.ugc.aweme.app.d.d r4 = r4.a((java.lang.String) r5, (java.lang.String) r6)
                java.lang.String r5 = "music_upload_num"
                if (r1 == 0) goto L_0x00be
                java.util.List r6 = r1.d()
                if (r6 == 0) goto L_0x00be
                int r0 = r6.size()
            L_0x00be:
                com.ss.android.ugc.aweme.app.d.d r0 = r4.a((java.lang.String) r5, (int) r0)
                java.lang.String r4 = "music_upload_duration"
                if (r1 == 0) goto L_0x00cf
                long r5 = r1.c()
                java.lang.Long r5 = java.lang.Long.valueOf(r5)
                goto L_0x00d0
            L_0x00cf:
                r5 = 0
            L_0x00d0:
                long r5 = r5.longValue()
                com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r4, (long) r5)
                java.lang.String r4 = "music_id_list"
                java.lang.String r2 = r2.toString()
                com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r4, (java.lang.String) r2)
                java.lang.String r2 = "music_rec_type"
                if (r1 == 0) goto L_0x00f1
                java.lang.Integer r4 = r1.b()
                if (r4 == 0) goto L_0x00f1
                int r4 = r4.intValue()
                goto L_0x00f2
            L_0x00f1:
                r4 = 2
            L_0x00f2:
                com.ss.android.ugc.aweme.app.d.d r0 = r0.a((java.lang.String) r2, (int) r4)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f34114b
                com.ss.android.ugc.aweme.common.r.a((java.lang.String) r3, (java.util.Map) r0)
                if (r1 == 0) goto L_0x0103
                r2 = -1
                r1.a(r2)
                return
            L_0x0103:
                return
            L_0x0104:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity.h.a():void");
        }

        h(AIMusicVEVideoPublishEditActivity aIMusicVEVideoPublishEditActivity) {
            this.f66873b = aIMusicVEVideoPublishEditActivity;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66876a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AIMusicVEVideoPublishEditActivity f66877b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f66878c;

        i(AIMusicVEVideoPublishEditActivity aIMusicVEVideoPublishEditActivity, boolean z) {
            this.f66877b = aIMusicVEVideoPublishEditActivity;
            this.f66878c = z;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f66876a, false, 76177, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f66876a, false, 76177, new Class[0], Void.TYPE);
                return;
            }
            View view = this.f66877b.R.l.get(1);
            if (!(view instanceof f)) {
                view = null;
            }
            f fVar = (f) view;
            if (fVar == null) {
                View view2 = this.f66877b.Q.l.get(1);
                if (!(view2 instanceof f)) {
                    view2 = null;
                }
                fVar = (f) view2;
            }
            if (fVar != null && fVar.getVisibility() == 0) {
                float e2 = ((float) (AIMusicVEVideoPublishEditActivity.a(this.f66877b).e() - fVar.getMeasuredWidth())) + UIUtils.dip2Px(this.f66877b, 8.0f);
                float dip2Px = UIUtils.dip2Px(this.f66877b, 3.0f) + e2;
                if (!this.f66877b.y()) {
                    AIMusicVEVideoPublishEditActivity.a(this.f66877b).a(fVar, 80, dip2Px, -((int) e2));
                } else if (this.f66878c) {
                    AIMusicVEVideoPublishEditActivity.a(this.f66877b).a(fVar, 48, dip2Px, -((int) e2));
                } else {
                    AIMusicVEVideoPublishEditActivity.a(this.f66877b).a(fVar, 48, 4.0f, -((int) UIUtils.dip2Px(this.f66877b, 12.0f)));
                }
                if (this.f66877b.M) {
                    com.ss.android.ugc.aweme.port.in.a.i.a(true);
                    r.a("function_toast_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "video_edit_page").a("type", "music").f34114b);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66879a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AIMusicVEVideoPublishEditActivity f66880b;

        j(AIMusicVEVideoPublishEditActivity aIMusicVEVideoPublishEditActivity) {
            this.f66880b = aIMusicVEVideoPublishEditActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f66879a, false, 76178, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f66879a, false, 76178, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f66880b.o();
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f66849a, false, 76160, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f66849a, false, 76160, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f66849a, false, 76142, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66849a, false, 76142, new Class[0], Void.TYPE);
            return;
        }
        this.aa = true;
        if (!com.ss.android.ugc.aweme.port.in.a.i.e() && this.ab) {
            g();
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f66849a, false, 76144, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66849a, false, 76144, new Class[0], Void.TYPE);
            return;
        }
        this.B = new com.ss.android.ugc.aweme.shortvideo.helper.a(this.z.isMuted);
    }

    @NotNull
    public final String k() {
        if (PatchProxy.isSupport(new Object[0], this, f66849a, false, 76147, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f66849a, false, 76147, new Class[0], String.class);
        }
        cb cbVar = this.z;
        Intrinsics.checkExpressionValueIsNotNull(cbVar, "mModel");
        if (cbVar.isMvThemeVideoType()) {
            return "mv";
        }
        return "video";
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, f66849a, false, 76149, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66849a, false, 76149, new Class[0], Void.TYPE);
            return;
        }
        super.m();
        n();
        this.X = "";
        this.Y = "";
        this.g = false;
    }

    public final int d() {
        if (PatchProxy.isSupport(new Object[0], this, f66849a, false, 76138, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f66849a, false, 76138, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.g) {
            Integer b2 = com.ss.android.ugc.aweme.port.in.a.i.f().d().b();
            if (b2 != null) {
                return b2.intValue();
            }
        }
        return -1;
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f66849a, false, 76145, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66849a, false, 76145, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.shortvideo.music.a aVar = this.f66851c;
        if (aVar != null) {
            int i2 = this.z.mMusicStart;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, aVar, com.ss.android.ugc.aweme.shortvideo.music.a.f68410a, false, 77758, new Class[]{Integer.TYPE}, Void.TYPE)) {
                Object[] objArr = {Integer.valueOf(i2)};
                Object[] objArr2 = objArr;
                com.ss.android.ugc.aweme.shortvideo.music.a aVar2 = aVar;
                PatchProxy.accessDispatch(objArr2, aVar2, com.ss.android.ugc.aweme.shortvideo.music.a.f68410a, false, 77758, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                a.c cVar = aVar.f68413d;
                if (cVar != null) {
                    cVar.c(i2);
                }
            }
        }
        d(true);
    }

    @NotNull
    public final String l() {
        if (PatchProxy.isSupport(new Object[0], this, f66849a, false, 76148, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f66849a, false, 76148, new Class[0], String.class);
        }
        if (!this.z.mFromCut && !this.z.mFromMultiCut) {
            cb cbVar = this.z;
            Intrinsics.checkExpressionValueIsNotNull(cbVar, "mModel");
            if (!cbVar.isMvThemeVideoType()) {
                return "shoot";
            }
        }
        return "upload";
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f66849a, false, 76139, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66849a, false, 76139, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        com.ss.android.ugc.aweme.port.in.a.i.f().a(null);
        com.ss.android.ugc.aweme.shortvideo.music.a aVar = this.f66851c;
        if (aVar != null) {
            if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.shortvideo.music.a.f68410a, false, 77754, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.shortvideo.music.a.f68410a, false, 77754, new Class[0], Void.TYPE);
            } else {
                a.c cVar = aVar.f68413d;
                if (cVar != null) {
                    cVar.d();
                }
            }
        }
    }

    public final void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f66849a, false, 76152, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66849a, false, 76152, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        com.ss.android.ugc.aweme.shortvideo.music.a aVar = this.f66851c;
        if (aVar != null) {
            if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.shortvideo.music.a.f68410a, false, 77751, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.shortvideo.music.a.f68410a, false, 77751, new Class[0], Void.TYPE);
            } else {
                if (aVar.i) {
                    a.c cVar = aVar.f68413d;
                    if (cVar != null) {
                        cVar.f();
                    }
                    a.c cVar2 = aVar.f68413d;
                    if (cVar2 != null) {
                        cVar2.a();
                    }
                }
            }
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f66849a, false, 76140, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66849a, false, 76140, new Class[0], Void.TYPE);
        } else if (!this.M && !this.ab) {
        } else {
            if (this.M && this.aa && !com.ss.android.ugc.aweme.port.in.a.i.e()) {
                g();
            } else if (!this.M && !com.ss.android.ugc.aweme.port.in.a.i.e() && (!y() || !this.Z || this.z.mOrigin != 0)) {
                IAVPublishService publishService = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService();
                Intrinsics.checkExpressionValueIsNotNull(publishService, "ServiceManager.get().get…ss.java).publishService()");
                if (publishService.getCurMusic() == null) {
                    com.ss.android.ugc.aweme.shortvideo.music.a aVar = this.f66851c;
                    if (aVar == null || !aVar.i) {
                        Lifecycle lifecycle = getLifecycle();
                        Intrinsics.checkExpressionValueIsNotNull(lifecycle, "lifecycle");
                        if (lifecycle.getCurrentState() == Lifecycle.State.RESUMED) {
                            g();
                            return;
                        }
                    }
                    this.f66853e = true;
                }
            }
        }
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f66849a, false, 76146, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66849a, false, 76146, new Class[0], Void.TYPE);
            return;
        }
        FrameLayout frameLayout = this.l;
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "mFilterExtraLayout");
        this.f66851c = new com.ss.android.ugc.aweme.shortvideo.music.a(this, frameLayout, this);
        com.ss.android.ugc.aweme.shortvideo.music.a aVar = this.f66851c;
        if (aVar != null) {
            aVar.t = new b(this);
        }
        com.ss.android.ugc.aweme.shortvideo.music.a aVar2 = this.f66851c;
        if (aVar2 != null) {
            aVar2.s = new c(this);
        }
        com.ss.android.ugc.aweme.shortvideo.music.a aVar3 = this.f66851c;
        if (aVar3 != null) {
            com.ss.android.ugc.aweme.photomovie.transition.f dVar = new d(this);
            if (PatchProxy.isSupport(new Object[]{dVar}, aVar3, com.ss.android.ugc.aweme.shortvideo.music.a.f68410a, false, 77757, new Class[]{com.ss.android.ugc.aweme.photomovie.transition.f.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.shortvideo.music.a aVar4 = aVar3;
                PatchProxy.accessDispatch(new Object[]{dVar}, aVar4, com.ss.android.ugc.aweme.shortvideo.music.a.f68410a, false, 77757, new Class[]{com.ss.android.ugc.aweme.photomovie.transition.f.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(dVar, "transitionListener");
                aVar3.p = dVar;
            }
        }
        com.ss.android.ugc.aweme.shortvideo.music.a aVar5 = this.f66851c;
        if (aVar5 != null) {
            aVar5.h = new e(this);
        }
        com.ss.android.ugc.aweme.shortvideo.music.a aVar6 = this.f66851c;
        if (aVar6 != null) {
            aVar6.f68412c = new f(this);
        }
        com.ss.android.ugc.aweme.shortvideo.music.a aVar7 = this.f66851c;
        if (aVar7 != null) {
            aVar7.f68415f = new g(this);
        }
    }

    public final void n() {
        int i2;
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f66849a, false, 76151, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66849a, false, 76151, new Class[0], Void.TYPE);
            return;
        }
        IAVPublishService publishService = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService();
        Intrinsics.checkExpressionValueIsNotNull(publishService, "ServiceManager.get().get…ss.java).publishService()");
        String a2 = com.ss.android.ugc.aweme.imported.e.a(publishService.getCurMusic());
        Intrinsics.checkExpressionValueIsNotNull(a2, "MusicModelUtils.getMusic…ublishService().curMusic)");
        t tVar = new t();
        tVar.f83064b = null;
        tVar.f83065c = 0;
        tVar.f83068f = a2;
        if (com.ss.android.g.a.b()) {
            i2 = Math.min(0, 15000);
        } else {
            i2 = 0;
        }
        tVar.f83066d = i2;
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.v;
        Intrinsics.checkExpressionValueIsNotNull(vEVideoPublishEditViewModel, "mViewModel");
        MutableLiveData<t> d2 = vEVideoPublishEditViewModel.d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "mViewModel.previewMusicParams");
        d2.setValue(tVar);
        this.q = this.z.mMusicPath;
        this.z.mMusicPath = null;
        this.z.musicId = a2;
        this.z.mMusicStart = 0;
        if (J() || L() || this.z.mMusicPath == null) {
            z = false;
        } else {
            z = true;
        }
        a(z);
        c(false);
        this.z.musicVolume = 0.5f;
        this.f66850b = null;
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f66849a, false, 76141, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66849a, false, 76141, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity", "onResume", true);
        super.onResume();
        if (!this.M && this.f66853e) {
            com.ss.android.ugc.aweme.shortvideo.music.a aVar = this.f66851c;
            if (aVar == null || !aVar.i) {
                g();
            }
        }
        com.ss.android.ugc.aweme.shortvideo.music.a aVar2 = this.f66851c;
        if (aVar2 != null) {
            if (PatchProxy.isSupport(new Object[0], aVar2, com.ss.android.ugc.aweme.shortvideo.music.a.f68410a, false, 77752, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar2, com.ss.android.ugc.aweme.shortvideo.music.a.f68410a, false, 77752, new Class[0], Void.TYPE);
            } else if (aVar2.i) {
                a.c cVar = aVar2.f68413d;
                if (cVar != null) {
                    cVar.e();
                }
                a.c cVar2 = aVar2.f68413d;
                if (cVar2 != null) {
                    cVar2.b();
                }
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity", "onResume", false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r1.getWavFile() != null) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f66849a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 76155(0x1297b, float:1.06716E-40)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f66849a
            r5 = 0
            r6 = 76155(0x1297b, float:1.06716E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            com.ss.android.ugc.aweme.shortvideo.helper.VolumeHelper r1 = r9.B
            java.lang.String r2 = "mVolumeHelper"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            boolean r1 = r1.f68105d
            if (r1 != 0) goto L_0x005a
            com.ss.android.ugc.aweme.shortvideo.helper.VolumeHelper r1 = r9.B
            com.ss.android.ugc.aweme.shortvideo.music.a r2 = r9.f66851c
            if (r2 == 0) goto L_0x0039
            android.view.ViewGroup r2 = r2.q
            goto L_0x003a
        L_0x0039:
            r2 = 0
        L_0x003a:
            android.view.View r2 = (android.view.View) r2
            r3 = 2131558478(0x7f0d004e, float:1.8742273E38)
            boolean r4 = r9.L()
            if (r4 == 0) goto L_0x0049
            r4 = 2131561997(0x7f0d0e0d, float:1.874941E38)
            goto L_0x004c
        L_0x0049:
            r4 = 2131561152(0x7f0d0ac0, float:1.8747696E38)
        L_0x004c:
            com.ss.android.ugc.aweme.shortvideo.helper.VolumeHelper r1 = r1.a(r2, r3, r4)
            com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity$a r2 = new com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity$a
            r2.<init>(r9)
            com.ss.android.ugc.aweme.shortvideo.helper.VolumeHelper$a r2 = (com.ss.android.ugc.aweme.shortvideo.helper.VolumeHelper.a) r2
            r1.a((com.ss.android.ugc.aweme.shortvideo.helper.VolumeHelper.a) r2)
        L_0x005a:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r9.z
            boolean r1 = r1.isFastImport
            r2 = 1
            if (r1 != 0) goto L_0x006e
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r9.z
            java.lang.String r3 = "mModel"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
            java.lang.String r1 = r1.getWavFile()
            if (r1 == 0) goto L_0x0074
        L_0x006e:
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r9.z
            boolean r1 = r1.isMuted
            if (r1 == 0) goto L_0x007e
        L_0x0074:
            com.ss.android.ugc.aweme.shortvideo.helper.VolumeHelper r1 = r9.B
            com.ss.android.ugc.aweme.shortvideo.helper.VolumeHelper r1 = r1.b((boolean) r2)
            r1.a((boolean) r0)
            goto L_0x008e
        L_0x007e:
            com.ss.android.ugc.aweme.shortvideo.helper.VolumeHelper r1 = r9.B
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r9.z
            java.lang.String r3 = r3.mMusicPath
            if (r3 == 0) goto L_0x0087
            r0 = 1
        L_0x0087:
            com.ss.android.ugc.aweme.shortvideo.helper.VolumeHelper r0 = r1.b((boolean) r0)
            r0.a((boolean) r2)
        L_0x008e:
            com.ss.android.ugc.aweme.shortvideo.helper.VolumeHelper r0 = r9.B
            java.lang.String r1 = "mVolumeHelper"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r9.z
            float r1 = r1.musicVolume
            r2 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r2
            int r1 = (int) r1
            r0.a((int) r1)
            com.ss.android.ugc.aweme.shortvideo.helper.VolumeHelper r0 = r9.B
            java.lang.String r1 = "mVolumeHelper"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.edit.cb r1 = r9.z
            float r1 = r1.voiceVolume
            float r1 = r1 * r2
            int r1 = (int) r1
            r0.b((int) r1)
            java.lang.String r0 = "volumn_edit"
            com.ss.android.ugc.aweme.common.MobClick r0 = r9.a((java.lang.String) r0)
            com.ss.android.ugc.aweme.common.r.onEvent(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity.p():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r10 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f66849a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 76143(0x1296f, float:1.06699E-40)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f66849a
            r5 = 0
            r6 = 76143(0x1296f, float:1.06699E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            boolean r1 = r10.M
            r2 = 5000(0x1388, double:2.4703E-320)
            r4 = 1
            if (r1 == 0) goto L_0x00be
            boolean r1 = r10.ab
            if (r1 == 0) goto L_0x00be
            r1 = r10
            android.content.Context r1 = (android.content.Context) r1
            r5 = 2131690968(0x7f0f05d8, float:1.9010995E38)
            r6 = 0
            android.view.View r1 = android.view.View.inflate(r1, r5, r6)
            java.lang.String r5 = "View.inflate(this, R.layout.prompt_ai_music, null)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r5)
            r5 = 2131171133(0x7f07173d, float:1.7956644E38)
            android.view.View r5 = r1.findViewById(r5)
            java.lang.String r7 = "bubbleView.findViewById(R.id.tvw_music_title)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r7)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r7 = 2131167788(0x7f070a2c, float:1.794986E38)
            android.view.View r7 = r1.findViewById(r7)
            java.lang.String r8 = "bubbleView.findViewById(R.id.ivw_cover)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r7, r8)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r7 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r7
            com.ss.android.ugc.aweme.ao.a r8 = com.ss.android.ugc.aweme.port.in.a.i
            com.ss.android.ugc.aweme.ao.a$b r8 = r8.f()
            com.ss.android.ugc.aweme.ao.a.f r8 = r8.d()
            java.util.List r8 = r8.d()
            r9 = r8
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x0099
            if (r8 == 0) goto L_0x0082
            java.lang.Object r9 = r8.get(r0)
            com.ss.android.ugc.aweme.shortvideo.e r9 = (com.ss.android.ugc.aweme.shortvideo.e) r9
            if (r9 == 0) goto L_0x0082
            java.lang.String r9 = r9.getName()
            goto L_0x0083
        L_0x0082:
            r9 = r6
        L_0x0083:
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r5.setText(r9)
            if (r8 == 0) goto L_0x0096
            java.lang.Object r5 = r8.get(r0)
            com.ss.android.ugc.aweme.shortvideo.e r5 = (com.ss.android.ugc.aweme.shortvideo.e) r5
            if (r5 == 0) goto L_0x0096
            java.lang.String r6 = r5.getPicMedium()
        L_0x0096:
            r7.setImageURI((java.lang.String) r6)
        L_0x0099:
            com.bytedance.ies.dmt.ui.a.b$a r5 = new com.bytedance.ies.dmt.ui.a.b$a
            r6 = r10
            android.app.Activity r6 = (android.app.Activity) r6
            r5.<init>(r6)
            com.bytedance.ies.dmt.ui.a.b$a r5 = r5.d((boolean) r0)
            com.bytedance.ies.dmt.ui.a.b$a r1 = r5.a((android.view.View) r1)
            r5 = 1090519040(0x41000000, float:8.0)
            com.bytedance.ies.dmt.ui.a.b$a r1 = r1.a((float) r5)
            com.bytedance.ies.dmt.ui.a.b$a r1 = r1.a((long) r2)
            com.bytedance.ies.dmt.ui.a.b$a r1 = r1.a((boolean) r4)
            com.bytedance.ies.dmt.ui.a.b r1 = r1.a()
            r10.f66854f = r1
            goto L_0x00e3
        L_0x00be:
            com.bytedance.ies.dmt.ui.a.b$a r1 = new com.bytedance.ies.dmt.ui.a.b$a
            r5 = r10
            android.app.Activity r5 = (android.app.Activity) r5
            r1.<init>(r5)
            boolean r5 = r10.M
            if (r5 == 0) goto L_0x00ce
            r5 = 2131559810(0x7f0d0582, float:1.8744975E38)
            goto L_0x00d1
        L_0x00ce:
            r5 = 2131558786(0x7f0d0182, float:1.8742898E38)
        L_0x00d1:
            com.bytedance.ies.dmt.ui.a.b$a r1 = r1.b((int) r5)
            com.bytedance.ies.dmt.ui.a.b$a r1 = r1.a((long) r2)
            com.bytedance.ies.dmt.ui.a.b$a r1 = r1.a((boolean) r4)
            com.bytedance.ies.dmt.ui.a.b r1 = r1.a()
            r10.f66854f = r1
        L_0x00e3:
            r10.W = r4
            r1 = r10
            android.content.Context r1 = (android.content.Context) r1
            boolean r1 = com.ss.android.ugc.aweme.utils.ey.a((android.content.Context) r1)
            android.os.Handler r2 = r10.T
            com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity$i r3 = new com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity$i
            r3.<init>(r10, r1)
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.post(r3)
            com.bytedance.ies.dmt.ui.a.b r1 = r10.f66854f
            if (r1 != 0) goto L_0x0101
            java.lang.String r2 = "musicBubble"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0101:
            android.view.View r1 = r1.getContentView()
            com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity$j r2 = new com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity$j
            r2.<init>(r10)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
            boolean r1 = r10.M
            if (r1 == 0) goto L_0x0116
            r10.aa = r0
            goto L_0x011a
        L_0x0116:
            r10.f66853e = r0
            r10.V = r4
        L_0x011a:
            java.lang.String r0 = "change_music_toast_show"
            com.ss.android.ugc.aweme.app.d.d r1 = new com.ss.android.ugc.aweme.app.d.d
            r1.<init>()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "video_edit_page"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "shoot_way"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r10.z
            java.lang.String r3 = r3.mShootWay
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "creation_id"
            com.ss.android.ugc.aweme.shortvideo.edit.cb r3 = r10.z
            java.lang.String r3 = r3.creationId
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity.g():void");
    }

    public final void o() {
        p pVar;
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f66849a, false, 76154, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66849a, false, 76154, new Class[0], Void.TYPE);
            return;
        }
        if (this.W) {
            com.bytedance.ies.dmt.ui.a.b bVar = this.f66854f;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("musicBubble");
            }
            if (bVar.isShowing()) {
                com.bytedance.ies.dmt.ui.a.b bVar2 = this.f66854f;
                if (bVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("musicBubble");
                }
                bVar2.dismiss();
            }
        }
        if (!this.M && this.V) {
            this.V = false;
            com.ss.android.ugc.aweme.port.in.a.i.a(true);
        }
        if (this.M) {
            com.ss.android.ugc.aweme.port.in.a.i.a(true);
        }
        com.ss.android.ugc.aweme.shortvideo.music.a aVar = this.f66851c;
        if (aVar != null) {
            pVar = aVar.u;
        } else {
            pVar = null;
        }
        if (pVar == null) {
            com.ss.android.ugc.aweme.shortvideo.music.a aVar2 = this.f66851c;
            if (aVar2 != null) {
                aVar2.u = (p) this.O.a().getValue();
            }
        }
        com.ss.android.ugc.aweme.shortvideo.music.a aVar3 = this.f66851c;
        if (aVar3 != null) {
            if (PatchProxy.isSupport(new Object[0], aVar3, com.ss.android.ugc.aweme.shortvideo.music.a.f68410a, false, 77755, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar3, com.ss.android.ugc.aweme.shortvideo.music.a.f68410a, false, 77755, new Class[0], Void.TYPE);
            } else {
                aVar3.x.removeAllViews();
                AppCompatActivity appCompatActivity = aVar3.w;
                FrameLayout frameLayout = aVar3.x;
                if (PatchProxy.isSupport(new Object[]{appCompatActivity, frameLayout}, aVar3, com.ss.android.ugc.aweme.shortvideo.music.a.f68410a, false, 77759, new Class[]{AppCompatActivity.class, FrameLayout.class}, Void.TYPE)) {
                    com.ss.android.ugc.aweme.shortvideo.music.a aVar4 = aVar3;
                    PatchProxy.accessDispatch(new Object[]{appCompatActivity, frameLayout}, aVar4, com.ss.android.ugc.aweme.shortvideo.music.a.f68410a, false, 77759, new Class[]{AppCompatActivity.class, FrameLayout.class}, Void.TYPE);
                } else if (aVar3.n == null) {
                    LayoutInflater from = LayoutInflater.from(appCompatActivity);
                    if (com.ss.android.ugc.aweme.shortvideo.music.b.a() == 0) {
                        i2 = C0906R.layout.g0;
                    } else {
                        i2 = C0906R.layout.g1;
                    }
                    aVar3.n = from.inflate(i2, frameLayout, false);
                    if (PatchProxy.isSupport(new Object[0], aVar3, com.ss.android.ugc.aweme.shortvideo.music.a.f68410a, false, 77760, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], aVar3, com.ss.android.ugc.aweme.shortvideo.music.a.f68410a, false, 77760, new Class[0], Void.TYPE);
                    } else {
                        View view = aVar3.n;
                        if (view == null) {
                            Intrinsics.throwNpe();
                        }
                        aVar3.m = (RelativeLayout) view.findViewById(C0906R.id.boc);
                        View view2 = aVar3.n;
                        if (view2 == null) {
                            Intrinsics.throwNpe();
                        }
                        view2.findViewById(C0906R.id.box).setOnClickListener(new a.d(aVar3));
                        View view3 = aVar3.n;
                        if (view3 == null) {
                            Intrinsics.throwNpe();
                        }
                        aVar3.l = (DmtTextView) view3.findViewById(C0906R.id.dlz);
                        View view4 = aVar3.n;
                        if (view4 == null) {
                            Intrinsics.throwNpe();
                        }
                        aVar3.k = (DmtTextView) view4.findViewById(C0906R.id.dm4);
                        View view5 = aVar3.n;
                        if (view5 == null) {
                            Intrinsics.throwNpe();
                        }
                        aVar3.q = (ViewGroup) view5.findViewById(C0906R.id.bfx);
                        View view6 = aVar3.n;
                        if (view6 == null) {
                            Intrinsics.throwNpe();
                        }
                        aVar3.r = (FrameLayout) view6.findViewById(C0906R.id.cgv);
                        DmtTextView dmtTextView = aVar3.k;
                        if (dmtTextView == null) {
                            Intrinsics.throwNpe();
                        }
                        View.OnClickListener onClickListener = aVar3;
                        dmtTextView.setOnClickListener(onClickListener);
                        DmtTextView dmtTextView2 = aVar3.l;
                        if (dmtTextView2 == null) {
                            Intrinsics.throwNpe();
                        }
                        dmtTextView2.setOnClickListener(onClickListener);
                        aVar3.f68413d = com.ss.android.ugc.aweme.port.in.a.i.a(aVar3.w, aVar3.u, (com.ss.android.ugc.aweme.ao.a.a) new a.e(aVar3));
                        a.c cVar = aVar3.f68413d;
                        if (cVar != null) {
                            cVar.a(aVar3.f68411b);
                        }
                        a.c cVar2 = aVar3.f68413d;
                        if (cVar2 != null) {
                            cVar2.a(aVar3.w, aVar3.r);
                        }
                        a.c cVar3 = aVar3.f68413d;
                        if (cVar3 != null) {
                            cVar3.a(aVar3.f68412c);
                        }
                        a.c cVar4 = aVar3.f68413d;
                        if (cVar4 != null) {
                            cVar4.a(aVar3.f68415f);
                        }
                        a.c cVar5 = aVar3.f68413d;
                        if (cVar5 != null) {
                            cVar5.a(aVar3.s);
                        }
                        a.c cVar6 = aVar3.f68413d;
                        if (cVar6 != null) {
                            cVar6.a(aVar3.t);
                        }
                        a.c cVar7 = aVar3.f68413d;
                        if (cVar7 != null) {
                            cVar7.a((com.ss.android.ugc.aweme.ao.a.i) new a.f(aVar3));
                        }
                    }
                    View view7 = aVar3.n;
                    if (view7 == null) {
                        Intrinsics.throwNpe();
                    }
                    RelativeLayout relativeLayout = aVar3.m;
                    if (relativeLayout == null) {
                        Intrinsics.throwNpe();
                    }
                    aVar3.o = new com.ss.android.ugc.aweme.filter.b(frameLayout, view7, relativeLayout);
                    com.ss.android.ugc.aweme.filter.b bVar3 = aVar3.o;
                    if (bVar3 == null) {
                        Intrinsics.throwNpe();
                    }
                    bVar3.a((com.ss.android.ugc.aweme.photomovie.transition.f) new a.c(aVar3));
                    aVar3.a(com.ss.android.ugc.aweme.shortvideo.music.a.z, false);
                } else {
                    a.c cVar8 = aVar3.f68413d;
                    if (cVar8 != null) {
                        cVar8.a(aVar3.w, aVar3.r);
                    }
                }
                View view8 = aVar3.n;
                if (view8 != null) {
                    view8.setVisibility(4);
                }
                com.ss.android.ugc.aweme.filter.b bVar4 = aVar3.o;
                if (bVar4 != null) {
                    bVar4.a((ITransition) new a.h(aVar3));
                }
                aVar3.y.a(aVar3.f68414e);
            }
        }
        a(false, false);
        r.a("click_music_entrance", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.z.creationId).a("content_source", l()).a("content_type", k()).a("shoot_way", this.z.mShootWay).a("enter_from", "video_edit_page").f34114b);
    }

    public static final /* synthetic */ com.bytedance.ies.dmt.ui.a.b a(AIMusicVEVideoPublishEditActivity aIMusicVEVideoPublishEditActivity) {
        com.bytedance.ies.dmt.ui.a.b bVar = aIMusicVEVideoPublishEditActivity.f66854f;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("musicBubble");
        }
        return bVar;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f66849a, false, 76137, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f66849a, false, 76137, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity", "onCreate", true);
        super.onCreate(bundle);
        this.Z = com.ss.android.ugc.aweme.port.in.a.L.a(e.a.CombinedShootModeTipShown);
        cb cbVar = this.z;
        Intrinsics.checkExpressionValueIsNotNull(cbVar, "mModel");
        if (cbVar.isMvThemeVideoType()) {
            com.ss.android.ugc.aweme.shortvideo.music.a aVar = this.f66851c;
            if (aVar == null) {
                Intrinsics.throwNpe();
            }
            List<String> list = this.z.mvCreateVideoData.musicIds;
            if (PatchProxy.isSupport(new Object[]{list}, aVar, com.ss.android.ugc.aweme.shortvideo.music.a.f68410a, false, 77750, new Class[]{List.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.shortvideo.music.a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{list}, aVar2, com.ss.android.ugc.aweme.shortvideo.music.a.f68410a, false, 77750, new Class[]{List.class}, Void.TYPE);
            } else {
                aVar.f68411b = list;
                a.c cVar = aVar.f68413d;
                if (cVar != null) {
                    cVar.a(list);
                }
            }
            com.ss.android.ugc.aweme.shortvideo.music.a aVar3 = this.f66851c;
            if (aVar3 == null) {
                Intrinsics.throwNpe();
            }
            aVar3.j = this.z.mIsFromDraft;
        }
        this.X = this.z.musicId;
        this.Y = this.z.mMusicOrigin;
        if (!com.ss.android.ugc.aweme.port.in.a.i.e()) {
            com.ss.android.ugc.aweme.port.in.a.i.f().a(new h(this));
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.edit.AIMusicVEVideoPublishEditActivity", "onCreate", false);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f66849a, false, 76157, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f66849a, false, 76157, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(z);
        com.ss.android.ugc.aweme.shortvideo.music.a aVar = this.f66851c;
        if (aVar != null) {
            aVar.g = z;
        }
    }

    public final void a(@NotNull com.ss.android.ugc.aweme.shortvideo.e eVar, boolean z) {
        com.ss.android.ugc.aweme.shortvideo.e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f66849a, false, 76156, new Class[]{com.ss.android.ugc.aweme.shortvideo.e.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2, Byte.valueOf(z)}, this, f66849a, false, 76156, new Class[]{com.ss.android.ugc.aweme.shortvideo.e.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(eVar2, "model");
        super.a(eVar, z);
        if (z) {
            com.ss.android.ugc.aweme.shortvideo.music.a aVar = this.f66851c;
            if (aVar == null) {
                Intrinsics.throwNpe();
            }
            aVar.v = eVar2;
        }
    }

    public final void a(@Nullable String str, @Nullable String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f66849a, false, 76150, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f66849a, false, 76150, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        super.a(str, str2);
        this.X = com.ss.android.ugc.aweme.imported.e.a(ej.a().b());
        this.Y = str2;
        this.g = false;
        this.f66850b = ej.a().b();
    }

    public final void a(@Nullable String str, boolean z, @Nullable com.ss.android.ugc.aweme.shortvideo.e eVar) {
        int i2;
        boolean z2;
        String str2;
        String str3;
        String str4 = str;
        if (PatchProxy.isSupport(new Object[]{str4, Byte.valueOf(z ? (byte) 1 : 0), eVar}, this, f66849a, false, 76153, new Class[]{String.class, Boolean.TYPE, com.ss.android.ugc.aweme.shortvideo.e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, Byte.valueOf(z), eVar}, this, f66849a, false, 76153, new Class[]{String.class, Boolean.TYPE, com.ss.android.ugc.aweme.shortvideo.e.class}, Void.TYPE);
            return;
        }
        IAVPublishService publishService = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService();
        Intrinsics.checkExpressionValueIsNotNull(publishService, "ServiceManager.get().get…ss.java).publishService()");
        String a2 = com.ss.android.ugc.aweme.imported.e.a(publishService.getCurMusic());
        Intrinsics.checkExpressionValueIsNotNull(a2, "MusicModelUtils.getMusic…ublishService().curMusic)");
        t tVar = new t();
        tVar.f83064b = str4;
        tVar.f83065c = 0;
        tVar.f83068f = a2;
        int b2 = com.ss.android.ugc.aweme.port.in.a.i.b(str);
        if (com.ss.android.g.a.b()) {
            i2 = Math.min(b2, 15000);
        } else {
            i2 = b2;
        }
        tVar.f83066d = i2;
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.v;
        Intrinsics.checkExpressionValueIsNotNull(vEVideoPublishEditViewModel, "mViewModel");
        vEVideoPublishEditViewModel.d().setValue(tVar);
        this.q = this.z.mMusicPath;
        this.z.mMusicPath = str4;
        this.z.musicId = a2;
        this.z.mMusicStart = 0;
        this.z.mMusicEnd = Math.min(tVar.f83066d, 60000);
        String str5 = this.X;
        VEMVAudioInfo vEMVAudioInfo = null;
        if (str5 == null || !str5.equals(a2)) {
            cb cbVar = this.z;
            if (z) {
                str2 = "edit_page_recommend";
            } else {
                str2 = "edit_page_recommend_favorite";
            }
            cbVar.mMusicOrigin = str2;
            if (z && eVar != null) {
                cb cbVar2 = this.z;
                com.ss.android.ugc.aweme.ao.a.b logPb = eVar.getLogPb();
                if (logPb != null) {
                    str3 = logPb.getImprId();
                } else {
                    str3 = null;
                }
                cbVar2.aiMusicLogPbImprId = str3;
                this.z.comFrom = eVar.getComeFromForMod();
            }
        } else {
            this.z.mMusicOrigin = this.Y;
        }
        if (J() || L() || this.z.mMusicPath == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        a(z2);
        c(false);
        this.z.musicVolume = 0.5f;
        VolumeHelper volumeHelper = this.B;
        Intrinsics.checkExpressionValueIsNotNull(volumeHelper, "mVolumeHelper");
        volumeHelper.a(50);
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel2 = this.v;
        Intrinsics.checkExpressionValueIsNotNull(vEVideoPublishEditViewModel2, "mViewModel");
        MutableLiveData<VEVolumeChangeOp> o = vEVideoPublishEditViewModel2.o();
        Intrinsics.checkExpressionValueIsNotNull(o, "mViewModel.volumeChangeOpLiveData");
        o.setValue(VEVolumeChangeOp.ofMusic(0.5f));
        cb cbVar3 = this.z;
        Intrinsics.checkExpressionValueIsNotNull(cbVar3, "mModel");
        if (!cbVar3.isMvThemeVideoType() || this.z.mvCreateVideoData.mvType != 1) {
            Lifecycle lifecycle = getLifecycle();
            Intrinsics.checkExpressionValueIsNotNull(lifecycle, "lifecycle");
            if (lifecycle.getCurrentState() == Lifecycle.State.RESUMED) {
                VEVideoPublishEditViewModel vEVideoPublishEditViewModel3 = this.v;
                Intrinsics.checkExpressionValueIsNotNull(vEVideoPublishEditViewModel3, "mViewModel");
                MutableLiveData<s> m = vEVideoPublishEditViewModel3.m();
                Intrinsics.checkExpressionValueIsNotNull(m, "mViewModel.previewControlLiveData");
                m.setValue(s.b());
                m.setValue(s.b(0));
                m.setValue(s.a());
            }
        } else if (this.z.mvCreateVideoData.musicIds.contains(a2)) {
            com.ss.android.ugc.aweme.shortvideo.music.a aVar = this.f66851c;
            if (aVar != null) {
                p pVar = aVar.u;
                if (pVar != null) {
                    vEMVAudioInfo = pVar.f();
                }
            }
            if (vEMVAudioInfo != null) {
                this.z.mMusicStart = vEMVAudioInfo.trimIn;
                this.z.mMusicEnd = Math.min(vEMVAudioInfo.trimOut, 60000);
                a(vEMVAudioInfo.path, vEMVAudioInfo.trimIn, vEMVAudioInfo.trimOut, b2, true);
            }
        } else {
            a(str, this.z.mMusicStart, this.z.mMusicEnd, b2, true);
        }
        IAVPublishService publishService2 = ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService();
        Intrinsics.checkExpressionValueIsNotNull(publishService2, "ServiceManager.get().get…ss.java).publishService()");
        this.f66850b = publishService2.getCurMusic();
    }
}

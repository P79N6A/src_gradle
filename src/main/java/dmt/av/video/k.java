package dmt.av.video;

import a.i;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LifecycleRegistry;
import android.support.annotation.NonNull;
import android.support.v4.os.CancellationSignal;
import android.view.SurfaceView;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.google.common.util.concurrent.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.photo.publish.Publish;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.property.f;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.bi;
import com.ss.android.ugc.aweme.shortvideo.cut.ap;
import com.ss.android.ugc.aweme.shortvideo.cut.model.h;
import com.ss.android.ugc.aweme.shortvideo.edit.ca;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b;
import com.ss.android.ugc.aweme.shortvideo.ei;
import com.ss.android.ugc.aweme.shortvideo.fg;
import com.ss.android.ugc.aweme.shortvideo.gp;
import com.ss.android.ugc.aweme.shortvideo.gq;
import com.ss.android.ugc.aweme.shortvideo.gr;
import com.ss.android.ugc.aweme.shortvideo.gs;
import com.ss.android.ugc.aweme.shortvideo.gt;
import com.ss.android.ugc.aweme.shortvideo.model.VEVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.record.o;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEWatermarkParam;
import com.ss.android.vesdk.m;
import com.ss.android.vesdk.p;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public final class k implements LifecycleOwner {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f83011a;

    /* renamed from: b  reason: collision with root package name */
    LifecycleRegistry f83012b = new LifecycleRegistry(this);

    /* renamed from: c  reason: collision with root package name */
    List<String> f83013c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public int f83014d = -1;

    @NonNull
    public final Lifecycle getLifecycle() {
        return this.f83012b;
    }

    public k() {
        this.f83012b.markState(Lifecycle.State.STARTED);
    }

    public k(int i) {
        this.f83012b.markState(Lifecycle.State.STARTED);
        this.f83014d = i;
    }

    private static boolean a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f83011a, true, 91973, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f83011a, true, 91973, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (Publish.d(i)) {
            if (a.N.f63280a > 0.0f) {
                return true;
            }
            return false;
        } else if (a.N.f63281b > 0.0f) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean c(cb cbVar) {
        cb cbVar2 = cbVar;
        if (PatchProxy.isSupport(new Object[]{cbVar2}, null, f83011a, true, 91972, new Class[]{cb.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{cbVar2}, null, f83011a, true, 91972, new Class[]{cb.class}, Boolean.TYPE)).booleanValue();
        } else if (!cbVar2.isFastImport || a.L.a(e.a.VEFastImportIgnoreRecode)) {
            return false;
        } else {
            return true;
        }
    }

    public static int[] a(cb cbVar) {
        int[] iArr;
        cb cbVar2 = cbVar;
        if (PatchProxy.isSupport(new Object[]{cbVar2}, null, f83011a, true, 91968, new Class[]{cb.class}, int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[]{cbVar2}, null, f83011a, true, 91968, new Class[]{cb.class}, int[].class);
        }
        if (Publish.d(cbVar2.videoType)) {
            iArr = f.a(a.N.f63283d);
        } else {
            iArr = f.a(a.N.f63282c);
        }
        if (iArr == null || iArr.length != 2 || iArr[0] <= 0 || iArr[1] <= 0) {
            if (!ca.a(cbVar) || cbVar2.mOutVideoWidth <= 0 || cbVar2.mOutVideoHeight <= 0) {
                iArr = cbVar2.isFastImport ? new int[]{-1, -1} : new int[]{cbVar2.mVideoWidth, cbVar2.mVideoHeight};
            } else {
                iArr = new int[]{cbVar2.mOutVideoWidth, cbVar2.mOutVideoHeight};
            }
        }
        ai.a("getCompileVideoSize,width:" + iArr[0] + "height:" + iArr[1]);
        return iArr;
    }

    public static boolean b(@NonNull cb cbVar) {
        cb cbVar2 = cbVar;
        if (PatchProxy.isSupport(new Object[]{cbVar2}, null, f83011a, true, 91971, new Class[]{cb.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{cbVar2}, null, f83011a, true, 91971, new Class[]{cb.class}, Boolean.TYPE)).booleanValue();
        } else if (a.M.a(a.C0682a.NeedRecode) || c(cbVar) || cbVar.isMvThemeVideoType() || cbVar.hasStickers() || cbVar2.mTimeEffect != null || Lists.notEmpty(cbVar2.mEffectList) || cbVar2.mSelectedId != 0 || ah.c(cbVar2.mPath) * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE > com.ss.android.ugc.aweme.port.in.a.L.b(e.a.BitrateOfRecodeThreshold) || a(cbVar2.videoType)) {
            return true;
        } else {
            return false;
        }
    }

    public static VEVideoEncodeSettings a(cb cbVar, SynthetiseResult synthetiseResult, VEWatermarkParam vEWatermarkParam) {
        boolean z;
        float f2;
        cb cbVar2 = cbVar;
        SynthetiseResult synthetiseResult2 = synthetiseResult;
        VEWatermarkParam vEWatermarkParam2 = vEWatermarkParam;
        if (PatchProxy.isSupport(new Object[]{cbVar2, synthetiseResult2, vEWatermarkParam2}, null, f83011a, true, 91969, new Class[]{cb.class, SynthetiseResult.class, VEWatermarkParam.class}, VEVideoEncodeSettings.class)) {
            return (VEVideoEncodeSettings) PatchProxy.accessDispatch(new Object[]{cbVar2, synthetiseResult2, vEWatermarkParam2}, null, f83011a, true, 91969, new Class[]{cb.class, SynthetiseResult.class, VEWatermarkParam.class}, VEVideoEncodeSettings.class);
        }
        int[] a2 = a(cbVar);
        VEVideoEncodeSettings.a aVar = new VEVideoEncodeSettings.a(2);
        aVar.f(a.a(f.o())).a(a2[0], a2[1]);
        if (ca.a(cbVar) && (a2[0] > cbVar2.mVideoWidth || a2[1] > cbVar2.mVideoHeight)) {
            aVar.e(3).a(0.0f).b(0.0f);
        }
        if (!f.b() || f.c()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (Publish.d(cbVar2.videoType)) {
                f2 = com.ss.android.ugc.aweme.port.in.a.N.f63280a;
            } else {
                f2 = com.ss.android.ugc.aweme.port.in.a.N.f63281b;
            }
            if (f2 <= 0.0f) {
                f2 = f.f();
            }
            aVar.b(true).a(VEVideoEncodeSettings.c.ENCODE_BITRATE_ABR, a.a(f2));
            aVar.a(o.a());
        } else {
            aVar.b(false).a(VEVideoEncodeSettings.c.ENCODE_BITRATE_CRF, a.b(f.l()));
        }
        VEVideoEncodeSettings.d c2 = a.c(f.n());
        if (c2 != null) {
            aVar.a(c2);
        }
        aVar.a(a.a(f.m()));
        if (cbVar.hasInfoStickers() || (!Lists.isEmpty(cbVar2.mEffectList) && ah.b(cbVar2.mPath) < 10)) {
            aVar.a(30);
        } else if (com.ss.android.ugc.aweme.port.in.a.L.a(e.a.EnableSyntheticFpsSet)) {
            int b2 = ah.b(cbVar2.mPath);
            if (b2 > 0) {
                aVar.a(b2);
            }
        }
        aVar.a(!synthetiseResult2.needRecode);
        aVar.a(i.a(cbVar2.uploadSpeedInfo.getSpeed()));
        VEVideoEncodeSettings a3 = aVar.a();
        a3.setWatermark(vEWatermarkParam2);
        cbVar2.isSyntheticHardEncode = a3.getVideoCompileEncodeSetting().useHWEncoder;
        return a3;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    @android.support.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static dmt.av.video.ad a(com.ss.android.ugc.aweme.shortvideo.edit.cb r29, android.arch.lifecycle.LifecycleOwner r30, android.view.SurfaceView r31) {
        /*
            r0 = r29
            r1 = r30
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            r12 = 2
            r13 = 0
            r3[r12] = r13
            com.meituan.robust.ChangeQuickRedirect r5 = f83011a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.cb> r4 = com.ss.android.ugc.aweme.shortvideo.edit.cb.class
            r8[r10] = r4
            java.lang.Class<android.arch.lifecycle.LifecycleOwner> r4 = android.arch.lifecycle.LifecycleOwner.class
            r8[r11] = r4
            java.lang.Class<android.view.SurfaceView> r4 = android.view.SurfaceView.class
            r8[r12] = r4
            java.lang.Class<dmt.av.video.ad> r9 = dmt.av.video.ad.class
            r4 = 0
            r6 = 1
            r7 = 91970(0x16742, float:1.28877E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0057
            java.lang.Object[] r14 = new java.lang.Object[r2]
            r14[r10] = r0
            r14[r11] = r1
            r14[r12] = r13
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f83011a
            r17 = 1
            r18 = 91970(0x16742, float:1.28877E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.cb> r1 = com.ss.android.ugc.aweme.shortvideo.edit.cb.class
            r0[r10] = r1
            java.lang.Class<android.arch.lifecycle.LifecycleOwner> r1 = android.arch.lifecycle.LifecycleOwner.class
            r0[r11] = r1
            java.lang.Class<android.view.SurfaceView> r1 = android.view.SurfaceView.class
            r0[r12] = r1
            java.lang.Class<dmt.av.video.ad> r20 = dmt.av.video.ad.class
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            dmt.av.video.ad r0 = (dmt.av.video.ad) r0
            return r0
        L_0x0057:
            dmt.av.video.f r3 = new dmt.av.video.f
            r3.<init>()
            java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel> r4 = r0.mEffectList
            if (r4 == 0) goto L_0x0065
            java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel> r4 = r0.mEffectList
            dmt.av.video.q.a(r4, r3)
        L_0x0065:
            com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure r4 = r0.previewConfigure
            if (r4 == 0) goto L_0x0085
            com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure r4 = r0.previewConfigure
            r4.mAudioPaths = r13
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "init ve_editor in compiler using preview configure:"
            r5.<init>(r6)
            com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure r6 = r0.previewConfigure
            java.lang.String r6 = r6.toString()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.ss.android.ugc.aweme.shortvideo.util.ai.a(r5)
            goto L_0x00de
        L_0x0085:
            dmt.av.video.u r4 = new dmt.av.video.u
            r4.<init>()
            com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r5 = r29.getAvetParameter()
            int r5 = r5.getShootMode()
            r6 = 6
            if (r5 != r6) goto L_0x00aa
            com.ss.android.ugc.aweme.shortvideo.gi r5 = r0.storyBoomModel
            if (r5 == 0) goto L_0x00aa
            com.ss.android.ugc.aweme.shortvideo.gi r5 = r0.storyBoomModel
            r4.mAudioPaths = r13
            int r6 = r5.getFps()
            r4.mFps = r6
            java.lang.String[] r5 = r5.getVideoList()
            r4.mVideoPaths = r5
            goto L_0x00c4
        L_0x00aa:
            java.lang.String[] r5 = new java.lang.String[r11]
            java.lang.String r6 = r0.mPath
            r5[r10] = r6
            r4.mVideoPaths = r5
            java.lang.String r5 = r29.getWavFile()
            if (r5 != 0) goto L_0x00ba
            r5 = r13
            goto L_0x00c2
        L_0x00ba:
            java.lang.String[] r5 = new java.lang.String[r11]
            java.lang.String r6 = r29.getWavFile()
            r5[r10] = r6
        L_0x00c2:
            r4.mAudioPaths = r5
        L_0x00c4:
            int r5 = r0.videoType
            r6 = 9
            if (r5 != r6) goto L_0x00de
            int[] r5 = new int[r11]
            r5[r10] = r10
            r4.mVTrimIn = r5
            int[] r5 = new int[r11]
            com.ss.android.ugc.aweme.property.e r6 = com.ss.android.ugc.aweme.port.in.a.L
            com.ss.android.ugc.aweme.property.e$a r7 = com.ss.android.ugc.aweme.property.e.a.StoryImagePlayTime
            int r6 = r6.b(r7)
            r5[r10] = r6
            r4.mVTrimOut = r5
        L_0x00de:
            int r5 = r0.mVideoCanvasWidth
            r4.canvasWidth = r5
            int r5 = r0.mVideoCanvasHeight
            r4.canvasHeight = r5
            float r5 = r0.voiceVolume
            r4.mVolume = r5
            float r5 = r0.musicVolume
            r4.mMusicVolume = r5
            java.lang.String r5 = r0.mPath
            java.lang.String r5 = com.ss.android.ugc.aweme.shortvideo.a.d.a((java.lang.String) r5)
            r4.mWorkspace = r5
            java.lang.String r5 = r0.mMusicPath
            r4.mMusicPath = r5
            int r5 = r0.mMusicStart
            r4.mMusicInPoint = r5
            int r5 = r0.mMusicEnd
            r4.mMusicOutPoint = r5
            r4.mPageType = r2
            boolean r5 = r0.mIsFromDraft
            r4.mIsFromDraft = r5
            int r5 = r0.videoEditorType
            r4.videoEditorType = r5
            com.ss.android.ugc.aweme.x.a r5 = r0.mvCreateVideoData
            r4.mvCreateVideoData = r5
            com.ss.android.ugc.aweme.shortvideo.ah r5 = r0.veCherEffectParam
            if (r5 == 0) goto L_0x012d
            com.ss.android.vesdk.VECherEffectParam r5 = new com.ss.android.vesdk.VECherEffectParam
            com.ss.android.ugc.aweme.shortvideo.ah r6 = r0.veCherEffectParam
            java.lang.String[] r6 = r6.getMatrix()
            com.ss.android.ugc.aweme.shortvideo.ah r7 = r0.veCherEffectParam
            double[] r7 = r7.getDuration()
            com.ss.android.ugc.aweme.shortvideo.ah r8 = r0.veCherEffectParam
            boolean[] r8 = r8.getSegUseCher()
            r5.<init>(r6, r7, r8)
            r4.veCherEffectParam = r5
        L_0x012d:
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r5 = r0.veAudioEffectParam
            if (r5 == 0) goto L_0x0135
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r5 = r0.veAudioEffectParam
            r4.veAudioEffectParam = r5
        L_0x0135:
            android.arch.lifecycle.MutableLiveData r5 = new android.arch.lifecycle.MutableLiveData
            r5.<init>()
            com.ss.android.ugc.aweme.shortvideo.edit.a.b r6 = new com.ss.android.ugc.aweme.shortvideo.edit.a.b
            boolean r7 = r0.autoEnhanceOn
            int r8 = r0.autoEnhanceType
            r6.<init>(r7, r8, r10)
            r5.setValue(r6)
            android.arch.lifecycle.MutableLiveData r6 = new android.arch.lifecycle.MutableLiveData
            r6.<init>()
            r6.setValue(r4)
            android.arch.lifecycle.MutableLiveData r7 = new android.arch.lifecycle.MutableLiveData
            r7.<init>()
            int r8 = r29.isMusic()
            r9 = -1
            if (r8 != r11) goto L_0x0176
            dmt.av.video.t r8 = new dmt.av.video.t
            r8.<init>()
            r8.g = r2
            java.lang.String r14 = r0.mMusicPath
            r8.f83064b = r14
            int r14 = r0.mMusicStart
            r8.f83065c = r14
            r8.f83066d = r9
            float r14 = r0.musicVolume
            r8.f83067e = r14
            java.lang.String r14 = r0.musicId
            r8.f83068f = r14
            r7.setValue(r8)
        L_0x0176:
            android.arch.lifecycle.MutableLiveData r8 = new android.arch.lifecycle.MutableLiveData
            r8.<init>()
            com.ss.android.ugc.aweme.n.a r14 = r0.infoStickerModel
            if (r14 == 0) goto L_0x01e5
            com.ss.android.ugc.aweme.n.a r14 = r0.infoStickerModel
            java.util.List<com.ss.android.ugc.aweme.n.b> r14 = r14.stickers
            boolean r14 = com.bytedance.common.utility.Lists.notEmpty(r14)
            if (r14 == 0) goto L_0x01e5
            boolean r14 = com.ss.android.ugc.aweme.shortvideo.edit.ca.b(r29)
            if (r14 == 0) goto L_0x01e5
            com.ss.android.ugc.aweme.n.a r14 = r0.infoStickerModel
            com.ss.android.ugc.aweme.n.a r14 = r14.clone()
            java.util.List<com.ss.android.ugc.aweme.n.b> r15 = r14.stickers
            java.util.Iterator r15 = r15.iterator()
        L_0x019b:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x01e1
            java.lang.Object r16 = r15.next()
            r2 = r16
            com.ss.android.ugc.aweme.n.b r2 = (com.ss.android.ugc.aweme.n.b) r2
            boolean r9 = r2.isImageStickerLayer
            if (r9 != 0) goto L_0x01de
            float r9 = r2.currentOffsetX
            float r12 = r2.currentOffsetY
            int r13 = r0.mVideoCanvasWidth
            int r11 = r0.mVideoCanvasHeight
            int r10 = r0.mOutVideoWidth
            r28 = r15
            int r15 = r0.mOutVideoHeight
            r21 = r9
            r22 = r12
            r23 = r13
            r24 = r11
            r25 = r10
            r26 = r15
            float[] r9 = com.ss.android.ugc.aweme.shortvideo.edit.ca.a(r21, r22, r23, r24, r25, r26)
            r10 = 0
            r11 = r9[r10]
            r2.currentOffsetX = r11
            r10 = 1
            r9 = r9[r10]
            r2.currentOffsetY = r9
            r15 = r28
            r2 = 3
            r9 = -1
            r10 = 0
            r11 = 1
            r12 = 2
            r13 = 0
            goto L_0x019b
        L_0x01de:
            r2 = 3
            r9 = -1
            goto L_0x019b
        L_0x01e1:
            r8.setValue(r14)
            goto L_0x01ea
        L_0x01e5:
            com.ss.android.ugc.aweme.n.a r2 = r0.infoStickerModel
            r8.setValue(r2)
        L_0x01ea:
            dmt.av.video.h r2 = new dmt.av.video.h
            r2.<init>()
            android.arch.lifecycle.MutableLiveData r9 = new android.arch.lifecycle.MutableLiveData
            r9.<init>()
            dmt.av.video.h r10 = new dmt.av.video.h
            r10.<init>()
            dmt.av.video.ad r11 = new dmt.av.video.ad
            int r12 = r0.videoEditorType
            r11.<init>(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r11.a((java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel>) r12)
            r11.a((android.arch.lifecycle.MutableLiveData<java.lang.Boolean>) r9)
            android.arch.lifecycle.MutableLiveData r9 = new android.arch.lifecycle.MutableLiveData
            r9.<init>()
            r11.m = r9
            r11.j = r2
            r11.k = r10
            android.arch.lifecycle.MutableLiveData r9 = new android.arch.lifecycle.MutableLiveData
            r9.<init>()
            r11.b(r9)
            android.arch.lifecycle.MutableLiveData r9 = new android.arch.lifecycle.MutableLiveData
            r9.<init>()
            r11.l = r9
            r11.i = r3
            android.arch.lifecycle.MutableLiveData r3 = new android.arch.lifecycle.MutableLiveData
            r3.<init>()
            r11.h = r3
            r11.n = r8
            android.arch.lifecycle.MutableLiveData r3 = new android.arch.lifecycle.MutableLiveData
            r3.<init>()
            r11.g = r3
            r11.f82860f = r7
            r11.o = r5
            r11.f82859e = r6
            r3 = 0
            r11.a(r3, r1, r3)
            com.ss.android.ugc.aweme.effect.EffectPointModel r1 = r0.mTimeEffect
            if (r1 == 0) goto L_0x02ae
            com.ss.android.ugc.aweme.effect.EffectPointModel r1 = r0.mTimeEffect
            java.lang.String r1 = r1.getKey()
            int r3 = r1.hashCode()
            switch(r3) {
                case 48: goto L_0x0274;
                case 49: goto L_0x0269;
                case 50: goto L_0x025e;
                case 51: goto L_0x0253;
                default: goto L_0x0252;
            }
        L_0x0252:
            goto L_0x027f
        L_0x0253:
            java.lang.String r3 = "3"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x027f
            r27 = 2
            goto L_0x0281
        L_0x025e:
            java.lang.String r3 = "2"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x027f
            r27 = 1
            goto L_0x0281
        L_0x0269:
            java.lang.String r3 = "1"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x027f
            r27 = 3
            goto L_0x0281
        L_0x0274:
            java.lang.String r3 = "0"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x027f
            r27 = 0
            goto L_0x0281
        L_0x027f:
            r27 = -1
        L_0x0281:
            switch(r27) {
                case 0: goto L_0x02a7;
                case 1: goto L_0x029b;
                case 2: goto L_0x028f;
                case 3: goto L_0x028a;
                default: goto L_0x0284;
            }
        L_0x0284:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x028a:
            dmt.av.video.x r1 = dmt.av.video.x.b()
            goto L_0x02ab
        L_0x028f:
            com.ss.android.ugc.aweme.effect.EffectPointModel r1 = r0.mTimeEffect
            int r1 = r1.getEndPoint()
            long r5 = (long) r1
            dmt.av.video.x r1 = dmt.av.video.x.b(r5)
            goto L_0x02ab
        L_0x029b:
            com.ss.android.ugc.aweme.effect.EffectPointModel r1 = r0.mTimeEffect
            int r1 = r1.getEndPoint()
            long r5 = (long) r1
            dmt.av.video.x r1 = dmt.av.video.x.a(r5)
            goto L_0x02ab
        L_0x02a7:
            dmt.av.video.x r1 = dmt.av.video.x.a()
        L_0x02ab:
            r2.setValue(r1)
        L_0x02ae:
            com.ss.android.ugc.aweme.effect.EffectPointModel r1 = r0.mTimeEffect
            if (r1 == 0) goto L_0x02c2
            com.ss.android.ugc.aweme.effect.EffectPointModel r1 = r0.mTimeEffect
            java.lang.String r1 = r1.getKey()
            java.lang.String r2 = "1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c2
            r1 = 1
            goto L_0x02c3
        L_0x02c2:
            r1 = 0
        L_0x02c3:
            if (r1 == 0) goto L_0x0316
            com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure r1 = r0.previewConfigure
            if (r1 == 0) goto L_0x02e7
            com.ss.android.ugc.aweme.shortvideo.b.b r1 = r11.q
            com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure r2 = r0.previewConfigure
            java.lang.String[] r2 = r2.getReverseVideoArray()
            com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure r3 = r0.previewConfigure
            java.lang.String[] r3 = r3.getReverseAudioArray()
            r1.a((java.lang.String[]) r2, (java.lang.String[]) r3)
            com.ss.android.ugc.aweme.shortvideo.b.b r1 = r11.q
            com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure r2 = r0.previewConfigure
            java.lang.String[] r2 = r2.getTempVideoArray()
            r1.b((java.lang.String[]) r2)
            r2 = 1
            goto L_0x02f4
        L_0x02e7:
            com.ss.android.ugc.aweme.shortvideo.b.b r1 = r11.q
            r2 = 1
            java.lang.String[] r3 = new java.lang.String[r2]
            java.lang.String r5 = r0.mReversePath
            r6 = 0
            r3[r6] = r5
            r1.a((java.lang.String[]) r3)
        L_0x02f4:
            com.ss.android.ugc.aweme.shortvideo.b.b r1 = r11.q
            r1.c((boolean) r2)
            boolean r1 = r0.isFastImport
            if (r1 == 0) goto L_0x0316
            com.ss.android.ugc.aweme.shortvideo.b.b r1 = r11.q
            com.ss.android.vesdk.runtime.b r1 = r1.f78038b
            if (r1 == 0) goto L_0x0316
            com.ss.android.ugc.aweme.shortvideo.b.b r1 = r11.q
            com.ss.android.ugc.aweme.shortvideo.b.b r2 = r11.q
            com.ss.android.vesdk.runtime.b r2 = r2.f78038b
            int r2 = r2.h
            com.ss.android.ugc.aweme.shortvideo.b.b r3 = r11.q
            com.ss.android.vesdk.runtime.b r3 = r3.f78038b
            int r3 = r3.i
            float r4 = r4.mVolume
            r1.a((int) r2, (int) r3, (float) r4)
        L_0x0316:
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r1 = r0.veAudioEffectParam
            if (r1 == 0) goto L_0x0330
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r1 = r0.veAudioEffectParam
            r2 = 0
            r1.setShowErrorToast(r2)
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r1 = r0.veAudioEffectParam
            r2 = 0
            r1.setPreprocessResult(r2)
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r1 = r0.veAudioEffectParam
            r2 = 1
            dmt.av.video.j r1 = dmt.av.video.j.a(r2, r1)
            r10.setValue(r1)
        L_0x0330:
            int r1 = r0.mSelectedId
            if (r1 == 0) goto L_0x0343
            com.ss.android.ugc.aweme.shortvideo.b.b r1 = r11.q
            int r0 = r0.mSelectedId
            com.ss.android.ugc.aweme.filter.h r0 = com.ss.android.ugc.aweme.filter.y.a(r0)
            java.lang.String r0 = r0.j
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.a((java.lang.String) r0, (float) r2)
        L_0x0343:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.av.video.k.a(com.ss.android.ugc.aweme.shortvideo.edit.cb, android.arch.lifecycle.LifecycleOwner, android.view.SurfaceView):dmt.av.video.ad");
    }

    public final ei<SynthetiseResult> a(cb cbVar, VEWatermarkParam vEWatermarkParam, CancellationSignal cancellationSignal) {
        if (PatchProxy.isSupport(new Object[]{cbVar, vEWatermarkParam, cancellationSignal}, this, f83011a, false, 91967, new Class[]{cb.class, VEWatermarkParam.class, CancellationSignal.class}, ei.class)) {
            return (ei) PatchProxy.accessDispatch(new Object[]{cbVar, vEWatermarkParam, cancellationSignal}, this, f83011a, false, 91967, new Class[]{cb.class, VEWatermarkParam.class, CancellationSignal.class}, ei.class);
        }
        final cb cbVar2 = cbVar;
        final VEWatermarkParam vEWatermarkParam2 = vEWatermarkParam;
        final CancellationSignal cancellationSignal2 = cancellationSignal;
        AnonymousClass1 r0 = new ei<SynthetiseResult>("VECompiler") {
            {
                final ad a2 = k.a(cbVar2, (LifecycleOwner) k.this, (SurfaceView) null);
                final SynthetiseResult synthetiseResult = new SynthetiseResult();
                synthetiseResult.draftHardEncode = cbVar2.mHardEncode;
                synthetiseResult.outputFile = cbVar2.getOutputFile();
                synthetiseResult.needRecode = k.b(cbVar2);
                synthetiseResult.flags |= 1;
                synthetiseResult.isEnableFpsSet = com.ss.android.ugc.aweme.port.in.a.L.a(e.a.EnableSyntheticFpsSet);
                synthetiseResult.inputVideoFile = cbVar2.getInputVideoFile();
                synthetiseResult.videoWidth = cbVar2.mVideoWidth;
                synthetiseResult.videoHeight = cbVar2.mVideoHeight;
                synthetiseResult.texts = cbVar2.texts;
                synthetiseResult.isFastImport = cbVar2.isFastImport;
                synthetiseResult.fastImportResolution = cbVar2.fastImportResolution;
                if (synthetiseResult.isFastImport && cbVar2.previewConfigure != null) {
                    ArrayList arrayList = new ArrayList(cbVar2.previewConfigure.getVideoSegments().size());
                    for (VEVideoSegment next : cbVar2.previewConfigure.getVideoSegments()) {
                        arrayList.add(new h(next.videoPath, next.width, next.height, next.duration));
                    }
                    ap.f66376b.a(arrayList, a2.q);
                }
                b.a((p) a2.q, cbVar2.mainBusinessData);
                a2.q.c(k.this.f83014d);
                a2.q.a((m) new m() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f83018a;

                    public final void a(int i, int i2, float f2, String str) {
                        int i3 = i;
                        int i4 = i2;
                        String str2 = str;
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), str2}, this, f83018a, false, 91974, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), str2}, this, f83018a, false, 91974, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, String.class}, Void.TYPE);
                            return;
                        }
                        SynthetiseResult clone = synthetiseResult.clone();
                        clone.ret = i3;
                        AnonymousClass1 r1 = AnonymousClass1.this;
                        if (r1.a((Throwable) new gq("VECompiler failed. type = " + i3 + " ext = " + i4 + " f = " + f2 + " msg = " + str2, clone))) {
                            if (i4 == -214) {
                                f.a(true);
                            }
                            a2.q.k();
                        }
                    }
                });
                a2.q.b((m) new m() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f83022a;

                    /* renamed from: b  reason: collision with root package name */
                    AtomicInteger f83023b = new AtomicInteger(0);

                    public final void a(int i, int i2, float f2, String str) {
                        int i3;
                        int i4 = i;
                        int i5 = i2;
                        float f3 = f2;
                        boolean z = false;
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), str}, this, f83022a, false, 91976, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), str}, this, f83022a, false, 91976, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, String.class}, Void.TYPE);
                            return;
                        }
                        if (vEWatermarkParam2 == null) {
                            i3 = 0;
                        } else {
                            i3 = 1;
                        }
                        if (i4 == 4103) {
                            ai.d("TE_INFO_COMPILE_DONE ext:" + i5 + " videoExt:" + i3 + " isDone():" + AnonymousClass1.this.isDone());
                        } else if (i4 == 4118) {
                            String str2 = "TE_INFO_HW_FAILED_TRY_SW_COMPILE ext:" + i5 + " videoExt:" + i3;
                            ai.b(str2);
                            n.a("aweme_synthesis_compile_log_vesdk", bi.a().a("log", str2).b());
                        }
                        if (!AnonymousClass1.this.isDone()) {
                            if (i4 == 4103) {
                                if (i5 == 0) {
                                    synthetiseResult.videoLength = f3;
                                }
                                if (PatchProxy.isSupport(new Object[0], this, f83022a, false, 91975, new Class[0], Boolean.TYPE)) {
                                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f83022a, false, 91975, new Class[0], Boolean.TYPE)).booleanValue();
                                } else if (vEWatermarkParam2 == null || this.f83023b.incrementAndGet() == 2) {
                                    z = true;
                                }
                                if (z) {
                                    synthetiseResult.fileFps = (double) ah.b(cbVar2.mOutputFile);
                                    try {
                                        new e().a(cbVar2);
                                        if (cbVar2.isSaveLocalWithoutWaterMark()) {
                                            com.ss.android.ugc.aweme.video.b.e(fg.k);
                                            com.ss.android.ugc.aweme.video.b.c(synthetiseResult.outputFile, cbVar2.getLocalTempPath());
                                        }
                                    } catch (Throwable unused) {
                                    }
                                    if (AnonymousClass1.this.b(synthetiseResult)) {
                                        i.a((Callable<TResult>) new l<TResult>(a2));
                                    }
                                }
                            } else if (i4 == 4105 && i5 == i3) {
                                AnonymousClass1.this.a((int) (100.0f * f3));
                            } else if (i4 == 4112) {
                                synthetiseResult.synthetiseCPUEncode = i5 ^ 1;
                            } else if (i4 == 4113) {
                                synthetiseResult.audioLength = f3;
                            } else if (i4 == 4114) {
                                i.a((Callable<TResult>) new m<TResult>(this, i4, i5, f3), i.f1052b);
                            }
                        }
                    }
                });
                cancellationSignal2.setOnCancelListener(new VECompiler$1$3(this, synthetiseResult, a2));
                try {
                    final VEVideoEncodeSettings a3 = k.a(cbVar2, synthetiseResult, vEWatermarkParam2);
                    a2.q.a("isFastImport", String.valueOf(cbVar2.isFastImport ? 1 : 0));
                    if (com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.VideoSynthesisOpt)) {
                        ThreadPlus.submitRunnable(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f83027a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f83027a, false, 91980, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f83027a, false, 91980, new Class[0], Void.TYPE);
                                    return;
                                }
                                a2.q.a(cbVar2.getOutputFile(), (String) null, a3);
                            }
                        });
                    } else {
                        a2.q.a(cbVar2.getOutputFile(), (String) null, a3);
                    }
                } catch (Throwable th) {
                    a(th);
                }
            }
        };
        l.a(r0, new gs(), i.f1052b);
        l.a(r0, new gt(cbVar.getOutputFile(), (long) cbVar.getVideoLength()), i.f1052b);
        l.a(r0, new gp(), i.f1052b);
        l.a(r0, new gr(this.f83013c), i.f1052b);
        return r0;
    }
}

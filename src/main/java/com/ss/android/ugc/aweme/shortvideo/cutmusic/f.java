package com.ss.android.ugc.aweme.shortvideo.cutmusic;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ttve.model.VEMusicWaveBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.d;
import com.ss.android.ugc.aweme.shortvideo.e;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.vesdk.VEUtils;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 12\u00020\u0001:\u000201B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0017J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017J\u0010\u0010\u001d\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u001a\u0010\u001e\u001a\u00020\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"J\"\u0010\u001e\u001a\u00020\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\"J\u000e\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020&J\u0016\u0010'\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010(\u001a\u00020)J(\u0010*\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004J\u000e\u0010-\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&J\u000e\u0010.\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\u0004R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u001e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u001e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u000e\u0010\u000e\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cutmusic/MusicWaveHelper;", "", "()V", "<set-?>", "", "itemCountdownSpace", "getItemCountdownSpace", "()I", "itemHeigth", "getItemHeigth", "itemSpace", "getItemSpace", "itemWidth", "getItemWidth", "screenWidth", "videoLength", "calculateItemCount", "", "bean", "Lcom/ss/android/ugc/aweme/shortvideo/AVMusicWaveBean;", "", "musicLength", "cloneBean", "Lcom/ss/android/ugc/aweme/shortvideo/AVMusic;", "convertMusicWaveBean", "veMusicWaveBean", "Lcom/ss/android/ttve/model/VEMusicWaveBean;", "convertWaveDataList", "music", "filterLowData", "getAudioWaveData", "musicPath", "", "listener", "Lcom/ss/android/ugc/aweme/shortvideo/cutmusic/MusicWaveHelper$AudioWaveDataListener;", "requestType", "getCountDownItemCount", "context", "Landroid/content/Context;", "getCutMusicItemCountFromMusicLength", "isDefault", "", "getMusicSegmentWaveData", "musicStart", "segmentLength", "setItemSize", "setVideoLength", "length", "AudioWaveDataListener", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66694a;
    public static volatile f g = new f();
    public static final b h = new b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public int f66695b;

    /* renamed from: c  reason: collision with root package name */
    public int f66696c;

    /* renamed from: d  reason: collision with root package name */
    public int f66697d;

    /* renamed from: e  reason: collision with root package name */
    public int f66698e;

    /* renamed from: f  reason: collision with root package name */
    public int f66699f;
    private int i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cutmusic/MusicWaveHelper$AudioWaveDataListener;", "", "onFinish", "", "bean", "Lcom/ss/android/ugc/aweme/shortvideo/AVMusicWaveBean;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        void a(@Nullable com.ss.android.ugc.aweme.shortvideo.f fVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0014\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0007J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\r8FX\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cutmusic/MusicWaveHelper$Companion;", "", "()V", "ALL_MUSIC_LENGTH_POINT_COUNT", "", "COUNTDOWN_MARGIN", "ITEM_COUNTDOWN_SPACE", "ITEM_HEIGTH", "ITEM_SPACE", "ITEM_WIDTH", "MIN_ITEM_VALUE", "", "instance", "Lcom/ss/android/ugc/aweme/shortvideo/cutmusic/MusicWaveHelper;", "instance$annotations", "getInstance", "()Lcom/ss/android/ugc/aweme/shortvideo/cutmusic/MusicWaveHelper;", "mInstance", "filterNaNValueArray", "", "musicWaveBean", "Lcom/ss/android/ttve/model/VEMusicWaveBean;", "getFormatTimeString", "", "time", "", "getMusicBubbleTextAttritube", "Lcom/ss/android/ugc/aweme/shortvideo/cutmusic/DmtBubbleTextView$BubbleTextViewAttribute;", "context", "Landroid/content/Context;", "isValidArray", "", "array", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66700a;

        private b() {
        }

        @NotNull
        public static f a() {
            return f.g;
        }

        public /* synthetic */ b(byte b2) {
            this();
        }

        @JvmStatic
        public static boolean a(@Nullable float[] fArr) {
            boolean z;
            if (fArr != null) {
                if (fArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return false;
                }
                return true;
            }
            return false;
        }

        @JvmStatic
        public final void a(@Nullable VEMusicWaveBean vEMusicWaveBean) {
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{vEMusicWaveBean}, this, f66700a, false, 76125, new Class[]{VEMusicWaveBean.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{vEMusicWaveBean}, this, f66700a, false, 76125, new Class[]{VEMusicWaveBean.class}, Void.TYPE);
                return;
            }
            if (vEMusicWaveBean != null) {
                float[] waveBean = vEMusicWaveBean.getWaveBean();
                if (waveBean != null) {
                    Intrinsics.checkExpressionValueIsNotNull(waveBean, AdvanceSetting.NETWORK_TYPE);
                    if (waveBean.length != 0) {
                        z = false;
                    }
                    if (!z) {
                        int length = waveBean.length;
                        for (int i = 0; i < length; i++) {
                            if (Float.isNaN(waveBean[i])) {
                                waveBean[i] = 0.0f;
                            }
                        }
                    }
                }
            }
        }

        @JvmStatic
        @NotNull
        public final d.a a(@Nullable Context context) {
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2}, this, f66700a, false, 76126, new Class[]{Context.class}, d.a.class)) {
                return (d.a) PatchProxy.accessDispatch(new Object[]{context2}, this, f66700a, false, 76126, new Class[]{Context.class}, d.a.class);
            }
            d.a aVar = new d.a();
            if (context2 == null) {
                return aVar;
            }
            aVar.f66690c = (int) UIUtils.dip2Px(context2, 16.0f);
            aVar.f66689b = (int) UIUtils.dip2Px(context2, 6.0f);
            aVar.f66688a = (int) UIUtils.dip2Px(context2, 10.0f);
            aVar.h = -1073741824;
            aVar.g = -1;
            aVar.f66692e = (int) UIUtils.dip2Px(context2, 4.0f);
            aVar.f66693f = (int) UIUtils.dip2Px(context2, 2.0f);
            aVar.i = (int) UIUtils.dip2Px(context2, 11.0f);
            aVar.f66691d = (int) UIUtils.dip2Px(context2, 8.0f);
            return aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "obj", "", "kotlin.jvm.PlatformType", "onFinish"}, k = 3, mv = {1, 1, 15})
    static final class c implements IAVService.MusicWaveDataListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66701a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f66702b;

        c(a aVar) {
            this.f66702b = aVar;
        }

        public final void onFinish(Object obj) {
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{obj}, this, f66701a, false, 76127, new Class[]{Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{obj}, this, f66701a, false, 76127, new Class[]{Object.class}, Void.TYPE);
                return;
            }
            StringBuilder sb = new StringBuilder("OLD_DRAFT AudioWaveDataIsNull:");
            if (obj != null) {
                z = false;
            }
            sb.append(z);
            ai.a(sb.toString());
            if (this.f66702b != null) {
                if (obj == null || !(obj instanceof com.ss.android.ugc.aweme.shortvideo.f)) {
                    this.f66702b.a(null);
                } else {
                    this.f66702b.a((com.ss.android.ugc.aweme.shortvideo.f) obj);
                }
            }
        }
    }

    @NotNull
    public static final f a() {
        return PatchProxy.isSupport(new Object[0], null, f66694a, true, 76119, new Class[0], f.class) ? (f) PatchProxy.accessDispatch(new Object[0], null, f66694a, true, 76119, new Class[0], f.class) : b.a();
    }

    @JvmStatic
    public static final boolean a(@Nullable float[] fArr) {
        if (!PatchProxy.isSupport(new Object[]{fArr}, null, f66694a, true, 76121, new Class[]{float[].class}, Boolean.TYPE)) {
            return b.a(fArr);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{fArr}, null, f66694a, true, 76121, new Class[]{float[].class}, Boolean.TYPE)).booleanValue();
    }

    @JvmStatic
    @NotNull
    public static final d.a c(@Nullable Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f66694a, true, 76123, new Class[]{Context.class}, d.a.class)) {
            return h.a(context2);
        }
        return (d.a) PatchProxy.accessDispatch(new Object[]{context2}, null, f66694a, true, 76123, new Class[]{Context.class}, d.a.class);
    }

    public final void a(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f66694a, false, 76108, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f66694a, false, 76108, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f66695b = (int) UIUtils.dip2Px(context, 3.0f);
        this.f66696c = (int) UIUtils.dip2Px(context, 2.0f);
        this.f66697d = (int) UIUtils.dip2Px(context, 90.0f);
        this.f66698e = (int) UIUtils.dip2Px(context, 2.0f);
        this.i = UIUtils.getScreenWidth(context);
    }

    public final void a(@Nullable String str, @Nullable a aVar) {
        String str2 = str;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str2, aVar2}, this, f66694a, false, 76110, new Class[]{String.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, aVar2}, this, f66694a, false, 76110, new Class[]{String.class, a.class}, Void.TYPE);
            return;
        }
        a(str2, 6, aVar2);
    }

    public final void a(@Nullable String str, int i2, @Nullable a aVar) {
        String str2 = str;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i2), aVar2}, this, f66694a, false, 76111, new Class[]{String.class, Integer.TYPE, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i2), aVar2}, this, f66694a, false, 76111, new Class[]{String.class, Integer.TYPE, a.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str2)) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).getAvMusicWaveBean(str2, false, new c(aVar2));
        } else if (aVar2 != null) {
            aVar2.a(null);
        }
    }

    public final void a(@Nullable com.ss.android.ugc.aweme.shortvideo.f fVar, int i2, int i3, int i4) {
        com.ss.android.ugc.aweme.shortvideo.f fVar2 = fVar;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{fVar2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f66694a, false, 76114, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f66694a, false, 76114, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (fVar2 != null) {
            float[] musicWavePointArray = fVar.getMusicWavePointArray();
            if (musicWavePointArray == null) {
                Intrinsics.throwNpe();
            }
            float f2 = (float) i4;
            int length = (int) (((((float) musicWavePointArray.length) * 1.0f) * ((float) i2)) / f2);
            float[] musicWavePointArray2 = fVar.getMusicWavePointArray();
            if (musicWavePointArray2 == null) {
                Intrinsics.throwNpe();
            }
            int length2 = (int) (((((float) musicWavePointArray2.length) * 1.0f) * ((float) i3)) / f2);
            if (length2 > 0) {
                float[] fArr = new float[length2];
                float[] musicWavePointArray3 = fVar.getMusicWavePointArray();
                if (musicWavePointArray3 == null) {
                    Intrinsics.throwNpe();
                }
                int length3 = musicWavePointArray3.length;
                int i5 = length2 + length;
                int i6 = length;
                while (i6 < i5 && i6 < length3) {
                    fArr[i6 - length] = fVar.getMusicWavePointArray()[i6];
                    i6++;
                    z = true;
                }
                if (b.a(fArr) && z) {
                    fVar2.setMusicWavePointArray(fArr);
                }
            }
        }
    }

    public final void a(@Nullable com.ss.android.ugc.aweme.shortvideo.f fVar, long j, long j2) {
        com.ss.android.ugc.aweme.shortvideo.f fVar2 = fVar;
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{fVar2, new Long(j3), new Long(j4)}, this, f66694a, false, 76115, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.class, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {fVar2, new Long(j3), new Long(j4)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f66694a, false, 76115, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.class, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        if (j3 > 0) {
            this.f66699f = (int) j3;
        }
        int a2 = b.a().a((int) j4, false);
        if (fVar2 != null && b.a(fVar.getMusicWavePointArray()) && a2 > 0) {
            float[] musicWavePointArray = fVar.getMusicWavePointArray();
            if (musicWavePointArray == null) {
                Intrinsics.throwNpe();
            }
            if (musicWavePointArray.length > a2) {
                VEMusicWaveBean resampleMusicWaveData = VEUtils.getResampleMusicWaveData(fVar.getMusicWavePointArray(), 0, a2);
                h.a(resampleMusicWaveData);
                if (resampleMusicWaveData != null && b.a(resampleMusicWaveData.getWaveBean())) {
                    float[] waveBean = resampleMusicWaveData.getWaveBean();
                    Intrinsics.checkExpressionValueIsNotNull(waveBean, "musicWaveBean.waveBean");
                    float[] copyOf = Arrays.copyOf(waveBean, waveBean.length);
                    Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
                    fVar2.setMusicWavePointArray(copyOf);
                }
            }
        }
    }

    public final int b(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f66694a, false, 76109, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context}, this, f66694a, false, 76109, new Class[]{Context.class}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(context, "context");
        return ((UIUtils.getScreenWidth(context) - ((int) UIUtils.dip2Px(context, 20.0f))) + this.f66698e) / (this.f66698e + this.f66696c);
    }

    public final void b(@Nullable com.ss.android.ugc.aweme.shortvideo.f fVar) {
        if (PatchProxy.isSupport(new Object[]{fVar}, this, f66694a, false, 76116, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, f66694a, false, 76116, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.class}, Void.TYPE);
            return;
        }
        if (fVar != null && b.a(fVar.getMusicWavePointArray())) {
            int length = fVar.getMusicWavePointArray().length;
            for (int i2 = 0; i2 < length; i2++) {
                if (fVar.getMusicWavePointArray()[i2] < 0.1f) {
                    fVar.getMusicWavePointArray()[i2] = 0.1f;
                }
            }
        }
    }

    @Nullable
    public final com.ss.android.ugc.aweme.shortvideo.f a(@Nullable VEMusicWaveBean vEMusicWaveBean) {
        VEMusicWaveBean vEMusicWaveBean2 = vEMusicWaveBean;
        if (PatchProxy.isSupport(new Object[]{vEMusicWaveBean2}, this, f66694a, false, 76117, new Class[]{VEMusicWaveBean.class}, com.ss.android.ugc.aweme.shortvideo.f.class)) {
            return (com.ss.android.ugc.aweme.shortvideo.f) PatchProxy.accessDispatch(new Object[]{vEMusicWaveBean2}, this, f66694a, false, 76117, new Class[]{VEMusicWaveBean.class}, com.ss.android.ugc.aweme.shortvideo.f.class);
        } else if (vEMusicWaveBean2 == null || !b.a(vEMusicWaveBean.getWaveBean())) {
            return null;
        } else {
            h.a(vEMusicWaveBean2);
            com.ss.android.ugc.aweme.shortvideo.f fVar = new com.ss.android.ugc.aweme.shortvideo.f();
            float[] waveBean = vEMusicWaveBean.getWaveBean();
            Intrinsics.checkExpressionValueIsNotNull(waveBean, "veMusicWaveBean.waveBean");
            float[] copyOf = Arrays.copyOf(waveBean, waveBean.length);
            Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
            fVar.setMusicWavePointArray(copyOf);
            return fVar;
        }
    }

    @Nullable
    public final com.ss.android.ugc.aweme.shortvideo.f a(@Nullable e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f66694a, false, 76113, new Class[]{e.class}, com.ss.android.ugc.aweme.shortvideo.f.class)) {
            return (com.ss.android.ugc.aweme.shortvideo.f) PatchProxy.accessDispatch(new Object[]{eVar}, this, f66694a, false, 76113, new Class[]{e.class}, com.ss.android.ugc.aweme.shortvideo.f.class);
        } else if (eVar == null || !b.a(eVar.getMusicWaveData())) {
            return null;
        } else {
            com.ss.android.ugc.aweme.shortvideo.f fVar = new com.ss.android.ugc.aweme.shortvideo.f();
            float[] musicWaveData = eVar.getMusicWaveData();
            Intrinsics.checkExpressionValueIsNotNull(musicWaveData, "bean.musicWaveData");
            float[] copyOf = Arrays.copyOf(musicWaveData, musicWaveData.length);
            Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
            fVar.setMusicWavePointArray(copyOf);
            return fVar;
        }
    }

    @Nullable
    public final com.ss.android.ugc.aweme.shortvideo.f a(@Nullable com.ss.android.ugc.aweme.shortvideo.f fVar) {
        if (PatchProxy.isSupport(new Object[]{fVar}, this, f66694a, false, 76112, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.class}, com.ss.android.ugc.aweme.shortvideo.f.class)) {
            return (com.ss.android.ugc.aweme.shortvideo.f) PatchProxy.accessDispatch(new Object[]{fVar}, this, f66694a, false, 76112, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.class}, com.ss.android.ugc.aweme.shortvideo.f.class);
        } else if (fVar == null || !b.a(fVar.getMusicWavePointArray())) {
            return fVar;
        } else {
            com.ss.android.ugc.aweme.shortvideo.f fVar2 = new com.ss.android.ugc.aweme.shortvideo.f();
            float[] musicWavePointArray = fVar.getMusicWavePointArray();
            float[] copyOf = Arrays.copyOf(musicWavePointArray, musicWavePointArray.length);
            Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
            fVar2.setMusicWavePointArray(copyOf);
            return fVar2;
        }
    }

    public final int a(int i2, boolean z) {
        if (this.f66699f <= 0) {
            return 2000;
        }
        int i3 = (int) (((float) ((this.i + this.f66696c) / (this.f66695b + this.f66696c))) * 1.0f * ((((float) i2) * 1.0f) / ((float) this.f66699f)));
        if (z && i3 < 2000) {
            i3 = 2000;
        }
        return i3;
    }
}

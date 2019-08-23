package com.ss.android.ugc.aweme.shortvideo.j;

import android.content.Context;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.medialib.f;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform;
import com.ss.android.ugc.aweme.filter.au;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.filter.u;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.language.I18nManagerService;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.ff;
import com.ss.android.ugc.aweme.shortvideo.ho;
import dmt.av.video.b.l;
import dmt.av.video.b.y;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class e implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68244a;

    /* renamed from: b  reason: collision with root package name */
    dmt.av.video.b.a f68245b;

    /* renamed from: c  reason: collision with root package name */
    public MediaRecordPresenter f68246c;

    /* renamed from: d  reason: collision with root package name */
    a f68247d = a.f68242b;

    /* renamed from: e  reason: collision with root package name */
    int f68248e;

    /* renamed from: f  reason: collision with root package name */
    String f68249f;
    String g;
    private boolean h;
    private int i = -1;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68250a;

        /* renamed from: b  reason: collision with root package name */
        int f68251b;

        /* renamed from: c  reason: collision with root package name */
        int f68252c;

        /* renamed from: d  reason: collision with root package name */
        String f68253d;

        /* renamed from: e  reason: collision with root package name */
        int f68254e;

        /* renamed from: f  reason: collision with root package name */
        int f68255f;
        int g;
        String h;
        Context i;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f68250a, false, 78472, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f68250a, false, 78472, new Class[0], Void.TYPE);
                return;
            }
            StringBuilder sb = new StringBuilder("sdk initFaceBeautyPlay() ");
            sb.append(Arrays.toString(new String[]{"width=" + this.f68251b, " height=" + this.f68252c, " path=" + this.f68253d, " outputHeight=" + this.f68255f, " outputWidth=" + this.f68254e, " stStickerPath=" + this.h}));
            com.ss.android.ugc.aweme.util.c.a(sb.toString());
            ((ho) com.ss.android.ugc.aweme.common.g.a.a(this.i, ho.class)).a();
            e.this.f68246c.a(this.i);
            e.this.f68245b.b().a(this.f68251b, this.f68252c, this.f68253d, this.f68255f, this.f68254e, "", this.g, com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.EnableEffectNewEngine));
            MediaRecordPresenter mediaRecordPresenter = e.this.f68246c;
            boolean a2 = com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.CameraOptionFlagsOpt) ^ true;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(a2 ? (byte) 1 : 0)}, mediaRecordPresenter, MediaRecordPresenter.f29728a, false, 17686, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                MediaRecordPresenter mediaRecordPresenter2 = mediaRecordPresenter;
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(a2)}, mediaRecordPresenter2, MediaRecordPresenter.f29728a, false, 17686, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else {
                mediaRecordPresenter.j.enableAbandonFirstFrame(a2);
            }
            e.this.f68246c.e(true);
            MediaRecordPresenter mediaRecordPresenter3 = e.this.f68246c;
            if (PatchProxy.isSupport(new Object[]{3}, mediaRecordPresenter3, MediaRecordPresenter.f29728a, false, 17718, new Class[]{Integer.TYPE}, Void.TYPE)) {
                MediaRecordPresenter mediaRecordPresenter4 = mediaRecordPresenter3;
                PatchProxy.accessDispatch(new Object[]{3}, mediaRecordPresenter4, MediaRecordPresenter.f29728a, false, 17718, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                mediaRecordPresenter3.j.setForceAlgorithmCnt(3);
            }
            e.this.f68246c.c(1);
        }

        public final a a(int i2) {
            this.f68251b = i2;
            return this;
        }

        public final a b(int i2) {
            this.f68252c = i2;
            return this;
        }

        public final a c(int i2) {
            this.f68254e = i2;
            return this;
        }

        public final a d(int i2) {
            this.f68255f = i2;
            return this;
        }

        public final a e(int i2) {
            this.g = i2;
            return this;
        }

        a() {
        }

        public final a a(Context context) {
            this.i = context;
            return this;
        }

        public final a a(String str) {
            this.f68253d = str;
            return this;
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68256a;

        /* renamed from: b  reason: collision with root package name */
        public Context f68257b;

        /* renamed from: c  reason: collision with root package name */
        public String f68258c;

        /* renamed from: d  reason: collision with root package name */
        public String f68259d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f68260e;

        /* renamed from: f  reason: collision with root package name */
        public float f68261f;
        public float g;
        public float h;

        public b() {
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68262a;

        /* renamed from: b  reason: collision with root package name */
        String f68263b;

        /* renamed from: c  reason: collision with root package name */
        String f68264c;

        /* renamed from: d  reason: collision with root package name */
        String f68265d;

        /* renamed from: e  reason: collision with root package name */
        y f68266e;

        public final c a(y yVar) {
            this.f68266e = yVar;
            return this;
        }

        public final c b(String str) {
            this.f68264c = str;
            return this;
        }

        public final c c(String str) {
            this.f68265d = str;
            return this;
        }

        public final c a(String str) {
            this.f68263b = str;
            return this;
        }

        public final void a(c cVar) {
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f68262a, false, 78474, new Class[]{c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar}, this, f68262a, false, 78474, new Class[]{c.class}, Void.TYPE);
                return;
            }
            if (this.f68263b != null) {
                File file = new File(this.f68263b);
                if (file.exists()) {
                    file.delete();
                }
            }
            if (this.f68264c != null) {
                File file2 = new File(this.f68264c);
                if (file2.exists()) {
                    file2.delete();
                }
            }
            this.f68266e.a(this.f68263b, this.f68264c, this.f68265d, "", (Function1<? super l, Unit>) new f<Object,Unit>(new WeakReference(cVar), cVar));
        }
    }

    private static int b(float f2) {
        return f2 < 0.0f ? -1 : 1;
    }

    public final void a(String str, float f2, float f3) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Float.valueOf(f2), Float.valueOf(f3)}, this, f68244a, false, 78448, new Class[]{String.class, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Float.valueOf(f2), Float.valueOf(f3)}, this, f68244a, false, 78448, new Class[]{String.class, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.f68246c.b(3, str);
        float f4 = f2;
        this.f68246c.a(f2, f3);
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f68244a, false, 78459, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f68244a, false, 78459, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f68246c.c(str);
        this.g = str;
    }

    public final void a(boolean z) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f68244a, false, 78461, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f68244a, false, 78461, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.h != z) {
            this.h = z;
            if (this.i != -1) {
                if (this.i != 1) {
                    z2 = false;
                }
                b(z2);
            }
            if (!(this.j == 0.0f && this.k == 0.0f)) {
                b(this.j, this.k);
            }
            if (!(this.l == 0.0f && this.m == 0.0f)) {
                c(this.l, this.m);
            }
        }
    }

    public final void a(a aVar, float f2) {
        int i2;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2, Float.valueOf(f2)}, this, f68244a, false, 78467, new Class[]{a.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, Float.valueOf(f2)}, this, f68244a, false, 78467, new Class[]{a.class, Float.TYPE}, Void.TYPE);
            return;
        }
        int b2 = b(f2);
        int i3 = aVar2.f68243c;
        if (b2 == -1) {
            int i4 = i3 - 1;
            if (i4 < 0) {
                i4 = 0;
            }
            int i5 = i3;
            i3 = i4;
            i2 = i5;
        } else {
            int size = com.ss.android.ugc.aweme.filter.y.b().size();
            int i6 = i3 + 1;
            i2 = i6 >= size ? size - 1 : i6;
        }
        String a2 = au.a(i3);
        String a3 = au.a(i2);
        if (this.f68248e == 2) {
            if (i3 == 0) {
                a2 = ff.s + "beautify_filter";
            }
            if (i2 == 0) {
                a3 = ff.s + "beautify_filter";
            }
        }
        float abs = f2 < 0.0f ? Math.abs(f2) : 1.0f - f2;
        this.f68247d = aVar2;
        this.f68246c.a(a2, a3, abs);
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f68244a, false, 78469, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f68244a, false, 78469, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.f68247d = aVar;
        if (aVar.f68243c == 0 && this.f68248e == 2) {
            i();
            return;
        }
        this.f68246c.c(aVar.a());
    }

    public final float c() {
        if (!PatchProxy.isSupport(new Object[0], this, f68244a, false, 78455, new Class[0], Float.TYPE)) {
            return (((float) com.ss.android.ugc.aweme.port.in.a.L.b(e.a.UserBigEyeLevel)) * 1.0f) / 100.0f;
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, f68244a, false, 78455, new Class[0], Float.TYPE)).floatValue();
    }

    public final float d() {
        if (!PatchProxy.isSupport(new Object[0], this, f68244a, false, 78456, new Class[0], Float.TYPE)) {
            return (((float) com.ss.android.ugc.aweme.port.in.a.L.b(e.a.UserShapeLevel)) * 1.0f) / 100.0f;
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, f68244a, false, 78456, new Class[0], Float.TYPE)).floatValue();
    }

    public final float e() {
        if (!PatchProxy.isSupport(new Object[0], this, f68244a, false, 78457, new Class[0], Float.TYPE)) {
            return (((float) com.ss.android.ugc.aweme.port.in.a.L.b(e.a.UserSmoothSkinLevel)) * 1.0f) / 100.0f;
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, f68244a, false, 78457, new Class[0], Float.TYPE)).floatValue();
    }

    public final a f() {
        if (!PatchProxy.isSupport(new Object[0], this, f68244a, false, 78462, new Class[0], a.class)) {
            return new a();
        }
        return (a) PatchProxy.accessDispatch(new Object[0], this, f68244a, false, 78462, new Class[0], a.class);
    }

    public final c g() {
        if (!PatchProxy.isSupport(new Object[0], this, f68244a, false, 78463, new Class[0], c.class)) {
            return new c();
        }
        return (c) PatchProxy.accessDispatch(new Object[0], this, f68244a, false, 78463, new Class[0], c.class);
    }

    private int h() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f68244a, false, 78466, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f68244a, false, 78466, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.h) {
            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str = PushConstants.PUSH_TYPE_UPLOAD_LOG;
        }
        if (UlikeBeautyPlatform.a(str, PushConstants.PUSH_TYPE_THROUGH_MESSAGE)) {
            return 3;
        }
        int b2 = com.ss.android.ugc.aweme.port.in.a.L.b(e.a.BeautyModel);
        if (b2 == 0) {
            b2 = 1;
        }
        return b2;
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, f68244a, false, 78470, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68244a, false, 78470, new Class[0], Void.TYPE);
        } else if (((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).isKorean()) {
            MediaRecordPresenter mediaRecordPresenter = this.f68246c;
            mediaRecordPresenter.c(au.f47528f + "beautify_filter_korean/");
        } else {
            MediaRecordPresenter mediaRecordPresenter2 = this.f68246c;
            mediaRecordPresenter2.c(au.f47528f + "beautify_filter/");
        }
    }

    public final float a() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f68244a, false, 78453, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f68244a, false, 78453, new Class[0], Float.TYPE)).floatValue();
        }
        if (UlikeBeautyPlatform.a(PushConstants.PUSH_TYPE_UPLOAD_LOG, "3")) {
            i2 = com.ss.android.ugc.aweme.port.in.a.L.b(e.a.UserLipLevel);
        }
        return (((float) i2) * 1.0f) / 100.0f;
    }

    public final float b() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f68244a, false, 78454, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f68244a, false, 78454, new Class[0], Float.TYPE)).floatValue();
        }
        if (UlikeBeautyPlatform.a(PushConstants.PUSH_TYPE_UPLOAD_LOG, "3")) {
            i2 = com.ss.android.ugc.aweme.port.in.a.L.b(e.a.UserBlushLevel);
        }
        return (((float) i2) * 1.0f) / 100.0f;
    }

    private e(dmt.av.video.b.a aVar) {
        this.f68245b = aVar;
        this.f68246c = this.f68245b.f();
    }

    public static e a(dmt.av.video.b.a aVar) {
        dmt.av.video.b.a aVar2 = aVar;
        if (!PatchProxy.isSupport(new Object[]{aVar2}, null, f68244a, true, 78446, new Class[]{dmt.av.video.b.a.class}, e.class)) {
            return new e(aVar2);
        }
        return (e) PatchProxy.accessDispatch(new Object[]{aVar2}, null, f68244a, true, 78446, new Class[]{dmt.av.video.b.a.class}, e.class);
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f68244a, false, 78452, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f68244a, false, 78452, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.f68246c.a(9, f2);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f68244a, false, 78458, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f68244a, false, 78458, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a(new a(i2));
    }

    public final void b(boolean z) {
        String str;
        String str2;
        String str3;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f68244a, false, 78465, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f68244a, false, 78465, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.i = z ? 1 : 0;
        int h2 = h();
        if (z) {
            i2 = h2;
        }
        this.f68248e = i2;
        I18nManagerService i18nManagerService = (I18nManagerService) ServiceManager.get().getService(I18nManagerService.class);
        if (Build.VERSION.SDK_INT > 18) {
            if (this.h) {
                str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            } else {
                str2 = PushConstants.PUSH_TYPE_UPLOAD_LOG;
            }
            if (UlikeBeautyPlatform.a(str2, PushConstants.PUSH_TYPE_THROUGH_MESSAGE)) {
                if (this.h) {
                    str3 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                } else {
                    str3 = PushConstants.PUSH_TYPE_UPLOAD_LOG;
                }
                this.f68249f = UlikeBeautyPlatform.b(str3, PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                this.f68246c.a(this.n, this.o);
            } else if (!com.ss.android.g.a.a()) {
                this.f68249f = u.b();
                this.f68246c.a(this.n, this.o);
            } else if (i18nManagerService != null && i18nManagerService.isIndonesiaByMcc()) {
                this.f68249f = au.c(h2);
                this.f68246c.a(0.35f, 0.75f);
            } else if (i18nManagerService == null || !i18nManagerService.isKorean()) {
                this.f68249f = au.c(h2);
                this.f68246c.a(0.35f, 0.35f);
            } else {
                this.f68249f = au.d(h2);
                this.f68246c.a(0.35f, 0.45f);
            }
        }
        this.f68246c.b(i2, this.f68249f);
        if (com.ss.android.ugc.aweme.port.in.a.L.b(e.a.FaceDetectInterval) > 0) {
            this.f68246c.f(com.ss.android.ugc.aweme.port.in.a.L.b(e.a.FaceDetectInterval));
        }
        if (i18nManagerService != null && i18nManagerService.isKorean()) {
            if (this.h) {
                str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            } else {
                str = PushConstants.PUSH_TYPE_UPLOAD_LOG;
            }
            if (!UlikeBeautyPlatform.a(str, PushConstants.PUSH_TYPE_THROUGH_MESSAGE)) {
                if (z) {
                    f a2 = f.a();
                    a2.a(au.g + "facereshape_v2/", 0.2f, 0.2f);
                    return;
                }
                b(0.0f, 0.0f);
            }
        }
    }

    public final void c(float f2, float f3) {
        String str;
        float f4;
        float f5;
        String str2;
        String str3;
        String str4;
        String str5;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f68244a, false, 78460, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f68244a, false, 78460, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.l = f2;
        this.m = f3;
        if (this.h) {
            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str = PushConstants.PUSH_TYPE_UPLOAD_LOG;
        }
        if (UlikeBeautyPlatform.a(str, "3")) {
            if (this.h) {
                str3 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            } else {
                str3 = PushConstants.PUSH_TYPE_UPLOAD_LOG;
            }
            str2 = UlikeBeautyPlatform.b(str3, "3");
            if (this.h) {
                str4 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            } else {
                str4 = PushConstants.PUSH_TYPE_UPLOAD_LOG;
            }
            float b2 = com.ss.android.ugc.aweme.shortvideo.c.b.b(3, str4);
            if (b2 >= 0.0f) {
                f4 = f2 * b2;
            } else {
                f4 = f2;
            }
            if (this.h) {
                str5 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            } else {
                str5 = PushConstants.PUSH_TYPE_UPLOAD_LOG;
            }
            float b3 = com.ss.android.ugc.aweme.shortvideo.c.b.b(4, str5);
            if (b2 >= 0.0f) {
                f5 = f3 * b3;
                this.f68246c.b(str2, f4, f5);
            }
        } else {
            str2 = u.f47654b;
            f4 = f2;
        }
        f5 = f3;
        this.f68246c.b(str2, f4, f5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008f  */
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
            com.meituan.robust.ChangeQuickRedirect r2 = f68244a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 78447(0x1326f, float:1.09928E-40)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004f
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Float r1 = java.lang.Float.valueOf(r11)
            r0[r8] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r12)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f68244a
            r3 = 0
            r4 = 78447(0x1326f, float:1.09928E-40)
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
            r10.n = r11
            r10.o = r12
            boolean r0 = r10.h
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = "1"
            goto L_0x005c
        L_0x005a:
            java.lang.String r0 = "2"
        L_0x005c:
            java.lang.String r1 = "1"
            boolean r0 = com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform.a(r0, r1)
            r1 = 0
            if (r0 == 0) goto L_0x0079
            boolean r0 = r10.h
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = "1"
            goto L_0x006e
        L_0x006c:
            java.lang.String r0 = "2"
        L_0x006e:
            float r0 = com.ss.android.ugc.aweme.shortvideo.c.b.b(r8, r0)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 < 0) goto L_0x0079
            float r0 = r0 * r11
            goto L_0x007a
        L_0x0079:
            r0 = r11
        L_0x007a:
            com.ss.android.medialib.presenter.MediaRecordPresenter r2 = r10.f68246c
            r2.a((float) r0, (float) r12)
            float r0 = r0 - r1
            r1 = 981668463(0x3a83126f, float:0.001)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x008f
            com.ss.android.medialib.presenter.MediaRecordPresenter r0 = r10.f68246c
            java.lang.String r1 = ""
            r0.b((int) r8, (java.lang.String) r1)
            return
        L_0x008f:
            com.ss.android.medialib.presenter.MediaRecordPresenter r0 = r10.f68246c
            int r1 = r10.h()
            java.lang.String r2 = r10.f68249f
            r0.b((int) r1, (java.lang.String) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.j.e.a(float, float):void");
    }

    public final void b(float f2, float f3) {
        String str;
        String str2;
        String str3;
        String str4;
        float f4 = f2;
        float f5 = f3;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f68244a, false, 78450, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f68244a, false, 78450, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.j = f4;
        this.k = f5;
        if (f4 - 0.0f >= 0.001f || f5 - 0.0f >= 0.001f) {
            if (this.h) {
                str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            } else {
                str = PushConstants.PUSH_TYPE_UPLOAD_LOG;
            }
            if (UlikeBeautyPlatform.a(str, PushConstants.PUSH_TYPE_UPLOAD_LOG)) {
                if (this.h) {
                    str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                } else {
                    str2 = PushConstants.PUSH_TYPE_UPLOAD_LOG;
                }
                String b2 = UlikeBeautyPlatform.b(str2, PushConstants.PUSH_TYPE_UPLOAD_LOG);
                if (this.h) {
                    str3 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                } else {
                    str3 = PushConstants.PUSH_TYPE_UPLOAD_LOG;
                }
                float b3 = com.ss.android.ugc.aweme.shortvideo.c.b.b(1, str3);
                if (b3 >= 0.0f) {
                    f5 = b3 * f5;
                }
                if (this.h) {
                    str4 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                } else {
                    str4 = PushConstants.PUSH_TYPE_UPLOAD_LOG;
                }
                float b4 = com.ss.android.ugc.aweme.shortvideo.c.b.b(2, str4);
                if (b4 >= 0.0f) {
                    f4 *= b4;
                }
                if (PatchProxy.isSupport(new Object[]{b2, Float.valueOf(f4), Float.valueOf(f5)}, this, f68244a, false, 78471, new Class[]{String.class, Float.TYPE, Float.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{b2, Float.valueOf(f4), Float.valueOf(f5)}, this, f68244a, false, 78471, new Class[]{String.class, Float.TYPE, Float.TYPE}, Void.TYPE);
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put(4, Float.valueOf(f4));
                    hashMap.put(5, Float.valueOf(f5));
                    hashMap.put(30, Float.valueOf(f5));
                    hashMap.put(21, Float.valueOf(f5));
                    hashMap.put(24, Float.valueOf(f5));
                    hashMap.put(26, Float.valueOf(f5));
                    hashMap.put(29, Float.valueOf(f5));
                    this.f68246c.a(b2, (Map<Integer, Float>) hashMap);
                    return;
                }
            } else {
                this.f68246c.a(u.a(), f4, f5);
            }
            return;
        }
        this.f68246c.a("", 0.0f, 0.0f);
    }

    public final void b(String str, float f2, float f3) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Float.valueOf(f2), Float.valueOf(f3)}, this, f68244a, false, 78451, new Class[]{String.class, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Float.valueOf(f2), Float.valueOf(f3)}, this, f68244a, false, 78451, new Class[]{String.class, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.f68246c.a(str2, f2, f3);
    }

    public final void a(int i2, List<h> list, float f2) {
        int i3;
        int i4;
        float f3;
        List<h> list2 = list;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), list2, Float.valueOf(f2)}, this, f68244a, false, 78468, new Class[]{Integer.TYPE, List.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), list2, Float.valueOf(f2)}, this, f68244a, false, 78468, new Class[]{Integer.TYPE, List.class, Float.TYPE}, Void.TYPE);
            return;
        }
        if (b(f2) == -1) {
            int i5 = i2 - 1;
            if (i5 < 0) {
                i5 = 0;
            }
            i4 = i5;
            i3 = i2;
        } else {
            i3 = i2 + 1;
            if (i3 >= list.size()) {
                i3 = list.size() - 1;
            }
            i4 = i2;
        }
        String str = list2.get(i4).j;
        String str2 = list2.get(i3).j;
        if (f2 < 0.0f) {
            f3 = Math.abs(f2);
        } else {
            f3 = 1.0f - f2;
        }
        this.f68246c.a(str, str2, f3);
    }
}

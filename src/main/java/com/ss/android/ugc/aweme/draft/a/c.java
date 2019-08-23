package com.ss.android.ugc.aweme.draft.a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.common.utility.DigestUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.ExternalAVConstants;
import com.ss.android.ugc.aweme.effect.EffectListModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContextOld;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.e;
import com.ss.android.ugc.aweme.shortvideo.edit.q;
import com.ss.android.ugc.aweme.shortvideo.fg;
import com.ss.android.ugc.aweme.shortvideo.i.i;
import com.ss.android.ugc.aweme.shortvideo.j;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.SocialModel;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.aweme.video.b;
import com.ss.android.ugc.aweme.x.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43433a;
    public long A;
    public int B;
    public String C;
    @SerializedName("time")
    public long D;
    public String E;
    public int F;
    public int G;
    public String H;
    public String I;
    float[] J;
    public String K;
    public int L;
    public String M;
    public float N;
    public int O;
    public int P;
    public String Q;
    public String R;
    int S;
    public b T = new b();
    private volatile boolean U;
    @SerializedName("id")

    /* renamed from: b  reason: collision with root package name */
    public int f43434b;
    @SerializedName("aweme")

    /* renamed from: c  reason: collision with root package name */
    public a f43435c;
    @SerializedName("photoMovieContext")

    /* renamed from: d  reason: collision with root package name */
    public PhotoMovieContext f43436d;

    /* renamed from: e  reason: collision with root package name */
    public String f43437e;

    /* renamed from: f  reason: collision with root package name */
    public e f43438f;
    String g;
    public String h;
    public String i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public String p;
    public String q;
    public UrlModel r;
    public String s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public int y;
    public EffectListModel z;

    public final void a(String str) {
        this.T.x = str;
    }

    public final void a(boolean z2) {
        this.T.h = z2;
    }

    public final void a(i iVar) {
        this.T.k = iVar;
    }

    public final void a(ExtractFramesModel extractFramesModel) {
        this.T.w = extractFramesModel;
    }

    public final void a(AVUploadSaveModel aVUploadSaveModel) {
        this.T.y = aVUploadSaveModel;
    }

    public final void a(q qVar) {
        this.T.C = qVar;
    }

    public final void a(List<String> list) {
        this.T.E = list;
    }

    public final void a(SocialModel socialModel) {
        this.T.H = socialModel;
    }

    public final void a(a aVar) {
        this.T.K = aVar;
    }

    public final void a(j jVar) {
        this.T.L = jVar;
    }

    public final String A() {
        return this.T.l;
    }

    public final com.ss.android.ugc.aweme.n.a B() {
        return this.T.z;
    }

    public final q C() {
        return this.T.C;
    }

    public final int D() {
        return this.T.D;
    }

    public final List<String> E() {
        return this.T.E;
    }

    public final boolean F() {
        return this.T.F;
    }

    public final SocialModel G() {
        return this.T.H;
    }

    public final a H() {
        return this.T.K;
    }

    public final j K() {
        return this.T.L;
    }

    public final boolean M() {
        return this.T.N;
    }

    public final String N() {
        return this.T.O;
    }

    public final long O() {
        return this.T.P;
    }

    public final e Q() {
        return this.T.S;
    }

    public final i R() {
        return this.T.Y;
    }

    public final List<j> T() {
        return this.T.Z;
    }

    public final boolean U() {
        return this.T.A;
    }

    public final int V() {
        return this.T.B;
    }

    public final String a() {
        return this.T.x;
    }

    public final int b() {
        return this.T.T;
    }

    public final int c() {
        return this.T.U;
    }

    public final int d() {
        return this.T.V;
    }

    public final int e() {
        return this.T.W;
    }

    public final d h() {
        return this.T.J;
    }

    public final String i() {
        return this.T.R;
    }

    public final int k() {
        return this.T.G;
    }

    public final int l() {
        return this.T.f43429c;
    }

    @ExternalAVConstants.ShootMode
    public final int m() {
        return this.T.f43428b;
    }

    public final String n() {
        return this.T.n;
    }

    public final boolean o() {
        return this.T.h;
    }

    public final int q() {
        return this.T.f43432f;
    }

    public final boolean r() {
        return this.T.g;
    }

    @ExternalAVConstants.RecordMode
    public final int s() {
        return this.T.i;
    }

    public final int t() {
        return this.T.j;
    }

    public final String u() {
        return this.T.f43431e;
    }

    public final ExtractFramesModel x() {
        return this.T.w;
    }

    public final AVUploadSaveModel y() {
        return this.T.y;
    }

    public final String z() {
        return this.T.v;
    }

    public final int g() {
        if (this.T == null) {
            return 0;
        }
        return this.T.X;
    }

    @Nullable
    public final i v() {
        if (this.T != null) {
            return this.T.k;
        }
        return null;
    }

    @Nullable
    public final boolean w() {
        if (this.T != null) {
            return this.T.m;
        }
        return false;
    }

    public final boolean I() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f43433a, false, 38479, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f43433a, false, 38479, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (H() != null) {
            z2 = true;
        }
        return z2;
    }

    public final String J() {
        if (PatchProxy.isSupport(new Object[0], this, f43433a, false, 38480, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f43433a, false, 38480, new Class[0], String.class);
        } else if (H() == null) {
            return null;
        } else {
            return H().videoCoverImgPath;
        }
    }

    public final String f() {
        if (!PatchProxy.isSupport(new Object[0], this, f43433a, false, 38471, new Class[0], String.class)) {
            return X();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f43433a, false, 38471, new Class[0], String.class);
    }

    @NonNull
    public final String p() {
        if (PatchProxy.isSupport(new Object[0], this, f43433a, false, 38476, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f43433a, false, 38476, new Class[0], String.class);
        }
        String str = this.T.f43430d;
        if (TextUtils.isEmpty(str)) {
            str = UUID.randomUUID().toString();
        }
        return str;
    }

    private File W() {
        if (PatchProxy.isSupport(new Object[0], this, f43433a, false, 38475, new Class[0], File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[0], this, f43433a, false, 38475, new Class[0], File.class);
        }
        return new File(fg.h + DigestUtils.md5Hex(this.g) + File.separator);
    }

    public final g L() {
        if (PatchProxy.isSupport(new Object[0], this, f43433a, false, 38481, new Class[0], g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[0], this, f43433a, false, 38481, new Class[0], g.class);
        }
        g gVar = this.T.M;
        if (gVar != null && this.T.Z != null && !this.T.Z.isEmpty() && !new File(gVar.f43447d.get(0).i).exists()) {
            gVar.a(this.T.Z);
            ai.a("draftOpt==>getDraftPreviewConfigure,using copy video segment");
        }
        return gVar;
    }

    public final List<Integer> P() {
        if (PatchProxy.isSupport(new Object[0], this, f43433a, false, 38482, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f43433a, false, 38482, new Class[0], List.class);
        } else if (this.T == null || this.T.M == null) {
            return Collections.singletonList(0);
        } else {
            ArrayList arrayList = new ArrayList();
            for (j jVar : this.T.M.f43447d) {
                arrayList.add(Integer.valueOf(jVar.h));
            }
            if (arrayList.isEmpty()) {
                arrayList.add(0);
            }
            return arrayList;
        }
    }

    public final String S() {
        if (PatchProxy.isSupport(new Object[0], this, f43433a, false, 38483, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f43433a, false, 38483, new Class[0], String.class);
        }
        if (TextUtils.isEmpty(this.f43437e)) {
            if (O() > 0) {
                this.f43437e = O() + "_" + f();
            } else {
                this.f43437e = f();
            }
        }
        return this.f43437e;
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f43433a, false, 38473, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43433a, false, 38473, new Class[0], Void.TYPE);
            return;
        }
        if (!M()) {
            if (!TextUtils.isEmpty(this.i)) {
                b.c(this.i);
            }
            if (!TextUtils.isEmpty(this.g)) {
                b.c(this.g);
                b.b(W());
            }
        } else if (this.T.M != null && !TextUtils.isEmpty(this.T.M.i)) {
            b.b(new File(this.T.M.i));
        }
    }

    private String X() {
        if (PatchProxy.isSupport(new Object[0], this, f43433a, false, 38484, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f43433a, false, 38484, new Class[0], String.class);
        }
        String str = this.g;
        if (this.T.M != null) {
            if (this.U && new File(str).exists()) {
                return str;
            }
            j jVar = this.T.M.f43447d.get(0);
            if (new File(jVar.i).exists()) {
                str = jVar.i;
            } else if (T() != null && !T().isEmpty()) {
                j jVar2 = T().get(0);
                if (new File(jVar2.i).exists()) {
                    str = jVar2.i;
                    ai.a("draftOpt==>get file path using copy:" + str);
                }
            }
        }
        this.U = true;
        return str;
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f43433a, false, 38474, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f43433a, false, 38474, new Class[0], String.class);
        }
        return "AwemeDraft{id=" + this.f43434b + ", aweme=" + this.f43435c + ", photoMovieContext=" + this.f43436d + ", musicModel=" + this.f43438f + ", videoPath='" + this.g + '\'' + ", musicPath='" + this.h + '\'' + ", voicePath='" + this.i + '\'' + ", videoVolume=" + this.j + ", musicVolume=" + this.k + ", filter=" + this.l + ", musicStart=" + this.m + ", effect=" + this.n + ", origin=" + this.o + ", mReversePath='" + this.p + '\'' + ", videoSpeed='" + this.q + '\'' + ", audioTrack=" + this.r + ", fiterLabel='" + this.s + '\'' + ", cameraPos=" + this.t + ", useBeauty=" + this.u + ", type=" + this.v + ", isWidthDivider=" + this.x + ", privateVideo=" + this.y + ", mEffectListModel=" + this.z + ", maxDuration=" + this.A + ", faceBeauty=" + this.B + ", userId='" + this.C + '\'' + ", time=" + this.D + ", videoSegmentsDesc='" + this.E + '\'' + ", hardEncode=" + this.F + ", specialPoints=" + this.G + ", stickerPath='" + this.H + '\'' + ", stickerID='" + this.I + '\'' + ", volumeTaps=" + Arrays.toString(this.J) + ", musicEffectSegments='" + this.K + '\'' + ", newVersion=" + this.L + ", outputWavPath='" + this.M + '\'' + ", customCoverStart=" + this.N + ", videoWidth=" + this.O + ", videoHeight=" + this.P + ", duetFrom='" + this.Q + '\'' + ", syncPlatforms='" + this.R + '\'' + ", from='" + this.S + '\'' + ", extras=" + this.T + '}';
    }

    public final c a(float f2) {
        this.N = f2;
        return this;
    }

    public final c e(String str) {
        this.K = str;
        return this;
    }

    public final c f(int i2) {
        this.L = i2;
        return this;
    }

    public final c f(String str) {
        this.M = str;
        return this;
    }

    public final void g(int i2) {
        this.T.G = i2;
    }

    public final void j(@ExternalAVConstants.RecordMode int i2) {
        this.T.i = i2;
    }

    public final void a(int i2) {
        this.T.T = i2;
    }

    public final void b(int i2) {
        this.T.U = i2;
    }

    public final void c(int i2) {
        this.T.V = i2;
    }

    public final void d(int i2) {
        this.T.W = i2;
    }

    public final void e(int i2) {
        if (this.T != null) {
            this.T.X = i2;
        }
    }

    public final void f(boolean z2) {
        this.T.A = z2;
    }

    public final void h(int i2) {
        this.T.f43429c = i2;
    }

    public final void i(@ExternalAVConstants.ShootMode int i2) {
        this.T.f43428b = i2;
    }

    public final void j(String str) {
        this.T.v = str;
    }

    public final void k(int i2) {
        this.T.j = i2;
    }

    public final void l(int i2) {
        this.T.f43432f = i2;
    }

    public final void m(int i2) {
        this.T.D = i2;
    }

    public final void n(int i2) {
        this.T.B = i2;
    }

    public final void a(long j2) {
        this.T.P = j2;
    }

    public final void b(String str) {
        this.g = str;
        if (this.T != null) {
            this.T.Q = str;
        }
    }

    public final void c(boolean z2) {
        this.T.m = z2;
    }

    public final void d(String str) {
        this.T.R = str;
    }

    public final void e(boolean z2) {
        this.T.N = z2;
    }

    public final void g(String str) {
        this.T.n = str;
    }

    public final void h(@NonNull String str) {
        this.T.f43430d = str;
    }

    public final void k(String str) {
        this.T.l = str;
    }

    public final void l(String str) {
        this.T.r = str;
    }

    public final void m(String str) {
        this.T.O = str;
    }

    public final void a(d dVar) {
        this.T.J = dVar;
    }

    public final void b(@NonNull List<j> list) {
        this.T.Z = list;
    }

    public final void d(boolean z2) {
        this.T.F = z2;
    }

    public final void a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f43433a, false, 38478, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f43433a, false, 38478, new Class[]{b.class}, Void.TYPE);
            return;
        }
        this.T = bVar;
        if (this.T != null && !TextUtils.isEmpty(this.T.Q)) {
            this.g = this.T.Q;
        }
    }

    public final void b(boolean z2) {
        this.T.g = z2;
    }

    public final void c(@NonNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f43433a, false, 38472, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f43433a, false, 38472, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Gson provideAvGson = ((IAVService) ServiceManager.get().getService(IAVService.class)).provideAvGson();
        PhotoMovieContext photoMovieContext = (PhotoMovieContext) provideAvGson.fromJson(str2, PhotoMovieContext.class);
        if (photoMovieContext != null) {
            if (photoMovieContext.mImageList == null) {
                photoMovieContext = PhotoMovieContext.convertFromOld((PhotoMovieContextOld) provideAvGson.fromJson(str2, PhotoMovieContextOld.class));
            }
            this.f43436d = photoMovieContext;
        }
    }

    public final void i(String str) {
        String str2;
        c cVar;
        if (PatchProxy.isSupport(new Object[]{str}, this, f43433a, false, 38477, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f43433a, false, 38477, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str2 = "edit_draft";
            cVar = this;
        } else {
            cVar = this;
            str2 = str;
        }
        cVar.T.f43431e = str2;
    }

    public final void a(e eVar) {
        this.T.S = eVar;
    }

    public final void a(g gVar) {
        this.T.M = gVar;
    }

    public final void a(i iVar) {
        this.T.Y = iVar;
    }

    public final void a(com.ss.android.ugc.aweme.n.a aVar) {
        this.T.z = aVar;
    }
}

package com.ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.ExternalAVConstants;
import com.ss.android.ugc.aweme.filter.az;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.a.d;
import com.ss.android.ugc.aweme.shortvideo.edit.q;
import com.ss.android.ugc.aweme.shortvideo.i.i;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.shortvideo.model.StoryFestivalModel;
import com.ss.android.ugc.aweme.shortvideo.ui.f;
import java.util.ArrayList;
import java.util.List;

public class fh implements Parcelable {
    public static final Parcelable.Creator<fh> CREATOR = new Parcelable.Creator<fh>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67724a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new fh[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f67724a, false, 74584, new Class[]{Parcel.class}, fh.class)) {
                return new fh(parcel2, (byte) 0);
            }
            return (fh) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f67724a, false, 74584, new Class[]{Parcel.class}, fh.class);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67718a;
    public String A;
    public int B;
    public int C;
    public String D;
    public i E;
    public List<f> F;
    public boolean G;
    public String H;
    public List<AVTextExtraStruct> I;
    public int J;
    public boolean K;
    public String L;
    public boolean M;
    @ExternalAVConstants.ShootMode
    public int N;
    public az O;
    public az P;
    public az Q;
    public az R;
    public az S;
    public az T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public ExtractFramesModel Y;
    public long Z;
    public long aa;
    @ExternalAVConstants.RecordMode
    public int ab;
    public int ac;
    @Nullable
    public GameDuetResource ad;
    public String ae;
    public String af;
    public String ag;
    public String ah;
    public String ai;
    public String aj;
    public String ak;
    public String al;
    public q am;
    public boolean an;
    public boolean ao;
    public StoryFestivalModel ap;
    public ExtraMentionUserModel aq;
    public UrlModel ar;
    public ArrayList<String> as;
    public ArrayList<String> at;
    public j au;
    public com.ss.android.ugc.aweme.draft.a.f av;
    public ah aw;
    @ExternalAVConstants.Restore

    /* renamed from: b  reason: collision with root package name */
    public final int f67719b;

    /* renamed from: c  reason: collision with root package name */
    public long f67720c;

    /* renamed from: d  reason: collision with root package name */
    public long f67721d;

    /* renamed from: e  reason: collision with root package name */
    public UrlModel f67722e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public String f67723f;
    public int g;
    public int h;
    public String i;
    public int j;
    public int k;
    public d l;
    public ft m;
    public long n;
    public int o;
    public boolean p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public int v;
    public AVETParameter w;
    public User x;
    public String y;
    public String z;

    public int describeContents() {
        return 0;
    }

    public final boolean b() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f67718a, false, 74577, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f67718a, false, 74577, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!StringUtils.isEmpty(this.z) && !StringUtils.isEmpty(this.A)) {
            z2 = true;
        }
        return z2;
    }

    public final AVETParameter d() {
        if (PatchProxy.isSupport(new Object[0], this, f67718a, false, 74582, new Class[0], AVETParameter.class)) {
            return (AVETParameter) PatchProxy.accessDispatch(new Object[0], this, f67718a, false, 74582, new Class[0], AVETParameter.class);
        }
        if (this.w == null) {
            this.w = new AVETParameter();
        }
        return this.w;
    }

    @Nullable
    public final String e() {
        if (PatchProxy.isSupport(new Object[0], this, f67718a, false, 74583, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f67718a, false, 74583, new Class[0], String.class);
        } else if (a()) {
            return this.l.e().getPath();
        } else {
            return null;
        }
    }

    public final boolean a() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f67718a, false, 74576, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f67718a, false, 74576, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.l.e() != null && !b() && !c()) {
            z2 = true;
        }
        return z2;
    }

    public final boolean c() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f67718a, false, 74578, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f67718a, false, 74578, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.E != null && !StringUtils.isEmpty(this.E.videoPath) && !StringUtils.isEmpty(this.E.wavPath)) {
            z2 = true;
        }
        return z2;
    }

    fh(int i2) {
        this.m = new ft();
        this.F = new ArrayList();
        this.G = false;
        this.O = new az();
        this.P = new az();
        this.Q = new az();
        this.R = new az();
        this.S = new az();
        this.T = new az();
        this.U = true;
        this.V = true;
        this.W = false;
        this.X = false;
        this.Z = 0;
        this.aa = 0;
        this.al = "";
        this.as = new ArrayList<>();
        this.at = new ArrayList<>();
        this.au = new j();
        this.f67719b = i2;
    }

    private fh(Parcel parcel) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        this.m = new ft();
        this.F = new ArrayList();
        boolean z9 = false;
        this.G = false;
        this.O = new az();
        this.P = new az();
        this.Q = new az();
        this.R = new az();
        this.S = new az();
        this.T = new az();
        this.U = true;
        this.V = true;
        this.W = false;
        this.X = false;
        this.Z = 0;
        this.aa = 0;
        this.al = "";
        this.as = new ArrayList<>();
        this.at = new ArrayList<>();
        this.au = new j();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.W = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.X = z3;
        this.f67719b = parcel.readInt();
        this.f67720c = parcel.readLong();
        this.f67722e = (UrlModel) parcel.readSerializable();
        this.f67723f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readString();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
        this.l = (d) parcel.readParcelable(d.class.getClassLoader());
        this.m = new ft(RecordScene.string2TimeSpeedModels(parcel.readString()));
        this.n = parcel.readLong();
        this.o = parcel.readInt();
        if (parcel.readInt() == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.p = z4;
        this.q = parcel.readString();
        this.r = parcel.readString();
        this.v = parcel.readInt();
        this.x = (User) parcel.readSerializable();
        this.y = parcel.readString();
        this.z = parcel.readString();
        this.A = parcel.readString();
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        this.L = parcel.readString();
        this.N = parcel.readInt();
        this.O = (az) parcel.readParcelable(az.class.getClassLoader());
        this.P = (az) parcel.readParcelable(az.class.getClassLoader());
        this.Q = (az) parcel.readParcelable(az.class.getClassLoader());
        this.R = (az) parcel.readParcelable(az.class.getClassLoader());
        this.E = (i) parcel.readParcelable(i.class.getClassLoader());
        this.F = parcel.createTypedArrayList(f.CREATOR);
        this.H = parcel.readString();
        this.I = parcel.createTypedArrayList(AVTextExtraStruct.CREATOR);
        this.J = parcel.readInt();
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.K = z5;
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.U = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.V = z7;
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.G = z8;
        this.ab = parcel.readInt();
        this.ac = parcel.readInt();
        this.ad = (GameDuetResource) parcel.readParcelable(GameDuetResource.class.getClassLoader());
        this.D = parcel.readString();
        this.S = (az) parcel.readParcelable(az.class.getClassLoader());
        this.T = (az) parcel.readParcelable(az.class.getClassLoader());
        this.ae = parcel.readString();
        this.af = parcel.readString();
        this.ag = parcel.readString();
        this.ah = parcel.readString();
        this.ai = parcel.readString();
        this.aj = parcel.readString();
        this.ak = parcel.readString();
        this.Y = (ExtractFramesModel) parcel.readSerializable();
        this.am = (q) parcel.readSerializable();
        this.an = parcel.readInt() != 0 ? true : z9;
        this.w = (AVETParameter) parcel.readSerializable();
        this.ap = (StoryFestivalModel) parcel.readParcelable(StoryFestivalModel.class.getClassLoader());
        this.as = parcel.createStringArrayList();
        this.at = parcel.createStringArrayList();
        this.au = (j) parcel.readSerializable();
        this.av = (com.ss.android.ugc.aweme.draft.a.f) parcel.readParcelable(com.ss.android.ugc.aweme.draft.a.f.class.getClassLoader());
        this.aw = (ah) parcel.readParcelable(ah.class.getClassLoader());
        this.ar = (UrlModel) parcel.readSerializable();
        this.s = parcel.readString();
    }

    /* synthetic */ fh(Parcel parcel, byte b2) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i2)}, this, f67718a, false, 74581, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i2)}, this, f67718a, false, 74581, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeInt(this.W ? 1 : 0);
        parcel.writeInt(this.X ? 1 : 0);
        parcel.writeInt(this.f67719b);
        parcel.writeLong(this.f67720c);
        parcel.writeSerializable(this.f67722e);
        parcel.writeString(this.f67723f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeString(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeParcelable(this.l, i2);
        parcel.writeString(RecordScene.timeSpeedModels2String(this.m));
        parcel.writeLong(this.n);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeInt(this.v);
        parcel.writeSerializable(this.x);
        parcel.writeString(this.y);
        parcel.writeString(this.z);
        parcel.writeString(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeString(this.L);
        parcel.writeInt(this.N);
        parcel.writeParcelable(this.O, i2);
        parcel.writeParcelable(this.P, i2);
        parcel.writeParcelable(this.Q, i2);
        parcel.writeParcelable(this.R, i2);
        parcel.writeParcelable(this.E, i2);
        parcel.writeTypedList(this.F);
        parcel.writeString(this.H);
        parcel.writeTypedList(this.I);
        parcel.writeInt(this.J);
        parcel.writeByte(this.K ? (byte) 1 : 0);
        parcel.writeByte(this.U ? (byte) 1 : 0);
        parcel.writeByte(this.V ? (byte) 1 : 0);
        parcel.writeByte(this.G ? (byte) 1 : 0);
        parcel.writeInt(this.ab);
        parcel.writeInt(this.ac);
        parcel.writeParcelable(this.ad, i2);
        parcel.writeString(this.D);
        parcel.writeParcelable(this.S, i2);
        parcel.writeParcelable(this.T, i2);
        parcel.writeString(this.ae);
        parcel.writeString(this.af);
        parcel.writeString(this.ag);
        parcel.writeString(this.ah);
        parcel.writeString(this.ai);
        parcel.writeString(this.aj);
        parcel.writeString(this.ak);
        parcel.writeSerializable(this.Y);
        parcel.writeSerializable(this.am);
        parcel.writeInt(this.an ? 1 : 0);
        parcel.writeSerializable(this.w);
        parcel.writeParcelable(this.ap, i2);
        parcel.writeStringList(this.as);
        parcel.writeStringList(this.at);
        parcel.writeSerializable(this.au);
        parcel.writeParcelable(this.av, i2);
        parcel.writeParcelable(this.aw, i2);
        parcel.writeSerializable(this.ar);
        parcel.writeString(this.s);
    }
}

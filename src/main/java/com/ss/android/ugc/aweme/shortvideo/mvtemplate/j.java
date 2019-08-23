package com.ss.android.ugc.aweme.shortvideo.mvtemplate;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.c.b;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

public class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new Parcelable.Creator<j>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68729a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new j[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f68729a, false, 77908, new Class[]{Parcel.class}, j.class)) {
                return new j(parcel2);
            }
            return (j) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f68729a, false, 77908, new Class[]{Parcel.class}, j.class);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68723a;

    /* renamed from: b  reason: collision with root package name */
    public Effect f68724b;

    /* renamed from: c  reason: collision with root package name */
    public List<String> f68725c;

    /* renamed from: d  reason: collision with root package name */
    public int f68726d;

    /* renamed from: e  reason: collision with root package name */
    public int f68727e;

    /* renamed from: f  reason: collision with root package name */
    public String f68728f;
    public String g;
    public String h;
    public int i;
    public int j;
    public boolean k;
    public int l;

    public int describeContents() {
        return 0;
    }

    public j() {
    }

    @Nullable
    public final String a() {
        if (this.f68724b != null) {
            return this.f68724b.effect_id;
        }
        return null;
    }

    @Nullable
    public final List<String> b() {
        if (this.f68724b != null) {
            return this.f68724b.music;
        }
        return null;
    }

    public final String j() {
        if (this.f68724b != null) {
            return this.f68724b.hint;
        }
        return "";
    }

    @Nullable
    public final String k() {
        if (this.f68724b != null) {
            return this.f68724b.id;
        }
        return null;
    }

    public final String h() {
        if (this.f68724b == null) {
            return "";
        }
        if (this.f68724b.name == null) {
            return "";
        }
        return this.f68724b.name;
    }

    @Nullable
    public final String f() {
        if (PatchProxy.isSupport(new Object[0], this, f68723a, false, 77901, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f68723a, false, 77901, new Class[0], String.class);
        }
        if (this.f68724b != null) {
            UrlModel urlModel = this.f68724b.file_url;
            if (urlModel != null && !com.ss.android.ugc.aweme.base.utils.j.a((Collection<T>) urlModel.url_list)) {
                return urlModel.uri;
            }
        }
        return null;
    }

    private void m() {
        if (PatchProxy.isSupport(new Object[0], this, f68723a, false, 77905, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68723a, false, 77905, new Class[0], Void.TYPE);
            return;
        }
        if (this.f68724b != null) {
            try {
                JSONObject jSONObject = new JSONObject(this.f68724b.extra);
                this.f68726d = jSONObject.optInt("template_min_material", 0);
                this.f68727e = jSONObject.optInt("template_max_material", 0);
                this.f68728f = jSONObject.optString("template_video_cover", "");
                this.g = jSONObject.optString("template_picture_cover", "");
                this.h = jSONObject.optString("template_pic_fill_mode", "AspectFit");
                this.i = jSONObject.optInt("template_pic_input_width", 720);
                this.j = jSONObject.optInt("template_pic_input_height", 1280);
                this.l = jSONObject.optInt("template_type", 0);
            } catch (Exception unused) {
            }
        }
    }

    @Nullable
    public final String c() {
        if (PatchProxy.isSupport(new Object[0], this, f68723a, false, 77898, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f68723a, false, 77898, new Class[0], String.class);
        }
        if (this.f68724b != null) {
            UrlModel urlModel = this.f68724b.file_url;
            if (urlModel != null && !com.ss.android.ugc.aweme.base.utils.j.a((Collection<T>) urlModel.url_list)) {
                return urlModel.url_list.get(0);
            }
        }
        return null;
    }

    @Nullable
    public final String d() {
        if (PatchProxy.isSupport(new Object[0], this, f68723a, false, 77899, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f68723a, false, 77899, new Class[0], String.class);
        }
        String a2 = b.a("mvres");
        if (this.f68724b == null) {
            return null;
        }
        return a2 + File.separator + this.f68724b.id + ".zip";
    }

    @Nullable
    public final String e() {
        if (PatchProxy.isSupport(new Object[0], this, f68723a, false, 77900, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f68723a, false, 77900, new Class[0], String.class);
        }
        String a2 = b.a("mvres");
        if (this.f68724b == null) {
            return null;
        }
        return a2 + File.separator + this.f68724b.id;
    }

    @Nullable
    public final String g() {
        if (PatchProxy.isSupport(new Object[0], this, f68723a, false, 77902, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f68723a, false, 77902, new Class[0], String.class);
        } else if (TextUtils.isEmpty(this.f68728f) || com.ss.android.ugc.aweme.base.utils.j.a((Collection<T>) this.f68725c)) {
            return null;
        } else {
            return this.f68725c.get(0) + this.f68728f;
        }
    }

    @Nullable
    public final String i() {
        if (PatchProxy.isSupport(new Object[0], this, f68723a, false, 77903, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f68723a, false, 77903, new Class[0], String.class);
        } else if (TextUtils.isEmpty(this.g) || com.ss.android.ugc.aweme.base.utils.j.a((Collection<T>) this.f68725c)) {
            return null;
        } else {
            return this.f68725c.get(0) + this.g;
        }
    }

    public final int l() {
        if (PatchProxy.isSupport(new Object[0], this, f68723a, false, 77906, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f68723a, false, 77906, new Class[0], Integer.TYPE)).intValue();
        }
        int a2 = c.a().a(c());
        if (a2 == 1) {
            return 2;
        }
        if (a2 == 2) {
            return 3;
        }
        if (a2 == 3) {
            return 1;
        }
        return a2 == -1 ? -1 : -1;
    }

    public final void a(Effect effect) {
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2}, this, f68723a, false, 77904, new Class[]{Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect2}, this, f68723a, false, 77904, new Class[]{Effect.class}, Void.TYPE);
            return;
        }
        this.f68724b = effect2;
        m();
    }

    public j(Parcel parcel) {
        boolean z;
        this.f68724b = (Effect) parcel.readParcelable(Effect.class.getClassLoader());
        this.f68725c = parcel.createStringArrayList();
        this.f68726d = parcel.readInt();
        this.f68727e = parcel.readInt();
        this.f68728f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.k = z;
        this.l = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i2)}, this, f68723a, false, 77907, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i2)}, this, f68723a, false, 77907, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeParcelable(this.f68724b, i2);
        parcel.writeStringList(this.f68725c);
        parcel.writeInt(this.f68726d);
        parcel.writeInt(this.f68727e);
        parcel.writeString(this.f68728f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeByte(this.k ? (byte) 1 : 0);
        parcel.writeInt(this.l);
    }
}

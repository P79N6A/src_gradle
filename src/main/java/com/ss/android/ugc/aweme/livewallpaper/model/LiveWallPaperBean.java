package com.ss.android.ugc.aweme.livewallpaper.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.video.b;

@Keep
public class LiveWallPaperBean implements Parcelable {
    public static final Parcelable.Creator<LiveWallPaperBean> CREATOR = new Parcelable.Creator<LiveWallPaperBean>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53691a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new LiveWallPaperBean[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f53691a, false, 56220, new Class[]{Parcel.class}, LiveWallPaperBean.class)) {
                return new LiveWallPaperBean(parcel2);
            }
            return (LiveWallPaperBean) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f53691a, false, 56220, new Class[]{Parcel.class}, LiveWallPaperBean.class);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    private int height;
    private String id;
    private String source;
    private String thumbnailPath;
    private String videoPath;
    private int width;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53692a;

        /* renamed from: b  reason: collision with root package name */
        public String f53693b;

        /* renamed from: c  reason: collision with root package name */
        public String f53694c;

        /* renamed from: d  reason: collision with root package name */
        public String f53695d;

        /* renamed from: e  reason: collision with root package name */
        public int f53696e;

        /* renamed from: f  reason: collision with root package name */
        public int f53697f;
        public String g;

        private a() {
        }

        public final LiveWallPaperBean a() {
            if (!PatchProxy.isSupport(new Object[0], this, f53692a, false, 56221, new Class[0], LiveWallPaperBean.class)) {
                return new LiveWallPaperBean(this);
            }
            return (LiveWallPaperBean) PatchProxy.accessDispatch(new Object[0], this, f53692a, false, 56221, new Class[0], LiveWallPaperBean.class);
        }

        public final a a(int i) {
            this.f53696e = i;
            return this;
        }

        public final a b(int i) {
            this.f53697f = i;
            return this;
        }

        public final a c(String str) {
            this.f53695d = str;
            return this;
        }

        public final a d(String str) {
            this.g = str;
            return this;
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final a a(String str) {
            this.f53693b = str;
            return this;
        }

        public final a b(String str) {
            this.f53694c = str;
            return this;
        }
    }

    public int describeContents() {
        return 0;
    }

    public int getHeight() {
        return this.height;
    }

    public String getId() {
        return this.id;
    }

    public String getSource() {
        return this.source;
    }

    public String getThumbnailPath() {
        return this.thumbnailPath;
    }

    public String getVideoPath() {
        return this.videoPath;
    }

    public int getWidth() {
        return this.width;
    }

    public static a newBuilder() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 56217, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 56217, new Class[0], a.class);
        }
        return new a((byte) 0);
    }

    public static LiveWallPaperBean buildEmptyBean() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 56219, new Class[0], LiveWallPaperBean.class)) {
            return (LiveWallPaperBean) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 56219, new Class[0], LiveWallPaperBean.class);
        }
        return new a((byte) 0).a("").a(0).b(0).b("").c("").a();
    }

    public boolean isValid() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 56215, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 56215, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(this.id) || !b.b(this.thumbnailPath) || !b.b(this.videoPath)) {
            return false;
        } else {
            return true;
        }
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 56216, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 56216, new Class[0], String.class);
        }
        return "LiveWallPaperBean{id='" + this.id + '\'' + ", thumbnailPath='" + this.thumbnailPath + '\'' + ", videoPath='" + this.videoPath + '\'' + ", width=" + this.width + ", height=" + this.height + ", source=" + this.source + '}';
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setThumbnailPath(String str) {
        this.thumbnailPath = str;
    }

    public void setVideoPath(String str) {
        this.videoPath = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    private LiveWallPaperBean(a aVar) {
        this.id = aVar.f53693b;
        this.thumbnailPath = aVar.f53694c;
        this.videoPath = aVar.f53695d;
        this.width = aVar.f53696e;
        this.height = aVar.f53697f;
        this.source = aVar.g;
    }

    private LiveWallPaperBean(Parcel parcel) {
        this.id = parcel.readString();
        this.thumbnailPath = parcel.readString();
        this.videoPath = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.source = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 56218, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 56218, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeString(this.id);
        parcel.writeString(this.thumbnailPath);
        parcel.writeString(this.videoPath);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.source);
    }
}

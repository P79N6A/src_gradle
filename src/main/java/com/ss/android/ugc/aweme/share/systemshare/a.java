package com.ss.android.ugc.aweme.share.systemshare;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.framework.e.h;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65303a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new a[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f65303a, false, 73832, new Class[]{Parcel.class}, a.class)) {
                return new a(parcel2);
            }
            return (a) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f65303a, false, 73832, new Class[]{Parcel.class}, a.class);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65294a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f65295b;

    /* renamed from: c  reason: collision with root package name */
    public int f65296c;

    /* renamed from: d  reason: collision with root package name */
    public File f65297d;

    /* renamed from: e  reason: collision with root package name */
    public List<String> f65298e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public int f65299f = 360;
    public float g = 1.0f;
    public float h = 2.2f;

    public int describeContents() {
        return 0;
    }

    public a() {
    }

    public final ArrayList<com.ss.android.ugc.aweme.music.b.a.a> a() {
        if (PatchProxy.isSupport(new Object[0], this, f65294a, false, 73824, new Class[0], ArrayList.class)) {
            return (ArrayList) PatchProxy.accessDispatch(new Object[0], this, f65294a, false, 73824, new Class[0], ArrayList.class);
        }
        ArrayList<com.ss.android.ugc.aweme.music.b.a.a> arrayList = new ArrayList<>();
        long j = 0;
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        int i = 0;
        for (String next : this.f65298e) {
            int[] extractVideoFileInfo = iAVService.extractVideoFileInfo(next);
            if (extractVideoFileInfo == null) {
                return null;
            }
            com.ss.android.ugc.aweme.music.b.a.a aVar = new com.ss.android.ugc.aweme.music.b.a.a((long) i);
            i++;
            aVar.f56315e = next;
            aVar.h = (long) extractVideoFileInfo[3];
            aVar.l = extractVideoFileInfo[0];
            aVar.m = extractVideoFileInfo[1];
            aVar.n = (double) extractVideoFileInfo[5];
            aVar.o = (double) extractVideoFileInfo[4];
            arrayList.add(aVar);
            j += aVar.h;
        }
        if (j > 3600000) {
            return null;
        }
        return arrayList;
    }

    public a(Parcel parcel) {
        boolean z;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f65295b = z;
        this.f65296c = parcel.readInt();
        this.f65297d = (File) parcel.readSerializable();
        this.f65298e = parcel.createStringArrayList();
    }

    public void a(Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, this, f65294a, false, 73821, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent}, this, f65294a, false, 73821, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
        if (parcelableArrayListExtra != null && parcelableArrayListExtra.size() != 0) {
            Iterator it2 = parcelableArrayListExtra.iterator();
            while (it2.hasNext()) {
                this.f65298e.add(h.a(k.a(), (Uri) it2.next()));
            }
            this.f65295b = true;
            if (b(intent.getType())) {
                this.f65296c = 4;
            } else if (a(intent.getType())) {
                this.f65296c = 3;
            }
        }
    }

    public boolean b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f65294a, false, 73827, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f65294a, false, 73827, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (StringUtils.isEmpty(str)) {
            return false;
        } else {
            return str2.startsWith("video/");
        }
    }

    public boolean a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f65294a, false, 73826, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f65294a, false, 73826, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (StringUtils.isEmpty(str)) {
            return false;
        } else {
            return str2.startsWith("image/");
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, f65294a, false, 73828, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, f65294a, false, 73828, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeByte(this.f65295b ? (byte) 1 : 0);
        parcel.writeInt(this.f65296c);
        parcel.writeSerializable(this.f65297d);
        parcel.writeStringList(this.f65298e);
    }
}

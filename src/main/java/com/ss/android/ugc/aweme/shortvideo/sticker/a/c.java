package com.ss.android.ugc.aweme.shortvideo.sticker.a;

import android.os.Environment;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.medialib.jni.PhotoFaceDetection;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.model.Face;
import com.ss.android.ugc.aweme.utils.bm;
import com.ss.android.ugc.aweme.utils.dd;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69262a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f69263b = (com.ss.android.ugc.aweme.port.in.a.f61119b.getExternalCacheDir() + File.separator + "faces");

    /* renamed from: c  reason: collision with root package name */
    public boolean f69264c = true;

    /* renamed from: d  reason: collision with root package name */
    public a f69265d;

    /* renamed from: e  reason: collision with root package name */
    public b f69266e = b.a();

    /* renamed from: f  reason: collision with root package name */
    public PhotoFaceDetection f69267f;
    public int g;

    public interface a {
        void a(@Nullable List<Face> list, @Nullable List<Face> list2, boolean z);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public long f69274a = 0;

        /* renamed from: b  reason: collision with root package name */
        public long f69275b = 0;

        public b(long j, long j2) {
        }
    }

    public final void a() {
        b bVar;
        Map map;
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f69262a, false, 79051, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69262a, false, 79051, new Class[0], Void.TYPE);
            return;
        }
        dd.a();
        System.currentTimeMillis();
        String absolutePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath();
        if (PatchProxy.isSupport(new Object[0], this, f69262a, false, 79055, new Class[0], b.class)) {
            bVar = (b) PatchProxy.accessDispatch(new Object[0], this, f69262a, false, 79055, new Class[0], b.class);
        } else {
            dd.a();
            if (PatchProxy.isSupport(new Object[0], this, f69262a, false, 79058, new Class[0], String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[0], this, f69262a, false, 79058, new Class[0], String.class);
            } else {
                str = com.ss.android.ugc.aweme.port.in.a.L.e(e.a.FolderInfo);
            }
            if (!TextUtils.isEmpty(str)) {
                bVar = (b) com.ss.android.ugc.aweme.port.in.a.f61120c.fromJson(str, b.class);
            } else {
                bVar = new b(0, 0);
            }
        }
        List<d> a2 = a.a(bVar.f69274a, bVar.f69275b, absolutePath, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        Collections.sort(a2, new Comparator<d>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69270a;

            public final /* synthetic */ int compare(Object obj, Object obj2) {
                d dVar = (d) obj;
                d dVar2 = (d) obj2;
                if (!PatchProxy.isSupport(new Object[]{dVar, dVar2}, this, f69270a, false, 79061, new Class[]{d.class, d.class}, Integer.TYPE)) {
                    return Long.signum(dVar2.f69277b - dVar.f69277b);
                }
                return ((Integer) PatchProxy.accessDispatch(new Object[]{dVar, dVar2}, this, f69270a, false, 79061, new Class[]{d.class, d.class}, Integer.TYPE)).intValue();
            }
        });
        if (PatchProxy.isSupport(new Object[]{a2}, this, f69262a, false, 79052, new Class[]{List.class}, Map.class)) {
            map = (Map) PatchProxy.accessDispatch(new Object[]{a2}, this, f69262a, false, 79052, new Class[]{List.class}, Map.class);
        } else {
            map = new LinkedHashMap();
            for (d dVar : a2) {
                map.put(dVar.f69276a, dVar);
            }
            List<String> c2 = this.f69266e.c();
            if (c2 != null) {
                for (String remove : c2) {
                    map.remove(remove);
                }
            }
        }
        if (a2.isEmpty()) {
            this.f69264c = false;
            a(null, null, this.f69264c);
            return;
        }
        map.keySet().toArray(new String[map.size()]);
    }

    public boolean a(Face face) {
        Face face2 = face;
        if (PatchProxy.isSupport(new Object[]{face2}, this, f69262a, false, 79050, new Class[]{Face.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{face2}, this, f69262a, false, 79050, new Class[]{Face.class}, Boolean.TYPE)).booleanValue();
        } else if (!bm.a(face2.origin_path) || !bm.a(face2.path)) {
            return false;
        } else {
            return true;
        }
    }

    public final void a(List<Face> list, List<Face> list2, boolean z) {
        List<Face> list3 = list;
        List<Face> list4 = list2;
        if (PatchProxy.isSupport(new Object[]{list3, list4, Byte.valueOf(z ? (byte) 1 : 0)}, this, f69262a, false, 79046, new Class[]{List.class, List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list3, list4, Byte.valueOf(z)}, this, f69262a, false, 79046, new Class[]{List.class, List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f69265d != null) {
            this.f69265d.a(list, list4, z);
        }
    }
}

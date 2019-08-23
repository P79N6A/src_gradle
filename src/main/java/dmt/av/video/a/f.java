package dmt.av.video.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.c;
import com.ss.android.vesdk.VEListener;

public final /* synthetic */ class f implements VEListener.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82838a;

    /* renamed from: b  reason: collision with root package name */
    static final VEListener.a f82839b = new f();

    private f() {
    }

    public final void a(String str, int i, byte[] bArr) {
        Object obj = str;
        Object obj2 = bArr;
        if (PatchProxy.isSupport(new Object[]{obj, Integer.valueOf(i), obj2}, this, f82838a, false, 92162, new Class[]{String.class, Integer.TYPE, byte[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj, Integer.valueOf(i), obj2}, this, f82838a, false, 92162, new Class[]{String.class, Integer.TYPE, byte[].class}, Void.TYPE);
            return;
        }
        if (i >= 0) {
            c a2 = c.a();
            if (PatchProxy.isSupport(new Object[]{obj, obj2}, a2, c.f67060a, false, 76602, new Class[]{String.class, byte[].class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{obj, obj2}, a2, c.f67060a, false, 76602, new Class[]{String.class, byte[].class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.f c2 = c.f67064f.c();
            if (PatchProxy.isSupport(new Object[]{obj, obj2}, c2, com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.f.f67075a, false, 76679, new Class[]{String.class, byte[].class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.f fVar = c2;
                PatchProxy.accessDispatch(new Object[]{obj, obj2}, fVar, com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.f.f67075a, false, 76679, new Class[]{String.class, byte[].class}, Void.TYPE);
            } else if (obj != null && obj2 != null) {
                c2.f67076b.put(obj, obj2);
            }
        }
    }
}

package dmt.av.video.a;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.x.a;
import com.ss.android.vesdk.p;
import dmt.av.video.t;
import dmt.av.video.u;
import java.util.Collection;

public final class j extends a {
    public static ChangeQuickRedirect j;
    private int k = -1;

    public final boolean a(VEVolumeChangeOp vEVolumeChangeOp) {
        if (PatchProxy.isSupport(new Object[]{vEVolumeChangeOp}, this, j, false, 92171, new Class[]{VEVolumeChangeOp.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{vEVolumeChangeOp}, this, j, false, 92171, new Class[]{VEVolumeChangeOp.class}, Boolean.TYPE)).booleanValue();
        }
        if (vEVolumeChangeOp.mType == 0) {
            this.g.a(0, 0, vEVolumeChangeOp.mVolume);
        } else if (vEVolumeChangeOp.mType == 1) {
            if (this.h != -1) {
                this.g.a(this.h, 1, vEVolumeChangeOp.mVolume);
            } else {
                this.k = this.g.k;
                if (this.k != -1) {
                    this.g.a(this.k, 1, vEVolumeChangeOp.mVolume);
                }
            }
        }
        return false;
    }

    public final boolean a(t tVar) {
        boolean z;
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{tVar}, this, j, false, 92172, new Class[]{t.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{tVar}, this, j, false, 92172, new Class[]{t.class}, Boolean.TYPE)).booleanValue();
        }
        if (this.h != -1) {
            this.g.d(this.h);
            this.h = -1;
        }
        String str = tVar.f83068f;
        if (PatchProxy.isSupport(new Object[]{str}, this, j, false, 92173, new Class[]{String.class}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, j, false, 92173, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (!TextUtils.isEmpty(str) && !com.ss.android.ugc.aweme.base.utils.j.a((Collection<T>) this.i)) {
            z = this.i.contains(str);
        } else {
            z = false;
        }
        if (z) {
            if (tVar.g == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.g.a(this.k, 1, tVar.f83067e);
            } else {
                this.g.a(0, 1, tVar.f83067e);
            }
        } else {
            this.k = this.g.k;
            if (this.k != -1) {
                this.g.a(this.k, 1, 0.0f);
            }
            if (tVar.f83064b == null) {
                return false;
            }
            if (tVar.f83066d == -1) {
                tVar.f83066d = this.g.t();
            }
            this.h = this.g.a(tVar.f83064b, tVar.f83065c, tVar.f83065c + tVar.f83066d, false);
            this.g.a(this.h, 1, tVar.f83067e);
        }
        return false;
    }

    public final int a(Context context, p pVar, u uVar) {
        u uVar2 = uVar;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{context, pVar, uVar2}, this, j, false, 92170, new Class[]{Context.class, p.class, u.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context, pVar, uVar2}, this, j, false, 92170, new Class[]{Context.class, p.class, u.class}, Integer.TYPE)).intValue();
        }
        super.a(context, pVar, uVar);
        a aVar = uVar2.mvCreateVideoData;
        if (aVar != null && !com.ss.android.ugc.aweme.base.utils.j.a((Collection<T>) aVar.selectMediaList) && !TextUtils.isEmpty(aVar.mvResZipPath)) {
            String[] strArr = new String[aVar.selectMediaList.size()];
            String[] strArr2 = new String[aVar.selectMediaList.size()];
            for (int i2 = 0; i2 < aVar.selectMediaList.size(); i2++) {
                strArr[i2] = aVar.selectMediaList.get(i2);
                strArr2[i2] = "img";
            }
            if (this.g != null) {
                i = this.g.a(aVar.mvResZipPath, strArr, strArr2);
            }
            this.i = aVar.musicIds;
        }
        return i;
    }
}

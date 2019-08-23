package com.ss.android.ugc.aweme.shortvideo;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.ui.f;
import com.ss.android.ugc.aweme.shortvideo.ui.z;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.tools.am;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ft extends ArrayList<TimeSpeedModelExtension> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* renamed from: a  reason: collision with root package name */
    transient am f67804a;
    @SuppressLint({"SerializableImplementsRule"})

    /* renamed from: b  reason: collision with root package name */
    transient FaceStickerBean f67805b;

    /* renamed from: c  reason: collision with root package name */
    transient c f67806c;

    public ft() {
    }

    public void removeLast() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 74703, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 74703, new Class[0], Void.TYPE);
            return;
        }
        remove(size() - 1);
    }

    public ft(@NonNull Collection<? extends TimeSpeedModelExtension> collection) {
        super(collection);
    }

    public long end(long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 74701, new Class[]{Long.TYPE}, Long.TYPE)) {
            return end(j, null, null, null);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 74701, new Class[]{Long.TYPE}, Long.TYPE)).longValue();
    }

    public void begin(am amVar, FaceStickerBean faceStickerBean, c cVar) {
        this.f67804a = amVar;
        this.f67805b = faceStickerBean;
        this.f67806c = cVar;
    }

    public long end(long j, @Nullable f fVar, @Nullable List<String> list, @Nullable List<String> list2) {
        String str;
        z zVar;
        String str2;
        long j2 = j;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), fVar, list, list2}, this, changeQuickRedirect, false, 74702, new Class[]{Long.TYPE, f.class, List.class, List.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{new Long(j2), fVar, list, list2}, this, changeQuickRedirect, false, 74702, new Class[]{Long.TYPE, f.class, List.class, List.class}, Long.TYPE)).longValue();
        } else if (this.f67804a != null) {
            if (this.f67805b == null || this.f67805b == FaceStickerBean.NONE) {
                z = true;
            }
            int i = (int) j2;
            double value = (double) this.f67804a.value();
            List<String> list3 = null;
            if (z) {
                str = null;
            } else {
                str = String.valueOf(this.f67805b.getStickerId());
            }
            if (z) {
                zVar = null;
            } else {
                zVar = this.f67805b.getStickerPoi();
            }
            if (this.f67805b == null) {
                str2 = null;
            } else {
                str2 = this.f67805b.getPropSource();
            }
            c cVar = this.f67806c;
            if (!z) {
                list3 = this.f67805b.getMusicIds();
            }
            TimeSpeedModelExtension timeSpeedModelExtension = new TimeSpeedModelExtension(i, value, str, zVar, str2, cVar, list3, fVar, list, list2);
            add(timeSpeedModelExtension);
            return TimeSpeedModelExtension.calculateRealTime(j2, (double) this.f67804a.value());
        } else if (!a.a()) {
            return 0;
        } else {
            throw new IllegalStateException("currentSpeed is null,mark sure that the begin method had been called before");
        }
    }
}

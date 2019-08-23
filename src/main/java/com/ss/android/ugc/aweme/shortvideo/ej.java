package com.ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ao.a.g;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.video.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class ej implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67528a;
    private static ej h;

    /* renamed from: b  reason: collision with root package name */
    public List<c> f67529b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public int f67530c;

    /* renamed from: d  reason: collision with root package name */
    public String f67531d;

    /* renamed from: e  reason: collision with root package name */
    public int f67532e;

    /* renamed from: f  reason: collision with root package name */
    public RecordScene f67533f;
    public volatile boolean g = false;
    private e i;

    public final e b() {
        return this.i;
    }

    private ej() {
    }

    public final boolean d() {
        int i2 = this.f67530c;
        if (i2 != 0) {
            switch (i2) {
                case 9:
                case 10:
                case 11:
                case SearchNilInfo.HIT_TYPE_SENSITIVE:
                    break;
                default:
                    return true;
            }
        }
        return false;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f67528a, false, 74429, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67528a, false, 74429, new Class[0], Void.TYPE);
            return;
        }
        this.f67529b.clear();
    }

    public static ej a() {
        if (PatchProxy.isSupport(new Object[0], null, f67528a, true, 74426, new Class[0], ej.class)) {
            return (ej) PatchProxy.accessDispatch(new Object[0], null, f67528a, true, 74426, new Class[0], ej.class);
        }
        if (h == null) {
            synchronized (ej.class) {
                if (h == null) {
                    h = new ej();
                }
            }
        }
        return h;
    }

    public final void a(@Nullable e eVar) {
        this.i = eVar;
    }

    public final void a(Collection<c> collection) {
        if (PatchProxy.isSupport(new Object[]{collection}, this, f67528a, false, 74427, new Class[]{Collection.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{collection}, this, f67528a, false, 74427, new Class[]{Collection.class}, Void.TYPE);
            return;
        }
        if (collection != null) {
            this.f67529b.clear();
            this.f67529b.addAll(collection);
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f67528a, false, 74430, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f67528a, false, 74430, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (a.a()) {
            if (i2 != 2) {
                switch (i2) {
                    case 9:
                    case 10:
                    case 11:
                    case SearchNilInfo.HIT_TYPE_SENSITIVE:
                        break;
                    default:
                        throw new IllegalArgumentException("unknown publish status: " + i2);
                }
            }
            this.f67530c = i2;
        } else {
            this.f67530c = i2;
        }
    }

    public final void a(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f67528a, false, 74428, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f67528a, false, 74428, new Class[]{c.class}, Void.TYPE);
        } else if (cVar != null && cVar.getCid() != null) {
            this.f67529b.clear();
            this.f67529b.add(cVar);
        }
    }

    public final void a(RecordScene recordScene) {
        RecordScene recordScene2 = recordScene;
        if (PatchProxy.isSupport(new Object[]{recordScene2}, this, f67528a, false, 74432, new Class[]{RecordScene.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recordScene2}, this, f67528a, false, 74432, new Class[]{RecordScene.class}, Void.TYPE);
            return;
        }
        if (!(recordScene2 == null || recordScene2.extractFramesModel == null)) {
            b.e(recordScene2.extractFramesModel.extractFramesDir);
            b.c(recordScene2.extractFramesModel.extractFramesDir);
        }
    }

    public final boolean a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f67528a, false, 74433, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, this, f67528a, false, 74433, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        if (!d() || !iAVService.getPublishService().isPublishServiceRunning(context2)) {
            return true;
        }
        com.bytedance.ies.dmt.ui.d.a.c(context.getApplicationContext(), (int) C0906R.string.es).a();
        return false;
    }
}

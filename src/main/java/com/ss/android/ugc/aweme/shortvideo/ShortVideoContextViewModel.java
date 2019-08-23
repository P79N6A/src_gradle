package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.NonNull;
import android.support.v4.util.ArrayMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.ExternalAVConstants;
import com.ss.android.ugc.aweme.story.shootvideo.d;

public class ShortVideoContextViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65400a;

    /* renamed from: b  reason: collision with root package name */
    public fh f65401b;

    /* renamed from: c  reason: collision with root package name */
    public MutableLiveData<Boolean> f65402c;

    /* renamed from: d  reason: collision with root package name */
    public MutableLiveData<Boolean> f65403d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayMap<String, Object> f65404e = new ArrayMap<>();

    /* renamed from: f  reason: collision with root package name */
    private MutableLiveData<Boolean> f65405f;
    private MutableLiveData<Boolean> g;

    public final long a() {
        if (PatchProxy.isSupport(new Object[0], this, f65400a, false, 74597, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f65400a, false, 74597, new Class[0], Long.TYPE)).longValue();
        }
        Long l = (Long) a("auto_stop_time");
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f65400a, false, 74599, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f65400a, false, 74599, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Boolean bool = (Boolean) a("auto_count_down");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f65400a, false, 74601, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f65400a, false, 74601, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Boolean bool = (Boolean) a("photo_mode");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @ExternalAVConstants.ShootMode
    public final int d() {
        if (PatchProxy.isSupport(new Object[0], this, f65400a, false, 74603, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f65400a, false, 74603, new Class[0], Integer.TYPE)).intValue();
        }
        Integer num = (Integer) a("shoot_mode");
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final boolean e() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f65400a, false, 74607, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f65400a, false, 74607, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (((Boolean) a("native_inited")) != null) {
            z = true;
        }
        return z;
    }

    public final boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, f65400a, false, 74609, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f65400a, false, 74609, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Boolean bool = (Boolean) a("has_stopped");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final boolean g() {
        if (PatchProxy.isSupport(new Object[0], this, f65400a, false, 74611, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f65400a, false, 74611, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Boolean bool = (Boolean) a("has_go_next");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean h() {
        if (PatchProxy.isSupport(new Object[0], this, f65400a, false, 74614, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f65400a, false, 74614, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Boolean bool = (Boolean) a("is_concat_running");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @NonNull
    public final MutableLiveData<Boolean> i() {
        if (PatchProxy.isSupport(new Object[0], this, f65400a, false, 74617, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f65400a, false, 74617, new Class[0], MutableLiveData.class);
        }
        if (this.f65405f == null) {
            this.f65405f = new MutableLiveData<>();
            this.f65405f.setValue(Boolean.TRUE);
        }
        return this.f65405f;
    }

    @NonNull
    public final LiveData<Boolean> j() {
        if (PatchProxy.isSupport(new Object[0], this, f65400a, false, 74619, new Class[0], LiveData.class)) {
            return (LiveData) PatchProxy.accessDispatch(new Object[0], this, f65400a, false, 74619, new Class[0], LiveData.class);
        }
        if (this.g == null) {
            this.g = new MutableLiveData<>();
        }
        return this.g;
    }

    public final boolean k() {
        if (!PatchProxy.isSupport(new Object[0], this, f65400a, false, 74624, new Class[0], Boolean.TYPE)) {
            return d.a(d());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f65400a, false, 74624, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean l() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f65400a, false, 74625, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f65400a, false, 74625, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (d() == 6) {
            z = true;
        }
        return z;
    }

    public final boolean m() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f65400a, false, 74626, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f65400a, false, 74626, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (d() == 7) {
            z = true;
        }
        return z;
    }

    private Object a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f65400a, false, 74595, new Class[]{String.class}, Object.class)) {
            return this.f65404e.get(str2);
        }
        return PatchProxy.accessDispatch(new Object[]{str2}, this, f65400a, false, 74595, new Class[]{String.class}, Object.class);
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f65400a, false, 74604, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f65400a, false, 74604, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a("tab_index", Integer.valueOf(i));
    }

    public final void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f65400a, false, 74606, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f65400a, false, 74606, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a("native_inited", Boolean.valueOf(z));
    }

    public final void d(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f65400a, false, 74608, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f65400a, false, 74608, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        i().setValue(Boolean.valueOf(z));
        a("has_stopped", Boolean.valueOf(z));
    }

    public final void e(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f65400a, false, 74610, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f65400a, false, 74610, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a("has_go_next", Boolean.valueOf(z));
    }

    public final void f(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f65400a, false, 74615, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f65400a, false, 74615, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a("is_concat_running", Boolean.valueOf(z));
    }

    public final void g(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f65400a, false, 74618, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f65400a, false, 74618, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.g == null) {
            this.g = new MutableLiveData<>();
        }
        this.g.setValue(Boolean.valueOf(z));
    }

    public final void a(@ExternalAVConstants.ShootMode int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f65400a, false, 74602, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f65400a, false, 74602, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a("shoot_mode", Integer.valueOf(i));
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f65400a, false, 74600, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f65400a, false, 74600, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a("photo_mode", Boolean.valueOf(z));
    }

    public final void a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f65400a, false, 74596, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f65400a, false, 74596, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        a("auto_stop_time", Long.valueOf(j));
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f65400a, false, 74598, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f65400a, false, 74598, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a("auto_count_down", Boolean.valueOf(z));
    }

    public final void a(String str, Object obj) {
        String str2 = str;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{str2, obj2}, this, f65400a, false, 74593, new Class[]{String.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, obj2}, this, f65400a, false, 74593, new Class[]{String.class, Object.class}, Void.TYPE);
            return;
        }
        this.f65404e.put(str2, obj2);
    }
}

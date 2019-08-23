package com.bytedance.android.livesdk.app.dataholder;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModelProvider;
import android.support.v4.util.LongSparseArray;
import com.bytedance.android.live.base.annotation.IgnoreStyleCheck;
import com.bytedance.android.livesdk.chatroom.model.a.p;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Iterator;

public class LinkCrossRoomDataHolder extends DataCenter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9027a;

    /* renamed from: b  reason: collision with root package name */
    public static final LinkCrossRoomDataHolder f9028b = new LinkCrossRoomDataHolder();
    private static LongSparseArray<LinkCrossRoomDataHolder> t = new LongSparseArray<>(2);
    private static long u;
    @IgnoreStyleCheck

    /* renamed from: c  reason: collision with root package name */
    public boolean f9029c;
    @IgnoreStyleCheck

    /* renamed from: d  reason: collision with root package name */
    public long f9030d;
    @IgnoreStyleCheck

    /* renamed from: e  reason: collision with root package name */
    public long f9031e;
    @IgnoreStyleCheck

    /* renamed from: f  reason: collision with root package name */
    public long f9032f;
    @IgnoreStyleCheck
    public int g;
    @IgnoreStyleCheck
    public boolean h;
    @IgnoreStyleCheck
    public int i;
    @IgnoreStyleCheck
    public String j = "";
    @IgnoreStyleCheck
    public long k;
    @IgnoreStyleCheck
    public int l;
    @IgnoreStyleCheck
    public String m;
    @IgnoreStyleCheck
    public int n;
    @IgnoreStyleCheck
    public long o;
    @IgnoreStyleCheck
    public int p;
    @IgnoreStyleCheck
    public int q = ((Integer) LiveConfigSettingKeys.PK_PENALTY_TIME.a()).intValue();
    @IgnoreStyleCheck
    public b r = b.HIDE;
    @IgnoreStyleCheck
    public f s = new f();

    public enum a {
        DISABLED,
        TURN_ON_ENGINE,
        TURN_ON_ENGINE_SUCCEED,
        SELF_JOIN,
        SELF_JOIN_SUCCEED,
        NOTIFY_JOIN,
        CONNECTION_SUCCEED,
        FINISH,
        FINISH_SUCCEED,
        TURN_OFF_ENGINE,
        TURN_OFF_ENGINE_SUCCEED,
        UNLOADED;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public enum b {
        SHOW,
        HIDE;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public enum c {
        UNFINISHED,
        LEFT_WON,
        RIGHT_WON,
        EVEN;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public enum d {
        DISABLED,
        PK,
        PENAL,
        FINISHED;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public enum e {
        DISABLED,
        READY,
        IN_PROCESS,
        ENDED;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static final class f {
        @IgnoreStyleCheck

        /* renamed from: a  reason: collision with root package name */
        public long f9033a;
        @IgnoreStyleCheck

        /* renamed from: b  reason: collision with root package name */
        public boolean f9034b;
        @IgnoreStyleCheck

        /* renamed from: c  reason: collision with root package name */
        public int f9035c;
        @IgnoreStyleCheck

        /* renamed from: d  reason: collision with root package name */
        public int f9036d;
        @IgnoreStyleCheck

        /* renamed from: e  reason: collision with root package name */
        public int f9037e;
        @IgnoreStyleCheck

        /* renamed from: f  reason: collision with root package name */
        public boolean f9038f;
        @IgnoreStyleCheck
        public int g;
        @IgnoreStyleCheck
        public boolean h;
    }

    public static LinkCrossRoomDataHolder a() {
        if (PatchProxy.isSupport(new Object[0], null, f9027a, true, 3149, new Class[0], LinkCrossRoomDataHolder.class)) {
            return (LinkCrossRoomDataHolder) PatchProxy.accessDispatch(new Object[0], null, f9027a, true, 3149, new Class[0], LinkCrossRoomDataHolder.class);
        }
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = (LinkCrossRoomDataHolder) t.get(u);
        if (linkCrossRoomDataHolder != null) {
            return linkCrossRoomDataHolder;
        }
        f9028b.c();
        return f9028b;
    }

    public void onCleared() {
        if (PatchProxy.isSupport(new Object[0], this, f9027a, false, 3154, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9027a, false, 3154, new Class[0], Void.TYPE);
            return;
        }
        super.onCleared();
        com.bytedance.android.live.core.c.a.b("DATA_CENTER", "DataCenter onCleared();");
    }

    public final com.bytedance.android.livesdk.j.c.f b() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f9027a, false, 3151, new Class[0], com.bytedance.android.livesdk.j.c.f.class)) {
            return (com.bytedance.android.livesdk.j.c.f) PatchProxy.accessDispatch(new Object[0], this, f9027a, false, 3151, new Class[0], com.bytedance.android.livesdk.j.c.f.class);
        }
        String str = "";
        String str2 = "";
        if (this.i > 0) {
            d dVar = (d) get("data_pk_state", d.PK);
            if (dVar.compareTo(d.PK) <= 0) {
                str = PushConstants.URI_PACKAGE_NAME;
            } else if (dVar == d.PENAL) {
                str = "punish";
            } else {
                str = "anchor";
            }
            if (this.p == 0) {
                str2 = "manual";
            } else {
                str2 = "random";
            }
        }
        com.bytedance.android.livesdk.j.c.f fVar = new com.bytedance.android.livesdk.j.c.f();
        fVar.f15678a = this.f9030d;
        fVar.f15679b = this.f9032f;
        fVar.f15680c = this.i;
        fVar.f15681d = str;
        fVar.f15682e = str2;
        fVar.f15683f = this.f9031e;
        fVar.g = this.j;
        if (this.s != null) {
            i2 = this.s.f9035c;
        }
        fVar.h = i2;
        return fVar;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f9027a, false, 3152, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9027a, false, 3152, new Class[0], Void.TYPE);
            return;
        }
        this.f9030d = 0;
        this.f9031e = 0;
        this.g = 0;
        this.f9032f = 0;
        this.h = false;
        this.f9029c = false;
        this.i = 0;
        this.j = "";
        this.k = 0;
        this.m = null;
        this.n = 0;
        this.o = 0;
        this.q = ((Integer) LiveConfigSettingKeys.PK_PENALTY_TIME.a()).intValue();
        this.s = new f();
    }

    public static void a(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, null, f9027a, true, 3150, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3)}, null, f9027a, true, 3150, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (((LinkCrossRoomDataHolder) t.get(j3)) != null) {
            t.remove(j3);
        }
    }

    public final LinkCrossRoomDataHolder a(p pVar, Room room) {
        boolean z;
        p pVar2 = pVar;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{pVar2, room}, this, f9027a, false, 3153, new Class[]{p.class, Room.class}, LinkCrossRoomDataHolder.class)) {
            return (LinkCrossRoomDataHolder) PatchProxy.accessDispatch(new Object[]{pVar2, room}, this, f9027a, false, 3153, new Class[]{p.class, Room.class}, LinkCrossRoomDataHolder.class);
        } else if (pVar2 == null) {
            return this;
        } else {
            if (pVar2.f11070a > 0) {
                this.f9030d = pVar2.f11070a;
                this.f9029c = true;
            }
            if (pVar2.f11073d != null) {
                Iterator<com.bytedance.android.livesdk.chatroom.model.a.b> it2 = pVar2.f11073d.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    com.bytedance.android.livesdk.chatroom.model.a.b next = it2.next();
                    if (room.getOwner().getId() != next.f11026a) {
                        this.f9032f = next.f11026a;
                        break;
                    }
                }
            }
            if (pVar2.f11072c != null) {
                if (pVar2.f11072c.f11028a > 0) {
                    this.f9030d = pVar2.f11072c.f11028a;
                }
                if (pVar2.f11072c.f11032e > 0) {
                    this.f9031e = pVar2.f11072c.f11032e;
                }
                if (pVar2.f11072c.f11029b > 0) {
                    this.i = pVar2.f11072c.f11029b;
                }
                if (pVar2.f11072c.f11031d > 0) {
                    this.k = pVar2.f11072c.f11031d;
                }
                if (!StringUtils.isEmpty(pVar2.f11072c.f11030c)) {
                    this.j = pVar2.f11072c.f11030c;
                }
                this.p = (int) pVar2.f11072c.f11033f;
            }
            if (!(pVar2.f11074e == null || pVar2.f11074e.f11019b == null)) {
                this.s.g = pVar2.f11074e.f11019b.j;
                this.s.f9035c = pVar2.f11074e.f11019b.f11022c;
                this.s.f9036d = pVar2.f11074e.f11019b.f11023d;
                this.s.f9037e = pVar2.f11074e.f11019b.f11024e;
                this.s.f9033a = pVar2.f11074e.f11019b.f11020a;
                this.s.h = pVar2.f11074e.f11019b.g;
                f fVar = this.s;
                if (pVar2.f11074e.f11019b.h != 0) {
                    z = true;
                } else {
                    z = false;
                }
                fVar.f9038f = z;
                f fVar2 = this.s;
                if (room.getOwner().getId() == pVar2.f11074e.f11019b.f11025f) {
                    z2 = true;
                }
                fVar2.f9034b = z2;
            }
            return this;
        }
    }

    public static LinkCrossRoomDataHolder a(long j2, ViewModelProvider viewModelProvider, LifecycleOwner lifecycleOwner) {
        long j3 = j2;
        ViewModelProvider viewModelProvider2 = viewModelProvider;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), viewModelProvider2, lifecycleOwner2}, null, f9027a, true, 3148, new Class[]{Long.TYPE, ViewModelProvider.class, LifecycleOwner.class}, LinkCrossRoomDataHolder.class)) {
            return (LinkCrossRoomDataHolder) PatchProxy.accessDispatch(new Object[]{new Long(j3), viewModelProvider2, lifecycleOwner2}, null, f9027a, true, 3148, new Class[]{Long.TYPE, ViewModelProvider.class, LifecycleOwner.class}, LinkCrossRoomDataHolder.class);
        }
        a(j2);
        u = j3;
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = (LinkCrossRoomDataHolder) viewModelProvider2.get(LinkCrossRoomDataHolder.class);
        linkCrossRoomDataHolder.lifecycleOwner = lifecycleOwner2;
        t.put(j3, linkCrossRoomDataHolder);
        return linkCrossRoomDataHolder;
    }
}

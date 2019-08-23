package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.text.TextUtils;
import android.util.LongSparseArray;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.l;
import com.bytedance.android.livesdk.gift.model.i;
import com.bytedance.android.livesdk.gift.p;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.j.c.k;
import com.bytedance.android.livesdk.j.c.m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;

public class GiftDialogViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15262a;
    public i A;
    public int B;
    public LongSparseArray<Integer> C;
    public a D;
    private List<MutableLiveData> E;
    private boolean F;

    /* renamed from: b  reason: collision with root package name */
    public boolean f15263b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f15264c = true;

    /* renamed from: d  reason: collision with root package name */
    public d f15265d = d.ANCHOR;

    /* renamed from: e  reason: collision with root package name */
    public int f15266e = 1;

    /* renamed from: f  reason: collision with root package name */
    public Room f15267f;
    public User g;
    public ab h;
    public boolean i;
    public MutableLiveData<ab> j;
    public MutableLiveData<Boolean> k;
    public MutableLiveData<Boolean> l;
    public MutableLiveData<User> m;
    public MutableLiveData<Boolean> n;
    public MutableLiveData<Boolean> o;
    public MutableLiveData<com.bytedance.android.livesdk.gift.panel.a.c> p;
    public MutableLiveData<Boolean> q;
    public MutableLiveData<Boolean> r;
    public MutableLiveData<com.bytedance.android.livesdk.gift.model.a.a> s;
    public MutableLiveData<com.bytedance.android.livesdk.gift.panel.a.b> t;
    public MutableLiveData<Boolean> u;
    public MutableLiveData<ab> v;
    public MutableLiveData<Integer> w;
    public MutableLiveData<Integer> x;
    public MutableLiveData<Boolean> y;
    public MutableLiveData<b> z;

    public interface a {
        int a(long j);
    }

    public enum b {
        DIAMOND,
        GOLDEN_BEAN;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public enum c {
        NORMAL,
        GIFT,
        DOODLE_GIFT,
        PROP,
        TASK_GIFT,
        GIFT_AD;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public enum d {
        ANCHOR,
        GUEST,
        OFFICIAL_GUEST;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public final int a() {
        if (this.f15266e > 0) {
            return this.f15266e;
        }
        return 1;
    }

    public final void c() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f15262a, false, 9944, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15262a, false, 9944, new Class[0], Void.TYPE);
        } else if (this.B > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("source", String.valueOf(this.f15267f.getUserFrom()));
            hashMap.put("request_id", this.f15267f.getRequestId());
            hashMap.put("log_pb", this.f15267f.getLog_pb());
            if (this.s.getValue() == null) {
                hashMap.put("gift_id", "-1");
            } else {
                hashMap.put("gift_id", String.valueOf(((com.bytedance.android.livesdk.gift.model.a.a) this.s.getValue()).o()));
            }
            hashMap.put("gift_cnt", String.valueOf(this.B));
            com.bytedance.android.livesdk.j.a a2 = com.bytedance.android.livesdk.j.a.a();
            Object[] objArr = new Object[2];
            j jVar = new j();
            if (this.f15263b) {
                str = "live_take_detail";
            } else {
                str = "live_detail";
            }
            objArr[0] = jVar.a(str).c("bottom_tab").b("live_interact").f("other");
            objArr[1] = Room.class;
            a2.a("send_pop_gift", hashMap, objArr);
            this.B = 0;
        }
    }

    public GiftDialogViewModel() {
        boolean z2 = true;
        this.F = (((Integer) LiveSettingKeys.LIVE_GIFT_DIALOG_STYLE.a()).intValue() != 1 || !com.bytedance.android.live.uikit.a.a.a()) ? false : z2;
        this.B = 0;
        this.C = new LongSparseArray<>();
        this.D = new a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f15268a;

            public final int a(long j) {
                long j2 = j;
                if (!PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f15268a, false, 9948, new Class[]{Long.TYPE}, Integer.TYPE)) {
                    return GiftDialogViewModel.this.C.get(j2, -1).intValue();
                }
                return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f15268a, false, 9948, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
            }
        };
        this.j = new MutableLiveData<>();
        this.k = new MutableLiveData<>();
        this.l = new MutableLiveData<>();
        this.m = new MutableLiveData<>();
        this.n = new MutableLiveData<>();
        this.o = new MutableLiveData<>();
        this.p = new MutableLiveData<>();
        this.q = new MutableLiveData<>();
        this.r = new MutableLiveData<>();
        this.s = new MutableLiveData<>();
        this.t = new MutableLiveData<>();
        this.u = new MutableLiveData<>();
        this.v = new MutableLiveData<>();
        this.w = new MutableLiveData<>();
        this.x = new MutableLiveData<>();
        this.y = new MutableLiveData<>();
        this.z = new MutableLiveData<>();
        this.E = new ArrayList();
        this.E.add(this.j);
        this.E.add(this.k);
        this.E.add(this.l);
        this.E.add(this.m);
        this.E.add(this.n);
        this.E.add(this.o);
        this.E.add(this.p);
        this.E.add(this.q);
        this.E.add(this.r);
        this.E.add(this.s);
        this.E.add(this.t);
        this.E.add(this.u);
        this.E.add(this.v);
        this.E.add(this.w);
        this.E.add(this.x);
        this.E.add(this.y);
        this.E.add(this.z);
    }

    public final void b() {
        int i2;
        int i3;
        int i4;
        String str;
        int i5;
        int i6;
        int i7;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, f15262a, false, 9943, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15262a, false, 9943, new Class[0], Void.TYPE);
        } else if (this.A != null && this.A.f15133e != -1 && this.A.h > 0) {
            com.bytedance.android.livesdk.gift.model.b findGiftById = GiftManager.inst().findGiftById(this.A.f15133e);
            if (findGiftById != null) {
                if (this.F || !(findGiftById.f15106e == 2 || findGiftById.f15106e == 8)) {
                    if (this.A.l > 0) {
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        Long valueOf = Long.valueOf(this.A.l);
                        if (findGiftById.f15106e == 2) {
                            i5 = 1;
                        } else {
                            i5 = this.A.h;
                        }
                        hashMap2.put(valueOf, Integer.valueOf(i5));
                        hashMap.put("prop_info", com.bytedance.android.livesdk.gift.e.a.a(hashMap2));
                        if (findGiftById.f15106e == 2) {
                            i6 = 1;
                        } else {
                            i6 = this.A.h;
                        }
                        hashMap.put("gift_cnt", String.valueOf(i6));
                        if (findGiftById.f15106e == 2) {
                            i7 = 1;
                        } else {
                            i7 = this.A.h;
                        }
                        hashMap.put("money", String.valueOf(i7 * findGiftById.f15107f));
                        if (!(this.g == null || this.g.getId() == this.f15267f.getOwnerUserId())) {
                            hashMap.put("to_user_id", String.valueOf(this.g.getId()));
                        }
                        com.bytedance.android.livesdk.j.a a2 = com.bytedance.android.livesdk.j.a.a();
                        Object[] objArr = new Object[5];
                        j jVar = new j();
                        if (this.f15263b) {
                            str2 = "live_take_detail";
                        } else {
                            str2 = "live_detail";
                        }
                        objArr[0] = jVar.a(str2).c("bottom_tab").b("live_interact").f("other");
                        objArr[1] = Room.class;
                        objArr[2] = l.a(this.A);
                        objArr[3] = ((com.bytedance.android.live.d.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.d.a.class)).getLinkCrossRoomLog();
                        objArr[4] = new k();
                        a2.a("send_prop", hashMap, objArr);
                    } else {
                        int a3 = this.D.a(this.A.f15133e);
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put("gift_position", String.valueOf(a3));
                        if (!TextUtils.isEmpty(this.A.t)) {
                            hashMap3.put("request_page", this.A.t);
                        }
                        HashMap hashMap4 = new HashMap();
                        Long valueOf2 = Long.valueOf(this.A.f15133e);
                        if (findGiftById.f15106e == 2) {
                            i2 = 1;
                        } else {
                            i2 = this.A.h;
                        }
                        hashMap4.put(valueOf2, Integer.valueOf(i2));
                        hashMap3.put("gift_info", com.bytedance.android.livesdk.gift.e.a.a(hashMap4));
                        if (findGiftById.f15106e == 2) {
                            i3 = 1;
                        } else {
                            i3 = this.A.h;
                        }
                        hashMap3.put("gift_cnt", String.valueOf(i3));
                        if (findGiftById.f15106e == 2) {
                            i4 = 1;
                        } else {
                            i4 = this.A.h;
                        }
                        hashMap3.put("money", String.valueOf(i4 * findGiftById.f15107f));
                        if (com.bytedance.android.live.uikit.a.a.c()) {
                            hashMap3.put("request_page", "normal");
                            hashMap3.put("orientation", this.f15267f.getOrientation());
                        }
                        if (!(this.g == null || this.g.getId() == this.f15267f.getOwnerUserId())) {
                            hashMap3.put("to_user_id", String.valueOf(this.g.getId()));
                        }
                        hashMap3.put("is_first_consume", String.valueOf(((com.bytedance.android.live.f.b) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.f.b.class)).isFirstConsume(((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().a())));
                        hashMap3.put("growth_deepevent", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                        if (findGiftById.f15106e == 10) {
                            hashMap3.put("gift_type", "coin_gift");
                        }
                        com.bytedance.android.livesdk.j.a a4 = com.bytedance.android.livesdk.j.a.a();
                        Object[] objArr2 = new Object[4];
                        j jVar2 = new j();
                        if (this.f15263b) {
                            str = "live_take_detail";
                        } else {
                            str = "live_detail";
                        }
                        objArr2[0] = jVar2.a(str).c("bottom_tab").b("live_interact").f("other");
                        objArr2[1] = Room.class;
                        objArr2[2] = l.a(this.A);
                        objArr2[3] = ((com.bytedance.android.live.d.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.d.a.class)).getLinkCrossRoomLog();
                        a4.a("send_gift", hashMap3, objArr2);
                    }
                    this.A = null;
                }
            }
        }
    }

    public final void a(LifecycleOwner lifecycleOwner) {
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner2}, this, f15262a, false, 9939, new Class[]{LifecycleOwner.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner2}, this, f15262a, false, 9939, new Class[]{LifecycleOwner.class}, Void.TYPE);
            return;
        }
        for (MutableLiveData removeObservers : this.E) {
            removeObservers.removeObservers(lifecycleOwner2);
        }
    }

    public final void a(String str, int i2, long j2, com.bytedance.android.livesdk.gift.panel.a.b bVar) {
        String str2;
        JSONObject jSONObject;
        int i3;
        String str3;
        int i4;
        String str4;
        String str5;
        String str6 = str;
        long j3 = j2;
        com.bytedance.android.livesdk.gift.panel.a.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{str6, Integer.valueOf(i2), new Long(j3), bVar2}, this, f15262a, false, 9946, new Class[]{String.class, Integer.TYPE, Long.TYPE, com.bytedance.android.livesdk.gift.panel.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str6, Integer.valueOf(i2), new Long(j3), bVar2}, this, f15262a, false, 9946, new Class[]{String.class, Integer.TYPE, Long.TYPE, com.bytedance.android.livesdk.gift.panel.a.b.class}, Void.TYPE);
            return;
        }
        if (d.GUEST == this.f15265d) {
            str2 = "guest_tuya_gift";
        } else {
            str2 = "tuya_gift";
        }
        String str7 = str2;
        HashSet hashSet = new HashSet();
        try {
            Class[] clsArr = new Class[0];
            com.bytedance.android.livesdk.gift.panel.a.c cVar = (com.bytedance.android.livesdk.gift.panel.a.c) this.p.getValue();
            HashSet hashSet2 = hashSet;
            if (PatchProxy.isSupport(new Object[0], this, f15262a, false, 9947, clsArr, JSONObject.class)) {
                jSONObject = (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f15262a, false, 9947, new Class[0], JSONObject.class);
            } else {
                jSONObject = new JSONObject();
                jSONObject.put("UID", ((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().b());
                jSONObject.put("room_id", this.f15267f.getId());
                jSONObject.put("source", this.f15267f.getUserFrom());
                jSONObject.put("request_id", this.f15267f.getRequestId());
                jSONObject.put("log_pb", this.f15267f.getLog_pb());
                if (!TextUtils.isEmpty(this.f15267f.getSourceType())) {
                    jSONObject.put("moment_room_source", this.f15267f.getSourceType());
                }
            }
            if (cVar.f15171a == c.DOODLE_GIFT) {
                int i5 = 0;
                for (p next : cVar.f15175e.f15167a) {
                    hashSet2.add(Long.valueOf(next.f15145c));
                    i5 += next.f15146d;
                }
                jSONObject.put("gift_id", hashSet2);
                i3 = i5;
            } else {
                i3 = 0;
            }
            if (this.f15265d == d.GUEST) {
                jSONObject.put("UID", this.g.getId());
            }
            jSONObject.put("enter_from", str6);
            if (this.f15263b) {
                str3 = "live_take_detail";
            } else {
                str3 = "live_detail";
            }
            jSONObject.put("event_page", str3);
            HashMap hashMap = new HashMap();
            long j4 = 0;
            if (j3 != 0) {
                hashMap.put("team_id", String.valueOf(j2));
                if (this.g == null) {
                    str5 = "";
                } else {
                    str5 = this.g.getIdStr();
                }
                hashMap.put("top_anchor_id", str5);
            }
            hashMap.put("request_id", this.f15267f.getRequestId());
            hashMap.put("log_pb", this.f15267f.getLog_pb());
            hashMap.put("gift_cnt", String.valueOf(i2));
            HashMap hashMap2 = new HashMap();
            if (bVar2 == null || Lists.isEmpty(bVar2.f15167a)) {
                hashMap2.put(998L, 1);
            } else {
                for (p next2 : bVar2.f15167a) {
                    if (!hashMap2.containsKey(Long.valueOf(next2.f15145c))) {
                        hashMap2.put(Long.valueOf(next2.f15145c), 1);
                    } else {
                        hashMap2.put(Long.valueOf(next2.f15145c), Integer.valueOf(((Integer) hashMap2.get(Long.valueOf(next2.f15145c))).intValue() + 1));
                    }
                }
            }
            hashMap.put("gift_info", com.bytedance.android.livesdk.gift.e.a.a(hashMap2));
            hashMap.put("is_first_consume", String.valueOf(((com.bytedance.android.live.f.b) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.f.b.class)).isFirstConsume(((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().a())));
            hashMap.put("growth_deepevent", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            com.bytedance.android.livesdk.j.a a2 = com.bytedance.android.livesdk.j.a.a();
            Object[] objArr = new Object[4];
            String obj = hashSet2.toString();
            if (this.f15265d == d.GUEST) {
                i4 = com.bytedance.android.livesdk.j.c.i.f15692b;
            } else {
                i4 = com.bytedance.android.livesdk.j.c.i.f15691a;
            }
            int i6 = i4;
            if (this.g != null) {
                j4 = this.g.getId();
            }
            m mVar = new m(str7, obj, i3, i6, j4);
            objArr[0] = mVar;
            j jVar = new j();
            if (this.f15263b) {
                str4 = "live_take_detail";
            } else {
                str4 = "live_detail";
            }
            objArr[1] = jVar.a(str4).c("bottom_tab").b("live_interact").f("other");
            objArr[2] = Room.class;
            objArr[3] = ((com.bytedance.android.live.d.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.d.a.class)).getLinkCrossRoomLog();
            a2.a("send_gift", hashMap, objArr);
        } catch (Exception e2) {
            com.bytedance.android.live.core.c.a.c("GiftDialogViewModel", e2.toString());
        }
    }
}

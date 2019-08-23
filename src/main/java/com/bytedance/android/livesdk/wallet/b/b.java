package com.bytedance.android.livesdk.wallet.b;

import com.bytedance.android.live.base.model.user.i;
import com.bytedance.android.live.core.d.d;
import com.bytedance.android.live.core.d.e;
import com.bytedance.android.livesdk.j.a.a;
import com.bytedance.android.livesdk.wallet.monitor.RechargeMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17975a;

    public static com.bytedance.android.live.b.b a(String str) {
        final String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f17975a, true, 14254, new Class[]{String.class}, com.bytedance.android.live.b.b.class)) {
            return new com.bytedance.android.live.b.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f17976a;

                public final void a(HashMap<String, Object> hashMap) {
                    HashMap<String, Object> hashMap2 = hashMap;
                    if (PatchProxy.isSupport(new Object[]{hashMap2}, this, f17976a, false, 14256, new Class[]{HashMap.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{hashMap2}, this, f17976a, false, 14256, new Class[]{HashMap.class}, Void.TYPE);
                        return;
                    }
                    e.a(d.a(str2), 0, (Map<String, Object>) hashMap2);
                }

                public final void a(long j, HashMap<String, Object> hashMap) {
                    long j2 = j;
                    HashMap<String, Object> hashMap2 = hashMap;
                    if (PatchProxy.isSupport(new Object[]{new Long(j2), hashMap2}, this, f17976a, false, 14257, new Class[]{Long.TYPE, HashMap.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{new Long(j2), hashMap2}, this, f17976a, false, 14257, new Class[]{Long.TYPE, HashMap.class}, Void.TYPE);
                        return;
                    }
                    e.a(d.a(str2), 1, j2, (Map<String, Object>) hashMap2);
                }

                public final void b(long j, HashMap<String, Object> hashMap) {
                    long j2 = j;
                    HashMap<String, Object> hashMap2 = hashMap;
                    if (PatchProxy.isSupport(new Object[]{new Long(j2), hashMap2}, this, f17976a, false, 14258, new Class[]{Long.TYPE, HashMap.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{new Long(j2), hashMap2}, this, f17976a, false, 14258, new Class[]{Long.TYPE, HashMap.class}, Void.TYPE);
                        return;
                    }
                    e.a(d.a(str2), 2, j2, (Map<String, Object>) hashMap2);
                    e.a(d.b(str2), 2, j2, (Map<String, Object>) hashMap2);
                    a.a().a(com.bytedance.android.livesdk.j.a.b.Recharge.info, str2, 1, (Map) hashMap2);
                }

                public final void c(long j, HashMap<String, Object> hashMap) {
                    long j2 = j;
                    HashMap<String, Object> hashMap2 = hashMap;
                    if (PatchProxy.isSupport(new Object[]{new Long(j2), hashMap2}, this, f17976a, false, 14259, new Class[]{Long.TYPE, HashMap.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{new Long(j2), hashMap2}, this, f17976a, false, 14259, new Class[]{Long.TYPE, HashMap.class}, Void.TYPE);
                        return;
                    }
                    e.a(d.a(str2), 3, j2, (Map<String, Object>) hashMap2);
                }
            };
        }
        return (com.bytedance.android.live.b.b) PatchProxy.accessDispatch(new Object[]{str2}, null, f17975a, true, 14254, new Class[]{String.class}, com.bytedance.android.live.b.b.class);
    }

    public static int a(i iVar) {
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{iVar}, null, f17975a, true, 14255, new Class[]{i.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{iVar}, null, f17975a, true, 14255, new Class[]{i.class}, Integer.TYPE)).intValue();
        }
        if (iVar.getUserHonor() == null || iVar.getUserHonor().o() == null || iVar.getUserHonor().o().size() <= 1 || iVar.getUserHonor().o().get(1) == null || iVar.getUserHonor().o().get(1).f7769e != 0) {
            i = 0;
        }
        return i;
    }

    public static void b(int i, Map<String, Object> map) {
        int i2 = i;
        Map<String, Object> map2 = map;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), map2}, null, f17975a, true, 14233, new Class[]{Integer.TYPE, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), map2}, null, f17975a, true, 14233, new Class[]{Integer.TYPE, Map.class}, Void.TYPE);
            return;
        }
        e.a(d.b("ttlive_charge_client_pay_result"), i2, map2);
        a.a().a(com.bytedance.android.livesdk.j.a.b.Recharge.info, "ttlive_charge_client_pay_result", i2, (Map) map2);
    }

    public static void a(int i, Map<String, Object> map) {
        Map<String, Object> map2 = map;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), map2}, null, f17975a, true, 14232, new Class[]{Integer.TYPE, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), map2}, null, f17975a, true, 14232, new Class[]{Integer.TYPE, Map.class}, Void.TYPE);
            return;
        }
        e.a(d.a("ttlive_charge_client_pay_result"), i, map2);
    }

    public static void b(int i, long j, Map<String, Object> map) {
        int i2 = i;
        long j2 = j;
        Map<String, Object> map2 = map;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2), map2}, null, f17975a, true, 14235, new Class[]{Integer.TYPE, Long.TYPE, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2), map2}, null, f17975a, true, 14235, new Class[]{Integer.TYPE, Long.TYPE, Map.class}, Void.TYPE);
            return;
        }
        e.a(d.b("ttlive_charge_get_order_status"), i2, j2, map2);
        a.a().a(com.bytedance.android.livesdk.j.a.b.Recharge.info, "ttlive_charge_get_order_status", i2, (Map) map2);
    }

    public static void c(int i, long j, Map<String, Object> map) {
        long j2 = j;
        Map<String, Object> map2 = map;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2), map2}, null, f17975a, true, 14236, new Class[]{Integer.TYPE, Long.TYPE, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2), map2}, null, f17975a, true, 14236, new Class[]{Integer.TYPE, Long.TYPE, Map.class}, Void.TYPE);
            return;
        }
        e.a(d.a("ttlive_charge_get_order_status_api"), i, j2, map2);
    }

    public static void d(int i, long j, Map<String, Object> map) {
        long j2 = j;
        Map<String, Object> map2 = map;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2), map2}, null, f17975a, true, 14240, new Class[]{Integer.TYPE, Long.TYPE, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2), map2}, null, f17975a, true, 14240, new Class[]{Integer.TYPE, Long.TYPE, Map.class}, Void.TYPE);
            return;
        }
        e.a(d.a("ttlive_charge_package_list_status"), i, j2, map2);
    }

    public static void e(int i, long j, Map<String, Object> map) {
        long j2 = j;
        Map<String, Object> map2 = map;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2), map2}, null, f17975a, true, 14246, new Class[]{Integer.TYPE, Long.TYPE, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2), map2}, null, f17975a, true, 14246, new Class[]{Integer.TYPE, Long.TYPE, Map.class}, Void.TYPE);
            return;
        }
        e.a(d.a("ttlive_charge_order"), i, j2, map2);
    }

    public static void f(int i, long j, Map<String, Object> map) {
        long j2 = j;
        Map<String, Object> map2 = map;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2), map2}, null, f17975a, true, 14247, new Class[]{Integer.TYPE, Long.TYPE, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2), map2}, null, f17975a, true, 14247, new Class[]{Integer.TYPE, Long.TYPE, Map.class}, Void.TYPE);
            return;
        }
        e.a(d.b("ttlive_charge_order"), i, j2, map2);
    }

    public static void g(int i, long j, Map<String, Object> map) {
        long j2 = j;
        Map<String, Object> map2 = map;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2), map2}, null, f17975a, true, 14250, new Class[]{Integer.TYPE, Long.TYPE, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2), map2}, null, f17975a, true, 14250, new Class[]{Integer.TYPE, Long.TYPE, Map.class}, Void.TYPE);
            return;
        }
        e.a(d.a("ttlive_charge_current_diamond_status"), i, j2, map2);
    }

    public static void h(int i, long j, Map<String, Object> map) {
        long j2 = j;
        Map<String, Object> map2 = map;
        if (PatchProxy.isSupport(new Object[]{1, new Long(j2), map2}, null, f17975a, true, 14251, new Class[]{Integer.TYPE, Long.TYPE, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{1, new Long(j2), map2}, null, f17975a, true, 14251, new Class[]{Integer.TYPE, Long.TYPE, Map.class}, Void.TYPE);
            return;
        }
        e.a(d.b("ttlive_charge_current_diamond_status"), 1, j2, map2);
    }

    public static void i(int i, long j, Map<String, Object> map) {
        long j2 = j;
        Map<String, Object> map2 = map;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2), map2}, null, f17975a, true, 14252, new Class[]{Integer.TYPE, Long.TYPE, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2), map2}, null, f17975a, true, 14252, new Class[]{Integer.TYPE, Long.TYPE, Map.class}, Void.TYPE);
            return;
        }
        e.a(d.a("ttlive_charge_pay_param_status"), i, j2, map2);
    }

    public static void a(int i, long j, Map<String, Object> map) {
        long j2 = j;
        Map<String, Object> map2 = map;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2), map2}, null, f17975a, true, 14234, new Class[]{Integer.TYPE, Long.TYPE, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2), map2}, null, f17975a, true, 14234, new Class[]{Integer.TYPE, Long.TYPE, Map.class}, Void.TYPE);
            return;
        }
        e.a(d.a("ttlive_charge_get_order_status"), i, j2, map2);
    }

    public static void a(@RechargeMonitor.RechargeDomain int i, int i2, long j, Map<String, Object> map) {
        long j2 = j;
        Map<String, Object> map2 = map;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), new Long(j2), map2}, null, f17975a, true, 14248, new Class[]{Integer.TYPE, Integer.TYPE, Long.TYPE, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), new Long(j2), map2}, null, f17975a, true, 14248, new Class[]{Integer.TYPE, Integer.TYPE, Long.TYPE, Map.class}, Void.TYPE);
            return;
        }
        e.a(d.a("ttlive_charge_pay_sequence"), i2 + i, j2, map2);
    }

    public static void b(@RechargeMonitor.RechargeDomain int i, int i2, long j, Map<String, Object> map) {
        Map<String, Object> map2 = map;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), 0L, map2}, null, f17975a, true, 14249, new Class[]{Integer.TYPE, Integer.TYPE, Long.TYPE, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), 0L, map2}, null, f17975a, true, 14249, new Class[]{Integer.TYPE, Integer.TYPE, Long.TYPE, Map.class}, Void.TYPE);
            return;
        }
        e.a(d.b("ttlive_charge_pay_sequence"), i2 + i, 0, map2);
    }
}

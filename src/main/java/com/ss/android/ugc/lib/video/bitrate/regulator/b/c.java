package com.ss.android.ugc.lib.video.bitrate.regulator.b;

import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.lib.video.bitrate.regulator.b.a;
import com.ss.android.ugc.lib.video.bitrate.regulator.b.d;
import com.taobao.android.dexposed.ClassUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class c extends a {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f77693f;
    public e g;

    public static class a extends a.C0823a {

        /* renamed from: e  reason: collision with root package name */
        public static ChangeQuickRedirect f77694e;

        public final e a() {
            if (PatchProxy.isSupport(new Object[0], this, f77694e, false, 90500, new Class[0], e.class)) {
                return (e) PatchProxy.accessDispatch(new Object[0], this, f77694e, false, 90500, new Class[0], e.class);
            }
            c cVar = new c(this.f77687a, (byte) 0);
            e a2 = new d.a(this.f77687a).a(this.f77688b).b(this.f77689c).a(this.f77690d).a();
            a2.a(this.f77688b);
            a2.b(this.f77689c);
            a2.a(this.f77690d);
            cVar.g = a2;
            return cVar;
        }

        public a(com.ss.android.ugc.lib.video.bitrate.regulator.a.d dVar) {
            super(dVar);
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f77695a;

        /* renamed from: b  reason: collision with root package name */
        public Map<String, Object> f77696b = new HashMap();

        public final Map<String, Object> a() {
            if (PatchProxy.isSupport(new Object[0], this, f77695a, false, 90518, new Class[0], Map.class)) {
                return (Map) PatchProxy.accessDispatch(new Object[0], this, f77695a, false, 90518, new Class[0], Map.class);
            }
            try {
                int indexOf = Build.VERSION.RELEASE.indexOf(ClassUtils.PACKAGE_SEPARATOR);
                if (indexOf < 0) {
                    indexOf = Build.VERSION.RELEASE.length();
                }
                f(Integer.valueOf(Build.VERSION.RELEASE.substring(0, indexOf)).intValue());
            } catch (NumberFormatException unused) {
                f(0);
            }
            return this.f77696b;
        }

        private b f(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f77695a, false, 90517, new Class[]{Integer.TYPE}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f77695a, false, 90517, new Class[]{Integer.TYPE}, b.class);
            }
            this.f77696b.put("os_ver", Integer.valueOf(i));
            return this;
        }

        public final b a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f77695a, false, 90504, new Class[]{Integer.TYPE}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f77695a, false, 90504, new Class[]{Integer.TYPE}, b.class);
            }
            this.f77696b.put("tcp_rtt", Integer.valueOf(i));
            return this;
        }

        public final b b(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f77695a, false, 90505, new Class[]{Integer.TYPE}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f77695a, false, 90505, new Class[]{Integer.TYPE}, b.class);
            }
            this.f77696b.put("tcp_bandwith", Integer.valueOf(i));
            return this;
        }

        public final b c(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f77695a, false, 90506, new Class[]{Integer.TYPE}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f77695a, false, 90506, new Class[]{Integer.TYPE}, b.class);
            }
            this.f77696b.put("http_rtt", Integer.valueOf(i));
            return this;
        }

        public final b d(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f77695a, false, 90507, new Class[]{Integer.TYPE}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f77695a, false, 90507, new Class[]{Integer.TYPE}, b.class);
            }
            this.f77696b.put("signal", Integer.valueOf(i));
            return this;
        }

        public final b e(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f77695a, false, 90509, new Class[]{Integer.TYPE}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f77695a, false, 90509, new Class[]{Integer.TYPE}, b.class);
            }
            this.f77696b.put("carrier", Integer.valueOf(i));
            return this;
        }

        public final b a(List<Integer> list) {
            int i;
            int i2;
            int i3;
            if (PatchProxy.isSupport(new Object[]{list}, this, f77695a, false, 90510, new Class[]{List.class}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{list}, this, f77695a, false, 90510, new Class[]{List.class}, b.class);
            } else if (list == null) {
                return this;
            } else {
                if (list.size() > 0) {
                    i = list.get(0).intValue();
                } else {
                    i = 0;
                }
                Map<String, Object> map = this.f77696b;
                int i4 = i / 8000;
                if (i4 < 0) {
                    i4 = 0;
                }
                map.put("internet_speed_0", Integer.valueOf(i4));
                if (list.size() >= 2) {
                    i2 = list.get(1).intValue();
                } else {
                    i2 = 0;
                }
                Map<String, Object> map2 = this.f77696b;
                int i5 = i2 / 8000;
                if (i5 < 0) {
                    i5 = 0;
                }
                map2.put("internet_speed_1", Integer.valueOf(i5));
                if (list.size() >= 3) {
                    i3 = list.get(2).intValue();
                } else {
                    i3 = 0;
                }
                Map<String, Object> map3 = this.f77696b;
                int i6 = i3 / 8000;
                if (i6 < 0) {
                    i6 = 0;
                }
                map3.put("internet_speed_2", Integer.valueOf(i6));
                return this;
            }
        }

        public final b b(List<Integer> list) {
            int i;
            int i2;
            int i3 = 0;
            if (PatchProxy.isSupport(new Object[]{list}, this, f77695a, false, 90511, new Class[]{List.class}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{list}, this, f77695a, false, 90511, new Class[]{List.class}, b.class);
            } else if (list == null) {
                return this;
            } else {
                Map<String, Object> map = this.f77696b;
                if (list.size() > 0) {
                    i = list.get(0).intValue();
                } else {
                    i = 0;
                }
                map.put("block_cnt_0", Integer.valueOf(i));
                Map<String, Object> map2 = this.f77696b;
                if (list.size() >= 2) {
                    i2 = list.get(1).intValue();
                } else {
                    i2 = 0;
                }
                map2.put("block_cnt_1", Integer.valueOf(i2));
                Map<String, Object> map3 = this.f77696b;
                if (list.size() >= 3) {
                    i3 = list.get(2).intValue();
                }
                map3.put("block_cnt_2", Integer.valueOf(i3));
                return this;
            }
        }

        public final b c(List<Integer> list) {
            int i;
            int i2;
            int i3 = 0;
            if (PatchProxy.isSupport(new Object[]{list}, this, f77695a, false, 90512, new Class[]{List.class}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{list}, this, f77695a, false, 90512, new Class[]{List.class}, b.class);
            } else if (list == null) {
                return this;
            } else {
                Map<String, Object> map = this.f77696b;
                if (list.size() > 0) {
                    i = list.get(0).intValue();
                } else {
                    i = 0;
                }
                map.put("block_time_0", Integer.valueOf(i));
                Map<String, Object> map2 = this.f77696b;
                if (list.size() >= 2) {
                    i2 = list.get(1).intValue();
                } else {
                    i2 = 0;
                }
                map2.put("block_time_1", Integer.valueOf(i2));
                Map<String, Object> map3 = this.f77696b;
                if (list.size() >= 3) {
                    i3 = list.get(2).intValue();
                }
                map3.put("block_time_2", Integer.valueOf(i3));
                return this;
            }
        }

        public final b d(List<Integer> list) {
            int i;
            int i2;
            int i3 = 0;
            if (PatchProxy.isSupport(new Object[]{list}, this, f77695a, false, 90513, new Class[]{List.class}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{list}, this, f77695a, false, 90513, new Class[]{List.class}, b.class);
            } else if (list == null) {
                return this;
            } else {
                Map<String, Object> map = this.f77696b;
                if (list.size() > 0) {
                    i = list.get(0).intValue();
                } else {
                    i = 0;
                }
                map.put("video_bitrate_0", Integer.valueOf(i));
                Map<String, Object> map2 = this.f77696b;
                if (list.size() >= 2) {
                    i2 = list.get(1).intValue();
                } else {
                    i2 = 0;
                }
                map2.put("video_bitrate_1", Integer.valueOf(i2));
                Map<String, Object> map3 = this.f77696b;
                if (list.size() >= 3) {
                    i3 = list.get(2).intValue();
                }
                map3.put("video_bitrate_2", Integer.valueOf(i3));
                return this;
            }
        }

        public final b e(List<Integer> list) {
            int i;
            int i2;
            int i3 = 0;
            if (PatchProxy.isSupport(new Object[]{list}, this, f77695a, false, 90514, new Class[]{List.class}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{list}, this, f77695a, false, 90514, new Class[]{List.class}, b.class);
            } else if (list == null) {
                return this;
            } else {
                Map<String, Object> map = this.f77696b;
                if (list.size() > 0) {
                    i = list.get(0).intValue();
                } else {
                    i = 0;
                }
                map.put("play_time_0", Integer.valueOf(i));
                Map<String, Object> map2 = this.f77696b;
                if (list.size() >= 2) {
                    i2 = list.get(1).intValue();
                } else {
                    i2 = 0;
                }
                map2.put("play_time_1", Integer.valueOf(i2));
                Map<String, Object> map3 = this.f77696b;
                if (list.size() >= 3) {
                    i3 = list.get(2).intValue();
                }
                map3.put("play_time_2", Integer.valueOf(i3));
                return this;
            }
        }
    }

    private c(com.ss.android.ugc.lib.video.bitrate.regulator.a.d dVar) {
        super(dVar);
    }

    /* synthetic */ c(com.ss.android.ugc.lib.video.bitrate.regulator.a.d dVar, byte b2) {
        this(dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.lib.video.bitrate.regulator.a.f a(java.util.List<? extends com.ss.android.ugc.lib.video.bitrate.regulator.a.c> r20, java.util.Map<java.lang.String, java.lang.Object> r21) {
        /*
            r19 = this;
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r20
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f77693f
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.util.List> r4 = java.util.List.class
            r8[r10] = r4
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            r8[r11] = r4
            java.lang.Class<com.ss.android.ugc.lib.video.bitrate.regulator.a.f> r9 = com.ss.android.ugc.lib.video.bitrate.regulator.a.f.class
            r6 = 0
            r7 = 90498(0x16182, float:1.26815E-40)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0048
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r20
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f77693f
            r15 = 0
            r16 = 90498(0x16182, float:1.26815E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r0[r10] = r1
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            r0[r11] = r1
            java.lang.Class<com.ss.android.ugc.lib.video.bitrate.regulator.a.f> r18 = com.ss.android.ugc.lib.video.bitrate.regulator.a.f.class
            r13 = r19
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            com.ss.android.ugc.lib.video.bitrate.regulator.a.f r0 = (com.ss.android.ugc.lib.video.bitrate.regulator.a.f) r0
            return r0
        L_0x0048:
            com.ss.android.ugc.lib.video.bitrate.regulator.a.f r3 = new com.ss.android.ugc.lib.video.bitrate.regulator.a.f
            r3.<init>()
            if (r20 == 0) goto L_0x01f9
            boolean r4 = r20.isEmpty()
            if (r4 == 0) goto L_0x0057
            goto L_0x01f9
        L_0x0057:
            java.util.List r4 = r19.c(r20)
            if (r4 == 0) goto L_0x01ec
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0065
            goto L_0x01ec
        L_0x0065:
            java.lang.Object[] r12 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x01b3 }
            r12[r10] = r4     // Catch:{ Throwable -> 0x01b3 }
            r12[r11] = r1     // Catch:{ Throwable -> 0x01b3 }
            com.meituan.robust.ChangeQuickRedirect r14 = f77693f     // Catch:{ Throwable -> 0x01b3 }
            r15 = 0
            r16 = 90499(0x16183, float:1.26816E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ Throwable -> 0x01b3 }
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r0[r10] = r6     // Catch:{ Throwable -> 0x01b3 }
            java.lang.Class<java.util.Map> r6 = java.util.Map.class
            r0[r11] = r6     // Catch:{ Throwable -> 0x01b3 }
            java.lang.Class<com.ss.android.ugc.lib.video.bitrate.regulator.a.c> r18 = com.ss.android.ugc.lib.video.bitrate.regulator.a.c.class
            r13 = r19
            r17 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Throwable -> 0x01b3 }
            if (r0 == 0) goto L_0x00ac
            java.lang.Object[] r12 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x01b3 }
            r12[r10] = r4     // Catch:{ Throwable -> 0x01b3 }
            r12[r11] = r1     // Catch:{ Throwable -> 0x01b3 }
            com.meituan.robust.ChangeQuickRedirect r14 = f77693f     // Catch:{ Throwable -> 0x01b3 }
            r15 = 0
            r16 = 90499(0x16183, float:1.26816E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ Throwable -> 0x01b3 }
            java.lang.Class<java.util.List> r2 = java.util.List.class
            r0[r10] = r2     // Catch:{ Throwable -> 0x01b3 }
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            r0[r11] = r2     // Catch:{ Throwable -> 0x01b3 }
            java.lang.Class<com.ss.android.ugc.lib.video.bitrate.regulator.a.c> r18 = com.ss.android.ugc.lib.video.bitrate.regulator.a.c.class
            r13 = r19
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Throwable -> 0x01b3 }
            com.ss.android.ugc.lib.video.bitrate.regulator.a.c r0 = (com.ss.android.ugc.lib.video.bitrate.regulator.a.c) r0     // Catch:{ Throwable -> 0x01b3 }
        L_0x00a9:
            r5 = r0
            goto L_0x01c2
        L_0x00ac:
            com.ss.android.ugc.lib.video.bitrate.regulator.b.b r0 = com.ss.android.ugc.lib.video.bitrate.regulator.b.b.a.f77692a     // Catch:{ Throwable -> 0x01b3 }
            com.ss.android.ml.MLModelComponent r0 = r0.f77691a     // Catch:{ Throwable -> 0x01b3 }
            if (r0 != 0) goto L_0x00b4
        L_0x00b2:
            goto L_0x01c1
        L_0x00b4:
            boolean r2 = r0.enable()     // Catch:{ Throwable -> 0x01b3 }
            if (r2 == 0) goto L_0x01c1
            boolean r2 = r0.ensureEvaluatorAvailable()     // Catch:{ Throwable -> 0x01b3 }
            if (r2 != 0) goto L_0x00c2
            goto L_0x01c1
        L_0x00c2:
            java.lang.String r2 = "cache_size_list"
            java.lang.Object r2 = r1.get(r2)     // Catch:{ Throwable -> 0x01b3 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ Throwable -> 0x01b3 }
            if (r2 != 0) goto L_0x00cd
            goto L_0x00b2
        L_0x00cd:
            java.lang.String r6 = "internet_speed"
            java.lang.Object r6 = r1.get(r6)     // Catch:{ Throwable -> 0x01b3 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ Throwable -> 0x01b3 }
            int r6 = r6.intValue()     // Catch:{ Throwable -> 0x01b3 }
            if (r6 > 0) goto L_0x00dc
            goto L_0x00b2
        L_0x00dc:
            java.lang.String r7 = "internet_speed_0"
            java.lang.Object r7 = r1.get(r7)     // Catch:{ Throwable -> 0x01b3 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ Throwable -> 0x01b3 }
            int r7 = r7.intValue()     // Catch:{ Throwable -> 0x01b3 }
            java.lang.String r8 = "internet_speed_1"
            java.lang.Object r8 = r1.get(r8)     // Catch:{ Throwable -> 0x01b3 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ Throwable -> 0x01b3 }
            int r8 = r8.intValue()     // Catch:{ Throwable -> 0x01b3 }
            java.lang.String r9 = "internet_speed_2"
            java.lang.Object r9 = r1.get(r9)     // Catch:{ Throwable -> 0x01b3 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ Throwable -> 0x01b3 }
            int r9 = r9.intValue()     // Catch:{ Throwable -> 0x01b3 }
            r12 = 0
        L_0x0101:
            int r13 = r4.size()     // Catch:{ Throwable -> 0x01b3 }
            if (r12 >= r13) goto L_0x01a6
            java.lang.Object r13 = r4.get(r12)     // Catch:{ Throwable -> 0x01b3 }
            com.ss.android.ugc.lib.video.bitrate.regulator.a.c r13 = (com.ss.android.ugc.lib.video.bitrate.regulator.a.c) r13     // Catch:{ Throwable -> 0x01b3 }
            int r13 = r13.getBitRate()     // Catch:{ Throwable -> 0x01b3 }
            java.lang.String r14 = "video_bitrate"
            java.lang.Integer r15 = java.lang.Integer.valueOf(r13)     // Catch:{ Throwable -> 0x01b3 }
            r1.put(r14, r15)     // Catch:{ Throwable -> 0x01b3 }
            java.lang.String r14 = "cache_size"
            int r15 = r2.size()     // Catch:{ Throwable -> 0x01b3 }
            int r15 = r15 - r11
            if (r15 < r12) goto L_0x012e
            java.lang.Object r15 = r2.get(r12)     // Catch:{ Throwable -> 0x01b3 }
            java.lang.Integer r15 = (java.lang.Integer) r15     // Catch:{ Throwable -> 0x01b3 }
            int r15 = r15.intValue()     // Catch:{ Throwable -> 0x01b3 }
            goto L_0x012f
        L_0x012e:
            r15 = 0
        L_0x012f:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ Throwable -> 0x01b3 }
            r1.put(r14, r15)     // Catch:{ Throwable -> 0x01b3 }
            java.lang.String r14 = "bitrate_speed"
            float r13 = (float) r13     // Catch:{ Throwable -> 0x01b3 }
            float r15 = (float) r6     // Catch:{ Throwable -> 0x01b3 }
            r16 = 1065353216(0x3f800000, float:1.0)
            float r15 = r15 + r16
            float r15 = r13 / r15
            java.lang.Float r15 = java.lang.Float.valueOf(r15)     // Catch:{ Throwable -> 0x01b3 }
            r1.put(r14, r15)     // Catch:{ Throwable -> 0x01b3 }
            java.lang.String r14 = "bitrate_speed_0"
            float r15 = (float) r7     // Catch:{ Throwable -> 0x01b3 }
            float r15 = r15 + r16
            float r15 = r13 / r15
            java.lang.Float r15 = java.lang.Float.valueOf(r15)     // Catch:{ Throwable -> 0x01b3 }
            r1.put(r14, r15)     // Catch:{ Throwable -> 0x01b3 }
            java.lang.String r14 = "bitrate_speed_1"
            float r15 = (float) r8     // Catch:{ Throwable -> 0x01b3 }
            float r15 = r15 + r16
            float r15 = r13 / r15
            java.lang.Float r15 = java.lang.Float.valueOf(r15)     // Catch:{ Throwable -> 0x01b3 }
            r1.put(r14, r15)     // Catch:{ Throwable -> 0x01b3 }
            java.lang.String r14 = "bitrate_speed_2"
            float r15 = (float) r9     // Catch:{ Throwable -> 0x01b3 }
            float r15 = r15 + r16
            float r13 = r13 / r15
            java.lang.Float r13 = java.lang.Float.valueOf(r13)     // Catch:{ Throwable -> 0x01b3 }
            r1.put(r14, r13)     // Catch:{ Throwable -> 0x01b3 }
            com.ss.android.ml.MLEngine r13 = r0.getEvaluator()     // Catch:{ Throwable -> 0x01b3 }
            java.util.List r14 = r0.getPreOPInfos()     // Catch:{ Throwable -> 0x01b3 }
            com.ss.android.ml.process.IAfOPInfo r15 = r0.getAfOPInfo()     // Catch:{ Throwable -> 0x01b3 }
            java.util.List r5 = r0.getFeatureOrderList()     // Catch:{ Throwable -> 0x01b3 }
            java.util.List r5 = r13.classify(r1, r14, r15, r5)     // Catch:{ Throwable -> 0x01b3 }
            if (r5 == 0) goto L_0x01a2
            int r13 = r5.size()     // Catch:{ Throwable -> 0x01b3 }
            if (r13 <= 0) goto L_0x01a2
            java.lang.Object r5 = r5.get(r10)     // Catch:{ Throwable -> 0x01b3 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Throwable -> 0x01b3 }
            java.lang.String r13 = "true"
            boolean r5 = r5.equalsIgnoreCase(r13)     // Catch:{ Throwable -> 0x01b3 }
            if (r5 == 0) goto L_0x01a2
            java.lang.Object r0 = r4.get(r12)     // Catch:{ Throwable -> 0x01b3 }
            com.ss.android.ugc.lib.video.bitrate.regulator.a.c r0 = (com.ss.android.ugc.lib.video.bitrate.regulator.a.c) r0     // Catch:{ Throwable -> 0x01b3 }
            goto L_0x00a9
        L_0x01a2:
            int r12 = r12 + 1
            goto L_0x0101
        L_0x01a6:
            int r0 = r4.size()     // Catch:{ Throwable -> 0x01b3 }
            int r0 = r0 - r11
            java.lang.Object r0 = r4.get(r0)     // Catch:{ Throwable -> 0x01b3 }
            com.ss.android.ugc.lib.video.bitrate.regulator.a.c r0 = (com.ss.android.ugc.lib.video.bitrate.regulator.a.c) r0     // Catch:{ Throwable -> 0x01b3 }
            goto L_0x00a9
        L_0x01b3:
            r0 = move-exception
            com.ss.android.ugc.lib.video.bitrate.regulator.b r2 = new com.ss.android.ugc.lib.video.bitrate.regulator.b
            r5 = 9
            java.lang.String r0 = r0.getMessage()
            r2.<init>(r5, r0)
            r3.f77679c = r2
        L_0x01c1:
            r5 = 0
        L_0x01c2:
            if (r5 != 0) goto L_0x01e5
            java.lang.String r0 = "internet_speed"
            java.lang.Object r0 = r1.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = r19
            com.ss.android.ugc.lib.video.bitrate.regulator.b.e r2 = r1.g
            com.ss.android.ugc.lib.video.bitrate.regulator.b.d$b r3 = com.ss.android.ugc.lib.video.bitrate.regulator.b.d.b.a()
            com.ss.android.ugc.lib.video.bitrate.regulator.b.d$b r0 = r3.a(r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.f77700b
            com.ss.android.ugc.lib.video.bitrate.regulator.a.f r3 = r2.a(r4, r0)
            r3.f77680d = r10
            goto L_0x01eb
        L_0x01e5:
            r1 = r19
            r3.f77678b = r5
            r3.f77680d = r11
        L_0x01eb:
            return r3
        L_0x01ec:
            r1 = r19
            com.ss.android.ugc.lib.video.bitrate.regulator.b r0 = new com.ss.android.ugc.lib.video.bitrate.regulator.b
            r2 = 5
            java.lang.String r4 = "Intersection bitrate list is empty."
            r0.<init>(r2, r4)
            r3.f77679c = r0
            return r3
        L_0x01f9:
            r1 = r19
            com.ss.android.ugc.lib.video.bitrate.regulator.b r0 = new com.ss.android.ugc.lib.video.bitrate.regulator.b
            java.lang.String r2 = "bitrate list is empty..."
            r0.<init>(r10, r2)
            r3.f77679c = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.lib.video.bitrate.regulator.b.c.a(java.util.List, java.util.Map):com.ss.android.ugc.lib.video.bitrate.regulator.a.f");
    }
}

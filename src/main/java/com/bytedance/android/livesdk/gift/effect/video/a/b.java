package com.bytedance.android.livesdk.gift.effect.video.a;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdkapi.depend.d.a.a;
import com.bytedance.android.livesdkapi.depend.d.a.c;
import com.bytedance.android.livesdkapi.depend.d.a.d;
import com.bytedance.android.livesdkapi.host.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.live.alphaplayer.PlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.d;
import com.ss.android.ugc.aweme.live.alphaplayer.f;
import com.ss.android.ugc.aweme.live.alphaplayer.g;
import com.ss.ttm.player.MediaPlayer;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14981a;

    /* renamed from: b  reason: collision with root package name */
    public c f14982b;

    /* renamed from: c  reason: collision with root package name */
    public d f14983c;

    /* renamed from: d  reason: collision with root package name */
    public PlayerController f14984d;

    /* renamed from: e  reason: collision with root package name */
    private Context f14985e;

    /* renamed from: f  reason: collision with root package name */
    private LifecycleOwner f14986f;
    private final i g;
    private com.ss.android.ugc.aweme.live.alphaplayer.a h = new com.ss.android.ugc.aweme.live.alphaplayer.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f14987a;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f14987a, false, 9654, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f14987a, false, 9654, new Class[0], Void.TYPE);
                return;
            }
            if (b.this.f14982b != null) {
                b.this.f14982b.a();
            }
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f14987a, false, 9655, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f14987a, false, 9655, new Class[0], Void.TYPE);
                return;
            }
            if (b.this.f14982b != null) {
                b.this.f14982b.c();
            }
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x019a, code lost:
            r4 = r0;
            r6 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x019f, code lost:
            if (r2.f14982b == null) goto L_0x01a6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a1, code lost:
            r2.f14982b.a(r6, r4, r10, r0);
         */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0140  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0147  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x014a  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0150  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0153  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x015e  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x016b  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0174  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0181  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x018b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(int r21, int r22, com.ss.android.ugc.aweme.live.alphaplayer.d.a r23) {
            /*
                r20 = this;
                r7 = r20
                r8 = r23
                r9 = 3
                java.lang.Object[] r0 = new java.lang.Object[r9]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
                r10 = 0
                r0[r10] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
                r11 = 1
                r0[r11] = r1
                r12 = 2
                r0[r12] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f14987a
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r10] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r11] = r1
                java.lang.Class<com.ss.android.ugc.aweme.live.alphaplayer.d$a> r1 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.class
                r5[r12] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 9653(0x25b5, float:1.3527E-41)
                r1 = r20
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0060
                java.lang.Object[] r0 = new java.lang.Object[r9]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
                r0[r10] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
                r0[r11] = r1
                r0[r12] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f14987a
                r3 = 0
                r4 = 9653(0x25b5, float:1.3527E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r10] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r11] = r1
                java.lang.Class<com.ss.android.ugc.aweme.live.alphaplayer.d$a> r1 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.class
                r5[r12] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r20
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0060:
                com.bytedance.android.livesdk.gift.effect.video.a.b r0 = com.bytedance.android.livesdk.gift.effect.video.a.b.this
                com.bytedance.android.livesdkapi.depend.d.a.c r0 = r0.f14982b
                if (r0 == 0) goto L_0x01a6
                com.bytedance.android.livesdk.gift.effect.video.a.b r0 = com.bytedance.android.livesdk.gift.effect.video.a.b.this
                com.ss.android.ugc.aweme.live.alphaplayer.PlayerController r0 = r0.f14984d
                com.ss.android.ugc.aweme.live.alphaplayer.b r0 = r0.f3421d
                int r1 = r0.getMeasuredWidth()
                int r0 = r0.getMeasuredHeight()
                com.bytedance.android.livesdk.gift.effect.video.a.b r2 = com.bytedance.android.livesdk.gift.effect.video.a.b.this
                float r1 = (float) r1
                float r0 = (float) r0
                r3 = r21
                float r3 = (float) r3
                r4 = r22
                float r4 = (float) r4
                r5 = 5
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.Float r6 = java.lang.Float.valueOf(r1)
                r13[r10] = r6
                java.lang.Float r6 = java.lang.Float.valueOf(r0)
                r13[r11] = r6
                java.lang.Float r6 = java.lang.Float.valueOf(r3)
                r13[r12] = r6
                java.lang.Float r6 = java.lang.Float.valueOf(r4)
                r13[r9] = r6
                r6 = 4
                r13[r6] = r8
                com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.gift.effect.video.a.b.f14981a
                r16 = 0
                r17 = 9652(0x25b4, float:1.3525E-41)
                java.lang.Class[] r14 = new java.lang.Class[r5]
                java.lang.Class r18 = java.lang.Float.TYPE
                r14[r10] = r18
                java.lang.Class r18 = java.lang.Float.TYPE
                r14[r11] = r18
                java.lang.Class r18 = java.lang.Float.TYPE
                r14[r12] = r18
                java.lang.Class r18 = java.lang.Float.TYPE
                r14[r9] = r18
                java.lang.Class<com.ss.android.ugc.aweme.live.alphaplayer.d$a> r18 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.class
                r14[r6] = r18
                java.lang.Class r19 = java.lang.Void.TYPE
                r18 = r14
                r14 = r2
                boolean r13 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
                if (r13 == 0) goto L_0x0104
                java.lang.Object[] r13 = new java.lang.Object[r5]
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                r13[r10] = r1
                java.lang.Float r0 = java.lang.Float.valueOf(r0)
                r13[r11] = r0
                java.lang.Float r0 = java.lang.Float.valueOf(r3)
                r13[r12] = r0
                java.lang.Float r0 = java.lang.Float.valueOf(r4)
                r13[r9] = r0
                r13[r6] = r8
                com.meituan.robust.ChangeQuickRedirect r15 = com.bytedance.android.livesdk.gift.effect.video.a.b.f14981a
                r16 = 0
                r17 = 9652(0x25b4, float:1.3525E-41)
                java.lang.Class[] r0 = new java.lang.Class[r5]
                java.lang.Class r1 = java.lang.Float.TYPE
                r0[r10] = r1
                java.lang.Class r1 = java.lang.Float.TYPE
                r0[r11] = r1
                java.lang.Class r1 = java.lang.Float.TYPE
                r0[r12] = r1
                java.lang.Class r1 = java.lang.Float.TYPE
                r0[r9] = r1
                java.lang.Class<com.ss.android.ugc.aweme.live.alphaplayer.d$a> r1 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.class
                r0[r6] = r1
                java.lang.Class r19 = java.lang.Void.TYPE
                r14 = r2
                r18 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
                return
            L_0x0104:
                float r5 = r1 / r0
                float r3 = r3 / r4
                com.ss.android.ugc.aweme.live.alphaplayer.d$a r4 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.ScaleAspectFill
                if (r8 == r4) goto L_0x0123
                com.ss.android.ugc.aweme.live.alphaplayer.d$a r4 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.TopFill
                if (r8 == r4) goto L_0x0123
                com.ss.android.ugc.aweme.live.alphaplayer.d$a r4 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.BottomFill
                if (r8 == r4) goto L_0x0123
                com.ss.android.ugc.aweme.live.alphaplayer.d$a r4 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.RightFill
                if (r8 == r4) goto L_0x0123
                com.ss.android.ugc.aweme.live.alphaplayer.d$a r4 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.LeftFill
                if (r8 != r4) goto L_0x011c
                goto L_0x0123
            L_0x011c:
                int r4 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r4 <= 0) goto L_0x012c
                float r4 = r0 * r3
                goto L_0x0129
            L_0x0123:
                int r4 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r4 > 0) goto L_0x012c
                float r4 = r0 * r3
            L_0x0129:
                r6 = r4
                r4 = r0
                goto L_0x012f
            L_0x012c:
                float r4 = r1 / r3
                r6 = r1
            L_0x012f:
                int[] r9 = com.bytedance.android.livesdk.gift.effect.video.a.b.AnonymousClass3.f14991a
                int r8 = r23.ordinal()
                r8 = r9[r8]
                r9 = 1073741824(0x40000000, float:2.0)
                r10 = 0
                switch(r8) {
                    case 1: goto L_0x019a;
                    case 2: goto L_0x018b;
                    case 3: goto L_0x0181;
                    case 4: goto L_0x0174;
                    case 5: goto L_0x016b;
                    case 6: goto L_0x015e;
                    case 7: goto L_0x0153;
                    case 8: goto L_0x0150;
                    case 9: goto L_0x014a;
                    case 10: goto L_0x0147;
                    case 11: goto L_0x0140;
                    default: goto L_0x013d;
                }
            L_0x013d:
                r0 = 0
                goto L_0x019d
            L_0x0140:
                float r3 = r3 * r0
                float r1 = r1 - r3
                r4 = r0
                r10 = r1
                r6 = r3
                goto L_0x013d
            L_0x0147:
                float r1 = r0 * r3
                goto L_0x019a
            L_0x014a:
                float r3 = r1 / r3
                float r0 = r0 - r3
                r6 = r1
                r4 = r3
                goto L_0x019d
            L_0x0150:
                float r0 = r1 / r3
                goto L_0x019a
            L_0x0153:
                int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r3 <= 0) goto L_0x015b
                float r1 = r1 - r6
                float r0 = r1 / r9
                goto L_0x0198
            L_0x015b:
                float r0 = r0 - r4
                float r0 = r0 / r9
                goto L_0x019d
            L_0x015e:
                int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r3 <= 0) goto L_0x0167
                float r0 = r4 - r0
                float r0 = -r0
                float r0 = r0 / r9
                goto L_0x019d
            L_0x0167:
                float r0 = r6 - r1
                float r0 = -r0
                goto L_0x0198
            L_0x016b:
                int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r1 <= 0) goto L_0x013d
                float r0 = r4 - r0
                float r0 = -r0
                float r0 = r0 / r9
                goto L_0x019d
            L_0x0174:
                int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r3 <= 0) goto L_0x017c
                float r0 = r4 - r0
                float r0 = -r0
                goto L_0x019d
            L_0x017c:
                float r0 = r6 - r1
                float r0 = -r0
                float r0 = r0 / r9
                goto L_0x0198
            L_0x0181:
                int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r0 <= 0) goto L_0x0186
                goto L_0x013d
            L_0x0186:
                float r0 = r6 - r1
                float r0 = -r0
                float r0 = r0 / r9
                goto L_0x0198
            L_0x018b:
                int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r3 <= 0) goto L_0x0194
                float r0 = r4 - r0
                float r0 = -r0
                float r0 = r0 / r9
                goto L_0x019d
            L_0x0194:
                float r0 = r6 - r1
                float r0 = -r0
                float r0 = r0 / r9
            L_0x0198:
                r10 = r0
                goto L_0x013d
            L_0x019a:
                r4 = r0
                r6 = r1
                goto L_0x013d
            L_0x019d:
                com.bytedance.android.livesdkapi.depend.d.a.c r1 = r2.f14982b
                if (r1 == 0) goto L_0x01a6
                com.bytedance.android.livesdkapi.depend.d.a.c r1 = r2.f14982b
                r1.a(r6, r4, r10, r0)
            L_0x01a6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.effect.video.a.b.AnonymousClass1.a(int, int, com.ss.android.ugc.aweme.live.alphaplayer.d$a):void");
        }
    };
    private g i = new g() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f14989a;

        public final void a(boolean z, int i, int i2, String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f14989a, false, 9656, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), str2}, this, f14989a, false, 9656, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
                return;
            }
            if (b.this.f14983c != null) {
                boolean z2 = z;
                b.this.f14983c.a(z, i, i2, str2);
            }
        }
    };

    /* renamed from: com.bytedance.android.livesdk.gift.effect.video.a.b$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f14991a = new int[d.a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.ss.android.ugc.aweme.live.alphaplayer.d$a[] r0 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14991a = r0
                int[] r0 = f14991a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.android.ugc.aweme.live.alphaplayer.d$a r1 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.ScaleToFill     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f14991a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.android.ugc.aweme.live.alphaplayer.d$a r1 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.ScaleAspectFill     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f14991a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.ss.android.ugc.aweme.live.alphaplayer.d$a r1 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.TopFill     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f14991a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.ss.android.ugc.aweme.live.alphaplayer.d$a r1 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.BottomFill     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f14991a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.ss.android.ugc.aweme.live.alphaplayer.d$a r1 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.LeftFill     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f14991a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.ss.android.ugc.aweme.live.alphaplayer.d$a r1 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.RightFill     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f14991a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.ss.android.ugc.aweme.live.alphaplayer.d$a r1 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.ScaleAspectFitCenter     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f14991a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.ss.android.ugc.aweme.live.alphaplayer.d$a r1 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.TopFit     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f14991a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.ss.android.ugc.aweme.live.alphaplayer.d$a r1 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.BottomFit     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f14991a     // Catch:{ NoSuchFieldError -> 0x007a }
                com.ss.android.ugc.aweme.live.alphaplayer.d$a r1 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.LeftFit     // Catch:{ NoSuchFieldError -> 0x007a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                int[] r0 = f14991a     // Catch:{ NoSuchFieldError -> 0x0086 }
                com.ss.android.ugc.aweme.live.alphaplayer.d$a r1 = com.ss.android.ugc.aweme.live.alphaplayer.d.a.RightFit     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.effect.video.a.b.AnonymousClass3.<clinit>():void");
        }
    }

    public final void d() {
        this.f14982b = null;
    }

    public final void e() {
        this.f14983c = null;
    }

    public final View a() {
        if (this.f14984d != null) {
            return this.f14984d.f3421d;
        }
        return null;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f14981a, false, 9650, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14981a, false, 9650, new Class[0], Void.TYPE);
            return;
        }
        if (this.f14984d != null) {
            PlayerController playerController = this.f14984d;
            if (PatchProxy.isSupport(new Object[0], playerController, PlayerController.f3418a, false, 55551, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], playerController, PlayerController.f3418a, false, 55551, new Class[0], Void.TYPE);
                return;
            }
            playerController.a(PlayerController.a(9, (Object) null));
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f14981a, false, 9651, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14981a, false, 9651, new Class[0], Void.TYPE);
            return;
        }
        if (this.f14984d != null) {
            this.f14984d.a((com.ss.android.ugc.aweme.live.alphaplayer.a) null);
            this.f14984d.a((g) null);
            this.f14984d.b();
            this.f14984d = null;
        }
        this.f14986f = null;
        this.f14985e = null;
        this.f14982b = null;
        this.f14983c = null;
    }

    public final void a(c cVar) {
        this.f14982b = cVar;
    }

    public final void a(com.bytedance.android.livesdkapi.depend.d.a.d dVar) {
        this.f14983c = dVar;
    }

    public final void a(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f14981a, false, 9647, new Class[]{ViewGroup.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f14981a, false, 9647, new Class[]{ViewGroup.class}, Void.TYPE);
            return;
        }
        if (this.f14984d != null) {
            PlayerController playerController = this.f14984d;
            if (PatchProxy.isSupport(new Object[]{viewGroup2}, playerController, PlayerController.f3418a, false, 55539, new Class[]{ViewGroup.class}, Void.TYPE)) {
                PlayerController playerController2 = playerController;
                PatchProxy.accessDispatch(new Object[]{viewGroup2}, playerController2, PlayerController.f3418a, false, 55539, new Class[]{ViewGroup.class}, Void.TYPE);
            } else if (viewGroup2 != null) {
                ViewGroup viewGroup3 = (ViewGroup) playerController.f3421d.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(playerController.f3421d);
                }
                if (viewGroup2.indexOfChild(playerController.f3421d) == -1) {
                    viewGroup2.addView(playerController.f3421d);
                }
            }
        }
    }

    public final void b(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f14981a, false, 9648, new Class[]{ViewGroup.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f14981a, false, 9648, new Class[]{ViewGroup.class}, Void.TYPE);
            return;
        }
        if (this.f14984d != null) {
            PlayerController playerController = this.f14984d;
            if (PatchProxy.isSupport(new Object[]{viewGroup2}, playerController, PlayerController.f3418a, false, 55540, new Class[]{ViewGroup.class}, Void.TYPE)) {
                PlayerController playerController2 = playerController;
                PatchProxy.accessDispatch(new Object[]{viewGroup2}, playerController2, PlayerController.f3418a, false, 55540, new Class[]{ViewGroup.class}, Void.TYPE);
            } else if (viewGroup2 != null) {
                viewGroup2.removeView(playerController.f3421d);
            }
        }
    }

    public final void a(LifecycleOwner lifecycleOwner) {
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner2}, this, f14981a, false, 9645, new Class[]{LifecycleOwner.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner2}, this, f14981a, false, 9645, new Class[]{LifecycleOwner.class}, Void.TYPE);
            return;
        }
        this.f14986f = lifecycleOwner2;
        if (PatchProxy.isSupport(new Object[0], this, f14981a, false, 9646, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14981a, false, 9646, new Class[0], Void.TYPE);
        } else if (this.f14985e != null && this.f14986f != null) {
            if (this.f14984d != null) {
                this.f14984d.b();
            }
            com.ss.android.ugc.aweme.live.alphaplayer.c cVar = new com.ss.android.ugc.aweme.live.alphaplayer.c();
            cVar.f53240a = this.f14985e;
            cVar.f53241b = this.f14986f;
            try {
                a aVar = new a(this.f14985e);
                if (PatchProxy.isSupport(new Object[0], aVar, a.f14970a, false, 9629, new Class[0], a.class)) {
                    aVar = (a) PatchProxy.accessDispatch(new Object[0], aVar, a.f14970a, false, 9629, new Class[0], a.class);
                } else {
                    if (com.bytedance.android.live.uikit.a.a.f()) {
                        if (!com.bytedance.android.livesdkapi.j.a.XGPlayer.isInstalled()) {
                            throw new IllegalStateException("ttm plugin not installed");
                        }
                    } else if (!com.bytedance.android.livesdkapi.j.a.Player.isInstalled()) {
                        throw new IllegalStateException("ttm plugin not installed");
                    }
                    MediaPlayer a2 = aVar.a();
                    if (a2 == null) {
                        a2 = aVar.a();
                        if (a2 == null || a2.isOSPlayer()) {
                            throw new Exception("create ttplayer failure");
                        }
                    }
                    aVar.f14971b = a2;
                    aVar.f14971b.setIntOption(36, 1);
                    aVar.f14971b.setOnPreparedListener(aVar.f14972c);
                    aVar.f14971b.setOnErrorListener(aVar.f14973d);
                    aVar.f14971b.setOnCompletionListener(aVar.f14974e);
                }
                this.f14984d = PlayerController.a(cVar, (f) aVar);
            } catch (Throwable th) {
                this.f14984d = PlayerController.a(cVar, (f) new com.ss.android.ugc.aweme.live.alphaplayer.b.b());
                com.bytedance.android.live.core.c.a.a(6, "LiveGiftPlay", th.getStackTrace());
            }
            this.f14984d.a(this.h);
            this.f14984d.a(this.i);
        }
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f14981a, false, 9649, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f14981a, false, 9649, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f14984d != null) {
            com.ss.android.ugc.aweme.live.alphaplayer.d a2 = new com.ss.android.ugc.aweme.live.alphaplayer.d().a(str2);
            PlayerController playerController = this.f14984d;
            if (PatchProxy.isSupport(new Object[]{a2}, playerController, PlayerController.f3418a, false, 55546, new Class[]{com.ss.android.ugc.aweme.live.alphaplayer.d.class}, Void.TYPE)) {
                PlayerController playerController2 = playerController;
                PatchProxy.accessDispatch(new Object[]{a2}, playerController2, PlayerController.f3418a, false, 55546, new Class[]{com.ss.android.ugc.aweme.live.alphaplayer.d.class}, Void.TYPE);
            } else if (a2.f53244c) {
                if (PatchProxy.isSupport(new Object[]{0}, playerController, PlayerController.f3418a, false, 55536, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PlayerController playerController3 = playerController;
                    PatchProxy.accessDispatch(new Object[]{0}, playerController3, PlayerController.f3418a, false, 55536, new Class[]{Integer.TYPE}, Void.TYPE);
                } else {
                    playerController.f3421d.setVisibility(0);
                    playerController.f3421d.bringToFront();
                }
                playerController.a(PlayerController.a(1, (Object) a2));
            } else {
                playerController.c();
                playerController.a(false, "dataSource is invalid. ErrorInfo: " + a2.f53245d);
            }
        }
    }

    public b(@NonNull Context context, i iVar) {
        this.f14985e = context;
        this.g = iVar;
    }
}

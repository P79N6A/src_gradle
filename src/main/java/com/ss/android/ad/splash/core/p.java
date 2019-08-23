package com.ss.android.ad.splash.core;

import android.text.TextUtils;
import com.ss.android.ad.splash.c;
import com.ss.android.ad.splash.core.c.b;
import com.ss.android.ad.splash.core.d.a;
import com.ss.android.ad.splash.m;
import com.ss.android.ad.splash.o;
import com.ss.android.ad.splash.origin.d;
import com.ss.android.ad.splash.utils.f;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

public final class p implements m {

    /* renamed from: a  reason: collision with root package name */
    private c f27715a;

    /* renamed from: b  reason: collision with root package name */
    private c f27716b;

    /* renamed from: c  reason: collision with root package name */
    private b f27717c;

    /* renamed from: d  reason: collision with root package name */
    private d f27718d;

    p() {
    }

    public final void a() {
        if (this.f27717c != null) {
            b bVar = this.f27717c;
            if (bVar.l != null) {
                bVar.l.c();
            } else if (bVar.u != null && bVar.u.b()) {
                bVar.u.d();
            }
            bVar.m.b(bVar.f27538a);
            return;
        }
        if (this.f27716b != null) {
            c cVar = this.f27716b;
            if (cVar.l != null) {
                cVar.l.d();
            }
            cVar.j.b(cVar.i);
        }
    }

    public final m a(c cVar) {
        this.f27715a = cVar;
        return this;
    }

    private void a(final b bVar) {
        if (h.a().h) {
            final Future<?> submit = e.s().submit(new Runnable() {
                public final void run() {
                    boolean z;
                    if (e.t() != null) {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        String f2 = f.f();
                        JSONObject jSONObject = new JSONObject();
                        try {
                            JSONArray jSONArray = new JSONArray();
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("ad_id", bVar.l());
                            jSONObject2.put("timestamp", currentTimeMillis);
                            jSONObject2.put("position", 0);
                            jSONObject2.put("log_extra", bVar.n());
                            jSONArray.put(jSONObject2);
                            jSONObject.put("ads", jSONArray);
                        } catch (Exception unused) {
                        }
                        if (!TextUtils.isEmpty(f2)) {
                            int i = 0;
                            while (i < 4) {
                                o a2 = e.t().a(f2, 3, null, jSONObject);
                                if (a2 != null && a2.f22832b) {
                                    JSONObject jSONObject3 = a2.f22831a;
                                    if (jSONObject3 == null || jSONObject3.optInt("code", -1) != 30001) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z) {
                                        i++;
                                    }
                                }
                                return;
                            }
                        }
                    }
                }
            });
            a.a().a(new Runnable() {
                public final void run() {
                    e.a(submit);
                    try {
                        submit.get(5, TimeUnit.SECONDS);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.ss.android.ad.splash.core.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.ss.android.ad.splash.core.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v49, resolved type: com.ss.android.ad.splash.core.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.ss.android.ad.splash.core.b} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x037a, code lost:
        if (r12 != r11) goto L_0x037c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0454  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0457  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0460  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x04d3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ad  */
    @android.support.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.ViewGroup a(android.content.Context r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            com.ss.android.ad.splash.c r2 = r0.f27715a
            if (r2 == 0) goto L_0x04ec
            com.ss.android.ad.splash.core.k r2 = com.ss.android.ad.splash.core.k.a()
            com.ss.android.ad.splash.core.c.b r3 = r2.b()
            com.ss.android.ad.splash.core.s r4 = com.ss.android.ad.splash.core.s.a()
            r4.f()
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x004e
            int r7 = r3.v
            if (r7 != r5) goto L_0x0021
            r7 = 1
            goto L_0x0022
        L_0x0021:
            r7 = 0
        L_0x0022:
            if (r7 == 0) goto L_0x004e
            com.ss.android.ad.splash.origin.c r7 = com.ss.android.ad.splash.core.e.D()
            if (r7 == 0) goto L_0x004e
            com.ss.android.ad.splash.origin.d r1 = r0.f27718d
            if (r1 != 0) goto L_0x0035
            com.ss.android.ad.splash.origin.d r1 = new com.ss.android.ad.splash.origin.d
            r1.<init>()
            r0.f27718d = r1
        L_0x0035:
            com.ss.android.ad.splash.origin.d r1 = r0.f27718d
            com.ss.android.ad.splash.c r2 = r0.f27715a
            r1.a(r2)
            com.ss.android.ad.splash.origin.c r1 = com.ss.android.ad.splash.core.e.D()
            r1.a(r3, r5)
            boolean r1 = com.ss.android.ad.splash.core.e.T()
            if (r1 == 0) goto L_0x04cf
            r0.a((com.ss.android.ad.splash.core.c.b) r3)
            goto L_0x04cf
        L_0x004e:
            if (r3 == 0) goto L_0x04cf
            boolean r7 = r3.a()
            if (r7 != 0) goto L_0x0058
            goto L_0x04cf
        L_0x0058:
            boolean r7 = com.ss.android.ad.splash.core.e.y
            r9 = 3
            r10 = 8
            r11 = -1
            if (r7 == 0) goto L_0x01b2
            com.ss.android.ad.splash.core.c r7 = new com.ss.android.ad.splash.core.c
            r7.<init>(r1)
            com.ss.android.ad.splash.core.m r1 = new com.ss.android.ad.splash.core.m
            com.ss.android.ad.splash.c r12 = r0.f27715a
            r1.<init>(r7, r12)
            r7.setSplashAdInteraction(r1)
            int r1 = r3.p()
            if (r1 == 0) goto L_0x013b
            switch(r1) {
                case 2: goto L_0x008a;
                case 3: goto L_0x0084;
                case 4: goto L_0x007b;
                default: goto L_0x0078;
            }
        L_0x0078:
            r1 = 0
            goto L_0x0192
        L_0x007b:
            r7.setImageTouchListener(r3)
            boolean r1 = r7.b(r3)
            goto L_0x0192
        L_0x0084:
            boolean r1 = r7.a((com.ss.android.ad.splash.core.c.b) r3)
            goto L_0x0192
        L_0x008a:
            com.ss.android.ad.splash.core.c.j r1 = r3.k
            if (r1 != 0) goto L_0x008f
            goto L_0x0078
        L_0x008f:
            com.ss.android.ad.splash.core.c.j r1 = r3.k
            java.lang.String r1 = com.ss.android.ad.splash.utils.f.b((com.ss.android.ad.splash.core.c.j) r1)
            boolean r9 = com.ss.android.ad.splash.utils.g.a(r1)
            if (r9 == 0) goto L_0x009c
            goto L_0x0078
        L_0x009c:
            com.ss.android.ad.splash.core.c$7 r9 = new com.ss.android.ad.splash.core.c$7
            r9.<init>(r3)
            r7.setOnTouchListener(r9)
            android.widget.Space r9 = r7.f27580a
            r9.setVisibility(r10)
            android.widget.ImageView r9 = r7.f27581b
            r9.setVisibility(r6)
            com.ss.android.ad.splash.core.video2.BDASplashVideoView r9 = r7.f27582c
            r9.setVisibility(r6)
            com.ss.android.ad.splash.core.video2.a r9 = new com.ss.android.ad.splash.core.video2.a
            com.ss.android.ad.splash.core.video2.BDASplashVideoView r10 = r7.f27582c
            r9.<init>(r10)
            r7.l = r9
            com.ss.android.ad.splash.core.video2.e r9 = r7.l
            com.ss.android.ad.splash.core.video2.b r10 = r7.c(r3)
            r9.a((com.ss.android.ad.splash.core.video2.b) r10)
            com.ss.android.ad.splash.core.video2.BDASplashVideoView r9 = r7.f27582c
            com.ss.android.ad.splash.core.c.j r10 = r3.k
            int r10 = r10.h
            com.ss.android.ad.splash.core.c.j r12 = r3.k
            int r12 = r12.g
            android.content.res.Resources r13 = r7.getResources()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            int r14 = r13.widthPixels
            int r13 = r13.heightPixels
            float r15 = (float) r14
            float r4 = (float) r13
            float r15 = r15 / r4
            float r4 = (float) r10
            float r8 = (float) r12
            float r4 = r4 / r8
            int r8 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r8 <= 0) goto L_0x00eb
            int r10 = r10 * r13
            int r4 = r10 / r12
            r8 = r13
            goto L_0x00f5
        L_0x00eb:
            int r4 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r4 >= 0) goto L_0x010e
            int r12 = r12 * r14
            int r4 = r12 / r10
            r8 = r4
            r4 = r14
        L_0x00f5:
            int r4 = r4 - r14
            int r4 = java.lang.Math.abs(r4)
            int r4 = -r4
            int r4 = r4 / 2
            int r8 = r8 - r13
            int r8 = java.lang.Math.abs(r8)
            int r8 = -r8
            int r8 = r8 / 2
            android.widget.RelativeLayout$LayoutParams r10 = new android.widget.RelativeLayout$LayoutParams
            r10.<init>(r11, r11)
            r10.setMargins(r4, r8, r4, r8)
            goto L_0x0113
        L_0x010e:
            android.widget.RelativeLayout$LayoutParams r10 = new android.widget.RelativeLayout$LayoutParams
            r10.<init>(r11, r11)
        L_0x0113:
            r9.setSurfaceLayoutParams(r10)
            com.ss.android.ad.splash.core.video2.e r4 = r7.l
            boolean r1 = r4.a((java.lang.String) r1)
            if (r1 == 0) goto L_0x0192
            com.ss.android.ad.splash.core.video2.d r4 = com.ss.android.ad.splash.core.video2.d.a()
            android.content.Context r8 = com.ss.android.ad.splash.core.e.F()
            r4.a((com.ss.android.ad.splash.core.c.b) r3, (android.content.Context) r8)
            com.ss.android.ad.splash.core.video2.d r4 = com.ss.android.ad.splash.core.video2.d.a()
            com.ss.android.ad.splash.core.video2.e r8 = r7.l
            int r9 = r3.x()
            long r10 = r3.c()
            r4.a(r8, r9, r10)
            goto L_0x0192
        L_0x013b:
            r7.setImageTouchListener(r3)
            boolean r1 = r7.b(r3)
            if (r1 == 0) goto L_0x0078
            int r1 = r3.h
            if (r1 != r9) goto L_0x0191
            boolean r1 = r3.h()
            if (r1 == 0) goto L_0x0191
            r7.f27585f = r5
            android.widget.RelativeLayout r1 = r7.f27583d
            r1.setVisibility(r6)
            android.widget.RelativeLayout r1 = r7.f27583d
            com.ss.android.ad.splash.core.c$1 r4 = new com.ss.android.ad.splash.core.c$1
            r4.<init>(r3)
            r1.setOnTouchListener(r4)
            java.lang.String r1 = r3.f27611c
            boolean r1 = com.ss.android.ad.splash.utils.g.a(r1)
            if (r1 != 0) goto L_0x016f
            android.widget.TextView r1 = r7.f27584e
            java.lang.String r4 = r3.f27611c
            r1.setText(r4)
            goto L_0x0187
        L_0x016f:
            int r1 = com.ss.android.ad.splash.core.e.j()
            if (r1 == 0) goto L_0x017f
            android.widget.TextView r1 = r7.f27584e
            int r4 = com.ss.android.ad.splash.core.e.j()
            r1.setText(r4)
            goto L_0x0187
        L_0x017f:
            android.widget.TextView r1 = r7.f27584e
            r4 = 2131562516(0x7f0d1014, float:1.8750463E38)
            r1.setText(r4)
        L_0x0187:
            android.widget.RelativeLayout r1 = r7.f27583d
            com.ss.android.ad.splash.core.c$4 r4 = new com.ss.android.ad.splash.core.c$4
            r4.<init>(r3)
            r1.post(r4)
        L_0x0191:
            r1 = 1
        L_0x0192:
            if (r1 == 0) goto L_0x01a1
            r7.i = r3
            long r8 = r3.c()
            r7.g = r8
            r7.setupUIWidgets(r3)
            r1 = 1
            goto L_0x01a2
        L_0x01a1:
            r1 = 0
        L_0x01a2:
            if (r1 != 0) goto L_0x01ad
            com.ss.android.ad.splash.b.b.a()
            r1 = 7
            com.ss.android.ad.splash.b.b.a(r1)
            goto L_0x04cf
        L_0x01ad:
            r0.f27716b = r7
            r4 = r7
            goto L_0x0462
        L_0x01b2:
            com.ss.android.ad.splash.core.b r4 = new com.ss.android.ad.splash.core.b
            r4.<init>(r1)
            com.ss.android.ad.splash.core.m r1 = new com.ss.android.ad.splash.core.m
            com.ss.android.ad.splash.c r7 = r0.f27715a
            r1.<init>(r4, r7)
            r4.setSplashAdInteraction(r1)
            int r1 = r3.p()
            if (r1 == 0) goto L_0x039c
            switch(r1) {
                case 2: goto L_0x0207;
                case 3: goto L_0x0201;
                case 4: goto L_0x01cd;
                default: goto L_0x01ca;
            }
        L_0x01ca:
            r1 = 0
            goto L_0x0420
        L_0x01cd:
            r4.setImageTouchListener(r3)
            boolean r1 = r4.b(r3)
            if (r1 != 0) goto L_0x01d7
            goto L_0x01ca
        L_0x01d7:
            int r1 = r3.i
            if (r1 == r5) goto L_0x01e1
            android.view.ViewGroup r1 = r4.f27541d
            r1.setVisibility(r10)
            goto L_0x01f8
        L_0x01e1:
            boolean r1 = r3.v()
            if (r1 == 0) goto L_0x01f0
            android.widget.FrameLayout r1 = r4.r
            r1.setVisibility(r6)
            r4.setSkipClickListener(r3)
            goto L_0x01f8
        L_0x01f0:
            android.view.ViewGroup r1 = r4.f27541d
            r1.setVisibility(r6)
            r4.setSkipClickListener(r3)
        L_0x01f8:
            r4.setSplashInfoStyle(r3)
            r4.a()
        L_0x01fe:
            r1 = 1
            goto L_0x0420
        L_0x0201:
            boolean r1 = r4.a((com.ss.android.ad.splash.core.c.b) r3)
            goto L_0x0420
        L_0x0207:
            com.ss.android.ad.splash.core.c.j r1 = r3.k
            if (r1 != 0) goto L_0x020c
            goto L_0x01ca
        L_0x020c:
            android.view.ViewGroup r1 = r4.h
            r1.setVisibility(r6)
            com.ss.android.ad.splash.core.video.g r1 = new com.ss.android.ad.splash.core.video.g
            android.content.Context r7 = com.ss.android.ad.splash.core.e.F()
            android.widget.FrameLayout r8 = r4.i
            r1.<init>(r7, r8)
            r4.l = r1
            r4.setSplashAdListener(r3)
            com.ss.android.ad.splash.core.c.j r1 = r3.k
            int r7 = r3.i
            if (r7 != r5) goto L_0x0229
            r7 = 1
            goto L_0x022a
        L_0x0229:
            r7 = 0
        L_0x022a:
            java.lang.String r8 = com.ss.android.ad.splash.utils.f.b((com.ss.android.ad.splash.core.c.j) r1)
            boolean r9 = com.ss.android.ad.splash.utils.g.a(r8)
            if (r9 == 0) goto L_0x0235
            goto L_0x01ca
        L_0x0235:
            boolean r9 = com.ss.android.ad.splash.core.e.S()
            if (r9 == 0) goto L_0x02eb
            android.widget.Space r1 = r4.f27540c
            r1.setVisibility(r10)
            android.widget.ImageView r1 = r4.f27539b
            r1.setVisibility(r6)
            r4.setSkipAndWifiPreloadLayout(r3)
            r4.setSkipClickListener(r3)
            boolean r1 = r3.v()
            boolean r7 = r3.h()
            r4.a(r1, r7)
            com.ss.android.ad.splash.core.b$7 r1 = new com.ss.android.ad.splash.core.b$7
            r1.<init>(r3)
            r4.setOnTouchListener(r1)
            com.ss.android.ad.splash.core.video2.BDASplashVideoView r1 = r4.t
            r1.setVisibility(r6)
            com.ss.android.ad.splash.core.video2.a r1 = new com.ss.android.ad.splash.core.video2.a
            com.ss.android.ad.splash.core.video2.BDASplashVideoView r7 = r4.t
            r1.<init>(r7)
            r4.u = r1
            com.ss.android.ad.splash.core.video2.e r1 = r4.u
            com.ss.android.ad.splash.core.video2.b r7 = r4.c(r3)
            r1.a((com.ss.android.ad.splash.core.video2.b) r7)
            com.ss.android.ad.splash.core.video2.BDASplashVideoView r1 = r4.t
            com.ss.android.ad.splash.core.c.j r7 = r3.k
            int r7 = r7.h
            com.ss.android.ad.splash.core.c.j r9 = r3.k
            int r9 = r9.g
            android.content.res.Resources r10 = r4.getResources()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            int r12 = r10.widthPixels
            int r10 = r10.heightPixels
            float r13 = (float) r12
            float r14 = (float) r10
            float r13 = r13 / r14
            float r14 = (float) r7
            float r15 = (float) r9
            float r14 = r14 / r15
            int r15 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x029a
            int r7 = r7 * r10
            int r7 = r7 / r9
            r9 = r10
            goto L_0x02a4
        L_0x029a:
            int r13 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r13 >= 0) goto L_0x02bd
            int r9 = r9 * r12
            int r7 = r9 / r7
            r9 = r7
            r7 = r12
        L_0x02a4:
            int r7 = r7 - r12
            int r7 = java.lang.Math.abs(r7)
            int r7 = -r7
            int r7 = r7 / 2
            int r9 = r9 - r10
            int r9 = java.lang.Math.abs(r9)
            int r9 = -r9
            int r9 = r9 / 2
            android.widget.RelativeLayout$LayoutParams r10 = new android.widget.RelativeLayout$LayoutParams
            r10.<init>(r11, r11)
            r10.setMargins(r7, r9, r7, r9)
            goto L_0x02c2
        L_0x02bd:
            android.widget.RelativeLayout$LayoutParams r10 = new android.widget.RelativeLayout$LayoutParams
            r10.<init>(r11, r11)
        L_0x02c2:
            r1.setSurfaceLayoutParams(r10)
            com.ss.android.ad.splash.core.video2.e r1 = r4.u
            boolean r1 = r1.a((java.lang.String) r8)
            if (r1 == 0) goto L_0x0420
            com.ss.android.ad.splash.core.video2.d r7 = com.ss.android.ad.splash.core.video2.d.a()
            android.content.Context r8 = com.ss.android.ad.splash.core.e.F()
            r7.a((com.ss.android.ad.splash.core.c.b) r3, (android.content.Context) r8)
            com.ss.android.ad.splash.core.video2.d r7 = com.ss.android.ad.splash.core.video2.d.a()
            com.ss.android.ad.splash.core.video2.e r8 = r4.u
            int r9 = r3.x()
            long r10 = r3.c()
            r7.a(r8, r9, r10)
            goto L_0x0420
        L_0x02eb:
            com.ss.android.ad.splash.core.video.f$a r9 = new com.ss.android.ad.splash.core.video.f$a
            r9.<init>()
            com.ss.android.ad.splash.core.video.f$a r8 = r9.a((java.lang.String) r8)
            java.lang.String r9 = r1.f27648d
            com.ss.android.ad.splash.core.video.f$a r8 = r8.b((java.lang.String) r9)
            long r9 = r3.l()
            com.ss.android.ad.splash.core.video.f$a r8 = r8.a((long) r9)
            android.view.ViewGroup r9 = r4.h
            int r9 = r9.getWidth()
            com.ss.android.ad.splash.core.video.f$a r8 = r8.a((int) r9)
            android.view.ViewGroup r9 = r4.h
            int r9 = r9.getHeight()
            com.ss.android.ad.splash.core.video.f$a r8 = r8.b((int) r9)
            java.util.List<java.lang.String> r9 = r1.f27645a
            com.ss.android.ad.splash.core.video.f$a r8 = r8.a((java.util.List<java.lang.String>) r9)
            java.lang.String r9 = r3.n()
            com.ss.android.ad.splash.core.video.f$a r8 = r8.c((java.lang.String) r9)
            com.ss.android.ad.splash.core.video.f$a r8 = r8.c((int) r6)
            com.ss.android.ad.splash.core.video.f$a r8 = r8.a((boolean) r5)
            com.ss.android.ad.splash.core.video.f$a r7 = r8.b((boolean) r7)
            int r8 = r3.f27610b
            com.ss.android.ad.splash.core.video.f$a r7 = r7.d(r8)
            boolean r8 = r3.v()
            com.ss.android.ad.splash.core.video.f$a r7 = r7.c((boolean) r8)
            long r8 = r3.f()
            r7.o = r8
            com.ss.android.ad.splash.core.video.g r8 = r4.l
            boolean r9 = r3.i()
            r8.f27789f = r9
            int r8 = r1.h
            int r1 = r1.g
            int r9 = com.ss.android.ad.splash.core.e.t
            if (r9 != r5) goto L_0x0390
            android.content.res.Resources r9 = r4.getResources()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            int r10 = r9.widthPixels
            int r9 = r9.heightPixels
            float r11 = (float) r10
            float r12 = (float) r9
            float r11 = r11 / r12
            float r12 = (float) r8
            float r13 = (float) r1
            float r12 = r12 / r13
            int r13 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x036f
            int r8 = r8 * r9
            int r8 = r8 / r1
            r1 = r9
            goto L_0x037c
        L_0x036f:
            int r13 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0378
            int r1 = r1 * r10
            int r1 = r1 / r8
            r8 = r10
            goto L_0x037c
        L_0x0378:
            int r11 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x0390
        L_0x037c:
            int r8 = r8 - r10
            int r8 = java.lang.Math.abs(r8)
            int r8 = -r8
            int r8 = r8 / 2
            int r1 = r1 - r9
            int r1 = java.lang.Math.abs(r1)
            int r1 = -r1
            int r1 = r1 / 2
            r7.l = r8
            r7.m = r1
        L_0x0390:
            com.ss.android.ad.splash.core.video.g r1 = r4.l
            com.ss.android.ad.splash.core.video.f r7 = r7.a()
            boolean r1 = r1.a((com.ss.android.ad.splash.core.video.f) r7)
            goto L_0x0420
        L_0x039c:
            r4.setImageTouchListener(r3)
            boolean r1 = r4.b(r3)
            if (r1 != 0) goto L_0x03a7
            goto L_0x01ca
        L_0x03a7:
            int r1 = r3.h
            if (r1 == r9) goto L_0x03ac
            goto L_0x03f5
        L_0x03ac:
            boolean r1 = r3.h()
            if (r1 == 0) goto L_0x03f5
            r4.q = r5
            android.view.View r1 = r4.j
            r1.setVisibility(r6)
            android.view.View r1 = r4.j
            com.ss.android.ad.splash.core.b$14 r7 = new com.ss.android.ad.splash.core.b$14
            r7.<init>(r3)
            r1.setOnTouchListener(r7)
            java.lang.String r1 = r3.f27611c
            boolean r1 = com.ss.android.ad.splash.utils.g.a(r1)
            if (r1 != 0) goto L_0x03d3
            android.widget.TextView r1 = r4.k
            java.lang.String r7 = r3.f27611c
            r1.setText(r7)
            goto L_0x03eb
        L_0x03d3:
            int r1 = com.ss.android.ad.splash.core.e.j()
            if (r1 == 0) goto L_0x03e3
            android.widget.TextView r1 = r4.k
            int r7 = com.ss.android.ad.splash.core.e.j()
            r1.setText(r7)
            goto L_0x03eb
        L_0x03e3:
            android.widget.TextView r1 = r4.k
            r7 = 2131562515(0x7f0d1013, float:1.875046E38)
            r1.setText(r7)
        L_0x03eb:
            android.view.View r1 = r4.j
            com.ss.android.ad.splash.core.b$2 r7 = new com.ss.android.ad.splash.core.b$2
            r7.<init>(r3)
            r1.post(r7)
        L_0x03f5:
            int r1 = r3.i
            if (r1 == r5) goto L_0x0404
            android.widget.FrameLayout r1 = r4.r
            r1.setVisibility(r10)
            android.view.ViewGroup r1 = r4.f27541d
            r1.setVisibility(r10)
            goto L_0x0418
        L_0x0404:
            boolean r1 = r3.v()
            if (r1 == 0) goto L_0x0410
            android.widget.FrameLayout r1 = r4.r
            r1.setVisibility(r6)
            goto L_0x0415
        L_0x0410:
            android.view.ViewGroup r1 = r4.f27541d
            r1.setVisibility(r6)
        L_0x0415:
            r4.setSkipClickListener(r3)
        L_0x0418:
            r4.setSplashInfoStyle(r3)
            r4.a()
            goto L_0x01fe
        L_0x0420:
            if (r1 == 0) goto L_0x0454
            r4.f27538a = r3
            r4.o = r5
            long r7 = r3.c()
            r4.p = r7
            boolean r1 = r3.A
            r4.x = r1
            boolean r1 = r4.x
            if (r1 == 0) goto L_0x0452
            long r7 = r4.p
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r9
            int r1 = (int) r7
            r4.w = r1
            android.widget.TextView r1 = r4.f27542e
            int r7 = r4.w
            java.lang.String r7 = com.ss.android.ad.splash.core.b.a((int) r7)
            r1.setText(r7)
            android.widget.TextView r1 = r4.s
            int r7 = r4.w
            java.lang.String r7 = com.ss.android.ad.splash.core.b.a((int) r7)
            r1.setText(r7)
        L_0x0452:
            r1 = 1
            goto L_0x0455
        L_0x0454:
            r1 = 0
        L_0x0455:
            if (r1 != 0) goto L_0x0460
            com.ss.android.ad.splash.b.b.a()
            r1 = 7
            com.ss.android.ad.splash.b.b.a(r1)
            goto L_0x04cf
        L_0x0460:
            r0.f27717c = r4
        L_0x0462:
            com.ss.android.ad.splash.core.r r1 = com.ss.android.ad.splash.core.r.a()
            android.content.SharedPreferences$Editor r7 = r1.f27733b
            if (r7 != 0) goto L_0x0472
            android.content.SharedPreferences r7 = r1.f27732a
            android.content.SharedPreferences$Editor r7 = r7.edit()
            r1.f27733b = r7
        L_0x0472:
            android.content.SharedPreferences$Editor r7 = r1.f27733b
            java.lang.String r8 = "splash_ad_show_count"
            int r9 = r1.l()
            int r9 = r9 + r5
            r7.putInt(r8, r9)
            r1.d()
            r0.a((com.ss.android.ad.splash.core.c.b) r3)
            java.lang.String r1 = r3.w()
            boolean r7 = com.ss.android.ad.splash.core.e.R()
            if (r7 == 0) goto L_0x0499
            long r1 = r2.f27705c
            long r7 = r3.l()
            int r9 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x04b0
            goto L_0x04b1
        L_0x0499:
            boolean r7 = com.ss.android.ad.splash.utils.g.a(r1)
            if (r7 != 0) goto L_0x04b0
            java.lang.String r7 = r2.f27704b
            boolean r7 = com.ss.android.ad.splash.utils.g.a(r7)
            if (r7 != 0) goto L_0x04b0
            java.lang.String r2 = r2.f27704b
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x04b0
            goto L_0x04b1
        L_0x04b0:
            r5 = 0
        L_0x04b1:
            if (r5 == 0) goto L_0x04b9
            com.ss.android.ad.splash.core.b.b.a()
            com.ss.android.ad.splash.core.b.b.b((com.ss.android.ad.splash.core.c.b) r3)
        L_0x04b9:
            com.ss.android.ad.splash.b.b r1 = com.ss.android.ad.splash.b.b.a()
            long r2 = java.lang.System.currentTimeMillis()
            r1.f27513b = r2
            r1.d()
            com.ss.android.ad.splash.b.b.a()
            com.ss.android.ad.splash.b.b.a(r6)
            r16 = r4
            goto L_0x04d1
        L_0x04cf:
            r16 = 0
        L_0x04d1:
            if (r16 != 0) goto L_0x04da
            com.ss.android.ad.splash.core.j r1 = com.ss.android.ad.splash.core.j.a()
            r1.b()
        L_0x04da:
            android.os.Handler r1 = new android.os.Handler
            r1.<init>()
            com.ss.android.ad.splash.core.p$3 r2 = new com.ss.android.ad.splash.core.p$3
            r2.<init>()
            long r3 = com.ss.android.ad.splash.core.e.U()
            r1.postDelayed(r2, r3)
            return r16
        L_0x04ec:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "SplashAdActionListener为空! 请在SplashAdNative中设置！"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.core.p.a(android.content.Context):android.view.ViewGroup");
    }
}

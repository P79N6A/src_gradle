package com.ss.android.ugc.aweme.feed.ui;

import android.arch.lifecycle.Observer;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.comment.ui.VideoCommentDialogFragment2;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.feed.am;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.g.e;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.festival.common.FestivalResHandler;
import com.ss.android.ugc.aweme.legoImp.inflate.l;
import com.ss.android.ugc.aweme.legoImp.inflate.q;
import com.ss.android.ugc.aweme.newfollow.util.b;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.aweme.utils.u;
import org.greenrobot.eventbus.Subscribe;

public class bg extends e implements Observer<com.ss.android.ugc.aweme.arch.widgets.base.a> {
    public static ChangeQuickRedirect l;
    TextView m;
    View n;
    ImageView o;
    View p;

    public class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46591a;

        public a() {
        }

        public final void onClick(View view) {
            boolean z;
            if (PatchProxy.isSupport(new Object[]{view}, this, f46591a, false, 43151, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f46591a, false, 43151, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (ex.b()) {
                com.bytedance.ies.dmt.ui.d.a.c(bg.this.h, (int) C0906R.string.sk).a();
            } else if (com.ss.android.ugc.aweme.login.utils.a.a(bg.this.f3210b)) {
                com.bytedance.ies.dmt.ui.d.a.b(bg.this.h, com.ss.android.ugc.aweme.login.utils.a.a(bg.this.f3210b, C0906R.string.drx)).a();
            } else if (bg.this.f3210b == null || bg.this.f3210b.isCanPlay()) {
                if (PatchProxy.isSupport(new Object[0], null, VideoCommentDialogFragment2.f2855a, true, 27720, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], null, VideoCommentDialogFragment2.f2855a, true, 27720, new Class[0], Void.TYPE);
                } else {
                    VideoCommentDialogFragment2.w = SystemClock.uptimeMillis();
                }
                e.a().a(bg.this.o, bg.this.f3211c, aa.m(bg.this.f3210b), aa.a(bg.this.f3210b));
                com.ss.android.ugc.aweme.utils.bg.a(new com.ss.android.ugc.aweme.main.a.a());
                if (am.b(bg.this.f3210b) && !b.a(bg.this.f3210b)) {
                    com.bytedance.ies.dmt.ui.d.a.b(bg.this.h, (int) C0906R.string.brj).a();
                } else if (!b.a(bg.this.f3210b) && am.a(bg.this.f3210b) && !am.c(bg.this.f3210b)) {
                    com.bytedance.ies.dmt.ui.d.a.b(bg.this.h, (int) C0906R.string.du6).a();
                } else if (bg.this.f3210b == null || bg.this.f3210b.getVideoControl() == null || bg.this.f3210b.getVideoControl().timerStatus != 0) {
                    bg bgVar = bg.this;
                    if (PatchProxy.isSupport(new Object[0], bgVar, bg.l, false, 43144, new Class[0], Boolean.TYPE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[0], bgVar, bg.l, false, 43144, new Class[0], Boolean.TYPE)).booleanValue();
                    } else if (bgVar.f3210b == null || bgVar.f3210b.getStatus() == null || !bgVar.f3210b.getStatus().isAllowComment()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z || c.L(bg.this.f3210b)) {
                        bg.this.g.a("video_comment_list", (Object) 7);
                    } else if (!c.L(bg.this.f3210b)) {
                        com.bytedance.ies.dmt.ui.d.a.b(bg.this.h, (int) C0906R.string.pg).a();
                    }
                    if (aa.e(bg.this.f3211c) && c.t(bg.this.f3210b)) {
                        Context context = bg.this.h;
                        Aweme aweme = bg.this.f3210b;
                        if (PatchProxy.isSupport(new Object[]{context, aweme}, null, g.f39316a, true, 31746, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{context, aweme}, null, g.f39316a, true, 31746, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                        } else if (!com.ss.android.g.a.a()) {
                            d.a().a("draw_ad").b("otherclick").b(aweme).d("comment_sign").a(context);
                        }
                    }
                } else {
                    com.bytedance.ies.dmt.ui.d.a.c(bg.this.h, (int) C0906R.string.drb).a();
                }
            } else if (bg.this.f3210b.isImage()) {
                com.bytedance.ies.dmt.ui.d.a.b(bg.this.h, (int) C0906R.string.b0y).a();
            } else {
                com.bytedance.ies.dmt.ui.d.a.b(bg.this.h, (int) C0906R.string.drx).a();
            }
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43141, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 43141, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.utils.bg.d(this);
    }

    private int f() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43139, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, l, false, 43139, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f3210b == null) {
            return 0;
        } else {
            AwemeStatistics statistics = this.f3210b.getStatistics();
            if (statistics == null) {
                return 0;
            }
            int commentCount = statistics.getCommentCount();
            if (this.f3210b.getAdCommentStruct() != null && commentCount > 0) {
                commentCount++;
            }
            return commentCount;
        }
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43146, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 43146, new Class[0], Void.TYPE);
        } else if (this.m != null) {
            if (com.ss.android.ugc.aweme.setting.d.b(this.f3210b) || com.ss.android.ugc.aweme.login.utils.a.a(this.f3210b)) {
                this.m.setText(PushConstants.PUSH_TYPE_NOTIFY);
                a(PushConstants.PUSH_TYPE_NOTIFY);
                return;
            }
            this.m.setText(com.ss.android.ugc.aweme.i18n.b.a((long) f()));
            a(com.ss.android.ugc.aweme.i18n.b.a((long) f()));
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43137, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 43137, new Class[0], Void.TYPE);
        } else if (com.ss.android.ugc.aweme.festival.christmas.a.a()) {
            Drawable c2 = FestivalResHandler.c();
            if (c2 == null) {
                c2 = ContextCompat.getDrawable(this.h, 2130838956);
            }
            this.o.setImageDrawable(c2);
        }
    }

    public bg(View view) {
        super(view);
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43134, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 43134, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.utils.bg.c(this);
    }

    private void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, l, false, 43150, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, l, false, 43150, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!com.ss.android.g.a.a()) {
            this.p.setContentDescription(this.h.getString(C0906R.string.v4, new Object[]{str}));
            this.o.setContentDescription(this.h.getString(C0906R.string.v4, new Object[]{str}));
        }
    }

    @Subscribe
    public void onCommentEvent(com.ss.android.ugc.aweme.comment.b.a aVar) {
        com.ss.android.ugc.aweme.comment.b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, l, false, 43145, new Class[]{com.ss.android.ugc.aweme.comment.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, l, false, 43145, new Class[]{com.ss.android.ugc.aweme.comment.b.a.class}, Void.TYPE);
            return;
        }
        int i = aVar2.f36370a;
        if (i == 3 || i == 4 || i == 8) {
            Object[] objArr = (Object[]) aVar2.f36371b;
            if (objArr != null && objArr.length == 2) {
                g();
            }
        }
    }

    @Subscribe
    public void onVideoEvent(ar arVar) {
        ar arVar2 = arVar;
        if (PatchProxy.isSupport(new Object[]{arVar2}, this, l, false, 43147, new Class[]{ar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arVar2}, this, l, false, 43147, new Class[]{ar.class}, Void.TYPE);
        } else if (arVar2 != null) {
            if (14 == arVar2.f45292b) {
                if (StringUtils.equal(this.f3210b.getAid(), (String) arVar2.f45293c)) {
                    g();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005e, code lost:
        if (r0.equals("show_festival_activity_icon") != false) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onChanged(@android.support.annotation.Nullable java.lang.Object r11) {
        /*
            r10 = this;
            r7 = r11
            com.ss.android.ugc.aweme.arch.widgets.base.a r7 = (com.ss.android.ugc.aweme.arch.widgets.base.a) r7
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = l
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.arch.widgets.base.a> r1 = com.ss.android.ugc.aweme.arch.widgets.base.a.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 43143(0xa887, float:6.0456E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0035
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43143(0xa887, float:6.0456E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.arch.widgets.base.a> r1 = com.ss.android.ugc.aweme.arch.widgets.base.a.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0035:
            if (r7 == 0) goto L_0x007e
            java.lang.String r0 = r7.f34376a
            r1 = -1
            int r2 = r0.hashCode()
            r3 = -213371911(0xfffffffff34833f9, float:-1.5861717E31)
            if (r2 == r3) goto L_0x0061
            r3 = 281945252(0x10ce24a4, float:8.130913E-29)
            if (r2 == r3) goto L_0x0058
            r3 = 350216171(0x14dfdfeb, float:2.2605566E-26)
            if (r2 == r3) goto L_0x004e
            goto L_0x006b
        L_0x004e:
            java.lang.String r2 = "on_page_selected"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x006b
            r8 = 0
            goto L_0x006c
        L_0x0058:
            java.lang.String r2 = "show_festival_activity_icon"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x006b
            goto L_0x006c
        L_0x0061:
            java.lang.String r2 = "video_open_comment_dialog"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x006b
            r8 = 2
            goto L_0x006c
        L_0x006b:
            r8 = -1
        L_0x006c:
            switch(r8) {
                case 0: goto L_0x007a;
                case 1: goto L_0x007a;
                case 2: goto L_0x0070;
                default: goto L_0x006f;
            }
        L_0x006f:
            goto L_0x007e
        L_0x0070:
            android.view.View r0 = r10.p
            if (r0 == 0) goto L_0x007e
            android.view.View r0 = r10.p
            r0.callOnClick()
            goto L_0x007e
        L_0x007a:
            r10.a()
            return
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.bg.onChanged(java.lang.Object):void");
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, l, false, 43135, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, l, false, 43135, new Class[]{View.class}, Void.TYPE);
            return;
        }
        View a2 = ((q) com.ss.android.ugc.aweme.lego.a.i.b(q.class)).a(this.h, (int) C0906R.layout.layout_video_comment_count);
        this.p = a2.findViewById(C0906R.id.vs);
        if (this.p == null) {
            a2 = l.a(getClass().getName(), a2, this.h, C0906R.layout.layout_video_comment_count);
            this.p = a2.findViewById(C0906R.id.vs);
        }
        this.m = (TextView) a2.findViewById(C0906R.id.v4);
        this.n = a2.findViewById(C0906R.id.v3);
        this.o = (ImageView) a2.findViewById(C0906R.id.va);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(a2);
        }
        this.p.setOnClickListener(new a());
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43138, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 43138, new Class[0], Void.TYPE);
        } else if (u.a() && this.o != null) {
            int a3 = com.ss.android.ugc.aweme.framework.e.b.a(GlobalContext.getContext(), 36.0f);
            ViewGroup.LayoutParams layoutParams = this.o.getLayoutParams();
            layoutParams.height = a3;
            layoutParams.width = a3;
            this.o.setLayoutParams(layoutParams);
        }
        this.m.setOnClickListener(new a());
        this.n.setOnClickListener(new a());
        this.n.setOnTouchListener(v.a());
    }

    public final void a(DataCenter dataCenter) {
        if (PatchProxy.isSupport(new Object[]{dataCenter}, this, l, false, 43142, new Class[]{DataCenter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dataCenter}, this, l, false, 43142, new Class[]{DataCenter.class}, Void.TYPE);
            return;
        }
        if (dataCenter != null) {
            dataCenter.a("show_festival_activity_icon", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) this).a("video_open_comment_dialog", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) this).a("on_page_selected", (Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00d8 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.feed.model.VideoItemParams r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = l
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.VideoItemParams> r1 = com.ss.android.ugc.aweme.feed.model.VideoItemParams.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 43136(0xa880, float:6.0446E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43136(0xa880, float:6.0446E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.VideoItemParams> r1 = com.ss.android.ugc.aweme.feed.model.VideoItemParams.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            super.a((com.ss.android.ugc.aweme.feed.model.VideoItemParams) r19)
            r18.a()
            android.widget.TextView r0 = r7.m
            r0.setVisibility(r10)
            android.view.View r0 = r7.n
            r0.setVisibility(r10)
            com.ss.android.ugc.aweme.gesturelog.a r0 = com.ss.android.ugc.aweme.gesturelog.a.a()
            boolean r1 = r0.b()
            if (r1 == 0) goto L_0x0057
            android.view.View r1 = r7.n
            r0.a(r1)
        L_0x0057:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f3210b
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r0 = r0.getStatistics()
            if (r0 == 0) goto L_0x0098
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f3210b
            boolean r0 = com.ss.android.ugc.aweme.setting.d.b(r0)
            if (r0 != 0) goto L_0x008b
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f3210b
            boolean r0 = com.ss.android.ugc.aweme.login.utils.a.a(r0)
            if (r0 == 0) goto L_0x0070
            goto L_0x008b
        L_0x0070:
            android.widget.TextView r0 = r7.m     // Catch:{ Exception -> 0x0098 }
            int r1 = r18.f()     // Catch:{ Exception -> 0x0098 }
            long r1 = (long) r1     // Catch:{ Exception -> 0x0098 }
            java.lang.String r1 = com.ss.android.ugc.aweme.i18n.b.a(r1)     // Catch:{ Exception -> 0x0098 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0098 }
            int r0 = r18.f()     // Catch:{ Exception -> 0x0098 }
            long r0 = (long) r0     // Catch:{ Exception -> 0x0098 }
            java.lang.String r0 = com.ss.android.ugc.aweme.i18n.b.a(r0)     // Catch:{ Exception -> 0x0098 }
            r7.a((java.lang.String) r0)     // Catch:{ Exception -> 0x0098 }
            goto L_0x00a4
        L_0x008b:
            android.widget.TextView r0 = r7.m
            java.lang.String r1 = "0"
            r0.setText(r1)
            java.lang.String r0 = "0"
            r7.a((java.lang.String) r0)
            goto L_0x00a4
        L_0x0098:
            android.widget.TextView r0 = r7.m
            java.lang.String r1 = "0"
            r0.setText(r1)
            java.lang.String r0 = "0"
            r7.a((java.lang.String) r0)
        L_0x00a4:
            com.ss.android.ugc.aweme.commercialize.feed.e r8 = r8.mAdViewController
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43140(0xa884, float:6.0452E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.feed.e> r1 = com.ss.android.ugc.aweme.commercialize.feed.e.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00d8
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43140(0xa884, float:6.0452E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.feed.e> r1 = com.ss.android.ugc.aweme.commercialize.feed.e.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x00d8:
            if (r8 == 0) goto L_0x0130
            boolean r0 = r8.a()
            if (r0 != 0) goto L_0x00e8
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.f3210b
            boolean r0 = com.ss.android.ugc.aweme.commercialize.utils.c.h((com.ss.android.ugc.aweme.feed.model.Aweme) r0)
            if (r0 != 0) goto L_0x0130
        L_0x00e8:
            android.widget.TextView r0 = r7.m
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.feed.e.f38827a
            r14 = 0
            r15 = 30569(0x7769, float:4.2836E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r8
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x0117
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.commercialize.feed.e.f38827a
            r14 = 0
            r15 = 30569(0x7769, float:4.2836E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r12 = r8
            r16 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r9 = r1.booleanValue()
            goto L_0x0122
        L_0x0117:
            com.ss.android.ugc.aweme.commercialize.feed.am r1 = r8.f38830d
            if (r1 != 0) goto L_0x011c
            goto L_0x0122
        L_0x011c:
            com.ss.android.ugc.aweme.commercialize.feed.am r1 = r8.f38830d
            boolean r9 = r1.enableComment()
        L_0x0122:
            if (r9 == 0) goto L_0x012c
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f3210b
            boolean r1 = com.ss.android.ugc.aweme.commercialize.utils.c.L(r1)
            if (r1 == 0) goto L_0x012d
        L_0x012c:
            r10 = 4
        L_0x012d:
            r0.setVisibility(r10)
        L_0x0130:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.bg.a(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }
}

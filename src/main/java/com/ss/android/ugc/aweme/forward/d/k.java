package com.ss.android.ugc.aweme.forward.d;

import android.app.Activity;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.os.Message;
import android.text.TextUtils;
import android.view.TextureView;
import com.bytedance.common.utility.NetworkUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.widget.DragView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.b.f;
import com.ss.android.ugc.aweme.forward.f.b;
import com.ss.android.ugc.aweme.forward.f.c;
import com.ss.android.ugc.aweme.forward.view.OriginDetailActivity;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.newfollow.ui.AbsFollowFeedDetailActivity;
import com.ss.android.ugc.aweme.newfollow.ui.FollowEnterDetailViewModel;
import com.ss.android.ugc.aweme.newfollow.util.d;
import com.ss.android.ugc.aweme.newfollow.util.i;
import com.ss.android.ugc.aweme.newfollow.util.j;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.util.n;
import com.ss.android.ugc.aweme.newfollow.vh.FollowVideoViewHolder;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.u.ar;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.video.a.a;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.aweme.video.preload.g;
import com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import org.greenrobot.eventbus.Subscribe;

public class k extends b implements a {
    public static ChangeQuickRedirect l;
    public i m;
    public o n;
    public FollowVideoViewHolder.a o;
    protected int p;
    public boolean q;
    private com.ss.android.ugc.aweme.feed.b.a r = new com.ss.android.ugc.aweme.feed.b.a();
    private KeepSurfaceTextureView s;
    private boolean t;
    private Aweme u;

    public final void a(float f2) {
    }

    public final void b(e eVar) {
    }

    public final void c(boolean z) {
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, l, false, 45449, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, l, false, 45449, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f3281b.c() instanceof MainActivity) {
            FollowEnterDetailViewModel.a(this.f3284e, (MainActivity) this.f3281b.c()).f57208b = z;
        }
    }

    public final void a(e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, l, false, 45473, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, l, false, 45473, new Class[]{e.class}, Void.TYPE);
        } else if (f(eVar.f76049b)) {
            this.f3281b.l();
            ((f) this.f3281b).a(new com.ss.android.ugc.aweme.shortvideo.f.f(1));
            ((f) this.f3281b).a(1);
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, l, false, 45474, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, l, false, 45474, new Class[]{String.class}, Void.TYPE);
        } else if (f(str)) {
            ((f) this.f3281b).a(2);
            this.r.f45077a = 1;
            ((f) this.f3281b).a(new com.ss.android.ugc.aweme.shortvideo.f.f(2));
        }
    }

    private void q() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 45454, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 45454, new Class[0], Void.TYPE);
            return;
        }
        d j = j();
        if (j != null) {
            j.a();
        }
    }

    private boolean r() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 45468, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, l, false, 45468, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.g.a.a()) {
            return s();
        } else {
            return t();
        }
    }

    private boolean s() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 45469, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, l, false, 45469, new Class[0], Boolean.TYPE)).booleanValue();
        }
        this.m.f57422c = n();
        this.m.b();
        return true;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 45459, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 45459, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        m();
        if (this.f3282c != null) {
            d j = j();
            if (j != null) {
                j.f57412c = 0;
            }
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 45460, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 45460, new Class[0], Void.TYPE);
            return;
        }
        super.c();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 45456, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 45456, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        a(false);
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 45461, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 45461, new Class[0], Void.TYPE);
            return;
        }
        super.e();
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 45445, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 45445, new Class[0], Void.TYPE);
            return;
        }
        ((f) this.f3281b).a(true);
        bg.d(this);
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 45451, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 45451, new Class[0], Void.TYPE);
        } else if (this.u != null) {
            this.i.removeMessages(16);
            this.m.e();
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 45484, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 45484, new Class[0], Void.TYPE);
        } else if (this.f3282c != null && this.f3282c.getForwardItem() != null) {
            d j = j();
            if (j != null) {
                j.f57413d.a(256);
            }
            String a2 = b.a(this.f3281b.b().e(), this.f3282c.getAid());
            c.a().a(a2, new b(a2, this.f3282c, n()));
            OriginDetailActivity.a(this.f3281b.c(), this.f3282c, this.f3284e, a2, this.f3285f);
        }
    }

    public final o n() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 45471, new Class[0], o.class)) {
            return (o) PatchProxy.accessDispatch(new Object[0], this, l, false, 45471, new Class[0], o.class);
        }
        if (this.n == null) {
            d j = j();
            if (j == null || j.i == null) {
                this.n = j.a().b();
            } else {
                this.n = j.i;
            }
        }
        return this.n;
    }

    private boolean t() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 45470, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, l, false, 45470, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.ugc.aweme.framework.d.a.a(GlobalContext.getContext()) || this.m.a(false) || !com.ss.android.ugc.aweme.freeflowcard.b.a().j || AbTestManager.a().d().followToastType == 0 || AbTestManager.a().d().newFlowStrategy == 1) {
            this.m.f57422c = n();
            this.m.b();
            return true;
        } else if ((j() == null || j().f57412c != 2) && j().f57412c != 4) {
            ((f) this.f3281b).a(1);
            return false;
        } else {
            this.m.j();
            return true;
        }
    }

    public final void a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, l, false, 45448, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 45448, new Class[0], Void.TYPE);
        } else if (this.q) {
            this.q = false;
        } else {
            if (PatchProxy.isSupport(new Object[0], this, l, false, 45450, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, l, false, 45450, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (this.f3281b.c() instanceof MainActivity) {
                z = FollowEnterDetailViewModel.a(this.f3284e, (MainActivity) this.f3281b.c()).f57208b;
            }
            if (!z) {
                super.a();
            }
            if (h() || i()) {
                this.f3281b.m();
                return;
            }
            m();
            g.f().b();
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 45462, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 45462, new Class[0], Void.TYPE);
            return;
        }
        super.f();
        this.i.removeMessages(16);
        ((f) this.f3281b).a(true);
        m();
        this.f3281b.m();
        ((f) this.f3281b).b(false);
        if (this.n != null) {
            if (this.f3282c != null) {
                if (this.f3282c.getAwemeType() == 13) {
                    g.f().b(this.f3282c.getForwardItem());
                } else if (this.f3282c.getAwemeType() == 0) {
                    g.f().b(this.f3282c);
                }
            }
            j.a().a(this.n);
            this.m.a();
            this.m.f57422c = null;
            this.n = null;
        }
        k();
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 45481, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 45481, new Class[0], Void.TYPE);
            return;
        }
        if (this.m.f57422c == null) {
            this.m.f57422c = n();
        }
        if (!NetworkUtils.isNetworkAvailable(GlobalContext.getContext())) {
            com.bytedance.ies.dmt.ui.d.a.b(this.f3281b.c(), (int) C0906R.string.bgf).a();
        } else if (!this.g && this.f3282c != null && this.u.getVideo() != null) {
            if (this.r.f45077a == 2 || this.r.f45077a == 1) {
                com.ss.android.ugc.aweme.newfollow.g.a.a(this.f3282c, this.f3284e, this.t);
                m();
                if (j() != null) {
                    j().f57412c = 3;
                }
            } else if ((this.r.f45077a == 3 || this.r.f45077a == 0) && this.u.getVideo().getProperPlayAddr() != null) {
                com.ss.android.ugc.aweme.newfollow.g.a.a(this.f3282c);
                ((f) this.f3281b).a(0);
                this.u.getVideo().setRationAndSourceId(this.f3282c.getAid());
                if (AbTestManager.a().d().followToastType == 0 || AbTestManager.a().d().newFlowStrategy == 1) {
                    this.m.f57422c = n();
                    this.m.i();
                } else {
                    this.m.j();
                }
                if (this.o != null) {
                    this.o.a(this.f3282c);
                }
                if (j() != null) {
                    j().f57412c = 4;
                }
            }
        }
    }

    public final void p() {
        float f2;
        if (PatchProxy.isSupport(new Object[0], this, l, false, 45482, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 45482, new Class[0], Void.TYPE);
        } else if (this.f3282c != null) {
            this.t = true;
            d j = j();
            if (j != null) {
                j.f57413d.a(16777216);
                j.f57412c = this.r.f45077a;
                j.f57415f = ((f) this.f3281b).p()[0];
                j.f57414e = ((f) this.f3281b).p()[1];
                j.i = n();
                if (this.m.f57422c == null) {
                    this.m.f57422c = n();
                }
                int[] iArr = new int[2];
                this.s.getLocationOnScreen(iArr);
                if (this.u == null || this.u.getVideo() == null) {
                    f2 = ((float) this.s.getHeight()) / ((float) this.s.getWidth());
                } else {
                    f2 = ((float) this.u.getVideo().getHeight()) / ((float) this.u.getVideo().getWidth());
                }
                DragView.b bVar = new DragView.b(iArr[0], iArr[1], this.s.getHeight(), this.s.getWidth(), (float) this.f3281b.c().getResources().getDimensionPixelOffset(C0906R.dimen.gh), f2);
                int i = this.r.f45077a;
                if (i != 0) {
                    switch (i) {
                        case 2:
                            AbsFollowFeedDetailActivity.a(this.f3281b.c(), bVar, this.f3282c, 4, this.f3284e, j.j, false, true);
                            return;
                        case 3:
                            break;
                        default:
                            AbsFollowFeedDetailActivity.a(this.f3281b.c(), bVar, this.f3282c, 2, this.f3284e, j.j, false, true);
                            return;
                    }
                }
                AbsFollowFeedDetailActivity.a(this.f3281b.c(), bVar, this.f3282c, 3, this.f3284e, j.j, false, true);
            }
        }
    }

    private boolean f(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, l, false, 45483, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, l, false, 45483, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f3282c == null) {
            return false;
        } else {
            return TextUtils.equals(str, this.f3282c.getAid());
        }
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, l, false, 45457, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, l, false, 45457, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, l, false, 45464, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 45464, new Class[0], Void.TYPE);
            return;
        }
        this.i.removeMessages(16);
        Message message = new Message();
        message.what = 16;
        message.obj = this.f3282c;
        this.i.sendMessage(message);
    }

    public final void d(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, l, false, 45477, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, l, false, 45477, new Class[]{String.class}, Void.TYPE);
        } else if (f(str)) {
            ((f) this.f3281b).a(new com.ss.android.ugc.aweme.shortvideo.f.f(6));
            a(0);
            com.ss.android.ugc.aweme.newfollow.g.a.a(this.f3282c, this.f3285f, this.f3284e);
        }
    }

    public final void e(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, l, false, 45478, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, l, false, 45478, new Class[]{String.class}, Void.TYPE);
        } else if (f(str)) {
            ((f) this.f3281b).a(new com.ss.android.ugc.aweme.shortvideo.f.f(7));
        }
    }

    @Subscribe
    public void onFollowFeedDetailEvent(com.ss.android.ugc.aweme.newfollow.c.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, l, false, 45463, new Class[]{com.ss.android.ugc.aweme.newfollow.c.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, l, false, 45463, new Class[]{com.ss.android.ugc.aweme.newfollow.c.b.class}, Void.TYPE);
        } else if (this.f3281b != null && this.f3281b.g() && bVar.f57083b != null && bVar.f57083b.getAid().equals(this.f3282c.getAid())) {
            switch (bVar.f57082a) {
                case 1:
                    ((f) this.f3281b).a(bVar.f57084c);
                    return;
                case 2:
                    a(0);
                    break;
            }
        }
    }

    public final void c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, l, false, 45476, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, l, false, 45476, new Class[]{String.class}, Void.TYPE);
        } else if (f(str)) {
            if (PatchProxy.isSupport(new Object[0], this, l, false, 45452, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, l, false, 45452, new Class[0], Void.TYPE);
            } else if (this.r.f45077a != 3) {
                this.f3281b.l();
                ((f) this.f3281b).a(1);
                this.r.f45077a = 3;
                ((f) this.f3281b).a(new com.ss.android.ugc.aweme.shortvideo.f.f(4));
            }
            if (!h()) {
                if (PatchProxy.isSupport(new Object[0], this, l, false, 45455, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, l, false, 45455, new Class[0], Void.TYPE);
                    return;
                }
                d j = j();
                if (!(j == null || this.n == null)) {
                    j.a(this.t, this.f3284e, this.f3285f, "");
                }
            }
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, l, false, 45458, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, l, false, 45458, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(i);
        switch (i) {
            case 0:
            case 1:
                if (!PatchProxy.isSupport(new Object[0], this, l, false, 45466, new Class[0], Void.TYPE)) {
                    this.i.removeMessages(16);
                    Message message = new Message();
                    message.what = 16;
                    message.obj = this.f3282c;
                    this.i.sendMessageDelayed(message, 150);
                    break;
                } else {
                    PatchProxy.accessDispatch(new Object[0], this, l, false, 45466, new Class[0], Void.TYPE);
                    return;
                }
        }
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, l, false, 45475, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, l, false, 45475, new Class[]{String.class}, Void.TYPE);
        } else if (f(str)) {
            ((f) this.f3281b).a(false);
            ((f) this.f3281b).a(0);
            this.f3281b.k();
            this.r.f45077a = 2;
            com.ss.android.ugc.aweme.shortvideo.f.f fVar = new com.ss.android.ugc.aweme.shortvideo.f.f(11, this.m.c(), this.m.d());
            ((f) this.f3281b).a(fVar);
            q();
        }
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, l, false, 45442, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, l, false, 45442, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        super.handleMsg(message);
        if (message.what == 16) {
            Aweme aweme = (Aweme) message.obj;
            if (PatchProxy.isSupport(new Object[]{aweme}, this, l, false, 45467, new Class[]{Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aweme}, this, l, false, 45467, new Class[]{Aweme.class}, Void.TYPE);
            } else if (!NetworkUtils.isNetworkAvailable(GlobalContext.getContext())) {
                ((f) this.f3281b).a(3);
                com.bytedance.ies.dmt.ui.d.a.b(this.f3281b.c(), (int) C0906R.string.bgf).a();
            } else if (!this.g && this.f3281b.g() && this.f3281b.h() && aweme != null && this.f3282c != null && TextUtils.equals(this.f3282c.getAid(), aweme.getAid())) {
                d j = j();
                if (j == null) {
                    this.r.f45077a = 4;
                } else if (!j.f57413d.c(16777216) && !j.f57413d.c(256)) {
                    if (j.f57412c == 3) {
                        if (AbTestManager.a().aD()) {
                            r();
                            m();
                        }
                        ((f) this.f3281b).a(1);
                        this.r.f45077a = 3;
                        com.ss.android.ugc.aweme.shortvideo.f.f fVar = new com.ss.android.ugc.aweme.shortvideo.f.f(12, this.m.c(), this.m.d());
                        ((f) this.f3281b).a(fVar);
                        return;
                    }
                } else {
                    return;
                }
                boolean r2 = r();
                if (this.o != null && r2) {
                    this.o.a(this.f3282c);
                }
            }
        }
    }

    public final void b(boolean z) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, l, false, 45479, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, l, false, 45479, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ((f) this.f3281b).a(new com.ss.android.ugc.aweme.shortvideo.f.f(8, z, 0));
        f fVar = (f) this.f3281b;
        if (z) {
            i = 2;
        }
        fVar.a(i);
    }

    public final void a(com.ss.android.ugc.aweme.video.b.a aVar) {
        int i;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, l, false, 45472, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, l, false, 45472, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE);
        } else if (!this.g && f(aVar.f76010a)) {
            ((f) this.f3281b).a(0);
            this.f3281b.k();
            this.r.f45077a = 2;
            int i2 = this.p;
            String str = aVar.f76010a;
            if (this.f3282c != null) {
                i = this.f3282c.getAwemeType();
            } else {
                i = 0;
            }
            com.ss.android.ugc.aweme.feed.b.a(i2, str, i);
            bg.a(new com.ss.android.ugc.aweme.newfollow.c.d(this.f3282c));
            ((f) this.f3281b).a(new com.ss.android.ugc.aweme.shortvideo.f.f(0, aVar.f76012c));
        }
    }

    public final void a(com.ss.android.ugc.aweme.video.b.b bVar) {
        com.ss.android.ugc.aweme.video.b.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, l, false, 45480, new Class[]{com.ss.android.ugc.aweme.video.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, l, false, 45480, new Class[]{com.ss.android.ugc.aweme.video.b.b.class}, Void.TYPE);
        } else if (f(bVar2.f76013a)) {
            ((f) this.f3281b).a(false);
            ((f) this.f3281b).a(new com.ss.android.ugc.aweme.shortvideo.f.f(5));
            if (PatchProxy.isSupport(new Object[0], this, l, false, 45453, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, l, false, 45453, new Class[0], Void.TYPE);
            } else {
                d j = j();
                if (j != null) {
                    String str = this.f3284e;
                    String str2 = this.f3285f;
                    boolean z = this.t;
                    if (PatchProxy.isSupport(new Object[]{str, str2, Byte.valueOf(z ? (byte) 1 : 0)}, j, d.f57410a, false, 61898, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
                        d dVar = j;
                        PatchProxy.accessDispatch(new Object[]{str, str2, Byte.valueOf(z)}, dVar, d.f57410a, false, 61898, new Class[]{String.class, String.class, Boolean.TYPE}, Void.TYPE);
                    } else if (!j.h) {
                        j.h = true;
                        com.ss.android.ugc.aweme.newfollow.g.a.a(j.f57411b, str, str2, "", z, "");
                    }
                    if (this.f3281b.c() instanceof Activity) {
                        Intent intent = ((Activity) this.f3281b.c()).getIntent();
                        if (intent != null && intent.getBooleanExtra("from_notification", false)) {
                            String stringExtra = intent.getStringExtra("rule_id");
                            if (!TextUtils.isEmpty(stringExtra)) {
                                new ar("video_play_from_push").h(stringExtra).e();
                            }
                        }
                    }
                }
            }
            q();
        }
    }

    public final void b(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, l, false, 45447, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, l, false, 45447, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f3281b.g()) {
            this.f3283d.a(this.k);
            this.f3283d.d();
        }
        a(i, i2);
        bg.c(this);
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, l, false, 45446, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, l, false, 45446, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Aweme aweme = this.f3282c;
        if (aweme != null) {
            if (aweme.getAwemeType() == 13) {
                aweme = aweme.getForwardItem();
            }
            if (!(aweme == null || aweme.getVideo() == null)) {
                n.a(i, i2, this.s, ((float) aweme.getVideo().getHeight()) / ((float) aweme.getVideo().getWidth()));
                ((f) this.f3281b).q();
            }
        }
    }

    public final void a(Aweme aweme, String str, String str2) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2, str, str2}, this, l, false, 45443, new Class[]{Aweme.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, str, str2}, this, l, false, 45443, new Class[]{Aweme.class, String.class, String.class}, Void.TYPE);
            return;
        }
        super.a(aweme, str, str2);
        this.u = aweme.getForwardItem();
        this.m.a(aweme);
    }

    public k(f fVar, com.ss.android.ugc.aweme.feed.d dVar, l lVar, int i) {
        super(fVar, lVar);
        this.s = fVar.f();
        this.m = new i(this.s, this, dVar);
        this.m.f57424e = true;
        this.p = i;
        if (PatchProxy.isSupport(new Object[0], this, l, false, 45444, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 45444, new Class[0], Void.TYPE);
            return;
        }
        this.s.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48289a;

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                if (PatchProxy.isSupport(new Object[]{surfaceTexture}, this, f48289a, false, 45487, new Class[]{SurfaceTexture.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{surfaceTexture}, this, f48289a, false, 45487, new Class[]{SurfaceTexture.class}, Boolean.TYPE)).booleanValue();
                }
                k.this.l();
                return true;
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2)}, this, f48289a, false, 45485, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2)}, this, f48289a, false, 45485, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                k.this.b(i, i2);
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2)}, this, f48289a, false, 45486, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2)}, this, f48289a, false, 45486, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                k.this.a(i, i2);
            }
        });
    }
}

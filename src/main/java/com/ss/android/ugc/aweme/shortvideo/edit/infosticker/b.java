package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.aweme.story.shootvideo.a.a;
import com.ss.android.vesdk.p;
import com.ss.android.vesdk.r;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67226a;

    /* renamed from: b  reason: collision with root package name */
    public List<y> f67227b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public y f67228c;

    /* renamed from: d  reason: collision with root package name */
    public int f67229d;

    /* renamed from: e  reason: collision with root package name */
    InfoStickerEditView f67230e;

    /* renamed from: f  reason: collision with root package name */
    public p f67231f;
    public a g;
    public a h;
    public com.ss.android.ugc.aweme.base.b.a.b<y> i;
    private final float j = 0.5f;
    private final float k = 0.5f;
    private int l = 0;

    public final void a(@NonNull y yVar, float f2, float f3) {
        y yVar2 = yVar;
        if (PatchProxy.isSupport(new Object[]{yVar2, Float.valueOf(f2), Float.valueOf(f3)}, this, f67226a, false, 76737, new Class[]{y.class, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{yVar2, Float.valueOf(f2), Float.valueOf(f3)}, this, f67226a, false, 76737, new Class[]{y.class, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        yVar2.f67432c.currentOffsetX += f2 / ((float) this.f67230e.f67187d);
        yVar2.f67432c.currentOffsetY += f3 / ((float) this.f67230e.f67188e);
        this.f67231f.a(yVar2.f67432c.id, yVar2.f67432c.currentOffsetX, yVar2.f67432c.currentOffsetY);
        yVar.a(f2, f3);
    }

    public final void a(y yVar, int i2, int i3) {
        y yVar2 = yVar;
        int i4 = i2;
        int i5 = i3;
        if (PatchProxy.isSupport(new Object[]{yVar2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f67226a, false, 76741, new Class[]{y.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{yVar2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f67226a, false, 76741, new Class[]{y.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (yVar2 != null) {
            if (PatchProxy.isSupport(new Object[]{yVar2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f67226a, false, 76742, new Class[]{y.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{yVar2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f67226a, false, 76742, new Class[]{y.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            yVar2.f67432c.startTime = i4;
            yVar2.f67432c.endTime = i5;
            this.f67231f.a(yVar2.f67432c.id, i4, i5);
        }
    }

    public final boolean a(y yVar, int i2) {
        y yVar2 = yVar;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{yVar2, Integer.valueOf(i2)}, this, f67226a, false, 76747, new Class[]{y.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{yVar2, Integer.valueOf(i2)}, this, f67226a, false, 76747, new Class[]{y.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (i3 < yVar2.f67432c.startTime || i3 > yVar2.f67432c.endTime) {
            return yVar2.equals(this.f67228c);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f67226a, false, 76733, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67226a, false, 76733, new Class[0], Void.TYPE);
            return;
        }
        if (this.f67228c != null) {
            this.f67231f.a(this.f67228c.f67432c.id, this.f67228c.a(), this.f67228c.b());
            this.f67228c.f67433d = false;
            this.f67228c = null;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f67226a, false, 76739, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67226a, false, 76739, new Class[0], Void.TYPE);
            return;
        }
        for (y yVar : this.f67227b) {
            this.f67231f.c(yVar.f67432c.id, 0.3137255f);
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f67226a, false, 76743, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67226a, false, 76743, new Class[0], Void.TYPE);
            return;
        }
        for (y yVar : this.f67227b) {
            this.f67231f.c(yVar.f67432c.id, 1.0f);
        }
    }

    public final void b(y yVar) {
        if (PatchProxy.isSupport(new Object[]{yVar}, this, f67226a, false, 76728, new Class[]{y.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{yVar}, this, f67226a, false, 76728, new Class[]{y.class}, Void.TYPE);
            return;
        }
        if (yVar != null) {
            this.f67231f.a(yVar.f67432c.id, 0, this.f67229d);
        }
    }

    public final void a(y yVar) {
        if (PatchProxy.isSupport(new Object[]{yVar}, this, f67226a, false, 76727, new Class[]{y.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{yVar}, this, f67226a, false, 76727, new Class[]{y.class}, Void.TYPE);
            return;
        }
        this.f67231f.f(yVar.f67432c.id);
        this.f67227b.remove(yVar);
        this.f67228c = null;
        if (this.g != null) {
            this.g.b(yVar.f67432c);
        }
    }

    public final void c(y yVar) {
        if (PatchProxy.isSupport(new Object[]{yVar}, this, f67226a, false, 76730, new Class[]{y.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{yVar}, this, f67226a, false, 76730, new Class[]{y.class}, Void.TYPE);
        } else if (yVar != null) {
            if (PatchProxy.isSupport(new Object[]{yVar}, this, f67226a, false, 76738, new Class[]{y.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{yVar}, this, f67226a, false, 76738, new Class[]{y.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.n.b bVar = yVar.f67432c;
            int i2 = this.l + 1;
            this.l = i2;
            bVar.updateLayerWeight(i2);
            this.f67231f.c(yVar.f67432c.id, this.l);
            if (this.i != null) {
                this.i.accept(yVar);
            }
        }
    }

    public final void a(com.ss.android.ugc.aweme.n.a aVar) {
        boolean z;
        com.ss.android.ugc.aweme.n.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f67226a, false, 76725, new Class[]{com.ss.android.ugc.aweme.n.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f67226a, false, 76725, new Class[]{com.ss.android.ugc.aweme.n.a.class}, Void.TYPE);
        } else if (aVar2 != null && !Lists.isEmpty(aVar2.stickers)) {
            ArrayList<com.ss.android.ugc.aweme.n.b> arrayList = null;
            for (com.ss.android.ugc.aweme.n.b next : aVar2.stickers) {
                this.l = Math.max(this.l, next.layerWeight);
                if (next.isInfoSticker()) {
                    String str = aVar2.infoStickerDraftDir;
                    if (PatchProxy.isSupport(new Object[]{str, next}, this, f67226a, false, 76746, new Class[]{String.class, com.ss.android.ugc.aweme.n.b.class}, Boolean.TYPE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[]{str, next}, this, f67226a, false, 76746, new Class[]{String.class, com.ss.android.ugc.aweme.n.b.class}, Boolean.TYPE)).booleanValue();
                    } else {
                        String str2 = next.path;
                        if (!com.ss.android.ugc.aweme.video.b.b(str2)) {
                            str2 = str + File.separator + new File(str2).getName();
                        }
                        if (com.ss.android.ugc.aweme.video.b.b(str2)) {
                            next.id = this.f67231f.a(str2, TextUtils.isEmpty(next.extra) ? null : new String[]{next.extra});
                            if (next.id < 0) {
                                com.ss.android.ugc.aweme.framework.a.a.a("restore infoSticker failed: " + next.id);
                                n.a("info_sticker", c.a().a("event", "restore_failed: " + next.id).a("user_info", "path: " + str2 + " extra: " + next.extra).b());
                            } else {
                                this.f67231f.a(next.id, -next.rotateAngle);
                                this.f67231f.b(next.id, next.scale);
                                this.f67231f.a(next.id, next.currentOffsetX, next.currentOffsetY);
                                this.f67231f.a(next.id, next.startTime, next.endTime);
                                this.f67231f.c(next.id, next.layerWeight);
                                z = true;
                            }
                        } else if (!com.ss.android.ugc.aweme.g.a.a()) {
                            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new Exception("infoSticker not exist in edit"));
                        } else {
                            throw new IllegalStateException("infoSticker not exist in edit " + next);
                        }
                        z = false;
                    }
                    if (!z) {
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        arrayList.add(next);
                    } else {
                        y yVar = new y(this.f67230e.getContext(), next, this);
                        if (yVar.a(this.f67230e.f67187d, this.f67230e.f67188e, this.f67230e.f67185b, this.f67230e.f67186c, 0.5f, 0.5f)) {
                            yVar.b(next.scale);
                            yVar.a((next.currentOffsetX - 0.5f) * ((float) this.f67230e.f67187d), (next.currentOffsetY - 0.5f) * ((float) this.f67230e.f67188e));
                            this.f67227b.add(yVar);
                        }
                    }
                }
            }
            if (Lists.notEmpty(arrayList)) {
                ai.b("restore info stickers error: " + arrayList.size());
                for (com.ss.android.ugc.aweme.n.b bVar : arrayList) {
                    ai.b("remove error sticker " + bVar.id);
                    aVar2.removeSticker(bVar);
                }
            }
        }
    }

    public final void a(@NonNull y yVar, boolean z) {
        yVar.f67433d = true;
        this.f67228c = yVar;
    }

    public static int a(y yVar, y yVar2) {
        return yVar.f67432c.layerWeight - yVar2.f67432c.layerWeight;
    }

    b(InfoStickerEditView infoStickerEditView, p pVar) {
        this.f67230e = infoStickerEditView;
        this.f67231f = pVar;
        this.f67229d = this.f67231f.t();
    }

    public final void b(@NonNull y yVar, float f2) {
        y yVar2 = yVar;
        float f3 = f2;
        if (PatchProxy.isSupport(new Object[]{yVar2, Float.valueOf(f2)}, this, f67226a, false, 76736, new Class[]{y.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{yVar2, Float.valueOf(f2)}, this, f67226a, false, 76736, new Class[]{y.class, Float.TYPE}, Void.TYPE);
            return;
        }
        float f4 = yVar2.f67432c.scale * f3;
        if (f4 >= yVar2.f67431b || f3 >= 1.0f) {
            this.f67231f.b(yVar2.f67432c.id, f3);
            yVar2.f67432c.scale = f4;
            yVar.b(f2);
        }
    }

    public final void a(@NonNull y yVar, float f2) {
        y yVar2 = yVar;
        if (PatchProxy.isSupport(new Object[]{yVar2, Float.valueOf(f2)}, this, f67226a, false, 76735, new Class[]{y.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{yVar2, Float.valueOf(f2)}, this, f67226a, false, 76735, new Class[]{y.class, Float.TYPE}, Void.TYPE);
        } else if (f2 != 0.0f) {
            yVar2.f67432c.rotateAngle += f2;
            this.f67231f.a(yVar2.f67432c.id, -yVar2.f67432c.rotateAngle);
            yVar.a(f2);
        }
    }

    /* access modifiers changed from: package-private */
    public com.ss.android.ugc.aweme.n.b a(int i2, String str, String str2, String str3, int i3) {
        String str4;
        int i4 = i2;
        String str5 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str5, str2, str3, Integer.valueOf(i3)}, this, f67226a, false, 76745, new Class[]{Integer.TYPE, String.class, String.class, String.class, Integer.TYPE}, com.ss.android.ugc.aweme.n.b.class)) {
            return (com.ss.android.ugc.aweme.n.b) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str5, str2, str3, Integer.valueOf(i3)}, this, f67226a, false, 76745, new Class[]{Integer.TYPE, String.class, String.class, String.class, Integer.TYPE}, com.ss.android.ugc.aweme.n.b.class);
        }
        try {
            int i5 = this.l + 1;
            this.l = i5;
            r9 = r9;
            str4 = str5;
            try {
                com.ss.android.ugc.aweme.n.b bVar = new com.ss.android.ugc.aweme.n.b(str, str2, str3, i5, this.f67231f.e(i4), 0, this.f67229d);
                bVar.currentOffsetX = 0.5f;
                bVar.currentOffsetY = 0.5f;
                bVar.id = i4;
                bVar.type = i3;
                float[] g2 = this.f67231f.g(i4);
                bVar.initWidth = (g2[2] - g2[0]) * ((float) this.f67230e.f67187d);
                bVar.initHeight = (g2[1] - g2[3]) * ((float) this.f67230e.f67188e);
                if (com.ss.android.ugc.aweme.g.a.a()) {
                    if (bVar.initWidth == 0.0f || bVar.initHeight == 0.0f) {
                        throw new IllegalStateException("add infoSticker error: bouding = " + g2[0] + " " + g2[1] + " " + g2[2] + " " + g2[3] + " \n surface w*h = " + this.f67230e.f67187d + " * " + this.f67230e.f67188e);
                    }
                }
                return bVar;
            } catch (r e2) {
                e = e2;
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new RuntimeException("add info sticker failed: " + str4, e));
                c a2 = c.a();
                c a3 = a2.a("event", "initSticker failed : " + str4);
                n.a("info_sticker", a3.a("user_info", "initSticker size : " + this.f67227b.size()).b());
                return null;
            }
        } catch (r e3) {
            e = e3;
            str4 = str5;
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new RuntimeException("add info sticker failed: " + str4, e));
            c a22 = c.a();
            c a32 = a22.a("event", "initSticker failed : " + str4);
            n.a("info_sticker", a32.a("user_info", "initSticker size : " + this.f67227b.size()).b());
            return null;
        }
    }
}

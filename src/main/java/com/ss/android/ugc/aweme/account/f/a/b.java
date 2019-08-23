package com.ss.android.ugc.aweme.account.f.a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.bytedance.sdk.account.api.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.account.c;
import com.ss.android.common.util.i;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ac.b;
import com.ss.android.ugc.aweme.account.f.b;
import com.ss.android.ugc.aweme.account.util.n;
import com.ss.android.ugc.aweme.account.util.p;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.main.h.k;
import com.ss.android.ugc.aweme.profile.model.PlatformInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.w;
import com.ss.android.ugc.sdk.communication.a;
import com.ss.android.ugc.sdk.communication.msg.a;
import com.ss.android.ugc.sdk.communication.msg.base.Msg;
import com.ss.android.ugc.sdk.communication.msg.base.e;
import java.util.concurrent.Callable;

public final class b extends a implements WeakHandler.IHandler {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f31851d;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.sdk.communication.a f31852e;

    /* renamed from: f  reason: collision with root package name */
    private WeakHandler f31853f = new WeakHandler(this);
    private a g = new a();

    class a implements a.b<a.b> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f31876a;

        a() {
        }

        public final /* synthetic */ void a(e eVar) {
            a.b bVar = (a.b) eVar;
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f31876a, false, 20005, new Class[]{a.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f31876a, false, 20005, new Class[]{a.b.class}, Void.TYPE);
                return;
            }
            if (!(b.this.f31847b == null || bVar == null)) {
                if (bVar.d() == 0) {
                    b.this.c();
                } else if (bVar.d() == 20050) {
                    b.this.a(b.this.a((int) C0906R.string.gi));
                } else if (bVar.d() != -1) {
                    b.this.a(b.this.f31847b.getString(C0906R.string.gj));
                }
            }
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f31851d, false, 19984, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31851d, false, 19984, new Class[0], Void.TYPE);
            return;
        }
        a();
        w.a().queryUser(this.f31853f);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f31851d, false, 19991, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31851d, false, 19991, new Class[0], Void.TYPE);
            return;
        }
        if (this.f31847b != null) {
            com.ss.android.ugc.aweme.account.base.b.a((Activity) this.f31847b, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new b.C0400b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f31856a;

                public final void a(String[] strArr, int[] iArr) {
                    String str;
                    if (PatchProxy.isSupport(new Object[]{strArr, iArr}, this, f31856a, false, 20003, new Class[]{String[].class, int[].class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{strArr, iArr}, this, f31856a, false, 20003, new Class[]{String[].class, int[].class}, Void.TYPE);
                        return;
                    }
                    if (iArr[0] == 0) {
                        k kVar = (k) w.a(k.class);
                        if (PatchProxy.isSupport(new Object[0], null, n.f33102a, true, 21359, new Class[0], String.class)) {
                            str = (String) PatchProxy.accessDispatch(new Object[0], null, n.f33102a, true, 21359, new Class[0], String.class);
                        } else {
                            str = n.e().getString("hotsoon_download_url", "");
                        }
                        kVar.a(str, b.this.f31847b.getString(C0906R.string.amt), b.this.f31847b, true);
                    }
                }
            });
        }
    }

    public b(Context context) {
        super(context);
        this.f31852e = com.ss.android.ugc.sdk.communication.b.a(context);
    }

    public final void a(final String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f31851d, false, 19992, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f31851d, false, 19992, new Class[]{String.class}, Void.TYPE);
        } else if (this.f31847b != null) {
            AlertDialog.Builder a2 = p.a(this.f31847b);
            a2.setTitle((int) C0906R.string.gk);
            a2.setMessage((CharSequence) str);
            a2.setCancelable(false);
            a2.setPositiveButton((int) C0906R.string.p0, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f31858a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f31858a, false, 20004, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f31858a, false, 20004, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    b.this.f31848c.a(str);
                }
            });
            a2.create().show();
        }
    }

    public final void b(b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f31851d, false, 19981, new Class[]{b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f31851d, false, 19981, new Class[]{b.a.class}, Void.TYPE);
            return;
        }
        super.b(aVar);
        m.a().a(this.f31853f, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f31854a;

            public final Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f31854a, false, 19996, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f31854a, false, 19996, new Class[0], Object.class);
                }
                if (PatchProxy.isSupport(new Object[]{"HOTSOON"}, null, com.ss.android.ugc.aweme.account.f.a.f31845a, true, 19974, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{"HOTSOON"}, null, com.ss.android.ugc.aweme.account.f.a.f31845a, true, 19974, new Class[]{String.class}, Void.TYPE);
                } else {
                    i iVar = new i(b.a.f22239a + b.a.a() + "/aweme/v1/user/sync/unbind/");
                    iVar.a("product", com.ss.android.ugc.aweme.account.f.a.b("HOTSOON"));
                    c.a().c().a(Integer.MAX_VALUE, iVar.toString());
                }
                return null;
            }
        }, 2);
    }

    public final String a(int i) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f31851d, false, 19994, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f31851d, false, 19994, new Class[]{Integer.TYPE}, String.class);
        }
        com.ss.android.sdk.b.c[] cVarArr = {com.ss.android.sdk.b.c.f30696d, com.ss.android.sdk.b.c.f30697e, com.ss.android.sdk.b.c.f30695c, com.ss.android.sdk.b.c.f30693a, com.ss.android.sdk.b.c.f30698f};
        int[] iArr = {C0906R.string.gm, C0906R.string.hn, C0906R.string.go, C0906R.string.hl, C0906R.string.hj};
        String str2 = "";
        if (this.f31847b != null) {
            str = "";
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    break;
                }
                if (com.ss.android.sdk.b.b.a().a(cVarArr[i2].l)) {
                    str = this.f31847b.getString(iArr[i2]);
                    User k = w.k();
                    if (i2 == 0) {
                        if (k != null) {
                            try {
                                if (!TextUtils.isEmpty(k.getBindPhone())) {
                                    str2 = r11.substring(0, 3) + "*****" + r11.substring(r11.length() - 3, r11.length());
                                    break;
                                }
                            } catch (Exception unused) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (k != null) {
                        str2 = k.getNickname();
                        break;
                    }
                }
                i2++;
            }
        } else {
            str = "";
        }
        return this.f31847b.getString(i, new Object[]{str, str2});
    }

    public final void a(b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f31851d, false, 19980, new Class[]{b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f31851d, false, 19980, new Class[]{b.a.class}, Void.TYPE);
            return;
        }
        super.a(aVar);
        if (!this.f31852e.a("HOTSOON")) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.string.amx), Integer.valueOf(C0906R.string.amv), Integer.valueOf(C0906R.string.amw)}, this, f31851d, false, 19989, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.string.amx), Integer.valueOf(C0906R.string.amv), Integer.valueOf(C0906R.string.amw)}, this, f31851d, false, 19989, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (this.f31847b != null) {
                AlertDialog.Builder a2 = p.a(this.f31847b);
                a2.setTitle((int) C0906R.string.amx);
                a2.setMessage((CharSequence) a((int) C0906R.string.amv));
                a2.setPositiveButton((int) C0906R.string.amw, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f31870a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f31870a, false, 20001, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f31870a, false, 20001, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        b.this.d();
                    }
                });
                a2.setNegativeButton((int) C0906R.string.amu, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                a2.create().show();
            }
        } else if (!this.f31852e.b("HOTSOON")) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.string.amz), Integer.valueOf(C0906R.string.amy)}, this, f31851d, false, 19990, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.string.amz), Integer.valueOf(C0906R.string.amy)}, this, f31851d, false, 19990, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (this.f31847b != null) {
                AlertDialog.Builder a3 = p.a(this.f31847b);
                a3.setMessage((CharSequence) a((int) C0906R.string.amz));
                a3.setPositiveButton((int) C0906R.string.amy, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f31873a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f31873a, false, 20002, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f31873a, false, 20002, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        b.this.d();
                    }
                });
                a3.setNegativeButton((int) C0906R.string.amu, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                a3.create().show();
            }
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f31851d, false, 19982, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f31851d, false, 19982, new Class[0], Void.TYPE);
                return;
            }
            a();
            m.a().a(this.f31853f, new Callable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f31865a;

                public final Object call() throws Exception {
                    if (!PatchProxy.isSupport(new Object[0], this, f31865a, false, 19999, new Class[0], Object.class)) {
                        return com.ss.android.ugc.aweme.account.f.a.a("HOTSOON");
                    }
                    return PatchProxy.accessDispatch(new Object[0], this, f31865a, false, 19999, new Class[0], Object.class);
                }
            }, 0);
        }
    }

    public final void a(final boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f31851d, false, 19987, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f31851d, false, 19987, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a();
        m.a().a(this.f31853f, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f31867a;

            public final Object call() throws Exception {
                String str;
                if (PatchProxy.isSupport(new Object[0], this, f31867a, false, 20000, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f31867a, false, 20000, new Class[0], Object.class);
                }
                boolean z = z;
                if (PatchProxy.isSupport(new Object[]{"HOTSOON", Byte.valueOf(z ? (byte) 1 : 0)}, null, com.ss.android.ugc.aweme.account.f.a.f31845a, true, 19973, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{"HOTSOON", Byte.valueOf(z)}, null, com.ss.android.ugc.aweme.account.f.a.f31845a, true, 19973, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
                } else {
                    i iVar = new i(b.a.f22239a + b.a.a() + "/aweme/v1/user/sync/sync_all/");
                    iVar.a("product", com.ss.android.ugc.aweme.account.f.a.b("HOTSOON"));
                    if (z) {
                        str = "allow";
                    } else {
                        str = "deny";
                    }
                    iVar.a("action", str);
                    c.a().c().a(Integer.MAX_VALUE, iVar.toString());
                }
                return null;
            }
        }, 1);
    }

    public final void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f31851d, false, 19995, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f31851d, false, 19995, new Class[]{Message.class}, Void.TYPE);
        } else if (this.f31847b != null) {
            int i = message.what;
            if (i != 112) {
                switch (i) {
                    case 0:
                        Object obj = message.obj;
                        if (PatchProxy.isSupport(new Object[]{obj}, this, f31851d, false, 19983, new Class[]{Object.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{obj}, this, f31851d, false, 19983, new Class[]{Object.class}, Void.TYPE);
                            break;
                        } else {
                            if (obj instanceof Exception) {
                                this.f31848c.a(obj.toString());
                            } else {
                                com.ss.android.ugc.aweme.account.f.b.a aVar = (com.ss.android.ugc.aweme.account.f.b.a) obj;
                                if (aVar == null || aVar.f31886a == null || TextUtils.isEmpty(aVar.f31886a.f31887a)) {
                                    this.f31848c.a("");
                                } else {
                                    User k = w.k();
                                    String str = "";
                                    String str2 = "";
                                    if (k != null) {
                                        str2 = k.getNickname();
                                        UrlModel avatarThumb = k.getAvatarThumb();
                                        if (!(avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() <= 0)) {
                                            str = avatarThumb.getUrlList().get(0);
                                        }
                                    }
                                    this.f31852e.a((Msg) new a.C0826a("HOTSOON", aVar.f31886a.f31887a, str2, str), (a.b) this.g);
                                }
                            }
                            b();
                            return;
                        }
                    case 1:
                        Object obj2 = message.obj;
                        if (PatchProxy.isSupport(new Object[]{obj2}, this, f31851d, false, 19986, new Class[]{Object.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{obj2}, this, f31851d, false, 19986, new Class[]{Object.class}, Void.TYPE);
                            break;
                        } else if (obj2 instanceof Exception) {
                            b();
                            this.f31848c.a();
                            break;
                        } else {
                            this.f31848c.a();
                            b();
                            return;
                        }
                    case 2:
                        Object obj3 = message.obj;
                        if (!PatchProxy.isSupport(new Object[]{obj3}, this, f31851d, false, 19988, new Class[]{Object.class}, Void.TYPE)) {
                            if (!(obj3 instanceof Exception)) {
                                b();
                                c();
                                break;
                            } else {
                                b();
                                this.f31848c.a(obj3.toString());
                                return;
                            }
                        } else {
                            PatchProxy.accessDispatch(new Object[]{obj3}, this, f31851d, false, 19988, new Class[]{Object.class}, Void.TYPE);
                            return;
                        }
                }
            } else {
                Object obj4 = message.obj;
                if (PatchProxy.isSupport(new Object[]{obj4}, this, f31851d, false, 19985, new Class[]{Object.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{obj4}, this, f31851d, false, 19985, new Class[]{Object.class}, Void.TYPE);
                } else {
                    if (obj4 instanceof Exception) {
                        b();
                    } else {
                        User user = (User) obj4;
                        w.a().updateCurUser(user);
                        b();
                        if (user != null) {
                            PlatformInfo platformInfo = user.getPlatformInfo("hotsoon");
                            if (platformInfo != null && !platformInfo.isFullSynced()) {
                                if (PatchProxy.isSupport(new Object[0], this, f31851d, false, 19993, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f31851d, false, 19993, new Class[0], Void.TYPE);
                                }
                                AlertDialog.Builder a2 = p.a(this.f31847b);
                                a2.setTitle((int) C0906R.string.ch5);
                                a2.setMessage((int) C0906R.string.ch4);
                                a2.setPositiveButton((int) C0906R.string.p0, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f31861a;

                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f31861a, false, 19997, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f31861a, false, 19997, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                            return;
                                        }
                                        b.this.a(true);
                                        r.onEvent(MobClick.obtain().setEventName("sync_history_content").setLabelName("tongbu_hotsoon").setJsonObject(new com.ss.android.ugc.aweme.account.a.a.a().a("to_app", "hotsoon").b()));
                                    }
                                });
                                a2.setNegativeButton((int) C0906R.string.oy, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f31863a;

                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f31863a, false, 19998, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f31863a, false, 19998, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                            return;
                                        }
                                        b.this.a(false);
                                    }
                                });
                                a2.create().show();
                            }
                        }
                    }
                    this.f31848c.a();
                }
            }
        }
    }
}

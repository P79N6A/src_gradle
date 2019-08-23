package com.ss.android.ugc.aweme.iesapi.a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.sdk.b.c;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ac.b;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.l;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.iesapi.AuthApi;
import com.ss.android.ugc.aweme.iesapi.a;
import com.ss.android.ugc.aweme.profile.model.PlatformInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.sdk.communication.a;
import com.ss.android.ugc.sdk.communication.msg.a;
import com.ss.android.ugc.sdk.communication.msg.base.Msg;
import com.ss.android.ugc.sdk.communication.msg.base.e;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class b extends a implements WeakHandler.IHandler {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f50014d;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.sdk.communication.a f50015e;

    /* renamed from: f  reason: collision with root package name */
    private WeakHandler f50016f = new WeakHandler(this);
    private a g = new a();

    class a implements a.b<a.b> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50039a;

        a() {
        }

        public final /* synthetic */ void a(e eVar) {
            a.b bVar = (a.b) eVar;
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f50039a, false, 50007, new Class[]{a.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f50039a, false, 50007, new Class[]{a.b.class}, Void.TYPE);
                return;
            }
            if (!(b.this.f50010b == null || bVar == null)) {
                if (bVar.d() == 0) {
                    b.this.c();
                } else if (bVar.d() == 20050) {
                    b.this.a(b.this.a((int) C0906R.string.gi));
                } else if (bVar.d() != -1) {
                    b.this.a(b.this.f50010b.getString(C0906R.string.gj));
                }
            }
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f50014d, false, 49986, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50014d, false, 49986, new Class[0], Void.TYPE);
            return;
        }
        a();
        d.a().queryUser(this.f50016f);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f50014d, false, 49993, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50014d, false, 49993, new Class[0], Void.TYPE);
            return;
        }
        if (this.f50010b != null) {
            l.a((Activity) this.f50010b, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new b.C0400b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50019a;

                public final void a(String[] strArr, int[] iArr) {
                    if (PatchProxy.isSupport(new Object[]{strArr, iArr}, this, f50019a, false, 50005, new Class[]{String[].class, int[].class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{strArr, iArr}, this, f50019a, false, 50005, new Class[]{String[].class, int[].class}, Void.TYPE);
                        return;
                    }
                    if (iArr[0] == 0) {
                        com.ss.android.newmedia.e.a((String) SharePrefCache.inst().getHotsoonDownloadUrl().c(), b.this.f50010b.getString(C0906R.string.amt), b.this.f50010b, true, (JSONObject) null);
                    }
                }
            });
        }
    }

    public b(Context context) {
        super(context);
        this.f50015e = com.ss.android.ugc.sdk.communication.b.a(context);
    }

    public final void a(final String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f50014d, false, 49994, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f50014d, false, 49994, new Class[]{String.class}, Void.TYPE);
        } else if (this.f50010b != null) {
            AlertDialog.Builder a2 = com.ss.android.a.a.a(this.f50010b);
            a2.setTitle((int) C0906R.string.gk);
            a2.setMessage((CharSequence) str);
            a2.setCancelable(false);
            a2.setPositiveButton((int) C0906R.string.p0, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50021a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f50021a, false, 50006, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f50021a, false, 50006, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    b.this.f50011c.a(str);
                }
            });
            a2.create().show();
        }
    }

    public final void b(a.C0592a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f50014d, false, 49983, new Class[]{a.C0592a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f50014d, false, 49983, new Class[]{a.C0592a.class}, Void.TYPE);
            return;
        }
        super.b(aVar);
        m.a().a(this.f50016f, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f50017a;

            public final Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f50017a, false, 49998, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f50017a, false, 49998, new Class[0], Object.class);
                }
                if (PatchProxy.isSupport(new Object[]{"HOTSOON"}, null, AuthApi.f50007a, true, 49976, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{"HOTSOON"}, null, AuthApi.f50007a, true, 49976, new Class[]{String.class}, Void.TYPE);
                } else {
                    AuthApi.f50008b.unBind(AuthApi.a("HOTSOON")).execute();
                }
                return null;
            }
        }, 2);
    }

    public final String a(int i) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f50014d, false, 49996, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f50014d, false, 49996, new Class[]{Integer.TYPE}, String.class);
        }
        c[] cVarArr = {c.f30696d, c.f30697e, c.f30695c, c.f30693a, c.f30698f};
        int[] iArr = {C0906R.string.gm, C0906R.string.hn, C0906R.string.go, C0906R.string.hl, C0906R.string.hj};
        String str2 = "";
        if (this.f50010b != null) {
            str = "";
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    break;
                }
                if (com.ss.android.sdk.b.b.a().a(cVarArr[i2].l)) {
                    str = this.f50010b.getString(iArr[i2]);
                    if (i2 == 0) {
                        String bindPhone = d.a().getCurUser().getBindPhone();
                        try {
                            str2 = bindPhone.substring(0, 3) + "*****" + bindPhone.substring(bindPhone.length() - 3, bindPhone.length());
                            break;
                        } catch (Exception unused) {
                        }
                    } else if (d.a().getCurUser() != null) {
                        str2 = d.a().getCurUser().getNickname();
                        break;
                    }
                }
                i2++;
            }
        } else {
            str = "";
        }
        return this.f50010b.getString(i, new Object[]{str, str2});
    }

    public final void a(a.C0592a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f50014d, false, 49982, new Class[]{a.C0592a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f50014d, false, 49982, new Class[]{a.C0592a.class}, Void.TYPE);
            return;
        }
        super.a(aVar);
        if (!this.f50015e.a("HOTSOON")) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.string.amx), Integer.valueOf(C0906R.string.amv), Integer.valueOf(C0906R.string.amw)}, this, f50014d, false, 49991, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.string.amx), Integer.valueOf(C0906R.string.amv), Integer.valueOf(C0906R.string.amw)}, this, f50014d, false, 49991, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (this.f50010b != null) {
                AlertDialog.Builder a2 = com.ss.android.a.a.a(this.f50010b);
                a2.setTitle((int) C0906R.string.amx);
                a2.setMessage((CharSequence) a((int) C0906R.string.amv));
                a2.setPositiveButton((int) C0906R.string.amw, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f50033a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f50033a, false, 50003, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f50033a, false, 50003, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
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
        } else if (!this.f50015e.b("HOTSOON")) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.string.amz), Integer.valueOf(C0906R.string.amy)}, this, f50014d, false, 49992, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.string.amz), Integer.valueOf(C0906R.string.amy)}, this, f50014d, false, 49992, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (this.f50010b != null) {
                AlertDialog.Builder a3 = com.ss.android.a.a.a(this.f50010b);
                a3.setMessage((CharSequence) a((int) C0906R.string.amz));
                a3.setPositiveButton((int) C0906R.string.amy, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f50036a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f50036a, false, 50004, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f50036a, false, 50004, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
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
            if (PatchProxy.isSupport(new Object[0], this, f50014d, false, 49984, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50014d, false, 49984, new Class[0], Void.TYPE);
                return;
            }
            a();
            m.a().a(this.f50016f, new Callable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50028a;

                public final Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f50028a, false, 50001, new Class[0], Object.class)) {
                        return PatchProxy.accessDispatch(new Object[0], this, f50028a, false, 50001, new Class[0], Object.class);
                    }
                    if (!PatchProxy.isSupport(new Object[]{"HOTSOON"}, null, AuthApi.f50007a, true, 49973, new Class[]{String.class}, com.ss.android.ugc.aweme.account.f.b.a.class)) {
                        return (com.ss.android.ugc.aweme.account.f.b.a) AuthApi.f50008b.getToken(AuthApi.a("HOTSOON")).execute().body();
                    }
                    return (com.ss.android.ugc.aweme.account.f.b.a) PatchProxy.accessDispatch(new Object[]{"HOTSOON"}, null, AuthApi.f50007a, true, 49973, new Class[]{String.class}, com.ss.android.ugc.aweme.account.f.b.a.class);
                }
            }, 0);
        }
    }

    public final void a(final boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f50014d, false, 49989, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f50014d, false, 49989, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a();
        m.a().a(this.f50016f, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f50030a;

            public final Object call() throws Exception {
                String str;
                if (PatchProxy.isSupport(new Object[0], this, f50030a, false, 50002, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f50030a, false, 50002, new Class[0], Object.class);
                }
                boolean z = z;
                if (PatchProxy.isSupport(new Object[]{"HOTSOON", Byte.valueOf(z ? (byte) 1 : 0)}, null, AuthApi.f50007a, true, 49975, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{"HOTSOON", Byte.valueOf(z)}, null, AuthApi.f50007a, true, 49975, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
                } else {
                    AuthApi.AuthService authService = AuthApi.f50008b;
                    int a2 = AuthApi.a("HOTSOON");
                    if (z) {
                        str = "allow";
                    } else {
                        str = "deny";
                    }
                    authService.syncAll(a2, str).execute();
                }
                return null;
            }
        }, 1);
    }

    public final void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f50014d, false, 49997, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f50014d, false, 49997, new Class[]{Message.class}, Void.TYPE);
        } else if (this.f50010b != null) {
            int i = message.what;
            if (i != 112) {
                switch (i) {
                    case 0:
                        Object obj = message.obj;
                        if (PatchProxy.isSupport(new Object[]{obj}, this, f50014d, false, 49985, new Class[]{Object.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{obj}, this, f50014d, false, 49985, new Class[]{Object.class}, Void.TYPE);
                            break;
                        } else {
                            if (obj instanceof Exception) {
                                this.f50011c.a(obj.toString());
                            } else {
                                com.ss.android.ugc.aweme.account.f.b.a aVar = (com.ss.android.ugc.aweme.account.f.b.a) obj;
                                if (aVar == null || aVar.f31886a == null || TextUtils.isEmpty(aVar.f31886a.f31887a)) {
                                    this.f50011c.a("");
                                } else {
                                    User curUser = d.a().getCurUser();
                                    String str = "";
                                    String str2 = "";
                                    if (curUser != null) {
                                        str2 = curUser.getNickname();
                                        UrlModel avatarThumb = curUser.getAvatarThumb();
                                        if (!(avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() <= 0)) {
                                            str = avatarThumb.getUrlList().get(0);
                                        }
                                    }
                                    this.f50015e.a((Msg) new a.C0826a("HOTSOON", aVar.f31886a.f31887a, str2, str), (a.b) this.g);
                                }
                            }
                            b();
                            return;
                        }
                    case 1:
                        Object obj2 = message.obj;
                        if (PatchProxy.isSupport(new Object[]{obj2}, this, f50014d, false, 49988, new Class[]{Object.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{obj2}, this, f50014d, false, 49988, new Class[]{Object.class}, Void.TYPE);
                            break;
                        } else if (obj2 instanceof Exception) {
                            b();
                            this.f50011c.a();
                            break;
                        } else {
                            this.f50011c.a();
                            b();
                            return;
                        }
                    case 2:
                        Object obj3 = message.obj;
                        if (!PatchProxy.isSupport(new Object[]{obj3}, this, f50014d, false, 49990, new Class[]{Object.class}, Void.TYPE)) {
                            if (!(obj3 instanceof Exception)) {
                                b();
                                c();
                                break;
                            } else {
                                b();
                                this.f50011c.a(obj3.toString());
                                return;
                            }
                        } else {
                            PatchProxy.accessDispatch(new Object[]{obj3}, this, f50014d, false, 49990, new Class[]{Object.class}, Void.TYPE);
                            return;
                        }
                }
            } else {
                Object obj4 = message.obj;
                if (PatchProxy.isSupport(new Object[]{obj4}, this, f50014d, false, 49987, new Class[]{Object.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{obj4}, this, f50014d, false, 49987, new Class[]{Object.class}, Void.TYPE);
                } else {
                    if (obj4 instanceof Exception) {
                        b();
                    } else {
                        User user = (User) obj4;
                        d.a().updateCurUser(user);
                        b();
                        if (user != null) {
                            PlatformInfo platformInfo = user.getPlatformInfo("hotsoon");
                            if (platformInfo != null && !platformInfo.isFullSynced()) {
                                if (PatchProxy.isSupport(new Object[0], this, f50014d, false, 49995, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f50014d, false, 49995, new Class[0], Void.TYPE);
                                }
                                AlertDialog.Builder a2 = com.ss.android.a.a.a(this.f50010b);
                                a2.setTitle((int) C0906R.string.ch5);
                                a2.setMessage((int) C0906R.string.ch4);
                                a2.setPositiveButton((int) C0906R.string.p0, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f50024a;

                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f50024a, false, 49999, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f50024a, false, 49999, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                            return;
                                        }
                                        b.this.a(true);
                                        r.onEvent(MobClick.obtain().setEventName("sync_history_content").setLabelName("tongbu_hotsoon").setJsonObject(new com.ss.android.ugc.aweme.app.d.c().a("to_app", "hotsoon").b()));
                                    }
                                });
                                a2.setNegativeButton((int) C0906R.string.oy, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f50026a;

                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f50026a, false, 50000, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f50026a, false, 50000, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                            return;
                                        }
                                        b.this.a(false);
                                    }
                                });
                                a2.create().show();
                            }
                        }
                    }
                    this.f50011c.a();
                }
            }
        }
    }
}

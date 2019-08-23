package com.ss.android.ugc.aweme.im.sdk.a;

import android.content.Context;
import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sdk.g.a;
import com.ss.android.ugc.aweme.im.service.IIMService;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50079a;

    /* renamed from: b  reason: collision with root package name */
    public c f50080b;

    /* renamed from: c  reason: collision with root package name */
    private Context f50081c;

    public final void sendMsg() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f50079a, false, 50120, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50079a, false, 50120, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], null, e.f50108a, true, 50134, new Class[0], Integer.TYPE)) {
            i = ((Integer) PatchProxy.accessDispatch(new Object[0], null, e.f50108a, true, 50134, new Class[0], Integer.TYPE)).intValue();
        } else {
            if (ServiceManager.get().getService(IUserService.class) == null || ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser() == null || !((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser().isPhoneBinded()) {
                com.ss.android.ugc.aweme.im.service.b abInterface = ((IIMService) a.a(IIMService.class)).getAbInterface();
                if (abInterface != null) {
                    i = abInterface.a();
                }
            }
            i = 10;
        }
        if (i == 10) {
            if (this.f50080b != null) {
                this.f50080b.sendMsg();
            }
        } else if (i == 20) {
            a.a(this.f50081c, this.f50081c.getResources().getString(C0906R.string.ape), this.f50081c.getResources().getString(C0906R.string.apd), C0906R.string.aql, new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50082a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f50082a, false, 50121, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f50082a, false, 50121, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (b.this.f50080b != null) {
                        b.this.f50080b.sendMsg();
                    }
                }
            }, C0906R.string.apb, new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50084a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f50084a, false, 50122, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f50084a, false, 50122, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    a.a();
                }
            });
        } else if (i == 21) {
            com.bytedance.ies.e.b a2 = com.bytedance.ies.e.b.a(this.f50081c);
            if (!a2.a("im_fake_bind_phone_key", false)) {
                a2.a("im_fake_bind_phone_key", (Object) Boolean.TRUE).a();
                a.a(this.f50081c, this.f50081c.getResources().getString(C0906R.string.ape), this.f50081c.getResources().getString(C0906R.string.apd), C0906R.string.aql, new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f50086a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f50086a, false, 50123, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f50086a, false, 50123, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        if (b.this.f50080b != null) {
                            b.this.f50080b.sendMsg();
                        }
                    }
                }, C0906R.string.apb, new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f50088a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f50088a, false, 50124, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f50088a, false, 50124, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        a.a();
                    }
                });
            } else if (this.f50080b != null) {
                this.f50080b.sendMsg();
            }
        } else if (i == 30) {
            a.a(this.f50081c, this.f50081c.getResources().getString(C0906R.string.ape), this.f50081c.getResources().getString(C0906R.string.apd), C0906R.string.aql, new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50090a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f50090a, false, 50125, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f50090a, false, 50125, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (b.this.f50080b != null) {
                        b.this.f50080b.sendMsg();
                    }
                }
            }, C0906R.string.apb, new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50092a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f50092a, false, 50126, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f50092a, false, 50126, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    a.a();
                }
            });
        } else if (i == 40) {
            a.a(this.f50081c, this.f50081c.getResources().getString(C0906R.string.ape), this.f50081c.getResources().getString(C0906R.string.apc), C0906R.string.aql, new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            }, C0906R.string.apb, new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50095a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f50095a, false, 50127, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f50095a, false, 50127, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    a.a();
                }
            });
        }
    }

    public b(Context context, c cVar) {
        this.f50081c = context;
        this.f50080b = cVar;
    }
}

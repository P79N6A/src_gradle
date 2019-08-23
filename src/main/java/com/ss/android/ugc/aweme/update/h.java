package com.ss.android.ugc.aweme.update;

import a.i;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Message;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.bytedance.ies.uikit.base.IComponent;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.image.b;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class h implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75218a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f75219b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakHandler f75220c;

    /* renamed from: d  reason: collision with root package name */
    WeakReference<AlertDialog> f75221d;

    /* renamed from: e  reason: collision with root package name */
    DialogInterface.OnClickListener f75222e;

    /* renamed from: f  reason: collision with root package name */
    private final IComponent f75223f;
    private final AwemeAppData g;
    private final a h;
    private j i;
    private WeakReference<AlertDialog> j;

    public interface a {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75218a, false, 87371, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75218a, false, 87371, new Class[0], Void.TYPE);
            return;
        }
        this.i = m.a().y();
        final j jVar = this.i;
        if (jVar.c()) {
            com.ss.android.a.a.a(this.f75219b).setTitle((int) C0906R.string.clc).setMessage((int) C0906R.string.b1_).setPositiveButton((int) C0906R.string.a0v, (DialogInterface.OnClickListener) null).show();
        } else if (!NetworkUtils.isNetworkAvailable(this.f75219b)) {
            com.ss.android.a.a.a(this.f75219b).setTitle((int) C0906R.string.clc).setMessage((int) C0906R.string.bgf).setPositiveButton((int) C0906R.string.a0v, (DialogInterface.OnClickListener) null).show();
        } else {
            this.j = new WeakReference<>(com.ss.android.a.a.a(this.f75219b).setTitle((int) C0906R.string.clc).setMessage((int) C0906R.string.si).setCancelable(false).show());
            i.a((Callable<TResult>) new i<TResult>(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f75226a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f75226a, false, 87376, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f75226a, false, 87376, new Class[0], Void.TYPE);
                    } else if (!jVar.a()) {
                        if (!NetworkUtils.isNetworkAvailable(h.this.f75219b)) {
                            h.this.f75220c.sendEmptyMessage(1);
                        } else {
                            h.this.f75220c.sendEmptyMessage(2);
                        }
                    } else if (!jVar.b()) {
                        h.this.f75220c.sendEmptyMessage(2);
                    } else {
                        h.this.f75220c.sendEmptyMessage(3);
                    }
                }
            }), (Executor) com.ss.android.ugc.aweme.thread.h.c());
        }
    }

    public final void handleMsg(Message message) {
        AlertDialog alertDialog;
        AlertDialog alertDialog2;
        if (PatchProxy.isSupport(new Object[]{message}, this, f75218a, false, 87373, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f75218a, false, 87373, new Class[]{Message.class}, Void.TYPE);
        } else if (this.f75223f.isViewValid()) {
            if (this.j != null) {
                alertDialog = (AlertDialog) this.j.get();
            } else {
                alertDialog = null;
            }
            if (this.f75221d != null) {
                alertDialog2 = (AlertDialog) this.f75221d.get();
            } else {
                alertDialog2 = null;
            }
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            if (alertDialog2 != null) {
                alertDialog2.dismiss();
            }
            switch (message.what) {
                case 1:
                    com.ss.android.a.a.a(this.f75219b).setTitle((int) C0906R.string.clc).setMessage((int) C0906R.string.bga).setPositiveButton((int) C0906R.string.a0v, (DialogInterface.OnClickListener) null).show();
                    return;
                case 2:
                    com.ss.android.a.a.a(this.f75219b).setTitle((int) C0906R.string.clc).setMessage((int) C0906R.string.bi6).setPositiveButton((int) C0906R.string.a0v, (DialogInterface.OnClickListener) null).show();
                    if (this.h != null) {
                        return;
                    }
                    break;
                case 3:
                    if (!(this.i == null || this.f75219b == null)) {
                        this.i.a(this.f75219b, "more_tab", "update_version_confirm");
                    }
                    if (this.h != null) {
                        return;
                    }
                    break;
                case 4:
                    UIUtils.displayToastWithIcon(this.f75219b, 2130838576, (int) C0906R.string.cmw);
                    break;
            }
        }
    }

    public h(Context context, IComponent iComponent) {
        this(context, iComponent, null);
    }

    private h(Context context, IComponent iComponent, a aVar) {
        this.f75220c = new WeakHandler(this);
        this.j = null;
        this.f75221d = null;
        this.f75222e = new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f75224a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f75224a, false, 87375, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f75224a, false, 87375, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                dialogInterface.dismiss();
                h hVar = h.this;
                if (PatchProxy.isSupport(new Object[0], hVar, h.f75218a, false, 87372, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], hVar, h.f75218a, false, 87372, new Class[0], Void.TYPE);
                    return;
                }
                hVar.f75221d = new WeakReference<>(com.ss.android.a.a.a(hVar.f75219b).setTitle((int) C0906R.string.clc).setMessage((int) C0906R.string.tg).setCancelable(false).show());
                new ThreadPlus() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f75229a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f75229a, false, 87377, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f75229a, false, 87377, new Class[0], Void.TYPE);
                            return;
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        new b(h.this.f75219b).b();
                        if (System.currentTimeMillis() - currentTimeMillis < 500) {
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException unused) {
                            }
                        }
                        h.this.f75220c.sendEmptyMessage(4);
                    }
                }.start();
            }
        };
        this.f75219b = context;
        this.g = AwemeAppData.p();
        this.f75223f = iComponent;
        this.h = null;
    }
}

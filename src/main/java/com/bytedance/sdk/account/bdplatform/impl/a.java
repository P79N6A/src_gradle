package com.bytedance.sdk.account.bdplatform.impl;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.bytedance.sdk.account.b.c.c;
import com.bytedance.sdk.account.bdplatform.a.a;
import com.bytedance.sdk.account.bdplatform.a.b;
import com.bytedance.sdk.account.bdplatform.b.e;
import com.bytedance.sdk.account.bdplatform.impl.view.BaseBDAuthorizeActivity;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.utils.eq;

public final class a implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final a.c f22284a;

    /* renamed from: b  reason: collision with root package name */
    public final b f22285b;

    /* renamed from: c  reason: collision with root package name */
    final a.C0232a f22286c;

    /* renamed from: d  reason: collision with root package name */
    final Handler f22287d;

    /* renamed from: e  reason: collision with root package name */
    volatile boolean f22288e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f22289f;
    private com.bytedance.sdk.account.bdplatform.impl.view.a g;

    public final void b() {
        this.f22288e = false;
        a("加载中");
        this.f22285b.a((Runnable) new Runnable() {
            public final void run() {
                boolean z;
                if (a.this.f22285b != null) {
                    z = a.this.f22285b.b();
                } else {
                    z = false;
                }
                a aVar = a.this;
                if (!aVar.f22288e) {
                    aVar.f22287d.post(new Runnable(z) {

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ boolean f22300a;

                        public final void run() {
                            if (!this.f22300a) {
                                a.this.d();
                            }
                            a.this.f22284a.onUpdateLoginStatus(this.f22300a);
                        }

                        {
                            this.f22300a = r2;
                        }
                    });
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public c.b c() {
        c.b bVar = new c.b();
        bVar.errorCode = -1;
        bVar.errorMsg = this.f22289f.getString(C0906R.string.lh);
        return bVar;
    }

    public final void d() {
        if (!(this.f22289f instanceof BaseBDAuthorizeActivity) || !((BaseBDAuthorizeActivity) this.f22289f).isFinishing()) {
            if (this.g != null) {
                this.g.dismiss();
            }
            return;
        }
        this.g = null;
    }

    public final boolean a() {
        if (this.f22288e) {
            return false;
        }
        this.f22288e = true;
        this.f22287d.post(new Runnable() {
            public final void run() {
                a.this.d();
            }
        });
        c.b bVar = new c.b();
        bVar.errorCode = -2;
        bVar.errorMsg = this.f22289f.getString(C0906R.string.lg);
        this.f22284a.onCancel(bVar);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void a(final c.b bVar) {
        if (!this.f22288e) {
            this.f22287d.post(new Runnable() {
                public final void run() {
                    a.this.d();
                    a.this.f22284a.onError(bVar);
                }
            });
        }
    }

    private void a(String str) {
        if (this.g == null) {
            this.g = new com.bytedance.sdk.account.bdplatform.impl.view.a(this.f22289f);
        } else if (this.g.isShowing()) {
            return;
        }
        this.g.setOnCancelListener(new DialogInterface.OnCancelListener() {
            public final void onCancel(DialogInterface dialogInterface) {
                a.this.a();
            }
        });
        this.g.a(str);
        this.g.show();
    }

    public final boolean b(final c.a aVar) {
        this.f22288e = false;
        if (!this.f22285b.a()) {
            this.f22284a.onNeedLogin();
            return false;
        } else if (!this.f22285b.c()) {
            Toast makeText = Toast.makeText(this.f22289f, this.f22289f.getString(C0906R.string.li), 0);
            makeText.setGravity(17, 0, 0);
            if (Build.VERSION.SDK_INT == 25) {
                eq.a(makeText);
            }
            makeText.show();
            return false;
        } else {
            a("登录中");
            this.f22285b.a((Runnable) new Runnable() {
                public final void run() {
                    a aVar = a.this;
                    c.a aVar2 = aVar;
                    if (!aVar.f22288e) {
                        e a2 = aVar.f22286c.a();
                        if (a2 == null || !a2.f22281e) {
                            c.b c2 = aVar.c();
                            if (a2 != null) {
                                c2.errorCode = a2.f22282f;
                                c2.errorMsg = a2.g;
                            }
                            a.a(c2, 2);
                            aVar.a(c2);
                            return;
                        }
                        com.bytedance.sdk.account.bdplatform.b.a a3 = aVar.f22286c.a(aVar2, a2.f22283a);
                        if (a3 == null || !a3.f22281e) {
                            c.b c3 = aVar.c();
                            if (a3 != null) {
                                c3.errorCode = a3.f22282f;
                                c3.errorMsg = a3.g;
                            }
                            a.a(c3, 3);
                            aVar.a(c3);
                            return;
                        }
                        c.b bVar = new c.b();
                        bVar.f22265a = a3.f22269a;
                        if (aVar2 != null) {
                            bVar.f22267c = aVar2.f22263e;
                            bVar.f22266b = aVar2.f22259a;
                        }
                        if (!aVar.f22288e) {
                            aVar.f22287d.post(new Runnable(bVar) {

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ c.b f22296a;

                                public final void run() {
                                    a.this.d();
                                    a.this.f22284a.onSuccess(this.f22296a);
                                }

                                {
                                    this.f22296a = r2;
                                }
                            });
                        }
                    }
                }
            });
            return true;
        }
    }

    public final boolean a(final c.a aVar) {
        this.f22288e = false;
        if (!this.f22285b.a()) {
            this.f22284a.onNeedLogin();
            return false;
        } else if (!this.f22285b.c()) {
            c.b bVar = new c.b();
            bVar.errorCode = -12;
            bVar.errorMsg = this.f22289f.getString(C0906R.string.li);
            a(bVar, 1);
            a(bVar);
            return false;
        } else {
            a("加载中");
            this.f22285b.a((Runnable) new Runnable() {
                public final void run() {
                    a aVar = a.this;
                    c.a aVar2 = aVar;
                    if (!aVar.f22288e) {
                        com.bytedance.sdk.account.bdplatform.b.b a2 = aVar.f22286c.a(aVar2);
                        if (a2 == null || !a2.f22281e) {
                            c.b c2 = aVar.c();
                            if (a2 != null) {
                                c2.errorCode = a2.f22282f;
                                c2.errorMsg = a2.g;
                            }
                            a.a(c2, 1);
                            aVar.a(c2);
                        } else if (!aVar.f22288e) {
                            aVar.f22287d.post(new Runnable(a2) {

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ com.bytedance.sdk.account.bdplatform.b.b f22294a;

                                public final void run() {
                                    a.this.d();
                                    a.this.f22284a.onAuthLogin(this.f22294a);
                                }

                                {
                                    this.f22294a = r2;
                                }
                            });
                        }
                    }
                }
            });
            return true;
        }
    }

    static void a(c.b bVar, int i) {
        if (bVar != null) {
            if (bVar.extras == null) {
                bVar.extras = new Bundle();
            }
            bVar.extras.putInt("response_type", i);
        }
    }

    public a(a.c cVar, b bVar, Context context) {
        this(cVar, null, bVar, context);
    }

    private a(a.c cVar, a.C0232a aVar, b bVar, Context context) {
        this.f22284a = cVar;
        this.f22285b = bVar;
        this.f22289f = context;
        this.f22286c = new com.bytedance.sdk.account.bdplatform.impl.a.b(context, bVar);
        this.f22287d = new Handler(Looper.getMainLooper());
    }
}

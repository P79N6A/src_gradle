package com.ss.android.ugc.aweme.im.sdk.chat.input.emoji;

import a.g;
import a.i;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.SelfEmojiAdapter;
import com.ss.android.ugc.aweme.im.sdk.resources.f;
import com.ss.android.ugc.aweme.im.sdk.resources.k;
import com.ss.android.ugc.aweme.im.sdk.resources.model.a;
import com.ss.android.ugc.aweme.im.sdk.utils.h;
import com.ss.android.ugc.aweme.im.sdk.widget.DividerGridItemDecoration;
import com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class EmojiManagerActivity extends AmeActivity implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50497a;

    /* renamed from: b  reason: collision with root package name */
    public SelfEmojiAdapter f50498b;

    /* renamed from: c  reason: collision with root package name */
    public ImTextTitleBar f50499c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f50500d;

    /* renamed from: e  reason: collision with root package name */
    public View f50501e;

    public final void b(List<a> list, boolean z, String str) {
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f50497a, false, 50818, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50497a, false, 50818, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiManagerActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiManagerActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f50497a, false, 50819, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f50497a, false, 50819, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiManagerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f50497a, false, 50817, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50497a, false, 50817, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        k.a().b(this);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f50497a, false, 50812, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50497a, false, 50812, new Class[0], Void.TYPE);
            return;
        }
        this.f50501e.setEnabled(false);
        this.f50500d.setAlpha(0.5f);
    }

    public static void a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f50497a, true, 50809, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f50497a, true, 50809, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        context2.startActivity(new Intent(context2, EmojiManagerActivity.class));
    }

    public final void a(List<a> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f50497a, false, 50816, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f50497a, false, 50816, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (!CollectionUtils.isEmpty(list)) {
            this.f50498b.f50539e = list;
            this.f50498b.notifyDataSetChanged();
            ImTextTitleBar imTextTitleBar = this.f50499c;
            imTextTitleBar.setTitle(getString(C0906R.string.aot) + "(" + list.size() + ")");
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f50497a, false, 50810, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f50497a, false, 50810, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiManagerActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.b9);
        com.ss.android.ugc.aweme.im.sdk.d.a.b().setupStatusBar(this);
        if (PatchProxy.isSupport(new Object[0], this, f50497a, false, 50811, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50497a, false, 50811, new Class[0], Void.TYPE);
        } else {
            this.f50499c = (ImTextTitleBar) findViewById(C0906R.id.d3m);
            this.f50501e = findViewById(C0906R.id.a3e);
            RecyclerView recyclerView = (RecyclerView) findViewById(C0906R.id.a9f);
            this.f50500d = (TextView) findViewById(C0906R.id.a3j);
            a();
            recyclerView.setLayoutManager(new GridLayoutManager(this, 4));
            recyclerView.addItemDecoration(new DividerGridItemDecoration(this));
            this.f50498b = new SelfEmojiAdapter();
            recyclerView.setAdapter(this.f50498b);
            this.f50499c.setOnTitlebarClickListener(new ImTextTitleBar.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50502a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f50502a, false, 50820, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f50502a, false, 50820, new Class[0], Void.TYPE);
                        return;
                    }
                    EmojiManagerActivity.this.finish();
                }

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f50502a, false, 50821, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f50502a, false, 50821, new Class[0], Void.TYPE);
                        return;
                    }
                    if (EmojiManagerActivity.this.f50498b.f50537c) {
                        EmojiManagerActivity.this.f50498b.f50537c = false;
                        EmojiManagerActivity.this.f50498b.b();
                        EmojiManagerActivity.this.f50500d.setText(EmojiManagerActivity.this.getString(C0906R.string.aqm));
                        EmojiManagerActivity.this.a();
                        EmojiManagerActivity.this.f50499c.setRightText((int) C0906R.string.auo);
                        EmojiManagerActivity.this.f50499c.setRightTextColor(EmojiManagerActivity.this.getResources().getColor(C0906R.color.qs));
                        EmojiManagerActivity.this.f50501e.setVisibility(8);
                    } else {
                        EmojiManagerActivity.this.f50498b.b();
                        EmojiManagerActivity.this.f50501e.setVisibility(0);
                        EmojiManagerActivity.this.f50498b.f50537c = true;
                        EmojiManagerActivity.this.f50499c.setRightText((int) C0906R.string.arj);
                        EmojiManagerActivity.this.f50499c.setRightTextColor(EmojiManagerActivity.this.getResources().getColor(C0906R.color.qy));
                    }
                    EmojiManagerActivity.this.f50498b.notifyDataSetChanged();
                }
            });
            this.f50498b.f50536b = new SelfEmojiAdapter.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50504a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f50504a, false, 50822, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f50504a, false, 50822, new Class[0], Void.TYPE);
                        return;
                    }
                    if (EmojiManagerActivity.this.f50498b.a() > 0) {
                        TextView textView = EmojiManagerActivity.this.f50500d;
                        textView.setText(EmojiManagerActivity.this.getString(C0906R.string.aqm) + "(" + EmojiManagerActivity.this.f50498b.a() + ")");
                        EmojiManagerActivity emojiManagerActivity = EmojiManagerActivity.this;
                        if (PatchProxy.isSupport(new Object[0], emojiManagerActivity, EmojiManagerActivity.f50497a, false, 50813, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], emojiManagerActivity, EmojiManagerActivity.f50497a, false, 50813, new Class[0], Void.TYPE);
                        } else {
                            emojiManagerActivity.f50501e.setEnabled(true);
                            emojiManagerActivity.f50500d.setAlpha(1.0f);
                        }
                    } else {
                        EmojiManagerActivity.this.f50500d.setText(EmojiManagerActivity.this.getString(C0906R.string.aqm));
                        EmojiManagerActivity.this.a();
                    }
                }
            };
            this.f50501e.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50506a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f50506a, false, 50823, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f50506a, false, 50823, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    EmojiManagerActivity emojiManagerActivity = EmojiManagerActivity.this;
                    AnonymousClass1 r1 = new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f50508a;

                        public final void run() {
                            String str;
                            if (PatchProxy.isSupport(new Object[0], this, f50508a, false, 50824, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f50508a, false, 50824, new Class[0], Void.TYPE);
                                return;
                            }
                            EmojiManagerActivity.this.showProgressDialog(EmojiManagerActivity.this.getString(C0906R.string.ar5));
                            k a2 = k.a();
                            SelfEmojiAdapter selfEmojiAdapter = EmojiManagerActivity.this.f50498b;
                            if (PatchProxy.isSupport(new Object[0], selfEmojiAdapter, SelfEmojiAdapter.f50535a, false, 50882, new Class[0], String.class)) {
                                str = (String) PatchProxy.accessDispatch(new Object[0], selfEmojiAdapter, SelfEmojiAdapter.f50535a, false, 50882, new Class[0], String.class);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append("[");
                                int size = selfEmojiAdapter.f50538d.size();
                                Iterator it2 = selfEmojiAdapter.f50538d.iterator();
                                int i = 0;
                                while (it2.hasNext()) {
                                    a aVar = (a) it2.next();
                                    i++;
                                    if (i == size) {
                                        sb.append(aVar.getId() + "]");
                                    } else {
                                        sb.append(aVar.getId() + ",");
                                    }
                                }
                                str = sb.toString();
                            }
                            if (PatchProxy.isSupport(new Object[]{str}, a2, k.f52318a, false, 53147, new Class[]{String.class}, Void.TYPE)) {
                                k kVar = a2;
                                PatchProxy.accessDispatch(new Object[]{str}, kVar, k.f52318a, false, 53147, new Class[]{String.class}, Void.TYPE);
                            } else if (!NetworkUtils.isNetworkAvailable(GlobalContext.getContext())) {
                                com.bytedance.ies.dmt.ui.d.a.b(GlobalContext.getContext(), (int) C0906R.string.ave).a();
                            } else {
                                i.a((Callable<TResult>) new Callable<k.b>(str) {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f52328a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ String f52329b;

                                    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
                                    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.util.List<com.ss.android.ugc.aweme.im.sdk.resources.model.a>} */
                                    /* access modifiers changed from: private */
                                    /* JADX WARNING: Multi-variable type inference failed */
                                    /* renamed from: a */
                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                    public com.ss.android.ugc.aweme.im.sdk.resources.k.b call() {
                                        /*
                                            r9 = this;
                                            r0 = 0
                                            java.lang.Object[] r1 = new java.lang.Object[r0]
                                            com.meituan.robust.ChangeQuickRedirect r3 = f52328a
                                            java.lang.Class[] r6 = new java.lang.Class[r0]
                                            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.resources.k$b> r7 = com.ss.android.ugc.aweme.im.sdk.resources.k.b.class
                                            r4 = 0
                                            r5 = 53153(0xcfa1, float:7.4483E-41)
                                            r2 = r9
                                            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                                            if (r1 == 0) goto L_0x0028
                                            java.lang.Object[] r2 = new java.lang.Object[r0]
                                            com.meituan.robust.ChangeQuickRedirect r4 = f52328a
                                            r5 = 0
                                            r6 = 53153(0xcfa1, float:7.4483E-41)
                                            java.lang.Class[] r7 = new java.lang.Class[r0]
                                            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.resources.k$b> r8 = com.ss.android.ugc.aweme.im.sdk.resources.k.b.class
                                            r3 = r9
                                            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                                            com.ss.android.ugc.aweme.im.sdk.resources.k$b r0 = (com.ss.android.ugc.aweme.im.sdk.resources.k.b) r0
                                            return r0
                                        L_0x0028:
                                            r1 = 0
                                            com.ss.android.ugc.aweme.im.sdk.utils.ImApi r2 = com.ss.android.ugc.aweme.im.sdk.utils.r.a()     // Catch:{ InterruptedException | ExecutionException -> 0x003a }
                                            java.lang.String r3 = r9.f52329b     // Catch:{ InterruptedException | ExecutionException -> 0x003a }
                                            com.google.common.util.concurrent.q r2 = r2.collectEmoji(r0, r3)     // Catch:{ InterruptedException | ExecutionException -> 0x003a }
                                            java.lang.Object r2 = r2.get()     // Catch:{ InterruptedException | ExecutionException -> 0x003a }
                                            com.ss.android.ugc.aweme.im.sdk.resources.model.d r2 = (com.ss.android.ugc.aweme.im.sdk.resources.model.d) r2     // Catch:{ InterruptedException | ExecutionException -> 0x003a }
                                            goto L_0x003b
                                        L_0x003a:
                                            r2 = r1
                                        L_0x003b:
                                            if (r2 == 0) goto L_0x0043
                                            int r3 = r2.status_code
                                            if (r3 != 0) goto L_0x0043
                                            r3 = 1
                                            goto L_0x0044
                                        L_0x0043:
                                            r3 = 0
                                        L_0x0044:
                                            com.ss.android.ugc.aweme.im.sdk.resources.k$b r4 = new com.ss.android.ugc.aweme.im.sdk.resources.k$b
                                            com.ss.android.ugc.aweme.im.sdk.resources.k r5 = com.ss.android.ugc.aweme.im.sdk.resources.k.this
                                            r4.<init>(r5, r0)
                                            r4.f52352d = r3
                                            if (r3 != 0) goto L_0x0060
                                            android.content.Context r0 = com.ss.android.common.applog.GlobalContext.getContext()
                                            android.content.res.Resources r0 = r0.getResources()
                                            r5 = 2131560615(0x7f0d08a7, float:1.8746607E38)
                                            java.lang.String r0 = r0.getString(r5)
                                            r4.f52354f = r0
                                        L_0x0060:
                                            if (r3 == 0) goto L_0x009a
                                            java.lang.ref.WeakReference<java.util.List<com.ss.android.ugc.aweme.im.sdk.resources.model.a>> r0 = com.ss.android.ugc.aweme.im.sdk.resources.k.f52321d
                                            if (r0 == 0) goto L_0x006f
                                            java.lang.ref.WeakReference<java.util.List<com.ss.android.ugc.aweme.im.sdk.resources.model.a>> r0 = com.ss.android.ugc.aweme.im.sdk.resources.k.f52321d
                                            java.lang.Object r0 = r0.get()
                                            r1 = r0
                                            java.util.List r1 = (java.util.List) r1
                                        L_0x006f:
                                            if (r1 != 0) goto L_0x007b
                                            com.ss.android.ugc.aweme.im.sdk.resources.k r0 = com.ss.android.ugc.aweme.im.sdk.resources.k.this
                                            java.lang.String r0 = r0.f()
                                            java.util.List r1 = com.ss.android.ugc.aweme.im.sdk.utils.j.a((java.lang.String) r0)
                                        L_0x007b:
                                            if (r1 == 0) goto L_0x0093
                                            java.util.List<com.ss.android.ugc.aweme.im.sdk.resources.model.a> r0 = r2.f52355a
                                            r1.removeAll(r0)
                                            com.ss.android.ugc.aweme.im.sdk.resources.k r0 = com.ss.android.ugc.aweme.im.sdk.resources.k.this
                                            java.lang.String r0 = r0.f()
                                            com.ss.android.ugc.aweme.im.sdk.utils.j.a((java.lang.String) r0, (java.util.List<T>) r1)
                                            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                                            r0.<init>(r1)
                                            com.ss.android.ugc.aweme.im.sdk.resources.k.f52321d = r0
                                            goto L_0x0098
                                        L_0x0093:
                                            java.util.ArrayList r1 = new java.util.ArrayList
                                            r1.<init>()
                                        L_0x0098:
                                            r4.f52353e = r1
                                        L_0x009a:
                                            return r4
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.resources.k.AnonymousClass2.call():com.ss.android.ugc.aweme.im.sdk.resources.k$b");
                                    }

                                    {
                                        this.f52329b = r2;
                                    }
                                }, (Executor) i.f1051a).a((g<TResult, TContinuationResult>) new g<k.b, Void>() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f52326a;

                                    /* access modifiers changed from: private */
                                    /* renamed from: a */
                                    public Void then(i<b> iVar) {
                                        if (PatchProxy.isSupport(new Object[]{iVar}, this, f52326a, false, 53161, new Class[]{i.class}, Void.class)) {
                                            return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f52326a, false, 53161, new Class[]{i.class}, Void.class);
                                        }
                                        b bVar = (b) iVar.e();
                                        if (bVar != null) {
                                            k.this.a(bVar.f52353e, bVar.f52352d, bVar.f52354f);
                                        } else {
                                            k.this.a(null, false, "");
                                        }
                                        return null;
                                    }
                                }, i.f1052b);
                            }
                        }
                    };
                    AnonymousClass2 r2 = new Runnable() {
                        public final void run() {
                        }
                    };
                    if (PatchProxy.isSupport(new Object[]{emojiManagerActivity, Integer.valueOf(C0906R.string.aqn), Integer.valueOf(C0906R.string.apk), Integer.valueOf(C0906R.string.aqb), r1, r2}, null, h.f52591a, true, 53366, new Class[]{Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Runnable.class, Runnable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{emojiManagerActivity, Integer.valueOf(C0906R.string.aqn), Integer.valueOf(C0906R.string.apk), Integer.valueOf(C0906R.string.aqb), r1, r2}, null, h.f52591a, true, 53366, new Class[]{Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Runnable.class, Runnable.class}, Void.TYPE);
                        return;
                    }
                    h.AnonymousClass2 r3 = new DialogInterface.OnClickListener(r2, r1) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f52594a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ Runnable f52595b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ Runnable f52596c;

                        {
                            this.f52595b = r1;
                            this.f52596c = r2;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f52594a, false, 53370, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f52594a, false, 53370, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            if (i == -2) {
                                dialogInterface.dismiss();
                                if (this.f52595b != null) {
                                    this.f52595b.run();
                                }
                            } else if (i == -1) {
                                dialogInterface.dismiss();
                                if (this.f52596c != null) {
                                    this.f52596c.run();
                                }
                            } else {
                                dialogInterface.dismiss();
                                if (this.f52595b != null) {
                                    this.f52595b.run();
                                }
                            }
                        }
                    };
                    new AlertDialog.Builder(emojiManagerActivity, C0906R.style.q9).setMessage((int) C0906R.string.aqn).setNegativeButton((int) C0906R.string.apk, (DialogInterface.OnClickListener) r3).setPositiveButton((int) C0906R.string.aqb, (DialogInterface.OnClickListener) r3).create().show();
                }
            });
        }
        k.a().a((f) this);
        k.a().e();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiManagerActivity", "onCreate", false);
    }

    public final void a(List<a> list, boolean z, String str) {
        List<a> list2 = list;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{list2, Byte.valueOf(z ? (byte) 1 : 0), str2}, this, f50497a, false, 50815, new Class[]{List.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Byte.valueOf(z), str2}, this, f50497a, false, 50815, new Class[]{List.class, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        dismissProgressDialog();
        if (z) {
            com.bytedance.ies.dmt.ui.d.a.a((Context) this, (int) C0906R.string.ar6, 1).a();
            this.f50498b.b();
            this.f50500d.setText(getString(C0906R.string.aqm));
            a();
            this.f50498b.f50539e = list2;
            this.f50498b.notifyDataSetChanged();
            if (CollectionUtils.isEmpty(list)) {
                this.f50499c.setTitle(getString(C0906R.string.aot));
                this.f50498b.f50537c = false;
                this.f50499c.setRightText((int) C0906R.string.auo);
                this.f50499c.setRightTextColor(getResources().getColor(C0906R.color.qs));
                this.f50501e.setVisibility(8);
                return;
            }
            ImTextTitleBar imTextTitleBar = this.f50499c;
            imTextTitleBar.setTitle(getString(C0906R.string.aot) + "(" + list.size() + ")");
            return;
        }
        com.bytedance.ies.dmt.ui.d.a.b((Context) this, str2, 1).a();
    }

    public final void a(List<a> list, a aVar, boolean z, String str) {
        List<a> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, aVar, Byte.valueOf(z ? (byte) 1 : 0), str}, this, f50497a, false, 50814, new Class[]{List.class, a.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, aVar, Byte.valueOf(z), str}, this, f50497a, false, 50814, new Class[]{List.class, a.class, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (z) {
            this.f50498b.f50539e = list2;
            this.f50498b.notifyDataSetChanged();
            ImTextTitleBar imTextTitleBar = this.f50499c;
            imTextTitleBar.setTitle(getString(C0906R.string.aot) + "(" + list.size() + ")");
        }
    }
}

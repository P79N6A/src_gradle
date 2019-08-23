package com.ss.android.ugc.aweme.im.sdk.chat.input.emoji;

import a.g;
import a.i;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.io.FileUtils;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.h;
import com.ss.android.ugc.aweme.im.sdk.chat.input.photo.j;
import com.ss.android.ugc.aweme.im.sdk.chat.net.s;
import com.ss.android.ugc.aweme.im.sdk.chat.net.x;
import com.ss.android.ugc.aweme.im.sdk.resources.f;
import com.ss.android.ugc.aweme.im.sdk.resources.k;
import com.ss.android.ugc.aweme.im.sdk.resources.model.d;
import com.ss.android.ugc.aweme.im.sdk.utils.r;
import com.ss.android.ugc.aweme.im.sdk.utils.w;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public class EmojiAddActivity extends AmeActivity implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50472a;

    /* renamed from: b  reason: collision with root package name */
    public j f50473b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f50474c;

    /* renamed from: d  reason: collision with root package name */
    public x f50475d = new x() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50480a;

        public final void a() {
        }

        public final void a(double d2) {
        }

        public final void a(String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f50480a, false, 50780, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2}, this, f50480a, false, 50780, new Class[]{String.class}, Void.TYPE);
                return;
            }
            EmojiAddActivity.this.a(str2);
        }

        public final void a(Throwable th) {
            if (PatchProxy.isSupport(new Object[]{th}, this, f50480a, false, 50779, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th}, this, f50480a, false, 50779, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            EmojiAddActivity.this.a(EmojiAddActivity.this.getString(C0906R.string.ave));
        }

        public final void a(String str, UrlModel urlModel) {
            String str2 = str;
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{str2, urlModel}, this, f50480a, false, 50781, new Class[]{String.class, UrlModel.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, urlModel}, this, f50480a, false, 50781, new Class[]{String.class, UrlModel.class}, Void.TYPE);
            } else if (urlModel == null) {
                EmojiAddActivity.this.a(EmojiAddActivity.this.getString(C0906R.string.ave));
            } else {
                k a2 = k.a();
                String path = EmojiAddActivity.this.f50473b.getPath();
                String uri = urlModel.getUri();
                if (PatchProxy.isSupport(new Object[]{path, str2, uri}, a2, k.f52318a, false, 53143, new Class[]{String.class, String.class, String.class}, Boolean.TYPE)) {
                    Object[] objArr = {path, str2, uri};
                    Object[] objArr2 = objArr;
                    k kVar = a2;
                    ChangeQuickRedirect changeQuickRedirect = k.f52318a;
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, kVar, changeQuickRedirect, false, 53143, new Class[]{String.class, String.class, String.class}, Boolean.TYPE)).booleanValue();
                } else if (!NetworkUtils.isNetworkAvailable(GlobalContext.getContext())) {
                    a.b(GlobalContext.getContext(), (int) C0906R.string.ave).a();
                } else {
                    i.a((Callable<TResult>) new Callable<k.a>(path, str2, uri) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f52339a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ String f52340b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ String f52341c;

                        /* renamed from: d  reason: collision with root package name */
                        final /* synthetic */ String f52342d;

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public a call() {
                            String str;
                            String str2;
                            if (PatchProxy.isSupport(new Object[0], this, f52339a, false, 53158, new Class[0], a.class)) {
                                return (a) PatchProxy.accessDispatch(new Object[0], this, f52339a, false, 53158, new Class[0], a.class);
                            }
                            String md5Hex = DigestUtils.md5Hex(new File(this.f52340b));
                            a aVar = new a(k.this, (byte) 0);
                            boolean z = true;
                            try {
                                com.ss.android.ugc.aweme.im.sdk.resources.model.b obtain = com.ss.android.ugc.aweme.im.sdk.resources.model.b.obtain(this.f52341c, this.f52342d);
                                d dVar = (d) r.a().addSelfEmoji(md5Hex, obtain.getAnimateUrl(), obtain.getStaticUrl(), obtain.getAnimateType(), obtain.getStaticType(), obtain.getWidth(), obtain.getHeight()).get();
                                if (dVar != null) {
                                    if (dVar.status_code != 0 || CollectionUtils.isEmpty(dVar.f52355a)) {
                                        aVar.f52350b = GlobalContext.getContext().getResources().getString(C0906R.string.ave);
                                    } else {
                                        aVar.f52349a = dVar.f52355a.get(0);
                                        if (aVar.f52349a != null) {
                                            String str3 = this.f52341c;
                                            if (PatchProxy.isSupport(new Object[0], null, a.f52259a, true, 53065, new Class[0], String.class)) {
                                                str = (String) PatchProxy.accessDispatch(new Object[0], null, a.f52259a, true, 53065, new Class[0], String.class);
                                            } else {
                                                str = i.b("STICKER", 0, PushConstants.PUSH_TYPE_NOTIFY) + "/animate/";
                                            }
                                            com.ss.android.ugc.aweme.im.sdk.resources.model.a aVar2 = aVar.f52349a;
                                            if (PatchProxy.isSupport(new Object[]{aVar2}, null, a.f52259a, true, 53067, new Class[]{com.ss.android.ugc.aweme.im.sdk.resources.model.a.class}, String.class)) {
                                                str2 = (String) PatchProxy.accessDispatch(new Object[]{aVar2}, null, a.f52259a, true, 53067, new Class[]{com.ss.android.ugc.aweme.im.sdk.resources.model.a.class}, String.class);
                                            } else {
                                                str2 = aVar2.getId() + ClassUtils.PACKAGE_SEPARATOR + aVar2.getAnimateType();
                                            }
                                            FileUtils.copyFile(str3, str, str2);
                                            FileUtils.copyFile(this.f52341c, a.a(), a.c(aVar.f52349a));
                                        }
                                    }
                                }
                            } catch (InterruptedException | ExecutionException unused) {
                            }
                            if (aVar.f52349a == null) {
                                z = false;
                            }
                            aVar.f52352d = z;
                            if (!aVar.f52352d && TextUtils.isEmpty(aVar.f52350b)) {
                                aVar.f52350b = GlobalContext.getContext().getResources().getString(C0906R.string.ave);
                            }
                            if (aVar.f52349a != null) {
                                List list = null;
                                if (k.f52321d != null) {
                                    list = (List) k.f52321d.get();
                                }
                                if (list == null) {
                                    list = com.ss.android.ugc.aweme.im.sdk.utils.j.a(k.this.f());
                                }
                                if (list == null) {
                                    list = new ArrayList();
                                }
                                list.add(aVar.f52349a);
                                com.ss.android.ugc.aweme.im.sdk.utils.j.a(k.this.f(), list);
                                k.f52321d = new WeakReference<>(list);
                                aVar.f52353e = list;
                            }
                            return aVar;
                        }

                        {
                            this.f52340b = r2;
                            this.f52341c = r3;
                            this.f52342d = r4;
                        }
                    }, (Executor) i.f1051a).a((g<TResult, TContinuationResult>) new g<k.a, Void>() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f52337a;

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public Void then(i<a> iVar) {
                            if (PatchProxy.isSupport(new Object[]{iVar}, this, f52337a, false, 53157, new Class[]{i.class}, Void.class)) {
                                return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f52337a, false, 53157, new Class[]{i.class}, Void.class);
                            }
                            a aVar = (a) iVar.e();
                            if (aVar != null) {
                                k.this.a(aVar.f52353e, aVar.f52349a, aVar.f52352d, aVar.f52350b);
                            } else {
                                k.this.a(null, null, false, "");
                            }
                            return null;
                        }
                    }, i.f1052b);
                    z = true;
                }
                if (!z) {
                    EmojiAddActivity.this.a("");
                }
            }
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private RemoteImageView f50476e;

    /* renamed from: f  reason: collision with root package name */
    private ImTextTitleBar f50477f;

    public final void a(List<com.ss.android.ugc.aweme.im.sdk.resources.model.a> list) {
    }

    public final void a(List<com.ss.android.ugc.aweme.im.sdk.resources.model.a> list, boolean z, String str) {
    }

    public final void b(List<com.ss.android.ugc.aweme.im.sdk.resources.model.a> list, boolean z, String str) {
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f50472a, false, 50775, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50472a, false, 50775, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiAddActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiAddActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f50472a, false, 50776, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f50472a, false, 50776, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiAddActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f50472a, false, 50773, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50472a, false, 50773, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        k.a().b(this);
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f50472a, false, 50774, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f50472a, false, 50774, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            a.b((Context) this, str, 1).a();
        }
        z.a().a(false);
        dismissProgressDialog();
        this.f50474c = false;
    }

    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f50472a, false, 50770, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f50472a, false, 50770, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onSaveInstanceState(bundle);
        bundle2.putSerializable("photo_param", this.f50473b);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f50472a, false, 50768, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f50472a, false, 50768, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiAddActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.b8);
        com.ss.android.ugc.aweme.im.sdk.d.a.b().setupStatusBar(this);
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f50472a, false, 50769, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f50472a, false, 50769, new Class[]{Bundle.class}, Void.TYPE);
        } else if (bundle != null) {
            this.f50473b = (j) bundle.getSerializable("photo_param");
        } else {
            this.f50473b = (j) getIntent().getSerializableExtra("photo_param");
        }
        if (PatchProxy.isSupport(new Object[0], this, f50472a, false, 50771, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50472a, false, 50771, new Class[0], Void.TYPE);
        } else {
            this.f50476e = (RemoteImageView) findViewById(C0906R.id.bxr);
            this.f50477f = (ImTextTitleBar) findViewById(C0906R.id.d3m);
            this.f50477f.setOnTitlebarClickListener(new ImTextTitleBar.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50478a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f50478a, false, 50777, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f50478a, false, 50777, new Class[0], Void.TYPE);
                        return;
                    }
                    EmojiAddActivity.this.finish();
                }

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f50478a, false, 50778, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f50478a, false, 50778, new Class[0], Void.TYPE);
                    } else if (!EmojiAddActivity.this.f50474c) {
                        EmojiAddActivity.this.f50474c = true;
                        EmojiAddActivity.this.showProgressDialog(EmojiAddActivity.this.getString(C0906R.string.ar3));
                        j jVar = EmojiAddActivity.this.f50473b;
                        x xVar = EmojiAddActivity.this.f50475d;
                        if (PatchProxy.isSupport(new Object[]{jVar, xVar}, null, h.f50581a, true, 50864, new Class[]{j.class, x.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{jVar, xVar}, null, h.f50581a, true, 50864, new Class[]{j.class, x.class}, Void.TYPE);
                        } else if (!NetworkUtils.isNetworkAvailable(GlobalContext.getContext())) {
                            a.b(GlobalContext.getContext(), (int) C0906R.string.ave).a();
                            if (xVar != null) {
                                xVar.a("");
                            }
                        } else {
                            i.a((Callable<TResult>) new Callable<h.a>(jVar) {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f50584a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ j f50585b;

                                public final /* synthetic */ Object call() throws Exception {
                                    if (PatchProxy.isSupport(new Object[0], this, f50584a, false, 50867, new Class[0], a.class)) {
                                        return (a) PatchProxy.accessDispatch(new Object[0], this, f50584a, false, 50867, new Class[0], a.class);
                                    }
                                    a aVar = new a();
                                    File file = new File(this.f50585b.getPath());
                                    if (FileUtils.isGif(file)) {
                                        if (file.length() > 1048576) {
                                            aVar.f50589b = GlobalContext.getContext().getResources().getString(C0906R.string.ars);
                                        } else {
                                            aVar.f50588a = this.f50585b.getPath();
                                        }
                                        return aVar;
                                    }
                                    String a2 = w.a(this.f50585b.getPath());
                                    if (w.a(this.f50585b.getPath(), a2, (int) c.f69428f, (int) c.f69428f) == 2) {
                                        aVar.f50589b = GlobalContext.getContext().getResources().getString(C0906R.string.aq_);
                                    } else {
                                        aVar.f50588a = a2;
                                    }
                                    return aVar;
                                }

                                {
                                    this.f50585b = r1;
                                }
                            }, (Executor) i.f1051a).a((g<TResult, TContinuationResult>) new g<h.a, Void>(xVar) {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f50582a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ x f50583b;

                                {
                                    this.f50583b = r1;
                                }

                                public final /* synthetic */ Object then(i iVar) throws Exception {
                                    if (PatchProxy.isSupport(new Object[]{iVar}, this, f50582a, false, 50866, new Class[]{i.class}, Void.class)) {
                                        return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f50582a, false, 50866, new Class[]{i.class}, Void.class);
                                    }
                                    a aVar = (a) iVar.e();
                                    if (aVar != null) {
                                        if (!TextUtils.isEmpty(aVar.f50588a)) {
                                            s.a().a(aVar.f50588a, this.f50583b);
                                        } else if (this.f50583b != null) {
                                            this.f50583b.a(aVar.f50589b);
                                        }
                                    } else if (this.f50583b != null) {
                                        this.f50583b.a("");
                                    }
                                    return null;
                                }
                            }, i.f1052b);
                        }
                    }
                }
            });
            RemoteImageView remoteImageView = this.f50476e;
            com.ss.android.ugc.aweme.base.c.a(remoteImageView, "file://" + this.f50473b.getPath());
            k.a().a((f) this);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.EmojiAddActivity", "onCreate", false);
    }

    public final void a(List<com.ss.android.ugc.aweme.im.sdk.resources.model.a> list, com.ss.android.ugc.aweme.im.sdk.resources.model.a aVar, boolean z, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{list, aVar, Byte.valueOf(z ? (byte) 1 : 0), str2}, this, f50472a, false, 50772, new Class[]{List.class, com.ss.android.ugc.aweme.im.sdk.resources.model.a.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, aVar, Byte.valueOf(z), str2}, this, f50472a, false, 50772, new Class[]{List.class, com.ss.android.ugc.aweme.im.sdk.resources.model.a.class, Boolean.TYPE, String.class}, Void.TYPE);
        } else if (z) {
            dismissProgressDialog();
            z.a().a(true);
            a.a((Context) this, (int) C0906R.string.ar4, 1).a();
            setResult(-1);
            finish();
            this.f50474c = false;
        } else {
            a(str2);
        }
    }
}
